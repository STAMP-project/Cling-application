import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant3, periodType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int7 = instant3.get(dateTimeFieldType6);
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType6.getDurationType();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.millis();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 46, periodType12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(0L, 0L, periodType12, chronology14);
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod15.copy();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        int int22 = dateTime21.getSecondOfMinute();
        boolean boolean23 = dateTime21.isEqualNow();
        int int24 = dateTime21.getDayOfYear();
        org.joda.time.Chronology chronology25 = dateTime21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology25);
        mutablePeriod16.setPeriod((long) 21, chronology25);
        boolean boolean30 = dateTimeFieldType6.isSupported(chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime21", (instant3.compareTo(dateTime21) == 0) == instant3.equals(dateTime21));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis(0L);
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.eras();
        java.util.Locale locale9 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology7, locale9, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 53, chronology7);
        org.joda.time.DateTimeField dateTimeField13 = chronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = chronology7.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = chronology7.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology7.year();
        org.joda.time.Chronology chronology17 = chronology7.withUTC();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 100, 1L, periodType20);
        org.joda.time.Period period23 = period21.minusSeconds((-1));
        java.lang.String str24 = period21.toString();
        org.joda.time.Period period25 = period21.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod26 = period25.toMutablePeriod();
        org.joda.time.Period period28 = period25.minusDays(40);
        org.joda.time.MutablePeriod mutablePeriod29 = period25.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod29);
        long long33 = chronology17.add((org.joda.time.ReadablePeriod) mutablePeriod29, (long) 47, 365);
        org.joda.time.Period period34 = new org.joda.time.Period((long) 39221019, 3024000955L, chronology17);
        org.joda.time.DurationField durationField35 = chronology17.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField35, and durationField8", !(durationField8.compareTo(durationField35) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField35.compareTo(durationField8))));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration3, (int) (short) 100);
        mutableDateTime1.setYear(10);
        mutableDateTime1.addSeconds((int) (short) 0);
        mutableDateTime1.setTime(129383503200000L);
        int int12 = mutableDateTime1.getYearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 100, 1L, periodType17);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 100, 1L, periodType21);
        org.joda.time.Period period23 = period18.plus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.Instant instant26 = instant24.withMillis(0L);
        org.joda.time.Duration duration27 = period22.toDurationTo((org.joda.time.ReadableInstant) instant26);
        mutableDateTime14.add((org.joda.time.ReadableDuration) duration27, 39);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime14.secondOfMinute();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime14.hourOfDay();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime14.dayOfWeek();
        org.joda.time.Instant instant35 = new org.joda.time.Instant();
        org.joda.time.Instant instant37 = instant35.withMillis(0L);
        org.joda.time.Chronology chronology38 = instant37.getChronology();
        org.joda.time.DurationField durationField39 = chronology38.eras();
        java.util.Locale locale40 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology38, locale40, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property46 = localDateTime43.hourOfDay();
        org.joda.time.DateTimeField dateTimeField47 = property46.getField();
        int int48 = property46.get();
        org.joda.time.LocalDateTime localDateTime49 = property46.roundHalfFloorCopy();
        long long51 = chronology38.set((org.joda.time.ReadablePartial) localDateTime49, (long) 2022);
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.now(chronology38);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(chronology38);
        org.joda.time.DurationField durationField54 = chronology38.eras();
        java.util.Locale locale58 = new java.util.Locale("hi!", "clockhourOfDay", "java.io.IOException");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) 42, chronology38, locale58);
        org.joda.time.DateTimeZone dateTimeZone60 = dateTimeParserBucket59.getZone();
        mutableDateTime14.setZoneRetainFields(dateTimeZone60);
        mutableDateTime1.setZone(dateTimeZone60);
        org.joda.time.Duration duration64 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period65 = duration64.toPeriod();
        org.joda.time.Duration duration68 = duration64.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration72 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime70.add((org.joda.time.ReadableDuration) duration72, (int) (short) 100);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime(chronology75);
        int int77 = dateTime76.getYearOfCentury();
        org.joda.time.Interval interval78 = duration72.toIntervalTo((org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.Duration duration79 = duration68.minus((org.joda.time.ReadableDuration) duration72);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant24 and dateTime76", (instant24.compareTo(dateTime76) == 0) == instant24.equals(dateTime76));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant3, periodType4);
        org.joda.time.MutableDateTime mutableDateTime6 = instant3.toMutableDateTimeISO();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period9 = duration8.toPeriod();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.Duration duration15 = duration11.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period18 = duration17.toPeriod();
        org.joda.time.Duration duration19 = duration11.plus((org.joda.time.ReadableDuration) duration17);
        boolean boolean20 = duration8.isLongerThan((org.joda.time.ReadableDuration) duration11);
        long long21 = duration11.getStandardMinutes();
        org.joda.time.Instant instant22 = instant3.plus((org.joda.time.ReadableDuration) duration11);
        org.joda.time.MutableDateTime mutableDateTime23 = instant3.toMutableDateTimeISO();
        mutableDateTime23.add(129383503200000L);
        mutableDateTime23.setYear(39537343);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime6", (instant3.compareTo(mutableDateTime6) == 0) == instant3.equals(mutableDateTime6));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        boolean boolean4 = dateTime2.isEqualNow();
        int int5 = dateTime2.getDayOfYear();
        org.joda.time.Chronology chronology6 = dateTime2.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (-3268332), chronology6);
        mutablePeriod7.addSeconds(467);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate13 = localDate11.minusMonths((int) ' ');
        org.joda.time.Chronology chronology14 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology14);
        org.joda.time.DurationField durationField19 = chronology14.hours();
        org.joda.time.DateTimeField dateTimeField20 = chronology14.centuryOfEra();
        mutablePeriod7.setPeriod((long) 2712, chronology14);
        int int22 = mutablePeriod7.getWeeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and mutableDateTime18", (dateTime2.compareTo(mutableDateTime18) == 0) == dateTime2.equals(mutableDateTime18));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period19 = duration18.toPeriod();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.centuries();
        int int21 = period19.get(durationFieldType20);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) period19, 54);
        mutableDateTime1.setMillisOfDay(0);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime1.centuryOfEra();
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardHours((long) (short) 1);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate31 = localDate29.minusMonths((int) ' ');
        org.joda.time.Chronology chronology32 = localDate29.getChronology();
        org.joda.time.Period period33 = duration28.toPeriod(chronology32);
        org.joda.time.DateTime dateTime34 = mutableDateTime1.toDateTime(chronology32);
        org.joda.time.DurationField durationField35 = chronology32.hours();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime37.add((org.joda.time.ReadableDuration) duration39, (int) (short) 100);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (short) 1, chronology43);
        org.joda.time.Instant instant45 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) instant45, periodType46);
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate50 = localDate48.minusMonths((int) ' ');
        org.joda.time.Chronology chronology51 = localDate48.getChronology();
        org.joda.time.DurationFieldType durationFieldType52 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate54 = localDate48.withFieldAdded(durationFieldType52, (int) (byte) 100);
        int int55 = periodType46.indexOf(durationFieldType52);
        org.joda.time.Period period56 = duration39.toPeriod(periodType46);
        org.joda.time.DurationFieldType durationFieldType57 = org.joda.time.DurationFieldType.days();
        org.joda.time.Period period59 = period56.withField(durationFieldType57, 49);
        org.joda.time.Minutes minutes60 = period59.toStandardMinutes();
        int[] intArray62 = chronology32.get((org.joda.time.ReadablePeriod) minutes60, (long) 53786443);
        org.joda.time.DateTimeField dateTimeField63 = chronology32.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period((long) 100, 1L, periodType68);
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period((long) 100, 1L, periodType72);
        org.joda.time.Period period74 = period69.plus((org.joda.time.ReadablePeriod) period73);
        org.joda.time.Instant instant75 = new org.joda.time.Instant();
        org.joda.time.Instant instant77 = instant75.withMillis(0L);
        org.joda.time.Duration duration78 = period73.toDurationTo((org.joda.time.ReadableInstant) instant77);
        mutableDateTime65.add((org.joda.time.ReadableDuration) duration78, 39);
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime65.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime65.setZone(dateTimeZone82);
        int int84 = mutableDateTime65.getYearOfEra();
        mutableDateTime65.addMonths(41);
        org.joda.time.MutableDateTime mutableDateTime87 = mutableDateTime65.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property88 = mutableDateTime87.minuteOfHour();
        java.util.Locale locale90 = new java.util.Locale("en_US");
        int int91 = property88.getMaximumTextLength(locale90);
        int int92 = dateTimeField63.getMaximumShortTextLength(locale90);
        long long95 = dateTimeField63.getDifferenceAsLong((long) 1973, (long) 39471405);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime34", (mutableDateTime1.compareTo(dateTime34) == 0) == mutableDateTime1.equals(dateTime34));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime.Property property2 = dateTime1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.DateTime dateTime4 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime6 = dateTime4.minusWeeks(53644753);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        int int12 = dateTime11.getSecondOfMinute();
        boolean boolean13 = dateTime11.isEqualNow();
        int int14 = dateTime11.getDayOfYear();
        org.joda.time.Chronology chronology15 = dateTime11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.year();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology15.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 100, 1L, periodType24);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 100, 1L, periodType28);
        org.joda.time.Period period30 = period25.plus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Instant instant31 = new org.joda.time.Instant();
        org.joda.time.Instant instant33 = instant31.withMillis(0L);
        org.joda.time.Duration duration34 = period29.toDurationTo((org.joda.time.ReadableInstant) instant33);
        mutableDateTime21.add((org.joda.time.ReadableDuration) duration34, 39);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime21.yearOfEra();
        mutableDateTime21.setWeekOfWeekyear(14);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime21.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        long long44 = dateTimeZone41.convertLocalToUTC((long) (byte) 100, false);
        mutableDateTime21.setZone(dateTimeZone41);
        long long48 = dateTimeZone41.adjustOffset(315532800097L, true);
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) (-625), dateTimeZone41);
        org.joda.time.Chronology chronology50 = chronology15.withZone(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((long) 56, chronology50);
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime4.toMutableDateTime(chronology50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant31", (dateTime1.compareTo(instant31) == 0) == dateTime1.equals(instant31));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 1L, periodType5);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 100, 1L, periodType9);
        org.joda.time.Period period11 = period6.plus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant14 = instant12.withMillis(0L);
        org.joda.time.Duration duration15 = period10.toDurationTo((org.joda.time.ReadableInstant) instant14);
        mutableDateTime2.add((org.joda.time.ReadableDuration) duration15, 39);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime2.setZone(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(55123200000L, dateTimeZone19);
        mutableDateTime21.addWeekyears(999);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        int int28 = dateTime27.getSecondOfMinute();
        boolean boolean29 = dateTime27.isEqualNow();
        int int30 = dateTime27.getDayOfYear();
        org.joda.time.Chronology chronology31 = dateTime27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology31);
        mutableDateTime21.setChronology(chronology31);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        long long39 = dateTimeZone36.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone36);
        int int42 = dateTimeZone36.getOffset((long) (short) 0);
        java.lang.String str44 = dateTimeZone36.getNameKey((long) (short) 1);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone36);
        java.lang.String str46 = dateTimeZone36.getID();
        java.lang.String str48 = dateTimeZone36.getNameKey(1241542006905686500L);
        long long50 = dateTimeZone36.convertUTCToLocal((long) 8);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime21, dateTimeZone36);
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardHours((long) (short) 1);
        long long54 = duration53.getStandardSeconds();
        org.joda.time.Days days55 = duration53.toStandardDays();
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime57.add((org.joda.time.ReadableDuration) duration59, (int) (short) 100);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(chronology62);
        int int64 = dateTime63.getYearOfCentury();
        org.joda.time.Interval interval65 = duration59.toIntervalTo((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Duration duration67 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period68 = duration67.toPeriod();
        org.joda.time.Duration duration71 = duration67.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration71, readableInstant72);
        long long74 = duration71.getStandardDays();
        org.joda.time.Duration duration75 = duration71.toDuration();
        org.joda.time.Duration duration76 = duration59.minus((org.joda.time.ReadableDuration) duration75);
        org.joda.time.Duration duration77 = duration53.minus((org.joda.time.ReadableDuration) duration59);
        mutableDateTime51.add((org.joda.time.ReadableDuration) duration77, 6);
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime51.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime27", (instant12.compareTo(dateTime27) == 0) == instant12.equals(dateTime27));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfMonth();
        org.joda.time.Chronology chronology2 = localDate0.getChronology();
        org.joda.time.LocalDate.Property property3 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate5 = localDate0.plusWeeks(56);
        org.joda.time.Period period7 = org.joda.time.Period.millis(100);
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableInstant9, readableInstant10, periodType11);
        mutablePeriod12.setYears((int) '#');
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod12.add((long) 1, chronology16);
        org.joda.time.ReadableInterval readableInterval18 = null;
        mutablePeriod12.setPeriod(readableInterval18);
        mutablePeriod12.setMillis((int) '4');
        org.joda.time.Period period22 = period8.minus((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Period period23 = mutablePeriod12.toPeriod();
        org.joda.time.LocalDate localDate25 = localDate5.withPeriodAdded((org.joda.time.ReadablePeriod) period23, 1970);
        org.joda.time.Period period26 = period23.negated();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) (short) 10, 100, (int) 'a', 21);
        mutablePeriod31.addYears(59);
        org.joda.time.Instant instant36 = new org.joda.time.Instant();
        org.joda.time.Instant instant38 = instant36.withMillis(0L);
        org.joda.time.Chronology chronology39 = instant38.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.eras();
        java.util.Locale locale41 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology39, locale41, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) 53, chronology39);
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableDuration45, readableInstant46);
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) 100, 1L, periodType50);
        org.joda.time.Period period53 = period51.minusSeconds((-1));
        java.lang.String str54 = period51.toString();
        org.joda.time.Period period55 = period51.toPeriod();
        org.joda.time.PeriodType periodType56 = period51.getPeriodType();
        org.joda.time.Period period57 = period47.normalizedStandard(periodType56);
        boolean boolean58 = localDate44.equals((java.lang.Object) period47);
        org.joda.time.Interval interval59 = localDate44.toInterval();
        mutablePeriod31.add((org.joda.time.ReadableInterval) interval59);
        org.joda.time.Duration duration62 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str63 = duration62.toString();
        mutablePeriod31.setPeriod((org.joda.time.ReadableDuration) duration62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(chronology65);
        int int67 = dateTime66.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = null;
        java.lang.String str69 = dateTime66.toString(dateTimeFormatter68);
        org.joda.time.DateTime dateTime71 = dateTime66.plusMonths(86396191);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(chronology74);
        int int76 = dateTime75.getSecondOfMinute();
        boolean boolean77 = dateTime75.isEqualNow();
        int int78 = dateTime75.getDayOfYear();
        org.joda.time.Chronology chronology79 = dateTime75.getChronology();
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology79);
        org.joda.time.DateTime dateTime81 = dateTime71.toDateTime(chronology79);
        org.joda.time.DateTime.Property property82 = dateTime71.hourOfDay();
        org.joda.time.Period period83 = duration62.toPeriodTo((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.YearMonthDay yearMonthDay84 = dateTime71.toYearMonthDay();
        org.joda.time.Duration duration85 = period26.toDurationTo((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTime dateTime87 = dateTime71.plusDays(66);
        long long88 = dateTime71.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant36 and dateTime66", (instant36.compareTo(dateTime66) == 0) == instant36.equals(dateTime66));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean18 = mutableDateTime1.isSupported(dateTimeFieldType17);
        int int19 = mutableDateTime1.getWeekOfWeekyear();
        mutableDateTime1.addMillis(9722);
        int int22 = mutableDateTime1.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField29 = localDateTime27.getField((int) (byte) 0);
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = dateTimeField29.getAsShortText((long) (byte) 1, locale31);
        boolean boolean34 = dateTimeField29.isLeap((long) 43);
        mutableDateTime1.setRounding(dateTimeField29);
        int int36 = mutableDateTime1.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField37 = mutableDateTime1.getRoundingField();
        long long39 = dateTimeField37.roundCeiling(39394476L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant13", (mutableDateTime1.compareTo(instant13) == 0) == mutableDateTime1.equals(instant13));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType1 = periodType0.withMinutesRemoved();
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 100, 1L, periodType10);
        org.joda.time.Period period12 = period7.plus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        org.joda.time.Instant instant15 = instant13.withMillis(0L);
        org.joda.time.Duration duration16 = period11.toDurationTo((org.joda.time.ReadableInstant) instant15);
        mutableDateTime3.add((org.joda.time.ReadableDuration) duration16, 39);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime3.yearOfEra();
        mutableDateTime3.setWeekOfWeekyear(14);
        java.util.Date date22 = mutableDateTime3.toDate();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) 100, 1L, periodType27);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 100, 1L, periodType31);
        org.joda.time.Period period33 = period28.plus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Instant instant34 = new org.joda.time.Instant();
        org.joda.time.Instant instant36 = instant34.withMillis(0L);
        org.joda.time.Duration duration37 = period32.toDurationTo((org.joda.time.ReadableInstant) instant36);
        mutableDateTime24.add((org.joda.time.ReadableDuration) duration37, 39);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime24.yearOfEra();
        mutableDateTime24.setWeekOfWeekyear(14);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate45 = localDate43.minusMonths((int) ' ');
        org.joda.time.Chronology chronology46 = localDate43.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.minuteOfDay();
        mutableDateTime24.setChronology(chronology46);
        org.joda.time.DateTimeZone dateTimeZone49 = chronology46.getZone();
        org.joda.time.Instant instant50 = new org.joda.time.Instant();
        boolean boolean51 = instant50.isEqualNow();
        org.joda.time.Instant instant54 = instant50.withDurationAdded(12L, 457070);
        int int55 = dateTimeZone49.getOffset((org.joda.time.ReadableInstant) instant50);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(chronology61);
        int int63 = dateTime62.getSecondOfMinute();
        boolean boolean64 = dateTime62.isEqualNow();
        int int65 = dateTime62.getDayOfYear();
        org.joda.time.Chronology chronology66 = dateTime62.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology66);
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate(69, 6, 12, chronology66);
        org.joda.time.MutableDateTime mutableDateTime69 = instant50.toMutableDateTime(chronology66);
        org.joda.time.DateTimeField dateTimeField70 = chronology66.minuteOfDay();
        mutableDateTime3.setChronology(chronology66);
        boolean boolean72 = periodType0.equals((java.lang.Object) chronology66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime24", (mutableDateTime3.compareTo(mutableDateTime24) == 0) == mutableDateTime3.equals(mutableDateTime24));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime1.toMutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.secondOfDay();
        int int21 = mutableDateTime19.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime localTime26 = localTime24.minusHours((int) (byte) 100);
        org.joda.time.LocalTime.Property property27 = localTime26.minuteOfHour();
        int int28 = property22.compareTo((org.joda.time.ReadablePartial) localTime26);
        org.joda.time.MutableDateTime mutableDateTime29 = property22.roundHalfEven();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime29", (mutableDateTime1.compareTo(mutableDateTime29) == 0) == mutableDateTime1.equals(mutableDateTime29));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 1969);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 49);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime3.toMutableDateTime();
        org.joda.time.DateTime.Property property5 = dateTime3.era();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate8 = localDate6.plusWeeks(39326483);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate13 = localDate11.minusMonths((int) ' ');
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableDuration14, readableInstant15);
        org.joda.time.Period period18 = period16.withDays((int) (byte) 1);
        org.joda.time.LocalDate localDate19 = localDate13.plus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.LocalDate localDate21 = localDate19.minusMonths((-292275054));
        org.joda.time.LocalDate localDate23 = localDate21.withYear((int) (byte) 0);
        org.joda.time.Chronology chronology24 = localDate21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 254, (long) 895, chronology24);
        org.joda.time.LocalDate localDate26 = localDate6.plus((org.joda.time.ReadablePeriod) mutablePeriod25);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) 100, 1L, periodType29);
        org.joda.time.Period period32 = period30.minusSeconds((-1));
        java.lang.String str33 = period30.toString();
        org.joda.time.Period period34 = period30.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod35 = period34.toMutablePeriod();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) 100, 1L, periodType40);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) 100, 1L, periodType44);
        org.joda.time.Period period46 = period41.plus((org.joda.time.ReadablePeriod) period45);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Instant instant49 = instant47.withMillis(0L);
        org.joda.time.Duration duration50 = period45.toDurationTo((org.joda.time.ReadableInstant) instant49);
        mutableDateTime37.add((org.joda.time.ReadableDuration) duration50, 39);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime37.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime37.toMutableDateTime(dateTimeZone54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime55.secondOfDay();
        org.joda.time.Duration duration57 = period34.toDurationFrom((org.joda.time.ReadableInstant) mutableDateTime55);
        mutablePeriod25.add((org.joda.time.ReadableDuration) duration57);
        org.joda.time.DateTime dateTime59 = dateTime3.minus((org.joda.time.ReadablePeriod) mutablePeriod25);
        org.joda.time.Period period60 = duration1.toPeriodTo((org.joda.time.ReadableInstant) dateTime59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime37 and mutableDateTime55", (mutableDateTime37.compareTo(mutableDateTime55) == 0) == mutableDateTime37.equals(mutableDateTime55));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime.Property property2 = dateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime3 = dateTime1.toLocalDateTime();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = property4.setCopy((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 1L, periodType11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.Period period17 = period12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Instant instant18 = new org.joda.time.Instant();
        org.joda.time.Instant instant20 = instant18.withMillis(0L);
        org.joda.time.Duration duration21 = period16.toDurationTo((org.joda.time.ReadableInstant) instant20);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration21, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean25 = mutableDateTime8.isSupported(dateTimeFieldType24);
        int int26 = mutableDateTime8.getWeekOfWeekyear();
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant28.withMillis(0L);
        org.joda.time.Chronology chronology31 = instant30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.eras();
        java.util.Locale locale33 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology31, locale33, (java.lang.Integer) 39221019);
        mutableDateTime8.setChronology(chronology31);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) 100, 1L, periodType41);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) 100, 1L, periodType45);
        org.joda.time.Period period47 = period42.plus((org.joda.time.ReadablePeriod) period46);
        org.joda.time.Instant instant48 = new org.joda.time.Instant();
        org.joda.time.Instant instant50 = instant48.withMillis(0L);
        org.joda.time.Duration duration51 = period46.toDurationTo((org.joda.time.ReadableInstant) instant50);
        mutableDateTime38.add((org.joda.time.ReadableDuration) duration51, 39);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime38.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime38.setZone(dateTimeZone55);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime8, dateTimeZone55);
        org.joda.time.DurationFieldType durationFieldType58 = org.joda.time.DurationFieldType.days();
        mutableDateTime8.add(durationFieldType58, 13);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime6.withFieldAdded(durationFieldType58, (int) (short) 10);
        int int63 = localDateTime6.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant18", (dateTime1.compareTo(instant18) == 0) == dateTime1.equals(instant18));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        boolean boolean3 = dateTime1.isBefore((long) (short) 100);
        org.joda.time.DateTime.Property property4 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime5 = property4.withMaximumValue();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) 1, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfWeek();
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = locale10.stripExtensions();
        int int12 = property9.getMaximumTextLength(locale10);
        org.joda.time.DateTime dateTime13 = property9.roundHalfCeilingCopy();
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        boolean boolean17 = dateTime15.isBefore((long) (short) 100);
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardDays((-1L));
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) 100, 1L, periodType22);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) 100, 1L, periodType26);
        org.joda.time.Period period28 = period23.plus((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Period period30 = period28.withMillis(39251693);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableDuration31, readableInstant32);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 100, 1L, periodType36);
        org.joda.time.Period period39 = period37.minusSeconds((-1));
        java.lang.String str40 = period37.toString();
        org.joda.time.Period period41 = period37.toPeriod();
        org.joda.time.PeriodType periodType42 = period37.getPeriodType();
        org.joda.time.Period period43 = period33.normalizedStandard(periodType42);
        java.lang.String str44 = periodType42.getName();
        org.joda.time.PeriodType periodType45 = periodType42.withMinutesRemoved();
        org.joda.time.PeriodType periodType46 = periodType45.withMonthsRemoved();
        org.joda.time.Period period47 = period30.normalizedStandard(periodType45);
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableDuration) duration19, periodType45);
        org.joda.time.DateTime dateTime49 = dateTime13.minus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) 100, 1L, periodType52);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) 100, 1L, periodType56);
        org.joda.time.Period period58 = period53.plus((org.joda.time.ReadablePeriod) period57);
        org.joda.time.Instant instant59 = new org.joda.time.Instant();
        org.joda.time.Instant instant61 = instant59.withMillis(0L);
        org.joda.time.Duration duration62 = period57.toDurationTo((org.joda.time.ReadableInstant) instant61);
        org.joda.time.Seconds seconds63 = duration62.toStandardSeconds();
        boolean boolean64 = duration19.isEqual((org.joda.time.ReadableDuration) duration62);
        org.joda.time.DateTime dateTime65 = dateTime5.minus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.DateTime dateTime66 = dateTime5.withTimeAtStartOfDay();
        int int67 = dateTime5.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant59", (dateTime1.compareTo(instant59) == 0) == dateTime1.equals(instant59));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = locale2.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeParserBucket6.getZone();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localTime8.toDateTimeToday();
        org.joda.time.LocalTime.Property property10 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property10.addNoWrapToCopy(46);
        org.joda.time.LocalTime localTime13 = property10.roundHalfEvenCopy();
        java.lang.String str14 = localTime13.toString();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 100, 1L, periodType19);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) 100, 1L, periodType23);
        org.joda.time.Period period25 = period20.plus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Instant instant26 = new org.joda.time.Instant();
        org.joda.time.Instant instant28 = instant26.withMillis(0L);
        org.joda.time.Duration duration29 = period24.toDurationTo((org.joda.time.ReadableInstant) instant28);
        mutableDateTime16.add((org.joda.time.ReadableDuration) duration29, 39);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime16.secondOfMinute();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime16.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime35 = property33.addWrapField(6);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) 100, 1L, periodType41);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) 100, 1L, periodType45);
        org.joda.time.Period period47 = period42.plus((org.joda.time.ReadablePeriod) period46);
        org.joda.time.Instant instant48 = new org.joda.time.Instant();
        org.joda.time.Instant instant50 = instant48.withMillis(0L);
        org.joda.time.Duration duration51 = period46.toDurationTo((org.joda.time.ReadableInstant) instant50);
        mutableDateTime38.add((org.joda.time.ReadableDuration) duration51, 39);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime38.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime38.setZone(dateTimeZone55);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(55123200000L, dateTimeZone55);
        mutableDateTime35.setZone(dateTimeZone55);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime35.hourOfDay();
        org.joda.time.DateTimeField dateTimeField60 = mutableDateTime35.getRoundingField();
        org.joda.time.DateTime dateTime61 = localTime13.toDateTime((org.joda.time.ReadableInstant) mutableDateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant26", (dateTime9.compareTo(instant26) == 0) == dateTime9.equals(instant26));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration3, (int) (short) 100);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getYearOfCentury();
        org.joda.time.Interval interval9 = duration3.toIntervalTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) mutableDateTime11);
        int int13 = mutableDateTime11.getDayOfYear();
        mutableDateTime11.addHours(276);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.minuteOfDay();
        int int17 = mutableDateTime11.getYear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.Instant instant23 = instant21.withMillis(0L);
        org.joda.time.Chronology chronology24 = instant23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.eras();
        java.util.Locale locale26 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology24, locale26, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property32 = localDateTime29.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = property32.getField();
        int int34 = property32.get();
        org.joda.time.LocalDateTime localDateTime35 = property32.roundHalfFloorCopy();
        long long37 = chronology24.set((org.joda.time.ReadablePartial) localDateTime35, (long) 2022);
        org.joda.time.DateTime dateTime38 = dateTime19.toDateTime(chronology24);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean40 = dateTime38.isSupported(dateTimeFieldType39);
        mutableDateTime11.set(dateTimeFieldType39, 86399);
        int int43 = mutableDateTime11.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant21", (dateTime7.compareTo(instant21) == 0) == dateTime7.equals(instant21));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        mutableDateTime1.setDayOfYear(22);
        int int19 = mutableDateTime1.getYearOfCentury();
        mutableDateTime1.addMinutes(53639537);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.hourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.plusMillis((int) (byte) 0);
        org.joda.time.DateTime dateTime29 = localDateTime23.toDateTime();
        java.lang.String str30 = localDateTime23.toString();
        org.joda.time.LocalDateTime.Property property31 = localDateTime23.weekyear();
        org.joda.time.LocalDateTime localDateTime32 = property31.roundHalfFloorCopy();
        org.joda.time.Instant instant35 = new org.joda.time.Instant();
        org.joda.time.Instant instant37 = instant35.withMillis(0L);
        org.joda.time.Chronology chronology38 = instant37.getChronology();
        org.joda.time.DurationField durationField39 = chronology38.eras();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology38);
        org.joda.time.DateTimeField dateTimeField41 = chronology38.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = dateTimeField41.getType();
        boolean boolean43 = localDateTime32.isSupported(dateTimeFieldType42);
        int int44 = mutableDateTime1.get(dateTimeFieldType42);
        java.util.GregorianCalendar gregorianCalendar45 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.LocalDate localDate46 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime29", (instant11.compareTo(dateTime29) == 0) == instant11.equals(dateTime29));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.monthOfYear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 1, chronology3);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) instant5, periodType6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int9 = instant5.get(dateTimeFieldType8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withField(dateTimeFieldType8, 39);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusSeconds(52);
        int int14 = localDateTime13.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.plusWeeks(22);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableDuration17, readableInstant18);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) 100, 1L, periodType22);
        org.joda.time.Period period25 = period23.minusSeconds((-1));
        java.lang.String str26 = period23.toString();
        org.joda.time.Period period27 = period23.toPeriod();
        org.joda.time.PeriodType periodType28 = period23.getPeriodType();
        org.joda.time.Period period29 = period19.normalizedStandard(periodType28);
        org.joda.time.Period period31 = period29.withSeconds(10);
        int int32 = period29.size();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime13.plus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.LocalDateTime.Property property34 = localDateTime13.year();
        java.lang.String str35 = property34.getAsText();
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) 100, 1L, periodType38);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) 100, 1L, periodType42);
        org.joda.time.Period period44 = period39.plus((org.joda.time.ReadablePeriod) period43);
        org.joda.time.Instant instant45 = new org.joda.time.Instant();
        org.joda.time.Instant instant47 = instant45.withMillis(0L);
        org.joda.time.Duration duration48 = period43.toDurationTo((org.joda.time.ReadableInstant) instant47);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) 100, 1L, periodType51);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) 100, 1L, periodType55);
        org.joda.time.Period period57 = period52.plus((org.joda.time.ReadablePeriod) period56);
        org.joda.time.Instant instant58 = new org.joda.time.Instant();
        org.joda.time.Instant instant60 = instant58.withMillis(0L);
        org.joda.time.Duration duration61 = period56.toDurationTo((org.joda.time.ReadableInstant) instant60);
        boolean boolean62 = instant47.isEqual((org.joda.time.ReadableInstant) instant60);
        org.joda.time.Duration duration64 = org.joda.time.Duration.standardHours((long) (short) 1);
        org.joda.time.Duration duration66 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period67 = duration66.toPeriod();
        org.joda.time.Duration duration70 = duration66.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration70, readableInstant71);
        org.joda.time.Duration duration73 = duration70.toDuration();
        int int74 = duration64.compareTo((org.joda.time.ReadableDuration) duration73);
        org.joda.time.Instant instant75 = instant47.minus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.MutableDateTime mutableDateTime76 = instant75.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime77 = instant75.toMutableDateTime();
        mutableDateTime77.add((long) 53861022);
        int int80 = property34.getDifference((org.joda.time.ReadableInstant) mutableDateTime77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant75 and mutableDateTime76", (instant75.compareTo(mutableDateTime76) == 0) == instant75.equals(mutableDateTime76));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTime.Property property4 = dateTime2.weekOfWeekyear();
        boolean boolean6 = dateTime2.isAfter((long) 25);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 1L, periodType11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.Period period17 = period12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Instant instant18 = new org.joda.time.Instant();
        org.joda.time.Instant instant20 = instant18.withMillis(0L);
        org.joda.time.Duration duration21 = period16.toDurationTo((org.joda.time.ReadableInstant) instant20);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration21, 39);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime8.yearOfEra();
        mutableDateTime8.setWeekOfWeekyear(14);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime8.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        long long31 = dateTimeZone28.convertLocalToUTC((long) (byte) 100, false);
        mutableDateTime8.setZone(dateTimeZone28);
        org.joda.time.DateTime dateTime33 = dateTime2.toDateTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        long long37 = dateTimeZone34.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.DateTime dateTime38 = dateTime2.withZoneRetainFields(dateTimeZone34);
        int int39 = dateTime38.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime33", (dateTime2.compareTo(dateTime33) == 0) == dateTime2.equals(dateTime33));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.Period period8 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.joda.time.Duration duration12 = period7.toDurationTo((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Instant instant14 = instant11.plus((long) (byte) -1);
        org.joda.time.DateTime dateTime15 = instant11.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getRangeDurationType();
        org.joda.time.DateTime.Property property18 = dateTime15.property(dateTimeFieldType16);
        boolean boolean20 = dateTime15.isEqual((long) 53);
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period23 = duration22.toPeriod();
        org.joda.time.DateTime dateTime25 = dateTime15.withDurationAdded((org.joda.time.ReadableDuration) duration22, (-292275054));
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.DateTime.Property property27 = dateTime15.property(dateTimeFieldType26);
        org.joda.time.DateTime dateTime29 = property27.addToCopy((-205200001L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime15", (instant11.compareTo(dateTime15) == 0) == instant11.equals(dateTime15));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Instant instant16 = instant13.plus((long) (byte) -1);
        org.joda.time.Instant instant19 = instant16.withDurationAdded(1L, (int) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime21.add((org.joda.time.ReadableDuration) duration23, (int) (short) 100);
        mutableDateTime21.setYear(10);
        mutableDateTime21.addSeconds((int) (short) 0);
        boolean boolean30 = instant16.isEqual((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime mutableDateTime31 = instant16.toMutableDateTime();
        org.joda.time.Instant instant33 = instant16.minus(39446190000L);
        boolean boolean34 = dateTime1.isEqual((org.joda.time.ReadableInstant) instant16);
        java.lang.String str35 = dateTime1.toString();
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField42 = localDateTime40.getField((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.plusMonths(53697431);
        org.joda.time.Chronology chronology45 = localDateTime40.getChronology();
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(chronology45);
        org.joda.time.DateTime dateTime47 = dateTime1.toDateTime(chronology45);
        org.joda.time.Chronology chronology48 = chronology45.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant11", (dateTime1.compareTo(instant11) == 0) == dateTime1.equals(instant11));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        int int5 = property3.get();
        org.joda.time.LocalDateTime localDateTime6 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMillisOfDay(1439);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period11 = duration10.toPeriod();
        org.joda.time.Duration duration14 = duration10.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime16.add((org.joda.time.ReadableDuration) duration18, (int) (short) 100);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology21);
        int int23 = dateTime22.getYearOfCentury();
        org.joda.time.Interval interval24 = duration18.toIntervalTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Duration duration25 = duration14.minus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.Period period26 = duration25.toPeriod();
        org.joda.time.Period period28 = period26.withDays(1439);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime8.plus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withMillisOfDay(3);
        int int32 = localDateTime31.getMonthOfYear();
        org.joda.time.Duration duration35 = new org.joda.time.Duration((long) 39221019, (long) 53670254);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 100);
        int int38 = dateTime37.getCenturyOfEra();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (short) 1, chronology40);
        org.joda.time.Instant instant42 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime41, (org.joda.time.ReadableInstant) instant42, periodType43);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int46 = instant42.get(dateTimeFieldType45);
        org.joda.time.Duration duration49 = new org.joda.time.Duration((long) 10, (long) 3);
        org.joda.time.Instant instant51 = instant42.withDurationAdded((org.joda.time.ReadableDuration) duration49, 0);
        org.joda.time.Instant instant52 = new org.joda.time.Instant();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration49, (org.joda.time.ReadableInstant) instant52);
        org.joda.time.DateTime dateTime55 = dateTime37.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod53, (int) '4');
        org.joda.time.DateTime.Property property56 = dateTime37.centuryOfEra();
        org.joda.time.PeriodType periodType57 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType58 = periodType57.withDaysRemoved();
        org.joda.time.PeriodType periodType59 = periodType57.withDaysRemoved();
        org.joda.time.Period period60 = duration35.toPeriodTo((org.joda.time.ReadableInstant) dateTime37, periodType57);
        org.joda.time.Hours hours61 = duration35.toStandardHours();
        org.joda.time.Duration duration63 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (short) 1, chronology65);
        org.joda.time.DateTime dateTime67 = dateTime66.toDateTime();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) (short) 1, chronology69);
        org.joda.time.DateTime dateTime71 = dateTime70.toDateTime();
        int int72 = dateTime67.compareTo((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.Duration duration74 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime70, (org.joda.time.ReadableDuration) duration74);
        org.joda.time.Duration duration77 = duration63.withDurationAdded((org.joda.time.ReadableDuration) duration74, 10);
        boolean boolean78 = duration35.isEqual((org.joda.time.ReadableDuration) duration74);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime31.withDurationAdded((org.joda.time.ReadableDuration) duration35, 392189);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant42", (dateTime22.compareTo(instant42) == 0) == dateTime22.equals(instant42));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) -1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Calendar calendar5 = mutableDateTime2.toCalendar(locale3);
        mutableDateTime2.addMonths(20);
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period10 = duration9.toPeriod();
        org.joda.time.Duration duration13 = duration9.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14);
        org.joda.time.Duration duration16 = duration13.toDuration();
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period19 = duration18.toPeriod();
        org.joda.time.Duration duration22 = duration18.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) 100, 1L, periodType25);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) 100, 1L, periodType29);
        org.joda.time.Period period31 = period26.plus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Instant instant32 = new org.joda.time.Instant();
        org.joda.time.Instant instant34 = instant32.withMillis(0L);
        org.joda.time.Duration duration35 = period30.toDurationTo((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Instant instant37 = instant34.plus((long) (byte) -1);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (short) 1, chronology39);
        org.joda.time.Instant instant41 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) instant41, periodType42);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration18, (org.joda.time.ReadableInstant) instant34, periodType42);
        int int45 = duration13.compareTo((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.monthOfYear();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (short) 1, chronology49);
        org.joda.time.Instant instant51 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) instant51, periodType52);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int55 = instant51.get(dateTimeFieldType54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime46.withField(dateTimeFieldType54, 39);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.minusSeconds(52);
        int int60 = localDateTime59.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.plusWeeks(22);
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period(readableDuration63, readableInstant64);
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period((long) 100, 1L, periodType68);
        org.joda.time.Period period71 = period69.minusSeconds((-1));
        java.lang.String str72 = period69.toString();
        org.joda.time.Period period73 = period69.toPeriod();
        org.joda.time.PeriodType periodType74 = period69.getPeriodType();
        org.joda.time.Period period75 = period65.normalizedStandard(periodType74);
        org.joda.time.Period period77 = period75.withSeconds(10);
        int int78 = period75.size();
        org.joda.time.LocalDateTime localDateTime79 = localDateTime59.plus((org.joda.time.ReadablePeriod) period75);
        org.joda.time.PeriodType periodType80 = period75.getPeriodType();
        org.joda.time.PeriodType periodType81 = periodType80.withMonthsRemoved();
        org.joda.time.Period period82 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime2, (org.joda.time.ReadableDuration) duration13, periodType81);
        org.joda.time.Period period83 = new org.joda.time.Period(45747072000022L, periodType81);
        java.lang.Object obj84 = null;
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime(obj84);
        org.joda.time.DateTime.Property property86 = dateTime85.millisOfDay();
        org.joda.time.DateTimeField dateTimeField87 = property86.getField();
        org.joda.time.DateTime dateTime88 = property86.roundHalfFloorCopy();
        org.joda.time.Duration duration89 = period83.toDurationTo((org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.Period period91 = period83.withMillis((-292275054));
        org.joda.time.Period period93 = period91.plusHours(53779246);
        org.joda.time.Period period95 = period93.minusYears(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant32 and dateTime85", (instant32.compareTo(dateTime85) == 0) == instant32.equals(dateTime85));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.minusSeconds((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str14 = dateTimeFieldType13.getName();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.property(dateTimeFieldType13);
        int int16 = localDateTime12.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withMillisOfDay(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = localDateTime18.toString(dateTimeFormatter19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.plusMonths(53600069);
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField31 = localDateTime29.getField((int) (byte) 0);
        long long33 = dateTimeField31.roundHalfEven((long) 1);
        int int34 = dateTime24.get(dateTimeField31);
        boolean boolean35 = dateTime24.isBeforeNow();
        org.joda.time.DateTime.Property property36 = dateTime24.weekOfWeekyear();
        int int37 = dateTime24.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property38 = dateTime24.weekyear();
        org.joda.time.DateTime dateTime40 = dateTime24.minusHours(10);
        int int41 = dateTime24.getMillisOfDay();
        org.joda.time.DateTime dateTime43 = dateTime24.withYear(0);
        org.joda.time.DateTime dateTime44 = localDateTime18.toDateTime((org.joda.time.ReadableInstant) dateTime43);
        java.lang.String str45 = localDateTime18.toString();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) 100, 1L, periodType50);
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((long) 100, 1L, periodType54);
        org.joda.time.Period period56 = period51.plus((org.joda.time.ReadablePeriod) period55);
        org.joda.time.Instant instant57 = new org.joda.time.Instant();
        org.joda.time.Instant instant59 = instant57.withMillis(0L);
        org.joda.time.Duration duration60 = period55.toDurationTo((org.joda.time.ReadableInstant) instant59);
        mutableDateTime47.add((org.joda.time.ReadableDuration) duration60, 39);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime47.secondOfMinute();
        mutableDateTime47.addYears(3);
        org.joda.time.Duration duration67 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period68 = duration67.toPeriod();
        org.joda.time.Duration duration71 = duration67.withDurationAdded((long) 38, (int) 'a');
        long long72 = duration67.getStandardMinutes();
        mutableDateTime47.add((org.joda.time.ReadableDuration) duration67);
        org.joda.time.Duration duration75 = org.joda.time.Duration.standardMinutes((long) 39236);
        org.joda.time.Minutes minutes76 = duration75.toStandardMinutes();
        org.joda.time.Duration duration77 = duration67.minus((org.joda.time.ReadableDuration) duration75);
        org.joda.time.Duration duration79 = duration75.plus(1124L);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime18.plus((org.joda.time.ReadableDuration) duration75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant57", (dateTime24.compareTo(instant57) == 0) == dateTime24.equals(instant57));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime1.toMutableDateTime(dateTimeZone18);
        boolean boolean21 = mutableDateTime1.isBefore((long) 100);
        boolean boolean23 = mutableDateTime1.isAfter(893L);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime1.minuteOfHour();
        org.joda.time.Instant instant25 = mutableDateTime1.toInstant();
        org.joda.time.Instant instant28 = instant25.withDurationAdded((long) 86396191, 53811508);
        org.joda.time.Instant instant30 = instant25.withMillis((-768609154915190278L));
        org.joda.time.Instant instant32 = instant25.minus((long) 32);
        org.joda.time.MutableDateTime mutableDateTime33 = instant32.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime19", (mutableDateTime1.compareTo(mutableDateTime19) == 0) == mutableDateTime1.equals(mutableDateTime19));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period2 = duration1.toPeriod();
        org.joda.time.Duration duration5 = duration1.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 100, 1L, periodType12);
        org.joda.time.Period period14 = period9.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.Instant instant17 = instant15.withMillis(0L);
        org.joda.time.Duration duration18 = period13.toDurationTo((org.joda.time.ReadableInstant) instant17);
        long long19 = instant17.getMillis();
        org.joda.time.Interval interval20 = duration1.toIntervalTo((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Instant instant21 = instant17.toInstant();
        org.joda.time.MutableDateTime mutableDateTime22 = instant21.toMutableDateTimeISO();
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(chronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and mutableDateTime22", (instant17.compareTo(mutableDateTime22) == 0) == instant17.equals(mutableDateTime22));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) ' ');
        org.joda.time.Chronology chronology4 = localDate1.getChronology();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate7 = localDate1.withFieldAdded(durationFieldType5, (int) (byte) 100);
        org.joda.time.LocalDate.Property property8 = localDate1.dayOfWeek();
        org.joda.time.LocalDate localDate10 = property8.addWrapFieldToCopy(3);
        org.joda.time.DateTimeField dateTimeField11 = property8.getField();
        java.util.Locale locale15 = new java.util.Locale("14", "German", "Jan");
        int int16 = dateTimeField11.getMaximumShortTextLength(locale15);
        java.util.Locale.setDefault(category0, locale15);
        java.util.Locale locale18 = java.util.Locale.getDefault(category0);
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(0L, dateTimeZone21);
        int int24 = dateTimeZone21.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj19, dateTimeZone21);
        java.util.TimeZone timeZone26 = dateTimeZone21.toTimeZone();
        java.util.Locale locale31 = new java.util.Locale("14", "German", "Jan");
        java.lang.String str32 = dateTimeZone21.getShortName((long) 894, locale31);
        java.lang.String str33 = locale31.getCountry();
        java.util.Locale.setDefault(category0, locale31);
        java.util.Locale locale35 = java.util.Locale.TAIWAN;
        java.util.Locale.setDefault(category0, locale35);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology39);
        int int41 = dateTime40.getSecondOfMinute();
        boolean boolean42 = dateTime40.isEqualNow();
        int int43 = dateTime40.getDayOfYear();
        org.joda.time.Chronology chronology44 = dateTime40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology44);
        org.joda.time.DurationField durationField46 = chronology44.hours();
        org.joda.time.DateTimeField dateTimeField47 = chronology44.dayOfWeek();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate50 = localDate48.minusMonths((int) ' ');
        org.joda.time.Chronology chronology51 = localDate48.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = dateTimeField52.getType();
        int int55 = dateTimeField52.getMaximumValue((long) (-292275054));
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate58 = localDate56.plusMonths(43);
        org.joda.time.LocalDate localDate60 = localDate58.withDayOfYear(12);
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate63 = localDate61.minusMonths((int) ' ');
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period(readableDuration64, readableInstant65);
        org.joda.time.Period period68 = period66.withDays((int) (byte) 1);
        org.joda.time.LocalDate localDate69 = localDate63.plus((org.joda.time.ReadablePeriod) period68);
        org.joda.time.LocalDate localDate71 = localDate69.minusMonths((-292275054));
        org.joda.time.LocalDate localDate73 = localDate69.minusYears(21);
        org.joda.time.PeriodType periodType74 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType75 = periodType74.withMonthsRemoved();
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate60, (org.joda.time.ReadablePartial) localDate73, periodType74);
        int int77 = dateTimeField52.getMinimumValue((org.joda.time.ReadablePartial) localDate60);
        java.util.Locale locale78 = java.util.Locale.FRANCE;
        java.util.Locale locale79 = locale78.stripExtensions();
        int int80 = dateTimeField52.getMaximumTextLength(locale78);
        java.lang.String str81 = locale78.getISO3Country();
        int int82 = dateTimeField47.getMaximumShortTextLength(locale78);
        java.util.Locale.setDefault(category0, locale78);
        java.util.Locale locale84 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime40", (dateTime25.compareTo(dateTime40) == 0) == dateTime25.equals(dateTime40));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        mutableDateTime1.setDayOfYear(22);
        int int19 = mutableDateTime1.getYearOfCentury();
        mutableDateTime1.addMinutes(53639537);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.hourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.plusMillis((int) (byte) 0);
        org.joda.time.DateTime dateTime29 = localDateTime23.toDateTime();
        java.lang.String str30 = localDateTime23.toString();
        org.joda.time.LocalDateTime.Property property31 = localDateTime23.weekyear();
        org.joda.time.LocalDateTime localDateTime32 = property31.roundHalfFloorCopy();
        org.joda.time.Instant instant35 = new org.joda.time.Instant();
        org.joda.time.Instant instant37 = instant35.withMillis(0L);
        org.joda.time.Chronology chronology38 = instant37.getChronology();
        org.joda.time.DurationField durationField39 = chronology38.eras();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology38);
        org.joda.time.DateTimeField dateTimeField41 = chronology38.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = dateTimeField41.getType();
        boolean boolean43 = localDateTime32.isSupported(dateTimeFieldType42);
        int int44 = mutableDateTime1.get(dateTimeFieldType42);
        java.util.GregorianCalendar gregorianCalendar45 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period48 = duration47.toPeriod();
        org.joda.time.Duration duration51 = duration47.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration51, readableInstant52);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) 100, 1L, periodType58);
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period((long) 100, 1L, periodType62);
        org.joda.time.Period period64 = period59.plus((org.joda.time.ReadablePeriod) period63);
        org.joda.time.Instant instant65 = new org.joda.time.Instant();
        org.joda.time.Instant instant67 = instant65.withMillis(0L);
        org.joda.time.Duration duration68 = period63.toDurationTo((org.joda.time.ReadableInstant) instant67);
        mutableDateTime55.add((org.joda.time.ReadableDuration) duration68, 39);
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime55.yearOfEra();
        mutableDateTime55.setWeekOfWeekyear(14);
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime55.minuteOfDay();
        java.util.Date date75 = mutableDateTime55.toDate();
        org.joda.time.Interval interval76 = duration51.toIntervalFrom((org.joda.time.ReadableInstant) mutableDateTime55);
        int int77 = mutableDateTime55.getMinuteOfHour();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime29", (instant11.compareTo(dateTime29) == 0) == instant11.equals(dateTime29));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        long long5 = dateTimeZone1.convertLocalToUTC((long) 3, true);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone1);
        java.lang.String str7 = dateTimeZone1.toString();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        boolean boolean14 = property11.equals((java.lang.Object) '#');
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getSecondOfMinute();
        int int18 = dateTime16.getYearOfEra();
        int int19 = property11.getDifference((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime16.toMutableDateTimeISO();
        int int21 = mutableDateTime20.getHourOfDay();
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) mutableDateTime20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (byte) -1, chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withYear((int) (short) -1);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.monthOfYear();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.minusSeconds(13);
        java.lang.Object obj31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj31);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property36 = localDateTime33.hourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = property36.getField();
        boolean boolean39 = property36.equals((java.lang.Object) '#');
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        int int42 = dateTime41.getSecondOfMinute();
        int int43 = dateTime41.getYearOfEra();
        int int44 = property36.getDifference((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime46 = dateTime32.toDateTimeISO();
        org.joda.time.DateTime dateTime47 = localDateTime27.toDateTime((org.joda.time.ReadableInstant) dateTime46);
        mutableDateTime20.setTime((org.joda.time.ReadableInstant) dateTime46);
        mutableDateTime20.add((long) 9722);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and dateTime16", (mutableDateTime6.compareTo(dateTime16) == 0) == mutableDateTime6.equals(dateTime16));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        long long5 = dateTimeZone1.convertLocalToUTC((long) 3, true);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone1);
        java.lang.String str7 = dateTimeZone1.toString();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        boolean boolean14 = property11.equals((java.lang.Object) '#');
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getSecondOfMinute();
        int int18 = dateTime16.getYearOfEra();
        int int19 = property11.getDifference((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime16.toMutableDateTimeISO();
        int int21 = mutableDateTime20.getHourOfDay();
        boolean boolean22 = dateTimeZone1.equals((java.lang.Object) mutableDateTime20);
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone1);
        int int24 = mutableDateTime23.getRoundingMode();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and dateTime16", (mutableDateTime6.compareTo(dateTime16) == 0) == mutableDateTime6.equals(dateTime16));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale3);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 36);
        long long12 = dateTimeParserBucket5.computeMillis(false, "+22:00");
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate15 = localDate13.minusMonths((int) ' ');
        int int16 = localDate13.size();
        org.joda.time.DateMidnight dateMidnight17 = localDate13.toDateMidnight();
        org.joda.time.LocalDate localDate19 = localDate13.withYearOfCentury(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        java.lang.String str21 = dateTimeFieldType20.toString();
        boolean boolean22 = localDate13.isSupported(dateTimeFieldType20);
        dateTimeParserBucket5.saveField(dateTimeFieldType20, 41);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate27 = localDate25.minusMonths((int) ' ');
        org.joda.time.Chronology chronology28 = localDate25.getChronology();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate31 = localDate25.withFieldAdded(durationFieldType29, (int) (byte) 100);
        org.joda.time.LocalDate.Property property32 = localDate25.dayOfWeek();
        org.joda.time.LocalDate localDate34 = property32.addWrapFieldToCopy(3);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology37);
        int int39 = dateTime38.getSecondOfMinute();
        boolean boolean40 = dateTime38.isEqualNow();
        int int41 = dateTime38.getDayOfYear();
        org.joda.time.Chronology chronology42 = dateTime38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology42);
        org.joda.time.DateTimeField dateTimeField44 = chronology42.year();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology42.getZone();
        org.joda.time.DateTime dateTime46 = localDate34.toDateTimeAtCurrentTime(dateTimeZone45);
        org.joda.time.LocalDate localDate48 = localDate34.plusWeeks(21);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime50.add((org.joda.time.ReadableDuration) duration52, (int) (short) 100);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(chronology55);
        int int57 = dateTime56.getYearOfCentury();
        org.joda.time.Interval interval58 = duration52.toIntervalTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate62 = localDate60.minusMonths((int) ' ');
        int int63 = localDate60.size();
        org.joda.time.LocalDate.Property property64 = localDate60.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(0L, dateTimeZone66);
        long long70 = dateTimeZone66.convertLocalToUTC((long) 3, true);
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(dateTimeZone66);
        org.joda.time.DateTime dateTime72 = localDate60.toDateTimeAtStartOfDay(dateTimeZone66);
        java.lang.String str74 = dateTimeZone66.getShortName((long) 50);
        long long76 = dateTimeZone66.convertUTCToLocal((long) 39251167);
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime(3600L, dateTimeZone66);
        org.joda.time.LocalDate localDate78 = new org.joda.time.LocalDate(dateTimeZone66);
        java.lang.String str80 = dateTimeZone66.getName((long) '4');
        org.joda.time.DateTime dateTime81 = dateTime56.withZone(dateTimeZone66);
        long long84 = dateTimeZone66.convertLocalToUTC((long) 367, false);
        org.joda.time.Interval interval85 = localDate48.toInterval(dateTimeZone66);
        long long87 = dateTimeZone66.previousTransition(20L);
        org.joda.time.LocalDate localDate88 = org.joda.time.LocalDate.now(dateTimeZone66);
        dateTimeParserBucket5.setZone(dateTimeZone66);
        java.lang.Object obj90 = dateTimeParserBucket5.saveState();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and mutableDateTime71", (dateTime38.compareTo(mutableDateTime71) == 0) == dateTime38.equals(mutableDateTime71));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean18 = mutableDateTime1.isSupported(dateTimeFieldType17);
        boolean boolean19 = mutableDateTime1.isBeforeNow();
        int int20 = mutableDateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) 100);
        org.joda.time.DateTime.Property property23 = dateTime22.monthOfYear();
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTimeISO();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 100, 1L, periodType28);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) 100, 1L, periodType32);
        org.joda.time.Period period34 = period29.plus((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Instant instant35 = new org.joda.time.Instant();
        org.joda.time.Instant instant37 = instant35.withMillis(0L);
        org.joda.time.Duration duration38 = period33.toDurationTo((org.joda.time.ReadableInstant) instant37);
        org.joda.time.Instant instant40 = instant37.plus((long) (byte) -1);
        org.joda.time.DateTime dateTime41 = instant37.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType42.getRangeDurationType();
        org.joda.time.DateTime.Property property44 = dateTime41.property(dateTimeFieldType42);
        boolean boolean46 = dateTime41.isEqual((long) 53);
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period49 = duration48.toPeriod();
        org.joda.time.DateTime dateTime51 = dateTime41.withDurationAdded((org.joda.time.ReadableDuration) duration48, (-292275054));
        org.joda.time.Seconds seconds52 = duration48.toStandardSeconds();
        org.joda.time.Duration duration54 = duration48.plus((long) 409);
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration58 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime56.add((org.joda.time.ReadableDuration) duration58, (int) (short) 100);
        mutableDateTime56.setYear(10);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime56.era();
        org.joda.time.Period period64 = duration48.toPeriodFrom((org.joda.time.ReadableInstant) mutableDateTime56);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime41", (instant13.compareTo(dateTime41) == 0) == instant13.equals(dateTime41));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.Period period5 = period3.minusSeconds((-1));
        org.joda.time.Period period7 = period5.withMinutes(1);
        org.joda.time.Period period9 = period7.minusWeeks(32);
        org.joda.time.Period period11 = period7.plusMinutes(0);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime13.add((org.joda.time.ReadableDuration) duration15, (int) (short) 100);
        mutableDateTime13.setYear(10);
        mutableDateTime13.addSeconds(42);
        org.joda.time.Duration duration22 = period7.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (short) 1, chronology24);
        org.joda.time.Instant instant26 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) instant26, periodType27);
        org.joda.time.MutableDateTime mutableDateTime29 = instant26.toMutableDateTimeISO();
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period32 = duration31.toPeriod();
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period35 = duration34.toPeriod();
        org.joda.time.Duration duration38 = duration34.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period41 = duration40.toPeriod();
        org.joda.time.Duration duration42 = duration34.plus((org.joda.time.ReadableDuration) duration40);
        boolean boolean43 = duration31.isLongerThan((org.joda.time.ReadableDuration) duration34);
        long long44 = duration34.getStandardMinutes();
        org.joda.time.Instant instant45 = instant26.plus((org.joda.time.ReadableDuration) duration34);
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration50 = duration47.withDurationAdded((long) 20, 0);
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (short) 1, chronology54);
        org.joda.time.DateTime dateTime56 = dateTime55.toDateTime();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) 1, chronology58);
        org.joda.time.DateTime dateTime60 = dateTime59.toDateTime();
        int int61 = dateTime56.compareTo((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.Duration duration63 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime59, (org.joda.time.ReadableDuration) duration63);
        org.joda.time.Duration duration66 = duration52.withDurationAdded((org.joda.time.ReadableDuration) duration63, 10);
        java.lang.String str67 = duration52.toString();
        boolean boolean68 = duration50.isLongerThan((org.joda.time.ReadableDuration) duration52);
        org.joda.time.Instant instant69 = instant45.minus((org.joda.time.ReadableDuration) duration52);
        org.joda.time.MutableDateTime mutableDateTime70 = instant45.toMutableDateTime();
        org.joda.time.Period period71 = duration22.toPeriodTo((org.joda.time.ReadableInstant) mutableDateTime70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant26 and mutableDateTime29", (instant26.compareTo(mutableDateTime29) == 0) == instant26.equals(mutableDateTime29));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime localTime7 = localTime3.minusSeconds(46);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime7.minus(readablePeriod8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getSecondOfMinute();
        boolean boolean14 = dateTime12.isEqualNow();
        int int15 = dateTime12.getDayOfYear();
        org.joda.time.LocalTime localTime16 = dateTime12.toLocalTime();
        org.joda.time.DateTime dateTime18 = dateTime12.withMillisOfSecond((int) (byte) 0);
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant10, (org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (short) 1, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime localTime26 = localTime24.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime28 = localTime26.plusMillis((int) (byte) 100);
        org.joda.time.DateTime dateTime29 = dateTime22.withFields((org.joda.time.ReadablePartial) localTime28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 1, chronology31);
        org.joda.time.Instant instant33 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) instant33, periodType34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int37 = instant33.get(dateTimeFieldType36);
        java.lang.String str38 = dateTimeFieldType36.getName();
        boolean boolean39 = localTime28.isSupported(dateTimeFieldType36);
        boolean boolean40 = dateTime12.isSupported(dateTimeFieldType36);
        int int41 = localTime9.get(dateTimeFieldType36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant33", (dateTime12.compareTo(instant33) == 0) == dateTime12.equals(instant33));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime1.dayOfWeek();
        mutableDateTime1.addYears(53650665);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period24 = duration23.toPeriod();
        org.joda.time.Duration duration27 = duration23.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime29.add((org.joda.time.ReadableDuration) duration31, (int) (short) 100);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        int int36 = dateTime35.getYearOfCentury();
        org.joda.time.Interval interval37 = duration31.toIntervalTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Duration duration38 = duration27.minus((org.joda.time.ReadableDuration) duration31);
        org.joda.time.Duration duration39 = duration27.toDuration();
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period43 = new org.joda.time.Period((long) 39250977, 86400000L, periodType42);
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, (org.joda.time.ReadableDuration) duration39, periodType42);
        org.joda.time.PeriodType periodType45 = periodType42.withMinutesRemoved();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime35", (instant11.compareTo(dateTime35) == 0) == instant11.equals(dateTime35));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        int int4 = dateTime2.getYearOfEra();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) (short) 10, 100, (int) 'a', 21);
        java.lang.String str10 = mutablePeriod9.toString();
        org.joda.time.DateTime dateTime11 = dateTime2.plus((org.joda.time.ReadablePeriod) mutablePeriod9);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 100, 1L, periodType16);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 100, 1L, periodType20);
        org.joda.time.Period period22 = period17.plus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Instant instant23 = new org.joda.time.Instant();
        org.joda.time.Instant instant25 = instant23.withMillis(0L);
        org.joda.time.Duration duration26 = period21.toDurationTo((org.joda.time.ReadableInstant) instant25);
        mutableDateTime13.add((org.joda.time.ReadableDuration) duration26, 39);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime13.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime13.setZone(dateTimeZone30);
        int int32 = mutableDateTime13.getYearOfEra();
        int int33 = mutableDateTime13.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime13.year();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate37 = localDate35.minusMonths((int) ' ');
        org.joda.time.Chronology chronology38 = localDate35.getChronology();
        mutableDateTime13.setChronology(chronology38);
        boolean boolean40 = dateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime13);
        int int41 = dateTime2.getWeekyear();
        org.joda.time.Chronology chronology42 = dateTime2.getChronology();
        org.joda.time.Instant instant43 = new org.joda.time.Instant();
        org.joda.time.Instant instant45 = instant43.withMillis(0L);
        org.joda.time.Chronology chronology46 = instant45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.yearOfEra();
        org.joda.time.DateTime dateTime49 = dateTime2.toDateTime(chronology46);
        org.joda.time.DurationField durationField50 = chronology46.seconds();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(39446190000L, chronology46);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (short) 1, chronology53);
        org.joda.time.DateTime dateTime55 = dateTime54.toDateTime();
        org.joda.time.DateTime.Property property56 = dateTime54.monthOfYear();
        org.joda.time.DateTime dateTime57 = property56.getDateTime();
        org.joda.time.DateTime.Property property58 = dateTime57.yearOfCentury();
        org.joda.time.Duration duration59 = mutablePeriod51.toDurationTo((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate62 = localDate60.minusMonths((int) ' ');
        org.joda.time.Chronology chronology63 = localDate60.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField65 = chronology63.minuteOfHour();
        org.joda.time.DateTime dateTime66 = dateTime57.withChronology(chronology63);
        org.joda.time.DateTimeField dateTimeField67 = chronology63.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant23", (dateTime2.compareTo(instant23) == 0) == dateTime2.equals(instant23));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) ' ');
        org.joda.time.Chronology chronology4 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology4);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        org.joda.time.DateTime dateTime13 = property11.withMinimumValue();
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str15 = property11.getAsShortText(locale14);
        org.joda.time.DateTimeField dateTimeField16 = property11.getField();
        boolean boolean17 = dateTimeField16.isSupported();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) 100, 1L, periodType22);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) 100, 1L, periodType26);
        org.joda.time.Period period28 = period23.plus((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Instant instant29 = new org.joda.time.Instant();
        org.joda.time.Instant instant31 = instant29.withMillis(0L);
        org.joda.time.Duration duration32 = period27.toDurationTo((org.joda.time.ReadableInstant) instant31);
        org.joda.time.Instant instant34 = instant31.plus((long) (byte) -1);
        org.joda.time.Instant instant37 = instant34.withDurationAdded(1L, (int) (short) -1);
        org.joda.time.Chronology chronology38 = instant34.getChronology();
        org.joda.time.Chronology chronology40 = null;
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.util.Locale locale42 = locale41.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology40, locale41, (java.lang.Integer) 45, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket(0L, chronology38, locale41, (java.lang.Integer) 1970);
        java.util.Locale locale48 = java.util.Locale.ITALY;
        java.lang.String str49 = locale41.getDisplayScript(locale48);
        java.lang.String str50 = dateTimeField16.getAsText((long) 42, locale41);
        java.lang.String str51 = locale41.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((long) 53731467, chronology4, locale41, (java.lang.Integer) 39321381, 53758);
        org.joda.time.DurationField durationField55 = chronology4.weeks();
        int int57 = durationField55.getValue((long) 39563992);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and dateTime10", (mutableDateTime8.compareTo(dateTime10) == 0) == mutableDateTime8.equals(dateTime10));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("UTC");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 100, 1L, periodType12);
        org.joda.time.Period period14 = period9.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.Instant instant17 = instant15.withMillis(0L);
        org.joda.time.Duration duration18 = period13.toDurationTo((org.joda.time.ReadableInstant) instant17);
        long long19 = instant17.getMillis();
        org.joda.time.Instant instant21 = instant17.minus((long) (byte) 1);
        org.joda.time.Instant instant22 = instant21.toInstant();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology25);
        int int27 = dateTime26.getSecondOfMinute();
        boolean boolean28 = dateTime26.isEqualNow();
        int int29 = dateTime26.getDayOfYear();
        org.joda.time.Chronology chronology30 = dateTime26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.year();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(chronology30);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.yearOfCentury();
        org.joda.time.LocalDateTime.Property property36 = localDateTime34.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime37 = property36.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime38 = property36.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime39 = property36.roundHalfFloorCopy();
        org.joda.time.Instant instant42 = new org.joda.time.Instant();
        org.joda.time.Instant instant44 = instant42.withMillis(0L);
        org.joda.time.Chronology chronology45 = instant44.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.eras();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology45);
        org.joda.time.DateTimeField dateTimeField48 = chronology45.monthOfYear();
        org.joda.time.DateTimeField dateTimeField49 = chronology45.dayOfMonth();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) (byte) -1, chronology51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.withYear((int) (short) -1);
        int int55 = localDateTime52.getCenturyOfEra();
        int int56 = dateTimeField49.getMaximumValue((org.joda.time.ReadablePartial) localDateTime52);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime52.withDayOfYear(5);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime52.minusMillis(38);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalDateTime.Property property62 = localDateTime52.property(dateTimeFieldType61);
        boolean boolean63 = localDateTime39.isSupported(dateTimeFieldType61);
        boolean boolean64 = instant21.isSupported(dateTimeFieldType61);
        boolean boolean65 = languageRange1.equals((java.lang.Object) instant21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime26", (instant15.compareTo(dateTime26) == 0) == instant15.equals(dateTime26));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField8 = localDateTime6.getField((int) (byte) 0);
        long long10 = dateTimeField8.roundHalfEven((long) 1);
        int int11 = dateTime1.get(dateTimeField8);
        boolean boolean12 = dateTime1.isBeforeNow();
        org.joda.time.DateTime.Property property13 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime14 = dateTime1.toDateTime();
        int int15 = dateTime14.getDayOfMonth();
        org.joda.time.DateTime.Property property16 = dateTime14.hourOfDay();
        org.joda.time.DateTime.Property property17 = dateTime14.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        org.joda.time.ReadablePartial readablePartial19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableInstant20, readableInstant21, periodType22);
        mutablePeriod23.setYears((int) '#');
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant28.withMillis(0L);
        org.joda.time.Chronology chronology31 = instant30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.eras();
        java.util.Locale locale33 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology31, locale33, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property39 = localDateTime36.hourOfDay();
        org.joda.time.DateTimeField dateTimeField40 = property39.getField();
        int int41 = property39.get();
        org.joda.time.LocalDateTime localDateTime42 = property39.roundHalfFloorCopy();
        long long44 = chronology31.set((org.joda.time.ReadablePartial) localDateTime42, (long) 2022);
        mutablePeriod23.setPeriod((long) ' ', chronology31);
        org.joda.time.DateTimeField dateTimeField46 = chronology31.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.Chronology chronology48 = chronology31.withZone(dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        long long52 = dateTimeZone49.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone49);
        int int55 = dateTimeZone49.getOffset((long) (short) 0);
        java.lang.String str57 = dateTimeZone49.getNameKey((long) (short) 1);
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period(readableDuration59, readableInstant60);
        org.joda.time.Period period63 = period61.withDays((int) (byte) 1);
        org.joda.time.Period period65 = period63.minusWeeks(100);
        org.joda.time.Period period67 = period65.withDays(1);
        org.joda.time.Weeks weeks68 = period67.toStandardWeeks();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime58.plus((org.joda.time.ReadablePeriod) weeks68);
        int[] intArray72 = chronology48.get((org.joda.time.ReadablePeriod) weeks68, 51L, (long) 39);
        int int73 = dateTimeField18.getMaximumValue(readablePartial19, intArray72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant28", (dateTime1.compareTo(instant28) == 0) == dateTime1.equals(instant28));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant3, periodType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int7 = instant3.get(dateTimeFieldType6);
        org.joda.time.Duration duration10 = new org.joda.time.Duration((long) 10, (long) 3);
        org.joda.time.Instant instant12 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration10, 0);
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, (org.joda.time.ReadableInstant) instant13);
        java.lang.String str15 = duration10.toString();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (short) 1, chronology17);
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) instant19, periodType20);
        org.joda.time.MutableDateTime mutableDateTime22 = instant19.toMutableDateTimeISO();
        org.joda.time.Instant instant23 = instant19.toInstant();
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period26 = duration25.toPeriod();
        org.joda.time.Duration duration29 = duration25.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration29, readableInstant30);
        long long32 = duration29.getStandardDays();
        org.joda.time.Duration duration33 = duration29.toDuration();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 100, 1L, periodType36);
        org.joda.time.Period period39 = period37.minusSeconds((-1));
        java.lang.String str40 = period37.toString();
        org.joda.time.Period period41 = period37.toPeriod();
        org.joda.time.PeriodType periodType42 = period37.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant19, (org.joda.time.ReadableDuration) duration29, periodType42);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((java.lang.Object) str15, periodType42);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(chronology49);
        int int51 = dateTime50.getSecondOfMinute();
        boolean boolean52 = dateTime50.isEqualNow();
        int int53 = dateTime50.getDayOfYear();
        org.joda.time.Chronology chronology54 = dateTime50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology54);
        int int56 = mutablePeriod55.getDays();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(chronology59);
        int int61 = dateTime60.getSecondOfMinute();
        boolean boolean62 = dateTime60.isEqualNow();
        int int63 = dateTime60.getDayOfYear();
        org.joda.time.Chronology chronology64 = dateTime60.getChronology();
        org.joda.time.DateTime dateTime65 = org.joda.time.DateTime.now(chronology64);
        org.joda.time.DurationField durationField66 = chronology64.halfdays();
        mutablePeriod55.setPeriod((long) (byte) -1, 51L, chronology64);
        org.joda.time.DurationField durationField68 = chronology64.months();
        mutablePeriod44.setPeriod((long) 54039000, 107740796191L, chronology64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant3, periodType4);
        org.joda.time.MutableDateTime mutableDateTime6 = instant3.toMutableDateTimeISO();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period9 = duration8.toPeriod();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.Duration duration15 = duration11.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period18 = duration17.toPeriod();
        org.joda.time.Duration duration19 = duration11.plus((org.joda.time.ReadableDuration) duration17);
        boolean boolean20 = duration8.isLongerThan((org.joda.time.ReadableDuration) duration11);
        long long21 = duration11.getStandardMinutes();
        org.joda.time.Instant instant22 = instant3.plus((org.joda.time.ReadableDuration) duration11);
        org.joda.time.DateTime dateTime23 = instant22.toDateTimeISO();
        org.joda.time.DateTime dateTime24 = instant22.toDateTimeISO();
        org.joda.time.Instant instant26 = instant22.plus((-544393049731199930L));
        org.joda.time.Instant instant27 = instant26.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime6", (instant3.compareTo(mutableDateTime6) == 0) == instant3.equals(mutableDateTime6));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 1L, periodType5);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 100, 1L, periodType9);
        org.joda.time.Period period11 = period6.plus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant14 = instant12.withMillis(0L);
        org.joda.time.Duration duration15 = period10.toDurationTo((org.joda.time.ReadableInstant) instant14);
        mutableDateTime2.add((org.joda.time.ReadableDuration) duration15, 39);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime2.setZone(dateTimeZone19);
        java.lang.String str21 = dateTimeZone19.toString();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField29 = localDateTime27.getField((int) (byte) 0);
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = dateTimeField29.getAsShortText((long) (byte) 1, locale31);
        java.lang.String str33 = locale31.getVariant();
        java.lang.String str34 = locale31.toLanguageTag();
        java.lang.String str35 = dateTimeZone19.getShortName((long) 47, locale31);
        java.util.Locale.setDefault(category0, locale31);
        java.util.Locale locale37 = java.util.Locale.getDefault(category0);
        java.util.Locale locale38 = java.util.Locale.getDefault(category0);
        org.joda.time.tz.NameProvider nameProvider39 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider39);
        java.util.Locale locale41 = null;
        java.lang.String str44 = nameProvider39.getName(locale41, "DateTimeField[year]", "minuteOfDay");
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) 100, 1L, periodType49);
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) 100, 1L, periodType53);
        org.joda.time.Period period55 = period50.plus((org.joda.time.ReadablePeriod) period54);
        org.joda.time.Instant instant56 = new org.joda.time.Instant();
        org.joda.time.Instant instant58 = instant56.withMillis(0L);
        org.joda.time.Duration duration59 = period54.toDurationTo((org.joda.time.ReadableInstant) instant58);
        mutableDateTime46.add((org.joda.time.ReadableDuration) duration59, 39);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime46.secondOfMinute();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime46.minuteOfHour();
        java.lang.String str64 = property63.getAsShortText();
        java.util.Locale locale65 = java.util.Locale.GERMAN;
        java.util.Locale locale66 = locale65.stripExtensions();
        int int67 = property63.getMaximumTextLength(locale66);
        java.lang.String str70 = nameProvider39.getName(locale66, "f\351vrier", "2022-02-21T14:56:21.097Z");
        java.util.Locale.setDefault(category0, locale66);
        java.util.Locale locale73 = new java.util.Locale("millisOfDay");
        java.util.Locale.setDefault(category0, locale73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime46", (mutableDateTime2.compareTo(mutableDateTime46) == 0) == mutableDateTime2.equals(mutableDateTime46));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        mutableDateTime1.set(dateTimeFieldType2, 35);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 100, 1L, periodType9);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 100, 1L, periodType13);
        org.joda.time.Period period15 = period10.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Instant instant16 = new org.joda.time.Instant();
        org.joda.time.Instant instant18 = instant16.withMillis(0L);
        org.joda.time.Duration duration19 = period14.toDurationTo((org.joda.time.ReadableInstant) instant18);
        mutableDateTime6.add((org.joda.time.ReadableDuration) duration19, 39);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime6.secondOfMinute();
        mutableDateTime6.addYears(3);
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period27 = duration26.toPeriod();
        org.joda.time.Duration duration30 = duration26.withDurationAdded((long) 38, (int) 'a');
        long long31 = duration26.getStandardMinutes();
        mutableDateTime6.add((org.joda.time.ReadableDuration) duration26);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((-60494601599990L));
        org.joda.time.MutablePeriod mutablePeriod36 = mutablePeriod35.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.minutes();
        mutablePeriod35.add(durationFieldType37, 1970);
        mutableDateTime6.add(durationFieldType37, 54);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology42);
        org.joda.time.Instant instant45 = new org.joda.time.Instant();
        org.joda.time.Instant instant47 = instant45.withMillis(0L);
        org.joda.time.Chronology chronology48 = instant47.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.eras();
        java.util.Locale locale50 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology48, locale50, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property56 = localDateTime53.hourOfDay();
        org.joda.time.DateTimeField dateTimeField57 = property56.getField();
        int int58 = property56.get();
        org.joda.time.LocalDateTime localDateTime59 = property56.roundHalfFloorCopy();
        long long61 = chronology48.set((org.joda.time.ReadablePartial) localDateTime59, (long) 2022);
        org.joda.time.DateTime dateTime62 = dateTime43.toDateTime(chronology48);
        org.joda.time.DateTime.Property property63 = dateTime43.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration67 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime65.add((org.joda.time.ReadableDuration) duration67, (int) (short) 100);
        mutableDateTime65.setYear(10);
        mutableDateTime65.addSeconds((int) (short) 0);
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime65.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = property74.getFieldType();
        org.joda.time.DateTime.Property property76 = dateTime43.property(dateTimeFieldType75);
        mutableDateTime6.set(dateTimeFieldType75, 20);
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime6.year();
        org.joda.time.MutableDateTime mutableDateTime81 = property79.add((long) 39324);
        org.joda.time.DateTimeZone dateTimeZone82 = mutableDateTime81.getZone();
        java.lang.Object obj83 = mutableDateTime81.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime43", (instant16.compareTo(dateTime43) == 0) == instant16.equals(dateTime43));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = locale2.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeParserBucket6.getZone();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localTime8.toDateTimeToday();
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.eras();
        java.util.Locale locale16 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology14, locale16, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate21 = localDate19.minusMonths((int) ' ');
        org.joda.time.Chronology chronology22 = localDate19.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = dateTimeField23.getType();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.util.Locale locale29 = java.util.Locale.CANADA;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology27, locale29, (java.lang.Integer) 10);
        dateTimeParserBucket18.saveField(dateTimeFieldType24, "PT0.099S", locale29);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfCentury();
        dateTimeParserBucket18.saveField(dateTimeFieldType34, 43);
        org.joda.time.DurationFieldType durationFieldType37 = dateTimeFieldType34.getRangeDurationType();
        boolean boolean38 = localTime8.isSupported(dateTimeFieldType34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant11", (dateTime9.compareTo(instant11) == 0) == dateTime9.equals(instant11));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.year();
        long long11 = dateTimeField9.roundCeiling((long) 40);
        long long13 = dateTimeField9.roundFloor((long) 43);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.hourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str21 = dateTimeFieldType20.getName();
        int int22 = localDateTime14.indexOf(dateTimeFieldType20);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime14.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime14.minusSeconds((int) '#');
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.hourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str34 = dateTimeFieldType33.getName();
        int int35 = localDateTime27.indexOf(dateTimeFieldType33);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime27.minusSeconds(0);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (short) 1, chronology39);
        org.joda.time.Instant instant41 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) instant41, periodType42);
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime14, (org.joda.time.ReadablePartial) localDateTime37, periodType42);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.UTC;
        long long48 = dateTimeZone45.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone45);
        org.joda.time.DateTime dateTime50 = localDateTime14.toDateTime(dateTimeZone45);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime14.withWeekyear((-3268332));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray53 = localDateTime14.getFieldTypes();
        int int54 = localDateTime14.getMillisOfSecond();
        java.util.Locale locale55 = java.util.Locale.GERMAN;
        java.util.Locale locale56 = java.util.Locale.CANADA;
        java.lang.String str57 = locale55.getDisplayVariant(locale56);
        java.lang.String str58 = locale56.getCountry();
        java.lang.String str59 = locale56.getDisplayName();
        java.lang.String str60 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localDateTime14, locale56);
        org.joda.time.LocalTime localTime61 = localDateTime14.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant41", (dateTime3.compareTo(instant41) == 0) == dateTime3.equals(instant41));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = dateTime1.toString(dateTimeFormatter3);
        org.joda.time.DateTime dateTime6 = dateTime1.plusMonths(86396191);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) 23, 21);
        int int10 = dateTime9.getMillisOfDay();
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration12, readableInstant13);
        org.joda.time.Period period16 = period14.withDays((int) (byte) 1);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate19 = localDate17.minusMonths((int) ' ');
        org.joda.time.Chronology chronology20 = localDate17.getChronology();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (short) 1, chronology22);
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) instant24, periodType25);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate29 = localDate27.minusMonths((int) ' ');
        org.joda.time.Chronology chronology30 = localDate27.getChronology();
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate33 = localDate27.withFieldAdded(durationFieldType31, (int) (byte) 100);
        int int34 = periodType25.indexOf(durationFieldType31);
        boolean boolean35 = localDate17.isSupported(durationFieldType31);
        int int36 = period14.get(durationFieldType31);
        org.joda.time.Period period38 = period14.withMinutes(575);
        org.joda.time.DateTime dateTime39 = dateTime9.plus((org.joda.time.ReadablePeriod) period14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant24", (dateTime1.compareTo(instant24) == 0) == dateTime1.equals(instant24));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period6 = duration5.toPeriod();
        org.joda.time.Duration duration9 = duration5.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.Duration duration13 = duration5.plus((org.joda.time.ReadableDuration) duration11);
        boolean boolean14 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration5);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.monthOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        int int19 = dateTime18.getSecondOfMinute();
        boolean boolean20 = dateTime18.isEqualNow();
        int int21 = dateTime18.getDayOfYear();
        org.joda.time.Chronology chronology22 = dateTime18.getChronology();
        long long23 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime25 = dateTime18.minusYears(0);
        org.joda.time.DateTime.Property property26 = dateTime25.secondOfDay();
        org.joda.time.DateTime dateTime27 = property26.withMinimumValue();
        org.joda.time.DateTime dateTime29 = dateTime27.minusDays(3);
        org.joda.time.DateTime dateTime30 = dateTime27.withEarlierOffsetAtOverlap();
        int int31 = dateTime30.getMonthOfYear();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (short) 1, chronology33);
        org.joda.time.Instant instant35 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) instant35, periodType36);
        org.joda.time.Period period38 = duration2.toPeriodTo((org.joda.time.ReadableInstant) dateTime30, periodType36);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 54005185, periodType36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant35", (dateTime18.compareTo(instant35) == 0) == dateTime18.equals(instant35));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 1L, periodType11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.Period period17 = period12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Instant instant18 = new org.joda.time.Instant();
        org.joda.time.Instant instant20 = instant18.withMillis(0L);
        org.joda.time.Duration duration21 = period16.toDurationTo((org.joda.time.ReadableInstant) instant20);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration21, 39);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime8.secondOfMinute();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime8.minuteOfHour();
        java.lang.String str26 = property25.getAsShortText();
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        java.util.Locale locale28 = locale27.stripExtensions();
        int int29 = property25.getMaximumTextLength(locale28);
        java.lang.String str30 = dateTimeZone1.getShortName((long) (short) 1, locale28);
        java.lang.String str33 = nameProvider0.getShortName(locale28, "PT86400S", "P90YT0.198S");
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        java.lang.String str39 = nameProvider0.getName(locale35, "secondOfMinute", "");
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property43 = localDateTime40.hourOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.plusMillis((int) (byte) 0);
        org.joda.time.DateTime dateTime46 = localDateTime45.toDateTime();
        java.util.Locale locale47 = java.util.Locale.CHINA;
        java.util.Calendar calendar48 = dateTime46.toCalendar(locale47);
        java.lang.String str51 = nameProvider0.getShortName(locale47, "14:58:21.393", "53992183");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and dateTime46", (instant18.compareTo(dateTime46) == 0) == instant18.equals(dateTime46));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime1.setZone(dateTimeZone18);
        int int20 = mutableDateTime1.getYearOfEra();
        int int21 = mutableDateTime1.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime1.year();
        boolean boolean24 = mutableDateTime1.equals((java.lang.Object) 168);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (short) 1, chronology26);
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfWeek();
        org.joda.time.DateTime.Property property29 = dateTime27.weekOfWeekyear();
        boolean boolean31 = dateTime27.isAfter((long) 25);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 100, 1L, periodType36);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) 100, 1L, periodType40);
        org.joda.time.Period period42 = period37.plus((org.joda.time.ReadablePeriod) period41);
        org.joda.time.Instant instant43 = new org.joda.time.Instant();
        org.joda.time.Instant instant45 = instant43.withMillis(0L);
        org.joda.time.Duration duration46 = period41.toDurationTo((org.joda.time.ReadableInstant) instant45);
        mutableDateTime33.add((org.joda.time.ReadableDuration) duration46, 39);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime33.yearOfEra();
        mutableDateTime33.setWeekOfWeekyear(14);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime33.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.UTC;
        long long56 = dateTimeZone53.convertLocalToUTC((long) (byte) 100, false);
        mutableDateTime33.setZone(dateTimeZone53);
        org.joda.time.DateTime dateTime58 = dateTime27.toDateTime(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.UTC;
        long long62 = dateTimeZone59.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.DateTime dateTime63 = dateTime27.withZoneRetainFields(dateTimeZone59);
        mutableDateTime1.setZoneRetainFields(dateTimeZone59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime58", (dateTime27.compareTo(dateTime58) == 0) == dateTime27.equals(dateTime58));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime1.toMutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.secondOfDay();
        org.joda.time.Period period22 = org.joda.time.Period.millis(100);
        org.joda.time.Period period23 = period22.negated();
        mutableDateTime19.add((org.joda.time.ReadablePeriod) period22, 0);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.hourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str33 = dateTimeFieldType32.getName();
        int int34 = localDateTime26.indexOf(dateTimeFieldType32);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime26.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime26.minusSeconds((int) '#');
        org.joda.time.Chronology chronology39 = localDateTime38.getChronology();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableDuration40, readableInstant41);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) 100, 1L, periodType45);
        org.joda.time.Period period48 = period46.minusSeconds((-1));
        java.lang.String str49 = period46.toString();
        org.joda.time.Period period50 = period46.toPeriod();
        org.joda.time.PeriodType periodType51 = period46.getPeriodType();
        org.joda.time.Period period52 = period42.normalizedStandard(periodType51);
        org.joda.time.Period period54 = period52.multipliedBy((int) (short) 100);
        int[] intArray56 = chronology39.get((org.joda.time.ReadablePeriod) period52, 2629746000L);
        mutableDateTime19.add((org.joda.time.ReadablePeriod) period52);
        org.joda.time.PeriodType periodType58 = period52.getPeriodType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime19", (mutableDateTime1.compareTo(mutableDateTime19) == 0) == mutableDateTime1.equals(mutableDateTime19));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period19 = duration18.toPeriod();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.centuries();
        int int21 = period19.get(durationFieldType20);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) period19, 54);
        mutableDateTime1.setMillisOfDay(0);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime1.centuryOfEra();
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardHours((long) (short) 1);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate31 = localDate29.minusMonths((int) ' ');
        org.joda.time.Chronology chronology32 = localDate29.getChronology();
        org.joda.time.Period period33 = duration28.toPeriod(chronology32);
        org.joda.time.DateTime dateTime34 = mutableDateTime1.toDateTime(chronology32);
        org.joda.time.DurationField durationField35 = chronology32.hours();
        org.joda.time.DateTimeField dateTimeField36 = chronology32.millisOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology32.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime34", (mutableDateTime1.compareTo(dateTime34) == 0) == mutableDateTime1.equals(dateTime34));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime.Property property2 = dateTime1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.DateTime dateTime4 = property2.withMinimumValue();
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str6 = property2.getAsShortText(locale5);
        org.joda.time.DateTimeField dateTimeField7 = property2.getField();
        boolean boolean8 = dateTimeField7.isSupported();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 100, 1L, periodType13);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 100, 1L, periodType17);
        org.joda.time.Period period19 = period14.plus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Instant instant20 = new org.joda.time.Instant();
        org.joda.time.Instant instant22 = instant20.withMillis(0L);
        org.joda.time.Duration duration23 = period18.toDurationTo((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Instant instant25 = instant22.plus((long) (byte) -1);
        org.joda.time.Instant instant28 = instant25.withDurationAdded(1L, (int) (short) -1);
        org.joda.time.Chronology chronology29 = instant25.getChronology();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.util.Locale locale33 = locale32.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 45, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket(0L, chronology29, locale32, (java.lang.Integer) 1970);
        java.util.Locale locale39 = java.util.Locale.ITALY;
        java.lang.String str40 = locale32.getDisplayScript(locale39);
        java.lang.String str41 = dateTimeField7.getAsText((long) 42, locale32);
        int int42 = dateTimeField7.getMaximumValue();
        java.lang.String str44 = dateTimeField7.getAsShortText(133200000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant20", (dateTime1.compareTo(instant20) == 0) == dateTime1.equals(instant20));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) 39221019);
        org.joda.time.Instant instant6 = instant4.minus((long) 8);
        org.joda.time.Instant instant7 = instant4.toInstant();
        org.joda.time.DateTime dateTime8 = instant7.toDateTimeISO();
        org.joda.time.Instant instant9 = instant7.toInstant();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.millis();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 46, periodType13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(0L, 0L, periodType13, chronology15);
        org.joda.time.MutablePeriod mutablePeriod17 = mutablePeriod16.copy();
        org.joda.time.DurationFieldType[] durationFieldTypeArray18 = mutablePeriod16.getFieldTypes();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.forFields(durationFieldTypeArray18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration2, (org.joda.time.ReadableInstant) instant7, periodType19);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate23 = localDate21.minusMonths((int) ' ');
        org.joda.time.Chronology chronology24 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.minuteOfDay();
        org.joda.time.DurationField durationField26 = chronology24.days();
        org.joda.time.DurationField durationField27 = chronology24.hours();
        org.joda.time.DateTimeField dateTimeField28 = chronology24.halfdayOfDay();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 54, 0L, periodType19, chronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime8", (instant4.compareTo(dateTime8) == 0) == instant4.equals(dateTime8));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.monthOfYear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 1, chronology3);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) instant5, periodType6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int9 = instant5.get(dateTimeFieldType8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withField(dateTimeFieldType8, 39);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusSeconds(52);
        int int14 = localDateTime13.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.plusWeeks(22);
        int int17 = localDateTime13.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property18 = localDateTime13.dayOfYear();
        org.joda.time.Instant instant20 = new org.joda.time.Instant();
        org.joda.time.Instant instant22 = instant20.withMillis(0L);
        org.joda.time.Chronology chronology23 = instant22.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.eras();
        java.util.Locale locale25 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology23, locale25, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property31 = localDateTime28.hourOfDay();
        org.joda.time.DateTimeField dateTimeField32 = property31.getField();
        int int33 = property31.get();
        org.joda.time.LocalDateTime localDateTime34 = property31.roundHalfFloorCopy();
        long long36 = chronology23.set((org.joda.time.ReadablePartial) localDateTime34, (long) 2022);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.withWeekyear((int) (short) 10);
        int int39 = localDateTime38.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withSecondOfMinute(39);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.withSecondOfMinute(34);
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.months();
        boolean boolean45 = localDateTime41.equals((java.lang.Object) durationFieldType44);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        long long49 = dateTimeZone46.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.plusSeconds(39);
        org.joda.time.LocalDateTime.Property property53 = localDateTime50.secondOfMinute();
        org.joda.time.LocalDateTime.Property property54 = localDateTime50.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime55 = property54.roundHalfCeilingCopy();
        org.joda.time.Duration duration57 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period58 = duration57.toPeriod();
        org.joda.time.Duration duration61 = duration57.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration65 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime63.add((org.joda.time.ReadableDuration) duration65, (int) (short) 100);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(chronology68);
        int int70 = dateTime69.getYearOfCentury();
        org.joda.time.Interval interval71 = duration65.toIntervalTo((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.Duration duration72 = duration61.minus((org.joda.time.ReadableDuration) duration65);
        org.joda.time.Period period73 = duration72.toPeriod();
        org.joda.time.Duration duration75 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period76 = duration75.toPeriod();
        org.joda.time.Duration duration79 = duration75.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.Duration duration81 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period82 = duration81.toPeriod();
        org.joda.time.Duration duration83 = duration75.plus((org.joda.time.ReadableDuration) duration81);
        org.joda.time.Seconds seconds84 = duration75.toStandardSeconds();
        boolean boolean85 = duration72.isEqual((org.joda.time.ReadableDuration) duration75);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime55.plus((org.joda.time.ReadableDuration) duration72);
        org.joda.time.Period period87 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime41, (org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.LocalDateTime localDateTime89 = localDateTime13.withPeriodAdded((org.joda.time.ReadablePeriod) period87, 847);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime69", (instant5.compareTo(dateTime69) == 0) == instant5.equals(dateTime69));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField8 = localDateTime6.getField((int) (byte) 0);
        long long10 = dateTimeField8.roundHalfEven((long) 1);
        int int11 = dateTime1.get(dateTimeField8);
        boolean boolean12 = dateTime1.isBeforeNow();
        org.joda.time.DateTime dateTime14 = dateTime1.minusWeeks((int) (byte) 0);
        int int15 = dateTime14.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        long long19 = dateTimeZone16.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone16);
        int int22 = dateTimeZone16.getOffset((long) (short) 0);
        java.lang.String str24 = dateTimeZone16.getNameKey((long) (short) 1);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone16);
        boolean boolean26 = dateTimeZone16.isFixed();
        org.joda.time.DateTime dateTime27 = dateTime14.withZone(dateTimeZone16);
        org.joda.time.DateTime.Property property28 = dateTime14.dayOfYear();
        int int29 = dateTime14.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime27", (dateTime14.compareTo(dateTime27) == 0) == dateTime14.equals(dateTime27));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Instant instant5 = instant3.withMillis(0L);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.util.Locale locale8 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology6, locale8, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        int int16 = property14.get();
        org.joda.time.LocalDateTime localDateTime17 = property14.roundHalfFloorCopy();
        long long19 = chronology6.set((org.joda.time.ReadablePartial) localDateTime17, (long) 2022);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(chronology6);
        org.joda.time.DateTime dateTime22 = dateTime1.plusDays(22);
        org.joda.time.DateTime dateTime24 = dateTime1.plusSeconds(14);
        org.joda.time.DateTime dateTime26 = dateTime24.withCenturyOfEra(1973);
        org.joda.time.DateMidnight dateMidnight27 = dateTime26.toDateMidnight();
        org.joda.time.DateTime dateTime28 = dateMidnight27.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant3", (dateTime1.compareTo(instant3) == 0) == dateTime1.equals(instant3));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        boolean boolean4 = dateTime2.isEqualNow();
        int int5 = dateTime2.getDayOfYear();
        org.joda.time.Chronology chronology6 = dateTime2.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (-3268332), chronology6);
        mutablePeriod7.addSeconds(467);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate13 = localDate11.minusMonths((int) ' ');
        org.joda.time.Chronology chronology14 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology14);
        org.joda.time.DurationField durationField19 = chronology14.hours();
        org.joda.time.DateTimeField dateTimeField20 = chronology14.centuryOfEra();
        mutablePeriod7.setPeriod((long) 2712, chronology14);
        org.joda.time.DateTimeField dateTimeField22 = chronology14.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and mutableDateTime18", (dateTime2.compareTo(mutableDateTime18) == 0) == dateTime2.equals(mutableDateTime18));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean18 = mutableDateTime1.isSupported(dateTimeFieldType17);
        boolean boolean19 = mutableDateTime1.isBeforeNow();
        int int20 = mutableDateTime1.getSecondOfDay();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.hourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        mutableDateTime1.setRounding(dateTimeField25);
        mutableDateTime1.setMillisOfDay(51);
        java.lang.Object obj29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(obj29);
        boolean boolean32 = dateTime30.isBefore((long) (short) 100);
        org.joda.time.DateTime.Property property33 = dateTime30.minuteOfDay();
        org.joda.time.Chronology chronology34 = dateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime1.toMutableDateTime(chronology34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        int int38 = dateTime37.getSecondOfMinute();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate();
        int int40 = localDate39.getDayOfMonth();
        org.joda.time.LocalDate localDate42 = localDate39.plusYears(1);
        org.joda.time.LocalDate localDate44 = localDate42.plusYears((int) (short) -1);
        org.joda.time.DateTime dateTime45 = dateTime37.withFields((org.joda.time.ReadablePartial) localDate42);
        org.joda.time.DateTime.Property property46 = dateTime37.era();
        int int47 = dateTime37.getMinuteOfDay();
        int int48 = mutableDateTime35.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime30", (instant11.compareTo(dateTime30) == 0) == instant11.equals(dateTime30));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant3, periodType4);
        org.joda.time.MutableDateTime mutableDateTime6 = instant3.toMutableDateTimeISO();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period9 = duration8.toPeriod();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.Duration duration15 = duration11.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period18 = duration17.toPeriod();
        org.joda.time.Duration duration19 = duration11.plus((org.joda.time.ReadableDuration) duration17);
        boolean boolean20 = duration8.isLongerThan((org.joda.time.ReadableDuration) duration11);
        long long21 = duration11.getStandardMinutes();
        org.joda.time.Instant instant22 = instant3.plus((org.joda.time.ReadableDuration) duration11);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Duration duration27 = duration24.withDurationAdded((long) 20, 0);
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 1, chronology31);
        org.joda.time.DateTime dateTime33 = dateTime32.toDateTime();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (short) 1, chronology35);
        org.joda.time.DateTime dateTime37 = dateTime36.toDateTime();
        int int38 = dateTime33.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableDuration) duration40);
        org.joda.time.Duration duration43 = duration29.withDurationAdded((org.joda.time.ReadableDuration) duration40, 10);
        java.lang.String str44 = duration29.toString();
        boolean boolean45 = duration27.isLongerThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Instant instant46 = instant22.minus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.DateTime dateTime47 = instant46.toDateTime();
        org.joda.time.LocalTime localTime48 = dateTime47.toLocalTime();
        org.joda.time.DateTime.Property property49 = dateTime47.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime6", (instant3.compareTo(mutableDateTime6) == 0) == instant3.equals(mutableDateTime6));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime1.setZone(dateTimeZone18);
        int int20 = mutableDateTime1.getYearOfEra();
        mutableDateTime1.addMonths(41);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime1.toMutableDateTimeISO();
        mutableDateTime23.addHours(21);
        boolean boolean27 = mutableDateTime23.isAfter((long) 86396191);
        int int28 = mutableDateTime23.getSecondOfDay();
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardHours((long) (short) 1);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate33 = localDate31.minusMonths((int) ' ');
        org.joda.time.Chronology chronology34 = localDate31.getChronology();
        org.joda.time.Period period35 = duration30.toPeriod(chronology34);
        mutableDateTime23.add((org.joda.time.ReadablePeriod) period35, 23);
        org.joda.time.Period period39 = period35.minusHours(40);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableDuration40, readableInstant41);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) 100, 1L, periodType45);
        org.joda.time.Period period48 = period46.minusSeconds((-1));
        java.lang.String str49 = period46.toString();
        org.joda.time.Period period50 = period46.toPeriod();
        org.joda.time.PeriodType periodType51 = period46.getPeriodType();
        org.joda.time.Period period52 = period42.normalizedStandard(periodType51);
        org.joda.time.Period period54 = period52.withSeconds(10);
        org.joda.time.DurationFieldType durationFieldType55 = org.joda.time.DurationFieldType.millis();
        boolean boolean56 = period52.isSupported(durationFieldType55);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((long) 100, 1L, periodType59);
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period((long) 100, 1L, periodType63);
        org.joda.time.Period period65 = period60.plus((org.joda.time.ReadablePeriod) period64);
        org.joda.time.Period period67 = period64.plusDays(53600069);
        org.joda.time.Period period69 = period67.plusMonths(39239);
        org.joda.time.Period period71 = period69.minusSeconds((-1));
        org.joda.time.DurationFieldType durationFieldType73 = period69.getFieldType(0);
        org.joda.time.Period period75 = period52.withField(durationFieldType73, 53711646);
        boolean boolean76 = period35.isSupported(durationFieldType73);
        org.joda.time.Instant instant79 = new org.joda.time.Instant();
        org.joda.time.Instant instant81 = instant79.withMillis(0L);
        org.joda.time.Chronology chronology82 = instant81.getChronology();
        org.joda.time.DurationField durationField83 = chronology82.eras();
        java.util.Locale locale84 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket86 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology82, locale84, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate87 = new org.joda.time.LocalDate((long) 53, chronology82);
        org.joda.time.DateTimeField dateTimeField88 = chronology82.dayOfYear();
        org.joda.time.DateTimeField dateTimeField89 = chronology82.monthOfYear();
        org.joda.time.DateTimeField dateTimeField90 = chronology82.hourOfDay();
        org.joda.time.DateTimeField dateTimeField91 = chronology82.year();
        org.joda.time.Chronology chronology92 = chronology82.withUTC();
        org.joda.time.DurationField durationField93 = durationFieldType73.getField(chronology92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField83, durationField93, and durationField83", !(durationField83.compareTo(durationField93) == 0) || (Math.signum(durationField83.compareTo(durationField83)) == Math.signum(durationField93.compareTo(durationField83))));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 1, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        int int8 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime.Property property9 = dateTime3.hourOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.centuryOfEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        int int15 = dateTime14.getSecondOfMinute();
        boolean boolean16 = dateTime14.isEqualNow();
        int int17 = dateTime14.getDayOfYear();
        org.joda.time.Chronology chronology18 = dateTime14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology18);
        int int20 = mutablePeriod19.getDays();
        org.joda.time.DateTime dateTime21 = dateTime3.minus((org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) 100, 1L, periodType26);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 100, 1L, periodType30);
        org.joda.time.Period period32 = period27.plus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Instant instant33 = new org.joda.time.Instant();
        org.joda.time.Instant instant35 = instant33.withMillis(0L);
        org.joda.time.Duration duration36 = period31.toDurationTo((org.joda.time.ReadableInstant) instant35);
        mutableDateTime23.add((org.joda.time.ReadableDuration) duration36, 39);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime23.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime23.toMutableDateTime(dateTimeZone40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.secondOfDay();
        org.joda.time.Period period44 = org.joda.time.Period.millis(100);
        org.joda.time.Period period45 = period44.negated();
        mutableDateTime41.add((org.joda.time.ReadablePeriod) period44, 0);
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) mutableDateTime41, periodType48);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = null;
        boolean boolean51 = mutableDateTime41.isSupported(dateTimeFieldType50);
        int int52 = mutableDateTime41.getWeekOfWeekyear();
        org.joda.time.Chronology chronology54 = null;
        java.util.Locale locale55 = java.util.Locale.GERMAN;
        java.util.Locale locale56 = java.util.Locale.CANADA;
        java.lang.String str57 = locale55.getDisplayVariant(locale56);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology54, locale56);
        org.joda.time.DateTimeZone dateTimeZone59 = dateTimeParserBucket58.getZone();
        java.util.Locale locale60 = dateTimeParserBucket58.getLocale();
        java.util.Locale locale61 = dateTimeParserBucket58.getLocale();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (short) 1, chronology63);
        org.joda.time.Instant instant65 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime64, (org.joda.time.ReadableInstant) instant65, periodType66);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int69 = instant65.get(dateTimeFieldType68);
        java.lang.String str70 = dateTimeFieldType68.getName();
        java.lang.String str71 = dateTimeFieldType68.toString();
        dateTimeParserBucket58.saveField(dateTimeFieldType68, 36);
        int int74 = mutableDateTime41.get(dateTimeFieldType68);
        int int75 = mutableDateTime41.getRoundingMode();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant33", (dateTime14.compareTo(instant33) == 0) == dateTime14.equals(instant33));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Instant instant5 = instant3.withMillis(0L);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.util.Locale locale8 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology6, locale8, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        int int16 = property14.get();
        org.joda.time.LocalDateTime localDateTime17 = property14.roundHalfFloorCopy();
        long long19 = chronology6.set((org.joda.time.ReadablePartial) localDateTime17, (long) 2022);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(chronology6);
        org.joda.time.DateTime dateTime22 = dateTime1.plusDays(22);
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.hourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        boolean boolean31 = property28.equals((java.lang.Object) '#');
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology32);
        int int34 = dateTime33.getSecondOfMinute();
        int int35 = dateTime33.getYearOfEra();
        int int36 = property28.getDifference((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime40 = dateTime33.withDurationAdded((long) (byte) 0, 22);
        boolean boolean41 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime42 = dateTime1.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime44 = dateTime42.withYear(53839567);
        org.joda.time.DateTime.Property property45 = dateTime42.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and instant3", (dateTime42.compareTo(instant3) == 0) == dateTime42.equals(instant3));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        boolean boolean3 = dateTime1.isBefore((long) (short) 100);
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis(0L);
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.DateTime dateTime8 = dateTime1.toDateTime(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 100, 1L, periodType19);
        org.joda.time.Period period21 = period16.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.Instant instant24 = instant22.withMillis(0L);
        org.joda.time.Duration duration25 = period20.toDurationTo((org.joda.time.ReadableInstant) instant24);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration25, 39);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime12.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime12.toMutableDateTime(dateTimeZone29);
        boolean boolean32 = mutableDateTime12.isBefore((long) 100);
        boolean boolean34 = mutableDateTime12.isAfter(893L);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime12.minuteOfHour();
        org.joda.time.Instant instant36 = mutableDateTime12.toInstant();
        mutableDateTime12.add(118140000L);
        int int39 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime12);
        mutableDateTime9.setMillis((long) 258);
        java.lang.Object obj42 = mutableDateTime9.clone();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime9.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant4", (dateTime1.compareTo(instant4) == 0) == dateTime1.equals(instant4));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableDuration0, readableInstant1);
        org.joda.time.Period period4 = period2.withDays((int) (byte) 1);
        org.joda.time.Period period6 = period4.withMinutes(39);
        org.joda.time.Period period8 = period6.plusMinutes(39221019);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.withMillis(0L);
        org.joda.time.Chronology chronology13 = instant12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.eras();
        java.util.Locale locale15 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology13, locale15, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.hourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        int int23 = property21.get();
        org.joda.time.LocalDateTime localDateTime24 = property21.roundHalfFloorCopy();
        long long26 = chronology13.set((org.joda.time.ReadablePartial) localDateTime24, (long) 2022);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(chronology13);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DurationField durationField29 = chronology13.eras();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.Duration duration32 = period8.toDurationFrom((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime30.millisOfDay();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        int int36 = dateTime35.getSecondOfMinute();
        boolean boolean37 = dateTime35.isEqualNow();
        int int38 = dateTime35.getDayOfYear();
        org.joda.time.Chronology chronology39 = dateTime35.getChronology();
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(chronology39);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(chronology43);
        int int45 = dateTime44.getSecondOfMinute();
        boolean boolean46 = dateTime44.isEqualNow();
        int int47 = dateTime44.getDayOfYear();
        org.joda.time.Chronology chronology48 = dateTime44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology48);
        int int50 = mutablePeriod49.getDays();
        org.joda.time.DateTime dateTime52 = dateTime40.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod49, (int) (byte) 0);
        boolean boolean53 = mutableDateTime30.isBefore((org.joda.time.ReadableInstant) dateTime52);
        int int54 = mutableDateTime30.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime35", (instant10.compareTo(dateTime35) == 0) == instant10.equals(dateTime35));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology7);
        mutablePeriod8.setDays(49);
        int int11 = mutablePeriod8.getMillis();
        mutablePeriod8.addMillis(23);
        int int14 = mutablePeriod8.getMinutes();
        int int15 = mutablePeriod8.getMinutes();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology17, locale19);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeParserBucket21.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) 100, 1L, periodType27);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 100, 1L, periodType31);
        org.joda.time.Period period33 = period28.plus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Instant instant34 = new org.joda.time.Instant();
        org.joda.time.Instant instant36 = instant34.withMillis(0L);
        org.joda.time.Duration duration37 = period32.toDurationTo((org.joda.time.ReadableInstant) instant36);
        mutableDateTime24.add((org.joda.time.ReadableDuration) duration37, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean41 = mutableDateTime24.isSupported(dateTimeFieldType40);
        org.joda.time.DurationFieldType durationFieldType42 = dateTimeFieldType40.getDurationType();
        java.util.Locale locale44 = java.util.Locale.CANADA;
        dateTimeParserBucket21.saveField(dateTimeFieldType40, "2022", locale44);
        org.joda.time.DurationFieldType durationFieldType46 = dateTimeFieldType40.getDurationType();
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology48 = localDateTime47.getChronology();
        org.joda.time.DurationField durationField49 = durationFieldType46.getField(chronology48);
        org.joda.time.DurationFieldType durationFieldType50 = durationField49.getType();
        mutablePeriod8.add(durationFieldType50, 570);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant34", (dateTime3.compareTo(instant34) == 0) == dateTime3.equals(instant34));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) -1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Calendar calendar5 = mutableDateTime2.toCalendar(locale3);
        mutableDateTime2.addMonths(20);
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period10 = duration9.toPeriod();
        org.joda.time.Duration duration13 = duration9.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14);
        org.joda.time.Duration duration16 = duration13.toDuration();
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period19 = duration18.toPeriod();
        org.joda.time.Duration duration22 = duration18.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) 100, 1L, periodType25);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) 100, 1L, periodType29);
        org.joda.time.Period period31 = period26.plus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Instant instant32 = new org.joda.time.Instant();
        org.joda.time.Instant instant34 = instant32.withMillis(0L);
        org.joda.time.Duration duration35 = period30.toDurationTo((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Instant instant37 = instant34.plus((long) (byte) -1);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (short) 1, chronology39);
        org.joda.time.Instant instant41 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) instant41, periodType42);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration18, (org.joda.time.ReadableInstant) instant34, periodType42);
        int int45 = duration13.compareTo((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.monthOfYear();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (short) 1, chronology49);
        org.joda.time.Instant instant51 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) instant51, periodType52);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int55 = instant51.get(dateTimeFieldType54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime46.withField(dateTimeFieldType54, 39);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.minusSeconds(52);
        int int60 = localDateTime59.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.plusWeeks(22);
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period(readableDuration63, readableInstant64);
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period((long) 100, 1L, periodType68);
        org.joda.time.Period period71 = period69.minusSeconds((-1));
        java.lang.String str72 = period69.toString();
        org.joda.time.Period period73 = period69.toPeriod();
        org.joda.time.PeriodType periodType74 = period69.getPeriodType();
        org.joda.time.Period period75 = period65.normalizedStandard(periodType74);
        org.joda.time.Period period77 = period75.withSeconds(10);
        int int78 = period75.size();
        org.joda.time.LocalDateTime localDateTime79 = localDateTime59.plus((org.joda.time.ReadablePeriod) period75);
        org.joda.time.PeriodType periodType80 = period75.getPeriodType();
        org.joda.time.PeriodType periodType81 = periodType80.withMonthsRemoved();
        org.joda.time.Period period82 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime2, (org.joda.time.ReadableDuration) duration13, periodType81);
        org.joda.time.Period period83 = new org.joda.time.Period(45747072000022L, periodType81);
        java.lang.Object obj84 = null;
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime(obj84);
        org.joda.time.DateTime.Property property86 = dateTime85.millisOfDay();
        org.joda.time.DateTimeField dateTimeField87 = property86.getField();
        org.joda.time.DateTime dateTime88 = property86.roundHalfFloorCopy();
        org.joda.time.Duration duration89 = period83.toDurationTo((org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.Hours hours90 = duration89.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant32 and dateTime85", (instant32.compareTo(dateTime85) == 0) == instant32.equals(dateTime85));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.Period period8 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.joda.time.Duration duration12 = period7.toDurationTo((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Instant instant14 = instant11.plus((long) (byte) -1);
        org.joda.time.DateTime dateTime15 = instant11.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getRangeDurationType();
        org.joda.time.DateTime.Property property18 = dateTime15.property(dateTimeFieldType16);
        boolean boolean20 = dateTime15.isEqual((long) 53);
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period23 = duration22.toPeriod();
        org.joda.time.DateTime dateTime25 = dateTime15.withDurationAdded((org.joda.time.ReadableDuration) duration22, (-292275054));
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(0L, dateTimeZone27);
        mutableDateTime28.addMillis(50);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) mutableDateTime28);
        mutablePeriod31.addYears(53689989);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate37 = localDate35.minusMonths((int) ' ');
        org.joda.time.Chronology chronology38 = localDate35.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.minuteOfHour();
        org.joda.time.DurationField durationField41 = chronology38.weekyears();
        org.joda.time.DateTimeField dateTimeField42 = chronology38.minuteOfDay();
        java.lang.String str43 = chronology38.toString();
        mutablePeriod31.setPeriod(3L, chronology38);
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (short) 1, chronology48);
        org.joda.time.DateTime dateTime50 = dateTime49.toDateTime();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (short) 1, chronology52);
        org.joda.time.DateTime dateTime54 = dateTime53.toDateTime();
        int int55 = dateTime50.compareTo((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.Duration duration57 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime53, (org.joda.time.ReadableDuration) duration57);
        org.joda.time.Duration duration60 = duration46.withDurationAdded((org.joda.time.ReadableDuration) duration57, 10);
        java.lang.String str61 = duration46.toString();
        org.joda.time.Period period62 = duration46.toPeriod();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(chronology63);
        int int65 = dateTime64.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = null;
        java.lang.String str67 = dateTime64.toString(dateTimeFormatter66);
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) dateTime64, periodType68);
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate72 = localDate70.minusMonths((int) ' ');
        org.joda.time.Chronology chronology73 = localDate70.getChronology();
        org.joda.time.DateTimeField dateTimeField74 = chronology73.minuteOfDay();
        org.joda.time.DurationField durationField75 = chronology73.days();
        org.joda.time.DurationField durationField76 = chronology73.months();
        org.joda.time.DurationField durationField77 = chronology73.weekyears();
        org.joda.time.Chronology chronology78 = chronology73.withUTC();
        mutablePeriod31.setPeriod((org.joda.time.ReadableDuration) duration46, chronology78);
        mutablePeriod31.setWeeks(12022);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime64", (instant9.compareTo(dateTime64) == 0) == instant9.equals(dateTime64));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        java.lang.String[] strArray11 = new java.lang.String[] { "dayOfMonth", "2022-02-21T10:53:40.615", "clockhourOfDay", "hi!", "PeriodType[Standard]", "Standard", "dayOfMonth", "59", "deu", "1970", "Standard" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.util.Spliterator<java.lang.String> strSpliterator14 = strSet12.spliterator();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.monthOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        int int19 = dateTime18.getSecondOfMinute();
        boolean boolean20 = dateTime18.isEqualNow();
        int int21 = dateTime18.getDayOfYear();
        org.joda.time.Chronology chronology22 = dateTime18.getChronology();
        long long23 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalDateTime localDateTime24 = property16.getLocalDateTime();
        boolean boolean25 = strSet12.equals((java.lang.Object) localDateTime24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusWeeks(39324);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withCenturyOfEra((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(0L, dateTimeZone32);
        int int35 = dateTimeZone32.getOffsetFromLocal((long) (byte) 1);
        java.lang.String str36 = dateTimeZone32.getID();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) 100, 1L, periodType42);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) 100, 1L, periodType46);
        org.joda.time.Period period48 = period43.plus((org.joda.time.ReadablePeriod) period47);
        org.joda.time.Instant instant49 = new org.joda.time.Instant();
        org.joda.time.Instant instant51 = instant49.withMillis(0L);
        org.joda.time.Duration duration52 = period47.toDurationTo((org.joda.time.ReadableInstant) instant51);
        mutableDateTime39.add((org.joda.time.ReadableDuration) duration52, 39);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime39.secondOfMinute();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime39.minuteOfHour();
        java.lang.String str57 = property56.getAsShortText();
        java.util.Locale locale58 = java.util.Locale.GERMAN;
        java.util.Locale locale59 = locale58.stripExtensions();
        int int60 = property56.getMaximumTextLength(locale59);
        java.lang.String str61 = dateTimeZone32.getName((long) 3, locale59);
        java.lang.String str62 = localDateTime29.toString("53811155", locale59);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime29.plusYears(289);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant49", (dateTime18.compareTo(instant49) == 0) == dateTime18.equals(instant49));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property4.addToCopy(39246272);
        org.joda.time.DateTime dateTime8 = dateTime6.withDayOfYear(14);
        int int9 = dateTime8.getSecondOfDay();
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(0L, dateTimeZone12);
        int int15 = dateTimeZone12.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj10, dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime8.toMutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.secondOfMinute();
        org.joda.time.DurationField durationField19 = property18.getLeapDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime17", (dateTime8.compareTo(mutableDateTime17) == 0) == dateTime8.equals(mutableDateTime17));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        int int3 = dateTime1.getYearOfEra();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 10, 100, (int) 'a', 21);
        java.lang.String str9 = mutablePeriod8.toString();
        org.joda.time.DateTime dateTime10 = dateTime1.plus((org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 100, 1L, periodType19);
        org.joda.time.Period period21 = period16.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.Instant instant24 = instant22.withMillis(0L);
        org.joda.time.Duration duration25 = period20.toDurationTo((org.joda.time.ReadableInstant) instant24);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration25, 39);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime12.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime12.setZone(dateTimeZone29);
        int int31 = mutableDateTime12.getYearOfEra();
        int int32 = mutableDateTime12.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime12.year();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate36 = localDate34.minusMonths((int) ' ');
        org.joda.time.Chronology chronology37 = localDate34.getChronology();
        mutableDateTime12.setChronology(chronology37);
        boolean boolean39 = dateTime1.isBefore((org.joda.time.ReadableInstant) mutableDateTime12);
        int int40 = dateTime1.getEra();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate43 = localDate41.plusMonths(43);
        int int44 = localDate41.getYear();
        org.joda.time.DateTime dateTime45 = dateTime1.withFields((org.joda.time.ReadablePartial) localDate41);
        int int46 = localDate41.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant22", (dateTime1.compareTo(instant22) == 0) == dateTime1.equals(instant22));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        mutableDateTime1.set(dateTimeFieldType2, 35);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 100, 1L, periodType9);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 100, 1L, periodType13);
        org.joda.time.Period period15 = period10.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Instant instant16 = new org.joda.time.Instant();
        org.joda.time.Instant instant18 = instant16.withMillis(0L);
        org.joda.time.Duration duration19 = period14.toDurationTo((org.joda.time.ReadableInstant) instant18);
        mutableDateTime6.add((org.joda.time.ReadableDuration) duration19, 39);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime6.secondOfMinute();
        mutableDateTime6.addYears(3);
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period27 = duration26.toPeriod();
        org.joda.time.Duration duration30 = duration26.withDurationAdded((long) 38, (int) 'a');
        long long31 = duration26.getStandardMinutes();
        mutableDateTime6.add((org.joda.time.ReadableDuration) duration26);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((-60494601599990L));
        org.joda.time.MutablePeriod mutablePeriod36 = mutablePeriod35.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.minutes();
        mutablePeriod35.add(durationFieldType37, 1970);
        mutableDateTime6.add(durationFieldType37, 54);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology42);
        org.joda.time.Instant instant45 = new org.joda.time.Instant();
        org.joda.time.Instant instant47 = instant45.withMillis(0L);
        org.joda.time.Chronology chronology48 = instant47.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.eras();
        java.util.Locale locale50 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology48, locale50, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property56 = localDateTime53.hourOfDay();
        org.joda.time.DateTimeField dateTimeField57 = property56.getField();
        int int58 = property56.get();
        org.joda.time.LocalDateTime localDateTime59 = property56.roundHalfFloorCopy();
        long long61 = chronology48.set((org.joda.time.ReadablePartial) localDateTime59, (long) 2022);
        org.joda.time.DateTime dateTime62 = dateTime43.toDateTime(chronology48);
        org.joda.time.DateTime.Property property63 = dateTime43.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration67 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime65.add((org.joda.time.ReadableDuration) duration67, (int) (short) 100);
        mutableDateTime65.setYear(10);
        mutableDateTime65.addSeconds((int) (short) 0);
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime65.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = property74.getFieldType();
        org.joda.time.DateTime.Property property76 = dateTime43.property(dateTimeFieldType75);
        mutableDateTime6.set(dateTimeFieldType75, 20);
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime6.year();
        org.joda.time.MutableDateTime mutableDateTime80 = property79.roundHalfCeiling();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime43", (instant16.compareTo(dateTime43) == 0) == instant16.equals(dateTime43));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 100, 1L, periodType10);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, 1L, periodType14);
        org.joda.time.Period period16 = period11.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Instant instant17 = new org.joda.time.Instant();
        org.joda.time.Instant instant19 = instant17.withMillis(0L);
        org.joda.time.Duration duration20 = period15.toDurationTo((org.joda.time.ReadableInstant) instant19);
        mutableDateTime7.add((org.joda.time.ReadableDuration) duration20, 39);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime7.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime7.setZone(dateTimeZone24);
        int int26 = mutableDateTime7.getYearOfEra();
        int int27 = mutableDateTime7.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime7.year();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfEven();
        org.joda.time.DateTime dateTime30 = localTime5.toDateTime((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.Instant instant32 = new org.joda.time.Instant();
        org.joda.time.Instant instant34 = instant32.withMillis(0L);
        org.joda.time.Chronology chronology35 = instant34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.eras();
        java.util.Locale locale37 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology35, locale37, (java.lang.Integer) 39221019);
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = java.util.Locale.GERMAN;
        java.util.Locale locale43 = java.util.Locale.CANADA;
        java.lang.String str44 = locale42.getDisplayVariant(locale43);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology41, locale43);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTimeParserBucket45.getZone();
        org.joda.time.Chronology chronology47 = chronology35.withZone(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = chronology47.hourOfDay();
        org.joda.time.DateTime dateTime49 = dateTime30.withChronology(chronology47);
        boolean boolean51 = dateTime49.isBefore((long) 49);
        org.joda.time.DateTime dateTime53 = dateTime49.plusMinutes(20);
        org.joda.time.DateTime.Property property54 = dateTime49.secondOfMinute();
        int int55 = property54.getMaximumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime49", (dateTime30.compareTo(dateTime49) == 0) == dateTime30.equals(dateTime49));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long2 = instant0.getMillis();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.monthOfYear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        int int7 = dateTime6.getSecondOfMinute();
        boolean boolean8 = dateTime6.isEqualNow();
        int int9 = dateTime6.getDayOfYear();
        org.joda.time.Chronology chronology10 = dateTime6.getChronology();
        long long11 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime13 = dateTime6.minusYears(0);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(53);
        int int16 = dateTime15.getHourOfDay();
        org.joda.time.DateTime.Property property17 = dateTime15.era();
        int int18 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period21 = duration20.toPeriod();
        org.joda.time.Duration duration24 = duration20.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime26.add((org.joda.time.ReadableDuration) duration28, (int) (short) 100);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        int int33 = dateTime32.getYearOfCentury();
        org.joda.time.Interval interval34 = duration28.toIntervalTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Duration duration35 = duration24.minus((org.joda.time.ReadableDuration) duration28);
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period38 = duration37.toPeriod();
        org.joda.time.Duration duration40 = duration24.withDurationAdded((org.joda.time.ReadableDuration) duration37, 54);
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardHours((long) (short) 1);
        org.joda.time.Duration duration44 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period45 = duration44.toPeriod();
        org.joda.time.Duration duration48 = duration44.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration48, readableInstant49);
        org.joda.time.Duration duration51 = duration48.toDuration();
        int int52 = duration42.compareTo((org.joda.time.ReadableDuration) duration51);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) 100, 1L, periodType55);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((long) 100, 1L, periodType59);
        org.joda.time.Period period61 = period56.plus((org.joda.time.ReadablePeriod) period60);
        org.joda.time.Instant instant62 = new org.joda.time.Instant();
        org.joda.time.Instant instant64 = instant62.withMillis(0L);
        org.joda.time.Duration duration65 = period60.toDurationTo((org.joda.time.ReadableInstant) instant64);
        long long66 = instant64.getMillis();
        org.joda.time.Instant instant68 = instant64.minus((long) (byte) 1);
        org.joda.time.Duration duration70 = org.joda.time.Duration.standardSeconds((long) 49);
        org.joda.time.Instant instant72 = instant68.withDurationAdded((org.joda.time.ReadableDuration) duration70, 16);
        boolean boolean73 = duration42.isShorterThan((org.joda.time.ReadableDuration) duration70);
        org.joda.time.Duration duration75 = duration40.withDurationAdded((org.joda.time.ReadableDuration) duration70, 39391533);
        org.joda.time.Seconds seconds76 = duration40.toStandardSeconds();
        org.joda.time.Instant instant77 = instant0.plus((org.joda.time.ReadableDuration) duration40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and instant62", (dateTime32.compareTo(instant62) == 0) == dateTime32.equals(instant62));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Instant instant5 = instant3.withMillis(0L);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.util.Locale locale8 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology6, locale8, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        int int16 = property14.get();
        org.joda.time.LocalDateTime localDateTime17 = property14.roundHalfFloorCopy();
        long long19 = chronology6.set((org.joda.time.ReadablePartial) localDateTime17, (long) 2022);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(chronology6);
        org.joda.time.DateTime.Property property21 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime22 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (short) 1, chronology24);
        org.joda.time.DateTime dateTime26 = dateTime25.toDateTime();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (short) 1, chronology28);
        org.joda.time.DateTime dateTime30 = dateTime29.toDateTime();
        int int31 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration35 = duration33.toDuration();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 1, chronology37);
        org.joda.time.DateTime dateTime39 = dateTime38.toDateTime();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (short) 1, chronology41);
        org.joda.time.DateTime dateTime43 = dateTime42.toDateTime();
        int int44 = dateTime39.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableDuration) duration46);
        org.joda.time.Duration duration48 = duration46.toDuration();
        org.joda.time.Duration duration50 = duration35.withDurationAdded((org.joda.time.ReadableDuration) duration48, 53644753);
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableDuration) duration50);
        long long52 = duration50.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant3", (dateTime1.compareTo(instant3) == 0) == dateTime1.equals(instant3));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime1.setZone(dateTimeZone18);
        int int20 = mutableDateTime1.getYearOfEra();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) 100, 1L, periodType25);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) 100, 1L, periodType29);
        org.joda.time.Period period31 = period26.plus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Instant instant32 = new org.joda.time.Instant();
        org.joda.time.Instant instant34 = instant32.withMillis(0L);
        org.joda.time.Duration duration35 = period30.toDurationTo((org.joda.time.ReadableInstant) instant34);
        mutableDateTime22.add((org.joda.time.ReadableDuration) duration35, 39);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime22.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime22.setZone(dateTimeZone39);
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = java.util.Locale.GERMAN;
        java.util.Locale locale44 = locale43.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology42, locale43, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone48 = dateTimeParserBucket47.getZone();
        long long50 = dateTimeZone39.getMillisKeepLocal(dateTimeZone48, 315532800097L);
        mutableDateTime1.setZone(dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.now(dateTimeZone48);
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime22", (mutableDateTime1.compareTo(mutableDateTime22) == 0) == mutableDateTime1.equals(mutableDateTime22));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period2 = duration1.toPeriod();
        org.joda.time.Duration duration5 = duration1.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 100, 1L, periodType12);
        org.joda.time.Period period14 = period9.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.Instant instant17 = instant15.withMillis(0L);
        org.joda.time.Duration duration18 = period13.toDurationTo((org.joda.time.ReadableInstant) instant17);
        long long19 = instant17.getMillis();
        org.joda.time.Interval interval20 = duration1.toIntervalTo((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Instant instant21 = instant17.toInstant();
        org.joda.time.MutableDateTime mutableDateTime22 = instant21.toMutableDateTimeISO();
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and mutableDateTime22", (instant17.compareTo(mutableDateTime22) == 0) == instant17.equals(mutableDateTime22));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.minuteOfHour();
        java.lang.String str19 = property18.getAsShortText();
        java.lang.String str20 = property18.getAsString();
        org.joda.time.MutableDateTime mutableDateTime21 = property18.roundHalfFloor();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        boolean boolean28 = property25.equals((java.lang.Object) '#');
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology29);
        int int31 = dateTime30.getSecondOfMinute();
        int int32 = dateTime30.getYearOfEra();
        int int33 = property25.getDifference((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime30.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime35 = dateTime30.toDateTimeISO();
        boolean boolean36 = mutableDateTime21.isBefore((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime21.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and instant13", (mutableDateTime21.compareTo(instant13) == 0) == mutableDateTime21.equals(instant13));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Instant instant5 = instant3.withMillis(0L);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.util.Locale locale8 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology6, locale8, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        int int16 = property14.get();
        org.joda.time.LocalDateTime localDateTime17 = property14.roundHalfFloorCopy();
        long long19 = chronology6.set((org.joda.time.ReadablePartial) localDateTime17, (long) 2022);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(chronology6);
        org.joda.time.DateTime.Property property21 = dateTime1.millisOfDay();
        org.joda.time.DateTime dateTime23 = dateTime1.plusMinutes(53689989);
        org.joda.time.DateTime dateTime24 = dateTime23.toDateTimeISO();
        org.joda.time.LocalTime localTime25 = dateTime24.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant3", (dateTime1.compareTo(instant3) == 0) == dateTime1.equals(instant3));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getSecondOfMinute();
        boolean boolean6 = dateTime4.isEqualNow();
        int int7 = dateTime4.getDayOfYear();
        org.joda.time.Chronology chronology8 = dateTime4.getChronology();
        org.joda.time.Period period9 = new org.joda.time.Period((long) 5, (long) (byte) 100, chronology8);
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 100, 1L, periodType19);
        org.joda.time.Period period21 = period16.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.Instant instant24 = instant22.withMillis(0L);
        org.joda.time.Duration duration25 = period20.toDurationTo((org.joda.time.ReadableInstant) instant24);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration25, 39);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime12.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime12.setZone(dateTimeZone29);
        java.lang.String str31 = dateTimeZone29.toString();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField39 = localDateTime37.getField((int) (byte) 0);
        java.util.Locale locale41 = java.util.Locale.CANADA;
        java.lang.String str42 = dateTimeField39.getAsShortText((long) (byte) 1, locale41);
        java.lang.String str43 = locale41.getVariant();
        java.lang.String str44 = locale41.toLanguageTag();
        java.lang.String str45 = dateTimeZone29.getShortName((long) 47, locale41);
        java.util.Locale.setDefault(category10, locale41);
        java.lang.String str47 = locale41.getISO3Country();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) 53932075, chronology8, locale41, (java.lang.Integer) 53803364, 54046989);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant22", (dateTime4.compareTo(instant22) == 0) == dateTime4.equals(instant22));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setYears((int) '#');
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod3.add((long) 1, chronology7);
        org.joda.time.ReadableInterval readableInterval9 = null;
        mutablePeriod3.setPeriod(readableInterval9);
        int int11 = mutablePeriod3.getWeeks();
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period14 = duration13.toPeriod();
        org.joda.time.Duration duration17 = duration13.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, readableInstant18);
        org.joda.time.Duration duration20 = duration17.toDuration();
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (short) 1, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfWeek();
        org.joda.time.DateTime.Property property26 = dateTime24.weekOfWeekyear();
        org.joda.time.DateTime dateTime28 = dateTime24.plus((long) 239);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology29);
        org.joda.time.Instant instant32 = new org.joda.time.Instant();
        org.joda.time.Instant instant34 = instant32.withMillis(0L);
        org.joda.time.Chronology chronology35 = instant34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.eras();
        java.util.Locale locale37 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology35, locale37, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property43 = localDateTime40.hourOfDay();
        org.joda.time.DateTimeField dateTimeField44 = property43.getField();
        int int45 = property43.get();
        org.joda.time.LocalDateTime localDateTime46 = property43.roundHalfFloorCopy();
        long long48 = chronology35.set((org.joda.time.ReadablePartial) localDateTime46, (long) 2022);
        org.joda.time.DateTime dateTime49 = dateTime30.toDateTime(chronology35);
        org.joda.time.DateTime.Property property50 = dateTime30.millisOfDay();
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property54 = localDateTime51.hourOfDay();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime51.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str58 = dateTimeFieldType57.getName();
        int int59 = localDateTime51.indexOf(dateTimeFieldType57);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str61 = dateTimeFieldType60.getName();
        org.joda.time.LocalDateTime.Property property62 = localDateTime51.property(dateTimeFieldType60);
        int int63 = localDateTime51.getDayOfWeek();
        org.joda.time.DateTime dateTime64 = dateTime30.withFields((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.DateTime dateTime65 = dateTime28.withFields((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.Period period68 = period66.plusMonths(62);
        int int69 = period68.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant32", (dateTime30.compareTo(instant32) == 0) == dateTime30.equals(instant32));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis(0L);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology5);
        org.joda.time.DurationField durationField8 = chronology5.eras();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now(chronology5);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(chronology5);
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.lang.String str16 = locale14.getDisplayVariant(locale15);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology13, locale15, (java.lang.Integer) 10);
        long long21 = dateTimeParserBucket18.computeMillis(true, "");
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField28 = localDateTime26.getField((int) (byte) 0);
        dateTimeParserBucket18.saveField(dateTimeField28, (int) (short) 10);
        java.lang.Object obj31 = dateTimeParserBucket18.saveState();
        java.util.Locale locale32 = dateTimeParserBucket18.getLocale();
        long long35 = dateTimeParserBucket18.computeMillis(false, "14");
        long long36 = dateTimeParserBucket18.computeMillis();
        java.lang.Object obj37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(obj37);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property42 = localDateTime39.hourOfDay();
        org.joda.time.DateTimeField dateTimeField43 = property42.getField();
        boolean boolean45 = property42.equals((java.lang.Object) '#');
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology46);
        int int48 = dateTime47.getSecondOfMinute();
        int int49 = dateTime47.getYearOfEra();
        int int50 = property42.getDifference((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) dateTime47);
        int int52 = dateTime47.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.weekyear();
        int int54 = dateTime47.get(dateTimeFieldType53);
        dateTimeParserBucket18.saveField(dateTimeFieldType53, 28);
        int int57 = localDate10.get(dateTimeFieldType53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime38", (instant2.compareTo(dateTime38) == 0) == instant2.equals(dateTime38));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 1L, periodType5);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 100, 1L, periodType9);
        org.joda.time.Period period11 = period6.plus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant14 = instant12.withMillis(0L);
        org.joda.time.Duration duration15 = period10.toDurationTo((org.joda.time.ReadableInstant) instant14);
        mutableDateTime2.add((org.joda.time.ReadableDuration) duration15, 39);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.secondOfMinute();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (short) 1, chronology22);
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) instant24, periodType25);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate29 = localDate27.minusMonths((int) ' ');
        org.joda.time.Chronology chronology30 = localDate27.getChronology();
        org.joda.time.Period period31 = new org.joda.time.Period((long) (byte) 1, periodType25, chronology30);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate34 = localDate32.minusMonths((int) ' ');
        org.joda.time.Chronology chronology35 = localDate32.getChronology();
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate38 = localDate32.withFieldAdded(durationFieldType36, (int) (byte) 100);
        boolean boolean39 = periodType25.isSupported(durationFieldType36);
        org.joda.time.PeriodType periodType40 = periodType25.withDaysRemoved();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property42 = localDate41.dayOfMonth();
        org.joda.time.Chronology chronology43 = localDate41.getChronology();
        org.joda.time.Period period44 = new org.joda.time.Period((long) 43, periodType25, chronology43);
        mutableDateTime2.setChronology(chronology43);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (short) 1, chronology47);
        org.joda.time.Instant instant49 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime48, (org.joda.time.ReadableInstant) instant49, periodType50);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int53 = instant49.get(dateTimeFieldType52);
        boolean boolean54 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) instant49);
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate57 = localDate55.minusMonths((int) ' ');
        int int58 = localDate55.size();
        org.joda.time.LocalDate.Property property59 = localDate55.era();
        org.joda.time.PeriodType periodType60 = org.joda.time.PeriodType.yearDayTime();
        boolean boolean61 = localDate55.equals((java.lang.Object) periodType60);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod(readableDuration0, (org.joda.time.ReadableInstant) mutableDateTime2, periodType60);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(chronology63);
        int int65 = dateTime64.getSecondOfMinute();
        boolean boolean66 = dateTime64.isEqualNow();
        int int67 = dateTime64.getDayOfYear();
        org.joda.time.Chronology chronology68 = dateTime64.getChronology();
        org.joda.time.Duration duration70 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.DateTime dateTime71 = dateTime64.plus((org.joda.time.ReadableDuration) duration70);
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration75 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime73.add((org.joda.time.ReadableDuration) duration75, (int) (short) 100);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime(chronology78);
        int int80 = dateTime79.getYearOfCentury();
        org.joda.time.Interval interval81 = duration75.toIntervalTo((org.joda.time.ReadableInstant) dateTime79);
        int int82 = duration70.compareTo((org.joda.time.ReadableDuration) duration75);
        org.joda.time.Duration duration84 = org.joda.time.Duration.standardSeconds(10L);
        boolean boolean85 = duration75.isShorterThan((org.joda.time.ReadableDuration) duration84);
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.DateTime dateTime87 = new org.joda.time.DateTime(chronology86);
        org.joda.time.DateTime dateTime90 = dateTime87.withDurationAdded((long) 41, 53);
        org.joda.time.Interval interval91 = duration75.toIntervalTo((org.joda.time.ReadableInstant) dateTime87);
        mutablePeriod62.add((org.joda.time.ReadableInterval) interval91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime64", (instant12.compareTo(dateTime64) == 0) == instant12.equals(dateTime64));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.add((long) 45);
        int int4 = mutableDateTime1.getYearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str8 = dateTimeZone6.getNameKey((long) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, 1L, periodType14);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) 100, 1L, periodType18);
        org.joda.time.Period period20 = period15.plus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.Instant instant23 = instant21.withMillis(0L);
        org.joda.time.Duration duration24 = period19.toDurationTo((org.joda.time.ReadableInstant) instant23);
        mutableDateTime11.add((org.joda.time.ReadableDuration) duration24, 39);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime11.secondOfMinute();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime11.minuteOfHour();
        java.lang.String str29 = property28.getAsShortText();
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = locale30.stripExtensions();
        int int32 = property28.getMaximumTextLength(locale31);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField39 = localDateTime37.getField((int) (byte) 0);
        java.util.Locale locale41 = java.util.Locale.CANADA;
        java.lang.String str42 = dateTimeField39.getAsShortText((long) (byte) 1, locale41);
        java.lang.String str43 = locale31.getDisplayName(locale41);
        java.lang.String str44 = locale31.getISO3Country();
        java.lang.String str45 = dateTimeZone6.getShortName(10L, locale31);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.monthOfYear();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(chronology48);
        int int50 = dateTime49.getSecondOfMinute();
        boolean boolean51 = dateTime49.isEqualNow();
        int int52 = dateTime49.getDayOfYear();
        org.joda.time.Chronology chronology53 = dateTime49.getChronology();
        long long54 = property47.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime dateTime56 = dateTime49.minusYears(0);
        org.joda.time.DateTime.Property property57 = dateTime56.secondOfDay();
        org.joda.time.DateTime dateTime59 = property57.addToCopy(40);
        int int60 = dateTimeZone6.getOffset((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTime dateTime61 = mutableDateTime5.toDateTime(dateTimeZone6);
        mutableDateTime5.setWeekyear(785);
        mutableDateTime5.addYears(2720);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime61", (mutableDateTime1.compareTo(dateTime61) == 0) == mutableDateTime1.equals(dateTime61));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.Period period8 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.joda.time.Duration duration12 = period7.toDurationTo((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Instant instant14 = instant11.plus((long) (byte) -1);
        org.joda.time.DateTime dateTime15 = instant11.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime15.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        long long19 = dateTimeZone17.nextTransition(10L);
        boolean boolean20 = dateTimeZone17.isFixed();
        org.joda.time.DateTime dateTime21 = dateTime15.withZoneRetainFields(dateTimeZone17);
        org.joda.time.DateTime.Property property22 = dateTime15.weekOfWeekyear();
        org.joda.time.DateTime dateTime23 = property22.roundCeilingCopy();
        org.joda.time.DateTime dateTime24 = property22.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime15", (instant11.compareTo(dateTime15) == 0) == instant11.equals(dateTime15));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.Period period5 = period3.minusSeconds((-1));
        java.lang.String str6 = period3.toString();
        org.joda.time.Period period7 = period3.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 100, 1L, periodType13);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 100, 1L, periodType17);
        org.joda.time.Period period19 = period14.plus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Instant instant20 = new org.joda.time.Instant();
        org.joda.time.Instant instant22 = instant20.withMillis(0L);
        org.joda.time.Duration duration23 = period18.toDurationTo((org.joda.time.ReadableInstant) instant22);
        mutableDateTime10.add((org.joda.time.ReadableDuration) duration23, 39);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime10.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime10.toMutableDateTime(dateTimeZone27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.secondOfDay();
        org.joda.time.Duration duration30 = period7.toDurationFrom((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (short) 1, chronology32);
        org.joda.time.DateTime dateTime34 = dateTime33.toDateTime();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (short) 1, chronology36);
        org.joda.time.DateTime dateTime38 = dateTime37.toDateTime();
        int int39 = dateTime34.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Duration duration41 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableDuration) duration41);
        org.joda.time.DateMidnight dateMidnight43 = dateTime37.toDateMidnight();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate46 = localDate44.minusMonths((int) ' ');
        org.joda.time.Chronology chronology47 = localDate44.getChronology();
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate50 = localDate44.withFieldAdded(durationFieldType48, (int) (byte) 100);
        org.joda.time.LocalDate localDate52 = localDate50.minusMonths(55);
        boolean boolean53 = dateTime37.equals((java.lang.Object) localDate50);
        org.joda.time.DateTime dateTime55 = dateTime37.withSecondOfMinute(12);
        org.joda.time.DateTime.Property property56 = dateTime37.era();
        org.joda.time.PeriodType periodType57 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(periodType57);
        boolean boolean60 = periodType57.equals((java.lang.Object) 53782176);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration30, (org.joda.time.ReadableInstant) dateTime37, periodType57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and mutableDateTime28", (mutableDateTime10.compareTo(mutableDateTime28) == 0) == mutableDateTime10.equals(mutableDateTime28));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 1, chronology3);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) instant5, periodType6);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.eras();
        java.util.Locale locale14 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology12, locale14, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        int int22 = property20.get();
        org.joda.time.LocalDateTime localDateTime23 = property20.roundHalfFloorCopy();
        long long25 = chronology12.set((org.joda.time.ReadablePartial) localDateTime23, (long) 2022);
        org.joda.time.DateTimeField dateTimeField26 = chronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField27 = chronology12.minuteOfHour();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 100, 1L, periodType30);
        org.joda.time.Period period33 = period31.minusSeconds((-1));
        java.lang.String str34 = period31.toString();
        org.joda.time.Period period35 = period31.negated();
        int[] intArray37 = chronology12.get((org.joda.time.ReadablePeriod) period35, (long) 1969);
        org.joda.time.DateTimeField dateTimeField38 = chronology12.halfdayOfDay();
        org.joda.time.Period period39 = new org.joda.time.Period((long) 894, 48L, periodType6, chronology12);
        org.joda.time.Duration duration41 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period42 = duration41.toPeriod();
        org.joda.time.Duration duration45 = duration41.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration49 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime47.add((org.joda.time.ReadableDuration) duration49, (int) (short) 100);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(chronology52);
        int int54 = dateTime53.getYearOfCentury();
        org.joda.time.Interval interval55 = duration49.toIntervalTo((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.Duration duration56 = duration45.minus((org.joda.time.ReadableDuration) duration49);
        org.joda.time.Period period57 = duration56.toPeriod();
        org.joda.time.Period period59 = period57.withDays(1439);
        org.joda.time.MutablePeriod mutablePeriod60 = period59.toMutablePeriod();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(chronology63);
        int int65 = dateTime64.getSecondOfMinute();
        boolean boolean66 = dateTime64.isEqualNow();
        int int67 = dateTime64.getDayOfYear();
        org.joda.time.Chronology chronology68 = dateTime64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology68);
        org.joda.time.DateTimeField dateTimeField70 = chronology68.year();
        org.joda.time.DateTimeField dateTimeField71 = chronology68.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime72 = org.joda.time.LocalDateTime.now(chronology68);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType74 = dateTimeFieldType73.getDurationType();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime72.withFieldAdded(durationFieldType74, 14);
        boolean boolean77 = period59.isSupported(durationFieldType74);
        boolean boolean78 = period39.isSupported(durationFieldType74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime53", (instant5.compareTo(dateTime53) == 0) == instant5.equals(dateTime53));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.Hours hours1 = duration0.toStandardHours();
        org.joda.time.Duration duration2 = duration0.toDuration();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        int int7 = dateTime6.getSecondOfMinute();
        boolean boolean8 = dateTime6.isEqualNow();
        int int9 = dateTime6.getDayOfYear();
        org.joda.time.Chronology chronology10 = dateTime6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.year();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(chronology10);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withFieldAdded(durationFieldType16, 14);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withYear(18);
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardDays((-1L));
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardDays((long) (byte) 1);
        java.lang.String str25 = duration24.toString();
        org.joda.time.Duration duration26 = duration22.plus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime14.withDurationAdded((org.joda.time.ReadableDuration) duration24, 53813);
        boolean boolean29 = duration0.isLongerThan((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period32 = duration31.toPeriod();
        org.joda.time.Duration duration35 = duration31.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Instant instant39 = new org.joda.time.Instant();
        org.joda.time.Instant instant41 = instant39.withMillis(0L);
        org.joda.time.Chronology chronology42 = instant41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.eras();
        java.util.Locale locale44 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology42, locale44, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) 53, chronology42);
        org.joda.time.DateTimeField dateTimeField48 = chronology42.dayOfYear();
        org.joda.time.DateTimeField dateTimeField49 = chronology42.monthOfYear();
        org.joda.time.Period period50 = duration31.toPeriod(periodType36, chronology42);
        boolean boolean51 = duration24.isEqual((org.joda.time.ReadableDuration) duration31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant39", (dateTime6.compareTo(instant39) == 0) == dateTime6.equals(instant39));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime.Property property2 = dateTime1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.DateTime dateTime4 = property2.withMinimumValue();
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str6 = property2.getAsShortText(locale5);
        org.joda.time.DateTimeField dateTimeField7 = property2.getField();
        boolean boolean8 = dateTimeField7.isSupported();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 100, 1L, periodType13);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 100, 1L, periodType17);
        org.joda.time.Period period19 = period14.plus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Instant instant20 = new org.joda.time.Instant();
        org.joda.time.Instant instant22 = instant20.withMillis(0L);
        org.joda.time.Duration duration23 = period18.toDurationTo((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Instant instant25 = instant22.plus((long) (byte) -1);
        org.joda.time.Instant instant28 = instant25.withDurationAdded(1L, (int) (short) -1);
        org.joda.time.Chronology chronology29 = instant25.getChronology();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.util.Locale locale33 = locale32.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 45, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket(0L, chronology29, locale32, (java.lang.Integer) 1970);
        java.util.Locale locale39 = java.util.Locale.ITALY;
        java.lang.String str40 = locale32.getDisplayScript(locale39);
        java.lang.String str41 = dateTimeField7.getAsText((long) 42, locale32);
        java.lang.String str42 = locale32.getISO3Language();
        java.lang.String str43 = locale32.toLanguageTag();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant20", (dateTime1.compareTo(instant20) == 0) == dateTime1.equals(instant20));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.year();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology7.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.millisOfSecond();
        org.joda.time.tz.NameProvider nameProvider14 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        long long18 = dateTimeZone15.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) 100, 1L, periodType25);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) 100, 1L, periodType29);
        org.joda.time.Period period31 = period26.plus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Instant instant32 = new org.joda.time.Instant();
        org.joda.time.Instant instant34 = instant32.withMillis(0L);
        org.joda.time.Duration duration35 = period30.toDurationTo((org.joda.time.ReadableInstant) instant34);
        mutableDateTime22.add((org.joda.time.ReadableDuration) duration35, 39);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime22.secondOfMinute();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime22.minuteOfHour();
        java.lang.String str40 = property39.getAsShortText();
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.util.Locale locale42 = locale41.stripExtensions();
        int int43 = property39.getMaximumTextLength(locale42);
        java.lang.String str44 = dateTimeZone15.getShortName((long) (short) 1, locale42);
        java.lang.String str47 = nameProvider14.getShortName(locale42, "PT86400S", "P90YT0.198S");
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) 100, 1L, periodType52);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) 100, 1L, periodType56);
        org.joda.time.Period period58 = period53.plus((org.joda.time.ReadablePeriod) period57);
        org.joda.time.Instant instant59 = new org.joda.time.Instant();
        org.joda.time.Instant instant61 = instant59.withMillis(0L);
        org.joda.time.Duration duration62 = period57.toDurationTo((org.joda.time.ReadableInstant) instant61);
        mutableDateTime49.add((org.joda.time.ReadableDuration) duration62, 39);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime49.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime49.setZone(dateTimeZone66);
        int int68 = mutableDateTime49.getYearOfEra();
        mutableDateTime49.addMonths(41);
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime49.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime71.minuteOfHour();
        java.util.Locale locale74 = new java.util.Locale("en_US");
        int int75 = property72.getMaximumTextLength(locale74);
        java.lang.String str76 = locale74.getLanguage();
        java.lang.String str77 = locale74.getDisplayName();
        java.lang.String str80 = nameProvider14.getName(locale74, "0010-01-01T00:16:40.052Z", "PT0.594S");
        java.lang.String str81 = locale74.toLanguageTag();
        java.lang.String str82 = dateTimeField12.getAsShortText(654, locale74);
        long long85 = dateTimeField12.add(53730692L, (long) 53980585);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant32", (dateTime3.compareTo(instant32) == 0) == dateTime3.equals(instant32));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTime dateTime6 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.withYear(53644753);
        int int9 = dateTime8.getMillisOfSecond();
        org.joda.time.DateTime dateTime11 = dateTime8.minusMinutes(365);
        org.joda.time.DateTime dateTime13 = dateTime8.withWeekyear(39398852);
        org.joda.time.DateTime dateTime15 = dateTime8.plusMonths(53828705);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone17.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone17);
        int int23 = dateTimeZone17.getOffset((long) (short) 0);
        java.lang.String str25 = dateTimeZone17.getNameKey((long) (short) 1);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        int int32 = dateTime31.getSecondOfMinute();
        boolean boolean33 = dateTime31.isEqualNow();
        int int34 = dateTime31.getDayOfYear();
        org.joda.time.Chronology chronology35 = dateTime31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.year();
        org.joda.time.DateTimeZone dateTimeZone38 = chronology35.getZone();
        java.lang.String str40 = dateTimeZone38.getShortName((long) 53639537);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (byte) -1, dateTimeZone38);
        long long43 = dateTimeZone17.getMillisKeepLocal(dateTimeZone38, (long) ' ');
        org.joda.time.DateTime dateTime44 = dateTime15.withZone(dateTimeZone17);
        long long46 = dateTimeZone17.convertUTCToLocal(50367982L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime44", (dateTime15.compareTo(dateTime44) == 0) == dateTime15.equals(dateTime44));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        java.util.Locale locale6 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale6, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        int int14 = property12.get();
        org.joda.time.LocalDateTime localDateTime15 = property12.roundHalfFloorCopy();
        long long17 = chronology4.set((org.joda.time.ReadablePartial) localDateTime15, (long) 2022);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withWeekyear((int) (short) 10);
        int int20 = localDateTime19.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withSecondOfMinute(39);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withSecondOfMinute(34);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.months();
        boolean boolean26 = localDateTime22.equals((java.lang.Object) durationFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        long long30 = dateTimeZone27.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusSeconds(39);
        org.joda.time.LocalDateTime.Property property34 = localDateTime31.secondOfMinute();
        org.joda.time.LocalDateTime.Property property35 = localDateTime31.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundHalfCeilingCopy();
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period39 = duration38.toPeriod();
        org.joda.time.Duration duration42 = duration38.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime44.add((org.joda.time.ReadableDuration) duration46, (int) (short) 100);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(chronology49);
        int int51 = dateTime50.getYearOfCentury();
        org.joda.time.Interval interval52 = duration46.toIntervalTo((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Duration duration53 = duration42.minus((org.joda.time.ReadableDuration) duration46);
        org.joda.time.Period period54 = duration53.toPeriod();
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period57 = duration56.toPeriod();
        org.joda.time.Duration duration60 = duration56.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.Duration duration62 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period63 = duration62.toPeriod();
        org.joda.time.Duration duration64 = duration56.plus((org.joda.time.ReadableDuration) duration62);
        org.joda.time.Seconds seconds65 = duration56.toStandardSeconds();
        boolean boolean66 = duration53.isEqual((org.joda.time.ReadableDuration) duration56);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime36.plus((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime22, (org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.DateTime dateTime69 = localDateTime22.toDateTime();
        org.joda.time.LocalDateTime.Property property70 = localDateTime22.dayOfYear();
        int int71 = property70.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime50", (instant1.compareTo(dateTime50) == 0) == instant1.equals(dateTime50));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime1.toMutableDateTime();
        int int21 = mutableDateTime1.getWeekOfWeekyear();
        mutableDateTime1.addMinutes(457070);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime1.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.hourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        boolean boolean31 = property28.equals((java.lang.Object) '#');
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology32);
        int int34 = dateTime33.getSecondOfMinute();
        int int35 = dateTime33.getYearOfEra();
        int int36 = property28.getDifference((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime33.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime38 = dateTime33.toDateTimeISO();
        int int39 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) dateTime33);
        mutableDateTime1.setMillis(2113838800451L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime33", (instant11.compareTo(dateTime33) == 0) == instant11.equals(dateTime33));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(315532800097L, chronology7, locale8);
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 100, 1L, periodType13);
        org.joda.time.Period period15 = period14.normalizedStandard();
        int[] intArray17 = chronology7.get((org.joda.time.ReadablePeriod) period15, (long) (short) 0);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = locale21.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket25.getZone();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = localTime27.toDateTimeToday();
        org.joda.time.LocalTime.Property property29 = localTime27.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property29.addNoWrapToCopy(46);
        org.joda.time.LocalTime localTime33 = property29.addNoWrapToCopy(31);
        org.joda.time.LocalTime localTime35 = property29.addWrapFieldToCopy(39251167);
        org.joda.time.LocalTime localTime36 = property29.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime38 = property29.addCopy((long) 28);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) 100, 1L, periodType43);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) 100, 1L, periodType47);
        org.joda.time.Period period49 = period44.plus((org.joda.time.ReadablePeriod) period48);
        org.joda.time.Instant instant50 = new org.joda.time.Instant();
        org.joda.time.Instant instant52 = instant50.withMillis(0L);
        org.joda.time.Duration duration53 = period48.toDurationTo((org.joda.time.ReadableInstant) instant52);
        mutableDateTime40.add((org.joda.time.ReadableDuration) duration53, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean57 = mutableDateTime40.isSupported(dateTimeFieldType56);
        boolean boolean58 = mutableDateTime40.isBeforeNow();
        int int59 = mutableDateTime40.getSecondOfDay();
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) 100);
        org.joda.time.DateTime.Property property62 = dateTime61.monthOfYear();
        org.joda.time.DateTime dateTime63 = dateTime61.toDateTimeISO();
        mutableDateTime40.setMillis((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTime dateTime65 = localTime38.toDateTime((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.LocalTime localTime66 = localTime18.withFields((org.joda.time.ReadablePartial) localTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant50", (dateTime3.compareTo(instant50) == 0) == dateTime3.equals(instant50));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.Period period8 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.joda.time.Duration duration12 = period7.toDurationTo((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Instant instant14 = instant11.plus((long) (byte) -1);
        org.joda.time.Instant instant17 = instant14.withDurationAdded(1L, (int) (short) -1);
        long long18 = instant14.getMillis();
        org.joda.time.DateTime dateTime19 = instant14.toDateTimeISO();
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        org.joda.time.DateTime.Property property22 = dateTime21.millisOfDay();
        org.joda.time.LocalDateTime localDateTime23 = dateTime21.toLocalDateTime();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.weekyear();
        org.joda.time.LocalDateTime localDateTime26 = property24.setCopy((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 100, 1L, periodType31);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) 100, 1L, periodType35);
        org.joda.time.Period period37 = period32.plus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Instant instant38 = new org.joda.time.Instant();
        org.joda.time.Instant instant40 = instant38.withMillis(0L);
        org.joda.time.Duration duration41 = period36.toDurationTo((org.joda.time.ReadableInstant) instant40);
        mutableDateTime28.add((org.joda.time.ReadableDuration) duration41, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean45 = mutableDateTime28.isSupported(dateTimeFieldType44);
        int int46 = mutableDateTime28.getWeekOfWeekyear();
        org.joda.time.Instant instant48 = new org.joda.time.Instant();
        org.joda.time.Instant instant50 = instant48.withMillis(0L);
        org.joda.time.Chronology chronology51 = instant50.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.eras();
        java.util.Locale locale53 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology51, locale53, (java.lang.Integer) 39221019);
        mutableDateTime28.setChronology(chronology51);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((long) 100, 1L, periodType61);
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period((long) 100, 1L, periodType65);
        org.joda.time.Period period67 = period62.plus((org.joda.time.ReadablePeriod) period66);
        org.joda.time.Instant instant68 = new org.joda.time.Instant();
        org.joda.time.Instant instant70 = instant68.withMillis(0L);
        org.joda.time.Duration duration71 = period66.toDurationTo((org.joda.time.ReadableInstant) instant70);
        mutableDateTime58.add((org.joda.time.ReadableDuration) duration71, 39);
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime58.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime58.setZone(dateTimeZone75);
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime28, dateTimeZone75);
        org.joda.time.DurationFieldType durationFieldType78 = org.joda.time.DurationFieldType.days();
        mutableDateTime28.add(durationFieldType78, 13);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime26.withFieldAdded(durationFieldType78, (int) (short) 10);
        org.joda.time.DateTime dateTime84 = dateTime19.withFieldAdded(durationFieldType78, 53756258);
        org.joda.time.DateTime dateTime86 = dateTime19.minusHours(39481237);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime21", (instant9.compareTo(dateTime21) == 0) == instant9.equals(dateTime21));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean18 = mutableDateTime1.isSupported(dateTimeFieldType17);
        int int19 = mutableDateTime1.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime1.dayOfWeek();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology21);
        int int23 = dateTime22.getDayOfMonth();
        org.joda.time.DateTime dateTime25 = dateTime22.withMillisOfDay(9);
        org.joda.time.DateTime dateTime27 = dateTime25.plusMinutes(40);
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) dateTime27);
        mutableDateTime1.setTime((long) 39316455);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime22", (instant11.compareTo(dateTime22) == 0) == instant11.equals(dateTime22));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period2 = duration1.toPeriod();
        org.joda.time.Duration duration5 = duration1.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime7.add((org.joda.time.ReadableDuration) duration9, (int) (short) 100);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        int int14 = dateTime13.getYearOfCentury();
        org.joda.time.Interval interval15 = duration9.toIntervalTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Duration duration16 = duration5.minus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period19 = duration18.toPeriod();
        org.joda.time.Duration duration21 = duration5.withDurationAdded((org.joda.time.ReadableDuration) duration18, 54);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardHours((long) (short) 1);
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period26 = duration25.toPeriod();
        org.joda.time.Duration duration29 = duration25.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration29, readableInstant30);
        org.joda.time.Duration duration32 = duration29.toDuration();
        int int33 = duration23.compareTo((org.joda.time.ReadableDuration) duration32);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 100, 1L, periodType36);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) 100, 1L, periodType40);
        org.joda.time.Period period42 = period37.plus((org.joda.time.ReadablePeriod) period41);
        org.joda.time.Instant instant43 = new org.joda.time.Instant();
        org.joda.time.Instant instant45 = instant43.withMillis(0L);
        org.joda.time.Duration duration46 = period41.toDurationTo((org.joda.time.ReadableInstant) instant45);
        long long47 = instant45.getMillis();
        org.joda.time.Instant instant49 = instant45.minus((long) (byte) 1);
        org.joda.time.Duration duration51 = org.joda.time.Duration.standardSeconds((long) 49);
        org.joda.time.Instant instant53 = instant49.withDurationAdded((org.joda.time.ReadableDuration) duration51, 16);
        boolean boolean54 = duration23.isShorterThan((org.joda.time.ReadableDuration) duration51);
        org.joda.time.Duration duration56 = duration21.withDurationAdded((org.joda.time.ReadableDuration) duration51, 39391533);
        org.joda.time.Seconds seconds57 = duration51.toStandardSeconds();
        org.joda.time.Period period58 = duration51.toPeriod();
        org.joda.time.Days days59 = duration51.toStandardDays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant43", (dateTime13.compareTo(instant43) == 0) == dateTime13.equals(instant43));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        java.lang.Object obj18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj18);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField26 = localDateTime24.getField((int) (byte) 0);
        long long28 = dateTimeField26.roundHalfEven((long) 1);
        int int29 = dateTime19.get(dateTimeField26);
        mutableDateTime1.setRounding(dateTimeField26);
        mutableDateTime1.setMinuteOfDay(37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime19", (instant11.compareTo(dateTime19) == 0) == instant11.equals(dateTime19));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 1, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        int int8 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime.Property property9 = dateTime3.hourOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.centuryOfEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        int int15 = dateTime14.getSecondOfMinute();
        boolean boolean16 = dateTime14.isEqualNow();
        int int17 = dateTime14.getDayOfYear();
        org.joda.time.Chronology chronology18 = dateTime14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology18);
        int int20 = mutablePeriod19.getDays();
        org.joda.time.DateTime dateTime21 = dateTime3.minus((org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) 100, 1L, periodType26);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 100, 1L, periodType30);
        org.joda.time.Period period32 = period27.plus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Instant instant33 = new org.joda.time.Instant();
        org.joda.time.Instant instant35 = instant33.withMillis(0L);
        org.joda.time.Duration duration36 = period31.toDurationTo((org.joda.time.ReadableInstant) instant35);
        mutableDateTime23.add((org.joda.time.ReadableDuration) duration36, 39);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime23.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime23.toMutableDateTime(dateTimeZone40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.secondOfDay();
        org.joda.time.Period period44 = org.joda.time.Period.millis(100);
        org.joda.time.Period period45 = period44.negated();
        mutableDateTime41.add((org.joda.time.ReadablePeriod) period44, 0);
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) mutableDateTime41, periodType48);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = null;
        boolean boolean51 = mutableDateTime41.isSupported(dateTimeFieldType50);
        int int52 = mutableDateTime41.getWeekOfWeekyear();
        org.joda.time.Chronology chronology54 = null;
        java.util.Locale locale55 = java.util.Locale.GERMAN;
        java.util.Locale locale56 = java.util.Locale.CANADA;
        java.lang.String str57 = locale55.getDisplayVariant(locale56);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology54, locale56);
        org.joda.time.DateTimeZone dateTimeZone59 = dateTimeParserBucket58.getZone();
        java.util.Locale locale60 = dateTimeParserBucket58.getLocale();
        java.util.Locale locale61 = dateTimeParserBucket58.getLocale();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (short) 1, chronology63);
        org.joda.time.Instant instant65 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime64, (org.joda.time.ReadableInstant) instant65, periodType66);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int69 = instant65.get(dateTimeFieldType68);
        java.lang.String str70 = dateTimeFieldType68.getName();
        java.lang.String str71 = dateTimeFieldType68.toString();
        dateTimeParserBucket58.saveField(dateTimeFieldType68, 36);
        int int74 = mutableDateTime41.get(dateTimeFieldType68);
        int int75 = mutableDateTime41.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant33", (dateTime14.compareTo(instant33) == 0) == dateTime14.equals(instant33));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = locale2.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeParserBucket6.getZone();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localTime8.toDateTimeToday();
        org.joda.time.LocalTime.Property property10 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property10.addNoWrapToCopy(46);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds(958);
        int int15 = localTime12.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 100, 1L, periodType20);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 100, 1L, periodType24);
        org.joda.time.Period period26 = period21.plus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.Instant instant29 = instant27.withMillis(0L);
        org.joda.time.Duration duration30 = period25.toDurationTo((org.joda.time.ReadableInstant) instant29);
        mutableDateTime17.add((org.joda.time.ReadableDuration) duration30, 39);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime17.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime17.setZone(dateTimeZone34);
        int int36 = mutableDateTime17.getYearOfEra();
        mutableDateTime17.addMonths(41);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime17.toMutableDateTimeISO();
        mutableDateTime17.addHours(4);
        boolean boolean43 = mutableDateTime17.isBefore(893L);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (short) 1, chronology45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime localTime50 = localTime48.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime52 = localTime50.plusMillis((int) (byte) 100);
        org.joda.time.DateTime dateTime53 = dateTime46.withFields((org.joda.time.ReadablePartial) localTime52);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (short) 1, chronology55);
        org.joda.time.Instant instant57 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType58 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) instant57, periodType58);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int61 = instant57.get(dateTimeFieldType60);
        java.lang.String str62 = dateTimeFieldType60.getName();
        boolean boolean63 = localTime52.isSupported(dateTimeFieldType60);
        boolean boolean64 = mutableDateTime17.isSupported(dateTimeFieldType60);
        boolean boolean65 = localTime12.isSupported(dateTimeFieldType60);
        org.joda.time.LocalTime localTime67 = localTime12.plusHours(37);
        org.joda.time.Chronology chronology68 = localTime12.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant27", (dateTime9.compareTo(instant27) == 0) == dateTime9.equals(instant27));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period2 = duration1.toPeriod();
        org.joda.time.Duration duration5 = duration1.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 100, 1L, periodType10);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, 1L, periodType14);
        org.joda.time.Period period16 = period11.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period18 = period16.withMillis(39251693);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration19, readableInstant20);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 100, 1L, periodType24);
        org.joda.time.Period period27 = period25.minusSeconds((-1));
        java.lang.String str28 = period25.toString();
        org.joda.time.Period period29 = period25.toPeriod();
        org.joda.time.PeriodType periodType30 = period25.getPeriodType();
        org.joda.time.Period period31 = period21.normalizedStandard(periodType30);
        java.lang.String str32 = periodType30.getName();
        org.joda.time.PeriodType periodType33 = periodType30.withMinutesRemoved();
        org.joda.time.PeriodType periodType34 = periodType33.withMonthsRemoved();
        org.joda.time.Period period35 = period18.normalizedStandard(periodType33);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime7, periodType33);
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period39 = duration38.toPeriod();
        org.joda.time.Duration duration42 = duration38.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration42, readableInstant43);
        org.joda.time.Duration duration45 = duration42.toDuration();
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period48 = duration47.toPeriod();
        org.joda.time.Duration duration51 = duration47.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((long) 100, 1L, periodType54);
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) 100, 1L, periodType58);
        org.joda.time.Period period60 = period55.plus((org.joda.time.ReadablePeriod) period59);
        org.joda.time.Instant instant61 = new org.joda.time.Instant();
        org.joda.time.Instant instant63 = instant61.withMillis(0L);
        org.joda.time.Duration duration64 = period59.toDurationTo((org.joda.time.ReadableInstant) instant63);
        org.joda.time.Instant instant66 = instant63.plus((long) (byte) -1);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) (short) 1, chronology68);
        org.joda.time.Instant instant70 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime69, (org.joda.time.ReadableInstant) instant70, periodType71);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration47, (org.joda.time.ReadableInstant) instant63, periodType71);
        int int74 = duration42.compareTo((org.joda.time.ReadableDuration) duration47);
        org.joda.time.Duration duration75 = duration1.plus((org.joda.time.ReadableDuration) duration47);
        org.joda.time.LocalDate localDate76 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate78 = localDate76.minusMonths((int) ' ');
        org.joda.time.Chronology chronology79 = localDate76.getChronology();
        org.joda.time.DurationFieldType durationFieldType80 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate82 = localDate76.withFieldAdded(durationFieldType80, (int) (byte) 100);
        org.joda.time.LocalDate localDate84 = localDate82.minusMonths(55);
        int int85 = localDate82.getWeekyear();
        org.joda.time.Chronology chronology86 = localDate82.getChronology();
        org.joda.time.Period period87 = duration47.toPeriod(chronology86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant61", (dateTime7.compareTo(instant61) == 0) == dateTime7.equals(instant61));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        boolean boolean4 = dateTime2.isEqualNow();
        int int5 = dateTime2.getDayOfYear();
        org.joda.time.Chronology chronology6 = dateTime2.getChronology();
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(315532800097L, chronology6, locale7);
        java.util.Locale locale9 = dateTimeParserBucket8.getLocale();
        boolean boolean10 = locale9.hasExtensions();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 100, 1L, periodType19);
        org.joda.time.Period period21 = period16.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.Instant instant24 = instant22.withMillis(0L);
        org.joda.time.Duration duration25 = period20.toDurationTo((org.joda.time.ReadableInstant) instant24);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration25, 39);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime12.yearOfEra();
        mutableDateTime12.setDayOfYear((int) ' ');
        mutableDateTime12.add((long) 53);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime12.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundHalfEven();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property38 = localDateTime35.hourOfDay();
        java.util.Locale locale39 = java.util.Locale.US;
        java.lang.String str40 = property38.getAsShortText(locale39);
        int int41 = property33.getMaximumTextLength(locale39);
        java.lang.String str42 = locale39.getDisplayScript();
        java.lang.String str43 = locale9.getDisplayVariant(locale39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant22", (dateTime2.compareTo(instant22) == 0) == dateTime2.equals(instant22));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.year();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(chronology7);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType14 = periodType13.withSecondsRemoved();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 100, 1L, periodType19);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) 100, 1L, periodType23);
        org.joda.time.Period period25 = period20.plus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Instant instant26 = new org.joda.time.Instant();
        org.joda.time.Instant instant28 = instant26.withMillis(0L);
        org.joda.time.Duration duration29 = period24.toDurationTo((org.joda.time.ReadableInstant) instant28);
        mutableDateTime16.add((org.joda.time.ReadableDuration) duration29, 39);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime16.yearOfEra();
        mutableDateTime16.setWeekOfWeekyear(14);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime16.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        long long39 = dateTimeZone36.convertLocalToUTC((long) (byte) 100, false);
        mutableDateTime16.setZone(dateTimeZone36);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate43 = localDate41.minusMonths((int) ' ');
        org.joda.time.Chronology chronology44 = localDate41.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.minuteOfDay();
        org.joda.time.DurationField durationField46 = chronology44.days();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime16, chronology44);
        org.joda.time.DateTimeField dateTimeField48 = chronology44.hourOfDay();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 11, 345600000L, periodType13, chronology44);
        org.joda.time.DateTime dateTime50 = dateTime10.withChronology(chronology44);
        org.joda.time.DateTime dateTime52 = dateTime50.minusDays(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant26", (dateTime3.compareTo(instant26) == 0) == dateTime3.equals(instant26));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = dateTime1.toString(dateTimeFormatter3);
        org.joda.time.DateTime dateTime6 = dateTime1.plusMonths(86396191);
        org.joda.time.DateTime dateTime8 = dateTime1.plusWeeks(45);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.eras();
        java.util.Locale locale16 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology14, locale16, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.hourOfDay();
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        int int24 = property22.get();
        org.joda.time.LocalDateTime localDateTime25 = property22.roundHalfFloorCopy();
        long long27 = chronology14.set((org.joda.time.ReadablePartial) localDateTime25, (long) 2022);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(chronology14);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DurationField durationField30 = chronology14.eras();
        java.util.Locale locale34 = new java.util.Locale("hi!", "clockhourOfDay", "java.io.IOException");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 42, chronology14, locale34);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeParserBucket35.getZone();
        int int38 = dateTimeZone36.getOffset((long) 40);
        org.joda.time.DateTime dateTime39 = dateTime8.withZone(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant11", (dateTime1.compareTo(instant11) == 0) == dateTime1.equals(instant11));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withYear(81);
        org.joda.time.LocalDate localDate4 = localDate2.plusYears(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        org.joda.time.Duration duration7 = org.joda.time.Duration.millis(1645455600000L);
        org.joda.time.Minutes minutes8 = duration7.toStandardMinutes();
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period11 = duration10.toPeriod();
        org.joda.time.Duration duration14 = duration10.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime16.add((org.joda.time.ReadableDuration) duration18, (int) (short) 100);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology21);
        int int23 = dateTime22.getYearOfCentury();
        org.joda.time.Interval interval24 = duration18.toIntervalTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Duration duration25 = duration14.minus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period28 = duration27.toPeriod();
        org.joda.time.Duration duration30 = duration14.withDurationAdded((org.joda.time.ReadableDuration) duration27, 54);
        org.joda.time.Duration duration31 = duration7.minus((org.joda.time.ReadableDuration) duration30);
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period34 = duration33.toPeriod();
        org.joda.time.Duration duration37 = duration33.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration41 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime39.add((org.joda.time.ReadableDuration) duration41, (int) (short) 100);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(chronology44);
        int int46 = dateTime45.getYearOfCentury();
        org.joda.time.Interval interval47 = duration41.toIntervalTo((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Duration duration48 = duration37.minus((org.joda.time.ReadableDuration) duration41);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = duration41.toPeriodTo(readableInstant49);
        org.joda.time.Duration duration51 = duration31.plus((org.joda.time.ReadableDuration) duration41);
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((long) 100, 1L, periodType54);
        org.joda.time.Period period57 = period55.minusSeconds((-1));
        java.lang.String str58 = period55.toString();
        org.joda.time.Period period59 = period55.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod60 = period59.toMutablePeriod();
        int int61 = mutablePeriod60.getDays();
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((long) 100, 1L, periodType64);
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period((long) 100, 1L, periodType68);
        org.joda.time.Period period70 = period65.plus((org.joda.time.ReadablePeriod) period69);
        org.joda.time.Instant instant71 = new org.joda.time.Instant();
        org.joda.time.Instant instant73 = instant71.withMillis(0L);
        org.joda.time.Duration duration74 = period69.toDurationTo((org.joda.time.ReadableInstant) instant73);
        long long75 = instant73.getMillis();
        org.joda.time.Instant instant77 = instant73.minus((long) (byte) 1);
        org.joda.time.Instant instant78 = new org.joda.time.Instant();
        org.joda.time.Instant instant80 = instant78.withMillis(0L);
        mutablePeriod60.setPeriod((org.joda.time.ReadableInstant) instant77, (org.joda.time.ReadableInstant) instant80);
        org.joda.time.Instant instant83 = instant77.withMillis((long) 1970);
        org.joda.time.Instant instant84 = instant77.toInstant();
        org.joda.time.Instant instant86 = instant84.plus((long) 39359862);
        long long87 = instant84.getMillis();
        org.joda.time.PeriodType periodType88 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType89 = periodType88.withDaysRemoved();
        org.joda.time.Period period90 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration31, (org.joda.time.ReadableInstant) instant84, periodType88);
        org.joda.time.DateTime dateTime91 = instant84.toDateTimeISO();
        int int92 = property5.compareTo((org.joda.time.ReadableInstant) dateTime91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime45 and instant71", (dateTime45.compareTo(instant71) == 0) == dateTime45.equals(instant71));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = dateTime1.toString(dateTimeFormatter3);
        org.joda.time.DateTime dateTime6 = dateTime1.plusMonths(86396191);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period9 = duration8.toPeriod();
        org.joda.time.Duration duration12 = duration8.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime14.add((org.joda.time.ReadableDuration) duration16, (int) (short) 100);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        int int21 = dateTime20.getYearOfCentury();
        org.joda.time.Interval interval22 = duration16.toIntervalTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Duration duration23 = duration12.minus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Hours hours24 = duration12.toStandardHours();
        org.joda.time.Duration duration25 = duration12.toDuration();
        org.joda.time.Duration duration27 = duration25.minus(360206L);
        org.joda.time.DateTime dateTime29 = dateTime1.withDurationAdded((org.joda.time.ReadableDuration) duration25, 591);
        org.joda.time.Instant instant34 = new org.joda.time.Instant();
        org.joda.time.Instant instant36 = instant34.withMillis(0L);
        org.joda.time.Chronology chronology37 = instant36.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.eras();
        java.util.Locale locale39 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology37, locale39, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 53, chronology37);
        org.joda.time.DateTimeField dateTimeField43 = chronology37.clockhourOfHalfday();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 54, 3600L, chronology37);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((-60494601599990L));
        org.joda.time.MutablePeriod mutablePeriod47 = mutablePeriod46.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.minutes();
        mutablePeriod46.add(durationFieldType48, 1970);
        boolean boolean51 = mutablePeriod44.isSupported(durationFieldType48);
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period54 = duration53.toPeriod();
        org.joda.time.Duration duration57 = duration53.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration57, readableInstant58);
        org.joda.time.Duration duration60 = duration57.toDuration();
        java.lang.String str61 = duration57.toString();
        org.joda.time.Duration duration63 = duration57.withMillis((long) (byte) 10);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) (short) 1, chronology66);
        org.joda.time.Instant instant68 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType69 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime67, (org.joda.time.ReadableInstant) instant68, periodType69);
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate73 = localDate71.minusMonths((int) ' ');
        org.joda.time.Chronology chronology74 = localDate71.getChronology();
        org.joda.time.Period period75 = new org.joda.time.Period((long) (byte) 1, periodType69, chronology74);
        org.joda.time.LocalDate localDate76 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate78 = localDate76.minusMonths((int) ' ');
        org.joda.time.Chronology chronology79 = localDate76.getChronology();
        org.joda.time.DurationFieldType durationFieldType80 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate82 = localDate76.withFieldAdded(durationFieldType80, (int) (byte) 100);
        boolean boolean83 = periodType69.isSupported(durationFieldType80);
        org.joda.time.PeriodType periodType84 = periodType69.withDaysRemoved();
        org.joda.time.Period period85 = duration57.toPeriod(periodType69);
        org.joda.time.PeriodType periodType86 = periodType69.withMonthsRemoved();
        org.joda.time.DurationFieldType durationFieldType87 = org.joda.time.DurationFieldType.millis();
        int int88 = periodType86.indexOf(durationFieldType87);
        java.lang.String str89 = durationFieldType87.getName();
        boolean boolean90 = mutablePeriod44.isSupported(durationFieldType87);
        org.joda.time.DateTime dateTime92 = dateTime29.withFieldAdded(durationFieldType87, (int) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant34", (dateTime1.compareTo(instant34) == 0) == dateTime1.equals(instant34));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean18 = mutableDateTime1.isSupported(dateTimeFieldType17);
        int int19 = mutableDateTime1.getWeekOfWeekyear();
        mutableDateTime1.setMillis((long) 958);
        int int22 = mutableDateTime1.getSecondOfMinute();
        int int23 = mutableDateTime1.getMillisOfSecond();
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField32 = localDateTime30.getField((int) (byte) 0);
        long long34 = dateTimeField32.roundHalfEven((long) 1);
        int int35 = dateTime25.get(dateTimeField32);
        boolean boolean36 = dateTime25.isBeforeNow();
        int int37 = dateTime25.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime39 = dateTime25.minusMinutes(21);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime41.add((org.joda.time.ReadableDuration) duration43, (int) (short) 100);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology46);
        int int48 = dateTime47.getYearOfCentury();
        org.joda.time.Interval interval49 = duration43.toIntervalTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableDuration50, readableInstant51);
        org.joda.time.Period period54 = period52.withDays((int) (byte) 1);
        org.joda.time.Period period56 = period54.minusWeeks(100);
        org.joda.time.Period period58 = period54.minusWeeks(2023);
        org.joda.time.Duration duration59 = period54.toStandardDuration();
        boolean boolean60 = duration43.isShorterThan((org.joda.time.ReadableDuration) duration59);
        org.joda.time.DateTime dateTime61 = dateTime25.plus((org.joda.time.ReadableDuration) duration59);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration59, 53851414);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime25", (instant11.compareTo(dateTime25) == 0) == instant11.equals(dateTime25));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 100, 1L, periodType3);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) 100, 1L, periodType7);
        org.joda.time.Period period9 = period4.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.withMillis(0L);
        org.joda.time.Duration duration13 = period8.toDurationTo((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Instant instant15 = instant12.plus((long) (byte) -1);
        org.joda.time.Instant instant18 = instant15.withDurationAdded(1L, (int) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime20.add((org.joda.time.ReadableDuration) duration22, (int) (short) 100);
        mutableDateTime20.setYear(10);
        mutableDateTime20.addSeconds((int) (short) 0);
        boolean boolean29 = instant15.isEqual((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.MutableDateTime mutableDateTime30 = instant15.toMutableDateTime();
        org.joda.time.Instant instant32 = instant15.minus(39446190000L);
        org.joda.time.Chronology chronology33 = instant32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 513, chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime30", (instant15.compareTo(mutableDateTime30) == 0) == instant15.equals(mutableDateTime30));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.monthOfYear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 1, chronology3);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) instant5, periodType6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int9 = instant5.get(dateTimeFieldType8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withField(dateTimeFieldType8, 39);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusSeconds(52);
        int int14 = localDateTime13.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.plusWeeks(22);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (short) 1, chronology18);
        org.joda.time.Instant instant20 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) instant20, periodType21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int24 = instant20.get(dateTimeFieldType23);
        java.lang.String str25 = dateTimeFieldType23.getName();
        java.lang.String str26 = dateTimeFieldType23.toString();
        int int27 = localDateTime16.indexOf(dateTimeFieldType23);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime16.minusWeeks(99);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        int int32 = dateTime31.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = dateTime31.toString(dateTimeFormatter33);
        org.joda.time.DateTime dateTime36 = dateTime31.plusMonths(86396191);
        org.joda.time.DateTime dateTime38 = dateTime31.plusWeeks(45);
        org.joda.time.Instant instant41 = new org.joda.time.Instant();
        org.joda.time.Instant instant43 = instant41.withMillis(0L);
        org.joda.time.Chronology chronology44 = instant43.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.eras();
        java.util.Locale locale46 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology44, locale46, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property52 = localDateTime49.hourOfDay();
        org.joda.time.DateTimeField dateTimeField53 = property52.getField();
        int int54 = property52.get();
        org.joda.time.LocalDateTime localDateTime55 = property52.roundHalfFloorCopy();
        long long57 = chronology44.set((org.joda.time.ReadablePartial) localDateTime55, (long) 2022);
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now(chronology44);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(chronology44);
        org.joda.time.DurationField durationField60 = chronology44.eras();
        java.util.Locale locale64 = new java.util.Locale("hi!", "clockhourOfDay", "java.io.IOException");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket((long) 42, chronology44, locale64);
        org.joda.time.DateTimeZone dateTimeZone66 = dateTimeParserBucket65.getZone();
        int int68 = dateTimeZone66.getOffset((long) 40);
        org.joda.time.DateTime dateTime69 = dateTime38.withZone(dateTimeZone66);
        org.joda.time.DateTime dateTime70 = localDateTime29.toDateTime(dateTimeZone66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime31", (instant5.compareTo(dateTime31) == 0) == instant5.equals(dateTime31));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis((int) (byte) 0);
        int int11 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.withMillisOfSecond(12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime4.minusMonths((int) (short) 1);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period18 = duration17.toPeriod();
        org.joda.time.Duration duration21 = duration17.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime23.add((org.joda.time.ReadableDuration) duration25, (int) (short) 100);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology28);
        int int30 = dateTime29.getYearOfCentury();
        org.joda.time.Interval interval31 = duration25.toIntervalTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Duration duration32 = duration21.minus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Duration duration33 = duration21.toDuration();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) 100, 1L, periodType38);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) 100, 1L, periodType42);
        org.joda.time.Period period44 = period39.plus((org.joda.time.ReadablePeriod) period43);
        org.joda.time.Instant instant45 = new org.joda.time.Instant();
        org.joda.time.Instant instant47 = instant45.withMillis(0L);
        org.joda.time.Duration duration48 = period43.toDurationTo((org.joda.time.ReadableInstant) instant47);
        mutableDateTime35.add((org.joda.time.ReadableDuration) duration48, 39);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime35.secondOfMinute();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime35.minuteOfHour();
        int int53 = mutableDateTime35.getYearOfEra();
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) 100, 1L, periodType56);
        org.joda.time.Period period59 = period57.minusSeconds((-1));
        java.lang.String str60 = period57.toString();
        org.joda.time.Period period61 = period57.toPeriod();
        int int62 = period57.size();
        org.joda.time.Period period64 = period57.plusSeconds(20);
        org.joda.time.PeriodType periodType65 = period64.getPeriodType();
        org.joda.time.Period period66 = duration33.toPeriodFrom((org.joda.time.ReadableInstant) mutableDateTime35, periodType65);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime4.minus((org.joda.time.ReadablePeriod) period66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and instant45", (dateTime29.compareTo(instant45) == 0) == dateTime29.equals(instant45));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.joda.time.ReadableInstant readableInstant0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj1);
        org.joda.time.DateTime.Property property3 = dateTime2.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = dateTime2.toLocalDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime2.toMutableDateTime();
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.Instant instant9 = instant7.withMillis(0L);
        org.joda.time.Chronology chronology10 = instant9.getChronology();
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period13 = duration12.toPeriod();
        org.joda.time.Duration duration15 = duration12.plus(1L);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 100, 1L, periodType20);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 100, 1L, periodType24);
        org.joda.time.Period period26 = period21.plus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.Instant instant29 = instant27.withMillis(0L);
        org.joda.time.Duration duration30 = period25.toDurationTo((org.joda.time.ReadableInstant) instant29);
        mutableDateTime17.add((org.joda.time.ReadableDuration) duration30, 39);
        int int33 = duration12.compareTo((org.joda.time.ReadableDuration) duration30);
        org.joda.time.Instant instant35 = instant9.withDurationAdded((org.joda.time.ReadableDuration) duration30, 0);
        org.joda.time.Seconds seconds36 = duration30.toStandardSeconds();
        org.joda.time.DateTime dateTime37 = dateTime2.minus((org.joda.time.ReadableDuration) duration30);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) 100, 1L, periodType42);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) 100, 1L, periodType46);
        org.joda.time.Period period48 = period43.plus((org.joda.time.ReadablePeriod) period47);
        org.joda.time.Instant instant49 = new org.joda.time.Instant();
        org.joda.time.Instant instant51 = instant49.withMillis(0L);
        org.joda.time.Duration duration52 = period47.toDurationTo((org.joda.time.ReadableInstant) instant51);
        mutableDateTime39.add((org.joda.time.ReadableDuration) duration52, 39);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime39.yearOfEra();
        mutableDateTime39.setWeekOfWeekyear(14);
        int int58 = mutableDateTime39.getRoundingMode();
        java.util.GregorianCalendar gregorianCalendar59 = mutableDateTime39.toGregorianCalendar();
        org.joda.time.LocalTime localTime60 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar) gregorianCalendar59);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.LocalTime localTime62 = new org.joda.time.LocalTime(dateTimeZone61);
        org.joda.time.LocalTime localTime64 = localTime62.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime66 = localTime64.minusHours((-1));
        org.joda.time.LocalTime.Property property67 = localTime66.hourOfDay();
        org.joda.time.LocalTime localTime69 = localTime66.plusSeconds(893);
        boolean boolean70 = localTime60.isEqual((org.joda.time.ReadablePartial) localTime66);
        boolean boolean71 = duration30.equals((java.lang.Object) localTime66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant7", (dateTime2.compareTo(instant7) == 0) == dateTime2.equals(instant7));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        mutableDateTime1.addYears(3);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period22 = duration21.toPeriod();
        org.joda.time.Duration duration25 = duration21.withDurationAdded((long) 38, (int) 'a');
        long long26 = duration21.getStandardMinutes();
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardMinutes((long) 39236);
        org.joda.time.Minutes minutes30 = duration29.toStandardMinutes();
        org.joda.time.Duration duration31 = duration21.minus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(0, (int) '#', 47, 39277299, 56, 33, 1439, 75596);
        mutablePeriod40.addDays((int) (byte) 1);
        org.joda.time.Duration duration44 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period45 = duration44.toPeriod();
        org.joda.time.Duration duration48 = duration44.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime50.add((org.joda.time.ReadableDuration) duration52, (int) (short) 100);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(chronology55);
        int int57 = dateTime56.getYearOfCentury();
        org.joda.time.Interval interval58 = duration52.toIntervalTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration59 = duration48.minus((org.joda.time.ReadableDuration) duration52);
        org.joda.time.Period period60 = duration59.toPeriod();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(chronology64);
        int int66 = dateTime65.getSecondOfMinute();
        boolean boolean67 = dateTime65.isEqualNow();
        int int68 = dateTime65.getDayOfYear();
        org.joda.time.Chronology chronology69 = dateTime65.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology69);
        org.joda.time.DateTimeField dateTimeField71 = chronology69.year();
        org.joda.time.DateTime dateTime72 = org.joda.time.DateTime.now(chronology69);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) 53670254, chronology69);
        mutablePeriod40.setPeriod((org.joda.time.ReadableDuration) duration59, chronology69);
        org.joda.time.Duration duration75 = duration59.toDuration();
        org.joda.time.Duration duration77 = duration31.withDurationAdded((org.joda.time.ReadableDuration) duration75, 946);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime56", (instant11.compareTo(dateTime56) == 0) == instant11.equals(dateTime56));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.minuteOfHour();
        java.lang.String str19 = property18.getAsShortText();
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = locale20.stripExtensions();
        int int22 = property18.getMaximumTextLength(locale21);
        org.joda.time.MutableDateTime mutableDateTime23 = property18.roundHalfEven();
        mutableDateTime23.addYears(466);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 100, 1L, periodType28);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) 100, 1L, periodType32);
        org.joda.time.Period period34 = period29.plus((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Instant instant35 = new org.joda.time.Instant();
        org.joda.time.Instant instant37 = instant35.withMillis(0L);
        org.joda.time.Duration duration38 = period33.toDurationTo((org.joda.time.ReadableInstant) instant37);
        org.joda.time.Instant instant40 = instant37.plus((long) (byte) -1);
        org.joda.time.DateTime dateTime41 = instant37.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType42.getRangeDurationType();
        org.joda.time.DateTime.Property property44 = dateTime41.property(dateTimeFieldType42);
        boolean boolean46 = dateTime41.isEqual((long) 53);
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period49 = duration48.toPeriod();
        org.joda.time.DateTime dateTime51 = dateTime41.withDurationAdded((org.joda.time.ReadableDuration) duration48, (-292275054));
        org.joda.time.Seconds seconds52 = duration48.toStandardSeconds();
        org.joda.time.Duration duration54 = duration48.plus((long) 409);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime23, (org.joda.time.ReadableDuration) duration54);
        org.joda.time.Period period56 = duration54.toPeriod();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime41", (instant13.compareTo(dateTime41) == 0) == instant13.equals(dateTime41));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.Period period8 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.joda.time.Duration duration12 = period7.toDurationTo((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Period period14 = period7.plusYears(0);
        org.joda.time.Period period15 = period7.toPeriod();
        org.joda.time.Period period17 = period7.minusDays(39272321);
        org.joda.time.Period period19 = period17.withMinutes(3);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) 100, 1L, periodType22);
        org.joda.time.Period period25 = period23.minusSeconds((-1));
        java.lang.String str26 = period23.toString();
        org.joda.time.Period period27 = period23.toPeriod();
        org.joda.time.Period period29 = period23.multipliedBy(6);
        int int30 = period29.getMonths();
        org.joda.time.PeriodType periodType31 = period29.getPeriodType();
        org.joda.time.Period period32 = period19.normalizedStandard(periodType31);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 21);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        int int37 = dateTime36.getSecondOfMinute();
        org.joda.time.DateTime dateTime40 = dateTime36.withDurationAdded((long) 6, 12);
        boolean boolean41 = dateTime34.isBefore((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime43 = dateTime34.minusWeeks((int) (short) 1);
        org.joda.time.Duration duration44 = period32.toDurationTo((org.joda.time.ReadableInstant) dateTime34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime36", (instant9.compareTo(dateTime36) == 0) == instant9.equals(dateTime36));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Instant instant5 = instant3.withMillis(0L);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.util.Locale locale8 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology6, locale8, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        int int16 = property14.get();
        org.joda.time.LocalDateTime localDateTime17 = property14.roundHalfFloorCopy();
        long long19 = chronology6.set((org.joda.time.ReadablePartial) localDateTime17, (long) 2022);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(chronology6);
        org.joda.time.DateTime.Property property21 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime22 = dateTime1.withTimeAtStartOfDay();
        int int23 = dateTime22.getMinuteOfHour();
        org.joda.time.DateTime dateTime25 = dateTime22.withYear(42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant3", (dateTime1.compareTo(instant3) == 0) == dateTime1.equals(instant3));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.Period period8 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.joda.time.Duration duration12 = period7.toDurationTo((org.joda.time.ReadableInstant) instant11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 100, 1L, periodType19);
        org.joda.time.Period period21 = period16.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.Instant instant24 = instant22.withMillis(0L);
        org.joda.time.Duration duration25 = period20.toDurationTo((org.joda.time.ReadableInstant) instant24);
        boolean boolean26 = instant11.isEqual((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardHours((long) (short) 1);
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period31 = duration30.toPeriod();
        org.joda.time.Duration duration34 = duration30.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration34, readableInstant35);
        org.joda.time.Duration duration37 = duration34.toDuration();
        int int38 = duration28.compareTo((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Instant instant39 = instant11.minus((org.joda.time.ReadableDuration) duration28);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        int int42 = dateTime41.getSecondOfMinute();
        int int43 = dateTime41.getYearOfEra();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((int) (short) 10, 100, (int) 'a', 21);
        java.lang.String str49 = mutablePeriod48.toString();
        org.joda.time.DateTime dateTime50 = dateTime41.plus((org.joda.time.ReadablePeriod) mutablePeriod48);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, (org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime53 = dateTime41.minusSeconds(15);
        org.joda.time.DateTime dateTime54 = dateTime41.toDateTimeISO();
        org.joda.time.DateTime dateTime56 = dateTime41.withMillis((long) 15);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) 1, chronology58);
        org.joda.time.DateTime dateTime60 = dateTime59.toDateTime();
        int int61 = dateTime59.getYear();
        org.joda.time.DateTime.Property property62 = dateTime59.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property62.getFieldType();
        org.joda.time.DateTime dateTime65 = property62.addWrapFieldToCopy(9722);
        org.joda.time.Instant instant67 = new org.joda.time.Instant();
        org.joda.time.Instant instant69 = instant67.withMillis(0L);
        org.joda.time.Chronology chronology70 = instant69.getChronology();
        org.joda.time.DurationField durationField71 = chronology70.eras();
        java.util.Locale locale72 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket74 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology70, locale72, (java.lang.Integer) 39221019);
        org.joda.time.DateTimeField dateTimeField75 = chronology70.yearOfCentury();
        org.joda.time.DurationField durationField76 = dateTimeField75.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = dateTimeField75.getType();
        org.joda.time.DateTime.Property property78 = dateTime65.property(dateTimeFieldType77);
        boolean boolean79 = dateTime41.isSupported(dateTimeFieldType77);
        int int80 = dateTime41.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime41", (instant9.compareTo(dateTime41) == 0) == instant9.equals(dateTime41));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        int int2 = mutableDateTime1.getMillisOfSecond();
        mutableDateTime1.setMillisOfSecond(44);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.minuteOfHour();
        mutableDateTime1.setYear(12022);
        mutableDateTime1.add((long) 1439);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = dateTime12.toString(dateTimeFormatter14);
        org.joda.time.DateTime dateTime17 = dateTime12.plusMonths(86396191);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        int int22 = dateTime21.getSecondOfMinute();
        boolean boolean23 = dateTime21.isEqualNow();
        int int24 = dateTime21.getDayOfYear();
        org.joda.time.Chronology chronology25 = dateTime21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology25);
        org.joda.time.DateTime dateTime27 = dateTime17.toDateTime(chronology25);
        org.joda.time.DurationField durationField28 = chronology25.eras();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) 100, 1L, periodType33);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) 100, 1L, periodType37);
        org.joda.time.Period period39 = period34.plus((org.joda.time.ReadablePeriod) period38);
        org.joda.time.Instant instant40 = new org.joda.time.Instant();
        org.joda.time.Instant instant42 = instant40.withMillis(0L);
        org.joda.time.Duration duration43 = period38.toDurationTo((org.joda.time.ReadableInstant) instant42);
        mutableDateTime30.add((org.joda.time.ReadableDuration) duration43, 39);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime30.secondOfMinute();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime30.minuteOfHour();
        mutableDateTime30.setWeekyear(0);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(0L, dateTimeZone51);
        long long55 = dateTimeZone51.convertLocalToUTC((long) 3, true);
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(dateTimeZone51);
        java.lang.String str57 = dateTimeZone51.toString();
        mutableDateTime30.setZone(dateTimeZone51);
        org.joda.time.Chronology chronology59 = chronology25.withZone(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) 613, dateTimeZone51);
        mutableDateTime1.setZoneRetainFields(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant40", (dateTime12.compareTo(instant40) == 0) == dateTime12.equals(instant40));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 1L, periodType5);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 100, 1L, periodType9);
        org.joda.time.Period period11 = period6.plus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant14 = instant12.withMillis(0L);
        org.joda.time.Duration duration15 = period10.toDurationTo((org.joda.time.ReadableInstant) instant14);
        mutableDateTime2.add((org.joda.time.ReadableDuration) duration15, 39);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime2.setZone(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(55123200000L, dateTimeZone19);
        org.joda.time.Instant instant23 = new org.joda.time.Instant();
        org.joda.time.Instant instant25 = instant23.withMillis(0L);
        org.joda.time.Chronology chronology26 = instant25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.eras();
        java.util.Locale locale28 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology26, locale28, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property34 = localDateTime31.hourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = property34.getField();
        int int36 = property34.get();
        org.joda.time.LocalDateTime localDateTime37 = property34.roundHalfFloorCopy();
        long long39 = chronology26.set((org.joda.time.ReadablePartial) localDateTime37, (long) 2022);
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now(chronology26);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTime dateTime43 = dateTime41.minusSeconds(69);
        org.joda.time.DateTime.Property property44 = dateTime43.secondOfDay();
        org.joda.time.DateTime dateTime46 = dateTime43.withDayOfMonth(26);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str49 = dateTimeZone47.getNameKey((long) (byte) 0);
        org.joda.time.DateTime dateTime50 = dateTime43.toDateTime(dateTimeZone47);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone47);
        boolean boolean52 = dateTimeZone19.isLocalDateTimeGap(localDateTime51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.plusSeconds((-419));
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(19249747200000L);
        java.lang.String str57 = mutableDateTime56.toString();
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardMinutes((long) 859);
        mutableDateTime56.add((org.joda.time.ReadableDuration) duration59);
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate63 = localDate61.minusMonths((int) ' ');
        org.joda.time.Chronology chronology64 = localDate61.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField66 = chronology64.minuteOfHour();
        org.joda.time.DurationField durationField67 = chronology64.weekyears();
        org.joda.time.DateTimeField dateTimeField68 = chronology64.centuryOfEra();
        org.joda.time.Chronology chronology69 = chronology64.withUTC();
        org.joda.time.Period period70 = duration59.toPeriod(chronology64);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime51.plus((org.joda.time.ReadableDuration) duration59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField27 and durationField67", Math.signum(durationField27.compareTo(durationField67)) == -Math.signum(durationField67.compareTo(durationField27)));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.Period period5 = period3.minusSeconds((-1));
        java.lang.String str6 = period3.toString();
        org.joda.time.Period period7 = period3.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        int int9 = mutablePeriod8.getDays();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 100, 1L, periodType12);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 100, 1L, periodType16);
        org.joda.time.Period period18 = period13.plus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.Instant instant21 = instant19.withMillis(0L);
        org.joda.time.Duration duration22 = period17.toDurationTo((org.joda.time.ReadableInstant) instant21);
        long long23 = instant21.getMillis();
        org.joda.time.Instant instant25 = instant21.minus((long) (byte) 1);
        org.joda.time.Instant instant26 = new org.joda.time.Instant();
        org.joda.time.Instant instant28 = instant26.withMillis(0L);
        mutablePeriod8.setPeriod((org.joda.time.ReadableInstant) instant25, (org.joda.time.ReadableInstant) instant28);
        org.joda.time.Instant instant31 = instant25.withMillis((long) 1970);
        org.joda.time.Instant instant32 = instant31.toInstant();
        org.joda.time.MutableDateTime mutableDateTime33 = instant32.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime33.copy();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.minuteOfDay();
        mutableDateTime33.setDate((long) 53750160);
        java.lang.Object obj38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(obj38);
        org.joda.time.DateTime.Property property40 = dateTime39.millisOfDay();
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        org.joda.time.DateTime dateTime42 = property40.withMinimumValue();
        java.util.Locale locale43 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str44 = property40.getAsShortText(locale43);
        org.joda.time.DateTime dateTime45 = property40.roundFloorCopy();
        boolean boolean46 = mutableDateTime33.equals((java.lang.Object) property40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and dateTime39", (instant19.compareTo(dateTime39) == 0) == instant19.equals(dateTime39));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType3 = periodType2.withMonthsRemoved();
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.withMillis(0L);
        org.joda.time.Chronology chronology8 = instant7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.eras();
        java.util.Locale locale10 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology8, locale10, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        int int18 = property16.get();
        org.joda.time.LocalDateTime localDateTime19 = property16.roundHalfFloorCopy();
        long long21 = chronology8.set((org.joda.time.ReadablePartial) localDateTime19, (long) 2022);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(chronology8);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTimeField dateTimeField24 = chronology8.dayOfWeek();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 39251693, (long) 292278993, periodType3, chronology8);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology29);
        int int31 = dateTime30.getSecondOfMinute();
        boolean boolean32 = dateTime30.isEqualNow();
        int int33 = dateTime30.getDayOfYear();
        org.joda.time.Chronology chronology34 = dateTime30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.year();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(chronology34);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now(chronology34);
        mutablePeriod25.add((long) 59, chronology34);
        mutablePeriod25.setDays(39361664);
        org.joda.time.MutablePeriod mutablePeriod43 = mutablePeriod25.copy();
        mutablePeriod25.setPeriod(1311L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime30", (instant5.compareTo(dateTime30) == 0) == instant5.equals(dateTime30));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTime dateTime6 = localDateTime0.toDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.withWeekyear(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusMillis(0);
        java.lang.String str11 = localDateTime0.toString();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime0.plusWeeks(647);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 100, 1L, periodType16);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 100, 1L, periodType20);
        org.joda.time.Period period22 = period17.plus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.MutablePeriod mutablePeriod23 = period22.toMutablePeriod();
        mutablePeriod23.addWeeks(14);
        int int26 = mutablePeriod23.getMinutes();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 100, 1L, periodType31);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) 100, 1L, periodType35);
        org.joda.time.Period period37 = period32.plus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Instant instant38 = new org.joda.time.Instant();
        org.joda.time.Instant instant40 = instant38.withMillis(0L);
        org.joda.time.Duration duration41 = period36.toDurationTo((org.joda.time.ReadableInstant) instant40);
        mutableDateTime28.add((org.joda.time.ReadableDuration) duration41, 39);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime28.yearOfEra();
        mutableDateTime28.setWeekOfWeekyear(14);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime28.minuteOfDay();
        org.joda.time.DurationField durationField48 = property47.getRangeDurationField();
        org.joda.time.DurationFieldType durationFieldType49 = durationField48.getType();
        mutablePeriod23.add(durationFieldType49, 16);
        boolean boolean52 = localDateTime13.isSupported(durationFieldType49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant38", (dateTime6.compareTo(instant38) == 0) == dateTime6.equals(instant38));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) ' ');
        org.joda.time.Chronology chronology4 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology4);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        org.joda.time.DateTime dateTime13 = property11.withMinimumValue();
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str15 = property11.getAsShortText(locale14);
        org.joda.time.DateTimeField dateTimeField16 = property11.getField();
        boolean boolean17 = dateTimeField16.isSupported();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) 100, 1L, periodType22);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) 100, 1L, periodType26);
        org.joda.time.Period period28 = period23.plus((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Instant instant29 = new org.joda.time.Instant();
        org.joda.time.Instant instant31 = instant29.withMillis(0L);
        org.joda.time.Duration duration32 = period27.toDurationTo((org.joda.time.ReadableInstant) instant31);
        org.joda.time.Instant instant34 = instant31.plus((long) (byte) -1);
        org.joda.time.Instant instant37 = instant34.withDurationAdded(1L, (int) (short) -1);
        org.joda.time.Chronology chronology38 = instant34.getChronology();
        org.joda.time.Chronology chronology40 = null;
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.util.Locale locale42 = locale41.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology40, locale41, (java.lang.Integer) 45, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket(0L, chronology38, locale41, (java.lang.Integer) 1970);
        java.util.Locale locale48 = java.util.Locale.ITALY;
        java.lang.String str49 = locale41.getDisplayScript(locale48);
        java.lang.String str50 = dateTimeField16.getAsText((long) 42, locale41);
        java.lang.String str51 = locale41.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((long) 53731467, chronology4, locale41, (java.lang.Integer) 39321381, 53758);
        org.joda.time.DurationField durationField55 = chronology4.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and dateTime10", (mutableDateTime8.compareTo(dateTime10) == 0) == mutableDateTime8.equals(dateTime10));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.Period period8 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.joda.time.Duration duration12 = period7.toDurationTo((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Instant instant14 = instant11.plus((long) (byte) -1);
        org.joda.time.DateTime dateTime15 = instant11.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime15.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        long long19 = dateTimeZone17.nextTransition(10L);
        boolean boolean20 = dateTimeZone17.isFixed();
        org.joda.time.DateTime dateTime21 = dateTime15.withZoneRetainFields(dateTimeZone17);
        org.joda.time.DateTime.Property property22 = dateTime21.centuryOfEra();
        int int23 = dateTime21.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime21", (instant11.compareTo(dateTime21) == 0) == instant11.equals(dateTime21));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths(43);
        org.joda.time.LocalDate.Property property3 = localDate0.dayOfMonth();
        org.joda.time.LocalDate localDate4 = property3.withMaximumValue();
        org.joda.time.LocalDate localDate6 = property3.addWrapFieldToCopy(56);
        org.joda.time.LocalDate localDate8 = localDate6.minusDays(289);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getSecondOfMinute();
        boolean boolean14 = dateTime12.isEqualNow();
        int int15 = dateTime12.getDayOfYear();
        org.joda.time.Chronology chronology16 = dateTime12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.year();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.dayOfMonth();
        java.lang.Object obj20 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(0L, dateTimeZone22);
        int int25 = dateTimeZone22.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj20, dateTimeZone22);
        java.lang.String str27 = dateTimeZone22.toString();
        org.joda.time.Chronology chronology28 = chronology16.withZone(dateTimeZone22);
        org.joda.time.DateTime dateTime29 = localDate8.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.LocalDate.Property property30 = localDate8.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours(57);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = localDate8.toDateTimeAtMidnight(dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime33", (dateTime12.compareTo(dateTime33) == 0) == dateTime12.equals(dateTime33));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        boolean boolean4 = dateTime2.isEqualNow();
        int int5 = dateTime2.getDayOfYear();
        org.joda.time.Chronology chronology6 = dateTime2.getChronology();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(chronology6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        int int12 = dateTime11.getSecondOfMinute();
        boolean boolean13 = dateTime11.isEqualNow();
        int int14 = dateTime11.getDayOfYear();
        org.joda.time.Chronology chronology15 = dateTime11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology15);
        int int17 = mutablePeriod16.getDays();
        org.joda.time.DateTime dateTime19 = dateTime7.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod16, (int) (byte) 0);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate24 = localDate22.minusMonths((int) ' ');
        org.joda.time.Chronology chronology25 = localDate22.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.minuteOfDay();
        org.joda.time.DurationField durationField27 = chronology25.days();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.hourOfDay();
        mutablePeriod16.setPeriod((-1900799884L), (long) 50, chronology25);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology25);
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.util.Locale locale34 = java.util.Locale.CANADA;
        java.lang.String str35 = locale33.getDisplayVariant(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology32, locale34, (java.lang.Integer) 10);
        org.joda.time.Chronology chronology38 = dateTimeParserBucket37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.centuryOfEra();
        org.joda.time.Instant instant42 = new org.joda.time.Instant();
        org.joda.time.Instant instant44 = instant42.withMillis(0L);
        org.joda.time.Chronology chronology45 = instant44.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.eras();
        java.util.Locale locale47 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology45, locale47, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate52 = localDate50.minusMonths((int) ' ');
        org.joda.time.Chronology chronology53 = localDate50.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = dateTimeField54.getType();
        org.joda.time.Chronology chronology58 = null;
        java.util.Locale locale59 = java.util.Locale.GERMAN;
        java.util.Locale locale60 = java.util.Locale.CANADA;
        java.lang.String str61 = locale59.getDisplayVariant(locale60);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology58, locale60, (java.lang.Integer) 10);
        dateTimeParserBucket49.saveField(dateTimeFieldType55, "PT0.099S", locale60);
        java.lang.String str65 = locale60.getDisplayLanguage();
        java.lang.String str66 = dateTimeField39.getAsText((long) 655, locale60);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((-1511989969L), chronology25, locale60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField27 and durationField46", Math.signum(durationField27.compareTo(durationField46)) == -Math.signum(durationField46.compareTo(durationField27)));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 1, chronology3);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) instant5, periodType6);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.eras();
        java.util.Locale locale14 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology12, locale14, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        int int22 = property20.get();
        org.joda.time.LocalDateTime localDateTime23 = property20.roundHalfFloorCopy();
        long long25 = chronology12.set((org.joda.time.ReadablePartial) localDateTime23, (long) 2022);
        org.joda.time.DateTimeField dateTimeField26 = chronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField27 = chronology12.minuteOfHour();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 100, 1L, periodType30);
        org.joda.time.Period period33 = period31.minusSeconds((-1));
        java.lang.String str34 = period31.toString();
        org.joda.time.Period period35 = period31.negated();
        int[] intArray37 = chronology12.get((org.joda.time.ReadablePeriod) period35, (long) 1969);
        org.joda.time.DateTimeField dateTimeField38 = chronology12.halfdayOfDay();
        org.joda.time.Period period39 = new org.joda.time.Period((long) 894, 48L, periodType6, chronology12);
        org.joda.time.Instant instant41 = new org.joda.time.Instant();
        org.joda.time.Instant instant43 = instant41.withMillis(0L);
        org.joda.time.Chronology chronology44 = instant43.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.eras();
        java.util.Locale locale46 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology44, locale46, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property52 = localDateTime49.hourOfDay();
        org.joda.time.DateTimeField dateTimeField53 = property52.getField();
        int int54 = property52.get();
        org.joda.time.LocalDateTime localDateTime55 = property52.roundHalfFloorCopy();
        long long57 = chronology44.set((org.joda.time.ReadablePartial) localDateTime55, (long) 2022);
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now(chronology44);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(chronology44);
        org.joda.time.DurationField durationField60 = chronology44.eras();
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(chronology44);
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime61.getZone();
        java.lang.String str64 = dateTimeZone62.getNameKey((long) 39297267);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) (short) 1, chronology66);
        org.joda.time.DateTime dateTime68 = dateTime67.toDateTime();
        boolean boolean69 = dateTimeZone62.equals((java.lang.Object) dateTime68);
        org.joda.time.Chronology chronology70 = chronology12.withZone(dateTimeZone62);
        org.joda.time.DurationField durationField71 = chronology12.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField71, and durationField13", !(durationField13.compareTo(durationField71) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField71.compareTo(durationField13))));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.yearOfEra();
        org.joda.time.DurationField durationField6 = chronology3.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField6, and durationField4", !(durationField4.compareTo(durationField6) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField6.compareTo(durationField4))));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.plusMonths(43);
        org.joda.time.LocalDate localDate5 = localDate3.withDayOfYear(12);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate8 = localDate6.minusMonths((int) ' ');
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableDuration9, readableInstant10);
        org.joda.time.Period period13 = period11.withDays((int) (byte) 1);
        org.joda.time.LocalDate localDate14 = localDate8.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.LocalDate localDate16 = localDate14.minusMonths((-292275054));
        org.joda.time.LocalDate localDate18 = localDate14.minusYears(21);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType20 = periodType19.withMonthsRemoved();
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate5, (org.joda.time.ReadablePartial) localDate18, periodType19);
        org.joda.time.PeriodType periodType22 = periodType19.withHoursRemoved();
        org.joda.time.PeriodType periodType23 = periodType19.withDaysRemoved();
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.Instant instant26 = instant24.withMillis(0L);
        org.joda.time.Chronology chronology27 = instant26.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.eras();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(51L, periodType19, chronology27);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.year();
        org.joda.time.DurationField durationField31 = dateTimeField30.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField31, and durationField28", !(durationField28.compareTo(durationField31) == 0) || (Math.signum(durationField28.compareTo(durationField28)) == Math.signum(durationField31.compareTo(durationField28))));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Instant instant5 = instant3.withMillis(0L);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.util.Locale locale8 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology6, locale8, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        int int16 = property14.get();
        org.joda.time.LocalDateTime localDateTime17 = property14.roundHalfFloorCopy();
        long long19 = chronology6.set((org.joda.time.ReadablePartial) localDateTime17, (long) 2022);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(chronology6);
        org.joda.time.DateTime.Property property21 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime22 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (short) 1, chronology24);
        org.joda.time.DateTime dateTime26 = dateTime25.toDateTime();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (short) 1, chronology28);
        org.joda.time.DateTime dateTime30 = dateTime29.toDateTime();
        int int31 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration35 = duration33.toDuration();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 1, chronology37);
        org.joda.time.DateTime dateTime39 = dateTime38.toDateTime();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (short) 1, chronology41);
        org.joda.time.DateTime dateTime43 = dateTime42.toDateTime();
        int int44 = dateTime39.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableDuration) duration46);
        org.joda.time.Duration duration48 = duration46.toDuration();
        org.joda.time.Duration duration50 = duration35.withDurationAdded((org.joda.time.ReadableDuration) duration48, 53644753);
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableDuration) duration50);
        org.joda.time.Seconds seconds52 = duration50.toStandardSeconds();
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(19249747200000L);
        java.lang.String str55 = mutableDateTime54.toString();
        org.joda.time.Duration duration57 = org.joda.time.Duration.standardMinutes((long) 859);
        mutableDateTime54.add((org.joda.time.ReadableDuration) duration57);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate61 = localDate59.minusMonths((int) ' ');
        org.joda.time.Chronology chronology62 = localDate59.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField64 = chronology62.minuteOfHour();
        org.joda.time.DurationField durationField65 = chronology62.weekyears();
        org.joda.time.DateTimeField dateTimeField66 = chronology62.centuryOfEra();
        org.joda.time.Chronology chronology67 = chronology62.withUTC();
        org.joda.time.Period period68 = duration57.toPeriod(chronology62);
        boolean boolean69 = duration50.isLongerThan((org.joda.time.ReadableDuration) duration57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField65", Math.signum(durationField7.compareTo(durationField65)) == -Math.signum(durationField65.compareTo(durationField7)));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime.Property property2 = dateTime1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.DateTime dateTime4 = property2.withMinimumValue();
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str6 = property2.getAsShortText(locale5);
        org.joda.time.DateTime dateTime7 = property2.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField8 = property2.getField();
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.eras();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.monthOfYear();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.dayOfMonth();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (byte) -1, chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withYear((int) (short) -1);
        int int24 = localDateTime21.getCenturyOfEra();
        int int25 = dateTimeField18.getMaximumValue((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.withDayOfYear(5);
        org.joda.time.DateTimeField[] dateTimeFieldArray28 = localDateTime21.getFields();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime21.withFieldAdded(durationFieldType29, 51);
        int int32 = localDateTime31.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property36 = localDateTime33.hourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str40 = dateTimeFieldType39.getName();
        int int41 = localDateTime33.indexOf(dateTimeFieldType39);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str43 = dateTimeFieldType42.getName();
        org.joda.time.LocalDateTime.Property property44 = localDateTime33.property(dateTimeFieldType42);
        int int45 = localDateTime33.getDayOfWeek();
        int int46 = localDateTime33.getWeekyear();
        int int47 = localDateTime33.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property48 = localDateTime33.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime49 = property48.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.minusMinutes(53670306);
        boolean boolean52 = localDateTime31.isEqual((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.Chronology chronology54 = null;
        java.util.Locale locale55 = java.util.Locale.GERMAN;
        java.util.Locale locale56 = java.util.Locale.CANADA;
        java.lang.String str57 = locale55.getDisplayVariant(locale56);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology54, locale56, (java.lang.Integer) 10);
        org.joda.time.Chronology chronology60 = dateTimeParserBucket59.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField62 = chronology60.centuryOfEra();
        long long65 = dateTimeField62.getDifferenceAsLong((long) 53670254, 0L);
        org.joda.time.ReadablePartial readablePartial66 = null;
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate69 = localDate67.minusMonths((int) ' ');
        org.joda.time.Chronology chronology70 = localDate67.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.minuteOfDay();
        org.joda.time.DurationField durationField72 = chronology70.days();
        org.joda.time.ReadableDuration readableDuration73 = null;
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period(readableDuration73, readableInstant74);
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period((long) 100, 1L, periodType78);
        org.joda.time.Period period81 = period79.minusSeconds((-1));
        java.lang.String str82 = period79.toString();
        org.joda.time.Period period83 = period79.toPeriod();
        org.joda.time.PeriodType periodType84 = period79.getPeriodType();
        org.joda.time.Period period85 = period75.normalizedStandard(periodType84);
        org.joda.time.Period period87 = period85.multipliedBy((int) (short) 100);
        org.joda.time.Seconds seconds88 = period87.toStandardSeconds();
        org.joda.time.Period period90 = period87.minusWeeks(58);
        int[] intArray92 = chronology70.get((org.joda.time.ReadablePeriod) period90, (long) 59);
        int int93 = dateTimeField62.getMinimumValue(readablePartial66, intArray92);
        int int94 = dateTimeField8.getMinimumValue((org.joda.time.ReadablePartial) localDateTime49, intArray92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField72", Math.signum(durationField15.compareTo(durationField72)) == -Math.signum(durationField72.compareTo(durationField15)));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        boolean boolean3 = dateTime1.isEqualNow();
        int int4 = dateTime1.getDayOfYear();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.Instant instant8 = instant6.withMillis(0L);
        org.joda.time.Chronology chronology9 = instant8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        java.util.Locale locale11 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology9, locale11, (java.lang.Integer) 39221019);
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = locale16.getDisplayVariant(locale17);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale17);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeParserBucket19.getZone();
        org.joda.time.Chronology chronology21 = chronology9.withZone(dateTimeZone20);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.now(chronology21);
        org.joda.time.LocalTime localTime24 = localTime22.plusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = localTime22.getChronology();
        org.joda.time.DateTime dateTime26 = dateTime1.withChronology(chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableDuration27, readableInstant28);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) 100, 1L, periodType32);
        org.joda.time.Period period35 = period33.minusSeconds((-1));
        java.lang.String str36 = period33.toString();
        org.joda.time.Period period37 = period33.toPeriod();
        org.joda.time.PeriodType periodType38 = period33.getPeriodType();
        org.joda.time.Period period39 = period29.normalizedStandard(periodType38);
        org.joda.time.Period period41 = period29.plusSeconds(45);
        org.joda.time.Period period43 = period41.minusYears(31);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableDuration46, readableInstant47);
        org.joda.time.Period period50 = period48.withDays((int) (byte) 1);
        org.joda.time.Period period52 = period50.minusWeeks(100);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) 100, 1L, periodType55);
        org.joda.time.Period period58 = period56.minusSeconds((-1));
        java.lang.String str59 = period56.toString();
        org.joda.time.Period period60 = period56.toPeriod();
        org.joda.time.PeriodType periodType61 = period56.getPeriodType();
        org.joda.time.Period period62 = period52.withPeriodType(periodType61);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) 41, (long) 'x', periodType61);
        org.joda.time.Period period64 = period41.minus((org.joda.time.ReadablePeriod) mutablePeriod63);
        long long67 = chronology25.add((org.joda.time.ReadablePeriod) period64, 0L, 0);
        org.joda.time.DurationField durationField68 = chronology25.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField68, and durationField10", !(durationField10.compareTo(durationField68) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField68.compareTo(durationField10))));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 1, chronology3);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) instant5, periodType6);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.eras();
        java.util.Locale locale14 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology12, locale14, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        int int22 = property20.get();
        org.joda.time.LocalDateTime localDateTime23 = property20.roundHalfFloorCopy();
        long long25 = chronology12.set((org.joda.time.ReadablePartial) localDateTime23, (long) 2022);
        org.joda.time.DateTimeField dateTimeField26 = chronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField27 = chronology12.minuteOfHour();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 100, 1L, periodType30);
        org.joda.time.Period period33 = period31.minusSeconds((-1));
        java.lang.String str34 = period31.toString();
        org.joda.time.Period period35 = period31.negated();
        int[] intArray37 = chronology12.get((org.joda.time.ReadablePeriod) period35, (long) 1969);
        org.joda.time.DateTimeField dateTimeField38 = chronology12.halfdayOfDay();
        org.joda.time.Period period39 = new org.joda.time.Period((long) 894, 48L, periodType6, chronology12);
        org.joda.time.Instant instant41 = new org.joda.time.Instant();
        org.joda.time.Instant instant43 = instant41.withMillis(0L);
        org.joda.time.Chronology chronology44 = instant43.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.eras();
        java.util.Locale locale46 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology44, locale46, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property52 = localDateTime49.hourOfDay();
        org.joda.time.DateTimeField dateTimeField53 = property52.getField();
        int int54 = property52.get();
        org.joda.time.LocalDateTime localDateTime55 = property52.roundHalfFloorCopy();
        long long57 = chronology44.set((org.joda.time.ReadablePartial) localDateTime55, (long) 2022);
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now(chronology44);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(chronology44);
        org.joda.time.DurationField durationField60 = chronology44.eras();
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(chronology44);
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime61.getZone();
        java.lang.String str64 = dateTimeZone62.getNameKey((long) 39297267);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) (short) 1, chronology66);
        org.joda.time.DateTime dateTime68 = dateTime67.toDateTime();
        boolean boolean69 = dateTimeZone62.equals((java.lang.Object) dateTime68);
        org.joda.time.Chronology chronology70 = chronology12.withZone(dateTimeZone62);
        org.joda.time.DurationField durationField71 = chronology12.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField71, and durationField13", !(durationField13.compareTo(durationField71) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField71.compareTo(durationField13))));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.minuteOfHour();
        java.lang.String str19 = property18.getAsShortText();
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = locale20.stripExtensions();
        int int22 = property18.getMaximumTextLength(locale21);
        org.joda.time.MutableDateTime mutableDateTime23 = property18.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime24 = property18.roundHalfCeiling();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        int int29 = dateTime28.getSecondOfMinute();
        boolean boolean30 = dateTime28.isEqualNow();
        int int31 = dateTime28.getDayOfYear();
        org.joda.time.Chronology chronology32 = dateTime28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.year();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.dayOfMonth();
        org.joda.time.DurationField durationField36 = chronology32.halfdays();
        long long39 = durationField36.subtract((long) 39250977, (long) 39243612);
        long long42 = durationField36.getDifferenceAsLong((long) 0, (long) 12);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(chronology45);
        int int47 = dateTime46.getSecondOfMinute();
        boolean boolean48 = dateTime46.isEqualNow();
        int int49 = dateTime46.getDayOfYear();
        org.joda.time.Chronology chronology50 = dateTime46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology50);
        org.joda.time.DateTimeField dateTimeField52 = chronology50.year();
        org.joda.time.DateTimeField dateTimeField53 = chronology50.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now(chronology50);
        org.joda.time.DurationField durationField55 = chronology50.years();
        boolean boolean56 = durationField55.isSupported();
        int int57 = durationField36.compareTo(durationField55);
        boolean boolean58 = mutableDateTime24.equals((java.lang.Object) int57);
        int int59 = mutableDateTime24.getDayOfMonth();
        org.joda.time.Instant instant60 = new org.joda.time.Instant();
        org.joda.time.Instant instant62 = instant60.withMillis(0L);
        org.joda.time.DateTime dateTime63 = instant60.toDateTimeISO();
        org.joda.time.Instant instant65 = instant60.minus((long) (byte) 0);
        org.joda.time.Instant instant67 = new org.joda.time.Instant();
        org.joda.time.Instant instant69 = instant67.withMillis(0L);
        org.joda.time.Chronology chronology70 = instant69.getChronology();
        org.joda.time.DurationField durationField71 = chronology70.eras();
        java.util.Locale locale72 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket74 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology70, locale72, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime75 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime77 = localDateTime75.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property78 = localDateTime75.hourOfDay();
        org.joda.time.DateTimeField dateTimeField79 = property78.getField();
        int int80 = property78.get();
        org.joda.time.LocalDateTime localDateTime81 = property78.roundHalfFloorCopy();
        long long83 = chronology70.set((org.joda.time.ReadablePartial) localDateTime81, (long) 2022);
        org.joda.time.LocalDateTime localDateTime84 = org.joda.time.LocalDateTime.now(chronology70);
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime(chronology70);
        org.joda.time.DurationField durationField86 = chronology70.eras();
        org.joda.time.DateTimeField dateTimeField87 = chronology70.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone88 = chronology70.getZone();
        org.joda.time.DateTime dateTime89 = instant60.toDateTime(dateTimeZone88);
        int int90 = mutableDateTime24.compareTo((org.joda.time.ReadableInstant) dateTime89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField36 and durationField71", Math.signum(durationField36.compareTo(durationField71)) == -Math.signum(durationField71.compareTo(durationField36)));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 100, 1L, periodType10);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, 1L, periodType14);
        org.joda.time.Period period16 = period11.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Instant instant17 = new org.joda.time.Instant();
        org.joda.time.Instant instant19 = instant17.withMillis(0L);
        org.joda.time.Duration duration20 = period15.toDurationTo((org.joda.time.ReadableInstant) instant19);
        mutableDateTime7.add((org.joda.time.ReadableDuration) duration20, 39);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime7.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime7.setZone(dateTimeZone24);
        int int26 = mutableDateTime7.getYearOfEra();
        int int27 = mutableDateTime7.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime7.year();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfEven();
        org.joda.time.DateTime dateTime30 = localTime5.toDateTime((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime29.dayOfMonth();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime29.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(1973);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime29, dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and dateTime35", (mutableDateTime7.compareTo(dateTime35) == 0) == mutableDateTime7.equals(dateTime35));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis(0L);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.dayOfMonth();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (byte) -1, chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYear((int) (short) -1);
        int int15 = localDateTime12.getCenturyOfEra();
        int int16 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 100, 1L, periodType21);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) 100, 1L, periodType25);
        org.joda.time.Period period27 = period22.plus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant28.withMillis(0L);
        org.joda.time.Duration duration31 = period26.toDurationTo((org.joda.time.ReadableInstant) instant30);
        mutableDateTime18.add((org.joda.time.ReadableDuration) duration31, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean35 = mutableDateTime18.isSupported(dateTimeFieldType34);
        boolean boolean36 = localDateTime12.isSupported(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime12.plusDays(53787332);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.year();
        int int40 = localDateTime12.get(dateTimeFieldType39);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(chronology44);
        int int46 = dateTime45.getSecondOfMinute();
        boolean boolean47 = dateTime45.isEqualNow();
        int int48 = dateTime45.getDayOfYear();
        org.joda.time.Chronology chronology49 = dateTime45.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology49);
        org.joda.time.DateTimeField dateTimeField51 = chronology49.year();
        org.joda.time.DateTimeField dateTimeField52 = chronology49.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now(chronology49);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now(chronology49);
        org.joda.time.DateTimeField dateTimeField55 = chronology49.secondOfMinute();
        org.joda.time.DurationField durationField56 = chronology49.hours();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(0L, chronology49);
        org.joda.time.DateTimeField dateTimeField58 = chronology49.secondOfDay();
        boolean boolean59 = dateTimeFieldType39.isSupported(chronology49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField56", Math.signum(durationField6.compareTo(durationField56)) == -Math.signum(durationField56.compareTo(durationField6)));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.yearOfEra();
        org.joda.time.Period period7 = new org.joda.time.Period((long) ' ', chronology4);
        org.joda.time.DateTimeField dateTimeField8 = chronology4.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = chronology4.getZone();
        org.joda.time.DurationField durationField10 = chronology4.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField10, and durationField5", !(durationField5.compareTo(durationField10) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField10.compareTo(durationField5))));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (short) 1, chronology6);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) instant8, periodType9);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate13 = localDate11.minusMonths((int) ' ');
        org.joda.time.Chronology chronology14 = localDate11.getChronology();
        org.joda.time.Period period15 = new org.joda.time.Period((long) (byte) 1, periodType9, chronology14);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate18 = localDate16.minusMonths((int) ' ');
        org.joda.time.Chronology chronology19 = localDate16.getChronology();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate22 = localDate16.withFieldAdded(durationFieldType20, (int) (byte) 100);
        boolean boolean23 = periodType9.isSupported(durationFieldType20);
        org.joda.time.PeriodType periodType24 = periodType9.withDaysRemoved();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property26 = localDate25.dayOfMonth();
        org.joda.time.Chronology chronology27 = localDate25.getChronology();
        org.joda.time.Period period28 = new org.joda.time.Period((long) 43, periodType9, chronology27);
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period31 = duration30.toPeriod();
        org.joda.time.Duration duration34 = duration30.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Instant instant38 = new org.joda.time.Instant();
        org.joda.time.Instant instant40 = instant38.withMillis(0L);
        org.joda.time.Chronology chronology41 = instant40.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.eras();
        java.util.Locale locale43 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology41, locale43, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 53, chronology41);
        org.joda.time.DateTimeField dateTimeField47 = chronology41.dayOfYear();
        org.joda.time.DateTimeField dateTimeField48 = chronology41.monthOfYear();
        org.joda.time.Period period49 = duration30.toPeriod(periodType35, chronology41);
        org.joda.time.Period period50 = new org.joda.time.Period((long) '#', periodType9, chronology41);
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate(chronology41);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(35L, chronology41);
        org.joda.time.DateTimeField dateTimeField53 = chronology41.dayOfYear();
        org.joda.time.DateTimeField dateTimeField54 = chronology41.millisOfSecond();
        org.joda.time.Period period55 = new org.joda.time.Period((long) 2385, chronology41);
        org.joda.time.DurationField durationField56 = chronology41.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField42, durationField56, and durationField42", !(durationField42.compareTo(durationField56) == 0) || (Math.signum(durationField42.compareTo(durationField42)) == Math.signum(durationField56.compareTo(durationField42))));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period2 = duration1.toPeriod();
        org.joda.time.Duration duration5 = duration1.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 100, 1L, periodType12);
        org.joda.time.Period period14 = period9.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.Instant instant17 = instant15.withMillis(0L);
        org.joda.time.Duration duration18 = period13.toDurationTo((org.joda.time.ReadableInstant) instant17);
        long long19 = instant17.getMillis();
        org.joda.time.Interval interval20 = duration1.toIntervalTo((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Instant instant21 = instant17.toInstant();
        org.joda.time.DateTimeZone dateTimeZone22 = instant17.getZone();
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.Instant instant26 = instant24.withMillis(0L);
        org.joda.time.Chronology chronology27 = instant26.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.eras();
        java.util.Locale locale29 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology27, locale29, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property35 = localDateTime32.hourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = property35.getField();
        int int37 = property35.get();
        org.joda.time.LocalDateTime localDateTime38 = property35.roundHalfFloorCopy();
        long long40 = chronology27.set((org.joda.time.ReadablePartial) localDateTime38, (long) 2022);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now(chronology27);
        org.joda.time.DateTimeField dateTimeField42 = chronology27.era();
        org.joda.time.MutableDateTime mutableDateTime43 = instant17.toMutableDateTime(chronology27);
        org.joda.time.Chronology chronology44 = chronology27.withUTC();
        org.joda.time.DurationField durationField45 = chronology27.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField45, and durationField28", !(durationField28.compareTo(durationField45) == 0) || (Math.signum(durationField28.compareTo(durationField28)) == Math.signum(durationField45.compareTo(durationField28))));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 1, chronology3);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) instant5, periodType6);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis(0L);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.eras();
        java.util.Locale locale14 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology12, locale14, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        int int22 = property20.get();
        org.joda.time.LocalDateTime localDateTime23 = property20.roundHalfFloorCopy();
        long long25 = chronology12.set((org.joda.time.ReadablePartial) localDateTime23, (long) 2022);
        org.joda.time.DateTimeField dateTimeField26 = chronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField27 = chronology12.minuteOfHour();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 100, 1L, periodType30);
        org.joda.time.Period period33 = period31.minusSeconds((-1));
        java.lang.String str34 = period31.toString();
        org.joda.time.Period period35 = period31.negated();
        int[] intArray37 = chronology12.get((org.joda.time.ReadablePeriod) period35, (long) 1969);
        org.joda.time.DateTimeField dateTimeField38 = chronology12.halfdayOfDay();
        org.joda.time.Period period39 = new org.joda.time.Period((long) 894, 48L, periodType6, chronology12);
        org.joda.time.Hours hours40 = period39.toStandardHours();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(chronology47);
        int int49 = dateTime48.getSecondOfMinute();
        boolean boolean50 = dateTime48.isEqualNow();
        int int51 = dateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = dateTime48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology52);
        org.joda.time.DurationField durationField54 = chronology52.hours();
        org.joda.time.DateTimeField dateTimeField55 = chronology52.dayOfWeek();
        org.joda.time.Period period56 = new org.joda.time.Period((long) 39246272, (long) 5, chronology52);
        org.joda.time.Period period57 = new org.joda.time.Period((long) 4017, 1645455600000L, chronology52);
        org.joda.time.PeriodType periodType58 = period57.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((java.lang.Object) hours40, periodType58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField54", Math.signum(durationField13.compareTo(durationField54)) == -Math.signum(durationField54.compareTo(durationField13)));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology7);
        mutablePeriod8.setDays(49);
        int int11 = mutablePeriod8.getMillis();
        mutablePeriod8.addMillis(23);
        int int14 = mutablePeriod8.getMinutes();
        org.joda.time.Instant instant17 = new org.joda.time.Instant();
        org.joda.time.Instant instant19 = instant17.withMillis(0L);
        org.joda.time.Chronology chronology20 = instant19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.eras();
        java.util.Locale locale22 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology20, locale22, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.hourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        int int30 = property28.get();
        org.joda.time.LocalDateTime localDateTime31 = property28.roundHalfFloorCopy();
        long long33 = chronology20.set((org.joda.time.ReadablePartial) localDateTime31, (long) 2022);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(chronology20);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DurationField durationField36 = chronology20.eras();
        org.joda.time.DateTimeField dateTimeField37 = chronology20.weekyear();
        java.lang.String str38 = chronology20.toString();
        mutablePeriod8.add((long) 53941221, chronology20);
        org.joda.time.DurationField durationField40 = chronology20.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField40, and durationField21", !(durationField21.compareTo(durationField40) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField40.compareTo(durationField21))));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.yearOfEra();
        long long7 = dateTimeField5.roundHalfCeiling((long) 10);
        boolean boolean9 = dateTimeField5.isLeap(19249747200000L);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate12 = localDate10.minusMonths((int) ' ');
        org.joda.time.Chronology chronology13 = localDate10.getChronology();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate16 = localDate10.withFieldAdded(durationFieldType14, (int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight17 = localDate10.toDateMidnight();
        org.joda.time.LocalDate localDate19 = localDate10.withWeekyear(893);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate22 = localDate20.minusMonths((int) ' ');
        org.joda.time.Chronology chronology23 = localDate20.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology23.minuteOfHour();
        org.joda.time.DurationField durationField26 = chronology23.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = chronology23.centuryOfEra();
        org.joda.time.Chronology chronology28 = chronology23.withUTC();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate31 = localDate29.minusMonths((int) ' ');
        org.joda.time.Chronology chronology32 = localDate29.getChronology();
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate35 = localDate29.withFieldAdded(durationFieldType33, (int) (byte) 100);
        org.joda.time.LocalDate localDate37 = localDate35.minusMonths(55);
        java.util.Date date38 = localDate37.toDate();
        org.joda.time.LocalDate localDate39 = org.joda.time.LocalDate.fromDateFields(date38);
        org.joda.time.LocalDate localDate40 = org.joda.time.LocalDate.fromDateFields(date38);
        int[] intArray42 = chronology23.get((org.joda.time.ReadablePartial) localDate40, (long) 48);
        int int43 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDate10, intArray42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField26", Math.signum(durationField4.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField4)));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant3, periodType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int7 = instant3.get(dateTimeFieldType6);
        org.joda.time.Duration duration10 = new org.joda.time.Duration((long) 10, (long) 3);
        org.joda.time.Instant instant12 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration10, 0);
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, (org.joda.time.ReadableInstant) instant13);
        org.joda.time.Instant instant17 = new org.joda.time.Instant();
        org.joda.time.Instant instant19 = instant17.withMillis(0L);
        org.joda.time.Chronology chronology20 = instant19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.eras();
        java.util.Locale locale22 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology20, locale22, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.hourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        int int30 = property28.get();
        org.joda.time.LocalDateTime localDateTime31 = property28.roundHalfFloorCopy();
        long long33 = chronology20.set((org.joda.time.ReadablePartial) localDateTime31, (long) 2022);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(chronology20);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DurationField durationField36 = chronology20.eras();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(chronology20);
        mutablePeriod14.setPeriod((long) (short) -1, chronology20);
        org.joda.time.DateTimeField dateTimeField39 = chronology20.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now(chronology20);
        org.joda.time.DurationField durationField41 = chronology20.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField41, and durationField21", !(durationField21.compareTo(durationField41) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField41.compareTo(durationField21))));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        int int10 = dateTime9.getSecondOfMinute();
        boolean boolean11 = dateTime9.isEqualNow();
        int int12 = dateTime9.getDayOfYear();
        org.joda.time.Chronology chronology13 = dateTime9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology13);
        org.joda.time.DurationField durationField15 = chronology13.hours();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.dayOfWeek();
        org.joda.time.Period period17 = new org.joda.time.Period((long) 39246272, (long) 5, chronology13);
        org.joda.time.Period period18 = new org.joda.time.Period((long) 4017, 1645455600000L, chronology13);
        org.joda.time.PeriodType periodType19 = period18.getPeriodType();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate22 = localDate20.plusMonths(43);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean24 = localDate22.isSupported(durationFieldType23);
        boolean boolean25 = periodType19.isSupported(durationFieldType23);
        org.joda.time.PeriodType periodType26 = periodType19.withWeeksRemoved();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (short) 1, chronology33);
        org.joda.time.Instant instant35 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) instant35, periodType36);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate40 = localDate38.minusMonths((int) ' ');
        org.joda.time.Chronology chronology41 = localDate38.getChronology();
        org.joda.time.Period period42 = new org.joda.time.Period((long) (byte) 1, periodType36, chronology41);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate45 = localDate43.minusMonths((int) ' ');
        org.joda.time.Chronology chronology46 = localDate43.getChronology();
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate49 = localDate43.withFieldAdded(durationFieldType47, (int) (byte) 100);
        boolean boolean50 = periodType36.isSupported(durationFieldType47);
        org.joda.time.PeriodType periodType51 = periodType36.withDaysRemoved();
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property53 = localDate52.dayOfMonth();
        org.joda.time.Chronology chronology54 = localDate52.getChronology();
        org.joda.time.Period period55 = new org.joda.time.Period((long) 43, periodType36, chronology54);
        org.joda.time.Duration duration57 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period58 = duration57.toPeriod();
        org.joda.time.Duration duration61 = duration57.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Instant instant65 = new org.joda.time.Instant();
        org.joda.time.Instant instant67 = instant65.withMillis(0L);
        org.joda.time.Chronology chronology68 = instant67.getChronology();
        org.joda.time.DurationField durationField69 = chronology68.eras();
        java.util.Locale locale70 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology68, locale70, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate((long) 53, chronology68);
        org.joda.time.DateTimeField dateTimeField74 = chronology68.dayOfYear();
        org.joda.time.DateTimeField dateTimeField75 = chronology68.monthOfYear();
        org.joda.time.Period period76 = duration57.toPeriod(periodType62, chronology68);
        org.joda.time.Period period77 = new org.joda.time.Period((long) '#', periodType36, chronology68);
        org.joda.time.LocalDate localDate78 = new org.joda.time.LocalDate(chronology68);
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime(35L, chronology68);
        org.joda.time.DateTimeZone dateTimeZone80 = chronology68.getZone();
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) 53670306, chronology68);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((long) 53929555, (long) 53726991, periodType26, chronology68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField69", Math.signum(durationField15.compareTo(durationField69)) == -Math.signum(durationField69.compareTo(durationField15)));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis(0L);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        java.util.Locale locale7 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology5, locale7, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 53, chronology5);
        org.joda.time.DateTimeField dateTimeField11 = chronology5.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.dayOfMonth();
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        org.joda.time.Instant instant15 = instant13.withMillis(0L);
        org.joda.time.Chronology chronology16 = instant15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleAttributes();
        java.lang.String str23 = dateTimeField18.getAsShortText((long) 81, locale21);
        int int24 = dateTimeField12.getMaximumShortTextLength(locale21);
        org.joda.time.DurationField durationField25 = dateTimeField12.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField25, and durationField6", !(durationField6.compareTo(durationField25) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField25.compareTo(durationField6))));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset(0L, true);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        int int7 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) mutableDateTime6);
        mutableDateTime6.addMillis((int) '#');
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime6.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime6.toMutableDateTime();
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.Instant instant16 = instant14.withMillis(0L);
        org.joda.time.Chronology chronology17 = instant16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.eras();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology17);
        org.joda.time.DateTimeField dateTimeField20 = chronology17.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = dateTimeField20.getType();
        mutableDateTime6.setRounding(dateTimeField20);
        int int23 = dateTimeField20.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) 100, 1L, periodType29);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) 100, 1L, periodType33);
        org.joda.time.Period period35 = period30.plus((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Instant instant36 = new org.joda.time.Instant();
        org.joda.time.Instant instant38 = instant36.withMillis(0L);
        org.joda.time.Duration duration39 = period34.toDurationTo((org.joda.time.ReadableInstant) instant38);
        mutableDateTime26.add((org.joda.time.ReadableDuration) duration39, 39);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime26.secondOfMinute();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime26.minuteOfHour();
        java.lang.String str44 = property43.getAsShortText();
        java.util.Locale locale45 = java.util.Locale.GERMAN;
        java.util.Locale locale46 = locale45.stripExtensions();
        int int47 = property43.getMaximumTextLength(locale46);
        java.lang.String str48 = dateTimeField20.getAsShortText((long) 2712, locale46);
        org.joda.time.DurationField durationField49 = dateTimeField20.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField49, and durationField18", !(durationField18.compareTo(durationField49) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField49.compareTo(durationField18))));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField8 = localDateTime6.getField((int) (byte) 0);
        long long10 = dateTimeField8.roundHalfEven((long) 1);
        int int11 = dateTime1.get(dateTimeField8);
        boolean boolean12 = dateTime1.isBeforeNow();
        org.joda.time.DateTime.Property property13 = dateTime1.weekOfWeekyear();
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField22 = localDateTime20.getField((int) (byte) 0);
        long long24 = dateTimeField22.roundHalfEven((long) 1);
        int int25 = dateTime15.get(dateTimeField22);
        int int27 = dateTimeField22.getLeapAmount((long) (byte) 10);
        java.lang.String str29 = dateTimeField22.getAsText((long) 1969);
        int int32 = dateTimeField22.getDifference(31536000000L, (long) 86396);
        int int33 = dateTime1.get(dateTimeField22);
        org.joda.time.LocalDateTime localDateTime34 = dateTime1.toLocalDateTime();
        int int35 = dateTime1.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forID("GMT");
        org.joda.time.DateTime dateTime38 = dateTime1.withZone(dateTimeZone37);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime38", (dateTime1.compareTo(dateTime38) == 0) == dateTime1.equals(dateTime38));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime1.setZone(dateTimeZone18);
        int int20 = mutableDateTime1.getYearOfEra();
        mutableDateTime1.addMonths(41);
        mutableDateTime1.setMillisOfSecond(21);
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardHours((long) (short) 1);
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period29 = duration28.toPeriod();
        org.joda.time.Duration duration32 = duration28.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration32, readableInstant33);
        org.joda.time.Duration duration35 = duration32.toDuration();
        int int36 = duration26.compareTo((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology37);
        int int39 = dateTime38.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = dateTime38.toString(dateTimeFormatter40);
        org.joda.time.DateTime dateTime43 = dateTime38.plusMonths(86396191);
        org.joda.time.DateTime dateTime45 = dateTime38.plusWeeks(45);
        org.joda.time.Instant instant48 = new org.joda.time.Instant();
        org.joda.time.Instant instant50 = instant48.withMillis(0L);
        org.joda.time.Chronology chronology51 = instant50.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.eras();
        java.util.Locale locale53 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology51, locale53, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property59 = localDateTime56.hourOfDay();
        org.joda.time.DateTimeField dateTimeField60 = property59.getField();
        int int61 = property59.get();
        org.joda.time.LocalDateTime localDateTime62 = property59.roundHalfFloorCopy();
        long long64 = chronology51.set((org.joda.time.ReadablePartial) localDateTime62, (long) 2022);
        org.joda.time.LocalDateTime localDateTime65 = org.joda.time.LocalDateTime.now(chronology51);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(chronology51);
        org.joda.time.DurationField durationField67 = chronology51.eras();
        java.util.Locale locale71 = new java.util.Locale("hi!", "clockhourOfDay", "java.io.IOException");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket((long) 42, chronology51, locale71);
        org.joda.time.DateTimeZone dateTimeZone73 = dateTimeParserBucket72.getZone();
        int int75 = dateTimeZone73.getOffset((long) 40);
        org.joda.time.DateTime dateTime76 = dateTime45.withZone(dateTimeZone73);
        boolean boolean77 = duration26.equals((java.lang.Object) dateTime45);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.UTC;
        long long82 = dateTimeZone79.convertLocalToUTC((long) (byte) 100, false);
        long long85 = dateTimeZone79.convertLocalToUTC((long) 893, false);
        org.joda.time.LocalDateTime localDateTime86 = new org.joda.time.LocalDateTime(1645455286500L, dateTimeZone79);
        org.joda.time.LocalDateTime localDateTime88 = localDateTime86.plusSeconds(17);
        org.joda.time.Chronology chronology89 = localDateTime88.getChronology();
        org.joda.time.DateTime dateTime90 = dateTime45.withChronology(chronology89);
        mutableDateTime1.setChronology(chronology89);
        org.joda.time.DurationField durationField92 = chronology89.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField52, durationField92, and durationField52", !(durationField52.compareTo(durationField92) == 0) || (Math.signum(durationField52.compareTo(durationField52)) == Math.signum(durationField92.compareTo(durationField52))));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        int int6 = dateTime5.getSecondOfMinute();
        boolean boolean7 = dateTime5.isEqualNow();
        int int8 = dateTime5.getDayOfYear();
        org.joda.time.Chronology chronology9 = dateTime5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology9);
        org.joda.time.DurationField durationField11 = chronology9.hours();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.dayOfWeek();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 39246272, (long) 5, chronology9);
        org.joda.time.DurationField durationField14 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField17 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField11, and durationField14", !(durationField17.compareTo(durationField11) == 0) || (Math.signum(durationField17.compareTo(durationField14)) == Math.signum(durationField11.compareTo(durationField14))));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate3 = localDate1.plusMonths(43);
        org.joda.time.LocalDate localDate5 = localDate3.withDayOfYear(12);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate8 = localDate6.minusMonths((int) ' ');
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableDuration9, readableInstant10);
        org.joda.time.Period period13 = period11.withDays((int) (byte) 1);
        org.joda.time.LocalDate localDate14 = localDate8.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.LocalDate localDate16 = localDate14.minusMonths((-292275054));
        org.joda.time.LocalDate localDate18 = localDate14.minusYears(21);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType20 = periodType19.withMonthsRemoved();
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate5, (org.joda.time.ReadablePartial) localDate18, periodType19);
        org.joda.time.PeriodType periodType22 = periodType19.withHoursRemoved();
        org.joda.time.PeriodType periodType23 = periodType19.withDaysRemoved();
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.Instant instant26 = instant24.withMillis(0L);
        org.joda.time.Chronology chronology27 = instant26.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.eras();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(51L, periodType19, chronology27);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.yearOfEra();
        org.joda.time.DurationField durationField31 = chronology27.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField31, and durationField28", !(durationField28.compareTo(durationField31) == 0) || (Math.signum(durationField28.compareTo(durationField28)) == Math.signum(durationField31.compareTo(durationField28))));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) ' ');
        int int6 = localDate3.size();
        org.joda.time.LocalDate.Property property7 = localDate3.era();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearDayTime();
        boolean boolean9 = localDate3.equals((java.lang.Object) periodType8);
        org.joda.time.PeriodType periodType10 = periodType8.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 'a', periodType10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (short) 1, chronology13);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) instant15, periodType16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int19 = instant15.get(dateTimeFieldType18);
        java.lang.String str20 = dateTimeFieldType18.getName();
        org.joda.time.Instant instant23 = new org.joda.time.Instant();
        org.joda.time.Instant instant25 = instant23.withMillis(0L);
        org.joda.time.Chronology chronology26 = instant25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.eras();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology26);
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType18.getField(chronology26);
        org.joda.time.DateTimeField dateTimeField30 = chronology26.millisOfSecond();
        org.joda.time.Period period31 = new org.joda.time.Period((long) 39243612, periodType10, chronology26);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        int int36 = dateTime35.getSecondOfMinute();
        boolean boolean37 = dateTime35.isEqualNow();
        int int38 = dateTime35.getDayOfYear();
        org.joda.time.Chronology chronology39 = dateTime35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology39);
        org.joda.time.DateTimeField dateTimeField41 = chronology39.year();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.dayOfMonth();
        java.util.Locale locale44 = java.util.Locale.GERMAN;
        java.util.Locale locale45 = java.util.Locale.CANADA;
        java.lang.String str46 = locale44.getDisplayVariant(locale45);
        java.lang.String str47 = locale44.getISO3Language();
        java.lang.String str48 = dateTimeField42.getAsShortText((int) (byte) 100, locale44);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket(28956291L, chronology26, locale44, (java.lang.Integer) 53991421, 53820835);
        org.joda.time.DurationField durationField52 = chronology26.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField52, and durationField27", !(durationField27.compareTo(durationField52) == 0) || (Math.signum(durationField27.compareTo(durationField27)) == Math.signum(durationField52.compareTo(durationField27))));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration3, (int) (short) 100);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.yearOfCentury();
        int int7 = mutableDateTime1.getYearOfCentury();
        mutableDateTime1.addYears(467);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime1.era();
        java.lang.Object obj11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj11);
        org.joda.time.DateTime dateTime14 = dateTime12.withCenturyOfEra(39);
        org.joda.time.Chronology chronology15 = dateTime12.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime12.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime19 = dateTime12.withDurationAdded(53684531L, 513);
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.Instant instant23 = instant21.withMillis(0L);
        org.joda.time.Chronology chronology24 = instant23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.eras();
        java.util.Locale locale26 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology24, locale26, (java.lang.Integer) 39221019);
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = java.util.Locale.CANADA;
        java.lang.String str33 = locale31.getDisplayVariant(locale32);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology30, locale32);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeParserBucket34.getZone();
        org.joda.time.Chronology chronology36 = chronology24.withZone(dateTimeZone35);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology24);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(859);
        org.joda.time.DateMidnight dateMidnight40 = localDate37.toDateMidnight(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = dateTime12.toDateTime(dateTimeZone39);
        mutableDateTime1.setZone(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime41", (dateTime12.compareTo(dateTime41) == 0) == dateTime12.equals(dateTime41));
    }
}

