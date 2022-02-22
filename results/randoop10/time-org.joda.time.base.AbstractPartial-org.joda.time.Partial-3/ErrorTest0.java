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
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        long long12 = dateTimeZone9.previousTransition((long) 20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime6.setZone(dateTimeZone9);
        long long12 = dateTimeZone9.convertUTCToLocal(1000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime6", (dateTime3.compareTo(mutableDateTime6) == 0) == dateTime3.equals(mutableDateTime6));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        int int8 = mutableDateTime6.getHourOfDay();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay10.toDateTime(timeOfDay11);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay10.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay14.monthOfYear();
        int int16 = property15.getMaximumValueOverall();
        org.joda.time.DateTimeField dateTimeField17 = property15.getField();
        mutableDateTime6.setRounding(dateTimeField17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime6.copy();
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        mutableDateTime19.setTime(978307200035L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant20", (mutableDateTime6.compareTo(instant20) == 0) == mutableDateTime6.equals(instant20));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded((long) 30, 1);
        org.joda.time.DateTime.Property property10 = dateTime3.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology13 = yearMonthDay12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long18 = dateTimeZone16.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone16);
        org.joda.time.Chronology chronology21 = chronology13.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology22 = chronology21.withUTC();
        org.joda.time.DateTime dateTime23 = dateTime3.withChronology(chronology21);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DateTime.Property property25 = dateTime3.property(dateTimeFieldType24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime23", (dateTime3.compareTo(dateTime23) == 0) == dateTime3.equals(dateTime23));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay5.monthOfYear();
        int int7 = property6.getMaximumValueOverall();
        int int8 = property6.getMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay10.toDateTime(timeOfDay11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime12.toMutableDateTime();
        org.joda.time.DateTime dateTime16 = dateTime12.withEarlierOffsetAtOverlap();
        int int17 = property6.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime19 = dateTime12.minusMinutes((int) '#');
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long24 = dateTimeZone22.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime28 = dateTime12.withZone(dateTimeZone22);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadablePartial) yearMonthDay30, (org.joda.time.ReadablePartial) yearMonthDay32);
        org.joda.time.Period period34 = period33.toPeriod();
        int int35 = period34.getSeconds();
        org.joda.time.DateTime dateTime36 = dateTime12.plus((org.joda.time.ReadablePeriod) period34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime28", (dateTime3.compareTo(dateTime28) == 0) == dateTime3.equals(dateTime28));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.Instant instant3 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant5 = instant3.withMillis(0L);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long11 = dateTimeZone9.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusWeeks((int) 'u');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableDuration17);
        org.joda.time.MutablePeriod mutablePeriod19 = period18.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight24.plusMonths(0);
        org.joda.time.Duration duration29 = period18.toDurationTo((org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight15.minus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Instant instant31 = instant5.plus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.MutableDateTime mutableDateTime32 = instant5.toMutableDateTime();
        org.joda.time.Period period37 = new org.joda.time.Period((int) (short) -1, 182, (int) (short) 100, (int) (byte) -1);
        org.joda.time.Minutes minutes38 = period37.toStandardMinutes();
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay41 = null;
        org.joda.time.DateTime dateTime42 = yearMonthDay40.toDateTime(timeOfDay41);
        org.joda.time.DateTime dateTime43 = yearMonthDay40.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.minus(readableDuration44);
        org.joda.time.DateTime dateTime47 = dateTime43.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime49 = dateTime43.withMillis((long) 'a');
        int int50 = dateTime43.getYear();
        org.joda.time.Duration duration51 = period37.toDurationFrom((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.seconds();
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime32, (org.joda.time.ReadableDuration) duration51, periodType52);
        org.joda.time.Period period54 = new org.joda.time.Period((long) ' ', 86399L, periodType52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime32", (instant3.compareTo(mutableDateTime32) == 0) == instant3.equals(mutableDateTime32));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long7 = dateTimeZone5.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.withField(dateTimeFieldType9, (int) '4');
        org.joda.time.LocalDate localDate12 = dateMidnight11.toLocalDate();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableDuration14);
        org.joda.time.MutablePeriod mutablePeriod16 = period15.toMutablePeriod();
        java.lang.Object obj17 = mutablePeriod16.clone();
        org.joda.time.LocalDate localDate19 = localDate12.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod16, (int) (byte) 1);
        org.joda.time.LocalDate.Property property20 = localDate12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = localDate12.getField((int) (short) 0);
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay24.toDateTime(timeOfDay25);
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay24.minusDays((int) (byte) 1);
        int int29 = dateTimeField22.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay28);
        boolean boolean30 = instant1.equals((java.lang.Object) int29);
        org.joda.time.Instant instant32 = instant1.withMillis((long) 3);
        org.joda.time.DateTime dateTime33 = instant1.toDateTime();
        org.joda.time.Instant instant35 = instant1.plus((long) 550);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime33", (instant1.compareTo(dateTime33) == 0) == instant1.equals(dateTime33));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        java.lang.Object obj4 = mutablePeriod3.clone();
        org.joda.time.MutablePeriod mutablePeriod5 = mutablePeriod3.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        mutablePeriod3.setPeriod(readableDuration6, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 31, dateTimeZone12);
        org.joda.time.Chronology chronology17 = chronology8.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DurationField durationField19 = chronology17.eras();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.now(chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField19", Math.signum(durationField18.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField18)));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay3.toDateTime(timeOfDay4);
        org.joda.time.DateTime dateTime6 = yearMonthDay3.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readableDuration7);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTime dateTime13 = dateTime6.withZone(dateTimeZone11);
        int int14 = dateTime6.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime13", (dateTime6.compareTo(dateTime13) == 0) == dateTime6.equals(dateTime13));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) -1, periodType1, chronology2);
        org.joda.time.MutablePeriod mutablePeriod4 = mutablePeriod3.toMutablePeriod();
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTime dateTime8 = yearMonthDay6.toDateTime(timeOfDay7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime8.toMutableDateTime();
        java.lang.Object obj12 = mutableDateTime11.clone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime11.setZone(dateTimeZone14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.secondOfDay();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableDuration18);
        org.joda.time.MutablePeriod mutablePeriod20 = period19.toMutablePeriod();
        java.lang.Object obj21 = mutablePeriod20.clone();
        mutablePeriod20.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay26 = null;
        org.joda.time.DateTime dateTime27 = yearMonthDay25.toDateTime(timeOfDay26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime27.toMutableDateTime();
        org.joda.time.DateTime dateTime31 = dateTime27.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration32 = mutablePeriod20.toDurationTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Duration duration33 = duration32.toDuration();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long37 = dateTimeZone35.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(dateTimeZone35);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight38.withField(dateTimeFieldType39, (int) '4');
        org.joda.time.LocalDate localDate42 = dateMidnight41.toLocalDate();
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant43, readableDuration44);
        org.joda.time.MutablePeriod mutablePeriod46 = period45.toMutablePeriod();
        java.lang.Object obj47 = mutablePeriod46.clone();
        org.joda.time.LocalDate localDate49 = localDate42.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod46, (int) (byte) 1);
        org.joda.time.LocalDate localDate51 = localDate42.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate53 = localDate42.minusDays((int) (short) 10);
        boolean boolean54 = duration32.equals((java.lang.Object) localDate42);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime11, (org.joda.time.ReadableDuration) duration32, periodType55);
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime11", (dateTime8.compareTo(mutableDateTime11) == 0) == dateTime8.equals(mutableDateTime11));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long12 = dateTimeZone10.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.minusDays((int) 'u');
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateMidnight13);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight13.plusMonths(167);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        int int25 = dateTimeZone21.getStandardOffset((long) (byte) 100);
        int int27 = dateTimeZone21.getStandardOffset((long) 1);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone21);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTime dateTime32 = yearMonthDay30.toDateTime(timeOfDay31);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime32.toMutableDateTime();
        java.lang.Object obj36 = mutableDateTime35.clone();
        org.joda.time.Chronology chronology37 = mutableDateTime35.getChronology();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long41 = dateTimeZone39.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(dateTimeZone39);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) 'u');
        mutableDateTime35.setMillis((org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay48 = null;
        org.joda.time.DateTime dateTime49 = yearMonthDay47.toDateTime(timeOfDay48);
        org.joda.time.DateTime dateTime51 = dateTime49.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime49.toMutableDateTime();
        java.lang.Object obj53 = mutableDateTime52.clone();
        int int54 = mutableDateTime52.getHourOfDay();
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant55, readableDuration56);
        org.joda.time.MutablePeriod mutablePeriod58 = period57.toMutablePeriod();
        java.lang.Object obj59 = mutablePeriod58.clone();
        mutablePeriod58.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay63 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay64 = null;
        org.joda.time.DateTime dateTime65 = yearMonthDay63.toDateTime(timeOfDay64);
        org.joda.time.DateTime dateTime67 = dateTime65.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime68 = dateTime65.toMutableDateTime();
        org.joda.time.DateTime dateTime69 = dateTime65.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration70 = mutablePeriod58.toDurationTo((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.Duration duration71 = duration70.toDuration();
        mutableDateTime52.add((org.joda.time.ReadableDuration) duration70);
        mutableDateTime35.add((org.joda.time.ReadableDuration) duration70, (int) (byte) 1);
        org.joda.time.YearMonthDay yearMonthDay76 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay77 = null;
        org.joda.time.DateTime dateTime78 = yearMonthDay76.toDateTime(timeOfDay77);
        org.joda.time.DateTime dateTime80 = dateTime78.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime81 = dateTime78.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime81.minuteOfHour();
        mutableDateTime81.setMillisOfSecond((int) (byte) 10);
        mutableDateTime81.setYear(4);
        org.joda.time.Period period87 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration70, (org.joda.time.ReadableInstant) mutableDateTime81);
        org.joda.time.Period period88 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight28, (org.joda.time.ReadableDuration) duration70);
        org.joda.time.DateMidnight dateMidnight89 = dateMidnight18.plus((org.joda.time.ReadablePeriod) period88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and dateMidnight13", (mutableDateTime6.compareTo(dateMidnight13) == 0) == mutableDateTime6.equals(dateMidnight13));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded((long) 30, 1);
        org.joda.time.DateTime.Property property10 = dateTime3.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology13 = yearMonthDay12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long18 = dateTimeZone16.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone16);
        org.joda.time.Chronology chronology21 = chronology13.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology22 = chronology21.withUTC();
        org.joda.time.DateTime dateTime23 = dateTime3.withChronology(chronology21);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay26 = null;
        org.joda.time.DateTime dateTime27 = yearMonthDay25.toDateTime(timeOfDay26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime27.toMutableDateTime();
        java.lang.Object obj31 = mutableDateTime30.clone();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime30.setZone(dateTimeZone33);
        java.lang.String str35 = mutableDateTime30.toString();
        mutableDateTime30.add((long) 259);
        org.joda.time.DateTime dateTime38 = mutableDateTime30.toDateTimeISO();
        int int39 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime23", (dateTime3.compareTo(dateTime23) == 0) == dateTime3.equals(dateTime23));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 1);
        int int10 = dateTime3.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime15.toMutableDateTime();
        java.lang.Object obj19 = mutableDateTime18.clone();
        org.joda.time.Chronology chronology20 = mutableDateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.era();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType11.getField(chronology20);
        org.joda.time.DateTime dateTime24 = dateTime3.withField(dateTimeFieldType11, 59);
        org.joda.time.YearMonthDay yearMonthDay25 = dateTime24.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay29.toDateTime(timeOfDay30);
        org.joda.time.DateTime dateTime32 = yearMonthDay29.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.minus(readableDuration33);
        mutableDateTime27.setTime((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        org.joda.time.DateTime dateTime39 = dateTime32.withZone(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = yearMonthDay25.toDateTimeAtCurrentTime(dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime39", (dateTime32.compareTo(dateTime39) == 0) == dateTime32.equals(dateTime39));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plusWeeks((int) 'u');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableDuration15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long21 = dateTimeZone19.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight22.plusMonths(0);
        org.joda.time.Duration duration27 = period16.toDurationTo((org.joda.time.ReadableInstant) dateMidnight26);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight13.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Instant instant29 = instant3.plus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.MutableDateTime mutableDateTime30 = instant3.toMutableDateTime();
        org.joda.time.Period period35 = new org.joda.time.Period((int) (short) -1, 182, (int) (short) 100, (int) (byte) -1);
        org.joda.time.Minutes minutes36 = period35.toStandardMinutes();
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay39 = null;
        org.joda.time.DateTime dateTime40 = yearMonthDay38.toDateTime(timeOfDay39);
        org.joda.time.DateTime dateTime41 = yearMonthDay38.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime43 = dateTime41.minus(readableDuration42);
        org.joda.time.DateTime dateTime45 = dateTime41.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime47 = dateTime41.withMillis((long) 'a');
        int int48 = dateTime41.getYear();
        org.joda.time.Duration duration49 = period35.toDurationFrom((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.seconds();
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime30, (org.joda.time.ReadableDuration) duration49, periodType50);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay54 = null;
        org.joda.time.DateTime dateTime55 = yearMonthDay53.toDateTime(timeOfDay54);
        org.joda.time.DateTime dateTime57 = dateTime55.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime55.toMutableDateTime();
        java.lang.Object obj59 = mutableDateTime58.clone();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime58.setZone(dateTimeZone61);
        mutableDateTime58.add((long) 20);
        mutableDateTime58.addDays(571);
        org.joda.time.Period period67 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration49, (org.joda.time.ReadableInstant) mutableDateTime58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime30", (instant1.compareTo(mutableDateTime30) == 0) == instant1.equals(mutableDateTime30));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = dateTime3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withDurationAdded(readableDuration6, (int) 'u');
        int int9 = dateTime5.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long13 = dateTimeZone11.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime5.toMutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long19 = dateTimeZone17.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(dateTimeZone17);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight20.withField(dateTimeFieldType21, (int) '4');
        org.joda.time.LocalDate localDate24 = dateMidnight23.toLocalDate();
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableDuration26);
        org.joda.time.MutablePeriod mutablePeriod28 = period27.toMutablePeriod();
        java.lang.Object obj29 = mutablePeriod28.clone();
        org.joda.time.LocalDate localDate31 = localDate24.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod28, (int) (byte) 1);
        org.joda.time.LocalDate localDate33 = localDate24.withYearOfEra(59);
        org.joda.time.DateTime dateTime34 = localDate24.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate36 = localDate24.minusYears(0);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay40 = null;
        org.joda.time.DateTime dateTime41 = yearMonthDay39.toDateTime(timeOfDay40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime41.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField45 = null;
        mutableDateTime44.setRounding(dateTimeField45, (int) '#');
        mutableDateTime44.setMillis((long) 'u');
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long54 = dateTimeZone52.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight(dateTimeZone52);
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone52);
        mutableDateTime44.setZoneRetainFields(dateTimeZone52);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) 993, dateTimeZone52);
        org.joda.time.DateTime dateTime59 = localDate36.toDateTimeAtMidnight(dateTimeZone52);
        org.joda.time.DateTime dateTime60 = dateTime5.withZone(dateTimeZone52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime15", (dateTime5.compareTo(mutableDateTime15) == 0) == dateTime5.equals(mutableDateTime15));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekyear((int) 'u');
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfDay();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableDuration14);
        org.joda.time.MutablePeriod mutablePeriod16 = period15.toMutablePeriod();
        org.joda.time.Period period18 = period15.plusHours((int) 'a');
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Period period20 = period18.negated();
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DurationField durationField23 = durationFieldType21.getField(chronology22);
        boolean boolean24 = period18.isSupported(durationFieldType21);
        mutableDateTime12.add((org.joda.time.ReadablePeriod) period18);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight27 = org.joda.time.DateMidnight.now(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long31 = dateTimeZone29.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(dateTimeZone29);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight32.withField(dateTimeFieldType33, (int) '4');
        boolean boolean36 = dateMidnight27.isBefore((org.joda.time.ReadableInstant) dateMidnight35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        boolean boolean38 = dateMidnight27.isEqual(readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant39, readableDuration40);
        org.joda.time.MutablePeriod mutablePeriod42 = period41.toMutablePeriod();
        java.lang.Object obj43 = mutablePeriod42.clone();
        mutablePeriod42.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay48 = null;
        org.joda.time.DateTime dateTime49 = yearMonthDay47.toDateTime(timeOfDay48);
        org.joda.time.DateTime dateTime51 = dateTime49.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime49.toMutableDateTime();
        org.joda.time.DateTime dateTime53 = dateTime49.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration54 = mutablePeriod42.toDurationTo((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Duration duration55 = duration54.toDuration();
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight27.minus((org.joda.time.ReadableDuration) duration54);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration54);
        mutableDateTime12.addYears(182);
        mutableDateTime12.setTime((long) 49728473);
        org.joda.time.Instant instant62 = mutableDateTime12.toInstant();
        org.joda.time.Instant instant64 = instant62.plus((long) 182);
        int int65 = property8.compareTo((org.joda.time.ReadableInstant) instant64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant62", (mutableDateTime12.compareTo(instant62) == 0) == mutableDateTime12.equals(instant62));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableDuration2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        int int5 = mutablePeriod4.getHours();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        int int7 = mutablePeriod4.get(durationFieldType6);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) mutablePeriod4);
        mutablePeriod4.addHours((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableDuration12);
        org.joda.time.MutablePeriod mutablePeriod14 = period13.toMutablePeriod();
        mutablePeriod14.add((long) (short) 0);
        int int17 = mutablePeriod14.getSeconds();
        int int18 = mutablePeriod14.size();
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay20.toDateTime(timeOfDay21);
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay20.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long28 = dateTimeZone26.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long33 = dateTimeZone31.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone31);
        long long36 = dateTimeZone26.getMillisKeepLocal(dateTimeZone31, (long) 59);
        org.joda.time.DateMidnight dateMidnight37 = yearMonthDay24.toDateMidnight(dateTimeZone26);
        org.joda.time.DateMidnight.Property property38 = dateMidnight37.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight39 = property38.roundHalfCeilingCopy();
        org.joda.time.Interval interval40 = dateMidnight39.toInterval();
        mutablePeriod14.add((org.joda.time.ReadableInterval) interval40);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and dateTime29", (mutableDateTime0.compareTo(dateTime29) == 0) == mutableDateTime0.equals(dateTime29));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableDuration2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        java.lang.Object obj5 = mutablePeriod4.clone();
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod4.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        mutablePeriod4.setPeriod(readableDuration7, chronology9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long15 = dateTimeZone13.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) 31, dateTimeZone13);
        org.joda.time.Chronology chronology18 = chronology9.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField19 = chronology18.days();
        org.joda.time.DurationField durationField20 = chronology18.eras();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) 368, chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField20", Math.signum(durationField19.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField19)));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        java.lang.Object obj4 = mutablePeriod3.clone();
        org.joda.time.MutablePeriod mutablePeriod5 = mutablePeriod3.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        mutablePeriod3.setPeriod(readableDuration6, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 31, dateTimeZone12);
        org.joda.time.Chronology chronology17 = chronology8.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DurationField durationField19 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField19", Math.signum(durationField18.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField18)));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        int int4 = yearMonthDay1.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay1.plusDays((-292275054));
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay6.dayOfMonth();
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = yearMonthDay6.getFields();
        int int9 = yearMonthDay6.size();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long13 = dateTimeZone11.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(dateTimeZone11);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.withField(dateTimeFieldType15, (int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight14.withField(dateTimeFieldType18, (int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight14.plusMonths(0);
        org.joda.time.Period period24 = org.joda.time.Period.hours(1);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight22.minus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime26, readableDuration27, periodType28);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.weeks();
        int int31 = period29.indexOf(durationFieldType30);
        org.joda.time.Period period33 = period24.withField(durationFieldType30, 31);
        org.joda.time.Period period35 = period33.minusHours(499);
        org.joda.time.YearMonthDay yearMonthDay37 = yearMonthDay6.withPeriodAdded((org.joda.time.ReadablePeriod) period33, 23);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long41 = dateTimeZone39.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone39);
        org.joda.time.DateTime dateTime44 = dateTime42.withWeekyear((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone45 = dateTime42.getZone();
        boolean boolean46 = dateTimeZone45.isFixed();
        long long50 = dateTimeZone45.convertLocalToUTC((long) 999, false, (-82787220L));
        org.joda.time.DateMidnight dateMidnight51 = yearMonthDay37.toDateMidnight(dateTimeZone45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime42", (dateTime26.compareTo(dateTime42) == 0) == dateTime26.equals(dateTime42));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        org.joda.time.Instant instant3 = instant0.withMillis(978307200035L);
        org.joda.time.MutableDateTime mutableDateTime4 = instant0.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTime dateTime8 = yearMonthDay6.toDateTime(timeOfDay7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime8.toMutableDateTime();
        java.lang.Object obj12 = mutableDateTime11.clone();
        org.joda.time.Chronology chronology13 = mutableDateTime11.getChronology();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime11.add(readableDuration14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime11.toMutableDateTime();
        mutableDateTime17.addMinutes(12);
        mutableDateTime17.addSeconds(69);
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay23.toDateTime(timeOfDay24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime25.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime31 = dateTime25.withDurationAdded(readableDuration29, (int) (short) 1);
        int int32 = dateTime25.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime25.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay36 = null;
        org.joda.time.DateTime dateTime37 = yearMonthDay35.toDateTime(timeOfDay36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime37.toMutableDateTime();
        java.lang.Object obj41 = mutableDateTime40.clone();
        int int42 = mutableDateTime40.getHourOfDay();
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant43, readableDuration44);
        org.joda.time.MutablePeriod mutablePeriod46 = period45.toMutablePeriod();
        java.lang.Object obj47 = mutablePeriod46.clone();
        mutablePeriod46.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay51 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay52 = null;
        org.joda.time.DateTime dateTime53 = yearMonthDay51.toDateTime(timeOfDay52);
        org.joda.time.DateTime dateTime55 = dateTime53.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime56 = dateTime53.toMutableDateTime();
        org.joda.time.DateTime dateTime57 = dateTime53.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration58 = mutablePeriod46.toDurationTo((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.Duration duration59 = duration58.toDuration();
        mutableDateTime40.add((org.joda.time.ReadableDuration) duration58);
        mutableDateTime33.add((org.joda.time.ReadableDuration) duration58);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime17, (org.joda.time.ReadableDuration) duration58);
        java.lang.Throwable throwable64 = null;
        java.io.IOException iOException65 = new java.io.IOException("", throwable64);
        java.lang.Throwable[] throwableArray66 = iOException65.getSuppressed();
        java.io.IOException iOException67 = new java.io.IOException((java.lang.Throwable) iOException65);
        boolean boolean68 = duration58.equals((java.lang.Object) iOException65);
        org.joda.time.PeriodType periodType69 = org.joda.time.PeriodType.hours();
        org.joda.time.Period period70 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime4, (org.joda.time.ReadableDuration) duration58, periodType69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.minuteOfHour();
        mutableDateTime6.setMillisOfSecond((int) (byte) 10);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay11.toDateTime(timeOfDay12);
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime16 = dateTime14.plusMillis((-292275054));
        org.joda.time.YearMonthDay yearMonthDay17 = dateTime14.toYearMonthDay();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime20 = dateTime14.minusSeconds((int) (byte) 10);
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay23 = null;
        org.joda.time.DateTime dateTime24 = yearMonthDay22.toDateTime(timeOfDay23);
        org.joda.time.DateTime dateTime26 = dateTime24.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime24.toMutableDateTime();
        java.lang.Object obj28 = mutableDateTime27.clone();
        org.joda.time.Chronology chronology29 = mutableDateTime27.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.weekyears();
        org.joda.time.DateMidnight dateMidnight31 = org.joda.time.DateMidnight.now(chronology29);
        org.joda.time.DateTime dateTime32 = dateTime14.withChronology(chronology29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay37 = null;
        org.joda.time.DateTime dateTime38 = yearMonthDay36.toDateTime(timeOfDay37);
        org.joda.time.DateTime dateTime39 = yearMonthDay36.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.minus(readableDuration40);
        mutableDateTime34.setTime((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.util.TimeZone timeZone45 = dateTimeZone44.toTimeZone();
        org.joda.time.DateTime dateTime46 = dateTime39.withZone(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime32.toDateTime(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and dateTime46", (mutableDateTime6.compareTo(dateTime46) == 0) == mutableDateTime6.equals(dateTime46));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        org.joda.time.Instant instant3 = instant0.withMillis(978307200035L);
        org.joda.time.MutableDateTime mutableDateTime4 = instant0.toMutableDateTime();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableDuration7);
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        java.lang.Object obj10 = mutablePeriod9.clone();
        mutablePeriod9.setYears((int) ' ');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableDuration14);
        org.joda.time.MutablePeriod mutablePeriod16 = period15.toMutablePeriod();
        org.joda.time.Period period18 = period15.plusHours((int) 'a');
        org.joda.time.Period period20 = period15.withWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType21 = period15.getPeriodType();
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.weekyearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod9, periodType21, chronology23);
        org.joda.time.Period period26 = new org.joda.time.Period((long) 100, periodType21);
        mutableDateTime4.add((org.joda.time.ReadablePeriod) period26, 571);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekyear((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime4.getZone();
        org.joda.time.DateTime dateTime9 = dateTime4.plusDays(4);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableDuration11);
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        java.lang.Object obj14 = mutablePeriod13.clone();
        org.joda.time.MutablePeriod mutablePeriod15 = mutablePeriod13.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        mutablePeriod13.setPeriod(readableDuration16, chronology18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long24 = dateTimeZone22.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) 31, dateTimeZone22);
        org.joda.time.Chronology chronology27 = chronology18.withZone(dateTimeZone22);
        org.joda.time.DurationField durationField28 = chronology18.seconds();
        org.joda.time.DurationField durationField29 = chronology18.centuries();
        org.joda.time.DateTimeField dateTimeField30 = chronology18.weekyear();
        org.joda.time.DateTime dateTime31 = dateTime9.withChronology(chronology18);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime31", (dateTime9.compareTo(dateTime31) == 0) == dateTime9.equals(dateTime31));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        int int4 = yearMonthDay1.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay1.plusDays((-292275054));
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay6.dayOfMonth();
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = yearMonthDay6.getFields();
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long13 = dateTimeZone11.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(dateTimeZone11);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.withField(dateTimeFieldType15, (int) '4');
        org.joda.time.LocalDate localDate18 = dateMidnight17.toLocalDate();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableDuration20);
        org.joda.time.MutablePeriod mutablePeriod22 = period21.toMutablePeriod();
        java.lang.Object obj23 = mutablePeriod22.clone();
        org.joda.time.LocalDate localDate25 = localDate18.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod22, (int) (byte) 1);
        org.joda.time.LocalDate localDate27 = localDate18.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate29 = localDate18.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long33 = dateTimeZone31.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = localDate29.toDateTimeAtStartOfDay(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime9, dateTimeZone31);
        org.joda.time.DateTime dateTime37 = dateTime9.toDateTimeISO();
        org.joda.time.DateTime dateTime39 = dateTime9.minusYears(993);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime36 and dateTime9", (mutableDateTime36.compareTo(dateTime9) == 0) == mutableDateTime36.equals(dateTime9));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay3.toDateTime(timeOfDay4);
        org.joda.time.DateTime dateTime7 = dateTime5.plus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long12 = dateTimeZone10.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone10);
        org.joda.time.DateTime dateTime15 = dateTime5.withZoneRetainFields(dateTimeZone10);
        org.joda.time.DateTime dateTime18 = dateTime15.withDurationAdded((long) 14, (int) (byte) 0);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableDuration1, (org.joda.time.ReadableInstant) dateTime15, periodType19);
        org.joda.time.PeriodType periodType21 = mutablePeriod20.getPeriodType();
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology24 = yearMonthDay23.getChronology();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long29 = dateTimeZone27.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone27);
        org.joda.time.Chronology chronology32 = chronology24.withZone(dateTimeZone27);
        org.joda.time.Chronology chronology33 = chronology32.withUTC();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 1972, periodType21, chronology32);
        org.joda.time.DurationField durationField35 = chronology32.hours();
        org.joda.time.DurationField durationField36 = chronology32.eras();
        org.joda.time.DurationField durationField37 = chronology32.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField35 and durationField36", Math.signum(durationField35.compareTo(durationField36)) == -Math.signum(durationField36.compareTo(durationField35)));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withChronology(chronology6);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology6);
        org.joda.time.DurationField durationField9 = chronology6.weekyears();
        org.joda.time.DurationField durationField10 = chronology6.days();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(10L, chronology6);
        org.joda.time.DurationField durationField12 = chronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField9, and durationField10", !(durationField12.compareTo(durationField9) == 0) || (Math.signum(durationField12.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        org.joda.time.Instant instant3 = instant0.withMillis(978307200035L);
        org.joda.time.MutableDateTime mutableDateTime4 = instant0.toMutableDateTime();
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (short) -1, periodType6, chronology7);
        org.joda.time.MutablePeriod mutablePeriod9 = mutablePeriod8.toMutablePeriod();
        int int10 = mutablePeriod9.getYears();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime15.toMutableDateTime();
        java.lang.Object obj19 = mutableDateTime18.clone();
        org.joda.time.Chronology chronology20 = mutableDateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.era();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology20.getZone();
        org.joda.time.DateTimeField dateTimeField23 = chronology20.secondOfDay();
        org.joda.time.DurationField durationField24 = chronology20.seconds();
        mutablePeriod9.setPeriod(0L, chronology20);
        mutableDateTime4.setChronology(chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableDuration2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        int int5 = mutablePeriod4.getHours();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        int int7 = mutablePeriod4.get(durationFieldType6);
        mutableDateTime0.add((org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay10.toDateTime(timeOfDay11);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay10.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long18 = dateTimeZone16.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone21);
        long long26 = dateTimeZone16.getMillisKeepLocal(dateTimeZone21, (long) 59);
        org.joda.time.DateMidnight dateMidnight27 = yearMonthDay14.toDateMidnight(dateTimeZone16);
        org.joda.time.DateMidnight.Property property28 = dateMidnight27.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight29 = property28.roundHalfCeilingCopy();
        org.joda.time.Interval interval30 = dateMidnight29.toInterval();
        mutablePeriod4.add((org.joda.time.ReadableInterval) interval30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and dateTime19", (mutableDateTime0.compareTo(dateTime19) == 0) == mutableDateTime0.equals(dateTime19));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period5 = period2.plusHours((int) 'a');
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Period period7 = period5.negated();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DurationField durationField10 = durationFieldType8.getField(chronology9);
        boolean boolean11 = period5.isSupported(durationFieldType8);
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime15.toMutableDateTime();
        java.lang.Object obj19 = mutableDateTime18.clone();
        org.joda.time.Chronology chronology20 = mutableDateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.era();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long26 = dateTimeZone24.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(dateTimeZone24);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight27.withField(dateTimeFieldType28, (int) '4');
        org.joda.time.LocalDate localDate31 = dateMidnight30.toLocalDate();
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableDuration33);
        org.joda.time.MutablePeriod mutablePeriod35 = period34.toMutablePeriod();
        java.lang.Object obj36 = mutablePeriod35.clone();
        org.joda.time.LocalDate localDate38 = localDate31.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod35, (int) (byte) 1);
        org.joda.time.LocalDate.Property property39 = localDate31.yearOfCentury();
        org.joda.time.LocalDate localDate40 = property39.roundCeilingCopy();
        int int41 = dateTimeField22.getMinimumValue((org.joda.time.ReadablePartial) localDate40);
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay43.toDateTime(timeOfDay44);
        org.joda.time.DateTime dateTime47 = dateTime45.minusMinutes(0);
        org.joda.time.Chronology chronology48 = dateTime45.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.eras();
        org.joda.time.YearMonthDay yearMonthDay50 = new org.joda.time.YearMonthDay((java.lang.Object) localDate40, chronology48);
        boolean boolean51 = durationFieldType8.isSupported(chronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField49", Math.signum(durationField10.compareTo(durationField49)) == -Math.signum(durationField49.compareTo(durationField10)));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.DateTime dateTime8 = dateMidnight7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks(59);
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay13.toDateTime(timeOfDay14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime15.toMutableDateTime();
        java.lang.Object obj19 = mutableDateTime18.clone();
        org.joda.time.Chronology chronology20 = mutableDateTime18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long24 = dateTimeZone22.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusDays((int) 'u');
        mutableDateTime18.setMillis((org.joda.time.ReadableInstant) dateMidnight25);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight25.plusMonths(167);
        mutableDateTime11.setMillis((org.joda.time.ReadableInstant) dateMidnight30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and mutableDateTime18", (dateMidnight4.compareTo(mutableDateTime18) == 0) == dateMidnight4.equals(mutableDateTime18));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime4.toMutableDateTime();
        java.lang.Object obj8 = mutableDateTime7.clone();
        org.joda.time.Chronology chronology9 = mutableDateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long13 = dateTimeZone11.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) 'u');
        mutableDateTime7.setMillis((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.Chronology chronology18 = mutableDateTime7.getChronology();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((-463989L), chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and dateMidnight14", (mutableDateTime7.compareTo(dateMidnight14) == 0) == mutableDateTime7.equals(dateMidnight14));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        long long17 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, (long) 59);
        org.joda.time.DateMidnight dateMidnight18 = yearMonthDay5.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight20 = property19.roundHalfCeilingCopy();
        org.joda.time.DateMidnight dateMidnight21 = property19.withMinimumValue();
        org.joda.time.DurationField durationField22 = property19.getLeapDurationField();
        org.joda.time.DateMidnight dateMidnight24 = property19.addToCopy(69);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableDuration26);
        org.joda.time.MutablePeriod mutablePeriod28 = period27.toMutablePeriod();
        mutablePeriod28.add((long) (short) 0);
        int int31 = mutablePeriod28.getSeconds();
        mutablePeriod28.setValue(0, (int) (byte) 10);
        mutablePeriod28.setHours((int) (byte) 1);
        int int37 = mutablePeriod28.getMillis();
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay40 = null;
        org.joda.time.DateTime dateTime41 = yearMonthDay39.toDateTime(timeOfDay40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime41.toMutableDateTime();
        java.lang.Object obj45 = mutableDateTime44.clone();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime44.setZone(dateTimeZone47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime44.secondOfDay();
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant50, readableDuration51);
        org.joda.time.MutablePeriod mutablePeriod53 = period52.toMutablePeriod();
        java.lang.Object obj54 = mutablePeriod53.clone();
        mutablePeriod53.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay58 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay59 = null;
        org.joda.time.DateTime dateTime60 = yearMonthDay58.toDateTime(timeOfDay59);
        org.joda.time.DateTime dateTime62 = dateTime60.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime63 = dateTime60.toMutableDateTime();
        org.joda.time.DateTime dateTime64 = dateTime60.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration65 = mutablePeriod53.toDurationTo((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Duration duration66 = duration65.toDuration();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long70 = dateTimeZone68.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight(dateTimeZone68);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight71.withField(dateTimeFieldType72, (int) '4');
        org.joda.time.LocalDate localDate75 = dateMidnight74.toLocalDate();
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.ReadableDuration readableDuration77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period(readableInstant76, readableDuration77);
        org.joda.time.MutablePeriod mutablePeriod79 = period78.toMutablePeriod();
        java.lang.Object obj80 = mutablePeriod79.clone();
        org.joda.time.LocalDate localDate82 = localDate75.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod79, (int) (byte) 1);
        org.joda.time.LocalDate localDate84 = localDate75.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate86 = localDate75.minusDays((int) (short) 10);
        boolean boolean87 = duration65.equals((java.lang.Object) localDate75);
        org.joda.time.PeriodType periodType88 = null;
        org.joda.time.Period period89 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime44, (org.joda.time.ReadableDuration) duration65, periodType88);
        org.joda.time.Duration duration90 = mutablePeriod28.toDurationFrom((org.joda.time.ReadableInstant) mutableDateTime44);
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight24, (org.joda.time.ReadableDuration) duration90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime44", (dateTime3.compareTo(mutableDateTime44) == 0) == dateTime3.equals(mutableDateTime44));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay3.toDateTime(timeOfDay4);
        org.joda.time.DateTime dateTime6 = yearMonthDay3.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readableDuration7);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTime dateTime13 = dateTime6.withZone(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay15.toDateTime(timeOfDay16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime17.toMutableDateTime();
        java.lang.Object obj21 = mutableDateTime20.clone();
        org.joda.time.Chronology chronology22 = mutableDateTime20.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.weekyears();
        org.joda.time.DateMidnight dateMidnight24 = org.joda.time.DateMidnight.now(chronology22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableDuration26);
        org.joda.time.MutablePeriod mutablePeriod28 = period27.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long32 = dateTimeZone30.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(dateTimeZone30);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight33.plusMonths(0);
        org.joda.time.Duration duration38 = period27.toDurationTo((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight24.plus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateTime dateTime40 = dateTime13.minus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long44 = dateTimeZone42.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(dateTimeZone42);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight45.withDurationAdded((long) ' ', 1);
        org.joda.time.DateMidnight.Property property51 = dateMidnight50.year();
        org.joda.time.DateMidnight dateMidnight52 = property51.roundHalfCeilingCopy();
        org.joda.time.DateMidnight dateMidnight53 = property51.roundFloorCopy();
        int int54 = property51.getMinimumValueOverall();
        org.joda.time.DateMidnight dateMidnight56 = property51.addToCopy(29);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.withWeekyear((int) (byte) -1);
        org.joda.time.Period period59 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration38, (org.joda.time.ReadableInstant) dateMidnight56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime13", (dateTime6.compareTo(dateTime13) == 0) == dateTime6.equals(dateTime13));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Period period4 = new org.joda.time.Period((org.joda.time.ReadablePartial) yearMonthDay1, (org.joda.time.ReadablePartial) yearMonthDay3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableDuration6);
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.weekyears();
        int int10 = period7.get(durationFieldType9);
        org.joda.time.Period period12 = period7.plusMinutes(49709009);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay1.minus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay15.toDateTime(timeOfDay16);
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay15.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime20 = yearMonthDay19.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay19.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.plusMonths((-292275054));
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay26 = null;
        org.joda.time.DateTime dateTime27 = yearMonthDay25.toDateTime(timeOfDay26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime27.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField31 = null;
        mutableDateTime30.setRounding(dateTimeField31, (int) '#');
        mutableDateTime30.setMillis((long) 'u');
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long40 = dateTimeZone38.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(dateTimeZone38);
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone38);
        mutableDateTime30.setZoneRetainFields(dateTimeZone38);
        org.joda.time.DateMidnight dateMidnight44 = yearMonthDay23.toDateMidnight(dateTimeZone38);
        org.joda.time.DateTime dateTime45 = yearMonthDay13.toDateTimeAtCurrentTime(dateTimeZone38);
        boolean boolean46 = dateTimeZone38.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime45", (dateTime17.compareTo(dateTime45) == 0) == dateTime17.equals(dateTime45));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        long long17 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, (long) 59);
        org.joda.time.DateMidnight dateMidnight18 = yearMonthDay5.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.dayOfWeek();
        int int20 = property19.getMaximumValueOverall();
        org.joda.time.DateMidnight dateMidnight21 = property19.roundHalfCeilingCopy();
        org.joda.time.DateMidnight dateMidnight23 = property19.addToCopy((long) 261);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay26.toDateTime(timeOfDay27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime28.toMutableDateTime();
        java.lang.Object obj32 = mutableDateTime31.clone();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime31.setZone(dateTimeZone34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.secondOfDay();
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant37, readableDuration38);
        org.joda.time.MutablePeriod mutablePeriod40 = period39.toMutablePeriod();
        java.lang.Object obj41 = mutablePeriod40.clone();
        mutablePeriod40.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay46 = null;
        org.joda.time.DateTime dateTime47 = yearMonthDay45.toDateTime(timeOfDay46);
        org.joda.time.DateTime dateTime49 = dateTime47.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime47.toMutableDateTime();
        org.joda.time.DateTime dateTime51 = dateTime47.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration52 = mutablePeriod40.toDurationTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Duration duration53 = duration52.toDuration();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long57 = dateTimeZone55.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight(dateTimeZone55);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight58.withField(dateTimeFieldType59, (int) '4');
        org.joda.time.LocalDate localDate62 = dateMidnight61.toLocalDate();
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant63, readableDuration64);
        org.joda.time.MutablePeriod mutablePeriod66 = period65.toMutablePeriod();
        java.lang.Object obj67 = mutablePeriod66.clone();
        org.joda.time.LocalDate localDate69 = localDate62.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod66, (int) (byte) 1);
        org.joda.time.LocalDate localDate71 = localDate62.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate73 = localDate62.minusDays((int) (short) 10);
        boolean boolean74 = duration52.equals((java.lang.Object) localDate62);
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime31, (org.joda.time.ReadableDuration) duration52, periodType75);
        mutableDateTime31.addYears(525);
        org.joda.time.PeriodType periodType81 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType82 = periodType81.withHoursRemoved();
        org.joda.time.YearMonthDay yearMonthDay84 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay85 = null;
        org.joda.time.DateTime dateTime86 = yearMonthDay84.toDateTime(timeOfDay85);
        org.joda.time.DateTime dateTime88 = dateTime86.minusMinutes(0);
        org.joda.time.Chronology chronology89 = dateTime86.getChronology();
        org.joda.time.Period period90 = new org.joda.time.Period((long) 117, (long) 444, periodType82, chronology89);
        org.joda.time.DateTime dateTime91 = mutableDateTime31.toDateTime(chronology89);
        org.joda.time.DateMidnight dateMidnight92 = dateMidnight23.withChronology(chronology89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime31 and dateTime91", (mutableDateTime31.compareTo(dateTime91) == 0) == mutableDateTime31.equals(dateTime91));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.DateTime dateTime8 = dateMidnight7.toDateTime();
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTime();
        boolean boolean11 = dateMidnight7.isEqual((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Instant instant13 = instant9.minus((long) 10);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long17 = dateTimeZone15.convertUTCToLocal(10L);
        int int19 = dateTimeZone15.getStandardOffset((long) (byte) 100);
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime22 = instant9.toMutableDateTime(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and dateTime20", (mutableDateTime10.compareTo(dateTime20) == 0) == mutableDateTime10.equals(dateTime20));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.millisOfSecond();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.minuteOfDay();
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long19 = dateTimeZone17.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.plusWeeks((int) 'u');
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableDuration25);
        org.joda.time.MutablePeriod mutablePeriod27 = period26.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long31 = dateTimeZone29.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight32.plusMonths(0);
        org.joda.time.Duration duration37 = period26.toDurationTo((org.joda.time.ReadableInstant) dateMidnight36);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight23.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Instant instant39 = instant13.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.MutableDateTime mutableDateTime40 = instant13.toMutableDateTime();
        org.joda.time.Period period45 = new org.joda.time.Period((int) (short) -1, 182, (int) (short) 100, (int) (byte) -1);
        org.joda.time.Minutes minutes46 = period45.toStandardMinutes();
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay48.toDateTime(timeOfDay49);
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.minus(readableDuration52);
        org.joda.time.DateTime dateTime55 = dateTime51.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime57 = dateTime51.withMillis((long) 'a');
        int int58 = dateTime51.getYear();
        org.joda.time.Duration duration59 = period45.toDurationFrom((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.PeriodType periodType60 = org.joda.time.PeriodType.seconds();
        org.joda.time.Period period61 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime40, (org.joda.time.ReadableDuration) duration59, periodType60);
        mutableDateTime6.add((org.joda.time.ReadableDuration) duration59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime40", (instant11.compareTo(mutableDateTime40) == 0) == instant11.equals(mutableDateTime40));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableDuration3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.Period period7 = period4.plusHours((int) 'a');
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Period period9 = period7.negated();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType10.getField(chronology11);
        boolean boolean13 = period7.isSupported(durationFieldType10);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight16 = org.joda.time.DateMidnight.now(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long20 = dateTimeZone18.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight21.withField(dateTimeFieldType22, (int) '4');
        boolean boolean25 = dateMidnight16.isBefore((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        boolean boolean27 = dateMidnight16.isEqual(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableDuration29);
        org.joda.time.MutablePeriod mutablePeriod31 = period30.toMutablePeriod();
        java.lang.Object obj32 = mutablePeriod31.clone();
        mutablePeriod31.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay37 = null;
        org.joda.time.DateTime dateTime38 = yearMonthDay36.toDateTime(timeOfDay37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime38.toMutableDateTime();
        org.joda.time.DateTime dateTime42 = dateTime38.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration43 = mutablePeriod31.toDurationTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Duration duration44 = duration43.toDuration();
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight16.minus((org.joda.time.ReadableDuration) duration43);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration43);
        mutableDateTime1.addYears(182);
        mutableDateTime1.setTime((long) 49728473);
        org.joda.time.Instant instant51 = mutableDateTime1.toInstant();
        org.joda.time.Instant instant53 = instant51.plus((long) 182);
        org.joda.time.MutableDateTime mutableDateTime54 = instant53.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant51", (mutableDateTime1.compareTo(instant51) == 0) == mutableDateTime1.equals(instant51));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Period period4 = new org.joda.time.Period((org.joda.time.ReadablePartial) yearMonthDay1, (org.joda.time.ReadablePartial) yearMonthDay3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableDuration6);
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.weekyears();
        int int10 = period7.get(durationFieldType9);
        org.joda.time.Period period12 = period7.plusMinutes(49709009);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay1.minus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay15.toDateTime(timeOfDay16);
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay15.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime20 = yearMonthDay19.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay19.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.plusMonths((-292275054));
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay26 = null;
        org.joda.time.DateTime dateTime27 = yearMonthDay25.toDateTime(timeOfDay26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime27.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField31 = null;
        mutableDateTime30.setRounding(dateTimeField31, (int) '#');
        mutableDateTime30.setMillis((long) 'u');
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long40 = dateTimeZone38.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(dateTimeZone38);
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone38);
        mutableDateTime30.setZoneRetainFields(dateTimeZone38);
        org.joda.time.DateMidnight dateMidnight44 = yearMonthDay23.toDateMidnight(dateTimeZone38);
        org.joda.time.DateTime dateTime45 = yearMonthDay13.toDateTimeAtCurrentTime(dateTimeZone38);
        org.joda.time.YearMonthDay yearMonthDay47 = yearMonthDay13.minusMonths(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime45", (dateTime17.compareTo(dateTime45) == 0) == dateTime17.equals(dateTime45));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay5.monthOfYear();
        int int7 = property6.getMaximumValueOverall();
        int int8 = property6.getMinimumValue();
        int int9 = property6.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long13 = dateTimeZone11.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(dateTimeZone11);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.withField(dateTimeFieldType15, (int) '4');
        org.joda.time.LocalDate localDate18 = dateMidnight17.toLocalDate();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableDuration20);
        org.joda.time.MutablePeriod mutablePeriod22 = period21.toMutablePeriod();
        java.lang.Object obj23 = mutablePeriod22.clone();
        org.joda.time.LocalDate localDate25 = localDate18.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod22, (int) (byte) 1);
        org.joda.time.LocalDate localDate27 = localDate18.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate29 = localDate18.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long33 = dateTimeZone31.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = localDate29.toDateTimeAtStartOfDay(dateTimeZone31);
        boolean boolean36 = property6.equals((java.lang.Object) localDate29);
        int int37 = property6.getMinimumValueOverall();
        org.joda.time.DateTimeField dateTimeField38 = property6.getField();
        java.lang.String str39 = property6.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property6.getFieldType();
        org.joda.time.DurationField durationField41 = property6.getDurationField();
        org.joda.time.YearMonthDay yearMonthDay43 = property6.addWrapFieldToCopy(19);
        org.joda.time.YearMonthDay yearMonthDay45 = property6.addWrapFieldToCopy(859);
        org.joda.time.YearMonthDay yearMonthDay46 = property6.getYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay50 = yearMonthDay48.minusMonths(844);
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.months();
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay54 = null;
        org.joda.time.DateTime dateTime55 = yearMonthDay53.toDateTime(timeOfDay54);
        org.joda.time.DateTime dateTime56 = yearMonthDay53.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar57 = dateTime56.toGregorianCalendar();
        org.joda.time.DateTime dateTime59 = dateTime56.minusMinutes((int) ' ');
        org.joda.time.Chronology chronology60 = dateTime59.getChronology();
        org.joda.time.DurationField durationField61 = durationFieldType51.getField(chronology60);
        java.lang.String str62 = durationFieldType51.toString();
        org.joda.time.YearMonthDay yearMonthDay64 = yearMonthDay48.withFieldAdded(durationFieldType51, 330);
        org.joda.time.YearMonthDay yearMonthDay66 = yearMonthDay46.withFieldAdded(durationFieldType51, 569);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField41 and durationField61", (durationField41.compareTo(durationField61) == 0) == durationField41.equals(durationField61));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekyear((int) 'u');
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableDuration9);
        org.joda.time.MutablePeriod mutablePeriod11 = period10.toMutablePeriod();
        java.lang.Object obj12 = mutablePeriod11.clone();
        org.joda.time.MutablePeriod mutablePeriod13 = mutablePeriod11.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        mutablePeriod11.setPeriod(readableDuration14, chronology16);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long22 = dateTimeZone20.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 31, dateTimeZone20);
        org.joda.time.Chronology chronology25 = chronology16.withZone(dateTimeZone20);
        org.joda.time.DurationField durationField26 = chronology16.seconds();
        org.joda.time.DurationField durationField27 = chronology16.centuries();
        org.joda.time.DateTimeField dateTimeField28 = chronology16.weekyear();
        org.joda.time.DateTimeField dateTimeField29 = chronology16.weekyearOfCentury();
        org.joda.time.DateTime dateTime30 = dateTime7.toDateTime(chronology16);
        int int31 = dateTime7.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime30", (dateTime7.compareTo(dateTime30) == 0) == dateTime7.equals(dateTime30));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weekyears();
        org.joda.time.DateMidnight dateMidnight10 = org.joda.time.DateMidnight.now(chronology8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableDuration12);
        org.joda.time.MutablePeriod mutablePeriod14 = period13.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long18 = dateTimeZone16.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight19.plusMonths(0);
        org.joda.time.Duration duration24 = period13.toDurationTo((org.joda.time.ReadableInstant) dateMidnight23);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight10.plus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.DateTime dateTime29 = yearMonthDay27.toDateTime(timeOfDay28);
        org.joda.time.DateTime dateTime31 = dateTime29.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime29.toMutableDateTime();
        java.lang.Object obj33 = mutableDateTime32.clone();
        org.joda.time.Chronology chronology34 = mutableDateTime32.getChronology();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long38 = dateTimeZone36.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minusDays((int) 'u');
        mutableDateTime32.setMillis((org.joda.time.ReadableInstant) dateMidnight39);
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay45 = null;
        org.joda.time.DateTime dateTime46 = yearMonthDay44.toDateTime(timeOfDay45);
        org.joda.time.DateTime dateTime48 = dateTime46.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime46.toMutableDateTime();
        java.lang.Object obj50 = mutableDateTime49.clone();
        int int51 = mutableDateTime49.getHourOfDay();
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant52, readableDuration53);
        org.joda.time.MutablePeriod mutablePeriod55 = period54.toMutablePeriod();
        java.lang.Object obj56 = mutablePeriod55.clone();
        mutablePeriod55.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay61 = null;
        org.joda.time.DateTime dateTime62 = yearMonthDay60.toDateTime(timeOfDay61);
        org.joda.time.DateTime dateTime64 = dateTime62.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime62.toMutableDateTime();
        org.joda.time.DateTime dateTime66 = dateTime62.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration67 = mutablePeriod55.toDurationTo((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Duration duration68 = duration67.toDuration();
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration67);
        mutableDateTime32.add((org.joda.time.ReadableDuration) duration67, (int) (byte) 1);
        boolean boolean72 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration67);
        org.joda.time.Instant instant74 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant76 = instant74.withMillis(0L);
        org.joda.time.Chronology chronology77 = instant76.getChronology();
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration67, (org.joda.time.ReadableInstant) instant76);
        org.joda.time.MutableDateTime mutableDateTime79 = instant76.toMutableDateTimeISO();
        org.joda.time.Instant instant82 = instant76.withDurationAdded((long) 603, (int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant76 and mutableDateTime79", (instant76.compareTo(mutableDateTime79) == 0) == instant76.equals(mutableDateTime79));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekyear((int) 'u');
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableDuration9);
        org.joda.time.MutablePeriod mutablePeriod11 = period10.toMutablePeriod();
        java.lang.Object obj12 = mutablePeriod11.clone();
        org.joda.time.MutablePeriod mutablePeriod13 = mutablePeriod11.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        mutablePeriod11.setPeriod(readableDuration14, chronology16);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long22 = dateTimeZone20.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 31, dateTimeZone20);
        org.joda.time.Chronology chronology25 = chronology16.withZone(dateTimeZone20);
        org.joda.time.DurationField durationField26 = chronology16.seconds();
        org.joda.time.DurationField durationField27 = chronology16.centuries();
        org.joda.time.DateTimeField dateTimeField28 = chronology16.weekyear();
        org.joda.time.DateTimeField dateTimeField29 = chronology16.weekyearOfCentury();
        org.joda.time.DateTime dateTime30 = dateTime7.toDateTime(chronology16);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant31, readableDuration32);
        org.joda.time.MutablePeriod mutablePeriod34 = period33.toMutablePeriod();
        org.joda.time.Period period36 = period33.plusHours((int) 'a');
        org.joda.time.Period period38 = period33.withWeeks((int) (byte) -1);
        org.joda.time.Period period40 = period38.minusSeconds(0);
        int[] intArray42 = chronology16.get((org.joda.time.ReadablePeriod) period40, (long) 42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime30", (dateTime6.compareTo(dateTime30) == 0) == dateTime6.equals(dateTime30));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) '4');
        org.joda.time.DateTime dateTime8 = dateMidnight7.toDateTime();
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTime();
        boolean boolean11 = dateMidnight7.isEqual((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Instant instant13 = instant9.minus((long) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableDuration15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        int int18 = mutablePeriod17.getHours();
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.weekyears();
        int int20 = mutablePeriod17.get(durationFieldType19);
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay23.toDateTime(timeOfDay24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime25.toMutableDateTime();
        java.lang.Object obj29 = mutableDateTime28.clone();
        org.joda.time.Chronology chronology30 = mutableDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.era();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.secondOfDay();
        mutablePeriod17.setPeriod((long) 4, chronology30);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay36 = null;
        org.joda.time.DateTime dateTime37 = yearMonthDay35.toDateTime(timeOfDay36);
        org.joda.time.DateTime dateTime39 = dateTime37.plus((long) ' ');
        org.joda.time.Duration duration40 = mutablePeriod17.toDurationTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Instant instant41 = instant13.plus((org.joda.time.ReadableDuration) duration40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime10", (instant9.compareTo(mutableDateTime10) == 0) == instant9.equals(mutableDateTime10));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        java.lang.Object obj4 = mutablePeriod3.clone();
        mutablePeriod3.setYears((int) ' ');
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableDuration8);
        org.joda.time.MutablePeriod mutablePeriod10 = period9.toMutablePeriod();
        org.joda.time.Period period12 = period9.plusHours((int) 'a');
        org.joda.time.Period period14 = period9.withWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType15 = period9.getPeriodType();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, periodType15, chronology17);
        org.joda.time.DurationField durationField20 = chronology17.eras();
        org.joda.time.DurationField durationField21 = chronology17.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField21, and durationField20", !(durationField20.compareTo(durationField21) == 0) || (Math.signum(durationField20.compareTo(durationField20)) == Math.signum(durationField21.compareTo(durationField20))));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay5.monthOfYear();
        int int7 = property6.getMaximumValueOverall();
        int int8 = property6.getMinimumValue();
        int int9 = property6.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long13 = dateTimeZone11.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(dateTimeZone11);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.withField(dateTimeFieldType15, (int) '4');
        org.joda.time.LocalDate localDate18 = dateMidnight17.toLocalDate();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableDuration20);
        org.joda.time.MutablePeriod mutablePeriod22 = period21.toMutablePeriod();
        java.lang.Object obj23 = mutablePeriod22.clone();
        org.joda.time.LocalDate localDate25 = localDate18.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod22, (int) (byte) 1);
        org.joda.time.LocalDate localDate27 = localDate18.minusDays((int) (byte) -1);
        org.joda.time.LocalDate localDate29 = localDate18.minusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long33 = dateTimeZone31.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = localDate29.toDateTimeAtStartOfDay(dateTimeZone31);
        boolean boolean36 = property6.equals((java.lang.Object) localDate29);
        org.joda.time.YearMonthDay yearMonthDay38 = property6.addToCopy(1972);
        int int39 = property6.getMaximumValueOverall();
        org.joda.time.Instant instant40 = org.joda.time.Instant.now();
        org.joda.time.Instant instant41 = instant40.toInstant();
        int int42 = property6.compareTo((org.joda.time.ReadableInstant) instant40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and instant40", (dateTime34.compareTo(instant40) == 0) == dateTime34.equals(instant40));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        java.lang.Object obj4 = mutablePeriod3.clone();
        org.joda.time.MutablePeriod mutablePeriod5 = mutablePeriod3.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        mutablePeriod3.setPeriod(readableDuration6, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 31, dateTimeZone12);
        org.joda.time.Chronology chronology17 = chronology8.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DurationField durationField19 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField19", Math.signum(durationField18.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField18)));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight5.withDurationAdded((long) ' ', 1);
        org.joda.time.MutableDateTime mutableDateTime11 = dateMidnight5.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight13 = org.joda.time.DateMidnight.now(dateTimeZone12);
        long long15 = dateTimeZone12.previousTransition((long) 86399999);
        mutableDateTime11.setZoneRetainFields(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long21 = dateTimeZone19.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.minusMonths((int) ' ');
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusMinutes((int) (short) -1);
        org.joda.time.Chronology chronology29 = localDateTime26.getChronology();
        mutableDateTime11.setChronology(chronology29);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 9, chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and mutableDateTime11", (dateMidnight5.compareTo(mutableDateTime11) == 0) == dateMidnight5.equals(mutableDateTime11));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime4.secondOfDay();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.DateTime dateTime10 = property7.addToCopy(113);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant14 = instant12.withMillis(0L);
        org.joda.time.Chronology chronology15 = instant14.getChronology();
        org.joda.time.Instant instant17 = instant14.minus(3599989999L);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableDuration21);
        org.joda.time.MutablePeriod mutablePeriod23 = period22.toMutablePeriod();
        org.joda.time.Period period25 = period22.plusHours((int) 'a');
        org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
        org.joda.time.Period period27 = period25.negated();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DurationField durationField30 = durationFieldType28.getField(chronology29);
        boolean boolean31 = period25.isSupported(durationFieldType28);
        mutableDateTime19.add((org.joda.time.ReadablePeriod) period25);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight34 = org.joda.time.DateMidnight.now(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long38 = dateTimeZone36.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(dateTimeZone36);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight39.withField(dateTimeFieldType40, (int) '4');
        boolean boolean43 = dateMidnight34.isBefore((org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        boolean boolean45 = dateMidnight34.isEqual(readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant46, readableDuration47);
        org.joda.time.MutablePeriod mutablePeriod49 = period48.toMutablePeriod();
        java.lang.Object obj50 = mutablePeriod49.clone();
        mutablePeriod49.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay55 = null;
        org.joda.time.DateTime dateTime56 = yearMonthDay54.toDateTime(timeOfDay55);
        org.joda.time.DateTime dateTime58 = dateTime56.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime56.toMutableDateTime();
        org.joda.time.DateTime dateTime60 = dateTime56.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration61 = mutablePeriod49.toDurationTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration62 = duration61.toDuration();
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight34.minus((org.joda.time.ReadableDuration) duration61);
        mutableDateTime19.add((org.joda.time.ReadableDuration) duration61);
        org.joda.time.Instant instant65 = instant14.minus((org.joda.time.ReadableDuration) duration61);
        org.joda.time.DateTime dateTime66 = dateTime10.plus((org.joda.time.ReadableDuration) duration61);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant67, readableDuration68);
        org.joda.time.MutablePeriod mutablePeriod70 = period69.toMutablePeriod();
        java.lang.Object obj71 = mutablePeriod70.clone();
        mutablePeriod70.setYears((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod74 = mutablePeriod70.copy();
        org.joda.time.DateTime dateTime75 = dateTime10.plus((org.joda.time.ReadablePeriod) mutablePeriod70);
        boolean boolean76 = dateTime75.isAfterNow();
        org.joda.time.YearMonthDay yearMonthDay78 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay79 = null;
        org.joda.time.DateTime dateTime80 = yearMonthDay78.toDateTime(timeOfDay79);
        org.joda.time.DateTime dateTime81 = dateTime80.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone82 = dateTime81.getZone();
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale85 = java.util.Locale.ROOT;
        java.lang.String str86 = dateTimeZone83.getShortName((long) 86399999, locale85);
        long long88 = dateTimeZone82.getMillisKeepLocal(dateTimeZone83, (long) (-3600000));
        org.joda.time.MutableDateTime mutableDateTime89 = org.joda.time.MutableDateTime.now(dateTimeZone83);
        java.lang.String str90 = dateTimeZone83.toString();
        org.joda.time.LocalDate localDate91 = new org.joda.time.LocalDate(dateTimeZone83);
        org.joda.time.DateTime dateTime92 = dateTime75.withZone(dateTimeZone83);
        long long96 = dateTimeZone83.convertLocalToUTC((long) 82799, false, 773145388899399L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime66 and dateTime92", (dateTime66.compareTo(dateTime92) == 0) == dateTime66.equals(dateTime92));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        java.lang.Object obj4 = mutablePeriod3.clone();
        org.joda.time.MutablePeriod mutablePeriod5 = mutablePeriod3.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        mutablePeriod3.setPeriod(readableDuration6, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 31, dateTimeZone12);
        org.joda.time.Chronology chronology17 = chronology8.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField18 = chronology8.seconds();
        org.joda.time.DurationField durationField19 = chronology8.centuries();
        org.joda.time.DateTimeField dateTimeField20 = chronology8.centuryOfEra();
        org.joda.time.DurationField durationField21 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField18, and durationField19", !(durationField21.compareTo(durationField18) == 0) || (Math.signum(durationField21.compareTo(durationField19)) == Math.signum(durationField18.compareTo(durationField19))));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableDuration3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.Period period7 = period4.plusHours((int) 'a');
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Period period9 = period7.negated();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType10.getField(chronology11);
        boolean boolean13 = period7.isSupported(durationFieldType10);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight16 = org.joda.time.DateMidnight.now(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long20 = dateTimeZone18.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight21.withField(dateTimeFieldType22, (int) '4');
        boolean boolean25 = dateMidnight16.isBefore((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        boolean boolean27 = dateMidnight16.isEqual(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableDuration29);
        org.joda.time.MutablePeriod mutablePeriod31 = period30.toMutablePeriod();
        java.lang.Object obj32 = mutablePeriod31.clone();
        mutablePeriod31.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay37 = null;
        org.joda.time.DateTime dateTime38 = yearMonthDay36.toDateTime(timeOfDay37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime38.toMutableDateTime();
        org.joda.time.DateTime dateTime42 = dateTime38.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration43 = mutablePeriod31.toDurationTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Duration duration44 = duration43.toDuration();
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight16.minus((org.joda.time.ReadableDuration) duration43);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration43);
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay48.toDateTime(timeOfDay49);
        org.joda.time.DateTime dateTime52 = dateTime50.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime50.toMutableDateTime();
        java.lang.Object obj54 = mutableDateTime53.clone();
        org.joda.time.Chronology chronology55 = mutableDateTime53.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.era();
        org.joda.time.DateTimeField dateTimeField57 = chronology55.millisOfSecond();
        org.joda.time.DurationField durationField58 = chronology55.years();
        org.joda.time.DateTimeField dateTimeField59 = chronology55.hourOfDay();
        mutableDateTime1.setChronology(chronology55);
        org.joda.time.DateTimeField dateTimeField61 = chronology55.year();
        java.util.Locale locale62 = java.util.Locale.ENGLISH;
        boolean boolean63 = locale62.hasExtensions();
        int int64 = dateTimeField61.getMaximumShortTextLength(locale62);
        int int66 = dateTimeField61.getLeapAmount((long) 1972);
        org.joda.time.Instant instant68 = new org.joda.time.Instant((long) 53);
        org.joda.time.DateTime dateTime69 = instant68.toDateTime();
        org.joda.time.LocalDate localDate70 = dateTime69.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay73 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay74 = null;
        org.joda.time.DateTime dateTime75 = yearMonthDay73.toDateTime(timeOfDay74);
        org.joda.time.YearMonthDay yearMonthDay77 = yearMonthDay73.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property78 = yearMonthDay77.monthOfYear();
        int int79 = property78.getMaximumValueOverall();
        int int80 = property78.getMinimumValue();
        int int81 = property78.getMinimumValueOverall();
        java.util.Locale locale82 = java.util.Locale.ENGLISH;
        java.lang.String str83 = property78.getAsText(locale82);
        java.lang.String str84 = dateTimeField61.getAsText((org.joda.time.ReadablePartial) localDate70, 82800117, locale82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant68 and dateTime69", (instant68.compareTo(dateTime69) == 0) == instant68.equals(dateTime69));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.minus(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = instant2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = instant2.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime4", (instant2.compareTo(mutableDateTime4) == 0) == instant2.equals(mutableDateTime4));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        java.lang.Object obj4 = mutablePeriod3.clone();
        org.joda.time.MutablePeriod mutablePeriod5 = mutablePeriod3.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        mutablePeriod3.setPeriod(readableDuration6, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 31, dateTimeZone12);
        org.joda.time.Chronology chronology17 = chronology8.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DurationField durationField19 = chronology17.eras();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField19", Math.signum(durationField18.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField18)));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTime(timeOfDay5);
        org.joda.time.DateTime dateTime8 = dateTime6.plus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long13 = dateTimeZone11.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone11);
        org.joda.time.DateTime dateTime16 = dateTime6.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime dateTime19 = dateTime16.withDurationAdded((long) 14, (int) (byte) 0);
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableDuration2, (org.joda.time.ReadableInstant) dateTime16, periodType20);
        org.joda.time.PeriodType periodType22 = mutablePeriod21.getPeriodType();
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology25 = yearMonthDay24.getChronology();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long30 = dateTimeZone28.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(dateTimeZone28);
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone28);
        org.joda.time.Chronology chronology33 = chronology25.withZone(dateTimeZone28);
        org.joda.time.Chronology chronology34 = chronology33.withUTC();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1972, periodType22, chronology33);
        org.joda.time.DurationField durationField36 = chronology33.hours();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology33.weekyear();
        org.joda.time.DurationField durationField39 = chronology33.eras();
        boolean boolean40 = dateTimeFieldType0.isSupported(chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField36 and durationField39", Math.signum(durationField36.compareTo(durationField39)) == -Math.signum(durationField39.compareTo(durationField36)));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withDurationAdded((long) ' ', 1);
        org.joda.time.MutableDateTime mutableDateTime10 = dateMidnight4.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight12 = org.joda.time.DateMidnight.now(dateTimeZone11);
        long long14 = dateTimeZone11.previousTransition((long) 86399999);
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long20 = dateTimeZone18.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.minusMonths((int) ' ');
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusMinutes((int) (short) -1);
        org.joda.time.Chronology chronology28 = localDateTime25.getChronology();
        mutableDateTime10.setChronology(chronology28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime10.minuteOfDay();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime10.minuteOfHour();
        java.lang.String str32 = property31.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and mutableDateTime10", (dateMidnight4.compareTo(mutableDateTime10) == 0) == dateMidnight4.equals(mutableDateTime10));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plusWeeks((int) 'u');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableDuration15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long21 = dateTimeZone19.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight22.plusMonths(0);
        org.joda.time.Duration duration27 = period16.toDurationTo((org.joda.time.ReadableInstant) dateMidnight26);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight13.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Instant instant29 = instant3.plus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableDuration31);
        org.joda.time.MutablePeriod mutablePeriod33 = period32.toMutablePeriod();
        java.lang.Object obj34 = mutablePeriod33.clone();
        org.joda.time.MutablePeriod mutablePeriod35 = mutablePeriod33.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology38 = localTime37.getChronology();
        mutablePeriod33.setPeriod(readableDuration36, chronology38);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long44 = dateTimeZone42.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((long) 31, dateTimeZone42);
        org.joda.time.Chronology chronology47 = chronology38.withZone(dateTimeZone42);
        org.joda.time.DurationField durationField48 = chronology38.seconds();
        org.joda.time.DurationField durationField49 = chronology38.centuries();
        org.joda.time.DateTimeField dateTimeField50 = chronology38.centuryOfEra();
        org.joda.time.DateTime dateTime51 = instant3.toDateTime(chronology38);
        org.joda.time.MutableDateTime mutableDateTime52 = instant3.toMutableDateTime();
        org.joda.time.DateTime dateTime53 = instant3.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime52", (instant3.compareTo(mutableDateTime52) == 0) == instant3.equals(mutableDateTime52));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.Instant instant6 = instant3.minus(3599989999L);
        org.joda.time.MutableDateTime mutableDateTime7 = instant3.toMutableDateTimeISO();
        org.joda.time.Instant instant9 = instant3.minus((long) 22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime7", (instant3.compareTo(mutableDateTime7) == 0) == instant3.equals(mutableDateTime7));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekyear((int) 'u');
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableDuration9);
        org.joda.time.MutablePeriod mutablePeriod11 = period10.toMutablePeriod();
        java.lang.Object obj12 = mutablePeriod11.clone();
        org.joda.time.MutablePeriod mutablePeriod13 = mutablePeriod11.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        mutablePeriod11.setPeriod(readableDuration14, chronology16);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long22 = dateTimeZone20.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 31, dateTimeZone20);
        org.joda.time.Chronology chronology25 = chronology16.withZone(dateTimeZone20);
        org.joda.time.DurationField durationField26 = chronology16.seconds();
        org.joda.time.DurationField durationField27 = chronology16.centuries();
        org.joda.time.DateTimeField dateTimeField28 = chronology16.weekyear();
        org.joda.time.DateTimeField dateTimeField29 = chronology16.weekyearOfCentury();
        org.joda.time.DateTime dateTime30 = dateTime7.toDateTime(chronology16);
        org.joda.time.DurationField durationField31 = chronology16.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime30", (dateTime6.compareTo(dateTime30) == 0) == dateTime6.equals(dateTime30));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight15.withField(dateTimeFieldType16, (int) '4');
        org.joda.time.LocalDate localDate19 = dateMidnight18.toLocalDate();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableDuration21);
        org.joda.time.MutablePeriod mutablePeriod23 = period22.toMutablePeriod();
        java.lang.Object obj24 = mutablePeriod23.clone();
        org.joda.time.LocalDate localDate26 = localDate19.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod23, (int) (byte) 1);
        org.joda.time.LocalDate.Property property27 = localDate19.yearOfCentury();
        org.joda.time.LocalDate localDate28 = property27.roundCeilingCopy();
        int int29 = dateTimeField10.getMinimumValue((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay32 = null;
        org.joda.time.DateTime dateTime33 = yearMonthDay31.toDateTime(timeOfDay32);
        org.joda.time.DateTime dateTime35 = dateTime33.minusMinutes(0);
        org.joda.time.Chronology chronology36 = dateTime33.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.eras();
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay((java.lang.Object) localDate28, chronology36);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str41 = dateTimeZone39.getName((-33058500L));
        org.joda.time.Chronology chronology42 = chronology36.withZone(dateTimeZone39);
        org.joda.time.DurationField durationField43 = chronology42.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField43, and durationField37", !(durationField37.compareTo(durationField43) == 0) || (Math.signum(durationField37.compareTo(durationField37)) == Math.signum(durationField43.compareTo(durationField37))));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.withField(dateTimeFieldType6, (int) '4');
        org.joda.time.LocalDate localDate9 = dateMidnight8.toLocalDate();
        org.joda.time.LocalDate.Property property10 = localDate9.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean12 = localDate9.isSupported(dateTimeFieldType11);
        org.joda.time.LocalDate.Property property13 = localDate0.property(dateTimeFieldType11);
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        org.joda.time.LocalDate localDate15 = property13.roundFloorCopy();
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay17.toDateTime(timeOfDay18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime19.toMutableDateTime();
        java.lang.Object obj23 = mutableDateTime22.clone();
        org.joda.time.Chronology chronology24 = mutableDateTime22.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.weekyears();
        org.joda.time.DateMidnight dateMidnight26 = org.joda.time.DateMidnight.now(chronology24);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableDuration28);
        org.joda.time.MutablePeriod mutablePeriod30 = period29.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long34 = dateTimeZone32.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(dateTimeZone32);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight35.plusMonths(0);
        org.joda.time.Duration duration40 = period29.toDurationTo((org.joda.time.ReadableInstant) dateMidnight39);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight26.plus((org.joda.time.ReadableDuration) duration40);
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay43.toDateTime(timeOfDay44);
        org.joda.time.DateTime dateTime47 = dateTime45.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime45.toMutableDateTime();
        java.lang.Object obj49 = mutableDateTime48.clone();
        org.joda.time.Chronology chronology50 = mutableDateTime48.getChronology();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long54 = dateTimeZone52.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight(dateTimeZone52);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight55.minusDays((int) 'u');
        mutableDateTime48.setMillis((org.joda.time.ReadableInstant) dateMidnight55);
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay61 = null;
        org.joda.time.DateTime dateTime62 = yearMonthDay60.toDateTime(timeOfDay61);
        org.joda.time.DateTime dateTime64 = dateTime62.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime62.toMutableDateTime();
        java.lang.Object obj66 = mutableDateTime65.clone();
        int int67 = mutableDateTime65.getHourOfDay();
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period(readableInstant68, readableDuration69);
        org.joda.time.MutablePeriod mutablePeriod71 = period70.toMutablePeriod();
        java.lang.Object obj72 = mutablePeriod71.clone();
        mutablePeriod71.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay76 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay77 = null;
        org.joda.time.DateTime dateTime78 = yearMonthDay76.toDateTime(timeOfDay77);
        org.joda.time.DateTime dateTime80 = dateTime78.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime81 = dateTime78.toMutableDateTime();
        org.joda.time.DateTime dateTime82 = dateTime78.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration83 = mutablePeriod71.toDurationTo((org.joda.time.ReadableInstant) dateTime78);
        org.joda.time.Duration duration84 = duration83.toDuration();
        mutableDateTime65.add((org.joda.time.ReadableDuration) duration83);
        mutableDateTime48.add((org.joda.time.ReadableDuration) duration83, (int) (byte) 1);
        boolean boolean88 = duration40.isShorterThan((org.joda.time.ReadableDuration) duration83);
        org.joda.time.Instant instant90 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant92 = instant90.withMillis(0L);
        org.joda.time.Chronology chronology93 = instant92.getChronology();
        org.joda.time.MutablePeriod mutablePeriod94 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration83, (org.joda.time.ReadableInstant) instant92);
        org.joda.time.MutableDateTime mutableDateTime95 = instant92.toMutableDateTimeISO();
        int int96 = property13.compareTo((org.joda.time.ReadableInstant) instant92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant92 and mutableDateTime95", (instant92.compareTo(mutableDateTime95) == 0) == instant92.equals(mutableDateTime95));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plusWeeks((int) 'u');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableDuration15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long21 = dateTimeZone19.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight22.plusMonths(0);
        org.joda.time.Duration duration27 = period16.toDurationTo((org.joda.time.ReadableInstant) dateMidnight26);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight13.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Instant instant29 = instant3.plus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.MutableDateTime mutableDateTime30 = instant3.toMutableDateTime();
        org.joda.time.Period period35 = new org.joda.time.Period((int) (short) -1, 182, (int) (short) 100, (int) (byte) -1);
        org.joda.time.Minutes minutes36 = period35.toStandardMinutes();
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay39 = null;
        org.joda.time.DateTime dateTime40 = yearMonthDay38.toDateTime(timeOfDay39);
        org.joda.time.DateTime dateTime41 = yearMonthDay38.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime43 = dateTime41.minus(readableDuration42);
        org.joda.time.DateTime dateTime45 = dateTime41.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime47 = dateTime41.withMillis((long) 'a');
        int int48 = dateTime41.getYear();
        org.joda.time.Duration duration49 = period35.toDurationFrom((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.seconds();
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime30, (org.joda.time.ReadableDuration) duration49, periodType50);
        java.lang.String str52 = period51.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime30", (instant1.compareTo(mutableDateTime30) == 0) == instant1.equals(mutableDateTime30));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableDuration3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.Period period7 = period4.plusHours((int) 'a');
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Period period9 = period7.negated();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType10.getField(chronology11);
        boolean boolean13 = period7.isSupported(durationFieldType10);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight16 = org.joda.time.DateMidnight.now(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long20 = dateTimeZone18.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight21.withField(dateTimeFieldType22, (int) '4');
        boolean boolean25 = dateMidnight16.isBefore((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        boolean boolean27 = dateMidnight16.isEqual(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableDuration29);
        org.joda.time.MutablePeriod mutablePeriod31 = period30.toMutablePeriod();
        java.lang.Object obj32 = mutablePeriod31.clone();
        mutablePeriod31.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay37 = null;
        org.joda.time.DateTime dateTime38 = yearMonthDay36.toDateTime(timeOfDay37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime38.toMutableDateTime();
        org.joda.time.DateTime dateTime42 = dateTime38.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration43 = mutablePeriod31.toDurationTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Duration duration44 = duration43.toDuration();
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight16.minus((org.joda.time.ReadableDuration) duration43);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration43);
        mutableDateTime1.addYears(182);
        mutableDateTime1.setTime((long) 49728473);
        org.joda.time.Instant instant51 = mutableDateTime1.toInstant();
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.Instant instant54 = instant51.withDurationAdded(readableDuration52, 113);
        org.joda.time.Instant instant56 = instant54.withMillis((long) 367);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant54", (mutableDateTime1.compareTo(instant54) == 0) == mutableDateTime1.equals(instant54));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.minus(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = instant2.toMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay7.toDateTime(timeOfDay8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime9.toMutableDateTime();
        java.lang.Object obj13 = mutableDateTime12.clone();
        org.joda.time.Chronology chronology14 = mutableDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.era();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType5.getField(chronology14);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (short) -1, periodType18, chronology19);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) (short) -1, periodType22, chronology23);
        mutablePeriod20.add((org.joda.time.ReadablePeriod) mutablePeriod24);
        int[] intArray27 = chronology14.get((org.joda.time.ReadablePeriod) mutablePeriod24, (long) (short) 100);
        org.joda.time.DurationField durationField28 = chronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = chronology14.year();
        org.joda.time.MutableDateTime mutableDateTime30 = instant2.toMutableDateTime(chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime4", (instant2.compareTo(mutableDateTime4) == 0) == instant2.equals(mutableDateTime4));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        long long17 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, (long) 59);
        org.joda.time.DateMidnight dateMidnight18 = yearMonthDay5.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight20 = property19.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.withYear((int) 'u');
        org.joda.time.Period period24 = org.joda.time.Period.days(21);
        org.joda.time.Period period26 = period24.minusMonths(0);
        org.joda.time.Period period27 = period26.toPeriod();
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight22.minus((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant32 = instant30.withMillis(0L);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long36 = dateTimeZone34.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(dateTimeZone34);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight37.withField(dateTimeFieldType38, (int) '4');
        org.joda.time.LocalDate localDate41 = dateMidnight40.toLocalDate();
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant42, readableDuration43);
        org.joda.time.MutablePeriod mutablePeriod45 = period44.toMutablePeriod();
        java.lang.Object obj46 = mutablePeriod45.clone();
        org.joda.time.LocalDate localDate48 = localDate41.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod45, (int) (byte) 1);
        org.joda.time.LocalDate.Property property49 = localDate41.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField51 = localDate41.getField((int) (short) 0);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay54 = null;
        org.joda.time.DateTime dateTime55 = yearMonthDay53.toDateTime(timeOfDay54);
        org.joda.time.YearMonthDay yearMonthDay57 = yearMonthDay53.minusDays((int) (byte) 1);
        int int58 = dateTimeField51.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay57);
        boolean boolean59 = instant30.equals((java.lang.Object) int58);
        org.joda.time.Instant instant61 = instant30.withMillis((long) 3);
        org.joda.time.MutableDateTime mutableDateTime62 = instant30.toMutableDateTime();
        boolean boolean63 = dateMidnight22.isBefore((org.joda.time.ReadableInstant) instant30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant30 and mutableDateTime62", (instant30.compareTo(mutableDateTime62) == 0) == instant30.equals(mutableDateTime62));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfCeiling();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableDuration12);
        org.joda.time.MutablePeriod mutablePeriod14 = period13.toMutablePeriod();
        org.joda.time.Period period16 = period13.plusHours((int) 'a');
        org.joda.time.Period period18 = period13.withWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType19 = period13.getPeriodType();
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology22 = yearMonthDay21.getChronology();
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, 10L, periodType19, chronology22);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now(chronology22);
        org.joda.time.DateTimeField dateTimeField25 = chronology22.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField26 = chronology22.dayOfMonth();
        org.joda.time.DurationField durationField27 = chronology22.days();
        mutableDateTime8.setChronology(chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime8", (dateTime3.compareTo(mutableDateTime8) == 0) == dateTime3.equals(mutableDateTime8));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime4.toMutableDateTime();
        java.lang.Object obj8 = mutableDateTime7.clone();
        org.joda.time.Chronology chronology9 = mutableDateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.era();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = dateTimeField11.getType();
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology15 = yearMonthDay14.getChronology();
        boolean boolean16 = dateTimeFieldType12.isSupported(chronology15);
        org.joda.time.DateMidnight dateMidnight17 = org.joda.time.DateMidnight.now(chronology15);
        org.joda.time.DurationField durationField18 = chronology15.years();
        org.joda.time.DurationField durationField19 = chronology15.millis();
        org.joda.time.DurationField durationField20 = chronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField18, and durationField19", !(durationField20.compareTo(durationField18) == 0) || (Math.signum(durationField20.compareTo(durationField19)) == Math.signum(durationField18.compareTo(durationField19))));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay3.toDateTime(timeOfDay4);
        org.joda.time.DateTime dateTime7 = dateTime5.plus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long12 = dateTimeZone10.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone10);
        org.joda.time.DateTime dateTime15 = dateTime5.withZoneRetainFields(dateTimeZone10);
        org.joda.time.DateTime dateTime18 = dateTime15.withDurationAdded((long) 14, (int) (byte) 0);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableDuration1, (org.joda.time.ReadableInstant) dateTime15, periodType19);
        org.joda.time.PeriodType periodType21 = mutablePeriod20.getPeriodType();
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology24 = yearMonthDay23.getChronology();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long29 = dateTimeZone27.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone27);
        org.joda.time.Chronology chronology32 = chronology24.withZone(dateTimeZone27);
        org.joda.time.Chronology chronology33 = chronology32.withUTC();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 1972, periodType21, chronology32);
        org.joda.time.DurationField durationField35 = chronology32.hours();
        org.joda.time.DurationField durationField36 = chronology32.eras();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long40 = dateTimeZone38.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(dateTimeZone38);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight41.withField(dateTimeFieldType42, (int) '4');
        org.joda.time.DateTime dateTime45 = dateMidnight44.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long49 = dateTimeZone47.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight(dateTimeZone47);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight50.withField(dateTimeFieldType51, (int) '4');
        org.joda.time.LocalDate localDate54 = dateMidnight53.toLocalDate();
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight44.withFields((org.joda.time.ReadablePartial) localDate54);
        int int56 = localDate54.getWeekyear();
        int[] intArray58 = chronology32.get((org.joda.time.ReadablePartial) localDate54, 85796338L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField35 and durationField36", Math.signum(durationField35.compareTo(durationField36)) == -Math.signum(durationField36.compareTo(durationField35)));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekyear((int) 'u');
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableDuration9);
        org.joda.time.MutablePeriod mutablePeriod11 = period10.toMutablePeriod();
        java.lang.Object obj12 = mutablePeriod11.clone();
        org.joda.time.MutablePeriod mutablePeriod13 = mutablePeriod11.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        mutablePeriod11.setPeriod(readableDuration14, chronology16);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long22 = dateTimeZone20.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 31, dateTimeZone20);
        org.joda.time.Chronology chronology25 = chronology16.withZone(dateTimeZone20);
        org.joda.time.DurationField durationField26 = chronology16.seconds();
        org.joda.time.DurationField durationField27 = chronology16.centuries();
        org.joda.time.DateTimeField dateTimeField28 = chronology16.weekyear();
        org.joda.time.DateTimeField dateTimeField29 = chronology16.weekyearOfCentury();
        org.joda.time.DateTime dateTime30 = dateTime7.toDateTime(chronology16);
        org.joda.time.DateTimeField dateTimeField31 = chronology16.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime30", (dateTime6.compareTo(dateTime30) == 0) == dateTime6.equals(dateTime30));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableDuration3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.Period period7 = period4.plusHours((int) 'a');
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Period period9 = period7.negated();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType10.getField(chronology11);
        boolean boolean13 = period7.isSupported(durationFieldType10);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight16 = org.joda.time.DateMidnight.now(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long20 = dateTimeZone18.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight21.withField(dateTimeFieldType22, (int) '4');
        boolean boolean25 = dateMidnight16.isBefore((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        boolean boolean27 = dateMidnight16.isEqual(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableDuration29);
        org.joda.time.MutablePeriod mutablePeriod31 = period30.toMutablePeriod();
        java.lang.Object obj32 = mutablePeriod31.clone();
        mutablePeriod31.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay37 = null;
        org.joda.time.DateTime dateTime38 = yearMonthDay36.toDateTime(timeOfDay37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime38.toMutableDateTime();
        org.joda.time.DateTime dateTime42 = dateTime38.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration43 = mutablePeriod31.toDurationTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Duration duration44 = duration43.toDuration();
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight16.minus((org.joda.time.ReadableDuration) duration43);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration43);
        mutableDateTime1.addYears(182);
        mutableDateTime1.setTime((long) 49728473);
        org.joda.time.Instant instant51 = mutableDateTime1.toInstant();
        org.joda.time.Instant instant53 = instant51.plus((long) 182);
        org.joda.time.DateTime dateTime54 = instant51.toDateTime();
        org.joda.time.DateTime dateTime57 = dateTime54.withDurationAdded((long) 117, 14000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant51", (mutableDateTime1.compareTo(instant51) == 0) == mutableDateTime1.equals(instant51));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 53);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.LocalDate localDate3 = dateTime2.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight5 = org.joda.time.DateMidnight.now(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone7);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.withField(dateTimeFieldType11, (int) '4');
        boolean boolean14 = dateMidnight5.isBefore((org.joda.time.ReadableInstant) dateMidnight13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DateMidnight.Property property16 = dateMidnight13.property(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long21 = dateTimeZone19.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withYearOfCentury((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DurationField durationField29 = durationFieldType27.getField(chronology28);
        boolean boolean30 = localDateTime24.isSupported(durationFieldType27);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology32 = null;
        boolean boolean33 = dateTimeFieldType31.isSupported(chronology32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime24.property(dateTimeFieldType31);
        int int35 = dateMidnight13.get(dateTimeFieldType31);
        java.lang.String str36 = dateTimeFieldType31.getName();
        int int37 = localDate3.indexOf(dateTimeFieldType31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.Instant instant6 = instant3.minus(3599989999L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.Period period14 = period11.plusHours((int) 'a');
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Period period16 = period14.negated();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DurationField durationField19 = durationFieldType17.getField(chronology18);
        boolean boolean20 = period14.isSupported(durationFieldType17);
        mutableDateTime8.add((org.joda.time.ReadablePeriod) period14);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight23 = org.joda.time.DateMidnight.now(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long27 = dateTimeZone25.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight28.withField(dateTimeFieldType29, (int) '4');
        boolean boolean32 = dateMidnight23.isBefore((org.joda.time.ReadableInstant) dateMidnight31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        boolean boolean34 = dateMidnight23.isEqual(readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableDuration36);
        org.joda.time.MutablePeriod mutablePeriod38 = period37.toMutablePeriod();
        java.lang.Object obj39 = mutablePeriod38.clone();
        mutablePeriod38.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay43.toDateTime(timeOfDay44);
        org.joda.time.DateTime dateTime47 = dateTime45.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime45.toMutableDateTime();
        org.joda.time.DateTime dateTime49 = dateTime45.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration50 = mutablePeriod38.toDurationTo((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Duration duration51 = duration50.toDuration();
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight23.minus((org.joda.time.ReadableDuration) duration50);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration50);
        org.joda.time.Instant instant54 = instant3.minus((org.joda.time.ReadableDuration) duration50);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant55, readableDuration56);
        org.joda.time.MutablePeriod mutablePeriod58 = period57.toMutablePeriod();
        java.lang.Object obj59 = mutablePeriod58.clone();
        mutablePeriod58.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay63 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay64 = null;
        org.joda.time.DateTime dateTime65 = yearMonthDay63.toDateTime(timeOfDay64);
        org.joda.time.DateTime dateTime67 = dateTime65.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime68 = dateTime65.toMutableDateTime();
        org.joda.time.DateTime dateTime69 = dateTime65.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration70 = mutablePeriod58.toDurationTo((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.ReadableDuration readableDuration72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period(readableInstant71, readableDuration72);
        org.joda.time.MutablePeriod mutablePeriod74 = period73.toMutablePeriod();
        java.lang.Object obj75 = mutablePeriod74.clone();
        mutablePeriod74.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay79 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay80 = null;
        org.joda.time.DateTime dateTime81 = yearMonthDay79.toDateTime(timeOfDay80);
        org.joda.time.DateTime dateTime83 = dateTime81.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime84 = dateTime81.toMutableDateTime();
        org.joda.time.DateTime dateTime85 = dateTime81.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration86 = mutablePeriod74.toDurationTo((org.joda.time.ReadableInstant) dateTime81);
        long long87 = duration86.getMillis();
        mutablePeriod58.setPeriod((org.joda.time.ReadableDuration) duration86);
        org.joda.time.Instant instant89 = instant3.minus((org.joda.time.ReadableDuration) duration86);
        org.joda.time.DateTime dateTime90 = instant3.toDateTime();
        org.joda.time.DateTime dateTime91 = instant3.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime90", (instant3.compareTo(dateTime90) == 0) == instant3.equals(dateTime90));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime5 = yearMonthDay2.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar6 = dateTime5.toGregorianCalendar();
        org.joda.time.DateTime dateTime8 = dateTime5.minusMinutes((int) ' ');
        org.joda.time.DateTime dateTime9 = dateTime5.toDateTime();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay11.toDateTime(timeOfDay12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime13.toMutableDateTime();
        java.lang.Object obj17 = mutableDateTime16.clone();
        org.joda.time.Chronology chronology18 = mutableDateTime16.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.weekyears();
        org.joda.time.DateMidnight dateMidnight20 = org.joda.time.DateMidnight.now(chronology18);
        org.joda.time.DateTimeField dateTimeField21 = chronology18.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = chronology18.year();
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((java.lang.Object) dateTime5, chronology18);
        long long27 = chronology18.add((long) 86399999, (long) 1970, 69);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 2134, chronology18);
        org.joda.time.DurationField durationField29 = chronology18.months();
        org.joda.time.DurationField durationField30 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField19, and durationField29", !(durationField30.compareTo(durationField19) == 0) || (Math.signum(durationField30.compareTo(durationField29)) == Math.signum(durationField19.compareTo(durationField29))));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) -1, periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (short) -1, periodType5, chronology6);
        mutablePeriod3.add((org.joda.time.ReadablePeriod) mutablePeriod7);
        mutablePeriod3.addYears(0);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay14.toDateTime(timeOfDay15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime16.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.addWrapField((-1));
        org.joda.time.MutableDateTime mutableDateTime24 = property20.addWrapField(113);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = null;
        org.joda.time.format.DateTimeParser dateTimeParser27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter26, dateTimeParser27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter28.withPivotYear((java.lang.Integer) 23);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.months();
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay34 = null;
        org.joda.time.DateTime dateTime35 = yearMonthDay33.toDateTime(timeOfDay34);
        org.joda.time.DateTime dateTime36 = yearMonthDay33.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar37 = dateTime36.toGregorianCalendar();
        org.joda.time.DateTime dateTime39 = dateTime36.minusMinutes((int) ' ');
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.DurationField durationField41 = durationFieldType31.getField(chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter28.withChronology(chronology40);
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay45 = null;
        org.joda.time.DateTime dateTime46 = yearMonthDay44.toDateTime(timeOfDay45);
        org.joda.time.DateTime dateTime47 = yearMonthDay44.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar48 = dateTime47.toGregorianCalendar();
        org.joda.time.DateTime dateTime50 = dateTime47.minusMinutes((int) ' ');
        org.joda.time.DateTime dateTime51 = dateTime47.toDateTime();
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay54 = null;
        org.joda.time.DateTime dateTime55 = yearMonthDay53.toDateTime(timeOfDay54);
        org.joda.time.DateTime dateTime57 = dateTime55.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime55.toMutableDateTime();
        java.lang.Object obj59 = mutableDateTime58.clone();
        org.joda.time.Chronology chronology60 = mutableDateTime58.getChronology();
        org.joda.time.DurationField durationField61 = chronology60.weekyears();
        org.joda.time.DateMidnight dateMidnight62 = org.joda.time.DateMidnight.now(chronology60);
        org.joda.time.DateTimeField dateTimeField63 = chronology60.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField64 = chronology60.year();
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight((java.lang.Object) dateTime47, chronology60);
        org.joda.time.DateTimeField dateTimeField66 = chronology60.era();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter28.withChronology(chronology60);
        org.joda.time.DateTimeField dateTimeField68 = dateTimeFieldType25.getField(chronology60);
        mutableDateTime24.setChronology(chronology60);
        mutablePeriod3.setPeriod((long) 97, (long) 12, chronology60);
        org.joda.time.DurationField durationField71 = chronology60.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField71, durationField41, and durationField61", !(durationField71.compareTo(durationField41) == 0) || (Math.signum(durationField71.compareTo(durationField61)) == Math.signum(durationField41.compareTo(durationField61))));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.joda.time.Period period5 = period2.minusMillis((int) (byte) 100);
        org.joda.time.Period period6 = period2.negated();
        org.joda.time.Period period8 = period2.multipliedBy(733);
        org.joda.time.Duration duration9 = period2.toStandardDuration();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay11.toDateTime(timeOfDay12);
        org.joda.time.DateTime dateTime14 = dateTime13.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale18 = java.util.Locale.ROOT;
        java.lang.String str19 = dateTimeZone16.getShortName((long) 86399999, locale18);
        long long21 = dateTimeZone15.getMillisKeepLocal(dateTimeZone16, (long) (-3600000));
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone16);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration9, (org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long27 = dateTimeZone25.convertUTCToLocal(10L);
        int int29 = dateTimeZone25.getStandardOffset((long) (byte) 100);
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime33 = dateTime30.withDurationAdded((long) 365, 316);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight36 = org.joda.time.DateMidnight.now(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long40 = dateTimeZone38.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(dateTimeZone38);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight41.withField(dateTimeFieldType42, (int) '4');
        boolean boolean45 = dateMidnight36.isBefore((org.joda.time.ReadableInstant) dateMidnight44);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(readableDuration34, (org.joda.time.ReadableInstant) dateMidnight44);
        boolean boolean47 = dateTime33.isEqual((org.joda.time.ReadableInstant) dateMidnight44);
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime33.toMutableDateTimeISO();
        boolean boolean49 = mutableDateTime22.isAfter((org.joda.time.ReadableInstant) mutableDateTime48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant50, readableDuration51);
        org.joda.time.MutablePeriod mutablePeriod53 = period52.toMutablePeriod();
        java.lang.Object obj54 = mutablePeriod53.clone();
        org.joda.time.DateMidnight dateMidnight56 = org.joda.time.DateMidnight.parse("1970");
        org.joda.time.YearMonthDay yearMonthDay58 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay59 = null;
        org.joda.time.DateTime dateTime60 = yearMonthDay58.toDateTime(timeOfDay59);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime62 = dateTime60.withZoneRetainFields(dateTimeZone61);
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.DateTime dateTime65 = dateTime62.withDurationAdded(readableDuration63, (int) 'u');
        mutablePeriod53.setPeriod((org.joda.time.ReadableInstant) dateMidnight56, (org.joda.time.ReadableInstant) dateTime65);
        boolean boolean67 = mutableDateTime48.isEqual((org.joda.time.ReadableInstant) dateTime65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime22 and dateTime30", (mutableDateTime22.compareTo(dateTime30) == 0) == mutableDateTime22.equals(dateTime30));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.minus(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = instant2.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight6 = org.joda.time.DateMidnight.now(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long11 = dateTimeZone9.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusWeeks((int) 'u');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableDuration17);
        org.joda.time.MutablePeriod mutablePeriod19 = period18.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight24.plusMonths(0);
        org.joda.time.Duration duration29 = period18.toDurationTo((org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight15.minus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay32.toDateTime(timeOfDay33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime34.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime40 = dateTime34.withDurationAdded(readableDuration38, (int) (short) 1);
        int int41 = dateTime34.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime34.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay45 = null;
        org.joda.time.DateTime dateTime46 = yearMonthDay44.toDateTime(timeOfDay45);
        org.joda.time.DateTime dateTime48 = dateTime46.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime46.toMutableDateTime();
        java.lang.Object obj50 = mutableDateTime49.clone();
        int int51 = mutableDateTime49.getHourOfDay();
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant52, readableDuration53);
        org.joda.time.MutablePeriod mutablePeriod55 = period54.toMutablePeriod();
        java.lang.Object obj56 = mutablePeriod55.clone();
        mutablePeriod55.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay61 = null;
        org.joda.time.DateTime dateTime62 = yearMonthDay60.toDateTime(timeOfDay61);
        org.joda.time.DateTime dateTime64 = dateTime62.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime62.toMutableDateTime();
        org.joda.time.DateTime dateTime66 = dateTime62.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration67 = mutablePeriod55.toDurationTo((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Duration duration68 = duration67.toDuration();
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration67);
        mutableDateTime42.add((org.joda.time.ReadableDuration) duration67);
        boolean boolean71 = duration29.isShorterThan((org.joda.time.ReadableDuration) duration67);
        org.joda.time.DateMidnight dateMidnight72 = dateMidnight6.plus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Instant instant73 = instant2.minus((org.joda.time.ReadableDuration) duration29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant73 and mutableDateTime4", (instant73.compareTo(mutableDateTime4) == 0) == instant73.equals(mutableDateTime4));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableDuration4);
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.Period period8 = period5.plusHours((int) 'a');
        org.joda.time.Period period10 = period5.withWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType11 = period5.getPeriodType();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology14 = yearMonthDay13.getChronology();
        org.joda.time.Period period15 = new org.joda.time.Period((long) (short) -1, 10L, periodType11, chronology14);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now(chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableDuration22);
        org.joda.time.MutablePeriod mutablePeriod24 = period23.toMutablePeriod();
        org.joda.time.Period period26 = period23.plusHours((int) 'a');
        org.joda.time.Minutes minutes27 = period26.toStandardMinutes();
        org.joda.time.Period period28 = period26.negated();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DurationField durationField31 = durationFieldType29.getField(chronology30);
        boolean boolean32 = period26.isSupported(durationFieldType29);
        mutableDateTime20.add((org.joda.time.ReadablePeriod) period26);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight35 = org.joda.time.DateMidnight.now(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long39 = dateTimeZone37.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(dateTimeZone37);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight40.withField(dateTimeFieldType41, (int) '4');
        boolean boolean44 = dateMidnight35.isBefore((org.joda.time.ReadableInstant) dateMidnight43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        boolean boolean46 = dateMidnight35.isEqual(readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant47, readableDuration48);
        org.joda.time.MutablePeriod mutablePeriod50 = period49.toMutablePeriod();
        java.lang.Object obj51 = mutablePeriod50.clone();
        mutablePeriod50.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay56 = null;
        org.joda.time.DateTime dateTime57 = yearMonthDay55.toDateTime(timeOfDay56);
        org.joda.time.DateTime dateTime59 = dateTime57.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime57.toMutableDateTime();
        org.joda.time.DateTime dateTime61 = dateTime57.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration62 = mutablePeriod50.toDurationTo((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.Duration duration63 = duration62.toDuration();
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight35.minus((org.joda.time.ReadableDuration) duration62);
        mutableDateTime20.add((org.joda.time.ReadableDuration) duration62);
        org.joda.time.YearMonthDay yearMonthDay67 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay68 = null;
        org.joda.time.DateTime dateTime69 = yearMonthDay67.toDateTime(timeOfDay68);
        org.joda.time.DateTime dateTime71 = dateTime69.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime72 = dateTime69.toMutableDateTime();
        java.lang.Object obj73 = mutableDateTime72.clone();
        org.joda.time.Chronology chronology74 = mutableDateTime72.getChronology();
        org.joda.time.DateTimeField dateTimeField75 = chronology74.era();
        org.joda.time.DateTimeField dateTimeField76 = chronology74.millisOfSecond();
        org.joda.time.DurationField durationField77 = chronology74.years();
        org.joda.time.DateTimeField dateTimeField78 = chronology74.hourOfDay();
        mutableDateTime20.setChronology(chronology74);
        org.joda.time.DateTimeField dateTimeField80 = chronology74.year();
        org.joda.time.MutableDateTime mutableDateTime81 = dateMidnight18.toMutableDateTime(chronology74);
        org.joda.time.TimeOfDay timeOfDay82 = new org.joda.time.TimeOfDay((long) 'a', chronology74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight18 and mutableDateTime81", (dateMidnight18.compareTo(mutableDateTime81) == 0) == dateMidnight18.equals(mutableDateTime81));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableDuration3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        java.lang.Object obj6 = mutablePeriod5.clone();
        mutablePeriod5.setYears((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.Period period14 = period11.plusHours((int) 'a');
        org.joda.time.Period period16 = period11.withWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType17 = period11.getPeriodType();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.weekyearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod5, periodType17, chronology19);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(periodType17);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(3599989999L);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.halfdayOfDay();
        org.joda.time.Period period27 = new org.joda.time.Period((long) 1, 31556952000L, periodType17, chronology25);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = chronology25.clockhourOfHalfday();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(chronology25);
        org.joda.time.DateTime.Property property31 = dateTime30.monthOfYear();
        org.joda.time.Instant instant32 = dateTime30.toInstant();
        org.joda.time.DateTime dateTime33 = instant32.toDateTimeISO();
        long long34 = instant32.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime33", (dateTime30.compareTo(dateTime33) == 0) == dateTime30.equals(dateTime33));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay3.toDateTime(timeOfDay4);
        org.joda.time.DateTime dateTime7 = dateTime5.plus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long12 = dateTimeZone10.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone10);
        org.joda.time.DateTime dateTime15 = dateTime5.withZoneRetainFields(dateTimeZone10);
        org.joda.time.DateTime dateTime18 = dateTime15.withDurationAdded((long) 14, (int) (byte) 0);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableDuration1, (org.joda.time.ReadableInstant) dateTime15, periodType19);
        org.joda.time.PeriodType periodType21 = mutablePeriod20.getPeriodType();
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology24 = yearMonthDay23.getChronology();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long29 = dateTimeZone27.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone27);
        org.joda.time.Chronology chronology32 = chronology24.withZone(dateTimeZone27);
        org.joda.time.Chronology chronology33 = chronology32.withUTC();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 1972, periodType21, chronology32);
        org.joda.time.DurationField durationField35 = chronology32.hours();
        org.joda.time.DateTimeField dateTimeField36 = chronology32.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology32.weekyear();
        org.joda.time.DurationField durationField38 = chronology32.eras();
        org.joda.time.DateTimeField dateTimeField39 = chronology32.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField35 and durationField38", Math.signum(durationField35.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField35)));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(49709009000L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableDuration3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight10.plusMonths(0);
        org.joda.time.Duration duration15 = period4.toDurationTo((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateMidnight.Property property16 = dateMidnight14.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight17 = property16.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property16.getFieldType();
        boolean boolean19 = mutableDateTime1.isSupported(dateTimeFieldType18);
        mutableDateTime1.setWeekyear(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        java.lang.String str23 = dateTimeFieldType22.toString();
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.minuteOfDay();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology25);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(chronology25);
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType22.getField(chronology25);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime1.property(dateTimeFieldType22);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime1.year();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long37 = dateTimeZone35.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(dateTimeZone35);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone35);
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(dateTimeZone35);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableDuration42);
        org.joda.time.MutablePeriod mutablePeriod44 = period43.toMutablePeriod();
        org.joda.time.Period period46 = period43.plusHours((int) 'a');
        org.joda.time.Minutes minutes47 = period46.toStandardMinutes();
        org.joda.time.Period period48 = period46.negated();
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DurationField durationField51 = durationFieldType49.getField(chronology50);
        boolean boolean52 = period46.isSupported(durationFieldType49);
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay40.withFieldAdded(durationFieldType49, 30);
        org.joda.time.DateTime dateTime55 = timeOfDay54.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay57 = timeOfDay54.withMillisOfSecond(20);
        org.joda.time.TimeOfDay.Property property58 = timeOfDay57.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay60 = property58.addWrapFieldToCopy(550);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long64 = dateTimeZone62.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime65 = org.joda.time.DateTime.now(dateTimeZone62);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long69 = dateTimeZone67.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime70 = org.joda.time.DateTime.now(dateTimeZone67);
        long long72 = dateTimeZone62.getMillisKeepLocal(dateTimeZone67, (long) 59);
        boolean boolean74 = dateTimeZone67.isStandardOffset(1L);
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(dateTimeZone67);
        org.joda.time.DateTime dateTime76 = timeOfDay60.toDateTime((org.joda.time.ReadableInstant) mutableDateTime75);
        boolean boolean77 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) dateTime76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime65", (dateTime27.compareTo(dateTime65) == 0) == dateTime27.equals(dateTime65));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableDuration3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.Period period7 = period4.plusHours((int) 'a');
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Period period9 = period7.negated();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType10.getField(chronology11);
        boolean boolean13 = period7.isSupported(durationFieldType10);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight16 = org.joda.time.DateMidnight.now(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long20 = dateTimeZone18.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight21.withField(dateTimeFieldType22, (int) '4');
        boolean boolean25 = dateMidnight16.isBefore((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        boolean boolean27 = dateMidnight16.isEqual(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableDuration29);
        org.joda.time.MutablePeriod mutablePeriod31 = period30.toMutablePeriod();
        java.lang.Object obj32 = mutablePeriod31.clone();
        mutablePeriod31.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay37 = null;
        org.joda.time.DateTime dateTime38 = yearMonthDay36.toDateTime(timeOfDay37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime38.toMutableDateTime();
        org.joda.time.DateTime dateTime42 = dateTime38.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration43 = mutablePeriod31.toDurationTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Duration duration44 = duration43.toDuration();
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight16.minus((org.joda.time.ReadableDuration) duration43);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration43);
        mutableDateTime1.addYears(182);
        mutableDateTime1.setTime((long) 49728473);
        org.joda.time.Instant instant51 = mutableDateTime1.toInstant();
        org.joda.time.Instant instant53 = instant51.plus((long) 182);
        org.joda.time.DateTime dateTime54 = instant51.toDateTime();
        long long55 = dateTime54.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant51", (mutableDateTime1.compareTo(instant51) == 0) == mutableDateTime1.equals(instant51));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime4.secondOfDay();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.DateTime dateTime10 = property7.addToCopy(113);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant14 = instant12.withMillis(0L);
        org.joda.time.Chronology chronology15 = instant14.getChronology();
        org.joda.time.Instant instant17 = instant14.minus(3599989999L);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableDuration21);
        org.joda.time.MutablePeriod mutablePeriod23 = period22.toMutablePeriod();
        org.joda.time.Period period25 = period22.plusHours((int) 'a');
        org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
        org.joda.time.Period period27 = period25.negated();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DurationField durationField30 = durationFieldType28.getField(chronology29);
        boolean boolean31 = period25.isSupported(durationFieldType28);
        mutableDateTime19.add((org.joda.time.ReadablePeriod) period25);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight34 = org.joda.time.DateMidnight.now(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long38 = dateTimeZone36.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(dateTimeZone36);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight39.withField(dateTimeFieldType40, (int) '4');
        boolean boolean43 = dateMidnight34.isBefore((org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        boolean boolean45 = dateMidnight34.isEqual(readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant46, readableDuration47);
        org.joda.time.MutablePeriod mutablePeriod49 = period48.toMutablePeriod();
        java.lang.Object obj50 = mutablePeriod49.clone();
        mutablePeriod49.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay55 = null;
        org.joda.time.DateTime dateTime56 = yearMonthDay54.toDateTime(timeOfDay55);
        org.joda.time.DateTime dateTime58 = dateTime56.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime56.toMutableDateTime();
        org.joda.time.DateTime dateTime60 = dateTime56.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration61 = mutablePeriod49.toDurationTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration62 = duration61.toDuration();
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight34.minus((org.joda.time.ReadableDuration) duration61);
        mutableDateTime19.add((org.joda.time.ReadableDuration) duration61);
        org.joda.time.Instant instant65 = instant14.minus((org.joda.time.ReadableDuration) duration61);
        org.joda.time.DateTime dateTime66 = dateTime10.plus((org.joda.time.ReadableDuration) duration61);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant67, readableDuration68);
        org.joda.time.MutablePeriod mutablePeriod70 = period69.toMutablePeriod();
        java.lang.Object obj71 = mutablePeriod70.clone();
        mutablePeriod70.setYears((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod74 = mutablePeriod70.copy();
        org.joda.time.DateTime dateTime75 = dateTime10.plus((org.joda.time.ReadablePeriod) mutablePeriod70);
        boolean boolean76 = dateTime75.isAfterNow();
        org.joda.time.YearMonthDay yearMonthDay78 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay79 = null;
        org.joda.time.DateTime dateTime80 = yearMonthDay78.toDateTime(timeOfDay79);
        org.joda.time.DateTime dateTime81 = dateTime80.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone82 = dateTime81.getZone();
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale85 = java.util.Locale.ROOT;
        java.lang.String str86 = dateTimeZone83.getShortName((long) 86399999, locale85);
        long long88 = dateTimeZone82.getMillisKeepLocal(dateTimeZone83, (long) (-3600000));
        org.joda.time.MutableDateTime mutableDateTime89 = org.joda.time.MutableDateTime.now(dateTimeZone83);
        java.lang.String str90 = dateTimeZone83.toString();
        org.joda.time.LocalDate localDate91 = new org.joda.time.LocalDate(dateTimeZone83);
        org.joda.time.DateTime dateTime92 = dateTime75.withZone(dateTimeZone83);
        org.joda.time.DateTime dateTime94 = dateTime75.plus((-3599989999L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime66 and dateTime92", (dateTime66.compareTo(dateTime92) == 0) == dateTime66.equals(dateTime92));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.Instant instant6 = instant3.minus(3599989999L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.Period period14 = period11.plusHours((int) 'a');
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Period period16 = period14.negated();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DurationField durationField19 = durationFieldType17.getField(chronology18);
        boolean boolean20 = period14.isSupported(durationFieldType17);
        mutableDateTime8.add((org.joda.time.ReadablePeriod) period14);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight23 = org.joda.time.DateMidnight.now(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long27 = dateTimeZone25.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight28.withField(dateTimeFieldType29, (int) '4');
        boolean boolean32 = dateMidnight23.isBefore((org.joda.time.ReadableInstant) dateMidnight31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        boolean boolean34 = dateMidnight23.isEqual(readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableDuration36);
        org.joda.time.MutablePeriod mutablePeriod38 = period37.toMutablePeriod();
        java.lang.Object obj39 = mutablePeriod38.clone();
        mutablePeriod38.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay43.toDateTime(timeOfDay44);
        org.joda.time.DateTime dateTime47 = dateTime45.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime45.toMutableDateTime();
        org.joda.time.DateTime dateTime49 = dateTime45.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration50 = mutablePeriod38.toDurationTo((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Duration duration51 = duration50.toDuration();
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight23.minus((org.joda.time.ReadableDuration) duration50);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration50);
        org.joda.time.Instant instant54 = instant3.minus((org.joda.time.ReadableDuration) duration50);
        org.joda.time.PeriodType periodType57 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType58 = periodType57.withHoursRemoved();
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay61 = null;
        org.joda.time.DateTime dateTime62 = yearMonthDay60.toDateTime(timeOfDay61);
        org.joda.time.DateTime dateTime64 = dateTime62.minusMinutes(0);
        org.joda.time.Chronology chronology65 = dateTime62.getChronology();
        org.joda.time.Period period66 = new org.joda.time.Period((long) 117, (long) 444, periodType58, chronology65);
        java.lang.String str67 = chronology65.toString();
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((java.lang.Object) instant3, chronology65);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableDuration readableDuration70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period(readableInstant69, readableDuration70);
        org.joda.time.MutablePeriod mutablePeriod72 = period71.toMutablePeriod();
        java.lang.Object obj73 = mutablePeriod72.clone();
        mutablePeriod72.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay77 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay78 = null;
        org.joda.time.DateTime dateTime79 = yearMonthDay77.toDateTime(timeOfDay78);
        org.joda.time.DateTime dateTime81 = dateTime79.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime82 = dateTime79.toMutableDateTime();
        org.joda.time.DateTime dateTime83 = dateTime79.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration84 = mutablePeriod72.toDurationTo((org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.Duration duration85 = duration84.toDuration();
        org.joda.time.Instant instant87 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration85, 241);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime68", (instant3.compareTo(dateTime68) == 0) == instant3.equals(dateTime68));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableDuration3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.Period period7 = period4.plusHours((int) 'a');
        org.joda.time.Period period9 = period4.withWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType10 = period4.getPeriodType();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology13 = yearMonthDay12.getChronology();
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) -1, 10L, periodType10, chronology13);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableDuration21);
        org.joda.time.MutablePeriod mutablePeriod23 = period22.toMutablePeriod();
        org.joda.time.Period period25 = period22.plusHours((int) 'a');
        org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
        org.joda.time.Period period27 = period25.negated();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DurationField durationField30 = durationFieldType28.getField(chronology29);
        boolean boolean31 = period25.isSupported(durationFieldType28);
        mutableDateTime19.add((org.joda.time.ReadablePeriod) period25);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight34 = org.joda.time.DateMidnight.now(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long38 = dateTimeZone36.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(dateTimeZone36);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight39.withField(dateTimeFieldType40, (int) '4');
        boolean boolean43 = dateMidnight34.isBefore((org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        boolean boolean45 = dateMidnight34.isEqual(readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant46, readableDuration47);
        org.joda.time.MutablePeriod mutablePeriod49 = period48.toMutablePeriod();
        java.lang.Object obj50 = mutablePeriod49.clone();
        mutablePeriod49.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay55 = null;
        org.joda.time.DateTime dateTime56 = yearMonthDay54.toDateTime(timeOfDay55);
        org.joda.time.DateTime dateTime58 = dateTime56.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime56.toMutableDateTime();
        org.joda.time.DateTime dateTime60 = dateTime56.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration61 = mutablePeriod49.toDurationTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration62 = duration61.toDuration();
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight34.minus((org.joda.time.ReadableDuration) duration61);
        mutableDateTime19.add((org.joda.time.ReadableDuration) duration61);
        org.joda.time.YearMonthDay yearMonthDay66 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay67 = null;
        org.joda.time.DateTime dateTime68 = yearMonthDay66.toDateTime(timeOfDay67);
        org.joda.time.DateTime dateTime70 = dateTime68.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime68.toMutableDateTime();
        java.lang.Object obj72 = mutableDateTime71.clone();
        org.joda.time.Chronology chronology73 = mutableDateTime71.getChronology();
        org.joda.time.DateTimeField dateTimeField74 = chronology73.era();
        org.joda.time.DateTimeField dateTimeField75 = chronology73.millisOfSecond();
        org.joda.time.DurationField durationField76 = chronology73.years();
        org.joda.time.DateTimeField dateTimeField77 = chronology73.hourOfDay();
        mutableDateTime19.setChronology(chronology73);
        org.joda.time.DateTimeField dateTimeField79 = chronology73.year();
        org.joda.time.MutableDateTime mutableDateTime80 = dateMidnight17.toMutableDateTime(chronology73);
        org.joda.time.DateTimeField dateTimeField81 = chronology73.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight17 and mutableDateTime80", (dateMidnight17.compareTo(mutableDateTime80) == 0) == dateMidnight17.equals(mutableDateTime80));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay5.monthOfYear();
        int int7 = property6.getMaximumValueOverall();
        int int8 = property6.getMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay10.toDateTime(timeOfDay11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime12.toMutableDateTime();
        org.joda.time.DateTime dateTime16 = dateTime12.withEarlierOffsetAtOverlap();
        int int17 = property6.compareTo((org.joda.time.ReadableInstant) dateTime12);
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str19 = property6.getAsShortText(locale18);
        java.lang.String str20 = property6.getName();
        org.joda.time.YearMonthDay yearMonthDay22 = property6.addToCopy(1972);
        org.joda.time.DurationField durationField23 = property6.getRangeDurationField();
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter26.withPivotYear((java.lang.Integer) 23);
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.months();
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay32 = null;
        org.joda.time.DateTime dateTime33 = yearMonthDay31.toDateTime(timeOfDay32);
        org.joda.time.DateTime dateTime34 = yearMonthDay31.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar35 = dateTime34.toGregorianCalendar();
        org.joda.time.DateTime dateTime37 = dateTime34.minusMinutes((int) ' ');
        org.joda.time.Chronology chronology38 = dateTime37.getChronology();
        org.joda.time.DurationField durationField39 = durationFieldType29.getField(chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter26.withChronology(chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter40.withPivotYear((java.lang.Integer) 86399);
        boolean boolean43 = property6.equals((java.lang.Object) dateTimeFormatter42);
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay46 = null;
        org.joda.time.DateTime dateTime47 = yearMonthDay45.toDateTime(timeOfDay46);
        org.joda.time.DateTime dateTime48 = dateTime47.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone49 = dateTime48.getZone();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale52 = java.util.Locale.ROOT;
        java.lang.String str53 = dateTimeZone50.getShortName((long) 86399999, locale52);
        long long55 = dateTimeZone49.getMillisKeepLocal(dateTimeZone50, (long) (-3600000));
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(dateTimeZone50);
        java.lang.String str57 = dateTimeZone50.toString();
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate(dateTimeZone50);
        boolean boolean59 = property6.equals((java.lang.Object) dateTimeZone50);
        int int60 = property6.get();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(dateTimeZone61);
        java.util.Locale locale64 = java.util.Locale.FRENCH;
        java.lang.String str65 = dateTimeZone61.getShortName((long) 11, locale64);
        java.util.Locale.setDefault(locale64);
        java.lang.String str67 = property6.getAsText(locale64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime56 and mutableDateTime62", (mutableDateTime56.compareTo(mutableDateTime62) == 0) == mutableDateTime56.equals(mutableDateTime62));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long7 = dateTimeZone5.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.withField(dateTimeFieldType9, (int) '4');
        org.joda.time.LocalDate localDate12 = dateMidnight11.toLocalDate();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableDuration14);
        org.joda.time.MutablePeriod mutablePeriod16 = period15.toMutablePeriod();
        java.lang.Object obj17 = mutablePeriod16.clone();
        org.joda.time.LocalDate localDate19 = localDate12.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod16, (int) (byte) 1);
        org.joda.time.LocalDate.Property property20 = localDate12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = localDate12.getField((int) (short) 0);
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay24.toDateTime(timeOfDay25);
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay24.minusDays((int) (byte) 1);
        int int29 = dateTimeField22.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay28);
        boolean boolean30 = instant1.equals((java.lang.Object) int29);
        org.joda.time.Instant instant32 = instant1.withMillis((long) 3);
        org.joda.time.MutableDateTime mutableDateTime33 = instant1.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime34 = instant1.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime33", (instant1.compareTo(mutableDateTime33) == 0) == instant1.equals(mutableDateTime33));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plusWeeks((int) 'u');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableDuration15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long21 = dateTimeZone19.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight22.plusMonths(0);
        org.joda.time.Duration duration27 = period16.toDurationTo((org.joda.time.ReadableInstant) dateMidnight26);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight13.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Instant instant29 = instant3.plus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableDuration31);
        org.joda.time.MutablePeriod mutablePeriod33 = period32.toMutablePeriod();
        java.lang.Object obj34 = mutablePeriod33.clone();
        org.joda.time.MutablePeriod mutablePeriod35 = mutablePeriod33.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology38 = localTime37.getChronology();
        mutablePeriod33.setPeriod(readableDuration36, chronology38);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long44 = dateTimeZone42.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((long) 31, dateTimeZone42);
        org.joda.time.Chronology chronology47 = chronology38.withZone(dateTimeZone42);
        org.joda.time.DurationField durationField48 = chronology38.seconds();
        org.joda.time.DurationField durationField49 = chronology38.centuries();
        org.joda.time.DateTimeField dateTimeField50 = chronology38.centuryOfEra();
        org.joda.time.DateTime dateTime51 = instant3.toDateTime(chronology38);
        org.joda.time.MutableDateTime mutableDateTime52 = instant3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.Instant instant54 = instant3.minus(readableDuration53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant54 and mutableDateTime52", (instant54.compareTo(mutableDateTime52) == 0) == instant54.equals(mutableDateTime52));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DurationField durationField2 = durationFieldType0.getField(chronology1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableDuration4);
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        java.lang.Object obj7 = mutablePeriod6.clone();
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod6.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        mutablePeriod6.setPeriod(readableDuration9, chronology11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long17 = dateTimeZone15.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) 31, dateTimeZone15);
        org.joda.time.Chronology chronology20 = chronology11.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField21 = chronology11.seconds();
        org.joda.time.DurationField durationField22 = chronology11.centuries();
        org.joda.time.DateTimeField dateTimeField23 = chronology11.centuryOfEra();
        boolean boolean24 = durationFieldType0.isSupported(chronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField21", (durationField2.compareTo(durationField21) == 0) == durationField2.equals(durationField21));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 205);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Instant instant4 = instant1.minus((long) 22);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 59);
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay8.toDateTime(timeOfDay9);
        org.joda.time.DateTime dateTime12 = dateTime10.plus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long17 = dateTimeZone15.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone15);
        org.joda.time.DateTime dateTime20 = dateTime10.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime23 = dateTime20.withDurationAdded((long) 14, (int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableDuration25);
        org.joda.time.MutablePeriod mutablePeriod27 = period26.toMutablePeriod();
        java.lang.Object obj28 = mutablePeriod27.clone();
        mutablePeriod27.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay32.toDateTime(timeOfDay33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime34.toMutableDateTime();
        org.joda.time.DateTime dateTime38 = dateTime34.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration39 = mutablePeriod27.toDurationTo((org.joda.time.ReadableInstant) dateTime34);
        long long40 = duration39.getMillis();
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant42, readableDuration43);
        org.joda.time.MutablePeriod mutablePeriod45 = period44.toMutablePeriod();
        org.joda.time.Period period47 = period44.plusHours((int) 'a');
        org.joda.time.Period period49 = period44.withWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType50 = period44.getPeriodType();
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay53 = null;
        org.joda.time.DateTime dateTime54 = yearMonthDay52.toDateTime(timeOfDay53);
        org.joda.time.DateTime dateTime56 = dateTime54.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime54.toMutableDateTime();
        java.lang.Object obj58 = mutableDateTime57.clone();
        org.joda.time.Chronology chronology59 = mutableDateTime57.getChronology();
        org.joda.time.DurationField durationField60 = chronology59.weekyears();
        org.joda.time.DateMidnight dateMidnight61 = org.joda.time.DateMidnight.now(chronology59);
        org.joda.time.DateTimeField dateTimeField62 = chronology59.weekOfWeekyear();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) (-292275054), periodType50, chronology59);
        int int64 = periodType50.size();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableDuration) duration39, periodType50);
        mutableDateTime6.add((org.joda.time.ReadableDuration) duration39);
        org.joda.time.Instant instant67 = instant4.plus((org.joda.time.ReadableDuration) duration39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withDurationAdded((long) ' ', 1);
        org.joda.time.MutableDateTime mutableDateTime10 = dateMidnight4.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight12 = org.joda.time.DateMidnight.now(dateTimeZone11);
        long long14 = dateTimeZone11.previousTransition((long) 86399999);
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long20 = dateTimeZone18.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.minusMonths((int) ' ');
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusMinutes((int) (short) -1);
        org.joda.time.Chronology chronology28 = localDateTime25.getChronology();
        mutableDateTime10.setChronology(chronology28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime10.minuteOfDay();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime10.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime32 = property31.roundHalfEven();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and mutableDateTime32", (dateMidnight4.compareTo(mutableDateTime32) == 0) == dateMidnight4.equals(mutableDateTime32));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekyear((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime4.getZone();
        org.joda.time.DateTime dateTime9 = dateTime4.plusDays(4);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableDuration11);
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        java.lang.Object obj14 = mutablePeriod13.clone();
        org.joda.time.MutablePeriod mutablePeriod15 = mutablePeriod13.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        mutablePeriod13.setPeriod(readableDuration16, chronology18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long24 = dateTimeZone22.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) 31, dateTimeZone22);
        org.joda.time.Chronology chronology27 = chronology18.withZone(dateTimeZone22);
        org.joda.time.DurationField durationField28 = chronology18.seconds();
        org.joda.time.DurationField durationField29 = chronology18.centuries();
        org.joda.time.DateTimeField dateTimeField30 = chronology18.weekyear();
        org.joda.time.DateTime dateTime31 = dateTime9.withChronology(chronology18);
        org.joda.time.DateTime dateTime33 = dateTime9.plusHours(0);
        org.joda.time.DateTime dateTime35 = dateTime9.withWeekyear((-1));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime9", (dateTime31.compareTo(dateTime9) == 0) == dateTime31.equals(dateTime9));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        org.joda.time.Instant instant3 = instant0.withMillis(978307200035L);
        org.joda.time.MutableDateTime mutableDateTime4 = instant0.toMutableDateTime();
        mutableDateTime4.setWeekyear(44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long7 = dateTimeZone5.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.withField(dateTimeFieldType9, (int) '4');
        org.joda.time.LocalDate localDate12 = dateMidnight11.toLocalDate();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableDuration14);
        org.joda.time.MutablePeriod mutablePeriod16 = period15.toMutablePeriod();
        java.lang.Object obj17 = mutablePeriod16.clone();
        org.joda.time.LocalDate localDate19 = localDate12.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod16, (int) (byte) 1);
        org.joda.time.LocalDate.Property property20 = localDate12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = localDate12.getField((int) (short) 0);
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay24.toDateTime(timeOfDay25);
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay24.minusDays((int) (byte) 1);
        int int29 = dateTimeField22.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay28);
        boolean boolean30 = instant1.equals((java.lang.Object) int29);
        org.joda.time.Instant instant32 = instant1.withMillis((long) 3);
        org.joda.time.DateTime dateTime33 = instant1.toDateTime();
        org.joda.time.DateTime dateTime34 = instant1.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime33", (instant1.compareTo(dateTime33) == 0) == instant1.equals(dateTime33));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.plus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long10 = dateTimeZone8.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone8);
        org.joda.time.DateTime dateTime13 = dateTime3.withZoneRetainFields(dateTimeZone8);
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded((long) 14, (int) (byte) 0);
        org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableDuration22);
        org.joda.time.MutablePeriod mutablePeriod24 = period23.toMutablePeriod();
        org.joda.time.Period period26 = period23.plusHours((int) 'a');
        org.joda.time.Period period28 = period23.withWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType29 = period23.getPeriodType();
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology32 = yearMonthDay31.getChronology();
        org.joda.time.Period period33 = new org.joda.time.Period((long) (short) -1, 10L, periodType29, chronology32);
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.now(chronology32);
        org.joda.time.DateTimeField dateTimeField35 = chronology32.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime16.toMutableDateTime(chronology32);
        org.joda.time.DateTime dateTime38 = dateTime16.minusYears(167);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and mutableDateTime36", (dateTime16.compareTo(mutableDateTime36) == 0) == dateTime16.equals(mutableDateTime36));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Period period4 = new org.joda.time.Period((org.joda.time.ReadablePartial) yearMonthDay1, (org.joda.time.ReadablePartial) yearMonthDay3);
        org.joda.time.Period period5 = period4.toPeriod();
        org.joda.time.Duration duration6 = period4.toStandardDuration();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay8.toDateTime(timeOfDay9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime10.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField14 = null;
        mutableDateTime13.setRounding(dateTimeField14, (int) '#');
        mutableDateTime13.setMillis((long) 'u');
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long23 = dateTimeZone21.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone21);
        mutableDateTime13.setZoneRetainFields(dateTimeZone21);
        int int27 = mutableDateTime13.getWeekOfWeekyear();
        mutableDateTime13.setWeekOfWeekyear((int) (byte) 10);
        org.joda.time.Instant instant30 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime13.yearOfEra();
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant35 = instant33.withMillis(0L);
        org.joda.time.Chronology chronology36 = instant35.getChronology();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long41 = dateTimeZone39.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(dateTimeZone39);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone39);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.plusWeeks((int) 'u');
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant46, readableDuration47);
        org.joda.time.MutablePeriod mutablePeriod49 = period48.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long53 = dateTimeZone51.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(dateTimeZone51);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight54.plusMonths(0);
        org.joda.time.Duration duration59 = period48.toDurationTo((org.joda.time.ReadableInstant) dateMidnight58);
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight45.minus((org.joda.time.ReadableDuration) duration59);
        org.joda.time.Instant instant61 = instant35.plus((org.joda.time.ReadableDuration) duration59);
        mutableDateTime13.add((org.joda.time.ReadableDuration) duration59, 895);
        boolean boolean64 = duration6.isLongerThan((org.joda.time.ReadableDuration) duration59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant30", (mutableDateTime13.compareTo(instant30) == 0) == mutableDateTime13.equals(instant30));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTime(timeOfDay3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.minuteOfHour();
        mutableDateTime7.setMillisOfSecond((int) (byte) 10);
        mutableDateTime7.setYear(4);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundFloor();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long18 = dateTimeZone16.previousTransition((long) 100);
        boolean boolean20 = dateTimeZone16.isStandardOffset((long) 1969);
        mutableDateTime14.setZoneRetainFields(dateTimeZone16);
        boolean boolean23 = dateTimeZone16.isStandardOffset(31556952000L);
        org.joda.time.DateMidnight dateMidnight24 = org.joda.time.DateMidnight.now(dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(35L, dateTimeZone16);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight25.withFieldAdded(durationFieldType26, 808);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTime dateTime32 = yearMonthDay30.toDateTime(timeOfDay31);
        org.joda.time.DateTime dateTime33 = yearMonthDay30.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar34 = dateTime33.toGregorianCalendar();
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant36, readableDuration37);
        org.joda.time.MutablePeriod mutablePeriod39 = period38.toMutablePeriod();
        org.joda.time.Period period41 = period38.plusHours((int) 'a');
        org.joda.time.Period period43 = period38.withWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType44 = period38.getPeriodType();
        org.joda.time.YearMonthDay yearMonthDay46 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay47 = null;
        org.joda.time.DateTime dateTime48 = yearMonthDay46.toDateTime(timeOfDay47);
        org.joda.time.DateTime dateTime50 = dateTime48.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime48.toMutableDateTime();
        java.lang.Object obj52 = mutableDateTime51.clone();
        org.joda.time.Chronology chronology53 = mutableDateTime51.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.weekyears();
        org.joda.time.DateMidnight dateMidnight55 = org.joda.time.DateMidnight.now(chronology53);
        org.joda.time.DateTimeField dateTimeField56 = chronology53.weekOfWeekyear();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) (-292275054), periodType44, chronology53);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(chronology53);
        org.joda.time.DateTime dateTime59 = dateTime33.withChronology(chronology53);
        org.joda.time.DurationField durationField60 = durationFieldType26.getField(chronology53);
        java.lang.String str61 = durationFieldType26.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField54 and durationField60", (durationField54.compareTo(durationField60) == 0) == durationField54.equals(durationField60));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableDuration3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        java.lang.Object obj6 = mutablePeriod5.clone();
        mutablePeriod5.setYears((int) ' ');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.Period period14 = period11.plusHours((int) 'a');
        org.joda.time.Period period16 = period11.withWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType17 = period11.getPeriodType();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.weekyearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod5, periodType17, chronology19);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(periodType17);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(3599989999L);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.halfdayOfDay();
        org.joda.time.Period period27 = new org.joda.time.Period((long) 1, 31556952000L, periodType17, chronology25);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = chronology25.clockhourOfHalfday();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(chronology25);
        org.joda.time.DateTime.Property property31 = dateTime30.monthOfYear();
        org.joda.time.Instant instant32 = dateTime30.toInstant();
        org.joda.time.DateTime dateTime33 = instant32.toDateTimeISO();
        org.joda.time.Instant instant36 = instant32.withDurationAdded((long) 224, 675);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime33", (dateTime30.compareTo(dateTime33) == 0) == dateTime30.equals(dateTime33));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plusWeeks((int) 'u');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableDuration15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long21 = dateTimeZone19.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight22.plusMonths(0);
        org.joda.time.Duration duration27 = period16.toDurationTo((org.joda.time.ReadableInstant) dateMidnight26);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight13.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Instant instant29 = instant3.plus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableDuration31);
        org.joda.time.MutablePeriod mutablePeriod33 = period32.toMutablePeriod();
        java.lang.Object obj34 = mutablePeriod33.clone();
        org.joda.time.MutablePeriod mutablePeriod35 = mutablePeriod33.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology38 = localTime37.getChronology();
        mutablePeriod33.setPeriod(readableDuration36, chronology38);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long44 = dateTimeZone42.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((long) 31, dateTimeZone42);
        org.joda.time.Chronology chronology47 = chronology38.withZone(dateTimeZone42);
        org.joda.time.DurationField durationField48 = chronology38.seconds();
        org.joda.time.DurationField durationField49 = chronology38.centuries();
        org.joda.time.DateTimeField dateTimeField50 = chronology38.centuryOfEra();
        org.joda.time.DateTime dateTime51 = instant3.toDateTime(chronology38);
        org.joda.time.MutableDateTime mutableDateTime52 = instant3.toMutableDateTime();
        org.joda.time.Instant instant54 = instant3.minus(1990L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime52", (instant3.compareTo(mutableDateTime52) == 0) == instant3.equals(mutableDateTime52));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay1.minusYears(1);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long10 = dateTimeZone8.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone8);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.withField(dateTimeFieldType12, (int) '4');
        org.joda.time.DateTime dateTime15 = dateMidnight14.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.minusWeeks(59);
        java.util.GregorianCalendar gregorianCalendar18 = dateTime15.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getOffsetFromLocal((long) 'u');
        java.lang.String str23 = dateTimeZone19.getName((long) 27);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((java.lang.Object) gregorianCalendar18, dateTimeZone19);
        org.joda.time.Interval interval26 = yearMonthDay1.toInterval(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight11 and dateTime25", (dateMidnight11.compareTo(dateTime25) == 0) == dateMidnight11.equals(dateTime25));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readableDuration5);
        org.joda.time.DateTime dateTime8 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime10 = dateTime4.withMillis((long) 'a');
        int int11 = dateTime4.getYear();
        org.joda.time.DateTime dateTime13 = dateTime4.plusWeeks(1970);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay16.toDateTime(timeOfDay17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime18.toMutableDateTime();
        java.lang.Object obj22 = mutableDateTime21.clone();
        org.joda.time.Chronology chronology23 = mutableDateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.era();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType14.getField(chronology23);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = dateTimeField25.getType();
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology29 = yearMonthDay28.getChronology();
        boolean boolean30 = dateTimeFieldType26.isSupported(chronology29);
        org.joda.time.DurationField durationField31 = chronology29.centuries();
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime4.toMutableDateTime(chronology29);
        org.joda.time.Partial partial33 = new org.joda.time.Partial(chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime32", (dateTime4.compareTo(mutableDateTime32) == 0) == dateTime4.equals(mutableDateTime32));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DurationField durationField11 = chronology8.hours();
        org.joda.time.DurationField durationField12 = chronology8.eras();
        org.joda.time.DurationField durationField13 = chronology8.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField12", Math.signum(durationField11.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField11)));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime4.secondOfDay();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.DateTime dateTime10 = property7.addToCopy(113);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant14 = instant12.withMillis(0L);
        org.joda.time.Chronology chronology15 = instant14.getChronology();
        org.joda.time.Instant instant17 = instant14.minus(3599989999L);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableDuration21);
        org.joda.time.MutablePeriod mutablePeriod23 = period22.toMutablePeriod();
        org.joda.time.Period period25 = period22.plusHours((int) 'a');
        org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
        org.joda.time.Period period27 = period25.negated();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DurationField durationField30 = durationFieldType28.getField(chronology29);
        boolean boolean31 = period25.isSupported(durationFieldType28);
        mutableDateTime19.add((org.joda.time.ReadablePeriod) period25);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight34 = org.joda.time.DateMidnight.now(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long38 = dateTimeZone36.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(dateTimeZone36);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight39.withField(dateTimeFieldType40, (int) '4');
        boolean boolean43 = dateMidnight34.isBefore((org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        boolean boolean45 = dateMidnight34.isEqual(readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant46, readableDuration47);
        org.joda.time.MutablePeriod mutablePeriod49 = period48.toMutablePeriod();
        java.lang.Object obj50 = mutablePeriod49.clone();
        mutablePeriod49.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay55 = null;
        org.joda.time.DateTime dateTime56 = yearMonthDay54.toDateTime(timeOfDay55);
        org.joda.time.DateTime dateTime58 = dateTime56.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime56.toMutableDateTime();
        org.joda.time.DateTime dateTime60 = dateTime56.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration61 = mutablePeriod49.toDurationTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration62 = duration61.toDuration();
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight34.minus((org.joda.time.ReadableDuration) duration61);
        mutableDateTime19.add((org.joda.time.ReadableDuration) duration61);
        org.joda.time.Instant instant65 = instant14.minus((org.joda.time.ReadableDuration) duration61);
        org.joda.time.DateTime dateTime66 = dateTime10.plus((org.joda.time.ReadableDuration) duration61);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant67, readableDuration68);
        org.joda.time.MutablePeriod mutablePeriod70 = period69.toMutablePeriod();
        java.lang.Object obj71 = mutablePeriod70.clone();
        mutablePeriod70.setYears((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod74 = mutablePeriod70.copy();
        org.joda.time.DateTime dateTime75 = dateTime10.plus((org.joda.time.ReadablePeriod) mutablePeriod70);
        boolean boolean76 = dateTime75.isAfterNow();
        org.joda.time.YearMonthDay yearMonthDay78 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay79 = null;
        org.joda.time.DateTime dateTime80 = yearMonthDay78.toDateTime(timeOfDay79);
        org.joda.time.DateTime dateTime81 = dateTime80.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone82 = dateTime81.getZone();
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale85 = java.util.Locale.ROOT;
        java.lang.String str86 = dateTimeZone83.getShortName((long) 86399999, locale85);
        long long88 = dateTimeZone82.getMillisKeepLocal(dateTimeZone83, (long) (-3600000));
        org.joda.time.MutableDateTime mutableDateTime89 = org.joda.time.MutableDateTime.now(dateTimeZone83);
        java.lang.String str90 = dateTimeZone83.toString();
        org.joda.time.LocalDate localDate91 = new org.joda.time.LocalDate(dateTimeZone83);
        org.joda.time.DateTime dateTime92 = dateTime75.withZone(dateTimeZone83);
        org.joda.time.LocalDate localDate93 = org.joda.time.LocalDate.now(dateTimeZone83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime89", (dateTime4.compareTo(mutableDateTime89) == 0) == dateTime4.equals(mutableDateTime89));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        long long17 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, (long) 59);
        org.joda.time.DateMidnight dateMidnight18 = yearMonthDay5.toDateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.dayOfWeek();
        org.joda.time.Interval interval20 = dateMidnight18.toInterval();
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long26 = dateTimeZone24.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.plusWeeks((int) 'u');
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant31, readableDuration32);
        org.joda.time.MutablePeriod mutablePeriod34 = period33.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long38 = dateTimeZone36.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight39.plusMonths(0);
        org.joda.time.Duration duration44 = period33.toDurationTo((org.joda.time.ReadableInstant) dateMidnight43);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight30.minus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay48 = null;
        org.joda.time.DateTime dateTime49 = yearMonthDay47.toDateTime(timeOfDay48);
        org.joda.time.DateTime dateTime51 = dateTime49.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime49.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.DateTime dateTime55 = dateTime49.withDurationAdded(readableDuration53, (int) (short) 1);
        int int56 = dateTime49.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime49.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay59 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay60 = null;
        org.joda.time.DateTime dateTime61 = yearMonthDay59.toDateTime(timeOfDay60);
        org.joda.time.DateTime dateTime63 = dateTime61.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime64 = dateTime61.toMutableDateTime();
        java.lang.Object obj65 = mutableDateTime64.clone();
        int int66 = mutableDateTime64.getHourOfDay();
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant67, readableDuration68);
        org.joda.time.MutablePeriod mutablePeriod70 = period69.toMutablePeriod();
        java.lang.Object obj71 = mutablePeriod70.clone();
        mutablePeriod70.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay75 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay76 = null;
        org.joda.time.DateTime dateTime77 = yearMonthDay75.toDateTime(timeOfDay76);
        org.joda.time.DateTime dateTime79 = dateTime77.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime80 = dateTime77.toMutableDateTime();
        org.joda.time.DateTime dateTime81 = dateTime77.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration82 = mutablePeriod70.toDurationTo((org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.Duration duration83 = duration82.toDuration();
        mutableDateTime64.add((org.joda.time.ReadableDuration) duration82);
        mutableDateTime57.add((org.joda.time.ReadableDuration) duration82);
        boolean boolean86 = duration44.isShorterThan((org.joda.time.ReadableDuration) duration82);
        org.joda.time.Instant instant87 = instant21.plus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.DateMidnight dateMidnight88 = dateMidnight18.plus((org.joda.time.ReadableDuration) duration44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant21", (dateTime10.compareTo(instant21) == 0) == dateTime10.equals(instant21));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        java.lang.Object obj4 = mutablePeriod3.clone();
        mutablePeriod3.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay8.toDateTime(timeOfDay9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime10.toMutableDateTime();
        org.joda.time.DateTime dateTime14 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration15 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateTime10);
        long long16 = duration15.getMillis();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay18.toDateTime(timeOfDay19);
        org.joda.time.DateTime dateTime21 = dateTime20.toDateTime();
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(periodType22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, (org.joda.time.ReadableInstant) dateTime20, periodType22);
        org.joda.time.DateTime dateTime26 = dateTime20.minusWeeks(149);
        org.joda.time.DateTime dateTime28 = dateTime20.plusMillis(50073);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTime dateTime32 = yearMonthDay30.toDateTime(timeOfDay31);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime32.toMutableDateTime();
        java.lang.Object obj36 = mutableDateTime35.clone();
        org.joda.time.Chronology chronology37 = mutableDateTime35.getChronology();
        org.joda.time.ReadableDuration readableDuration38 = null;
        mutableDateTime35.add(readableDuration38);
        mutableDateTime35.setMillis((long) (-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay45 = null;
        org.joda.time.DateTime dateTime46 = yearMonthDay44.toDateTime(timeOfDay45);
        org.joda.time.YearMonthDay yearMonthDay48 = yearMonthDay44.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long52 = dateTimeZone50.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long57 = dateTimeZone55.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now(dateTimeZone55);
        long long60 = dateTimeZone50.getMillisKeepLocal(dateTimeZone55, (long) 59);
        org.joda.time.DateMidnight dateMidnight61 = yearMonthDay48.toDateMidnight(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long65 = dateTimeZone63.convertUTCToLocal(10L);
        int int67 = dateTimeZone63.getStandardOffset((long) (byte) 100);
        int int69 = dateTimeZone63.getStandardOffset((long) 1);
        org.joda.time.DateTime dateTime70 = yearMonthDay48.toDateTimeAtMidnight(dateTimeZone63);
        org.joda.time.Chronology chronology71 = yearMonthDay48.getChronology();
        org.joda.time.DateTimeField dateTimeField72 = dateTimeFieldType42.getField(chronology71);
        org.joda.time.DateTime dateTime73 = mutableDateTime35.toDateTime(chronology71);
        org.joda.time.DateTime dateTime74 = dateTime28.toDateTime(chronology71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime35 and dateTime73", (mutableDateTime35.compareTo(dateTime73) == 0) == mutableDateTime35.equals(dateTime73));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = dateTime3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime3.minusSeconds((int) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableDuration11);
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        org.joda.time.Period period15 = period12.plusHours((int) 'a');
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Period period17 = period15.negated();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DurationField durationField20 = durationFieldType18.getField(chronology19);
        boolean boolean21 = period15.isSupported(durationFieldType18);
        mutableDateTime9.add((org.joda.time.ReadablePeriod) period15);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight24 = org.joda.time.DateMidnight.now(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long28 = dateTimeZone26.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(dateTimeZone26);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight29.withField(dateTimeFieldType30, (int) '4');
        boolean boolean33 = dateMidnight24.isBefore((org.joda.time.ReadableInstant) dateMidnight32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        boolean boolean35 = dateMidnight24.isEqual(readableInstant34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant36, readableDuration37);
        org.joda.time.MutablePeriod mutablePeriod39 = period38.toMutablePeriod();
        java.lang.Object obj40 = mutablePeriod39.clone();
        mutablePeriod39.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay45 = null;
        org.joda.time.DateTime dateTime46 = yearMonthDay44.toDateTime(timeOfDay45);
        org.joda.time.DateTime dateTime48 = dateTime46.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime46.toMutableDateTime();
        org.joda.time.DateTime dateTime50 = dateTime46.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration51 = mutablePeriod39.toDurationTo((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Duration duration52 = duration51.toDuration();
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight24.minus((org.joda.time.ReadableDuration) duration51);
        mutableDateTime9.add((org.joda.time.ReadableDuration) duration51);
        org.joda.time.DateTime dateTime55 = dateTime3.minus((org.joda.time.ReadableDuration) duration51);
        org.joda.time.Instant instant56 = dateTime55.toInstant();
        org.joda.time.YearMonthDay yearMonthDay58 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay59 = null;
        org.joda.time.DateTime dateTime60 = yearMonthDay58.toDateTime(timeOfDay59);
        org.joda.time.DateTime dateTime62 = dateTime60.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime63 = dateTime60.toMutableDateTime();
        java.lang.Object obj64 = mutableDateTime63.clone();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        mutableDateTime63.setZone(dateTimeZone66);
        mutableDateTime63.add((long) 20);
        org.joda.time.Period period74 = new org.joda.time.Period((int) (short) -1, 182, (int) (short) 100, (int) (byte) -1);
        org.joda.time.Minutes minutes75 = period74.toStandardMinutes();
        org.joda.time.YearMonthDay yearMonthDay77 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay78 = null;
        org.joda.time.DateTime dateTime79 = yearMonthDay77.toDateTime(timeOfDay78);
        org.joda.time.DateTime dateTime80 = yearMonthDay77.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration81 = null;
        org.joda.time.DateTime dateTime82 = dateTime80.minus(readableDuration81);
        org.joda.time.DateTime dateTime84 = dateTime80.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime86 = dateTime80.withMillis((long) 'a');
        int int87 = dateTime80.getYear();
        org.joda.time.Duration duration88 = period74.toDurationFrom((org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.DateTime dateTime91 = dateTime80.withDurationAdded(1009843200000L, (int) 'a');
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime63, (org.joda.time.ReadableInstant) dateTime91);
        int int93 = dateTime55.compareTo((org.joda.time.ReadableInstant) mutableDateTime63);
        mutableDateTime63.setMinuteOfDay(630);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime55 and instant56", (dateTime55.compareTo(instant56) == 0) == dateTime55.equals(instant56));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        java.lang.Object obj4 = mutablePeriod3.clone();
        org.joda.time.MutablePeriod mutablePeriod5 = mutablePeriod3.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        mutablePeriod3.setPeriod(readableDuration6, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long14 = dateTimeZone12.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 31, dateTimeZone12);
        org.joda.time.Chronology chronology17 = chronology8.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField18 = chronology8.seconds();
        org.joda.time.DurationField durationField19 = chronology8.centuries();
        org.joda.time.DateTimeField dateTimeField20 = chronology8.weekyear();
        org.joda.time.DurationField durationField21 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField18, and durationField19", !(durationField21.compareTo(durationField18) == 0) || (Math.signum(durationField21.compareTo(durationField19)) == Math.signum(durationField18.compareTo(durationField19))));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(dateTimeZone2);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableDuration9);
        org.joda.time.MutablePeriod mutablePeriod11 = period10.toMutablePeriod();
        org.joda.time.Period period13 = period10.plusHours((int) 'a');
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Period period15 = period13.negated();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DurationField durationField18 = durationFieldType16.getField(chronology17);
        boolean boolean19 = period13.isSupported(durationFieldType16);
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay7.withFieldAdded(durationFieldType16, 30);
        org.joda.time.DateTime dateTime22 = timeOfDay21.toDateTimeToday();
        int int23 = dateTime22.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        org.joda.time.DateTime dateTime26 = dateTime22.withZoneRetainFields(dateTimeZone25);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.years();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long32 = dateTimeZone30.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(dateTimeZone30);
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone30);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(dateTimeZone30);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant36, readableDuration37);
        org.joda.time.MutablePeriod mutablePeriod39 = period38.toMutablePeriod();
        org.joda.time.Period period41 = period38.plusHours((int) 'a');
        org.joda.time.Minutes minutes42 = period41.toStandardMinutes();
        org.joda.time.Period period43 = period41.negated();
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DurationField durationField46 = durationFieldType44.getField(chronology45);
        boolean boolean47 = period41.isSupported(durationFieldType44);
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay35.withFieldAdded(durationFieldType44, 30);
        boolean boolean50 = periodType27.isSupported(durationFieldType44);
        org.joda.time.DateTime dateTime52 = dateTime22.withFieldAdded(durationFieldType44, 646);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant53, readableDuration54);
        org.joda.time.MutablePeriod mutablePeriod56 = period55.toMutablePeriod();
        java.lang.Object obj57 = mutablePeriod56.clone();
        org.joda.time.MutablePeriod mutablePeriod58 = mutablePeriod56.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.LocalTime localTime60 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology61 = localTime60.getChronology();
        mutablePeriod56.setPeriod(readableDuration59, chronology61);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long67 = dateTimeZone65.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime68 = org.joda.time.DateTime.now(dateTimeZone65);
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime((long) 31, dateTimeZone65);
        org.joda.time.Chronology chronology70 = chronology61.withZone(dateTimeZone65);
        org.joda.time.DurationField durationField71 = chronology61.seconds();
        org.joda.time.DurationField durationField72 = chronology61.centuries();
        org.joda.time.DateMidnight dateMidnight73 = org.joda.time.DateMidnight.now(chronology61);
        org.joda.time.DurationField durationField74 = durationFieldType44.getField(chronology61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField74", (durationField18.compareTo(durationField74) == 0) == durationField18.equals(durationField74));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay1.toDateTime(timeOfDay2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime3.toMutableDateTime();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DurationField durationField11 = chronology8.hours();
        org.joda.time.DurationField durationField12 = chronology8.eras();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField12", Math.signum(durationField11.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField11)));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime4.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = dateTimeField8.getAsText((long) 100, locale10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long16 = dateTimeZone14.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone14);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(dateTimeZone14);
        int[] intArray23 = new int[] { '#', 3, 31 };
        int int24 = dateTimeField8.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay19, intArray23);
        int int25 = timeOfDay19.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay19.withSecondOfMinute(40);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.parse("113");
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime29.copy();
        mutableDateTime29.setDate((long) 53338);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime29.yearOfEra();
        org.joda.time.format.DateTimePrinter dateTimePrinter34 = null;
        org.joda.time.format.DateTimeParser dateTimeParser35 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter34, dateTimeParser35);
        boolean boolean37 = dateTimeFormatter36.isPrinter();
        org.joda.time.LocalTime localTime38 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology39 = localTime38.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter36.withChronology(chronology39);
        org.joda.time.DurationField durationField41 = chronology39.halfdays();
        mutableDateTime29.setChronology(chronology39);
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay19.withChronologyRetainFields(chronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight18 and mutableDateTime29", (dateMidnight18.compareTo(mutableDateTime29) == 0) == dateMidnight18.equals(mutableDateTime29));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableDuration3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.Period period7 = period4.plusHours((int) 'a');
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Period period9 = period7.negated();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType10.getField(chronology11);
        boolean boolean13 = period7.isSupported(durationFieldType10);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight16 = org.joda.time.DateMidnight.now(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long20 = dateTimeZone18.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight21.withField(dateTimeFieldType22, (int) '4');
        boolean boolean25 = dateMidnight16.isBefore((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        boolean boolean27 = dateMidnight16.isEqual(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableDuration29);
        org.joda.time.MutablePeriod mutablePeriod31 = period30.toMutablePeriod();
        java.lang.Object obj32 = mutablePeriod31.clone();
        mutablePeriod31.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay37 = null;
        org.joda.time.DateTime dateTime38 = yearMonthDay36.toDateTime(timeOfDay37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime38.toMutableDateTime();
        org.joda.time.DateTime dateTime42 = dateTime38.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration43 = mutablePeriod31.toDurationTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Duration duration44 = duration43.toDuration();
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight16.minus((org.joda.time.ReadableDuration) duration43);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration43);
        mutableDateTime1.addYears(182);
        mutableDateTime1.setTime((long) 49728473);
        org.joda.time.Instant instant51 = mutableDateTime1.toInstant();
        boolean boolean53 = mutableDateTime1.isAfter((long) 808);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant54, readableDuration55);
        org.joda.time.MutablePeriod mutablePeriod57 = period56.toMutablePeriod();
        java.lang.Object obj58 = mutablePeriod57.clone();
        org.joda.time.MutablePeriod mutablePeriod59 = mutablePeriod57.toMutablePeriod();
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.LocalTime localTime61 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology62 = localTime61.getChronology();
        mutablePeriod57.setPeriod(readableDuration60, chronology62);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long68 = dateTimeZone66.convertUTCToLocal(10L);
        org.joda.time.DateTime dateTime69 = org.joda.time.DateTime.now(dateTimeZone66);
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime((long) 31, dateTimeZone66);
        org.joda.time.Chronology chronology71 = chronology62.withZone(dateTimeZone66);
        org.joda.time.DurationField durationField72 = chronology62.seconds();
        org.joda.time.DurationField durationField73 = chronology62.centuries();
        org.joda.time.DateTimeField dateTimeField74 = chronology62.weekyear();
        org.joda.time.DateTimeField dateTimeField75 = chronology62.weekyearOfCentury();
        mutableDateTime1.setRounding(dateTimeField75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField72", (durationField12.compareTo(durationField72) == 0) == durationField12.equals(durationField72));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.months();
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay3.toDateTime(timeOfDay4);
        org.joda.time.DateTime dateTime6 = yearMonthDay3.toDateTimeAtMidnight();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.DateTime dateTime9 = dateTime6.minusMinutes((int) ' ');
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.DurationField durationField11 = durationFieldType1.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.dayOfWeek();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(chronology10);
        org.joda.time.DateTimeField dateTimeField14 = chronology10.era();
        org.joda.time.DurationField durationField15 = chronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.era();
        org.joda.time.DurationField durationField17 = chronology10.years();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 67, chronology10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField17", (durationField15.compareTo(durationField17) == 0) == durationField15.equals(durationField17));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableDuration4);
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.Period period8 = period5.plusHours((int) 'a');
        org.joda.time.Period period10 = period5.withWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType11 = period5.getPeriodType();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology14 = yearMonthDay13.getChronology();
        org.joda.time.Period period15 = new org.joda.time.Period((long) (short) -1, 10L, periodType11, chronology14);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now(chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.era();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 70, chronology14);
        org.joda.time.DurationField durationField20 = chronology14.eras();
        org.joda.time.DurationField durationField21 = chronology14.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField21, and durationField20", !(durationField20.compareTo(durationField21) == 0) || (Math.signum(durationField20.compareTo(durationField20)) == Math.signum(durationField21.compareTo(durationField20))));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableDuration3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.Period period7 = period4.plusHours((int) 'a');
        org.joda.time.Period period9 = period4.withWeeks((int) (byte) -1);
        org.joda.time.PeriodType periodType10 = period4.getPeriodType();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.Chronology chronology13 = yearMonthDay12.getChronology();
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) -1, 10L, periodType10, chronology13);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableDuration21);
        org.joda.time.MutablePeriod mutablePeriod23 = period22.toMutablePeriod();
        org.joda.time.Period period25 = period22.plusHours((int) 'a');
        org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
        org.joda.time.Period period27 = period25.negated();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DurationField durationField30 = durationFieldType28.getField(chronology29);
        boolean boolean31 = period25.isSupported(durationFieldType28);
        mutableDateTime19.add((org.joda.time.ReadablePeriod) period25);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight34 = org.joda.time.DateMidnight.now(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long38 = dateTimeZone36.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(dateTimeZone36);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight39.withField(dateTimeFieldType40, (int) '4');
        boolean boolean43 = dateMidnight34.isBefore((org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        boolean boolean45 = dateMidnight34.isEqual(readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant46, readableDuration47);
        org.joda.time.MutablePeriod mutablePeriod49 = period48.toMutablePeriod();
        java.lang.Object obj50 = mutablePeriod49.clone();
        mutablePeriod49.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay55 = null;
        org.joda.time.DateTime dateTime56 = yearMonthDay54.toDateTime(timeOfDay55);
        org.joda.time.DateTime dateTime58 = dateTime56.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime56.toMutableDateTime();
        org.joda.time.DateTime dateTime60 = dateTime56.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration61 = mutablePeriod49.toDurationTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration62 = duration61.toDuration();
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight34.minus((org.joda.time.ReadableDuration) duration61);
        mutableDateTime19.add((org.joda.time.ReadableDuration) duration61);
        org.joda.time.YearMonthDay yearMonthDay66 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay67 = null;
        org.joda.time.DateTime dateTime68 = yearMonthDay66.toDateTime(timeOfDay67);
        org.joda.time.DateTime dateTime70 = dateTime68.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime68.toMutableDateTime();
        java.lang.Object obj72 = mutableDateTime71.clone();
        org.joda.time.Chronology chronology73 = mutableDateTime71.getChronology();
        org.joda.time.DateTimeField dateTimeField74 = chronology73.era();
        org.joda.time.DateTimeField dateTimeField75 = chronology73.millisOfSecond();
        org.joda.time.DurationField durationField76 = chronology73.years();
        org.joda.time.DateTimeField dateTimeField77 = chronology73.hourOfDay();
        mutableDateTime19.setChronology(chronology73);
        org.joda.time.DateTimeField dateTimeField79 = chronology73.year();
        org.joda.time.MutableDateTime mutableDateTime80 = dateMidnight17.toMutableDateTime(chronology73);
        org.joda.time.DurationField durationField81 = chronology73.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight17 and mutableDateTime80", (dateMidnight17.compareTo(mutableDateTime80) == 0) == dateMidnight17.equals(mutableDateTime80));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withDurationAdded((long) ' ', 1);
        org.joda.time.MutableDateTime mutableDateTime10 = dateMidnight4.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight12 = org.joda.time.DateMidnight.now(dateTimeZone11);
        long long14 = dateTimeZone11.previousTransition((long) 86399999);
        mutableDateTime10.setZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long20 = dateTimeZone18.convertUTCToLocal(10L);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.minusMonths((int) ' ');
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusMinutes((int) (short) -1);
        org.joda.time.Chronology chronology28 = localDateTime25.getChronology();
        mutableDateTime10.setChronology(chronology28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime10.minuteOfDay();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime10.minuteOfHour();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField33 = property32.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and mutableDateTime10", (dateMidnight4.compareTo(mutableDateTime10) == 0) == dateMidnight4.equals(mutableDateTime10));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.Instant instant6 = instant3.minus(3599989999L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.Period period14 = period11.plusHours((int) 'a');
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Period period16 = period14.negated();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DurationField durationField19 = durationFieldType17.getField(chronology18);
        boolean boolean20 = period14.isSupported(durationFieldType17);
        mutableDateTime8.add((org.joda.time.ReadablePeriod) period14);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateMidnight dateMidnight23 = org.joda.time.DateMidnight.now(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long27 = dateTimeZone25.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight28.withField(dateTimeFieldType29, (int) '4');
        boolean boolean32 = dateMidnight23.isBefore((org.joda.time.ReadableInstant) dateMidnight31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        boolean boolean34 = dateMidnight23.isEqual(readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableDuration36);
        org.joda.time.MutablePeriod mutablePeriod38 = period37.toMutablePeriod();
        java.lang.Object obj39 = mutablePeriod38.clone();
        mutablePeriod38.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay43.toDateTime(timeOfDay44);
        org.joda.time.DateTime dateTime47 = dateTime45.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime45.toMutableDateTime();
        org.joda.time.DateTime dateTime49 = dateTime45.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration50 = mutablePeriod38.toDurationTo((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Duration duration51 = duration50.toDuration();
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight23.minus((org.joda.time.ReadableDuration) duration50);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration50);
        org.joda.time.Instant instant54 = instant3.minus((org.joda.time.ReadableDuration) duration50);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant55, readableDuration56);
        org.joda.time.MutablePeriod mutablePeriod58 = period57.toMutablePeriod();
        java.lang.Object obj59 = mutablePeriod58.clone();
        mutablePeriod58.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay63 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay64 = null;
        org.joda.time.DateTime dateTime65 = yearMonthDay63.toDateTime(timeOfDay64);
        org.joda.time.DateTime dateTime67 = dateTime65.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime68 = dateTime65.toMutableDateTime();
        org.joda.time.DateTime dateTime69 = dateTime65.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration70 = mutablePeriod58.toDurationTo((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.ReadableDuration readableDuration72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period(readableInstant71, readableDuration72);
        org.joda.time.MutablePeriod mutablePeriod74 = period73.toMutablePeriod();
        java.lang.Object obj75 = mutablePeriod74.clone();
        mutablePeriod74.setYears((int) ' ');
        org.joda.time.YearMonthDay yearMonthDay79 = new org.joda.time.YearMonthDay((long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay80 = null;
        org.joda.time.DateTime dateTime81 = yearMonthDay79.toDateTime(timeOfDay80);
        org.joda.time.DateTime dateTime83 = dateTime81.minusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime84 = dateTime81.toMutableDateTime();
        org.joda.time.DateTime dateTime85 = dateTime81.withEarlierOffsetAtOverlap();
        org.joda.time.Duration duration86 = mutablePeriod74.toDurationTo((org.joda.time.ReadableInstant) dateTime81);
        long long87 = duration86.getMillis();
        mutablePeriod58.setPeriod((org.joda.time.ReadableDuration) duration86);
        org.joda.time.Instant instant89 = instant3.minus((org.joda.time.ReadableDuration) duration86);
        org.joda.time.DateTime dateTime90 = instant3.toDateTime();
        org.joda.time.Instant instant92 = instant3.plus((long) (-375));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime90", (instant3.compareTo(dateTime90) == 0) == instant3.equals(dateTime90));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long9 = dateTimeZone7.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) 'u', dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plusWeeks((int) 'u');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableDuration15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long21 = dateTimeZone19.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusWeeks((int) ' ');
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight22.plusMonths(0);
        org.joda.time.Duration duration27 = period16.toDurationTo((org.joda.time.ReadableInstant) dateMidnight26);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight13.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Instant instant29 = instant3.plus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Instant instant32 = instant3.withDurationAdded((long) 619, (-3600000));
        long long33 = instant3.getMillis();
        org.joda.time.Instant instant34 = instant3.toInstant();
        org.joda.time.DateTime dateTime35 = instant34.toDateTime();
        org.joda.time.Instant instant37 = instant34.plus(31535912000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant34 and dateTime35", (instant34.compareTo(dateTime35) == 0) == instant34.equals(dateTime35));
    }
}

