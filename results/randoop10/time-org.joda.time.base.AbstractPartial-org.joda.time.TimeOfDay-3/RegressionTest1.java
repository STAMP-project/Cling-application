import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(53643303, 8, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53643303 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(8);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withDefaultYear(53639477);
        java.lang.Appendable appendable12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable12, readableInstant13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.hours();
        mutableDateTime1.add(durationFieldType2, (int) (byte) 0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        int int11 = localDate7.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DateTime dateTime14 = localDate7.toDateTime((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone16 = dateMidnight15.getZone();
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone16);
        java.lang.String str21 = dateTimeZone16.getNameKey((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime13.toMutableDateTime(dateTimeZone16);
        java.util.Locale locale27 = new java.util.Locale("hi!", "Years", "1970-01-01");
        java.lang.String str28 = dateTimeZone16.getShortName((long) 53617440, locale27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) (byte) 0, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertEquals(locale27.toString(), "hi!_YEARS_1970-01-01");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withDefaultYear(8);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone8 = dateMidnight7.getZone();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withZone(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.parse("2022-02-21T14:54:18.609Z", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) '4');
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        java.lang.String str3 = periodType2.getName();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(periodType2);
        org.joda.time.Period period5 = period1.plus((org.joda.time.ReadablePeriod) mutablePeriod4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = period1.getValue(53628335);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53628335");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Years" + "'", str3, "Years");
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(21, 23, 53629402);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53629402 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.withHourOfDay((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay0.withFieldAdded(durationFieldType3, 53625645);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay0.plusHours((int) '4');
        org.joda.time.TimeOfDay.Property property8 = timeOfDay0.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay9 = property8.withMaximumValue();
        org.joda.time.DurationField durationField10 = property8.getDurationField();
        java.util.Locale locale12 = java.util.Locale.KOREA;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay13 = property8.setCopy("2022-02-21T14:53:37.719", locale12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:53:37.719\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Calendar.Builder builder4 = builder0.setLocale(locale3);
        java.util.Calendar calendar5 = builder0.build();
        long long6 = calendar5.getTimeInMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = calendar5.getMaximum(53640641);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53640641");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 342);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        int int6 = localDate2.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DateTime dateTime9 = localDate2.toDateTime((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight10.getZone();
        boolean boolean13 = dateTimeZone11.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(dateTimeZone11);
        java.lang.String str16 = dateTimeZone11.getNameKey((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime8.toMutableDateTime(dateTimeZone11);
        java.util.Locale locale22 = new java.util.Locale("hi!", "Years", "1970-01-01");
        java.lang.String str23 = dateTimeZone11.getShortName((long) 53617440, locale22);
        java.lang.String str24 = locale22.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertEquals(locale22.toString(), "hi!_YEARS_1970-01-01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!_YEARS_1970-01-01" + "'", str24, "hi!_YEARS_1970-01-01");
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(periodType10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) periodType10, dateTimeZone12);
        int int14 = localDateTime13.getDayOfMonth();
        int int15 = localDateTime13.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.millisOfSecond();
        int int17 = localDateTime13.getEra();
        org.joda.time.LocalDateTime.Property property18 = localDateTime13.era();
        org.joda.time.LocalDateTime.Property property19 = localDateTime13.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime21 = property19.addToCopy((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withMinuteOfHour(2);
        java.util.Locale locale26 = new java.util.Locale("2022-02-21T14:53:45.094Z");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = dateTimeField9.getAsShortText((org.joda.time.ReadablePartial) localDateTime21, 53640196, locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53640196");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53660733 + "'", int5 == 53660733);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 21 + "'", int14 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53660733 + "'", int15 == 53660733);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertEquals(locale26.toString(), "2022-02-21t14:53:45.094z");
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.copy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        mutableDateTime9.setZone(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime16 = dateTime13.withFieldAdded(durationFieldType14, (int) (byte) 0);
        mutableDateTime9.add(durationFieldType14, 8);
        org.joda.time.LocalDate localDate20 = localDate2.withFieldAdded(durationFieldType14, 3);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 1, chronology22);
        int int24 = localDate23.getDayOfYear();
        org.joda.time.LocalTime localTime25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate23.toDateTime(localTime25, dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = localDate23.toDateMidnight(dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate23.withYear(53619770);
        int int32 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate.Property property33 = localDate23.year();
        org.joda.time.ReadablePartial readablePartial34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate23, readablePartial34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Date date1 = calendar0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = calendar0.getMaximum(53637942);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53637942");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455260851,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=20,MILLISECOND=851,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Feb 21 14:54:20 UTC 2022");
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        boolean boolean3 = strSet1.isEmpty();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis((-27422466L));
        boolean boolean7 = strSet1.remove((java.lang.Object) instant4);
        org.joda.time.MutableDateTime mutableDateTime8 = instant4.toMutableDateTime();
        mutableDateTime8.addYears(32769);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime8.setTime(53627306, 53620972, 339, 53649612);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53627306 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(readableDuration2, readableInstant3, periodType4);
        mutablePeriod5.addYears((int) (byte) 0);
        int int8 = mutablePeriod5.getMonths();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableDuration9, readableInstant10, periodType11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutablePeriod12.add(readableDuration13);
        mutablePeriod12.addMonths((int) '#');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 1, chronology18);
        int int20 = localDate19.getDayOfYear();
        org.joda.time.LocalTime localTime21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localDate19.toDateTime(localTime21, dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = localDate19.toDateMidnight(dateTimeZone24);
        org.joda.time.DateMidnight.Property property26 = dateMidnight25.yearOfEra();
        int int27 = dateMidnight25.getMinuteOfHour();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) 100, chronology29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime32.copy();
        org.joda.time.Duration duration34 = period30.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight25.plus((org.joda.time.ReadableDuration) duration34);
        mutablePeriod12.add((org.joda.time.ReadableDuration) duration34);
        mutablePeriod5.setPeriod((org.joda.time.ReadableDuration) duration34);
        org.joda.time.MutablePeriod mutablePeriod38 = mutablePeriod5.copy();
        org.joda.time.PeriodType periodType39 = mutablePeriod38.getPeriodType();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) (short) 1, chronology42);
        java.lang.String str44 = localDate43.toString();
        org.joda.time.LocalDate localDate46 = localDate43.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology47 = localDate46.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(533L, chronology47);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(0L, (long) 53619770, periodType39, chronology47);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = mutablePeriod49.getValue(15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertNotNull(mutablePeriod38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01" + "'", str44, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(chronology47);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 1, (long) 0, periodType2, chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) (byte) 100, chronology6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology8);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.copy();
        org.joda.time.Duration duration11 = period7.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableDuration12, readableInstant13, periodType14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutablePeriod15.add(readableDuration16);
        mutablePeriod15.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableDuration20, readableInstant21, periodType22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        mutablePeriod23.add(readableDuration24);
        mutablePeriod23.addMonths((int) '#');
        mutablePeriod15.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(readableDuration29, readableInstant30, periodType31);
        org.joda.time.ReadableDuration readableDuration33 = null;
        mutablePeriod32.add(readableDuration33);
        mutablePeriod32.addMonths((int) '#');
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (short) 1, chronology38);
        int int40 = localDate39.getDayOfYear();
        org.joda.time.LocalTime localTime41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = localDate39.toDateTime(localTime41, dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateMidnight dateMidnight45 = localDate39.toDateMidnight(dateTimeZone44);
        org.joda.time.DateMidnight.Property property46 = dateMidnight45.yearOfEra();
        int int47 = dateMidnight45.getMinuteOfHour();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) (byte) 100, chronology49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(chronology51);
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime52.copy();
        org.joda.time.Duration duration54 = period50.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime53);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight45.plus((org.joda.time.ReadableDuration) duration54);
        mutablePeriod32.add((org.joda.time.ReadableDuration) duration54);
        mutablePeriod15.add((org.joda.time.ReadableDuration) duration54);
        mutableDateTime10.add((org.joda.time.ReadableDuration) duration54);
        mutablePeriod4.add((org.joda.time.ReadableDuration) duration54);
        org.joda.time.DurationFieldType[] durationFieldTypeArray60 = mutablePeriod4.getFieldTypes();
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(dateMidnight55);
        org.junit.Assert.assertNotNull(durationFieldTypeArray60);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        int int4 = calendar0.getWeeksInWeekYear();
        calendar0.setTimeInMillis((long) (-144832));
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap10 = calendar0.getDisplayNames(53657228, 53660145, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-144832,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=57,SECOND=35,MILLISECOND=168,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("2022-02-21T14:54:13.369Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T14:54:13.369Z\" is malformed at \"22-02-21T14:54:13.369Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        java.util.Locale locale3 = new java.util.Locale("hi!", "Years", "1970-01-01");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale3.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_YEARS_1970-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "YEARS" + "'", str5, "YEARS");
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((-1), 53620134, (int) (byte) -1, 53617719, (int) (byte) 100, 53619079, 1, 53);
        org.joda.time.Period period16 = period2.minus((org.joda.time.ReadablePeriod) mutablePeriod15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes17 = period16.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime1 = timeOfDay0.toDateTimeToday();
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond(409);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(12);
        int int6 = dateTime5.getMillisOfSecond();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 409 + "'", int6 == 409);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((java.lang.Object) "14:54:21.070");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"14:54:21.070\" is malformed at \":54:21.070\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology9);
        int int12 = localDate11.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = localDate11.toString("2022-02-21T14:54:06.919Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((-1), 53620134, (int) (byte) -1, 53617719, (int) (byte) 100, 53619079, 1, 53);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = mutablePeriod8.getValue(982);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 982");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((-27422466L));
        org.joda.time.Chronology chronology3 = instant0.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = chronology3.getDateTimeMillis((int) (short) 10, 4, 342, 21, (int) '4', 53634384, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53634384 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.DateMidnight.Property property5 = dateMidnight2.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight2.withCenturyOfEra(2022);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.plus((long) 5);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.withMillis(31536000000L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight13 = dateMidnight9.withDayOfWeek(9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27422465L) + "'", long4 == (-27422465L));
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime0.toCalendar(locale3);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromCalendarFields(calendar4);
        java.lang.Object obj6 = calendar4.clone();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645455261670,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=21,MILLISECOND=670,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(obj6);
// flaky:         org.junit.Assert.assertEquals(obj6.toString(), "java.util.GregorianCalendar[time=1645455261670,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=21,MILLISECOND=670,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "java.util.GregorianCalendar[time=1645455261670,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=21,MILLISECOND=670,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "java.util.GregorianCalendar[time=1645455261670,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=21,MILLISECOND=670,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = durationField7.getValue((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        java.util.Date date6 = new java.util.Date(53617719, 2022, 842, 1, 0, 53618165);
        org.joda.time.YearMonthDay yearMonthDay7 = org.joda.time.YearMonthDay.fromDateFields(date6);
        int int8 = date6.getMonth();
        java.lang.Object obj9 = date6.clone();
        org.junit.Assert.assertEquals(date6.toString(), "Fri Jul 01 14:56:05 UTC 53619791");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "Fri Jul 01 14:56:05 UTC 53619791");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "Fri Jul 01 14:56:05 UTC 53619791");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "Fri Jul 01 14:56:05 UTC 53619791");
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.weekOfWeekyear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        int int13 = localDate12.getDayOfYear();
        org.joda.time.LocalTime localTime14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate12.toDateTime(localTime14, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime20 = dateTime16.plus((long) 100);
        org.joda.time.DateTime dateTime22 = dateTime20.plusSeconds(53618165);
        org.joda.time.Period period27 = new org.joda.time.Period((int) (byte) 10, (-1), 21, 100);
        org.joda.time.DateTime dateTime29 = dateTime20.withPeriodAdded((org.joda.time.ReadablePeriod) period27, 53620134);
        int int30 = dateTime29.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int32 = dateTime29.get(dateTimeFieldType31);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = localDate7.get(dateTimeFieldType31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 34 + "'", int30 == 34);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 56049301 + "'", int32 == 56049301);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 1, chronology9);
        int int11 = localDate10.getDayOfYear();
        org.joda.time.LocalTime localTime12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate10.toDateTime(localTime12, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = localDate10.toDateMidnight(dateTimeZone15);
        org.joda.time.DateMidnight.Property property17 = dateMidnight16.yearOfEra();
        int int18 = dateMidnight16.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property19 = dateMidnight16.year();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight16.plusYears((int) ' ');
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight16);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(readableDuration23, readableInstant24, periodType25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        mutablePeriod26.add(readableDuration27);
        mutablePeriod26.addMonths((int) '#');
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 1, chronology32);
        int int34 = localDate33.getDayOfYear();
        org.joda.time.LocalTime localTime35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localDate33.toDateTime(localTime35, dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = localDate33.toDateMidnight(dateTimeZone38);
        org.joda.time.DateMidnight.Property property40 = dateMidnight39.yearOfEra();
        int int41 = dateMidnight39.getMinuteOfHour();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) (byte) 100, chronology43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime46.copy();
        org.joda.time.Duration duration48 = period44.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight39.plus((org.joda.time.ReadableDuration) duration48);
        mutablePeriod26.add((org.joda.time.ReadableDuration) duration48);
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.years();
        java.lang.String str52 = periodType51.getName();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(periodType51);
        org.joda.time.PeriodType periodType54 = periodType51.withYearsRemoved();
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight16, (org.joda.time.ReadableDuration) duration48, periodType54);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period56 = new org.joda.time.Period(53643303, (int) (short) 0, 14, 53628444, 53634384, 53618333, 894, 99, periodType54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(dateMidnight49);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Years" + "'", str52, "Years");
        org.junit.Assert.assertNotNull(periodType54);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.withHourOfDay((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay0.withFieldAdded(durationFieldType3, 53625645);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay0.plusHours((int) '4');
        org.joda.time.TimeOfDay.Property property8 = timeOfDay0.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay10 = property8.addToCopy((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay12 = property8.setCopy(53620134);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53620134 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay10);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone4);
        mutableDateTime2.setZone(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.weekyear();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(53659661, 53620972, 457);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53620972 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.withHourOfDay((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay0.withFieldAdded(durationFieldType3, 53625645);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay0.plusHours((int) '4');
        org.joda.time.TimeOfDay.Property property8 = timeOfDay0.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay10 = property8.addToCopy((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.withMillisOfSecond(53646);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53646 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay10);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        java.util.Date date5 = mutableDateTime2.toDate();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromDateFields(date5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime6.withSecondOfMinute((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Feb 21 14:54:22 UTC 2022");
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setLanguageTag("2032-02-21T14:53:47.960Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 2032 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight8.plusYears((int) ' ');
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight8);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(periodType15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod16, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight20 = dateMidnight8.withWeekOfWeekyear(792);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 792 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(dateMidnight18);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(53619770, 0, 53650847);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusMonths(339);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withTime(53660145, 842, 53628444, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53660145 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53663144 + "'", int5 == 53663144);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate7 = property4.addToCopy(2022);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType9 = periodType8.withMonthsRemoved();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.copy();
        mutableDateTime11.addMinutes(0);
        java.lang.String str15 = mutableDateTime11.toString();
        int int16 = mutableDateTime11.getYearOfEra();
        org.joda.time.Chronology chronology17 = mutableDateTime11.getChronology();
        org.joda.time.Chronology chronology18 = mutableDateTime11.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) property4, periodType8, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(mutableDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2022-02-21T14:54:23.276Z" + "'", str15, "2022-02-21T14:54:23.276Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.withHourOfDay((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay0.withFieldAdded(durationFieldType3, 53625645);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay0.plusHours((int) '4');
        org.joda.time.TimeOfDay.Property property8 = timeOfDay0.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay9 = property8.withMaximumValue();
        org.joda.time.DurationField durationField10 = property8.getDurationField();
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        boolean boolean14 = dateTimeZone12.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone12);
        int int16 = localDate15.size();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = property8.compareTo((org.joda.time.ReadablePartial) localDate15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        int int2 = mutableDateTime1.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone4);
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        long long9 = dateTimeZone4.previousTransition((long) 11);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 410 + "'", int2 == 410);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundFloorCopy();
        org.joda.time.LocalTime localTime3 = property1.roundHalfFloorCopy();
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = property1.setCopy("Etc/UTC", locale5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Etc/UTC\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology6.getDateTimeMillis(902, (int) (byte) 10, (int) (byte) 10, 0, 53657187, 53618165, 53662339);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53657187 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(53656402, 53657228);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 53657228");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(52, 53617719, 904, 53643405, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53643405 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        java.util.Date date6 = new java.util.Date(53617719, 2022, 842, 1, 0, 53618165);
        date6.setYear(53620623);
        java.util.Date date15 = new java.util.Date(53617719, 2022, 842, 1, 0, 53618165);
        int int16 = date15.getSeconds();
        date15.setTime((long) 53617649);
        int int19 = date6.compareTo(date15);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 01 14:56:05 UTC 53622523");
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 14:53:37 UTC 1970");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-21T14:54:05.059Z");
        timeZone1.setID("1970-01-01");
        boolean boolean4 = timeZone1.observesDaylightTime();
        int int5 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 1, chronology10);
        java.lang.String str12 = localDate11.toString();
        org.joda.time.LocalDate localDate14 = localDate11.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType8.getField(chronology15);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) (byte) 100, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime22.copy();
        org.joda.time.Duration duration24 = period20.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.Period period26 = period20.plusDays((int) (byte) 10);
        int int27 = period26.getHours();
        org.joda.time.Period period29 = period26.plusMonths(2);
        org.joda.time.Period period31 = period26.minusMonths(12);
        org.joda.time.Period period33 = period26.withYears(2057);
        int[] intArray35 = chronology15.get((org.joda.time.ReadablePeriod) period33, 259200000L);
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((long) 1970, chronology15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(53640490, 53648497, 2022, 24, 53629402, 4, 6, chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 24 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 0, 3, 0, 0, 0, 0]");
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromCalendarFields(calendar0);
        calendar0.setLenient(true);
        int int7 = calendar0.getMaximum(11);
        boolean boolean8 = calendar0.isWeekDateSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = calendar0.getMaximum(53618195);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53618195");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455264554,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=24,MILLISECOND=554,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23 + "'", int7 == 23);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        mutablePeriod3.addYears((int) (byte) 0);
        int int6 = mutablePeriod3.getMonths();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableDuration7, readableInstant8, periodType9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutablePeriod10.add(readableDuration11);
        mutablePeriod10.addMonths((int) '#');
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology16);
        int int18 = localDate17.getDayOfYear();
        org.joda.time.LocalTime localTime19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate17.toDateTime(localTime19, dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = localDate17.toDateMidnight(dateTimeZone22);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.yearOfEra();
        int int25 = dateMidnight23.getMinuteOfHour();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) (byte) 100, chronology27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime30.copy();
        org.joda.time.Duration duration32 = period28.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight23.plus((org.joda.time.ReadableDuration) duration32);
        mutablePeriod10.add((org.joda.time.ReadableDuration) duration32);
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration32);
        org.joda.time.MutablePeriod mutablePeriod36 = mutablePeriod3.copy();
        org.joda.time.PeriodType periodType37 = mutablePeriod36.getPeriodType();
        mutablePeriod36.setWeeks(342);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(mutablePeriod36);
        org.junit.Assert.assertNotNull(periodType37);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType5.getField(chronology12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (byte) 100, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime19.copy();
        org.joda.time.Duration duration21 = period17.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.Period period23 = period17.plusDays((int) (byte) 10);
        int int24 = period23.getHours();
        org.joda.time.Period period26 = period23.plusMonths(2);
        org.joda.time.Period period28 = period23.minusMonths(12);
        org.joda.time.Period period30 = period23.withYears(2057);
        int[] intArray32 = chronology12.get((org.joda.time.ReadablePeriod) period30, 259200000L);
        org.joda.time.DurationField durationField33 = chronology12.weeks();
        org.joda.time.DateTimeField dateTimeField34 = chronology12.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(53626518, 1439, 902, (int) 'a', 53656631, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 0, 3, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = instant0.toDateTimeISO();
        org.joda.time.Instant instant4 = instant0.withDurationAdded((long) 13, 0);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(instant4);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(533L, chronology8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 342, chronology8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 1, chronology12);
        java.lang.String str14 = localDate13.toString();
        org.joda.time.LocalDate localDate16 = localDate13.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableDuration18, readableInstant19, periodType20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutablePeriod21.add(readableDuration22);
        mutablePeriod21.addYears((int) (short) 100);
        java.lang.Object obj26 = mutablePeriod21.clone();
        mutablePeriod21.setSeconds(904);
        org.joda.time.LocalDate localDate29 = localDate16.minus((org.joda.time.ReadablePeriod) mutablePeriod21);
        org.joda.time.format.PeriodFormatter periodFormatter30 = null;
        java.lang.String str31 = mutablePeriod21.toString(periodFormatter30);
        mutablePeriod21.setPeriod((long) 'x', (long) '4');
        int[] intArray37 = chronology8.get((org.joda.time.ReadablePeriod) mutablePeriod21, (long) 342, (long) (byte) 0);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(chronology38);
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime39.copy();
        mutableDateTime39.addMinutes(0);
        java.lang.String str43 = mutableDateTime39.toString();
        int int44 = mutableDateTime39.getYearOfEra();
        org.joda.time.Chronology chronology45 = mutableDateTime39.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((java.lang.Object) chronology8, chronology45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "PT0.068S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "PT0.068S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "PT0.068S");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "P100YT904S" + "'", str31, "P100YT904S");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 0, 0, 0, 0, 0, 0, -342]");
        org.junit.Assert.assertNotNull(mutableDateTime40);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "2022-02-21T14:54:24.903Z" + "'", str43, "2022-02-21T14:54:24.903Z");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2022 + "'", int44 == 2022);
        org.junit.Assert.assertNotNull(chronology45);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "IT");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("UTC");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("2022-02-21T14:54:04.284Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-21T14:54:04.284Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        org.joda.time.Period period1 = org.joda.time.Period.days(20);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime.Property property9 = dateTime5.year();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) 100, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.copy();
        org.joda.time.Duration duration16 = period12.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableDuration) duration16);
        org.joda.time.DateTime.Property property18 = dateTime5.monthOfYear();
        java.util.Locale locale19 = java.util.Locale.ITALY;
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        java.lang.String str21 = locale20.getDisplayCountry();
        java.lang.String str22 = locale19.getDisplayLanguage(locale20);
        java.lang.String str23 = property18.getAsText(locale20);
        org.joda.time.DateTimeField dateTimeField24 = property18.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((java.lang.Object) dateTimeField24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str22, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u6708" + "'", str23, "\u6708");
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        int int6 = localDate2.getDayOfYear();
        org.joda.time.LocalDate localDate8 = localDate2.withWeekyear(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate localDate11 = localDate2.withField(dateTimeFieldType9, 53628506);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate11.withDayOfMonth(328);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 328 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        boolean boolean6 = dateTimeFormatter5.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = dateTimeFormatter5.parseMutableDateTime("CA");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.hours();
        mutableDateTime6.add(durationFieldType7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer4, (org.joda.time.ReadableInstant) mutableDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.LocalTime localTime6 = property1.addWrapFieldToCopy(53618195);
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str9 = locale7.getExtension('a');
        int int10 = property1.getMaximumShortTextLength(locale7);
        java.lang.Object obj11 = locale7.clone();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27422465L) + "'", long4 == (-27422465L));
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "en_CA");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "en_CA");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "en_CA");
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-21T14:54:05.059Z");
        timeZone1.setID("1970-01-01");
        boolean boolean4 = timeZone1.observesDaylightTime();
        boolean boolean5 = timeZone1.observesDaylightTime();
        java.lang.Object obj6 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "sun.util.calendar.ZoneInfo[id=\"1970-01-01\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "sun.util.calendar.ZoneInfo[id=\"1970-01-01\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "sun.util.calendar.ZoneInfo[id=\"1970-01-01\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        org.joda.time.DateTimeZone dateTimeZone8 = chronology6.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology6.getDateTimeMillis(410, (int) 'a', 47, 53634467);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(8);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone7);
        java.lang.Appendable appendable10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusWeeks((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(appendable10, (org.joda.time.ReadableInstant) dateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("2022-02-21T14:54:19.223Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.year();
        mutableDateTime2.setChronology(chronology12);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.hourOfDay();
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime19 = property16.set("IT", locale18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"IT\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.time();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period(783, 53656199, 52, 736, 32770, 53658462, 53656631, 100, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("\u82f1\u8a9e\u30ab\u30ca\u30c0)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? (????) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        mutableDateTime1.setSecondOfDay(21);
        org.joda.time.Chronology chronology7 = null;
        mutableDateTime1.setChronology(chronology7);
        mutableDateTime1.setMinuteOfHour((int) (short) 0);
        mutableDateTime1.addMinutes((int) (byte) 1);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property14 = localTime13.minuteOfHour();
        org.joda.time.LocalTime localTime16 = localTime13.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localTime13.toDateTimeToday(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMonths(10);
        org.joda.time.DateTime.Property property21 = dateTime18.minuteOfDay();
        org.joda.time.DateTime dateTime22 = property21.getDateTime();
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfWeek();
        org.joda.time.DateTime dateTime25 = dateTime22.minusWeeks((int) 'a');
        boolean boolean26 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime28 = dateTime22.minusMonths(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = dateTime22.withDayOfMonth(53664756);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53664756 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        java.lang.String str5 = mutableDateTime1.toString();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMonthOfYear(53660764);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53660764 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022-02-21T14:54:26.081Z" + "'", str5, "2022-02-21T14:54:26.081Z");
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.Interval interval11 = dateMidnight8.toInterval();
        org.joda.time.MutableDateTime mutableDateTime12 = dateMidnight8.toMutableDateTime();
        org.joda.time.DateMidnight.Property property13 = dateMidnight8.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight14 = property13.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight16 = property13.setCopy("CA");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"CA\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateMidnight14);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withCenturyOfEra(1);
        org.joda.time.DateTime dateTime3 = dateMidnight2.toDateTime();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 53619248, (long) 1);
        mutablePeriod6.add((int) (byte) 10, 904, 53619708, 47, 10, (-292275054), 0, 342);
        int int16 = mutablePeriod6.size();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight2.minus((org.joda.time.ReadablePeriod) mutablePeriod6);
        int int18 = dateMidnight17.getWeekyear();
        org.junit.Assert.assertNotNull(dateMidnight2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1027049) + "'", int18 == (-1027049));
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.DurationField durationField10 = dateTimeField9.getLeapDurationField();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeField9.getDifferenceAsLong(1692308073081600000L, (long) 736);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53666565 + "'", int5 == 53666565);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNull(durationField10);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.parse("2022-02-21T14:54:15.069Z", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Calendar.Builder builder4 = builder0.setLocale(locale3);
        java.util.Calendar calendar5 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = calendar5.getGreatestMinimum(982);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 982");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        long long6 = property5.remainder();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime7.setMillisOfSecond(53666419);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53666419 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 26990L + "'", long6 == 26990L);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        int int10 = localDate9.getDayOfYear();
        org.joda.time.LocalDate.Property property11 = localDate9.weekOfWeekyear();
        org.joda.time.LocalDate localDate12 = property11.roundHalfEvenCopy();
        boolean boolean13 = localDate5.isAfter((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate.Property property14 = localDate5.yearOfEra();
        org.joda.time.LocalDate localDate16 = localDate5.plusMonths(342);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 1, chronology18);
        java.lang.String str20 = localDate19.toString();
        org.joda.time.LocalDate localDate22 = localDate19.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property23 = localDate19.weekOfWeekyear();
        org.joda.time.DateTime dateTime24 = localDate19.toDateTimeAtCurrentTime();
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone26 = dateMidnight25.getZone();
        boolean boolean28 = dateTimeZone26.isStandardOffset((long) 'a');
        org.joda.time.DateTime dateTime29 = dateTime24.withZoneRetainFields(dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((java.lang.Object) localDate5, dateTimeZone26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeField6.set((long) 1970, 53636547);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53636547 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfEvenCopy();
        boolean boolean10 = property8.isLeap();
        org.joda.time.LocalDateTime localDateTime11 = property8.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withField(dateTimeFieldType12, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53667451 + "'", int5 == 53667451);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalDate.Property property4 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate5 = property4.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime9 = dateTime6.withFieldAdded(durationFieldType7, (int) (byte) 0);
        org.joda.time.DateTime.Property property10 = dateTime6.yearOfEra();
        int int11 = property10.getLeapAmount();
        org.joda.time.DateTime dateTime13 = property10.setCopy(710);
        boolean boolean14 = localDate5.equals((java.lang.Object) property10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = property9.addToCopy((int) (short) 0);
        int int12 = localDateTime11.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withSecondOfMinute(718);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 718 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53667614 + "'", int5 == 53667614);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53667614 + "'", int12 == 53667614);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        long long14 = dateTimeField12.remainder((long) (short) -1);
        java.lang.String str16 = dateTimeField12.getAsText((long) 8);
        int int18 = dateTimeField12.get((long) 902);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(periodType19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) periodType19, dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusDays(465);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(chronology28);
        int int30 = mutableDateTime29.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone32 = dateMidnight31.getZone();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(dateTimeZone32);
        mutableDateTime29.setZoneRetainFields(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(obj27, dateTimeZone32);
        org.joda.time.DateTime dateTime36 = localDateTime24.toDateTime(dateTimeZone32);
        int[] intArray41 = new int[] { 53662339, 15, 662 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray43 = dateTimeField12.addWrapField((org.joda.time.ReadablePartial) localDateTime24, 999, intArray41, 53649515);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 999");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 31535999999L + "'", long14 == 31535999999L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970" + "'", str16, "1970");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 637 + "'", int30 == 637);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[53662339, 15, 662]");
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        mutableDateTime1.setSecondOfDay(21);
        org.joda.time.Chronology chronology7 = null;
        mutableDateTime1.setChronology(chronology7);
        mutableDateTime1.setMinuteOfHour((int) (short) 0);
        mutableDateTime1.addMinutes((int) (byte) 1);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property14 = localTime13.minuteOfHour();
        org.joda.time.LocalTime localTime16 = localTime13.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localTime13.toDateTimeToday(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMonths(10);
        org.joda.time.DateTime.Property property21 = dateTime18.minuteOfDay();
        org.joda.time.DateTime dateTime22 = property21.getDateTime();
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfWeek();
        org.joda.time.DateTime dateTime25 = dateTime22.minusWeeks((int) 'a');
        boolean boolean26 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime28 = dateTime22.minusMonths(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = dateTime22.withSecondOfMinute(736);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 736 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology6);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.setHourOfDay(53644151);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53644151 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.joda.time.Period period2 = org.joda.time.Period.weeks((int) '4');
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.years();
        java.lang.String str4 = periodType3.getName();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(periodType3);
        org.joda.time.Period period6 = period2.plus((org.joda.time.ReadablePeriod) mutablePeriod5);
        org.joda.time.Period period7 = period2.negated();
        org.joda.time.Period period9 = period7.plusHours(9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = strSet0.contains((java.lang.Object) period9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.joda.time.Period cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Years" + "'", str4, "Years");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withWeekyear(35);
        int int8 = localDateTime3.getYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        java.lang.String str13 = localDate12.toString();
        org.joda.time.LocalDate localDate15 = localDate12.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay((long) (short) 1, chronology16);
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay17.plusMonths(53617719);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableDuration20, readableInstant21, periodType22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        mutablePeriod23.add(readableDuration24);
        mutablePeriod23.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(readableDuration28, readableInstant29, periodType30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        mutablePeriod31.add(readableDuration32);
        mutablePeriod31.addMonths((int) '#');
        mutablePeriod23.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.YearMonthDay yearMonthDay37 = yearMonthDay19.plus((org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (byte) 100, chronology39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(chronology41);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime42.copy();
        org.joda.time.Duration duration44 = period40.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime43);
        org.joda.time.Seconds seconds45 = period40.toStandardSeconds();
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay37.minus((org.joda.time.ReadablePeriod) seconds45);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = localDateTime3.compareTo((org.joda.time.ReadablePartial) yearMonthDay46);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(yearMonthDay37);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(seconds45);
        org.junit.Assert.assertNotNull(yearMonthDay46);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime.Property property9 = dateTime5.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = property9.setCopy((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableDuration7, readableInstant8, periodType9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutablePeriod10.add(readableDuration11);
        mutablePeriod10.addYears((int) (short) 100);
        java.lang.Object obj15 = mutablePeriod10.clone();
        mutablePeriod10.setSeconds(904);
        org.joda.time.LocalDate localDate18 = localDate5.minus((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.LocalDate.Property property19 = localDate18.yearOfEra();
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = property19.getAsShortText(locale20);
        org.joda.time.LocalDate localDate22 = property19.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate24 = localDate22.minusWeeks((-1));
        int int25 = localDate24.getDayOfWeek();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "P100YT904S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "P100YT904S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "P100YT904S");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusMillis(53618333);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableDuration7, readableInstant8, periodType9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutablePeriod10.add(readableDuration11);
        mutablePeriod10.addSeconds(53617440);
        org.joda.time.DateTime dateTime15 = dateTime4.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 1, chronology17);
        java.lang.String str19 = localDate18.toString();
        org.joda.time.LocalDate localDate21 = localDate18.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((java.lang.Object) mutablePeriod10, chronology22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.MutablePeriod");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((-292275054), 53618195, 53639477, 32769, 53637942, 2022, 53666419);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        org.joda.time.DateMidnight.Property property12 = dateMidnight8.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight13 = property12.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight15 = property12.addToCopy(53637942);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1068828874 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateMidnight13);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Collection<java.util.Locale> localeCollection1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList2 = java.util.Locale.filter(languageRangeList0, localeCollection1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromCalendarFields(calendar0);
        calendar0.setLenient(true);
        int int7 = calendar0.getMaximum(11);
        boolean boolean8 = calendar0.isWeekDateSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = calendar0.getLeastMaximum(53618195);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53618195");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455268562,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=28,MILLISECOND=562,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23 + "'", int7 == 23);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(718, 53626727, 22, 53658462, 53625266, 53646242);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53658462 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        int int6 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setTime(47541L);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.monthOfYear();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 28 + "'", int6 == 28);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.withHourOfDay((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.minusMinutes((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay2.plusMillis(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.era();
        java.lang.String str8 = dateTimeFieldType7.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property9 = timeOfDay2.property(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'era' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "era" + "'", str8, "era");
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfDay();
        boolean boolean8 = dateTimeField7.isLenient();
        int int10 = dateTimeField7.get(10L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 24 + "'", int10 == 24);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 100, 53652083);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        org.joda.time.Instant instant3 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        mutableDateTime1.setChronology(chronology4);
        mutableDateTime1.setMillisOfDay(53636825);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology8);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.copy();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZone(dateTimeZone11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        int int16 = localDate15.getDayOfYear();
        org.joda.time.LocalTime localTime17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate15.toDateTime(localTime17, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = localDate15.toDateMidnight(dateTimeZone20);
        org.joda.time.DateMidnight.Property property22 = dateMidnight21.yearOfEra();
        int int23 = dateMidnight21.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property24 = dateMidnight21.year();
        boolean boolean25 = mutableDateTime10.isBefore((org.joda.time.ReadableInstant) dateMidnight21);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        int int2 = mutableDateTime1.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone4);
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology8);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.copy();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime10.setZone(dateTimeZone11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.minuteOfDay();
        long long14 = property13.remainder();
        org.joda.time.MutableDateTime mutableDateTime16 = property13.add((long) 53620623);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.millisOfDay();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property19 = localTime18.minuteOfHour();
        org.joda.time.LocalTime localTime21 = localTime18.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localTime18.toDateTimeToday(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.plusMonths(10);
        org.joda.time.DateTime.Property property26 = dateTime23.minuteOfDay();
        org.joda.time.DateTime dateTime27 = property26.getDateTime();
        org.joda.time.DateTime dateTime28 = property26.roundFloorCopy();
        org.joda.time.DateTime dateTime30 = dateTime28.withYearOfEra(53617440);
        java.lang.String str31 = dateTime30.toString();
        boolean boolean32 = mutableDateTime16.isEqual((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Chronology chronology33 = mutableDateTime16.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone4, chronology33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 29033L + "'", long14 == 29033L);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "53617440-02-21T14:54:00.000Z" + "'", str31, "53617440-02-21T14:54:00.000Z");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(chronology33);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight11.withField(dateTimeFieldType20, 842);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay8.property(dateTimeFieldType20);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay8.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay26 = property24.addToCopy(53629078);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay28 = property24.setCopy("14:53:45.116");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"14:53:45.116\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.parse("Jul 1, 53619791 2:56:05 PM", dateTimeFormatter7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withCenturyOfEra(1);
        org.joda.time.DateTime dateTime3 = dateMidnight2.toDateTime();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 53619248, (long) 1);
        mutablePeriod6.add((int) (byte) 10, 904, 53619708, 47, 10, (-292275054), 0, 342);
        int int16 = mutablePeriod6.size();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight2.minus((org.joda.time.ReadablePeriod) mutablePeriod6);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minus((long) 53619079);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight21 = dateMidnight17.withYearOfCentury(457);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 457 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateMidnight19);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.dayOfYear();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(periodType11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) periodType11, dateTimeZone13);
        int int15 = localDateTime14.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.dayOfMonth();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime18.copy();
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone21 = dateMidnight20.getZone();
        mutableDateTime18.setZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = localDateTime14.toDateTime(dateTimeZone21);
        java.util.Locale locale26 = java.util.Locale.ITALY;
        java.lang.String str27 = dateTimeZone21.getShortName((long) 1970, locale26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight28 = property9.setCopy("2022-02-21T14:54:19.223Z", locale26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:54:19.223Z\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(53668755);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53668755 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTimeISO();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        java.lang.String str7 = localDate6.toString();
        org.joda.time.LocalDate localDate9 = localDate6.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.era();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime3.setRounding(dateTimeField13, 53619079);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 53619079");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        org.joda.time.DateTimeZone dateTimeZone8 = chronology6.getZone();
        java.util.Locale locale12 = new java.util.Locale("UTC", "2022-02-21T14:53:49.549Z");
        java.lang.String str13 = locale12.getCountry();
        java.lang.String str15 = locale12.getExtension('x');
        java.lang.String str16 = dateTimeZone8.getShortName((long) 52, locale12);
        java.util.TimeZone timeZone17 = dateTimeZone8.toTimeZone();
        int int18 = timeZone17.getDSTSavings();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals(locale12.toString(), "utc_2022-02-21T14:53:49.549Z");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-21T14:53:49.549Z" + "'", str13, "2022-02-21T14:53:49.549Z");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(8);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withDefaultYear(53639477);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTimeFormatter2.parseDateTime("2022");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        org.joda.time.Chronology chronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime.Property property9 = dateTime5.year();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) 100, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.copy();
        org.joda.time.Duration duration16 = period12.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableDuration) duration16);
        org.joda.time.DateTime.Property property18 = dateTime5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        org.joda.time.DateTime dateTime20 = property18.roundHalfCeilingCopy();
        java.lang.String str21 = property18.getAsString();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2" + "'", str21, "2");
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusMonths(339);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.plusSeconds(53633398);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.withYear(53620134);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withDayOfWeek(9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53670267 + "'", int5 == 53670267);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology8);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 14, chronology8);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((-1L), chronology8);
        org.joda.time.Period period13 = mutablePeriod12.toPeriod();
        org.joda.time.Period period15 = period13.plusSeconds(53640641);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType17 = period15.getFieldType(53643303);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateMidnight8.toString("2022-02-21T14:54:00.490");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("ca");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        int int8 = localDate7.getDayOfYear();
        org.joda.time.LocalTime localTime9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTime(localTime9, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.yearOfEra();
        int int15 = dateMidnight13.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property16 = dateMidnight13.year();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight13.plusYears((int) ' ');
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight13);
        org.joda.time.LocalDate.Property property20 = localDate19.dayOfYear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 1, chronology22);
        int int24 = localDate23.getDayOfYear();
        org.joda.time.LocalTime localTime25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate23.toDateTime(localTime25, dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = localDate23.toDateMidnight(dateTimeZone28);
        org.joda.time.DateMidnight.Property property30 = dateMidnight29.yearOfEra();
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone32 = dateMidnight31.getZone();
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight29.toMutableDateTime(dateTimeZone32);
        boolean boolean34 = localDate19.equals((java.lang.Object) dateTimeZone32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(24, 53634467, 0, 53667299, 34, dateTimeZone32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53667299 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        int int10 = localDate9.getDayOfYear();
        org.joda.time.LocalDate.Property property11 = localDate9.weekOfWeekyear();
        org.joda.time.LocalDate localDate12 = property11.roundHalfEvenCopy();
        boolean boolean13 = localDate5.isAfter((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate.Property property14 = localDate5.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate5.withDayOfYear(53619248);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53619248 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.hourOfDay();
        int int2 = property1.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay3 = property1.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay5 = property1.setCopy("T14:54:10.579");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"T14:54:10.579\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertNotNull(timeOfDay3);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        java.util.Locale locale5 = new java.util.Locale("UTC", "2022-02-21T14:53:49.549Z");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        boolean boolean7 = strSet6.isEmpty();
        boolean boolean8 = strSet1.removeAll((java.util.Collection<java.lang.String>) strSet6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = strSet1.add("22");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strStream2);
        org.junit.Assert.assertEquals(locale5.toString(), "utc_2022-02-21T14:53:49.549Z");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.DurationField durationField10 = chronology7.years();
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) 53629078, chronology7);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone13 = dateMidnight12.getZone();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 1, chronology15);
        java.lang.String str17 = localDate16.toString();
        org.joda.time.LocalDate localDate19 = localDate16.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight12.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.LocalDate localDate22 = localDate19.plusDays(53640196);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 1, chronology25);
        java.lang.String str27 = localDate26.toString();
        org.joda.time.LocalDate localDate29 = localDate26.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.yearOfEra();
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType23.getField(chronology30);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTimeField dateTimeField34 = chronology30.dayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 53619248, (long) 1);
        int[] intArray40 = chronology30.get((org.joda.time.ReadablePeriod) mutablePeriod37, (long) (-292275054), (long) 53637942);
        // The following exception was thrown during execution in test generation
        try {
            chronology7.validate((org.joda.time.ReadablePartial) localDate19, intArray40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01" + "'", str27, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 0, 0, 4, 0, 5, 12, 996]");
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        int int4 = calendar0.getWeeksInWeekYear();
        calendar0.setTimeInMillis((long) (-144832));
        calendar0.roll(53656402, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.set(10297, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10297");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-144832,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=57,SECOND=35,MILLISECOND=168,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property12 = localDate8.weekOfWeekyear();
        org.joda.time.DateTime dateTime13 = localDate8.toDateTimeAtCurrentTime();
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone15 = dateMidnight14.getZone();
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) 'a');
        org.joda.time.DateTime dateTime18 = dateTime13.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime19 = localDate5.toDateTimeAtStartOfDay(dateTimeZone15);
        org.joda.time.DateTime.Property property20 = dateTime19.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = dateTime19.withTime(53658563, (int) (short) 0, 53661484, 53662339);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53658563 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        long long6 = property5.remainder();
        org.joda.time.MutableDateTime mutableDateTime8 = property5.add((long) 53620623);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime8.setWeekOfWeekyear(53634384);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53634384 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 31349L + "'", long6 == 31349L);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime4 = localTime0.withFields((org.joda.time.ReadablePartial) localTime3);
        java.lang.String str5 = localTime0.toString();
        org.joda.time.LocalTime localTime7 = localTime0.minusHours(773);
        org.joda.time.LocalTime localTime9 = localTime0.withSecondOfMinute(56);
        int int10 = localTime0.getHourOfDay();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(periodType11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) periodType11, dateTimeZone13);
        int int15 = localDateTime14.getDayOfMonth();
        int int16 = localDateTime14.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.millisOfSecond();
        int int18 = localDateTime14.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property19 = localDateTime14.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = localTime0.compareTo((org.joda.time.ReadablePartial) localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "14:54:31.533" + "'", str5, "14:54:31.533");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 14 + "'", int10 == 14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53671534 + "'", int16 == 53671534);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        mutablePeriod3.addYears((int) (byte) 0);
        int int6 = mutablePeriod3.getMonths();
        mutablePeriod3.addMinutes((int) (byte) 0);
        int int9 = mutablePeriod3.getMinutes();
        org.joda.time.ReadableInterval readableInterval10 = null;
        mutablePeriod3.setPeriod(readableInterval10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        java.lang.String str15 = localDate14.toString();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology18);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (byte) 100, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime25.copy();
        org.joda.time.Duration duration27 = period23.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.hourOfDay();
        mutablePeriod3.setPeriod((org.joda.time.ReadableInstant) mutableDateTime20, (org.joda.time.ReadableInstant) mutableDateTime26);
        java.util.Date date30 = mutableDateTime20.toDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Mon Feb 21 14:54:31 UTC 2022");
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, 96);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 96 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(0L, dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = org.joda.time.DateMidnight.now(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(53656631, 54, 99, 53640490, 53642062, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53640490 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateMidnight8);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(53632, (int) (byte) -1, chronology2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53632 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.months();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromCalendarFields(calendar0);
        calendar0.setLenient(true);
        int int7 = calendar0.getMaximum(11);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calendar0.getActualMinimum((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455272168,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=32,MILLISECOND=168,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23 + "'", int7 == 23);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight11.withField(dateTimeFieldType20, 842);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay8.property(dateTimeFieldType20);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay8.monthOfYear();
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.Character> charSet27 = locale26.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay28 = property24.setCopy("", locale26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet27);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight11.withField(dateTimeFieldType20, 842);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay8.property(dateTimeFieldType20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay8.withDayOfMonth(53645);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53645 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        int int0 = org.joda.time.MutableDateTime.ROUND_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean6 = localTime4.isSupported(dateTimeFieldType5);
        org.joda.time.DateTime dateTime7 = localDate2.toDateTime(localTime4);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.roundFloorCopy();
        org.joda.time.LocalTime localTime12 = localTime10.minusHours(1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDate2.compareTo((org.joda.time.ReadablePartial) localTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 53619248, (long) 1);
        mutablePeriod2.add((int) (byte) 10, 904, 53619708, 47, 10, (-292275054), 0, 342);
        int int12 = mutablePeriod2.getDays();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.copy();
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone17 = dateMidnight16.getZone();
        mutableDateTime14.setZoneRetainFields(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((java.lang.Object) int12, dateTimeZone17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 47 + "'", int12 == 47);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((long) (short) 1, chronology8);
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology8);
        java.lang.Class<?> wildcardClass11 = dateTimeField10.getClass();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = property1.addCopy((long) (short) -1);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime3.withMinuteOfHour((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.DurationField durationField10 = dateTimeField9.getLeapDurationField();
        java.lang.String str12 = dateTimeField9.getAsShortText((long) 7);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeField9.getDifferenceAsLong((long) 53664756, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53672985 + "'", int5 == 53672985);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNull(durationField10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u897f\u66a6" + "'", str12, "\u897f\u66a6");
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property12 = localDate8.weekOfWeekyear();
        org.joda.time.DateTime dateTime13 = localDate8.toDateTimeAtCurrentTime();
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone15 = dateMidnight14.getZone();
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) 'a');
        org.joda.time.DateTime dateTime18 = dateTime13.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime19 = localDate5.toDateTimeAtStartOfDay(dateTimeZone15);
        org.joda.time.LocalDate localDate21 = localDate5.minusDays(53641106);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = localDate21.withDayOfMonth((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Calendar.Builder builder4 = builder0.setLocale(locale3);
        java.util.Date date11 = new java.util.Date(53617719, 2022, 842, 1, 0, 53618165);
        int int12 = date11.getYear();
        java.util.Calendar.Builder builder13 = builder4.setInstant(date11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder18 = builder4.setTimeOfDay(53660145, 4468419, 53632583, 53646596);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(date11.toString(), "Fri Jul 01 14:56:05 UTC 53619791");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53617891 + "'", int12 == 53617891);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.withHourOfDay((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay7.withFieldAdded(durationFieldType10, 53625645);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay7.plusHours((int) '4');
        org.joda.time.TimeOfDay.Property property15 = timeOfDay7.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay16 = property15.withMinimumValue();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 1, (long) 0, periodType19, chronology20);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay16.minus((org.joda.time.ReadablePeriod) mutablePeriod21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime26.copy();
        mutableDateTime26.addMinutes(0);
        java.lang.String str30 = mutableDateTime26.toString();
        int int31 = mutableDateTime26.getYearOfEra();
        org.joda.time.Chronology chronology32 = mutableDateTime26.getChronology();
        org.joda.time.Chronology chronology33 = mutableDateTime26.getChronology();
        mutablePeriod21.setPeriod((long) 53, (long) 2022, chronology33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(342, (int) (byte) 1, 53634467, 0, 4468419, 53640490, (-144832), chronology33);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4468419 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(mutableDateTime27);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2022-02-21T14:54:33.164Z" + "'", str30, "2022-02-21T14:54:33.164Z");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2022 + "'", int31 == 2022);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(chronology33);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay((int) ' ', 53617440, 3, 53617649);
        java.util.Calendar.Builder builder12 = builder7.setTimeOfDay(53626727, 0, 53628444, (int) ' ');
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 1, chronology15);
        java.lang.String str17 = localDate16.toString();
        org.joda.time.LocalDate localDate19 = localDate16.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay((long) (short) 1, chronology20);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone23 = dateMidnight22.getZone();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 1, chronology25);
        java.lang.String str27 = localDate26.toString();
        org.joda.time.LocalDate localDate29 = localDate26.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight22.withFields((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(readableDuration31, readableInstant32, periodType33);
        mutablePeriod34.setMillis(0);
        org.joda.time.LocalDate localDate37 = localDate29.plus((org.joda.time.ReadablePeriod) mutablePeriod34);
        int[] intArray40 = chronology20.get((org.joda.time.ReadablePeriod) mutablePeriod34, (long) 53645, (long) 53625309);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder41 = builder7.setFields(intArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01" + "'", str27, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 0, 0, 0, 14, 52, 51, 664]");
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((-27422466L));
        org.joda.time.Chronology chronology3 = instant0.getChronology();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        int int8 = localDate7.getDayOfYear();
        org.joda.time.LocalDate localDate10 = localDate7.minusYears(53627214);
        int[] intArray12 = chronology3.get((org.joda.time.ReadablePartial) localDate10, (long) 342);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((java.lang.Object) intArray12, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: [I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1970, 1, 1]");
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("4470113-04-01");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.lang.Object obj3 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableDuration3, readableInstant4, periodType5);
        mutablePeriod6.addYears((int) (byte) 0);
        int int9 = mutablePeriod6.getMonths();
        mutablePeriod6.addMinutes((int) (byte) 0);
        int int12 = mutablePeriod6.getMinutes();
        org.joda.time.ReadableInterval readableInterval13 = null;
        mutablePeriod6.setPeriod(readableInterval13);
        org.joda.time.DateTime dateTime16 = dateTime2.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod6, (int) ' ');
        org.joda.time.DateTime dateTime18 = dateTime2.plusMillis(53626518);
        int int19 = dateTime2.getYear();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 1, chronology23);
        java.lang.String str25 = localDate24.toString();
        org.joda.time.LocalDate localDate27 = localDate24.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology28);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 14, chronology28);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((-1L), chronology28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay((java.lang.Object) int19, chronology28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01" + "'", str25, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        int int11 = yearMonthDay8.getDayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay8.plusDays(22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType15 = yearMonthDay13.getFieldType(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay13);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusYears((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfEra(47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withCenturyOfEra(53620972);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53620972 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str11 = locale9.getExtension('a');
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale3, locale4, locale5, locale6, locale7, locale8, locale9, locale12 };
        java.util.ArrayList<java.util.Locale> localeList14 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList14, localeArray13);
        java.util.List<java.util.Locale> localeList16 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList14);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.util.Locale locale18 = java.util.Locale.ITALY;
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale22 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 1, chronology24);
        int int26 = localDate25.getDayOfYear();
        org.joda.time.LocalTime localTime27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate25.toDateTime(localTime27, dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = localDate25.toDateMidnight(dateTimeZone30);
        org.joda.time.DateMidnight.Property property32 = dateMidnight31.yearOfEra();
        int int33 = dateMidnight31.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property34 = dateMidnight31.year();
        java.util.Locale locale35 = java.util.Locale.FRENCH;
        java.lang.String str36 = property34.getAsText(locale35);
        java.util.Locale locale37 = java.util.Locale.JAPANESE;
        java.util.Locale locale38 = java.util.Locale.JAPANESE;
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale17, locale18, locale19, locale20, locale21, locale22, locale35, locale37, locale38 };
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList40, filteringMode42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap44 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap44);
        java.util.Locale locale46 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet47 = locale46.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream48 = strSet47.parallelStream();
        java.util.Spliterator<java.lang.String> strSpliterator49 = strSet47.spliterator();
        java.util.Locale.FilteringMode filteringMode50 = null;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags(languageRangeList45, (java.util.Collection<java.lang.String>) strSet47, filteringMode50);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap52 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList53 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList45, strMap52);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertNotNull(localeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localeList16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970" + "'", str36, "1970");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ja");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ja");
        org.junit.Assert.assertNotNull(localeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(strStream48);
        org.junit.Assert.assertNotNull(strSpliterator49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(languageRangeList53);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        mutableDateTime1.setSecondOfDay(21);
        org.joda.time.Chronology chronology7 = null;
        mutableDateTime1.setChronology(chronology7);
        mutableDateTime1.setMinuteOfHour((int) (short) 0);
        mutableDateTime1.addMinutes((int) (byte) 1);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property14 = localTime13.minuteOfHour();
        org.joda.time.LocalTime localTime16 = localTime13.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localTime13.toDateTimeToday(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMonths(10);
        org.joda.time.DateTime.Property property21 = dateTime18.minuteOfDay();
        org.joda.time.DateTime dateTime22 = property21.getDateTime();
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfWeek();
        org.joda.time.DateTime dateTime25 = dateTime22.minusWeeks((int) 'a');
        boolean boolean26 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime28 = dateTime22.minusMonths(5);
        boolean boolean29 = dateTime22.isAfterNow();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.DateMidnight.Property property5 = dateMidnight2.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight2.withCenturyOfEra(2022);
        org.joda.time.Period period9 = org.joda.time.Period.weeks(598);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight7.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period12 = period9.plusYears(53617440);
        org.joda.time.format.PeriodFormatter periodFormatter13 = null;
        java.lang.String str14 = period12.toString(periodFormatter13);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27422465L) + "'", long4 == (-27422465L));
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P53617440Y598W" + "'", str14, "P53617440Y598W");
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        boolean boolean6 = dateTimeFormatter2.isParser();
        int int7 = dateTimeFormatter2.getDefaultYear();
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer8, (-180000L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        int int11 = localDateTime3.get(dateTimeFieldType10);
        int int12 = localDateTime3.getMinuteOfHour();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53674160 + "'", int5 == 53674160);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("2022-02-21T14:54:00.490");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '2022-02-21T14:54:00.490' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 1, chronology9);
        int int11 = localDate10.getDayOfYear();
        org.joda.time.LocalTime localTime12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate10.toDateTime(localTime12, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = localDate10.toDateMidnight(dateTimeZone15);
        org.joda.time.DateMidnight.Property property17 = dateMidnight16.yearOfEra();
        int int18 = dateMidnight16.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property19 = dateMidnight16.year();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        long long22 = dateTimeField20.remainder((long) (short) -1);
        int int23 = dateTimeField20.getMinimumValue();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 1, chronology28);
        java.lang.String str30 = localDate29.toString();
        org.joda.time.LocalDate localDate32 = localDate29.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology33 = localDate32.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.eras();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology33);
        java.util.Locale locale36 = java.util.Locale.CANADA;
        java.lang.String str37 = dateTimeField20.getAsShortText((org.joda.time.ReadablePartial) localDate35, locale36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime38 = property5.set("14:54:16.800", locale36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"14:54:16.800\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 31535999999L + "'", long22 == 31535999999L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-292275054) + "'", int23 == (-292275054));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01" + "'", str30, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "100" + "'", str37, "100");
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(53669651, 53650847);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53669651 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter3.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.parse("UnsupportedDurationField[eras]", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(dateTimePrinter5);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        int int10 = localDate9.getDayOfYear();
        org.joda.time.LocalTime localTime11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate9.toDateTime(localTime11, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = localDate9.toDateMidnight(dateTimeZone14);
        org.joda.time.DateMidnight.Property property16 = dateMidnight15.yearOfEra();
        int int17 = dateMidnight15.getMinuteOfHour();
        int int18 = dateMidnight15.getMonthOfYear();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 1, chronology23);
        java.lang.String str25 = localDate24.toString();
        org.joda.time.LocalDate localDate27 = localDate24.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.eras();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology28);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((java.lang.Object) dateMidnight15, chronology28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(53666419, 18, 53617649, 12, 53617891, 651, (-292275054), chronology28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53617891 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01" + "'", str25, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(durationField29);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(894, 32, 185, 53669143, 53620134, 53636825);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53669143 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str12 = locale10.getExtension('a');
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale4, locale5, locale6, locale7, locale8, locale9, locale10, locale13 };
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.List<java.util.Locale> localeList17 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it_IT");
        org.junit.Assert.assertNotNull(localeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(localeList17);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime3 = dateTime0.withFieldAdded(durationFieldType1, (int) (byte) 0);
        org.joda.time.DateTime.Property property4 = dateTime0.yearOfEra();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.withCenturyOfEra(1);
        org.joda.time.DateTime dateTime8 = dateMidnight7.toDateTime();
        boolean boolean9 = dateTime0.isBefore((org.joda.time.ReadableInstant) dateTime8);
        java.util.Locale locale11 = java.util.Locale.CANADA;
        java.util.Locale locale12 = locale11.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTime0.toString("2022-02-21T14:53:37.719", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = dateMidnight8.isSupported(dateTimeFieldType11);
        org.joda.time.Period period17 = new org.joda.time.Period((int) (byte) 10, (-1), 21, 100);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight8.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone20 = dateMidnight19.getZone();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 1, chronology22);
        java.lang.String str24 = localDate23.toString();
        org.joda.time.LocalDate localDate26 = localDate23.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight19.withFields((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight19.withField(dateTimeFieldType28, 842);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) (byte) 100, chronology32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime35.copy();
        org.joda.time.Duration duration37 = period33.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.Period period39 = period33.plusDays((int) (byte) 10);
        org.joda.time.Duration duration40 = period39.toStandardDuration();
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight19.minus((org.joda.time.ReadableDuration) duration40);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight18.minus((org.joda.time.ReadableDuration) duration40);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(readableDuration43, readableInstant44, periodType45);
        mutablePeriod46.addYears((int) (byte) 0);
        int int49 = mutablePeriod46.getMonths();
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(readableDuration50, readableInstant51, periodType52);
        org.joda.time.ReadableDuration readableDuration54 = null;
        mutablePeriod53.add(readableDuration54);
        mutablePeriod53.addMonths((int) '#');
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) (short) 1, chronology59);
        int int61 = localDate60.getDayOfYear();
        org.joda.time.LocalTime localTime62 = null;
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateTime dateTime64 = localDate60.toDateTime(localTime62, dateTimeZone63);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateMidnight dateMidnight66 = localDate60.toDateMidnight(dateTimeZone65);
        org.joda.time.DateMidnight.Property property67 = dateMidnight66.yearOfEra();
        int int68 = dateMidnight66.getMinuteOfHour();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((long) (byte) 100, chronology70);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(chronology72);
        org.joda.time.MutableDateTime mutableDateTime74 = mutableDateTime73.copy();
        org.joda.time.Duration duration75 = period71.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime74);
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight66.plus((org.joda.time.ReadableDuration) duration75);
        mutablePeriod53.add((org.joda.time.ReadableDuration) duration75);
        mutablePeriod46.setPeriod((org.joda.time.ReadableDuration) duration75);
        org.joda.time.MutablePeriod mutablePeriod79 = mutablePeriod46.copy();
        org.joda.time.PeriodType periodType80 = mutablePeriod79.getPeriodType();
        mutablePeriod79.addSeconds(773);
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.LocalDate localDate87 = new org.joda.time.LocalDate((long) (short) 1, chronology86);
        java.lang.String str88 = localDate87.toString();
        org.joda.time.LocalDate localDate90 = localDate87.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology91 = localDate90.getChronology();
        mutablePeriod79.setPeriod((long) 15, 1L, chronology91);
        org.joda.time.DateMidnight dateMidnight93 = dateMidnight42.plus((org.joda.time.ReadablePeriod) mutablePeriod79);
        org.joda.time.DateMidnight dateMidnight95 = dateMidnight93.minus(0L);
        org.joda.time.DateMidnight dateMidnight97 = dateMidnight95.minusMonths(999);
        int int98 = dateMidnight95.getMonthOfYear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateMidnight66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertNotNull(dateMidnight76);
        org.junit.Assert.assertNotNull(mutablePeriod79);
        org.junit.Assert.assertNotNull(periodType80);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "1970-01-01" + "'", str88, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate90);
        org.junit.Assert.assertNotNull(chronology91);
        org.junit.Assert.assertNotNull(dateMidnight93);
        org.junit.Assert.assertNotNull(dateMidnight95);
        org.junit.Assert.assertNotNull(dateMidnight97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 12 + "'", int98 == 12);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "IT");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("1970");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property8 = localTime7.minuteOfHour();
        org.joda.time.LocalTime localTime10 = localTime7.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime7.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths(10);
        org.joda.time.DateTime.Property property15 = dateTime12.minuteOfDay();
        org.joda.time.DateTime.Property property16 = dateTime12.year();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (byte) 100, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime21.copy();
        org.joda.time.Duration duration23 = period19.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableDuration) duration23);
        org.joda.time.Weeks weeks25 = period24.toStandardWeeks();
        org.joda.time.PeriodType periodType26 = weeks25.getPeriodType();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 1, chronology28);
        java.lang.String str30 = localDate29.toString();
        org.joda.time.LocalDate localDate32 = localDate29.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology33 = localDate32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology33);
        org.joda.time.DateTimeField dateTimeField36 = chronology33.era();
        org.joda.time.DurationField durationField37 = chronology33.hours();
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(chronology33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((java.lang.Object) builder5, periodType26, chronology33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.util.Locale$Builder");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01" + "'", str30, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        java.util.Date date1 = new java.util.Date((long) (-53617748));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromDateFields(date1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -748 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 09:06:22 UTC 1969");
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.dayOfMonth();
        int int10 = localDateTime3.getEra();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.minusSeconds(53648497);
        int int13 = localDateTime3.getMinuteOfHour();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53677506 + "'", int5 == 53677506);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 54 + "'", int13 == 54);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        long long6 = property5.remainder();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime8 = property5.roundHalfFloor();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = property5.set(53643303);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53643303 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 37576L + "'", long6 == 37576L);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((int) 'x', 53664756, 53667299, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53664756 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = property1.setCopy(53669651);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53669651 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate.Property property4 = localDate2.year();
        java.util.Locale locale6 = java.util.Locale.JAPANESE;
        java.lang.String str7 = locale6.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localDate2.toString("", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight11 = property9.addWrapFieldToCopy(873);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plusDays((-1));
        org.joda.time.MutableDateTime mutableDateTime14 = dateMidnight11.toMutableDateTimeISO();
        org.joda.time.DateMidnight.Property property15 = dateMidnight11.era();
        org.joda.time.DateMidnight dateMidnight16 = property15.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight18 = property15.setCopy(53640196);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53640196 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        mutablePeriod3.addYears((int) (byte) 0);
        int int6 = mutablePeriod3.getMonths();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableDuration7, readableInstant8, periodType9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutablePeriod10.add(readableDuration11);
        mutablePeriod10.addMonths((int) '#');
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology16);
        int int18 = localDate17.getDayOfYear();
        org.joda.time.LocalTime localTime19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate17.toDateTime(localTime19, dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = localDate17.toDateMidnight(dateTimeZone22);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.yearOfEra();
        int int25 = dateMidnight23.getMinuteOfHour();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) (byte) 100, chronology27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime30.copy();
        org.joda.time.Duration duration32 = period28.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight23.plus((org.joda.time.ReadableDuration) duration32);
        mutablePeriod10.add((org.joda.time.ReadableDuration) duration32);
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration32);
        org.joda.time.MutablePeriod mutablePeriod36 = mutablePeriod3.copy();
        org.joda.time.PeriodType periodType37 = mutablePeriod36.getPeriodType();
        int int38 = mutablePeriod36.getSeconds();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod36.setValue(842, 53658462);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 842");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(mutablePeriod36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(10L, (-1L), periodType2, chronology3);
        org.joda.time.Period period5 = period4.normalizedStandard();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = period5.isSupported(durationFieldType6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) durationFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(53617440, 12, 53627214);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53617440 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        boolean boolean8 = durationField7.isSupported();
        boolean boolean9 = durationField7.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = durationField7.getDifference(0L, 24815L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.LocalDate.Property property10 = localDate7.property(dateTimeFieldType9);
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = property10.setCopy("2022-02-21T14:54:30.039");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:54:30.039\" for weekyearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Date date1 = calendar0.getTime();
        int int3 = calendar0.getLeastMaximum(0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = calendar0.getActualMaximum(613);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 613");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455278285,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=38,MILLISECOND=285,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Feb 21 14:54:38 UTC 2022");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property10.setCopy(53618333);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53618333 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53678318 + "'", int5 == 53678318);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime10.copy();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone13 = dateMidnight12.getZone();
        mutableDateTime10.setZoneRetainFields(dateTimeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) dateTime8, dateTimeZone13);
        org.joda.time.LocalDate.Property property16 = localDate15.centuryOfEra();
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.lang.String str19 = locale18.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = property16.setCopy("14:54:21.988", locale18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"14:54:21.988\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableDuration7, readableInstant8, periodType9);
        mutablePeriod10.addYears((int) (byte) 0);
        int int13 = mutablePeriod10.getMonths();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableDuration14, readableInstant15, periodType16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutablePeriod17.add(readableDuration18);
        mutablePeriod17.addMonths((int) '#');
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 1, chronology23);
        int int25 = localDate24.getDayOfYear();
        org.joda.time.LocalTime localTime26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate24.toDateTime(localTime26, dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = localDate24.toDateMidnight(dateTimeZone29);
        org.joda.time.DateMidnight.Property property31 = dateMidnight30.yearOfEra();
        int int32 = dateMidnight30.getMinuteOfHour();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) (byte) 100, chronology34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime37.copy();
        org.joda.time.Duration duration39 = period35.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime38);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight30.plus((org.joda.time.ReadableDuration) duration39);
        mutablePeriod17.add((org.joda.time.ReadableDuration) duration39);
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration39);
        org.joda.time.MutablePeriod mutablePeriod43 = mutablePeriod10.copy();
        org.joda.time.PeriodType periodType44 = mutablePeriod43.getPeriodType();
        mutablePeriod43.addSeconds(773);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) (short) 1, chronology50);
        java.lang.String str52 = localDate51.toString();
        org.joda.time.LocalDate localDate54 = localDate51.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology55 = localDate54.getChronology();
        mutablePeriod43.setPeriod((long) 15, 1L, chronology55);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate((long) (short) 1, chronology61);
        java.lang.String str63 = localDate62.toString();
        org.joda.time.LocalDate localDate65 = localDate62.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology66 = localDate65.getChronology();
        org.joda.time.YearMonthDay yearMonthDay67 = new org.joda.time.YearMonthDay((long) (short) 1, chronology66);
        mutablePeriod43.setPeriod((long) 53626705, (long) 339, chronology66);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(24, (-1), 53673313, (int) (short) 0, 14, 7, 53645766, chronology66);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53645766 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1970-01-01" + "'", str52, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1970-01-01" + "'", str63, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate65);
        org.junit.Assert.assertNotNull(chronology66);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        int int2 = mutableDateTime1.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone4);
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        mutableDateTime1.addYears(13);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 696 + "'", int2 == 696);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) 100, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.copy();
        org.joda.time.Duration duration16 = period12.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.Period period18 = period12.plusDays((int) (byte) 10);
        int int19 = period18.getHours();
        org.joda.time.Period period21 = period18.plusMonths(2);
        org.joda.time.Period period23 = period18.minusMonths(12);
        org.joda.time.Period period25 = period18.withYears(2057);
        int[] intArray27 = chronology7.get((org.joda.time.ReadablePeriod) period25, 259200000L);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(chronology7);
        java.lang.String str30 = localDate28.toString("14:54:28.496");
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0, 3, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "14:54:28.496" + "'", str30, "14:54:28.496");
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(53626980, 409, (int) (short) 1, 783, 53649515);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 783 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays(185);
        java.util.Locale locale17 = new java.util.Locale("hi!", "Years", "1970-01-01");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dateTime12.toString("PT0.001S", locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals(locale17.toString(), "hi!_YEARS_1970-01-01");
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period(53629402, 710, 999, 4468419, 736, 19, 9, 70, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Period period8 = period2.plusDays((int) (byte) 10);
        int int9 = period8.getHours();
        org.joda.time.Period period11 = period8.plusMonths(2);
        org.joda.time.Period period13 = period11.withSeconds(53);
        org.joda.time.Period period15 = period11.withSeconds(999);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType17 = period11.getFieldType(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfDay();
        boolean boolean8 = dateTimeField7.isLenient();
        long long10 = dateTimeField7.roundCeiling((long) 32770);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((java.lang.Object) dateTimeField7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.field.ZeroIsMaxDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        boolean boolean9 = dateTimeZone7.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter5.withZone(dateTimeZone7);
        java.util.Locale locale12 = dateTimeFormatter11.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter11.print((long) (-1027049));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(locale12);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        java.util.Date date1 = dateTime0.toDate();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        java.lang.String str7 = localDate6.toString();
        org.joda.time.LocalDate localDate9 = localDate6.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight2.withFields((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int12 = localDate9.indexOf(dateTimeFieldType11);
        int int13 = dateTime0.get(dateTimeFieldType11);
        org.joda.time.DateTime dateTime15 = dateTime0.plusWeeks(904);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime0.withHourOfDay(53669143);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53669143 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Feb 21 14:54:39 UTC 2022");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        int int9 = localDateTime3.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53679468 + "'", int5 == 53679468);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial8 = null;
        org.joda.time.Instant instant11 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableDuration20, readableInstant21, periodType22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        mutablePeriod23.add(readableDuration24);
        mutablePeriod23.addYears((int) (short) 100);
        java.lang.Object obj28 = mutablePeriod23.clone();
        mutablePeriod23.setSeconds(904);
        org.joda.time.LocalDate localDate31 = localDate18.minus((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfEra();
        java.util.Locale locale33 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str34 = property32.getAsShortText(locale33);
        org.joda.time.LocalDate localDate35 = property32.roundHalfEvenCopy();
        int[] intArray37 = chronology12.get((org.joda.time.ReadablePartial) localDate35, (long) 773);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) (short) 1, chronology40);
        java.lang.String str42 = localDate41.toString();
        org.joda.time.LocalDate localDate44 = localDate41.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology45 = localDate44.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.eras();
        org.joda.time.DateTimeField dateTimeField47 = chronology45.year();
        long long50 = dateTimeField47.getDifferenceAsLong((long) 53620972, (long) ' ');
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) (short) 1, chronology52);
        java.lang.String str54 = localDate53.toString();
        org.joda.time.LocalDate.Property property55 = localDate53.year();
        int int56 = dateTimeField47.getMinimumValue((org.joda.time.ReadablePartial) localDate53);
        int int57 = dateTimeField47.getMaximumValue();
        long long59 = dateTimeField47.roundHalfCeiling(53634384000L);
        java.util.Locale locale61 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.Character> charSet62 = locale61.getExtensionKeys();
        java.lang.String str63 = dateTimeField47.getAsShortText((long) (-1), locale61);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray64 = dateTimeField7.set(readablePartial8, 53643303, intArray37, "2022-02-21T14:53:56.547", locale61);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:53:56.547\" for clockhourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "P100YT904S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "P100YT904S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "P100YT904S");
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1" + "'", str34, "1");
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1970, 1, 1]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-01" + "'", str42, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1970-01-01" + "'", str54, "1970-01-01");
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-292275054) + "'", int56 == (-292275054));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 292278993 + "'", int57 == 292278993);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 63072000000L + "'", long59 == 63072000000L);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1969" + "'", str63, "1969");
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableDuration7, readableInstant8, periodType9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutablePeriod10.add(readableDuration11);
        mutablePeriod10.addYears((int) (short) 100);
        java.lang.Object obj15 = mutablePeriod10.clone();
        mutablePeriod10.setSeconds(904);
        org.joda.time.LocalDate localDate18 = localDate5.minus((org.joda.time.ReadablePeriod) mutablePeriod10);
        int int19 = localDate5.getYearOfEra();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime21.copy();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        mutableDateTime22.setZone(dateTimeZone23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime22.minuteOfDay();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime29 = dateTime26.withFieldAdded(durationFieldType27, (int) (byte) 0);
        mutableDateTime22.add(durationFieldType27, 8);
        boolean boolean32 = localDate5.isSupported(durationFieldType27);
        java.util.Locale locale34 = java.util.Locale.FRENCH;
        java.lang.String str35 = locale34.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = localDate5.toString("2022-02-21T14:54:21.016Z", locale34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "P100YT904S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "P100YT904S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "P100YT904S");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str7 = locale5.getExtension('a');
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.util.Locale locale9 = java.util.Locale.JAPANESE;
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale8.getDisplayLanguage(locale9);
        java.lang.String str12 = locale5.getDisplayLanguage(locale9);
        java.util.Locale.setDefault(locale9);
        java.lang.String str14 = locale9.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap15 = calendar0.getDisplayNames(503, 6, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455279639,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=39,MILLISECOND=639,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str11, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u8a9e" + "'", str12, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int1 = calendar0.getWeekYear();
        calendar0.setTimeInMillis((long) 199);
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.add(53649515, 53673356);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=199,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=199,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2022 + "'", int1 == 2022);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.lang.String str8 = durationField7.toString();
        java.lang.String str9 = durationField7.toString();
        org.joda.time.DurationFieldType durationFieldType10 = durationField7.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = durationField7.getMillis(53626518);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnsupportedDurationField[eras]" + "'", str8, "UnsupportedDurationField[eras]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnsupportedDurationField[eras]" + "'", str9, "UnsupportedDurationField[eras]");
        org.junit.Assert.assertNotNull(durationFieldType10);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime3.withWeekyear((int) (short) -1);
        java.lang.String str12 = localDateTime11.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53680252 + "'", int5 == 53680252);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-0001-02-22T14:54:40.252" + "'", str12, "-0001-02-22T14:54:40.252");
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight11 = property9.addWrapFieldToCopy(873);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plusDays((-1));
        org.joda.time.MutableDateTime mutableDateTime14 = dateMidnight11.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.millisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Calendar.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.lang.String str6 = locale5.getCountry();
        java.util.Calendar.Builder builder7 = builder4.setLocale(locale5);
        java.util.Calendar.Builder builder12 = builder4.setTimeOfDay(339, 53618333, 2022, 2);
        org.joda.time.tz.NameProvider nameProvider13 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str17 = nameProvider13.getName(locale14, "DateTimeField[dayOfMonth]", "CA");
        java.util.Calendar.Builder builder18 = builder12.setLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder21 = builder12.setWeekDefinition(53660145, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IT" + "'", str6, "IT");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(nameProvider13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        long long6 = property5.remainder();
        org.joda.time.MutableDateTime mutableDateTime8 = property5.set(842);
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str12 = locale10.getExtension('a');
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        java.lang.String str15 = locale14.getDisplayCountry();
        java.lang.String str16 = locale13.getDisplayLanguage(locale14);
        java.lang.String str17 = locale10.getDisplayLanguage(locale14);
        java.lang.String str18 = locale10.getScript();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime19 = property5.set("2124-02-04T03:57:35.964Z", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2124-02-04T03:57:35.964Z\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 40457L + "'", long6 == 40457L);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str16, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u82f1\u8a9e" + "'", str17, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight11.withField(dateTimeFieldType20, 842);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay8.property(dateTimeFieldType20);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay8.monthOfYear();
        int[] intArray25 = yearMonthDay8.getValues();
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone27 = dateMidnight26.getZone();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) (short) 1, chronology29);
        java.lang.String str31 = localDate30.toString();
        org.joda.time.LocalDate localDate33 = localDate30.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight26.withFields((org.joda.time.ReadablePartial) localDate33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int36 = localDate33.indexOf(dateTimeFieldType35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property37 = yearMonthDay8.property(dateTimeFieldType35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01" + "'", str31, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(8);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear(53632583);
        java.io.Writer writer12 = null;
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology14);
        int int16 = mutableDateTime15.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone18 = dateMidnight17.getZone();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        mutableDateTime15.setZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj13, dateTimeZone18);
        org.joda.time.DateTime.Property property22 = dateTime21.secondOfMinute();
        org.joda.time.DateTime dateTime24 = dateTime21.plusMonths(53617440);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(writer12, (org.joda.time.ReadableInstant) dateTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 692 + "'", int16 == 692);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        boolean boolean3 = strSet1.isEmpty();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis((-27422466L));
        boolean boolean7 = strSet1.remove((java.lang.Object) instant4);
        org.joda.time.MutableDateTime mutableDateTime8 = instant4.toMutableDateTime();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 100, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        org.joda.time.Duration duration15 = period11.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.Instant instant16 = instant4.plus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Instant instant17 = instant4.toInstant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(instant17);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer4, 1674000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withCenturyOfEra(1);
        org.joda.time.DateTime dateTime3 = dateMidnight2.toDateTime();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 53619248, (long) 1);
        mutablePeriod6.add((int) (byte) 10, 904, 53619708, 47, 10, (-292275054), 0, 342);
        int int16 = mutablePeriod6.size();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight2.minus((org.joda.time.ReadablePeriod) mutablePeriod6);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = mutablePeriod6.getValue(53620623);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53620623");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(dateMidnight17);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight11.withField(dateTimeFieldType20, 842);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay8.property(dateTimeFieldType20);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay8.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay26 = property24.addWrapFieldToCopy(15);
        org.joda.time.DurationField durationField27 = property24.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property24.getFieldType();
        org.joda.time.YearMonthDay yearMonthDay30 = property24.addWrapFieldToCopy((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay32 = property24.setCopy("54");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"54\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(yearMonthDay30);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime2.withEra(34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 342, 47541L, periodType2);
        org.joda.time.Period period5 = period3.minusWeeks(11);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = period3.getValue(904);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 904");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        java.lang.Object obj0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(obj0);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.lang.String str8 = durationField7.toString();
        java.lang.String str9 = durationField7.toString();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 1, chronology12);
        java.lang.String str14 = localDate13.toString();
        org.joda.time.LocalDate localDate16 = localDate13.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) 1, chronology17);
        org.joda.time.DurationField durationField19 = chronology17.weekyears();
        int int20 = durationField7.compareTo(durationField19);
        boolean boolean21 = durationField7.isPrecise();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnsupportedDurationField[eras]" + "'", str8, "UnsupportedDurationField[eras]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnsupportedDurationField[eras]" + "'", str9, "UnsupportedDurationField[eras]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(periodType9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) periodType9, dateTimeZone11);
        int int13 = localDateTime12.getDayOfMonth();
        int int14 = localDateTime12.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.millisOfSecond();
        int int16 = localDateTime12.getEra();
        org.joda.time.LocalDateTime.Property property17 = localDateTime12.era();
        org.joda.time.LocalDateTime.Property property18 = localDateTime12.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyear();
        int int20 = localDateTime12.get(dateTimeFieldType19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime3.property(dateTimeFieldType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime3.withMinuteOfHour((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53681279 + "'", int5 == 53681279);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 21 + "'", int13 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53681279 + "'", int14 == 53681279);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.year();
        mutableDateTime2.setChronology(chronology12);
        mutableDateTime2.setDate((long) 53626727);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = mutableDateTime2.toString("2022-02-21T14:53:45.309");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime4 = localTime0.withFields((org.joda.time.ReadablePartial) localTime3);
        java.lang.String str5 = localTime0.toString();
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(periodType6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) periodType6, dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusYears((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "14:54:41.398" + "'", str5, "14:54:41.398");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 100, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.copy();
        org.joda.time.Duration duration17 = period13.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight8.plus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Instant instant19 = dateMidnight18.toInstant();
        org.joda.time.Instant instant21 = instant19.minus(12248L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant21);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        java.lang.String str7 = property5.getName();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "minuteOfDay" + "'", str7, "minuteOfDay");
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 14, chronology7);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = chronology7.getDateTimeMillis(53627306, 894, 53635576, 53662339);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 894 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(53618195, 53657228, 53617440, 696);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53618195 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        boolean boolean6 = dateTimeFormatter2.isParser();
        int int7 = dateTimeFormatter2.getDefaultYear();
        java.lang.Appendable appendable8 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        java.lang.String str13 = localDate12.toString();
        org.joda.time.LocalDate localDate15 = localDate12.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay((long) (short) 1, chronology16);
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay17.plusMonths(53617719);
        int int20 = yearMonthDay17.getDayOfMonth();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (short) 1, chronology22);
        java.lang.String str24 = localDate23.toString();
        org.joda.time.LocalDate localDate26 = localDate23.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay17.withChronologyRetainFields(chronology27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(readableDuration31, readableInstant32, periodType33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        mutablePeriod34.add(readableDuration35);
        mutablePeriod34.addMonths((int) '#');
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) (short) 1, chronology40);
        int int42 = localDate41.getDayOfYear();
        org.joda.time.LocalTime localTime43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDate41.toDateTime(localTime43, dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = localDate41.toDateMidnight(dateTimeZone46);
        org.joda.time.DateMidnight.Property property48 = dateMidnight47.yearOfEra();
        int int49 = dateMidnight47.getMinuteOfHour();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) (byte) 100, chronology51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(chronology53);
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime54.copy();
        org.joda.time.Duration duration56 = period52.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime55);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight47.plus((org.joda.time.ReadableDuration) duration56);
        mutablePeriod34.add((org.joda.time.ReadableDuration) duration56);
        org.joda.time.PeriodType periodType59 = org.joda.time.PeriodType.years();
        java.lang.String str60 = periodType59.getName();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(periodType59);
        org.joda.time.PeriodType periodType62 = periodType59.withYearsRemoved();
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant30, (org.joda.time.ReadableDuration) duration56, periodType62);
        org.joda.time.YearMonthDay yearMonthDay65 = yearMonthDay17.withPeriodAdded((org.joda.time.ReadablePeriod) period63, (int) (byte) 0);
        java.lang.String str66 = yearMonthDay17.toString();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetMillis(53619988);
        java.lang.String str69 = dateTimeZone68.toString();
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate(dateTimeZone68);
        org.joda.time.DateTime dateTime71 = yearMonthDay17.toDateTimeAtMidnight(dateTimeZone68);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable8, (org.joda.time.ReadablePartial) yearMonthDay17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(dateMidnight57);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Years" + "'", str60, "Years");
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(yearMonthDay65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "1970-01-01" + "'", str66, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "+14:53:39.988" + "'", str69, "+14:53:39.988");
        org.junit.Assert.assertNotNull(dateTime71);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableDuration10, readableInstant11, periodType12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutablePeriod13.add(readableDuration14);
        mutablePeriod13.addYears((int) (short) 100);
        java.lang.Object obj18 = mutablePeriod13.clone();
        mutablePeriod13.setSeconds(904);
        org.joda.time.LocalDate localDate21 = localDate8.minus((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfEra();
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = property22.getAsShortText(locale23);
        org.joda.time.LocalDate localDate25 = property22.roundHalfEvenCopy();
        int[] intArray27 = chronology2.get((org.joda.time.ReadablePartial) localDate25, (long) 773);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray28 = localDate25.getFieldTypes();
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "P100YT904S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "P100YT904S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "P100YT904S");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1970, 1, 1]");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray28);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int1 = calendar0.getWeekYear();
        calendar0.setTimeInMillis((long) 199);
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.setFirstDayOfWeek(53620623);
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromCalendarFields(calendar5);
        calendar5.setLenient(true);
        int int12 = calendar5.getMaximum(11);
        int int13 = calendar0.compareTo(calendar5);
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=199,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=199,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2022 + "'", int1 == 2022);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645455282416,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=42,MILLISECOND=416,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 23 + "'", int12 == 23);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 53619770);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        int int1 = mutablePeriod0.getWeeks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.parse("2022-02-21T14:54:32.215Z", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate.Property property9 = localDate7.monthOfYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) 100, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.copy();
        org.joda.time.Duration duration16 = period12.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime15);
        int int17 = period12.size();
        org.joda.time.Period period19 = period12.withWeeks(842);
        org.joda.time.DurationFieldType[] durationFieldTypeArray20 = period12.getFieldTypes();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (byte) 100, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime25.copy();
        org.joda.time.Duration duration27 = period23.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime26);
        int int28 = period23.size();
        org.joda.time.Period period30 = period23.withWeeks(842);
        org.joda.time.DurationFieldType[] durationFieldTypeArray31 = period23.getFieldTypes();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime33.copy();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        mutableDateTime34.setZone(dateTimeZone35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (short) 1, chronology38);
        int int40 = localDate39.getDayOfYear();
        org.joda.time.LocalTime localTime41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = localDate39.toDateTime(localTime41, dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateMidnight dateMidnight45 = localDate39.toDateMidnight(dateTimeZone44);
        org.joda.time.DateMidnight.Property property46 = dateMidnight45.yearOfEra();
        int int47 = dateMidnight45.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property48 = dateMidnight45.year();
        boolean boolean49 = mutableDateTime34.isBefore((org.joda.time.ReadableInstant) dateMidnight45);
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.time();
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DurationFieldType durationFieldType53 = org.joda.time.DurationFieldType.hours();
        mutableDateTime52.add(durationFieldType53, (int) (byte) 0);
        int int56 = periodType50.indexOf(durationFieldType53);
        mutableDateTime34.add(durationFieldType53, 0);
        boolean boolean59 = period23.isSupported(durationFieldType53);
        int int60 = period12.get(durationFieldType53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate62 = localDate7.withFieldAdded(durationFieldType53, 598);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hours' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldTypeArray20);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(durationFieldTypeArray31);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        mutablePeriod3.setMillis(0);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) (byte) 100, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime10.copy();
        org.joda.time.Duration duration12 = period8.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((-1), 53620134, (int) (byte) -1, 53617719, (int) (byte) 100, 53619079, 1, 53);
        org.joda.time.Period period22 = period8.minus((org.joda.time.ReadablePeriod) mutablePeriod21);
        org.joda.time.Period period23 = period22.normalizedStandard();
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) period23);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone26 = dateMidnight25.getZone();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 1, chronology28);
        java.lang.String str30 = localDate29.toString();
        org.joda.time.LocalDate localDate32 = localDate29.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight25.withFields((org.joda.time.ReadablePartial) localDate32);
        org.joda.time.DateMidnight.Property property34 = dateMidnight33.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight36 = property34.addWrapFieldToCopy(873);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.plusDays((-1));
        org.joda.time.Duration duration39 = period23.toDurationTo((org.joda.time.ReadableInstant) dateMidnight36);
        org.joda.time.Period period41 = period23.withDays(50);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01" + "'", str30, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period41);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = calendar0.getMinimum(53681645);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53681645");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455283620,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=43,MILLISECOND=620,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.LocalTime localTime6 = property1.addWrapFieldToCopy(53618195);
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str9 = locale7.getExtension('a');
        int int10 = property1.getMaximumShortTextLength(locale7);
        java.lang.String str11 = locale7.toString();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27422465L) + "'", long4 == (-27422465L));
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en_CA" + "'", str11, "en_CA");
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 32770);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime1.withSecondOfMinute(53621101);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53621101 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusYears((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfEra(47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField11 = localDateTime9.getField(305);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 305");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.minusDays(465);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears(53618165);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime11.withWeekOfWeekyear(53657187);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53657187 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight12 = dateMidnight8.withDayOfYear(53678034);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53678034 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(8);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withDefaultYear(53639477);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withOffsetParsed();
        java.lang.Appendable appendable13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology14);
        mutableDateTime15.addMinutes(904);
        int int18 = mutableDateTime15.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(appendable13, (org.joda.time.ReadableInstant) mutableDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        java.io.Writer writer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) (byte) 100, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.copy();
        org.joda.time.Duration duration13 = period9.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime17 = property14.addWrapField(53629078);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer6, (org.joda.time.ReadableInstant) mutableDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        boolean boolean6 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withDefaultYear(53656631);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(periodType10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) periodType10, dateTimeZone12);
        int int14 = localDateTime13.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withWeekyear(35);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withWeekyear(10);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer9, (org.joda.time.ReadablePartial) localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 21 + "'", int14 == 21);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((-53617748), 32770, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(53655084, 53680252, 34, 53655716, 53673356, 24, 305, 53639426);
        mutablePeriod8.setMonths(591);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("yearOfEra", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        boolean boolean9 = dateTimeZone7.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter5.withZone(dateTimeZone7);
        boolean boolean12 = dateTimeFormatter5.isPrinter();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 1, chronology18);
        java.lang.String str20 = localDate19.toString();
        org.joda.time.LocalDate localDate22 = localDate19.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.eras();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology23);
        boolean boolean26 = dateTimeFieldType13.isSupported(chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter5.withChronology(chronology23);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) (short) 1, chronology31);
        java.lang.String str33 = localDate32.toString();
        org.joda.time.LocalDate localDate35 = localDate32.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.yearOfEra();
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType29.getField(chronology36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) (byte) 100, chronology40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime43.copy();
        org.joda.time.Duration duration45 = period41.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime44);
        org.joda.time.Period period47 = period41.plusDays((int) (byte) 10);
        int int48 = period47.getHours();
        org.joda.time.Period period50 = period47.plusMonths(2);
        org.joda.time.Period period52 = period47.minusMonths(12);
        org.joda.time.Period period54 = period47.withYears(2057);
        int[] intArray56 = chronology36.get((org.joda.time.ReadablePeriod) period54, 259200000L);
        org.joda.time.YearMonthDay yearMonthDay57 = new org.joda.time.YearMonthDay((long) 1970, chronology36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeFormatter27, chronology36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.format.DateTimeFormatter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01" + "'", str33, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[0, 0, 0, 3, 0, 0, 0, 0]");
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = calendar0.getMinimum(662);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 662");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455287011,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=47,MILLISECOND=11,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.lang.String str8 = durationField7.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = durationField7.getValueAsLong((long) 53618333, (long) 53633398);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnsupportedDurationField[eras]" + "'", str8, "UnsupportedDurationField[eras]");
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = property1.addCopy((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = property1.setCopy(53637942);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53637942 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        mutableDateTime1.addMinutes(904);
        int int4 = mutableDateTime1.getYearOfCentury();
        mutableDateTime1.addHours(3);
        mutableDateTime1.setWeekyear(53619988);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfWeek((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone4 = dateMidnight3.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone4);
        org.joda.time.DateTime dateTime8 = dateTime6.minusWeeks(736);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((-59011459199999L));
        int int11 = dateTime10.getSecondOfDay();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53687 + "'", int11 == 53687);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        calendar0.set(4, 53637942);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        int int9 = localDate8.getDayOfYear();
        org.joda.time.LocalTime localTime10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate8.toDateTime(localTime10, dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = localDate8.toDateMidnight(dateTimeZone13);
        org.joda.time.DateMidnight.Property property15 = dateMidnight14.yearOfEra();
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone17 = dateMidnight16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = dateMidnight14.toMutableDateTime(dateTimeZone17);
        mutableDateTime18.addMillis(54);
        mutableDateTime18.setYear(22);
        boolean boolean23 = calendar0.equals((java.lang.Object) 22);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=53637942,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=47,MILLISECOND=252,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronolgy();
        boolean boolean5 = dateTimeFormatter3.isOffsetParsed();
        java.util.Locale locale6 = java.util.Locale.TAIWAN;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.parse("2022-02-21T14:54:30.039", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutablePeriod3.add(readableDuration4);
        mutablePeriod3.addSeconds(53617440);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        java.lang.String str15 = localDate14.toString();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.eras();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology18);
        org.joda.time.DateTimeField dateTimeField21 = chronology18.year();
        mutablePeriod3.setPeriod((long) 53618333, chronology18);
        mutablePeriod3.setSeconds(53653452);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        int int4 = calendar0.getWeeksInWeekYear();
        calendar0.setTimeInMillis((long) (-144832));
        calendar0.roll(53656402, (int) (byte) 0);
        java.util.TimeZone timeZone10 = calendar0.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = calendar0.getActualMinimum(598);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 598");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-144832,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=57,SECOND=35,MILLISECOND=168,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(185, 53628335, 736, 53649572, 53649612, 342);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53649572 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 53627306);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime();
        org.joda.time.DateTime dateTime3 = localDate1.toDateTime(localTime2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour(283);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 283 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundHalfCeilingCopy();
        org.joda.time.LocalTime.Property property3 = localTime2.millisOfSecond();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        int int7 = localDate6.getDayOfYear();
        org.joda.time.LocalTime localTime8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate6.toDateTime(localTime8, dateTimeZone9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime12.copy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        mutableDateTime13.setZone(dateTimeZone14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.minuteOfDay();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime20 = dateTime17.withFieldAdded(durationFieldType18, (int) (byte) 0);
        mutableDateTime13.add(durationFieldType18, 8);
        org.joda.time.LocalDate localDate24 = localDate6.withFieldAdded(durationFieldType18, 3);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (short) 1, chronology26);
        int int28 = localDate27.getDayOfYear();
        org.joda.time.LocalTime localTime29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate27.toDateTime(localTime29, dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = localDate27.toDateMidnight(dateTimeZone32);
        org.joda.time.LocalDate localDate35 = localDate27.withYear(53619770);
        int int36 = localDate6.compareTo((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate localDate38 = localDate27.plusDays(1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = localTime2.compareTo((org.joda.time.ReadablePartial) localDate38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(localDate38);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("4470113-04-01");
        boolean boolean2 = timeZone1.observesDaylightTime();
        int int3 = timeZone1.getRawOffset();
        int int4 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) '4');
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        java.lang.String str3 = periodType2.getName();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(periodType2);
        org.joda.time.Period period5 = period1.plus((org.joda.time.ReadablePeriod) mutablePeriod4);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod4.setHours(53666646);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Years" + "'", str3, "Years");
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        boolean boolean6 = dateTimeFormatter2.isParser();
        int int7 = dateTimeFormatter2.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = dateTimeFormatter2.parseLocalTime("53617440-02-21T14:53:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.copy();
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight10.getZone();
        mutableDateTime8.setZoneRetainFields(dateTimeZone11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.copy();
        mutableDateTime14.addMinutes(0);
        mutableDateTime14.setSecondOfDay(21);
        org.joda.time.Chronology chronology20 = null;
        mutableDateTime14.setChronology(chronology20);
        mutableDateTime14.setMinuteOfHour((int) (short) 0);
        mutableDateTime14.addMinutes((int) (byte) 1);
        int int26 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) mutableDateTime14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(651, (int) (short) -1, 53620134, (int) (byte) 100, 53673313, 53679656, 763, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        org.joda.time.MutableDateTime mutableDateTime9 = property5.add(410);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.days();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (short) 1, chronology12);
        int int14 = localDate13.getDayOfYear();
        org.joda.time.LocalTime localTime15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate13.toDateTime(localTime15, dateTimeZone16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime19.copy();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        mutableDateTime20.setZone(dateTimeZone21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime20.minuteOfDay();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime27 = dateTime24.withFieldAdded(durationFieldType25, (int) (byte) 0);
        mutableDateTime20.add(durationFieldType25, 8);
        org.joda.time.LocalDate localDate31 = localDate13.withFieldAdded(durationFieldType25, 3);
        int int32 = periodType10.indexOf(durationFieldType25);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.add(durationFieldType25, 53668698);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 5366869800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate.Property property4 = localDate2.year();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate.Property property9 = localDate7.year();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        java.lang.String str13 = localDate12.toString();
        org.joda.time.LocalDate.Property property14 = localDate12.year();
        org.joda.time.Period period15 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate12);
        org.joda.time.Days days16 = period15.toStandardDays();
        org.joda.time.LocalDate localDate17 = localDate2.minus((org.joda.time.ReadablePeriod) days16);
        org.joda.time.LocalDate.Property property18 = localDate17.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = localDate17.toString("2022-02-21T14:53:45.309");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalDate.Property property4 = localDate2.yearOfEra();
        org.joda.time.LocalDate localDate6 = property4.addWrapFieldToCopy(773);
        org.joda.time.LocalDate localDate7 = property4.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate7.withDayOfYear(53617649);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53617649 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = property9.addToCopy((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusDays(904);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.plusDays(53634467);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusMonths(792);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        int int19 = localDate18.getDayOfWeek();
        org.joda.time.LocalDate localDate21 = localDate18.minusDays((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDate21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53688959 + "'", int5 == 53688959);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "IT");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("1970");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setLanguageTag("Property[yearOfEra]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Property[yearOfEra] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.joda.time.DateTime dateTime10 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra(53617440);
        org.joda.time.DateTime.Property property13 = dateTime10.secondOfDay();
        org.joda.time.DateTime dateTime15 = dateTime10.plusMillis(53617891);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTime10.toString("2022-02-21T14:54:48.412Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutablePeriod3.add(readableDuration4);
        mutablePeriod3.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(readableDuration8, readableInstant9, periodType10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutablePeriod11.add(readableDuration12);
        mutablePeriod11.addMonths((int) '#');
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod11);
        int int17 = mutablePeriod3.getYears();
        mutablePeriod3.setPeriod(28, 53666419, 999, 4, 53619708, 53633398, (-1), 53617440);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        int int11 = yearMonthDay8.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType13 = yearMonthDay8.getFieldType(53619988);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53619988");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(53628335, 53641106, 1870, 42, (int) 'x', 42, 53638166);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = property1.addCopy((long) (short) -1);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.withMaximumValue();
        org.joda.time.LocalTime localTime6 = property4.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property4.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay((int) ' ', 53617440, 3, 53617649);
        java.util.Calendar.Builder builder12 = builder7.setTimeOfDay(53626727, 0, 53628444, (int) ' ');
        java.util.Calendar.Builder builder16 = builder12.setDate(4, 70, 53);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        java.util.Date date18 = dateTime17.toDate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder19 = builder16.setInstant(date18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Mon Feb 21 14:54:49 UTC 2022");
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime3 = dateTime0.withFieldAdded(durationFieldType1, (int) (byte) 0);
        org.joda.time.DateTime.Property property4 = dateTime0.yearOfEra();
        org.joda.time.DateTime dateTime6 = property4.addToCopy(12);
        boolean boolean7 = dateTime6.isEqualNow();
        int int8 = dateTime6.getSecondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime6.withTime(0, (int) (byte) -1, 780, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53689 + "'", int8 == 53689);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.dayOfMonth();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        java.lang.String str13 = localDate12.toString();
        org.joda.time.LocalDate localDate15 = localDate12.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfEra();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight8.withChronology(chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.withMonthOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateMidnight18);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((-292275054), 53644667, 42, 18, 92, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 92 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime2 = instant0.toDateTime();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.plusYears(53619079);
        int int4 = dateMidnight3.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withEra((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53621101 + "'", int4 == 53621101);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Date date1 = calendar0.getTime();
        int int3 = calendar0.getLeastMaximum(0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = calendar0.getMaximum(96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455289748,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=49,MILLISECOND=748,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Feb 21 14:54:49 UTC 2022");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology6);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.setSecondOfDay(53663393);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53663393 for secondOfDay must be in the range [0,86399]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.DateMidnight.Property property5 = dateMidnight2.dayOfWeek();
        int int6 = property5.getMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight8 = property5.setCopy("53617440-02-21T14:53:00.000Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"53617440-02-21T14:53:00.000Z\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27422465L) + "'", long4 == (-27422465L));
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("2022-02-21T14:53:56.547");
        org.junit.Assert.assertNotNull(dateTime1);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableDuration9, readableInstant10, periodType11);
        mutablePeriod12.setMillis(0);
        org.joda.time.LocalDate localDate15 = localDate7.plus((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.LocalDate localDate17 = localDate15.withWeekyear((int) ' ');
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone19 = dateMidnight18.getZone();
        boolean boolean21 = dateTimeZone19.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone19);
        org.joda.time.DateTime dateTime23 = localDate15.toDateTimeAtStartOfDay(dateTimeZone19);
        java.lang.String str24 = localDate15.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate26 = localDate15.withDayOfYear(53668698);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53668698 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0100-01-01" + "'", str24, "0100-01-01");
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        org.joda.time.Instant instant5 = org.joda.time.Instant.parse("2022-02-21T14:53:37.096Z");
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(999, 53642062, 53669651, 53668698, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.Chronology chronology5 = localDateTime3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime3.withTime(5, 20, 53677363, 47);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53677363 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        boolean boolean9 = dateTimeZone7.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter5.withZone(dateTimeZone7);
        org.joda.time.Chronology chronology12 = dateTimeFormatter5.getChronolgy();
        java.io.Writer writer13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property15 = localTime14.minuteOfHour();
        org.joda.time.LocalTime localTime17 = localTime14.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localTime14.toDateTimeToday(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusMonths(10);
        org.joda.time.DateTime.Property property22 = dateTime19.minuteOfDay();
        org.joda.time.DateTime dateTime23 = property22.getDateTime();
        org.joda.time.DateTime dateTime24 = property22.roundFloorCopy();
        org.joda.time.DateTime dateTime26 = dateTime24.withYearOfEra(53617440);
        java.lang.String str27 = dateTime26.toString();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(writer13, (org.joda.time.ReadableInstant) dateTime26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "53617440-02-21T14:54:00.000Z" + "'", str27, "53617440-02-21T14:54:00.000Z");
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(339, 53617719, 4468419);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 339 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.copy();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone10 = dateMidnight9.getZone();
        mutableDateTime7.setZoneRetainFields(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = localDateTime3.toDateTime(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime13.withMonthOfYear(999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property6 = localDate2.weekOfWeekyear();
        org.joda.time.DateTime dateTime7 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate9 = localDate2.plusDays(53632583);
        org.joda.time.DateMidnight dateMidnight10 = localDate2.toDateMidnight();
        int int11 = dateMidnight10.getHourOfDay();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        java.lang.Object obj0 = null;
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(obj0);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds(53619708);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) (byte) 100, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.copy();
        org.joda.time.Duration duration10 = period6.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.Period period12 = period6.plusDays((int) (byte) 10);
        int int13 = period12.getHours();
        org.joda.time.Period period15 = period12.plusMonths(2);
        org.joda.time.Period period17 = period15.withSeconds(53);
        org.joda.time.Period period19 = period15.withSeconds(999);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime21.copy();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        mutableDateTime22.setZone(dateTimeZone23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime22.minuteOfDay();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime29 = dateTime26.withFieldAdded(durationFieldType27, (int) (byte) 0);
        mutableDateTime22.add(durationFieldType27, 8);
        int int32 = period19.indexOf(durationFieldType27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay34 = timeOfDay3.withFieldAdded(durationFieldType27, 53664);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuries' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(53619988);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate5 = localDate3.minusYears(53664756);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate5.withCenturyOfEra(53618165);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53618165 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+14:53:39.988" + "'", str2, "+14:53:39.988");
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        int int11 = yearMonthDay8.getDayOfMonth();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        java.lang.String str15 = localDate14.toString();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay8.withChronologyRetainFields(chronology18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(readableDuration22, readableInstant23, periodType24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        mutablePeriod25.add(readableDuration26);
        mutablePeriod25.addMonths((int) '#');
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) (short) 1, chronology31);
        int int33 = localDate32.getDayOfYear();
        org.joda.time.LocalTime localTime34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localDate32.toDateTime(localTime34, dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = localDate32.toDateMidnight(dateTimeZone37);
        org.joda.time.DateMidnight.Property property39 = dateMidnight38.yearOfEra();
        int int40 = dateMidnight38.getMinuteOfHour();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) 100, chronology42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(chronology44);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime45.copy();
        org.joda.time.Duration duration47 = period43.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime46);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight38.plus((org.joda.time.ReadableDuration) duration47);
        mutablePeriod25.add((org.joda.time.ReadableDuration) duration47);
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.years();
        java.lang.String str51 = periodType50.getName();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(periodType50);
        org.joda.time.PeriodType periodType53 = periodType50.withYearsRemoved();
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant21, (org.joda.time.ReadableDuration) duration47, periodType53);
        org.joda.time.YearMonthDay yearMonthDay56 = yearMonthDay8.withPeriodAdded((org.joda.time.ReadablePeriod) period54, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType58 = yearMonthDay56.getFieldType(53651369);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53651369");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Years" + "'", str51, "Years");
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(yearMonthDay56);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.year();
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.lang.String str16 = locale14.getExtension('a');
        java.lang.String str17 = dateTimeField12.getAsText((long) 53617440, locale14);
        int int19 = dateTimeField12.get((long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_CA");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970" + "'", str17, "1970");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(periodType11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) periodType11, dateTimeZone13);
        int int15 = localDateTime14.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property16.getFieldType();
        org.joda.time.LocalDateTime localDateTime18 = property16.roundCeilingCopy();
        java.util.Calendar.Builder builder19 = new java.util.Calendar.Builder();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) (byte) 100, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime24.copy();
        org.joda.time.Duration duration26 = period22.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime25);
        int int27 = period22.size();
        org.joda.time.Period period29 = period22.plusHours(53619079);
        org.joda.time.Period period31 = period22.plusWeeks(773);
        int[] intArray32 = period22.getValues();
        java.util.Calendar.Builder builder33 = builder19.setFields(intArray32);
        // The following exception was thrown during execution in test generation
        try {
            chronology7.validate((org.joda.time.ReadablePartial) localDateTime18, intArray32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        java.util.Date date0 = new java.util.Date();
        java.lang.Object obj1 = date0.clone();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 14:54:50 UTC 2022");
        org.junit.Assert.assertNotNull(obj1);
// flaky:         org.junit.Assert.assertEquals(obj1.toString(), "Mon Feb 21 14:54:50 UTC 2022");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Mon Feb 21 14:54:50 UTC 2022");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Mon Feb 21 14:54:50 UTC 2022");
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getHourOfDay();
        org.joda.time.LocalTime localTime3 = localTime0.plusHours((int) (short) 1);
        org.joda.time.LocalTime localTime5 = localTime0.minusMillis(718);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime5.withSecondOfMinute(53642637);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53642637 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime3 = dateTime0.withFieldAdded(durationFieldType1, (int) (byte) 0);
        org.joda.time.DateTime.Property property4 = dateTime0.era();
        org.joda.time.DateTime dateTime5 = property4.withMinimumValue();
        org.joda.time.DateTime dateTime6 = property4.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime6.withDayOfYear(53656199);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53656199 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "IT");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("1970");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("0100-01-01");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 0100-01-01 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = dateTimeFormatter5.parseLocalTime("\u6708");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(53636, (-1027049), 53661484, 52, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.dayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 53619248, (long) 1);
        int[] intArray17 = chronology7.get((org.joda.time.ReadablePeriod) mutablePeriod14, (long) (-292275054), (long) 53637942);
        org.joda.time.DateTimeField dateTimeField18 = chronology7.hourOfHalfday();
        java.util.Locale locale21 = java.util.Locale.CANADA;
        java.lang.String str23 = locale21.getExtension('a');
        java.util.Locale locale24 = java.util.Locale.ITALY;
        java.util.Locale locale25 = java.util.Locale.JAPANESE;
        java.lang.String str26 = locale25.getDisplayCountry();
        java.lang.String str27 = locale24.getDisplayLanguage(locale25);
        java.lang.String str28 = locale21.getDisplayLanguage(locale25);
        java.util.Locale.setDefault(locale25);
        java.lang.String str30 = locale25.getScript();
        // The following exception was thrown during execution in test generation
        try {
            long long31 = dateTimeField18.set((long) 53663393, "2022-02-21T14:54:46.960", locale25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:54:46.960\" for hourOfHalfday is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 4, 0, 5, 12, 996]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str27, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u82f1\u8a9e" + "'", str28, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate2.withField(dateTimeFieldType4, 523);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.year();
        long long11 = dateTimeField8.getDifferenceAsLong((long) 53620972, (long) ' ');
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        java.lang.String str15 = localDate14.toString();
        org.joda.time.LocalDate.Property property16 = localDate14.year();
        int int17 = dateTimeField8.getMinimumValue((org.joda.time.ReadablePartial) localDate14);
        int int18 = dateTimeField8.getMaximumValue();
        boolean boolean20 = dateTimeField8.isLeap((-53617648264L));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-292275054) + "'", int17 == (-292275054));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 292278993 + "'", int18 == 292278993);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        java.lang.String str10 = localDate9.toString();
        org.joda.time.LocalDate localDate12 = localDate9.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.eras();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.year();
        java.lang.String str17 = chronology13.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(16, 53626705, 53632562, 53646596, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626705 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ISOChronology[UTC]" + "'", str17, "ISOChronology[UTC]");
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.DateTimeField dateTimeField16 = chronology12.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(19, 10, 0, 53649572, (int) 'a', 763, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53649572 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate2.minusMonths((int) (byte) 1);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.time();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.hours();
        mutableDateTime13.add(durationFieldType14, (int) (byte) 0);
        int int17 = periodType11.indexOf(durationFieldType14);
        boolean boolean18 = periodType9.isSupported(durationFieldType14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = localDate8.withFieldAdded(durationFieldType14, 53655084);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hours' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("", throwable1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.lang.String str4 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException: " + "'", str4, "java.io.IOException: ");
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.years();
        java.lang.String str9 = periodType8.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(53680252, 53625645, 53626980, 0, 53645766, 410, 53645, 53674160, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Years" + "'", str9, "Years");
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        int int6 = localDate2.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DateTime dateTime9 = localDate2.toDateTime((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.DateTime.Property property10 = dateTime9.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = property10.setCopy("2022-02-21T14:54:05.059Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:54:05.059Z\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(53632583, 11, 53625645, 53657187, 7, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53657187 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.copy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        mutableDateTime8.setZone(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.minuteOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        java.lang.String str15 = localDate14.toString();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.eras();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.year();
        mutableDateTime8.setChronology(chronology18);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = dateTimeFormatter5.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime8, "2022-02-21T14:54:41.645", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getHourOfDay();
        org.joda.time.LocalTime localTime3 = localTime0.plusHours((int) (short) 1);
        org.joda.time.DateTime dateTime4 = localTime0.toDateTimeToday();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) 342, 47541L, periodType7);
        org.joda.time.Period period10 = period8.minusWeeks(11);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.hours();
        mutableDateTime12.add(durationFieldType13, (int) (byte) 0);
        int int16 = period8.get(durationFieldType13);
        org.joda.time.DateTime dateTime17 = dateTime4.plus((org.joda.time.ReadablePeriod) period8);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) (byte) 100, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime12.copy();
        org.joda.time.Duration duration14 = period10.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.Seconds seconds15 = period10.toStandardSeconds();
        org.joda.time.Period period17 = period10.plusYears(0);
        org.joda.time.Period period19 = period10.withHours(53617440);
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.years();
        java.lang.String str21 = periodType20.getName();
        org.joda.time.PeriodType periodType22 = periodType20.withMonthsRemoved();
        org.joda.time.Period period23 = period10.normalizedStandard(periodType22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = new org.joda.time.Period(53632583, 53660145, 11, 842, 56041618, 53664756, 53628335, 11, periodType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Years" + "'", str21, "Years");
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "IT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLanguage("Fri Jul 01 14:56:05 UTC 53619791");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: Fri Jul 01 14:56:05 UTC 53619791 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(533L, chronology8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 342, chronology8);
        int int11 = localDate10.getYearOfEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        int int15 = localDate14.getDayOfYear();
        org.joda.time.LocalTime localTime16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate14.toDateTime(localTime16, dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = localDate14.toDateMidnight(dateTimeZone19);
        org.joda.time.DateMidnight.Property property21 = dateMidnight20.yearOfEra();
        int int22 = dateMidnight20.getMinuteOfHour();
        int int23 = dateMidnight20.getMonthOfYear();
        org.joda.time.DateTime dateTime24 = localDate10.toDateTime((org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.years();
        java.lang.String str26 = periodType25.getName();
        org.joda.time.PeriodType periodType27 = periodType25.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period28 = new org.joda.time.Period((java.lang.Object) dateMidnight20, periodType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateMidnight");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Years" + "'", str26, "Years");
        org.junit.Assert.assertNotNull(periodType27);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.DateMidnight.Property property5 = dateMidnight2.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight2.withCenturyOfEra(2022);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.plus((long) 5);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.withMillis(31536000000L);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight9.minusWeeks(902);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight15 = dateMidnight9.withYearOfCentury(53686986);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53686986 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27422465L) + "'", long4 == (-27422465L));
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight13);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("2022-02-21T14:54:13.369Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-21T14:54:13.369Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        java.util.Date date4 = calendar0.getTime();
        date4.setSeconds(792);
        date4.setHours(53635576);
        java.lang.String str9 = date4.toString();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455293927,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=53,MILLISECOND=927,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Wed Nov 09 17:07:12 UTC 8140");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Wed Nov 09 17:07:12 UTC 8140" + "'", str9, "Wed Nov 09 17:07:12 UTC 8140");
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        java.util.Date date4 = calendar0.getTime();
        date4.setHours(0);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455294175,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=54,MILLISECOND=175,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 00:54:54 UTC 2022");
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        java.util.Date date1 = dateTime0.toDate();
        java.time.Instant instant2 = date1.toInstant();
        java.lang.String str3 = date1.toString();
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Feb 21 14:54:54 UTC 2022");
        org.junit.Assert.assertNotNull(instant2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Mon Feb 21 14:54:54 UTC 2022" + "'", str3, "Mon Feb 21 14:54:54 UTC 2022");
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        java.util.Date date6 = new java.util.Date(53617719, 2022, 842, 1, 0, 53618165);
        int int7 = date6.getHours();
        int int8 = date6.getTimezoneOffset();
        java.lang.String str9 = date6.toString();
        org.junit.Assert.assertEquals(date6.toString(), "Fri Jul 01 14:56:05 UTC 53619791");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 14 + "'", int7 == 14);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Fri Jul 01 14:56:05 UTC 53619791" + "'", str9, "Fri Jul 01 14:56:05 UTC 53619791");
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.copy();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        java.lang.String str11 = periodType10.getName();
        org.joda.time.PeriodType periodType12 = periodType10.withMonthsRemoved();
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime5, (org.joda.time.ReadableInstant) mutableDateTime9, periodType10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = period13.minusSeconds(53626980);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Years" + "'", str11, "Years");
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        int int8 = localDate7.getDayOfYear();
        org.joda.time.LocalTime localTime9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTime(localTime9, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.yearOfEra();
        int int15 = dateMidnight13.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property16 = dateMidnight13.year();
        boolean boolean17 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) dateMidnight13);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setWeekOfWeekyear(54);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("ko_KR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ko_KR\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        java.util.Date date3 = new java.util.Date(5, 53620972, 0);
        boolean boolean5 = date3.equals((java.lang.Object) "2022-02-21T14:54:46.960");
        org.junit.Assert.assertEquals(date3.toString(), "Wed Apr 30 00:00:00 UTC 4470319");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        int int11 = yearMonthDay8.getDayOfMonth();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        java.lang.String str15 = localDate14.toString();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay8.withChronologyRetainFields(chronology18);
        int int21 = yearMonthDay8.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType23 = yearMonthDay8.getFieldType(2057);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2057");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(8);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withPivotYear(53660145);
        java.lang.StringBuffer stringBuffer12 = null;
        java.util.Calendar calendar13 = java.util.Calendar.getInstance();
        calendar13.setFirstDayOfWeek(53620623);
        calendar13.set(4, 53637942);
        long long19 = calendar13.getTimeInMillis();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.fromCalendarFields(calendar13);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks(53641106);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer12, (org.joda.time.ReadablePartial) localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=32441870357694860,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=1030011,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=12,DAY_OF_YEAR=346,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=54,MILLISECOND=860,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32441870357694860L + "'", long19 == 32441870357694860L);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        java.util.Date date4 = calendar0.getTime();
        java.util.TimeZone timeZone5 = null;
        calendar0.setTimeZone(timeZone5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = calendar0.getWeeksInWeekYear();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455294954,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=null,firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=54,MILLISECOND=954,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 14:54:54 UTC 2022");
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime2 = property1.roundFloorCopy();
        org.joda.time.LocalTime localTime3 = property1.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime5 = property1.addNoWrapToCopy((int) 'a');
        int int6 = localTime5.size();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutablePeriod3.add(readableDuration4);
        mutablePeriod3.addYears((int) (short) 100);
        java.lang.Object obj8 = mutablePeriod3.clone();
        mutablePeriod3.setSeconds(904);
        mutablePeriod3.setSeconds(53619248);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.centuries();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.add(durationFieldType13, 53639477);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'centuries'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "P100YT53619248S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "P100YT53619248S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "P100YT53619248S");
        org.junit.Assert.assertNotNull(durationFieldType13);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        java.util.Date date6 = new java.util.Date(53617719, 2022, 842, 1, 0, 53618165);
        int int7 = date6.getSeconds();
        date6.setTime((long) 53617649);
        java.lang.Object obj10 = date6.clone();
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 14:53:37 UTC 1970");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "Thu Jan 01 14:53:37 UTC 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "Thu Jan 01 14:53:37 UTC 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "Thu Jan 01 14:53:37 UTC 1970");
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Calendar.Builder builder4 = builder0.setLocale(locale3);
        java.util.Calendar calendar5 = builder0.build();
        java.util.Calendar.Builder builder8 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder10 = builder8.setLenient(false);
        java.util.Calendar.Builder builder15 = builder8.setTimeOfDay((int) ' ', 53617440, 3, 53617649);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(periodType16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) periodType16, dateTimeZone18);
        int int20 = localDateTime19.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.dayOfMonth();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime23.copy();
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone26 = dateMidnight25.getZone();
        mutableDateTime23.setZoneRetainFields(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDateTime19.toDateTime(dateTimeZone26);
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = dateTimeZone26.getShortName((long) 1970, locale31);
        java.util.Locale locale34 = java.util.Locale.JAPANESE;
        java.lang.String str35 = locale34.getCountry();
        java.lang.String str36 = dateTimeZone26.getShortName(9537L, locale34);
        java.util.Calendar.Builder builder37 = builder8.setLocale(locale34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = calendar5.getDisplayName(53687475, 18, locale34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 21 + "'", int20 == 21);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withWeekyear(35);
        int int8 = localDateTime3.getYear();
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.withHourOfDay((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay9.withFieldAdded(durationFieldType12, 53625645);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay9.plusHours((int) '4');
        org.joda.time.TimeOfDay.Property property17 = timeOfDay9.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay18 = property17.withMinimumValue();
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, (long) 0, periodType21, chronology22);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay18.minus((org.joda.time.ReadablePeriod) mutablePeriod23);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = localDateTime3.compareTo((org.joda.time.ReadablePartial) timeOfDay24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay24);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("AD");
        org.joda.time.Instant instant3 = new org.joda.time.Instant((long) 23);
        boolean boolean4 = languageRange1.equals((java.lang.Object) 23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        int int6 = localDate2.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DateTime dateTime9 = localDate2.toDateTime((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight10.getZone();
        boolean boolean13 = dateTimeZone11.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(dateTimeZone11);
        java.lang.String str16 = dateTimeZone11.getNameKey((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime8.toMutableDateTime(dateTimeZone11);
        long long19 = dateTimeZone11.previousTransition((long) 53632);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableDuration20, readableInstant21, periodType22);
        mutablePeriod23.addYears((int) (byte) 0);
        int int26 = mutablePeriod23.getMonths();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(readableDuration27, readableInstant28, periodType29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        mutablePeriod30.add(readableDuration31);
        mutablePeriod30.addMonths((int) '#');
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) (short) 1, chronology36);
        int int38 = localDate37.getDayOfYear();
        org.joda.time.LocalTime localTime39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = localDate37.toDateTime(localTime39, dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = localDate37.toDateMidnight(dateTimeZone42);
        org.joda.time.DateMidnight.Property property44 = dateMidnight43.yearOfEra();
        int int45 = dateMidnight43.getMinuteOfHour();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) (byte) 100, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(chronology49);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime50.copy();
        org.joda.time.Duration duration52 = period48.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight43.plus((org.joda.time.ReadableDuration) duration52);
        mutablePeriod30.add((org.joda.time.ReadableDuration) duration52);
        mutablePeriod23.setPeriod((org.joda.time.ReadableDuration) duration52);
        org.joda.time.MutablePeriod mutablePeriod56 = mutablePeriod23.copy();
        org.joda.time.PeriodType periodType57 = mutablePeriod56.getPeriodType();
        mutablePeriod56.addSeconds(773);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((long) (short) 1, chronology63);
        java.lang.String str65 = localDate64.toString();
        org.joda.time.LocalDate localDate67 = localDate64.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology68 = localDate67.getChronology();
        mutablePeriod56.setPeriod((long) 15, 1L, chronology68);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((java.lang.Object) 53632, chronology68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 53632L + "'", long19 == 53632L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateMidnight43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(dateMidnight53);
        org.junit.Assert.assertNotNull(mutablePeriod56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1970-01-01" + "'", str65, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate67);
        org.junit.Assert.assertNotNull(chronology68);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusDays(465);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
        int int11 = mutableDateTime10.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone13 = dateMidnight12.getZone();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        mutableDateTime10.setZoneRetainFields(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj8, dateTimeZone13);
        org.joda.time.DateTime dateTime17 = localDateTime5.toDateTime(dateTimeZone13);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(periodType18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) periodType18, dateTimeZone20);
        int int22 = localDateTime21.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property23.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime5.withField(dateTimeFieldType24, 53617891);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53617891 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 860 + "'", int11 == 860);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 21 + "'", int22 == 21);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType2 = periodType1.withMonthsRemoved();
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.time();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        mutableDateTime5.add(durationFieldType6, (int) (byte) 0);
        int int9 = periodType3.indexOf(durationFieldType6);
        boolean boolean10 = periodType1.isSupported(durationFieldType6);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableDuration11, readableInstant12, periodType13);
        mutablePeriod14.addYears((int) (byte) 0);
        int int17 = mutablePeriod14.getMonths();
        mutablePeriod14.addMinutes((int) (byte) 0);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(periodType21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) periodType21, dateTimeZone23);
        int int25 = localDateTime24.getMonthOfYear();
        org.joda.time.Chronology chronology26 = localDateTime24.getChronology();
        mutablePeriod14.add((long) (short) 0, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period((long) 96, periodType1, chronology26);
        org.joda.time.PeriodType periodType29 = periodType1.withHoursRemoved();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) (short) 1, chronology32);
        java.lang.String str34 = localDate33.toString();
        org.joda.time.LocalDate localDate36 = localDate33.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay((long) (short) 1, chronology37);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone40 = dateMidnight39.getZone();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) (short) 1, chronology42);
        java.lang.String str44 = localDate43.toString();
        org.joda.time.LocalDate localDate46 = localDate43.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight39.withFields((org.joda.time.ReadablePartial) localDate46);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(readableDuration48, readableInstant49, periodType50);
        mutablePeriod51.setMillis(0);
        org.joda.time.LocalDate localDate54 = localDate46.plus((org.joda.time.ReadablePeriod) mutablePeriod51);
        int[] intArray57 = chronology37.get((org.joda.time.ReadablePeriod) mutablePeriod51, (long) 53645, (long) 53625309);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((java.lang.Object) periodType29, chronology37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01" + "'", str34, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01" + "'", str44, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 0, 0, 0, 14, 52, 51, 664]");
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime3 = dateTime0.withFieldAdded(durationFieldType1, (int) (byte) 0);
        org.joda.time.DateTime dateTime5 = dateTime0.minusYears(10);
        int int6 = dateTime0.getCenturyOfEra();
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.hourOfDay();
        int int2 = property1.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay3 = property1.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay4 = property1.withMaximumValue();
        int int5 = property1.getMinimumValue();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(8);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withDefaultYear(53639477);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter2.print((long) 53695701);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.LocalDate.Property property10 = localDate7.property(dateTimeFieldType9);
        java.util.Locale locale14 = new java.util.Locale("UTC", "2022-02-21T14:53:49.549Z");
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = property10.setCopy("ko", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"ko\" for weekyearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals(locale14.toString(), "utc_2022-02-21T14:53:49.549Z");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        int int0 = org.joda.time.TimeOfDay.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMillis(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType9 = localDateTime5.getFieldType(53649947);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53649947");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromCalendarFields(calendar0);
        java.util.Date date7 = new java.util.Date(5, 53620972, 0);
        calendar0.setTime(date7);
        long long9 = date7.getTime();
        java.lang.String str10 = date7.toString();
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=141007485139200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=4470319,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=120,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertEquals(date7.toString(), "Wed Apr 30 00:00:00 UTC 4470319");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 141007485139200000L + "'", long9 == 141007485139200000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Wed Apr 30 00:00:00 UTC 4470319" + "'", str10, "Wed Apr 30 00:00:00 UTC 4470319");
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime0.toCalendar(locale3);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromCalendarFields(calendar4);
        int int7 = calendar4.get(0);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645455296971,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=56,MILLISECOND=971,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        boolean boolean9 = dateTimeZone7.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter5.withZone(dateTimeZone7);
        boolean boolean12 = dateTimeFormatter5.isPrinter();
        boolean boolean13 = dateTimeFormatter5.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = dateTimeFormatter5.parseLocalDate("DateTimeField[weekOfWeekyear]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("14:54:15.918");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=14:54:15.918");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate.Property property2 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(53649947);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) (byte) 100, chronology6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology8);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.copy();
        org.joda.time.Duration duration11 = period7.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.Weeks weeks12 = period7.toStandardWeeks();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(readableDuration13, readableInstant14, periodType15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutablePeriod16.add(readableDuration17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime20.copy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        mutableDateTime21.setZone(dateTimeZone22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime21.minuteOfDay();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime28 = dateTime25.withFieldAdded(durationFieldType26, (int) (byte) 0);
        mutableDateTime21.add(durationFieldType26, 8);
        boolean boolean31 = mutablePeriod16.isSupported(durationFieldType26);
        int int32 = period7.indexOf(durationFieldType26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate34 = localDate0.withFieldAdded(durationFieldType26, 53680252);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 5368025200");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(53625309, 0, 0, 58103655);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53625309 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalTime localTime4 = localTime0.minusMinutes(409);
        org.joda.time.LocalTime localTime6 = localTime0.minusMinutes(53620134);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime6.minus(readablePeriod7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.eras();
        org.joda.time.Period period21 = new org.joda.time.Period(58385L, 0L, periodType12, chronology19);
        org.joda.time.DateTimeField dateTimeField22 = chronology19.hourOfHalfday();
        boolean boolean23 = dateTimeFieldType9.isSupported(chronology19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property24 = localTime6.property(dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 1);
        boolean boolean7 = dateTimeFormatter3.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withDefaultYear(53656631);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight10 = org.joda.time.DateMidnight.parse("2022-02-21T14:53:45.309", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMillis(2);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusYears(53619770);
        int int7 = localDateTime2.getWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.minusSeconds((int) 'x');
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        boolean boolean14 = dateTimeFormatter13.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone18 = dateMidnight17.getZone();
        boolean boolean20 = dateTimeZone18.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now(dateTimeZone18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter16.withZone(dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) localDateTime10, dateTimeZone18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53697485 + "'", int5 == 53697485);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getHourOfDay();
        org.joda.time.LocalTime localTime3 = localTime0.plusHours((int) (short) 1);
        org.joda.time.DateTime dateTime4 = localTime0.toDateTimeToday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(53653452);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53653452 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime0.toCalendar(locale3);
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromCalendarFields(calendar4);
        // The following exception was thrown during execution in test generation
        try {
            calendar4.set(53695639, 53670039);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53695639");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645455297582,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=57,MILLISECOND=582,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay5);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime4 = property2.set(53674);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53674 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime.Property property9 = dateTime5.year();
        org.joda.time.DateTime dateTime10 = property9.roundFloorCopy();
        org.joda.time.DateTime.Property property11 = dateTime10.year();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int1 = calendar0.getWeekYear();
        calendar0.setTimeInMillis((long) 199);
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        java.util.TimeZone timeZone5 = calendar0.getTimeZone();
        timeZone5.setID("0100-01-01T00:00:00.000Z");
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone5);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("2022-02-21T14:54:05.059Z");
        timeZone10.setID("1970-01-01");
        boolean boolean13 = timeZone10.observesDaylightTime();
        boolean boolean14 = timeZone10.observesDaylightTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        org.joda.time.Chronology chronology18 = dateTimeFormatter17.getChronolgy();
        boolean boolean19 = dateTimeFormatter17.isOffsetParsed();
        java.util.Locale locale20 = java.util.Locale.TAIWAN;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter17.withLocale(locale20);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone10, locale20);
        java.lang.String str23 = timeZone5.getDisplayName(locale20);
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=199,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"0100-01-01T00:00:00.000Z\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=199,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2022 + "'", int1 == 2022);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645455297877,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"0100-01-01T00:00:00.000Z\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=57,MILLISECOND=877,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(chronology18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(calendar22);
// flaky:         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=1645455297878,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"1970-01-01\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=57,MILLISECOND=878,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GMT+00:00" + "'", str23, "GMT+00:00");
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusMillis(53618333);
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        int int8 = dateTime6.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime6.withDate(53681645, 53617719, (-53617748));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53617719 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay((int) ' ', 53617440, 3, 53617649);
        java.util.Calendar.Builder builder10 = builder0.set(6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder12 = builder0.setInstant(24181L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        int int5 = mutableDateTime1.getCenturyOfEra();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 1, chronology10);
        java.lang.String str12 = localDate11.toString();
        org.joda.time.LocalDate localDate14 = localDate11.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.eras();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology15);
        mutableDateTime1.setChronology(chronology15);
        org.joda.time.DateTimeField dateTimeField19 = mutableDateTime1.getRoundingField();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime1.hourOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime1.minuteOfDay();
        mutableDateTime1.setDate((long) 662);
        int int24 = mutableDateTime1.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfMonth(53648497);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53648497 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNull(dateTimeField19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology9);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 14, chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(53660764, 28, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53660764 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) (short) 10, (-292275054), 7, 53666419, 1, 982);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53666419 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime.Property property9 = dateTime5.year();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) 100, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.copy();
        org.joda.time.Duration duration16 = period12.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableDuration) duration16);
        org.joda.time.DateTime.Property property18 = dateTime5.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = property18.compareTo(readablePartial19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.Period period5 = org.joda.time.Period.weeks((int) '4');
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        java.lang.String str7 = periodType6.getName();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(periodType6);
        org.joda.time.Period period9 = period5.plus((org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.Period period10 = period5.negated();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Period period13 = period10.withFieldAdded(durationFieldType11, 53646242);
        org.joda.time.LocalTime localTime15 = localTime3.withFieldAdded(durationFieldType11, 53625309);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.lang.String str17 = dateTimeFieldType16.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime19 = localTime15.withField(dateTimeFieldType16, 53628335);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53628335 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Years" + "'", str7, "Years");
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "millisOfSecond" + "'", str17, "millisOfSecond");
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate.Property property4 = localDate2.year();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate.Property property9 = localDate7.year();
        org.joda.time.Period period10 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate7);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = period10.getValue(982);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 982");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 53619248, (long) 1);
        mutablePeriod2.add((int) (byte) 10, 904, 53619708, 47, 10, (-292275054), 0, 342);
        mutablePeriod2.addHours(718);
        org.joda.time.format.PeriodFormatter periodFormatter14 = null;
        java.lang.String str15 = mutablePeriod2.toString(periodFormatter14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType17 = mutablePeriod2.getFieldType(53620972);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P10Y904M53619708W47DT714H-292275107M-38.905S" + "'", str15, "P10Y904M53619708W47DT714H-292275107M-38.905S");
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.weekyear();
        java.lang.String str7 = localDateTime3.toString();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.plusYears(999);
        int int11 = localDateTime3.getCenturyOfEra();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53698857 + "'", int5 == 53698857);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-21T14:54:58.857" + "'", str7, "2022-02-21T14:54:58.857");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime.Property property9 = dateTime5.year();
        org.joda.time.DateTime dateTime11 = property9.addWrapFieldToCopy(598);
        org.joda.time.DateTime dateTime12 = property9.roundHalfEvenCopy();
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("-0001-02-22T14:54:40.252");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = property9.setCopy("4470113-04-01", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"4470113-04-01\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "IT");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("1970");
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder7 = builder5.setLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setRegion("2022-02-21T14:53:53.322");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 2022-02-21T14:53:53.322 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(readableDuration1, readableInstant2, periodType3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutablePeriod4.add(readableDuration5);
        mutablePeriod4.addMonths((int) '#');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (short) 1, chronology10);
        int int12 = localDate11.getDayOfYear();
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate11.toDateTime(localTime13, dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = localDate11.toDateMidnight(dateTimeZone16);
        org.joda.time.DateMidnight.Property property18 = dateMidnight17.yearOfEra();
        int int19 = dateMidnight17.getMinuteOfHour();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) (byte) 100, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime24.copy();
        org.joda.time.Duration duration26 = period22.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight17.plus((org.joda.time.ReadableDuration) duration26);
        mutablePeriod4.add((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Period period29 = duration26.toPeriod();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight0.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant31 = new org.joda.time.Instant();
        org.joda.time.Instant instant33 = instant31.withMillis((-27422466L));
        int int34 = dateMidnight30.compareTo((org.joda.time.ReadableInstant) instant31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((java.lang.Object) int34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay((int) ' ', 53617440, 3, 53617649);
        java.util.Calendar.Builder builder12 = builder7.setTimeOfDay(53626727, 0, 53628444, (int) ' ');
        java.util.Calendar.Builder builder16 = builder7.setWeekDate(53640196, 780, 53668755);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar17 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 53668755");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.dayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 53619248, (long) 1);
        int[] intArray17 = chronology7.get((org.joda.time.ReadablePeriod) mutablePeriod14, (long) (-292275054), (long) 53637942);
        org.joda.time.DateTimeField dateTimeField18 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = dateTimeField18.getLeapDurationField();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (short) 1, chronology21);
        java.lang.String str23 = localDate22.toString();
        org.joda.time.LocalDate localDate25 = localDate22.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 1, chronology27);
        java.lang.String str29 = localDate28.toString();
        org.joda.time.LocalDate localDate31 = localDate28.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property32 = localDate28.weekOfWeekyear();
        org.joda.time.DateTime dateTime33 = localDate28.toDateTimeAtCurrentTime();
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone35 = dateMidnight34.getZone();
        boolean boolean37 = dateTimeZone35.isStandardOffset((long) 'a');
        org.joda.time.DateTime dateTime38 = dateTime33.withZoneRetainFields(dateTimeZone35);
        org.joda.time.DateTime dateTime39 = localDate25.toDateTimeAtStartOfDay(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = localDate25.toDateTimeAtStartOfDay(dateTimeZone40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((java.lang.Object) dateTimeField18, dateTimeZone40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.field.ZeroIsMaxDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 4, 0, 5, 12, 996]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNull(durationField19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01" + "'", str23, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int1 = calendar0.getWeekYear();
        calendar0.setTimeInMillis((long) 199);
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        java.util.TimeZone timeZone5 = calendar0.getTimeZone();
        timeZone5.setID("0100-01-01T00:00:00.000Z");
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone5);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance();
        calendar9.setFirstDayOfWeek(53620623);
        calendar9.set(4, 53637942);
        long long15 = calendar9.getTimeInMillis();
        int int16 = calendar8.compareTo(calendar9);
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=199,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"0100-01-01T00:00:00.000Z\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=199,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2022 + "'", int1 == 2022);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645455299327,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"0100-01-01T00:00:00.000Z\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=59,MILLISECOND=327,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=32441870357699327,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=1030011,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=12,DAY_OF_YEAR=346,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=59,MILLISECOND=327,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32441870357699327L + "'", long15 == 32441870357699327L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone8 = dateMidnight7.getZone();
        boolean boolean10 = dateTimeZone8.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter6.withZone(dateTimeZone8);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 53628506, dateTimeZone8);
        long long15 = dateTimeZone8.nextTransition(0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = durationField7.getMillis(53678034);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) 53646596);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.withEra(53655716);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53655716 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        java.util.Date date4 = calendar0.getTime();
        int int5 = calendar0.getWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = calendar0.getGreatestMinimum(53652419);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53652419");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455299475,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=59,MILLISECOND=475,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 14:54:59 UTC 2022");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalTime localTime4 = localTime0.minusMinutes(409);
        org.joda.time.LocalTime localTime6 = localTime0.minusMinutes(53620134);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime6.minus(readablePeriod7);
        java.util.Locale locale10 = java.util.Locale.ROOT;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = localTime6.toString("2022-02-21T14:53:56.547", locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.LocalTime localTime5 = property1.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property1.setCopy("0099-02-23T00:00:53.248Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0099-02-23T00:00:53.248Z\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27422465L) + "'", long4 == (-27422465L));
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("Italian");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Italian\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = dateMidnight8.isSupported(dateTimeFieldType11);
        org.joda.time.Period period17 = new org.joda.time.Period((int) (byte) 10, (-1), 21, 100);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight8.minus((org.joda.time.ReadablePeriod) period17);
        int int19 = dateMidnight8.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        java.lang.String str7 = localDate6.toString();
        org.joda.time.LocalDate localDate9 = localDate6.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.year();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 34, chronology10);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = chronology10.getDateTimeMillis((long) 53617891, 2022, 53646596, 898, 53692814);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ISOChronology[UTC]" + "'", str14, "ISOChronology[UTC]");
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear(53650847);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuffer8, (long) 53664756);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType1.getField(chronology8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 100, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.copy();
        org.joda.time.Duration duration17 = period13.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.Period period19 = period13.plusDays((int) (byte) 10);
        int int20 = period19.getHours();
        org.joda.time.Period period22 = period19.plusMonths(2);
        org.joda.time.Period period24 = period19.minusMonths(12);
        org.joda.time.Period period26 = period19.withYears(2057);
        int[] intArray28 = chronology8.get((org.joda.time.ReadablePeriod) period26, 259200000L);
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay((long) 1970, chronology8);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(readableDuration30, readableInstant31, periodType32);
        mutablePeriod33.addYears((int) (byte) 0);
        int int36 = mutablePeriod33.getSeconds();
        mutablePeriod33.setHours(11);
        mutablePeriod33.setYears(53632583);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay29.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod33, 53686878);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 53632583 * 53686878");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, 0, 3, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("", throwable1);
        java.lang.String str3 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: " + "'", str3, "java.io.IOException: ");
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(902, 53634467, 894, 656, 24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 656 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusDays(465);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.dayOfYear();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField10 = property8.getField();
        org.joda.time.DurationField durationField11 = property8.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime12 = property8.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime13 = property8.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localDateTime13.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.minusMonths(53626705);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDateTime3.getValue(53674);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53674");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        boolean boolean9 = dateTimeZone7.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter5.withZone(dateTimeZone7);
        java.util.Locale locale12 = dateTimeFormatter11.getLocale();
        java.io.Writer writer13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime17 = dateTime14.withFieldAdded(durationFieldType15, (int) (byte) 0);
        org.joda.time.DateTime.Property property18 = dateTime14.yearOfEra();
        org.joda.time.DateTime dateTime20 = property18.addToCopy(12);
        org.joda.time.DateTime dateTime22 = dateTime20.plusSeconds(5);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(writer13, (org.joda.time.ReadableInstant) dateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.minusSeconds((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime3.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53700785 + "'", int5 == 53700785);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.era();
        org.joda.time.DurationField durationField10 = chronology6.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology6.getDateTimeMillis(24815L, 53636547, 53699994, 53697620, 53686960);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53636547 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutablePeriod3.add(readableDuration4);
        mutablePeriod3.addMonths((int) '#');
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime11 = dateTime8.withFieldAdded(durationFieldType9, (int) (byte) 0);
        boolean boolean12 = mutablePeriod3.isSupported(durationFieldType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((java.lang.Object) mutablePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.MutablePeriod");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.LocalTime localTime6 = property1.addWrapFieldToCopy(53618195);
        org.joda.time.LocalTime localTime7 = property1.withMaximumValue();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime10.copy();
        mutableDateTime10.addMinutes(0);
        java.lang.String str14 = mutableDateTime10.toString();
        int int15 = mutableDateTime10.getYearOfEra();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.minuteOfDay();
        java.util.Locale locale19 = new java.util.Locale("", "hi!");
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.lang.String str22 = locale19.getDisplayCountry(locale20);
        java.lang.String str23 = property16.getAsText(locale19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = property1.setCopy("IT", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"IT\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27422464L) + "'", long4 == (-27422464L));
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022-02-21T14:55:01.026Z" + "'", str14, "2022-02-21T14:55:01.026Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals(locale19.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str21, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HI!" + "'", str22, "HI!");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "895" + "'", str23, "895");
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "IT");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("UTC");
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setUnicodeLocaleKeyword("hi!_YEARS_1970-01-01", "T14:54:15.044");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: hi!_YEARS_1970-01-01 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        java.lang.String str10 = localDate9.toString();
        org.joda.time.LocalDate localDate12 = localDate9.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.eras();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology13.getZone();
        java.util.Locale locale19 = new java.util.Locale("UTC", "2022-02-21T14:53:49.549Z");
        java.lang.String str20 = locale19.getCountry();
        java.lang.String str22 = locale19.getExtension('x');
        java.lang.String str23 = dateTimeZone15.getShortName((long) 52, locale19);
        java.util.TimeZone timeZone24 = dateTimeZone15.toTimeZone();
        java.lang.String str25 = dateTimeZone15.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(2022, 53649612, 199, (-639), 53629078, 982, 53655084, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -639 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals(locale19.toString(), "utc_2022-02-21T14:53:49.549Z");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022-02-21T14:53:49.549Z" + "'", str20, "2022-02-21T14:53:49.549Z");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        boolean boolean4 = dateTimeFormatter2.isOffsetParsed();
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withLocale(locale5);
        boolean boolean7 = dateTimeFormatter6.isOffsetParsed();
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable8, 30901L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean3 = localTime1.isSupported(dateTimeFieldType2);
        int int4 = mutableDateTime0.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.year();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(53640490, 52, 792, 53666646, 53639477, 53628444);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53666646 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate3 = localDate0.withWeekyear(52);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        int int7 = localDate6.getDayOfYear();
        org.joda.time.LocalTime localTime8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate6.toDateTime(localTime8, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusYears((int) (short) 10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        int int16 = localDate15.getDayOfYear();
        org.joda.time.LocalTime localTime17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate15.toDateTime(localTime17, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = localDate15.toDateMidnight(dateTimeZone20);
        org.joda.time.DateMidnight.Property property22 = dateMidnight21.yearOfEra();
        int int23 = dateMidnight21.getMinuteOfHour();
        org.joda.time.Interval interval24 = dateMidnight21.toInterval();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateMidnight21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate27 = localDate0.withPeriodAdded((org.joda.time.ReadablePeriod) period25, 53632562);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -536323598 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(interval24);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        boolean boolean4 = dateTimeFormatter2.isOffsetParsed();
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = dateTimeFormatter6.parseMutableDateTime("0100-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        java.util.Date date6 = new java.util.Date(53617719, 2022, 842, 1, 0, 53618165);
        org.joda.time.YearMonthDay yearMonthDay7 = org.joda.time.YearMonthDay.fromDateFields(date6);
        int int8 = date6.getMonth();
        date6.setYear(53625266);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        boolean boolean14 = dateTimeFormatter13.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone18 = dateMidnight17.getZone();
        boolean boolean20 = dateTimeZone18.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now(dateTimeZone18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter16.withZone(dateTimeZone18);
        long long24 = dateTimeZone18.nextTransition((long) 53619708);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone18);
        boolean boolean26 = date6.equals((java.lang.Object) dateTimeZone18);
        org.junit.Assert.assertEquals(date6.toString(), "Fri Jul 01 14:56:05 UTC 53627166");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 53619708L + "'", long24 == 53619708L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.copy();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        java.lang.String str11 = periodType10.getName();
        org.joda.time.PeriodType periodType12 = periodType10.withMonthsRemoved();
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime5, (org.joda.time.ReadableInstant) mutableDateTime9, periodType10);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime5.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime14.setWeekOfWeekyear(53626727);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626727 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Years" + "'", str11, "Years");
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("2022-02-21T14:54:39.656", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2022-02-21T14:54:54.135Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T14:54:54.135Z\" is malformed at \"Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight8.plusYears((int) ' ');
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight8);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableDuration15, readableInstant16, periodType17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutablePeriod18.add(readableDuration19);
        mutablePeriod18.addMonths((int) '#');
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) 1, chronology24);
        int int26 = localDate25.getDayOfYear();
        org.joda.time.LocalTime localTime27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate25.toDateTime(localTime27, dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = localDate25.toDateMidnight(dateTimeZone30);
        org.joda.time.DateMidnight.Property property32 = dateMidnight31.yearOfEra();
        int int33 = dateMidnight31.getMinuteOfHour();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) (byte) 100, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime38.copy();
        org.joda.time.Duration duration40 = period36.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight31.plus((org.joda.time.ReadableDuration) duration40);
        mutablePeriod18.add((org.joda.time.ReadableDuration) duration40);
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.years();
        java.lang.String str44 = periodType43.getName();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(periodType43);
        org.joda.time.PeriodType periodType46 = periodType43.withYearsRemoved();
        org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight8, (org.joda.time.ReadableDuration) duration40, periodType46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight8.plusWeeks(53639477);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight51 = dateMidnight49.withMonthOfYear(53690321);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53690321 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Years" + "'", str44, "Years");
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(dateMidnight49);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property6 = localDate2.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) localDate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.era();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.millisOfSecond();
        org.joda.time.DurationField durationField11 = chronology6.years();
        long long14 = durationField11.getValueAsLong((long) 53692795, (long) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property12 = localDate8.weekOfWeekyear();
        org.joda.time.DateTime dateTime13 = localDate8.toDateTimeAtCurrentTime();
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone15 = dateMidnight14.getZone();
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) 'a');
        org.joda.time.DateTime dateTime18 = dateTime13.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime19 = localDate5.toDateTimeAtStartOfDay(dateTimeZone15);
        org.joda.time.LocalDate localDate21 = localDate5.minusDays(53641106);
        org.joda.time.LocalDate.Property property22 = localDate21.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = localDate21.toString("15 Dec 2801 00:00:00 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-21T14:54:05.059Z");
        timeZone1.setID("1970-01-01");
        int int5 = timeZone1.getOffset((long) 53667278);
        java.lang.String str6 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GMT+00:00" + "'", str6, "GMT+00:00");
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime1 = timeOfDay0.toDateTimeToday();
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond(409);
        org.joda.time.DateTime.Property property4 = dateTime1.centuryOfEra();
        org.joda.time.DateTime dateTime6 = dateTime1.minusWeeks(34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime1.withMinuteOfHour(53700922);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53700922 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType7 = periodType6.withMonthsRemoved();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.time();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.hours();
        mutableDateTime10.add(durationFieldType11, (int) (byte) 0);
        int int14 = periodType8.indexOf(durationFieldType11);
        boolean boolean15 = periodType6.isSupported(durationFieldType11);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime17.copy();
        mutableDateTime17.addMinutes(0);
        java.lang.String str21 = mutableDateTime17.toString();
        int int22 = mutableDateTime17.getYearOfEra();
        org.joda.time.Chronology chronology23 = mutableDateTime17.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.eras();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 53644667, (long) (byte) 100, periodType6, chronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(783, 24, 53633398, 363, chronology23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 783 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(mutableDateTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2022-02-21T14:55:02.300Z" + "'", str21, "2022-02-21T14:55:02.300Z");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(8);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withDefaultYear(53639477);
        java.io.Writer writer12 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.eras();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology19.getZone();
        java.util.Locale locale25 = new java.util.Locale("UTC", "2022-02-21T14:53:49.549Z");
        java.lang.String str26 = locale25.getCountry();
        java.lang.String str28 = locale25.getExtension('x');
        java.lang.String str29 = dateTimeZone21.getShortName((long) 52, locale25);
        java.util.TimeZone timeZone30 = dateTimeZone21.toTimeZone();
        java.lang.String str31 = dateTimeZone21.toString();
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay(dateTimeZone21);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer12, (org.joda.time.ReadablePartial) yearMonthDay32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals(locale25.toString(), "utc_2022-02-21T14:53:49.549Z");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2022-02-21T14:53:49.549Z" + "'", str26, "2022-02-21T14:53:49.549Z");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime11 = localTime8.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localTime8.toDateTimeToday(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMonths(10);
        org.joda.time.DateTime.Property property16 = dateTime13.minuteOfDay();
        org.joda.time.DateTime.Property property17 = dateTime13.year();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) (byte) 100, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime22.copy();
        org.joda.time.Duration duration24 = period20.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableDuration) duration24);
        org.joda.time.Weeks weeks26 = period25.toStandardWeeks();
        org.joda.time.PeriodType periodType27 = weeks26.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(53649947, 53639426, 18, 53695827, 100, 53640641, 92, 129, periodType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(periodType27);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Calendar.Builder builder4 = builder0.setLocale(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.lang.String str6 = locale5.getCountry();
        java.util.Calendar.Builder builder7 = builder4.setLocale(locale5);
        java.util.Calendar.Builder builder12 = builder4.setTimeOfDay(339, 53618333, 2022, 2);
        org.joda.time.tz.NameProvider nameProvider13 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str17 = nameProvider13.getName(locale14, "DateTimeField[dayOfMonth]", "CA");
        java.util.Calendar.Builder builder18 = builder12.setLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder20 = builder12.setInstant((long) 53659661);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IT" + "'", str6, "IT");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(nameProvider13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (short) 1, chronology7);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra((int) (byte) 100);
        int int12 = localDate8.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 53619708);
        org.joda.time.DateTime dateTime15 = localDate8.toDateTime((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone17 = dateMidnight16.getZone();
        boolean boolean19 = dateTimeZone17.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now(dateTimeZone17);
        java.lang.String str22 = dateTimeZone17.getNameKey((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime14.toMutableDateTime(dateTimeZone17);
        long long25 = dateTimeZone17.previousTransition((long) 53632);
        long long27 = dateTimeZone17.convertUTCToLocal((long) 53643405);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(53677506, 53, 8, 53674, 53695081, 3, dateTimeZone17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53674 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 53632L + "'", long25 == 53632L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 53643405L + "'", long27 == 53643405L);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) '4');
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        java.lang.String str3 = periodType2.getName();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(periodType2);
        org.joda.time.Period period5 = period1.plus((org.joda.time.ReadablePeriod) mutablePeriod4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = period1.multipliedBy(53689021);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 52 * 53689021");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Years" + "'", str3, "Years");
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = property9.addToCopy((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusDays(904);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (byte) 100, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime18.copy();
        org.joda.time.Duration duration20 = period16.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime19);
        int int21 = period16.size();
        org.joda.time.format.PeriodFormatter periodFormatter22 = null;
        java.lang.String str23 = period16.toString(periodFormatter22);
        int int24 = period16.getSeconds();
        org.joda.time.Period period26 = period16.plusDays(0);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime13.minus((org.joda.time.ReadablePeriod) period16);
        int int28 = localDateTime27.getMinuteOfHour();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53702731 + "'", int5 == 53702731);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PT0.100S" + "'", str23, "PT0.100S");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(localDateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 55 + "'", int28 == 55);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withWeekyear(35);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withWeekyear(10);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundFloorCopy();
        boolean boolean12 = property10.isLeap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = property10.setCopy(53692814);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53692814 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        int int11 = dateMidnight8.getMonthOfYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology16);
        java.lang.String str18 = localDate17.toString();
        org.joda.time.LocalDate localDate20 = localDate17.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.eras();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology21);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) dateMidnight8, chronology21);
        org.joda.time.DateTime dateTime25 = dateMidnight8.toDateTime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01" + "'", str18, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(2057, 53644151, 1, 53619248, 53621101, 53627306, 53625645, 873);
        mutablePeriod8.add(465, 53634384, 53628444, 53644151, 53618333, 5, 53619079, 53636547);
        mutablePeriod8.setPeriod(34, 53619708, 53695640, 53660145, 53664, 718, 53656631, 36);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(8);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear(53632583);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeFormatter11.getZone();
        java.lang.Appendable appendable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(appendable13, (long) 202233);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutablePeriod3.add(readableDuration4);
        mutablePeriod3.addSeconds(53617440);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        java.lang.String str15 = localDate14.toString();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.eras();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology18);
        org.joda.time.DateTimeField dateTimeField21 = chronology18.year();
        mutablePeriod3.setPeriod((long) 53618333, chronology18);
        int int23 = mutablePeriod3.getMinutes();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setValue((int) (short) 100, 53700922);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 53 + "'", int23 == 53);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableDuration7, readableInstant8, periodType9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutablePeriod10.add(readableDuration11);
        mutablePeriod10.addYears((int) (short) 100);
        java.lang.Object obj15 = mutablePeriod10.clone();
        mutablePeriod10.setSeconds(904);
        org.joda.time.LocalDate localDate18 = localDate5.minus((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.LocalDate.Property property19 = localDate18.yearOfEra();
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = property19.getAsShortText(locale20);
        org.joda.time.LocalDate localDate22 = property19.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate24 = localDate22.minusWeeks((-1));
        java.util.Date date25 = localDate22.toDate();
        org.joda.time.LocalDate.Property property26 = localDate22.dayOfYear();
        java.util.Locale locale28 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = localDate22.toString("", locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "P100YT904S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "P100YT904S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "P100YT904S");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 UTC 1");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_CA");
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime10.copy();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone13 = dateMidnight12.getZone();
        mutableDateTime10.setZoneRetainFields(dateTimeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) dateTime8, dateTimeZone13);
        org.joda.time.YearMonthDay yearMonthDay16 = dateTime8.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = yearMonthDay16.getFieldTypes();
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay16.minusYears((int) 'u');
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableDuration20, readableInstant21, periodType22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        mutablePeriod23.add(readableDuration24);
        mutablePeriod23.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(readableDuration28, readableInstant29, periodType30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        mutablePeriod31.add(readableDuration32);
        mutablePeriod31.addMonths((int) '#');
        mutablePeriod23.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod31);
        mutablePeriod31.add((-1L));
        org.joda.time.YearMonthDay yearMonthDay39 = yearMonthDay19.plus((org.joda.time.ReadablePeriod) mutablePeriod31);
        mutablePeriod31.setPeriod((long) 339);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = mutablePeriod31.getValue(53671631);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53671631");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(yearMonthDay39);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) 100, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.copy();
        org.joda.time.Duration duration16 = period12.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.Period period18 = period12.plusDays((int) (byte) 10);
        int int19 = period18.getHours();
        org.joda.time.Period period21 = period18.plusMonths(2);
        org.joda.time.Period period23 = period18.minusMonths(12);
        org.joda.time.Period period25 = period18.withYears(2057);
        int[] intArray27 = chronology7.get((org.joda.time.ReadablePeriod) period25, 259200000L);
        org.joda.time.DurationField durationField28 = chronology7.weeks();
        long long31 = durationField28.getMillis(53625645, (long) 53620134);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0, 3, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32432790096000000L + "'", long31 == 32432790096000000L);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        int int8 = localDate7.getDayOfYear();
        org.joda.time.LocalTime localTime9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTime(localTime9, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.yearOfEra();
        int int15 = dateMidnight13.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property16 = dateMidnight13.year();
        boolean boolean17 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) dateMidnight13);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (short) 1, chronology19);
        int int21 = localDate20.getDayOfYear();
        org.joda.time.LocalTime localTime22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate20.toDateTime(localTime22, dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = localDate20.toDateMidnight(dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.withDayOfMonth(1);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(readableDuration29, readableInstant30, periodType31);
        mutablePeriod32.addYears((int) (byte) 0);
        int int35 = mutablePeriod32.getMonths();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(readableDuration36, readableInstant37, periodType38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutablePeriod39.add(readableDuration40);
        mutablePeriod39.addMonths((int) '#');
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) (short) 1, chronology45);
        int int47 = localDate46.getDayOfYear();
        org.joda.time.LocalTime localTime48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = localDate46.toDateTime(localTime48, dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateMidnight dateMidnight52 = localDate46.toDateMidnight(dateTimeZone51);
        org.joda.time.DateMidnight.Property property53 = dateMidnight52.yearOfEra();
        int int54 = dateMidnight52.getMinuteOfHour();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) (byte) 100, chronology56);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(chronology58);
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime59.copy();
        org.joda.time.Duration duration61 = period57.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime60);
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight52.plus((org.joda.time.ReadableDuration) duration61);
        mutablePeriod39.add((org.joda.time.ReadableDuration) duration61);
        mutablePeriod32.setPeriod((org.joda.time.ReadableDuration) duration61);
        org.joda.time.MutablePeriod mutablePeriod65 = mutablePeriod32.copy();
        org.joda.time.PeriodType periodType66 = mutablePeriod65.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight13, (org.joda.time.ReadableInstant) dateMidnight28, periodType66);
        boolean boolean68 = dateMidnight13.isBeforeNow();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight70 = dateMidnight13.withYearOfCentury(342);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 342 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateMidnight52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(dateMidnight62);
        org.junit.Assert.assertNotNull(mutablePeriod65);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(100L);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getDurationType();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.property(dateTimeFieldType3);
        int int7 = mutableDateTime1.getRoundingMode();
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableDuration9, readableInstant10, periodType11);
        mutablePeriod12.setMillis(0);
        org.joda.time.LocalDate localDate15 = localDate7.plus((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.LocalDate localDate17 = localDate15.withWeekyear((int) ' ');
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone19 = dateMidnight18.getZone();
        boolean boolean21 = dateTimeZone19.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone19);
        org.joda.time.DateTime dateTime23 = localDate15.toDateTimeAtStartOfDay(dateTimeZone19);
        org.joda.time.DateTimeField[] dateTimeFieldArray24 = localDate15.getFields();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (byte) 100, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime29.copy();
        org.joda.time.Duration duration31 = period27.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.Period period33 = period27.plusDays((int) (byte) 10);
        int int34 = period33.getHours();
        org.joda.time.Period period36 = period33.plusMonths(2);
        org.joda.time.Period period38 = period36.withSeconds(53);
        org.joda.time.Period period40 = period36.withSeconds(999);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(chronology41);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime42.copy();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        mutableDateTime43.setZone(dateTimeZone44);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime43.minuteOfDay();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime50 = dateTime47.withFieldAdded(durationFieldType48, (int) (byte) 0);
        mutableDateTime43.add(durationFieldType48, 8);
        int int53 = period40.indexOf(durationFieldType48);
        boolean boolean54 = localDate15.isSupported(durationFieldType48);
        org.joda.time.DateTime dateTime55 = localDate15.toDateTimeAtStartOfDay();
        org.joda.time.DateTime.Property property56 = dateTime55.millisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldArray24);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(property56);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalTime localTime4 = localTime0.minusMinutes(409);
        org.joda.time.LocalTime localTime6 = localTime0.minusMinutes(53620134);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime6.minus(readablePeriod7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime6.withMillisOfDay((-144832));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -144832 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        long long6 = property5.remainder();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = property5.add(9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 9223372036854775807 * 60000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3837L + "'", long6 == 3837L);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        java.lang.String str10 = localDate9.toString();
        org.joda.time.LocalDate localDate12 = localDate9.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.eras();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(410, 19, (int) 'a', 53657187, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 410 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((-1), 53620134, (int) (byte) -1, 53617719, (int) (byte) 100, 53619079, 1, 53);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 100, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        org.joda.time.Duration duration15 = period11.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime14);
        int int16 = period11.size();
        mutablePeriod8.add((org.joda.time.ReadablePeriod) period11);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = mutablePeriod8.getValue(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2022");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone6 = dateMidnight5.getZone();
        boolean boolean8 = dateTimeZone6.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now(dateTimeZone6);
        java.lang.String str11 = dateTimeZone6.getNameKey((long) (byte) 10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(20, 53698857, 21, 27, 591, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 27 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("ko_KR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromCalendarFields(calendar0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean6 = localTime4.isSupported(dateTimeFieldType5);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime8 = localTime4.withFields((org.joda.time.ReadablePartial) localTime7);
        java.lang.String str9 = localTime4.toString();
        org.joda.time.LocalTime localTime11 = localTime4.minusHours(773);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int13 = localTime4.get(dateTimeFieldType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property14 = timeOfDay3.property(dateTimeFieldType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455304124,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"1970-01-01\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=55,SECOND=4,MILLISECOND=124,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "14:55:04.124" + "'", str9, "14:55:04.124");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53704 + "'", int13 == 53704);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withCenturyOfEra(1);
        org.joda.time.DateTime dateTime3 = dateMidnight2.toDateTime();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        java.lang.String str7 = localDate6.toString();
        org.joda.time.LocalDate localDate9 = localDate6.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight2.withChronology(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.withCenturyOfEra(53634384);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53634384 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateMidnight12);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((int) (short) 10, 53646133);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53646133 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay((int) ' ', 53617440, 3, 53617649);
        java.util.Calendar.Builder builder12 = builder7.setTimeOfDay(53626727, 0, 53628444, (int) ' ');
        java.util.Calendar.Builder builder16 = builder7.setWeekDate(53640196, 780, 53668755);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder18 = builder16.setInstant((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        java.util.Date date5 = mutableDateTime2.toDate();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromDateFields(date5);
        date5.setYear(53694591);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Wed Feb 21 14:55:04 GMT+00:00 53696491");
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((java.lang.Object) 53689021);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.year();
        java.lang.String str13 = chronology9.toString();
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DurationField durationField15 = chronology9.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = chronology9.getDateTimeMillis((long) 32, 27, 0, 55, 53692129);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 27 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[UTC]" + "'", str13, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        long long4 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight2);
        org.joda.time.DateMidnight.Property property5 = dateMidnight2.dayOfWeek();
        int int6 = property5.getMinimumValue();
        org.joda.time.tz.NameProvider nameProvider8 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str12 = nameProvider8.getName(locale9, "DateTimeField[dayOfMonth]", "CA");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight13 = property5.setCopy("14:54:24.849", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"14:54:24.849\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-27422464L) + "'", long4 == (-27422464L));
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(nameProvider8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        int int11 = yearMonthDay8.getDayOfMonth();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (short) 1, chronology13);
        java.lang.String str15 = localDate14.toString();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay8.withChronologyRetainFields(chronology18);
        org.joda.time.DurationField durationField21 = chronology18.seconds();
        long long23 = durationField21.getMillis((long) 185);
        int int26 = durationField21.getValue((long) 53646242, (long) (byte) 0);
        long long29 = durationField21.getDifferenceAsLong((long) 56, 2L);
        boolean boolean30 = durationField21.isPrecise();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 185000L + "'", long23 == 185000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 53646 + "'", int26 == 53646);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(842, 736);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 736");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(999, 53649515, 52, 53653004, (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53653004 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate.Property property4 = localDate2.year();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate.Property property9 = localDate7.year();
        org.joda.time.Period period10 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property12 = localTime11.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = dateMidnight13.getZone();
        long long15 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight13);
        org.joda.time.DateMidnight.Property property16 = dateMidnight13.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight13.withDayOfYear(20);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime20.copy();
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone23 = dateMidnight22.getZone();
        mutableDateTime20.setZoneRetainFields(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) dateMidnight18, dateTimeZone23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) localDate2, dateTimeZone23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-27422464L) + "'", long15 == (-27422464L));
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) (byte) 100, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.copy();
        org.joda.time.Duration duration13 = period9.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableDuration14, readableInstant15, periodType16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutablePeriod17.add(readableDuration18);
        mutablePeriod17.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(readableDuration22, readableInstant23, periodType24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        mutablePeriod25.add(readableDuration26);
        mutablePeriod25.addMonths((int) '#');
        mutablePeriod17.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod25);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(readableDuration31, readableInstant32, periodType33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        mutablePeriod34.add(readableDuration35);
        mutablePeriod34.addMonths((int) '#');
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) (short) 1, chronology40);
        int int42 = localDate41.getDayOfYear();
        org.joda.time.LocalTime localTime43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDate41.toDateTime(localTime43, dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = localDate41.toDateMidnight(dateTimeZone46);
        org.joda.time.DateMidnight.Property property48 = dateMidnight47.yearOfEra();
        int int49 = dateMidnight47.getMinuteOfHour();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) (byte) 100, chronology51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(chronology53);
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime54.copy();
        org.joda.time.Duration duration56 = period52.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime55);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight47.plus((org.joda.time.ReadableDuration) duration56);
        mutablePeriod34.add((org.joda.time.ReadableDuration) duration56);
        mutablePeriod17.add((org.joda.time.ReadableDuration) duration56);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration56);
        boolean boolean61 = duration6.isEqual((org.joda.time.ReadableDuration) duration56);
        long long62 = duration6.getMillis();
        org.joda.time.Duration duration63 = duration6.toDuration();
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(dateMidnight57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 100L + "'", long62 == 100L);
        org.junit.Assert.assertNotNull(duration63);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_EVEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtMidnight();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(periodType3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) periodType3, dateTimeZone5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusYears((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusDays(465);
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.dayOfYear();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField13 = property11.getField();
        org.joda.time.LocalDateTime localDateTime14 = property11.roundHalfEvenCopy();
        boolean boolean15 = property11.isLeap();
        org.joda.time.LocalDateTime localDateTime16 = property11.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = localDate0.isAfter((org.joda.time.ReadablePartial) localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setMillisOfDay(53650847);
        long long3 = mutableDateTime0.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setHourOfDay(328);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 328 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645455250847L + "'", long3 == 1645455250847L);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.Instant instant8 = instant6.withMillis((-27422466L));
        org.joda.time.Chronology chronology9 = instant6.getChronology();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.DurationField durationField11 = chronology9.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(53640196, 53619708, 53619079, 53625266, (int) 'u', 736, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53625266 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        int int5 = dateTimeZone1.getStandardOffset((long) 96);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutablePeriod3.add(readableDuration4);
        mutablePeriod3.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(readableDuration8, readableInstant9, periodType10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutablePeriod11.add(readableDuration12);
        mutablePeriod11.addMonths((int) '#');
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod11);
        int int17 = mutablePeriod11.getMonths();
        mutablePeriod11.add((-2720L));
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod11.setValue(736, 53633322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 736");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        org.joda.time.DateMidnight.Property property12 = dateMidnight8.centuryOfEra();
        int int13 = dateMidnight8.getYearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 53619248, (long) 1);
        mutablePeriod16.add((int) (byte) 10, 904, 53619708, 47, 10, (-292275054), 0, 342);
        mutablePeriod16.addHours(718);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight8.minus((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateMidnight.Property property29 = dateMidnight28.centuryOfEra();
        int int30 = dateMidnight28.getSecondOfDay();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 70 + "'", int13 == 70);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = dateMidnight8.isSupported(dateTimeFieldType11);
        org.joda.time.Period period17 = new org.joda.time.Period((int) (byte) 10, (-1), 21, 100);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight8.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays(53662339);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight22 = dateMidnight18.withYearOfCentury((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateMidnight20);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.hourOfDay();
        int int2 = property1.getMaximumValueOverall();
        int int3 = property1.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay5 = property1.addNoWrapToCopy(53653004);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Maximum value exceeded for add");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZone(dateTimeZone3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        int int8 = localDate7.getDayOfYear();
        org.joda.time.LocalTime localTime9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate7.toDateTime(localTime9, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = localDate7.toDateMidnight(dateTimeZone12);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.yearOfEra();
        int int15 = dateMidnight13.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property16 = dateMidnight13.year();
        boolean boolean17 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) dateMidnight13);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDayOfYear((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) 1, chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.plusMonths(53617719);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight11.withField(dateTimeFieldType20, 842);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay8.property(dateTimeFieldType20);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay8.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay26 = property24.addToCopy(53629078);
        int int27 = property24.get();
        org.joda.time.TimeOfDay timeOfDay29 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 598);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = property24.compareTo((org.joda.time.ReadablePartial) timeOfDay29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(timeOfDay29);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        java.lang.String str5 = localDate4.toString();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight0.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableDuration9, readableInstant10, periodType11);
        mutablePeriod12.setMillis(0);
        org.joda.time.LocalDate localDate15 = localDate7.plus((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.LocalDate localDate17 = localDate15.withWeekyear((int) ' ');
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone19 = dateMidnight18.getZone();
        boolean boolean21 = dateTimeZone19.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone19);
        org.joda.time.DateTime dateTime23 = localDate15.toDateTimeAtStartOfDay(dateTimeZone19);
        java.lang.String str24 = dateTime23.toString();
        org.joda.time.DateTime.Property property25 = dateTime23.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = dateTime23.withEra(53669883);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53669883 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0100-01-01T00:00:00.000Z" + "'", str24, "0100-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.weekyear();
        java.lang.String str7 = localDateTime3.toString();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.centuryOfEra();
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property9.setCopy("2022-02-21T14:53:45.309");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:53:45.309\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53706146 + "'", int5 == 53706146);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-21T14:55:06.146" + "'", str7, "2022-02-21T14:55:06.146");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        java.util.Date date4 = calendar0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll(53625266, 53703240);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455306205,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"1970-01-01\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=55,SECOND=6,MILLISECOND=205,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 14:55:06 GMT+00:00 2022");
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(199, 50, 53619248);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "IT");
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("1970");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("ko", "GMT+00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: GMT+00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 1);
        boolean boolean7 = dateTimeFormatter3.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withDefaultYear(53656631);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.parse("14:54:54.911", dateTimeFormatter9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime5 = dateTimeFormatter2.parseMutableDateTime("53649612");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.parse("1980-01-01", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays(185);
        int int13 = dateTime10.getYearOfEra();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableDuration14, readableInstant15, periodType16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutablePeriod17.add(readableDuration18);
        mutablePeriod17.addMonths((int) '#');
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 1, chronology23);
        int int25 = localDate24.getDayOfYear();
        org.joda.time.LocalTime localTime26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate24.toDateTime(localTime26, dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = localDate24.toDateMidnight(dateTimeZone29);
        org.joda.time.DateMidnight.Property property31 = dateMidnight30.yearOfEra();
        int int32 = dateMidnight30.getMinuteOfHour();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) (byte) 100, chronology34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime37.copy();
        org.joda.time.Duration duration39 = period35.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime38);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight30.plus((org.joda.time.ReadableDuration) duration39);
        mutablePeriod17.add((org.joda.time.ReadableDuration) duration39);
        org.joda.time.DateTime dateTime42 = dateTime10.minus((org.joda.time.ReadablePeriod) mutablePeriod17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime44 = dateTime42.withHourOfDay(53632562);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53632562 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(dateTime42);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(100L);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean8 = localTime6.isSupported(dateTimeFieldType7);
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType7.getDurationType();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.property(dateTimeFieldType7);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localTime3.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setFirstDayOfWeek(53620623);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        java.util.Date date4 = calendar0.getTime();
        int int5 = date4.getMinutes();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455307003,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"1970-01-01\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=53620623,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=55,SECOND=7,MILLISECOND=3,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 14:55:07 GMT+00:00 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 55 + "'", int5 == 55);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.dayOfMonth();
        int int10 = localDateTime3.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property11 = localDateTime3.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime3.withWeekyear(736);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime3.minusMinutes(185);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime3.withWeekyear(53642637);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withWeekOfWeekyear(53618195);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53618195 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53707215 + "'", int5 == 53707215);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.hourOfDay();
        int int2 = property1.getMaximumValueOverall();
        org.joda.time.TimeOfDay timeOfDay3 = property1.withMaximumValue();
        java.lang.String str4 = property1.getAsShortText();
        java.util.Locale locale5 = java.util.Locale.US;
        int int6 = property1.getMaximumTextLength(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale5.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertNotNull(timeOfDay3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "14" + "'", str4, "14");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.copy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        mutableDateTime9.setZone(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime16 = dateTime13.withFieldAdded(durationFieldType14, (int) (byte) 0);
        mutableDateTime9.add(durationFieldType14, 8);
        org.joda.time.LocalDate localDate20 = localDate2.withFieldAdded(durationFieldType14, 3);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTimeAtMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = dateTime21.withMonthOfYear(904);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 904 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-21T14:54:05.059Z");
        timeZone1.setID("1970-01-01");
        java.lang.String str4 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GMT+00:00" + "'", str4, "GMT+00:00");
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        int int10 = property8.getMinimumValue();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) periodType0, dateTimeZone2);
        int int4 = localDateTime3.getDayOfMonth();
        int int5 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        int int7 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.era();
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.dayOfMonth();
        int int10 = localDateTime3.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property11 = localDateTime3.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime3.withWeekyear(736);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime3.minusMinutes(185);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime3.withWeekyear(53642637);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime3.withEra(92);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 92 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53707575 + "'", int5 == 53707575);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property11 = dateMidnight8.year();
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = property11.getAsText(locale12);
        org.joda.time.DateMidnight dateMidnight15 = property11.addToCopy((long) 3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withMonthOfYear((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970" + "'", str13, "1970");
        org.junit.Assert.assertNotNull(dateMidnight15);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        boolean boolean9 = dateTimeZone7.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter5.withZone(dateTimeZone7);
        boolean boolean12 = dateTimeFormatter5.isPrinter();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 1, chronology18);
        java.lang.String str20 = localDate19.toString();
        org.joda.time.LocalDate localDate22 = localDate19.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.eras();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(100, 12, (int) (short) 1, chronology23);
        boolean boolean26 = dateTimeFieldType13.isSupported(chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter5.withChronology(chronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime29 = dateTimeFormatter27.parseLocalDateTime("gregory");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(53618195, 53626518);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53618195 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        java.util.Locale locale1 = new java.util.Locale("hours");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale1.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for hours");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hours");
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutablePeriod3.add(readableDuration4);
        mutablePeriod3.addYears((int) (short) 100);
        java.lang.Object obj8 = mutablePeriod3.clone();
        mutablePeriod3.setSeconds(904);
        mutablePeriod3.setSeconds(53619248);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((java.lang.Object) 53619248);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "P100YT53619248S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "P100YT53619248S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "P100YT53619248S");
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        java.util.Locale locale2 = new java.util.Locale("", "hi!");
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.lang.String str5 = locale2.getDisplayCountry(locale3);
        java.lang.String str6 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str4, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!" + "'", str5, "HI!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_HI!" + "'", str6, "_HI!");
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        int int10 = dateMidnight8.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = dateMidnight8.isSupported(dateTimeFieldType11);
        org.joda.time.Period period17 = new org.joda.time.Period((int) (byte) 10, (-1), 21, 100);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight8.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.Instant instant21 = instant19.withMillis((-27422466L));
        org.joda.time.Chronology chronology22 = instant19.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.clockhourOfHalfday();
        int int24 = dateMidnight8.get(dateTimeField23);
        org.joda.time.YearMonthDay yearMonthDay25 = dateMidnight8.toYearMonthDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight27 = dateMidnight8.withMonthOfYear(53690321);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53690321 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertNotNull(yearMonthDay25);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(dateTimeZone1);
        int int5 = localDate4.size();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableDuration6, readableInstant7, periodType8);
        mutablePeriod9.addYears((int) (byte) 0);
        int int12 = mutablePeriod9.getMonths();
        mutablePeriod9.addMinutes((int) (byte) 0);
        int int15 = mutablePeriod9.getMinutes();
        mutablePeriod9.add((long) 53629078);
        org.joda.time.LocalDate localDate19 = localDate4.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod9, 28);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(periodType20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((java.lang.Object) periodType20, dateTimeZone22);
        int int24 = localDateTime23.getDayOfMonth();
        int int25 = localDateTime23.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.millisOfSecond();
        int int27 = localDateTime23.getEra();
        org.joda.time.LocalDateTime.Property property28 = localDateTime23.era();
        org.joda.time.LocalDateTime.Property property29 = localDateTime23.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime31 = property29.addToCopy((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withMinuteOfHour(2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = localDate19.isEqual((org.joda.time.ReadablePartial) localDateTime31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21 + "'", int24 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 53708105 + "'", int25 == 53708105);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 53619248, (long) 1);
        mutablePeriod2.add((int) (byte) 10, 904, 53619708, 47, 10, (-292275054), 0, 342);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) (-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(8);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withPivotYear(53660145);
        java.io.Writer writer12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property14 = localTime13.minuteOfHour();
        org.joda.time.LocalTime localTime16 = localTime13.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localTime13.toDateTimeToday(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMonths(10);
        org.joda.time.DateTime.Property property21 = dateTime18.minuteOfDay();
        org.joda.time.DateTime.Property property22 = dateTime18.year();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) (byte) 100, chronology24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime27.copy();
        org.joda.time.Duration duration29 = period25.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableDuration) duration29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(chronology31);
        mutableDateTime32.addMinutes(904);
        int int35 = mutableDateTime32.getYearOfCentury();
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration29, (org.joda.time.ReadableInstant) mutableDateTime32);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer12, (org.joda.time.ReadableInstant) mutableDateTime32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 22 + "'", int35 == 22);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType4.getField(chronology11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (byte) 100, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime18.copy();
        org.joda.time.Duration duration20 = period16.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.Period period22 = period16.plusDays((int) (byte) 10);
        int int23 = period22.getHours();
        org.joda.time.Period period25 = period22.plusMonths(2);
        org.joda.time.Period period27 = period22.minusMonths(12);
        org.joda.time.Period period29 = period22.withYears(2057);
        int[] intArray31 = chronology11.get((org.joda.time.ReadablePeriod) period29, 259200000L);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) '#', (long) 53695081, periodType2, chronology11);
        org.joda.time.DateTimeField dateTimeField33 = chronology11.year();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 0, 3, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) 1, chronology11);
        int int13 = localDate12.getDayOfYear();
        org.joda.time.LocalTime localTime14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate12.toDateTime(localTime14, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = localDate12.toDateMidnight(dateTimeZone17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.yearOfEra();
        int int20 = dateMidnight18.getMinuteOfHour();
        org.joda.time.Interval interval21 = dateMidnight18.toInterval();
        org.joda.time.MutableDateTime mutableDateTime22 = dateMidnight18.toMutableDateTime();
        int int23 = dateMidnight8.compareTo((org.joda.time.ReadableInstant) mutableDateTime22);
        int int24 = dateMidnight8.getDayOfYear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.withMillisOfSecond(904);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(10);
        org.joda.time.DateTime.Property property8 = dateTime5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        java.util.Locale locale10 = null;
        int int11 = dateTimeField9.getMaximumShortTextLength(locale10);
        long long13 = dateTimeField9.roundCeiling(10L);
        int int15 = dateTimeField9.get(53646133L);
        org.joda.time.ReadablePartial readablePartial16 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 1, chronology20);
        java.lang.String str22 = localDate21.toString();
        org.joda.time.LocalDate localDate24 = localDate21.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.yearOfEra();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType18.getField(chronology25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) 100, chronology29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime32.copy();
        org.joda.time.Duration duration34 = period30.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.Period period36 = period30.plusDays((int) (byte) 10);
        int int37 = period36.getHours();
        org.joda.time.Period period39 = period36.plusMonths(2);
        org.joda.time.Period period41 = period36.minusMonths(12);
        org.joda.time.Period period43 = period36.withYears(2057);
        int[] intArray45 = chronology25.get((org.joda.time.ReadablePeriod) period43, 259200000L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray47 = dateTimeField9.addWrapPartial(readablePartial16, 32772, intArray45, 898);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32772");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60000L + "'", long13 == 60000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 894 + "'", int15 == 894);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01" + "'", str22, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 0, 0, 3, 0, 0, 0, 0]");
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int1 = calendar0.getWeekYear();
        calendar0.setTimeInMillis((long) 199);
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        java.util.TimeZone timeZone5 = calendar0.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = calendar0.get(53634384);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53634384");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=199,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"1970-01-01\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=199,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2022 + "'", int1 == 2022);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(8);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withDefaultYear(53639477);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = dateTimeFormatter2.parseLocalDateTime("PT864000.100S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay.Property property1 = timeOfDay0.hourOfDay();
        int int2 = property1.getMinimumValueOverall();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (short) 1, chronology5);
        int int7 = localDate6.getDayOfYear();
        org.joda.time.LocalTime localTime8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate6.toDateTime(localTime8, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = localDate6.toDateMidnight(dateTimeZone11);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.yearOfEra();
        int int14 = dateMidnight12.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        boolean boolean16 = dateMidnight12.isSupported(dateTimeFieldType15);
        org.joda.time.DateMidnight.Property property17 = dateMidnight12.weekOfWeekyear();
        java.util.Locale locale18 = java.util.Locale.CANADA;
        int int19 = property17.getMaximumShortTextLength(locale18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay20 = property1.setCopy("53619791-07-01", locale18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"53619791-07-01\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.LocalTime localTime4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate2.toDateTime(localTime4, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate2.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfEra();
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = dateMidnight8.toMutableDateTime(dateTimeZone11);
        mutableDateTime12.addMillis(54);
        mutableDateTime12.setYear(22);
        mutableDateTime12.addMinutes(517);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(53626705);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeFormatter7.parseMillis("2022-02-21T14:55:03.783Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology11);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 14, chronology11);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((-1L), chronology11);
        org.joda.time.DateTimeField dateTimeField16 = chronology11.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology11.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(53702731, 281, 53632562, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 281 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withWeekyear((int) (short) 100);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime0.toCalendar(locale3);
        calendar4.setFirstDayOfWeek(53658462);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calendar4.getActualMinimum(47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 47");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645455309232,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=53658462,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=55,SECOND=9,MILLISECOND=232,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
    }
}
