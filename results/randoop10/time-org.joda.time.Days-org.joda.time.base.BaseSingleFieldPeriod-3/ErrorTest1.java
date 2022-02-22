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
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        int int15 = mutablePeriod8.getMillis();
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod8.toMutablePeriod();
        mutablePeriod8.addHours((int) (short) 100);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, periodType22, chronology27);
        org.joda.time.Chronology chronology29 = chronology27.withUTC();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.dayOfYear();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) 52, chronology29);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(chronology29);
        org.joda.time.DateTimeField dateTimeField33 = chronology29.secondOfDay();
        mutablePeriod8.add(29916000000021L, chronology29);
        org.joda.time.DateTimeField dateTimeField35 = chronology29.centuryOfEra();
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        int int41 = dateTimeZone39.getOffset(3600L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone39);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 1, periodType45, chronology50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) '4', chronology50);
        org.joda.time.ReadablePartial readablePartial53 = null;
        org.joda.time.DateTime dateTime54 = dateTime52.withFields(readablePartial53);
        org.joda.time.DateTime.Property property55 = dateTime54.millisOfDay();
        org.joda.time.DateTime dateTime57 = dateTime54.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime59 = dateTime54.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours60 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours61 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours62 = hours60.minus(hours61);
        org.joda.time.Duration duration63 = hours61.toStandardDuration();
        org.joda.time.DateTime dateTime64 = dateTime54.plus((org.joda.time.ReadableDuration) duration63);
        org.joda.time.LocalDateTime localDateTime65 = dateTime64.toLocalDateTime();
        boolean boolean66 = dateTimeZone39.isLocalDateTimeGap(localDateTime65);
        org.joda.time.Interval interval67 = new org.joda.time.Interval(349200003L, 1645454905496L, dateTimeZone39);
        org.joda.time.Chronology chronology68 = chronology29.withZone(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime52", (dateTime31.compareTo(dateTime52) == 0) == dateTime31.equals(dateTime52));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(6216719587200001L, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime6.withLaterOffsetAtOverlap();
        boolean boolean8 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((-124334351997544L));
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int12 = dateTime10.get(dateTimeFieldType11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 1, periodType15, chronology20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', chronology20);
        org.joda.time.ReadablePartial readablePartial23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.withFields(readablePartial23);
        org.joda.time.DateTime.Property property25 = dateTime24.millisOfDay();
        int int26 = property25.getMinimumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        boolean boolean28 = dateTime10.isSupported(dateTimeFieldType27);
        int int29 = dateTime3.get(dateTimeFieldType27);
        org.joda.time.Instant instant30 = dateTime3.toInstant();
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean41 = mutableInterval36.isBefore((org.joda.time.ReadableInterval) mutableInterval40);
        boolean boolean42 = mutableInterval33.contains((org.joda.time.ReadableInterval) mutableInterval40);
        org.joda.time.Period period43 = mutableInterval33.toPeriod();
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean51 = mutableInterval46.isBefore((org.joda.time.ReadableInterval) mutableInterval50);
        boolean boolean52 = mutableInterval33.overlaps((org.joda.time.ReadableInterval) mutableInterval46);
        org.joda.time.Minutes minutes53 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) mutableInterval33);
        org.joda.time.Duration duration54 = minutes53.toStandardDuration();
        org.joda.time.Instant instant55 = instant30.minus((org.joda.time.ReadableDuration) duration54);
        org.joda.time.Duration duration56 = duration54.toDuration();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant30", (dateTime3.compareTo(instant30) == 0) == dateTime3.equals(instant30));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime9 = property6.addWrapFieldToCopy(1);
        org.joda.time.Period period11 = new org.joda.time.Period(164096150400000L);
        org.joda.time.DateTime dateTime12 = dateTime9.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.MutablePeriod mutablePeriod13 = period11.toMutablePeriod();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology19.getZone();
        java.lang.String str22 = dateTimeZone20.getName(100L);
        org.joda.time.DateTime dateTime23 = dateTime14.withZoneRetainFields(dateTimeZone20);
        boolean boolean25 = dateTime14.isEqual((-124334351997544L));
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTime dateTime33 = dateTime31.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime35 = dateTime33.withMillisOfDay(0);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTimeField dateTimeField44 = chronology42.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology42.getZone();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours(52);
        org.joda.time.Chronology chronology48 = chronology42.withZone(dateTimeZone47);
        org.joda.time.DateTime dateTime49 = dateTime33.toDateTime(chronology48);
        mutablePeriod13.setPeriod((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime52 = dateTime33.plusMillis(29);
        org.joda.time.DateTime.Property property53 = dateTime52.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and dateTime49", (dateTime33.compareTo(dateTime49) == 0) == dateTime33.equals(dateTime49));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime6 = dateTime5.toLocalDateTime();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType10 = null;
        int int11 = minutes9.get(durationFieldType10);
        org.joda.time.DurationFieldType durationFieldType12 = minutes9.getFieldType();
        boolean boolean13 = minutes7.isGreaterThan(minutes9);
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes9, (org.joda.time.ReadableInstant) instant14);
        org.joda.time.DateTime dateTime16 = instant14.toDateTimeISO();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Period period19 = org.joda.time.Period.weeks(49);
        org.joda.time.Interval interval20 = interval17.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant14", (dateTime5.compareTo(instant14) == 0) == dateTime5.equals(instant14));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.DateTimeZone dateTimeZone8 = chronology7.getZone();
        java.lang.String str10 = dateTimeZone8.getName(100L);
        org.joda.time.DateTime dateTime11 = dateTime2.withZoneRetainFields(dateTimeZone8);
        int int12 = dateTime11.getMinuteOfDay();
        int int13 = dateTime11.getEra();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone15);
        org.joda.time.DateTime dateTime17 = dateTime16.withLaterOffsetAtOverlap();
        org.joda.time.Hours hours18 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Period period19 = duration1.toPeriodTo((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, periodType23, chronology28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) '4', chronology28);
        org.joda.time.ReadablePartial readablePartial31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.withFields(readablePartial31);
        boolean boolean33 = instant20.isAfter((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Duration duration34 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) '4', chronology42);
        org.joda.time.ReadablePartial readablePartial45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.withFields(readablePartial45);
        org.joda.time.DateTime.Property property47 = dateTime46.millisOfDay();
        org.joda.time.DateTime dateTime48 = dateTime46.withEarlierOffsetAtOverlap();
        int int49 = dateTime46.getDayOfWeek();
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 1, periodType51, chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone59 = chronology56.getZone();
        org.joda.time.DateTime dateTime60 = dateTime46.withChronology(chronology56);
        org.joda.time.Interval interval61 = duration34.toIntervalTo((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Instant instant63 = instant20.withDurationAdded((org.joda.time.ReadableDuration) duration34, 48);
        org.joda.time.Duration duration64 = duration34.toDuration();
        org.joda.time.Duration duration65 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration66 = duration65.toDuration();
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval70 = mutableInterval69.toInterval();
        org.joda.time.Chronology chronology71 = interval70.getChronology();
        org.joda.time.DateTimeZone dateTimeZone72 = chronology71.getZone();
        org.joda.time.Period period73 = duration65.toPeriod(chronology71);
        boolean boolean74 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration65);
        long long75 = duration34.getStandardSeconds();
        org.joda.time.Duration duration77 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration34, (int) (byte) 0);
        org.joda.time.Hours hours78 = duration1.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant20", (dateTime2.compareTo(instant20) == 0) == dateTime2.equals(instant20));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus(100L);
        org.joda.time.DateTime dateTime3 = instant2.toDateTimeISO();
        int int4 = dateTime3.getYear();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, periodType7, chronology12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', chronology12);
        org.joda.time.ReadablePartial readablePartial15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.withFields(readablePartial15);
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfDay();
        org.joda.time.DateTime dateTime18 = dateTime16.withEarlierOffsetAtOverlap();
        int int19 = dateTime16.getDayOfWeek();
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, periodType21, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone29 = chronology26.getZone();
        org.joda.time.DateTime dateTime30 = dateTime16.withChronology(chronology26);
        org.joda.time.Minutes minutes32 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType33 = null;
        int int34 = minutes32.get(durationFieldType33);
        int int36 = minutes32.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod37 = minutes32.toMutablePeriod();
        long long40 = chronology26.add((org.joda.time.ReadablePeriod) mutablePeriod37, (long) '#', (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField41 = chronology26.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField42 = chronology26.clockhourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = dateTimeField42.getType();
        org.joda.time.DateTime.Property property44 = dateTime3.property(dateTimeFieldType43);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, periodType47, chronology52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', chronology52);
        org.joda.time.ReadablePartial readablePartial55 = null;
        org.joda.time.DateTime dateTime56 = dateTime54.withFields(readablePartial55);
        org.joda.time.DateTime.Property property57 = dateTime56.millisOfDay();
        org.joda.time.DateTime dateTime59 = dateTime56.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property60 = dateTime56.era();
        org.joda.time.Duration duration62 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime64 = dateTime56.withDurationAdded((org.joda.time.ReadableDuration) duration62, 0);
        org.joda.time.Duration duration65 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime64);
        long long66 = duration65.getStandardDays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime3", (instant2.compareTo(dateTime3) == 0) == instant2.equals(dateTime3));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        int int8 = dateTimeZone6.getStandardOffset((long) 8);
        java.lang.String str9 = dateTimeZone6.toString();
        long long13 = dateTimeZone6.convertLocalToUTC((long) (-2147483648), false, 0L);
        long long16 = dateTimeZone6.adjustOffset((-349199990L), false);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((-530L), dateTimeZone6);
        java.lang.String str18 = dateTimeZone6.toString();
        long long20 = dateTimeZone6.nextTransition((long) 198969);
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology22 = instant21.getChronology();
        org.joda.time.Hours hours23 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours24 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours25 = hours23.minus(hours24);
        org.joda.time.Duration duration26 = hours24.toStandardDuration();
        org.joda.time.Instant instant27 = instant21.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.DateTime dateTime28 = instant21.toDateTime();
        boolean boolean29 = dateTimeZone6.equals((java.lang.Object) dateTime28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and dateTime28", (instant21.compareTo(dateTime28) == 0) == instant21.equals(dateTime28));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.Period period3 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType4);
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology10.getZone();
        org.joda.time.Period period12 = new org.joda.time.Period(10L, periodType4, chronology10);
        org.joda.time.PeriodType periodType13 = period12.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone15);
        int int17 = dateTime16.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean28 = mutableInterval23.isBefore((org.joda.time.ReadableInterval) mutableInterval27);
        boolean boolean29 = mutableInterval20.contains((org.joda.time.ReadableInterval) mutableInterval27);
        org.joda.time.Weeks weeks30 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval27);
        org.joda.time.DateTime dateTime31 = dateTime16.plus((org.joda.time.ReadablePeriod) weeks30);
        org.joda.time.DateTime dateTime33 = dateTime16.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        org.joda.time.DateTime dateTime36 = dateTime16.withZone(dateTimeZone35);
        boolean boolean37 = periodType13.equals((java.lang.Object) dateTime36);
        org.joda.time.PeriodType periodType38 = periodType13.withMillisRemoved();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime36", (dateTime16.compareTo(dateTime36) == 0) == dateTime16.equals(dateTime36));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) '4');
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        mutablePeriod18.addMillis(2022);
        mutablePeriod18.setHours((int) (byte) -1);
        mutablePeriod18.setDays((int) '#');
        int int25 = mutablePeriod18.getMillis();
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes29 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType30 = null;
        int int31 = minutes29.get(durationFieldType30);
        org.joda.time.DurationFieldType durationFieldType32 = minutes29.getFieldType();
        boolean boolean33 = minutes27.isGreaterThan(minutes29);
        org.joda.time.Minutes minutes35 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType36 = null;
        int int37 = minutes35.get(durationFieldType36);
        org.joda.time.DurationFieldType durationFieldType38 = minutes35.getFieldType();
        boolean boolean39 = minutes27.isLessThan(minutes35);
        org.joda.time.DurationFieldType durationFieldType40 = minutes27.getFieldType();
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 1, periodType43, chronology48);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) '4', chronology48);
        org.joda.time.Instant instant51 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 1, periodType54, chronology59);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) '4', chronology59);
        org.joda.time.ReadablePartial readablePartial62 = null;
        org.joda.time.DateTime dateTime63 = dateTime61.withFields(readablePartial62);
        boolean boolean64 = instant51.isAfter((org.joda.time.ReadableInstant) dateTime61);
        boolean boolean65 = dateTime50.isAfter((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Chronology chronology66 = dateTime50.getChronology();
        org.joda.time.DurationField durationField67 = durationFieldType40.getField(chronology66);
        mutablePeriod18.add((long) (-120), chronology66);
        mutablePeriod18.clear();
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadablePeriod) mutablePeriod18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant51", (dateTime5.compareTo(instant51) == 0) == dateTime5.equals(instant51));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.TimeOfDay timeOfDay2 = dateTime0.toTimeOfDay();
        org.joda.time.DateTime dateTime4 = dateTime0.withYear((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTime4.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean14 = mutableInterval9.isBefore((org.joda.time.ReadableInterval) mutableInterval13);
        boolean boolean15 = mutableInterval6.contains((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.DateTime dateTime17 = dateTime2.plus((org.joda.time.ReadablePeriod) weeks16);
        org.joda.time.DateTime dateTime19 = dateTime2.minusDays((int) (byte) 1);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, periodType22, chronology27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', chronology27);
        org.joda.time.ReadablePartial readablePartial30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.withFields(readablePartial30);
        org.joda.time.DateTime.Property property32 = dateTime31.millisOfDay();
        org.joda.time.DateTime dateTime34 = dateTime31.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property35 = dateTime31.era();
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime39 = dateTime31.withDurationAdded((org.joda.time.ReadableDuration) duration37, 0);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 1, periodType42, chronology47);
        org.joda.time.DateTimeField dateTimeField49 = chronology47.yearOfCentury();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.DateTimeZone dateTimeZone56 = chronology55.getZone();
        java.lang.String str58 = dateTimeZone56.getName(100L);
        org.joda.time.DateTime dateTime59 = dateTime50.withZoneRetainFields(dateTimeZone56);
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.DateTimeZone dateTimeZone65 = chronology64.getZone();
        java.lang.String str67 = dateTimeZone65.getName(100L);
        org.joda.time.DateTime dateTime68 = dateTime59.withZoneRetainFields(dateTimeZone65);
        org.joda.time.Chronology chronology69 = chronology47.withZone(dateTimeZone65);
        org.joda.time.Period period70 = duration37.toPeriod(chronology69);
        long long74 = chronology69.add((long) 56, 100L, 24);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(chronology69);
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.MutableInterval mutableInterval80 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval81 = mutableInterval80.toInterval();
        org.joda.time.Chronology chronology82 = interval81.getChronology();
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((long) 1, periodType77, chronology82);
        org.joda.time.DateTimeField dateTimeField84 = chronology82.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone85 = chronology82.getZone();
        org.joda.time.DateTimeField dateTimeField86 = chronology82.minuteOfHour();
        org.joda.time.Chronology chronology87 = chronology82.withUTC();
        org.joda.time.DateTimeField dateTimeField88 = chronology87.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone89 = chronology87.getZone();
        org.joda.time.DateTime dateTime90 = new org.joda.time.DateTime((java.lang.Object) dateTime75, chronology87);
        org.joda.time.DateTimeField dateTimeField91 = chronology87.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime50 and dateTime90", (dateTime50.compareTo(dateTime90) == 0) == dateTime50.equals(dateTime90));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Period period12 = mutableInterval2.toPeriod();
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean20 = mutableInterval15.isBefore((org.joda.time.ReadableInterval) mutableInterval19);
        boolean boolean21 = mutableInterval2.overlaps((org.joda.time.ReadableInterval) mutableInterval15);
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean32 = mutableInterval27.isBefore((org.joda.time.ReadableInterval) mutableInterval31);
        boolean boolean33 = mutableInterval24.contains((org.joda.time.ReadableInterval) mutableInterval31);
        org.joda.time.Weeks weeks34 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval31);
        org.joda.time.Chronology chronology35 = mutableInterval31.getChronology();
        boolean boolean36 = mutableInterval2.isAfter((org.joda.time.ReadableInterval) mutableInterval31);
        org.joda.time.Chronology chronology37 = mutableInterval31.getChronology();
        boolean boolean38 = mutableInterval31.isAfterNow();
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(chronology43);
        org.joda.time.DateTime dateTime46 = dateTime44.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime48 = dateTime46.withMillisOfDay(0);
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 1, periodType50, chronology55);
        org.joda.time.DateTimeField dateTimeField57 = chronology55.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone58 = chronology55.getZone();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours(52);
        org.joda.time.Chronology chronology61 = chronology55.withZone(dateTimeZone60);
        org.joda.time.DateTime dateTime62 = dateTime46.toDateTime(chronology61);
        org.joda.time.DateTime dateTime64 = dateTime46.minusMonths((int) (byte) 1);
        boolean boolean65 = mutableInterval31.isBefore((org.joda.time.ReadableInstant) dateTime64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime46 and dateTime62", (dateTime46.compareTo(dateTime62) == 0) == dateTime46.equals(dateTime62));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime12.withEarlierOffsetAtOverlap();
        int int15 = dateTime12.getDayOfWeek();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology22.getZone();
        org.joda.time.DateTime dateTime26 = dateTime12.withChronology(chronology22);
        org.joda.time.Interval interval27 = duration0.toIntervalTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period30 = duration0.toPeriodFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime.Property property31 = dateTime29.era();
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(periodType32);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadablePeriod) mutablePeriod33);
        java.lang.Object obj35 = mutablePeriod33.clone();
        java.lang.Object obj36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType38 = period37.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(obj36, periodType38);
        org.joda.time.Period period40 = new org.joda.time.Period((java.lang.Object) mutablePeriod33, periodType38);
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 1, periodType44, chronology49);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) '4', chronology49);
        org.joda.time.ReadablePartial readablePartial52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.withFields(readablePartial52);
        boolean boolean54 = instant41.isAfter((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime.Property property55 = dateTime51.dayOfWeek();
        int int56 = property55.getMaximumValue();
        java.lang.String str57 = property55.getAsText();
        long long58 = property55.remainder();
        boolean boolean59 = mutablePeriod33.equals((java.lang.Object) property55);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(dateTimeZone62);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.DateTimeZone dateTimeZone70 = chronology69.getZone();
        java.lang.String str72 = dateTimeZone70.getName(100L);
        org.joda.time.DateTime dateTime73 = dateTime64.withZoneRetainFields(dateTimeZone70);
        int int74 = dateTime73.getMinuteOfDay();
        int int75 = dateTime73.getEra();
        org.joda.time.DateMidnight dateMidnight76 = dateTime73.toDateMidnight();
        mutablePeriod33.setPeriod((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime78 = dateTime63.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant41 and dateTime64", (instant41.compareTo(dateTime64) == 0) == instant41.equals(dateTime64));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property15 = dateTime11.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
        int int17 = property15.getLeapAmount();
        org.joda.time.DateTime dateTime18 = property15.roundFloorCopy();
        org.joda.time.Instant instant19 = new org.joda.time.Instant((java.lang.Object) dateTime18);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, periodType21, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone29 = chronology26.getZone();
        java.lang.String str30 = dateTimeZone29.toString();
        long long33 = dateTimeZone29.adjustOffset((long) '#', true);
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(6216719587200001L, dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone39);
        int int41 = dateTime40.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime40.getZone();
        int int43 = dateTime37.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime45 = dateTime40.withMillis((long) (short) 10);
        org.joda.time.DateTime dateTime47 = dateTime40.withMillisOfDay(53);
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 1, periodType50, chronology55);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) '4', chronology55);
        org.joda.time.ReadablePartial readablePartial58 = null;
        org.joda.time.DateTime dateTime59 = dateTime57.withFields(readablePartial58);
        org.joda.time.DateTime.Property property60 = dateTime59.millisOfDay();
        org.joda.time.DateTime dateTime62 = dateTime59.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime64 = dateTime59.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours65 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours66 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours67 = hours65.minus(hours66);
        org.joda.time.Duration duration68 = hours66.toStandardDuration();
        org.joda.time.DateTime dateTime69 = dateTime59.plus((org.joda.time.ReadableDuration) duration68);
        boolean boolean70 = dateTime47.isEqual((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.DateMidnight dateMidnight71 = dateTime47.toDateMidnight();
        org.joda.time.LocalDateTime localDateTime72 = dateTime47.toLocalDateTime();
        boolean boolean73 = dateTimeZone29.isLocalDateTimeGap(localDateTime72);
        org.joda.time.DateTime dateTime74 = dateTime18.withFields((org.joda.time.ReadablePartial) localDateTime72);
        int int75 = dateTime74.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant19", (dateTime18.compareTo(instant19) == 0) == dateTime18.equals(instant19));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        mutablePeriod8.addMonths((int) (short) -1);
        org.joda.time.Period period18 = org.joda.time.Period.days((-1));
        org.joda.time.Period period20 = period18.withWeeks((int) 'a');
        org.joda.time.Period period22 = period18.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = period22.isSupported(durationFieldType23);
        mutablePeriod8.add((org.joda.time.ReadablePeriod) period22);
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean36 = mutableInterval31.isBefore((org.joda.time.ReadableInterval) mutableInterval35);
        boolean boolean37 = mutableInterval28.contains((org.joda.time.ReadableInterval) mutableInterval35);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        long long43 = interval41.toDurationMillis();
        org.joda.time.Interval interval45 = interval41.withEndMillis((long) (short) 100);
        mutableInterval35.setInterval((org.joda.time.ReadableInterval) interval41);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        long long52 = interval50.toDurationMillis();
        boolean boolean53 = interval41.isAfter((org.joda.time.ReadableInterval) interval50);
        org.joda.time.Interval interval55 = interval41.withEndMillis(100L);
        boolean boolean56 = interval41.containsNow();
        mutablePeriod8.setPeriod((org.joda.time.ReadableInterval) interval41);
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.Chronology chronology62 = interval61.getChronology();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(chronology62);
        int int64 = dateTime63.getSecondOfMinute();
        org.joda.time.DateTime dateTime66 = dateTime63.withWeekyear(3);
        boolean boolean68 = dateTime66.isAfter(9223372036505575807L);
        boolean boolean69 = interval41.contains((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime.Property property70 = dateTime66.millisOfSecond();
        org.joda.time.Instant instant71 = new org.joda.time.Instant((java.lang.Object) dateTime66);
        org.joda.time.Chronology chronology72 = instant71.getChronology();
        org.joda.time.DurationField durationField73 = chronology72.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime66 and instant71", (dateTime66.compareTo(instant71) == 0) == dateTime66.equals(instant71));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime2 = dateTime0.toMutableDateTime();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, periodType7, chronology12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', chronology12);
        org.joda.time.ReadablePartial readablePartial15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.withFields(readablePartial15);
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfDay();
        org.joda.time.DateTime dateTime18 = dateTime16.withEarlierOffsetAtOverlap();
        int int19 = dateTime16.getDayOfWeek();
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, periodType21, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone29 = chronology26.getZone();
        org.joda.time.DateTime dateTime30 = dateTime16.withChronology(chronology26);
        int int31 = dateTime30.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int33 = dateTime30.get(dateTimeFieldType32);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, periodType36, chronology41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) '4', chronology41);
        org.joda.time.Instant instant44 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, periodType47, chronology52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', chronology52);
        org.joda.time.ReadablePartial readablePartial55 = null;
        org.joda.time.DateTime dateTime56 = dateTime54.withFields(readablePartial55);
        boolean boolean57 = instant44.isAfter((org.joda.time.ReadableInstant) dateTime54);
        boolean boolean58 = dateTime43.isAfter((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Chronology chronology59 = dateTime43.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = dateTimeFieldType32.getField(chronology59);
        org.joda.time.Interval interval61 = new org.joda.time.Interval(0L, 30236400000L, chronology59);
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.Chronology chronology68 = interval67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 1, periodType63, chronology68);
        org.joda.time.DateTimeField dateTimeField70 = chronology68.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone71 = chronology68.getZone();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHours(52);
        org.joda.time.Chronology chronology74 = chronology68.withZone(dateTimeZone73);
        long long77 = dateTimeZone73.adjustOffset((long) 972, false);
        org.joda.time.Chronology chronology78 = chronology59.withZone(dateTimeZone73);
        org.joda.time.DurationField durationField79 = chronology59.hours();
        org.joda.time.MutableDateTime mutableDateTime80 = dateTime0.toMutableDateTime(chronology59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean7 = mutableInterval2.isBefore((org.joda.time.ReadableInterval) mutableInterval6);
        org.joda.time.Duration duration8 = mutableInterval2.toDuration();
        long long9 = mutableInterval2.toDurationMillis();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) 'a', 1970, 10, (int) '4', 1970, 887, (int) (short) 1);
        mutablePeriod18.addDays(887);
        mutablePeriod18.setDays(25);
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.Chronology chronology28 = interval26.getChronology();
        org.joda.time.Interval interval29 = interval26.toInterval();
        mutablePeriod18.setPeriod((org.joda.time.ReadableInterval) interval26);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.Instant instant32 = dateTime31.toInstant();
        org.joda.time.TimeOfDay timeOfDay33 = dateTime31.toTimeOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone35);
        int int37 = dateTime36.getMillisOfDay();
        org.joda.time.DateTime dateTime39 = dateTime36.plusMillis((int) '#');
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 1, periodType42, chronology47);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) '4', chronology47);
        org.joda.time.DateTime dateTime50 = dateTime39.withChronology(chronology47);
        boolean boolean52 = dateTime50.isEqual(187200000L);
        org.joda.time.Minutes minutes53 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Interval interval54 = interval26.withEnd((org.joda.time.ReadableInstant) dateTime31);
        mutableInterval2.setInterval((org.joda.time.ReadableInterval) interval54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant32", (dateTime31.compareTo(instant32) == 0) == dateTime31.equals(instant32));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        int int3 = minutes1.get(durationFieldType2);
        int int5 = minutes1.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod6 = minutes1.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType8 = minutes1.getFieldType(0);
        org.joda.time.Duration duration9 = minutes1.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone11);
        int int13 = dateTime12.getMillisOfDay();
        org.joda.time.DateTime dateTime15 = dateTime12.plusMillis((int) '#');
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, periodType18, chronology23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', chronology23);
        org.joda.time.DateTime dateTime26 = dateTime15.withChronology(chronology23);
        int int27 = dateTime26.getYearOfEra();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(periodType28);
        org.joda.time.Period period30 = duration9.toPeriodFrom((org.joda.time.ReadableInstant) dateTime26, periodType28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = dateTime26.withZone(dateTimeZone32);
        org.joda.time.YearMonthDay yearMonthDay35 = dateTime26.toYearMonthDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime34", (dateTime26.compareTo(dateTime34) == 0) == dateTime26.equals(dateTime34));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Period period15 = org.joda.time.Period.days((-1));
        org.joda.time.Period period17 = period15.withWeeks((int) 'a');
        org.joda.time.Period period19 = period15.plusMonths((int) (short) -1);
        org.joda.time.Period period21 = period15.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime22 = dateTime10.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, periodType26, chronology31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', chronology31);
        org.joda.time.ReadablePartial readablePartial34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.withFields(readablePartial34);
        boolean boolean36 = instant23.isAfter((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Duration duration37 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.Chronology chronology45 = interval44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 1, periodType40, chronology45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) '4', chronology45);
        org.joda.time.ReadablePartial readablePartial48 = null;
        org.joda.time.DateTime dateTime49 = dateTime47.withFields(readablePartial48);
        org.joda.time.DateTime.Property property50 = dateTime49.millisOfDay();
        org.joda.time.DateTime dateTime51 = dateTime49.withEarlierOffsetAtOverlap();
        int int52 = dateTime49.getDayOfWeek();
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 1, periodType54, chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology59.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone62 = chronology59.getZone();
        org.joda.time.DateTime dateTime63 = dateTime49.withChronology(chronology59);
        org.joda.time.Interval interval64 = duration37.toIntervalTo((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Instant instant66 = instant23.withDurationAdded((org.joda.time.ReadableDuration) duration37, 48);
        org.joda.time.Duration duration67 = duration37.toDuration();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.TimeOfDay timeOfDay69 = dateTime10.toTimeOfDay();
        org.joda.time.MutableDateTime mutableDateTime70 = dateTime10.toMutableDateTime();
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval75 = mutableInterval74.toInterval();
        org.joda.time.Chronology chronology76 = interval75.getChronology();
        org.joda.time.DateTimeZone dateTimeZone77 = chronology76.getZone();
        java.lang.String str79 = dateTimeZone77.getName(100L);
        org.joda.time.DateTime dateTime80 = dateTime71.withZoneRetainFields(dateTimeZone77);
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval84 = mutableInterval83.toInterval();
        org.joda.time.Chronology chronology85 = interval84.getChronology();
        org.joda.time.DateTimeZone dateTimeZone86 = chronology85.getZone();
        java.lang.String str88 = dateTimeZone86.getName(100L);
        org.joda.time.DateTime dateTime89 = dateTime80.withZoneRetainFields(dateTimeZone86);
        java.lang.String str90 = dateTimeZone86.toString();
        org.joda.time.DateTime dateTime91 = dateTime10.withZone(dateTimeZone86);
        long long93 = dateTimeZone86.convertUTCToLocal(1142677015L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime71", (instant0.compareTo(dateTime71) == 0) == instant0.equals(dateTime71));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        mutablePeriod8.addMonths((int) (short) -1);
        org.joda.time.Period period18 = org.joda.time.Period.days((-1));
        org.joda.time.Period period20 = period18.withWeeks((int) 'a');
        org.joda.time.Period period22 = period18.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = period22.isSupported(durationFieldType23);
        mutablePeriod8.add((org.joda.time.ReadablePeriod) period22);
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean36 = mutableInterval31.isBefore((org.joda.time.ReadableInterval) mutableInterval35);
        boolean boolean37 = mutableInterval28.contains((org.joda.time.ReadableInterval) mutableInterval35);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        long long43 = interval41.toDurationMillis();
        org.joda.time.Interval interval45 = interval41.withEndMillis((long) (short) 100);
        mutableInterval35.setInterval((org.joda.time.ReadableInterval) interval41);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        long long52 = interval50.toDurationMillis();
        boolean boolean53 = interval41.isAfter((org.joda.time.ReadableInterval) interval50);
        org.joda.time.Interval interval55 = interval41.withEndMillis(100L);
        boolean boolean56 = interval41.containsNow();
        mutablePeriod8.setPeriod((org.joda.time.ReadableInterval) interval41);
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.Chronology chronology62 = interval61.getChronology();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(chronology62);
        int int64 = dateTime63.getSecondOfMinute();
        org.joda.time.DateTime dateTime66 = dateTime63.withWeekyear(3);
        boolean boolean68 = dateTime66.isAfter(9223372036505575807L);
        boolean boolean69 = interval41.contains((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime.Property property70 = dateTime66.millisOfSecond();
        org.joda.time.Instant instant71 = new org.joda.time.Instant((java.lang.Object) dateTime66);
        org.joda.time.DateTime.Property property72 = dateTime66.millisOfSecond();
        org.joda.time.DateTime dateTime74 = property72.addWrapFieldToCopy((-1870));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime66 and instant71", (dateTime66.compareTo(instant71) == 0) == dateTime66.equals(instant71));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((-124334351997544L));
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.Instant instant4 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, periodType7, chronology12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', chronology12);
        org.joda.time.ReadablePartial readablePartial15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.withFields(readablePartial15);
        boolean boolean17 = instant4.isAfter((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime.Property property18 = dateTime14.dayOfWeek();
        org.joda.time.DateTime dateTime19 = dateTime14.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime19.toMutableDateTime();
        boolean boolean21 = interval3.isBefore((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.Interval interval27 = interval25.toInterval();
        org.joda.time.Duration duration29 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval30 = interval27.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration29);
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        org.joda.time.DateTime dateTime38 = dateTime36.withWeekyear((int) (short) 1);
        org.joda.time.Duration duration39 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 1, periodType42, chronology47);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) '4', chronology47);
        org.joda.time.ReadablePartial readablePartial50 = null;
        org.joda.time.DateTime dateTime51 = dateTime49.withFields(readablePartial50);
        org.joda.time.DateTime.Property property52 = dateTime51.millisOfDay();
        org.joda.time.DateTime dateTime53 = dateTime51.withEarlierOffsetAtOverlap();
        int int54 = dateTime51.getDayOfWeek();
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.Chronology chronology61 = interval60.getChronology();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) 1, periodType56, chronology61);
        org.joda.time.DateTimeField dateTimeField63 = chronology61.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone64 = chronology61.getZone();
        org.joda.time.DateTime dateTime65 = dateTime51.withChronology(chronology61);
        org.joda.time.Interval interval66 = duration39.toIntervalTo((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period69 = duration39.toPeriodFrom((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.Period period70 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType71 = period70.getPeriodType();
        org.joda.time.Period period72 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableDuration) duration39, periodType71);
        org.joda.time.Duration duration74 = duration29.withDurationAdded((org.joda.time.ReadableDuration) duration39, 4);
        long long75 = duration39.getMillis();
        org.joda.time.Period period77 = org.joda.time.Period.days(887);
        org.joda.time.PeriodType periodType78 = period77.getPeriodType();
        org.joda.time.Period period79 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime20, (org.joda.time.ReadableDuration) duration39, periodType78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime36", (instant4.compareTo(dateTime36) == 0) == instant4.equals(dateTime36));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Period period15 = org.joda.time.Period.days((-1));
        org.joda.time.Period period17 = period15.withWeeks((int) 'a');
        org.joda.time.Period period19 = period15.plusMonths((int) (short) -1);
        org.joda.time.Period period21 = period15.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime22 = dateTime10.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.LocalDateTime localDateTime23 = dateTime10.toLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime10.getZone();
        org.joda.time.Instant instant25 = dateTime10.toInstant();
        org.joda.time.Instant instant26 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', chronology34);
        org.joda.time.ReadablePartial readablePartial37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withFields(readablePartial37);
        boolean boolean39 = instant26.isAfter((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Seconds seconds40 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) instant25, (org.joda.time.ReadableInstant) instant26);
        org.joda.time.MutableDateTime mutableDateTime41 = instant25.toMutableDateTimeISO();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period52 = org.joda.time.Period.days((-1));
        org.joda.time.Period period54 = period52.withWeeks((int) 'a');
        java.lang.String str55 = period52.toString();
        mutablePeriod50.setPeriod((org.joda.time.ReadablePeriod) period52);
        int int57 = mutablePeriod50.getMillis();
        org.joda.time.MutablePeriod mutablePeriod58 = mutablePeriod50.toMutablePeriod();
        mutablePeriod58.add((int) '4', (int) (short) 0, (int) (byte) 0, (int) (short) 10, 1, (int) 'a', (int) (short) 100, (int) (short) -1);
        mutablePeriod58.addMinutes(100);
        mutablePeriod58.setPeriod((long) 366);
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval75 = mutableInterval74.toInterval();
        org.joda.time.MutableInterval mutableInterval78 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean79 = mutableInterval74.isBefore((org.joda.time.ReadableInterval) mutableInterval78);
        java.lang.Object obj80 = mutableInterval74.clone();
        long long81 = mutableInterval74.getStartMillis();
        org.joda.time.Duration duration82 = mutableInterval74.toDuration();
        mutablePeriod58.add((org.joda.time.ReadableDuration) duration82);
        mutablePeriod58.setHours(53);
        org.joda.time.MutableInterval mutableInterval86 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) mutableDateTime41, (org.joda.time.ReadablePeriod) mutablePeriod58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant25", (dateTime10.compareTo(instant25) == 0) == dateTime10.equals(instant25));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.Duration duration7 = interval5.toDuration();
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.Interval interval13 = interval11.toInterval();
        org.joda.time.Duration duration15 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval16 = interval13.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration15);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, periodType19, chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', chronology24);
        org.joda.time.ReadablePartial readablePartial27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withFields(readablePartial27);
        org.joda.time.DateTime.Property property29 = dateTime28.millisOfDay();
        org.joda.time.DateTime dateTime31 = dateTime28.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property32 = dateTime28.era();
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime36 = dateTime28.withDurationAdded((org.joda.time.ReadableDuration) duration34, 0);
        long long37 = duration34.getStandardHours();
        org.joda.time.Duration duration38 = duration15.plus((org.joda.time.ReadableDuration) duration34);
        boolean boolean39 = duration7.isLongerThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean50 = mutableInterval45.isBefore((org.joda.time.ReadableInterval) mutableInterval49);
        boolean boolean51 = mutableInterval42.contains((org.joda.time.ReadableInterval) mutableInterval49);
        org.joda.time.Period period54 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType55 = period54.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType55);
        org.joda.time.Period period57 = mutableInterval49.toPeriod(periodType55);
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant0, (org.joda.time.ReadableDuration) duration7, periodType55);
        org.joda.time.DateTime dateTime59 = instant0.toDateTimeISO();
        org.joda.time.Instant instant61 = instant0.plus((long) 56891755);
        org.joda.time.Duration duration63 = org.joda.time.Duration.standardMinutes(6000035L);
        org.joda.time.Instant instant64 = instant0.plus((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Period period66 = org.joda.time.Period.weeks(31);
        org.joda.time.Period period68 = period66.withMonths((-101511));
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(75736684800000L);
        org.joda.time.Duration duration71 = period68.toDurationFrom((org.joda.time.ReadableInstant) dateTime70);
        boolean boolean72 = duration63.isShorterThan((org.joda.time.ReadableDuration) duration71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime59", (instant0.compareTo(dateTime59) == 0) == instant0.equals(dateTime59));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Instant instant3 = instant1.plus(157784803200024L);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.Instant instant7 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration5, (int) '4');
        org.joda.time.Instant instant9 = instant1.plus((-6216719237999948L));
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(86399, 70, (-101511), (-1870), 7, 949, 2922789, 1969);
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime18 = dateTime16.plus((long) (short) -1);
        org.joda.time.DateTime dateTime20 = dateTime16.plusSeconds(2);
        org.joda.time.DateTime.Property property21 = dateTime16.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone23);
        int int25 = dateTime24.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime24.getZone();
        long long28 = dateTimeZone26.convertUTCToLocal((long) 0);
        int int30 = dateTimeZone26.getStandardOffset((long) 94);
        long long32 = dateTimeZone26.convertUTCToLocal(31186800000L);
        org.joda.time.DateTime dateTime33 = dateTime16.withZone(dateTimeZone26);
        org.joda.time.Duration duration34 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) '4', chronology42);
        org.joda.time.ReadablePartial readablePartial45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.withFields(readablePartial45);
        org.joda.time.DateTime.Property property47 = dateTime46.millisOfDay();
        org.joda.time.DateTime dateTime48 = dateTime46.withEarlierOffsetAtOverlap();
        int int49 = dateTime46.getDayOfWeek();
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 1, periodType51, chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone59 = chronology56.getZone();
        org.joda.time.DateTime dateTime60 = dateTime46.withChronology(chronology56);
        org.joda.time.Interval interval61 = duration34.toIntervalTo((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period64 = duration34.toPeriodFrom((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Duration duration65 = duration34.toDuration();
        org.joda.time.Instant instant66 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology67 = instant66.getChronology();
        org.joda.time.Instant instant70 = instant66.withDurationAdded((long) 24, 23);
        org.joda.time.Duration duration73 = new org.joda.time.Duration(86400007L, 0L);
        org.joda.time.Instant instant75 = instant70.withDurationAdded((org.joda.time.ReadableDuration) duration73, 2022);
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration65, (org.joda.time.ReadableInstant) instant75);
        mutablePeriod8.setPeriod((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) instant75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant66", (dateTime14.compareTo(instant66) == 0) == dateTime14.equals(instant66));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType3 = periodType2.withMonthsRemoved();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.Period period10 = new org.joda.time.Period(10L, 349200000L, periodType3, chronology8);
        org.joda.time.DateTimeField dateTimeField11 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.dayOfWeek();
        org.joda.time.Period period14 = org.joda.time.Period.days((-1));
        org.joda.time.Period period16 = period14.withWeeks((int) 'a');
        org.joda.time.Period period18 = period16.withDays(100);
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, periodType22, chronology27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', chronology27);
        org.joda.time.ReadablePartial readablePartial30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.withFields(readablePartial30);
        boolean boolean32 = instant19.isAfter((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime.Property property33 = dateTime29.dayOfWeek();
        boolean boolean34 = period18.equals((java.lang.Object) property33);
        org.joda.time.Period period35 = period18.toPeriod();
        int[] intArray38 = chronology8.get((org.joda.time.ReadablePeriod) period18, 1645455600000L, 68256000000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant19", (dateTime9.compareTo(instant19) == 0) == dateTime9.equals(instant19));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 50);
        org.joda.time.Period period5 = org.joda.time.Period.days((-1));
        org.joda.time.Period period7 = period5.withWeeks((int) 'a');
        org.joda.time.Period period9 = period7.withSeconds(0);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period7.toDurationFrom(readableInstant10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone13);
        int int15 = dateTime14.getDayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime14.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfYear();
        org.joda.time.DateTime dateTime19 = property18.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone21);
        int int23 = dateTime22.getMillisOfDay();
        org.joda.time.DateTime dateTime25 = dateTime22.plusMillis((int) '#');
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 1, periodType28, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) '4', chronology33);
        org.joda.time.DateTime dateTime36 = dateTime25.withChronology(chronology33);
        boolean boolean38 = dateTime36.isEqual(187200000L);
        int int39 = property18.compareTo((org.joda.time.ReadableInstant) dateTime36);
        boolean boolean40 = duration11.equals((java.lang.Object) int39);
        org.joda.time.Instant instant42 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration11, 20);
        org.joda.time.DateTime dateTime43 = instant42.toDateTimeISO();
        org.joda.time.DateTime dateTime45 = dateTime43.plusSeconds(36);
        org.joda.time.DateTime dateTime47 = dateTime45.withYearOfEra(802202);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant42 and dateTime43", (instant42.compareTo(dateTime43) == 0) == instant42.equals(dateTime43));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 1, periodType13, chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) '4', chronology18);
        org.joda.time.ReadablePartial readablePartial21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.withFields(readablePartial21);
        boolean boolean23 = instant10.isAfter((org.joda.time.ReadableInstant) dateTime20);
        boolean boolean24 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Chronology chronology25 = dateTime9.getChronology();
        org.joda.time.DateTime dateTime28 = dateTime9.withDurationAdded((-61394288400000L), 947);
        org.joda.time.Instant instant29 = dateTime9.toInstant();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period40 = org.joda.time.Period.days((-1));
        org.joda.time.Period period42 = period40.withWeeks((int) 'a');
        java.lang.String str43 = period40.toString();
        mutablePeriod38.setPeriod((org.joda.time.ReadablePeriod) period40);
        int int45 = mutablePeriod38.getMillis();
        org.joda.time.DurationFieldType durationFieldType47 = mutablePeriod38.getFieldType(0);
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(chronology52);
        org.joda.time.DurationField durationField54 = durationFieldType47.getField(chronology52);
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime9.toMutableDateTime(chronology52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime53", (instant10.compareTo(dateTime53) == 0) == instant10.equals(dateTime53));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology14.getZone();
        java.lang.String str17 = dateTimeZone15.getName(100L);
        org.joda.time.DateTime dateTime18 = dateTime9.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone20);
        int int22 = dateTime21.getDayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime21.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfYear();
        org.joda.time.DateTime dateTime26 = property25.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime27 = dateTime26.toDateTime();
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfYear();
        boolean boolean29 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime30 = dateTime9.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime32 = dateTime30.plusMillis(5);
        org.joda.time.Minutes minutes33 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes35 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType36 = null;
        int int37 = minutes35.get(durationFieldType36);
        org.joda.time.DurationFieldType durationFieldType38 = minutes35.getFieldType();
        boolean boolean39 = minutes33.isGreaterThan(minutes35);
        org.joda.time.Instant instant40 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes35, (org.joda.time.ReadableInstant) instant40);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone43);
        int int45 = dateTime44.getDayOfMonth();
        org.joda.time.DateTime dateTime47 = dateTime44.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property48 = dateTime47.dayOfYear();
        org.joda.time.DateTime dateTime49 = property48.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime51 = property48.addWrapFieldToCopy(1);
        boolean boolean52 = instant40.isBefore((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Instant instant53 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.Chronology chronology61 = interval60.getChronology();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) 1, periodType56, chronology61);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) '4', chronology61);
        org.joda.time.ReadablePartial readablePartial64 = null;
        org.joda.time.DateTime dateTime65 = dateTime63.withFields(readablePartial64);
        boolean boolean66 = instant53.isAfter((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Period period68 = org.joda.time.Period.days((-1));
        org.joda.time.Period period70 = period68.withWeeks((int) 'a');
        org.joda.time.Period period72 = period68.plusMonths((int) (short) -1);
        org.joda.time.Period period74 = period68.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime75 = dateTime63.plus((org.joda.time.ReadablePeriod) period68);
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.DateTime dateTime77 = dateTime63.toDateTime(dateTimeZone76);
        org.joda.time.DateTime dateTime79 = dateTime77.withMillisOfDay(3600010);
        org.joda.time.Duration duration80 = new org.joda.time.Duration((org.joda.time.ReadableInstant) instant40, (org.joda.time.ReadableInstant) dateTime79);
        boolean boolean81 = dateTime32.isAfter((org.joda.time.ReadableInstant) dateTime79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant40", (dateTime0.compareTo(instant40) == 0) == dateTime0.equals(instant40));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 1, periodType13, chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) '4', chronology18);
        org.joda.time.ReadablePartial readablePartial21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.withFields(readablePartial21);
        boolean boolean23 = instant10.isAfter((org.joda.time.ReadableInstant) dateTime20);
        boolean boolean24 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime20);
        java.lang.String str25 = dateTime20.toString();
        org.joda.time.DateTime dateTime26 = dateTime20.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime28 = dateTime26.withMillisOfDay(1970);
        int int29 = dateTime26.getCenturyOfEra();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 1, periodType33, chronology38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) '4', chronology38);
        boolean boolean41 = periodType30.equals((java.lang.Object) chronology38);
        org.joda.time.DurationField durationField42 = chronology38.weekyears();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology38);
        org.joda.time.DateTimeField dateTimeField44 = chronology38.year();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period55 = org.joda.time.Period.days((-1));
        org.joda.time.Period period57 = period55.withWeeks((int) 'a');
        java.lang.String str58 = period55.toString();
        mutablePeriod53.setPeriod((org.joda.time.ReadablePeriod) period55);
        int int60 = mutablePeriod53.getYears();
        mutablePeriod53.addSeconds((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType63 = org.joda.time.DurationFieldType.days();
        mutablePeriod53.set(durationFieldType63, (-1));
        int[] intArray67 = chronology38.get((org.joda.time.ReadablePeriod) mutablePeriod53, (long) 11);
        org.joda.time.DateTime dateTime68 = dateTime26.toDateTime(chronology38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime43", (instant10.compareTo(dateTime43) == 0) == instant10.equals(dateTime43));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime8 = dateTime7.toDateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfYear();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfCentury();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology24.getZone();
        java.lang.String str27 = dateTimeZone25.getName(100L);
        org.joda.time.DateTime dateTime28 = dateTime19.withZoneRetainFields(dateTimeZone25);
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.DateTimeZone dateTimeZone34 = chronology33.getZone();
        java.lang.String str36 = dateTimeZone34.getName(100L);
        org.joda.time.DateTime dateTime37 = dateTime28.withZoneRetainFields(dateTimeZone34);
        org.joda.time.Chronology chronology38 = chronology16.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField39 = chronology38.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours(52);
        org.joda.time.Period period44 = org.joda.time.Period.weeks((-1));
        org.joda.time.Period period46 = period44.plusMillis(1970);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period57 = org.joda.time.Period.days((-1));
        org.joda.time.Period period59 = period57.withWeeks((int) 'a');
        java.lang.String str60 = period57.toString();
        mutablePeriod55.setPeriod((org.joda.time.ReadablePeriod) period57);
        mutablePeriod55.addSeconds((int) (byte) 100);
        mutablePeriod55.addWeeks((int) ' ');
        org.joda.time.Period period66 = period46.plus((org.joda.time.ReadablePeriod) mutablePeriod55);
        org.joda.time.Weeks weeks67 = org.joda.time.Weeks.ZERO;
        org.joda.time.DurationFieldType durationFieldType68 = org.joda.time.DurationFieldType.years();
        int int69 = weeks67.get(durationFieldType68);
        mutablePeriod55.add(durationFieldType68, 5);
        boolean boolean72 = dateTimeZone42.equals((java.lang.Object) durationFieldType68);
        org.joda.time.Chronology chronology73 = chronology38.withZone(dateTimeZone42);
        org.joda.time.MutableDateTime mutableDateTime74 = dateTime8.toMutableDateTime(chronology73);
        org.joda.time.DateTime dateTime76 = dateTime8.plusHours((-2147483648));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime74", (dateTime8.compareTo(mutableDateTime74) == 0) == dateTime8.equals(mutableDateTime74));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.minuteOfHour();
        org.joda.time.DurationField durationField11 = chronology6.millis();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.weekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology6.centuryOfEra();
        org.joda.time.DurationField durationField14 = dateTimeField13.getDurationField();
        long long17 = durationField14.getDifferenceAsLong(30236400000L, 112202021L);
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.Chronology chronology23 = interval21.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.yearOfEra();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period35 = org.joda.time.Period.days((-1));
        org.joda.time.Period period37 = period35.withWeeks((int) 'a');
        java.lang.String str38 = period35.toString();
        mutablePeriod33.setPeriod((org.joda.time.ReadablePeriod) period35);
        mutablePeriod33.addMonths((int) (short) -1);
        org.joda.time.Period period43 = org.joda.time.Period.days((-1));
        org.joda.time.Period period45 = period43.withWeeks((int) 'a');
        org.joda.time.Period period47 = period43.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType48 = null;
        boolean boolean49 = period47.isSupported(durationFieldType48);
        mutablePeriod33.add((org.joda.time.ReadablePeriod) period47);
        org.joda.time.Period period52 = period47.withMonths(1);
        org.joda.time.Period period54 = period52.withSeconds(0);
        org.joda.time.Period period55 = period52.toPeriod();
        org.joda.time.Period period57 = period52.plusMonths(19);
        org.joda.time.Period period59 = period57.minusSeconds((-292275054));
        org.joda.time.Period period60 = period59.toPeriod();
        int[] intArray62 = chronology23.get((org.joda.time.ReadablePeriod) period60, (long) '#');
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone64);
        int int66 = dateTime65.getMillisOfDay();
        org.joda.time.DateTime dateTime68 = dateTime65.plusMillis((int) '#');
        int int69 = dateTime65.getYearOfEra();
        org.joda.time.DateTime.Property property70 = dateTime65.secondOfMinute();
        org.joda.time.DurationField durationField71 = property70.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.era();
        boolean boolean73 = property70.equals((java.lang.Object) dateTimeFieldType72);
        org.joda.time.DurationFieldType durationFieldType74 = dateTimeFieldType72.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType75 = dateTimeFieldType72.getDurationType();
        java.lang.String str76 = durationFieldType75.getName();
        boolean boolean77 = period60.isSupported(durationFieldType75);
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone79);
        int int81 = dateTime80.getMillisOfDay();
        org.joda.time.DateTime dateTime83 = dateTime80.plusMillis((int) '#');
        org.joda.time.PeriodType periodType86 = null;
        org.joda.time.MutableInterval mutableInterval89 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval90 = mutableInterval89.toInterval();
        org.joda.time.Chronology chronology91 = interval90.getChronology();
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((long) 1, periodType86, chronology91);
        org.joda.time.DateTime dateTime93 = new org.joda.time.DateTime((long) '4', chronology91);
        org.joda.time.DateTime dateTime94 = dateTime83.withChronology(chronology91);
        int int95 = dateTime94.getYearOfEra();
        org.joda.time.Chronology chronology96 = dateTime94.getChronology();
        org.joda.time.DateTimeField dateTimeField97 = chronology96.dayOfYear();
        org.joda.time.DurationField durationField98 = durationFieldType75.getField(chronology96);
        int int99 = durationField14.compareTo(durationField98);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField98, durationField11, and durationField71", !(durationField98.compareTo(durationField11) == 0) || (Math.signum(durationField98.compareTo(durationField71)) == Math.signum(durationField11.compareTo(durationField71))));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime8 = dateTime7.toDateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfYear();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfCentury();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology24.getZone();
        java.lang.String str27 = dateTimeZone25.getName(100L);
        org.joda.time.DateTime dateTime28 = dateTime19.withZoneRetainFields(dateTimeZone25);
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.DateTimeZone dateTimeZone34 = chronology33.getZone();
        java.lang.String str36 = dateTimeZone34.getName(100L);
        org.joda.time.DateTime dateTime37 = dateTime28.withZoneRetainFields(dateTimeZone34);
        org.joda.time.Chronology chronology38 = chronology16.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField39 = chronology38.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours(52);
        org.joda.time.Period period44 = org.joda.time.Period.weeks((-1));
        org.joda.time.Period period46 = period44.plusMillis(1970);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period57 = org.joda.time.Period.days((-1));
        org.joda.time.Period period59 = period57.withWeeks((int) 'a');
        java.lang.String str60 = period57.toString();
        mutablePeriod55.setPeriod((org.joda.time.ReadablePeriod) period57);
        mutablePeriod55.addSeconds((int) (byte) 100);
        mutablePeriod55.addWeeks((int) ' ');
        org.joda.time.Period period66 = period46.plus((org.joda.time.ReadablePeriod) mutablePeriod55);
        org.joda.time.Weeks weeks67 = org.joda.time.Weeks.ZERO;
        org.joda.time.DurationFieldType durationFieldType68 = org.joda.time.DurationFieldType.years();
        int int69 = weeks67.get(durationFieldType68);
        mutablePeriod55.add(durationFieldType68, 5);
        boolean boolean72 = dateTimeZone42.equals((java.lang.Object) durationFieldType68);
        org.joda.time.Chronology chronology73 = chronology38.withZone(dateTimeZone42);
        org.joda.time.MutableDateTime mutableDateTime74 = dateTime8.toMutableDateTime(chronology73);
        org.joda.time.DurationField durationField75 = chronology73.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime74", (dateTime7.compareTo(mutableDateTime74) == 0) == dateTime7.equals(mutableDateTime74));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1970);
        org.joda.time.Period period3 = period1.plusYears((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod4 = period1.toMutablePeriod();
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean15 = mutableInterval10.isBefore((org.joda.time.ReadableInterval) mutableInterval14);
        boolean boolean16 = mutableInterval7.contains((org.joda.time.ReadableInterval) mutableInterval14);
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        long long22 = interval20.toDurationMillis();
        org.joda.time.Interval interval24 = interval20.withEndMillis((long) (short) 100);
        mutableInterval14.setInterval((org.joda.time.ReadableInterval) interval20);
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        long long31 = interval29.toDurationMillis();
        boolean boolean32 = interval20.isAfter((org.joda.time.ReadableInterval) interval29);
        org.joda.time.Interval interval34 = interval20.withEndMillis(100L);
        org.joda.time.Duration duration36 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval37 = interval34.withDurationAfterStart((org.joda.time.ReadableDuration) duration36);
        long long38 = duration36.getMillis();
        org.joda.time.Instant instant39 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime40 = instant39.toMutableDateTimeISO();
        java.lang.Object obj43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType45 = period44.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(obj43, periodType45);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 1, periodType48, chronology53);
        org.joda.time.DateTimeField dateTimeField55 = chronology53.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone56 = chronology53.getZone();
        org.joda.time.DateTimeField dateTimeField57 = chronology53.minuteOfHour();
        org.joda.time.Chronology chronology58 = chronology53.withUTC();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) 50, (-10L), periodType45, chronology58);
        boolean boolean60 = mutableDateTime40.equals((java.lang.Object) chronology58);
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration36, chronology58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant39 and mutableDateTime40", (instant39.compareTo(mutableDateTime40) == 0) == instant39.equals(mutableDateTime40));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration14 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', chronology22);
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.withFields(readablePartial25);
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfDay();
        org.joda.time.DateTime dateTime28 = dateTime26.withEarlierOffsetAtOverlap();
        int int29 = dateTime26.getDayOfWeek();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, periodType31, chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology36.getZone();
        org.joda.time.DateTime dateTime40 = dateTime26.withChronology(chronology36);
        org.joda.time.Interval interval41 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Instant instant43 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration14, 48);
        org.joda.time.Instant instant44 = instant0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime45 = instant44.toMutableDateTime();
        org.joda.time.Instant instant47 = instant44.minus(1645048800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant44 and mutableDateTime45", (instant44.compareTo(mutableDateTime45) == 0) == instant44.equals(mutableDateTime45));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTime();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, periodType8, chronology13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', chronology13);
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, periodType19, chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', chronology24);
        org.joda.time.ReadablePartial readablePartial27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withFields(readablePartial27);
        boolean boolean29 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime26);
        boolean boolean30 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime26);
        java.lang.String str31 = dateTime15.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType32.getRangeDurationType();
        int int34 = dateTime15.get(dateTimeFieldType32);
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType32.getRangeDurationType();
        org.joda.time.DateTime dateTime37 = dateTime5.withField(dateTimeFieldType32, 1);
        int int38 = dateTime5.getSecondOfMinute();
        org.joda.time.LocalDate localDate39 = dateTime5.toLocalDate();
        org.joda.time.Instant instant40 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 1, periodType43, chronology48);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) '4', chronology48);
        org.joda.time.ReadablePartial readablePartial51 = null;
        org.joda.time.DateTime dateTime52 = dateTime50.withFields(readablePartial51);
        boolean boolean53 = instant40.isAfter((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTime.Property property54 = dateTime50.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone56);
        int int58 = dateTime57.getDayOfMonth();
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval64 = mutableInterval63.toInterval();
        org.joda.time.Chronology chronology65 = interval64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) 1, periodType60, chronology65);
        org.joda.time.DateTimeField dateTimeField67 = chronology65.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone68 = chronology65.getZone();
        org.joda.time.DateTime dateTime69 = dateTime57.withZoneRetainFields(dateTimeZone68);
        org.joda.time.DateTime dateTime70 = dateTime50.withZone(dateTimeZone68);
        int int72 = dateTimeZone68.getOffset((-10L));
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime(dateTimeZone68);
        org.joda.time.DateTime.Property property74 = dateTime73.weekOfWeekyear();
        org.joda.time.DateTime.Property property75 = dateTime73.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant76 = null;
        boolean boolean77 = dateTime73.isEqual(readableInstant76);
        org.joda.time.PeriodType periodType79 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType80 = periodType79.withMinutesRemoved();
        org.joda.time.PeriodType periodType81 = periodType79.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(946634L, periodType81);
        org.joda.time.Period period83 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime5, readableInstant76, periodType81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime73", (instant16.compareTo(dateTime73) == 0) == instant16.equals(dateTime73));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) '4', 0, 99, (int) '4', 47, 53, 19, 292278993);
        mutablePeriod8.addYears(59);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 1, periodType15, chronology20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', chronology20);
        org.joda.time.ReadablePartial readablePartial23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.withFields(readablePartial23);
        boolean boolean25 = instant12.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime.Property property26 = dateTime22.dayOfWeek();
        org.joda.time.DateTime dateTime27 = property26.withMaximumValue();
        org.joda.time.DateTime dateTime29 = dateTime27.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((java.lang.Object) dateTime27);
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 1, periodType34, chronology39);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) '4', chronology39);
        boolean boolean42 = periodType31.equals((java.lang.Object) chronology39);
        org.joda.time.DurationField durationField43 = chronology39.weekyears();
        org.joda.time.DateTime dateTime44 = instant30.toDateTime(chronology39);
        mutablePeriod8.setPeriod((-1613885644800000L), chronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and instant30", (dateTime27.compareTo(instant30) == 0) == dateTime27.equals(instant30));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.Instant instant2 = instant0.toInstant();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(6216719587200001L, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone8);
        int int10 = dateTime9.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime9.getZone();
        int int12 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime15 = dateTime9.withField(dateTimeFieldType13, 1);
        boolean boolean16 = instant0.isSupported(dateTimeFieldType13);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        java.lang.String str18 = dateTimeFieldType17.toString();
        java.lang.String str19 = dateTimeFieldType17.toString();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType17.getRangeDurationType();
        java.lang.String str21 = dateTimeFieldType17.getName();
        int int22 = instant0.get(dateTimeFieldType17);
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType17.getDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType24.getRangeDurationType();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 1, periodType30, chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) '4', chronology35);
        org.joda.time.ReadablePartial readablePartial38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.withFields(readablePartial38);
        org.joda.time.DateTime.Property property40 = dateTime39.millisOfDay();
        org.joda.time.DateTime dateTime42 = dateTime39.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime44 = dateTime39.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours45 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours46 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours47 = hours45.minus(hours46);
        org.joda.time.Duration duration48 = hours46.toStandardDuration();
        org.joda.time.DateTime dateTime49 = dateTime39.plus((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Duration duration50 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration51 = duration50.toDuration();
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.DateTimeZone dateTimeZone57 = chronology56.getZone();
        org.joda.time.Period period58 = duration50.toPeriod(chronology56);
        boolean boolean59 = duration48.isShorterThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.PeriodType periodType60 = org.joda.time.PeriodType.days();
        org.joda.time.Period period61 = duration50.toPeriod(periodType60);
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.Chronology chronology68 = interval67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 1, periodType63, chronology68);
        org.joda.time.DateTimeField dateTimeField70 = chronology68.yearOfCentury();
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval75 = mutableInterval74.toInterval();
        org.joda.time.Chronology chronology76 = interval75.getChronology();
        org.joda.time.DateTimeZone dateTimeZone77 = chronology76.getZone();
        java.lang.String str79 = dateTimeZone77.getName(100L);
        org.joda.time.DateTime dateTime80 = dateTime71.withZoneRetainFields(dateTimeZone77);
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval84 = mutableInterval83.toInterval();
        org.joda.time.Chronology chronology85 = interval84.getChronology();
        org.joda.time.DateTimeZone dateTimeZone86 = chronology85.getZone();
        java.lang.String str88 = dateTimeZone86.getName(100L);
        org.joda.time.DateTime dateTime89 = dateTime80.withZoneRetainFields(dateTimeZone86);
        org.joda.time.Chronology chronology90 = chronology68.withZone(dateTimeZone86);
        org.joda.time.Period period91 = new org.joda.time.Period(0L, 10L, periodType60, chronology68);
        boolean boolean92 = dateTimeFieldType24.isSupported(chronology68);
        org.joda.time.DateTimeField dateTimeField93 = chronology68.yearOfEra();
        org.joda.time.DateTimeField dateTimeField94 = dateTimeFieldType17.getField(chronology68);
        org.joda.time.DateTimeField dateTimeField95 = chronology68.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime71", (instant0.compareTo(dateTime71) == 0) == instant0.equals(dateTime71));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 10);
        org.joda.time.Instant instant4 = instant3.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        mutablePeriod14.addMillis(2022);
        mutablePeriod14.add(56, 10, (int) (short) -1, 56, (int) (short) 1, 1970, (-90), 21);
        int int26 = mutablePeriod14.getHours();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period39 = org.joda.time.Period.days((-1));
        org.joda.time.Period period41 = period39.withWeeks((int) 'a');
        java.lang.String str42 = period39.toString();
        mutablePeriod37.setPeriod((org.joda.time.ReadablePeriod) period39);
        mutablePeriod37.addSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 1, periodType48, chronology53);
        org.joda.time.Chronology chronology55 = chronology53.withUTC();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.dayOfYear();
        java.lang.String str57 = chronology55.toString();
        mutablePeriod37.add(10L, chronology55);
        mutablePeriod14.setPeriod(355200035L, (long) (-292275054), chronology55);
        org.joda.time.DateTimeField dateTimeField60 = dateTimeFieldType5.getField(chronology55);
        boolean boolean61 = instant3.equals((java.lang.Object) dateTimeFieldType5);
        java.util.Date date62 = instant3.toDate();
        org.joda.time.Instant instant64 = instant3.withMillis(86400000L);
        org.joda.time.MutableDateTime mutableDateTime65 = instant3.toMutableDateTime();
        boolean boolean66 = instant3.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime65", (instant3.compareTo(mutableDateTime65) == 0) == instant3.equals(mutableDateTime65));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Instant instant3 = instant1.plus(157784803200024L);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTime();
        int int5 = mutableDateTime4.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone3);
        int int5 = dateTime4.getMillisOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.plusMillis((int) '#');
        boolean boolean9 = dateTime7.isAfter((-1L));
        int int10 = dateTime7.getCenturyOfEra();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime7.toDateTime(chronology11);
        org.joda.time.Period period13 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Duration duration14 = duration1.toDuration();
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, (org.joda.time.ReadableInstant) instant15);
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.plus(readableDuration23);
        org.joda.time.DateTime.Property property25 = dateTime22.minuteOfDay();
        org.joda.time.Duration duration26 = period16.toDurationTo((org.joda.time.ReadableInstant) dateTime22);
        int int27 = dateTime22.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime22", (instant15.compareTo(dateTime22) == 0) == instant15.equals(dateTime22));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.Interval interval5 = interval3.toInterval();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval8 = interval5.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', chronology16);
        org.joda.time.ReadablePartial readablePartial19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.withFields(readablePartial19);
        org.joda.time.DateTime.Property property21 = dateTime20.millisOfDay();
        org.joda.time.DateTime dateTime23 = dateTime20.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property24 = dateTime20.era();
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime28 = dateTime20.withDurationAdded((org.joda.time.ReadableDuration) duration26, 0);
        long long29 = duration26.getStandardHours();
        org.joda.time.Duration duration30 = duration7.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration32 = duration26.minus((long) 54);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone34);
        org.joda.time.DateTime dateTime36 = dateTime35.withLaterOffsetAtOverlap();
        org.joda.time.Duration duration37 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration38 = duration37.toDuration();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.Duration duration40 = duration37.toDuration();
        org.joda.time.Duration duration42 = duration40.plus(4838400100L);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone44);
        int int46 = dateTime45.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean57 = mutableInterval52.isBefore((org.joda.time.ReadableInterval) mutableInterval56);
        boolean boolean58 = mutableInterval49.contains((org.joda.time.ReadableInterval) mutableInterval56);
        org.joda.time.Weeks weeks59 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval56);
        org.joda.time.DateTime dateTime60 = dateTime45.plus((org.joda.time.ReadablePeriod) weeks59);
        org.joda.time.DateTime dateTime62 = dateTime45.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property63 = dateTime45.secondOfDay();
        org.joda.time.Instant instant64 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval71 = mutableInterval70.toInterval();
        org.joda.time.Chronology chronology72 = interval71.getChronology();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) 1, periodType67, chronology72);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((long) '4', chronology72);
        org.joda.time.ReadablePartial readablePartial75 = null;
        org.joda.time.DateTime dateTime76 = dateTime74.withFields(readablePartial75);
        boolean boolean77 = instant64.isAfter((org.joda.time.ReadableInstant) dateTime74);
        org.joda.time.DateTime.Property property78 = dateTime74.dayOfWeek();
        int int79 = property78.getMaximumValue();
        org.joda.time.DateTime dateTime80 = property78.roundFloorCopy();
        boolean boolean81 = dateTime45.isBefore((org.joda.time.ReadableInstant) dateTime80);
        boolean boolean82 = duration42.equals((java.lang.Object) boolean81);
        boolean boolean83 = duration32.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.DateTimeZone dateTimeZone85 = null;
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone85);
        int int87 = dateTime86.getDayOfMonth();
        org.joda.time.DateTime dateTime89 = dateTime86.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property90 = dateTime89.secondOfMinute();
        org.joda.time.DateTime dateTime91 = property90.roundFloorCopy();
        org.joda.time.DateTime.Property property92 = dateTime91.weekyear();
        org.joda.time.Instant instant93 = dateTime91.toInstant();
        org.joda.time.Interval interval94 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration42, (org.joda.time.ReadableInstant) dateTime91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime80 and instant93", (dateTime80.compareTo(instant93) == 0) == dateTime80.equals(instant93));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTime();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, periodType8, chronology13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', chronology13);
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, periodType19, chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', chronology24);
        org.joda.time.ReadablePartial readablePartial27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withFields(readablePartial27);
        boolean boolean29 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime26);
        boolean boolean30 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime26);
        java.lang.String str31 = dateTime15.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType32.getRangeDurationType();
        int int34 = dateTime15.get(dateTimeFieldType32);
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType32.getRangeDurationType();
        org.joda.time.DateTime dateTime37 = dateTime5.withField(dateTimeFieldType32, 1);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(8);
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = dateTime5.toDateTime(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime40", (instant16.compareTo(dateTime40) == 0) == instant16.equals(dateTime40));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("1970");
        org.joda.time.Instant instant2 = dateTime1.toInstant();
        org.joda.time.Instant instant5 = instant2.withDurationAdded((long) (-43), 3600000);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) instant2, readableDuration6);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime17 = dateTime15.plus((long) (short) -1);
        org.joda.time.Hours hours18 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours19 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours20 = hours18.minus(hours19);
        org.joda.time.Duration duration21 = hours19.toStandardDuration();
        org.joda.time.Duration duration22 = duration21.toDuration();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableDuration) duration21);
        mutableInterval7.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant2", (dateTime1.compareTo(instant2) == 0) == dateTime1.equals(instant2));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.DateTime.Property property2 = dateTime0.minuteOfDay();
        boolean boolean3 = dateTime0.isEqualNow();
        org.joda.time.DateTime.Property property4 = dateTime0.millisOfDay();
        java.lang.String str5 = property4.getAsShortText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime7 = property6.roundHalfCeilingCopy();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 1, periodType10, chronology15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', chronology15);
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, periodType21, chronology26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '4', chronology26);
        org.joda.time.ReadablePartial readablePartial29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.withFields(readablePartial29);
        boolean boolean31 = instant18.isAfter((org.joda.time.ReadableInstant) dateTime28);
        boolean boolean32 = dateTime17.isAfter((org.joda.time.ReadableInstant) dateTime28);
        java.lang.String str33 = dateTime28.toString();
        org.joda.time.DateTime dateTime34 = dateTime28.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime36 = dateTime34.withMillisOfDay(1970);
        long long37 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTime36.toString("60", locale39);
        org.joda.time.DateTime dateTime42 = dateTime36.plusHours((-613704));
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone45);
        int int47 = dateTime46.getMillisOfDay();
        org.joda.time.DateTime dateTime49 = dateTime46.plusMillis((int) '#');
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval56 = mutableInterval55.toInterval();
        org.joda.time.Chronology chronology57 = interval56.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 1, periodType52, chronology57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) '4', chronology57);
        org.joda.time.DateTime dateTime60 = dateTime49.withChronology(chronology57);
        int int61 = dateTimeZone43.getOffset((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.Chronology chronology68 = interval67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 1, periodType63, chronology68);
        org.joda.time.DateTimeField dateTimeField70 = chronology68.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone71 = chronology68.getZone();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHours(52);
        org.joda.time.Chronology chronology74 = chronology68.withZone(dateTimeZone73);
        org.joda.time.DateTime dateTime75 = org.joda.time.DateTime.now(chronology74);
        org.joda.time.DateTime dateTime77 = dateTime75.withMillis(3615010L);
        boolean boolean78 = dateTime49.isAfter((org.joda.time.ReadableInstant) dateTime77);
        boolean boolean79 = dateTime36.isBefore((org.joda.time.ReadableInstant) dateTime49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and dateTime75", (instant18.compareTo(dateTime75) == 0) == instant18.equals(dateTime75));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        int int12 = dateTime11.getMinuteOfHour();
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology24.getZone();
        java.lang.String str27 = dateTimeZone25.getName(100L);
        org.joda.time.DateTime dateTime28 = dateTime19.withZoneRetainFields(dateTimeZone25);
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.DateTimeZone dateTimeZone34 = chronology33.getZone();
        java.lang.String str36 = dateTimeZone34.getName(100L);
        org.joda.time.DateTime dateTime37 = dateTime28.withZoneRetainFields(dateTimeZone34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        long long40 = dateTimeZone18.getMillisKeepLocal(dateTimeZone34, (long) 11);
        org.joda.time.DateTime dateTime41 = dateTime11.toDateTime(dateTimeZone34);
        org.joda.time.Instant instant42 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 1, periodType45, chronology50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) '4', chronology50);
        org.joda.time.ReadablePartial readablePartial53 = null;
        org.joda.time.DateTime dateTime54 = dateTime52.withFields(readablePartial53);
        boolean boolean55 = instant42.isAfter((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTime.Property property56 = dateTime52.dayOfWeek();
        org.joda.time.DateTime dateTime57 = property56.withMaximumValue();
        org.joda.time.DateTime dateTime59 = dateTime57.withWeekyear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime60 = dateTime59.toLocalDateTime();
        org.joda.time.DateTime.Property property61 = dateTime59.secondOfDay();
        org.joda.time.LocalDateTime localDateTime62 = dateTime59.toLocalDateTime();
        boolean boolean63 = dateTime41.isBefore((org.joda.time.ReadableInstant) dateTime59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant42", (dateTime19.compareTo(instant42) == 0) == dateTime19.equals(instant42));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration14 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', chronology22);
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.withFields(readablePartial25);
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfDay();
        org.joda.time.DateTime dateTime28 = dateTime26.withEarlierOffsetAtOverlap();
        int int29 = dateTime26.getDayOfWeek();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, periodType31, chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology36.getZone();
        org.joda.time.DateTime dateTime40 = dateTime26.withChronology(chronology36);
        org.joda.time.Interval interval41 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Instant instant43 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration14, 48);
        org.joda.time.Duration duration44 = duration14.toDuration();
        org.joda.time.Duration duration45 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration46 = duration45.toDuration();
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.DateTimeZone dateTimeZone52 = chronology51.getZone();
        org.joda.time.Period period53 = duration45.toPeriod(chronology51);
        boolean boolean54 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration45);
        long long55 = duration14.getStandardSeconds();
        org.joda.time.Duration duration56 = duration14.toDuration();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone58);
        int int60 = dateTime59.getDayOfMonth();
        org.joda.time.DateTime dateTime62 = dateTime59.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property63 = dateTime62.dayOfYear();
        org.joda.time.DateTime dateTime64 = property63.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime66 = property63.addWrapFieldToCopy(1);
        org.joda.time.Period period67 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration56, (org.joda.time.ReadableInstant) dateTime66);
        boolean boolean69 = dateTime66.isAfter(35L);
        org.joda.time.DateTime.Property property70 = dateTime66.secondOfMinute();
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval76 = mutableInterval75.toInterval();
        org.joda.time.Chronology chronology77 = interval76.getChronology();
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((long) 1, periodType72, chronology77);
        org.joda.time.DateTimeField dateTimeField79 = chronology77.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField80 = chronology77.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime81 = dateTime66.toMutableDateTime(chronology77);
        org.joda.time.MutableDateTime mutableDateTime82 = dateTime66.toMutableDateTime();
        org.joda.time.MutableInterval mutableInterval85 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval86 = mutableInterval85.toInterval();
        org.joda.time.Chronology chronology87 = interval86.getChronology();
        org.joda.time.DateTime dateTime88 = new org.joda.time.DateTime(chronology87);
        int int89 = dateTime88.getSecondOfMinute();
        org.joda.time.DateTime dateTime91 = dateTime88.withWeekyear(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType92 = org.joda.time.DateTimeFieldType.year();
        int int93 = dateTime88.get(dateTimeFieldType92);
        java.lang.String str94 = dateTimeFieldType92.getName();
        int int95 = dateTime66.get(dateTimeFieldType92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime88", (instant0.compareTo(dateTime88) == 0) == instant0.equals(dateTime88));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (short) 10);
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime5.toCalendar(locale6);
        org.joda.time.DateTime dateTime9 = dateTime5.plusWeeks((-6));
        org.joda.time.DateTime dateTime11 = dateTime5.plus(100L);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone13);
        java.util.Locale locale15 = null;
        java.util.Calendar calendar16 = dateTime14.toCalendar(locale15);
        org.joda.time.Instant instant17 = dateTime14.toInstant();
        org.joda.time.Chronology chronology18 = instant17.getChronology();
        boolean boolean19 = dateTime11.isEqual((org.joda.time.ReadableInstant) instant17);
        int int20 = dateTime11.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant17", (dateTime14.compareTo(instant17) == 0) == dateTime14.equals(instant17));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime6 = dateTime5.toLocalDateTime();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType10 = null;
        int int11 = minutes9.get(durationFieldType10);
        org.joda.time.DurationFieldType durationFieldType12 = minutes9.getFieldType();
        boolean boolean13 = minutes7.isGreaterThan(minutes9);
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes9, (org.joda.time.ReadableInstant) instant14);
        org.joda.time.DateTime dateTime16 = instant14.toDateTimeISO();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Duration duration23 = org.joda.time.Duration.millis(53035L);
        org.joda.time.Interval interval24 = interval21.withDurationAfterStart((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Interval interval25 = interval17.gap((org.joda.time.ReadableInterval) interval24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant14", (dateTime5.compareTo(instant14) == 0) == dateTime5.equals(instant14));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.clockhourOfDay();
        boolean boolean9 = dateTimeField8.isLenient();
        int int10 = dateTime0.get(dateTimeField8);
        long long13 = dateTimeField8.addWrapField((long) 711, 3600001);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = chronology6.getZone();
        long long12 = dateTimeZone9.convertLocalToUTC((-6380815651200000L), true);
        long long14 = dateTimeZone9.convertUTCToLocal((long) 53);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekyear((int) 'a');
        org.joda.time.Instant instant18 = dateTime17.toInstant();
        org.joda.time.Chronology chronology19 = instant18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant18", (dateTime17.compareTo(instant18) == 0) == dateTime17.equals(instant18));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime13 = dateTime11.withEarlierOffsetAtOverlap();
        int int14 = dateTime11.getDayOfWeek();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType16, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology21.getZone();
        org.joda.time.DateTime dateTime25 = dateTime11.withChronology(chronology21);
        org.joda.time.DateTime.Property property26 = dateTime25.weekyear();
        org.joda.time.DateTime dateTime27 = dateTime25.toDateTime();
        org.joda.time.Minutes minutes29 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType30 = null;
        int int31 = minutes29.get(durationFieldType30);
        int int33 = minutes29.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod34 = minutes29.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType36 = minutes29.getFieldType(0);
        org.joda.time.DateTime dateTime38 = dateTime27.withFieldAdded(durationFieldType36, (-1870));
        org.joda.time.DateTime dateTime40 = dateTime27.minusHours((-196999));
        org.joda.time.DateTime.Property property41 = dateTime27.minuteOfHour();
        org.joda.time.DateTime dateTime42 = property41.roundFloorCopy();
        org.joda.time.Instant instant43 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 1, periodType46, chronology51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) '4', chronology51);
        org.joda.time.ReadablePartial readablePartial54 = null;
        org.joda.time.DateTime dateTime55 = dateTime53.withFields(readablePartial54);
        boolean boolean56 = instant43.isAfter((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime.Property property57 = dateTime53.dayOfWeek();
        org.joda.time.DateTime dateTime58 = property57.withMaximumValue();
        org.joda.time.DateTime dateTime60 = dateTime58.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant61 = new org.joda.time.Instant((java.lang.Object) dateTime58);
        java.lang.String str62 = instant61.toString();
        org.joda.time.Chronology chronology63 = instant61.getChronology();
        org.joda.time.format.PeriodPrinter periodPrinter64 = null;
        org.joda.time.format.PeriodParser periodParser65 = null;
        org.joda.time.format.PeriodFormatter periodFormatter66 = new org.joda.time.format.PeriodFormatter(periodPrinter64, periodParser65);
        org.joda.time.format.PeriodParser periodParser67 = periodFormatter66.getParser();
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType69 = periodType68.withMinutesRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter70 = periodFormatter66.withParseType(periodType69);
        java.util.Locale locale71 = null;
        org.joda.time.format.PeriodFormatter periodFormatter72 = periodFormatter70.withLocale(locale71);
        boolean boolean73 = periodFormatter70.isParser();
        org.joda.time.PeriodType periodType74 = periodFormatter70.getParseType();
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableInstant) instant61, periodType74);
        org.joda.time.MutableInterval mutableInterval78 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval79 = mutableInterval78.toInterval();
        org.joda.time.Chronology chronology80 = interval79.getChronology();
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime(chronology80);
        org.joda.time.DateTimeZone dateTimeZone82 = chronology80.getZone();
        org.joda.time.MutableDateTime mutableDateTime83 = dateTime42.toMutableDateTime(dateTimeZone82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant43 and dateTime81", (instant43.compareTo(dateTime81) == 0) == instant43.equals(dateTime81));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        int int10 = dateTime9.getMinuteOfDay();
        int int11 = dateTime9.getEra();
        org.joda.time.DateMidnight dateMidnight12 = dateTime9.toDateMidnight();
        int int13 = dateMidnight12.getHourOfDay();
        org.joda.time.Duration duration14 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', chronology22);
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.withFields(readablePartial25);
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfDay();
        org.joda.time.DateTime dateTime28 = dateTime26.withEarlierOffsetAtOverlap();
        int int29 = dateTime26.getDayOfWeek();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, periodType31, chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology36.getZone();
        org.joda.time.DateTime dateTime40 = dateTime26.withChronology(chronology36);
        org.joda.time.Interval interval41 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period44 = duration14.toPeriodFrom((org.joda.time.ReadableInstant) dateTime43);
        long long45 = duration14.getMillis();
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight12, (org.joda.time.ReadableDuration) duration14);
        org.joda.time.Instant instant47 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 1, periodType50, chronology55);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) '4', chronology55);
        org.joda.time.ReadablePartial readablePartial58 = null;
        org.joda.time.DateTime dateTime59 = dateTime57.withFields(readablePartial58);
        boolean boolean60 = instant47.isAfter((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime.Property property61 = dateTime57.dayOfWeek();
        boolean boolean63 = dateTime57.isEqual((long) 55);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period74 = org.joda.time.Period.days((-1));
        org.joda.time.Period period76 = period74.withWeeks((int) 'a');
        java.lang.String str77 = period74.toString();
        mutablePeriod72.setPeriod((org.joda.time.ReadablePeriod) period74);
        int int79 = mutablePeriod72.getMillis();
        org.joda.time.MutablePeriod mutablePeriod80 = mutablePeriod72.toMutablePeriod();
        mutablePeriod80.add((int) '4', (int) (short) 0, (int) (byte) 0, (int) (short) 10, 1, (int) 'a', (int) (short) 100, (int) (short) -1);
        mutablePeriod80.addMillis((int) ' ');
        org.joda.time.DateTime dateTime93 = dateTime57.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod80, (-120));
        org.joda.time.Interval interval94 = duration14.toIntervalFrom((org.joda.time.ReadableInstant) dateTime57);
        java.lang.String str95 = duration14.toString();
        org.joda.time.Duration duration96 = duration14.toDuration();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant47", (dateTime0.compareTo(instant47) == 0) == dateTime0.equals(instant47));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.Interval interval5 = interval3.toInterval();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval8 = interval5.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration7);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        long long23 = interval21.toDurationMillis();
        mutablePeriod17.setPeriod((org.joda.time.ReadableInterval) interval21);
        boolean boolean25 = interval5.isBefore((org.joda.time.ReadableInterval) interval21);
        org.joda.time.Instant instant26 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', chronology34);
        org.joda.time.ReadablePartial readablePartial37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withFields(readablePartial37);
        boolean boolean39 = instant26.isAfter((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Period period41 = org.joda.time.Period.days((-1));
        org.joda.time.Period period43 = period41.withWeeks((int) 'a');
        org.joda.time.Period period45 = period41.plusMonths((int) (short) -1);
        org.joda.time.Period period47 = period41.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime48 = dateTime36.plus((org.joda.time.ReadablePeriod) period41);
        org.joda.time.Instant instant49 = dateTime48.toInstant();
        boolean boolean50 = interval5.isAfter((org.joda.time.ReadableInstant) instant49);
        org.joda.time.MutableDateTime mutableDateTime51 = instant49.toMutableDateTimeISO();
        org.joda.time.Duration duration52 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration53 = duration52.toDuration();
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        org.joda.time.DateTimeZone dateTimeZone59 = chronology58.getZone();
        org.joda.time.Period period60 = duration52.toPeriod(chronology58);
        org.joda.time.Duration duration63 = duration52.withDurationAdded((-349200000L), (int) 'a');
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant49, (org.joda.time.ReadableDuration) duration63);
        org.joda.time.Chronology chronology65 = instant49.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime48 and instant49", (dateTime48.compareTo(instant49) == 0) == dateTime48.equals(instant49));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((-7), 947, 48, (int) (short) 0);
        java.lang.String str5 = mutablePeriod4.toString();
        org.joda.time.Period period7 = org.joda.time.Period.weeks(852);
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        int int12 = minutes10.get(durationFieldType11);
        org.joda.time.DurationFieldType durationFieldType13 = minutes10.getFieldType();
        boolean boolean14 = minutes8.isGreaterThan(minutes10);
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes10, (org.joda.time.ReadableInstant) instant15);
        org.joda.time.DateTime dateTime17 = instant15.toDateTimeISO();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period7, (org.joda.time.ReadableInstant) instant15);
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) mutablePeriod4, (org.joda.time.ReadableInstant) instant15);
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, periodType23, chronology28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) '4', chronology28);
        org.joda.time.ReadablePartial readablePartial31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.withFields(readablePartial31);
        boolean boolean33 = instant20.isAfter((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Duration duration34 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) '4', chronology42);
        org.joda.time.ReadablePartial readablePartial45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.withFields(readablePartial45);
        org.joda.time.DateTime.Property property47 = dateTime46.millisOfDay();
        org.joda.time.DateTime dateTime48 = dateTime46.withEarlierOffsetAtOverlap();
        int int49 = dateTime46.getDayOfWeek();
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 1, periodType51, chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone59 = chronology56.getZone();
        org.joda.time.DateTime dateTime60 = dateTime46.withChronology(chronology56);
        org.joda.time.Interval interval61 = duration34.toIntervalTo((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Instant instant63 = instant20.withDurationAdded((org.joda.time.ReadableDuration) duration34, 48);
        org.joda.time.Duration duration64 = duration34.toDuration();
        org.joda.time.Duration duration65 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration66 = duration65.toDuration();
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval70 = mutableInterval69.toInterval();
        org.joda.time.Chronology chronology71 = interval70.getChronology();
        org.joda.time.DateTimeZone dateTimeZone72 = chronology71.getZone();
        org.joda.time.Period period73 = duration65.toPeriod(chronology71);
        boolean boolean74 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration65);
        long long75 = duration34.getStandardSeconds();
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone77);
        int int79 = dateTime78.getDayOfMonth();
        org.joda.time.DateTime dateTime81 = dateTime78.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property82 = dateTime81.dayOfYear();
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration34, (org.joda.time.ReadableInstant) dateTime81);
        boolean boolean84 = mutableInterval19.overlaps((org.joda.time.ReadableInterval) mutableInterval83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime17", (instant15.compareTo(dateTime17) == 0) == instant15.equals(dateTime17));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) (short) -1);
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded((long) 100, (int) (short) 100);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        int int20 = dateTime19.getSecondOfMinute();
        org.joda.time.DateTime dateTime22 = dateTime19.withWeekyear(3);
        boolean boolean23 = dateTime12.isBefore((org.joda.time.ReadableInstant) dateTime22);
        java.util.Locale locale24 = null;
        java.util.Calendar calendar25 = dateTime22.toCalendar(locale24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone27);
        int int29 = dateTime28.getDayOfMonth();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, periodType31, chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology36.getZone();
        org.joda.time.DateTime dateTime40 = dateTime28.withZoneRetainFields(dateTimeZone39);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 1, periodType43, chronology48);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) '4', chronology48);
        org.joda.time.Instant instant51 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 1, periodType54, chronology59);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) '4', chronology59);
        org.joda.time.ReadablePartial readablePartial62 = null;
        org.joda.time.DateTime dateTime63 = dateTime61.withFields(readablePartial62);
        boolean boolean64 = instant51.isAfter((org.joda.time.ReadableInstant) dateTime61);
        boolean boolean65 = dateTime50.isAfter((org.joda.time.ReadableInstant) dateTime61);
        java.lang.String str66 = dateTime50.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType68 = dateTimeFieldType67.getRangeDurationType();
        int int69 = dateTime50.get(dateTimeFieldType67);
        boolean boolean70 = dateTime40.isSupported(dateTimeFieldType67);
        int int71 = dateTime22.get(dateTimeFieldType67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant51", (dateTime5.compareTo(instant51) == 0) == dateTime5.equals(instant51));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.Duration duration7 = interval5.toDuration();
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.Interval interval13 = interval11.toInterval();
        org.joda.time.Duration duration15 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval16 = interval13.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration15);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, periodType19, chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', chronology24);
        org.joda.time.ReadablePartial readablePartial27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withFields(readablePartial27);
        org.joda.time.DateTime.Property property29 = dateTime28.millisOfDay();
        org.joda.time.DateTime dateTime31 = dateTime28.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property32 = dateTime28.era();
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime36 = dateTime28.withDurationAdded((org.joda.time.ReadableDuration) duration34, 0);
        long long37 = duration34.getStandardHours();
        org.joda.time.Duration duration38 = duration15.plus((org.joda.time.ReadableDuration) duration34);
        boolean boolean39 = duration7.isLongerThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean50 = mutableInterval45.isBefore((org.joda.time.ReadableInterval) mutableInterval49);
        boolean boolean51 = mutableInterval42.contains((org.joda.time.ReadableInterval) mutableInterval49);
        org.joda.time.Period period54 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType55 = period54.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType55);
        org.joda.time.Period period57 = mutableInterval49.toPeriod(periodType55);
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant0, (org.joda.time.ReadableDuration) duration7, periodType55);
        org.joda.time.DateTime dateTime59 = instant0.toDateTimeISO();
        org.joda.time.Instant instant61 = instant0.plus((long) 56891755);
        org.joda.time.Duration duration63 = org.joda.time.Duration.standardMinutes(6000035L);
        org.joda.time.Instant instant64 = instant0.plus((org.joda.time.ReadableDuration) duration63);
        long long65 = duration63.getStandardDays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime59", (instant0.compareTo(dateTime59) == 0) == instant0.equals(dateTime59));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property15 = dateTime11.era();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Instant instant17 = dateTime16.toInstant();
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) instant17);
        org.joda.time.Instant instant20 = instant17.minus((long) 349200000);
        org.joda.time.DateTime dateTime21 = instant17.toDateTimeISO();
        org.joda.time.DateTime dateTime23 = dateTime21.withCenturyOfEra(7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant17", (dateTime16.compareTo(instant17) == 0) == dateTime16.equals(instant17));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime13 = dateTime11.withEarlierOffsetAtOverlap();
        int int14 = dateTime11.getDayOfWeek();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType16, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology21.getZone();
        org.joda.time.DateTime dateTime25 = dateTime11.withChronology(chronology21);
        org.joda.time.DateTime.Property property26 = dateTime25.weekyear();
        java.lang.String str27 = property26.getName();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone29);
        int int31 = dateTime30.getMillisOfDay();
        org.joda.time.DateTime dateTime33 = dateTime30.plusMillis((int) '#');
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, periodType36, chronology41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) '4', chronology41);
        org.joda.time.DateTime dateTime44 = dateTime33.withChronology(chronology41);
        int int45 = dateTime44.getYearOfEra();
        org.joda.time.Chronology chronology46 = dateTime44.getChronology();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.Instant instant48 = dateTime47.toInstant();
        org.joda.time.DateTime.Property property49 = dateTime47.minuteOfDay();
        org.joda.time.DateTime dateTime51 = dateTime47.minusWeeks(19);
        org.joda.time.Seconds seconds52 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime47);
        int int53 = property26.getDifference((org.joda.time.ReadableInstant) dateTime47);
        java.util.Locale locale54 = null;
        int int55 = property26.getMaximumShortTextLength(locale54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and instant48", (dateTime47.compareTo(instant48) == 0) == dateTime47.equals(instant48));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.Hours hours2 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours3 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours4 = hours2.minus(hours3);
        org.joda.time.Duration duration5 = hours3.toStandardDuration();
        org.joda.time.Instant instant6 = instant0.minus((org.joda.time.ReadableDuration) duration5);
        org.joda.time.DateTime dateTime7 = instant0.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime7.toDateTimeISO();
        java.lang.Class<?> wildcardClass9 = dateTime8.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime8", (instant0.compareTo(dateTime8) == 0) == instant0.equals(dateTime8));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime5.minus(349200757L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = dateTime5.withZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        long long18 = dateTimeZone14.convertLocalToUTC((-31L), true, (long) 100);
        org.joda.time.DateTime dateTime19 = dateTime12.toDateTime(dateTimeZone14);
        long long21 = dateTimeZone14.convertUTCToLocal((-185512857897600000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime19", (dateTime5.compareTo(dateTime19) == 0) == dateTime5.equals(dateTime19));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property15 = dateTime11.era();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime19 = dateTime11.withDurationAdded((org.joda.time.ReadableDuration) duration17, 0);
        org.joda.time.Hours hours20 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours21 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours22 = hours20.minus(hours21);
        org.joda.time.Duration duration23 = hours21.toStandardDuration();
        org.joda.time.Duration duration24 = duration17.minus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardHours((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone28);
        int int30 = dateTime29.getMillisOfDay();
        org.joda.time.DateTime dateTime32 = dateTime29.plusMillis((int) '#');
        boolean boolean34 = dateTime32.isAfter((-1L));
        int int35 = dateTime32.getCenturyOfEra();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = dateTime32.toDateTime(chronology36);
        org.joda.time.Period period38 = duration26.toPeriodFrom((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Duration duration39 = duration26.toDuration();
        org.joda.time.Instant instant40 = org.joda.time.Instant.now();
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration39, (org.joda.time.ReadableInstant) instant40);
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology46);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.DateTime dateTime49 = dateTime47.plus(readableDuration48);
        org.joda.time.DateTime.Property property50 = dateTime47.minuteOfDay();
        org.joda.time.Duration duration51 = period41.toDurationTo((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean52 = duration23.isLongerThan((org.joda.time.ReadableDuration) duration51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant40 and dateTime47", (instant40.compareTo(dateTime47) == 0) == instant40.equals(dateTime47));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        int int15 = mutablePeriod8.getMillis();
        org.joda.time.DurationFieldType durationFieldType17 = mutablePeriod8.getFieldType(0);
        mutablePeriod8.setDays((int) (byte) -1);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.Instant instant21 = dateTime20.toInstant();
        org.joda.time.Duration duration22 = mutablePeriod8.toDurationFrom((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, periodType27, chronology32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) '4', chronology32);
        org.joda.time.ReadablePartial readablePartial35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.withFields(readablePartial35);
        org.joda.time.DateTime.Property property37 = dateTime36.millisOfDay();
        org.joda.time.DateTime dateTime39 = dateTime36.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime41 = dateTime36.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours42 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours43 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours44 = hours42.minus(hours43);
        org.joda.time.Duration duration45 = hours43.toStandardDuration();
        org.joda.time.DateTime dateTime46 = dateTime36.plus((org.joda.time.ReadableDuration) duration45);
        org.joda.time.Duration duration47 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration48 = duration47.toDuration();
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.DateTimeZone dateTimeZone54 = chronology53.getZone();
        org.joda.time.Period period55 = duration47.toPeriod(chronology53);
        boolean boolean56 = duration45.isShorterThan((org.joda.time.ReadableDuration) duration47);
        org.joda.time.PeriodType periodType57 = org.joda.time.PeriodType.days();
        org.joda.time.Period period58 = duration47.toPeriod(periodType57);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval64 = mutableInterval63.toInterval();
        org.joda.time.Chronology chronology65 = interval64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) 1, periodType60, chronology65);
        org.joda.time.DateTimeField dateTimeField67 = chronology65.yearOfCentury();
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval72 = mutableInterval71.toInterval();
        org.joda.time.Chronology chronology73 = interval72.getChronology();
        org.joda.time.DateTimeZone dateTimeZone74 = chronology73.getZone();
        java.lang.String str76 = dateTimeZone74.getName(100L);
        org.joda.time.DateTime dateTime77 = dateTime68.withZoneRetainFields(dateTimeZone74);
        org.joda.time.MutableInterval mutableInterval80 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval81 = mutableInterval80.toInterval();
        org.joda.time.Chronology chronology82 = interval81.getChronology();
        org.joda.time.DateTimeZone dateTimeZone83 = chronology82.getZone();
        java.lang.String str85 = dateTimeZone83.getName(100L);
        org.joda.time.DateTime dateTime86 = dateTime77.withZoneRetainFields(dateTimeZone83);
        org.joda.time.Chronology chronology87 = chronology65.withZone(dateTimeZone83);
        org.joda.time.Period period88 = new org.joda.time.Period(0L, 10L, periodType57, chronology65);
        org.joda.time.DateTime dateTime89 = org.joda.time.DateTime.now(chronology65);
        org.joda.time.DateTime dateTime90 = dateTime20.toDateTime(chronology65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and dateTime68", (instant21.compareTo(dateTime68) == 0) == instant21.equals(dateTime68));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 10);
        org.joda.time.Instant instant6 = instant0.withDurationAdded((-54432000000L), 3);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.Instant instant9 = instant6.minus(0L);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone12);
        int int14 = dateTime13.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean25 = mutableInterval20.isBefore((org.joda.time.ReadableInterval) mutableInterval24);
        boolean boolean26 = mutableInterval17.contains((org.joda.time.ReadableInterval) mutableInterval24);
        org.joda.time.Weeks weeks27 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval24);
        org.joda.time.DateTime dateTime28 = dateTime13.plus((org.joda.time.ReadablePeriod) weeks27);
        org.joda.time.DateTime dateTime30 = dateTime13.minusDays((int) (byte) 1);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 1, periodType33, chronology38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) '4', chronology38);
        org.joda.time.ReadablePartial readablePartial41 = null;
        org.joda.time.DateTime dateTime42 = dateTime40.withFields(readablePartial41);
        org.joda.time.DateTime.Property property43 = dateTime42.millisOfDay();
        org.joda.time.DateTime dateTime45 = dateTime42.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property46 = dateTime42.era();
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime50 = dateTime42.withDurationAdded((org.joda.time.ReadableDuration) duration48, 0);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableDuration) duration48);
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) 1, periodType53, chronology58);
        org.joda.time.DateTimeField dateTimeField60 = chronology58.yearOfCentury();
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        org.joda.time.Chronology chronology66 = interval65.getChronology();
        org.joda.time.DateTimeZone dateTimeZone67 = chronology66.getZone();
        java.lang.String str69 = dateTimeZone67.getName(100L);
        org.joda.time.DateTime dateTime70 = dateTime61.withZoneRetainFields(dateTimeZone67);
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval74 = mutableInterval73.toInterval();
        org.joda.time.Chronology chronology75 = interval74.getChronology();
        org.joda.time.DateTimeZone dateTimeZone76 = chronology75.getZone();
        java.lang.String str78 = dateTimeZone76.getName(100L);
        org.joda.time.DateTime dateTime79 = dateTime70.withZoneRetainFields(dateTimeZone76);
        org.joda.time.Chronology chronology80 = chronology58.withZone(dateTimeZone76);
        org.joda.time.Period period81 = duration48.toPeriod(chronology80);
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime(4838400100L, chronology80);
        org.joda.time.DateTime dateTime84 = dateTime82.plusMillis(26);
        org.joda.time.Weeks weeks85 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) instant9, (org.joda.time.ReadableInstant) dateTime84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime7", (instant9.compareTo(dateTime7) == 0) == instant9.equals(dateTime7));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean7 = mutableInterval2.isBefore((org.joda.time.ReadableInterval) mutableInterval6);
        java.lang.Object obj8 = mutableInterval2.clone();
        long long9 = mutableInterval2.getStartMillis();
        org.joda.time.Duration duration10 = mutableInterval2.toDuration();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period21 = org.joda.time.Period.days((-1));
        org.joda.time.Period period23 = period21.withWeeks((int) 'a');
        java.lang.String str24 = period21.toString();
        mutablePeriod19.setPeriod((org.joda.time.ReadablePeriod) period21);
        mutablePeriod19.addMonths((int) (short) -1);
        org.joda.time.Period period29 = org.joda.time.Period.days((-1));
        org.joda.time.Period period31 = period29.withWeeks((int) 'a');
        org.joda.time.Period period33 = period29.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType34 = null;
        boolean boolean35 = period33.isSupported(durationFieldType34);
        mutablePeriod19.add((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Period period38 = period33.withMonths(1);
        org.joda.time.Period period40 = period38.withSeconds(0);
        org.joda.time.Period period41 = period38.toPeriod();
        org.joda.time.Period period43 = period38.plusMonths(19);
        org.joda.time.Period period45 = period43.minusSeconds((-292275054));
        org.joda.time.Instant instant46 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Instant instant49 = instant46.withDurationAdded(readableDuration47, 10);
        org.joda.time.Instant instant52 = instant46.withDurationAdded((-54432000000L), 3);
        org.joda.time.DateTime dateTime53 = instant52.toDateTime();
        org.joda.time.Duration duration54 = period43.toDurationFrom((org.joda.time.ReadableInstant) instant52);
        boolean boolean55 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant52 and dateTime53", (instant52.compareTo(dateTime53) == 0) == instant52.equals(dateTime53));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.Duration duration5 = interval3.toDuration();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str7 = periodType6.getName();
        org.joda.time.PeriodType periodType8 = periodType6.withSecondsRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (-90), periodType11);
        org.joda.time.Period period13 = mutablePeriod12.toPeriod();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.hours();
        boolean boolean15 = period13.isSupported(durationFieldType14);
        boolean boolean16 = periodType8.isSupported(durationFieldType14);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, periodType19, chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', chronology24);
        org.joda.time.DurationField durationField27 = chronology24.centuries();
        org.joda.time.DurationField durationField28 = chronology24.weekyears();
        org.joda.time.Period period29 = duration5.toPeriod(periodType8, chronology24);
        org.joda.time.Duration duration30 = duration5.toDuration();
        org.joda.time.Instant instant31 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology32 = instant31.getChronology();
        org.joda.time.Hours hours33 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours34 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours35 = hours33.minus(hours34);
        org.joda.time.Duration duration36 = hours34.toStandardDuration();
        org.joda.time.Instant instant37 = instant31.minus((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Interval interval38 = duration30.toIntervalFrom((org.joda.time.ReadableInstant) instant37);
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(chronology43);
        org.joda.time.DateTime dateTime46 = dateTime44.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime48 = dateTime46.plus((long) (short) -1);
        org.joda.time.DateTime dateTime51 = dateTime48.withDurationAdded((long) 100, (int) (short) 100);
        org.joda.time.Chronology chronology52 = dateTime51.getChronology();
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.Chronology chronology61 = interval60.getChronology();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) 1, periodType56, chronology61);
        org.joda.time.DateTimeField dateTimeField63 = chronology61.yearOfCentury();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.DateTimeZone dateTimeZone70 = chronology69.getZone();
        java.lang.String str72 = dateTimeZone70.getName(100L);
        org.joda.time.DateTime dateTime73 = dateTime64.withZoneRetainFields(dateTimeZone70);
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval77 = mutableInterval76.toInterval();
        org.joda.time.Chronology chronology78 = interval77.getChronology();
        org.joda.time.DateTimeZone dateTimeZone79 = chronology78.getZone();
        java.lang.String str81 = dateTimeZone79.getName(100L);
        org.joda.time.DateTime dateTime82 = dateTime73.withZoneRetainFields(dateTimeZone79);
        org.joda.time.Chronology chronology83 = chronology61.withZone(dateTimeZone79);
        org.joda.time.Period period84 = new org.joda.time.Period((-10L), 0L, chronology61);
        org.joda.time.Period period86 = period84.minusMillis((int) ' ');
        org.joda.time.Minutes minutes87 = period86.toStandardMinutes();
        org.joda.time.DateTime dateTime88 = dateTime51.minus((org.joda.time.ReadablePeriod) minutes87);
        int int89 = instant37.compareTo((org.joda.time.ReadableInstant) dateTime88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant31 and dateTime44", (instant31.compareTo(dateTime44) == 0) == instant31.equals(dateTime44));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.DateTime.Property property2 = dateTime0.minuteOfDay();
        boolean boolean3 = dateTime0.isEqualNow();
        org.joda.time.DateTime dateTime4 = dateTime0.toDateTimeISO();
        org.joda.time.DateTime.Property property5 = dateTime0.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime0", (instant1.compareTo(dateTime0) == 0) == instant1.equals(dateTime0));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType2);
        mutablePeriod3.setMonths((int) (byte) -1);
        int int6 = mutablePeriod3.getMinutes();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, periodType12, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', chronology17);
        org.joda.time.ReadablePartial readablePartial20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withFields(readablePartial20);
        org.joda.time.DateTime.Property property22 = dateTime21.millisOfDay();
        org.joda.time.DateTime dateTime24 = dateTime21.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime26 = dateTime21.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours27 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours28 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours29 = hours27.minus(hours28);
        org.joda.time.Duration duration30 = hours28.toStandardDuration();
        org.joda.time.DateTime dateTime31 = dateTime21.plus((org.joda.time.ReadableDuration) duration30);
        org.joda.time.Duration duration32 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration33 = duration32.toDuration();
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology38.getZone();
        org.joda.time.Period period40 = duration32.toPeriod(chronology38);
        boolean boolean41 = duration30.isShorterThan((org.joda.time.ReadableDuration) duration32);
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.days();
        org.joda.time.Period period43 = duration32.toPeriod(periodType42);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 1, periodType45, chronology50);
        org.joda.time.DateTimeField dateTimeField52 = chronology50.yearOfCentury();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        org.joda.time.DateTimeZone dateTimeZone59 = chronology58.getZone();
        java.lang.String str61 = dateTimeZone59.getName(100L);
        org.joda.time.DateTime dateTime62 = dateTime53.withZoneRetainFields(dateTimeZone59);
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        org.joda.time.Chronology chronology67 = interval66.getChronology();
        org.joda.time.DateTimeZone dateTimeZone68 = chronology67.getZone();
        java.lang.String str70 = dateTimeZone68.getName(100L);
        org.joda.time.DateTime dateTime71 = dateTime62.withZoneRetainFields(dateTimeZone68);
        org.joda.time.Chronology chronology72 = chronology50.withZone(dateTimeZone68);
        org.joda.time.Period period73 = new org.joda.time.Period(0L, 10L, periodType42, chronology50);
        mutablePeriod3.setPeriod((-61394288400000L), chronology50);
        mutablePeriod3.setSeconds(21);
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval82 = mutableInterval81.toInterval();
        org.joda.time.Chronology chronology83 = interval82.getChronology();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) 1, periodType78, chronology83);
        org.joda.time.DateTimeField dateTimeField85 = chronology83.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone86 = chronology83.getZone();
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.forOffsetHours(52);
        org.joda.time.Chronology chronology89 = chronology83.withZone(dateTimeZone88);
        org.joda.time.DateTime dateTime90 = org.joda.time.DateTime.now(chronology89);
        org.joda.time.Duration duration91 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.Duration duration93 = duration91.withMillis((-10L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime53 and dateTime90", (dateTime53.compareTo(dateTime90) == 0) == dateTime53.equals(dateTime90));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology14.getZone();
        java.lang.String str17 = dateTimeZone15.getName(100L);
        org.joda.time.DateTime dateTime18 = dateTime9.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime20 = dateTime9.plusMonths(1);
        org.joda.time.DateTime dateTime22 = dateTime9.minus(0L);
        org.joda.time.DateTime.Property property23 = dateTime9.minuteOfHour();
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, periodType27, chronology32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) '4', chronology32);
        org.joda.time.ReadablePartial readablePartial35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.withFields(readablePartial35);
        boolean boolean37 = instant24.isAfter((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime.Property property38 = dateTime34.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone40);
        int int42 = dateTime41.getDayOfMonth();
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 1, periodType44, chronology49);
        org.joda.time.DateTimeField dateTimeField51 = chronology49.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone52 = chronology49.getZone();
        org.joda.time.DateTime dateTime53 = dateTime41.withZoneRetainFields(dateTimeZone52);
        org.joda.time.DateTime dateTime54 = dateTime34.withZone(dateTimeZone52);
        org.joda.time.DateTime.Property property55 = dateTime34.yearOfCentury();
        org.joda.time.Period period56 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType57 = period56.getPeriodType();
        org.joda.time.Period period59 = period56.withMonths((int) (byte) 0);
        org.joda.time.Period period60 = period56.toPeriod();
        org.joda.time.Minutes minutes61 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period60);
        org.joda.time.Period period63 = period60.multipliedBy((int) '4');
        org.joda.time.Period period65 = period60.withWeeks((int) (short) 10);
        org.joda.time.DateTime dateTime67 = dateTime34.withPeriodAdded((org.joda.time.ReadablePeriod) period60, 3600);
        int int68 = dateTime9.compareTo((org.joda.time.ReadableInstant) dateTime34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant24", (dateTime9.compareTo(instant24) == 0) == dateTime9.equals(instant24));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfEra();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) "P-1DT100H3600.010S", periodType1, chronology3);
        org.joda.time.DurationField durationField6 = chronology3.months();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.dayOfWeek();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 1, periodType9, chronology14);
        org.joda.time.Chronology chronology16 = chronology14.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.weekyearOfCentury();
        org.joda.time.DurationField durationField19 = dateTimeField18.getRangeDurationField();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, periodType22, chronology27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', chronology27);
        org.joda.time.ReadablePartial readablePartial30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.withFields(readablePartial30);
        org.joda.time.DateTime.Property property32 = dateTime31.millisOfDay();
        org.joda.time.DateTime dateTime33 = dateTime31.withEarlierOffsetAtOverlap();
        int int34 = dateTime31.getDayOfWeek();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, periodType36, chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology41.getZone();
        org.joda.time.DateTime dateTime45 = dateTime31.withChronology(chronology41);
        org.joda.time.DateTime dateTime46 = dateTime31.withEarlierOffsetAtOverlap();
        org.joda.time.Period period47 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType48 = period47.getPeriodType();
        org.joda.time.Period period50 = period47.withMonths((int) (byte) 0);
        org.joda.time.Period period51 = period47.toPeriod();
        org.joda.time.DateTime dateTime53 = dateTime46.withPeriodAdded((org.joda.time.ReadablePeriod) period51, (int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant54 = null;
        boolean boolean55 = dateTime53.isEqual(readableInstant54);
        org.joda.time.DateTime.Property property56 = dateTime53.secondOfMinute();
        org.joda.time.LocalDate localDate57 = dateTime53.toLocalDate();
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        org.joda.time.Chronology chronology63 = interval62.getChronology();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(chronology63);
        org.joda.time.DateTime dateTime66 = dateTime64.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime68 = dateTime66.plus((long) (short) -1);
        org.joda.time.Hours hours69 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours70 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours71 = hours69.minus(hours70);
        org.joda.time.Duration duration72 = hours70.toStandardDuration();
        org.joda.time.Duration duration73 = duration72.toDuration();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime66, (org.joda.time.ReadableDuration) duration72);
        int[] intArray75 = mutablePeriod74.getValues();
        int[] intArray77 = dateTimeField18.addWrapField((org.joda.time.ReadablePartial) localDate57, 2, intArray75, 42);
        java.util.Locale locale78 = null;
        java.lang.String str79 = dateTimeField7.getAsShortText((org.joda.time.ReadablePartial) localDate57, locale78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime64", (instant2.compareTo(dateTime64) == 0) == instant2.equals(dateTime64));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = chronology8.getZone();
        java.lang.String str11 = dateTimeZone9.getName(100L);
        org.joda.time.DateTime dateTime12 = dateTime3.withZoneRetainFields(dateTimeZone9);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone9, 6000035L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str18 = dateTimeZone2.getName(3600L);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        long long21 = dateTimeZone2.getMillisKeepLocal(dateTimeZone19, 1652306400000L);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, periodType24, chronology29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) '4', chronology29);
        org.joda.time.Instant instant32 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 1, periodType35, chronology40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) '4', chronology40);
        org.joda.time.ReadablePartial readablePartial43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.withFields(readablePartial43);
        boolean boolean45 = instant32.isAfter((org.joda.time.ReadableInstant) dateTime42);
        boolean boolean46 = dateTime31.isAfter((org.joda.time.ReadableInstant) dateTime42);
        java.lang.String str47 = dateTime31.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType49 = dateTimeFieldType48.getRangeDurationType();
        int int50 = dateTime31.get(dateTimeFieldType48);
        boolean boolean51 = dateTime31.isBeforeNow();
        org.joda.time.DateTime dateTime52 = dateTime31.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight53 = dateTime52.toDateMidnight();
        int int54 = dateTime52.getHourOfDay();
        org.joda.time.DateTime dateTime56 = dateTime52.minusMonths((int) (short) 1);
        org.joda.time.DateTime dateTime58 = dateTime56.plus(25245561600000L);
        int int59 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant32", (dateTime3.compareTo(instant32) == 0) == dateTime3.equals(instant32));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime9 = property6.addWrapFieldToCopy(1);
        org.joda.time.Period period11 = new org.joda.time.Period(164096150400000L);
        org.joda.time.DateTime dateTime12 = dateTime9.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.MutablePeriod mutablePeriod13 = period11.toMutablePeriod();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology19.getZone();
        java.lang.String str22 = dateTimeZone20.getName(100L);
        org.joda.time.DateTime dateTime23 = dateTime14.withZoneRetainFields(dateTimeZone20);
        boolean boolean25 = dateTime14.isEqual((-124334351997544L));
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTime dateTime33 = dateTime31.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime35 = dateTime33.withMillisOfDay(0);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTimeField dateTimeField44 = chronology42.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology42.getZone();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours(52);
        org.joda.time.Chronology chronology48 = chronology42.withZone(dateTimeZone47);
        org.joda.time.DateTime dateTime49 = dateTime33.toDateTime(chronology48);
        mutablePeriod13.setPeriod((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime52 = dateTime33.plusMillis(29);
        org.joda.time.DateTime.Property property53 = dateTime52.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and dateTime49", (dateTime33.compareTo(dateTime49) == 0) == dateTime33.equals(dateTime49));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Period period15 = org.joda.time.Period.days((-1));
        org.joda.time.Period period17 = period15.withWeeks((int) 'a');
        org.joda.time.Period period19 = period15.plusMonths((int) (short) -1);
        org.joda.time.Period period21 = period15.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime22 = dateTime10.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, periodType26, chronology31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', chronology31);
        org.joda.time.ReadablePartial readablePartial34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.withFields(readablePartial34);
        boolean boolean36 = instant23.isAfter((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Duration duration37 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.Chronology chronology45 = interval44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 1, periodType40, chronology45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) '4', chronology45);
        org.joda.time.ReadablePartial readablePartial48 = null;
        org.joda.time.DateTime dateTime49 = dateTime47.withFields(readablePartial48);
        org.joda.time.DateTime.Property property50 = dateTime49.millisOfDay();
        org.joda.time.DateTime dateTime51 = dateTime49.withEarlierOffsetAtOverlap();
        int int52 = dateTime49.getDayOfWeek();
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 1, periodType54, chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology59.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone62 = chronology59.getZone();
        org.joda.time.DateTime dateTime63 = dateTime49.withChronology(chronology59);
        org.joda.time.Interval interval64 = duration37.toIntervalTo((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Instant instant66 = instant23.withDurationAdded((org.joda.time.ReadableDuration) duration37, 48);
        org.joda.time.Duration duration67 = duration37.toDuration();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.TimeOfDay timeOfDay69 = dateTime10.toTimeOfDay();
        org.joda.time.MutableDateTime mutableDateTime70 = dateTime10.toMutableDateTime();
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval75 = mutableInterval74.toInterval();
        org.joda.time.Chronology chronology76 = interval75.getChronology();
        org.joda.time.DateTimeZone dateTimeZone77 = chronology76.getZone();
        java.lang.String str79 = dateTimeZone77.getName(100L);
        org.joda.time.DateTime dateTime80 = dateTime71.withZoneRetainFields(dateTimeZone77);
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval84 = mutableInterval83.toInterval();
        org.joda.time.Chronology chronology85 = interval84.getChronology();
        org.joda.time.DateTimeZone dateTimeZone86 = chronology85.getZone();
        java.lang.String str88 = dateTimeZone86.getName(100L);
        org.joda.time.DateTime dateTime89 = dateTime80.withZoneRetainFields(dateTimeZone86);
        java.lang.String str90 = dateTimeZone86.toString();
        org.joda.time.DateTime dateTime91 = dateTime10.withZone(dateTimeZone86);
        org.joda.time.Duration duration93 = org.joda.time.Duration.standardHours((-6L));
        org.joda.time.Period period94 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime91, (org.joda.time.ReadableDuration) duration93);
        org.joda.time.DateTime dateTime96 = dateTime91.minusDays(22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime71", (instant0.compareTo(dateTime71) == 0) == instant0.equals(dateTime71));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(6216719587200001L, dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusWeeks(19);
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        int int12 = dateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = dateTime11.withWeekyear(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.year();
        int int16 = dateTime11.get(dateTimeFieldType15);
        java.lang.String str17 = dateTimeFieldType15.getName();
        org.joda.time.DateTime dateTime19 = dateTime5.withField(dateTimeFieldType15, 2021);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, periodType22, chronology27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', chronology27);
        org.joda.time.DateTime dateTime31 = dateTime29.withCenturyOfEra(12);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 1, periodType33, chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone41 = chronology38.getZone();
        java.lang.String str42 = dateTimeZone41.toString();
        org.joda.time.DateTime dateTime43 = dateTime29.toDateTime(dateTimeZone41);
        java.util.TimeZone timeZone44 = dateTimeZone41.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        org.joda.time.DateTime dateTime46 = dateTime5.toDateTime(dateTimeZone45);
        java.util.TimeZone timeZone47 = dateTimeZone45.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime46", (dateTime5.compareTo(dateTime46) == 0) == dateTime5.equals(dateTime46));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((java.lang.Object) dateTime15);
        org.joda.time.Hours hours19 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours20 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours21 = hours19.minus(hours20);
        org.joda.time.Duration duration22 = hours20.toStandardDuration();
        org.joda.time.Duration duration23 = duration22.toDuration();
        long long24 = duration23.getStandardSeconds();
        org.joda.time.Instant instant25 = instant18.plus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.DateTime dateTime26 = instant18.toDateTimeISO();
        org.joda.time.Chronology chronology27 = instant18.getChronology();
        long long28 = instant18.getMillis();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.DateTimeZone dateTimeZone35 = chronology34.getZone();
        java.lang.String str37 = dateTimeZone35.getName(100L);
        org.joda.time.DateTime dateTime38 = dateTime29.withZoneRetainFields(dateTimeZone35);
        int int39 = dateTime38.getMinuteOfDay();
        int int40 = dateTime38.getEra();
        org.joda.time.DateTime dateTime42 = dateTime38.minusMillis(0);
        int int43 = dateTime42.getMillisOfSecond();
        org.joda.time.DateTime dateTime45 = dateTime42.minusMillis(15);
        org.joda.time.Chronology chronology46 = dateTime45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.era();
        org.joda.time.MutableDateTime mutableDateTime48 = instant18.toMutableDateTime(chronology46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime29", (instant0.compareTo(dateTime29) == 0) == instant0.equals(dateTime29));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        int int12 = dateTime11.getMinuteOfHour();
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology24.getZone();
        java.lang.String str27 = dateTimeZone25.getName(100L);
        org.joda.time.DateTime dateTime28 = dateTime19.withZoneRetainFields(dateTimeZone25);
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.DateTimeZone dateTimeZone34 = chronology33.getZone();
        java.lang.String str36 = dateTimeZone34.getName(100L);
        org.joda.time.DateTime dateTime37 = dateTime28.withZoneRetainFields(dateTimeZone34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        long long40 = dateTimeZone18.getMillisKeepLocal(dateTimeZone34, (long) 11);
        org.joda.time.DateTime dateTime41 = dateTime11.toDateTime(dateTimeZone34);
        int int42 = dateTime41.getYearOfCentury();
        org.joda.time.Instant instant43 = dateTime41.toInstant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = dateTime41.toString(dateTimeFormatter44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and instant43", (dateTime41.compareTo(instant43) == 0) == dateTime41.equals(instant43));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone16);
        int int18 = dateTime17.getDayOfMonth();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 1, periodType20, chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology25.getZone();
        org.joda.time.DateTime dateTime29 = dateTime17.withZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = dateTime10.withZone(dateTimeZone28);
        int int32 = dateTimeZone28.getOffset((-10L));
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, periodType36, chronology41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) '4', chronology41);
        org.joda.time.ReadablePartial readablePartial44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.withFields(readablePartial44);
        org.joda.time.DateTime.Property property46 = dateTime45.millisOfDay();
        org.joda.time.DateTime dateTime48 = dateTime45.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property49 = dateTime45.era();
        org.joda.time.Duration duration51 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime53 = dateTime45.withDurationAdded((org.joda.time.ReadableDuration) duration51, 0);
        org.joda.time.Hours hours54 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours55 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours56 = hours54.minus(hours55);
        org.joda.time.Duration duration57 = hours55.toStandardDuration();
        org.joda.time.Duration duration58 = duration51.minus((org.joda.time.ReadableDuration) duration57);
        boolean boolean59 = dateTimeZone28.equals((java.lang.Object) duration58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime33", (instant0.compareTo(dateTime33) == 0) == instant0.equals(dateTime33));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime16 = dateTime11.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours17 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours18 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours19 = hours17.minus(hours18);
        org.joda.time.Duration duration20 = hours18.toStandardDuration();
        org.joda.time.DateTime dateTime21 = dateTime11.plus((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Duration duration22 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration23 = duration22.toDuration();
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.DateTimeZone dateTimeZone29 = chronology28.getZone();
        org.joda.time.Period period30 = duration22.toPeriod(chronology28);
        boolean boolean31 = duration20.isShorterThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.days();
        org.joda.time.Period period33 = duration22.toPeriod(periodType32);
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardDays(100L);
        boolean boolean36 = duration22.isEqual((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Duration duration37 = duration22.toDuration();
        org.joda.time.Instant instant38 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 1, periodType41, chronology46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) '4', chronology46);
        org.joda.time.ReadablePartial readablePartial49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.withFields(readablePartial49);
        boolean boolean51 = instant38.isAfter((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Hours hours52 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours53 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours54 = hours52.minus(hours53);
        org.joda.time.Duration duration55 = hours53.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone57);
        int int59 = dateTime58.getMillisOfDay();
        org.joda.time.DateTime dateTime61 = dateTime58.plusMillis((int) '#');
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 1, periodType64, chronology69);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) '4', chronology69);
        org.joda.time.DateTime dateTime72 = dateTime61.withChronology(chronology69);
        boolean boolean74 = dateTime72.isEqual(187200000L);
        org.joda.time.Interval interval75 = duration55.toIntervalFrom((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTime dateTime76 = dateTime72.toDateTime();
        boolean boolean77 = instant38.isEqual((org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.Instant instant78 = instant38.toInstant();
        org.joda.time.DateTime dateTime79 = instant38.toDateTimeISO();
        org.joda.time.Period period80 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) instant38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant38 and dateTime79", (instant38.compareTo(dateTime79) == 0) == instant38.equals(dateTime79));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.TimeOfDay timeOfDay2 = dateTime0.toTimeOfDay();
        org.joda.time.DateTime dateTime4 = dateTime0.withYear((int) (byte) 10);
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean17 = mutableInterval12.isBefore((org.joda.time.ReadableInterval) mutableInterval16);
        boolean boolean18 = mutableInterval9.contains((org.joda.time.ReadableInterval) mutableInterval16);
        org.joda.time.Period period19 = mutableInterval9.toPeriod();
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean27 = mutableInterval22.isBefore((org.joda.time.ReadableInterval) mutableInterval26);
        boolean boolean28 = mutableInterval9.overlaps((org.joda.time.ReadableInterval) mutableInterval22);
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean39 = mutableInterval34.isBefore((org.joda.time.ReadableInterval) mutableInterval38);
        boolean boolean40 = mutableInterval31.contains((org.joda.time.ReadableInterval) mutableInterval38);
        org.joda.time.Weeks weeks41 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval38);
        org.joda.time.Chronology chronology42 = mutableInterval38.getChronology();
        boolean boolean43 = mutableInterval9.isAfter((org.joda.time.ReadableInterval) mutableInterval38);
        org.joda.time.Chronology chronology44 = mutableInterval38.getChronology();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((long) (byte) 1, (long) (short) 10, chronology44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.minusSeconds((int) (short) 0);
        org.joda.time.Instant instant51 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 1, periodType54, chronology59);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) '4', chronology59);
        org.joda.time.ReadablePartial readablePartial62 = null;
        org.joda.time.DateTime dateTime63 = dateTime61.withFields(readablePartial62);
        boolean boolean64 = instant51.isAfter((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Duration duration65 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval72 = mutableInterval71.toInterval();
        org.joda.time.Chronology chronology73 = interval72.getChronology();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((long) 1, periodType68, chronology73);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((long) '4', chronology73);
        org.joda.time.ReadablePartial readablePartial76 = null;
        org.joda.time.DateTime dateTime77 = dateTime75.withFields(readablePartial76);
        org.joda.time.DateTime.Property property78 = dateTime77.millisOfDay();
        org.joda.time.DateTime dateTime79 = dateTime77.withEarlierOffsetAtOverlap();
        int int80 = dateTime77.getDayOfWeek();
        org.joda.time.PeriodType periodType82 = null;
        org.joda.time.MutableInterval mutableInterval85 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval86 = mutableInterval85.toInterval();
        org.joda.time.Chronology chronology87 = interval86.getChronology();
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((long) 1, periodType82, chronology87);
        org.joda.time.DateTimeField dateTimeField89 = chronology87.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone90 = chronology87.getZone();
        org.joda.time.DateTime dateTime91 = dateTime77.withChronology(chronology87);
        org.joda.time.Interval interval92 = duration65.toIntervalTo((org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.Instant instant94 = instant51.withDurationAdded((org.joda.time.ReadableDuration) duration65, 48);
        org.joda.time.Duration duration95 = duration65.toDuration();
        org.joda.time.MutableInterval mutableInterval96 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableDuration) duration65);
        boolean boolean97 = interval45.isAfter((org.joda.time.ReadableInterval) mutableInterval96);
        org.joda.time.Chronology chronology98 = interval45.getChronology();
        org.joda.time.DateTime dateTime99 = dateTime4.toDateTime(chronology98);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime12.withEarlierOffsetAtOverlap();
        int int15 = dateTime12.getDayOfWeek();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology22.getZone();
        org.joda.time.DateTime dateTime26 = dateTime12.withChronology(chronology22);
        org.joda.time.Interval interval27 = duration0.toIntervalTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period30 = duration0.toPeriodFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Duration duration32 = duration0.withMillis(100L);
        long long33 = duration0.getMillis();
        org.joda.time.Period period34 = duration0.toPeriod();
        org.joda.time.Instant instant35 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 1, periodType38, chronology43);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) '4', chronology43);
        org.joda.time.ReadablePartial readablePartial46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.withFields(readablePartial46);
        boolean boolean48 = instant35.isAfter((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime.Property property49 = dateTime45.dayOfWeek();
        org.joda.time.DateTime dateTime50 = property49.withMaximumValue();
        org.joda.time.DateTime dateTime52 = dateTime50.withWeekyear((int) (short) 100);
        org.joda.time.Minutes minutes54 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType55 = null;
        int int56 = minutes54.get(durationFieldType55);
        org.joda.time.DurationFieldType durationFieldType57 = minutes54.getFieldType();
        org.joda.time.Minutes minutes59 = minutes54.minus((int) '4');
        org.joda.time.DateTime dateTime60 = dateTime50.plus((org.joda.time.ReadablePeriod) minutes54);
        org.joda.time.DateTime dateTime62 = dateTime50.withMillisOfDay(1439);
        org.joda.time.Duration duration63 = period34.toDurationFrom((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval70 = mutableInterval69.toInterval();
        org.joda.time.Chronology chronology71 = interval70.getChronology();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) 1, periodType66, chronology71);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) '4', chronology71);
        org.joda.time.ReadablePartial readablePartial74 = null;
        org.joda.time.DateTime dateTime75 = dateTime73.withFields(readablePartial74);
        org.joda.time.DateTime.Property property76 = dateTime75.millisOfDay();
        org.joda.time.DateTime dateTime78 = dateTime75.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property79 = dateTime75.era();
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime();
        org.joda.time.Instant instant81 = dateTime80.toInstant();
        org.joda.time.Minutes minutes82 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime75, (org.joda.time.ReadableInstant) instant81);
        org.joda.time.Instant instant84 = instant81.plus(62722800000L);
        org.joda.time.Interval interval85 = duration63.toIntervalFrom((org.joda.time.ReadableInstant) instant81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant35 and dateTime80", (instant35.compareTo(dateTime80) == 0) == instant35.equals(dateTime80));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        int int10 = dateTime9.getMinuteOfDay();
        int int11 = dateTime9.getEra();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone13);
        org.joda.time.DateTime dateTime15 = dateTime14.withLaterOffsetAtOverlap();
        org.joda.time.Hours hours16 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime18 = dateTime14.minusYears(60);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((long) 19);
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.Instant instant22 = dateTime14.toInstant();
        org.joda.time.Hours hours23 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours24 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours25 = hours23.minus(hours24);
        org.joda.time.Duration duration26 = hours24.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone28);
        int int30 = dateTime29.getMillisOfDay();
        org.joda.time.DateTime dateTime32 = dateTime29.plusMillis((int) '#');
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 1, periodType35, chronology40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) '4', chronology40);
        org.joda.time.DateTime dateTime43 = dateTime32.withChronology(chronology40);
        boolean boolean45 = dateTime43.isEqual(187200000L);
        org.joda.time.Interval interval46 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime dateTime47 = dateTime43.toDateTime();
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 1, periodType50, chronology55);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) '4', chronology55);
        org.joda.time.ReadablePartial readablePartial58 = null;
        org.joda.time.DateTime dateTime59 = dateTime57.withFields(readablePartial58);
        org.joda.time.DateTime.Property property60 = dateTime59.millisOfDay();
        org.joda.time.DateTime dateTime61 = dateTime59.withEarlierOffsetAtOverlap();
        int int62 = dateTime59.getDayOfWeek();
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 1, periodType64, chronology69);
        org.joda.time.DateTimeField dateTimeField71 = chronology69.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone72 = chronology69.getZone();
        org.joda.time.DateTime dateTime73 = dateTime59.withChronology(chronology69);
        org.joda.time.DateTime dateTime74 = dateTime59.withEarlierOffsetAtOverlap();
        org.joda.time.Period period75 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType76 = period75.getPeriodType();
        org.joda.time.Period period78 = period75.withMonths((int) (byte) 0);
        org.joda.time.Period period79 = period75.toPeriod();
        org.joda.time.DateTime dateTime81 = dateTime74.withPeriodAdded((org.joda.time.ReadablePeriod) period79, (int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant82 = null;
        boolean boolean83 = dateTime81.isEqual(readableInstant82);
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean85 = dateTime81.isSupported(dateTimeFieldType84);
        java.lang.String str86 = dateTimeFieldType84.getName();
        boolean boolean87 = dateTime47.isSupported(dateTimeFieldType84);
        org.joda.time.DateTime.Property property88 = dateTime47.millisOfSecond();
        java.lang.String str89 = dateTime47.toString();
        int int90 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant22", (dateTime14.compareTo(instant22) == 0) == dateTime14.equals(instant22));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone16);
        int int18 = dateTime17.getDayOfMonth();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 1, periodType20, chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology25.getZone();
        org.joda.time.DateTime dateTime29 = dateTime17.withZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = dateTime10.withZone(dateTimeZone28);
        int int32 = dateTimeZone28.getOffset((-10L));
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DateTime.Property property34 = dateTime33.weekOfWeekyear();
        org.joda.time.DateTime.Property property35 = dateTime33.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone37);
        int int39 = dateTime38.getDayOfMonth();
        org.joda.time.DateTime dateTime41 = dateTime38.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property42 = dateTime41.dayOfYear();
        org.joda.time.DateTime dateTime43 = property42.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime44 = dateTime43.toDateTime();
        org.joda.time.DateTime.Property property45 = dateTime44.dayOfYear();
        org.joda.time.DateTime dateTime46 = property45.roundCeilingCopy();
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(chronology51);
        org.joda.time.Chronology chronology53 = chronology51.withUTC();
        org.joda.time.DateTime dateTime54 = dateTime46.toDateTime(chronology53);
        org.joda.time.DateTime.Property property55 = dateTime54.millisOfSecond();
        boolean boolean56 = dateTime33.equals((java.lang.Object) property55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and dateTime54", (dateTime43.compareTo(dateTime54) == 0) == dateTime43.equals(dateTime54));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.joda.time.Period period1 = org.joda.time.Period.days((-1));
        org.joda.time.Period period3 = period1.withHours((int) (short) 0);
        int int4 = period3.getDays();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone6);
        int int8 = dateTime7.getDayOfMonth();
        org.joda.time.DateTime dateTime10 = dateTime7.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime12 = dateTime7.minusSeconds(0);
        java.lang.Object obj15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType17 = period16.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(obj15, periodType17);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 1, periodType20, chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology25.getZone();
        org.joda.time.DateTimeField dateTimeField29 = chronology25.minuteOfHour();
        org.joda.time.Chronology chronology30 = chronology25.withUTC();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 50, (-10L), periodType17, chronology30);
        org.joda.time.DateTime dateTime32 = dateTime7.toDateTime(chronology30);
        org.joda.time.Duration duration33 = period3.toDurationTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Duration duration34 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration35 = duration34.toDuration();
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.DateTimeZone dateTimeZone41 = chronology40.getZone();
        org.joda.time.Period period42 = duration34.toPeriod(chronology40);
        org.joda.time.DateTimeField dateTimeField43 = chronology40.clockhourOfDay();
        long long45 = dateTimeField43.remainder(0L);
        int int47 = dateTimeField43.getMaximumValue((long) 349200000);
        int int49 = dateTimeField43.get(158115600000L);
        boolean boolean50 = duration33.equals((java.lang.Object) dateTimeField43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime32", (dateTime7.compareTo(dateTime32) == 0) == dateTime7.equals(dateTime32));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration14 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', chronology22);
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.withFields(readablePartial25);
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfDay();
        org.joda.time.DateTime dateTime28 = dateTime26.withEarlierOffsetAtOverlap();
        int int29 = dateTime26.getDayOfWeek();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, periodType31, chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology36.getZone();
        org.joda.time.DateTime dateTime40 = dateTime26.withChronology(chronology36);
        org.joda.time.Interval interval41 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Instant instant43 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration14, 48);
        org.joda.time.Duration duration44 = duration14.toDuration();
        org.joda.time.Period period45 = duration14.toPeriod();
        org.joda.time.Duration duration47 = new org.joda.time.Duration((-86395L));
        boolean boolean48 = duration14.isEqual((org.joda.time.ReadableDuration) duration47);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period59 = org.joda.time.Period.days((-1));
        org.joda.time.Period period61 = period59.withWeeks((int) 'a');
        java.lang.String str62 = period59.toString();
        mutablePeriod57.setPeriod((org.joda.time.ReadablePeriod) period59);
        int int64 = mutablePeriod57.getMillis();
        org.joda.time.DurationFieldType durationFieldType66 = mutablePeriod57.getFieldType(0);
        mutablePeriod57.setDays((int) (byte) -1);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime();
        org.joda.time.Instant instant70 = dateTime69.toInstant();
        org.joda.time.Duration duration71 = mutablePeriod57.toDurationFrom((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.DateTime dateTime72 = dateTime69.toDateTimeISO();
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, (org.joda.time.ReadableInstant) dateTime72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime72", (instant0.compareTo(dateTime72) == 0) == instant0.equals(dateTime72));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone5 = chronology4.getZone();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.Chronology chronology11 = interval10.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology11.getZone();
        java.lang.String str14 = dateTimeZone12.getName(100L);
        org.joda.time.DateTime dateTime15 = dateTime6.withZoneRetainFields(dateTimeZone12);
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology20.getZone();
        java.lang.String str23 = dateTimeZone21.getName(100L);
        org.joda.time.DateTime dateTime24 = dateTime15.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        long long27 = dateTimeZone5.getMillisKeepLocal(dateTimeZone21, (long) 11);
        boolean boolean29 = dateTimeZone5.isStandardOffset((-54432000000L));
        long long31 = dateTimeZone5.nextTransition((-6L));
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone5.getName(366L, locale33);
        boolean boolean35 = dateTimeZone5.isFixed();
        int int37 = dateTimeZone5.getOffsetFromLocal(948L);
        org.joda.time.Instant instant38 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 1, periodType41, chronology46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) '4', chronology46);
        org.joda.time.ReadablePartial readablePartial49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.withFields(readablePartial49);
        boolean boolean51 = instant38.isAfter((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Duration duration52 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.Chronology chronology60 = interval59.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 1, periodType55, chronology60);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) '4', chronology60);
        org.joda.time.ReadablePartial readablePartial63 = null;
        org.joda.time.DateTime dateTime64 = dateTime62.withFields(readablePartial63);
        org.joda.time.DateTime.Property property65 = dateTime64.millisOfDay();
        org.joda.time.DateTime dateTime66 = dateTime64.withEarlierOffsetAtOverlap();
        int int67 = dateTime64.getDayOfWeek();
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval73 = mutableInterval72.toInterval();
        org.joda.time.Chronology chronology74 = interval73.getChronology();
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((long) 1, periodType69, chronology74);
        org.joda.time.DateTimeField dateTimeField76 = chronology74.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone77 = chronology74.getZone();
        org.joda.time.DateTime dateTime78 = dateTime64.withChronology(chronology74);
        org.joda.time.Interval interval79 = duration52.toIntervalTo((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Instant instant81 = instant38.withDurationAdded((org.joda.time.ReadableDuration) duration52, 48);
        long long82 = instant38.getMillis();
        org.joda.time.Chronology chronology83 = instant38.getChronology();
        org.joda.time.Instant instant85 = instant38.plus((long) (-196999));
        boolean boolean86 = dateTimeZone5.equals((java.lang.Object) instant38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant38", (dateTime6.compareTo(instant38) == 0) == dateTime6.equals(instant38));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        int int15 = property14.getMaximumValue();
        java.lang.String str16 = property14.getAsText();
        long long17 = property14.remainder();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone19);
        java.util.Locale locale21 = null;
        java.util.Calendar calendar22 = dateTime20.toCalendar(locale21);
        org.joda.time.DateTime dateTime24 = dateTime20.minus((long) 56);
        org.joda.time.DateTime dateTime26 = dateTime20.withWeekOfWeekyear(5);
        int int27 = dateTime26.getDayOfYear();
        int int28 = property14.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.Hours hours34 = org.joda.time.Hours.EIGHT;
        org.joda.time.Interval interval35 = interval32.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) hours34);
        org.joda.time.DateTime dateTime36 = dateTime26.minus((org.joda.time.ReadablePeriod) hours34);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone38);
        int int40 = dateTime39.getDayOfMonth();
        org.joda.time.DateTime dateTime42 = dateTime39.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property43 = dateTime42.dayOfYear();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.DateTimeZone dateTimeZone50 = chronology49.getZone();
        java.lang.String str52 = dateTimeZone50.getName(100L);
        org.joda.time.DateTime dateTime53 = dateTime44.withZoneRetainFields(dateTimeZone50);
        int int54 = dateTime53.getMinuteOfDay();
        int int55 = dateTime53.getEra();
        org.joda.time.DateMidnight dateMidnight56 = dateTime53.toDateMidnight();
        int int57 = dateMidnight56.getHourOfDay();
        long long58 = dateMidnight56.getMillis();
        org.joda.time.Duration duration59 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableInstant) dateMidnight56);
        org.joda.time.Instant instant61 = new org.joda.time.Instant((long) 5);
        org.joda.time.Period period62 = duration59.toPeriodFrom((org.joda.time.ReadableInstant) instant61);
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableDuration) duration59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime44", (instant0.compareTo(dateTime44) == 0) == instant0.equals(dateTime44));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Instant instant3 = instant1.plus(157784803200024L);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.Instant instant7 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration5, (int) '4');
        org.joda.time.Instant instant8 = instant1.toInstant();
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean19 = mutableInterval14.isBefore((org.joda.time.ReadableInterval) mutableInterval18);
        boolean boolean20 = mutableInterval11.contains((org.joda.time.ReadableInterval) mutableInterval18);
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval18);
        long long22 = mutableInterval18.getEndMillis();
        org.joda.time.DateTime dateTime23 = mutableInterval18.getEnd();
        boolean boolean24 = dateTime23.isBeforeNow();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, periodType27, chronology32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) '4', chronology32);
        org.joda.time.ReadablePartial readablePartial35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.withFields(readablePartial35);
        org.joda.time.DateTime.Property property37 = dateTime36.millisOfDay();
        org.joda.time.DateTime dateTime38 = dateTime36.withEarlierOffsetAtOverlap();
        int int39 = dateTime36.getDayOfWeek();
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 1, periodType41, chronology46);
        org.joda.time.DateTimeField dateTimeField48 = chronology46.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone49 = chronology46.getZone();
        org.joda.time.DateTime dateTime50 = dateTime36.withChronology(chronology46);
        org.joda.time.DateTimeField dateTimeField51 = chronology46.weekOfWeekyear();
        int int52 = dateTime23.get(dateTimeField51);
        org.joda.time.DateTime dateTime54 = dateTime23.withCenturyOfEra(0);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant1, (org.joda.time.ReadableInstant) dateTime23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime8 = dateTime7.toDateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfYear();
        org.joda.time.DateTime dateTime10 = property9.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType12.getField(chronology14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Chronology chronology18 = chronology14.withZone(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(47335428000000L, chronology18);
        int int20 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime26.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime30 = dateTime28.plus((long) (short) -1);
        org.joda.time.DateTime dateTime33 = dateTime30.withDurationAdded((long) 100, (int) (short) 100);
        org.joda.time.Chronology chronology34 = dateTime33.getChronology();
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology39);
        int int41 = dateTime40.getSecondOfMinute();
        org.joda.time.DateTime dateTime43 = dateTime40.withWeekyear(3);
        boolean boolean44 = dateTime33.isBefore((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Minutes minutes45 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime26", (instant13.compareTo(dateTime26) == 0) == instant13.equals(dateTime26));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        int int7 = property6.getMinimumValue();
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', chronology16);
        org.joda.time.ReadablePartial readablePartial19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.withFields(readablePartial19);
        boolean boolean21 = instant8.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime22 = instant8.toDateTime();
        int int23 = property6.compareTo((org.joda.time.ReadableInstant) instant8);
        int int24 = property6.getMinimumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime22", (instant8.compareTo(dateTime22) == 0) == instant8.equals(dateTime22));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        java.lang.Object obj0 = null;
        org.joda.time.Period period2 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType3 = period2.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(2456L, periodType3);
        org.joda.time.Period period5 = new org.joda.time.Period(obj0, periodType3);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, periodType7, chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology12.getZone();
        long long18 = dateTimeZone15.convertLocalToUTC((-6380815651200000L), true);
        long long20 = dateTimeZone15.convertUTCToLocal((long) 53);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekyear((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        int int25 = dateTime21.get(dateTimeFieldType24);
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType24.getDurationType();
        int int27 = periodType3.indexOf(durationFieldType26);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 1, periodType32, chronology37);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) '4', chronology37);
        org.joda.time.Instant instant40 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 1, periodType43, chronology48);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) '4', chronology48);
        org.joda.time.ReadablePartial readablePartial51 = null;
        org.joda.time.DateTime dateTime52 = dateTime50.withFields(readablePartial51);
        boolean boolean53 = instant40.isAfter((org.joda.time.ReadableInstant) dateTime50);
        boolean boolean54 = dateTime39.isAfter((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Chronology chronology55 = dateTime39.getChronology();
        org.joda.time.Period period56 = new org.joda.time.Period(0L, (long) 50, chronology55);
        org.joda.time.DurationField durationField57 = chronology55.days();
        org.joda.time.DateTimeField dateTimeField58 = chronology55.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField59 = chronology55.clockhourOfDay();
        org.joda.time.DurationField durationField60 = durationFieldType26.getField(chronology55);
        boolean boolean61 = durationField60.isSupported();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant40", (dateTime21.compareTo(instant40) == 0) == dateTime21.equals(instant40));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours1 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours2 = hours0.minus(hours1);
        org.joda.time.Duration duration3 = hours1.toStandardDuration();
        org.joda.time.Duration duration4 = duration3.toDuration();
        org.joda.time.Duration duration5 = duration4.toDuration();
        org.joda.time.Duration duration8 = duration5.withDurationAdded((-3155695200000L), 19);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology14.getZone();
        java.lang.String str17 = dateTimeZone15.getName(100L);
        org.joda.time.DateTime dateTime18 = dateTime9.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime21 = dateTime18.withDurationAdded((long) 52, (int) (short) 1);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfCentury(1);
        int int24 = dateTime21.getHourOfDay();
        org.joda.time.DateTime.Property property25 = dateTime21.minuteOfHour();
        org.joda.time.Interval interval26 = duration5.toIntervalTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology28 = instant27.getChronology();
        org.joda.time.Instant instant31 = instant27.withDurationAdded((long) 24, 23);
        org.joda.time.Duration duration34 = new org.joda.time.Duration(86400007L, 0L);
        org.joda.time.Instant instant36 = instant31.withDurationAdded((org.joda.time.ReadableDuration) duration34, 2022);
        boolean boolean37 = interval26.isAfter((org.joda.time.ReadableInstant) instant36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant27", (dateTime9.compareTo(instant27) == 0) == dateTime9.equals(instant27));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime2.dayOfWeek();
        org.joda.time.Interval interval7 = property6.toInterval();
        java.util.Locale locale8 = null;
        int int9 = property6.getMaximumShortTextLength(locale8);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period20 = org.joda.time.Period.days((-1));
        org.joda.time.Period period22 = period20.withWeeks((int) 'a');
        java.lang.String str23 = period20.toString();
        mutablePeriod18.setPeriod((org.joda.time.ReadablePeriod) period20);
        mutablePeriod18.addMonths((int) (short) -1);
        org.joda.time.Period period28 = org.joda.time.Period.days((-1));
        org.joda.time.Period period30 = period28.withWeeks((int) 'a');
        org.joda.time.Period period32 = period28.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType33 = null;
        boolean boolean34 = period32.isSupported(durationFieldType33);
        mutablePeriod18.add((org.joda.time.ReadablePeriod) period32);
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean46 = mutableInterval41.isBefore((org.joda.time.ReadableInterval) mutableInterval45);
        boolean boolean47 = mutableInterval38.contains((org.joda.time.ReadableInterval) mutableInterval45);
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        long long53 = interval51.toDurationMillis();
        org.joda.time.Interval interval55 = interval51.withEndMillis((long) (short) 100);
        mutableInterval45.setInterval((org.joda.time.ReadableInterval) interval51);
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.Chronology chronology61 = interval60.getChronology();
        long long62 = interval60.toDurationMillis();
        boolean boolean63 = interval51.isAfter((org.joda.time.ReadableInterval) interval60);
        org.joda.time.Interval interval65 = interval51.withEndMillis(100L);
        boolean boolean66 = interval51.containsNow();
        mutablePeriod18.setPeriod((org.joda.time.ReadableInterval) interval51);
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval71 = mutableInterval70.toInterval();
        org.joda.time.Chronology chronology72 = interval71.getChronology();
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime(chronology72);
        int int74 = dateTime73.getSecondOfMinute();
        org.joda.time.DateTime dateTime76 = dateTime73.withWeekyear(3);
        boolean boolean78 = dateTime76.isAfter(9223372036505575807L);
        boolean boolean79 = interval51.contains((org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.DateTime.Property property80 = dateTime76.millisOfSecond();
        org.joda.time.Instant instant81 = new org.joda.time.Instant((java.lang.Object) dateTime76);
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone83);
        java.util.Locale locale85 = null;
        java.util.Calendar calendar86 = dateTime84.toCalendar(locale85);
        org.joda.time.DateTime dateTime87 = dateTime84.toDateTime();
        boolean boolean88 = dateTime84.isAfterNow();
        org.joda.time.DateTime dateTime90 = dateTime84.minusWeeks(45);
        org.joda.time.Minutes minutes91 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) instant81, (org.joda.time.ReadableInstant) dateTime90);
        int int92 = property6.getDifference((org.joda.time.ReadableInstant) dateTime90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime76 and instant81", (dateTime76.compareTo(instant81) == 0) == dateTime76.equals(instant81));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Period period15 = org.joda.time.Period.days((-1));
        org.joda.time.Period period17 = period15.withWeeks((int) 'a');
        org.joda.time.Period period19 = period15.plusMonths((int) (short) -1);
        org.joda.time.Period period21 = period15.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime22 = dateTime10.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, periodType26, chronology31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', chronology31);
        org.joda.time.ReadablePartial readablePartial34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.withFields(readablePartial34);
        boolean boolean36 = instant23.isAfter((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Duration duration37 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.Chronology chronology45 = interval44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 1, periodType40, chronology45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) '4', chronology45);
        org.joda.time.ReadablePartial readablePartial48 = null;
        org.joda.time.DateTime dateTime49 = dateTime47.withFields(readablePartial48);
        org.joda.time.DateTime.Property property50 = dateTime49.millisOfDay();
        org.joda.time.DateTime dateTime51 = dateTime49.withEarlierOffsetAtOverlap();
        int int52 = dateTime49.getDayOfWeek();
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 1, periodType54, chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology59.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone62 = chronology59.getZone();
        org.joda.time.DateTime dateTime63 = dateTime49.withChronology(chronology59);
        org.joda.time.Interval interval64 = duration37.toIntervalTo((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Instant instant66 = instant23.withDurationAdded((org.joda.time.ReadableDuration) duration37, 48);
        org.joda.time.Duration duration67 = duration37.toDuration();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.TimeOfDay timeOfDay69 = dateTime10.toTimeOfDay();
        org.joda.time.MutableDateTime mutableDateTime70 = dateTime10.toMutableDateTime();
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval75 = mutableInterval74.toInterval();
        org.joda.time.Chronology chronology76 = interval75.getChronology();
        org.joda.time.DateTimeZone dateTimeZone77 = chronology76.getZone();
        java.lang.String str79 = dateTimeZone77.getName(100L);
        org.joda.time.DateTime dateTime80 = dateTime71.withZoneRetainFields(dateTimeZone77);
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval84 = mutableInterval83.toInterval();
        org.joda.time.Chronology chronology85 = interval84.getChronology();
        org.joda.time.DateTimeZone dateTimeZone86 = chronology85.getZone();
        java.lang.String str88 = dateTimeZone86.getName(100L);
        org.joda.time.DateTime dateTime89 = dateTime80.withZoneRetainFields(dateTimeZone86);
        java.lang.String str90 = dateTimeZone86.toString();
        org.joda.time.DateTime dateTime91 = dateTime10.withZone(dateTimeZone86);
        org.joda.time.DateTime dateTime93 = dateTime10.plusDays(17241225);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime71", (instant0.compareTo(dateTime71) == 0) == instant0.equals(dateTime71));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        java.lang.String str11 = dateTimeZone6.getShortName((-62128976999664L));
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 1, periodType14, chronology19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', chronology19);
        org.joda.time.Instant instant22 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) '4', chronology30);
        org.joda.time.ReadablePartial readablePartial33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.withFields(readablePartial33);
        boolean boolean35 = instant22.isAfter((org.joda.time.ReadableInstant) dateTime32);
        boolean boolean36 = dateTime21.isAfter((org.joda.time.ReadableInstant) dateTime32);
        java.lang.String str37 = dateTime21.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType39 = dateTimeFieldType38.getRangeDurationType();
        int int40 = dateTime21.get(dateTimeFieldType38);
        boolean boolean41 = dateTime21.isBeforeNow();
        org.joda.time.DateTime dateTime42 = dateTime21.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight43 = dateTime42.toDateMidnight();
        org.joda.time.Hours hours45 = org.joda.time.Hours.hours((int) (byte) 100);
        org.joda.time.Hours hours47 = hours45.minus(5);
        boolean boolean48 = dateTime42.equals((java.lang.Object) 5);
        boolean boolean50 = dateTime42.isBefore((long) 8);
        long long51 = dateTime42.getMillis();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone53);
        int int55 = dateTime54.getDayOfMonth();
        org.joda.time.DateTime dateTime57 = dateTime54.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property58 = dateTime57.dayOfYear();
        org.joda.time.DateTime dateTime59 = property58.roundHalfFloorCopy();
        java.util.Locale locale60 = null;
        int int61 = property58.getMaximumTextLength(locale60);
        java.lang.String str62 = property58.getAsShortText();
        org.joda.time.DateTime dateTime63 = property58.roundCeilingCopy();
        org.joda.time.Hours hours64 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableInstant) dateTime63);
        int int65 = dateTimeZone6.getOffset((org.joda.time.ReadableInstant) dateTime63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant22", (dateTime0.compareTo(instant22) == 0) == dateTime0.equals(instant22));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime9 = property6.addWrapFieldToCopy(1);
        org.joda.time.Period period11 = new org.joda.time.Period(164096150400000L);
        org.joda.time.DateTime dateTime12 = dateTime9.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.MutablePeriod mutablePeriod13 = period11.toMutablePeriod();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology19.getZone();
        java.lang.String str22 = dateTimeZone20.getName(100L);
        org.joda.time.DateTime dateTime23 = dateTime14.withZoneRetainFields(dateTimeZone20);
        boolean boolean25 = dateTime14.isEqual((-124334351997544L));
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTime dateTime33 = dateTime31.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime35 = dateTime33.withMillisOfDay(0);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTimeField dateTimeField44 = chronology42.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology42.getZone();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours(52);
        org.joda.time.Chronology chronology48 = chronology42.withZone(dateTimeZone47);
        org.joda.time.DateTime dateTime49 = dateTime33.toDateTime(chronology48);
        mutablePeriod13.setPeriod((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime52 = dateTime33.withWeekyear((-1));
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime33.toMutableDateTime();
        org.joda.time.DateTime dateTime55 = dateTime33.minusMinutes(953);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and mutableDateTime53", (dateTime49.compareTo(mutableDateTime53) == 0) == dateTime49.equals(mutableDateTime53));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean14 = mutableInterval9.isBefore((org.joda.time.ReadableInterval) mutableInterval13);
        boolean boolean15 = mutableInterval6.contains((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.DateTime dateTime17 = dateTime2.plus((org.joda.time.ReadablePeriod) weeks16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone19);
        int int21 = dateTime20.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean32 = mutableInterval27.isBefore((org.joda.time.ReadableInterval) mutableInterval31);
        boolean boolean33 = mutableInterval24.contains((org.joda.time.ReadableInterval) mutableInterval31);
        org.joda.time.Weeks weeks34 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval31);
        org.joda.time.DateTime dateTime35 = dateTime20.plus((org.joda.time.ReadablePeriod) weeks34);
        org.joda.time.DateTime dateTime37 = dateTime20.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        org.joda.time.DateTime dateTime40 = dateTime20.withZone(dateTimeZone39);
        boolean boolean41 = dateTime2.isBefore((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 1, periodType44, chronology49);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) '4', chronology49);
        org.joda.time.ReadablePartial readablePartial52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.withFields(readablePartial52);
        org.joda.time.DateTime.Property property54 = dateTime53.millisOfDay();
        org.joda.time.DateTime dateTime55 = dateTime53.withEarlierOffsetAtOverlap();
        int int56 = dateTime53.getDayOfWeek();
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        org.joda.time.Chronology chronology63 = interval62.getChronology();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) 1, periodType58, chronology63);
        org.joda.time.DateTimeField dateTimeField65 = chronology63.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone66 = chronology63.getZone();
        org.joda.time.DateTime dateTime67 = dateTime53.withChronology(chronology63);
        org.joda.time.DateTimeField dateTimeField68 = chronology63.dayOfMonth();
        org.joda.time.DurationField durationField69 = chronology63.seconds();
        org.joda.time.DateTime dateTime70 = dateTime40.toDateTime(chronology63);
        org.joda.time.format.PeriodPrinter periodPrinter72 = null;
        org.joda.time.format.PeriodParser periodParser73 = null;
        org.joda.time.format.PeriodFormatter periodFormatter74 = new org.joda.time.format.PeriodFormatter(periodPrinter72, periodParser73);
        org.joda.time.format.PeriodParser periodParser75 = periodFormatter74.getParser();
        org.joda.time.PeriodType periodType76 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType77 = periodType76.withMinutesRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter78 = periodFormatter74.withParseType(periodType77);
        java.util.Locale locale79 = periodFormatter78.getLocale();
        org.joda.time.PeriodType periodType80 = periodFormatter78.getParseType();
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) (-89), periodType80);
        org.joda.time.DateTime dateTime82 = dateTime70.plus((org.joda.time.ReadablePeriod) mutablePeriod81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime40", (dateTime2.compareTo(dateTime40) == 0) == dateTime2.equals(dateTime40));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.MutableInterval mutableInterval5 = interval3.toMutableInterval();
        org.joda.time.Interval interval7 = interval3.withEndMillis(53L);
        org.joda.time.Chronology chronology8 = interval3.getChronology();
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean19 = mutableInterval14.isBefore((org.joda.time.ReadableInterval) mutableInterval18);
        boolean boolean20 = mutableInterval11.contains((org.joda.time.ReadableInterval) mutableInterval18);
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        long long26 = interval24.toDurationMillis();
        org.joda.time.Interval interval28 = interval24.withEndMillis((long) (short) 100);
        mutableInterval18.setInterval((org.joda.time.ReadableInterval) interval24);
        boolean boolean30 = mutableInterval18.containsNow();
        boolean boolean31 = interval3.contains((org.joda.time.ReadableInterval) mutableInterval18);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean42 = mutableInterval37.isBefore((org.joda.time.ReadableInterval) mutableInterval41);
        boolean boolean43 = mutableInterval34.contains((org.joda.time.ReadableInterval) mutableInterval41);
        mutableInterval34.setDurationAfterStart(0L);
        boolean boolean46 = mutableInterval34.containsNow();
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean57 = mutableInterval52.isBefore((org.joda.time.ReadableInterval) mutableInterval56);
        boolean boolean58 = mutableInterval49.contains((org.joda.time.ReadableInterval) mutableInterval56);
        mutableInterval49.setDurationAfterStart(0L);
        boolean boolean61 = mutableInterval49.containsNow();
        boolean boolean62 = mutableInterval34.isAfter((org.joda.time.ReadableInterval) mutableInterval49);
        mutableInterval49.setDurationBeforeEnd(355200035L);
        org.joda.time.Interval interval65 = interval3.overlap((org.joda.time.ReadableInterval) mutableInterval49);
        org.joda.time.Instant instant66 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology67 = instant66.getChronology();
        org.joda.time.Hours hours68 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours69 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours70 = hours68.minus(hours69);
        org.joda.time.Duration duration71 = hours69.toStandardDuration();
        org.joda.time.Instant instant72 = instant66.minus((org.joda.time.ReadableDuration) duration71);
        org.joda.time.DateTime dateTime73 = instant66.toDateTime();
        boolean boolean74 = mutableInterval49.isAfter((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval78 = mutableInterval77.toInterval();
        org.joda.time.Chronology chronology79 = interval78.getChronology();
        org.joda.time.DateTimeField dateTimeField80 = chronology79.yearOfEra();
        long long84 = chronology79.add(6000035L, 1L, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField85 = chronology79.weekyear();
        org.joda.time.DateTimeField dateTimeField86 = chronology79.millisOfSecond();
        org.joda.time.DurationField durationField87 = chronology79.eras();
        boolean boolean88 = mutableInterval49.equals((java.lang.Object) chronology79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant66 and dateTime73", (instant66.compareTo(dateTime73) == 0) == instant66.equals(dateTime73));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone5);
        int int7 = dateTime6.getMillisOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.plusMillis((int) '#');
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, periodType12, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', chronology17);
        org.joda.time.DateTime dateTime20 = dateTime9.withChronology(chronology17);
        int int21 = dateTime20.getYearOfEra();
        org.joda.time.Chronology chronology22 = dateTime20.getChronology();
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean33 = mutableInterval28.isBefore((org.joda.time.ReadableInterval) mutableInterval32);
        boolean boolean34 = mutableInterval25.contains((org.joda.time.ReadableInterval) mutableInterval32);
        org.joda.time.Period period35 = mutableInterval25.toPeriod();
        int[] intArray37 = chronology22.get((org.joda.time.ReadablePeriod) period35, (-6380815651200000L));
        org.joda.time.DurationField durationField38 = chronology22.halfdays();
        org.joda.time.Interval interval39 = interval3.withChronology(chronology22);
        boolean boolean40 = interval39.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone42);
        int int44 = dateTime43.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean55 = mutableInterval50.isBefore((org.joda.time.ReadableInterval) mutableInterval54);
        boolean boolean56 = mutableInterval47.contains((org.joda.time.ReadableInterval) mutableInterval54);
        org.joda.time.Weeks weeks57 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval54);
        org.joda.time.DateTime dateTime58 = dateTime43.plus((org.joda.time.ReadablePeriod) weeks57);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone60);
        int int62 = dateTime61.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean73 = mutableInterval68.isBefore((org.joda.time.ReadableInterval) mutableInterval72);
        boolean boolean74 = mutableInterval65.contains((org.joda.time.ReadableInterval) mutableInterval72);
        org.joda.time.Weeks weeks75 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval72);
        org.joda.time.DateTime dateTime76 = dateTime61.plus((org.joda.time.ReadablePeriod) weeks75);
        org.joda.time.DateTime dateTime78 = dateTime61.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        org.joda.time.DateTime dateTime81 = dateTime61.withZone(dateTimeZone80);
        boolean boolean82 = dateTime43.isBefore((org.joda.time.ReadableInstant) dateTime81);
        boolean boolean83 = interval39.contains((org.joda.time.ReadableInstant) dateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime81", (dateTime6.compareTo(dateTime81) == 0) == dateTime6.equals(dateTime81));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.Instant instant2 = instant0.toInstant();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(6216719587200001L, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone8);
        int int10 = dateTime9.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime9.getZone();
        int int12 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime15 = dateTime9.withField(dateTimeFieldType13, 1);
        boolean boolean16 = instant0.isSupported(dateTimeFieldType13);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        java.lang.String str18 = dateTimeFieldType17.toString();
        java.lang.String str19 = dateTimeFieldType17.toString();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType17.getRangeDurationType();
        java.lang.String str21 = dateTimeFieldType17.getName();
        int int22 = instant0.get(dateTimeFieldType17);
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType17.getDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType24.getRangeDurationType();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 1, periodType30, chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) '4', chronology35);
        org.joda.time.ReadablePartial readablePartial38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.withFields(readablePartial38);
        org.joda.time.DateTime.Property property40 = dateTime39.millisOfDay();
        org.joda.time.DateTime dateTime42 = dateTime39.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime44 = dateTime39.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours45 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours46 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours47 = hours45.minus(hours46);
        org.joda.time.Duration duration48 = hours46.toStandardDuration();
        org.joda.time.DateTime dateTime49 = dateTime39.plus((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Duration duration50 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration51 = duration50.toDuration();
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.DateTimeZone dateTimeZone57 = chronology56.getZone();
        org.joda.time.Period period58 = duration50.toPeriod(chronology56);
        boolean boolean59 = duration48.isShorterThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.PeriodType periodType60 = org.joda.time.PeriodType.days();
        org.joda.time.Period period61 = duration50.toPeriod(periodType60);
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.Chronology chronology68 = interval67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 1, periodType63, chronology68);
        org.joda.time.DateTimeField dateTimeField70 = chronology68.yearOfCentury();
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval75 = mutableInterval74.toInterval();
        org.joda.time.Chronology chronology76 = interval75.getChronology();
        org.joda.time.DateTimeZone dateTimeZone77 = chronology76.getZone();
        java.lang.String str79 = dateTimeZone77.getName(100L);
        org.joda.time.DateTime dateTime80 = dateTime71.withZoneRetainFields(dateTimeZone77);
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval84 = mutableInterval83.toInterval();
        org.joda.time.Chronology chronology85 = interval84.getChronology();
        org.joda.time.DateTimeZone dateTimeZone86 = chronology85.getZone();
        java.lang.String str88 = dateTimeZone86.getName(100L);
        org.joda.time.DateTime dateTime89 = dateTime80.withZoneRetainFields(dateTimeZone86);
        org.joda.time.Chronology chronology90 = chronology68.withZone(dateTimeZone86);
        org.joda.time.Period period91 = new org.joda.time.Period(0L, 10L, periodType60, chronology68);
        boolean boolean92 = dateTimeFieldType24.isSupported(chronology68);
        org.joda.time.DateTimeField dateTimeField93 = chronology68.yearOfEra();
        org.joda.time.DateTimeField dateTimeField94 = dateTimeFieldType17.getField(chronology68);
        org.joda.time.DateTimeFieldType dateTimeFieldType95 = dateTimeField94.getType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime71", (instant0.compareTo(dateTime71) == 0) == instant0.equals(dateTime71));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        int int8 = dateTimeZone6.getStandardOffset((long) 8);
        java.lang.String str9 = dateTimeZone6.toString();
        long long13 = dateTimeZone6.convertLocalToUTC((long) (-2147483648), false, 0L);
        long long16 = dateTimeZone6.adjustOffset((-349199990L), false);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((-530L), dateTimeZone6);
        java.lang.String str18 = dateTimeZone6.toString();
        long long20 = dateTimeZone6.nextTransition((long) 198969);
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology22 = instant21.getChronology();
        org.joda.time.Hours hours23 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours24 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours25 = hours23.minus(hours24);
        org.joda.time.Duration duration26 = hours24.toStandardDuration();
        org.joda.time.Instant instant27 = instant21.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.DateTime dateTime28 = instant21.toDateTime();
        boolean boolean29 = dateTimeZone6.equals((java.lang.Object) dateTime28);
        boolean boolean31 = dateTimeZone6.isStandardOffset(349200757L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and dateTime28", (instant21.compareTo(dateTime28) == 0) == instant21.equals(dateTime28));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Instant instant3 = instant1.plus(157784803200024L);
        boolean boolean5 = instant1.isEqual(947000L);
        org.joda.time.DateTime dateTime6 = instant1.toDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.MutableInterval mutableInterval12 = mutableInterval2.copy();
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType16, chronology21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '4', chronology21);
        org.joda.time.ReadablePartial readablePartial24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.withFields(readablePartial24);
        boolean boolean26 = instant13.isAfter((org.joda.time.ReadableInstant) dateTime23);
        boolean boolean27 = mutableInterval12.contains((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime29 = dateTime23.withMillis((long) (short) 0);
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.DateTimeZone dateTimeZone35 = chronology34.getZone();
        int int37 = dateTimeZone35.getStandardOffset((long) 8);
        java.lang.String str38 = dateTimeZone35.toString();
        org.joda.time.DateTime dateTime39 = dateTime23.toDateTime(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.DateTimeZone dateTimeZone49 = chronology48.getZone();
        java.lang.String str51 = dateTimeZone49.getName(100L);
        org.joda.time.DateTime dateTime52 = dateTime43.withZoneRetainFields(dateTimeZone49);
        long long54 = dateTimeZone42.getMillisKeepLocal(dateTimeZone49, 6000035L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone42);
        boolean boolean57 = dateTimeZone42.isStandardOffset(173784322124946L);
        long long59 = dateTimeZone42.convertUTCToLocal(1798283647L);
        long long62 = dateTimeZone42.adjustOffset(1142677015L, true);
        java.util.Locale locale64 = null;
        java.lang.String str65 = dateTimeZone42.getShortName((-124334351999947L), locale64);
        int int67 = dateTimeZone42.getOffsetFromLocal(1960283647L);
        long long71 = dateTimeZone42.convertLocalToUTC((long) 3, true, 8380800070L);
        org.joda.time.MutableDateTime mutableDateTime72 = dateTime23.toMutableDateTime(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime43", (instant13.compareTo(dateTime43) == 0) == instant13.equals(dateTime43));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        int int11 = property10.getLeapAmount();
        org.joda.time.DateTime dateTime12 = property10.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, periodType19, chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', chronology24);
        org.joda.time.ReadablePartial readablePartial27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withFields(readablePartial27);
        boolean boolean29 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime.Property property30 = dateTime26.dayOfWeek();
        boolean boolean31 = dateTimeZone15.equals((java.lang.Object) dateTime26);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime34 = dateTime32.minusYears((int) (byte) -1);
        boolean boolean35 = dateTime12.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone37);
        int int39 = dateTime38.getSecondOfMinute();
        org.joda.time.DateTime dateTime41 = dateTime38.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime43 = dateTime38.withMillisOfDay((int) (byte) 1);
        org.joda.time.DateTime.Property property44 = dateTime38.weekyear();
        org.joda.time.Seconds seconds45 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone47);
        int int49 = dateTime48.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval56 = mutableInterval55.toInterval();
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean60 = mutableInterval55.isBefore((org.joda.time.ReadableInterval) mutableInterval59);
        boolean boolean61 = mutableInterval52.contains((org.joda.time.ReadableInterval) mutableInterval59);
        org.joda.time.Weeks weeks62 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval59);
        org.joda.time.DateTime dateTime63 = dateTime48.plus((org.joda.time.ReadablePeriod) weeks62);
        org.joda.time.DateTime dateTime65 = dateTime48.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property66 = dateTime48.secondOfDay();
        org.joda.time.Instant instant67 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval74 = mutableInterval73.toInterval();
        org.joda.time.Chronology chronology75 = interval74.getChronology();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((long) 1, periodType70, chronology75);
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime((long) '4', chronology75);
        org.joda.time.ReadablePartial readablePartial78 = null;
        org.joda.time.DateTime dateTime79 = dateTime77.withFields(readablePartial78);
        boolean boolean80 = instant67.isAfter((org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.DateTime.Property property81 = dateTime77.dayOfWeek();
        int int82 = property81.getMaximumValue();
        org.joda.time.DateTime dateTime83 = property81.roundFloorCopy();
        boolean boolean84 = dateTime48.isBefore((org.joda.time.ReadableInstant) dateTime83);
        int int85 = dateTime83.getSecondOfDay();
        org.joda.time.Days days86 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) dateTime83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime32", (instant16.compareTo(dateTime32) == 0) == instant16.equals(dateTime32));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (-2147483648), (-187200001L));
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone4);
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime5.toCalendar(locale6);
        org.joda.time.DateTime dateTime8 = dateTime5.toDateTime();
        java.lang.String str9 = dateTime5.toString();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology15.getZone();
        java.lang.String str18 = dateTimeZone16.getName(100L);
        org.joda.time.DateTime dateTime19 = dateTime10.withZoneRetainFields(dateTimeZone16);
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology24.getZone();
        java.lang.String str27 = dateTimeZone25.getName(100L);
        org.joda.time.DateTime dateTime28 = dateTime19.withZoneRetainFields(dateTimeZone25);
        java.util.TimeZone timeZone29 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.DateTime dateTime32 = dateTime5.withZone(dateTimeZone31);
        org.joda.time.Hours hours33 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period44 = org.joda.time.Period.days((-1));
        org.joda.time.Period period46 = period44.withWeeks((int) 'a');
        java.lang.String str47 = period44.toString();
        mutablePeriod42.setPeriod((org.joda.time.ReadablePeriod) period44);
        int int49 = mutablePeriod42.getMillis();
        org.joda.time.DurationFieldType durationFieldType51 = mutablePeriod42.getFieldType(0);
        int int52 = hours33.get(durationFieldType51);
        org.joda.time.Hours hours54 = hours33.multipliedBy(100);
        org.joda.time.Hours hours56 = hours54.dividedBy(50);
        org.joda.time.Hours hours58 = hours54.dividedBy((int) (byte) 1);
        org.joda.time.Hours hours59 = org.joda.time.Hours.MIN_VALUE;
        org.joda.time.Hours hours60 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours61 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours62 = hours60.minus(hours61);
        org.joda.time.Duration duration63 = hours61.toStandardDuration();
        org.joda.time.Hours hours64 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period75 = org.joda.time.Period.days((-1));
        org.joda.time.Period period77 = period75.withWeeks((int) 'a');
        java.lang.String str78 = period75.toString();
        mutablePeriod73.setPeriod((org.joda.time.ReadablePeriod) period75);
        int int80 = mutablePeriod73.getMillis();
        org.joda.time.DurationFieldType durationFieldType82 = mutablePeriod73.getFieldType(0);
        int int83 = hours64.get(durationFieldType82);
        org.joda.time.Hours hours85 = hours64.multipliedBy(100);
        org.joda.time.Hours hours86 = hours64.negated();
        boolean boolean87 = hours61.isGreaterThan(hours64);
        org.joda.time.Hours hours88 = hours59.plus(hours61);
        org.joda.time.Hours hours90 = org.joda.time.Hours.hours((int) (byte) 100);
        org.joda.time.Hours hours92 = hours90.minus(5);
        boolean boolean93 = hours61.isLessThan(hours90);
        org.joda.time.Hours hours94 = hours58.plus(hours61);
        org.joda.time.Hours hours96 = hours58.plus(10);
        org.joda.time.MutableInterval mutableInterval97 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadablePeriod) hours58);
        org.joda.time.Period period98 = duration2.toPeriodFrom((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Days days99 = duration2.toStandardDays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime32", (dateTime5.compareTo(dateTime32) == 0) == dateTime5.equals(dateTime32));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        mutablePeriod8.addMonths((int) (short) -1);
        org.joda.time.Period period18 = org.joda.time.Period.days((-1));
        org.joda.time.Period period20 = period18.withWeeks((int) 'a');
        org.joda.time.Period period22 = period18.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = period22.isSupported(durationFieldType23);
        mutablePeriod8.add((org.joda.time.ReadablePeriod) period22);
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean36 = mutableInterval31.isBefore((org.joda.time.ReadableInterval) mutableInterval35);
        boolean boolean37 = mutableInterval28.contains((org.joda.time.ReadableInterval) mutableInterval35);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        long long43 = interval41.toDurationMillis();
        org.joda.time.Interval interval45 = interval41.withEndMillis((long) (short) 100);
        mutableInterval35.setInterval((org.joda.time.ReadableInterval) interval41);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        long long52 = interval50.toDurationMillis();
        boolean boolean53 = interval41.isAfter((org.joda.time.ReadableInterval) interval50);
        org.joda.time.Interval interval55 = interval41.withEndMillis(100L);
        boolean boolean56 = interval41.containsNow();
        mutablePeriod8.setPeriod((org.joda.time.ReadableInterval) interval41);
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.Chronology chronology62 = interval61.getChronology();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(chronology62);
        int int64 = dateTime63.getSecondOfMinute();
        org.joda.time.DateTime dateTime66 = dateTime63.withWeekyear(3);
        boolean boolean68 = dateTime66.isAfter(9223372036505575807L);
        boolean boolean69 = interval41.contains((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime.Property property70 = dateTime66.millisOfSecond();
        org.joda.time.Instant instant71 = new org.joda.time.Instant((java.lang.Object) dateTime66);
        org.joda.time.DateTime.Property property72 = dateTime66.monthOfYear();
        org.joda.time.DateTime dateTime74 = dateTime66.plusMonths((-4740));
        org.joda.time.DateTime dateTime76 = dateTime74.withMillisOfDay(887);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime66 and instant71", (dateTime66.compareTo(instant71) == 0) == dateTime66.equals(instant71));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone5 = chronology4.getZone();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.Chronology chronology11 = interval10.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology11.getZone();
        java.lang.String str14 = dateTimeZone12.getName(100L);
        org.joda.time.DateTime dateTime15 = dateTime6.withZoneRetainFields(dateTimeZone12);
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology20.getZone();
        java.lang.String str23 = dateTimeZone21.getName(100L);
        org.joda.time.DateTime dateTime24 = dateTime15.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        long long27 = dateTimeZone5.getMillisKeepLocal(dateTimeZone21, (long) 11);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 1, periodType30, chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) '4', chronology35);
        org.joda.time.ReadablePartial readablePartial38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.withFields(readablePartial38);
        org.joda.time.DateTime.Property property40 = dateTime39.millisOfDay();
        org.joda.time.DateTime dateTime42 = dateTime39.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property43 = dateTime39.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property43.getFieldType();
        org.joda.time.DurationField durationField45 = property43.getDurationField();
        org.joda.time.DateTime dateTime46 = property43.roundCeilingCopy();
        org.joda.time.DateTime dateTime48 = dateTime46.minusSeconds(60);
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean59 = mutableInterval54.isBefore((org.joda.time.ReadableInterval) mutableInterval58);
        boolean boolean60 = mutableInterval51.contains((org.joda.time.ReadableInterval) mutableInterval58);
        org.joda.time.Weeks weeks61 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval58);
        org.joda.time.Weeks weeks62 = weeks61.negated();
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean73 = mutableInterval68.isBefore((org.joda.time.ReadableInterval) mutableInterval72);
        boolean boolean74 = mutableInterval65.contains((org.joda.time.ReadableInterval) mutableInterval72);
        org.joda.time.Weeks weeks75 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval72);
        org.joda.time.Weeks weeks76 = weeks75.negated();
        boolean boolean77 = weeks62.isGreaterThan(weeks76);
        org.joda.time.PeriodType periodType78 = weeks62.getPeriodType();
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadablePeriod) weeks62);
        org.joda.time.Instant instant80 = new org.joda.time.Instant((java.lang.Object) dateTime46);
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval84 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval85 = mutableInterval84.toInterval();
        org.joda.time.Chronology chronology86 = interval85.getChronology();
        org.joda.time.DateTimeZone dateTimeZone87 = chronology86.getZone();
        java.lang.String str89 = dateTimeZone87.getName(100L);
        org.joda.time.DateTime dateTime90 = dateTime81.withZoneRetainFields(dateTimeZone87);
        int int91 = dateTime90.getMinuteOfDay();
        org.joda.time.LocalDateTime localDateTime92 = dateTime90.toLocalDateTime();
        org.joda.time.DateTime dateTime93 = dateTime46.withFields((org.joda.time.ReadablePartial) localDateTime92);
        boolean boolean94 = dateTimeZone5.isLocalDateTimeGap(localDateTime92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime46 and instant80", (dateTime46.compareTo(instant80) == 0) == dateTime46.equals(instant80));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes2, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone10);
        int int12 = dateTime11.getDayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime11.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfYear();
        org.joda.time.DateTime dateTime16 = property15.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime18 = property15.addWrapFieldToCopy(1);
        boolean boolean19 = instant7.isBefore((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, periodType23, chronology28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) '4', chronology28);
        org.joda.time.ReadablePartial readablePartial31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.withFields(readablePartial31);
        boolean boolean33 = instant20.isAfter((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Period period35 = org.joda.time.Period.days((-1));
        org.joda.time.Period period37 = period35.withWeeks((int) 'a');
        org.joda.time.Period period39 = period35.plusMonths((int) (short) -1);
        org.joda.time.Period period41 = period35.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime42 = dateTime30.plus((org.joda.time.ReadablePeriod) period35);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = dateTime30.toDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.withMillisOfDay(3600010);
        org.joda.time.Duration duration47 = new org.joda.time.Duration((org.joda.time.ReadableInstant) instant7, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Duration duration49 = new org.joda.time.Duration((long) 60);
        long long50 = duration49.getStandardDays();
        org.joda.time.Instant instant52 = instant7.withDurationAdded((org.joda.time.ReadableDuration) duration49, (int) (byte) 1);
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval56 = mutableInterval55.toInterval();
        org.joda.time.Chronology chronology57 = interval56.getChronology();
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(chronology57);
        int int59 = dateTime58.getSecondOfMinute();
        java.lang.String str61 = dateTime58.toString("+00:00");
        int int62 = dateTime58.getEra();
        int int63 = dateTime58.getCenturyOfEra();
        org.joda.time.DateTime dateTime65 = dateTime58.minus(0L);
        org.joda.time.DateTime.Property property66 = dateTime58.millisOfDay();
        org.joda.time.DateTime dateTime68 = property66.setCopy(0);
        org.joda.time.DateTime dateTime70 = dateTime68.plusHours(29);
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration49, (org.joda.time.ReadableInstant) dateTime68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime58", (instant7.compareTo(dateTime58) == 0) == instant7.equals(dateTime58));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean7 = mutableInterval2.isBefore((org.joda.time.ReadableInterval) mutableInterval6);
        java.lang.Object obj8 = mutableInterval2.clone();
        long long9 = mutableInterval2.getStartMillis();
        org.joda.time.Interval interval10 = mutableInterval2.toInterval();
        long long11 = interval10.getStartMillis();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone13);
        int int15 = dateTime14.getDayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime14.withWeekOfWeekyear(1);
        boolean boolean18 = interval10.contains((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, periodType21, chronology26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '4', chronology26);
        org.joda.time.ReadablePartial readablePartial29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.withFields(readablePartial29);
        org.joda.time.DateTime.Property property31 = dateTime30.millisOfDay();
        org.joda.time.DateTime dateTime32 = dateTime30.withEarlierOffsetAtOverlap();
        int int33 = dateTime30.getDayOfWeek();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 1, periodType35, chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone43 = chronology40.getZone();
        org.joda.time.DateTime dateTime44 = dateTime30.withChronology(chronology40);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, periodType47, chronology52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', chronology52);
        org.joda.time.Instant instant55 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        org.joda.time.Chronology chronology63 = interval62.getChronology();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) 1, periodType58, chronology63);
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) '4', chronology63);
        org.joda.time.ReadablePartial readablePartial66 = null;
        org.joda.time.DateTime dateTime67 = dateTime65.withFields(readablePartial66);
        boolean boolean68 = instant55.isAfter((org.joda.time.ReadableInstant) dateTime65);
        boolean boolean69 = dateTime54.isAfter((org.joda.time.ReadableInstant) dateTime65);
        java.lang.String str70 = dateTime54.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType72 = dateTimeFieldType71.getRangeDurationType();
        int int73 = dateTime54.get(dateTimeFieldType71);
        boolean boolean74 = dateTime54.isBeforeNow();
        org.joda.time.DateTime dateTime75 = dateTime54.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight76 = dateTime75.toDateMidnight();
        boolean boolean77 = dateTime30.isAfter((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.DateTime dateTime79 = dateTime75.plusMinutes(23);
        org.joda.time.DateTime dateTime81 = dateTime79.minusWeeks((-324000000));
        org.joda.time.PeriodType periodType83 = null;
        org.joda.time.Instant instant84 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology85 = instant84.getChronology();
        org.joda.time.DateTimeField dateTimeField86 = chronology85.yearOfEra();
        org.joda.time.Period period87 = new org.joda.time.Period((java.lang.Object) "P-1DT100H3600.010S", periodType83, chronology85);
        org.joda.time.DurationField durationField88 = chronology85.months();
        org.joda.time.DateTimeField dateTimeField89 = chronology85.dayOfWeek();
        org.joda.time.DateTime dateTime90 = dateTime79.toDateTime(chronology85);
        org.joda.time.DateTime dateTime91 = dateTime79.toDateTimeISO();
        org.joda.time.Interval interval92 = interval10.withEnd((org.joda.time.ReadableInstant) dateTime91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime91 and dateTime90", (dateTime91.compareTo(dateTime90) == 0) == dateTime91.equals(dateTime90));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant5", (dateTime2.compareTo(instant5) == 0) == dateTime2.equals(instant5));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 10);
        org.joda.time.Instant instant5 = instant0.withMillis(3155760000010L);
        org.joda.time.Chronology chronology6 = instant0.getChronology();
        org.joda.time.Period period9 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType10 = period9.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType10);
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean23 = mutableInterval18.isBefore((org.joda.time.ReadableInterval) mutableInterval22);
        boolean boolean24 = mutableInterval15.contains((org.joda.time.ReadableInterval) mutableInterval22);
        org.joda.time.Weeks weeks25 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval22);
        long long26 = mutableInterval22.getEndMillis();
        org.joda.time.DateTime dateTime27 = mutableInterval22.getEnd();
        org.joda.time.Chronology chronology28 = mutableInterval22.getChronology();
        mutablePeriod11.add(355200035L, chronology28);
        org.joda.time.Chronology chronology30 = chronology28.withUTC();
        org.joda.time.DurationField durationField31 = chronology28.centuries();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology28);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant0, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Chronology chronology34 = instant0.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime32", (instant0.compareTo(dateTime32) == 0) == instant0.equals(dateTime32));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration14 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', chronology22);
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.withFields(readablePartial25);
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfDay();
        org.joda.time.DateTime dateTime28 = dateTime26.withEarlierOffsetAtOverlap();
        int int29 = dateTime26.getDayOfWeek();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, periodType31, chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology36.getZone();
        org.joda.time.DateTime dateTime40 = dateTime26.withChronology(chronology36);
        org.joda.time.Interval interval41 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Instant instant43 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration14, 48);
        org.joda.time.Duration duration44 = duration14.toDuration();
        org.joda.time.Duration duration45 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration46 = duration45.toDuration();
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.DateTimeZone dateTimeZone52 = chronology51.getZone();
        org.joda.time.Period period53 = duration45.toPeriod(chronology51);
        boolean boolean54 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration45);
        long long55 = duration14.getStandardSeconds();
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.Chronology chronology60 = interval59.getChronology();
        org.joda.time.MutableInterval mutableInterval61 = interval59.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        org.joda.time.Chronology chronology66 = interval65.getChronology();
        long long67 = interval65.toDurationMillis();
        org.joda.time.Interval interval69 = interval65.withEndMillis((long) (short) 100);
        org.joda.time.Instant instant70 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration71 = null;
        org.joda.time.Instant instant73 = instant70.withDurationAdded(readableDuration71, 10);
        org.joda.time.Interval interval74 = interval69.withEnd((org.joda.time.ReadableInstant) instant70);
        org.joda.time.Interval interval76 = interval74.withEndMillis(0L);
        boolean boolean77 = interval59.abuts((org.joda.time.ReadableInterval) interval76);
        org.joda.time.DateTime dateTime78 = interval76.getEnd();
        org.joda.time.PeriodType periodType79 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration14, (org.joda.time.ReadableInstant) dateTime78, periodType79);
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime(dateTimeZone83);
        boolean boolean85 = duration14.equals((java.lang.Object) dateTime84);
        org.joda.time.Duration duration87 = duration14.withMillis(1771685413523L);
        org.joda.time.Duration duration88 = duration87.toDuration();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime84", (instant0.compareTo(dateTime84) == 0) == instant0.equals(dateTime84));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus(100L);
        org.joda.time.DateTime dateTime3 = instant2.toDateTimeISO();
        int int4 = dateTime3.getYear();
        org.joda.time.DateTime dateTime5 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime7 = dateTime3.withSecondOfMinute(12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime3", (instant2.compareTo(dateTime3) == 0) == instant2.equals(dateTime3));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Hours hours14 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours15 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours16 = hours14.minus(hours15);
        org.joda.time.Duration duration17 = hours15.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone19);
        int int21 = dateTime20.getMillisOfDay();
        org.joda.time.DateTime dateTime23 = dateTime20.plusMillis((int) '#');
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, periodType26, chronology31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', chronology31);
        org.joda.time.DateTime dateTime34 = dateTime23.withChronology(chronology31);
        boolean boolean36 = dateTime34.isEqual(187200000L);
        org.joda.time.Interval interval37 = duration17.toIntervalFrom((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime38 = dateTime34.toDateTime();
        boolean boolean39 = instant0.isEqual((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Instant instant40 = instant0.toInstant();
        org.joda.time.Instant instant42 = instant0.plus((long) (-120));
        org.joda.time.MutableDateTime mutableDateTime43 = instant0.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        long long50 = dateTimeZone46.convertLocalToUTC(355200035L, false, (long) (byte) 100);
        long long52 = dateTimeZone46.nextTransition(1L);
        long long54 = dateTimeZone46.convertUTCToLocal(15L);
        org.joda.time.DateTime dateTime55 = mutableDateTime43.toDateTime(dateTimeZone46);
        java.lang.String str57 = dateTimeZone46.getShortName((long) (-1439050));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime43", (instant0.compareTo(mutableDateTime43) == 0) == instant0.equals(mutableDateTime43));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 1);
        org.joda.time.Instant instant3 = instant1.plus(315569520000001L);
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.Hours hours5 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours6 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours7 = hours5.minus(hours6);
        org.joda.time.Hours hours8 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours9 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours10 = hours8.minus(hours9);
        org.joda.time.Hours hours11 = hours5.minus(hours8);
        org.joda.time.DateTime dateTime13 = dateTime4.withPeriodAdded((org.joda.time.ReadablePeriod) hours5, 1);
        java.lang.String str14 = hours5.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime4", (instant3.compareTo(dateTime4) == 0) == instant3.equals(dateTime4));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration14 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', chronology22);
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.withFields(readablePartial25);
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfDay();
        org.joda.time.DateTime dateTime28 = dateTime26.withEarlierOffsetAtOverlap();
        int int29 = dateTime26.getDayOfWeek();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, periodType31, chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology36.getZone();
        org.joda.time.DateTime dateTime40 = dateTime26.withChronology(chronology36);
        org.joda.time.Interval interval41 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Instant instant43 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration14, 48);
        org.joda.time.Duration duration44 = duration14.toDuration();
        org.joda.time.Duration duration45 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration46 = duration45.toDuration();
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.DateTimeZone dateTimeZone52 = chronology51.getZone();
        org.joda.time.Period period53 = duration45.toPeriod(chronology51);
        boolean boolean54 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration45);
        long long55 = duration14.getStandardSeconds();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone57);
        int int59 = dateTime58.getMillisOfDay();
        org.joda.time.DateTime dateTime61 = dateTime58.plusMillis((int) '#');
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 1, periodType64, chronology69);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) '4', chronology69);
        org.joda.time.DateTime dateTime72 = dateTime61.withChronology(chronology69);
        org.joda.time.Period period73 = duration14.toPeriod(chronology69);
        org.joda.time.DurationField durationField74 = chronology69.centuries();
        org.joda.time.DateTimeField dateTimeField75 = chronology69.dayOfYear();
        org.joda.time.DurationField durationField76 = chronology69.minutes();
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval82 = mutableInterval81.toInterval();
        org.joda.time.Chronology chronology83 = interval82.getChronology();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) 1, periodType78, chronology83);
        org.joda.time.DateTimeField dateTimeField85 = chronology83.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone86 = chronology83.getZone();
        long long89 = dateTimeZone86.convertLocalToUTC((-6380815651200000L), true);
        long long91 = dateTimeZone86.convertUTCToLocal((long) 53);
        java.lang.String str92 = dateTimeZone86.toString();
        org.joda.time.DateTime dateTime93 = new org.joda.time.DateTime(dateTimeZone86);
        long long95 = dateTimeZone86.nextTransition(355200035L);
        org.joda.time.Chronology chronology96 = chronology69.withZone(dateTimeZone86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime93", (instant0.compareTo(dateTime93) == 0) == instant0.equals(dateTime93));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean14 = mutableInterval9.isBefore((org.joda.time.ReadableInterval) mutableInterval13);
        boolean boolean15 = mutableInterval6.contains((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.DateTime dateTime17 = dateTime2.plus((org.joda.time.ReadablePeriod) weeks16);
        java.lang.String str18 = dateTime2.toString();
        org.joda.time.DateTime dateTime20 = dateTime2.withYear(0);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        java.lang.String str24 = dateTimeZone23.toString();
        org.joda.time.DateTime dateTime25 = dateTime21.withZone(dateTimeZone23);
        org.joda.time.DateTime dateTime27 = dateTime25.minusHours(44);
        boolean boolean28 = dateTime2.isBefore((org.joda.time.ReadableInstant) dateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime25", (dateTime21.compareTo(dateTime25) == 0) == dateTime21.equals(dateTime25));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) 'a', 1970, 10, (int) '4', 1970, 887, (int) (short) 1);
        mutablePeriod8.addDays(887);
        org.joda.time.Instant instant12 = org.joda.time.Instant.parse("0");
        org.joda.time.Period period14 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType15 = period14.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) (-90), periodType15);
        org.joda.time.Period period17 = mutablePeriod16.toPeriod();
        org.joda.time.Weeks weeks18 = period17.toStandardWeeks();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) instant12, (org.joda.time.ReadablePeriod) weeks18);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, periodType21, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone29 = chronology26.getZone();
        org.joda.time.DateTimeField dateTimeField30 = chronology26.minuteOfHour();
        org.joda.time.Chronology chronology31 = chronology26.withUTC();
        org.joda.time.DateTimeField dateTimeField32 = chronology26.millisOfDay();
        org.joda.time.DurationField durationField33 = chronology26.hours();
        org.joda.time.DateTimeField dateTimeField34 = chronology26.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime35 = instant12.toMutableDateTime(chronology26);
        org.joda.time.DateTime dateTime36 = instant12.toDateTimeISO();
        org.joda.time.Duration duration37 = mutablePeriod8.toDurationFrom((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Period period38 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType39 = period38.getPeriodType();
        org.joda.time.Period period41 = period38.withMonths((int) (byte) 0);
        org.joda.time.Period period43 = period41.plusWeeks(1);
        org.joda.time.Period period45 = period43.minusHours((-3600000));
        org.joda.time.Minutes minutes47 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.Minutes minutes48 = minutes47.negated();
        org.joda.time.Minutes minutes50 = minutes48.multipliedBy((-1));
        org.joda.time.Period period51 = period45.plus((org.joda.time.ReadablePeriod) minutes50);
        int int52 = period51.getDays();
        mutablePeriod8.mergePeriod((org.joda.time.ReadablePeriod) period51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime35", (instant12.compareTo(mutableDateTime35) == 0) == instant12.equals(mutableDateTime35));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes2, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone10);
        int int12 = dateTime11.getDayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime11.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfYear();
        org.joda.time.DateTime dateTime16 = property15.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime18 = property15.addWrapFieldToCopy(1);
        boolean boolean19 = instant7.isBefore((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = instant7.toDateTimeISO();
        org.joda.time.DateTime.Property property21 = dateTime20.dayOfMonth();
        int int22 = property21.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime20", (instant7.compareTo(dateTime20) == 0) == instant7.equals(dateTime20));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        int int7 = property6.getMinimumValue();
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', chronology16);
        org.joda.time.ReadablePartial readablePartial19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.withFields(readablePartial19);
        boolean boolean21 = instant8.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime22 = instant8.toDateTime();
        int int23 = property6.compareTo((org.joda.time.ReadableInstant) instant8);
        org.joda.time.DateTime dateTime24 = property6.roundCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime22", (instant8.compareTo(dateTime22) == 0) == instant8.equals(dateTime22));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        long long13 = mutableInterval9.getEndMillis();
        org.joda.time.MutableInterval mutableInterval14 = mutableInterval9.toMutableInterval();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.Instant instant16 = dateTime15.toInstant();
        org.joda.time.Instant instant17 = instant16.toInstant();
        org.joda.time.ReadableInstant readableInstant18 = null;
        mutableInterval9.setInterval((org.joda.time.ReadableInstant) instant16, readableInstant18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant16", (dateTime15.compareTo(instant16) == 0) == dateTime15.equals(instant16));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone3);
        int int5 = dateTime4.getMillisOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.plusMillis((int) '#');
        boolean boolean9 = dateTime7.isAfter((-1L));
        int int10 = dateTime7.getCenturyOfEra();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime7.toDateTime(chronology11);
        org.joda.time.Period period13 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Duration duration14 = duration1.toDuration();
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, (org.joda.time.ReadableInstant) instant15);
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.plus(readableDuration23);
        org.joda.time.DateTime.Property property25 = dateTime22.minuteOfDay();
        org.joda.time.Duration duration26 = period16.toDurationTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.PeriodType periodType27 = period16.getPeriodType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime22", (instant15.compareTo(dateTime22) == 0) == instant15.equals(dateTime22));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.Minutes minutes2 = minutes1.negated();
        org.joda.time.Duration duration3 = minutes2.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType4 = minutes2.getFieldType();
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int int8 = minutes6.get(durationFieldType7);
        int int10 = minutes6.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod11 = minutes6.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType13 = minutes6.getFieldType(0);
        org.joda.time.Duration duration14 = minutes6.toStandardDuration();
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType17 = null;
        int int18 = minutes16.get(durationFieldType17);
        int int20 = minutes16.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod21 = minutes16.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType23 = minutes16.getFieldType(0);
        org.joda.time.Duration duration24 = minutes16.toStandardDuration();
        org.joda.time.Minutes minutes26 = minutes16.minus(24);
        boolean boolean28 = minutes16.equals((java.lang.Object) 12);
        boolean boolean29 = minutes6.isGreaterThan(minutes16);
        java.lang.String str30 = minutes16.toString();
        org.joda.time.Minutes minutes31 = minutes2.minus(minutes16);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 1, periodType34, chronology39);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) '4', chronology39);
        org.joda.time.ReadablePartial readablePartial42 = null;
        org.joda.time.DateTime dateTime43 = dateTime41.withFields(readablePartial42);
        org.joda.time.DateTime.Property property44 = dateTime43.millisOfDay();
        org.joda.time.DateTime dateTime46 = dateTime43.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property47 = dateTime43.era();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime();
        org.joda.time.Instant instant49 = dateTime48.toInstant();
        org.joda.time.Minutes minutes50 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) instant49);
        org.joda.time.Minutes minutes51 = minutes31.plus(minutes50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime48 and instant49", (dateTime48.compareTo(instant49) == 0) == dateTime48.equals(instant49));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime5.minus(349200757L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = dateTime5.withZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        long long18 = dateTimeZone14.convertLocalToUTC((-31L), true, (long) 100);
        org.joda.time.DateTime dateTime19 = dateTime12.toDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime19", (dateTime5.compareTo(dateTime19) == 0) == dateTime5.equals(dateTime19));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology14.getZone();
        java.lang.String str17 = dateTimeZone15.getName(100L);
        org.joda.time.DateTime dateTime18 = dateTime9.withZoneRetainFields(dateTimeZone15);
        int int19 = dateTime18.getDayOfMonth();
        org.joda.time.DateTime.Property property20 = dateTime18.secondOfDay();
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, periodType24, chronology29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) '4', chronology29);
        org.joda.time.ReadablePartial readablePartial32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.withFields(readablePartial32);
        boolean boolean34 = instant21.isAfter((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Duration duration35 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 1, periodType38, chronology43);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) '4', chronology43);
        org.joda.time.ReadablePartial readablePartial46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.withFields(readablePartial46);
        org.joda.time.DateTime.Property property48 = dateTime47.millisOfDay();
        org.joda.time.DateTime dateTime49 = dateTime47.withEarlierOffsetAtOverlap();
        int int50 = dateTime47.getDayOfWeek();
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval56 = mutableInterval55.toInterval();
        org.joda.time.Chronology chronology57 = interval56.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 1, periodType52, chronology57);
        org.joda.time.DateTimeField dateTimeField59 = chronology57.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone60 = chronology57.getZone();
        org.joda.time.DateTime dateTime61 = dateTime47.withChronology(chronology57);
        org.joda.time.Interval interval62 = duration35.toIntervalTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Instant instant64 = instant21.withDurationAdded((org.joda.time.ReadableDuration) duration35, 48);
        org.joda.time.Duration duration65 = duration35.toDuration();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone67);
        int int69 = dateTime68.getDayOfMonth();
        org.joda.time.DateTime dateTime71 = dateTime68.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property72 = dateTime71.dayOfYear();
        org.joda.time.DateTime dateTime73 = property72.roundHalfFloorCopy();
        org.joda.time.Period period74 = duration35.toPeriodFrom((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.Duration duration75 = duration35.toDuration();
        org.joda.time.Period period77 = org.joda.time.Period.months(24);
        org.joda.time.PeriodType periodType78 = period77.getPeriodType();
        org.joda.time.Period period79 = duration35.toPeriod(periodType78);
        org.joda.time.DateTime dateTime80 = dateTime18.plus((org.joda.time.ReadableDuration) duration35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime80 and instant21", (dateTime80.compareTo(instant21) == 0) == dateTime80.equals(instant21));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        mutablePeriod8.addMonths((int) (short) -1);
        org.joda.time.Period period18 = org.joda.time.Period.days((-1));
        org.joda.time.Period period20 = period18.withWeeks((int) 'a');
        org.joda.time.Period period22 = period18.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = period22.isSupported(durationFieldType23);
        mutablePeriod8.add((org.joda.time.ReadablePeriod) period22);
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean36 = mutableInterval31.isBefore((org.joda.time.ReadableInterval) mutableInterval35);
        boolean boolean37 = mutableInterval28.contains((org.joda.time.ReadableInterval) mutableInterval35);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        long long43 = interval41.toDurationMillis();
        org.joda.time.Interval interval45 = interval41.withEndMillis((long) (short) 100);
        mutableInterval35.setInterval((org.joda.time.ReadableInterval) interval41);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        long long52 = interval50.toDurationMillis();
        boolean boolean53 = interval41.isAfter((org.joda.time.ReadableInterval) interval50);
        org.joda.time.Interval interval55 = interval41.withEndMillis(100L);
        boolean boolean56 = interval41.containsNow();
        mutablePeriod8.setPeriod((org.joda.time.ReadableInterval) interval41);
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.Chronology chronology62 = interval61.getChronology();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(chronology62);
        int int64 = dateTime63.getSecondOfMinute();
        org.joda.time.DateTime dateTime66 = dateTime63.withWeekyear(3);
        boolean boolean68 = dateTime66.isAfter(9223372036505575807L);
        boolean boolean69 = interval41.contains((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime.Property property70 = dateTime66.millisOfSecond();
        org.joda.time.Instant instant71 = new org.joda.time.Instant((java.lang.Object) dateTime66);
        org.joda.time.DateTime.Property property72 = dateTime66.millisOfSecond();
        org.joda.time.DurationField durationField73 = property72.getLeapDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime66 and instant71", (dateTime66.compareTo(instant71) == 0) == dateTime66.equals(instant71));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property15 = dateTime11.era();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Instant instant17 = dateTime16.toInstant();
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) instant17);
        org.joda.time.MutableDateTime mutableDateTime19 = instant17.toMutableDateTimeISO();
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(6216719587200001L, dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone25);
        int int27 = dateTime26.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime26.getZone();
        int int29 = dateTime23.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime31 = dateTime26.withMillis((long) (short) 10);
        org.joda.time.DateTime dateTime33 = dateTime26.withMillisOfDay(53);
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.Duration duration39 = interval37.toDuration();
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str41 = periodType40.getName();
        org.joda.time.PeriodType periodType42 = periodType40.withSecondsRemoved();
        org.joda.time.Period period44 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType45 = period44.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) (-90), periodType45);
        org.joda.time.Period period47 = mutablePeriod46.toPeriod();
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.hours();
        boolean boolean49 = period47.isSupported(durationFieldType48);
        boolean boolean50 = periodType42.isSupported(durationFieldType48);
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) 1, periodType53, chronology58);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) '4', chronology58);
        org.joda.time.DurationField durationField61 = chronology58.centuries();
        org.joda.time.DurationField durationField62 = chronology58.weekyears();
        org.joda.time.Period period63 = duration39.toPeriod(periodType42, chronology58);
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableDuration) duration39);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant17, (org.joda.time.ReadableDuration) duration39);
        org.joda.time.DateTime dateTime66 = instant17.toDateTime();
        java.util.GregorianCalendar gregorianCalendar67 = dateTime66.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant17", (dateTime16.compareTo(instant17) == 0) == dateTime16.equals(instant17));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime7 = dateTime5.withYear(0);
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone10);
        int int12 = dateTime11.getSecondOfMinute();
        int int13 = dateTime11.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone15);
        int int17 = dateTime16.getMillisOfDay();
        org.joda.time.DateTime dateTime19 = dateTime16.plusMillis((int) '#');
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, periodType22, chronology27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', chronology27);
        org.joda.time.DateTime dateTime30 = dateTime19.withChronology(chronology27);
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime11.toMutableDateTime(chronology27);
        org.joda.time.DateTime dateTime32 = dateTime7.toDateTime(chronology27);
        org.joda.time.DateTime.Property property33 = dateTime32.monthOfYear();
        org.joda.time.Duration duration34 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) '4', chronology42);
        org.joda.time.ReadablePartial readablePartial45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.withFields(readablePartial45);
        org.joda.time.DateTime.Property property47 = dateTime46.millisOfDay();
        org.joda.time.DateTime dateTime48 = dateTime46.withEarlierOffsetAtOverlap();
        int int49 = dateTime46.getDayOfWeek();
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 1, periodType51, chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone59 = chronology56.getZone();
        org.joda.time.DateTime dateTime60 = dateTime46.withChronology(chronology56);
        org.joda.time.Interval interval61 = duration34.toIntervalTo((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period64 = duration34.toPeriodFrom((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTime.Property property65 = dateTime63.era();
        boolean boolean66 = dateTime63.isBeforeNow();
        org.joda.time.DateTime dateTime67 = dateTime63.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime69 = dateTime67.minus(52L);
        org.joda.time.DateTime dateTime71 = dateTime67.withMinuteOfHour(32);
        org.joda.time.Hours hours72 = org.joda.time.Hours.EIGHT;
        int int73 = hours72.size();
        org.joda.time.PeriodType periodType74 = hours72.getPeriodType();
        org.joda.time.PeriodType periodType75 = periodType74.withHoursRemoved();
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime67, periodType74);
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval82 = mutableInterval81.toInterval();
        org.joda.time.Chronology chronology83 = interval82.getChronology();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) 1, periodType78, chronology83);
        org.joda.time.Chronology chronology85 = chronology83.withUTC();
        org.joda.time.DateTimeField dateTimeField86 = chronology85.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime87 = dateTime67.toMutableDateTime(chronology85);
        org.joda.time.DateTimeField dateTimeField88 = chronology85.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime63 and mutableDateTime87", (dateTime63.compareTo(mutableDateTime87) == 0) == dateTime63.equals(mutableDateTime87));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone3);
        int int5 = dateTime4.getDayOfMonth();
        org.joda.time.DateTime dateTime7 = dateTime4.withMillisOfDay((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime11 = dateTime7.toDateTime(dateTimeZone10);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(periodType13);
        org.joda.time.PeriodType periodType15 = periodType13.withWeeksRemoved();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 349200000, periodType13, chronology16);
        org.joda.time.PeriodType periodType18 = periodType13.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime7, periodType18);
        org.joda.time.Duration duration21 = duration1.minus((-472L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime11", (dateTime7.compareTo(dateTime11) == 0) == dateTime7.equals(dateTime11));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long5 = dateTimeZone0.convertLocalToUTC((long) 'a', true);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((-530L));
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        boolean boolean14 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology23.getZone();
        java.lang.String str26 = dateTimeZone24.getName(100L);
        org.joda.time.DateTime dateTime27 = dateTime18.withZoneRetainFields(dateTimeZone24);
        long long29 = dateTimeZone17.getMillisKeepLocal(dateTimeZone24, 6000035L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone17.getShortName(349200000L, locale32);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime13.toMutableDateTime(dateTimeZone17);
        long long36 = dateTimeZone0.getMillisKeepLocal(dateTimeZone17, (-806942826000000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime34", (dateTime13.compareTo(mutableDateTime34) == 0) == dateTime13.equals(mutableDateTime34));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Period period15 = org.joda.time.Period.days((-1));
        org.joda.time.Period period17 = period15.withWeeks((int) 'a');
        org.joda.time.Period period19 = period15.plusMonths((int) (short) -1);
        org.joda.time.Period period21 = period15.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime22 = dateTime10.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone24);
        int int26 = dateTime25.getMillisOfDay();
        org.joda.time.DateTime dateTime28 = dateTime25.plusMillis((int) '#');
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, periodType31, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) '4', chronology36);
        org.joda.time.DateTime dateTime39 = dateTime28.withChronology(chronology36);
        int int40 = dateTime39.getYearOfEra();
        org.joda.time.Chronology chronology41 = dateTime39.getChronology();
        boolean boolean42 = dateTime22.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime44 = dateTime22.plusHours((int) (short) 100);
        org.joda.time.DateTime dateTime46 = dateTime44.plusYears((-1870));
        org.joda.time.Instant instant47 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Instant instant50 = instant47.withDurationAdded(readableDuration48, 10);
        org.joda.time.Instant instant51 = instant50.toInstant();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        long long58 = dateTimeZone54.convertLocalToUTC(355200035L, false, (long) (byte) 100);
        long long60 = dateTimeZone54.nextTransition(1L);
        org.joda.time.MutableDateTime mutableDateTime61 = instant51.toMutableDateTime(dateTimeZone54);
        org.joda.time.DateTime dateTime62 = dateTime46.withZone(dateTimeZone54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime61", (instant0.compareTo(mutableDateTime61) == 0) == instant0.equals(mutableDateTime61));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        int int15 = mutablePeriod8.getMillis();
        org.joda.time.DurationFieldType durationFieldType17 = mutablePeriod8.getFieldType(0);
        mutablePeriod8.setDays((int) (byte) -1);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.Instant instant21 = dateTime20.toInstant();
        org.joda.time.Duration duration22 = mutablePeriod8.toDurationFrom((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, periodType24, chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.hourOfHalfday();
        long long34 = dateTimeField31.getDifferenceAsLong((long) 10, (long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone36);
        int int38 = dateTime37.getSecondOfMinute();
        org.joda.time.DateTime dateTime40 = dateTime37.withMinuteOfHour(10);
        org.joda.time.TimeOfDay timeOfDay41 = dateTime40.toTimeOfDay();
        int[] intArray48 = new int[] { '4', 1970, 10, (byte) 10, 24, 50 };
        int int49 = dateTimeField31.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay41, intArray48);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 1, periodType51, chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.hourOfHalfday();
        long long61 = dateTimeField58.getDifferenceAsLong((long) 10, (long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone63);
        int int65 = dateTime64.getSecondOfMinute();
        org.joda.time.DateTime dateTime67 = dateTime64.withMinuteOfHour(10);
        org.joda.time.TimeOfDay timeOfDay68 = dateTime67.toTimeOfDay();
        int[] intArray75 = new int[] { '4', 1970, 10, (byte) 10, 24, 50 };
        int int76 = dateTimeField58.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay68, intArray75);
        org.joda.time.Days days77 = org.joda.time.Days.daysBetween((org.joda.time.ReadablePartial) timeOfDay41, (org.joda.time.ReadablePartial) timeOfDay68);
        org.joda.time.DateTime dateTime78 = dateTime20.withFields((org.joda.time.ReadablePartial) timeOfDay41);
        int int79 = dateTime20.getDayOfYear();
        org.joda.time.Duration duration81 = org.joda.time.Duration.standardHours((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone83);
        int int85 = dateTime84.getMillisOfDay();
        org.joda.time.DateTime dateTime87 = dateTime84.plusMillis((int) '#');
        boolean boolean89 = dateTime87.isAfter((-1L));
        int int90 = dateTime87.getCenturyOfEra();
        org.joda.time.Chronology chronology91 = null;
        org.joda.time.DateTime dateTime92 = dateTime87.toDateTime(chronology91);
        org.joda.time.Period period93 = duration81.toPeriodFrom((org.joda.time.ReadableInstant) dateTime87);
        org.joda.time.Duration duration94 = duration81.toDuration();
        org.joda.time.MutableInterval mutableInterval95 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableDuration) duration94);
        org.joda.time.Chronology chronology96 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField97 = chronology96.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant21", (dateTime20.compareTo(instant21) == 0) == dateTime20.equals(instant21));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration14 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', chronology22);
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.withFields(readablePartial25);
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfDay();
        org.joda.time.DateTime dateTime28 = dateTime26.withEarlierOffsetAtOverlap();
        int int29 = dateTime26.getDayOfWeek();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, periodType31, chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology36.getZone();
        org.joda.time.DateTime dateTime40 = dateTime26.withChronology(chronology36);
        org.joda.time.Interval interval41 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Instant instant43 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration14, 48);
        org.joda.time.Instant instant44 = instant0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime45 = instant44.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone46 = instant44.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant44 and mutableDateTime45", (instant44.compareTo(mutableDateTime45) == 0) == instant44.equals(mutableDateTime45));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Instant instant3 = instant1.minus(0L);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, periodType8, chronology13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', chronology13);
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, periodType19, chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', chronology24);
        org.joda.time.ReadablePartial readablePartial27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withFields(readablePartial27);
        boolean boolean29 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime26);
        boolean boolean30 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Chronology chronology31 = dateTime15.getChronology();
        org.joda.time.DateTime dateTime34 = dateTime15.withDurationAdded((-61394288400000L), 947);
        org.joda.time.DateTime dateTime36 = dateTime34.minusWeeks(21);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period47 = org.joda.time.Period.days((-1));
        org.joda.time.Period period49 = period47.withWeeks((int) 'a');
        java.lang.String str50 = period47.toString();
        mutablePeriod45.setPeriod((org.joda.time.ReadablePeriod) period47);
        mutablePeriod45.addMonths((int) (short) -1);
        org.joda.time.Period period55 = org.joda.time.Period.days((-1));
        org.joda.time.Period period57 = period55.withWeeks((int) 'a');
        org.joda.time.Period period59 = period55.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType60 = null;
        boolean boolean61 = period59.isSupported(durationFieldType60);
        mutablePeriod45.add((org.joda.time.ReadablePeriod) period59);
        org.joda.time.Period period64 = period59.withMonths(1);
        org.joda.time.Period period66 = period64.withSeconds(0);
        org.joda.time.Period period67 = period64.toPeriod();
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval74 = mutableInterval73.toInterval();
        org.joda.time.Chronology chronology75 = interval74.getChronology();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((long) 1, periodType70, chronology75);
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime((long) '4', chronology75);
        org.joda.time.DurationField durationField78 = chronology75.centuries();
        long long81 = durationField78.add((long) (byte) 1, (int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType82 = durationField78.getType();
        long long84 = durationField78.getMillis(52L);
        long long87 = durationField78.getValueAsLong((long) '4', 53L);
        org.joda.time.DurationFieldType durationFieldType88 = durationField78.getType();
        int int89 = period64.get(durationFieldType88);
        org.joda.time.DateTime dateTime91 = dateTime36.withFieldAdded(durationFieldType88, (int) (byte) 100);
        org.joda.time.Chronology chronology92 = dateTime36.getChronology();
        org.joda.time.MutableInterval mutableInterval93 = new org.joda.time.MutableInterval(0L, (long) 365, chronology92);
        org.joda.time.DateTime dateTime94 = org.joda.time.DateTime.now(chronology92);
        boolean boolean95 = instant3.isEqual((org.joda.time.ReadableInstant) dateTime94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant3", (dateTime0.compareTo(instant3) == 0) == dateTime0.equals(instant3));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(852);
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = minutes4.get(durationFieldType5);
        org.joda.time.DurationFieldType durationFieldType7 = minutes4.getFieldType();
        boolean boolean8 = minutes2.isGreaterThan(minutes4);
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes4, (org.joda.time.ReadableInstant) instant9);
        org.joda.time.DateTime dateTime11 = instant9.toDateTimeISO();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period1, (org.joda.time.ReadableInstant) instant9);
        int int13 = period1.getMonths();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime11", (instant9.compareTo(dateTime11) == 0) == instant9.equals(dateTime11));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime2 = dateTime0.toMutableDateTime();
        boolean boolean3 = mutableDateTime2.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 1);
        org.joda.time.Instant instant3 = instant1.minus(863999990L);
        org.joda.time.Instant instant5 = instant3.plus((-2012L));
        org.joda.time.DateTime dateTime6 = instant3.toDateTimeISO();
        org.joda.time.Instant instant8 = instant3.minus(1645455013523L);
        long long9 = instant8.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime6", (instant3.compareTo(dateTime6) == 0) == instant3.equals(dateTime6));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.DateTimeZone dateTimeZone8 = chronology7.getZone();
        java.lang.String str10 = dateTimeZone8.getName(100L);
        org.joda.time.DateTime dateTime11 = dateTime2.withZoneRetainFields(dateTimeZone8);
        int int12 = dateTime11.getMinuteOfDay();
        int int13 = dateTime11.getEra();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone15);
        org.joda.time.DateTime dateTime17 = dateTime16.withLaterOffsetAtOverlap();
        org.joda.time.Hours hours18 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Period period19 = duration1.toPeriodTo((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, periodType23, chronology28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) '4', chronology28);
        org.joda.time.ReadablePartial readablePartial31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.withFields(readablePartial31);
        boolean boolean33 = instant20.isAfter((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Duration duration34 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) '4', chronology42);
        org.joda.time.ReadablePartial readablePartial45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.withFields(readablePartial45);
        org.joda.time.DateTime.Property property47 = dateTime46.millisOfDay();
        org.joda.time.DateTime dateTime48 = dateTime46.withEarlierOffsetAtOverlap();
        int int49 = dateTime46.getDayOfWeek();
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 1, periodType51, chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone59 = chronology56.getZone();
        org.joda.time.DateTime dateTime60 = dateTime46.withChronology(chronology56);
        org.joda.time.Interval interval61 = duration34.toIntervalTo((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Instant instant63 = instant20.withDurationAdded((org.joda.time.ReadableDuration) duration34, 48);
        org.joda.time.Duration duration64 = duration34.toDuration();
        org.joda.time.Duration duration65 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration66 = duration65.toDuration();
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval70 = mutableInterval69.toInterval();
        org.joda.time.Chronology chronology71 = interval70.getChronology();
        org.joda.time.DateTimeZone dateTimeZone72 = chronology71.getZone();
        org.joda.time.Period period73 = duration65.toPeriod(chronology71);
        boolean boolean74 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration65);
        long long75 = duration34.getStandardSeconds();
        org.joda.time.Duration duration77 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration34, (int) (byte) 0);
        org.joda.time.Hours hours78 = duration77.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant20", (dateTime2.compareTo(instant20) == 0) == dateTime2.equals(instant20));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        long long5 = interval3.toDurationMillis();
        org.joda.time.Interval interval7 = interval3.withEndMillis((long) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period18 = org.joda.time.Period.days((-1));
        org.joda.time.Period period20 = period18.withWeeks((int) 'a');
        java.lang.String str21 = period18.toString();
        mutablePeriod16.setPeriod((org.joda.time.ReadablePeriod) period18);
        int int23 = mutablePeriod16.getMillis();
        org.joda.time.MutablePeriod mutablePeriod24 = mutablePeriod16.toMutablePeriod();
        mutablePeriod16.setMillis((int) (byte) 10);
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        long long32 = interval30.toDurationMillis();
        org.joda.time.Interval interval34 = interval30.withEndMillis((long) (short) 100);
        long long35 = interval30.toDurationMillis();
        mutablePeriod16.setPeriod((org.joda.time.ReadableInterval) interval30);
        mutablePeriod16.setMonths(1970);
        mutablePeriod16.setMillis(55);
        org.joda.time.Interval interval41 = interval7.withPeriodAfterStart((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.Instant instant42 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 1, periodType45, chronology50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) '4', chronology50);
        org.joda.time.ReadablePartial readablePartial53 = null;
        org.joda.time.DateTime dateTime54 = dateTime52.withFields(readablePartial53);
        boolean boolean55 = instant42.isAfter((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTime.Property property56 = dateTime52.dayOfWeek();
        org.joda.time.DateTime dateTime57 = property56.withMaximumValue();
        org.joda.time.DateTime dateTime59 = dateTime57.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant60 = new org.joda.time.Instant((java.lang.Object) dateTime57);
        org.joda.time.Hours hours61 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours62 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours63 = hours61.minus(hours62);
        org.joda.time.Duration duration64 = hours62.toStandardDuration();
        org.joda.time.Duration duration65 = duration64.toDuration();
        long long66 = duration65.getStandardSeconds();
        org.joda.time.Instant instant67 = instant60.plus((org.joda.time.ReadableDuration) duration65);
        org.joda.time.Interval interval68 = interval41.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime57 and instant60", (dateTime57.compareTo(instant60) == 0) == dateTime57.equals(instant60));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        int int6 = dateTime5.getSecondOfMinute();
        java.lang.String str8 = dateTime5.toString("+00:00");
        int int9 = dateTime5.getEra();
        int int10 = dateTime5.getCenturyOfEra();
        org.joda.time.DateTime dateTime12 = dateTime5.minus(0L);
        org.joda.time.DateTime.Property property13 = dateTime5.millisOfDay();
        org.joda.time.DateTime dateTime15 = dateTime5.plusYears(4200010);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, periodType22, chronology27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', chronology27);
        org.joda.time.ReadablePartial readablePartial30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.withFields(readablePartial30);
        boolean boolean32 = instant19.isAfter((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime.Property property33 = dateTime29.dayOfWeek();
        boolean boolean34 = dateTimeZone18.equals((java.lang.Object) dateTime29);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) '4', chronology42);
        org.joda.time.ReadablePartial readablePartial45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.withFields(readablePartial45);
        org.joda.time.DateTime.Property property47 = dateTime46.millisOfDay();
        org.joda.time.DateTime dateTime48 = dateTime46.withEarlierOffsetAtOverlap();
        int int49 = dateTime46.getDayOfWeek();
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 1, periodType51, chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone59 = chronology56.getZone();
        org.joda.time.DateTime dateTime60 = dateTime46.withChronology(chronology56);
        org.joda.time.Minutes minutes62 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType63 = null;
        int int64 = minutes62.get(durationFieldType63);
        int int66 = minutes62.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod67 = minutes62.toMutablePeriod();
        long long70 = chronology56.add((org.joda.time.ReadablePeriod) mutablePeriod67, (long) '#', (int) (short) 10);
        org.joda.time.Period period71 = mutablePeriod67.toPeriod();
        boolean boolean72 = dateTimeZone18.equals((java.lang.Object) mutablePeriod67);
        mutablePeriod67.add((long) 4);
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone76);
        int int78 = dateTime77.getDayOfMonth();
        org.joda.time.DateTime dateTime80 = dateTime77.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property81 = dateTime80.dayOfYear();
        java.util.Locale locale82 = null;
        int int83 = property81.getMaximumTextLength(locale82);
        org.joda.time.DateTime dateTime84 = property81.withMinimumValue();
        org.joda.time.Interval interval85 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod67, (org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.DateTime dateTime87 = dateTime84.minusDays(2147483647);
        boolean boolean88 = dateTime15.isEqual((org.joda.time.ReadableInstant) dateTime84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant19", (dateTime5.compareTo(instant19) == 0) == dateTime5.equals(instant19));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        int int15 = mutablePeriod8.getMillis();
        org.joda.time.DurationFieldType durationFieldType17 = mutablePeriod8.getFieldType(0);
        mutablePeriod8.setDays((int) (byte) -1);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.Instant instant21 = dateTime20.toInstant();
        org.joda.time.Duration duration22 = mutablePeriod8.toDurationFrom((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime20.toMutableDateTime();
        int int24 = dateTime20.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and mutableDateTime23", (instant21.compareTo(mutableDateTime23) == 0) == instant21.equals(mutableDateTime23));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.joda.time.Period period1 = org.joda.time.Period.days((-1));
        org.joda.time.Period period3 = period1.withHours((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period14 = org.joda.time.Period.days((-1));
        org.joda.time.Period period16 = period14.withWeeks((int) 'a');
        java.lang.String str17 = period14.toString();
        mutablePeriod12.setPeriod((org.joda.time.ReadablePeriod) period14);
        int int19 = mutablePeriod12.getMillis();
        org.joda.time.DurationFieldType durationFieldType21 = mutablePeriod12.getFieldType(0);
        int int22 = period3.get(durationFieldType21);
        org.joda.time.Duration duration23 = period3.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone25);
        int int27 = dateTime26.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean38 = mutableInterval33.isBefore((org.joda.time.ReadableInterval) mutableInterval37);
        boolean boolean39 = mutableInterval30.contains((org.joda.time.ReadableInterval) mutableInterval37);
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval37);
        org.joda.time.DateTime dateTime41 = dateTime26.plus((org.joda.time.ReadablePeriod) weeks40);
        org.joda.time.DateTime dateTime43 = dateTime26.minusDays((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        org.joda.time.DateTime dateTime46 = dateTime26.withZone(dateTimeZone45);
        org.joda.time.Duration duration47 = period3.toDurationTo((org.joda.time.ReadableInstant) dateTime46);
        int int48 = period3.getYears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime46", (dateTime26.compareTo(dateTime46) == 0) == dateTime26.equals(dateTime46));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) (short) -1);
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded((long) 100, (int) (short) 100);
        boolean boolean13 = dateTime9.isBeforeNow();
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', chronology22);
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.withFields(readablePartial25);
        boolean boolean27 = instant14.isAfter((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Duration duration28 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, periodType31, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) '4', chronology36);
        org.joda.time.ReadablePartial readablePartial39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.withFields(readablePartial39);
        org.joda.time.DateTime.Property property41 = dateTime40.millisOfDay();
        org.joda.time.DateTime dateTime42 = dateTime40.withEarlierOffsetAtOverlap();
        int int43 = dateTime40.getDayOfWeek();
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 1, periodType45, chronology50);
        org.joda.time.DateTimeField dateTimeField52 = chronology50.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone53 = chronology50.getZone();
        org.joda.time.DateTime dateTime54 = dateTime40.withChronology(chronology50);
        org.joda.time.Interval interval55 = duration28.toIntervalTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Instant instant57 = instant14.withDurationAdded((org.joda.time.ReadableDuration) duration28, 48);
        long long58 = instant14.getMillis();
        org.joda.time.Chronology chronology59 = instant14.getChronology();
        org.joda.time.Instant instant61 = instant14.withMillis((-349199903L));
        org.joda.time.Instant instant62 = instant14.toInstant();
        org.joda.time.Duration duration63 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) instant62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant62", (dateTime5.compareTo(instant62) == 0) == dateTime5.equals(instant62));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getSecondOfMinute();
        int int4 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime6 = dateTime2.withYear((int) (byte) 100);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.Duration duration8 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', chronology16);
        org.joda.time.ReadablePartial readablePartial19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.withFields(readablePartial19);
        org.joda.time.DateTime.Property property21 = dateTime20.millisOfDay();
        org.joda.time.DateTime dateTime22 = dateTime20.withEarlierOffsetAtOverlap();
        int int23 = dateTime20.getDayOfWeek();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone33 = chronology30.getZone();
        org.joda.time.DateTime dateTime34 = dateTime20.withChronology(chronology30);
        org.joda.time.Interval interval35 = duration8.toIntervalTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period38 = duration8.toPeriodFrom((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone40);
        int int42 = dateTime41.getMillisOfDay();
        org.joda.time.DateTime dateTime44 = dateTime41.plusMillis((int) '#');
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, periodType47, chronology52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', chronology52);
        org.joda.time.DateTime dateTime55 = dateTime44.withChronology(chronology52);
        org.joda.time.Interval interval56 = duration8.toIntervalFrom((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime58 = dateTime44.minusWeeks(21);
        boolean boolean59 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Instant instant60 = dateTime44.toInstant();
        java.util.Locale locale62 = null;
        java.lang.String str63 = dateTime44.toString("3600010", locale62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and instant60", (dateTime44.compareTo(instant60) == 0) == dateTime44.equals(instant60));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime7 = dateTime2.minusSeconds(0);
        java.lang.Object obj10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType12 = period11.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(obj10, periodType12);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 1, periodType15, chronology20);
        org.joda.time.DateTimeField dateTimeField22 = chronology20.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology20.getZone();
        org.joda.time.DateTimeField dateTimeField24 = chronology20.minuteOfHour();
        org.joda.time.Chronology chronology25 = chronology20.withUTC();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 50, (-10L), periodType12, chronology25);
        org.joda.time.DateTime dateTime27 = dateTime2.toDateTime(chronology25);
        org.joda.time.DateTime dateTime29 = dateTime27.plus(16756760995200L);
        org.joda.time.DateTime dateTime31 = dateTime29.plusSeconds((-14));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime27", (dateTime2.compareTo(dateTime27) == 0) == dateTime2.equals(dateTime27));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes2, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone10);
        int int12 = dateTime11.getDayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime11.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfYear();
        org.joda.time.DateTime dateTime16 = property15.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime18 = property15.addWrapFieldToCopy(1);
        boolean boolean19 = instant7.isBefore((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = instant7.toDateTimeISO();
        org.joda.time.Chronology chronology21 = instant7.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = instant7.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime23 = instant7.toDateTimeISO();
        org.joda.time.Instant instant24 = instant7.toInstant();
        org.joda.time.Instant instant26 = instant24.withMillis((-5999983L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant24 and dateTime20", (instant24.compareTo(dateTime20) == 0) == instant24.equals(dateTime20));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.joda.time.Instant instant2 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 1, periodType5, chronology10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', chronology10);
        org.joda.time.ReadablePartial readablePartial13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withFields(readablePartial13);
        boolean boolean15 = instant2.isAfter((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime.Property property16 = dateTime12.dayOfWeek();
        org.joda.time.DateTime dateTime17 = property16.withMaximumValue();
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((java.lang.Object) dateTime17);
        org.joda.time.Hours hours21 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours22 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours23 = hours21.minus(hours22);
        org.joda.time.Duration duration24 = hours22.toStandardDuration();
        org.joda.time.Duration duration25 = duration24.toDuration();
        long long26 = duration25.getStandardSeconds();
        org.joda.time.Instant instant27 = instant20.plus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.DateTime dateTime28 = instant20.toDateTimeISO();
        org.joda.time.Chronology chronology29 = instant20.getChronology();
        org.joda.time.Interval interval30 = new org.joda.time.Interval(972L, 1643548747590L, chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant20", (dateTime17.compareTo(instant20) == 0) == dateTime17.equals(instant20));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean14 = mutableInterval9.isBefore((org.joda.time.ReadableInterval) mutableInterval13);
        boolean boolean15 = mutableInterval6.contains((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.DateTime dateTime17 = dateTime2.plus((org.joda.time.ReadablePeriod) weeks16);
        org.joda.time.DateTime dateTime19 = dateTime2.minusDays((int) (byte) 1);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, periodType22, chronology27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', chronology27);
        org.joda.time.ReadablePartial readablePartial30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.withFields(readablePartial30);
        org.joda.time.DateTime.Property property32 = dateTime31.millisOfDay();
        org.joda.time.DateTime dateTime34 = dateTime31.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property35 = dateTime31.era();
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime39 = dateTime31.withDurationAdded((org.joda.time.ReadableDuration) duration37, 0);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration37);
        long long41 = duration37.getMillis();
        org.joda.time.Instant instant42 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 1, periodType45, chronology50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) '4', chronology50);
        org.joda.time.ReadablePartial readablePartial53 = null;
        org.joda.time.DateTime dateTime54 = dateTime52.withFields(readablePartial53);
        boolean boolean55 = instant42.isAfter((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Duration duration56 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) 1, periodType59, chronology64);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) '4', chronology64);
        org.joda.time.ReadablePartial readablePartial67 = null;
        org.joda.time.DateTime dateTime68 = dateTime66.withFields(readablePartial67);
        org.joda.time.DateTime.Property property69 = dateTime68.millisOfDay();
        org.joda.time.DateTime dateTime70 = dateTime68.withEarlierOffsetAtOverlap();
        int int71 = dateTime68.getDayOfWeek();
        org.joda.time.PeriodType periodType73 = null;
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval77 = mutableInterval76.toInterval();
        org.joda.time.Chronology chronology78 = interval77.getChronology();
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((long) 1, periodType73, chronology78);
        org.joda.time.DateTimeField dateTimeField80 = chronology78.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone81 = chronology78.getZone();
        org.joda.time.DateTime dateTime82 = dateTime68.withChronology(chronology78);
        org.joda.time.Interval interval83 = duration56.toIntervalTo((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.Instant instant85 = instant42.withDurationAdded((org.joda.time.ReadableDuration) duration56, 48);
        org.joda.time.Duration duration86 = duration56.toDuration();
        org.joda.time.Duration duration87 = duration37.minus((org.joda.time.ReadableDuration) duration86);
        long long88 = duration37.getMillis();
        org.joda.time.MutableInterval mutableInterval91 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval92 = mutableInterval91.toInterval();
        org.joda.time.Chronology chronology93 = interval92.getChronology();
        org.joda.time.DateTime dateTime94 = new org.joda.time.DateTime(chronology93);
        org.joda.time.DateTime.Property property95 = dateTime94.yearOfCentury();
        org.joda.time.DateTime dateTime96 = property95.roundFloorCopy();
        org.joda.time.DateTime dateTime97 = property95.roundCeilingCopy();
        java.lang.String str98 = dateTime97.toString();
        org.joda.time.Interval interval99 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) dateTime97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant42 and dateTime94", (instant42.compareTo(dateTime94) == 0) == instant42.equals(dateTime94));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone16);
        int int18 = dateTime17.getDayOfMonth();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 1, periodType20, chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology25.getZone();
        org.joda.time.DateTime dateTime29 = dateTime17.withZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = dateTime10.withZone(dateTimeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = dateTime10.toString(dateTimeFormatter31);
        org.joda.time.DateTime.Property property33 = dateTime10.yearOfCentury();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, periodType36, chronology41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) '4', chronology41);
        org.joda.time.ReadablePartial readablePartial44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.withFields(readablePartial44);
        org.joda.time.DateTime.Property property46 = dateTime45.millisOfDay();
        org.joda.time.DateTime dateTime47 = dateTime45.withEarlierOffsetAtOverlap();
        int int48 = dateTime45.getDayOfWeek();
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 1, periodType50, chronology55);
        org.joda.time.DateTimeField dateTimeField57 = chronology55.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone58 = chronology55.getZone();
        org.joda.time.DateTime dateTime59 = dateTime45.withChronology(chronology55);
        org.joda.time.DateTime dateTime60 = dateTime45.withEarlierOffsetAtOverlap();
        org.joda.time.Period period61 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType62 = period61.getPeriodType();
        org.joda.time.Period period64 = period61.withMonths((int) (byte) 0);
        org.joda.time.Period period65 = period61.toPeriod();
        org.joda.time.DateTime dateTime67 = dateTime60.withPeriodAdded((org.joda.time.ReadablePeriod) period65, (int) (byte) 0);
        boolean boolean68 = property33.equals((java.lang.Object) dateTime67);
        int int69 = property33.getMaximumValueOverall();
        int int70 = property33.getMinimumValue();
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval75 = mutableInterval74.toInterval();
        org.joda.time.Chronology chronology76 = interval75.getChronology();
        org.joda.time.DateTimeZone dateTimeZone77 = chronology76.getZone();
        java.lang.String str79 = dateTimeZone77.getName(100L);
        org.joda.time.DateTime dateTime80 = dateTime71.withZoneRetainFields(dateTimeZone77);
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval84 = mutableInterval83.toInterval();
        org.joda.time.Chronology chronology85 = interval84.getChronology();
        org.joda.time.DateTimeZone dateTimeZone86 = chronology85.getZone();
        java.lang.String str88 = dateTimeZone86.getName(100L);
        org.joda.time.DateTime dateTime89 = dateTime80.withZoneRetainFields(dateTimeZone86);
        org.joda.time.DateTime dateTime91 = dateTime80.plusMonths(1);
        org.joda.time.DateTime dateTime93 = dateTime80.minus(0L);
        int int94 = property33.compareTo((org.joda.time.ReadableInstant) dateTime80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime80", (instant0.compareTo(dateTime80) == 0) == instant0.equals(dateTime80));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Instant instant3 = instant1.plus(157784803200024L);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTime();
        org.joda.time.Duration duration5 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration6 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 1, periodType9, chronology14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) '4', chronology14);
        org.joda.time.ReadablePartial readablePartial17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.withFields(readablePartial17);
        org.joda.time.DateTime.Property property19 = dateTime18.millisOfDay();
        org.joda.time.DateTime dateTime20 = dateTime18.withEarlierOffsetAtOverlap();
        int int21 = dateTime18.getDayOfWeek();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, periodType23, chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology28.getZone();
        org.joda.time.DateTime dateTime32 = dateTime18.withChronology(chronology28);
        org.joda.time.Interval interval33 = duration6.toIntervalTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period36 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateTime35);
        boolean boolean37 = duration5.isShorterThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Hours hours38 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours39 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours40 = hours38.minus(hours39);
        org.joda.time.Duration duration41 = hours39.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone43);
        int int45 = dateTime44.getMillisOfDay();
        org.joda.time.DateTime dateTime47 = dateTime44.plusMillis((int) '#');
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 1, periodType50, chronology55);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) '4', chronology55);
        org.joda.time.DateTime dateTime58 = dateTime47.withChronology(chronology55);
        boolean boolean60 = dateTime58.isEqual(187200000L);
        org.joda.time.Interval interval61 = duration41.toIntervalFrom((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.Chronology chronology68 = interval67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 1, periodType63, chronology68);
        org.joda.time.DateTimeField dateTimeField70 = chronology68.hourOfHalfday();
        long long73 = dateTimeField70.getDifferenceAsLong((long) 10, (long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone75);
        int int77 = dateTime76.getSecondOfMinute();
        org.joda.time.DateTime dateTime79 = dateTime76.withMinuteOfHour(10);
        org.joda.time.TimeOfDay timeOfDay80 = dateTime79.toTimeOfDay();
        int[] intArray87 = new int[] { '4', 1970, 10, (byte) 10, 24, 50 };
        int int88 = dateTimeField70.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay80, intArray87);
        org.joda.time.DateTime dateTime89 = dateTime58.withFields((org.joda.time.ReadablePartial) timeOfDay80);
        org.joda.time.MutableInterval mutableInterval90 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.Instant instant91 = instant1.plus((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Duration duration94 = new org.joda.time.Duration((-3599903L), 3L);
        org.joda.time.Duration duration95 = duration94.toDuration();
        org.joda.time.Instant instant97 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration95, 31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.DateTime.Property property2 = dateTime0.minuteOfDay();
        boolean boolean3 = dateTime0.isEqualNow();
        org.joda.time.DateTime.Property property4 = dateTime0.millisOfDay();
        org.joda.time.DateTime dateTime6 = dateTime0.withYear(21);
        org.joda.time.DateTime dateTime8 = dateTime6.plusWeeks(802202);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property15 = dateTime11.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
        int int17 = property15.getLeapAmount();
        org.joda.time.DateTime dateTime18 = property15.roundFloorCopy();
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        org.joda.time.MutableDateTime mutableDateTime20 = instant19.toMutableDateTime();
        org.joda.time.DateTime dateTime21 = instant19.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.plusWeeks(887);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant19", (dateTime18.compareTo(instant19) == 0) == dateTime18.equals(instant19));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime5 = dateTime2.plusMillis((int) '#');
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, periodType8, chronology13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', chronology13);
        org.joda.time.DateTime dateTime16 = dateTime5.withChronology(chronology13);
        int int17 = dateTime16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateTime16.getChronology();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.Instant instant20 = dateTime19.toInstant();
        org.joda.time.DateTime.Property property21 = dateTime19.minuteOfDay();
        org.joda.time.DateTime dateTime23 = dateTime19.minusWeeks(19);
        org.joda.time.Seconds seconds24 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime19);
        int int25 = dateTime19.getEra();
        org.joda.time.DateTime.Property property26 = dateTime19.weekOfWeekyear();
        int int27 = property26.getLeapAmount();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant20", (dateTime19.compareTo(instant20) == 0) == dateTime19.equals(instant20));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.DateTime dateTime3 = instant1.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.TimeOfDay timeOfDay2 = dateTime0.toTimeOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone4);
        int int6 = dateTime5.getMillisOfDay();
        org.joda.time.DateTime dateTime8 = dateTime5.plusMillis((int) '#');
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', chronology16);
        org.joda.time.DateTime dateTime19 = dateTime8.withChronology(chronology16);
        boolean boolean21 = dateTime19.isEqual(187200000L);
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime19);
        int int23 = dateTime19.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Duration duration5 = org.joda.time.Duration.millis(53035L);
        org.joda.time.Interval interval6 = interval3.withDurationAfterStart((org.joda.time.ReadableDuration) duration5);
        long long7 = interval3.getEndMillis();
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', chronology16);
        org.joda.time.ReadablePartial readablePartial19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.withFields(readablePartial19);
        boolean boolean21 = instant8.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Hours hours22 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours23 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours24 = hours22.minus(hours23);
        org.joda.time.Duration duration25 = hours23.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone27);
        int int29 = dateTime28.getMillisOfDay();
        org.joda.time.DateTime dateTime31 = dateTime28.plusMillis((int) '#');
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 1, periodType34, chronology39);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) '4', chronology39);
        org.joda.time.DateTime dateTime42 = dateTime31.withChronology(chronology39);
        boolean boolean44 = dateTime42.isEqual(187200000L);
        org.joda.time.Interval interval45 = duration25.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime46 = dateTime42.toDateTime();
        boolean boolean47 = instant8.isEqual((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Instant instant48 = instant8.toInstant();
        org.joda.time.Instant instant50 = instant8.plus((long) (-120));
        org.joda.time.MutableDateTime mutableDateTime51 = instant8.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        long long58 = dateTimeZone54.convertLocalToUTC(355200035L, false, (long) (byte) 100);
        long long60 = dateTimeZone54.nextTransition(1L);
        long long62 = dateTimeZone54.convertUTCToLocal(15L);
        org.joda.time.DateTime dateTime63 = mutableDateTime51.toDateTime(dateTimeZone54);
        boolean boolean64 = interval3.isBefore((org.joda.time.ReadableInstant) dateTime63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime51", (instant8.compareTo(mutableDateTime51) == 0) == instant8.equals(mutableDateTime51));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime2.dayOfWeek();
        org.joda.time.DateTime.Property property7 = dateTime2.weekyear();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        org.joda.time.DateTime dateTime9 = property7.getDateTime();
        org.joda.time.DateTime dateTime10 = property7.roundCeilingCopy();
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant14 = instant11.withDurationAdded(readableDuration12, 10);
        org.joda.time.Instant instant17 = instant11.withDurationAdded((-54432000000L), 3);
        org.joda.time.DateTime dateTime18 = instant17.toDateTime();
        org.joda.time.Instant instant20 = instant17.withMillis(6278855182488000L);
        org.joda.time.Chronology chronology21 = instant17.getChronology();
        org.joda.time.DateTime dateTime22 = dateTime10.toDateTime(chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and dateTime18", (instant17.compareTo(dateTime18) == 0) == instant17.equals(dateTime18));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology12.getZone();
        java.lang.String str15 = dateTimeZone13.getName(100L);
        org.joda.time.DateTime dateTime16 = dateTime7.withZoneRetainFields(dateTimeZone13);
        int int17 = dateTime16.getMinuteOfDay();
        int int18 = dateTime16.getEra();
        org.joda.time.DateMidnight dateMidnight19 = dateTime16.toDateMidnight();
        int int20 = dateMidnight19.getHourOfDay();
        long long21 = dateMidnight19.getMillis();
        org.joda.time.Duration duration22 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateMidnight19);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone24);
        int int26 = dateTime25.getMillisOfDay();
        org.joda.time.DateTime dateTime28 = dateTime25.plusMillis((int) '#');
        int int29 = dateTime25.getYearOfEra();
        org.joda.time.DateTime.Property property30 = dateTime25.secondOfMinute();
        org.joda.time.DurationField durationField31 = property30.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.era();
        boolean boolean33 = property30.equals((java.lang.Object) dateTimeFieldType32);
        org.joda.time.DurationFieldType durationFieldType34 = dateTimeFieldType32.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType32.getDurationType();
        boolean boolean36 = dateMidnight19.isSupported(dateTimeFieldType32);
        org.joda.time.Instant instant37 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology38 = instant37.getChronology();
        org.joda.time.Instant instant41 = instant37.withDurationAdded((long) 24, 23);
        org.joda.time.Chronology chronology42 = instant37.getChronology();
        org.joda.time.DateTime dateTime43 = dateMidnight19.toDateTime(chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant37", (dateTime7.compareTo(instant37) == 0) == dateTime7.equals(instant37));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime7 = dateTime5.withYear(0);
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone10);
        int int12 = dateTime11.getSecondOfMinute();
        int int13 = dateTime11.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone15);
        int int17 = dateTime16.getMillisOfDay();
        org.joda.time.DateTime dateTime19 = dateTime16.plusMillis((int) '#');
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, periodType22, chronology27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', chronology27);
        org.joda.time.DateTime dateTime30 = dateTime19.withChronology(chronology27);
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime11.toMutableDateTime(chronology27);
        org.joda.time.DateTime dateTime32 = dateTime7.toDateTime(chronology27);
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean43 = mutableInterval38.isBefore((org.joda.time.ReadableInterval) mutableInterval42);
        boolean boolean44 = mutableInterval35.contains((org.joda.time.ReadableInterval) mutableInterval42);
        org.joda.time.Weeks weeks45 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval42);
        long long46 = mutableInterval42.getEndMillis();
        org.joda.time.DateTime dateTime47 = mutableInterval42.getEnd();
        org.joda.time.Chronology chronology48 = mutableInterval42.getChronology();
        org.joda.time.DateTime dateTime49 = dateTime7.toDateTime(chronology48);
        org.joda.time.DateTime dateTime51 = dateTime7.minusMinutes(2);
        int int52 = dateTime7.getHourOfDay();
        org.joda.time.Instant instant53 = dateTime7.toInstant();
        org.joda.time.DateTime dateTime54 = dateTime7.withTimeAtStartOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant53", (dateTime7.compareTo(instant53) == 0) == dateTime7.equals(instant53));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        int int15 = mutablePeriod8.getMillis();
        org.joda.time.DurationFieldType durationFieldType17 = mutablePeriod8.getFieldType(0);
        mutablePeriod8.setDays((int) (byte) -1);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.Instant instant21 = dateTime20.toInstant();
        org.joda.time.Duration duration22 = mutablePeriod8.toDurationFrom((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, periodType24, chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.hourOfHalfday();
        long long34 = dateTimeField31.getDifferenceAsLong((long) 10, (long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone36);
        int int38 = dateTime37.getSecondOfMinute();
        org.joda.time.DateTime dateTime40 = dateTime37.withMinuteOfHour(10);
        org.joda.time.TimeOfDay timeOfDay41 = dateTime40.toTimeOfDay();
        int[] intArray48 = new int[] { '4', 1970, 10, (byte) 10, 24, 50 };
        int int49 = dateTimeField31.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay41, intArray48);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 1, periodType51, chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.hourOfHalfday();
        long long61 = dateTimeField58.getDifferenceAsLong((long) 10, (long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone63);
        int int65 = dateTime64.getSecondOfMinute();
        org.joda.time.DateTime dateTime67 = dateTime64.withMinuteOfHour(10);
        org.joda.time.TimeOfDay timeOfDay68 = dateTime67.toTimeOfDay();
        int[] intArray75 = new int[] { '4', 1970, 10, (byte) 10, 24, 50 };
        int int76 = dateTimeField58.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay68, intArray75);
        org.joda.time.Days days77 = org.joda.time.Days.daysBetween((org.joda.time.ReadablePartial) timeOfDay41, (org.joda.time.ReadablePartial) timeOfDay68);
        org.joda.time.DateTime dateTime78 = dateTime20.withFields((org.joda.time.ReadablePartial) timeOfDay41);
        int int79 = dateTime20.getDayOfYear();
        org.joda.time.Duration duration81 = org.joda.time.Duration.standardHours((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone83);
        int int85 = dateTime84.getMillisOfDay();
        org.joda.time.DateTime dateTime87 = dateTime84.plusMillis((int) '#');
        boolean boolean89 = dateTime87.isAfter((-1L));
        int int90 = dateTime87.getCenturyOfEra();
        org.joda.time.Chronology chronology91 = null;
        org.joda.time.DateTime dateTime92 = dateTime87.toDateTime(chronology91);
        org.joda.time.Period period93 = duration81.toPeriodFrom((org.joda.time.ReadableInstant) dateTime87);
        org.joda.time.Duration duration94 = duration81.toDuration();
        org.joda.time.MutableInterval mutableInterval95 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableDuration) duration94);
        org.joda.time.Duration duration97 = duration94.withMillis(6033807969846000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant21", (dateTime20.compareTo(instant21) == 0) == dateTime20.equals(instant21));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay7 = dateTime5.toTimeOfDay();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 1, periodType10, chronology15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', chronology15);
        org.joda.time.ReadablePartial readablePartial18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withFields(readablePartial18);
        org.joda.time.DateTime.Property property20 = dateTime19.millisOfDay();
        org.joda.time.DateTime dateTime21 = dateTime19.withEarlierOffsetAtOverlap();
        int int22 = dateTime19.getDayOfWeek();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, periodType24, chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone32 = chronology29.getZone();
        org.joda.time.DateTime dateTime33 = dateTime19.withChronology(chronology29);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, periodType36, chronology41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) '4', chronology41);
        org.joda.time.Instant instant44 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, periodType47, chronology52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', chronology52);
        org.joda.time.ReadablePartial readablePartial55 = null;
        org.joda.time.DateTime dateTime56 = dateTime54.withFields(readablePartial55);
        boolean boolean57 = instant44.isAfter((org.joda.time.ReadableInstant) dateTime54);
        boolean boolean58 = dateTime43.isAfter((org.joda.time.ReadableInstant) dateTime54);
        java.lang.String str59 = dateTime43.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType61 = dateTimeFieldType60.getRangeDurationType();
        int int62 = dateTime43.get(dateTimeFieldType60);
        boolean boolean63 = dateTime43.isBeforeNow();
        org.joda.time.DateTime dateTime64 = dateTime43.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight65 = dateTime64.toDateMidnight();
        boolean boolean66 = dateTime19.isAfter((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTime dateTime68 = dateTime19.minusWeeks(3600010);
        org.joda.time.DateTime dateTime70 = dateTime19.plusWeeks((int) (short) 10);
        org.joda.time.DateTime dateTime71 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime dateTime73 = dateTime70.minusHours(0);
        org.joda.time.Instant instant74 = dateTime70.toInstant();
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval78 = mutableInterval77.toInterval();
        org.joda.time.Chronology chronology79 = interval78.getChronology();
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime(chronology79);
        int int81 = dateTime80.getSecondOfMinute();
        org.joda.time.DateTime dateTime83 = dateTime80.withWeekyear(3);
        boolean boolean85 = dateTime83.isAfter(9223372036505575807L);
        org.joda.time.DateTime dateTime87 = dateTime83.plusWeeks((-6));
        org.joda.time.DateTime dateTime89 = dateTime87.withCenturyOfEra(893);
        org.joda.time.MutableInterval mutableInterval90 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) instant74, (org.joda.time.ReadableInstant) dateTime89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant44 and dateTime80", (instant44.compareTo(dateTime80) == 0) == instant44.equals(dateTime80));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property15 = dateTime11.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
        int int17 = property15.getLeapAmount();
        org.joda.time.DateTime dateTime18 = property15.roundFloorCopy();
        org.joda.time.Instant instant19 = new org.joda.time.Instant((java.lang.Object) dateTime18);
        org.joda.time.DateTime.Property property20 = dateTime18.secondOfMinute();
        org.joda.time.DateTime dateTime21 = property20.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant19", (dateTime21.compareTo(instant19) == 0) == dateTime21.equals(instant19));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property15 = dateTime11.era();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Instant instant17 = dateTime16.toInstant();
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) instant17);
        org.joda.time.Instant instant20 = instant17.minus((long) 349200000);
        org.joda.time.Duration duration21 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, periodType24, chronology29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) '4', chronology29);
        org.joda.time.ReadablePartial readablePartial32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.withFields(readablePartial32);
        org.joda.time.DateTime.Property property34 = dateTime33.millisOfDay();
        org.joda.time.DateTime dateTime35 = dateTime33.withEarlierOffsetAtOverlap();
        int int36 = dateTime33.getDayOfWeek();
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 1, periodType38, chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone46 = chronology43.getZone();
        org.joda.time.DateTime dateTime47 = dateTime33.withChronology(chronology43);
        org.joda.time.Interval interval48 = duration21.toIntervalTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period51 = duration21.toPeriodFrom((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Duration duration53 = duration21.withMillis(100L);
        org.joda.time.Instant instant55 = instant17.withDurationAdded((org.joda.time.ReadableDuration) duration21, 23);
        org.joda.time.Hours hours56 = duration21.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant17", (dateTime16.compareTo(instant17) == 0) == dateTime16.equals(instant17));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.joda.time.Duration duration1 = new org.joda.time.Duration(1L);
        org.joda.time.Duration duration2 = duration1.toDuration();
        long long3 = duration2.getStandardMinutes();
        org.joda.time.Instant instant4 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, periodType7, chronology12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', chronology12);
        org.joda.time.ReadablePartial readablePartial15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.withFields(readablePartial15);
        boolean boolean17 = instant4.isAfter((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime.Property property18 = dateTime14.dayOfWeek();
        org.joda.time.DateTime dateTime19 = property18.withMaximumValue();
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekyear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime19.getZone();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.Interval interval24 = duration2.toIntervalFrom((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone26);
        org.joda.time.DateTime dateTime28 = dateTime27.withLaterOffsetAtOverlap();
        org.joda.time.Duration duration29 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration30 = duration29.toDuration();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableDuration) duration29);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone33);
        java.util.Locale locale35 = null;
        java.util.Calendar calendar36 = dateTime34.toCalendar(locale35);
        org.joda.time.DateTime dateTime38 = dateTime34.minus((long) 56);
        org.joda.time.DateTime.Property property39 = dateTime34.hourOfDay();
        org.joda.time.Days days40 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DurationFieldType durationFieldType41 = days40.getFieldType();
        org.joda.time.PeriodType periodType42 = days40.getPeriodType();
        org.joda.time.Period period43 = duration2.toPeriod(periodType42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime23", (instant4.compareTo(dateTime23) == 0) == instant4.equals(dateTime23));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.Duration duration5 = interval3.toDuration();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str7 = periodType6.getName();
        org.joda.time.PeriodType periodType8 = periodType6.withSecondsRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (-90), periodType11);
        org.joda.time.Period period13 = mutablePeriod12.toPeriod();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.hours();
        boolean boolean15 = period13.isSupported(durationFieldType14);
        boolean boolean16 = periodType8.isSupported(durationFieldType14);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, periodType19, chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', chronology24);
        org.joda.time.DurationField durationField27 = chronology24.centuries();
        org.joda.time.DurationField durationField28 = chronology24.weekyears();
        org.joda.time.Period period29 = duration5.toPeriod(periodType8, chronology24);
        org.joda.time.Duration duration30 = duration5.toDuration();
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        int int37 = dateTime36.getSecondOfMinute();
        java.lang.String str39 = dateTime36.toString("+00:00");
        int int40 = dateTime36.getEra();
        int int41 = dateTime36.getCenturyOfEra();
        org.joda.time.DateTime dateTime43 = dateTime36.minus(0L);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration30, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, periodType47, chronology52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', chronology52);
        org.joda.time.DateTime dateTime56 = dateTime54.withCenturyOfEra(12);
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        org.joda.time.Chronology chronology63 = interval62.getChronology();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) 1, periodType58, chronology63);
        org.joda.time.DateTimeField dateTimeField65 = chronology63.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone66 = chronology63.getZone();
        java.lang.String str67 = dateTimeZone66.toString();
        org.joda.time.DateTime dateTime68 = dateTime54.toDateTime(dateTimeZone66);
        java.util.TimeZone timeZone69 = dateTimeZone66.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forTimeZone(timeZone69);
        org.joda.time.DateTime dateTime71 = dateTime43.withZone(dateTimeZone70);
        org.joda.time.DateTime dateTime72 = org.joda.time.DateTime.now(dateTimeZone70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime71", (dateTime36.compareTo(dateTime71) == 0) == dateTime36.equals(dateTime71));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime14 = instant0.toDateTime();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean25 = mutableInterval20.isBefore((org.joda.time.ReadableInterval) mutableInterval24);
        boolean boolean26 = mutableInterval17.contains((org.joda.time.ReadableInterval) mutableInterval24);
        mutableInterval17.setDurationAfterStart(0L);
        boolean boolean29 = mutableInterval17.containsNow();
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        long long35 = interval33.toDurationMillis();
        org.joda.time.Interval interval37 = interval33.withEndMillis((long) (short) 100);
        long long38 = interval33.toDurationMillis();
        boolean boolean39 = mutableInterval17.overlaps((org.joda.time.ReadableInterval) interval33);
        boolean boolean41 = interval33.contains((long) (-1));
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        org.joda.time.MutableInterval mutableInterval47 = interval45.toMutableInterval();
        boolean boolean48 = interval33.contains((org.joda.time.ReadableInterval) interval45);
        org.joda.time.Duration duration49 = interval45.toDuration();
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.Interval interval55 = interval53.toInterval();
        org.joda.time.Duration duration57 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval58 = interval55.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration57);
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        org.joda.time.Chronology chronology66 = interval65.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 1, periodType61, chronology66);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) '4', chronology66);
        org.joda.time.ReadablePartial readablePartial69 = null;
        org.joda.time.DateTime dateTime70 = dateTime68.withFields(readablePartial69);
        org.joda.time.DateTime.Property property71 = dateTime70.millisOfDay();
        org.joda.time.DateTime dateTime73 = dateTime70.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property74 = dateTime70.era();
        org.joda.time.Duration duration76 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime78 = dateTime70.withDurationAdded((org.joda.time.ReadableDuration) duration76, 0);
        long long79 = duration76.getStandardHours();
        org.joda.time.Duration duration80 = duration57.plus((org.joda.time.ReadableDuration) duration76);
        long long81 = duration57.getMillis();
        org.joda.time.Duration duration82 = duration49.plus((org.joda.time.ReadableDuration) duration57);
        org.joda.time.PeriodType periodType83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant0, (org.joda.time.ReadableDuration) duration49, periodType83);
        org.joda.time.Period period85 = period84.toPeriod();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime14", (instant0.compareTo(dateTime14) == 0) == instant0.equals(dateTime14));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 1);
        org.joda.time.Instant instant3 = instant1.minus(863999990L);
        org.joda.time.DateTime dateTime4 = instant1.toDateTime();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, periodType7, chronology12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', chronology12);
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
        org.joda.time.DateTime dateTime17 = property15.withMinimumValue();
        org.joda.time.DateTime.Property property18 = dateTime17.year();
        int int19 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime21 = dateTime17.minusWeeks(672202027);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime4", (instant1.compareTo(dateTime4) == 0) == instant1.equals(dateTime4));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        int int15 = mutablePeriod8.getMillis();
        org.joda.time.DurationFieldType durationFieldType17 = mutablePeriod8.getFieldType(0);
        mutablePeriod8.setDays((int) (byte) -1);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.Instant instant21 = dateTime20.toInstant();
        org.joda.time.Duration duration22 = mutablePeriod8.toDurationFrom((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime20.toMutableDateTime();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, periodType26, chronology31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', chronology31);
        org.joda.time.ReadablePartial readablePartial34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.withFields(readablePartial34);
        org.joda.time.DateTime.Property property36 = dateTime35.millisOfDay();
        org.joda.time.DateTime dateTime37 = dateTime35.withEarlierOffsetAtOverlap();
        int int38 = dateTime35.getDayOfWeek();
        boolean boolean39 = mutableDateTime23.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant21", (dateTime20.compareTo(instant21) == 0) == dateTime20.equals(instant21));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.DurationField durationField12 = chronology9.centuries();
        org.joda.time.DurationField durationField13 = chronology9.eras();
        org.joda.time.Period period14 = new org.joda.time.Period(101L, periodType1, chronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField13", Math.signum(durationField12.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField12)));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 100);
        org.joda.time.Period period3 = period1.plusDays((-1));
        org.joda.time.Period period5 = period3.withYears(48);
        int int6 = period5.getDays();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) 'a', 1970, 10, (int) '4', 1970, 887, (int) (short) 1);
        mutablePeriod15.addDays(887);
        mutablePeriod15.setDays(25);
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.Chronology chronology25 = interval23.getChronology();
        org.joda.time.Interval interval26 = interval23.toInterval();
        mutablePeriod15.setPeriod((org.joda.time.ReadableInterval) interval23);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.Instant instant29 = dateTime28.toInstant();
        org.joda.time.TimeOfDay timeOfDay30 = dateTime28.toTimeOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone32);
        int int34 = dateTime33.getMillisOfDay();
        org.joda.time.DateTime dateTime36 = dateTime33.plusMillis((int) '#');
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 1, periodType39, chronology44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) '4', chronology44);
        org.joda.time.DateTime dateTime47 = dateTime36.withChronology(chronology44);
        boolean boolean49 = dateTime47.isEqual(187200000L);
        org.joda.time.Minutes minutes50 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Interval interval51 = interval23.withEnd((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime53 = dateTime28.withYear(60);
        org.joda.time.Duration duration54 = period5.toDurationTo((org.joda.time.ReadableInstant) dateTime53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and instant29", (dateTime28.compareTo(instant29) == 0) == dateTime28.equals(instant29));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus(100L);
        org.joda.time.DateTime dateTime3 = instant2.toDateTimeISO();
        org.joda.time.Period period5 = org.joda.time.Period.days((-1));
        org.joda.time.Period period7 = period5.withHours((int) (short) 0);
        int int8 = period7.getDays();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone10);
        int int12 = dateTime11.getDayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime11.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime16 = dateTime11.minusSeconds(0);
        java.lang.Object obj19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType21 = period20.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(obj19, periodType21);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, periodType24, chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone32 = chronology29.getZone();
        org.joda.time.DateTimeField dateTimeField33 = chronology29.minuteOfHour();
        org.joda.time.Chronology chronology34 = chronology29.withUTC();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 50, (-10L), periodType21, chronology34);
        org.joda.time.DateTime dateTime36 = dateTime11.toDateTime(chronology34);
        org.joda.time.Duration duration37 = period7.toDurationTo((org.joda.time.ReadableInstant) dateTime36);
        int int38 = dateTime36.getMillisOfSecond();
        boolean boolean39 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime36);
        java.util.GregorianCalendar gregorianCalendar40 = dateTime3.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime36", (dateTime11.compareTo(dateTime36) == 0) == dateTime11.equals(dateTime36));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((java.lang.Object) dateTime15);
        org.joda.time.DateTime.Property property19 = dateTime15.dayOfYear();
        int int20 = property19.getLeapAmount();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant18", (dateTime15.compareTo(instant18) == 0) == dateTime15.equals(instant18));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        int int3 = minutes1.get(durationFieldType2);
        int int5 = minutes1.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod6 = minutes1.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType8 = minutes1.getFieldType(0);
        org.joda.time.Duration duration9 = minutes1.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone11);
        int int13 = dateTime12.getMillisOfDay();
        org.joda.time.DateTime dateTime15 = dateTime12.plusMillis((int) '#');
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, periodType18, chronology23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', chronology23);
        org.joda.time.DateTime dateTime26 = dateTime15.withChronology(chronology23);
        int int27 = dateTime26.getYearOfEra();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(periodType28);
        org.joda.time.Period period30 = duration9.toPeriodFrom((org.joda.time.ReadableInstant) dateTime26, periodType28);
        org.joda.time.Instant instant31 = dateTime26.toInstant();
        org.joda.time.DateTime.Property property32 = dateTime26.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant31", (dateTime26.compareTo(instant31) == 0) == dateTime26.equals(instant31));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean14 = mutableInterval9.isBefore((org.joda.time.ReadableInterval) mutableInterval13);
        boolean boolean15 = mutableInterval6.contains((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.DateTime dateTime17 = dateTime2.plus((org.joda.time.ReadablePeriod) weeks16);
        org.joda.time.DateTime dateTime19 = dateTime2.minusDays((int) (byte) 1);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, periodType22, chronology27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', chronology27);
        org.joda.time.ReadablePartial readablePartial30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.withFields(readablePartial30);
        org.joda.time.DateTime.Property property32 = dateTime31.millisOfDay();
        org.joda.time.DateTime dateTime34 = dateTime31.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property35 = dateTime31.era();
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime39 = dateTime31.withDurationAdded((org.joda.time.ReadableDuration) duration37, 0);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration37);
        long long41 = duration37.getMillis();
        org.joda.time.Duration duration42 = duration37.toDuration();
        org.joda.time.Period period44 = org.joda.time.Period.days((-1));
        org.joda.time.Period period46 = period44.withHours((int) (short) 0);
        int int47 = period46.getDays();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone49);
        int int51 = dateTime50.getDayOfMonth();
        org.joda.time.DateTime dateTime53 = dateTime50.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime55 = dateTime50.minusSeconds(0);
        java.lang.Object obj58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType60 = period59.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(obj58, periodType60);
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.Chronology chronology68 = interval67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 1, periodType63, chronology68);
        org.joda.time.DateTimeField dateTimeField70 = chronology68.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone71 = chronology68.getZone();
        org.joda.time.DateTimeField dateTimeField72 = chronology68.minuteOfHour();
        org.joda.time.Chronology chronology73 = chronology68.withUTC();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((long) 50, (-10L), periodType60, chronology73);
        org.joda.time.DateTime dateTime75 = dateTime50.toDateTime(chronology73);
        org.joda.time.Duration duration76 = period46.toDurationTo((org.joda.time.ReadableInstant) dateTime75);
        int int77 = dateTime75.getMillisOfSecond();
        org.joda.time.DateTime dateTime79 = dateTime75.withSecondOfMinute(23);
        org.joda.time.Period period80 = duration42.toPeriodTo((org.joda.time.ReadableInstant) dateTime79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime75", (dateTime2.compareTo(dateTime75) == 0) == dateTime2.equals(dateTime75));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Duration duration1 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withFields(readablePartial12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfDay();
        org.joda.time.DateTime dateTime15 = dateTime13.withEarlierOffsetAtOverlap();
        int int16 = dateTime13.getDayOfWeek();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, periodType18, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology23.getZone();
        org.joda.time.DateTime dateTime27 = dateTime13.withChronology(chronology23);
        org.joda.time.Interval interval28 = duration1.toIntervalTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period31 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadablePeriod) period31);
        org.joda.time.Instant instant33 = dateTime0.toInstant();
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(6216719587200001L, dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone39);
        org.joda.time.DateTime dateTime41 = dateTime40.withLaterOffsetAtOverlap();
        boolean boolean42 = dateTime37.isBefore((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime44 = dateTime37.minusDays((-7));
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadableInstant) instant33, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period56 = org.joda.time.Period.days((-1));
        org.joda.time.Period period58 = period56.withWeeks((int) 'a');
        java.lang.String str59 = period56.toString();
        mutablePeriod54.setPeriod((org.joda.time.ReadablePeriod) period56);
        org.joda.time.Period period62 = period56.withMonths(60);
        org.joda.time.Period period63 = period56.toPeriod();
        org.joda.time.Period period65 = period56.minusDays(40);
        boolean boolean66 = dateTime37.equals((java.lang.Object) period56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant33", (dateTime0.compareTo(instant33) == 0) == dateTime0.equals(instant33));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfEra();
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes10 = minutes8.dividedBy((int) 'a');
        int[] intArray13 = chronology6.get((org.joda.time.ReadablePeriod) minutes10, (-9L), (-2496683648L));
        org.joda.time.DateTimeField dateTimeField14 = chronology6.year();
        org.joda.time.DurationField durationField15 = chronology6.years();
        org.joda.time.DateTimeField dateTimeField16 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = chronology6.year();
        org.joda.time.DurationField durationField18 = chronology6.weekyears();
        org.joda.time.Period period19 = new org.joda.time.Period((long) 292278993, 1735632360000000L, chronology6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField18", (durationField15.compareTo(durationField18) == 0) == durationField15.equals(durationField18));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes2, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTime dateTime9 = instant7.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        long long16 = dateTimeZone12.convertLocalToUTC(355200035L, false, (long) (byte) 100);
        org.joda.time.DateTime dateTime17 = dateTime9.toDateTime(dateTimeZone12);
        int int18 = dateTime17.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime17", (instant7.compareTo(dateTime17) == 0) == instant7.equals(dateTime17));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.Duration duration4 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration5 = duration4.toDuration();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration4);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone8);
        java.util.Locale locale10 = null;
        java.util.Calendar calendar11 = dateTime9.toCalendar(locale10);
        org.joda.time.DateTime dateTime13 = dateTime9.minus((long) 56);
        org.joda.time.DateTime.Property property14 = dateTime9.hourOfDay();
        org.joda.time.Days days15 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime17 = dateTime2.withYearOfEra(3600052);
        org.joda.time.DateTime dateTime19 = dateTime17.plusWeeks((-196999));
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone21);
        int int23 = dateTime22.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime22.getZone();
        org.joda.time.DateTime dateTime26 = dateTime22.plusSeconds((int) ' ');
        org.joda.time.DateTime dateTime27 = dateTime22.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean29 = dateTime27.isSupported(dateTimeFieldType28);
        int int30 = dateTime17.get(dateTimeFieldType28);
        org.joda.time.Duration duration31 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 1, periodType34, chronology39);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) '4', chronology39);
        org.joda.time.ReadablePartial readablePartial42 = null;
        org.joda.time.DateTime dateTime43 = dateTime41.withFields(readablePartial42);
        org.joda.time.DateTime.Property property44 = dateTime43.millisOfDay();
        org.joda.time.DateTime dateTime45 = dateTime43.withEarlierOffsetAtOverlap();
        int int46 = dateTime43.getDayOfWeek();
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 1, periodType48, chronology53);
        org.joda.time.DateTimeField dateTimeField55 = chronology53.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone56 = chronology53.getZone();
        org.joda.time.DateTime dateTime57 = dateTime43.withChronology(chronology53);
        org.joda.time.Interval interval58 = duration31.toIntervalTo((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period61 = duration31.toPeriodFrom((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTime.Property property62 = dateTime60.era();
        org.joda.time.PeriodType periodType63 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(periodType63);
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime60, (org.joda.time.ReadablePeriod) mutablePeriod64);
        int int66 = dateTime60.getMinuteOfHour();
        int int67 = dateTime60.getDayOfMonth();
        org.joda.time.Instant instant68 = dateTime60.toInstant();
        org.joda.time.DateTime.Property property69 = dateTime60.secondOfDay();
        org.joda.time.PeriodType periodType75 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str76 = periodType75.getName();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((long) (short) -1, periodType75);
        org.joda.time.Period period78 = new org.joda.time.Period(25245561600000L, 132539513932800000L, periodType75);
        org.joda.time.Period period79 = new org.joda.time.Period((long) 53, 198919L, periodType75);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime60, periodType75);
        int int81 = mutablePeriod80.getWeeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime60 and instant68", (dateTime60.compareTo(instant68) == 0) == dateTime60.equals(instant68));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.DateTime dateTime4 = dateTime0.withZone(dateTimeZone2);
        org.joda.time.DateTime.Property property5 = dateTime0.dayOfYear();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property5.getAsText(locale6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime4", (dateTime0.compareTo(dateTime4) == 0) == dateTime0.equals(dateTime4));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        long long12 = chronology7.add(52L, 6216719238000000L, (int) (byte) -1);
        org.joda.time.DurationField durationField13 = chronology7.days();
        org.joda.time.DateTimeField dateTimeField14 = chronology7.millisOfSecond();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((-3888000000L), chronology7);
        org.joda.time.DateTime dateTime16 = dateTime15.toDateTime();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology22.getZone();
        java.lang.String str25 = dateTimeZone23.getName(100L);
        org.joda.time.DateTime dateTime26 = dateTime17.withZoneRetainFields(dateTimeZone23);
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.DateTimeZone dateTimeZone32 = chronology31.getZone();
        java.lang.String str34 = dateTimeZone32.getName(100L);
        org.joda.time.DateTime dateTime35 = dateTime26.withZoneRetainFields(dateTimeZone32);
        java.util.TimeZone timeZone36 = dateTimeZone32.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime15.toMutableDateTime(dateTimeZone32);
        org.joda.time.Instant instant38 = org.joda.time.Instant.now();
        org.joda.time.Instant instant40 = instant38.minus(100L);
        org.joda.time.DateTime dateTime41 = instant40.toDateTimeISO();
        int int42 = dateTime41.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime.Property property44 = dateTime41.property(dateTimeFieldType43);
        boolean boolean45 = mutableDateTime37.isSupported(dateTimeFieldType43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant38", (dateTime17.compareTo(instant38) == 0) == dateTime17.equals(instant38));
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 1, periodType13, chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) '4', chronology18);
        org.joda.time.ReadablePartial readablePartial21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.withFields(readablePartial21);
        boolean boolean23 = instant10.isAfter((org.joda.time.ReadableInstant) dateTime20);
        boolean boolean24 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Chronology chronology25 = dateTime9.getChronology();
        org.joda.time.DateTime dateTime28 = dateTime9.withDurationAdded((-61394288400000L), 947);
        org.joda.time.DateTime dateTime30 = dateTime28.minusWeeks(21);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = dateTime28.withZone(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = dateTime28.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone35);
        int int37 = dateTime36.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime36.getZone();
        long long40 = dateTimeZone38.convertUTCToLocal((long) 0);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours(52);
        long long44 = dateTimeZone42.convertUTCToLocal(0L);
        long long46 = dateTimeZone38.getMillisKeepLocal(dateTimeZone42, (-31L));
        org.joda.time.Period period48 = org.joda.time.Period.days((-1));
        boolean boolean49 = dateTimeZone42.equals((java.lang.Object) (-1));
        java.util.Locale locale51 = null;
        java.lang.String str52 = dateTimeZone42.getShortName(315569437200001L, locale51);
        org.joda.time.DateTime dateTime53 = dateTime28.withZone(dateTimeZone42);
        int int55 = dateTimeZone42.getOffset(29908224000021L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime53", (dateTime28.compareTo(dateTime53) == 0) == dateTime28.equals(dateTime53));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration14 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', chronology22);
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.withFields(readablePartial25);
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfDay();
        org.joda.time.DateTime dateTime28 = dateTime26.withEarlierOffsetAtOverlap();
        int int29 = dateTime26.getDayOfWeek();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, periodType31, chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology36.getZone();
        org.joda.time.DateTime dateTime40 = dateTime26.withChronology(chronology36);
        org.joda.time.Interval interval41 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Instant instant43 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration14, 48);
        org.joda.time.Duration duration44 = duration14.toDuration();
        org.joda.time.Period period45 = duration14.toPeriod();
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 1, periodType48, chronology53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) '4', chronology53);
        org.joda.time.DateTime dateTime57 = dateTime55.withCenturyOfEra(12);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) 1, periodType59, chronology64);
        org.joda.time.DateTimeField dateTimeField66 = chronology64.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone67 = chronology64.getZone();
        java.lang.String str68 = dateTimeZone67.toString();
        org.joda.time.DateTime dateTime69 = dateTime55.toDateTime(dateTimeZone67);
        org.joda.time.Interval interval70 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval75 = mutableInterval74.toInterval();
        org.joda.time.Chronology chronology76 = interval75.getChronology();
        org.joda.time.DateTimeZone dateTimeZone77 = chronology76.getZone();
        java.lang.String str79 = dateTimeZone77.getName(100L);
        org.joda.time.DateTime dateTime80 = dateTime71.withZoneRetainFields(dateTimeZone77);
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime(dateTimeZone77);
        java.lang.String str83 = dateTimeZone77.getShortName((long) 58);
        org.joda.time.DateTime dateTime84 = dateTime69.withZoneRetainFields(dateTimeZone77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime71", (instant0.compareTo(dateTime71) == 0) == instant0.equals(dateTime71));
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Chronology chronology13 = mutableInterval9.getChronology();
        org.joda.time.Duration duration14 = mutableInterval9.toDuration();
        org.joda.time.MutableInterval mutableInterval15 = mutableInterval9.copy();
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime17 = instant16.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime18 = instant16.toDateTimeISO();
        mutableInterval15.setEnd((org.joda.time.ReadableInstant) instant16);
        mutableInterval15.setDurationBeforeEnd(11000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime17", (instant16.compareTo(mutableDateTime17) == 0) == instant16.equals(mutableDateTime17));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime12.withEarlierOffsetAtOverlap();
        int int15 = dateTime12.getDayOfWeek();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology22.getZone();
        org.joda.time.DateTime dateTime26 = dateTime12.withChronology(chronology22);
        org.joda.time.Interval interval27 = duration0.toIntervalTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period30 = duration0.toPeriodFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime.Property property31 = dateTime29.era();
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(periodType32);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadablePeriod) mutablePeriod33);
        java.lang.Object obj35 = mutablePeriod33.clone();
        java.lang.Object obj36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType38 = period37.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(obj36, periodType38);
        org.joda.time.Period period40 = new org.joda.time.Period((java.lang.Object) mutablePeriod33, periodType38);
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 1, periodType44, chronology49);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) '4', chronology49);
        org.joda.time.ReadablePartial readablePartial52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.withFields(readablePartial52);
        boolean boolean54 = instant41.isAfter((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime.Property property55 = dateTime51.dayOfWeek();
        int int56 = property55.getMaximumValue();
        java.lang.String str57 = property55.getAsText();
        long long58 = property55.remainder();
        boolean boolean59 = mutablePeriod33.equals((java.lang.Object) property55);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(dateTimeZone62);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.DateTimeZone dateTimeZone70 = chronology69.getZone();
        java.lang.String str72 = dateTimeZone70.getName(100L);
        org.joda.time.DateTime dateTime73 = dateTime64.withZoneRetainFields(dateTimeZone70);
        int int74 = dateTime73.getMinuteOfDay();
        int int75 = dateTime73.getEra();
        org.joda.time.DateMidnight dateMidnight76 = dateTime73.toDateMidnight();
        mutablePeriod33.setPeriod((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime79 = dateTime73.plusDays(292279003);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant41 and dateTime63", (instant41.compareTo(dateTime63) == 0) == instant41.equals(dateTime63));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTime();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, periodType8, chronology13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', chronology13);
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, periodType19, chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', chronology24);
        org.joda.time.ReadablePartial readablePartial27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withFields(readablePartial27);
        boolean boolean29 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime26);
        boolean boolean30 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime26);
        java.lang.String str31 = dateTime15.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType32.getRangeDurationType();
        int int34 = dateTime15.get(dateTimeFieldType32);
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType32.getRangeDurationType();
        org.joda.time.DateTime dateTime37 = dateTime5.withField(dateTimeFieldType32, 1);
        org.joda.time.DateTime dateTime39 = dateTime37.plus((long) 1970);
        org.joda.time.DateTime dateTime41 = dateTime37.withSecondOfMinute(9);
        org.joda.time.DateTime dateTime43 = dateTime41.plusSeconds(49);
        org.joda.time.DateTime dateTime45 = dateTime43.plusMinutes(0);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, periodType47, chronology52);
        org.joda.time.DateTimeField dateTimeField54 = chronology52.yearOfCentury();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.Chronology chronology60 = interval59.getChronology();
        org.joda.time.DateTimeZone dateTimeZone61 = chronology60.getZone();
        java.lang.String str63 = dateTimeZone61.getName(100L);
        org.joda.time.DateTime dateTime64 = dateTime55.withZoneRetainFields(dateTimeZone61);
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.DateTimeZone dateTimeZone70 = chronology69.getZone();
        java.lang.String str72 = dateTimeZone70.getName(100L);
        org.joda.time.DateTime dateTime73 = dateTime64.withZoneRetainFields(dateTimeZone70);
        org.joda.time.Chronology chronology74 = chronology52.withZone(dateTimeZone70);
        long long78 = chronology74.add((long) 0, (long) 12, (int) '4');
        org.joda.time.DurationField durationField79 = chronology74.seconds();
        org.joda.time.DateTime dateTime80 = dateTime45.toDateTime(chronology74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime55", (instant16.compareTo(dateTime55) == 0) == instant16.equals(dateTime55));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Duration duration14 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '4', chronology22);
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.withFields(readablePartial25);
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfDay();
        org.joda.time.DateTime dateTime28 = dateTime26.withEarlierOffsetAtOverlap();
        int int29 = dateTime26.getDayOfWeek();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, periodType31, chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology36.getZone();
        org.joda.time.DateTime dateTime40 = dateTime26.withChronology(chronology36);
        org.joda.time.Interval interval41 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Instant instant43 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration14, 48);
        long long44 = instant0.getMillis();
        org.joda.time.Chronology chronology45 = instant0.getChronology();
        org.joda.time.Instant instant47 = instant0.plus((long) (-196999));
        org.joda.time.Instant instant49 = instant47.minus((-6L));
        org.joda.time.DateTime dateTime50 = instant47.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime51 = instant47.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant47 and dateTime50", (instant47.compareTo(dateTime50) == 0) == instant47.equals(dateTime50));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime13 = dateTime11.withEarlierOffsetAtOverlap();
        int int14 = dateTime11.getDayOfWeek();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType16, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology21.getZone();
        org.joda.time.DateTime dateTime25 = dateTime11.withChronology(chronology21);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 1, periodType28, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) '4', chronology33);
        org.joda.time.Instant instant36 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 1, periodType39, chronology44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) '4', chronology44);
        org.joda.time.ReadablePartial readablePartial47 = null;
        org.joda.time.DateTime dateTime48 = dateTime46.withFields(readablePartial47);
        boolean boolean49 = instant36.isAfter((org.joda.time.ReadableInstant) dateTime46);
        boolean boolean50 = dateTime35.isAfter((org.joda.time.ReadableInstant) dateTime46);
        java.lang.String str51 = dateTime35.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType53 = dateTimeFieldType52.getRangeDurationType();
        int int54 = dateTime35.get(dateTimeFieldType52);
        boolean boolean55 = dateTime35.isBeforeNow();
        org.joda.time.DateTime dateTime56 = dateTime35.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight57 = dateTime56.toDateMidnight();
        boolean boolean58 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime dateTime60 = dateTime56.plusMinutes(23);
        org.joda.time.DateTime dateTime62 = dateTime60.minusWeeks((-324000000));
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Instant instant65 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology66 = instant65.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.yearOfEra();
        org.joda.time.Period period68 = new org.joda.time.Period((java.lang.Object) "P-1DT100H3600.010S", periodType64, chronology66);
        org.joda.time.DurationField durationField69 = chronology66.months();
        org.joda.time.DateTimeField dateTimeField70 = chronology66.dayOfWeek();
        org.joda.time.DateTime dateTime71 = dateTime60.toDateTime(chronology66);
        org.joda.time.DateTimeZone dateTimeZone72 = dateTime60.getZone();
        java.lang.String str73 = dateTimeZone72.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime60 and dateTime71", (dateTime60.compareTo(dateTime71) == 0) == dateTime60.equals(dateTime71));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.Instant instant2 = instant0.toInstant();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(6216719587200001L, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone8);
        int int10 = dateTime9.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime9.getZone();
        int int12 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime15 = dateTime9.withField(dateTimeFieldType13, 1);
        boolean boolean16 = instant0.isSupported(dateTimeFieldType13);
        org.joda.time.Instant instant19 = instant0.withDurationAdded((-162000000L), 7);
        org.joda.time.MutableDateTime mutableDateTime20 = instant19.toMutableDateTime();
        org.joda.time.DateTime dateTime21 = instant19.toDateTime();
        int int22 = dateTime21.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and mutableDateTime20", (instant19.compareTo(mutableDateTime20) == 0) == instant19.equals(mutableDateTime20));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        mutablePeriod8.addMonths((int) (short) -1);
        org.joda.time.Period period18 = org.joda.time.Period.days((-1));
        org.joda.time.Period period20 = period18.withWeeks((int) 'a');
        org.joda.time.Period period22 = period18.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = period22.isSupported(durationFieldType23);
        mutablePeriod8.add((org.joda.time.ReadablePeriod) period22);
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean36 = mutableInterval31.isBefore((org.joda.time.ReadableInterval) mutableInterval35);
        boolean boolean37 = mutableInterval28.contains((org.joda.time.ReadableInterval) mutableInterval35);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        long long43 = interval41.toDurationMillis();
        org.joda.time.Interval interval45 = interval41.withEndMillis((long) (short) 100);
        mutableInterval35.setInterval((org.joda.time.ReadableInterval) interval41);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        long long52 = interval50.toDurationMillis();
        boolean boolean53 = interval41.isAfter((org.joda.time.ReadableInterval) interval50);
        org.joda.time.Interval interval55 = interval41.withEndMillis(100L);
        boolean boolean56 = interval41.containsNow();
        mutablePeriod8.setPeriod((org.joda.time.ReadableInterval) interval41);
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.Chronology chronology62 = interval61.getChronology();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(chronology62);
        int int64 = dateTime63.getSecondOfMinute();
        org.joda.time.DateTime dateTime66 = dateTime63.withWeekyear(3);
        boolean boolean68 = dateTime66.isAfter(9223372036505575807L);
        boolean boolean69 = interval41.contains((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime.Property property70 = dateTime66.millisOfSecond();
        org.joda.time.Instant instant71 = new org.joda.time.Instant((java.lang.Object) dateTime66);
        org.joda.time.DateTime.Property property72 = dateTime66.monthOfYear();
        java.lang.String str73 = property72.getAsShortText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime66 and instant71", (dateTime66.compareTo(instant71) == 0) == dateTime66.equals(instant71));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime12.withEarlierOffsetAtOverlap();
        int int15 = dateTime12.getDayOfWeek();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology22.getZone();
        org.joda.time.DateTime dateTime26 = dateTime12.withChronology(chronology22);
        org.joda.time.Interval interval27 = duration0.toIntervalTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period30 = duration0.toPeriodFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Minutes minutes31 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes33 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType34 = null;
        int int35 = minutes33.get(durationFieldType34);
        org.joda.time.DurationFieldType durationFieldType36 = minutes33.getFieldType();
        boolean boolean37 = minutes31.isGreaterThan(minutes33);
        org.joda.time.Instant instant38 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes33, (org.joda.time.ReadableInstant) instant38);
        org.joda.time.DateTime dateTime40 = instant38.toDateTimeISO();
        boolean boolean41 = duration0.equals((java.lang.Object) dateTime40);
        org.joda.time.Instant instant42 = dateTime40.toInstant();
        org.joda.time.DateTime.Property property43 = dateTime40.dayOfWeek();
        java.util.Locale locale44 = null;
        java.lang.String str45 = property43.getAsShortText(locale44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant38 and dateTime40", (instant38.compareTo(dateTime40) == 0) == instant38.equals(dateTime40));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.dayOfMonth();
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', chronology16);
        org.joda.time.ReadablePartial readablePartial19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.withFields(readablePartial19);
        boolean boolean21 = instant8.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Period period23 = org.joda.time.Period.days((-1));
        org.joda.time.Period period25 = period23.withWeeks((int) 'a');
        org.joda.time.Period period27 = period23.plusMonths((int) (short) -1);
        org.joda.time.Period period29 = period23.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime30 = dateTime18.plus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.LocalDateTime localDateTime31 = dateTime18.toLocalDateTime();
        org.joda.time.Minutes minutes32 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes33 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes35 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType36 = null;
        int int37 = minutes35.get(durationFieldType36);
        org.joda.time.DurationFieldType durationFieldType38 = minutes35.getFieldType();
        boolean boolean39 = minutes33.isGreaterThan(minutes35);
        org.joda.time.Instant instant40 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes35, (org.joda.time.ReadableInstant) instant40);
        org.joda.time.Minutes minutes43 = minutes35.dividedBy((int) (short) 10);
        boolean boolean44 = minutes32.isGreaterThan(minutes35);
        org.joda.time.Minutes minutes46 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.Minutes minutes47 = minutes46.negated();
        java.lang.String str48 = minutes46.toString();
        org.joda.time.Minutes minutes49 = minutes35.minus(minutes46);
        boolean boolean50 = localDateTime31.equals((java.lang.Object) minutes49);
        int int51 = dateTimeField7.getMaximumValue((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(chronology56);
        org.joda.time.LocalDateTime localDateTime58 = dateTime57.toLocalDateTime();
        org.joda.time.Period period59 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDateTime31, (org.joda.time.ReadablePartial) localDateTime58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime57", (instant8.compareTo(dateTime57) == 0) == instant8.equals(dateTime57));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.Period period5 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Period period8 = period5.withFieldAdded(durationFieldType6, (int) (byte) 100);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfEra();
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) "P-1DT100H3600.010S", periodType10, chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.secondOfDay();
        org.joda.time.DurationField durationField16 = durationFieldType6.getField(chronology12);
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType2.getField(chronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant11", (dateTime1.compareTo(instant11) == 0) == dateTime1.equals(instant11));
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) (short) -1);
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded((long) 100, (int) (short) 100);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        int int20 = dateTime19.getSecondOfMinute();
        org.joda.time.DateTime dateTime22 = dateTime19.withWeekyear(3);
        boolean boolean23 = dateTime12.isBefore((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateMidnight dateMidnight24 = dateTime12.toDateMidnight();
        org.joda.time.Instant instant25 = dateTime12.toInstant();
        org.joda.time.Instant instant27 = instant25.minus((long) 94);
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.Interval interval33 = interval31.toInterval();
        org.joda.time.Duration duration35 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval36 = interval33.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration35);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 1, periodType39, chronology44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) '4', chronology44);
        org.joda.time.ReadablePartial readablePartial47 = null;
        org.joda.time.DateTime dateTime48 = dateTime46.withFields(readablePartial47);
        org.joda.time.DateTime.Property property49 = dateTime48.millisOfDay();
        org.joda.time.DateTime dateTime51 = dateTime48.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property52 = dateTime48.era();
        org.joda.time.Duration duration54 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime56 = dateTime48.withDurationAdded((org.joda.time.ReadableDuration) duration54, 0);
        long long57 = duration54.getStandardHours();
        org.joda.time.Duration duration58 = duration35.plus((org.joda.time.ReadableDuration) duration54);
        long long59 = duration35.getStandardDays();
        org.joda.time.Days days60 = duration35.toStandardDays();
        org.joda.time.Instant instant61 = instant25.plus((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Duration duration62 = duration35.toDuration();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant25", (dateTime12.compareTo(instant25) == 0) == dateTime12.equals(instant25));
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        int int12 = dateTime11.getMinuteOfHour();
        org.joda.time.DateTime.Property property13 = dateTime11.minuteOfHour();
        int int14 = property13.getMinimumValue();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        int int21 = dateTime20.getSecondOfMinute();
        java.lang.String str23 = dateTime20.toString("+00:00");
        int int24 = dateTime20.getEra();
        int int25 = dateTime20.getCenturyOfEra();
        org.joda.time.DateTime dateTime27 = dateTime20.minus(0L);
        org.joda.time.DateTime dateTime30 = dateTime20.withDurationAdded((long) (-613704), 22);
        int int31 = property13.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 1, periodType34, chronology39);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) '4', chronology39);
        org.joda.time.ReadablePartial readablePartial42 = null;
        org.joda.time.DateTime dateTime43 = dateTime41.withFields(readablePartial42);
        org.joda.time.DateTime.Property property44 = dateTime43.millisOfDay();
        org.joda.time.DateTime dateTime46 = dateTime43.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property47 = dateTime43.era();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime();
        org.joda.time.Instant instant49 = dateTime48.toInstant();
        org.joda.time.Minutes minutes50 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) instant49);
        org.joda.time.Instant instant52 = instant49.minus((long) 349200000);
        org.joda.time.DateTime dateTime53 = instant49.toDateTimeISO();
        long long54 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant49", (dateTime20.compareTo(instant49) == 0) == dateTime20.equals(instant49));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime5 = dateTime2.plusMillis((int) '#');
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, periodType8, chronology13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', chronology13);
        org.joda.time.DateTime dateTime16 = dateTime5.withChronology(chronology13);
        int int17 = dateTime16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateTime16.getChronology();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.Instant instant20 = dateTime19.toInstant();
        org.joda.time.DateTime.Property property21 = dateTime19.minuteOfDay();
        org.joda.time.DateTime dateTime23 = dateTime19.minusWeeks(19);
        org.joda.time.Seconds seconds24 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime19);
        int int25 = dateTime19.getEra();
        org.joda.time.Instant instant26 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', chronology34);
        org.joda.time.ReadablePartial readablePartial37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withFields(readablePartial37);
        boolean boolean39 = instant26.isAfter((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime.Property property40 = dateTime36.dayOfWeek();
        org.joda.time.DateTime dateTime41 = property40.withMaximumValue();
        org.joda.time.DateTime dateTime43 = dateTime41.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant44 = new org.joda.time.Instant((java.lang.Object) dateTime41);
        org.joda.time.DateTime dateTime45 = instant44.toDateTime();
        boolean boolean46 = dateTime19.isBefore((org.joda.time.ReadableInstant) dateTime45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and instant44", (dateTime41.compareTo(instant44) == 0) == dateTime41.equals(instant44));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded((long) 52, (int) (short) 1);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfCentury(1);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period25 = org.joda.time.Period.days((-1));
        org.joda.time.Period period27 = period25.withWeeks((int) 'a');
        java.lang.String str28 = period25.toString();
        mutablePeriod23.setPeriod((org.joda.time.ReadablePeriod) period25);
        int int30 = mutablePeriod23.getYears();
        mutablePeriod23.addSeconds((int) (short) 1);
        mutablePeriod23.setSeconds(2);
        org.joda.time.Duration duration36 = new org.joda.time.Duration((long) 19);
        mutablePeriod23.setPeriod((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) 1);
        org.joda.time.Instant instant41 = instant39.plus(315569520000001L);
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration36, (org.joda.time.ReadableInstant) instant41);
        org.joda.time.Weeks weeks43 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) instant41);
        org.joda.time.DateTime dateTime44 = instant41.toDateTimeISO();
        org.joda.time.DateTime dateTime45 = dateTime44.toDateTime();
        org.joda.time.TimeOfDay timeOfDay46 = dateTime44.toTimeOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant41 and dateTime44", (instant41.compareTo(dateTime44) == 0) == instant41.equals(dateTime44));
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone3);
        int int5 = dateTime4.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean16 = mutableInterval11.isBefore((org.joda.time.ReadableInterval) mutableInterval15);
        boolean boolean17 = mutableInterval8.contains((org.joda.time.ReadableInterval) mutableInterval15);
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval15);
        org.joda.time.DateTime dateTime19 = dateTime4.plus((org.joda.time.ReadablePeriod) weeks18);
        org.joda.time.DateTime dateTime21 = dateTime4.minusDays((int) (byte) 1);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, periodType24, chronology29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) '4', chronology29);
        org.joda.time.ReadablePartial readablePartial32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.withFields(readablePartial32);
        org.joda.time.DateTime.Property property34 = dateTime33.millisOfDay();
        org.joda.time.DateTime dateTime36 = dateTime33.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property37 = dateTime33.era();
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime41 = dateTime33.withDurationAdded((org.joda.time.ReadableDuration) duration39, 0);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration39);
        org.joda.time.Duration duration43 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 1, periodType46, chronology51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) '4', chronology51);
        org.joda.time.ReadablePartial readablePartial54 = null;
        org.joda.time.DateTime dateTime55 = dateTime53.withFields(readablePartial54);
        org.joda.time.DateTime.Property property56 = dateTime55.millisOfDay();
        org.joda.time.DateTime dateTime57 = dateTime55.withEarlierOffsetAtOverlap();
        int int58 = dateTime55.getDayOfWeek();
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval64 = mutableInterval63.toInterval();
        org.joda.time.Chronology chronology65 = interval64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) 1, periodType60, chronology65);
        org.joda.time.DateTimeField dateTimeField67 = chronology65.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone68 = chronology65.getZone();
        org.joda.time.DateTime dateTime69 = dateTime55.withChronology(chronology65);
        org.joda.time.Interval interval70 = duration43.toIntervalTo((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval74 = mutableInterval73.toInterval();
        org.joda.time.Chronology chronology75 = interval74.getChronology();
        org.joda.time.DateTimeField dateTimeField76 = chronology75.yearOfEra();
        mutablePeriod42.setPeriod((org.joda.time.ReadableDuration) duration43, chronology75);
        org.joda.time.MutableDateTime mutableDateTime78 = dateTime0.toMutableDateTime(chronology75);
        org.joda.time.DateTime dateTime79 = org.joda.time.DateTime.now(chronology75);
        org.joda.time.DateTime dateTime81 = dateTime79.minusWeeks(55);
        org.joda.time.DateTime dateTime83 = dateTime79.plusMonths(349);
        org.joda.time.Instant instant84 = new org.joda.time.Instant((java.lang.Object) dateTime79);
        int int85 = dateTime79.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant84", (dateTime0.compareTo(instant84) == 0) == dateTime0.equals(instant84));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(6216719587200001L, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime6.withLaterOffsetAtOverlap();
        boolean boolean8 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((-124334351997544L));
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int12 = dateTime10.get(dateTimeFieldType11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 1, periodType15, chronology20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', chronology20);
        org.joda.time.ReadablePartial readablePartial23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.withFields(readablePartial23);
        org.joda.time.DateTime.Property property25 = dateTime24.millisOfDay();
        int int26 = property25.getMinimumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        boolean boolean28 = dateTime10.isSupported(dateTimeFieldType27);
        int int29 = dateTime3.get(dateTimeFieldType27);
        org.joda.time.Instant instant30 = dateTime3.toInstant();
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean41 = mutableInterval36.isBefore((org.joda.time.ReadableInterval) mutableInterval40);
        boolean boolean42 = mutableInterval33.contains((org.joda.time.ReadableInterval) mutableInterval40);
        org.joda.time.Period period43 = mutableInterval33.toPeriod();
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean51 = mutableInterval46.isBefore((org.joda.time.ReadableInterval) mutableInterval50);
        boolean boolean52 = mutableInterval33.overlaps((org.joda.time.ReadableInterval) mutableInterval46);
        org.joda.time.Minutes minutes53 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) mutableInterval33);
        org.joda.time.Duration duration54 = minutes53.toStandardDuration();
        org.joda.time.Instant instant55 = instant30.minus((org.joda.time.ReadableDuration) duration54);
        org.joda.time.MutableDateTime mutableDateTime56 = instant55.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant55", (dateTime3.compareTo(instant55) == 0) == dateTime3.equals(instant55));
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property15 = dateTime11.era();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Instant instant17 = dateTime16.toInstant();
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) instant17);
        org.joda.time.MutableDateTime mutableDateTime19 = instant17.toMutableDateTimeISO();
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(6216719587200001L, dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone25);
        int int27 = dateTime26.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime26.getZone();
        int int29 = dateTime23.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime31 = dateTime26.withMillis((long) (short) 10);
        org.joda.time.DateTime dateTime33 = dateTime26.withMillisOfDay(53);
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.Duration duration39 = interval37.toDuration();
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str41 = periodType40.getName();
        org.joda.time.PeriodType periodType42 = periodType40.withSecondsRemoved();
        org.joda.time.Period period44 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType45 = period44.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) (-90), periodType45);
        org.joda.time.Period period47 = mutablePeriod46.toPeriod();
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.hours();
        boolean boolean49 = period47.isSupported(durationFieldType48);
        boolean boolean50 = periodType42.isSupported(durationFieldType48);
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) 1, periodType53, chronology58);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) '4', chronology58);
        org.joda.time.DurationField durationField61 = chronology58.centuries();
        org.joda.time.DurationField durationField62 = chronology58.weekyears();
        org.joda.time.Period period63 = duration39.toPeriod(periodType42, chronology58);
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableDuration) duration39);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant17, (org.joda.time.ReadableDuration) duration39);
        mutablePeriod65.clear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant17", (dateTime16.compareTo(instant17) == 0) == dateTime16.equals(instant17));
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone16);
        int int18 = dateTime17.getDayOfMonth();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 1, periodType20, chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology25.getZone();
        org.joda.time.DateTime dateTime29 = dateTime17.withZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = dateTime10.withZone(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.toDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMonths(3600052);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone36);
        int int38 = dateTime37.getSecondOfMinute();
        org.joda.time.DateTime dateTime40 = dateTime37.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime42 = dateTime40.minus(349200757L);
        org.joda.time.Duration duration43 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Duration duration45 = org.joda.time.Duration.millis((long) 5);
        org.joda.time.Duration duration46 = duration45.toDuration();
        boolean boolean47 = duration43.isLongerThan((org.joda.time.ReadableDuration) duration46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.DateTimeZone dateTimeZone54 = chronology53.getZone();
        java.lang.String str56 = dateTimeZone54.getName(100L);
        org.joda.time.DateTime dateTime57 = dateTime48.withZoneRetainFields(dateTimeZone54);
        int int58 = dateTime57.getMinuteOfDay();
        int int59 = dateTime57.getEra();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone61);
        int int63 = dateTime62.getDayOfMonth();
        org.joda.time.DateTime dateTime65 = dateTime62.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property66 = dateTime65.dayOfYear();
        org.joda.time.DateTime dateTime67 = property66.roundHalfFloorCopy();
        java.util.Locale locale68 = null;
        int int69 = property66.getMaximumTextLength(locale68);
        org.joda.time.DateTime dateTime70 = property66.roundCeilingCopy();
        org.joda.time.Seconds seconds71 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime.Property property72 = dateTime70.dayOfYear();
        org.joda.time.DateTime dateTime73 = property72.roundCeilingCopy();
        org.joda.time.Period period74 = duration43.toPeriodTo((org.joda.time.ReadableInstant) dateTime73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime48", (instant0.compareTo(dateTime48) == 0) == instant0.equals(dateTime48));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillisOfDay(0);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusDays((int) (byte) -1);
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType16, chronology21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '4', chronology21);
        org.joda.time.ReadablePartial readablePartial24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.withFields(readablePartial24);
        boolean boolean26 = instant13.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime.Property property27 = dateTime23.dayOfWeek();
        org.joda.time.DateTime dateTime28 = property27.withMaximumValue();
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime31 = dateTime30.toLocalDateTime();
        org.joda.time.DateTime dateTime32 = dateTime9.withFields((org.joda.time.ReadablePartial) localDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant13", (dateTime5.compareTo(instant13) == 0) == dateTime5.equals(instant13));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((java.lang.Object) dateTime15);
        org.joda.time.Hours hours19 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours20 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours21 = hours19.minus(hours20);
        org.joda.time.Duration duration22 = hours20.toStandardDuration();
        org.joda.time.Duration duration23 = duration22.toDuration();
        long long24 = duration23.getStandardSeconds();
        org.joda.time.Instant instant25 = instant18.plus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.DateTime dateTime26 = instant18.toDateTimeISO();
        org.joda.time.Chronology chronology27 = instant18.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant18", (dateTime15.compareTo(instant18) == 0) == dateTime15.equals(instant18));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(852);
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = minutes4.get(durationFieldType5);
        org.joda.time.DurationFieldType durationFieldType7 = minutes4.getFieldType();
        boolean boolean8 = minutes2.isGreaterThan(minutes4);
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes4, (org.joda.time.ReadableInstant) instant9);
        org.joda.time.DateTime dateTime11 = instant9.toDateTimeISO();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period1, (org.joda.time.ReadableInstant) instant9);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology21.getZone();
        java.lang.String str24 = dateTimeZone22.getName(100L);
        org.joda.time.DateTime dateTime25 = dateTime16.withZoneRetainFields(dateTimeZone22);
        long long27 = dateTimeZone15.getMillisKeepLocal(dateTimeZone22, 6000035L);
        java.lang.String str29 = dateTimeZone22.getNameKey(315569437200001L);
        org.joda.time.MutableDateTime mutableDateTime30 = instant9.toMutableDateTime(dateTimeZone22);
        org.joda.time.Duration duration31 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 1, periodType34, chronology39);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) '4', chronology39);
        org.joda.time.ReadablePartial readablePartial42 = null;
        org.joda.time.DateTime dateTime43 = dateTime41.withFields(readablePartial42);
        org.joda.time.DateTime.Property property44 = dateTime43.millisOfDay();
        org.joda.time.DateTime dateTime45 = dateTime43.withEarlierOffsetAtOverlap();
        int int46 = dateTime43.getDayOfWeek();
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 1, periodType48, chronology53);
        org.joda.time.DateTimeField dateTimeField55 = chronology53.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone56 = chronology53.getZone();
        org.joda.time.DateTime dateTime57 = dateTime43.withChronology(chronology53);
        org.joda.time.Interval interval58 = duration31.toIntervalTo((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period61 = duration31.toPeriodFrom((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Duration duration63 = duration31.withMillis(100L);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Period period65 = duration63.toPeriodTo(readableInstant64);
        org.joda.time.Duration duration66 = duration63.toDuration();
        org.joda.time.Duration duration67 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration68 = duration67.toDuration();
        org.joda.time.Duration duration69 = duration67.toDuration();
        boolean boolean70 = duration63.isShorterThan((org.joda.time.ReadableDuration) duration67);
        org.joda.time.Instant instant71 = instant9.plus((org.joda.time.ReadableDuration) duration67);
        org.joda.time.Minutes minutes72 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes74 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType75 = null;
        int int76 = minutes74.get(durationFieldType75);
        int int78 = minutes74.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod79 = minutes74.toMutablePeriod();
        boolean boolean80 = minutes72.isLessThan(minutes74);
        org.joda.time.Minutes minutes81 = minutes72.negated();
        org.joda.time.Duration duration82 = minutes81.toStandardDuration();
        org.joda.time.Duration duration83 = duration82.toDuration();
        org.joda.time.Instant instant84 = instant9.minus((org.joda.time.ReadableDuration) duration82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant9", (dateTime11.compareTo(instant9) == 0) == dateTime11.equals(instant9));
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime5 = dateTime2.plusMillis((int) '#');
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, periodType8, chronology13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', chronology13);
        org.joda.time.DateTime dateTime16 = dateTime5.withChronology(chronology13);
        int int17 = dateTime16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateTime16.getChronology();
        org.joda.time.DateTime dateTime20 = dateTime16.minusWeeks(55);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, periodType24, chronology29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) '4', chronology29);
        org.joda.time.ReadablePartial readablePartial32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.withFields(readablePartial32);
        boolean boolean34 = instant21.isAfter((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime.Property property35 = dateTime31.dayOfWeek();
        org.joda.time.DateTime dateTime36 = property35.withMaximumValue();
        boolean boolean37 = dateTime16.isAfter((org.joda.time.ReadableInstant) dateTime36);
        int int38 = dateTime16.getYearOfCentury();
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 1, periodType41, chronology46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) '4', chronology46);
        org.joda.time.ReadablePartial readablePartial49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.withFields(readablePartial49);
        boolean boolean51 = dateTime16.isAfter((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Instant instant52 = dateTime16.toInstant();
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.Chronology chronology60 = interval59.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 1, periodType55, chronology60);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) '4', chronology60);
        org.joda.time.ReadablePartial readablePartial63 = null;
        org.joda.time.DateTime dateTime64 = dateTime62.withFields(readablePartial63);
        org.joda.time.DateTime.Property property65 = dateTime64.millisOfDay();
        org.joda.time.DateTime dateTime66 = dateTime64.withEarlierOffsetAtOverlap();
        int int67 = dateTime64.getDayOfWeek();
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval73 = mutableInterval72.toInterval();
        org.joda.time.Chronology chronology74 = interval73.getChronology();
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((long) 1, periodType69, chronology74);
        org.joda.time.DateTimeField dateTimeField76 = chronology74.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone77 = chronology74.getZone();
        org.joda.time.DateTime dateTime78 = dateTime64.withChronology(chronology74);
        org.joda.time.DateTime.Property property79 = dateTime78.weekyear();
        org.joda.time.DateTime dateTime80 = dateTime78.toDateTime();
        org.joda.time.Minutes minutes82 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType83 = null;
        int int84 = minutes82.get(durationFieldType83);
        int int86 = minutes82.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod87 = minutes82.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType89 = minutes82.getFieldType(0);
        org.joda.time.DateTime dateTime91 = dateTime80.withFieldAdded(durationFieldType89, (-1870));
        org.joda.time.DateTime dateTime93 = dateTime80.minusHours((-196999));
        org.joda.time.DateTime.Property property94 = dateTime80.minuteOfHour();
        org.joda.time.DateTime dateTime96 = property94.addWrapFieldToCopy(949);
        boolean boolean97 = dateTime16.isAfter((org.joda.time.ReadableInstant) dateTime96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant52", (dateTime16.compareTo(instant52) == 0) == dateTime16.equals(instant52));
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded((long) 52, (int) (short) 1);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfCentury(1);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period25 = org.joda.time.Period.days((-1));
        org.joda.time.Period period27 = period25.withWeeks((int) 'a');
        java.lang.String str28 = period25.toString();
        mutablePeriod23.setPeriod((org.joda.time.ReadablePeriod) period25);
        int int30 = mutablePeriod23.getYears();
        mutablePeriod23.addSeconds((int) (short) 1);
        mutablePeriod23.setSeconds(2);
        org.joda.time.Duration duration36 = new org.joda.time.Duration((long) 19);
        mutablePeriod23.setPeriod((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((long) 1);
        org.joda.time.Instant instant41 = instant39.plus(315569520000001L);
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration36, (org.joda.time.ReadableInstant) instant41);
        org.joda.time.Weeks weeks43 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) instant41);
        org.joda.time.DateTime dateTime45 = dateTime12.withYear((-1870));
        org.joda.time.DateTime dateTime47 = dateTime12.withMonthOfYear(4);
        org.joda.time.DateTime dateTime49 = dateTime47.plusHours(3600001);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.Instant instant51 = dateTime50.toInstant();
        org.joda.time.DateTime.Property property52 = dateTime50.minuteOfDay();
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 1, periodType54, chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology59.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone62 = chronology59.getZone();
        java.lang.String str63 = dateTimeZone62.toString();
        org.joda.time.DateTime dateTime64 = dateTime50.toDateTime(dateTimeZone62);
        org.joda.time.DateTime dateTime65 = dateTime49.withZone(dateTimeZone62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant51", (dateTime0.compareTo(instant51) == 0) == dateTime0.equals(instant51));
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.plus(readableDuration6);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', chronology16);
        org.joda.time.ReadablePartial readablePartial19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.withFields(readablePartial19);
        boolean boolean21 = instant8.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Period period23 = org.joda.time.Period.days((-1));
        org.joda.time.Period period25 = period23.withWeeks((int) 'a');
        org.joda.time.Period period27 = period23.plusMonths((int) (short) -1);
        org.joda.time.Period period29 = period23.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime30 = dateTime18.plus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Instant instant31 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 1, periodType34, chronology39);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) '4', chronology39);
        org.joda.time.ReadablePartial readablePartial42 = null;
        org.joda.time.DateTime dateTime43 = dateTime41.withFields(readablePartial42);
        boolean boolean44 = instant31.isAfter((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Duration duration45 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 1, periodType48, chronology53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) '4', chronology53);
        org.joda.time.ReadablePartial readablePartial56 = null;
        org.joda.time.DateTime dateTime57 = dateTime55.withFields(readablePartial56);
        org.joda.time.DateTime.Property property58 = dateTime57.millisOfDay();
        org.joda.time.DateTime dateTime59 = dateTime57.withEarlierOffsetAtOverlap();
        int int60 = dateTime57.getDayOfWeek();
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        org.joda.time.Chronology chronology67 = interval66.getChronology();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) 1, periodType62, chronology67);
        org.joda.time.DateTimeField dateTimeField69 = chronology67.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone70 = chronology67.getZone();
        org.joda.time.DateTime dateTime71 = dateTime57.withChronology(chronology67);
        org.joda.time.Interval interval72 = duration45.toIntervalTo((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.Instant instant74 = instant31.withDurationAdded((org.joda.time.ReadableDuration) duration45, 48);
        org.joda.time.Duration duration75 = duration45.toDuration();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableDuration) duration45);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone78);
        java.util.Locale locale80 = null;
        java.util.Calendar calendar81 = dateTime79.toCalendar(locale80);
        org.joda.time.DateTime dateTime82 = dateTime79.toDateTime();
        boolean boolean83 = dateTime79.isAfterNow();
        org.joda.time.Interval interval84 = duration45.toIntervalTo((org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.Duration duration87 = new org.joda.time.Duration((long) (short) 100, (long) 52);
        org.joda.time.Minutes minutes88 = duration87.toStandardMinutes();
        org.joda.time.Duration duration89 = duration45.minus((org.joda.time.ReadableDuration) duration87);
        org.joda.time.DateTime dateTime91 = dateTime7.withDurationAdded((org.joda.time.ReadableDuration) duration87, 349200000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant8", (dateTime7.compareTo(instant8) == 0) == dateTime7.equals(instant8));
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfEra();
        long long9 = chronology4.add(6000035L, 1L, (int) (byte) 100);
        org.joda.time.DurationField durationField10 = chronology4.centuries();
        org.joda.time.DurationField durationField11 = chronology4.eras();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(chronology4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField11", Math.signum(durationField10.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField10)));
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Instant instant3 = instant1.plus(157784803200024L);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.Instant instant7 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration5, (int) '4');
        org.joda.time.Minutes minutes8 = duration5.toStandardMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Period period15 = org.joda.time.Period.days((-1));
        org.joda.time.Period period17 = period15.withWeeks((int) 'a');
        org.joda.time.Period period19 = period15.plusMonths((int) (short) -1);
        org.joda.time.Period period21 = period15.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime22 = dateTime10.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Instant instant23 = dateTime22.toInstant();
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTimeISO();
        int int25 = dateTime24.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant23", (dateTime24.compareTo(instant23) == 0) == dateTime24.equals(instant23));
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.Chronology chronology11 = interval10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 1, periodType6, chronology11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', chronology11);
        org.joda.time.ReadablePartial readablePartial14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.withFields(readablePartial14);
        boolean boolean16 = instant3.isAfter((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime.Property property17 = dateTime13.dayOfWeek();
        boolean boolean18 = dateTimeZone2.equals((java.lang.Object) dateTime13);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime21 = dateTime19.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime19", (instant3.compareTo(dateTime19) == 0) == instant3.equals(dateTime19));
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime12.withEarlierOffsetAtOverlap();
        int int15 = dateTime12.getDayOfWeek();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology22.getZone();
        org.joda.time.DateTime dateTime26 = dateTime12.withChronology(chronology22);
        org.joda.time.Interval interval27 = duration0.toIntervalTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period30 = duration0.toPeriodFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Minutes minutes31 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes33 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType34 = null;
        int int35 = minutes33.get(durationFieldType34);
        org.joda.time.DurationFieldType durationFieldType36 = minutes33.getFieldType();
        boolean boolean37 = minutes31.isGreaterThan(minutes33);
        org.joda.time.Instant instant38 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes33, (org.joda.time.ReadableInstant) instant38);
        org.joda.time.DateTime dateTime40 = instant38.toDateTimeISO();
        boolean boolean41 = duration0.equals((java.lang.Object) dateTime40);
        org.joda.time.Instant instant42 = dateTime40.toInstant();
        org.joda.time.MutableDateTime mutableDateTime43 = instant42.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant38 and dateTime40", (instant38.compareTo(dateTime40) == 0) == instant38.equals(dateTime40));
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getSecondOfMinute();
        int int4 = dateTime2.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone6);
        int int8 = dateTime7.getMillisOfDay();
        org.joda.time.DateTime dateTime10 = dateTime7.plusMillis((int) '#');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 1, periodType13, chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) '4', chronology18);
        org.joda.time.DateTime dateTime21 = dateTime10.withChronology(chronology18);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime2.toMutableDateTime(chronology18);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, periodType26, chronology31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', chronology31);
        org.joda.time.ReadablePartial readablePartial34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.withFields(readablePartial34);
        boolean boolean36 = instant23.isAfter((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property37 = dateTime33.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone39);
        int int41 = dateTime40.getDayOfMonth();
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 1, periodType43, chronology48);
        org.joda.time.DateTimeField dateTimeField50 = chronology48.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology48.getZone();
        org.joda.time.DateTime dateTime52 = dateTime40.withZoneRetainFields(dateTimeZone51);
        org.joda.time.DateTime dateTime53 = dateTime33.withZone(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = dateTime53.toDateTime(dateTimeZone54);
        java.lang.String str56 = dateTime53.toString();
        org.joda.time.DateTime dateTime57 = dateTime53.toDateTimeISO();
        org.joda.time.DateTime dateTime59 = dateTime53.minusWeeks((-90));
        boolean boolean60 = mutableDateTime22.isEqual((org.joda.time.ReadableInstant) dateTime59);
        int int61 = mutableDateTime22.getDayOfWeek();
        org.joda.time.Instant instant62 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime mutableDateTime63 = mutableDateTime22.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant62", (dateTime2.compareTo(instant62) == 0) == dateTime2.equals(instant62));
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.Chronology chronology11 = interval10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 1, periodType6, chronology11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', chronology11);
        org.joda.time.ReadablePartial readablePartial14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.withFields(readablePartial14);
        boolean boolean16 = instant3.isAfter((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime.Property property17 = dateTime13.dayOfWeek();
        boolean boolean18 = dateTimeZone2.equals((java.lang.Object) dateTime13);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime21 = dateTime19.plusMonths(94);
        org.joda.time.DateTime.Property property22 = dateTime19.year();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) '4', chronology30);
        org.joda.time.ReadablePartial readablePartial33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.withFields(readablePartial33);
        org.joda.time.DateTime.Property property35 = dateTime34.millisOfDay();
        org.joda.time.DateTime dateTime36 = dateTime34.withEarlierOffsetAtOverlap();
        int int37 = dateTime34.getDayOfWeek();
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 1, periodType39, chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone47 = chronology44.getZone();
        org.joda.time.DateTime dateTime48 = dateTime34.withChronology(chronology44);
        org.joda.time.DateTimeField dateTimeField49 = chronology44.era();
        long long51 = dateTimeField49.roundCeiling((long) 8);
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) 1, periodType53, chronology58);
        org.joda.time.DateTimeField dateTimeField60 = chronology58.hourOfHalfday();
        long long63 = dateTimeField60.getDifferenceAsLong((long) 10, (long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone65);
        int int67 = dateTime66.getSecondOfMinute();
        org.joda.time.DateTime dateTime69 = dateTime66.withMinuteOfHour(10);
        org.joda.time.TimeOfDay timeOfDay70 = dateTime69.toTimeOfDay();
        int[] intArray77 = new int[] { '4', 1970, 10, (byte) 10, 24, 50 };
        int int78 = dateTimeField60.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay70, intArray77);
        int[] intArray80 = new int[] { 947 };
        int int81 = dateTimeField49.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay70, intArray80);
        java.lang.Object obj82 = null;
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime(obj82);
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DateTime.Property property85 = dateTime83.property(dateTimeFieldType84);
        boolean boolean86 = timeOfDay70.isSupported(dateTimeFieldType84);
        int int87 = dateTime19.get(dateTimeFieldType84);
        boolean boolean88 = dateTime19.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime83", (instant3.compareTo(dateTime83) == 0) == instant3.equals(dateTime83));
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        org.joda.time.Period period1 = org.joda.time.Period.days((-1));
        org.joda.time.Period period3 = period1.withHours((int) (short) 0);
        int int4 = period3.getDays();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone6);
        int int8 = dateTime7.getDayOfMonth();
        org.joda.time.DateTime dateTime10 = dateTime7.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime12 = dateTime7.minusSeconds(0);
        java.lang.Object obj15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType17 = period16.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(obj15, periodType17);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 1, periodType20, chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology25.getZone();
        org.joda.time.DateTimeField dateTimeField29 = chronology25.minuteOfHour();
        org.joda.time.Chronology chronology30 = chronology25.withUTC();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 50, (-10L), periodType17, chronology30);
        org.joda.time.DateTime dateTime32 = dateTime7.toDateTime(chronology30);
        org.joda.time.Duration duration33 = period3.toDurationTo((org.joda.time.ReadableInstant) dateTime32);
        int int34 = dateTime32.getMillisOfSecond();
        org.joda.time.DateTime dateTime36 = dateTime32.withSecondOfMinute(23);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(52, (int) '#', 10, 2);
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean52 = mutableInterval47.isBefore((org.joda.time.ReadableInterval) mutableInterval51);
        boolean boolean53 = mutableInterval44.contains((org.joda.time.ReadableInterval) mutableInterval51);
        org.joda.time.Weeks weeks54 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval51);
        org.joda.time.ReadableDuration readableDuration55 = null;
        mutableInterval51.setDurationBeforeEnd(readableDuration55);
        long long57 = mutableInterval51.getEndMillis();
        mutablePeriod41.setPeriod((org.joda.time.ReadableInterval) mutableInterval51);
        org.joda.time.ReadableInterval readableInterval59 = null;
        mutablePeriod41.setPeriod(readableInterval59);
        org.joda.time.DateTime dateTime61 = dateTime32.minus((org.joda.time.ReadablePeriod) mutablePeriod41);
        org.joda.time.DateTime.Property property62 = dateTime32.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime32", (dateTime7.compareTo(dateTime32) == 0) == dateTime7.equals(dateTime32));
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology6);
        org.joda.time.Chronology chronology8 = chronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.secondOfMinute();
        org.joda.time.DurationField durationField10 = chronology6.eras();
        org.joda.time.DurationField durationField11 = chronology6.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField11, and durationField10", !(durationField10.compareTo(durationField11) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField11.compareTo(durationField10))));
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 100);
        org.joda.time.Period period3 = period1.plusDays((-1));
        org.joda.time.Period period5 = period3.withYears(48);
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period7 = seconds6.toPeriod();
        org.joda.time.DurationFieldType durationFieldType8 = seconds6.getFieldType();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, periodType12, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', chronology17);
        boolean boolean20 = periodType9.equals((java.lang.Object) chronology17);
        org.joda.time.DurationField durationField21 = chronology17.weekyears();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology17);
        org.joda.time.DateTimeField dateTimeField23 = chronology17.clockhourOfDay();
        org.joda.time.DurationField durationField24 = chronology17.years();
        boolean boolean25 = durationFieldType8.isSupported(chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField24", (durationField21.compareTo(durationField24) == 0) == durationField21.equals(durationField24));
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        int int15 = mutablePeriod8.getMillis();
        org.joda.time.DurationFieldType durationFieldType17 = mutablePeriod8.getFieldType(0);
        mutablePeriod8.setDays((int) (byte) -1);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.Instant instant21 = dateTime20.toInstant();
        org.joda.time.Duration duration22 = mutablePeriod8.toDurationFrom((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, periodType24, chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.hourOfHalfday();
        long long34 = dateTimeField31.getDifferenceAsLong((long) 10, (long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone36);
        int int38 = dateTime37.getSecondOfMinute();
        org.joda.time.DateTime dateTime40 = dateTime37.withMinuteOfHour(10);
        org.joda.time.TimeOfDay timeOfDay41 = dateTime40.toTimeOfDay();
        int[] intArray48 = new int[] { '4', 1970, 10, (byte) 10, 24, 50 };
        int int49 = dateTimeField31.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay41, intArray48);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 1, periodType51, chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.hourOfHalfday();
        long long61 = dateTimeField58.getDifferenceAsLong((long) 10, (long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone63);
        int int65 = dateTime64.getSecondOfMinute();
        org.joda.time.DateTime dateTime67 = dateTime64.withMinuteOfHour(10);
        org.joda.time.TimeOfDay timeOfDay68 = dateTime67.toTimeOfDay();
        int[] intArray75 = new int[] { '4', 1970, 10, (byte) 10, 24, 50 };
        int int76 = dateTimeField58.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay68, intArray75);
        org.joda.time.Days days77 = org.joda.time.Days.daysBetween((org.joda.time.ReadablePartial) timeOfDay41, (org.joda.time.ReadablePartial) timeOfDay68);
        org.joda.time.DateTime dateTime78 = dateTime20.withFields((org.joda.time.ReadablePartial) timeOfDay41);
        int int79 = dateTime20.getDayOfYear();
        org.joda.time.Duration duration81 = org.joda.time.Duration.standardHours((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone83);
        int int85 = dateTime84.getMillisOfDay();
        org.joda.time.DateTime dateTime87 = dateTime84.plusMillis((int) '#');
        boolean boolean89 = dateTime87.isAfter((-1L));
        int int90 = dateTime87.getCenturyOfEra();
        org.joda.time.Chronology chronology91 = null;
        org.joda.time.DateTime dateTime92 = dateTime87.toDateTime(chronology91);
        org.joda.time.Period period93 = duration81.toPeriodFrom((org.joda.time.ReadableInstant) dateTime87);
        org.joda.time.Duration duration94 = duration81.toDuration();
        org.joda.time.MutableInterval mutableInterval95 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableDuration) duration94);
        org.joda.time.Chronology chronology96 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField97 = chronology96.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant21", (dateTime20.compareTo(instant21) == 0) == dateTime20.equals(instant21));
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        long long5 = interval3.toDurationMillis();
        boolean boolean7 = interval3.isAfter((long) (short) 10);
        org.joda.time.Period period8 = interval3.toPeriod();
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.MutableInterval mutableInterval14 = interval12.toMutableInterval();
        org.joda.time.Interval interval16 = interval12.withEndMillis(53L);
        org.joda.time.Chronology chronology17 = interval12.getChronology();
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean28 = mutableInterval23.isBefore((org.joda.time.ReadableInterval) mutableInterval27);
        boolean boolean29 = mutableInterval20.contains((org.joda.time.ReadableInterval) mutableInterval27);
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        long long35 = interval33.toDurationMillis();
        org.joda.time.Interval interval37 = interval33.withEndMillis((long) (short) 100);
        mutableInterval27.setInterval((org.joda.time.ReadableInterval) interval33);
        boolean boolean39 = mutableInterval27.containsNow();
        boolean boolean40 = interval12.contains((org.joda.time.ReadableInterval) mutableInterval27);
        boolean boolean41 = interval3.isBefore((org.joda.time.ReadableInterval) mutableInterval27);
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean52 = mutableInterval47.isBefore((org.joda.time.ReadableInterval) mutableInterval51);
        boolean boolean53 = mutableInterval44.contains((org.joda.time.ReadableInterval) mutableInterval51);
        org.joda.time.MutableInterval mutableInterval54 = mutableInterval44.copy();
        org.joda.time.Interval interval55 = interval3.gap((org.joda.time.ReadableInterval) mutableInterval44);
        org.joda.time.MutableInterval mutableInterval56 = mutableInterval44.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval57 = mutableInterval56.toMutableInterval();
        org.joda.time.Duration duration59 = new org.joda.time.Duration(1L);
        org.joda.time.Duration duration60 = duration59.toDuration();
        long long61 = duration60.getStandardMinutes();
        org.joda.time.Instant instant62 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.Chronology chronology70 = interval69.getChronology();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((long) 1, periodType65, chronology70);
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((long) '4', chronology70);
        org.joda.time.ReadablePartial readablePartial73 = null;
        org.joda.time.DateTime dateTime74 = dateTime72.withFields(readablePartial73);
        boolean boolean75 = instant62.isAfter((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTime.Property property76 = dateTime72.dayOfWeek();
        org.joda.time.DateTime dateTime77 = property76.withMaximumValue();
        org.joda.time.DateTime dateTime79 = dateTime77.withWeekyear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone80 = dateTime77.getZone();
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime(dateTimeZone80);
        org.joda.time.Interval interval82 = duration60.toIntervalFrom((org.joda.time.ReadableInstant) dateTime81);
        mutableInterval56.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant62 and dateTime81", (instant62.compareTo(dateTime81) == 0) == instant62.equals(dateTime81));
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 10);
        org.joda.time.Instant instant6 = instant0.withDurationAdded((-54432000000L), 3);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.Instant instant9 = instant6.minus(0L);
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime7", (instant10.compareTo(dateTime7) == 0) == instant10.equals(dateTime7));
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        mutablePeriod8.addMonths((int) (short) -1);
        org.joda.time.Period period18 = org.joda.time.Period.days((-1));
        org.joda.time.Period period20 = period18.withWeeks((int) 'a');
        org.joda.time.Period period22 = period18.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = period22.isSupported(durationFieldType23);
        mutablePeriod8.add((org.joda.time.ReadablePeriod) period22);
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean36 = mutableInterval31.isBefore((org.joda.time.ReadableInterval) mutableInterval35);
        boolean boolean37 = mutableInterval28.contains((org.joda.time.ReadableInterval) mutableInterval35);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        long long43 = interval41.toDurationMillis();
        org.joda.time.Interval interval45 = interval41.withEndMillis((long) (short) 100);
        mutableInterval35.setInterval((org.joda.time.ReadableInterval) interval41);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        long long52 = interval50.toDurationMillis();
        boolean boolean53 = interval41.isAfter((org.joda.time.ReadableInterval) interval50);
        org.joda.time.Interval interval55 = interval41.withEndMillis(100L);
        boolean boolean56 = interval41.containsNow();
        mutablePeriod8.setPeriod((org.joda.time.ReadableInterval) interval41);
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.Chronology chronology62 = interval61.getChronology();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(chronology62);
        int int64 = dateTime63.getSecondOfMinute();
        org.joda.time.DateTime dateTime66 = dateTime63.withWeekyear(3);
        boolean boolean68 = dateTime66.isAfter(9223372036505575807L);
        boolean boolean69 = interval41.contains((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime.Property property70 = dateTime66.millisOfSecond();
        org.joda.time.Instant instant71 = new org.joda.time.Instant((java.lang.Object) dateTime66);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone73);
        java.util.Locale locale75 = null;
        java.util.Calendar calendar76 = dateTime74.toCalendar(locale75);
        org.joda.time.DateTime dateTime77 = dateTime74.toDateTime();
        boolean boolean78 = dateTime74.isAfterNow();
        org.joda.time.DateTime dateTime80 = dateTime74.minusWeeks(45);
        org.joda.time.Minutes minutes81 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) instant71, (org.joda.time.ReadableInstant) dateTime80);
        int int82 = dateTime80.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime66 and instant71", (dateTime66.compareTo(instant71) == 0) == dateTime66.equals(instant71));
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        int int15 = mutablePeriod8.getMillis();
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod8.toMutablePeriod();
        mutablePeriod8.addHours((int) (short) 100);
        mutablePeriod8.setMillis(3600010);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, periodType22, chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone30 = chronology27.getZone();
        long long33 = dateTimeZone30.convertLocalToUTC((-6380815651200000L), true);
        long long35 = dateTimeZone30.convertUTCToLocal((long) 53);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime38 = dateTime36.withWeekyear((int) 'a');
        org.joda.time.Duration duration39 = mutablePeriod8.toDurationFrom((org.joda.time.ReadableInstant) dateTime38);
        int int40 = mutablePeriod8.size();
        mutablePeriod8.setPeriod((long) (-120));
        org.joda.time.Instant instant45 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology46 = instant45.getChronology();
        org.joda.time.Instant instant49 = instant45.withDurationAdded((long) 24, 23);
        org.joda.time.Chronology chronology50 = instant45.getChronology();
        mutablePeriod8.setPeriod(70L, (long) 2032, chronology50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and instant45", (dateTime36.compareTo(instant45) == 0) == dateTime36.equals(instant45));
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) 349200000);
        org.joda.time.Days days6 = org.joda.time.Days.days(0);
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        int int8 = periodType7.size();
        org.joda.time.Period period9 = duration4.toPeriod(periodType7);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, periodType12, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', chronology17);
        org.joda.time.ReadablePartial readablePartial20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withFields(readablePartial20);
        org.joda.time.DateTime dateTime23 = dateTime19.plusMillis((int) ' ');
        org.joda.time.DateTime dateTime25 = dateTime19.minusMinutes((int) '#');
        boolean boolean27 = dateTime19.isBefore((long) (-1));
        org.joda.time.Chronology chronology28 = dateTime19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(164096150400000L, (-3600000L), periodType7, chronology28);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 1, periodType32, chronology37);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) '4', chronology37);
        org.joda.time.DurationField durationField40 = chronology37.centuries();
        org.joda.time.DurationField durationField41 = chronology37.eras();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) '4', periodType7, chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField40 and durationField41", Math.signum(durationField40.compareTo(durationField41)) == -Math.signum(durationField41.compareTo(durationField40)));
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter3.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', chronology16);
        org.joda.time.ReadablePartial readablePartial19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.withFields(readablePartial19);
        boolean boolean21 = instant8.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime.Property property22 = dateTime18.dayOfWeek();
        boolean boolean23 = dateTimeZone7.equals((java.lang.Object) dateTime18);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, periodType26, chronology31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', chronology31);
        org.joda.time.ReadablePartial readablePartial34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.withFields(readablePartial34);
        org.joda.time.DateTime.Property property36 = dateTime35.millisOfDay();
        org.joda.time.DateTime dateTime37 = dateTime35.withEarlierOffsetAtOverlap();
        int int38 = dateTime35.getDayOfWeek();
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.Chronology chronology45 = interval44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 1, periodType40, chronology45);
        org.joda.time.DateTimeField dateTimeField47 = chronology45.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone48 = chronology45.getZone();
        org.joda.time.DateTime dateTime49 = dateTime35.withChronology(chronology45);
        org.joda.time.Minutes minutes51 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType52 = null;
        int int53 = minutes51.get(durationFieldType52);
        int int55 = minutes51.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod56 = minutes51.toMutablePeriod();
        long long59 = chronology45.add((org.joda.time.ReadablePeriod) mutablePeriod56, (long) '#', (int) (short) 10);
        org.joda.time.Period period60 = mutablePeriod56.toPeriod();
        boolean boolean61 = dateTimeZone7.equals((java.lang.Object) mutablePeriod56);
        mutablePeriod56.setPeriod((long) 53);
        org.joda.time.PeriodType periodType64 = mutablePeriod56.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter65 = periodFormatter3.withParseType(periodType64);
        org.joda.time.PeriodType periodType66 = periodFormatter65.getParseType();
        boolean boolean67 = periodFormatter65.isPrinter();
        org.joda.time.PeriodType periodType68 = periodFormatter65.getParseType();
        org.joda.time.PeriodType periodType69 = periodType68.withHoursRemoved();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone71);
        int int73 = dateTime72.getDayOfMonth();
        org.joda.time.DateTime dateTime75 = dateTime72.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property76 = dateTime72.dayOfWeek();
        org.joda.time.DateTime dateTime77 = property76.roundHalfCeilingCopy();
        org.joda.time.DateTime.Property property78 = dateTime77.yearOfCentury();
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval82 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval83 = mutableInterval82.toInterval();
        org.joda.time.Chronology chronology84 = interval83.getChronology();
        org.joda.time.DateTimeZone dateTimeZone85 = chronology84.getZone();
        java.lang.String str87 = dateTimeZone85.getName(100L);
        org.joda.time.DateTime dateTime88 = dateTime79.withZoneRetainFields(dateTimeZone85);
        int int89 = dateTime88.getMinuteOfDay();
        int int90 = dateTime88.getEra();
        org.joda.time.DateTimeZone dateTimeZone92 = null;
        org.joda.time.DateTime dateTime93 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone92);
        org.joda.time.DateTime dateTime94 = dateTime93.withLaterOffsetAtOverlap();
        org.joda.time.Hours hours95 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime88, (org.joda.time.ReadableInstant) dateTime93);
        int int96 = property78.getDifference((org.joda.time.ReadableInstant) dateTime93);
        org.joda.time.Chronology chronology97 = dateTime93.getChronology();
        org.joda.time.Period period98 = new org.joda.time.Period(1640818800000L, periodType69, chronology97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime79", (instant8.compareTo(dateTime79) == 0) == instant8.equals(dateTime79));
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        boolean boolean11 = dateTime0.isEqual((-124334351997544L));
        org.joda.time.Chronology chronology12 = dateTime0.getChronology();
        boolean boolean14 = dateTime0.isBefore(0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.DateTime.Property property16 = dateTime0.property(dateTimeFieldType15);
        int int17 = property16.get();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 1, periodType20, chronology25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) '4', chronology25);
        org.joda.time.Instant instant28 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 1, periodType31, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) '4', chronology36);
        org.joda.time.ReadablePartial readablePartial39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.withFields(readablePartial39);
        boolean boolean41 = instant28.isAfter((org.joda.time.ReadableInstant) dateTime38);
        boolean boolean42 = dateTime27.isAfter((org.joda.time.ReadableInstant) dateTime38);
        java.lang.String str43 = dateTime27.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType45 = dateTimeFieldType44.getRangeDurationType();
        int int46 = dateTime27.get(dateTimeFieldType44);
        boolean boolean47 = dateTime27.isBeforeNow();
        org.joda.time.DateTime dateTime48 = dateTime27.toDateTimeISO();
        org.joda.time.DateTime dateTime50 = dateTime27.withYear(947);
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime50.toMutableDateTime();
        org.joda.time.DateTime.Property property52 = dateTime50.dayOfMonth();
        org.joda.time.DateTime dateTime53 = property52.roundHalfFloorCopy();
        int int54 = property16.compareTo((org.joda.time.ReadableInstant) dateTime53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant28", (dateTime0.compareTo(instant28) == 0) == dateTime0.equals(instant28));
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        org.joda.time.DateTime dateTime12 = dateTime9.minusYears((int) '#');
        int int13 = dateTime9.getCenturyOfEra();
        org.joda.time.YearMonthDay yearMonthDay14 = dateTime9.toYearMonthDay();
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.Instant instant17 = instant15.minus(100L);
        org.joda.time.DateTime dateTime18 = instant17.toDateTimeISO();
        int int19 = dateTime18.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime.Property property21 = dateTime18.property(dateTimeFieldType20);
        boolean boolean22 = yearMonthDay14.isSupported(dateTimeFieldType20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and dateTime18", (instant17.compareTo(dateTime18) == 0) == instant17.equals(dateTime18));
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 1);
        org.joda.time.Instant instant3 = instant1.minus(863999990L);
        org.joda.time.Instant instant5 = instant3.plus((-2012L));
        org.joda.time.MutableDateTime mutableDateTime6 = instant3.toMutableDateTimeISO();
        org.joda.time.Instant instant8 = instant3.withMillis(6000135L);
        org.joda.time.DateTime dateTime9 = instant8.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime6", (instant3.compareTo(mutableDateTime6) == 0) == instant3.equals(mutableDateTime6));
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.DateTime.Property property2 = dateTime0.minuteOfDay();
        boolean boolean3 = dateTime0.isEqualNow();
        org.joda.time.DateTime dateTime4 = dateTime0.toDateTimeISO();
        org.joda.time.Instant instant5 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime7 = instant5.toDateTimeISO();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant1", (dateTime4.compareTo(instant1) == 0) == dateTime4.equals(instant1));
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        int int15 = property14.getMaximumValue();
        org.joda.time.DateTime dateTime16 = property14.roundFloorCopy();
        long long17 = property14.remainder();
        org.joda.time.DateTime dateTime18 = property14.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField19 = property14.getField();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, periodType23, chronology28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) '4', chronology28);
        org.joda.time.ReadablePartial readablePartial31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.withFields(readablePartial31);
        org.joda.time.DateTime.Property property33 = dateTime32.millisOfDay();
        org.joda.time.DateTime dateTime34 = dateTime32.withEarlierOffsetAtOverlap();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableDuration20, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.YearMonthDay yearMonthDay36 = dateTime32.toYearMonthDay();
        java.lang.String str37 = dateTime32.toString();
        int int38 = property14.getDifference((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period49 = org.joda.time.Period.days((-1));
        org.joda.time.Period period51 = period49.withWeeks((int) 'a');
        java.lang.String str52 = period49.toString();
        mutablePeriod47.setPeriod((org.joda.time.ReadablePeriod) period49);
        int int54 = mutablePeriod47.getMillis();
        org.joda.time.DurationFieldType durationFieldType56 = mutablePeriod47.getFieldType(0);
        mutablePeriod47.setDays((int) (byte) -1);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime();
        org.joda.time.Instant instant60 = dateTime59.toInstant();
        org.joda.time.Duration duration61 = mutablePeriod47.toDurationFrom((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTimeZone dateTimeZone62 = dateTime59.getZone();
        boolean boolean64 = dateTime59.isBefore(1645454986807L);
        int int65 = property14.getDifference((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTime dateTime66 = property14.roundCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime59", (instant0.compareTo(dateTime59) == 0) == instant0.equals(dateTime59));
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        java.lang.Object obj2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(obj2, periodType4);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, periodType7, chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.minuteOfHour();
        org.joda.time.Chronology chronology17 = chronology12.withUTC();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 50, (-10L), periodType4, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology17);
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.yearOfEra();
        org.joda.time.Minutes minutes26 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes28 = minutes26.dividedBy((int) 'a');
        int[] intArray31 = chronology24.get((org.joda.time.ReadablePeriod) minutes28, (-9L), (-2496683648L));
        org.joda.time.DateTimeField dateTimeField32 = chronology24.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = dateTimeField32.getType();
        org.joda.time.DateTime.Property property34 = dateTime19.property(dateTimeFieldType33);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 1, periodType39, chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.yearOfCentury();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.DateTimeZone dateTimeZone53 = chronology52.getZone();
        java.lang.String str55 = dateTimeZone53.getName(100L);
        org.joda.time.DateTime dateTime56 = dateTime47.withZoneRetainFields(dateTimeZone53);
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.Chronology chronology61 = interval60.getChronology();
        org.joda.time.DateTimeZone dateTimeZone62 = chronology61.getZone();
        java.lang.String str64 = dateTimeZone62.getName(100L);
        org.joda.time.DateTime dateTime65 = dateTime56.withZoneRetainFields(dateTimeZone62);
        org.joda.time.Chronology chronology66 = chronology44.withZone(dateTimeZone62);
        org.joda.time.DurationField durationField67 = chronology44.centuries();
        org.joda.time.DateTimeField dateTimeField68 = chronology44.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField69 = chronology44.millisOfSecond();
        org.joda.time.DurationField durationField70 = chronology44.weekyears();
        org.joda.time.DurationField durationField71 = chronology44.weekyears();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) 45, chronology44);
        org.joda.time.Period period73 = new org.joda.time.Period((-2012L), 947000L, chronology44);
        long long77 = chronology44.add(1798283647L, (long) (-613704), 58);
        boolean boolean78 = dateTimeFieldType33.isSupported(chronology44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime47", (dateTime19.compareTo(dateTime47) == 0) == dateTime19.equals(dateTime47));
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone16);
        int int18 = dateTime17.getDayOfMonth();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 1, periodType20, chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology25.getZone();
        org.joda.time.DateTime dateTime29 = dateTime17.withZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = dateTime10.withZone(dateTimeZone28);
        int int32 = dateTimeZone28.getOffset((-10L));
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DateTime.Property property34 = dateTime33.dayOfYear();
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) '4', chronology42);
        org.joda.time.ReadablePartial readablePartial45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.withFields(readablePartial45);
        org.joda.time.DateTime.Property property47 = dateTime46.millisOfDay();
        org.joda.time.DateTime dateTime48 = dateTime46.withEarlierOffsetAtOverlap();
        int int49 = dateTime46.getDayOfWeek();
        boolean boolean50 = dateTime33.isAfter((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval56 = mutableInterval55.toInterval();
        org.joda.time.Chronology chronology57 = interval56.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 1, periodType52, chronology57);
        org.joda.time.DateTimeField dateTimeField59 = chronology57.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone60 = chronology57.getZone();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHours(52);
        org.joda.time.Chronology chronology63 = chronology57.withZone(dateTimeZone62);
        org.joda.time.DurationField durationField64 = chronology57.halfdays();
        org.joda.time.DateTime dateTime65 = dateTime46.toDateTime(chronology57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime33", (instant0.compareTo(dateTime33) == 0) == instant0.equals(dateTime33));
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((java.lang.Object) dateTime15);
        java.lang.String str19 = instant18.toString();
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.Chronology chronology21 = instant18.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant18", (dateTime15.compareTo(instant18) == 0) == dateTime15.equals(instant18));
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 1, periodType13, chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) '4', chronology18);
        org.joda.time.ReadablePartial readablePartial21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.withFields(readablePartial21);
        boolean boolean23 = instant10.isAfter((org.joda.time.ReadableInstant) dateTime20);
        boolean boolean24 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime20);
        java.lang.String str25 = dateTime20.toString();
        org.joda.time.DateTime dateTime26 = dateTime20.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime26.getZone();
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology32);
        int int34 = dateTime33.getSecondOfMinute();
        org.joda.time.DateTime dateTime36 = dateTime33.withWeekyear(3);
        boolean boolean38 = dateTime36.isAfter(9223372036505575807L);
        org.joda.time.DateTime dateTime40 = dateTime36.plusWeeks((-6));
        int int41 = dateTime36.getDayOfWeek();
        org.joda.time.DateTime dateTime43 = dateTime36.plus((long) 26);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.DateTimeZone dateTimeZone50 = chronology49.getZone();
        java.lang.String str52 = dateTimeZone50.getName(100L);
        org.joda.time.DateTime dateTime53 = dateTime44.withZoneRetainFields(dateTimeZone50);
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        org.joda.time.DateTimeZone dateTimeZone59 = chronology58.getZone();
        java.lang.String str61 = dateTimeZone59.getName(100L);
        org.joda.time.DateTime dateTime62 = dateTime53.withZoneRetainFields(dateTimeZone59);
        java.util.TimeZone timeZone63 = dateTimeZone59.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forTimeZone(timeZone63);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forTimeZone(timeZone63);
        org.joda.time.DateTime dateTime66 = dateTime36.toDateTime(dateTimeZone65);
        org.joda.time.MutableDateTime mutableDateTime67 = dateTime26.toMutableDateTime(dateTimeZone65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime33", (instant10.compareTo(dateTime33) == 0) == instant10.equals(dateTime33));
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((java.lang.Object) dateTime15);
        org.joda.time.Hours hours19 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours20 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours21 = hours19.minus(hours20);
        org.joda.time.Duration duration22 = hours20.toStandardDuration();
        org.joda.time.Duration duration23 = duration22.toDuration();
        long long24 = duration23.getStandardSeconds();
        org.joda.time.Instant instant25 = instant18.plus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.DateTime dateTime26 = instant18.toDateTimeISO();
        org.joda.time.Instant instant27 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 1, periodType30, chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) '4', chronology35);
        org.joda.time.ReadablePartial readablePartial38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.withFields(readablePartial38);
        boolean boolean40 = instant27.isAfter((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime.Property property41 = dateTime37.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone43);
        int int45 = dateTime44.getDayOfMonth();
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, periodType47, chronology52);
        org.joda.time.DateTimeField dateTimeField54 = chronology52.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone55 = chronology52.getZone();
        org.joda.time.DateTime dateTime56 = dateTime44.withZoneRetainFields(dateTimeZone55);
        org.joda.time.DateTime dateTime57 = dateTime37.withZone(dateTimeZone55);
        int int58 = dateTime37.getSecondOfDay();
        org.joda.time.Duration duration59 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration60 = duration59.toDuration();
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval64 = mutableInterval63.toInterval();
        org.joda.time.Chronology chronology65 = interval64.getChronology();
        org.joda.time.DateTimeZone dateTimeZone66 = chronology65.getZone();
        org.joda.time.Period period67 = duration59.toPeriod(chronology65);
        org.joda.time.DateTime dateTime68 = dateTime37.toDateTime(chronology65);
        org.joda.time.DateMidnight dateMidnight69 = dateTime37.toDateMidnight();
        boolean boolean70 = dateTime26.isAfter((org.joda.time.ReadableInstant) dateMidnight69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant18", (dateTime15.compareTo(instant18) == 0) == dateTime15.equals(instant18));
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Instant instant3 = instant1.plus(157784803200024L);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.Instant instant7 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration5, (int) '4');
        org.joda.time.Instant instant8 = instant1.toInstant();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone10);
        int int12 = dateTime11.getSecondOfMinute();
        int int13 = dateTime11.getMillisOfDay();
        org.joda.time.DateTime dateTime15 = dateTime11.withYear((int) (byte) 100);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int18 = dateTime15.get(dateTimeFieldType17);
        int int19 = instant1.get(dateTimeFieldType17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        int int3 = minutes1.get(durationFieldType2);
        int int5 = minutes1.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod6 = minutes1.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType8 = minutes1.getFieldType(0);
        org.joda.time.Duration duration9 = minutes1.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone11);
        int int13 = dateTime12.getMillisOfDay();
        org.joda.time.DateTime dateTime15 = dateTime12.plusMillis((int) '#');
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, periodType18, chronology23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', chronology23);
        org.joda.time.DateTime dateTime26 = dateTime15.withChronology(chronology23);
        int int27 = dateTime26.getYearOfEra();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(periodType28);
        org.joda.time.Period period30 = duration9.toPeriodFrom((org.joda.time.ReadableInstant) dateTime26, periodType28);
        org.joda.time.Instant instant31 = dateTime26.toInstant();
        boolean boolean33 = dateTime26.isBefore((-6L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant31", (dateTime26.compareTo(instant31) == 0) == dateTime26.equals(instant31));
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTime();
        java.lang.String str6 = dateTime2.toString();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology12.getZone();
        java.lang.String str15 = dateTimeZone13.getName(100L);
        org.joda.time.DateTime dateTime16 = dateTime7.withZoneRetainFields(dateTimeZone13);
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology21.getZone();
        java.lang.String str24 = dateTimeZone22.getName(100L);
        org.joda.time.DateTime dateTime25 = dateTime16.withZoneRetainFields(dateTimeZone22);
        java.util.TimeZone timeZone26 = dateTimeZone22.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTime dateTime29 = dateTime2.withZone(dateTimeZone28);
        org.joda.time.Hours hours30 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period41 = org.joda.time.Period.days((-1));
        org.joda.time.Period period43 = period41.withWeeks((int) 'a');
        java.lang.String str44 = period41.toString();
        mutablePeriod39.setPeriod((org.joda.time.ReadablePeriod) period41);
        int int46 = mutablePeriod39.getMillis();
        org.joda.time.DurationFieldType durationFieldType48 = mutablePeriod39.getFieldType(0);
        int int49 = hours30.get(durationFieldType48);
        org.joda.time.Hours hours51 = hours30.multipliedBy(100);
        org.joda.time.Hours hours53 = hours51.dividedBy(50);
        org.joda.time.Hours hours55 = hours51.dividedBy((int) (byte) 1);
        org.joda.time.Hours hours56 = org.joda.time.Hours.MIN_VALUE;
        org.joda.time.Hours hours57 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours58 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours59 = hours57.minus(hours58);
        org.joda.time.Duration duration60 = hours58.toStandardDuration();
        org.joda.time.Hours hours61 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period72 = org.joda.time.Period.days((-1));
        org.joda.time.Period period74 = period72.withWeeks((int) 'a');
        java.lang.String str75 = period72.toString();
        mutablePeriod70.setPeriod((org.joda.time.ReadablePeriod) period72);
        int int77 = mutablePeriod70.getMillis();
        org.joda.time.DurationFieldType durationFieldType79 = mutablePeriod70.getFieldType(0);
        int int80 = hours61.get(durationFieldType79);
        org.joda.time.Hours hours82 = hours61.multipliedBy(100);
        org.joda.time.Hours hours83 = hours61.negated();
        boolean boolean84 = hours58.isGreaterThan(hours61);
        org.joda.time.Hours hours85 = hours56.plus(hours58);
        org.joda.time.Hours hours87 = org.joda.time.Hours.hours((int) (byte) 100);
        org.joda.time.Hours hours89 = hours87.minus(5);
        boolean boolean90 = hours58.isLessThan(hours87);
        org.joda.time.Hours hours91 = hours55.plus(hours58);
        org.joda.time.Hours hours93 = hours55.plus(10);
        org.joda.time.MutableInterval mutableInterval94 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadablePeriod) hours55);
        org.joda.time.Seconds seconds95 = org.joda.time.Seconds.MIN_VALUE;
        java.lang.String str96 = seconds95.toString();
        org.joda.time.DurationFieldType durationFieldType97 = seconds95.getFieldType();
        int int98 = hours55.get(durationFieldType97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime29", (dateTime2.compareTo(dateTime29) == 0) == dateTime2.equals(dateTime29));
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property15 = dateTime11.era();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Instant instant17 = dateTime16.toInstant();
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) instant17);
        org.joda.time.Instant instant20 = instant17.minus((long) 349200000);
        org.joda.time.Duration duration21 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, periodType24, chronology29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) '4', chronology29);
        org.joda.time.ReadablePartial readablePartial32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.withFields(readablePartial32);
        org.joda.time.DateTime.Property property34 = dateTime33.millisOfDay();
        org.joda.time.DateTime dateTime35 = dateTime33.withEarlierOffsetAtOverlap();
        int int36 = dateTime33.getDayOfWeek();
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 1, periodType38, chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone46 = chronology43.getZone();
        org.joda.time.DateTime dateTime47 = dateTime33.withChronology(chronology43);
        org.joda.time.Interval interval48 = duration21.toIntervalTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period51 = duration21.toPeriodFrom((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Duration duration53 = duration21.withMillis(100L);
        org.joda.time.Instant instant55 = instant17.withDurationAdded((org.joda.time.ReadableDuration) duration21, 23);
        org.joda.time.Instant instant56 = instant17.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant56", (dateTime16.compareTo(instant56) == 0) == dateTime16.equals(instant56));
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("0");
        org.joda.time.Period period3 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) (-90), periodType4);
        org.joda.time.Period period6 = mutablePeriod5.toPeriod();
        org.joda.time.Weeks weeks7 = period6.toStandardWeeks();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) instant1, (org.joda.time.ReadablePeriod) weeks7);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 1, periodType10, chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology15.getZone();
        org.joda.time.DateTimeField dateTimeField19 = chronology15.minuteOfHour();
        org.joda.time.Chronology chronology20 = chronology15.withUTC();
        org.joda.time.DateTimeField dateTimeField21 = chronology15.millisOfDay();
        org.joda.time.DurationField durationField22 = chronology15.hours();
        org.joda.time.DateTimeField dateTimeField23 = chronology15.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime24 = instant1.toMutableDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField25 = chronology15.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime24", (instant1.compareTo(mutableDateTime24) == 0) == instant1.equals(mutableDateTime24));
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        mutablePeriod8.addMonths((int) (short) -1);
        org.joda.time.Period period18 = org.joda.time.Period.days((-1));
        org.joda.time.Period period20 = period18.withWeeks((int) 'a');
        org.joda.time.Period period22 = period18.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = period22.isSupported(durationFieldType23);
        mutablePeriod8.add((org.joda.time.ReadablePeriod) period22);
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean36 = mutableInterval31.isBefore((org.joda.time.ReadableInterval) mutableInterval35);
        boolean boolean37 = mutableInterval28.contains((org.joda.time.ReadableInterval) mutableInterval35);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        long long43 = interval41.toDurationMillis();
        org.joda.time.Interval interval45 = interval41.withEndMillis((long) (short) 100);
        mutableInterval35.setInterval((org.joda.time.ReadableInterval) interval41);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        long long52 = interval50.toDurationMillis();
        boolean boolean53 = interval41.isAfter((org.joda.time.ReadableInterval) interval50);
        org.joda.time.Interval interval55 = interval41.withEndMillis(100L);
        boolean boolean56 = interval41.containsNow();
        mutablePeriod8.setPeriod((org.joda.time.ReadableInterval) interval41);
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.Chronology chronology62 = interval61.getChronology();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(chronology62);
        int int64 = dateTime63.getSecondOfMinute();
        org.joda.time.DateTime dateTime66 = dateTime63.withWeekyear(3);
        boolean boolean68 = dateTime66.isAfter(9223372036505575807L);
        boolean boolean69 = interval41.contains((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime.Property property70 = dateTime66.millisOfSecond();
        org.joda.time.Instant instant71 = new org.joda.time.Instant((java.lang.Object) dateTime66);
        org.joda.time.DateTime.Property property72 = dateTime66.monthOfYear();
        org.joda.time.DateTime dateTime74 = property72.addWrapFieldToCopy(57147319);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime66 and instant71", (dateTime66.compareTo(instant71) == 0) == dateTime66.equals(instant71));
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) '4');
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra(21);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 1, periodType14, chronology19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', chronology19);
        org.joda.time.DateTime dateTime23 = dateTime21.withCenturyOfEra(12);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone33 = chronology30.getZone();
        java.lang.String str34 = dateTimeZone33.toString();
        org.joda.time.DateTime dateTime35 = dateTime21.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime37 = dateTime35.minusMinutes(26);
        int int38 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((-530L));
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.Chronology chronology45 = interval44.getChronology();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(chronology45);
        boolean boolean47 = dateTime40.isAfter((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.DateTimeZone dateTimeZone57 = chronology56.getZone();
        java.lang.String str59 = dateTimeZone57.getName(100L);
        org.joda.time.DateTime dateTime60 = dateTime51.withZoneRetainFields(dateTimeZone57);
        long long62 = dateTimeZone50.getMillisKeepLocal(dateTimeZone57, 6000035L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone50);
        java.util.Locale locale65 = null;
        java.lang.String str66 = dateTimeZone50.getShortName(349200000L, locale65);
        org.joda.time.MutableDateTime mutableDateTime67 = dateTime46.toMutableDateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime68 = dateTime35.toDateTime(dateTimeZone50);
        long long70 = dateTimeZone50.previousTransition(18397670400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime67", (dateTime5.compareTo(mutableDateTime67) == 0) == dateTime5.equals(mutableDateTime67));
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone16);
        int int18 = dateTime17.getDayOfMonth();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 1, periodType20, chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology25.getZone();
        org.joda.time.DateTime dateTime29 = dateTime17.withZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = dateTime10.withZone(dateTimeZone28);
        int int32 = dateTimeZone28.getOffset((-10L));
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DateTime.Property property34 = dateTime33.dayOfYear();
        org.joda.time.Interval interval35 = property34.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime33", (instant0.compareTo(dateTime33) == 0) == instant0.equals(dateTime33));
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime12.withEarlierOffsetAtOverlap();
        int int15 = dateTime12.getDayOfWeek();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology22.getZone();
        org.joda.time.DateTime dateTime26 = dateTime12.withChronology(chronology22);
        org.joda.time.Interval interval27 = duration0.toIntervalTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period30 = duration0.toPeriodFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Minutes minutes31 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes33 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType34 = null;
        int int35 = minutes33.get(durationFieldType34);
        org.joda.time.DurationFieldType durationFieldType36 = minutes33.getFieldType();
        boolean boolean37 = minutes31.isGreaterThan(minutes33);
        org.joda.time.Instant instant38 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes33, (org.joda.time.ReadableInstant) instant38);
        org.joda.time.DateTime dateTime40 = instant38.toDateTimeISO();
        boolean boolean41 = duration0.equals((java.lang.Object) dateTime40);
        int int42 = dateTime40.getCenturyOfEra();
        org.joda.time.DateTime.Property property43 = dateTime40.millisOfSecond();
        java.lang.String str44 = property43.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant38 and dateTime40", (instant38.compareTo(dateTime40) == 0) == instant38.equals(dateTime40));
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.Interval interval5 = interval3.toInterval();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval8 = interval5.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration7);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        long long23 = interval21.toDurationMillis();
        mutablePeriod17.setPeriod((org.joda.time.ReadableInterval) interval21);
        boolean boolean25 = interval5.isBefore((org.joda.time.ReadableInterval) interval21);
        org.joda.time.Instant instant26 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', chronology34);
        org.joda.time.ReadablePartial readablePartial37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withFields(readablePartial37);
        boolean boolean39 = instant26.isAfter((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Period period41 = org.joda.time.Period.days((-1));
        org.joda.time.Period period43 = period41.withWeeks((int) 'a');
        org.joda.time.Period period45 = period41.plusMonths((int) (short) -1);
        org.joda.time.Period period47 = period41.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime48 = dateTime36.plus((org.joda.time.ReadablePeriod) period41);
        org.joda.time.Instant instant49 = dateTime48.toInstant();
        boolean boolean50 = interval5.isAfter((org.joda.time.ReadableInstant) instant49);
        long long51 = instant49.getMillis();
        org.joda.time.DateTime dateTime52 = instant49.toDateTimeISO();
        org.joda.time.Instant instant54 = instant49.withMillis((long) 46200);
        org.joda.time.Instant instant56 = instant54.withMillis((long) 33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime48 and instant49", (dateTime48.compareTo(instant49) == 0) == dateTime48.equals(instant49));
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.DateTime.Property property2 = dateTime0.minuteOfDay();
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology9.getZone();
        java.lang.String str13 = dateTimeZone12.toString();
        org.joda.time.DateTime dateTime14 = dateTime0.toDateTime(dateTimeZone12);
        int int15 = dateTime0.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime0", (instant1.compareTo(dateTime0) == 0) == instant1.equals(dateTime0));
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((java.lang.Object) dateTime15);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, periodType22, chronology27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) '4', chronology27);
        boolean boolean30 = periodType19.equals((java.lang.Object) chronology27);
        org.joda.time.DurationField durationField31 = chronology27.weekyears();
        org.joda.time.DateTime dateTime32 = instant18.toDateTime(chronology27);
        boolean boolean34 = dateTime32.equals((java.lang.Object) "PT0.053S");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant18", (dateTime15.compareTo(instant18) == 0) == dateTime15.equals(instant18));
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((java.lang.Object) dateTime15);
        org.joda.time.DateTime dateTime19 = instant18.toDateTime();
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.Chronology chronology21 = chronology20.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant18", (dateTime15.compareTo(instant18) == 0) == dateTime15.equals(instant18));
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime12.withEarlierOffsetAtOverlap();
        int int15 = dateTime12.getDayOfWeek();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology22.getZone();
        org.joda.time.DateTime dateTime26 = dateTime12.withChronology(chronology22);
        org.joda.time.Interval interval27 = duration0.toIntervalTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period30 = duration0.toPeriodFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime.Property property31 = dateTime29.era();
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(periodType32);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadablePeriod) mutablePeriod33);
        java.lang.Object obj35 = mutablePeriod33.clone();
        java.lang.Object obj36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType38 = period37.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(obj36, periodType38);
        org.joda.time.Period period40 = new org.joda.time.Period((java.lang.Object) mutablePeriod33, periodType38);
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 1, periodType44, chronology49);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) '4', chronology49);
        org.joda.time.ReadablePartial readablePartial52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.withFields(readablePartial52);
        boolean boolean54 = instant41.isAfter((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime.Property property55 = dateTime51.dayOfWeek();
        int int56 = property55.getMaximumValue();
        java.lang.String str57 = property55.getAsText();
        long long58 = property55.remainder();
        boolean boolean59 = mutablePeriod33.equals((java.lang.Object) property55);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(dateTimeZone62);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.DateTimeZone dateTimeZone70 = chronology69.getZone();
        java.lang.String str72 = dateTimeZone70.getName(100L);
        org.joda.time.DateTime dateTime73 = dateTime64.withZoneRetainFields(dateTimeZone70);
        int int74 = dateTime73.getMinuteOfDay();
        int int75 = dateTime73.getEra();
        org.joda.time.DateMidnight dateMidnight76 = dateTime73.toDateMidnight();
        mutablePeriod33.setPeriod((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime79 = dateTime73.plusWeeks(852);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant41 and dateTime63", (instant41.compareTo(dateTime63) == 0) == instant41.equals(dateTime63));
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.MutableInterval mutableInterval5 = interval3.toMutableInterval();
        org.joda.time.Interval interval6 = interval3.toInterval();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period17 = org.joda.time.Period.days((-1));
        org.joda.time.Period period19 = period17.withWeeks((int) 'a');
        java.lang.String str20 = period17.toString();
        mutablePeriod15.setPeriod((org.joda.time.ReadablePeriod) period17);
        int int22 = mutablePeriod15.getMillis();
        org.joda.time.MutablePeriod mutablePeriod23 = mutablePeriod15.toMutablePeriod();
        mutablePeriod15.addHours((int) (short) 100);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.Chronology chronology36 = chronology34.withUTC();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.dayOfYear();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) 52, chronology36);
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(chronology36);
        org.joda.time.DateTimeField dateTimeField40 = chronology36.secondOfDay();
        mutablePeriod15.add(29916000000021L, chronology36);
        org.joda.time.Interval interval42 = interval3.withChronology(chronology36);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 1, periodType45, chronology50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) '4', chronology50);
        org.joda.time.ReadablePartial readablePartial53 = null;
        org.joda.time.DateTime dateTime54 = dateTime52.withFields(readablePartial53);
        org.joda.time.DateTime.Property property55 = dateTime54.millisOfDay();
        org.joda.time.DateTime dateTime57 = dateTime54.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime59 = dateTime54.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours60 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours61 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours62 = hours60.minus(hours61);
        org.joda.time.Duration duration63 = hours61.toStandardDuration();
        org.joda.time.DateTime dateTime64 = dateTime54.plus((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Duration duration65 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration66 = duration65.toDuration();
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval70 = mutableInterval69.toInterval();
        org.joda.time.Chronology chronology71 = interval70.getChronology();
        org.joda.time.DateTimeZone dateTimeZone72 = chronology71.getZone();
        org.joda.time.Period period73 = duration65.toPeriod(chronology71);
        boolean boolean74 = duration63.isShorterThan((org.joda.time.ReadableDuration) duration65);
        org.joda.time.PeriodType periodType75 = org.joda.time.PeriodType.days();
        org.joda.time.Period period76 = duration65.toPeriod(periodType75);
        org.joda.time.Period period77 = period76.negated();
        org.joda.time.Period period78 = new org.joda.time.Period((java.lang.Object) period77);
        org.joda.time.Duration duration79 = period77.toStandardDuration();
        org.joda.time.Interval interval80 = interval42.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and dateTime52", (dateTime38.compareTo(dateTime52) == 0) == dateTime38.equals(dateTime52));
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(0L);
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean9 = mutableInterval4.isBefore((org.joda.time.ReadableInterval) mutableInterval8);
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.Interval interval15 = interval13.toInterval();
        org.joda.time.Duration duration17 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval18 = interval15.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration17);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, periodType21, chronology26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '4', chronology26);
        org.joda.time.ReadablePartial readablePartial29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.withFields(readablePartial29);
        org.joda.time.DateTime.Property property31 = dateTime30.millisOfDay();
        org.joda.time.DateTime dateTime33 = dateTime30.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property34 = dateTime30.era();
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime38 = dateTime30.withDurationAdded((org.joda.time.ReadableDuration) duration36, 0);
        long long39 = duration36.getStandardHours();
        org.joda.time.Duration duration40 = duration17.plus((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Duration duration41 = duration17.toDuration();
        mutableInterval8.setDurationAfterStart((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Duration duration43 = duration41.toDuration();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.Instant instant45 = dateTime44.toInstant();
        org.joda.time.DateTime.Property property46 = dateTime44.minuteOfDay();
        org.joda.time.Instant instant47 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 1, periodType50, chronology55);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) '4', chronology55);
        org.joda.time.ReadablePartial readablePartial58 = null;
        org.joda.time.DateTime dateTime59 = dateTime57.withFields(readablePartial58);
        boolean boolean60 = instant47.isAfter((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime.Property property61 = dateTime57.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone63);
        int int65 = dateTime64.getDayOfMonth();
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval71 = mutableInterval70.toInterval();
        org.joda.time.Chronology chronology72 = interval71.getChronology();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) 1, periodType67, chronology72);
        org.joda.time.DateTimeField dateTimeField74 = chronology72.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone75 = chronology72.getZone();
        org.joda.time.DateTime dateTime76 = dateTime64.withZoneRetainFields(dateTimeZone75);
        org.joda.time.DateTime dateTime77 = dateTime57.withZone(dateTimeZone75);
        org.joda.time.Seconds seconds78 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime dateTime80 = dateTime44.plusMillis((int) (short) 1);
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration41, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Seconds seconds82 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime44);
        int int83 = dateTime1.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and instant45", (dateTime44.compareTo(instant45) == 0) == dateTime44.equals(instant45));
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.Chronology chronology11 = interval10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 1, periodType6, chronology11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', chronology11);
        org.joda.time.ReadablePartial readablePartial14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.withFields(readablePartial14);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfDay();
        org.joda.time.DateTime dateTime17 = dateTime15.withEarlierOffsetAtOverlap();
        int int18 = dateTime15.getDayOfWeek();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 1, periodType20, chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology25.getZone();
        org.joda.time.DateTime dateTime29 = dateTime15.withChronology(chronology25);
        org.joda.time.DateTimeField dateTimeField30 = chronology25.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField31 = chronology25.year();
        org.joda.time.DateTimeField dateTimeField32 = chronology25.era();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((-86399948L), (long) 56891755, chronology25);
        org.joda.time.DurationField durationField34 = chronology25.millis();
        org.joda.time.DateTimeField dateTimeField35 = chronology25.millisOfDay();
        org.joda.time.DateTimeField dateTimeField36 = chronology25.weekyearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((-933750109L), chronology25);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(948L, chronology25);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 1, periodType42, chronology47);
        org.joda.time.DateTimeField dateTimeField49 = chronology47.yearOfCentury();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.DateTimeZone dateTimeZone56 = chronology55.getZone();
        java.lang.String str58 = dateTimeZone56.getName(100L);
        org.joda.time.DateTime dateTime59 = dateTime50.withZoneRetainFields(dateTimeZone56);
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.DateTimeZone dateTimeZone65 = chronology64.getZone();
        java.lang.String str67 = dateTimeZone65.getName(100L);
        org.joda.time.DateTime dateTime68 = dateTime59.withZoneRetainFields(dateTimeZone65);
        org.joda.time.Chronology chronology69 = chronology47.withZone(dateTimeZone65);
        org.joda.time.DateTimeField dateTimeField70 = chronology69.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField71 = chronology69.secondOfDay();
        boolean boolean72 = dateTimeFieldType40.isSupported(chronology69);
        org.joda.time.DurationField durationField73 = chronology69.hours();
        org.joda.time.DurationField durationField74 = chronology69.eras();
        mutablePeriod38.setPeriod(2120627174400000L, chronology69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField34 and durationField74", Math.signum(durationField34.compareTo(durationField74)) == -Math.signum(durationField74.compareTo(durationField34)));
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField13 = chronology6.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField13, and durationField10", !(durationField10.compareTo(durationField13) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField13.compareTo(durationField10))));
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property15 = dateTime11.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
        int int17 = property15.getLeapAmount();
        org.joda.time.DateTime dateTime18 = property15.roundFloorCopy();
        org.joda.time.Instant instant19 = new org.joda.time.Instant((java.lang.Object) dateTime18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((long) '4', (-1970));
        org.joda.time.Instant instant25 = instant22.withDurationAdded(1645455001310L, 23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant19", (dateTime18.compareTo(instant19) == 0) == dateTime18.equals(instant19));
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 1);
        org.joda.time.Instant instant3 = instant1.plus(315569520000001L);
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.Hours hours5 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours6 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours7 = hours5.minus(hours6);
        org.joda.time.Hours hours8 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours9 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours10 = hours8.minus(hours9);
        org.joda.time.Hours hours11 = hours5.minus(hours8);
        org.joda.time.DateTime dateTime13 = dateTime4.withPeriodAdded((org.joda.time.ReadablePeriod) hours5, 1);
        org.joda.time.DateTime dateTime15 = dateTime4.withMillisOfSecond(49);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(6216719587200001L, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusWeeks(19);
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        int int28 = dateTime27.getSecondOfMinute();
        org.joda.time.DateTime dateTime30 = dateTime27.withWeekyear(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.year();
        int int32 = dateTime27.get(dateTimeFieldType31);
        java.lang.String str33 = dateTimeFieldType31.getName();
        org.joda.time.DateTime dateTime35 = dateTime21.withField(dateTimeFieldType31, 2021);
        org.joda.time.DateTime.Property property36 = dateTime4.property(dateTimeFieldType31);
        int int37 = property36.getMaximumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime4", (instant3.compareTo(dateTime4) == 0) == instant3.equals(dateTime4));
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 1);
        org.joda.time.Instant instant3 = instant1.minus(863999990L);
        org.joda.time.DateTime dateTime4 = instant1.toDateTime();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, periodType7, chronology12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', chronology12);
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
        org.joda.time.DateTime dateTime17 = property15.withMinimumValue();
        org.joda.time.DateTime.Property property18 = dateTime17.year();
        int int19 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime21 = dateTime17.withWeekyear(33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime4", (instant1.compareTo(dateTime4) == 0) == instant1.equals(dateTime4));
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Instant instant3 = instant1.plus(157784803200024L);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.Instant instant7 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration5, (int) '4');
        long long8 = duration5.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes2, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone10);
        int int12 = dateTime11.getDayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime11.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfYear();
        org.joda.time.DateTime dateTime16 = property15.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime18 = property15.addWrapFieldToCopy(1);
        boolean boolean19 = instant7.isBefore((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, periodType23, chronology28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) '4', chronology28);
        org.joda.time.ReadablePartial readablePartial31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.withFields(readablePartial31);
        boolean boolean33 = instant20.isAfter((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Period period35 = org.joda.time.Period.days((-1));
        org.joda.time.Period period37 = period35.withWeeks((int) 'a');
        org.joda.time.Period period39 = period35.plusMonths((int) (short) -1);
        org.joda.time.Period period41 = period35.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime42 = dateTime30.plus((org.joda.time.ReadablePeriod) period35);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = dateTime30.toDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.withMillisOfDay(3600010);
        org.joda.time.Duration duration47 = new org.joda.time.Duration((org.joda.time.ReadableInstant) instant7, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Duration duration49 = new org.joda.time.Duration((long) 60);
        long long50 = duration49.getStandardDays();
        org.joda.time.Instant instant52 = instant7.withDurationAdded((org.joda.time.ReadableDuration) duration49, (int) (byte) 1);
        org.joda.time.DateTime dateTime53 = instant52.toDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType54 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime56 = dateTime53.withFieldAdded(durationFieldType54, 3601);
        org.joda.time.DateTime.Property property57 = dateTime56.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant52 and dateTime53", (instant52.compareTo(dateTime53) == 0) == instant52.equals(dateTime53));
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology8);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withFields(readablePartial11);
        boolean boolean13 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Period period15 = org.joda.time.Period.days((-1));
        org.joda.time.Period period17 = period15.withWeeks((int) 'a');
        org.joda.time.Period period19 = period15.plusMonths((int) (short) -1);
        org.joda.time.Period period21 = period15.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime22 = dateTime10.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Instant instant23 = dateTime22.toInstant();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period34 = org.joda.time.Period.days((-1));
        org.joda.time.Period period36 = period34.withWeeks((int) 'a');
        java.lang.String str37 = period34.toString();
        mutablePeriod32.setPeriod((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Period period40 = period34.plusSeconds(2022);
        org.joda.time.Period period42 = period34.plusSeconds((int) (byte) -1);
        boolean boolean43 = instant23.equals((java.lang.Object) period42);
        org.joda.time.MutableDateTime mutableDateTime44 = instant23.toMutableDateTime();
        org.joda.time.Instant instant46 = instant23.minus((-128005664400000L));
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardMinutes(8640000000L);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = duration48.toPeriod(chronology49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Hours hours52 = org.joda.time.Hours.MIN_VALUE;
        org.joda.time.PeriodType periodType53 = hours52.getPeriodType();
        org.joda.time.Period period54 = duration48.toPeriodFrom(readableInstant51, periodType53);
        org.joda.time.Instant instant55 = instant46.plus((org.joda.time.ReadableDuration) duration48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant23", (dateTime22.compareTo(instant23) == 0) == dateTime22.equals(instant23));
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        int int6 = dateTime5.getSecondOfMinute();
        java.lang.String str8 = dateTime5.toString("+00:00");
        int int9 = dateTime5.getEra();
        org.joda.time.DateTime.Property property10 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime12 = property10.addToCopy((-187200000L));
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 1, periodType15, chronology20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', chronology20);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, periodType26, chronology31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', chronology31);
        org.joda.time.ReadablePartial readablePartial34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.withFields(readablePartial34);
        boolean boolean36 = instant23.isAfter((org.joda.time.ReadableInstant) dateTime33);
        boolean boolean37 = dateTime22.isAfter((org.joda.time.ReadableInstant) dateTime33);
        java.lang.String str38 = dateTime22.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType40 = dateTimeFieldType39.getRangeDurationType();
        int int41 = dateTime22.get(dateTimeFieldType39);
        boolean boolean42 = dateTime22.isBeforeNow();
        org.joda.time.DateTime dateTime43 = dateTime22.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight44 = dateTime43.toDateMidnight();
        org.joda.time.Chronology chronology45 = dateTime43.getChronology();
        org.joda.time.Interval interval46 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant23", (dateTime5.compareTo(instant23) == 0) == dateTime5.equals(instant23));
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        boolean boolean11 = dateTime0.isEqual((-124334351997544L));
        org.joda.time.Chronology chronology12 = dateTime0.getChronology();
        boolean boolean14 = dateTime0.isBefore(0L);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime0.getZone();
        org.joda.time.Chronology chronology16 = dateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.monthOfYear();
        long long21 = dateTimeField18.add(1645455013523L, 48);
        int int23 = dateTimeField18.getMinimumValue((-94800L));
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone25);
        int int27 = dateTime26.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime26.getZone();
        long long31 = dateTimeZone28.convertLocalToUTC(0L, true);
        org.joda.time.Instant instant32 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 1, periodType35, chronology40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) '4', chronology40);
        org.joda.time.ReadablePartial readablePartial43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.withFields(readablePartial43);
        boolean boolean45 = instant32.isAfter((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Period period47 = org.joda.time.Period.days((-1));
        org.joda.time.Period period49 = period47.withWeeks((int) 'a');
        org.joda.time.Period period51 = period47.plusMonths((int) (short) -1);
        org.joda.time.Period period53 = period47.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime54 = dateTime42.plus((org.joda.time.ReadablePeriod) period47);
        org.joda.time.LocalDateTime localDateTime55 = dateTime42.toLocalDateTime();
        boolean boolean56 = dateTimeZone28.isLocalDateTimeGap(localDateTime55);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone58);
        int int60 = dateTime59.getDayOfMonth();
        org.joda.time.DateTime dateTime62 = dateTime59.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property63 = dateTime62.dayOfYear();
        org.joda.time.DateTime dateTime64 = property63.roundHalfFloorCopy();
        java.util.Locale locale65 = null;
        int int66 = property63.getMaximumTextLength(locale65);
        java.lang.String str67 = property63.getName();
        boolean boolean68 = property63.isLeap();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = property63.getFieldType();
        boolean boolean70 = localDateTime55.isSupported(dateTimeFieldType69);
        int int71 = dateTimeField18.getMinimumValue((org.joda.time.ReadablePartial) localDateTime55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant32", (dateTime0.compareTo(instant32) == 0) == dateTime0.equals(instant32));
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.Instant instant6 = instant2.withDurationAdded((long) 24, 23);
        org.joda.time.Duration duration9 = new org.joda.time.Duration(86400007L, 0L);
        org.joda.time.Instant instant11 = instant6.withDurationAdded((org.joda.time.ReadableDuration) duration9, 2022);
        org.joda.time.Days days12 = duration9.toStandardDays();
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str19 = periodType18.getName();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (short) -1, periodType18);
        org.joda.time.Period period21 = new org.joda.time.Period(25245561600000L, 132539513932800000L, periodType18);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(419505L, 0L, periodType18);
        org.joda.time.Period period23 = new org.joda.time.Period((java.lang.Object) days12, periodType18);
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean34 = mutableInterval29.isBefore((org.joda.time.ReadableInterval) mutableInterval33);
        boolean boolean35 = mutableInterval26.contains((org.joda.time.ReadableInterval) mutableInterval33);
        mutableInterval26.setDurationAfterStart(0L);
        boolean boolean38 = mutableInterval26.containsNow();
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        long long44 = interval42.toDurationMillis();
        org.joda.time.Interval interval46 = interval42.withEndMillis((long) (short) 100);
        long long47 = interval42.toDurationMillis();
        boolean boolean48 = mutableInterval26.overlaps((org.joda.time.ReadableInterval) interval42);
        boolean boolean50 = interval42.contains((long) (-1));
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.MutableInterval mutableInterval56 = interval54.toMutableInterval();
        boolean boolean57 = interval42.contains((org.joda.time.ReadableInterval) interval54);
        org.joda.time.Duration duration58 = interval54.toDuration();
        org.joda.time.Duration duration59 = duration58.toDuration();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((-100982246399976L), 1672531200000L);
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.Chronology chronology70 = interval69.getChronology();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((long) 1, periodType65, chronology70);
        org.joda.time.DateTimeField dateTimeField72 = chronology70.yearOfCentury();
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval77 = mutableInterval76.toInterval();
        org.joda.time.Chronology chronology78 = interval77.getChronology();
        org.joda.time.DateTimeZone dateTimeZone79 = chronology78.getZone();
        java.lang.String str81 = dateTimeZone79.getName(100L);
        org.joda.time.DateTime dateTime82 = dateTime73.withZoneRetainFields(dateTimeZone79);
        org.joda.time.MutableInterval mutableInterval85 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval86 = mutableInterval85.toInterval();
        org.joda.time.Chronology chronology87 = interval86.getChronology();
        org.joda.time.DateTimeZone dateTimeZone88 = chronology87.getZone();
        java.lang.String str90 = dateTimeZone88.getName(100L);
        org.joda.time.DateTime dateTime91 = dateTime82.withZoneRetainFields(dateTimeZone88);
        org.joda.time.Chronology chronology92 = chronology70.withZone(dateTimeZone88);
        org.joda.time.DurationField durationField93 = chronology70.centuries();
        mutablePeriod62.setPeriod((long) 3, chronology70);
        org.joda.time.DurationField durationField95 = chronology70.millis();
        org.joda.time.Period period96 = duration58.toPeriod(chronology70);
        org.joda.time.DateTimeField dateTimeField97 = chronology70.dayOfMonth();
        org.joda.time.Period period98 = new org.joda.time.Period((long) 180, 1645455420331L, periodType18, chronology70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime73", (instant2.compareTo(dateTime73) == 0) == instant2.equals(dateTime73));
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 1, periodType13, chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) '4', chronology18);
        org.joda.time.ReadablePartial readablePartial21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.withFields(readablePartial21);
        boolean boolean23 = instant10.isAfter((org.joda.time.ReadableInstant) dateTime20);
        boolean boolean24 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Chronology chronology25 = dateTime9.getChronology();
        org.joda.time.DateTime dateTime28 = dateTime9.withDurationAdded((-61394288400000L), 947);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes(70);
        org.joda.time.DateTime.Property property31 = dateTime30.centuryOfEra();
        org.joda.time.Duration duration32 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration33 = duration32.toDuration();
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology38.getZone();
        org.joda.time.Period period40 = duration32.toPeriod(chronology38);
        org.joda.time.DurationField durationField41 = chronology38.seconds();
        org.joda.time.DateTime dateTime42 = dateTime30.withChronology(chronology38);
        org.joda.time.TimeOfDay timeOfDay43 = dateTime30.toTimeOfDay();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone45);
        int int47 = dateTime46.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean58 = mutableInterval53.isBefore((org.joda.time.ReadableInterval) mutableInterval57);
        boolean boolean59 = mutableInterval50.contains((org.joda.time.ReadableInterval) mutableInterval57);
        org.joda.time.Weeks weeks60 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval57);
        org.joda.time.DateTime dateTime61 = dateTime46.plus((org.joda.time.ReadablePeriod) weeks60);
        org.joda.time.DateTime dateTime63 = dateTime46.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property64 = dateTime46.secondOfDay();
        org.joda.time.DateTime dateTime66 = dateTime46.plusMillis((int) (short) 10);
        org.joda.time.DateTime.Property property67 = dateTime66.centuryOfEra();
        org.joda.time.DateTime dateTime68 = timeOfDay43.toDateTime((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval72 = mutableInterval71.toInterval();
        org.joda.time.Chronology chronology73 = interval72.getChronology();
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(chronology73);
        org.joda.time.DateTime dateTime76 = dateTime74.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime78 = dateTime76.plus((long) (short) -1);
        org.joda.time.DateTime dateTime81 = dateTime78.withDurationAdded((long) 100, (int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay82 = dateTime81.toTimeOfDay();
        org.joda.time.Days days83 = org.joda.time.Days.daysBetween((org.joda.time.ReadablePartial) timeOfDay43, (org.joda.time.ReadablePartial) timeOfDay82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime74", (instant10.compareTo(dateTime74) == 0) == instant10.equals(dateTime74));
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property15 = dateTime11.era();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Instant instant17 = dateTime16.toInstant();
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) instant17);
        org.joda.time.Instant instant20 = instant17.minus((long) 349200000);
        org.joda.time.DateTime dateTime21 = instant17.toDateTimeISO();
        long long22 = instant17.getMillis();
        org.joda.time.Instant instant23 = instant17.toInstant();
        org.joda.time.Duration duration26 = new org.joda.time.Duration((-100982246399976L), 604800000L);
        org.joda.time.Instant instant28 = instant23.withDurationAdded((org.joda.time.ReadableDuration) duration26, 57022);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant23", (dateTime16.compareTo(instant23) == 0) == dateTime16.equals(instant23));
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime2 = instant0.toDateTimeISO();
        int int3 = dateTime2.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        java.lang.Object obj0 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.Chronology chronology11 = interval10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 1, periodType6, chronology11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '4', chronology11);
        boolean boolean14 = periodType3.equals((java.lang.Object) chronology11);
        org.joda.time.Period period15 = new org.joda.time.Period(3600000L, periodType2, chronology11);
        org.joda.time.Interval interval16 = new org.joda.time.Interval(obj0, chronology11);
        org.joda.time.DurationField durationField17 = chronology11.millis();
        org.joda.time.DurationField durationField18 = chronology11.hours();
        org.joda.time.DurationField durationField19 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField17, and durationField18", !(durationField19.compareTo(durationField17) == 0) || (Math.signum(durationField19.compareTo(durationField18)) == Math.signum(durationField17.compareTo(durationField18))));
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property15 = dateTime11.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
        org.joda.time.DurationField durationField17 = property15.getDurationField();
        org.joda.time.DateTime dateTime18 = property15.roundCeilingCopy();
        org.joda.time.DateTime dateTime20 = dateTime18.minusSeconds(60);
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean31 = mutableInterval26.isBefore((org.joda.time.ReadableInterval) mutableInterval30);
        boolean boolean32 = mutableInterval23.contains((org.joda.time.ReadableInterval) mutableInterval30);
        org.joda.time.Weeks weeks33 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval30);
        org.joda.time.Weeks weeks34 = weeks33.negated();
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean45 = mutableInterval40.isBefore((org.joda.time.ReadableInterval) mutableInterval44);
        boolean boolean46 = mutableInterval37.contains((org.joda.time.ReadableInterval) mutableInterval44);
        org.joda.time.Weeks weeks47 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval44);
        org.joda.time.Weeks weeks48 = weeks47.negated();
        boolean boolean49 = weeks34.isGreaterThan(weeks48);
        org.joda.time.PeriodType periodType50 = weeks34.getPeriodType();
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadablePeriod) weeks34);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((java.lang.Object) dateTime18);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        org.joda.time.DateTimeZone dateTimeZone59 = chronology58.getZone();
        java.lang.String str61 = dateTimeZone59.getName(100L);
        org.joda.time.DateTime dateTime62 = dateTime53.withZoneRetainFields(dateTimeZone59);
        int int63 = dateTime62.getMinuteOfDay();
        org.joda.time.LocalDateTime localDateTime64 = dateTime62.toLocalDateTime();
        org.joda.time.DateTime dateTime65 = dateTime18.withFields((org.joda.time.ReadablePartial) localDateTime64);
        org.joda.time.DateTimeZone dateTimeZone66 = dateTime65.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant52", (dateTime18.compareTo(instant52) == 0) == dateTime18.equals(instant52));
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        int int9 = dateTime7.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone11);
        int int13 = dateTime12.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone17);
        int int19 = dateTime18.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean30 = mutableInterval25.isBefore((org.joda.time.ReadableInterval) mutableInterval29);
        boolean boolean31 = mutableInterval22.contains((org.joda.time.ReadableInterval) mutableInterval29);
        org.joda.time.Weeks weeks32 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval29);
        org.joda.time.DateTime dateTime33 = dateTime18.plus((org.joda.time.ReadablePeriod) weeks32);
        org.joda.time.DateTime dateTime35 = dateTime18.minusDays((int) (byte) 1);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 1, periodType38, chronology43);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) '4', chronology43);
        org.joda.time.ReadablePartial readablePartial46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.withFields(readablePartial46);
        org.joda.time.DateTime.Property property48 = dateTime47.millisOfDay();
        org.joda.time.DateTime dateTime50 = dateTime47.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property51 = dateTime47.era();
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime55 = dateTime47.withDurationAdded((org.joda.time.ReadableDuration) duration53, 0);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableDuration) duration53);
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        org.joda.time.Chronology chronology63 = interval62.getChronology();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) 1, periodType58, chronology63);
        org.joda.time.DateTimeField dateTimeField65 = chronology63.yearOfCentury();
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval70 = mutableInterval69.toInterval();
        org.joda.time.Chronology chronology71 = interval70.getChronology();
        org.joda.time.DateTimeZone dateTimeZone72 = chronology71.getZone();
        java.lang.String str74 = dateTimeZone72.getName(100L);
        org.joda.time.DateTime dateTime75 = dateTime66.withZoneRetainFields(dateTimeZone72);
        org.joda.time.MutableInterval mutableInterval78 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval79 = mutableInterval78.toInterval();
        org.joda.time.Chronology chronology80 = interval79.getChronology();
        org.joda.time.DateTimeZone dateTimeZone81 = chronology80.getZone();
        java.lang.String str83 = dateTimeZone81.getName(100L);
        org.joda.time.DateTime dateTime84 = dateTime75.withZoneRetainFields(dateTimeZone81);
        org.joda.time.Chronology chronology85 = chronology63.withZone(dateTimeZone81);
        org.joda.time.Period period86 = duration53.toPeriod(chronology85);
        org.joda.time.DateTime dateTime87 = new org.joda.time.DateTime(4838400100L, chronology85);
        org.joda.time.DateTime dateTime89 = dateTime87.plusMillis(26);
        int int90 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) dateTime89);
        java.util.TimeZone timeZone91 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone92 = org.joda.time.DateTimeZone.forTimeZone(timeZone91);
        org.joda.time.DateTimeZone dateTimeZone93 = org.joda.time.DateTimeZone.forTimeZone(timeZone91);
        org.joda.time.DateTime dateTime94 = dateTime7.toDateTime(dateTimeZone93);
        java.util.TimeZone timeZone95 = dateTimeZone93.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime94", (dateTime7.compareTo(dateTime94) == 0) == dateTime7.equals(dateTime94));
    }
}

