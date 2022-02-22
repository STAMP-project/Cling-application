import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight9, readableDuration10);
        org.joda.time.Duration duration12 = period6.toDurationTo((org.joda.time.ReadableInstant) dateMidnight9);
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtCurrentTime(dateTimeZone16);
        int int18 = instant13.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 'a', dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 'a', dateTimeZone23);
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate21, (org.joda.time.ReadablePartial) localDate24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        boolean boolean27 = localDate24.isSupported(dateTimeFieldType26);
        org.joda.time.Chronology chronology28 = localDate24.getChronology();
        org.joda.time.DateTime dateTime29 = dateTime17.toDateTime(chronology28);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, (org.joda.time.ReadableInstant) dateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime17", (instant13.compareTo(dateTime17) == 0) == instant13.equals(dateTime17));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtCurrentTime(dateTimeZone4);
        int int6 = instant1.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        boolean boolean15 = localDate12.isSupported(dateTimeFieldType14);
        org.joda.time.Chronology chronology16 = localDate12.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime5.toDateTime(chronology16);
        boolean boolean18 = durationFieldType0.isSupported(chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime17", (dateTime5.compareTo(dateTime17) == 0) == dateTime5.equals(dateTime17));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        int int13 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime15 = dateTime12.withSecondOfMinute(0);
        org.joda.time.Instant instant16 = dateTime12.toInstant();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight22, readableDuration23);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType26 = periodType25.withSecondsRemoved();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight19, (org.joda.time.ReadableInstant) dateMidnight22, periodType26);
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime12, periodType26);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 'a', dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 'a', dateTimeZone33);
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate31, (org.joda.time.ReadablePartial) localDate34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = null;
        boolean boolean37 = localDate34.isSupported(dateTimeFieldType36);
        org.joda.time.Chronology chronology38 = localDate34.getChronology();
        org.joda.time.DateTime dateTime39 = dateTime12.withChronology(chronology38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTimeAtCurrentTime(dateTimeZone9);
        int int11 = instant6.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.withSecondOfMinute(0);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtCurrentTime(dateTimeZone17);
        int int19 = instant14.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime21 = dateTime18.withSecondOfMinute(0);
        org.joda.time.Instant instant22 = dateTime18.toInstant();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(1L, dateTimeZone27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight28, readableDuration29);
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType32 = periodType31.withSecondsRemoved();
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight25, (org.joda.time.ReadableInstant) dateMidnight28, periodType32);
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime18, periodType32);
        org.joda.time.Interval interval35 = new org.joda.time.Interval((org.joda.time.ReadableInstant) instant0, (org.joda.time.ReadablePeriod) period34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime10", (instant6.compareTo(dateTime10) == 0) == instant6.equals(dateTime10));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DurationField durationField17 = chronology15.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime4.toDateTime();
        boolean boolean13 = dateTime11.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        int int13 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime15 = dateTime12.withSecondOfMinute(0);
        org.joda.time.Instant instant16 = dateTime12.toInstant();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight22, readableDuration23);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType26 = periodType25.withSecondsRemoved();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight19, (org.joda.time.ReadableInstant) dateMidnight22, periodType26);
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime12, periodType26);
        org.joda.time.DateTime dateTime30 = dateTime4.withSecondOfMinute((int) '#');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime12", (instant0.compareTo(dateTime12) == 0) == instant0.equals(dateTime12));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        int int13 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime15 = dateTime12.withSecondOfMinute(0);
        org.joda.time.Instant instant16 = dateTime12.toInstant();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight22, readableDuration23);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType26 = periodType25.withSecondsRemoved();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight19, (org.joda.time.ReadableInstant) dateMidnight22, periodType26);
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime12, periodType26);
        org.joda.time.Instant instant29 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime30 = instant29.toMutableDateTime();
        org.joda.time.Duration duration31 = period28.toDurationFrom((org.joda.time.ReadableInstant) mutableDateTime30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant8", (dateTime4.compareTo(instant8) == 0) == dateTime4.equals(instant8));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime4.toDateTime();
        org.joda.time.DateTime.Property property12 = dateTime4.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        java.util.Date date2 = mutableDateTime1.toDate();
        long long3 = date2.getTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime4.toDateTime();
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime12", (instant0.compareTo(dateTime12) == 0) == instant0.equals(dateTime12));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime4.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime13", (instant0.compareTo(dateTime13) == 0) == instant0.equals(dateTime13));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 'a', dateTimeZone13);
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate11, (org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(1L, dateTimeZone17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight18, readableDuration19);
        org.joda.time.Duration duration21 = period15.toDurationTo((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.Instant instant22 = instant8.minus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration21);
        long long24 = duration21.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime4.era();
        org.joda.time.DateTime dateTime18 = property17.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setSecondOfMinute(52);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = dateMidnight17.getZone();
        org.joda.time.DateTime dateTime19 = localDate11.toDateTimeAtMidnight(dateTimeZone18);
        boolean boolean21 = dateTimeZone18.isStandardOffset((long) (byte) 10);
        mutableDateTime1.setZone(dateTimeZone18);
        org.joda.time.Instant instant23 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate25.toDateTimeAtCurrentTime(dateTimeZone26);
        int int28 = instant23.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime30 = dateTime27.withSecondOfMinute(0);
        org.joda.time.Instant instant31 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 'a', dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 'a', dateTimeZone36);
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate34, (org.joda.time.ReadablePartial) localDate37);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(1L, dateTimeZone40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight41, readableDuration42);
        org.joda.time.Duration duration44 = period38.toDurationTo((org.joda.time.ReadableInstant) dateMidnight41);
        org.joda.time.Instant instant45 = instant31.minus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableDuration) duration44);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) mutablePeriod46, (int) '4');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant23 and dateTime27", (instant23.compareTo(dateTime27) == 0) == instant23.equals(dateTime27));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        int int10 = instant5.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime12 = dateTime9.withSecondOfMinute(0);
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 'a', dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 'a', dateTimeZone18);
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate16, (org.joda.time.ReadablePartial) localDate19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(1L, dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight23, readableDuration24);
        org.joda.time.Duration duration26 = period20.toDurationTo((org.joda.time.ReadableInstant) dateMidnight23);
        org.joda.time.Instant instant27 = instant13.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight4.withDurationAdded((org.joda.time.ReadableDuration) duration26, 11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime9", (instant5.compareTo(dateTime9) == 0) == instant5.equals(dateTime9));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(1L, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateMidnight13.getZone();
        int int16 = dateTimeZone14.getStandardOffset((long) 32769);
        java.util.Locale locale18 = java.util.Locale.US;
        java.lang.String str19 = dateTimeZone14.getShortName((long) 1970, locale18);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.now(dateTimeZone14);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime7.toMutableDateTime(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.LocalDate localDate14 = localDate8.withDayOfMonth(13);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTime dateTime16 = dateMidnight4.toDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and dateTime16", (dateMidnight4.compareTo(dateTime16) == 0) == dateMidnight4.equals(dateTime16));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 'a', dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) localDate6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight10, readableDuration11);
        org.joda.time.Duration duration13 = period7.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Instant instant14 = instant0.minus((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate17.toDateTimeAtCurrentTime(dateTimeZone18);
        int int20 = instant15.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology21);
        org.joda.time.DateTimeField dateTimeField24 = localDate22.getField(1);
        java.lang.String str25 = dateTimeField24.getName();
        int int26 = instant15.get(dateTimeField24);
        org.joda.time.Instant instant28 = instant15.plus((long) 'a');
        org.joda.time.Interval interval29 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration13, (org.joda.time.ReadableInstant) instant15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime19", (instant0.compareTo(dateTime19) == 0) == instant0.equals(dateTime19));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime4.era();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.DateTime dateTime12 = dateTime10.withHourOfDay(5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime4.era();
        org.joda.time.DateTime dateTime18 = property17.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 'a', dateTimeZone13);
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate11, (org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(1L, dateTimeZone17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight18, readableDuration19);
        org.joda.time.Duration duration21 = period15.toDurationTo((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.Instant instant22 = instant8.minus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate25.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 'a', dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 'a', dateTimeZone32);
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate30, (org.joda.time.ReadablePartial) localDate33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(1L, dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight37, readableDuration38);
        org.joda.time.Duration duration40 = period34.toDurationTo((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(1L, dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(1L, dateTimeZone45);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight46, readableDuration47);
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType50 = periodType49.withSecondsRemoved();
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight43, (org.joda.time.ReadableInstant) dateMidnight46, periodType50);
        org.joda.time.PeriodType periodType52 = periodType50.withWeeksRemoved();
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableDuration) duration40, periodType50);
        boolean boolean54 = duration21.isShorterThan((org.joda.time.ReadableDuration) duration40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime3 = property2.withMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 'a', dateTimeZone15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate13, (org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateMidnight22.getZone();
        org.joda.time.DateTime dateTime24 = localDate16.toDateTimeAtMidnight(dateTimeZone23);
        boolean boolean26 = dateTimeZone23.isStandardOffset((long) (byte) 10);
        org.joda.time.DateTime dateTime27 = dateTime10.toDateTime(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(1L, dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateMidnight9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime3.toDateTime(dateTimeZone10);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTime();
        mutableDateTime13.setSecondOfMinute((int) (byte) 1);
        mutableDateTime13.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime18 = mutableDateTime13.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 'a', dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 'a', dateTimeZone23);
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate21, (org.joda.time.ReadablePartial) localDate24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(1L, dateTimeZone27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight28, readableDuration29);
        org.joda.time.Duration duration31 = period25.toDurationTo((org.joda.time.ReadableInstant) dateMidnight28);
        mutableDateTime13.add((org.joda.time.ReadableDuration) duration31, 53221515);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableDuration) duration31, periodType34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant12", (dateTime11.compareTo(instant12) == 0) == dateTime11.equals(instant12));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 'a', dateTimeZone13);
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate11, (org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(1L, dateTimeZone17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight18, readableDuration19);
        org.joda.time.Duration duration21 = period15.toDurationTo((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.Instant instant22 = instant8.minus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.MutablePeriod mutablePeriod24 = mutablePeriod23.toMutablePeriod();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 'a', dateTimeZone15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate13, (org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight20, readableDuration21);
        org.joda.time.Duration duration23 = period17.toDurationTo((org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(1L, dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(1L, dateTimeZone28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight29, readableDuration30);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType33 = periodType32.withSecondsRemoved();
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight26, (org.joda.time.ReadableInstant) dateMidnight29, periodType33);
        org.joda.time.PeriodType periodType35 = periodType33.withWeeksRemoved();
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration23, periodType33);
        org.joda.time.Interval interval37 = new org.joda.time.Interval(readableInstant6, (org.joda.time.ReadableDuration) duration23);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = localDate39.toDateTimeAtCurrentTime(dateTimeZone40);
        org.joda.time.DateMidnight dateMidnight42 = dateTime41.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(1L, dateTimeZone44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone48 = dateMidnight47.getZone();
        org.joda.time.DateTime dateTime49 = dateTime41.toDateTime(dateTimeZone48);
        org.joda.time.Interval interval50 = interval37.withEnd((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(1L, dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(1L, dateTimeZone55);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight56, readableDuration57);
        org.joda.time.PeriodType periodType59 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType60 = periodType59.withSecondsRemoved();
        org.joda.time.Period period61 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight53, (org.joda.time.ReadableInstant) dateMidnight56, periodType60);
        org.joda.time.PeriodType periodType62 = periodType60.withWeeksRemoved();
        org.joda.time.Period period63 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime41, periodType62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime10", (instant0.compareTo(dateTime10) == 0) == instant0.equals(dateTime10));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeField dateTimeField9 = localDate7.getField(1);
        java.lang.String str10 = dateTimeField9.getName();
        int int11 = instant0.get(dateTimeField9);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeField9.getAsText((long) (short) 1, locale13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        int int13 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime15 = dateTime12.withSecondOfMinute(0);
        org.joda.time.Instant instant16 = dateTime12.toInstant();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight22, readableDuration23);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType26 = periodType25.withSecondsRemoved();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight19, (org.joda.time.ReadableInstant) dateMidnight22, periodType26);
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime12, periodType26);
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((java.lang.Object) dateTime12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime12 = instant11.toMutableDateTime();
        mutableDateTime12.setSecondOfMinute((int) (byte) 1);
        mutableDateTime12.setSecondOfMinute(52);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 'a', dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 'a', dateTimeZone21);
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate19, (org.joda.time.ReadablePartial) localDate22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(1L, dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = dateMidnight28.getZone();
        org.joda.time.DateTime dateTime30 = localDate22.toDateTimeAtMidnight(dateTimeZone29);
        boolean boolean32 = dateTimeZone29.isStandardOffset((long) (byte) 10);
        mutableDateTime12.setZone(dateTimeZone29);
        org.joda.time.DateTime dateTime34 = dateTime10.withZoneRetainFields(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate5.isSupported(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Interval interval10 = localDate5.toInterval(dateTimeZone9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtCurrentTime(dateTimeZone14);
        int int16 = instant11.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime18 = dateTime15.withSecondOfMinute(0);
        org.joda.time.Instant instant19 = dateTime15.toInstant();
        org.joda.time.DateTime dateTime21 = dateTime15.plusMonths((int) '4');
        org.joda.time.DateTime dateTime22 = dateTime15.toDateTime();
        boolean boolean23 = interval10.contains((org.joda.time.ReadableInstant) dateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime15", (instant11.compareTo(dateTime15) == 0) == instant11.equals(dateTime15));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        int int13 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime15 = dateTime12.withSecondOfMinute(0);
        org.joda.time.Instant instant16 = dateTime12.toInstant();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight22, readableDuration23);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType26 = periodType25.withSecondsRemoved();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight19, (org.joda.time.ReadableInstant) dateMidnight22, periodType26);
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime12, periodType26);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 'a', dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 'a', dateTimeZone33);
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate31, (org.joda.time.ReadablePartial) localDate34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = null;
        boolean boolean37 = localDate34.isSupported(dateTimeFieldType36);
        org.joda.time.Chronology chronology38 = localDate34.getChronology();
        org.joda.time.DurationField durationField39 = chronology38.minutes();
        org.joda.time.DurationFieldType durationFieldType40 = durationField39.getType();
        org.joda.time.Period period42 = period28.withFieldAdded(durationFieldType40, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime3 = property2.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 1);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate5.toDateTimeAtCurrentTime(dateTimeZone6);
        int int8 = instant3.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime10 = dateTime7.withSecondOfMinute(0);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtCurrentTime(dateTimeZone14);
        int int16 = instant11.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime18 = dateTime15.withSecondOfMinute(0);
        org.joda.time.Instant instant19 = dateTime15.toInstant();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight25, readableDuration26);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType29 = periodType28.withSecondsRemoved();
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight22, (org.joda.time.ReadableInstant) dateMidnight25, periodType29);
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime15, periodType29);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.weeks();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime7, periodType32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime15", (instant3.compareTo(dateTime15) == 0) == instant3.equals(dateTime15));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime4.era();
        org.joda.time.DateTime dateTime18 = dateTime4.withTimeAtStartOfDay();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(locale19);
        int int21 = calendar20.getFirstDayOfWeek();
        boolean boolean22 = dateTime4.equals((java.lang.Object) calendar20);
        calendar20.set(709, 234, (int) (byte) 0, 53221161, 70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 'a', dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight14, readableDuration15);
        org.joda.time.Duration duration17 = period11.toDurationTo((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(1L, dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight23, readableDuration24);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType27 = periodType26.withSecondsRemoved();
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight20, (org.joda.time.ReadableInstant) dateMidnight23, periodType27);
        org.joda.time.PeriodType periodType29 = periodType27.withWeeksRemoved();
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration17, periodType27);
        org.joda.time.Interval interval31 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadableDuration) duration17);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDate33.toDateTimeAtCurrentTime(dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight36 = dateTime35.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(1L, dateTimeZone38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone42 = dateMidnight41.getZone();
        org.joda.time.DateTime dateTime43 = dateTime35.toDateTime(dateTimeZone42);
        org.joda.time.Interval interval44 = interval31.withEnd((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Instant instant45 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(chronology46);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = localDate47.toDateTimeAtCurrentTime(dateTimeZone48);
        int int50 = instant45.compareTo((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) 'a', dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((long) 'a', dateTimeZone55);
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate53, (org.joda.time.ReadablePartial) localDate56);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = null;
        boolean boolean59 = localDate56.isSupported(dateTimeFieldType58);
        org.joda.time.Chronology chronology60 = localDate56.getChronology();
        org.joda.time.DateTime dateTime61 = dateTime49.toDateTime(chronology60);
        org.joda.time.DateTime.Property property62 = dateTime49.era();
        org.joda.time.DateTime dateTime63 = dateTime49.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime65 = dateTime49.plusMillis(100);
        boolean boolean66 = interval31.isBefore((org.joda.time.ReadableInstant) dateTime49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant45", (dateTime4.compareTo(instant45) == 0) == dateTime4.equals(instant45));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property6 = dateMidnight2.dayOfMonth();
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight2.plusWeeks(17);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(1L, dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = dateMidnight20.getZone();
        int int23 = dateTimeZone21.getStandardOffset((long) 32769);
        java.util.Locale locale25 = java.util.Locale.US;
        java.lang.String str26 = dateTimeZone21.getShortName((long) 1970, locale25);
        org.joda.time.DateTime dateTime27 = dateMidnight15.toDateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((java.lang.Object) "52", dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(1L, dateTimeZone30);
        org.joda.time.DateMidnight.Property property32 = dateMidnight31.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight31.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property35 = dateMidnight31.dayOfMonth();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localDate37.toDateTimeAtCurrentTime(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(1L, dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight44.withField(dateTimeFieldType45, (int) 'a');
        org.joda.time.DateTime dateTime49 = dateTime39.withField(dateTimeFieldType45, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight31.withField(dateTimeFieldType45, 7);
        int int52 = dateTimeZone21.getOffset((org.joda.time.ReadableInstant) dateMidnight51);
        org.joda.time.Instant instant53 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate(chronology54);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = localDate55.toDateTimeAtCurrentTime(dateTimeZone56);
        int int58 = instant53.compareTo((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime dateTime60 = dateTime57.withSecondOfMinute(0);
        org.joda.time.Instant instant61 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate(chronology62);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = localDate63.toDateTimeAtCurrentTime(dateTimeZone64);
        int int66 = instant61.compareTo((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.DateTime dateTime68 = dateTime65.withSecondOfMinute(0);
        org.joda.time.Instant instant69 = dateTime65.toInstant();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight(1L, dateTimeZone71);
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.DateMidnight dateMidnight75 = new org.joda.time.DateMidnight(1L, dateTimeZone74);
        org.joda.time.ReadableDuration readableDuration76 = null;
        org.joda.time.Period period77 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight75, readableDuration76);
        org.joda.time.PeriodType periodType78 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType79 = periodType78.withSecondsRemoved();
        org.joda.time.Period period80 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight72, (org.joda.time.ReadableInstant) dateMidnight75, periodType79);
        org.joda.time.Period period81 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadableInstant) dateTime65, periodType79);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight11, (org.joda.time.ReadableInstant) dateMidnight51, periodType79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and instant53", (dateTime39.compareTo(instant53) == 0) == dateTime39.equals(instant53));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 'a', dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight14, readableDuration15);
        org.joda.time.Duration duration17 = period11.toDurationTo((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.Instant instant18 = instant4.minus((org.joda.time.ReadableDuration) duration17);
        mutableDateTime3.add((org.joda.time.ReadableDuration) duration17, (int) (short) 100);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant4", (mutableDateTime3.compareTo(instant4) == 0) == mutableDateTime3.equals(instant4));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime4.era();
        org.joda.time.DateTime dateTime18 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime20 = dateTime4.plusMillis(100);
        org.joda.time.DateTime.Property property21 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime22 = property21.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        int int13 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime15 = dateTime12.withSecondOfMinute(0);
        org.joda.time.Instant instant16 = dateTime12.toInstant();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight22, readableDuration23);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType26 = periodType25.withSecondsRemoved();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight19, (org.joda.time.ReadableInstant) dateMidnight22, periodType26);
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime12, periodType26);
        org.joda.time.DateTime dateTime29 = dateTime4.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime12", (instant8.compareTo(dateTime12) == 0) == instant8.equals(dateTime12));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime4.toDateTime();
        int int12 = dateTime11.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        int int10 = instant5.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.DateTimeField dateTimeField14 = localDate12.getField(1);
        java.lang.String str15 = dateTimeField14.getName();
        int int16 = instant5.get(dateTimeField14);
        org.joda.time.Instant instant18 = instant5.plus((long) 'a');
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight4, (org.joda.time.ReadableInstant) instant5);
        int int20 = period19.getSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime9", (instant5.compareTo(dateTime9) == 0) == instant5.equals(dateTime9));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight2, readableDuration3);
        int int5 = period4.size();
        java.lang.String str6 = period4.toString();
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.Period period9 = period4.withFields((org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight13, readableDuration14);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.minus((org.joda.time.ReadablePeriod) period15);
        int int17 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusYears(13);
        int int21 = localDateTime20.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str23 = dateTimeFieldType22.toString();
        org.joda.time.LocalDateTime.Property property24 = localDateTime20.property(dateTimeFieldType22);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.withWeekOfWeekyear(47);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.weeks();
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime16, (org.joda.time.ReadablePartial) localDateTime20, periodType27);
        mutablePeriod8.add((org.joda.time.ReadablePeriod) period28);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 'a', dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 'a', dateTimeZone35);
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate33, (org.joda.time.ReadablePartial) localDate36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        boolean boolean39 = localDate36.isSupported(dateTimeFieldType38);
        org.joda.time.Chronology chronology40 = localDate36.getChronology();
        org.joda.time.DurationField durationField41 = chronology40.minutes();
        java.lang.String str42 = chronology40.toString();
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) 6, chronology40);
        org.joda.time.Instant instant44 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime45 = instant44.toMutableDateTime();
        mutableDateTime45.setSecondOfMinute((int) (byte) 1);
        mutableDateTime45.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime50 = mutableDateTime45.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) 'a', dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((long) 'a', dateTimeZone55);
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate53, (org.joda.time.ReadablePartial) localDate56);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight(1L, dateTimeZone59);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight60, readableDuration61);
        org.joda.time.Duration duration63 = period57.toDurationTo((org.joda.time.ReadableInstant) dateMidnight60);
        mutableDateTime45.add((org.joda.time.ReadableDuration) duration63, 53221515);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight43.plus((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Duration duration67 = period28.toDurationTo((org.joda.time.ReadableInstant) dateMidnight43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight43", (dateMidnight2.compareTo(dateMidnight43) == 0) == dateMidnight2.equals(dateMidnight43));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeField dateTimeField9 = localDate7.getField(1);
        java.lang.String str10 = dateTimeField9.getName();
        int int11 = instant0.get(dateTimeField9);
        org.joda.time.Instant instant13 = instant0.plus((long) 'a');
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime15 = instant14.toMutableDateTime();
        mutableDateTime15.setSecondOfMinute((int) (byte) 1);
        mutableDateTime15.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime20 = mutableDateTime15.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 'a', dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 'a', dateTimeZone25);
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate23, (org.joda.time.ReadablePartial) localDate26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(1L, dateTimeZone29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight30, readableDuration31);
        org.joda.time.Duration duration33 = period27.toDurationTo((org.joda.time.ReadableInstant) dateMidnight30);
        mutableDateTime15.add((org.joda.time.ReadableDuration) duration33, 53221515);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration33, readableInstant36);
        org.joda.time.Instant instant39 = instant13.withDurationAdded((org.joda.time.ReadableDuration) duration33, 53221555);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtCurrentTime(dateTimeZone4);
        int int6 = instant1.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        boolean boolean15 = localDate12.isSupported(dateTimeFieldType14);
        org.joda.time.Chronology chronology16 = localDate12.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime5.toDateTime(chronology16);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 1, chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime5", (instant1.compareTo(dateTime5) == 0) == instant1.equals(dateTime5));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime4.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks(14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 'a', dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 'a', dateTimeZone6);
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate4, (org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(1L, dateTimeZone10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight11, readableDuration12);
        org.joda.time.Duration duration14 = period8.toDurationTo((org.joda.time.ReadableInstant) dateMidnight11);
        org.joda.time.Instant instant15 = instant1.minus((org.joda.time.ReadableDuration) duration14);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration14, (int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime();
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 'a', dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 'a', dateTimeZone24);
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate22, (org.joda.time.ReadablePartial) localDate25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(1L, dateTimeZone28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight29, readableDuration30);
        org.joda.time.Duration duration32 = period26.toDurationTo((org.joda.time.ReadableInstant) dateMidnight29);
        org.joda.time.Instant instant33 = instant19.minus((org.joda.time.ReadableDuration) duration32);
        mutableDateTime18.add((org.joda.time.ReadableDuration) duration32, (int) (short) 100);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration32, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime18", (instant1.compareTo(mutableDateTime18) == 0) == instant1.equals(mutableDateTime18));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.withField(dateTimeFieldType9, (int) 'a');
        org.joda.time.DateTime dateTime13 = dateTime3.withField(dateTimeFieldType9, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = dateMidnight18.getZone();
        org.joda.time.DateTime dateTime20 = dateTime13.withZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 'a', dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 'a', dateTimeZone25);
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate23, (org.joda.time.ReadablePartial) localDate26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        boolean boolean29 = localDate26.isSupported(dateTimeFieldType28);
        org.joda.time.Chronology chronology30 = localDate26.getChronology();
        org.joda.time.LocalDate localDate32 = localDate26.minusDays(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = localDate32.getFieldType(1);
        boolean boolean35 = dateTime13.isSupported(dateTimeFieldType34);
        org.joda.time.DateTime dateTime37 = dateTime13.minusDays(1961);
        org.joda.time.DateTime.Property property38 = dateTime37.yearOfEra();
        org.joda.time.DateTime dateTime39 = property38.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField40 = property38.getField();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 'a', dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 'a', dateTimeZone45);
        org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate43, (org.joda.time.ReadablePartial) localDate46);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        boolean boolean49 = localDate46.isSupported(dateTimeFieldType48);
        org.joda.time.Chronology chronology50 = localDate46.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.dayOfYear();
        org.joda.time.DateTimeField dateTimeField52 = chronology50.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = dateTimeField52.getType();
        org.joda.time.Instant instant55 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime56 = instant55.toMutableDateTime();
        mutableDateTime56.setSecondOfMinute((int) (byte) 1);
        mutableDateTime56.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime56.year();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime56.era();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate(chronology63);
        org.joda.time.DateTimeField dateTimeField66 = localDate64.getField(1);
        java.lang.String str68 = dateTimeField66.getAsShortText((long) '4');
        int int69 = mutableDateTime56.get(dateTimeField66);
        java.util.Locale locale71 = java.util.Locale.ITALIAN;
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight(1L, dateTimeZone73);
        org.joda.time.DateMidnight.Property property75 = dateMidnight74.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight77 = dateMidnight74.minusDays((int) 'a');
        java.util.Locale locale79 = java.util.Locale.ENGLISH;
        java.lang.String str80 = locale79.toLanguageTag();
        java.lang.String str81 = dateMidnight74.toString("+00:00", locale79);
        java.lang.String str82 = locale71.getDisplayVariant(locale79);
        java.lang.String str83 = dateTimeField66.getAsText((int) (short) 10, locale79);
        java.lang.String str84 = dateTimeField52.getAsShortText((long) 8, locale79);
        int int85 = dateTimeField40.getMaximumShortTextLength(locale79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant55", (dateTime3.compareTo(instant55) == 0) == dateTime3.equals(instant55));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime4.era();
        org.joda.time.DateTime dateTime18 = dateTime4.withTimeAtStartOfDay();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(locale19);
        int int21 = calendar20.getFirstDayOfWeek();
        boolean boolean22 = dateTime4.equals((java.lang.Object) calendar20);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 'a', dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 'a', dateTimeZone27);
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate25, (org.joda.time.ReadablePartial) localDate28);
        org.joda.time.LocalDate localDate31 = localDate25.withDayOfMonth(13);
        org.joda.time.LocalDate localDate33 = localDate25.plusWeeks(0);
        boolean boolean34 = calendar20.equals((java.lang.Object) localDate33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Instant instant6 = instant0.toInstant();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.LocalDate localDate11 = dateTime10.toLocalDate();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtCurrentTime(dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight16 = dateTime15.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateMidnight21.getZone();
        org.joda.time.DateTime dateTime23 = dateTime15.toDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = dateTime10.withZoneRetainFields(dateTimeZone22);
        org.joda.time.DateTime.Property property25 = dateTime24.monthOfYear();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate27.toDateTimeAtCurrentTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(1L, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight34.withField(dateTimeFieldType35, (int) 'a');
        org.joda.time.DateTime dateTime39 = dateTime29.withField(dateTimeFieldType35, (int) (short) 0);
        org.joda.time.DateTime dateTime41 = dateTime29.plusHours((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean43 = dateTime29.isSupported(dateTimeFieldType42);
        org.joda.time.DateTime.Property property44 = dateTime24.property(dateTimeFieldType42);
        int int45 = instant6.get(dateTimeFieldType42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime4", (instant6.compareTo(dateTime4) == 0) == instant6.equals(dateTime4));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeField dateTimeField9 = localDate7.getField(1);
        java.lang.String str10 = dateTimeField9.getName();
        int int11 = instant0.get(dateTimeField9);
        org.joda.time.Instant instant13 = instant0.plus((long) 'a');
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime15 = instant14.toMutableDateTime();
        mutableDateTime15.setSecondOfMinute((int) (byte) 1);
        mutableDateTime15.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime20 = mutableDateTime15.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 'a', dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 'a', dateTimeZone25);
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate23, (org.joda.time.ReadablePartial) localDate26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(1L, dateTimeZone29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight30, readableDuration31);
        org.joda.time.Duration duration33 = period27.toDurationTo((org.joda.time.ReadableInstant) dateMidnight30);
        mutableDateTime15.add((org.joda.time.ReadableDuration) duration33, 53221515);
        org.joda.time.Interval interval36 = new org.joda.time.Interval((org.joda.time.ReadableInstant) instant13, (org.joda.time.ReadableDuration) duration33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeField dateTimeField3 = localDate1.getField(1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate6, (org.joda.time.ReadablePartial) localDate9);
        boolean boolean11 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 'a', dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 'a', dateTimeZone19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate17, (org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate23 = localDate17.withDayOfMonth(13);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        mutablePeriod13.add((long) ' ', chronology24);
        org.joda.time.LocalDate localDate26 = localDate1.minus((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime28 = instant27.toMutableDateTime();
        mutableDateTime28.setSecondOfMinute((int) (byte) 1);
        mutableDateTime28.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime33 = mutableDateTime28.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 'a', dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) 'a', dateTimeZone38);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate36, (org.joda.time.ReadablePartial) localDate39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(1L, dateTimeZone42);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight43, readableDuration44);
        org.joda.time.Duration duration46 = period40.toDurationTo((org.joda.time.ReadableInstant) dateMidnight43);
        mutableDateTime28.add((org.joda.time.ReadableDuration) duration46, 53221515);
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration46);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate(chronology51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = localDate52.toDateTimeAtCurrentTime(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) 'a', dateTimeZone56);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) 'a', dateTimeZone59);
        org.joda.time.Period period61 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate57, (org.joda.time.ReadablePartial) localDate60);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight(1L, dateTimeZone63);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight64, readableDuration65);
        org.joda.time.Duration duration67 = period61.toDurationTo((org.joda.time.ReadableInstant) dateMidnight64);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateMidnight dateMidnight70 = new org.joda.time.DateMidnight(1L, dateTimeZone69);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.DateMidnight dateMidnight73 = new org.joda.time.DateMidnight(1L, dateTimeZone72);
        org.joda.time.ReadableDuration readableDuration74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight73, readableDuration74);
        org.joda.time.PeriodType periodType76 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType77 = periodType76.withSecondsRemoved();
        org.joda.time.Period period78 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight70, (org.joda.time.ReadableInstant) dateMidnight73, periodType77);
        org.joda.time.PeriodType periodType79 = periodType77.withWeeksRemoved();
        org.joda.time.Period period80 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadableDuration) duration67, periodType77);
        org.joda.time.Period period81 = duration67.toPeriod();
        mutableDateTime50.add((org.joda.time.ReadableDuration) duration67, 366);
        boolean boolean84 = duration46.isShorterThan((org.joda.time.ReadableDuration) duration67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant27 and mutableDateTime50", (instant27.compareTo(mutableDateTime50) == 0) == instant27.equals(mutableDateTime50));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTime();
        mutableDateTime9.setSecondOfMinute((int) (byte) 1);
        mutableDateTime9.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime14 = mutableDateTime9.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 'a', dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 'a', dateTimeZone19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate17, (org.joda.time.ReadablePartial) localDate20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(1L, dateTimeZone23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight24, readableDuration25);
        org.joda.time.Duration duration27 = period21.toDurationTo((org.joda.time.ReadableInstant) dateMidnight24);
        mutableDateTime9.add((org.joda.time.ReadableDuration) duration27, 53221515);
        org.joda.time.DateTime dateTime30 = dateTime4.minus((org.joda.time.ReadableDuration) duration27);
        int int31 = dateTime4.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime4.era();
        org.joda.time.DateTime dateTime18 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime20 = dateTime4.plusMillis(100);
        org.joda.time.DateTime.Property property21 = dateTime4.hourOfDay();
        java.lang.String str22 = property21.getAsString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight10 = dateTime9.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.withDayOfMonth((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime13 = dateMidnight12.toMutableDateTimeISO();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight4, (org.joda.time.ReadableInstant) dateMidnight12);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTime();
        mutableDateTime16.setSecondOfMinute((int) (byte) 1);
        int int19 = mutableDateTime16.getMillisOfDay();
        int int20 = mutableDateTime16.getHourOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.minuteOfHour();
        java.lang.Object obj22 = mutableDateTime16.clone();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate24.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight27 = dateTime26.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(1L, dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone33 = dateMidnight32.getZone();
        org.joda.time.DateTime dateTime34 = dateTime26.toDateTime(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj22, dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight12.withZoneRetainFields(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant15", (dateTime9.compareTo(instant15) == 0) == dateTime9.equals(instant15));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        int int17 = dateTime4.getDayOfWeek();
        org.joda.time.DateTime dateTime19 = dateTime4.plusMinutes(0);
        int int20 = dateTime4.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate5.isSupported(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Interval interval10 = localDate5.toInterval(dateTimeZone9);
        java.lang.String str11 = interval10.toString();
        org.joda.time.Chronology chronology12 = interval10.getChronology();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 'a', dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 'a', dateTimeZone21);
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate19, (org.joda.time.ReadablePartial) localDate22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(1L, dateTimeZone25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight26, readableDuration27);
        org.joda.time.Duration duration29 = period23.toDurationTo((org.joda.time.ReadableInstant) dateMidnight26);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(1L, dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(1L, dateTimeZone34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight35, readableDuration36);
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType39 = periodType38.withSecondsRemoved();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight32, (org.joda.time.ReadableInstant) dateMidnight35, periodType39);
        org.joda.time.PeriodType periodType41 = periodType39.withWeeksRemoved();
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration29, periodType39);
        org.joda.time.Interval interval43 = interval10.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Instant instant44 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate(chronology45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localDate46.toDateTimeAtCurrentTime(dateTimeZone47);
        int int49 = instant44.compareTo((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime51 = dateTime48.withSecondOfMinute(0);
        org.joda.time.Instant instant52 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) 'a', dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate((long) 'a', dateTimeZone57);
        org.joda.time.Period period59 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate55, (org.joda.time.ReadablePartial) localDate58);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(1L, dateTimeZone61);
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight62, readableDuration63);
        org.joda.time.Duration duration65 = period59.toDurationTo((org.joda.time.ReadableInstant) dateMidnight62);
        org.joda.time.Instant instant66 = instant52.minus((org.joda.time.ReadableDuration) duration65);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime48, (org.joda.time.ReadableDuration) duration65);
        boolean boolean68 = duration29.isShorterThan((org.joda.time.ReadableDuration) duration65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant44", (dateTime16.compareTo(instant44) == 0) == dateTime16.equals(instant44));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusMonths((int) (byte) 10);
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTime();
        mutableDateTime8.setSecondOfMinute((int) (byte) 1);
        int int11 = mutableDateTime8.getMillisOfDay();
        int int12 = mutableDateTime8.getHourOfDay();
        int int13 = dateMidnight6.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 'a', dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 'a', dateTimeZone20);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate18, (org.joda.time.ReadablePartial) localDate21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight25, readableDuration26);
        org.joda.time.Duration duration28 = period22.toDurationTo((org.joda.time.ReadableInstant) dateMidnight25);
        org.joda.time.Instant instant29 = instant15.minus((org.joda.time.ReadableDuration) duration28);
        mutableDateTime14.add((org.joda.time.ReadableDuration) duration28, (int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 10);
        int int34 = mutablePeriod33.getWeeks();
        org.joda.time.PeriodType periodType35 = mutablePeriod33.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime8, (org.joda.time.ReadableDuration) duration28, periodType35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime14", (instant7.compareTo(mutableDateTime14) == 0) == instant7.equals(mutableDateTime14));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime6 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight16, readableDuration17);
        org.joda.time.Duration duration19 = period13.toDurationTo((org.joda.time.ReadableInstant) dateMidnight16);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration19, 53221515);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 'a', dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 'a', dateTimeZone27);
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate25, (org.joda.time.ReadablePartial) localDate28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(1L, dateTimeZone31);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight32, readableDuration33);
        org.joda.time.Duration duration35 = period29.toDurationTo((org.joda.time.ReadableInstant) dateMidnight32);
        mutableDateTime22.add((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Instant instant37 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime38 = instant37.toMutableDateTime();
        mutableDateTime38.setSecondOfMinute((int) (byte) 1);
        mutableDateTime38.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime38.year();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime38.secondOfDay();
        mutableDateTime22.setMillis((org.joda.time.ReadableInstant) mutableDateTime38);
        java.util.Locale locale46 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(locale46);
        java.lang.String str48 = calendar47.getCalendarType();
        boolean boolean49 = mutableDateTime22.equals((java.lang.Object) str48);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis(53221655);
        mutableDateTime22.setZone(dateTimeZone51);
        mutableDateTime1.setZoneRetainFields(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime22 and mutableDateTime38", (mutableDateTime22.compareTo(mutableDateTime38) == 0) == mutableDateTime22.equals(mutableDateTime38));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        int int10 = instant5.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.DateTimeField dateTimeField14 = localDate12.getField(1);
        java.lang.String str15 = dateTimeField14.getName();
        int int16 = instant5.get(dateTimeField14);
        org.joda.time.Instant instant18 = instant5.plus((long) 'a');
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight4, (org.joda.time.ReadableInstant) instant5);
        org.joda.time.DateMidnight.Property property20 = dateMidnight4.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime9", (instant5.compareTo(dateTime9) == 0) == instant5.equals(dateTime9));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTime();
        mutableDateTime9.setSecondOfMinute((int) (byte) 1);
        mutableDateTime9.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime14 = mutableDateTime9.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 'a', dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 'a', dateTimeZone19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate17, (org.joda.time.ReadablePartial) localDate20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(1L, dateTimeZone23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight24, readableDuration25);
        org.joda.time.Duration duration27 = period21.toDurationTo((org.joda.time.ReadableInstant) dateMidnight24);
        mutableDateTime9.add((org.joda.time.ReadableDuration) duration27, 53221515);
        org.joda.time.DateTime dateTime30 = dateTime4.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.DateTime dateTime32 = dateTime4.minusMinutes(53221515);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.year();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.DateTimeField dateTimeField11 = localDate9.getField(1);
        java.lang.String str13 = dateTimeField11.getAsShortText((long) '4');
        int int14 = mutableDateTime1.get(dateTimeField11);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate17.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 'a', dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 'a', dateTimeZone24);
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate22, (org.joda.time.ReadablePartial) localDate25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(1L, dateTimeZone28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight29, readableDuration30);
        org.joda.time.Duration duration32 = period26.toDurationTo((org.joda.time.ReadableInstant) dateMidnight29);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(1L, dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(1L, dateTimeZone37);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight38, readableDuration39);
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType42 = periodType41.withSecondsRemoved();
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight35, (org.joda.time.ReadableInstant) dateMidnight38, periodType42);
        org.joda.time.PeriodType periodType44 = periodType42.withWeeksRemoved();
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableDuration) duration32, periodType42);
        org.joda.time.Interval interval46 = new org.joda.time.Interval(readableInstant15, (org.joda.time.ReadableDuration) duration32);
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((java.lang.Object) interval46);
        org.joda.time.Duration duration49 = interval46.toDuration();
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration49, 1439);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime19", (instant0.compareTo(dateTime19) == 0) == instant0.equals(dateTime19));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateTime dateTime6 = dateMidnight5.toDateTimeISO();
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate10, (org.joda.time.ReadablePartial) localDate13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(1L, dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight17, readableDuration18);
        org.joda.time.Duration duration20 = period14.toDurationTo((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant21 = instant7.minus((org.joda.time.ReadableDuration) duration20);
        boolean boolean22 = dateMidnight5.isAfter((org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(1L, dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = dateMidnight30.getZone();
        int int33 = dateTimeZone31.getStandardOffset((long) 32769);
        java.util.Locale locale35 = java.util.Locale.US;
        java.lang.String str36 = dateTimeZone31.getShortName((long) 1970, locale35);
        org.joda.time.DateTime dateTime37 = dateMidnight25.toDateTime(dateTimeZone31);
        boolean boolean38 = instant7.isEqual((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Instant instant39 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime40 = instant39.toMutableDateTime();
        mutableDateTime40.setSecondOfMinute((int) (byte) 1);
        mutableDateTime40.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.year();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime40.era();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant7, (org.joda.time.ReadableInstant) mutableDateTime40);
        long long48 = instant7.getMillis();
        org.joda.time.MutableDateTime mutableDateTime49 = instant7.toMutableDateTime();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate(chronology50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localDate51.toDateTimeAtCurrentTime(dateTimeZone52);
        org.joda.time.LocalDate localDate54 = dateTime53.toLocalDate();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate(chronology55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = localDate56.toDateTimeAtCurrentTime(dateTimeZone57);
        org.joda.time.DateMidnight dateMidnight59 = dateTime58.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(1L, dateTimeZone61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone65 = dateMidnight64.getZone();
        org.joda.time.DateTime dateTime66 = dateTime58.toDateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime67 = dateTime53.withZoneRetainFields(dateTimeZone65);
        mutableDateTime49.setZone(dateTimeZone65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime53", (instant7.compareTo(dateTime53) == 0) == instant7.equals(dateTime53));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        int int17 = dateTime16.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTime();
        mutableDateTime2.setSecondOfMinute((int) (byte) 1);
        mutableDateTime2.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate10, (org.joda.time.ReadablePartial) localDate13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(1L, dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight17, readableDuration18);
        org.joda.time.Duration duration20 = period14.toDurationTo((org.joda.time.ReadableInstant) dateMidnight17);
        mutableDateTime2.add((org.joda.time.ReadableDuration) duration20, 53221515);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant23);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Instant instant26 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate28.toDateTimeAtCurrentTime(dateTimeZone29);
        int int31 = instant26.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime33 = dateTime30.withSecondOfMinute(0);
        org.joda.time.Instant instant34 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 'a', dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 'a', dateTimeZone39);
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate37, (org.joda.time.ReadablePartial) localDate40);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight(1L, dateTimeZone43);
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight44, readableDuration45);
        org.joda.time.Duration duration47 = period41.toDurationTo((org.joda.time.ReadableInstant) dateMidnight44);
        org.joda.time.Instant instant48 = instant34.minus((org.joda.time.ReadableDuration) duration47);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableDuration) duration47);
        int int50 = duration20.compareTo((org.joda.time.ReadableDuration) duration47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant1", (mutableDateTime0.compareTo(instant1) == 0) == mutableDateTime0.equals(instant1));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        int int17 = dateTime4.getDayOfWeek();
        org.joda.time.DateTime dateTime19 = dateTime4.plusMinutes(0);
        org.joda.time.DateTime.Property property20 = dateTime4.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime4.toMutableDateTime();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 'a', dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 'a', dateTimeZone21);
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate19, (org.joda.time.ReadablePartial) localDate22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(1L, dateTimeZone25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight26, readableDuration27);
        org.joda.time.Duration duration29 = period23.toDurationTo((org.joda.time.ReadableInstant) dateMidnight26);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(1L, dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(1L, dateTimeZone34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight35, readableDuration36);
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType39 = periodType38.withSecondsRemoved();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight32, (org.joda.time.ReadableInstant) dateMidnight35, periodType39);
        org.joda.time.PeriodType periodType41 = periodType39.withWeeksRemoved();
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration29, periodType39);
        org.joda.time.Interval interval43 = new org.joda.time.Interval(readableInstant12, (org.joda.time.ReadableDuration) duration29);
        mutableDateTime11.add((org.joda.time.ReadableDuration) duration29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundFloor();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight12 = dateTime11.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = dateMidnight17.getZone();
        org.joda.time.DateTime dateTime19 = dateTime11.toDateTime(dateTimeZone18);
        mutableDateTime7.setZoneRetainFields(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Instant instant6 = instant0.toInstant();
        org.joda.time.Instant instant8 = instant0.withMillis((long) 53221);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant0", (dateTime4.compareTo(instant0) == 0) == dateTime4.equals(instant0));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        int int2 = localDate1.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate1.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property6 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.LocalDate localDate12 = dateTime11.toLocalDate();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight17 = dateTime16.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateMidnight22.getZone();
        org.joda.time.DateTime dateTime24 = dateTime16.toDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = dateTime11.withZoneRetainFields(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime7.withZoneRetainFields(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 'a', dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 'a', dateTimeZone32);
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate30, (org.joda.time.ReadablePartial) localDate33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(1L, dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight37, readableDuration38);
        org.joda.time.Duration duration40 = period34.toDurationTo((org.joda.time.ReadableInstant) dateMidnight37);
        mutableDateTime27.add((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Instant instant42 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime43 = instant42.toMutableDateTime();
        mutableDateTime43.setSecondOfMinute((int) (byte) 1);
        mutableDateTime43.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.year();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime43.secondOfDay();
        mutableDateTime27.setMillis((org.joda.time.ReadableInstant) mutableDateTime43);
        java.util.Locale locale51 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(locale51);
        java.lang.String str53 = calendar52.getCalendarType();
        boolean boolean54 = mutableDateTime27.equals((java.lang.Object) str53);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis(53221655);
        mutableDateTime27.setZone(dateTimeZone56);
        long long59 = dateTimeZone23.getMillisKeepLocal(dateTimeZone56, (long) 'x');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant42", (dateTime16.compareTo(instant42) == 0) == dateTime16.equals(instant42));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(1L, dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight5, readableDuration6);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight2, (org.joda.time.ReadableInstant) dateMidnight5, periodType9);
        org.joda.time.DateMidnight.Property property11 = dateMidnight2.year();
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str13 = property11.getAsText(locale12);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime15 = instant14.toMutableDateTime();
        mutableDateTime15.setSecondOfMinute((int) (byte) 1);
        mutableDateTime15.setSecondOfMinute(52);
        mutableDateTime15.setMillisOfSecond((int) ' ');
        long long22 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = dateMidnight27.getZone();
        mutableDateTime15.setZoneRetainFields(dateTimeZone28);
        long long31 = dateTimeZone28.convertUTCToLocal((long) 5);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 'a', dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 'a', dateTimeZone37);
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate35, (org.joda.time.ReadablePartial) localDate38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(1L, dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone45 = dateMidnight44.getZone();
        org.joda.time.DateTime dateTime46 = localDate38.toDateTimeAtMidnight(dateTimeZone45);
        org.joda.time.Period period48 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod49 = period48.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) 'a', dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) 'a', dateTimeZone56);
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate54, (org.joda.time.ReadablePartial) localDate57);
        org.joda.time.LocalDate localDate60 = localDate54.withDayOfMonth(13);
        org.joda.time.Chronology chronology61 = localDate60.getChronology();
        mutablePeriod49.setPeriod((long) 10, (-599990L), chronology61);
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight((-1968L), chronology61);
        org.joda.time.DateTimeZone dateTimeZone64 = chronology61.getZone();
        org.joda.time.DateTime dateTime65 = localDate38.toDateTimeAtMidnight(dateTimeZone64);
        org.joda.time.DateTime dateTime66 = dateTime32.withZoneRetainFields(dateTimeZone64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime65", (dateMidnight2.compareTo(dateTime65) == 0) == dateMidnight2.equals(dateTime65));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.DateTime dateTime13 = localDate5.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.Period period15 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod16 = period15.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 'a', dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 'a', dateTimeZone23);
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate21, (org.joda.time.ReadablePartial) localDate24);
        org.joda.time.LocalDate localDate27 = localDate21.withDayOfMonth(13);
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        mutablePeriod16.setPeriod((long) 10, (-599990L), chronology28);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((-1968L), chronology28);
        org.joda.time.DateTimeZone dateTimeZone31 = chronology28.getZone();
        org.joda.time.DateTime dateTime32 = localDate5.toDateTimeAtMidnight(dateTimeZone31);
        org.joda.time.LocalDate.Property property33 = localDate5.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight9 and dateTime32", (dateMidnight9.compareTo(dateTime32) == 0) == dateMidnight9.equals(dateTime32));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 'a', dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) localDate6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = localDate6.isSupported(dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = localDate6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.minutes();
        java.lang.String str12 = chronology10.toString();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) 6, chronology10);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime15 = instant14.toMutableDateTime();
        mutableDateTime15.setSecondOfMinute((int) (byte) 1);
        mutableDateTime15.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime20 = mutableDateTime15.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 'a', dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 'a', dateTimeZone25);
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate23, (org.joda.time.ReadablePartial) localDate26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(1L, dateTimeZone29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight30, readableDuration31);
        org.joda.time.Duration duration33 = period27.toDurationTo((org.joda.time.ReadableInstant) dateMidnight30);
        mutableDateTime15.add((org.joda.time.ReadableDuration) duration33, 53221515);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight13.plus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateMidnight.Property property37 = dateMidnight36.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight36 and dateMidnight30", (dateMidnight36.compareTo(dateMidnight30) == 0) == dateMidnight36.equals(dateMidnight30));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        int int7 = instant2.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime9 = dateTime6.withSecondOfMinute(0);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtCurrentTime(dateTimeZone13);
        int int15 = instant10.compareTo((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime17 = dateTime14.withSecondOfMinute(0);
        org.joda.time.Instant instant18 = dateTime14.toInstant();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(1L, dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(1L, dateTimeZone23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight24, readableDuration25);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType28 = periodType27.withSecondsRemoved();
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight21, (org.joda.time.ReadableInstant) dateMidnight24, periodType28);
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime14, periodType28);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 'a', dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 'a', dateTimeZone36);
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate34, (org.joda.time.ReadablePartial) localDate37);
        org.joda.time.LocalDate localDate40 = localDate34.withDayOfMonth(13);
        org.joda.time.Chronology chronology41 = localDate40.getChronology();
        long long45 = chronology41.add((long) (short) -1, (long) 1961, 15);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.standard();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) 'a', dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) 'a', dateTimeZone52);
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate50, (org.joda.time.ReadablePartial) localDate53);
        org.joda.time.LocalDate localDate56 = localDate50.withDayOfMonth(13);
        org.joda.time.Chronology chronology57 = localDate56.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 0, periodType47, chronology57);
        int[] intArray61 = chronology41.get((org.joda.time.ReadablePeriod) mutablePeriod58, (long) 596, (long) 53221161);
        boolean boolean62 = dateTimeFieldType31.isSupported(chronology41);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(3193290900000L, (long) 0, periodType28, chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime6", (instant2.compareTo(dateTime6) == 0) == instant2.equals(dateTime6));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setTime((long) 11);
        int int6 = mutableDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight12, readableDuration13);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType16 = periodType15.withSecondsRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight9, (org.joda.time.ReadableInstant) dateMidnight12, periodType16);
        org.joda.time.DateMidnight.Property property18 = dateMidnight9.year();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str20 = property18.getAsText(locale19);
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime22 = instant21.toMutableDateTime();
        mutableDateTime22.setSecondOfMinute((int) (byte) 1);
        mutableDateTime22.setSecondOfMinute(52);
        mutableDateTime22.setMillisOfSecond((int) ' ');
        long long29 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(1L, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone35 = dateMidnight34.getZone();
        mutableDateTime22.setZoneRetainFields(dateTimeZone35);
        long long38 = dateTimeZone35.convertUTCToLocal((long) 5);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone35);
        mutableDateTime1.setZoneRetainFields(dateTimeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime39", (instant0.compareTo(dateTime39) == 0) == instant0.equals(dateTime39));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        int int17 = dateTime4.getDayOfWeek();
        org.joda.time.DateTime dateTime19 = dateTime4.plusMinutes(0);
        org.joda.time.DateTime dateTime22 = dateTime4.withDurationAdded((long) 53221684, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime22", (instant0.compareTo(dateTime22) == 0) == instant0.equals(dateTime22));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTime.Property property8 = dateTime4.millisOfDay();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime9", (instant0.compareTo(dateTime9) == 0) == instant0.equals(dateTime9));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 'a', dateTimeZone13);
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate11, (org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(1L, dateTimeZone17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight18, readableDuration19);
        org.joda.time.Duration duration21 = period15.toDurationTo((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.Instant instant22 = instant8.minus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.Period period28 = new org.joda.time.Period(32769, 1, 53221515, (int) (short) 0);
        org.joda.time.DateTime dateTime30 = dateTime4.withPeriodAdded((org.joda.time.ReadablePeriod) period28, 53221147);
        org.joda.time.DateTime.Property property31 = dateTime30.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withDayOfMonth((int) (short) 1);
        int int7 = dateMidnight4.getWeekyear();
        java.lang.String str9 = dateMidnight4.toString("+00:00");
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 'a', dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 'a', dateTimeZone17);
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate15, (org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate localDate21 = localDate15.withDayOfMonth(13);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        mutablePeriod11.add((long) ' ', chronology22);
        org.joda.time.DurationField durationField24 = chronology22.weekyears();
        org.joda.time.DateTime dateTime25 = dateMidnight4.toDateTime(chronology22);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and dateTime25", (dateMidnight4.compareTo(dateTime25) == 0) == dateMidnight4.equals(dateTime25));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 'a', dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight14, readableDuration15);
        org.joda.time.Duration duration17 = period11.toDurationTo((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(1L, dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight23, readableDuration24);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType27 = periodType26.withSecondsRemoved();
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight20, (org.joda.time.ReadableInstant) dateMidnight23, periodType27);
        org.joda.time.PeriodType periodType29 = periodType27.withWeeksRemoved();
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration17, periodType27);
        org.joda.time.Interval interval31 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadableDuration) duration17);
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((java.lang.Object) interval31);
        org.joda.time.Duration duration34 = interval31.toDuration();
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localDate37.toDateTimeAtCurrentTime(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 'a', dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 'a', dateTimeZone44);
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate42, (org.joda.time.ReadablePartial) localDate45);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(1L, dateTimeZone48);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight49, readableDuration50);
        org.joda.time.Duration duration52 = period46.toDurationTo((org.joda.time.ReadableInstant) dateMidnight49);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight(1L, dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight(1L, dateTimeZone57);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight58, readableDuration59);
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType62 = periodType61.withSecondsRemoved();
        org.joda.time.Period period63 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight55, (org.joda.time.ReadableInstant) dateMidnight58, periodType62);
        org.joda.time.PeriodType periodType64 = periodType62.withWeeksRemoved();
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableDuration) duration52, periodType62);
        org.joda.time.Interval interval66 = new org.joda.time.Interval(readableInstant35, (org.joda.time.ReadableDuration) duration52);
        org.joda.time.Interval interval67 = interval31.withDurationAfterStart((org.joda.time.ReadableDuration) duration52);
        org.joda.time.Instant instant68 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate(chronology69);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = localDate70.toDateTimeAtCurrentTime(dateTimeZone71);
        int int73 = instant68.compareTo((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTime dateTime75 = dateTime72.withSecondOfMinute(0);
        org.joda.time.Instant instant76 = dateTime72.toInstant();
        org.joda.time.DateTime dateTime78 = dateTime72.plusMonths((int) '4');
        org.joda.time.DateTime dateTime79 = dateTime72.toDateTime();
        boolean boolean80 = interval67.isBefore((org.joda.time.ReadableInstant) dateTime79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and instant68", (dateTime39.compareTo(instant68) == 0) == dateTime39.equals(instant68));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 'a', dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) localDate6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight10, readableDuration11);
        org.joda.time.Duration duration13 = period7.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Instant instant14 = instant0.minus((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate17.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 'a', dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 'a', dateTimeZone24);
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate22, (org.joda.time.ReadablePartial) localDate25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(1L, dateTimeZone28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight29, readableDuration30);
        org.joda.time.Duration duration32 = period26.toDurationTo((org.joda.time.ReadableInstant) dateMidnight29);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(1L, dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(1L, dateTimeZone37);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight38, readableDuration39);
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType42 = periodType41.withSecondsRemoved();
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight35, (org.joda.time.ReadableInstant) dateMidnight38, periodType42);
        org.joda.time.PeriodType periodType44 = periodType42.withWeeksRemoved();
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableDuration) duration32, periodType42);
        org.joda.time.Interval interval46 = new org.joda.time.Interval(readableInstant15, (org.joda.time.ReadableDuration) duration32);
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((java.lang.Object) interval46);
        org.joda.time.Duration duration49 = interval46.toDuration();
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate(chronology51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = localDate52.toDateTimeAtCurrentTime(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) 'a', dateTimeZone56);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) 'a', dateTimeZone59);
        org.joda.time.Period period61 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate57, (org.joda.time.ReadablePartial) localDate60);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight(1L, dateTimeZone63);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight64, readableDuration65);
        org.joda.time.Duration duration67 = period61.toDurationTo((org.joda.time.ReadableInstant) dateMidnight64);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateMidnight dateMidnight70 = new org.joda.time.DateMidnight(1L, dateTimeZone69);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.DateMidnight dateMidnight73 = new org.joda.time.DateMidnight(1L, dateTimeZone72);
        org.joda.time.ReadableDuration readableDuration74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight73, readableDuration74);
        org.joda.time.PeriodType periodType76 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType77 = periodType76.withSecondsRemoved();
        org.joda.time.Period period78 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight70, (org.joda.time.ReadableInstant) dateMidnight73, periodType77);
        org.joda.time.PeriodType periodType79 = periodType77.withWeeksRemoved();
        org.joda.time.Period period80 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadableDuration) duration67, periodType77);
        org.joda.time.Interval interval81 = new org.joda.time.Interval(readableInstant50, (org.joda.time.ReadableDuration) duration67);
        org.joda.time.Interval interval82 = interval46.withDurationAfterStart((org.joda.time.ReadableDuration) duration67);
        boolean boolean83 = duration13.isEqual((org.joda.time.ReadableDuration) duration67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime19", (instant0.compareTo(dateTime19) == 0) == instant0.equals(dateTime19));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtCurrentTime(dateTimeZone4);
        int int6 = instant1.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute(0);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 'a', dateTimeZone14);
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate12, (org.joda.time.ReadablePartial) localDate15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight19, readableDuration20);
        org.joda.time.Duration duration22 = period16.toDurationTo((org.joda.time.ReadableInstant) dateMidnight19);
        org.joda.time.Instant instant23 = instant9.minus((org.joda.time.ReadableDuration) duration22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableDuration) duration22);
        org.joda.time.Period period25 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime26 = dateTime5.toDateTime();
        int int27 = dateTime26.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime26", (instant1.compareTo(dateTime26) == 0) == instant1.equals(dateTime26));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.Chronology chronology2 = timeOfDay1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.millisOfSecond();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DurationField durationField5 = chronology2.eras();
        org.joda.time.DurationField durationField6 = chronology2.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTime.Property property8 = dateTime4.millisOfDay();
        org.joda.time.DateTime dateTime10 = property8.addToCopy(2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(1L, dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateMidnight9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime3.toDateTime(dateTimeZone10);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime14 = instant13.toMutableDateTime();
        mutableDateTime14.setSecondOfMinute((int) (byte) 1);
        int int17 = mutableDateTime14.getMillisOfDay();
        int int18 = mutableDateTime14.getHourOfDay();
        org.joda.time.Period period20 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod21 = period20.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 'a', dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 'a', dateTimeZone28);
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate26, (org.joda.time.ReadablePartial) localDate29);
        org.joda.time.LocalDate localDate32 = localDate26.withDayOfMonth(13);
        org.joda.time.Chronology chronology33 = localDate32.getChronology();
        mutablePeriod21.setPeriod((long) 10, (-599990L), chronology33);
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((-1968L), chronology33);
        org.joda.time.DateTimeZone dateTimeZone36 = chronology33.getZone();
        mutableDateTime14.setZoneRetainFields(dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight38 = yearMonthDay12.toDateMidnight(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant13", (dateTime3.compareTo(instant13) == 0) == dateTime3.equals(instant13));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime4.era();
        org.joda.time.DateTime dateTime18 = dateTime4.withTimeAtStartOfDay();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(locale19);
        int int21 = calendar20.getFirstDayOfWeek();
        boolean boolean22 = dateTime4.equals((java.lang.Object) calendar20);
        java.lang.Object obj23 = null;
        boolean boolean24 = calendar20.after(obj23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withDayOfMonth((int) (short) 1);
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        int int12 = instant7.compareTo((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.withSecondOfMinute(0);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 'a', dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 'a', dateTimeZone20);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate18, (org.joda.time.ReadablePartial) localDate21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight25, readableDuration26);
        org.joda.time.Duration duration28 = period22.toDurationTo((org.joda.time.ReadableInstant) dateMidnight25);
        org.joda.time.Instant instant29 = instant15.minus((org.joda.time.ReadableDuration) duration28);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableDuration) duration28);
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight4, (org.joda.time.ReadableDuration) duration28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant7", (dateTime3.compareTo(instant7) == 0) == dateTime3.equals(instant7));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusMonths((int) (byte) 10);
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTime();
        mutableDateTime8.setSecondOfMinute((int) (byte) 1);
        int int11 = mutableDateTime8.getMillisOfDay();
        int int12 = mutableDateTime8.getHourOfDay();
        int int13 = dateMidnight6.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        int int14 = mutableDateTime8.getEra();
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTime();
        mutableDateTime16.setSecondOfMinute((int) (byte) 1);
        mutableDateTime16.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.year();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundFloor();
        org.joda.time.Instant instant23 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 'a', dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 'a', dateTimeZone28);
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate26, (org.joda.time.ReadablePartial) localDate29);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(1L, dateTimeZone32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight33, readableDuration34);
        org.joda.time.Duration duration36 = period30.toDurationTo((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.Instant instant37 = instant23.minus((org.joda.time.ReadableDuration) duration36);
        mutableDateTime22.add((org.joda.time.ReadableDuration) duration36);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration36, 721437);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) 'a', dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) 'a', dateTimeZone46);
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate44, (org.joda.time.ReadablePartial) localDate47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = null;
        boolean boolean50 = localDate47.isSupported(dateTimeFieldType49);
        org.joda.time.Chronology chronology51 = localDate47.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.minutes();
        java.lang.String str53 = chronology51.toString();
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight((long) 6, chronology51);
        org.joda.time.Instant instant55 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime56 = instant55.toMutableDateTime();
        mutableDateTime56.setSecondOfMinute((int) (byte) 1);
        mutableDateTime56.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime61 = mutableDateTime56.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((long) 'a', dateTimeZone63);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate((long) 'a', dateTimeZone66);
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate64, (org.joda.time.ReadablePartial) localDate67);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight(1L, dateTimeZone70);
        org.joda.time.ReadableDuration readableDuration72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight71, readableDuration72);
        org.joda.time.Duration duration74 = period68.toDurationTo((org.joda.time.ReadableInstant) dateMidnight71);
        mutableDateTime56.add((org.joda.time.ReadableDuration) duration74, 53221515);
        org.joda.time.DateMidnight dateMidnight77 = dateMidnight54.plus((org.joda.time.ReadableDuration) duration74);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration74, 53221243);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight54", (dateMidnight2.compareTo(dateMidnight54) == 0) == dateMidnight2.equals(dateMidnight54));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        int int4 = mutableDateTime1.getMillisOfDay();
        mutableDateTime1.setDayOfYear((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight16, readableDuration17);
        org.joda.time.Duration duration19 = period13.toDurationTo((org.joda.time.ReadableInstant) dateMidnight16);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime1.millisOfDay();
        int int22 = mutableDateTime1.getSecondOfDay();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate25.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 'a', dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 'a', dateTimeZone32);
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate30, (org.joda.time.ReadablePartial) localDate33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(1L, dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight37, readableDuration38);
        org.joda.time.Duration duration40 = period34.toDurationTo((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(1L, dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(1L, dateTimeZone45);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight46, readableDuration47);
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType50 = periodType49.withSecondsRemoved();
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight43, (org.joda.time.ReadableInstant) dateMidnight46, periodType50);
        org.joda.time.PeriodType periodType52 = periodType50.withWeeksRemoved();
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableDuration) duration40, periodType50);
        org.joda.time.Interval interval54 = new org.joda.time.Interval(readableInstant23, (org.joda.time.ReadableDuration) duration40);
        org.joda.time.Duration duration55 = duration40.toDuration();
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration40, 53221327);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime27", (instant0.compareTo(dateTime27) == 0) == instant0.equals(dateTime27));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 'a', dateTimeZone13);
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate11, (org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(1L, dateTimeZone17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight18, readableDuration19);
        org.joda.time.Duration duration21 = period15.toDurationTo((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.Instant instant22 = instant8.minus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(1L, dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(1L, dateTimeZone28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone32 = dateMidnight31.getZone();
        int int34 = dateTimeZone32.getStandardOffset((long) 32769);
        java.util.Locale locale36 = java.util.Locale.US;
        java.lang.String str37 = dateTimeZone32.getShortName((long) 1970, locale36);
        org.joda.time.DateTime dateTime38 = dateMidnight26.toDateTime(dateTimeZone32);
        int int39 = dateTime38.getHourOfDay();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration21, (org.joda.time.ReadableInstant) dateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate5.isSupported(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Interval interval10 = localDate5.toInterval(dateTimeZone9);
        java.lang.String str11 = interval10.toString();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 'a', dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 'a', dateTimeZone16);
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate14, (org.joda.time.ReadablePartial) localDate17);
        org.joda.time.Period period20 = period18.plusYears(8);
        org.joda.time.Interval interval21 = interval10.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 'a', dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 'a', dateTimeZone26);
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate24, (org.joda.time.ReadablePartial) localDate27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        boolean boolean30 = localDate27.isSupported(dateTimeFieldType29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.Interval interval32 = localDate27.toInterval(dateTimeZone31);
        java.lang.String str33 = interval32.toString();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 'a', dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) 'a', dateTimeZone38);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate36, (org.joda.time.ReadablePartial) localDate39);
        org.joda.time.Period period42 = period40.plusYears(8);
        org.joda.time.Interval interval43 = interval32.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period42);
        boolean boolean45 = interval32.contains((long) 15);
        org.joda.time.Interval interval46 = interval10.gap((org.joda.time.ReadableInterval) interval32);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(chronology48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = localDate49.toDateTimeAtCurrentTime(dateTimeZone50);
        int int52 = instant47.compareTo((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime dateTime54 = dateTime51.withSecondOfMinute(0);
        org.joda.time.Instant instant55 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate(chronology56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = localDate57.toDateTimeAtCurrentTime(dateTimeZone58);
        int int60 = instant55.compareTo((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTime dateTime62 = dateTime59.withSecondOfMinute(0);
        org.joda.time.Instant instant63 = dateTime59.toInstant();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight(1L, dateTimeZone65);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight(1L, dateTimeZone68);
        org.joda.time.ReadableDuration readableDuration70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight69, readableDuration70);
        org.joda.time.PeriodType periodType72 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType73 = periodType72.withSecondsRemoved();
        org.joda.time.Period period74 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight66, (org.joda.time.ReadableInstant) dateMidnight69, periodType73);
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime59, periodType73);
        boolean boolean76 = interval32.isBefore((org.joda.time.ReadableInstant) dateTime59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant47 and dateTime51", (instant47.compareTo(dateTime51) == 0) == instant47.equals(dateTime51));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime4.plusWeeks(70);
        org.joda.time.DateTime dateTime20 = dateTime18.withWeekOfWeekyear(25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.DateTime dateTime13 = localDate5.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.Period period15 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod16 = period15.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 'a', dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 'a', dateTimeZone23);
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate21, (org.joda.time.ReadablePartial) localDate24);
        org.joda.time.LocalDate localDate27 = localDate21.withDayOfMonth(13);
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        mutablePeriod16.setPeriod((long) 10, (-599990L), chronology28);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((-1968L), chronology28);
        org.joda.time.DateTimeZone dateTimeZone31 = chronology28.getZone();
        org.joda.time.DateTime dateTime32 = localDate5.toDateTimeAtMidnight(dateTimeZone31);
        int int33 = localDate5.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight9 and dateTime32", (dateMidnight9.compareTo(dateTime32) == 0) == dateMidnight9.equals(dateTime32));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime4.era();
        org.joda.time.DateTime dateTime18 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime20 = dateTime4.plusMillis(100);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = dateTime4.withChronology(chronology21);
        int int23 = dateTime22.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime22", (instant0.compareTo(dateTime22) == 0) == instant0.equals(dateTime22));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime4.toDateTime();
        int int12 = dateTime4.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeField dateTimeField3 = localDate1.getField(1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate6, (org.joda.time.ReadablePartial) localDate9);
        boolean boolean11 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 'a', dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 'a', dateTimeZone19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate17, (org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate23 = localDate17.withDayOfMonth(13);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        mutablePeriod13.add((long) ' ', chronology24);
        org.joda.time.LocalDate localDate26 = localDate1.minus((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime28 = instant27.toMutableDateTime();
        mutableDateTime28.setSecondOfMinute((int) (byte) 1);
        mutableDateTime28.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime33 = mutableDateTime28.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 'a', dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) 'a', dateTimeZone38);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate36, (org.joda.time.ReadablePartial) localDate39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(1L, dateTimeZone42);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight43, readableDuration44);
        org.joda.time.Duration duration46 = period40.toDurationTo((org.joda.time.ReadableInstant) dateMidnight43);
        mutableDateTime28.add((org.joda.time.ReadableDuration) duration46, 53221515);
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration46);
        org.joda.time.Period period50 = mutablePeriod13.toPeriod();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant27 and mutableDateTime28", (instant27.compareTo(mutableDateTime28) == 0) == instant27.equals(mutableDateTime28));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime4.era();
        org.joda.time.DateTime dateTime18 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime20 = dateTime18.plusYears(44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateTime dateTime6 = dateMidnight5.toDateTimeISO();
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate10, (org.joda.time.ReadablePartial) localDate13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(1L, dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight17, readableDuration18);
        org.joda.time.Duration duration20 = period14.toDurationTo((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant21 = instant7.minus((org.joda.time.ReadableDuration) duration20);
        boolean boolean22 = dateMidnight5.isAfter((org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(1L, dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = dateMidnight30.getZone();
        int int33 = dateTimeZone31.getStandardOffset((long) 32769);
        java.util.Locale locale35 = java.util.Locale.US;
        java.lang.String str36 = dateTimeZone31.getShortName((long) 1970, locale35);
        org.joda.time.DateTime dateTime37 = dateMidnight25.toDateTime(dateTimeZone31);
        boolean boolean38 = instant7.isEqual((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Instant instant39 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime40 = instant39.toMutableDateTime();
        mutableDateTime40.setSecondOfMinute((int) (byte) 1);
        mutableDateTime40.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.year();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime40.era();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant7, (org.joda.time.ReadableInstant) mutableDateTime40);
        long long48 = instant7.getMillis();
        org.joda.time.MutableDateTime mutableDateTime49 = instant7.toMutableDateTime();
        org.joda.time.Instant instant50 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate(chronology51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = localDate52.toDateTimeAtCurrentTime(dateTimeZone53);
        int int55 = instant50.compareTo((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime dateTime57 = dateTime54.withSecondOfMinute(0);
        org.joda.time.Instant instant58 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime59 = instant58.toMutableDateTime();
        mutableDateTime59.setSecondOfMinute((int) (byte) 1);
        mutableDateTime59.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime64 = mutableDateTime59.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate((long) 'a', dateTimeZone66);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate((long) 'a', dateTimeZone69);
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate67, (org.joda.time.ReadablePartial) localDate70);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight(1L, dateTimeZone73);
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight74, readableDuration75);
        org.joda.time.Duration duration77 = period71.toDurationTo((org.joda.time.ReadableInstant) dateMidnight74);
        mutableDateTime59.add((org.joda.time.ReadableDuration) duration77, 53221515);
        org.joda.time.DateTime dateTime80 = dateTime54.minus((org.joda.time.ReadableDuration) duration77);
        org.joda.time.Instant instant82 = instant7.withDurationAdded((org.joda.time.ReadableDuration) duration77, 120);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant82 and mutableDateTime49", (instant82.compareTo(mutableDateTime49) == 0) == instant82.equals(mutableDateTime49));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        int int10 = instant5.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.DateTimeField dateTimeField14 = localDate12.getField(1);
        java.lang.String str15 = dateTimeField14.getName();
        int int16 = instant5.get(dateTimeField14);
        org.joda.time.Instant instant18 = instant5.plus((long) 'a');
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight4, (org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology20 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime9", (instant5.compareTo(dateTime9) == 0) == instant5.equals(dateTime9));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setSecondOfMinute(52);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = dateMidnight17.getZone();
        org.joda.time.DateTime dateTime19 = localDate11.toDateTimeAtMidnight(dateTimeZone18);
        boolean boolean21 = dateTimeZone18.isStandardOffset((long) (byte) 10);
        mutableDateTime1.setZone(dateTimeZone18);
        int int23 = mutableDateTime1.getSecondOfMinute();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate25.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(1L, dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight32.withField(dateTimeFieldType33, (int) 'a');
        org.joda.time.DateTime dateTime37 = dateTime27.withField(dateTimeFieldType33, (int) (short) 0);
        org.joda.time.DateTime dateTime39 = dateTime27.plusHours((int) (short) 1);
        int int40 = dateTime39.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property41 = dateTime39.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.secondOfMinute();
        int int43 = dateTime39.get(dateTimeFieldType42);
        org.joda.time.DateTime dateTime45 = dateTime39.plusSeconds(464);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime27", (instant0.compareTo(dateTime27) == 0) == instant0.equals(dateTime27));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(1L, dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateMidnight9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime3.toDateTime(dateTimeZone10);
        org.joda.time.Instant instant12 = dateTime3.toInstant();
        org.joda.time.DateTime.Property property13 = dateTime3.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant12", (dateTime3.compareTo(instant12) == 0) == dateTime3.equals(instant12));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight2, readableDuration3);
        int int5 = period4.size();
        java.lang.String str6 = period4.toString();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.months();
        int int8 = period4.get(durationFieldType7);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtCurrentTime(dateTimeZone12);
        int int14 = instant9.compareTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 'a', dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 'a', dateTimeZone19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate17, (org.joda.time.ReadablePartial) localDate20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = localDate20.isSupported(dateTimeFieldType22);
        org.joda.time.Chronology chronology24 = localDate20.getChronology();
        org.joda.time.DateTime dateTime25 = dateTime13.toDateTime(chronology24);
        int int26 = dateTime13.getDayOfWeek();
        org.joda.time.DateTime dateTime28 = dateTime13.plusMinutes(0);
        org.joda.time.Interval interval29 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period4, (org.joda.time.ReadableInstant) dateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime28", (instant9.compareTo(dateTime28) == 0) == instant9.equals(dateTime28));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateTime dateTime6 = dateMidnight5.toDateTimeISO();
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate10, (org.joda.time.ReadablePartial) localDate13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(1L, dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight17, readableDuration18);
        org.joda.time.Duration duration20 = period14.toDurationTo((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant21 = instant7.minus((org.joda.time.ReadableDuration) duration20);
        boolean boolean22 = dateMidnight5.isAfter((org.joda.time.ReadableInstant) instant7);
        org.joda.time.Instant instant24 = instant7.plus((long) (short) 10);
        org.joda.time.DateTime dateTime25 = instant7.toDateTimeISO();
        org.joda.time.DateTime dateTime27 = dateTime25.withMillisOfDay(53221407);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate29.toDateTimeAtCurrentTime(dateTimeZone30);
        org.joda.time.DateMidnight dateMidnight32 = dateTime31.toDateMidnight();
        org.joda.time.DateTime dateTime34 = dateTime31.plusMillis((-1));
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime31.getZone();
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = dateTime27.withZone(dateTimeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime25", (instant7.compareTo(dateTime25) == 0) == instant7.equals(dateTime25));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime4.toMutableDateTime();
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.weeks();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 'a', dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 'a', dateTimeZone19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate17, (org.joda.time.ReadablePartial) localDate20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = localDate20.isSupported(dateTimeFieldType22);
        org.joda.time.Chronology chronology24 = localDate20.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.dayOfYear();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField27 = chronology24.millisOfDay();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 493, (long) 53221161, periodType14, chronology24);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime11, chronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.Period period11 = org.joda.time.Period.ZERO;
        org.joda.time.Period period12 = period11.toPeriod();
        org.joda.time.DateTime dateTime13 = dateTime4.plus((org.joda.time.ReadablePeriod) period12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime13", (instant0.compareTo(dateTime13) == 0) == instant0.equals(dateTime13));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime4.era();
        org.joda.time.DateTime dateTime18 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime20 = dateTime4.plusMillis(100);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = dateTime4.withChronology(chronology21);
        org.joda.time.LocalTime localTime23 = dateTime4.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 'a', dateTimeZone13);
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate11, (org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(1L, dateTimeZone17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight18, readableDuration19);
        org.joda.time.Duration duration21 = period15.toDurationTo((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.Instant instant22 = instant8.minus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.Duration duration24 = duration21.toDuration();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        int int4 = mutableDateTime1.getMillisOfDay();
        int int5 = mutableDateTime1.getHourOfDay();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.minuteOfHour();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight15.withField(dateTimeFieldType16, (int) 'a');
        org.joda.time.DateTime dateTime20 = dateTime10.withField(dateTimeFieldType16, (int) (short) 0);
        org.joda.time.DateTime dateTime22 = dateTime10.plusHours((int) (short) 1);
        int int23 = dateTime22.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property24 = dateTime22.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.secondOfMinute();
        int int26 = dateTime22.get(dateTimeFieldType25);
        boolean boolean28 = dateTime22.isAfter(1645454854107L);
        org.joda.time.DateTime dateTime30 = dateTime22.plusDays(14);
        org.joda.time.DateTime dateTime32 = dateTime30.minus((long) 0);
        org.joda.time.DateTime dateTime34 = dateTime32.plus((long) (-143999));
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.hours();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(periodType35);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime1, (org.joda.time.ReadableInstant) dateTime34, periodType35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime10", (instant0.compareTo(dateTime10) == 0) == instant0.equals(dateTime10));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 'a', dateTimeZone15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate13, (org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight20, readableDuration21);
        org.joda.time.Duration duration23 = period17.toDurationTo((org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(1L, dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(1L, dateTimeZone28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight29, readableDuration30);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType33 = periodType32.withSecondsRemoved();
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight26, (org.joda.time.ReadableInstant) dateMidnight29, periodType33);
        org.joda.time.PeriodType periodType35 = periodType33.withWeeksRemoved();
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration23, periodType33);
        org.joda.time.Interval interval37 = new org.joda.time.Interval(readableInstant6, (org.joda.time.ReadableDuration) duration23);
        org.joda.time.Duration duration38 = duration23.toDuration();
        org.joda.time.Instant instant40 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration23, 493);
        boolean boolean42 = instant40.isBefore((long) (-19092));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant40 and dateTime4", (instant40.compareTo(dateTime4) == 0) == instant40.equals(dateTime4));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime4.era();
        org.joda.time.DateTime dateTime18 = dateTime4.withTimeAtStartOfDay();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(locale19);
        int int21 = calendar20.getFirstDayOfWeek();
        boolean boolean22 = dateTime4.equals((java.lang.Object) calendar20);
        calendar20.set(23, 53281887, 53221690, 0, (int) 'x');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 'a', dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) localDate6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = dateMidnight12.getZone();
        org.joda.time.DateTime dateTime14 = localDate6.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.Period period16 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 'a', dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 'a', dateTimeZone24);
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate22, (org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate localDate28 = localDate22.withDayOfMonth(13);
        org.joda.time.Chronology chronology29 = localDate28.getChronology();
        mutablePeriod17.setPeriod((long) 10, (-599990L), chronology29);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((-1968L), chronology29);
        org.joda.time.DateTimeZone dateTimeZone32 = chronology29.getZone();
        org.joda.time.DateTime dateTime33 = localDate6.toDateTimeAtMidnight(dateTimeZone32);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight10 and dateTime33", (dateMidnight10.compareTo(dateTime33) == 0) == dateMidnight10.equals(dateTime33));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTime.Property property8 = dateTime4.millisOfDay();
        org.joda.time.DateTime dateTime9 = property8.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime9", (instant0.compareTo(dateTime9) == 0) == instant0.equals(dateTime9));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(1L, dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight5, readableDuration6);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight2, (org.joda.time.ReadableInstant) dateMidnight5, periodType9);
        org.joda.time.DateMidnight.Property property11 = dateMidnight2.year();
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str13 = property11.getAsText(locale12);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime15 = instant14.toMutableDateTime();
        mutableDateTime15.setSecondOfMinute((int) (byte) 1);
        mutableDateTime15.setSecondOfMinute(52);
        mutableDateTime15.setMillisOfSecond((int) ' ');
        long long22 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = dateMidnight27.getZone();
        mutableDateTime15.setZoneRetainFields(dateTimeZone28);
        long long31 = dateTimeZone28.convertUTCToLocal((long) 5);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.now(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime32", (instant14.compareTo(dateTime32) == 0) == instant14.equals(dateTime32));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime6 = mutableDateTime1.toDateTimeISO();
        org.joda.time.Period period8 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 'a', dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 'a', dateTimeZone16);
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate14, (org.joda.time.ReadablePartial) localDate17);
        org.joda.time.LocalDate localDate20 = localDate14.withDayOfMonth(13);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        mutablePeriod9.setPeriod((long) 10, (-599990L), chronology21);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((-1968L), chronology21);
        mutableDateTime1.setChronology(chronology21);
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.now(chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime6", (mutableDateTime1.compareTo(dateTime6) == 0) == mutableDateTime1.equals(dateTime6));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property4 = timeOfDay3.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        boolean boolean4 = property3.isLeap();
        org.joda.time.DateMidnight dateMidnight5 = property3.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        boolean boolean15 = localDate12.isSupported(dateTimeFieldType14);
        org.joda.time.Chronology chronology16 = localDate12.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.minutes();
        java.lang.String str18 = chronology16.toString();
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) 6, chronology16);
        org.joda.time.Instant instant20 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime21 = instant20.toMutableDateTime();
        mutableDateTime21.setSecondOfMinute((int) (byte) 1);
        mutableDateTime21.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime26 = mutableDateTime21.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 'a', dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 'a', dateTimeZone31);
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate29, (org.joda.time.ReadablePartial) localDate32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(1L, dateTimeZone35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight36, readableDuration37);
        org.joda.time.Duration duration39 = period33.toDurationTo((org.joda.time.ReadableInstant) dateMidnight36);
        mutableDateTime21.add((org.joda.time.ReadableDuration) duration39, 53221515);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight19.plus((org.joda.time.ReadableDuration) duration39);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight5.minus((org.joda.time.ReadableDuration) duration39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight43 and dateMidnight19", (dateMidnight43.compareTo(dateMidnight19) == 0) == dateMidnight43.equals(dateMidnight19));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundFloor();
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 'a', dateTimeZone13);
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate11, (org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(1L, dateTimeZone17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight18, readableDuration19);
        org.joda.time.Duration duration21 = period15.toDurationTo((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.Instant instant22 = instant8.minus((org.joda.time.ReadableDuration) duration21);
        mutableDateTime7.add((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((java.lang.Object) mutableDateTime7);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime7.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant24", (mutableDateTime7.compareTo(instant24) == 0) == mutableDateTime7.equals(instant24));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType2 = periodType1.withWeeksRemoved();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight7 = dateTime6.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = dateMidnight12.getZone();
        org.joda.time.DateTime dateTime14 = dateTime6.toDateTime(dateTimeZone13);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.weeks();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 'a', dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 'a', dateTimeZone22);
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate20, (org.joda.time.ReadablePartial) localDate23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = localDate23.isSupported(dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = localDate23.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.dayOfYear();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.millisOfDay();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 493, (long) 53221161, periodType17, chronology27);
        org.joda.time.DateTimeField dateTimeField32 = chronology27.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime6.toMutableDateTime(chronology27);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 53221848, periodType1, chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and mutableDateTime33", (dateTime6.compareTo(mutableDateTime33) == 0) == dateTime6.equals(mutableDateTime33));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 'a', dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) localDate6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight10, readableDuration11);
        org.joda.time.Duration duration13 = period7.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTime();
        mutableDateTime16.setSecondOfMinute((int) (byte) 1);
        mutableDateTime16.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.year();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.secondOfDay();
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.Instant instant24 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 'a', dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 'a', dateTimeZone30);
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate28, (org.joda.time.ReadablePartial) localDate31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(1L, dateTimeZone34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight35, readableDuration36);
        org.joda.time.Duration duration38 = period32.toDurationTo((org.joda.time.ReadableInstant) dateMidnight35);
        mutableDateTime25.add((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Interval interval40 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime16, (org.joda.time.ReadableDuration) duration38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant24", (mutableDateTime0.compareTo(instant24) == 0) == mutableDateTime0.equals(instant24));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime4.era();
        org.joda.time.DateTime dateTime18 = property17.withMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime18", (instant0.compareTo(dateTime18) == 0) == instant0.equals(dateTime18));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.Period period11 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 'a', dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 'a', dateTimeZone19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate17, (org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate23 = localDate17.withDayOfMonth(13);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        mutablePeriod12.setPeriod((long) 10, (-599990L), chronology24);
        mutablePeriod12.setWeeks(2022);
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod29 = period28.toMutablePeriod();
        mutablePeriod29.setPeriod((-1L));
        mutablePeriod12.add((org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.DateTime dateTime33 = dateTime4.minus((org.joda.time.ReadablePeriod) mutablePeriod29);
        int int34 = mutablePeriod29.getHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        java.util.Calendar.Builder builder5 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder8 = builder5.set(0, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(1L, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateMidnight13.getZone();
        int int16 = dateTimeZone14.getStandardOffset((long) 32769);
        java.util.Locale locale18 = java.util.Locale.US;
        java.lang.String str19 = dateTimeZone14.getShortName((long) 1970, locale18);
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.lang.String str21 = locale18.getDisplayCountry(locale20);
        java.util.Calendar.Builder builder22 = builder5.setLocale(locale20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withLocale(locale20);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(1L, dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(1L, dateTimeZone28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight29, readableDuration30);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType33 = periodType32.withSecondsRemoved();
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight26, (org.joda.time.ReadableInstant) dateMidnight29, periodType33);
        org.joda.time.DateMidnight.Property property35 = dateMidnight26.year();
        java.util.Locale locale36 = java.util.Locale.ITALIAN;
        java.lang.String str37 = property35.getAsText(locale36);
        org.joda.time.Instant instant38 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime39 = instant38.toMutableDateTime();
        mutableDateTime39.setSecondOfMinute((int) (byte) 1);
        mutableDateTime39.setSecondOfMinute(52);
        mutableDateTime39.setMillisOfSecond((int) ' ');
        long long46 = property35.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(1L, dateTimeZone48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight49.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone52 = dateMidnight51.getZone();
        mutableDateTime39.setZoneRetainFields(dateTimeZone52);
        long long55 = dateTimeZone52.convertUTCToLocal((long) 5);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(dateTimeZone52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter2.withZone(dateTimeZone52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant38 and dateTime56", (instant38.compareTo(dateTime56) == 0) == instant38.equals(dateTime56));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setSecondOfMinute(52);
        mutableDateTime1.setMillisOfSecond((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime1.add(readablePeriod8);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 'a', dateTimeZone15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate13, (org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight20, readableDuration21);
        org.joda.time.Duration duration23 = period17.toDurationTo((org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.Instant instant24 = instant10.minus((org.joda.time.ReadableDuration) duration23);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration23, 53221655);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate29.toDateTimeAtCurrentTime(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 'a', dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 'a', dateTimeZone36);
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate34, (org.joda.time.ReadablePartial) localDate37);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(1L, dateTimeZone40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight41, readableDuration42);
        org.joda.time.Duration duration44 = period38.toDurationTo((org.joda.time.ReadableInstant) dateMidnight41);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(1L, dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight(1L, dateTimeZone49);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight50, readableDuration51);
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType54 = periodType53.withSecondsRemoved();
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight47, (org.joda.time.ReadableInstant) dateMidnight50, periodType54);
        org.joda.time.PeriodType periodType56 = periodType54.withWeeksRemoved();
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableDuration) duration44, periodType54);
        org.joda.time.Interval interval58 = new org.joda.time.Interval(readableInstant27, (org.joda.time.ReadableDuration) duration44);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate(chronology59);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = localDate60.toDateTimeAtCurrentTime(dateTimeZone61);
        org.joda.time.DateMidnight dateMidnight63 = dateTime62.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight(1L, dateTimeZone65);
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight66.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone69 = dateMidnight68.getZone();
        org.joda.time.DateTime dateTime70 = dateTime62.toDateTime(dateTimeZone69);
        org.joda.time.Interval interval71 = interval58.withEnd((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Duration duration72 = interval58.toDuration();
        org.joda.time.Duration duration73 = duration72.toDuration();
        boolean boolean74 = duration23.isEqual((org.joda.time.ReadableDuration) duration73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime31", (instant0.compareTo(dateTime31) == 0) == instant0.equals(dateTime31));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTime.Property property8 = dateTime4.millisOfDay();
        org.joda.time.DateTime dateTime9 = property8.withMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setSecondOfMinute(52);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = dateMidnight17.getZone();
        org.joda.time.DateTime dateTime19 = localDate11.toDateTimeAtMidnight(dateTimeZone18);
        boolean boolean21 = dateTimeZone18.isStandardOffset((long) (byte) 10);
        mutableDateTime1.setZone(dateTimeZone18);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime1.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime1.copy();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.weekOfWeekyear();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate27.toDateTimeAtCurrentTime(dateTimeZone28);
        org.joda.time.DateMidnight dateMidnight30 = dateTime29.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(1L, dateTimeZone32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone36 = dateMidnight35.getZone();
        org.joda.time.DateTime dateTime37 = dateTime29.toDateTime(dateTimeZone36);
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime24, dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime29", (instant0.compareTo(dateTime29) == 0) == instant0.equals(dateTime29));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.Period period11 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 'a', dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 'a', dateTimeZone19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate17, (org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate23 = localDate17.withDayOfMonth(13);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        mutablePeriod12.setPeriod((long) 10, (-599990L), chronology24);
        mutablePeriod12.setWeeks(2022);
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod29 = period28.toMutablePeriod();
        mutablePeriod29.setPeriod((-1L));
        mutablePeriod12.add((org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.DateTime dateTime33 = dateTime4.minus((org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.DateTime dateTime34 = dateTime4.toDateTimeISO();
        org.joda.time.DateTime dateTime36 = dateTime34.withMillis((long) 53221938);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime34", (instant0.compareTo(dateTime34) == 0) == instant0.equals(dateTime34));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 'a', dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) localDate6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight10, readableDuration11);
        org.joda.time.Duration duration13 = period7.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTime();
        mutableDateTime16.setSecondOfMinute((int) (byte) 1);
        mutableDateTime16.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.year();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.secondOfDay();
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime16);
        java.util.Locale locale24 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(locale24);
        java.lang.String str26 = calendar25.getCalendarType();
        boolean boolean27 = mutableDateTime0.equals((java.lang.Object) str26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(53221655);
        mutableDateTime0.setZone(dateTimeZone29);
        org.joda.time.Instant instant31 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDate33.toDateTimeAtCurrentTime(dateTimeZone34);
        int int36 = instant31.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) 'a', dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 'a', dateTimeZone41);
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate39, (org.joda.time.ReadablePartial) localDate42);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = null;
        boolean boolean45 = localDate42.isSupported(dateTimeFieldType44);
        org.joda.time.Chronology chronology46 = localDate42.getChronology();
        org.joda.time.DateTime dateTime47 = dateTime35.toDateTime(chronology46);
        org.joda.time.DateTime dateTime49 = dateTime35.plusWeeks(70);
        mutableDateTime0.setTime((org.joda.time.ReadableInstant) dateTime35);
        long long51 = mutableDateTime0.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime35", (instant15.compareTo(dateTime35) == 0) == instant15.equals(dateTime35));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 'a', dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight14, readableDuration15);
        org.joda.time.Duration duration17 = period11.toDurationTo((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(1L, dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight23, readableDuration24);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType27 = periodType26.withSecondsRemoved();
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight20, (org.joda.time.ReadableInstant) dateMidnight23, periodType27);
        org.joda.time.PeriodType periodType29 = periodType27.withWeeksRemoved();
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration17, periodType27);
        org.joda.time.Period period31 = duration17.toPeriod();
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration17, 366);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 'a', dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) 'a', dateTimeZone38);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate36, (org.joda.time.ReadablePartial) localDate39);
        org.joda.time.LocalDate localDate42 = localDate36.withDayOfMonth(13);
        org.joda.time.Chronology chronology43 = localDate42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.hourOfHalfday();
        boolean boolean45 = duration17.equals((java.lang.Object) dateTimeField44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight(1L, dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight(1L, dateTimeZone50);
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight51, readableDuration52);
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType55 = periodType54.withSecondsRemoved();
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight48, (org.joda.time.ReadableInstant) dateMidnight51, periodType55);
        org.joda.time.DateMidnight.Property property57 = dateMidnight48.year();
        java.util.Locale locale58 = java.util.Locale.ITALIAN;
        java.lang.String str59 = property57.getAsText(locale58);
        org.joda.time.Instant instant60 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime61 = instant60.toMutableDateTime();
        mutableDateTime61.setSecondOfMinute((int) (byte) 1);
        mutableDateTime61.setSecondOfMinute(52);
        mutableDateTime61.setMillisOfSecond((int) ' ');
        long long68 = property57.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime61);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight(1L, dateTimeZone70);
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight71.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone74 = dateMidnight73.getZone();
        mutableDateTime61.setZoneRetainFields(dateTimeZone74);
        long long77 = dateTimeZone74.convertUTCToLocal((long) 5);
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime(dateTimeZone74);
        org.joda.time.DateTime dateTime80 = dateTime78.minusWeeks(53221660);
        org.joda.time.Interval interval81 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateTime80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant60", (mutableDateTime0.compareTo(instant60) == 0) == mutableDateTime0.equals(instant60));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(1L, dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight5, readableDuration6);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight2, (org.joda.time.ReadableInstant) dateMidnight5, periodType9);
        java.lang.String str11 = period10.toString();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtCurrentTime(dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight16 = dateTime15.toDateMidnight();
        org.joda.time.DateTime dateTime18 = dateTime15.plusMillis((-1));
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 10);
        int int21 = mutablePeriod20.getWeeks();
        org.joda.time.Period period23 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod24 = period23.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 'a', dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 'a', dateTimeZone31);
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate29, (org.joda.time.ReadablePartial) localDate32);
        org.joda.time.LocalDate localDate35 = localDate29.withDayOfMonth(13);
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        mutablePeriod24.setPeriod((long) 10, (-599990L), chronology36);
        mutablePeriod20.setPeriod((long) 53221550, chronology36);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((java.lang.Object) dateTime18, chronology36);
        org.joda.time.Period period40 = new org.joda.time.Period((java.lang.Object) str11, chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight16 and dateMidnight39", (dateMidnight16.compareTo(dateMidnight39) == 0) == dateMidnight16.equals(dateMidnight39));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTime.Property property8 = dateTime4.millisOfDay();
        org.joda.time.DateTime dateTime9 = property8.withMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfYear();
        java.lang.String str3 = property2.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod1 = period0.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate6, (org.joda.time.ReadablePartial) localDate9);
        org.joda.time.LocalDate localDate12 = localDate6.withDayOfMonth(13);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        mutablePeriod1.setPeriod((long) 10, (-599990L), chronology13);
        mutablePeriod1.addSeconds(13);
        mutablePeriod1.clear();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localDate21.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 'a', dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 'a', dateTimeZone28);
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate26, (org.joda.time.ReadablePartial) localDate29);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(1L, dateTimeZone32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight33, readableDuration34);
        org.joda.time.Duration duration36 = period30.toDurationTo((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(1L, dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(1L, dateTimeZone41);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight42, readableDuration43);
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType46 = periodType45.withSecondsRemoved();
        org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight39, (org.joda.time.ReadableInstant) dateMidnight42, periodType46);
        org.joda.time.PeriodType periodType48 = periodType46.withWeeksRemoved();
        org.joda.time.Period period49 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration36, periodType46);
        org.joda.time.Interval interval50 = new org.joda.time.Interval(readableInstant19, (org.joda.time.ReadableDuration) duration36);
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        mutablePeriod1.setPeriod((long) 53221515, chronology51);
        mutablePeriod1.addWeeks(10);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight(1L, dateTimeZone56);
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight57.minusMonths((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight59.minusMonths((int) (byte) 10);
        org.joda.time.Instant instant62 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime63 = instant62.toMutableDateTime();
        mutableDateTime63.setSecondOfMinute((int) (byte) 1);
        int int66 = mutableDateTime63.getMillisOfDay();
        int int67 = mutableDateTime63.getHourOfDay();
        int int68 = dateMidnight61.compareTo((org.joda.time.ReadableInstant) mutableDateTime63);
        int int69 = mutableDateTime63.getSecondOfDay();
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime63.minuteOfHour();
        org.joda.time.Instant instant71 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate(chronology72);
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.DateTime dateTime75 = localDate73.toDateTimeAtCurrentTime(dateTimeZone74);
        int int76 = instant71.compareTo((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.LocalDate localDate79 = new org.joda.time.LocalDate((long) 'a', dateTimeZone78);
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.LocalDate localDate82 = new org.joda.time.LocalDate((long) 'a', dateTimeZone81);
        org.joda.time.Period period83 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate79, (org.joda.time.ReadablePartial) localDate82);
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = null;
        boolean boolean85 = localDate82.isSupported(dateTimeFieldType84);
        org.joda.time.Chronology chronology86 = localDate82.getChronology();
        org.joda.time.DateTime dateTime87 = dateTime75.toDateTime(chronology86);
        int int88 = dateTime75.getDayOfWeek();
        mutablePeriod1.setPeriod((org.joda.time.ReadableInstant) mutableDateTime63, (org.joda.time.ReadableInstant) dateTime75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant62", (dateTime23.compareTo(instant62) == 0) == dateTime23.equals(instant62));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtCurrentTime(dateTimeZone4);
        int int6 = instant1.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute(0);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 'a', dateTimeZone14);
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate12, (org.joda.time.ReadablePartial) localDate15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight19, readableDuration20);
        org.joda.time.Duration duration22 = period16.toDurationTo((org.joda.time.ReadableInstant) dateMidnight19);
        org.joda.time.Instant instant23 = instant9.minus((org.joda.time.ReadableDuration) duration22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableDuration) duration22);
        org.joda.time.Period period25 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime27 = dateTime5.withDayOfYear(27);
        int int28 = dateTime27.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime5", (instant1.compareTo(dateTime5) == 0) == instant1.equals(dateTime5));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateTime dateTime6 = dateMidnight5.toDateTimeISO();
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate10, (org.joda.time.ReadablePartial) localDate13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(1L, dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight17, readableDuration18);
        org.joda.time.Duration duration20 = period14.toDurationTo((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant21 = instant7.minus((org.joda.time.ReadableDuration) duration20);
        boolean boolean22 = dateMidnight5.isAfter((org.joda.time.ReadableInstant) instant7);
        org.joda.time.Instant instant24 = instant7.plus((long) (short) 10);
        org.joda.time.DateTime dateTime25 = instant7.toDateTimeISO();
        org.joda.time.Instant instant27 = instant7.withMillis((long) 844);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime25", (instant7.compareTo(dateTime25) == 0) == instant7.equals(dateTime25));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod2 = period1.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 'a', dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate localDate13 = localDate7.withDayOfMonth(13);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        mutablePeriod2.setPeriod((long) 10, (-599990L), chronology14);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((-1968L), chronology14);
        org.joda.time.DateTimeZone dateTimeZone17 = chronology14.getZone();
        long long20 = dateTimeZone17.convertLocalToUTC((long) 3, false);
        java.lang.String str22 = dateTimeZone17.getShortName(0L);
        org.joda.time.Instant instant23 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate25.toDateTimeAtCurrentTime(dateTimeZone26);
        int int28 = instant23.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime30 = dateTime27.withSecondOfMinute(0);
        org.joda.time.Instant instant31 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 'a', dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 'a', dateTimeZone36);
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate34, (org.joda.time.ReadablePartial) localDate37);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(1L, dateTimeZone40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight41, readableDuration42);
        org.joda.time.Duration duration44 = period38.toDurationTo((org.joda.time.ReadableInstant) dateMidnight41);
        org.joda.time.Instant instant45 = instant31.minus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableDuration) duration44);
        boolean boolean47 = dateTimeZone17.equals((java.lang.Object) mutablePeriod46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant23 and dateTime27", (instant23.compareTo(dateTime27) == 0) == instant23.equals(dateTime27));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(1L, dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateMidnight9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime3.toDateTime(dateTimeZone10);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.weeks();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 'a', dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 'a', dateTimeZone19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate17, (org.joda.time.ReadablePartial) localDate20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = localDate20.isSupported(dateTimeFieldType22);
        org.joda.time.Chronology chronology24 = localDate20.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.dayOfYear();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField27 = chronology24.millisOfDay();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 493, (long) 53221161, periodType14, chronology24);
        org.joda.time.DateTimeField dateTimeField29 = chronology24.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime3.toMutableDateTime(chronology24);
        org.joda.time.DateTime.Property property31 = dateTime3.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime30", (dateTime3.compareTo(mutableDateTime30) == 0) == dateTime3.equals(mutableDateTime30));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay3 = dateTime1.toTimeOfDay();
        java.lang.String str4 = timeOfDay3.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        int int10 = instant5.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.DateTimeField dateTimeField14 = localDate12.getField(1);
        java.lang.String str15 = dateTimeField14.getName();
        int int16 = instant5.get(dateTimeField14);
        org.joda.time.Instant instant18 = instant5.plus((long) 'a');
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight4, (org.joda.time.ReadableInstant) instant5);
        org.joda.time.Period period20 = period19.negated();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime9", (instant5.compareTo(dateTime9) == 0) == instant5.equals(dateTime9));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        int int4 = localDate3.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate3.toDateTimeAtStartOfDay(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime6.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 'a', dateTimeZone13);
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate11, (org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        boolean boolean17 = localDate14.isSupported(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.dayOfYear();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.dayOfMonth();
        org.joda.time.DateTime dateTime21 = dateTime8.toDateTime(chronology18);
        org.joda.time.Period period22 = new org.joda.time.Period((long) 24, 0L, chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime21", (dateTime6.compareTo(dateTime21) == 0) == dateTime6.equals(dateTime21));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        boolean boolean12 = dateTime10.isAfter((long) 719);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.year();
        mutableDateTime1.setDayOfMonth(5);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 'a', dateTimeZone14);
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate12, (org.joda.time.ReadablePartial) localDate15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = localDate15.isSupported(dateTimeFieldType17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.Interval interval20 = localDate15.toInterval(dateTimeZone19);
        java.lang.String str21 = interval20.toString();
        org.joda.time.Chronology chronology22 = interval20.getChronology();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate24.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 'a', dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 'a', dateTimeZone31);
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate29, (org.joda.time.ReadablePartial) localDate32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(1L, dateTimeZone35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight36, readableDuration37);
        org.joda.time.Duration duration39 = period33.toDurationTo((org.joda.time.ReadableInstant) dateMidnight36);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(1L, dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(1L, dateTimeZone44);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight45, readableDuration46);
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType49 = periodType48.withSecondsRemoved();
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight42, (org.joda.time.ReadableInstant) dateMidnight45, periodType49);
        org.joda.time.PeriodType periodType51 = periodType49.withWeeksRemoved();
        org.joda.time.Period period52 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableDuration) duration39, periodType49);
        org.joda.time.Interval interval53 = interval20.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration39);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime26", (instant0.compareTo(dateTime26) == 0) == instant0.equals(dateTime26));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withDayOfMonth((int) (short) 1);
        int int7 = dateMidnight4.getWeekyear();
        java.lang.String str9 = dateMidnight4.toString("+00:00");
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 'a', dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 'a', dateTimeZone17);
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate15, (org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate localDate21 = localDate15.withDayOfMonth(13);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        mutablePeriod11.add((long) ' ', chronology22);
        org.joda.time.DurationField durationField24 = chronology22.weekyears();
        org.joda.time.DateTime dateTime25 = dateMidnight4.toDateTime(chronology22);
        org.joda.time.DateTimeField dateTimeField26 = chronology22.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and dateTime25", (dateMidnight4.compareTo(dateTime25) == 0) == dateMidnight4.equals(dateTime25));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(1L, dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight5, readableDuration6);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight2, (org.joda.time.ReadableInstant) dateMidnight5, periodType9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 'a', dateTimeZone15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate13, (org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = localDate16.isSupported(dateTimeFieldType18);
        org.joda.time.Chronology chronology20 = localDate16.getChronology();
        org.joda.time.LocalDate localDate22 = localDate16.minusDays(100);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight5.withFields((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusMonths(53221235);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(1L, dateTimeZone27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight28, readableDuration29);
        int int31 = period30.size();
        java.lang.String str32 = period30.toString();
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.Period period35 = period30.withField(durationFieldType33, 0);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 'a', dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) 'a', dateTimeZone40);
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate38, (org.joda.time.ReadablePartial) localDate41);
        org.joda.time.LocalDate localDate44 = localDate38.withDayOfMonth(13);
        org.joda.time.Chronology chronology45 = localDate44.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.hourOfHalfday();
        org.joda.time.DurationField durationField47 = durationFieldType33.getField(chronology45);
        org.joda.time.DateTimeField dateTimeField48 = chronology45.weekyear();
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight23.withChronology(chronology45);
        org.joda.time.DurationField durationField50 = chronology45.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight49", (dateMidnight2.compareTo(dateMidnight49) == 0) == dateMidnight2.equals(dateMidnight49));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minus(2678400000L);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight17.withField(dateTimeFieldType18, (int) 'a');
        org.joda.time.DateTime dateTime22 = dateTime12.withField(dateTimeFieldType18, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = dateMidnight27.getZone();
        org.joda.time.DateTime dateTime29 = dateTime22.withZoneRetainFields(dateTimeZone28);
        java.lang.String str30 = dateTimeZone28.getID();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 53221161, dateTimeZone28);
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) 53221626, dateTimeZone28);
        org.joda.time.DateTime dateTime33 = dateTime6.withZone(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime33.getZone();
        org.joda.time.Instant instant36 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime37 = instant36.toMutableDateTime();
        mutableDateTime37.setSecondOfMinute((int) (byte) 1);
        int int40 = mutableDateTime37.getMillisOfDay();
        int int41 = mutableDateTime37.getHourOfDay();
        org.joda.time.Period period43 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod44 = period43.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) 'a', dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) 'a', dateTimeZone51);
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate49, (org.joda.time.ReadablePartial) localDate52);
        org.joda.time.LocalDate localDate55 = localDate49.withDayOfMonth(13);
        org.joda.time.Chronology chronology56 = localDate55.getChronology();
        mutablePeriod44.setPeriod((long) 10, (-599990L), chronology56);
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight((-1968L), chronology56);
        org.joda.time.DateTimeZone dateTimeZone59 = chronology56.getZone();
        mutableDateTime37.setZoneRetainFields(dateTimeZone59);
        long long64 = dateTimeZone59.convertLocalToUTC((long) 59, false, (long) 15);
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) 36, dateTimeZone59);
        org.joda.time.DateTime dateTime66 = dateTime33.toDateTime(dateTimeZone59);
        org.joda.time.LocalDate localDate67 = org.joda.time.LocalDate.now(dateTimeZone59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant36", (dateTime3.compareTo(instant36) == 0) == dateTime3.equals(instant36));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight6, readableDuration7);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, (org.joda.time.ReadableInstant) dateMidnight6, periodType10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 'a', dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 'a', dateTimeZone16);
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate14, (org.joda.time.ReadablePartial) localDate17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        boolean boolean20 = localDate17.isSupported(dateTimeFieldType19);
        org.joda.time.Chronology chronology21 = localDate17.getChronology();
        org.joda.time.LocalDate localDate23 = localDate17.minusDays(100);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight6.withFields((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusMonths(53221235);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(1L, dateTimeZone28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight29, readableDuration30);
        int int32 = period31.size();
        java.lang.String str33 = period31.toString();
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.Period period36 = period31.withField(durationFieldType34, 0);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) 'a', dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 'a', dateTimeZone41);
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate39, (org.joda.time.ReadablePartial) localDate42);
        org.joda.time.LocalDate localDate45 = localDate39.withDayOfMonth(13);
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.hourOfHalfday();
        org.joda.time.DurationField durationField48 = durationFieldType34.getField(chronology46);
        org.joda.time.DateTimeField dateTimeField49 = chronology46.weekyear();
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight24.withChronology(chronology46);
        org.joda.time.TimeOfDay timeOfDay51 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (byte) 1, chronology46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and dateMidnight50", (dateMidnight3.compareTo(dateMidnight50) == 0) == dateMidnight3.equals(dateMidnight50));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime4.toDateTime();
        org.joda.time.DateTime.Property property12 = dateTime11.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(1L, dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight5, readableDuration6);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight2, (org.joda.time.ReadableInstant) dateMidnight5, periodType9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 'a', dateTimeZone15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate13, (org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = localDate16.isSupported(dateTimeFieldType18);
        org.joda.time.Chronology chronology20 = localDate16.getChronology();
        org.joda.time.LocalDate localDate22 = localDate16.minusDays(100);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight5.withFields((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusMonths(53221235);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(1L, dateTimeZone27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight28, readableDuration29);
        int int31 = period30.size();
        java.lang.String str32 = period30.toString();
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.Period period35 = period30.withField(durationFieldType33, 0);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 'a', dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) 'a', dateTimeZone40);
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate38, (org.joda.time.ReadablePartial) localDate41);
        org.joda.time.LocalDate localDate44 = localDate38.withDayOfMonth(13);
        org.joda.time.Chronology chronology45 = localDate44.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.hourOfHalfday();
        org.joda.time.DurationField durationField47 = durationFieldType33.getField(chronology45);
        org.joda.time.DateTimeField dateTimeField48 = chronology45.weekyear();
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight23.withChronology(chronology45);
        org.joda.time.DateTimeField dateTimeField50 = chronology45.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight49", (dateMidnight2.compareTo(dateMidnight49) == 0) == dateMidnight2.equals(dateMidnight49));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(0);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getFirstDayOfWeek();
        java.util.Date date3 = calendar1.getTime();
        calendar1.clear();
        java.util.Date date11 = new java.util.Date((int) (byte) -1, 32769, 4, (int) (byte) 1, (int) (short) 10, 11);
        date11.setDate(53221197);
        calendar1.setTime(date11);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtCurrentTime(dateTimeZone19);
        int int21 = instant16.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime23 = dateTime20.withSecondOfMinute(0);
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime25 = instant24.toMutableDateTime();
        mutableDateTime25.setSecondOfMinute((int) (byte) 1);
        mutableDateTime25.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime30 = mutableDateTime25.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 'a', dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 'a', dateTimeZone35);
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate33, (org.joda.time.ReadablePartial) localDate36);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(1L, dateTimeZone39);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight40, readableDuration41);
        org.joda.time.Duration duration43 = period37.toDurationTo((org.joda.time.ReadableInstant) dateMidnight40);
        mutableDateTime25.add((org.joda.time.ReadableDuration) duration43, 53221515);
        org.joda.time.DateTime dateTime46 = dateTime20.minus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime15.plus((org.joda.time.ReadableDuration) duration43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime20", (instant16.compareTo(dateTime20) == 0) == instant16.equals(dateTime20));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minus(2678400000L);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight17.withField(dateTimeFieldType18, (int) 'a');
        org.joda.time.DateTime dateTime22 = dateTime12.withField(dateTimeFieldType18, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = dateMidnight27.getZone();
        org.joda.time.DateTime dateTime29 = dateTime22.withZoneRetainFields(dateTimeZone28);
        java.lang.String str30 = dateTimeZone28.getID();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 53221161, dateTimeZone28);
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) 53221626, dateTimeZone28);
        org.joda.time.DateTime dateTime33 = dateTime6.withZone(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime33.getZone();
        org.joda.time.Instant instant36 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime37 = instant36.toMutableDateTime();
        mutableDateTime37.setSecondOfMinute((int) (byte) 1);
        int int40 = mutableDateTime37.getMillisOfDay();
        int int41 = mutableDateTime37.getHourOfDay();
        org.joda.time.Period period43 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod44 = period43.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) 'a', dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) 'a', dateTimeZone51);
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate49, (org.joda.time.ReadablePartial) localDate52);
        org.joda.time.LocalDate localDate55 = localDate49.withDayOfMonth(13);
        org.joda.time.Chronology chronology56 = localDate55.getChronology();
        mutablePeriod44.setPeriod((long) 10, (-599990L), chronology56);
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight((-1968L), chronology56);
        org.joda.time.DateTimeZone dateTimeZone59 = chronology56.getZone();
        mutableDateTime37.setZoneRetainFields(dateTimeZone59);
        long long64 = dateTimeZone59.convertLocalToUTC((long) 59, false, (long) 15);
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) 36, dateTimeZone59);
        org.joda.time.DateTime dateTime66 = dateTime33.toDateTime(dateTimeZone59);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant36", (dateTime3.compareTo(instant36) == 0) == dateTime3.equals(instant36));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        boolean boolean4 = dateTimeFormatter3.isParser();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight15, readableDuration16);
        org.joda.time.Duration duration18 = period12.toDurationTo((org.joda.time.ReadableInstant) dateMidnight15);
        mutableDateTime5.add((org.joda.time.ReadableDuration) duration18);
        org.joda.time.Instant instant20 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime21 = instant20.toMutableDateTime();
        mutableDateTime21.setSecondOfMinute((int) (byte) 1);
        mutableDateTime21.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.year();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.secondOfDay();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime21);
        java.util.Locale locale29 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(locale29);
        java.lang.String str31 = calendar30.getCalendarType();
        boolean boolean32 = mutableDateTime5.equals((java.lang.Object) str31);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(53221655);
        mutableDateTime5.setZone(dateTimeZone34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter3.withZone(dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and mutableDateTime21", (mutableDateTime5.compareTo(mutableDateTime21) == 0) == mutableDateTime5.equals(mutableDateTime21));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withDayOfMonth((int) (short) 1);
        int int7 = dateMidnight4.getWeekyear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.plusDays((int) (short) 10);
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        java.util.Calendar calendar12 = dateMidnight9.toCalendar(locale10);
        java.util.Calendar.Builder builder13 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder16 = builder13.set(0, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateMidnight21.getZone();
        int int24 = dateTimeZone22.getStandardOffset((long) 32769);
        java.util.Locale locale26 = java.util.Locale.US;
        java.lang.String str27 = dateTimeZone22.getShortName((long) 1970, locale26);
        java.util.Locale locale28 = java.util.Locale.KOREAN;
        java.lang.String str29 = locale26.getDisplayCountry(locale28);
        java.util.Calendar.Builder builder30 = builder13.setLocale(locale28);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder32 = builder30.setTimeZone(timeZone31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(1L, dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone38 = dateMidnight37.getZone();
        int int40 = dateTimeZone38.getStandardOffset((long) 32769);
        java.util.Locale locale42 = java.util.Locale.US;
        java.lang.String str43 = dateTimeZone38.getShortName((long) 1970, locale42);
        java.util.Locale locale44 = java.util.Locale.KOREAN;
        java.lang.String str45 = locale42.getDisplayCountry(locale44);
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone31, locale42);
        boolean boolean47 = calendar12.before((java.lang.Object) timeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar46", (calendar11.compareTo(calendar46) == 0) == calendar11.equals(calendar46));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 'a', dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) localDate6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight10, readableDuration11);
        org.joda.time.Duration duration13 = period7.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTime();
        mutableDateTime16.setSecondOfMinute((int) (byte) 1);
        mutableDateTime16.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.year();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.secondOfDay();
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime16);
        java.util.Locale locale24 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(locale24);
        java.lang.String str26 = calendar25.getCalendarType();
        boolean boolean27 = mutableDateTime0.equals((java.lang.Object) str26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(53221655);
        mutableDateTime0.setZone(dateTimeZone29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField32 = property31.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and mutableDateTime16", (mutableDateTime0.compareTo(mutableDateTime16) == 0) == mutableDateTime0.equals(mutableDateTime16));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property6 = dateMidnight2.dayOfMonth();
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.withField(dateTimeFieldType15, (int) 'a');
        boolean boolean18 = dateMidnight9.isSupported(dateTimeFieldType15);
        org.joda.time.YearMonthDay yearMonthDay19 = dateMidnight9.toYearMonthDay();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) (byte) 100, 53221515, (int) (byte) 100, 53221161, 3, (int) 'a', (int) (byte) 100, 8);
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay19.plus((org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay19.withDayOfMonth(4);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(1L, dateTimeZone33);
        org.joda.time.DateMidnight.Property property35 = dateMidnight34.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight34.minusDays((int) 'a');
        org.joda.time.Instant instant38 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime39 = instant38.toMutableDateTime();
        mutableDateTime39.setSecondOfMinute((int) (byte) 1);
        mutableDateTime39.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime44 = mutableDateTime39.toDateTimeISO();
        int int45 = mutableDateTime39.getMillisOfSecond();
        boolean boolean46 = mutableDateTime39.isAfterNow();
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime48 = instant47.toMutableDateTime();
        mutableDateTime48.setSecondOfMinute((int) (byte) 1);
        mutableDateTime48.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime48.year();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime48.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property54.getFieldType();
        mutableDateTime39.set(dateTimeFieldType55, 31);
        boolean boolean58 = dateMidnight34.isSupported(dateTimeFieldType55);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours(49);
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((java.lang.Object) dateMidnight34, dateTimeZone60);
        org.joda.time.Interval interval62 = yearMonthDay31.toInterval(dateTimeZone60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and mutableDateTime61", (dateMidnight2.compareTo(mutableDateTime61) == 0) == dateMidnight2.equals(mutableDateTime61));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale3);
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone0, locale3);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) calendar6);
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromCalendarFields(calendar6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime7 and localDateTime8", (localDateTime7.compareTo(localDateTime8) == 0) == localDateTime7.equals(localDateTime8));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set(0, (int) (short) -1);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone4.observesDaylightTime();
        java.util.Calendar.Builder builder6 = builder3.setTimeZone(timeZone4);
        java.util.Locale locale9 = new java.util.Locale("Mon Feb 21 14:47:55 GMT+00:00 2022", "8 Jun 150344 01:10:11 GMT");
        boolean boolean10 = locale9.hasExtensions();
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = locale11.getDisplayName();
        java.lang.String str13 = locale11.getVariant();
        java.lang.String str14 = locale9.getDisplayVariant(locale11);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone4, locale11);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone16);
        timeZone16.setID("4437072");
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.DateMidnight.Property property23 = dateMidnight22.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight22.minusDays((int) 'a');
        org.joda.time.DateTime dateTime26 = dateMidnight25.toDateTimeISO();
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 'a', dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 'a', dateTimeZone32);
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate30, (org.joda.time.ReadablePartial) localDate33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(1L, dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight37, readableDuration38);
        org.joda.time.Duration duration40 = period34.toDurationTo((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.Instant instant41 = instant27.minus((org.joda.time.ReadableDuration) duration40);
        boolean boolean42 = dateMidnight25.isAfter((org.joda.time.ReadableInstant) instant27);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(1L, dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight(1L, dateTimeZone47);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight48.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone51 = dateMidnight50.getZone();
        int int53 = dateTimeZone51.getStandardOffset((long) 32769);
        java.util.Locale locale55 = java.util.Locale.US;
        java.lang.String str56 = dateTimeZone51.getShortName((long) 1970, locale55);
        org.joda.time.DateTime dateTime57 = dateMidnight45.toDateTime(dateTimeZone51);
        boolean boolean58 = instant27.isEqual((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime.Property property59 = dateTime57.era();
        int int60 = dateTime57.getDayOfYear();
        org.joda.time.DateTime.Property property61 = dateTime57.year();
        org.joda.time.DateTimeField dateTimeField62 = property61.getField();
        java.util.Locale locale63 = java.util.Locale.JAPAN;
        java.lang.String str64 = property61.getAsShortText(locale63);
        java.util.Calendar calendar65 = java.util.Calendar.getInstance(timeZone16, locale63);
        java.lang.String str66 = locale63.getCountry();
        java.util.Set<java.lang.Character> charSet67 = locale63.getExtensionKeys();
        java.lang.String str68 = timeZone4.getDisplayName(locale63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar65", (calendar15.compareTo(calendar65) == 0) == calendar15.equals(calendar65));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight15.withField(dateTimeFieldType16, (int) 'a');
        org.joda.time.Period period19 = new org.joda.time.Period();
        org.joda.time.Period period21 = period19.minusYears(10);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight18.withPeriodAdded((org.joda.time.ReadablePeriod) period21, 13);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.withYearOfEra(47);
        int int26 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) dateMidnight25);
        org.joda.time.Period period27 = new org.joda.time.Period();
        org.joda.time.Period period29 = period27.minusYears(10);
        org.joda.time.Period period31 = period27.withMillis(1961);
        org.joda.time.Period period33 = period31.plusMonths(53281180);
        boolean boolean34 = dateTimeZone5.equals((java.lang.Object) 53281180);
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(dateTimeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = localDate39.toDateTimeAtCurrentTime(dateTimeZone40);
        org.joda.time.DateMidnight dateMidnight42 = dateTime41.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.withDayOfMonth((int) (short) 1);
        int int45 = dateMidnight42.getWeekyear();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight42.plusDays((int) (short) 10);
        java.util.Locale locale48 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(locale48);
        java.util.Calendar calendar50 = dateMidnight47.toCalendar(locale48);
        org.joda.time.Instant instant51 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime52 = instant51.toMutableDateTime();
        mutableDateTime52.setSecondOfMinute((int) (byte) 1);
        mutableDateTime52.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime52.year();
        mutableDateTime52.setDayOfMonth(5);
        java.util.TimeZone timeZone61 = java.util.TimeZone.getTimeZone("P8Y");
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight(1L, dateTimeZone63);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight(1L, dateTimeZone66);
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight67, readableDuration68);
        org.joda.time.PeriodType periodType70 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType71 = periodType70.withSecondsRemoved();
        org.joda.time.Period period72 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight64, (org.joda.time.ReadableInstant) dateMidnight67, periodType71);
        org.joda.time.DateMidnight.Property property73 = dateMidnight64.year();
        java.util.Locale locale74 = java.util.Locale.ITALIAN;
        java.lang.String str75 = property73.getAsText(locale74);
        java.util.Locale locale76 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale76);
        java.lang.String str78 = locale74.getDisplayVariant(locale76);
        java.util.Calendar calendar79 = java.util.Calendar.getInstance(timeZone61, locale74);
        java.util.Calendar calendar80 = mutableDateTime52.toCalendar(locale74);
        java.lang.String str81 = locale48.getDisplayVariant(locale74);
        java.lang.String str82 = dateTimeZone5.getShortName(1645454932638L, locale74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar49 and calendar79", (calendar49.compareTo(calendar79) == 0) == calendar49.equals(calendar79));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        int int2 = localDate1.getDayOfYear();
        org.joda.time.LocalDate.Property property3 = localDate1.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(9);
        org.joda.time.DateTime dateTime6 = localDate1.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = localDate1.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology8 = localDate1.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime7", (dateTime6.compareTo(dateTime7) == 0) == dateTime6.equals(dateTime7));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int3 = calendar1.getActualMaximum(3);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone4);
        timeZone4.setID("4437072");
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.DateMidnight.Property property11 = dateMidnight10.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.minusDays((int) 'a');
        org.joda.time.DateTime dateTime14 = dateMidnight13.toDateTimeISO();
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 'a', dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 'a', dateTimeZone20);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate18, (org.joda.time.ReadablePartial) localDate21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight25, readableDuration26);
        org.joda.time.Duration duration28 = period22.toDurationTo((org.joda.time.ReadableInstant) dateMidnight25);
        org.joda.time.Instant instant29 = instant15.minus((org.joda.time.ReadableDuration) duration28);
        boolean boolean30 = dateMidnight13.isAfter((org.joda.time.ReadableInstant) instant15);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(1L, dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(1L, dateTimeZone35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone39 = dateMidnight38.getZone();
        int int41 = dateTimeZone39.getStandardOffset((long) 32769);
        java.util.Locale locale43 = java.util.Locale.US;
        java.lang.String str44 = dateTimeZone39.getShortName((long) 1970, locale43);
        org.joda.time.DateTime dateTime45 = dateMidnight33.toDateTime(dateTimeZone39);
        boolean boolean46 = instant15.isEqual((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime.Property property47 = dateTime45.era();
        int int48 = dateTime45.getDayOfYear();
        org.joda.time.DateTime.Property property49 = dateTime45.year();
        org.joda.time.DateTimeField dateTimeField50 = property49.getField();
        java.util.Locale locale51 = java.util.Locale.JAPAN;
        java.lang.String str52 = property49.getAsShortText(locale51);
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone4, locale51);
        int int55 = timeZone4.getOffset((long) 36);
        timeZone4.setID("2022-02-21T14:47:50.386");
        java.util.Locale locale60 = new java.util.Locale("1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z", "Feb");
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(timeZone4, locale60);
        calendar1.setTimeZone(timeZone4);
        boolean boolean63 = timeZone4.observesDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar53", (calendar1.compareTo(calendar53) == 0) == calendar1.equals(calendar53));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.DateTime dateTime13 = localDate5.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate5.minusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate17.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight20 = dateTime19.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(1L, dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = dateMidnight25.getZone();
        org.joda.time.DateTime dateTime27 = dateTime19.toDateTime(dateTimeZone26);
        java.lang.String str29 = dateTimeZone26.getShortName((long) 9);
        java.lang.String str31 = dateTimeZone26.getNameKey(1645454978432L);
        org.joda.time.Interval interval32 = localDate5.toInterval(dateTimeZone26);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(chronology33);
        int int35 = localDate34.getDayOfYear();
        org.joda.time.LocalDate.Property property36 = localDate34.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours(9);
        org.joda.time.DateTime dateTime39 = localDate34.toDateTimeAtCurrentTime(dateTimeZone38);
        long long41 = dateTimeZone26.getMillisKeepLocal(dateTimeZone38, (long) 53281119);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime39", (dateTime19.compareTo(dateTime39) == 0) == dateTime19.equals(dateTime39));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.year();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight12, readableDuration13);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType16 = periodType15.withSecondsRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight9, (org.joda.time.ReadableInstant) dateMidnight12, periodType16);
        org.joda.time.DateMidnight.Property property18 = dateMidnight9.year();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str20 = property18.getAsText(locale19);
        int int21 = property6.getMaximumShortTextLength(locale19);
        org.joda.time.MutableDateTime mutableDateTime23 = property6.add((long) 914);
        org.joda.time.MutableDateTime mutableDateTime24 = property6.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime25 = property6.roundHalfCeiling();
        mutableDateTime25.addMonths(53281067);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime25.toMutableDateTime();
        org.joda.time.Instant instant29 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime30 = instant29.toMutableDateTime();
        mutableDateTime30.setSecondOfMinute((int) (byte) 1);
        mutableDateTime30.setSecondOfMinute(52);
        mutableDateTime30.setMillisOfSecond((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime30.add(readablePeriod37);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours(49);
        mutableDateTime30.setZone(dateTimeZone40);
        long long43 = dateTimeZone40.nextTransition(1645454923773L);
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        mutableDateTime28.setZone(dateTimeZone45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime44", (instant0.compareTo(mutableDateTime44) == 0) == instant0.equals(mutableDateTime44));
    }
}

