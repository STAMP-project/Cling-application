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
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        boolean boolean11 = mutableDateTime4.isBefore((org.joda.time.ReadableInstant) dateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant2", (mutableDateTime0.compareTo(instant2) == 0) == mutableDateTime0.equals(instant2));
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
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant2", (mutableDateTime0.compareTo(instant2) == 0) == mutableDateTime0.equals(instant2));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        org.joda.time.DateTimeField dateTimeField24 = chronology14.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and dateMidnight23", (dateMidnight1.compareTo(dateMidnight23) == 0) == dateMidnight1.equals(dateMidnight23));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property8 = localTime7.millisOfDay();
        org.joda.time.LocalTime localTime10 = property8.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime11 = property8.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property12 = localTime11.minuteOfHour();
        org.joda.time.Period period13 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime5, (org.joda.time.ReadablePartial) localTime11);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        int int15 = mutableDateTime14.getDayOfMonth();
        org.joda.time.Instant instant16 = mutableDateTime14.toInstant();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        boolean boolean19 = mutableDateTime14.isBefore((org.joda.time.ReadableInstant) mutableDateTime18);
        boolean boolean20 = period13.equals((java.lang.Object) mutableDateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant16", (mutableDateTime14.compareTo(instant16) == 0) == mutableDateTime14.equals(instant16));
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
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant2", (mutableDateTime0.compareTo(instant2) == 0) == mutableDateTime0.equals(instant2));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(readableDuration3, (org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.ReadableInterval readableInterval6 = null;
        mutablePeriod5.setPeriod(readableInterval6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        int int9 = mutableDateTime8.getDayOfMonth();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int15 = localDate11.get(dateTimeFieldType14);
        mutableDateTime8.set(dateTimeFieldType14, 2);
        org.joda.time.Duration duration18 = mutablePeriod5.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime8);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration18, 32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime4", (instant2.compareTo(mutableDateTime4) == 0) == instant2.equals(mutableDateTime4));
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
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusWeeks((int) (byte) 0);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusMonths((int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and dateMidnight25", (dateMidnight1.compareTo(dateMidnight25) == 0) == dateMidnight1.equals(dateMidnight25));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withWeekyear((-1));
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        int int12 = mutableDateTime11.getDayOfMonth();
        org.joda.time.Instant instant13 = mutableDateTime11.toInstant();
        org.joda.time.Instant instant15 = instant13.plus((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        int int17 = mutableDateTime16.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone20);
        org.joda.time.DateTime dateTime22 = dateTime21.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType24 = periodType23.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime16, (org.joda.time.ReadableInstant) dateTime21, periodType24);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod29 = mutablePeriod28.copy();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(chronology30);
        org.joda.time.DateMidnight.Property property32 = dateMidnight31.yearOfCentury();
        org.joda.time.Duration duration33 = mutablePeriod29.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight31);
        mutablePeriod25.setPeriod((org.joda.time.ReadableDuration) duration33);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant13, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime10.minus((org.joda.time.ReadableDuration) duration33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant13", (mutableDateTime11.compareTo(instant13) == 0) == mutableDateTime11.equals(instant13));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        org.joda.time.DateTimeField dateTimeField24 = chronology14.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and dateMidnight23", (dateMidnight1.compareTo(dateMidnight23) == 0) == dateMidnight1.equals(dateMidnight23));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusWeeks((int) (byte) 0);
        int int26 = dateMidnight23.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and dateMidnight23", (dateMidnight1.compareTo(dateMidnight23) == 0) == dateMidnight1.equals(dateMidnight23));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int8 = dateTimeZone6.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime0.setZone(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        int int11 = mutableDateTime10.getDayOfMonth();
        org.joda.time.Instant instant12 = mutableDateTime10.toInstant();
        boolean boolean14 = mutableDateTime10.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int18 = dateTimeZone16.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime10.setZone(dateTimeZone16);
        long long21 = dateTimeZone16.previousTransition((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime0.toMutableDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime();
        int int26 = mutableDateTime25.getDayOfMonth();
        org.joda.time.Instant instant27 = mutableDateTime25.toInstant();
        int int28 = dateTimeZone24.getOffset((org.joda.time.ReadableInstant) instant27);
        mutableDateTime0.setZone(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime25", (instant2.compareTo(mutableDateTime25) == 0) == instant2.equals(mutableDateTime25));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((-2678400000L));
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.withChronologyRetainFields(chronology13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = timeOfDay14.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.plusHours((-1));
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.withChronologyRetainFields(chronology22);
        long long25 = chronology18.set((org.joda.time.ReadablePartial) timeOfDay21, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(chronology18);
        org.joda.time.DateTime dateTime27 = dateTime8.toDateTime(chronology18);
        org.joda.time.DateTimeField dateTimeField28 = chronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = chronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = chronology18.year();
        org.joda.time.TimeOfDay timeOfDay31 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 5, chronology18);
        org.joda.time.DurationField durationField32 = chronology18.millis();
        org.joda.time.DurationField durationField33 = chronology18.eras();
        mutablePeriod1.add((long) 117, chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField32 and durationField33", Math.signum(durationField32.compareTo(durationField33)) == -Math.signum(durationField33.compareTo(durationField32)));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int3 = dateTimeZone1.getOffset(0L);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone1);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone6);
        timeZone6.setRawOffset(4);
        int int10 = timeZone6.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth13 = new org.joda.time.YearMonth(dateTimeZone12);
        int int14 = yearMonth13.getYear();
        org.joda.time.YearMonth yearMonth16 = yearMonth13.plusYears(365);
        java.util.Locale locale18 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleAttributes();
        java.lang.String str20 = yearMonth13.toString("+00:00", locale18);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone6, locale18);
        java.lang.String str22 = dateTimeZone1.getShortName((long) 2023, locale18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar7 and calendar21", (calendar7.compareTo(calendar21) == 0) == calendar7.equals(calendar21));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateTime5, periodType8);
        org.joda.time.LocalDateTime localDateTime10 = dateTime5.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYearOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withDayOfYear(3);
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDateTime12.toDateTime(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and dateTime18", (mutableDateTime0.compareTo(dateTime18) == 0) == mutableDateTime0.equals(dateTime18));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        org.joda.time.DateTimeField dateTimeField26 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = chronology15.year();
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 5, chronology15);
        org.joda.time.DurationField durationField29 = chronology15.millis();
        org.joda.time.DurationField durationField30 = chronology15.eras();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField29 and durationField30", Math.signum(durationField29.compareTo(durationField30)) == -Math.signum(durationField30.compareTo(durationField29)));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.DateTime dateTime7 = dateTime4.minusYears(100);
        org.joda.time.DateTime.Property property8 = dateTime4.dayOfMonth();
        org.joda.time.DateTime dateTime9 = property8.roundHalfFloorCopy();
        int int10 = dateTime9.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(32772);
        org.joda.time.DateTime dateTime13 = dateTime9.withZone(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime13", (dateTime4.compareTo(dateTime13) == 0) == dateTime4.equals(dateTime13));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(timeZone0);
        timeZone0.setRawOffset(4);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance();
        calendar4.clear();
        org.joda.time.YearMonth yearMonth6 = org.joda.time.YearMonth.fromCalendarFields(calendar4);
        java.util.TimeZone timeZone7 = calendar4.getTimeZone();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getDefault();
        java.lang.String str9 = timeZone8.getID();
        boolean boolean10 = timeZone7.hasSameRules(timeZone8);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone7);
        boolean boolean12 = timeZone0.hasSameRules(timeZone7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar11", (calendar1.compareTo(calendar11) == 0) == calendar1.equals(calendar11));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.DateTime dateTime7 = dateTime4.minusYears(100);
        org.joda.time.DateTime.Property property8 = dateTime4.dayOfMonth();
        org.joda.time.DateTime dateTime9 = property8.roundHalfFloorCopy();
        int int10 = dateTime9.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(32772);
        org.joda.time.DateTime dateTime13 = dateTime9.withZone(dateTimeZone12);
        org.joda.time.DateTime.Property property14 = dateTime9.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime13", (dateTime9.compareTo(dateTime13) == 0) == dateTime9.equals(dateTime13));
    }
}

