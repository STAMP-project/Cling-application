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
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0L, 100L, periodType2, chronology3);
        java.lang.Object obj5 = mutablePeriod4.clone();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone13);
        org.joda.time.Duration duration15 = mutablePeriod4.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight14);
        mutablePeriod4.addMillis(0);
        mutablePeriod4.setMonths(0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone21);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(0L, 100L, periodType25, chronology26);
        java.lang.Object obj28 = mutablePeriod27.clone();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone36);
        org.joda.time.Duration duration38 = mutablePeriod27.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight22.plus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(0L, 100L, periodType44, chronology45);
        java.lang.Object obj47 = mutablePeriod46.clone();
        java.lang.String str48 = mutablePeriod46.toString();
        mutableDateTime41.add((org.joda.time.ReadablePeriod) mutablePeriod46, 2022);
        mutablePeriod4.setPeriod((org.joda.time.ReadableInstant) dateMidnight39, (org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.Instant instant52 = dateMidnight39.toInstant();
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight39.withMonthOfYear((int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and instant52", (dateMidnight14.compareTo(instant52) == 0) == dateMidnight14.equals(instant52));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(9);
        int int8 = dateTime5.getEra();
        int int9 = dateTime5.getSecondOfMinute();
        org.joda.time.DateTime.Property property10 = dateTime5.millisOfSecond();
        org.joda.time.DateTime.Property property11 = dateTime5.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.DateTime dateTime14 = dateTime5.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.year();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusSeconds((int) (byte) 10);
        boolean boolean22 = dateTimeZone13.isLocalDateTimeGap(localDateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime14", (dateMidnight2.compareTo(dateTime14) == 0) == dateMidnight2.equals(dateTime14));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0L, 100L, periodType2, chronology3);
        java.lang.Object obj5 = mutablePeriod4.clone();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone13);
        org.joda.time.Duration duration15 = mutablePeriod4.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight14);
        mutablePeriod4.addMillis(0);
        mutablePeriod4.setMonths(0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone21);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(0L, 100L, periodType25, chronology26);
        java.lang.Object obj28 = mutablePeriod27.clone();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone36);
        org.joda.time.Duration duration38 = mutablePeriod27.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight22.plus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(0L, 100L, periodType44, chronology45);
        java.lang.Object obj47 = mutablePeriod46.clone();
        java.lang.String str48 = mutablePeriod46.toString();
        mutableDateTime41.add((org.joda.time.ReadablePeriod) mutablePeriod46, 2022);
        mutablePeriod4.setPeriod((org.joda.time.ReadableInstant) dateMidnight39, (org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.Instant instant52 = dateMidnight39.toInstant();
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight39.withDurationAdded(4598160382092000L, (int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and instant52", (dateMidnight14.compareTo(instant52) == 0) == dateMidnight14.equals(instant52));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(9);
        int int8 = dateTime5.getEra();
        int int9 = dateTime5.getSecondOfMinute();
        org.joda.time.DateTime.Property property10 = dateTime5.millisOfSecond();
        org.joda.time.DateTime.Property property11 = dateTime5.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.DateTime dateTime14 = dateTime5.withZone(dateTimeZone13);
        boolean boolean15 = dateTimeZone13.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime14", (dateMidnight2.compareTo(dateTime14) == 0) == dateMidnight2.equals(dateTime14));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        org.joda.time.Interval interval5 = yearMonthDay4.toInterval();
        org.joda.time.Period period6 = interval5.toPeriod();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology10);
        org.joda.time.Interval interval12 = yearMonthDay11.toInterval();
        org.joda.time.Period period13 = interval12.toPeriod();
        long long14 = interval12.getStartMillis();
        org.joda.time.Interval interval15 = interval5.overlap((org.joda.time.ReadableInterval) interval12);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone17);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(0L, 100L, periodType21, chronology22);
        java.lang.Object obj24 = mutablePeriod23.clone();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(0L, 100L, periodType27, chronology28);
        mutablePeriod23.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone32);
        org.joda.time.Duration duration34 = mutablePeriod23.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight18.plus((org.joda.time.ReadableDuration) duration34);
        org.joda.time.LocalDate localDate36 = dateMidnight35.toLocalDate();
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        java.lang.String str38 = chronology37.toString();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.secondOfDay();
        org.joda.time.Interval interval40 = interval5.withChronology(chronology37);
        org.joda.time.DurationField durationField41 = chronology37.seconds();
        org.joda.time.DurationField durationField42 = chronology37.eras();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField41 and durationField42", Math.signum(durationField41.compareTo(durationField42)) == -Math.signum(durationField42.compareTo(durationField41)));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(9);
        int int8 = dateTime5.getEra();
        int int9 = dateTime5.getSecondOfMinute();
        org.joda.time.DateTime.Property property10 = dateTime5.millisOfSecond();
        org.joda.time.DateTime.Property property11 = dateTime5.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.DateTime dateTime14 = dateTime5.withZone(dateTimeZone13);
        int int16 = dateTimeZone13.getOffset((long) 13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime14", (dateMidnight2.compareTo(dateTime14) == 0) == dateMidnight2.equals(dateTime14));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.seconds();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology5);
        org.joda.time.Interval interval7 = yearMonthDay6.toInterval();
        org.joda.time.Period period8 = interval7.toPeriod();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology12);
        org.joda.time.Interval interval14 = yearMonthDay13.toInterval();
        org.joda.time.Period period15 = interval14.toPeriod();
        long long16 = interval14.getStartMillis();
        org.joda.time.Interval interval17 = interval7.overlap((org.joda.time.ReadableInterval) interval14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone19);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(0L, 100L, periodType23, chronology24);
        java.lang.Object obj26 = mutablePeriod25.clone();
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(0L, 100L, periodType29, chronology30);
        mutablePeriod25.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone34);
        org.joda.time.Duration duration36 = mutablePeriod25.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight35);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight20.plus((org.joda.time.ReadableDuration) duration36);
        org.joda.time.LocalDate localDate38 = dateMidnight37.toLocalDate();
        org.joda.time.Chronology chronology39 = localDate38.getChronology();
        java.lang.String str40 = chronology39.toString();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.secondOfDay();
        org.joda.time.Interval interval42 = interval7.withChronology(chronology39);
        org.joda.time.DurationField durationField43 = chronology39.seconds();
        org.joda.time.DurationField durationField44 = chronology39.eras();
        org.joda.time.Period period45 = new org.joda.time.Period((long) 42, periodType1, chronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField43 and durationField44", Math.signum(durationField43.compareTo(durationField44)) == -Math.signum(durationField44.compareTo(durationField43)));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(9);
        int int8 = dateTime5.getEra();
        int int9 = dateTime5.getSecondOfMinute();
        org.joda.time.DateTime.Property property10 = dateTime5.millisOfSecond();
        org.joda.time.DateTime.Property property11 = dateTime5.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.DateTime dateTime14 = dateTime5.withZone(dateTimeZone13);
        java.util.Date date16 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromDateFields(date16);
        int int18 = timeOfDay17.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.minusMinutes(6);
        int int21 = timeOfDay17.size();
        org.joda.time.DateTime dateTime22 = timeOfDay17.toDateTimeToday();
        boolean boolean23 = dateTimeZone13.equals((java.lang.Object) dateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime14", (dateMidnight2.compareTo(dateTime14) == 0) == dateMidnight2.equals(dateTime14));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        org.joda.time.Interval interval5 = yearMonthDay4.toInterval();
        org.joda.time.Period period6 = interval5.toPeriod();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology10);
        org.joda.time.Interval interval12 = yearMonthDay11.toInterval();
        org.joda.time.Period period13 = interval12.toPeriod();
        long long14 = interval12.getStartMillis();
        org.joda.time.Interval interval15 = interval5.overlap((org.joda.time.ReadableInterval) interval12);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone17);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(0L, 100L, periodType21, chronology22);
        java.lang.Object obj24 = mutablePeriod23.clone();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(0L, 100L, periodType27, chronology28);
        mutablePeriod23.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone32);
        org.joda.time.Duration duration34 = mutablePeriod23.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight18.plus((org.joda.time.ReadableDuration) duration34);
        org.joda.time.LocalDate localDate36 = dateMidnight35.toLocalDate();
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        java.lang.String str38 = chronology37.toString();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.secondOfDay();
        org.joda.time.Interval interval40 = interval5.withChronology(chronology37);
        org.joda.time.DurationField durationField41 = chronology37.seconds();
        org.joda.time.DurationField durationField42 = chronology37.eras();
        org.joda.time.DateTimeField dateTimeField43 = chronology37.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField41 and durationField42", Math.signum(durationField41.compareTo(durationField42)) == -Math.signum(durationField42.compareTo(durationField41)));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime11 = dateTime7.withFieldAdded(durationFieldType9, 5);
        org.joda.time.TimeOfDay timeOfDay12 = dateTime7.toTimeOfDay();
        org.joda.time.Instant instant13 = dateTime7.toInstant();
        org.joda.time.Chronology chronology14 = dateTime7.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and instant13", (dateMidnight2.compareTo(instant13) == 0) == dateMidnight2.equals(instant13));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.Period period2 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.hours();
        java.lang.String str4 = durationFieldType3.toString();
        org.joda.time.Period period6 = period2.withField(durationFieldType3, 2);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone8);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(0L, 100L, periodType12, chronology13);
        java.lang.Object obj15 = mutablePeriod14.clone();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(0L, 100L, periodType18, chronology19);
        mutablePeriod14.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone23);
        org.joda.time.Duration duration25 = mutablePeriod14.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight9.plus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.LocalDate localDate27 = dateMidnight26.toLocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        java.lang.Object obj34 = mutablePeriod33.clone();
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(0L, 100L, periodType37, chronology38);
        mutablePeriod33.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod39);
        int int41 = mutablePeriod39.getMinutes();
        org.joda.time.Period period43 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.hours();
        java.lang.String str45 = durationFieldType44.toString();
        org.joda.time.Period period47 = period43.withField(durationFieldType44, 2);
        boolean boolean48 = mutablePeriod39.isSupported(durationFieldType44);
        long long51 = chronology28.add((org.joda.time.ReadablePeriod) mutablePeriod39, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.Chronology chronology53 = chronology28.withZone(dateTimeZone52);
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate(chronology53);
        org.joda.time.DurationField durationField55 = chronology53.halfdays();
        org.joda.time.DurationField durationField56 = durationFieldType3.getField(chronology53);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 11, chronology53);
        org.joda.time.DurationField durationField58 = chronology53.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField58, durationField55, and durationField56", !(durationField58.compareTo(durationField55) == 0) || (Math.signum(durationField58.compareTo(durationField56)) == Math.signum(durationField55.compareTo(durationField56))));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(0L, 100L, periodType3, chronology4);
        java.lang.Object obj6 = mutablePeriod5.clone();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(0L, 100L, periodType9, chronology10);
        mutablePeriod5.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone14);
        org.joda.time.Duration duration16 = mutablePeriod5.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight15);
        mutablePeriod5.addMillis(0);
        mutablePeriod5.setMonths(0);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone22);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(0L, 100L, periodType26, chronology27);
        java.lang.Object obj29 = mutablePeriod28.clone();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(0L, 100L, periodType32, chronology33);
        mutablePeriod28.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone37);
        org.joda.time.Duration duration39 = mutablePeriod28.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight38);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight23.plus((org.joda.time.ReadableDuration) duration39);
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(0L, 100L, periodType45, chronology46);
        java.lang.Object obj48 = mutablePeriod47.clone();
        java.lang.String str49 = mutablePeriod47.toString();
        mutableDateTime42.add((org.joda.time.ReadablePeriod) mutablePeriod47, 2022);
        mutablePeriod5.setPeriod((org.joda.time.ReadableInstant) dateMidnight40, (org.joda.time.ReadableInstant) mutableDateTime42);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone56);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod(0L, 100L, periodType60, chronology61);
        java.lang.Object obj63 = mutablePeriod62.clone();
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod(0L, 100L, periodType66, chronology67);
        mutablePeriod62.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod68);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone71);
        org.joda.time.Duration duration73 = mutablePeriod62.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight72);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight57.plus((org.joda.time.ReadableDuration) duration73);
        org.joda.time.LocalDate localDate75 = dateMidnight74.toLocalDate();
        org.joda.time.Chronology chronology76 = localDate75.getChronology();
        java.lang.String str77 = chronology76.toString();
        org.joda.time.DateTimeField dateTimeField78 = chronology76.secondOfDay();
        org.joda.time.Interval interval79 = new org.joda.time.Interval(0L, (long) 1, chronology76);
        org.joda.time.YearMonthDay yearMonthDay81 = new org.joda.time.YearMonthDay(10L);
        long long83 = chronology76.set((org.joda.time.ReadablePartial) yearMonthDay81, (long) 8);
        org.joda.time.DateTimeField dateTimeField84 = chronology76.secondOfDay();
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod5, chronology76);
        org.joda.time.DateTimeField dateTimeField86 = chronology76.dayOfMonth();
        org.joda.time.LocalDate localDate87 = new org.joda.time.LocalDate((long) 588, chronology76);
        org.joda.time.DurationField durationField88 = chronology76.weekyears();
        org.joda.time.DurationField durationField89 = chronology76.eras();
        org.joda.time.DateTimeField dateTimeField90 = chronology76.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField88 and durationField89", Math.signum(durationField88.compareTo(durationField89)) == -Math.signum(durationField89.compareTo(durationField88)));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        int int5 = yearMonthDay4.size();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        java.lang.Object obj11 = mutablePeriod10.clone();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(0L, 100L, periodType14, chronology15);
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay4.plus((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime20 = yearMonthDay18.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone22);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(0L, 100L, periodType26, chronology27);
        java.lang.Object obj29 = mutablePeriod28.clone();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(0L, 100L, periodType32, chronology33);
        mutablePeriod28.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone37);
        org.joda.time.Duration duration39 = mutablePeriod28.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight38);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight23.plus((org.joda.time.ReadableDuration) duration39);
        org.joda.time.LocalDate localDate41 = dateMidnight40.toLocalDate();
        org.joda.time.Chronology chronology42 = localDate41.getChronology();
        java.lang.String str43 = chronology42.toString();
        org.joda.time.DateTimeField dateTimeField44 = chronology42.minuteOfHour();
        java.lang.String str45 = chronology42.toString();
        org.joda.time.DurationField durationField46 = chronology42.eras();
        org.joda.time.DateTime dateTime47 = dateTime20.toDateTime(chronology42);
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(0L, 100L, periodType52, chronology53);
        java.lang.Object obj55 = mutablePeriod54.clone();
        java.lang.String str56 = mutablePeriod54.toString();
        mutableDateTime49.add((org.joda.time.ReadablePeriod) mutablePeriod54, 2022);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime49.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone61);
        int int63 = dateMidnight62.getEra();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTime dateTime65 = dateMidnight62.toDateTime(chronology64);
        org.joda.time.DateTime dateTime67 = dateTime65.plusDays(9);
        int int68 = dateTime65.getEra();
        org.joda.time.DateTime dateTime69 = dateTime65.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone70 = dateTime69.getZone();
        long long73 = dateTimeZone70.adjustOffset((long) 5, true);
        mutableDateTime49.setZoneRetainFields(dateTimeZone70);
        java.util.TimeZone timeZone75 = dateTimeZone70.toTimeZone();
        int int77 = dateTimeZone70.getOffset((long) (short) 0);
        java.lang.String str78 = dateTimeZone70.getID();
        org.joda.time.DateTime dateTime79 = dateTime47.toDateTime(dateTimeZone70);
        java.util.Locale locale83 = new java.util.Locale("hi!", "");
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.YearMonthDay yearMonthDay88 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology87);
        org.joda.time.Interval interval89 = yearMonthDay88.toInterval();
        org.joda.time.DateTime dateTime90 = yearMonthDay88.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime.Property property92 = dateTime90.property(dateTimeFieldType91);
        org.joda.time.DateTime dateTime93 = property92.getDateTime();
        java.util.Locale locale94 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale95 = locale94.stripExtensions();
        int int96 = property92.getMaximumShortTextLength(locale94);
        java.lang.String str97 = locale83.getDisplayScript(locale94);
        java.lang.String str98 = dateTimeZone70.getName((long) 1986, locale94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime79", (dateTime20.compareTo(dateTime79) == 0) == dateTime20.equals(dateTime79));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        org.joda.time.DateMidnight dateMidnight5 = yearMonthDay4.toDateMidnight();
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.DateMidnight.Property property8 = dateMidnight5.property(dateTimeFieldType7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight5.yearOfCentury();
        int int10 = property9.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and instant6", (dateMidnight5.compareTo(instant6) == 0) == dateMidnight5.equals(instant6));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        int int5 = yearMonthDay4.size();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        java.lang.Object obj11 = mutablePeriod10.clone();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(0L, 100L, periodType14, chronology15);
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay4.plus((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime20 = yearMonthDay18.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone22);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(0L, 100L, periodType26, chronology27);
        java.lang.Object obj29 = mutablePeriod28.clone();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(0L, 100L, periodType32, chronology33);
        mutablePeriod28.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone37);
        org.joda.time.Duration duration39 = mutablePeriod28.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight38);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight23.plus((org.joda.time.ReadableDuration) duration39);
        org.joda.time.LocalDate localDate41 = dateMidnight40.toLocalDate();
        org.joda.time.Chronology chronology42 = localDate41.getChronology();
        java.lang.String str43 = chronology42.toString();
        org.joda.time.DateTimeField dateTimeField44 = chronology42.minuteOfHour();
        java.lang.String str45 = chronology42.toString();
        org.joda.time.DurationField durationField46 = chronology42.eras();
        org.joda.time.DateTime dateTime47 = dateTime20.toDateTime(chronology42);
        org.joda.time.DurationField durationField48 = chronology42.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField46, durationField48, and durationField46", !(durationField46.compareTo(durationField48) == 0) || (Math.signum(durationField46.compareTo(durationField46)) == Math.signum(durationField48.compareTo(durationField46))));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        long long6 = dateTime5.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime5.withMillis(100L);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone10);
        int int12 = dateMidnight11.getEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateMidnight11.toDateTime(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusDays(9);
        int int17 = dateTime14.getEra();
        org.joda.time.DateTime dateTime18 = dateTime14.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTime dateTime20 = dateTime5.withZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withDayOfMonth(21);
        boolean boolean23 = dateTime20.isAfterNow();
        int int24 = dateTime20.getSecondOfDay();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.year();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusSeconds((int) (byte) 10);
        org.joda.time.Chronology chronology33 = localDateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.monthOfYear();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) 2004, chronology33);
        org.joda.time.DateTime dateTime37 = dateTime20.toDateTime(chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight36", (dateMidnight2.compareTo(dateMidnight36) == 0) == dateMidnight2.equals(dateMidnight36));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(9);
        int int8 = dateTime5.getEra();
        int int9 = dateTime5.getSecondOfMinute();
        org.joda.time.DateTime.Property property10 = dateTime5.millisOfSecond();
        org.joda.time.DateTime.Property property11 = dateTime5.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.DateTime dateTime14 = dateTime5.withZone(dateTimeZone13);
        org.joda.time.DateTime.Property property15 = dateTime14.monthOfYear();
        int int16 = property15.getLeapAmount();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime14", (dateMidnight2.compareTo(dateTime14) == 0) == dateMidnight2.equals(dateTime14));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.LocalTime localTime9 = dateTime7.toLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.minusMinutes(3);
        org.joda.time.LocalTime.Property property12 = localTime9.minuteOfHour();
        org.joda.time.LocalTime.Property property13 = localTime9.millisOfDay();
        org.joda.time.LocalTime localTime15 = property13.addNoWrapToCopy((int) '4');
        org.joda.time.LocalTime localTime16 = property13.withMaximumValue();
        org.joda.time.LocalTime localTime17 = property13.withMaximumValue();
        org.joda.time.LocalTime localTime18 = property13.getLocalTime();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone20);
        int int22 = dateMidnight21.getEra();
        int int23 = dateMidnight21.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight21.withField(dateTimeFieldType24, 3);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight21.minusDays((int) (short) 10);
        org.joda.time.DateTime dateTime29 = dateMidnight28.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime34 = property32.add((long) 3);
        mutableDateTime34.setDayOfMonth((int) (byte) 10);
        mutableDateTime34.add((long) 6);
        mutableDateTime34.addWeeks((int) '4');
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property42 = dateMidnight41.monthOfYear();
        mutableDateTime34.setTime((org.joda.time.ReadableInstant) dateMidnight41);
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight28, (org.joda.time.ReadableInstant) dateMidnight41);
        org.joda.time.LocalTime localTime45 = localTime18.plus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.MutablePeriod mutablePeriod46 = period44.toMutablePeriod();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(chronology50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.year();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusSeconds((int) (byte) 10);
        org.joda.time.Chronology chronology57 = localDateTime56.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.monthOfYear();
        org.joda.time.DateTimeField dateTimeField59 = chronology57.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) 2004, chronology57);
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight((long) 10, chronology57);
        mutablePeriod46.setPeriod((-4190400000L), chronology57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight60", (dateMidnight2.compareTo(dateMidnight60) == 0) == dateMidnight2.equals(dateMidnight60));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.era();
        int int10 = dateMidnight8.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone12);
        int int14 = dateMidnight13.getEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateMidnight13.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks(0);
        org.joda.time.DateTime dateTime19 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime22 = dateTime18.withFieldAdded(durationFieldType20, 5);
        int int23 = dateMidnight8.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone26);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(0L, 100L, periodType30, chronology31);
        java.lang.Object obj33 = mutablePeriod32.clone();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, 100L, periodType36, chronology37);
        mutablePeriod32.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone41);
        org.joda.time.Duration duration43 = mutablePeriod32.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight27.plus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.LocalDate localDate45 = dateMidnight44.toLocalDate();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(0L, 100L, periodType49, chronology50);
        java.lang.Object obj52 = mutablePeriod51.clone();
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(0L, 100L, periodType55, chronology56);
        mutablePeriod51.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod57);
        int int59 = mutablePeriod57.getMinutes();
        org.joda.time.Period period61 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType62 = org.joda.time.DurationFieldType.hours();
        java.lang.String str63 = durationFieldType62.toString();
        org.joda.time.Period period65 = period61.withField(durationFieldType62, 2);
        boolean boolean66 = mutablePeriod57.isSupported(durationFieldType62);
        long long69 = chronology46.add((org.joda.time.ReadablePeriod) mutablePeriod57, (long) 53230763, 2);
        org.joda.time.DurationField durationField70 = chronology46.seconds();
        org.joda.time.DateTime dateTime71 = dateTime22.withChronology(chronology46);
        org.joda.time.DateTime.Property property72 = dateTime71.millisOfSecond();
        java.util.Locale locale76 = new java.util.Locale("hi!", "");
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.YearMonthDay yearMonthDay81 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology80);
        org.joda.time.Interval interval82 = yearMonthDay81.toInterval();
        org.joda.time.DateTime dateTime83 = yearMonthDay81.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime.Property property85 = dateTime83.property(dateTimeFieldType84);
        org.joda.time.DateTime dateTime86 = property85.getDateTime();
        java.util.Locale locale87 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale88 = locale87.stripExtensions();
        int int89 = property85.getMaximumShortTextLength(locale87);
        java.lang.String str90 = locale76.getDisplayScript(locale87);
        org.joda.time.DateTime dateTime91 = property72.setCopy("20", locale87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime71", (dateTime22.compareTo(dateTime71) == 0) == dateTime22.equals(dateTime71));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.withMillis(53230963L);
        org.joda.time.Instant instant22 = dateMidnight19.toInstant();
        org.joda.time.DateMidnight.Property property23 = dateMidnight19.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight19 and instant22", (dateMidnight19.compareTo(instant22) == 0) == dateMidnight19.equals(instant22));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(0L, 100L, periodType3, chronology4);
        java.lang.Object obj6 = mutablePeriod5.clone();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(0L, 100L, periodType9, chronology10);
        mutablePeriod5.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone14);
        org.joda.time.Duration duration16 = mutablePeriod5.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight15);
        mutablePeriod5.addMillis(0);
        mutablePeriod5.setMonths(0);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone22);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(0L, 100L, periodType26, chronology27);
        java.lang.Object obj29 = mutablePeriod28.clone();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(0L, 100L, periodType32, chronology33);
        mutablePeriod28.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone37);
        org.joda.time.Duration duration39 = mutablePeriod28.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight38);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight23.plus((org.joda.time.ReadableDuration) duration39);
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(0L, 100L, periodType45, chronology46);
        java.lang.Object obj48 = mutablePeriod47.clone();
        java.lang.String str49 = mutablePeriod47.toString();
        mutableDateTime42.add((org.joda.time.ReadablePeriod) mutablePeriod47, 2022);
        mutablePeriod5.setPeriod((org.joda.time.ReadableInstant) dateMidnight40, (org.joda.time.ReadableInstant) mutableDateTime42);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone56);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod(0L, 100L, periodType60, chronology61);
        java.lang.Object obj63 = mutablePeriod62.clone();
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod(0L, 100L, periodType66, chronology67);
        mutablePeriod62.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod68);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone71);
        org.joda.time.Duration duration73 = mutablePeriod62.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight72);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight57.plus((org.joda.time.ReadableDuration) duration73);
        org.joda.time.LocalDate localDate75 = dateMidnight74.toLocalDate();
        org.joda.time.Chronology chronology76 = localDate75.getChronology();
        java.lang.String str77 = chronology76.toString();
        org.joda.time.DateTimeField dateTimeField78 = chronology76.secondOfDay();
        org.joda.time.Interval interval79 = new org.joda.time.Interval(0L, (long) 1, chronology76);
        org.joda.time.YearMonthDay yearMonthDay81 = new org.joda.time.YearMonthDay(10L);
        long long83 = chronology76.set((org.joda.time.ReadablePartial) yearMonthDay81, (long) 8);
        org.joda.time.DateTimeField dateTimeField84 = chronology76.secondOfDay();
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod5, chronology76);
        org.joda.time.DateTimeField dateTimeField86 = chronology76.dayOfMonth();
        org.joda.time.LocalDate localDate87 = new org.joda.time.LocalDate((long) 588, chronology76);
        org.joda.time.DurationField durationField88 = chronology76.weekyears();
        org.joda.time.DurationField durationField89 = chronology76.eras();
        org.joda.time.DurationField durationField90 = chronology76.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField88 and durationField89", Math.signum(durationField88.compareTo(durationField89)) == -Math.signum(durationField89.compareTo(durationField88)));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDate localDate20 = dateMidnight19.toLocalDate();
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(0L, 100L, periodType24, chronology25);
        java.lang.Object obj27 = mutablePeriod26.clone();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(0L, 100L, periodType30, chronology31);
        mutablePeriod26.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod32);
        int int34 = mutablePeriod32.getMinutes();
        org.joda.time.Period period36 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.hours();
        java.lang.String str38 = durationFieldType37.toString();
        org.joda.time.Period period40 = period36.withField(durationFieldType37, 2);
        boolean boolean41 = mutablePeriod32.isSupported(durationFieldType37);
        long long44 = chronology21.add((org.joda.time.ReadablePeriod) mutablePeriod32, (long) 53230763, 2);
        org.joda.time.DurationField durationField45 = chronology21.eras();
        org.joda.time.DateTimeField dateTimeField46 = chronology21.monthOfYear();
        org.joda.time.DurationField durationField47 = chronology21.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField47, and durationField45", !(durationField45.compareTo(durationField47) == 0) || (Math.signum(durationField45.compareTo(durationField45)) == Math.signum(durationField47.compareTo(durationField45))));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        java.lang.Object obj11 = mutablePeriod10.clone();
        java.lang.String str12 = mutablePeriod10.toString();
        mutableDateTime5.add((org.joda.time.ReadablePeriod) mutablePeriod10, 2022);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone17);
        int int19 = dateMidnight18.getEra();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = dateMidnight18.toDateTime(chronology20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusDays(9);
        int int24 = dateTime21.getEra();
        org.joda.time.DateTime dateTime25 = dateTime21.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        long long29 = dateTimeZone26.adjustOffset((long) 5, true);
        mutableDateTime5.setZoneRetainFields(dateTimeZone26);
        java.util.TimeZone timeZone31 = dateTimeZone26.toTimeZone();
        long long33 = dateTimeZone26.convertUTCToLocal(53230963L);
        java.util.Locale locale35 = java.util.Locale.CHINA;
        java.lang.String str36 = dateTimeZone26.getName((long) 53243308, locale35);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        mutableDateTime1.setZone(dateTimeZone26);
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime41 = localTime39.withMillisOfDay(5);
        java.util.TimeZone timeZone43 = java.util.TimeZone.getTimeZone("");
        java.lang.String str44 = timeZone43.getID();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property47 = dateMidnight46.monthOfYear();
        org.joda.time.DateMidnight dateMidnight48 = property47.getDateMidnight();
        org.joda.time.DateMidnight.Property property49 = dateMidnight48.dayOfYear();
        int int50 = dateTimeZone45.getOffset((org.joda.time.ReadableInstant) dateMidnight48);
        org.joda.time.DateTime dateTime51 = localTime39.toDateTimeToday(dateTimeZone45);
        long long54 = dateTimeZone45.convertLocalToUTC((long) 'x', true);
        mutableDateTime1.setZone(dateTimeZone45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime37 and dateTime51", (mutableDateTime37.compareTo(dateTime51) == 0) == mutableDateTime37.equals(dateTime51));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(0L, 100L, periodType4, chronology5);
        java.lang.Object obj7 = mutablePeriod6.clone();
        java.lang.String str8 = mutablePeriod6.toString();
        mutableDateTime1.add((org.joda.time.ReadablePeriod) mutablePeriod6, 2022);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone12);
        int int14 = dateMidnight13.getEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateMidnight13.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusDays(9);
        int int19 = dateTime16.getEra();
        org.joda.time.DateTime dateTime20 = dateTime16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        java.lang.String str22 = dateTimeZone21.toString();
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone21);
        mutableDateTime1.setZoneRetainFields(dateTimeZone21);
        org.joda.time.Period period26 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.hours();
        java.lang.String str28 = durationFieldType27.toString();
        org.joda.time.Period period30 = period26.withField(durationFieldType27, 2);
        org.joda.time.Period period32 = period30.minusMinutes(21);
        org.joda.time.Days days33 = period30.toStandardDays();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, 100L, periodType36, chronology37);
        java.lang.Object obj39 = mutablePeriod38.clone();
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(0L, 100L, periodType42, chronology43);
        mutablePeriod38.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod44);
        int int46 = mutablePeriod44.getMinutes();
        org.joda.time.Period period47 = period30.plus((org.joda.time.ReadablePeriod) mutablePeriod44);
        org.joda.time.Period period48 = period47.normalizedStandard();
        mutableDateTime1.add((org.joda.time.ReadablePeriod) period48);
        org.joda.time.Instant instant50 = mutableDateTime1.toInstant();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone52);
        int int54 = dateMidnight53.getEra();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = dateMidnight53.toDateTime(chronology55);
        org.joda.time.DateTime dateTime58 = dateTime56.minusWeeks(0);
        org.joda.time.DateTime dateTime59 = dateTime58.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property60 = dateTime59.era();
        boolean boolean61 = instant50.isAfter((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.YearMonthDay yearMonthDay66 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology65);
        org.joda.time.Interval interval67 = yearMonthDay66.toInterval();
        org.joda.time.Interval interval69 = interval67.withEndMillis((long) 2);
        org.joda.time.DateTime dateTime70 = interval69.getEnd();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.YearMonthDay yearMonthDay75 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology74);
        org.joda.time.Interval interval76 = yearMonthDay75.toInterval();
        org.joda.time.DateTime dateTime77 = yearMonthDay75.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime.Property property79 = dateTime77.property(dateTimeFieldType78);
        boolean boolean80 = dateTime70.isSupported(dateTimeFieldType78);
        org.joda.time.DateTime dateTime83 = dateTime70.withDurationAdded(0L, 47);
        int int84 = dateTime59.compareTo((org.joda.time.ReadableInstant) dateTime83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant50", (mutableDateTime1.compareTo(instant50) == 0) == mutableDateTime1.equals(instant50));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateMidnight2.toLocalDate();
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks(100);
        org.joda.time.Chronology chronology6 = localDate3.getChronology();
        org.joda.time.LocalDate.Property property7 = localDate3.yearOfCentury();
        org.joda.time.LocalDate localDate8 = property7.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDate localDate11 = localDate8.withField(dateTimeFieldType9, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone13);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(0L, 100L, periodType17, chronology18);
        java.lang.Object obj20 = mutablePeriod19.clone();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(0L, 100L, periodType23, chronology24);
        mutablePeriod19.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone28);
        org.joda.time.Duration duration30 = mutablePeriod19.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight29);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight14.plus((org.joda.time.ReadableDuration) duration30);
        org.joda.time.LocalDate localDate32 = dateMidnight31.toLocalDate();
        org.joda.time.Chronology chronology33 = localDate32.getChronology();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, 100L, periodType36, chronology37);
        java.lang.Object obj39 = mutablePeriod38.clone();
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(0L, 100L, periodType42, chronology43);
        mutablePeriod38.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod44);
        int int46 = mutablePeriod44.getMinutes();
        org.joda.time.Period period48 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.hours();
        java.lang.String str50 = durationFieldType49.toString();
        org.joda.time.Period period52 = period48.withField(durationFieldType49, 2);
        boolean boolean53 = mutablePeriod44.isSupported(durationFieldType49);
        long long56 = chronology33.add((org.joda.time.ReadablePeriod) mutablePeriod44, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.Chronology chronology58 = chronology33.withZone(dateTimeZone57);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate(chronology58);
        org.joda.time.DurationField durationField60 = chronology58.halfdays();
        org.joda.time.DurationField durationField61 = chronology58.months();
        org.joda.time.DateTimeField dateTimeField62 = chronology58.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType9.getField(chronology58);
        org.joda.time.DateTimeField dateTimeField64 = chronology58.clockhourOfHalfday();
        org.joda.time.DurationField durationField65 = chronology58.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField65, durationField60, and durationField61", !(durationField65.compareTo(durationField60) == 0) || (Math.signum(durationField65.compareTo(durationField61)) == Math.signum(durationField60.compareTo(durationField61))));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        java.lang.Object obj14 = mutablePeriod13.clone();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(0L, 100L, periodType17, chronology18);
        mutablePeriod13.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone22);
        org.joda.time.Duration duration24 = mutablePeriod13.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(0L, dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone29);
        int int31 = dateMidnight30.getEra();
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(0L, 100L, periodType34, chronology35);
        java.lang.Object obj37 = mutablePeriod36.clone();
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(0L, 100L, periodType40, chronology41);
        mutablePeriod36.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone45);
        org.joda.time.Duration duration47 = mutablePeriod36.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight46);
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight30, (org.joda.time.ReadableDuration) duration47);
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight27, (org.joda.time.ReadableDuration) duration47, periodType49);
        boolean boolean51 = duration24.isLongerThan((org.joda.time.ReadableDuration) duration47);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight8.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone54);
        int int56 = dateMidnight55.getEra();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = dateMidnight55.toDateTime(chronology57);
        org.joda.time.DateTime dateTime60 = dateTime58.minusWeeks(0);
        org.joda.time.DateTime dateTime61 = dateTime60.withEarlierOffsetAtOverlap();
        org.joda.time.LocalTime localTime62 = dateTime60.toLocalTime();
        org.joda.time.LocalTime localTime64 = localTime62.minusMinutes(3);
        org.joda.time.LocalTime.Property property65 = localTime62.minuteOfHour();
        org.joda.time.LocalTime localTime67 = localTime62.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime68 = localTime62.toDateTimeToday();
        org.joda.time.Interval interval69 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration24, (org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.Interval interval71 = interval69.withStartMillis((long) 53256552);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight(0L, dateTimeZone73);
        org.joda.time.LocalDate localDate75 = dateMidnight74.toLocalDate();
        org.joda.time.Instant instant76 = dateMidnight74.toInstant();
        boolean boolean77 = interval71.isBefore((org.joda.time.ReadableInstant) dateMidnight74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and instant76", (dateMidnight2.compareTo(instant76) == 0) == dateMidnight2.equals(instant76));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(0L, 100L, periodType4, chronology5);
        java.lang.Object obj7 = mutablePeriod6.clone();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(0L, 100L, periodType10, chronology11);
        mutablePeriod6.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone15);
        org.joda.time.Duration duration17 = mutablePeriod6.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight16);
        mutablePeriod6.addMillis(0);
        mutablePeriod6.setMonths(0);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone23);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(0L, 100L, periodType27, chronology28);
        java.lang.Object obj30 = mutablePeriod29.clone();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(0L, 100L, periodType33, chronology34);
        mutablePeriod29.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone38);
        org.joda.time.Duration duration40 = mutablePeriod29.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight39);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight24.plus((org.joda.time.ReadableDuration) duration40);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(0L, 100L, periodType46, chronology47);
        java.lang.Object obj49 = mutablePeriod48.clone();
        java.lang.String str50 = mutablePeriod48.toString();
        mutableDateTime43.add((org.joda.time.ReadablePeriod) mutablePeriod48, 2022);
        mutablePeriod6.setPeriod((org.joda.time.ReadableInstant) dateMidnight41, (org.joda.time.ReadableInstant) mutableDateTime43);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone57);
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(0L, 100L, periodType61, chronology62);
        java.lang.Object obj64 = mutablePeriod63.clone();
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod(0L, 100L, periodType67, chronology68);
        mutablePeriod63.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod69);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.DateMidnight dateMidnight73 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone72);
        org.joda.time.Duration duration74 = mutablePeriod63.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight73);
        org.joda.time.DateMidnight dateMidnight75 = dateMidnight58.plus((org.joda.time.ReadableDuration) duration74);
        org.joda.time.LocalDate localDate76 = dateMidnight75.toLocalDate();
        org.joda.time.Chronology chronology77 = localDate76.getChronology();
        java.lang.String str78 = chronology77.toString();
        org.joda.time.DateTimeField dateTimeField79 = chronology77.secondOfDay();
        org.joda.time.Interval interval80 = new org.joda.time.Interval(0L, (long) 1, chronology77);
        org.joda.time.YearMonthDay yearMonthDay82 = new org.joda.time.YearMonthDay(10L);
        long long84 = chronology77.set((org.joda.time.ReadablePartial) yearMonthDay82, (long) 8);
        org.joda.time.DateTimeField dateTimeField85 = chronology77.secondOfDay();
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod6, chronology77);
        org.joda.time.DateTimeField dateTimeField87 = chronology77.dayOfMonth();
        org.joda.time.LocalDate localDate88 = new org.joda.time.LocalDate((long) 588, chronology77);
        org.joda.time.DurationField durationField89 = chronology77.weekyears();
        org.joda.time.DurationField durationField90 = chronology77.eras();
        org.joda.time.TimeOfDay timeOfDay91 = new org.joda.time.TimeOfDay((long) 455376, chronology77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField89 and durationField90", Math.signum(durationField89.compareTo(durationField90)) == -Math.signum(durationField90.compareTo(durationField89)));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        java.lang.String str9 = mutablePeriod7.toString();
        mutableDateTime2.add((org.joda.time.ReadablePeriod) mutablePeriod7, 2022);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone14);
        int int16 = dateMidnight15.getEra();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = dateMidnight15.toDateTime(chronology17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusDays(9);
        int int21 = dateTime18.getEra();
        org.joda.time.DateTime dateTime22 = dateTime18.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime22.getZone();
        long long26 = dateTimeZone23.adjustOffset((long) 5, true);
        mutableDateTime2.setZoneRetainFields(dateTimeZone23);
        java.util.TimeZone timeZone28 = dateTimeZone23.toTimeZone();
        boolean boolean29 = timeZone28.observesDaylightTime();
        java.util.Locale locale30 = java.util.Locale.JAPANESE;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone32);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, 100L, periodType36, chronology37);
        java.lang.Object obj39 = mutablePeriod38.clone();
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(0L, 100L, periodType42, chronology43);
        mutablePeriod38.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone47);
        org.joda.time.Duration duration49 = mutablePeriod38.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight48);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight33.plus((org.joda.time.ReadableDuration) duration49);
        org.joda.time.LocalDate localDate51 = dateMidnight50.toLocalDate();
        org.joda.time.Chronology chronology52 = localDate51.getChronology();
        java.lang.String str53 = chronology52.toString();
        org.joda.time.DateTimeField dateTimeField54 = chronology52.secondOfDay();
        long long56 = dateTimeField54.roundHalfFloor(100L);
        java.util.Locale locale60 = new java.util.Locale("hi!", "");
        java.lang.String str61 = locale60.getDisplayVariant();
        java.lang.String str62 = locale60.getCountry();
        java.lang.String str63 = dateTimeField54.getAsShortText((long) 14, locale60);
        java.lang.String str64 = locale30.getDisplayLanguage(locale60);
        java.util.Calendar calendar65 = java.util.Calendar.getInstance(timeZone28, locale60);
        java.lang.String str66 = timeZone28.getID();
        org.joda.time.MutableDateTime mutableDateTime68 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(0L, 100L, periodType71, chronology72);
        java.lang.Object obj74 = mutablePeriod73.clone();
        java.lang.String str75 = mutablePeriod73.toString();
        mutableDateTime68.add((org.joda.time.ReadablePeriod) mutablePeriod73, 2022);
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime68.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone80 = null;
        org.joda.time.DateMidnight dateMidnight81 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone80);
        int int82 = dateMidnight81.getEra();
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.DateTime dateTime84 = dateMidnight81.toDateTime(chronology83);
        org.joda.time.DateTime dateTime86 = dateTime84.plusDays(9);
        int int87 = dateTime84.getEra();
        org.joda.time.DateTime dateTime88 = dateTime84.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone89 = dateTime88.getZone();
        long long92 = dateTimeZone89.adjustOffset((long) 5, true);
        mutableDateTime68.setZoneRetainFields(dateTimeZone89);
        java.util.TimeZone timeZone94 = dateTimeZone89.toTimeZone();
        boolean boolean95 = timeZone28.hasSameRules(timeZone94);
        org.joda.time.DateTimeZone dateTimeZone96 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTime dateTime97 = new org.joda.time.DateTime(0L, dateTimeZone96);
        org.joda.time.Instant instant98 = dateTime97.toInstant();
        int int99 = dateTime97.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight15 and instant98", (dateMidnight15.compareTo(instant98) == 0) == dateMidnight15.equals(instant98));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        org.joda.time.DateMidnight dateMidnight5 = yearMonthDay4.toDateMidnight();
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.DateMidnight.Property property8 = dateMidnight5.property(dateTimeFieldType7);
        java.lang.String str9 = dateTimeFieldType7.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and instant6", (dateMidnight5.compareTo(instant6) == 0) == dateMidnight5.equals(instant6));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(9);
        int int8 = dateTime5.getEra();
        int int9 = dateTime5.getSecondOfMinute();
        org.joda.time.DateTime.Property property10 = dateTime5.millisOfSecond();
        org.joda.time.DateTime.Property property11 = dateTime5.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.DateTime dateTime14 = dateTime5.withZone(dateTimeZone13);
        int int16 = dateTimeZone13.getOffsetFromLocal(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime14", (dateMidnight2.compareTo(dateTime14) == 0) == dateMidnight2.equals(dateTime14));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        java.util.Date date1 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromDateFields(date1);
        int int3 = timeOfDay2.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.minusMinutes(6);
        int int6 = timeOfDay2.size();
        org.joda.time.DateTime dateTime7 = timeOfDay2.toDateTimeToday();
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks(21);
        org.joda.time.Instant instant10 = dateTime7.toInstant();
        org.joda.time.DateTime.Property property11 = dateTime7.era();
        org.joda.time.DateTime dateTime12 = property11.roundCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant10", (dateTime7.compareTo(instant10) == 0) == dateTime7.equals(instant10));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        int int4 = dateMidnight2.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight2.withField(dateTimeFieldType5, 3);
        org.joda.time.Instant instant8 = dateMidnight7.toInstant();
        org.joda.time.YearMonthDay yearMonthDay9 = dateMidnight7.toYearMonthDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight7 and instant8", (dateMidnight7.compareTo(instant8) == 0) == dateMidnight7.equals(instant8));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.era();
        int int10 = dateMidnight8.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone12);
        int int14 = dateMidnight13.getEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateMidnight13.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks(0);
        org.joda.time.DateTime dateTime19 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime22 = dateTime18.withFieldAdded(durationFieldType20, 5);
        int int23 = dateMidnight8.compareTo((org.joda.time.ReadableInstant) dateTime22);
        int int24 = dateMidnight8.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone26);
        int int28 = dateMidnight27.getEra();
        org.joda.time.DateMidnight.Property property29 = dateMidnight27.monthOfYear();
        org.joda.time.DateMidnight dateMidnight30 = property29.roundHalfFloorCopy();
        java.lang.Object obj31 = null;
        java.util.TimeZone timeZone33 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(obj31, dateTimeZone34);
        long long39 = dateTimeZone34.convertLocalToUTC((-1996092050000L), true, (long) '4');
        org.joda.time.DateTime dateTime40 = dateMidnight30.toDateTime(dateTimeZone34);
        boolean boolean41 = dateMidnight8.isEqual((org.joda.time.ReadableInstant) dateMidnight30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime40", (dateMidnight2.compareTo(dateTime40) == 0) == dateMidnight2.equals(dateTime40));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDate localDate20 = dateMidnight19.toLocalDate();
        org.joda.time.LocalDate.Property property21 = localDate20.dayOfYear();
        org.joda.time.LocalDate localDate22 = property21.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate24 = localDate22.withWeekyear(11);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime29 = property27.roundFloor();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology33);
        org.joda.time.DateMidnight dateMidnight35 = yearMonthDay34.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight35.withDurationAdded((long) (byte) 10, 12);
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime29, (org.joda.time.ReadableInstant) dateMidnight35, periodType39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone42);
        int int44 = dateMidnight43.getEra();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = dateMidnight43.toDateTime(chronology45);
        org.joda.time.DateTime dateTime48 = dateTime46.plusDays(9);
        int int49 = dateTime46.getEra();
        org.joda.time.DateTime dateTime50 = dateTime46.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone51 = dateTime50.getZone();
        long long54 = dateTimeZone51.adjustOffset((long) 5, true);
        boolean boolean56 = dateTimeZone51.isStandardOffset((long) 3);
        mutableDateTime29.setZoneRetainFields(dateTimeZone51);
        org.joda.time.DateTime dateTime58 = localDate24.toDateTimeAtCurrentTime(dateTimeZone51);
        org.joda.time.DateTime dateTime60 = dateTime58.withWeekyear((int) (short) -1);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(chronology63);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.year();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plusSeconds((int) (byte) 10);
        org.joda.time.Chronology chronology70 = localDateTime69.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.monthOfYear();
        org.joda.time.DateTimeField dateTimeField72 = chronology70.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight73 = new org.joda.time.DateMidnight((long) 2004, chronology70);
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight((long) 10, chronology70);
        int int75 = dateTime58.compareTo((org.joda.time.ReadableInstant) dateMidnight74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight73", (dateMidnight2.compareTo(dateMidnight73) == 0) == dateMidnight2.equals(dateMidnight73));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.joda.time.Period period2 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.hours();
        java.lang.String str4 = durationFieldType3.toString();
        org.joda.time.Period period6 = period2.withField(durationFieldType3, 2);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone8);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(0L, 100L, periodType12, chronology13);
        java.lang.Object obj15 = mutablePeriod14.clone();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(0L, 100L, periodType18, chronology19);
        mutablePeriod14.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone23);
        org.joda.time.Duration duration25 = mutablePeriod14.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight9.plus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.LocalDate localDate27 = dateMidnight26.toLocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        java.lang.Object obj34 = mutablePeriod33.clone();
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(0L, 100L, periodType37, chronology38);
        mutablePeriod33.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod39);
        int int41 = mutablePeriod39.getMinutes();
        org.joda.time.Period period43 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.hours();
        java.lang.String str45 = durationFieldType44.toString();
        org.joda.time.Period period47 = period43.withField(durationFieldType44, 2);
        boolean boolean48 = mutablePeriod39.isSupported(durationFieldType44);
        long long51 = chronology28.add((org.joda.time.ReadablePeriod) mutablePeriod39, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.Chronology chronology53 = chronology28.withZone(dateTimeZone52);
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate(chronology53);
        org.joda.time.DurationField durationField55 = chronology53.halfdays();
        org.joda.time.DurationField durationField56 = durationFieldType3.getField(chronology53);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 11, chronology53);
        org.joda.time.DateTimeField dateTimeField58 = chronology53.centuryOfEra();
        org.joda.time.Period period60 = org.joda.time.Period.millis(7);
        org.joda.time.Period period62 = period60.minusDays(35);
        org.joda.time.MutablePeriod mutablePeriod63 = period60.toMutablePeriod();
        int[] intArray65 = chronology53.get((org.joda.time.ReadablePeriod) period60, 5L);
        org.joda.time.DurationField durationField66 = chronology53.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField66, durationField55, and durationField56", !(durationField66.compareTo(durationField55) == 0) || (Math.signum(durationField66.compareTo(durationField56)) == Math.signum(durationField55.compareTo(durationField56))));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(9);
        int int8 = dateTime5.getEra();
        int int9 = dateTime5.getSecondOfMinute();
        org.joda.time.DateTime.Property property10 = dateTime5.millisOfSecond();
        org.joda.time.DateTime.Property property11 = dateTime5.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.DateTime dateTime14 = dateTime5.withZone(dateTimeZone13);
        org.joda.time.DateTime.Property property15 = dateTime14.monthOfYear();
        org.joda.time.DurationField durationField16 = property15.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime14", (dateMidnight2.compareTo(dateTime14) == 0) == dateMidnight2.equals(dateTime14));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone2);
        int int4 = dateMidnight3.getEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateMidnight3.toDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(9);
        org.joda.time.DateTime dateTime9 = dateTime6.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime6.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone13);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(0L, 100L, periodType17, chronology18);
        java.lang.Object obj20 = mutablePeriod19.clone();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(0L, 100L, periodType23, chronology24);
        mutablePeriod19.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone28);
        org.joda.time.Duration duration30 = mutablePeriod19.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight29);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight14.plus((org.joda.time.ReadableDuration) duration30);
        org.joda.time.LocalDate localDate32 = dateMidnight31.toLocalDate();
        org.joda.time.Chronology chronology33 = localDate32.getChronology();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, 100L, periodType36, chronology37);
        java.lang.Object obj39 = mutablePeriod38.clone();
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(0L, 100L, periodType42, chronology43);
        mutablePeriod38.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod44);
        int int46 = mutablePeriod44.getMinutes();
        org.joda.time.Period period48 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.hours();
        java.lang.String str50 = durationFieldType49.toString();
        org.joda.time.Period period52 = period48.withField(durationFieldType49, 2);
        boolean boolean53 = mutablePeriod44.isSupported(durationFieldType49);
        long long56 = chronology33.add((org.joda.time.ReadablePeriod) mutablePeriod44, (long) 53230763, 2);
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) 11, chronology33);
        org.joda.time.DateTimeField dateTimeField58 = chronology33.era();
        org.joda.time.DateTime dateTime59 = dateTime10.withChronology(chronology33);
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight(333986344848147693L, chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and dateTime59", (dateMidnight3.compareTo(dateTime59) == 0) == dateMidnight3.equals(dateTime59));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0L, 100L, periodType2, chronology3);
        java.lang.Object obj5 = mutablePeriod4.clone();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone13);
        org.joda.time.Duration duration15 = mutablePeriod4.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight14);
        mutablePeriod4.addMillis(0);
        mutablePeriod4.setMonths(0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone21);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(0L, 100L, periodType25, chronology26);
        java.lang.Object obj28 = mutablePeriod27.clone();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone36);
        org.joda.time.Duration duration38 = mutablePeriod27.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight22.plus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(0L, 100L, periodType44, chronology45);
        java.lang.Object obj47 = mutablePeriod46.clone();
        java.lang.String str48 = mutablePeriod46.toString();
        mutableDateTime41.add((org.joda.time.ReadablePeriod) mutablePeriod46, 2022);
        mutablePeriod4.setPeriod((org.joda.time.ReadableInstant) dateMidnight39, (org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone53);
        int int55 = dateMidnight54.getEra();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = dateMidnight54.toDateTime(chronology56);
        org.joda.time.DateTime dateTime59 = dateTime57.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight60 = dateTime59.toDateMidnight();
        org.joda.time.DateMidnight.Property property61 = dateMidnight60.era();
        int int62 = dateMidnight60.getDayOfYear();
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight60.plusWeeks(70);
        org.joda.time.DateMidnight.Property property65 = dateMidnight64.year();
        boolean boolean67 = dateMidnight64.isBefore((long) 887);
        org.joda.time.DateTime dateTime68 = dateMidnight64.toDateTimeISO();
        org.joda.time.Interval interval69 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod4, (org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone71);
        int int73 = dateMidnight72.getEra();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateTime dateTime75 = dateMidnight72.toDateTime(chronology74);
        org.joda.time.DateTime dateTime77 = dateTime75.minusWeeks(0);
        org.joda.time.DateTime dateTime78 = dateTime77.withEarlierOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType79 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime81 = dateTime77.withFieldAdded(durationFieldType79, 5);
        org.joda.time.TimeOfDay timeOfDay82 = dateTime77.toTimeOfDay();
        org.joda.time.Instant instant83 = dateTime77.toInstant();
        org.joda.time.Interval interval84 = interval69.withEnd((org.joda.time.ReadableInstant) instant83);
        long long85 = interval84.getStartMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and instant83", (dateMidnight14.compareTo(instant83) == 0) == dateMidnight14.equals(instant83));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        int int5 = yearMonthDay4.size();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        java.lang.Object obj11 = mutablePeriod10.clone();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(0L, 100L, periodType14, chronology15);
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay4.plus((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime20 = yearMonthDay18.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone22);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(0L, 100L, periodType26, chronology27);
        java.lang.Object obj29 = mutablePeriod28.clone();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(0L, 100L, periodType32, chronology33);
        mutablePeriod28.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone37);
        org.joda.time.Duration duration39 = mutablePeriod28.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight38);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight23.plus((org.joda.time.ReadableDuration) duration39);
        org.joda.time.LocalDate localDate41 = dateMidnight40.toLocalDate();
        org.joda.time.Chronology chronology42 = localDate41.getChronology();
        java.lang.String str43 = chronology42.toString();
        org.joda.time.DateTimeField dateTimeField44 = chronology42.minuteOfHour();
        java.lang.String str45 = chronology42.toString();
        org.joda.time.DurationField durationField46 = chronology42.eras();
        org.joda.time.DateTime dateTime47 = dateTime20.toDateTime(chronology42);
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(0L, 100L, periodType52, chronology53);
        java.lang.Object obj55 = mutablePeriod54.clone();
        java.lang.String str56 = mutablePeriod54.toString();
        mutableDateTime49.add((org.joda.time.ReadablePeriod) mutablePeriod54, 2022);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime49.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone61);
        int int63 = dateMidnight62.getEra();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTime dateTime65 = dateMidnight62.toDateTime(chronology64);
        org.joda.time.DateTime dateTime67 = dateTime65.plusDays(9);
        int int68 = dateTime65.getEra();
        org.joda.time.DateTime dateTime69 = dateTime65.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone70 = dateTime69.getZone();
        long long73 = dateTimeZone70.adjustOffset((long) 5, true);
        mutableDateTime49.setZoneRetainFields(dateTimeZone70);
        java.util.TimeZone timeZone75 = dateTimeZone70.toTimeZone();
        int int77 = dateTimeZone70.getOffset((long) (short) 0);
        java.lang.String str78 = dateTimeZone70.getID();
        org.joda.time.DateTime dateTime79 = dateTime47.toDateTime(dateTimeZone70);
        int int81 = dateTimeZone70.getStandardOffset(113L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime79", (dateTime20.compareTo(dateTime79) == 0) == dateTime20.equals(dateTime79));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.LocalTime localTime9 = dateTime7.toLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.minusMinutes(3);
        org.joda.time.LocalTime localTime13 = localTime9.minusMillis((-1));
        org.joda.time.DateTime dateTime14 = localTime13.toDateTimeToday();
        int int15 = dateTime14.getMonthOfYear();
        org.joda.time.DateTime dateTime17 = dateTime14.plusMillis(0);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime14.toMutableDateTime();
        org.joda.time.DateTime dateTime20 = dateTime14.minusWeeks(50);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone22);
        int int24 = dateMidnight23.getEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateMidnight23.toDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime26.plusDays(9);
        org.joda.time.DateTime.Property property29 = dateTime26.monthOfYear();
        org.joda.time.DateTime dateTime31 = dateTime26.plusDays(0);
        org.joda.time.Period period36 = new org.joda.time.Period(12, 2, (int) ' ', (int) (short) 10);
        org.joda.time.Period period38 = period36.plusDays(1970);
        org.joda.time.Period period40 = period36.plusWeeks((int) '#');
        org.joda.time.DateTime dateTime42 = dateTime26.withPeriodAdded((org.joda.time.ReadablePeriod) period40, (-292275054));
        org.joda.time.Instant instant43 = dateTime42.toInstant();
        int int44 = dateTime20.compareTo((org.joda.time.ReadableInstant) instant43);
        org.joda.time.DateTime dateTime46 = dateTime20.plus(3913L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and instant43", (dateTime42.compareTo(instant43) == 0) == dateTime42.equals(instant43));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType6 = periodType5.withMillisRemoved();
        org.joda.time.Period period7 = new org.joda.time.Period((long) 10, (long) '#', periodType6);
        org.joda.time.Period period8 = new org.joda.time.Period((long) (short) 10, (long) 53233428, periodType6);
        org.joda.time.Duration duration9 = period8.toStandardDuration();
        java.lang.String str10 = duration9.toString();
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration9, 10223);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone14);
        int int16 = dateMidnight15.getEra();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = dateMidnight15.toDateTime(chronology17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks(0);
        org.joda.time.DateTime dateTime21 = dateTime20.withEarlierOffsetAtOverlap();
        org.joda.time.LocalTime localTime22 = dateTime20.toLocalTime();
        org.joda.time.LocalTime localTime24 = localTime22.minusMinutes(3);
        org.joda.time.LocalTime.Property property25 = localTime22.minuteOfHour();
        org.joda.time.LocalTime localTime26 = property25.withMinimumValue();
        org.joda.time.LocalTime localTime28 = property25.addCopy((int) ' ');
        org.joda.time.LocalTime localTime30 = property25.addNoWrapToCopy((int) '4');
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone32);
        int int34 = dateMidnight33.getEra();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = dateMidnight33.toDateTime(chronology35);
        org.joda.time.DateTime dateTime38 = dateTime36.minusWeeks(0);
        org.joda.time.DateTime dateTime39 = dateTime38.withEarlierOffsetAtOverlap();
        org.joda.time.LocalTime localTime40 = dateTime38.toLocalTime();
        org.joda.time.LocalTime localTime42 = localTime40.minusMinutes(3);
        org.joda.time.LocalTime.Property property43 = localTime40.minuteOfHour();
        org.joda.time.LocalTime localTime44 = property43.withMinimumValue();
        org.joda.time.LocalTime localTime46 = localTime44.withMinuteOfHour(47);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType48 = dateTimeFieldType47.getRangeDurationType();
        org.joda.time.LocalTime.Property property49 = localTime46.property(dateTimeFieldType47);
        org.joda.time.LocalTime localTime50 = property49.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime51 = property49.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime53 = property49.addCopy((-61725661916121L));
        int int54 = localTime30.compareTo((org.joda.time.ReadablePartial) localTime53);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone56);
        int int58 = dateMidnight57.getEra();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = dateMidnight57.toDateTime(chronology59);
        org.joda.time.DateTime dateTime62 = dateTime60.minusWeeks(0);
        org.joda.time.DateTime dateTime63 = dateTime62.withEarlierOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType64 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime66 = dateTime62.withFieldAdded(durationFieldType64, 5);
        org.joda.time.TimeOfDay timeOfDay67 = dateTime62.toTimeOfDay();
        org.joda.time.Instant instant68 = dateTime62.toInstant();
        org.joda.time.DateTime dateTime69 = localTime53.toDateTime((org.joda.time.ReadableInstant) instant68);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration9, (org.joda.time.ReadableInstant) dateTime69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight15 and instant68", (dateMidnight15.compareTo(instant68) == 0) == dateMidnight15.equals(instant68));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.DateMidnight.Property property4 = dateMidnight2.monthOfYear();
        org.joda.time.DateMidnight dateMidnight5 = property4.roundHalfFloorCopy();
        java.lang.Object obj6 = null;
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(obj6, dateTimeZone9);
        long long14 = dateTimeZone9.convertLocalToUTC((-1996092050000L), true, (long) '4');
        org.joda.time.DateTime dateTime15 = dateMidnight5.toDateTime(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight5.withYearOfEra(752);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and dateTime15", (dateMidnight5.compareTo(dateTime15) == 0) == dateMidnight5.equals(dateTime15));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(0L, 100L, periodType4, chronology5);
        java.lang.Object obj7 = mutablePeriod6.clone();
        java.lang.String str8 = mutablePeriod6.toString();
        mutableDateTime1.add((org.joda.time.ReadablePeriod) mutablePeriod6, 2022);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone12);
        int int14 = dateMidnight13.getEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateMidnight13.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusDays(9);
        int int19 = dateTime16.getEra();
        org.joda.time.DateTime dateTime20 = dateTime16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        java.lang.String str22 = dateTimeZone21.toString();
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone21);
        mutableDateTime1.setZoneRetainFields(dateTimeZone21);
        org.joda.time.Period period26 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.hours();
        java.lang.String str28 = durationFieldType27.toString();
        org.joda.time.Period period30 = period26.withField(durationFieldType27, 2);
        org.joda.time.Period period32 = period30.minusMinutes(21);
        org.joda.time.Days days33 = period30.toStandardDays();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, 100L, periodType36, chronology37);
        java.lang.Object obj39 = mutablePeriod38.clone();
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(0L, 100L, periodType42, chronology43);
        mutablePeriod38.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod44);
        int int46 = mutablePeriod44.getMinutes();
        org.joda.time.Period period47 = period30.plus((org.joda.time.ReadablePeriod) mutablePeriod44);
        org.joda.time.Period period48 = period47.normalizedStandard();
        mutableDateTime1.add((org.joda.time.ReadablePeriod) period48);
        org.joda.time.Instant instant50 = mutableDateTime1.toInstant();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone52);
        int int54 = dateMidnight53.getEra();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = dateMidnight53.toDateTime(chronology55);
        org.joda.time.DateTime dateTime58 = dateTime56.minusWeeks(0);
        org.joda.time.DateTime dateTime59 = dateTime58.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property60 = dateTime59.era();
        boolean boolean61 = instant50.isAfter((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTime dateTime63 = dateTime59.minusMonths(113);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant50", (mutableDateTime1.compareTo(instant50) == 0) == mutableDateTime1.equals(instant50));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfFloor();
        mutableDateTime3.setMonthOfYear(11);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        java.lang.Object obj14 = mutablePeriod13.clone();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(0L, 100L, periodType17, chronology18);
        mutablePeriod13.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone22);
        org.joda.time.Duration duration24 = mutablePeriod13.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight23);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight8.plus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.LocalDate localDate26 = dateMidnight25.toLocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(0L, 100L, periodType30, chronology31);
        java.lang.Object obj33 = mutablePeriod32.clone();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, 100L, periodType36, chronology37);
        mutablePeriod32.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod38);
        int int40 = mutablePeriod38.getMinutes();
        org.joda.time.Period period42 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.hours();
        java.lang.String str44 = durationFieldType43.toString();
        org.joda.time.Period period46 = period42.withField(durationFieldType43, 2);
        boolean boolean47 = mutablePeriod38.isSupported(durationFieldType43);
        long long50 = chronology27.add((org.joda.time.ReadablePeriod) mutablePeriod38, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.Chronology chronology52 = chronology27.withZone(dateTimeZone51);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(chronology52);
        org.joda.time.DurationField durationField54 = chronology52.halfdays();
        org.joda.time.DateTimeField dateTimeField55 = chronology52.secondOfMinute();
        int int56 = mutableDateTime3.get(dateTimeField55);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime3.minuteOfHour();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime3.millisOfSecond();
        org.joda.time.Instant instant59 = mutableDateTime3.toInstant();
        mutableDateTime3.setMinuteOfHour(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant59", (mutableDateTime3.compareTo(instant59) == 0) == mutableDateTime3.equals(instant59));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        int int4 = dateMidnight2.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight2.withField(dateTimeFieldType5, 3);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.minusDays((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateMidnight9.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone12);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(0L, 100L, periodType16, chronology17);
        java.lang.Object obj19 = mutablePeriod18.clone();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(0L, 100L, periodType22, chronology23);
        mutablePeriod18.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone27);
        org.joda.time.Duration duration29 = mutablePeriod18.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight13.plus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.LocalDate localDate31 = dateMidnight30.toLocalDate();
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(0L, 100L, periodType35, chronology36);
        java.lang.Object obj38 = mutablePeriod37.clone();
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(0L, 100L, periodType41, chronology42);
        mutablePeriod37.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod43);
        int int45 = mutablePeriod43.getMinutes();
        org.joda.time.Period period47 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.hours();
        java.lang.String str49 = durationFieldType48.toString();
        org.joda.time.Period period51 = period47.withField(durationFieldType48, 2);
        boolean boolean52 = mutablePeriod43.isSupported(durationFieldType48);
        long long55 = chronology32.add((org.joda.time.ReadablePeriod) mutablePeriod43, (long) 53230763, 2);
        org.joda.time.DateTimeField dateTimeField56 = chronology32.weekyearOfCentury();
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight9.withChronology(chronology32);
        org.joda.time.DateMidnight.Property property58 = dateMidnight9.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateMidnight57", (dateTime10.compareTo(dateMidnight57) == 0) == dateTime10.equals(dateMidnight57));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.era();
        int int10 = dateMidnight8.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone12);
        int int14 = dateMidnight13.getEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateMidnight13.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks(0);
        org.joda.time.DateTime dateTime19 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime22 = dateTime18.withFieldAdded(durationFieldType20, 5);
        int int23 = dateMidnight8.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime();
        int int25 = dateTime24.getDayOfMonth();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.hourOfDay();
        org.joda.time.DateTime dateTime29 = dateTime24.withFields((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.DateTime dateTime31 = dateTime24.minusDays(32772);
        org.joda.time.Instant instant32 = dateTime24.toInstant();
        int int33 = dateTime24.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant32", (dateTime24.compareTo(instant32) == 0) == dateTime24.equals(instant32));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        long long6 = dateTime5.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime5.withMillis(100L);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone10);
        int int12 = dateMidnight11.getEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateMidnight11.toDateTime(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusDays(9);
        int int17 = dateTime14.getEra();
        org.joda.time.DateTime dateTime18 = dateTime14.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTime dateTime20 = dateTime5.withZoneRetainFields(dateTimeZone19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.year();
        java.util.Locale locale26 = new java.util.Locale("hi!", "");
        java.lang.String str27 = property23.getAsText(locale26);
        org.joda.time.LocalDateTime localDateTime28 = property23.withMaximumValue();
        java.lang.String str29 = property23.toString();
        org.joda.time.DateTimeField dateTimeField30 = property23.getField();
        org.joda.time.LocalDateTime localDateTime31 = property23.withMinimumValue();
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.DateMidnight dateMidnight33 = org.joda.time.DateMidnight.now(chronology32);
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight((java.lang.Object) dateTime5, chronology32);
        long long39 = chronology32.getDateTimeMillis(6, 3, 8, 8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight34", (dateMidnight2.compareTo(dateMidnight34) == 0) == dateMidnight2.equals(dateMidnight34));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        java.util.Date date1 = new java.util.Date((long) 0);
        int int2 = date1.getDay();
        org.joda.time.YearMonthDay yearMonthDay3 = org.joda.time.YearMonthDay.fromDateFields(date1);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone6);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(0L, 100L, periodType10, chronology11);
        java.lang.Object obj13 = mutablePeriod12.clone();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(0L, 100L, periodType16, chronology17);
        mutablePeriod12.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone21);
        org.joda.time.Duration duration23 = mutablePeriod12.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight7.plus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.LocalDate localDate25 = dateMidnight24.toLocalDate();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(0L, 100L, periodType29, chronology30);
        java.lang.Object obj32 = mutablePeriod31.clone();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(0L, 100L, periodType35, chronology36);
        mutablePeriod31.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod37);
        int int39 = mutablePeriod37.getMinutes();
        org.joda.time.Period period41 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.hours();
        java.lang.String str43 = durationFieldType42.toString();
        org.joda.time.Period period45 = period41.withField(durationFieldType42, 2);
        boolean boolean46 = mutablePeriod37.isSupported(durationFieldType42);
        long long49 = chronology26.add((org.joda.time.ReadablePeriod) mutablePeriod37, (long) 53230763, 2);
        boolean boolean50 = durationFieldType4.isSupported(chronology26);
        org.joda.time.YearMonthDay yearMonthDay51 = yearMonthDay3.withChronologyRetainFields(chronology26);
        org.joda.time.YearMonthDay yearMonthDay53 = yearMonthDay51.minusYears(53233428);
        int int54 = yearMonthDay51.getMonthOfYear();
        org.joda.time.MutableDateTime mutableDateTime55 = org.joda.time.MutableDateTime.now();
        java.util.TimeZone timeZone57 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        mutableDateTime55.setZoneRetainFields(dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(dateTimeZone58);
        org.joda.time.DateMidnight dateMidnight61 = yearMonthDay51.toDateMidnight(dateTimeZone58);
        java.lang.String str62 = dateTimeZone58.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight7 and dateMidnight61", (dateMidnight7.compareTo(dateMidnight61) == 0) == dateMidnight7.equals(dateMidnight61));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.roundFloor();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology8);
        org.joda.time.DateMidnight dateMidnight10 = yearMonthDay9.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.withDurationAdded((long) (byte) 10, 12);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime4, (org.joda.time.ReadableInstant) dateMidnight10, periodType14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone17);
        int int19 = dateMidnight18.getEra();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = dateMidnight18.toDateTime(chronology20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusDays(9);
        int int24 = dateTime21.getEra();
        org.joda.time.DateTime dateTime25 = dateTime21.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        long long29 = dateTimeZone26.adjustOffset((long) 5, true);
        boolean boolean31 = dateTimeZone26.isStandardOffset((long) 3);
        mutableDateTime4.setZoneRetainFields(dateTimeZone26);
        mutableDateTime4.setTime(0L);
        int int35 = mutableDateTime4.getMonthOfYear();
        int int36 = mutableDateTime4.getWeekyear();
        mutableDateTime4.add((long) 31);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime4.year();
        org.joda.time.Instant instant40 = mutableDateTime4.toInstant();
        org.joda.time.DateTimeField dateTimeField41 = mutableDateTime4.getRoundingField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant40", (mutableDateTime4.compareTo(instant40) == 0) == mutableDateTime4.equals(instant40));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone7);
        int int9 = dateMidnight8.getEra();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateMidnight8.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusDays(9);
        int int14 = dateTime11.getEra();
        org.joda.time.DateTime dateTime15 = dateTime11.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        java.lang.String str17 = dateTimeZone16.toString();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((int) (byte) -1, 1, (int) (short) 1, (int) (short) 10, (int) (short) 0, 8, dateTimeZone16);
        org.joda.time.Period period21 = org.joda.time.Period.millis(7);
        org.joda.time.Period period23 = period21.minusDays(35);
        org.joda.time.MutablePeriod mutablePeriod24 = period21.toMutablePeriod();
        org.joda.time.Period period26 = period21.plusYears(2022);
        org.joda.time.Period period28 = period26.multipliedBy(22);
        org.joda.time.DateTime dateTime29 = dateTime19.plus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property31 = dateMidnight30.monthOfYear();
        org.joda.time.DateMidnight dateMidnight32 = property31.getDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone34);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(0L, 100L, periodType38, chronology39);
        java.lang.Object obj41 = mutablePeriod40.clone();
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(0L, 100L, periodType44, chronology45);
        mutablePeriod40.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod46);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone49);
        org.joda.time.Duration duration51 = mutablePeriod40.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight50);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight35.plus((org.joda.time.ReadableDuration) duration51);
        org.joda.time.LocalDate localDate53 = dateMidnight52.toLocalDate();
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        java.lang.String str55 = chronology54.toString();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.yearOfEra();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime58 = dateMidnight32.toMutableDateTime(chronology54);
        org.joda.time.DateTime dateTime59 = dateTime19.withChronology(chronology54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight30 and mutableDateTime58", (dateMidnight30.compareTo(mutableDateTime58) == 0) == dateMidnight30.equals(mutableDateTime58));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("0");
        org.joda.time.Chronology chronology2 = mutableDateTime1.getChronology();
        mutableDateTime1.setSecondOfDay((int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(0L, 100L, periodType9, chronology10);
        java.lang.Object obj12 = mutablePeriod11.clone();
        java.lang.String str13 = mutablePeriod11.toString();
        mutableDateTime6.add((org.joda.time.ReadablePeriod) mutablePeriod11, 2022);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime6.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone18);
        int int20 = dateMidnight19.getEra();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = dateMidnight19.toDateTime(chronology21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusDays(9);
        int int25 = dateTime22.getEra();
        org.joda.time.DateTime dateTime26 = dateTime22.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime26.getZone();
        long long30 = dateTimeZone27.adjustOffset((long) 5, true);
        mutableDateTime6.setZoneRetainFields(dateTimeZone27);
        java.util.TimeZone timeZone32 = dateTimeZone27.toTimeZone();
        long long34 = dateTimeZone27.convertUTCToLocal(53230963L);
        java.util.Locale locale36 = java.util.Locale.CHINA;
        java.lang.String str37 = dateTimeZone27.getName((long) 53243308, locale36);
        long long41 = dateTimeZone27.convertLocalToUTC((long) (byte) 0, false, (long) 53256552);
        java.lang.String str42 = dateTimeZone27.getID();
        mutableDateTime1.setZone(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours(57);
        org.joda.time.DateTime dateTime46 = mutableDateTime1.toDateTime(dateTimeZone45);
        long long50 = dateTimeZone45.convertLocalToUTC(0L, true, (long) 53097298);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime46", (mutableDateTime1.compareTo(dateTime46) == 0) == mutableDateTime1.equals(dateTime46));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.joda.time.Period period4 = new org.joda.time.Period(12, 2, (int) ' ', (int) (short) 10);
        org.joda.time.Period period6 = period4.plusDays(1970);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone8);
        int int10 = dateMidnight9.getEra();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateMidnight9.toDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusWeeks(0);
        org.joda.time.DateTime dateTime16 = dateTime12.withYear((int) (short) 10);
        org.joda.time.Duration duration17 = period4.toDurationTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime16.weekOfWeekyear();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) dateTime16);
        org.joda.time.DateTime dateTime21 = dateTime16.withMillis((long) 35);
        org.joda.time.Instant instant22 = dateTime16.toInstant();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType31 = periodType30.withMillisRemoved();
        org.joda.time.Period period32 = new org.joda.time.Period((long) 10, (long) '#', periodType31);
        org.joda.time.Period period33 = new org.joda.time.Period((long) (short) 10, (long) 53233428, periodType31);
        org.joda.time.Period period34 = new org.joda.time.Period((long) 2, periodType31);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone36);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(0L, 100L, periodType40, chronology41);
        java.lang.Object obj43 = mutablePeriod42.clone();
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(0L, 100L, periodType46, chronology47);
        mutablePeriod42.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod48);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone51);
        org.joda.time.Duration duration53 = mutablePeriod42.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight52);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight37.plus((org.joda.time.ReadableDuration) duration53);
        org.joda.time.LocalDate localDate55 = dateMidnight54.toLocalDate();
        org.joda.time.Chronology chronology56 = localDate55.getChronology();
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(0L, 100L, periodType59, chronology60);
        java.lang.Object obj62 = mutablePeriod61.clone();
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod(0L, 100L, periodType65, chronology66);
        mutablePeriod61.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod67);
        int int69 = mutablePeriod67.getMinutes();
        org.joda.time.Period period71 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType72 = org.joda.time.DurationFieldType.hours();
        java.lang.String str73 = durationFieldType72.toString();
        org.joda.time.Period period75 = period71.withField(durationFieldType72, 2);
        boolean boolean76 = mutablePeriod67.isSupported(durationFieldType72);
        long long79 = chronology56.add((org.joda.time.ReadablePeriod) mutablePeriod67, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone80 = null;
        org.joda.time.Chronology chronology81 = chronology56.withZone(dateTimeZone80);
        org.joda.time.LocalDate localDate82 = new org.joda.time.LocalDate(chronology81);
        org.joda.time.DurationField durationField83 = chronology81.halfdays();
        org.joda.time.DateTimeField dateTimeField84 = chronology81.secondOfMinute();
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((long) (-1), (long) 2922789, periodType31, chronology81);
        org.joda.time.DateTime dateTime87 = dateTime16.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod85, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant22", (dateTime19.compareTo(instant22) == 0) == dateTime19.equals(instant22));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        org.joda.time.Interval interval5 = yearMonthDay4.toInterval();
        org.joda.time.Period period6 = interval5.toPeriod();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology10);
        org.joda.time.Interval interval12 = yearMonthDay11.toInterval();
        org.joda.time.Period period13 = interval12.toPeriod();
        long long14 = interval12.getStartMillis();
        org.joda.time.Interval interval15 = interval5.overlap((org.joda.time.ReadableInterval) interval12);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone17);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(0L, 100L, periodType21, chronology22);
        java.lang.Object obj24 = mutablePeriod23.clone();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(0L, 100L, periodType27, chronology28);
        mutablePeriod23.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone32);
        org.joda.time.Duration duration34 = mutablePeriod23.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight18.plus((org.joda.time.ReadableDuration) duration34);
        org.joda.time.LocalDate localDate36 = dateMidnight35.toLocalDate();
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        java.lang.String str38 = chronology37.toString();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.secondOfDay();
        org.joda.time.Interval interval40 = interval5.withChronology(chronology37);
        org.joda.time.DateMidnight dateMidnight41 = org.joda.time.DateMidnight.now(chronology37);
        org.joda.time.DateTimeField dateTimeField42 = chronology37.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField43 = chronology37.monthOfYear();
        boolean boolean44 = dateTimeField43.isSupported();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone46);
        int int48 = dateMidnight47.getEra();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = dateMidnight47.toDateTime(chronology49);
        org.joda.time.DateTime dateTime52 = dateTime50.plusDays(9);
        int int53 = dateTime50.getEra();
        org.joda.time.DateTime dateTime54 = dateTime50.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone55 = dateTime54.getZone();
        java.lang.String str56 = dateTimeZone55.toString();
        org.joda.time.YearMonthDay yearMonthDay57 = new org.joda.time.YearMonthDay(dateTimeZone55);
        org.joda.time.DateTime dateTime58 = yearMonthDay57.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone62);
        int int64 = dateMidnight63.getEra();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = dateMidnight63.toDateTime(chronology65);
        org.joda.time.DateTime dateTime68 = dateTime66.plusDays(9);
        int int69 = dateTime66.getEra();
        org.joda.time.DateTime dateTime70 = dateTime66.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone71 = dateTime70.getZone();
        long long74 = dateTimeZone71.adjustOffset((long) 5, true);
        org.joda.time.LocalDate localDate75 = org.joda.time.LocalDate.now(dateTimeZone71);
        org.joda.time.DateTime dateTime76 = org.joda.time.DateTime.now(dateTimeZone71);
        long long79 = dateTimeZone71.adjustOffset((long) 9, false);
        org.joda.time.Interval interval80 = new org.joda.time.Interval((long) 1, 434L, dateTimeZone71);
        int int82 = dateTimeZone71.getOffset((long) 25);
        org.joda.time.DateTime dateTime83 = yearMonthDay57.toDateTimeAtCurrentTime(dateTimeZone71);
        org.joda.time.Chronology chronology88 = null;
        org.joda.time.YearMonthDay yearMonthDay89 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology88);
        int int90 = yearMonthDay89.getDayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay92 = yearMonthDay89.plusMonths(6);
        int[] intArray93 = yearMonthDay92.getValues();
        int[] intArray95 = dateTimeField43.add((org.joda.time.ReadablePartial) yearMonthDay57, 947, intArray93, (int) 'x');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight41 and dateTime58", (dateMidnight41.compareTo(dateTime58) == 0) == dateMidnight41.equals(dateTime58));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.era();
        int int10 = dateMidnight8.getDayOfYear();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight8.plusWeeks(70);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.year();
        boolean boolean15 = dateMidnight12.isBefore((long) 887);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone17);
        int int19 = dateMidnight18.getEra();
        int int20 = dateMidnight18.getMillisOfSecond();
        org.joda.time.Period period22 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.hours();
        java.lang.String str24 = durationFieldType23.toString();
        org.joda.time.Period period26 = period22.withField(durationFieldType23, 2);
        org.joda.time.Period period28 = period26.minusMinutes(21);
        org.joda.time.Interval interval29 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight18, (org.joda.time.ReadablePeriod) period28);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight12.minus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.LocalDate localDate31 = dateMidnight12.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone33);
        int int35 = dateMidnight34.getEra();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = dateMidnight34.toDateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusWeeks(0);
        org.joda.time.DateTime dateTime40 = dateTime39.withEarlierOffsetAtOverlap();
        org.joda.time.LocalTime localTime41 = dateTime39.toLocalTime();
        org.joda.time.LocalTime localTime43 = localTime41.minusMinutes(3);
        org.joda.time.LocalTime.Property property44 = localTime41.minuteOfHour();
        org.joda.time.LocalTime localTime45 = property44.withMinimumValue();
        org.joda.time.LocalTime localTime47 = localTime45.withMinuteOfHour(47);
        org.joda.time.Chronology chronology48 = localTime47.getChronology();
        org.joda.time.DateTime dateTime49 = localTime47.toDateTimeToday();
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.parse("0");
        org.joda.time.Chronology chronology52 = mutableDateTime51.getChronology();
        mutableDateTime51.setSecondOfDay((int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(0L, 100L, periodType59, chronology60);
        java.lang.Object obj62 = mutablePeriod61.clone();
        java.lang.String str63 = mutablePeriod61.toString();
        mutableDateTime56.add((org.joda.time.ReadablePeriod) mutablePeriod61, 2022);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime56.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone68);
        int int70 = dateMidnight69.getEra();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateTime dateTime72 = dateMidnight69.toDateTime(chronology71);
        org.joda.time.DateTime dateTime74 = dateTime72.plusDays(9);
        int int75 = dateTime72.getEra();
        org.joda.time.DateTime dateTime76 = dateTime72.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone77 = dateTime76.getZone();
        long long80 = dateTimeZone77.adjustOffset((long) 5, true);
        mutableDateTime56.setZoneRetainFields(dateTimeZone77);
        java.util.TimeZone timeZone82 = dateTimeZone77.toTimeZone();
        long long84 = dateTimeZone77.convertUTCToLocal(53230963L);
        java.util.Locale locale86 = java.util.Locale.CHINA;
        java.lang.String str87 = dateTimeZone77.getName((long) 53243308, locale86);
        long long91 = dateTimeZone77.convertLocalToUTC((long) (byte) 0, false, (long) 53256552);
        java.lang.String str92 = dateTimeZone77.getID();
        mutableDateTime51.setZone(dateTimeZone77);
        org.joda.time.DateTimeZone dateTimeZone95 = org.joda.time.DateTimeZone.forOffsetHours(57);
        org.joda.time.DateTime dateTime96 = mutableDateTime51.toDateTime(dateTimeZone95);
        org.joda.time.DateTime dateTime97 = localDate31.toDateTime(localTime47, dateTimeZone95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime51 and dateTime96", (mutableDateTime51.compareTo(dateTime96) == 0) == mutableDateTime51.equals(dateTime96));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.joda.time.Period period2 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.hours();
        java.lang.String str4 = durationFieldType3.toString();
        org.joda.time.Period period6 = period2.withField(durationFieldType3, 2);
        int int7 = period2.size();
        org.joda.time.MutablePeriod mutablePeriod8 = period2.toMutablePeriod();
        org.joda.time.PeriodType periodType9 = mutablePeriod8.getPeriodType();
        mutablePeriod8.setSeconds((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone14);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(0L, 100L, periodType18, chronology19);
        java.lang.Object obj21 = mutablePeriod20.clone();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(0L, 100L, periodType24, chronology25);
        mutablePeriod20.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone29);
        org.joda.time.Duration duration31 = mutablePeriod20.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight30);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight15.plus((org.joda.time.ReadableDuration) duration31);
        org.joda.time.LocalDate localDate33 = dateMidnight32.toLocalDate();
        org.joda.time.Chronology chronology34 = localDate33.getChronology();
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(0L, 100L, periodType37, chronology38);
        java.lang.Object obj40 = mutablePeriod39.clone();
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(0L, 100L, periodType43, chronology44);
        mutablePeriod39.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod45);
        int int47 = mutablePeriod45.getMinutes();
        org.joda.time.Period period49 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType50 = org.joda.time.DurationFieldType.hours();
        java.lang.String str51 = durationFieldType50.toString();
        org.joda.time.Period period53 = period49.withField(durationFieldType50, 2);
        boolean boolean54 = mutablePeriod45.isSupported(durationFieldType50);
        long long57 = chronology34.add((org.joda.time.ReadablePeriod) mutablePeriod45, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.Chronology chronology59 = chronology34.withZone(dateTimeZone58);
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate(chronology59);
        org.joda.time.DurationField durationField61 = chronology59.halfdays();
        org.joda.time.MutableDateTime mutableDateTime62 = org.joda.time.MutableDateTime.now(chronology59);
        mutablePeriod8.setPeriod((long) (byte) 10, chronology59);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) 21, chronology59);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone66);
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod(0L, 100L, periodType70, chronology71);
        java.lang.Object obj73 = mutablePeriod72.clone();
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod(0L, 100L, periodType76, chronology77);
        mutablePeriod72.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod78);
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.DateMidnight dateMidnight82 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone81);
        org.joda.time.Duration duration83 = mutablePeriod72.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight82);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight67.plus((org.joda.time.ReadableDuration) duration83);
        org.joda.time.LocalDate localDate85 = dateMidnight84.toLocalDate();
        org.joda.time.Chronology chronology86 = localDate85.getChronology();
        org.joda.time.DurationField durationField87 = chronology86.months();
        org.joda.time.DurationField durationField88 = chronology86.weeks();
        org.joda.time.DateTime dateTime89 = dateTime64.withChronology(chronology86);
        org.joda.time.Chronology chronology90 = chronology86.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime64 and dateTime89", (dateTime64.compareTo(dateTime89) == 0) == dateTime64.equals(dateTime89));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDate localDate20 = dateMidnight19.toLocalDate();
        org.joda.time.Period period22 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.hours();
        java.lang.String str24 = durationFieldType23.toString();
        org.joda.time.Period period26 = period22.withField(durationFieldType23, 2);
        org.joda.time.Period period28 = period26.withMillis((int) '#');
        org.joda.time.LocalDate localDate29 = localDate20.minus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.LocalDate localDate31 = localDate29.minusYears(11);
        org.joda.time.LocalDate localDate33 = localDate29.withDayOfMonth(13);
        org.joda.time.LocalDate localDate35 = localDate29.minusWeeks(69);
        org.joda.time.LocalDate localDate37 = localDate35.plusWeeks(53243434);
        int int38 = localDate37.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone40);
        int int42 = dateMidnight41.getEra();
        org.joda.time.DateMidnight.Property property43 = dateMidnight41.monthOfYear();
        org.joda.time.DateMidnight dateMidnight44 = property43.roundHalfFloorCopy();
        java.lang.Object obj45 = null;
        java.util.TimeZone timeZone47 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(obj45, dateTimeZone48);
        long long53 = dateTimeZone48.convertLocalToUTC((-1996092050000L), true, (long) '4');
        org.joda.time.DateTime dateTime54 = dateMidnight44.toDateTime(dateTimeZone48);
        org.joda.time.DateTime dateTime55 = localDate37.toDateTimeAtMidnight(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime54", (dateMidnight2.compareTo(dateTime54) == 0) == dateMidnight2.equals(dateTime54));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDate localDate20 = dateMidnight19.toLocalDate();
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        java.lang.String str22 = chronology21.toString();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.minuteOfHour();
        java.lang.String str25 = dateTimeField23.getAsText((long) (short) 100);
        int int27 = dateTimeField23.getMinimumValue((long) (byte) -1);
        int int29 = dateTimeField23.getLeapAmount(22L);
        long long31 = dateTimeField23.roundFloor((long) 13);
        int int33 = dateTimeField23.getLeapAmount(240000000L);
        int int35 = dateTimeField23.getMaximumValue((long) 12);
        java.util.Locale locale37 = java.util.Locale.JAPAN;
        java.lang.String str38 = dateTimeField23.getAsText(53238349, locale37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.year();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusSeconds((int) (byte) 10);
        org.joda.time.Chronology chronology46 = localDateTime45.getChronology();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withDayOfYear(12);
        int int49 = localDateTime48.getYearOfCentury();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(chronology52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.year();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusSeconds((int) (byte) 10);
        org.joda.time.Chronology chronology59 = localDateTime58.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.monthOfYear();
        org.joda.time.DateTimeField dateTimeField61 = chronology59.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) 2004, chronology59);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) 32769, chronology59);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(chronology64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.year();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime65.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.plusSeconds((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime68.withYearOfCentury(4);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.minusMinutes(11);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.minusWeeks(10);
        int[] intArray78 = chronology59.get((org.joda.time.ReadablePartial) localDateTime76, (long) 53489781);
        int int79 = dateTimeField23.getMinimumValue((org.joda.time.ReadablePartial) localDateTime48, intArray78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight62", (dateMidnight2.compareTo(dateMidnight62) == 0) == dateMidnight2.equals(dateMidnight62));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.withMillis(53230963L);
        org.joda.time.Instant instant22 = dateMidnight19.toInstant();
        int int23 = dateMidnight19.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight19 and instant22", (dateMidnight19.compareTo(instant22) == 0) == dateMidnight19.equals(instant22));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.secondOfDay();
        java.lang.String str4 = property3.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.add((long) 15);
        java.util.GregorianCalendar gregorianCalendar7 = mutableDateTime6.toGregorianCalendar();
        mutableDateTime6.addMillis(2004);
        mutableDateTime6.addWeekyears(19);
        org.joda.time.Instant instant12 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime6.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant12", (mutableDateTime6.compareTo(instant12) == 0) == mutableDateTime6.equals(instant12));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.era();
        int int10 = dateMidnight8.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone12);
        int int14 = dateMidnight13.getEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateMidnight13.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks(0);
        org.joda.time.DateTime dateTime19 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime22 = dateTime18.withFieldAdded(durationFieldType20, 5);
        int int23 = dateMidnight8.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone26);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(0L, 100L, periodType30, chronology31);
        java.lang.Object obj33 = mutablePeriod32.clone();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, 100L, periodType36, chronology37);
        mutablePeriod32.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone41);
        org.joda.time.Duration duration43 = mutablePeriod32.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight27.plus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.LocalDate localDate45 = dateMidnight44.toLocalDate();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(0L, 100L, periodType49, chronology50);
        java.lang.Object obj52 = mutablePeriod51.clone();
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(0L, 100L, periodType55, chronology56);
        mutablePeriod51.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod57);
        int int59 = mutablePeriod57.getMinutes();
        org.joda.time.Period period61 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType62 = org.joda.time.DurationFieldType.hours();
        java.lang.String str63 = durationFieldType62.toString();
        org.joda.time.Period period65 = period61.withField(durationFieldType62, 2);
        boolean boolean66 = mutablePeriod57.isSupported(durationFieldType62);
        long long69 = chronology46.add((org.joda.time.ReadablePeriod) mutablePeriod57, (long) 53230763, 2);
        org.joda.time.DurationField durationField70 = chronology46.seconds();
        org.joda.time.DateTime dateTime71 = dateTime22.withChronology(chronology46);
        org.joda.time.DateTime.Property property72 = dateTime71.millisOfSecond();
        org.joda.time.DateTime.Property property73 = dateTime71.dayOfMonth();
        java.util.Locale locale76 = new java.util.Locale("hi!", "");
        java.lang.String str77 = locale76.getDisplayVariant();
        boolean boolean78 = locale76.hasExtensions();
        java.lang.String str79 = locale76.getDisplayName();
        java.util.Locale.setDefault(locale76);
        java.lang.String str81 = locale76.getDisplayCountry();
        java.lang.String str82 = locale76.getDisplayCountry();
        java.util.Calendar calendar83 = java.util.Calendar.getInstance(locale76);
        java.lang.String str84 = property73.getAsText(locale76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime71", (dateTime22.compareTo(dateTime71) == 0) == dateTime22.equals(dateTime71));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(9);
        org.joda.time.DateTime.Property property8 = dateTime5.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime5.plusDays(0);
        org.joda.time.Period period15 = new org.joda.time.Period(12, 2, (int) ' ', (int) (short) 10);
        org.joda.time.Period period17 = period15.plusDays(1970);
        org.joda.time.Period period19 = period15.plusWeeks((int) '#');
        org.joda.time.DateTime dateTime21 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period19, (-292275054));
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        org.joda.time.DateTime.Property property23 = dateTime21.dayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime21.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone26);
        int int28 = dateMidnight27.getEra();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateMidnight27.toDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = dateTime30.plusDays(9);
        org.joda.time.DateTime.Property property33 = dateTime30.monthOfYear();
        org.joda.time.DateTime dateTime34 = dateTime30.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime35 = dateTime30.toDateTime();
        boolean boolean36 = dateTime24.isEqual((org.joda.time.ReadableInstant) dateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant22", (dateTime24.compareTo(instant22) == 0) == dateTime24.equals(instant22));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(9);
        org.joda.time.DateTime.Property property8 = dateTime5.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime5.plusDays(0);
        org.joda.time.DateTime dateTime11 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property12 = dateTime10.yearOfEra();
        org.joda.time.Instant instant13 = dateTime10.toInstant();
        int int14 = dateTime10.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and instant13", (dateMidnight2.compareTo(instant13) == 0) == dateMidnight2.equals(instant13));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDate localDate20 = dateMidnight19.toLocalDate();
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(0L, 100L, periodType24, chronology25);
        java.lang.Object obj27 = mutablePeriod26.clone();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(0L, 100L, periodType30, chronology31);
        mutablePeriod26.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod32);
        int int34 = mutablePeriod32.getMinutes();
        org.joda.time.Period period36 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.hours();
        java.lang.String str38 = durationFieldType37.toString();
        org.joda.time.Period period40 = period36.withField(durationFieldType37, 2);
        boolean boolean41 = mutablePeriod32.isSupported(durationFieldType37);
        long long44 = chronology21.add((org.joda.time.ReadablePeriod) mutablePeriod32, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.Chronology chronology46 = chronology21.withZone(dateTimeZone45);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(chronology46);
        org.joda.time.DurationField durationField48 = chronology46.halfdays();
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(chronology46);
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(chronology46);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime50.hourOfDay();
        org.joda.time.Instant instant52 = mutableDateTime50.toInstant();
        java.util.Date date53 = mutableDateTime50.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime49 and instant52", (mutableDateTime49.compareTo(instant52) == 0) == mutableDateTime49.equals(instant52));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateTime dateTime9 = dateTime5.withYear((int) (short) 10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusDays(53230763);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology15);
        int int17 = yearMonthDay16.size();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone25);
        int int27 = dateMidnight26.getEra();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = dateMidnight26.toDateTime(chronology28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusDays(9);
        int int32 = dateTime29.getEra();
        org.joda.time.DateTime dateTime33 = dateTime29.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime33.getZone();
        java.lang.String str35 = dateTimeZone34.toString();
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((int) (byte) -1, 1, (int) (short) 1, (int) (short) 10, (int) (short) 0, 8, dateTimeZone34);
        java.lang.String str38 = dateTimeZone34.toString();
        org.joda.time.Interval interval39 = yearMonthDay16.toInterval(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime11.toMutableDateTime(dateTimeZone34);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology44);
        org.joda.time.Interval interval46 = yearMonthDay45.toInterval();
        org.joda.time.Period period47 = interval46.toPeriod();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology51);
        org.joda.time.Interval interval53 = yearMonthDay52.toInterval();
        org.joda.time.Period period54 = interval53.toPeriod();
        long long55 = interval53.getStartMillis();
        org.joda.time.Interval interval56 = interval46.overlap((org.joda.time.ReadableInterval) interval53);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone58);
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(0L, 100L, periodType62, chronology63);
        java.lang.Object obj65 = mutablePeriod64.clone();
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod(0L, 100L, periodType68, chronology69);
        mutablePeriod64.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod70);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone73);
        org.joda.time.Duration duration75 = mutablePeriod64.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight74);
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight59.plus((org.joda.time.ReadableDuration) duration75);
        org.joda.time.LocalDate localDate77 = dateMidnight76.toLocalDate();
        org.joda.time.Chronology chronology78 = localDate77.getChronology();
        java.lang.String str79 = chronology78.toString();
        org.joda.time.DateTimeField dateTimeField80 = chronology78.secondOfDay();
        org.joda.time.Interval interval81 = interval46.withChronology(chronology78);
        org.joda.time.DateTimeField dateTimeField82 = chronology78.millisOfDay();
        org.joda.time.LocalDate localDate83 = new org.joda.time.LocalDate(chronology78);
        mutableDateTime40.setChronology(chronology78);
        org.joda.time.DurationField durationField85 = chronology78.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime40", (dateTime11.compareTo(mutableDateTime40) == 0) == dateTime11.equals(mutableDateTime40));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        org.joda.time.Interval interval5 = yearMonthDay4.toInterval();
        org.joda.time.Period period6 = interval5.toPeriod();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology10);
        org.joda.time.Interval interval12 = yearMonthDay11.toInterval();
        org.joda.time.Period period13 = interval12.toPeriod();
        long long14 = interval12.getStartMillis();
        org.joda.time.Interval interval15 = interval5.overlap((org.joda.time.ReadableInterval) interval12);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology19);
        org.joda.time.Interval interval21 = yearMonthDay20.toInterval();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.Interval interval23 = interval21.withPeriodBeforeEnd(readablePeriod22);
        boolean boolean24 = interval5.overlaps((org.joda.time.ReadableInterval) interval23);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology28);
        org.joda.time.Interval interval30 = yearMonthDay29.toInterval();
        org.joda.time.Period period31 = interval30.toPeriod();
        boolean boolean33 = interval30.isAfter(100L);
        boolean boolean34 = interval23.isAfter((org.joda.time.ReadableInterval) interval30);
        org.joda.time.Interval interval35 = interval23.toInterval();
        long long36 = interval23.getEndMillis();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone38);
        int int40 = dateMidnight39.getEra();
        int int41 = dateMidnight39.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight39.withField(dateTimeFieldType42, 3);
        org.joda.time.Instant instant45 = dateMidnight44.toInstant();
        boolean boolean46 = interval23.isBefore((org.joda.time.ReadableInstant) dateMidnight44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight44 and instant45", (dateMidnight44.compareTo(instant45) == 0) == dateMidnight44.equals(instant45));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.era();
        int int10 = dateMidnight8.getDayOfYear();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight8.plusWeeks(70);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight8.minusWeeks((int) ' ');
        java.util.GregorianCalendar gregorianCalendar15 = dateMidnight14.toGregorianCalendar();
        gregorianCalendar15.setFirstDayOfWeek(53243063);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) gregorianCalendar15);
        gregorianCalendar15.setFirstDayOfWeek(53579);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and dateTime18", (dateMidnight14.compareTo(dateTime18) == 0) == dateMidnight14.equals(dateTime18));
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withChronology(chronology4);
        org.joda.time.DurationField durationField7 = chronology4.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight6", (dateMidnight2.compareTo(dateMidnight6) == 0) == dateMidnight2.equals(dateMidnight6));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateMidnight2.toLocalDate();
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks(100);
        org.joda.time.Chronology chronology6 = localDate3.getChronology();
        org.joda.time.LocalDate.Property property7 = localDate3.yearOfCentury();
        org.joda.time.LocalDate localDate9 = localDate3.plusDays((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone12);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(0L, 100L, periodType16, chronology17);
        java.lang.Object obj19 = mutablePeriod18.clone();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(0L, 100L, periodType22, chronology23);
        mutablePeriod18.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone27);
        org.joda.time.Duration duration29 = mutablePeriod18.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight13.plus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.LocalDate localDate31 = dateMidnight30.toLocalDate();
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(0L, 100L, periodType35, chronology36);
        java.lang.Object obj38 = mutablePeriod37.clone();
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(0L, 100L, periodType41, chronology42);
        mutablePeriod37.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod43);
        int int45 = mutablePeriod43.getMinutes();
        org.joda.time.Period period47 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.hours();
        java.lang.String str49 = durationFieldType48.toString();
        org.joda.time.Period period51 = period47.withField(durationFieldType48, 2);
        boolean boolean52 = mutablePeriod43.isSupported(durationFieldType48);
        long long55 = chronology32.add((org.joda.time.ReadablePeriod) mutablePeriod43, (long) 53230763, 2);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.Chronology chronology57 = chronology32.withZone(dateTimeZone56);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 11, chronology57);
        org.joda.time.DurationField durationField59 = chronology57.days();
        org.joda.time.DurationFieldType durationFieldType60 = durationField59.getType();
        boolean boolean61 = localDate3.isSupported(durationFieldType60);
        org.joda.time.LocalTime localTime63 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology64 = localTime63.getChronology();
        org.joda.time.DurationField durationField65 = chronology64.days();
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight(758L, chronology64);
        boolean boolean67 = durationFieldType60.isSupported(chronology64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight66", (dateMidnight2.compareTo(dateMidnight66) == 0) == dateMidnight2.equals(dateMidnight66));
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        org.joda.time.DateMidnight dateMidnight5 = yearMonthDay4.toDateMidnight();
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.DateMidnight.Property property8 = dateMidnight5.property(dateTimeFieldType7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight5.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and instant6", (dateMidnight5.compareTo(instant6) == 0) == dateMidnight5.equals(instant6));
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.era();
        int int10 = dateMidnight8.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone12);
        int int14 = dateMidnight13.getEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateMidnight13.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks(0);
        org.joda.time.DateTime dateTime19 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime22 = dateTime18.withFieldAdded(durationFieldType20, 5);
        int int23 = dateMidnight8.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone26);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(0L, 100L, periodType30, chronology31);
        java.lang.Object obj33 = mutablePeriod32.clone();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, 100L, periodType36, chronology37);
        mutablePeriod32.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone41);
        org.joda.time.Duration duration43 = mutablePeriod32.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight27.plus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.LocalDate localDate45 = dateMidnight44.toLocalDate();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(0L, 100L, periodType49, chronology50);
        java.lang.Object obj52 = mutablePeriod51.clone();
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(0L, 100L, periodType55, chronology56);
        mutablePeriod51.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod57);
        int int59 = mutablePeriod57.getMinutes();
        org.joda.time.Period period61 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType62 = org.joda.time.DurationFieldType.hours();
        java.lang.String str63 = durationFieldType62.toString();
        org.joda.time.Period period65 = period61.withField(durationFieldType62, 2);
        boolean boolean66 = mutablePeriod57.isSupported(durationFieldType62);
        long long69 = chronology46.add((org.joda.time.ReadablePeriod) mutablePeriod57, (long) 53230763, 2);
        org.joda.time.DurationField durationField70 = chronology46.seconds();
        org.joda.time.DateTime dateTime71 = dateTime22.withChronology(chronology46);
        java.lang.String str72 = chronology46.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime71", (dateTime22.compareTo(dateTime71) == 0) == dateTime22.equals(dateTime71));
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(9);
        int int8 = dateTime5.getEra();
        int int9 = dateTime5.getSecondOfMinute();
        org.joda.time.DateTime.Property property10 = dateTime5.millisOfSecond();
        org.joda.time.DateTime.Property property11 = dateTime5.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.DateTime dateTime14 = dateTime5.withZone(dateTimeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime14", (dateMidnight2.compareTo(dateTime14) == 0) == dateMidnight2.equals(dateTime14));
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.joda.time.Period period5 = new org.joda.time.Period(12, 2, (int) ' ', (int) (short) 10);
        org.joda.time.Period period7 = period5.plusDays(1970);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone9);
        int int11 = dateMidnight10.getEra();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateMidnight10.toDateTime(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusWeeks(0);
        org.joda.time.DateTime dateTime17 = dateTime13.withYear((int) (short) 10);
        org.joda.time.Duration duration18 = period5.toDurationTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime17, readableInstant19);
        java.lang.String str22 = dateTime17.toString("19");
        org.joda.time.Instant instant23 = dateTime17.toInstant();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology27);
        org.joda.time.Interval interval29 = yearMonthDay28.toInterval();
        org.joda.time.DateTime dateTime30 = yearMonthDay28.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime.Property property32 = dateTime30.property(dateTimeFieldType31);
        org.joda.time.DateTime.Property property33 = dateTime30.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone35);
        int int37 = dateMidnight36.getEra();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = dateMidnight36.toDateTime(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime39.plusDays(9);
        int int42 = dateTime39.getEra();
        org.joda.time.DateTime dateTime43 = dateTime39.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone44 = dateTime43.getZone();
        java.lang.String str45 = dateTimeZone44.toString();
        org.joda.time.DateTime dateTime46 = dateTime30.toDateTime(dateTimeZone44);
        int int48 = dateTimeZone44.getStandardOffset((-1L));
        org.joda.time.DateTime dateTime49 = dateTime17.toDateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) 282, dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant23", (dateTime17.compareTo(instant23) == 0) == dateTime17.equals(instant23));
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone2);
        int int4 = dateMidnight3.getEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateMidnight3.toDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(9);
        int int9 = dateTime6.getEra();
        int int10 = dateTime6.getSecondOfMinute();
        org.joda.time.DateTime dateTime12 = dateTime6.withCenturyOfEra(0);
        org.joda.time.DateTime dateTime14 = dateTime6.plusDays(8);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(0L, dateTimeZone16);
        org.joda.time.LocalDate localDate18 = dateMidnight17.toLocalDate();
        org.joda.time.DateMidnight.Property property19 = dateMidnight17.era();
        int int20 = dateMidnight17.getWeekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight17.plusWeeks((int) (byte) 0);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.withYearOfCentury(8);
        boolean boolean25 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.DateTime.Property property26 = dateTime6.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone30);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(0L, 100L, periodType34, chronology35);
        java.lang.Object obj37 = mutablePeriod36.clone();
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(0L, 100L, periodType40, chronology41);
        mutablePeriod36.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone45);
        org.joda.time.Duration duration47 = mutablePeriod36.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight46);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight31.plus((org.joda.time.ReadableDuration) duration47);
        org.joda.time.LocalDate localDate49 = dateMidnight48.toLocalDate();
        org.joda.time.Chronology chronology50 = localDate49.getChronology();
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(0L, 100L, periodType53, chronology54);
        java.lang.Object obj56 = mutablePeriod55.clone();
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(0L, 100L, periodType59, chronology60);
        mutablePeriod55.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod61);
        int int63 = mutablePeriod61.getMinutes();
        org.joda.time.Period period65 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType66 = org.joda.time.DurationFieldType.hours();
        java.lang.String str67 = durationFieldType66.toString();
        org.joda.time.Period period69 = period65.withField(durationFieldType66, 2);
        boolean boolean70 = mutablePeriod61.isSupported(durationFieldType66);
        long long73 = chronology50.add((org.joda.time.ReadablePeriod) mutablePeriod61, (long) 53230763, 2);
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate((long) 11, chronology50);
        org.joda.time.DateTimeField dateTimeField75 = chronology50.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField76 = chronology50.era();
        org.joda.time.DateTimeField dateTimeField77 = chronology50.weekOfWeekyear();
        org.joda.time.LocalDate localDate78 = new org.joda.time.LocalDate(0L, chronology50);
        org.joda.time.DurationField durationField79 = chronology50.minutes();
        org.joda.time.DateTimeField dateTimeField80 = chronology50.weekOfWeekyear();
        org.joda.time.DateTime dateTime81 = dateTime6.toDateTime(chronology50);
        org.joda.time.TimeOfDay timeOfDay82 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 40, chronology50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and dateTime81", (dateMidnight3.compareTo(dateTime81) == 0) == dateMidnight3.equals(dateTime81));
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology4);
        int int6 = yearMonthDay5.size();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(0L, 100L, periodType9, chronology10);
        java.lang.Object obj12 = mutablePeriod11.clone();
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(0L, 100L, periodType15, chronology16);
        mutablePeriod11.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay5.plus((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime21 = yearMonthDay19.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(84281419341000L, dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(0L, 100L, periodType27, chronology28);
        java.lang.Object obj30 = mutablePeriod29.clone();
        java.lang.String str31 = mutablePeriod29.toString();
        mutableDateTime24.add((org.joda.time.ReadablePeriod) mutablePeriod29, 2022);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime24.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone36);
        int int38 = dateMidnight37.getEra();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = dateMidnight37.toDateTime(chronology39);
        org.joda.time.DateTime dateTime42 = dateTime40.plusDays(9);
        int int43 = dateTime40.getEra();
        org.joda.time.DateTime dateTime44 = dateTime40.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone45 = dateTime44.getZone();
        long long48 = dateTimeZone45.adjustOffset((long) 5, true);
        mutableDateTime24.setZoneRetainFields(dateTimeZone45);
        java.util.TimeZone timeZone50 = dateTimeZone45.toTimeZone();
        long long52 = dateTimeZone45.convertUTCToLocal(53230963L);
        java.util.Locale locale54 = java.util.Locale.CHINA;
        java.lang.String str55 = dateTimeZone45.getName((long) 53243308, locale54);
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(dateTimeZone45);
        org.joda.time.DateTime dateTime57 = dateTime22.withZone(dateTimeZone45);
        long long59 = dateTimeZone45.convertUTCToLocal((long) 53292560);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime57", (dateTime22.compareTo(dateTime57) == 0) == dateTime22.equals(dateTime57));
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.era();
        int int10 = dateMidnight8.getDayOfYear();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight8.plusWeeks(70);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight8.minusWeeks((int) ' ');
        java.util.GregorianCalendar gregorianCalendar15 = dateMidnight14.toGregorianCalendar();
        gregorianCalendar15.setFirstDayOfWeek(53243063);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) gregorianCalendar15);
        int int20 = gregorianCalendar15.getActualMaximum(8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and dateTime18", (dateMidnight14.compareTo(dateTime18) == 0) == dateMidnight14.equals(dateTime18));
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology3);
        int int5 = yearMonthDay4.size();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        java.lang.Object obj11 = mutablePeriod10.clone();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(0L, 100L, periodType14, chronology15);
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay4.plus((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime20 = yearMonthDay18.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone22);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(0L, 100L, periodType26, chronology27);
        java.lang.Object obj29 = mutablePeriod28.clone();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(0L, 100L, periodType32, chronology33);
        mutablePeriod28.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone37);
        org.joda.time.Duration duration39 = mutablePeriod28.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight38);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight23.plus((org.joda.time.ReadableDuration) duration39);
        org.joda.time.LocalDate localDate41 = dateMidnight40.toLocalDate();
        org.joda.time.Chronology chronology42 = localDate41.getChronology();
        java.lang.String str43 = chronology42.toString();
        org.joda.time.DateTimeField dateTimeField44 = chronology42.minuteOfHour();
        java.lang.String str45 = chronology42.toString();
        org.joda.time.DurationField durationField46 = chronology42.eras();
        org.joda.time.DateTime dateTime47 = dateTime20.toDateTime(chronology42);
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(0L, 100L, periodType52, chronology53);
        java.lang.Object obj55 = mutablePeriod54.clone();
        java.lang.String str56 = mutablePeriod54.toString();
        mutableDateTime49.add((org.joda.time.ReadablePeriod) mutablePeriod54, 2022);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime49.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone61);
        int int63 = dateMidnight62.getEra();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTime dateTime65 = dateMidnight62.toDateTime(chronology64);
        org.joda.time.DateTime dateTime67 = dateTime65.plusDays(9);
        int int68 = dateTime65.getEra();
        org.joda.time.DateTime dateTime69 = dateTime65.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone70 = dateTime69.getZone();
        long long73 = dateTimeZone70.adjustOffset((long) 5, true);
        mutableDateTime49.setZoneRetainFields(dateTimeZone70);
        java.util.TimeZone timeZone75 = dateTimeZone70.toTimeZone();
        int int77 = dateTimeZone70.getOffset((long) (short) 0);
        java.lang.String str78 = dateTimeZone70.getID();
        org.joda.time.DateTime dateTime79 = dateTime47.toDateTime(dateTimeZone70);
        boolean boolean80 = dateTimeZone70.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime79", (dateTime20.compareTo(dateTime79) == 0) == dateTime20.equals(dateTime79));
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(9);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra(3);
        org.joda.time.DateTime dateTime11 = dateTime9.plusWeeks(32770);
        org.joda.time.Instant instant12 = dateTime9.toInstant();
        org.joda.time.DateTime dateTime14 = dateTime9.minusWeeks(36008);
        org.joda.time.DateTime dateTime16 = dateTime14.minus((-59968684797996L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant12", (dateTime9.compareTo(instant12) == 0) == dateTime9.equals(instant12));
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.era();
        int int10 = dateMidnight8.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone12);
        int int14 = dateMidnight13.getEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateMidnight13.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks(0);
        org.joda.time.DateTime dateTime19 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime22 = dateTime18.withFieldAdded(durationFieldType20, 5);
        int int23 = dateMidnight8.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime();
        int int25 = dateTime24.getDayOfMonth();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.hourOfDay();
        org.joda.time.DateTime dateTime29 = dateTime24.withFields((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.DateTime dateTime31 = dateTime24.minusDays(32772);
        org.joda.time.Instant instant32 = dateTime24.toInstant();
        org.joda.time.Period period34 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.Period period36 = period34.plusMonths((int) 'a');
        org.joda.time.Period period38 = period36.withHours(245);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadablePeriod) period36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant32", (dateTime24.compareTo(instant32) == 0) == dateTime24.equals(instant32));
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusDays(9);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra(3);
        org.joda.time.DateTime dateTime11 = dateTime9.plusWeeks(32770);
        org.joda.time.Instant instant12 = dateTime9.toInstant();
        org.joda.time.DateTime dateTime14 = dateTime9.minusWeeks(36008);
        int int15 = dateTime14.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant12", (dateTime9.compareTo(instant12) == 0) == dateTime9.equals(instant12));
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType2 = periodType1.withSecondsRemoved();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology6);
        org.joda.time.Interval interval8 = yearMonthDay7.toInterval();
        org.joda.time.Period period9 = interval8.toPeriod();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology13);
        org.joda.time.Interval interval15 = yearMonthDay14.toInterval();
        org.joda.time.Period period16 = interval15.toPeriod();
        long long17 = interval15.getStartMillis();
        org.joda.time.Interval interval18 = interval8.overlap((org.joda.time.ReadableInterval) interval15);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone20);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(0L, 100L, periodType24, chronology25);
        java.lang.Object obj27 = mutablePeriod26.clone();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(0L, 100L, periodType30, chronology31);
        mutablePeriod26.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone35);
        org.joda.time.Duration duration37 = mutablePeriod26.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight36);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight21.plus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.LocalDate localDate39 = dateMidnight38.toLocalDate();
        org.joda.time.Chronology chronology40 = localDate39.getChronology();
        java.lang.String str41 = chronology40.toString();
        org.joda.time.DateTimeField dateTimeField42 = chronology40.secondOfDay();
        org.joda.time.Interval interval43 = interval8.withChronology(chronology40);
        boolean boolean44 = periodType2.equals((java.lang.Object) interval43);
        org.joda.time.PeriodType periodType45 = periodType2.withMinutesRemoved();
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(10L);
        org.joda.time.Chronology chronology49 = yearMonthDay48.getChronology();
        org.joda.time.DurationField durationField50 = chronology49.years();
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight((long) 82800100, chronology49);
        org.joda.time.Period period52 = new org.joda.time.Period((long) (-10215), periodType45, chronology49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight21 and dateMidnight51", (dateMidnight21.compareTo(dateMidnight51) == 0) == dateMidnight21.equals(dateMidnight51));
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0L, 100L, periodType2, chronology3);
        java.lang.Object obj5 = mutablePeriod4.clone();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0L, 100L, periodType8, chronology9);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone13);
        org.joda.time.Duration duration15 = mutablePeriod4.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight14);
        mutablePeriod4.addMillis(0);
        mutablePeriod4.setMonths(0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone21);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(0L, 100L, periodType25, chronology26);
        java.lang.Object obj28 = mutablePeriod27.clone();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, 100L, periodType31, chronology32);
        mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone36);
        org.joda.time.Duration duration38 = mutablePeriod27.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight22.plus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(0L, 100L, periodType44, chronology45);
        java.lang.Object obj47 = mutablePeriod46.clone();
        java.lang.String str48 = mutablePeriod46.toString();
        mutableDateTime41.add((org.joda.time.ReadablePeriod) mutablePeriod46, 2022);
        mutablePeriod4.setPeriod((org.joda.time.ReadableInstant) dateMidnight39, (org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone53);
        int int55 = dateMidnight54.getEra();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = dateMidnight54.toDateTime(chronology56);
        org.joda.time.DateTime dateTime59 = dateTime57.minusWeeks(0);
        org.joda.time.DateMidnight dateMidnight60 = dateTime59.toDateMidnight();
        org.joda.time.DateMidnight.Property property61 = dateMidnight60.era();
        int int62 = dateMidnight60.getDayOfYear();
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight60.plusWeeks(70);
        org.joda.time.DateMidnight.Property property65 = dateMidnight64.year();
        boolean boolean67 = dateMidnight64.isBefore((long) 887);
        org.joda.time.DateTime dateTime68 = dateMidnight64.toDateTimeISO();
        org.joda.time.Interval interval69 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod4, (org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone71);
        int int73 = dateMidnight72.getEra();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateTime dateTime75 = dateMidnight72.toDateTime(chronology74);
        org.joda.time.DateTime dateTime77 = dateTime75.minusWeeks(0);
        org.joda.time.DateTime dateTime78 = dateTime77.withEarlierOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType79 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTime dateTime81 = dateTime77.withFieldAdded(durationFieldType79, 5);
        org.joda.time.TimeOfDay timeOfDay82 = dateTime77.toTimeOfDay();
        org.joda.time.Instant instant83 = dateTime77.toInstant();
        org.joda.time.Interval interval84 = interval69.withEnd((org.joda.time.ReadableInstant) instant83);
        org.joda.time.ReadablePeriod readablePeriod85 = null;
        org.joda.time.Interval interval86 = interval69.withPeriodBeforeEnd(readablePeriod85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and instant83", (dateMidnight14.compareTo(instant83) == 0) == dateMidnight14.equals(instant83));
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        int int3 = dateMidnight2.getEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateMidnight2.toDateTime(chronology4);
        long long6 = dateTime5.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime5.withMillis(100L);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone10);
        int int12 = dateMidnight11.getEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateMidnight11.toDateTime(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusDays(9);
        int int17 = dateTime14.getEra();
        org.joda.time.DateTime dateTime18 = dateTime14.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTime dateTime20 = dateTime5.withZoneRetainFields(dateTimeZone19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.year();
        java.util.Locale locale26 = new java.util.Locale("hi!", "");
        java.lang.String str27 = property23.getAsText(locale26);
        org.joda.time.LocalDateTime localDateTime28 = property23.withMaximumValue();
        java.lang.String str29 = property23.toString();
        org.joda.time.DateTimeField dateTimeField30 = property23.getField();
        org.joda.time.LocalDateTime localDateTime31 = property23.withMinimumValue();
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.DateMidnight dateMidnight33 = org.joda.time.DateMidnight.now(chronology32);
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight((java.lang.Object) dateTime5, chronology32);
        org.joda.time.DateTime.Property property35 = dateTime5.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight34", (dateMidnight2.compareTo(dateMidnight34) == 0) == dateMidnight2.equals(dateMidnight34));
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.add((long) 3);
        mutableDateTime4.setDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime4.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology12);
        org.joda.time.Interval interval14 = yearMonthDay13.toInterval();
        org.joda.time.Period period15 = interval14.toPeriod();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology19);
        org.joda.time.Interval interval21 = yearMonthDay20.toInterval();
        org.joda.time.Period period22 = interval21.toPeriod();
        long long23 = interval21.getStartMillis();
        org.joda.time.Interval interval24 = interval14.overlap((org.joda.time.ReadableInterval) interval21);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone26);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(0L, 100L, periodType30, chronology31);
        java.lang.Object obj33 = mutablePeriod32.clone();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, 100L, periodType36, chronology37);
        mutablePeriod32.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone41);
        org.joda.time.Duration duration43 = mutablePeriod32.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight27.plus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.LocalDate localDate45 = dateMidnight44.toLocalDate();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        java.lang.String str47 = chronology46.toString();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.secondOfDay();
        org.joda.time.Interval interval49 = interval14.withChronology(chronology46);
        org.joda.time.DurationField durationField50 = chronology46.minutes();
        boolean boolean51 = mutableDateTime8.equals((java.lang.Object) durationField50);
        org.joda.time.DateTimeField dateTimeField52 = null;
        mutableDateTime8.setRounding(dateTimeField52, 22);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime8.weekyear();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone57);
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(0L, 100L, periodType61, chronology62);
        java.lang.Object obj64 = mutablePeriod63.clone();
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod(0L, 100L, periodType67, chronology68);
        mutablePeriod63.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod69);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.DateMidnight dateMidnight73 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone72);
        org.joda.time.Duration duration74 = mutablePeriod63.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight73);
        org.joda.time.DateMidnight dateMidnight75 = dateMidnight58.plus((org.joda.time.ReadableDuration) duration74);
        org.joda.time.LocalDate localDate76 = dateMidnight75.toLocalDate();
        org.joda.time.Chronology chronology77 = localDate76.getChronology();
        java.lang.String str78 = chronology77.toString();
        org.joda.time.DateTimeField dateTimeField79 = chronology77.secondOfDay();
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.YearMonthDay yearMonthDay84 = new org.joda.time.YearMonthDay((int) '#', (int) (byte) 10, (int) (short) 10, chronology83);
        int int85 = yearMonthDay84.getDayOfMonth();
        org.joda.time.PeriodType periodType86 = null;
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod(periodType86);
        org.joda.time.YearMonthDay yearMonthDay89 = yearMonthDay84.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod87, 53230763);
        int[] intArray91 = chronology77.get((org.joda.time.ReadablePartial) yearMonthDay89, (long) 100);
        org.joda.time.DateTimeField dateTimeField92 = chronology77.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime93 = mutableDateTime8.toMutableDateTime(chronology77);
        org.joda.time.MutableDateTime.Property property94 = mutableDateTime8.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime93", (mutableDateTime8.compareTo(mutableDateTime93) == 0) == mutableDateTime8.equals(mutableDateTime93));
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.withMillis(53230963L);
        org.joda.time.Instant instant22 = dateMidnight19.toInstant();
        java.util.Date date24 = new java.util.Date((long) 0);
        org.joda.time.TimeOfDay timeOfDay25 = org.joda.time.TimeOfDay.fromDateFields(date24);
        int int26 = timeOfDay25.getSecondOfMinute();
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay25.minusMinutes(6);
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.withMinuteOfHour(0);
        org.joda.time.TimeOfDay.Property property31 = timeOfDay30.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.parse("2022");
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.add((long) 3);
        mutableDateTime36.setDayOfMonth((int) (byte) 10);
        mutableDateTime36.add((long) 6);
        mutableDateTime36.addWeeks((int) '4');
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property44 = dateMidnight43.monthOfYear();
        mutableDateTime36.setTime((org.joda.time.ReadableInstant) dateMidnight43);
        int int46 = property31.compareTo((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property31.getFieldType();
        boolean boolean48 = dateMidnight19.isSupported(dateTimeFieldType47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight19 and instant22", (dateMidnight19.compareTo(instant22) == 0) == dateMidnight19.equals(instant22));
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(0L, 100L, periodType5, chronology6);
        java.lang.Object obj8 = mutablePeriod7.clone();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(0L, 100L, periodType11, chronology12);
        mutablePeriod7.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((long) (byte) 0, dateTimeZone16);
        org.joda.time.Duration duration18 = mutablePeriod7.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight2.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDate localDate20 = dateMidnight19.toLocalDate();
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(0L, 100L, periodType24, chronology25);
        java.lang.Object obj27 = mutablePeriod26.clone();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(0L, 100L, periodType30, chronology31);
        mutablePeriod26.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod32);
        int int34 = mutablePeriod32.getMinutes();
        org.joda.time.Period period36 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.hours();
        java.lang.String str38 = durationFieldType37.toString();
        org.joda.time.Period period40 = period36.withField(durationFieldType37, 2);
        boolean boolean41 = mutablePeriod32.isSupported(durationFieldType37);
        long long44 = chronology21.add((org.joda.time.ReadablePeriod) mutablePeriod32, (long) 53230763, 2);
        org.joda.time.DurationField durationField45 = chronology21.eras();
        org.joda.time.DateTimeField dateTimeField46 = chronology21.monthOfYear();
        org.joda.time.DurationField durationField47 = dateTimeField46.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField47, and durationField45", !(durationField45.compareTo(durationField47) == 0) || (Math.signum(durationField45.compareTo(durationField45)) == Math.signum(durationField47.compareTo(durationField45))));
    }
}

