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
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withHourOfDay(3);
        int int5 = dateTime4.getSecondOfMinute();
        int int6 = dateTime4.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 1899, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str19 = dateTimeZone18.getID();
        org.joda.time.Interval interval20 = yearMonthDay16.toInterval(dateTimeZone18);
        org.joda.time.MutableInterval mutableInterval21 = interval20.toMutableInterval();
        org.joda.time.Interval interval23 = interval20.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.DateTime dateTime25 = dateTime4.toDateTime(chronology24);
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay((long) 1, chronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime25", (dateTime4.compareTo(dateTime25) == 0) == dateTime4.equals(dateTime25));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Interval interval19 = yearMonthDay15.toInterval(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval22 = interval19.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime3.toDateTime(chronology23);
        org.joda.time.Chronology chronology25 = chronology23.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime24", (dateTime3.compareTo(dateTime24) == 0) == dateTime3.equals(dateTime24));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Interval interval19 = yearMonthDay15.toInterval(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval22 = interval19.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime3.toDateTime(chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime24", (dateTime3.compareTo(dateTime24) == 0) == dateTime3.equals(dateTime24));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Interval interval19 = yearMonthDay15.toInterval(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval22 = interval19.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime3.toDateTime(chronology23);
        long long28 = chronology23.add((long) 5, (long) 8, (int) '#');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime24", (dateTime3.compareTo(dateTime24) == 0) == dateTime3.equals(dateTime24));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withHourOfDay(3);
        int int5 = dateTime4.getSecondOfMinute();
        int int6 = dateTime4.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 1899, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str19 = dateTimeZone18.getID();
        org.joda.time.Interval interval20 = yearMonthDay16.toInterval(dateTimeZone18);
        org.joda.time.MutableInterval mutableInterval21 = interval20.toMutableInterval();
        org.joda.time.Interval interval23 = interval20.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.DateTime dateTime25 = dateTime4.toDateTime(chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((-1L), chronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime25", (dateTime4.compareTo(dateTime25) == 0) == dateTime4.equals(dateTime25));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period8 = period6.plusMillis(100);
        org.joda.time.Period period9 = period6.negated();
        int int10 = period9.getMillis();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 1899, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        int int18 = dateTimeZone16.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str23 = dateTimeZone22.getID();
        org.joda.time.Interval interval24 = yearMonthDay20.toInterval(dateTimeZone22);
        org.joda.time.MutableInterval mutableInterval25 = interval24.toMutableInterval();
        org.joda.time.Interval interval27 = interval24.withStartMillis((long) 32769);
        org.joda.time.Duration duration28 = interval27.toDuration();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str31 = dateTimeZone30.getID();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType34.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray36 = new org.joda.time.DurationFieldType[] { durationFieldType35 };
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.forFields(durationFieldTypeArray36);
        org.joda.time.Period period38 = new org.joda.time.Period((long) ' ', periodType37);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, (org.joda.time.ReadableInstant) dateTime32, periodType37);
        org.joda.time.Period period40 = period9.normalizedStandard(periodType37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(chronology41);
        org.joda.time.DateTime dateTime44 = dateTime42.withHourOfDay(3);
        int int45 = dateTime44.getSecondOfMinute();
        int int46 = dateTime44.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        int int50 = dateTimeZone48.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) 1899, dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        int int54 = dateTimeZone52.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime55 = localDate51.toDateTimeAtCurrentTime(dateTimeZone52);
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str59 = dateTimeZone58.getID();
        org.joda.time.Interval interval60 = yearMonthDay56.toInterval(dateTimeZone58);
        org.joda.time.MutableInterval mutableInterval61 = interval60.toMutableInterval();
        org.joda.time.Interval interval63 = interval60.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.DateTime dateTime65 = dateTime44.toDateTime(chronology64);
        org.joda.time.Period period66 = new org.joda.time.Period((long) 2, periodType37, chronology64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime42", (dateTime32.compareTo(dateTime42) == 0) == dateTime32.equals(dateTime42));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime4 = dateTime1.withYearOfCentury(16);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1899, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.Interval interval18 = yearMonthDay14.toInterval(dateTimeZone16);
        org.joda.time.MutableInterval mutableInterval19 = interval18.toMutableInterval();
        org.joda.time.Interval interval21 = interval18.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology22.getZone();
        org.joda.time.DateTime dateTime24 = dateTime1.toDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 1899, dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str38 = dateTimeZone37.getID();
        org.joda.time.Interval interval39 = yearMonthDay35.toInterval(dateTimeZone37);
        org.joda.time.MutableInterval mutableInterval40 = interval39.toMutableInterval();
        org.joda.time.Interval interval42 = interval39.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(0L, chronology43);
        org.joda.time.DateTime dateTime45 = dateTime24.toDateTime(chronology43);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str48 = dateTimeZone47.getID();
        org.joda.time.DateMidnight dateMidnight49 = org.joda.time.DateMidnight.now(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime45.toDateTime(dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime50", (dateTime1.compareTo(dateTime50) == 0) == dateTime1.equals(dateTime50));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 53, (long) 100, chronology2);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minus((long) (short) 0);
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTimeISO();
        java.lang.String str14 = dateTime12.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = dateTime12.toDateTime(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = timeOfDay23.toDateTimeToday(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.minus((long) (short) 0);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology28);
        boolean boolean30 = dateTime27.isBefore((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime32 = dateTime29.withYearOfCentury(10);
        mutablePeriod3.setPeriod((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime18", (dateTime12.compareTo(dateTime18) == 0) == dateTime12.equals(dateTime18));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) (short) 0);
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        java.lang.String str10 = dateTime8.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime14 = dateTime8.toDateTime(dateTimeZone12);
        org.joda.time.DateTime.Property property15 = dateTime8.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime14", (dateTime8.compareTo(dateTime14) == 0) == dateTime8.equals(dateTime14));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withHourOfDay(3);
        int int8 = dateTime7.getSecondOfMinute();
        int int9 = dateTime7.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 1899, dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime18 = localDate14.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str22 = dateTimeZone21.getID();
        org.joda.time.Interval interval23 = yearMonthDay19.toInterval(dateTimeZone21);
        org.joda.time.MutableInterval mutableInterval24 = interval23.toMutableInterval();
        org.joda.time.Interval interval26 = interval23.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.DateTime dateTime28 = dateTime7.toDateTime(chronology27);
        org.joda.time.Period period29 = new org.joda.time.Period((-1073174400016L), (long) 50, periodType2, chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime28", (dateTime7.compareTo(dateTime28) == 0) == dateTime7.equals(dateTime28));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Period period5 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period7 = org.joda.time.Period.minutes(1);
        java.lang.String str8 = period7.toString();
        org.joda.time.Period period9 = period5.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) (short) 100);
        mutableDateTime3.add((org.joda.time.ReadablePeriod) period7);
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = timeOfDay17.toDateTimeToday(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minus((long) (short) 0);
        org.joda.time.DateTime dateTime22 = dateTime21.toDateTimeISO();
        java.lang.String str23 = dateTime21.toString();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime27 = dateTime21.toDateTime(dateTimeZone25);
        mutableDateTime3.setZone(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime27", (dateTime19.compareTo(dateTime27) == 0) == dateTime19.equals(dateTime27));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Interval interval19 = yearMonthDay15.toInterval(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval22 = interval19.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime3.toDateTime(chronology23);
        org.joda.time.DateTime.Property property25 = dateTime3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime24", (dateTime3.compareTo(dateTime24) == 0) == dateTime3.equals(dateTime24));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withHourOfDay(3);
        int int5 = dateTime4.getSecondOfMinute();
        int int6 = dateTime4.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 1899, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str19 = dateTimeZone18.getID();
        org.joda.time.Interval interval20 = yearMonthDay16.toInterval(dateTimeZone18);
        org.joda.time.MutableInterval mutableInterval21 = interval20.toMutableInterval();
        org.joda.time.Interval interval23 = interval20.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.DateTime dateTime25 = dateTime4.toDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 58, chronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime25", (dateTime4.compareTo(dateTime25) == 0) == dateTime4.equals(dateTime25));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 16, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.dayOfWeek();
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.DateMidnight dateMidnight13 = org.joda.time.DateMidnight.now(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plus((long) 45);
        org.joda.time.DateMidnight.Property property16 = dateMidnight13.weekyear();
        org.joda.time.DateMidnight dateMidnight18 = property16.setCopy("46");
        java.util.Date date24 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.fromDateFields(date24);
        org.joda.time.LocalDate.Property property26 = localDate25.weekOfWeekyear();
        org.joda.time.LocalDate localDate28 = property26.setCopy("45");
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str31 = dateTimeZone30.getID();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime35 = dateTime32.withField(dateTimeFieldType33, 44);
        boolean boolean36 = localDate28.isSupported(dateTimeFieldType33);
        int int37 = dateMidnight18.get(dateTimeFieldType33);
        boolean boolean38 = localDateTime5.isSupported(dateTimeFieldType33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime32", (mutableDateTime4.compareTo(dateTime32) == 0) == mutableDateTime4.equals(dateTime32));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Interval interval19 = yearMonthDay15.toInterval(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval22 = interval19.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime3.toDateTime(chronology23);
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime24", (dateTime3.compareTo(dateTime24) == 0) == dateTime3.equals(dateTime24));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) (short) 0);
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        java.lang.String str10 = dateTime8.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime14 = dateTime8.toDateTime(dateTimeZone12);
        int int16 = dateTimeZone12.getStandardOffset((long) 6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime14", (dateTime6.compareTo(dateTime14) == 0) == dateTime6.equals(dateTime14));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        int int6 = dateTimeZone4.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = timeOfDay12.toDateTimeToday(dateTimeZone13);
        mutableDateTime7.setZoneRetainFields(dateTimeZone13);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone13);
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, 315705601970L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime7", (dateTime3.compareTo(mutableDateTime7) == 0) == dateTime3.equals(mutableDateTime7));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        boolean boolean12 = mutableDateTime3.isEqualNow();
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray18 = timeOfDay17.getFields();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTimeToday(dateTimeZone19);
        org.joda.time.DateTime.Property property21 = dateTime20.monthOfYear();
        boolean boolean22 = mutableDateTime3.isBefore((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime24 = dateTime20.plusHours(9);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 1899, dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        int int32 = dateTimeZone30.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime33 = localDate29.toDateTimeAtCurrentTime(dateTimeZone30);
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str37 = dateTimeZone36.getID();
        org.joda.time.Interval interval38 = yearMonthDay34.toInterval(dateTimeZone36);
        org.joda.time.MutableInterval mutableInterval39 = interval38.toMutableInterval();
        org.joda.time.Interval interval41 = interval38.withStartMillis((long) 32769);
        org.joda.time.Duration duration42 = interval41.toDuration();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str45 = dateTimeZone44.getID();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(dateTimeZone44);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType49 = dateTimeFieldType48.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray50 = new org.joda.time.DurationFieldType[] { durationFieldType49 };
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.forFields(durationFieldTypeArray50);
        org.joda.time.Period period52 = new org.joda.time.Period((long) ' ', periodType51);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration42, (org.joda.time.ReadableInstant) dateTime46, periodType51);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str56 = dateTimeZone55.getID();
        org.joda.time.DateMidnight dateMidnight57 = org.joda.time.DateMidnight.now(dateTimeZone55);
        org.joda.time.Interval interval58 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration42, (org.joda.time.ReadableInstant) dateMidnight57);
        org.joda.time.Interval interval59 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableDuration) duration42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime46", (mutableDateTime3.compareTo(dateTime46) == 0) == mutableDateTime3.equals(dateTime46));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.util.Date date6 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromDateFields(date6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 1899, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        int int18 = dateTimeZone16.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str23 = dateTimeZone22.getID();
        org.joda.time.Interval interval24 = yearMonthDay20.toInterval(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone22);
        org.joda.time.DateTime dateTime26 = localDate7.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (short) 10, dateTimeZone22);
        long long31 = dateTimeZone22.convertLocalToUTC(1277592045000L, true, 31553832000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime26", (dateTime9.compareTo(dateTime26) == 0) == dateTime9.equals(dateTime26));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.util.Date date6 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromDateFields(date6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 1899, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        int int18 = dateTimeZone16.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str23 = dateTimeZone22.getID();
        org.joda.time.Interval interval24 = yearMonthDay20.toInterval(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone22);
        org.joda.time.DateTime dateTime26 = localDate7.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (short) 10, dateTimeZone22);
        org.joda.time.DateTime dateTime29 = dateTime27.minusSeconds((int) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime26", (dateTime9.compareTo(dateTime26) == 0) == dateTime9.equals(dateTime26));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DurationField durationField21 = chronology17.millis();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.dayOfMonth();
        org.joda.time.DurationField durationField23 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField23", Math.signum(durationField21.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField21)));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Interval interval14 = yearMonthDay9.toInterval();
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay9.plus((org.joda.time.ReadablePeriod) period16);
        int int22 = yearMonthDay9.size();
        org.joda.time.Interval interval23 = yearMonthDay9.toInterval();
        boolean boolean24 = interval23.containsNow();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 1899, dateTimeZone26);
        org.joda.time.LocalDate localDate31 = localDate29.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone34 = dateTimeZone33.toTimeZone();
        org.joda.time.DateTime dateTime35 = localDate29.toDateTimeAtCurrentTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str38 = dateTimeZone37.getID();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone37);
        java.lang.String str41 = dateTimeZone37.getName((long) (-1));
        org.joda.time.Interval interval42 = localDate29.toInterval(dateTimeZone37);
        boolean boolean43 = interval23.contains((org.joda.time.ReadableInterval) interval42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime35", (dateTime8.compareTo(dateTime35) == 0) == dateTime8.equals(dateTime35));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.secondOfMinute();
        boolean boolean12 = localDate4.equals((java.lang.Object) dateTime10);
        int int13 = localDate4.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 1899, dateTimeZone15);
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        org.joda.time.DateTime dateTime24 = localDate18.toDateTimeAtCurrentTime(dateTimeZone22);
        int int26 = dateTimeZone22.getOffsetFromLocal((long) 100);
        java.lang.String str28 = dateTimeZone22.getNameKey((long) 999);
        long long30 = dateTimeZone22.nextTransition((long) 1899);
        org.joda.time.DateMidnight dateMidnight31 = localDate4.toDateMidnight(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime24", (dateTime8.compareTo(dateTime24) == 0) == dateTime8.equals(dateTime24));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Interval interval19 = yearMonthDay15.toInterval(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval22 = interval19.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime3.toDateTime(chronology23);
        org.joda.time.DateTime.Property property25 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime26 = property25.roundCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime24", (dateTime3.compareTo(dateTime24) == 0) == dateTime3.equals(dateTime24));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 1899, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        int int18 = dateTimeZone16.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = localDate4.toDateTimeAtStartOfDay(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime19", (dateTime10.compareTo(dateTime19) == 0) == dateTime10.equals(dateTime19));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Interval interval19 = yearMonthDay15.toInterval(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval22 = interval19.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime3.toDateTime(chronology23);
        java.lang.String str25 = dateTime3.toString();
        java.util.Date date31 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.fromDateFields(date31);
        org.joda.time.LocalDate.Property property33 = localDate32.weekOfWeekyear();
        org.joda.time.LocalDate localDate35 = property33.setCopy("45");
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str38 = dateTimeZone37.getID();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone37);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime42 = dateTime39.withField(dateTimeFieldType40, 44);
        boolean boolean43 = localDate35.isSupported(dateTimeFieldType40);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        int int47 = dateTimeZone45.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) 1899, dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        int int51 = dateTimeZone49.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime52 = localDate48.toDateTimeAtCurrentTime(dateTimeZone49);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay(dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str56 = dateTimeZone55.getID();
        org.joda.time.Interval interval57 = yearMonthDay53.toInterval(dateTimeZone55);
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        long long62 = chronology58.add((long) 18, (long) 6, 58);
        boolean boolean63 = dateTimeFieldType40.isSupported(chronology58);
        org.joda.time.DateTime.Property property64 = dateTime3.property(dateTimeFieldType40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime39", (dateTime1.compareTo(dateTime39) == 0) == dateTime1.equals(dateTime39));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        int int12 = dateTimeZone8.getOffsetFromLocal((long) 100);
        java.lang.String str14 = dateTimeZone8.getNameKey((long) 999);
        long long16 = dateTimeZone8.nextTransition((long) 1899);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 1899, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        int int24 = dateTimeZone22.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime25 = localDate21.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str29 = dateTimeZone28.getID();
        org.joda.time.Interval interval30 = yearMonthDay26.toInterval(dateTimeZone28);
        org.joda.time.YearMonthDay.Property property31 = yearMonthDay26.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str34 = dateTimeZone33.getID();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = yearMonthDay26.toDateTimeAtCurrentTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((java.lang.Object) long16, dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime25", (dateTime10.compareTo(dateTime25) == 0) == dateTime10.equals(dateTime25));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 1899, dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime18 = localDate14.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str22 = dateTimeZone21.getID();
        org.joda.time.Interval interval23 = yearMonthDay19.toInterval(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone21);
        org.joda.time.DateTime dateTime25 = localDate6.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.LocalDate.Property property26 = localDate6.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime25", (dateTime8.compareTo(dateTime25) == 0) == dateTime8.equals(dateTime25));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.List<java.util.Locale> localeList6 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        boolean boolean7 = localeList6.isEmpty();
        java.util.stream.Stream<java.util.Locale> localeStream8 = localeList6.stream();
        java.util.stream.Stream<java.util.Locale> localeStream9 = localeList6.stream();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod();
        mutablePeriod10.setMonths((int) (short) 10);
        int int13 = mutablePeriod10.getDays();
        java.lang.Object obj14 = mutablePeriod10.clone();
        boolean boolean15 = localeList6.equals((java.lang.Object) mutablePeriod10);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.secondOfMinute();
        org.joda.time.DateTime dateTime20 = dateTime17.withYearOfCentury(16);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        int int24 = dateTimeZone22.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 1899, dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime29 = localDate25.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str33 = dateTimeZone32.getID();
        org.joda.time.Interval interval34 = yearMonthDay30.toInterval(dateTimeZone32);
        org.joda.time.MutableInterval mutableInterval35 = interval34.toMutableInterval();
        org.joda.time.Interval interval37 = interval34.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology38.getZone();
        org.joda.time.DateTime dateTime40 = dateTime17.toDateTime(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 1899, dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        int int49 = dateTimeZone47.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime50 = localDate46.toDateTimeAtCurrentTime(dateTimeZone47);
        org.joda.time.YearMonthDay yearMonthDay51 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str54 = dateTimeZone53.getID();
        org.joda.time.Interval interval55 = yearMonthDay51.toInterval(dateTimeZone53);
        org.joda.time.MutableInterval mutableInterval56 = interval55.toMutableInterval();
        org.joda.time.Interval interval58 = interval55.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(0L, chronology59);
        org.joda.time.DateTime dateTime61 = dateTime40.toDateTime(chronology59);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        int int64 = dateTimeZone62.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(dateTimeZone62);
        org.joda.time.TimeOfDay timeOfDay70 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime72 = timeOfDay70.toDateTimeToday(dateTimeZone71);
        mutableDateTime65.setZoneRetainFields(dateTimeZone71);
        int int74 = mutableDateTime65.getYear();
        mutableDateTime65.addWeekyears(15);
        mutablePeriod10.setPeriod((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) mutableDateTime65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime40", (dateTime17.compareTo(dateTime40) == 0) == dateTime17.equals(dateTime40));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        int int11 = dateTime10.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 1899, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        int int19 = dateTimeZone17.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime20 = localDate16.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str24 = dateTimeZone23.getID();
        org.joda.time.Interval interval25 = yearMonthDay21.toInterval(dateTimeZone23);
        org.joda.time.Interval interval26 = yearMonthDay21.toInterval();
        org.joda.time.Chronology chronology27 = yearMonthDay21.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime10.toMutableDateTime(chronology27);
        org.joda.time.DurationField durationField30 = chronology27.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime20", (dateTime10.compareTo(dateTime20) == 0) == dateTime10.equals(dateTime20));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        int int4 = dateTimeZone2.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 1899, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime9 = localDate5.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.Interval interval14 = yearMonthDay10.toInterval(dateTimeZone12);
        org.joda.time.MutableInterval mutableInterval15 = interval14.toMutableInterval();
        org.joda.time.Interval interval17 = interval14.withStartMillis((long) 32769);
        org.joda.time.Duration duration18 = interval17.toDuration();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str21 = dateTimeZone20.getID();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType24.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray26 = new org.joda.time.DurationFieldType[] { durationFieldType25 };
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.forFields(durationFieldTypeArray26);
        org.joda.time.Period period28 = new org.joda.time.Period((long) ' ', periodType27);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration18, (org.joda.time.ReadableInstant) dateTime22, periodType27);
        boolean boolean30 = dateTime22.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        int int34 = dateTimeZone32.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 1899, dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        int int38 = dateTimeZone36.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime39 = localDate35.toDateTimeAtCurrentTime(dateTimeZone36);
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str43 = dateTimeZone42.getID();
        org.joda.time.Interval interval44 = yearMonthDay40.toInterval(dateTimeZone42);
        org.joda.time.Interval interval45 = yearMonthDay40.toInterval();
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        org.joda.time.DateTime dateTime47 = dateTime22.toDateTime(chronology46);
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay(1645455242370L, chronology46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime47", (dateTime22.compareTo(dateTime47) == 0) == dateTime22.equals(dateTime47));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Interval interval19 = yearMonthDay15.toInterval(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval22 = interval19.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime3.toDateTime(chronology23);
        org.joda.time.DateTime.Property property25 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime26 = property25.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime24", (dateTime3.compareTo(dateTime24) == 0) == dateTime3.equals(dateTime24));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((long) 45);
        org.joda.time.DateMidnight.Property property6 = dateMidnight3.weekyear();
        int int7 = dateMidnight3.getMinuteOfHour();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTime dateTime11 = dateTime9.withHourOfDay(3);
        int int12 = dateTime11.getSecondOfMinute();
        int int13 = dateTime11.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 1899, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime22 = localDate18.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str26 = dateTimeZone25.getID();
        org.joda.time.Interval interval27 = yearMonthDay23.toInterval(dateTimeZone25);
        org.joda.time.MutableInterval mutableInterval28 = interval27.toMutableInterval();
        org.joda.time.Interval interval30 = interval27.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.DateTime dateTime32 = dateTime11.toDateTime(chronology31);
        java.lang.String str33 = dateTime11.toString();
        boolean boolean34 = dateMidnight3.isEqual((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateMidnight.Property property35 = dateMidnight3.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime32", (dateTime11.compareTo(dateTime32) == 0) == dateTime11.equals(dateTime32));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.secondOfMinute();
        boolean boolean12 = localDate4.equals((java.lang.Object) dateTime10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str15 = dateTimeZone14.getID();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime19 = dateTime16.withField(dateTimeFieldType17, 44);
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType17.getRangeDurationType();
        org.joda.time.LocalDate.Property property21 = localDate4.property(dateTimeFieldType17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime16", (dateTime10.compareTo(dateTime16) == 0) == dateTime10.equals(dateTime16));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime4 = dateTime1.withYearOfCentury(16);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1899, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.Interval interval18 = yearMonthDay14.toInterval(dateTimeZone16);
        org.joda.time.MutableInterval mutableInterval19 = interval18.toMutableInterval();
        org.joda.time.Interval interval21 = interval18.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology22.getZone();
        org.joda.time.DateTime dateTime24 = dateTime1.toDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 1899, dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str38 = dateTimeZone37.getID();
        org.joda.time.Interval interval39 = yearMonthDay35.toInterval(dateTimeZone37);
        org.joda.time.MutableInterval mutableInterval40 = interval39.toMutableInterval();
        org.joda.time.Interval interval42 = interval39.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(0L, chronology43);
        org.joda.time.DateTime dateTime45 = dateTime24.toDateTime(chronology43);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology46);
        org.joda.time.DateTime.Property property48 = dateTime47.secondOfMinute();
        org.joda.time.DateTime dateTime50 = dateTime47.withYearOfCentury(16);
        org.joda.time.TimeOfDay timeOfDay51 = dateTime50.toTimeOfDay();
        boolean boolean52 = dateTime45.equals((java.lang.Object) timeOfDay51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime45", (dateTime1.compareTo(dateTime45) == 0) == dateTime1.equals(dateTime45));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone12);
        java.lang.String str16 = dateTimeZone12.getName((long) (-1));
        org.joda.time.Interval interval17 = localDate4.toInterval(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone18);
        boolean boolean22 = interval17.equals((java.lang.Object) dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and mutableDateTime21", (dateTime14.compareTo(mutableDateTime21) == 0) == dateTime14.equals(mutableDateTime21));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime3, readableDuration12);
        mutableDateTime3.setMillisOfDay(10);
        mutableDateTime3.setSecondOfDay(1970);
        int int18 = mutableDateTime3.getMinuteOfDay();
        int int19 = mutableDateTime3.getWeekyear();
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray25 = timeOfDay24.getFields();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = timeOfDay24.toDateTimeToday(dateTimeZone26);
        org.joda.time.DateTime.Property property28 = dateTime27.monthOfYear();
        org.joda.time.DateTime dateTime30 = dateTime27.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str33 = dateTimeZone32.getID();
        org.joda.time.DateMidnight dateMidnight34 = org.joda.time.DateMidnight.now(dateTimeZone32);
        boolean boolean35 = dateTime30.equals((java.lang.Object) dateMidnight34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight34.plusMonths(10);
        org.joda.time.DateMidnight.Property property38 = dateMidnight37.dayOfYear();
        org.joda.time.DateMidnight dateMidnight39 = property38.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight39.withDurationAdded((long) 400, 20);
        mutableDateTime3.setMillis((org.joda.time.ReadableInstant) dateMidnight42);
        int int44 = dateMidnight42.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateMidnight42", (mutableDateTime3.compareTo(dateMidnight42) == 0) == mutableDateTime3.equals(dateMidnight42));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        int int11 = dateTime10.getMinuteOfHour();
        org.joda.time.Instant instant12 = dateTime10.toInstant();
        org.joda.time.DateTime dateTime14 = dateTime10.minusMonths((int) (short) 0);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra(14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant12", (dateTime14.compareTo(instant12) == 0) == dateTime14.equals(instant12));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((-259200016L));
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 1899, dateTimeZone3);
        org.joda.time.LocalDate localDate8 = localDate6.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime12 = localDate6.toDateTimeAtCurrentTime(dateTimeZone10);
        int int13 = dateTime12.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 1899, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime22 = localDate18.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str26 = dateTimeZone25.getID();
        org.joda.time.Interval interval27 = yearMonthDay23.toInterval(dateTimeZone25);
        org.joda.time.MutableInterval mutableInterval28 = interval27.toMutableInterval();
        org.joda.time.Interval interval30 = interval27.withStartMillis((long) 32769);
        org.joda.time.Duration duration31 = interval30.toDuration();
        java.lang.String str32 = duration31.toString();
        org.joda.time.DateTime dateTime33 = dateTime12.minus((org.joda.time.ReadableDuration) duration31);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime1.withDurationAdded((org.joda.time.ReadableDuration) duration31, 8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime22", (dateTime12.compareTo(dateTime22) == 0) == dateTime12.equals(dateTime22));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) (short) 0);
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        java.lang.String str10 = dateTime8.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime14 = dateTime8.toDateTime(dateTimeZone12);
        int int16 = dateTimeZone12.getOffset(31556952000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime14", (dateTime6.compareTo(dateTime14) == 0) == dateTime6.equals(dateTime14));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone12);
        boolean boolean15 = dateTime10.equals((java.lang.Object) dateMidnight14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.plusMonths(10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = timeOfDay26.toDateTimeToday(dateTimeZone27);
        mutableDateTime21.setZoneRetainFields(dateTimeZone27);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime21, readableDuration30);
        mutableDateTime21.setMillisOfDay(10);
        mutableDateTime21.setSecondOfDay(1970);
        int int36 = mutableDateTime21.getMinuteOfDay();
        int int37 = mutableDateTime21.getWeekyear();
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray43 = timeOfDay42.getFields();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = timeOfDay42.toDateTimeToday(dateTimeZone44);
        org.joda.time.DateTime.Property property46 = dateTime45.monthOfYear();
        org.joda.time.DateTime dateTime48 = dateTime45.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str51 = dateTimeZone50.getID();
        org.joda.time.DateMidnight dateMidnight52 = org.joda.time.DateMidnight.now(dateTimeZone50);
        boolean boolean53 = dateTime48.equals((java.lang.Object) dateMidnight52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight52.plusMonths(10);
        org.joda.time.DateMidnight.Property property56 = dateMidnight55.dayOfYear();
        org.joda.time.DateMidnight dateMidnight57 = property56.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight57.withDurationAdded((long) 400, 20);
        mutableDateTime21.setMillis((org.joda.time.ReadableInstant) dateMidnight60);
        int int62 = mutableDateTime21.getMonthOfYear();
        int int63 = dateMidnight14.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight14.plusYears(100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight17 and mutableDateTime21", (dateMidnight17.compareTo(mutableDateTime21) == 0) == dateMidnight17.equals(mutableDateTime21));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        org.joda.time.DateTime dateTime5 = dateTime3.withDayOfMonth(1);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMinutes(999);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 1899, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.Interval interval21 = yearMonthDay17.toInterval(dateTimeZone19);
        org.joda.time.Interval interval22 = yearMonthDay17.toInterval();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        int int26 = dateTimeZone24.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 1899, dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime31 = localDate27.toDateTimeAtCurrentTime(dateTimeZone28);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str35 = dateTimeZone34.getID();
        org.joda.time.Interval interval36 = yearMonthDay32.toInterval(dateTimeZone34);
        org.joda.time.MutableInterval mutableInterval37 = interval36.toMutableInterval();
        org.joda.time.Interval interval39 = interval36.withStartMillis((long) 32769);
        org.joda.time.Duration duration40 = interval39.toDuration();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str43 = dateTimeZone42.getID();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone42);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType47 = dateTimeFieldType46.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray48 = new org.joda.time.DurationFieldType[] { durationFieldType47 };
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.forFields(durationFieldTypeArray48);
        org.joda.time.Period period50 = new org.joda.time.Period((long) ' ', periodType49);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration40, (org.joda.time.ReadableInstant) dateTime44, periodType49);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str54 = dateTimeZone53.getID();
        org.joda.time.DateMidnight dateMidnight55 = org.joda.time.DateMidnight.now(dateTimeZone53);
        org.joda.time.Interval interval56 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration40, (org.joda.time.ReadableInstant) dateMidnight55);
        org.joda.time.Interval interval57 = interval22.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration40);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        int int61 = dateTimeZone59.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate((long) 1899, dateTimeZone59);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.getDefault();
        int int65 = dateTimeZone63.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime66 = localDate62.toDateTimeAtCurrentTime(dateTimeZone63);
        org.joda.time.YearMonthDay yearMonthDay67 = new org.joda.time.YearMonthDay(dateTimeZone63);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str70 = dateTimeZone69.getID();
        org.joda.time.Interval interval71 = yearMonthDay67.toInterval(dateTimeZone69);
        org.joda.time.MutableInterval mutableInterval72 = interval71.toMutableInterval();
        org.joda.time.Interval interval74 = interval71.withStartMillis((long) 32769);
        org.joda.time.Duration duration75 = interval74.toDuration();
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str78 = dateTimeZone77.getID();
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime(dateTimeZone77);
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType82 = dateTimeFieldType81.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray83 = new org.joda.time.DurationFieldType[] { durationFieldType82 };
        org.joda.time.PeriodType periodType84 = org.joda.time.PeriodType.forFields(durationFieldTypeArray83);
        org.joda.time.Period period85 = new org.joda.time.Period((long) ' ', periodType84);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration75, (org.joda.time.ReadableInstant) dateTime79, periodType84);
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str89 = dateTimeZone88.getID();
        org.joda.time.DateMidnight dateMidnight90 = org.joda.time.DateMidnight.now(dateTimeZone88);
        org.joda.time.Interval interval91 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration75, (org.joda.time.ReadableInstant) dateMidnight90);
        boolean boolean92 = duration40.isLongerThan((org.joda.time.ReadableDuration) duration75);
        org.joda.time.Period period93 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableDuration) duration75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime44", (dateTime1.compareTo(dateTime44) == 0) == dateTime1.equals(dateTime44));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Duration duration17 = interval16.toDuration();
        java.lang.String str18 = duration17.toString();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        int int22 = dateTimeZone20.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 1899, dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        int int26 = dateTimeZone24.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime27 = localDate23.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str31 = dateTimeZone30.getID();
        org.joda.time.Interval interval32 = yearMonthDay28.toInterval(dateTimeZone30);
        org.joda.time.MutableInterval mutableInterval33 = interval32.toMutableInterval();
        org.joda.time.Interval interval35 = interval32.withStartMillis((long) 32769);
        org.joda.time.Duration duration36 = interval35.toDuration();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str39 = dateTimeZone38.getID();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone38);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType42.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray44 = new org.joda.time.DurationFieldType[] { durationFieldType43 };
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.forFields(durationFieldTypeArray44);
        org.joda.time.Period period46 = new org.joda.time.Period((long) ' ', periodType45);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration36, (org.joda.time.ReadableInstant) dateTime40, periodType45);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str50 = dateTimeZone49.getID();
        org.joda.time.DateMidnight dateMidnight51 = org.joda.time.DateMidnight.now(dateTimeZone49);
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration36, (org.joda.time.ReadableInstant) dateMidnight51);
        int int53 = duration17.compareTo((org.joda.time.ReadableDuration) duration36);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        int int57 = dateTimeZone55.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate((long) 1899, dateTimeZone55);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        int int61 = dateTimeZone59.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime62 = localDate58.toDateTimeAtCurrentTime(dateTimeZone59);
        org.joda.time.YearMonthDay yearMonthDay63 = new org.joda.time.YearMonthDay(dateTimeZone59);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str66 = dateTimeZone65.getID();
        org.joda.time.Interval interval67 = yearMonthDay63.toInterval(dateTimeZone65);
        org.joda.time.MutableInterval mutableInterval68 = interval67.toMutableInterval();
        org.joda.time.Interval interval70 = interval67.withStartMillis((long) 32769);
        org.joda.time.Duration duration71 = interval70.toDuration();
        java.lang.String str72 = duration71.toString();
        boolean boolean73 = duration17.isEqual((org.joda.time.ReadableDuration) duration71);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(chronology74);
        org.joda.time.DateTime dateTime77 = dateTime75.withHourOfDay(3);
        int int78 = dateTime77.getSecondOfMinute();
        int int79 = dateTime77.getMinuteOfHour();
        int int80 = dateTime77.getEra();
        org.joda.time.DateTime.Property property81 = dateTime77.monthOfYear();
        org.joda.time.DateTime dateTime82 = property81.roundCeilingCopy();
        org.joda.time.DateTime dateTime84 = property81.addToCopy(1970);
        org.joda.time.Interval interval85 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration71, (org.joda.time.ReadableInstant) dateTime84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime40 and dateTime75", (dateTime40.compareTo(dateTime75) == 0) == dateTime40.equals(dateTime75));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Duration duration17 = interval16.toDuration();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray25 = new org.joda.time.DurationFieldType[] { durationFieldType24 };
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.forFields(durationFieldTypeArray25);
        org.joda.time.Period period27 = new org.joda.time.Period((long) ' ', periodType26);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateTime21, periodType26);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str31 = dateTimeZone30.getID();
        org.joda.time.DateMidnight dateMidnight32 = org.joda.time.DateMidnight.now(dateTimeZone30);
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateMidnight32);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        int int37 = dateTimeZone35.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 1899, dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        int int41 = dateTimeZone39.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime42 = localDate38.toDateTimeAtCurrentTime(dateTimeZone39);
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str46 = dateTimeZone45.getID();
        org.joda.time.Interval interval47 = yearMonthDay43.toInterval(dateTimeZone45);
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.Interval interval49 = interval33.withChronology(chronology48);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        int int53 = dateTimeZone51.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) 1899, dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        int int57 = dateTimeZone55.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime58 = localDate54.toDateTimeAtCurrentTime(dateTimeZone55);
        org.joda.time.YearMonthDay yearMonthDay59 = new org.joda.time.YearMonthDay(dateTimeZone55);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str62 = dateTimeZone61.getID();
        org.joda.time.Interval interval63 = yearMonthDay59.toInterval(dateTimeZone61);
        org.joda.time.Interval interval64 = yearMonthDay59.toInterval();
        boolean boolean65 = interval49.isBefore((org.joda.time.ReadableInterval) interval64);
        long long66 = interval64.getStartMillis();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        int int70 = dateTimeZone68.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate((long) 1899, dateTimeZone68);
        org.joda.time.LocalDate localDate73 = localDate71.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone76 = dateTimeZone75.toTimeZone();
        org.joda.time.DateTime dateTime77 = localDate71.toDateTimeAtCurrentTime(dateTimeZone75);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str80 = dateTimeZone79.getID();
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime(dateTimeZone79);
        java.lang.String str83 = dateTimeZone79.getName((long) (-1));
        org.joda.time.Interval interval84 = localDate71.toInterval(dateTimeZone79);
        boolean boolean85 = interval64.overlaps((org.joda.time.ReadableInterval) interval84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime77", (dateTime8.compareTo(dateTime77) == 0) == dateTime8.equals(dateTime77));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone12);
        boolean boolean15 = dateTime10.equals((java.lang.Object) dateMidnight14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.plusMonths(10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = timeOfDay26.toDateTimeToday(dateTimeZone27);
        mutableDateTime21.setZoneRetainFields(dateTimeZone27);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime21, readableDuration30);
        mutableDateTime21.setMillisOfDay(10);
        mutableDateTime21.setSecondOfDay(1970);
        int int36 = mutableDateTime21.getMinuteOfDay();
        int int37 = mutableDateTime21.getWeekyear();
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray43 = timeOfDay42.getFields();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = timeOfDay42.toDateTimeToday(dateTimeZone44);
        org.joda.time.DateTime.Property property46 = dateTime45.monthOfYear();
        org.joda.time.DateTime dateTime48 = dateTime45.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str51 = dateTimeZone50.getID();
        org.joda.time.DateMidnight dateMidnight52 = org.joda.time.DateMidnight.now(dateTimeZone50);
        boolean boolean53 = dateTime48.equals((java.lang.Object) dateMidnight52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight52.plusMonths(10);
        org.joda.time.DateMidnight.Property property56 = dateMidnight55.dayOfYear();
        org.joda.time.DateMidnight dateMidnight57 = property56.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight57.withDurationAdded((long) 400, 20);
        mutableDateTime21.setMillis((org.joda.time.ReadableInstant) dateMidnight60);
        int int62 = mutableDateTime21.getMonthOfYear();
        int int63 = dateMidnight14.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.DateMidnight.Property property64 = dateMidnight14.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight17 and mutableDateTime21", (dateMidnight17.compareTo(mutableDateTime21) == 0) == dateMidnight17.equals(mutableDateTime21));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime4 = dateTime1.withYearOfCentury(16);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1899, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.Interval interval18 = yearMonthDay14.toInterval(dateTimeZone16);
        org.joda.time.MutableInterval mutableInterval19 = interval18.toMutableInterval();
        org.joda.time.Interval interval21 = interval18.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology22.getZone();
        org.joda.time.DateTime dateTime24 = dateTime1.toDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 1899, dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str38 = dateTimeZone37.getID();
        org.joda.time.Interval interval39 = yearMonthDay35.toInterval(dateTimeZone37);
        org.joda.time.MutableInterval mutableInterval40 = interval39.toMutableInterval();
        org.joda.time.Interval interval42 = interval39.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(0L, chronology43);
        org.joda.time.DateTime dateTime45 = dateTime24.toDateTime(chronology43);
        int int46 = dateTime45.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime45", (dateTime1.compareTo(dateTime45) == 0) == dateTime1.equals(dateTime45));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 1899, dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime18 = localDate14.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str22 = dateTimeZone21.getID();
        org.joda.time.Interval interval23 = yearMonthDay19.toInterval(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone21);
        org.joda.time.DateTime dateTime25 = localDate6.toDateTimeAtCurrentTime(dateTimeZone21);
        int int26 = localDate6.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime25", (dateTime8.compareTo(dateTime25) == 0) == dateTime8.equals(dateTime25));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone12);
        java.lang.String str16 = dateTimeZone12.getName((long) (-1));
        org.joda.time.Interval interval17 = localDate4.toInterval(dateTimeZone12);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        int int22 = dateTimeZone20.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 1899, dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        int int26 = dateTimeZone24.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime27 = localDate23.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str31 = dateTimeZone30.getID();
        org.joda.time.Interval interval32 = yearMonthDay28.toInterval(dateTimeZone30);
        org.joda.time.Interval interval33 = yearMonthDay28.toInterval();
        org.joda.time.Period period35 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period37 = org.joda.time.Period.minutes(1);
        java.lang.String str38 = period37.toString();
        org.joda.time.Period period39 = period35.withFields((org.joda.time.ReadablePeriod) period37);
        org.joda.time.YearMonthDay yearMonthDay40 = yearMonthDay28.plus((org.joda.time.ReadablePeriod) period35);
        int int41 = yearMonthDay28.size();
        org.joda.time.Interval interval42 = yearMonthDay28.toInterval();
        boolean boolean43 = interval42.containsNow();
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period45 = interval42.toPeriod(periodType44);
        boolean boolean46 = mutableInterval18.equals((java.lang.Object) periodType44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime27", (dateTime10.compareTo(dateTime27) == 0) == dateTime10.equals(dateTime27));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 1899, dateTimeZone18);
        org.joda.time.LocalDate localDate23 = localDate21.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime27 = localDate21.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfHour();
        org.joda.time.DateTime dateTime30 = dateTime27.plusSeconds((int) 'a');
        boolean boolean31 = interval16.isAfter((org.joda.time.ReadableInstant) dateTime30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime27", (dateTime8.compareTo(dateTime27) == 0) == dateTime8.equals(dateTime27));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 1899, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime10 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.Interval interval15 = yearMonthDay11.toInterval(dateTimeZone13);
        org.joda.time.MutableInterval mutableInterval16 = interval15.toMutableInterval();
        org.joda.time.Interval interval18 = interval15.withStartMillis((long) 32769);
        org.joda.time.Duration duration19 = interval18.toDuration();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str22 = dateTimeZone21.getID();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType25.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray27 = new org.joda.time.DurationFieldType[] { durationFieldType26 };
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.forFields(durationFieldTypeArray27);
        org.joda.time.Period period29 = new org.joda.time.Period((long) ' ', periodType28);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration19, (org.joda.time.ReadableInstant) dateTime23, periodType28);
        boolean boolean31 = dateTime23.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        int int35 = dateTimeZone33.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 1899, dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        int int39 = dateTimeZone37.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime40 = localDate36.toDateTimeAtCurrentTime(dateTimeZone37);
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str44 = dateTimeZone43.getID();
        org.joda.time.Interval interval45 = yearMonthDay41.toInterval(dateTimeZone43);
        org.joda.time.Interval interval46 = yearMonthDay41.toInterval();
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.DateTime dateTime48 = dateTime23.toDateTime(chronology47);
        boolean boolean49 = durationFieldType1.isSupported(chronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime48", (dateTime23.compareTo(dateTime48) == 0) == dateTime23.equals(dateTime48));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 1899, dateTimeZone3);
        org.joda.time.LocalDate localDate8 = localDate6.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime12 = localDate6.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfHour();
        boolean boolean15 = dateTime12.isBefore((long) ' ');
        org.joda.time.DateMidnight dateMidnight16 = dateTime12.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        int int22 = dateTimeZone20.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 1899, dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        int int26 = dateTimeZone24.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime27 = localDate23.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str31 = dateTimeZone30.getID();
        org.joda.time.Interval interval32 = yearMonthDay28.toInterval(dateTimeZone30);
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        long long37 = chronology33.add((long) 18, (long) 6, 58);
        org.joda.time.Period period38 = new org.joda.time.Period(0L, (long) 32770, chronology33);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime12.toMutableDateTime(chronology33);
        org.joda.time.Period period40 = new org.joda.time.Period((long) 32769, periodType1, chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime27", (dateTime12.compareTo(dateTime27) == 0) == dateTime12.equals(dateTime27));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay9.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay15 = property14.getYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay17 = property14.addWrapFieldToCopy(47);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 1899, dateTimeZone19);
        org.joda.time.LocalDate localDate24 = localDate22.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDate22.toDateTimeAtCurrentTime(dateTimeZone26);
        int int30 = dateTimeZone26.getOffsetFromLocal((long) 100);
        java.lang.String str32 = dateTimeZone26.getNameKey((long) 999);
        long long36 = dateTimeZone26.convertLocalToUTC((long) '4', false, (long) 52);
        int int38 = dateTimeZone26.getStandardOffset(16L);
        org.joda.time.DateTime dateTime39 = yearMonthDay17.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.YearMonthDay yearMonthDay41 = yearMonthDay17.plusDays(2194);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime4 = dateTime1.withYearOfCentury(16);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1899, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.Interval interval18 = yearMonthDay14.toInterval(dateTimeZone16);
        org.joda.time.MutableInterval mutableInterval19 = interval18.toMutableInterval();
        org.joda.time.Interval interval21 = interval18.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology22.getZone();
        org.joda.time.DateTime dateTime24 = dateTime1.toDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime24", (dateTime1.compareTo(dateTime24) == 0) == dateTime1.equals(dateTime24));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Interval interval14 = yearMonthDay9.toInterval();
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay9.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        int int25 = dateTimeZone23.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 1899, dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str34 = dateTimeZone33.getID();
        org.joda.time.Interval interval35 = yearMonthDay31.toInterval(dateTimeZone33);
        org.joda.time.MutableInterval mutableInterval36 = interval35.toMutableInterval();
        org.joda.time.Interval interval38 = interval35.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology39.getZone();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay21.withChronologyRetainFields(chronology39);
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now(chronology39);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(chronology39);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.dayOfWeek();
        java.util.Date date52 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate53 = org.joda.time.LocalDate.fromDateFields(date52);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = localDate53.toDateTimeAtCurrentTime(dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        int int60 = dateTimeZone58.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate((long) 1899, dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        int int64 = dateTimeZone62.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime65 = localDate61.toDateTimeAtCurrentTime(dateTimeZone62);
        org.joda.time.YearMonthDay yearMonthDay66 = new org.joda.time.YearMonthDay(dateTimeZone62);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str69 = dateTimeZone68.getID();
        org.joda.time.Interval interval70 = yearMonthDay66.toInterval(dateTimeZone68);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone68);
        org.joda.time.DateTime dateTime72 = localDate53.toDateTimeAtCurrentTime(dateTimeZone68);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) (short) 10, dateTimeZone68);
        java.util.Locale locale75 = java.util.Locale.KOREA;
        java.lang.String str76 = locale75.getDisplayName();
        java.lang.String str77 = locale75.getScript();
        java.util.Set<java.lang.Character> charSet78 = locale75.getExtensionKeys();
        java.lang.String str79 = dateTimeZone68.getName((long) 15, locale75);
        mutableDateTime44.setZone(dateTimeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime55 and dateTime72", (dateTime55.compareTo(dateTime72) == 0) == dateTime55.equals(dateTime72));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Interval interval14 = yearMonthDay9.toInterval();
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay9.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        int int25 = dateTimeZone23.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 1899, dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str34 = dateTimeZone33.getID();
        org.joda.time.Interval interval35 = yearMonthDay31.toInterval(dateTimeZone33);
        org.joda.time.MutableInterval mutableInterval36 = interval35.toMutableInterval();
        org.joda.time.Interval interval38 = interval35.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology39.getZone();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay21.withChronologyRetainFields(chronology39);
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now(chronology39);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(chronology39);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        int int48 = dateTimeZone46.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) 1899, dateTimeZone46);
        org.joda.time.LocalDate localDate51 = localDate49.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone54 = dateTimeZone53.toTimeZone();
        org.joda.time.DateTime dateTime55 = localDate49.toDateTimeAtCurrentTime(dateTimeZone53);
        int int56 = dateTime55.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        int int60 = dateTimeZone58.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate((long) 1899, dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        int int64 = dateTimeZone62.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime65 = localDate61.toDateTimeAtCurrentTime(dateTimeZone62);
        org.joda.time.YearMonthDay yearMonthDay66 = new org.joda.time.YearMonthDay(dateTimeZone62);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str69 = dateTimeZone68.getID();
        org.joda.time.Interval interval70 = yearMonthDay66.toInterval(dateTimeZone68);
        org.joda.time.MutableInterval mutableInterval71 = interval70.toMutableInterval();
        org.joda.time.Interval interval73 = interval70.withStartMillis((long) 32769);
        org.joda.time.Duration duration74 = interval73.toDuration();
        java.lang.String str75 = duration74.toString();
        org.joda.time.DateTime dateTime76 = dateTime55.minus((org.joda.time.ReadableDuration) duration74);
        mutableDateTime44.setTime((org.joda.time.ReadableInstant) dateTime76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime55", (dateTime8.compareTo(dateTime55) == 0) == dateTime8.equals(dateTime55));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy(10);
        org.joda.time.LocalDate localDate11 = localDate9.withWeekyear(1970);
        org.joda.time.LocalDate localDate13 = localDate11.withWeekyear(53);
        java.util.Date date19 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.fromDateFields(date19);
        org.joda.time.LocalDate.Property property21 = localDate20.weekOfWeekyear();
        org.joda.time.LocalDate localDate23 = property21.setCopy(10);
        org.joda.time.LocalDate localDate25 = localDate23.withWeekyear(1970);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate27 = localDate25.minus(readablePeriod26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        int int31 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 1899, dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        int int35 = dateTimeZone33.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime36 = localDate32.toDateTimeAtCurrentTime(dateTimeZone33);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.weekyear();
        int int38 = localDate32.get(dateTimeFieldType37);
        boolean boolean39 = localDate25.isSupported(dateTimeFieldType37);
        org.joda.time.LocalDate localDate41 = localDate13.withField(dateTimeFieldType37, 14);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 1899, dateTimeZone43);
        org.joda.time.LocalDate localDate48 = localDate46.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone51 = dateTimeZone50.toTimeZone();
        org.joda.time.DateTime dateTime52 = localDate46.toDateTimeAtCurrentTime(dateTimeZone50);
        int int54 = dateTimeZone50.getOffsetFromLocal((long) 100);
        org.joda.time.DateTime dateTime55 = localDate41.toDateTimeAtCurrentTime(dateTimeZone50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime52", (dateTime36.compareTo(dateTime52) == 0) == dateTime36.equals(dateTime52));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property10 = dateTime6.property(dateTimeFieldType9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone12);
        boolean boolean15 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = timeOfDay20.getFields();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTimeToday(dateTimeZone22);
        org.joda.time.DateTime.Property property24 = dateTime23.monthOfYear();
        org.joda.time.DateTime dateTime26 = dateTime23.minusMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime28 = dateTime23.withSecondOfMinute(16);
        org.joda.time.Instant instant29 = dateTime28.toInstant();
        boolean boolean30 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(0, (int) '4', chronology33);
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay34.plusMinutes(1899);
        org.joda.time.TimeOfDay.Property property37 = timeOfDay34.millisOfSecond();
        org.joda.time.Period period39 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period41 = org.joda.time.Period.minutes(1);
        java.lang.String str42 = period41.toString();
        org.joda.time.Period period43 = period39.withFields((org.joda.time.ReadablePeriod) period41);
        org.joda.time.Period period45 = period43.plusMillis(100);
        org.joda.time.Period period46 = period43.negated();
        org.joda.time.Period period48 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period50 = org.joda.time.Period.minutes(1);
        java.lang.String str51 = period50.toString();
        org.joda.time.Period period52 = period48.withFields((org.joda.time.ReadablePeriod) period50);
        org.joda.time.Period period54 = period52.plusMillis(100);
        boolean boolean55 = period46.equals((java.lang.Object) period54);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period57 = period46.withFields((org.joda.time.ReadablePeriod) mutablePeriod56);
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay34.plus((org.joda.time.ReadablePeriod) period46);
        org.joda.time.DateTime dateTime59 = dateTime6.minus((org.joda.time.ReadablePeriod) period46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and instant29", (dateTime28.compareTo(instant29) == 0) == dateTime28.equals(instant29));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DurationField durationField21 = chronology17.millis();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.dayOfMonth();
        org.joda.time.DurationField durationField23 = chronology17.eras();
        java.lang.Class<?> wildcardClass24 = chronology17.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField23", Math.signum(durationField21.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField21)));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        java.lang.String str4 = dateTime3.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DateTime dateTime7 = dateTime3.withField(dateTimeFieldType5, 5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 1899, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.Interval interval21 = yearMonthDay17.toInterval(dateTimeZone19);
        org.joda.time.Interval interval22 = yearMonthDay17.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateMidnight dateMidnight24 = org.joda.time.DateMidnight.now(chronology23);
        org.joda.time.DateTime dateTime25 = dateTime3.toDateTime(chronology23);
        org.joda.time.DurationField durationField26 = chronology23.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime25", (dateTime3.compareTo(dateTime25) == 0) == dateTime3.equals(dateTime25));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        int int12 = mutableDateTime3.getYear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str15 = dateTimeZone14.getID();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone14);
        java.lang.String str17 = dateTime16.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DateTime dateTime20 = dateTime16.withField(dateTimeFieldType18, 5);
        int int21 = mutableDateTime3.compareTo((org.joda.time.ReadableInstant) dateTime20);
        int int22 = dateTime20.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime16", (mutableDateTime3.compareTo(dateTime16) == 0) == mutableDateTime3.equals(dateTime16));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType4.getDurationType();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight3.withField(dateTimeFieldType4, (int) (short) 10);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight3.minusYears((int) 'u');
        org.joda.time.Instant instant10 = dateMidnight3.toInstant();
        org.joda.time.DateMidnight.Property property11 = dateMidnight3.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight12 = property11.roundCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight12 and instant10", (dateMidnight12.compareTo(instant10) == 0) == dateMidnight12.equals(instant10));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale4.getDisplayName(locale7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone2, locale4);
        int int13 = calendar11.getMaximum((int) (short) 0);
        calendar11.setLenient(false);
        java.util.Date date16 = calendar11.getTime();
        java.time.Instant instant17 = date16.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar11", (calendar3.compareTo(calendar11) == 0) == calendar3.equals(calendar11));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        int int11 = dateTime10.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 1899, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        int int19 = dateTimeZone17.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime20 = localDate16.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str24 = dateTimeZone23.getID();
        org.joda.time.Interval interval25 = yearMonthDay21.toInterval(dateTimeZone23);
        org.joda.time.Interval interval26 = yearMonthDay21.toInterval();
        org.joda.time.Chronology chronology27 = yearMonthDay21.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime10.toMutableDateTime(chronology27);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime29", (dateTime10.compareTo(mutableDateTime29) == 0) == dateTime10.equals(mutableDateTime29));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale4.getDisplayName(locale7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone2, locale4);
        int int13 = calendar11.getMaximum((int) (short) 0);
        calendar11.setLenient(false);
        java.util.Date date16 = calendar11.getTime();
        int int17 = date16.getSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar11", (calendar3.compareTo(calendar11) == 0) == calendar3.equals(calendar11));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.Chronology chronology8 = timeOfDay4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.dayOfWeek();
        org.joda.time.DurationField durationField11 = dateTimeField10.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField11, and durationField9", !(durationField9.compareTo(durationField11) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField11.compareTo(durationField9))));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property10 = dateTime6.property(dateTimeFieldType9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone12);
        boolean boolean15 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = timeOfDay20.getFields();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTimeToday(dateTimeZone22);
        org.joda.time.DateTime.Property property24 = dateTime23.monthOfYear();
        org.joda.time.DateTime dateTime26 = dateTime23.minusMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime28 = dateTime23.withSecondOfMinute(16);
        org.joda.time.Instant instant29 = dateTime28.toInstant();
        boolean boolean30 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime32 = dateTime28.minusDays(952);
        org.joda.time.DateTime dateTime34 = dateTime32.withCenturyOfEra(366);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and instant29", (dateTime28.compareTo(instant29) == 0) == dateTime28.equals(instant29));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        int int11 = dateTime10.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 1899, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        int int19 = dateTimeZone17.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime20 = localDate16.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str24 = dateTimeZone23.getID();
        org.joda.time.Interval interval25 = yearMonthDay21.toInterval(dateTimeZone23);
        org.joda.time.Interval interval26 = yearMonthDay21.toInterval();
        org.joda.time.Chronology chronology27 = yearMonthDay21.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime10.toMutableDateTime(chronology27);
        org.joda.time.DurationField durationField30 = chronology27.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime29", (dateTime10.compareTo(mutableDateTime29) == 0) == dateTime10.equals(mutableDateTime29));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        int int4 = dateTimeZone2.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 1899, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime9 = localDate5.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.Interval interval14 = yearMonthDay10.toInterval(dateTimeZone12);
        org.joda.time.Interval interval15 = yearMonthDay10.toInterval();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        int int19 = dateTimeZone17.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 1899, dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        int int23 = dateTimeZone21.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime24 = localDate20.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str28 = dateTimeZone27.getID();
        org.joda.time.Interval interval29 = yearMonthDay25.toInterval(dateTimeZone27);
        org.joda.time.MutableInterval mutableInterval30 = interval29.toMutableInterval();
        org.joda.time.Interval interval32 = interval29.withStartMillis((long) 32769);
        org.joda.time.Duration duration33 = interval32.toDuration();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str36 = dateTimeZone35.getID();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone35);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType40 = dateTimeFieldType39.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray41 = new org.joda.time.DurationFieldType[] { durationFieldType40 };
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.forFields(durationFieldTypeArray41);
        org.joda.time.Period period43 = new org.joda.time.Period((long) ' ', periodType42);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration33, (org.joda.time.ReadableInstant) dateTime37, periodType42);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str47 = dateTimeZone46.getID();
        org.joda.time.DateMidnight dateMidnight48 = org.joda.time.DateMidnight.now(dateTimeZone46);
        org.joda.time.Interval interval49 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration33, (org.joda.time.ReadableInstant) dateMidnight48);
        org.joda.time.Interval interval50 = interval15.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        int int54 = dateTimeZone52.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) 1899, dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        int int58 = dateTimeZone56.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime59 = localDate55.toDateTimeAtCurrentTime(dateTimeZone56);
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay(dateTimeZone56);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str63 = dateTimeZone62.getID();
        org.joda.time.Interval interval64 = yearMonthDay60.toInterval(dateTimeZone62);
        org.joda.time.MutableInterval mutableInterval65 = interval64.toMutableInterval();
        org.joda.time.Interval interval67 = interval64.withStartMillis((long) 32769);
        org.joda.time.Duration duration68 = interval67.toDuration();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str71 = dateTimeZone70.getID();
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime(dateTimeZone70);
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType75 = dateTimeFieldType74.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray76 = new org.joda.time.DurationFieldType[] { durationFieldType75 };
        org.joda.time.PeriodType periodType77 = org.joda.time.PeriodType.forFields(durationFieldTypeArray76);
        org.joda.time.Period period78 = new org.joda.time.Period((long) ' ', periodType77);
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration68, (org.joda.time.ReadableInstant) dateTime72, periodType77);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str82 = dateTimeZone81.getID();
        org.joda.time.DateMidnight dateMidnight83 = org.joda.time.DateMidnight.now(dateTimeZone81);
        org.joda.time.Interval interval84 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration68, (org.joda.time.ReadableInstant) dateMidnight83);
        boolean boolean85 = duration33.isLongerThan((org.joda.time.ReadableDuration) duration68);
        org.joda.time.Interval interval86 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str89 = dateTimeZone88.getID();
        org.joda.time.DateMidnight dateMidnight90 = org.joda.time.DateMidnight.now(dateTimeZone88);
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType92 = dateTimeFieldType91.getDurationType();
        org.joda.time.DateMidnight dateMidnight94 = dateMidnight90.withField(dateTimeFieldType91, (int) (short) 10);
        org.joda.time.DateMidnight dateMidnight96 = dateMidnight90.minusYears((int) 'u');
        org.joda.time.Instant instant97 = dateMidnight90.toInstant();
        org.joda.time.DateMidnight.Property property98 = dateMidnight90.weekOfWeekyear();
        boolean boolean99 = interval86.contains((org.joda.time.ReadableInstant) dateMidnight90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight48 and instant97", (dateMidnight48.compareTo(instant97) == 0) == dateMidnight48.equals(instant97));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale4.getDisplayName(locale7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone2, locale4);
        int int13 = calendar11.getMaximum((int) (short) 0);
        calendar11.setLenient(false);
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.fromCalendarFields(calendar11);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusMinutes(974);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar11", (calendar3.compareTo(calendar11) == 0) == calendar3.equals(calendar11));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale4.getDisplayName(locale7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone2, locale4);
        int int13 = calendar11.getMaximum((int) (short) 0);
        calendar11.setLenient(false);
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.fromCalendarFields(calendar11);
        int int17 = timeOfDay16.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar11", (calendar3.compareTo(calendar11) == 0) == calendar3.equals(calendar11));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray12 = new java.lang.String[] { "00", "PT1M", "", "PT1M", "46", "46", "+00:00:00.016", "", "PT1M" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.Locale.FilteringMode filteringMode15 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList13, filteringMode15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale[] localeArray20 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList21);
        boolean boolean24 = localeList23.isEmpty();
        java.util.stream.Stream<java.util.Locale> localeStream25 = localeList23.stream();
        java.util.List<java.util.Locale> localeList26 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList23);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Locale[] localeArray30 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList31 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList31, localeArray30);
        java.util.List<java.util.Locale> localeList33 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.util.Locale>) localeList31);
        boolean boolean34 = localeList33.isEmpty();
        java.util.stream.Stream<java.util.Locale> localeStream35 = localeList33.stream();
        java.util.Iterator<java.util.Locale> localeItor36 = localeList33.iterator();
        java.util.List<java.util.Locale> localeList37 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList33);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone40 = dateTimeZone39.toTimeZone();
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(timeZone40);
        java.util.Locale locale42 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale43 = java.util.Locale.KOREAN;
        java.util.Locale locale45 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str46 = locale43.getDisplayVariant(locale45);
        java.util.Set<java.lang.String> strSet47 = locale45.getUnicodeLocaleAttributes();
        java.lang.String str48 = locale42.getDisplayName(locale45);
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone40, locale42);
        int int51 = calendar49.getMaximum((int) (short) 0);
        calendar49.setLenient(false);
        java.util.Date date54 = calendar49.getTime();
        boolean boolean55 = localeList37.remove((java.lang.Object) date54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar41 and calendar49", (calendar41.compareTo(calendar49) == 0) == calendar41.equals(calendar49));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        timeZone2.setID("1970");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        boolean boolean9 = timeZone8.observesDaylightTime();
        boolean boolean10 = timeZone2.hasSameRules(timeZone8);
        timeZone8.setRawOffset(1900);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone15);
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str21 = locale18.getDisplayVariant(locale20);
        java.util.Set<java.lang.String> strSet22 = locale20.getUnicodeLocaleAttributes();
        java.lang.String str23 = locale17.getDisplayName(locale20);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone15, locale17);
        boolean boolean25 = timeZone8.hasSameRules(timeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar16", (calendar3.compareTo(calendar16) == 0) == calendar3.equals(calendar16));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = calendar3.getWeekYear();
        java.lang.String str5 = calendar3.getCalendarType();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.LocalDate localDate12 = localDate10.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtCurrentTime(dateTimeZone14);
        int int18 = dateTimeZone14.getOffsetFromLocal((long) 100);
        java.lang.String str20 = dateTimeZone14.getNameKey(0L);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone14);
        long long23 = dateTimeZone14.convertUTCToLocal((-1073174400016L));
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) calendar3, dateTimeZone14);
        org.joda.time.TimeOfDay timeOfDay25 = org.joda.time.TimeOfDay.fromCalendarFields(calendar3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and dateTime24", (mutableDateTime21.compareTo(dateTime24) == 0) == mutableDateTime21.equals(dateTime24));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType4.getDurationType();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight3.withField(dateTimeFieldType4, (int) (short) 10);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight3.minusYears((int) 'u');
        org.joda.time.Instant instant10 = dateMidnight3.toInstant();
        org.joda.time.DateMidnight.Property property11 = dateMidnight3.weekOfWeekyear();
        org.joda.time.DateMidnight.Property property12 = dateMidnight3.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight13 = property12.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant10", (dateMidnight3.compareTo(instant10) == 0) == dateMidnight3.equals(instant10));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = calendar3.getWeekYear();
        java.lang.String str5 = calendar3.getCalendarType();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.LocalDate localDate12 = localDate10.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtCurrentTime(dateTimeZone14);
        int int18 = dateTimeZone14.getOffsetFromLocal((long) 100);
        java.lang.String str20 = dateTimeZone14.getNameKey(0L);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone14);
        long long23 = dateTimeZone14.convertUTCToLocal((-1073174400016L));
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) calendar3, dateTimeZone14);
        java.lang.Object obj25 = calendar3.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and dateTime24", (mutableDateTime21.compareTo(dateTime24) == 0) == mutableDateTime21.equals(dateTime24));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.plusMonths(58);
        org.joda.time.DateTime dateTime16 = dateTime10.plusMinutes(45);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray23 = timeOfDay22.getFields();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTimeToday(dateTimeZone24);
        org.joda.time.Chronology chronology26 = timeOfDay22.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.years();
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.fromMillisOfDay((long) 23, chronology26);
        org.joda.time.DateTime dateTime29 = dateTime10.toDateTime(chronology26);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forID("UTC");
        org.joda.time.DateTime dateTime32 = dateTime10.toDateTime(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime29", (dateTime10.compareTo(dateTime29) == 0) == dateTime10.equals(dateTime29));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        int int11 = dateTime10.getMinuteOfHour();
        org.joda.time.Instant instant12 = dateTime10.toInstant();
        java.util.Date date13 = instant12.toDate();
        date13.setDate(40080984);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant12", (dateTime10.compareTo(instant12) == 0) == dateTime10.equals(instant12));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        int int11 = dateTime10.getMinuteOfHour();
        org.joda.time.Instant instant12 = dateTime10.toInstant();
        java.util.Date date13 = instant12.toDate();
        int int14 = date13.getSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant12", (dateTime10.compareTo(instant12) == 0) == dateTime10.equals(instant12));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.plusMonths(58);
        org.joda.time.DateTime dateTime16 = dateTime10.plusMinutes(45);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray23 = timeOfDay22.getFields();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTimeToday(dateTimeZone24);
        org.joda.time.Chronology chronology26 = timeOfDay22.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.years();
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.fromMillisOfDay((long) 23, chronology26);
        org.joda.time.DateTime dateTime29 = dateTime10.toDateTime(chronology26);
        org.joda.time.DateMidnight dateMidnight30 = dateTime10.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime29", (dateTime10.compareTo(dateTime29) == 0) == dateTime10.equals(dateTime29));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        java.lang.String str2 = period1.toString();
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period6 = org.joda.time.Period.minutes(1);
        java.lang.String str7 = period6.toString();
        org.joda.time.Period period8 = period4.withFields((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period8.plusMillis(100);
        org.joda.time.Period period11 = period8.negated();
        int int12 = period11.getMillis();
        org.joda.time.Period period14 = period11.minusDays(32);
        org.joda.time.DurationFieldType durationFieldType16 = period14.getFieldType(0);
        java.lang.String str17 = durationFieldType16.getName();
        int int18 = period1.get(durationFieldType16);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod();
        java.lang.String str20 = mutablePeriod19.toString();
        mutablePeriod19.setPeriod(0L);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        int int26 = dateTimeZone24.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 1899, dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime31 = localDate27.toDateTimeAtCurrentTime(dateTimeZone28);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str35 = dateTimeZone34.getID();
        org.joda.time.Interval interval36 = yearMonthDay32.toInterval(dateTimeZone34);
        org.joda.time.MutableInterval mutableInterval37 = interval36.toMutableInterval();
        org.joda.time.Interval interval39 = interval36.withStartMillis((long) 32769);
        org.joda.time.Duration duration40 = interval39.toDuration();
        java.lang.String str41 = duration40.toString();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 1899, dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        int int49 = dateTimeZone47.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime50 = localDate46.toDateTimeAtCurrentTime(dateTimeZone47);
        org.joda.time.YearMonthDay yearMonthDay51 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str54 = dateTimeZone53.getID();
        org.joda.time.Interval interval55 = yearMonthDay51.toInterval(dateTimeZone53);
        org.joda.time.MutableInterval mutableInterval56 = interval55.toMutableInterval();
        org.joda.time.Interval interval58 = interval55.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.DateTimeZone dateTimeZone60 = chronology59.getZone();
        org.joda.time.DateTimeField dateTimeField61 = chronology59.monthOfYear();
        org.joda.time.Period period63 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period65 = org.joda.time.Period.minutes(1);
        java.lang.String str66 = period65.toString();
        org.joda.time.Period period67 = period63.withFields((org.joda.time.ReadablePeriod) period65);
        org.joda.time.Period period69 = period67.plusMillis(100);
        org.joda.time.Period period70 = period67.negated();
        org.joda.time.Period period72 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period74 = org.joda.time.Period.minutes(1);
        java.lang.String str75 = period74.toString();
        org.joda.time.Period period76 = period72.withFields((org.joda.time.ReadablePeriod) period74);
        org.joda.time.Period period78 = period76.plusMillis(100);
        boolean boolean79 = period70.equals((java.lang.Object) period78);
        long long82 = chronology59.add((org.joda.time.ReadablePeriod) period70, 31556952000L, (int) '4');
        mutablePeriod19.setPeriod((org.joda.time.ReadableDuration) duration40, chronology59);
        org.joda.time.DateTimeField dateTimeField84 = chronology59.dayOfMonth();
        org.joda.time.Chronology chronology85 = chronology59.withUTC();
        boolean boolean86 = durationFieldType16.isSupported(chronology85);
        org.joda.time.DurationField durationField87 = chronology85.eras();
        org.joda.time.DurationField durationField88 = chronology85.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField87, durationField88, and durationField87", !(durationField87.compareTo(durationField88) == 0) || (Math.signum(durationField87.compareTo(durationField87)) == Math.signum(durationField88.compareTo(durationField87))));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Interval interval14 = yearMonthDay9.toInterval();
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay9.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        int int25 = dateTimeZone23.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 1899, dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str34 = dateTimeZone33.getID();
        org.joda.time.Interval interval35 = yearMonthDay31.toInterval(dateTimeZone33);
        org.joda.time.MutableInterval mutableInterval36 = interval35.toMutableInterval();
        org.joda.time.Interval interval38 = interval35.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology39.getZone();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay21.withChronologyRetainFields(chronology39);
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now(chronology39);
        org.joda.time.DateTimeField dateTimeField44 = chronology39.monthOfYear();
        org.joda.time.DurationField durationField45 = chronology39.eras();
        org.joda.time.DateTimeField dateTimeField46 = chronology39.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        int int50 = dateTimeZone48.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) 1899, dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        int int54 = dateTimeZone52.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime55 = localDate51.toDateTimeAtCurrentTime(dateTimeZone52);
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str59 = dateTimeZone58.getID();
        org.joda.time.Interval interval60 = yearMonthDay56.toInterval(dateTimeZone58);
        org.joda.time.Interval interval61 = yearMonthDay56.toInterval();
        org.joda.time.Chronology chronology62 = interval61.getChronology();
        org.joda.time.Chronology chronology63 = interval61.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology63);
        org.joda.time.DateTimeZone dateTimeZone66 = chronology63.getZone();
        org.joda.time.Chronology chronology67 = chronology39.withZone(dateTimeZone66);
        org.joda.time.DurationField durationField68 = chronology39.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField68, and durationField45", !(durationField45.compareTo(durationField68) == 0) || (Math.signum(durationField45.compareTo(durationField45)) == Math.signum(durationField68.compareTo(durationField45))));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale4.getDisplayName(locale7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone2, locale4);
        int int13 = calendar11.getMaximum((int) (short) 0);
        calendar11.setLenient(false);
        java.util.Date date16 = calendar11.getTime();
        int int17 = date16.getMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar11", (calendar3.compareTo(calendar11) == 0) == calendar3.equals(calendar11));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy(10);
        org.joda.time.LocalDate localDate11 = localDate9.withWeekyear(1970);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.secondOfMinute();
        boolean boolean17 = property16.isLeap();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableDateTime21.add(readableDuration22, 0);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime21.dayOfWeek();
        org.joda.time.ReadableDuration readableDuration26 = null;
        mutableDateTime21.add(readableDuration26);
        long long28 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime21.weekOfWeekyear();
        org.joda.time.DateTime dateTime30 = localDate9.toDateTime((org.joda.time.ReadableInstant) mutableDateTime21);
        mutableDateTime21.addHours(32801);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime30", (dateTime13.compareTo(dateTime30) == 0) == dateTime13.equals(dateTime30));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Calendar.Builder builder3 = builder0.setLocale(locale1);
        java.util.Calendar.Builder builder7 = builder0.setDate(15, 899, 37);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        timeZone8.setID("DurationField[seconds]");
        java.util.Calendar.Builder builder11 = builder7.setTimeZone(timeZone8);
        timeZone8.setRawOffset(0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone16);
        timeZone16.setID("1970");
        boolean boolean20 = timeZone8.hasSameRules(timeZone16);
        java.util.Calendar.Builder builder21 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone24);
        java.util.Calendar.Builder builder26 = builder21.setTimeZone(timeZone24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 10, chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withMinuteOfHour(0);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 10, chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime31.withFields((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withWeekyear((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone42 = dateTimeZone41.toTimeZone();
        boolean boolean43 = localDateTime37.equals((java.lang.Object) timeZone42);
        java.util.Calendar.Builder builder44 = builder26.setTimeZone(timeZone42);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone47 = dateTimeZone46.toTimeZone();
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone47);
        java.util.TimeZone.setDefault(timeZone47);
        boolean boolean50 = timeZone42.hasSameRules(timeZone47);
        java.lang.String str51 = timeZone42.getID();
        boolean boolean52 = timeZone8.hasSameRules(timeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar25", (calendar17.compareTo(calendar25) == 0) == calendar17.equals(calendar25));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = timeOfDay15.toDateTimeToday(dateTimeZone16);
        mutableDateTime10.setZoneRetainFields(dateTimeZone16);
        boolean boolean19 = mutableDateTime10.isEqualNow();
        org.joda.time.DateTimeField dateTimeField20 = mutableDateTime10.getRoundingField();
        org.joda.time.Interval interval21 = new org.joda.time.Interval(readablePeriod6, (org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime10.setSecondOfDay(54);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        int int26 = dateTimeZone24.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.Period period29 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period31 = org.joda.time.Period.minutes(1);
        java.lang.String str32 = period31.toString();
        org.joda.time.Period period33 = period29.withFields((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Period period35 = period31.minusSeconds((int) (short) 100);
        mutableDateTime27.add((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Period period38 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period40 = org.joda.time.Period.minutes(1);
        java.lang.String str41 = period40.toString();
        org.joda.time.Period period42 = period38.withFields((org.joda.time.ReadablePeriod) period40);
        org.joda.time.Period period44 = period42.plusMillis(100);
        org.joda.time.Period period45 = period42.negated();
        org.joda.time.Period period47 = period45.withMillis(1899);
        org.joda.time.Period period49 = period47.plusMillis(0);
        mutableDateTime27.add((org.joda.time.ReadablePeriod) period47);
        org.joda.time.DateTime dateTime51 = mutableDateTime27.toDateTime();
        mutableDateTime27.setWeekyear(1970);
        org.joda.time.DateTimeField dateTimeField54 = mutableDateTime27.getRoundingField();
        org.joda.time.TimeOfDay timeOfDay59 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray60 = timeOfDay59.getFields();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = timeOfDay59.toDateTimeToday(dateTimeZone61);
        org.joda.time.DateTime.Property property63 = dateTime62.monthOfYear();
        org.joda.time.DateTime dateTime65 = dateTime62.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str68 = dateTimeZone67.getID();
        org.joda.time.DateMidnight dateMidnight69 = org.joda.time.DateMidnight.now(dateTimeZone67);
        boolean boolean70 = dateTime65.equals((java.lang.Object) dateMidnight69);
        org.joda.time.DateMidnight dateMidnight72 = dateMidnight69.plusMonths(10);
        org.joda.time.DateMidnight.Property property73 = dateMidnight72.dayOfYear();
        org.joda.time.DateMidnight.Property property74 = dateMidnight72.yearOfEra();
        org.joda.time.DateMidnight.Property property75 = dateMidnight72.dayOfYear();
        org.joda.time.DateMidnight dateMidnight76 = property75.roundHalfEvenCopy();
        int int77 = mutableDateTime27.compareTo((org.joda.time.ReadableInstant) dateMidnight76);
        mutableDateTime10.setMillis((org.joda.time.ReadableInstant) dateMidnight76);
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime10.hourOfDay();
        int int80 = dateTime3.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.DateTime dateTime82 = dateTime3.minusHours(5872);
        org.joda.time.DateTime dateTime83 = dateTime3.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and dateMidnight72", (mutableDateTime10.compareTo(dateMidnight72) == 0) == mutableDateTime10.equals(dateMidnight72));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone3);
        java.util.Calendar.Builder builder5 = builder0.setTimeZone(timeZone3);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone3);
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = timeOfDay11.toDateTimeToday(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.minus((long) (short) 0);
        org.joda.time.DateTime dateTime16 = dateTime15.toDateTimeISO();
        java.lang.String str17 = dateTime15.toString();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTime dateTime21 = dateTime15.toDateTime(dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((java.lang.Object) calendar6, dateTimeZone19);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.secondOfMinute();
        org.joda.time.DateTime dateTime28 = dateTime25.withYearOfCentury(16);
        org.joda.time.TimeOfDay timeOfDay29 = dateTime28.toTimeOfDay();
        int int30 = timeOfDay29.getMillisOfSecond();
        java.util.Locale locale32 = java.util.Locale.US;
        java.lang.String str33 = timeOfDay29.toString("46", locale32);
        java.lang.String str34 = dateTimeZone19.getName(1645455399465L, locale32);
        java.lang.String str35 = locale32.getScript();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime21", (dateTime13.compareTo(dateTime21) == 0) == dateTime13.equals(dateTime21));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod();
        int int2 = mutablePeriod1.getDays();
        java.util.Date date10 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.fromDateFields(date10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekOfWeekyear();
        org.joda.time.LocalDate localDate14 = property12.setCopy("45");
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime21 = dateTime18.withField(dateTimeFieldType19, 44);
        boolean boolean22 = localDate14.isSupported(dateTimeFieldType19);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        int int26 = dateTimeZone24.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 1899, dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime31 = localDate27.toDateTimeAtCurrentTime(dateTimeZone28);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str35 = dateTimeZone34.getID();
        org.joda.time.Interval interval36 = yearMonthDay32.toInterval(dateTimeZone34);
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        long long41 = chronology37.add((long) 18, (long) 6, 58);
        boolean boolean42 = dateTimeFieldType19.isSupported(chronology37);
        mutablePeriod1.setPeriod((long) 32, (long) 53, chronology37);
        org.joda.time.DateTimeField dateTimeField44 = chronology37.minuteOfHour();
        org.joda.time.DurationField durationField45 = chronology37.halfdays();
        org.joda.time.DurationField durationField46 = chronology37.eras();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 1823, chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField45 and durationField46", Math.signum(durationField45.compareTo(durationField46)) == -Math.signum(durationField46.compareTo(durationField45)));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Duration duration17 = interval16.toDuration();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray25 = new org.joda.time.DurationFieldType[] { durationFieldType24 };
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.forFields(durationFieldTypeArray25);
        org.joda.time.Period period27 = new org.joda.time.Period((long) ' ', periodType26);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateTime21, periodType26);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str31 = dateTimeZone30.getID();
        org.joda.time.DateMidnight dateMidnight32 = org.joda.time.DateMidnight.now(dateTimeZone30);
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateMidnight32);
        boolean boolean35 = interval33.isAfter((long) 1899);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        int int39 = dateTimeZone37.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 1899, dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        int int43 = dateTimeZone41.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime44 = localDate40.toDateTimeAtCurrentTime(dateTimeZone41);
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str48 = dateTimeZone47.getID();
        org.joda.time.Interval interval49 = yearMonthDay45.toInterval(dateTimeZone47);
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        boolean boolean52 = interval49.isBefore(1L);
        boolean boolean53 = interval33.overlaps((org.joda.time.ReadableInterval) interval49);
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType55 = periodType54.withDaysRemoved();
        org.joda.time.Period period56 = interval49.toPeriod(periodType54);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        int int60 = dateTimeZone58.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate((long) 1899, dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        int int64 = dateTimeZone62.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime65 = localDate61.toDateTimeAtCurrentTime(dateTimeZone62);
        org.joda.time.YearMonthDay yearMonthDay66 = new org.joda.time.YearMonthDay(dateTimeZone62);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str69 = dateTimeZone68.getID();
        org.joda.time.Interval interval70 = yearMonthDay66.toInterval(dateTimeZone68);
        org.joda.time.Interval interval71 = yearMonthDay66.toInterval();
        boolean boolean72 = interval71.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.getDefault();
        int int75 = dateTimeZone73.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(dateTimeZone73);
        org.joda.time.ReadableDuration readableDuration77 = null;
        mutableDateTime76.add(readableDuration77, 0);
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime76.dayOfWeek();
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime76.millisOfDay();
        boolean boolean82 = interval71.isAfter((org.joda.time.ReadableInstant) mutableDateTime76);
        org.joda.time.Interval interval83 = interval49.withEnd((org.joda.time.ReadableInstant) mutableDateTime76);
        org.joda.time.Chronology chronology84 = interval83.getChronology();
        org.joda.time.Period period85 = interval83.toPeriod();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and mutableDateTime76", (dateTime21.compareTo(mutableDateTime76) == 0) == dateTime21.equals(mutableDateTime76));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        int int13 = dateTime10.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        org.joda.time.DateTime dateTime17 = dateTime10.withFieldAdded(durationFieldType15, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = timeOfDay26.toDateTimeToday(dateTimeZone27);
        mutableDateTime21.setZoneRetainFields(dateTimeZone27);
        boolean boolean30 = mutableDateTime21.isEqualNow();
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray36 = timeOfDay35.getFields();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = timeOfDay35.toDateTimeToday(dateTimeZone37);
        org.joda.time.DateTime.Property property39 = dateTime38.monthOfYear();
        boolean boolean40 = mutableDateTime21.isBefore((org.joda.time.ReadableInstant) dateTime38);
        int int41 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime43 = dateTime38.plusDays(26);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str46 = dateTimeZone45.getID();
        java.util.Locale locale48 = java.util.Locale.KOREAN;
        java.util.Locale locale50 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str51 = locale48.getDisplayVariant(locale50);
        java.lang.String str52 = dateTimeZone45.getName((long) 5, locale48);
        org.joda.time.DateTime dateTime53 = dateTime38.toDateTime(dateTimeZone45);
        org.joda.time.DateTime dateTime55 = dateTime38.withYearOfEra(44);
        int int56 = dateTime38.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime53", (dateTime7.compareTo(dateTime53) == 0) == dateTime7.equals(dateTime53));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay9.dayOfMonth();
        java.lang.String str15 = property14.getAsText();
        org.joda.time.YearMonthDay yearMonthDay16 = property14.withMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay18 = property14.addWrapFieldToCopy(22);
        org.joda.time.Period period20 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period22 = org.joda.time.Period.minutes(1);
        java.lang.String str23 = period22.toString();
        org.joda.time.Period period24 = period20.withFields((org.joda.time.ReadablePeriod) period22);
        int int25 = period20.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay18.withPeriodAdded((org.joda.time.ReadablePeriod) period20, 32769);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Interval interval29 = yearMonthDay18.toInterval(dateTimeZone28);
        org.joda.time.Interval interval30 = yearMonthDay18.toInterval();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        int int34 = dateTimeZone32.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 1899, dateTimeZone32);
        org.joda.time.LocalDate localDate37 = localDate35.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone40 = dateTimeZone39.toTimeZone();
        org.joda.time.DateTime dateTime41 = localDate35.toDateTimeAtCurrentTime(dateTimeZone39);
        int int43 = dateTimeZone39.getOffsetFromLocal((long) 100);
        java.lang.String str45 = dateTimeZone39.getNameKey((long) 999);
        long long49 = dateTimeZone39.convertLocalToUTC((long) '4', false, (long) 52);
        java.lang.String str51 = dateTimeZone39.getShortName((long) (-292275054));
        org.joda.time.DateMidnight dateMidnight52 = yearMonthDay18.toDateMidnight(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime41", (dateTime8.compareTo(dateTime41) == 0) == dateTime8.equals(dateTime41));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) (short) 0);
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.minus(315705601970L);
        org.joda.time.DateTime.Property property12 = dateTime9.era();
        org.joda.time.DateTime dateTime13 = property12.getDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekyear(1722);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime13, dateTimeZone17);
        int int20 = dateTime13.getWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime13.withDayOfYear(70);
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = timeOfDay27.toDateTimeToday(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.minus((long) (short) 0);
        org.joda.time.DateTime dateTime32 = dateTime31.toDateTimeISO();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime19", (dateTime13.compareTo(mutableDateTime19) == 0) == dateTime13.equals(mutableDateTime19));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        int int6 = dateTime3.getEra();
        org.joda.time.DateTime dateTime7 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str10 = dateTimeZone9.getID();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now(dateTimeZone9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        boolean boolean13 = dateMidnight11.isBefore(readableInstant12);
        int int14 = dateMidnight11.getYearOfCentury();
        org.joda.time.DateMidnight.Property property15 = dateMidnight11.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight11.minusMonths(7);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusWeeks(8);
        int int20 = dateMidnight17.getEra();
        boolean boolean21 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 1899, dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        int int32 = dateTimeZone30.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime33 = localDate29.toDateTimeAtCurrentTime(dateTimeZone30);
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str37 = dateTimeZone36.getID();
        org.joda.time.Interval interval38 = yearMonthDay34.toInterval(dateTimeZone36);
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.Interval interval40 = interval38.toInterval();
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType42 = periodType41.withWeeksRemoved();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        int int46 = dateTimeZone44.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) 1899, dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        int int50 = dateTimeZone48.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime51 = localDate47.toDateTimeAtCurrentTime(dateTimeZone48);
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str55 = dateTimeZone54.getID();
        org.joda.time.Interval interval56 = yearMonthDay52.toInterval(dateTimeZone54);
        org.joda.time.MutableInterval mutableInterval57 = interval56.toMutableInterval();
        org.joda.time.Interval interval59 = interval56.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology60 = interval59.getChronology();
        org.joda.time.DateTimeZone dateTimeZone61 = chronology60.getZone();
        org.joda.time.DateTimeField dateTimeField62 = chronology60.monthOfYear();
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight(chronology60);
        org.joda.time.DurationField durationField64 = chronology60.millis();
        org.joda.time.DateTimeField dateTimeField65 = chronology60.dayOfMonth();
        org.joda.time.Period period66 = new org.joda.time.Period((java.lang.Object) interval38, periodType42, chronology60);
        org.joda.time.PeriodType periodType67 = periodType42.withMillisRemoved();
        org.joda.time.Period period68 = new org.joda.time.Period((long) 47016, (long) 535, periodType67);
        org.joda.time.PeriodType periodType70 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.getDefault();
        int int74 = dateTimeZone72.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate((long) 1899, dateTimeZone72);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.getDefault();
        int int78 = dateTimeZone76.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime79 = localDate75.toDateTimeAtCurrentTime(dateTimeZone76);
        org.joda.time.YearMonthDay yearMonthDay80 = new org.joda.time.YearMonthDay(dateTimeZone76);
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str83 = dateTimeZone82.getID();
        org.joda.time.Interval interval84 = yearMonthDay80.toInterval(dateTimeZone82);
        org.joda.time.MutableInterval mutableInterval85 = interval84.toMutableInterval();
        org.joda.time.Interval interval87 = interval84.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology88 = interval87.getChronology();
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((long) (byte) -1, periodType70, chronology88);
        org.joda.time.DateTime dateTime90 = org.joda.time.DateTime.now(chronology88);
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod(36L, periodType67, chronology88);
        org.joda.time.MutableDateTime mutableDateTime92 = dateTime3.toMutableDateTime(chronology88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime90", (dateTime1.compareTo(dateTime90) == 0) == dateTime1.equals(dateTime90));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromCalendarFields(calendar3);
        calendar3.setFirstDayOfWeek((int) (short) 100);
        calendar3.set(47, 46, 70, 1900, 1900, (-1));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        boolean boolean17 = timeZone16.observesDaylightTime();
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone16, locale18);
        calendar3.setTimeZone(timeZone16);
        int int21 = timeZone16.getRawOffset();
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone25);
        int int27 = calendar26.getWeekYear();
        org.joda.time.YearMonthDay yearMonthDay28 = org.joda.time.YearMonthDay.fromCalendarFields(calendar26);
        java.util.TimeZone timeZone29 = calendar26.getTimeZone();
        timeZone29.setRawOffset(2012);
        timeZone29.setRawOffset(21);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone29);
        boolean boolean35 = timeZone29.observesDaylightTime();
        calendar22.setTimeZone(timeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar19 and calendar26", (calendar19.compareTo(calendar26) == 0) == calendar19.equals(calendar26));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime3, readableDuration12);
        mutableDateTime3.setMillisOfDay(10);
        mutableDateTime3.setSecondOfDay(1970);
        int int18 = mutableDateTime3.getMinuteOfDay();
        int int19 = mutableDateTime3.getWeekyear();
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray25 = timeOfDay24.getFields();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = timeOfDay24.toDateTimeToday(dateTimeZone26);
        org.joda.time.DateTime.Property property28 = dateTime27.monthOfYear();
        org.joda.time.DateTime dateTime30 = dateTime27.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str33 = dateTimeZone32.getID();
        org.joda.time.DateMidnight dateMidnight34 = org.joda.time.DateMidnight.now(dateTimeZone32);
        boolean boolean35 = dateTime30.equals((java.lang.Object) dateMidnight34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight34.plusMonths(10);
        org.joda.time.DateMidnight.Property property38 = dateMidnight37.dayOfYear();
        org.joda.time.DateMidnight dateMidnight39 = property38.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight39.withDurationAdded((long) 400, 20);
        mutableDateTime3.setMillis((org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight42.plusDays(53750385);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateMidnight42", (mutableDateTime3.compareTo(dateMidnight42) == 0) == mutableDateTime3.equals(dateMidnight42));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = calendar3.getWeekYear();
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromCalendarFields(calendar3);
        java.util.TimeZone timeZone6 = calendar3.getTimeZone();
        timeZone6.setRawOffset(2012);
        timeZone6.setRawOffset(21);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone6);
        java.util.Calendar.Builder builder12 = new java.util.Calendar.Builder();
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.lang.String str14 = locale13.getISO3Language();
        java.util.Calendar.Builder builder15 = builder12.setLocale(locale13);
        java.util.Calendar.Builder builder19 = builder12.setDate(15, 899, 37);
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        timeZone20.setID("DurationField[seconds]");
        java.util.Calendar.Builder builder23 = builder19.setTimeZone(timeZone20);
        timeZone20.setRawOffset(0);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone20);
        boolean boolean27 = timeZone6.hasSameRules(timeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar26", (calendar3.compareTo(calendar26) == 0) == calendar3.equals(calendar26));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = calendar3.getWeekYear();
        java.lang.String str5 = calendar3.getCalendarType();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.LocalDate localDate12 = localDate10.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtCurrentTime(dateTimeZone14);
        int int18 = dateTimeZone14.getOffsetFromLocal((long) 100);
        java.lang.String str20 = dateTimeZone14.getNameKey(0L);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone14);
        long long23 = dateTimeZone14.convertUTCToLocal((-1073174400016L));
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) calendar3, dateTimeZone14);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate27 = localDate25.plusDays(8);
        org.joda.time.LocalDate localDate29 = localDate27.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDate localDate31 = localDate27.plusDays((int) (short) 0);
        org.joda.time.LocalDate localDate33 = localDate31.withYearOfCentury((int) (short) 1);
        org.joda.time.LocalDate localDate35 = localDate31.withMonthOfYear(12);
        java.util.Date date36 = localDate35.toDate();
        org.joda.time.YearMonthDay yearMonthDay37 = org.joda.time.YearMonthDay.fromDateFields(date36);
        calendar3.setTime(date36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and dateTime24", (mutableDateTime21.compareTo(dateTime24) == 0) == mutableDateTime21.equals(dateTime24));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = calendar3.getWeekYear();
        java.lang.String str5 = calendar3.getCalendarType();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.LocalDate localDate12 = localDate10.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtCurrentTime(dateTimeZone14);
        int int18 = dateTimeZone14.getOffsetFromLocal((long) 100);
        java.lang.String str20 = dateTimeZone14.getNameKey(0L);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone14);
        long long23 = dateTimeZone14.convertUTCToLocal((-1073174400016L));
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) calendar3, dateTimeZone14);
        org.joda.time.DateTime dateTime26 = dateTime24.minusMinutes(2246400);
        org.joda.time.DateTime.Property property27 = dateTime26.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and dateTime24", (mutableDateTime21.compareTo(dateTime24) == 0) == mutableDateTime21.equals(dateTime24));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        boolean boolean5 = dateMidnight3.isBefore(readableInstant4);
        int int6 = dateMidnight3.getYearOfCentury();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight8 = property7.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight9 = property7.getDateMidnight();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod();
        java.lang.String str11 = mutablePeriod10.toString();
        mutablePeriod10.setPeriod(0L);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 1899, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime22 = localDate18.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str26 = dateTimeZone25.getID();
        org.joda.time.Interval interval27 = yearMonthDay23.toInterval(dateTimeZone25);
        org.joda.time.MutableInterval mutableInterval28 = interval27.toMutableInterval();
        org.joda.time.Interval interval30 = interval27.withStartMillis((long) 32769);
        org.joda.time.Duration duration31 = interval30.toDuration();
        java.lang.String str32 = duration31.toString();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        int int36 = dateTimeZone34.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 1899, dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        int int40 = dateTimeZone38.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime41 = localDate37.toDateTimeAtCurrentTime(dateTimeZone38);
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str45 = dateTimeZone44.getID();
        org.joda.time.Interval interval46 = yearMonthDay42.toInterval(dateTimeZone44);
        org.joda.time.MutableInterval mutableInterval47 = interval46.toMutableInterval();
        org.joda.time.Interval interval49 = interval46.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology50.getZone();
        org.joda.time.DateTimeField dateTimeField52 = chronology50.monthOfYear();
        org.joda.time.Period period54 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period56 = org.joda.time.Period.minutes(1);
        java.lang.String str57 = period56.toString();
        org.joda.time.Period period58 = period54.withFields((org.joda.time.ReadablePeriod) period56);
        org.joda.time.Period period60 = period58.plusMillis(100);
        org.joda.time.Period period61 = period58.negated();
        org.joda.time.Period period63 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period65 = org.joda.time.Period.minutes(1);
        java.lang.String str66 = period65.toString();
        org.joda.time.Period period67 = period63.withFields((org.joda.time.ReadablePeriod) period65);
        org.joda.time.Period period69 = period67.plusMillis(100);
        boolean boolean70 = period61.equals((java.lang.Object) period69);
        long long73 = chronology50.add((org.joda.time.ReadablePeriod) period61, 31556952000L, (int) '4');
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration31, chronology50);
        org.joda.time.DateMidnight dateMidnight75 = org.joda.time.DateMidnight.now(chronology50);
        org.joda.time.DateMidnight dateMidnight77 = dateMidnight75.withYearOfEra(59);
        org.joda.time.Period period79 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period81 = org.joda.time.Period.minutes(1);
        java.lang.String str82 = period81.toString();
        org.joda.time.Period period83 = period79.withFields((org.joda.time.ReadablePeriod) period81);
        org.joda.time.Period period85 = period81.minusSeconds((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant86 = null;
        org.joda.time.Duration duration87 = period81.toDurationFrom(readableInstant86);
        org.joda.time.DateMidnight dateMidnight88 = dateMidnight77.plus((org.joda.time.ReadableDuration) duration87);
        org.joda.time.DateMidnight dateMidnight90 = dateMidnight9.withDurationAdded((org.joda.time.ReadableDuration) duration87, (int) 'a');
        org.joda.time.Instant instant91 = dateMidnight9.toInstant();
        org.joda.time.DateMidnight dateMidnight93 = dateMidnight9.minusDays(3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight9 and instant91", (dateMidnight9.compareTo(instant91) == 0) == dateMidnight9.equals(instant91));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.clockhourOfDay();
        org.joda.time.DurationField durationField19 = chronology17.years();
        java.lang.String str20 = durationField19.toString();
        java.util.Date date26 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.fromDateFields(date26);
        org.joda.time.LocalDate.Property property28 = localDate27.weekOfWeekyear();
        org.joda.time.LocalDate localDate30 = property28.setCopy(10);
        org.joda.time.DurationField durationField31 = property28.getRangeDurationField();
        java.lang.String str32 = durationField31.toString();
        long long35 = durationField31.add((long) 1970, (int) (short) 10);
        java.util.Date date41 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.fromDateFields(date41);
        org.joda.time.LocalDate.Property property43 = localDate42.weekOfWeekyear();
        org.joda.time.LocalDate localDate45 = property43.setCopy(10);
        org.joda.time.DurationField durationField46 = property43.getRangeDurationField();
        int int47 = durationField31.compareTo(durationField46);
        int int48 = durationField19.compareTo(durationField46);
        long long51 = durationField46.getDifferenceAsLong(1645488000000L, 7032235L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField46", (durationField19.compareTo(durationField46) == 0) == durationField19.equals(durationField46));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getDurationType();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withFieldAdded(durationFieldType12, 5);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withYearOfEra(37);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone19);
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale22 = java.util.Locale.KOREAN;
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str25 = locale22.getDisplayVariant(locale24);
        java.util.Set<java.lang.String> strSet26 = locale24.getUnicodeLocaleAttributes();
        java.lang.String str27 = locale21.getDisplayName(locale24);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone19, locale21);
        int int30 = calendar28.getMaximum((int) (short) 0);
        calendar28.setLenient(false);
        int int33 = calendar28.getWeekYear();
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.fromCalendarFields(calendar28);
        boolean boolean35 = localDateTime16.equals((java.lang.Object) localDate34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar20 and calendar28", (calendar20.compareTo(calendar28) == 0) == calendar20.equals(calendar28));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        boolean boolean5 = dateMidnight3.isBefore(readableInstant4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str8 = dateTimeZone7.getID();
        org.joda.time.DateMidnight dateMidnight9 = org.joda.time.DateMidnight.now(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.plus((long) 45);
        org.joda.time.DateMidnight.Property property12 = dateMidnight9.weekyear();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        int int14 = dateTimeField13.getMinimumValue();
        org.joda.time.ReadablePartial readablePartial15 = null;
        int[] intArray22 = new int[] { 'u', 6, (byte) 10, 10, 53, 1899 };
        int int23 = dateTimeField13.getMinimumValue(readablePartial15, intArray22);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        int int27 = dateTimeZone25.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 1899, dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        int int31 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime32 = localDate28.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str36 = dateTimeZone35.getID();
        org.joda.time.Interval interval37 = yearMonthDay33.toInterval(dateTimeZone35);
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        org.joda.time.Interval interval40 = interval37.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.DateTimeZone dateTimeZone42 = chronology41.getZone();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.monthOfYear();
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DurationField durationField45 = chronology41.millis();
        org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) readablePartial15, chronology41);
        org.joda.time.DateTime dateTime47 = dateMidnight3.toDateTime(chronology41);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(chronology41);
        org.joda.time.DurationField durationField49 = chronology41.eras();
        org.joda.time.DateTimeField dateTimeField50 = chronology41.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField45 and durationField49", Math.signum(durationField45.compareTo(durationField49)) == -Math.signum(durationField49.compareTo(durationField45)));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime3, readableDuration12);
        mutableDateTime3.setMillisOfDay(10);
        mutableDateTime3.setSecondOfDay(1970);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray23 = timeOfDay22.getFields();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTimeToday(dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.monthOfYear();
        org.joda.time.DateTime dateTime28 = dateTime25.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str31 = dateTimeZone30.getID();
        org.joda.time.DateMidnight dateMidnight32 = org.joda.time.DateMidnight.now(dateTimeZone30);
        boolean boolean33 = dateTime28.equals((java.lang.Object) dateMidnight32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight32.plusMonths(10);
        org.joda.time.DateMidnight.Property property36 = dateMidnight35.dayOfYear();
        org.joda.time.DateMidnight.Property property37 = dateMidnight35.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType40 = dateTimeFieldType39.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray41 = new org.joda.time.DurationFieldType[] { durationFieldType40 };
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.forFields(durationFieldTypeArray41);
        org.joda.time.Period period43 = new org.joda.time.Period((long) ' ', periodType42);
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.months();
        int int45 = periodType42.indexOf(durationFieldType44);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime3, (org.joda.time.ReadableInstant) dateMidnight35, periodType42);
        org.joda.time.DateMidnight.Property property47 = dateMidnight35.era();
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight35.withMillis((long) 61162834);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone52 = dateTimeZone51.toTimeZone();
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone52);
        java.util.Locale locale54 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str58 = locale55.getDisplayVariant(locale57);
        java.util.Set<java.lang.String> strSet59 = locale57.getUnicodeLocaleAttributes();
        java.lang.String str60 = locale54.getDisplayName(locale57);
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(timeZone52, locale54);
        int int63 = calendar61.getMaximum((int) (short) 0);
        calendar61.setLenient(false);
        java.util.Date date66 = calendar61.getTime();
        org.joda.time.LocalDate localDate67 = org.joda.time.LocalDate.fromCalendarFields(calendar61);
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight49.withFields((org.joda.time.ReadablePartial) localDate67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar53 and calendar61", (calendar53.compareTo(calendar61) == 0) == calendar53.equals(calendar61));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        boolean boolean5 = dateMidnight3.isBefore(readableInstant4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str8 = dateTimeZone7.getID();
        org.joda.time.DateMidnight dateMidnight9 = org.joda.time.DateMidnight.now(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.plus((long) 45);
        org.joda.time.DateMidnight.Property property12 = dateMidnight9.weekyear();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        int int14 = dateTimeField13.getMinimumValue();
        org.joda.time.ReadablePartial readablePartial15 = null;
        int[] intArray22 = new int[] { 'u', 6, (byte) 10, 10, 53, 1899 };
        int int23 = dateTimeField13.getMinimumValue(readablePartial15, intArray22);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        int int27 = dateTimeZone25.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 1899, dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        int int31 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime32 = localDate28.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str36 = dateTimeZone35.getID();
        org.joda.time.Interval interval37 = yearMonthDay33.toInterval(dateTimeZone35);
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        org.joda.time.Interval interval40 = interval37.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.DateTimeZone dateTimeZone42 = chronology41.getZone();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.monthOfYear();
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DurationField durationField45 = chronology41.millis();
        org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) readablePartial15, chronology41);
        org.joda.time.DateTime dateTime47 = dateMidnight3.toDateTime(chronology41);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(chronology41);
        org.joda.time.DurationField durationField49 = chronology41.eras();
        org.joda.time.DateTimeZone dateTimeZone50 = chronology41.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField45 and durationField49", Math.signum(durationField45.compareTo(durationField49)) == -Math.signum(durationField49.compareTo(durationField45)));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) (short) 0);
        boolean boolean9 = dateTime6.isBeforeNow();
        org.joda.time.DateTime dateTime11 = dateTime6.minusMonths((-292275054));
        org.joda.time.DateTime dateTime13 = dateTime6.withSecondOfMinute((int) (short) 0);
        org.joda.time.Instant instant14 = dateTime6.toInstant();
        org.joda.time.DateTime dateTime16 = dateTime6.plusHours(762);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant14", (dateTime6.compareTo(instant14) == 0) == dateTime6.equals(instant14));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekOfWeekyear((int) ' ');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusMinutes(4);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusSeconds(2000);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone15);
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str21 = locale18.getDisplayVariant(locale20);
        java.util.Set<java.lang.String> strSet22 = locale20.getUnicodeLocaleAttributes();
        java.lang.String str23 = locale17.getDisplayName(locale20);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone15, locale17);
        int int26 = calendar24.getMaximum((int) (short) 0);
        calendar24.setLenient(false);
        int int29 = calendar24.getWeekYear();
        boolean boolean30 = localDateTime10.equals((java.lang.Object) calendar24);
        org.joda.time.LocalDateTime.Property property31 = localDateTime10.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar16 and calendar24", (calendar16.compareTo(calendar24) == 0) == calendar16.equals(calendar24));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.lang.String[] strArray16 = new java.lang.String[] { "era", "PeriodType[YearDayTime]", "2022-02-21T14:58:49.825+00:00:00.016", "2022-W08-1", "P47W-2195D", "\u4e0a\u5348 01:35:00", "42", "14:59:00.780", "\uc624\uc804 1:35:00", "P100W", "Property[dayOfWeek]", "2189-10-21T14:57:31.018+00:00:00.016", "\uc624\uc804 1:35:00", "2022-02-21T14:55:38.725+00:00:00.016", "2022-02-21T03:57:46.057+00:00:00.016", "DurationField[centuries]" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone19);
        mutableDateTime22.addMonths(32770);
        org.joda.time.Instant instant25 = mutableDateTime22.toInstant();
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Locale[] localeArray29 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList30 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList30, localeArray29);
        java.util.List<java.util.Locale> localeList32 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.util.Locale>) localeList30);
        java.util.stream.Stream<java.util.Locale> localeStream33 = localeList32.stream();
        boolean boolean34 = mutableDateTime22.equals((java.lang.Object) localeList32);
        boolean boolean35 = strSet17.containsAll((java.util.Collection<java.util.Locale>) localeList32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime22 and instant25", (mutableDateTime22.compareTo(instant25) == 0) == mutableDateTime22.equals(instant25));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.parse("00");
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plusDays((int) (short) -1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight1.plusMonths(395);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = timeOfDay11.toDateTimeToday(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.minus((long) (short) 0);
        org.joda.time.DateTime dateTime16 = dateTime15.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        int int19 = dateTimeZone17.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime21 = dateTime16.withZone(dateTimeZone17);
        org.joda.time.DateTime.Property property22 = dateTime21.millisOfDay();
        org.joda.time.DateTime dateTime23 = property22.roundCeilingCopy();
        org.joda.time.DateTime dateTime24 = property22.withMinimumValue();
        org.joda.time.DateTime dateTime26 = property22.setCopy(53815647);
        org.joda.time.DateTime dateTime28 = dateTime26.withMinuteOfHour(16);
        boolean boolean29 = instant6.isBefore((org.joda.time.ReadableInstant) dateTime26);
        java.util.Date date30 = dateTime26.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and instant6", (dateMidnight5.compareTo(instant6) == 0) == dateMidnight5.equals(instant6));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone3);
        calendar4.setTimeInMillis(31556952000L);
        java.util.Date date7 = calendar4.getTime();
        calendar4.setMinimalDaysInFirstWeek(100);
        java.util.Date date10 = calendar4.getTime();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone13);
        timeZone13.setID("1970");
        int int18 = timeZone13.getOffset(1645455363830L);
        calendar4.setTimeZone(timeZone13);
        int int20 = timeZone13.getRawOffset();
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.util.Locale locale22 = java.util.Locale.KOREAN;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.util.Set<java.lang.Character> charSet24 = locale22.getExtensionKeys();
        java.util.Set<java.lang.String> strSet25 = locale22.getUnicodeLocaleKeys();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str28 = dateTimeZone27.getID();
        org.joda.time.DateMidnight dateMidnight29 = org.joda.time.DateMidnight.now(dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.plus((long) 45);
        org.joda.time.DateMidnight.Property property32 = dateMidnight29.weekyear();
        org.joda.time.DateTimeField dateTimeField33 = property32.getField();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(0, (int) '4', chronology36);
        org.joda.time.TimeOfDay.Property property38 = timeOfDay37.secondOfMinute();
        int[] intArray40 = new int[] { 21 };
        int int41 = dateTimeField33.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay37, intArray40);
        long long43 = dateTimeField33.roundCeiling(10L);
        long long45 = dateTimeField33.roundFloor((long) 3);
        java.lang.String str46 = dateTimeField33.toString();
        java.util.Locale locale47 = java.util.Locale.KOREA;
        java.lang.String str48 = locale47.getDisplayName();
        java.lang.String str49 = locale47.getScript();
        int int50 = dateTimeField33.getMaximumShortTextLength(locale47);
        java.lang.String str51 = locale22.getDisplayLanguage(locale47);
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(timeZone13, locale47);
        calendar0.setTimeZone(timeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar52", (calendar14.compareTo(calendar52) == 0) == calendar14.equals(calendar52));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.DateTime dateTime7 = yearMonthDay5.toDateTime(readableInstant6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(1);
        java.lang.String str13 = period12.toString();
        org.joda.time.Period period14 = period10.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period16 = period14.plusMillis(100);
        org.joda.time.Period period17 = period14.negated();
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period23.plusMillis(100);
        boolean boolean26 = period17.equals((java.lang.Object) period25);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period28 = period17.withFields((org.joda.time.ReadablePeriod) mutablePeriod27);
        mutablePeriod27.setYears((int) '#');
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.months();
        mutablePeriod27.add(durationFieldType31, 0);
        org.joda.time.DateMidnight dateMidnight34 = org.joda.time.DateMidnight.now();
        org.joda.time.Period period36 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period38 = org.joda.time.Period.minutes(1);
        java.lang.String str39 = period38.toString();
        org.joda.time.Period period40 = period36.withFields((org.joda.time.ReadablePeriod) period38);
        org.joda.time.Period period42 = period40.plusMillis(100);
        org.joda.time.Period period43 = period40.negated();
        org.joda.time.Period period45 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period47 = org.joda.time.Period.minutes(1);
        java.lang.String str48 = period47.toString();
        org.joda.time.Period period49 = period45.withFields((org.joda.time.ReadablePeriod) period47);
        org.joda.time.Period period51 = period49.plusMillis(100);
        boolean boolean52 = period43.equals((java.lang.Object) period51);
        org.joda.time.Period period54 = period43.minusMillis((int) (short) 10);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight34.minus((org.joda.time.ReadablePeriod) period54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(chronology56);
        org.joda.time.DateTime dateTime59 = dateTime57.withHourOfDay(3);
        int int60 = dateTime59.getSecondOfMinute();
        int int61 = dateTime59.getMinuteOfHour();
        int int62 = dateTime59.getEra();
        org.joda.time.DateTime dateTime63 = dateTime59.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property64 = dateTime63.hourOfDay();
        boolean boolean65 = dateMidnight55.isEqual((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Duration duration66 = mutablePeriod27.toDurationTo((org.joda.time.ReadableInstant) dateMidnight55);
        org.joda.time.DateTime dateTime67 = dateTime7.plus((org.joda.time.ReadableDuration) duration66);
        org.joda.time.DateTime dateTime69 = dateTime67.plusWeeks(53710900);
        int int70 = dateTime67.getDayOfMonth();
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight4, (org.joda.time.ReadableInstant) dateTime67, periodType71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime7", (dateTime3.compareTo(dateTime7) == 0) == dateTime3.equals(dateTime7));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        int int1 = mutablePeriod0.getDays();
        java.util.Date date9 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.fromDateFields(date9);
        org.joda.time.LocalDate.Property property11 = localDate10.weekOfWeekyear();
        org.joda.time.LocalDate localDate13 = property11.setCopy("45");
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str16 = dateTimeZone15.getID();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime20 = dateTime17.withField(dateTimeFieldType18, 44);
        boolean boolean21 = localDate13.isSupported(dateTimeFieldType18);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        int int25 = dateTimeZone23.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 1899, dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str34 = dateTimeZone33.getID();
        org.joda.time.Interval interval35 = yearMonthDay31.toInterval(dateTimeZone33);
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        long long40 = chronology36.add((long) 18, (long) 6, 58);
        boolean boolean41 = dateTimeFieldType18.isSupported(chronology36);
        mutablePeriod0.setPeriod((long) 32, (long) 53, chronology36);
        org.joda.time.DateTimeField dateTimeField43 = chronology36.minuteOfHour();
        org.joda.time.DurationField durationField44 = chronology36.halfdays();
        org.joda.time.DurationField durationField45 = chronology36.eras();
        org.joda.time.YearMonthDay yearMonthDay46 = new org.joda.time.YearMonthDay(chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField44 and durationField45", Math.signum(durationField44.compareTo(durationField45)) == -Math.signum(durationField45.compareTo(durationField44)));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Interval interval14 = yearMonthDay9.toInterval();
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay9.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        int int25 = dateTimeZone23.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 1899, dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str34 = dateTimeZone33.getID();
        org.joda.time.Interval interval35 = yearMonthDay31.toInterval(dateTimeZone33);
        org.joda.time.MutableInterval mutableInterval36 = interval35.toMutableInterval();
        org.joda.time.Interval interval38 = interval35.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology39.getZone();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay21.withChronologyRetainFields(chronology39);
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now(chronology39);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(chronology39);
        mutableDateTime44.setDate((long) 1);
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime44.getZone();
        java.lang.String str48 = dateTimeZone47.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime44", (dateTime8.compareTo(mutableDateTime44) == 0) == dateTime8.equals(mutableDateTime44));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        int int4 = dateTimeZone2.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 1899, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime9 = localDate5.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.Interval interval14 = yearMonthDay10.toInterval(dateTimeZone12);
        org.joda.time.Interval interval15 = yearMonthDay10.toInterval();
        org.joda.time.Period period17 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        java.lang.String str20 = period19.toString();
        org.joda.time.Period period21 = period17.withFields((org.joda.time.ReadablePeriod) period19);
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay10.plus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        int int26 = dateTimeZone24.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 1899, dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime31 = localDate27.toDateTimeAtCurrentTime(dateTimeZone28);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str35 = dateTimeZone34.getID();
        org.joda.time.Interval interval36 = yearMonthDay32.toInterval(dateTimeZone34);
        org.joda.time.MutableInterval mutableInterval37 = interval36.toMutableInterval();
        org.joda.time.Interval interval39 = interval36.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.DateTimeZone dateTimeZone41 = chronology40.getZone();
        org.joda.time.DateTimeField dateTimeField42 = chronology40.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay22.withChronologyRetainFields(chronology40);
        org.joda.time.LocalDate localDate44 = org.joda.time.LocalDate.now(chronology40);
        org.joda.time.DateTimeField dateTimeField45 = chronology40.monthOfYear();
        org.joda.time.DurationField durationField46 = chronology40.eras();
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay(1456066517439L, chronology40);
        org.joda.time.DurationField durationField48 = chronology40.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField46, durationField48, and durationField46", !(durationField46.compareTo(durationField48) == 0) || (Math.signum(durationField46.compareTo(durationField46)) == Math.signum(durationField48.compareTo(durationField46))));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        boolean boolean13 = dateTime10.isBefore((long) ' ');
        org.joda.time.DateMidnight dateMidnight14 = dateTime10.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 1899, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        int int24 = dateTimeZone22.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime25 = localDate21.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str29 = dateTimeZone28.getID();
        org.joda.time.Interval interval30 = yearMonthDay26.toInterval(dateTimeZone28);
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        long long35 = chronology31.add((long) 18, (long) 6, 58);
        org.joda.time.Period period36 = new org.joda.time.Period(0L, (long) 32770, chronology31);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime10.toMutableDateTime(chronology31);
        java.util.GregorianCalendar gregorianCalendar38 = mutableDateTime37.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime25", (dateTime10.compareTo(dateTime25) == 0) == dateTime10.equals(dateTime25));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        boolean boolean12 = mutableDateTime3.isEqualNow();
        org.joda.time.DateTimeField dateTimeField13 = mutableDateTime3.getRoundingField();
        mutableDateTime3.setDate(0L);
        mutableDateTime3.setSecondOfDay(15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone19);
        java.lang.String str22 = dateTime21.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DateTime dateTime25 = dateTime21.withField(dateTimeFieldType23, 5);
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime3, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period30 = org.joda.time.Period.minutes(1);
        java.lang.String str31 = period30.toString();
        org.joda.time.Period period32 = period28.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period34 = period32.plusMillis(100);
        org.joda.time.Period period35 = period32.negated();
        org.joda.time.Period period37 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period39 = org.joda.time.Period.minutes(1);
        java.lang.String str40 = period39.toString();
        org.joda.time.Period period41 = period37.withFields((org.joda.time.ReadablePeriod) period39);
        org.joda.time.Period period43 = period41.plusMillis(100);
        boolean boolean44 = period35.equals((java.lang.Object) period43);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period46 = period35.withFields((org.joda.time.ReadablePeriod) mutablePeriod45);
        mutablePeriod45.setYears((int) '#');
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.months();
        mutablePeriod45.add(durationFieldType49, 0);
        org.joda.time.DateMidnight dateMidnight52 = org.joda.time.DateMidnight.now();
        org.joda.time.Period period54 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period56 = org.joda.time.Period.minutes(1);
        java.lang.String str57 = period56.toString();
        org.joda.time.Period period58 = period54.withFields((org.joda.time.ReadablePeriod) period56);
        org.joda.time.Period period60 = period58.plusMillis(100);
        org.joda.time.Period period61 = period58.negated();
        org.joda.time.Period period63 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period65 = org.joda.time.Period.minutes(1);
        java.lang.String str66 = period65.toString();
        org.joda.time.Period period67 = period63.withFields((org.joda.time.ReadablePeriod) period65);
        org.joda.time.Period period69 = period67.plusMillis(100);
        boolean boolean70 = period61.equals((java.lang.Object) period69);
        org.joda.time.Period period72 = period61.minusMillis((int) (short) 10);
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight52.minus((org.joda.time.ReadablePeriod) period72);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(chronology74);
        org.joda.time.DateTime dateTime77 = dateTime75.withHourOfDay(3);
        int int78 = dateTime77.getSecondOfMinute();
        int int79 = dateTime77.getMinuteOfHour();
        int int80 = dateTime77.getEra();
        org.joda.time.DateTime dateTime81 = dateTime77.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property82 = dateTime81.hourOfDay();
        boolean boolean83 = dateMidnight73.isEqual((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.Duration duration84 = mutablePeriod45.toDurationTo((org.joda.time.ReadableInstant) dateMidnight73);
        org.joda.time.Interval interval85 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration84);
        org.joda.time.DateTime dateTime87 = dateTime25.plusHours((-51));
        org.joda.time.DateTime dateTime89 = dateTime87.minusSeconds(433);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime75", (dateTime21.compareTo(dateTime75) == 0) == dateTime21.equals(dateTime75));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Interval interval14 = yearMonthDay9.toInterval();
        org.joda.time.Period period15 = interval14.toPeriod();
        org.joda.time.Period period17 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        java.lang.String str20 = period19.toString();
        org.joda.time.Period period21 = period17.withFields((org.joda.time.ReadablePeriod) period19);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period24 = period21.withField(durationFieldType22, (int) 'a');
        org.joda.time.Interval interval25 = interval14.withPeriodAfterStart((org.joda.time.ReadablePeriod) period21);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 1899, dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str38 = dateTimeZone37.getID();
        org.joda.time.Interval interval39 = yearMonthDay35.toInterval(dateTimeZone37);
        org.joda.time.MutableInterval mutableInterval40 = interval39.toMutableInterval();
        org.joda.time.Interval interval42 = interval39.withStartMillis((long) 32769);
        org.joda.time.Duration duration43 = interval42.toDuration();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str46 = dateTimeZone45.getID();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(dateTimeZone45);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType49.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray51 = new org.joda.time.DurationFieldType[] { durationFieldType50 };
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.forFields(durationFieldTypeArray51);
        org.joda.time.Period period53 = new org.joda.time.Period((long) ' ', periodType52);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration43, (org.joda.time.ReadableInstant) dateTime47, periodType52);
        boolean boolean55 = dateTime47.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        int int59 = dateTimeZone57.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) 1899, dateTimeZone57);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        int int63 = dateTimeZone61.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime64 = localDate60.toDateTimeAtCurrentTime(dateTimeZone61);
        org.joda.time.YearMonthDay yearMonthDay65 = new org.joda.time.YearMonthDay(dateTimeZone61);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str68 = dateTimeZone67.getID();
        org.joda.time.Interval interval69 = yearMonthDay65.toInterval(dateTimeZone67);
        org.joda.time.Interval interval70 = yearMonthDay65.toInterval();
        org.joda.time.Chronology chronology71 = interval70.getChronology();
        org.joda.time.DateTime dateTime72 = dateTime47.toDateTime(chronology71);
        boolean boolean73 = interval14.equals((java.lang.Object) dateTime47);
        boolean boolean75 = interval14.equals((java.lang.Object) 9223309869549175808L);
        long long76 = interval14.getEndMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and dateTime72", (dateTime47.compareTo(dateTime72) == 0) == dateTime47.equals(dateTime72));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTime(readableInstant1);
        org.joda.time.DateTime.Property property3 = dateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 1899, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime12 = localDate8.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str16 = dateTimeZone15.getID();
        org.joda.time.Interval interval17 = yearMonthDay13.toInterval(dateTimeZone15);
        org.joda.time.Interval interval18 = yearMonthDay13.toInterval();
        org.joda.time.Period period20 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period22 = org.joda.time.Period.minutes(1);
        java.lang.String str23 = period22.toString();
        org.joda.time.Period period24 = period20.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay13.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 1899, dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str38 = dateTimeZone37.getID();
        org.joda.time.Interval interval39 = yearMonthDay35.toInterval(dateTimeZone37);
        org.joda.time.MutableInterval mutableInterval40 = interval39.toMutableInterval();
        org.joda.time.Interval interval42 = interval39.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology43.getZone();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay25.withChronologyRetainFields(chronology43);
        org.joda.time.LocalDate localDate47 = org.joda.time.LocalDate.now(chronology43);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(chronology43);
        org.joda.time.DateTimeField dateTimeField49 = chronology43.centuryOfEra();
        org.joda.time.DateTime dateTime50 = dateTime2.toDateTime(chronology43);
        org.joda.time.DateTimeField dateTimeField51 = chronology43.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone52 = chronology43.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime50", (dateTime2.compareTo(dateTime50) == 0) == dateTime2.equals(dateTime50));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale4.getDisplayName(locale7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone2, locale4);
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("PT1M");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        java.lang.String str15 = locale4.getDisplayScript(locale13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar11", (calendar3.compareTo(calendar11) == 0) == calendar3.equals(calendar11));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.Chronology chronology8 = timeOfDay4.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.eras();
        org.joda.time.DurationField durationField10 = chronology8.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField10, and durationField9", !(durationField9.compareTo(durationField10) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField10.compareTo(durationField9))));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime4 = dateTime1.withYearOfCentury(16);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1899, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.Interval interval18 = yearMonthDay14.toInterval(dateTimeZone16);
        org.joda.time.MutableInterval mutableInterval19 = interval18.toMutableInterval();
        org.joda.time.Interval interval21 = interval18.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology22.getZone();
        org.joda.time.DateTime dateTime24 = dateTime1.toDateTime(dateTimeZone23);
        org.joda.time.DateTime.Property property25 = dateTime1.millisOfDay();
        org.joda.time.DateTime dateTime26 = property25.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime28 = dateTime26.withSecondOfMinute(28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime24", (dateTime26.compareTo(dateTime24) == 0) == dateTime26.equals(dateTime24));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Interval interval19 = yearMonthDay15.toInterval(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval22 = interval19.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime3.toDateTime(chronology23);
        org.joda.time.DateTime.Property property25 = dateTime3.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime3.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 1899, dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        int int34 = dateTimeZone32.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime35 = localDate31.toDateTimeAtCurrentTime(dateTimeZone32);
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str39 = dateTimeZone38.getID();
        org.joda.time.Interval interval40 = yearMonthDay36.toInterval(dateTimeZone38);
        org.joda.time.Interval interval41 = yearMonthDay36.toInterval();
        org.joda.time.Chronology chronology42 = yearMonthDay36.getChronology();
        org.joda.time.Period period44 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period46 = period44.plusYears(8);
        int[] intArray48 = chronology42.get((org.joda.time.ReadablePeriod) period46, 1899L);
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay(chronology42);
        java.util.Date date55 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate56 = org.joda.time.LocalDate.fromDateFields(date55);
        int int57 = localDate56.getWeekyear();
        org.joda.time.LocalDate.Property property58 = localDate56.monthOfYear();
        org.joda.time.LocalDate.Property property59 = localDate56.centuryOfEra();
        org.joda.time.LocalDate localDate60 = property59.roundCeilingCopy();
        org.joda.time.LocalDate localDate62 = localDate60.minusYears(50);
        org.joda.time.DateTime dateTime63 = localDate60.toDateTimeAtCurrentTime();
        java.util.Date date69 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        java.time.Instant instant70 = date69.toInstant();
        org.joda.time.LocalDate localDate71 = org.joda.time.LocalDate.fromDateFields(date69);
        int[] intArray72 = localDate71.getValues();
        chronology42.validate((org.joda.time.ReadablePartial) localDate60, intArray72);
        org.joda.time.DateTimeField dateTimeField74 = chronology42.yearOfCentury();
        java.lang.String str76 = dateTimeField74.getAsText((long) 59);
        int int77 = dateTime3.get(dateTimeField74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and mutableDateTime26", (dateTime24.compareTo(mutableDateTime26) == 0) == dateTime24.equals(mutableDateTime26));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 44);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str4 = dateTimeZone3.getID();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(dateTimeZone3);
        java.lang.String str7 = dateTimeZone3.getName((long) (-1));
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.joda.time.DateTime dateTime10 = dateTime1.toDateTime(dateTimeZone3);
        long long12 = dateTimeZone3.nextTransition((long) 48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime10", (dateTime1.compareTo(dateTime10) == 0) == dateTime1.equals(dateTime10));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        boolean boolean1 = dateTimeFormatter0.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withDefaultYear(3);
        boolean boolean4 = dateTimeFormatter0.isParser();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod();
        int int6 = mutablePeriod5.getDays();
        java.util.Date date14 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.fromDateFields(date14);
        org.joda.time.LocalDate.Property property16 = localDate15.weekOfWeekyear();
        org.joda.time.LocalDate localDate18 = property16.setCopy("45");
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str21 = dateTimeZone20.getID();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime25 = dateTime22.withField(dateTimeFieldType23, 44);
        boolean boolean26 = localDate18.isSupported(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 1899, dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        int int34 = dateTimeZone32.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime35 = localDate31.toDateTimeAtCurrentTime(dateTimeZone32);
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str39 = dateTimeZone38.getID();
        org.joda.time.Interval interval40 = yearMonthDay36.toInterval(dateTimeZone38);
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        long long45 = chronology41.add((long) 18, (long) 6, 58);
        boolean boolean46 = dateTimeFieldType23.isSupported(chronology41);
        mutablePeriod5.setPeriod((long) 32, (long) 53, chronology41);
        org.joda.time.DateTimeField dateTimeField48 = chronology41.minuteOfHour();
        org.joda.time.DurationField durationField49 = chronology41.halfdays();
        org.joda.time.DurationField durationField50 = chronology41.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter0.withChronology(chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField49 and durationField50", Math.signum(durationField49.compareTo(durationField50)) == -Math.signum(durationField50.compareTo(durationField49)));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = calendar3.getWeekYear();
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromCalendarFields(calendar3);
        java.util.TimeZone timeZone6 = calendar3.getTimeZone();
        java.util.Date date12 = new java.util.Date(12, 18, (int) '#', (int) '4', 11);
        date12.setMinutes(19);
        date12.setHours(0);
        boolean boolean17 = calendar3.after((java.lang.Object) date12);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone20);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.fromCalendarFields(calendar21);
        calendar21.setFirstDayOfWeek((int) (short) 100);
        calendar21.set(47, 46, 70, 1900, 1900, (-1));
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone34 = dateTimeZone33.toTimeZone();
        boolean boolean35 = timeZone34.observesDaylightTime();
        java.util.Locale locale36 = java.util.Locale.CANADA_FRENCH;
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone34, locale36);
        calendar21.setTimeZone(timeZone34);
        boolean boolean39 = calendar3.before((java.lang.Object) calendar21);
        boolean boolean40 = calendar21.isWeekDateSupported();
        int int41 = calendar21.getMinimalDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar37", (calendar3.compareTo(calendar37) == 0) == calendar3.equals(calendar37));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy(10);
        org.joda.time.LocalDate localDate11 = localDate9.withWeekyear(1970);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.secondOfMinute();
        boolean boolean17 = property16.isLeap();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableDateTime21.add(readableDuration22, 0);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime21.dayOfWeek();
        org.joda.time.ReadableDuration readableDuration26 = null;
        mutableDateTime21.add(readableDuration26);
        long long28 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime21.weekOfWeekyear();
        org.joda.time.DateTime dateTime30 = localDate9.toDateTime((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.DateTime.Property property31 = dateTime30.millisOfDay();
        int int32 = property31.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime30", (dateTime13.compareTo(dateTime30) == 0) == dateTime13.equals(dateTime30));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = calendar3.getWeekYear();
        java.lang.String str5 = calendar3.getCalendarType();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.LocalDate localDate12 = localDate10.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtCurrentTime(dateTimeZone14);
        int int18 = dateTimeZone14.getOffsetFromLocal((long) 100);
        java.lang.String str20 = dateTimeZone14.getNameKey(0L);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone14);
        long long23 = dateTimeZone14.convertUTCToLocal((-1073174400016L));
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) calendar3, dateTimeZone14);
        org.joda.time.DateTime dateTime26 = dateTime24.minusMinutes(2246400);
        int int27 = dateTime26.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and dateTime24", (mutableDateTime21.compareTo(dateTime24) == 0) == mutableDateTime21.equals(dateTime24));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str3 = dateTimeZone2.getID();
        org.joda.time.DateMidnight dateMidnight4 = org.joda.time.DateMidnight.now(dateTimeZone2);
        org.joda.time.ReadableInstant readableInstant5 = null;
        boolean boolean6 = dateMidnight4.isBefore(readableInstant5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str9 = dateTimeZone8.getID();
        org.joda.time.DateMidnight dateMidnight10 = org.joda.time.DateMidnight.now(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.plus((long) 45);
        org.joda.time.DateMidnight.Property property13 = dateMidnight10.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        int int15 = dateTimeField14.getMinimumValue();
        org.joda.time.ReadablePartial readablePartial16 = null;
        int[] intArray23 = new int[] { 'u', 6, (byte) 10, 10, 53, 1899 };
        int int24 = dateTimeField14.getMinimumValue(readablePartial16, intArray23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 1899, dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        int int32 = dateTimeZone30.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime33 = localDate29.toDateTimeAtCurrentTime(dateTimeZone30);
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str37 = dateTimeZone36.getID();
        org.joda.time.Interval interval38 = yearMonthDay34.toInterval(dateTimeZone36);
        org.joda.time.MutableInterval mutableInterval39 = interval38.toMutableInterval();
        org.joda.time.Interval interval41 = interval38.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.DateTimeZone dateTimeZone43 = chronology42.getZone();
        org.joda.time.DateTimeField dateTimeField44 = chronology42.monthOfYear();
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology42);
        org.joda.time.DurationField durationField46 = chronology42.millis();
        org.joda.time.Period period47 = new org.joda.time.Period((java.lang.Object) readablePartial16, chronology42);
        org.joda.time.DateTime dateTime48 = dateMidnight4.toDateTime(chronology42);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(chronology42);
        org.joda.time.DurationField durationField50 = chronology42.eras();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(obj0, chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField46 and durationField50", Math.signum(durationField46.compareTo(durationField50)) == -Math.signum(durationField50.compareTo(durationField46)));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromCalendarFields(calendar3);
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromCalendarFields(calendar3);
        int int6 = yearMonthDay5.size();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay5.year();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str10 = dateTimeZone9.getID();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now(dateTimeZone9);
        int int13 = dateTimeZone9.getOffset((long) 1);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        java.util.TimeZone timeZone15 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone18);
        timeZone18.setID("1970");
        java.lang.String str22 = timeZone18.getID();
        boolean boolean23 = timeZone15.hasSameRules(timeZone18);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str26 = dateTimeZone25.getID();
        java.util.Locale locale28 = java.util.Locale.KOREAN;
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str31 = locale28.getDisplayVariant(locale30);
        java.lang.String str32 = dateTimeZone25.getName((long) 5, locale28);
        java.lang.String str33 = locale28.getDisplayScript();
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone18, locale28);
        int int35 = property7.getMaximumShortTextLength(locale28);
        org.joda.time.YearMonthDay yearMonthDay37 = property7.addWrapFieldToCopy(943);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar19", (calendar3.compareTo(calendar19) == 0) == calendar3.equals(calendar19));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone12);
        boolean boolean15 = dateTime10.equals((java.lang.Object) dateMidnight14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.plusMonths(10);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight14.withCenturyOfEra(17);
        int int20 = dateMidnight14.getMillisOfDay();
        org.joda.time.MutableDateTime mutableDateTime21 = dateMidnight14.toMutableDateTime();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray27 = timeOfDay26.getFields();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTimeToday(dateTimeZone28);
        org.joda.time.Chronology chronology30 = timeOfDay26.getChronology();
        mutableDateTime21.setChronology(chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and mutableDateTime21", (dateMidnight14.compareTo(mutableDateTime21) == 0) == dateMidnight14.equals(mutableDateTime21));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        int int11 = dateTime10.getMinuteOfHour();
        org.joda.time.Instant instant12 = dateTime10.toInstant();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 10, chronology14);
        org.joda.time.Chronology chronology17 = null;
        mutablePeriod15.setPeriod((long) 0, chronology17);
        mutablePeriod15.addSeconds((int) 'a');
        org.joda.time.DateTime dateTime22 = dateTime10.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod15, 53710900);
        org.joda.time.DateTime dateTime24 = dateTime22.plusDays(1993);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant12", (dateTime10.compareTo(instant12) == 0) == dateTime10.equals(instant12));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) '4', chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = timeOfDay3.getFieldType(1);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay3.plusHours((int) (short) 0);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = timeOfDay12.toDateTimeToday(dateTimeZone13);
        org.joda.time.TimeOfDay.Property property15 = timeOfDay12.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay16 = property15.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay18 = property15.addToCopy((int) (byte) 1);
        java.util.Locale locale19 = null;
        int int20 = property15.getMaximumTextLength(locale19);
        org.joda.time.DurationField durationField21 = property15.getDurationField();
        org.joda.time.DurationFieldType durationFieldType22 = durationField21.getType();
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay3.withFieldAdded(durationFieldType22, (int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = timeOfDay29.toDateTimeToday(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.minus((long) (short) 0);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        boolean boolean36 = dateTime33.isBefore((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime38 = dateTime35.withYearOfCentury(10);
        org.joda.time.Chronology chronology39 = dateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.era();
        org.joda.time.DurationField durationField41 = durationFieldType22.getField(chronology39);
        java.lang.String str42 = durationFieldType22.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField41", (durationField21.compareTo(durationField41) == 0) == durationField21.equals(durationField41));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone3);
        java.util.Calendar.Builder builder5 = builder0.setTimeZone(timeZone3);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 10, chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMinuteOfHour(0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 10, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withWeekyear((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        boolean boolean22 = localDateTime16.equals((java.lang.Object) timeZone21);
        java.util.Calendar.Builder builder23 = builder5.setTimeZone(timeZone21);
        java.util.Calendar.Builder builder25 = builder5.setLenient(false);
        java.util.Calendar.Builder builder29 = builder25.setWeekDate(2012, (int) (short) 10, 99);
        java.util.Calendar.Builder builder31 = builder29.setLenient(false);
        java.util.Calendar.Builder builder35 = builder29.setWeekDate(811, 5, (-2013));
        java.util.Calendar.Builder builder40 = builder35.setTimeOfDay(50, 53711602, 984, 53803354);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone43 = dateTimeZone42.toTimeZone();
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone43);
        java.util.TimeZone.setDefault(timeZone43);
        boolean boolean46 = timeZone43.observesDaylightTime();
        java.util.Calendar.Builder builder47 = builder40.setTimeZone(timeZone43);
        timeZone43.setID("2022-02-21T14:57:17.301+00:00:00.016");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar44", (calendar4.compareTo(calendar44) == 0) == calendar4.equals(calendar44));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = calendar3.getWeekYear();
        java.lang.String str5 = calendar3.getCalendarType();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.LocalDate localDate12 = localDate10.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtCurrentTime(dateTimeZone14);
        int int18 = dateTimeZone14.getOffsetFromLocal((long) 100);
        java.lang.String str20 = dateTimeZone14.getNameKey(0L);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone14);
        long long23 = dateTimeZone14.convertUTCToLocal((-1073174400016L));
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) calendar3, dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        int int27 = dateTimeZone25.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.Period period30 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(1);
        java.lang.String str33 = period32.toString();
        org.joda.time.Period period34 = period30.withFields((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period36 = period32.minusSeconds((int) (short) 100);
        mutableDateTime28.add((org.joda.time.ReadablePeriod) period32);
        mutableDateTime28.addWeekyears(0);
        mutableDateTime28.addHours(2);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime28.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime43 = property42.roundCeiling();
        org.joda.time.DurationField durationField44 = property42.getRangeDurationField();
        boolean boolean45 = calendar3.after((java.lang.Object) durationField44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and dateTime24", (mutableDateTime21.compareTo(dateTime24) == 0) == mutableDateTime21.equals(dateTime24));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.clockhourOfDay();
        org.joda.time.DurationField durationField19 = chronology17.years();
        java.lang.String str20 = durationField19.toString();
        java.util.Date date26 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.fromDateFields(date26);
        org.joda.time.LocalDate.Property property28 = localDate27.weekOfWeekyear();
        org.joda.time.LocalDate localDate30 = property28.setCopy(10);
        org.joda.time.DurationField durationField31 = property28.getRangeDurationField();
        java.lang.String str32 = durationField31.toString();
        long long35 = durationField31.add((long) 1970, (int) (short) 10);
        java.util.Date date41 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.fromDateFields(date41);
        org.joda.time.LocalDate.Property property43 = localDate42.weekOfWeekyear();
        org.joda.time.LocalDate localDate45 = property43.setCopy(10);
        org.joda.time.DurationField durationField46 = property43.getRangeDurationField();
        int int47 = durationField31.compareTo(durationField46);
        int int48 = durationField19.compareTo(durationField46);
        org.joda.time.DurationFieldType durationFieldType49 = durationField46.getType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField46", (durationField19.compareTo(durationField46) == 0) == durationField19.equals(durationField46));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale4.getDisplayName(locale7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone2, locale4);
        int int13 = calendar11.getMaximum((int) (short) 0);
        calendar11.setLenient(false);
        java.util.Date date16 = calendar11.getTime();
        int int17 = calendar11.getWeekYear();
        java.util.TimeZone timeZone18 = calendar11.getTimeZone();
        java.util.Date date19 = calendar11.getTime();
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.fromDateFields(date19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar11", (calendar3.compareTo(calendar11) == 0) == calendar3.equals(calendar11));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        boolean boolean3 = property2.isLeap();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        int int6 = dateTimeZone4.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime7.add(readableDuration8, 0);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.dayOfWeek();
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime7.add(readableDuration12);
        long long14 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime7);
        int int15 = mutableDateTime7.getDayOfMonth();
        mutableDateTime7.addDays((int) 'a');
        int int18 = mutableDateTime7.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        int int22 = dateTimeZone20.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 1899, dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        int int26 = dateTimeZone24.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime27 = localDate23.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str31 = dateTimeZone30.getID();
        org.joda.time.Interval interval32 = yearMonthDay28.toInterval(dateTimeZone30);
        org.joda.time.MutableInterval mutableInterval33 = interval32.toMutableInterval();
        org.joda.time.Interval interval35 = interval32.withStartMillis((long) 32769);
        org.joda.time.Duration duration36 = interval35.toDuration();
        java.lang.String str37 = duration36.toString();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        int int41 = dateTimeZone39.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 1899, dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime46 = localDate42.toDateTimeAtCurrentTime(dateTimeZone43);
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str50 = dateTimeZone49.getID();
        org.joda.time.Interval interval51 = yearMonthDay47.toInterval(dateTimeZone49);
        org.joda.time.MutableInterval mutableInterval52 = interval51.toMutableInterval();
        org.joda.time.Interval interval54 = interval51.withStartMillis((long) 32769);
        org.joda.time.Duration duration55 = interval54.toDuration();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str58 = dateTimeZone57.getID();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(dateTimeZone57);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType62 = dateTimeFieldType61.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray63 = new org.joda.time.DurationFieldType[] { durationFieldType62 };
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.forFields(durationFieldTypeArray63);
        org.joda.time.Period period65 = new org.joda.time.Period((long) ' ', periodType64);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration55, (org.joda.time.ReadableInstant) dateTime59, periodType64);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str69 = dateTimeZone68.getID();
        org.joda.time.DateMidnight dateMidnight70 = org.joda.time.DateMidnight.now(dateTimeZone68);
        org.joda.time.Interval interval71 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration55, (org.joda.time.ReadableInstant) dateMidnight70);
        int int72 = duration36.compareTo((org.joda.time.ReadableDuration) duration55);
        mutableDateTime7.add((org.joda.time.ReadableDuration) duration36);
        mutableDateTime7.add((long) 491);
        java.lang.String str76 = mutableDateTime7.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime59", (dateTime1.compareTo(dateTime59) == 0) == dateTime1.equals(dateTime59));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime3, readableDuration12);
        mutableDateTime3.setMillisOfDay(10);
        mutableDateTime3.setSecondOfDay(1970);
        int int18 = mutableDateTime3.getMinuteOfDay();
        int int19 = mutableDateTime3.getWeekyear();
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray25 = timeOfDay24.getFields();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = timeOfDay24.toDateTimeToday(dateTimeZone26);
        org.joda.time.DateTime.Property property28 = dateTime27.monthOfYear();
        org.joda.time.DateTime dateTime30 = dateTime27.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str33 = dateTimeZone32.getID();
        org.joda.time.DateMidnight dateMidnight34 = org.joda.time.DateMidnight.now(dateTimeZone32);
        boolean boolean35 = dateTime30.equals((java.lang.Object) dateMidnight34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight34.plusMonths(10);
        org.joda.time.DateMidnight.Property property38 = dateMidnight37.dayOfYear();
        org.joda.time.DateMidnight dateMidnight39 = property38.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight39.withDurationAdded((long) 400, 20);
        mutableDateTime3.setMillis((org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        int int46 = dateTimeZone44.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone44);
        org.joda.time.ReadableDuration readableDuration48 = null;
        mutableDateTime47.add(readableDuration48, 0);
        org.joda.time.Period period52 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period54 = org.joda.time.Period.minutes(1);
        java.lang.String str55 = period54.toString();
        org.joda.time.Period period56 = period52.withFields((org.joda.time.ReadablePeriod) period54);
        org.joda.time.Period period58 = period54.minusSeconds((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Duration duration60 = period54.toDurationFrom(readableInstant59);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime47, (org.joda.time.ReadableDuration) duration60);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight42.withDurationAdded((org.joda.time.ReadableDuration) duration60, 1439);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod();
        java.lang.String str65 = mutablePeriod64.toString();
        mutablePeriod64.setPeriod(0L);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str70 = dateTimeZone69.getID();
        org.joda.time.DateMidnight dateMidnight71 = org.joda.time.DateMidnight.now(dateTimeZone69);
        org.joda.time.ReadableInstant readableInstant72 = null;
        boolean boolean73 = dateMidnight71.isBefore(readableInstant72);
        int int74 = dateMidnight71.getYearOfCentury();
        org.joda.time.DateMidnight.Property property75 = dateMidnight71.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight77 = dateMidnight71.minusMonths(7);
        org.joda.time.Duration duration78 = mutablePeriod64.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight71);
        org.joda.time.Period period80 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period82 = org.joda.time.Period.minutes(1);
        java.lang.String str83 = period82.toString();
        org.joda.time.Period period84 = period80.withFields((org.joda.time.ReadablePeriod) period82);
        org.joda.time.DurationFieldType durationFieldType85 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period87 = period84.withField(durationFieldType85, (int) 'a');
        org.joda.time.Period period89 = period87.withDays((int) (short) -1);
        org.joda.time.Period period91 = period87.minusHours(3172000);
        org.joda.time.Duration duration92 = period91.toStandardDuration();
        boolean boolean93 = duration78.isEqual((org.joda.time.ReadableDuration) duration92);
        org.joda.time.PeriodType periodType94 = null;
        org.joda.time.Period period95 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight63, (org.joda.time.ReadableDuration) duration78, periodType94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateMidnight63", (mutableDateTime3.compareTo(dateMidnight63) == 0) == mutableDateTime3.equals(dateMidnight63));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTime(readableInstant1);
        org.joda.time.DateTime.Property property3 = dateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 1899, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime12 = localDate8.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str16 = dateTimeZone15.getID();
        org.joda.time.Interval interval17 = yearMonthDay13.toInterval(dateTimeZone15);
        org.joda.time.Interval interval18 = yearMonthDay13.toInterval();
        org.joda.time.Period period20 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period22 = org.joda.time.Period.minutes(1);
        java.lang.String str23 = period22.toString();
        org.joda.time.Period period24 = period20.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay13.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 1899, dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str38 = dateTimeZone37.getID();
        org.joda.time.Interval interval39 = yearMonthDay35.toInterval(dateTimeZone37);
        org.joda.time.MutableInterval mutableInterval40 = interval39.toMutableInterval();
        org.joda.time.Interval interval42 = interval39.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology43.getZone();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay25.withChronologyRetainFields(chronology43);
        org.joda.time.LocalDate localDate47 = org.joda.time.LocalDate.now(chronology43);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(chronology43);
        org.joda.time.DateTimeField dateTimeField49 = chronology43.centuryOfEra();
        org.joda.time.DateTime dateTime50 = dateTime2.toDateTime(chronology43);
        org.joda.time.DateTimeField dateTimeField51 = chronology43.monthOfYear();
        boolean boolean53 = dateTimeField51.isLeap(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime50", (dateTime2.compareTo(dateTime50) == 0) == dateTime2.equals(dateTime50));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        java.util.Date date6 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromDateFields(date6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 1899, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        int int18 = dateTimeZone16.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str23 = dateTimeZone22.getID();
        org.joda.time.Interval interval24 = yearMonthDay20.toInterval(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone22);
        org.joda.time.DateTime dateTime26 = localDate7.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (short) 10, dateTimeZone22);
        java.lang.String str29 = dateTimeZone22.getShortName((-865L));
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod();
        java.lang.String str31 = mutablePeriod30.toString();
        mutablePeriod30.setPeriod(0L);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        int int37 = dateTimeZone35.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 1899, dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        int int41 = dateTimeZone39.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime42 = localDate38.toDateTimeAtCurrentTime(dateTimeZone39);
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str46 = dateTimeZone45.getID();
        org.joda.time.Interval interval47 = yearMonthDay43.toInterval(dateTimeZone45);
        org.joda.time.MutableInterval mutableInterval48 = interval47.toMutableInterval();
        org.joda.time.Interval interval50 = interval47.withStartMillis((long) 32769);
        org.joda.time.Duration duration51 = interval50.toDuration();
        java.lang.String str52 = duration51.toString();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        int int56 = dateTimeZone54.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) 1899, dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        int int60 = dateTimeZone58.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime61 = localDate57.toDateTimeAtCurrentTime(dateTimeZone58);
        org.joda.time.YearMonthDay yearMonthDay62 = new org.joda.time.YearMonthDay(dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str65 = dateTimeZone64.getID();
        org.joda.time.Interval interval66 = yearMonthDay62.toInterval(dateTimeZone64);
        org.joda.time.MutableInterval mutableInterval67 = interval66.toMutableInterval();
        org.joda.time.Interval interval69 = interval66.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology70 = interval69.getChronology();
        org.joda.time.DateTimeZone dateTimeZone71 = chronology70.getZone();
        org.joda.time.DateTimeField dateTimeField72 = chronology70.monthOfYear();
        org.joda.time.Period period74 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period76 = org.joda.time.Period.minutes(1);
        java.lang.String str77 = period76.toString();
        org.joda.time.Period period78 = period74.withFields((org.joda.time.ReadablePeriod) period76);
        org.joda.time.Period period80 = period78.plusMillis(100);
        org.joda.time.Period period81 = period78.negated();
        org.joda.time.Period period83 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period85 = org.joda.time.Period.minutes(1);
        java.lang.String str86 = period85.toString();
        org.joda.time.Period period87 = period83.withFields((org.joda.time.ReadablePeriod) period85);
        org.joda.time.Period period89 = period87.plusMillis(100);
        boolean boolean90 = period81.equals((java.lang.Object) period89);
        long long93 = chronology70.add((org.joda.time.ReadablePeriod) period81, 31556952000L, (int) '4');
        mutablePeriod30.setPeriod((org.joda.time.ReadableDuration) duration51, chronology70);
        org.joda.time.DateMidnight dateMidnight95 = org.joda.time.DateMidnight.now(chronology70);
        org.joda.time.DateMidnight dateMidnight97 = dateMidnight95.withYearOfEra(59);
        int int98 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) dateMidnight95);
        java.lang.String str99 = dateTimeZone22.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime26", (dateTime9.compareTo(dateTime26) == 0) == dateTime9.equals(dateTime26));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        boolean boolean12 = mutableDateTime3.isEqualNow();
        org.joda.time.DateTimeField dateTimeField13 = mutableDateTime3.getRoundingField();
        mutableDateTime3.setDate(0L);
        mutableDateTime3.setSecondOfDay(15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone19);
        java.lang.String str22 = dateTime21.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DateTime dateTime25 = dateTime21.withField(dateTimeFieldType23, 5);
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime3, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period30 = org.joda.time.Period.minutes(1);
        java.lang.String str31 = period30.toString();
        org.joda.time.Period period32 = period28.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period34 = period32.plusMillis(100);
        org.joda.time.Period period35 = period32.negated();
        org.joda.time.Period period37 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period39 = org.joda.time.Period.minutes(1);
        java.lang.String str40 = period39.toString();
        org.joda.time.Period period41 = period37.withFields((org.joda.time.ReadablePeriod) period39);
        org.joda.time.Period period43 = period41.plusMillis(100);
        boolean boolean44 = period35.equals((java.lang.Object) period43);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period46 = period35.withFields((org.joda.time.ReadablePeriod) mutablePeriod45);
        mutablePeriod45.setYears((int) '#');
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.months();
        mutablePeriod45.add(durationFieldType49, 0);
        org.joda.time.DateMidnight dateMidnight52 = org.joda.time.DateMidnight.now();
        org.joda.time.Period period54 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period56 = org.joda.time.Period.minutes(1);
        java.lang.String str57 = period56.toString();
        org.joda.time.Period period58 = period54.withFields((org.joda.time.ReadablePeriod) period56);
        org.joda.time.Period period60 = period58.plusMillis(100);
        org.joda.time.Period period61 = period58.negated();
        org.joda.time.Period period63 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period65 = org.joda.time.Period.minutes(1);
        java.lang.String str66 = period65.toString();
        org.joda.time.Period period67 = period63.withFields((org.joda.time.ReadablePeriod) period65);
        org.joda.time.Period period69 = period67.plusMillis(100);
        boolean boolean70 = period61.equals((java.lang.Object) period69);
        org.joda.time.Period period72 = period61.minusMillis((int) (short) 10);
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight52.minus((org.joda.time.ReadablePeriod) period72);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(chronology74);
        org.joda.time.DateTime dateTime77 = dateTime75.withHourOfDay(3);
        int int78 = dateTime77.getSecondOfMinute();
        int int79 = dateTime77.getMinuteOfHour();
        int int80 = dateTime77.getEra();
        org.joda.time.DateTime dateTime81 = dateTime77.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property82 = dateTime81.hourOfDay();
        boolean boolean83 = dateMidnight73.isEqual((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.Duration duration84 = mutablePeriod45.toDurationTo((org.joda.time.ReadableInstant) dateMidnight73);
        org.joda.time.Interval interval85 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration84);
        org.joda.time.Duration duration86 = duration84.toDuration();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime75", (dateTime21.compareTo(dateTime75) == 0) == dateTime21.equals(dateTime75));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        java.lang.String[] strArray9 = new java.lang.String[] { "+00:00:00.016", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000", "46", "hi!", "45", "00", "45", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        strSet10.clear();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period15 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period17 = org.joda.time.Period.minutes(1);
        java.lang.String str18 = period17.toString();
        org.joda.time.Period period19 = period15.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period21 = period19.plusMillis(100);
        org.joda.time.LocalTime localTime22 = localTime13.minus((org.joda.time.ReadablePeriod) period19);
        boolean boolean23 = strSet10.equals((java.lang.Object) period19);
        java.lang.Object[] objArray24 = strSet10.toArray();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str27 = dateTimeZone26.getID();
        org.joda.time.DateMidnight dateMidnight28 = org.joda.time.DateMidnight.now(dateTimeZone26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        boolean boolean30 = dateMidnight28.isBefore(readableInstant29);
        int int31 = dateMidnight28.getYearOfCentury();
        org.joda.time.DateMidnight.Property property32 = dateMidnight28.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight33 = property32.roundFloorCopy();
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.withMonthOfYear((int) (byte) 10);
        boolean boolean36 = strSet10.remove((java.lang.Object) dateMidnight33);
        org.joda.time.Instant instant37 = dateMidnight33.toInstant();
        java.util.Date date43 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        int int44 = date43.getSeconds();
        org.joda.time.TimeOfDay timeOfDay45 = org.joda.time.TimeOfDay.fromDateFields(date43);
        org.joda.time.LocalTime localTime46 = org.joda.time.LocalTime.fromDateFields(date43);
        org.joda.time.LocalTime localTime48 = localTime46.plusMinutes(5);
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime55 = timeOfDay53.toDateTimeToday(dateTimeZone54);
        org.joda.time.DateTime dateTime57 = dateTime55.minus((long) (short) 0);
        org.joda.time.DateTime dateTime58 = dateTime57.toDateTimeISO();
        org.joda.time.DateTime dateTime60 = dateTime58.minus(315705601970L);
        org.joda.time.DateTime.Property property61 = dateTime58.era();
        int int62 = dateTime58.getWeekyear();
        org.joda.time.DateTime dateTime63 = localTime46.toDateTime((org.joda.time.ReadableInstant) dateTime58);
        boolean boolean64 = dateMidnight33.isAfter((org.joda.time.ReadableInstant) dateTime63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight33 and instant37", (dateMidnight33.compareTo(instant37) == 0) == dateMidnight33.equals(instant37));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone12);
        boolean boolean15 = dateTime10.equals((java.lang.Object) dateMidnight14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.plusMonths(10);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight14.withCenturyOfEra(17);
        int int20 = dateMidnight14.getMillisOfDay();
        org.joda.time.MutableDateTime mutableDateTime21 = dateMidnight14.toMutableDateTime();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray27 = timeOfDay26.getFields();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTimeToday(dateTimeZone28);
        org.joda.time.Chronology chronology30 = timeOfDay26.getChronology();
        mutableDateTime21.setChronology(chronology30);
        org.joda.time.DurationField durationField32 = chronology30.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and mutableDateTime21", (dateMidnight14.compareTo(mutableDateTime21) == 0) == dateMidnight14.equals(mutableDateTime21));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Interval interval14 = yearMonthDay9.toInterval();
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay9.plus((org.joda.time.ReadablePeriod) period16);
        int int22 = yearMonthDay9.size();
        org.joda.time.Interval interval23 = yearMonthDay9.toInterval();
        org.joda.time.DateTime dateTime24 = yearMonthDay9.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime25 = yearMonthDay9.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property26 = yearMonthDay9.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        int int31 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 1899, dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        int int35 = dateTimeZone33.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime36 = localDate32.toDateTimeAtCurrentTime(dateTimeZone33);
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str40 = dateTimeZone39.getID();
        org.joda.time.Interval interval41 = yearMonthDay37.toInterval(dateTimeZone39);
        org.joda.time.Interval interval42 = yearMonthDay37.toInterval();
        org.joda.time.Period period44 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period46 = org.joda.time.Period.minutes(1);
        java.lang.String str47 = period46.toString();
        org.joda.time.Period period48 = period44.withFields((org.joda.time.ReadablePeriod) period46);
        org.joda.time.YearMonthDay yearMonthDay49 = yearMonthDay37.plus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        int int53 = dateTimeZone51.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) 1899, dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        int int57 = dateTimeZone55.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime58 = localDate54.toDateTimeAtCurrentTime(dateTimeZone55);
        org.joda.time.YearMonthDay yearMonthDay59 = new org.joda.time.YearMonthDay(dateTimeZone55);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str62 = dateTimeZone61.getID();
        org.joda.time.Interval interval63 = yearMonthDay59.toInterval(dateTimeZone61);
        org.joda.time.MutableInterval mutableInterval64 = interval63.toMutableInterval();
        org.joda.time.Interval interval66 = interval63.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology67 = interval66.getChronology();
        org.joda.time.DateTimeZone dateTimeZone68 = chronology67.getZone();
        org.joda.time.DateTimeField dateTimeField69 = chronology67.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay70 = yearMonthDay49.withChronologyRetainFields(chronology67);
        org.joda.time.DateMidnight dateMidnight71 = yearMonthDay49.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.getDefault();
        int int75 = dateTimeZone73.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate76 = new org.joda.time.LocalDate((long) 1899, dateTimeZone73);
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        int int79 = dateTimeZone77.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime80 = localDate76.toDateTimeAtCurrentTime(dateTimeZone77);
        org.joda.time.DateMidnight dateMidnight81 = yearMonthDay49.toDateMidnight(dateTimeZone77);
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime((long) 895, dateTimeZone77);
        boolean boolean83 = dateTime82.isEqualNow();
        java.util.Date date84 = dateTime82.toDate();
        java.util.Locale locale85 = java.util.Locale.FRENCH;
        java.lang.String str86 = locale85.getISO3Country();
        java.util.Calendar calendar87 = dateTime82.toCalendar(locale85);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter88 = org.joda.time.format.ISODateTimeFormat.weekDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter90 = dateTimeFormatter88.withPivotYear(59);
        org.joda.time.Chronology chronology91 = dateTimeFormatter88.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone93 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter94 = dateTimeFormatter88.withZone(dateTimeZone93);
        org.joda.time.DateTime dateTime95 = dateTime82.toDateTime(dateTimeZone93);
        org.joda.time.DateMidnight dateMidnight96 = yearMonthDay9.toDateMidnight(dateTimeZone93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime82 and dateTime95", (dateTime82.compareTo(dateTime95) == 0) == dateTime82.equals(dateTime95));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        int int11 = dateTime10.getMinuteOfHour();
        org.joda.time.Instant instant12 = dateTime10.toInstant();
        org.joda.time.DateTime dateTime14 = dateTime10.minusMonths((int) (short) 0);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant12", (dateTime14.compareTo(instant12) == 0) == dateTime14.equals(instant12));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone12);
        boolean boolean15 = dateTime10.equals((java.lang.Object) dateMidnight14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.plusMonths(10);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight14.withCenturyOfEra(17);
        int int20 = dateMidnight14.getMillisOfDay();
        org.joda.time.MutableDateTime mutableDateTime21 = dateMidnight14.toMutableDateTime();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray27 = timeOfDay26.getFields();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTimeToday(dateTimeZone28);
        org.joda.time.Chronology chronology30 = timeOfDay26.getChronology();
        mutableDateTime21.setChronology(chronology30);
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and mutableDateTime21", (dateMidnight14.compareTo(mutableDateTime21) == 0) == dateMidnight14.equals(mutableDateTime21));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone3);
        java.util.Calendar.Builder builder5 = builder0.setTimeZone(timeZone3);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 10, chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMinuteOfHour(0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 10, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withWeekyear((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        boolean boolean22 = localDateTime16.equals((java.lang.Object) timeZone21);
        java.util.Calendar.Builder builder23 = builder5.setTimeZone(timeZone21);
        java.util.Calendar.Builder builder25 = builder5.setLenient(false);
        java.util.Calendar.Builder builder29 = builder25.setWeekDate(2012, (int) (short) 10, 99);
        java.util.Calendar.Builder builder33 = builder29.setWeekDate((int) (short) 10, 366, 3172001);
        java.util.Calendar.Builder builder37 = builder33.setDate(31, 29, 53824916);
        java.util.TimeZone timeZone39 = java.util.TimeZone.getTimeZone("");
        boolean boolean40 = timeZone39.observesDaylightTime();
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(timeZone39);
        timeZone39.setID("2022-02-21T14:58:42.269+00:00:00.016");
        java.util.Calendar.Builder builder44 = builder33.setTimeZone(timeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar41", (calendar4.compareTo(calendar41) == 0) == calendar4.equals(calendar41));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.List<java.util.Locale> localeList6 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.stream.Stream<java.util.Locale> localeStream7 = localeList4.parallelStream();
        java.lang.String[] strArray16 = new java.lang.String[] { "2022-02-21T00:52:52.000Z", "Korean (South Korea)", "1970", "hi!", "1970", "45", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000", "PT0S" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale[] localeArray22 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList23 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList23, localeArray22);
        java.util.List<java.util.Locale> localeList25 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList23);
        java.util.stream.Stream<java.util.Locale> localeStream26 = localeList25.parallelStream();
        boolean boolean27 = strSet17.retainAll((java.util.Collection<java.util.Locale>) localeList25);
        java.util.Iterator<java.util.Locale> localeItor28 = localeList25.iterator();
        boolean boolean29 = localeList4.retainAll((java.util.Collection<java.util.Locale>) localeList25);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone32);
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.util.Locale locale37 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str38 = locale35.getDisplayVariant(locale37);
        java.util.Set<java.lang.String> strSet39 = locale37.getUnicodeLocaleAttributes();
        java.lang.String str40 = locale34.getDisplayName(locale37);
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(timeZone32, locale34);
        int int43 = calendar41.getMaximum((int) (short) 0);
        calendar41.setLenient(false);
        java.util.Date date46 = calendar41.getTime();
        int int47 = calendar41.getWeekYear();
        java.util.TimeZone timeZone48 = calendar41.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        int int52 = dateTimeZone50.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) 1899, dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        int int56 = dateTimeZone54.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime57 = localDate53.toDateTimeAtCurrentTime(dateTimeZone54);
        org.joda.time.YearMonthDay yearMonthDay58 = new org.joda.time.YearMonthDay(dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str61 = dateTimeZone60.getID();
        org.joda.time.Interval interval62 = yearMonthDay58.toInterval(dateTimeZone60);
        org.joda.time.YearMonthDay.Property property63 = yearMonthDay58.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay65 = property63.addWrapFieldToCopy(10);
        org.joda.time.DateTimeField dateTimeField66 = property63.getField();
        java.util.Date date72 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate73 = org.joda.time.LocalDate.fromDateFields(date72);
        org.joda.time.LocalDate.Property property74 = localDate73.weekOfWeekyear();
        org.joda.time.LocalDate localDate76 = property74.setCopy("45");
        org.joda.time.LocalDate localDate78 = localDate76.minusDays((int) (short) 10);
        java.util.Locale locale80 = java.util.Locale.getDefault();
        java.lang.String str81 = dateTimeField66.getAsText((org.joda.time.ReadablePartial) localDate78, 292278993, locale80);
        int int82 = dateTimeField66.getMaximumValue();
        long long84 = dateTimeField66.roundHalfFloor((long) (-53773230));
        boolean boolean85 = calendar41.before((java.lang.Object) long84);
        boolean boolean86 = localeList4.remove((java.lang.Object) calendar41);
        java.util.Locale.LanguageRange[] languageRangeArray87 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList88 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList88, languageRangeArray87);
        java.util.Locale[] localeArray90 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList91 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList91, localeArray90);
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList88, (java.util.Collection<java.util.Locale>) localeList91);
        java.lang.Object[] objArray94 = localeList91.toArray();
        boolean boolean95 = localeList91.isEmpty();
        boolean boolean96 = localeList4.removeAll((java.util.Collection<java.util.Locale>) localeList91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar33 and calendar41", (calendar33.compareTo(calendar41) == 0) == calendar33.equals(calendar41));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime3.addMonths(32770);
        org.joda.time.Instant instant6 = mutableDateTime3.toInstant();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale[] localeArray10 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList11 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList11, localeArray10);
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList11);
        java.util.stream.Stream<java.util.Locale> localeStream14 = localeList13.stream();
        boolean boolean15 = mutableDateTime3.equals((java.lang.Object) localeList13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale[] localeArray19 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList20 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList20, localeArray19);
        java.util.List<java.util.Locale> localeList22 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList20);
        boolean boolean23 = localeList22.isEmpty();
        java.util.Iterator<java.util.Locale> localeItor24 = localeList22.iterator();
        boolean boolean25 = localeList13.containsAll((java.util.Collection<java.util.Locale>) localeList22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant6", (mutableDateTime3.compareTo(instant6) == 0) == mutableDateTime3.equals(instant6));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType4.getDurationType();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight3.withField(dateTimeFieldType4, (int) (short) 10);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight3.minusYears((int) 'u');
        org.joda.time.Instant instant10 = dateMidnight3.toInstant();
        java.util.GregorianCalendar gregorianCalendar11 = dateMidnight3.toGregorianCalendar();
        boolean boolean12 = gregorianCalendar11.isLenient();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant10", (dateMidnight3.compareTo(instant10) == 0) == dateMidnight3.equals(instant10));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        int int4 = dateTimeZone2.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 1899, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime9 = localDate5.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.Interval interval14 = yearMonthDay10.toInterval(dateTimeZone12);
        org.joda.time.Interval interval15 = yearMonthDay10.toInterval();
        org.joda.time.Period period17 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        java.lang.String str20 = period19.toString();
        org.joda.time.Period period21 = period17.withFields((org.joda.time.ReadablePeriod) period19);
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay10.plus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        int int26 = dateTimeZone24.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 1899, dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime31 = localDate27.toDateTimeAtCurrentTime(dateTimeZone28);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str35 = dateTimeZone34.getID();
        org.joda.time.Interval interval36 = yearMonthDay32.toInterval(dateTimeZone34);
        org.joda.time.MutableInterval mutableInterval37 = interval36.toMutableInterval();
        org.joda.time.Interval interval39 = interval36.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.DateTimeZone dateTimeZone41 = chronology40.getZone();
        org.joda.time.DateTimeField dateTimeField42 = chronology40.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay22.withChronologyRetainFields(chronology40);
        org.joda.time.DateMidnight dateMidnight44 = yearMonthDay22.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        int int48 = dateTimeZone46.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) 1899, dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        int int52 = dateTimeZone50.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime53 = localDate49.toDateTimeAtCurrentTime(dateTimeZone50);
        org.joda.time.DateMidnight dateMidnight54 = yearMonthDay22.toDateMidnight(dateTimeZone50);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) 895, dateTimeZone50);
        boolean boolean56 = dateTime55.isEqualNow();
        java.util.Date date57 = dateTime55.toDate();
        java.util.Locale locale58 = java.util.Locale.FRENCH;
        java.lang.String str59 = locale58.getISO3Country();
        java.util.Calendar calendar60 = dateTime55.toCalendar(locale58);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = org.joda.time.format.ISODateTimeFormat.weekDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter61.withPivotYear(59);
        org.joda.time.Chronology chronology64 = dateTimeFormatter61.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter61.withZone(dateTimeZone66);
        org.joda.time.DateTime dateTime68 = dateTime55.toDateTime(dateTimeZone66);
        org.joda.time.DateTime dateTime70 = dateTime55.minusMonths(1900);
        int int71 = dateTime70.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime55 and dateTime68", (dateTime55.compareTo(dateTime68) == 0) == dateTime55.equals(dateTime68));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-21T14:55:34.849+00:00:00.016");
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Calendar.Builder builder3 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone6);
        java.util.Calendar.Builder builder8 = builder3.setTimeZone(timeZone6);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone6);
        boolean boolean10 = timeZone1.hasSameRules(timeZone6);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone14);
        timeZone14.setID("1970");
        int int19 = timeZone14.getOffset(1645455363830L);
        timeZone14.setID("53");
        boolean boolean22 = timeZone6.hasSameRules(timeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar7 and calendar15", (calendar7.compareTo(calendar15) == 0) == calendar7.equals(calendar15));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale4.getDisplayName(locale7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone2, locale4);
        int int13 = calendar11.getMaximum((int) (short) 0);
        calendar11.setLenient(false);
        java.util.Date date16 = calendar11.getTime();
        org.joda.time.YearMonthDay yearMonthDay17 = org.joda.time.YearMonthDay.fromCalendarFields(calendar11);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.plusDays(8);
        org.joda.time.LocalDate localDate22 = localDate20.withCenturyOfEra((int) 'a');
        org.joda.time.LocalDate localDate24 = localDate20.plusDays((int) (short) 0);
        org.joda.time.LocalDate localDate26 = localDate24.withYearOfCentury((int) (short) 1);
        org.joda.time.LocalDate localDate28 = localDate24.withMonthOfYear(12);
        java.util.Date date29 = localDate28.toDate();
        org.joda.time.YearMonthDay yearMonthDay30 = org.joda.time.YearMonthDay.fromDateFields(date29);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.now(dateTimeZone31);
        org.joda.time.Interval interval33 = yearMonthDay30.toInterval(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay30.minusDays(1969);
        int int36 = yearMonthDay17.compareTo((org.joda.time.ReadablePartial) yearMonthDay35);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        int int40 = dateTimeZone38.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) 1899, dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        int int44 = dateTimeZone42.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime45 = localDate41.toDateTimeAtCurrentTime(dateTimeZone42);
        org.joda.time.YearMonthDay yearMonthDay46 = new org.joda.time.YearMonthDay(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str49 = dateTimeZone48.getID();
        org.joda.time.Interval interval50 = yearMonthDay46.toInterval(dateTimeZone48);
        org.joda.time.Interval interval51 = yearMonthDay46.toInterval();
        org.joda.time.Chronology chronology52 = yearMonthDay46.getChronology();
        org.joda.time.Period period54 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period56 = period54.plusYears(8);
        int[] intArray58 = chronology52.get((org.joda.time.ReadablePeriod) period56, 1899L);
        org.joda.time.YearMonthDay yearMonthDay59 = new org.joda.time.YearMonthDay(chronology52);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        int int63 = dateTimeZone61.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((long) 1899, dateTimeZone61);
        org.joda.time.LocalDate localDate66 = localDate64.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone69 = dateTimeZone68.toTimeZone();
        org.joda.time.DateTime dateTime70 = localDate64.toDateTimeAtCurrentTime(dateTimeZone68);
        int int72 = dateTimeZone68.getOffsetFromLocal((long) 100);
        java.lang.String str74 = dateTimeZone68.getNameKey((long) 999);
        long long78 = dateTimeZone68.convertLocalToUTC((long) '4', false, (long) 52);
        java.lang.String str80 = dateTimeZone68.getShortName((long) (-292275054));
        org.joda.time.DateMidnight dateMidnight81 = yearMonthDay59.toDateMidnight(dateTimeZone68);
        org.joda.time.DateTime dateTime82 = yearMonthDay35.toDateTimeAtMidnight(dateTimeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar11", (calendar3.compareTo(calendar11) == 0) == calendar3.equals(calendar11));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        int int4 = dateTimeZone2.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 1899, dateTimeZone2);
        org.joda.time.LocalDate localDate7 = localDate5.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = localDate5.toDateTimeAtCurrentTime(dateTimeZone9);
        int int13 = dateTimeZone9.getOffsetFromLocal((long) 100);
        java.lang.String str15 = dateTimeZone9.getNameKey((long) 999);
        long long17 = dateTimeZone9.nextTransition((long) 1899);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone9);
        java.lang.String str20 = dateTimeZone9.getShortName((long) 25);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 611, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        int int25 = dateTimeZone23.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 1899, dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        org.joda.time.DateTime.Property property33 = dateTime32.secondOfMinute();
        boolean boolean34 = localDate26.equals((java.lang.Object) dateTime32);
        java.lang.String str35 = dateTime32.toString();
        org.joda.time.DateTime dateTime37 = dateTime32.plusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime38 = dateTime32.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime41 = dateTime32.withDurationAdded((long) 5872, 54);
        int int42 = dateTime32.getWeekyear();
        int int43 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) dateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime30", (dateTime11.compareTo(dateTime30) == 0) == dateTime11.equals(dateTime30));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone12);
        java.lang.String str16 = dateTimeZone12.getName((long) (-1));
        org.joda.time.Interval interval17 = localDate4.toInterval(dateTimeZone12);
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay18.minusYears(29);
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay20.minusMonths(4);
        org.joda.time.Period period24 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period26 = org.joda.time.Period.minutes(1);
        java.lang.String str27 = period26.toString();
        org.joda.time.Period period28 = period24.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Period period30 = period28.minusMinutes(2022);
        int int32 = period28.getValue(0);
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay22.withPeriodAdded((org.joda.time.ReadablePeriod) period28, (-2195));
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        int int38 = dateTimeZone36.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) 1899, dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        int int42 = dateTimeZone40.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime43 = localDate39.toDateTimeAtCurrentTime(dateTimeZone40);
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str47 = dateTimeZone46.getID();
        org.joda.time.Interval interval48 = yearMonthDay44.toInterval(dateTimeZone46);
        org.joda.time.YearMonthDay.Property property49 = yearMonthDay44.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str52 = dateTimeZone51.getID();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = yearMonthDay44.toDateTimeAtCurrentTime(dateTimeZone51);
        java.lang.String str56 = dateTimeZone51.getName(3155846399999L);
        org.joda.time.DateTime dateTime57 = yearMonthDay22.toDateTimeAtCurrentTime(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime43", (dateTime10.compareTo(dateTime43) == 0) == dateTime10.equals(dateTime43));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Duration duration17 = interval16.toDuration();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray25 = new org.joda.time.DurationFieldType[] { durationFieldType24 };
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.forFields(durationFieldTypeArray25);
        org.joda.time.Period period27 = new org.joda.time.Period((long) ' ', periodType26);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateTime21, periodType26);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str31 = dateTimeZone30.getID();
        org.joda.time.DateMidnight dateMidnight32 = org.joda.time.DateMidnight.now(dateTimeZone30);
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateMidnight32);
        boolean boolean35 = interval33.isAfter((long) 1899);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        int int39 = dateTimeZone37.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 1899, dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        int int43 = dateTimeZone41.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime44 = localDate40.toDateTimeAtCurrentTime(dateTimeZone41);
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str48 = dateTimeZone47.getID();
        org.joda.time.Interval interval49 = yearMonthDay45.toInterval(dateTimeZone47);
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        boolean boolean52 = interval49.isBefore(1L);
        boolean boolean53 = interval33.overlaps((org.joda.time.ReadableInterval) interval49);
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType55 = periodType54.withDaysRemoved();
        org.joda.time.Period period56 = interval49.toPeriod(periodType54);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        int int60 = dateTimeZone58.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate((long) 1899, dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        int int64 = dateTimeZone62.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime65 = localDate61.toDateTimeAtCurrentTime(dateTimeZone62);
        org.joda.time.YearMonthDay yearMonthDay66 = new org.joda.time.YearMonthDay(dateTimeZone62);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str69 = dateTimeZone68.getID();
        org.joda.time.Interval interval70 = yearMonthDay66.toInterval(dateTimeZone68);
        org.joda.time.Interval interval71 = yearMonthDay66.toInterval();
        boolean boolean72 = interval71.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.getDefault();
        int int75 = dateTimeZone73.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(dateTimeZone73);
        org.joda.time.ReadableDuration readableDuration77 = null;
        mutableDateTime76.add(readableDuration77, 0);
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime76.dayOfWeek();
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime76.millisOfDay();
        boolean boolean82 = interval71.isAfter((org.joda.time.ReadableInstant) mutableDateTime76);
        org.joda.time.Interval interval83 = interval49.withEnd((org.joda.time.ReadableInstant) mutableDateTime76);
        org.joda.time.Period period87 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period89 = org.joda.time.Period.minutes(1);
        java.lang.String str90 = period89.toString();
        org.joda.time.Period period91 = period87.withFields((org.joda.time.ReadablePeriod) period89);
        org.joda.time.PeriodType periodType92 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period93 = period87.normalizedStandard(periodType92);
        org.joda.time.PeriodType periodType94 = periodType92.withSecondsRemoved();
        org.joda.time.Period period95 = new org.joda.time.Period((long) (-292275054), 86399984L, periodType92);
        org.joda.time.ReadableInstant readableInstant96 = null;
        org.joda.time.Interval interval97 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period95, readableInstant96);
        boolean boolean98 = interval83.isAfter((org.joda.time.ReadableInterval) interval97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and mutableDateTime76", (dateTime21.compareTo(mutableDateTime76) == 0) == dateTime21.equals(mutableDateTime76));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Interval interval19 = yearMonthDay15.toInterval(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval22 = interval19.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime3.toDateTime(chronology23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime27 = dateTime24.withZoneRetainFields(dateTimeZone26);
        boolean boolean29 = dateTime27.isAfter((long) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime24", (dateTime3.compareTo(dateTime24) == 0) == dateTime3.equals(dateTime24));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(10L);
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusYears(18);
        java.util.Date date9 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.fromDateFields(date9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 1899, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime22 = localDate18.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str26 = dateTimeZone25.getID();
        org.joda.time.Interval interval27 = yearMonthDay23.toInterval(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone25);
        org.joda.time.DateTime dateTime29 = localDate10.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.Interval interval30 = yearMonthDay3.toInterval(dateTimeZone25);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(0);
        org.joda.time.Interval interval33 = interval30.withPeriodAfterStart((org.joda.time.ReadablePeriod) period32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime29", (dateTime12.compareTo(dateTime29) == 0) == dateTime12.equals(dateTime29));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period8 = period6.plusMillis(100);
        org.joda.time.LocalTime localTime9 = localTime0.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.LocalTime localTime11 = localTime9.minusMinutes(0);
        org.joda.time.LocalTime.Property property12 = localTime9.millisOfSecond();
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.getDefault(category13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str17 = dateTimeZone16.getID();
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str22 = locale19.getDisplayVariant(locale21);
        java.lang.String str23 = dateTimeZone16.getName((long) 5, locale19);
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = timeOfDay28.toDateTimeToday(dateTimeZone29);
        org.joda.time.TimeOfDay.Property property31 = timeOfDay28.secondOfMinute();
        java.util.Locale locale32 = java.util.Locale.KOREAN;
        java.util.Locale locale34 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str35 = locale32.getDisplayVariant(locale34);
        int int36 = property31.getMaximumTextLength(locale34);
        java.lang.String str37 = locale19.getDisplayCountry(locale34);
        java.util.Locale.setDefault(category13, locale19);
        java.util.Locale locale39 = java.util.Locale.getDefault(category13);
        java.lang.String str40 = locale39.getScript();
        int int41 = property12.getMaximumShortTextLength(locale39);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str44 = dateTimeZone43.getID();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        int int48 = dateTimeZone46.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone46);
        org.joda.time.Period period51 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period53 = org.joda.time.Period.minutes(1);
        java.lang.String str54 = period53.toString();
        org.joda.time.Period period55 = period51.withFields((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Period period57 = period53.minusSeconds((int) (short) 100);
        mutableDateTime49.add((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(chronology59);
        org.joda.time.DateTime.Property property61 = dateTime60.secondOfMinute();
        org.joda.time.DateTime dateTime63 = dateTime60.withYearOfCentury(16);
        mutableDateTime49.setDate((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime49.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime67 = property65.addWrapField(2);
        boolean boolean68 = dateTimeZone43.equals((java.lang.Object) mutableDateTime67);
        org.joda.time.MutableDateTime mutableDateTime69 = mutableDateTime67.toMutableDateTime();
        boolean boolean70 = property12.equals((java.lang.Object) mutableDateTime69);
        org.joda.time.LocalTime localTime72 = property12.addNoWrapToCopy((-34537737));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime45 and dateTime60", (dateTime45.compareTo(dateTime60) == 0) == dateTime45.equals(dateTime60));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Period period5 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period7 = org.joda.time.Period.minutes(1);
        java.lang.String str8 = period7.toString();
        org.joda.time.Period period9 = period5.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) (short) 100);
        mutableDateTime3.add((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.secondOfMinute();
        org.joda.time.DateTime dateTime17 = dateTime14.withYearOfCentury(16);
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        int int22 = dateTimeZone20.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.Period period25 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period27 = org.joda.time.Period.minutes(1);
        java.lang.String str28 = period27.toString();
        org.joda.time.Period period29 = period25.withFields((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Period period31 = period27.minusSeconds((int) (short) 100);
        mutableDateTime23.add((org.joda.time.ReadablePeriod) period27);
        mutableDateTime23.addWeekyears(0);
        mutableDateTime23.addHours(2);
        mutableDateTime23.addYears(50);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime23.era();
        org.joda.time.MutableDateTime mutableDateTime41 = property39.addWrapField(18);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 10, chronology43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.withMinuteOfHour(0);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) 10, chronology48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime46.withFields((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str56 = dateTimeZone55.getID();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(dateTimeZone55);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime60 = dateTime57.withField(dateTimeFieldType58, 44);
        org.joda.time.DurationFieldType durationFieldType61 = dateTimeFieldType58.getRangeDurationType();
        org.joda.time.LocalDateTime.Property property62 = localDateTime52.property(dateTimeFieldType58);
        mutableDateTime41.set(dateTimeFieldType58, 49);
        boolean boolean65 = mutableDateTime3.isSupported(dateTimeFieldType58);
        java.util.Date date71 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate72 = org.joda.time.LocalDate.fromDateFields(date71);
        org.joda.time.LocalDate.Property property73 = localDate72.weekOfWeekyear();
        org.joda.time.LocalDate localDate75 = property73.setCopy("45");
        org.joda.time.LocalDate localDate76 = property73.withMaximumValue();
        org.joda.time.LocalDate.Property property77 = localDate76.centuryOfEra();
        boolean boolean78 = property77.isLeap();
        org.joda.time.LocalDate localDate79 = property77.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate81 = localDate79.minusYears(3390);
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str84 = dateTimeZone83.getID();
        org.joda.time.DateMidnight dateMidnight85 = org.joda.time.DateMidnight.now(dateTimeZone83);
        org.joda.time.DateTimeZone dateTimeZone86 = org.joda.time.DateTimeZone.getDefault();
        int int88 = dateTimeZone86.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime89 = new org.joda.time.MutableDateTime(dateTimeZone86);
        int int90 = dateMidnight85.compareTo((org.joda.time.ReadableInstant) mutableDateTime89);
        org.joda.time.MutableDateTime.Property property91 = mutableDateTime89.weekyear();
        int int92 = mutableDateTime89.getWeekyear();
        org.joda.time.DateTime dateTime93 = localDate79.toDateTime((org.joda.time.ReadableInstant) mutableDateTime89);
        int int94 = mutableDateTime89.getEra();
        mutableDateTime3.setMillis((org.joda.time.ReadableInstant) mutableDateTime89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime57", (dateTime14.compareTo(dateTime57) == 0) == dateTime14.equals(dateTime57));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale4.getDisplayName(locale7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone2, locale4);
        java.lang.String str12 = timeZone2.getID();
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.util.Set<java.lang.String> strSet19 = locale17.getUnicodeLocaleAttributes();
        java.lang.String str20 = locale14.getDisplayName(locale17);
        java.lang.String str21 = locale14.getDisplayScript();
        java.lang.String str22 = locale14.getScript();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone2, locale14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar11", (calendar3.compareTo(calendar11) == 0) == calendar3.equals(calendar11));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = timeOfDay9.toDateTimeToday(dateTimeZone10);
        mutableDateTime4.setZoneRetainFields(dateTimeZone10);
        boolean boolean13 = mutableDateTime4.isEqualNow();
        org.joda.time.DateTimeField dateTimeField14 = mutableDateTime4.getRoundingField();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readablePeriod0, (org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.Period period16 = interval15.toPeriod();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        int int19 = dateTimeZone17.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = timeOfDay25.toDateTimeToday(dateTimeZone26);
        mutableDateTime20.setZoneRetainFields(dateTimeZone26);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime20, readableDuration29);
        mutableDateTime20.setMillisOfDay(10);
        mutableDateTime20.setDayOfYear(5);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime20.weekyear();
        mutableDateTime20.addMinutes((int) (short) 0);
        boolean boolean38 = interval15.isAfter((org.joda.time.ReadableInstant) mutableDateTime20);
        mutableDateTime20.setTime((long) 37);
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((java.lang.Object) mutableDateTime20);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 1899, dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        int int49 = dateTimeZone47.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime50 = localDate46.toDateTimeAtCurrentTime(dateTimeZone47);
        org.joda.time.YearMonthDay yearMonthDay51 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str54 = dateTimeZone53.getID();
        org.joda.time.Interval interval55 = yearMonthDay51.toInterval(dateTimeZone53);
        org.joda.time.Interval interval56 = yearMonthDay51.toInterval();
        org.joda.time.Chronology chronology57 = yearMonthDay51.getChronology();
        int int58 = yearMonthDay51.getYear();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        int int62 = dateTimeZone60.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((long) 1899, dateTimeZone60);
        org.joda.time.LocalDate localDate65 = localDate63.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone68 = dateTimeZone67.toTimeZone();
        org.joda.time.DateTime dateTime69 = localDate63.toDateTimeAtCurrentTime(dateTimeZone67);
        int int71 = dateTimeZone67.getOffsetFromLocal((long) 100);
        java.lang.String str73 = dateTimeZone67.getNameKey(0L);
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(dateTimeZone67);
        long long76 = dateTimeZone67.convertUTCToLocal((-1073174400016L));
        org.joda.time.DateTime dateTime77 = yearMonthDay51.toDateTimeAtCurrentTime(dateTimeZone67);
        java.lang.String str79 = dateTimeZone67.getNameKey((long) 352);
        org.joda.time.DateMidnight dateMidnight80 = new org.joda.time.DateMidnight((java.lang.Object) mutableDateTime20, dateTimeZone67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and mutableDateTime74", (mutableDateTime4.compareTo(mutableDateTime74) == 0) == mutableDateTime4.equals(mutableDateTime74));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.setYears(16);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, 0);
        org.joda.time.Period period11 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period13 = org.joda.time.Period.minutes(1);
        java.lang.String str14 = period13.toString();
        org.joda.time.Period period15 = period11.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period17 = period13.minusSeconds((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period13.toDurationFrom(readableInstant18);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime6, (org.joda.time.ReadableDuration) duration19);
        mutablePeriod0.add((org.joda.time.ReadableDuration) duration19);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        int int24 = dateTimeZone22.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = timeOfDay30.toDateTimeToday(dateTimeZone31);
        mutableDateTime25.setZoneRetainFields(dateTimeZone31);
        boolean boolean34 = mutableDateTime25.isEqualNow();
        org.joda.time.DateTimeField dateTimeField35 = mutableDateTime25.getRoundingField();
        mutableDateTime25.setDate(0L);
        mutableDateTime25.setSecondOfDay(15);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str42 = dateTimeZone41.getID();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(dateTimeZone41);
        java.lang.String str44 = dateTime43.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DateTime dateTime47 = dateTime43.withField(dateTimeFieldType45, 5);
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime25, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Period period53 = new org.joda.time.Period(12, 16, 14, (int) '#');
        org.joda.time.Period period55 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period57 = org.joda.time.Period.minutes(1);
        java.lang.String str58 = period57.toString();
        org.joda.time.Period period59 = period55.withFields((org.joda.time.ReadablePeriod) period57);
        org.joda.time.Period period61 = period59.plusMillis(100);
        org.joda.time.Period period62 = period59.negated();
        org.joda.time.Period period64 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period66 = org.joda.time.Period.minutes(1);
        java.lang.String str67 = period66.toString();
        org.joda.time.Period period68 = period64.withFields((org.joda.time.ReadablePeriod) period66);
        org.joda.time.Period period70 = period68.plusMillis(100);
        boolean boolean71 = period62.equals((java.lang.Object) period70);
        org.joda.time.Period period73 = period62.minusMillis((int) (short) 10);
        org.joda.time.Period period74 = period73.normalizedStandard();
        int int75 = period73.getWeeks();
        org.joda.time.Period period76 = period73.normalizedStandard();
        int[] intArray77 = period76.getValues();
        org.joda.time.Period period78 = period53.withFields((org.joda.time.ReadablePeriod) period76);
        org.joda.time.Period period80 = period76.withWeeks(811);
        org.joda.time.Period period82 = org.joda.time.Period.days(1439);
        org.joda.time.Period period83 = period76.withFields((org.joda.time.ReadablePeriod) period82);
        mutableDateTime25.add((org.joda.time.ReadablePeriod) period83);
        boolean boolean85 = duration19.equals((java.lang.Object) period83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and dateTime43", (mutableDateTime6.compareTo(dateTime43) == 0) == mutableDateTime6.equals(dateTime43));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        java.lang.String str4 = dateTime3.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DateTime dateTime7 = dateTime3.withField(dateTimeFieldType5, 5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 1899, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.Interval interval21 = yearMonthDay17.toInterval(dateTimeZone19);
        org.joda.time.Interval interval22 = yearMonthDay17.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateMidnight dateMidnight24 = org.joda.time.DateMidnight.now(chronology23);
        org.joda.time.DateTime dateTime25 = dateTime3.toDateTime(chronology23);
        java.util.GregorianCalendar gregorianCalendar26 = dateTime3.toGregorianCalendar();
        int int27 = gregorianCalendar26.getWeekYear();
        int int28 = gregorianCalendar26.getFirstDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime25", (dateTime3.compareTo(dateTime25) == 0) == dateTime3.equals(dateTime25));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        java.lang.String str4 = dateTime3.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DateTime dateTime7 = dateTime3.withField(dateTimeFieldType5, 5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 1899, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.Interval interval21 = yearMonthDay17.toInterval(dateTimeZone19);
        org.joda.time.Interval interval22 = yearMonthDay17.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateMidnight dateMidnight24 = org.joda.time.DateMidnight.now(chronology23);
        org.joda.time.DateTime dateTime25 = dateTime3.toDateTime(chronology23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 1899, dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(dateTimeZone31);
        int int36 = yearMonthDay35.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight37 = yearMonthDay35.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        int int41 = dateTimeZone39.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 1899, dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime46 = localDate42.toDateTimeAtCurrentTime(dateTimeZone43);
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str50 = dateTimeZone49.getID();
        org.joda.time.Interval interval51 = yearMonthDay47.toInterval(dateTimeZone49);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay47.dayOfMonth();
        java.lang.String str53 = property52.getAsText();
        org.joda.time.DateTimeField dateTimeField54 = property52.getField();
        org.joda.time.YearMonthDay yearMonthDay56 = property52.addToCopy(2194);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.DateTime dateTime59 = yearMonthDay56.toDateTimeAtMidnight(dateTimeZone58);
        org.joda.time.DateTime dateTime60 = yearMonthDay35.toDateTimeAtCurrentTime(dateTimeZone58);
        org.joda.time.DateTime dateTime61 = dateTime25.toDateTime(dateTimeZone58);
        int int62 = dateTime61.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime25", (dateTime3.compareTo(dateTime25) == 0) == dateTime3.equals(dateTime25));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.withHourOfDay(3);
        int int7 = dateTime6.getSecondOfMinute();
        int int8 = dateTime6.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 1899, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtCurrentTime(dateTimeZone14);
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str21 = dateTimeZone20.getID();
        org.joda.time.Interval interval22 = yearMonthDay18.toInterval(dateTimeZone20);
        org.joda.time.MutableInterval mutableInterval23 = interval22.toMutableInterval();
        org.joda.time.Interval interval25 = interval22.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.DateTime dateTime27 = dateTime6.toDateTime(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.dayOfWeek();
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay((java.lang.Object) chronology1, chronology26);
        org.joda.time.Period period31 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period33 = org.joda.time.Period.minutes(1);
        java.lang.String str34 = period33.toString();
        org.joda.time.Period period35 = period31.withFields((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Period period37 = period35.plusMillis(100);
        org.joda.time.Period period38 = period35.negated();
        int int39 = period38.getMillis();
        org.joda.time.Period period41 = period38.minusDays(32);
        org.joda.time.Period period42 = period41.negated();
        org.joda.time.Period period44 = period41.withDays((-1000));
        org.joda.time.Weeks weeks45 = period41.toStandardWeeks();
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay29.minus((org.joda.time.ReadablePeriod) weeks45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime27", (dateTime6.compareTo(dateTime27) == 0) == dateTime6.equals(dateTime27));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        java.lang.String str4 = dateTime3.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DateTime dateTime7 = dateTime3.withField(dateTimeFieldType5, 5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 1899, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.Interval interval21 = yearMonthDay17.toInterval(dateTimeZone19);
        org.joda.time.Interval interval22 = yearMonthDay17.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateMidnight dateMidnight24 = org.joda.time.DateMidnight.now(chronology23);
        org.joda.time.DateTime dateTime25 = dateTime3.toDateTime(chronology23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 1899, dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(dateTimeZone31);
        int int36 = yearMonthDay35.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight37 = yearMonthDay35.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        int int41 = dateTimeZone39.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 1899, dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime46 = localDate42.toDateTimeAtCurrentTime(dateTimeZone43);
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str50 = dateTimeZone49.getID();
        org.joda.time.Interval interval51 = yearMonthDay47.toInterval(dateTimeZone49);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay47.dayOfMonth();
        java.lang.String str53 = property52.getAsText();
        org.joda.time.DateTimeField dateTimeField54 = property52.getField();
        org.joda.time.YearMonthDay yearMonthDay56 = property52.addToCopy(2194);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.DateTime dateTime59 = yearMonthDay56.toDateTimeAtMidnight(dateTimeZone58);
        org.joda.time.DateTime dateTime60 = yearMonthDay35.toDateTimeAtCurrentTime(dateTimeZone58);
        org.joda.time.DateTime dateTime61 = dateTime25.toDateTime(dateTimeZone58);
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate(dateTimeZone58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime61", (dateTime3.compareTo(dateTime61) == 0) == dateTime3.equals(dateTime61));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) (short) 0);
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.minus(315705601970L);
        org.joda.time.DateTime.Property property12 = dateTime9.era();
        org.joda.time.DateTime dateTime13 = property12.getDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekyear(1722);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime13, dateTimeZone17);
        org.joda.time.DateTime dateTime21 = dateTime13.plusDays(1900);
        org.joda.time.DateTime dateTime23 = dateTime13.plusMillis(32770);
        java.util.Date date29 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        int int30 = date29.getSeconds();
        org.joda.time.TimeOfDay timeOfDay31 = org.joda.time.TimeOfDay.fromDateFields(date29);
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.fromDateFields(date29);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.LocalTime localTime34 = property33.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime36 = localTime34.plusMinutes(25);
        org.joda.time.LocalTime localTime38 = localTime34.plusMinutes(15);
        org.joda.time.LocalTime localTime40 = localTime38.minusMillis(1200000);
        org.joda.time.Period period42 = org.joda.time.Period.hours(32);
        org.joda.time.Period period44 = period42.minusSeconds((int) (short) 100);
        org.joda.time.LocalTime localTime46 = localTime38.withPeriodAdded((org.joda.time.ReadablePeriod) period42, 87);
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = timeOfDay51.toDateTimeToday(dateTimeZone52);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean55 = dateTime53.isSupported(dateTimeFieldType54);
        int int56 = dateTime53.getYearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DateTime.Property property58 = dateTime53.property(dateTimeFieldType57);
        org.joda.time.DurationFieldType durationFieldType59 = dateTimeFieldType57.getDurationType();
        org.joda.time.LocalTime.Property property60 = localTime38.property(dateTimeFieldType57);
        org.joda.time.DateTime.Property property61 = dateTime23.property(dateTimeFieldType57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and mutableDateTime19", (dateTime6.compareTo(mutableDateTime19) == 0) == dateTime6.equals(mutableDateTime19));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        int int11 = dateTime10.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 1899, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        int int19 = dateTimeZone17.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime20 = localDate16.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str24 = dateTimeZone23.getID();
        org.joda.time.Interval interval25 = yearMonthDay21.toInterval(dateTimeZone23);
        org.joda.time.Interval interval26 = yearMonthDay21.toInterval();
        org.joda.time.Chronology chronology27 = yearMonthDay21.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime10.toMutableDateTime(chronology27);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime20", (dateTime10.compareTo(dateTime20) == 0) == dateTime10.equals(dateTime20));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTime.Property property11 = dateTime10.weekOfWeekyear();
        org.joda.time.DateTime dateTime12 = property11.roundHalfEvenCopy();
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay((long) 50);
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period22 = period20.plusMillis(100);
        org.joda.time.Period period23 = period20.negated();
        org.joda.time.Period period25 = period23.withMillis(1899);
        org.joda.time.Minutes minutes26 = period23.toStandardMinutes();
        org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay14.minus((org.joda.time.ReadablePeriod) minutes26);
        org.joda.time.DateTime dateTime28 = dateTime12.withFields((org.joda.time.ReadablePartial) yearMonthDay14);
        org.joda.time.Period period30 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(1);
        java.lang.String str33 = period32.toString();
        org.joda.time.Period period34 = period30.withFields((org.joda.time.ReadablePeriod) period32);
        int int35 = period30.getMinutes();
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str39 = dateTimeZone38.getID();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone38);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime43 = dateTime40.withField(dateTimeFieldType41, 44);
        org.joda.time.DurationFieldType durationFieldType44 = dateTimeFieldType41.getRangeDurationType();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        int int48 = dateTimeZone46.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) 1899, dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        int int52 = dateTimeZone50.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime53 = localDate49.toDateTimeAtCurrentTime(dateTimeZone50);
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str57 = dateTimeZone56.getID();
        org.joda.time.Interval interval58 = yearMonthDay54.toInterval(dateTimeZone56);
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.Interval interval60 = interval58.toInterval();
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType62 = periodType61.withWeeksRemoved();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        int int66 = dateTimeZone64.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate((long) 1899, dateTimeZone64);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        int int70 = dateTimeZone68.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime71 = localDate67.toDateTimeAtCurrentTime(dateTimeZone68);
        org.joda.time.YearMonthDay yearMonthDay72 = new org.joda.time.YearMonthDay(dateTimeZone68);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str75 = dateTimeZone74.getID();
        org.joda.time.Interval interval76 = yearMonthDay72.toInterval(dateTimeZone74);
        org.joda.time.MutableInterval mutableInterval77 = interval76.toMutableInterval();
        org.joda.time.Interval interval79 = interval76.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology80 = interval79.getChronology();
        org.joda.time.DateTimeZone dateTimeZone81 = chronology80.getZone();
        org.joda.time.DateTimeField dateTimeField82 = chronology80.monthOfYear();
        org.joda.time.DateMidnight dateMidnight83 = new org.joda.time.DateMidnight(chronology80);
        org.joda.time.DurationField durationField84 = chronology80.millis();
        org.joda.time.DateTimeField dateTimeField85 = chronology80.dayOfMonth();
        org.joda.time.Period period86 = new org.joda.time.Period((java.lang.Object) interval58, periodType62, chronology80);
        org.joda.time.DateTimeField dateTimeField87 = chronology80.dayOfYear();
        org.joda.time.DurationField durationField88 = durationFieldType44.getField(chronology80);
        boolean boolean89 = durationFieldType36.isSupported(chronology80);
        org.joda.time.Period period91 = period30.withField(durationFieldType36, (int) (byte) 100);
        org.joda.time.YearMonthDay yearMonthDay93 = yearMonthDay14.withFieldAdded(durationFieldType36, 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime53", (dateTime10.compareTo(dateTime53) == 0) == dateTime10.equals(dateTime53));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        boolean boolean13 = dateTime10.isBefore((long) ' ');
        org.joda.time.DateMidnight dateMidnight14 = dateTime10.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 1899, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        int int24 = dateTimeZone22.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime25 = localDate21.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str29 = dateTimeZone28.getID();
        org.joda.time.Interval interval30 = yearMonthDay26.toInterval(dateTimeZone28);
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        long long35 = chronology31.add((long) 18, (long) 6, 58);
        org.joda.time.Period period36 = new org.joda.time.Period(0L, (long) 32770, chronology31);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime10.toMutableDateTime(chronology31);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime37.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime25", (dateTime10.compareTo(dateTime25) == 0) == dateTime10.equals(dateTime25));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime6 = dateTime3.withField(dateTimeFieldType4, 44);
        org.joda.time.DateTime dateTime8 = dateTime6.withSecondOfMinute((int) '4');
        int int9 = dateTime6.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(3);
        org.joda.time.DateTime dateTime12 = dateTime6.withZone(dateTimeZone11);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Locale[] localeArray17 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList18 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList18, localeArray17);
        java.util.List<java.util.Locale> localeList20 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.util.Locale>) localeList18);
        boolean boolean21 = localeList20.isEmpty();
        java.util.stream.Stream<java.util.Locale> localeStream22 = localeList20.stream();
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str26 = locale23.getDisplayVariant(locale25);
        boolean boolean27 = localeList20.add(locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = org.joda.time.format.ISODateTimeFormat.tTime();
        java.util.Locale locale29 = java.util.Locale.CANADA;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter28.withLocale(locale29);
        java.lang.String str31 = locale25.getDisplayVariant(locale29);
        java.lang.String str32 = dateTimeZone11.getName((long) (-2447), locale29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime12", (dateTime6.compareTo(dateTime12) == 0) == dateTime6.equals(dateTime12));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.timeParser();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        int int4 = dateTimeZone2.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 1899, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime9 = localDate5.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.Interval interval14 = yearMonthDay10.toInterval(dateTimeZone12);
        java.util.Date date20 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.fromDateFields(date20);
        org.joda.time.LocalDate.Property property22 = localDate21.weekOfWeekyear();
        org.joda.time.LocalDate localDate24 = property22.setCopy(10);
        org.joda.time.LocalDate localDate26 = localDate24.withWeekyear(1970);
        org.joda.time.LocalDate localDate28 = localDate26.withWeekyear(53);
        java.util.Date date34 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.fromDateFields(date34);
        org.joda.time.LocalDate.Property property36 = localDate35.weekOfWeekyear();
        org.joda.time.LocalDate localDate38 = property36.setCopy(10);
        org.joda.time.LocalDate localDate40 = localDate38.withWeekyear(1970);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDate localDate42 = localDate40.minus(readablePeriod41);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        int int46 = dateTimeZone44.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) 1899, dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        int int50 = dateTimeZone48.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime51 = localDate47.toDateTimeAtCurrentTime(dateTimeZone48);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.weekyear();
        int int53 = localDate47.get(dateTimeFieldType52);
        boolean boolean54 = localDate40.isSupported(dateTimeFieldType52);
        org.joda.time.LocalDate localDate56 = localDate28.withField(dateTimeFieldType52, 14);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate58 = org.joda.time.LocalDate.now(dateTimeZone57);
        org.joda.time.Interval interval59 = localDate56.toInterval(dateTimeZone57);
        org.joda.time.DateTime dateTime60 = yearMonthDay10.toDateTimeAtMidnight(dateTimeZone57);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        int int64 = dateTimeZone62.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) 1899, dateTimeZone62);
        org.joda.time.LocalDate localDate67 = localDate65.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone70 = dateTimeZone69.toTimeZone();
        org.joda.time.DateTime dateTime71 = localDate65.toDateTimeAtCurrentTime(dateTimeZone69);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str74 = dateTimeZone73.getID();
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(dateTimeZone73);
        java.lang.String str77 = dateTimeZone73.getName((long) (-1));
        org.joda.time.Interval interval78 = localDate65.toInterval(dateTimeZone73);
        org.joda.time.DateTime dateTime79 = yearMonthDay10.toDateTimeAtMidnight(dateTimeZone73);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter80 = dateTimeFormatter0.withZone(dateTimeZone73);
        boolean boolean81 = dateTimeFormatter80.isOffsetParsed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime71", (dateTime9.compareTo(dateTime71) == 0) == dateTime9.equals(dateTime71));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 1899, dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime18 = localDate14.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str22 = dateTimeZone21.getID();
        org.joda.time.Interval interval23 = yearMonthDay19.toInterval(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone21);
        org.joda.time.DateTime dateTime25 = localDate6.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now(dateTimeZone26);
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone26);
        boolean boolean29 = dateTimeZone26.isFixed();
        java.lang.Object obj30 = null;
        boolean boolean31 = dateTimeZone26.equals(obj30);
        org.joda.time.DateTime dateTime32 = localDate6.toDateTimeAtCurrentTime(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime25", (dateTime8.compareTo(dateTime25) == 0) == dateTime8.equals(dateTime25));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondFraction();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(32);
        java.lang.String str4 = dateTimeFormatter0.print((-60652367995439L));
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter0.getZone();
        boolean boolean6 = dateTimeFormatter0.isPrinter();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(10L);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusYears(18);
        java.util.Date date16 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.fromDateFields(date16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate17.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        int int24 = dateTimeZone22.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 1899, dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime29 = localDate25.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str33 = dateTimeZone32.getID();
        org.joda.time.Interval interval34 = yearMonthDay30.toInterval(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone32);
        org.joda.time.DateTime dateTime36 = localDate17.toDateTimeAtCurrentTime(dateTimeZone32);
        org.joda.time.Interval interval37 = yearMonthDay10.toInterval(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        int int40 = dateTimeZone38.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.ReadableDuration readableDuration42 = null;
        mutableDateTime41.add(readableDuration42, 0);
        org.joda.time.Period period46 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period48 = org.joda.time.Period.minutes(1);
        java.lang.String str49 = period48.toString();
        org.joda.time.Period period50 = period46.withFields((org.joda.time.ReadablePeriod) period48);
        org.joda.time.Period period52 = period48.minusSeconds((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Duration duration54 = period48.toDurationFrom(readableInstant53);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime41, (org.joda.time.ReadableDuration) duration54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime41.weekyear();
        mutableDateTime41.setMillis(1645401600000L);
        int int59 = dateTimeZone32.getOffset((org.joda.time.ReadableInstant) mutableDateTime41);
        int int62 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime41, "", 72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime36", (dateTime19.compareTo(dateTime36) == 0) == dateTime19.equals(dateTime36));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.Chronology chronology2 = dateTimeFormatter1.getChronolgy();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfMinute();
        boolean boolean6 = property5.isLeap();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime10.add(readableDuration11, 0);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.dayOfWeek();
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutableDateTime10.add(readableDuration15);
        long long17 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime10);
        int int18 = mutableDateTime10.getDayOfMonth();
        mutableDateTime10.addDays((int) 'a');
        int int21 = mutableDateTime10.getMillisOfDay();
        int int24 = dateTimeFormatter1.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime10, "minutes", 44);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime10.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 1899, dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str38 = dateTimeZone37.getID();
        org.joda.time.Interval interval39 = yearMonthDay35.toInterval(dateTimeZone37);
        org.joda.time.MutableInterval mutableInterval40 = interval39.toMutableInterval();
        org.joda.time.Interval interval42 = interval39.withStartMillis((long) 32769);
        org.joda.time.Duration duration43 = interval42.toDuration();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str46 = dateTimeZone45.getID();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(dateTimeZone45);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType49.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray51 = new org.joda.time.DurationFieldType[] { durationFieldType50 };
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.forFields(durationFieldTypeArray51);
        org.joda.time.Period period53 = new org.joda.time.Period((long) ' ', periodType52);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration43, (org.joda.time.ReadableInstant) dateTime47, periodType52);
        org.joda.time.DateTime.Property property55 = dateTime47.yearOfEra();
        int int56 = dateTime47.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        int int60 = dateTimeZone58.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate((long) 1899, dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        int int64 = dateTimeZone62.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime65 = localDate61.toDateTimeAtCurrentTime(dateTimeZone62);
        org.joda.time.YearMonthDay yearMonthDay66 = new org.joda.time.YearMonthDay(dateTimeZone62);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str69 = dateTimeZone68.getID();
        org.joda.time.Interval interval70 = yearMonthDay66.toInterval(dateTimeZone68);
        org.joda.time.MutableInterval mutableInterval71 = interval70.toMutableInterval();
        org.joda.time.Interval interval73 = interval70.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology74 = interval73.getChronology();
        org.joda.time.DateTimeField dateTimeField75 = chronology74.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField76 = chronology74.dayOfMonth();
        org.joda.time.DateTime dateTime77 = dateTime47.toDateTime(chronology74);
        org.joda.time.DateTime dateTime79 = dateTime47.minusDays(3112);
        int int80 = mutableDateTime10.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime47", (dateTime4.compareTo(dateTime47) == 0) == dateTime4.equals(dateTime47));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = calendar3.getWeekYear();
        java.lang.String str5 = calendar3.getCalendarType();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.LocalDate localDate12 = localDate10.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtCurrentTime(dateTimeZone14);
        int int18 = dateTimeZone14.getOffsetFromLocal((long) 100);
        java.lang.String str20 = dateTimeZone14.getNameKey(0L);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone14);
        long long23 = dateTimeZone14.convertUTCToLocal((-1073174400016L));
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) calendar3, dateTimeZone14);
        calendar3.set((-5), 54076030, 19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and dateTime24", (mutableDateTime21.compareTo(dateTime24) == 0) == mutableDateTime21.equals(dateTime24));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        java.lang.String str1 = mutablePeriod0.toString();
        mutablePeriod0.setPeriod(0L);
        mutablePeriod0.addMonths(11);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Interval interval19 = yearMonthDay15.toInterval(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval22 = interval19.withStartMillis((long) 32769);
        org.joda.time.Duration duration23 = interval22.toDuration();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str26 = dateTimeZone25.getID();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType29.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray31 = new org.joda.time.DurationFieldType[] { durationFieldType30 };
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.forFields(durationFieldTypeArray31);
        org.joda.time.Period period33 = new org.joda.time.Period((long) ' ', periodType32);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration23, (org.joda.time.ReadableInstant) dateTime27, periodType32);
        org.joda.time.Duration duration35 = duration23.toDuration();
        org.joda.time.Period period37 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period39 = org.joda.time.Period.minutes(1);
        java.lang.String str40 = period39.toString();
        org.joda.time.Period period41 = period37.withFields((org.joda.time.ReadablePeriod) period39);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period44 = period41.withField(durationFieldType42, (int) 'a');
        org.joda.time.Hours hours45 = period41.toStandardHours();
        boolean boolean46 = duration23.equals((java.lang.Object) period41);
        mutablePeriod0.add((org.joda.time.ReadableDuration) duration23);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        int int51 = dateTimeZone49.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) 1899, dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        int int55 = dateTimeZone53.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime56 = localDate52.toDateTimeAtCurrentTime(dateTimeZone53);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(chronology57);
        org.joda.time.DateTime.Property property59 = dateTime58.secondOfMinute();
        boolean boolean60 = localDate52.equals((java.lang.Object) dateTime58);
        java.lang.String str61 = dateTime58.toString();
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime58.toMutableDateTime();
        org.joda.time.Duration duration63 = mutablePeriod0.toDurationFrom((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Period period73 = new org.joda.time.Period(8, (int) ' ', (int) (byte) 10, 0, (int) (short) -1, 44, (-2013), 35);
        org.joda.time.PeriodType periodType74 = period73.getPeriodType();
        org.joda.time.PeriodType periodType75 = periodType74.withMillisRemoved();
        org.joda.time.PeriodType periodType76 = periodType75.withMonthsRemoved();
        org.joda.time.Period period77 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration63, readableInstant64, periodType76);
        org.joda.time.Period period79 = period77.minusSeconds((-147027));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime58", (dateTime27.compareTo(dateTime58) == 0) == dateTime27.equals(dateTime58));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod();
        int int2 = mutablePeriod1.getDays();
        java.util.Date date10 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.fromDateFields(date10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekOfWeekyear();
        org.joda.time.LocalDate localDate14 = property12.setCopy("45");
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime21 = dateTime18.withField(dateTimeFieldType19, 44);
        boolean boolean22 = localDate14.isSupported(dateTimeFieldType19);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        int int26 = dateTimeZone24.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 1899, dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime31 = localDate27.toDateTimeAtCurrentTime(dateTimeZone28);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str35 = dateTimeZone34.getID();
        org.joda.time.Interval interval36 = yearMonthDay32.toInterval(dateTimeZone34);
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        long long41 = chronology37.add((long) 18, (long) 6, 58);
        boolean boolean42 = dateTimeFieldType19.isSupported(chronology37);
        mutablePeriod1.setPeriod((long) 32, (long) 53, chronology37);
        org.joda.time.DateTimeField dateTimeField44 = chronology37.minuteOfHour();
        org.joda.time.DurationField durationField45 = chronology37.halfdays();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        int int49 = dateTimeZone47.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) 1899, dateTimeZone47);
        org.joda.time.Chronology chronology51 = chronology37.withZone(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) 395, dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str55 = dateTimeZone54.getID();
        org.joda.time.DateMidnight dateMidnight56 = org.joda.time.DateMidnight.now(dateTimeZone54);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.withYearOfEra(52);
        org.joda.time.DateMidnight.Property property59 = dateMidnight58.monthOfYear();
        org.joda.time.DateMidnight.Property property60 = dateMidnight58.era();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = dateMidnight58.toMutableDateTime(chronology61);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime62.dayOfWeek();
        boolean boolean64 = mutableDateTime62.isEqualNow();
        mutableDateTime52.setMillis((org.joda.time.ReadableInstant) mutableDateTime62);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) 10, chronology67);
        org.joda.time.Chronology chronology70 = null;
        mutablePeriod68.setPeriod((long) 0, chronology70);
        mutablePeriod68.setMonths((-47));
        java.lang.String str74 = mutablePeriod68.toString();
        mutableDateTime62.add((org.joda.time.ReadablePeriod) mutablePeriod68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime52 and dateMidnight58", (mutableDateTime52.compareTo(dateMidnight58) == 0) == mutableDateTime52.equals(dateMidnight58));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 1, 1899L);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime6.withHourOfDay(3);
        int int9 = dateTime8.getSecondOfMinute();
        int int10 = dateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 1899, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        int int18 = dateTimeZone16.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str23 = dateTimeZone22.getID();
        org.joda.time.Interval interval24 = yearMonthDay20.toInterval(dateTimeZone22);
        org.joda.time.MutableInterval mutableInterval25 = interval24.toMutableInterval();
        org.joda.time.Interval interval27 = interval24.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.DateTime dateTime29 = dateTime8.toDateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.minuteOfHour();
        mutablePeriod2.setPeriod((long) 66, 63492587421800L, chronology28);
        org.joda.time.DateTimeField dateTimeField32 = chronology28.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime29", (dateTime8.compareTo(dateTime29) == 0) == dateTime8.equals(dateTime29));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        java.util.Date date19 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.fromDateFields(date19);
        org.joda.time.LocalDate.Property property21 = localDate20.weekOfWeekyear();
        org.joda.time.LocalDate localDate23 = property21.setCopy(10);
        org.joda.time.LocalDate localDate25 = localDate23.withWeekyear(1970);
        org.joda.time.LocalDate localDate27 = localDate25.withWeekyear(53);
        java.util.Date date33 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.fromDateFields(date33);
        org.joda.time.LocalDate.Property property35 = localDate34.weekOfWeekyear();
        org.joda.time.LocalDate localDate37 = property35.setCopy(10);
        org.joda.time.LocalDate localDate39 = localDate37.withWeekyear(1970);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDate localDate41 = localDate39.minus(readablePeriod40);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 1899, dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        int int49 = dateTimeZone47.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime50 = localDate46.toDateTimeAtCurrentTime(dateTimeZone47);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.weekyear();
        int int52 = localDate46.get(dateTimeFieldType51);
        boolean boolean53 = localDate39.isSupported(dateTimeFieldType51);
        org.joda.time.LocalDate localDate55 = localDate27.withField(dateTimeFieldType51, 14);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate57 = org.joda.time.LocalDate.now(dateTimeZone56);
        org.joda.time.Interval interval58 = localDate55.toInterval(dateTimeZone56);
        org.joda.time.DateTime dateTime59 = yearMonthDay9.toDateTimeAtMidnight(dateTimeZone56);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        int int63 = dateTimeZone61.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((long) 1899, dateTimeZone61);
        org.joda.time.LocalDate localDate66 = localDate64.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone69 = dateTimeZone68.toTimeZone();
        org.joda.time.DateTime dateTime70 = localDate64.toDateTimeAtCurrentTime(dateTimeZone68);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str73 = dateTimeZone72.getID();
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(dateTimeZone72);
        java.lang.String str76 = dateTimeZone72.getName((long) (-1));
        org.joda.time.Interval interval77 = localDate64.toInterval(dateTimeZone72);
        org.joda.time.DateTime dateTime78 = yearMonthDay9.toDateTimeAtMidnight(dateTimeZone72);
        int int80 = dateTimeZone72.getOffsetFromLocal(32054400895L);
        org.joda.time.LocalTime localTime81 = new org.joda.time.LocalTime(dateTimeZone72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime70", (dateTime8.compareTo(dateTime70) == 0) == dateTime8.equals(dateTime70));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        java.lang.String str1 = mutablePeriod0.toString();
        mutablePeriod0.setPeriod(0L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 1899, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime12 = localDate8.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str16 = dateTimeZone15.getID();
        org.joda.time.Interval interval17 = yearMonthDay13.toInterval(dateTimeZone15);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Interval interval20 = interval17.withStartMillis((long) 32769);
        org.joda.time.Duration duration21 = interval20.toDuration();
        java.lang.String str22 = duration21.toString();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        int int26 = dateTimeZone24.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 1899, dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime31 = localDate27.toDateTimeAtCurrentTime(dateTimeZone28);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str35 = dateTimeZone34.getID();
        org.joda.time.Interval interval36 = yearMonthDay32.toInterval(dateTimeZone34);
        org.joda.time.MutableInterval mutableInterval37 = interval36.toMutableInterval();
        org.joda.time.Interval interval39 = interval36.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.DateTimeZone dateTimeZone41 = chronology40.getZone();
        org.joda.time.DateTimeField dateTimeField42 = chronology40.monthOfYear();
        org.joda.time.Period period44 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period46 = org.joda.time.Period.minutes(1);
        java.lang.String str47 = period46.toString();
        org.joda.time.Period period48 = period44.withFields((org.joda.time.ReadablePeriod) period46);
        org.joda.time.Period period50 = period48.plusMillis(100);
        org.joda.time.Period period51 = period48.negated();
        org.joda.time.Period period53 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period55 = org.joda.time.Period.minutes(1);
        java.lang.String str56 = period55.toString();
        org.joda.time.Period period57 = period53.withFields((org.joda.time.ReadablePeriod) period55);
        org.joda.time.Period period59 = period57.plusMillis(100);
        boolean boolean60 = period51.equals((java.lang.Object) period59);
        long long63 = chronology40.add((org.joda.time.ReadablePeriod) period51, 31556952000L, (int) '4');
        mutablePeriod0.setPeriod((org.joda.time.ReadableDuration) duration21, chronology40);
        java.lang.String str65 = chronology40.toString();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        int int69 = dateTimeZone67.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate((long) 1899, dateTimeZone67);
        org.joda.time.LocalDate localDate72 = localDate70.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone75 = dateTimeZone74.toTimeZone();
        org.joda.time.DateTime dateTime76 = localDate70.toDateTimeAtCurrentTime(dateTimeZone74);
        int int78 = dateTimeZone74.getOffsetFromLocal((long) 100);
        java.lang.String str80 = dateTimeZone74.getNameKey((long) 999);
        long long84 = dateTimeZone74.convertLocalToUTC((long) '4', false, (long) 52);
        int int86 = dateTimeZone74.getStandardOffset(16L);
        java.lang.String str87 = dateTimeZone74.toString();
        org.joda.time.Chronology chronology88 = chronology40.withZone(dateTimeZone74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime76", (dateTime12.compareTo(dateTime76) == 0) == dateTime12.equals(dateTime76));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        java.util.Date date19 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.fromDateFields(date19);
        org.joda.time.LocalDate.Property property21 = localDate20.weekOfWeekyear();
        org.joda.time.LocalDate localDate23 = property21.setCopy(10);
        org.joda.time.LocalDate localDate25 = localDate23.withWeekyear(1970);
        org.joda.time.LocalDate localDate27 = localDate25.withWeekyear(53);
        java.util.Date date33 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.fromDateFields(date33);
        org.joda.time.LocalDate.Property property35 = localDate34.weekOfWeekyear();
        org.joda.time.LocalDate localDate37 = property35.setCopy(10);
        org.joda.time.LocalDate localDate39 = localDate37.withWeekyear(1970);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDate localDate41 = localDate39.minus(readablePeriod40);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 1899, dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        int int49 = dateTimeZone47.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime50 = localDate46.toDateTimeAtCurrentTime(dateTimeZone47);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.weekyear();
        int int52 = localDate46.get(dateTimeFieldType51);
        boolean boolean53 = localDate39.isSupported(dateTimeFieldType51);
        org.joda.time.LocalDate localDate55 = localDate27.withField(dateTimeFieldType51, 14);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate57 = org.joda.time.LocalDate.now(dateTimeZone56);
        org.joda.time.Interval interval58 = localDate55.toInterval(dateTimeZone56);
        org.joda.time.DateTime dateTime59 = yearMonthDay9.toDateTimeAtMidnight(dateTimeZone56);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        int int63 = dateTimeZone61.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((long) 1899, dateTimeZone61);
        org.joda.time.LocalDate localDate66 = localDate64.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone69 = dateTimeZone68.toTimeZone();
        org.joda.time.DateTime dateTime70 = localDate64.toDateTimeAtCurrentTime(dateTimeZone68);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str73 = dateTimeZone72.getID();
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(dateTimeZone72);
        java.lang.String str76 = dateTimeZone72.getName((long) (-1));
        org.joda.time.Interval interval77 = localDate64.toInterval(dateTimeZone72);
        org.joda.time.DateTime dateTime78 = yearMonthDay9.toDateTimeAtMidnight(dateTimeZone72);
        int int79 = yearMonthDay9.getDayOfMonth();
        org.joda.time.DateTime dateTime80 = yearMonthDay9.toDateTimeAtMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime70", (dateTime8.compareTo(dateTime70) == 0) == dateTime8.equals(dateTime70));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime3, readableDuration12);
        mutableDateTime3.setMillisOfDay(10);
        mutableDateTime3.setSecondOfDay(1970);
        int int18 = mutableDateTime3.getMinuteOfDay();
        int int19 = mutableDateTime3.getWeekyear();
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray25 = timeOfDay24.getFields();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = timeOfDay24.toDateTimeToday(dateTimeZone26);
        org.joda.time.DateTime.Property property28 = dateTime27.monthOfYear();
        org.joda.time.DateTime dateTime30 = dateTime27.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str33 = dateTimeZone32.getID();
        org.joda.time.DateMidnight dateMidnight34 = org.joda.time.DateMidnight.now(dateTimeZone32);
        boolean boolean35 = dateTime30.equals((java.lang.Object) dateMidnight34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight34.plusMonths(10);
        org.joda.time.DateMidnight.Property property38 = dateMidnight37.dayOfYear();
        org.joda.time.DateMidnight dateMidnight39 = property38.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight39.withDurationAdded((long) 400, 20);
        mutableDateTime3.setMillis((org.joda.time.ReadableInstant) dateMidnight42);
        int int44 = mutableDateTime3.getYearOfEra();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField46 = property45.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateMidnight37", (mutableDateTime3.compareTo(dateMidnight37) == 0) == mutableDateTime3.equals(dateMidnight37));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.LocalDate localDate12 = localDate4.withYear(15);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 1899, dateTimeZone14);
        org.joda.time.LocalDate localDate19 = localDate17.plusWeeks((int) (short) 0);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType22 = periodType21.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 2, periodType22);
        org.joda.time.LocalDate localDate24 = localDate19.minus((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str27 = dateTimeZone26.getID();
        org.joda.time.DateMidnight dateMidnight28 = org.joda.time.DateMidnight.now(dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.plus((long) 45);
        int int31 = dateMidnight30.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        int int35 = dateTimeZone33.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 1899, dateTimeZone33);
        org.joda.time.LocalDate localDate38 = localDate36.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone41 = dateTimeZone40.toTimeZone();
        org.joda.time.DateTime dateTime42 = localDate36.toDateTimeAtCurrentTime(dateTimeZone40);
        org.joda.time.DateTime.Property property43 = dateTime42.minuteOfHour();
        boolean boolean45 = dateTime42.isBefore((long) ' ');
        mutablePeriod23.setPeriod((org.joda.time.ReadableInstant) dateMidnight30, (org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.LocalDate localDate48 = localDate12.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod23, 741);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        int int51 = dateTimeZone49.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone49);
        org.joda.time.ReadableDuration readableDuration53 = null;
        mutableDateTime52.add(readableDuration53, 0);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime52.dayOfWeek();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime52.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime58 = property57.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime59 = property57.roundCeiling();
        org.joda.time.DateTimeZone dateTimeZone60 = mutableDateTime59.getZone();
        java.util.Locale locale62 = null;
        java.lang.String str63 = dateTimeZone60.getName(432000451L, locale62);
        org.joda.time.DateMidnight dateMidnight64 = localDate12.toDateMidnight(dateTimeZone60);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str67 = dateTimeZone66.getID();
        org.joda.time.DateMidnight dateMidnight68 = org.joda.time.DateMidnight.now(dateTimeZone66);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType70 = dateTimeFieldType69.getDurationType();
        org.joda.time.DateMidnight dateMidnight72 = dateMidnight68.withField(dateTimeFieldType69, (int) (short) 10);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight68.minusYears((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.getDefault();
        int int78 = dateTimeZone76.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate79 = new org.joda.time.LocalDate((long) 1899, dateTimeZone76);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.getDefault();
        int int82 = dateTimeZone80.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime83 = localDate79.toDateTimeAtCurrentTime(dateTimeZone80);
        org.joda.time.YearMonthDay yearMonthDay84 = new org.joda.time.YearMonthDay(dateTimeZone80);
        org.joda.time.DateTimeZone dateTimeZone86 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str87 = dateTimeZone86.getID();
        org.joda.time.Interval interval88 = yearMonthDay84.toInterval(dateTimeZone86);
        org.joda.time.MutableInterval mutableInterval89 = interval88.toMutableInterval();
        org.joda.time.Interval interval91 = interval88.withStartMillis((long) 32769);
        org.joda.time.Duration duration92 = interval91.toDuration();
        org.joda.time.Period period93 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight68, (org.joda.time.ReadableDuration) duration92);
        org.joda.time.Period period95 = period93.withSeconds((-1000));
        boolean boolean96 = dateTimeZone60.equals((java.lang.Object) period93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime83", (dateTime10.compareTo(dateTime83) == 0) == dateTime10.equals(dateTime83));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight14 = yearMonthDay9.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        int int23 = dateTimeZone21.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 1899, dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        int int27 = dateTimeZone25.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime28 = localDate24.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str32 = dateTimeZone31.getID();
        org.joda.time.Interval interval33 = yearMonthDay29.toInterval(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone31);
        mutableDateTime18.setZone(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime37 = dateMidnight14.toMutableDateTime(dateTimeZone31);
        java.lang.String str38 = dateTimeZone31.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and mutableDateTime37", (dateMidnight14.compareTo(mutableDateTime37) == 0) == dateMidnight14.equals(mutableDateTime37));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay9.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay15 = property14.getYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay17 = property14.addToCopy((int) (short) 0);
        org.joda.time.YearMonthDay yearMonthDay18 = property14.withMaximumValue();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = yearMonthDay18.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str22 = dateTimeZone21.getID();
        java.util.Locale locale24 = java.util.Locale.KOREAN;
        java.util.Locale locale25 = java.util.Locale.KOREAN;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.lang.String str27 = dateTimeZone21.getShortName(0L, locale25);
        boolean boolean29 = dateTimeZone21.isStandardOffset((long) (-1901));
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight31 = yearMonthDay18.toDateMidnight(dateTimeZone21);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Locale[] localeArray35 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.List<java.util.Locale> localeList38 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.util.Locale>) localeList36);
        boolean boolean39 = localeList38.isEmpty();
        localeList38.clear();
        java.util.stream.Stream<java.util.Locale> localeStream41 = localeList38.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.util.Locale[] localeArray45 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList46 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList46, localeArray45);
        java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.util.Locale>) localeList46);
        boolean boolean49 = localeList48.isEmpty();
        java.util.stream.Stream<java.util.Locale> localeStream50 = localeList48.stream();
        boolean boolean51 = localeList38.addAll((java.util.Collection<java.util.Locale>) localeList48);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        int int55 = dateTimeZone53.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((long) 1899, dateTimeZone53);
        org.joda.time.LocalDate localDate58 = localDate56.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone61 = dateTimeZone60.toTimeZone();
        org.joda.time.DateTime dateTime62 = localDate56.toDateTimeAtCurrentTime(dateTimeZone60);
        org.joda.time.LocalDate.Property property63 = localDate56.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str66 = dateTimeZone65.getID();
        org.joda.time.DateMidnight dateMidnight67 = org.joda.time.DateMidnight.now(dateTimeZone65);
        int int69 = dateTimeZone65.getOffset((long) 1);
        org.joda.time.DateMidnight dateMidnight70 = localDate56.toDateMidnight(dateTimeZone65);
        boolean boolean71 = localeList38.remove((java.lang.Object) localDate56);
        org.joda.time.DateMidnight dateMidnight72 = dateMidnight31.withFields((org.joda.time.ReadablePartial) localDate56);
        boolean boolean74 = dateMidnight31.isAfter((long) (-968));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime62", (dateTime8.compareTo(dateTime62) == 0) == dateTime8.equals(dateTime62));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        boolean boolean5 = dateMidnight3.isBefore(readableInstant4);
        int int6 = dateMidnight3.getYearOfCentury();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight3.minusMonths(7);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusWeeks(8);
        org.joda.time.DateMidnight.Property property12 = dateMidnight9.centuryOfEra();
        org.joda.time.Interval interval13 = dateMidnight9.toInterval();
        org.joda.time.DateTime dateTime14 = dateMidnight9.toDateTimeISO();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = timeOfDay19.toDateTimeToday(dateTimeZone20);
        int int23 = dateTimeZone20.getOffset((long) 1);
        int int25 = dateTimeZone20.getStandardOffset((long) 56621841);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime14.toMutableDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight9 and mutableDateTime26", (dateMidnight9.compareTo(mutableDateTime26) == 0) == dateMidnight9.equals(mutableDateTime26));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Duration duration17 = interval16.toDuration();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray25 = new org.joda.time.DurationFieldType[] { durationFieldType24 };
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.forFields(durationFieldTypeArray25);
        org.joda.time.Period period27 = new org.joda.time.Period((long) ' ', periodType26);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateTime21, periodType26);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str31 = dateTimeZone30.getID();
        org.joda.time.DateMidnight dateMidnight32 = org.joda.time.DateMidnight.now(dateTimeZone30);
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateMidnight32);
        boolean boolean35 = interval33.isAfter((-2142565956000L));
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime37.withHourOfDay(3);
        org.joda.time.DateTime dateTime41 = dateTime39.withDayOfMonth(1);
        org.joda.time.DateTime dateTime43 = dateTime39.plusMinutes(999);
        org.joda.time.DateTime.Property property44 = dateTime43.weekOfWeekyear();
        org.joda.time.DateTime dateTime45 = property44.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str48 = dateTimeZone47.getID();
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.util.Locale locale52 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str53 = locale50.getDisplayVariant(locale52);
        java.lang.String str54 = dateTimeZone47.getName((long) 5, locale50);
        java.lang.String str55 = locale50.getDisplayScript();
        int int56 = property44.getMaximumTextLength(locale50);
        org.joda.time.DateTime dateTime57 = property44.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str60 = dateTimeZone59.getID();
        org.joda.time.DateMidnight dateMidnight61 = org.joda.time.DateMidnight.now(dateTimeZone59);
        org.joda.time.ReadableInstant readableInstant62 = null;
        boolean boolean63 = dateMidnight61.isBefore(readableInstant62);
        org.joda.time.DateMidnight.Property property64 = dateMidnight61.dayOfWeek();
        int int65 = dateMidnight61.getYear();
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight61.plusDays((int) (byte) 10);
        boolean boolean68 = dateTime57.isBefore((org.joda.time.ReadableInstant) dateMidnight67);
        boolean boolean69 = interval33.contains((org.joda.time.ReadableInstant) dateTime57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime37", (dateTime21.compareTo(dateTime37) == 0) == dateTime21.equals(dateTime37));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Interval interval19 = yearMonthDay15.toInterval(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval22 = interval19.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime3.toDateTime(chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.weekyear();
        int int27 = dateTimeField25.getLeapAmount(3850156799984L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime24", (dateTime3.compareTo(dateTime24) == 0) == dateTime3.equals(dateTime24));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        int int1 = mutablePeriod0.getDays();
        java.util.Date date9 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.fromDateFields(date9);
        org.joda.time.LocalDate.Property property11 = localDate10.weekOfWeekyear();
        org.joda.time.LocalDate localDate13 = property11.setCopy("45");
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str16 = dateTimeZone15.getID();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime20 = dateTime17.withField(dateTimeFieldType18, 44);
        boolean boolean21 = localDate13.isSupported(dateTimeFieldType18);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        int int25 = dateTimeZone23.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 1899, dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str34 = dateTimeZone33.getID();
        org.joda.time.Interval interval35 = yearMonthDay31.toInterval(dateTimeZone33);
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        long long40 = chronology36.add((long) 18, (long) 6, 58);
        boolean boolean41 = dateTimeFieldType18.isSupported(chronology36);
        mutablePeriod0.setPeriod((long) 32, (long) 53, chronology36);
        org.joda.time.MutablePeriod mutablePeriod43 = mutablePeriod0.copy();
        mutablePeriod0.setWeeks(20);
        mutablePeriod0.setSeconds((int) (byte) 0);
        mutablePeriod0.addHours(40);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        int int55 = dateTimeZone53.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((long) 1899, dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        int int59 = dateTimeZone57.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime60 = localDate56.toDateTimeAtCurrentTime(dateTimeZone57);
        org.joda.time.YearMonthDay yearMonthDay61 = new org.joda.time.YearMonthDay(dateTimeZone57);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str64 = dateTimeZone63.getID();
        org.joda.time.Interval interval65 = yearMonthDay61.toInterval(dateTimeZone63);
        org.joda.time.MutableInterval mutableInterval66 = interval65.toMutableInterval();
        org.joda.time.Interval interval68 = interval65.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.DateTimeField dateTimeField70 = chronology69.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField71 = chronology69.dayOfMonth();
        java.lang.String str72 = chronology69.toString();
        mutablePeriod0.setPeriod(63492587400000L, 276998233620000L, chronology69);
        mutablePeriod0.setYears(0);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.getDefault();
        int int81 = dateTimeZone79.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate82 = new org.joda.time.LocalDate((long) 1899, dateTimeZone79);
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.getDefault();
        int int85 = dateTimeZone83.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime86 = localDate82.toDateTimeAtCurrentTime(dateTimeZone83);
        org.joda.time.YearMonthDay yearMonthDay87 = new org.joda.time.YearMonthDay(dateTimeZone83);
        org.joda.time.DateTimeZone dateTimeZone89 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str90 = dateTimeZone89.getID();
        org.joda.time.Interval interval91 = yearMonthDay87.toInterval(dateTimeZone89);
        org.joda.time.Interval interval92 = yearMonthDay87.toInterval();
        org.joda.time.Chronology chronology93 = interval92.getChronology();
        org.joda.time.Chronology chronology94 = interval92.getChronology();
        org.joda.time.DateTimeField dateTimeField95 = chronology94.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime96 = new org.joda.time.MutableDateTime(chronology94);
        mutablePeriod0.setPeriod((-77230055157630L), 0L, chronology94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and mutableDateTime96", (dateTime17.compareTo(mutableDateTime96) == 0) == dateTime17.equals(mutableDateTime96));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        java.lang.String str11 = period10.toString();
        org.joda.time.Period period12 = period8.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period10.minusSeconds((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period10.toDurationFrom(readableInstant15);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime3, (org.joda.time.ReadableDuration) duration16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableDateTime21.add(readableDuration22, 0);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime21.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime27 = property25.add((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str30 = dateTimeZone29.getID();
        org.joda.time.DateMidnight dateMidnight31 = org.joda.time.DateMidnight.now(dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.plus((long) 45);
        org.joda.time.DateMidnight.Property property34 = dateMidnight31.weekyear();
        org.joda.time.DateTimeField dateTimeField35 = property34.getField();
        mutableDateTime27.setRounding(dateTimeField35, 0);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        int int40 = dateTimeZone38.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime48 = timeOfDay46.toDateTimeToday(dateTimeZone47);
        mutableDateTime41.setZoneRetainFields(dateTimeZone47);
        boolean boolean50 = mutableDateTime41.isEqualNow();
        org.joda.time.DateTimeField dateTimeField51 = mutableDateTime41.getRoundingField();
        int int52 = mutableDateTime41.getDayOfWeek();
        boolean boolean53 = mutableDateTime27.isEqual((org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) mutableDateTime27);
        java.util.Calendar.Builder builder55 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone58 = dateTimeZone57.toTimeZone();
        java.util.Calendar calendar59 = java.util.Calendar.getInstance(timeZone58);
        java.util.Calendar.Builder builder60 = builder55.setTimeZone(timeZone58);
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(timeZone58);
        org.joda.time.TimeOfDay timeOfDay66 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime68 = timeOfDay66.toDateTimeToday(dateTimeZone67);
        org.joda.time.DateTime dateTime70 = dateTime68.minus((long) (short) 0);
        org.joda.time.DateTime dateTime71 = dateTime70.toDateTimeISO();
        java.lang.String str72 = dateTime70.toString();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone75 = dateTimeZone74.toTimeZone();
        org.joda.time.DateTime dateTime76 = dateTime70.toDateTime(dateTimeZone74);
        org.joda.time.DateMidnight dateMidnight77 = new org.joda.time.DateMidnight((java.lang.Object) calendar61, dateTimeZone74);
        mutableDateTime27.setZone(dateTimeZone74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight31 and dateMidnight77", (dateMidnight31.compareTo(dateMidnight77) == 0) == dateMidnight31.equals(dateMidnight77));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale4.getDisplayName(locale7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone2, locale4);
        int int13 = calendar11.getMaximum((int) (short) 0);
        calendar11.setLenient(false);
        java.util.Date date16 = calendar11.getTime();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.fromCalendarFields(calendar11);
        int int18 = localDate17.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar11", (calendar3.compareTo(calendar11) == 0) == calendar3.equals(calendar11));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Duration duration17 = interval16.toDuration();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray25 = new org.joda.time.DurationFieldType[] { durationFieldType24 };
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.forFields(durationFieldTypeArray25);
        org.joda.time.Period period27 = new org.joda.time.Period((long) ' ', periodType26);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateTime21, periodType26);
        boolean boolean29 = dateTime21.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 1899, dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        int int37 = dateTimeZone35.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime38 = localDate34.toDateTimeAtCurrentTime(dateTimeZone35);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str42 = dateTimeZone41.getID();
        org.joda.time.Interval interval43 = yearMonthDay39.toInterval(dateTimeZone41);
        org.joda.time.Interval interval44 = yearMonthDay39.toInterval();
        org.joda.time.Chronology chronology45 = interval44.getChronology();
        org.joda.time.DateTime dateTime46 = dateTime21.toDateTime(chronology45);
        org.joda.time.DateTime.Property property47 = dateTime46.weekyear();
        org.joda.time.DateTime dateTime48 = property47.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime49 = property47.withMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime46", (dateTime21.compareTo(dateTime46) == 0) == dateTime21.equals(dateTime46));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale4.getDisplayName(locale7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone2, locale4);
        int int13 = calendar11.getMaximum((int) (short) 0);
        calendar11.setLenient(false);
        java.util.Date date16 = calendar11.getTime();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.fromCalendarFields(calendar11);
        long long18 = calendar11.getTimeInMillis();
        int int19 = calendar11.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone20 = calendar11.getTimeZone();
        java.lang.String str21 = timeZone20.getDisplayName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar11", (calendar3.compareTo(calendar11) == 0) == calendar3.equals(calendar11));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone12);
        boolean boolean15 = dateTime10.equals((java.lang.Object) dateMidnight14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.plusMonths(10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = timeOfDay26.toDateTimeToday(dateTimeZone27);
        mutableDateTime21.setZoneRetainFields(dateTimeZone27);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime21, readableDuration30);
        mutableDateTime21.setMillisOfDay(10);
        mutableDateTime21.setSecondOfDay(1970);
        int int36 = mutableDateTime21.getMinuteOfDay();
        int int37 = mutableDateTime21.getWeekyear();
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray43 = timeOfDay42.getFields();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = timeOfDay42.toDateTimeToday(dateTimeZone44);
        org.joda.time.DateTime.Property property46 = dateTime45.monthOfYear();
        org.joda.time.DateTime dateTime48 = dateTime45.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str51 = dateTimeZone50.getID();
        org.joda.time.DateMidnight dateMidnight52 = org.joda.time.DateMidnight.now(dateTimeZone50);
        boolean boolean53 = dateTime48.equals((java.lang.Object) dateMidnight52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight52.plusMonths(10);
        org.joda.time.DateMidnight.Property property56 = dateMidnight55.dayOfYear();
        org.joda.time.DateMidnight dateMidnight57 = property56.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight57.withDurationAdded((long) 400, 20);
        mutableDateTime21.setMillis((org.joda.time.ReadableInstant) dateMidnight60);
        int int62 = mutableDateTime21.getMonthOfYear();
        int int63 = dateMidnight14.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime21.hourOfDay();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime21.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime67 = property65.add((long) 0);
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime67.minuteOfDay();
        int int69 = mutableDateTime67.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight17 and mutableDateTime67", (dateMidnight17.compareTo(mutableDateTime67) == 0) == dateMidnight17.equals(mutableDateTime67));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTime(readableInstant1);
        org.joda.time.DateTime.Property property3 = dateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 1899, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime12 = localDate8.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str16 = dateTimeZone15.getID();
        org.joda.time.Interval interval17 = yearMonthDay13.toInterval(dateTimeZone15);
        org.joda.time.Interval interval18 = yearMonthDay13.toInterval();
        org.joda.time.Period period20 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period22 = org.joda.time.Period.minutes(1);
        java.lang.String str23 = period22.toString();
        org.joda.time.Period period24 = period20.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay13.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 1899, dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str38 = dateTimeZone37.getID();
        org.joda.time.Interval interval39 = yearMonthDay35.toInterval(dateTimeZone37);
        org.joda.time.MutableInterval mutableInterval40 = interval39.toMutableInterval();
        org.joda.time.Interval interval42 = interval39.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology43.getZone();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay25.withChronologyRetainFields(chronology43);
        org.joda.time.LocalDate localDate47 = org.joda.time.LocalDate.now(chronology43);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(chronology43);
        org.joda.time.DateTimeField dateTimeField49 = chronology43.centuryOfEra();
        org.joda.time.DateTime dateTime50 = dateTime2.toDateTime(chronology43);
        org.joda.time.DateTime dateTime52 = dateTime2.plusWeeks(7);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(chronology53);
        org.joda.time.DateTime dateTime56 = dateTime54.withHourOfDay(3);
        int int57 = dateTime56.getSecondOfMinute();
        int int58 = dateTime56.getMinuteOfHour();
        int int59 = dateTime56.getEra();
        org.joda.time.DateTime.Property property60 = dateTime56.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = property60.getFieldType();
        java.lang.String str62 = dateTimeFieldType61.toString();
        boolean boolean63 = dateTime52.isSupported(dateTimeFieldType61);
        org.joda.time.DateTime dateTime65 = dateTime52.minusMonths(3172000);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str68 = dateTimeZone67.getID();
        org.joda.time.DateMidnight dateMidnight69 = org.joda.time.DateMidnight.now(dateTimeZone67);
        org.joda.time.DateMidnight dateMidnight71 = dateMidnight69.withYearOfEra(52);
        org.joda.time.DateMidnight.Property property72 = dateMidnight71.monthOfYear();
        org.joda.time.DateMidnight.Property property73 = dateMidnight71.era();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = org.joda.time.format.ISODateTimeFormat.dateTimeNoMillis();
        java.lang.String str75 = dateMidnight71.toString(dateTimeFormatter74);
        org.joda.time.DateMidnight dateMidnight77 = dateMidnight71.withYearOfEra(8);
        org.joda.time.DateMidnight dateMidnight79 = org.joda.time.DateMidnight.parse("00");
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight79.plusDays((int) (short) -1);
        org.joda.time.DateMidnight.Property property82 = dateMidnight81.era();
        org.joda.time.Instant instant83 = dateMidnight81.toInstant();
        boolean boolean84 = dateMidnight71.isBefore((org.joda.time.ReadableInstant) dateMidnight81);
        boolean boolean85 = dateTime52.isEqual((org.joda.time.ReadableInstant) dateMidnight81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and mutableDateTime48", (dateTime2.compareTo(mutableDateTime48) == 0) == dateTime2.equals(mutableDateTime48));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Period period5 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period7 = org.joda.time.Period.minutes(1);
        java.lang.String str8 = period7.toString();
        org.joda.time.Period period9 = period5.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) (short) 100);
        mutableDateTime3.add((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period14 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        java.lang.String str17 = period16.toString();
        org.joda.time.Period period18 = period14.withFields((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period20 = period18.plusMillis(100);
        org.joda.time.Period period21 = period18.negated();
        org.joda.time.Period period23 = period21.withMillis(1899);
        org.joda.time.Period period25 = period23.plusMillis(0);
        mutableDateTime3.add((org.joda.time.ReadablePeriod) period23);
        org.joda.time.DateTime dateTime27 = mutableDateTime3.toDateTime();
        mutableDateTime3.setWeekyear(1970);
        org.joda.time.DateTimeField dateTimeField30 = mutableDateTime3.getRoundingField();
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = timeOfDay35.toDateTimeToday(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.minus((long) (short) 0);
        org.joda.time.DateTime dateTime40 = dateTime39.toDateTimeISO();
        org.joda.time.DateTime dateTime42 = dateTime40.minus(315705601970L);
        org.joda.time.DateTime.Property property43 = dateTime40.era();
        org.joda.time.DateTime dateTime44 = property43.getDateTime();
        org.joda.time.DateTime dateTime46 = dateTime44.withWeekyear(1722);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone49 = dateTimeZone48.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime44, dateTimeZone48);
        org.joda.time.DateTime dateTime52 = dateTime44.plusDays(1900);
        mutableDateTime3.setTime((org.joda.time.ReadableInstant) dateTime44);
        int int54 = mutableDateTime3.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and mutableDateTime50", (dateTime37.compareTo(mutableDateTime50) == 0) == dateTime37.equals(mutableDateTime50));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime4 = dateTime1.withYearOfCentury(16);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1899, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.Interval interval18 = yearMonthDay14.toInterval(dateTimeZone16);
        org.joda.time.MutableInterval mutableInterval19 = interval18.toMutableInterval();
        org.joda.time.Interval interval21 = interval18.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology22.getZone();
        org.joda.time.DateTime dateTime24 = dateTime1.toDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone27);
        int int29 = calendar28.getWeekYear();
        calendar28.setMinimalDaysInFirstWeek((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        int int35 = dateTimeZone33.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 1899, dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        int int39 = dateTimeZone37.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime40 = localDate36.toDateTimeAtCurrentTime(dateTimeZone37);
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str44 = dateTimeZone43.getID();
        org.joda.time.Interval interval45 = yearMonthDay41.toInterval(dateTimeZone43);
        org.joda.time.Interval interval46 = yearMonthDay41.toInterval();
        org.joda.time.Period period48 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period50 = org.joda.time.Period.minutes(1);
        java.lang.String str51 = period50.toString();
        org.joda.time.Period period52 = period48.withFields((org.joda.time.ReadablePeriod) period50);
        org.joda.time.YearMonthDay yearMonthDay53 = yearMonthDay41.plus((org.joda.time.ReadablePeriod) period48);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        int int57 = dateTimeZone55.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate((long) 1899, dateTimeZone55);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        int int61 = dateTimeZone59.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime62 = localDate58.toDateTimeAtCurrentTime(dateTimeZone59);
        org.joda.time.YearMonthDay yearMonthDay63 = new org.joda.time.YearMonthDay(dateTimeZone59);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str66 = dateTimeZone65.getID();
        org.joda.time.Interval interval67 = yearMonthDay63.toInterval(dateTimeZone65);
        org.joda.time.MutableInterval mutableInterval68 = interval67.toMutableInterval();
        org.joda.time.Interval interval70 = interval67.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology71 = interval70.getChronology();
        org.joda.time.DateTimeZone dateTimeZone72 = chronology71.getZone();
        org.joda.time.DateTimeField dateTimeField73 = chronology71.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay74 = yearMonthDay53.withChronologyRetainFields(chronology71);
        org.joda.time.LocalDate localDate75 = org.joda.time.LocalDate.now(chronology71);
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(chronology71);
        org.joda.time.DateTimeField dateTimeField77 = chronology71.minuteOfDay();
        org.joda.time.DurationField durationField78 = chronology71.seconds();
        org.joda.time.YearMonthDay yearMonthDay79 = new org.joda.time.YearMonthDay((java.lang.Object) calendar28, chronology71);
        org.joda.time.DurationField durationField80 = chronology71.years();
        org.joda.time.DateTime dateTime81 = dateTime1.toDateTime(chronology71);
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime(chronology71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime24", (dateTime1.compareTo(dateTime24) == 0) == dateTime1.equals(dateTime24));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        int int6 = dateTime3.getEra();
        org.joda.time.DateTime dateTime7 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str10 = dateTimeZone9.getID();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now(dateTimeZone9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        boolean boolean13 = dateMidnight11.isBefore(readableInstant12);
        int int14 = dateMidnight11.getYearOfCentury();
        org.joda.time.DateMidnight.Property property15 = dateMidnight11.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight11.minusMonths(7);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusWeeks(8);
        int int20 = dateMidnight17.getEra();
        boolean boolean21 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        int int25 = dateTimeZone23.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 1899, dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str34 = dateTimeZone33.getID();
        org.joda.time.Interval interval35 = yearMonthDay31.toInterval(dateTimeZone33);
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.Interval interval37 = interval35.toInterval();
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType39 = periodType38.withWeeksRemoved();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        int int43 = dateTimeZone41.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) 1899, dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        int int47 = dateTimeZone45.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime48 = localDate44.toDateTimeAtCurrentTime(dateTimeZone45);
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay(dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str52 = dateTimeZone51.getID();
        org.joda.time.Interval interval53 = yearMonthDay49.toInterval(dateTimeZone51);
        org.joda.time.MutableInterval mutableInterval54 = interval53.toMutableInterval();
        org.joda.time.Interval interval56 = interval53.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology57 = interval56.getChronology();
        org.joda.time.DateTimeZone dateTimeZone58 = chronology57.getZone();
        org.joda.time.DateTimeField dateTimeField59 = chronology57.monthOfYear();
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight(chronology57);
        org.joda.time.DurationField durationField61 = chronology57.millis();
        org.joda.time.DateTimeField dateTimeField62 = chronology57.dayOfMonth();
        org.joda.time.Period period63 = new org.joda.time.Period((java.lang.Object) interval35, periodType39, chronology57);
        org.joda.time.Interval interval65 = interval35.withStartMillis(52L);
        long long66 = interval35.getStartMillis();
        org.joda.time.DateTime dateTime67 = interval35.getStart();
        java.util.Date date73 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate74 = org.joda.time.LocalDate.fromDateFields(date73);
        org.joda.time.LocalDate.Property property75 = localDate74.weekOfWeekyear();
        org.joda.time.LocalDate localDate77 = property75.setCopy("45");
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str80 = dateTimeZone79.getID();
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime(dateTimeZone79);
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime84 = dateTime81.withField(dateTimeFieldType82, 44);
        boolean boolean85 = localDate77.isSupported(dateTimeFieldType82);
        org.joda.time.DateTime.Property property86 = dateTime67.property(dateTimeFieldType82);
        boolean boolean87 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime81", (dateTime1.compareTo(dateTime81) == 0) == dateTime1.equals(dateTime81));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTime(readableInstant1);
        org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay0.minusYears(29);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay0.minusDays(1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Interval interval8 = yearMonthDay6.toInterval(dateTimeZone7);
        org.joda.time.Interval interval9 = yearMonthDay6.toInterval();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 10, chronology11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod12.setPeriod(readableDuration13, chronology14);
        int int16 = mutablePeriod12.getYears();
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(536468184000L, periodType18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        int int23 = dateTimeZone21.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 1899, dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        int int27 = dateTimeZone25.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime28 = localDate24.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str32 = dateTimeZone31.getID();
        org.joda.time.Interval interval33 = yearMonthDay29.toInterval(dateTimeZone31);
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.Interval interval35 = interval33.toInterval();
        org.joda.time.Interval interval36 = interval33.toInterval();
        mutablePeriod19.add((org.joda.time.ReadableInterval) interval33);
        long long38 = interval33.toDurationMillis();
        org.joda.time.Interval interval39 = interval33.toInterval();
        mutablePeriod12.add((org.joda.time.ReadableInterval) interval33);
        org.joda.time.Interval interval41 = interval33.toInterval();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology42);
        org.joda.time.DateTime.Property property44 = dateTime43.secondOfMinute();
        org.joda.time.DateTime dateTime46 = dateTime43.withYearOfCentury(16);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        int int50 = dateTimeZone48.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) 1899, dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        int int54 = dateTimeZone52.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime55 = localDate51.toDateTimeAtCurrentTime(dateTimeZone52);
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str59 = dateTimeZone58.getID();
        org.joda.time.Interval interval60 = yearMonthDay56.toInterval(dateTimeZone58);
        org.joda.time.MutableInterval mutableInterval61 = interval60.toMutableInterval();
        org.joda.time.Interval interval63 = interval60.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.DateTimeZone dateTimeZone65 = chronology64.getZone();
        org.joda.time.DateTime dateTime66 = dateTime43.toDateTime(dateTimeZone65);
        org.joda.time.DateTime.Property property67 = dateTime43.millisOfDay();
        org.joda.time.DateTime dateTime68 = property67.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime69 = property67.roundFloorCopy();
        boolean boolean70 = interval33.isAfter((org.joda.time.ReadableInstant) dateTime69);
        boolean boolean71 = interval9.contains((org.joda.time.ReadableInterval) interval33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime66", (dateTime2.compareTo(dateTime66) == 0) == dateTime2.equals(dateTime66));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight14 = yearMonthDay9.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        int int23 = dateTimeZone21.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 1899, dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        int int27 = dateTimeZone25.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime28 = localDate24.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str32 = dateTimeZone31.getID();
        org.joda.time.Interval interval33 = yearMonthDay29.toInterval(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone31);
        mutableDateTime18.setZone(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime37 = dateMidnight14.toMutableDateTime(dateTimeZone31);
        java.lang.String str38 = dateTimeZone31.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and mutableDateTime37", (dateMidnight14.compareTo(mutableDateTime37) == 0) == dateMidnight14.equals(mutableDateTime37));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYearOfCentury(16);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Interval interval19 = yearMonthDay15.toInterval(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval22 = interval19.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology23.getZone();
        org.joda.time.DateTime dateTime25 = dateTime2.toDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 1899, dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        int int34 = dateTimeZone32.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime35 = localDate31.toDateTimeAtCurrentTime(dateTimeZone32);
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str39 = dateTimeZone38.getID();
        org.joda.time.Interval interval40 = yearMonthDay36.toInterval(dateTimeZone38);
        org.joda.time.MutableInterval mutableInterval41 = interval40.toMutableInterval();
        org.joda.time.Interval interval43 = interval40.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(0L, chronology44);
        org.joda.time.DateTime dateTime46 = dateTime25.toDateTime(chronology44);
        boolean boolean47 = durationFieldType0.isSupported(chronology44);
        org.joda.time.DurationField durationField48 = chronology44.hours();
        long long50 = durationField48.getMillis(226L);
        long long53 = durationField48.add((long) 5, 123);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime25", (dateTime2.compareTo(dateTime25) == 0) == dateTime2.equals(dateTime25));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime4 = dateTime1.withYearOfCentury(16);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1899, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.Interval interval18 = yearMonthDay14.toInterval(dateTimeZone16);
        org.joda.time.MutableInterval mutableInterval19 = interval18.toMutableInterval();
        org.joda.time.Interval interval21 = interval18.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology22.getZone();
        org.joda.time.DateTime dateTime24 = dateTime1.toDateTime(dateTimeZone23);
        org.joda.time.DateTime.Property property25 = dateTime1.millisOfDay();
        org.joda.time.DateTime dateTime26 = property25.roundHalfFloorCopy();
        int int27 = dateTime26.getMillisOfSecond();
        org.joda.time.DateTime dateTime29 = dateTime26.minusWeeks(817);
        org.joda.time.DateTime dateTime30 = dateTime26.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime24", (dateTime30.compareTo(dateTime24) == 0) == dateTime30.equals(dateTime24));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Duration duration17 = interval16.toDuration();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray25 = new org.joda.time.DurationFieldType[] { durationFieldType24 };
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.forFields(durationFieldTypeArray25);
        org.joda.time.Period period27 = new org.joda.time.Period((long) ' ', periodType26);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateTime21, periodType26);
        boolean boolean29 = dateTime21.isEqualNow();
        org.joda.time.DateTime.Property property30 = dateTime21.dayOfWeek();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod();
        mutablePeriod31.setYears(16);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        int int36 = dateTimeZone34.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone34);
        org.joda.time.ReadableDuration readableDuration38 = null;
        mutableDateTime37.add(readableDuration38, 0);
        org.joda.time.Period period42 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period44 = org.joda.time.Period.minutes(1);
        java.lang.String str45 = period44.toString();
        org.joda.time.Period period46 = period42.withFields((org.joda.time.ReadablePeriod) period44);
        org.joda.time.Period period48 = period44.minusSeconds((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = period44.toDurationFrom(readableInstant49);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime37, (org.joda.time.ReadableDuration) duration50);
        mutablePeriod31.add((org.joda.time.ReadableDuration) duration50);
        org.joda.time.DateTime dateTime53 = dateTime21.minus((org.joda.time.ReadableDuration) duration50);
        long long54 = duration50.getMillis();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        int int58 = dateTimeZone56.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((long) 1899, dateTimeZone56);
        org.joda.time.LocalDate localDate61 = localDate59.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone64 = dateTimeZone63.toTimeZone();
        org.joda.time.DateTime dateTime65 = localDate59.toDateTimeAtCurrentTime(dateTimeZone63);
        org.joda.time.LocalDate.Property property66 = localDate59.dayOfMonth();
        org.joda.time.DateTime dateTime67 = localDate59.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime69 = dateTime67.plusMinutes(48);
        org.joda.time.DateTime dateTime71 = dateTime69.withMillis((-2448L));
        org.joda.time.DateTime.Property property72 = dateTime69.weekOfWeekyear();
        org.joda.time.Interval interval73 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration50, (org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.Duration duration74 = duration50.toDuration();
        org.joda.time.Period period75 = duration74.toPeriod();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime65", (dateTime8.compareTo(dateTime65) == 0) == dateTime8.equals(dateTime65));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        java.util.Date date6 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromDateFields(date6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 1899, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        int int18 = dateTimeZone16.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str23 = dateTimeZone22.getID();
        org.joda.time.Interval interval24 = yearMonthDay20.toInterval(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone22);
        org.joda.time.DateTime dateTime26 = localDate7.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (short) 10, dateTimeZone22);
        org.joda.time.DateTime dateTime28 = dateTime27.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str31 = dateTimeZone30.getID();
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.util.Locale locale34 = java.util.Locale.KOREAN;
        java.lang.String str35 = locale33.getDisplayVariant(locale34);
        java.lang.String str36 = dateTimeZone30.getShortName(0L, locale34);
        org.joda.time.DateTime dateTime37 = dateTime27.toDateTime(dateTimeZone30);
        long long39 = dateTimeZone30.convertUTCToLocal((-118857361000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime26", (dateTime9.compareTo(dateTime26) == 0) == dateTime9.equals(dateTime26));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        int int11 = dateTime10.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 1899, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        int int19 = dateTimeZone17.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime20 = localDate16.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str24 = dateTimeZone23.getID();
        org.joda.time.Interval interval25 = yearMonthDay21.toInterval(dateTimeZone23);
        org.joda.time.Interval interval26 = yearMonthDay21.toInterval();
        org.joda.time.Chronology chronology27 = yearMonthDay21.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime10.toMutableDateTime(chronology27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTime.Property property32 = dateTime31.secondOfMinute();
        org.joda.time.DateTime dateTime34 = dateTime31.withYearOfCentury(16);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        int int39 = dateTimeZone37.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 1899, dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        int int43 = dateTimeZone41.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime44 = localDate40.toDateTimeAtCurrentTime(dateTimeZone41);
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str48 = dateTimeZone47.getID();
        org.joda.time.Interval interval49 = yearMonthDay45.toInterval(dateTimeZone47);
        org.joda.time.MutableInterval mutableInterval50 = interval49.toMutableInterval();
        org.joda.time.Interval interval52 = interval49.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.DateMidnight dateMidnight54 = org.joda.time.DateMidnight.now(chronology53);
        org.joda.time.Period period55 = new org.joda.time.Period((long) 3, chronology53);
        org.joda.time.Period period57 = period55.minusDays(11);
        org.joda.time.DateTime dateTime58 = dateTime31.minus((org.joda.time.ReadablePeriod) period57);
        mutableDateTime29.add((org.joda.time.ReadablePeriod) period57);
        org.joda.time.Period period60 = period57.normalizedStandard();
        org.joda.time.DurationFieldType[] durationFieldTypeArray61 = period57.getFieldTypes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime20", (dateTime10.compareTo(dateTime20) == 0) == dateTime10.equals(dateTime20));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Interval interval14 = yearMonthDay9.toInterval();
        org.joda.time.Chronology chronology15 = yearMonthDay9.getChronology();
        int int16 = yearMonthDay9.getYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 1899, dateTimeZone18);
        org.joda.time.LocalDate localDate23 = localDate21.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime27 = localDate21.toDateTimeAtCurrentTime(dateTimeZone25);
        int int29 = dateTimeZone25.getOffsetFromLocal((long) 100);
        java.lang.String str31 = dateTimeZone25.getNameKey(0L);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone25);
        long long34 = dateTimeZone25.convertUTCToLocal((-1073174400016L));
        org.joda.time.DateTime dateTime35 = yearMonthDay9.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateTime dateTime36 = yearMonthDay9.toDateTimeAtCurrentTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime27", (dateTime8.compareTo(dateTime27) == 0) == dateTime8.equals(dateTime27));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime3.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 1899, dateTimeZone8);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTime dateTime17 = localDate11.toDateTimeAtCurrentTime(dateTimeZone15);
        int int19 = dateTimeZone15.getOffsetFromLocal((long) 100);
        mutableDateTime3.setZoneRetainFields(dateTimeZone15);
        java.util.Date date21 = mutableDateTime3.toDate();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime3.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.add((long) 3000001);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period31 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period33 = org.joda.time.Period.minutes(1);
        java.lang.String str34 = period33.toString();
        org.joda.time.Period period35 = period31.withFields((org.joda.time.ReadablePeriod) period33);
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period37 = period31.normalizedStandard(periodType36);
        org.joda.time.PeriodType periodType38 = periodType36.withSecondsRemoved();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        int int42 = dateTimeZone40.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 1899, dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        int int46 = dateTimeZone44.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime47 = localDate43.toDateTimeAtCurrentTime(dateTimeZone44);
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str51 = dateTimeZone50.getID();
        org.joda.time.Interval interval52 = yearMonthDay48.toInterval(dateTimeZone50);
        org.joda.time.Interval interval53 = yearMonthDay48.toInterval();
        org.joda.time.Period period55 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period57 = org.joda.time.Period.minutes(1);
        java.lang.String str58 = period57.toString();
        org.joda.time.Period period59 = period55.withFields((org.joda.time.ReadablePeriod) period57);
        org.joda.time.YearMonthDay yearMonthDay60 = yearMonthDay48.plus((org.joda.time.ReadablePeriod) period55);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        int int64 = dateTimeZone62.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) 1899, dateTimeZone62);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.getDefault();
        int int68 = dateTimeZone66.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime69 = localDate65.toDateTimeAtCurrentTime(dateTimeZone66);
        org.joda.time.YearMonthDay yearMonthDay70 = new org.joda.time.YearMonthDay(dateTimeZone66);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str73 = dateTimeZone72.getID();
        org.joda.time.Interval interval74 = yearMonthDay70.toInterval(dateTimeZone72);
        org.joda.time.MutableInterval mutableInterval75 = interval74.toMutableInterval();
        org.joda.time.Interval interval77 = interval74.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology78 = interval77.getChronology();
        org.joda.time.DateTimeZone dateTimeZone79 = chronology78.getZone();
        org.joda.time.DateTimeField dateTimeField80 = chronology78.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay81 = yearMonthDay60.withChronologyRetainFields(chronology78);
        org.joda.time.LocalDate localDate82 = org.joda.time.LocalDate.now(chronology78);
        org.joda.time.MutableDateTime mutableDateTime83 = new org.joda.time.MutableDateTime(chronology78);
        org.joda.time.DateTimeField dateTimeField84 = chronology78.minuteOfDay();
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((long) 54, 16L, periodType36, chronology78);
        org.joda.time.Chronology chronology86 = chronology78.withUTC();
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((long) 3172000, (long) 14, periodType27, chronology78);
        org.joda.time.DateTimeField dateTimeField88 = chronology78.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField89 = chronology78.era();
        org.joda.time.DateTime dateTime90 = new org.joda.time.DateTime(chronology78);
        org.joda.time.DateTime dateTime91 = new org.joda.time.DateTime(chronology78);
        mutableDateTime24.setChronology(chronology78);
        org.joda.time.DateTimeField dateTimeField93 = chronology78.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime47", (dateTime17.compareTo(dateTime47) == 0) == dateTime17.equals(dateTime47));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((long) 45);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.yearOfEra();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.plusDays(7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = timeOfDay17.toDateTimeToday(dateTimeZone18);
        mutableDateTime12.setZoneRetainFields(dateTimeZone18);
        boolean boolean21 = mutableDateTime12.isEqualNow();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray27 = timeOfDay26.getFields();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTimeToday(dateTimeZone28);
        org.joda.time.DateTime.Property property30 = dateTime29.monthOfYear();
        boolean boolean31 = mutableDateTime12.isBefore((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime12.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.getMutableDateTime();
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType36 = periodType35.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 2, periodType36);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight5, (org.joda.time.ReadableInstant) mutableDateTime33, periodType36);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight5.withDayOfMonth(10);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight5.minusYears(1993);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str45 = dateTimeZone44.getID();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(dateTimeZone44);
        java.lang.String str47 = dateTime46.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DateTime dateTime50 = dateTime46.withField(dateTimeFieldType48, 5);
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.weeks();
        java.lang.String str52 = durationFieldType51.toString();
        java.lang.String str53 = durationFieldType51.getName();
        org.joda.time.DateTime dateTime55 = dateTime46.withFieldAdded(durationFieldType51, 45);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        int int58 = dateTimeZone56.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(dateTimeZone56);
        org.joda.time.Period period61 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period63 = org.joda.time.Period.minutes(1);
        java.lang.String str64 = period63.toString();
        org.joda.time.Period period65 = period61.withFields((org.joda.time.ReadablePeriod) period63);
        org.joda.time.Period period67 = period63.minusSeconds((int) (short) 100);
        mutableDateTime59.add((org.joda.time.ReadablePeriod) period63);
        org.joda.time.Period period70 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period72 = org.joda.time.Period.minutes(1);
        java.lang.String str73 = period72.toString();
        org.joda.time.Period period74 = period70.withFields((org.joda.time.ReadablePeriod) period72);
        org.joda.time.Period period76 = period74.plusMillis(100);
        org.joda.time.Period period77 = period74.negated();
        org.joda.time.Period period79 = period77.withMillis(1899);
        org.joda.time.Period period81 = period79.plusMillis(0);
        mutableDateTime59.add((org.joda.time.ReadablePeriod) period79);
        org.joda.time.DateTime dateTime83 = mutableDateTime59.toDateTime();
        org.joda.time.MutableDateTime.Property property84 = mutableDateTime59.millisOfSecond();
        mutableDateTime59.addHours(19);
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean88 = mutableDateTime59.isSupported(dateTimeFieldType87);
        int int89 = dateTime46.get(dateTimeFieldType87);
        org.joda.time.DateMidnight dateMidnight91 = dateMidnight5.withField(dateTimeFieldType87, 496);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and dateTime46", (mutableDateTime12.compareTo(dateTime46) == 0) == mutableDateTime12.equals(dateTime46));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((long) 45);
        org.joda.time.DateMidnight.Property property6 = dateMidnight3.weekyear();
        int int7 = dateMidnight3.getMinuteOfHour();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTime dateTime11 = dateTime9.withHourOfDay(3);
        int int12 = dateTime11.getSecondOfMinute();
        int int13 = dateTime11.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 1899, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime22 = localDate18.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str26 = dateTimeZone25.getID();
        org.joda.time.Interval interval27 = yearMonthDay23.toInterval(dateTimeZone25);
        org.joda.time.MutableInterval mutableInterval28 = interval27.toMutableInterval();
        org.joda.time.Interval interval30 = interval27.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.DateTime dateTime32 = dateTime11.toDateTime(chronology31);
        java.lang.String str33 = dateTime11.toString();
        boolean boolean34 = dateMidnight3.isEqual((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime36 = dateTime11.plusWeeks((-2195));
        org.joda.time.DateTime.Property property37 = dateTime36.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime32", (dateTime11.compareTo(dateTime32) == 0) == dateTime11.equals(dateTime32));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        int int19 = dateTimeZone17.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 1899, dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        int int23 = dateTimeZone21.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime24 = localDate20.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str28 = dateTimeZone27.getID();
        org.joda.time.Interval interval29 = yearMonthDay25.toInterval(dateTimeZone27);
        org.joda.time.Interval interval30 = yearMonthDay25.toInterval();
        org.joda.time.Period period32 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period34 = org.joda.time.Period.minutes(1);
        java.lang.String str35 = period34.toString();
        org.joda.time.Period period36 = period32.withFields((org.joda.time.ReadablePeriod) period34);
        org.joda.time.YearMonthDay yearMonthDay37 = yearMonthDay25.plus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        int int41 = dateTimeZone39.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 1899, dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime46 = localDate42.toDateTimeAtCurrentTime(dateTimeZone43);
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str50 = dateTimeZone49.getID();
        org.joda.time.Interval interval51 = yearMonthDay47.toInterval(dateTimeZone49);
        org.joda.time.MutableInterval mutableInterval52 = interval51.toMutableInterval();
        org.joda.time.Interval interval54 = interval51.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.DateTimeZone dateTimeZone56 = chronology55.getZone();
        org.joda.time.DateTimeField dateTimeField57 = chronology55.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay58 = yearMonthDay37.withChronologyRetainFields(chronology55);
        org.joda.time.DateMidnight dateMidnight59 = yearMonthDay37.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        int int63 = dateTimeZone61.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((long) 1899, dateTimeZone61);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        int int67 = dateTimeZone65.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime68 = localDate64.toDateTimeAtCurrentTime(dateTimeZone65);
        org.joda.time.DateMidnight dateMidnight69 = yearMonthDay37.toDateMidnight(dateTimeZone65);
        mutableDateTime15.setMillis((org.joda.time.ReadableInstant) dateMidnight69);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.getDefault();
        int int73 = dateTimeZone71.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(dateTimeZone71);
        org.joda.time.ReadableDuration readableDuration75 = null;
        mutableDateTime74.add(readableDuration75, 0);
        mutableDateTime74.addDays(1899);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean81 = mutableDateTime74.isSupported(dateTimeFieldType80);
        org.joda.time.DateMidnight dateMidnight83 = dateMidnight69.withField(dateTimeFieldType80, 40);
        org.joda.time.DateMidnight.Property property84 = dateMidnight83.era();
        org.joda.time.DateMidnight.Property property85 = dateMidnight83.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and dateMidnight59", (mutableDateTime15.compareTo(dateMidnight59) == 0) == mutableDateTime15.equals(dateMidnight59));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone3);
        java.util.Calendar.Builder builder5 = builder0.setTimeZone(timeZone3);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone3);
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = timeOfDay11.toDateTimeToday(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.minus((long) (short) 0);
        org.joda.time.DateTime dateTime16 = dateTime15.toDateTimeISO();
        java.lang.String str17 = dateTime15.toString();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTime dateTime21 = dateTime15.toDateTime(dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((java.lang.Object) calendar6, dateTimeZone19);
        int int24 = calendar6.getMinimum((int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime21", (dateTime13.compareTo(dateTime21) == 0) == dateTime13.equals(dateTime21));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime4 = dateTime1.withYearOfCentury(16);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1899, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.Interval interval18 = yearMonthDay14.toInterval(dateTimeZone16);
        org.joda.time.MutableInterval mutableInterval19 = interval18.toMutableInterval();
        org.joda.time.Interval interval21 = interval18.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology22.getZone();
        org.joda.time.DateTime dateTime24 = dateTime1.toDateTime(dateTimeZone23);
        org.joda.time.DateTime.Property property25 = dateTime1.millisOfDay();
        org.joda.time.DateTime dateTime26 = property25.roundHalfFloorCopy();
        boolean boolean28 = dateTime26.isEqual((long) 48);
        org.joda.time.DateTime dateTime30 = dateTime26.withMillis((long) 54);
        org.joda.time.DateTime dateTime32 = dateTime30.withCenturyOfEra(2025);
        org.joda.time.DateTime dateTime34 = dateTime32.minusHours((-27859392));
        int int35 = dateTime34.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime24", (dateTime1.compareTo(dateTime24) == 0) == dateTime1.equals(dateTime24));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.Interval interval15 = interval13.toInterval();
        org.joda.time.Interval interval16 = interval13.toInterval();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 1899, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        int int24 = dateTimeZone22.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime25 = localDate21.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str29 = dateTimeZone28.getID();
        org.joda.time.Interval interval30 = yearMonthDay26.toInterval(dateTimeZone28);
        org.joda.time.MutableInterval mutableInterval31 = interval30.toMutableInterval();
        org.joda.time.Interval interval33 = interval30.withStartMillis((long) 32769);
        boolean boolean34 = interval16.overlaps((org.joda.time.ReadableInterval) interval30);
        boolean boolean35 = interval16.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        int int39 = dateTimeZone37.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 1899, dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        int int43 = dateTimeZone41.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime44 = localDate40.toDateTimeAtCurrentTime(dateTimeZone41);
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str48 = dateTimeZone47.getID();
        org.joda.time.Interval interval49 = yearMonthDay45.toInterval(dateTimeZone47);
        org.joda.time.MutableInterval mutableInterval50 = interval49.toMutableInterval();
        org.joda.time.Interval interval52 = interval49.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        boolean boolean54 = interval16.isAfter((org.joda.time.ReadableInterval) interval52);
        java.util.Date date60 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate61 = org.joda.time.LocalDate.fromDateFields(date60);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = localDate61.toDateTimeAtCurrentTime(dateTimeZone62);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.getDefault();
        int int68 = dateTimeZone66.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate((long) 1899, dateTimeZone66);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.getDefault();
        int int72 = dateTimeZone70.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime73 = localDate69.toDateTimeAtCurrentTime(dateTimeZone70);
        org.joda.time.YearMonthDay yearMonthDay74 = new org.joda.time.YearMonthDay(dateTimeZone70);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str77 = dateTimeZone76.getID();
        org.joda.time.Interval interval78 = yearMonthDay74.toInterval(dateTimeZone76);
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone76);
        org.joda.time.DateTime dateTime80 = localDate61.toDateTimeAtCurrentTime(dateTimeZone76);
        boolean boolean81 = interval52.contains((org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.DateTime dateTime82 = interval52.getStart();
        org.joda.time.DateTime.Property property83 = dateTime82.millisOfDay();
        java.lang.Class<?> wildcardClass84 = dateTime82.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime63 and dateTime80", (dateTime63.compareTo(dateTime80) == 0) == dateTime63.equals(dateTime80));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 1899, dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime18 = localDate14.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str22 = dateTimeZone21.getID();
        org.joda.time.Interval interval23 = yearMonthDay19.toInterval(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone21);
        org.joda.time.DateTime dateTime25 = localDate6.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.LocalDate localDate27 = localDate6.withYear(8640022);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime25", (dateTime8.compareTo(dateTime25) == 0) == dateTime8.equals(dateTime25));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYearOfCentury(16);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Interval interval19 = yearMonthDay15.toInterval(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval22 = interval19.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology23.getZone();
        org.joda.time.DateTime dateTime25 = dateTime2.toDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 1899, dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        int int34 = dateTimeZone32.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime35 = localDate31.toDateTimeAtCurrentTime(dateTimeZone32);
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str39 = dateTimeZone38.getID();
        org.joda.time.Interval interval40 = yearMonthDay36.toInterval(dateTimeZone38);
        org.joda.time.MutableInterval mutableInterval41 = interval40.toMutableInterval();
        org.joda.time.Interval interval43 = interval40.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(0L, chronology44);
        org.joda.time.DateTime dateTime46 = dateTime25.toDateTime(chronology44);
        org.joda.time.Chronology chronology47 = chronology44.withUTC();
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight((long) (-4), chronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime25", (dateTime2.compareTo(dateTime25) == 0) == dateTime2.equals(dateTime25));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime4 = dateTime1.withYearOfCentury(16);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1899, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.Interval interval18 = yearMonthDay14.toInterval(dateTimeZone16);
        org.joda.time.MutableInterval mutableInterval19 = interval18.toMutableInterval();
        org.joda.time.Interval interval21 = interval18.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology22.getZone();
        org.joda.time.DateTime dateTime24 = dateTime1.toDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str28 = dateTimeZone27.getID();
        org.joda.time.DateMidnight dateMidnight29 = org.joda.time.DateMidnight.now(dateTimeZone27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        boolean boolean31 = dateMidnight29.isBefore(readableInstant30);
        int int32 = dateMidnight29.getYearOfCentury();
        org.joda.time.DateMidnight.Property property33 = dateMidnight29.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight29.minusMonths(7);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.withYear(49);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.withYear(1970010);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateMidnight39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime24", (dateTime1.compareTo(dateTime24) == 0) == dateTime1.equals(dateTime24));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Interval interval14 = yearMonthDay9.toInterval();
        org.joda.time.Chronology chronology15 = yearMonthDay9.getChronology();
        int int16 = yearMonthDay9.getYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 1899, dateTimeZone18);
        org.joda.time.LocalDate localDate23 = localDate21.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime27 = localDate21.toDateTimeAtCurrentTime(dateTimeZone25);
        int int29 = dateTimeZone25.getOffsetFromLocal((long) 100);
        java.lang.String str31 = dateTimeZone25.getNameKey(0L);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone25);
        long long34 = dateTimeZone25.convertUTCToLocal((-1073174400016L));
        org.joda.time.DateTime dateTime35 = yearMonthDay9.toDateTimeAtCurrentTime(dateTimeZone25);
        long long38 = dateTimeZone25.adjustOffset((long) 44340000, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime27", (dateTime8.compareTo(dateTime27) == 0) == dateTime8.equals(dateTime27));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        boolean boolean12 = mutableDateTime3.isEqualNow();
        org.joda.time.DateTimeField dateTimeField13 = mutableDateTime3.getRoundingField();
        mutableDateTime3.setDate(0L);
        mutableDateTime3.setSecondOfDay(15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone19);
        java.lang.String str22 = dateTime21.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DateTime dateTime25 = dateTime21.withField(dateTimeFieldType23, 5);
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime3, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period30 = org.joda.time.Period.minutes(1);
        java.lang.String str31 = period30.toString();
        org.joda.time.Period period32 = period28.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period34 = period32.plusMillis(100);
        org.joda.time.Period period35 = period32.negated();
        org.joda.time.Period period37 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period39 = org.joda.time.Period.minutes(1);
        java.lang.String str40 = period39.toString();
        org.joda.time.Period period41 = period37.withFields((org.joda.time.ReadablePeriod) period39);
        org.joda.time.Period period43 = period41.plusMillis(100);
        boolean boolean44 = period35.equals((java.lang.Object) period43);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period46 = period35.withFields((org.joda.time.ReadablePeriod) mutablePeriod45);
        mutablePeriod45.setYears((int) '#');
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.months();
        mutablePeriod45.add(durationFieldType49, 0);
        org.joda.time.DateMidnight dateMidnight52 = org.joda.time.DateMidnight.now();
        org.joda.time.Period period54 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period56 = org.joda.time.Period.minutes(1);
        java.lang.String str57 = period56.toString();
        org.joda.time.Period period58 = period54.withFields((org.joda.time.ReadablePeriod) period56);
        org.joda.time.Period period60 = period58.plusMillis(100);
        org.joda.time.Period period61 = period58.negated();
        org.joda.time.Period period63 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period65 = org.joda.time.Period.minutes(1);
        java.lang.String str66 = period65.toString();
        org.joda.time.Period period67 = period63.withFields((org.joda.time.ReadablePeriod) period65);
        org.joda.time.Period period69 = period67.plusMillis(100);
        boolean boolean70 = period61.equals((java.lang.Object) period69);
        org.joda.time.Period period72 = period61.minusMillis((int) (short) 10);
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight52.minus((org.joda.time.ReadablePeriod) period72);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(chronology74);
        org.joda.time.DateTime dateTime77 = dateTime75.withHourOfDay(3);
        int int78 = dateTime77.getSecondOfMinute();
        int int79 = dateTime77.getMinuteOfHour();
        int int80 = dateTime77.getEra();
        org.joda.time.DateTime dateTime81 = dateTime77.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property82 = dateTime81.hourOfDay();
        boolean boolean83 = dateMidnight73.isEqual((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.Duration duration84 = mutablePeriod45.toDurationTo((org.joda.time.ReadableInstant) dateMidnight73);
        org.joda.time.Interval interval85 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration84);
        org.joda.time.DateTime dateTime87 = dateTime25.plusHours((-51));
        int int88 = dateTime87.getDayOfWeek();
        org.joda.time.DateTime dateTime90 = dateTime87.plusMillis(47);
        org.joda.time.DateTime dateTime92 = dateTime90.withMillisOfDay(395);
        org.joda.time.DateTime.Property property93 = dateTime92.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime75", (dateTime21.compareTo(dateTime75) == 0) == dateTime21.equals(dateTime75));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicTTime();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = timeOfDay9.toDateTimeToday(dateTimeZone10);
        mutableDateTime4.setZoneRetainFields(dateTimeZone10);
        boolean boolean13 = mutableDateTime4.isEqualNow();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = timeOfDay18.getFields();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.monthOfYear();
        boolean boolean23 = mutableDateTime4.isBefore((org.joda.time.ReadableInstant) dateTime21);
        int int26 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime4, "eng", 46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter0.withOffsetParsed();
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter27.withLocale(locale28);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str32 = dateTimeZone31.getID();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime36 = dateTime33.withField(dateTimeFieldType34, 44);
        org.joda.time.DateTime dateTime38 = dateTime36.withSecondOfMinute((int) '4');
        int int39 = dateTime36.getYearOfEra();
        org.joda.time.DateTime.Property property40 = dateTime36.weekOfWeekyear();
        java.lang.String str41 = dateTimeFormatter27.print((org.joda.time.ReadableInstant) dateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime33", (mutableDateTime4.compareTo(dateTime33) == 0) == mutableDateTime4.equals(dateTime33));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime6 = dateTime3.withField(dateTimeFieldType4, 44);
        org.joda.time.DateTime.Property property7 = dateTime3.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTime();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = timeOfDay13.toDateTimeToday(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minus((long) (short) 0);
        org.joda.time.DateTime dateTime18 = dateTime17.toDateTimeISO();
        org.joda.time.DateTime dateTime20 = dateTime18.minus(315705601970L);
        org.joda.time.Period period22 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period24 = period22.plusMonths(13);
        org.joda.time.DateTime dateTime25 = dateTime18.plus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 10, chronology27);
        org.joda.time.Chronology chronology30 = null;
        mutablePeriod28.setPeriod((long) 0, chronology30);
        mutablePeriod28.setMonths((-47));
        java.lang.String str34 = mutablePeriod28.toString();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        int int37 = dateTimeZone35.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.ReadableDuration readableDuration39 = null;
        mutableDateTime38.add(readableDuration39, 0);
        org.joda.time.Period period43 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period45 = org.joda.time.Period.minutes(1);
        java.lang.String str46 = period45.toString();
        org.joda.time.Period period47 = period43.withFields((org.joda.time.ReadablePeriod) period45);
        org.joda.time.Period period49 = period45.minusSeconds((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period45.toDurationFrom(readableInstant50);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime38, (org.joda.time.ReadableDuration) duration51);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        int int55 = dateTimeZone53.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(dateTimeZone53);
        org.joda.time.ReadableDuration readableDuration57 = null;
        mutableDateTime56.add(readableDuration57, 0);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime56.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime62 = property60.add((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str65 = dateTimeZone64.getID();
        org.joda.time.DateMidnight dateMidnight66 = org.joda.time.DateMidnight.now(dateTimeZone64);
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight66.plus((long) 45);
        org.joda.time.DateMidnight.Property property69 = dateMidnight66.weekyear();
        org.joda.time.DateTimeField dateTimeField70 = property69.getField();
        mutableDateTime62.setRounding(dateTimeField70, 0);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.getDefault();
        int int75 = dateTimeZone73.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(dateTimeZone73);
        org.joda.time.TimeOfDay timeOfDay81 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime83 = timeOfDay81.toDateTimeToday(dateTimeZone82);
        mutableDateTime76.setZoneRetainFields(dateTimeZone82);
        boolean boolean85 = mutableDateTime76.isEqualNow();
        org.joda.time.DateTimeField dateTimeField86 = mutableDateTime76.getRoundingField();
        int int87 = mutableDateTime76.getDayOfWeek();
        boolean boolean88 = mutableDateTime62.isEqual((org.joda.time.ReadableInstant) mutableDateTime76);
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration51, (org.joda.time.ReadableInstant) mutableDateTime62);
        org.joda.time.Duration duration90 = duration51.toDuration();
        org.joda.time.Duration duration91 = duration51.toDuration();
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration51);
        org.joda.time.DateTime dateTime94 = dateTime18.withDurationAdded((org.joda.time.ReadableDuration) duration51, 2194);
        org.joda.time.MutablePeriod mutablePeriod95 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime8, (org.joda.time.ReadableDuration) duration51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime38", (dateTime3.compareTo(mutableDateTime38) == 0) == dateTime3.equals(mutableDateTime38));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        java.lang.String str2 = localTime0.toString(dateTimeFormatter1);
        org.joda.time.LocalTime localTime4 = localTime0.minusSeconds((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalTime localTime7 = localTime4.withField(dateTimeFieldType5, 0);
        org.joda.time.LocalTime localTime9 = localTime7.plusMinutes(47);
        org.joda.time.LocalTime localTime11 = localTime9.minusHours(860);
        org.joda.time.LocalTime.Property property12 = localTime11.minuteOfHour();
        org.joda.time.LocalTime localTime13 = property12.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = timeOfDay22.toDateTimeToday(dateTimeZone23);
        mutableDateTime17.setZoneRetainFields(dateTimeZone23);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime17, readableDuration26);
        mutableDateTime17.setMillisOfDay(10);
        mutableDateTime17.setSecondOfDay(1970);
        int int32 = mutableDateTime17.getMinuteOfDay();
        int int33 = mutableDateTime17.getWeekyear();
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray39 = timeOfDay38.getFields();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = timeOfDay38.toDateTimeToday(dateTimeZone40);
        org.joda.time.DateTime.Property property42 = dateTime41.monthOfYear();
        org.joda.time.DateTime dateTime44 = dateTime41.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str47 = dateTimeZone46.getID();
        org.joda.time.DateMidnight dateMidnight48 = org.joda.time.DateMidnight.now(dateTimeZone46);
        boolean boolean49 = dateTime44.equals((java.lang.Object) dateMidnight48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight48.plusMonths(10);
        org.joda.time.DateMidnight.Property property52 = dateMidnight51.dayOfYear();
        org.joda.time.DateMidnight dateMidnight53 = property52.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight53.withDurationAdded((long) 400, 20);
        mutableDateTime17.setMillis((org.joda.time.ReadableInstant) dateMidnight56);
        int int58 = property12.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.LocalTime localTime60 = property12.addCopy(395);
        org.joda.time.LocalTime.Property property61 = localTime60.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and dateMidnight51", (mutableDateTime17.compareTo(dateMidnight51) == 0) == mutableDateTime17.equals(dateMidnight51));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        boolean boolean3 = property2.isLeap();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        int int6 = dateTimeZone4.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime7.add(readableDuration8, 0);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.dayOfWeek();
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime7.add(readableDuration12);
        long long14 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime7.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundCeiling();
        mutableDateTime16.setMinuteOfHour(59);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        int int22 = dateTimeZone20.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 1899, dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        int int26 = dateTimeZone24.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime27 = localDate23.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str31 = dateTimeZone30.getID();
        org.joda.time.Interval interval32 = yearMonthDay28.toInterval(dateTimeZone30);
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.Interval interval34 = interval32.toInterval();
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType36 = periodType35.withWeeksRemoved();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        int int40 = dateTimeZone38.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) 1899, dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        int int44 = dateTimeZone42.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime45 = localDate41.toDateTimeAtCurrentTime(dateTimeZone42);
        org.joda.time.YearMonthDay yearMonthDay46 = new org.joda.time.YearMonthDay(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str49 = dateTimeZone48.getID();
        org.joda.time.Interval interval50 = yearMonthDay46.toInterval(dateTimeZone48);
        org.joda.time.MutableInterval mutableInterval51 = interval50.toMutableInterval();
        org.joda.time.Interval interval53 = interval50.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.DateTimeZone dateTimeZone55 = chronology54.getZone();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.monthOfYear();
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight(chronology54);
        org.joda.time.DurationField durationField58 = chronology54.millis();
        org.joda.time.DateTimeField dateTimeField59 = chronology54.dayOfMonth();
        org.joda.time.Period period60 = new org.joda.time.Period((java.lang.Object) interval32, periodType36, chronology54);
        org.joda.time.Interval interval62 = interval32.withStartMillis(52L);
        long long63 = interval32.getStartMillis();
        org.joda.time.DateTime dateTime64 = interval32.getStart();
        org.joda.time.Period period69 = new org.joda.time.Period(7, (-1), 3, 26);
        org.joda.time.DateTime dateTime70 = dateTime64.plus((org.joda.time.ReadablePeriod) period69);
        org.joda.time.DateTimeZone dateTimeZone71 = dateTime70.getZone();
        int int73 = dateTimeZone71.getStandardOffset((-2142575976000L));
        java.lang.String str75 = dateTimeZone71.getShortName((-1645369062981L));
        java.lang.String str77 = dateTimeZone71.getShortName((long) 53710900);
        org.joda.time.DateTime dateTime78 = org.joda.time.DateTime.now(dateTimeZone71);
        java.lang.String str80 = dateTimeZone71.getName(53780650L);
        mutableDateTime16.setZone(dateTimeZone71);
        java.lang.String str83 = dateTimeZone71.getNameKey((-2234643900000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime78", (dateTime1.compareTo(dateTime78) == 0) == dateTime1.equals(dateTime78));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(86400000L);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        int int4 = dateTimeZone2.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 1899, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str19 = dateTimeZone18.getID();
        org.joda.time.Interval interval20 = yearMonthDay16.toInterval(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone18);
        mutableDateTime5.setZone(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) 86400000L, dateTimeZone18);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        org.joda.time.DurationField durationField26 = dateTimeField25.getLeapDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime23", (dateTime1.compareTo(mutableDateTime23) == 0) == dateTime1.equals(mutableDateTime23));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime3.addMonths(32770);
        org.joda.time.Instant instant6 = mutableDateTime3.toInstant();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale[] localeArray10 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList11 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList11, localeArray10);
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList11);
        java.util.stream.Stream<java.util.Locale> localeStream14 = localeList13.stream();
        boolean boolean15 = mutableDateTime3.equals((java.lang.Object) localeList13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        int int18 = dateTimeZone16.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period23 = org.joda.time.Period.minutes(1);
        java.lang.String str24 = period23.toString();
        org.joda.time.Period period25 = period21.withFields((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period27 = period23.minusSeconds((int) (short) 100);
        mutableDateTime19.add((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period30 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(1);
        java.lang.String str33 = period32.toString();
        org.joda.time.Period period34 = period30.withFields((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period36 = period34.plusMillis(100);
        org.joda.time.Period period37 = period34.negated();
        org.joda.time.Period period39 = period37.withMillis(1899);
        org.joda.time.Period period41 = period39.plusMillis(0);
        mutableDateTime19.add((org.joda.time.ReadablePeriod) period39);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        int int46 = dateTimeZone44.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) 1899, dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        int int50 = dateTimeZone48.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime51 = localDate47.toDateTimeAtCurrentTime(dateTimeZone48);
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str55 = dateTimeZone54.getID();
        org.joda.time.Interval interval56 = yearMonthDay52.toInterval(dateTimeZone54);
        org.joda.time.YearMonthDay.Property property57 = yearMonthDay52.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str60 = dateTimeZone59.getID();
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = yearMonthDay52.toDateTimeAtCurrentTime(dateTimeZone59);
        long long65 = dateTimeZone59.convertLocalToUTC((long) 87, false);
        org.joda.time.DateTime dateTime66 = mutableDateTime19.toDateTime(dateTimeZone59);
        org.joda.time.DateTime dateTime67 = mutableDateTime3.toDateTime(dateTimeZone59);
        long long70 = dateTimeZone59.adjustOffset((long) 865, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant6", (mutableDateTime3.compareTo(instant6) == 0) == mutableDateTime3.equals(instant6));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = calendar3.getWeekYear();
        java.lang.String str5 = calendar3.getCalendarType();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.LocalDate localDate12 = localDate10.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtCurrentTime(dateTimeZone14);
        int int18 = dateTimeZone14.getOffsetFromLocal((long) 100);
        java.lang.String str20 = dateTimeZone14.getNameKey(0L);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone14);
        long long23 = dateTimeZone14.convertUTCToLocal((-1073174400016L));
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) calendar3, dateTimeZone14);
        org.joda.time.DateTime dateTime26 = dateTime24.minusMinutes(2246400);
        org.joda.time.DateTime dateTime28 = dateTime26.plusMonths(3172000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and dateTime24", (mutableDateTime21.compareTo(dateTime24) == 0) == mutableDateTime21.equals(dateTime24));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        int int6 = dateTimeZone4.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1899, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str15 = dateTimeZone14.getID();
        org.joda.time.Interval interval16 = yearMonthDay12.toInterval(dateTimeZone14);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.Interval interval18 = interval16.toInterval();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType20 = periodType19.withWeeksRemoved();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        int int24 = dateTimeZone22.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 1899, dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime29 = localDate25.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str33 = dateTimeZone32.getID();
        org.joda.time.Interval interval34 = yearMonthDay30.toInterval(dateTimeZone32);
        org.joda.time.MutableInterval mutableInterval35 = interval34.toMutableInterval();
        org.joda.time.Interval interval37 = interval34.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology38.getZone();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.monthOfYear();
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(chronology38);
        org.joda.time.DurationField durationField42 = chronology38.millis();
        org.joda.time.DateTimeField dateTimeField43 = chronology38.dayOfMonth();
        org.joda.time.Period period44 = new org.joda.time.Period((java.lang.Object) interval16, periodType20, chronology38);
        org.joda.time.PeriodType periodType45 = periodType20.withMillisRemoved();
        org.joda.time.Period period46 = new org.joda.time.Period((long) 47016, (long) 535, periodType45);
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        int int52 = dateTimeZone50.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) 1899, dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        int int56 = dateTimeZone54.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime57 = localDate53.toDateTimeAtCurrentTime(dateTimeZone54);
        org.joda.time.YearMonthDay yearMonthDay58 = new org.joda.time.YearMonthDay(dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str61 = dateTimeZone60.getID();
        org.joda.time.Interval interval62 = yearMonthDay58.toInterval(dateTimeZone60);
        org.joda.time.MutableInterval mutableInterval63 = interval62.toMutableInterval();
        org.joda.time.Interval interval65 = interval62.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology66 = interval65.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) (byte) -1, periodType48, chronology66);
        org.joda.time.DateTime dateTime68 = org.joda.time.DateTime.now(chronology66);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod(36L, periodType45, chronology66);
        org.joda.time.YearMonthDay yearMonthDay70 = new org.joda.time.YearMonthDay(chronology66);
        org.joda.time.DateTimeField dateTimeField71 = chronology66.secondOfMinute();
        org.joda.time.DurationField durationField72 = chronology66.hours();
        org.joda.time.DurationField durationField73 = chronology66.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField73, durationField42, and durationField72", !(durationField73.compareTo(durationField42) == 0) || (Math.signum(durationField73.compareTo(durationField72)) == Math.signum(durationField42.compareTo(durationField72))));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 1899, dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime18 = localDate14.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str22 = dateTimeZone21.getID();
        org.joda.time.Interval interval23 = yearMonthDay19.toInterval(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone21);
        org.joda.time.DateTime dateTime25 = localDate6.toDateTimeAtCurrentTime(dateTimeZone21);
        java.lang.String str27 = dateTimeZone21.getName((long) 915);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str31 = dateTimeZone30.getID();
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str36 = locale33.getDisplayVariant(locale35);
        java.lang.String str37 = dateTimeZone30.getName((long) 5, locale33);
        java.util.Set<java.lang.Character> charSet38 = locale33.getExtensionKeys();
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str42 = locale39.getDisplayVariant(locale41);
        java.util.Date date48 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate49 = org.joda.time.LocalDate.fromDateFields(date48);
        org.joda.time.LocalDate.Property property50 = localDate49.weekOfWeekyear();
        org.joda.time.LocalDate localDate52 = property50.setCopy(10);
        java.util.Locale locale53 = java.util.Locale.KOREAN;
        java.util.Locale locale54 = java.util.Locale.KOREAN;
        java.lang.String str55 = locale53.getDisplayVariant(locale54);
        java.lang.String str56 = property50.getAsText(locale53);
        java.lang.String str57 = locale41.getDisplayName(locale53);
        java.lang.String str58 = locale33.getDisplayName(locale41);
        java.util.Locale locale59 = java.util.Locale.KOREA;
        java.lang.String str60 = locale59.getDisplayName();
        java.lang.String str61 = locale59.getScript();
        java.util.Set<java.lang.Character> charSet62 = locale59.getExtensionKeys();
        java.lang.String str63 = locale41.getDisplayVariant(locale59);
        java.lang.String str64 = dateTimeZone21.getShortName((long) 1974, locale41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime25", (dateTime8.compareTo(dateTime25) == 0) == dateTime8.equals(dateTime25));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(46, 0);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj0, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutableDateTime9.add(readableDuration10, 0);
        org.joda.time.Period period14 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        java.lang.String str17 = period16.toString();
        org.joda.time.Period period18 = period14.withFields((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period20 = period16.minusSeconds((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period16.toDurationFrom(readableInstant21);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime9, (org.joda.time.ReadableDuration) duration22);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        int int26 = dateTimeZone24.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutableDateTime27.add(readableDuration28, 0);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime27.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime33 = property31.add((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str36 = dateTimeZone35.getID();
        org.joda.time.DateMidnight dateMidnight37 = org.joda.time.DateMidnight.now(dateTimeZone35);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.plus((long) 45);
        org.joda.time.DateMidnight.Property property40 = dateMidnight37.weekyear();
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        mutableDateTime33.setRounding(dateTimeField41, 0);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        int int46 = dateTimeZone44.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone44);
        org.joda.time.TimeOfDay timeOfDay52 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime54 = timeOfDay52.toDateTimeToday(dateTimeZone53);
        mutableDateTime47.setZoneRetainFields(dateTimeZone53);
        boolean boolean56 = mutableDateTime47.isEqualNow();
        org.joda.time.DateTimeField dateTimeField57 = mutableDateTime47.getRoundingField();
        int int58 = mutableDateTime47.getDayOfWeek();
        boolean boolean59 = mutableDateTime33.isEqual((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, (org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.Duration duration61 = duration22.toDuration();
        long long62 = duration22.getMillis();
        org.joda.time.Interval interval63 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableDuration) duration22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime9", (dateTime4.compareTo(mutableDateTime9) == 0) == dateTime4.equals(mutableDateTime9));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Duration duration17 = interval16.toDuration();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray25 = new org.joda.time.DurationFieldType[] { durationFieldType24 };
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.forFields(durationFieldTypeArray25);
        org.joda.time.Period period27 = new org.joda.time.Period((long) ' ', periodType26);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateTime21, periodType26);
        boolean boolean29 = dateTime21.isEqualNow();
        org.joda.time.DateTime.Property property30 = dateTime21.dayOfWeek();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod();
        mutablePeriod31.setYears(16);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        int int36 = dateTimeZone34.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone34);
        org.joda.time.ReadableDuration readableDuration38 = null;
        mutableDateTime37.add(readableDuration38, 0);
        org.joda.time.Period period42 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period44 = org.joda.time.Period.minutes(1);
        java.lang.String str45 = period44.toString();
        org.joda.time.Period period46 = period42.withFields((org.joda.time.ReadablePeriod) period44);
        org.joda.time.Period period48 = period44.minusSeconds((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = period44.toDurationFrom(readableInstant49);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime37, (org.joda.time.ReadableDuration) duration50);
        mutablePeriod31.add((org.joda.time.ReadableDuration) duration50);
        org.joda.time.DateTime dateTime53 = dateTime21.minus((org.joda.time.ReadableDuration) duration50);
        long long54 = duration50.getMillis();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        int int58 = dateTimeZone56.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((long) 1899, dateTimeZone56);
        org.joda.time.LocalDate localDate61 = localDate59.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone64 = dateTimeZone63.toTimeZone();
        org.joda.time.DateTime dateTime65 = localDate59.toDateTimeAtCurrentTime(dateTimeZone63);
        org.joda.time.LocalDate.Property property66 = localDate59.dayOfMonth();
        org.joda.time.DateTime dateTime67 = localDate59.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime69 = dateTime67.plusMinutes(48);
        org.joda.time.DateTime dateTime71 = dateTime69.withMillis((-2448L));
        org.joda.time.DateTime.Property property72 = dateTime69.weekOfWeekyear();
        org.joda.time.Interval interval73 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration50, (org.joda.time.ReadableInstant) dateTime69);
        long long74 = interval73.toDurationMillis();
        java.lang.String str75 = interval73.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime65", (dateTime8.compareTo(dateTime65) == 0) == dateTime8.equals(dateTime65));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = timeOfDay5.getFields();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTimeToday(dateTimeZone7);
        org.joda.time.Chronology chronology9 = timeOfDay5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.dayOfWeek();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay((java.lang.Object) (-37988L), chronology9);
        org.joda.time.DurationField durationField13 = chronology9.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField13, and durationField10", !(durationField10.compareTo(durationField13) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField13.compareTo(durationField10))));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Interval interval19 = yearMonthDay15.toInterval(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval22 = interval19.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime3.toDateTime(chronology23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime27 = dateTime24.withZoneRetainFields(dateTimeZone26);
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfMonth();
        org.joda.time.DateTime dateTime29 = property28.roundFloorCopy();
        org.joda.time.DateTime dateTime31 = dateTime29.plusMonths(54018344);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime24", (dateTime3.compareTo(dateTime24) == 0) == dateTime3.equals(dateTime24));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        java.util.Date date7 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.fromDateFields(date7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 1899, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        int int19 = dateTimeZone17.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime20 = localDate16.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str24 = dateTimeZone23.getID();
        org.joda.time.Interval interval25 = yearMonthDay21.toInterval(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone23);
        org.joda.time.DateTime dateTime27 = localDate8.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (short) 10, dateTimeZone23);
        java.lang.String str30 = dateTimeZone23.getShortName((-865L));
        long long34 = dateTimeZone23.convertLocalToUTC((long) (byte) 1, false, 493208056388000L);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(0L, dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime27", (dateTime10.compareTo(dateTime27) == 0) == dateTime10.equals(dateTime27));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Period period5 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period7 = org.joda.time.Period.minutes(1);
        java.lang.String str8 = period7.toString();
        org.joda.time.Period period9 = period5.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) (short) 100);
        mutableDateTime3.add((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period14 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        java.lang.String str17 = period16.toString();
        org.joda.time.Period period18 = period14.withFields((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period20 = period18.plusMillis(100);
        org.joda.time.Period period21 = period18.negated();
        org.joda.time.Period period23 = period21.withMillis(1899);
        org.joda.time.Period period25 = period23.plusMillis(0);
        mutableDateTime3.add((org.joda.time.ReadablePeriod) period23);
        org.joda.time.DateTime dateTime27 = mutableDateTime3.toDateTime();
        mutableDateTime3.setWeekyear(1970);
        org.joda.time.DateTimeField dateTimeField30 = mutableDateTime3.getRoundingField();
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = timeOfDay35.toDateTimeToday(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.minus((long) (short) 0);
        org.joda.time.DateTime dateTime40 = dateTime39.toDateTimeISO();
        org.joda.time.DateTime dateTime42 = dateTime40.minus(315705601970L);
        org.joda.time.DateTime.Property property43 = dateTime40.era();
        org.joda.time.DateTime dateTime44 = property43.getDateTime();
        org.joda.time.DateTime dateTime46 = dateTime44.withWeekyear(1722);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone49 = dateTimeZone48.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime44, dateTimeZone48);
        org.joda.time.DateTime dateTime52 = dateTime44.plusDays(1900);
        mutableDateTime3.setTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime.Property property54 = dateTime44.monthOfYear();
        org.joda.time.DurationField durationField55 = property54.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and mutableDateTime50", (dateTime37.compareTo(mutableDateTime50) == 0) == dateTime37.equals(mutableDateTime50));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod();
        java.lang.String str2 = mutablePeriod1.toString();
        mutablePeriod1.setPeriod(0L);
        mutablePeriod1.addMonths(11);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 1899, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str19 = dateTimeZone18.getID();
        org.joda.time.Interval interval20 = yearMonthDay16.toInterval(dateTimeZone18);
        org.joda.time.MutableInterval mutableInterval21 = interval20.toMutableInterval();
        org.joda.time.Interval interval23 = interval20.withStartMillis((long) 32769);
        org.joda.time.Duration duration24 = interval23.toDuration();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str27 = dateTimeZone26.getID();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone26);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType31 = dateTimeFieldType30.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray32 = new org.joda.time.DurationFieldType[] { durationFieldType31 };
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.forFields(durationFieldTypeArray32);
        org.joda.time.Period period34 = new org.joda.time.Period((long) ' ', periodType33);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration24, (org.joda.time.ReadableInstant) dateTime28, periodType33);
        org.joda.time.Duration duration36 = duration24.toDuration();
        org.joda.time.Period period38 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period40 = org.joda.time.Period.minutes(1);
        java.lang.String str41 = period40.toString();
        org.joda.time.Period period42 = period38.withFields((org.joda.time.ReadablePeriod) period40);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period45 = period42.withField(durationFieldType43, (int) 'a');
        org.joda.time.Hours hours46 = period42.toStandardHours();
        boolean boolean47 = duration24.equals((java.lang.Object) period42);
        mutablePeriod1.add((org.joda.time.ReadableDuration) duration24);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        int int52 = dateTimeZone50.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) 1899, dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        int int56 = dateTimeZone54.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime57 = localDate53.toDateTimeAtCurrentTime(dateTimeZone54);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(chronology58);
        org.joda.time.DateTime.Property property60 = dateTime59.secondOfMinute();
        boolean boolean61 = localDate53.equals((java.lang.Object) dateTime59);
        java.lang.String str62 = dateTime59.toString();
        org.joda.time.MutableDateTime mutableDateTime63 = dateTime59.toMutableDateTime();
        org.joda.time.Duration duration64 = mutablePeriod1.toDurationFrom((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Period period74 = new org.joda.time.Period(8, (int) ' ', (int) (byte) 10, 0, (int) (short) -1, 44, (-2013), 35);
        org.joda.time.PeriodType periodType75 = period74.getPeriodType();
        org.joda.time.PeriodType periodType76 = periodType75.withMillisRemoved();
        org.joda.time.PeriodType periodType77 = periodType76.withMonthsRemoved();
        org.joda.time.Period period78 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration64, readableInstant65, periodType77);
        org.joda.time.Period period79 = new org.joda.time.Period((long) 173, periodType77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime59", (dateTime28.compareTo(dateTime59) == 0) == dateTime28.equals(dateTime59));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        java.lang.String str4 = dateTime3.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DateTime dateTime7 = dateTime3.withField(dateTimeFieldType5, 5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 1899, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.Interval interval21 = yearMonthDay17.toInterval(dateTimeZone19);
        org.joda.time.Interval interval22 = yearMonthDay17.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateMidnight dateMidnight24 = org.joda.time.DateMidnight.now(chronology23);
        org.joda.time.DateTime dateTime25 = dateTime3.toDateTime(chronology23);
        org.joda.time.YearMonthDay yearMonthDay26 = dateTime3.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        int int31 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 1899, dateTimeZone29);
        org.joda.time.LocalDate localDate34 = localDate32.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        org.joda.time.DateTime dateTime38 = localDate32.toDateTimeAtCurrentTime(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str41 = dateTimeZone40.getID();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone40);
        java.lang.String str44 = dateTimeZone40.getName((long) (-1));
        org.joda.time.Interval interval45 = localDate32.toInterval(dateTimeZone40);
        org.joda.time.YearMonthDay yearMonthDay46 = new org.joda.time.YearMonthDay(dateTimeZone40);
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) 1969, dateTimeZone40);
        long long51 = dateTimeZone40.convertLocalToUTC(153713980799984L, true, (long) 2021);
        org.joda.time.DateTime dateTime52 = yearMonthDay26.toDateTimeAtMidnight(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime25", (dateTime3.compareTo(dateTime25) == 0) == dateTime3.equals(dateTime25));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Interval interval19 = yearMonthDay15.toInterval(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval22 = interval19.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime3.toDateTime(chronology23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime27 = dateTime24.withZoneRetainFields(dateTimeZone26);
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        int int32 = dateTimeZone30.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 1899, dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        int int36 = dateTimeZone34.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime37 = localDate33.toDateTimeAtCurrentTime(dateTimeZone34);
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str41 = dateTimeZone40.getID();
        org.joda.time.Interval interval42 = yearMonthDay38.toInterval(dateTimeZone40);
        org.joda.time.MutableInterval mutableInterval43 = interval42.toMutableInterval();
        org.joda.time.Interval interval45 = interval42.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.clockhourOfDay();
        org.joda.time.DateMidnight dateMidnight48 = org.joda.time.DateMidnight.now(chronology46);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime27.toMutableDateTime(chronology46);
        mutableDateTime49.setMillis((long) 53826);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime24", (dateTime3.compareTo(dateTime24) == 0) == dateTime3.equals(dateTime24));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 44);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str5 = dateTimeZone4.getID();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone4);
        java.lang.String str8 = dateTimeZone4.getName((long) (-1));
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(dateTimeZone4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime11 = dateTime2.toDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj0, dateTimeZone4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime11", (dateTime2.compareTo(dateTime11) == 0) == dateTime2.equals(dateTime11));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = calendar3.getWeekYear();
        java.lang.String str5 = calendar3.getCalendarType();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.LocalDate localDate12 = localDate10.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtCurrentTime(dateTimeZone14);
        int int18 = dateTimeZone14.getOffsetFromLocal((long) 100);
        java.lang.String str20 = dateTimeZone14.getNameKey(0L);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone14);
        long long23 = dateTimeZone14.convertUTCToLocal((-1073174400016L));
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) calendar3, dateTimeZone14);
        java.lang.String str25 = calendar3.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and dateTime24", (mutableDateTime21.compareTo(dateTime24) == 0) == mutableDateTime21.equals(dateTime24));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = timeOfDay5.getFields();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTimeToday(dateTimeZone7);
        org.joda.time.DateTime.Property property9 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime11 = dateTime8.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime11.plusMonths(58);
        org.joda.time.DateTime dateTime17 = dateTime11.plusMinutes(45);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray24 = timeOfDay23.getFields();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTimeToday(dateTimeZone25);
        org.joda.time.Chronology chronology27 = timeOfDay23.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.years();
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.fromMillisOfDay((long) 23, chronology27);
        org.joda.time.DateTime dateTime30 = dateTime11.toDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(0L, chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime30", (dateTime11.compareTo(dateTime30) == 0) == dateTime11.equals(dateTime30));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(1645455399465L, (long) 457);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) '4', chronology5);
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.plusMinutes(1899);
        org.joda.time.Chronology chronology9 = timeOfDay8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(chronology9);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = timeOfDay15.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minus((long) (short) 0);
        org.joda.time.DateTime dateTime20 = dateTime19.toDateTimeISO();
        java.lang.String str21 = dateTime19.toString();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTime dateTime25 = dateTime19.toDateTime(dateTimeZone23);
        java.lang.String str27 = dateTime25.toString("45");
        mutablePeriod2.setPeriod((org.joda.time.ReadableInstant) mutableDateTime10, (org.joda.time.ReadableInstant) dateTime25);
        mutableDateTime10.setTime(1645455547037L);
        int int31 = mutableDateTime10.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime25", (dateTime17.compareTo(dateTime25) == 0) == dateTime17.equals(dateTime25));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withYearOfEra(52);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.monthOfYear();
        org.joda.time.DateMidnight.Property property7 = dateMidnight5.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight5.toMutableDateTime(chronology8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfWeek();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.weekOfWeekyear();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod();
        int int13 = mutablePeriod12.getDays();
        java.util.Date date21 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.fromDateFields(date21);
        org.joda.time.LocalDate.Property property23 = localDate22.weekOfWeekyear();
        org.joda.time.LocalDate localDate25 = property23.setCopy("45");
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str28 = dateTimeZone27.getID();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime32 = dateTime29.withField(dateTimeFieldType30, 44);
        boolean boolean33 = localDate25.isSupported(dateTimeFieldType30);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        int int37 = dateTimeZone35.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 1899, dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        int int41 = dateTimeZone39.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime42 = localDate38.toDateTimeAtCurrentTime(dateTimeZone39);
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str46 = dateTimeZone45.getID();
        org.joda.time.Interval interval47 = yearMonthDay43.toInterval(dateTimeZone45);
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        long long52 = chronology48.add((long) 18, (long) 6, 58);
        boolean boolean53 = dateTimeFieldType30.isSupported(chronology48);
        mutablePeriod12.setPeriod((long) 32, (long) 53, chronology48);
        org.joda.time.DateTimeField dateTimeField55 = chronology48.minuteOfHour();
        org.joda.time.DurationField durationField56 = chronology48.years();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(chronology48);
        org.joda.time.DateTime dateTime58 = dateTime57.withEarlierOffsetAtOverlap();
        long long59 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and mutableDateTime9", (dateMidnight5.compareTo(mutableDateTime9) == 0) == dateMidnight5.equals(mutableDateTime9));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.LocalDate.Property property8 = localDate6.dayOfMonth();
        org.joda.time.LocalDate localDate9 = property8.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 1899, dateTimeZone11);
        org.joda.time.LocalDate localDate16 = localDate14.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDate14.toDateTimeAtCurrentTime(dateTimeZone18);
        int int22 = dateTimeZone18.getOffsetFromLocal((long) 100);
        long long25 = dateTimeZone18.adjustOffset(0L, true);
        org.joda.time.DateTime dateTime26 = localDate9.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 1899, dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        int int34 = dateTimeZone32.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime35 = localDate31.toDateTimeAtCurrentTime(dateTimeZone32);
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str39 = dateTimeZone38.getID();
        org.joda.time.Interval interval40 = yearMonthDay36.toInterval(dateTimeZone38);
        org.joda.time.MutableInterval mutableInterval41 = interval40.toMutableInterval();
        org.joda.time.Interval interval43 = interval40.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology44.getZone();
        org.joda.time.DurationField durationField46 = chronology44.centuries();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology44);
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(chronology44);
        org.joda.time.DateTimeZone dateTimeZone49 = chronology44.getZone();
        long long51 = dateTimeZone18.getMillisKeepLocal(dateTimeZone49, 1645401600000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime35", (dateTime20.compareTo(dateTime35) == 0) == dateTime20.equals(dateTime35));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = calendar3.getWeekYear();
        java.lang.String str5 = calendar3.getCalendarType();
        java.util.Date date6 = calendar3.getTime();
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromCalendarFields(calendar3);
        calendar3.setMinimalDaysInFirstWeek((int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 1899, dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime18 = localDate14.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str22 = dateTimeZone21.getID();
        org.joda.time.Interval interval23 = yearMonthDay19.toInterval(dateTimeZone21);
        org.joda.time.Interval interval24 = yearMonthDay19.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.Chronology chronology26 = interval24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.halfdayOfDay();
        boolean boolean28 = calendar3.after((java.lang.Object) chronology26);
        java.util.TimeZone timeZone29 = calendar3.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone32);
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.fromCalendarFields(calendar33);
        calendar33.setFirstDayOfWeek((int) (short) 100);
        calendar33.set(47, 46, 70, 1900, 1900, (-1));
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone46 = dateTimeZone45.toTimeZone();
        boolean boolean47 = timeZone46.observesDaylightTime();
        java.util.Locale locale48 = java.util.Locale.CANADA_FRENCH;
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone46, locale48);
        calendar33.setTimeZone(timeZone46);
        int int51 = timeZone46.getRawOffset();
        timeZone46.setID("2022-02-21T14:55:36.527Z");
        java.lang.String str54 = timeZone46.getID();
        boolean boolean55 = timeZone29.hasSameRules(timeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar49", (calendar3.compareTo(calendar49) == 0) == calendar3.equals(calendar49));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(46, 0);
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str7 = dateTimeZone6.getID();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime11 = dateTime8.withField(dateTimeFieldType9, 44);
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType9.getRangeDurationType();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 1899, dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime21 = localDate17.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str25 = dateTimeZone24.getID();
        org.joda.time.Interval interval26 = yearMonthDay22.toInterval(dateTimeZone24);
        org.joda.time.Interval interval27 = yearMonthDay22.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.DateMidnight dateMidnight29 = org.joda.time.DateMidnight.now(chronology28);
        boolean boolean30 = durationFieldType12.isSupported(chronology28);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 11, chronology28);
        int int32 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) mutableDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime8", (dateTime3.compareTo(dateTime8) == 0) == dateTime3.equals(dateTime8));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.TimeOfDay.Property property7 = timeOfDay4.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay8 = property7.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.minusSeconds((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        java.lang.String str15 = dateTimeZone11.getNameKey((long) (byte) 10);
        org.joda.time.DateTime dateTime16 = timeOfDay10.toDateTimeToday(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        java.util.TimeZone timeZone18 = dateTimeZone11.toTimeZone();
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str22 = dateTimeZone21.getID();
        org.joda.time.DateMidnight dateMidnight23 = org.joda.time.DateMidnight.now(dateTimeZone21);
        int int25 = dateTimeZone21.getOffset((long) 1);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone21);
        java.util.TimeZone timeZone27 = dateTimeZone21.toTimeZone();
        timeZone27.setID("\uae08");
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone27);
        java.lang.String str31 = timeZone27.getID();
        calendar19.setTimeZone(timeZone27);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone35 = dateTimeZone34.toTimeZone();
        boolean boolean36 = timeZone35.observesDaylightTime();
        java.util.Locale locale37 = java.util.Locale.CANADA_FRENCH;
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone35, locale37);
        java.lang.String str39 = locale37.getCountry();
        java.lang.String str40 = locale37.getScript();
        java.lang.String str41 = locale37.getVariant();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone27, locale37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar19 and calendar38", (calendar19.compareTo(calendar38) == 0) == calendar19.equals(calendar38));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusMillis(3);
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.centuryOfEra();
        int int17 = localDateTime12.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        org.joda.time.LocalDateTime.Property property20 = localDateTime12.property(dateTimeFieldType18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str23 = dateTimeZone22.getID();
        org.joda.time.DateMidnight dateMidnight24 = org.joda.time.DateMidnight.now(dateTimeZone22);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType25.getDurationType();
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight24.withField(dateTimeFieldType25, (int) (short) 10);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight24.minusYears((int) 'u');
        org.joda.time.Instant instant31 = dateMidnight24.toInstant();
        boolean boolean32 = property20.equals((java.lang.Object) instant31);
        int int33 = property20.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight24 and instant31", (dateMidnight24.compareTo(instant31) == 0) == dateMidnight24.equals(instant31));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale4.getDisplayName(locale7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone2, locale4);
        int int13 = calendar11.getMaximum((int) (short) 0);
        calendar11.setLenient(false);
        java.util.Date date16 = calendar11.getTime();
        int int17 = calendar11.getWeekYear();
        java.util.TimeZone timeZone18 = calendar11.getTimeZone();
        boolean boolean19 = timeZone18.observesDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar11", (calendar3.compareTo(calendar11) == 0) == calendar3.equals(calendar11));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone3);
        java.util.Calendar.Builder builder5 = builder0.setTimeZone(timeZone3);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 10, chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMinuteOfHour(0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 10, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withWeekyear((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        boolean boolean22 = localDateTime16.equals((java.lang.Object) timeZone21);
        java.util.Calendar.Builder builder23 = builder5.setTimeZone(timeZone21);
        java.util.Calendar.Builder builder25 = builder5.setLenient(false);
        java.util.Calendar.Builder builder29 = builder25.setWeekDate(2012, (int) (short) 10, 99);
        java.util.Calendar.Builder builder31 = builder29.setLenient(false);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone34 = dateTimeZone33.toTimeZone();
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone34);
        timeZone34.setID("1970");
        int int39 = timeZone34.getOffset(1645455363830L);
        java.util.Calendar.Builder builder40 = builder29.setTimeZone(timeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar35", (calendar4.compareTo(calendar35) == 0) == calendar4.equals(calendar35));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property10 = dateTime6.property(dateTimeFieldType9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone12);
        boolean boolean15 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = timeOfDay20.getFields();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTimeToday(dateTimeZone22);
        org.joda.time.DateTime.Property property24 = dateTime23.monthOfYear();
        org.joda.time.DateTime dateTime26 = dateTime23.minusMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime28 = dateTime23.withSecondOfMinute(16);
        org.joda.time.Instant instant29 = dateTime28.toInstant();
        boolean boolean30 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime32 = dateTime28.minusDays(952);
        int int33 = dateTime32.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and instant29", (dateTime28.compareTo(instant29) == 0) == dateTime28.equals(instant29));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.parse("00");
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plusDays((int) (short) -1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight1.plusMonths(395);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = timeOfDay11.toDateTimeToday(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.minus((long) (short) 0);
        org.joda.time.DateTime dateTime16 = dateTime15.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        int int19 = dateTimeZone17.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime21 = dateTime16.withZone(dateTimeZone17);
        org.joda.time.DateTime.Property property22 = dateTime21.millisOfDay();
        org.joda.time.DateTime dateTime23 = property22.roundCeilingCopy();
        org.joda.time.DateTime dateTime24 = property22.withMinimumValue();
        org.joda.time.DateTime dateTime26 = property22.setCopy(53815647);
        org.joda.time.DateTime dateTime28 = dateTime26.withMinuteOfHour(16);
        boolean boolean29 = instant6.isBefore((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = timeOfDay39.toDateTimeToday(dateTimeZone40);
        mutableDateTime34.setZoneRetainFields(dateTimeZone40);
        boolean boolean43 = mutableDateTime34.isEqualNow();
        org.joda.time.DateTimeField dateTimeField44 = mutableDateTime34.getRoundingField();
        org.joda.time.Interval interval45 = new org.joda.time.Interval(readablePeriod30, (org.joda.time.ReadableInstant) mutableDateTime34);
        mutableDateTime34.setTime((-1L));
        mutableDateTime34.addYears(1022);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str52 = dateTimeZone51.getID();
        org.joda.time.DateMidnight dateMidnight53 = org.joda.time.DateMidnight.now(dateTimeZone51);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.plus((long) 45);
        org.joda.time.DateMidnight.Property property56 = dateMidnight55.yearOfEra();
        org.joda.time.DateMidnight dateMidnight57 = property56.roundFloorCopy();
        boolean boolean58 = mutableDateTime34.isBefore((org.joda.time.ReadableInstant) dateMidnight57);
        org.joda.time.Chronology chronology59 = mutableDateTime34.getChronology();
        org.joda.time.Interval interval60 = new org.joda.time.Interval((org.joda.time.ReadableInstant) instant6, (org.joda.time.ReadableInstant) mutableDateTime34);
        mutableDateTime34.addWeekyears(117);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and instant6", (dateMidnight5.compareTo(instant6) == 0) == dateMidnight5.equals(instant6));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime3.addMonths(32770);
        org.joda.time.Instant instant6 = mutableDateTime3.toInstant();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale[] localeArray10 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList11 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList11, localeArray10);
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList11);
        java.util.stream.Stream<java.util.Locale> localeStream14 = localeList13.stream();
        boolean boolean15 = mutableDateTime3.equals((java.lang.Object) localeList13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        int int18 = dateTimeZone16.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period23 = org.joda.time.Period.minutes(1);
        java.lang.String str24 = period23.toString();
        org.joda.time.Period period25 = period21.withFields((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period27 = period23.minusSeconds((int) (short) 100);
        mutableDateTime19.add((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period30 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(1);
        java.lang.String str33 = period32.toString();
        org.joda.time.Period period34 = period30.withFields((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period36 = period34.plusMillis(100);
        org.joda.time.Period period37 = period34.negated();
        org.joda.time.Period period39 = period37.withMillis(1899);
        org.joda.time.Period period41 = period39.plusMillis(0);
        mutableDateTime19.add((org.joda.time.ReadablePeriod) period39);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        int int46 = dateTimeZone44.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) 1899, dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        int int50 = dateTimeZone48.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime51 = localDate47.toDateTimeAtCurrentTime(dateTimeZone48);
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str55 = dateTimeZone54.getID();
        org.joda.time.Interval interval56 = yearMonthDay52.toInterval(dateTimeZone54);
        org.joda.time.YearMonthDay.Property property57 = yearMonthDay52.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str60 = dateTimeZone59.getID();
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = yearMonthDay52.toDateTimeAtCurrentTime(dateTimeZone59);
        long long65 = dateTimeZone59.convertLocalToUTC((long) 87, false);
        org.joda.time.DateTime dateTime66 = mutableDateTime19.toDateTime(dateTimeZone59);
        org.joda.time.DateTime dateTime67 = mutableDateTime3.toDateTime(dateTimeZone59);
        org.joda.time.YearMonthDay yearMonthDay68 = new org.joda.time.YearMonthDay(dateTimeZone59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant6", (mutableDateTime3.compareTo(instant6) == 0) == mutableDateTime3.equals(instant6));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 1899, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime12 = localDate8.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str16 = dateTimeZone15.getID();
        org.joda.time.Interval interval17 = yearMonthDay13.toInterval(dateTimeZone15);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Interval interval20 = interval17.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) (byte) -1, periodType3, chronology21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(chronology21);
        org.joda.time.Interval interval24 = new org.joda.time.Interval(56L, (long) 58, chronology21);
        org.joda.time.DateTimeZone dateTimeZone25 = chronology21.getZone();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(chronology21);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone27);
        mutableDateTime30.addMonths(32770);
        org.joda.time.Instant instant33 = mutableDateTime30.toInstant();
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Locale[] localeArray37 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.stream.Stream<java.util.Locale> localeStream41 = localeList40.stream();
        boolean boolean42 = mutableDateTime30.equals((java.lang.Object) localeList40);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.Period period48 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period50 = org.joda.time.Period.minutes(1);
        java.lang.String str51 = period50.toString();
        org.joda.time.Period period52 = period48.withFields((org.joda.time.ReadablePeriod) period50);
        org.joda.time.Period period54 = period50.minusSeconds((int) (short) 100);
        mutableDateTime46.add((org.joda.time.ReadablePeriod) period50);
        org.joda.time.Period period57 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period59 = org.joda.time.Period.minutes(1);
        java.lang.String str60 = period59.toString();
        org.joda.time.Period period61 = period57.withFields((org.joda.time.ReadablePeriod) period59);
        org.joda.time.Period period63 = period61.plusMillis(100);
        org.joda.time.Period period64 = period61.negated();
        org.joda.time.Period period66 = period64.withMillis(1899);
        org.joda.time.Period period68 = period66.plusMillis(0);
        mutableDateTime46.add((org.joda.time.ReadablePeriod) period66);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.getDefault();
        int int73 = dateTimeZone71.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate((long) 1899, dateTimeZone71);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.getDefault();
        int int77 = dateTimeZone75.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime78 = localDate74.toDateTimeAtCurrentTime(dateTimeZone75);
        org.joda.time.YearMonthDay yearMonthDay79 = new org.joda.time.YearMonthDay(dateTimeZone75);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str82 = dateTimeZone81.getID();
        org.joda.time.Interval interval83 = yearMonthDay79.toInterval(dateTimeZone81);
        org.joda.time.YearMonthDay.Property property84 = yearMonthDay79.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone86 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str87 = dateTimeZone86.getID();
        org.joda.time.DateTime dateTime88 = new org.joda.time.DateTime(dateTimeZone86);
        org.joda.time.DateTime dateTime89 = yearMonthDay79.toDateTimeAtCurrentTime(dateTimeZone86);
        long long92 = dateTimeZone86.convertLocalToUTC((long) 87, false);
        org.joda.time.DateTime dateTime93 = mutableDateTime46.toDateTime(dateTimeZone86);
        org.joda.time.DateTime dateTime94 = mutableDateTime30.toDateTime(dateTimeZone86);
        org.joda.time.DateTime dateTime95 = localDate26.toDateTimeAtCurrentTime(dateTimeZone86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime30 and instant33", (mutableDateTime30.compareTo(instant33) == 0) == mutableDateTime30.equals(instant33));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale4.getDisplayName(locale7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone2, locale4);
        int int13 = calendar11.getMaximum((int) (short) 0);
        calendar11.setLenient(false);
        java.util.Date date16 = calendar11.getTime();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.fromCalendarFields(calendar11);
        org.joda.time.LocalDate.Property property18 = localDate17.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar11", (calendar3.compareTo(calendar11) == 0) == calendar3.equals(calendar11));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        java.lang.String str4 = dateTime3.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DateTime dateTime7 = dateTime3.withField(dateTimeFieldType5, 5);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weeks();
        java.lang.String str9 = durationFieldType8.toString();
        java.lang.String str10 = durationFieldType8.getName();
        org.joda.time.DateTime dateTime12 = dateTime3.withFieldAdded(durationFieldType8, 45);
        java.util.GregorianCalendar gregorianCalendar13 = dateTime3.toGregorianCalendar();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = timeOfDay18.toDateTimeToday(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.minus((long) (short) 0);
        org.joda.time.DateTime dateTime23 = dateTime22.toDateTimeISO();
        org.joda.time.DateTime dateTime25 = dateTime23.minus(315705601970L);
        int int26 = dateTime25.getMinuteOfDay();
        org.joda.time.DateTime dateTime27 = dateTime25.toDateTime();
        org.joda.time.Period period29 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period31 = org.joda.time.Period.minutes(1);
        java.lang.String str32 = period31.toString();
        org.joda.time.Period period33 = period29.withFields((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Period period35 = period31.minusSeconds((int) (short) 100);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(0, (int) '4', chronology38);
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay39.plusMinutes(1899);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
        java.lang.String str43 = timeOfDay39.toString(dateTimeFormatter42);
        org.joda.time.Period period45 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period47 = org.joda.time.Period.minutes(1);
        java.lang.String str48 = period47.toString();
        org.joda.time.Period period49 = period45.withFields((org.joda.time.ReadablePeriod) period47);
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay39.minus((org.joda.time.ReadablePeriod) period45);
        org.joda.time.Period period51 = period31.minus((org.joda.time.ReadablePeriod) period45);
        org.joda.time.DateTime dateTime52 = dateTime27.minus((org.joda.time.ReadablePeriod) period45);
        int int53 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime54 = dateTime3.toDateTime();
        org.joda.time.DateTime dateTime56 = dateTime3.withEra((int) (byte) 1);
        org.joda.time.Instant instant57 = dateTime3.toInstant();
        int int58 = dateTime3.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant57", (dateTime3.compareTo(instant57) == 0) == dateTime3.equals(instant57));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Calendar.Builder builder3 = builder0.setLocale(locale1);
        java.util.Calendar.Builder builder7 = builder0.setDate(15, 899, 37);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        timeZone8.setID("DurationField[seconds]");
        java.util.Calendar.Builder builder11 = builder7.setTimeZone(timeZone8);
        java.util.Calendar.Builder builder14 = builder7.set(11, 24);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone17);
        timeZone17.setID("1970");
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        boolean boolean24 = timeZone23.observesDaylightTime();
        boolean boolean25 = timeZone17.hasSameRules(timeZone23);
        timeZone23.setRawOffset(1900);
        java.util.Calendar.Builder builder28 = builder14.setTimeZone(timeZone23);
        timeZone23.setID("zh");
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str33 = dateTimeZone32.getID();
        org.joda.time.DateMidnight dateMidnight34 = org.joda.time.DateMidnight.now(dateTimeZone32);
        int int36 = dateTimeZone32.getOffset((long) 1);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        java.util.TimeZone timeZone38 = dateTimeZone32.toTimeZone();
        timeZone38.setID("\uae08");
        boolean boolean41 = timeZone23.hasSameRules(timeZone38);
        java.util.Locale locale43 = new java.util.Locale("2022-02-21T14:56:52.694+00:00:00.016");
        java.lang.String str44 = locale43.getCountry();
        boolean boolean45 = locale43.hasExtensions();
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone38, locale43);
        java.lang.String str47 = locale43.getDisplayScript();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar46", (calendar18.compareTo(calendar46) == 0) == calendar18.equals(calendar46));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Calendar.Builder builder3 = builder0.setLocale(locale1);
        java.util.Calendar.Builder builder7 = builder0.setDate(15, 899, 37);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        timeZone8.setID("DurationField[seconds]");
        java.util.Calendar.Builder builder11 = builder7.setTimeZone(timeZone8);
        timeZone8.setRawOffset(0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone16);
        timeZone16.setID("1970");
        boolean boolean20 = timeZone8.hasSameRules(timeZone16);
        java.util.TimeZone.setDefault(timeZone8);
        timeZone8.setID("2022-02-21T14:56:07.404+00:00:00.016");
        org.joda.time.Period period28 = new org.joda.time.Period(12, 16, 14, (int) '#');
        org.joda.time.Period period30 = period28.multipliedBy(53);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period34 = org.joda.time.Period.minutes(1);
        java.lang.String str35 = period34.toString();
        org.joda.time.Period period36 = period32.withFields((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Period period38 = period36.plusMillis(100);
        org.joda.time.Period period39 = period36.negated();
        org.joda.time.Period period41 = period36.plusYears(45);
        org.joda.time.Period period43 = period36.withDays(16);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 10, chronology45);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Chronology chronology48 = null;
        mutablePeriod46.setPeriod(readableDuration47, chronology48);
        mutablePeriod46.setWeeks(47);
        org.joda.time.ReadableInterval readableInterval52 = null;
        mutablePeriod46.add(readableInterval52);
        mutablePeriod46.addMinutes((int) (byte) 1);
        java.lang.Object obj56 = mutablePeriod46.clone();
        org.joda.time.TimeOfDay timeOfDay61 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray62 = timeOfDay61.getFields();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateTime dateTime64 = timeOfDay61.toDateTimeToday(dateTimeZone63);
        org.joda.time.DateTime.Property property65 = dateTime64.monthOfYear();
        org.joda.time.DateTime dateTime67 = dateTime64.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = dateTime67.toDateTime(chronology68);
        int int70 = dateTime67.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType72 = dateTimeFieldType71.getDurationType();
        org.joda.time.DateTime dateTime74 = dateTime67.withFieldAdded(durationFieldType72, (int) (byte) 1);
        mutablePeriod46.add(durationFieldType72, 50);
        boolean boolean77 = period43.isSupported(durationFieldType72);
        int int78 = period28.indexOf(durationFieldType72);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone81 = dateTimeZone80.toTimeZone();
        java.util.Calendar calendar82 = java.util.Calendar.getInstance(timeZone81);
        java.util.Locale locale83 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale84 = java.util.Locale.KOREAN;
        java.util.Locale locale86 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str87 = locale84.getDisplayVariant(locale86);
        java.util.Set<java.lang.String> strSet88 = locale86.getUnicodeLocaleAttributes();
        java.lang.String str89 = locale83.getDisplayName(locale86);
        java.util.Calendar calendar90 = java.util.Calendar.getInstance(timeZone81, locale83);
        boolean boolean91 = period28.equals((java.lang.Object) locale83);
        java.lang.String str92 = timeZone8.getDisplayName(locale83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar82", (calendar17.compareTo(calendar82) == 0) == calendar17.equals(calendar82));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 1899, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtCurrentTime(dateTimeZone14);
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str21 = dateTimeZone20.getID();
        org.joda.time.Interval interval22 = yearMonthDay18.toInterval(dateTimeZone20);
        org.joda.time.Interval interval23 = yearMonthDay18.toInterval();
        boolean boolean24 = interval23.isAfterNow();
        org.joda.time.Period period25 = interval23.toPeriod();
        org.joda.time.DateTime dateTime26 = interval23.getEnd();
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime26);
        mutableDateTime3.setTime((-31449600000L));
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime3.toMutableDateTimeISO();
        mutableDateTime30.setWeekOfWeekyear(20);
        mutableDateTime30.addHours(1900);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str37 = dateTimeZone36.getID();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime41 = dateTime38.withField(dateTimeFieldType39, 44);
        org.joda.time.DateTime dateTime43 = dateTime41.withSecondOfMinute((int) '4');
        int int44 = dateTime41.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours(3);
        org.joda.time.DateTime dateTime47 = dateTime41.withZone(dateTimeZone46);
        int int48 = mutableDateTime30.compareTo((org.joda.time.ReadableInstant) dateTime47);
        mutableDateTime30.setSecondOfDay(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and dateTime47", (dateTime41.compareTo(dateTime47) == 0) == dateTime41.equals(dateTime47));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.TimeZone.setDefault(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone8);
        int int10 = calendar9.getWeekYear();
        org.joda.time.YearMonthDay yearMonthDay11 = org.joda.time.YearMonthDay.fromCalendarFields(calendar9);
        java.util.TimeZone timeZone12 = calendar9.getTimeZone();
        timeZone12.setRawOffset(2012);
        timeZone12.setRawOffset(21);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone12);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone12);
        calendar5.setTimeZone(timeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar9", (calendar4.compareTo(calendar9) == 0) == calendar4.equals(calendar9));
    }
}

