import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.normalizedStandard();
        org.joda.time.Period period3 = period0.plusHours(2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.hours();
        int int5 = period0.indexOf(durationFieldType4);
        org.joda.time.Weeks weeks6 = period0.toStandardWeeks();
        java.util.stream.LongStream longStream9 = java.util.stream.LongStream.range((long) (byte) 0, (long) 8);
        boolean boolean10 = weeks6.equals((java.lang.Object) 8);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.Period period9 = org.joda.time.Period.ZERO;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours14 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay11, (org.joda.time.ReadablePartial) timeOfDay13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay13.withFieldAdded(durationFieldType15, (int) (byte) 0);
        org.joda.time.Period period19 = period9.withFieldAdded(durationFieldType15, 4);
        mutableDateTime6.add((org.joda.time.ReadablePeriod) period9);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setDateTime(70, 1, 16, 4200, (int) (byte) 1, 32769, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4200 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.setDayOfYear(28);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setMillisOfDay((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone5);
        long long9 = dateTimeZone5.convertLocalToUTC((long) 3, false);
        org.joda.time.Interval interval10 = new org.joda.time.Interval(10L, (long) 2097, dateTimeZone5);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(28L, dateTimeZone5);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((java.lang.Object) dateTimeZone5, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.months();
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.Hours hours4 = org.joda.time.Hours.hoursIn(readableInterval3);
        org.joda.time.Hours hours6 = hours4.multipliedBy((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = hours6.toMutablePeriod();
        org.joda.time.LocalTime localTime8 = localTime2.minus((org.joda.time.ReadablePeriod) hours6);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField6 = chronology3.monthOfYear();
        int int8 = dateTimeField6.getLeapAmount((long) (byte) 100);
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours13 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay10, (org.joda.time.ReadablePartial) timeOfDay12);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay12.withFieldAdded(durationFieldType14, (int) (byte) 0);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) 0, chronology18);
        org.joda.time.Chronology chronology20 = localTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.weekyearOfCentury();
        long long23 = dateTimeField21.roundHalfEven((long) 16);
        java.util.Locale locale26 = new java.util.Locale("Subject:\n", "German");
        int int27 = dateTimeField21.getMaximumTextLength(locale26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) timeOfDay16, locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals(locale26.toString(), "subject:\n_GERMAN");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, false);
        char[] charArray5 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            printStream3.println(charArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#]");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 0, chronology2);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = chronology4.weekyears();
        org.joda.time.DurationField durationField7 = chronology4.seconds();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0, chronology4);
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYearOfCentury((int) 'a');
        int int14 = localDateTime13.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.plusYears((int) (short) 100);
        int int17 = localDateTime13.getSecondOfMinute();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusSeconds(6);
        boolean boolean24 = localDateTime13.isEqual((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(readableInstant25, readableInstant26);
        org.joda.time.Seconds seconds28 = duration27.toStandardSeconds();
        int int29 = seconds28.getSeconds();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime13.plus((org.joda.time.ReadablePeriod) seconds28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes31 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadablePartial) localTime8, (org.joda.time.ReadablePartial) localDateTime30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 21 + "'", int14 == 21);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        int[] intArray3 = intStream2.toArray();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = intStream2.count();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate.Property property2 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate4 = property2.addToCopy(2097);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate4.withMonthOfYear(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((java.lang.Object) readableInstant1);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval3.setEndMillis((long) '\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        int[] intArray6 = new int[] { 3600000, 3600000, 256, 21, (byte) 100, (short) -1 };
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.function.IntPredicate intPredicate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = intStream7.anyMatch(intPredicate8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[3600000, 3600000, 256, 21, 100, -1]");
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        int int3 = weeks0.getWeeks();
        java.lang.String str4 = weeks0.toString();
        org.joda.time.format.PeriodPrinter periodPrinter5 = null;
        org.joda.time.format.PeriodParser periodParser6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = new org.joda.time.format.PeriodFormatter(periodPrinter5, periodParser6);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.years();
        org.joda.time.format.PeriodFormatter periodFormatter9 = periodFormatter7.withParseType(periodType8);
        java.lang.String str10 = periodType8.getName();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 0, chronology12);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((java.lang.Object) weeks0, periodType8, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P1W" + "'", str4, "P1W");
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodFormatter9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Years" + "'", str10, "Years");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.time.Period period1 = java.time.Period.ofYears(28);
        java.time.Period period3 = java.time.Period.ofYears(28);
        java.time.Period period4 = period1.minus((java.time.temporal.TemporalAmount) period3);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.time();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) period1, periodType5, chronology9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.CoderResult coderResult1 = java.nio.charset.CoderResult.malformedForLength(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Non-positive length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 3, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) dateTime5, chronology7);
        org.joda.time.DateTime dateTime9 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime11 = dateTime5.plusYears((int) 'a');
        int int12 = dateTime5.getYear();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) 0, chronology4);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 1970, chronology6, locale7, (java.lang.Integer) 1);
        long long17 = chronology6.getDateTimeMillis(1L, (int) (short) 10, 8, 4, 3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(28L, (long) (byte) 1, chronology6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 36484003L + "'", long17 == 36484003L);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.of("3");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unknown chronology: 3");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalTime localTime5 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime6 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime5);
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime9 = localTime5.with((java.time.temporal.TemporalField) chronoField7, (long) (short) 1);
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.lang.String str11 = chronoField7.getDisplayName(locale10);
        long long12 = localDateTime0.getLong((java.time.temporal.TemporalField) chronoField7);
        java.time.ZoneOffset zoneOffset13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime14 = localDateTime0.atOffset(zoneOffset13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: offset");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField7.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "NanoOfDay" + "'", str11, "NanoOfDay");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 34456875000000L + "'", long12 == 34456875000000L);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(0L);
        java.util.OptionalLong optionalLong2 = longStream1.min();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = longStream1.toArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(optionalLong2);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream2 = doubleStream0.skip(0L);
        double double3 = doubleStream2.sum();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble4 = doubleStream2.spliterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.unordered();
        java.util.OptionalDouble optionalDouble2 = doubleStream0.max();
        java.util.function.DoubleToIntFunction doubleToIntFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream4 = doubleStream0.mapToInt(doubleToIntFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble2);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval1 = org.joda.time.MutableInterval.parse("Germany");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: Germany");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) 0, chronology8);
        org.joda.time.LocalTime localTime11 = localTime9.minusMillis(2022);
        org.joda.time.LocalTime localTime13 = localTime9.plusMillis((int) (byte) 0);
        int int14 = localTime13.getMillisOfDay();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone20);
        long long24 = dateTimeZone20.convertLocalToUTC((long) 3, false);
        org.joda.time.Interval interval25 = new org.joda.time.Interval(10L, (long) 2097, dateTimeZone20);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(28L, dateTimeZone20);
        org.joda.time.DateTime dateTime28 = localTime13.toDateTimeToday(dateTimeZone20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((int) (byte) -1, (-10), (int) '.', 14, 57, 28, 59, dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -10 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.security.cert.CertificateException certificateException0 = new java.security.cert.CertificateException();
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale locale6 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray7 = new java.util.Locale[] { locale6 };
        java.util.ArrayList<java.util.Locale> localeList8 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList8, localeArray7);
        java.util.List<java.util.Locale> localeList10 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList8);
        localeList10.clear();
        java.util.List<java.util.Locale> localeList12 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale19 };
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList21);
        localeList23.clear();
        java.util.List<java.util.Locale> localeList25 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList23);
        java.util.List<java.util.Locale> localeList26 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList25);
        java.util.function.UnaryOperator<java.util.Locale> localeUnaryOperator27 = null;
        // The following exception was thrown during execution in test generation
        try {
            localeList26.replaceAll(localeUnaryOperator27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localeList10);
        org.junit.Assert.assertNotNull(localeList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localeList23);
        org.junit.Assert.assertNotNull(localeList25);
        org.junit.Assert.assertNotNull(localeList26);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 'a', periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(periodType2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) "Chinese", periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Chinese\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.util.stream.Stream<java.lang.Object> objStream0 = java.util.stream.Stream.empty();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 3, chronology2);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.Period period5 = period4.normalizedStandard();
        org.joda.time.Period period7 = period5.minusMinutes((int) ' ');
        org.joda.time.Period period9 = period7.minusMonths((int) (byte) 0);
        org.joda.time.PeriodType periodType10 = period9.getPeriodType();
        org.joda.time.DateTime dateTime11 = dateTime3.minus((org.joda.time.ReadablePeriod) period9);
        java.util.function.BinaryOperator<java.lang.Object> objBinaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = objStream0.reduce((java.lang.Object) dateTime11, objBinaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objStream0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(0L);
        java.util.OptionalLong optionalLong2 = longStream1.min();
        java.lang.String str3 = optionalLong2.toString();
        long long4 = optionalLong2.getAsLong();
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(optionalLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalLong[0]" + "'", str3, "OptionalLong[0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        org.joda.time.YearMonthDay yearMonthDay7 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar5);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay7.withYear(0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = yearMonthDay7.getValue((int) '/');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 47");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(yearMonthDay9);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(99, 59, 57);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.net.Proxy.Type type0 = java.net.Proxy.Type.HTTP;
        java.net.SocketAddress socketAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Proxy proxy2 = new java.net.Proxy(type0, socketAddress1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type HTTP is not compatible with address null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + java.net.Proxy.Type.HTTP + "'", type0.equals(java.net.Proxy.Type.HTTP));
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period1 = java.time.Period.parse((java.lang.CharSequence) "PT0S");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Period");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(6);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        org.joda.time.Duration duration11 = duration8.plus((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.minus((org.joda.time.ReadableDuration) duration11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withWeekOfWeekyear((int) '#');
        java.util.Date date15 = localDateTime14.toDate();
        org.joda.time.Chronology chronology16 = localDateTime14.getChronology();
        int int17 = localDateTime14.getYear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Thu Aug 29 09:34:17 UTC 2097");
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2097 + "'", int17 == 2097);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        long long3 = timeUnit1.toMinutes((long) '4');
        java.nio.file.attribute.FileTime fileTime4 = java.nio.file.attribute.FileTime.from((long) 10, timeUnit1);
        timeUnit1.sleep(3L);
        long long8 = timeUnit1.toNanos((long) 9);
        long long10 = timeUnit1.toNanos((long) 99);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fileTime4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 99L + "'", long10 == 99L);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange2 = java.time.temporal.ValueRange.of((long) 2022, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value must be less than maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        char[] charArray5 = new char[] {};
        java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.wrap(charArray5);
        java.nio.ByteBuffer byteBuffer7 = charsetEncoder4.encode(charBuffer6);
        java.nio.ByteOrder byteOrder8 = byteBuffer7.order();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = byteBuffer7.getInt();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteOrder8);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream7 = printStream3.append((java.lang.CharSequence) "Wochentag", 57, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -56");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        char[] charArray5 = new char[] {};
        java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.wrap(charArray5);
        java.nio.ByteBuffer byteBuffer7 = charsetEncoder4.encode(charBuffer6);
        java.nio.ByteOrder byteOrder8 = byteBuffer7.order();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = byteBuffer7.getInt(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteOrder8);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate.Property property2 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate4 = property2.addToCopy(7);
        org.joda.time.tz.NameProvider nameProvider6 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) 0, chronology9);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(chronology11);
        org.joda.time.DateTimeField dateTimeField14 = chronology11.monthOfYear();
        java.util.Locale locale15 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 28, chronology11, locale15, (java.lang.Integer) 0);
        java.lang.String str20 = nameProvider6.getShortName(locale15, "22", "Chinese");
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 3, chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfYear();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((java.lang.Object) dateTime23, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime23.toMutableDateTime();
        mutableDateTime27.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime27.dayOfWeek();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime27.year();
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        mutableDateTime27.setZone(dateTimeZone33);
        java.util.Locale locale36 = java.util.Locale.TAIWAN;
        java.lang.String str37 = dateTimeZone33.getShortName((long) 64, locale36);
        java.lang.String str40 = nameProvider6.getName(locale36, "P1W", "Wochentag");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = localDate4.toString("2022-02-21T09:34:06.670Z", locale36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(nameProvider6);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundFloor();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime10.add(9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 3155760000000 + 9223372036854775807");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.time.Duration duration0 = java.time.Duration.ZERO;
        java.lang.String str1 = duration0.toString();
        long long2 = duration0.toMinutes();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PT0S" + "'", str1, "PT0S");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Month month1 = java.time.Month.of(17);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear: 17");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Interval interval1 = localDate0.toInterval();
        int int2 = localDate0.getDayOfYear();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 3600000, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 22, dateTimeZone7);
        org.joda.time.Interval interval11 = localDate0.toInterval(dateTimeZone7);
        boolean boolean12 = dateTimeZone7.isFixed();
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.nio.channels.AsynchronousCloseException asynchronousCloseException0 = new java.nio.channels.AsynchronousCloseException();
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.time.Month month1 = java.time.Month.NOVEMBER;
        int int3 = month1.firstDayOfYear(true);
        int int5 = month1.firstDayOfYear(true);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime10 = java.time.LocalDateTime.of(10800000, month1, (int) '4', (int) 'a', (int) '+', 306);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 52");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.NOVEMBER + "'", month1.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 306 + "'", int3 == 306);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 306 + "'", int5 == 306);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.function.DoublePredicate doublePredicate1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream2 = doubleStream0.filter(doublePredicate1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of((double) (short) 1);
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream3 = doubleStream1.peek(doubleConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            printStream3.write(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        java.time.ZoneOffset zoneOffset3 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate4 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset3);
        java.time.LocalDate localDate5 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset3);
        java.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withZone((java.time.ZoneId) zoneOffset3);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor8 = dateTimeFormatter6.parse((java.lang.CharSequence) "parsecasesensitive(false)(value(year,4,10,exceeds_pad)'-'value(monthofyear,2)'-'value(dayofmonth,2))[offset(+hh:mm:ss,'z')] (UNDERFLOW,Years)");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'parsecasesensitive(false)(value(year,4,10,exceeds_pad)'-'value(m...' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(zoneOffset3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.DateTime.Property property4 = dateTime2.dayOfYear();
        long long5 = dateTime2.getMillis();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3L + "'", long5 == 3L);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        org.joda.time.MutablePeriod mutablePeriod3 = weeks0.toMutablePeriod();
        mutablePeriod3.add((int) '#', 0, 10, 0, (int) (byte) 0, (int) (short) 0, 1, (-1));
        mutablePeriod3.setHours((int) (byte) -1);
        mutablePeriod3.setMonths((-1));
        mutablePeriod3.clear();
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone22);
        long long26 = dateTimeZone22.convertLocalToUTC((long) 3, false);
        long long28 = dateTimeZone19.getMillisKeepLocal(dateTimeZone22, (long) ':');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) mutablePeriod3, dateTimeZone19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.MutablePeriod");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 58L + "'", long28 == 58L);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.nio.LongBuffer longBuffer3 = java.nio.LongBuffer.allocate((int) (short) 0);
        java.nio.Buffer buffer4 = longBuffer3.mark();
        boolean boolean5 = properties1.containsKey((java.lang.Object) longBuffer3);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = java.time.ZoneId.SHORT_IDS;
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean8 = strMap6.containsValue((java.lang.Object) dateTimeFieldType7);
        properties1.putAll(strMap6);
        java.io.OutputStream outputStream10 = null;
        java.io.FilterOutputStream filterOutputStream11 = new java.io.FilterOutputStream(outputStream10);
        java.io.PrintStream printStream13 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream11, false);
        // The following exception was thrown during execution in test generation
        try {
            properties1.list(printStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longBuffer3);
        org.junit.Assert.assertNotNull(buffer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        boolean boolean10 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 3, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) dateTime13, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime13.toMutableDateTime();
        mutableDateTime17.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.year();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.weekyear();
        boolean boolean23 = duration2.equals((java.lang.Object) mutableDateTime17);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = new org.joda.time.Duration(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = duration26.toPeriodTo(readableInstant27, periodType28);
        long long30 = duration26.getStandardSeconds();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 3, chronology32);
        org.joda.time.DateTime.Property property34 = dateTime33.dayOfYear();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((java.lang.Object) dateTime33, chronology35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight36.withDayOfYear((int) ' ');
        org.joda.time.Interval interval41 = duration26.toIntervalTo((org.joda.time.ReadableInstant) dateMidnight40);
        org.joda.time.DateMidnight.Property property42 = dateMidnight40.dayOfYear();
        org.joda.time.DateMidnight.Property property43 = dateMidnight40.yearOfEra();
        org.joda.time.Interval interval44 = duration2.toIntervalFrom((org.joda.time.ReadableInstant) dateMidnight40);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(interval44);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.Duration duration4 = duration2.withMillis((-1L));
        org.joda.time.Duration duration6 = duration4.minus((long) 2022);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 3, chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((java.lang.Object) dateTime9, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime9.toMutableDateTime();
        org.joda.time.Days days14 = org.joda.time.Days.ONE;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadablePeriod) days14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 3, chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfYear();
        org.joda.time.Interval interval20 = property19.toInterval();
        mutableInterval15.setInterval((org.joda.time.ReadableInterval) interval20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = new org.joda.time.Duration(readableInstant22, readableInstant23);
        org.joda.time.Duration duration26 = duration24.withMillis((-1L));
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Duration duration28 = duration24.minus(readableDuration27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) 3, chronology30);
        org.joda.time.DateTime.Property property32 = dateTime31.dayOfYear();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight((java.lang.Object) dateTime31, chronology33);
        org.joda.time.DateMidnight.Property property35 = dateMidnight34.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight36 = property35.getDateMidnight();
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration28, (org.joda.time.ReadableInstant) dateMidnight36);
        mutableInterval15.setEnd((org.joda.time.ReadableInstant) dateMidnight36);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = new org.joda.time.Duration(readableInstant39, readableInstant40);
        long long42 = duration41.getMillis();
        mutableInterval15.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration41);
        boolean boolean44 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration41);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.text.AttributedCharacterIterator.Attribute attribute0 = java.text.AttributedCharacterIterator.Attribute.READING;
        java.lang.String str1 = attribute0.toString();
        org.junit.Assert.assertNotNull(attribute0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.text.AttributedCharacterIterator$Attribute(reading)" + "'", str1, "java.text.AttributedCharacterIterator$Attribute(reading)");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime3 = localDateTime0.with((java.time.temporal.TemporalField) chronoField1, (long) 10);
        java.time.LocalDateTime localDateTime5 = localDateTime0.minusMinutes((long) 12);
        org.joda.time.Period period6 = org.joda.time.Period.ZERO;
        org.joda.time.Period period7 = period6.normalizedStandard();
        org.joda.time.Period period9 = period6.plusHours(2);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        int int11 = period6.indexOf(durationFieldType10);
        org.joda.time.Weeks weeks12 = period6.toStandardWeeks();
        boolean boolean13 = localDateTime5.equals((java.lang.Object) weeks12);
        java.time.chrono.Chronology chronology14 = localDateTime5.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate17 = chronology14.dateYearDay(0, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        boolean boolean10 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 3, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) dateTime13, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime13.toMutableDateTime();
        mutableDateTime17.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.year();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.weekyear();
        boolean boolean23 = duration2.equals((java.lang.Object) mutableDateTime17);
        mutableDateTime17.addMonths((int) ' ');
        mutableDateTime17.add((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = new org.joda.time.Duration(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = duration30.toPeriodTo(readableInstant31, periodType32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = new org.joda.time.Duration(readableInstant34, readableInstant35);
        long long37 = duration36.getMillis();
        boolean boolean38 = duration30.isShorterThan((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) 3, chronology40);
        org.joda.time.DateTime.Property property42 = dateTime41.dayOfYear();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight((java.lang.Object) dateTime41, chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime41.toMutableDateTime();
        mutableDateTime45.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime45.dayOfWeek();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime45.year();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.weekyear();
        boolean boolean51 = duration30.equals((java.lang.Object) mutableDateTime45);
        mutableDateTime45.addMonths((int) ' ');
        mutableDateTime45.add((long) (byte) 10);
        org.joda.time.Period period56 = org.joda.time.Period.ZERO;
        org.joda.time.Period period57 = period56.normalizedStandard();
        org.joda.time.Period period59 = period56.plusHours(2);
        java.time.chrono.IsoEra isoEra60 = java.time.chrono.IsoEra.CE;
        boolean boolean61 = period59.equals((java.lang.Object) isoEra60);
        int int62 = period59.getMinutes();
        mutableDateTime45.add((org.joda.time.ReadablePeriod) period59);
        org.joda.time.Hours hours64 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) mutableDateTime17, (org.joda.time.ReadableInstant) mutableDateTime45);
        mutableDateTime17.setDayOfMonth(28);
        java.util.Locale locale68 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = mutableDateTime17.toString("OptionalLong[0]", locale68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: O");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + isoEra60 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra60.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(hours64);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_US");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.util.Set<java.lang.String> strSet0 = java.time.ZoneId.getAvailableZoneIds();
        java.util.stream.Stream<java.lang.String> strStream1 = strSet0.parallelStream();
        java.lang.Object[] objArray2 = strSet0.toArray();
        java.util.Spliterator<java.lang.String> strSpliterator3 = strSet0.spliterator();
        java.util.Set<java.lang.String> strSet4 = java.time.ZoneId.getAvailableZoneIds();
        java.util.stream.Stream<java.lang.String> strStream5 = strSet4.parallelStream();
        boolean boolean7 = strSet4.remove((java.lang.Object) 0);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.LocalTime localTime18 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime19 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime18);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime22 = localTime18.with((java.time.temporal.TemporalField) chronoField20, (long) (short) 1);
        long long23 = localTime12.getLong((java.time.temporal.TemporalField) chronoField20);
        java.time.LocalTime localTime25 = localTime12.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange27 = localTime25.range((java.time.temporal.TemporalField) chronoField26);
        boolean boolean28 = strSet4.remove((java.lang.Object) chronoField26);
        boolean boolean29 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet4);
        java.util.Spliterator<java.lang.String> strSpliterator30 = strSet0.spliterator();
        int int31 = strSpliterator30.characteristics();
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(strStream1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(strSpliterator3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strStream5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField20.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3601000000001L + "'", long23 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField26.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strSpliterator30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 65 + "'", int31 == 65);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(0L);
        java.util.OptionalLong optionalLong2 = longStream1.min();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream3 = longStream1.sorted();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(optionalLong2);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime9 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime10 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime9);
        java.time.LocalTime localTime15 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime16 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime15);
        java.time.temporal.ChronoField chronoField17 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime19 = localTime15.with((java.time.temporal.TemporalField) chronoField17, (long) (short) 1);
        long long20 = localTime9.getLong((java.time.temporal.TemporalField) chronoField17);
        java.time.LocalTime localTime22 = localTime9.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField23 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange24 = localTime22.range((java.time.temporal.TemporalField) chronoField23);
        java.time.LocalTime localTime30 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime31 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime30);
        java.time.LocalTime localTime36 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime37 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime36);
        java.time.temporal.ChronoField chronoField38 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime40 = localTime36.with((java.time.temporal.TemporalField) chronoField38, (long) (short) 1);
        long long41 = localTime30.getLong((java.time.temporal.TemporalField) chronoField38);
        java.time.LocalTime localTime43 = localTime30.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField44 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange45 = localTime43.range((java.time.temporal.TemporalField) chronoField44);
        int int46 = valueRange24.checkValidIntValue((long) 2022, (java.time.temporal.TemporalField) chronoField44);
        java.time.temporal.ValueRange valueRange47 = localTime4.range((java.time.temporal.TemporalField) chronoField44);
        java.time.temporal.TemporalField temporalField49 = null;
        long long50 = valueRange47.checkValidValue((long) 8, temporalField49);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + chronoField17 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField17.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3601000000001L + "'", long20 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + chronoField23 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField23.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange24);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertTrue("'" + chronoField38 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField38.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 3601000000001L + "'", long41 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertTrue("'" + chronoField44 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField44.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2022 + "'", int46 == 2022);
        org.junit.Assert.assertNotNull(valueRange47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 8L + "'", long50 == 8L);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration1 = java.time.Duration.parse((java.lang.CharSequence) "UNDERFLOW");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Duration");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours4 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay1, (org.joda.time.ReadablePartial) timeOfDay3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay3.withFieldAdded(durationFieldType5, (int) (byte) 0);
        int int8 = timeOfDay3.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay3.plusHours(9);
        org.joda.time.TimeOfDay.Property property11 = timeOfDay3.secondOfMinute();
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate15 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset14);
        boolean boolean16 = property11.equals((java.lang.Object) localDate15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay18 = property11.setCopy("parsecasesensitive(false)(value(year,4,10,exceeds_pad)'-'value(monthofyear,2)'-'value(dayofmonth,2))[offset(+hh:mm:ss,'z')] (UNDERFLOW,Years)");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"parsecasesensitive(false)(value(year,4,10,exceeds_pad)'-'value(monthofyear,2)'-'value(dayofmonth,2))[offset(+hh:mm:ss,'z')] (UNDERFLOW,Years)\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.normalizedStandard();
        org.joda.time.Period period3 = period1.minusMinutes((int) ' ');
        org.joda.time.Period period5 = period3.minusDays(4);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime1 = offsetTime0.toLocalTime();
        java.time.OffsetTime offsetTime2 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime3 = offsetTime2.toLocalTime();
        java.lang.String str4 = offsetTime2.toString();
        java.time.Duration duration5 = java.time.Duration.ZERO;
        java.lang.String str6 = duration5.toString();
        java.time.OffsetTime offsetTime7 = offsetTime2.plus((java.time.temporal.TemporalAmount) duration5);
        java.time.OffsetTime offsetTime9 = offsetTime2.plusNanos((long) 0);
        java.time.LocalTime localTime14 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime15 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime14);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime18 = localTime14.with((java.time.temporal.TemporalField) chronoField16, (long) (short) 1);
        java.util.Locale locale19 = java.util.Locale.GERMANY;
        java.lang.String str20 = chronoField16.getDisplayName(locale19);
        java.time.OffsetTime offsetTime22 = offsetTime9.with((java.time.temporal.TemporalField) chronoField16, (long) 28);
        long long23 = localTime1.getLong((java.time.temporal.TemporalField) chronoField16);
        java.time.temporal.TemporalAccessor temporalAccessor24 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long25 = chronoField16.getFrom(temporalAccessor24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23:59:59.999999999-18:00" + "'", str4, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0S" + "'", str6, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(offsetTime9);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField16.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NanoOfDay" + "'", str20, "NanoOfDay");
        org.junit.Assert.assertNotNull(offsetTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 86399999999999L + "'", long23 == 86399999999999L);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) ':', 127, (-10), (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.util.Hashtable<org.joda.time.PeriodType, java.net.SocketException> periodTypeMap2 = new java.util.Hashtable<org.joda.time.PeriodType, java.net.SocketException>(4, (float) 2097);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        org.joda.time.YearMonthDay yearMonthDay7 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = gregorianCalendar5.getActualMinimum((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(yearMonthDay7);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.nio.LongBuffer longBuffer1 = java.nio.LongBuffer.allocate((int) (short) 0);
        long[] longArray2 = longBuffer1.array();
        java.nio.ByteOrder byteOrder3 = longBuffer1.order();
        org.junit.Assert.assertNotNull(longBuffer1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.net.UnknownHostException unknownHostException1 = new java.net.UnknownHostException("CHN");
        java.security.SignatureException signatureException2 = new java.security.SignatureException((java.lang.Throwable) unknownHostException1);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.years();
        org.joda.time.format.PeriodFormatter periodFormatter4 = periodFormatter2.withParseType(periodType3);
        org.joda.time.format.PeriodPrinter periodPrinter5 = periodFormatter2.getPrinter();
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodFormatter4);
        org.junit.Assert.assertNull(periodPrinter5);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        java.util.stream.IntStream intStream4 = intStream2.skip((long) 256);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = intStream2.toArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.normalizedStandard();
        org.joda.time.Period period3 = period0.plusHours(2);
        org.joda.time.Period period5 = period0.plusHours(28);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.io.UnsupportedEncodingException unsupportedEncodingException2 = new java.io.UnsupportedEncodingException("1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z");
        java.io.IOException iOException3 = new java.io.IOException("PT2147483647M", (java.lang.Throwable) unsupportedEncodingException2);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.time.LocalTime localTime1 = java.time.LocalTime.ofNanoOfDay((long) 3600000);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.time.Month month0 = java.time.Month.AUGUST;
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.AUGUST + "'", month0.equals(java.time.Month.AUGUST));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, 2097, 8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2097 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        org.joda.time.MutablePeriod mutablePeriod3 = weeks0.toMutablePeriod();
        int int4 = mutablePeriod3.getSeconds();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 3, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.DateTime dateTime10 = interval9.getEnd();
        mutablePeriod3.setPeriod((org.joda.time.ReadableInterval) interval9);
        boolean boolean13 = interval9.contains((long) 7);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(0L);
        java.util.stream.LongStream longStream2 = longStream1.unordered();
        boolean boolean3 = longStream1.isParallel();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray4 = longStream1.toArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream7 = printStream3.append((java.lang.CharSequence) "Mon", 59, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -57");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 3, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) dateTime5, chronology7);
        org.joda.time.DateTime dateTime9 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.LocalTime localTime11 = localTime2.plusHours(3);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 3, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfYear();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.Period period17 = org.joda.time.Period.ZERO;
        org.joda.time.Period period18 = period17.normalizedStandard();
        org.joda.time.Period period20 = period18.minusMinutes((int) ' ');
        org.joda.time.Period period22 = period20.withMinutes(32769);
        boolean boolean23 = interval16.equals((java.lang.Object) period22);
        org.joda.time.LocalTime localTime25 = localTime11.withPeriodAdded((org.joda.time.ReadablePeriod) period22, (int) (byte) 100);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withYearOfCentury((int) 'a');
        int int30 = localDateTime29.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withMinuteOfHour((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks33 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadablePartial) localTime25, (org.joda.time.ReadablePartial) localDateTime32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 21 + "'", int30 == 21);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.LocalTime localTime6 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime6);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime16 = localTime12.with((java.time.temporal.TemporalField) chronoField14, (long) (short) 1);
        long long17 = localTime6.getLong((java.time.temporal.TemporalField) chronoField14);
        java.time.LocalTime localTime19 = localTime6.withSecond((int) (short) 1);
        java.lang.Object obj21 = properties1.put((java.lang.Object) localTime19, (java.lang.Object) "117");
        java.lang.Object obj22 = properties1.clone();
        properties1.clear();
        int int24 = properties1.size();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime29 = property27.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime31 = property27.addToCopy(21);
        java.lang.Object obj32 = properties1.get((java.lang.Object) 21);
        java.io.OutputStream outputStream33 = null;
        java.io.FilterOutputStream filterOutputStream34 = new java.io.FilterOutputStream(outputStream33);
        java.io.PrintStream printStream36 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream34, false);
        // The following exception was thrown during execution in test generation
        try {
            properties1.save((java.io.OutputStream) printStream36, "Stunde");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3601000000001L + "'", long17 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{01:00:01.000000001=117}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{01:00:01.000000001=117}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{01:00:01.000000001=117}");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours4 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay1, (org.joda.time.ReadablePartial) timeOfDay3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay3.withFieldAdded(durationFieldType5, (int) (byte) 0);
        int int8 = timeOfDay3.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay3.plusHours(9);
        org.joda.time.TimeOfDay.Property property11 = timeOfDay3.secondOfMinute();
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate15 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset14);
        boolean boolean16 = property11.equals((java.lang.Object) localDate15);
        org.joda.time.DateTimeField dateTimeField17 = property11.getField();
        int int18 = property11.get();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay20 = property11.setCopy("IntSummaryStatistics{count=0, sum=0, min=2147483647, average=0.000000, max=-2147483648}");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"IntSummaryStatistics{count=0, sum=0, min=2147483647, average=0.000000, max=-2147483648}\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.Period period3 = org.joda.time.Period.ZERO;
        org.joda.time.Period period4 = period3.normalizedStandard();
        org.joda.time.Period period6 = period4.minusMinutes((int) ' ');
        org.joda.time.Period period8 = period6.minusMonths((int) (byte) 0);
        org.joda.time.PeriodType periodType9 = period8.getPeriodType();
        org.joda.time.DateTime dateTime10 = dateTime2.minus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.DateTime dateTime12 = dateTime2.plusHours(34);
        org.joda.time.DateTime dateTime14 = dateTime12.minusSeconds((int) '#');
        org.joda.time.Period period19 = new org.joda.time.Period((int) '#', 0, 2, (int) (short) 100);
        org.joda.time.Period period21 = period19.withSeconds(12);
        int int22 = period21.getMillis();
        org.joda.time.DateTime dateTime23 = dateTime14.plus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 3, chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfYear();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 3, chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.dayOfYear();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((java.lang.Object) dateTime30, chronology32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight33.withDayOfYear((int) ' ');
        int int38 = dateMidnight33.getWeekOfWeekyear();
        long long39 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.Interval interval40 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period21, (org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.DateTime dateTime41 = interval40.getStart();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            filterOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime8 = localTime4.with((java.time.temporal.TemporalField) chronoField6, (long) (short) 1);
        java.time.Duration duration10 = java.time.Duration.ofMinutes((long) 3);
        java.time.LocalTime localTime11 = localTime4.minus((java.time.temporal.TemporalAmount) duration10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime13 = localTime4.withSecond(4200);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfMinute (valid values 0 - 59): 4200");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField6.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.NANO_OF_SECOND;
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime2 = offsetTime1.toLocalTime();
        java.lang.String str3 = offsetTime1.toString();
        java.time.temporal.ValueRange valueRange4 = chronoField0.rangeRefinedBy((java.time.temporal.TemporalAccessor) offsetTime1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = property7.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = property7.addToCopy(21);
        org.joda.time.LocalDateTime localDateTime12 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfYear();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundFloorCopy();
        boolean boolean15 = valueRange4.equals((java.lang.Object) localDateTime14);
        boolean boolean17 = valueRange4.isValidIntValue(86400000L);
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.NANO_OF_SECOND + "'", chronoField0.equals(java.time.temporal.ChronoField.NANO_OF_SECOND));
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23:59:59.999999999-18:00" + "'", str3, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(valueRange4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.Chronology chronology1 = java.time.chrono.Chronology.of("java.io.FileNotFoundException");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unknown chronology: java.io.FileNotFoundException");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        short[] shortArray2 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer3 = java.nio.ShortBuffer.wrap(shortArray2);
        short[] shortArray6 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer7 = java.nio.ShortBuffer.wrap(shortArray6);
        java.nio.ShortBuffer shortBuffer8 = shortBuffer3.put(shortBuffer7);
        int int9 = shortBuffer8.limit();
        java.nio.Buffer buffer10 = shortBuffer8.clear();
        // The following exception was thrown during execution in test generation
        try {
            short short12 = shortBuffer8.get(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(buffer10);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        org.joda.time.Days days7 = org.joda.time.Days.ONE;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) days7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 3, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfYear();
        org.joda.time.Interval interval13 = property12.toInterval();
        mutableInterval8.setInterval((org.joda.time.ReadableInterval) interval13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 3, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfYear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((java.lang.Object) dateTime17, chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime17.toMutableDateTime();
        org.joda.time.Days days22 = org.joda.time.Days.ONE;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadablePeriod) days22);
        mutableInterval8.setInterval((org.joda.time.ReadableInterval) mutableInterval23);
        mutableInterval8.setStartMillis((long) 9);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 3, chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.dayOfYear();
        org.joda.time.Interval interval31 = property30.toInterval();
        org.joda.time.DateTimeField dateTimeField32 = property30.getField();
        org.joda.time.DateTime dateTime34 = property30.addToCopy((long) (byte) 1);
        org.joda.time.DateTime dateTime36 = dateTime34.withYear(4);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval8.setEnd((org.joda.time.ReadableInstant) dateTime36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.nio.LongBuffer longBuffer3 = java.nio.LongBuffer.allocate((int) (short) 0);
        java.nio.Buffer buffer4 = longBuffer3.mark();
        boolean boolean5 = properties1.containsKey((java.lang.Object) longBuffer3);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = java.time.ZoneId.SHORT_IDS;
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean8 = strMap6.containsValue((java.lang.Object) dateTimeFieldType7);
        properties1.putAll(strMap6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfCentury();
        org.joda.time.LocalDate localDate13 = localDateTime11.toLocalDate();
        org.joda.time.Period period14 = org.joda.time.Period.ZERO;
        org.joda.time.Period period15 = period14.normalizedStandard();
        org.joda.time.Period period17 = period14.plusHours(2);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.hours();
        int int19 = period14.indexOf(durationFieldType18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = strMap6.remove((java.lang.Object) localDate13, (java.lang.Object) durationFieldType18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longBuffer3);
        org.junit.Assert.assertNotNull(buffer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes2 = minutes0.minus(12);
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes5 = minutes3.minus(12);
        org.joda.time.Minutes minutes6 = minutes0.minus(minutes3);
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes9 = minutes7.minus(12);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes12 = minutes10.minus(12);
        java.lang.String str13 = minutes10.toString();
        org.joda.time.Minutes minutes14 = minutes7.minus(minutes10);
        boolean boolean15 = minutes6.isLessThan(minutes10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes17 = minutes10.plus(34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483647 + 34");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT2147483647M" + "'", str13, "PT2147483647M");
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.unordered();
        java.util.function.DoubleToIntFunction doubleToIntFunction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream3 = doubleStream0.mapToInt(doubleToIntFunction2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        byte[] byteArray5 = charsetEncoder4.replacement();
        java.nio.charset.Charset charset6 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder7 = charset6.newDecoder();
        float float8 = charsetDecoder7.maxCharsPerByte();
        float float9 = charsetDecoder7.averageCharsPerByte();
        java.nio.charset.CodingErrorAction codingErrorAction10 = charsetDecoder7.unmappableCharacterAction();
        java.nio.charset.CharsetEncoder charsetEncoder11 = charsetEncoder4.onUnmappableCharacter(codingErrorAction10);
        boolean boolean13 = charsetEncoder4.canEncode((java.lang.CharSequence) "minuteOfDay");
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[63]");
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(charsetDecoder7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(codingErrorAction10);
        org.junit.Assert.assertNotNull(charsetEncoder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.util.TimeZone timeZone7 = gregorianCalendar5.getTimeZone();
        int int9 = timeZone7.getOffset((long) 14);
        boolean boolean10 = timeZone7.useDaylightTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.time.Period period1 = java.time.Period.ofYears(28);
        java.time.Period period3 = java.time.Period.ofYears(28);
        java.time.Period period4 = period1.minus((java.time.temporal.TemporalAmount) period3);
        java.time.Period period6 = period4.withDays((int) (byte) 100);
        java.time.LocalTime localTime11 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime12 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime11);
        java.time.temporal.ChronoField chronoField13 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime15 = localTime11.with((java.time.temporal.TemporalField) chronoField13, (long) (short) 1);
        java.time.Duration duration17 = java.time.Duration.ofMinutes((long) 3);
        java.time.LocalTime localTime18 = localTime11.minus((java.time.temporal.TemporalAmount) duration17);
        java.time.Duration duration20 = duration17.minusNanos((long) 14);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoPeriod chronoPeriod21 = period4.minus((java.time.temporal.TemporalAmount) duration17);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unit must be Years, Months or Days, but was Seconds");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + chronoField13 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField13.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(duration20);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime1 = offsetTime0.toLocalTime();
        java.lang.String str2 = offsetTime0.toString();
        java.time.OffsetTime offsetTime3 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime4 = offsetTime3.toLocalTime();
        boolean boolean5 = offsetTime0.isBefore(offsetTime3);
        java.time.LocalDate localDate7 = java.time.LocalDate.ofEpochDay((long) ' ');
        java.time.OffsetTime offsetTime8 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime9 = offsetTime8.toLocalTime();
        java.lang.String str10 = offsetTime8.toString();
        java.time.Duration duration11 = java.time.Duration.ZERO;
        java.lang.String str12 = duration11.toString();
        java.time.OffsetTime offsetTime13 = offsetTime8.plus((java.time.temporal.TemporalAmount) duration11);
        java.time.LocalTime localTime14 = offsetTime8.toLocalTime();
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime15 = localDate7.atTime(localTime14);
        java.time.LocalDate localDate17 = localDate7.plusMonths(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal18 = offsetTime0.with((java.time.temporal.TemporalAdjuster) localDate7);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: EpochDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23:59:59.999999999-18:00" + "'", str2, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(offsetTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(offsetTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "23:59:59.999999999-18:00" + "'", str10, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT0S" + "'", str12, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone10);
        long long14 = dateTimeZone10.convertLocalToUTC((long) 3, false);
        org.joda.time.Interval interval15 = new org.joda.time.Interval(10L, (long) 2097, dateTimeZone10);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(28L, dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(57, 2147483647, (int) '+', (int) '.', 4096, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusMillis(2022);
        org.joda.time.LocalTime localTime6 = localTime2.plusMillis((int) (byte) 0);
        int int7 = localTime6.getMillisOfDay();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours9 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) localTime6, (org.joda.time.ReadablePartial) yearMonthDay8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        int int6 = dateTimeField5.getMaximumValue();
        org.joda.time.DurationField durationField7 = dateTimeField5.getLeapDurationField();
        boolean boolean8 = dateTimeField5.isSupported();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 366 + "'", int6 == 366);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.weekyears();
        org.joda.time.DurationField durationField6 = chronology3.seconds();
        org.joda.time.Chronology chronology7 = chronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.hourOfDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusSeconds(6);
        org.joda.time.DateTime dateTime15 = localDateTime12.toDateTime();
        int int16 = localDateTime12.getMinuteOfHour();
        int[] intArray23 = new int[] { 3600000, 3600000, 256, 21, (byte) 100, (short) -1 };
        java.util.stream.IntStream intStream24 = java.util.stream.IntStream.of(intArray23);
        // The following exception was thrown during execution in test generation
        try {
            chronology3.validate((org.joda.time.ReadablePartial) localDateTime12, intArray23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3600000 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[3600000, 3600000, 256, 21, 100, -1]");
        org.junit.Assert.assertNotNull(intStream24);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("1", "Chinese (China)", (int) '.', "zh-CN", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: 1");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        int int6 = dateTimeField5.getMaximumValue();
        org.joda.time.DurationField durationField7 = dateTimeField5.getLeapDurationField();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYearOfCentury((int) 'a');
        int int12 = localDateTime11.getDayOfMonth();
        int int13 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDateTime11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime11.withTime(34, (int) (byte) 100, 28, 17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 366 + "'", int6 == 366);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 365 + "'", int13 == 365);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.text.Format.Field field0 = null;
        java.text.FieldPosition fieldPosition1 = new java.text.FieldPosition(field0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = duration4.toPeriodTo(readableInstant5, periodType6);
        org.joda.time.Days days8 = period7.toStandardDays();
        boolean boolean9 = fieldPosition1.equals((java.lang.Object) days8);
        org.joda.time.Weeks weeks10 = days8.toStandardWeeks();
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(weeks10);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.normalizedStandard();
        org.joda.time.Period period3 = period1.minusMinutes((int) ' ');
        org.joda.time.Period period5 = period3.minusMonths((int) (byte) 0);
        org.joda.time.Period period7 = period3.withMinutes((int) 'a');
        org.joda.time.Period period9 = period7.plusMinutes(65);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Interval interval1 = localDate0.toInterval();
        int int2 = localDate0.getDayOfYear();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 3600000, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 22, dateTimeZone7);
        org.joda.time.Interval interval11 = localDate0.toInterval(dateTimeZone7);
        long long12 = interval11.toDurationMillis();
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 86400000L + "'", long12 == 86400000L);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 0, chronology3);
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.monthOfYear();
        org.joda.time.Period period9 = new org.joda.time.Period(3601000000001L, periodType1, chronology5);
        org.joda.time.MutablePeriod mutablePeriod10 = period9.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(readableInstant11, readableInstant12);
        org.joda.time.Seconds seconds14 = duration13.toStandardSeconds();
        int int15 = seconds14.getSeconds();
        org.joda.time.Seconds seconds17 = seconds14.dividedBy(28);
        org.joda.time.Seconds seconds18 = seconds17.negated();
        org.joda.time.DurationFieldType durationFieldType19 = seconds18.getFieldType();
        boolean boolean20 = mutablePeriod10.isSupported(durationFieldType19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getDurationType();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod10.add(durationFieldType22, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'halfdays'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(durationFieldType22);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int3 = localDate2.getMonthValue();
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.Period period5 = period4.normalizedStandard();
        org.joda.time.Period period7 = period4.plusHours(2);
        java.time.chrono.IsoEra isoEra8 = java.time.chrono.IsoEra.CE;
        boolean boolean9 = period7.equals((java.lang.Object) isoEra8);
        java.time.LocalTime localTime14 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime15 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime14);
        java.time.LocalTime localTime20 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime21 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime20);
        java.time.temporal.ChronoField chronoField22 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime24 = localTime20.with((java.time.temporal.TemporalField) chronoField22, (long) (short) 1);
        long long25 = localTime14.getLong((java.time.temporal.TemporalField) chronoField22);
        boolean boolean26 = isoEra8.isSupported((java.time.temporal.TemporalField) chronoField22);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery27 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period28 = isoEra8.query(periodTemporalQuery27);
        boolean boolean29 = period28.isNegative();
        java.time.Period period31 = period28.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean33 = period28.equals((java.lang.Object) chronoField32);
        boolean boolean34 = localDate2.isSupported((java.time.temporal.TemporalField) chronoField32);
        java.time.temporal.TemporalUnit temporalUnit35 = chronoField32.getRangeUnit();
        java.time.OffsetDateTime offsetDateTime36 = offsetDateTime0.truncatedTo(temporalUnit35);
        java.time.LocalDate localDate39 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int40 = localDate39.getMonthValue();
        org.joda.time.Period period41 = org.joda.time.Period.ZERO;
        org.joda.time.Period period42 = period41.normalizedStandard();
        org.joda.time.Period period44 = period41.plusHours(2);
        java.time.chrono.IsoEra isoEra45 = java.time.chrono.IsoEra.CE;
        boolean boolean46 = period44.equals((java.lang.Object) isoEra45);
        java.time.LocalTime localTime51 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime52 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime51);
        java.time.LocalTime localTime57 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime58 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime57);
        java.time.temporal.ChronoField chronoField59 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime61 = localTime57.with((java.time.temporal.TemporalField) chronoField59, (long) (short) 1);
        long long62 = localTime51.getLong((java.time.temporal.TemporalField) chronoField59);
        boolean boolean63 = isoEra45.isSupported((java.time.temporal.TemporalField) chronoField59);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery64 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period65 = isoEra45.query(periodTemporalQuery64);
        boolean boolean66 = period65.isNegative();
        java.time.Period period68 = period65.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField69 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean70 = period65.equals((java.lang.Object) chronoField69);
        boolean boolean71 = localDate39.isSupported((java.time.temporal.TemporalField) chronoField69);
        java.time.temporal.TemporalUnit temporalUnit72 = chronoField69.getRangeUnit();
        java.time.OffsetDateTime offsetDateTime73 = offsetDateTime36.minus(8L, temporalUnit72);
        java.time.LocalTime localTime74 = offsetDateTime36.toLocalTime();
        java.time.LocalTime localTime79 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime80 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime79);
        java.time.temporal.ChronoField chronoField81 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime83 = localTime79.with((java.time.temporal.TemporalField) chronoField81, (long) (short) 1);
        java.time.Duration duration85 = java.time.Duration.ofMinutes((long) 3);
        java.time.LocalTime localTime86 = localTime79.minus((java.time.temporal.TemporalAmount) duration85);
        java.time.Duration duration88 = duration85.multipliedBy((long) (byte) -1);
        boolean boolean89 = localTime74.equals((java.lang.Object) duration85);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + isoEra8 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra8.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + chronoField22 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField22.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3601000000001L + "'", long25 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit35 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit35.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(offsetDateTime36);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + isoEra45 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra45.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertTrue("'" + chronoField59 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField59.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 3601000000001L + "'", long62 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertTrue("'" + chronoField69 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField69.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit72 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit72.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(offsetDateTime73);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(localTime79);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertTrue("'" + chronoField81 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField81.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime83);
        org.junit.Assert.assertNotNull(duration85);
        org.junit.Assert.assertNotNull(localTime86);
        org.junit.Assert.assertNotNull(duration88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 3, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfYear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((java.lang.Object) dateTime3, chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime3.toMutableDateTime();
        mutableDateTime7.addYears((int) (short) 100);
        org.joda.time.Period period10 = org.joda.time.Period.ZERO;
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours15 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay12, (org.joda.time.ReadablePartial) timeOfDay14);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay14.withFieldAdded(durationFieldType16, (int) (byte) 0);
        org.joda.time.Period period20 = period10.withFieldAdded(durationFieldType16, 4);
        mutableDateTime7.add((org.joda.time.ReadablePeriod) period10);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) period10, (int) (short) 10);
        org.joda.time.Period period25 = period10.plusSeconds((int) '4');
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            printStream3.print(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 0, chronology2);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = chronology4.weekyears();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 21, chronology4);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) 0, chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 3, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) dateTime13, chronology15);
        org.joda.time.DateTime dateTime17 = localTime10.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.LocalTime localTime19 = localTime10.plusHours(3);
        int int20 = localTime19.getMillisOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 3, chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfYear();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.DateTimeField dateTimeField26 = property24.getField();
        java.util.Locale locale31 = new java.util.Locale("ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]", "UNDERFLOW", "Years");
        java.lang.String str32 = dateTimeField26.getAsShortText((int) 'u', locale31);
        java.util.GregorianCalendar gregorianCalendar38 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int39 = gregorianCalendar38.getWeeksInWeekYear();
        org.joda.time.YearMonthDay yearMonthDay40 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar38);
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay40.withYear(0);
        java.util.stream.IntStream intStream45 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        int[] intArray46 = intStream45.toArray();
        int int47 = dateTimeField26.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay42, intArray46);
        // The following exception was thrown during execution in test generation
        try {
            chronology4.validate((org.joda.time.ReadablePartial) localTime19, intArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10800000 + "'", int20 == 10800000);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertEquals(locale31.toString(), "parsecasesensitive(false)(value(year,4,10,exceeds_pad)'-'value(monthofyear,2)'-'value(dayofmonth,2))[offset(+hh:mm:ss,'z')]_UNDERFLOW_Years");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "117" + "'", str32, "117");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertNotNull(yearMonthDay40);
        org.junit.Assert.assertNotNull(yearMonthDay42);
        org.junit.Assert.assertNotNull(intStream45);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale locale6 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray7 = new java.util.Locale[] { locale6 };
        java.util.ArrayList<java.util.Locale> localeList8 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList8, localeArray7);
        java.util.List<java.util.Locale> localeList10 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList8);
        localeList10.clear();
        java.util.List<java.util.Locale> localeList12 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale19 };
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList21);
        localeList23.clear();
        java.util.List<java.util.Locale> localeList25 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList23);
        java.util.List<java.util.Locale> localeList26 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList25);
        java.util.ListIterator<java.util.Locale> localeItor27 = localeList25.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale28 = localeItor27.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localeList10);
        org.junit.Assert.assertNotNull(localeList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localeList23);
        org.junit.Assert.assertNotNull(localeList25);
        org.junit.Assert.assertNotNull(localeList26);
        org.junit.Assert.assertNotNull(localeItor27);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        int int0 = java.util.Spliterator.CONCURRENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate.Property property2 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate4 = property2.addToCopy(2097);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate4.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.normalizedStandard();
        org.joda.time.Period period3 = period0.plusHours(2);
        java.time.chrono.IsoEra isoEra4 = java.time.chrono.IsoEra.CE;
        boolean boolean5 = period3.equals((java.lang.Object) isoEra4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.LocalTime localTime16 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime16);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime20 = localTime16.with((java.time.temporal.TemporalField) chronoField18, (long) (short) 1);
        long long21 = localTime10.getLong((java.time.temporal.TemporalField) chronoField18);
        boolean boolean22 = isoEra4.isSupported((java.time.temporal.TemporalField) chronoField18);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery23 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period24 = isoEra4.query(periodTemporalQuery23);
        boolean boolean25 = period24.isNegative();
        java.time.Period period27 = period24.plusDays((long) ' ');
        boolean boolean28 = period24.isNegative();
        java.time.Period period30 = period24.minusYears((long) 10);
        org.joda.time.Period period31 = org.joda.time.Period.ZERO;
        org.joda.time.Period period32 = period31.normalizedStandard();
        org.joda.time.Period period34 = period31.plusHours(2);
        java.time.chrono.IsoEra isoEra35 = java.time.chrono.IsoEra.CE;
        boolean boolean36 = period34.equals((java.lang.Object) isoEra35);
        java.time.LocalTime localTime41 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime42 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime41);
        java.time.LocalTime localTime47 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime48 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime47);
        java.time.temporal.ChronoField chronoField49 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime51 = localTime47.with((java.time.temporal.TemporalField) chronoField49, (long) (short) 1);
        long long52 = localTime41.getLong((java.time.temporal.TemporalField) chronoField49);
        boolean boolean53 = isoEra35.isSupported((java.time.temporal.TemporalField) chronoField49);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery54 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period55 = isoEra35.query(periodTemporalQuery54);
        java.time.chrono.ChronoPeriod chronoPeriod56 = period30.minus((java.time.temporal.TemporalAmount) period55);
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList57 = period55.getUnits();
        int int58 = period55.getMonths();
        java.time.temporal.TemporalAmount temporalAmount59 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period60 = period55.plus(temporalAmount59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: amount");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + isoEra4 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra4.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3601000000001L + "'", long21 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + isoEra35 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra35.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + chronoField49 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField49.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 3601000000001L + "'", long52 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(chronoPeriod56);
        org.junit.Assert.assertNotNull(temporalUnitList57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.MIN;
        java.time.Month month2 = java.time.Month.NOVEMBER;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime3 = localDateTime1.with((java.time.temporal.TemporalAdjuster) month2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.of(1970, month2, 12, 12, (int) '4', 83400);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfMinute (valid values 0 - 59): 83400");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + month2 + "' != '" + java.time.Month.NOVEMBER + "'", month2.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime3);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = printStream3.checkError();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.text.Format format1 = dateTimeFormatter0.toFormat();
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = format1.parseObject("PT2147483647M", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: position");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(format1);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.util.Comparator<java.time.chrono.ChronoZonedDateTime<?>> wildcardChronoZonedDateTimeComparator0 = java.time.chrono.ChronoZonedDateTime.timeLineOrder();
        org.junit.Assert.assertNotNull(wildcardChronoZonedDateTimeComparator0);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.time.Month month0 = java.time.Month.DECEMBER;
        int int1 = month0.getValue();
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery2 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period3 = month0.query(periodTemporalQuery2);
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.MICRO_OF_DAY;
        java.time.LocalTime localTime9 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime10 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime9);
        java.time.LocalTime localTime15 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime16 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime15);
        java.time.temporal.ChronoField chronoField17 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime19 = localTime15.with((java.time.temporal.TemporalField) chronoField17, (long) (short) 1);
        long long20 = localTime9.getLong((java.time.temporal.TemporalField) chronoField17);
        java.time.LocalTime localTime22 = chronoField4.adjustInto(localTime9, (long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = month0.getLong((java.time.temporal.TemporalField) chronoField4);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MicroOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.DECEMBER + "'", month0.equals(java.time.Month.DECEMBER));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
        org.junit.Assert.assertNotNull(periodTemporalQuery2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_DAY + "'", chronoField4.equals(java.time.temporal.ChronoField.MICRO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + chronoField17 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField17.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3601000000001L + "'", long20 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime22);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Chinese (Taiwan)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        byte[] byteArray3 = new byte[] { (byte) 100 };
        filterOutputStream1.write(byteArray3, (int) (byte) 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.wrap(byteArray3);
        java.nio.LongBuffer longBuffer8 = byteBuffer7.asLongBuffer();
        boolean boolean9 = longBuffer8.isDirect();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(longBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        int[] intArray6 = period5.getValues();
        java.util.stream.IntStream intStream7 = java.util.stream.IntStream.of(intArray6);
        java.util.function.IntPredicate intPredicate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = intStream7.noneMatch(intPredicate8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusMillis(2022);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) 0, chronology6);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(chronology8);
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfDay();
        org.joda.time.DurationField durationField12 = chronology8.eras();
        org.joda.time.Chronology chronology13 = chronology8.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) 2022, chronology8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) 1);
        org.joda.time.Period period3 = period1.minusMonths((int) 'u');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) ' ');
        java.time.OffsetTime offsetTime2 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime3 = offsetTime2.toLocalTime();
        java.lang.String str4 = offsetTime2.toString();
        java.time.Duration duration5 = java.time.Duration.ZERO;
        java.lang.String str6 = duration5.toString();
        java.time.OffsetTime offsetTime7 = offsetTime2.plus((java.time.temporal.TemporalAmount) duration5);
        java.time.LocalTime localTime8 = offsetTime2.toLocalTime();
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime9 = localDate1.atTime(localTime8);
        java.time.LocalDate localDate11 = localDate1.minusWeeks((long) 2097);
        java.time.LocalDate localDate13 = localDate11.minusMonths((long) (byte) 0);
        java.time.format.FormatStyle formatStyle14 = java.time.format.FormatStyle.LONG;
        java.time.format.FormatStyle formatStyle15 = java.time.format.FormatStyle.LONG;
        java.time.format.DateTimeFormatter dateTimeFormatter16 = java.time.format.DateTimeFormatter.ofLocalizedDateTime(formatStyle14, formatStyle15);
        java.time.format.DateTimeFormatter dateTimeFormatter17 = java.time.format.DateTimeFormatter.ofLocalizedTime(formatStyle14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = localDate11.format(dateTimeFormatter17);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfAmPm");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23:59:59.999999999-18:00" + "'", str4, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0S" + "'", str6, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + formatStyle14 + "' != '" + java.time.format.FormatStyle.LONG + "'", formatStyle14.equals(java.time.format.FormatStyle.LONG));
        org.junit.Assert.assertTrue("'" + formatStyle15 + "' != '" + java.time.format.FormatStyle.LONG + "'", formatStyle15.equals(java.time.format.FormatStyle.LONG));
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.years();
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter3.withParseType(periodType4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = org.joda.time.Period.parse("hi!", periodFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodFormatter5);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate.Property property2 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate4 = property2.addToCopy(7);
        org.joda.time.LocalDate.Property property5 = localDate4.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDate4.getValue(366);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 366");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.LocalDate localDate1 = offsetDateTime0.toLocalDate();
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusHours(2);
        java.time.chrono.IsoEra isoEra6 = java.time.chrono.IsoEra.CE;
        boolean boolean7 = period5.equals((java.lang.Object) isoEra6);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.LocalTime localTime18 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime19 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime18);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime22 = localTime18.with((java.time.temporal.TemporalField) chronoField20, (long) (short) 1);
        long long23 = localTime12.getLong((java.time.temporal.TemporalField) chronoField20);
        boolean boolean24 = isoEra6.isSupported((java.time.temporal.TemporalField) chronoField20);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery25 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period26 = isoEra6.query(periodTemporalQuery25);
        boolean boolean27 = period26.isNegative();
        java.time.Period period29 = period26.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField30 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean31 = period26.equals((java.lang.Object) chronoField30);
        java.time.chrono.ChronoPeriod chronoPeriod32 = period26.negated();
        java.time.OffsetDateTime offsetDateTime33 = java.time.OffsetDateTime.now();
        java.time.temporal.ChronoField chronoField34 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        boolean boolean35 = offsetDateTime33.isSupported((java.time.temporal.TemporalField) chronoField34);
        java.time.Month month36 = offsetDateTime33.getMonth();
        java.time.temporal.Temporal temporal37 = period26.addTo((java.time.temporal.Temporal) offsetDateTime33);
        java.time.chrono.ChronoLocalDate chronoLocalDate38 = localDate1.minus((java.time.temporal.TemporalAmount) period26);
        java.time.chrono.Chronology chronology39 = localDate1.getChronology();
        java.time.chrono.ChronoLocalDate chronoLocalDate41 = chronology39.dateEpochDay(86399L);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + isoEra6 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra6.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField20.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3601000000001L + "'", long23 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + chronoField30 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField30.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chronoPeriod32);
        org.junit.Assert.assertNotNull(offsetDateTime33);
        org.junit.Assert.assertTrue("'" + chronoField34 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField34.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + month36 + "' != '" + java.time.Month.FEBRUARY + "'", month36.equals(java.time.Month.FEBRUARY));
        org.junit.Assert.assertNotNull(temporal37);
        org.junit.Assert.assertNotNull(chronoLocalDate38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(chronoLocalDate41);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.normalizedStandard();
        org.joda.time.Period period3 = period0.plusHours(2);
        java.time.chrono.IsoEra isoEra4 = java.time.chrono.IsoEra.CE;
        boolean boolean5 = period3.equals((java.lang.Object) isoEra4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.LocalTime localTime16 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime16);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime20 = localTime16.with((java.time.temporal.TemporalField) chronoField18, (long) (short) 1);
        long long21 = localTime10.getLong((java.time.temporal.TemporalField) chronoField18);
        boolean boolean22 = isoEra4.isSupported((java.time.temporal.TemporalField) chronoField18);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery23 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period24 = isoEra4.query(periodTemporalQuery23);
        boolean boolean25 = period24.isNegative();
        java.time.Period period27 = period24.plusDays((long) ' ');
        boolean boolean28 = period24.isNegative();
        java.time.Period period30 = period24.minusYears((long) 10);
        org.joda.time.Period period31 = org.joda.time.Period.ZERO;
        org.joda.time.Period period32 = period31.normalizedStandard();
        org.joda.time.Period period34 = period31.plusHours(2);
        java.time.chrono.IsoEra isoEra35 = java.time.chrono.IsoEra.CE;
        boolean boolean36 = period34.equals((java.lang.Object) isoEra35);
        java.time.LocalTime localTime41 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime42 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime41);
        java.time.LocalTime localTime47 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime48 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime47);
        java.time.temporal.ChronoField chronoField49 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime51 = localTime47.with((java.time.temporal.TemporalField) chronoField49, (long) (short) 1);
        long long52 = localTime41.getLong((java.time.temporal.TemporalField) chronoField49);
        boolean boolean53 = isoEra35.isSupported((java.time.temporal.TemporalField) chronoField49);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery54 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period55 = isoEra35.query(periodTemporalQuery54);
        java.time.chrono.ChronoPeriod chronoPeriod56 = period30.minus((java.time.temporal.TemporalAmount) period55);
        java.time.chrono.ChronoPeriod chronoPeriod58 = period30.multipliedBy(4096);
        int int59 = period30.getMonths();
        java.time.chrono.IsoChronology isoChronology60 = period30.getChronology();
        java.time.ZoneOffset zoneOffset63 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate64 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset63);
        java.time.Clock clock65 = java.time.Clock.system((java.time.ZoneId) zoneOffset63);
        java.time.Duration duration67 = java.time.Duration.ofSeconds((long) 0);
        java.time.Duration duration69 = duration67.multipliedBy((long) (byte) -1);
        java.time.Clock clock70 = java.time.Clock.offset(clock65, duration67);
        java.time.chrono.ChronoLocalDate chronoLocalDate71 = isoChronology60.dateNow(clock65);
        java.time.OffsetTime offsetTime72 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime73 = offsetTime72.toLocalTime();
        java.lang.String str74 = offsetTime72.toString();
        java.time.OffsetTime offsetTime75 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime76 = offsetTime75.toLocalTime();
        boolean boolean77 = offsetTime72.isBefore(offsetTime75);
        java.time.OffsetTime offsetTime79 = offsetTime75.withHour(0);
        java.time.OffsetTime offsetTime81 = offsetTime79.minusMinutes((long) 127);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime82 = isoChronology60.localDateTime((java.time.temporal.TemporalAccessor) offsetTime79);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unable to obtain LocalDateTime from TemporalAccessor: 00:59:59.999999999-18:00 of type java.time.OffsetTime");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + isoEra4 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra4.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3601000000001L + "'", long21 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + isoEra35 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra35.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + chronoField49 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField49.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 3601000000001L + "'", long52 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(chronoPeriod56);
        org.junit.Assert.assertNotNull(chronoPeriod58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(isoChronology60);
        org.junit.Assert.assertNotNull(zoneOffset63);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertNotNull(clock65);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(clock70);
        org.junit.Assert.assertNotNull(chronoLocalDate71);
        org.junit.Assert.assertNotNull(offsetTime72);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "23:59:59.999999999-18:00" + "'", str74, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(offsetTime75);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(offsetTime79);
        org.junit.Assert.assertNotNull(offsetTime81);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.setYear(5);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 3, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.DateTimeField dateTimeField8 = property6.getField();
        org.joda.time.DateTime dateTime10 = property6.addToCopy((long) (byte) 1);
        org.joda.time.DateTime dateTime12 = dateTime10.withYear(4);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 3, chronology14);
        org.joda.time.Period period16 = org.joda.time.Period.ZERO;
        org.joda.time.Period period17 = period16.normalizedStandard();
        org.joda.time.Period period19 = period17.minusMinutes((int) ' ');
        org.joda.time.Period period21 = period19.minusMonths((int) (byte) 0);
        org.joda.time.PeriodType periodType22 = period21.getPeriodType();
        org.joda.time.DateTime dateTime23 = dateTime15.minus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Duration duration24 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime25 = dateTime12.withTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.security.GeneralSecurityException generalSecurityException2 = new java.security.GeneralSecurityException("NanoOfDay");
        java.util.concurrent.ExecutionException executionException3 = new java.util.concurrent.ExecutionException("Chinese", (java.lang.Throwable) generalSecurityException2);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        int int0 = java.util.Spliterator.SIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) 0, chronology8);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 1970, chronology10, locale11, (java.lang.Integer) 1);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(10, 21, 28, (int) 'a', 34, 34, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.nio.LongBuffer longBuffer1 = java.nio.LongBuffer.allocate((int) (short) 0);
        java.nio.Buffer buffer2 = longBuffer1.mark();
        java.time.LocalTime localTime7 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime7);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime11 = localTime7.with((java.time.temporal.TemporalField) chronoField9, (long) (short) 1);
        java.time.Duration duration13 = java.time.Duration.ofMinutes((long) 3);
        java.time.LocalTime localTime14 = localTime7.minus((java.time.temporal.TemporalAmount) duration13);
        boolean boolean15 = longBuffer1.equals((java.lang.Object) localTime7);
        java.nio.LongBuffer longBuffer16 = longBuffer1.slice();
        long[] longArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.LongBuffer longBuffer18 = longBuffer16.put(longArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField9.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(longBuffer16);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(6);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        org.joda.time.Duration duration11 = duration8.plus((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.minus((org.joda.time.ReadableDuration) duration11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withWeekOfWeekyear((int) '#');
        java.util.Date date15 = localDateTime14.toDate();
        int int16 = date15.getYear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Thu Aug 29 09:34:22 UTC 2097");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 197 + "'", int16 == 197);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate.Property property2 = localDate0.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = property2.getFieldType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes2 = minutes0.minus(12);
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes6 = minutes4.minus(12);
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes9 = minutes7.minus(12);
        java.lang.String str10 = minutes7.toString();
        org.joda.time.Minutes minutes11 = minutes4.minus(minutes7);
        org.joda.time.Minutes minutes13 = minutes4.dividedBy(679);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes14 = minutes0.plus(minutes13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483647 + 3162715");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT2147483647M" + "'", str3, "PT2147483647M");
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT2147483647M" + "'", str10, "PT2147483647M");
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes13);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        gregorianCalendar5.roll(7, false);
        java.lang.Object obj9 = gregorianCalendar5.clone();
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=353,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=126,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=10,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=353,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=126,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=10,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=353,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=126,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=10,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.of(197, (int) ':', 306, 4200, (int) (byte) 100, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 58");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) ' ');
        java.time.OffsetTime offsetTime2 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime3 = offsetTime2.toLocalTime();
        java.lang.String str4 = offsetTime2.toString();
        java.time.Duration duration5 = java.time.Duration.ZERO;
        java.lang.String str6 = duration5.toString();
        java.time.OffsetTime offsetTime7 = offsetTime2.plus((java.time.temporal.TemporalAmount) duration5);
        java.time.LocalTime localTime8 = offsetTime2.toLocalTime();
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime9 = localDate1.atTime(localTime8);
        java.time.LocalDate localDate11 = localDate1.minusWeeks((long) 2097);
        java.lang.String str12 = localDate11.toString();
        java.time.LocalDate localDate14 = java.time.LocalDate.ofEpochDay((long) ' ');
        java.time.OffsetTime offsetTime15 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime16 = offsetTime15.toLocalTime();
        java.lang.String str17 = offsetTime15.toString();
        java.time.Duration duration18 = java.time.Duration.ZERO;
        java.lang.String str19 = duration18.toString();
        java.time.OffsetTime offsetTime20 = offsetTime15.plus((java.time.temporal.TemporalAmount) duration18);
        java.time.LocalTime localTime21 = offsetTime15.toLocalTime();
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime22 = localDate14.atTime(localTime21);
        java.time.LocalDate localDate24 = localDate14.minusWeeks((long) 2097);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone27);
        long long31 = dateTimeZone27.convertLocalToUTC((long) 3, false);
        long long34 = dateTimeZone27.convertLocalToUTC(0L, true);
        boolean boolean35 = localDate14.equals((java.lang.Object) true);
        int int36 = localDate14.lengthOfMonth();
        java.time.temporal.Temporal temporal37 = localDate11.adjustInto((java.time.temporal.Temporal) localDate14);
        java.util.Properties properties38 = null;
        java.util.Properties properties39 = new java.util.Properties(properties38);
        java.time.LocalTime localTime44 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime45 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime44);
        java.time.LocalTime localTime50 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime51 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime50);
        java.time.temporal.ChronoField chronoField52 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime54 = localTime50.with((java.time.temporal.TemporalField) chronoField52, (long) (short) 1);
        long long55 = localTime44.getLong((java.time.temporal.TemporalField) chronoField52);
        java.time.LocalTime localTime57 = localTime44.withSecond((int) (short) 1);
        java.lang.Object obj59 = properties39.put((java.lang.Object) localTime57, (java.lang.Object) "117");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate60 = localDate14.with((java.time.temporal.TemporalAdjuster) localTime57);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23:59:59.999999999-18:00" + "'", str4, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0S" + "'", str6, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1929-11-25" + "'", str12, "1929-11-25");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(offsetTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "23:59:59.999999999-18:00" + "'", str17, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0S" + "'", str19, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 3L + "'", long31 == 3L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 28 + "'", int36 == 28);
        org.junit.Assert.assertNotNull(temporal37);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertTrue("'" + chronoField52 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField52.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 3601000000001L + "'", long55 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.lang.String str7 = gregorianCalendar5.getCalendarType();
        java.time.ZonedDateTime zonedDateTime8 = gregorianCalendar5.toZonedDateTime();
        java.time.Instant instant9 = gregorianCalendar5.toInstant();
        java.lang.Object obj10 = gregorianCalendar5.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gregory" + "'", str7, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "java.util.GregorianCalendar[time=-51016611000000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=353,MONTH=4,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=6,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=10,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "java.util.GregorianCalendar[time=-51016611000000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=353,MONTH=4,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=6,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=10,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "java.util.GregorianCalendar[time=-51016611000000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=353,MONTH=4,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=6,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=10,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.lang.String str0 = java.io.File.pathSeparator;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ":" + "'", str0, ":");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("hours");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hours\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.function.DoubleBinaryOperator doubleBinaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble2 = doubleStream0.reduce(doubleBinaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of((double) (short) 1);
        long long2 = doubleStream1.count();
        // The following exception was thrown during execution in test generation
        try {
            java.util.PrimitiveIterator.OfDouble ofDouble3 = doubleStream1.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.monthOfYear();
        org.joda.time.format.PeriodPrinter periodPrinter9 = null;
        org.joda.time.format.PeriodParser periodParser10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = new org.joda.time.format.PeriodFormatter(periodPrinter9, periodParser10);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.years();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter11.withParseType(periodType12);
        java.util.Locale locale15 = new java.util.Locale("hi!");
        org.joda.time.format.PeriodFormatter periodFormatter16 = periodFormatter11.withLocale(locale15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 3, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.dayOfYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((java.lang.Object) dateTime19, chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime19.toMutableDateTime();
        mutableDateTime23.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime23.dayOfWeek();
        java.util.Locale locale27 = java.util.Locale.JAPAN;
        int int28 = property26.getMaximumTextLength(locale27);
        java.lang.String str29 = locale15.getDisplayName(locale27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dateTimeField7.getAsText(64, locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 64");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!");
        org.junit.Assert.assertNotNull(periodFormatter16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone4);
        long long8 = dateTimeZone4.convertLocalToUTC((long) 3, false);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (long) ':');
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        java.util.GregorianCalendar gregorianCalendar12 = new java.util.GregorianCalendar(timeZone11);
        int int13 = timeZone11.getRawOffset();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) 0, chronology16);
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale20 = java.util.Locale.GERMANY;
        java.lang.String str21 = locale19.getDisplayScript(locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 1970, chronology18, locale19, (java.lang.Integer) 1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) 0, chronology25);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.weekyearOfCentury();
        org.joda.time.DurationField durationField29 = dateTimeField28.getLeapDurationField();
        dateTimeParserBucket23.saveField(dateTimeField28, (int) 'u');
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str34 = dateTimeField28.getAsShortText((int) 'u', locale33);
        boolean boolean35 = dateTimeField28.isSupported();
        java.util.Locale locale40 = new java.util.Locale("ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]", "UNDERFLOW", "Years");
        java.lang.String str41 = dateTimeField28.getAsText((long) 14, locale40);
        java.lang.String str42 = timeZone11.getDisplayName(locale40);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 58L + "'", long10 == 58L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNull(durationField29);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "117" + "'", str34, "117");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals(locale40.toString(), "parsecasesensitive(false)(value(year,4,10,exceeds_pad)'-'value(monthofyear,2)'-'value(dayofmonth,2))[offset(+hh:mm:ss,'z')]_UNDERFLOW_Years");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "70" + "'", str41, "70");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Coordinated Universal Time" + "'", str42, "Coordinated Universal Time");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.util.Set<java.lang.String> strSet0 = java.time.ZoneId.getAvailableZoneIds();
        java.util.stream.Stream<java.lang.String> strStream1 = strSet0.parallelStream();
        boolean boolean3 = strSet0.remove((java.lang.Object) 0);
        java.time.LocalTime localTime8 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime9 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime8);
        java.time.LocalTime localTime14 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime15 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime14);
        java.time.temporal.ChronoField chronoField16 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime18 = localTime14.with((java.time.temporal.TemporalField) chronoField16, (long) (short) 1);
        long long19 = localTime8.getLong((java.time.temporal.TemporalField) chronoField16);
        java.time.LocalTime localTime21 = localTime8.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField22 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange23 = localTime21.range((java.time.temporal.TemporalField) chronoField22);
        boolean boolean24 = strSet0.remove((java.lang.Object) chronoField22);
        java.util.Spliterator<java.lang.String> strSpliterator25 = strSet0.spliterator();
        java.nio.Buffer[] bufferArray26 = new java.nio.Buffer[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer[] bufferArray27 = strSet0.toArray(bufferArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(strStream1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + chronoField16 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField16.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3601000000001L + "'", long19 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + chronoField22 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField22.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertNotNull(bufferArray26);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.security.cert.CertificateEncodingException certificateEncodingException1 = new java.security.cert.CertificateEncodingException("OptionalLong[0]");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.util.Comparator<org.joda.time.Minutes> minutesComparator0 = java.util.Comparator.reverseOrder();
        org.junit.Assert.assertNotNull(minutesComparator0);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        boolean boolean10 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 3, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) dateTime13, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime13.toMutableDateTime();
        mutableDateTime17.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.year();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.weekyear();
        boolean boolean23 = duration2.equals((java.lang.Object) mutableDateTime17);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = new org.joda.time.Duration(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = duration26.toPeriodTo(readableInstant27, periodType28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = new org.joda.time.Duration(readableInstant30, readableInstant31);
        long long33 = duration32.getMillis();
        boolean boolean34 = duration26.isShorterThan((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 3, chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.dayOfYear();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((java.lang.Object) dateTime37, chronology39);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime37.toMutableDateTime();
        mutableDateTime41.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime41.dayOfWeek();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime41.year();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime41.weekyear();
        boolean boolean47 = duration26.equals((java.lang.Object) mutableDateTime41);
        mutableDateTime41.addMonths((int) ' ');
        mutableDateTime41.add((long) (byte) 10);
        org.joda.time.Period period52 = org.joda.time.Period.ZERO;
        org.joda.time.Period period53 = period52.normalizedStandard();
        org.joda.time.Period period55 = period52.plusHours(2);
        java.time.chrono.IsoEra isoEra56 = java.time.chrono.IsoEra.CE;
        boolean boolean57 = period55.equals((java.lang.Object) isoEra56);
        int int58 = period55.getMinutes();
        mutableDateTime41.add((org.joda.time.ReadablePeriod) period55);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime(chronology60);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.withYearOfCentury((int) 'a');
        int int64 = localDateTime63.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.weekyear();
        int int68 = localDateTime63.get(dateTimeFieldType67);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime41.property(dateTimeFieldType67);
        boolean boolean70 = mutableDateTime17.isSupported(dateTimeFieldType67);
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime17.copy();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertTrue("'" + isoEra56 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra56.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 21 + "'", int64 == 21);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2097 + "'", int68 == 2097);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(mutableDateTime71);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        int int4 = localDateTime1.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDateTime1.getValue(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours4 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay1, (org.joda.time.ReadablePartial) timeOfDay3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay3.withFieldAdded(durationFieldType5, (int) (byte) 0);
        int int8 = timeOfDay3.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay3.plusHours(9);
        org.joda.time.TimeOfDay.Property property11 = timeOfDay3.secondOfMinute();
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate15 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset14);
        boolean boolean16 = property11.equals((java.lang.Object) localDate15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property11.getFieldType();
        org.joda.time.TimeOfDay timeOfDay18 = property11.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay20 = property11.setCopy(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(timeOfDay18);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter2 = new java.io.PrintWriter("gregory", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        org.joda.time.MutablePeriod mutablePeriod3 = weeks0.toMutablePeriod();
        int int4 = mutablePeriod3.getSeconds();
        mutablePeriod3.addSeconds(10);
        mutablePeriod3.addDays(83400);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 4096, dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.joda.time.Period period4 = new org.joda.time.Period((int) '#', 0, 2, (int) (short) 100);
        org.joda.time.Period period6 = period4.withSeconds(12);
        org.joda.time.Days days7 = period4.toStandardDays();
        org.joda.time.Minutes minutes8 = days7.toStandardMinutes();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(minutes8);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        float[] floatArray2 = new float[] { (-1L), (byte) -1 };
        java.nio.FloatBuffer floatBuffer3 = java.nio.FloatBuffer.wrap(floatArray2);
        java.nio.FloatBuffer floatBuffer4 = floatBuffer3.compact();
        java.nio.FloatBuffer floatBuffer5 = floatBuffer3.asReadOnlyBuffer();
        java.nio.ByteOrder byteOrder6 = floatBuffer3.order();
        java.nio.FloatBuffer floatBuffer7 = floatBuffer3.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            float float8 = floatBuffer7.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, -1.0]");
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertNotNull(floatBuffer4);
        org.junit.Assert.assertNotNull(floatBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertNotNull(floatBuffer7);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime2.withWeekOfWeekyear((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        boolean boolean10 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 0, chronology12);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = chronology14.weekyears();
        org.joda.time.DurationField durationField17 = chronology14.seconds();
        org.joda.time.Chronology chronology18 = chronology14.withUTC();
        org.joda.time.Period period19 = duration2.toPeriod(chronology18);
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit21 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean22 = weeks20.equals((java.lang.Object) timeUnit21);
        org.joda.time.MutablePeriod mutablePeriod23 = weeks20.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = new org.joda.time.Duration(readableInstant24, readableInstant25);
        org.joda.time.Duration duration28 = duration26.withMillis((-1L));
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) 0, chronology30);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        mutablePeriod23.setPeriod((org.joda.time.ReadableDuration) duration28, chronology32);
        org.joda.time.PeriodType periodType34 = mutablePeriod23.getPeriodType();
        org.joda.time.Period period35 = duration2.toPeriod(periodType34);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(timeUnit21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(mutablePeriod23);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period35);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours4 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay1, (org.joda.time.ReadablePartial) timeOfDay3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay3.withFieldAdded(durationFieldType5, (int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours12 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay9, (org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay9.withSecondOfMinute(0);
        boolean boolean15 = timeOfDay7.isAfter((org.joda.time.ReadablePartial) timeOfDay14);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay7.minusSeconds(32769);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay7.plus(readablePeriod18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withField(dateTimeFieldType22, (int) 'a');
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours26 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay19, (org.joda.time.ReadablePartial) localDateTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.nio.file.Path path0 = null;
        java.nio.file.OpenOption[] openOptionArray1 = new java.nio.file.OpenOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.FileChannel fileChannel2 = java.nio.channels.FileChannel.open(path0, openOptionArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(openOptionArray1);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        boolean boolean2 = offsetDateTime0.isSupported((java.time.temporal.TemporalField) chronoField1);
        java.lang.String str3 = offsetDateTime0.toString();
        java.lang.String str4 = offsetDateTime0.toString();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-21T09:34:23.848Z" + "'", str3, "2022-02-21T09:34:23.848Z");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-21T09:34:23.848Z" + "'", str4, "2022-02-21T09:34:23.848Z");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.time.format.FormatStyle formatStyle0 = java.time.format.FormatStyle.LONG;
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofLocalizedTime(formatStyle0);
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder3 = charset2.newDecoder();
        java.nio.charset.Charset charset4 = java.nio.charset.Charset.defaultCharset();
        boolean boolean5 = charset2.contains(charset4);
        java.nio.charset.CharsetEncoder charsetEncoder6 = charset2.newEncoder();
        char[] charArray7 = new char[] {};
        java.nio.CharBuffer charBuffer8 = java.nio.CharBuffer.wrap(charArray7);
        java.nio.ByteBuffer byteBuffer9 = charsetEncoder6.encode(charBuffer8);
        java.nio.CharBuffer charBuffer10 = charBuffer8.slice();
        java.nio.CharBuffer charBuffer11 = charBuffer8.compact();
        java.nio.CharBuffer charBuffer12 = charBuffer8.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.TemporalAccessor temporalAccessor13 = dateTimeFormatter1.parse((java.lang.CharSequence) charBuffer12);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + formatStyle0 + "' != '" + java.time.format.FormatStyle.LONG + "'", formatStyle0.equals(java.time.format.FormatStyle.LONG));
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(charsetDecoder3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertNotNull(charBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(charBuffer11);
        org.junit.Assert.assertNotNull(charBuffer12);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.util.Properties properties0 = new java.util.Properties();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 3, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfYear();
        org.joda.time.Interval interval5 = property4.toInterval();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        boolean boolean7 = interval5.contains((org.joda.time.ReadableInstant) dateTime6);
        java.net.InetAddress inetAddress8 = java.net.InetAddress.getLocalHost();
        boolean boolean9 = inetAddress8.isLoopbackAddress();
        java.lang.Object obj10 = properties0.put((java.lang.Object) boolean7, (java.lang.Object) inetAddress8);
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties0.loadFromXML(inputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(inetAddress8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.LocalDate localDate2 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int3 = localDate2.getMonthValue();
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.Period period5 = period4.normalizedStandard();
        org.joda.time.Period period7 = period4.plusHours(2);
        java.time.chrono.IsoEra isoEra8 = java.time.chrono.IsoEra.CE;
        boolean boolean9 = period7.equals((java.lang.Object) isoEra8);
        java.time.LocalTime localTime14 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime15 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime14);
        java.time.LocalTime localTime20 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime21 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime20);
        java.time.temporal.ChronoField chronoField22 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime24 = localTime20.with((java.time.temporal.TemporalField) chronoField22, (long) (short) 1);
        long long25 = localTime14.getLong((java.time.temporal.TemporalField) chronoField22);
        boolean boolean26 = isoEra8.isSupported((java.time.temporal.TemporalField) chronoField22);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery27 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period28 = isoEra8.query(periodTemporalQuery27);
        boolean boolean29 = period28.isNegative();
        java.time.Period period31 = period28.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean33 = period28.equals((java.lang.Object) chronoField32);
        boolean boolean34 = localDate2.isSupported((java.time.temporal.TemporalField) chronoField32);
        java.time.temporal.TemporalUnit temporalUnit35 = chronoField32.getRangeUnit();
        java.time.OffsetDateTime offsetDateTime36 = offsetDateTime0.truncatedTo(temporalUnit35);
        java.time.LocalDate localDate39 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int40 = localDate39.getMonthValue();
        org.joda.time.Period period41 = org.joda.time.Period.ZERO;
        org.joda.time.Period period42 = period41.normalizedStandard();
        org.joda.time.Period period44 = period41.plusHours(2);
        java.time.chrono.IsoEra isoEra45 = java.time.chrono.IsoEra.CE;
        boolean boolean46 = period44.equals((java.lang.Object) isoEra45);
        java.time.LocalTime localTime51 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime52 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime51);
        java.time.LocalTime localTime57 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime58 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime57);
        java.time.temporal.ChronoField chronoField59 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime61 = localTime57.with((java.time.temporal.TemporalField) chronoField59, (long) (short) 1);
        long long62 = localTime51.getLong((java.time.temporal.TemporalField) chronoField59);
        boolean boolean63 = isoEra45.isSupported((java.time.temporal.TemporalField) chronoField59);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery64 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period65 = isoEra45.query(periodTemporalQuery64);
        boolean boolean66 = period65.isNegative();
        java.time.Period period68 = period65.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField69 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean70 = period65.equals((java.lang.Object) chronoField69);
        boolean boolean71 = localDate39.isSupported((java.time.temporal.TemporalField) chronoField69);
        java.time.temporal.TemporalUnit temporalUnit72 = chronoField69.getRangeUnit();
        java.time.OffsetDateTime offsetDateTime73 = offsetDateTime36.minus(8L, temporalUnit72);
        java.lang.String str74 = temporalUnit72.toString();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + isoEra8 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra8.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + chronoField22 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField22.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3601000000001L + "'", long25 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit35 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit35.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(offsetDateTime36);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + isoEra45 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra45.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertTrue("'" + chronoField59 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField59.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 3601000000001L + "'", long62 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertTrue("'" + chronoField69 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField69.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit72 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit72.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(offsetDateTime73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Days" + "'", str74, "Days");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate3 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset2);
        java.time.Clock clock4 = java.time.Clock.system((java.time.ZoneId) zoneOffset2);
        java.time.Duration duration6 = java.time.Duration.ofSeconds((long) 0);
        java.time.Duration duration8 = duration6.multipliedBy((long) (byte) -1);
        java.time.Clock clock9 = java.time.Clock.offset(clock4, duration6);
        java.time.Instant instant10 = java.time.Instant.now(clock4);
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(clock4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(clock9);
        org.junit.Assert.assertNotNull(instant10);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10L);
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours4 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay1, (org.joda.time.ReadablePartial) timeOfDay3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay3.withFieldAdded(durationFieldType5, (int) (byte) 0);
        int int8 = timeOfDay3.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay3.plusHours(9);
        org.joda.time.TimeOfDay.Property property11 = timeOfDay3.secondOfMinute();
        int int12 = property11.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.lang.String str7 = gregorianCalendar5.getCalendarType();
        java.time.ZonedDateTime zonedDateTime8 = gregorianCalendar5.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime8.minusMonths((long) 10);
        int int11 = zonedDateTime8.getMonthValue();
        int int12 = zonedDateTime8.getSecond();
        java.util.GregorianCalendar gregorianCalendar18 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int19 = gregorianCalendar18.getWeeksInWeekYear();
        java.lang.String str20 = gregorianCalendar18.getCalendarType();
        java.time.ZonedDateTime zonedDateTime21 = gregorianCalendar18.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime23 = zonedDateTime21.minusMonths((long) 10);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime24 = zonedDateTime21.withEarlierOffsetAtOverlap();
        java.time.ZonedDateTime zonedDateTime26 = zonedDateTime21.minusMonths((long) 4200);
        boolean boolean27 = zonedDateTime8.isBefore((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime26);
        java.time.ZonedDateTime zonedDateTime29 = zonedDateTime8.minusMinutes((long) 34);
        long long30 = zonedDateTime29.toEpochSecond();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gregory" + "'", str7, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "gregory" + "'", str20, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime24);
        org.junit.Assert.assertNotNull(zonedDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(zonedDateTime29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-51016613040L) + "'", long30 == (-51016613040L));
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) 0, chronology4);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 1970, chronology6, locale7, (java.lang.Integer) 1);
        org.joda.time.DateTimeField dateTimeField12 = chronology6.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(3, 4096, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4096 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight2 = org.joda.time.DateMidnight.parse("2022-02-21T09:34:12.478Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.util.stream.Stream<java.lang.Object> objStream0 = java.util.stream.Stream.empty();
        java.lang.Object[] objArray1 = objStream0.toArray();
        org.joda.time.tz.NameProvider nameProvider2 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 0, chronology5);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField10 = chronology7.monthOfYear();
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 28, chronology7, locale11, (java.lang.Integer) 0);
        java.lang.String str16 = nameProvider2.getShortName(locale11, "22", "Chinese");
        java.util.function.BinaryOperator<java.lang.Object> objBinaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = objStream0.reduce((java.lang.Object) str16, objBinaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objStream0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(nameProvider2);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        org.joda.time.Days days7 = org.joda.time.Days.ONE;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) days7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 3, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfYear();
        org.joda.time.Interval interval13 = property12.toInterval();
        mutableInterval8.setInterval((org.joda.time.ReadableInterval) interval13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 3, chronology16);
        org.joda.time.Period period18 = org.joda.time.Period.ZERO;
        org.joda.time.Period period19 = period18.normalizedStandard();
        org.joda.time.Period period21 = period19.minusMinutes((int) ' ');
        org.joda.time.Period period23 = period21.minusMonths((int) (byte) 0);
        org.joda.time.PeriodType periodType24 = period23.getPeriodType();
        org.joda.time.DateTime dateTime25 = dateTime17.minus((org.joda.time.ReadablePeriod) period23);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval8.setPeriodAfterStart((org.joda.time.ReadablePeriod) period23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(6);
        org.joda.time.DateTime dateTime6 = localDateTime3.toDateTime();
        int int7 = localDateTime3.getMinuteOfHour();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.years();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.halfdays();
        int int10 = periodType8.indexOf(durationFieldType9);
        java.lang.String str11 = durationFieldType9.toString();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime3.withFieldAdded(durationFieldType9, (int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMinuteOfHour((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withDayOfMonth((-10));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -10 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "halfdays" + "'", str11, "halfdays");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', periodType1);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.addYears((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.util.stream.Stream<java.lang.Object> objStream0 = java.util.stream.Stream.empty();
        java.util.stream.Stream<java.lang.Object> objStream1 = objStream0.parallel();
        java.lang.Runnable runnable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.Object> objStream3 = objStream1.onClose(runnable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objStream0);
        org.junit.Assert.assertNotNull(objStream1);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        org.joda.time.Days days7 = org.joda.time.Days.ONE;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) days7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 3, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfYear();
        org.joda.time.Interval interval13 = property12.toInterval();
        mutableInterval8.setInterval((org.joda.time.ReadableInterval) interval13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 3, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfYear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((java.lang.Object) dateTime17, chronology19);
        org.joda.time.DateMidnight.Property property21 = dateMidnight20.dayOfMonth();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = new org.joda.time.Duration(readableInstant22, readableInstant23);
        org.joda.time.Duration duration26 = duration24.withMillis((-1L));
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Duration duration28 = duration24.minus(readableDuration27);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight20.plus((org.joda.time.ReadableDuration) duration28);
        mutableInterval8.setDurationAfterStart((org.joda.time.ReadableDuration) duration28);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime();
        boolean boolean32 = mutableInterval8.isBefore((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 3, chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.dayOfYear();
        int int37 = dateTime35.getHourOfDay();
        boolean boolean39 = dateTime35.isBefore((long) '/');
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) 3, chronology41);
        org.joda.time.DateTime.Property property43 = dateTime42.dayOfYear();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((java.lang.Object) dateTime42, chronology44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight45.withDayOfYear((int) ' ');
        mutableInterval8.setInterval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateMidnight49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = new org.joda.time.Duration(readableInstant51, readableInstant52);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = duration53.toPeriodTo(readableInstant54, periodType55);
        long long57 = duration53.getStandardSeconds();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) 3, chronology59);
        org.joda.time.DateTime.Property property61 = dateTime60.dayOfYear();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight((java.lang.Object) dateTime60, chronology62);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight63.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight63.withDayOfYear((int) ' ');
        org.joda.time.Interval interval68 = duration53.toIntervalTo((org.joda.time.ReadableInstant) dateMidnight67);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Duration duration71 = new org.joda.time.Duration(readableInstant69, readableInstant70);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.PeriodType periodType73 = null;
        org.joda.time.Period period74 = duration71.toPeriodTo(readableInstant72, periodType73);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.Duration duration77 = new org.joda.time.Duration(readableInstant75, readableInstant76);
        long long78 = duration77.getMillis();
        boolean boolean79 = duration71.isShorterThan((org.joda.time.ReadableDuration) duration77);
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime((long) 3, chronology81);
        org.joda.time.DateTime.Property property83 = dateTime82.dayOfYear();
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.DateMidnight dateMidnight85 = new org.joda.time.DateMidnight((java.lang.Object) dateTime82, chronology84);
        org.joda.time.MutableDateTime mutableDateTime86 = dateTime82.toMutableDateTime();
        mutableDateTime86.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime86.dayOfWeek();
        org.joda.time.MutableDateTime.Property property90 = mutableDateTime86.year();
        org.joda.time.MutableDateTime.Property property91 = mutableDateTime86.weekyear();
        boolean boolean92 = duration71.equals((java.lang.Object) mutableDateTime86);
        boolean boolean93 = duration53.isLongerThan((org.joda.time.ReadableDuration) duration71);
        mutableInterval8.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration71);
        boolean boolean95 = mutableInterval8.isBeforeNow();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertNotNull(dateMidnight49);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(dateMidnight65);
        org.junit.Assert.assertNotNull(dateMidnight67);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertNotNull(mutableDateTime86);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(property90);
        org.junit.Assert.assertNotNull(property91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.Period period9 = org.joda.time.Period.ZERO;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours14 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay11, (org.joda.time.ReadablePartial) timeOfDay13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay13.withFieldAdded(durationFieldType15, (int) (byte) 0);
        org.joda.time.Period period19 = period9.withFieldAdded(durationFieldType15, 4);
        mutableDateTime6.add((org.joda.time.ReadablePeriod) period9);
        mutableDateTime6.addMonths(1970);
        mutableDateTime6.addMonths(6);
        int int25 = mutableDateTime6.getMonthOfYear();
        int int26 = mutableDateTime6.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setMillisOfSecond(1929);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1929 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.text.Format format1 = dateTimeFormatter0.toFormat();
        java.lang.String str2 = dateTimeFormatter0.toString();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(format1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]" + "'", str2, "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = java.time.LocalTime.parse((java.lang.CharSequence) "ZoneRules[currentStandardOffset=Z]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'ZoneRules[currentStandardOffset=Z]' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("117");
        org.junit.Assert.assertNotNull(instant1);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 0, chronology2);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = chronology4.weekyears();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 21, chronology4);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = chronology4.getDateTimeMillis(0, 64, (int) '/', 256, 256, 197, 19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 256 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        org.joda.time.Days days7 = org.joda.time.Days.ONE;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) days7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 3, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfYear();
        org.joda.time.Interval interval13 = property12.toInterval();
        mutableInterval8.setInterval((org.joda.time.ReadableInterval) interval13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 3, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfYear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((java.lang.Object) dateTime17, chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime17.toMutableDateTime();
        org.joda.time.Days days22 = org.joda.time.Days.ONE;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadablePeriod) days22);
        mutableInterval8.setInterval((org.joda.time.ReadableInterval) mutableInterval23);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval8.setInterval((long) 256, (long) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(days22);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.range(0, 10);
        java.util.function.IntToDoubleFunction intToDoubleFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream4 = intStream2.mapToDouble(intToDoubleFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.text.Format format1 = dateTimeFormatter0.toFormat();
        java.util.function.Predicate<org.joda.time.LocalDateTime> localDateTimePredicate2 = java.util.function.Predicate.isEqual((java.lang.Object) dateTimeFormatter0);
        java.time.chrono.IsoEra isoEra4 = java.time.chrono.IsoEra.CE;
        java.time.format.DateTimeFormatter dateTimeFormatter5 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.lang.String str6 = dateTimeFormatter5.toString();
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.now();
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery8 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period9 = localDateTime7.query(periodTemporalQuery8);
        java.text.Format format10 = dateTimeFormatter5.toFormat(periodTemporalQuery8);
        java.time.Period period11 = isoEra4.query(periodTemporalQuery8);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period12 = dateTimeFormatter0.parse((java.lang.CharSequence) "gregory", periodTemporalQuery8);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'gregory' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(format1);
        org.junit.Assert.assertNotNull(localDateTimePredicate2);
        org.junit.Assert.assertTrue("'" + isoEra4 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra4.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]" + "'", str6, "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(periodTemporalQuery8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(format10);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.nio.charset.CoderResult coderResult0 = java.nio.charset.CoderResult.OVERFLOW;
        boolean boolean1 = coderResult0.isMalformed();
        org.junit.Assert.assertNotNull(coderResult0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        java.util.stream.IntStream intStream3 = intStream2.parallel();
        java.util.function.IntBinaryOperator intBinaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalInt optionalInt5 = intStream3.reduce(intBinaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.lang.String str7 = gregorianCalendar5.getCalendarType();
        java.time.ZonedDateTime zonedDateTime8 = gregorianCalendar5.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime8.minusMonths((long) 10);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime11 = zonedDateTime8.withEarlierOffsetAtOverlap();
        int int12 = zonedDateTime8.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime14 = zonedDateTime8.plusMonths(6603384152749567654L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 550282012729130991");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gregory" + "'", str7, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 127 + "'", int12 == 127);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_ZONED_DATE_TIME;
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.millisOfDay();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.halfdays();
        int int12 = periodType10.indexOf(durationFieldType11);
        mutableDateTime6.add(durationFieldType11, (int) 'a');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime6.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime17.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        int int0 = org.joda.time.MutableDateTime.ROUND_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("Thursday");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Thursday\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.time.Month month0 = java.time.Month.DECEMBER;
        int int1 = month0.getValue();
        java.time.temporal.Temporal temporal2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal3 = month0.adjustInto(temporal2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + month0 + "' != '" + java.time.Month.DECEMBER + "'", month0.equals(java.time.Month.DECEMBER));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime8 = localTime4.with((java.time.temporal.TemporalField) chronoField6, (long) (short) 1);
        java.time.Duration duration10 = java.time.Duration.ofMinutes((long) 3);
        java.time.LocalTime localTime11 = localTime4.minus((java.time.temporal.TemporalAmount) duration10);
        java.time.Duration duration13 = duration10.multipliedBy((long) (byte) -1);
        java.time.Duration duration14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration15 = duration13.plus(duration14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField6.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("23:59:59.999999999-18:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"23:59:59.999999999-18:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.nio.LongBuffer longBuffer3 = java.nio.LongBuffer.allocate((int) (short) 0);
        java.nio.Buffer buffer4 = longBuffer3.mark();
        boolean boolean5 = properties1.containsKey((java.lang.Object) longBuffer3);
        java.nio.charset.Charset charset6 = java.nio.charset.Charset.defaultCharset();
        boolean boolean7 = charset6.canEncode();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 3, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfYear();
        java.lang.Object obj12 = properties1.getOrDefault((java.lang.Object) boolean7, (java.lang.Object) property11);
        properties1.clear();
        int int14 = properties1.size();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = java.time.ZoneId.SHORT_IDS;
        int int16 = strMap15.size();
        properties1.putAll(strMap15);
        java.io.OutputStream outputStream18 = null;
        java.io.FilterOutputStream filterOutputStream19 = new java.io.FilterOutputStream(outputStream18);
        java.io.PrintStream printStream21 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream19, false);
        // The following exception was thrown during execution in test generation
        try {
            properties1.list(printStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longBuffer3);
        org.junit.Assert.assertNotNull(buffer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "Property[dayOfYear]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "Property[dayOfYear]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "Property[dayOfYear]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 28 + "'", int16 == 28);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of((double) 1024);
        java.util.OptionalDouble optionalDouble2 = doubleStream1.max();
        boolean boolean3 = optionalDouble2.isPresent();
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse(":");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \":\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        char[] charArray5 = new char[] {};
        java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.wrap(charArray5);
        java.nio.ByteBuffer byteBuffer7 = charsetEncoder4.encode(charBuffer6);
        java.nio.CharBuffer charBuffer8 = charBuffer6.slice();
        java.nio.CharBuffer charBuffer9 = charBuffer6.compact();
        java.nio.CharBuffer charBuffer10 = charBuffer6.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer13 = charBuffer6.subSequence((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(charBuffer8);
        org.junit.Assert.assertNotNull(charBuffer9);
        org.junit.Assert.assertNotNull(charBuffer10);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 3, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) dateTime5, chronology7);
        org.joda.time.DateTime dateTime9 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.LocalTime localTime11 = localTime2.plusHours(3);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 3, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfYear();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.Period period17 = org.joda.time.Period.ZERO;
        org.joda.time.Period period18 = period17.normalizedStandard();
        org.joda.time.Period period20 = period18.minusMinutes((int) ' ');
        org.joda.time.Period period22 = period20.withMinutes(32769);
        boolean boolean23 = interval16.equals((java.lang.Object) period22);
        org.joda.time.LocalTime localTime25 = localTime11.withPeriodAdded((org.joda.time.ReadablePeriod) period22, (int) (byte) 100);
        int int26 = localTime11.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone5);
        long long9 = dateTimeZone5.convertLocalToUTC((long) 3, false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) ':');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) 1970, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 58L + "'", long11 == 58L);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        byte[] byteArray3 = new byte[] { (byte) 100 };
        filterOutputStream1.write(byteArray3, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            filterOutputStream1.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay(34465512000000L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): 94363368774");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone4);
        long long8 = dateTimeZone4.convertLocalToUTC((long) 3, false);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (long) ':');
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        java.util.GregorianCalendar gregorianCalendar12 = new java.util.GregorianCalendar(timeZone11);
        java.lang.String str13 = gregorianCalendar12.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 58L + "'", long10 == 58L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.util.GregorianCalendar[time=1645436066701,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=34,SECOND=26,MILLISECOND=701,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str13, "java.util.GregorianCalendar[time=1645436066701,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=34,SECOND=26,MILLISECOND=701,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.util.concurrent.TimeUnit timeUnit0 = java.util.concurrent.TimeUnit.MILLISECONDS;
        long long2 = timeUnit0.toHours((long) '.');
        org.junit.Assert.assertNotNull(timeUnit0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        long long6 = duration2.getStandardSeconds();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 3, chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((java.lang.Object) dateTime9, chronology11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight12.withDayOfYear((int) ' ');
        org.joda.time.Interval interval17 = duration2.toIntervalTo((org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.DateMidnight.Property property18 = dateMidnight16.dayOfYear();
        org.joda.time.DateMidnight.Property property19 = dateMidnight16.yearOfEra();
        org.joda.time.ReadablePartial readablePartial20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = property19.compareTo(readablePartial20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.years();
        org.joda.time.format.PeriodFormatter periodFormatter4 = periodFormatter2.withParseType(periodType3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 3, chronology6);
        org.joda.time.Period period8 = org.joda.time.Period.ZERO;
        org.joda.time.Period period9 = period8.normalizedStandard();
        org.joda.time.Period period11 = period9.minusMinutes((int) ' ');
        org.joda.time.Period period13 = period11.minusMonths((int) (byte) 0);
        org.joda.time.PeriodType periodType14 = period13.getPeriodType();
        org.joda.time.DateTime dateTime15 = dateTime7.minus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.DateTime dateTime17 = dateTime7.plusHours(34);
        org.joda.time.DateTime dateTime19 = dateTime17.minusSeconds((int) '#');
        org.joda.time.Period period24 = new org.joda.time.Period((int) '#', 0, 2, (int) (short) 100);
        org.joda.time.Period period26 = period24.withSeconds(12);
        int int27 = period26.getMillis();
        org.joda.time.DateTime dateTime28 = dateTime19.plus((org.joda.time.ReadablePeriod) period26);
        int int29 = period26.getMinutes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = periodFormatter2.print((org.joda.time.ReadablePeriod) period26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodFormatter4);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.normalizedStandard();
        org.joda.time.Period period3 = period0.plusHours(2);
        java.time.chrono.IsoEra isoEra4 = java.time.chrono.IsoEra.CE;
        boolean boolean5 = period3.equals((java.lang.Object) isoEra4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.LocalTime localTime16 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime16);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime20 = localTime16.with((java.time.temporal.TemporalField) chronoField18, (long) (short) 1);
        long long21 = localTime10.getLong((java.time.temporal.TemporalField) chronoField18);
        boolean boolean22 = isoEra4.isSupported((java.time.temporal.TemporalField) chronoField18);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery23 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period24 = isoEra4.query(periodTemporalQuery23);
        boolean boolean25 = period24.isNegative();
        java.time.Period period27 = period24.plusDays((long) ' ');
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) 0, chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 3, chronology32);
        org.joda.time.DateTime.Property property34 = dateTime33.dayOfYear();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((java.lang.Object) dateTime33, chronology35);
        org.joda.time.DateTime dateTime37 = localTime30.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        boolean boolean38 = period27.equals((java.lang.Object) localTime30);
        org.joda.time.Period period39 = org.joda.time.Period.ZERO;
        org.joda.time.Period period40 = period39.normalizedStandard();
        org.joda.time.Period period42 = period39.plusHours(2);
        java.time.chrono.IsoEra isoEra43 = java.time.chrono.IsoEra.CE;
        boolean boolean44 = period42.equals((java.lang.Object) isoEra43);
        java.time.LocalTime localTime49 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime50 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime49);
        java.time.LocalTime localTime55 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime56 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime55);
        java.time.temporal.ChronoField chronoField57 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime59 = localTime55.with((java.time.temporal.TemporalField) chronoField57, (long) (short) 1);
        long long60 = localTime49.getLong((java.time.temporal.TemporalField) chronoField57);
        boolean boolean61 = isoEra43.isSupported((java.time.temporal.TemporalField) chronoField57);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery62 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period63 = isoEra43.query(periodTemporalQuery62);
        boolean boolean64 = period63.isNegative();
        java.time.Period period66 = period63.plusDays((long) ' ');
        int int67 = period66.getYears();
        java.time.Period period68 = period27.minus((java.time.temporal.TemporalAmount) period66);
        java.time.Duration duration69 = java.time.Duration.ZERO;
        java.time.Duration duration71 = duration69.minusHours((long) 8);
        java.time.Duration duration73 = duration69.minusDays((long) 17);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoPeriod chronoPeriod74 = period68.minus((java.time.temporal.TemporalAmount) duration73);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Unit must be Years, Months or Days, but was Seconds");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + isoEra4 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra4.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3601000000001L + "'", long21 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertTrue("'" + isoEra43 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra43.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertTrue("'" + chronoField57 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField57.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 3601000000001L + "'", long60 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery62);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(duration73);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream2 = doubleStream0.skip(0L);
        double double3 = doubleStream2.sum();
        java.util.DoubleSummaryStatistics doubleSummaryStatistics4 = new java.util.DoubleSummaryStatistics();
        // The following exception was thrown during execution in test generation
        try {
            doubleStream2.forEachOrdered((java.util.function.DoubleConsumer) doubleSummaryStatistics4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals(doubleSummaryStatistics4.toString(), "DoubleSummaryStatistics{count=0, sum=0.000000, min=Infinity, average=0.000000, max=-Infinity}");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        java.lang.String[] strArray68 = new java.lang.String[] { "1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z", "January", "halfdayOfDay", "x-windows-iso2022jp", "PT2147483647M", "Years", "Mon", "23:59:59.999999999-18:00", "java.nio.HeapShortBufferR[pos=2 lim=2 cap=2]", "172.17.0.2", "70", ":", "SecondOfDay", "\ufffd", "PT0S", "German", "Germany", "1970-02-03T00:00:00.003Z", "0 - 86399", "minuteOfDay", "hours", "Etc/UTC", "gregory", "Mon", "1929-11-25", "CHN", "1929-11-25", "hours", "2022-02-21T09:34:20.882Z", "halfdays", "NanoOfDay", "Years", "java.text.AttributedCharacterIterator$Attribute(input_method_segment)", "Germany", "2022-02-21T09:34:07.170", "2022-02-21T09:34:12.419Z", "P1W", "2022-02-21T09:34:12.478Z", "Subject:\n", "java.nio.charset.CharacterCodingException", "2022-02-21T09:34:07.170", "2022-02-21T09:34:25.560Z", "OptionalLong[0]", "ZoneRules[currentStandardOffset=Z]", "x-windows-iso2022jp", "CHN", "23:59:59.999999999", "java.nio.HeapShortBufferR[pos=2 lim=2 cap=2]", "PT0S", "Feb 21, 2022 9:34:19 AM", "PT2147483647M", "\ufffd", "23:59:59.999999999", "Thursday", "2022-02-21T09:34:24.368Z", "Germany", "SecondOfDay", "PT3600S", "zh-CN", "java.nio.charset.CharacterCodingException", "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]", "Thursday", "java.nio.charset.CharacterCodingException", "OptionalLong[0]", "OptionalLong[0]", "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]", "ZoneRules[currentStandardOffset=Z]", "java.util.GregorianCalendar[time=-51016611000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=353,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=126,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=10,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        java.security.cert.CertificateException certificateException72 = new java.security.cert.CertificateException("hi!");
        java.security.cert.CertificateEncodingException certificateEncodingException74 = new java.security.cert.CertificateEncodingException("OptionalLong[0]");
        java.security.cert.CertificateException certificateException75 = new java.security.cert.CertificateException();
        java.security.cert.CertificateException[] certificateExceptionArray76 = new java.security.cert.CertificateException[] { certificateException72, certificateEncodingException74, certificateException75 };
        // The following exception was thrown during execution in test generation
        try {
            java.security.cert.CertificateException[] certificateExceptionArray77 = strList69.toArray(certificateExceptionArray76);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(certificateExceptionArray76);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean3 = weeks1.equals((java.lang.Object) timeUnit2);
        org.joda.time.MutablePeriod mutablePeriod4 = weeks1.toMutablePeriod();
        int int5 = mutablePeriod4.getSeconds();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        org.joda.time.Duration duration11 = duration8.plus((long) (byte) 1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 0, chronology14);
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        java.util.Locale locale17 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale18 = java.util.Locale.GERMANY;
        java.lang.String str19 = locale17.getDisplayScript(locale18);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 1970, chronology16, locale17, (java.lang.Integer) 1);
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration8, chronology16);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) 36484003L, chronology16);
        mutableDateTime23.addWeekyears((int) (short) 10);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime23.era();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(timeUnit2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        int int4 = seconds3.getSeconds();
        org.joda.time.Seconds seconds6 = seconds3.dividedBy(28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration7 = new org.joda.time.Duration((java.lang.Object) seconds3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Seconds");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(seconds6);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate3 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset2);
        java.time.LocalDate localDate4 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset2);
        java.time.OffsetDateTime offsetDateTime6 = java.time.OffsetDateTime.now();
        java.time.LocalDate localDate8 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int9 = localDate8.getMonthValue();
        org.joda.time.Period period10 = org.joda.time.Period.ZERO;
        org.joda.time.Period period11 = period10.normalizedStandard();
        org.joda.time.Period period13 = period10.plusHours(2);
        java.time.chrono.IsoEra isoEra14 = java.time.chrono.IsoEra.CE;
        boolean boolean15 = period13.equals((java.lang.Object) isoEra14);
        java.time.LocalTime localTime20 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime21 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime20);
        java.time.LocalTime localTime26 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime27 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime26);
        java.time.temporal.ChronoField chronoField28 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime30 = localTime26.with((java.time.temporal.TemporalField) chronoField28, (long) (short) 1);
        long long31 = localTime20.getLong((java.time.temporal.TemporalField) chronoField28);
        boolean boolean32 = isoEra14.isSupported((java.time.temporal.TemporalField) chronoField28);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery33 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period34 = isoEra14.query(periodTemporalQuery33);
        boolean boolean35 = period34.isNegative();
        java.time.Period period37 = period34.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField38 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean39 = period34.equals((java.lang.Object) chronoField38);
        boolean boolean40 = localDate8.isSupported((java.time.temporal.TemporalField) chronoField38);
        java.time.temporal.TemporalUnit temporalUnit41 = chronoField38.getRangeUnit();
        java.time.OffsetDateTime offsetDateTime42 = offsetDateTime6.truncatedTo(temporalUnit41);
        java.time.LocalDate localDate45 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int46 = localDate45.getMonthValue();
        org.joda.time.Period period47 = org.joda.time.Period.ZERO;
        org.joda.time.Period period48 = period47.normalizedStandard();
        org.joda.time.Period period50 = period47.plusHours(2);
        java.time.chrono.IsoEra isoEra51 = java.time.chrono.IsoEra.CE;
        boolean boolean52 = period50.equals((java.lang.Object) isoEra51);
        java.time.LocalTime localTime57 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime58 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime57);
        java.time.LocalTime localTime63 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime64 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime63);
        java.time.temporal.ChronoField chronoField65 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime67 = localTime63.with((java.time.temporal.TemporalField) chronoField65, (long) (short) 1);
        long long68 = localTime57.getLong((java.time.temporal.TemporalField) chronoField65);
        boolean boolean69 = isoEra51.isSupported((java.time.temporal.TemporalField) chronoField65);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery70 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period71 = isoEra51.query(periodTemporalQuery70);
        boolean boolean72 = period71.isNegative();
        java.time.Period period74 = period71.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField75 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean76 = period71.equals((java.lang.Object) chronoField75);
        boolean boolean77 = localDate45.isSupported((java.time.temporal.TemporalField) chronoField75);
        java.time.temporal.TemporalUnit temporalUnit78 = chronoField75.getRangeUnit();
        java.time.OffsetDateTime offsetDateTime79 = offsetDateTime42.minus(8L, temporalUnit78);
        java.time.LocalDate localDate80 = localDate4.minus((long) '4', temporalUnit78);
        java.time.temporal.ChronoField chronoField81 = java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange82 = localDate80.range((java.time.temporal.TemporalField) chronoField81);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: ClockHourOfAmPm");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(offsetDateTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + isoEra14 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra14.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + chronoField28 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField28.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 3601000000001L + "'", long31 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertTrue("'" + chronoField38 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField38.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit41 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit41.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(offsetDateTime42);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertTrue("'" + isoEra51 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra51.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertTrue("'" + chronoField65 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField65.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 3601000000001L + "'", long68 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery70);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertTrue("'" + chronoField75 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField75.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit78 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit78.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(offsetDateTime79);
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertTrue("'" + chronoField81 + "' != '" + java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM + "'", chronoField81.equals(java.time.temporal.ChronoField.CLOCK_HOUR_OF_AMPM));
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.LocalTime localTime6 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime6);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime16 = localTime12.with((java.time.temporal.TemporalField) chronoField14, (long) (short) 1);
        long long17 = localTime6.getLong((java.time.temporal.TemporalField) chronoField14);
        java.time.LocalTime localTime19 = localTime6.withSecond((int) (short) 1);
        java.lang.Object obj21 = properties1.put((java.lang.Object) localTime19, (java.lang.Object) "117");
        boolean boolean23 = properties1.containsValue((java.lang.Object) 6);
        java.lang.String str25 = properties1.getProperty("NanoOfDay");
        java.io.Writer writer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties1.store(writer26, "java.util.GregorianCalendar[time=1645436066701,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=34,SECOND=26,MILLISECOND=701,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3601000000001L + "'", long17 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        org.joda.time.Days days7 = org.joda.time.Days.ONE;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) days7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 3, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfYear();
        org.joda.time.Interval interval13 = property12.toInterval();
        mutableInterval8.setInterval((org.joda.time.ReadableInterval) interval13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 3, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfYear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((java.lang.Object) dateTime17, chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusMonths((-1));
        boolean boolean23 = interval13.isAfter((org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 3, chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfYear();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.Period period29 = org.joda.time.Period.ZERO;
        org.joda.time.Period period30 = period29.normalizedStandard();
        org.joda.time.Period period32 = period30.minusMinutes((int) ' ');
        org.joda.time.Period period34 = period32.withMinutes(32769);
        boolean boolean35 = interval28.equals((java.lang.Object) period34);
        boolean boolean36 = interval13.contains((org.joda.time.ReadableInterval) interval28);
        org.joda.time.Interval interval38 = interval13.withStartMillis(3600000L);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(interval38);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setMinuteOfHour(4096);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4096 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65 + "'", int1 == 65);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        java.nio.LongBuffer longBuffer1 = java.nio.LongBuffer.allocate((int) (short) 0);
        java.nio.Buffer buffer2 = longBuffer1.mark();
        java.time.LocalTime localTime7 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime8 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime7);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime11 = localTime7.with((java.time.temporal.TemporalField) chronoField9, (long) (short) 1);
        java.time.Duration duration13 = java.time.Duration.ofMinutes((long) 3);
        java.time.LocalTime localTime14 = localTime7.minus((java.time.temporal.TemporalAmount) duration13);
        boolean boolean15 = longBuffer1.equals((java.lang.Object) localTime7);
        java.nio.LongBuffer longBuffer16 = longBuffer1.slice();
        boolean boolean17 = longBuffer16.hasArray();
        org.junit.Assert.assertNotNull(longBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField9.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(longBuffer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        char[] charArray5 = new char[] {};
        java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.wrap(charArray5);
        java.nio.ByteBuffer byteBuffer7 = charsetEncoder4.encode(charBuffer6);
        java.nio.charset.Charset charset8 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder9 = charset8.newDecoder();
        float float10 = charsetDecoder9.maxCharsPerByte();
        java.nio.charset.Charset charset11 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder12 = charset11.newDecoder();
        java.nio.charset.Charset charset13 = java.nio.charset.Charset.defaultCharset();
        boolean boolean14 = charset11.contains(charset13);
        java.nio.charset.CharsetEncoder charsetEncoder15 = charset11.newEncoder();
        char[] charArray16 = new char[] {};
        java.nio.CharBuffer charBuffer17 = java.nio.CharBuffer.wrap(charArray16);
        java.nio.ByteBuffer byteBuffer18 = charsetEncoder15.encode(charBuffer17);
        char[] charArray25 = new char[] { '#', '/', '4', 'a', '4', 'u' };
        java.nio.CharBuffer charBuffer26 = java.nio.CharBuffer.wrap(charArray25);
        java.nio.charset.CoderResult coderResult28 = charsetDecoder9.decode(byteBuffer18, charBuffer26, false);
        boolean boolean29 = charBuffer26.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer30 = charBuffer6.put(charBuffer26);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNotNull(charsetDecoder9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(charsetDecoder12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charsetEncoder15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(charBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "#/4a4u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "#/4a4u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[#, /, 4, a, 4, u]");
        org.junit.Assert.assertNotNull(charBuffer26);
        org.junit.Assert.assertNotNull(coderResult28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        byte[] byteArray3 = new byte[] { (byte) 100 };
        filterOutputStream1.write(byteArray3, (int) (byte) 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.wrap(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = byteBuffer7.getInt(4200);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        float float2 = charsetDecoder1.maxCharsPerByte();
        java.nio.charset.Charset charset3 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder4 = charset3.newDecoder();
        java.nio.charset.Charset charset5 = java.nio.charset.Charset.defaultCharset();
        boolean boolean6 = charset3.contains(charset5);
        java.nio.charset.CharsetEncoder charsetEncoder7 = charset3.newEncoder();
        char[] charArray8 = new char[] {};
        java.nio.CharBuffer charBuffer9 = java.nio.CharBuffer.wrap(charArray8);
        java.nio.ByteBuffer byteBuffer10 = charsetEncoder7.encode(charBuffer9);
        char[] charArray17 = new char[] { '#', '/', '4', 'a', '4', 'u' };
        java.nio.CharBuffer charBuffer18 = java.nio.CharBuffer.wrap(charArray17);
        java.nio.charset.CoderResult coderResult20 = charsetDecoder1.decode(byteBuffer10, charBuffer18, false);
        // The following exception was thrown during execution in test generation
        try {
            short short22 = byteBuffer10.getShort(197);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(charsetDecoder4);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertNotNull(charBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#/4a4u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#/4a4u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, /, 4, a, 4, u]");
        org.junit.Assert.assertNotNull(charBuffer18);
        org.junit.Assert.assertNotNull(coderResult20);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime1 = offsetTime0.toLocalTime();
        java.lang.String str2 = offsetTime0.toString();
        int int3 = offsetTime0.getHour();
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23:59:59.999999999-18:00" + "'", str2, "23:59:59.999999999-18:00");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.time.Clock clock0 = java.time.Clock.systemDefaultZone();
        org.junit.Assert.assertNotNull(clock0);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.normalizedStandard();
        org.joda.time.Period period3 = period0.plusHours(2);
        java.time.chrono.IsoEra isoEra4 = java.time.chrono.IsoEra.CE;
        boolean boolean5 = period3.equals((java.lang.Object) isoEra4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.LocalTime localTime16 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime16);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime20 = localTime16.with((java.time.temporal.TemporalField) chronoField18, (long) (short) 1);
        long long21 = localTime10.getLong((java.time.temporal.TemporalField) chronoField18);
        boolean boolean22 = isoEra4.isSupported((java.time.temporal.TemporalField) chronoField18);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery23 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period24 = isoEra4.query(periodTemporalQuery23);
        boolean boolean25 = period24.isNegative();
        java.time.Period period27 = period24.plusDays((long) ' ');
        boolean boolean28 = period24.isNegative();
        java.time.Period period30 = period24.minusYears((long) 10);
        org.joda.time.Period period31 = org.joda.time.Period.ZERO;
        org.joda.time.Period period32 = period31.normalizedStandard();
        org.joda.time.Period period34 = period31.plusHours(2);
        java.time.chrono.IsoEra isoEra35 = java.time.chrono.IsoEra.CE;
        boolean boolean36 = period34.equals((java.lang.Object) isoEra35);
        java.time.LocalTime localTime41 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime42 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime41);
        java.time.LocalTime localTime47 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime48 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime47);
        java.time.temporal.ChronoField chronoField49 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime51 = localTime47.with((java.time.temporal.TemporalField) chronoField49, (long) (short) 1);
        long long52 = localTime41.getLong((java.time.temporal.TemporalField) chronoField49);
        boolean boolean53 = isoEra35.isSupported((java.time.temporal.TemporalField) chronoField49);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery54 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period55 = isoEra35.query(periodTemporalQuery54);
        java.time.chrono.ChronoPeriod chronoPeriod56 = period30.minus((java.time.temporal.TemporalAmount) period55);
        java.time.chrono.ChronoPeriod chronoPeriod58 = period30.multipliedBy(4096);
        int int59 = period30.getMonths();
        java.time.chrono.IsoChronology isoChronology60 = period30.getChronology();
        java.time.ZoneOffset zoneOffset63 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate64 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset63);
        java.time.Clock clock65 = java.time.Clock.system((java.time.ZoneId) zoneOffset63);
        java.time.Duration duration67 = java.time.Duration.ofSeconds((long) 0);
        java.time.Duration duration69 = duration67.multipliedBy((long) (byte) -1);
        java.time.Clock clock70 = java.time.Clock.offset(clock65, duration67);
        java.time.chrono.ChronoLocalDate chronoLocalDate71 = isoChronology60.dateNow(clock65);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.IsoEra isoEra73 = isoChronology60.eraOf(292269054);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid era: 292269054");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + isoEra4 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra4.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3601000000001L + "'", long21 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + isoEra35 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra35.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + chronoField49 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField49.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 3601000000001L + "'", long52 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(chronoPeriod56);
        org.junit.Assert.assertNotNull(chronoPeriod58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(isoChronology60);
        org.junit.Assert.assertNotNull(zoneOffset63);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertNotNull(clock65);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(clock70);
        org.junit.Assert.assertNotNull(chronoLocalDate71);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        byte[] byteArray5 = charsetEncoder4.replacement();
        java.nio.charset.Charset charset6 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder7 = charset6.newDecoder();
        float float8 = charsetDecoder7.maxCharsPerByte();
        float float9 = charsetDecoder7.averageCharsPerByte();
        java.nio.charset.CodingErrorAction codingErrorAction10 = charsetDecoder7.unmappableCharacterAction();
        java.nio.charset.CharsetEncoder charsetEncoder11 = charsetEncoder4.onUnmappableCharacter(codingErrorAction10);
        java.nio.charset.Charset charset12 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder13 = charset12.newDecoder();
        java.nio.charset.Charset charset14 = java.nio.charset.Charset.defaultCharset();
        boolean boolean15 = charset12.contains(charset14);
        java.nio.charset.CharsetEncoder charsetEncoder16 = charset12.newEncoder();
        char[] charArray17 = new char[] {};
        java.nio.CharBuffer charBuffer18 = java.nio.CharBuffer.wrap(charArray17);
        java.nio.ByteBuffer byteBuffer19 = charsetEncoder16.encode(charBuffer18);
        java.nio.CharBuffer charBuffer20 = charBuffer18.slice();
        java.nio.ByteBuffer byteBuffer21 = charsetEncoder11.encode(charBuffer20);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer23 = byteBuffer21.putLong((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[63]");
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(charsetDecoder7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(codingErrorAction10);
        org.junit.Assert.assertNotNull(charsetEncoder11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(charsetDecoder13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charsetEncoder16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        org.junit.Assert.assertNotNull(charBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(charBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.time.Instant instant0 = java.time.Instant.now();
        java.time.Instant instant1 = java.time.Instant.now();
        boolean boolean2 = instant0.isAfter(instant1);
        java.time.Duration duration3 = java.time.Duration.ZERO;
        java.time.Instant instant4 = instant1.minus((java.time.temporal.TemporalAmount) duration3);
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.MONTH_OF_YEAR;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant7 = instant1.with((java.time.temporal.TemporalField) chronoField5, (long) 11);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MonthOfYear");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.MONTH_OF_YEAR + "'", chronoField5.equals(java.time.temporal.ChronoField.MONTH_OF_YEAR));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.util.Date date1 = new java.util.Date(9223372036854775807L);
        org.junit.Assert.assertEquals(date1.toString(), "Sun Aug 17 07:12:55 UTC 292278994");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.util.Comparator<org.joda.time.DateMidnight> dateMidnightComparator0 = java.util.Comparator.naturalOrder();
        org.junit.Assert.assertNotNull(dateMidnightComparator0);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        char[] charArray5 = new char[] {};
        java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.wrap(charArray5);
        java.nio.ByteBuffer byteBuffer7 = charsetEncoder4.encode(charBuffer6);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer7.putLong(9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        java.time.Duration duration2 = java.time.Duration.ofSeconds((long) 256);
        java.time.Clock clock3 = java.time.Clock.tick(clock0, duration2);
        java.time.Duration duration5 = java.time.Duration.ofMinutes((long) 3);
        java.time.Duration duration6 = duration5.abs();
        java.time.Clock clock7 = java.time.Clock.offset(clock0, duration5);
        java.time.LocalDate localDate8 = java.time.LocalDate.now(clock7);
        java.time.ZoneId zoneId9 = clock7.getZone();
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(clock3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(clock7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(zoneId9);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            printStream3.print('+');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        org.joda.time.MutablePeriod mutablePeriod3 = weeks0.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration(readableInstant4, readableInstant5);
        org.joda.time.Duration duration8 = duration6.withMillis((-1L));
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) 0, chronology10);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration8, chronology12);
        mutablePeriod3.addDays(4096);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(0L);
        java.util.LongSummaryStatistics longSummaryStatistics2 = new java.util.LongSummaryStatistics();
        longSummaryStatistics2.accept(3);
        long long5 = longSummaryStatistics2.getMax();
        java.util.LongSummaryStatistics longSummaryStatistics6 = new java.util.LongSummaryStatistics();
        longSummaryStatistics6.accept(3);
        java.util.function.LongConsumer longConsumer9 = longSummaryStatistics2.andThen((java.util.function.LongConsumer) longSummaryStatistics6);
        java.util.stream.LongStream longStream10 = longStream1.peek((java.util.function.LongConsumer) longSummaryStatistics6);
        java.util.OptionalLong optionalLong11 = longStream10.max();
        java.util.function.LongBinaryOperator longBinaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalLong optionalLong13 = longStream10.reduce(longBinaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertEquals(longSummaryStatistics2.toString(), "LongSummaryStatistics{count=1, sum=3, min=3, average=3.000000, max=3}");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3L + "'", long5 == 3L);
        org.junit.Assert.assertEquals(longSummaryStatistics6.toString(), "LongSummaryStatistics{count=2, sum=3, min=0, average=1.500000, max=3}");
        org.junit.Assert.assertNotNull(longConsumer9);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(optionalLong11);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        gregorianCalendar5.set((int) ':', 3, 256, 5, 17, 3600000);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone17);
        long long21 = dateTimeZone17.convertLocalToUTC((long) 3, false);
        long long23 = dateTimeZone14.getMillisKeepLocal(dateTimeZone17, (long) ':');
        java.util.TimeZone timeZone24 = dateTimeZone14.toTimeZone();
        gregorianCalendar5.setTimeZone(timeZone24);
        java.util.GregorianCalendar gregorianCalendar31 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int32 = gregorianCalendar31.getWeeksInWeekYear();
        java.util.Date date33 = new java.util.Date();
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.fromDateFields(date33);
        gregorianCalendar31.setGregorianChange(date33);
        java.util.Date date36 = new java.util.Date();
        boolean boolean37 = date33.after(date36);
        java.lang.String str38 = date36.toLocaleString();
        boolean boolean39 = timeZone24.inDaylightTime(date36);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3L + "'", long21 == 3L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 58L + "'", long23 == 58L);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Mon Feb 21 09:34:32 UTC 2022");
        org.junit.Assert.assertNotNull(localTime34);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Mon Feb 21 09:34:32 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Feb 21, 2022 9:34:32 AM" + "'", str38, "Feb 21, 2022 9:34:32 AM");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.util.TimeZone timeZone7 = gregorianCalendar5.getTimeZone();
        java.time.ZoneId zoneId8 = timeZone7.toZoneId();
        java.time.zone.ZoneRules zoneRules9 = zoneId8.getRules();
        java.lang.String str10 = zoneRules9.toString();
        boolean boolean11 = zoneRules9.isFixedOffset();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(zoneRules9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZoneRules[currentStandardOffset=Z]" + "'", str10, "ZoneRules[currentStandardOffset=Z]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.net.URI uRI1 = new java.net.URI("hi!");
        java.lang.String str2 = uRI1.toASCIIString();
        java.lang.String str3 = uRI1.getRawUserInfo();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField6 = chronology3.monthOfYear();
        int int8 = dateTimeField6.getLeapAmount((long) (byte) 100);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) 0, chronology10);
        org.joda.time.LocalTime localTime13 = localTime11.minusMillis(2022);
        org.joda.time.LocalTime localTime15 = localTime13.minusHours(3);
        java.util.stream.IntStream intStream18 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        int[] intArray19 = intStream18.toArray();
        int int20 = dateTimeField6.getMaximumValue((org.joda.time.ReadablePartial) localTime13, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((java.lang.Object) dateTimeField6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.GJMonthOfYearDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12 + "'", int20 == 12);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.weekyearOfCentury();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) 0, chronology6);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        long long10 = chronology3.set((org.joda.time.ReadablePartial) localTime7, (long) (short) 10);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withField(dateTimeFieldType13, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours16 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) localTime7, (org.joda.time.ReadablePartial) localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.year();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        mutableDateTime6.setZone(dateTimeZone12);
        java.util.TimeZone timeZone14 = dateTimeZone12.toTimeZone();
        int int16 = timeZone14.getOffset((long) (byte) -1);
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale20 = java.util.Locale.GERMANY;
        java.lang.String str21 = locale19.getDisplayScript(locale20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) 0, chronology24);
        org.joda.time.Chronology chronology26 = localTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(chronology26);
        org.joda.time.DateTimeField dateTimeField29 = chronology26.monthOfYear();
        java.util.Locale locale30 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) 28, chronology26, locale30, (java.lang.Integer) 0);
        java.lang.String str33 = locale19.getDisplayName(locale30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = timeZone14.getDisplayName(false, 127, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 127");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Chinese (China)" + "'", str33, "Chinese (China)");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(508, 3, 4200);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4200 for dayOfMonth must not be larger than 31");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        java.security.GeneralSecurityException generalSecurityException1 = new java.security.GeneralSecurityException("java.text.AttributedCharacterIterator$Attribute(input_method_segment)");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.joda.time.Hours hours0 = org.joda.time.Hours.TWO;
        org.joda.time.Hours hours2 = hours0.multipliedBy(4);
        int int3 = hours2.size();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours4 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay1, (org.joda.time.ReadablePartial) timeOfDay3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay3.withFieldAdded(durationFieldType5, (int) (byte) 0);
        int int8 = timeOfDay3.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay3.plusHours(9);
        org.joda.time.TimeOfDay.Property property11 = timeOfDay3.secondOfMinute();
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate15 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset14);
        boolean boolean16 = property11.equals((java.lang.Object) localDate15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property11.getFieldType();
        org.joda.time.DurationField durationField18 = property11.getRangeDurationField();
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setDayOfYear(4096);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4096 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) 0, chronology4);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.hourOfDay();
        org.joda.time.Period period10 = new org.joda.time.Period(86399999999999L, (long) 292269054, chronology6);
        org.joda.time.DurationField durationField11 = chronology6.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval13 = new org.joda.time.Interval((java.lang.Object) '\uffff', chronology6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        mutableDateTime6.setMillis((long) 21);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfCeiling();
        org.joda.time.Days days13 = org.joda.time.Days.FOUR;
        mutableDateTime12.add((org.joda.time.ReadablePeriod) days13, (int) '+');
        org.joda.time.Seconds seconds16 = days13.toStandardSeconds();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(seconds16);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("x-windows-iso2022jp", (double) 201327L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=201327.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.Duration duration4 = duration2.withMillis((-1L));
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 3, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((java.lang.Object) dateTime7, chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight10.withDayOfYear((int) ' ');
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period16 = duration4.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight10, periodType15);
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardHours((long) 1);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight10.plus((org.joda.time.ReadableDuration) duration18);
        long long20 = duration18.getMillis();
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardMinutes((long) 292269054);
        boolean boolean23 = duration18.isLongerThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 3, chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfYear();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((java.lang.Object) dateTime26, chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime26.toMutableDateTime();
        mutableDateTime30.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime30.dayOfWeek();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime30.year();
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        mutableDateTime30.setZone(dateTimeZone36);
        java.util.Locale locale39 = java.util.Locale.TAIWAN;
        java.lang.String str40 = dateTimeZone36.getShortName((long) 64, locale39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 3, chronology42);
        org.joda.time.DateTime.Property property44 = dateTime43.dayOfYear();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight((java.lang.Object) dateTime43, chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime43.toMutableDateTime();
        mutableDateTime47.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime47.dayOfWeek();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime47.year();
        java.util.TimeZone timeZone52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        mutableDateTime47.setZone(dateTimeZone53);
        java.util.Locale locale56 = java.util.Locale.TAIWAN;
        java.lang.String str57 = dateTimeZone53.getShortName((long) 64, locale56);
        long long59 = dateTimeZone36.getMillisKeepLocal(dateTimeZone53, (long) 64);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.Duration duration62 = org.joda.time.Duration.standardHours((long) 1);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) 3, chronology64);
        org.joda.time.DateTime.Property property66 = dateTime65.dayOfYear();
        org.joda.time.Interval interval67 = property66.toInterval();
        org.joda.time.DateTime dateTime68 = interval67.getEnd();
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.Duration duration73 = new org.joda.time.Duration(readableInstant71, readableInstant72);
        org.joda.time.Duration duration75 = duration73.withMillis((-1L));
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime((long) 3, chronology77);
        org.joda.time.DateTime.Property property79 = dateTime78.dayOfYear();
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.DateMidnight dateMidnight81 = new org.joda.time.DateMidnight((java.lang.Object) dateTime78, chronology80);
        org.joda.time.DateMidnight dateMidnight83 = dateMidnight81.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight85 = dateMidnight81.withDayOfYear((int) ' ');
        org.joda.time.PeriodType periodType86 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period87 = duration75.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight81, periodType86);
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.LocalTime localTime90 = new org.joda.time.LocalTime((long) 0, chronology89);
        org.joda.time.Chronology chronology91 = localTime90.getChronology();
        org.joda.time.DateTimeField dateTimeField92 = chronology91.weekyearOfCentury();
        org.joda.time.DurationField durationField93 = chronology91.weekyears();
        org.joda.time.DurationField durationField94 = chronology91.seconds();
        org.joda.time.Chronology chronology95 = chronology91.withUTC();
        org.joda.time.DateTimeField dateTimeField96 = chronology91.hourOfDay();
        org.joda.time.Period period97 = new org.joda.time.Period(28L, 3L, periodType86, chronology91);
        org.joda.time.Period period98 = duration62.toPeriodTo((org.joda.time.ReadableInstant) dateTime68, periodType86);
        org.joda.time.Period period99 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration18, (org.joda.time.ReadableInstant) dateTime60, periodType86);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3600000L + "'", long20 == 3600000L);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:00" + "'", str57, "+00:00");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 64L + "'", long59 == 64L);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(dateMidnight83);
        org.junit.Assert.assertNotNull(dateMidnight85);
        org.junit.Assert.assertNotNull(periodType86);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(chronology91);
        org.junit.Assert.assertNotNull(dateTimeField92);
        org.junit.Assert.assertNotNull(durationField93);
        org.junit.Assert.assertNotNull(durationField94);
        org.junit.Assert.assertNotNull(chronology95);
        org.junit.Assert.assertNotNull(dateTimeField96);
        org.junit.Assert.assertNotNull(period98);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Coordinated Universal Time' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone4);
        long long8 = dateTimeZone4.convertLocalToUTC((long) 3, false);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (long) ':');
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        java.util.GregorianCalendar gregorianCalendar12 = new java.util.GregorianCalendar(timeZone11);
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar12.add((int) ':', 679);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 58L + "'", long10 == 58L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.LocalTime localTime6 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime6);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime16 = localTime12.with((java.time.temporal.TemporalField) chronoField14, (long) (short) 1);
        long long17 = localTime6.getLong((java.time.temporal.TemporalField) chronoField14);
        java.time.LocalTime localTime19 = localTime6.withSecond((int) (short) 1);
        java.lang.Object obj21 = properties1.put((java.lang.Object) localTime19, (java.lang.Object) "117");
        boolean boolean23 = properties1.containsValue((java.lang.Object) 6);
        java.lang.String str25 = properties1.getProperty("NanoOfDay");
        java.io.PrintWriter printWriter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            properties1.list(printWriter26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3601000000001L + "'", long17 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        boolean boolean10 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 3, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) dateTime13, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime13.toMutableDateTime();
        mutableDateTime17.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.year();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.weekyear();
        boolean boolean23 = duration2.equals((java.lang.Object) mutableDateTime17);
        mutableDateTime17.setYear(365);
        mutableDateTime17.add((long) 21);
        mutableDateTime17.addMillis((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime17.setMinuteOfHour(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.security.InvalidKeyException invalidKeyException1 = new java.security.InvalidKeyException("German");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.nio.ByteOrder byteOrder0 = java.nio.ByteOrder.nativeOrder();
        org.junit.Assert.assertNotNull(byteOrder0);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.LocalTime localTime6 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime6);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime16 = localTime12.with((java.time.temporal.TemporalField) chronoField14, (long) (short) 1);
        long long17 = localTime6.getLong((java.time.temporal.TemporalField) chronoField14);
        java.time.LocalTime localTime19 = localTime6.withSecond((int) (short) 1);
        java.lang.Object obj21 = properties1.put((java.lang.Object) localTime19, (java.lang.Object) "117");
        boolean boolean23 = properties1.containsValue((java.lang.Object) 6);
        java.time.LocalDate localDate26 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int27 = localDate26.getMonthValue();
        java.lang.Object obj28 = properties1.replace((java.lang.Object) 21, (java.lang.Object) localDate26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration<?> wildcardEnumeration29 = properties1.propertyNames();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.time.LocalTime cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3601000000001L + "'", long17 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.CE;
        int int1 = isoEra0.getValue();
        int int2 = isoEra0.getValue();
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.YEAR_OF_ERA;
        java.time.temporal.ValueRange valueRange4 = chronoField3.range();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = isoEra0.getLong((java.time.temporal.TemporalField) chronoField3);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: YearOfEra");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra0.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.YEAR_OF_ERA + "'", chronoField3.equals(java.time.temporal.ChronoField.YEAR_OF_ERA));
        org.junit.Assert.assertNotNull(valueRange4);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("x-windows-iso2022jp");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=x-windows-iso2022jp");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Interval interval4 = property3.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = property3.setCopy(2147483647);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2147483647 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        gregorianCalendar5.set((int) ':', 3, 256, 5, 17, 3600000);
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar5.setWeekDate(64, 32769, 2097);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 2097");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.time.ZoneOffset zoneOffset2 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate3 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset2);
        java.util.Properties properties5 = null;
        java.util.Properties properties6 = new java.util.Properties(properties5);
        java.time.LocalTime localTime11 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime12 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime11);
        java.time.LocalTime localTime17 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime18 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime17);
        java.time.temporal.ChronoField chronoField19 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime21 = localTime17.with((java.time.temporal.TemporalField) chronoField19, (long) (short) 1);
        long long22 = localTime11.getLong((java.time.temporal.TemporalField) chronoField19);
        java.time.LocalTime localTime24 = localTime11.withSecond((int) (short) 1);
        java.lang.Object obj26 = properties6.put((java.lang.Object) localTime24, (java.lang.Object) "117");
        java.time.LocalDateTime localDateTime27 = java.time.LocalDateTime.MIN;
        java.time.Month month28 = java.time.Month.NOVEMBER;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime29 = localDateTime27.with((java.time.temporal.TemporalAdjuster) month28);
        java.time.LocalDate localDate32 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int33 = localDate32.getMonthValue();
        org.joda.time.Period period34 = org.joda.time.Period.ZERO;
        org.joda.time.Period period35 = period34.normalizedStandard();
        org.joda.time.Period period37 = period34.plusHours(2);
        java.time.chrono.IsoEra isoEra38 = java.time.chrono.IsoEra.CE;
        boolean boolean39 = period37.equals((java.lang.Object) isoEra38);
        java.time.LocalTime localTime44 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime45 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime44);
        java.time.LocalTime localTime50 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime51 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime50);
        java.time.temporal.ChronoField chronoField52 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime54 = localTime50.with((java.time.temporal.TemporalField) chronoField52, (long) (short) 1);
        long long55 = localTime44.getLong((java.time.temporal.TemporalField) chronoField52);
        boolean boolean56 = isoEra38.isSupported((java.time.temporal.TemporalField) chronoField52);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery57 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period58 = isoEra38.query(periodTemporalQuery57);
        boolean boolean59 = period58.isNegative();
        java.time.Period period61 = period58.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField62 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean63 = period58.equals((java.lang.Object) chronoField62);
        boolean boolean64 = localDate32.isSupported((java.time.temporal.TemporalField) chronoField62);
        java.time.temporal.TemporalUnit temporalUnit65 = chronoField62.getRangeUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime66 = localDateChronoLocalDateTime29.plus(1L, temporalUnit65);
        java.time.LocalTime localTime67 = localTime24.truncatedTo(temporalUnit65);
        java.time.chrono.ChronoLocalDate chronoLocalDate68 = localDate3.minus((long) 3600000, temporalUnit65);
        java.time.OffsetTime offsetTime69 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime70 = offsetTime69.toLocalTime();
        java.lang.String str71 = offsetTime69.toString();
        java.time.OffsetTime offsetTime72 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime73 = offsetTime72.toLocalTime();
        boolean boolean74 = offsetTime69.isBefore(offsetTime72);
        java.time.OffsetTime offsetTime76 = offsetTime72.withHour(0);
        java.time.OffsetTime offsetTime78 = offsetTime76.minusMinutes((long) 127);
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDate chronoLocalDate79 = localDate3.with((java.time.temporal.TemporalAdjuster) offsetTime76);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneOffset2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + chronoField19 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField19.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3601000000001L + "'", long22 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + month28 + "' != '" + java.time.Month.NOVEMBER + "'", month28.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime29);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertTrue("'" + isoEra38 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra38.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertTrue("'" + chronoField52 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField52.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 3601000000001L + "'", long55 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertTrue("'" + chronoField62 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField62.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit65 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit65.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime66);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(chronoLocalDate68);
        org.junit.Assert.assertNotNull(offsetTime69);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "23:59:59.999999999-18:00" + "'", str71, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(offsetTime72);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(offsetTime76);
        org.junit.Assert.assertNotNull(offsetTime78);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        org.joda.time.MutablePeriod mutablePeriod3 = weeks0.toMutablePeriod();
        int int4 = mutablePeriod3.getSeconds();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 3, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.DateTime dateTime10 = interval9.getEnd();
        mutablePeriod3.setPeriod((org.joda.time.ReadableInterval) interval9);
        mutablePeriod3.addWeeks((int) '#');
        mutablePeriod3.setMonths(64);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        boolean boolean2 = offsetDateTime0.isSupported((java.time.temporal.TemporalField) chronoField1);
        java.lang.String str3 = offsetDateTime0.toString();
        java.time.LocalDateTime localDateTime4 = offsetDateTime0.toLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime6 = offsetDateTime0.withDayOfYear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfYear (valid values 1 - 365/366): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-21T09:34:33.833Z" + "'", str3, "2022-02-21T09:34:33.833Z");
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.util.TimeZone timeZone7 = gregorianCalendar5.getTimeZone();
        timeZone7.setID("PT2147483647M");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.millis();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.lang.String str7 = gregorianCalendar5.getCalendarType();
        java.time.ZonedDateTime zonedDateTime8 = gregorianCalendar5.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime8.minusMonths((long) 10);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.minusHours((long) 9);
        java.time.LocalTime localTime17 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime18 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime17);
        java.time.LocalTime localTime23 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime24 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime23);
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime27 = localTime23.with((java.time.temporal.TemporalField) chronoField25, (long) (short) 1);
        long long28 = localTime17.getLong((java.time.temporal.TemporalField) chronoField25);
        java.time.LocalTime localTime30 = localTime17.withSecond((int) (short) 1);
        int int31 = localTime30.getMinute();
        java.time.LocalTime localTime33 = localTime30.plusHours((long) (-1));
        java.time.LocalDateTime localDateTime34 = java.time.LocalDateTime.now();
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery35 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period36 = localDateTime34.query(periodTemporalQuery35);
        java.time.Period period37 = localTime33.query(periodTemporalQuery35);
        java.time.Period period38 = zonedDateTime12.query(periodTemporalQuery35);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime40 = zonedDateTime12.minusHours(6603384152749567654L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for Year (valid values -999999999 - 999999999): -753310489235061");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gregory" + "'", str7, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField25.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3601000000001L + "'", long28 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(periodTemporalQuery35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean3 = weeks1.equals((java.lang.Object) timeUnit2);
        org.joda.time.MutablePeriod mutablePeriod4 = weeks1.toMutablePeriod();
        boolean boolean5 = weeks0.isGreaterThan(weeks1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = duration8.toPeriodTo(readableInstant9, periodType10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration(readableInstant12, readableInstant13);
        long long15 = duration14.getMillis();
        boolean boolean16 = duration8.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 3, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.dayOfYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((java.lang.Object) dateTime19, chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime19.toMutableDateTime();
        mutableDateTime23.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime23.dayOfWeek();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime23.year();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.weekyear();
        boolean boolean29 = duration8.equals((java.lang.Object) mutableDateTime23);
        mutableDateTime23.addMonths((int) ' ');
        mutableDateTime23.add((long) (byte) 10);
        org.joda.time.Period period34 = org.joda.time.Period.ZERO;
        org.joda.time.Period period35 = period34.normalizedStandard();
        org.joda.time.Period period37 = period34.plusHours(2);
        java.time.chrono.IsoEra isoEra38 = java.time.chrono.IsoEra.CE;
        boolean boolean39 = period37.equals((java.lang.Object) isoEra38);
        int int40 = period37.getMinutes();
        mutableDateTime23.add((org.joda.time.ReadablePeriod) period37);
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone44);
        long long48 = dateTimeZone44.convertLocalToUTC((long) 3, false);
        long long51 = dateTimeZone44.convertLocalToUTC(0L, true);
        mutableDateTime23.setZoneRetainFields(dateTimeZone44);
        org.joda.time.Interval interval53 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) weeks0, (org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.MutableInterval mutableInterval54 = interval53.toMutableInterval();
        long long55 = mutableInterval54.getStartMillis();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(timeUnit2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertTrue("'" + isoEra38 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra38.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 3L + "'", long48 == 3L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(mutableInterval54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 3238106400013L + "'", long55 == 3238106400013L);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.lang.String str7 = gregorianCalendar5.getCalendarType();
        java.time.ZonedDateTime zonedDateTime8 = gregorianCalendar5.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime8.minusMonths((long) 10);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime11 = zonedDateTime8.withEarlierOffsetAtOverlap();
        java.time.ZonedDateTime zonedDateTime13 = zonedDateTime8.minusMonths((long) 4200);
        java.time.ZonedDateTime zonedDateTime15 = zonedDateTime13.plusNanos(8L);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime17 = zonedDateTime15.plusDays((-9223372036854775808L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: long overflow");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gregory" + "'", str7, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime11);
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(zonedDateTime15);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(0);
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.put(byteArray4, (int) (short) 1, 19043);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1]");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            filterOutputStream1.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Interval interval4 = property3.toInterval();
        java.lang.String str5 = interval4.toString();
        org.joda.time.Interval interval6 = interval4.toInterval();
        java.time.LocalDateTime localDateTime7 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField8 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime10 = localDateTime7.with((java.time.temporal.TemporalField) chronoField8, (long) 10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 0, chronology12);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = chronology14.weekyears();
        org.joda.time.DurationField durationField17 = chronology14.seconds();
        org.joda.time.Chronology chronology18 = chronology14.withUTC();
        boolean boolean19 = localDateChronoLocalDateTime10.equals((java.lang.Object) chronology14);
        org.joda.time.DateTimeField dateTimeField20 = chronology14.yearOfEra();
        boolean boolean21 = interval4.equals((java.lang.Object) dateTimeField20);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z" + "'", str5, "1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z");
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + chronoField8 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField8.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime10);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        java.util.Set<java.lang.String> strSet3 = java.time.ZoneId.getAvailableZoneIds();
        java.util.stream.Stream<java.lang.String> strStream4 = strSet3.parallelStream();
        boolean boolean6 = strSet3.remove((java.lang.Object) 0);
        boolean boolean8 = strSet3.add("0 - 86399");
        timeUnit1.timedWait((java.lang.Object) boolean8, (long) (byte) 0);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strStream4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        int int0 = org.joda.time.chrono.EthiopicChronology.EE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        byte[] byteArray5 = charsetEncoder4.replacement();
        java.nio.charset.Charset charset6 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder7 = charset6.newDecoder();
        float float8 = charsetDecoder7.maxCharsPerByte();
        float float9 = charsetDecoder7.averageCharsPerByte();
        java.nio.charset.CodingErrorAction codingErrorAction10 = charsetDecoder7.unmappableCharacterAction();
        java.nio.charset.CharsetEncoder charsetEncoder11 = charsetEncoder4.onUnmappableCharacter(codingErrorAction10);
        java.nio.charset.Charset charset12 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder13 = charset12.newDecoder();
        java.nio.charset.Charset charset14 = java.nio.charset.Charset.defaultCharset();
        boolean boolean15 = charset12.contains(charset14);
        java.nio.charset.CharsetEncoder charsetEncoder16 = charset12.newEncoder();
        char[] charArray17 = new char[] {};
        java.nio.CharBuffer charBuffer18 = java.nio.CharBuffer.wrap(charArray17);
        java.nio.ByteBuffer byteBuffer19 = charsetEncoder16.encode(charBuffer18);
        java.nio.CharBuffer charBuffer20 = charBuffer18.slice();
        java.nio.ByteBuffer byteBuffer21 = charsetEncoder11.encode(charBuffer20);
        // The following exception was thrown during execution in test generation
        try {
            char char22 = byteBuffer21.getChar();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[63]");
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(charsetDecoder7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(codingErrorAction10);
        org.junit.Assert.assertNotNull(charsetEncoder11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(charsetDecoder13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charsetEncoder16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        org.junit.Assert.assertNotNull(charBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(charBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream2 = doubleStream0.skip(0L);
        java.util.stream.DoubleStream doubleStream3 = doubleStream2.unordered();
        java.util.function.DoubleBinaryOperator doubleBinaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble5 = doubleStream3.reduce(doubleBinaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        org.joda.time.MutablePeriod mutablePeriod3 = weeks0.toMutablePeriod();
        int int4 = mutablePeriod3.getSeconds();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 3, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.DateTime dateTime10 = interval9.getEnd();
        mutablePeriod3.setPeriod((org.joda.time.ReadableInterval) interval9);
        mutablePeriod3.addWeeks((int) '#');
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = duration17.toPeriodTo(readableInstant18, periodType19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = new org.joda.time.Duration(readableInstant21, readableInstant22);
        long long24 = duration23.getMillis();
        boolean boolean25 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusSeconds(6);
        org.joda.time.DateTime dateTime32 = localDateTime29.toDateTime();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration23, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.MutablePeriod[] mutablePeriodArray34 = new org.joda.time.MutablePeriod[] { mutablePeriod3, mutablePeriod14, mutablePeriod33 };
        java.util.stream.Stream<org.joda.time.MutablePeriod> mutablePeriodStream35 = java.util.stream.Stream.of(mutablePeriodArray34);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(mutablePeriodArray34);
        org.junit.Assert.assertNotNull(mutablePeriodStream35);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.LocalDate localDate1 = offsetDateTime0.toLocalDate();
        java.time.LocalTime localTime6 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime6);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime16 = localTime12.with((java.time.temporal.TemporalField) chronoField14, (long) (short) 1);
        long long17 = localTime6.getLong((java.time.temporal.TemporalField) chronoField14);
        long long18 = offsetDateTime0.getLong((java.time.temporal.TemporalField) chronoField14);
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3601000000001L + "'", long17 == 3601000000001L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 34476909000000L + "'", long18 == 34476909000000L);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime3 = localDateTime0.with((java.time.temporal.TemporalField) chronoField1, (long) 10);
        java.time.LocalDateTime localDateTime5 = localDateTime0.withDayOfYear((int) '/');
        java.time.LocalDateTime localDateTime7 = localDateTime0.minusYears((long) 3600000);
        int int8 = localDateTime0.getNano();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96000000 + "'", int8 == 96000000);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        boolean boolean10 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 3, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) dateTime13, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime13.toMutableDateTime();
        mutableDateTime17.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.year();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.weekyear();
        boolean boolean23 = duration2.equals((java.lang.Object) mutableDateTime17);
        mutableDateTime17.addMonths((int) ' ');
        mutableDateTime17.add((long) (byte) 10);
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        org.joda.time.Period period29 = period28.normalizedStandard();
        org.joda.time.Period period31 = period28.plusHours(2);
        java.time.chrono.IsoEra isoEra32 = java.time.chrono.IsoEra.CE;
        boolean boolean33 = period31.equals((java.lang.Object) isoEra32);
        int int34 = period31.getMinutes();
        mutableDateTime17.add((org.joda.time.ReadablePeriod) period31);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone38);
        long long42 = dateTimeZone38.convertLocalToUTC((long) 3, false);
        long long45 = dateTimeZone38.convertLocalToUTC(0L, true);
        mutableDateTime17.setZoneRetainFields(dateTimeZone38);
        java.lang.String str47 = dateTimeZone38.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology48 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField49 = ethiopicChronology48.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long57 = ethiopicChronology48.getDateTimeMillis(32, 88, 127, 6, 16, 256, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 256 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + isoEra32 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra32.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3L + "'", long42 == 3L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Etc/UTC" + "'", str47, "Etc/UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.lang.String str7 = gregorianCalendar5.getCalendarType();
        java.time.ZonedDateTime zonedDateTime8 = gregorianCalendar5.toZonedDateTime();
        java.util.Date date15 = new java.util.Date((int) 'a', 3, 0, (-1), (int) '/', 28);
        int int16 = date15.getTimezoneOffset();
        gregorianCalendar5.setGregorianChange(date15);
        java.util.GregorianCalendar gregorianCalendar23 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int24 = gregorianCalendar23.getWeeksInWeekYear();
        java.lang.String str25 = gregorianCalendar23.getCalendarType();
        java.time.ZonedDateTime zonedDateTime26 = gregorianCalendar23.toZonedDateTime();
        java.util.Date date33 = new java.util.Date((int) 'a', 3, 0, (-1), (int) '/', 28);
        int int34 = date33.getTimezoneOffset();
        gregorianCalendar23.setGregorianChange(date33);
        boolean boolean36 = date15.after(date33);
        java.lang.Object obj37 = date15.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gregory" + "'", str7, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Mar 30 23:47:28 UTC 1997");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "gregory" + "'", str25, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime26);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Mar 30 23:47:28 UTC 1997");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "Sun Mar 30 23:47:28 UTC 1997");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "Sun Mar 30 23:47:28 UTC 1997");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "Sun Mar 30 23:47:28 UTC 1997");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.util.Comparator<java.time.chrono.ChronoLocalDateTime<?>> wildcardChronoLocalDateTimeComparator0 = java.time.chrono.ChronoLocalDateTime.timeLineOrder();
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTimeComparator0);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) 0, chronology8);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(chronology10);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(22, 8, 17, 4, 7, 20, 0, chronology10);
        long long17 = chronology10.add((long) 127, (long) 100, 2012);
        org.joda.time.DateTimeZone dateTimeZone18 = chronology10.getZone();
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 201327L + "'", long17 == 201327L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        byte[] byteArray3 = new byte[] { (byte) 100 };
        filterOutputStream1.write(byteArray3, (int) (byte) 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.wrap(byteArray3);
        java.nio.LongBuffer longBuffer8 = byteBuffer7.asLongBuffer();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = byteBuffer9.getLong((int) '.');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(longBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale locale6 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray7 = new java.util.Locale[] { locale6 };
        java.util.ArrayList<java.util.Locale> localeList8 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList8, localeArray7);
        java.util.List<java.util.Locale> localeList10 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList8);
        localeList10.clear();
        java.util.List<java.util.Locale> localeList12 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale19 };
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList21);
        localeList23.clear();
        java.util.List<java.util.Locale> localeList25 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList23);
        java.util.List<java.util.Locale> localeList26 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList25);
        java.util.ListIterator<java.util.Locale> localeItor27 = localeList25.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale28 = localeItor27.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localeList10);
        org.junit.Assert.assertNotNull(localeList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localeList23);
        org.junit.Assert.assertNotNull(localeList25);
        org.junit.Assert.assertNotNull(localeList26);
        org.junit.Assert.assertNotNull(localeItor27);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) ' ');
        java.time.OffsetTime offsetTime2 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime3 = offsetTime2.toLocalTime();
        java.lang.String str4 = offsetTime2.toString();
        java.time.Duration duration5 = java.time.Duration.ZERO;
        java.lang.String str6 = duration5.toString();
        java.time.OffsetTime offsetTime7 = offsetTime2.plus((java.time.temporal.TemporalAmount) duration5);
        java.time.LocalTime localTime8 = offsetTime2.toLocalTime();
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime9 = localDate1.atTime(localTime8);
        java.lang.String str10 = localTime8.toString();
        java.time.OffsetTime offsetTime11 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime12 = offsetTime11.toLocalTime();
        java.lang.String str13 = offsetTime11.toString();
        java.time.Duration duration14 = java.time.Duration.ZERO;
        java.lang.String str15 = duration14.toString();
        java.time.OffsetTime offsetTime16 = offsetTime11.plus((java.time.temporal.TemporalAmount) duration14);
        java.time.OffsetTime offsetTime18 = offsetTime11.plusNanos((long) 0);
        java.time.LocalTime localTime23 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime24 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime23);
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime27 = localTime23.with((java.time.temporal.TemporalField) chronoField25, (long) (short) 1);
        java.util.Locale locale28 = java.util.Locale.GERMANY;
        java.lang.String str29 = chronoField25.getDisplayName(locale28);
        java.time.OffsetTime offsetTime31 = offsetTime18.with((java.time.temporal.TemporalField) chronoField25, (long) 28);
        org.joda.time.Period period32 = org.joda.time.Period.ZERO;
        org.joda.time.Period period33 = period32.normalizedStandard();
        org.joda.time.Period period35 = period32.plusHours(2);
        java.time.chrono.IsoEra isoEra36 = java.time.chrono.IsoEra.CE;
        boolean boolean37 = period35.equals((java.lang.Object) isoEra36);
        java.time.LocalTime localTime42 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime43 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime42);
        java.time.LocalTime localTime48 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime49 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime48);
        java.time.temporal.ChronoField chronoField50 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime52 = localTime48.with((java.time.temporal.TemporalField) chronoField50, (long) (short) 1);
        long long53 = localTime42.getLong((java.time.temporal.TemporalField) chronoField50);
        boolean boolean54 = isoEra36.isSupported((java.time.temporal.TemporalField) chronoField50);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery55 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period56 = isoEra36.query(periodTemporalQuery55);
        boolean boolean57 = period56.isNegative();
        java.time.Period period59 = period56.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField60 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean61 = period56.equals((java.lang.Object) chronoField60);
        java.time.chrono.ChronoPeriod chronoPeriod62 = period56.negated();
        java.time.OffsetTime offsetTime63 = offsetTime18.minus((java.time.temporal.TemporalAmount) period56);
        java.time.temporal.ChronoField chronoField64 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange65 = chronoField64.range();
        long long66 = offsetTime18.getLong((java.time.temporal.TemporalField) chronoField64);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime68 = localTime8.with((java.time.temporal.TemporalField) chronoField64, (long) ':');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 58");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23:59:59.999999999-18:00" + "'", str4, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0S" + "'", str6, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "23:59:59.999999999" + "'", str10, "23:59:59.999999999");
        org.junit.Assert.assertNotNull(offsetTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23:59:59.999999999-18:00" + "'", str13, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT0S" + "'", str15, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime16);
        org.junit.Assert.assertNotNull(offsetTime18);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField25.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "NanoOfDay" + "'", str29, "NanoOfDay");
        org.junit.Assert.assertNotNull(offsetTime31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + isoEra36 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra36.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertTrue("'" + chronoField50 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField50.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 3601000000001L + "'", long53 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery55);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + chronoField60 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField60.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(chronoPeriod62);
        org.junit.Assert.assertNotNull(offsetTime63);
        org.junit.Assert.assertTrue("'" + chronoField64 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField64.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 23L + "'", long66 == 23L);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(0, 0, (int) (byte) 100);
        java.util.Calendar.Builder builder8 = builder0.setDate((int) (byte) 10, 57, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder10 = builder0.setCalendarType("Days");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: Days");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        byte[] byteArray5 = charsetEncoder4.replacement();
        java.nio.charset.Charset charset6 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder7 = charset6.newDecoder();
        float float8 = charsetDecoder7.maxCharsPerByte();
        float float9 = charsetDecoder7.averageCharsPerByte();
        java.nio.charset.CodingErrorAction codingErrorAction10 = charsetDecoder7.unmappableCharacterAction();
        java.nio.charset.CharsetEncoder charsetEncoder11 = charsetEncoder4.onUnmappableCharacter(codingErrorAction10);
        java.nio.charset.Charset charset12 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder13 = charset12.newDecoder();
        java.nio.charset.Charset charset14 = java.nio.charset.Charset.defaultCharset();
        boolean boolean15 = charset12.contains(charset14);
        java.nio.charset.CharsetEncoder charsetEncoder16 = charset12.newEncoder();
        byte[] byteArray17 = charsetEncoder16.replacement();
        java.nio.charset.CharsetEncoder charsetEncoder18 = charsetEncoder4.replaceWith(byteArray17);
        java.nio.charset.Charset charset19 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder20 = charset19.newDecoder();
        java.nio.charset.Charset charset21 = java.nio.charset.Charset.defaultCharset();
        boolean boolean22 = charset19.contains(charset21);
        java.nio.charset.CharsetEncoder charsetEncoder23 = charset19.newEncoder();
        char[] charArray24 = new char[] {};
        java.nio.CharBuffer charBuffer25 = java.nio.CharBuffer.wrap(charArray24);
        java.nio.ByteBuffer byteBuffer26 = charsetEncoder23.encode(charBuffer25);
        java.nio.CharBuffer charBuffer27 = charBuffer25.slice();
        java.nio.CharBuffer charBuffer28 = charBuffer25.compact();
        java.nio.CharBuffer charBuffer29 = charBuffer25.duplicate();
        java.nio.ByteBuffer byteBuffer30 = charsetEncoder4.encode(charBuffer25);
        // The following exception was thrown during execution in test generation
        try {
            char char31 = charBuffer25.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[63]");
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(charsetDecoder7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(codingErrorAction10);
        org.junit.Assert.assertNotNull(charsetEncoder11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(charsetDecoder13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charsetEncoder16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[63]");
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(charsetDecoder20);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charsetEncoder23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertNotNull(charBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(charBuffer27);
        org.junit.Assert.assertNotNull(charBuffer28);
        org.junit.Assert.assertNotNull(charBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer30);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale locale6 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray7 = new java.util.Locale[] { locale6 };
        java.util.ArrayList<java.util.Locale> localeList8 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList8, localeArray7);
        java.util.List<java.util.Locale> localeList10 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList8);
        localeList10.clear();
        java.util.List<java.util.Locale> localeList12 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale19 };
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList21);
        localeList23.clear();
        java.util.List<java.util.Locale> localeList25 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList23);
        java.util.List<java.util.Locale> localeList26 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList25);
        java.util.ListIterator<java.util.Locale> localeItor27 = localeList25.listIterator();
        java.util.Locale locale28 = java.util.Locale.CHINA;
        java.lang.String str29 = locale28.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            localeItor27.set(locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localeList10);
        org.junit.Assert.assertNotNull(localeList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localeList23);
        org.junit.Assert.assertNotNull(localeList25);
        org.junit.Assert.assertNotNull(localeList26);
        org.junit.Assert.assertNotNull(localeItor27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chinese" + "'", str29, "Chinese");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight5.withDayOfYear((int) ' ');
        int int10 = dateMidnight5.getMonthOfYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange4 = java.time.temporal.ValueRange.of((long) (byte) 1, 36484003L, (long) 28, (long) 508);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value must be less than maximum value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.CE;
        int int1 = isoEra0.getValue();
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusHours(2);
        java.time.chrono.IsoEra isoEra6 = java.time.chrono.IsoEra.CE;
        boolean boolean7 = period5.equals((java.lang.Object) isoEra6);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.LocalTime localTime18 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime19 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime18);
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime22 = localTime18.with((java.time.temporal.TemporalField) chronoField20, (long) (short) 1);
        long long23 = localTime12.getLong((java.time.temporal.TemporalField) chronoField20);
        boolean boolean24 = isoEra6.isSupported((java.time.temporal.TemporalField) chronoField20);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery25 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period26 = isoEra6.query(periodTemporalQuery25);
        boolean boolean27 = period26.isNegative();
        java.time.Period period29 = period26.plusDays((long) ' ');
        boolean boolean30 = period26.isNegative();
        java.time.Period period32 = period26.minusYears((long) 10);
        org.joda.time.Period period33 = org.joda.time.Period.ZERO;
        org.joda.time.Period period34 = period33.normalizedStandard();
        org.joda.time.Period period36 = period33.plusHours(2);
        java.time.chrono.IsoEra isoEra37 = java.time.chrono.IsoEra.CE;
        boolean boolean38 = period36.equals((java.lang.Object) isoEra37);
        java.time.LocalTime localTime43 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime44 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime43);
        java.time.LocalTime localTime49 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime50 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime49);
        java.time.temporal.ChronoField chronoField51 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime53 = localTime49.with((java.time.temporal.TemporalField) chronoField51, (long) (short) 1);
        long long54 = localTime43.getLong((java.time.temporal.TemporalField) chronoField51);
        boolean boolean55 = isoEra37.isSupported((java.time.temporal.TemporalField) chronoField51);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery56 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period57 = isoEra37.query(periodTemporalQuery56);
        java.time.chrono.ChronoPeriod chronoPeriod58 = period32.minus((java.time.temporal.TemporalAmount) period57);
        java.time.chrono.ChronoPeriod chronoPeriod60 = period32.multipliedBy(4096);
        int int61 = period32.getMonths();
        java.time.chrono.IsoChronology isoChronology62 = period32.getChronology();
        java.time.LocalDateTime localDateTime63 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField64 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime66 = localDateTime63.with((java.time.temporal.TemporalField) chronoField64, (long) 10);
        java.time.temporal.ValueRange valueRange67 = isoChronology62.range(chronoField64);
        // The following exception was thrown during execution in test generation
        try {
            long long68 = isoEra0.getLong((java.time.temporal.TemporalField) chronoField64);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: NanoOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra0.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + isoEra6 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra6.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField20.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3601000000001L + "'", long23 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + isoEra37 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra37.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertTrue("'" + chronoField51 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField51.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 3601000000001L + "'", long54 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(chronoPeriod58);
        org.junit.Assert.assertNotNull(chronoPeriod60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(isoChronology62);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + chronoField64 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField64.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime66);
        org.junit.Assert.assertNotNull(valueRange67);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        boolean boolean10 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 3, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) dateTime13, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime13.toMutableDateTime();
        mutableDateTime17.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.year();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.weekyear();
        boolean boolean23 = duration2.equals((java.lang.Object) mutableDateTime17);
        mutableDateTime17.setYear(365);
        mutableDateTime17.setTime(14, 17, (int) (byte) 1, 22);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            printStream3.println((double) 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.plusYears((int) (short) 100);
        int int7 = localDateTime3.getSecondOfMinute();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusSeconds(6);
        boolean boolean14 = localDateTime3.isEqual((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        int int19 = seconds18.getSeconds();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime3.plus((org.joda.time.ReadablePeriod) seconds18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localDateTime3.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 38 + "'", int7 == 38);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.util.IntSummaryStatistics intSummaryStatistics0 = new java.util.IntSummaryStatistics();
        java.lang.String str1 = intSummaryStatistics0.toString();
        org.junit.Assert.assertEquals(intSummaryStatistics0.toString(), "IntSummaryStatistics{count=0, sum=0, min=2147483647, average=0.000000, max=-2147483648}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IntSummaryStatistics{count=0, sum=0, min=2147483647, average=0.000000, max=-2147483648}" + "'", str1, "IntSummaryStatistics{count=0, sum=0, min=2147483647, average=0.000000, max=-2147483648}");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        long long6 = localTime4.toNanoOfDay();
        java.time.OffsetTime offsetTime7 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime8 = offsetTime7.toLocalTime();
        java.time.Duration duration10 = java.time.Duration.ofMinutes((long) 3);
        java.time.temporal.Temporal temporal11 = localTime8.plus((java.time.temporal.TemporalAmount) duration10);
        java.time.Duration duration13 = duration10.plusNanos((long) 9);
        java.time.LocalTime localTime14 = localTime4.plus((java.time.temporal.TemporalAmount) duration10);
        java.time.Duration duration15 = duration10.negated();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3601000000001L + "'", long6 == 3601000000001L);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(temporal11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(duration15);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(0, 0, (int) (byte) 100);
        java.util.Calendar.Builder builder8 = builder0.setDate((int) (byte) 10, 57, 0);
        java.util.Calendar.Builder builder13 = builder8.setTimeOfDay((int) '\uffff', 508, 96000000, (int) (byte) 0);
        java.util.Date date20 = new java.util.Date((int) (byte) 100, 4, 306, (int) ':', 52, (int) ' ');
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusSeconds(6);
        org.joda.time.DateTime dateTime27 = localDateTime24.toDateTime();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.minusMillis((int) '/');
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusMonths(100);
        java.util.Date date32 = localDateTime29.toDate();
        boolean boolean33 = date20.after(date32);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder34 = builder13.setInstant(date32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals(date20.toString(), "Sun Mar 04 10:52:32 UTC 2001");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Thu Feb 21 09:34:38 UTC 2097");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        org.joda.time.MutablePeriod mutablePeriod3 = weeks0.toMutablePeriod();
        int int4 = mutablePeriod3.getSeconds();
        mutablePeriod3.addHours((int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray7 = mutablePeriod3.getFieldTypes();
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit10 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean11 = weeks9.equals((java.lang.Object) timeUnit10);
        org.joda.time.MutablePeriod mutablePeriod12 = weeks9.toMutablePeriod();
        int int13 = mutablePeriod12.getSeconds();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = new org.joda.time.Duration(readableInstant14, readableInstant15);
        long long17 = duration16.getMillis();
        org.joda.time.Duration duration19 = duration16.plus((long) (byte) 1);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) 0, chronology22);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        java.lang.String str27 = locale25.getDisplayScript(locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 1970, chronology24, locale25, (java.lang.Integer) 1);
        mutablePeriod12.setPeriod((org.joda.time.ReadableDuration) duration16, chronology24);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((java.lang.Object) 36484003L, chronology24);
        mutableDateTime31.addWeekyears((int) (short) 10);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 3, chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.dayOfYear();
        org.joda.time.Interval interval38 = property37.toInterval();
        org.joda.time.DateTimeField dateTimeField39 = property37.getField();
        org.joda.time.DateTime dateTime41 = property37.addToCopy((long) (byte) 1);
        org.joda.time.DateTime dateTime43 = dateTime41.withYear(4);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 3, chronology45);
        org.joda.time.Period period47 = org.joda.time.Period.ZERO;
        org.joda.time.Period period48 = period47.normalizedStandard();
        org.joda.time.Period period50 = period48.minusMinutes((int) ' ');
        org.joda.time.Period period52 = period50.minusMonths((int) (byte) 0);
        org.joda.time.PeriodType periodType53 = period52.getPeriodType();
        org.joda.time.DateTime dateTime54 = dateTime46.minus((org.joda.time.ReadablePeriod) period52);
        org.joda.time.Duration duration55 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime dateTime56 = dateTime43.withTimeAtStartOfDay();
        java.util.TimeZone timeZone57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        java.util.TimeZone timeZone60 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forTimeZone(timeZone60);
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone61);
        long long65 = dateTimeZone61.convertLocalToUTC((long) 3, false);
        long long67 = dateTimeZone58.getMillisKeepLocal(dateTimeZone61, (long) ':');
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((java.lang.Object) dateTime43, dateTimeZone61);
        int int69 = dateTime68.getCenturyOfEra();
        mutablePeriod3.setPeriod((org.joda.time.ReadableInstant) mutableDateTime31, (org.joda.time.ReadableInstant) dateTime68);
        int int71 = mutableDateTime31.getDayOfMonth();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(timeUnit10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 3L + "'", long65 == 3L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 58L + "'", long67 == 58L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours4 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay1, (org.joda.time.ReadablePartial) timeOfDay3);
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay1.withSecondOfMinute(0);
        int int7 = timeOfDay1.size();
        int[] intArray8 = timeOfDay1.getValues();
        org.joda.time.LocalTime localTime9 = timeOfDay1.toLocalTime();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) 0, chronology11);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.hourOfDay();
        org.joda.time.DurationField durationField17 = chronology13.weeks();
        org.joda.time.DurationFieldType durationFieldType18 = durationField17.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay20 = timeOfDay1.withFieldAdded(durationFieldType18, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weeks' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationFieldType18);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        java.util.IntSummaryStatistics intSummaryStatistics3 = new java.util.IntSummaryStatistics();
        intStream2.forEach((java.util.function.IntConsumer) intSummaryStatistics3);
        intSummaryStatistics3.accept((int) '#');
        intSummaryStatistics3.accept(3600000);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals(intSummaryStatistics3.toString(), "IntSummaryStatistics{count=2, sum=3600035, min=35, average=1800017.500000, max=3600000}");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        gregorianCalendar5.set((int) ':', 3, 256, 5, 17, 3600000);
        int int13 = gregorianCalendar5.getWeekYear();
        int int14 = gregorianCalendar5.getFirstDayOfWeek();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.fromCalendarFields((java.util.Calendar) gregorianCalendar5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withTime(256, 10800000, 256, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 256 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 59 + "'", int13 == 59);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        float float2 = charsetDecoder1.maxCharsPerByte();
        float float3 = charsetDecoder1.averageCharsPerByte();
        char[] charArray10 = new char[] { '#', '/', '4', 'a', '4', 'u' };
        java.nio.CharBuffer charBuffer11 = java.nio.CharBuffer.wrap(charArray10);
        java.nio.CharBuffer charBuffer12 = charBuffer11.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.charset.CoderResult coderResult13 = charsetDecoder1.flush(charBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Current state = RESET, new state = FLUSHED");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#/4a4u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#/4a4u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, /, 4, a, 4, u]");
        org.junit.Assert.assertNotNull(charBuffer11);
        org.junit.Assert.assertNotNull(charBuffer12);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.OptionalDouble optionalDouble1 = doubleStream0.findFirst();
        // The following exception was thrown during execution in test generation
        try {
            long long2 = doubleStream0.count();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField6 = chronology3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = chronology3.getDateTimeMillis((-10), 15, (-10), 97, 256, 52, 12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.parse((java.lang.CharSequence) "2022-02-21T09:34:25.512");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '2022-02-21T09:34:25.512' could not be parsed at index 23");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        boolean boolean0 = java.net.URLConnection.getDefaultAllowUserInteraction();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withMinuteOfHour((int) ' ');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusYears((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        boolean boolean2 = offsetDateTime0.isSupported((java.time.temporal.TemporalField) chronoField1);
        java.time.temporal.ValueRange valueRange3 = chronoField1.range();
        long long4 = valueRange3.getLargestMinimum();
        java.lang.String str5 = valueRange3.toString();
        long long6 = valueRange3.getMaximum();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(valueRange3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 - 23" + "'", str5, "0 - 23");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 23L + "'", long6 == 23L);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        java.util.stream.IntStream intStream4 = intStream2.skip((long) 256);
        java.util.PrimitiveIterator.OfInt ofInt5 = intStream4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            ofInt5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(ofInt5);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.MAX_VALUE;
        org.joda.time.Seconds seconds1 = seconds0.negated();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 0, chronology2);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale5.getDisplayScript(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) 1970, chronology4, locale5, (java.lang.Integer) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) 0, chronology11);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = dateTimeField14.getLeapDurationField();
        dateTimeParserBucket9.saveField(dateTimeField14, (int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.time.temporal.ChronoField chronoField20 = java.time.temporal.ChronoField.DAY_OF_WEEK;
        java.time.LocalDateTime localDateTime21 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField22 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime24 = localDateTime21.with((java.time.temporal.TemporalField) chronoField22, (long) 10);
        java.time.Duration duration26 = java.time.Duration.ofSeconds((long) 0);
        java.time.temporal.Temporal temporal27 = localDateTime21.minus((java.time.temporal.TemporalAmount) duration26);
        long long28 = chronoField20.getFrom((java.time.temporal.TemporalAccessor) temporal27);
        java.time.LocalTime localTime33 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime34 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime33);
        java.time.temporal.ChronoField chronoField35 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime37 = localTime33.with((java.time.temporal.TemporalField) chronoField35, (long) (short) 1);
        java.util.Locale locale38 = java.util.Locale.GERMANY;
        java.lang.String str39 = chronoField35.getDisplayName(locale38);
        java.lang.String str40 = chronoField20.getDisplayName(locale38);
        dateTimeParserBucket9.saveField(dateTimeFieldType18, "Optional.empty", locale38);
        java.lang.String str42 = locale38.getScript();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((java.lang.Object) str42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + chronoField20 + "' != '" + java.time.temporal.ChronoField.DAY_OF_WEEK + "'", chronoField20.equals(java.time.temporal.ChronoField.DAY_OF_WEEK));
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + chronoField22 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField22.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(temporal27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + chronoField35 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField35.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NanoOfDay" + "'", str39, "NanoOfDay");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Wochentag" + "'", str40, "Wochentag");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 0, chronology2);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(chronology4);
        org.joda.time.DateTimeField dateTimeField7 = chronology4.monthOfYear();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 28, chronology4, locale8, (java.lang.Integer) 0);
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now(chronology4);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateMidnight11);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.net.URLConnection.setDefaultAllowUserInteraction(false);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.DateTime dateTime5 = property3.getDateTime();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        int int4 = localDateTime3.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.plusYears((int) (short) 100);
        int int7 = localDateTime3.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.minusYears(64);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localDateTime3.getFieldType((int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 117");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 40 + "'", int7 == 40);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours4 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay1, (org.joda.time.ReadablePartial) timeOfDay3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay3.withFieldAdded(durationFieldType5, (int) (byte) 0);
        int int8 = timeOfDay3.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay3.plusHours(9);
        org.joda.time.TimeOfDay.Property property11 = timeOfDay3.secondOfMinute();
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate15 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset14);
        boolean boolean16 = property11.equals((java.lang.Object) localDate15);
        org.joda.time.DateTimeField dateTimeField17 = property11.getField();
        long long20 = dateTimeField17.add((long) (byte) -1, (long) '#');
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 0, chronology23);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.weekyearOfCentury();
        org.joda.time.DurationField durationField27 = chronology25.weekyears();
        org.joda.time.DurationField durationField28 = chronology25.seconds();
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0, chronology25);
        org.joda.time.Chronology chronology30 = localTime29.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((java.lang.Object) long20, chronology30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 34999L + "'", long20 == 34999L);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(chronology30);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 3, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((java.lang.Object) dateTime8, chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime8.toMutableDateTime();
        mutableDateTime12.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.dayOfWeek();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.year();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        mutableDateTime12.setZone(dateTimeZone18);
        java.util.TimeZone timeZone20 = dateTimeZone18.toTimeZone();
        mutableDateTime5.setZone(dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(2, 4096, 0, (int) '.', (int) '.', dateTimeZone18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, false);
        char[] charArray4 = new char[] {};
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap(charArray4);
        printStream3.print(charArray4);
        java.nio.charset.Charset charset7 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder8 = charset7.newDecoder();
        float float9 = charsetDecoder8.maxCharsPerByte();
        java.nio.charset.Charset charset10 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder11 = charset10.newDecoder();
        java.nio.charset.Charset charset12 = java.nio.charset.Charset.defaultCharset();
        boolean boolean13 = charset10.contains(charset12);
        java.nio.charset.CharsetEncoder charsetEncoder14 = charset10.newEncoder();
        char[] charArray15 = new char[] {};
        java.nio.CharBuffer charBuffer16 = java.nio.CharBuffer.wrap(charArray15);
        java.nio.ByteBuffer byteBuffer17 = charsetEncoder14.encode(charBuffer16);
        char[] charArray24 = new char[] { '#', '/', '4', 'a', '4', 'u' };
        java.nio.CharBuffer charBuffer25 = java.nio.CharBuffer.wrap(charArray24);
        java.nio.charset.CoderResult coderResult27 = charsetDecoder8.decode(byteBuffer17, charBuffer25, false);
        boolean boolean28 = charBuffer25.isDirect();
        char[] charArray29 = charBuffer25.array();
        java.nio.charset.Charset charset30 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder31 = charset30.newDecoder();
        java.nio.charset.Charset charset32 = java.nio.charset.Charset.defaultCharset();
        boolean boolean33 = charset30.contains(charset32);
        java.nio.charset.CharsetEncoder charsetEncoder34 = charset30.newEncoder();
        char[] charArray35 = new char[] {};
        java.nio.CharBuffer charBuffer36 = java.nio.CharBuffer.wrap(charArray35);
        java.nio.ByteBuffer byteBuffer37 = charsetEncoder34.encode(charBuffer36);
        java.nio.CharBuffer charBuffer38 = charBuffer36.slice();
        java.nio.CharBuffer charBuffer39 = charBuffer36.compact();
        int int40 = charBuffer25.compareTo(charBuffer39);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream43 = printStream3.append((java.lang.CharSequence) charBuffer39, 17, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertNotNull(charBuffer5);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(charsetDecoder8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNotNull(charsetDecoder11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[]");
        org.junit.Assert.assertNotNull(charBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "#/4a4u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "#/4a4u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#, /, 4, a, 4, u]");
        org.junit.Assert.assertNotNull(charBuffer25);
        org.junit.Assert.assertNotNull(coderResult27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "#/4a4u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "#/4a4u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[#, /, 4, a, 4, u]");
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(charsetDecoder31);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(charsetEncoder34);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[]");
        org.junit.Assert.assertNotNull(charBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(charBuffer38);
        org.junit.Assert.assertNotNull(charBuffer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 6 + "'", int40 == 6);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int2 = localDate1.getMonthValue();
        boolean boolean3 = localDate1.isLeapYear();
        java.time.temporal.ChronoField chronoField4 = java.time.temporal.ChronoField.MONTH_OF_YEAR;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate6 = localDate1.with((java.time.temporal.TemporalField) chronoField4, (long) (-10));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): -10");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + chronoField4 + "' != '" + java.time.temporal.ChronoField.MONTH_OF_YEAR + "'", chronoField4.equals(java.time.temporal.ChronoField.MONTH_OF_YEAR));
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        long long6 = localTime4.toNanoOfDay();
        java.time.OffsetTime offsetTime7 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime8 = offsetTime7.toLocalTime();
        java.time.Duration duration10 = java.time.Duration.ofMinutes((long) 3);
        java.time.temporal.Temporal temporal11 = localTime8.plus((java.time.temporal.TemporalAmount) duration10);
        java.time.Duration duration13 = duration10.plusNanos((long) 9);
        java.time.LocalTime localTime14 = localTime4.plus((java.time.temporal.TemporalAmount) duration10);
        long long15 = duration10.toMillis();
        java.time.LocalDateTime localDateTime16 = java.time.LocalDateTime.MIN;
        java.time.Month month17 = java.time.Month.NOVEMBER;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime18 = localDateTime16.with((java.time.temporal.TemporalAdjuster) month17);
        java.time.LocalDateTime localDateTime20 = localDateTime16.plusMinutes((long) 3600000);
        java.time.temporal.Temporal temporal21 = duration10.addTo((java.time.temporal.Temporal) localDateTime16);
        int int22 = localDateTime16.getNano();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3601000000001L + "'", long6 == 3601000000001L);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(temporal11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 180000L + "'", long15 == 180000L);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + month17 + "' != '" + java.time.Month.NOVEMBER + "'", month17.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(temporal21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            printStream3.println((float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.normalizedStandard();
        org.joda.time.Period period3 = period0.plusHours(2);
        java.time.chrono.IsoEra isoEra4 = java.time.chrono.IsoEra.CE;
        boolean boolean5 = period3.equals((java.lang.Object) isoEra4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.LocalTime localTime16 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime16);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime20 = localTime16.with((java.time.temporal.TemporalField) chronoField18, (long) (short) 1);
        long long21 = localTime10.getLong((java.time.temporal.TemporalField) chronoField18);
        boolean boolean22 = isoEra4.isSupported((java.time.temporal.TemporalField) chronoField18);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery23 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period24 = isoEra4.query(periodTemporalQuery23);
        boolean boolean25 = period24.isNegative();
        java.time.Period period27 = period24.plusDays((long) ' ');
        boolean boolean28 = period24.isNegative();
        java.time.Period period30 = period24.minusYears((long) 10);
        java.time.Period period32 = period24.minusYears((long) 366);
        int int33 = period24.getMonths();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + isoEra4 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra4.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3601000000001L + "'", long21 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale locale6 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray7 = new java.util.Locale[] { locale6 };
        java.util.ArrayList<java.util.Locale> localeList8 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList8, localeArray7);
        java.util.List<java.util.Locale> localeList10 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList8);
        localeList10.clear();
        java.util.List<java.util.Locale> localeList12 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale19 };
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList21);
        localeList23.clear();
        java.util.List<java.util.Locale> localeList25 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList23);
        java.util.List<java.util.Locale> localeList26 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList25);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Locale locale30 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray31 = new java.util.Locale[] { locale30 };
        java.util.ArrayList<java.util.Locale> localeList32 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList32, localeArray31);
        java.util.List<java.util.Locale> localeList34 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.util.Locale>) localeList32);
        org.joda.time.Period period35 = org.joda.time.Period.ZERO;
        org.joda.time.Period period36 = period35.normalizedStandard();
        org.joda.time.Period period38 = period35.plusHours(2);
        java.time.chrono.IsoEra isoEra39 = java.time.chrono.IsoEra.CE;
        boolean boolean40 = period38.equals((java.lang.Object) isoEra39);
        java.time.LocalTime localTime45 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime46 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime45);
        java.time.LocalTime localTime51 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime52 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime51);
        java.time.temporal.ChronoField chronoField53 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime55 = localTime51.with((java.time.temporal.TemporalField) chronoField53, (long) (short) 1);
        long long56 = localTime45.getLong((java.time.temporal.TemporalField) chronoField53);
        boolean boolean57 = isoEra39.isSupported((java.time.temporal.TemporalField) chronoField53);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery58 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period59 = isoEra39.query(periodTemporalQuery58);
        boolean boolean60 = period59.isNegative();
        java.time.Period period62 = period59.plusDays((long) ' ');
        boolean boolean63 = period59.isNegative();
        java.time.Period period65 = period59.minusYears((long) 10);
        int int66 = localeList34.lastIndexOf((java.lang.Object) period59);
        java.util.Iterator<java.util.Locale> localeItor67 = localeList34.iterator();
        java.util.Set<java.lang.String> strSet68 = java.time.ZoneId.getAvailableZoneIds();
        java.util.stream.Stream<java.lang.String> strStream69 = strSet68.parallelStream();
        boolean boolean71 = strSet68.remove((java.lang.Object) 0);
        boolean boolean72 = localeList34.retainAll((java.util.Collection<java.lang.String>) strSet68);
        java.util.Locale locale73 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList34);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localeList10);
        org.junit.Assert.assertNotNull(localeList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localeList23);
        org.junit.Assert.assertNotNull(localeList25);
        org.junit.Assert.assertNotNull(localeList26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(localeList34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + isoEra39 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra39.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertTrue("'" + chronoField53 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField53.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 3601000000001L + "'", long56 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(localeItor67);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNotNull(strStream69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(locale73);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 3, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((java.lang.Object) dateTime5, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime5.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(10800000, (int) ' ', 2147483647, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        int int4 = localDateTime3.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withMonthOfYear((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.time.LocalDate localDate1 = java.time.LocalDate.ofEpochDay((long) ' ');
        java.time.OffsetTime offsetTime2 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime3 = offsetTime2.toLocalTime();
        java.lang.String str4 = offsetTime2.toString();
        java.time.Duration duration5 = java.time.Duration.ZERO;
        java.lang.String str6 = duration5.toString();
        java.time.OffsetTime offsetTime7 = offsetTime2.plus((java.time.temporal.TemporalAmount) duration5);
        java.time.LocalTime localTime8 = offsetTime2.toLocalTime();
        java.time.chrono.ChronoLocalDateTime<?> wildcardChronoLocalDateTime9 = localDate1.atTime(localTime8);
        java.time.LocalDate localDate11 = localDate1.minusYears((long) 34);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate16 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset15);
        java.util.Properties properties18 = null;
        java.util.Properties properties19 = new java.util.Properties(properties18);
        java.time.LocalTime localTime24 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime25 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime24);
        java.time.LocalTime localTime30 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime31 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime30);
        java.time.temporal.ChronoField chronoField32 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime34 = localTime30.with((java.time.temporal.TemporalField) chronoField32, (long) (short) 1);
        long long35 = localTime24.getLong((java.time.temporal.TemporalField) chronoField32);
        java.time.LocalTime localTime37 = localTime24.withSecond((int) (short) 1);
        java.lang.Object obj39 = properties19.put((java.lang.Object) localTime37, (java.lang.Object) "117");
        java.time.LocalDateTime localDateTime40 = java.time.LocalDateTime.MIN;
        java.time.Month month41 = java.time.Month.NOVEMBER;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime42 = localDateTime40.with((java.time.temporal.TemporalAdjuster) month41);
        java.time.LocalDate localDate45 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int46 = localDate45.getMonthValue();
        org.joda.time.Period period47 = org.joda.time.Period.ZERO;
        org.joda.time.Period period48 = period47.normalizedStandard();
        org.joda.time.Period period50 = period47.plusHours(2);
        java.time.chrono.IsoEra isoEra51 = java.time.chrono.IsoEra.CE;
        boolean boolean52 = period50.equals((java.lang.Object) isoEra51);
        java.time.LocalTime localTime57 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime58 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime57);
        java.time.LocalTime localTime63 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime64 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime63);
        java.time.temporal.ChronoField chronoField65 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime67 = localTime63.with((java.time.temporal.TemporalField) chronoField65, (long) (short) 1);
        long long68 = localTime57.getLong((java.time.temporal.TemporalField) chronoField65);
        boolean boolean69 = isoEra51.isSupported((java.time.temporal.TemporalField) chronoField65);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery70 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period71 = isoEra51.query(periodTemporalQuery70);
        boolean boolean72 = period71.isNegative();
        java.time.Period period74 = period71.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField75 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean76 = period71.equals((java.lang.Object) chronoField75);
        boolean boolean77 = localDate45.isSupported((java.time.temporal.TemporalField) chronoField75);
        java.time.temporal.TemporalUnit temporalUnit78 = chronoField75.getRangeUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime79 = localDateChronoLocalDateTime42.plus(1L, temporalUnit78);
        java.time.LocalTime localTime80 = localTime37.truncatedTo(temporalUnit78);
        java.time.chrono.ChronoLocalDate chronoLocalDate81 = localDate16.minus((long) 3600000, temporalUnit78);
        java.time.LocalDate localDate82 = localDate1.plus((-4831848L), temporalUnit78);
        int int83 = localDate82.lengthOfMonth();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(offsetTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23:59:59.999999999-18:00" + "'", str4, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0S" + "'", str6, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(wildcardChronoLocalDateTime9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + chronoField32 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField32.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 3601000000001L + "'", long35 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + month41 + "' != '" + java.time.Month.NOVEMBER + "'", month41.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime42);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertTrue("'" + isoEra51 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra51.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertTrue("'" + chronoField65 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField65.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 3601000000001L + "'", long68 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery70);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertTrue("'" + chronoField75 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField75.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit78 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit78.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime79);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(chronoLocalDate81);
        org.junit.Assert.assertNotNull(localDate82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 31 + "'", int83 == 31);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        boolean boolean10 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 3, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) dateTime13, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime13.toMutableDateTime();
        mutableDateTime17.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.year();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.weekyear();
        boolean boolean23 = duration2.equals((java.lang.Object) mutableDateTime17);
        mutableDateTime17.addMonths((int) ' ');
        mutableDateTime17.add((long) (byte) 10);
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        org.joda.time.Period period29 = period28.normalizedStandard();
        org.joda.time.Period period31 = period28.plusHours(2);
        java.time.chrono.IsoEra isoEra32 = java.time.chrono.IsoEra.CE;
        boolean boolean33 = period31.equals((java.lang.Object) isoEra32);
        int int34 = period31.getMinutes();
        mutableDateTime17.add((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withYearOfCentury((int) 'a');
        int int40 = localDateTime39.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.weekyear();
        int int44 = localDateTime39.get(dateTimeFieldType43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime17.property(dateTimeFieldType43);
        org.joda.time.MutableDateTime mutableDateTime46 = property45.roundHalfEven();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + isoEra32 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra32.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 21 + "'", int40 == 21);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2097 + "'", int44 == 2097);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(mutableDateTime46);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLocalHost();
        boolean boolean1 = inetAddress0.isMCOrgLocal();
        java.lang.String str2 = inetAddress0.getCanonicalHostName();
        java.lang.String str3 = inetAddress0.getHostAddress();
        boolean boolean4 = inetAddress0.isMCGlobal();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "599b081c1808" + "'", str2, "599b081c1808");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "172.17.0.2" + "'", str3, "172.17.0.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate.Property property2 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate4 = property2.addToCopy(7);
        org.joda.time.LocalDate.Property property5 = localDate4.dayOfYear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Interval interval1 = localDate0.toInterval();
        int int2 = localDate0.getDayOfYear();
        java.util.Date date3 = localDate0.toDate();
        date3.setYear(306);
        int int6 = date3.getMonth();
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Fri Feb 21 00:00:00 UTC 2206");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((java.lang.Object) readableInstant1);
        boolean boolean4 = mutableInterval3.isAfterNow();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 3, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.DateTimeField dateTimeField10 = property8.getField();
        org.joda.time.DateTime dateTime12 = property8.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime14 = property8.setCopy(34);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval3.setEnd((org.joda.time.ReadableInstant) dateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.security.cert.CertificateEncodingException certificateEncodingException2 = new java.security.cert.CertificateEncodingException("ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]");
        java.security.NoSuchAlgorithmException noSuchAlgorithmException3 = new java.security.NoSuchAlgorithmException("2022-02-21", (java.lang.Throwable) certificateEncodingException2);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.time.Clock clock0 = java.time.Clock.systemUTC();
        java.time.Duration duration2 = java.time.Duration.ofSeconds((long) 256);
        java.time.Clock clock3 = java.time.Clock.tick(clock0, duration2);
        java.time.Duration duration5 = java.time.Duration.ofMinutes((long) 3);
        java.time.Duration duration6 = duration5.abs();
        java.time.Clock clock7 = java.time.Clock.offset(clock0, duration5);
        java.time.Duration duration8 = java.time.Duration.ZERO;
        java.time.Duration duration10 = duration8.multipliedBy((-9223372036854775808L));
        boolean boolean11 = duration8.isZero();
        java.time.Clock clock12 = java.time.Clock.tick(clock0, duration8);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 0, chronology14);
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekyearOfCentury();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) 0, chronology19);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        long long23 = chronology16.set((org.joda.time.ReadablePartial) localTime20, (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay((java.lang.Object) clock12, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.time.Clock$SystemClock");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(clock0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(clock3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(clock7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(clock12);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.util.stream.DoubleStream doubleStream1 = java.util.stream.DoubleStream.of((double) (short) 1);
        long long2 = doubleStream1.count();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = doubleStream1.count();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("1929-11-25", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintWriter printWriter1 = new java.io.PrintWriter(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, false);
        char[] charArray10 = new char[] { '#', '/', '4', 'a', '4', 'u' };
        java.nio.CharBuffer charBuffer11 = java.nio.CharBuffer.wrap(charArray10);
        // The following exception was thrown during execution in test generation
        try {
            printStream3.println(charArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#/4a4u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#/4a4u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, /, 4, a, 4, u]");
        org.junit.Assert.assertNotNull(charBuffer11);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.time.Instant instant0 = java.time.Instant.now();
        java.time.Instant instant1 = java.time.Instant.now();
        boolean boolean2 = instant0.isAfter(instant1);
        java.time.LocalDate localDate4 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int5 = localDate4.getMonthValue();
        org.joda.time.Period period6 = org.joda.time.Period.ZERO;
        org.joda.time.Period period7 = period6.normalizedStandard();
        org.joda.time.Period period9 = period6.plusHours(2);
        java.time.chrono.IsoEra isoEra10 = java.time.chrono.IsoEra.CE;
        boolean boolean11 = period9.equals((java.lang.Object) isoEra10);
        java.time.LocalTime localTime16 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime16);
        java.time.LocalTime localTime22 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime23 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime22);
        java.time.temporal.ChronoField chronoField24 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime26 = localTime22.with((java.time.temporal.TemporalField) chronoField24, (long) (short) 1);
        long long27 = localTime16.getLong((java.time.temporal.TemporalField) chronoField24);
        boolean boolean28 = isoEra10.isSupported((java.time.temporal.TemporalField) chronoField24);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery29 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period30 = isoEra10.query(periodTemporalQuery29);
        boolean boolean31 = period30.isNegative();
        java.time.Period period33 = period30.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField34 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean35 = period30.equals((java.lang.Object) chronoField34);
        boolean boolean36 = localDate4.isSupported((java.time.temporal.TemporalField) chronoField34);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Instant instant38 = instant0.with((java.time.temporal.TemporalField) chronoField34, (long) 1024);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: SecondOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + isoEra10 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra10.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + chronoField24 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField24.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3601000000001L + "'", long27 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + chronoField34 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField34.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        boolean boolean10 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 3, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) dateTime13, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime13.toMutableDateTime();
        mutableDateTime17.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.year();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.weekyear();
        boolean boolean23 = duration2.equals((java.lang.Object) mutableDateTime17);
        mutableDateTime17.addMonths((int) ' ');
        mutableDateTime17.add((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = new org.joda.time.Duration(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = duration30.toPeriodTo(readableInstant31, periodType32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = new org.joda.time.Duration(readableInstant34, readableInstant35);
        long long37 = duration36.getMillis();
        boolean boolean38 = duration30.isShorterThan((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) 3, chronology40);
        org.joda.time.DateTime.Property property42 = dateTime41.dayOfYear();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight((java.lang.Object) dateTime41, chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime41.toMutableDateTime();
        mutableDateTime45.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime45.dayOfWeek();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime45.year();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.weekyear();
        boolean boolean51 = duration30.equals((java.lang.Object) mutableDateTime45);
        mutableDateTime45.addMonths((int) ' ');
        mutableDateTime45.add((long) (byte) 10);
        org.joda.time.Period period56 = org.joda.time.Period.ZERO;
        org.joda.time.Period period57 = period56.normalizedStandard();
        org.joda.time.Period period59 = period56.plusHours(2);
        java.time.chrono.IsoEra isoEra60 = java.time.chrono.IsoEra.CE;
        boolean boolean61 = period59.equals((java.lang.Object) isoEra60);
        int int62 = period59.getMinutes();
        mutableDateTime45.add((org.joda.time.ReadablePeriod) period59);
        org.joda.time.Hours hours64 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) mutableDateTime17, (org.joda.time.ReadableInstant) mutableDateTime45);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime17.setDateTime(19043, 0, (int) '#', 23, 508, 3, 365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 508 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + isoEra60 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra60.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(hours64);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        float[] floatArray2 = new float[] { (-1L), (byte) -1 };
        java.nio.FloatBuffer floatBuffer3 = java.nio.FloatBuffer.wrap(floatArray2);
        java.nio.FloatBuffer floatBuffer4 = floatBuffer3.compact();
        java.nio.FloatBuffer floatBuffer5 = floatBuffer3.asReadOnlyBuffer();
        java.nio.Buffer buffer6 = floatBuffer5.clear();
        float[] floatArray9 = new float[] { (-1L), (byte) -1 };
        java.nio.FloatBuffer floatBuffer10 = java.nio.FloatBuffer.wrap(floatArray9);
        java.nio.FloatBuffer floatBuffer11 = floatBuffer10.compact();
        java.nio.FloatBuffer floatBuffer12 = floatBuffer10.asReadOnlyBuffer();
        java.nio.ByteOrder byteOrder13 = floatBuffer10.order();
        java.nio.Buffer buffer14 = floatBuffer10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.FloatBuffer floatBuffer15 = floatBuffer5.put(floatBuffer10);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, -1.0]");
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertNotNull(floatBuffer4);
        org.junit.Assert.assertNotNull(floatBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[-1.0, -1.0]");
        org.junit.Assert.assertNotNull(floatBuffer10);
        org.junit.Assert.assertNotNull(floatBuffer11);
        org.junit.Assert.assertNotNull(floatBuffer12);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertNotNull(buffer14);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.of(96000000, 8, 15, 19, 2022);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MinuteOfHour (valid values 0 - 59): 2022");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime1 = offsetTime0.toLocalTime();
        java.lang.String str2 = offsetTime0.toString();
        java.time.Duration duration3 = java.time.Duration.ZERO;
        java.lang.String str4 = duration3.toString();
        java.time.OffsetTime offsetTime5 = offsetTime0.plus((java.time.temporal.TemporalAmount) duration3);
        java.time.LocalTime localTime6 = offsetTime0.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime8 = localTime6.withSecond(2022);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfMinute (valid values 0 - 59): 2022");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23:59:59.999999999-18:00" + "'", str2, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0S" + "'", str4, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.time.Instant instant0 = java.time.Instant.now();
        java.time.Instant instant1 = java.time.Instant.now();
        boolean boolean2 = instant0.isAfter(instant1);
        java.time.Duration duration3 = java.time.Duration.ZERO;
        java.time.Instant instant4 = instant1.minus((java.time.temporal.TemporalAmount) duration3);
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime7 = localDateTime5.minusYears((long) (byte) 10);
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime10 = localDateTime8.minusYears((long) (byte) 10);
        boolean boolean11 = localDateTime5.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime10);
        java.time.ZoneOffset zoneOffset14 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate15 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset14);
        java.time.Clock clock16 = java.time.Clock.system((java.time.ZoneId) zoneOffset14);
        java.time.ZoneOffset zoneOffset19 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate20 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset19);
        java.time.Clock clock21 = java.time.Clock.system((java.time.ZoneId) zoneOffset19);
        int int22 = zoneOffset14.compareTo(zoneOffset19);
        java.time.OffsetDateTime offsetDateTime23 = java.time.OffsetDateTime.of(localDateTime5, zoneOffset14);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal24 = instant1.adjustInto((java.time.temporal.Temporal) localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: InstantSeconds");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zoneOffset14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(clock16);
        org.junit.Assert.assertNotNull(zoneOffset19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(clock21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(offsetDateTime23);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        java.util.stream.IntStream intStream4 = intStream2.skip((long) 256);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = intStream2.sum();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.junit.Assert.assertNotNull(dateTimeZone0);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.util.Date date0 = new java.util.Date();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromDateFields(date0);
        date0.setHours((int) '4');
        date0.setDate(4096);
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Thu Apr 21 04:34:43 UTC 2033");
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone5);
        long long9 = dateTimeZone5.convertLocalToUTC((long) 3, false);
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) ':');
        long long14 = dateTimeZone2.adjustOffset(0L, false);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 0, dateTimeZone2);
        org.joda.time.LocalTime localTime17 = localTime15.minusHours(365);
        int int18 = localTime15.getHourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 58L + "'", long11 == 58L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.util.stream.LongStream longStream1 = java.util.stream.LongStream.of(0L);
        java.util.stream.LongStream longStream2 = longStream1.unordered();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble3 = longStream1.average();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream1);
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.lang.String str1 = java.net.URLConnection.getDefaultRequestProperty("0 - 23");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.years();
        org.joda.time.format.PeriodFormatter periodFormatter4 = periodFormatter2.withParseType(periodType3);
        java.util.Locale locale6 = new java.util.Locale("hi!");
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withLocale(locale6);
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit9 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean10 = weeks8.equals((java.lang.Object) timeUnit9);
        org.joda.time.MutablePeriod mutablePeriod11 = weeks8.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration(readableInstant12, readableInstant13);
        org.joda.time.Duration duration16 = duration14.withMillis((-1L));
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) 0, chronology18);
        org.joda.time.Chronology chronology20 = localTime19.getChronology();
        mutablePeriod11.setPeriod((org.joda.time.ReadableDuration) duration16, chronology20);
        mutablePeriod11.setMillis(20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = periodFormatter7.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod11, "hours", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodFormatter4);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(timeUnit9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.nio.charset.CoderResult coderResult0 = java.nio.charset.CoderResult.UNDERFLOW;
        // The following exception was thrown during execution in test generation
        try {
            coderResult0.throwException();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(coderResult0);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = java.time.ZoneId.SHORT_IDS;
        int int1 = strMap0.size();
        java.util.Properties properties2 = null;
        java.util.Properties properties3 = new java.util.Properties(properties2);
        java.nio.LongBuffer longBuffer5 = java.nio.LongBuffer.allocate((int) (short) 0);
        java.nio.Buffer buffer6 = longBuffer5.mark();
        boolean boolean7 = properties3.containsKey((java.lang.Object) longBuffer5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = java.time.ZoneId.SHORT_IDS;
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean10 = strMap8.containsValue((java.lang.Object) dateTimeFieldType9);
        properties3.putAll(strMap8);
        // The following exception was thrown during execution in test generation
        try {
            strMap0.putAll(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.nio.file.Path path0 = null;
        java.nio.file.OpenOption openOption1 = null;
        java.nio.file.OpenOption[] openOptionArray2 = new java.nio.file.OpenOption[] { openOption1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.FileChannel fileChannel3 = java.nio.channels.FileChannel.open(path0, openOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(openOptionArray2);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.LocalTime localTime6 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime6);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime16 = localTime12.with((java.time.temporal.TemporalField) chronoField14, (long) (short) 1);
        long long17 = localTime6.getLong((java.time.temporal.TemporalField) chronoField14);
        java.time.LocalTime localTime19 = localTime6.withSecond((int) (short) 1);
        java.lang.Object obj21 = properties1.put((java.lang.Object) localTime19, (java.lang.Object) "117");
        boolean boolean23 = properties1.containsValue((java.lang.Object) 6);
        java.time.LocalDate localDate26 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int27 = localDate26.getMonthValue();
        java.lang.Object obj28 = properties1.replace((java.lang.Object) 21, (java.lang.Object) localDate26);
        java.time.LocalDateTime localDateTime29 = java.time.LocalDateTime.MIN;
        java.time.Month month30 = java.time.Month.NOVEMBER;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime31 = localDateTime29.with((java.time.temporal.TemporalAdjuster) month30);
        java.time.LocalDate localDate34 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int35 = localDate34.getMonthValue();
        org.joda.time.Period period36 = org.joda.time.Period.ZERO;
        org.joda.time.Period period37 = period36.normalizedStandard();
        org.joda.time.Period period39 = period36.plusHours(2);
        java.time.chrono.IsoEra isoEra40 = java.time.chrono.IsoEra.CE;
        boolean boolean41 = period39.equals((java.lang.Object) isoEra40);
        java.time.LocalTime localTime46 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime47 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime46);
        java.time.LocalTime localTime52 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime53 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime52);
        java.time.temporal.ChronoField chronoField54 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime56 = localTime52.with((java.time.temporal.TemporalField) chronoField54, (long) (short) 1);
        long long57 = localTime46.getLong((java.time.temporal.TemporalField) chronoField54);
        boolean boolean58 = isoEra40.isSupported((java.time.temporal.TemporalField) chronoField54);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery59 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period60 = isoEra40.query(periodTemporalQuery59);
        boolean boolean61 = period60.isNegative();
        java.time.Period period63 = period60.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField64 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean65 = period60.equals((java.lang.Object) chronoField64);
        boolean boolean66 = localDate34.isSupported((java.time.temporal.TemporalField) chronoField64);
        java.time.temporal.TemporalUnit temporalUnit67 = chronoField64.getRangeUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime68 = localDateChronoLocalDateTime31.plus(1L, temporalUnit67);
        boolean boolean69 = localDate26.isSupported(temporalUnit67);
        java.time.chrono.ChronoLocalDate chronoLocalDate70 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period71 = localDate26.until(chronoLocalDate70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3601000000001L + "'", long17 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + month30 + "' != '" + java.time.Month.NOVEMBER + "'", month30.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime31);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + isoEra40 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra40.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertTrue("'" + chronoField54 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField54.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 3601000000001L + "'", long57 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertTrue("'" + chronoField64 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField64.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit67 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit67.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.net.URI uRI1 = new java.net.URI("hi!");
        java.lang.String str2 = uRI1.getFragment();
        java.lang.String str3 = uRI1.getRawPath();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Interval interval4 = property3.toInterval();
        long long5 = interval4.getStartMillis();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        java.lang.String[] strArray2 = new java.lang.String[] { "halfdays", "Optional.empty" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.Iterator<java.lang.String> strItor5 = strList3.iterator();
        java.lang.String str6 = strItor5.next();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "halfdays" + "'", str6, "halfdays");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.Period period9 = org.joda.time.Period.ZERO;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours14 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay11, (org.joda.time.ReadablePartial) timeOfDay13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay13.withFieldAdded(durationFieldType15, (int) (byte) 0);
        org.joda.time.Period period19 = period9.withFieldAdded(durationFieldType15, 4);
        mutableDateTime6.add((org.joda.time.ReadablePeriod) period9);
        mutableDateTime6.addMonths(1970);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = new org.joda.time.Duration(readableInstant23, readableInstant24);
        org.joda.time.Duration duration27 = duration25.withMillis((-1L));
        mutableDateTime6.add((org.joda.time.ReadableDuration) duration27, 0);
        org.joda.time.Instant instant30 = new org.joda.time.Instant();
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = new org.joda.time.Duration(readableInstant31, readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = duration33.toPeriodTo(readableInstant34, periodType35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = new org.joda.time.Duration(readableInstant37, readableInstant38);
        long long40 = duration39.getMillis();
        boolean boolean41 = duration33.isShorterThan((org.joda.time.ReadableDuration) duration39);
        org.joda.time.Instant instant42 = instant30.minus((org.joda.time.ReadableDuration) duration33);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) instant30);
        mutableDateTime6.addYears(2022);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(instant42);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("2021-12-31", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.time.OffsetDateTime offsetDateTime7 = java.time.OffsetDateTime.now();
        java.time.LocalDate localDate8 = offsetDateTime7.toLocalDate();
        java.time.OffsetDateTime offsetDateTime9 = java.time.OffsetDateTime.now();
        java.time.LocalDate localDate10 = offsetDateTime9.toLocalDate();
        java.time.OffsetDateTime offsetDateTime11 = java.time.OffsetDateTime.now();
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        boolean boolean13 = offsetDateTime11.isSupported((java.time.temporal.TemporalField) chronoField12);
        boolean boolean14 = offsetDateTime9.isEqual(offsetDateTime11);
        java.lang.String str15 = offsetDateTime11.toString();
        boolean boolean16 = offsetDateTime7.isAfter(offsetDateTime11);
        java.util.GregorianCalendar gregorianCalendar22 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int23 = gregorianCalendar22.getWeeksInWeekYear();
        java.lang.String str24 = gregorianCalendar22.getCalendarType();
        java.time.ZonedDateTime zonedDateTime25 = gregorianCalendar22.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime27 = zonedDateTime25.minusMonths((long) 10);
        int int28 = zonedDateTime25.getMonthValue();
        java.time.LocalTime localTime33 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime34 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime33);
        java.time.LocalTime localTime39 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime40 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime39);
        java.time.temporal.ChronoField chronoField41 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime43 = localTime39.with((java.time.temporal.TemporalField) chronoField41, (long) (short) 1);
        long long44 = localTime33.getLong((java.time.temporal.TemporalField) chronoField41);
        long long45 = zonedDateTime25.getLong((java.time.temporal.TemporalField) chronoField41);
        java.time.ZoneOffset zoneOffset48 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate49 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset48);
        java.time.LocalDate localDate50 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset48);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime51 = zonedDateTime25.withZoneSameLocal((java.time.ZoneId) zoneOffset48);
        java.time.ZonedDateTime zonedDateTime52 = offsetDateTime7.atZoneSimilarLocal((java.time.ZoneId) zoneOffset48);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime53 = java.time.ZonedDateTime.of(14, 34482, 11, 28, 2022, (int) (byte) 1, 1024, (java.time.ZoneId) zoneOffset48);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 34482");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(offsetDateTime9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(offsetDateTime11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2022-02-21T09:34:45.054Z" + "'", str15, "2022-02-21T09:34:45.054Z");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "gregory" + "'", str24, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertNotNull(zonedDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + chronoField41 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField41.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 3601000000001L + "'", long44 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 83400000000000L + "'", long45 == 83400000000000L);
        org.junit.Assert.assertNotNull(zoneOffset48);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime51);
        org.junit.Assert.assertNotNull(zonedDateTime52);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.LocalTime localTime6 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime6);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime16 = localTime12.with((java.time.temporal.TemporalField) chronoField14, (long) (short) 1);
        long long17 = localTime6.getLong((java.time.temporal.TemporalField) chronoField14);
        java.time.LocalTime localTime19 = localTime6.withSecond((int) (short) 1);
        java.lang.Object obj21 = properties1.put((java.lang.Object) localTime19, (java.lang.Object) "117");
        java.util.Collection<java.lang.Object> objCollection22 = properties1.values();
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3601000000001L + "'", long17 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objCollection22);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.time.Period period1 = java.time.Period.ofYears(28);
        java.time.Period period3 = java.time.Period.ofYears(28);
        java.time.Period period4 = period1.minus((java.time.temporal.TemporalAmount) period3);
        java.time.chrono.Chronology chronology5 = period3.getChronology();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusMillis(2022);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.monthOfYear();
        boolean boolean6 = localTime4.isSupported(dateTimeFieldType5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int8 = localTime4.indexOf(dateTimeFieldType7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) 0, chronology10);
        org.joda.time.LocalTime localTime13 = localTime11.minusMillis(2022);
        org.joda.time.LocalTime localTime15 = localTime11.plusMillis((int) (byte) 0);
        org.joda.time.LocalTime localTime16 = localTime4.withFields((org.joda.time.ReadablePartial) localTime15);
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes19 = minutes17.minus(12);
        org.joda.time.Minutes minutes20 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes22 = minutes20.minus(12);
        org.joda.time.Minutes minutes23 = minutes17.minus(minutes20);
        org.joda.time.Minutes minutes24 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes26 = minutes24.minus(12);
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes29 = minutes27.minus(12);
        java.lang.String str30 = minutes27.toString();
        org.joda.time.Minutes minutes31 = minutes24.minus(minutes27);
        boolean boolean32 = minutes23.isLessThan(minutes27);
        org.joda.time.LocalTime localTime33 = localTime15.minus((org.joda.time.ReadablePeriod) minutes23);
        org.joda.time.TimeOfDay timeOfDay35 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        boolean boolean36 = localTime33.isAfter((org.joda.time.ReadablePartial) timeOfDay35);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PT2147483647M" + "'", str30, "PT2147483647M");
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.nio.LongBuffer longBuffer1 = java.nio.LongBuffer.allocate((int) (short) 0);
        long[] longArray2 = longBuffer1.array();
        java.nio.LongBuffer longBuffer3 = java.nio.LongBuffer.wrap(longArray2);
        boolean boolean4 = longBuffer3.hasArray();
        org.junit.Assert.assertNotNull(longBuffer1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.util.TimeZone timeZone7 = gregorianCalendar5.getTimeZone();
        java.time.ZoneId zoneId8 = timeZone7.toZoneId();
        java.time.zone.ZoneRules zoneRules9 = zoneId8.getRules();
        java.time.Instant instant10 = java.time.Instant.EPOCH;
        java.time.Instant instant11 = java.time.Instant.now();
        java.time.Instant instant12 = java.time.Instant.now();
        boolean boolean13 = instant11.isAfter(instant12);
        java.time.Duration duration14 = java.time.Duration.ZERO;
        java.time.Instant instant15 = instant12.minus((java.time.temporal.TemporalAmount) duration14);
        boolean boolean16 = instant10.isAfter(instant15);
        java.time.Duration duration17 = zoneRules9.getDaylightSavings(instant15);
        java.time.LocalDate localDate19 = java.time.LocalDate.ofEpochDay((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal20 = instant15.with((java.time.temporal.TemporalAdjuster) localDate19);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: EpochDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(zoneRules9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.millisOfDay();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.halfdays();
        int int12 = periodType10.indexOf(durationFieldType11);
        mutableDateTime6.add(durationFieldType11, (int) 'a');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime6.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime18 = property15.add(32769);
        mutableDateTime18.setMillis((long) 127);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ISO_DATE_TIME;
        java.util.GregorianCalendar gregorianCalendar7 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int8 = gregorianCalendar7.getWeeksInWeekYear();
        java.lang.String str9 = gregorianCalendar7.getCalendarType();
        java.time.ZonedDateTime zonedDateTime10 = gregorianCalendar7.toZonedDateTime();
        java.util.GregorianCalendar gregorianCalendar16 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int17 = gregorianCalendar16.getWeeksInWeekYear();
        java.lang.String str18 = gregorianCalendar16.getCalendarType();
        java.time.ZonedDateTime zonedDateTime19 = gregorianCalendar16.toZonedDateTime();
        int int20 = zonedDateTime10.compareTo((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime19);
        java.time.ZonedDateTime zonedDateTime22 = zonedDateTime10.plusDays((long) 2022);
        java.time.Instant instant23 = zonedDateTime10.toInstant();
        java.time.chrono.Chronology chronology24 = zonedDateTime10.getChronology();
        java.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter1.withChronology(chronology24);
        java.time.LocalTime localTime26 = java.time.LocalTime.parse((java.lang.CharSequence) "2022-02-21T09:34:42.500Z", dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "gregory" + "'", str9, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "gregory" + "'", str18, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(localTime26);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream2 = doubleStream0.skip(0L);
        java.util.OptionalDouble optionalDouble3 = doubleStream0.average();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalDouble optionalDouble4 = doubleStream0.average();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(optionalDouble3);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.net.URI uRI1 = new java.net.URI("hi!");
        java.lang.String str2 = uRI1.getRawAuthority();
        java.lang.String str3 = uRI1.toString();
        java.lang.String str4 = uRI1.getRawFragment();
        java.net.URI uRI6 = new java.net.URI("hi!");
        java.lang.String str7 = uRI6.toASCIIString();
        java.net.URI uRI8 = uRI1.resolve(uRI6);
        java.lang.String str9 = uRI6.getPath();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.util.stream.LongStream longStream0 = java.util.stream.LongStream.empty();
        long long1 = longStream0.sum();
        // The following exception was thrown during execution in test generation
        try {
            java.util.PrimitiveIterator.OfLong ofLong2 = longStream0.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.temporal.ChronoField chronoField12 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime14 = localTime10.with((java.time.temporal.TemporalField) chronoField12, (long) (short) 1);
        long long15 = localTime4.getLong((java.time.temporal.TemporalField) chronoField12);
        java.time.LocalTime localTime17 = localTime4.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange19 = localTime17.range((java.time.temporal.TemporalField) chronoField18);
        long long20 = valueRange19.getMaximum();
        java.lang.String str21 = valueRange19.toString();
        boolean boolean23 = valueRange19.isValidValue((long) 17);
        long long24 = valueRange19.getMinimum();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + chronoField12 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField12.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3601000000001L + "'", long15 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86399L + "'", long20 == 86399L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0 - 86399" + "'", str21, "0 - 86399");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField5 = dateTimeField4.getLeapDurationField();
        long long7 = dateTimeField4.remainder((-9223372036854775808L));
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.parse("1");
        int int10 = localTime9.getMillisOfDay();
        java.util.Locale locale13 = new java.util.Locale("PT0S", "2022-02-21T09:34:06.670Z");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) localTime9, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNull(durationField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11724424192L + "'", long7 == 11724424192L);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3600000 + "'", int10 == 3600000);
        org.junit.Assert.assertEquals(locale13.toString(), "pt0s_2022-02-21T09:34:06.670Z");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.NANO_OF_SECOND;
        java.time.OffsetTime offsetTime1 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime2 = offsetTime1.toLocalTime();
        java.lang.String str3 = offsetTime1.toString();
        java.time.temporal.ValueRange valueRange4 = chronoField0.rangeRefinedBy((java.time.temporal.TemporalAccessor) offsetTime1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = property7.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = property7.addToCopy(21);
        org.joda.time.LocalDateTime localDateTime12 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfYear();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundFloorCopy();
        boolean boolean15 = valueRange4.equals((java.lang.Object) localDateTime14);
        boolean boolean17 = valueRange4.isValidValue((long) '+');
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.NANO_OF_SECOND + "'", chronoField0.equals(java.time.temporal.ChronoField.NANO_OF_SECOND));
        org.junit.Assert.assertNotNull(offsetTime1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23:59:59.999999999-18:00" + "'", str3, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(valueRange4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 0, chronology2);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale5.getDisplayScript(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) 1970, chronology4, locale5, (java.lang.Integer) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) 0, chronology11);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = dateTimeField14.getLeapDurationField();
        dateTimeParserBucket9.saveField(dateTimeField14, (int) 'u');
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str20 = dateTimeField14.getAsShortText((int) 'u', locale19);
        long long22 = dateTimeField14.roundHalfFloor((long) 45);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNull(durationField15);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "117" + "'", str20, "117");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime3 = localDateTime0.with((java.time.temporal.TemporalField) chronoField1, (long) 10);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 0, chronology5);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = chronology7.weekyears();
        org.joda.time.DurationField durationField10 = chronology7.seconds();
        org.joda.time.Chronology chronology11 = chronology7.withUTC();
        boolean boolean12 = localDateChronoLocalDateTime3.equals((java.lang.Object) chronology7);
        org.joda.time.DateTimeField dateTimeField13 = chronology7.yearOfEra();
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        int int15 = dateTimeField13.getMaximumTextLength(locale14);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime3);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("NanoOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"NanoOfDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.normalizedStandard();
        org.joda.time.Period period3 = period0.plusHours(2);
        java.time.chrono.IsoEra isoEra4 = java.time.chrono.IsoEra.CE;
        boolean boolean5 = period3.equals((java.lang.Object) isoEra4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.LocalTime localTime16 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime16);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime20 = localTime16.with((java.time.temporal.TemporalField) chronoField18, (long) (short) 1);
        long long21 = localTime10.getLong((java.time.temporal.TemporalField) chronoField18);
        boolean boolean22 = isoEra4.isSupported((java.time.temporal.TemporalField) chronoField18);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery23 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period24 = isoEra4.query(periodTemporalQuery23);
        boolean boolean25 = period24.isNegative();
        java.time.Period period27 = period24.plusDays((long) ' ');
        boolean boolean28 = period24.isNegative();
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration29 = java.time.Duration.from((java.time.temporal.TemporalAmount) period24);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unit must not have an estimated duration");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + isoEra4 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra4.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3601000000001L + "'", long21 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, false);
        char[] charArray4 = new char[] {};
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap(charArray4);
        printStream3.print(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            printStream3.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertNotNull(charBuffer5);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.junit.Assert.assertNull(periodParser3);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        java.util.stream.IntStream intStream3 = intStream2.parallel();
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream5 = intStream3.onClose(runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        gregorianCalendar5.set((int) ':', 3, 256, 5, 17, 3600000);
        int int14 = gregorianCalendar5.getLeastMaximum((int) (byte) 1);
        int int15 = gregorianCalendar5.getMinimalDaysInFirstWeek();
        java.util.GregorianCalendar gregorianCalendar21 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int22 = gregorianCalendar21.getMinimalDaysInFirstWeek();
        int int23 = gregorianCalendar5.compareTo((java.util.Calendar) gregorianCalendar21);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 292269054 + "'", int14 == 292269054);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.Period period9 = org.joda.time.Period.ZERO;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours14 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay11, (org.joda.time.ReadablePartial) timeOfDay13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay13.withFieldAdded(durationFieldType15, (int) (byte) 0);
        org.joda.time.Period period19 = period9.withFieldAdded(durationFieldType15, 4);
        mutableDateTime6.add((org.joda.time.ReadablePeriod) period9);
        int int21 = mutableDateTime6.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime6.dayOfWeek();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = new org.joda.time.Period((long) 'a', 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278994 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(10800000);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) 3600000);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putShort((-624), (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar5.roll(4096, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.time.format.TextStyle textStyle0 = java.time.format.TextStyle.NARROW_STANDALONE;
        java.time.format.TextStyle textStyle1 = textStyle0.asNormal();
        org.junit.Assert.assertTrue("'" + textStyle0 + "' != '" + java.time.format.TextStyle.NARROW_STANDALONE + "'", textStyle0.equals(java.time.format.TextStyle.NARROW_STANDALONE));
        org.junit.Assert.assertTrue("'" + textStyle1 + "' != '" + java.time.format.TextStyle.NARROW + "'", textStyle1.equals(java.time.format.TextStyle.NARROW));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        java.util.IntSummaryStatistics intSummaryStatistics3 = new java.util.IntSummaryStatistics();
        intStream2.forEach((java.util.function.IntConsumer) intSummaryStatistics3);
        java.util.stream.IntStream intStream5 = intStream2.parallel();
        java.util.function.IntToLongFunction intToLongFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = intStream2.mapToLong(intToLongFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals(intSummaryStatistics3.toString(), "IntSummaryStatistics{count=0, sum=0, min=2147483647, average=0.000000, max=-2147483648}");
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.util.TimeZone timeZone7 = gregorianCalendar5.getTimeZone();
        java.time.ZoneId zoneId8 = timeZone7.toZoneId();
        java.time.zone.ZoneRules zoneRules9 = zoneId8.getRules();
        java.time.Instant instant10 = java.time.Instant.EPOCH;
        java.time.Instant instant11 = java.time.Instant.now();
        java.time.Instant instant12 = java.time.Instant.now();
        boolean boolean13 = instant11.isAfter(instant12);
        java.time.Duration duration14 = java.time.Duration.ZERO;
        java.time.Instant instant15 = instant12.minus((java.time.temporal.TemporalAmount) duration14);
        boolean boolean16 = instant10.isAfter(instant15);
        java.time.Duration duration17 = zoneRules9.getDaylightSavings(instant15);
        java.time.Instant instant18 = null;
        java.time.zone.ZoneOffsetTransition zoneOffsetTransition19 = zoneRules9.nextTransition(instant18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(zoneRules9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNull(zoneOffsetTransition19);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.Period period9 = org.joda.time.Period.ZERO;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours14 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay11, (org.joda.time.ReadablePartial) timeOfDay13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay13.withFieldAdded(durationFieldType15, (int) (byte) 0);
        org.joda.time.Period period19 = period9.withFieldAdded(durationFieldType15, 4);
        mutableDateTime6.add((org.joda.time.ReadablePeriod) period9);
        mutableDateTime6.addMonths(1970);
        mutableDateTime6.addMonths(6);
        int int25 = mutableDateTime6.getMonthOfYear();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) 0, chronology28);
        org.joda.time.Chronology chronology30 = localTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.weekyearOfCentury();
        org.joda.time.DurationField durationField32 = chronology30.weekyears();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 21, chronology30);
        mutableDateTime33.setMinuteOfDay(100);
        org.joda.time.Period period36 = org.joda.time.Period.ZERO;
        org.joda.time.Period period37 = period36.normalizedStandard();
        org.joda.time.Period period39 = period37.minusMinutes((int) ' ');
        org.joda.time.Period period41 = period39.minusMonths((int) (byte) 0);
        org.joda.time.PeriodType periodType42 = period41.getPeriodType();
        org.joda.time.PeriodType periodType43 = periodType42.withHoursRemoved();
        org.joda.time.PeriodType periodType44 = periodType43.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime6, (org.joda.time.ReadableInstant) mutableDateTime33, periodType43);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = new org.joda.time.Duration(readableInstant46, readableInstant47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = duration48.toPeriodTo(readableInstant49, periodType50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Duration duration54 = new org.joda.time.Duration(readableInstant52, readableInstant53);
        long long55 = duration54.getMillis();
        boolean boolean56 = duration48.isShorterThan((org.joda.time.ReadableDuration) duration54);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) 3, chronology58);
        org.joda.time.DateTime.Property property60 = dateTime59.dayOfYear();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((java.lang.Object) dateTime59, chronology61);
        org.joda.time.MutableDateTime mutableDateTime63 = dateTime59.toMutableDateTime();
        mutableDateTime63.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime63.dayOfWeek();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime63.year();
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime63.weekyear();
        boolean boolean69 = duration48.equals((java.lang.Object) mutableDateTime63);
        mutableDateTime63.addMonths((int) ' ');
        mutableDateTime63.add((long) (byte) 10);
        org.joda.time.Period period74 = org.joda.time.Period.ZERO;
        org.joda.time.Period period75 = period74.normalizedStandard();
        org.joda.time.Period period77 = period74.plusHours(2);
        java.time.chrono.IsoEra isoEra78 = java.time.chrono.IsoEra.CE;
        boolean boolean79 = period77.equals((java.lang.Object) isoEra78);
        int int80 = period77.getMinutes();
        mutableDateTime63.add((org.joda.time.ReadablePeriod) period77);
        java.util.TimeZone timeZone83 = null;
        org.joda.time.DateTimeZone dateTimeZone84 = org.joda.time.DateTimeZone.forTimeZone(timeZone83);
        org.joda.time.DateMidnight dateMidnight85 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone84);
        long long88 = dateTimeZone84.convertLocalToUTC((long) 3, false);
        long long91 = dateTimeZone84.convertLocalToUTC(0L, true);
        mutableDateTime63.setZoneRetainFields(dateTimeZone84);
        java.lang.String str93 = dateTimeZone84.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology94 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone84);
        org.joda.time.DateTimeField dateTimeField95 = ethiopicChronology94.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone96 = ethiopicChronology94.getZone();
        org.joda.time.DateTimeField dateTimeField97 = ethiopicChronology94.era();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime33.setRounding(dateTimeField97, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(mutableDateTime63);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertTrue("'" + isoEra78 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra78.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone84);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 3L + "'", long88 == 3L);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 0L + "'", long91 == 0L);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Etc/UTC" + "'", str93, "Etc/UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology94);
        org.junit.Assert.assertNotNull(dateTimeField95);
        org.junit.Assert.assertNotNull(dateTimeZone96);
        org.junit.Assert.assertNotNull(dateTimeField97);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.normalizedStandard();
        org.joda.time.Period period3 = period0.plusHours(2);
        java.time.chrono.IsoEra isoEra4 = java.time.chrono.IsoEra.CE;
        boolean boolean5 = period3.equals((java.lang.Object) isoEra4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.LocalTime localTime16 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime16);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime20 = localTime16.with((java.time.temporal.TemporalField) chronoField18, (long) (short) 1);
        long long21 = localTime10.getLong((java.time.temporal.TemporalField) chronoField18);
        boolean boolean22 = isoEra4.isSupported((java.time.temporal.TemporalField) chronoField18);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery23 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period24 = isoEra4.query(periodTemporalQuery23);
        boolean boolean25 = period24.isZero();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + isoEra4 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra4.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3601000000001L + "'", long21 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        byte[] byteArray5 = charsetEncoder4.replacement();
        java.nio.charset.Charset charset6 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder7 = charset6.newDecoder();
        float float8 = charsetDecoder7.maxCharsPerByte();
        float float9 = charsetDecoder7.averageCharsPerByte();
        java.nio.charset.CodingErrorAction codingErrorAction10 = charsetDecoder7.unmappableCharacterAction();
        java.nio.charset.CharsetEncoder charsetEncoder11 = charsetEncoder4.onUnmappableCharacter(codingErrorAction10);
        java.nio.charset.Charset charset12 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder13 = charset12.newDecoder();
        java.nio.charset.Charset charset14 = java.nio.charset.Charset.defaultCharset();
        boolean boolean15 = charset12.contains(charset14);
        java.nio.charset.CharsetEncoder charsetEncoder16 = charset12.newEncoder();
        char[] charArray17 = new char[] {};
        java.nio.CharBuffer charBuffer18 = java.nio.CharBuffer.wrap(charArray17);
        java.nio.ByteBuffer byteBuffer19 = charsetEncoder16.encode(charBuffer18);
        java.nio.CharBuffer charBuffer20 = charBuffer18.slice();
        java.nio.ByteBuffer byteBuffer21 = charsetEncoder11.encode(charBuffer20);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer21.asReadOnlyBuffer();
        java.io.OutputStream outputStream23 = null;
        java.io.FilterOutputStream filterOutputStream24 = new java.io.FilterOutputStream(outputStream23);
        byte[] byteArray26 = new byte[] { (byte) 100 };
        filterOutputStream24.write(byteArray26, (int) (byte) 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.wrap(byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer33 = byteBuffer21.put(byteArray26, (-624), 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[63]");
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(charsetDecoder7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(codingErrorAction10);
        org.junit.Assert.assertNotNull(charsetEncoder11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(charsetDecoder13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charsetEncoder16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        org.junit.Assert.assertNotNull(charBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(charBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100]");
        org.junit.Assert.assertNotNull(byteBuffer30);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        java.util.IntSummaryStatistics intSummaryStatistics3 = new java.util.IntSummaryStatistics();
        intStream2.forEach((java.util.function.IntConsumer) intSummaryStatistics3);
        java.util.stream.IntStream intStream5 = intStream2.parallel();
        java.util.function.IntToLongFunction intToLongFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = intStream5.mapToLong(intToLongFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals(intSummaryStatistics3.toString(), "IntSummaryStatistics{count=0, sum=0, min=2147483647, average=0.000000, max=-2147483648}");
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.util.stream.DoubleStream doubleStream0 = java.util.stream.DoubleStream.empty();
        java.util.stream.DoubleStream doubleStream1 = doubleStream0.unordered();
        java.util.function.DoublePredicate doublePredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = doubleStream0.allMatch(doublePredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream0);
        org.junit.Assert.assertNotNull(doubleStream1);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.plusMonths((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay0.withMonthOfYear(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.LocalTime localTime6 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime6);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime16 = localTime12.with((java.time.temporal.TemporalField) chronoField14, (long) (short) 1);
        long long17 = localTime6.getLong((java.time.temporal.TemporalField) chronoField14);
        java.time.LocalTime localTime19 = localTime6.withSecond((int) (short) 1);
        java.lang.Object obj21 = properties1.put((java.lang.Object) localTime19, (java.lang.Object) "117");
        boolean boolean23 = properties1.containsValue((java.lang.Object) 6);
        java.time.LocalDate localDate26 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int27 = localDate26.getMonthValue();
        java.lang.Object obj28 = properties1.replace((java.lang.Object) 21, (java.lang.Object) localDate26);
        java.time.LocalTime localTime33 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime34 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime33);
        java.time.LocalTime localTime39 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime40 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime39);
        java.time.temporal.ChronoField chronoField41 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime43 = localTime39.with((java.time.temporal.TemporalField) chronoField41, (long) (short) 1);
        long long44 = localTime33.getLong((java.time.temporal.TemporalField) chronoField41);
        java.time.LocalTime localTime46 = localTime33.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField47 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange48 = localTime46.range((java.time.temporal.TemporalField) chronoField47);
        java.time.LocalTime localTime54 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime55 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime54);
        java.time.LocalTime localTime60 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime61 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime60);
        java.time.temporal.ChronoField chronoField62 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime64 = localTime60.with((java.time.temporal.TemporalField) chronoField62, (long) (short) 1);
        long long65 = localTime54.getLong((java.time.temporal.TemporalField) chronoField62);
        java.time.LocalTime localTime67 = localTime54.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField68 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange69 = localTime67.range((java.time.temporal.TemporalField) chronoField68);
        int int70 = valueRange48.checkValidIntValue((long) 2022, (java.time.temporal.TemporalField) chronoField68);
        org.joda.time.tz.NameProvider nameProvider71 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.LocalTime localTime75 = new org.joda.time.LocalTime((long) 0, chronology74);
        org.joda.time.Chronology chronology76 = localTime75.getChronology();
        org.joda.time.DateTimeField dateTimeField77 = chronology76.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime78 = org.joda.time.MutableDateTime.now(chronology76);
        org.joda.time.DateTimeField dateTimeField79 = chronology76.monthOfYear();
        java.util.Locale locale80 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket82 = new org.joda.time.format.DateTimeParserBucket((long) 28, chronology76, locale80, (java.lang.Integer) 0);
        java.lang.String str85 = nameProvider71.getShortName(locale80, "22", "Chinese");
        java.lang.String str86 = chronoField68.getDisplayName(locale80);
        // The following exception was thrown during execution in test generation
        try {
            long long87 = localDate26.getLong((java.time.temporal.TemporalField) chronoField68);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: SecondOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3601000000001L + "'", long17 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + chronoField41 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField41.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 3601000000001L + "'", long44 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertTrue("'" + chronoField47 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField47.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange48);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertTrue("'" + chronoField62 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField62.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 3601000000001L + "'", long65 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertTrue("'" + chronoField68 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField68.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2022 + "'", int70 == 2022);
        org.junit.Assert.assertNotNull(nameProvider71);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertNotNull(mutableDateTime78);
        org.junit.Assert.assertNotNull(dateTimeField79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "en_US");
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "SecondOfDay" + "'", str86, "SecondOfDay");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.time.Month month1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.of(20, month1, 34, 365, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: month");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(6);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        org.joda.time.Duration duration11 = duration8.plus((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.minus((org.joda.time.ReadableDuration) duration11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withWeekOfWeekyear((int) '#');
        java.util.Date date15 = localDateTime14.toDate();
        org.joda.time.Chronology chronology16 = localDateTime14.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = localDateTime14.toString("halfdays");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: l");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Thu Aug 29 09:34:48 UTC 2097");
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        float float2 = charsetDecoder1.maxCharsPerByte();
        java.nio.charset.Charset charset3 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder4 = charset3.newDecoder();
        java.nio.charset.Charset charset5 = java.nio.charset.Charset.defaultCharset();
        boolean boolean6 = charset3.contains(charset5);
        java.nio.charset.CharsetEncoder charsetEncoder7 = charset3.newEncoder();
        char[] charArray8 = new char[] {};
        java.nio.CharBuffer charBuffer9 = java.nio.CharBuffer.wrap(charArray8);
        java.nio.ByteBuffer byteBuffer10 = charsetEncoder7.encode(charBuffer9);
        char[] charArray17 = new char[] { '#', '/', '4', 'a', '4', 'u' };
        java.nio.CharBuffer charBuffer18 = java.nio.CharBuffer.wrap(charArray17);
        java.nio.charset.CoderResult coderResult20 = charsetDecoder1.decode(byteBuffer10, charBuffer18, false);
        boolean boolean21 = charBuffer18.isDirect();
        char[] charArray22 = charBuffer18.array();
        java.nio.charset.Charset charset23 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder24 = charset23.newDecoder();
        java.nio.charset.Charset charset25 = java.nio.charset.Charset.defaultCharset();
        boolean boolean26 = charset23.contains(charset25);
        java.nio.charset.CharsetEncoder charsetEncoder27 = charset23.newEncoder();
        char[] charArray28 = new char[] {};
        java.nio.CharBuffer charBuffer29 = java.nio.CharBuffer.wrap(charArray28);
        java.nio.ByteBuffer byteBuffer30 = charsetEncoder27.encode(charBuffer29);
        java.nio.CharBuffer charBuffer31 = charBuffer29.slice();
        java.nio.CharBuffer charBuffer32 = charBuffer29.compact();
        int int33 = charBuffer18.compareTo(charBuffer32);
        java.nio.ByteOrder byteOrder34 = charBuffer32.order();
        java.nio.charset.Charset charset35 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder36 = charset35.newDecoder();
        float float37 = charsetDecoder36.maxCharsPerByte();
        java.nio.charset.Charset charset38 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder39 = charset38.newDecoder();
        java.nio.charset.Charset charset40 = java.nio.charset.Charset.defaultCharset();
        boolean boolean41 = charset38.contains(charset40);
        java.nio.charset.CharsetEncoder charsetEncoder42 = charset38.newEncoder();
        char[] charArray43 = new char[] {};
        java.nio.CharBuffer charBuffer44 = java.nio.CharBuffer.wrap(charArray43);
        java.nio.ByteBuffer byteBuffer45 = charsetEncoder42.encode(charBuffer44);
        char[] charArray52 = new char[] { '#', '/', '4', 'a', '4', 'u' };
        java.nio.CharBuffer charBuffer53 = java.nio.CharBuffer.wrap(charArray52);
        java.nio.charset.CoderResult coderResult55 = charsetDecoder36.decode(byteBuffer45, charBuffer53, false);
        boolean boolean56 = charBuffer53.isDirect();
        char[] charArray57 = charBuffer53.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer60 = charBuffer32.get(charArray57, 22, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(charsetDecoder4);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charsetEncoder7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertNotNull(charBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#/4a4u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#/4a4u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, /, 4, a, 4, u]");
        org.junit.Assert.assertNotNull(charBuffer18);
        org.junit.Assert.assertNotNull(coderResult20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#/4a4u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#/4a4u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, /, 4, a, 4, u]");
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertNotNull(charsetDecoder24);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charsetEncoder27);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[]");
        org.junit.Assert.assertNotNull(charBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(charBuffer31);
        org.junit.Assert.assertNotNull(charBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertNotNull(byteOrder34);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNotNull(charsetDecoder36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 1.0f + "'", float37 == 1.0f);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(charsetDecoder39);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(charsetEncoder42);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[]");
        org.junit.Assert.assertNotNull(charBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "#/4a4u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "#/4a4u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[#, /, 4, a, 4, u]");
        org.junit.Assert.assertNotNull(charBuffer53);
        org.junit.Assert.assertNotNull(coderResult55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "#/4a4u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "#/4a4u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[#, /, 4, a, 4, u]");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.lang.String str1 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        boolean boolean3 = subject0.isReadOnly();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Subject:\n" + "'", str1, "Subject:\n");
        org.junit.Assert.assertNotNull(principalSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            filterOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        char[] charArray5 = new char[] {};
        java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.wrap(charArray5);
        java.nio.ByteBuffer byteBuffer7 = charsetEncoder4.encode(charBuffer6);
        java.nio.ByteOrder byteOrder8 = byteBuffer7.order();
        java.lang.String str9 = byteOrder8.toString();
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "BIG_ENDIAN" + "'", str9, "BIG_ENDIAN");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        gregorianCalendar5.set(16, (int) '\uffff', 19, 52, 127, 6);
        gregorianCalendar5.setTimeInMillis(3600201600000L);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 3, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfYear();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 3, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.dayOfYear();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((java.lang.Object) dateTime21, chronology23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight24.withDayOfYear((int) ' ');
        int int29 = dateMidnight24.getWeekOfWeekyear();
        long long30 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight24.withDurationAdded((long) 25, 97);
        boolean boolean34 = gregorianCalendar5.equals((java.lang.Object) 25);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        int int3 = property2.getMaximumValue();
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = property2.setCopy(":", locale5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \":\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        org.joda.time.DateTime dateTime7 = property3.addToCopy((long) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withYear(4);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 3, chronology11);
        org.joda.time.Period period13 = org.joda.time.Period.ZERO;
        org.joda.time.Period period14 = period13.normalizedStandard();
        org.joda.time.Period period16 = period14.minusMinutes((int) ' ');
        org.joda.time.Period period18 = period16.minusMonths((int) (byte) 0);
        org.joda.time.PeriodType periodType19 = period18.getPeriodType();
        org.joda.time.DateTime dateTime20 = dateTime12.minus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime23 = dateTime20.plusMonths((int) (short) -1);
        org.joda.time.DateTime dateTime25 = dateTime23.minusDays(96000000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = dateTime25.withDate(34482, 256, 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 256 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.time.chrono.IsoEra isoEra0 = java.time.chrono.IsoEra.CE;
        int int1 = isoEra0.getValue();
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((long) (byte) 10);
        java.time.LocalDateTime localDateTime5 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime7 = localDateTime5.minusYears((long) (byte) 10);
        boolean boolean8 = localDateTime2.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime7);
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.MICRO_OF_DAY;
        java.time.LocalTime localTime14 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime15 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime14);
        java.time.LocalTime localTime20 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime21 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime20);
        java.time.temporal.ChronoField chronoField22 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime24 = localTime20.with((java.time.temporal.TemporalField) chronoField22, (long) (short) 1);
        long long25 = localTime14.getLong((java.time.temporal.TemporalField) chronoField22);
        java.time.LocalTime localTime27 = chronoField9.adjustInto(localTime14, (long) (byte) 1);
        boolean boolean28 = localDateTime2.isSupported((java.time.temporal.TemporalField) chronoField9);
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.ValueRange valueRange29 = isoEra0.range((java.time.temporal.TemporalField) chronoField9);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported field: MicroOfDay");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + isoEra0 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra0.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.MICRO_OF_DAY + "'", chronoField9.equals(java.time.temporal.ChronoField.MICRO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + chronoField22 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField22.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3601000000001L + "'", long25 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) (short) -1, (long) 7);
        java.util.function.LongPredicate longPredicate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = longStream2.allMatch(longPredicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime7 = localDateTime4.with((java.time.temporal.TemporalField) chronoField5, (long) 10);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) 0, chronology9);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = chronology11.weekyears();
        org.joda.time.DurationField durationField14 = chronology11.seconds();
        org.joda.time.Chronology chronology15 = chronology11.withUTC();
        boolean boolean16 = localDateChronoLocalDateTime7.equals((java.lang.Object) chronology11);
        org.joda.time.DateTimeField dateTimeField17 = chronology11.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (byte) 1, 100, (int) '+', (-32769), chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime7);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate.Property property2 = localDate0.dayOfWeek();
        org.joda.time.LocalDate.Property property3 = localDate0.yearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate0.yearOfCentury();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        byte[] byteArray5 = charsetEncoder4.replacement();
        java.nio.charset.Charset charset6 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder7 = charset6.newDecoder();
        float float8 = charsetDecoder7.maxCharsPerByte();
        float float9 = charsetDecoder7.averageCharsPerByte();
        java.nio.charset.CodingErrorAction codingErrorAction10 = charsetDecoder7.unmappableCharacterAction();
        java.nio.charset.CharsetEncoder charsetEncoder11 = charsetEncoder4.onUnmappableCharacter(codingErrorAction10);
        java.nio.charset.Charset charset12 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder13 = charset12.newDecoder();
        java.nio.charset.Charset charset14 = java.nio.charset.Charset.defaultCharset();
        boolean boolean15 = charset12.contains(charset14);
        java.nio.charset.CharsetEncoder charsetEncoder16 = charset12.newEncoder();
        byte[] byteArray17 = charsetEncoder16.replacement();
        java.nio.charset.CharsetEncoder charsetEncoder18 = charsetEncoder4.replaceWith(byteArray17);
        java.nio.charset.CharsetEncoder charsetEncoder19 = charsetEncoder18.reset();
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[63]");
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(charsetDecoder7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(codingErrorAction10);
        org.junit.Assert.assertNotNull(charsetEncoder11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(charsetDecoder13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charsetEncoder16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[63]");
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertNotNull(charsetEncoder19);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((long) (byte) 10);
        int int3 = localDateTime0.getHour();
        java.time.LocalDateTime localDateTime5 = localDateTime0.plusWeeks((long) 5);
        java.time.LocalDateTime localDateTime6 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime8 = localDateTime6.minusYears((long) (byte) 10);
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime11 = localDateTime9.minusYears((long) (byte) 10);
        boolean boolean12 = localDateTime6.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime11);
        java.time.ZoneOffset zoneOffset15 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate16 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset15);
        java.time.Clock clock17 = java.time.Clock.system((java.time.ZoneId) zoneOffset15);
        java.time.ZoneOffset zoneOffset20 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate21 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset20);
        java.time.Clock clock22 = java.time.Clock.system((java.time.ZoneId) zoneOffset20);
        int int23 = zoneOffset15.compareTo(zoneOffset20);
        java.time.OffsetDateTime offsetDateTime24 = java.time.OffsetDateTime.of(localDateTime6, zoneOffset15);
        java.time.ZoneOffset zoneOffset27 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.temporal.ChronoField chronoField28 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        java.time.temporal.ValueRange valueRange29 = chronoField28.range();
        boolean boolean30 = zoneOffset27.isSupported((java.time.temporal.TemporalField) chronoField28);
        // The following exception was thrown during execution in test generation
        try {
            java.time.zone.ZoneOffsetTransition zoneOffsetTransition31 = java.time.zone.ZoneOffsetTransition.of(localDateTime5, zoneOffset15, zoneOffset27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offsets must not be equal");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneOffset15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(clock17);
        org.junit.Assert.assertNotNull(zoneOffset20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(clock22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(offsetDateTime24);
        org.junit.Assert.assertNotNull(zoneOffset27);
        org.junit.Assert.assertTrue("'" + chronoField28 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField28.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfCentury((int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(6);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withWeekyear(10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.minusHours(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime3.minusHours(1024);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.normalizedStandard();
        org.joda.time.Period period3 = period1.minusMinutes((int) ' ');
        org.joda.time.Period period5 = period3.minusMonths((int) (byte) 0);
        org.joda.time.PeriodType periodType6 = period5.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType8 = periodType6.getFieldType(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2147483647");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.LocalDate localDate1 = offsetDateTime0.toLocalDate();
        java.time.OffsetDateTime offsetDateTime2 = java.time.OffsetDateTime.now();
        java.time.LocalDate localDate3 = offsetDateTime2.toLocalDate();
        java.time.OffsetDateTime offsetDateTime4 = java.time.OffsetDateTime.now();
        java.time.temporal.ChronoField chronoField5 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        boolean boolean6 = offsetDateTime4.isSupported((java.time.temporal.TemporalField) chronoField5);
        boolean boolean7 = offsetDateTime2.isEqual(offsetDateTime4);
        java.lang.String str8 = offsetDateTime4.toString();
        boolean boolean9 = offsetDateTime0.isAfter(offsetDateTime4);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 3, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfYear();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((java.lang.Object) dateTime12, chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime12.toMutableDateTime();
        mutableDateTime16.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.dayOfWeek();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime16.year();
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        mutableDateTime16.setZone(dateTimeZone22);
        java.util.TimeZone timeZone24 = dateTimeZone22.toTimeZone();
        int int26 = timeZone24.getOffset((long) (byte) -1);
        java.time.ZoneId zoneId27 = timeZone24.toZoneId();
        java.time.ZonedDateTime zonedDateTime28 = offsetDateTime4.atZoneSimilarLocal(zoneId27);
        java.time.LocalDate localDate30 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int31 = localDate30.getMonthValue();
        org.joda.time.Period period32 = org.joda.time.Period.ZERO;
        org.joda.time.Period period33 = period32.normalizedStandard();
        org.joda.time.Period period35 = period32.plusHours(2);
        java.time.chrono.IsoEra isoEra36 = java.time.chrono.IsoEra.CE;
        boolean boolean37 = period35.equals((java.lang.Object) isoEra36);
        java.time.LocalTime localTime42 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime43 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime42);
        java.time.LocalTime localTime48 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime49 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime48);
        java.time.temporal.ChronoField chronoField50 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime52 = localTime48.with((java.time.temporal.TemporalField) chronoField50, (long) (short) 1);
        long long53 = localTime42.getLong((java.time.temporal.TemporalField) chronoField50);
        boolean boolean54 = isoEra36.isSupported((java.time.temporal.TemporalField) chronoField50);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery55 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period56 = isoEra36.query(periodTemporalQuery55);
        boolean boolean57 = period56.isNegative();
        java.time.Period period59 = period56.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField60 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean61 = period56.equals((java.lang.Object) chronoField60);
        boolean boolean62 = localDate30.isSupported((java.time.temporal.TemporalField) chronoField60);
        java.time.temporal.TemporalUnit temporalUnit63 = chronoField60.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime65 = zonedDateTime28.with((java.time.temporal.TemporalField) chronoField60, 6552109211L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for SecondOfDay (valid values 0 - 86399): 6552109211");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(offsetDateTime2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(offsetDateTime4);
        org.junit.Assert.assertTrue("'" + chronoField5 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField5.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022-02-21T09:34:49.521Z" + "'", str8, "2022-02-21T09:34:49.521Z");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertNotNull(zonedDateTime28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + isoEra36 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra36.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertTrue("'" + chronoField50 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField50.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 3601000000001L + "'", long53 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery55);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + chronoField60 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField60.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit63 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit63.equals(java.time.temporal.ChronoUnit.DAYS));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.util.Date date0 = new java.util.Date();
        date0.setYear(59);
        java.lang.Object obj3 = date0.clone();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Sat Feb 21 09:34:49 UTC 1959");
        org.junit.Assert.assertNotNull(obj3);
// flaky:         org.junit.Assert.assertEquals(obj3.toString(), "Sat Feb 21 09:34:49 UTC 1959");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "Sat Feb 21 09:34:49 UTC 1959");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "Sat Feb 21 09:34:49 UTC 1959");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        mutableDateTime6.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.millisOfDay();
        org.joda.time.Period period10 = org.joda.time.Period.ZERO;
        org.joda.time.Period period11 = period10.normalizedStandard();
        org.joda.time.Period period13 = period11.minusMonths(3600000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime6, (org.joda.time.ReadablePeriod) period13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.time.OffsetDateTime offsetDateTime0 = java.time.OffsetDateTime.now();
        java.time.temporal.ChronoField chronoField1 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        boolean boolean2 = offsetDateTime0.isSupported((java.time.temporal.TemporalField) chronoField1);
        java.time.temporal.ValueRange valueRange3 = chronoField1.range();
        long long4 = valueRange3.getLargestMinimum();
        java.lang.String str5 = valueRange3.toString();
        java.time.temporal.ChronoField chronoField7 = java.time.temporal.ChronoField.DAY_OF_WEEK;
        java.time.LocalDateTime localDateTime8 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime11 = localDateTime8.with((java.time.temporal.TemporalField) chronoField9, (long) 10);
        java.time.Duration duration13 = java.time.Duration.ofSeconds((long) 0);
        java.time.temporal.Temporal temporal14 = localDateTime8.minus((java.time.temporal.TemporalAmount) duration13);
        long long15 = chronoField7.getFrom((java.time.temporal.TemporalAccessor) temporal14);
        java.time.LocalTime localTime20 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime21 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime20);
        java.time.temporal.ChronoField chronoField22 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime24 = localTime20.with((java.time.temporal.TemporalField) chronoField22, (long) (short) 1);
        java.util.Locale locale25 = java.util.Locale.GERMANY;
        java.lang.String str26 = chronoField22.getDisplayName(locale25);
        java.lang.String str27 = chronoField7.getDisplayName(locale25);
        int int28 = valueRange3.checkValidIntValue((long) 5, (java.time.temporal.TemporalField) chronoField7);
        long long29 = valueRange3.getMinimum();
        org.junit.Assert.assertNotNull(offsetDateTime0);
        org.junit.Assert.assertTrue("'" + chronoField1 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField1.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(valueRange3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 - 23" + "'", str5, "0 - 23");
        org.junit.Assert.assertTrue("'" + chronoField7 + "' != '" + java.time.temporal.ChronoField.DAY_OF_WEEK + "'", chronoField7.equals(java.time.temporal.ChronoField.DAY_OF_WEEK));
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField9.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(temporal14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + chronoField22 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField22.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NanoOfDay" + "'", str26, "NanoOfDay");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Wochentag" + "'", str27, "Wochentag");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime();
        boolean boolean7 = mutableDateTime6.isBeforeNow();
        mutableDateTime6.addHours(70);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) 0, chronology11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 3, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((java.lang.Object) dateTime15, chronology17);
        org.joda.time.DateTime dateTime19 = localTime12.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime21 = dateTime15.plusYears((int) 'a');
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime6, (org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 3, chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfYear();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((java.lang.Object) dateTime25, chronology27);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime25.toMutableDateTime();
        mutableDateTime29.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime29.millisOfDay();
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.years();
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.halfdays();
        int int35 = periodType33.indexOf(durationFieldType34);
        mutableDateTime29.add(durationFieldType34, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period39 = period22.withFieldAdded(durationFieldType34, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'halfdays'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 3, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfYear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((java.lang.Object) dateTime6, chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusMonths((-1));
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight9.withDayOfYear((int) ' ');
        int int14 = dateMidnight9.getWeekOfWeekyear();
        long long15 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight9);
        boolean boolean17 = dateMidnight9.isAfter(10L);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight9.withMillis(0L);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateMidnight19);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusDays(28);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) 0, chronology6);
        org.joda.time.LocalTime localTime9 = localTime7.minusMillis(2022);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.monthOfYear();
        boolean boolean11 = localTime9.isSupported(dateTimeFieldType10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int13 = localTime9.indexOf(dateTimeFieldType12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 0, chronology15);
        org.joda.time.LocalTime localTime18 = localTime16.minusMillis(2022);
        org.joda.time.LocalTime localTime20 = localTime16.plusMillis((int) (byte) 0);
        org.joda.time.LocalTime localTime21 = localTime9.withFields((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes24 = minutes22.minus(12);
        org.joda.time.Minutes minutes25 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes27 = minutes25.minus(12);
        org.joda.time.Minutes minutes28 = minutes22.minus(minutes25);
        org.joda.time.Minutes minutes29 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes31 = minutes29.minus(12);
        org.joda.time.Minutes minutes32 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes34 = minutes32.minus(12);
        java.lang.String str35 = minutes32.toString();
        org.joda.time.Minutes minutes36 = minutes29.minus(minutes32);
        boolean boolean37 = minutes28.isLessThan(minutes32);
        org.joda.time.LocalTime localTime38 = localTime20.minus((org.joda.time.ReadablePeriod) minutes28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period39 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDateTime1, (org.joda.time.ReadablePartial) localTime38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT2147483647M" + "'", str35, "PT2147483647M");
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(localTime38);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("Mon");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Mon\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLocalHost();
        boolean boolean1 = inetAddress0.isMCOrgLocal();
        boolean boolean2 = inetAddress0.isMCGlobal();
        java.lang.String str3 = inetAddress0.getHostName();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "599b081c1808" + "'", str3, "599b081c1808");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 0, chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 3, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfYear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((java.lang.Object) dateTime6, chronology8);
        org.joda.time.DateTime dateTime10 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMillis((int) (byte) 0);
        org.joda.time.DateTime dateTime14 = dateTime10.withYearOfCentury((int) (byte) 10);
        org.joda.time.DateTime.Property property15 = dateTime14.hourOfDay();
        boolean boolean16 = dateMidnight0.isEqual((org.joda.time.ReadableInstant) dateTime14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime14.withSecondOfMinute(65);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 65 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        byte[] byteArray5 = charsetEncoder4.replacement();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.wrap(byteArray5, (int) (short) 0, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[63]");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Interval interval1 = localDate0.toInterval();
        int int2 = localDate0.getYearOfCentury();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = new org.joda.time.Duration(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = duration5.toPeriodTo(readableInstant6, periodType7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = new org.joda.time.Duration(readableInstant9, readableInstant10);
        long long12 = duration11.getMillis();
        boolean boolean13 = duration5.isShorterThan((org.joda.time.ReadableDuration) duration11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 3, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfYear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((java.lang.Object) dateTime16, chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime16.toMutableDateTime();
        mutableDateTime20.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime20.dayOfWeek();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime20.year();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.weekyear();
        boolean boolean26 = duration5.equals((java.lang.Object) mutableDateTime20);
        mutableDateTime20.addMonths((int) ' ');
        mutableDateTime20.add((long) (byte) 10);
        org.joda.time.Period period31 = org.joda.time.Period.ZERO;
        org.joda.time.Period period32 = period31.normalizedStandard();
        org.joda.time.Period period34 = period31.plusHours(2);
        java.time.chrono.IsoEra isoEra35 = java.time.chrono.IsoEra.CE;
        boolean boolean36 = period34.equals((java.lang.Object) isoEra35);
        int int37 = period34.getMinutes();
        mutableDateTime20.add((org.joda.time.ReadablePeriod) period34);
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone41);
        long long45 = dateTimeZone41.convertLocalToUTC((long) 3, false);
        long long48 = dateTimeZone41.convertLocalToUTC(0L, true);
        mutableDateTime20.setZoneRetainFields(dateTimeZone41);
        java.lang.String str50 = dateTimeZone41.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology51 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTime dateTime52 = localDate0.toDateTimeAtCurrentTime(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay54 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay56 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0);
        org.joda.time.Hours hours57 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay54, (org.joda.time.ReadablePartial) timeOfDay56);
        org.joda.time.TimeOfDay timeOfDay59 = timeOfDay54.withSecondOfMinute(0);
        int int60 = timeOfDay54.size();
        int[] intArray61 = timeOfDay54.getValues();
        org.joda.time.Minutes minutes62 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes64 = minutes62.minus(12);
        java.lang.String str65 = minutes62.toString();
        org.joda.time.PeriodType periodType66 = minutes62.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period67 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate0, (org.joda.time.ReadablePartial) timeOfDay54, periodType66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + isoEra35 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra35.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 3L + "'", long45 == 3L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Etc/UTC" + "'", str50, "Etc/UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(hours57);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 4 + "'", int60 == 4);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(minutes62);
        org.junit.Assert.assertNotNull(minutes64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PT2147483647M" + "'", str65, "PT2147483647M");
        org.junit.Assert.assertNotNull(periodType66);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        java.util.stream.IntStream intStream2 = java.util.stream.IntStream.rangeClosed(100, (int) '4');
        java.util.stream.IntStream intStream3 = intStream2.sequential();
        java.util.function.IntUnaryOperator intUnaryOperator4 = java.util.function.IntUnaryOperator.identity();
        java.util.stream.IntStream intStream5 = intStream2.map(intUnaryOperator4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.IntSummaryStatistics intSummaryStatistics6 = intStream2.summaryStatistics();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(intUnaryOperator4);
        org.junit.Assert.assertNotNull(intStream5);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 5, (long) 'a');
        java.util.OptionalLong optionalLong3 = longStream2.min();
        java.util.stream.LongStream longStream4 = longStream2.sequential();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream5 = longStream4.sorted();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.net.InetAddress inetAddress0 = java.net.InetAddress.getLocalHost();
        boolean boolean1 = inetAddress0.isMCOrgLocal();
        boolean boolean2 = inetAddress0.isMCGlobal();
        boolean boolean3 = inetAddress0.isMCLinkLocal();
        org.junit.Assert.assertNotNull(inetAddress0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) (short) -1, (long) 7);
        java.util.function.LongPredicate longPredicate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream4 = longStream2.filter(longPredicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.nio.CharBuffer charBuffer1 = java.nio.CharBuffer.wrap((java.lang.CharSequence) "2022-02-21T09:34:12.478Z");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer5 = charBuffer1.put("Chinese (Taiwan)", (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charBuffer1);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 5, (long) 'a');
        java.util.OptionalLong optionalLong3 = longStream2.min();
        java.util.stream.LongStream longStream4 = longStream2.sequential();
        java.util.function.LongToIntFunction longToIntFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream6 = longStream2.mapToInt(longToIntFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(optionalLong3);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = property2.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = property2.addToCopy(21);
        org.joda.time.LocalDateTime localDateTime7 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundFloorCopy();
        org.joda.time.DurationField durationField10 = property8.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit6 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean7 = weeks5.equals((java.lang.Object) timeUnit6);
        timeUnit6.sleep((long) 10);
        boolean boolean10 = interval4.equals((java.lang.Object) timeUnit6);
        org.joda.time.Interval interval12 = interval4.withStartMillis(58L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval14 = interval4.withStartMillis(4924800047L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(timeUnit6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(interval12);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.MIN;
        java.time.Month month1 = java.time.Month.NOVEMBER;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime2 = localDateTime0.with((java.time.temporal.TemporalAdjuster) month1);
        java.time.LocalDate localDate5 = java.time.LocalDate.ofEpochDay((long) ' ');
        int int6 = localDate5.getMonthValue();
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.Period period8 = period7.normalizedStandard();
        org.joda.time.Period period10 = period7.plusHours(2);
        java.time.chrono.IsoEra isoEra11 = java.time.chrono.IsoEra.CE;
        boolean boolean12 = period10.equals((java.lang.Object) isoEra11);
        java.time.LocalTime localTime17 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime18 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime17);
        java.time.LocalTime localTime23 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime24 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime23);
        java.time.temporal.ChronoField chronoField25 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime27 = localTime23.with((java.time.temporal.TemporalField) chronoField25, (long) (short) 1);
        long long28 = localTime17.getLong((java.time.temporal.TemporalField) chronoField25);
        boolean boolean29 = isoEra11.isSupported((java.time.temporal.TemporalField) chronoField25);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery30 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period31 = isoEra11.query(periodTemporalQuery30);
        boolean boolean32 = period31.isNegative();
        java.time.Period period34 = period31.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField35 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean36 = period31.equals((java.lang.Object) chronoField35);
        boolean boolean37 = localDate5.isSupported((java.time.temporal.TemporalField) chronoField35);
        java.time.temporal.TemporalUnit temporalUnit38 = chronoField35.getRangeUnit();
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime39 = localDateChronoLocalDateTime2.plus(1L, temporalUnit38);
        java.time.LocalTime localTime44 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime45 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime44);
        java.time.LocalTime localTime50 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime51 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime50);
        java.time.temporal.ChronoField chronoField52 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime54 = localTime50.with((java.time.temporal.TemporalField) chronoField52, (long) (short) 1);
        long long55 = localTime44.getLong((java.time.temporal.TemporalField) chronoField52);
        java.time.LocalTime localTime57 = localTime44.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField58 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange59 = localTime57.range((java.time.temporal.TemporalField) chronoField58);
        long long60 = valueRange59.getLargestMinimum();
        boolean boolean61 = localDateChronoLocalDateTime39.equals((java.lang.Object) long60);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + month1 + "' != '" + java.time.Month.NOVEMBER + "'", month1.equals(java.time.Month.NOVEMBER));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + isoEra11 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra11.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + chronoField25 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField25.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3601000000001L + "'", long28 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + chronoField35 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField35.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + temporalUnit38 + "' != '" + java.time.temporal.ChronoUnit.DAYS + "'", temporalUnit38.equals(java.time.temporal.ChronoUnit.DAYS));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime39);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertTrue("'" + chronoField52 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField52.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 3601000000001L + "'", long55 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertTrue("'" + chronoField58 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField58.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.time.OffsetTime offsetTime0 = java.time.OffsetTime.MAX;
        java.time.LocalTime localTime1 = offsetTime0.toLocalTime();
        java.lang.String str2 = offsetTime0.toString();
        java.time.Duration duration3 = java.time.Duration.ZERO;
        java.lang.String str4 = duration3.toString();
        java.time.OffsetTime offsetTime5 = offsetTime0.plus((java.time.temporal.TemporalAmount) duration3);
        java.time.OffsetTime offsetTime7 = offsetTime0.withHour((int) (short) 1);
        java.time.OffsetTime offsetTime9 = offsetTime0.minusSeconds((long) '4');
        org.junit.Assert.assertNotNull(offsetTime0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23:59:59.999999999-18:00" + "'", str2, "23:59:59.999999999-18:00");
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0S" + "'", str4, "PT0S");
        org.junit.Assert.assertNotNull(offsetTime5);
        org.junit.Assert.assertNotNull(offsetTime7);
        org.junit.Assert.assertNotNull(offsetTime9);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        long long3 = timeUnit1.toMinutes((long) '4');
        java.nio.file.attribute.FileTime fileTime4 = java.nio.file.attribute.FileTime.from((long) 10, timeUnit1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((java.lang.Object) timeUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.util.concurrent.TimeUnit$1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fileTime4);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        byte[] byteArray5 = charsetEncoder4.replacement();
        java.nio.charset.Charset charset6 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder7 = charset6.newDecoder();
        float float8 = charsetDecoder7.maxCharsPerByte();
        float float9 = charsetDecoder7.averageCharsPerByte();
        java.nio.charset.CodingErrorAction codingErrorAction10 = charsetDecoder7.unmappableCharacterAction();
        java.nio.charset.CharsetEncoder charsetEncoder11 = charsetEncoder4.onUnmappableCharacter(codingErrorAction10);
        java.nio.charset.Charset charset12 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder13 = charset12.newDecoder();
        java.nio.charset.Charset charset14 = java.nio.charset.Charset.defaultCharset();
        boolean boolean15 = charset12.contains(charset14);
        java.nio.charset.CharsetEncoder charsetEncoder16 = charset12.newEncoder();
        char[] charArray17 = new char[] {};
        java.nio.CharBuffer charBuffer18 = java.nio.CharBuffer.wrap(charArray17);
        java.nio.ByteBuffer byteBuffer19 = charsetEncoder16.encode(charBuffer18);
        java.nio.CharBuffer charBuffer20 = charBuffer18.slice();
        java.nio.ByteBuffer byteBuffer21 = charsetEncoder11.encode(charBuffer20);
        // The following exception was thrown during execution in test generation
        try {
            float float22 = byteBuffer21.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[63]");
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(charsetDecoder7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(codingErrorAction10);
        org.junit.Assert.assertNotNull(charsetEncoder11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(charsetDecoder13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charsetEncoder16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        org.junit.Assert.assertNotNull(charBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(charBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.normalizedStandard();
        org.joda.time.Period period3 = period0.plusHours(2);
        java.time.chrono.IsoEra isoEra4 = java.time.chrono.IsoEra.CE;
        boolean boolean5 = period3.equals((java.lang.Object) isoEra4);
        java.time.LocalTime localTime10 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime11 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime10);
        java.time.LocalTime localTime16 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime17 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime16);
        java.time.temporal.ChronoField chronoField18 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime20 = localTime16.with((java.time.temporal.TemporalField) chronoField18, (long) (short) 1);
        long long21 = localTime10.getLong((java.time.temporal.TemporalField) chronoField18);
        boolean boolean22 = isoEra4.isSupported((java.time.temporal.TemporalField) chronoField18);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery23 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period24 = isoEra4.query(periodTemporalQuery23);
        boolean boolean25 = period24.isNegative();
        java.time.Period period27 = period24.plusDays((long) ' ');
        java.time.temporal.ChronoField chronoField28 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        boolean boolean29 = period24.equals((java.lang.Object) chronoField28);
        java.util.GregorianCalendar gregorianCalendar35 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int36 = gregorianCalendar35.getWeeksInWeekYear();
        java.lang.String str37 = gregorianCalendar35.getCalendarType();
        java.time.ZonedDateTime zonedDateTime38 = gregorianCalendar35.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime40 = zonedDateTime38.minusMonths((long) 10);
        int int41 = zonedDateTime38.getMonthValue();
        java.time.LocalTime localTime46 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime47 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime46);
        java.time.LocalTime localTime52 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime53 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime52);
        java.time.temporal.ChronoField chronoField54 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime56 = localTime52.with((java.time.temporal.TemporalField) chronoField54, (long) (short) 1);
        long long57 = localTime46.getLong((java.time.temporal.TemporalField) chronoField54);
        long long58 = zonedDateTime38.getLong((java.time.temporal.TemporalField) chronoField54);
        java.util.GregorianCalendar gregorianCalendar64 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int65 = gregorianCalendar64.getWeeksInWeekYear();
        java.lang.String str66 = gregorianCalendar64.getCalendarType();
        java.time.ZonedDateTime zonedDateTime67 = gregorianCalendar64.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime69 = zonedDateTime67.minusMonths((long) 10);
        int int70 = zonedDateTime67.getMonthValue();
        java.time.LocalTime localTime75 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime76 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime75);
        java.time.LocalTime localTime81 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime82 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime81);
        java.time.temporal.ChronoField chronoField83 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime85 = localTime81.with((java.time.temporal.TemporalField) chronoField83, (long) (short) 1);
        long long86 = localTime75.getLong((java.time.temporal.TemporalField) chronoField83);
        long long87 = zonedDateTime67.getLong((java.time.temporal.TemporalField) chronoField83);
        java.time.ZoneOffset zoneOffset90 = java.time.ZoneOffset.ofHoursMinutes(1, 10);
        java.time.LocalDate localDate91 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset90);
        java.time.LocalDate localDate92 = java.time.LocalDate.now((java.time.ZoneId) zoneOffset90);
        java.time.chrono.ChronoZonedDateTime<java.time.LocalDate> localDateChronoZonedDateTime93 = zonedDateTime67.withZoneSameLocal((java.time.ZoneId) zoneOffset90);
        boolean boolean94 = zonedDateTime38.isBefore(localDateChronoZonedDateTime93);
        java.time.ZonedDateTime zonedDateTime96 = zonedDateTime38.minusMonths((long) 197);
        java.time.temporal.Temporal temporal97 = period24.addTo((java.time.temporal.Temporal) zonedDateTime96);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + isoEra4 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra4.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + chronoField18 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField18.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3601000000001L + "'", long21 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + chronoField28 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField28.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "gregory" + "'", str37, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime38);
        org.junit.Assert.assertNotNull(zonedDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertTrue("'" + chronoField54 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField54.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 3601000000001L + "'", long57 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 83400000000000L + "'", long58 == 83400000000000L);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 52 + "'", int65 == 52);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "gregory" + "'", str66, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime67);
        org.junit.Assert.assertNotNull(zonedDateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 5 + "'", int70 == 5);
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertNotNull(localTime81);
        org.junit.Assert.assertNotNull(localTime82);
        org.junit.Assert.assertTrue("'" + chronoField83 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField83.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime85);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 3601000000001L + "'", long86 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 83400000000000L + "'", long87 == 83400000000000L);
        org.junit.Assert.assertNotNull(zoneOffset90);
        org.junit.Assert.assertNotNull(localDate91);
        org.junit.Assert.assertNotNull(localDate92);
        org.junit.Assert.assertNotNull(localDateChronoZonedDateTime93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(zonedDateTime96);
        org.junit.Assert.assertNotNull(temporal97);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray4 = new java.util.Locale[] { locale3 };
        java.util.ArrayList<java.util.Locale> localeList5 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList5, localeArray4);
        java.util.List<java.util.Locale> localeList7 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList5);
        org.joda.time.Period period8 = org.joda.time.Period.ZERO;
        org.joda.time.Period period9 = period8.normalizedStandard();
        org.joda.time.Period period11 = period8.plusHours(2);
        java.time.chrono.IsoEra isoEra12 = java.time.chrono.IsoEra.CE;
        boolean boolean13 = period11.equals((java.lang.Object) isoEra12);
        java.time.LocalTime localTime18 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime19 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime18);
        java.time.LocalTime localTime24 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime25 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime24);
        java.time.temporal.ChronoField chronoField26 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime28 = localTime24.with((java.time.temporal.TemporalField) chronoField26, (long) (short) 1);
        long long29 = localTime18.getLong((java.time.temporal.TemporalField) chronoField26);
        boolean boolean30 = isoEra12.isSupported((java.time.temporal.TemporalField) chronoField26);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery31 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period32 = isoEra12.query(periodTemporalQuery31);
        boolean boolean33 = period32.isNegative();
        java.time.Period period35 = period32.plusDays((long) ' ');
        boolean boolean36 = period32.isNegative();
        java.time.Period period38 = period32.minusYears((long) 10);
        int int39 = localeList7.lastIndexOf((java.lang.Object) period32);
        java.util.Iterator<java.util.Locale> localeItor40 = localeList7.iterator();
        java.util.Set<java.lang.String> strSet41 = java.time.ZoneId.getAvailableZoneIds();
        java.util.stream.Stream<java.lang.String> strStream42 = strSet41.parallelStream();
        boolean boolean44 = strSet41.remove((java.lang.Object) 0);
        boolean boolean45 = localeList7.retainAll((java.util.Collection<java.lang.String>) strSet41);
        java.time.Period period47 = java.time.Period.ofMonths(0);
        java.time.Period period48 = period47.negated();
        int int49 = period47.getDays();
        org.joda.time.Period period50 = org.joda.time.Period.ZERO;
        org.joda.time.Period period51 = period50.normalizedStandard();
        org.joda.time.Period period53 = period50.plusHours(2);
        java.time.chrono.IsoEra isoEra54 = java.time.chrono.IsoEra.CE;
        boolean boolean55 = period53.equals((java.lang.Object) isoEra54);
        java.time.LocalTime localTime60 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime61 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime60);
        java.time.LocalTime localTime66 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime67 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime66);
        java.time.temporal.ChronoField chronoField68 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime70 = localTime66.with((java.time.temporal.TemporalField) chronoField68, (long) (short) 1);
        long long71 = localTime60.getLong((java.time.temporal.TemporalField) chronoField68);
        boolean boolean72 = isoEra54.isSupported((java.time.temporal.TemporalField) chronoField68);
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery73 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period74 = isoEra54.query(periodTemporalQuery73);
        boolean boolean75 = period74.isNegative();
        java.time.Period period77 = period74.plusDays((long) ' ');
        boolean boolean78 = period74.isNegative();
        java.time.Period period80 = period74.minusYears((long) 10);
        java.time.Period period82 = period74.plusMonths((long) 17);
        java.time.Period period83 = period47.minus((java.time.temporal.TemporalAmount) period74);
        boolean boolean84 = strSet41.equals((java.lang.Object) period47);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localeList7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + isoEra12 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra12.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + chronoField26 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField26.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 3601000000001L + "'", long29 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(localeItor40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(strStream42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertTrue("'" + isoEra54 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra54.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertTrue("'" + chronoField68 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField68.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 3601000000001L + "'", long71 == 3601000000001L);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(periodTemporalQuery73);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.years();
        org.joda.time.format.PeriodFormatter periodFormatter4 = periodFormatter2.withParseType(periodType3);
        java.util.Locale locale6 = new java.util.Locale("hi!");
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale6.getUnicodeLocaleType("2022-02-21T09:34:25.560Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 2022-02-21T09:34:25.560Z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodFormatter4);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertNotNull(periodFormatter7);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        java.time.LocalDateTime localDateTime0 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((long) (byte) 10);
        java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime5 = localDateTime3.minusYears((long) (byte) 10);
        boolean boolean6 = localDateTime0.isEqual((java.time.chrono.ChronoLocalDateTime<java.time.LocalDate>) localDateTime5);
        java.time.LocalDateTime localDateTime8 = localDateTime5.withSecond((int) '+');
        java.time.chrono.Chronology chronology9 = localDateTime5.getChronology();
        java.time.temporal.TemporalUnit temporalUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime12 = localDateTime5.plus((long) 52, temporalUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.time.temporal.ChronoField chronoField0 = java.time.temporal.ChronoField.OFFSET_SECONDS;
        boolean boolean1 = chronoField0.isDateBased();
        org.junit.Assert.assertTrue("'" + chronoField0 + "' != '" + java.time.temporal.ChronoField.OFFSET_SECONDS + "'", chronoField0.equals(java.time.temporal.ChronoField.OFFSET_SECONDS));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateMidnight dateMidnight1 = yearMonthDay0.toDateMidnight();
        org.joda.time.Interval interval2 = yearMonthDay0.toInterval();
        org.junit.Assert.assertNotNull(dateMidnight1);
        org.junit.Assert.assertNotNull(interval2);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        short[] shortArray2 = new short[] { (byte) 0, (short) 1 };
        java.nio.ShortBuffer shortBuffer3 = java.nio.ShortBuffer.wrap(shortArray2);
        short[] shortArray6 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer7 = java.nio.ShortBuffer.wrap(shortArray6);
        short[] shortArray10 = new short[] { (short) 1, (byte) 10 };
        java.nio.ShortBuffer shortBuffer11 = java.nio.ShortBuffer.wrap(shortArray10);
        java.nio.ShortBuffer shortBuffer12 = shortBuffer7.put(shortBuffer11);
        int int13 = shortBuffer12.limit();
        boolean boolean14 = shortBuffer12.isReadOnly();
        java.nio.ShortBuffer shortBuffer15 = shortBuffer3.put(shortBuffer12);
        short[] shortArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ShortBuffer shortBuffer19 = shortBuffer12.put(shortArray16, 574, 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[1, 10]");
        org.junit.Assert.assertNotNull(shortBuffer11);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortBuffer15);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        gregorianCalendar5.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar) gregorianCalendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.lang.String str7 = gregorianCalendar5.getCalendarType();
        java.time.ZonedDateTime zonedDateTime8 = gregorianCalendar5.toZonedDateTime();
        java.util.Date date15 = new java.util.Date((int) 'a', 3, 0, (-1), (int) '/', 28);
        int int16 = date15.getTimezoneOffset();
        gregorianCalendar5.setGregorianChange(date15);
        java.lang.String str18 = date15.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gregory" + "'", str7, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Mar 30 23:47:28 UTC 1997");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Sun Mar 30 23:47:28 UTC 1997" + "'", str18, "Sun Mar 30 23:47:28 UTC 1997");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress6 = java.net.InetAddress.getByAddress(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: addr is of illegal length");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, 0, 0, 10]");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.util.Properties properties0 = null;
        java.util.Properties properties1 = new java.util.Properties(properties0);
        java.time.LocalTime localTime6 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime7 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime6);
        java.time.LocalTime localTime12 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime13 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime12);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime16 = localTime12.with((java.time.temporal.TemporalField) chronoField14, (long) (short) 1);
        long long17 = localTime6.getLong((java.time.temporal.TemporalField) chronoField14);
        java.time.LocalTime localTime19 = localTime6.withSecond((int) (short) 1);
        java.lang.Object obj21 = properties1.put((java.lang.Object) localTime19, (java.lang.Object) "117");
        java.lang.Object obj22 = properties1.clone();
        java.lang.Object obj23 = null;
        java.util.GregorianCalendar gregorianCalendar29 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int30 = gregorianCalendar29.getWeeksInWeekYear();
        java.lang.String str31 = gregorianCalendar29.getCalendarType();
        java.time.ZonedDateTime zonedDateTime32 = gregorianCalendar29.toZonedDateTime();
        java.util.GregorianCalendar gregorianCalendar38 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int39 = gregorianCalendar38.getWeeksInWeekYear();
        java.lang.String str40 = gregorianCalendar38.getCalendarType();
        java.time.ZonedDateTime zonedDateTime41 = gregorianCalendar38.toZonedDateTime();
        int int42 = zonedDateTime32.compareTo((java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>) zonedDateTime41);
        java.time.ZonedDateTime zonedDateTime44 = zonedDateTime32.plusDays((long) 2022);
        java.time.Instant instant45 = zonedDateTime32.toInstant();
        java.time.chrono.Chronology chronology46 = zonedDateTime32.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = properties1.put(obj23, (java.lang.Object) chronology46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField14.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3601000000001L + "'", long17 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{01:00:01.000000001=117}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{01:00:01.000000001=117}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{01:00:01.000000001=117}");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "gregory" + "'", str31, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "gregory" + "'", str40, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime44);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertNotNull(chronology46);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        java.util.GregorianCalendar gregorianCalendar12 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int13 = gregorianCalendar12.getWeeksInWeekYear();
        java.lang.String str14 = gregorianCalendar12.getCalendarType();
        java.time.ZonedDateTime zonedDateTime15 = gregorianCalendar12.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime17 = zonedDateTime15.minusMonths((long) 10);
        java.time.ZonedDateTime zonedDateTime19 = zonedDateTime17.minusHours((long) 9);
        java.time.ZoneOffset zoneOffset20 = zonedDateTime17.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime21 = java.time.ZonedDateTime.of((-32769), 9, (int) '+', 241, (int) '/', 0, 45, (java.time.ZoneId) zoneOffset20);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 43");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "gregory" + "'", str14, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNotNull(zoneOffset20);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, false);
        char[] charArray4 = new char[] {};
        java.nio.CharBuffer charBuffer5 = java.nio.CharBuffer.wrap(charArray4);
        printStream3.print(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            printStream3.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertNotNull(charBuffer5);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.nio.charset.Charset charset0 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder1 = charset0.newDecoder();
        java.nio.charset.Charset charset2 = java.nio.charset.Charset.defaultCharset();
        boolean boolean3 = charset0.contains(charset2);
        java.nio.charset.CharsetEncoder charsetEncoder4 = charset0.newEncoder();
        char[] charArray5 = new char[] {};
        java.nio.CharBuffer charBuffer6 = java.nio.CharBuffer.wrap(charArray5);
        java.nio.ByteBuffer byteBuffer7 = charsetEncoder4.encode(charBuffer6);
        java.nio.CharBuffer charBuffer8 = charBuffer6.slice();
        java.nio.charset.Charset charset9 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder10 = charset9.newDecoder();
        java.nio.charset.Charset charset11 = java.nio.charset.Charset.defaultCharset();
        boolean boolean12 = charset9.contains(charset11);
        java.nio.charset.CharsetEncoder charsetEncoder13 = charset9.newEncoder();
        byte[] byteArray14 = charsetEncoder13.replacement();
        java.nio.charset.Charset charset15 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder16 = charset15.newDecoder();
        float float17 = charsetDecoder16.maxCharsPerByte();
        float float18 = charsetDecoder16.averageCharsPerByte();
        java.nio.charset.CodingErrorAction codingErrorAction19 = charsetDecoder16.unmappableCharacterAction();
        java.nio.charset.CharsetEncoder charsetEncoder20 = charsetEncoder13.onUnmappableCharacter(codingErrorAction19);
        java.nio.charset.Charset charset21 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder22 = charset21.newDecoder();
        java.nio.charset.Charset charset23 = java.nio.charset.Charset.defaultCharset();
        boolean boolean24 = charset21.contains(charset23);
        java.nio.charset.CharsetEncoder charsetEncoder25 = charset21.newEncoder();
        byte[] byteArray26 = charsetEncoder25.replacement();
        java.nio.charset.CharsetEncoder charsetEncoder27 = charsetEncoder13.replaceWith(byteArray26);
        java.nio.charset.Charset charset28 = java.nio.charset.Charset.defaultCharset();
        java.nio.charset.CharsetDecoder charsetDecoder29 = charset28.newDecoder();
        java.nio.charset.Charset charset30 = java.nio.charset.Charset.defaultCharset();
        boolean boolean31 = charset28.contains(charset30);
        java.nio.charset.CharsetEncoder charsetEncoder32 = charset28.newEncoder();
        char[] charArray33 = new char[] {};
        java.nio.CharBuffer charBuffer34 = java.nio.CharBuffer.wrap(charArray33);
        java.nio.ByteBuffer byteBuffer35 = charsetEncoder32.encode(charBuffer34);
        java.nio.CharBuffer charBuffer36 = charBuffer34.slice();
        java.nio.CharBuffer charBuffer37 = charBuffer34.compact();
        java.nio.CharBuffer charBuffer38 = charBuffer34.duplicate();
        java.nio.ByteBuffer byteBuffer39 = charsetEncoder13.encode(charBuffer34);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.CharBuffer charBuffer42 = charBuffer6.append((java.lang.CharSequence) charBuffer34, (int) '+', 10800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset0);
        org.junit.Assert.assertNotNull(charsetDecoder1);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(charBuffer8);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(charsetDecoder10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(charsetEncoder13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[63]");
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(charsetDecoder16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(codingErrorAction19);
        org.junit.Assert.assertNotNull(charsetEncoder20);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(charsetDecoder22);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charsetEncoder25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[63]");
        org.junit.Assert.assertNotNull(charsetEncoder27);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(charsetDecoder29);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(charsetEncoder32);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[]");
        org.junit.Assert.assertNotNull(charBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(charBuffer36);
        org.junit.Assert.assertNotNull(charBuffer37);
        org.junit.Assert.assertNotNull(charBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer39);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.util.stream.LongStream longStream2 = java.util.stream.LongStream.rangeClosed((long) 5, (long) 'a');
        java.util.OptionalLong optionalLong3 = longStream2.min();
        // The following exception was thrown during execution in test generation
        try {
            java.util.OptionalLong optionalLong4 = longStream2.findFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longStream2);
        org.junit.Assert.assertNotNull(optionalLong3);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean2 = weeks0.equals((java.lang.Object) timeUnit1);
        org.joda.time.Weeks weeks3 = weeks0.negated();
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.ONE;
        java.util.concurrent.TimeUnit timeUnit5 = java.util.concurrent.TimeUnit.NANOSECONDS;
        boolean boolean6 = weeks4.equals((java.lang.Object) timeUnit5);
        org.joda.time.Weeks weeks7 = weeks4.negated();
        org.joda.time.Weeks weeks8 = weeks3.minus(weeks7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((java.lang.Object) weeks3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.Weeks");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(timeUnit1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(timeUnit5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks8);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.time.LocalTime localTime4 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime5 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime4);
        java.time.temporal.ChronoField chronoField6 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime8 = localTime4.with((java.time.temporal.TemporalField) chronoField6, (long) (short) 1);
        java.time.Duration duration10 = java.time.Duration.ofMinutes((long) 3);
        java.time.LocalTime localTime11 = localTime4.minus((java.time.temporal.TemporalAmount) duration10);
        java.time.Duration duration13 = duration10.multipliedBy((long) (byte) -1);
        java.time.temporal.ChronoField chronoField14 = java.time.temporal.ChronoField.INSTANT_SECONDS;
        java.time.temporal.TemporalUnit temporalUnit15 = chronoField14.getRangeUnit();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = duration13.get(temporalUnit15);
            org.junit.Assert.fail("Expected exception of type java.time.temporal.UnsupportedTemporalTypeException; message: Unsupported unit: Forever");
        } catch (java.time.temporal.UnsupportedTemporalTypeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + chronoField6 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField6.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + chronoField14 + "' != '" + java.time.temporal.ChronoField.INSTANT_SECONDS + "'", chronoField14.equals(java.time.temporal.ChronoField.INSTANT_SECONDS));
        org.junit.Assert.assertTrue("'" + temporalUnit15 + "' != '" + java.time.temporal.ChronoUnit.FOREVER + "'", temporalUnit15.equals(java.time.temporal.ChronoUnit.FOREVER));
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            printStream3.print(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.util.function.Function<org.joda.time.DateTimeFieldType, org.joda.time.DateTimeFieldType> dateTimeFieldTypeFunction0 = java.util.function.Function.identity();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeFunction0);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Hours hours1 = org.joda.time.Hours.MIN_VALUE;
        boolean boolean2 = hours0.isGreaterThan(hours1);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 3, chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((java.lang.Object) dateTime9, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime9.toMutableDateTime();
        org.joda.time.Days days14 = org.joda.time.Days.ONE;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadablePeriod) days14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 3, chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfYear();
        org.joda.time.Interval interval20 = property19.toInterval();
        mutableInterval15.setInterval((org.joda.time.ReadableInterval) interval20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 3, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfYear();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((java.lang.Object) dateTime24, chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime24.toMutableDateTime();
        org.joda.time.Days days29 = org.joda.time.Days.ONE;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadablePeriod) days29);
        mutableInterval15.setInterval((org.joda.time.ReadableInterval) mutableInterval30);
        long long32 = mutableInterval30.toDurationMillis();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) 0, chronology34);
        org.joda.time.Chronology chronology36 = localTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.weekyearOfCentury();
        org.joda.time.DurationField durationField38 = chronology36.weekyears();
        org.joda.time.DurationField durationField39 = chronology36.seconds();
        org.joda.time.Chronology chronology40 = chronology36.withUTC();
        org.joda.time.DateTimeField dateTimeField41 = chronology36.hourOfDay();
        mutableInterval30.setChronology(chronology36);
        org.joda.time.DateTimeField dateTimeField43 = chronology36.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(574, 365, (int) (byte) 100, 0, 0, 306, (int) 'a', chronology36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 306 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 86400000L + "'", long32 == 86400000L);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField43);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.util.Optional<java.lang.Exception> exceptionOptional0 = java.util.Optional.empty();
        java.lang.String str1 = exceptionOptional0.toString();
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.now();
        java.time.temporal.ChronoField chronoField3 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.chrono.ChronoLocalDateTime<java.time.LocalDate> localDateChronoLocalDateTime5 = localDateTime2.with((java.time.temporal.TemporalField) chronoField3, (long) 10);
        java.time.LocalDateTime localDateTime7 = localDateTime2.withDayOfYear((int) '/');
        boolean boolean8 = exceptionOptional0.equals((java.lang.Object) localDateTime7);
        java.time.LocalTime localTime13 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime14 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime13);
        java.time.LocalTime localTime19 = java.time.LocalTime.of((int) (short) 1, (int) (short) 0, 1, (int) (short) 1);
        java.time.LocalTime localTime20 = java.time.LocalTime.from((java.time.temporal.TemporalAccessor) localTime19);
        java.time.temporal.ChronoField chronoField21 = java.time.temporal.ChronoField.NANO_OF_DAY;
        java.time.LocalTime localTime23 = localTime19.with((java.time.temporal.TemporalField) chronoField21, (long) (short) 1);
        long long24 = localTime13.getLong((java.time.temporal.TemporalField) chronoField21);
        java.time.LocalTime localTime26 = localTime13.withSecond((int) (short) 1);
        java.time.temporal.ChronoField chronoField27 = java.time.temporal.ChronoField.SECOND_OF_DAY;
        java.time.temporal.ValueRange valueRange28 = localTime26.range((java.time.temporal.TemporalField) chronoField27);
        java.time.Duration duration30 = java.time.Duration.ofSeconds((long) 0);
        java.time.LocalTime localTime31 = localTime26.plus((java.time.temporal.TemporalAmount) duration30);
        java.time.LocalDateTime localDateTime32 = localDateTime7.plus((java.time.temporal.TemporalAmount) duration30);
        java.time.format.FormatStyle formatStyle33 = java.time.format.FormatStyle.LONG;
        java.time.format.DateTimeFormatter dateTimeFormatter34 = java.time.format.DateTimeFormatter.ofLocalizedTime(formatStyle33);
        boolean boolean35 = localDateTime7.equals((java.lang.Object) dateTimeFormatter34);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime37 = localDateTime7.withMonth(365);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 365");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(exceptionOptional0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Optional.empty" + "'", str1, "Optional.empty");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + chronoField3 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField3.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localDateChronoLocalDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + chronoField21 + "' != '" + java.time.temporal.ChronoField.NANO_OF_DAY + "'", chronoField21.equals(java.time.temporal.ChronoField.NANO_OF_DAY));
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3601000000001L + "'", long24 == 3601000000001L);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + chronoField27 + "' != '" + java.time.temporal.ChronoField.SECOND_OF_DAY + "'", chronoField27.equals(java.time.temporal.ChronoField.SECOND_OF_DAY));
        org.junit.Assert.assertNotNull(valueRange28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + formatStyle33 + "' != '" + java.time.format.FormatStyle.LONG + "'", formatStyle33.equals(java.time.format.FormatStyle.LONG));
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = property2.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = property2.addToCopy(21);
        org.joda.time.LocalDateTime localDateTime7 = property2.roundHalfCeilingCopy();
        java.time.OffsetDateTime offsetDateTime8 = java.time.OffsetDateTime.now();
        java.time.temporal.ChronoField chronoField9 = java.time.temporal.ChronoField.HOUR_OF_DAY;
        boolean boolean10 = offsetDateTime8.isSupported((java.time.temporal.TemporalField) chronoField9);
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.lang.String str13 = chronoField9.getDisplayName(locale11);
        java.lang.String str14 = property2.getAsShortText(locale11);
        java.lang.String str15 = property2.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(offsetDateTime8);
        org.junit.Assert.assertTrue("'" + chronoField9 + "' != '" + java.time.temporal.ChronoField.HOUR_OF_DAY + "'", chronoField9.equals(java.time.temporal.ChronoField.HOUR_OF_DAY));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "German" + "'", str12, "German");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Stunde" + "'", str13, "Stunde");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "22" + "'", str14, "22");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "22" + "'", str15, "22");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.io.OutputStream outputStream0 = null;
        java.io.FilterOutputStream filterOutputStream1 = new java.io.FilterOutputStream(outputStream0);
        java.io.PrintStream printStream3 = new java.io.PrintStream((java.io.OutputStream) filterOutputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            printStream3.println(4096);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.DateTime dateTime5 = interval4.getEnd();
        org.joda.time.DateTime.Property property6 = dateTime5.millisOfDay();
        org.joda.time.DateTime.Property property7 = dateTime5.era();
        org.joda.time.DateTime dateTime10 = dateTime5.withDurationAdded(7L, 31);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.months();
        long long5 = durationField2.add((long) 57, (int) '+');
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 105062400057L + "'", long5 == 105062400057L);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        gregorianCalendar5.set((int) ':', 3, 256, 5, 17, 3600000);
        int int13 = gregorianCalendar5.getWeekYear();
        int int14 = gregorianCalendar5.getFirstDayOfWeek();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.fromCalendarFields((java.util.Calendar) gregorianCalendar5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withSecondOfMinute(241);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 241 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 59 + "'", int13 == 59);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration2.toPeriodTo(readableInstant3, periodType4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(readableInstant6, readableInstant7);
        long long9 = duration8.getMillis();
        boolean boolean10 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 3, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) dateTime13, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime13.toMutableDateTime();
        mutableDateTime17.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.year();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.weekyear();
        boolean boolean23 = duration2.equals((java.lang.Object) mutableDateTime17);
        mutableDateTime17.addMonths((int) ' ');
        mutableDateTime17.add((long) (byte) 10);
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        org.joda.time.Period period29 = period28.normalizedStandard();
        org.joda.time.Period period31 = period28.plusHours(2);
        java.time.chrono.IsoEra isoEra32 = java.time.chrono.IsoEra.CE;
        boolean boolean33 = period31.equals((java.lang.Object) isoEra32);
        int int34 = period31.getMinutes();
        mutableDateTime17.add((org.joda.time.ReadablePeriod) period31);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone38);
        long long42 = dateTimeZone38.convertLocalToUTC((long) 3, false);
        long long45 = dateTimeZone38.convertLocalToUTC(0L, true);
        mutableDateTime17.setZoneRetainFields(dateTimeZone38);
        java.lang.String str47 = dateTimeZone38.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology48 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField49 = ethiopicChronology48.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone50 = ethiopicChronology48.getZone();
        org.joda.time.DateTimeField dateTimeField51 = ethiopicChronology48.era();
        org.joda.time.DateTimeField dateTimeField52 = ethiopicChronology48.secondOfDay();
        org.joda.time.DateTimeField dateTimeField53 = ethiopicChronology48.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long58 = ethiopicChronology48.getDateTimeMillis((int) 'a', 16, 1728000, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + isoEra32 + "' != '" + java.time.chrono.IsoEra.CE + "'", isoEra32.equals(java.time.chrono.IsoEra.CE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3L + "'", long42 == 3L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Etc/UTC" + "'", str47, "Etc/UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        // The following exception was thrown during execution in test generation
        try {
            java.time.Period period1 = java.time.Period.parse((java.lang.CharSequence) "java.util.GregorianCalendar[time=-51016611000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=353,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=126,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=10,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text cannot be parsed to a Period");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.time.format.DateTimeFormatter dateTimeFormatter0 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.lang.String str1 = dateTimeFormatter0.toString();
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.now();
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery3 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period4 = localDateTime2.query(periodTemporalQuery3);
        java.text.Format format5 = dateTimeFormatter0.toFormat(periodTemporalQuery3);
        java.time.chrono.Chronology chronology6 = dateTimeFormatter0.getChronology();
        java.time.format.DateTimeFormatter dateTimeFormatter7 = java.time.format.DateTimeFormatter.ISO_DATE;
        java.lang.String str8 = dateTimeFormatter7.toString();
        java.time.LocalDateTime localDateTime9 = java.time.LocalDateTime.now();
        java.time.temporal.TemporalQuery<java.time.Period> periodTemporalQuery10 = java.time.format.DateTimeFormatter.parsedExcessDays();
        java.time.Period period11 = localDateTime9.query(periodTemporalQuery10);
        java.text.Format format12 = dateTimeFormatter7.toFormat(periodTemporalQuery10);
        java.time.chrono.Chronology chronology13 = dateTimeFormatter7.getChronology();
        int int14 = chronology6.compareTo(chronology13);
        java.util.List<java.time.chrono.Era> eraList15 = chronology13.eras();
        java.util.List<java.time.chrono.Era> eraList16 = chronology13.eras();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]" + "'", str1, "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(periodTemporalQuery3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(format5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]" + "'", str8, "ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))[Offset(+HH:MM:ss,'Z')]");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(periodTemporalQuery10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(format12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(eraList15);
        org.junit.Assert.assertNotNull(eraList16);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 3, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfYear();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        org.joda.time.DateTime dateTime7 = property3.addToCopy((long) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withYear(4);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 3, chronology11);
        org.joda.time.Period period13 = org.joda.time.Period.ZERO;
        org.joda.time.Period period14 = period13.normalizedStandard();
        org.joda.time.Period period16 = period14.minusMinutes((int) ' ');
        org.joda.time.Period period18 = period16.minusMonths((int) (byte) 0);
        org.joda.time.PeriodType periodType19 = period18.getPeriodType();
        org.joda.time.DateTime dateTime20 = dateTime12.minus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime22 = dateTime9.withTimeAtStartOfDay();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) 1970, dateTimeZone27);
        long long31 = dateTimeZone27.convertLocalToUTC((long) 3, false);
        long long33 = dateTimeZone24.getMillisKeepLocal(dateTimeZone27, (long) ':');
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((java.lang.Object) dateTime9, dateTimeZone27);
        int int35 = dateTime34.getCenturyOfEra();
        org.joda.time.DateTime dateTime37 = dateTime34.withDayOfYear(365);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) 3, chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.dayOfYear();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((java.lang.Object) dateTime40, chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime40.toMutableDateTime();
        mutableDateTime44.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime44.dayOfWeek();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime44.year();
        java.util.TimeZone timeZone49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        mutableDateTime44.setZone(dateTimeZone50);
        java.util.Locale locale53 = java.util.Locale.TAIWAN;
        java.lang.String str54 = dateTimeZone50.getShortName((long) 64, locale53);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) 3, chronology56);
        org.joda.time.DateTime.Property property58 = dateTime57.dayOfYear();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((java.lang.Object) dateTime57, chronology59);
        org.joda.time.MutableDateTime mutableDateTime61 = dateTime57.toMutableDateTime();
        mutableDateTime61.addYears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime61.dayOfWeek();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime61.year();
        java.util.TimeZone timeZone66 = null;
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forTimeZone(timeZone66);
        mutableDateTime61.setZone(dateTimeZone67);
        java.util.Locale locale70 = java.util.Locale.TAIWAN;
        java.lang.String str71 = dateTimeZone67.getShortName((long) 64, locale70);
        long long73 = dateTimeZone50.getMillisKeepLocal(dateTimeZone67, (long) 64);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime75 = dateTime34.toDateTime(dateTimeZone50);
        org.joda.time.LocalDate localDate76 = org.joda.time.LocalDate.now(dateTimeZone50);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate78 = localDate76.withWeekOfWeekyear(197);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 197 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 3L + "'", long31 == 3L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 58L + "'", long33 == 58L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00" + "'", str54, "+00:00");
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "+00:00" + "'", str71, "+00:00");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 64L + "'", long73 == 64L);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(localDate76);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.util.Date date0 = new java.util.Date();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromDateFields(date0);
        int int2 = date0.getDay();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 09:34:57 UTC 2022");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.util.GregorianCalendar gregorianCalendar5 = new java.util.GregorianCalendar(12, 4096, 7, (-1), (int) (short) 10);
        int int6 = gregorianCalendar5.getWeeksInWeekYear();
        java.lang.String str7 = gregorianCalendar5.getCalendarType();
        java.time.ZonedDateTime zonedDateTime8 = gregorianCalendar5.toZonedDateTime();
        java.time.ZonedDateTime zonedDateTime10 = zonedDateTime8.minusMonths((long) 10);
        java.time.ZonedDateTime zonedDateTime12 = zonedDateTime10.withNano(52);
        java.lang.String str13 = zonedDateTime12.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gregory" + "'", str7, "gregory");
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0352-07-07T23:10:00.000000052Z[Etc/UTC]" + "'", str13, "0352-07-07T23:10:00.000000052Z[Etc/UTC]");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        org.joda.time.DurationField durationField7 = chronology3.weeks();
        long long10 = durationField7.getMillis(306, (long) 2012);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 185068800000L + "'", long10 == 185068800000L);
    }
}
