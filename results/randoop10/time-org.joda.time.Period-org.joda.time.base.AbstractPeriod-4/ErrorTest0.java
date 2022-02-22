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
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Days days2 = org.joda.time.Days.daysIn(readableInterval1);
        org.joda.time.Duration duration3 = days2.toStandardDuration();
        org.joda.time.Duration duration4 = duration3.toDuration();
        org.joda.time.ReadableDuration readableDuration5 = null;
        boolean boolean6 = duration4.isLongerThan(readableDuration5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.daysIn(readableInterval7);
        org.joda.time.Duration duration9 = days8.toStandardDuration();
        org.joda.time.Duration duration10 = duration9.toDuration();
        org.joda.time.ReadableDuration readableDuration11 = null;
        boolean boolean12 = duration10.isLongerThan(readableDuration11);
        boolean boolean13 = duration4.isShorterThan((org.joda.time.ReadableDuration) duration10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMillis((int) ' ');
        int int18 = dateTime15.getEra();
        org.joda.time.DateTime dateTime20 = dateTime15.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval23 = duration4.toIntervalTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Period period24 = duration4.toPeriod();
        long long25 = duration4.getStandardSeconds();
        org.joda.time.Instant instant27 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration4, 2022);
        org.joda.time.ReadableInterval readableInterval28 = null;
        org.joda.time.Days days29 = org.joda.time.Days.daysIn(readableInterval28);
        org.joda.time.Duration duration30 = days29.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.Days days32 = org.joda.time.Days.daysIn(readableInterval31);
        org.joda.time.Duration duration33 = days32.toStandardDuration();
        org.joda.time.Duration duration34 = duration33.toDuration();
        org.joda.time.ReadableDuration readableDuration35 = null;
        boolean boolean36 = duration34.isLongerThan(readableDuration35);
        org.joda.time.Duration duration38 = duration30.withDurationAdded(readableDuration35, (int) (byte) 100);
        org.joda.time.Instant instant40 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration30, (-1));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant40", (dateTime15.compareTo(instant40) == 0) == dateTime15.equals(instant40));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant0.toMutableDateTime();
        java.lang.String str5 = instant0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime4", (instant0.compareTo(mutableDateTime4) == 0) == instant0.equals(mutableDateTime4));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Days days2 = org.joda.time.Days.daysIn(readableInterval1);
        org.joda.time.Duration duration3 = days2.toStandardDuration();
        org.joda.time.Duration duration4 = duration3.toDuration();
        org.joda.time.ReadableDuration readableDuration5 = null;
        boolean boolean6 = duration4.isLongerThan(readableDuration5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.daysIn(readableInterval7);
        org.joda.time.Duration duration9 = days8.toStandardDuration();
        org.joda.time.Duration duration10 = duration9.toDuration();
        org.joda.time.ReadableDuration readableDuration11 = null;
        boolean boolean12 = duration10.isLongerThan(readableDuration11);
        boolean boolean13 = duration4.isShorterThan((org.joda.time.ReadableDuration) duration10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMillis((int) ' ');
        int int18 = dateTime15.getEra();
        org.joda.time.DateTime dateTime20 = dateTime15.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval23 = duration4.toIntervalTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Period period24 = duration4.toPeriod();
        long long25 = duration4.getStandardSeconds();
        org.joda.time.Instant instant27 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration4, 2022);
        long long28 = instant27.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant27 and dateTime15", (instant27.compareTo(dateTime15) == 0) == instant27.equals(dateTime15));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusYears((int) '4');
        org.joda.time.DateTime.Property property8 = dateTime5.dayOfWeek();
        org.joda.time.DateTime dateTime11 = dateTime5.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property12 = dateTime5.minuteOfHour();
        org.joda.time.DateTime dateTime14 = dateTime5.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        long long18 = dateTimeZone15.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMillis((int) ' ');
        int int23 = dateTime20.getEra();
        org.joda.time.DateTime dateTime25 = dateTime20.minusMinutes((int) (short) 1);
        int int26 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime20.getZone();
        org.joda.time.ReadableInterval readableInterval28 = null;
        org.joda.time.Days days29 = org.joda.time.Days.daysIn(readableInterval28);
        org.joda.time.Duration duration30 = days29.toStandardDuration();
        org.joda.time.Duration duration31 = duration30.toDuration();
        org.joda.time.ReadableDuration readableDuration32 = null;
        boolean boolean33 = duration31.isLongerThan(readableDuration32);
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.Days days35 = org.joda.time.Days.daysIn(readableInterval34);
        org.joda.time.Duration duration36 = days35.toStandardDuration();
        org.joda.time.Duration duration37 = duration36.toDuration();
        org.joda.time.ReadableDuration readableDuration38 = null;
        boolean boolean39 = duration37.isLongerThan(readableDuration38);
        boolean boolean40 = duration31.isShorterThan((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusMillis((int) ' ');
        int int45 = dateTime42.getEra();
        org.joda.time.DateTime dateTime47 = dateTime42.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime49 = dateTime42.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval50 = duration31.toIntervalTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration51 = duration31.toDuration();
        org.joda.time.Duration duration53 = duration51.plus((-78382080000000L));
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableDuration) duration53);
        org.joda.time.Duration duration55 = org.joda.time.Duration.ZERO;
        int int56 = duration53.compareTo((org.joda.time.ReadableDuration) duration55);
        org.joda.time.Instant instant57 = instant3.plus((org.joda.time.ReadableDuration) duration55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant57 and dateTime5", (instant57.compareTo(dateTime5) == 0) == instant57.equals(dateTime5));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Days days2 = org.joda.time.Days.daysIn(readableInterval1);
        org.joda.time.Duration duration3 = days2.toStandardDuration();
        org.joda.time.Duration duration4 = duration3.toDuration();
        org.joda.time.ReadableDuration readableDuration5 = null;
        boolean boolean6 = duration4.isLongerThan(readableDuration5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.daysIn(readableInterval7);
        org.joda.time.Duration duration9 = days8.toStandardDuration();
        org.joda.time.Duration duration10 = duration9.toDuration();
        org.joda.time.ReadableDuration readableDuration11 = null;
        boolean boolean12 = duration10.isLongerThan(readableDuration11);
        boolean boolean13 = duration4.isShorterThan((org.joda.time.ReadableDuration) duration10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMillis((int) ' ');
        int int18 = dateTime15.getEra();
        org.joda.time.DateTime dateTime20 = dateTime15.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval23 = duration4.toIntervalTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Period period24 = duration4.toPeriod();
        long long25 = duration4.getStandardSeconds();
        org.joda.time.Instant instant27 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration4, 2022);
        org.joda.time.Duration duration29 = duration4.withMillis(99999L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime15", (instant0.compareTo(dateTime15) == 0) == instant0.equals(dateTime15));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        int int8 = dateTime5.getEra();
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime5.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime31 = dateTime27.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime25, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime34 = dateTime27.plusDays(1);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.DateTime.Property property37 = dateTime36.dayOfMonth();
        org.joda.time.DateTime dateTime38 = property37.roundFloorCopy();
        org.joda.time.DateTime dateTime40 = dateTime38.plus(4320000001L);
        org.joda.time.Instant instant41 = new org.joda.time.Instant();
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) instant41);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime48 = org.joda.time.DateTime.now(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.minusMillis((int) ' ');
        int int51 = dateTime48.getEra();
        int int52 = dateTime46.compareTo((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.plusYears((int) '4');
        org.joda.time.DateTime.Property property57 = dateTime54.dayOfWeek();
        org.joda.time.DateTime dateTime60 = dateTime54.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property61 = dateTime54.minuteOfHour();
        org.joda.time.DateTime dateTime63 = dateTime54.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone64 = dateTime63.getZone();
        long long67 = dateTimeZone64.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime68 = dateTime48.toMutableDateTime(dateTimeZone64);
        org.joda.time.ReadableInterval readableInterval69 = null;
        org.joda.time.Days days70 = org.joda.time.Days.daysIn(readableInterval69);
        org.joda.time.Duration duration71 = days70.toStandardDuration();
        org.joda.time.Duration duration72 = duration71.toDuration();
        org.joda.time.ReadableDuration readableDuration73 = null;
        boolean boolean74 = duration72.isLongerThan(readableDuration73);
        org.joda.time.ReadableInterval readableInterval75 = null;
        org.joda.time.Days days76 = org.joda.time.Days.daysIn(readableInterval75);
        org.joda.time.Duration duration77 = days76.toStandardDuration();
        org.joda.time.Duration duration78 = duration77.toDuration();
        org.joda.time.ReadableDuration readableDuration79 = null;
        boolean boolean80 = duration78.isLongerThan(readableDuration79);
        boolean boolean81 = duration72.isShorterThan((org.joda.time.ReadableDuration) duration78);
        org.joda.time.ReadableInterval readableInterval82 = null;
        org.joda.time.Days days83 = org.joda.time.Days.daysIn(readableInterval82);
        org.joda.time.Duration duration84 = days83.toStandardDuration();
        org.joda.time.Duration duration85 = duration84.toDuration();
        boolean boolean86 = duration78.isLongerThan((org.joda.time.ReadableDuration) duration85);
        org.joda.time.PeriodType periodType87 = org.joda.time.PeriodType.weeks();
        org.joda.time.Period period88 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime68, (org.joda.time.ReadableDuration) duration85, periodType87);
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime40, periodType87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant41", (dateTime1.compareTo(instant41) == 0) == dateTime1.equals(instant41));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean1 = instant0.isAfterNow();
        org.joda.time.Instant instant3 = instant0.withMillis((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        int int8 = dateTime5.getEra();
        org.joda.time.DateTime.Property property9 = dateTime5.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Days days11 = org.joda.time.Days.daysIn(readableInterval10);
        org.joda.time.Duration duration12 = days11.toStandardDuration();
        org.joda.time.Duration duration13 = duration12.toDuration();
        org.joda.time.DateTime dateTime15 = dateTime5.withDurationAdded((org.joda.time.ReadableDuration) duration13, (-1));
        long long16 = duration13.getMillis();
        org.joda.time.Instant instant17 = instant3.plus((org.joda.time.ReadableDuration) duration13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime5", (instant0.compareTo(dateTime5) == 0) == instant0.equals(dateTime5));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Days days2 = org.joda.time.Days.daysIn(readableInterval1);
        org.joda.time.Duration duration3 = days2.toStandardDuration();
        org.joda.time.Duration duration4 = duration3.toDuration();
        org.joda.time.ReadableDuration readableDuration5 = null;
        boolean boolean6 = duration4.isLongerThan(readableDuration5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.daysIn(readableInterval7);
        org.joda.time.Duration duration9 = days8.toStandardDuration();
        org.joda.time.Duration duration10 = duration9.toDuration();
        org.joda.time.ReadableDuration readableDuration11 = null;
        boolean boolean12 = duration10.isLongerThan(readableDuration11);
        boolean boolean13 = duration4.isShorterThan((org.joda.time.ReadableDuration) duration10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMillis((int) ' ');
        int int18 = dateTime15.getEra();
        org.joda.time.DateTime dateTime20 = dateTime15.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval23 = duration4.toIntervalTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Period period24 = duration4.toPeriod();
        long long25 = duration4.getStandardSeconds();
        org.joda.time.Instant instant27 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration4, 2022);
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardMinutes((long) 3);
        org.joda.time.Instant instant31 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration29, 765);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant0", (dateTime15.compareTo(instant0) == 0) == dateTime15.equals(instant0));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 40, 0);
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Days days9 = org.joda.time.Days.daysIn(readableInterval8);
        org.joda.time.Duration duration10 = days9.toStandardDuration();
        org.joda.time.Duration duration11 = duration10.toDuration();
        org.joda.time.ReadableDuration readableDuration12 = null;
        boolean boolean13 = duration11.isLongerThan(readableDuration12);
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.Days days15 = org.joda.time.Days.daysIn(readableInterval14);
        org.joda.time.Duration duration16 = days15.toStandardDuration();
        org.joda.time.Duration duration17 = duration16.toDuration();
        org.joda.time.ReadableDuration readableDuration18 = null;
        boolean boolean19 = duration17.isLongerThan(readableDuration18);
        boolean boolean20 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMillis((int) ' ');
        int int25 = dateTime22.getEra();
        org.joda.time.DateTime dateTime27 = dateTime22.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime29 = dateTime22.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval30 = duration11.toIntervalTo((org.joda.time.ReadableInstant) dateTime22);
        mutablePeriod7.add((org.joda.time.ReadableInterval) interval30);
        org.joda.time.Period period34 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod35 = period34.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval36 = null;
        org.joda.time.Days days37 = org.joda.time.Days.daysIn(readableInterval36);
        org.joda.time.Duration duration38 = days37.toStandardDuration();
        org.joda.time.Duration duration39 = duration38.toDuration();
        org.joda.time.ReadableDuration readableDuration40 = null;
        boolean boolean41 = duration39.isLongerThan(readableDuration40);
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.Days days43 = org.joda.time.Days.daysIn(readableInterval42);
        org.joda.time.Duration duration44 = days43.toStandardDuration();
        org.joda.time.Duration duration45 = duration44.toDuration();
        org.joda.time.ReadableDuration readableDuration46 = null;
        boolean boolean47 = duration45.isLongerThan(readableDuration46);
        boolean boolean48 = duration39.isShorterThan((org.joda.time.ReadableDuration) duration45);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.minusMillis((int) ' ');
        int int53 = dateTime50.getEra();
        org.joda.time.DateTime dateTime55 = dateTime50.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime57 = dateTime50.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval58 = duration39.toIntervalTo((org.joda.time.ReadableInstant) dateTime50);
        mutablePeriod35.add((org.joda.time.ReadableInterval) interval58);
        boolean boolean60 = interval30.isBefore((org.joda.time.ReadableInterval) interval58);
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Period period62 = interval30.toPeriod(periodType61);
        org.joda.time.Duration duration63 = interval30.toDuration();
        org.joda.time.Duration duration64 = duration63.toDuration();
        org.joda.time.Instant instant66 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration64, (-2147483213));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant66 and dateTime22", (instant66.compareTo(dateTime22) == 0) == instant66.equals(dateTime22));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.seconds();
        org.joda.time.Period period4 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.Period period8 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        org.joda.time.Period period11 = period8.plusMinutes((int) (byte) 0);
        mutablePeriod5.mergePeriod((org.joda.time.ReadablePeriod) period8);
        mutablePeriod5.addMonths((int) 'u');
        mutablePeriod5.addHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusYears((int) '4');
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfWeek();
        org.joda.time.DateTime dateTime27 = dateTime21.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property28 = dateTime21.secondOfMinute();
        org.joda.time.Chronology chronology29 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.dayOfMonth();
        org.joda.time.Period period31 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology29);
        org.joda.time.DurationField durationField32 = chronology29.months();
        mutablePeriod5.setPeriod((long) 1814400, chronology29);
        org.joda.time.DurationField durationField34 = chronology29.months();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(87350400000L, periodType1, chronology29);
        org.joda.time.DateTimeField dateTimeField36 = chronology29.weekyearOfCentury();
        org.joda.time.DurationField durationField37 = chronology29.weeks();
        org.joda.time.DurationField durationField38 = chronology29.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField38, durationField32, and durationField37", !(durationField38.compareTo(durationField32) == 0) || (Math.signum(durationField38.compareTo(durationField37)) == Math.signum(durationField32.compareTo(durationField37))));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime dateTime9 = dateTime7.withYear((int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMillis((int) ' ');
        int int22 = dateTime19.getEra();
        int int23 = dateTime17.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusYears((int) '4');
        org.joda.time.DateTime.Property property28 = dateTime25.dayOfWeek();
        org.joda.time.DateTime dateTime31 = dateTime25.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property32 = dateTime25.minuteOfHour();
        org.joda.time.DateTime dateTime34 = dateTime25.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime34.getZone();
        long long38 = dateTimeZone35.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime19.toMutableDateTime(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime45 = dateTime41.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime39, (org.joda.time.ReadableInstant) dateTime41);
        boolean boolean47 = dateTime11.isBefore((org.joda.time.ReadableInstant) dateTime41);
        boolean boolean48 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Instant instant49 = new org.joda.time.Instant();
        boolean boolean51 = instant49.isEqual(10L);
        org.joda.time.Instant instant52 = instant49.toInstant();
        org.joda.time.Instant instant54 = instant49.minus((long) 'u');
        org.joda.time.Instant instant56 = instant49.withMillis(4518960357L);
        org.joda.time.Weeks weeks57 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) instant49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant49", (dateTime1.compareTo(instant49) == 0) == dateTime1.equals(instant49));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime1.withZone(dateTimeZone2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus(4320000001L);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) instant12);
        int int14 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) instant12);
        org.joda.time.MutableDateTime mutableDateTime15 = instant12.toMutableDateTime();
        int int16 = mutableDateTime15.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant12", (dateTime1.compareTo(instant12) == 0) == dateTime1.equals(instant12));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Days days5 = org.joda.time.Days.daysIn(readableInterval4);
        org.joda.time.Duration duration6 = days5.toStandardDuration();
        org.joda.time.Duration duration7 = duration6.toDuration();
        org.joda.time.ReadableDuration readableDuration8 = null;
        boolean boolean9 = duration7.isLongerThan(readableDuration8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Days days11 = org.joda.time.Days.daysIn(readableInterval10);
        org.joda.time.Duration duration12 = days11.toStandardDuration();
        org.joda.time.Duration duration13 = duration12.toDuration();
        org.joda.time.ReadableDuration readableDuration14 = null;
        boolean boolean15 = duration13.isLongerThan(readableDuration14);
        boolean boolean16 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMillis((int) ' ');
        int int21 = dateTime18.getEra();
        org.joda.time.DateTime dateTime23 = dateTime18.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime25 = dateTime18.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval26 = duration7.toIntervalTo((org.joda.time.ReadableInstant) dateTime18);
        mutablePeriod3.add((org.joda.time.ReadableInterval) interval26);
        mutablePeriod3.addYears((int) ' ');
        mutablePeriod3.setSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusYears((int) '4');
        org.joda.time.DateTime.Property property37 = dateTime34.dayOfWeek();
        org.joda.time.DateTime dateTime40 = dateTime34.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property41 = dateTime34.minuteOfHour();
        org.joda.time.DateTime dateTime42 = dateTime34.toDateTime();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableDuration32, (org.joda.time.ReadableInstant) dateTime34);
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod43);
        org.joda.time.DurationFieldType durationFieldType45 = org.joda.time.DurationFieldType.seconds();
        mutablePeriod43.add(durationFieldType45, (int) (short) 100);
        mutablePeriod43.addSeconds((int) '#');
        org.joda.time.Period period52 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod53 = period52.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval54 = null;
        org.joda.time.Days days55 = org.joda.time.Days.daysIn(readableInterval54);
        org.joda.time.Duration duration56 = days55.toStandardDuration();
        org.joda.time.Duration duration57 = duration56.toDuration();
        org.joda.time.ReadableDuration readableDuration58 = null;
        boolean boolean59 = duration57.isLongerThan(readableDuration58);
        org.joda.time.ReadableInterval readableInterval60 = null;
        org.joda.time.Days days61 = org.joda.time.Days.daysIn(readableInterval60);
        org.joda.time.Duration duration62 = days61.toStandardDuration();
        org.joda.time.Duration duration63 = duration62.toDuration();
        org.joda.time.ReadableDuration readableDuration64 = null;
        boolean boolean65 = duration63.isLongerThan(readableDuration64);
        boolean boolean66 = duration57.isShorterThan((org.joda.time.ReadableDuration) duration63);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime68 = org.joda.time.DateTime.now(dateTimeZone67);
        org.joda.time.DateTime dateTime70 = dateTime68.minusMillis((int) ' ');
        int int71 = dateTime68.getEra();
        org.joda.time.DateTime dateTime73 = dateTime68.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime75 = dateTime68.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval76 = duration57.toIntervalTo((org.joda.time.ReadableInstant) dateTime68);
        mutablePeriod53.add((org.joda.time.ReadableInterval) interval76);
        long long78 = interval76.getStartMillis();
        long long79 = interval76.toDurationMillis();
        mutablePeriod43.setPeriod((org.joda.time.ReadableInterval) interval76);
        mutablePeriod43.addHours((-4110));
        org.joda.time.DateTimeZone dateTimeZone84 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime86 = org.joda.time.DateTime.now(dateTimeZone85);
        org.joda.time.DateTime dateTime88 = dateTime86.plusYears((int) '4');
        org.joda.time.DateTime dateTime89 = dateTime88.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property90 = dateTime88.yearOfCentury();
        org.joda.time.DateTime dateTime91 = property90.withMinimumValue();
        boolean boolean92 = dateTimeZone84.equals((java.lang.Object) dateTime91);
        org.joda.time.DateTime dateTime93 = new org.joda.time.DateTime(dateTimeZone84);
        org.joda.time.ReadableInstant readableInstant94 = null;
        mutablePeriod43.setPeriod((org.joda.time.ReadableInstant) dateTime93, readableInstant94);
        mutablePeriod43.addDays(3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime68 and dateTime93", (dateTime68.compareTo(dateTime93) == 0) == dateTime68.equals(dateTime93));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField11 = chronology9.weeks();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology9.getZone();
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.TWO;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks16 = weeks14.plus(0);
        org.joda.time.Weeks weeks18 = weeks16.minus(3);
        org.joda.time.Weeks weeks19 = weeks13.plus(weeks18);
        int[] intArray21 = chronology9.get((org.joda.time.ReadablePeriod) weeks19, (long) (byte) 100);
        org.joda.time.DateTimeField dateTimeField22 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField23 = chronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = chronology9.clockhourOfDay();
        org.joda.time.DurationField durationField25 = chronology9.eras();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.plusYears((int) '4');
        org.joda.time.DateTime.Property property30 = dateTime27.dayOfWeek();
        org.joda.time.DateTime dateTime33 = dateTime27.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property34 = dateTime27.secondOfMinute();
        org.joda.time.Chronology chronology35 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime42 = dateTime38.minusMinutes((int) '#');
        org.joda.time.ReadableInterval readableInterval43 = null;
        org.joda.time.Days days44 = org.joda.time.Days.daysIn(readableInterval43);
        org.joda.time.Duration duration45 = days44.toStandardDuration();
        org.joda.time.Duration duration46 = duration45.toDuration();
        org.joda.time.ReadableDuration readableDuration47 = null;
        boolean boolean48 = duration46.isLongerThan(readableDuration47);
        org.joda.time.ReadableInterval readableInterval49 = null;
        org.joda.time.Days days50 = org.joda.time.Days.daysIn(readableInterval49);
        org.joda.time.Duration duration51 = days50.toStandardDuration();
        org.joda.time.Duration duration52 = duration51.toDuration();
        org.joda.time.ReadableDuration readableDuration53 = null;
        boolean boolean54 = duration52.isLongerThan(readableDuration53);
        boolean boolean55 = duration46.isShorterThan((org.joda.time.ReadableDuration) duration52);
        org.joda.time.PeriodType periodType56 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableDuration) duration52, periodType56);
        org.joda.time.LocalDate localDate58 = dateTime42.toLocalDate();
        long long60 = chronology35.set((org.joda.time.ReadablePartial) localDate58, 1100L);
        long long62 = chronology9.set((org.joda.time.ReadablePartial) localDate58, 1130112000000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField25", Math.signum(durationField11.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField11)));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Days days2 = org.joda.time.Days.daysIn(readableInterval1);
        org.joda.time.Duration duration3 = days2.toStandardDuration();
        org.joda.time.Duration duration4 = duration3.toDuration();
        org.joda.time.ReadableDuration readableDuration5 = null;
        boolean boolean6 = duration4.isLongerThan(readableDuration5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.daysIn(readableInterval7);
        org.joda.time.Duration duration9 = days8.toStandardDuration();
        org.joda.time.Duration duration10 = duration9.toDuration();
        org.joda.time.ReadableDuration readableDuration11 = null;
        boolean boolean12 = duration10.isLongerThan(readableDuration11);
        boolean boolean13 = duration4.isShorterThan((org.joda.time.ReadableDuration) duration10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMillis((int) ' ');
        int int18 = dateTime15.getEra();
        org.joda.time.DateTime dateTime20 = dateTime15.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval23 = duration4.toIntervalTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Period period24 = duration4.toPeriod();
        long long25 = duration4.getStandardSeconds();
        org.joda.time.Instant instant27 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration4, 2022);
        org.joda.time.Instant instant29 = instant0.minus(26194762L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant0", (dateTime15.compareTo(instant0) == 0) == dateTime15.equals(instant0));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime5 = dateTime1.minusMinutes((int) '#');
        java.lang.String str6 = dateTime5.toString();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Days days9 = org.joda.time.Days.daysIn(readableInterval8);
        org.joda.time.Duration duration10 = days9.toStandardDuration();
        org.joda.time.Instant instant12 = instant7.withDurationAdded((org.joda.time.ReadableDuration) duration10, 9);
        org.joda.time.Duration duration13 = duration10.toDuration();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant7", (dateTime5.compareTo(instant7) == 0) == dateTime5.equals(instant7));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant4 = instant0.minus(87350400000L);
        org.joda.time.Duration duration6 = org.joda.time.Duration.parse("PT2147483647S");
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.daysIn(readableInterval7);
        org.joda.time.Duration duration9 = days8.toStandardDuration();
        org.joda.time.Duration duration10 = duration9.toDuration();
        boolean boolean11 = duration6.isLongerThan((org.joda.time.ReadableDuration) duration9);
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Days days13 = org.joda.time.Days.daysIn(readableInterval12);
        org.joda.time.Duration duration14 = days13.toStandardDuration();
        org.joda.time.Duration duration15 = duration14.toDuration();
        org.joda.time.ReadableDuration readableDuration16 = null;
        boolean boolean17 = duration15.isLongerThan(readableDuration16);
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.Days days19 = org.joda.time.Days.daysIn(readableInterval18);
        org.joda.time.Duration duration20 = days19.toStandardDuration();
        org.joda.time.Duration duration21 = duration20.toDuration();
        org.joda.time.ReadableDuration readableDuration22 = null;
        boolean boolean23 = duration21.isLongerThan(readableDuration22);
        boolean boolean24 = duration15.isShorterThan((org.joda.time.ReadableDuration) duration21);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMillis((int) ' ');
        int int29 = dateTime26.getEra();
        org.joda.time.DateTime dateTime31 = dateTime26.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime33 = dateTime26.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval34 = duration15.toIntervalTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Duration duration35 = duration15.toDuration();
        boolean boolean36 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration35);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        java.lang.String str40 = dateTimeZone38.getID();
        long long42 = dateTimeZone38.previousTransition((long) (short) 0);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 1, dateTimeZone38);
        org.joda.time.Interval interval44 = duration9.toIntervalTo((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Instant instant45 = instant0.plus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.DateTimeZone dateTimeZone46 = instant0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant0", (dateTime26.compareTo(instant0) == 0) == dateTime26.equals(instant0));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property7 = dateTime5.yearOfCentury();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) dateTime8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime10", (dateTime3.compareTo(dateTime10) == 0) == dateTime3.equals(dateTime10));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTimeISO();
        org.joda.time.Hours hours2 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours3 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours4 = hours2.plus(hours3);
        org.joda.time.Hours hours5 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours6 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours7 = hours5.plus(hours6);
        org.joda.time.Hours hours8 = hours3.minus(hours6);
        org.joda.time.Duration duration9 = hours8.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMillis((int) ' ');
        int int18 = dateTime15.getEra();
        int int19 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Period period20 = duration9.toPeriodTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMillis((int) ' ');
        int int29 = dateTime26.getEra();
        int int30 = dateTime24.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMillis((int) ' ');
        org.joda.time.Duration duration35 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime.Property property38 = dateTime37.dayOfMonth();
        org.joda.time.DateTime dateTime39 = property38.roundFloorCopy();
        org.joda.time.DateTime.Property property40 = dateTime39.millisOfDay();
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.yearDay();
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.halfdays();
        int int43 = periodType41.indexOf(durationFieldType42);
        org.joda.time.PeriodType periodType44 = periodType41.withWeeksRemoved();
        int int45 = periodType44.size();
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration35, (org.joda.time.ReadableInstant) dateTime39, periodType44);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.weeks();
        org.joda.time.Period period48 = period46.normalizedStandard(periodType47);
        org.joda.time.PeriodType periodType49 = periodType47.withDaysRemoved();
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableDuration) duration9, periodType47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Days days5 = org.joda.time.Days.daysIn(readableInterval4);
        org.joda.time.Duration duration6 = days5.toStandardDuration();
        org.joda.time.Duration duration7 = duration6.toDuration();
        org.joda.time.ReadableDuration readableDuration8 = null;
        boolean boolean9 = duration7.isLongerThan(readableDuration8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Days days11 = org.joda.time.Days.daysIn(readableInterval10);
        org.joda.time.Duration duration12 = days11.toStandardDuration();
        org.joda.time.Duration duration13 = duration12.toDuration();
        org.joda.time.ReadableDuration readableDuration14 = null;
        boolean boolean15 = duration13.isLongerThan(readableDuration14);
        boolean boolean16 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMillis((int) ' ');
        int int21 = dateTime18.getEra();
        org.joda.time.DateTime dateTime23 = dateTime18.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime25 = dateTime18.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval26 = duration7.toIntervalTo((org.joda.time.ReadableInstant) dateTime18);
        mutablePeriod3.add((org.joda.time.ReadableInterval) interval26);
        int int28 = mutablePeriod3.getMinutes();
        mutablePeriod3.setMinutes(765);
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.Days days32 = org.joda.time.Days.daysIn(readableInterval31);
        org.joda.time.Duration duration33 = days32.toStandardDuration();
        org.joda.time.Duration duration34 = duration33.toDuration();
        org.joda.time.ReadableDuration readableDuration35 = null;
        boolean boolean36 = duration34.isLongerThan(readableDuration35);
        org.joda.time.Duration duration37 = duration34.toDuration();
        org.joda.time.ReadableInterval readableInterval38 = null;
        org.joda.time.Days days39 = org.joda.time.Days.daysIn(readableInterval38);
        org.joda.time.Duration duration40 = days39.toStandardDuration();
        org.joda.time.Duration duration41 = duration40.toDuration();
        org.joda.time.ReadableDuration readableDuration42 = null;
        boolean boolean43 = duration41.isLongerThan(readableDuration42);
        org.joda.time.Duration duration44 = duration41.toDuration();
        org.joda.time.Period period45 = duration41.toPeriod();
        int int46 = duration37.compareTo((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        boolean boolean49 = instant47.isEqual(10L);
        org.joda.time.ReadableInterval readableInterval50 = null;
        org.joda.time.Days days51 = org.joda.time.Days.daysIn(readableInterval50);
        org.joda.time.Duration duration52 = days51.toStandardDuration();
        org.joda.time.Duration duration53 = duration52.toDuration();
        org.joda.time.ReadableDuration readableDuration54 = null;
        boolean boolean55 = duration53.isLongerThan(readableDuration54);
        org.joda.time.Duration duration56 = duration53.toDuration();
        org.joda.time.ReadableInterval readableInterval57 = null;
        org.joda.time.Days days58 = org.joda.time.Days.daysIn(readableInterval57);
        org.joda.time.Duration duration59 = days58.toStandardDuration();
        org.joda.time.Duration duration60 = duration59.toDuration();
        org.joda.time.ReadableDuration readableDuration61 = null;
        boolean boolean62 = duration60.isLongerThan(readableDuration61);
        org.joda.time.Duration duration63 = duration60.toDuration();
        org.joda.time.Period period64 = duration60.toPeriod();
        int int65 = duration56.compareTo((org.joda.time.ReadableDuration) duration60);
        org.joda.time.Instant instant66 = instant47.plus((org.joda.time.ReadableDuration) duration60);
        org.joda.time.Duration duration68 = duration37.withDurationAdded((org.joda.time.ReadableDuration) duration60, 26185);
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant47", (dateTime18.compareTo(instant47) == 0) == dateTime18.equals(instant47));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.lang.String str6 = locale5.toLanguageTag();
        java.lang.String str7 = locale5.getDisplayScript();
        java.lang.String str8 = locale5.toLanguageTag();
        java.util.Calendar calendar9 = dateTime4.toCalendar(locale5);
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.Days days15 = org.joda.time.Days.daysIn(readableInterval14);
        org.joda.time.Duration duration16 = days15.toStandardDuration();
        org.joda.time.Duration duration17 = duration16.toDuration();
        org.joda.time.ReadableDuration readableDuration18 = null;
        boolean boolean19 = duration17.isLongerThan(readableDuration18);
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.Days days21 = org.joda.time.Days.daysIn(readableInterval20);
        org.joda.time.Duration duration22 = days21.toStandardDuration();
        org.joda.time.Duration duration23 = duration22.toDuration();
        org.joda.time.ReadableDuration readableDuration24 = null;
        boolean boolean25 = duration23.isLongerThan(readableDuration24);
        boolean boolean26 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMillis((int) ' ');
        int int31 = dateTime28.getEra();
        org.joda.time.DateTime dateTime33 = dateTime28.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime35 = dateTime28.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval36 = duration17.toIntervalTo((org.joda.time.ReadableInstant) dateTime28);
        mutablePeriod13.add((org.joda.time.ReadableInterval) interval36);
        org.joda.time.Duration duration38 = interval36.toDuration();
        org.joda.time.Period period41 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod42 = period41.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval43 = null;
        org.joda.time.Days days44 = org.joda.time.Days.daysIn(readableInterval43);
        org.joda.time.Duration duration45 = days44.toStandardDuration();
        org.joda.time.Duration duration46 = duration45.toDuration();
        org.joda.time.ReadableDuration readableDuration47 = null;
        boolean boolean48 = duration46.isLongerThan(readableDuration47);
        org.joda.time.ReadableInterval readableInterval49 = null;
        org.joda.time.Days days50 = org.joda.time.Days.daysIn(readableInterval49);
        org.joda.time.Duration duration51 = days50.toStandardDuration();
        org.joda.time.Duration duration52 = duration51.toDuration();
        org.joda.time.ReadableDuration readableDuration53 = null;
        boolean boolean54 = duration52.isLongerThan(readableDuration53);
        boolean boolean55 = duration46.isShorterThan((org.joda.time.ReadableDuration) duration52);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(dateTimeZone56);
        org.joda.time.DateTime dateTime59 = dateTime57.minusMillis((int) ' ');
        int int60 = dateTime57.getEra();
        org.joda.time.DateTime dateTime62 = dateTime57.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime64 = dateTime57.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval65 = duration46.toIntervalTo((org.joda.time.ReadableInstant) dateTime57);
        mutablePeriod42.add((org.joda.time.ReadableInterval) interval65);
        org.joda.time.Period period69 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod70 = period69.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval71 = null;
        org.joda.time.Days days72 = org.joda.time.Days.daysIn(readableInterval71);
        org.joda.time.Duration duration73 = days72.toStandardDuration();
        org.joda.time.Duration duration74 = duration73.toDuration();
        org.joda.time.ReadableDuration readableDuration75 = null;
        boolean boolean76 = duration74.isLongerThan(readableDuration75);
        org.joda.time.ReadableInterval readableInterval77 = null;
        org.joda.time.Days days78 = org.joda.time.Days.daysIn(readableInterval77);
        org.joda.time.Duration duration79 = days78.toStandardDuration();
        org.joda.time.Duration duration80 = duration79.toDuration();
        org.joda.time.ReadableDuration readableDuration81 = null;
        boolean boolean82 = duration80.isLongerThan(readableDuration81);
        boolean boolean83 = duration74.isShorterThan((org.joda.time.ReadableDuration) duration80);
        org.joda.time.DateTimeZone dateTimeZone84 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime85 = org.joda.time.DateTime.now(dateTimeZone84);
        org.joda.time.DateTime dateTime87 = dateTime85.minusMillis((int) ' ');
        int int88 = dateTime85.getEra();
        org.joda.time.DateTime dateTime90 = dateTime85.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime92 = dateTime85.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval93 = duration74.toIntervalTo((org.joda.time.ReadableInstant) dateTime85);
        mutablePeriod70.add((org.joda.time.ReadableInterval) interval93);
        boolean boolean95 = interval65.isBefore((org.joda.time.ReadableInterval) interval93);
        long long96 = interval93.getStartMillis();
        boolean boolean97 = interval36.isBefore((org.joda.time.ReadableInterval) interval93);
        boolean boolean98 = locale5.equals((java.lang.Object) interval93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) 92000);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) '4');
        org.joda.time.DateTime dateTime7 = dateTime3.plusDays(10);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusYears((int) '4');
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime16 = dateTime10.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property17 = dateTime10.secondOfMinute();
        org.joda.time.Chronology chronology18 = dateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.dayOfMonth();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 1, chronology18);
        org.joda.time.DateTime dateTime22 = dateTime3.withChronology(chronology18);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime3, periodType23);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.plusYears((int) '4');
        org.joda.time.DateTime.Property property29 = dateTime26.dayOfWeek();
        org.joda.time.DateTime dateTime32 = dateTime26.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property33 = dateTime26.secondOfMinute();
        org.joda.time.Chronology chronology34 = dateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.dayOfMonth();
        org.joda.time.DurationField durationField36 = chronology34.halfdays();
        org.joda.time.Chronology chronology37 = chronology34.withUTC();
        org.joda.time.DurationField durationField38 = chronology37.halfdays();
        org.joda.time.DateTime dateTime39 = dateTime3.toDateTime(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField36 and durationField38", (durationField36.compareTo(durationField38) == 0) == durationField36.equals(durationField38));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime3 = property2.roundFloorCopy();
        org.joda.time.DateTime dateTime5 = dateTime3.plus(4320000001L);
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) instant6);
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.MAX_VALUE;
        org.joda.time.MutablePeriod mutablePeriod10 = seconds9.toMutablePeriod();
        mutablePeriod10.setMonths((int) (short) 100);
        int int13 = mutablePeriod10.getYears();
        int int14 = mutablePeriod10.getYears();
        mutablePeriod10.addDays((int) (short) 1);
        mutablePeriod10.setDays(55);
        org.joda.time.Period period21 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod22 = period21.toMutablePeriod();
        org.joda.time.Period period25 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod26 = period25.toMutablePeriod();
        org.joda.time.Period period28 = period25.plusMinutes((int) (byte) 0);
        mutablePeriod22.mergePeriod((org.joda.time.ReadablePeriod) period25);
        mutablePeriod22.addMonths((int) 'u');
        mutablePeriod22.addHours((int) (byte) -1);
        org.joda.time.Period period36 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod37 = period36.toMutablePeriod();
        org.joda.time.Period period39 = period36.plusMinutes((int) (byte) 0);
        org.joda.time.Period period41 = period39.plusMonths((int) '4');
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType44 = dateTimeFieldType43.getDurationType();
        boolean boolean45 = periodType42.isSupported(durationFieldType44);
        boolean boolean46 = period39.isSupported(durationFieldType44);
        int int47 = mutablePeriod22.indexOf(durationFieldType44);
        int int48 = mutablePeriod10.get(durationFieldType44);
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.plusYears((int) '4');
        org.joda.time.DateTime.Property property54 = dateTime51.dayOfWeek();
        org.joda.time.DateTime dateTime57 = dateTime51.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property58 = dateTime51.secondOfMinute();
        org.joda.time.Chronology chronology59 = dateTime51.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.dayOfMonth();
        org.joda.time.DurationField durationField61 = durationFieldType49.getField(chronology59);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period((long) 100, chronology63);
        int int65 = period64.getMillis();
        long long68 = chronology59.add((org.joda.time.ReadablePeriod) period64, (long) (short) 100, 40);
        boolean boolean69 = durationFieldType44.isSupported(chronology59);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(0L, chronology59);
        int int71 = dateTime5.compareTo((org.joda.time.ReadableInstant) dateTime70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant6", (dateTime1.compareTo(instant6) == 0) == dateTime1.equals(instant6));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) 28);
        org.joda.time.Duration duration4 = duration1.withDurationAdded(1645512059742L, 100);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        boolean boolean7 = instant5.isEqual(10L);
        org.joda.time.Instant instant8 = instant5.toInstant();
        org.joda.time.Instant instant10 = instant5.minus((long) 'u');
        org.joda.time.Instant instant12 = instant5.withMillis(4518960357L);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMillis((int) ' ');
        int int19 = dateTime16.getEra();
        org.joda.time.DateTime.Property property20 = dateTime16.secondOfMinute();
        org.joda.time.DateTime dateTime21 = property20.roundHalfFloorCopy();
        org.joda.time.Seconds seconds22 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds24 = seconds22.multipliedBy(1);
        boolean boolean25 = property20.equals((java.lang.Object) seconds22);
        org.joda.time.DurationFieldType durationFieldType26 = seconds22.getFieldType();
        org.joda.time.PeriodType periodType27 = seconds22.getPeriodType();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(26177577L, 1645488060000L, periodType27, chronology28);
        org.joda.time.Period period30 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) instant12, periodType27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime16", (instant5.compareTo(dateTime16) == 0) == instant5.equals(dateTime16));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        int int8 = dateTime5.getEra();
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime5.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        int int28 = dateTimeZone26.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime29 = dateTime5.withZone(dateTimeZone26);
        org.joda.time.Instant instant30 = new org.joda.time.Instant();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) instant30);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) (byte) 100, 100L);
        org.joda.time.Period period37 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod38 = period37.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.Days days40 = org.joda.time.Days.daysIn(readableInterval39);
        org.joda.time.Duration duration41 = days40.toStandardDuration();
        org.joda.time.Duration duration42 = duration41.toDuration();
        org.joda.time.ReadableDuration readableDuration43 = null;
        boolean boolean44 = duration42.isLongerThan(readableDuration43);
        org.joda.time.ReadableInterval readableInterval45 = null;
        org.joda.time.Days days46 = org.joda.time.Days.daysIn(readableInterval45);
        org.joda.time.Duration duration47 = days46.toStandardDuration();
        org.joda.time.Duration duration48 = duration47.toDuration();
        org.joda.time.ReadableDuration readableDuration49 = null;
        boolean boolean50 = duration48.isLongerThan(readableDuration49);
        boolean boolean51 = duration42.isShorterThan((org.joda.time.ReadableDuration) duration48);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime53.minusMillis((int) ' ');
        int int56 = dateTime53.getEra();
        org.joda.time.DateTime dateTime58 = dateTime53.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime60 = dateTime53.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval61 = duration42.toIntervalTo((org.joda.time.ReadableInstant) dateTime53);
        mutablePeriod38.add((org.joda.time.ReadableInterval) interval61);
        mutablePeriod38.addYears((int) ' ');
        mutablePeriod38.setSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime69 = org.joda.time.DateTime.now(dateTimeZone68);
        org.joda.time.DateTime dateTime71 = dateTime69.plusYears((int) '4');
        org.joda.time.DateTime.Property property72 = dateTime69.dayOfWeek();
        org.joda.time.DateTime dateTime75 = dateTime69.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property76 = dateTime69.minuteOfHour();
        org.joda.time.DateTime dateTime77 = dateTime69.toDateTime();
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod(readableDuration67, (org.joda.time.ReadableInstant) dateTime69);
        mutablePeriod38.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod78);
        org.joda.time.DurationFieldType durationFieldType80 = org.joda.time.DurationFieldType.seconds();
        mutablePeriod78.add(durationFieldType80, (int) (short) 100);
        boolean boolean83 = mutablePeriod34.isSupported(durationFieldType80);
        mutablePeriod31.set(durationFieldType80, 30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime29", (dateTime1.compareTo(dateTime29) == 0) == dateTime1.equals(dateTime29));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) 28);
        org.joda.time.Duration duration4 = duration1.withDurationAdded(1645512059742L, 100);
        org.joda.time.Duration duration6 = org.joda.time.Duration.parse("PT2147483647S");
        long long7 = duration6.getStandardHours();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMillis((int) ' ');
        int int12 = dateTime9.getEra();
        org.joda.time.DateTime.Property property13 = dateTime9.secondOfMinute();
        org.joda.time.Period period14 = duration6.toPeriodTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime19 = dateTime16.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfHour();
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.Days days22 = org.joda.time.Days.daysIn(readableInterval21);
        org.joda.time.Duration duration23 = days22.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.Days days25 = org.joda.time.Days.daysIn(readableInterval24);
        org.joda.time.Duration duration26 = days25.toStandardDuration();
        org.joda.time.Duration duration27 = duration26.toDuration();
        org.joda.time.ReadableDuration readableDuration28 = null;
        boolean boolean29 = duration27.isLongerThan(readableDuration28);
        org.joda.time.Duration duration31 = duration23.withDurationAdded(readableDuration28, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.minusMillis((int) ' ');
        int int36 = dateTime33.getEra();
        org.joda.time.DateTime.Property property37 = dateTime33.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval38 = null;
        org.joda.time.Days days39 = org.joda.time.Days.daysIn(readableInterval38);
        org.joda.time.Duration duration40 = days39.toStandardDuration();
        org.joda.time.Duration duration41 = duration40.toDuration();
        org.joda.time.DateTime dateTime43 = dateTime33.withDurationAdded((org.joda.time.ReadableDuration) duration41, (-1));
        org.joda.time.DateTime dateTime45 = dateTime33.minusMinutes((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(dateTimeZone46);
        org.joda.time.DateTime dateTime49 = dateTime47.plusYears((int) '4');
        org.joda.time.DateTime.Property property50 = dateTime47.dayOfWeek();
        org.joda.time.DateTime dateTime53 = dateTime47.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property54 = dateTime47.secondOfMinute();
        org.joda.time.Chronology chronology55 = dateTime47.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.dayOfMonth();
        org.joda.time.DurationField durationField57 = chronology55.weeks();
        org.joda.time.DateTimeField dateTimeField58 = chronology55.secondOfMinute();
        int int60 = dateTimeField58.getMinimumValue((long) (byte) 0);
        org.joda.time.ReadablePartial readablePartial61 = null;
        java.util.Locale locale63 = java.util.Locale.KOREA;
        java.lang.String str64 = dateTimeField58.getAsText(readablePartial61, 3, locale63);
        int int65 = dateTime33.get(dateTimeField58);
        org.joda.time.DateTime dateTime67 = dateTime33.minusWeeks(40);
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period69 = duration23.toPeriodFrom((org.joda.time.ReadableInstant) dateTime67, periodType68);
        org.joda.time.Period period70 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateTime19, periodType68);
        org.joda.time.Instant instant72 = new org.joda.time.Instant(1645514124274L);
        org.joda.time.DateTime dateTime73 = instant72.toDateTimeISO();
        int int74 = dateTime19.compareTo((org.joda.time.ReadableInstant) instant72);
        org.joda.time.Interval interval75 = duration1.toIntervalTo((org.joda.time.ReadableInstant) dateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant72 and dateTime73", (instant72.compareTo(dateTime73) == 0) == instant72.equals(dateTime73));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        int int8 = dateTime5.getEra();
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime5.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        int int28 = dateTimeZone26.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime29 = dateTime5.withZone(dateTimeZone26);
        org.joda.time.Instant instant30 = new org.joda.time.Instant();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) instant30);
        org.joda.time.Instant instant33 = instant30.plus((long) 26187);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime29", (dateTime1.compareTo(dateTime29) == 0) == dateTime1.equals(dateTime29));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.lang.String str6 = locale5.toLanguageTag();
        java.lang.String str7 = locale5.getDisplayScript();
        java.lang.String str8 = locale5.toLanguageTag();
        java.util.Calendar calendar9 = dateTime4.toCalendar(locale5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfDay();
        int int19 = property18.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusYears((int) '4');
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfWeek();
        org.joda.time.DateTime dateTime27 = dateTime21.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property28 = dateTime21.minuteOfHour();
        org.joda.time.DateTime dateTime30 = dateTime21.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime30.getZone();
        long long34 = dateTimeZone31.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.minusMillis((int) ' ');
        int int39 = dateTime36.getEra();
        org.joda.time.DateTime dateTime41 = dateTime36.minusMinutes((int) (short) 1);
        int int42 = dateTimeZone31.getOffset((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime36.getZone();
        int int44 = property18.compareTo((org.joda.time.ReadableInstant) dateTime36);
        int int45 = property18.getMaximumValueOverall();
        java.util.Locale.Builder builder46 = new java.util.Locale.Builder();
        java.util.Locale locale47 = builder46.build();
        int int48 = property18.getMaximumShortTextLength(locale47);
        org.joda.time.Period period51 = new org.joda.time.Period(1645514147952L, (long) (short) 0);
        boolean boolean52 = property18.equals((java.lang.Object) 1645514147952L);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property18.getFieldType();
        boolean boolean54 = dateTime4.isSupported(dateTimeFieldType53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField11 = chronology9.halfdays();
        org.joda.time.Chronology chronology12 = chronology9.withUTC();
        org.joda.time.DurationField durationField13 = chronology12.halfdays();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = dateTime15.isSupported(dateTimeFieldType17);
        org.joda.time.DateTime.Property property19 = dateTime15.centuryOfEra();
        org.joda.time.DateTime dateTime21 = property19.addToCopy((int) (short) 1);
        org.joda.time.LocalTime localTime22 = dateTime21.toLocalTime();
        long long24 = chronology12.set((org.joda.time.ReadablePartial) localTime22, 1645514169443L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField13", (durationField11.compareTo(durationField13) == 0) == durationField11.equals(durationField13));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.Duration duration2 = days1.toStandardDuration();
        org.joda.time.Duration duration4 = duration2.withMillis((long) (short) 0);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        boolean boolean7 = instant5.isEqual(10L);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMillis((int) ' ');
        int int16 = dateTime13.getEra();
        int int17 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusYears((int) '4');
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfWeek();
        org.joda.time.DateTime dateTime25 = dateTime19.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property26 = dateTime19.minuteOfHour();
        org.joda.time.DateTime dateTime28 = dateTime19.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime28.getZone();
        long long32 = dateTimeZone29.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime13.toMutableDateTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime39 = dateTime35.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime33, (org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime42 = dateTime35.plusDays(1);
        boolean boolean43 = instant5.equals((java.lang.Object) dateTime42);
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearDay();
        org.joda.time.DurationFieldType durationFieldType45 = org.joda.time.DurationFieldType.halfdays();
        int int46 = periodType44.indexOf(durationFieldType45);
        org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, (org.joda.time.ReadableInstant) dateTime42, periodType44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime9", (instant5.compareTo(dateTime9) == 0) == instant5.equals(dateTime9));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField11 = chronology9.halfdays();
        org.joda.time.Chronology chronology12 = chronology9.withUTC();
        org.joda.time.DurationField durationField13 = chronology12.days();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.minuteOfDay();
        org.joda.time.DurationField durationField15 = chronology12.months();
        org.joda.time.DurationField durationField16 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField11, and durationField13", !(durationField16.compareTo(durationField11) == 0) || (Math.signum(durationField16.compareTo(durationField13)) == Math.signum(durationField11.compareTo(durationField13))));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime1.withZone(dateTimeZone2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus(4320000001L);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) instant12);
        int int14 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) instant12);
        long long16 = dateTimeZone2.nextTransition((long) 8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant12", (dateTime1.compareTo(instant12) == 0) == dateTime1.equals(instant12));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime1.withZone(dateTimeZone2);
        java.util.GregorianCalendar gregorianCalendar5 = dateTime4.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = dateTime11.withZone(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusYears((int) '4');
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        int int22 = property19.compareTo((org.joda.time.ReadableInstant) dateTime21);
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.lang.String str24 = property19.getAsText(locale23);
        java.util.Calendar calendar25 = dateTime11.toCalendar(locale23);
        org.joda.time.DateTime dateTime27 = dateTime11.withEra((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusYears((int) '4');
        org.joda.time.DateTime.Property property32 = dateTime29.dayOfWeek();
        org.joda.time.DateTime dateTime35 = dateTime29.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property36 = dateTime29.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.plusYears((int) '4');
        org.joda.time.DateTime dateTime41 = dateTime40.withTimeAtStartOfDay();
        org.joda.time.Seconds seconds42 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean44 = dateTime40.isSupported(dateTimeFieldType43);
        int int45 = dateTime11.get(dateTimeFieldType43);
        java.lang.String str46 = dateTimeFieldType43.getName();
        int int47 = dateTime7.get(dateTimeFieldType43);
        org.joda.time.DateTime dateTime49 = dateTime7.minusWeeks(292278993);
        boolean boolean50 = dateTime4.isAfter((org.joda.time.ReadableInstant) dateTime49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar5 and calendar25", (gregorianCalendar5.compareTo(calendar25) == 0) == gregorianCalendar5.equals(calendar25));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusYears((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime2.plusDays(10);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusYears((int) '4');
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfWeek();
        org.joda.time.DateTime dateTime15 = dateTime9.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property16 = dateTime9.secondOfMinute();
        org.joda.time.Chronology chronology17 = dateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfMonth();
        org.joda.time.DurationField durationField19 = chronology17.millis();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 1, chronology17);
        org.joda.time.DateTime dateTime21 = dateTime2.withChronology(chronology17);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime27 = dateTime23.minusMinutes((int) '#');
        org.joda.time.ReadableInterval readableInterval28 = null;
        org.joda.time.Days days29 = org.joda.time.Days.daysIn(readableInterval28);
        org.joda.time.Duration duration30 = days29.toStandardDuration();
        org.joda.time.Duration duration31 = duration30.toDuration();
        org.joda.time.ReadableDuration readableDuration32 = null;
        boolean boolean33 = duration31.isLongerThan(readableDuration32);
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.Days days35 = org.joda.time.Days.daysIn(readableInterval34);
        org.joda.time.Duration duration36 = days35.toStandardDuration();
        org.joda.time.Duration duration37 = duration36.toDuration();
        org.joda.time.ReadableDuration readableDuration38 = null;
        boolean boolean39 = duration37.isLongerThan(readableDuration38);
        boolean boolean40 = duration31.isShorterThan((org.joda.time.ReadableDuration) duration37);
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableDuration) duration37, periodType41);
        int int43 = dateTime27.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.plusYears((int) '4');
        org.joda.time.DateTime.Property property48 = dateTime45.dayOfWeek();
        org.joda.time.DateTime dateTime51 = dateTime45.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property52 = dateTime45.minuteOfHour();
        org.joda.time.DateTime dateTime54 = dateTime45.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone55 = dateTime54.getZone();
        long long58 = dateTimeZone55.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime60.minusMillis((int) ' ');
        int int63 = dateTime60.getEra();
        org.joda.time.DateTime dateTime65 = dateTime60.minusMinutes((int) (short) 1);
        int int66 = dateTimeZone55.getOffset((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTimeZone dateTimeZone67 = dateTime60.getZone();
        boolean boolean68 = dateTime27.isEqual((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTime.Property property70 = dateTime2.yearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = null;
        java.lang.String str72 = dateTime2.toString(dateTimeFormatter71);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime74 = org.joda.time.DateTime.now(dateTimeZone73);
        org.joda.time.DateTime.Property property75 = dateTime74.dayOfMonth();
        org.joda.time.DateTime dateTime76 = property75.roundFloorCopy();
        org.joda.time.DateTime.Property property77 = dateTime76.millisOfDay();
        org.joda.time.Chronology chronology78 = dateTime76.getChronology();
        org.joda.time.DurationField durationField79 = chronology78.seconds();
        org.joda.time.DateTime dateTime80 = dateTime2.toDateTime(chronology78);
        org.joda.time.Period period82 = org.joda.time.Period.minutes((int) '4');
        int[] intArray84 = chronology78.get((org.joda.time.ReadablePeriod) period82, (long) 26187);
        org.joda.time.Period period85 = new org.joda.time.Period((long) 42, chronology78);
        org.joda.time.DurationField durationField86 = chronology78.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField86, durationField19, and durationField79", !(durationField86.compareTo(durationField19) == 0) || (Math.signum(durationField86.compareTo(durationField79)) == Math.signum(durationField19.compareTo(durationField79))));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField11 = chronology9.weeks();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.secondOfMinute();
        int int14 = dateTimeField12.getMinimumValue((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMillis((int) ' ');
        int int23 = dateTime20.getEra();
        int int24 = dateTime18.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.plusYears((int) '4');
        org.joda.time.DateTime.Property property29 = dateTime26.dayOfWeek();
        org.joda.time.DateTime dateTime32 = dateTime26.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property33 = dateTime26.minuteOfHour();
        org.joda.time.DateTime dateTime35 = dateTime26.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime35.getZone();
        long long39 = dateTimeZone36.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime20.toMutableDateTime(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime46 = dateTime42.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime40, (org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime49 = dateTime42.plusDays(1);
        org.joda.time.TimeOfDay timeOfDay50 = dateTime49.toTimeOfDay();
        java.lang.Object obj51 = null;
        boolean boolean52 = timeOfDay50.equals(obj51);
        int int53 = timeOfDay50.size();
        int int54 = dateTimeField12.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay50);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime56.plusYears((int) '4');
        org.joda.time.DateTime.Property property59 = dateTime56.dayOfWeek();
        org.joda.time.DateTime dateTime62 = dateTime56.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property63 = dateTime56.minuteOfHour();
        org.joda.time.DateTime dateTime64 = dateTime56.toDateTime();
        java.lang.String str65 = dateTime64.toString();
        org.joda.time.DateMidnight dateMidnight66 = dateTime64.toDateMidnight();
        boolean boolean68 = dateTime64.isAfter((long) 24);
        org.joda.time.DateTime dateTime69 = timeOfDay50.toDateTime((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Chronology chronology70 = dateTime64.getChronology();
        org.joda.time.DurationField durationField71 = chronology70.eras();
        org.joda.time.DurationField durationField72 = chronology70.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField71", Math.signum(durationField11.compareTo(durationField71)) == -Math.signum(durationField71.compareTo(durationField11)));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) '4');
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfWeek();
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property10 = dateTime3.secondOfMinute();
        org.joda.time.Chronology chronology11 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfMonth();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology11);
        org.joda.time.DurationField durationField14 = chronology11.days();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = chronology11.months();
        org.joda.time.DurationField durationField17 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField14, and durationField16", !(durationField17.compareTo(durationField14) == 0) || (Math.signum(durationField17.compareTo(durationField16)) == Math.signum(durationField14.compareTo(durationField16))));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period9 = period6.plusMinutes((int) (byte) 0);
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) period6);
        mutablePeriod3.addMonths((int) 'u');
        mutablePeriod3.addHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusYears((int) '4');
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfWeek();
        org.joda.time.DateTime dateTime25 = dateTime19.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property26 = dateTime19.secondOfMinute();
        org.joda.time.Chronology chronology27 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.dayOfMonth();
        org.joda.time.Period period29 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology27);
        org.joda.time.DurationField durationField30 = chronology27.months();
        mutablePeriod3.setPeriod((long) 1814400, chronology27);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusYears((int) '4');
        org.joda.time.DateTime.Property property37 = dateTime34.dayOfWeek();
        org.joda.time.DateTime dateTime40 = dateTime34.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property41 = dateTime34.secondOfMinute();
        org.joda.time.Chronology chronology42 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.dayOfMonth();
        org.joda.time.DurationField durationField44 = chronology42.weeks();
        org.joda.time.DateTimeField dateTimeField45 = chronology42.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField46 = chronology42.monthOfYear();
        mutablePeriod3.add((long) 74, chronology42);
        org.joda.time.DurationField durationField48 = chronology42.weekyears();
        org.joda.time.DurationField durationField49 = chronology42.years();
        org.joda.time.DurationField durationField50 = chronology42.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField48 and durationField49", (durationField48.compareTo(durationField49) == 0) == durationField48.equals(durationField49));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime1.plusDays(10);
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        boolean boolean8 = instant6.isEqual(10L);
        org.joda.time.Instant instant9 = instant6.toInstant();
        org.joda.time.Instant instant11 = instant6.minus((long) 'u');
        long long12 = instant6.getMillis();
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology14 = instant6.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant6", (dateTime1.compareTo(instant6) == 0) == dateTime1.equals(instant6));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) '4');
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfWeek();
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property10 = dateTime3.secondOfMinute();
        org.joda.time.Chronology chronology11 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfMonth();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology11);
        org.joda.time.DurationField durationField14 = chronology11.months();
        org.joda.time.DurationField durationField15 = chronology11.days();
        org.joda.time.DateTimeField dateTimeField16 = chronology11.era();
        org.joda.time.Period period19 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod20 = period19.toMutablePeriod();
        org.joda.time.Period period22 = period19.plusSeconds((int) (short) 1);
        org.joda.time.Days days23 = period22.toStandardDays();
        long long26 = chronology11.add((org.joda.time.ReadablePeriod) period22, 0L, 7);
        org.joda.time.DateTimeField dateTimeField27 = chronology11.minuteOfHour();
        org.joda.time.DurationField durationField28 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField14, and durationField15", !(durationField28.compareTo(durationField14) == 0) || (Math.signum(durationField28.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone5);
        int int7 = property4.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DurationField durationField8 = property4.getLeapDurationField();
        org.joda.time.DateTime dateTime10 = property4.addToCopy((int) '#');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime16 = dateTime12.minusMinutes((int) '#');
        java.lang.String str17 = dateTime16.toString();
        org.joda.time.Instant instant18 = dateTime16.toInstant();
        org.joda.time.DateTime.Property property19 = dateTime16.year();
        org.joda.time.DateTime dateTime20 = property19.getDateTime();
        org.joda.time.Days days21 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant18", (dateTime20.compareTo(instant18) == 0) == dateTime20.equals(instant18));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 40, 0);
        org.joda.time.Chronology chronology4 = instant0.getChronology();
        org.joda.time.Instant instant6 = instant0.plus((long) (-2148390));
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod10 = period9.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Days days12 = org.joda.time.Days.daysIn(readableInterval11);
        org.joda.time.Duration duration13 = days12.toStandardDuration();
        org.joda.time.Duration duration14 = duration13.toDuration();
        org.joda.time.ReadableDuration readableDuration15 = null;
        boolean boolean16 = duration14.isLongerThan(readableDuration15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.Days days18 = org.joda.time.Days.daysIn(readableInterval17);
        org.joda.time.Duration duration19 = days18.toStandardDuration();
        org.joda.time.Duration duration20 = duration19.toDuration();
        org.joda.time.ReadableDuration readableDuration21 = null;
        boolean boolean22 = duration20.isLongerThan(readableDuration21);
        boolean boolean23 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMillis((int) ' ');
        int int28 = dateTime25.getEra();
        org.joda.time.DateTime dateTime30 = dateTime25.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime32 = dateTime25.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval33 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime25);
        mutablePeriod10.add((org.joda.time.ReadableInterval) interval33);
        mutablePeriod10.addYears((int) ' ');
        mutablePeriod10.setSeconds((int) (byte) 100);
        mutablePeriod10.setDays((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusMillis((int) ' ');
        int int45 = dateTime42.getEra();
        org.joda.time.DateTime.Property property46 = dateTime42.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval47 = null;
        org.joda.time.Days days48 = org.joda.time.Days.daysIn(readableInterval47);
        org.joda.time.Duration duration49 = days48.toStandardDuration();
        org.joda.time.Duration duration50 = duration49.toDuration();
        org.joda.time.DateTime dateTime52 = dateTime42.withDurationAdded((org.joda.time.ReadableDuration) duration50, (-1));
        org.joda.time.Duration duration54 = duration50.plus((-1L));
        long long55 = duration50.getStandardMinutes();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration50);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime59 = org.joda.time.DateTime.now(dateTimeZone58);
        java.lang.String str60 = dateTimeZone58.getID();
        long long62 = dateTimeZone58.previousTransition((long) (short) 0);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) 1, dateTimeZone58);
        org.joda.time.Interval interval64 = duration50.toIntervalFrom((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Instant instant66 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration50, 26230665);
        org.joda.time.PeriodType periodType69 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType70 = periodType69.withWeeksRemoved();
        org.joda.time.Hours hours71 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours72 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours73 = hours71.plus(hours72);
        org.joda.time.DurationFieldType durationFieldType74 = hours71.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime77 = org.joda.time.DateTime.now(dateTimeZone76);
        org.joda.time.DateTime dateTime79 = dateTime77.plusYears((int) '4');
        org.joda.time.DateTime.Property property80 = dateTime77.dayOfWeek();
        org.joda.time.DateTime dateTime83 = dateTime77.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property84 = dateTime77.secondOfMinute();
        org.joda.time.Chronology chronology85 = dateTime77.getChronology();
        org.joda.time.DateTimeField dateTimeField86 = chronology85.dayOfMonth();
        org.joda.time.DurationField durationField87 = chronology85.millis();
        org.joda.time.DateTime dateTime88 = new org.joda.time.DateTime((long) 1, chronology85);
        boolean boolean89 = durationFieldType74.isSupported(chronology85);
        org.joda.time.Period period90 = new org.joda.time.Period(0L, (long) 582, periodType69, chronology85);
        org.joda.time.PeriodType periodType91 = periodType69.withDaysRemoved();
        org.joda.time.Period period92 = duration50.toPeriod(periodType91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime25", (instant0.compareTo(dateTime25) == 0) == instant0.equals(dateTime25));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusYears((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime12);
        int int15 = dateTime12.getYearOfCentury();
        org.joda.time.Instant instant16 = dateTime12.toInstant();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusYears((int) '4');
        org.joda.time.DateTime.Property property23 = dateTime20.dayOfWeek();
        org.joda.time.DateTime dateTime26 = dateTime20.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property27 = dateTime20.secondOfMinute();
        org.joda.time.Chronology chronology28 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.dayOfMonth();
        org.joda.time.Period period30 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology28);
        org.joda.time.DurationField durationField31 = chronology28.months();
        org.joda.time.DateTimeField dateTimeField32 = chronology28.weekyear();
        org.joda.time.DateTimeField dateTimeField33 = chronology28.weekyear();
        long long36 = dateTimeField33.add(86400000L, (long) 'a');
        boolean boolean37 = dateTimeField33.isLenient();
        int int38 = dateTime12.get(dateTimeField33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime22", (instant16.compareTo(dateTime22) == 0) == instant16.equals(dateTime22));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.ReadableInstant readableInstant4 = null;
        boolean boolean5 = instant0.isBefore(readableInstant4);
        org.joda.time.Instant instant7 = instant0.plus(1645518594899L);
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Days days9 = org.joda.time.Days.daysIn(readableInterval8);
        org.joda.time.Duration duration10 = days9.toStandardDuration();
        org.joda.time.Duration duration12 = duration10.withMillis((long) (short) 0);
        org.joda.time.Instant instant14 = instant7.withDurationAdded((org.joda.time.ReadableDuration) duration10, (int) (byte) 0);
        org.joda.time.Instant instant16 = instant7.withMillis(1645514184041L);
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.Days days18 = org.joda.time.Days.daysIn(readableInterval17);
        org.joda.time.Duration duration19 = days18.toStandardDuration();
        org.joda.time.Duration duration20 = duration19.toDuration();
        org.joda.time.ReadableDuration readableDuration21 = null;
        boolean boolean22 = duration20.isLongerThan(readableDuration21);
        org.joda.time.ReadableInterval readableInterval23 = null;
        org.joda.time.Days days24 = org.joda.time.Days.daysIn(readableInterval23);
        org.joda.time.Duration duration25 = days24.toStandardDuration();
        org.joda.time.Duration duration26 = duration25.toDuration();
        org.joda.time.ReadableDuration readableDuration27 = null;
        boolean boolean28 = duration26.isLongerThan(readableDuration27);
        boolean boolean29 = duration20.isShorterThan((org.joda.time.ReadableDuration) duration26);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusMillis((int) ' ');
        int int34 = dateTime31.getEra();
        org.joda.time.DateTime dateTime36 = dateTime31.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime38 = dateTime31.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval39 = duration20.toIntervalTo((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Period period40 = duration20.toPeriod();
        org.joda.time.ReadableInterval readableInterval41 = null;
        org.joda.time.Days days42 = org.joda.time.Days.daysIn(readableInterval41);
        org.joda.time.Duration duration43 = days42.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.Days days45 = org.joda.time.Days.daysIn(readableInterval44);
        org.joda.time.Duration duration46 = days45.toStandardDuration();
        org.joda.time.Duration duration47 = duration46.toDuration();
        org.joda.time.ReadableDuration readableDuration48 = null;
        boolean boolean49 = duration47.isLongerThan(readableDuration48);
        org.joda.time.Duration duration51 = duration43.withDurationAdded(readableDuration48, (int) (byte) 100);
        org.joda.time.Duration duration53 = duration20.withDurationAdded((org.joda.time.ReadableDuration) duration51, 292278993);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(dateTimeZone56);
        org.joda.time.DateTime dateTime59 = dateTime57.plusYears((int) '4');
        org.joda.time.DateTime.Property property60 = dateTime57.dayOfWeek();
        org.joda.time.DateTime dateTime63 = dateTime57.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property64 = dateTime57.secondOfMinute();
        org.joda.time.Chronology chronology65 = dateTime57.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.dayOfMonth();
        org.joda.time.Period period67 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology65);
        org.joda.time.DurationField durationField68 = chronology65.months();
        org.joda.time.DurationField durationField69 = chronology65.days();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime71 = org.joda.time.DateTime.now(dateTimeZone70);
        org.joda.time.DateTime dateTime73 = dateTime71.plusYears((int) '4');
        org.joda.time.DateTime.Property property74 = dateTime71.dayOfWeek();
        org.joda.time.DateTime dateTime77 = dateTime71.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property78 = dateTime71.secondOfMinute();
        org.joda.time.Chronology chronology79 = dateTime71.getChronology();
        org.joda.time.DateTimeField dateTimeField80 = chronology79.dayOfMonth();
        org.joda.time.DurationField durationField81 = chronology79.halfdays();
        org.joda.time.Chronology chronology82 = chronology79.withUTC();
        org.joda.time.DurationField durationField83 = chronology82.halfdays();
        int int84 = durationField69.compareTo(durationField83);
        long long86 = durationField83.getValueAsLong((long) (short) 0);
        boolean boolean87 = duration20.equals((java.lang.Object) long86);
        org.joda.time.Instant instant89 = instant16.withDurationAdded((org.joda.time.ReadableDuration) duration20, (-514));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime31", (instant0.compareTo(dateTime31) == 0) == instant0.equals(dateTime31));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.lang.Object obj0 = null;
        org.joda.time.Instant instant1 = new org.joda.time.Instant(obj0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMillis((int) ' ');
        int int6 = dateTime3.getEra();
        org.joda.time.DateTime dateTime8 = dateTime3.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime3.withYearOfCentury((int) (short) 1);
        org.joda.time.DateTime dateTime11 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int13 = dateTime10.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime10.plusYears((int) 'u');
        boolean boolean16 = instant1.isBefore((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Instant instant17 = instant1.toInstant();
        org.joda.time.Instant instant19 = instant1.withMillis(1645514239903L);
        boolean boolean21 = instant19.isEqual(1645514154899L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime3", (instant1.compareTo(dateTime3) == 0) == instant1.equals(dateTime3));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.Duration duration2 = days1.toStandardDuration();
        org.joda.time.Duration duration3 = duration2.toDuration();
        org.joda.time.ReadableDuration readableDuration4 = null;
        boolean boolean5 = duration3.isLongerThan(readableDuration4);
        org.joda.time.Duration duration6 = duration3.toDuration();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusYears((int) '4');
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfWeek();
        org.joda.time.DateTime dateTime14 = dateTime8.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property15 = dateTime8.minuteOfHour();
        org.joda.time.DateTime dateTime16 = dateTime8.toDateTime();
        int int17 = dateTime16.getWeekyear();
        org.joda.time.DateTime dateTime19 = dateTime16.minusDays((int) (byte) 1);
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration3, (org.joda.time.ReadableInstant) dateTime16, periodType20);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((java.lang.Object) 99999L);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Period period27 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod28 = period27.toMutablePeriod();
        org.joda.time.Period period31 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod32 = period31.toMutablePeriod();
        org.joda.time.Period period34 = period31.plusMinutes((int) (byte) 0);
        mutablePeriod28.mergePeriod((org.joda.time.ReadablePeriod) period31);
        boolean boolean36 = periodType24.equals((java.lang.Object) period31);
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration3, (org.joda.time.ReadableInstant) dateTime23, periodType24);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.minusMillis((int) ' ');
        int int46 = dateTime43.getEra();
        int int47 = dateTime41.compareTo((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(dateTimeZone48);
        org.joda.time.DateTime dateTime51 = dateTime49.plusYears((int) '4');
        org.joda.time.DateTime.Property property52 = dateTime49.dayOfWeek();
        org.joda.time.DateTime dateTime55 = dateTime49.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property56 = dateTime49.minuteOfHour();
        org.joda.time.DateTime dateTime58 = dateTime49.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone59 = dateTime58.getZone();
        long long62 = dateTimeZone59.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime63 = dateTime43.toMutableDateTime(dateTimeZone59);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.UTC;
        int int66 = dateTimeZone64.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime67 = dateTime43.withZone(dateTimeZone64);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime69 = org.joda.time.DateTime.now(dateTimeZone68);
        org.joda.time.DateTime dateTime71 = dateTime69.plusYears((int) '4');
        org.joda.time.DateTime.Property property72 = dateTime69.dayOfWeek();
        org.joda.time.DateTime dateTime75 = dateTime69.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property76 = dateTime69.minuteOfHour();
        int int77 = property76.getMaximumValue();
        boolean boolean78 = property76.isLeap();
        org.joda.time.DurationField durationField79 = property76.getDurationField();
        org.joda.time.DateTime dateTime80 = property76.roundHalfFloorCopy();
        boolean boolean81 = dateTime67.isAfter((org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.Seconds seconds82 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime67", (dateTime8.compareTo(dateTime67) == 0) == dateTime8.equals(dateTime67));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.ReadableInstant readableInstant4 = null;
        boolean boolean5 = instant0.isBefore(readableInstant4);
        long long6 = instant0.getMillis();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.daysIn(readableInterval7);
        org.joda.time.Duration duration9 = days8.toStandardDuration();
        org.joda.time.Duration duration10 = duration9.toDuration();
        org.joda.time.ReadableDuration readableDuration11 = null;
        boolean boolean12 = duration10.isLongerThan(readableDuration11);
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.Days days14 = org.joda.time.Days.daysIn(readableInterval13);
        org.joda.time.Duration duration15 = days14.toStandardDuration();
        org.joda.time.Duration duration16 = duration15.toDuration();
        org.joda.time.ReadableDuration readableDuration17 = null;
        boolean boolean18 = duration16.isLongerThan(readableDuration17);
        boolean boolean19 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMillis((int) ' ');
        int int24 = dateTime21.getEra();
        org.joda.time.DateTime dateTime26 = dateTime21.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime28 = dateTime21.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval29 = duration10.toIntervalTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Duration duration30 = duration10.toDuration();
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.days();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.plusYears((int) '4');
        org.joda.time.DateTime.Property property36 = dateTime33.dayOfWeek();
        org.joda.time.DateTime dateTime39 = dateTime33.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property40 = dateTime33.secondOfMinute();
        org.joda.time.Chronology chronology41 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.dayOfMonth();
        org.joda.time.DurationField durationField43 = chronology41.halfdays();
        org.joda.time.Chronology chronology44 = chronology41.withUTC();
        org.joda.time.DurationField durationField45 = chronology44.days();
        org.joda.time.DateTimeField dateTimeField46 = chronology44.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField47 = chronology44.era();
        org.joda.time.Period period48 = duration10.toPeriod(periodType31, chronology44);
        org.joda.time.Instant instant49 = instant0.plus((org.joda.time.ReadableDuration) duration10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant49 and dateTime21", (instant49.compareTo(dateTime21) == 0) == instant49.equals(dateTime21));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.lang.Object obj0 = null;
        org.joda.time.Instant instant1 = new org.joda.time.Instant(obj0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMillis((int) ' ');
        int int6 = dateTime3.getEra();
        org.joda.time.DateTime dateTime8 = dateTime3.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime3.withYearOfCentury((int) (short) 1);
        org.joda.time.DateTime dateTime11 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int13 = dateTime10.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime10.plusYears((int) 'u');
        boolean boolean16 = instant1.isBefore((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Instant instant17 = instant1.toInstant();
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.Days days19 = org.joda.time.Days.daysIn(readableInterval18);
        org.joda.time.Duration duration20 = days19.toStandardDuration();
        org.joda.time.Duration duration21 = duration20.toDuration();
        org.joda.time.ReadableDuration readableDuration22 = null;
        boolean boolean23 = duration21.isLongerThan(readableDuration22);
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.Days days25 = org.joda.time.Days.daysIn(readableInterval24);
        org.joda.time.Duration duration26 = days25.toStandardDuration();
        org.joda.time.Duration duration27 = duration26.toDuration();
        org.joda.time.ReadableDuration readableDuration28 = null;
        boolean boolean29 = duration27.isLongerThan(readableDuration28);
        boolean boolean30 = duration21.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMillis((int) ' ');
        int int35 = dateTime32.getEra();
        org.joda.time.DateTime dateTime37 = dateTime32.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime39 = dateTime32.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval40 = duration21.toIntervalTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Period period41 = duration21.toPeriod();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.minusMillis((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime48 = org.joda.time.DateTime.now(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.plusYears((int) '4');
        org.joda.time.DateTime.Property property51 = dateTime48.dayOfWeek();
        org.joda.time.DateTime dateTime54 = dateTime48.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property55 = dateTime48.secondOfMinute();
        org.joda.time.Chronology chronology56 = dateTime48.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.dayOfMonth();
        org.joda.time.DurationField durationField58 = chronology56.millis();
        org.joda.time.DurationField durationField59 = chronology56.minutes();
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(chronology56);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, (org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Instant instant63 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration21, 26219);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant63", (dateTime3.compareTo(instant63) == 0) == dateTime3.equals(instant63));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Days days2 = org.joda.time.Days.daysIn(readableInterval1);
        org.joda.time.Duration duration3 = days2.toStandardDuration();
        org.joda.time.Duration duration4 = duration3.toDuration();
        org.joda.time.ReadableDuration readableDuration5 = null;
        boolean boolean6 = duration4.isLongerThan(readableDuration5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.daysIn(readableInterval7);
        org.joda.time.Duration duration9 = days8.toStandardDuration();
        org.joda.time.Duration duration10 = duration9.toDuration();
        org.joda.time.ReadableDuration readableDuration11 = null;
        boolean boolean12 = duration10.isLongerThan(readableDuration11);
        boolean boolean13 = duration4.isShorterThan((org.joda.time.ReadableDuration) duration10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMillis((int) ' ');
        int int18 = dateTime15.getEra();
        org.joda.time.DateTime dateTime20 = dateTime15.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval23 = duration4.toIntervalTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Period period24 = duration4.toPeriod();
        long long25 = duration4.getStandardSeconds();
        org.joda.time.Instant instant27 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration4, 2022);
        org.joda.time.DateTime dateTime28 = instant27.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant27 and dateTime15", (instant27.compareTo(dateTime15) == 0) == instant27.equals(dateTime15));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime3.yearOfCentury();
        int int6 = dateTime3.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusYears((int) '4');
        org.joda.time.DateTime dateTime12 = dateTime8.plusDays(10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears((int) '4');
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfWeek();
        org.joda.time.DateTime dateTime21 = dateTime15.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property22 = dateTime15.secondOfMinute();
        org.joda.time.Chronology chronology23 = dateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.dayOfMonth();
        org.joda.time.DurationField durationField25 = chronology23.millis();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 1, chronology23);
        org.joda.time.DateTime dateTime27 = dateTime8.withChronology(chronology23);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime33 = dateTime29.minusMinutes((int) '#');
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.Days days35 = org.joda.time.Days.daysIn(readableInterval34);
        org.joda.time.Duration duration36 = days35.toStandardDuration();
        org.joda.time.Duration duration37 = duration36.toDuration();
        org.joda.time.ReadableDuration readableDuration38 = null;
        boolean boolean39 = duration37.isLongerThan(readableDuration38);
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.Days days41 = org.joda.time.Days.daysIn(readableInterval40);
        org.joda.time.Duration duration42 = days41.toStandardDuration();
        org.joda.time.Duration duration43 = duration42.toDuration();
        org.joda.time.ReadableDuration readableDuration44 = null;
        boolean boolean45 = duration43.isLongerThan(readableDuration44);
        boolean boolean46 = duration37.isShorterThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableDuration) duration43, periodType47);
        int int49 = dateTime33.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.plusYears((int) '4');
        org.joda.time.DateTime.Property property54 = dateTime51.dayOfWeek();
        org.joda.time.DateTime dateTime57 = dateTime51.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property58 = dateTime51.minuteOfHour();
        org.joda.time.DateTime dateTime60 = dateTime51.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone61 = dateTime60.getZone();
        long long64 = dateTimeZone61.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime66 = org.joda.time.DateTime.now(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime66.minusMillis((int) ' ');
        int int69 = dateTime66.getEra();
        org.joda.time.DateTime dateTime71 = dateTime66.minusMinutes((int) (short) 1);
        int int72 = dateTimeZone61.getOffset((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTimeZone dateTimeZone73 = dateTime66.getZone();
        boolean boolean74 = dateTime33.isEqual((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime66);
        boolean boolean76 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime78 = org.joda.time.DateTime.now(dateTimeZone77);
        org.joda.time.DateTime dateTime80 = dateTime78.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime82 = org.joda.time.DateTime.now(dateTimeZone81);
        org.joda.time.DateTime dateTime84 = dateTime82.minusMillis((int) ' ');
        int int85 = dateTime82.getEra();
        int int86 = dateTime80.compareTo((org.joda.time.ReadableInstant) dateTime82);
        int int87 = dateTime80.getEra();
        org.joda.time.DateTime dateTime88 = dateTime80.toDateTime();
        org.joda.time.DateTime dateTime90 = dateTime88.minusYears(1);
        org.joda.time.YearMonthDay yearMonthDay91 = dateTime88.toYearMonthDay();
        org.joda.time.Period period92 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime66, (org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.Instant instant93 = dateTime88.toInstant();
        org.joda.time.DateTime.Property property94 = dateTime88.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime88 and instant93", (dateTime88.compareTo(instant93) == 0) == dateTime88.equals(instant93));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfMonth();
        java.lang.String str3 = property2.toString();
        int int4 = property2.getMaximumValue();
        int int5 = property2.getMaximumValueOverall();
        org.joda.time.DateTime dateTime6 = property2.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra(436);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMillis(26256);
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.Instant instant13 = new org.joda.time.Instant(1645514124274L);
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.Days days16 = org.joda.time.Days.daysIn(readableInterval15);
        org.joda.time.Duration duration17 = days16.toStandardDuration();
        org.joda.time.Duration duration18 = duration17.toDuration();
        org.joda.time.ReadableDuration readableDuration19 = null;
        boolean boolean20 = duration18.isLongerThan(readableDuration19);
        org.joda.time.Duration duration21 = duration18.toDuration();
        org.joda.time.Period period22 = duration18.toPeriod();
        long long23 = duration18.getStandardHours();
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.Days days25 = org.joda.time.Days.daysIn(readableInterval24);
        org.joda.time.Duration duration26 = days25.toStandardDuration();
        org.joda.time.Duration duration27 = duration26.toDuration();
        org.joda.time.ReadableDuration readableDuration28 = null;
        boolean boolean29 = duration27.isLongerThan(readableDuration28);
        org.joda.time.Duration duration30 = duration27.toDuration();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.plusYears((int) '4');
        org.joda.time.DateTime.Property property35 = dateTime32.dayOfWeek();
        org.joda.time.DateTime dateTime38 = dateTime32.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property39 = dateTime32.minuteOfHour();
        org.joda.time.DateTime dateTime40 = dateTime32.toDateTime();
        int int41 = dateTime40.getWeekyear();
        org.joda.time.DateTime dateTime43 = dateTime40.minusDays((int) (byte) 1);
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration27, (org.joda.time.ReadableInstant) dateTime40, periodType44);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((java.lang.Object) 99999L);
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Period period51 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod52 = period51.toMutablePeriod();
        org.joda.time.Period period55 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod56 = period55.toMutablePeriod();
        org.joda.time.Period period58 = period55.plusMinutes((int) (byte) 0);
        mutablePeriod52.mergePeriod((org.joda.time.ReadablePeriod) period55);
        boolean boolean60 = periodType48.equals((java.lang.Object) period55);
        org.joda.time.Period period61 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration27, (org.joda.time.ReadableInstant) dateTime47, periodType48);
        boolean boolean62 = duration18.isEqual((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration63 = duration27.toDuration();
        org.joda.time.Instant instant64 = instant13.minus((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Duration duration67 = duration63.withDurationAdded((long) 29, 26185);
        org.joda.time.Instant instant69 = instant11.withDurationAdded((org.joda.time.ReadableDuration) duration67, (-1568139200));
        boolean boolean70 = dateTime8.isBefore((org.joda.time.ReadableInstant) instant69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant11", (dateTime1.compareTo(instant11) == 0) == dateTime1.equals(instant11));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTime dateTime11 = dateTime1.minusYears(0);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTime();
        org.joda.time.Chronology chronology13 = dateTime11.getChronology();
        org.joda.time.Instant instant14 = dateTime11.toInstant();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusYears((int) '4');
        org.joda.time.DateTime dateTime20 = dateTime16.plusDays(10);
        org.joda.time.Period period23 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod24 = period23.toMutablePeriod();
        org.joda.time.Period period26 = period23.plusSeconds((int) (short) 1);
        org.joda.time.Minutes minutes27 = period23.toStandardMinutes();
        org.joda.time.Minutes minutes29 = minutes27.multipliedBy(435);
        org.joda.time.Minutes minutes30 = org.joda.time.Minutes.MIN_VALUE;
        boolean boolean31 = minutes27.isGreaterThan(minutes30);
        org.joda.time.Period period34 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod35 = period34.toMutablePeriod();
        org.joda.time.Period period37 = period34.plusSeconds((int) (short) 1);
        org.joda.time.Minutes minutes38 = period34.toStandardMinutes();
        org.joda.time.Minutes minutes40 = minutes38.multipliedBy(435);
        org.joda.time.Minutes minutes41 = org.joda.time.Minutes.MIN_VALUE;
        boolean boolean42 = minutes38.isGreaterThan(minutes41);
        org.joda.time.PeriodType periodType43 = minutes38.getPeriodType();
        org.joda.time.Minutes minutes44 = minutes38.negated();
        org.joda.time.Minutes minutes45 = minutes30.plus(minutes38);
        org.joda.time.PeriodType periodType46 = minutes45.getPeriodType();
        org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant14, (org.joda.time.ReadableInstant) dateTime20, periodType46);
        org.joda.time.DateTime dateTime49 = dateTime20.minusMinutes((int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant14", (dateTime1.compareTo(instant14) == 0) == dateTime1.equals(instant14));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant4 = instant0.minus(87350400000L);
        org.joda.time.Duration duration6 = org.joda.time.Duration.parse("PT2147483647S");
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.daysIn(readableInterval7);
        org.joda.time.Duration duration9 = days8.toStandardDuration();
        org.joda.time.Duration duration10 = duration9.toDuration();
        boolean boolean11 = duration6.isLongerThan((org.joda.time.ReadableDuration) duration9);
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Days days13 = org.joda.time.Days.daysIn(readableInterval12);
        org.joda.time.Duration duration14 = days13.toStandardDuration();
        org.joda.time.Duration duration15 = duration14.toDuration();
        org.joda.time.ReadableDuration readableDuration16 = null;
        boolean boolean17 = duration15.isLongerThan(readableDuration16);
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.Days days19 = org.joda.time.Days.daysIn(readableInterval18);
        org.joda.time.Duration duration20 = days19.toStandardDuration();
        org.joda.time.Duration duration21 = duration20.toDuration();
        org.joda.time.ReadableDuration readableDuration22 = null;
        boolean boolean23 = duration21.isLongerThan(readableDuration22);
        boolean boolean24 = duration15.isShorterThan((org.joda.time.ReadableDuration) duration21);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMillis((int) ' ');
        int int29 = dateTime26.getEra();
        org.joda.time.DateTime dateTime31 = dateTime26.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime33 = dateTime26.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval34 = duration15.toIntervalTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Duration duration35 = duration15.toDuration();
        boolean boolean36 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration35);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        java.lang.String str40 = dateTimeZone38.getID();
        long long42 = dateTimeZone38.previousTransition((long) (short) 0);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 1, dateTimeZone38);
        org.joda.time.Interval interval44 = duration9.toIntervalTo((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Instant instant45 = instant0.plus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.MutableDateTime mutableDateTime46 = instant45.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant45 and dateTime26", (instant45.compareTo(dateTime26) == 0) == instant45.equals(dateTime26));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 40, 0);
        org.joda.time.Chronology chronology4 = instant0.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = instant0.toMutableDateTime();
        boolean boolean6 = instant0.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone7 = instant0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime5", (instant0.compareTo(mutableDateTime5) == 0) == instant0.equals(mutableDateTime5));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant4 = instant0.minus(87350400000L);
        org.joda.time.Duration duration6 = org.joda.time.Duration.parse("PT2147483647S");
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.daysIn(readableInterval7);
        org.joda.time.Duration duration9 = days8.toStandardDuration();
        org.joda.time.Duration duration10 = duration9.toDuration();
        boolean boolean11 = duration6.isLongerThan((org.joda.time.ReadableDuration) duration9);
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Days days13 = org.joda.time.Days.daysIn(readableInterval12);
        org.joda.time.Duration duration14 = days13.toStandardDuration();
        org.joda.time.Duration duration15 = duration14.toDuration();
        org.joda.time.ReadableDuration readableDuration16 = null;
        boolean boolean17 = duration15.isLongerThan(readableDuration16);
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.Days days19 = org.joda.time.Days.daysIn(readableInterval18);
        org.joda.time.Duration duration20 = days19.toStandardDuration();
        org.joda.time.Duration duration21 = duration20.toDuration();
        org.joda.time.ReadableDuration readableDuration22 = null;
        boolean boolean23 = duration21.isLongerThan(readableDuration22);
        boolean boolean24 = duration15.isShorterThan((org.joda.time.ReadableDuration) duration21);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMillis((int) ' ');
        int int29 = dateTime26.getEra();
        org.joda.time.DateTime dateTime31 = dateTime26.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime33 = dateTime26.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval34 = duration15.toIntervalTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Duration duration35 = duration15.toDuration();
        boolean boolean36 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration35);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        java.lang.String str40 = dateTimeZone38.getID();
        long long42 = dateTimeZone38.previousTransition((long) (short) 0);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 1, dateTimeZone38);
        org.joda.time.Interval interval44 = duration9.toIntervalTo((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Instant instant45 = instant0.plus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.minusMillis((int) ' ');
        int int53 = dateTime50.getEra();
        org.joda.time.DateTime.Property property54 = dateTime50.secondOfMinute();
        org.joda.time.Interval interval55 = property54.toInterval();
        org.joda.time.Duration duration56 = interval55.toDuration();
        org.joda.time.PeriodType periodType57 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(readableInstant48, (org.joda.time.ReadableDuration) duration56, periodType57);
        org.joda.time.PeriodType periodType59 = periodType57.withWeeksRemoved();
        org.joda.time.Period period60 = new org.joda.time.Period(0L, 1645514185540L, periodType57);
        org.joda.time.PeriodType periodType63 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime65 = org.joda.time.DateTime.now(dateTimeZone64);
        org.joda.time.DateTime.Property property66 = dateTime65.dayOfMonth();
        org.joda.time.DateTime dateTime67 = property66.roundFloorCopy();
        org.joda.time.DateTime.Property property68 = dateTime67.millisOfDay();
        org.joda.time.Chronology chronology69 = dateTime67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 2147483647, (long) 1814400, periodType63, chronology69);
        org.joda.time.Period period71 = duration9.toPeriod(periodType57, chronology69);
        org.joda.time.DurationField durationField72 = chronology69.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime26", (instant0.compareTo(dateTime26) == 0) == instant0.equals(dateTime26));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime3 = property2.roundFloorCopy();
        org.joda.time.DateTime dateTime4 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfMonth();
        java.lang.String str8 = property7.toString();
        int int9 = property7.getMaximumValue();
        int int10 = property7.getMaximumValueOverall();
        org.joda.time.DateTime dateTime11 = property7.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra(436);
        org.joda.time.DateTime dateTime15 = dateTime11.withYearOfCentury((int) (byte) 1);
        int int16 = property2.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMillis((int) ' ');
        int int25 = dateTime22.getEra();
        int int26 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.plusYears((int) '4');
        org.joda.time.DateTime.Property property31 = dateTime28.dayOfWeek();
        org.joda.time.DateTime dateTime34 = dateTime28.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property35 = dateTime28.minuteOfHour();
        org.joda.time.DateTime dateTime37 = dateTime28.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime37.getZone();
        long long41 = dateTimeZone38.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime22.toMutableDateTime(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        int int45 = dateTimeZone43.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime46 = dateTime22.withZone(dateTimeZone43);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) instant47);
        org.joda.time.DateTime.Property property49 = dateTime46.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property49.getFieldType();
        int int51 = dateTime15.get(dateTimeFieldType50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime46", (dateTime1.compareTo(dateTime46) == 0) == dateTime1.equals(dateTime46));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Days days5 = org.joda.time.Days.daysIn(readableInterval4);
        org.joda.time.Duration duration6 = days5.toStandardDuration();
        org.joda.time.Duration duration7 = duration6.toDuration();
        org.joda.time.ReadableDuration readableDuration8 = null;
        boolean boolean9 = duration7.isLongerThan(readableDuration8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Days days11 = org.joda.time.Days.daysIn(readableInterval10);
        org.joda.time.Duration duration12 = days11.toStandardDuration();
        org.joda.time.Duration duration13 = duration12.toDuration();
        org.joda.time.ReadableDuration readableDuration14 = null;
        boolean boolean15 = duration13.isLongerThan(readableDuration14);
        boolean boolean16 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMillis((int) ' ');
        int int21 = dateTime18.getEra();
        org.joda.time.DateTime dateTime23 = dateTime18.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime25 = dateTime18.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval26 = duration7.toIntervalTo((org.joda.time.ReadableInstant) dateTime18);
        mutablePeriod3.add((org.joda.time.ReadableInterval) interval26);
        mutablePeriod3.addYears((int) ' ');
        mutablePeriod3.setWeeks(20);
        mutablePeriod3.setYears((int) '#');
        mutablePeriod3.add(26213913L);
        org.joda.time.ReadableInterval readableInterval36 = null;
        org.joda.time.Days days37 = org.joda.time.Days.daysIn(readableInterval36);
        org.joda.time.Duration duration38 = days37.toStandardDuration();
        org.joda.time.Duration duration39 = duration38.toDuration();
        org.joda.time.ReadableDuration readableDuration40 = null;
        boolean boolean41 = duration39.isLongerThan(readableDuration40);
        org.joda.time.Duration duration42 = duration39.toDuration();
        org.joda.time.ReadableInterval readableInterval43 = null;
        org.joda.time.Days days44 = org.joda.time.Days.daysIn(readableInterval43);
        org.joda.time.Duration duration45 = days44.toStandardDuration();
        org.joda.time.Duration duration46 = duration45.toDuration();
        org.joda.time.ReadableDuration readableDuration47 = null;
        boolean boolean48 = duration46.isLongerThan(readableDuration47);
        org.joda.time.Duration duration49 = duration46.toDuration();
        org.joda.time.Period period50 = duration46.toPeriod();
        int int51 = duration42.compareTo((org.joda.time.ReadableDuration) duration46);
        org.joda.time.Instant instant52 = new org.joda.time.Instant();
        boolean boolean54 = instant52.isEqual(10L);
        org.joda.time.ReadableInterval readableInterval55 = null;
        org.joda.time.Days days56 = org.joda.time.Days.daysIn(readableInterval55);
        org.joda.time.Duration duration57 = days56.toStandardDuration();
        org.joda.time.Duration duration58 = duration57.toDuration();
        org.joda.time.ReadableDuration readableDuration59 = null;
        boolean boolean60 = duration58.isLongerThan(readableDuration59);
        org.joda.time.Duration duration61 = duration58.toDuration();
        org.joda.time.ReadableInterval readableInterval62 = null;
        org.joda.time.Days days63 = org.joda.time.Days.daysIn(readableInterval62);
        org.joda.time.Duration duration64 = days63.toStandardDuration();
        org.joda.time.Duration duration65 = duration64.toDuration();
        org.joda.time.ReadableDuration readableDuration66 = null;
        boolean boolean67 = duration65.isLongerThan(readableDuration66);
        org.joda.time.Duration duration68 = duration65.toDuration();
        org.joda.time.Period period69 = duration65.toPeriod();
        int int70 = duration61.compareTo((org.joda.time.ReadableDuration) duration65);
        org.joda.time.Instant instant71 = instant52.plus((org.joda.time.ReadableDuration) duration65);
        org.joda.time.Duration duration73 = duration42.withDurationAdded((org.joda.time.ReadableDuration) duration65, 26185);
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant52", (dateTime18.compareTo(instant52) == 0) == dateTime18.equals(instant52));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime5 = dateTime1.minusMinutes((int) '#');
        java.lang.String str6 = dateTime5.toString();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.DateTime dateTime8 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration10 = new org.joda.time.Duration((long) 28);
        org.joda.time.Duration duration13 = duration10.withDurationAdded(1645512059742L, 100);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMillis((int) ' ');
        int int18 = dateTime15.getEra();
        org.joda.time.DateTime.Property property19 = dateTime15.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.Days days21 = org.joda.time.Days.daysIn(readableInterval20);
        org.joda.time.Duration duration22 = days21.toStandardDuration();
        org.joda.time.Duration duration23 = duration22.toDuration();
        org.joda.time.DateTime dateTime25 = dateTime15.withDurationAdded((org.joda.time.ReadableDuration) duration23, (-1));
        long long26 = duration23.getMillis();
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.Days days28 = org.joda.time.Days.daysIn(readableInterval27);
        org.joda.time.Duration duration29 = days28.toStandardDuration();
        long long30 = duration29.getStandardHours();
        java.lang.String str31 = duration29.toString();
        int int32 = duration23.compareTo((org.joda.time.ReadableDuration) duration29);
        int int33 = duration10.compareTo((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableDuration) duration23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant7", (dateTime8.compareTo(instant7) == 0) == dateTime8.equals(instant7));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 40, 0);
        org.joda.time.DateTime dateTime4 = instant3.toDateTimeISO();
        org.joda.time.Instant instant6 = instant3.plus(1645514168358L);
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.daysIn(readableInterval7);
        org.joda.time.Duration duration9 = days8.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Days days11 = org.joda.time.Days.daysIn(readableInterval10);
        org.joda.time.Duration duration12 = days11.toStandardDuration();
        org.joda.time.Duration duration13 = duration12.toDuration();
        org.joda.time.ReadableDuration readableDuration14 = null;
        boolean boolean15 = duration13.isLongerThan(readableDuration14);
        org.joda.time.Duration duration17 = duration9.withDurationAdded(readableDuration14, (int) (byte) 100);
        org.joda.time.Duration duration18 = org.joda.time.Duration.ZERO;
        boolean boolean19 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration18);
        long long20 = duration9.getStandardSeconds();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Duration duration22 = duration9.plus(readableDuration21);
        org.joda.time.Instant instant23 = instant6.minus((org.joda.time.ReadableDuration) duration9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        int int8 = dateTime5.getEra();
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime5.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        int int28 = dateTimeZone26.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime29 = dateTime5.withZone(dateTimeZone26);
        org.joda.time.Instant instant30 = new org.joda.time.Instant();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) instant30);
        org.joda.time.DateTime.Property property32 = dateTime29.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property32.getFieldType();
        org.joda.time.DurationField durationField34 = property32.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime29", (dateTime1.compareTo(dateTime29) == 0) == dateTime1.equals(dateTime29));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) '4');
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfWeek();
        org.joda.time.DateTime dateTime18 = dateTime12.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property19 = dateTime12.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusYears((int) '4');
        org.joda.time.DateTime dateTime24 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.Seconds seconds25 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime23.toMutableDateTime();
        org.joda.time.DateTime dateTime28 = dateTime23.withMillisOfSecond(7);
        boolean boolean30 = dateTime23.isAfter(0L);
        org.joda.time.TimeOfDay timeOfDay31 = dateTime23.toTimeOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.plusYears((int) '4');
        org.joda.time.DateTime.Property property36 = dateTime33.dayOfWeek();
        org.joda.time.DateTime dateTime39 = dateTime33.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property40 = dateTime33.secondOfMinute();
        org.joda.time.Chronology chronology41 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.dayOfMonth();
        org.joda.time.DurationField durationField43 = chronology41.weeks();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.secondOfMinute();
        org.joda.time.Period period47 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod48 = period47.toMutablePeriod();
        org.joda.time.Period period51 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod52 = period51.toMutablePeriod();
        org.joda.time.Period period54 = period51.plusMinutes((int) (byte) 0);
        mutablePeriod48.mergePeriod((org.joda.time.ReadablePeriod) period51);
        mutablePeriod48.setDays((int) 'a');
        mutablePeriod48.addMinutes(0);
        mutablePeriod48.setSeconds((int) ' ');
        int[] intArray63 = chronology41.get((org.joda.time.ReadablePeriod) mutablePeriod48, 10L);
        int int64 = dateTimeField10.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay31, intArray63);
        org.joda.time.Chronology chronology65 = timeOfDay31.getChronology();
        org.joda.time.DurationField durationField66 = chronology65.weeks();
        org.joda.time.DurationField durationField67 = chronology65.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField67", (durationField43.compareTo(durationField67) == 0) == durationField43.equals(durationField67));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.ReadableInstant readableInstant4 = null;
        boolean boolean5 = instant0.isBefore(readableInstant4);
        org.joda.time.Instant instant7 = instant0.plus(1645518594899L);
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Days days9 = org.joda.time.Days.daysIn(readableInterval8);
        org.joda.time.Duration duration10 = days9.toStandardDuration();
        org.joda.time.Duration duration12 = duration10.withMillis((long) (short) 0);
        org.joda.time.Instant instant14 = instant7.withDurationAdded((org.joda.time.ReadableDuration) duration10, (int) (byte) 0);
        org.joda.time.Duration duration15 = org.joda.time.Duration.ZERO;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMillis((int) ' ');
        int int20 = dateTime17.getEra();
        org.joda.time.DateTime.Property property21 = dateTime17.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval22 = null;
        org.joda.time.Days days23 = org.joda.time.Days.daysIn(readableInterval22);
        org.joda.time.Duration duration24 = days23.toStandardDuration();
        org.joda.time.Duration duration25 = duration24.toDuration();
        org.joda.time.DateTime dateTime27 = dateTime17.withDurationAdded((org.joda.time.ReadableDuration) duration25, (-1));
        org.joda.time.Duration duration29 = duration25.plus((-1L));
        long long30 = duration25.getStandardMinutes();
        boolean boolean31 = duration15.isShorterThan((org.joda.time.ReadableDuration) duration25);
        boolean boolean32 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime17", (instant0.compareTo(dateTime17) == 0) == instant0.equals(dateTime17));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime5 = dateTime1.minusMinutes((int) '#');
        java.lang.String str6 = dateTime5.toString();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.DateTime.Property property8 = dateTime5.year();
        org.joda.time.DateTime dateTime10 = property8.addToCopy(302);
        int int11 = property8.getMinimumValue();
        org.joda.time.DateTime dateTime12 = property8.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant7", (dateTime5.compareTo(instant7) == 0) == dateTime5.equals(instant7));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusYears((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime8 = dateTime2.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property9 = dateTime2.secondOfMinute();
        org.joda.time.Chronology chronology10 = dateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfMonth();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 1, chronology10);
        org.joda.time.DurationField durationField14 = chronology10.days();
        org.joda.time.DurationField durationField15 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField12, and durationField14", !(durationField15.compareTo(durationField12) == 0) || (Math.signum(durationField15.compareTo(durationField14)) == Math.signum(durationField12.compareTo(durationField14))));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Days days5 = org.joda.time.Days.daysIn(readableInterval4);
        org.joda.time.Duration duration6 = days5.toStandardDuration();
        org.joda.time.Duration duration7 = duration6.toDuration();
        org.joda.time.ReadableDuration readableDuration8 = null;
        boolean boolean9 = duration7.isLongerThan(readableDuration8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Days days11 = org.joda.time.Days.daysIn(readableInterval10);
        org.joda.time.Duration duration12 = days11.toStandardDuration();
        org.joda.time.Duration duration13 = duration12.toDuration();
        org.joda.time.ReadableDuration readableDuration14 = null;
        boolean boolean15 = duration13.isLongerThan(readableDuration14);
        boolean boolean16 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMillis((int) ' ');
        int int21 = dateTime18.getEra();
        org.joda.time.DateTime dateTime23 = dateTime18.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime25 = dateTime18.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval26 = duration7.toIntervalTo((org.joda.time.ReadableInstant) dateTime18);
        mutablePeriod3.add((org.joda.time.ReadableInterval) interval26);
        org.joda.time.MutableInterval mutableInterval28 = interval26.toMutableInterval();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.plusYears((int) '4');
        boolean boolean33 = interval26.isAfter((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.MutableInterval mutableInterval34 = interval26.toMutableInterval();
        org.joda.time.Period period35 = interval26.toPeriod();
        long long36 = interval26.getStartMillis();
        org.joda.time.Instant instant37 = new org.joda.time.Instant();
        boolean boolean39 = instant37.isEqual(10L);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.minusMillis((int) ' ');
        int int48 = dateTime45.getEra();
        int int49 = dateTime43.compareTo((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.plusYears((int) '4');
        org.joda.time.DateTime.Property property54 = dateTime51.dayOfWeek();
        org.joda.time.DateTime dateTime57 = dateTime51.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property58 = dateTime51.minuteOfHour();
        org.joda.time.DateTime dateTime60 = dateTime51.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone61 = dateTime60.getZone();
        long long64 = dateTimeZone61.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime45.toMutableDateTime(dateTimeZone61);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime67 = org.joda.time.DateTime.now(dateTimeZone66);
        org.joda.time.DateTime dateTime69 = dateTime67.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime71 = dateTime67.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime65, (org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.DateTime dateTime74 = dateTime67.plusDays(1);
        boolean boolean75 = instant37.equals((java.lang.Object) dateTime74);
        org.joda.time.DateTime dateTime76 = dateTime74.toDateTimeISO();
        boolean boolean77 = interval26.isAfter((org.joda.time.ReadableInstant) dateTime74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant37", (dateTime18.compareTo(instant37) == 0) == dateTime18.equals(instant37));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.lang.Object obj0 = null;
        org.joda.time.Instant instant1 = new org.joda.time.Instant(obj0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMillis((int) ' ');
        int int6 = dateTime3.getEra();
        org.joda.time.DateTime dateTime8 = dateTime3.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime3.withYearOfCentury((int) (short) 1);
        org.joda.time.DateTime dateTime11 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int13 = dateTime10.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime10.plusYears((int) 'u');
        boolean boolean16 = instant1.isBefore((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Instant instant17 = instant1.toInstant();
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.Days days19 = org.joda.time.Days.daysIn(readableInterval18);
        org.joda.time.Duration duration20 = days19.toStandardDuration();
        org.joda.time.Duration duration21 = duration20.toDuration();
        org.joda.time.ReadableDuration readableDuration22 = null;
        boolean boolean23 = duration21.isLongerThan(readableDuration22);
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.Days days25 = org.joda.time.Days.daysIn(readableInterval24);
        org.joda.time.Duration duration26 = days25.toStandardDuration();
        org.joda.time.Duration duration27 = duration26.toDuration();
        org.joda.time.ReadableDuration readableDuration28 = null;
        boolean boolean29 = duration27.isLongerThan(readableDuration28);
        boolean boolean30 = duration21.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.Days days32 = org.joda.time.Days.daysIn(readableInterval31);
        org.joda.time.Duration duration33 = days32.toStandardDuration();
        org.joda.time.Duration duration34 = duration33.toDuration();
        boolean boolean35 = duration27.isLongerThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.Period period38 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod39 = period38.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.Days days41 = org.joda.time.Days.daysIn(readableInterval40);
        org.joda.time.Duration duration42 = days41.toStandardDuration();
        org.joda.time.Duration duration43 = duration42.toDuration();
        org.joda.time.ReadableDuration readableDuration44 = null;
        boolean boolean45 = duration43.isLongerThan(readableDuration44);
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.Days days47 = org.joda.time.Days.daysIn(readableInterval46);
        org.joda.time.Duration duration48 = days47.toStandardDuration();
        org.joda.time.Duration duration49 = duration48.toDuration();
        org.joda.time.ReadableDuration readableDuration50 = null;
        boolean boolean51 = duration49.isLongerThan(readableDuration50);
        boolean boolean52 = duration43.isShorterThan((org.joda.time.ReadableDuration) duration49);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.minusMillis((int) ' ');
        int int57 = dateTime54.getEra();
        org.joda.time.DateTime dateTime59 = dateTime54.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime61 = dateTime54.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval62 = duration43.toIntervalTo((org.joda.time.ReadableInstant) dateTime54);
        mutablePeriod39.add((org.joda.time.ReadableInterval) interval62);
        org.joda.time.Period period66 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod67 = period66.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval68 = null;
        org.joda.time.Days days69 = org.joda.time.Days.daysIn(readableInterval68);
        org.joda.time.Duration duration70 = days69.toStandardDuration();
        org.joda.time.Duration duration71 = duration70.toDuration();
        org.joda.time.ReadableDuration readableDuration72 = null;
        boolean boolean73 = duration71.isLongerThan(readableDuration72);
        org.joda.time.ReadableInterval readableInterval74 = null;
        org.joda.time.Days days75 = org.joda.time.Days.daysIn(readableInterval74);
        org.joda.time.Duration duration76 = days75.toStandardDuration();
        org.joda.time.Duration duration77 = duration76.toDuration();
        org.joda.time.ReadableDuration readableDuration78 = null;
        boolean boolean79 = duration77.isLongerThan(readableDuration78);
        boolean boolean80 = duration71.isShorterThan((org.joda.time.ReadableDuration) duration77);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime82 = org.joda.time.DateTime.now(dateTimeZone81);
        org.joda.time.DateTime dateTime84 = dateTime82.minusMillis((int) ' ');
        int int85 = dateTime82.getEra();
        org.joda.time.DateTime dateTime87 = dateTime82.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime89 = dateTime82.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval90 = duration71.toIntervalTo((org.joda.time.ReadableInstant) dateTime82);
        mutablePeriod67.add((org.joda.time.ReadableInterval) interval90);
        boolean boolean92 = interval62.isBefore((org.joda.time.ReadableInterval) interval90);
        org.joda.time.PeriodType periodType93 = null;
        org.joda.time.Period period94 = interval62.toPeriod(periodType93);
        org.joda.time.Duration duration95 = interval62.toDuration();
        org.joda.time.Duration duration96 = duration95.toDuration();
        boolean boolean97 = duration27.isEqual((org.joda.time.ReadableDuration) duration96);
        org.joda.time.Instant instant98 = instant1.minus((org.joda.time.ReadableDuration) duration96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant98", (dateTime3.compareTo(instant98) == 0) == dateTime3.equals(instant98));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean1 = instant0.isAfterNow();
        org.joda.time.Instant instant3 = instant0.withMillis((long) (short) 0);
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMillis((int) ' ');
        int int13 = dateTime10.getEra();
        int int14 = dateTime8.compareTo((org.joda.time.ReadableInstant) dateTime10);
        int int15 = dateTime8.getEra();
        org.joda.time.DateTime dateTime17 = dateTime8.minusMillis(12);
        org.joda.time.DateTime dateTime18 = dateTime8.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime18.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMillis((int) ' ');
        int int24 = dateTime21.getEra();
        org.joda.time.DateTime dateTime26 = dateTime21.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime28 = dateTime21.withYearOfCentury((int) (short) 1);
        org.joda.time.DateTime dateTime29 = dateTime28.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int31 = dateTime28.get(dateTimeFieldType30);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType35 = periodType34.withMinutesRemoved();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.plusYears((int) '4');
        org.joda.time.DateTime.Property property41 = dateTime38.dayOfWeek();
        org.joda.time.DateTime dateTime44 = dateTime38.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property45 = dateTime38.minuteOfDay();
        org.joda.time.DateTime dateTime47 = property45.addToCopy(7);
        org.joda.time.Chronology chronology48 = dateTime47.getChronology();
        org.joda.time.Period period49 = new org.joda.time.Period(10L, chronology48);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 9, (long) 1814400, periodType35, chronology48);
        org.joda.time.DateTimeField dateTimeField51 = chronology48.dayOfYear();
        boolean boolean52 = dateTimeFieldType30.isSupported(chronology48);
        org.joda.time.DateTime dateTime54 = dateTime18.withField(dateTimeFieldType30, 568);
        int int55 = dateTime4.get(dateTimeFieldType30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime6", (instant0.compareTo(dateTime6) == 0) == instant0.equals(dateTime6));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusYears((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime8 = dateTime2.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property9 = dateTime2.secondOfMinute();
        org.joda.time.Chronology chronology10 = dateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfMonth();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 1, chronology10);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(100);
        int int16 = dateTime15.getEra();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMillis((int) ' ');
        int int25 = dateTime22.getEra();
        int int26 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.plusYears((int) '4');
        org.joda.time.DateTime.Property property31 = dateTime28.dayOfWeek();
        org.joda.time.DateTime dateTime34 = dateTime28.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property35 = dateTime28.minuteOfHour();
        org.joda.time.DateTime dateTime37 = dateTime28.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime37.getZone();
        long long41 = dateTimeZone38.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime22.toMutableDateTime(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        int int45 = dateTimeZone43.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime46 = dateTime22.withZone(dateTimeZone43);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) instant47);
        org.joda.time.DateTime.Property property49 = dateTime46.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property49.getFieldType();
        int int51 = dateTime15.get(dateTimeFieldType50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime46", (dateTime2.compareTo(dateTime46) == 0) == dateTime2.equals(dateTime46));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        int int8 = dateTime5.getEra();
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime5.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        int int28 = dateTimeZone26.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime29 = dateTime5.withZone(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.plusYears((int) '4');
        org.joda.time.DateTime.Property property34 = dateTime31.dayOfWeek();
        boolean boolean35 = dateTime31.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.plusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime39.getZone();
        boolean boolean42 = dateTimeZone40.isStandardOffset(0L);
        int int44 = dateTimeZone40.getStandardOffset((long) 999);
        java.util.TimeZone timeZone45 = dateTimeZone40.toTimeZone();
        org.joda.time.DateTime dateTime46 = dateTime31.withZoneRetainFields(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime48 = org.joda.time.DateTime.now(dateTimeZone47);
        java.lang.String str49 = dateTimeZone47.getID();
        org.joda.time.DateTime dateTime50 = dateTime31.toDateTime(dateTimeZone47);
        java.util.Locale locale52 = java.util.Locale.JAPAN;
        java.lang.String str53 = dateTimeZone47.getShortName((long) 436, locale52);
        long long55 = dateTimeZone26.getMillisKeepLocal(dateTimeZone47, 4519084803L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime29", (dateTime1.compareTo(dateTime29) == 0) == dateTime1.equals(dateTime29));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(1100L, periodType1);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Days days5 = org.joda.time.Days.daysIn(readableInterval4);
        org.joda.time.Duration duration6 = days5.toStandardDuration();
        org.joda.time.Duration duration7 = duration6.toDuration();
        org.joda.time.ReadableDuration readableDuration8 = null;
        boolean boolean9 = duration7.isLongerThan(readableDuration8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Days days11 = org.joda.time.Days.daysIn(readableInterval10);
        org.joda.time.Duration duration12 = days11.toStandardDuration();
        org.joda.time.Duration duration13 = duration12.toDuration();
        org.joda.time.ReadableDuration readableDuration14 = null;
        boolean boolean15 = duration13.isLongerThan(readableDuration14);
        boolean boolean16 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMillis((int) ' ');
        int int21 = dateTime18.getEra();
        org.joda.time.DateTime dateTime23 = dateTime18.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime25 = dateTime18.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval26 = duration7.toIntervalTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Period period27 = duration7.toPeriod();
        long long28 = duration7.getStandardSeconds();
        org.joda.time.Instant instant30 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration7, 2022);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone31);
        java.lang.String str33 = dateTimeZone31.getID();
        long long35 = dateTimeZone31.previousTransition((long) (short) 0);
        java.lang.String str36 = dateTimeZone31.toString();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone31);
        mutablePeriod2.setPeriod((org.joda.time.ReadableInstant) instant30, (org.joda.time.ReadableInstant) dateTime37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant30 and dateTime18", (instant30.compareTo(dateTime18) == 0) == instant30.equals(dateTime18));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        int int4 = dateTime1.getEra();
        org.joda.time.DateTime.Property property5 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) dateTime6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = dateTime9.withZone(dateTimeZone10);
        org.joda.time.DateTime.Property property13 = dateTime12.weekyear();
        boolean boolean14 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime16 = dateTime6.withHourOfDay(20);
        org.joda.time.LocalTime localTime17 = dateTime6.toLocalTime();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime.Property property20 = dateTime19.dayOfMonth();
        org.joda.time.DateTime dateTime21 = property20.roundFloorCopy();
        org.joda.time.DateTime dateTime23 = dateTime21.plus(4320000001L);
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) instant24);
        org.joda.time.DateTime dateTime26 = localTime17.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Instant instant27 = instant24.toInstant();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((java.lang.Object) instant27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant27", (dateTime1.compareTo(instant27) == 0) == dateTime1.equals(instant27));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Days days5 = org.joda.time.Days.daysIn(readableInterval4);
        org.joda.time.Duration duration6 = days5.toStandardDuration();
        org.joda.time.Duration duration7 = duration6.toDuration();
        org.joda.time.ReadableDuration readableDuration8 = null;
        boolean boolean9 = duration7.isLongerThan(readableDuration8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Days days11 = org.joda.time.Days.daysIn(readableInterval10);
        org.joda.time.Duration duration12 = days11.toStandardDuration();
        org.joda.time.Duration duration13 = duration12.toDuration();
        org.joda.time.ReadableDuration readableDuration14 = null;
        boolean boolean15 = duration13.isLongerThan(readableDuration14);
        boolean boolean16 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMillis((int) ' ');
        int int21 = dateTime18.getEra();
        org.joda.time.DateTime dateTime23 = dateTime18.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime25 = dateTime18.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval26 = duration7.toIntervalTo((org.joda.time.ReadableInstant) dateTime18);
        mutablePeriod3.add((org.joda.time.ReadableInterval) interval26);
        mutablePeriod3.addYears((int) ' ');
        mutablePeriod3.setWeeks(20);
        mutablePeriod3.setYears((int) '#');
        mutablePeriod3.add(26213913L);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusMillis((int) ' ');
        int int44 = dateTime41.getEra();
        int int45 = dateTime39.compareTo((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(dateTimeZone46);
        org.joda.time.DateTime dateTime49 = dateTime47.plusYears((int) '4');
        org.joda.time.DateTime.Property property50 = dateTime47.dayOfWeek();
        org.joda.time.DateTime dateTime53 = dateTime47.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property54 = dateTime47.minuteOfHour();
        org.joda.time.DateTime dateTime56 = dateTime47.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone57 = dateTime56.getZone();
        long long60 = dateTimeZone57.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime61 = dateTime41.toMutableDateTime(dateTimeZone57);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.UTC;
        int int64 = dateTimeZone62.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime65 = dateTime41.withZone(dateTimeZone62);
        org.joda.time.DateTimeZone dateTimeZone66 = dateTime41.getZone();
        org.joda.time.Duration duration67 = mutablePeriod3.toDurationFrom((org.joda.time.ReadableInstant) dateTime41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime65", (dateTime18.compareTo(dateTime65) == 0) == dateTime18.equals(dateTime65));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) '4');
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfWeek();
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property10 = dateTime3.secondOfMinute();
        org.joda.time.Chronology chronology11 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfMonth();
        org.joda.time.DurationField durationField13 = durationFieldType1.getField(chronology11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, chronology15);
        int int17 = period16.getMillis();
        long long20 = chronology11.add((org.joda.time.ReadablePeriod) period16, (long) (short) 100, 40);
        org.joda.time.DurationField durationField21 = chronology11.eras();
        org.joda.time.Period period22 = new org.joda.time.Period((long) 26298, chronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField21", Math.signum(durationField13.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField13)));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfSecond();
        org.joda.time.DurationField durationField13 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField13", Math.signum(durationField11.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField11)));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusYears((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime8 = dateTime2.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property9 = dateTime2.secondOfMinute();
        org.joda.time.Chronology chronology10 = dateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfMonth();
        org.joda.time.DurationField durationField12 = durationFieldType0.getField(chronology10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, chronology14);
        int int16 = period15.getMillis();
        long long19 = chronology10.add((org.joda.time.ReadablePeriod) period15, (long) (short) 100, 40);
        org.joda.time.DurationField durationField20 = chronology10.eras();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(chronology10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField20", Math.signum(durationField12.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField12)));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        int int8 = dateTime5.getEra();
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime5.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime31 = dateTime27.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime25, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime.Property property33 = dateTime27.dayOfMonth();
        long long34 = property33.remainder();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.minusMillis((int) ' ');
        int int43 = dateTime40.getEra();
        int int44 = dateTime38.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime46.minusMillis((int) ' ');
        org.joda.time.Duration duration49 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(dateTimeZone50);
        org.joda.time.DateTime.Property property52 = dateTime51.dayOfMonth();
        org.joda.time.DateTime dateTime53 = property52.roundFloorCopy();
        org.joda.time.DateTime.Property property54 = dateTime53.millisOfDay();
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.yearDay();
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.halfdays();
        int int57 = periodType55.indexOf(durationFieldType56);
        org.joda.time.PeriodType periodType58 = periodType55.withWeeksRemoved();
        int int59 = periodType58.size();
        org.joda.time.Period period60 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration49, (org.joda.time.ReadableInstant) dateTime53, periodType58);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(400, 19);
        long long66 = dateTimeZone63.adjustOffset(0L, false);
        org.joda.time.DateTime dateTime67 = dateTime53.withZone(dateTimeZone63);
        int int68 = property33.compareTo((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime69 = property33.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime53 and dateTime67", (dateTime53.compareTo(dateTime67) == 0) == dateTime53.equals(dateTime67));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField11 = chronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfSecond();
        org.joda.time.DurationField durationField13 = chronology9.eras();
        org.joda.time.DurationField durationField14 = chronology9.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField13", Math.signum(durationField11.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField11)));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours1 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours2 = hours0.plus(hours1);
        org.joda.time.Hours hours3 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours4 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours5 = hours3.plus(hours4);
        org.joda.time.Hours hours6 = hours1.minus(hours4);
        org.joda.time.MutablePeriod mutablePeriod7 = hours1.toMutablePeriod();
        mutablePeriod7.setMillis(2147483647);
        org.joda.time.MutablePeriod mutablePeriod10 = mutablePeriod7.copy();
        mutablePeriod7.addHours(292278993);
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod16 = period15.toMutablePeriod();
        org.joda.time.Period period19 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod20 = period19.toMutablePeriod();
        org.joda.time.Period period22 = period19.plusMinutes((int) (byte) 0);
        mutablePeriod16.mergePeriod((org.joda.time.ReadablePeriod) period19);
        mutablePeriod16.addMonths((int) 'u');
        mutablePeriod16.addHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.plusYears((int) '4');
        org.joda.time.DateTime.Property property35 = dateTime32.dayOfWeek();
        org.joda.time.DateTime dateTime38 = dateTime32.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property39 = dateTime32.secondOfMinute();
        org.joda.time.Chronology chronology40 = dateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.dayOfMonth();
        org.joda.time.Period period42 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology40);
        org.joda.time.DurationField durationField43 = chronology40.months();
        mutablePeriod16.setPeriod((long) 1814400, chronology40);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(dateTimeZone46);
        org.joda.time.DateTime dateTime49 = dateTime47.plusYears((int) '4');
        org.joda.time.DateTime.Property property50 = dateTime47.dayOfWeek();
        org.joda.time.DateTime dateTime53 = dateTime47.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property54 = dateTime47.secondOfMinute();
        org.joda.time.Chronology chronology55 = dateTime47.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.dayOfMonth();
        org.joda.time.DurationField durationField57 = chronology55.weeks();
        org.joda.time.DateTimeField dateTimeField58 = chronology55.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField59 = chronology55.monthOfYear();
        mutablePeriod16.add((long) 74, chronology55);
        org.joda.time.DurationField durationField61 = chronology55.weekyears();
        org.joda.time.DurationField durationField62 = chronology55.years();
        org.joda.time.DurationFieldType durationFieldType63 = durationField62.getType();
        mutablePeriod7.add(durationFieldType63, 873);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField61 and durationField62", (durationField61.compareTo(durationField62) == 0) == durationField61.equals(durationField62));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Period period6 = period3.plusSeconds((int) (short) 1);
        org.joda.time.Weeks weeks7 = period6.toStandardWeeks();
        org.joda.time.Weeks weeks9 = weeks7.dividedBy(100);
        org.joda.time.PeriodType periodType10 = weeks7.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType11 = weeks7.getFieldType();
        org.joda.time.Weeks weeks12 = weeks7.negated();
        org.joda.time.PeriodType periodType13 = weeks7.getPeriodType();
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        org.joda.time.Period period20 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod21 = period20.toMutablePeriod();
        org.joda.time.Period period23 = period20.plusMinutes((int) (byte) 0);
        mutablePeriod17.mergePeriod((org.joda.time.ReadablePeriod) period20);
        mutablePeriod17.addMonths((int) 'u');
        mutablePeriod17.addHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.plusYears((int) '4');
        org.joda.time.DateTime.Property property36 = dateTime33.dayOfWeek();
        org.joda.time.DateTime dateTime39 = dateTime33.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property40 = dateTime33.secondOfMinute();
        org.joda.time.Chronology chronology41 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.dayOfMonth();
        org.joda.time.Period period43 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology41);
        org.joda.time.DurationField durationField44 = chronology41.months();
        mutablePeriod17.setPeriod((long) 1814400, chronology41);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime48 = org.joda.time.DateTime.now(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.plusYears((int) '4');
        org.joda.time.DateTime.Property property51 = dateTime48.dayOfWeek();
        org.joda.time.DateTime dateTime54 = dateTime48.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property55 = dateTime48.secondOfMinute();
        org.joda.time.Chronology chronology56 = dateTime48.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.dayOfMonth();
        org.joda.time.DurationField durationField58 = chronology56.weeks();
        org.joda.time.DateTimeField dateTimeField59 = chronology56.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField60 = chronology56.monthOfYear();
        mutablePeriod17.add((long) 74, chronology56);
        org.joda.time.DurationField durationField62 = chronology56.weekyears();
        org.joda.time.DurationField durationField63 = chronology56.years();
        org.joda.time.Period period64 = new org.joda.time.Period(1648178293961L, periodType13, chronology56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField62 and durationField63", (durationField62.compareTo(durationField63) == 0) == durationField62.equals(durationField63));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period9 = period6.plusMinutes((int) (byte) 0);
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) period6);
        mutablePeriod3.addMonths((int) 'u');
        mutablePeriod3.addHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusYears((int) '4');
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfWeek();
        org.joda.time.DateTime dateTime25 = dateTime19.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property26 = dateTime19.secondOfMinute();
        org.joda.time.Chronology chronology27 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.dayOfMonth();
        org.joda.time.Period period29 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology27);
        org.joda.time.DurationField durationField30 = chronology27.months();
        mutablePeriod3.setPeriod((long) 1814400, chronology27);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusYears((int) '4');
        org.joda.time.DateTime.Property property37 = dateTime34.dayOfWeek();
        org.joda.time.DateTime dateTime40 = dateTime34.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property41 = dateTime34.secondOfMinute();
        org.joda.time.Chronology chronology42 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.dayOfMonth();
        org.joda.time.DurationField durationField44 = chronology42.weeks();
        org.joda.time.DateTimeField dateTimeField45 = chronology42.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField46 = chronology42.monthOfYear();
        mutablePeriod3.add((long) 74, chronology42);
        org.joda.time.DurationField durationField48 = chronology42.weekyears();
        org.joda.time.DurationField durationField49 = chronology42.years();
        org.joda.time.DateTimeField dateTimeField50 = chronology42.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField48 and durationField49", (durationField48.compareTo(durationField49) == 0) == durationField48.equals(durationField49));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean1 = instant0.isAfterNow();
        org.joda.time.Instant instant3 = instant0.withMillis((long) (short) 0);
        org.joda.time.DateTime dateTime4 = instant3.toDateTimeISO();
        org.joda.time.Duration duration6 = new org.joda.time.Duration((long) 28);
        org.joda.time.Duration duration9 = duration6.withDurationAdded(1645512059742L, 100);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMillis((int) ' ');
        int int18 = dateTime15.getEra();
        int int19 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMillis((int) ' ');
        org.joda.time.Duration duration24 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime21);
        long long25 = duration24.getMillis();
        boolean boolean26 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration24);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime32 = dateTime28.minusMinutes((int) '#');
        org.joda.time.ReadableInterval readableInterval33 = null;
        org.joda.time.Days days34 = org.joda.time.Days.daysIn(readableInterval33);
        org.joda.time.Duration duration35 = days34.toStandardDuration();
        org.joda.time.Duration duration36 = duration35.toDuration();
        org.joda.time.ReadableDuration readableDuration37 = null;
        boolean boolean38 = duration36.isLongerThan(readableDuration37);
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.Days days40 = org.joda.time.Days.daysIn(readableInterval39);
        org.joda.time.Duration duration41 = days40.toStandardDuration();
        org.joda.time.Duration duration42 = duration41.toDuration();
        org.joda.time.ReadableDuration readableDuration43 = null;
        boolean boolean44 = duration42.isLongerThan(readableDuration43);
        boolean boolean45 = duration36.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableDuration) duration42, periodType46);
        boolean boolean48 = duration24.isLongerThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Instant instant49 = instant3.plus((org.joda.time.ReadableDuration) duration24);
        java.lang.String str50 = instant49.toString();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime56.minusMillis((int) ' ');
        int int59 = dateTime56.getEra();
        int int60 = dateTime54.compareTo((org.joda.time.ReadableInstant) dateTime56);
        int int61 = dateTime54.getEra();
        org.joda.time.DateTime dateTime62 = dateTime54.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime64 = org.joda.time.DateTime.now(dateTimeZone63);
        org.joda.time.DateTime dateTime66 = dateTime64.plusYears((int) '4');
        org.joda.time.DateTime.Property property67 = dateTime64.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime69 = org.joda.time.DateTime.now(dateTimeZone68);
        int int70 = property67.compareTo((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.DateTime dateTime72 = dateTime69.plusWeeks((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime62, (org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.ReadableDuration readableDuration74 = null;
        org.joda.time.PeriodType periodType75 = org.joda.time.PeriodType.yearDay();
        org.joda.time.DurationFieldType durationFieldType76 = org.joda.time.DurationFieldType.halfdays();
        int int77 = periodType75.indexOf(durationFieldType76);
        org.joda.time.PeriodType periodType78 = periodType75.withMillisRemoved();
        org.joda.time.PeriodType periodType79 = periodType75.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime62, readableDuration74, periodType75);
        int int81 = instant49.compareTo((org.joda.time.ReadableInstant) dateTime62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime5 = dateTime1.minusMinutes((int) '#');
        java.lang.String str6 = dateTime5.toString();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.DateTime dateTime9 = dateTime5.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMillis((int) ' ');
        int int18 = dateTime15.getEra();
        int int19 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusYears((int) '4');
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfWeek();
        org.joda.time.DateTime dateTime27 = dateTime21.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property28 = dateTime21.minuteOfHour();
        org.joda.time.DateTime dateTime30 = dateTime21.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime30.getZone();
        long long34 = dateTimeZone31.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime15.toMutableDateTime(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime41 = dateTime37.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime35, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime44 = dateTime37.plusDays(1);
        org.joda.time.TimeOfDay timeOfDay45 = dateTime44.toTimeOfDay();
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime44.toMutableDateTime();
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        boolean boolean49 = instant47.isEqual(10L);
        org.joda.time.Instant instant50 = instant47.toInstant();
        org.joda.time.ReadableInstant readableInstant51 = null;
        boolean boolean52 = instant47.isBefore(readableInstant51);
        org.joda.time.Instant instant54 = instant47.plus(1645518594899L);
        org.joda.time.ReadableInterval readableInterval55 = null;
        org.joda.time.Days days56 = org.joda.time.Days.daysIn(readableInterval55);
        org.joda.time.Duration duration57 = days56.toStandardDuration();
        org.joda.time.Duration duration59 = duration57.withMillis((long) (short) 0);
        org.joda.time.Instant instant61 = instant54.withDurationAdded((org.joda.time.ReadableDuration) duration57, (int) (byte) 0);
        org.joda.time.DateTime dateTime62 = dateTime44.plus((org.joda.time.ReadableDuration) duration57);
        boolean boolean63 = dateTime5.isAfter((org.joda.time.ReadableInstant) dateTime62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant47", (dateTime1.compareTo(instant47) == 0) == dateTime1.equals(instant47));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusYears((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime4.dayOfWeek();
        org.joda.time.DateTime dateTime10 = dateTime4.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property11 = dateTime4.minuteOfHour();
        org.joda.time.DateTime dateTime12 = dateTime4.toDateTime();
        int int13 = dateTime12.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears((int) '4');
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfWeek();
        org.joda.time.DateTime dateTime21 = dateTime15.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property22 = dateTime15.minuteOfHour();
        org.joda.time.DateTime dateTime23 = dateTime15.toDateTime();
        org.joda.time.DateTime dateTime25 = dateTime15.plusMinutes(22);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime15);
        int int27 = dateTime1.compareTo((org.joda.time.ReadableInstant) dateTime12);
        long long28 = dateTime12.getMillis();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.plusYears((int) '4');
        org.joda.time.DateTime.Property property33 = dateTime30.dayOfWeek();
        org.joda.time.DateTime dateTime36 = dateTime30.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property37 = dateTime30.secondOfMinute();
        org.joda.time.Chronology chronology38 = dateTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.dayOfMonth();
        org.joda.time.DurationField durationField40 = chronology38.halfdays();
        org.joda.time.Chronology chronology41 = chronology38.withUTC();
        org.joda.time.DurationField durationField42 = chronology41.halfdays();
        org.joda.time.DateTime dateTime43 = dateTime12.toDateTime(chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField40 and durationField42", (durationField40.compareTo(durationField42) == 0) == durationField40.equals(durationField42));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.Duration duration2 = days1.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.Days days4 = org.joda.time.Days.daysIn(readableInterval3);
        org.joda.time.Duration duration5 = days4.toStandardDuration();
        org.joda.time.Duration duration6 = duration5.toDuration();
        org.joda.time.ReadableDuration readableDuration7 = null;
        boolean boolean8 = duration6.isLongerThan(readableDuration7);
        org.joda.time.Duration duration10 = duration2.withDurationAdded(readableDuration7, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) '4');
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfWeek();
        org.joda.time.DateTime dateTime18 = dateTime12.withDurationAdded((long) 100, 0);
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.Days days20 = org.joda.time.Days.daysIn(readableInterval19);
        org.joda.time.Duration duration21 = days20.toStandardDuration();
        org.joda.time.Duration duration22 = duration21.toDuration();
        org.joda.time.ReadableDuration readableDuration23 = null;
        boolean boolean24 = duration22.isLongerThan(readableDuration23);
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.Days days26 = org.joda.time.Days.daysIn(readableInterval25);
        org.joda.time.Duration duration27 = days26.toStandardDuration();
        org.joda.time.Duration duration28 = duration27.toDuration();
        org.joda.time.ReadableDuration readableDuration29 = null;
        boolean boolean30 = duration28.isLongerThan(readableDuration29);
        boolean boolean31 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableDuration) duration28);
        boolean boolean33 = duration10.isEqual((org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.Days days35 = org.joda.time.Days.daysIn(readableInterval34);
        org.joda.time.Duration duration36 = days35.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.Days days38 = org.joda.time.Days.daysIn(readableInterval37);
        org.joda.time.Duration duration39 = days38.toStandardDuration();
        org.joda.time.Duration duration40 = duration39.toDuration();
        org.joda.time.ReadableDuration readableDuration41 = null;
        boolean boolean42 = duration40.isLongerThan(readableDuration41);
        org.joda.time.Duration duration44 = duration36.withDurationAdded(readableDuration41, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime46.plusYears((int) '4');
        org.joda.time.DateTime.Property property49 = dateTime46.dayOfWeek();
        org.joda.time.DateTime dateTime52 = dateTime46.withDurationAdded((long) 100, 0);
        org.joda.time.ReadableInterval readableInterval53 = null;
        org.joda.time.Days days54 = org.joda.time.Days.daysIn(readableInterval53);
        org.joda.time.Duration duration55 = days54.toStandardDuration();
        org.joda.time.Duration duration56 = duration55.toDuration();
        org.joda.time.ReadableDuration readableDuration57 = null;
        boolean boolean58 = duration56.isLongerThan(readableDuration57);
        org.joda.time.ReadableInterval readableInterval59 = null;
        org.joda.time.Days days60 = org.joda.time.Days.daysIn(readableInterval59);
        org.joda.time.Duration duration61 = days60.toStandardDuration();
        org.joda.time.Duration duration62 = duration61.toDuration();
        org.joda.time.ReadableDuration readableDuration63 = null;
        boolean boolean64 = duration62.isLongerThan(readableDuration63);
        boolean boolean65 = duration56.isShorterThan((org.joda.time.ReadableDuration) duration62);
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableDuration) duration62);
        boolean boolean67 = duration44.isEqual((org.joda.time.ReadableDuration) duration62);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime69 = org.joda.time.DateTime.now(dateTimeZone68);
        org.joda.time.DateTime dateTime71 = dateTime69.plusYears((int) '4');
        org.joda.time.DateTime.Property property72 = dateTime69.dayOfWeek();
        org.joda.time.DateTime dateTime75 = dateTime69.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property76 = dateTime69.minuteOfHour();
        org.joda.time.DateTime dateTime77 = dateTime69.toDateTime();
        java.lang.String str78 = dateTime77.toString();
        org.joda.time.Period period79 = duration62.toPeriodTo((org.joda.time.ReadableInstant) dateTime77);
        long long80 = duration62.getMillis();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime82 = org.joda.time.DateTime.now(dateTimeZone81);
        org.joda.time.DateTime dateTime84 = dateTime82.plusYears((int) '4');
        org.joda.time.DateTime dateTime85 = dateTime84.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property86 = dateTime84.yearOfCentury();
        org.joda.time.DateTime dateTime87 = property86.withMinimumValue();
        org.joda.time.PeriodType periodType88 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period89 = duration62.toPeriodFrom((org.joda.time.ReadableInstant) dateTime87, periodType88);
        boolean boolean90 = duration28.equals((java.lang.Object) dateTime87);
        org.joda.time.Instant instant91 = new org.joda.time.Instant();
        boolean boolean92 = instant91.isAfterNow();
        org.joda.time.Instant instant94 = instant91.withMillis((long) (short) 0);
        org.joda.time.Instant instant96 = instant94.minus(2629746000L);
        org.joda.time.Days days97 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime87, (org.joda.time.ReadableInstant) instant96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant91", (dateTime12.compareTo(instant91) == 0) == dateTime12.equals(instant91));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Instant instant7 = instant3.withDurationAdded(1645514184041L, (int) '4');
        org.joda.time.Instant instant10 = instant7.withDurationAdded((long) (-1), 12);
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Days days12 = org.joda.time.Days.daysIn(readableInterval11);
        org.joda.time.Duration duration13 = days12.toStandardDuration();
        org.joda.time.Duration duration14 = duration13.toDuration();
        org.joda.time.ReadableDuration readableDuration15 = null;
        boolean boolean16 = duration14.isLongerThan(readableDuration15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.Days days18 = org.joda.time.Days.daysIn(readableInterval17);
        org.joda.time.Duration duration19 = days18.toStandardDuration();
        org.joda.time.Duration duration20 = duration19.toDuration();
        org.joda.time.ReadableDuration readableDuration21 = null;
        boolean boolean22 = duration20.isLongerThan(readableDuration21);
        boolean boolean23 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMillis((int) ' ');
        int int28 = dateTime25.getEra();
        org.joda.time.DateTime dateTime30 = dateTime25.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime32 = dateTime25.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval33 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Period period34 = duration14.toPeriod();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.minusMillis((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration14, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant40 = instant10.plus((org.joda.time.ReadableDuration) duration14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime4", (instant0.compareTo(mutableDateTime4) == 0) == instant0.equals(mutableDateTime4));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime5 = dateTime1.minusMinutes((int) '#');
        java.lang.String str6 = dateTime5.toString();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant7.withDurationAdded(readableDuration8, 17);
        org.joda.time.Instant instant12 = instant7.withMillis(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant7", (dateTime5.compareTo(instant7) == 0) == dateTime5.equals(instant7));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime1.withZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMillis((int) ' ');
        int int9 = dateTime6.getEra();
        boolean boolean10 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime6);
        java.util.GregorianCalendar gregorianCalendar11 = dateTime4.toGregorianCalendar();
        org.joda.time.Instant instant12 = new org.joda.time.Instant((java.lang.Object) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusYears((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property20 = dateTime18.yearOfCentury();
        org.joda.time.DateTime dateTime21 = property20.withMinimumValue();
        boolean boolean22 = dateTimeZone14.equals((java.lang.Object) dateTime21);
        org.joda.time.DateTime dateTime24 = dateTime21.plusWeeks((int) (byte) 100);
        boolean boolean25 = dateTime24.isBeforeNow();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusYears((int) '4');
        org.joda.time.DateTime.Property property37 = dateTime34.dayOfWeek();
        org.joda.time.DateTime dateTime40 = dateTime34.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property41 = dateTime34.secondOfMinute();
        org.joda.time.Chronology chronology42 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.dayOfMonth();
        org.joda.time.Period period44 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology42);
        org.joda.time.DurationField durationField45 = chronology42.months();
        org.joda.time.DateTimeField dateTimeField46 = chronology42.weekyear();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology42);
        org.joda.time.DateTimeField dateTimeField48 = chronology42.clockhourOfHalfday();
        org.joda.time.Period period49 = new org.joda.time.Period((long) 93, 4519128886L, periodType30, chronology42);
        org.joda.time.Period period50 = new org.joda.time.Period(0L, (long) 165, periodType30);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant12, (org.joda.time.ReadableInstant) dateTime24, periodType30);
        mutablePeriod51.addDays((int) 'a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant12", (dateTime1.compareTo(instant12) == 0) == dateTime1.equals(instant12));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 10, (int) (byte) 10, 941, 26201768, 5, 864, (int) '4', (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusYears((int) '4');
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime16 = dateTime10.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property17 = dateTime10.minuteOfHour();
        org.joda.time.DateTime dateTime18 = dateTime10.toDateTime();
        int int19 = dateTime18.getWeekyear();
        int int20 = dateTime18.getCenturyOfEra();
        boolean boolean22 = dateTime18.equals((java.lang.Object) (short) 1);
        org.joda.time.DateTime dateTime23 = dateTime18.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = dateTime25.withZone(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusMillis((int) ' ');
        int int33 = dateTime30.getEra();
        boolean boolean34 = dateTime28.isEqual((org.joda.time.ReadableInstant) dateTime30);
        java.util.GregorianCalendar gregorianCalendar35 = dateTime28.toGregorianCalendar();
        org.joda.time.DateTime dateTime37 = dateTime28.minusWeeks(568);
        org.joda.time.DateTime dateTime39 = dateTime28.minus(3300000L);
        org.joda.time.Instant instant40 = dateTime39.toInstant();
        org.joda.time.Hours hours41 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Duration duration42 = period8.toDurationFrom((org.joda.time.ReadableInstant) dateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and instant40", (dateTime39.compareTo(instant40) == 0) == dateTime39.equals(instant40));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime5 = dateTime1.minusMinutes((int) '#');
        java.lang.String str6 = dateTime5.toString();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.DateTime.Property property8 = dateTime5.year();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        int int10 = property8.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant7", (dateTime5.compareTo(instant7) == 0) == dateTime5.equals(instant7));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime1.withZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMillis((int) ' ');
        int int9 = dateTime6.getEra();
        boolean boolean10 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime6);
        java.util.GregorianCalendar gregorianCalendar11 = dateTime4.toGregorianCalendar();
        org.joda.time.DateTime dateTime13 = dateTime4.minusWeeks(568);
        org.joda.time.DateTime dateTime15 = dateTime4.minus(3300000L);
        org.joda.time.Instant instant16 = dateTime15.toInstant();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusYears((int) '4');
        org.joda.time.DateTime.Property property21 = dateTime18.dayOfWeek();
        org.joda.time.DateTime dateTime24 = dateTime18.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property25 = dateTime18.minuteOfHour();
        org.joda.time.DateTime dateTime26 = dateTime18.toDateTime();
        int int27 = dateTime26.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusYears((int) '4');
        org.joda.time.DateTime.Property property32 = dateTime29.dayOfWeek();
        org.joda.time.DateTime dateTime35 = dateTime29.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property36 = dateTime29.minuteOfHour();
        org.joda.time.DateTime dateTime37 = dateTime29.toDateTime();
        org.joda.time.DateTime dateTime39 = dateTime29.plusMinutes(22);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime42 = dateTime26.withYearOfEra(16);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str44 = dateTimeFieldType43.getName();
        boolean boolean45 = dateTime42.isSupported(dateTimeFieldType43);
        org.joda.time.DateTime.Property property46 = dateTime15.property(dateTimeFieldType43);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime48 = org.joda.time.DateTime.now(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.minusMillis((int) ' ');
        int int55 = dateTime52.getEra();
        int int56 = dateTime50.compareTo((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now(dateTimeZone57);
        org.joda.time.DateTime dateTime60 = dateTime58.plusYears((int) '4');
        org.joda.time.DateTime.Property property61 = dateTime58.dayOfWeek();
        org.joda.time.DateTime dateTime64 = dateTime58.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property65 = dateTime58.minuteOfHour();
        org.joda.time.DateTime dateTime67 = dateTime58.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone68 = dateTime67.getZone();
        long long71 = dateTimeZone68.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime72 = dateTime52.toMutableDateTime(dateTimeZone68);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.UTC;
        int int75 = dateTimeZone73.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime76 = dateTime52.withZone(dateTimeZone73);
        org.joda.time.DateTimeZone dateTimeZone77 = dateTime76.getZone();
        org.joda.time.Weeks weeks78 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.PeriodType periodType79 = weeks78.getPeriodType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant16", (dateTime15.compareTo(instant16) == 0) == dateTime15.equals(instant16));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.lang.Object obj0 = null;
        org.joda.time.Instant instant1 = new org.joda.time.Instant(obj0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMillis((int) ' ');
        int int6 = dateTime3.getEra();
        org.joda.time.DateTime dateTime8 = dateTime3.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime3.withYearOfCentury((int) (short) 1);
        org.joda.time.DateTime dateTime11 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int13 = dateTime10.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime10.plusYears((int) 'u');
        boolean boolean16 = instant1.isBefore((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Instant instant17 = instant1.toInstant();
        org.joda.time.DateTime dateTime18 = instant17.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusYears((int) '4');
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfWeek();
        org.joda.time.DateTime dateTime27 = dateTime21.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property28 = dateTime21.secondOfMinute();
        org.joda.time.Chronology chronology29 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.dayOfMonth();
        org.joda.time.DurationField durationField31 = chronology29.millis();
        org.joda.time.DateTimeField dateTimeField32 = chronology29.weekyearOfCentury();
        org.joda.time.Period period33 = new org.joda.time.Period((long) 45, chronology29);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((java.lang.Object) dateTime18, chronology29);
        org.joda.time.DateTimeField dateTimeField35 = chronology29.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime3", (instant1.compareTo(dateTime3) == 0) == instant1.equals(dateTime3));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime1.plusDays(10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusYears((int) '4');
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfWeek();
        org.joda.time.DateTime dateTime14 = dateTime8.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property15 = dateTime8.secondOfMinute();
        org.joda.time.Chronology chronology16 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.dayOfMonth();
        org.joda.time.DurationField durationField18 = chronology16.millis();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 1, chronology16);
        org.joda.time.DateTime dateTime20 = dateTime1.withChronology(chronology16);
        org.joda.time.Period period23 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod24 = period23.toMutablePeriod();
        org.joda.time.Period period26 = period23.plusSeconds((int) (short) 1);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "ja_JP" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList33);
        boolean boolean36 = period26.equals((java.lang.Object) strList35);
        org.joda.time.Period period38 = period26.withHours((int) (byte) 1);
        int[] intArray41 = chronology16.get((org.joda.time.ReadablePeriod) period26, (long) (short) 0, (-78382080000000L));
        org.joda.time.DurationField durationField42 = chronology16.weekyears();
        org.joda.time.DurationField durationField43 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField43, durationField18, and durationField42", !(durationField43.compareTo(durationField18) == 0) || (Math.signum(durationField43.compareTo(durationField42)) == Math.signum(durationField18.compareTo(durationField42))));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusYears((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime8 = dateTime2.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property9 = dateTime2.secondOfMinute();
        org.joda.time.Chronology chronology10 = dateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfMonth();
        org.joda.time.DurationField durationField12 = durationFieldType0.getField(chronology10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, chronology14);
        int int16 = period15.getMillis();
        long long19 = chronology10.add((org.joda.time.ReadablePeriod) period15, (long) (short) 100, 40);
        org.joda.time.DurationField durationField20 = chronology10.years();
        org.joda.time.DurationField durationField21 = chronology10.weekyears();
        org.joda.time.DurationField durationField22 = chronology10.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField21", (durationField22.compareTo(durationField21) == 0) == durationField22.equals(durationField21));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime1.plusDays(10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusYears((int) '4');
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfWeek();
        org.joda.time.DateTime dateTime14 = dateTime8.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property15 = dateTime8.secondOfMinute();
        org.joda.time.Chronology chronology16 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.dayOfMonth();
        org.joda.time.DurationField durationField18 = chronology16.millis();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 1, chronology16);
        org.joda.time.DateTime dateTime20 = dateTime1.withChronology(chronology16);
        org.joda.time.Period period23 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod24 = period23.toMutablePeriod();
        org.joda.time.Period period26 = period23.plusSeconds((int) (short) 1);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "ja_JP" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList33);
        boolean boolean36 = period26.equals((java.lang.Object) strList35);
        org.joda.time.Period period38 = period26.withHours((int) (byte) 1);
        int[] intArray41 = chronology16.get((org.joda.time.ReadablePeriod) period26, (long) (short) 0, (-78382080000000L));
        org.joda.time.DurationField durationField42 = chronology16.weekyears();
        org.joda.time.DurationField durationField43 = chronology16.years();
        org.joda.time.Period period46 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod47 = period46.toMutablePeriod();
        org.joda.time.Period period50 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod51 = period50.toMutablePeriod();
        org.joda.time.Period period53 = period50.plusMinutes((int) (byte) 0);
        mutablePeriod47.mergePeriod((org.joda.time.ReadablePeriod) period50);
        org.joda.time.Period period56 = period50.minusMonths((int) ' ');
        org.joda.time.Period period58 = period56.plusYears((int) (short) 0);
        int[] intArray60 = chronology16.get((org.joda.time.ReadablePeriod) period58, (long) 26218);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField42 and durationField43", (durationField42.compareTo(durationField43) == 0) == durationField42.equals(durationField43));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusYears((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime8 = dateTime2.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property9 = dateTime2.secondOfMinute();
        org.joda.time.Chronology chronology10 = dateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfMonth();
        org.joda.time.DurationField durationField12 = durationFieldType0.getField(chronology10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, chronology14);
        int int16 = period15.getMillis();
        long long19 = chronology10.add((org.joda.time.ReadablePeriod) period15, (long) (short) 100, 40);
        org.joda.time.DurationField durationField20 = chronology10.years();
        org.joda.time.DurationField durationField21 = chronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = chronology10.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField21", (durationField20.compareTo(durationField21) == 0) == durationField20.equals(durationField21));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) '4');
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfWeek();
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property10 = dateTime3.secondOfMinute();
        org.joda.time.Chronology chronology11 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfMonth();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology11);
        org.joda.time.DurationField durationField14 = chronology11.days();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = chronology11.months();
        org.joda.time.DurationField durationField17 = chronology11.days();
        org.joda.time.DurationField durationField18 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField14, and durationField16", !(durationField18.compareTo(durationField14) == 0) || (Math.signum(durationField18.compareTo(durationField16)) == Math.signum(durationField14.compareTo(durationField16))));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMillis((int) (short) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.hourOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.plusDays(54);
        org.joda.time.DateTime dateTime10 = dateTime8.withMillis(0L);
        long long11 = dateTime8.getMillis();
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Days days13 = org.joda.time.Days.daysIn(readableInterval12);
        org.joda.time.Duration duration14 = days13.toStandardDuration();
        org.joda.time.Duration duration15 = duration14.toDuration();
        org.joda.time.ReadableDuration readableDuration16 = null;
        boolean boolean17 = duration15.isLongerThan(readableDuration16);
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.Days days19 = org.joda.time.Days.daysIn(readableInterval18);
        org.joda.time.Duration duration20 = days19.toStandardDuration();
        org.joda.time.Duration duration21 = duration20.toDuration();
        org.joda.time.ReadableDuration readableDuration22 = null;
        boolean boolean23 = duration21.isLongerThan(readableDuration22);
        boolean boolean24 = duration15.isShorterThan((org.joda.time.ReadableDuration) duration21);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.yearDay();
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.halfdays();
        int int27 = periodType25.indexOf(durationFieldType26);
        org.joda.time.PeriodType periodType28 = periodType25.withWeeksRemoved();
        int int29 = periodType28.size();
        org.joda.time.PeriodType periodType30 = periodType28.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableDuration) duration15, periodType30);
        int int32 = periodType30.size();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on mutablePeriod31 and days13.", mutablePeriod31.equals(days13) == days13.equals(mutablePeriod31));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        int int8 = dateTime5.getEra();
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime5.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime31 = dateTime27.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime25, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime.Property property33 = dateTime27.dayOfMonth();
        long long34 = property33.remainder();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.minusMillis((int) ' ');
        int int43 = dateTime40.getEra();
        int int44 = dateTime38.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime46.minusMillis((int) ' ');
        org.joda.time.Duration duration49 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(dateTimeZone50);
        org.joda.time.DateTime.Property property52 = dateTime51.dayOfMonth();
        org.joda.time.DateTime dateTime53 = property52.roundFloorCopy();
        org.joda.time.DateTime.Property property54 = dateTime53.millisOfDay();
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.yearDay();
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.halfdays();
        int int57 = periodType55.indexOf(durationFieldType56);
        org.joda.time.PeriodType periodType58 = periodType55.withWeeksRemoved();
        int int59 = periodType58.size();
        org.joda.time.Period period60 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration49, (org.joda.time.ReadableInstant) dateTime53, periodType58);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(400, 19);
        long long66 = dateTimeZone63.adjustOffset(0L, false);
        org.joda.time.DateTime dateTime67 = dateTime53.withZone(dateTimeZone63);
        int int68 = property33.compareTo((org.joda.time.ReadableInstant) dateTime53);
        int int69 = property33.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime53 and dateTime67", (dateTime53.compareTo(dateTime67) == 0) == dateTime53.equals(dateTime67));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField11 = chronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfSecond();
        org.joda.time.DurationField durationField13 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField13", Math.signum(durationField11.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField11)));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime5 = dateTime1.minusMinutes((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusYears((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime7.dayOfWeek();
        org.joda.time.DateTime dateTime13 = dateTime7.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property14 = dateTime7.minuteOfHour();
        org.joda.time.DateTime dateTime16 = dateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime16.getZone();
        long long20 = dateTimeZone17.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMillis((int) ' ');
        int int25 = dateTime22.getEra();
        org.joda.time.DateTime dateTime27 = dateTime22.minusMinutes((int) (short) 1);
        int int28 = dateTimeZone17.getOffset((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime.Property property29 = dateTime22.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DateTime dateTime32 = dateTime22.withFieldAdded(durationFieldType30, 955);
        boolean boolean33 = dateTime22.isBeforeNow();
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.yearDay();
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.halfdays();
        int int36 = periodType34.indexOf(durationFieldType35);
        org.joda.time.PeriodType periodType37 = periodType34.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime22, periodType37);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.minusMillis((int) ' ');
        int int43 = dateTime40.getEra();
        org.joda.time.DateTime.Property property44 = dateTime40.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval45 = null;
        org.joda.time.Days days46 = org.joda.time.Days.daysIn(readableInterval45);
        org.joda.time.Duration duration47 = days46.toStandardDuration();
        org.joda.time.Duration duration48 = duration47.toDuration();
        org.joda.time.DateTime dateTime50 = dateTime40.withDurationAdded((org.joda.time.ReadableDuration) duration48, (-1));
        org.joda.time.DateTime dateTime52 = dateTime40.minusMinutes((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.plusYears((int) '4');
        org.joda.time.DateTime.Property property57 = dateTime54.dayOfWeek();
        org.joda.time.DateTime dateTime60 = dateTime54.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property61 = dateTime54.secondOfMinute();
        org.joda.time.Chronology chronology62 = dateTime54.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.dayOfMonth();
        org.joda.time.DurationField durationField64 = chronology62.weeks();
        org.joda.time.DateTimeField dateTimeField65 = chronology62.secondOfMinute();
        int int67 = dateTimeField65.getMinimumValue((long) (byte) 0);
        org.joda.time.ReadablePartial readablePartial68 = null;
        java.util.Locale locale70 = java.util.Locale.KOREA;
        java.lang.String str71 = dateTimeField65.getAsText(readablePartial68, 3, locale70);
        int int72 = dateTime40.get(dateTimeField65);
        org.joda.time.DateTime dateTime74 = dateTime40.minusWeeks(40);
        org.joda.time.DateTime.Property property75 = dateTime74.centuryOfEra();
        org.joda.time.DateTime dateTime76 = property75.getDateTime();
        org.joda.time.DateTime dateTime77 = property75.withMaximumValue();
        boolean boolean78 = dateTime22.isBefore((org.joda.time.ReadableInstant) dateTime77);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on mutablePeriod38 and days46.", mutablePeriod38.equals(days46) == days46.equals(mutablePeriod38));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period9 = period6.plusMinutes((int) (byte) 0);
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) period6);
        mutablePeriod3.addMonths((int) 'u');
        mutablePeriod3.addHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusYears((int) '4');
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfWeek();
        org.joda.time.DateTime dateTime25 = dateTime19.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property26 = dateTime19.secondOfMinute();
        org.joda.time.Chronology chronology27 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.dayOfMonth();
        org.joda.time.Period period29 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology27);
        org.joda.time.DurationField durationField30 = chronology27.months();
        mutablePeriod3.setPeriod((long) 1814400, chronology27);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusYears((int) '4');
        org.joda.time.DateTime.Property property37 = dateTime34.dayOfWeek();
        org.joda.time.DateTime dateTime40 = dateTime34.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property41 = dateTime34.secondOfMinute();
        org.joda.time.Chronology chronology42 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.dayOfMonth();
        org.joda.time.DurationField durationField44 = chronology42.weeks();
        org.joda.time.DateTimeField dateTimeField45 = chronology42.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField46 = chronology42.monthOfYear();
        mutablePeriod3.add((long) 74, chronology42);
        org.joda.time.DurationField durationField48 = chronology42.weekyears();
        org.joda.time.DurationField durationField49 = chronology42.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField49, durationField30, and durationField44", !(durationField49.compareTo(durationField30) == 0) || (Math.signum(durationField49.compareTo(durationField44)) == Math.signum(durationField30.compareTo(durationField44))));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField11 = chronology9.weeks();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears((int) '4');
        org.joda.time.DateTime.Property property17 = dateTime14.dayOfWeek();
        org.joda.time.DateTime dateTime20 = dateTime14.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property21 = dateTime14.secondOfMinute();
        org.joda.time.Chronology chronology22 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.minusMillis((int) ' ');
        int int32 = dateTime29.getEra();
        int int33 = dateTime27.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.plusYears((int) '4');
        org.joda.time.DateTime.Property property38 = dateTime35.dayOfWeek();
        org.joda.time.DateTime dateTime41 = dateTime35.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property42 = dateTime35.minuteOfHour();
        org.joda.time.DateTime dateTime44 = dateTime35.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone45 = dateTime44.getZone();
        long long48 = dateTimeZone45.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime29.toMutableDateTime(dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime55 = dateTime51.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime dateTime58 = dateTime51.plusDays(1);
        org.joda.time.TimeOfDay timeOfDay59 = dateTime58.toTimeOfDay();
        int[] intArray61 = chronology22.get((org.joda.time.ReadablePartial) timeOfDay59, (long) 1814400);
        long long63 = chronology9.set((org.joda.time.ReadablePartial) timeOfDay59, 2022L);
        org.joda.time.DurationField durationField64 = chronology9.millis();
        org.joda.time.DateTime dateTime65 = org.joda.time.DateTime.now(chronology9);
        org.joda.time.DurationField durationField66 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField66, durationField11, and durationField64", !(durationField66.compareTo(durationField11) == 0) || (Math.signum(durationField66.compareTo(durationField64)) == Math.signum(durationField11.compareTo(durationField64))));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfSecond();
        java.lang.String str13 = chronology9.toString();
        org.joda.time.DurationField durationField14 = chronology9.months();
        long long18 = chronology9.add(26271571L, (long) 705, 568);
        org.joda.time.DateTimeField dateTimeField19 = chronology9.hourOfHalfday();
        org.joda.time.DurationField durationField20 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField11, and durationField14", !(durationField20.compareTo(durationField11) == 0) || (Math.signum(durationField20.compareTo(durationField14)) == Math.signum(durationField11.compareTo(durationField14))));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(1645512059742L);
        org.joda.time.Chronology chronology2 = dateTime1.getChronology();
        org.joda.time.DateTime.Property property3 = dateTime1.millisOfSecond();
        org.joda.time.DateTime dateTime4 = property3.roundCeilingCopy();
        org.joda.time.DateTime dateTime6 = dateTime4.plusWeeks(26259);
        org.joda.time.DateTime dateTime8 = dateTime6.minusWeeks(24106);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusYears((int) '4');
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime16 = dateTime10.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property17 = dateTime10.secondOfMinute();
        org.joda.time.Chronology chronology18 = dateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.dayOfMonth();
        org.joda.time.DurationField durationField20 = chronology18.halfdays();
        org.joda.time.Chronology chronology21 = chronology18.withUTC();
        org.joda.time.DurationField durationField22 = chronology21.days();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.era();
        org.joda.time.DateTimeField dateTimeField25 = chronology21.secondOfMinute();
        org.joda.time.DateTime dateTime26 = dateTime6.withChronology(chronology21);
        org.joda.time.DateTimeField dateTimeField27 = chronology21.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime26", (dateTime6.compareTo(dateTime26) == 0) == dateTime6.equals(dateTime26));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfMonth();
        java.lang.String str3 = property2.toString();
        org.joda.time.DateTime dateTime5 = property2.addToCopy(59);
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = property2.getAsText(locale6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusYears((int) '4');
        org.joda.time.DateTime dateTime12 = dateTime11.withTimeAtStartOfDay();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime15 = dateTime12.withFieldAdded(durationFieldType13, (int) (byte) 10);
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears(100);
        long long18 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime20 = dateTime17.minusMinutes(1645514160);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMillis((int) ' ');
        int int25 = dateTime22.getEra();
        org.joda.time.LocalTime localTime26 = dateTime22.toLocalTime();
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        boolean boolean29 = instant27.isEqual(10L);
        org.joda.time.Instant instant30 = instant27.toInstant();
        org.joda.time.ReadableInstant readableInstant31 = null;
        boolean boolean32 = instant27.isBefore(readableInstant31);
        org.joda.time.Instant instant34 = instant27.plus(1645518594899L);
        org.joda.time.ReadableInterval readableInterval35 = null;
        org.joda.time.Days days36 = org.joda.time.Days.daysIn(readableInterval35);
        org.joda.time.Duration duration37 = days36.toStandardDuration();
        org.joda.time.Duration duration39 = duration37.withMillis((long) (short) 0);
        org.joda.time.Instant instant41 = instant34.withDurationAdded((org.joda.time.ReadableDuration) duration37, (int) (byte) 0);
        long long42 = duration37.getStandardMinutes();
        org.joda.time.Days days43 = duration37.toStandardDays();
        org.joda.time.DateTime dateTime44 = dateTime22.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTime dateTime45 = dateTime20.plus((org.joda.time.ReadableDuration) duration37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant27", (dateTime1.compareTo(instant27) == 0) == dateTime1.equals(instant27));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime1.withZone(dateTimeZone2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus(4320000001L);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) instant12);
        int int14 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Duration duration16 = org.joda.time.Duration.parse("PT2147483647S");
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.Days days18 = org.joda.time.Days.daysIn(readableInterval17);
        org.joda.time.Duration duration19 = days18.toStandardDuration();
        org.joda.time.Duration duration20 = duration19.toDuration();
        boolean boolean21 = duration16.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInterval readableInterval22 = null;
        org.joda.time.Days days23 = org.joda.time.Days.daysIn(readableInterval22);
        org.joda.time.Duration duration24 = days23.toStandardDuration();
        org.joda.time.Duration duration25 = duration24.toDuration();
        org.joda.time.ReadableDuration readableDuration26 = null;
        boolean boolean27 = duration25.isLongerThan(readableDuration26);
        org.joda.time.ReadableInterval readableInterval28 = null;
        org.joda.time.Days days29 = org.joda.time.Days.daysIn(readableInterval28);
        org.joda.time.Duration duration30 = days29.toStandardDuration();
        org.joda.time.Duration duration31 = duration30.toDuration();
        org.joda.time.ReadableDuration readableDuration32 = null;
        boolean boolean33 = duration31.isLongerThan(readableDuration32);
        boolean boolean34 = duration25.isShorterThan((org.joda.time.ReadableDuration) duration31);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.minusMillis((int) ' ');
        int int39 = dateTime36.getEra();
        org.joda.time.DateTime dateTime41 = dateTime36.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime43 = dateTime36.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval44 = duration25.toIntervalTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Duration duration45 = duration25.toDuration();
        boolean boolean46 = duration19.isLongerThan((org.joda.time.ReadableDuration) duration45);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(dateTimeZone48);
        java.lang.String str50 = dateTimeZone48.getID();
        long long52 = dateTimeZone48.previousTransition((long) (short) 0);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) 1, dateTimeZone48);
        org.joda.time.Interval interval54 = duration19.toIntervalTo((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.Interval interval55 = interval54.toInterval();
        org.joda.time.MutableInterval mutableInterval56 = interval54.toMutableInterval();
        org.joda.time.Duration duration58 = org.joda.time.Duration.parse("PT2147483647S");
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(dateTimeZone59);
        org.joda.time.DateTime.Property property61 = dateTime60.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = null;
        boolean boolean63 = dateTime60.isSupported(dateTimeFieldType62);
        org.joda.time.Period period64 = duration58.toPeriodFrom((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime66 = org.joda.time.DateTime.now(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime66.plusYears((int) '4');
        org.joda.time.DateTime.Property property69 = dateTime66.dayOfWeek();
        org.joda.time.DateTime dateTime72 = dateTime66.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property73 = dateTime66.secondOfMinute();
        org.joda.time.Chronology chronology74 = dateTime66.getChronology();
        org.joda.time.DateTimeField dateTimeField75 = chronology74.dayOfMonth();
        org.joda.time.DurationField durationField76 = chronology74.halfdays();
        org.joda.time.DateTimeField dateTimeField77 = chronology74.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime78 = dateTime60.toMutableDateTime(chronology74);
        boolean boolean79 = mutableInterval56.isBefore((org.joda.time.ReadableInstant) mutableDateTime78);
        org.joda.time.Period period80 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant12, (org.joda.time.ReadableInstant) mutableDateTime78);
        org.joda.time.Period period82 = period80.minusDays(440);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant12", (dateTime1.compareTo(instant12) == 0) == dateTime1.equals(instant12));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        int int8 = dateTime5.getEra();
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMillis((int) ' ');
        org.joda.time.Duration duration14 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Period period17 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod18 = period17.toMutablePeriod();
        org.joda.time.Period period20 = period17.plusSeconds((int) (short) 1);
        org.joda.time.Days days21 = period20.toStandardDays();
        org.joda.time.Days days23 = days21.plus((int) (byte) 1);
        org.joda.time.PeriodType periodType24 = days23.getPeriodType();
        org.joda.time.Period period25 = duration14.toPeriod(periodType24);
        org.joda.time.Instant instant26 = new org.joda.time.Instant();
        boolean boolean27 = instant26.isAfterNow();
        org.joda.time.Instant instant29 = instant26.withMillis((long) (short) 0);
        org.joda.time.Instant instant31 = instant29.minus(2629746000L);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime.Property property34 = dateTime33.dayOfMonth();
        org.joda.time.Interval interval35 = property34.toInterval();
        org.joda.time.DateTime dateTime36 = property34.roundCeilingCopy();
        int int37 = instant29.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant39 = instant29.plus((long) (-1568204351));
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone40);
        org.joda.time.DateTime.Property property42 = dateTime41.dayOfMonth();
        java.lang.String str43 = property42.toString();
        int int44 = property42.getMaximumValue();
        org.joda.time.DateTime dateTime45 = property42.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField46 = property42.getDurationField();
        int int47 = property42.getMinimumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property42.getFieldType();
        org.joda.time.DateTime dateTime49 = property42.roundCeilingCopy();
        org.joda.time.Hours hours50 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) instant29, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime dateTime52 = dateTime49.plusWeeks((-2720));
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration14, (org.joda.time.ReadableInstant) dateTime52, periodType53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant26", (dateTime1.compareTo(instant26) == 0) == dateTime1.equals(instant26));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        int int8 = dateTime5.getEra();
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime5.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime31 = dateTime27.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime25, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime34 = dateTime27.plusDays(1);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((java.lang.Object) dateTime27);
        org.joda.time.Instant instant37 = instant35.plus(7000L);
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime.Property property43 = dateTime42.dayOfMonth();
        org.joda.time.DateTime dateTime44 = property43.roundFloorCopy();
        org.joda.time.DateTime.Property property45 = dateTime44.millisOfDay();
        org.joda.time.Chronology chronology46 = dateTime44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 2147483647, (long) 1814400, periodType40, chronology46);
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.Days days49 = org.joda.time.Days.daysIn(readableInterval48);
        int[] intArray52 = chronology46.get((org.joda.time.ReadablePeriod) days49, (long) (short) 10, (long) 92000);
        org.joda.time.DateTimeField dateTimeField53 = chronology46.halfdayOfDay();
        int int54 = dateTimeField53.getMinimumValue();
        int int56 = dateTimeField53.get(60000L);
        int int57 = instant37.get(dateTimeField53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant35", (dateTime1.compareTo(instant35) == 0) == dateTime1.equals(instant35));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.ReadableInstant readableInstant4 = null;
        boolean boolean5 = instant0.isBefore(readableInstant4);
        long long6 = instant0.getMillis();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMillis((int) ' ');
        int int19 = dateTime16.getEra();
        int int20 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusYears((int) '4');
        org.joda.time.DateTime.Property property25 = dateTime22.dayOfWeek();
        org.joda.time.DateTime dateTime28 = dateTime22.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property29 = dateTime22.minuteOfHour();
        org.joda.time.DateTime dateTime31 = dateTime22.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime31.getZone();
        long long35 = dateTimeZone32.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime16.toMutableDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime42 = dateTime38.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime36, (org.joda.time.ReadableInstant) dateTime38);
        boolean boolean44 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime46 = dateTime8.minusYears(55);
        org.joda.time.DateTime.Property property47 = dateTime46.monthOfYear();
        java.util.Locale locale48 = java.util.Locale.JAPAN;
        java.util.Locale locale49 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet50 = locale49.getUnicodeLocaleAttributes();
        java.lang.String str51 = locale48.getDisplayScript(locale49);
        int int52 = property47.getMaximumTextLength(locale48);
        org.joda.time.DateTime dateTime53 = property47.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime54 = property47.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime56.minusMillis((int) ' ');
        int int59 = dateTime56.getEra();
        org.joda.time.DateTime.Property property60 = dateTime56.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval61 = null;
        org.joda.time.Days days62 = org.joda.time.Days.daysIn(readableInterval61);
        org.joda.time.Duration duration63 = days62.toStandardDuration();
        org.joda.time.Duration duration64 = duration63.toDuration();
        org.joda.time.DateTime dateTime66 = dateTime56.withDurationAdded((org.joda.time.ReadableDuration) duration64, (-1));
        org.joda.time.DateTime dateTime68 = dateTime56.minusMinutes((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime70 = org.joda.time.DateTime.now(dateTimeZone69);
        org.joda.time.DateTime dateTime72 = dateTime70.plusYears((int) '4');
        org.joda.time.DateTime.Property property73 = dateTime70.dayOfWeek();
        org.joda.time.DateTime dateTime76 = dateTime70.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property77 = dateTime70.secondOfMinute();
        org.joda.time.Chronology chronology78 = dateTime70.getChronology();
        org.joda.time.DateTimeField dateTimeField79 = chronology78.dayOfMonth();
        org.joda.time.DurationField durationField80 = chronology78.weeks();
        org.joda.time.DateTimeField dateTimeField81 = chronology78.secondOfMinute();
        int int83 = dateTimeField81.getMinimumValue((long) (byte) 0);
        org.joda.time.ReadablePartial readablePartial84 = null;
        java.util.Locale locale86 = java.util.Locale.KOREA;
        java.lang.String str87 = dateTimeField81.getAsText(readablePartial84, 3, locale86);
        int int88 = dateTime56.get(dateTimeField81);
        org.joda.time.DateTime dateTime90 = dateTime56.minusWeeks(40);
        int int91 = property47.getDifference((org.joda.time.ReadableInstant) dateTime90);
        boolean boolean92 = instant0.isBefore((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.Chronology chronology93 = instant0.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime8", (instant0.compareTo(dateTime8) == 0) == instant0.equals(dateTime8));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, 28, 41, 43, (int) (short) 100, 216, (int) (byte) -1, 26222);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        boolean boolean10 = instant9.isAfterNow();
        org.joda.time.Instant instant12 = instant9.withMillis((long) (short) 0);
        org.joda.time.DateTime dateTime13 = instant12.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears((int) '4');
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfWeek();
        org.joda.time.DateTime dateTime21 = dateTime15.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property22 = dateTime15.minuteOfHour();
        org.joda.time.DateTime dateTime23 = dateTime15.toDateTime();
        java.lang.String str24 = dateTime23.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfMonth();
        org.joda.time.DateTime dateTime29 = property28.roundFloorCopy();
        org.joda.time.DateTime.Property property30 = dateTime29.millisOfDay();
        org.joda.time.Interval interval31 = property30.toInterval();
        long long32 = interval31.toDurationMillis();
        mutablePeriod8.setPeriod((org.joda.time.ReadableInterval) interval31);
        mutablePeriod8.clear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime15", (instant9.compareTo(dateTime15) == 0) == instant9.equals(dateTime15));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.Period period10 = period7.plusSeconds((int) (short) 1);
        org.joda.time.Minutes minutes11 = period7.toStandardMinutes();
        boolean boolean12 = dateTime1.equals((java.lang.Object) minutes11);
        long long13 = dateTime1.getMillis();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears((int) '4');
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfWeek();
        org.joda.time.DateTime dateTime21 = dateTime15.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property22 = dateTime15.secondOfMinute();
        org.joda.time.Chronology chronology23 = dateTime15.getChronology();
        org.joda.time.DateTime dateTime25 = dateTime15.minusYears(0);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime25.toMutableDateTime();
        org.joda.time.Chronology chronology27 = dateTime25.getChronology();
        org.joda.time.Instant instant28 = dateTime25.toInstant();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.plusYears((int) '4');
        org.joda.time.DateTime dateTime34 = dateTime30.plusDays(10);
        org.joda.time.Period period37 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod38 = period37.toMutablePeriod();
        org.joda.time.Period period40 = period37.plusSeconds((int) (short) 1);
        org.joda.time.Minutes minutes41 = period37.toStandardMinutes();
        org.joda.time.Minutes minutes43 = minutes41.multipliedBy(435);
        org.joda.time.Minutes minutes44 = org.joda.time.Minutes.MIN_VALUE;
        boolean boolean45 = minutes41.isGreaterThan(minutes44);
        org.joda.time.Period period48 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod49 = period48.toMutablePeriod();
        org.joda.time.Period period51 = period48.plusSeconds((int) (short) 1);
        org.joda.time.Minutes minutes52 = period48.toStandardMinutes();
        org.joda.time.Minutes minutes54 = minutes52.multipliedBy(435);
        org.joda.time.Minutes minutes55 = org.joda.time.Minutes.MIN_VALUE;
        boolean boolean56 = minutes52.isGreaterThan(minutes55);
        org.joda.time.PeriodType periodType57 = minutes52.getPeriodType();
        org.joda.time.Minutes minutes58 = minutes52.negated();
        org.joda.time.Minutes minutes59 = minutes44.plus(minutes52);
        org.joda.time.PeriodType periodType60 = minutes59.getPeriodType();
        org.joda.time.Period period61 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant28, (org.joda.time.ReadableInstant) dateTime34, periodType60);
        org.joda.time.Instant instant63 = instant28.minus(604800000L);
        org.joda.time.Instant instant66 = instant63.withDurationAdded((long) 291, 26328);
        org.joda.time.Weeks weeks67 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) instant63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant28", (dateTime15.compareTo(instant28) == 0) == dateTime15.equals(instant28));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 40, 0);
        org.joda.time.Chronology chronology4 = instant0.getChronology();
        org.joda.time.Instant instant6 = instant0.plus((long) (-2148390));
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.Duration duration10 = new org.joda.time.Duration(1645514252309L, (long) 26227);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant6, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) '4');
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfWeek();
        org.joda.time.DateTime dateTime19 = dateTime13.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property20 = dateTime13.secondOfMinute();
        org.joda.time.Chronology chronology21 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.dayOfMonth();
        org.joda.time.DurationField durationField23 = chronology21.weeks();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField25 = chronology21.monthOfYear();
        int int27 = dateTimeField25.getMaximumValue((long) 'a');
        java.util.Locale locale29 = java.util.Locale.TAIWAN;
        java.lang.String str30 = locale29.getVariant();
        java.lang.String str31 = dateTimeField25.getAsText(0L, locale29);
        java.util.Locale locale32 = java.util.Locale.GERMANY;
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.lang.String str34 = locale32.getDisplayLanguage(locale33);
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.lang.String str36 = locale35.getDisplayLanguage();
        java.lang.String str37 = locale32.getDisplayVariant(locale35);
        java.lang.String str38 = locale29.getDisplayLanguage(locale32);
        java.lang.String str39 = locale32.getScript();
        java.util.Locale locale40 = locale32.stripExtensions();
        boolean boolean41 = duration10.equals((java.lang.Object) locale32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime13", (instant0.compareTo(dateTime13) == 0) == instant0.equals(dateTime13));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        int int4 = dateTime1.getEra();
        org.joda.time.DateTime.Property property5 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) dateTime6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = dateTime9.withZone(dateTimeZone10);
        org.joda.time.DateTime.Property property13 = dateTime12.weekyear();
        boolean boolean14 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime16 = dateTime6.withHourOfDay(20);
        org.joda.time.LocalTime localTime17 = dateTime6.toLocalTime();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime.Property property20 = dateTime19.dayOfMonth();
        org.joda.time.DateTime dateTime21 = property20.roundFloorCopy();
        org.joda.time.DateTime dateTime23 = dateTime21.plus(4320000001L);
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) instant24);
        org.joda.time.DateTime dateTime26 = localTime17.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Instant instant27 = instant24.toInstant();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.minusMillis((int) ' ');
        int int36 = dateTime33.getEra();
        int int37 = dateTime31.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.plusYears((int) '4');
        org.joda.time.DateTime.Property property42 = dateTime39.dayOfWeek();
        org.joda.time.DateTime dateTime45 = dateTime39.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property46 = dateTime39.minuteOfHour();
        org.joda.time.DateTime dateTime48 = dateTime39.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTime48.getZone();
        long long52 = dateTimeZone49.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime33.toMutableDateTime(dateTimeZone49);
        org.joda.time.ReadableInterval readableInterval54 = null;
        org.joda.time.Days days55 = org.joda.time.Days.daysIn(readableInterval54);
        org.joda.time.Duration duration56 = days55.toStandardDuration();
        org.joda.time.Duration duration57 = duration56.toDuration();
        org.joda.time.ReadableDuration readableDuration58 = null;
        boolean boolean59 = duration57.isLongerThan(readableDuration58);
        org.joda.time.ReadableInterval readableInterval60 = null;
        org.joda.time.Days days61 = org.joda.time.Days.daysIn(readableInterval60);
        org.joda.time.Duration duration62 = days61.toStandardDuration();
        org.joda.time.Duration duration63 = duration62.toDuration();
        org.joda.time.ReadableDuration readableDuration64 = null;
        boolean boolean65 = duration63.isLongerThan(readableDuration64);
        boolean boolean66 = duration57.isShorterThan((org.joda.time.ReadableDuration) duration63);
        org.joda.time.ReadableInterval readableInterval67 = null;
        org.joda.time.Days days68 = org.joda.time.Days.daysIn(readableInterval67);
        org.joda.time.Duration duration69 = days68.toStandardDuration();
        org.joda.time.Duration duration70 = duration69.toDuration();
        boolean boolean71 = duration63.isLongerThan((org.joda.time.ReadableDuration) duration70);
        org.joda.time.PeriodType periodType72 = org.joda.time.PeriodType.weeks();
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime53, (org.joda.time.ReadableDuration) duration70, periodType72);
        org.joda.time.ReadableInterval readableInterval74 = null;
        org.joda.time.Days days75 = org.joda.time.Days.daysIn(readableInterval74);
        org.joda.time.Duration duration76 = days75.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval77 = null;
        org.joda.time.Days days78 = org.joda.time.Days.daysIn(readableInterval77);
        org.joda.time.Duration duration79 = days78.toStandardDuration();
        org.joda.time.Duration duration80 = duration79.toDuration();
        org.joda.time.ReadableDuration readableDuration81 = null;
        boolean boolean82 = duration80.isLongerThan(readableDuration81);
        org.joda.time.Duration duration84 = duration76.withDurationAdded(readableDuration81, (int) (byte) 100);
        org.joda.time.Duration duration87 = duration84.withDurationAdded((long) (short) 1, 55);
        int int88 = duration70.compareTo((org.joda.time.ReadableDuration) duration87);
        long long89 = duration70.getMillis();
        org.joda.time.Instant instant91 = instant27.withDurationAdded((org.joda.time.ReadableDuration) duration70, 0);
        org.joda.time.Instant instant94 = instant27.withDurationAdded((long) 31, 26160357);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant27", (dateTime1.compareTo(instant27) == 0) == dateTime1.equals(instant27));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.ReadableInstant readableInstant4 = null;
        boolean boolean5 = instant0.isBefore(readableInstant4);
        org.joda.time.Instant instant7 = instant0.plus(1645518594899L);
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Days days9 = org.joda.time.Days.daysIn(readableInterval8);
        org.joda.time.Duration duration10 = days9.toStandardDuration();
        org.joda.time.Duration duration12 = duration10.withMillis((long) (short) 0);
        org.joda.time.Instant instant14 = instant7.withDurationAdded((org.joda.time.ReadableDuration) duration10, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusYears((int) '4');
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfWeek();
        boolean boolean20 = dateTime16.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime24.getZone();
        boolean boolean27 = dateTimeZone25.isStandardOffset(0L);
        int int29 = dateTimeZone25.getStandardOffset((long) 999);
        java.util.TimeZone timeZone30 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime31 = dateTime16.withZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTime.Property property32 = dateTime31.millisOfDay();
        org.joda.time.Interval interval33 = duration10.toIntervalTo((org.joda.time.ReadableInstant) dateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime31", (instant0.compareTo(dateTime31) == 0) == instant0.equals(dateTime31));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.Period period3 = period2.negated();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMillis((int) ' ');
        int int12 = dateTime9.getEra();
        int int13 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears((int) '4');
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfWeek();
        org.joda.time.DateTime dateTime21 = dateTime15.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property22 = dateTime15.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime15.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime24.getZone();
        long long28 = dateTimeZone25.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime9.toMutableDateTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        int int32 = dateTimeZone30.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime33 = dateTime9.withZone(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.plusYears((int) '4');
        org.joda.time.DateTime.Property property38 = dateTime35.dayOfWeek();
        org.joda.time.DateTime dateTime41 = dateTime35.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property42 = dateTime35.minuteOfHour();
        int int43 = property42.getMaximumValue();
        boolean boolean44 = property42.isLeap();
        org.joda.time.DurationField durationField45 = property42.getDurationField();
        org.joda.time.DateTime dateTime46 = property42.roundHalfFloorCopy();
        boolean boolean47 = dateTime33.isAfter((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime49 = dateTime33.plusMillis(26193);
        org.joda.time.Duration duration50 = period3.toDurationTo((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Period period52 = period3.withHours(26368302);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime33", (dateTime5.compareTo(dateTime33) == 0) == dateTime5.equals(dateTime33));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        int int4 = dateTime1.getEra();
        org.joda.time.DateTime.Property property5 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime6 = property5.roundHalfFloorCopy();
        int int7 = dateTime6.getYearOfEra();
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant8.withDurationAdded((long) 40, 0);
        org.joda.time.Chronology chronology12 = instant8.getChronology();
        boolean boolean13 = dateTime6.isBefore((org.joda.time.ReadableInstant) instant8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant8", (dateTime1.compareTo(instant8) == 0) == dateTime1.equals(instant8));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours1 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours2 = hours0.plus(hours1);
        org.joda.time.DurationFieldType durationFieldType3 = hours0.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusYears((int) '4');
        org.joda.time.DateTime.Property property8 = dateTime5.dayOfWeek();
        org.joda.time.DateTime dateTime11 = dateTime5.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property12 = dateTime5.secondOfMinute();
        org.joda.time.Chronology chronology13 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.dayOfMonth();
        org.joda.time.DurationField durationField15 = chronology13.millis();
        org.joda.time.DurationField durationField16 = chronology13.minutes();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology13);
        boolean boolean18 = durationFieldType3.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField19 = chronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology13.dayOfYear();
        org.joda.time.DurationField durationField21 = chronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField15, and durationField16", !(durationField21.compareTo(durationField15) == 0) || (Math.signum(durationField21.compareTo(durationField16)) == Math.signum(durationField15.compareTo(durationField16))));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime5 = dateTime1.minusMinutes((int) '#');
        java.lang.String str6 = dateTime5.toString();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.DateTime dateTime9 = dateTime5.withMillisOfDay((int) (short) 100);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder10.setLanguage("");
        java.util.Locale.Builder builder13 = builder10.clear();
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale.Builder builder16 = builder13.removeUnicodeLocaleAttribute("1972");
        boolean boolean17 = dateTime5.equals((java.lang.Object) builder16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime23 = dateTime19.minusMinutes((int) '#');
        java.lang.String str24 = dateTime23.toString();
        org.joda.time.Instant instant25 = dateTime23.toInstant();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Instant instant28 = instant25.withDurationAdded(readableDuration26, 17);
        boolean boolean29 = dateTime5.isEqual((org.joda.time.ReadableInstant) instant28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime23", (instant7.compareTo(dateTime23) == 0) == instant7.equals(dateTime23));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean1 = instant0.isAfterNow();
        org.joda.time.Instant instant3 = instant0.withMillis((long) (short) 0);
        org.joda.time.Instant instant6 = instant3.withDurationAdded(1645514318849L, 570);
        org.joda.time.Chronology chronology7 = instant3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMillis((int) ' ');
        int int16 = dateTime13.getEra();
        int int17 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusYears((int) '4');
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfWeek();
        org.joda.time.DateTime dateTime25 = dateTime19.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property26 = dateTime19.minuteOfHour();
        org.joda.time.DateTime dateTime28 = dateTime19.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime28.getZone();
        long long32 = dateTimeZone29.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime13.toMutableDateTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime39 = dateTime35.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime33, (org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DurationFieldType[] durationFieldTypeArray41 = mutablePeriod40.getFieldTypes();
        org.joda.time.Days days42 = org.joda.time.Days.SIX;
        mutablePeriod40.mergePeriod((org.joda.time.ReadablePeriod) days42);
        org.joda.time.Days days45 = days42.multipliedBy(26193);
        org.joda.time.Days days46 = org.joda.time.Days.MIN_VALUE;
        org.joda.time.Period period49 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod50 = period49.toMutablePeriod();
        org.joda.time.Period period52 = period49.plusSeconds((int) (short) 1);
        org.joda.time.Days days53 = period52.toStandardDays();
        org.joda.time.Days days55 = days53.plus((int) (byte) 1);
        org.joda.time.Days days56 = days46.plus(days53);
        org.joda.time.Duration duration57 = days53.toStandardDuration();
        org.joda.time.Days days59 = days53.plus(941);
        org.joda.time.Days days60 = days45.plus(days53);
        int int61 = days45.size();
        org.joda.time.Duration duration62 = days45.toStandardDuration();
        org.joda.time.Instant instant63 = instant3.plus((org.joda.time.ReadableDuration) duration62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime9", (instant0.compareTo(dateTime9) == 0) == instant0.equals(dateTime9));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime5 = dateTime1.minusMinutes((int) '#');
        java.lang.String str6 = dateTime5.toString();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.Chronology chronology8 = instant7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField10 = chronology8.minutes();
        org.joda.time.DurationFieldType durationFieldType11 = durationField10.getType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant7", (dateTime5.compareTo(instant7) == 0) == dateTime5.equals(instant7));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period5 = period2.plusSeconds((int) (short) 1);
        org.joda.time.Period period7 = period5.multipliedBy((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod8 = period5.toMutablePeriod();
        mutablePeriod8.setSeconds(26205);
        mutablePeriod8.addHours(26);
        org.joda.time.MutablePeriod mutablePeriod13 = mutablePeriod8.copy();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears((int) '4');
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfWeek();
        org.joda.time.DateTime dateTime21 = dateTime15.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property22 = dateTime15.minuteOfHour();
        org.joda.time.DateTime dateTime23 = dateTime15.toDateTime();
        int int24 = dateTime23.getWeekyear();
        org.joda.time.DateTime dateTime27 = dateTime23.withDurationAdded(1645514162730L, 955);
        org.joda.time.DateTime dateTime29 = dateTime23.minusSeconds(0);
        java.util.GregorianCalendar gregorianCalendar30 = dateTime23.toGregorianCalendar();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(0, 28, 41, 43, (int) (short) 100, 216, (int) (byte) -1, 26222);
        org.joda.time.Instant instant40 = new org.joda.time.Instant();
        boolean boolean41 = instant40.isAfterNow();
        org.joda.time.Instant instant43 = instant40.withMillis((long) (short) 0);
        org.joda.time.DateTime dateTime44 = instant43.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime46.plusYears((int) '4');
        org.joda.time.DateTime.Property property49 = dateTime46.dayOfWeek();
        org.joda.time.DateTime dateTime52 = dateTime46.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property53 = dateTime46.minuteOfHour();
        org.joda.time.DateTime dateTime54 = dateTime46.toDateTime();
        java.lang.String str55 = dateTime54.toString();
        mutablePeriod39.setPeriod((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime54);
        int int57 = dateTime54.getWeekOfWeekyear();
        mutablePeriod8.setPeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime54);
        mutablePeriod8.addSeconds(26365636);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant40", (dateTime15.compareTo(instant40) == 0) == dateTime15.equals(instant40));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime5 = dateTime1.minusMinutes((int) '#');
        java.lang.String str6 = dateTime5.toString();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.DateTime.Property property8 = dateTime5.year();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) '4');
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfWeek();
        org.joda.time.DateTime dateTime18 = dateTime12.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property19 = dateTime12.secondOfMinute();
        org.joda.time.Chronology chronology20 = dateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.dayOfMonth();
        org.joda.time.DurationField durationField22 = durationFieldType10.getField(chronology20);
        org.joda.time.Chronology chronology23 = chronology20.withUTC();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.era();
        org.joda.time.DateTime dateTime25 = dateTime9.toDateTime(chronology23);
        org.joda.time.Period period28 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod29 = period28.toMutablePeriod();
        org.joda.time.Period period31 = period28.plusSeconds((int) (short) 1);
        org.joda.time.Minutes minutes32 = period28.toStandardMinutes();
        org.joda.time.Minutes minutes34 = minutes32.multipliedBy(435);
        org.joda.time.Minutes minutes35 = org.joda.time.Minutes.MIN_VALUE;
        boolean boolean36 = minutes32.isGreaterThan(minutes35);
        org.joda.time.Minutes minutes38 = minutes35.plus(435);
        int int39 = minutes38.getMinutes();
        org.joda.time.Period period42 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod43 = period42.toMutablePeriod();
        org.joda.time.Period period45 = period42.plusSeconds((int) (short) 1);
        org.joda.time.Minutes minutes46 = period42.toStandardMinutes();
        org.joda.time.Minutes minutes48 = minutes46.multipliedBy(435);
        org.joda.time.Minutes minutes49 = org.joda.time.Minutes.MIN_VALUE;
        boolean boolean50 = minutes46.isGreaterThan(minutes49);
        org.joda.time.Minutes minutes52 = minutes49.plus(435);
        int int53 = minutes52.getMinutes();
        int int54 = minutes52.getMinutes();
        boolean boolean55 = minutes38.isLessThan(minutes52);
        int[] intArray57 = chronology23.get((org.joda.time.ReadablePeriod) minutes38, 1645514219144L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant7", (dateTime5.compareTo(instant7) == 0) == dateTime5.equals(instant7));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfMonth();
        java.lang.String str3 = property2.toString();
        org.joda.time.DateTime dateTime5 = property2.addToCopy(59);
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = property2.getAsText(locale6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusYears((int) '4');
        org.joda.time.DateTime dateTime12 = dateTime11.withTimeAtStartOfDay();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime15 = dateTime12.withFieldAdded(durationFieldType13, (int) (byte) 10);
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears(100);
        long long18 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusYears((int) '4');
        org.joda.time.DateTime.Property property23 = dateTime20.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        int int26 = property23.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DurationField durationField27 = property23.getLeapDurationField();
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale28.getDisplayVariant();
        int int30 = property23.getMaximumTextLength(locale28);
        org.joda.time.Period period33 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod34 = period33.toMutablePeriod();
        org.joda.time.Period period36 = period33.plusSeconds((int) (short) 1);
        org.joda.time.Period period38 = period36.multipliedBy((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod39 = period36.toMutablePeriod();
        org.joda.time.Period period41 = period36.minusMillis((int) (short) 100);
        org.joda.time.Period period43 = period36.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime46.plusYears((int) '4');
        org.joda.time.DateTime.Property property49 = dateTime46.dayOfWeek();
        org.joda.time.DateTime dateTime52 = dateTime46.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property53 = dateTime46.minuteOfHour();
        org.joda.time.DateTime dateTime54 = dateTime46.toDateTime();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(readableDuration44, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime58 = dateTime46.withDurationAdded((long) (byte) 10, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime60.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime64 = org.joda.time.DateTime.now(dateTimeZone63);
        org.joda.time.DateTime dateTime66 = dateTime64.minusMillis((int) ' ');
        int int67 = dateTime64.getEra();
        int int68 = dateTime62.compareTo((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime70 = org.joda.time.DateTime.now(dateTimeZone69);
        org.joda.time.DateTime dateTime72 = dateTime70.plusYears((int) '4');
        org.joda.time.DateTime.Property property73 = dateTime70.dayOfWeek();
        org.joda.time.DateTime dateTime76 = dateTime70.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property77 = dateTime70.minuteOfHour();
        org.joda.time.DateTime dateTime79 = dateTime70.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone80 = dateTime79.getZone();
        long long83 = dateTimeZone80.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime84 = dateTime64.toMutableDateTime(dateTimeZone80);
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.UTC;
        int int87 = dateTimeZone85.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime88 = dateTime64.withZone(dateTimeZone85);
        org.joda.time.Seconds seconds89 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.Duration duration90 = period43.toDurationTo((org.joda.time.ReadableInstant) dateTime58);
        int int91 = property23.getDifference((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime88", (dateTime1.compareTo(dateTime88) == 0) == dateTime1.equals(dateTime88));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours1 = org.joda.time.Hours.SEVEN;
        boolean boolean2 = hours0.isLessThan(hours1);
        org.joda.time.Duration duration3 = hours0.toStandardDuration();
        java.lang.Object obj4 = null;
        boolean boolean5 = duration3.equals(obj4);
        org.joda.time.Duration duration8 = duration3.withDurationAdded(4320000001L, (int) (short) 100);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant9.withDurationAdded((long) 40, 0);
        org.joda.time.DateTime dateTime13 = instant12.toDateTimeISO();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration3, (org.joda.time.ReadableInstant) instant12, periodType14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime13", (instant12.compareTo(dateTime13) == 0) == instant12.equals(dateTime13));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 40, 0);
        org.joda.time.Chronology chronology4 = instant0.getChronology();
        org.joda.time.Instant instant6 = instant0.plus((long) (-2148390));
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod10 = period9.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Days days12 = org.joda.time.Days.daysIn(readableInterval11);
        org.joda.time.Duration duration13 = days12.toStandardDuration();
        org.joda.time.Duration duration14 = duration13.toDuration();
        org.joda.time.ReadableDuration readableDuration15 = null;
        boolean boolean16 = duration14.isLongerThan(readableDuration15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.Days days18 = org.joda.time.Days.daysIn(readableInterval17);
        org.joda.time.Duration duration19 = days18.toStandardDuration();
        org.joda.time.Duration duration20 = duration19.toDuration();
        org.joda.time.ReadableDuration readableDuration21 = null;
        boolean boolean22 = duration20.isLongerThan(readableDuration21);
        boolean boolean23 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMillis((int) ' ');
        int int28 = dateTime25.getEra();
        org.joda.time.DateTime dateTime30 = dateTime25.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime32 = dateTime25.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval33 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime25);
        mutablePeriod10.add((org.joda.time.ReadableInterval) interval33);
        mutablePeriod10.addYears((int) ' ');
        mutablePeriod10.setSeconds((int) (byte) 100);
        mutablePeriod10.setDays((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusMillis((int) ' ');
        int int45 = dateTime42.getEra();
        org.joda.time.DateTime.Property property46 = dateTime42.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval47 = null;
        org.joda.time.Days days48 = org.joda.time.Days.daysIn(readableInterval47);
        org.joda.time.Duration duration49 = days48.toStandardDuration();
        org.joda.time.Duration duration50 = duration49.toDuration();
        org.joda.time.DateTime dateTime52 = dateTime42.withDurationAdded((org.joda.time.ReadableDuration) duration50, (-1));
        org.joda.time.Duration duration54 = duration50.plus((-1L));
        long long55 = duration50.getStandardMinutes();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration50);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime59 = org.joda.time.DateTime.now(dateTimeZone58);
        java.lang.String str60 = dateTimeZone58.getID();
        long long62 = dateTimeZone58.previousTransition((long) (short) 0);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) 1, dateTimeZone58);
        org.joda.time.Interval interval64 = duration50.toIntervalFrom((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Instant instant66 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration50, 26230665);
        org.joda.time.DateTime dateTime67 = instant66.toDateTime();
        org.joda.time.Instant instant69 = instant66.plus((long) 26337891);
        long long70 = instant69.getMillis();
        org.joda.time.MutableDateTime mutableDateTime71 = instant69.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime25", (instant0.compareTo(dateTime25) == 0) == instant0.equals(dateTime25));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusYears((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime8 = dateTime2.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property9 = dateTime2.minuteOfHour();
        org.joda.time.DateTime dateTime10 = dateTime2.toDateTime();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(readableDuration0, (org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime dateTime14 = dateTime2.withDurationAdded((long) (byte) 10, (int) 'a');
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.Days days16 = org.joda.time.Days.daysIn(readableInterval15);
        org.joda.time.Duration duration17 = days16.toStandardDuration();
        org.joda.time.Duration duration18 = duration17.toDuration();
        org.joda.time.ReadableDuration readableDuration19 = null;
        boolean boolean20 = duration18.isLongerThan(readableDuration19);
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.Days days22 = org.joda.time.Days.daysIn(readableInterval21);
        org.joda.time.Duration duration23 = days22.toStandardDuration();
        org.joda.time.Duration duration24 = duration23.toDuration();
        org.joda.time.ReadableDuration readableDuration25 = null;
        boolean boolean26 = duration24.isLongerThan(readableDuration25);
        boolean boolean27 = duration18.isShorterThan((org.joda.time.ReadableDuration) duration24);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration18, periodType28);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(1645512059742L);
        org.joda.time.Chronology chronology32 = dateTime31.getChronology();
        org.joda.time.DateTime.Property property33 = dateTime31.millisOfSecond();
        org.joda.time.DateTime dateTime34 = property33.roundCeilingCopy();
        org.joda.time.DateTime dateTime36 = dateTime34.plusWeeks(26259);
        org.joda.time.DateTime dateTime38 = dateTime36.minusWeeks(24106);
        org.joda.time.Instant instant39 = new org.joda.time.Instant();
        org.joda.time.Instant instant42 = instant39.withDurationAdded((long) 40, 0);
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) instant39);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(dateTimeZone46);
        org.joda.time.DateTime dateTime48 = dateTime45.withZone(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.minusMillis((int) ' ');
        int int53 = dateTime50.getEra();
        boolean boolean54 = dateTime48.isEqual((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.ReadableInterval readableInterval55 = null;
        org.joda.time.Days days56 = org.joda.time.Days.daysIn(readableInterval55);
        org.joda.time.Duration duration57 = days56.toStandardDuration();
        org.joda.time.Duration duration58 = duration57.toDuration();
        org.joda.time.ReadableDuration readableDuration59 = null;
        boolean boolean60 = duration58.isLongerThan(readableDuration59);
        org.joda.time.ReadableInterval readableInterval61 = null;
        org.joda.time.Days days62 = org.joda.time.Days.daysIn(readableInterval61);
        org.joda.time.Duration duration63 = days62.toStandardDuration();
        long long64 = duration63.getStandardHours();
        java.lang.String str65 = duration63.toString();
        boolean boolean66 = duration58.isEqual((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Duration duration68 = duration63.plus(0L);
        org.joda.time.Period period69 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime48, (org.joda.time.ReadableDuration) duration63);
        org.joda.time.Instant instant70 = instant39.plus((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Interval interval71 = duration18.toIntervalFrom((org.joda.time.ReadableInstant) instant39);
        org.joda.time.MutableInterval mutableInterval72 = interval71.toMutableInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant39", (dateTime2.compareTo(instant39) == 0) == dateTime2.equals(instant39));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMillis((int) (short) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.hourOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.plusDays(54);
        org.joda.time.DateTime.Property property9 = dateTime3.dayOfMonth();
        int int10 = dateTime3.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone12.getName(26190964L, locale14);
        org.joda.time.DateTime dateTime16 = dateTime3.toDateTime(dateTimeZone12);
        java.lang.String str18 = dateTimeZone12.getNameKey(437L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime16", (dateTime3.compareTo(dateTime16) == 0) == dateTime3.equals(dateTime16));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime1.withZone(dateTimeZone2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus(4320000001L);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) instant12);
        int int14 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) instant12);
        org.joda.time.DateTime dateTime15 = instant12.toDateTimeISO();
        org.joda.time.Period period17 = org.joda.time.Period.days((int) (short) 10);
        org.joda.time.Period period19 = period17.multipliedBy(600000);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getRangeDurationType();
        org.joda.time.Period period23 = period17.withField(durationFieldType21, 0);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusYears((int) '4');
        org.joda.time.DateTime.Property property28 = dateTime25.dayOfWeek();
        org.joda.time.DateTime dateTime31 = dateTime25.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property32 = dateTime25.secondOfMinute();
        org.joda.time.Chronology chronology33 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.dayOfMonth();
        org.joda.time.DurationField durationField35 = chronology33.halfdays();
        org.joda.time.DurationField durationField36 = chronology33.minutes();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.millisOfDay();
        boolean boolean38 = durationFieldType21.isSupported(chronology33);
        org.joda.time.DateTime dateTime40 = dateTime15.withFieldAdded(durationFieldType21, 26319);
        org.joda.time.DateTime.Property property41 = dateTime40.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant12", (dateTime1.compareTo(instant12) == 0) == dateTime1.equals(instant12));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone5);
        int int7 = property4.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DurationField durationField8 = property4.getLeapDurationField();
        org.joda.time.DateTime dateTime10 = property4.setCopy((int) (byte) 1);
        org.joda.time.DateTime dateTime12 = property4.addToCopy(2022L);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths(365);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = dateTime16.withZone(dateTimeZone17);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfMonth();
        org.joda.time.DateTime dateTime24 = property23.roundFloorCopy();
        org.joda.time.DateTime dateTime26 = dateTime24.plus(4320000001L);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) instant27);
        int int29 = dateTimeZone17.getOffset((org.joda.time.ReadableInstant) instant27);
        org.joda.time.MutableDateTime mutableDateTime30 = instant27.toMutableDateTime();
        long long31 = instant27.getMillis();
        long long32 = instant27.getMillis();
        org.joda.time.MutableDateTime mutableDateTime33 = instant27.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime34 = instant27.toMutableDateTime();
        boolean boolean35 = dateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant27", (dateTime1.compareTo(instant27) == 0) == dateTime1.equals(instant27));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.Instant instant5 = instant0.minus((long) 'u');
        org.joda.time.Instant instant7 = instant0.withMillis(4518960357L);
        org.joda.time.Duration duration9 = org.joda.time.Duration.parse("PT2147483647S");
        long long10 = duration9.getStandardHours();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMillis((int) ' ');
        int int15 = dateTime12.getEra();
        org.joda.time.DateTime.Property property16 = dateTime12.secondOfMinute();
        org.joda.time.Period period17 = duration9.toPeriodTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime22 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property23 = dateTime22.minuteOfHour();
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.Days days25 = org.joda.time.Days.daysIn(readableInterval24);
        org.joda.time.Duration duration26 = days25.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.Days days28 = org.joda.time.Days.daysIn(readableInterval27);
        org.joda.time.Duration duration29 = days28.toStandardDuration();
        org.joda.time.Duration duration30 = duration29.toDuration();
        org.joda.time.ReadableDuration readableDuration31 = null;
        boolean boolean32 = duration30.isLongerThan(readableDuration31);
        org.joda.time.Duration duration34 = duration26.withDurationAdded(readableDuration31, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.minusMillis((int) ' ');
        int int39 = dateTime36.getEra();
        org.joda.time.DateTime.Property property40 = dateTime36.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval41 = null;
        org.joda.time.Days days42 = org.joda.time.Days.daysIn(readableInterval41);
        org.joda.time.Duration duration43 = days42.toStandardDuration();
        org.joda.time.Duration duration44 = duration43.toDuration();
        org.joda.time.DateTime dateTime46 = dateTime36.withDurationAdded((org.joda.time.ReadableDuration) duration44, (-1));
        org.joda.time.DateTime dateTime48 = dateTime36.minusMinutes((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.plusYears((int) '4');
        org.joda.time.DateTime.Property property53 = dateTime50.dayOfWeek();
        org.joda.time.DateTime dateTime56 = dateTime50.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property57 = dateTime50.secondOfMinute();
        org.joda.time.Chronology chronology58 = dateTime50.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.dayOfMonth();
        org.joda.time.DurationField durationField60 = chronology58.weeks();
        org.joda.time.DateTimeField dateTimeField61 = chronology58.secondOfMinute();
        int int63 = dateTimeField61.getMinimumValue((long) (byte) 0);
        org.joda.time.ReadablePartial readablePartial64 = null;
        java.util.Locale locale66 = java.util.Locale.KOREA;
        java.lang.String str67 = dateTimeField61.getAsText(readablePartial64, 3, locale66);
        int int68 = dateTime36.get(dateTimeField61);
        org.joda.time.DateTime dateTime70 = dateTime36.minusWeeks(40);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period72 = duration26.toPeriodFrom((org.joda.time.ReadableInstant) dateTime70, periodType71);
        org.joda.time.Period period73 = duration9.toPeriodFrom((org.joda.time.ReadableInstant) dateTime22, periodType71);
        org.joda.time.Instant instant74 = instant0.plus((org.joda.time.ReadableDuration) duration9);
        long long75 = instant0.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime12", (instant0.compareTo(dateTime12) == 0) == instant0.equals(dateTime12));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime1.withZone(dateTimeZone2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus(4320000001L);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) instant12);
        int int14 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) instant12);
        java.util.Locale locale17 = new java.util.Locale("1972");
        java.lang.String str18 = dateTimeZone2.getShortName(4519081151L, locale17);
        java.lang.String str20 = locale17.getExtension('a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant12", (dateTime1.compareTo(instant12) == 0) == dateTime1.equals(instant12));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant4 = instant0.minus(87350400000L);
        org.joda.time.Duration duration6 = org.joda.time.Duration.parse("PT2147483647S");
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.daysIn(readableInterval7);
        org.joda.time.Duration duration9 = days8.toStandardDuration();
        org.joda.time.Duration duration10 = duration9.toDuration();
        boolean boolean11 = duration6.isLongerThan((org.joda.time.ReadableDuration) duration9);
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Days days13 = org.joda.time.Days.daysIn(readableInterval12);
        org.joda.time.Duration duration14 = days13.toStandardDuration();
        org.joda.time.Duration duration15 = duration14.toDuration();
        org.joda.time.ReadableDuration readableDuration16 = null;
        boolean boolean17 = duration15.isLongerThan(readableDuration16);
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.Days days19 = org.joda.time.Days.daysIn(readableInterval18);
        org.joda.time.Duration duration20 = days19.toStandardDuration();
        org.joda.time.Duration duration21 = duration20.toDuration();
        org.joda.time.ReadableDuration readableDuration22 = null;
        boolean boolean23 = duration21.isLongerThan(readableDuration22);
        boolean boolean24 = duration15.isShorterThan((org.joda.time.ReadableDuration) duration21);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMillis((int) ' ');
        int int29 = dateTime26.getEra();
        org.joda.time.DateTime dateTime31 = dateTime26.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime33 = dateTime26.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval34 = duration15.toIntervalTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Duration duration35 = duration15.toDuration();
        boolean boolean36 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration35);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        java.lang.String str40 = dateTimeZone38.getID();
        long long42 = dateTimeZone38.previousTransition((long) (short) 0);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 1, dateTimeZone38);
        org.joda.time.Interval interval44 = duration9.toIntervalTo((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Instant instant45 = instant0.plus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.minusMillis((int) ' ');
        int int53 = dateTime50.getEra();
        org.joda.time.DateTime.Property property54 = dateTime50.secondOfMinute();
        org.joda.time.Interval interval55 = property54.toInterval();
        org.joda.time.Duration duration56 = interval55.toDuration();
        org.joda.time.PeriodType periodType57 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(readableInstant48, (org.joda.time.ReadableDuration) duration56, periodType57);
        org.joda.time.PeriodType periodType59 = periodType57.withWeeksRemoved();
        org.joda.time.Period period60 = new org.joda.time.Period(0L, 1645514185540L, periodType57);
        org.joda.time.PeriodType periodType63 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime65 = org.joda.time.DateTime.now(dateTimeZone64);
        org.joda.time.DateTime.Property property66 = dateTime65.dayOfMonth();
        org.joda.time.DateTime dateTime67 = property66.roundFloorCopy();
        org.joda.time.DateTime.Property property68 = dateTime67.millisOfDay();
        org.joda.time.Chronology chronology69 = dateTime67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 2147483647, (long) 1814400, periodType63, chronology69);
        org.joda.time.Period period71 = duration9.toPeriod(periodType57, chronology69);
        java.lang.String str72 = duration9.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime26", (instant0.compareTo(dateTime26) == 0) == instant0.equals(dateTime26));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.Instant instant5 = instant0.minus((long) 'u');
        org.joda.time.Instant instant7 = instant0.withMillis(4518960357L);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusYears((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property14 = dateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime15 = property14.withMinimumValue();
        org.joda.time.DateTime dateTime16 = property14.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime17 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType19 = periodType18.withYearsRemoved();
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime17, periodType18);
        org.joda.time.DateTime.Property property21 = dateTime8.era();
        org.joda.time.DateTime dateTime23 = dateTime8.plusMonths(55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime10", (instant0.compareTo(dateTime10) == 0) == instant0.equals(dateTime10));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        int int8 = dateTime5.getEra();
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime5.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime31 = dateTime27.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime25, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime34 = dateTime27.plusDays(1);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((java.lang.Object) dateTime27);
        long long36 = instant35.getMillis();
        org.joda.time.MutableDateTime mutableDateTime37 = instant35.toMutableDateTimeISO();
        org.joda.time.Seconds seconds38 = org.joda.time.Seconds.MAX_VALUE;
        org.joda.time.MutablePeriod mutablePeriod39 = seconds38.toMutablePeriod();
        mutablePeriod39.setMonths((int) (short) 100);
        int int42 = mutablePeriod39.getYears();
        int int43 = mutablePeriod39.getYears();
        mutablePeriod39.addDays((int) (short) 1);
        mutablePeriod39.setDays(55);
        mutablePeriod39.setHours(1);
        mutablePeriod39.addMonths((int) (byte) 100);
        mutablePeriod39.setHours(2001);
        org.joda.time.Duration duration55 = org.joda.time.Duration.standardMinutes(1645518594899L);
        mutablePeriod39.setPeriod((org.joda.time.ReadableDuration) duration55);
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime65 = org.joda.time.DateTime.now(dateTimeZone64);
        org.joda.time.DateTime dateTime67 = dateTime65.plusYears((int) '4');
        org.joda.time.DateTime.Property property68 = dateTime65.dayOfWeek();
        org.joda.time.DateTime dateTime71 = dateTime65.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property72 = dateTime65.secondOfMinute();
        org.joda.time.Chronology chronology73 = dateTime65.getChronology();
        org.joda.time.DateTimeField dateTimeField74 = chronology73.dayOfMonth();
        org.joda.time.Period period75 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology73);
        org.joda.time.DurationField durationField76 = chronology73.months();
        org.joda.time.DateTimeField dateTimeField77 = chronology73.weekyear();
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime(chronology73);
        org.joda.time.DateTimeField dateTimeField79 = chronology73.clockhourOfHalfday();
        org.joda.time.Period period80 = new org.joda.time.Period((long) 93, 4519128886L, periodType61, chronology73);
        org.joda.time.Period period81 = new org.joda.time.Period(0L, (long) 165, periodType61);
        org.joda.time.Period period82 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant35, (org.joda.time.ReadableDuration) duration55, periodType61);
        long long83 = duration55.getStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant35", (dateTime1.compareTo(instant35) == 0) == dateTime1.equals(instant35));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1645514124274L);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.Days days4 = org.joda.time.Days.daysIn(readableInterval3);
        org.joda.time.Duration duration5 = days4.toStandardDuration();
        org.joda.time.Duration duration6 = duration5.toDuration();
        org.joda.time.ReadableDuration readableDuration7 = null;
        boolean boolean8 = duration6.isLongerThan(readableDuration7);
        org.joda.time.Duration duration9 = duration6.toDuration();
        org.joda.time.Period period10 = duration6.toPeriod();
        long long11 = duration6.getStandardHours();
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Days days13 = org.joda.time.Days.daysIn(readableInterval12);
        org.joda.time.Duration duration14 = days13.toStandardDuration();
        org.joda.time.Duration duration15 = duration14.toDuration();
        org.joda.time.ReadableDuration readableDuration16 = null;
        boolean boolean17 = duration15.isLongerThan(readableDuration16);
        org.joda.time.Duration duration18 = duration15.toDuration();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusYears((int) '4');
        org.joda.time.DateTime.Property property23 = dateTime20.dayOfWeek();
        org.joda.time.DateTime dateTime26 = dateTime20.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property27 = dateTime20.minuteOfHour();
        org.joda.time.DateTime dateTime28 = dateTime20.toDateTime();
        int int29 = dateTime28.getWeekyear();
        org.joda.time.DateTime dateTime31 = dateTime28.minusDays((int) (byte) 1);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration15, (org.joda.time.ReadableInstant) dateTime28, periodType32);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((java.lang.Object) 99999L);
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Period period39 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod40 = period39.toMutablePeriod();
        org.joda.time.Period period43 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod44 = period43.toMutablePeriod();
        org.joda.time.Period period46 = period43.plusMinutes((int) (byte) 0);
        mutablePeriod40.mergePeriod((org.joda.time.ReadablePeriod) period43);
        boolean boolean48 = periodType36.equals((java.lang.Object) period43);
        org.joda.time.Period period49 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration15, (org.joda.time.ReadableInstant) dateTime35, periodType36);
        boolean boolean50 = duration6.isEqual((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Duration duration51 = duration15.toDuration();
        org.joda.time.Instant instant52 = instant1.minus((org.joda.time.ReadableDuration) duration51);
        org.joda.time.DateTime dateTime53 = instant52.toDateTimeISO();
        org.joda.time.Instant instant55 = instant52.plus((long) 46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant52 and dateTime53", (instant52.compareTo(dateTime53) == 0) == instant52.equals(dateTime53));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant0.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime6.dayOfWeek();
        org.joda.time.DateTime dateTime12 = dateTime6.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property13 = dateTime6.secondOfMinute();
        org.joda.time.Chronology chronology14 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.dayOfMonth();
        org.joda.time.DurationField durationField16 = chronology14.millis();
        org.joda.time.Period period19 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod20 = period19.toMutablePeriod();
        org.joda.time.Period period22 = period19.plusSeconds((int) (short) 1);
        org.joda.time.Days days23 = period22.toStandardDays();
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.Days days25 = org.joda.time.Days.daysIn(readableInterval24);
        java.lang.String str26 = days25.toString();
        boolean boolean27 = days23.isGreaterThan(days25);
        long long30 = chronology14.add((org.joda.time.ReadablePeriod) days25, (long) ' ', (int) ' ');
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(chronology14);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime4, (org.joda.time.ReadableInstant) dateTime31);
        java.util.Locale locale33 = null;
        java.util.Calendar calendar34 = mutableDateTime4.toCalendar(locale33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime6", (instant0.compareTo(dateTime6) == 0) == instant0.equals(dateTime6));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.Instant instant5 = instant3.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime4", (instant5.compareTo(dateTime4) == 0) == instant5.equals(dateTime4));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.Duration duration2 = days1.toStandardDuration();
        org.joda.time.Duration duration3 = duration2.toDuration();
        org.joda.time.ReadableDuration readableDuration4 = null;
        boolean boolean5 = duration3.isLongerThan(readableDuration4);
        org.joda.time.Duration duration6 = duration3.toDuration();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusYears((int) '4');
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfWeek();
        org.joda.time.DateTime dateTime14 = dateTime8.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property15 = dateTime8.minuteOfHour();
        org.joda.time.DateTime dateTime16 = dateTime8.toDateTime();
        int int17 = dateTime16.getWeekyear();
        org.joda.time.DateTime dateTime19 = dateTime16.minusDays((int) (byte) 1);
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration3, (org.joda.time.ReadableInstant) dateTime16, periodType20);
        org.joda.time.Duration duration23 = new org.joda.time.Duration((long) 28);
        org.joda.time.Duration duration26 = duration23.withDurationAdded(1645512059742L, 100);
        boolean boolean27 = duration3.isEqual((org.joda.time.ReadableDuration) duration23);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = dateTime29.withZone(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusYears((int) '4');
        org.joda.time.DateTime.Property property37 = dateTime34.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        int int40 = property37.compareTo((org.joda.time.ReadableInstant) dateTime39);
        java.util.Locale locale41 = java.util.Locale.FRANCE;
        java.lang.String str42 = property37.getAsText(locale41);
        java.util.Calendar calendar43 = dateTime29.toCalendar(locale41);
        org.joda.time.DateTime dateTime45 = dateTime29.withEra((int) (byte) 0);
        org.joda.time.DateTime dateTime47 = dateTime29.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((java.lang.Object) 99999L);
        boolean boolean50 = dateTime29.isAfter((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime dateTime52 = dateTime29.withMinuteOfHour(16);
        org.joda.time.Interval interval53 = duration23.toIntervalFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime.Property property54 = dateTime29.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone55);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now(dateTimeZone57);
        org.joda.time.DateTime dateTime59 = dateTime56.withZone(dateTimeZone57);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime61 = org.joda.time.DateTime.now(dateTimeZone60);
        org.joda.time.DateTime dateTime63 = dateTime61.minusMillis((int) ' ');
        int int64 = dateTime61.getEra();
        boolean boolean65 = dateTime59.isEqual((org.joda.time.ReadableInstant) dateTime61);
        java.util.Locale locale66 = null;
        java.util.Calendar calendar67 = dateTime59.toCalendar(locale66);
        java.util.Date date68 = dateTime59.toDate();
        org.joda.time.DateTimeZone dateTimeZone69 = dateTime59.getZone();
        boolean boolean70 = property54.equals((java.lang.Object) dateTime59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar67", (calendar43.compareTo(calendar67) == 0) == calendar43.equals(calendar67));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.Hours hours2 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours3 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours4 = hours2.plus(hours3);
        org.joda.time.DurationFieldType durationFieldType5 = hours2.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusYears((int) '4');
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfWeek();
        org.joda.time.DateTime dateTime14 = dateTime8.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property15 = dateTime8.secondOfMinute();
        org.joda.time.Chronology chronology16 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.dayOfMonth();
        org.joda.time.DurationField durationField18 = chronology16.millis();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 1, chronology16);
        boolean boolean20 = durationFieldType5.isSupported(chronology16);
        org.joda.time.DateTimeField dateTimeField21 = chronology16.weekyearOfCentury();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(chronology16);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 47, 26236198L, chronology16);
        org.joda.time.DurationField durationField24 = chronology16.eras();
        org.joda.time.DurationField durationField25 = chronology16.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField24", Math.signum(durationField18.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField18)));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.MAX_VALUE;
        java.lang.String str4 = seconds3.toString();
        java.lang.String str5 = seconds3.toString();
        org.joda.time.DurationFieldType durationFieldType6 = seconds3.getFieldType();
        boolean boolean7 = periodType2.isSupported(durationFieldType6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusYears((int) '4');
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfWeek();
        org.joda.time.DateTime dateTime15 = dateTime9.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property16 = dateTime9.secondOfMinute();
        org.joda.time.Chronology chronology17 = dateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfMonth();
        org.joda.time.DurationField durationField19 = chronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.millisOfSecond();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 55, (long) (short) 1, periodType2, chronology17);
        org.joda.time.DateTimeZone dateTimeZone22 = chronology17.getZone();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.weekyear();
        org.joda.time.DurationField durationField25 = chronology17.eras();
        org.joda.time.DurationField durationField26 = chronology17.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField25", Math.signum(durationField19.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField19)));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearDay();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.halfdays();
        int int3 = periodType1.indexOf(durationFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusYears((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime5.plusDays(10);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) '4');
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfWeek();
        org.joda.time.DateTime dateTime18 = dateTime12.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property19 = dateTime12.secondOfMinute();
        org.joda.time.Chronology chronology20 = dateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.dayOfMonth();
        org.joda.time.DurationField durationField22 = chronology20.millis();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 1, chronology20);
        org.joda.time.DateTime dateTime24 = dateTime5.withChronology(chronology20);
        org.joda.time.Period period27 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod28 = period27.toMutablePeriod();
        org.joda.time.Period period30 = period27.plusSeconds((int) (short) 1);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "ja_JP" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList37);
        boolean boolean40 = period30.equals((java.lang.Object) strList39);
        org.joda.time.Period period42 = period30.withHours((int) (byte) 1);
        int[] intArray45 = chronology20.get((org.joda.time.ReadablePeriod) period30, (long) (short) 0, (-78382080000000L));
        org.joda.time.DurationField durationField46 = chronology20.weekyears();
        org.joda.time.DurationField durationField47 = chronology20.years();
        org.joda.time.Period period48 = new org.joda.time.Period(1645514178123L, periodType1, chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField46 and durationField47", (durationField46.compareTo(durationField47) == 0) == durationField46.equals(durationField47));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        int int4 = dateTime1.getEra();
        org.joda.time.DateTime.Property property5 = dateTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMillis((int) ' ');
        int int14 = dateTime11.getEra();
        int int15 = dateTime9.compareTo((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMillis((int) ' ');
        org.joda.time.Duration duration20 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime17);
        int int21 = property5.getDifference((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = dateTime23.withZone(dateTimeZone24);
        org.joda.time.DateTime.Property property27 = dateTime26.weekyear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime31.getZone();
        boolean boolean34 = dateTimeZone32.isStandardOffset(0L);
        int int36 = dateTimeZone32.getStandardOffset((long) 999);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        boolean boolean39 = dateTimeZone32.isStandardOffset((long) 26223);
        java.util.Locale.Builder builder41 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder43 = builder41.setLanguage("");
        java.util.Locale.Builder builder45 = builder41.setLanguage("German");
        java.util.Locale.Builder builder46 = builder45.clearExtensions();
        java.util.Locale locale47 = builder46.build();
        java.lang.String str48 = dateTimeZone32.getShortName((long) (-1568200708), locale47);
        org.joda.time.DateTime dateTime49 = dateTime26.withZone(dateTimeZone32);
        org.joda.time.DateTime dateTime50 = dateTime9.toDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 35);
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime50.toMutableDateTime(dateTimeZone53);
        boolean boolean56 = dateTimeZone53.isStandardOffset(2726489203200020L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime54", (dateTime9.compareTo(mutableDateTime54) == 0) == dateTime9.equals(mutableDateTime54));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusYears((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime4.dayOfWeek();
        org.joda.time.DateTime dateTime10 = dateTime4.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property11 = dateTime4.secondOfMinute();
        org.joda.time.Chronology chronology12 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.dayOfMonth();
        org.joda.time.Period period14 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology12);
        org.joda.time.DurationField durationField15 = chronology12.months();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.weekyear();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DurationField durationField18 = chronology12.halfdays();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(28857600000L, chronology12);
        org.joda.time.DurationField durationField20 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField15, and durationField18", !(durationField20.compareTo(durationField15) == 0) || (Math.signum(durationField20.compareTo(durationField18)) == Math.signum(durationField15.compareTo(durationField18))));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) '4');
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfWeek();
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property10 = dateTime3.secondOfMinute();
        org.joda.time.Chronology chronology11 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfMonth();
        org.joda.time.DurationField durationField13 = chronology11.weeks();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.secondOfMinute();
        int int16 = dateTimeField14.getMinimumValue((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMillis((int) ' ');
        int int25 = dateTime22.getEra();
        int int26 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.plusYears((int) '4');
        org.joda.time.DateTime.Property property31 = dateTime28.dayOfWeek();
        org.joda.time.DateTime dateTime34 = dateTime28.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property35 = dateTime28.minuteOfHour();
        org.joda.time.DateTime dateTime37 = dateTime28.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime37.getZone();
        long long41 = dateTimeZone38.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime22.toMutableDateTime(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime48 = dateTime44.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime42, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime51 = dateTime44.plusDays(1);
        org.joda.time.TimeOfDay timeOfDay52 = dateTime51.toTimeOfDay();
        java.lang.Object obj53 = null;
        boolean boolean54 = timeOfDay52.equals(obj53);
        int int55 = timeOfDay52.size();
        int int56 = dateTimeField14.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay52);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now(dateTimeZone57);
        org.joda.time.DateTime dateTime60 = dateTime58.plusYears((int) '4');
        org.joda.time.DateTime.Property property61 = dateTime58.dayOfWeek();
        org.joda.time.DateTime dateTime64 = dateTime58.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property65 = dateTime58.minuteOfHour();
        org.joda.time.DateTime dateTime66 = dateTime58.toDateTime();
        java.lang.String str67 = dateTime66.toString();
        org.joda.time.DateMidnight dateMidnight68 = dateTime66.toDateMidnight();
        boolean boolean70 = dateTime66.isAfter((long) 24);
        org.joda.time.DateTime dateTime71 = timeOfDay52.toDateTime((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Chronology chronology72 = dateTime66.getChronology();
        org.joda.time.DurationField durationField73 = chronology72.eras();
        org.joda.time.Period period74 = new org.joda.time.Period((long) 544, 1645514161000L, chronology72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField73", Math.signum(durationField13.compareTo(durationField73)) == -Math.signum(durationField73.compareTo(durationField13)));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime1.withZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfMonth();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        org.joda.time.DateTime dateTime10 = dateTime8.plusSeconds((int) (short) 100);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime13 = dateTime8.minusMinutes(2001);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMillis((int) ' ');
        int int18 = dateTime15.getEra();
        org.joda.time.DateTime dateTime20 = dateTime15.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury((int) (short) 1);
        org.joda.time.DateTime dateTime23 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property24 = dateTime22.dayOfWeek();
        org.joda.time.DateTime dateTime26 = dateTime22.minusSeconds((int) (byte) 1);
        org.joda.time.Period period29 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod30 = period29.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.Days days32 = org.joda.time.Days.daysIn(readableInterval31);
        org.joda.time.Duration duration33 = days32.toStandardDuration();
        org.joda.time.Duration duration34 = duration33.toDuration();
        org.joda.time.ReadableDuration readableDuration35 = null;
        boolean boolean36 = duration34.isLongerThan(readableDuration35);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.Days days38 = org.joda.time.Days.daysIn(readableInterval37);
        org.joda.time.Duration duration39 = days38.toStandardDuration();
        org.joda.time.Duration duration40 = duration39.toDuration();
        org.joda.time.ReadableDuration readableDuration41 = null;
        boolean boolean42 = duration40.isLongerThan(readableDuration41);
        boolean boolean43 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration40);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.minusMillis((int) ' ');
        int int48 = dateTime45.getEra();
        org.joda.time.DateTime dateTime50 = dateTime45.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime52 = dateTime45.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval53 = duration34.toIntervalTo((org.joda.time.ReadableInstant) dateTime45);
        mutablePeriod30.add((org.joda.time.ReadableInterval) interval53);
        mutablePeriod30.addYears((int) ' ');
        mutablePeriod30.setSeconds((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime61 = org.joda.time.DateTime.now(dateTimeZone60);
        org.joda.time.DateTime dateTime63 = dateTime61.plusYears((int) '4');
        org.joda.time.DateTime.Property property64 = dateTime61.dayOfWeek();
        org.joda.time.DateTime dateTime67 = dateTime61.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property68 = dateTime61.minuteOfHour();
        org.joda.time.DateTime dateTime69 = dateTime61.toDateTime();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod(readableDuration59, (org.joda.time.ReadableInstant) dateTime61);
        mutablePeriod30.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod70);
        mutablePeriod70.addHours(2022);
        boolean boolean74 = dateTime26.equals((java.lang.Object) mutablePeriod70);
        boolean boolean75 = dateTime13.equals((java.lang.Object) dateTime26);
        org.joda.time.ReadableDuration readableDuration76 = null;
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime78 = org.joda.time.DateTime.now(dateTimeZone77);
        org.joda.time.DateTime dateTime80 = dateTime78.minusMillis((int) ' ');
        int int81 = dateTime78.getEra();
        org.joda.time.DateTime.Property property82 = dateTime78.secondOfMinute();
        org.joda.time.Period period83 = new org.joda.time.Period(readableDuration76, (org.joda.time.ReadableInstant) dateTime78);
        org.joda.time.DateTime.Property property84 = dateTime78.millisOfSecond();
        org.joda.time.Duration duration86 = org.joda.time.Duration.standardDays((long) 9);
        org.joda.time.DateTime dateTime87 = dateTime78.minus((org.joda.time.ReadableDuration) duration86);
        int int88 = dateTime78.getHourOfDay();
        org.joda.time.DateTime.Property property89 = dateTime78.hourOfDay();
        org.joda.time.DateTime dateTime91 = dateTime78.minusSeconds(259);
        org.joda.time.DateTimeZone dateTimeZone93 = org.joda.time.DateTimeZone.forOffsetHours((-7));
        long long95 = dateTimeZone93.nextTransition(810L);
        org.joda.time.MutableDateTime mutableDateTime96 = dateTime78.toMutableDateTime(dateTimeZone93);
        org.joda.time.DateTime dateTime97 = dateTime26.withZone(dateTimeZone93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime96", (dateTime1.compareTo(mutableDateTime96) == 0) == dateTime1.equals(mutableDateTime96));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusYears((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime8 = dateTime2.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property9 = dateTime2.secondOfMinute();
        org.joda.time.Chronology chronology10 = dateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfMonth();
        org.joda.time.DurationField durationField12 = durationFieldType0.getField(chronology10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, chronology14);
        int int16 = period15.getMillis();
        long long19 = chronology10.add((org.joda.time.ReadablePeriod) period15, (long) (short) 100, 40);
        org.joda.time.DurationField durationField20 = chronology10.eras();
        org.joda.time.DurationField durationField21 = chronology10.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField20", Math.signum(durationField12.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField12)));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime1.withZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime6.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        int int12 = property9.compareTo((org.joda.time.ReadableInstant) dateTime11);
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.lang.String str14 = property9.getAsText(locale13);
        java.util.Calendar calendar15 = dateTime1.toCalendar(locale13);
        org.joda.time.DateTime dateTime17 = dateTime1.withEra((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusYears((int) '4');
        org.joda.time.DateTime.Property property23 = dateTime20.dayOfWeek();
        org.joda.time.DateTime dateTime26 = dateTime20.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property27 = dateTime20.secondOfMinute();
        org.joda.time.Chronology chronology28 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.dayOfMonth();
        org.joda.time.DurationField durationField30 = durationFieldType18.getField(chronology28);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) 100, chronology32);
        int int34 = period33.getMillis();
        long long37 = chronology28.add((org.joda.time.ReadablePeriod) period33, (long) (short) 100, 40);
        org.joda.time.DurationField durationField38 = chronology28.years();
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime17.toMutableDateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField40 = chronology28.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = chronology28.era();
        org.joda.time.DateTimeField dateTimeField42 = chronology28.clockhourOfDay();
        org.joda.time.DurationField durationField43 = chronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField43, durationField30, and durationField38", !(durationField43.compareTo(durationField30) == 0) || (Math.signum(durationField43.compareTo(durationField38)) == Math.signum(durationField30.compareTo(durationField38))));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTime dateTime11 = dateTime1.minusYears(0);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTime();
        java.lang.String str13 = dateTime11.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(26238);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime19.getZone();
        boolean boolean22 = dateTimeZone20.isStandardOffset((long) 59);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone20);
        long long26 = dateTimeZone15.getMillisKeepLocal(dateTimeZone20, 1645488059900L);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime11.toMutableDateTime(dateTimeZone15);
        java.util.Locale locale32 = new java.util.Locale("2022-02-22T07:20:33.116Z/2022-02-22T07:20:33.116Z", "2022-02-22T07:21:38.983Z", "\u897f\u66a6");
        java.lang.String str33 = locale32.toLanguageTag();
        java.lang.String str34 = dateTimeZone15.getName(1645514318000L, locale32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime27", (dateTime1.compareTo(mutableDateTime27) == 0) == dateTime1.equals(mutableDateTime27));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        boolean boolean5 = periodType2.isSupported(durationFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusYears((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime7.dayOfWeek();
        org.joda.time.DateTime dateTime13 = dateTime7.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property14 = dateTime7.secondOfMinute();
        org.joda.time.Chronology chronology15 = dateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.dayOfMonth();
        org.joda.time.DurationField durationField17 = chronology15.weeks();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(1L, periodType2, chronology15);
        org.joda.time.DateTimeField dateTimeField20 = chronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = chronology15.hourOfDay();
        org.joda.time.DurationField durationField22 = chronology15.eras();
        org.joda.time.Period period23 = new org.joda.time.Period(1645514541080L, chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField22", Math.signum(durationField17.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField17)));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.years();
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.MAX_VALUE;
        java.lang.String str5 = seconds4.toString();
        java.lang.String str6 = seconds4.toString();
        org.joda.time.DurationFieldType durationFieldType7 = seconds4.getFieldType();
        boolean boolean8 = periodType3.isSupported(durationFieldType7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusYears((int) '4');
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime16 = dateTime10.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property17 = dateTime10.secondOfMinute();
        org.joda.time.Chronology chronology18 = dateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.dayOfMonth();
        org.joda.time.DurationField durationField20 = chronology18.halfdays();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.millisOfSecond();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 55, (long) (short) 1, periodType3, chronology18);
        org.joda.time.DateTimeZone dateTimeZone23 = chronology18.getZone();
        org.joda.time.DateTimeField dateTimeField24 = chronology18.hourOfHalfday();
        org.joda.time.DurationField durationField25 = chronology18.seconds();
        org.joda.time.Period period26 = new org.joda.time.Period((long) 24106, chronology18);
        org.joda.time.DateTimeField dateTimeField27 = chronology18.weekyear();
        org.joda.time.DurationField durationField28 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField20, and durationField25", !(durationField28.compareTo(durationField20) == 0) || (Math.signum(durationField28.compareTo(durationField25)) == Math.signum(durationField20.compareTo(durationField25))));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.Days days0 = org.joda.time.Days.MIN_VALUE;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Period period6 = period3.plusSeconds((int) (short) 1);
        org.joda.time.Days days7 = period6.toStandardDays();
        org.joda.time.Days days9 = days7.plus((int) (byte) 1);
        org.joda.time.Days days10 = days0.plus(days7);
        org.joda.time.Duration duration11 = days7.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Days days13 = org.joda.time.Days.daysIn(readableInterval12);
        org.joda.time.Duration duration14 = days13.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.Days days16 = org.joda.time.Days.daysIn(readableInterval15);
        org.joda.time.Duration duration17 = days16.toStandardDuration();
        org.joda.time.Duration duration18 = duration17.toDuration();
        org.joda.time.ReadableDuration readableDuration19 = null;
        boolean boolean20 = duration18.isLongerThan(readableDuration19);
        org.joda.time.Duration duration22 = duration14.withDurationAdded(readableDuration19, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusYears((int) '4');
        org.joda.time.DateTime.Property property27 = dateTime24.dayOfWeek();
        org.joda.time.DateTime dateTime30 = dateTime24.withDurationAdded((long) 100, 0);
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.Days days32 = org.joda.time.Days.daysIn(readableInterval31);
        org.joda.time.Duration duration33 = days32.toStandardDuration();
        org.joda.time.Duration duration34 = duration33.toDuration();
        org.joda.time.ReadableDuration readableDuration35 = null;
        boolean boolean36 = duration34.isLongerThan(readableDuration35);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.Days days38 = org.joda.time.Days.daysIn(readableInterval37);
        org.joda.time.Duration duration39 = days38.toStandardDuration();
        org.joda.time.Duration duration40 = duration39.toDuration();
        org.joda.time.ReadableDuration readableDuration41 = null;
        boolean boolean42 = duration40.isLongerThan(readableDuration41);
        boolean boolean43 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableDuration) duration40);
        boolean boolean45 = duration22.isEqual((org.joda.time.ReadableDuration) duration40);
        boolean boolean46 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInterval readableInterval47 = null;
        org.joda.time.Days days48 = org.joda.time.Days.daysIn(readableInterval47);
        org.joda.time.Duration duration49 = days48.toStandardDuration();
        org.joda.time.Duration duration50 = duration49.toDuration();
        org.joda.time.ReadableDuration readableDuration51 = null;
        boolean boolean52 = duration50.isLongerThan(readableDuration51);
        org.joda.time.Duration duration53 = duration50.toDuration();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime55 = org.joda.time.DateTime.now(dateTimeZone54);
        org.joda.time.DateTime dateTime57 = dateTime55.plusYears((int) '4');
        org.joda.time.DateTime.Property property58 = dateTime55.dayOfWeek();
        org.joda.time.DateTime dateTime61 = dateTime55.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property62 = dateTime55.minuteOfHour();
        org.joda.time.DateTime dateTime63 = dateTime55.toDateTime();
        int int64 = dateTime63.getWeekyear();
        org.joda.time.DateTime dateTime66 = dateTime63.minusDays((int) (byte) 1);
        org.joda.time.PeriodType periodType67 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration50, (org.joda.time.ReadableInstant) dateTime63, periodType67);
        boolean boolean69 = duration11.isLongerThan((org.joda.time.ReadableDuration) duration50);
        java.lang.Object obj70 = null;
        boolean boolean71 = duration50.equals(obj70);
        org.joda.time.Duration duration73 = duration50.minus((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime75 = org.joda.time.DateTime.now(dateTimeZone74);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime77 = org.joda.time.DateTime.now(dateTimeZone76);
        org.joda.time.DateTime dateTime78 = dateTime75.withZone(dateTimeZone76);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime80 = org.joda.time.DateTime.now(dateTimeZone79);
        org.joda.time.DateTime dateTime82 = dateTime80.plusYears((int) '4');
        org.joda.time.DateTime.Property property83 = dateTime80.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone84 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime85 = org.joda.time.DateTime.now(dateTimeZone84);
        int int86 = property83.compareTo((org.joda.time.ReadableInstant) dateTime85);
        java.util.Locale locale87 = java.util.Locale.FRANCE;
        java.lang.String str88 = property83.getAsText(locale87);
        java.util.Calendar calendar89 = dateTime75.toCalendar(locale87);
        org.joda.time.DateTime dateTime91 = dateTime75.withEra((int) (byte) 0);
        int int92 = dateTime75.getWeekyear();
        org.joda.time.Period period93 = duration73.toPeriodTo((org.joda.time.ReadableInstant) dateTime75);
        java.util.Locale locale95 = new java.util.Locale("56");
        java.util.Calendar calendar96 = dateTime75.toCalendar(locale95);
        java.lang.String str97 = locale95.getDisplayScript();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar89 and calendar96", (calendar89.compareTo(calendar96) == 0) == calendar89.equals(calendar96));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours1 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours2 = hours0.plus(hours1);
        org.joda.time.DurationFieldType durationFieldType3 = hours0.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime6.dayOfWeek();
        org.joda.time.DateTime dateTime12 = dateTime6.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property13 = dateTime6.secondOfMinute();
        org.joda.time.Chronology chronology14 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.dayOfMonth();
        org.joda.time.DurationField durationField16 = chronology14.millis();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 1, chronology14);
        boolean boolean18 = durationFieldType3.isSupported(chronology14);
        org.joda.time.DateTimeField dateTimeField19 = chronology14.weekyearOfCentury();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(chronology14);
        org.joda.time.DurationField durationField21 = chronology14.hours();
        org.joda.time.DurationField durationField22 = chronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField16, and durationField21", !(durationField22.compareTo(durationField16) == 0) || (Math.signum(durationField22.compareTo(durationField21)) == Math.signum(durationField16.compareTo(durationField21))));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = dateTime1.isSupported(dateTimeFieldType3);
        org.joda.time.DateTime.Property property5 = dateTime1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusYears((int) '4');
        org.joda.time.DateTime dateTime12 = dateTime11.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property13 = dateTime11.yearOfCentury();
        org.joda.time.DateTime dateTime14 = property13.withMinimumValue();
        boolean boolean15 = dateTimeZone7.equals((java.lang.Object) dateTime14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.MutablePeriod mutablePeriod18 = weeks17.toMutablePeriod();
        int int19 = mutablePeriod18.getHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime16", (dateTime1.compareTo(dateTime16) == 0) == dateTime1.equals(dateTime16));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMillis((int) ' ');
        int int11 = dateTime8.getEra();
        int int12 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears((int) '4');
        org.joda.time.DateTime.Property property17 = dateTime14.dayOfWeek();
        org.joda.time.DateTime dateTime20 = dateTime14.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property21 = dateTime14.minuteOfHour();
        org.joda.time.DateTime dateTime23 = dateTime14.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime23.getZone();
        long long27 = dateTimeZone24.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime8.toMutableDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime34 = dateTime30.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime28, (org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime37 = dateTime30.plusDays(1);
        boolean boolean38 = instant0.equals((java.lang.Object) dateTime37);
        org.joda.time.DateTime dateTime39 = dateTime37.toDateTimeISO();
        int int40 = dateTime37.getYearOfCentury();
        org.joda.time.DateTime dateTime42 = dateTime37.plusYears((-245));
        org.joda.time.DateTime dateTime44 = dateTime37.minus((-168885827L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.Days days4 = org.joda.time.Days.daysIn(readableInterval3);
        org.joda.time.Duration duration5 = days4.toStandardDuration();
        org.joda.time.Duration duration6 = duration5.toDuration();
        org.joda.time.ReadableDuration readableDuration7 = null;
        boolean boolean8 = duration6.isLongerThan(readableDuration7);
        org.joda.time.Duration duration9 = duration6.toDuration();
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Days days11 = org.joda.time.Days.daysIn(readableInterval10);
        org.joda.time.Duration duration12 = days11.toStandardDuration();
        org.joda.time.Duration duration13 = duration12.toDuration();
        org.joda.time.ReadableDuration readableDuration14 = null;
        boolean boolean15 = duration13.isLongerThan(readableDuration14);
        org.joda.time.Duration duration16 = duration13.toDuration();
        org.joda.time.Period period17 = duration13.toPeriod();
        int int18 = duration9.compareTo((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Instant instant19 = instant0.plus((org.joda.time.ReadableDuration) duration13);
        boolean boolean21 = instant19.isBefore((long) 962);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime27 = dateTime23.minusMinutes((int) '#');
        org.joda.time.DateTime dateTime29 = dateTime23.withMillis((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.minusMillis((int) ' ');
        int int42 = dateTime39.getEra();
        int int43 = dateTime37.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.plusYears((int) '4');
        org.joda.time.DateTime.Property property48 = dateTime45.dayOfWeek();
        org.joda.time.DateTime dateTime51 = dateTime45.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property52 = dateTime45.minuteOfHour();
        org.joda.time.DateTime dateTime54 = dateTime45.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone55 = dateTime54.getZone();
        long long58 = dateTimeZone55.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime39.toMutableDateTime(dateTimeZone55);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime61 = org.joda.time.DateTime.now(dateTimeZone60);
        org.joda.time.DateTime dateTime63 = dateTime61.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime65 = dateTime61.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime59, (org.joda.time.ReadableInstant) dateTime61);
        boolean boolean67 = dateTime31.isBefore((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTime dateTime69 = dateTime31.minusYears(55);
        org.joda.time.DateTime.Property property70 = dateTime69.monthOfYear();
        java.util.Locale locale71 = java.util.Locale.JAPAN;
        java.util.Locale locale72 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet73 = locale72.getUnicodeLocaleAttributes();
        java.lang.String str74 = locale71.getDisplayScript(locale72);
        int int75 = property70.getMaximumTextLength(locale71);
        org.joda.time.DateTime dateTime76 = property70.roundHalfEvenCopy();
        org.joda.time.Weeks weeks77 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime76);
        int int78 = dateTime76.getSecondOfDay();
        org.joda.time.Minutes minutes79 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) instant19, (org.joda.time.ReadableInstant) dateTime76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and dateTime23", (instant19.compareTo(dateTime23) == 0) == instant19.equals(dateTime23));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 40, 0);
        org.joda.time.Chronology chronology4 = instant0.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = instant0.toMutableDateTime();
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Days days7 = org.joda.time.Days.daysIn(readableInterval6);
        org.joda.time.Duration duration8 = days7.toStandardDuration();
        org.joda.time.Duration duration9 = duration8.toDuration();
        org.joda.time.ReadableDuration readableDuration10 = null;
        boolean boolean11 = duration9.isLongerThan(readableDuration10);
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Days days13 = org.joda.time.Days.daysIn(readableInterval12);
        org.joda.time.Duration duration14 = days13.toStandardDuration();
        org.joda.time.Duration duration15 = duration14.toDuration();
        org.joda.time.ReadableDuration readableDuration16 = null;
        boolean boolean17 = duration15.isLongerThan(readableDuration16);
        boolean boolean18 = duration9.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMillis((int) ' ');
        int int23 = dateTime20.getEra();
        org.joda.time.DateTime dateTime25 = dateTime20.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime27 = dateTime20.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval28 = duration9.toIntervalTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Duration duration29 = duration9.toDuration();
        org.joda.time.Duration duration31 = duration29.plus((-78382080000000L));
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.Days days33 = org.joda.time.Days.daysIn(readableInterval32);
        org.joda.time.Duration duration34 = days33.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval35 = null;
        org.joda.time.Days days36 = org.joda.time.Days.daysIn(readableInterval35);
        org.joda.time.Duration duration37 = days36.toStandardDuration();
        org.joda.time.Duration duration38 = duration37.toDuration();
        org.joda.time.ReadableDuration readableDuration39 = null;
        boolean boolean40 = duration38.isLongerThan(readableDuration39);
        org.joda.time.Duration duration42 = duration34.withDurationAdded(readableDuration39, (int) (byte) 100);
        org.joda.time.Duration duration45 = duration42.withDurationAdded((long) (short) 1, 55);
        org.joda.time.Duration duration46 = duration29.minus((org.joda.time.ReadableDuration) duration45);
        org.joda.time.Instant instant47 = instant0.plus((org.joda.time.ReadableDuration) duration45);
        org.joda.time.DateTime dateTime48 = instant0.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime5", (instant0.compareTo(mutableDateTime5) == 0) == instant0.equals(mutableDateTime5));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime6 = dateTime2.minusMinutes((int) '#');
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.Instant instant8 = dateTime6.toInstant();
        org.joda.time.Chronology chronology9 = instant8.getChronology();
        java.lang.String str10 = chronology9.toString();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(836637658968384000L, chronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant8", (dateTime6.compareTo(instant8) == 0) == dateTime6.equals(instant8));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean1 = instant0.isAfterNow();
        org.joda.time.Instant instant3 = instant0.withMillis((long) (short) 0);
        org.joda.time.Instant instant5 = instant3.minus(2629746000L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.DateTime dateTime10 = property8.roundCeilingCopy();
        int int11 = instant3.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Instant instant13 = instant3.plus((long) (-1568204351));
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfMonth();
        java.lang.String str17 = property16.toString();
        int int18 = property16.getMaximumValue();
        org.joda.time.DateTime dateTime19 = property16.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField20 = property16.getDurationField();
        int int21 = property16.getMinimumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property16.getFieldType();
        org.joda.time.DateTime dateTime23 = property16.roundCeilingCopy();
        org.joda.time.Hours hours24 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) instant3, (org.joda.time.ReadableInstant) dateTime23);
        boolean boolean25 = instant3.isBeforeNow();
        org.joda.time.Instant instant27 = instant3.plus(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime7", (instant0.compareTo(dateTime7) == 0) == instant0.equals(dateTime7));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.Instant instant5 = instant0.minus((long) 'u');
        org.joda.time.Chronology chronology6 = instant0.getChronology();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusYears((int) '4');
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfWeek();
        org.joda.time.DateTime dateTime15 = dateTime9.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property16 = dateTime9.secondOfMinute();
        org.joda.time.Chronology chronology17 = dateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfMonth();
        org.joda.time.DurationField durationField19 = chronology17.millis();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.millisOfSecond();
        org.joda.time.Period period21 = new org.joda.time.Period((long) 1439, chronology17);
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(chronology17);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusYears((int) '4');
        org.joda.time.DateTime.Property property27 = dateTime24.dayOfWeek();
        org.joda.time.DateTime dateTime30 = dateTime24.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property31 = dateTime24.minuteOfHour();
        org.joda.time.DateTime dateTime33 = dateTime24.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime33.getZone();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.YearMonthDay yearMonthDay36 = dateTime35.toYearMonthDay();
        int[] intArray38 = chronology17.get((org.joda.time.ReadablePartial) yearMonthDay36, (long) 3);
        org.joda.time.Period period41 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod42 = period41.toMutablePeriod();
        org.joda.time.Period period44 = period41.plusMinutes((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime46.minusMillis((int) ' ');
        int int49 = dateTime46.getEra();
        org.joda.time.DateTime.Property property50 = dateTime46.secondOfMinute();
        org.joda.time.DateTime dateTime51 = property50.roundHalfFloorCopy();
        org.joda.time.Seconds seconds52 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds54 = seconds52.multipliedBy(1);
        boolean boolean55 = property50.equals((java.lang.Object) seconds52);
        org.joda.time.Seconds seconds57 = seconds52.plus(435);
        org.joda.time.Seconds seconds58 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds60 = seconds58.plus((int) (short) 10);
        org.joda.time.Seconds seconds62 = seconds60.minus(2022);
        org.joda.time.Seconds seconds63 = seconds52.plus(seconds60);
        org.joda.time.DurationFieldType durationFieldType64 = seconds60.getFieldType();
        int int65 = period41.get(durationFieldType64);
        org.joda.time.Period period66 = period41.toPeriod();
        int int67 = period66.getHours();
        org.joda.time.Period period69 = period66.withWeeks(27425238);
        boolean boolean70 = yearMonthDay36.equals((java.lang.Object) period69);
        long long72 = chronology6.set((org.joda.time.ReadablePartial) yearMonthDay36, (long) 41773);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime9", (instant0.compareTo(dateTime9) == 0) == instant0.equals(dateTime9));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean1 = instant0.isAfterNow();
        org.joda.time.Instant instant3 = instant0.withMillis((long) (short) 0);
        org.joda.time.Instant instant5 = instant3.minus(2629746000L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.DateTime dateTime10 = property8.roundCeilingCopy();
        int int11 = instant3.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Instant instant13 = instant3.plus((long) (-1568204351));
        boolean boolean15 = instant3.isAfter(3110492000L);
        java.lang.String str16 = instant3.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime7", (instant0.compareTo(dateTime7) == 0) == instant0.equals(dateTime7));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime2 = instant0.toMutableDateTime();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardDays((long) 20);
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.MAX_VALUE;
        org.joda.time.MutablePeriod mutablePeriod7 = seconds6.toMutablePeriod();
        mutablePeriod7.setMonths((int) (short) 100);
        int int10 = mutablePeriod7.getYears();
        int int11 = mutablePeriod7.getYears();
        mutablePeriod7.addDays((int) (short) 1);
        mutablePeriod7.setDays(55);
        org.joda.time.Period period18 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod19 = period18.toMutablePeriod();
        org.joda.time.Period period22 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod23 = period22.toMutablePeriod();
        org.joda.time.Period period25 = period22.plusMinutes((int) (byte) 0);
        mutablePeriod19.mergePeriod((org.joda.time.ReadablePeriod) period22);
        mutablePeriod19.addMonths((int) 'u');
        mutablePeriod19.addHours((int) (byte) -1);
        org.joda.time.Period period33 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod34 = period33.toMutablePeriod();
        org.joda.time.Period period36 = period33.plusMinutes((int) (byte) 0);
        org.joda.time.Period period38 = period36.plusMonths((int) '4');
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType40.getDurationType();
        boolean boolean42 = periodType39.isSupported(durationFieldType41);
        boolean boolean43 = period36.isSupported(durationFieldType41);
        int int44 = mutablePeriod19.indexOf(durationFieldType41);
        int int45 = mutablePeriod7.get(durationFieldType41);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime48 = org.joda.time.DateTime.now(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.plusYears((int) '4');
        org.joda.time.DateTime.Property property51 = dateTime48.dayOfWeek();
        org.joda.time.DateTime dateTime54 = dateTime48.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property55 = dateTime48.secondOfMinute();
        org.joda.time.Chronology chronology56 = dateTime48.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.dayOfMonth();
        org.joda.time.DurationField durationField58 = durationFieldType46.getField(chronology56);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period((long) 100, chronology60);
        int int62 = period61.getMillis();
        long long65 = chronology56.add((org.joda.time.ReadablePeriod) period61, (long) (short) 100, 40);
        boolean boolean66 = durationFieldType41.isSupported(chronology56);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(0L, chronology56);
        org.joda.time.Interval interval68 = duration4.toIntervalTo((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.Duration duration69 = interval68.toDuration();
        org.joda.time.Instant instant70 = instant0.plus((org.joda.time.ReadableDuration) duration69);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime72 = org.joda.time.DateTime.now(dateTimeZone71);
        org.joda.time.DateTime.Property property73 = dateTime72.dayOfMonth();
        java.lang.String str74 = property73.toString();
        int int75 = property73.getMaximumValue();
        int int76 = property73.getMaximumValueOverall();
        org.joda.time.DateTime dateTime77 = property73.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime79 = dateTime77.plusSeconds(0);
        boolean boolean80 = instant70.isAfter((org.joda.time.ReadableInstant) dateTime77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) '4');
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfWeek();
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property10 = dateTime3.secondOfMinute();
        org.joda.time.Chronology chronology11 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 26181655, 1645514169443L, chronology11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMillis((int) ' ');
        int int18 = dateTime15.getEra();
        org.joda.time.DateTime.Property property19 = dateTime15.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.Duration duration21 = interval20.toDuration();
        mutablePeriod13.add((org.joda.time.ReadableInterval) interval20);
        org.joda.time.ReadableInterval readableInterval23 = null;
        org.joda.time.Days days24 = org.joda.time.Days.daysIn(readableInterval23);
        org.joda.time.Duration duration25 = days24.toStandardDuration();
        org.joda.time.Duration duration26 = duration25.toDuration();
        org.joda.time.ReadableDuration readableDuration27 = null;
        boolean boolean28 = duration26.isLongerThan(readableDuration27);
        org.joda.time.Duration duration29 = duration26.toDuration();
        org.joda.time.Period period30 = duration26.toPeriod();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.plusYears((int) '4');
        org.joda.time.DateTime.Property property35 = dateTime32.dayOfWeek();
        org.joda.time.DateTime dateTime38 = dateTime32.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property39 = dateTime32.secondOfMinute();
        org.joda.time.Chronology chronology40 = dateTime32.getChronology();
        org.joda.time.DateTime dateTime42 = dateTime32.minusYears(0);
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime42.toMutableDateTime();
        org.joda.time.Chronology chronology44 = dateTime42.getChronology();
        org.joda.time.DateTime dateTime46 = dateTime42.plusDays(9);
        org.joda.time.Interval interval47 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        boolean boolean48 = interval20.contains((org.joda.time.ReadableInterval) interval47);
        java.lang.String str49 = interval47.toString();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime55 = dateTime51.minusMinutes((int) '#');
        java.lang.String str56 = dateTime55.toString();
        org.joda.time.Instant instant57 = dateTime55.toInstant();
        org.joda.time.Chronology chronology58 = instant57.getChronology();
        org.joda.time.ReadableInterval readableInterval59 = null;
        org.joda.time.Days days60 = org.joda.time.Days.daysIn(readableInterval59);
        org.joda.time.Duration duration61 = days60.toStandardDuration();
        org.joda.time.Duration duration62 = duration61.toDuration();
        org.joda.time.ReadableDuration readableDuration63 = null;
        boolean boolean64 = duration62.isLongerThan(readableDuration63);
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.Days days66 = org.joda.time.Days.daysIn(readableInterval65);
        org.joda.time.Duration duration67 = days66.toStandardDuration();
        org.joda.time.Duration duration68 = duration67.toDuration();
        org.joda.time.ReadableDuration readableDuration69 = null;
        boolean boolean70 = duration68.isLongerThan(readableDuration69);
        boolean boolean71 = duration62.isShorterThan((org.joda.time.ReadableDuration) duration68);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime73 = org.joda.time.DateTime.now(dateTimeZone72);
        org.joda.time.DateTime dateTime75 = dateTime73.minusMillis((int) ' ');
        int int76 = dateTime73.getEra();
        org.joda.time.DateTime dateTime78 = dateTime73.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime80 = dateTime73.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval81 = duration62.toIntervalTo((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.DateTime dateTime83 = dateTime73.withChronology(chronology82);
        org.joda.time.DateTime.Property property84 = dateTime73.monthOfYear();
        boolean boolean85 = instant57.isEqual((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTimeZone dateTimeZone86 = dateTime73.getZone();
        int int87 = dateTime73.getMinuteOfHour();
        boolean boolean88 = interval47.contains((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime89 = interval47.getStart();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime55 and instant57", (dateTime55.compareTo(instant57) == 0) == dateTime55.equals(instant57));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.Instant instant5 = instant0.minus((long) 'u');
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.Instant instant8 = instant5.minus(0L);
        org.joda.time.Chronology chronology9 = instant8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime6", (instant5.compareTo(dateTime6) == 0) == instant5.equals(dateTime6));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMillis((int) ' ');
        int int5 = dateTime2.getEra();
        org.joda.time.DateTime.Property property6 = dateTime2.secondOfMinute();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) dateTime7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int10 = dateTime7.get(dateTimeFieldType9);
        org.joda.time.Days days11 = org.joda.time.Days.MIN_VALUE;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod15 = period14.toMutablePeriod();
        org.joda.time.Period period17 = period14.plusSeconds((int) (short) 1);
        org.joda.time.Days days18 = period17.toStandardDays();
        org.joda.time.Days days20 = days18.plus((int) (byte) 1);
        org.joda.time.Days days21 = days11.plus(days18);
        org.joda.time.Duration duration22 = days18.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval23 = null;
        org.joda.time.Days days24 = org.joda.time.Days.daysIn(readableInterval23);
        org.joda.time.Duration duration25 = days24.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval26 = null;
        org.joda.time.Days days27 = org.joda.time.Days.daysIn(readableInterval26);
        org.joda.time.Duration duration28 = days27.toStandardDuration();
        org.joda.time.Duration duration29 = duration28.toDuration();
        org.joda.time.ReadableDuration readableDuration30 = null;
        boolean boolean31 = duration29.isLongerThan(readableDuration30);
        org.joda.time.Duration duration33 = duration25.withDurationAdded(readableDuration30, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.plusYears((int) '4');
        org.joda.time.DateTime.Property property38 = dateTime35.dayOfWeek();
        org.joda.time.DateTime dateTime41 = dateTime35.withDurationAdded((long) 100, 0);
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.Days days43 = org.joda.time.Days.daysIn(readableInterval42);
        org.joda.time.Duration duration44 = days43.toStandardDuration();
        org.joda.time.Duration duration45 = duration44.toDuration();
        org.joda.time.ReadableDuration readableDuration46 = null;
        boolean boolean47 = duration45.isLongerThan(readableDuration46);
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.Days days49 = org.joda.time.Days.daysIn(readableInterval48);
        org.joda.time.Duration duration50 = days49.toStandardDuration();
        org.joda.time.Duration duration51 = duration50.toDuration();
        org.joda.time.ReadableDuration readableDuration52 = null;
        boolean boolean53 = duration51.isLongerThan(readableDuration52);
        boolean boolean54 = duration45.isShorterThan((org.joda.time.ReadableDuration) duration51);
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime41, (org.joda.time.ReadableDuration) duration51);
        boolean boolean56 = duration33.isEqual((org.joda.time.ReadableDuration) duration51);
        boolean boolean57 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Period period58 = duration22.toPeriod();
        org.joda.time.Duration duration60 = duration22.withMillis(1645514211904L);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableDuration) duration22);
        org.joda.time.Duration duration63 = new org.joda.time.Duration((long) 28);
        org.joda.time.Duration duration66 = duration63.withDurationAdded(1645512059742L, 100);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime68 = org.joda.time.DateTime.now(dateTimeZone67);
        org.joda.time.DateTime dateTime70 = dateTime68.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime72 = org.joda.time.DateTime.now(dateTimeZone71);
        org.joda.time.DateTime dateTime74 = dateTime72.minusMillis((int) ' ');
        int int75 = dateTime72.getEra();
        int int76 = dateTime70.compareTo((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime78 = org.joda.time.DateTime.now(dateTimeZone77);
        org.joda.time.DateTime dateTime80 = dateTime78.minusMillis((int) ' ');
        org.joda.time.Duration duration81 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime70, (org.joda.time.ReadableInstant) dateTime78);
        long long82 = duration81.getMillis();
        boolean boolean83 = duration63.isShorterThan((org.joda.time.ReadableDuration) duration81);
        org.joda.time.Duration duration84 = duration63.toDuration();
        org.joda.time.DateTime dateTime85 = dateTime7.minus((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Instant instant86 = dateTime85.toInstant();
        org.joda.time.DateTime dateTime88 = dateTime85.withSecondOfMinute(0);
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod(readableDuration0, (org.joda.time.ReadableInstant) dateTime88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime85 and instant86", (dateTime85.compareTo(instant86) == 0) == dateTime85.equals(instant86));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        int int8 = dateTime5.getEra();
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime5.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        int int28 = dateTimeZone26.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime29 = dateTime5.withZone(dateTimeZone26);
        org.joda.time.Instant instant30 = new org.joda.time.Instant();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) instant30);
        org.joda.time.DateTime.Property property32 = dateTime29.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property32.getFieldType();
        int int34 = property32.getMinimumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime29", (dateTime1.compareTo(dateTime29) == 0) == dateTime1.equals(dateTime29));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMillis((int) ' ');
        int int11 = dateTime8.getEra();
        int int12 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears((int) '4');
        org.joda.time.DateTime.Property property17 = dateTime14.dayOfWeek();
        org.joda.time.DateTime dateTime20 = dateTime14.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property21 = dateTime14.minuteOfHour();
        org.joda.time.DateTime dateTime23 = dateTime14.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime23.getZone();
        long long27 = dateTimeZone24.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime8.toMutableDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime34 = dateTime30.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime28, (org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime37 = dateTime30.plusDays(1);
        boolean boolean38 = instant0.equals((java.lang.Object) dateTime37);
        org.joda.time.DateTime dateTime39 = dateTime37.toDateTimeISO();
        int int40 = dateTime37.getYearOfCentury();
        org.joda.time.DateTime dateTime42 = dateTime37.plusYears(39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean1 = instant0.isAfterNow();
        org.joda.time.Instant instant3 = instant0.withMillis((long) (short) 0);
        org.joda.time.Instant instant5 = instant3.minus(2629746000L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.DateTime dateTime10 = property8.roundCeilingCopy();
        int int11 = instant3.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minusMillis((-27425237));
        org.joda.time.DateMidnight dateMidnight14 = dateTime13.toDateMidnight();
        int int15 = dateTime13.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime7", (instant0.compareTo(dateTime7) == 0) == instant0.equals(dateTime7));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period5 = period2.plusSeconds((int) (short) 1);
        org.joda.time.Period period7 = period5.multipliedBy((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod8 = period5.toMutablePeriod();
        org.joda.time.Period period10 = period5.minusMillis((int) (short) 100);
        org.joda.time.Period period12 = period5.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears((int) '4');
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfWeek();
        org.joda.time.DateTime dateTime21 = dateTime15.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property22 = dateTime15.minuteOfHour();
        org.joda.time.DateTime dateTime23 = dateTime15.toDateTime();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableDuration13, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime27 = dateTime15.withDurationAdded((long) (byte) 10, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.minusMillis((int) ' ');
        int int36 = dateTime33.getEra();
        int int37 = dateTime31.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.plusYears((int) '4');
        org.joda.time.DateTime.Property property42 = dateTime39.dayOfWeek();
        org.joda.time.DateTime dateTime45 = dateTime39.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property46 = dateTime39.minuteOfHour();
        org.joda.time.DateTime dateTime48 = dateTime39.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTime48.getZone();
        long long52 = dateTimeZone49.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime33.toMutableDateTime(dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        int int56 = dateTimeZone54.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime57 = dateTime33.withZone(dateTimeZone54);
        org.joda.time.Seconds seconds58 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.Duration duration59 = period12.toDurationTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime62 = org.joda.time.DateTime.now(dateTimeZone61);
        java.lang.String str63 = dateTimeZone61.getID();
        long long65 = dateTimeZone61.previousTransition((long) (short) 0);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) 1, dateTimeZone61);
        java.lang.String str68 = dateTimeZone61.getName((long) 1);
        boolean boolean69 = dateTimeZone61.isFixed();
        long long71 = dateTimeZone61.nextTransition(52680100L);
        java.lang.String str72 = dateTimeZone61.toString();
        long long75 = dateTimeZone61.convertLocalToUTC(4519264383L, false);
        org.joda.time.DateTime dateTime76 = dateTime27.withZoneRetainFields(dateTimeZone61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime57", (dateTime15.compareTo(dateTime57) == 0) == dateTime15.equals(dateTime57));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.lang.Object obj0 = null;
        org.joda.time.Instant instant1 = new org.joda.time.Instant(obj0);
        long long2 = instant1.getMillis();
        org.joda.time.DateTime dateTime3 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.roundFloorCopy();
        org.joda.time.DateTime dateTime9 = dateTime7.plus(4320000001L);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) instant10);
        org.joda.time.DateTime dateTime12 = instant10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTimeISO();
        int int14 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime5", (instant1.compareTo(dateTime5) == 0) == instant1.equals(dateTime5));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) 'u');
        org.joda.time.Period period3 = period1.plusHours(2022);
        org.joda.time.Period period5 = period1.withYears(6);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) ' ');
        int int10 = dateTime7.getEra();
        org.joda.time.DateTime.Property property11 = dateTime7.secondOfMinute();
        org.joda.time.DateTime dateTime12 = property11.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((java.lang.Object) dateTime12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = dateTime15.withZone(dateTimeZone16);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        boolean boolean20 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime22 = dateTime12.withHourOfDay(20);
        org.joda.time.LocalTime localTime23 = dateTime12.toLocalTime();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfMonth();
        org.joda.time.DateTime dateTime27 = property26.roundFloorCopy();
        org.joda.time.DateTime dateTime29 = dateTime27.plus(4320000001L);
        org.joda.time.Instant instant30 = new org.joda.time.Instant();
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) instant30);
        org.joda.time.DateTime dateTime32 = localTime23.toDateTime((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Instant instant33 = instant30.toInstant();
        org.joda.time.Duration duration34 = period1.toDurationFrom((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Period period36 = period1.withWeeks(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant30", (dateTime7.compareTo(instant30) == 0) == dateTime7.equals(instant30));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime2.withZone(dateTimeZone3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfMonth();
        org.joda.time.DateTime dateTime10 = property9.roundFloorCopy();
        org.joda.time.DateTime dateTime12 = dateTime10.plus(4320000001L);
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) instant13);
        int int15 = dateTimeZone3.getOffset((org.joda.time.ReadableInstant) instant13);
        org.joda.time.DateTime dateTime16 = instant13.toDateTimeISO();
        org.joda.time.Chronology chronology17 = instant13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 26417389, chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant13", (dateTime2.compareTo(instant13) == 0) == dateTime2.equals(instant13));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime1.withZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMillis((int) ' ');
        int int9 = dateTime6.getEra();
        boolean boolean10 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime6);
        java.util.GregorianCalendar gregorianCalendar11 = dateTime4.toGregorianCalendar();
        org.joda.time.Instant instant12 = new org.joda.time.Instant((java.lang.Object) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusYears((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property20 = dateTime18.yearOfCentury();
        org.joda.time.DateTime dateTime21 = property20.withMinimumValue();
        boolean boolean22 = dateTimeZone14.equals((java.lang.Object) dateTime21);
        org.joda.time.DateTime dateTime24 = dateTime21.plusWeeks((int) (byte) 100);
        boolean boolean25 = dateTime24.isBeforeNow();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusYears((int) '4');
        org.joda.time.DateTime.Property property37 = dateTime34.dayOfWeek();
        org.joda.time.DateTime dateTime40 = dateTime34.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property41 = dateTime34.secondOfMinute();
        org.joda.time.Chronology chronology42 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.dayOfMonth();
        org.joda.time.Period period44 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology42);
        org.joda.time.DurationField durationField45 = chronology42.months();
        org.joda.time.DateTimeField dateTimeField46 = chronology42.weekyear();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology42);
        org.joda.time.DateTimeField dateTimeField48 = chronology42.clockhourOfHalfday();
        org.joda.time.Period period49 = new org.joda.time.Period((long) 93, 4519128886L, periodType30, chronology42);
        org.joda.time.Period period50 = new org.joda.time.Period(0L, (long) 165, periodType30);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant12, (org.joda.time.ReadableInstant) dateTime24, periodType30);
        org.joda.time.PeriodType periodType52 = periodType30.withWeeksRemoved();
        org.joda.time.PeriodType periodType53 = periodType30.withHoursRemoved();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant12", (dateTime1.compareTo(instant12) == 0) == dateTime1.equals(instant12));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.Instant instant5 = instant0.minus((long) 'u');
        org.joda.time.Instant instant7 = instant0.withMillis(4518960357L);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusYears((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property14 = dateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime15 = property14.withMinimumValue();
        org.joda.time.DateTime dateTime16 = property14.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime17 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType19 = periodType18.withYearsRemoved();
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime17, periodType18);
        java.util.Date date21 = dateTime17.toDate();
        org.joda.time.Period period24 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod25 = period24.toMutablePeriod();
        org.joda.time.Period period27 = period24.plusSeconds((int) (short) 1);
        org.joda.time.Period period29 = period27.multipliedBy((int) (byte) -1);
        org.joda.time.Period period31 = period29.minusSeconds((int) 'a');
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period33 = period29.normalizedStandard(periodType32);
        org.joda.time.DateTime dateTime35 = dateTime17.withPeriodAdded((org.joda.time.ReadablePeriod) period33, 26354);
        boolean boolean36 = dateTime35.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime10", (instant0.compareTo(dateTime10) == 0) == instant0.equals(dateTime10));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMillis((int) (short) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.hourOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.plusDays(54);
        org.joda.time.DateTime.Property property9 = dateTime3.dayOfMonth();
        int int10 = dateTime3.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone12.getName(26190964L, locale14);
        org.joda.time.DateTime dateTime16 = dateTime3.toDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMillis((int) ' ');
        int int25 = dateTime22.getEra();
        int int26 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime22);
        int int27 = dateTime20.getEra();
        org.joda.time.DateTime dateTime28 = dateTime20.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        int int31 = dateTime20.get(dateTimeFieldType29);
        int int32 = dateTime16.get(dateTimeFieldType29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusYears((int) '4');
        org.joda.time.DateTime.Property property37 = dateTime34.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        int int40 = property37.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime42 = dateTime39.minusMinutes(43);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.millisOfDay();
        java.lang.String str44 = dateTimeFieldType43.getName();
        org.joda.time.DurationFieldType durationFieldType45 = dateTimeFieldType43.getDurationType();
        org.joda.time.DateTime dateTime47 = dateTime39.withFieldAdded(durationFieldType45, 59);
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime47);
        int int49 = dateTime47.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime16", (dateTime3.compareTo(dateTime16) == 0) == dateTime3.equals(dateTime16));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        int int8 = dateTime5.getEra();
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime5);
        int int10 = dateTime3.getEra();
        org.joda.time.DateTime dateTime11 = dateTime3.toDateTime();
        int int12 = dateTime3.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMillis((int) ' ');
        int int21 = dateTime18.getEra();
        int int22 = dateTime16.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusYears((int) '4');
        org.joda.time.DateTime.Property property27 = dateTime24.dayOfWeek();
        org.joda.time.DateTime dateTime30 = dateTime24.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property31 = dateTime24.minuteOfHour();
        org.joda.time.DateTime dateTime33 = dateTime24.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime33.getZone();
        long long37 = dateTimeZone34.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime18.toMutableDateTime(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        int int41 = dateTimeZone39.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime42 = dateTime18.withZone(dateTimeZone39);
        org.joda.time.Instant instant43 = new org.joda.time.Instant();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableInstant) instant43);
        org.joda.time.DateTime dateTime45 = dateTime3.minus((org.joda.time.ReadablePeriod) mutablePeriod44);
        org.joda.time.DateTime dateTime47 = dateTime45.plusMonths(421);
        org.joda.time.Period period49 = org.joda.time.Period.weeks(74);
        org.joda.time.Days days50 = period49.toStandardDays();
        org.joda.time.ReadableInterval readableInterval51 = null;
        org.joda.time.Days days52 = org.joda.time.Days.daysIn(readableInterval51);
        org.joda.time.Duration duration53 = days52.toStandardDuration();
        org.joda.time.Period period56 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod57 = period56.toMutablePeriod();
        org.joda.time.Period period59 = period56.plusSeconds((int) (short) 1);
        org.joda.time.Days days60 = period59.toStandardDays();
        org.joda.time.Days days61 = days52.minus(days60);
        org.joda.time.Days days62 = days50.minus(days60);
        org.joda.time.Days days64 = days50.plus(954);
        org.joda.time.DurationFieldType durationFieldType65 = days50.getFieldType();
        java.lang.String str66 = days50.toString();
        org.joda.time.DateTime dateTime67 = dateTime47.minus((org.joda.time.ReadablePeriod) days50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime42", (dateTime1.compareTo(dateTime42) == 0) == dateTime1.equals(dateTime42));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMillis((int) (short) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.hourOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.plusDays(54);
        org.joda.time.DateTime.Property property9 = dateTime3.dayOfMonth();
        int int10 = dateTime3.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone12.getName(26190964L, locale14);
        org.joda.time.DateTime dateTime16 = dateTime3.toDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = dateTime18.withZone(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMillis((int) ' ');
        int int26 = dateTime23.getEra();
        boolean boolean27 = dateTime21.isEqual((org.joda.time.ReadableInstant) dateTime23);
        java.util.GregorianCalendar gregorianCalendar28 = dateTime21.toGregorianCalendar();
        org.joda.time.DateTime dateTime30 = dateTime21.minusWeeks(568);
        org.joda.time.DateTime dateTime32 = dateTime21.withWeekyear((int) 'a');
        org.joda.time.Days days33 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Period period36 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod37 = period36.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval38 = null;
        org.joda.time.Days days39 = org.joda.time.Days.daysIn(readableInterval38);
        org.joda.time.Duration duration40 = days39.toStandardDuration();
        org.joda.time.Duration duration41 = duration40.toDuration();
        org.joda.time.ReadableDuration readableDuration42 = null;
        boolean boolean43 = duration41.isLongerThan(readableDuration42);
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.Days days45 = org.joda.time.Days.daysIn(readableInterval44);
        org.joda.time.Duration duration46 = days45.toStandardDuration();
        org.joda.time.Duration duration47 = duration46.toDuration();
        org.joda.time.ReadableDuration readableDuration48 = null;
        boolean boolean49 = duration47.isLongerThan(readableDuration48);
        boolean boolean50 = duration41.isShorterThan((org.joda.time.ReadableDuration) duration47);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.minusMillis((int) ' ');
        int int55 = dateTime52.getEra();
        org.joda.time.DateTime dateTime57 = dateTime52.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime59 = dateTime52.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval60 = duration41.toIntervalTo((org.joda.time.ReadableInstant) dateTime52);
        mutablePeriod37.add((org.joda.time.ReadableInterval) interval60);
        org.joda.time.MutableInterval mutableInterval62 = interval60.toMutableInterval();
        org.joda.time.Days days63 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) mutableInterval62);
        org.joda.time.DurationFieldType durationFieldType64 = days63.getFieldType();
        org.joda.time.Days days65 = days33.minus(days63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime16", (dateTime3.compareTo(dateTime16) == 0) == dateTime3.equals(dateTime16));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period9 = period6.plusMinutes((int) (byte) 0);
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) period6);
        mutablePeriod3.addMonths((int) 'u');
        mutablePeriod3.addHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusYears((int) '4');
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfWeek();
        org.joda.time.DateTime dateTime25 = dateTime19.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property26 = dateTime19.secondOfMinute();
        org.joda.time.Chronology chronology27 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.dayOfMonth();
        org.joda.time.Period period29 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology27);
        org.joda.time.DurationField durationField30 = chronology27.months();
        mutablePeriod3.setPeriod((long) 1814400, chronology27);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusYears((int) '4');
        org.joda.time.DateTime.Property property37 = dateTime34.dayOfWeek();
        org.joda.time.DateTime dateTime40 = dateTime34.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property41 = dateTime34.secondOfMinute();
        org.joda.time.Chronology chronology42 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.dayOfMonth();
        org.joda.time.DurationField durationField44 = chronology42.weeks();
        org.joda.time.DateTimeField dateTimeField45 = chronology42.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField46 = chronology42.monthOfYear();
        mutablePeriod3.add((long) 74, chronology42);
        org.joda.time.DurationField durationField48 = chronology42.weekyears();
        org.joda.time.DurationField durationField49 = chronology42.years();
        org.joda.time.DurationFieldType durationFieldType50 = durationField49.getType();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.plusYears((int) '4');
        org.joda.time.DateTime.Property property55 = dateTime52.dayOfWeek();
        org.joda.time.DateTime dateTime58 = dateTime52.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property59 = dateTime52.secondOfMinute();
        org.joda.time.Chronology chronology60 = dateTime52.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.dayOfMonth();
        org.joda.time.DurationField durationField62 = chronology60.halfdays();
        org.joda.time.Chronology chronology63 = chronology60.withUTC();
        org.joda.time.DurationField durationField64 = chronology60.days();
        org.joda.time.DurationField durationField65 = chronology60.minutes();
        boolean boolean66 = durationFieldType50.isSupported(chronology60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField48 and durationField49", (durationField48.compareTo(durationField49) == 0) == durationField48.equals(durationField49));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Days days5 = org.joda.time.Days.daysIn(readableInterval4);
        org.joda.time.Duration duration6 = days5.toStandardDuration();
        org.joda.time.Duration duration7 = duration6.toDuration();
        org.joda.time.ReadableDuration readableDuration8 = null;
        boolean boolean9 = duration7.isLongerThan(readableDuration8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Days days11 = org.joda.time.Days.daysIn(readableInterval10);
        org.joda.time.Duration duration12 = days11.toStandardDuration();
        org.joda.time.Duration duration13 = duration12.toDuration();
        org.joda.time.ReadableDuration readableDuration14 = null;
        boolean boolean15 = duration13.isLongerThan(readableDuration14);
        boolean boolean16 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMillis((int) ' ');
        int int21 = dateTime18.getEra();
        org.joda.time.DateTime dateTime23 = dateTime18.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime25 = dateTime18.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval26 = duration7.toIntervalTo((org.joda.time.ReadableInstant) dateTime18);
        mutablePeriod3.add((org.joda.time.ReadableInterval) interval26);
        org.joda.time.Period period30 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod31 = period30.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.Days days33 = org.joda.time.Days.daysIn(readableInterval32);
        org.joda.time.Duration duration34 = days33.toStandardDuration();
        org.joda.time.Duration duration35 = duration34.toDuration();
        org.joda.time.ReadableDuration readableDuration36 = null;
        boolean boolean37 = duration35.isLongerThan(readableDuration36);
        org.joda.time.ReadableInterval readableInterval38 = null;
        org.joda.time.Days days39 = org.joda.time.Days.daysIn(readableInterval38);
        org.joda.time.Duration duration40 = days39.toStandardDuration();
        org.joda.time.Duration duration41 = duration40.toDuration();
        org.joda.time.ReadableDuration readableDuration42 = null;
        boolean boolean43 = duration41.isLongerThan(readableDuration42);
        boolean boolean44 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime46.minusMillis((int) ' ');
        int int49 = dateTime46.getEra();
        org.joda.time.DateTime dateTime51 = dateTime46.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime53 = dateTime46.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval54 = duration35.toIntervalTo((org.joda.time.ReadableInstant) dateTime46);
        mutablePeriod31.add((org.joda.time.ReadableInterval) interval54);
        boolean boolean56 = interval26.isBefore((org.joda.time.ReadableInterval) interval54);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now(dateTimeZone57);
        org.joda.time.DateTime dateTime60 = dateTime58.minusMillis((int) ' ');
        int int61 = dateTime58.getEra();
        org.joda.time.DateTime dateTime63 = dateTime58.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime65 = dateTime58.withYearOfCentury((int) (short) 1);
        org.joda.time.DateTime dateTime67 = dateTime58.plusMonths(2022);
        boolean boolean68 = interval26.isBefore((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.DateTime dateTime69 = interval26.getEnd();
        org.joda.time.Instant instant70 = dateTime69.toInstant();
        org.joda.time.DateTime.Property property71 = dateTime69.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant70", (dateTime18.compareTo(instant70) == 0) == dateTime18.equals(instant70));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean1 = instant0.isAfterNow();
        org.joda.time.Instant instant3 = instant0.withMillis((long) (short) 0);
        org.joda.time.Instant instant5 = instant3.minus(2629746000L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.DateTime dateTime10 = property8.roundCeilingCopy();
        int int11 = instant3.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) '4');
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfWeek();
        org.joda.time.DateTime dateTime19 = dateTime13.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property20 = dateTime13.minuteOfDay();
        org.joda.time.DateTime dateTime21 = dateTime13.withLaterOffsetAtOverlap();
        boolean boolean23 = dateTime21.isAfter((long) 26160);
        boolean boolean24 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.Days days26 = org.joda.time.Days.daysIn(readableInterval25);
        org.joda.time.Duration duration27 = days26.toStandardDuration();
        org.joda.time.Duration duration28 = duration27.toDuration();
        org.joda.time.ReadableDuration readableDuration29 = null;
        boolean boolean30 = duration28.isLongerThan(readableDuration29);
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.Days days32 = org.joda.time.Days.daysIn(readableInterval31);
        org.joda.time.Duration duration33 = days32.toStandardDuration();
        org.joda.time.Duration duration34 = duration33.toDuration();
        org.joda.time.ReadableDuration readableDuration35 = null;
        boolean boolean36 = duration34.isLongerThan(readableDuration35);
        boolean boolean37 = duration28.isShorterThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.minusMillis((int) ' ');
        int int42 = dateTime39.getEra();
        org.joda.time.DateTime dateTime44 = dateTime39.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime46 = dateTime39.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval47 = duration28.toIntervalTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = dateTime39.withChronology(chronology48);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime.Property property51 = dateTime39.property(dateTimeFieldType50);
        org.joda.time.DateTime dateTime53 = dateTime39.withYearOfEra((int) (byte) 100);
        int int54 = dateTime53.getSecondOfMinute();
        org.joda.time.DateTime.Property property55 = dateTime53.secondOfMinute();
        org.joda.time.DateMidnight dateMidnight56 = dateTime53.toDateMidnight();
        boolean boolean57 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateMidnight56);
        java.util.Locale locale59 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str60 = dateTime10.toString("800", locale59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime7", (instant0.compareTo(dateTime7) == 0) == instant0.equals(dateTime7));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime10 = dateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime10.getZone();
        long long14 = dateTimeZone11.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMillis((int) ' ');
        int int19 = dateTime16.getEra();
        org.joda.time.DateTime dateTime21 = dateTime16.minusMinutes((int) (short) 1);
        int int22 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property23 = dateTime16.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DateTime dateTime26 = dateTime16.withFieldAdded(durationFieldType24, 955);
        org.joda.time.Instant instant27 = dateTime16.toInstant();
        org.joda.time.DateTime dateTime29 = dateTime16.plusYears(244);
        org.joda.time.DateTime dateTime31 = dateTime16.withDayOfYear(54);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusMillis((int) ' ');
        int int40 = dateTime37.getEra();
        int int41 = dateTime35.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.plusYears((int) '4');
        org.joda.time.DateTime.Property property46 = dateTime43.dayOfWeek();
        org.joda.time.DateTime dateTime49 = dateTime43.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property50 = dateTime43.minuteOfHour();
        org.joda.time.DateTime dateTime52 = dateTime43.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTime52.getZone();
        long long56 = dateTimeZone53.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime37.toMutableDateTime(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime59 = org.joda.time.DateTime.now(dateTimeZone58);
        org.joda.time.DateTime dateTime61 = dateTime59.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime63 = dateTime59.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime57, (org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTime dateTime66 = dateTime59.plusDays(1);
        org.joda.time.DateTime.Property property67 = dateTime66.dayOfMonth();
        int int68 = dateTime66.getMinuteOfDay();
        org.joda.time.DateTime.Property property69 = dateTime66.monthOfYear();
        org.joda.time.DateTime.Property property70 = dateTime66.millisOfDay();
        org.joda.time.Duration duration71 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant27", (dateTime1.compareTo(instant27) == 0) == dateTime1.equals(instant27));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period5 = period2.plusSeconds((int) (short) 1);
        org.joda.time.Period period7 = period5.multipliedBy((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod8 = period5.toMutablePeriod();
        org.joda.time.Period period10 = period5.minusMillis((int) (short) 100);
        org.joda.time.Period period12 = period5.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears((int) '4');
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfWeek();
        org.joda.time.DateTime dateTime21 = dateTime15.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property22 = dateTime15.minuteOfHour();
        org.joda.time.DateTime dateTime23 = dateTime15.toDateTime();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableDuration13, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime27 = dateTime15.withDurationAdded((long) (byte) 10, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.minusMillis((int) ' ');
        int int36 = dateTime33.getEra();
        int int37 = dateTime31.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.plusYears((int) '4');
        org.joda.time.DateTime.Property property42 = dateTime39.dayOfWeek();
        org.joda.time.DateTime dateTime45 = dateTime39.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property46 = dateTime39.minuteOfHour();
        org.joda.time.DateTime dateTime48 = dateTime39.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTime48.getZone();
        long long52 = dateTimeZone49.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime33.toMutableDateTime(dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        int int56 = dateTimeZone54.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime57 = dateTime33.withZone(dateTimeZone54);
        org.joda.time.Seconds seconds58 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.Duration duration59 = period12.toDurationTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime61 = org.joda.time.DateTime.now(dateTimeZone60);
        org.joda.time.DateTime dateTime63 = dateTime61.plusYears((int) '4');
        org.joda.time.DateTime.Property property64 = dateTime61.dayOfWeek();
        org.joda.time.DateTime dateTime67 = dateTime61.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property68 = dateTime61.secondOfMinute();
        org.joda.time.Chronology chronology69 = dateTime61.getChronology();
        org.joda.time.DateTime dateTime71 = dateTime61.minusYears(0);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime73 = org.joda.time.DateTime.now(dateTimeZone72);
        org.joda.time.DateTime dateTime75 = dateTime73.minusMillis((int) ' ');
        int int76 = dateTime73.getEra();
        org.joda.time.DateTime.Property property77 = dateTime73.secondOfMinute();
        org.joda.time.DateTime dateTime78 = property77.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((java.lang.Object) dateTime78);
        org.joda.time.DateTime dateTime81 = dateTime78.withMillisOfSecond(19);
        boolean boolean82 = dateTime71.isBefore((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.DateTime dateTime83 = dateTime81.withTimeAtStartOfDay();
        org.joda.time.Period period84 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration59, (org.joda.time.ReadableInstant) dateTime81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime57", (dateTime15.compareTo(dateTime57) == 0) == dateTime15.equals(dateTime57));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 40, 0L);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMillis((int) ' ');
        int int7 = dateTime4.getEra();
        org.joda.time.DateTime.Property property8 = dateTime4.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Days days10 = org.joda.time.Days.daysIn(readableInterval9);
        org.joda.time.Duration duration11 = days10.toStandardDuration();
        org.joda.time.Duration duration12 = duration11.toDuration();
        org.joda.time.DateTime dateTime14 = dateTime4.withDurationAdded((org.joda.time.ReadableDuration) duration12, (-1));
        org.joda.time.Duration duration16 = duration12.plus((-1L));
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardHours((long) (short) 0);
        int int19 = duration12.compareTo((org.joda.time.ReadableDuration) duration18);
        org.joda.time.Instant instant20 = new org.joda.time.Instant();
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.Days days22 = org.joda.time.Days.daysIn(readableInterval21);
        org.joda.time.Duration duration23 = days22.toStandardDuration();
        org.joda.time.Duration duration24 = duration23.toDuration();
        org.joda.time.ReadableDuration readableDuration25 = null;
        boolean boolean26 = duration24.isLongerThan(readableDuration25);
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.Days days28 = org.joda.time.Days.daysIn(readableInterval27);
        org.joda.time.Duration duration29 = days28.toStandardDuration();
        org.joda.time.Duration duration30 = duration29.toDuration();
        org.joda.time.ReadableDuration readableDuration31 = null;
        boolean boolean32 = duration30.isLongerThan(readableDuration31);
        boolean boolean33 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration30);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.minusMillis((int) ' ');
        int int38 = dateTime35.getEra();
        org.joda.time.DateTime dateTime40 = dateTime35.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval43 = duration24.toIntervalTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Period period44 = duration24.toPeriod();
        long long45 = duration24.getStandardSeconds();
        org.joda.time.Instant instant47 = instant20.withDurationAdded((org.joda.time.ReadableDuration) duration24, 2022);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime53.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(dateTimeZone56);
        org.joda.time.DateTime dateTime59 = dateTime57.minusMillis((int) ' ');
        int int60 = dateTime57.getEra();
        int int61 = dateTime55.compareTo((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime63 = org.joda.time.DateTime.now(dateTimeZone62);
        org.joda.time.DateTime dateTime65 = dateTime63.minusMillis((int) ' ');
        org.joda.time.Duration duration66 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime68 = org.joda.time.DateTime.now(dateTimeZone67);
        org.joda.time.DateTime.Property property69 = dateTime68.dayOfMonth();
        org.joda.time.DateTime dateTime70 = property69.roundFloorCopy();
        org.joda.time.DateTime.Property property71 = dateTime70.millisOfDay();
        org.joda.time.PeriodType periodType72 = org.joda.time.PeriodType.yearDay();
        org.joda.time.DurationFieldType durationFieldType73 = org.joda.time.DurationFieldType.halfdays();
        int int74 = periodType72.indexOf(durationFieldType73);
        org.joda.time.PeriodType periodType75 = periodType72.withWeeksRemoved();
        int int76 = periodType75.size();
        org.joda.time.Period period77 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration66, (org.joda.time.ReadableInstant) dateTime70, periodType75);
        org.joda.time.Period period78 = new org.joda.time.Period(978566400000L, (long) 9, periodType75);
        org.joda.time.DurationFieldType durationFieldType79 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime81 = org.joda.time.DateTime.now(dateTimeZone80);
        org.joda.time.DateTime dateTime83 = dateTime81.plusYears((int) '4');
        org.joda.time.DateTime.Property property84 = dateTime81.dayOfWeek();
        org.joda.time.DateTime dateTime87 = dateTime81.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property88 = dateTime81.secondOfMinute();
        org.joda.time.Chronology chronology89 = dateTime81.getChronology();
        org.joda.time.DateTimeField dateTimeField90 = chronology89.dayOfMonth();
        org.joda.time.DurationField durationField91 = durationFieldType79.getField(chronology89);
        org.joda.time.DateTimeField dateTimeField92 = chronology89.weekOfWeekyear();
        org.joda.time.Period period93 = new org.joda.time.Period((long) 2, (long) 570, periodType75, chronology89);
        org.joda.time.MutablePeriod mutablePeriod94 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration18, (org.joda.time.ReadableInstant) instant47, periodType75);
        boolean boolean95 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration18);
        long long96 = duration18.getStandardDays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant20", (dateTime4.compareTo(instant20) == 0) == dateTime4.equals(instant20));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime1.withZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMillis((int) ' ');
        int int9 = dateTime6.getEra();
        boolean boolean10 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime6);
        java.util.GregorianCalendar gregorianCalendar11 = dateTime4.toGregorianCalendar();
        org.joda.time.DateTime dateTime13 = dateTime4.minusWeeks(568);
        org.joda.time.DateTime dateTime15 = dateTime4.minus(3300000L);
        org.joda.time.Instant instant16 = dateTime15.toInstant();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusYears((int) '4');
        org.joda.time.DateTime.Property property21 = dateTime18.dayOfWeek();
        org.joda.time.DateTime dateTime24 = dateTime18.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property25 = dateTime18.minuteOfHour();
        org.joda.time.DateTime dateTime26 = dateTime18.toDateTime();
        int int27 = dateTime26.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusYears((int) '4');
        org.joda.time.DateTime.Property property32 = dateTime29.dayOfWeek();
        org.joda.time.DateTime dateTime35 = dateTime29.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property36 = dateTime29.minuteOfHour();
        org.joda.time.DateTime dateTime37 = dateTime29.toDateTime();
        org.joda.time.DateTime dateTime39 = dateTime29.plusMinutes(22);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime42 = dateTime26.withYearOfEra(16);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str44 = dateTimeFieldType43.getName();
        boolean boolean45 = dateTime42.isSupported(dateTimeFieldType43);
        org.joda.time.DateTime.Property property46 = dateTime15.property(dateTimeFieldType43);
        int int47 = property46.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant16", (dateTime15.compareTo(instant16) == 0) == dateTime15.equals(instant16));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        int int4 = dateTime1.getEra();
        org.joda.time.DateTime.Property property5 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) dateTime6);
        org.joda.time.DateTime dateTime9 = dateTime6.withMillisOfSecond(19);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMillis((int) ' ');
        int int14 = dateTime11.getEra();
        org.joda.time.DateTime.Property property15 = dateTime11.secondOfMinute();
        org.joda.time.DateTime dateTime16 = property15.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((java.lang.Object) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.DateTime.Property property23 = dateTime22.weekyear();
        boolean boolean24 = dateTime16.isEqual((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime26 = dateTime16.withHourOfDay(20);
        org.joda.time.LocalTime localTime27 = dateTime16.toLocalTime();
        org.joda.time.Seconds seconds28 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Instant instant29 = new org.joda.time.Instant();
        boolean boolean31 = instant29.isEqual(10L);
        org.joda.time.Instant instant32 = instant29.toInstant();
        org.joda.time.ReadableInstant readableInstant33 = null;
        boolean boolean34 = instant29.isBefore(readableInstant33);
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime6, readableInstant33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant29", (dateTime1.compareTo(instant29) == 0) == dateTime1.equals(instant29));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime1.withZone(dateTimeZone2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus(4320000001L);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) instant12);
        int int14 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) instant12);
        org.joda.time.MutableDateTime mutableDateTime15 = instant12.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime16 = instant12.toMutableDateTimeISO();
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks19 = weeks17.plus(0);
        org.joda.time.Weeks weeks21 = weeks19.minus(3);
        int int22 = weeks21.getWeeks();
        int int23 = weeks21.getWeeks();
        org.joda.time.Weeks weeks25 = weeks21.plus(17);
        boolean boolean26 = mutableDateTime16.equals((java.lang.Object) weeks21);
        org.joda.time.Weeks weeks27 = weeks21.negated();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant12", (dateTime1.compareTo(instant12) == 0) == dateTime1.equals(instant12));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        int int8 = dateTime5.getEra();
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime5.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime31 = dateTime27.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime25, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime34 = dateTime27.plusDays(1);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((java.lang.Object) dateTime27);
        org.joda.time.Instant instant38 = instant35.withDurationAdded(4519128886L, 26181655);
        org.joda.time.Instant instant40 = instant38.plus(26312218L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant35", (dateTime1.compareTo(instant35) == 0) == dateTime1.equals(instant35));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.Period period3 = period2.negated();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMillis((int) ' ');
        int int12 = dateTime9.getEra();
        int int13 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears((int) '4');
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfWeek();
        org.joda.time.DateTime dateTime21 = dateTime15.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property22 = dateTime15.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime15.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime24.getZone();
        long long28 = dateTimeZone25.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime9.toMutableDateTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        int int32 = dateTimeZone30.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime33 = dateTime9.withZone(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.plusYears((int) '4');
        org.joda.time.DateTime.Property property38 = dateTime35.dayOfWeek();
        org.joda.time.DateTime dateTime41 = dateTime35.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property42 = dateTime35.minuteOfHour();
        int int43 = property42.getMaximumValue();
        boolean boolean44 = property42.isLeap();
        org.joda.time.DurationField durationField45 = property42.getDurationField();
        org.joda.time.DateTime dateTime46 = property42.roundHalfFloorCopy();
        boolean boolean47 = dateTime33.isAfter((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime49 = dateTime33.plusMillis(26193);
        org.joda.time.Duration duration50 = period3.toDurationTo((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.YearMonthDay yearMonthDay51 = dateTime49.toYearMonthDay();
        org.joda.time.DateTime dateTime53 = dateTime49.plusYears(25533);
        org.joda.time.DateTime.Property property54 = dateTime49.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime33", (dateTime5.compareTo(dateTime33) == 0) == dateTime5.equals(dateTime33));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        int int8 = dateTime5.getEra();
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime5.toMutableDateTime(dateTimeZone21);
        org.joda.time.ReadableInterval readableInterval26 = null;
        org.joda.time.Days days27 = org.joda.time.Days.daysIn(readableInterval26);
        org.joda.time.Duration duration28 = days27.toStandardDuration();
        org.joda.time.Duration duration29 = duration28.toDuration();
        org.joda.time.ReadableDuration readableDuration30 = null;
        boolean boolean31 = duration29.isLongerThan(readableDuration30);
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.Days days33 = org.joda.time.Days.daysIn(readableInterval32);
        org.joda.time.Duration duration34 = days33.toStandardDuration();
        org.joda.time.Duration duration35 = duration34.toDuration();
        org.joda.time.ReadableDuration readableDuration36 = null;
        boolean boolean37 = duration35.isLongerThan(readableDuration36);
        boolean boolean38 = duration29.isShorterThan((org.joda.time.ReadableDuration) duration35);
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.Days days40 = org.joda.time.Days.daysIn(readableInterval39);
        org.joda.time.Duration duration41 = days40.toStandardDuration();
        org.joda.time.Duration duration42 = duration41.toDuration();
        boolean boolean43 = duration35.isLongerThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.weeks();
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime25, (org.joda.time.ReadableDuration) duration42, periodType44);
        int int46 = mutableDateTime25.getMonthOfYear();
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Instant instant50 = instant47.withDurationAdded((long) 40, 0);
        org.joda.time.Chronology chronology51 = instant47.getChronology();
        org.joda.time.MutableDateTime mutableDateTime52 = instant47.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.plusYears((int) '4');
        org.joda.time.DateTime.Property property57 = dateTime54.dayOfWeek();
        org.joda.time.DateTime dateTime60 = dateTime54.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property61 = dateTime54.minuteOfHour();
        org.joda.time.DateTime dateTime63 = dateTime54.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone64 = dateTime63.getZone();
        org.joda.time.DateTime dateTime65 = org.joda.time.DateTime.now(dateTimeZone64);
        org.joda.time.DateTime.Property property66 = dateTime65.minuteOfHour();
        org.joda.time.Chronology chronology67 = dateTime65.getChronology();
        org.joda.time.DateTimeField dateTimeField68 = chronology67.clockhourOfHalfday();
        org.joda.time.DateTime dateTime69 = mutableDateTime52.toDateTime(chronology67);
        int int70 = mutableDateTime25.compareTo((org.joda.time.ReadableInstant) dateTime69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant47", (dateTime1.compareTo(instant47) == 0) == dateTime1.equals(instant47));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 40, 0);
        org.joda.time.Chronology chronology4 = instant0.getChronology();
        org.joda.time.Instant instant6 = instant0.plus((long) (-2148390));
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod10 = period9.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Days days12 = org.joda.time.Days.daysIn(readableInterval11);
        org.joda.time.Duration duration13 = days12.toStandardDuration();
        org.joda.time.Duration duration14 = duration13.toDuration();
        org.joda.time.ReadableDuration readableDuration15 = null;
        boolean boolean16 = duration14.isLongerThan(readableDuration15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.Days days18 = org.joda.time.Days.daysIn(readableInterval17);
        org.joda.time.Duration duration19 = days18.toStandardDuration();
        org.joda.time.Duration duration20 = duration19.toDuration();
        org.joda.time.ReadableDuration readableDuration21 = null;
        boolean boolean22 = duration20.isLongerThan(readableDuration21);
        boolean boolean23 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMillis((int) ' ');
        int int28 = dateTime25.getEra();
        org.joda.time.DateTime dateTime30 = dateTime25.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime32 = dateTime25.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval33 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime25);
        mutablePeriod10.add((org.joda.time.ReadableInterval) interval33);
        mutablePeriod10.addYears((int) ' ');
        mutablePeriod10.setSeconds((int) (byte) 100);
        mutablePeriod10.setDays((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusMillis((int) ' ');
        int int45 = dateTime42.getEra();
        org.joda.time.DateTime.Property property46 = dateTime42.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval47 = null;
        org.joda.time.Days days48 = org.joda.time.Days.daysIn(readableInterval47);
        org.joda.time.Duration duration49 = days48.toStandardDuration();
        org.joda.time.Duration duration50 = duration49.toDuration();
        org.joda.time.DateTime dateTime52 = dateTime42.withDurationAdded((org.joda.time.ReadableDuration) duration50, (-1));
        org.joda.time.Duration duration54 = duration50.plus((-1L));
        long long55 = duration50.getStandardMinutes();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration50);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime59 = org.joda.time.DateTime.now(dateTimeZone58);
        java.lang.String str60 = dateTimeZone58.getID();
        long long62 = dateTimeZone58.previousTransition((long) (short) 0);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) 1, dateTimeZone58);
        org.joda.time.Interval interval64 = duration50.toIntervalFrom((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Instant instant66 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration50, 26230665);
        org.joda.time.DateTime dateTime67 = instant66.toDateTime();
        org.joda.time.DateTime dateTime69 = dateTime67.plusWeeks(26314);
        boolean boolean70 = dateTime69.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime25", (instant0.compareTo(dateTime25) == 0) == instant0.equals(dateTime25));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant0.toMutableDateTime();
        org.joda.time.Instant instant6 = instant0.withMillis((long) 26302);
        org.joda.time.Duration duration8 = org.joda.time.Duration.parse("PT2147483647S");
        org.joda.time.Duration duration10 = duration8.minus((-78382080000000L));
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getDurationType();
        boolean boolean15 = periodType12.isSupported(durationFieldType14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) '4');
        org.joda.time.DateTime.Property property20 = dateTime17.dayOfWeek();
        org.joda.time.DateTime dateTime23 = dateTime17.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property24 = dateTime17.secondOfMinute();
        org.joda.time.Chronology chronology25 = dateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfMonth();
        org.joda.time.DurationField durationField27 = chronology25.weeks();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(1L, periodType12, chronology25);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.plusYears((int) '4');
        org.joda.time.DateTime.Property property34 = dateTime31.dayOfWeek();
        org.joda.time.DateTime dateTime37 = dateTime31.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property38 = dateTime31.secondOfMinute();
        org.joda.time.Chronology chronology39 = dateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.dayOfMonth();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.Period period44 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod45 = period44.toMutablePeriod();
        org.joda.time.Period period47 = period44.plusSeconds((int) (short) 1);
        org.joda.time.Days days48 = period47.toStandardDays();
        org.joda.time.ReadableInterval readableInterval49 = null;
        org.joda.time.Days days50 = org.joda.time.Days.daysIn(readableInterval49);
        java.lang.String str51 = days50.toString();
        boolean boolean52 = days48.isGreaterThan(days50);
        long long55 = chronology39.add((org.joda.time.ReadablePeriod) days50, (long) ' ', (int) ' ');
        org.joda.time.DateTimeField dateTimeField56 = chronology39.hourOfHalfday();
        org.joda.time.Period period57 = duration8.toPeriod(periodType12, chronology39);
        org.joda.time.DateTimeField dateTimeField58 = chronology39.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField59 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField60 = chronology39.weekOfWeekyear();
        int int61 = instant0.get(dateTimeField60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime4", (instant0.compareTo(mutableDateTime4) == 0) == instant0.equals(mutableDateTime4));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Instant instant7 = instant3.withDurationAdded(1645514184041L, (int) '4');
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Days days9 = org.joda.time.Days.daysIn(readableInterval8);
        org.joda.time.Duration duration10 = days9.toStandardDuration();
        org.joda.time.Duration duration11 = duration10.toDuration();
        org.joda.time.ReadableDuration readableDuration12 = null;
        boolean boolean13 = duration11.isLongerThan(readableDuration12);
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.Days days15 = org.joda.time.Days.daysIn(readableInterval14);
        org.joda.time.Duration duration16 = days15.toStandardDuration();
        org.joda.time.Duration duration17 = duration16.toDuration();
        org.joda.time.ReadableDuration readableDuration18 = null;
        boolean boolean19 = duration17.isLongerThan(readableDuration18);
        boolean boolean20 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMillis((int) ' ');
        int int25 = dateTime22.getEra();
        org.joda.time.DateTime dateTime27 = dateTime22.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime29 = dateTime22.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval30 = duration11.toIntervalTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = dateTime22.withChronology(chronology31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime.Property property34 = dateTime22.property(dateTimeFieldType33);
        org.joda.time.DateTime dateTime36 = dateTime22.withYearOfEra((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime41 = dateTime38.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property42 = dateTime41.minuteOfHour();
        org.joda.time.Duration duration44 = org.joda.time.Duration.parse("PT2147483647S");
        long long45 = duration44.getStandardHours();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(dateTimeZone46);
        org.joda.time.DateTime dateTime49 = dateTime47.minusMillis((int) ' ');
        int int50 = dateTime47.getEra();
        org.joda.time.DateTime.Property property51 = dateTime47.secondOfMinute();
        org.joda.time.Period period52 = duration44.toPeriodTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.hours();
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime41, (org.joda.time.ReadableDuration) duration44, periodType53);
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableDuration) duration44);
        boolean boolean56 = instant7.isBefore((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime57 = instant7.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime4", (instant0.compareTo(mutableDateTime4) == 0) == instant0.equals(mutableDateTime4));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        int int8 = dateTime5.getEra();
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime5.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        int int28 = dateTimeZone26.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime29 = dateTime5.withZone(dateTimeZone26);
        org.joda.time.Instant instant30 = new org.joda.time.Instant();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) instant30);
        org.joda.time.DateTime dateTime33 = dateTime29.plus(99999L);
        org.joda.time.Hours hours34 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours35 = org.joda.time.Hours.SEVEN;
        boolean boolean36 = hours34.isLessThan(hours35);
        org.joda.time.Hours hours37 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours38 = org.joda.time.Hours.SEVEN;
        boolean boolean39 = hours37.isLessThan(hours38);
        org.joda.time.Hours hours41 = hours37.multipliedBy(59);
        boolean boolean42 = hours35.isLessThan(hours41);
        org.joda.time.Hours hours44 = hours35.plus((int) (short) 1);
        org.joda.time.Duration duration45 = hours35.toStandardDuration();
        org.joda.time.Hours hours47 = hours35.minus(999);
        org.joda.time.Duration duration48 = hours35.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.plusYears((int) '4');
        org.joda.time.DateTime.Property property53 = dateTime50.dayOfWeek();
        org.joda.time.DateTime dateTime56 = dateTime50.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property57 = dateTime50.minuteOfHour();
        int int58 = property57.getMaximumValue();
        boolean boolean59 = property57.isLeap();
        org.joda.time.DateTime dateTime60 = property57.roundHalfFloorCopy();
        org.joda.time.Period period61 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration48, (org.joda.time.ReadableInstant) dateTime60);
        int int62 = dateTime60.getYear();
        int int63 = dateTime29.compareTo((org.joda.time.ReadableInstant) dateTime60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant30", (dateTime1.compareTo(instant30) == 0) == dateTime1.equals(instant30));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime5 = dateTime1.minusMinutes((int) '#');
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Days days7 = org.joda.time.Days.daysIn(readableInterval6);
        org.joda.time.Duration duration8 = days7.toStandardDuration();
        org.joda.time.Duration duration9 = duration8.toDuration();
        org.joda.time.ReadableDuration readableDuration10 = null;
        boolean boolean11 = duration9.isLongerThan(readableDuration10);
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Days days13 = org.joda.time.Days.daysIn(readableInterval12);
        org.joda.time.Duration duration14 = days13.toStandardDuration();
        org.joda.time.Duration duration15 = duration14.toDuration();
        org.joda.time.ReadableDuration readableDuration16 = null;
        boolean boolean17 = duration15.isLongerThan(readableDuration16);
        boolean boolean18 = duration9.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableDuration) duration15, periodType19);
        int int21 = dateTime5.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.plusYears((int) '4');
        org.joda.time.DateTime.Property property26 = dateTime23.dayOfWeek();
        org.joda.time.DateTime dateTime29 = dateTime23.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property30 = dateTime23.minuteOfHour();
        org.joda.time.DateTime dateTime32 = dateTime23.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime32.getZone();
        long long36 = dateTimeZone33.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusMillis((int) ' ');
        int int41 = dateTime38.getEra();
        org.joda.time.DateTime dateTime43 = dateTime38.minusMinutes((int) (short) 1);
        int int44 = dateTimeZone33.getOffset((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTimeZone dateTimeZone45 = dateTime38.getZone();
        boolean boolean46 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime38);
        int int47 = dateTime38.getMillisOfSecond();
        org.joda.time.DateTime.Property property48 = dateTime38.minuteOfHour();
        org.joda.time.Instant instant49 = new org.joda.time.Instant();
        boolean boolean51 = instant49.isEqual(10L);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime53.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(dateTimeZone56);
        org.joda.time.DateTime dateTime59 = dateTime57.minusMillis((int) ' ');
        int int60 = dateTime57.getEra();
        int int61 = dateTime55.compareTo((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime63 = org.joda.time.DateTime.now(dateTimeZone62);
        org.joda.time.DateTime dateTime65 = dateTime63.plusYears((int) '4');
        org.joda.time.DateTime.Property property66 = dateTime63.dayOfWeek();
        org.joda.time.DateTime dateTime69 = dateTime63.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property70 = dateTime63.minuteOfHour();
        org.joda.time.DateTime dateTime72 = dateTime63.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone73 = dateTime72.getZone();
        long long76 = dateTimeZone73.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime77 = dateTime57.toMutableDateTime(dateTimeZone73);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime79 = org.joda.time.DateTime.now(dateTimeZone78);
        org.joda.time.DateTime dateTime81 = dateTime79.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime83 = dateTime79.minusMinutes((int) '#');
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime77, (org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.DateTime dateTime86 = dateTime79.plusDays(1);
        boolean boolean87 = instant49.equals((java.lang.Object) dateTime86);
        org.joda.time.Instant instant88 = instant49.toInstant();
        org.joda.time.Instant instant90 = instant88.minus((long) 26455);
        org.joda.time.DateTime dateTime91 = instant88.toDateTime();
        int int92 = property48.compareTo((org.joda.time.ReadableInstant) dateTime91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant49", (dateTime1.compareTo(instant49) == 0) == dateTime1.equals(instant49));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone5);
        int int7 = property4.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DurationField durationField8 = property4.getLeapDurationField();
        org.joda.time.DateTime dateTime10 = property4.setCopy((int) (byte) 1);
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.MAX_VALUE;
        org.joda.time.MutablePeriod mutablePeriod12 = seconds11.toMutablePeriod();
        org.joda.time.DateTime dateTime13 = dateTime10.plus((org.joda.time.ReadablePeriod) seconds11);
        org.joda.time.DateTime.Property property14 = dateTime10.monthOfYear();
        org.joda.time.Instant instant15 = dateTime10.toInstant();
        org.joda.time.DateTime dateTime16 = dateTime10.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfDay();
        org.joda.time.DurationField durationField18 = property17.getDurationField();
        java.lang.String str19 = property17.getAsText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant15", (dateTime10.compareTo(instant15) == 0) == dateTime10.equals(instant15));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean1 = instant0.isAfterNow();
        org.joda.time.Instant instant3 = instant0.withMillis((long) (short) 0);
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.DateTime dateTime5 = instant3.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusYears((int) '4');
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime13 = dateTime10.withFieldAdded(durationFieldType11, (int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMillis((int) ' ');
        int int19 = dateTime16.getEra();
        org.joda.time.DateTime dateTime21 = dateTime16.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime23 = dateTime16.withYearOfCentury((int) (short) 1);
        org.joda.time.DateTime dateTime24 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int26 = dateTime23.get(dateTimeFieldType25);
        boolean boolean27 = dateTime13.isSupported(dateTimeFieldType25);
        org.joda.time.DateTime dateTime28 = dateTime13.toDateTime();
        org.joda.time.DateTime.Property property29 = dateTime13.dayOfWeek();
        long long30 = dateTime13.getMillis();
        int int31 = instant3.compareTo((org.joda.time.ReadableInstant) dateTime13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime7", (instant0.compareTo(dateTime7) == 0) == instant0.equals(dateTime7));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(1645512059742L);
        org.joda.time.Chronology chronology2 = dateTime1.getChronology();
        org.joda.time.DateTime.Property property3 = dateTime1.millisOfSecond();
        org.joda.time.DateTime dateTime4 = property3.roundCeilingCopy();
        org.joda.time.DateTime dateTime6 = dateTime4.plusWeeks(26259);
        org.joda.time.DateTime dateTime8 = dateTime6.minusWeeks(24106);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant9.withDurationAdded((long) 40, 0);
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) instant9);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property19 = dateTime18.hourOfDay();
        org.joda.time.DurationField durationField20 = property19.getRangeDurationField();
        java.lang.String str21 = property19.getAsString();
        boolean boolean22 = property19.isLeap();
        boolean boolean23 = instant9.equals((java.lang.Object) boolean22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime15", (instant9.compareTo(dateTime15) == 0) == instant9.equals(dateTime15));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField11 = chronology9.weeks();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.monthOfYear();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(chronology9);
        org.joda.time.TimeOfDay timeOfDay15 = dateTime14.toTimeOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusYears((int) '4');
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfWeek();
        org.joda.time.DateTime dateTime25 = dateTime19.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property26 = dateTime19.secondOfMinute();
        org.joda.time.Chronology chronology27 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.dayOfMonth();
        org.joda.time.DurationField durationField29 = chronology27.weeks();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField31 = chronology27.monthOfYear();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 32, (long) 12, chronology27);
        org.joda.time.Chronology chronology33 = chronology27.withUTC();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.minusMillis((int) ' ');
        int int38 = dateTime35.getEra();
        org.joda.time.DateTime.Property property39 = dateTime35.secondOfMinute();
        org.joda.time.DateTime dateTime40 = property39.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((java.lang.Object) dateTime40);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = dateTime43.withZone(dateTimeZone44);
        org.joda.time.DateTime.Property property47 = dateTime46.weekyear();
        boolean boolean48 = dateTime40.isEqual((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime50 = dateTime40.withHourOfDay(20);
        org.joda.time.LocalTime localTime51 = dateTime40.toLocalTime();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone52);
        org.joda.time.DateTime.Property property54 = dateTime53.dayOfMonth();
        org.joda.time.DateTime dateTime55 = property54.roundFloorCopy();
        org.joda.time.DateTime dateTime57 = dateTime55.plus(4320000001L);
        org.joda.time.Instant instant58 = new org.joda.time.Instant();
        org.joda.time.Period period59 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadableInstant) instant58);
        org.joda.time.DateTime dateTime60 = localTime51.toDateTime((org.joda.time.ReadableInstant) instant58);
        long long62 = chronology27.set((org.joda.time.ReadablePartial) localTime51, 1645514250166L);
        int int63 = localTime51.size();
        org.joda.time.Period period64 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay15, (org.joda.time.ReadablePartial) localTime51);
        org.joda.time.PeriodType periodType65 = period64.getPeriodType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant58", (dateTime1.compareTo(instant58) == 0) == dateTime1.equals(instant58));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        int int4 = dateTime1.getEra();
        org.joda.time.DateTime dateTime6 = dateTime1.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime8 = dateTime1.withYearOfCentury((int) (short) 1);
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int11 = dateTime8.get(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = dateTime8.plusYears((int) 'u');
        org.joda.time.Instant instant14 = dateTime8.toInstant();
        org.joda.time.DateTime dateTime16 = dateTime8.withCenturyOfEra(24);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusYears((int) '4');
        org.joda.time.DateTime.Property property21 = dateTime18.dayOfWeek();
        org.joda.time.DateTime dateTime24 = dateTime18.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property25 = dateTime18.secondOfMinute();
        org.joda.time.Chronology chronology26 = dateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.dayOfMonth();
        org.joda.time.DurationField durationField28 = chronology26.weeks();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology26.weekyearOfCentury();
        org.joda.time.DateTime dateTime31 = dateTime8.toDateTime(chronology26);
        org.joda.time.DateMidnight dateMidnight32 = dateTime8.toDateMidnight();
        org.joda.time.Hours hours33 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours34 = org.joda.time.Hours.SEVEN;
        boolean boolean35 = hours33.isLessThan(hours34);
        org.joda.time.Duration duration36 = hours33.toStandardDuration();
        java.lang.Object obj37 = null;
        boolean boolean38 = duration36.equals(obj37);
        org.joda.time.Duration duration41 = duration36.withDurationAdded(4320000001L, (int) (short) 100);
        org.joda.time.Duration duration43 = duration41.plus((long) 378);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableDuration) duration43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime8", (instant14.compareTo(dateTime8) == 0) == instant14.equals(dateTime8));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime5 = dateTime1.minusMinutes((int) '#');
        java.lang.String str6 = dateTime5.toString();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.Chronology chronology8 = instant7.getChronology();
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Days days10 = org.joda.time.Days.daysIn(readableInterval9);
        org.joda.time.Duration duration11 = days10.toStandardDuration();
        org.joda.time.Duration duration12 = duration11.toDuration();
        org.joda.time.ReadableDuration readableDuration13 = null;
        boolean boolean14 = duration12.isLongerThan(readableDuration13);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.Days days16 = org.joda.time.Days.daysIn(readableInterval15);
        org.joda.time.Duration duration17 = days16.toStandardDuration();
        org.joda.time.Duration duration18 = duration17.toDuration();
        org.joda.time.ReadableDuration readableDuration19 = null;
        boolean boolean20 = duration18.isLongerThan(readableDuration19);
        boolean boolean21 = duration12.isShorterThan((org.joda.time.ReadableDuration) duration18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMillis((int) ' ');
        int int26 = dateTime23.getEra();
        org.joda.time.DateTime dateTime28 = dateTime23.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime30 = dateTime23.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval31 = duration12.toIntervalTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = dateTime23.withChronology(chronology32);
        org.joda.time.DateTime.Property property34 = dateTime23.monthOfYear();
        boolean boolean35 = instant7.isEqual((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime23.getZone();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant7", (dateTime5.compareTo(instant7) == 0) == dateTime5.equals(instant7));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.Duration duration2 = days1.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.Days days4 = org.joda.time.Days.daysIn(readableInterval3);
        org.joda.time.Duration duration5 = days4.toStandardDuration();
        org.joda.time.Duration duration6 = duration5.toDuration();
        org.joda.time.ReadableDuration readableDuration7 = null;
        boolean boolean8 = duration6.isLongerThan(readableDuration7);
        org.joda.time.Duration duration10 = duration2.withDurationAdded(readableDuration7, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) '4');
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfWeek();
        org.joda.time.DateTime dateTime18 = dateTime12.withDurationAdded((long) 100, 0);
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.Days days20 = org.joda.time.Days.daysIn(readableInterval19);
        org.joda.time.Duration duration21 = days20.toStandardDuration();
        org.joda.time.Duration duration22 = duration21.toDuration();
        org.joda.time.ReadableDuration readableDuration23 = null;
        boolean boolean24 = duration22.isLongerThan(readableDuration23);
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.Days days26 = org.joda.time.Days.daysIn(readableInterval25);
        org.joda.time.Duration duration27 = days26.toStandardDuration();
        org.joda.time.Duration duration28 = duration27.toDuration();
        org.joda.time.ReadableDuration readableDuration29 = null;
        boolean boolean30 = duration28.isLongerThan(readableDuration29);
        boolean boolean31 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableDuration) duration28);
        boolean boolean33 = duration10.isEqual((org.joda.time.ReadableDuration) duration28);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.plusYears((int) '4');
        org.joda.time.DateTime.Property property38 = dateTime35.dayOfWeek();
        org.joda.time.DateTime dateTime41 = dateTime35.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property42 = dateTime35.minuteOfHour();
        org.joda.time.DateTime dateTime43 = dateTime35.toDateTime();
        java.lang.String str44 = dateTime43.toString();
        org.joda.time.Period period45 = duration28.toPeriodTo((org.joda.time.ReadableInstant) dateTime43);
        long long46 = duration28.getMillis();
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        boolean boolean49 = instant47.isEqual(10L);
        org.joda.time.Instant instant50 = instant47.toInstant();
        org.joda.time.Instant instant52 = instant47.minus((long) 'u');
        org.joda.time.Instant instant55 = instant52.withDurationAdded((long) 26185, 26319819);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, (org.joda.time.ReadableInstant) instant52);
        org.joda.time.DateTimeZone dateTimeZone57 = instant52.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant47", (dateTime12.compareTo(instant47) == 0) == dateTime12.equals(instant47));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Weeks");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        boolean boolean4 = instant2.isEqual(10L);
        org.joda.time.Instant instant5 = instant2.toInstant();
        org.joda.time.Instant instant7 = instant2.minus((long) 'u');
        org.joda.time.Instant instant9 = instant2.withMillis(4518960357L);
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) '4');
        org.joda.time.DateTime dateTime15 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property16 = dateTime14.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime18 = property16.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime19 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType21 = periodType20.withYearsRemoved();
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime19, periodType20);
        boolean boolean23 = languageRange1.equals((java.lang.Object) periodType20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime12", (instant2.compareTo(dateTime12) == 0) == instant2.equals(dateTime12));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(9);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plusMillis(26409815);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears((int) '4');
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfWeek();
        org.joda.time.DateTime dateTime21 = dateTime15.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property22 = dateTime15.secondOfMinute();
        org.joda.time.Chronology chronology23 = dateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.dayOfMonth();
        org.joda.time.Period period25 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology23);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.years();
        org.joda.time.Seconds seconds27 = org.joda.time.Seconds.MAX_VALUE;
        java.lang.String str28 = seconds27.toString();
        java.lang.String str29 = seconds27.toString();
        org.joda.time.DurationFieldType durationFieldType30 = seconds27.getFieldType();
        boolean boolean31 = periodType26.isSupported(durationFieldType30);
        org.joda.time.PeriodType periodType32 = periodType26.withSecondsRemoved();
        org.joda.time.Period period33 = period25.normalizedStandard(periodType26);
        org.joda.time.PeriodType periodType34 = periodType26.withDaysRemoved();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.plusYears((int) '4');
        org.joda.time.DateTime.Property property41 = dateTime38.dayOfWeek();
        org.joda.time.DateTime dateTime44 = dateTime38.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property45 = dateTime38.secondOfMinute();
        org.joda.time.Chronology chronology46 = dateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.dayOfMonth();
        org.joda.time.Period period48 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology46);
        org.joda.time.DurationField durationField49 = chronology46.months();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 21, 1645514165665L, periodType34, chronology46);
        org.joda.time.DateTimeField dateTimeField51 = chronology46.weekyear();
        long long54 = dateTimeField51.add(1645488000000L, (long) 26321);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = dateTimeField51.getType();
        int int56 = dateTime9.get(dateTimeFieldType55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        int int8 = dateTime5.getEra();
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime5.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        int int28 = dateTimeZone26.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime29 = dateTime5.withZone(dateTimeZone26);
        org.joda.time.Instant instant30 = new org.joda.time.Instant();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) instant30);
        org.joda.time.DateTime dateTime33 = dateTime29.plusMillis(100);
        org.joda.time.DateTime dateTime35 = dateTime33.withYear(125);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime29", (dateTime1.compareTo(dateTime29) == 0) == dateTime1.equals(dateTime29));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Instant instant7 = instant3.withDurationAdded(1645514184041L, (int) '4');
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Days days9 = org.joda.time.Days.daysIn(readableInterval8);
        org.joda.time.Duration duration10 = days9.toStandardDuration();
        org.joda.time.Duration duration11 = duration10.toDuration();
        org.joda.time.ReadableDuration readableDuration12 = null;
        boolean boolean13 = duration11.isLongerThan(readableDuration12);
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.Days days15 = org.joda.time.Days.daysIn(readableInterval14);
        org.joda.time.Duration duration16 = days15.toStandardDuration();
        org.joda.time.Duration duration17 = duration16.toDuration();
        org.joda.time.ReadableDuration readableDuration18 = null;
        boolean boolean19 = duration17.isLongerThan(readableDuration18);
        boolean boolean20 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMillis((int) ' ');
        int int25 = dateTime22.getEra();
        org.joda.time.DateTime dateTime27 = dateTime22.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime29 = dateTime22.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval30 = duration11.toIntervalTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = dateTime22.withChronology(chronology31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime.Property property34 = dateTime22.property(dateTimeFieldType33);
        org.joda.time.DateTime dateTime36 = dateTime22.withYearOfEra((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime41 = dateTime38.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property42 = dateTime41.minuteOfHour();
        org.joda.time.Duration duration44 = org.joda.time.Duration.parse("PT2147483647S");
        long long45 = duration44.getStandardHours();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(dateTimeZone46);
        org.joda.time.DateTime dateTime49 = dateTime47.minusMillis((int) ' ');
        int int50 = dateTime47.getEra();
        org.joda.time.DateTime.Property property51 = dateTime47.secondOfMinute();
        org.joda.time.Period period52 = duration44.toPeriodTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.hours();
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime41, (org.joda.time.ReadableDuration) duration44, periodType53);
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableDuration) duration44);
        boolean boolean56 = instant7.isBefore((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeZone dateTimeZone57 = dateTime22.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime4", (instant0.compareTo(mutableDateTime4) == 0) == instant0.equals(mutableDateTime4));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.Instant instant5 = instant0.minus((long) 'u');
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.Instant instant8 = instant5.minus(0L);
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Days days10 = org.joda.time.Days.daysIn(readableInterval9);
        org.joda.time.Duration duration11 = days10.toStandardDuration();
        long long12 = duration11.getStandardHours();
        java.lang.String str13 = duration11.toString();
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.Days days15 = org.joda.time.Days.daysIn(readableInterval14);
        org.joda.time.Duration duration16 = days15.toStandardDuration();
        org.joda.time.Duration duration17 = duration16.toDuration();
        org.joda.time.ReadableDuration readableDuration18 = null;
        boolean boolean19 = duration17.isLongerThan(readableDuration18);
        org.joda.time.Duration duration20 = duration17.toDuration();
        org.joda.time.Period period21 = duration17.toPeriod();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.plusYears((int) '4');
        org.joda.time.DateTime.Property property26 = dateTime23.dayOfWeek();
        org.joda.time.DateTime dateTime29 = dateTime23.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property30 = dateTime23.secondOfMinute();
        org.joda.time.Chronology chronology31 = dateTime23.getChronology();
        org.joda.time.DateTime dateTime33 = dateTime23.minusYears(0);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime33.toMutableDateTime();
        org.joda.time.Chronology chronology35 = dateTime33.getChronology();
        org.joda.time.DateTime dateTime37 = dateTime33.plusDays(9);
        org.joda.time.Interval interval38 = duration17.toIntervalFrom((org.joda.time.ReadableInstant) dateTime33);
        long long39 = duration17.getStandardSeconds();
        boolean boolean40 = duration11.isLongerThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime46.minusMillis((int) ' ');
        int int49 = dateTime46.getEra();
        int int50 = dateTime44.compareTo((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.minusMillis((int) ' ');
        org.joda.time.Duration duration55 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(dateTimeZone56);
        org.joda.time.DateTime.Property property58 = dateTime57.dayOfMonth();
        org.joda.time.DateTime dateTime59 = property58.roundFloorCopy();
        org.joda.time.DateTime.Property property60 = dateTime59.millisOfDay();
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.yearDay();
        org.joda.time.DurationFieldType durationFieldType62 = org.joda.time.DurationFieldType.halfdays();
        int int63 = periodType61.indexOf(durationFieldType62);
        org.joda.time.PeriodType periodType64 = periodType61.withWeeksRemoved();
        int int65 = periodType64.size();
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration55, (org.joda.time.ReadableInstant) dateTime59, periodType64);
        org.joda.time.PeriodType periodType67 = org.joda.time.PeriodType.weeks();
        org.joda.time.Period period68 = period66.normalizedStandard(periodType67);
        org.joda.time.Weeks weeks69 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period68);
        int int70 = weeks69.getWeeks();
        org.joda.time.PeriodType periodType71 = weeks69.getPeriodType();
        org.joda.time.Period period72 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant5, (org.joda.time.ReadableDuration) duration11, periodType71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime23", (instant0.compareTo(dateTime23) == 0) == instant0.equals(dateTime23));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isEqual(10L);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Instant instant7 = instant3.withDurationAdded(1645514184041L, (int) '4');
        org.joda.time.Instant instant10 = instant7.withDurationAdded((long) (-1), 12);
        org.joda.time.Instant instant12 = instant10.minus(31525804800000L);
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.MAX_VALUE;
        org.joda.time.MutablePeriod mutablePeriod15 = seconds14.toMutablePeriod();
        mutablePeriod15.setMonths((int) (short) 100);
        int int18 = mutablePeriod15.getYears();
        int int19 = mutablePeriod15.getYears();
        mutablePeriod15.addDays((int) (short) 1);
        mutablePeriod15.setDays(55);
        org.joda.time.Period period26 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod27 = period26.toMutablePeriod();
        org.joda.time.Period period30 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod31 = period30.toMutablePeriod();
        org.joda.time.Period period33 = period30.plusMinutes((int) (byte) 0);
        mutablePeriod27.mergePeriod((org.joda.time.ReadablePeriod) period30);
        mutablePeriod27.addMonths((int) 'u');
        mutablePeriod27.addHours((int) (byte) -1);
        org.joda.time.Period period41 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod42 = period41.toMutablePeriod();
        org.joda.time.Period period44 = period41.plusMinutes((int) (byte) 0);
        org.joda.time.Period period46 = period44.plusMonths((int) '4');
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType49 = dateTimeFieldType48.getDurationType();
        boolean boolean50 = periodType47.isSupported(durationFieldType49);
        boolean boolean51 = period44.isSupported(durationFieldType49);
        int int52 = mutablePeriod27.indexOf(durationFieldType49);
        int int53 = mutablePeriod15.get(durationFieldType49);
        org.joda.time.DurationFieldType durationFieldType54 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime56.plusYears((int) '4');
        org.joda.time.DateTime.Property property59 = dateTime56.dayOfWeek();
        org.joda.time.DateTime dateTime62 = dateTime56.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property63 = dateTime56.secondOfMinute();
        org.joda.time.Chronology chronology64 = dateTime56.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.dayOfMonth();
        org.joda.time.DurationField durationField66 = durationFieldType54.getField(chronology64);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period((long) 100, chronology68);
        int int70 = period69.getMillis();
        long long73 = chronology64.add((org.joda.time.ReadablePeriod) period69, (long) (short) 100, 40);
        boolean boolean74 = durationFieldType49.isSupported(chronology64);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(0L, chronology64);
        org.joda.time.DateTimeZone dateTimeZone76 = dateTime75.getZone();
        org.joda.time.DateTime dateTime77 = instant12.toDateTime(dateTimeZone76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime4", (instant0.compareTo(mutableDateTime4) == 0) == instant0.equals(mutableDateTime4));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((int) ' ');
        int int8 = dateTime5.getEra();
        int int9 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime11.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime5.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        int int28 = dateTimeZone26.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime29 = dateTime5.withZone(dateTimeZone26);
        org.joda.time.DateTime dateTime30 = dateTime29.withEarlierOffsetAtOverlap();
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.Days days32 = org.joda.time.Days.daysIn(readableInterval31);
        org.joda.time.Duration duration33 = days32.toStandardDuration();
        org.joda.time.Period period36 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod37 = period36.toMutablePeriod();
        org.joda.time.Period period39 = period36.plusSeconds((int) (short) 1);
        org.joda.time.Days days40 = period39.toStandardDays();
        org.joda.time.Days days41 = days32.minus(days40);
        org.joda.time.DurationFieldType durationFieldType42 = days32.getFieldType();
        org.joda.time.Days days44 = days32.dividedBy((-2147483213));
        org.joda.time.Days days46 = days32.plus(26539);
        org.joda.time.DateTime dateTime47 = dateTime29.minus((org.joda.time.ReadablePeriod) days46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime29", (dateTime1.compareTo(dateTime29) == 0) == dateTime1.equals(dateTime29));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 40, 0);
        org.joda.time.Chronology chronology4 = instant0.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = instant0.toMutableDateTime();
        org.joda.time.Instant instant7 = instant0.plus(26197906L);
        org.joda.time.DateTime dateTime8 = instant0.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekyear(26528042);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime5", (instant0.compareTo(mutableDateTime5) == 0) == instant0.equals(mutableDateTime5));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        boolean boolean4 = instant2.isEqual(10L);
        org.joda.time.Instant instant6 = instant2.minus(87350400000L);
        org.joda.time.Duration duration8 = org.joda.time.Duration.parse("PT2147483647S");
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Days days10 = org.joda.time.Days.daysIn(readableInterval9);
        org.joda.time.Duration duration11 = days10.toStandardDuration();
        org.joda.time.Duration duration12 = duration11.toDuration();
        boolean boolean13 = duration8.isLongerThan((org.joda.time.ReadableDuration) duration11);
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.Days days15 = org.joda.time.Days.daysIn(readableInterval14);
        org.joda.time.Duration duration16 = days15.toStandardDuration();
        org.joda.time.Duration duration17 = duration16.toDuration();
        org.joda.time.ReadableDuration readableDuration18 = null;
        boolean boolean19 = duration17.isLongerThan(readableDuration18);
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.Days days21 = org.joda.time.Days.daysIn(readableInterval20);
        org.joda.time.Duration duration22 = days21.toStandardDuration();
        org.joda.time.Duration duration23 = duration22.toDuration();
        org.joda.time.ReadableDuration readableDuration24 = null;
        boolean boolean25 = duration23.isLongerThan(readableDuration24);
        boolean boolean26 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMillis((int) ' ');
        int int31 = dateTime28.getEra();
        org.joda.time.DateTime dateTime33 = dateTime28.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime35 = dateTime28.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval36 = duration17.toIntervalTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Duration duration37 = duration17.toDuration();
        boolean boolean38 = duration11.isLongerThan((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone40);
        java.lang.String str42 = dateTimeZone40.getID();
        long long44 = dateTimeZone40.previousTransition((long) (short) 0);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 1, dateTimeZone40);
        org.joda.time.Interval interval46 = duration11.toIntervalTo((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Instant instant47 = instant2.plus((org.joda.time.ReadableDuration) duration11);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.minusMillis((int) ' ');
        int int55 = dateTime52.getEra();
        org.joda.time.DateTime.Property property56 = dateTime52.secondOfMinute();
        org.joda.time.Interval interval57 = property56.toInterval();
        org.joda.time.Duration duration58 = interval57.toDuration();
        org.joda.time.PeriodType periodType59 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(readableInstant50, (org.joda.time.ReadableDuration) duration58, periodType59);
        org.joda.time.PeriodType periodType61 = periodType59.withWeeksRemoved();
        org.joda.time.Period period62 = new org.joda.time.Period(0L, 1645514185540L, periodType59);
        org.joda.time.PeriodType periodType65 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime67 = org.joda.time.DateTime.now(dateTimeZone66);
        org.joda.time.DateTime.Property property68 = dateTime67.dayOfMonth();
        org.joda.time.DateTime dateTime69 = property68.roundFloorCopy();
        org.joda.time.DateTime.Property property70 = dateTime69.millisOfDay();
        org.joda.time.Chronology chronology71 = dateTime69.getChronology();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) 2147483647, (long) 1814400, periodType65, chronology71);
        org.joda.time.Period period73 = duration11.toPeriod(periodType59, chronology71);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime77 = org.joda.time.DateTime.now(dateTimeZone76);
        org.joda.time.DateTime dateTime79 = dateTime77.plusYears((int) '4');
        org.joda.time.DateTime.Property property80 = dateTime77.dayOfWeek();
        org.joda.time.DateTime dateTime83 = dateTime77.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property84 = dateTime77.secondOfMinute();
        org.joda.time.Chronology chronology85 = dateTime77.getChronology();
        org.joda.time.DateTimeField dateTimeField86 = chronology85.dayOfMonth();
        org.joda.time.Period period87 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology85);
        org.joda.time.DurationField durationField88 = chronology85.months();
        org.joda.time.DurationField durationField89 = chronology85.minutes();
        org.joda.time.DateTimeField dateTimeField90 = chronology85.millisOfSecond();
        org.joda.time.Period period91 = new org.joda.time.Period(26259145L, (long) 26321, periodType59, chronology85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime28", (instant2.compareTo(dateTime28) == 0) == instant2.equals(dateTime28));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 40, 0);
        org.joda.time.Chronology chronology4 = instant0.getChronology();
        org.joda.time.Instant instant6 = instant0.plus((long) (-2148390));
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod10 = period9.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Days days12 = org.joda.time.Days.daysIn(readableInterval11);
        org.joda.time.Duration duration13 = days12.toStandardDuration();
        org.joda.time.Duration duration14 = duration13.toDuration();
        org.joda.time.ReadableDuration readableDuration15 = null;
        boolean boolean16 = duration14.isLongerThan(readableDuration15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.Days days18 = org.joda.time.Days.daysIn(readableInterval17);
        org.joda.time.Duration duration19 = days18.toStandardDuration();
        org.joda.time.Duration duration20 = duration19.toDuration();
        org.joda.time.ReadableDuration readableDuration21 = null;
        boolean boolean22 = duration20.isLongerThan(readableDuration21);
        boolean boolean23 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMillis((int) ' ');
        int int28 = dateTime25.getEra();
        org.joda.time.DateTime dateTime30 = dateTime25.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime32 = dateTime25.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval33 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime25);
        mutablePeriod10.add((org.joda.time.ReadableInterval) interval33);
        mutablePeriod10.addYears((int) ' ');
        mutablePeriod10.setSeconds((int) (byte) 100);
        mutablePeriod10.setDays((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusMillis((int) ' ');
        int int45 = dateTime42.getEra();
        org.joda.time.DateTime.Property property46 = dateTime42.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval47 = null;
        org.joda.time.Days days48 = org.joda.time.Days.daysIn(readableInterval47);
        org.joda.time.Duration duration49 = days48.toStandardDuration();
        org.joda.time.Duration duration50 = duration49.toDuration();
        org.joda.time.DateTime dateTime52 = dateTime42.withDurationAdded((org.joda.time.ReadableDuration) duration50, (-1));
        org.joda.time.Duration duration54 = duration50.plus((-1L));
        long long55 = duration50.getStandardMinutes();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration50);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime59 = org.joda.time.DateTime.now(dateTimeZone58);
        java.lang.String str60 = dateTimeZone58.getID();
        long long62 = dateTimeZone58.previousTransition((long) (short) 0);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) 1, dateTimeZone58);
        org.joda.time.Interval interval64 = duration50.toIntervalFrom((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Instant instant66 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration50, 26230665);
        org.joda.time.Days days67 = org.joda.time.Days.THREE;
        org.joda.time.Duration duration68 = days67.toStandardDuration();
        boolean boolean69 = duration50.isEqual((org.joda.time.ReadableDuration) duration68);
        org.joda.time.Duration duration71 = org.joda.time.Duration.parse("PT2147483647S");
        org.joda.time.Duration duration73 = duration71.minus((-78382080000000L));
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime75 = org.joda.time.DateTime.now(dateTimeZone74);
        org.joda.time.DateTime dateTime77 = dateTime75.minusMillis((int) ' ');
        int int78 = dateTime75.getEra();
        org.joda.time.DateTime.Property property79 = dateTime75.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval80 = null;
        org.joda.time.Days days81 = org.joda.time.Days.daysIn(readableInterval80);
        org.joda.time.Duration duration82 = days81.toStandardDuration();
        org.joda.time.Duration duration83 = duration82.toDuration();
        org.joda.time.DateTime dateTime85 = dateTime75.withDurationAdded((org.joda.time.ReadableDuration) duration83, (-1));
        org.joda.time.Duration duration87 = duration83.plus((-1L));
        long long88 = duration83.getStandardMinutes();
        org.joda.time.Duration duration90 = duration73.withDurationAdded((org.joda.time.ReadableDuration) duration83, 55);
        boolean boolean91 = duration50.isShorterThan((org.joda.time.ReadableDuration) duration90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime25", (instant0.compareTo(dateTime25) == 0) == instant0.equals(dateTime25));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.MAX_VALUE;
        java.lang.String str3 = seconds2.toString();
        java.lang.String str4 = seconds2.toString();
        int int5 = seconds2.getSeconds();
        org.joda.time.Duration duration6 = seconds2.toStandardDuration();
        org.joda.time.Instant instant7 = instant0.plus((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Instant instant8 = instant0.toInstant();
        long long9 = instant0.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant0", (mutableDateTime1.compareTo(instant0) == 0) == mutableDateTime1.equals(instant0));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime();
        int int10 = dateTime9.getWeekyear();
        org.joda.time.DateTime dateTime12 = dateTime9.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes((int) (short) 1);
        org.joda.time.DateTime.Property property15 = dateTime12.secondOfDay();
        int int16 = property15.getMaximumValue();
        org.joda.time.DateTime dateTime17 = property15.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime23 = dateTime19.minusMinutes((int) '#');
        java.lang.String str24 = dateTime23.toString();
        org.joda.time.Instant instant25 = dateTime23.toInstant();
        org.joda.time.Chronology chronology26 = instant25.getChronology();
        int int27 = property15.compareTo((org.joda.time.ReadableInstant) instant25);
        org.joda.time.DateTime dateTime28 = instant25.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = dateTime30.withZone(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.minusMillis((int) ' ');
        int int38 = dateTime35.getEra();
        boolean boolean39 = dateTime33.isEqual((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.Days days41 = org.joda.time.Days.daysIn(readableInterval40);
        org.joda.time.Duration duration42 = days41.toStandardDuration();
        org.joda.time.Duration duration43 = duration42.toDuration();
        org.joda.time.ReadableDuration readableDuration44 = null;
        boolean boolean45 = duration43.isLongerThan(readableDuration44);
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.Days days47 = org.joda.time.Days.daysIn(readableInterval46);
        org.joda.time.Duration duration48 = days47.toStandardDuration();
        long long49 = duration48.getStandardHours();
        java.lang.String str50 = duration48.toString();
        boolean boolean51 = duration43.isEqual((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Duration duration53 = duration48.plus(0L);
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableDuration) duration48);
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardDays(99999L);
        org.joda.time.ReadableDuration readableDuration57 = null;
        boolean boolean58 = duration56.isShorterThan(readableDuration57);
        boolean boolean60 = duration56.equals((java.lang.Object) (-7));
        boolean boolean61 = duration48.isShorterThan((org.joda.time.ReadableDuration) duration56);
        org.joda.time.Instant instant62 = instant25.plus((org.joda.time.ReadableDuration) duration48);
        long long63 = duration48.getStandardDays();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(1645512059742L);
        org.joda.time.Chronology chronology66 = dateTime65.getChronology();
        org.joda.time.DateTime.Property property67 = dateTime65.millisOfSecond();
        org.joda.time.DateTime dateTime68 = property67.roundCeilingCopy();
        org.joda.time.DateTime dateTime69 = property67.withMaximumValue();
        org.joda.time.Duration duration71 = org.joda.time.Duration.parse("PT2147483647S");
        org.joda.time.Duration duration73 = duration71.minus((-78382080000000L));
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime75 = org.joda.time.DateTime.now(dateTimeZone74);
        org.joda.time.DateTime dateTime77 = dateTime75.minusMillis((int) ' ');
        int int78 = dateTime75.getEra();
        org.joda.time.DateTime.Property property79 = dateTime75.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval80 = null;
        org.joda.time.Days days81 = org.joda.time.Days.daysIn(readableInterval80);
        org.joda.time.Duration duration82 = days81.toStandardDuration();
        org.joda.time.Duration duration83 = duration82.toDuration();
        org.joda.time.DateTime dateTime85 = dateTime75.withDurationAdded((org.joda.time.ReadableDuration) duration83, (-1));
        org.joda.time.Duration duration87 = duration83.plus((-1L));
        long long88 = duration83.getStandardMinutes();
        org.joda.time.Duration duration90 = duration73.withDurationAdded((org.joda.time.ReadableDuration) duration83, 55);
        org.joda.time.Duration duration93 = duration90.withDurationAdded((-1022L), 37);
        org.joda.time.DateTime dateTime95 = dateTime69.withDurationAdded((org.joda.time.ReadableDuration) duration90, 739);
        org.joda.time.MutablePeriod mutablePeriod96 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration48, (org.joda.time.ReadableInstant) dateTime95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant25", (dateTime23.compareTo(instant25) == 0) == dateTime23.equals(instant25));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime();
        int int10 = dateTime9.getWeekyear();
        org.joda.time.DateTime dateTime12 = dateTime9.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes((int) (short) 100);
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfYear();
        org.joda.time.DateTime dateTime16 = property15.roundHalfCeilingCopy();
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfYear();
        int int18 = dateTime16.getSecondOfDay();
        org.joda.time.LocalDate localDate19 = dateTime16.toLocalDate();
        org.joda.time.Instant instant20 = dateTime16.toInstant();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.plusYears((int) '4');
        org.joda.time.DateTime.Property property29 = dateTime26.dayOfWeek();
        org.joda.time.DateTime dateTime32 = dateTime26.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property33 = dateTime26.secondOfMinute();
        org.joda.time.Chronology chronology34 = dateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.dayOfMonth();
        org.joda.time.Period period36 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology34);
        org.joda.time.DurationField durationField37 = chronology34.months();
        org.joda.time.Period period38 = new org.joda.time.Period(596523L, 2022L, chronology34);
        java.lang.String str39 = chronology34.toString();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTime dateTime41 = dateTime16.toDateTime(chronology34);
        org.joda.time.DateTime dateTime43 = dateTime41.minusHours(238);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and instant20", (dateTime41.compareTo(instant20) == 0) == dateTime41.equals(instant20));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        int int4 = dateTime1.getEra();
        org.joda.time.DateTime.Property property5 = dateTime1.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Days days7 = org.joda.time.Days.daysIn(readableInterval6);
        org.joda.time.Duration duration8 = days7.toStandardDuration();
        org.joda.time.Duration duration9 = duration8.toDuration();
        org.joda.time.DateTime dateTime11 = dateTime1.withDurationAdded((org.joda.time.ReadableDuration) duration9, (-1));
        org.joda.time.Duration duration13 = duration9.plus((-1L));
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardHours((long) (short) 0);
        int int16 = duration9.compareTo((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Instant instant17 = new org.joda.time.Instant();
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.Days days19 = org.joda.time.Days.daysIn(readableInterval18);
        org.joda.time.Duration duration20 = days19.toStandardDuration();
        org.joda.time.Duration duration21 = duration20.toDuration();
        org.joda.time.ReadableDuration readableDuration22 = null;
        boolean boolean23 = duration21.isLongerThan(readableDuration22);
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.Days days25 = org.joda.time.Days.daysIn(readableInterval24);
        org.joda.time.Duration duration26 = days25.toStandardDuration();
        org.joda.time.Duration duration27 = duration26.toDuration();
        org.joda.time.ReadableDuration readableDuration28 = null;
        boolean boolean29 = duration27.isLongerThan(readableDuration28);
        boolean boolean30 = duration21.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMillis((int) ' ');
        int int35 = dateTime32.getEra();
        org.joda.time.DateTime dateTime37 = dateTime32.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime39 = dateTime32.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval40 = duration21.toIntervalTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Period period41 = duration21.toPeriod();
        long long42 = duration21.getStandardSeconds();
        org.joda.time.Instant instant44 = instant17.withDurationAdded((org.joda.time.ReadableDuration) duration21, 2022);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.minusMillis((int) ' ');
        int int57 = dateTime54.getEra();
        int int58 = dateTime52.compareTo((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime60.minusMillis((int) ' ');
        org.joda.time.Duration duration63 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime65 = org.joda.time.DateTime.now(dateTimeZone64);
        org.joda.time.DateTime.Property property66 = dateTime65.dayOfMonth();
        org.joda.time.DateTime dateTime67 = property66.roundFloorCopy();
        org.joda.time.DateTime.Property property68 = dateTime67.millisOfDay();
        org.joda.time.PeriodType periodType69 = org.joda.time.PeriodType.yearDay();
        org.joda.time.DurationFieldType durationFieldType70 = org.joda.time.DurationFieldType.halfdays();
        int int71 = periodType69.indexOf(durationFieldType70);
        org.joda.time.PeriodType periodType72 = periodType69.withWeeksRemoved();
        int int73 = periodType72.size();
        org.joda.time.Period period74 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration63, (org.joda.time.ReadableInstant) dateTime67, periodType72);
        org.joda.time.Period period75 = new org.joda.time.Period(978566400000L, (long) 9, periodType72);
        org.joda.time.DurationFieldType durationFieldType76 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime78 = org.joda.time.DateTime.now(dateTimeZone77);
        org.joda.time.DateTime dateTime80 = dateTime78.plusYears((int) '4');
        org.joda.time.DateTime.Property property81 = dateTime78.dayOfWeek();
        org.joda.time.DateTime dateTime84 = dateTime78.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property85 = dateTime78.secondOfMinute();
        org.joda.time.Chronology chronology86 = dateTime78.getChronology();
        org.joda.time.DateTimeField dateTimeField87 = chronology86.dayOfMonth();
        org.joda.time.DurationField durationField88 = durationFieldType76.getField(chronology86);
        org.joda.time.DateTimeField dateTimeField89 = chronology86.weekOfWeekyear();
        org.joda.time.Period period90 = new org.joda.time.Period((long) 2, (long) 570, periodType72, chronology86);
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, (org.joda.time.ReadableInstant) instant44, periodType72);
        org.joda.time.ReadableDuration readableDuration92 = null;
        org.joda.time.Duration duration93 = duration15.plus(readableDuration92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant17", (dateTime1.compareTo(instant17) == 0) == dateTime1.equals(instant17));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusYears((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime8 = dateTime2.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property9 = dateTime2.minuteOfHour();
        org.joda.time.DateTime dateTime10 = dateTime2.toDateTime();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(readableDuration0, (org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime dateTime14 = dateTime2.withDurationAdded((long) (byte) 10, (int) 'a');
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.Days days16 = org.joda.time.Days.daysIn(readableInterval15);
        org.joda.time.Duration duration17 = days16.toStandardDuration();
        org.joda.time.Duration duration18 = duration17.toDuration();
        org.joda.time.ReadableDuration readableDuration19 = null;
        boolean boolean20 = duration18.isLongerThan(readableDuration19);
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.Days days22 = org.joda.time.Days.daysIn(readableInterval21);
        org.joda.time.Duration duration23 = days22.toStandardDuration();
        org.joda.time.Duration duration24 = duration23.toDuration();
        org.joda.time.ReadableDuration readableDuration25 = null;
        boolean boolean26 = duration24.isLongerThan(readableDuration25);
        boolean boolean27 = duration18.isShorterThan((org.joda.time.ReadableDuration) duration24);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration18, periodType28);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(1645512059742L);
        org.joda.time.Chronology chronology32 = dateTime31.getChronology();
        org.joda.time.DateTime.Property property33 = dateTime31.millisOfSecond();
        org.joda.time.DateTime dateTime34 = property33.roundCeilingCopy();
        org.joda.time.DateTime dateTime36 = dateTime34.plusWeeks(26259);
        org.joda.time.DateTime dateTime38 = dateTime36.minusWeeks(24106);
        org.joda.time.Instant instant39 = new org.joda.time.Instant();
        org.joda.time.Instant instant42 = instant39.withDurationAdded((long) 40, 0);
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) instant39);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(dateTimeZone46);
        org.joda.time.DateTime dateTime48 = dateTime45.withZone(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.minusMillis((int) ' ');
        int int53 = dateTime50.getEra();
        boolean boolean54 = dateTime48.isEqual((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.ReadableInterval readableInterval55 = null;
        org.joda.time.Days days56 = org.joda.time.Days.daysIn(readableInterval55);
        org.joda.time.Duration duration57 = days56.toStandardDuration();
        org.joda.time.Duration duration58 = duration57.toDuration();
        org.joda.time.ReadableDuration readableDuration59 = null;
        boolean boolean60 = duration58.isLongerThan(readableDuration59);
        org.joda.time.ReadableInterval readableInterval61 = null;
        org.joda.time.Days days62 = org.joda.time.Days.daysIn(readableInterval61);
        org.joda.time.Duration duration63 = days62.toStandardDuration();
        long long64 = duration63.getStandardHours();
        java.lang.String str65 = duration63.toString();
        boolean boolean66 = duration58.isEqual((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Duration duration68 = duration63.plus(0L);
        org.joda.time.Period period69 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime48, (org.joda.time.ReadableDuration) duration63);
        org.joda.time.Instant instant70 = instant39.plus((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Interval interval71 = duration18.toIntervalFrom((org.joda.time.ReadableInstant) instant39);
        boolean boolean73 = instant39.isBefore(1645513222419L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant39", (dateTime2.compareTo(instant39) == 0) == dateTime2.equals(instant39));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        int int4 = dateTime1.getEra();
        org.joda.time.DateTime.Property property5 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds9 = seconds7.multipliedBy(1);
        boolean boolean10 = property5.equals((java.lang.Object) seconds7);
        org.joda.time.Seconds seconds12 = seconds7.plus(435);
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds15 = seconds13.plus((int) (short) 10);
        org.joda.time.Seconds seconds17 = seconds15.minus(2022);
        org.joda.time.Seconds seconds18 = seconds7.plus(seconds15);
        org.joda.time.MutablePeriod mutablePeriod19 = seconds15.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMillis((int) ' ');
        int int28 = dateTime25.getEra();
        int int29 = dateTime23.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.plusYears((int) '4');
        org.joda.time.DateTime.Property property34 = dateTime31.dayOfWeek();
        org.joda.time.DateTime dateTime37 = dateTime31.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property38 = dateTime31.minuteOfHour();
        org.joda.time.DateTime dateTime40 = dateTime31.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime40.getZone();
        long long44 = dateTimeZone41.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime25.toMutableDateTime(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        int int48 = dateTimeZone46.getStandardOffset(1645514150954L);
        org.joda.time.DateTime dateTime49 = dateTime25.withZone(dateTimeZone46);
        org.joda.time.DateTime dateTime50 = dateTime49.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.minusMillis((int) ' ');
        int int55 = dateTime52.getEra();
        org.joda.time.DateTime.Property property56 = dateTime52.secondOfMinute();
        org.joda.time.DateTime dateTime57 = property56.roundHalfFloorCopy();
        int int58 = dateTime57.getYearOfEra();
        org.joda.time.Seconds seconds59 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableInstant) dateTime57);
        boolean boolean60 = seconds15.isGreaterThan(seconds59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime49", (dateTime1.compareTo(dateTime49) == 0) == dateTime1.equals(dateTime49));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.MAX_VALUE;
        org.joda.time.MutablePeriod mutablePeriod1 = seconds0.toMutablePeriod();
        mutablePeriod1.setMonths((int) (short) 100);
        int int4 = mutablePeriod1.getYears();
        int int5 = mutablePeriod1.getYears();
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod1.copy();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(0, 28, 41, 43, (int) (short) 100, 216, (int) (byte) -1, 26222);
        org.joda.time.Instant instant16 = new org.joda.time.Instant();
        boolean boolean17 = instant16.isAfterNow();
        org.joda.time.Instant instant19 = instant16.withMillis((long) (short) 0);
        org.joda.time.DateTime dateTime20 = instant19.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusYears((int) '4');
        org.joda.time.DateTime.Property property25 = dateTime22.dayOfWeek();
        org.joda.time.DateTime dateTime28 = dateTime22.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property29 = dateTime22.minuteOfHour();
        org.joda.time.DateTime dateTime30 = dateTime22.toDateTime();
        java.lang.String str31 = dateTime30.toString();
        mutablePeriod15.setPeriod((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTime.Property property35 = dateTime34.dayOfMonth();
        org.joda.time.DateTime dateTime36 = property35.roundFloorCopy();
        org.joda.time.DateTime.Property property37 = dateTime36.millisOfDay();
        org.joda.time.Interval interval38 = property37.toInterval();
        long long39 = interval38.toDurationMillis();
        mutablePeriod15.setPeriod((org.joda.time.ReadableInterval) interval38);
        mutablePeriod1.add((org.joda.time.ReadableInterval) interval38);
        org.joda.time.MutableInterval mutableInterval42 = interval38.toMutableInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime22", (instant16.compareTo(dateTime22) == 0) == instant16.equals(dateTime22));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusYears((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime8 = dateTime2.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property9 = dateTime2.minuteOfDay();
        org.joda.time.DateTime dateTime11 = property9.addToCopy(7);
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = dateTime15.withZone(dateTimeZone16);
        java.util.GregorianCalendar gregorianCalendar19 = dateTime18.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        java.lang.String str22 = dateTimeZone20.getID();
        org.joda.time.DateTime dateTime23 = dateTime18.toDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = dateTime23.toDateTimeISO();
        int int25 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(1645518594899L, dateTimeZone13);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        boolean boolean29 = instant27.isEqual(10L);
        org.joda.time.Instant instant30 = instant27.toInstant();
        org.joda.time.ReadableInstant readableInstant31 = null;
        boolean boolean32 = instant27.isBefore(readableInstant31);
        org.joda.time.Instant instant34 = instant27.plus(1645518594899L);
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardMinutes((long) 22);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant34, (org.joda.time.ReadableDuration) duration36, periodType37);
        org.joda.time.Seconds seconds39 = duration36.toStandardSeconds();
        org.joda.time.DateTime dateTime40 = dateTime26.plus((org.joda.time.ReadableDuration) duration36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant27", (dateTime2.compareTo(instant27) == 0) == dateTime2.equals(instant27));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime5 = dateTime1.minusMinutes((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusYears((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime7.dayOfWeek();
        org.joda.time.DateTime dateTime13 = dateTime7.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property14 = dateTime7.minuteOfHour();
        org.joda.time.DateTime dateTime16 = dateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime16.getZone();
        long long20 = dateTimeZone17.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMillis((int) ' ');
        int int25 = dateTime22.getEra();
        org.joda.time.DateTime dateTime27 = dateTime22.minusMinutes((int) (short) 1);
        int int28 = dateTimeZone17.getOffset((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime.Property property29 = dateTime22.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DateTime dateTime32 = dateTime22.withFieldAdded(durationFieldType30, 955);
        boolean boolean33 = dateTime22.isBeforeNow();
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.yearDay();
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.halfdays();
        int int36 = periodType34.indexOf(durationFieldType35);
        org.joda.time.PeriodType periodType37 = periodType34.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime22, periodType37);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.minusMillis((int) ' ');
        int int43 = dateTime40.getEra();
        org.joda.time.DateTime.Property property44 = dateTime40.secondOfMinute();
        java.util.Locale locale45 = java.util.Locale.ITALY;
        java.util.Locale locale46 = null;
        java.lang.String str47 = locale45.getDisplayVariant(locale46);
        java.lang.String str48 = property44.getAsText(locale45);
        org.joda.time.DurationField durationField49 = property44.getDurationField();
        long long50 = property44.remainder();
        org.joda.time.DateTime dateTime51 = property44.withMinimumValue();
        org.joda.time.Interval interval52 = property44.toInterval();
        mutablePeriod38.setPeriod((org.joda.time.ReadableInterval) interval52);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(1645512059742L);
        org.joda.time.Chronology chronology56 = dateTime55.getChronology();
        org.joda.time.DateTime.Property property57 = dateTime55.millisOfSecond();
        org.joda.time.DurationField durationField58 = property57.getRangeDurationField();
        org.joda.time.Interval interval59 = property57.toInterval();
        org.joda.time.DateTime dateTime60 = interval59.getEnd();
        org.joda.time.Instant instant61 = new org.joda.time.Instant();
        boolean boolean63 = instant61.isEqual(10L);
        org.joda.time.Instant instant64 = instant61.toInstant();
        boolean boolean65 = interval59.isBefore((org.joda.time.ReadableInstant) instant61);
        org.joda.time.MutableInterval mutableInterval66 = interval59.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval67 = interval59.toMutableInterval();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime71 = org.joda.time.DateTime.now(dateTimeZone70);
        org.joda.time.DateTime dateTime73 = dateTime71.minusMillis((int) ' ');
        int int74 = dateTime71.getEra();
        org.joda.time.DateTime.Property property75 = dateTime71.secondOfMinute();
        org.joda.time.DateTime dateTime76 = property75.roundHalfFloorCopy();
        org.joda.time.Seconds seconds77 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds79 = seconds77.multipliedBy(1);
        boolean boolean80 = property75.equals((java.lang.Object) seconds77);
        org.joda.time.DurationFieldType durationFieldType81 = seconds77.getFieldType();
        org.joda.time.PeriodType periodType82 = seconds77.getPeriodType();
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period(26177577L, 1645488060000L, periodType82, chronology83);
        org.joda.time.PeriodType periodType85 = periodType82.withMinutesRemoved();
        org.joda.time.Period period86 = interval59.toPeriod(periodType85);
        org.joda.time.Period period87 = interval52.toPeriod(periodType85);
        org.joda.time.PeriodType periodType88 = periodType85.withMinutesRemoved();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant61 and dateTime71", (instant61.compareTo(dateTime71) == 0) == instant61.equals(dateTime71));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        int int4 = dateTime1.getEra();
        org.joda.time.DateTime dateTime6 = dateTime1.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime8 = dateTime1.withYearOfCentury((int) (short) 1);
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int11 = dateTime8.get(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = dateTime8.plusYears((int) 'u');
        org.joda.time.Instant instant14 = dateTime8.toInstant();
        org.joda.time.Instant instant16 = instant14.withMillis(26160L);
        org.joda.time.Instant instant17 = new org.joda.time.Instant();
        org.joda.time.Instant instant20 = instant17.withDurationAdded((long) 40, 0);
        org.joda.time.Chronology chronology21 = instant17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = instant17.toMutableDateTime();
        org.joda.time.Instant instant24 = instant17.plus(26197906L);
        org.joda.time.Minutes minutes25 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes27 = minutes25.minus(2147483647);
        org.joda.time.Duration duration28 = minutes27.toStandardDuration();
        org.joda.time.Duration duration31 = duration28.withDurationAdded(0L, 384);
        org.joda.time.Instant instant32 = instant17.minus((org.joda.time.ReadableDuration) duration31);
        org.joda.time.Duration duration33 = duration31.toDuration();
        org.joda.time.Instant instant34 = instant16.minus((org.joda.time.ReadableDuration) duration33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant14", (dateTime8.compareTo(instant14) == 0) == dateTime8.equals(instant14));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime1.withZone(dateTimeZone2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus(4320000001L);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) instant12);
        int int14 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) instant12);
        org.joda.time.MutableDateTime mutableDateTime15 = instant12.toMutableDateTime();
        long long16 = instant12.getMillis();
        org.joda.time.MutableDateTime mutableDateTime17 = instant12.toMutableDateTime();
        org.joda.time.Instant instant20 = instant12.withDurationAdded(26197906L, 26350878);
        org.joda.time.Instant instant22 = instant20.minus(1647088953278L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant12", (dateTime1.compareTo(instant12) == 0) == dateTime1.equals(instant12));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period9 = period6.plusMinutes((int) (byte) 0);
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) period6);
        mutablePeriod3.addMonths((int) 'u');
        int int13 = mutablePeriod3.getWeeks();
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.Days days15 = org.joda.time.Days.daysIn(readableInterval14);
        org.joda.time.Duration duration16 = days15.toStandardDuration();
        org.joda.time.Duration duration17 = duration16.toDuration();
        org.joda.time.ReadableDuration readableDuration18 = null;
        boolean boolean19 = duration17.isLongerThan(readableDuration18);
        org.joda.time.Duration duration20 = duration17.toDuration();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Interval interval22 = duration17.toIntervalTo(readableInstant21);
        java.lang.String str23 = interval22.toString();
        mutablePeriod3.add((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Duration duration25 = interval22.toDuration();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(0, 28, 41, 43, (int) (short) 100, 216, (int) (byte) -1, 26222);
        org.joda.time.Instant instant35 = new org.joda.time.Instant();
        boolean boolean36 = instant35.isAfterNow();
        org.joda.time.Instant instant38 = instant35.withMillis((long) (short) 0);
        org.joda.time.DateTime dateTime39 = instant38.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.plusYears((int) '4');
        org.joda.time.DateTime.Property property44 = dateTime41.dayOfWeek();
        org.joda.time.DateTime dateTime47 = dateTime41.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property48 = dateTime41.minuteOfHour();
        org.joda.time.DateTime dateTime49 = dateTime41.toDateTime();
        java.lang.String str50 = dateTime49.toString();
        mutablePeriod34.setPeriod((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableInstant) dateTime49);
        int int52 = dateTime49.getWeekOfWeekyear();
        org.joda.time.Period period53 = duration25.toPeriodTo((org.joda.time.ReadableInstant) dateTime49);
        int int54 = period53.getMonths();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant35 and dateTime41", (instant35.compareTo(dateTime41) == 0) == instant35.equals(dateTime41));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.minuteOfHour();
        org.joda.time.Instant instant9 = dateTime1.toInstant();
        org.joda.time.DateTime dateTime10 = instant9.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) '4');
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfWeek();
        org.joda.time.DateTime dateTime18 = dateTime12.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property19 = dateTime12.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime12.toDateTime();
        java.lang.String str21 = dateTime20.toString();
        org.joda.time.DateMidnight dateMidnight22 = dateTime20.toDateMidnight();
        boolean boolean24 = dateTime20.isAfter((long) 24);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.plusYears((int) '4');
        org.joda.time.DateTime.Property property29 = dateTime26.dayOfWeek();
        org.joda.time.DateTime dateTime32 = dateTime26.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property33 = dateTime26.minuteOfHour();
        org.joda.time.DateTime dateTime35 = dateTime26.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime35.getZone();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.DateTime.Property property40 = dateTime39.dayOfMonth();
        org.joda.time.DateTime dateTime41 = property40.roundFloorCopy();
        org.joda.time.DateTime.Property property42 = dateTime41.millisOfDay();
        org.joda.time.Chronology chronology43 = dateTime41.getChronology();
        org.joda.time.Seconds seconds44 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime46 = dateTime37.minusDays(59);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime48 = org.joda.time.DateTime.now(dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone49);
        org.joda.time.DateTime dateTime51 = dateTime48.withZone(dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime53.plusYears((int) '4');
        org.joda.time.DateTime.Property property56 = dateTime53.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now(dateTimeZone57);
        int int59 = property56.compareTo((org.joda.time.ReadableInstant) dateTime58);
        java.util.Locale locale60 = java.util.Locale.FRANCE;
        java.lang.String str61 = property56.getAsText(locale60);
        java.util.Calendar calendar62 = dateTime48.toCalendar(locale60);
        org.joda.time.DateTime dateTime64 = dateTime48.withEra((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime66 = org.joda.time.DateTime.now(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime66.plusYears((int) '4');
        org.joda.time.DateTime.Property property69 = dateTime66.dayOfWeek();
        org.joda.time.DateTime dateTime72 = dateTime66.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property73 = dateTime66.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime75 = org.joda.time.DateTime.now(dateTimeZone74);
        org.joda.time.DateTime dateTime77 = dateTime75.plusYears((int) '4');
        org.joda.time.DateTime dateTime78 = dateTime77.withTimeAtStartOfDay();
        org.joda.time.Seconds seconds79 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime66, (org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean81 = dateTime77.isSupported(dateTimeFieldType80);
        int int82 = dateTime48.get(dateTimeFieldType80);
        int int83 = dateTime46.get(dateTimeFieldType80);
        int int84 = dateTime20.get(dateTimeFieldType80);
        int int85 = dateTime10.get(dateTimeFieldType80);
        org.joda.time.DurationFieldType durationFieldType86 = dateTimeFieldType80.getDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant9", (dateTime1.compareTo(instant9) == 0) == dateTime1.equals(instant9));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.daysIn(readableInterval2);
        org.joda.time.Duration duration4 = days3.toStandardDuration();
        org.joda.time.Duration duration5 = duration4.toDuration();
        org.joda.time.ReadableDuration readableDuration6 = null;
        boolean boolean7 = duration5.isLongerThan(readableDuration6);
        long long8 = duration5.getStandardSeconds();
        org.joda.time.Duration duration9 = org.joda.time.Duration.ZERO;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMillis((int) ' ');
        int int14 = dateTime11.getEra();
        org.joda.time.DateTime.Property property15 = dateTime11.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.Days days17 = org.joda.time.Days.daysIn(readableInterval16);
        org.joda.time.Duration duration18 = days17.toStandardDuration();
        org.joda.time.Duration duration19 = duration18.toDuration();
        org.joda.time.DateTime dateTime21 = dateTime11.withDurationAdded((org.joda.time.ReadableDuration) duration19, (-1));
        org.joda.time.Duration duration23 = duration19.plus((-1L));
        long long24 = duration19.getStandardMinutes();
        boolean boolean25 = duration9.isShorterThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Duration duration27 = duration5.withDurationAdded((org.joda.time.ReadableDuration) duration19, (int) 'a');
        org.joda.time.Instant instant29 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration27, 26378);
        org.joda.time.Chronology chronology30 = instant0.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant0", (mutableDateTime1.compareTo(instant0) == 0) == mutableDateTime1.equals(instant0));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField11 = chronology9.weeks();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology9.getZone();
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.TWO;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks16 = weeks14.plus(0);
        org.joda.time.Weeks weeks18 = weeks16.minus(3);
        org.joda.time.Weeks weeks19 = weeks13.plus(weeks18);
        int[] intArray21 = chronology9.get((org.joda.time.ReadablePeriod) weeks19, (long) (byte) 100);
        org.joda.time.DateTimeField dateTimeField22 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField23 = chronology9.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = chronology9.add(readablePeriod24, 1645514185540L, 26187);
        org.joda.time.DurationField durationField28 = chronology9.eras();
        org.joda.time.DurationField durationField29 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField29", Math.signum(durationField11.compareTo(durationField29)) == -Math.signum(durationField29.compareTo(durationField11)));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.Duration duration2 = days1.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.Days days4 = org.joda.time.Days.daysIn(readableInterval3);
        org.joda.time.Duration duration5 = days4.toStandardDuration();
        org.joda.time.Duration duration6 = duration5.toDuration();
        org.joda.time.ReadableDuration readableDuration7 = null;
        boolean boolean8 = duration6.isLongerThan(readableDuration7);
        org.joda.time.Duration duration10 = duration2.withDurationAdded(readableDuration7, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) '4');
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfWeek();
        org.joda.time.DateTime dateTime18 = dateTime12.withDurationAdded((long) 100, 0);
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.Days days20 = org.joda.time.Days.daysIn(readableInterval19);
        org.joda.time.Duration duration21 = days20.toStandardDuration();
        org.joda.time.Duration duration22 = duration21.toDuration();
        org.joda.time.ReadableDuration readableDuration23 = null;
        boolean boolean24 = duration22.isLongerThan(readableDuration23);
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.Days days26 = org.joda.time.Days.daysIn(readableInterval25);
        org.joda.time.Duration duration27 = days26.toStandardDuration();
        org.joda.time.Duration duration28 = duration27.toDuration();
        org.joda.time.ReadableDuration readableDuration29 = null;
        boolean boolean30 = duration28.isLongerThan(readableDuration29);
        boolean boolean31 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableDuration) duration28);
        boolean boolean33 = duration10.isEqual((org.joda.time.ReadableDuration) duration28);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.plusYears((int) '4');
        org.joda.time.DateTime.Property property38 = dateTime35.dayOfWeek();
        org.joda.time.DateTime dateTime41 = dateTime35.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property42 = dateTime35.minuteOfHour();
        org.joda.time.DateTime dateTime43 = dateTime35.toDateTime();
        java.lang.String str44 = dateTime43.toString();
        org.joda.time.Period period45 = duration28.toPeriodTo((org.joda.time.ReadableInstant) dateTime43);
        long long46 = duration28.getMillis();
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        boolean boolean49 = instant47.isEqual(10L);
        org.joda.time.Instant instant50 = instant47.toInstant();
        org.joda.time.Instant instant52 = instant47.minus((long) 'u');
        org.joda.time.Instant instant55 = instant52.withDurationAdded((long) 26185, 26319819);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, (org.joda.time.ReadableInstant) instant52);
        org.joda.time.Days days57 = duration28.toStandardDays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant47", (dateTime35.compareTo(instant47) == 0) == dateTime35.equals(instant47));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean1 = instant0.isAfterNow();
        org.joda.time.Instant instant3 = instant0.withMillis((long) (short) 0);
        org.joda.time.Instant instant5 = instant3.minus(2629746000L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.DateTime dateTime10 = property8.roundCeilingCopy();
        int int11 = instant3.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Instant instant13 = instant3.plus((long) (-1568204351));
        boolean boolean15 = instant3.isAfter(3110492000L);
        org.joda.time.Chronology chronology16 = instant3.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime7", (instant0.compareTo(dateTime7) == 0) == instant0.equals(dateTime7));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime5 = dateTime1.minusMinutes((int) '#');
        java.lang.String str6 = dateTime5.toString();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.Instant instant9 = instant7.withMillis((long) 99);
        org.joda.time.Duration duration11 = org.joda.time.Duration.parse("PT2147483647S");
        long long12 = duration11.getStandardHours();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMillis((int) ' ');
        int int17 = dateTime14.getEra();
        org.joda.time.DateTime.Property property18 = dateTime14.secondOfMinute();
        org.joda.time.Period period19 = duration11.toPeriodTo((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Duration duration22 = duration11.withDurationAdded((long) 26200866, 24);
        org.joda.time.Duration duration23 = duration11.toDuration();
        org.joda.time.Instant instant24 = instant9.minus((org.joda.time.ReadableDuration) duration11);
        long long25 = instant9.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant7", (dateTime5.compareTo(instant7) == 0) == dateTime5.equals(instant7));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime3.yearOfCentury();
        int int6 = dateTime3.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusYears((int) '4');
        org.joda.time.DateTime dateTime12 = dateTime8.plusDays(10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears((int) '4');
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfWeek();
        org.joda.time.DateTime dateTime21 = dateTime15.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property22 = dateTime15.secondOfMinute();
        org.joda.time.Chronology chronology23 = dateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.dayOfMonth();
        org.joda.time.DurationField durationField25 = chronology23.millis();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 1, chronology23);
        org.joda.time.DateTime dateTime27 = dateTime8.withChronology(chronology23);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime33 = dateTime29.minusMinutes((int) '#');
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.Days days35 = org.joda.time.Days.daysIn(readableInterval34);
        org.joda.time.Duration duration36 = days35.toStandardDuration();
        org.joda.time.Duration duration37 = duration36.toDuration();
        org.joda.time.ReadableDuration readableDuration38 = null;
        boolean boolean39 = duration37.isLongerThan(readableDuration38);
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.Days days41 = org.joda.time.Days.daysIn(readableInterval40);
        org.joda.time.Duration duration42 = days41.toStandardDuration();
        org.joda.time.Duration duration43 = duration42.toDuration();
        org.joda.time.ReadableDuration readableDuration44 = null;
        boolean boolean45 = duration43.isLongerThan(readableDuration44);
        boolean boolean46 = duration37.isShorterThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableDuration) duration43, periodType47);
        int int49 = dateTime33.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime51.plusYears((int) '4');
        org.joda.time.DateTime.Property property54 = dateTime51.dayOfWeek();
        org.joda.time.DateTime dateTime57 = dateTime51.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property58 = dateTime51.minuteOfHour();
        org.joda.time.DateTime dateTime60 = dateTime51.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone61 = dateTime60.getZone();
        long long64 = dateTimeZone61.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime66 = org.joda.time.DateTime.now(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime66.minusMillis((int) ' ');
        int int69 = dateTime66.getEra();
        org.joda.time.DateTime dateTime71 = dateTime66.minusMinutes((int) (short) 1);
        int int72 = dateTimeZone61.getOffset((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTimeZone dateTimeZone73 = dateTime66.getZone();
        boolean boolean74 = dateTime33.isEqual((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime66);
        boolean boolean76 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime78 = org.joda.time.DateTime.now(dateTimeZone77);
        org.joda.time.DateTime dateTime80 = dateTime78.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime82 = org.joda.time.DateTime.now(dateTimeZone81);
        org.joda.time.DateTime dateTime84 = dateTime82.minusMillis((int) ' ');
        int int85 = dateTime82.getEra();
        int int86 = dateTime80.compareTo((org.joda.time.ReadableInstant) dateTime82);
        int int87 = dateTime80.getEra();
        org.joda.time.DateTime dateTime88 = dateTime80.toDateTime();
        org.joda.time.DateTime dateTime90 = dateTime88.minusYears(1);
        org.joda.time.YearMonthDay yearMonthDay91 = dateTime88.toYearMonthDay();
        org.joda.time.Period period92 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime66, (org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.Instant instant93 = dateTime88.toInstant();
        org.joda.time.DateTime.Property property94 = dateTime88.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime88 and instant93", (dateTime88.compareTo(instant93) == 0) == dateTime88.equals(instant93));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) 28);
        org.joda.time.Duration duration4 = duration1.withDurationAdded(1645512059742L, 100);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMillis((int) ' ');
        int int13 = dateTime10.getEra();
        int int14 = dateTime8.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMillis((int) ' ');
        org.joda.time.Duration duration19 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime16);
        long long20 = duration19.getMillis();
        boolean boolean21 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMillis((int) ' ');
        org.joda.time.DateTime dateTime27 = dateTime23.minusMinutes((int) '#');
        org.joda.time.DateTime dateTime29 = dateTime23.withMillis((long) (byte) 1);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTime.Property property35 = dateTime34.dayOfMonth();
        org.joda.time.DateTime dateTime36 = property35.roundFloorCopy();
        org.joda.time.DateTime.Property property37 = dateTime36.millisOfDay();
        org.joda.time.Chronology chronology38 = dateTime36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 2147483647, (long) 1814400, periodType32, chronology38);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration19, (org.joda.time.ReadableInstant) dateTime23, periodType32);
        org.joda.time.Duration duration42 = duration19.minus(2532073925L);
        org.joda.time.Duration duration45 = org.joda.time.Duration.parse("PT2147483647S");
        long long46 = duration45.getStandardHours();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime48 = org.joda.time.DateTime.now(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.minusMillis((int) ' ');
        int int51 = dateTime48.getEra();
        org.joda.time.DateTime.Property property52 = dateTime48.secondOfMinute();
        org.joda.time.Period period53 = duration45.toPeriodTo((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone55);
        java.lang.String str57 = dateTimeZone55.getID();
        long long59 = dateTimeZone55.previousTransition((long) (short) 0);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) 1, dateTimeZone55);
        org.joda.time.DateTime dateTime62 = dateTime60.minusMillis((int) 'u');
        org.joda.time.Seconds seconds63 = org.joda.time.Seconds.MAX_VALUE;
        org.joda.time.MutablePeriod mutablePeriod64 = seconds63.toMutablePeriod();
        mutablePeriod64.setMonths((int) (short) 100);
        int int67 = mutablePeriod64.getYears();
        java.lang.Object obj68 = mutablePeriod64.clone();
        org.joda.time.Period period70 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.Period period72 = period70.plusMillis(435);
        mutablePeriod64.add((org.joda.time.ReadablePeriod) period72);
        org.joda.time.DateTime dateTime74 = dateTime60.plus((org.joda.time.ReadablePeriod) mutablePeriod64);
        org.joda.time.Seconds seconds75 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.PeriodType periodType76 = seconds75.getPeriodType();
        org.joda.time.PeriodType periodType77 = periodType76.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration45, (org.joda.time.ReadableInstant) dateTime74, periodType76);
        java.lang.String str79 = periodType76.getName();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime82 = org.joda.time.DateTime.now(dateTimeZone81);
        org.joda.time.DateTime dateTime84 = dateTime82.plusYears((int) '4');
        org.joda.time.DateTime.Property property85 = dateTime82.dayOfWeek();
        org.joda.time.DateTime dateTime88 = dateTime82.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property89 = dateTime82.secondOfMinute();
        org.joda.time.Chronology chronology90 = dateTime82.getChronology();
        org.joda.time.DateTimeField dateTimeField91 = chronology90.dayOfMonth();
        org.joda.time.DurationField durationField92 = chronology90.halfdays();
        org.joda.time.Chronology chronology93 = chronology90.withUTC();
        org.joda.time.DurationField durationField94 = chronology93.days();
        org.joda.time.DurationField durationField95 = chronology93.halfdays();
        org.joda.time.DateTime dateTime96 = new org.joda.time.DateTime(1645427938280L, chronology93);
        org.joda.time.MutablePeriod mutablePeriod97 = new org.joda.time.MutablePeriod((long) 37, periodType76, chronology93);
        org.joda.time.Period period98 = duration19.toPeriod(periodType76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField92 and durationField95", (durationField92.compareTo(durationField95) == 0) == durationField92.equals(durationField95));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears((int) '4');
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = dateTime1.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        org.joda.time.Chronology chronology9 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField11 = chronology9.halfdays();
        org.joda.time.Chronology chronology12 = chronology9.withUTC();
        org.joda.time.DurationField durationField13 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        java.lang.String str17 = dateTimeZone15.getID();
        long long19 = dateTimeZone15.previousTransition((long) (short) 0);
        long long21 = dateTimeZone15.nextTransition((long) (short) -1);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone15);
        int int24 = dateTimeZone15.getOffset(1814400000L);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        int int27 = dateTimeZone25.getStandardOffset((-78382080000000L));
        long long29 = dateTimeZone15.getMillisKeepLocal(dateTimeZone25, 0L);
        java.lang.String str30 = dateTimeZone15.getID();
        int int32 = dateTimeZone15.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        long long35 = dateTimeZone33.convertUTCToLocal((long) (short) -1);
        java.lang.String str37 = dateTimeZone33.getName(596523L);
        java.lang.String str39 = dateTimeZone33.getNameKey((long) 16);
        long long41 = dateTimeZone15.getMillisKeepLocal(dateTimeZone33, (long) (-1568204351));
        java.lang.String str43 = dateTimeZone33.getName(1590470380800001000L);
        org.joda.time.Chronology chronology44 = chronology9.withZone(dateTimeZone33);
        org.joda.time.DurationField durationField45 = chronology44.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField11, and durationField13", !(durationField45.compareTo(durationField11) == 0) || (Math.signum(durationField45.compareTo(durationField13)) == Math.signum(durationField11.compareTo(durationField13))));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period9 = period6.plusMinutes((int) (byte) 0);
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) period6);
        mutablePeriod3.addMonths((int) 'u');
        mutablePeriod3.addHours((int) (byte) -1);
        org.joda.time.Period period17 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod18 = period17.toMutablePeriod();
        org.joda.time.Period period20 = period17.plusMinutes((int) (byte) 0);
        org.joda.time.Period period22 = period20.plusMonths((int) '4');
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType24.getDurationType();
        boolean boolean26 = periodType23.isSupported(durationFieldType25);
        boolean boolean27 = period20.isSupported(durationFieldType25);
        int int28 = mutablePeriod3.indexOf(durationFieldType25);
        org.joda.time.Days days29 = org.joda.time.Days.MIN_VALUE;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod33 = period32.toMutablePeriod();
        org.joda.time.Period period35 = period32.plusSeconds((int) (short) 1);
        org.joda.time.Days days36 = period35.toStandardDays();
        org.joda.time.Days days38 = days36.plus((int) (byte) 1);
        org.joda.time.Days days39 = days29.plus(days36);
        org.joda.time.Duration duration40 = days36.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType41 = days36.getFieldType();
        mutablePeriod3.add(durationFieldType41, 2147483647);
        mutablePeriod3.addSeconds(765);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime48 = org.joda.time.DateTime.now(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.plusYears((int) '4');
        org.joda.time.DateTime.Property property51 = dateTime48.dayOfWeek();
        org.joda.time.DateTime dateTime54 = dateTime48.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property55 = dateTime48.secondOfMinute();
        org.joda.time.Chronology chronology56 = dateTime48.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.dayOfMonth();
        org.joda.time.DurationField durationField58 = chronology56.weeks();
        org.joda.time.DateTimeZone dateTimeZone59 = chronology56.getZone();
        org.joda.time.DateTimeField dateTimeField60 = chronology56.minuteOfHour();
        mutablePeriod3.add(753L, chronology56);
        org.joda.time.DurationField durationField62 = chronology56.eras();
        org.joda.time.DateTimeField dateTimeField63 = chronology56.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField58 and durationField62", Math.signum(durationField58.compareTo(durationField62)) == -Math.signum(durationField62.compareTo(durationField58)));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((-292275054));
        org.joda.time.PeriodType periodType2 = hours1.getPeriodType();
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod10 = period9.toMutablePeriod();
        org.joda.time.Period period12 = period9.plusMinutes((int) (byte) 0);
        mutablePeriod6.mergePeriod((org.joda.time.ReadablePeriod) period9);
        mutablePeriod6.addMonths((int) 'u');
        mutablePeriod6.addHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusYears((int) '4');
        org.joda.time.DateTime.Property property25 = dateTime22.dayOfWeek();
        org.joda.time.DateTime dateTime28 = dateTime22.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property29 = dateTime22.secondOfMinute();
        org.joda.time.Chronology chronology30 = dateTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.dayOfMonth();
        org.joda.time.Period period32 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology30);
        org.joda.time.DurationField durationField33 = chronology30.months();
        mutablePeriod6.setPeriod((long) 1814400, chronology30);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.plusYears((int) '4');
        org.joda.time.DateTime.Property property40 = dateTime37.dayOfWeek();
        org.joda.time.DateTime dateTime43 = dateTime37.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property44 = dateTime37.secondOfMinute();
        org.joda.time.Chronology chronology45 = dateTime37.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.dayOfMonth();
        org.joda.time.DurationField durationField47 = chronology45.weeks();
        org.joda.time.DateTimeField dateTimeField48 = chronology45.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField49 = chronology45.monthOfYear();
        mutablePeriod6.add((long) 74, chronology45);
        org.joda.time.DurationField durationField51 = chronology45.weekyears();
        org.joda.time.DurationField durationField52 = chronology45.years();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((java.lang.Object) hours1, chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField51 and durationField52", (durationField51.compareTo(durationField52) == 0) == durationField51.equals(durationField52));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.Duration duration2 = days1.toStandardDuration();
        org.joda.time.Duration duration3 = duration2.toDuration();
        org.joda.time.ReadableDuration readableDuration4 = null;
        boolean boolean5 = duration3.isLongerThan(readableDuration4);
        org.joda.time.Duration duration6 = duration3.toDuration();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration3.toIntervalTo(readableInstant7);
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Days days10 = org.joda.time.Days.daysIn(readableInterval9);
        org.joda.time.Duration duration11 = days10.toStandardDuration();
        org.joda.time.Duration duration12 = duration11.toDuration();
        org.joda.time.ReadableDuration readableDuration13 = null;
        boolean boolean14 = duration12.isLongerThan(readableDuration13);
        org.joda.time.Duration duration15 = duration12.toDuration();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Interval interval17 = duration12.toIntervalTo(readableInstant16);
        java.lang.String str18 = interval17.toString();
        boolean boolean19 = interval8.isAfter((org.joda.time.ReadableInterval) interval17);
        org.joda.time.Chronology chronology20 = interval8.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.months();
        org.joda.time.Period period24 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod25 = period24.toMutablePeriod();
        org.joda.time.ReadableInterval readableInterval26 = null;
        org.joda.time.Days days27 = org.joda.time.Days.daysIn(readableInterval26);
        org.joda.time.Duration duration28 = days27.toStandardDuration();
        org.joda.time.Duration duration29 = duration28.toDuration();
        org.joda.time.ReadableDuration readableDuration30 = null;
        boolean boolean31 = duration29.isLongerThan(readableDuration30);
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.Days days33 = org.joda.time.Days.daysIn(readableInterval32);
        org.joda.time.Duration duration34 = days33.toStandardDuration();
        org.joda.time.Duration duration35 = duration34.toDuration();
        org.joda.time.ReadableDuration readableDuration36 = null;
        boolean boolean37 = duration35.isLongerThan(readableDuration36);
        boolean boolean38 = duration29.isShorterThan((org.joda.time.ReadableDuration) duration35);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime40.minusMillis((int) ' ');
        int int43 = dateTime40.getEra();
        org.joda.time.DateTime dateTime45 = dateTime40.minusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime47 = dateTime40.withYearOfCentury((int) (short) 1);
        org.joda.time.Interval interval48 = duration29.toIntervalTo((org.joda.time.ReadableInstant) dateTime40);
        mutablePeriod25.add((org.joda.time.ReadableInterval) interval48);
        mutablePeriod25.addYears((int) ' ');
        mutablePeriod25.setSeconds((int) (byte) 100);
        mutablePeriod25.setDays((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(dateTimeZone56);
        org.joda.time.DateTime dateTime59 = dateTime57.minusMillis((int) ' ');
        int int60 = dateTime57.getEra();
        org.joda.time.DateTime.Property property61 = dateTime57.secondOfMinute();
        org.joda.time.ReadableInterval readableInterval62 = null;
        org.joda.time.Days days63 = org.joda.time.Days.daysIn(readableInterval62);
        org.joda.time.Duration duration64 = days63.toStandardDuration();
        org.joda.time.Duration duration65 = duration64.toDuration();
        org.joda.time.DateTime dateTime67 = dateTime57.withDurationAdded((org.joda.time.ReadableDuration) duration65, (-1));
        org.joda.time.Duration duration69 = duration65.plus((-1L));
        long long70 = duration65.getStandardMinutes();
        mutablePeriod25.setPeriod((org.joda.time.ReadableDuration) duration65);
        int[] intArray74 = chronology20.get((org.joda.time.ReadablePeriod) mutablePeriod25, 4665600045L, 1645514278588L);
        org.joda.time.DurationField durationField75 = chronology20.eras();
        org.joda.time.DateTimeZone dateTimeZone76 = chronology20.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField75", Math.signum(durationField21.compareTo(durationField75)) == -Math.signum(durationField75.compareTo(durationField21)));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusYears((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime8 = dateTime2.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property9 = dateTime2.minuteOfHour();
        org.joda.time.DateTime dateTime10 = dateTime2.toDateTime();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(readableDuration0, (org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) '4');
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfWeek();
        org.joda.time.DateTime dateTime19 = dateTime13.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property20 = dateTime13.secondOfMinute();
        org.joda.time.Chronology chronology21 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.dayOfMonth();
        org.joda.time.DurationField durationField23 = chronology21.millis();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.weekyearOfCentury();
        org.joda.time.DateTime dateTime25 = dateTime2.toDateTime(chronology21);
        org.joda.time.DateTime.Property property26 = dateTime25.minuteOfDay();
        org.joda.time.DateMidnight dateMidnight27 = dateTime25.toDateMidnight();
        org.joda.time.DateTime dateTime29 = dateTime25.plusHours(421);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.plusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        java.util.TimeZone timeZone36 = dateTimeZone35.toTimeZone();
        org.joda.time.DateTime dateTime37 = dateTime33.withZone(dateTimeZone35);
        org.joda.time.DateTime dateTime39 = dateTime37.minus((long) 26227);
        boolean boolean40 = dateTime29.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime37", (dateTime4.compareTo(dateTime37) == 0) == dateTime4.equals(dateTime37));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 100L);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period9 = period6.plusMinutes((int) (byte) 0);
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) period6);
        mutablePeriod3.addMonths((int) 'u');
        mutablePeriod3.addHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusYears((int) '4');
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfWeek();
        org.joda.time.DateTime dateTime25 = dateTime19.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property26 = dateTime19.secondOfMinute();
        org.joda.time.Chronology chronology27 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.dayOfMonth();
        org.joda.time.Period period29 = new org.joda.time.Period((long) 59, (long) (byte) 0, chronology27);
        org.joda.time.DurationField durationField30 = chronology27.months();
        mutablePeriod3.setPeriod((long) 1814400, chronology27);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusYears((int) '4');
        org.joda.time.DateTime.Property property37 = dateTime34.dayOfWeek();
        org.joda.time.DateTime dateTime40 = dateTime34.withDurationAdded((long) 100, 0);
        org.joda.time.DateTime.Property property41 = dateTime34.secondOfMinute();
        org.joda.time.Chronology chronology42 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.dayOfMonth();
        org.joda.time.DurationField durationField44 = chronology42.weeks();
        org.joda.time.DateTimeField dateTimeField45 = chronology42.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField46 = chronology42.monthOfYear();
        mutablePeriod3.add((long) 74, chronology42);
        org.joda.time.DurationField durationField48 = chronology42.weekyears();
        org.joda.time.DurationField durationField49 = chronology42.years();
        org.joda.time.DateTimeField dateTimeField50 = chronology42.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField48 and durationField49", (durationField48.compareTo(durationField49) == 0) == durationField48.equals(durationField49));
    }
}

