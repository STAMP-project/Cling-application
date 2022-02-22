import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        boolean boolean5 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) mutableDateTime7, periodType8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime4", (instant2.compareTo(mutableDateTime4) == 0) == instant2.equals(mutableDateTime4));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        boolean boolean5 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        boolean boolean11 = mutableDateTime4.isBefore((org.joda.time.ReadableInstant) dateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant2", (mutableDateTime0.compareTo(instant2) == 0) == mutableDateTime0.equals(instant2));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        boolean boolean5 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant2", (mutableDateTime0.compareTo(instant2) == 0) == mutableDateTime0.equals(instant2));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        boolean boolean5 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime4);
        int int6 = mutableDateTime4.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant2", (mutableDateTime0.compareTo(instant2) == 0) == mutableDateTime0.equals(instant2));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        boolean boolean5 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        boolean boolean7 = mutableDateTime0.isEqual(readableInstant6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime4", (instant2.compareTo(mutableDateTime4) == 0) == instant2.equals(mutableDateTime4));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.Instant instant4 = instant2.plus((long) (byte) 100);
        org.joda.time.Instant instant5 = instant4.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant2", (mutableDateTime0.compareTo(instant2) == 0) == mutableDateTime0.equals(instant2));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, readableDuration2, periodType3);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        long long21 = chronology14.set((org.joda.time.ReadablePartial) timeOfDay17, (long) (byte) -1);
        org.joda.time.DateTimeField dateTimeField22 = chronology14.millisOfSecond();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight1.withChronology(chronology14);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(chronology24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType28 = periodType27.withWeeksRemoved();
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight25, readableDuration26, periodType27);
        int[] intArray32 = chronology14.get((org.joda.time.ReadablePeriod) period29, (long) (byte) 1, (long) 'a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and dateMidnight23", (dateMidnight1.compareTo(dateMidnight23) == 0) == dateMidnight1.equals(dateMidnight23));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        boolean boolean5 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime4.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant2", (mutableDateTime0.compareTo(instant2) == 0) == mutableDateTime0.equals(instant2));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTime();
        org.joda.time.Instant instant4 = instant2.toInstant();
        long long5 = instant4.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant4", (mutableDateTime0.compareTo(instant4) == 0) == mutableDateTime0.equals(instant4));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTime();
        mutableDateTime3.addMonths(6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant2", (mutableDateTime0.compareTo(instant2) == 0) == mutableDateTime0.equals(instant2));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTime();
        org.joda.time.Instant instant4 = instant2.toInstant();
        org.joda.time.Instant instant6 = instant2.minus((long) 58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant2", (mutableDateTime0.compareTo(instant2) == 0) == mutableDateTime0.equals(instant2));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.Instant instant4 = instant2.plus((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        int int6 = mutableDateTime5.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int10 = dateTimeZone8.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime5.toMutableDateTime(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((java.lang.Object) instant2, dateTimeZone8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and mutableDateTime11", (mutableDateTime0.compareTo(mutableDateTime11) == 0) == mutableDateTime0.equals(mutableDateTime11));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval4 = yearMonthDay0.toInterval();
        org.joda.time.Period period5 = interval4.toPeriod();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.year();
        org.joda.time.MutableDateTime mutableDateTime14 = property12.addWrapField(6);
        mutableDateTime14.addDays((int) (byte) -1);
        int int17 = mutableDateTime14.getYear();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime14, (org.joda.time.ReadableInstant) dateTime18);
        boolean boolean21 = interval4.isBefore((org.joda.time.ReadableInterval) interval20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant19", (dateTime3.compareTo(instant19) == 0) == dateTime3.equals(instant19));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        boolean boolean5 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime4);
        int int6 = mutableDateTime0.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime4", (instant2.compareTo(mutableDateTime4) == 0) == instant2.equals(mutableDateTime4));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.centuryOfEra();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType14 = periodType13.withWeeksRemoved();
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight11, readableDuration12, periodType13);
        org.joda.time.Period period17 = period15.withSeconds(0);
        org.joda.time.Period period19 = period17.plusMinutes((int) (byte) 1);
        org.joda.time.Period period21 = period17.withSeconds((int) (byte) 10);
        org.joda.time.Period period23 = period21.withMillis((int) 'x');
        int[] intArray26 = chronology8.get((org.joda.time.ReadablePeriod) period23, (long) 2022, (long) 6);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime();
        int int28 = mutableDateTime27.getDayOfMonth();
        org.joda.time.Instant instant29 = mutableDateTime27.toInstant();
        boolean boolean31 = mutableDateTime27.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int35 = dateTimeZone33.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime27.setZone(dateTimeZone33);
        mutableDateTime27.setMillisOfDay((int) ' ');
        org.joda.time.Duration duration39 = period23.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime();
        int int41 = mutableDateTime40.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone44);
        org.joda.time.DateTime dateTime46 = dateTime45.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType48 = periodType47.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime40, (org.joda.time.ReadableInstant) dateTime45, periodType48);
        org.joda.time.DateTime dateTime50 = dateTime45.toDateTimeISO();
        org.joda.time.DateTime dateTime52 = dateTime45.withYear(1);
        org.joda.time.Interval interval53 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration39, (org.joda.time.ReadableInstant) dateTime52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and mutableDateTime40", (instant29.compareTo(mutableDateTime40) == 0) == instant29.equals(mutableDateTime40));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, readableDuration2, periodType3);
        org.joda.time.Period period7 = period5.withSeconds(0);
        org.joda.time.Period period9 = period7.plusMinutes((int) (byte) 1);
        org.joda.time.Period period11 = period7.withSeconds((int) (byte) 10);
        org.joda.time.Period period12 = period7.toPeriod();
        org.joda.time.Period period14 = period7.plusHours(58);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime();
        int int16 = mutableDateTime15.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone19);
        org.joda.time.DateTime dateTime21 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType23 = periodType22.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime15, (org.joda.time.ReadableInstant) dateTime20, periodType23);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod28 = mutablePeriod27.copy();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight.Property property31 = dateMidnight30.yearOfCentury();
        org.joda.time.Duration duration32 = mutablePeriod28.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight30);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod36 = mutablePeriod35.copy();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(chronology37);
        org.joda.time.DateMidnight.Property property39 = dateMidnight38.yearOfCentury();
        org.joda.time.Duration duration40 = mutablePeriod36.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight38);
        boolean boolean41 = duration32.isEqual((org.joda.time.ReadableDuration) duration40);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod45 = mutablePeriod44.copy();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(chronology46);
        org.joda.time.DateMidnight.Property property48 = dateMidnight47.yearOfCentury();
        org.joda.time.Duration duration49 = mutablePeriod45.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight47);
        boolean boolean50 = duration40.isShorterThan((org.joda.time.ReadableDuration) duration49);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime();
        int int52 = mutableDateTime51.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone55);
        org.joda.time.DateTime dateTime57 = dateTime56.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType58 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType59 = periodType58.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime51, (org.joda.time.ReadableInstant) dateTime56, periodType59);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod64 = mutablePeriod63.copy();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight(chronology65);
        org.joda.time.DateMidnight.Property property67 = dateMidnight66.yearOfCentury();
        org.joda.time.Duration duration68 = mutablePeriod64.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight66);
        mutablePeriod60.setPeriod((org.joda.time.ReadableDuration) duration68);
        int int70 = duration40.compareTo((org.joda.time.ReadableDuration) duration68);
        mutableDateTime15.add((org.joda.time.ReadableDuration) duration40, (int) (byte) 1);
        mutableDateTime15.setTime(184L);
        org.joda.time.Interval interval75 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period7, (org.joda.time.ReadableInstant) mutableDateTime15);
        boolean boolean77 = interval75.contains((long) 3);
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime80 = dateTime78.minusYears((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime();
        int int82 = mutableDateTime81.getDayOfMonth();
        org.joda.time.Instant instant83 = mutableDateTime81.toInstant();
        org.joda.time.MutableDateTime mutableDateTime84 = instant83.toMutableDateTime();
        boolean boolean85 = dateTime78.isEqual((org.joda.time.ReadableInstant) instant83);
        boolean boolean86 = interval75.isAfter((org.joda.time.ReadableInstant) dateTime78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime51 and instant83", (mutableDateTime51.compareTo(instant83) == 0) == mutableDateTime51.equals(instant83));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, readableDuration2, periodType3);
        org.joda.time.Period period7 = period5.withSeconds(0);
        org.joda.time.Period period9 = period7.plusMinutes((int) (byte) 1);
        org.joda.time.Period period11 = period7.withSeconds((int) (byte) 10);
        org.joda.time.Period period12 = period7.toPeriod();
        org.joda.time.Period period14 = period7.plusHours(58);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime();
        int int16 = mutableDateTime15.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone19);
        org.joda.time.DateTime dateTime21 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType23 = periodType22.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime15, (org.joda.time.ReadableInstant) dateTime20, periodType23);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod28 = mutablePeriod27.copy();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight.Property property31 = dateMidnight30.yearOfCentury();
        org.joda.time.Duration duration32 = mutablePeriod28.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight30);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod36 = mutablePeriod35.copy();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(chronology37);
        org.joda.time.DateMidnight.Property property39 = dateMidnight38.yearOfCentury();
        org.joda.time.Duration duration40 = mutablePeriod36.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight38);
        boolean boolean41 = duration32.isEqual((org.joda.time.ReadableDuration) duration40);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod45 = mutablePeriod44.copy();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(chronology46);
        org.joda.time.DateMidnight.Property property48 = dateMidnight47.yearOfCentury();
        org.joda.time.Duration duration49 = mutablePeriod45.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight47);
        boolean boolean50 = duration40.isShorterThan((org.joda.time.ReadableDuration) duration49);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime();
        int int52 = mutableDateTime51.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone55);
        org.joda.time.DateTime dateTime57 = dateTime56.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType58 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType59 = periodType58.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime51, (org.joda.time.ReadableInstant) dateTime56, periodType59);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod64 = mutablePeriod63.copy();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight(chronology65);
        org.joda.time.DateMidnight.Property property67 = dateMidnight66.yearOfCentury();
        org.joda.time.Duration duration68 = mutablePeriod64.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight66);
        mutablePeriod60.setPeriod((org.joda.time.ReadableDuration) duration68);
        int int70 = duration40.compareTo((org.joda.time.ReadableDuration) duration68);
        mutableDateTime15.add((org.joda.time.ReadableDuration) duration40, (int) (byte) 1);
        mutableDateTime15.setTime(184L);
        org.joda.time.Interval interval75 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period7, (org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime();
        int int77 = mutableDateTime76.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int81 = dateTimeZone79.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime82 = mutableDateTime76.toMutableDateTime(dateTimeZone79);
        boolean boolean83 = interval75.isBefore((org.joda.time.ReadableInstant) mutableDateTime76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime51 and mutableDateTime82", (mutableDateTime51.compareTo(mutableDateTime82) == 0) == mutableDateTime51.equals(mutableDateTime82));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.addWrapField(6);
        mutableDateTime8.addDays((int) (byte) -1);
        int int11 = mutableDateTime8.getYear();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.Instant instant13 = dateTime12.toInstant();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime8, (org.joda.time.ReadableInstant) dateTime12);
        java.lang.Object obj15 = null;
        boolean boolean16 = interval14.equals(obj15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant13", (dateTime12.compareTo(instant13) == 0) == dateTime12.equals(instant13));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusYears((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime();
        int int4 = mutableDateTime3.getDayOfMonth();
        org.joda.time.Instant instant5 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTime();
        boolean boolean7 = dateTime0.isEqual((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Instant instant9 = instant5.plus((long) 15);
        org.joda.time.Instant instant10 = instant5.toInstant();
        org.joda.time.DateTime dateTime11 = instant5.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant5", (dateTime0.compareTo(instant5) == 0) == dateTime0.equals(instant5));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.monthOfYear();
        int int6 = property5.getLeapAmount();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant2", (mutableDateTime0.compareTo(instant2) == 0) == mutableDateTime0.equals(instant2));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateTime5, periodType8);
        org.joda.time.DateTime dateTime10 = dateTime5.toDateTimeISO();
        org.joda.time.DateTime dateTime12 = dateTime5.withYear(1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int16 = dateTimeZone14.getOffset(0L);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DateTime.Property property18 = dateTime17.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.DateTime dateTime22 = dateTime17.toDateTime(dateTimeZone20);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType26 = null;
        boolean boolean27 = periodType25.isSupported(durationFieldType26);
        org.joda.time.Period period28 = new org.joda.time.Period((long) (byte) 1, 0L, periodType25);
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime22, periodType25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and dateTime22", (mutableDateTime0.compareTo(dateTime22) == 0) == mutableDateTime0.equals(dateTime22));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withWeekyear((int) '4');
        java.util.Date date11 = localDateTime8.toDate();
        java.util.Calendar calendar12 = java.util.Calendar.getInstance();
        calendar12.add(11, (int) ' ');
        java.util.Date date21 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        date21.setMonth(0);
        calendar12.setTime(date21);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance();
        calendar25.setTimeInMillis(845L);
        java.util.TimeZone timeZone28 = null;
        calendar25.setTimeZone(timeZone28);
        int int31 = calendar25.getGreatestMinimum(9);
        java.util.TimeZone timeZone33 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        calendar25.setTimeZone(timeZone33);
        java.util.Date date40 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        java.lang.String str41 = date40.toLocaleString();
        java.lang.String str42 = date40.toLocaleString();
        calendar25.setTime(date40);
        calendar12.setTime(date40);
        int int45 = date11.compareTo(date40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar12 and calendar25", (calendar12.compareTo(calendar25) == 0) == calendar12.equals(calendar25));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(readableDuration3, (org.joda.time.ReadableInstant) mutableDateTime4);
        int[] intArray7 = chronology2.get((org.joda.time.ReadablePeriod) mutablePeriod5, (long) 100);
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime11 = yearMonthDay8.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval12 = yearMonthDay8.toInterval();
        org.joda.time.Period period13 = interval12.toPeriod();
        org.joda.time.Interval interval14 = interval12.toInterval();
        org.joda.time.MutableInterval mutableInterval15 = interval12.toMutableInterval();
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        mutablePeriod5.add((org.joda.time.ReadableInterval) mutableInterval15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime();
        int int22 = mutableDateTime21.getDayOfMonth();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate26 = localDate24.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int28 = localDate24.get(dateTimeFieldType27);
        mutableDateTime21.set(dateTimeFieldType27, 2);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.minutes();
        mutableDateTime21.add(durationFieldType31, (int) '4');
        mutableDateTime20.add(durationFieldType31, (int) (short) 0);
        mutablePeriod5.add(durationFieldType31, 53251426);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and mutableDateTime20", (mutableDateTime4.compareTo(mutableDateTime20) == 0) == mutableDateTime4.equals(mutableDateTime20));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime3.getZone();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.withChronologyRetainFields(chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plusHours((-1));
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.centuryOfEra();
        org.joda.time.DurationField durationField18 = chronology15.weekyears();
        org.joda.time.DateTime dateTime19 = dateTime3.toDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField20 = chronology15.secondOfDay();
        org.joda.time.DurationField durationField21 = chronology15.millis();
        org.joda.time.DurationField durationField22 = chronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField18, and durationField21", !(durationField22.compareTo(durationField18) == 0) || (Math.signum(durationField22.compareTo(durationField21)) == Math.signum(durationField18.compareTo(durationField21))));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval4 = yearMonthDay0.toInterval();
        org.joda.time.Period period5 = interval4.toPeriod();
        org.joda.time.Interval interval6 = interval4.toInterval();
        org.joda.time.Interval interval7 = interval6.toInterval();
        org.joda.time.DateTime dateTime8 = interval6.getEnd();
        org.joda.time.DateTime.Property property9 = dateTime8.weekOfWeekyear();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod13 = mutablePeriod12.copy();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight.Property property16 = dateMidnight15.yearOfCentury();
        org.joda.time.Duration duration17 = mutablePeriod13.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight15.withZoneRetainFields(dateTimeZone19);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(dateTimeZone19);
        java.lang.String str23 = dateTimeZone19.getShortName(733L);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime8.toMutableDateTime(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime24", (dateTime3.compareTo(mutableDateTime24) == 0) == dateTime3.equals(mutableDateTime24));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.withChronologyRetainFields(chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plusHours((-1));
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.withChronologyRetainFields(chronology19);
        long long22 = chronology15.set((org.joda.time.ReadablePartial) timeOfDay18, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(chronology15);
        org.joda.time.DateTime dateTime24 = dateTime5.toDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField25 = chronology15.yearOfCentury();
        org.joda.time.DurationField durationField26 = chronology15.centuries();
        org.joda.time.DateTimeField dateTimeField27 = chronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = chronology15.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField29 = chronology15.year();
        org.joda.time.DurationField durationField30 = chronology15.eras();
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay((java.lang.Object) 389L, chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField26 and durationField30", Math.signum(durationField26.compareTo(durationField30)) == -Math.signum(durationField30.compareTo(durationField26)));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        long long21 = chronology14.set((org.joda.time.ReadablePartial) timeOfDay17, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(chronology14);
        org.joda.time.DateTime dateTime23 = dateTime4.toDateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField24 = chronology14.yearOfCentury();
        org.joda.time.DurationField durationField25 = chronology14.centuries();
        org.joda.time.DateTimeField dateTimeField26 = chronology14.dayOfYear();
        org.joda.time.DurationField durationField27 = chronology14.eras();
        org.joda.time.DateTimeField dateTimeField28 = chronology14.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField25 and durationField27", Math.signum(durationField25.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField25)));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(11, (int) ' ');
        java.util.Date date9 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        date9.setMonth(0);
        calendar0.setTime(date9);
        calendar0.set(1, 53251426);
        java.lang.String str16 = calendar0.getCalendarType();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance();
        calendar17.setTimeInMillis(845L);
        java.util.TimeZone timeZone20 = null;
        calendar17.setTimeZone(timeZone20);
        int int23 = calendar17.getGreatestMinimum(9);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        calendar17.setTimeZone(timeZone25);
        java.util.Date date32 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        java.lang.String str33 = date32.toLocaleString();
        java.lang.String str34 = date32.toLocaleString();
        calendar17.setTime(date32);
        calendar0.setTime(date32);
        int int37 = date32.getTimezoneOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar17", (calendar0.compareTo(calendar17) == 0) == calendar0.equals(calendar17));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(11, (int) ' ');
        java.util.Date date9 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        date9.setMonth(0);
        calendar0.setTime(date9);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance();
        calendar13.setTimeInMillis(845L);
        java.util.TimeZone timeZone16 = null;
        calendar13.setTimeZone(timeZone16);
        int int19 = calendar13.getGreatestMinimum(9);
        java.util.TimeZone timeZone21 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        calendar13.setTimeZone(timeZone21);
        java.util.Date date28 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        java.lang.String str29 = date28.toLocaleString();
        java.lang.String str30 = date28.toLocaleString();
        calendar13.setTime(date28);
        calendar0.setTime(date28);
        date28.setSeconds(888);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar13", (calendar0.compareTo(calendar13) == 0) == calendar0.equals(calendar13));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateTime5, periodType8);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod13 = mutablePeriod12.copy();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight.Property property16 = dateMidnight15.yearOfCentury();
        org.joda.time.Duration duration17 = mutablePeriod13.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod21 = mutablePeriod20.copy();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.yearOfCentury();
        org.joda.time.Duration duration25 = mutablePeriod21.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight23);
        boolean boolean26 = duration17.isEqual((org.joda.time.ReadableDuration) duration25);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod30 = mutablePeriod29.copy();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight.Property property33 = dateMidnight32.yearOfCentury();
        org.joda.time.Duration duration34 = mutablePeriod30.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight32);
        boolean boolean35 = duration25.isShorterThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime();
        int int37 = mutableDateTime36.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone40);
        org.joda.time.DateTime dateTime42 = dateTime41.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType44 = periodType43.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime36, (org.joda.time.ReadableInstant) dateTime41, periodType44);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod49 = mutablePeriod48.copy();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight(chronology50);
        org.joda.time.DateMidnight.Property property52 = dateMidnight51.yearOfCentury();
        org.joda.time.Duration duration53 = mutablePeriod49.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight51);
        mutablePeriod45.setPeriod((org.joda.time.ReadableDuration) duration53);
        int int55 = duration25.compareTo((org.joda.time.ReadableDuration) duration53);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration25, (int) (byte) 1);
        mutableDateTime0.setTime(184L);
        int int60 = mutableDateTime0.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone63);
        org.joda.time.DateTime dateTime65 = dateTime64.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime65.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime66.year();
        org.joda.time.MutableDateTime mutableDateTime68 = property67.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime70 = property67.add(799L);
        org.joda.time.MutableDateTime mutableDateTime72 = property67.set("58");
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(dateTimeZone74);
        org.joda.time.LocalDate localDate76 = new org.joda.time.LocalDate((java.lang.Object) mutableDateTime72, dateTimeZone74);
        mutableDateTime0.setZone(dateTimeZone74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime36 and mutableDateTime75", (mutableDateTime36.compareTo(mutableDateTime75) == 0) == mutableDateTime36.equals(mutableDateTime75));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod6.copy();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.withChronologyRetainFields(chronology13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = timeOfDay14.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.plusHours((-1));
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        mutablePeriod6.setPeriod((long) (byte) 1, 845L, chronology18);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(41L, chronology18);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) '4', periodType2, chronology18);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod28 = mutablePeriod27.copy();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.withChronologyRetainFields(chronology34);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray36 = timeOfDay35.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay35.plusHours((-1));
        org.joda.time.Chronology chronology39 = timeOfDay38.getChronology();
        mutablePeriod27.setPeriod((long) (byte) 1, 845L, chronology39);
        org.joda.time.DateTimeField dateTimeField41 = chronology39.dayOfYear();
        org.joda.time.DurationField durationField42 = chronology39.weekyears();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((-1L), (long) 20, periodType24, chronology39);
        org.joda.time.DurationField durationField44 = chronology39.years();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(1645454928059L, periodType2, chronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField42 and durationField44", (durationField42.compareTo(durationField44) == 0) == durationField42.equals(durationField44));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(328L);
        org.joda.time.Instant instant4 = instant2.withMillis(376L);
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay5.year();
        org.joda.time.YearMonthDay yearMonthDay10 = property8.addToCopy(0);
        org.joda.time.YearMonthDay yearMonthDay12 = property8.setCopy(2023);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate.Property property15 = localDate14.era();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDate14.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight21 = yearMonthDay12.toDateMidnight(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime22 = instant4.toMutableDateTime(dateTimeZone17);
        java.lang.String str24 = dateTimeZone17.getNameKey(177867334800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime18", (instant0.compareTo(mutableDateTime18) == 0) == instant0.equals(mutableDateTime18));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int8 = dateTimeZone6.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime0.setZone(dateTimeZone6);
        mutableDateTime0.setMillisOfDay((int) ' ');
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(chronology12);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.dayOfYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray20 = timeOfDay19.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay19.plusHours((-1));
        org.joda.time.Chronology chronology23 = timeOfDay22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField25 = chronology23.minuteOfDay();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight13.withChronology(chronology23);
        org.joda.time.DateTime dateTime27 = mutableDateTime0.toDateTime(chronology23);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight.Property property33 = dateMidnight32.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight34 = property33.roundHalfEvenCopy();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime();
        int int36 = mutableDateTime35.getDayOfMonth();
        org.joda.time.Instant instant37 = mutableDateTime35.toInstant();
        boolean boolean39 = mutableDateTime35.isBefore((long) 2);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.monthOfYear();
        boolean boolean42 = mutableDateTime35.isBefore(909L);
        boolean boolean43 = dateMidnight34.isBefore((org.joda.time.ReadableInstant) mutableDateTime35);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.monthOfYear();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(chronology46);
        org.joda.time.DateMidnight.Property property48 = dateMidnight47.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime44, (org.joda.time.ReadableInstant) dateMidnight47);
        int int50 = dateMidnight47.getMinuteOfHour();
        org.joda.time.Instant instant51 = dateMidnight47.toInstant();
        org.joda.time.Period period52 = org.joda.time.Period.ZERO;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology53);
        org.joda.time.DateMidnight.Property property55 = dateMidnight54.dayOfYear();
        org.joda.time.DateMidnight dateMidnight56 = property55.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight.Property property58 = dateMidnight56.property(dateTimeFieldType57);
        org.joda.time.DateMidnight.Property property59 = dateMidnight56.year();
        org.joda.time.Duration duration60 = period52.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight56);
        org.joda.time.Period period61 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight47, (org.joda.time.ReadableDuration) duration60);
        mutableDateTime35.add((org.joda.time.ReadableDuration) duration60);
        mutableDateTime30.add((org.joda.time.ReadableDuration) duration60, 7);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration60, 12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime30", (instant2.compareTo(mutableDateTime30) == 0) == instant2.equals(mutableDateTime30));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.monthOfYear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight3.minusYears(52);
        int int8 = dateMidnight3.getMillisOfDay();
        org.joda.time.DateMidnight.Property property9 = dateMidnight3.era();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight.Property property15 = dateMidnight14.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight16 = property15.roundHalfEvenCopy();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        int int18 = mutableDateTime17.getDayOfMonth();
        org.joda.time.Instant instant19 = mutableDateTime17.toInstant();
        boolean boolean21 = mutableDateTime17.isBefore((long) 2);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.monthOfYear();
        boolean boolean24 = mutableDateTime17.isBefore(909L);
        boolean boolean25 = dateMidnight16.isBefore((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.monthOfYear();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight.Property property30 = dateMidnight29.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime26, (org.joda.time.ReadableInstant) dateMidnight29);
        int int32 = dateMidnight29.getMinuteOfHour();
        org.joda.time.Instant instant33 = dateMidnight29.toInstant();
        org.joda.time.Period period34 = org.joda.time.Period.ZERO;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight.Property property37 = dateMidnight36.dayOfYear();
        org.joda.time.DateMidnight dateMidnight38 = property37.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight.Property property40 = dateMidnight38.property(dateTimeFieldType39);
        org.joda.time.DateMidnight.Property property41 = dateMidnight38.year();
        org.joda.time.Duration duration42 = period34.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight38);
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight29, (org.joda.time.ReadableDuration) duration42);
        mutableDateTime17.add((org.joda.time.ReadableDuration) duration42);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration42, 7);
        org.joda.time.Interval interval47 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight3, (org.joda.time.ReadableDuration) duration42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and mutableDateTime12", (mutableDateTime0.compareTo(mutableDateTime12) == 0) == mutableDateTime0.equals(mutableDateTime12));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        long long3 = calendar0.getTimeInMillis();
        int int5 = calendar0.getActualMinimum(3);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        calendar6.setTimeInMillis(845L);
        java.util.TimeZone timeZone9 = null;
        calendar6.setTimeZone(timeZone9);
        int int12 = calendar6.getGreatestMinimum(9);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        calendar6.setTimeZone(timeZone14);
        calendar0.setTimeZone(timeZone14);
        java.lang.String str17 = timeZone14.getID();
        int int18 = timeZone14.getRawOffset();
        int int20 = timeZone14.getOffset(203L);
        java.util.TimeZone timeZone21 = java.util.TimeZone.getDefault();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.withChronologyRetainFields(chronology25);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = timeOfDay26.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay26.plusHours((-1));
        org.joda.time.Chronology chronology30 = timeOfDay29.getChronology();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.withChronologyRetainFields(chronology34);
        long long37 = chronology30.set((org.joda.time.ReadablePartial) timeOfDay33, (long) (byte) -1);
        org.joda.time.TimeOfDay.Property property38 = timeOfDay33.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay40 = property38.addToCopy(23);
        java.util.Locale locale41 = java.util.Locale.CHINESE;
        int int42 = property38.getMaximumShortTextLength(locale41);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone21, locale41);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone14, locale41);
        java.lang.String str45 = locale41.getScript();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar44", (calendar43.compareTo(calendar44) == 0) == calendar43.equals(calendar44));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.withChronologyRetainFields(chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plusHours((-1));
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.withChronologyRetainFields(chronology19);
        long long22 = chronology15.set((org.joda.time.ReadablePartial) timeOfDay18, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(chronology15);
        org.joda.time.DateTime dateTime24 = dateTime5.toDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField25 = chronology15.yearOfCentury();
        org.joda.time.DurationField durationField26 = chronology15.centuries();
        org.joda.time.DateTimeField dateTimeField27 = chronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = chronology15.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField29 = chronology15.year();
        org.joda.time.DurationField durationField30 = chronology15.eras();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(274L, chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField26 and durationField30", Math.signum(durationField26.compareTo(durationField30)) == -Math.signum(durationField30.compareTo(durationField26)));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        long long3 = calendar0.getTimeInMillis();
        int int5 = calendar0.getActualMinimum(3);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        calendar6.setTimeInMillis(845L);
        java.util.TimeZone timeZone9 = null;
        calendar6.setTimeZone(timeZone9);
        int int12 = calendar6.getGreatestMinimum(9);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        calendar6.setTimeZone(timeZone14);
        calendar0.setTimeZone(timeZone14);
        java.lang.String str17 = timeZone14.getID();
        int int18 = timeZone14.getRawOffset();
        int int20 = timeZone14.getOffset(203L);
        java.util.TimeZone timeZone21 = java.util.TimeZone.getDefault();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.withChronologyRetainFields(chronology25);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = timeOfDay26.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay26.plusHours((-1));
        org.joda.time.Chronology chronology30 = timeOfDay29.getChronology();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.withChronologyRetainFields(chronology34);
        long long37 = chronology30.set((org.joda.time.ReadablePartial) timeOfDay33, (long) (byte) -1);
        org.joda.time.TimeOfDay.Property property38 = timeOfDay33.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay40 = property38.addToCopy(23);
        java.util.Locale locale41 = java.util.Locale.CHINESE;
        int int42 = property38.getMaximumShortTextLength(locale41);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone21, locale41);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone14, locale41);
        int int45 = timeZone14.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar44", (calendar43.compareTo(calendar44) == 0) == calendar43.equals(calendar44));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        long long3 = calendar0.getTimeInMillis();
        int int5 = calendar0.getActualMinimum(3);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        calendar6.setTimeInMillis(845L);
        java.util.TimeZone timeZone9 = null;
        calendar6.setTimeZone(timeZone9);
        int int12 = calendar6.getGreatestMinimum(9);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        calendar6.setTimeZone(timeZone14);
        calendar0.setTimeZone(timeZone14);
        java.lang.String str17 = timeZone14.getID();
        int int18 = timeZone14.getRawOffset();
        int int20 = timeZone14.getOffset(203L);
        java.util.TimeZone timeZone21 = java.util.TimeZone.getDefault();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.withChronologyRetainFields(chronology25);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = timeOfDay26.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay26.plusHours((-1));
        org.joda.time.Chronology chronology30 = timeOfDay29.getChronology();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.withChronologyRetainFields(chronology34);
        long long37 = chronology30.set((org.joda.time.ReadablePartial) timeOfDay33, (long) (byte) -1);
        org.joda.time.TimeOfDay.Property property38 = timeOfDay33.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay40 = property38.addToCopy(23);
        java.util.Locale locale41 = java.util.Locale.CHINESE;
        int int42 = property38.getMaximumShortTextLength(locale41);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone21, locale41);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone14, locale41);
        java.lang.String str45 = timeZone14.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar44", (calendar43.compareTo(calendar44) == 0) == calendar43.equals(calendar44));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        long long21 = chronology14.set((org.joda.time.ReadablePartial) timeOfDay17, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(chronology14);
        org.joda.time.DateTime dateTime23 = dateTime4.toDateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField24 = chronology14.yearOfCentury();
        org.joda.time.DurationField durationField25 = chronology14.centuries();
        org.joda.time.DateTimeField dateTimeField26 = chronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = chronology14.year();
        org.joda.time.DurationField durationField29 = chronology14.eras();
        org.joda.time.DurationField durationField30 = chronology14.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField25 and durationField29", Math.signum(durationField25.compareTo(durationField29)) == -Math.signum(durationField29.compareTo(durationField25)));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        org.joda.time.YearMonthDay yearMonthDay5 = property3.addToCopy(0);
        org.joda.time.YearMonthDay yearMonthDay7 = property3.setCopy(2023);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate.Property property10 = localDate9.era();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight16 = yearMonthDay7.toDateMidnight(dateTimeZone12);
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.parse("22");
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate22 = localDate20.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int24 = localDate20.get(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = dateTime18.withFields((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay26.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime29 = yearMonthDay26.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval30 = yearMonthDay26.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.DateTime dateTime32 = dateTime18.withChronology(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime18.minusDays((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime();
        int int37 = mutableDateTime36.getDayOfMonth();
        org.joda.time.Instant instant38 = mutableDateTime36.toInstant();
        boolean boolean40 = mutableDateTime36.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int44 = dateTimeZone42.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime36.setZone(dateTimeZone42);
        long long47 = dateTimeZone42.previousTransition((long) (short) -1);
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight((long) 45, dateTimeZone42);
        org.joda.time.DateTime dateTime49 = dateTime34.withZoneRetainFields(dateTimeZone42);
        org.joda.time.DateTime dateTime50 = yearMonthDay7.toDateTimeAtCurrentTime(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and dateTime29", (mutableDateTime13.compareTo(dateTime29) == 0) == mutableDateTime13.equals(dateTime29));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.monthOfYear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime();
        int int10 = mutableDateTime9.getDayOfMonth();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate14 = localDate12.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int16 = localDate12.get(dateTimeFieldType15);
        mutableDateTime9.set(dateTimeFieldType15, 2);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.minutes();
        mutableDateTime9.add(durationFieldType19, (int) '4');
        mutableDateTime8.add(durationFieldType19, (int) (short) 0);
        int int24 = mutablePeriod5.get(durationFieldType19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and mutableDateTime8", (mutableDateTime0.compareTo(mutableDateTime8) == 0) == mutableDateTime0.equals(mutableDateTime8));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval4 = yearMonthDay0.toInterval();
        org.joda.time.Period period5 = interval4.toPeriod();
        org.joda.time.Interval interval6 = interval4.toInterval();
        org.joda.time.MutableInterval mutableInterval7 = interval4.toMutableInterval();
        org.joda.time.Period period8 = interval4.toPeriod();
        org.joda.time.MutableInterval mutableInterval9 = interval4.toMutableInterval();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay10.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime13 = yearMonthDay10.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval14 = yearMonthDay10.toInterval();
        org.joda.time.Period period15 = interval14.toPeriod();
        org.joda.time.Interval interval16 = interval14.toInterval();
        boolean boolean17 = mutableInterval9.isAfter((org.joda.time.ReadableInterval) interval16);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone22);
        org.joda.time.DateTime dateTime24 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime24.toMutableDateTime();
        org.joda.time.DateTime.Property property26 = dateTime24.year();
        org.joda.time.DateTime dateTime28 = dateTime24.withYear(1970);
        boolean boolean29 = charSet19.equals((java.lang.Object) dateTime28);
        boolean boolean30 = interval16.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime();
        int int32 = mutableDateTime31.getDayOfMonth();
        org.joda.time.Instant instant33 = mutableDateTime31.toInstant();
        boolean boolean35 = mutableDateTime31.isBefore((long) 2);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.monthOfYear();
        boolean boolean38 = mutableDateTime31.isBefore(909L);
        org.joda.time.Interval interval39 = interval16.withEnd((org.joda.time.ReadableInstant) mutableDateTime31);
        long long40 = interval16.toDurationMillis();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate.Property property43 = localDate42.era();
        org.joda.time.LocalDate localDate44 = property43.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate45 = property43.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime();
        mutableDateTime47.addMinutes(12);
        org.joda.time.DateTime dateTime50 = localDate45.toDateTime((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(dateTimeZone52);
        org.joda.time.DateTime dateTime54 = localDate45.toDateTimeAtCurrentTime(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone57);
        org.joda.time.DateTime dateTime59 = dateTime58.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime60 = dateTime58.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime62 = dateTime60.plusMonths((int) '#');
        org.joda.time.Period period64 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period66 = period64.plusHours((int) '#');
        org.joda.time.Period period67 = period64.toPeriod();
        org.joda.time.Duration duration68 = period67.toStandardDuration();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateMidnight dateMidnight70 = new org.joda.time.DateMidnight(chronology69);
        org.joda.time.DateMidnight.Property property71 = dateMidnight70.dayOfYear();
        org.joda.time.DateMidnight dateMidnight72 = property71.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight.Property property74 = dateMidnight72.property(dateTimeFieldType73);
        org.joda.time.Interval interval75 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration68, (org.joda.time.ReadableInstant) dateMidnight72);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime62, (org.joda.time.ReadableDuration) duration68);
        boolean boolean77 = localDate45.equals((java.lang.Object) duration68);
        org.joda.time.Interval interval78 = interval16.withDurationAfterStart((org.joda.time.ReadableDuration) duration68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime31 and mutableDateTime53", (mutableDateTime31.compareTo(mutableDateTime53) == 0) == mutableDateTime31.equals(mutableDateTime53));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.addWrapField(6);
        mutableDateTime8.addDays((int) (byte) -1);
        int int11 = mutableDateTime8.getYear();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.Instant instant13 = dateTime12.toInstant();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime8, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        org.joda.time.DateTime dateTime20 = timeOfDay19.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay19.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime23 = timeOfDay22.toDateTimeToday();
        int int24 = dateTime23.getYearOfEra();
        boolean boolean25 = interval14.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime26 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime28 = dateTime23.minusDays(1656);
        org.joda.time.DateTime dateTime30 = dateTime23.withYear(346);
        org.joda.time.DateTime dateTime32 = dateTime30.minus(519L);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMillis(366);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate.Property property37 = localDate36.era();
        org.joda.time.LocalDate localDate38 = property37.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate39 = property37.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology40 = localDate39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime();
        mutableDateTime41.addMinutes(12);
        org.joda.time.DateTime dateTime44 = localDate39.toDateTime((org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone46);
        org.joda.time.DateTime dateTime48 = localDate39.toDateTimeAtCurrentTime(dateTimeZone46);
        boolean boolean49 = dateTime34.isAfter((org.joda.time.ReadableInstant) dateTime48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime47", (dateTime12.compareTo(mutableDateTime47) == 0) == dateTime12.equals(mutableDateTime47));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusYears((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime0.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone7);
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        org.joda.time.DateTime.Property property11 = dateTime9.year();
        org.joda.time.DateTime dateTime12 = property11.roundFloorCopy();
        org.joda.time.DateTime dateTime13 = property11.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime14 = property11.roundFloorCopy();
        mutableDateTime3.setMillis((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate.Property property18 = localDate17.era();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localDate17.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime14.toDateTime(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and mutableDateTime21", (dateTime0.compareTo(mutableDateTime21) == 0) == dateTime0.equals(mutableDateTime21));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.plusDays(2022);
        org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay2.withMonthOfYear(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int6 = yearMonthDay2.get(dateTimeFieldType5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = yearMonthDay2.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.year();
        int int10 = dateTime8.get(dateTimeFieldType9);
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime8.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime();
        int int13 = mutableDateTime12.getDayOfMonth();
        org.joda.time.Instant instant14 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime mutableDateTime15 = instant14.toMutableDateTime();
        org.joda.time.Instant instant16 = instant14.toInstant();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        int int18 = mutableDateTime17.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone21);
        org.joda.time.DateTime dateTime23 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType25 = periodType24.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime17, (org.joda.time.ReadableInstant) dateTime22, periodType25);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod30 = mutablePeriod29.copy();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight.Property property33 = dateMidnight32.yearOfCentury();
        org.joda.time.Duration duration34 = mutablePeriod30.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight32);
        mutablePeriod26.setPeriod((org.joda.time.ReadableDuration) duration34);
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant16, (org.joda.time.ReadableDuration) duration34);
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableDuration) duration34);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long42 = dateTimeZone39.convertLocalToUTC(290L, false);
        long long44 = dateTimeZone39.previousTransition((long) 54);
        org.joda.time.DateTime dateTime45 = dateTime8.toDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime8.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and dateTime45", (mutableDateTime11.compareTo(dateTime45) == 0) == mutableDateTime11.equals(dateTime45));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        long long3 = calendar0.getTimeInMillis();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime();
        int int5 = mutableDateTime4.getDayOfMonth();
        org.joda.time.Instant instant6 = mutableDateTime4.toInstant();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        boolean boolean9 = mutableDateTime4.isBefore((org.joda.time.ReadableInstant) mutableDateTime8);
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.util.Calendar calendar11 = mutableDateTime8.toCalendar(locale10);
        calendar11.setFirstDayOfWeek((int) '#');
        long long14 = calendar11.getTimeInMillis();
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        java.time.ZoneId zoneId17 = timeZone16.toZoneId();
        java.util.TimeZone.setDefault(timeZone16);
        calendar11.setTimeZone(timeZone16);
        calendar0.setTimeZone(timeZone16);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone16);
        timeZone16.setID("2022-02-21T14:50:56.667Z");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar21", (calendar11.compareTo(calendar21) == 0) == calendar11.equals(calendar21));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        long long3 = calendar0.getTimeInMillis();
        int int5 = calendar0.getActualMinimum(3);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        calendar6.setTimeInMillis(845L);
        java.util.TimeZone timeZone9 = null;
        calendar6.setTimeZone(timeZone9);
        int int12 = calendar6.getGreatestMinimum(9);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        calendar6.setTimeZone(timeZone14);
        calendar0.setTimeZone(timeZone14);
        java.util.Date date17 = calendar0.getTime();
        calendar0.setMinimalDaysInFirstWeek(972);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType21.getField(chronology24);
        int int27 = localDateTime20.get(dateTimeFieldType21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar6", (calendar0.compareTo(calendar6) == 0) == calendar0.equals(calendar6));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(328L);
        org.joda.time.Instant instant4 = instant2.withMillis(376L);
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay6.minusMonths((int) (byte) 10);
        int int9 = yearMonthDay6.getDayOfMonth();
        int int10 = yearMonthDay6.getDayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod14 = mutablePeriod13.copy();
        org.joda.time.format.PeriodFormatter periodFormatter15 = null;
        java.lang.String str16 = mutablePeriod14.toString(periodFormatter15);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay6.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod14, (-1));
        mutablePeriod14.setMillis(9);
        int int21 = mutablePeriod14.size();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone24);
        org.joda.time.DateTime dateTime26 = dateTime25.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.year();
        org.joda.time.MutableDateTime mutableDateTime30 = property28.addWrapField(6);
        org.joda.time.MutableDateTime mutableDateTime31 = property28.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime32 = property28.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime33 = property28.roundFloor();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.weekOfWeekyear();
        org.joda.time.Period period36 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period38 = period36.minusHours((int) '4');
        org.joda.time.Period period40 = period36.minusYears(10);
        org.joda.time.Interval interval41 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime33, (org.joda.time.ReadablePeriod) period36);
        org.joda.time.Period period43 = period36.plusMonths(292278174);
        org.joda.time.Period period45 = period43.withSeconds(969);
        mutablePeriod14.setPeriod((org.joda.time.ReadablePeriod) period45);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime();
        int int51 = mutableDateTime50.getDayOfMonth();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate55 = localDate53.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int57 = localDate53.get(dateTimeFieldType56);
        mutableDateTime50.set(dateTimeFieldType56, 2);
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.minutes();
        mutableDateTime50.add(durationFieldType60, (int) '4');
        mutableDateTime49.add(durationFieldType60, (int) (short) 0);
        int int65 = period45.get(durationFieldType60);
        mutableDateTime5.add(durationFieldType60, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime49", (instant0.compareTo(mutableDateTime49) == 0) == instant0.equals(mutableDateTime49));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.minusYears((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime4.toMutableDateTime();
        mutableDateTime7.setMillisOfSecond(2);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant2, (org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.Instant instant12 = instant2.withMillis(1645454860172L);
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        org.joda.time.Instant instant16 = instant13.withDurationAdded((long) (byte) 0, (int) (byte) 0);
        org.joda.time.Instant instant18 = instant13.minus(951091200000L);
        org.joda.time.Instant instant20 = instant13.minus(823L);
        org.joda.time.Instant instant22 = instant13.minus((long) 1970);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime();
        int int24 = mutableDateTime23.getDayOfMonth();
        org.joda.time.Instant instant25 = mutableDateTime23.toInstant();
        org.joda.time.MutableDateTime mutableDateTime26 = instant25.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth29 = new org.joda.time.YearMonth(dateTimeZone28);
        int int30 = yearMonth29.getYear();
        org.joda.time.Period period32 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period34 = period32.plusHours((int) '#');
        org.joda.time.Period period35 = period32.toPeriod();
        org.joda.time.YearMonth yearMonth36 = yearMonth29.plus((org.joda.time.ReadablePeriod) period32);
        mutableDateTime26.add((org.joda.time.ReadablePeriod) period32, 21);
        mutableDateTime26.setYear(67);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod44 = mutablePeriod43.copy();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(chronology45);
        org.joda.time.DateMidnight.Property property47 = dateMidnight46.yearOfCentury();
        org.joda.time.Duration duration48 = mutablePeriod44.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight46);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod52 = mutablePeriod51.copy();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology53);
        org.joda.time.DateMidnight.Property property55 = dateMidnight54.yearOfCentury();
        org.joda.time.Duration duration56 = mutablePeriod52.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight54);
        boolean boolean57 = duration48.isEqual((org.joda.time.ReadableDuration) duration56);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod61 = mutablePeriod60.copy();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight(chronology62);
        org.joda.time.DateMidnight.Property property64 = dateMidnight63.yearOfCentury();
        org.joda.time.Duration duration65 = mutablePeriod61.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight63);
        boolean boolean66 = duration56.isShorterThan((org.joda.time.ReadableDuration) duration65);
        mutableDateTime26.add((org.joda.time.ReadableDuration) duration56, 45);
        org.joda.time.Instant instant70 = instant13.withDurationAdded((org.joda.time.ReadableDuration) duration56, (int) 'a');
        org.joda.time.Instant instant72 = instant2.withDurationAdded((org.joda.time.ReadableDuration) duration56, 2023);
        org.joda.time.Instant instant74 = instant2.withMillis(610L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant13", (mutableDateTime0.compareTo(instant13) == 0) == mutableDateTime0.equals(instant13));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval4 = yearMonthDay0.toInterval();
        int int5 = yearMonthDay0.getYear();
        org.joda.time.DateTime dateTime6 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime8 = dateTime6.plusSeconds(14);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone11);
        org.joda.time.DateTime dateTime13 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.year();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.addWrapField(6);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        org.joda.time.MutableDateTime mutableDateTime20 = property15.set("1", locale19);
        org.joda.time.MutableDateTime mutableDateTime22 = property15.addWrapField(21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime();
        int int24 = mutableDateTime23.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone27);
        org.joda.time.DateTime dateTime29 = dateTime28.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType31 = periodType30.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime23, (org.joda.time.ReadableInstant) dateTime28, periodType31);
        org.joda.time.DateTime dateTime33 = dateTime28.toDateTimeISO();
        boolean boolean34 = mutableDateTime22.isBefore((org.joda.time.ReadableInstant) dateTime33);
        java.util.Date date35 = dateTime33.toDate();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod39 = mutablePeriod38.copy();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(chronology40);
        org.joda.time.DateMidnight.Property property42 = dateMidnight41.yearOfCentury();
        org.joda.time.Duration duration43 = mutablePeriod39.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight41);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod47 = mutablePeriod46.copy();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(chronology48);
        org.joda.time.DateMidnight.Property property50 = dateMidnight49.yearOfCentury();
        org.joda.time.Duration duration51 = mutablePeriod47.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight49);
        boolean boolean52 = duration43.isEqual((org.joda.time.ReadableDuration) duration51);
        org.joda.time.DateTime dateTime53 = dateTime33.plus((org.joda.time.ReadableDuration) duration51);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableDuration) duration51);
        mutablePeriod54.setPeriod(1645454846663L, (long) 768);
        org.joda.time.YearMonthDay yearMonthDay58 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay60 = yearMonthDay58.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime61 = yearMonthDay58.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval62 = yearMonthDay58.toInterval();
        org.joda.time.Period period63 = interval62.toPeriod();
        org.joda.time.Interval interval64 = interval62.toInterval();
        org.joda.time.MutableInterval mutableInterval65 = interval62.toMutableInterval();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int69 = dateTimeZone67.getOffset(0L);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(dateTimeZone67);
        org.joda.time.DateTime.Property property71 = dateTime70.minuteOfDay();
        org.joda.time.DateTime dateTime73 = dateTime70.withSecondOfMinute(23);
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType75 = dateTimeFieldType74.getRangeDurationType();
        org.joda.time.DateTime.Property property76 = dateTime70.property(dateTimeFieldType74);
        org.joda.time.DateTime dateTime77 = property76.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay78 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay80 = yearMonthDay78.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime81 = yearMonthDay78.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval82 = yearMonthDay78.toInterval();
        org.joda.time.MutableInterval mutableInterval83 = interval82.toMutableInterval();
        boolean boolean84 = dateTime77.equals((java.lang.Object) mutableInterval83);
        boolean boolean85 = interval62.overlaps((org.joda.time.ReadableInterval) mutableInterval83);
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((long) 870, (long) 1975);
        int int89 = mutablePeriod88.getSeconds();
        org.joda.time.Interval interval90 = interval62.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) mutablePeriod88);
        mutablePeriod54.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime70", (dateTime6.compareTo(dateTime70) == 0) == dateTime6.equals(dateTime70));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.addWrapField(6);
        org.joda.time.MutableDateTime mutableDateTime10 = property6.addWrapField(0);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.Instant instant12 = dateTime11.toInstant();
        int int13 = dateTime11.getDayOfMonth();
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime11.toDateTimeISO();
        org.joda.time.DateTime dateTime17 = dateTime11.minus((long) 59);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone20);
        org.joda.time.DateTime dateTime22 = dateTime21.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime22.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.year();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.addWrapField(6);
        mutableDateTime26.addDays((int) (byte) -1);
        int int29 = mutableDateTime26.getYear();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.Instant instant31 = dateTime30.toInstant();
        org.joda.time.Interval interval32 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime26, (org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime26.copy();
        mutableDateTime33.addWeekyears(1969);
        int int36 = mutableDateTime33.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime33.era();
        org.joda.time.Instant instant38 = new org.joda.time.Instant();
        long long39 = instant38.getMillis();
        org.joda.time.DateTime dateTime40 = instant38.toDateTimeISO();
        org.joda.time.DateTime dateTime42 = dateTime40.plusMonths((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime40.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime();
        int int45 = mutableDateTime44.getDayOfMonth();
        org.joda.time.Instant instant46 = mutableDateTime44.toInstant();
        boolean boolean48 = mutableDateTime44.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int52 = dateTimeZone50.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime44.setZone(dateTimeZone50);
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology56 = localDate55.getChronology();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(chronology56);
        org.joda.time.DateTimeZone dateTimeZone58 = dateTime57.getZone();
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime44.toMutableDateTime(dateTimeZone58);
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate(dateTimeZone58);
        long long62 = dateTimeZone43.getMillisKeepLocal(dateTimeZone58, (long) 1969);
        mutableDateTime33.setZone(dateTimeZone58);
        org.joda.time.DateTime dateTime64 = dateTime11.toDateTime(dateTimeZone58);
        mutableDateTime10.setZone(dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(dateTimeZone58);
        org.joda.time.LocalDate localDate67 = org.joda.time.LocalDate.now(dateTimeZone58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant12", (dateTime11.compareTo(instant12) == 0) == dateTime11.equals(instant12));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.addWrapField(6);
        org.joda.time.MutableDateTime mutableDateTime9 = property6.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property6.add((long) 1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateTime dateTime16 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime16.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.year();
        org.joda.time.MutableDateTime mutableDateTime20 = property18.addWrapField(6);
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        org.joda.time.MutableDateTime mutableDateTime23 = property18.set("1", locale22);
        org.joda.time.MutableDateTime mutableDateTime25 = property18.set(23);
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) 0, 0L);
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period32 = period30.withPeriodType(periodType31);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone35);
        org.joda.time.DateTime dateTime37 = dateTime36.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime37.toMutableDateTime();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.TimeOfDay timeOfDay41 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay41.withChronologyRetainFields(chronology42);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray44 = timeOfDay43.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay43.plusHours((-1));
        org.joda.time.Chronology chronology47 = timeOfDay46.getChronology();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.TimeOfDay timeOfDay50 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay50.withChronologyRetainFields(chronology51);
        long long54 = chronology47.set((org.joda.time.ReadablePartial) timeOfDay50, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay(chronology47);
        org.joda.time.DateTime dateTime56 = dateTime37.toDateTime(chronology47);
        org.joda.time.DateTimeField dateTimeField57 = chronology47.yearOfCentury();
        org.joda.time.DurationField durationField58 = chronology47.centuries();
        org.joda.time.DateTimeField dateTimeField59 = chronology47.dayOfYear();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 'a', (long) 7, periodType31, chronology47);
        org.joda.time.PeriodType periodType61 = periodType31.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime11, (org.joda.time.ReadableInstant) mutableDateTime25, periodType31);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime25.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime64 = property63.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime65 = property63.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime();
        int int67 = mutableDateTime66.getDayOfMonth();
        org.joda.time.Instant instant68 = mutableDateTime66.toInstant();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(dateTimeZone69);
        boolean boolean71 = mutableDateTime66.isBefore((org.joda.time.ReadableInstant) mutableDateTime70);
        java.util.Locale locale72 = java.util.Locale.CANADA_FRENCH;
        java.util.Calendar calendar73 = mutableDateTime70.toCalendar(locale72);
        boolean boolean74 = mutableDateTime65.isBefore((org.joda.time.ReadableInstant) mutableDateTime70);
        mutableDateTime70.setMillisOfDay(17);
        mutableDateTime70.addYears(8607001);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime66 and instant68", (mutableDateTime66.compareTo(instant68) == 0) == mutableDateTime66.equals(instant68));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(readableDuration2, (org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.ReadableInterval readableInterval5 = null;
        mutablePeriod4.setPeriod(readableInterval5);
        org.joda.time.DurationFieldType[] durationFieldTypeArray7 = mutablePeriod4.getFieldTypes();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.forFields(durationFieldTypeArray7);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.forFields(durationFieldTypeArray7);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone12);
        org.joda.time.DateTime dateTime14 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        org.joda.time.DateTime dateTime17 = dateTime14.withYear((int) (short) -1);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.withChronologyRetainFields(chronology21);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = timeOfDay22.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay22.plusHours((-1));
        org.joda.time.Chronology chronology26 = timeOfDay25.getChronology();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.TimeOfDay timeOfDay29 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay29.withChronologyRetainFields(chronology30);
        long long33 = chronology26.set((org.joda.time.ReadablePartial) timeOfDay29, (long) (byte) -1);
        org.joda.time.DateTimeField dateTimeField34 = chronology26.millisOfSecond();
        org.joda.time.DurationField durationField35 = chronology26.years();
        org.joda.time.DateTime dateTime36 = dateTime14.withChronology(chronology26);
        org.joda.time.Period period37 = new org.joda.time.Period(0L, 714L, periodType9, chronology26);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime38", (mutableDateTime3.compareTo(dateTime38) == 0) == mutableDateTime3.equals(dateTime38));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        boolean boolean5 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime4);
        mutableDateTime0.addMonths(69);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 52, 799L);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) mutablePeriod10);
        mutablePeriod10.setMinutes(905);
        mutablePeriod10.setYears(53489623);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime4", (instant2.compareTo(mutableDateTime4) == 0) == instant2.equals(mutableDateTime4));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        org.joda.time.YearMonthDay yearMonthDay5 = property3.addToCopy(0);
        org.joda.time.Chronology chronology6 = yearMonthDay5.getChronology();
        org.joda.time.Interval interval7 = yearMonthDay5.toInterval();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime11 = yearMonthDay8.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval12 = yearMonthDay8.toInterval();
        org.joda.time.Period period13 = interval12.toPeriod();
        org.joda.time.Interval interval14 = interval12.toInterval();
        org.joda.time.MutableInterval mutableInterval15 = interval12.toMutableInterval();
        org.joda.time.Period period16 = interval12.toPeriod();
        org.joda.time.MutableInterval mutableInterval17 = interval12.toMutableInterval();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay18.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime21 = yearMonthDay18.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval22 = yearMonthDay18.toInterval();
        org.joda.time.Period period23 = interval22.toPeriod();
        org.joda.time.Interval interval24 = interval22.toInterval();
        boolean boolean25 = mutableInterval17.isAfter((org.joda.time.ReadableInterval) interval24);
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet27 = locale26.getExtensionKeys();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone30);
        org.joda.time.DateTime dateTime32 = dateTime31.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        org.joda.time.DateTime.Property property34 = dateTime32.year();
        org.joda.time.DateTime dateTime36 = dateTime32.withYear(1970);
        boolean boolean37 = charSet27.equals((java.lang.Object) dateTime36);
        boolean boolean38 = interval24.isBefore((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime();
        int int40 = mutableDateTime39.getDayOfMonth();
        org.joda.time.Instant instant41 = mutableDateTime39.toInstant();
        boolean boolean43 = mutableDateTime39.isBefore((long) 2);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.monthOfYear();
        boolean boolean46 = mutableDateTime39.isBefore(909L);
        org.joda.time.Interval interval47 = interval24.withEnd((org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(chronology48);
        org.joda.time.DateMidnight.Property property50 = dateMidnight49.dayOfYear();
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight49.withDurationAdded((long) 17, 1);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight49.plus((long) 1);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight49.withMillis(837L);
        org.joda.time.DateTime dateTime58 = dateMidnight57.toDateTime();
        boolean boolean59 = mutableDateTime39.isAfter((org.joda.time.ReadableInstant) dateMidnight57);
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime39.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean63 = dateTimeZone62.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone62);
        java.lang.String str65 = dateTimeZone62.getID();
        org.joda.time.MutableDateTime mutableDateTime66 = mutableDateTime60.toMutableDateTime(dateTimeZone62);
        boolean boolean67 = interval7.isBefore((org.joda.time.ReadableInstant) mutableDateTime60);
        java.lang.Object obj68 = mutableDateTime60.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant41", (dateTime11.compareTo(instant41) == 0) == dateTime11.equals(instant41));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(328L);
        org.joda.time.Instant instant4 = instant2.withMillis(376L);
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay5.year();
        org.joda.time.YearMonthDay yearMonthDay10 = property8.addToCopy(0);
        org.joda.time.YearMonthDay yearMonthDay12 = property8.setCopy(2023);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate.Property property15 = localDate14.era();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDate14.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight21 = yearMonthDay12.toDateMidnight(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime22 = instant4.toMutableDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (short) -1, chronology24);
        int int26 = localDate25.getYearOfCentury();
        org.joda.time.LocalDate.Property property27 = localDate25.centuryOfEra();
        org.joda.time.LocalDate localDate28 = property27.roundFloorCopy();
        org.joda.time.LocalDate localDate29 = property27.roundCeilingCopy();
        org.joda.time.LocalDate localDate31 = localDate29.minusWeeks(1975);
        org.joda.time.LocalDate localDate33 = localDate29.withYearOfEra(99);
        org.joda.time.Period period36 = new org.joda.time.Period((long) (byte) 0, 0L);
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period38 = period36.withPeriodType(periodType37);
        org.joda.time.Period period40 = period36.withDays((int) (short) 100);
        org.joda.time.Period period41 = period36.negated();
        org.joda.time.Period period43 = period36.withMinutes(9);
        org.joda.time.Period period45 = period36.withHours(117);
        org.joda.time.Period period47 = period36.plusHours((-1970));
        org.joda.time.Period period49 = period47.plusSeconds(17);
        org.joda.time.LocalDate localDate50 = localDate33.plus((org.joda.time.ReadablePeriod) period47);
        mutableDateTime22.add((org.joda.time.ReadablePeriod) period47, 910);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime18", (instant0.compareTo(mutableDateTime18) == 0) == instant0.equals(mutableDateTime18));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.standard();
        java.lang.String str2 = periodType1.getName();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod5.copy();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay13.plusHours((-1));
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        mutablePeriod5.setPeriod((long) (byte) 1, 845L, chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.dayOfYear();
        org.joda.time.DurationField durationField20 = chronology17.weekyears();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(603L, periodType1, chronology17);
        java.lang.String str23 = chronology17.toString();
        org.joda.time.DurationField durationField24 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField20, and durationField21", !(durationField24.compareTo(durationField20) == 0) || (Math.signum(durationField24.compareTo(durationField21)) == Math.signum(durationField20.compareTo(durationField21))));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.addWrapField(6);
        mutableDateTime8.addDays((int) (byte) -1);
        int int11 = mutableDateTime8.getYear();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.Instant instant13 = dateTime12.toInstant();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime8, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime8.copy();
        mutableDateTime15.add((long) 1970);
        int int18 = mutableDateTime15.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(67);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime15.toMutableDateTime(dateTimeZone20);
        long long24 = dateTimeZone20.adjustOffset(2592000000L, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and mutableDateTime21", (mutableDateTime15.compareTo(mutableDateTime21) == 0) == mutableDateTime15.equals(mutableDateTime21));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        long long21 = chronology14.set((org.joda.time.ReadablePartial) timeOfDay17, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(chronology14);
        org.joda.time.DateTime dateTime23 = dateTime4.toDateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField24 = chronology14.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = chronology14.monthOfYear();
        org.joda.time.Period period27 = org.joda.time.Period.weeks((int) (byte) 10);
        org.joda.time.Period period29 = period27.minusMonths(2);
        org.joda.time.Period period31 = new org.joda.time.Period((long) 'u');
        org.joda.time.Period period32 = period27.minus((org.joda.time.ReadablePeriod) period31);
        long long35 = chronology14.add((org.joda.time.ReadablePeriod) period27, 675L, 687);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(20, 53);
        org.joda.time.Chronology chronology39 = chronology14.withZone(dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.tz.NameProvider nameProvider42 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone45);
        org.joda.time.DateTime dateTime47 = dateTime46.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime47.toMutableDateTime();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.TimeOfDay timeOfDay51 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay51.withChronologyRetainFields(chronology52);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray54 = timeOfDay53.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay53.plusHours((-1));
        org.joda.time.Chronology chronology57 = timeOfDay56.getChronology();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.TimeOfDay timeOfDay60 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.TimeOfDay timeOfDay62 = timeOfDay60.withChronologyRetainFields(chronology61);
        long long64 = chronology57.set((org.joda.time.ReadablePartial) timeOfDay60, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay65 = new org.joda.time.TimeOfDay(chronology57);
        org.joda.time.DateTime dateTime66 = dateTime47.toDateTime(chronology57);
        org.joda.time.DateTimeField dateTimeField67 = chronology57.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField68 = chronology57.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int73 = dateTimeZone71.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime74 = org.joda.time.MutableDateTime.now(dateTimeZone71);
        java.util.Locale locale76 = java.util.Locale.PRC;
        java.lang.String str77 = locale76.getDisplayScript();
        java.lang.String str78 = dateTimeZone71.getName(845L, locale76);
        org.joda.time.LocalTime localTime80 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property81 = localTime80.millisOfDay();
        org.joda.time.LocalTime localTime83 = property81.addNoWrapToCopy(11);
        java.lang.String str84 = property81.getAsShortText();
        java.util.Locale locale85 = java.util.Locale.PRC;
        java.lang.String str86 = property81.getAsText(locale85);
        java.lang.String str87 = locale76.getDisplayScript(locale85);
        java.lang.String str88 = dateTimeField68.getAsShortText((int) (short) 0, locale85);
        java.lang.String str91 = nameProvider42.getName(locale85, "1969-12-31", "2022-02-21T14:49:39.884");
        java.lang.String str92 = dateTimeZone38.getShortName(470L, locale85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime40 and mutableDateTime74", (mutableDateTime40.compareTo(mutableDateTime74) == 0) == mutableDateTime40.equals(mutableDateTime74));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        long long21 = chronology14.set((org.joda.time.ReadablePartial) timeOfDay17, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(chronology14);
        org.joda.time.DateTime dateTime23 = dateTime4.toDateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField24 = chronology14.yearOfCentury();
        org.joda.time.DurationField durationField25 = chronology14.centuries();
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(chronology14);
        org.joda.time.DateTimeField dateTimeField27 = chronology14.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField28 = chronology14.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(chronology14);
        org.joda.time.DurationField durationField30 = chronology14.millis();
        org.joda.time.DurationField durationField31 = chronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField25, and durationField30", !(durationField31.compareTo(durationField25) == 0) || (Math.signum(durationField31.compareTo(durationField30)) == Math.signum(durationField25.compareTo(durationField30))));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableDuration4, (org.joda.time.ReadableInstant) mutableDateTime5);
        int[] intArray8 = chronology3.get((org.joda.time.ReadablePeriod) mutablePeriod6, (long) 100);
        java.util.Calendar.Builder builder9 = builder0.setFields(intArray8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone12);
        org.joda.time.DateTime dateTime14 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.year();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.lang.String str19 = locale18.getDisplayScript();
        java.util.Locale.setDefault(locale18);
        java.lang.String str21 = locale18.getISO3Language();
        java.util.Locale locale22 = java.util.Locale.ENGLISH;
        java.lang.String str23 = locale18.getDisplayScript(locale22);
        int int24 = dateTimeField17.getMaximumShortTextLength(locale22);
        java.util.Calendar.Builder builder25 = builder0.setLocale(locale22);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        java.util.Calendar.Builder builder28 = builder0.setTimeZone(timeZone27);
        boolean boolean29 = timeZone27.observesDaylightTime();
        java.util.Locale locale30 = java.util.Locale.CHINA;
        java.util.Locale locale31 = locale30.stripExtensions();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int35 = dateTimeZone33.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(dateTimeZone33);
        java.util.Locale locale38 = java.util.Locale.PRC;
        java.lang.String str39 = locale38.getDisplayScript();
        java.lang.String str40 = dateTimeZone33.getName(845L, locale38);
        java.lang.String str41 = locale38.getLanguage();
        java.lang.String str42 = locale31.getDisplayName(locale38);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(locale31);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone27, locale31);
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay47 = yearMonthDay45.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay.Property property48 = yearMonthDay45.year();
        org.joda.time.YearMonthDay yearMonthDay50 = property48.addToCopy(0);
        org.joda.time.YearMonthDay yearMonthDay52 = property48.setCopy((int) 'u');
        int int53 = property48.get();
        boolean boolean55 = property48.equals((java.lang.Object) 1967);
        org.joda.time.DurationField durationField56 = property48.getDurationField();
        java.util.Locale locale57 = java.util.Locale.CHINA;
        java.util.Locale locale58 = locale57.stripExtensions();
        java.lang.String str60 = locale57.getExtension('a');
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(locale57);
        java.lang.String str62 = locale57.getVariant();
        java.lang.String str63 = property48.getAsShortText(locale57);
        java.lang.String str64 = timeZone27.getDisplayName(locale57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar44", (calendar43.compareTo(calendar44) == 0) == calendar43.equals(calendar44));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        long long21 = chronology14.set((org.joda.time.ReadablePartial) timeOfDay17, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(chronology14);
        org.joda.time.DateTime dateTime23 = dateTime4.toDateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField24 = chronology14.yearOfCentury();
        org.joda.time.DurationField durationField25 = chronology14.centuries();
        org.joda.time.DateTimeField dateTimeField26 = chronology14.dayOfYear();
        org.joda.time.DurationField durationField27 = chronology14.eras();
        org.joda.time.DurationField durationField28 = chronology14.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField25 and durationField27", Math.signum(durationField25.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField25)));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(11, (int) ' ');
        java.util.Date date9 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        date9.setMonth(0);
        calendar0.setTime(date9);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance();
        calendar13.setTimeInMillis(845L);
        java.util.TimeZone timeZone16 = null;
        calendar13.setTimeZone(timeZone16);
        int int19 = calendar13.getGreatestMinimum(9);
        java.util.TimeZone timeZone21 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        calendar13.setTimeZone(timeZone21);
        java.util.Date date28 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        java.lang.String str29 = date28.toLocaleString();
        java.lang.String str30 = date28.toLocaleString();
        calendar13.setTime(date28);
        calendar0.setTime(date28);
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.fromCalendarFields(calendar0);
        int int34 = timeOfDay33.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar13", (calendar0.compareTo(calendar13) == 0) == calendar0.equals(calendar13));
    }
}

