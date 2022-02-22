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
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime5 = dateTime2.plusMillis((int) '#');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        org.joda.time.DateTime dateTime8 = dateTime5.toDateTime(dateTimeZone7);
        org.joda.time.TimeOfDay timeOfDay9 = dateTime5.toTimeOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone11);
        int int13 = dateTime12.getDayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime12.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime17 = dateTime15.withYear(0);
        org.joda.time.Chronology chronology18 = dateTime15.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int20 = dateTime15.get(dateTimeFieldType19);
        boolean boolean21 = timeOfDay9.isSupported(dateTimeFieldType19);
        java.lang.String str22 = dateTimeFieldType19.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime8", (dateTime5.compareTo(dateTime8) == 0) == dateTime5.equals(dateTime8));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
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
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) 1, periodType53, chronology58);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) '4', chronology58);
        org.joda.time.Instant instant61 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 1, periodType64, chronology69);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) '4', chronology69);
        org.joda.time.ReadablePartial readablePartial72 = null;
        org.joda.time.DateTime dateTime73 = dateTime71.withFields(readablePartial72);
        boolean boolean74 = instant61.isAfter((org.joda.time.ReadableInstant) dateTime71);
        boolean boolean75 = dateTime60.isAfter((org.joda.time.ReadableInstant) dateTime71);
        java.lang.String str76 = dateTime60.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType78 = dateTimeFieldType77.getRangeDurationType();
        int int79 = dateTime60.get(dateTimeFieldType77);
        boolean boolean80 = dateTime60.isBeforeNow();
        org.joda.time.DateTime dateTime81 = dateTime60.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight82 = dateTime81.toDateMidnight();
        boolean boolean83 = dateTime36.isAfter((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.DateTime dateTime85 = dateTime36.minusWeeks(3600010);
        org.joda.time.DateTime.Property property86 = dateTime85.millisOfDay();
        org.joda.time.DurationField durationField87 = property86.getRangeDurationField();
        org.joda.time.DateTime dateTime88 = property86.roundHalfCeilingCopy();
        org.joda.time.Instant instant89 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology90 = instant89.getChronology();
        org.joda.time.DateTimeField dateTimeField91 = chronology90.hourOfHalfday();
        org.joda.time.DateTime dateTime92 = dateTime88.withChronology(chronology90);
        org.joda.time.Interval interval93 = duration23.toIntervalTo((org.joda.time.ReadableInstant) dateTime92);
        org.joda.time.Period period95 = org.joda.time.Period.hours(22);
        org.joda.time.Period period97 = period95.withHours(83400);
        org.joda.time.Duration duration98 = period95.toStandardDuration();
        boolean boolean99 = duration23.isLongerThan((org.joda.time.ReadableDuration) duration98);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime85 and dateTime92", (dateTime85.compareTo(dateTime92) == 0) == dateTime85.equals(dateTime92));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.DateTime.Property property12 = dateTime11.era();
        org.joda.time.DateTime dateTime14 = dateTime11.minusYears((int) '#');
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType18 = null;
        int int19 = minutes17.get(durationFieldType18);
        int int21 = minutes17.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod22 = minutes17.toMutablePeriod();
        boolean boolean23 = minutes15.isLessThan(minutes17);
        org.joda.time.PeriodType periodType24 = minutes15.getPeriodType();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant0, (org.joda.time.ReadableInstant) dateTime14, periodType24);
        org.joda.time.MutableDateTime mutableDateTime26 = instant0.toMutableDateTimeISO();
        boolean boolean28 = instant0.isEqual(31622402022L);
        org.joda.time.Instant instant30 = instant0.withMillis((-6380816000400000L));
        org.joda.time.Chronology chronology31 = instant0.getChronology();
        org.joda.time.Chronology chronology32 = instant0.getChronology();
        org.joda.time.Instant instant35 = instant0.withDurationAdded((-349196400L), 0);
        org.joda.time.Instant instant37 = instant0.plus((long) (-1438323));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime26 and instant0", (mutableDateTime26.compareTo(instant0) == 0) == mutableDateTime26.equals(instant0));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
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
        org.joda.time.Instant instant43 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration14, 49);
        org.joda.time.MutableDateTime mutableDateTime44 = instant0.toMutableDateTimeISO();
        org.joda.time.Instant instant45 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 1, periodType48, chronology53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) '4', chronology53);
        org.joda.time.ReadablePartial readablePartial56 = null;
        org.joda.time.DateTime dateTime57 = dateTime55.withFields(readablePartial56);
        boolean boolean58 = instant45.isAfter((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTime.Property property59 = dateTime55.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone61);
        int int63 = dateTime62.getDayOfMonth();
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.Chronology chronology70 = interval69.getChronology();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((long) 1, periodType65, chronology70);
        org.joda.time.DateTimeField dateTimeField72 = chronology70.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone73 = chronology70.getZone();
        org.joda.time.DateTime dateTime74 = dateTime62.withZoneRetainFields(dateTimeZone73);
        org.joda.time.DateTime dateTime75 = dateTime55.withZone(dateTimeZone73);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = null;
        java.lang.String str77 = dateTime55.toString(dateTimeFormatter76);
        org.joda.time.Seconds seconds78 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) mutableDateTime44, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Weeks weeks79 = seconds78.toStandardWeeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime44", (instant0.compareTo(mutableDateTime44) == 0) == instant0.equals(mutableDateTime44));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
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
        org.joda.time.DateTimeField dateTimeField26 = chronology25.millisOfDay();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.year();
        org.joda.time.Instant instant28 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Instant instant31 = instant28.withDurationAdded(readableDuration29, 10);
        org.joda.time.Instant instant34 = instant28.withDurationAdded((-54432000000L), 3);
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
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone51);
        int int53 = dateTime52.getDayOfMonth();
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.Chronology chronology60 = interval59.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 1, periodType55, chronology60);
        org.joda.time.DateTimeField dateTimeField62 = chronology60.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone63 = chronology60.getZone();
        org.joda.time.DateTime dateTime64 = dateTime52.withZoneRetainFields(dateTimeZone63);
        org.joda.time.DateTime dateTime65 = dateTime45.withZone(dateTimeZone63);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime65, (org.joda.time.ReadableDuration) duration67);
        boolean boolean69 = instant34.isBefore((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.Instant instant71 = instant34.withMillis((long) 22);
        org.joda.time.DateTime dateTime72 = instant71.toDateTimeISO();
        org.joda.time.Period period73 = org.joda.time.Period.ZERO;
        org.joda.time.Hours hours74 = period73.toStandardHours();
        org.joda.time.Period period76 = period73.minusYears(82800052);
        org.joda.time.DateTime dateTime77 = dateTime72.minus((org.joda.time.ReadablePeriod) period76);
        long long78 = dateTime72.getMillis();
        org.joda.time.YearMonthDay yearMonthDay79 = dateTime72.toYearMonthDay();
        java.util.Locale locale80 = null;
        java.lang.String str81 = dateTimeField27.getAsText((org.joda.time.ReadablePartial) yearMonthDay79, locale80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant71 and dateTime72", (instant71.compareTo(dateTime72) == 0) == instant71.equals(dateTime72));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.Period period8 = new org.joda.time.Period(0, 49, 100, (int) (byte) 100, (int) (short) 100, (int) (byte) 100, (-3600000), 3600);
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.Instant instant11 = instant9.minus(100L);
        org.joda.time.DateTime dateTime12 = instant11.toDateTimeISO();
        int int13 = dateTime12.getYear();
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
        org.joda.time.Duration duration45 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Duration duration46 = period8.toDurationFrom((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime48 = dateTime12.plusMillis(69);
        org.joda.time.DateTime.Property property49 = dateTime48.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime12", (instant11.compareTo(dateTime12) == 0) == instant11.equals(dateTime12));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime10 = dateTime9.toLocalDateTime();
        org.joda.time.Instant instant12 = new org.joda.time.Instant((-61393935600000L));
        org.joda.time.DateTime dateTime13 = instant12.toDateTimeISO();
        org.joda.time.Instant instant14 = instant12.toInstant();
        org.joda.time.Days days15 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) instant14);
        org.joda.time.PeriodType periodType16 = days15.getPeriodType();
        java.lang.String str17 = periodType16.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime13", (instant12.compareTo(dateTime13) == 0) == instant12.equals(dateTime13));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
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
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone32);
        int int34 = dateTime33.getDayOfMonth();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, periodType36, chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology41.getZone();
        org.joda.time.DateTime dateTime45 = dateTime33.withZoneRetainFields(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = dateTime26.withZone(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = dateTime46.toDateTime(dateTimeZone47);
        org.joda.time.Days days49 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime48);
        int int50 = dateTime15.getMillisOfSecond();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.DateTime dateTime52 = dateTime15.minus(readableDuration51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime();
        org.joda.time.Instant instant54 = dateTime53.toInstant();
        org.joda.time.TimeOfDay timeOfDay55 = dateTime53.toTimeOfDay();
        org.joda.time.Instant instant56 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology57 = instant56.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.yearOfEra();
        org.joda.time.DurationField durationField59 = dateTimeField58.getLeapDurationField();
        java.util.Locale locale62 = null;
        long long63 = dateTimeField58.set(75736684800000L, "1969", locale62);
        long long65 = dateTimeField58.roundCeiling((-829L));
        org.joda.time.DurationField durationField66 = dateTimeField58.getDurationField();
        java.lang.String str68 = dateTimeField58.getAsText(1645513200000L);
        boolean boolean69 = timeOfDay55.equals((java.lang.Object) str68);
        org.joda.time.DateTime dateTime70 = dateTime15.withFields((org.joda.time.ReadablePartial) timeOfDay55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime53", (instant0.compareTo(dateTime53) == 0) == instant0.equals(dateTime53));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTime2.getZone();
        boolean boolean6 = dateTime2.isBefore(164096150400000L);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 1, periodType9, chronology14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) '4', chronology14);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, periodType19, chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', chronology24);
        org.joda.time.ReadablePartial readablePartial27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withFields(readablePartial27);
        org.joda.time.DateTime.Property property29 = dateTime28.millisOfDay();
        org.joda.time.DateTime dateTime30 = dateTime28.withEarlierOffsetAtOverlap();
        int int31 = dateTime28.getDayOfWeek();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 1, periodType33, chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone41 = chronology38.getZone();
        org.joda.time.DateTime dateTime42 = dateTime28.withChronology(chronology38);
        org.joda.time.DateTime dateTime44 = dateTime42.plusDays((int) (byte) 1);
        boolean boolean45 = dateTime16.isEqual((org.joda.time.ReadableInstant) dateTime42);
        int int46 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime48 = dateTime2.withMillisOfSecond(0);
        org.joda.time.DateTime.Property property49 = dateTime2.year();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale54 = null;
        java.lang.String str55 = dateTimeZone52.getName(164096150400000L, locale54);
        org.joda.time.Interval interval56 = new org.joda.time.Interval((-6380816000400000L), 3599902L, dateTimeZone52);
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime2.toMutableDateTime(dateTimeZone52);
        int int59 = dateTimeZone52.getOffset(1530512236800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and mutableDateTime57", (dateTime2.compareTo(mutableDateTime57) == 0) == dateTime2.equals(mutableDateTime57));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration1 = duration0.toDuration();
        org.joda.time.Instant instant2 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, 10);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((-54432000000L), 3);
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, periodType12, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', chronology17);
        org.joda.time.ReadablePartial readablePartial20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withFields(readablePartial20);
        boolean boolean22 = instant9.isAfter((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime.Property property23 = dateTime19.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone25);
        int int27 = dateTime26.getDayOfMonth();
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone37 = chronology34.getZone();
        org.joda.time.DateTime dateTime38 = dateTime26.withZoneRetainFields(dateTimeZone37);
        org.joda.time.DateTime dateTime39 = dateTime19.withZone(dateTimeZone37);
        org.joda.time.Duration duration41 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableDuration) duration41);
        boolean boolean43 = instant8.isBefore((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Period period44 = duration1.toPeriodTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.Interval interval50 = interval48.toInterval();
        org.joda.time.Duration duration52 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval53 = interval50.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration52);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.Chronology chronology60 = interval59.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 1, periodType55, chronology60);
        org.joda.time.Period period64 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType65 = period64.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType65);
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval74 = mutableInterval73.toInterval();
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean78 = mutableInterval73.isBefore((org.joda.time.ReadableInterval) mutableInterval77);
        boolean boolean79 = mutableInterval70.contains((org.joda.time.ReadableInterval) mutableInterval77);
        org.joda.time.Weeks weeks80 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval77);
        long long81 = mutableInterval77.getEndMillis();
        org.joda.time.DateTime dateTime82 = mutableInterval77.getEnd();
        org.joda.time.Chronology chronology83 = mutableInterval77.getChronology();
        mutablePeriod66.add(355200035L, chronology83);
        org.joda.time.DurationField durationField85 = chronology83.halfdays();
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime((java.lang.Object) periodType55, chronology83);
        boolean boolean87 = interval53.isAfter((org.joda.time.ReadableInstant) dateTime86);
        org.joda.time.DateTime dateTime88 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime89 = dateTime88.toDateTimeISO();
        org.joda.time.PeriodType periodType90 = null;
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime86, (org.joda.time.ReadableInstant) dateTime89, periodType90);
        org.joda.time.Interval interval92 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.DateMidnight dateMidnight93 = dateTime89.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime86", (instant2.compareTo(dateTime86) == 0) == instant2.equals(dateTime86));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
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
        org.joda.time.DateTime dateTime32 = dateTime26.plusSeconds(82800010);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((java.lang.Object) dateTime32);
        org.joda.time.DateTime.Property property34 = dateTime32.secondOfMinute();
        org.joda.time.DateTime dateTime36 = dateTime32.withMinuteOfHour(34);
        int int37 = dateTime36.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and instant33", (dateTime32.compareTo(instant33) == 0) == dateTime32.equals(instant33));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
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
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant1", (dateTime14.compareTo(instant1) == 0) == dateTime14.equals(instant1));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
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
        org.joda.time.DateTime dateTime41 = dateTime38.withDayOfMonth(10);
        org.joda.time.DateTime dateTime43 = dateTime41.minusWeeks(43200000);
        org.joda.time.Instant instant44 = dateTime41.toInstant();
        org.joda.time.Chronology chronology45 = instant44.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and instant44", (dateTime41.compareTo(instant44) == 0) == dateTime41.equals(instant44));
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
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime19 = dateTime11.withDurationAdded((org.joda.time.ReadableDuration) duration17, 0);
        int int20 = dateTime19.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        long long27 = dateTimeZone23.convertLocalToUTC(355200035L, false, (long) (byte) 100);
        boolean boolean29 = dateTimeZone23.isStandardOffset((long) (short) 100);
        org.joda.time.DateTime dateTime30 = dateTime19.toDateTime(dateTimeZone23);
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.Interval interval36 = interval34.toInterval();
        org.joda.time.Duration duration38 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval39 = interval36.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration38);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 1, periodType42, chronology47);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) '4', chronology47);
        org.joda.time.ReadablePartial readablePartial50 = null;
        org.joda.time.DateTime dateTime51 = dateTime49.withFields(readablePartial50);
        org.joda.time.DateTime.Property property52 = dateTime51.millisOfDay();
        org.joda.time.DateTime dateTime54 = dateTime51.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime56 = dateTime51.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours57 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours58 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours59 = hours57.minus(hours58);
        org.joda.time.Duration duration60 = hours58.toStandardDuration();
        org.joda.time.DateTime dateTime61 = dateTime51.plus((org.joda.time.ReadableDuration) duration60);
        org.joda.time.Duration duration62 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration63 = duration62.toDuration();
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.Chronology chronology68 = interval67.getChronology();
        org.joda.time.DateTimeZone dateTimeZone69 = chronology68.getZone();
        org.joda.time.Period period70 = duration62.toPeriod(chronology68);
        boolean boolean71 = duration60.isShorterThan((org.joda.time.ReadableDuration) duration62);
        long long72 = duration60.getStandardHours();
        org.joda.time.Interval interval73 = interval36.withDurationAfterStart((org.joda.time.ReadableDuration) duration60);
        org.joda.time.Hours hours74 = org.joda.time.Hours.MIN_VALUE;
        org.joda.time.PeriodType periodType75 = hours74.getPeriodType();
        org.joda.time.PeriodType periodType76 = hours74.getPeriodType();
        org.joda.time.Period period77 = duration60.toPeriod(periodType76);
        org.joda.time.DateTime dateTime78 = dateTime30.plus((org.joda.time.ReadableDuration) duration60);
        org.joda.time.DateTime dateTime80 = dateTime78.withMillisOfDay(3599);
        int int81 = dateTime80.getEra();
        int int82 = dateTime80.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime30", (dateTime9.compareTo(dateTime30) == 0) == dateTime9.equals(dateTime30));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfDay();
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
        org.joda.time.DateTime dateTime7 = property4.withMaximumValue();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 1, periodType10, chronology15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', chronology15);
        org.joda.time.ReadablePartial readablePartial18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withFields(readablePartial18);
        org.joda.time.DateTime dateTime21 = dateTime17.withDayOfMonth(5);
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
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, periodType47, chronology52);
        org.joda.time.DateTimeField dateTimeField54 = chronology52.hourOfHalfday();
        long long57 = dateTimeField54.getDifferenceAsLong((long) 10, (long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone59);
        int int61 = dateTime60.getSecondOfMinute();
        org.joda.time.DateTime dateTime63 = dateTime60.withMinuteOfHour(10);
        org.joda.time.TimeOfDay timeOfDay64 = dateTime63.toTimeOfDay();
        int[] intArray71 = new int[] { '4', 1970, 10, (byte) 10, 24, 50 };
        int int72 = dateTimeField54.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay64, intArray71);
        org.joda.time.DateTime dateTime73 = dateTime42.withFields((org.joda.time.ReadablePartial) timeOfDay64);
        org.joda.time.MutableDateTime mutableDateTime74 = dateTime42.toMutableDateTime();
        org.joda.time.Period period76 = new org.joda.time.Period((long) 100);
        int int77 = period76.getDays();
        org.joda.time.MutableInterval mutableInterval80 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval81 = mutableInterval80.toInterval();
        org.joda.time.Chronology chronology82 = interval81.getChronology();
        org.joda.time.MutableInterval mutableInterval83 = interval81.toMutableInterval();
        org.joda.time.DateTime dateTime84 = interval81.getEnd();
        org.joda.time.MutableInterval mutableInterval85 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period76, (org.joda.time.ReadableInstant) dateTime84);
        boolean boolean86 = dateTime42.isAfter((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.Hours hours87 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime88 = new org.joda.time.DateTime();
        org.joda.time.Instant instant89 = dateTime88.toInstant();
        org.joda.time.MutableInterval mutableInterval90 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableInstant) dateTime88);
        int int91 = property4.compareTo((org.joda.time.ReadableInstant) dateTime88);
        int int92 = property4.getMinimumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime88 and instant89", (dateTime88.compareTo(instant89) == 0) == dateTime88.equals(instant89));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType1 = period0.getPeriodType();
        org.joda.time.Period period3 = period0.withMonths((int) (byte) 0);
        org.joda.time.Period period4 = period0.toPeriod();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.minusSeconds((int) (byte) 0);
        org.joda.time.Period period8 = period7.toPeriod();
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        int int12 = minutes10.get(durationFieldType11);
        int int14 = minutes10.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod15 = minutes10.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType17 = minutes10.getFieldType(0);
        org.joda.time.Duration duration18 = minutes10.toStandardDuration();
        org.joda.time.PeriodType periodType19 = minutes10.getPeriodType();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType22);
        mutablePeriod23.setMonths((int) (byte) -1);
        mutablePeriod23.setPeriod(366, (int) (short) 0, 49, 0, (int) (byte) 0, 22, (int) (short) 0, 3600010);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone38);
        int int40 = dateTime39.getSecondOfMinute();
        int int41 = dateTime39.getMillisOfDay();
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
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime39.toMutableDateTime(chronology55);
        mutablePeriod23.setPeriod(100L, (long) 49, chronology55);
        org.joda.time.DateTimeField dateTimeField61 = chronology55.dayOfWeek();
        org.joda.time.Period period62 = new org.joda.time.Period((java.lang.Object) period8, periodType19, chronology55);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(chronology55);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale66 = null;
        java.lang.String str67 = dateTimeZone64.getShortName(1767225600377L, locale66);
        org.joda.time.DateTime dateTime68 = dateTime63.withZone(dateTimeZone64);
        long long71 = dateTimeZone64.convertLocalToUTC(0L, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime63 and dateTime68", (dateTime63.compareTo(dateTime68) == 0) == dateTime63.equals(dateTime68));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
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
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', chronology34);
        org.joda.time.DurationField durationField37 = chronology34.centuries();
        mutablePeriod8.add((long) (short) 10, chronology34);
        org.joda.time.Chronology chronology39 = chronology34.withUTC();
        org.joda.time.DurationField durationField40 = chronology39.centuries();
        org.joda.time.DurationField durationField41 = chronology39.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField37 and durationField40", (durationField37.compareTo(durationField40) == 0) == durationField37.equals(durationField40));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
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
        int int19 = dateTime18.getMillisOfDay();
        java.util.Date date20 = dateTime18.toDate();
        org.joda.time.Interval interval21 = interval3.withEnd((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.ReadableInstant readableInstant22 = null;
        boolean boolean23 = interval21.isBefore(readableInstant22);
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean34 = mutableInterval29.isBefore((org.joda.time.ReadableInterval) mutableInterval33);
        boolean boolean35 = mutableInterval26.contains((org.joda.time.ReadableInterval) mutableInterval33);
        org.joda.time.Weeks weeks36 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval33);
        long long37 = mutableInterval33.getEndMillis();
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean48 = mutableInterval43.isBefore((org.joda.time.ReadableInterval) mutableInterval47);
        boolean boolean49 = mutableInterval40.contains((org.joda.time.ReadableInterval) mutableInterval47);
        mutableInterval33.setInterval((org.joda.time.ReadableInterval) mutableInterval47);
        org.joda.time.Duration duration51 = mutableInterval33.toDuration();
        java.lang.String str52 = mutableInterval33.toString();
        boolean boolean53 = interval21.isBefore((org.joda.time.ReadableInterval) mutableInterval33);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.Chronology chronology61 = interval60.getChronology();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) 1, periodType56, chronology61);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) '4', chronology61);
        org.joda.time.ReadablePartial readablePartial64 = null;
        org.joda.time.DateTime dateTime65 = dateTime63.withFields(readablePartial64);
        org.joda.time.DateTime.Property property66 = dateTime65.millisOfDay();
        org.joda.time.DateTime dateTime67 = dateTime65.withEarlierOffsetAtOverlap();
        int int68 = dateTime65.getDayOfWeek();
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval74 = mutableInterval73.toInterval();
        org.joda.time.Chronology chronology75 = interval74.getChronology();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((long) 1, periodType70, chronology75);
        org.joda.time.DateTimeField dateTimeField77 = chronology75.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone78 = chronology75.getZone();
        org.joda.time.DateTime dateTime79 = dateTime65.withChronology(chronology75);
        org.joda.time.DateTime dateTime80 = dateTime65.withEarlierOffsetAtOverlap();
        org.joda.time.Period period81 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType82 = period81.getPeriodType();
        org.joda.time.Period period84 = period81.withMonths((int) (byte) 0);
        org.joda.time.Period period85 = period81.toPeriod();
        org.joda.time.DateTime dateTime87 = dateTime80.withPeriodAdded((org.joda.time.ReadablePeriod) period85, (int) (byte) 0);
        org.joda.time.Period period89 = org.joda.time.Period.minutes(49);
        org.joda.time.DateTime dateTime90 = dateTime80.minus((org.joda.time.ReadablePeriod) period89);
        org.joda.time.Instant instant91 = dateTime90.toInstant();
        boolean boolean92 = mutableInterval33.isAfter((org.joda.time.ReadableInstant) instant91);
        org.joda.time.Chronology chronology93 = instant91.getChronology();
        org.joda.time.DurationField durationField94 = chronology93.millis();
        boolean boolean95 = durationField94.isPrecise();
        long long96 = durationField94.getUnitMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime90 and instant91", (dateTime90.compareTo(instant91) == 0) == dateTime90.equals(instant91));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.Period period5 = new org.joda.time.Period(1672531199993L, (long) '4', chronology4);
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((-62128666800000L), chronology4);
        int int7 = mutablePeriod6.getWeeks();
        org.joda.time.Period period8 = mutablePeriod6.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) 52);
        org.joda.time.Days days12 = org.joda.time.Days.FOUR;
        mutablePeriod11.setPeriod((org.joda.time.ReadablePeriod) days12);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.seconds();
        mutablePeriod11.set(durationFieldType14, (-90));
        mutablePeriod11.addMinutes(7);
        mutablePeriod11.clear();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology25.getZone();
        java.lang.String str28 = dateTimeZone26.getName(100L);
        org.joda.time.DateTime dateTime29 = dateTime20.withZoneRetainFields(dateTimeZone26);
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.DateTimeZone dateTimeZone35 = chronology34.getZone();
        java.lang.String str37 = dateTimeZone35.getName(100L);
        org.joda.time.DateTime dateTime38 = dateTime29.withZoneRetainFields(dateTimeZone35);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        mutablePeriod47.add((long) 3);
        org.joda.time.DateTime dateTime50 = dateTime29.minus((org.joda.time.ReadablePeriod) mutablePeriod47);
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod47);
        mutablePeriod47.setValue(7, 271323);
        org.joda.time.DurationFieldType durationFieldType56 = mutablePeriod47.getFieldType(0);
        java.lang.String str57 = durationFieldType56.toString();
        int int58 = mutablePeriod6.indexOf(durationFieldType56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime20", (instant3.compareTo(dateTime20) == 0) == instant3.equals(dateTime20));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
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
        java.lang.String str35 = dateTimeZone28.getName(352800030L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime33", (instant0.compareTo(dateTime33) == 0) == instant0.equals(dateTime33));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
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
        org.joda.time.DateTime dateTime18 = dateTime16.plusDays((int) (byte) -1);
        org.joda.time.DateTime dateTime20 = dateTime18.withCenturyOfEra(800);
        org.joda.time.DateTime dateTime22 = dateTime20.withYear(1439);
        org.joda.time.DateTime dateTime24 = dateTime22.plusMonths(95);
        org.joda.time.DateTime dateTime25 = dateTime22.toDateTime();
        java.lang.String str26 = dateTime25.toString();
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 1, periodType28, chronology33);
        org.joda.time.DateTimeField dateTimeField35 = chronology33.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone36 = chronology33.getZone();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.minuteOfHour();
        org.joda.time.Chronology chronology38 = chronology33.withUTC();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.dayOfYear();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.hourOfDay();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((java.lang.Object) str26, chronology38);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone44);
        int int46 = dateTime45.getDayOfMonth();
        org.joda.time.DateTime dateTime48 = dateTime45.withMillisOfDay((int) 'a');
        org.joda.time.LocalDateTime localDateTime49 = dateTime45.toLocalDateTime();
        java.lang.String str50 = localDateTime49.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = localDateTime49.getFieldType(1);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone54);
        int int56 = dateTime55.getDayOfMonth();
        org.joda.time.DateTime dateTime58 = dateTime55.withMillisOfDay((int) 'a');
        org.joda.time.LocalDateTime localDateTime59 = dateTime55.toLocalDateTime();
        java.lang.String str60 = localDateTime59.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = localDateTime59.getFieldType(1);
        org.joda.time.Seconds seconds63 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadablePartial) localDateTime49, (org.joda.time.ReadablePartial) localDateTime59);
        long long65 = chronology38.set((org.joda.time.ReadablePartial) localDateTime59, 352800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime42", (dateTime22.compareTo(dateTime42) == 0) == dateTime22.equals(dateTime42));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType1 = period0.getPeriodType();
        org.joda.time.Period period3 = period0.withMonths((int) (byte) 0);
        org.joda.time.Period period4 = period0.toPeriod();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.minusSeconds((int) (byte) 0);
        org.joda.time.Period period9 = period4.withDays(5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone10.getName(164096150400000L, locale12);
        java.util.TimeZone timeZone14 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period27 = org.joda.time.Period.days((-1));
        org.joda.time.Period period29 = period27.withWeeks((int) 'a');
        java.lang.String str30 = period27.toString();
        mutablePeriod25.setPeriod((org.joda.time.ReadablePeriod) period27);
        mutablePeriod25.addMonths((int) (short) -1);
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
        org.joda.time.Minutes minutes63 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType64 = null;
        int int65 = minutes63.get(durationFieldType64);
        int int67 = minutes63.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod68 = minutes63.toMutablePeriod();
        long long71 = chronology57.add((org.joda.time.ReadablePeriod) mutablePeriod68, (long) '#', (int) (short) 10);
        mutablePeriod25.setPeriod((long) (short) 100, (long) 2, chronology57);
        org.joda.time.DurationField durationField73 = chronology57.months();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval80 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval81 = mutableInterval80.toInterval();
        org.joda.time.Chronology chronology82 = interval81.getChronology();
        org.joda.time.DateTimeZone dateTimeZone83 = chronology82.getZone();
        java.lang.String str85 = dateTimeZone83.getName(100L);
        org.joda.time.DateTime dateTime86 = dateTime77.withZoneRetainFields(dateTimeZone83);
        long long88 = dateTimeZone76.getMillisKeepLocal(dateTimeZone83, 6000035L);
        org.joda.time.Chronology chronology89 = chronology57.withZone(dateTimeZone83);
        org.joda.time.DateTime dateTime90 = new org.joda.time.DateTime(chronology57);
        org.joda.time.DateTime dateTime92 = dateTime90.minusDays(11);
        org.joda.time.DateTime dateTime94 = dateTime90.withMillisOfDay(19);
        org.joda.time.MutablePeriod mutablePeriod95 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime94);
        org.joda.time.Interval interval96 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period4, (org.joda.time.ReadableInstant) dateTime94);
        java.lang.String str97 = interval96.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime77", (dateTime16.compareTo(dateTime77) == 0) == dateTime16.equals(dateTime77));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        boolean boolean6 = instant5.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone8);
        int int10 = dateTime9.getDayOfMonth();
        org.joda.time.DateTime dateTime12 = dateTime9.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfYear();
        org.joda.time.DateTime dateTime14 = property13.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime16 = property13.addWrapFieldToCopy(1);
        org.joda.time.Days days17 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) instant5, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Instant instant18 = instant5.toInstant();
        org.joda.time.Period period21 = new org.joda.time.Period((long) (-82528), (-261291562552799948L));
        org.joda.time.Period period22 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType23 = period22.getPeriodType();
        org.joda.time.Period period25 = period22.withMonths((int) (byte) 0);
        org.joda.time.Period period26 = period22.toPeriod();
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Period period29 = period26.minusSeconds((int) (byte) 0);
        org.joda.time.Period period30 = period29.toPeriod();
        org.joda.time.Minutes minutes32 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType33 = null;
        int int34 = minutes32.get(durationFieldType33);
        int int36 = minutes32.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod37 = minutes32.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType39 = minutes32.getFieldType(0);
        org.joda.time.Duration duration40 = minutes32.toStandardDuration();
        org.joda.time.PeriodType periodType41 = minutes32.getPeriodType();
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType44);
        mutablePeriod45.setMonths((int) (byte) -1);
        mutablePeriod45.setPeriod(366, (int) (short) 0, 49, 0, (int) (byte) 0, 22, (int) (short) 0, 3600010);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone60);
        int int62 = dateTime61.getSecondOfMinute();
        int int63 = dateTime61.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone65);
        int int67 = dateTime66.getMillisOfDay();
        org.joda.time.DateTime dateTime69 = dateTime66.plusMillis((int) '#');
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval76 = mutableInterval75.toInterval();
        org.joda.time.Chronology chronology77 = interval76.getChronology();
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((long) 1, periodType72, chronology77);
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((long) '4', chronology77);
        org.joda.time.DateTime dateTime80 = dateTime69.withChronology(chronology77);
        org.joda.time.MutableDateTime mutableDateTime81 = dateTime61.toMutableDateTime(chronology77);
        mutablePeriod45.setPeriod(100L, (long) 49, chronology77);
        org.joda.time.DateTimeField dateTimeField83 = chronology77.dayOfWeek();
        org.joda.time.Period period84 = new org.joda.time.Period((java.lang.Object) period30, periodType41, chronology77);
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime(chronology77);
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime((java.lang.Object) (-261291562552799948L), chronology77);
        org.joda.time.DateTime.Property property87 = dateTime86.secondOfMinute();
        org.joda.time.Period period89 = org.joda.time.Period.weeks(5700010);
        org.joda.time.Period period91 = period89.minusMonths(376);
        org.joda.time.MutableInterval mutableInterval92 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime86, (org.joda.time.ReadablePeriod) period89);
        org.joda.time.Duration duration93 = new org.joda.time.Duration((org.joda.time.ReadableInstant) instant18, (org.joda.time.ReadableInstant) dateTime86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant18", (dateTime2.compareTo(instant18) == 0) == dateTime2.equals(instant18));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval9.setInterval((-80867997L), 271254L);
        org.joda.time.Period period16 = mutableInterval9.toPeriod();
        org.joda.time.Interval interval17 = mutableInterval9.toInterval();
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant21 = instant18.withDurationAdded(readableDuration19, 10);
        org.joda.time.Instant instant22 = instant21.toInstant();
        org.joda.time.DateTime dateTime23 = instant21.toDateTime();
        boolean boolean24 = interval17.contains((org.joda.time.ReadableInstant) dateTime23);
        java.lang.String str25 = interval17.toString();
        java.lang.String str26 = interval17.toString();
        long long27 = interval17.getStartMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and dateTime23", (instant18.compareTo(dateTime23) == 0) == instant18.equals(dateTime23));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 10);
        org.joda.time.Instant instant6 = instant0.withDurationAdded((-54432000000L), 3);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 1, periodType10, chronology15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', chronology15);
        org.joda.time.ReadablePartial readablePartial18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withFields(readablePartial18);
        boolean boolean20 = instant7.isAfter((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime.Property property21 = dateTime17.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone23);
        int int25 = dateTime24.getDayOfMonth();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, periodType27, chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone35 = chronology32.getZone();
        org.joda.time.DateTime dateTime36 = dateTime24.withZoneRetainFields(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = dateTime17.withZone(dateTimeZone35);
        org.joda.time.Duration duration39 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableDuration) duration39);
        boolean boolean41 = instant6.isBefore((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Instant instant43 = instant6.withMillis((long) 22);
        org.joda.time.DateTime dateTime44 = instant43.toDateTimeISO();
        org.joda.time.Period period46 = new org.joda.time.Period((long) 55);
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadablePeriod) period46);
        org.joda.time.Instant instant48 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 1, periodType51, chronology56);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) '4', chronology56);
        org.joda.time.ReadablePartial readablePartial59 = null;
        org.joda.time.DateTime dateTime60 = dateTime58.withFields(readablePartial59);
        boolean boolean61 = instant48.isAfter((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Period period63 = org.joda.time.Period.days((-1));
        org.joda.time.Period period65 = period63.withWeeks((int) 'a');
        org.joda.time.Period period67 = period63.plusMonths((int) (short) -1);
        org.joda.time.Period period69 = period63.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime70 = dateTime58.plus((org.joda.time.ReadablePeriod) period63);
        org.joda.time.PeriodType periodType73 = null;
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval77 = mutableInterval76.toInterval();
        org.joda.time.Chronology chronology78 = interval77.getChronology();
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((long) 1, periodType73, chronology78);
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime((long) '4', chronology78);
        org.joda.time.ReadablePartial readablePartial81 = null;
        org.joda.time.DateTime dateTime82 = dateTime80.withFields(readablePartial81);
        org.joda.time.DateTime.Property property83 = dateTime82.millisOfDay();
        org.joda.time.DateTime dateTime85 = dateTime82.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime87 = dateTime82.withCenturyOfEra((int) (short) 1);
        org.joda.time.Weeks weeks88 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.DateTime dateTime90 = dateTime58.plusDays(8);
        org.joda.time.DateTime dateTime92 = dateTime90.plusMonths((int) ' ');
        java.lang.String str93 = dateTime92.toString();
        org.joda.time.MutableDateTime mutableDateTime94 = dateTime92.toMutableDateTime();
        org.joda.time.Interval interval95 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime92);
        org.joda.time.DateTime.Property property96 = dateTime44.millisOfSecond();
        org.joda.time.DateTime dateTime97 = property96.getDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant43 and dateTime97", (instant43.compareTo(dateTime97) == 0) == instant43.equals(dateTime97));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime dateTime4 = dateTime0.minusWeeks(365);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType10 = null;
        int int11 = minutes9.get(durationFieldType10);
        int int13 = minutes9.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod14 = minutes9.toMutablePeriod();
        boolean boolean15 = minutes7.isLessThan(minutes9);
        org.joda.time.PeriodType periodType16 = minutes7.getPeriodType();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, periodType19, chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) '4', chronology24);
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
        boolean boolean41 = dateTime26.isAfter((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Chronology chronology42 = dateTime26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 49, periodType16, chronology42);
        org.joda.time.DurationField durationField44 = chronology42.weekyears();
        org.joda.time.DurationField durationField45 = chronology42.centuries();
        boolean boolean46 = dateTimeFieldType5.isSupported(chronology42);
        int int47 = dateTime4.get(dateTimeFieldType5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant27", (dateTime0.compareTo(instant27) == 0) == dateTime0.equals(instant27));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes2, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTime dateTime9 = instant7.toDateTimeISO();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.minuteOfDay();
        org.joda.time.DateTime dateTime19 = dateTime9.toDateTime(chronology16);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(35L);
        org.joda.time.LocalTime localTime22 = dateTime21.toLocalTime();
        org.joda.time.Duration duration23 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration24 = duration23.toDuration();
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.DateTimeZone dateTimeZone30 = chronology29.getZone();
        org.joda.time.Period period31 = duration23.toPeriod(chronology29);
        boolean boolean32 = localTime22.equals((java.lang.Object) period31);
        org.joda.time.DateTime dateTime33 = dateTime19.withFields((org.joda.time.ReadablePartial) localTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime19", (instant7.compareTo(dateTime19) == 0) == instant7.equals(dateTime19));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours1 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours2 = hours0.minus(hours1);
        org.joda.time.Duration duration3 = hours1.toStandardDuration();
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
        boolean boolean22 = dateTime20.isEqual(187200000L);
        org.joda.time.Interval interval23 = duration3.toIntervalFrom((org.joda.time.ReadableInstant) dateTime20);
        boolean boolean25 = dateTime20.isBefore((long) 50);
        org.joda.time.DateTime dateTime27 = dateTime20.minusMillis(20);
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
        org.joda.time.Duration duration45 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime47 = dateTime39.withDurationAdded((org.joda.time.ReadableDuration) duration45, 0);
        int int48 = dateTime47.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        long long55 = dateTimeZone51.convertLocalToUTC(355200035L, false, (long) (byte) 100);
        boolean boolean57 = dateTimeZone51.isStandardOffset((long) (short) 100);
        org.joda.time.DateTime dateTime58 = dateTime47.toDateTime(dateTimeZone51);
        boolean boolean60 = dateTime58.isBefore(9223372025133951616L);
        org.joda.time.DateTime.Property property61 = dateTime58.minuteOfHour();
        org.joda.time.DateTime dateTime62 = dateTime58.toDateTime();
        org.joda.time.Interval interval63 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime62", (dateTime19.compareTo(dateTime62) == 0) == dateTime19.equals(dateTime62));
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
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        mutablePeriod27.add((long) 3);
        org.joda.time.DateTime dateTime30 = dateTime9.minus((org.joda.time.ReadablePeriod) mutablePeriod27);
        mutablePeriod27.setSeconds(25);
        mutablePeriod27.setSeconds(2022);
        mutablePeriod27.setWeeks(34);
        mutablePeriod27.clear();
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardDays(100L);
        org.joda.time.Seconds seconds40 = duration39.toStandardSeconds();
        org.joda.time.Duration duration41 = seconds40.toStandardDuration();
        org.joda.time.Duration duration42 = seconds40.toStandardDuration();
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 1, periodType45, chronology50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) '4', chronology50);
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
        boolean boolean67 = dateTime52.isAfter((org.joda.time.ReadableInstant) dateTime63);
        java.lang.String str68 = dateTime52.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType70 = dateTimeFieldType69.getRangeDurationType();
        int int71 = dateTime52.get(dateTimeFieldType69);
        boolean boolean72 = dateTime52.isBeforeNow();
        org.joda.time.DateTime dateTime73 = dateTime52.toDateTimeISO();
        org.joda.time.Period period74 = duration42.toPeriodFrom((org.joda.time.ReadableInstant) dateTime73);
        boolean boolean75 = mutablePeriod27.equals((java.lang.Object) duration42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant53", (dateTime0.compareTo(instant53) == 0) == dateTime0.equals(instant53));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
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
        org.joda.time.Days days29 = org.joda.time.Days.days(3600052);
        org.joda.time.MutablePeriod mutablePeriod30 = days29.toMutablePeriod();
        boolean boolean31 = mutableInterval12.equals((java.lang.Object) days29);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean39 = mutableInterval34.isBefore((org.joda.time.ReadableInterval) mutableInterval38);
        long long40 = mutableInterval34.getStartMillis();
        java.lang.Object obj41 = mutableInterval34.clone();
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.seconds();
        org.joda.time.Period period43 = mutableInterval34.toPeriod(periodType42);
        org.joda.time.MutableInterval mutableInterval44 = mutableInterval34.toMutableInterval();
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.DateTime dateTime46 = mutableInterval44.getEnd();
        boolean boolean47 = mutableInterval12.contains((org.joda.time.ReadableInterval) mutableInterval44);
        java.lang.Object obj48 = null;
        org.joda.time.Interval interval49 = new org.joda.time.Interval(obj48);
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(chronology55);
        org.joda.time.Chronology chronology57 = chronology55.withUTC();
        long long61 = chronology55.add((long) 28, 10000L, 82800010);
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        org.joda.time.Chronology chronology66 = interval65.getChronology();
        org.joda.time.MutableInterval mutableInterval67 = interval65.toMutableInterval();
        org.joda.time.Interval interval69 = interval65.withEndMillis(53L);
        org.joda.time.Chronology chronology70 = interval65.getChronology();
        org.joda.time.DateTime dateTime71 = interval65.getStart();
        java.util.Locale locale72 = null;
        java.util.Calendar calendar73 = dateTime71.toCalendar(locale72);
        org.joda.time.YearMonthDay yearMonthDay74 = dateTime71.toYearMonthDay();
        int[] intArray76 = chronology55.get((org.joda.time.ReadablePartial) yearMonthDay74, 828000100028L);
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime((long) 499, chronology55);
        boolean boolean78 = interval49.isAfter((org.joda.time.ReadableInstant) dateTime77);
        mutableInterval12.setInterval((org.joda.time.ReadableInterval) interval49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime56", (instant13.compareTo(dateTime56) == 0) == instant13.equals(dateTime56));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes2, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTime dateTime9 = instant7.toDateTimeISO();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.minuteOfDay();
        org.joda.time.DateTime dateTime19 = dateTime9.toDateTime(chronology16);
        org.joda.time.DateTime dateTime21 = dateTime9.minus(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime21", (instant7.compareTo(dateTime21) == 0) == instant7.equals(dateTime21));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
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
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone32);
        int int34 = dateTime33.getDayOfMonth();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, periodType36, chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology41.getZone();
        org.joda.time.DateTime dateTime45 = dateTime33.withZoneRetainFields(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = dateTime26.withZone(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = dateTime46.toDateTime(dateTimeZone47);
        org.joda.time.Days days49 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime52 = dateTime48.withPeriodAdded(readablePeriod50, 349200000);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.Chronology chronology60 = interval59.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 1, periodType55, chronology60);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) '4', chronology60);
        org.joda.time.ReadablePartial readablePartial63 = null;
        org.joda.time.DateTime dateTime64 = dateTime62.withFields(readablePartial63);
        org.joda.time.DateTime.Property property65 = dateTime64.millisOfDay();
        org.joda.time.DateTime dateTime67 = dateTime64.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime69 = dateTime64.withCenturyOfEra((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        org.joda.time.DateTime dateTime71 = dateTime64.minus(readablePeriod70);
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime74 = dateTime72.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int76 = dateTime72.get(dateTimeFieldType75);
        org.joda.time.DateTime.Property property77 = dateTime64.property(dateTimeFieldType75);
        org.joda.time.DurationFieldType durationFieldType78 = dateTimeFieldType75.getRangeDurationType();
        int int79 = dateTime52.get(dateTimeFieldType75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime72", (instant0.compareTo(dateTime72) == 0) == instant0.equals(dateTime72));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime5 = dateTime2.plusMillis((int) '#');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        org.joda.time.DateTime dateTime8 = dateTime5.toDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = dateTime5.withEarlierOffsetAtOverlap();
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
        org.joda.time.DateTime.Property property25 = dateTime21.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property25.getFieldType();
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType26.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Minutes minutes30 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType31 = null;
        int int32 = minutes30.get(durationFieldType31);
        int int34 = minutes30.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod35 = minutes30.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType37 = minutes30.getFieldType(0);
        org.joda.time.DurationFieldType durationFieldType38 = minutes30.getFieldType();
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.Chronology chronology45 = interval44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 1, periodType40, chronology45);
        org.joda.time.DateTimeField dateTimeField47 = chronology45.hourOfHalfday();
        org.joda.time.DurationField durationField48 = chronology45.weeks();
        boolean boolean49 = durationFieldType38.isSupported(chronology45);
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType28.getField(chronology45);
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType26.getField(chronology45);
        int int52 = dateTime9.get(dateTimeFieldType26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime8", (dateTime9.compareTo(dateTime8) == 0) == dateTime9.equals(dateTime8));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
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
        org.joda.time.DateTime.Property property24 = dateTime22.secondOfDay();
        org.joda.time.Minutes minutes25 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = minutes27.get(durationFieldType28);
        org.joda.time.DurationFieldType durationFieldType30 = minutes27.getFieldType();
        boolean boolean31 = minutes25.isGreaterThan(minutes27);
        org.joda.time.Instant instant32 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes27, (org.joda.time.ReadableInstant) instant32);
        org.joda.time.Minutes minutes35 = minutes27.plus((int) (short) 1);
        org.joda.time.Duration duration36 = minutes27.toStandardDuration();
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
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period67 = duration37.toPeriodFrom((org.joda.time.ReadableInstant) dateTime66);
        boolean boolean68 = duration36.equals((java.lang.Object) dateTime66);
        org.joda.time.DateTime dateTime69 = dateTime22.minus((org.joda.time.ReadableDuration) duration36);
        long long70 = duration36.getStandardMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant23", (dateTime22.compareTo(instant23) == 0) == dateTime22.equals(instant23));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        boolean boolean2 = duration0.equals((java.lang.Object) dateTime1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Duration duration4 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval31 = duration4.toIntervalTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period34 = duration4.toPeriodFrom((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadablePeriod) period34);
        boolean boolean36 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean47 = mutableInterval42.isBefore((org.joda.time.ReadableInterval) mutableInterval46);
        boolean boolean48 = mutableInterval39.contains((org.joda.time.ReadableInterval) mutableInterval46);
        org.joda.time.Period period49 = mutableInterval39.toPeriod();
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean57 = mutableInterval52.isBefore((org.joda.time.ReadableInterval) mutableInterval56);
        boolean boolean58 = mutableInterval39.overlaps((org.joda.time.ReadableInterval) mutableInterval52);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone60);
        int int62 = dateTime61.getSecondOfMinute();
        org.joda.time.DateTime dateTime64 = dateTime61.withMinuteOfHour(10);
        boolean boolean65 = mutableInterval39.contains((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime64.toMutableDateTime();
        org.joda.time.Days days67 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTime dateTime68 = dateTime64.toDateTime();
        org.joda.time.Instant instant69 = new org.joda.time.Instant((java.lang.Object) dateTime68);
        org.joda.time.DateTime dateTime70 = instant69.toDateTimeISO();
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval74 = mutableInterval73.toInterval();
        org.joda.time.Chronology chronology75 = interval74.getChronology();
        org.joda.time.MutableInterval mutableInterval76 = interval74.toMutableInterval();
        org.joda.time.DateTime dateTime77 = interval74.getStart();
        org.joda.time.DateTime dateTime79 = dateTime77.plusWeeks(28);
        org.joda.time.PeriodType periodType80 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod(periodType80);
        org.joda.time.PeriodType periodType82 = periodType80.withWeeksRemoved();
        org.joda.time.PeriodType periodType83 = periodType80.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime70, (org.joda.time.ReadableInstant) dateTime77, periodType80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime64 and instant69", (dateTime64.compareTo(instant69) == 0) == dateTime64.equals(instant69));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readableDuration1);
        org.joda.time.Hours hours3 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) mutableInterval2);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.TimeOfDay timeOfDay6 = dateTime4.toTimeOfDay();
        mutableInterval2.setEnd((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((-61393935600000L));
        org.joda.time.DateTime dateTime10 = instant9.toDateTimeISO();
        mutableInterval2.setStart((org.joda.time.ReadableInstant) dateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
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
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime11.minus(readablePeriod17);
        int int19 = dateTime18.getMinuteOfDay();
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
        org.joda.time.Instant instant63 = instant20.withDurationAdded((org.joda.time.ReadableDuration) duration34, 49);
        org.joda.time.MutableDateTime mutableDateTime64 = instant20.toMutableDateTimeISO();
        org.joda.time.Seconds seconds65 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) mutableDateTime64);
        org.joda.time.Seconds seconds66 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) seconds65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and mutableDateTime64", (instant20.compareTo(mutableDateTime64) == 0) == instant20.equals(mutableDateTime64));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
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
        org.joda.time.Instant instant26 = instant23.withDurationAdded(2629746000L, 25);
        org.joda.time.Hours hours27 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours28 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours29 = hours27.minus(hours28);
        org.joda.time.Duration duration30 = hours28.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone32);
        int int34 = dateTime33.getMillisOfDay();
        org.joda.time.DateTime dateTime36 = dateTime33.plusMillis((int) '#');
        int int37 = dateTime33.getYearOfEra();
        org.joda.time.DateTime.Property property38 = dateTime33.secondOfMinute();
        int int39 = property38.getMaximumValueOverall();
        org.joda.time.DateTime dateTime41 = property38.setCopy(59);
        org.joda.time.Period period42 = duration30.toPeriodTo((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Duration duration45 = duration30.withDurationAdded((-22591217L), 5);
        org.joda.time.Instant instant46 = instant26.plus((org.joda.time.ReadableDuration) duration45);
        org.joda.time.Instant instant49 = instant46.withDurationAdded(0L, 435);
        org.joda.time.Chronology chronology50 = instant49.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant23", (dateTime22.compareTo(instant23) == 0) == dateTime22.equals(instant23));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
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
        org.joda.time.DateTime dateTime19 = instant18.toDateTimeISO();
        org.joda.time.Instant instant22 = instant18.withDurationAdded((-1L), (-3));
        org.joda.time.DateTime dateTime23 = instant18.toDateTime();
        org.joda.time.Chronology chronology24 = instant18.getChronology();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.Seconds seconds26 = org.joda.time.Seconds.standardSecondsIn(readablePeriod25);
        int int27 = seconds26.getSeconds();
        org.joda.time.Seconds seconds29 = seconds26.plus((int) '4');
        org.joda.time.Seconds seconds31 = seconds29.minus(31);
        org.joda.time.Seconds seconds33 = seconds31.multipliedBy(366);
        org.joda.time.Period period34 = seconds33.toPeriod();
        long long37 = chronology24.add((org.joda.time.ReadablePeriod) seconds33, (long) 510, (-12));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant18", (dateTime15.compareTo(instant18) == 0) == dateTime15.equals(instant18));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        long long5 = interval3.toDurationMillis();
        org.joda.time.Interval interval7 = interval3.withEndMillis((long) (short) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 10);
        org.joda.time.Interval interval12 = interval7.withEnd((org.joda.time.ReadableInstant) instant8);
        org.joda.time.DateTime dateTime13 = instant8.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime14 = instant8.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime13", (instant8.compareTo(dateTime13) == 0) == instant8.equals(dateTime13));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        long long5 = interval3.toDurationMillis();
        org.joda.time.Interval interval7 = interval3.withEndMillis((long) (short) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 10);
        org.joda.time.Interval interval12 = interval7.withEnd((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Instant instant14 = instant8.withMillis((long) 4);
        org.joda.time.Instant instant16 = instant14.plus((long) 86399);
        org.joda.time.DateTime dateTime17 = instant16.toDateTime();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant20 = instant16.withDurationAdded(readableDuration18, 5699);
        org.joda.time.Hours hours21 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours22 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours23 = hours21.minus(hours22);
        org.joda.time.Duration duration24 = hours22.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration24, readableInstant25);
        org.joda.time.Instant instant27 = instant16.plus((org.joda.time.ReadableDuration) duration24);
        long long28 = instant27.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime17", (instant16.compareTo(dateTime17) == 0) == instant16.equals(dateTime17));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(periodType4);
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) mutablePeriod5);
        boolean boolean8 = mutableInterval6.isBefore(9223372036505575807L);
        org.joda.time.Days days9 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) mutableInterval6);
        mutableInterval6.setDurationAfterStart(75736684800000L);
        org.joda.time.Period period20 = new org.joda.time.Period(58, 45, (-98), (int) (short) 10, 0, 22, 46, 377);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, periodType23, chronology28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) '4', chronology28);
        org.joda.time.DateTime.Property property31 = dateTime30.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property31.getFieldType();
        org.joda.time.DateTime dateTime33 = property31.roundFloorCopy();
        org.joda.time.DateTime dateTime34 = property31.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology43.getZone();
        java.lang.String str46 = dateTimeZone44.getName(100L);
        org.joda.time.DateTime dateTime47 = dateTime38.withZoneRetainFields(dateTimeZone44);
        long long49 = dateTimeZone37.getMillisKeepLocal(dateTimeZone44, 6000035L);
        java.lang.String str50 = dateTimeZone44.toString();
        org.joda.time.DateTime dateTime51 = dateTime34.toDateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime53 = dateTime34.plusDays((-3600000));
        org.joda.time.Duration duration54 = period20.toDurationFrom((org.joda.time.ReadableInstant) dateTime34);
        mutableInterval6.setEnd((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Instant instant56 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) 1, periodType59, chronology64);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) '4', chronology64);
        org.joda.time.ReadablePartial readablePartial67 = null;
        org.joda.time.DateTime dateTime68 = dateTime66.withFields(readablePartial67);
        boolean boolean69 = instant56.isAfter((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Period period71 = org.joda.time.Period.days((-1));
        org.joda.time.Period period73 = period71.withWeeks((int) 'a');
        org.joda.time.Period period75 = period71.plusMonths((int) (short) -1);
        org.joda.time.Period period77 = period71.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime78 = dateTime66.plus((org.joda.time.ReadablePeriod) period71);
        org.joda.time.Instant instant79 = dateTime78.toInstant();
        boolean boolean80 = mutableInterval6.isAfter((org.joda.time.ReadableInstant) dateTime78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and instant56", (dateTime38.compareTo(instant56) == 0) == dateTime38.equals(instant56));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
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
        org.joda.time.Instant instant20 = instant17.withMillis((long) 496);
        org.joda.time.DateTime dateTime21 = instant17.toDateTime();
        org.joda.time.Instant instant23 = instant17.minus(1486080000000L);
        org.joda.time.Instant instant25 = instant23.withMillis(1645600730527L);
        org.joda.time.Seconds seconds26 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds28 = seconds26.dividedBy(11);
        org.joda.time.Duration duration29 = seconds28.toStandardDuration();
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardHours((long) 24);
        int int32 = duration29.compareTo((org.joda.time.ReadableDuration) duration31);
        org.joda.time.Period period33 = duration29.toPeriod();
        org.joda.time.Instant instant34 = instant25.minus((org.joda.time.ReadableDuration) duration29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant17", (dateTime16.compareTo(instant17) == 0) == dateTime16.equals(instant17));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        long long5 = interval3.toDurationMillis();
        org.joda.time.Interval interval7 = interval3.withEndMillis((long) (short) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 10);
        org.joda.time.Interval interval12 = interval7.withEnd((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.minutes(0);
        org.joda.time.Duration duration15 = minutes14.toStandardDuration();
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType19 = null;
        int int20 = minutes18.get(durationFieldType19);
        org.joda.time.DurationFieldType durationFieldType21 = minutes18.getFieldType();
        boolean boolean22 = minutes16.isGreaterThan(minutes18);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes18, (org.joda.time.ReadableInstant) instant23);
        org.joda.time.DateTime dateTime25 = instant23.toDateTimeISO();
        org.joda.time.DateTime dateTime26 = instant23.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime27 = instant23.toMutableDateTimeISO();
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration15, (org.joda.time.ReadableInstant) instant23);
        org.joda.time.Instant instant29 = instant8.plus((org.joda.time.ReadableDuration) duration15);
        java.lang.String str30 = instant29.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and dateTime25", (instant29.compareTo(dateTime25) == 0) == instant29.equals(dateTime25));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant3 = instant1.plus((long) 496);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTime();
        org.joda.time.Instant instant6 = instant1.plus((-284012524800000L));
        org.joda.time.Instant instant8 = instant6.minus((long) 8);
        org.joda.time.Instant instant9 = instant6.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime11 = property10.withMinimumValue();
        org.joda.time.DateTime dateTime12 = dateTime11.withLaterOffsetAtOverlap();
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
        org.joda.time.YearMonthDay yearMonthDay44 = dateTime43.toYearMonthDay();
        int int45 = dateTime43.getYear();
        org.joda.time.Hours hours46 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime dateTime48 = dateTime12.minusMillis(499);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant23", (dateTime0.compareTo(instant23) == 0) == dateTime0.equals(instant23));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes2, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTime dateTime9 = instant7.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = instant7.toDateTimeISO();
        org.joda.time.Chronology chronology11 = instant7.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime9", (instant7.compareTo(dateTime9) == 0) == instant7.equals(dateTime9));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 10);
        org.joda.time.Instant instant6 = instant0.withDurationAdded((-54432000000L), 3);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 1, periodType10, chronology15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', chronology15);
        org.joda.time.ReadablePartial readablePartial18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withFields(readablePartial18);
        boolean boolean20 = instant7.isAfter((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime.Property property21 = dateTime17.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone23);
        int int25 = dateTime24.getDayOfMonth();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, periodType27, chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone35 = chronology32.getZone();
        org.joda.time.DateTime dateTime36 = dateTime24.withZoneRetainFields(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = dateTime17.withZone(dateTimeZone35);
        org.joda.time.Duration duration39 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableDuration) duration39);
        boolean boolean41 = instant6.isBefore((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime42 = instant6.toDateTime();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(29034000000L);
        mutablePeriod44.setSeconds(17);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period57 = org.joda.time.Period.days((-1));
        org.joda.time.Period period59 = period57.withWeeks((int) 'a');
        java.lang.String str60 = period57.toString();
        mutablePeriod55.setPeriod((org.joda.time.ReadablePeriod) period57);
        int int62 = mutablePeriod55.getYears();
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.Chronology chronology70 = interval69.getChronology();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((long) 1, periodType65, chronology70);
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((long) '4', chronology70);
        org.joda.time.ReadablePartial readablePartial73 = null;
        org.joda.time.DateTime dateTime74 = dateTime72.withFields(readablePartial73);
        org.joda.time.DateTime.Property property75 = dateTime74.millisOfDay();
        org.joda.time.DateTime dateTime77 = dateTime74.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property78 = dateTime74.era();
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval82 = mutableInterval81.toInterval();
        org.joda.time.Chronology chronology83 = interval82.getChronology();
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime(chronology83);
        int int85 = property78.compareTo((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.Duration duration86 = mutablePeriod55.toDurationTo((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.Duration duration88 = duration86.minus((long) 3600010);
        org.joda.time.Duration duration89 = duration86.toDuration();
        mutablePeriod44.add((org.joda.time.ReadableDuration) duration86);
        org.joda.time.Instant instant91 = instant6.minus((org.joda.time.ReadableDuration) duration86);
        org.joda.time.MutablePeriod mutablePeriod94 = new org.joda.time.MutablePeriod(31622402022L, (-61393935600000L));
        boolean boolean95 = duration86.equals((java.lang.Object) 31622402022L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime84", (instant0.compareTo(dateTime84) == 0) == instant0.equals(dateTime84));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
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
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        org.joda.time.DateTime dateTime22 = dateTime2.withZone(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime2.plus((long) 37);
        org.joda.time.DateTime dateTime26 = dateTime24.withMillisOfSecond(194);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime22", (dateTime2.compareTo(dateTime22) == 0) == dateTime2.equals(dateTime22));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        long long6 = dateTimeZone2.convertLocalToUTC(355200035L, false, (long) (byte) 100);
        boolean boolean8 = dateTimeZone2.isStandardOffset((long) (short) 100);
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
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Instant instant26 = dateTime25.toInstant();
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) instant26);
        org.joda.time.Instant instant29 = instant26.withMillis((long) 496);
        org.joda.time.DateTime dateTime30 = instant26.toDateTime();
        boolean boolean31 = dateTimeZone2.equals((java.lang.Object) instant26);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone33);
        int int35 = dateTime34.getMillisOfDay();
        org.joda.time.DateTime dateTime37 = dateTime34.plusMillis((int) '#');
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.Chronology chronology45 = interval44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 1, periodType40, chronology45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) '4', chronology45);
        org.joda.time.DateTime dateTime48 = dateTime37.withChronology(chronology45);
        org.joda.time.DateTime dateTime50 = dateTime48.plusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property51 = dateTime50.minuteOfDay();
        int int52 = dateTime50.getMinuteOfDay();
        int int53 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant26", (dateTime25.compareTo(instant26) == 0) == dateTime25.equals(instant26));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
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
        long long16 = property14.remainder();
        org.joda.time.DateTime dateTime17 = property14.withMaximumValue();
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        org.joda.time.Chronology chronology25 = chronology23.withUTC();
        long long29 = chronology23.add((long) 28, 10000L, 82800010);
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutableInterval mutableInterval35 = interval33.toMutableInterval();
        org.joda.time.Interval interval37 = interval33.withEndMillis(53L);
        org.joda.time.Chronology chronology38 = interval33.getChronology();
        org.joda.time.DateTime dateTime39 = interval33.getStart();
        java.util.Locale locale40 = null;
        java.util.Calendar calendar41 = dateTime39.toCalendar(locale40);
        org.joda.time.YearMonthDay yearMonthDay42 = dateTime39.toYearMonthDay();
        int[] intArray44 = chronology23.get((org.joda.time.ReadablePartial) yearMonthDay42, 828000100028L);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 499, chronology23);
        org.joda.time.DateTime dateTime47 = dateTime45.withSecondOfMinute(0);
        boolean boolean48 = dateTime17.isAfter((org.joda.time.ReadableInstant) dateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime24", (instant0.compareTo(dateTime24) == 0) == instant0.equals(dateTime24));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
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
        boolean boolean26 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology27 = dateTime11.getChronology();
        org.joda.time.Period period28 = new org.joda.time.Period(0L, (long) 50, chronology27);
        org.joda.time.DurationField durationField29 = chronology27.days();
        org.joda.time.DurationField durationField30 = chronology27.centuries();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 1, periodType32, chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology37.getZone();
        long long43 = dateTimeZone40.convertLocalToUTC((-6380815651200000L), true);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone40);
        java.util.Locale locale46 = null;
        java.lang.String str47 = dateTimeZone40.getName((-343496400L), locale46);
        org.joda.time.Chronology chronology48 = chronology27.withZone(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField49 = chronology48.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime44", (instant12.compareTo(dateTime44) == 0) == instant12.equals(dateTime44));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
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
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone32);
        int int34 = dateTime33.getDayOfMonth();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, periodType36, chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology41.getZone();
        org.joda.time.DateTime dateTime45 = dateTime33.withZoneRetainFields(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = dateTime26.withZone(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = dateTime46.toDateTime(dateTimeZone47);
        org.joda.time.Days days49 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime48);
        int int50 = dateTime15.getMillisOfSecond();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.DateTime dateTime52 = dateTime15.minus(readableDuration51);
        org.joda.time.DateTime dateTime54 = dateTime15.withMinuteOfHour(52);
        org.joda.time.DateTime.Property property55 = dateTime15.dayOfWeek();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime();
        org.joda.time.Instant instant57 = dateTime56.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType59 = dateTimeFieldType58.getRangeDurationType();
        org.joda.time.DateTime.Property property60 = dateTime56.property(dateTimeFieldType58);
        boolean boolean61 = dateTime15.isSupported(dateTimeFieldType58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime56", (instant0.compareTo(dateTime56) == 0) == instant0.equals(dateTime56));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes2, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTime dateTime9 = instant7.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = instant7.toDateTime();
        org.joda.time.Duration duration11 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration12 = duration11.toDuration();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone14);
        int int16 = dateTime15.getMillisOfDay();
        org.joda.time.DateTime dateTime18 = dateTime15.plusMillis((int) '#');
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, periodType21, chronology26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '4', chronology26);
        org.joda.time.DateTime dateTime29 = dateTime18.withChronology(chronology26);
        int int30 = dateTime29.getYearOfEra();
        org.joda.time.Chronology chronology31 = dateTime29.getChronology();
        org.joda.time.DateTime dateTime33 = dateTime29.minusWeeks(55);
        org.joda.time.Instant instant34 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) '4', chronology42);
        org.joda.time.ReadablePartial readablePartial45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.withFields(readablePartial45);
        boolean boolean47 = instant34.isAfter((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime.Property property48 = dateTime44.dayOfWeek();
        org.joda.time.DateTime dateTime49 = property48.withMaximumValue();
        boolean boolean50 = dateTime29.isAfter((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime dateTime52 = dateTime29.plusSeconds(50);
        org.joda.time.Interval interval53 = duration11.toIntervalTo((org.joda.time.ReadableInstant) dateTime52);
        long long54 = duration11.getMillis();
        org.joda.time.Interval interval55 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime9", (instant7.compareTo(dateTime9) == 0) == instant7.equals(dateTime9));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        int int3 = minutes1.get(durationFieldType2);
        int int5 = minutes1.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod6 = minutes1.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType8 = minutes1.getFieldType(0);
        java.lang.String str9 = durationFieldType8.getName();
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.Chronology chronology16 = chronology14.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekyearOfCentury();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(chronology16);
        boolean boolean19 = durationFieldType8.isSupported(chronology16);
        org.joda.time.DateTimeField dateTimeField20 = chronology16.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime18", (dateTime15.compareTo(dateTime18) == 0) == dateTime15.equals(dateTime18));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus(100L);
        org.joda.time.DateTime dateTime3 = instant2.toDateTimeISO();
        org.joda.time.Hours hours4 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours5 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours6 = hours4.minus(hours5);
        org.joda.time.Hours hours7 = org.joda.time.Hours.ONE;
        boolean boolean8 = hours4.isLessThan(hours7);
        org.joda.time.DateTime dateTime9 = dateTime3.minus((org.joda.time.ReadablePeriod) hours7);
        org.joda.time.Hours hours10 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period21 = org.joda.time.Period.days((-1));
        org.joda.time.Period period23 = period21.withWeeks((int) 'a');
        java.lang.String str24 = period21.toString();
        mutablePeriod19.setPeriod((org.joda.time.ReadablePeriod) period21);
        int int26 = mutablePeriod19.getMillis();
        org.joda.time.DurationFieldType durationFieldType28 = mutablePeriod19.getFieldType(0);
        int int29 = hours10.get(durationFieldType28);
        org.joda.time.Hours hours31 = hours10.multipliedBy(100);
        org.joda.time.Hours hours33 = hours31.dividedBy(50);
        org.joda.time.Hours hours35 = hours31.dividedBy((int) (byte) 1);
        org.joda.time.Period period37 = org.joda.time.Period.days((-1));
        org.joda.time.Hours hours38 = org.joda.time.Hours.FIVE;
        org.joda.time.PeriodType periodType39 = hours38.getPeriodType();
        org.joda.time.Period period40 = period37.withFields((org.joda.time.ReadablePeriod) hours38);
        org.joda.time.Hours hours41 = hours31.plus(hours38);
        org.joda.time.Hours hours42 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period53 = org.joda.time.Period.days((-1));
        org.joda.time.Period period55 = period53.withWeeks((int) 'a');
        java.lang.String str56 = period53.toString();
        mutablePeriod51.setPeriod((org.joda.time.ReadablePeriod) period53);
        int int58 = mutablePeriod51.getMillis();
        org.joda.time.DurationFieldType durationFieldType60 = mutablePeriod51.getFieldType(0);
        int int61 = hours42.get(durationFieldType60);
        org.joda.time.Hours hours63 = hours42.multipliedBy(100);
        org.joda.time.Hours hours64 = hours41.plus(hours42);
        org.joda.time.Hours hours65 = hours7.plus(hours42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime3", (instant2.compareTo(dateTime3) == 0) == instant2.equals(dateTime3));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
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
        org.joda.time.DateTime.Property property40 = dateTime38.era();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone42);
        int int44 = dateTime43.getSecondOfMinute();
        int int45 = dateTime43.getMillisOfDay();
        org.joda.time.DateTime dateTime47 = dateTime43.withYear((int) (byte) 100);
        org.joda.time.DateTime.Property property48 = dateTime47.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int50 = dateTime47.get(dateTimeFieldType49);
        int int51 = dateTime38.get(dateTimeFieldType49);
        org.joda.time.Instant instant52 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology53 = instant52.getChronology();
        org.joda.time.MutableDateTime mutableDateTime54 = instant52.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime55 = instant52.toMutableDateTimeISO();
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean66 = mutableInterval61.isBefore((org.joda.time.ReadableInterval) mutableInterval65);
        boolean boolean67 = mutableInterval58.contains((org.joda.time.ReadableInterval) mutableInterval65);
        org.joda.time.Period period70 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType71 = period70.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType71);
        org.joda.time.Period period73 = mutableInterval65.toPeriod(periodType71);
        org.joda.time.Chronology chronology74 = mutableInterval65.getChronology();
        org.joda.time.DurationField durationField75 = chronology74.minutes();
        org.joda.time.MutableDateTime mutableDateTime76 = instant52.toMutableDateTime(chronology74);
        int int77 = dateTime38.compareTo((org.joda.time.ReadableInstant) instant52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime54", (instant0.compareTo(mutableDateTime54) == 0) == instant0.equals(mutableDateTime54));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
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
        long long74 = chronology69.add((long) 57, 100L, 24);
        org.joda.time.DateTimeField dateTimeField75 = chronology69.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField76 = chronology69.halfdayOfDay();
        org.joda.time.DurationField durationField77 = chronology69.days();
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime();
        org.joda.time.Instant instant79 = dateTime78.toInstant();
        org.joda.time.TimeOfDay timeOfDay80 = dateTime78.toTimeOfDay();
        long long82 = chronology69.set((org.joda.time.ReadablePartial) timeOfDay80, 495L);
        org.joda.time.DateTimeField dateTimeField83 = chronology69.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime50 and instant79", (dateTime50.compareTo(instant79) == 0) == dateTime50.equals(instant79));
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
        org.joda.time.DateTime.Property property15 = dateTime11.yearOfCentury();
        org.joda.time.DateTime dateTime16 = property15.roundFloorCopy();
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardDays((long) (-98));
        java.lang.Object obj19 = null;
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
        org.joda.time.DateTime dateTime36 = dateTime31.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours37 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours38 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours39 = hours37.minus(hours38);
        org.joda.time.Duration duration40 = hours38.toStandardDuration();
        org.joda.time.DateTime dateTime41 = dateTime31.plus((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Duration duration42 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration43 = duration42.toDuration();
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.DateTimeZone dateTimeZone49 = chronology48.getZone();
        org.joda.time.Period period50 = duration42.toPeriod(chronology48);
        boolean boolean51 = duration40.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.days();
        org.joda.time.Period period53 = duration42.toPeriod(periodType52);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.Chronology chronology61 = interval60.getChronology();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) 1, periodType56, chronology61);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) '4', chronology61);
        org.joda.time.ReadablePartial readablePartial64 = null;
        org.joda.time.DateTime dateTime65 = dateTime63.withFields(readablePartial64);
        org.joda.time.DateTime.Property property66 = dateTime65.millisOfDay();
        org.joda.time.DateTime dateTime67 = dateTime65.withEarlierOffsetAtOverlap();
        int int68 = dateTime65.getDayOfWeek();
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval74 = mutableInterval73.toInterval();
        org.joda.time.Chronology chronology75 = interval74.getChronology();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((long) 1, periodType70, chronology75);
        org.joda.time.DateTimeField dateTimeField77 = chronology75.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone78 = chronology75.getZone();
        org.joda.time.DateTime dateTime79 = dateTime65.withChronology(chronology75);
        org.joda.time.DateTimeField dateTimeField80 = chronology75.dayOfMonth();
        org.joda.time.DurationField durationField81 = chronology75.seconds();
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(obj19, periodType52, chronology75);
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration18, periodType52);
        org.joda.time.DateTime.Property property84 = dateTime16.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.DateTime dateTime87 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone86);
        java.util.Locale locale88 = null;
        java.util.Calendar calendar89 = dateTime87.toCalendar(locale88);
        org.joda.time.Instant instant90 = dateTime87.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int92 = instant90.get(dateTimeFieldType91);
        boolean boolean93 = dateTime16.isSupported(dateTimeFieldType91);
        org.joda.time.DurationFieldType durationFieldType94 = dateTimeFieldType91.getRangeDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime87 and instant90", (dateTime87.compareTo(instant90) == 0) == dateTime87.equals(instant90));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
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
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        org.joda.time.DateTime dateTime22 = dateTime2.withZone(dateTimeZone21);
        org.joda.time.DateTime.Property property23 = dateTime22.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime22", (dateTime2.compareTo(dateTime22) == 0) == dateTime2.equals(dateTime22));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.Period period1 = org.joda.time.Period.hours(22);
        org.joda.time.Period period3 = period1.withHours(83400);
        org.joda.time.Duration duration4 = period1.toStandardDuration();
        org.joda.time.Duration duration6 = duration4.minus((long) 39);
        org.joda.time.Duration duration7 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval34 = duration7.toIntervalTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period37 = duration7.toPeriodFrom((org.joda.time.ReadableInstant) dateTime36);
        long long38 = duration7.getMillis();
        org.joda.time.Instant instant39 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 1, periodType42, chronology47);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) '4', chronology47);
        org.joda.time.ReadablePartial readablePartial50 = null;
        org.joda.time.DateTime dateTime51 = dateTime49.withFields(readablePartial50);
        boolean boolean52 = instant39.isAfter((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime.Property property53 = dateTime49.dayOfWeek();
        org.joda.time.DateTime dateTime54 = property53.withMaximumValue();
        org.joda.time.DateTime dateTime56 = dateTime54.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant57 = new org.joda.time.Instant((java.lang.Object) dateTime54);
        java.lang.String str58 = instant57.toString();
        org.joda.time.DateTime dateTime59 = instant57.toDateTimeISO();
        org.joda.time.Instant instant61 = instant57.plus((-2209338000000L));
        org.joda.time.PeriodType periodType63 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str64 = periodType63.getName();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) (short) -1, periodType63);
        org.joda.time.PeriodType periodType66 = periodType63.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, (org.joda.time.ReadableInstant) instant57, periodType63);
        org.joda.time.Period period68 = duration6.toPeriod(periodType63);
        org.joda.time.Hours hours69 = duration6.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime54 and instant57", (dateTime54.compareTo(instant57) == 0) == dateTime54.equals(instant57));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        long long13 = mutableInterval9.getEndMillis();
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean24 = mutableInterval19.isBefore((org.joda.time.ReadableInterval) mutableInterval23);
        boolean boolean25 = mutableInterval16.contains((org.joda.time.ReadableInterval) mutableInterval23);
        mutableInterval9.setInterval((org.joda.time.ReadableInterval) mutableInterval23);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', chronology34);
        org.joda.time.ReadablePartial readablePartial37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withFields(readablePartial37);
        org.joda.time.DateTime.Property property39 = dateTime38.millisOfDay();
        boolean boolean40 = mutableInterval9.isBefore((org.joda.time.ReadableInstant) dateTime38);
        int int41 = dateTime38.getHourOfDay();
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
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone58);
        int int60 = dateTime59.getDayOfMonth();
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        org.joda.time.Chronology chronology67 = interval66.getChronology();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) 1, periodType62, chronology67);
        org.joda.time.DateTimeField dateTimeField69 = chronology67.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone70 = chronology67.getZone();
        org.joda.time.DateTime dateTime71 = dateTime59.withZoneRetainFields(dateTimeZone70);
        org.joda.time.DateTime dateTime72 = dateTime52.withZone(dateTimeZone70);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = dateTime72.toDateTime(dateTimeZone73);
        boolean boolean75 = dateTime38.isAfter((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.Instant instant76 = dateTime38.toInstant();
        org.joda.time.Instant instant78 = instant76.withMillis(0L);
        org.joda.time.Duration duration80 = org.joda.time.Duration.millis(15778540800000L);
        org.joda.time.Instant instant81 = instant78.minus((org.joda.time.ReadableDuration) duration80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and instant76", (dateTime36.compareTo(instant76) == 0) == dateTime36.equals(instant76));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        long long13 = mutableInterval9.getEndMillis();
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean24 = mutableInterval19.isBefore((org.joda.time.ReadableInterval) mutableInterval23);
        boolean boolean25 = mutableInterval16.contains((org.joda.time.ReadableInterval) mutableInterval23);
        mutableInterval9.setInterval((org.joda.time.ReadableInterval) mutableInterval23);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', chronology34);
        org.joda.time.ReadablePartial readablePartial37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withFields(readablePartial37);
        org.joda.time.DateTime.Property property39 = dateTime38.millisOfDay();
        boolean boolean40 = mutableInterval9.isBefore((org.joda.time.ReadableInstant) dateTime38);
        int int41 = dateTime38.getHourOfDay();
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
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone58);
        int int60 = dateTime59.getDayOfMonth();
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        org.joda.time.Chronology chronology67 = interval66.getChronology();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) 1, periodType62, chronology67);
        org.joda.time.DateTimeField dateTimeField69 = chronology67.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone70 = chronology67.getZone();
        org.joda.time.DateTime dateTime71 = dateTime59.withZoneRetainFields(dateTimeZone70);
        org.joda.time.DateTime dateTime72 = dateTime52.withZone(dateTimeZone70);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = dateTime72.toDateTime(dateTimeZone73);
        boolean boolean75 = dateTime38.isAfter((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.Instant instant76 = dateTime38.toInstant();
        org.joda.time.Instant instant78 = instant76.withMillis(0L);
        long long79 = instant78.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and instant76", (dateTime36.compareTo(instant76) == 0) == dateTime36.equals(instant76));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus(100L);
        boolean boolean3 = instant0.isBeforeNow();
        org.joda.time.Instant instant5 = instant0.withMillis((-164129414399955L));
        org.joda.time.Instant instant7 = instant0.minus((long) 50);
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
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone24);
        int int26 = dateTime25.getDayOfMonth();
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 1, periodType28, chronology33);
        org.joda.time.DateTimeField dateTimeField35 = chronology33.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone36 = chronology33.getZone();
        org.joda.time.DateTime dateTime37 = dateTime25.withZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = dateTime18.withZone(dateTimeZone36);
        int int39 = dateTime18.getSecondOfDay();
        org.joda.time.DateTime dateTime41 = dateTime18.minusWeeks(923);
        org.joda.time.Hours hours42 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) instant0, (org.joda.time.ReadableInstant) dateTime18);
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
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval80 = mutableInterval79.toInterval();
        org.joda.time.Chronology chronology81 = interval80.getChronology();
        org.joda.time.DateTimeZone dateTimeZone82 = chronology81.getZone();
        java.lang.String str84 = dateTimeZone82.getName(100L);
        org.joda.time.DateTime dateTime85 = dateTime76.withZoneRetainFields(dateTimeZone82);
        long long87 = dateTimeZone75.getMillisKeepLocal(dateTimeZone82, 6000035L);
        java.util.Locale locale89 = null;
        java.lang.String str90 = dateTimeZone75.getShortName((long) 1, locale89);
        org.joda.time.Chronology chronology91 = chronology72.withZone(dateTimeZone75);
        org.joda.time.Chronology chronology92 = chronology91.withUTC();
        org.joda.time.DateTimeField dateTimeField93 = chronology92.hourOfDay();
        org.joda.time.DateTimeField dateTimeField94 = chronology92.yearOfCentury();
        org.joda.time.DateTime dateTime95 = new org.joda.time.DateTime(1482218284946L, chronology92);
        org.joda.time.DateTimeField dateTimeField96 = chronology92.monthOfYear();
        int int97 = dateTime18.get(dateTimeField96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime53", (instant0.compareTo(dateTime53) == 0) == instant0.equals(dateTime53));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
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
        org.joda.time.Period period56 = org.joda.time.Period.days((-1));
        org.joda.time.Period period58 = period56.withWeeks((int) 'a');
        org.joda.time.Period period60 = period56.plusMonths((int) (short) -1);
        org.joda.time.Period period62 = period56.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime63 = dateTime51.plus((org.joda.time.ReadablePeriod) period56);
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
        org.joda.time.DateTime dateTime80 = dateTime75.withCenturyOfEra((int) (short) 1);
        org.joda.time.Weeks weeks81 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.PeriodType periodType82 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period83 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime75, periodType82);
        org.joda.time.DateTime dateTime85 = dateTime75.plus(0L);
        org.joda.time.MutableInterval mutableInterval88 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval89 = mutableInterval88.toInterval();
        org.joda.time.Chronology chronology90 = interval89.getChronology();
        org.joda.time.DateTime dateTime91 = new org.joda.time.DateTime(chronology90);
        int int92 = dateTime91.getSecondOfMinute();
        org.joda.time.DateTime dateTime94 = dateTime91.withWeekyear(3);
        org.joda.time.DateTime.Property property95 = dateTime91.weekOfWeekyear();
        boolean boolean96 = dateTime85.isBefore((org.joda.time.ReadableInstant) dateTime91);
        org.joda.time.DateTime dateTime97 = dateTime91.toDateTimeISO();
        org.joda.time.DateTime.Property property98 = dateTime91.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant41 and dateTime91", (instant41.compareTo(dateTime91) == 0) == instant41.equals(dateTime91));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime5 = dateTime2.plusMillis((int) '#');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        org.joda.time.DateTime dateTime8 = dateTime5.toDateTime(dateTimeZone7);
        int int10 = dateTimeZone7.getStandardOffset(205200057L);
        long long13 = dateTimeZone7.convertLocalToUTC((long) 26404, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime8", (dateTime5.compareTo(dateTime8) == 0) == dateTime5.equals(dateTime8));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.DateTime.Property property2 = dateTime0.minuteOfDay();
        boolean boolean3 = dateTime0.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone5);
        int int7 = dateTime6.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = dateTime6.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime6.withMillisOfDay((int) (byte) 1);
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
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone28);
        int int30 = dateTime29.getDayOfMonth();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 1, periodType32, chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology37.getZone();
        org.joda.time.DateTime dateTime41 = dateTime29.withZoneRetainFields(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = dateTime22.withZone(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.toDateTime(dateTimeZone43);
        org.joda.time.Seconds seconds45 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Instant instant47 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Instant instant50 = instant47.withDurationAdded(readableDuration48, 10);
        org.joda.time.Instant instant53 = instant47.withDurationAdded((-54432000000L), 3);
        org.joda.time.Instant instant55 = instant53.withMillis(52L);
        long long56 = instant53.getMillis();
        org.joda.time.Instant instant59 = instant53.withDurationAdded((-6279833754000000L), 2);
        long long60 = instant53.getMillis();
        org.joda.time.Instant instant62 = instant53.plus(39L);
        org.joda.time.DateTimeZone dateTimeZone63 = instant53.getZone();
        org.joda.time.DateTime dateTime64 = dateTime0.withZone(dateTimeZone63);
        java.lang.String str66 = dateTimeZone63.getName((-3599200009L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.joda.time.Period period1 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType2 = period1.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(2457L, periodType2);
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean11 = mutableInterval6.isBefore((org.joda.time.ReadableInterval) mutableInterval10);
        long long12 = mutableInterval6.getStartMillis();
        java.lang.Object obj13 = mutableInterval6.clone();
        boolean boolean14 = mutableInterval6.isBeforeNow();
        mutablePeriod3.add((org.joda.time.ReadableInterval) mutableInterval6);
        org.joda.time.Period period16 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType17 = period16.getPeriodType();
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean28 = mutableInterval23.isBefore((org.joda.time.ReadableInterval) mutableInterval27);
        boolean boolean29 = mutableInterval20.contains((org.joda.time.ReadableInterval) mutableInterval27);
        mutableInterval20.setDurationAfterStart(0L);
        boolean boolean32 = mutableInterval20.containsNow();
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean43 = mutableInterval38.isBefore((org.joda.time.ReadableInterval) mutableInterval42);
        boolean boolean44 = mutableInterval35.contains((org.joda.time.ReadableInterval) mutableInterval42);
        mutableInterval35.setDurationAfterStart(0L);
        boolean boolean47 = mutableInterval35.containsNow();
        boolean boolean48 = mutableInterval20.isAfter((org.joda.time.ReadableInterval) mutableInterval35);
        mutableInterval35.setDurationBeforeEnd(355200035L);
        org.joda.time.Chronology chronology51 = mutableInterval35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3, periodType17, chronology51);
        mutablePeriod52.setMinutes(52);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone58);
        java.util.Locale locale60 = null;
        java.util.Calendar calendar61 = dateTime59.toCalendar(locale60);
        org.joda.time.Instant instant62 = dateTime59.toInstant();
        boolean boolean63 = instant62.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone65);
        int int67 = dateTime66.getDayOfMonth();
        org.joda.time.DateTime dateTime69 = dateTime66.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property70 = dateTime69.dayOfYear();
        org.joda.time.DateTime dateTime71 = property70.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime73 = property70.addWrapFieldToCopy(1);
        org.joda.time.Days days74 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) instant62, (org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.Chronology chronology75 = instant62.getChronology();
        mutablePeriod52.setPeriod(1645513200000L, (-113605342300799920L), chronology75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime59 and instant62", (dateTime59.compareTo(instant62) == 0) == dateTime59.equals(instant62));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.joda.time.Period period2 = new org.joda.time.Period((-86400L), 271254L);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone4);
        int int6 = dateTime5.getSecondOfMinute();
        org.joda.time.DateTime dateTime8 = dateTime5.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime10 = dateTime5.withMillisOfDay((int) (byte) 1);
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 1, periodType14, chronology19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', chronology19);
        org.joda.time.ReadablePartial readablePartial22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.withFields(readablePartial22);
        boolean boolean24 = instant11.isAfter((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime.Property property25 = dateTime21.dayOfWeek();
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
        org.joda.time.DateTime dateTime41 = dateTime21.withZone(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = dateTime41.toDateTime(dateTimeZone42);
        org.joda.time.Seconds seconds44 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Duration duration46 = new org.joda.time.Duration((long) 496);
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str49 = periodType48.getName();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) (short) -1, periodType48);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period61 = org.joda.time.Period.days((-1));
        org.joda.time.Period period63 = period61.withWeeks((int) 'a');
        java.lang.String str64 = period61.toString();
        mutablePeriod59.setPeriod((org.joda.time.ReadablePeriod) period61);
        int int66 = mutablePeriod59.getMillis();
        org.joda.time.DurationFieldType durationFieldType68 = mutablePeriod59.getFieldType(0);
        int int69 = periodType48.indexOf(durationFieldType68);
        org.joda.time.Period period70 = duration46.toPeriod(periodType48);
        org.joda.time.Instant instant71 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval78 = mutableInterval77.toInterval();
        org.joda.time.Chronology chronology79 = interval78.getChronology();
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((long) 1, periodType74, chronology79);
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime((long) '4', chronology79);
        org.joda.time.ReadablePartial readablePartial82 = null;
        org.joda.time.DateTime dateTime83 = dateTime81.withFields(readablePartial82);
        boolean boolean84 = instant71.isAfter((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.DateTime.Property property85 = dateTime81.dayOfWeek();
        org.joda.time.DateTime dateTime86 = property85.withMaximumValue();
        org.joda.time.DurationField durationField87 = property85.getRangeDurationField();
        org.joda.time.DateTime dateTime88 = property85.getDateTime();
        org.joda.time.DateTime.Property property89 = dateTime88.minuteOfDay();
        org.joda.time.Interval interval90 = duration46.toIntervalTo((org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.MutableInterval mutableInterval91 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.DateTime dateTime93 = dateTime88.minusMinutes(1380);
        org.joda.time.DateTime dateTime95 = dateTime88.plusHours(2022);
        org.joda.time.Instant instant96 = dateTime95.toInstant();
        org.joda.time.Duration duration97 = period2.toDurationFrom((org.joda.time.ReadableInstant) dateTime95);
        org.joda.time.Duration duration99 = duration97.plus(1154984486400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime95 and instant96", (dateTime95.compareTo(instant96) == 0) == dateTime95.equals(instant96));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1");
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = seconds3.dividedBy(11);
        org.joda.time.Duration duration6 = seconds5.toStandardDuration();
        long long7 = duration6.getStandardMinutes();
        org.joda.time.Instant instant9 = instant2.withDurationAdded((org.joda.time.ReadableDuration) duration6, 800);
        org.joda.time.DateTime dateTime10 = instant9.toDateTimeISO();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType13);
        mutablePeriod14.setMonths((int) (byte) -1);
        mutablePeriod14.addMillis(100);
        org.joda.time.Duration duration19 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval46 = duration19.toIntervalTo((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period49 = duration19.toPeriodFrom((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone51);
        int int53 = dateTime52.getMillisOfDay();
        org.joda.time.DateTime dateTime55 = dateTime52.plusMillis((int) '#');
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        org.joda.time.Chronology chronology63 = interval62.getChronology();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) 1, periodType58, chronology63);
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) '4', chronology63);
        org.joda.time.DateTime dateTime66 = dateTime55.withChronology(chronology63);
        org.joda.time.Interval interval67 = duration19.toIntervalFrom((org.joda.time.ReadableInstant) dateTime55);
        mutablePeriod14.setPeriod((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Interval interval69 = new org.joda.time.Interval((org.joda.time.ReadableInstant) instant9, (org.joda.time.ReadableDuration) duration19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime10", (instant9.compareTo(dateTime10) == 0) == instant9.equals(dateTime10));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.time.Period period4 = new org.joda.time.Period(3600, 1380, 1439, 50);
        org.joda.time.Period period6 = period4.withWeeks(1);
        org.joda.time.Period period8 = period4.withHours(29918);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone10);
        int int12 = dateTime11.getDayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime11.withMillisOfDay((int) 'a');
        org.joda.time.LocalDateTime localDateTime15 = dateTime11.toLocalDateTime();
        java.lang.String str16 = localDateTime15.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = localDateTime15.getFieldType(1);
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType18.getRangeDurationType();
        int int21 = period8.get(durationFieldType20);
        boolean boolean23 = period8.equals((java.lang.Object) "1970-01-05T01:00:00.045");
        org.joda.time.Period period25 = period8.minusMillis(376);
        java.lang.Object obj26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.DateTimeZone dateTimeZone33 = chronology32.getZone();
        java.lang.String str35 = dateTimeZone33.getName(100L);
        org.joda.time.DateTime dateTime36 = dateTime27.withZoneRetainFields(dateTimeZone33);
        java.lang.String str37 = dateTimeZone33.getID();
        org.joda.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = dateTimeZone33.isLocalDateTimeGap(localDateTime38);
        int int41 = dateTimeZone33.getStandardOffset((long) 6);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(obj26, dateTimeZone33);
        org.joda.time.Duration duration43 = period25.toDurationFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale46 = null;
        java.lang.String str47 = dateTimeZone44.getName(164096150400000L, locale46);
        java.util.TimeZone timeZone48 = dateTimeZone44.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(dateTimeZone49);
        java.lang.String str51 = dateTimeZone49.toString();
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(dateTimeZone49);
        org.joda.time.Period period54 = org.joda.time.Period.days((-1));
        org.joda.time.Period period56 = period54.withWeeks((int) 'a');
        int int57 = period56.getDays();
        org.joda.time.Duration duration58 = period56.toStandardDuration();
        org.joda.time.Days days59 = duration58.toStandardDays();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone61);
        java.util.Locale locale63 = null;
        java.util.Calendar calendar64 = dateTime62.toCalendar(locale63);
        org.joda.time.DateTime dateTime66 = dateTime62.minus((long) 57);
        org.joda.time.Period period67 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration58, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Interval interval68 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableDuration) duration58);
        org.joda.time.Duration duration70 = duration43.withDurationAdded((org.joda.time.ReadableDuration) duration58, 3652);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime50", (dateTime27.compareTo(dateTime50) == 0) == dateTime27.equals(dateTime50));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.DateTime.Property property12 = dateTime11.era();
        org.joda.time.DateTime dateTime14 = dateTime11.minusYears((int) '#');
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType18 = null;
        int int19 = minutes17.get(durationFieldType18);
        int int21 = minutes17.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod22 = minutes17.toMutablePeriod();
        boolean boolean23 = minutes15.isLessThan(minutes17);
        org.joda.time.PeriodType periodType24 = minutes15.getPeriodType();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant0, (org.joda.time.ReadableInstant) dateTime14, periodType24);
        org.joda.time.MutableDateTime mutableDateTime26 = instant0.toMutableDateTimeISO();
        boolean boolean28 = instant0.isEqual(31622402022L);
        org.joda.time.Instant instant30 = instant0.withMillis((-6380816000400000L));
        org.joda.time.Chronology chronology31 = instant0.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime26", (instant0.compareTo(mutableDateTime26) == 0) == instant0.equals(mutableDateTime26));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        boolean boolean6 = instant5.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone8);
        int int10 = dateTime9.getDayOfMonth();
        org.joda.time.DateTime dateTime12 = dateTime9.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfYear();
        org.joda.time.DateTime dateTime14 = property13.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime16 = property13.addWrapFieldToCopy(1);
        org.joda.time.Days days17 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) instant5, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Chronology chronology18 = instant5.getChronology();
        org.joda.time.Instant instant21 = instant5.withDurationAdded(2922770L, (int) (byte) 0);
        org.joda.time.Chronology chronology22 = instant21.getChronology();
        long long23 = instant21.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        long long6 = dateTimeZone2.convertLocalToUTC(355200035L, false, (long) (byte) 100);
        boolean boolean8 = dateTimeZone2.isStandardOffset((long) (short) 100);
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
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Instant instant26 = dateTime25.toInstant();
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) instant26);
        org.joda.time.Instant instant29 = instant26.withMillis((long) 496);
        org.joda.time.DateTime dateTime30 = instant26.toDateTime();
        boolean boolean31 = dateTimeZone2.equals((java.lang.Object) instant26);
        org.joda.time.Instant instant33 = instant26.withMillis(7205846400000L);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(0L);
        org.joda.time.Minutes minutes36 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) instant33, (org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Instant instant38 = instant33.minus(428400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant26", (dateTime25.compareTo(instant26) == 0) == dateTime25.equals(instant26));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
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
        org.joda.time.DateTime dateTime19 = dateTime15.withMillis(6216719587200001L);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.Instant instant21 = dateTime20.toInstant();
        org.joda.time.DateTime.Property property22 = dateTime20.minuteOfDay();
        boolean boolean23 = dateTime20.isEqualNow();
        int int24 = dateTime20.getCenturyOfEra();
        boolean boolean25 = dateTime15.isBefore((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone27);
        int int29 = dateTime28.getDayOfMonth();
        org.joda.time.DateTime dateTime31 = dateTime28.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property32 = dateTime31.dayOfYear();
        org.joda.time.DateTime dateTime33 = property32.roundHalfFloorCopy();
        java.util.Locale locale34 = null;
        int int35 = property32.getMaximumTextLength(locale34);
        java.lang.String str36 = property32.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property32.getFieldType();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getDurationType();
        boolean boolean39 = dateTime15.isSupported(dateTimeFieldType37);
        org.joda.time.Days days41 = org.joda.time.Days.ONE;
        org.joda.time.Days days42 = org.joda.time.Days.ZERO;
        boolean boolean43 = days41.isLessThan(days42);
        java.lang.String str44 = days41.toString();
        org.joda.time.Days days45 = days41.negated();
        org.joda.time.PeriodType periodType46 = days45.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(periodType46);
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean58 = mutableInterval53.isBefore((org.joda.time.ReadableInterval) mutableInterval57);
        boolean boolean59 = mutableInterval50.contains((org.joda.time.ReadableInterval) mutableInterval57);
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        long long65 = interval63.toDurationMillis();
        org.joda.time.Interval interval67 = interval63.withEndMillis((long) (short) 100);
        mutableInterval57.setInterval((org.joda.time.ReadableInterval) interval63);
        org.joda.time.Interval interval70 = interval63.withStartMillis((-61394288400000L));
        org.joda.time.DateTime dateTime71 = interval70.getEnd();
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone73);
        int int75 = dateTime74.getDayOfMonth();
        org.joda.time.DateTime dateTime77 = dateTime74.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime79 = dateTime77.withYear(0);
        org.joda.time.Chronology chronology80 = dateTime77.getChronology();
        org.joda.time.Interval interval81 = interval70.withChronology(chronology80);
        org.joda.time.DurationField durationField82 = chronology80.years();
        org.joda.time.Period period83 = new org.joda.time.Period(8841599948L, periodType46, chronology80);
        org.joda.time.DateTime dateTime84 = dateTime15.toDateTime(chronology80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime20", (instant0.compareTo(dateTime20) == 0) == instant0.equals(dateTime20));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval2.setDurationAfterStart(0L);
        boolean boolean14 = mutableInterval2.containsNow();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        long long20 = interval18.toDurationMillis();
        org.joda.time.Interval interval22 = interval18.withEndMillis((long) (short) 100);
        long long23 = interval18.toDurationMillis();
        boolean boolean24 = mutableInterval2.overlaps((org.joda.time.ReadableInterval) interval18);
        boolean boolean26 = interval18.contains((long) (-1));
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutableInterval mutableInterval32 = interval30.toMutableInterval();
        boolean boolean33 = interval18.contains((org.joda.time.ReadableInterval) interval30);
        org.joda.time.Duration duration34 = interval30.toDuration();
        java.lang.String str35 = interval30.toString();
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
        org.joda.time.Period period51 = org.joda.time.Period.days((-1));
        org.joda.time.Period period53 = period51.withWeeks((int) 'a');
        org.joda.time.Period period55 = period51.plusMonths((int) (short) -1);
        org.joda.time.Period period57 = period51.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime58 = dateTime46.plus((org.joda.time.ReadablePeriod) period51);
        org.joda.time.DateTime.Property property59 = dateTime46.dayOfYear();
        int int60 = dateTime46.getDayOfWeek();
        boolean boolean61 = interval30.isAfter((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Hours hours62 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval30);
        org.joda.time.Minutes minutes64 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType65 = null;
        int int66 = minutes64.get(durationFieldType65);
        int int68 = minutes64.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod69 = minutes64.toMutablePeriod();
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval74 = mutableInterval73.toInterval();
        org.joda.time.Chronology chronology75 = interval74.getChronology();
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime(chronology75);
        org.joda.time.DateTime dateTime78 = dateTime76.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime80 = dateTime78.plus((long) (short) -1);
        org.joda.time.DateTime dateTime83 = dateTime80.withDurationAdded((long) 100, (int) (short) 100);
        org.joda.time.Chronology chronology84 = dateTime83.getChronology();
        mutablePeriod69.add((long) 12, chronology84);
        org.joda.time.DateTimeZone dateTimeZone87 = null;
        org.joda.time.DateTime dateTime88 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone87);
        java.util.Locale locale89 = null;
        java.util.Calendar calendar90 = dateTime88.toCalendar(locale89);
        boolean boolean92 = dateTime88.isEqual((long) 3);
        org.joda.time.MutableInterval mutableInterval93 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) mutablePeriod69, (org.joda.time.ReadableInstant) dateTime88);
        boolean boolean94 = interval30.isAfter((org.joda.time.ReadableInstant) dateTime88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant36 and dateTime76", (instant36.compareTo(dateTime76) == 0) == instant36.equals(dateTime76));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getSecondOfMinute();
        int int4 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime6 = dateTime2.withYear((int) (byte) 100);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.DateTime.Property property10 = dateTime6.secondOfDay();
        org.joda.time.DateTime dateTime12 = dateTime6.minusWeeks(366);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType18 = null;
        int int19 = minutes17.get(durationFieldType18);
        int int21 = minutes17.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod22 = minutes17.toMutablePeriod();
        boolean boolean23 = minutes15.isLessThan(minutes17);
        org.joda.time.PeriodType periodType24 = minutes15.getPeriodType();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, periodType27, chronology32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) '4', chronology32);
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
        boolean boolean49 = dateTime34.isAfter((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Chronology chronology50 = dateTime34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 49, periodType24, chronology50);
        org.joda.time.DateTimeField dateTimeField52 = dateTimeFieldType13.getField(chronology50);
        org.joda.time.DurationFieldType durationFieldType53 = dateTimeFieldType13.getDurationType();
        org.joda.time.DateTime.Property property54 = dateTime6.property(dateTimeFieldType13);
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(chronology59);
        int int61 = dateTime60.getSecondOfMinute();
        org.joda.time.DateTime dateTime63 = dateTime60.withWeekyear(3);
        org.joda.time.DateTime.Property property64 = dateTime60.weekOfWeekyear();
        org.joda.time.DateTime dateTime65 = property64.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone67);
        int int69 = dateTime68.getMillisOfDay();
        org.joda.time.DateTime dateTime71 = dateTime68.plusMillis((int) '#');
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval78 = mutableInterval77.toInterval();
        org.joda.time.Chronology chronology79 = interval78.getChronology();
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((long) 1, periodType74, chronology79);
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime((long) '4', chronology79);
        org.joda.time.DateTime dateTime82 = dateTime71.withChronology(chronology79);
        boolean boolean84 = dateTime82.isEqual(187200000L);
        org.joda.time.DateTime dateTime85 = dateTime82.toDateTimeISO();
        int int86 = property64.getDifference((org.joda.time.ReadableInstant) dateTime85);
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = property64.getFieldType();
        org.joda.time.DateTime dateTime89 = property64.addWrapFieldToCopy(24703637);
        java.lang.String str90 = dateTime89.toString();
        boolean boolean92 = dateTime89.isAfter((-1104537839948L));
        org.joda.time.DateTime dateTime94 = dateTime89.withMillis((long) (short) -1);
        boolean boolean95 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant35 and dateTime60", (instant35.compareTo(dateTime60) == 0) == instant35.equals(dateTime60));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
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
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone59);
        int int61 = dateTime60.getSecondOfMinute();
        int int62 = dateTime60.getMillisOfDay();
        org.joda.time.DateTime dateTime64 = dateTime60.withYear((int) (byte) 100);
        org.joda.time.Interval interval65 = interval41.withEnd((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Instant instant67 = org.joda.time.Instant.parse("1");
        org.joda.time.Instant instant69 = instant67.withMillis((long) 50);
        org.joda.time.Instant instant72 = instant69.withDurationAdded(604800000L, 923);
        org.joda.time.DateTime dateTime73 = instant72.toDateTime();
        org.joda.time.Interval interval74 = interval41.withEnd((org.joda.time.ReadableInstant) instant72);
        java.lang.String str75 = interval41.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant72 and dateTime73", (instant72.compareTo(dateTime73) == 0) == instant72.equals(dateTime73));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 10);
        org.joda.time.Instant instant6 = instant0.withDurationAdded((-54432000000L), 3);
        org.joda.time.Instant instant8 = instant6.withMillis(52L);
        long long9 = instant6.getMillis();
        org.joda.time.Instant instant12 = instant6.withDurationAdded((-6279833754000000L), 2);
        long long13 = instant6.getMillis();
        org.joda.time.Instant instant15 = instant6.plus(39L);
        org.joda.time.DateTimeZone dateTimeZone16 = instant6.getZone();
        org.joda.time.Instant instant18 = instant6.withMillis(26300753899436179L);
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.Duration duration20 = seconds19.toStandardDuration();
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
        int int54 = duration20.compareTo((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Duration duration55 = duration20.toDuration();
        org.joda.time.Instant instant57 = instant6.withDurationAdded((org.joda.time.ReadableDuration) duration20, 360);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime31", (instant8.compareTo(dateTime31) == 0) == instant8.equals(dateTime31));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.time.Period period1 = org.joda.time.Period.hours(22);
        org.joda.time.Period period3 = period1.withHours(83400);
        org.joda.time.Duration duration4 = period1.toStandardDuration();
        org.joda.time.Duration duration6 = duration4.minus((long) 39);
        org.joda.time.Duration duration7 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval34 = duration7.toIntervalTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period37 = duration7.toPeriodFrom((org.joda.time.ReadableInstant) dateTime36);
        long long38 = duration7.getMillis();
        org.joda.time.Instant instant39 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 1, periodType42, chronology47);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) '4', chronology47);
        org.joda.time.ReadablePartial readablePartial50 = null;
        org.joda.time.DateTime dateTime51 = dateTime49.withFields(readablePartial50);
        boolean boolean52 = instant39.isAfter((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime.Property property53 = dateTime49.dayOfWeek();
        org.joda.time.DateTime dateTime54 = property53.withMaximumValue();
        org.joda.time.DateTime dateTime56 = dateTime54.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant57 = new org.joda.time.Instant((java.lang.Object) dateTime54);
        java.lang.String str58 = instant57.toString();
        org.joda.time.DateTime dateTime59 = instant57.toDateTimeISO();
        org.joda.time.Instant instant61 = instant57.plus((-2209338000000L));
        org.joda.time.PeriodType periodType63 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str64 = periodType63.getName();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) (short) -1, periodType63);
        org.joda.time.PeriodType periodType66 = periodType63.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, (org.joda.time.ReadableInstant) instant57, periodType63);
        org.joda.time.Period period68 = duration6.toPeriod(periodType63);
        org.joda.time.Duration duration70 = duration6.minus((-349197543L));
        org.joda.time.Instant instant71 = org.joda.time.Instant.now();
        org.joda.time.Instant instant73 = instant71.minus(100L);
        org.joda.time.DateTime dateTime74 = instant73.toDateTimeISO();
        org.joda.time.Hours hours75 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours76 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours77 = hours75.minus(hours76);
        org.joda.time.Hours hours78 = org.joda.time.Hours.ONE;
        boolean boolean79 = hours75.isLessThan(hours78);
        org.joda.time.DateTime dateTime80 = dateTime74.minus((org.joda.time.ReadablePeriod) hours78);
        org.joda.time.DateTime dateTime82 = dateTime74.plusWeeks((int) (short) -1);
        boolean boolean84 = dateTime74.isEqual(126227808000L);
        org.joda.time.DateTime dateTime86 = dateTime74.withCenturyOfEra(17);
        int int87 = dateTime86.getMonthOfYear();
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration70, (org.joda.time.ReadableInstant) dateTime86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime54 and instant57", (dateTime54.compareTo(instant57) == 0) == dateTime54.equals(instant57));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
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
        org.joda.time.DateTime dateTime21 = dateTime19.minusMillis((int) 'a');
        org.joda.time.DateTime dateTime23 = dateTime19.withCenturyOfEra(0);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str26 = periodType25.getName();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) (short) -1, periodType25);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period38 = org.joda.time.Period.days((-1));
        org.joda.time.Period period40 = period38.withWeeks((int) 'a');
        java.lang.String str41 = period38.toString();
        mutablePeriod36.setPeriod((org.joda.time.ReadablePeriod) period38);
        int int43 = mutablePeriod36.getMillis();
        org.joda.time.DurationFieldType durationFieldType45 = mutablePeriod36.getFieldType(0);
        int int46 = periodType25.indexOf(durationFieldType45);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType48 = dateTimeFieldType47.getRangeDurationType();
        boolean boolean49 = periodType25.equals((java.lang.Object) durationFieldType48);
        org.joda.time.DateTime dateTime51 = dateTime19.withFieldAdded(durationFieldType48, 1380);
        org.joda.time.Instant instant52 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.Chronology chronology60 = interval59.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 1, periodType55, chronology60);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) '4', chronology60);
        org.joda.time.ReadablePartial readablePartial63 = null;
        org.joda.time.DateTime dateTime64 = dateTime62.withFields(readablePartial63);
        boolean boolean65 = instant52.isAfter((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.DateTime.Property property66 = dateTime62.dayOfWeek();
        org.joda.time.DateTime dateTime67 = property66.withMaximumValue();
        org.joda.time.DurationField durationField68 = property66.getRangeDurationField();
        org.joda.time.DateTime dateTime69 = property66.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime71 = dateTime69.toDateTime(dateTimeZone70);
        org.joda.time.DateTime dateTime73 = dateTime71.withWeekyear(19);
        org.joda.time.Period period74 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime71);
        int int75 = period74.getYears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime62 and dateTime71", (dateTime62.compareTo(dateTime71) == 0) == dateTime62.equals(dateTime71));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays(100L);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withFields(readablePartial12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfDay();
        org.joda.time.DateTime dateTime16 = dateTime13.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property17 = dateTime13.era();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Interval interval20 = duration1.toIntervalTo(readableInstant19);
        long long21 = duration1.getMillis();
        long long22 = duration1.getStandardHours();
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
        org.joda.time.DateTime dateTime38 = property37.withMaximumValue();
        org.joda.time.DateTime dateTime40 = dateTime38.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((java.lang.Object) dateTime38);
        int int42 = dateTime38.getDayOfMonth();
        org.joda.time.DateTime dateTime44 = dateTime38.minusYears(1969);
        org.joda.time.DateMidnight dateMidnight45 = dateTime38.toDateMidnight();
        org.joda.time.Interval interval46 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateMidnight45);
        boolean boolean48 = dateMidnight45.equals((java.lang.Object) 31622402022L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and instant41", (dateTime38.compareTo(instant41) == 0) == dateTime38.equals(instant41));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.LocalDateTime localDateTime6 = dateTime2.toLocalDateTime();
        org.joda.time.DateTime.Property property7 = dateTime2.dayOfYear();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str9 = periodType8.getName();
        org.joda.time.PeriodType periodType10 = periodType8.withSecondsRemoved();
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        long long16 = interval14.toDurationMillis();
        org.joda.time.Interval interval18 = interval14.withEndMillis((long) (short) 100);
        org.joda.time.Interval interval19 = interval18.toInterval();
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.Instant instant22 = instant20.minus(100L);
        org.joda.time.DateTime dateTime23 = instant22.toDateTimeISO();
        int int24 = dateTime23.getYear();
        org.joda.time.Duration duration25 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 1, periodType28, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) '4', chronology33);
        org.joda.time.ReadablePartial readablePartial36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.withFields(readablePartial36);
        org.joda.time.DateTime.Property property38 = dateTime37.millisOfDay();
        org.joda.time.DateTime dateTime39 = dateTime37.withEarlierOffsetAtOverlap();
        int int40 = dateTime37.getDayOfWeek();
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 1, periodType42, chronology47);
        org.joda.time.DateTimeField dateTimeField49 = chronology47.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone50 = chronology47.getZone();
        org.joda.time.DateTime dateTime51 = dateTime37.withChronology(chronology47);
        org.joda.time.Interval interval52 = duration25.toIntervalTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period55 = duration25.toPeriodFrom((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime54);
        boolean boolean57 = interval18.isBefore((org.joda.time.ReadableInstant) dateTime23);
        boolean boolean58 = periodType10.equals((java.lang.Object) dateTime23);
        org.joda.time.Seconds seconds59 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime23);
        int int60 = seconds59.getSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant22 and dateTime23", (instant22.compareTo(dateTime23) == 0) == instant22.equals(dateTime23));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.DateTime.Property property12 = dateTime11.era();
        org.joda.time.DateTime dateTime14 = dateTime11.minusYears((int) '#');
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType18 = null;
        int int19 = minutes17.get(durationFieldType18);
        int int21 = minutes17.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod22 = minutes17.toMutablePeriod();
        boolean boolean23 = minutes15.isLessThan(minutes17);
        org.joda.time.PeriodType periodType24 = minutes15.getPeriodType();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant0, (org.joda.time.ReadableInstant) dateTime14, periodType24);
        org.joda.time.MutableDateTime mutableDateTime26 = instant0.toMutableDateTimeISO();
        boolean boolean28 = instant0.isEqual(31622402022L);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(1154984486400032L);
        org.joda.time.DateTime dateTime32 = dateTime30.minusMillis(0);
        int int33 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime35 = dateTime30.minusWeeks(26557);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime26", (instant0.compareTo(mutableDateTime26) == 0) == instant0.equals(mutableDateTime26));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval2.setDurationAfterStart(0L);
        boolean boolean14 = mutableInterval2.containsNow();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean25 = mutableInterval20.isBefore((org.joda.time.ReadableInterval) mutableInterval24);
        boolean boolean26 = mutableInterval17.contains((org.joda.time.ReadableInterval) mutableInterval24);
        mutableInterval17.setDurationAfterStart(0L);
        boolean boolean29 = mutableInterval17.containsNow();
        boolean boolean30 = mutableInterval2.isAfter((org.joda.time.ReadableInterval) mutableInterval17);
        org.joda.time.Duration duration31 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration32 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 1, periodType35, chronology40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) '4', chronology40);
        org.joda.time.ReadablePartial readablePartial43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.withFields(readablePartial43);
        org.joda.time.DateTime.Property property45 = dateTime44.millisOfDay();
        org.joda.time.DateTime dateTime46 = dateTime44.withEarlierOffsetAtOverlap();
        int int47 = dateTime44.getDayOfWeek();
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 1, periodType49, chronology54);
        org.joda.time.DateTimeField dateTimeField56 = chronology54.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone57 = chronology54.getZone();
        org.joda.time.DateTime dateTime58 = dateTime44.withChronology(chronology54);
        org.joda.time.Interval interval59 = duration32.toIntervalTo((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period62 = duration32.toPeriodFrom((org.joda.time.ReadableInstant) dateTime61);
        boolean boolean63 = duration31.isShorterThan((org.joda.time.ReadableDuration) duration32);
        mutableInterval2.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Minutes minutes66 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType67 = null;
        int int68 = minutes66.get(durationFieldType67);
        int int70 = minutes66.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod71 = minutes66.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType73 = minutes66.getFieldType(0);
        org.joda.time.Duration duration74 = minutes66.toStandardDuration();
        boolean boolean75 = duration32.isLongerThan((org.joda.time.ReadableDuration) duration74);
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval82 = mutableInterval81.toInterval();
        org.joda.time.Chronology chronology83 = interval82.getChronology();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) 1, periodType78, chronology83);
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime((long) '4', chronology83);
        org.joda.time.DateTime.Property property86 = dateTime85.era();
        org.joda.time.DateTime dateTime88 = dateTime85.minusYears((int) '#');
        int int89 = dateTime85.getCenturyOfEra();
        org.joda.time.Interval interval90 = duration74.toIntervalFrom((org.joda.time.ReadableInstant) dateTime85);
        org.joda.time.ReadableDuration readableDuration91 = null;
        org.joda.time.Interval interval92 = interval90.withDurationBeforeEnd(readableDuration91);
        org.joda.time.Chronology chronology93 = interval92.getChronology();
        org.joda.time.DurationField durationField94 = chronology93.eras();
        org.joda.time.DurationField durationField95 = chronology93.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField94, durationField95, and durationField94", !(durationField94.compareTo(durationField95) == 0) || (Math.signum(durationField94.compareTo(durationField94)) == Math.signum(durationField95.compareTo(durationField94))));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
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
        org.joda.time.Instant instant20 = instant17.withMillis((long) 496);
        org.joda.time.DateTime dateTime21 = instant17.toDateTime();
        org.joda.time.Instant instant23 = instant17.plus(495L);
        boolean boolean24 = instant23.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant17", (dateTime16.compareTo(instant17) == 0) == dateTime16.equals(instant17));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        boolean boolean6 = instant5.isAfterNow();
        org.joda.time.Instant instant8 = instant5.minus(2880000000L);
        org.joda.time.Instant instant9 = instant5.toInstant();
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
        org.joda.time.DateTime.Property property24 = dateTime20.dayOfWeek();
        org.joda.time.DateTime dateTime25 = property24.withMaximumValue();
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((java.lang.Object) dateTime25);
        org.joda.time.DateTime.Property property29 = dateTime25.secondOfDay();
        org.joda.time.Hours hours30 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) instant9, (org.joda.time.ReadableInstant) dateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant9", (dateTime2.compareTo(instant9) == 0) == dateTime2.equals(instant9));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
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
        org.joda.time.DateTime dateTime27 = dateTime25.plusDays((int) (byte) 1);
        org.joda.time.Instant instant28 = dateTime25.toInstant();
        org.joda.time.LocalDate localDate29 = dateTime25.toLocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        boolean boolean31 = localDate29.isSupported(dateTimeFieldType30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant28", (dateTime9.compareTo(instant28) == 0) == dateTime9.equals(instant28));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 10, 86399, 11, 7, 43, 43, (int) (short) 100, (int) 'a');
        org.joda.time.Period period10 = period8.withMillis(2);
        org.joda.time.Period period12 = period10.plusMinutes(0);
        org.joda.time.Period period14 = period12.withWeeks(23);
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, periodType18, chronology23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', chronology23);
        org.joda.time.ReadablePartial readablePartial26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.withFields(readablePartial26);
        boolean boolean28 = instant15.isAfter((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Duration duration29 = period14.toDurationTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Period period31 = new org.joda.time.Period((long) 100);
        int int32 = period31.getDays();
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.MutableInterval mutableInterval38 = interval36.toMutableInterval();
        org.joda.time.DateTime dateTime39 = interval36.getEnd();
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period31, (org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.MutableInterval mutableInterval41 = mutableInterval40.copy();
        java.lang.Object obj42 = mutableInterval41.clone();
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
        org.joda.time.DateTime.Property property58 = dateTime54.era();
        org.joda.time.Duration duration60 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime62 = dateTime54.withDurationAdded((org.joda.time.ReadableDuration) duration60, 0);
        int int63 = dateTime62.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        long long70 = dateTimeZone66.convertLocalToUTC(355200035L, false, (long) (byte) 100);
        boolean boolean72 = dateTimeZone66.isStandardOffset((long) (short) 100);
        org.joda.time.DateTime dateTime73 = dateTime62.toDateTime(dateTimeZone66);
        boolean boolean74 = mutableInterval41.isBefore((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration29, (org.joda.time.ReadableInstant) dateTime73);
        int int76 = period75.getSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime73", (dateTime25.compareTo(dateTime73) == 0) == dateTime25.equals(dateTime73));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.DateTime.Property property2 = dateTime0.minuteOfDay();
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
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone19);
        int int21 = dateTime20.getDayOfMonth();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, periodType23, chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology28.getZone();
        org.joda.time.DateTime dateTime32 = dateTime20.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = dateTime13.withZone(dateTimeZone31);
        org.joda.time.Seconds seconds34 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime13.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime7 = dateTime5.withYear(0);
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
        java.lang.String str33 = dateTime17.toString();
        boolean boolean34 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime36 = dateTime17.minusMillis((-3600000));
        org.joda.time.DateTime.Property property37 = dateTime17.secondOfMinute();
        int int38 = property37.getMaximumValueOverall();
        org.joda.time.DateTime dateTime40 = property37.addToCopy((long) 999);
        org.joda.time.DateTime dateTime41 = dateTime40.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(3600);
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone43);
        int int46 = dateTimeZone43.getOffsetFromLocal((-71312400086400004L));
        org.joda.time.DateTime dateTime47 = dateTime41.withZoneRetainFields(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and dateTime44", (instant18.compareTo(dateTime44) == 0) == instant18.equals(dateTime44));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 1, periodType9, chronology14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) '4', chronology14);
        org.joda.time.ReadablePartial readablePartial17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.withFields(readablePartial17);
        boolean boolean19 = instant6.isAfter((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property20 = dateTime16.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone22);
        int int24 = dateTime23.getDayOfMonth();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, periodType26, chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone34 = chronology31.getZone();
        org.joda.time.DateTime dateTime35 = dateTime23.withZoneRetainFields(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = dateTime16.withZone(dateTimeZone34);
        org.joda.time.Duration duration38 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableDuration) duration38);
        org.joda.time.Hours hours40 = org.joda.time.Hours.MIN_VALUE;
        org.joda.time.PeriodType periodType41 = hours40.getPeriodType();
        org.joda.time.Period period42 = duration38.toPeriod(periodType41);
        org.joda.time.Duration duration43 = duration38.toDuration();
        org.joda.time.Instant instant44 = instant5.minus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone46);
        org.joda.time.DateTime dateTime48 = dateTime47.withLaterOffsetAtOverlap();
        org.joda.time.Duration duration49 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration50 = duration49.toDuration();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableDuration) duration49);
        java.lang.String str52 = duration49.toString();
        org.joda.time.Minutes minutes53 = duration49.toStandardMinutes();
        long long54 = duration49.getStandardHours();
        org.joda.time.Instant instant55 = instant44.minus((org.joda.time.ReadableDuration) duration49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant5", (dateTime2.compareTo(instant5) == 0) == dateTime2.equals(instant5));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.MutableInterval mutableInterval5 = interval3.toMutableInterval();
        org.joda.time.DateTime dateTime6 = interval3.getStart();
        org.joda.time.Period period7 = interval3.toPeriod();
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean18 = mutableInterval13.isBefore((org.joda.time.ReadableInterval) mutableInterval17);
        boolean boolean19 = mutableInterval10.contains((org.joda.time.ReadableInterval) mutableInterval17);
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval17);
        long long21 = mutableInterval17.getEndMillis();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean32 = mutableInterval27.isBefore((org.joda.time.ReadableInterval) mutableInterval31);
        boolean boolean33 = mutableInterval24.contains((org.joda.time.ReadableInterval) mutableInterval31);
        mutableInterval17.setInterval((org.joda.time.ReadableInterval) mutableInterval31);
        org.joda.time.Duration duration35 = mutableInterval17.toDuration();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(0, 2, (int) (byte) 100, (int) (byte) 100);
        mutableInterval17.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) mutablePeriod40);
        boolean boolean42 = interval3.isBefore((org.joda.time.ReadableInterval) mutableInterval17);
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
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone59);
        int int61 = dateTime60.getDayOfMonth();
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.Chronology chronology68 = interval67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 1, periodType63, chronology68);
        org.joda.time.DateTimeField dateTimeField70 = chronology68.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone71 = chronology68.getZone();
        org.joda.time.DateTime dateTime72 = dateTime60.withZoneRetainFields(dateTimeZone71);
        org.joda.time.DateTime dateTime73 = dateTime53.withZone(dateTimeZone71);
        org.joda.time.DateTime dateTime75 = dateTime53.minusWeeks(0);
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forOffsetMillis(349200000);
        long long80 = dateTimeZone77.convertLocalToUTC(0L, false);
        org.joda.time.DateTime dateTime81 = dateTime53.toDateTime(dateTimeZone77);
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone83);
        int int85 = dateTime84.getDayOfMonth();
        org.joda.time.DateTime.Property property86 = dateTime84.weekOfWeekyear();
        org.joda.time.DateTime dateTime88 = dateTime84.plusSeconds(22598);
        org.joda.time.PeriodType periodType89 = org.joda.time.PeriodType.seconds();
        org.joda.time.Period period90 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime81, (org.joda.time.ReadableInstant) dateTime88, periodType89);
        org.joda.time.Interval interval91 = interval3.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime53 and dateTime81", (dateTime53.compareTo(dateTime81) == 0) == dateTime53.equals(dateTime81));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes2, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTime dateTime9 = instant7.toDateTimeISO();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.minuteOfDay();
        org.joda.time.DateTime dateTime19 = dateTime9.toDateTime(chronology16);
        int int20 = dateTime9.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime9", (instant7.compareTo(dateTime9) == 0) == instant7.equals(dateTime9));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.MutableInterval mutableInterval5 = interval3.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean16 = mutableInterval11.isBefore((org.joda.time.ReadableInterval) mutableInterval15);
        boolean boolean17 = mutableInterval8.contains((org.joda.time.ReadableInterval) mutableInterval15);
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        long long23 = interval21.toDurationMillis();
        org.joda.time.Interval interval25 = interval21.withEndMillis((long) (short) 100);
        mutableInterval15.setInterval((org.joda.time.ReadableInterval) interval21);
        boolean boolean27 = interval3.isAfter((org.joda.time.ReadableInterval) interval21);
        org.joda.time.Seconds seconds28 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval21);
        org.joda.time.Period period30 = new org.joda.time.Period((long) 100);
        org.joda.time.Period period32 = period30.plusDays((-1));
        org.joda.time.Period period34 = period32.minusHours((int) 'a');
        org.joda.time.Period period36 = period32.plusMinutes(0);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period47 = org.joda.time.Period.days((-1));
        org.joda.time.Period period49 = period47.withWeeks((int) 'a');
        java.lang.String str50 = period47.toString();
        mutablePeriod45.setPeriod((org.joda.time.ReadablePeriod) period47);
        mutablePeriod45.addSeconds((int) (byte) 100);
        mutablePeriod45.addWeeks((int) ' ');
        mutablePeriod45.addMonths(2022);
        mutablePeriod45.add(496, 1969, 22594, 1969, 86399, 11, 7, (-3600000));
        org.joda.time.Period period67 = period32.withFields((org.joda.time.ReadablePeriod) mutablePeriod45);
        org.joda.time.Period period69 = period67.withMinutes((int) 'a');
        org.joda.time.Interval interval70 = interval21.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period69);
        org.joda.time.DateTime dateTime71 = interval21.getStart();
        org.joda.time.Instant instant72 = dateTime71.toInstant();
        org.joda.time.DateTime.Property property73 = dateTime71.weekyear();
        boolean boolean75 = property73.equals((java.lang.Object) 807L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime71 and instant72", (dateTime71.compareTo(instant72) == 0) == dateTime71.equals(instant72));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusSeconds((int) (short) 0);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours((long) 11);
        org.joda.time.DateTime dateTime7 = dateTime2.minus((org.joda.time.ReadableDuration) duration6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone9);
        java.util.Locale locale11 = null;
        java.util.Calendar calendar12 = dateTime10.toCalendar(locale11);
        org.joda.time.Instant instant13 = dateTime10.toInstant();
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
        org.joda.time.DateTime.Property property28 = dateTime24.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone30);
        int int32 = dateTime31.getDayOfMonth();
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 1, periodType34, chronology39);
        org.joda.time.DateTimeField dateTimeField41 = chronology39.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone42 = chronology39.getZone();
        org.joda.time.DateTime dateTime43 = dateTime31.withZoneRetainFields(dateTimeZone42);
        org.joda.time.DateTime dateTime44 = dateTime24.withZone(dateTimeZone42);
        org.joda.time.Duration duration46 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableDuration) duration46);
        org.joda.time.Hours hours48 = org.joda.time.Hours.MIN_VALUE;
        org.joda.time.PeriodType periodType49 = hours48.getPeriodType();
        org.joda.time.Period period50 = duration46.toPeriod(periodType49);
        org.joda.time.Duration duration51 = duration46.toDuration();
        org.joda.time.Instant instant52 = instant13.minus((org.joda.time.ReadableDuration) duration51);
        org.joda.time.MutableDateTime mutableDateTime53 = instant13.toMutableDateTimeISO();
        org.joda.time.Minutes minutes54 = org.joda.time.Minutes.THREE;
        org.joda.time.Minutes minutes55 = org.joda.time.Minutes.ONE;
        java.lang.String str56 = minutes55.toString();
        boolean boolean57 = minutes54.isLessThan(minutes55);
        org.joda.time.Minutes minutes59 = minutes54.dividedBy((int) (byte) 10);
        org.joda.time.Minutes minutes61 = minutes59.minus(86399);
        int int62 = minutes61.size();
        org.joda.time.PeriodType periodType63 = minutes61.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) mutableDateTime53, periodType63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant13", (dateTime2.compareTo(instant13) == 0) == dateTime2.equals(instant13));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.TimeOfDay timeOfDay2 = dateTime0.toTimeOfDay();
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean13 = mutableInterval8.isBefore((org.joda.time.ReadableInterval) mutableInterval12);
        boolean boolean14 = mutableInterval5.contains((org.joda.time.ReadableInterval) mutableInterval12);
        org.joda.time.Weeks weeks15 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval12);
        long long16 = mutableInterval12.getEndMillis();
        org.joda.time.DateTime dateTime17 = mutableInterval12.getEnd();
        org.joda.time.Duration duration18 = mutableInterval12.toDuration();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone20);
        int int22 = dateTime21.getSecondOfMinute();
        int int23 = dateTime21.getMillisOfDay();
        org.joda.time.DateTime dateTime25 = dateTime21.withYear((int) (byte) 100);
        org.joda.time.DateTime.Property property26 = dateTime25.millisOfSecond();
        org.joda.time.DateTime dateTime28 = dateTime25.plusDays(0);
        org.joda.time.DateTime dateTime30 = dateTime25.minusMillis(0);
        org.joda.time.DateTime.Property property31 = dateTime25.monthOfYear();
        org.joda.time.Interval interval32 = duration18.toIntervalFrom((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalTime localTime33 = dateTime25.toLocalTime();
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
        org.joda.time.DateTimeField dateTimeField50 = property49.getField();
        org.joda.time.DateTime dateTime51 = property49.getDateTime();
        org.joda.time.LocalTime localTime52 = dateTime51.toLocalTime();
        org.joda.time.Period period53 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime33, (org.joda.time.ReadablePartial) localTime52);
        org.joda.time.Minutes minutes54 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadablePartial) timeOfDay2, (org.joda.time.ReadablePartial) localTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.joda.time.Duration duration2 = new org.joda.time.Duration(75600100L, 1320L);
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardDays((long) (-98));
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        long long10 = interval8.toDurationMillis();
        org.joda.time.Interval interval12 = interval8.withEndMillis((long) (short) 100);
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant16 = instant13.withDurationAdded(readableDuration14, 10);
        org.joda.time.Interval interval17 = interval12.withEnd((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Instant instant19 = instant13.withMillis((long) 4);
        org.joda.time.Period period20 = duration4.toPeriodFrom((org.joda.time.ReadableInstant) instant13);
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
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) 1, periodType53, chronology58);
        org.joda.time.DateTimeField dateTimeField60 = chronology58.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone61 = chronology58.getZone();
        org.joda.time.DateTimeField dateTimeField62 = chronology58.weekOfWeekyear();
        org.joda.time.DateTime dateTime63 = org.joda.time.DateTime.now(chronology58);
        org.joda.time.PeriodType periodType65 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str66 = periodType65.getName();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) (short) -1, periodType65);
        org.joda.time.PeriodType periodType68 = periodType65.withMonthsRemoved();
        org.joda.time.Period period70 = org.joda.time.Period.minutes(3600);
        org.joda.time.DurationFieldType durationFieldType71 = org.joda.time.DurationFieldType.centuries();
        int int72 = period70.indexOf(durationFieldType71);
        boolean boolean73 = periodType65.isSupported(durationFieldType71);
        org.joda.time.Period period74 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration21, (org.joda.time.ReadableInstant) dateTime63, periodType65);
        long long75 = duration21.getStandardMinutes();
        boolean boolean76 = duration4.isEqual((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Minutes minutes77 = duration4.toStandardMinutes();
        org.joda.time.Duration duration79 = duration2.withDurationAdded((org.joda.time.ReadableDuration) duration4, 36);
        org.joda.time.Hours hours80 = duration4.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime63", (instant13.compareTo(dateTime63) == 0) == instant13.equals(dateTime63));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        mutablePeriod10.addMillis(2022);
        mutablePeriod10.setYears(52);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfCentury();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology30.getZone();
        java.lang.String str33 = dateTimeZone31.getName(100L);
        org.joda.time.DateTime dateTime34 = dateTime25.withZoneRetainFields(dateTimeZone31);
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology39.getZone();
        java.lang.String str42 = dateTimeZone40.getName(100L);
        org.joda.time.DateTime dateTime43 = dateTime34.withZoneRetainFields(dateTimeZone40);
        org.joda.time.Chronology chronology44 = chronology22.withZone(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.DateTimeZone dateTimeZone54 = chronology53.getZone();
        java.lang.String str56 = dateTimeZone54.getName(100L);
        org.joda.time.DateTime dateTime57 = dateTime48.withZoneRetainFields(dateTimeZone54);
        long long59 = dateTimeZone47.getMillisKeepLocal(dateTimeZone54, 6000035L);
        java.util.Locale locale61 = null;
        java.lang.String str62 = dateTimeZone47.getShortName((long) 1, locale61);
        org.joda.time.Chronology chronology63 = chronology44.withZone(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField64 = chronology63.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField65 = chronology63.millisOfSecond();
        mutablePeriod10.setPeriod(376L, chronology63);
        org.joda.time.Interval interval67 = new org.joda.time.Interval((-30170667715200000L), 117504000000L, chronology63);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale70 = null;
        java.lang.String str71 = dateTimeZone68.getName(164096150400000L, locale70);
        java.util.TimeZone timeZone72 = dateTimeZone68.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forTimeZone(timeZone72);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(dateTimeZone73);
        java.lang.String str75 = dateTimeZone73.toString();
        org.joda.time.Chronology chronology76 = chronology63.withZone(dateTimeZone73);
        org.joda.time.DateTimeField dateTimeField77 = chronology76.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime48 and dateTime74", (dateTime48.compareTo(dateTime74) == 0) == dateTime48.equals(dateTime74));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
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
        long long31 = duration0.getMillis();
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
        org.joda.time.DateTime.Property property46 = dateTime42.dayOfWeek();
        org.joda.time.DateTime dateTime47 = property46.withMaximumValue();
        org.joda.time.DateTime dateTime49 = dateTime47.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant50 = new org.joda.time.Instant((java.lang.Object) dateTime47);
        java.lang.String str51 = instant50.toString();
        org.joda.time.DateTime dateTime52 = instant50.toDateTimeISO();
        org.joda.time.Instant instant54 = instant50.plus((-2209338000000L));
        org.joda.time.PeriodType periodType56 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str57 = periodType56.getName();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) (short) -1, periodType56);
        org.joda.time.PeriodType periodType59 = periodType56.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration0, (org.joda.time.ReadableInstant) instant50, periodType56);
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.Chronology chronology68 = interval67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 1, periodType63, chronology68);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) '4', chronology68);
        org.joda.time.ReadablePartial readablePartial71 = null;
        org.joda.time.DateTime dateTime72 = dateTime70.withFields(readablePartial71);
        org.joda.time.DateTime.Property property73 = dateTime72.millisOfDay();
        org.joda.time.DateTime dateTime75 = dateTime72.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property76 = dateTime72.era();
        org.joda.time.Duration duration78 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime80 = dateTime72.withDurationAdded((org.joda.time.ReadableDuration) duration78, 0);
        org.joda.time.Hours hours81 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours82 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours83 = hours81.minus(hours82);
        org.joda.time.Duration duration84 = hours82.toStandardDuration();
        org.joda.time.Duration duration85 = duration78.minus((org.joda.time.ReadableDuration) duration84);
        int int86 = duration0.compareTo((org.joda.time.ReadableDuration) duration85);
        org.joda.time.Duration duration87 = duration0.toDuration();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and instant50", (dateTime47.compareTo(instant50) == 0) == dateTime47.equals(instant50));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime5 = dateTime2.plusMillis((int) '#');
        int int6 = dateTime2.getYearOfEra();
        org.joda.time.DateTime.Property property7 = dateTime2.hourOfDay();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardHours((long) 349200000);
        org.joda.time.Duration duration10 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration11 = duration10.toDuration();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone13);
        int int15 = dateTime14.getMillisOfDay();
        org.joda.time.DateTime dateTime17 = dateTime14.plusMillis((int) '#');
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 1, periodType20, chronology25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) '4', chronology25);
        org.joda.time.DateTime dateTime28 = dateTime17.withChronology(chronology25);
        int int29 = dateTime28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateTime28.getChronology();
        org.joda.time.DateTime dateTime32 = dateTime28.minusWeeks(55);
        org.joda.time.Instant instant33 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, periodType36, chronology41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) '4', chronology41);
        org.joda.time.ReadablePartial readablePartial44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.withFields(readablePartial44);
        boolean boolean46 = instant33.isAfter((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime.Property property47 = dateTime43.dayOfWeek();
        org.joda.time.DateTime dateTime48 = property47.withMaximumValue();
        boolean boolean49 = dateTime28.isAfter((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime51 = dateTime28.plusSeconds(50);
        org.joda.time.Interval interval52 = duration10.toIntervalTo((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Days days53 = duration10.toStandardDays();
        int int54 = duration9.compareTo((org.joda.time.ReadableDuration) duration10);
        org.joda.time.DateTime dateTime55 = dateTime2.minus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime();
        org.joda.time.Instant instant57 = dateTime56.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType59 = dateTimeFieldType58.getRangeDurationType();
        org.joda.time.DateTime.Property property60 = dateTime56.property(dateTimeFieldType58);
        org.joda.time.DateTime.Property property61 = dateTime56.secondOfDay();
        org.joda.time.Period period62 = duration10.toPeriodFrom((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime dateTime64 = dateTime56.withSecondOfMinute(0);
        java.lang.String str65 = dateTime56.toString();
        org.joda.time.TimeOfDay timeOfDay66 = dateTime56.toTimeOfDay();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone68);
        int int70 = dateTime69.getSecondOfMinute();
        int int71 = dateTime69.getMillisOfDay();
        org.joda.time.DateTime dateTime73 = dateTime69.withYear((int) (byte) 100);
        org.joda.time.Chronology chronology74 = dateTime73.getChronology();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone76);
        int int78 = dateTime77.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval84 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval85 = mutableInterval84.toInterval();
        org.joda.time.MutableInterval mutableInterval88 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean89 = mutableInterval84.isBefore((org.joda.time.ReadableInterval) mutableInterval88);
        boolean boolean90 = mutableInterval81.contains((org.joda.time.ReadableInterval) mutableInterval88);
        org.joda.time.Weeks weeks91 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval88);
        org.joda.time.DateTime dateTime92 = dateTime77.plus((org.joda.time.ReadablePeriod) weeks91);
        org.joda.time.DateTime dateTime94 = dateTime77.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property95 = dateTime77.secondOfDay();
        org.joda.time.DateTime dateTime96 = property95.roundHalfFloorCopy();
        org.joda.time.TimeOfDay timeOfDay97 = dateTime96.toTimeOfDay();
        org.joda.time.DateTime dateTime98 = dateTime73.withFields((org.joda.time.ReadablePartial) timeOfDay97);
        org.joda.time.Days days99 = org.joda.time.Days.daysBetween((org.joda.time.ReadablePartial) timeOfDay66, (org.joda.time.ReadablePartial) timeOfDay97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant33 and dateTime56", (instant33.compareTo(dateTime56) == 0) == instant33.equals(dateTime56));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.joda.time.Duration duration2 = new org.joda.time.Duration(349200000L, (long) 50);
        org.joda.time.Duration duration5 = duration2.withDurationAdded((long) 55, 12);
        org.joda.time.Days days6 = duration2.toStandardDays();
        org.joda.time.Days days8 = days6.multipliedBy(82800);
        java.lang.String str9 = days6.toString();
        int int10 = days6.getDays();
        org.joda.time.Duration duration11 = days6.toStandardDuration();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 1, periodType14, chronology19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', chronology19);
        org.joda.time.ReadablePartial readablePartial22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.withFields(readablePartial22);
        org.joda.time.DateTime.Property property24 = dateTime23.millisOfDay();
        org.joda.time.DateTime dateTime25 = dateTime23.withEarlierOffsetAtOverlap();
        int int26 = dateTime23.getDayOfWeek();
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 1, periodType28, chronology33);
        org.joda.time.DateTimeField dateTimeField35 = chronology33.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone36 = chronology33.getZone();
        org.joda.time.DateTime dateTime37 = dateTime23.withChronology(chronology33);
        org.joda.time.DateTime dateTime38 = dateTime23.withEarlierOffsetAtOverlap();
        org.joda.time.Period period39 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType40 = period39.getPeriodType();
        org.joda.time.Period period42 = period39.withMonths((int) (byte) 0);
        org.joda.time.Period period43 = period39.toPeriod();
        org.joda.time.DateTime dateTime45 = dateTime38.withPeriodAdded((org.joda.time.ReadablePeriod) period43, (int) (byte) 0);
        org.joda.time.Period period47 = org.joda.time.Period.minutes(49);
        org.joda.time.DateTime dateTime48 = dateTime38.minus((org.joda.time.ReadablePeriod) period47);
        org.joda.time.Instant instant49 = dateTime48.toInstant();
        org.joda.time.DateTime dateTime50 = instant49.toDateTimeISO();
        org.joda.time.Chronology chronology51 = dateTime50.getChronology();
        boolean boolean52 = duration11.equals((java.lang.Object) chronology51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime48 and instant49", (dateTime48.compareTo(instant49) == 0) == dateTime48.equals(instant49));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.DateTime.Property property2 = dateTime0.minuteOfDay();
        boolean boolean3 = dateTime0.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone5);
        int int7 = dateTime6.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = dateTime6.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime6.withMillisOfDay((int) (byte) 1);
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
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone28);
        int int30 = dateTime29.getDayOfMonth();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 1, periodType32, chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology37.getZone();
        org.joda.time.DateTime dateTime41 = dateTime29.withZoneRetainFields(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = dateTime22.withZone(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.toDateTime(dateTimeZone43);
        org.joda.time.Seconds seconds45 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Instant instant47 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Instant instant50 = instant47.withDurationAdded(readableDuration48, 10);
        org.joda.time.Instant instant53 = instant47.withDurationAdded((-54432000000L), 3);
        org.joda.time.Instant instant55 = instant53.withMillis(52L);
        long long56 = instant53.getMillis();
        org.joda.time.Instant instant59 = instant53.withDurationAdded((-6279833754000000L), 2);
        long long60 = instant53.getMillis();
        org.joda.time.Instant instant62 = instant53.plus(39L);
        org.joda.time.DateTimeZone dateTimeZone63 = instant53.getZone();
        org.joda.time.DateTime dateTime64 = dateTime0.withZone(dateTimeZone63);
        org.joda.time.DateTime dateTime66 = dateTime64.withWeekyear(86398030);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        long long13 = mutableInterval9.getEndMillis();
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean24 = mutableInterval19.isBefore((org.joda.time.ReadableInterval) mutableInterval23);
        boolean boolean25 = mutableInterval16.contains((org.joda.time.ReadableInterval) mutableInterval23);
        mutableInterval9.setInterval((org.joda.time.ReadableInterval) mutableInterval23);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', chronology34);
        org.joda.time.ReadablePartial readablePartial37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withFields(readablePartial37);
        org.joda.time.DateTime.Property property39 = dateTime38.millisOfDay();
        boolean boolean40 = mutableInterval9.isBefore((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime38.toMutableDateTime(dateTimeZone41);
        int int44 = dateTimeZone41.getStandardOffset((-665658L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and mutableDateTime42", (dateTime36.compareTo(mutableDateTime42) == 0) == dateTime36.equals(mutableDateTime42));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus(100L);
        org.joda.time.DateTime dateTime3 = instant2.toDateTimeISO();
        org.joda.time.Hours hours4 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours5 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours6 = hours4.minus(hours5);
        org.joda.time.Hours hours7 = org.joda.time.Hours.ONE;
        boolean boolean8 = hours4.isLessThan(hours7);
        org.joda.time.DateTime dateTime9 = dateTime3.minus((org.joda.time.ReadablePeriod) hours7);
        org.joda.time.DateTime dateTime11 = dateTime3.plusWeeks((int) (short) -1);
        boolean boolean13 = dateTime3.isEqual(0L);
        org.joda.time.DateTime.Property property14 = dateTime3.millisOfSecond();
        org.joda.time.DateTime dateTime15 = property14.roundFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime15", (instant2.compareTo(dateTime15) == 0) == instant2.equals(dateTime15));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
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
        org.joda.time.Instant instant33 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, periodType36, chronology41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) '4', chronology41);
        org.joda.time.ReadablePartial readablePartial44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.withFields(readablePartial44);
        boolean boolean46 = instant33.isAfter((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime.Property property47 = dateTime43.dayOfWeek();
        org.joda.time.DateTime dateTime48 = property47.withMaximumValue();
        org.joda.time.DurationField durationField49 = property47.getRangeDurationField();
        org.joda.time.DateTime dateTime50 = property47.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime52 = dateTime50.toDateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.withWeekyear(19);
        org.joda.time.DateTime.Property property55 = dateTime52.dayOfWeek();
        org.joda.time.Period period56 = duration32.toPeriodFrom((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Seconds seconds57 = period56.toStandardSeconds();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone59);
        int int61 = dateTime60.getDayOfMonth();
        org.joda.time.DateTime dateTime63 = dateTime60.withMillisOfDay((int) 'a');
        org.joda.time.LocalDateTime localDateTime64 = dateTime60.toLocalDateTime();
        java.lang.String str65 = localDateTime64.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = localDateTime64.getFieldType(1);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone69);
        int int71 = dateTime70.getDayOfMonth();
        org.joda.time.DateTime dateTime73 = dateTime70.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property74 = dateTime73.dayOfYear();
        org.joda.time.DateTime dateTime75 = property74.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime77 = property74.addToCopy(100);
        org.joda.time.MutableInterval mutableInterval80 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval81 = mutableInterval80.toInterval();
        org.joda.time.Chronology chronology82 = interval81.getChronology();
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime(chronology82);
        org.joda.time.LocalDateTime localDateTime84 = dateTime83.toLocalDateTime();
        int int85 = property74.compareTo((org.joda.time.ReadablePartial) localDateTime84);
        org.joda.time.Seconds seconds86 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadablePartial) localDateTime64, (org.joda.time.ReadablePartial) localDateTime84);
        org.joda.time.PeriodType periodType87 = seconds86.getPeriodType();
        org.joda.time.Seconds seconds88 = seconds57.plus(seconds86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime52", (dateTime10.compareTo(dateTime52) == 0) == dateTime10.equals(dateTime52));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus(100L);
        org.joda.time.DateTime dateTime3 = instant2.toDateTimeISO();
        org.joda.time.Hours hours4 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours5 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours6 = hours4.minus(hours5);
        org.joda.time.Hours hours7 = org.joda.time.Hours.ONE;
        boolean boolean8 = hours4.isLessThan(hours7);
        org.joda.time.DateTime dateTime9 = dateTime3.minus((org.joda.time.ReadablePeriod) hours7);
        org.joda.time.DateTime dateTime11 = dateTime3.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime12 = dateTime11.toLocalDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime3", (instant2.compareTo(dateTime3) == 0) == instant2.equals(dateTime3));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus(100L);
        org.joda.time.DateTime dateTime3 = instant2.toDateTimeISO();
        org.joda.time.Hours hours4 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours5 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours6 = hours4.minus(hours5);
        org.joda.time.Hours hours7 = org.joda.time.Hours.ONE;
        boolean boolean8 = hours4.isLessThan(hours7);
        org.joda.time.DateTime dateTime9 = dateTime3.minus((org.joda.time.ReadablePeriod) hours7);
        org.joda.time.DateTime dateTime11 = dateTime3.plusWeeks((int) (short) -1);
        boolean boolean13 = dateTime3.isEqual(126227808000L);
        org.joda.time.DateTime dateTime15 = dateTime3.withCenturyOfEra(17);
        org.joda.time.DateTime dateTime17 = dateTime15.minusWeeks(15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime3", (instant2.compareTo(dateTime3) == 0) == instant2.equals(dateTime3));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        long long6 = dateTimeZone2.convertLocalToUTC(355200035L, false, (long) (byte) 100);
        boolean boolean8 = dateTimeZone2.isStandardOffset((long) (short) 100);
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
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Instant instant26 = dateTime25.toInstant();
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) instant26);
        org.joda.time.Instant instant29 = instant26.withMillis((long) 496);
        org.joda.time.DateTime dateTime30 = instant26.toDateTime();
        boolean boolean31 = dateTimeZone2.equals((java.lang.Object) instant26);
        org.joda.time.Instant instant33 = instant26.withMillis(7205846400000L);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(0L);
        org.joda.time.Minutes minutes36 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) instant33, (org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Duration duration37 = minutes36.toStandardDuration();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant26", (dateTime25.compareTo(instant26) == 0) == dateTime25.equals(instant26));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
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
        boolean boolean32 = duration0.isShorterThan((org.joda.time.ReadableDuration) duration1);
        org.joda.time.Minutes minutes33 = duration1.toStandardMinutes();
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        long long39 = interval37.toDurationMillis();
        org.joda.time.Interval interval41 = interval37.withEndMillis((long) (short) 100);
        org.joda.time.Instant instant42 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Instant instant45 = instant42.withDurationAdded(readableDuration43, 10);
        org.joda.time.Interval interval46 = interval41.withEnd((org.joda.time.ReadableInstant) instant42);
        org.joda.time.Instant instant48 = instant42.withMillis((long) 4);
        org.joda.time.Instant instant50 = instant48.plus((long) 86399);
        org.joda.time.DateTime dateTime51 = instant50.toDateTime();
        org.joda.time.DateTime dateTime53 = dateTime51.minusDays(22598);
        org.joda.time.Interval interval54 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.Minutes minutes55 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant50 and dateTime51", (instant50.compareTo(dateTime51) == 0) == instant50.equals(dateTime51));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
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
        int int14 = dateTime10.getMillisOfDay();
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, periodType18, chronology23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', chronology23);
        org.joda.time.ReadablePartial readablePartial26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.withFields(readablePartial26);
        boolean boolean28 = instant15.isAfter((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime.Property property29 = dateTime25.dayOfWeek();
        org.joda.time.DateTime dateTime30 = property29.withMaximumValue();
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
        org.joda.time.DateTime.Property property45 = dateTime41.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone47);
        int int49 = dateTime48.getDayOfMonth();
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 1, periodType51, chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone59 = chronology56.getZone();
        org.joda.time.DateTime dateTime60 = dateTime48.withZoneRetainFields(dateTimeZone59);
        org.joda.time.DateTime dateTime61 = dateTime41.withZone(dateTimeZone59);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = dateTime61.toDateTime(dateTimeZone62);
        org.joda.time.Days days64 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.DateTime dateTime67 = dateTime63.withPeriodAdded(readablePeriod65, 349200000);
        org.joda.time.Days days68 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval72 = mutableInterval71.toInterval();
        org.joda.time.Chronology chronology73 = interval72.getChronology();
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(chronology73);
        org.joda.time.DateTime dateTime76 = dateTime74.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime78 = dateTime76.plus((long) (short) -1);
        org.joda.time.DateTime dateTime79 = dateTime76.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime80 = dateTime76.withEarlierOffsetAtOverlap();
        org.joda.time.Days days81 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime74", (instant0.compareTo(dateTime74) == 0) == instant0.equals(dateTime74));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
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
        org.joda.time.DateTime.Property property25 = dateTime9.year();
        org.joda.time.Interval interval26 = property25.toInterval();
        org.joda.time.DateTime dateTime27 = property25.roundCeilingCopy();
        long long28 = property25.remainder();
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean39 = mutableInterval34.isBefore((org.joda.time.ReadableInterval) mutableInterval38);
        boolean boolean40 = mutableInterval31.contains((org.joda.time.ReadableInterval) mutableInterval38);
        org.joda.time.Weeks weeks41 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval38);
        long long42 = mutableInterval38.getEndMillis();
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean53 = mutableInterval48.isBefore((org.joda.time.ReadableInterval) mutableInterval52);
        boolean boolean54 = mutableInterval45.contains((org.joda.time.ReadableInterval) mutableInterval52);
        mutableInterval38.setInterval((org.joda.time.ReadableInterval) mutableInterval52);
        org.joda.time.DateTime dateTime56 = mutableInterval52.getStart();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.Chronology chronology62 = interval61.getChronology();
        org.joda.time.DateTimeZone dateTimeZone63 = chronology62.getZone();
        java.lang.String str65 = dateTimeZone63.getName(100L);
        org.joda.time.DateTime dateTime66 = dateTime57.withZoneRetainFields(dateTimeZone63);
        java.lang.String str67 = dateTimeZone63.getID();
        org.joda.time.LocalDateTime localDateTime68 = null;
        boolean boolean69 = dateTimeZone63.isLocalDateTimeGap(localDateTime68);
        org.joda.time.DateTime dateTime70 = dateTime56.withZone(dateTimeZone63);
        int int71 = property25.compareTo((org.joda.time.ReadableInstant) dateTime70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime57", (instant10.compareTo(dateTime57) == 0) == instant10.equals(dateTime57));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfDay();
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
        org.joda.time.DateTime dateTime7 = property4.withMaximumValue();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 1, periodType10, chronology15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', chronology15);
        org.joda.time.ReadablePartial readablePartial18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withFields(readablePartial18);
        org.joda.time.DateTime dateTime21 = dateTime17.withDayOfMonth(5);
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
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, periodType47, chronology52);
        org.joda.time.DateTimeField dateTimeField54 = chronology52.hourOfHalfday();
        long long57 = dateTimeField54.getDifferenceAsLong((long) 10, (long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone59);
        int int61 = dateTime60.getSecondOfMinute();
        org.joda.time.DateTime dateTime63 = dateTime60.withMinuteOfHour(10);
        org.joda.time.TimeOfDay timeOfDay64 = dateTime63.toTimeOfDay();
        int[] intArray71 = new int[] { '4', 1970, 10, (byte) 10, 24, 50 };
        int int72 = dateTimeField54.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay64, intArray71);
        org.joda.time.DateTime dateTime73 = dateTime42.withFields((org.joda.time.ReadablePartial) timeOfDay64);
        org.joda.time.MutableDateTime mutableDateTime74 = dateTime42.toMutableDateTime();
        org.joda.time.Period period76 = new org.joda.time.Period((long) 100);
        int int77 = period76.getDays();
        org.joda.time.MutableInterval mutableInterval80 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval81 = mutableInterval80.toInterval();
        org.joda.time.Chronology chronology82 = interval81.getChronology();
        org.joda.time.MutableInterval mutableInterval83 = interval81.toMutableInterval();
        org.joda.time.DateTime dateTime84 = interval81.getEnd();
        org.joda.time.MutableInterval mutableInterval85 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period76, (org.joda.time.ReadableInstant) dateTime84);
        boolean boolean86 = dateTime42.isAfter((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.Hours hours87 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime88 = new org.joda.time.DateTime();
        org.joda.time.Instant instant89 = dateTime88.toInstant();
        org.joda.time.MutableInterval mutableInterval90 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableInstant) dateTime88);
        int int91 = property4.compareTo((org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.DateTime dateTime93 = dateTime88.minusWeeks(60);
        org.joda.time.Duration duration96 = new org.joda.time.Duration(75600100L, 1320L);
        org.joda.time.DateTime dateTime97 = dateTime88.minus((org.joda.time.ReadableDuration) duration96);
        long long98 = duration96.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime88 and instant89", (dateTime88.compareTo(instant89) == 0) == dateTime88.equals(instant89));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.joda.time.Days days0 = org.joda.time.Days.SEVEN;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(periodType1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone4);
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime5.toCalendar(locale6);
        org.joda.time.Instant instant8 = dateTime5.toInstant();
        org.joda.time.Duration duration9 = mutablePeriod2.toDurationTo((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Hours hours11 = org.joda.time.Hours.hours(0);
        org.joda.time.DurationFieldType durationFieldType12 = hours11.getFieldType();
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) hours11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant8", (dateTime5.compareTo(instant8) == 0) == dateTime5.equals(instant8));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone9);
        int int11 = dateTime10.getMillisOfDay();
        org.joda.time.DateTime dateTime13 = dateTime10.plusMillis((int) '#');
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType16, chronology21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '4', chronology21);
        org.joda.time.DateTime dateTime24 = dateTime13.withChronology(chronology21);
        boolean boolean26 = dateTime24.isEqual(187200000L);
        int int27 = property6.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime28 = property6.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone30);
        int int32 = dateTime31.getDayOfMonth();
        org.joda.time.DateTime dateTime34 = dateTime31.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime36 = dateTime34.withYear(0);
        org.joda.time.DateTime.Property property37 = dateTime36.era();
        org.joda.time.DateTime dateTime38 = property37.roundCeilingCopy();
        org.joda.time.DateTime dateTime39 = property37.roundCeilingCopy();
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = dateTime39.toDateTime(dateTimeZone41);
        org.joda.time.Duration duration44 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Minutes minutes45 = duration44.toStandardMinutes();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime();
        org.joda.time.Instant instant47 = dateTime46.toInstant();
        org.joda.time.TimeOfDay timeOfDay48 = dateTime46.toTimeOfDay();
        org.joda.time.DateTime.Property property49 = dateTime46.dayOfWeek();
        org.joda.time.TimeOfDay timeOfDay50 = dateTime46.toTimeOfDay();
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration44, (org.joda.time.ReadableInstant) dateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and instant47", (dateTime42.compareTo(instant47) == 0) == dateTime42.equals(instant47));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(52);
        org.joda.time.Period period3 = period1.minusWeeks(1970);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone5);
        int int7 = dateTime6.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime6.withMillisOfDay((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = dateTime6.toLocalDateTime();
        java.lang.String str11 = localDateTime10.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime10.getFieldType(1);
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getRangeDurationType();
        boolean boolean15 = period1.isSupported(durationFieldType14);
        org.joda.time.Period period18 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType19 = period18.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType19);
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean32 = mutableInterval27.isBefore((org.joda.time.ReadableInterval) mutableInterval31);
        boolean boolean33 = mutableInterval24.contains((org.joda.time.ReadableInterval) mutableInterval31);
        org.joda.time.Weeks weeks34 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval31);
        long long35 = mutableInterval31.getEndMillis();
        org.joda.time.DateTime dateTime36 = mutableInterval31.getEnd();
        org.joda.time.Chronology chronology37 = mutableInterval31.getChronology();
        mutablePeriod20.add(355200035L, chronology37);
        org.joda.time.DurationField durationField39 = chronology37.halfdays();
        org.joda.time.DurationField durationField40 = chronology37.months();
        org.joda.time.DateTimeField dateTimeField41 = chronology37.millisOfSecond();
        long long45 = chronology37.add(1645514252751L, 33571025L, 29918);
        org.joda.time.DurationField durationField46 = durationFieldType14.getField(chronology37);
        org.joda.time.DurationField durationField47 = chronology37.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField39, and durationField40", !(durationField47.compareTo(durationField39) == 0) || (Math.signum(durationField47.compareTo(durationField40)) == Math.signum(durationField39.compareTo(durationField40))));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfCentury();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology14.getZone();
        java.lang.String str17 = dateTimeZone15.getName(100L);
        org.joda.time.DateTime dateTime18 = dateTime9.withZoneRetainFields(dateTimeZone15);
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology23.getZone();
        java.lang.String str26 = dateTimeZone24.getName(100L);
        org.joda.time.DateTime dateTime27 = dateTime18.withZoneRetainFields(dateTimeZone24);
        org.joda.time.Chronology chronology28 = chronology6.withZone(dateTimeZone24);
        org.joda.time.DurationField durationField29 = chronology6.centuries();
        org.joda.time.DurationField durationField30 = chronology6.centuries();
        org.joda.time.Hours hours31 = org.joda.time.Hours.FOUR;
        long long34 = chronology6.add((org.joda.time.ReadablePeriod) hours31, (-31536000000L), 5);
        org.joda.time.Period period35 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType36 = period35.getPeriodType();
        int int37 = period35.getSeconds();
        org.joda.time.Period period39 = period35.minusSeconds(82800);
        int int40 = period39.getHours();
        org.joda.time.Period period42 = period39.minusSeconds(5);
        boolean boolean43 = hours31.equals((java.lang.Object) 5);
        org.joda.time.MutablePeriod mutablePeriod44 = hours31.toMutablePeriod();
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 1, periodType49, chronology54);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) '4', chronology54);
        org.joda.time.Instant instant57 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval64 = mutableInterval63.toInterval();
        org.joda.time.Chronology chronology65 = interval64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) 1, periodType60, chronology65);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) '4', chronology65);
        org.joda.time.ReadablePartial readablePartial68 = null;
        org.joda.time.DateTime dateTime69 = dateTime67.withFields(readablePartial68);
        boolean boolean70 = instant57.isAfter((org.joda.time.ReadableInstant) dateTime67);
        boolean boolean71 = dateTime56.isAfter((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.Chronology chronology72 = dateTime56.getChronology();
        org.joda.time.Period period73 = new org.joda.time.Period(0L, (long) 50, chronology72);
        int int74 = period73.getSeconds();
        boolean boolean75 = mutablePeriod44.equals((java.lang.Object) int74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant57", (dateTime9.compareTo(instant57) == 0) == dateTime9.equals(instant57));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        int int10 = dateTime9.getMinuteOfDay();
        org.joda.time.DateTime.Property property11 = dateTime9.secondOfDay();
        org.joda.time.DateTime dateTime12 = property11.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime13 = property11.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime14 = property11.roundHalfFloorCopy();
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, periodType18, chronology23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', chronology23);
        org.joda.time.ReadablePartial readablePartial26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.withFields(readablePartial26);
        boolean boolean28 = instant15.isAfter((org.joda.time.ReadableInstant) dateTime25);
        int int29 = dateTime25.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone31);
        int int33 = dateTime32.getDayOfMonth();
        org.joda.time.DateTime dateTime35 = dateTime32.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property36 = dateTime35.dayOfYear();
        org.joda.time.DateTime dateTime37 = property36.roundHalfFloorCopy();
        java.util.Locale locale38 = null;
        int int39 = property36.getMaximumTextLength(locale38);
        java.lang.String str40 = property36.getAsText();
        org.joda.time.DateTime dateTime41 = property36.withMinimumValue();
        org.joda.time.DateTime dateTime42 = property36.withMinimumValue();
        boolean boolean43 = dateTime42.isAfterNow();
        boolean boolean44 = dateTime25.isEqual((org.joda.time.ReadableInstant) dateTime42);
        int int45 = property11.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant15", (dateTime0.compareTo(instant15) == 0) == dateTime0.equals(instant15));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.year();
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
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone19);
        int int21 = dateTime20.getDayOfMonth();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, periodType23, chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology28.getZone();
        org.joda.time.DateTime dateTime32 = dateTime20.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = dateTime13.withZone(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.toDateTime(dateTimeZone34);
        java.lang.String str36 = dateTime33.toString();
        int int37 = dateTime33.getMonthOfYear();
        org.joda.time.Minutes minutes38 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes40 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType41 = null;
        int int42 = minutes40.get(durationFieldType41);
        org.joda.time.DurationFieldType durationFieldType43 = minutes40.getFieldType();
        boolean boolean44 = minutes38.isGreaterThan(minutes40);
        org.joda.time.Instant instant45 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes40, (org.joda.time.ReadableInstant) instant45);
        org.joda.time.DateTime dateTime47 = instant45.toDateTimeISO();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime47);
        boolean boolean49 = dateTime1.equals((java.lang.Object) dateTime33);
        org.joda.time.DateTime.Property property50 = dateTime1.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime47", (instant0.compareTo(dateTime47) == 0) == instant0.equals(dateTime47));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, periodType12, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', chronology17);
        org.joda.time.ReadablePartial readablePartial20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withFields(readablePartial20);
        org.joda.time.DateTime.Property property22 = dateTime21.millisOfDay();
        org.joda.time.DateTime dateTime23 = dateTime21.withEarlierOffsetAtOverlap();
        int int24 = dateTime21.getDayOfWeek();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, periodType26, chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone34 = chronology31.getZone();
        org.joda.time.DateTime dateTime35 = dateTime21.withChronology(chronology31);
        org.joda.time.DateTime dateTime37 = dateTime35.plusDays((int) (byte) 1);
        boolean boolean38 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime35);
        boolean boolean39 = dateTime9.isEqualNow();
        org.joda.time.Instant instant40 = dateTime9.toInstant();
        org.joda.time.Instant instant41 = instant40.toInstant();
        org.joda.time.Instant instant44 = instant41.withDurationAdded((long) (-3), 188);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant41", (dateTime9.compareTo(instant41) == 0) == dateTime9.equals(instant41));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
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
        org.joda.time.Instant instant52 = instant49.minus(1648538266556L);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.Chronology chronology60 = interval59.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 1, periodType55, chronology60);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) '4', chronology60);
        org.joda.time.ReadablePartial readablePartial63 = null;
        org.joda.time.DateTime dateTime64 = dateTime62.withFields(readablePartial63);
        org.joda.time.DateTime.Property property65 = dateTime64.millisOfDay();
        org.joda.time.DateTime dateTime67 = dateTime64.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime69 = dateTime64.withCenturyOfEra((int) (short) 1);
        org.joda.time.Hours hours70 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours71 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours72 = hours70.minus(hours71);
        org.joda.time.Duration duration73 = hours71.toStandardDuration();
        org.joda.time.DateTime dateTime74 = dateTime64.plus((org.joda.time.ReadableDuration) duration73);
        org.joda.time.DateTime.Property property75 = dateTime64.era();
        org.joda.time.DurationField durationField76 = property75.getLeapDurationField();
        org.joda.time.DateTime dateTime77 = property75.withMaximumValue();
        int int78 = dateTime77.getDayOfYear();
        boolean boolean79 = instant52.isEqual((org.joda.time.ReadableInstant) dateTime77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime48 and instant49", (dateTime48.compareTo(instant49) == 0) == dateTime48.equals(instant49));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
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
        org.joda.time.DateTime dateTime26 = dateTime11.withEarlierOffsetAtOverlap();
        org.joda.time.Period period27 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType28 = period27.getPeriodType();
        org.joda.time.Period period30 = period27.withMonths((int) (byte) 0);
        org.joda.time.Period period31 = period27.toPeriod();
        org.joda.time.DateTime dateTime33 = dateTime26.withPeriodAdded((org.joda.time.ReadablePeriod) period31, (int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant34 = null;
        boolean boolean35 = dateTime33.isEqual(readableInstant34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean37 = dateTime33.isSupported(dateTimeFieldType36);
        java.lang.String str38 = dateTimeFieldType36.toString();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology44.getZone();
        java.lang.String str47 = dateTimeZone45.getName(100L);
        org.joda.time.DateTime dateTime48 = dateTime39.withZoneRetainFields(dateTimeZone45);
        int int49 = dateTime48.getMinuteOfDay();
        int int50 = dateTime48.getEra();
        org.joda.time.DateMidnight dateMidnight51 = dateTime48.toDateMidnight();
        java.lang.Object obj54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType56 = period55.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(obj54, periodType56);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) 1, periodType59, chronology64);
        org.joda.time.DateTimeField dateTimeField66 = chronology64.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone67 = chronology64.getZone();
        org.joda.time.DateTimeField dateTimeField68 = chronology64.minuteOfHour();
        org.joda.time.Chronology chronology69 = chronology64.withUTC();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 50, (-10L), periodType56, chronology69);
        org.joda.time.DateTime dateTime71 = dateMidnight51.toDateTime(chronology69);
        org.joda.time.DateTimeField dateTimeField72 = dateTimeFieldType36.getField(chronology69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight51 and dateTime71", (dateMidnight51.compareTo(dateTime71) == 0) == dateMidnight51.equals(dateTime71));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
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
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        org.joda.time.DateTime dateTime17 = property15.getDateTime();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 1, periodType20, chronology25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) '4', chronology25);
        int int28 = property15.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.Instant instant31 = instant29.minus(100L);
        org.joda.time.DateTime dateTime32 = instant31.toDateTimeISO();
        org.joda.time.Hours hours33 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours34 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours35 = hours33.minus(hours34);
        org.joda.time.Hours hours36 = org.joda.time.Hours.ONE;
        boolean boolean37 = hours33.isLessThan(hours36);
        org.joda.time.DateTime dateTime38 = dateTime32.minus((org.joda.time.ReadablePeriod) hours36);
        org.joda.time.DateTime dateTime40 = dateTime32.plusWeeks((int) (short) -1);
        boolean boolean42 = dateTime32.isEqual(126227808000L);
        org.joda.time.DateTime dateTime44 = dateTime32.withCenturyOfEra(17);
        int int45 = dateTime44.getMonthOfYear();
        int int46 = dateTime27.compareTo((org.joda.time.ReadableInstant) dateTime44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant31 and dateTime32", (instant31.compareTo(dateTime32) == 0) == instant31.equals(dateTime32));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime13 = property12.withMinimumValue();
        org.joda.time.DateTime dateTime15 = dateTime13.minusMonths(57);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes(12);
        org.joda.time.Instant instant18 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology19 = instant18.getChronology();
        org.joda.time.Instant instant21 = instant18.plus((-61180786800000L));
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) instant21);
        org.joda.time.Weeks weeks24 = org.joda.time.Weeks.weeks(349200000);
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.weeks(349200000);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
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
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period58 = duration28.toPeriodFrom((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadablePeriod) period58);
        org.joda.time.Weeks weeks60 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval59);
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean71 = mutableInterval66.isBefore((org.joda.time.ReadableInterval) mutableInterval70);
        boolean boolean72 = mutableInterval63.contains((org.joda.time.ReadableInterval) mutableInterval70);
        org.joda.time.Weeks weeks73 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval70);
        org.joda.time.Weeks weeks74 = weeks73.negated();
        org.joda.time.Weeks weeks75 = weeks73.negated();
        boolean boolean76 = weeks60.isGreaterThan(weeks75);
        org.joda.time.Weeks weeks77 = weeks26.minus(weeks75);
        boolean boolean78 = weeks24.isLessThan(weeks26);
        org.joda.time.Duration duration79 = weeks26.toStandardDuration();
        org.joda.time.Instant instant80 = instant21.minus((org.joda.time.ReadableDuration) duration79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and dateTime27", (instant18.compareTo(dateTime27) == 0) == instant18.equals(dateTime27));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusWeeks((int) (short) 0);
        org.joda.time.DateTime dateTime4 = dateTime0.minusWeeks(365);
        org.joda.time.DateTime dateTime6 = dateTime0.plusHours(496);
        org.joda.time.Period period8 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType9 = period8.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(2457L, periodType9);
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean18 = mutableInterval13.isBefore((org.joda.time.ReadableInterval) mutableInterval17);
        long long19 = mutableInterval13.getStartMillis();
        java.lang.Object obj20 = mutableInterval13.clone();
        boolean boolean21 = mutableInterval13.isBeforeNow();
        mutablePeriod10.add((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.Period period23 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType24 = period23.getPeriodType();
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean35 = mutableInterval30.isBefore((org.joda.time.ReadableInterval) mutableInterval34);
        boolean boolean36 = mutableInterval27.contains((org.joda.time.ReadableInterval) mutableInterval34);
        mutableInterval27.setDurationAfterStart(0L);
        boolean boolean39 = mutableInterval27.containsNow();
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean50 = mutableInterval45.isBefore((org.joda.time.ReadableInterval) mutableInterval49);
        boolean boolean51 = mutableInterval42.contains((org.joda.time.ReadableInterval) mutableInterval49);
        mutableInterval42.setDurationAfterStart(0L);
        boolean boolean54 = mutableInterval42.containsNow();
        boolean boolean55 = mutableInterval27.isAfter((org.joda.time.ReadableInterval) mutableInterval42);
        mutableInterval42.setDurationBeforeEnd(355200035L);
        org.joda.time.Chronology chronology58 = mutableInterval42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod10, periodType24, chronology58);
        org.joda.time.Interval interval60 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadablePeriod) mutablePeriod59);
        org.joda.time.DateTime.Property property61 = dateTime0.secondOfMinute();
        org.joda.time.DateTime.Property property62 = dateTime0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone64);
        java.util.Locale locale66 = null;
        java.util.Calendar calendar67 = dateTime65.toCalendar(locale66);
        org.joda.time.Instant instant68 = dateTime65.toInstant();
        boolean boolean69 = instant68.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone71);
        int int73 = dateTime72.getDayOfMonth();
        org.joda.time.DateTime dateTime75 = dateTime72.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property76 = dateTime75.dayOfYear();
        org.joda.time.DateTime dateTime77 = property76.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime79 = property76.addWrapFieldToCopy(1);
        org.joda.time.Days days80 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) instant68, (org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.Instant instant81 = instant68.toInstant();
        int int82 = property62.compareTo((org.joda.time.ReadableInstant) instant81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime65 and instant81", (dateTime65.compareTo(instant81) == 0) == dateTime65.equals(instant81));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.DateTime dateTime3 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfDay();
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumTextLength(locale5);
        org.joda.time.DateTime dateTime7 = property4.withMaximumValue();
        java.util.Locale locale8 = null;
        int int9 = property4.getMaximumShortTextLength(locale8);
        java.util.Locale locale10 = null;
        java.lang.String str11 = property4.getAsText(locale10);
        org.joda.time.DateTime dateTime12 = property4.roundHalfEvenCopy();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 1, periodType14, chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.yearOfCentury();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology27.getZone();
        java.lang.String str30 = dateTimeZone28.getName(100L);
        org.joda.time.DateTime dateTime31 = dateTime22.withZoneRetainFields(dateTimeZone28);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.DateTimeZone dateTimeZone37 = chronology36.getZone();
        java.lang.String str39 = dateTimeZone37.getName(100L);
        org.joda.time.DateTime dateTime40 = dateTime31.withZoneRetainFields(dateTimeZone37);
        org.joda.time.Chronology chronology41 = chronology19.withZone(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology50.getZone();
        java.lang.String str53 = dateTimeZone51.getName(100L);
        org.joda.time.DateTime dateTime54 = dateTime45.withZoneRetainFields(dateTimeZone51);
        long long56 = dateTimeZone44.getMillisKeepLocal(dateTimeZone51, 6000035L);
        java.util.Locale locale58 = null;
        java.lang.String str59 = dateTimeZone44.getShortName((long) 1, locale58);
        org.joda.time.Chronology chronology60 = chronology41.withZone(dateTimeZone44);
        boolean boolean61 = dateTimeZone44.isFixed();
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime12.toMutableDateTime(dateTimeZone44);
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean73 = mutableInterval68.isBefore((org.joda.time.ReadableInterval) mutableInterval72);
        boolean boolean74 = mutableInterval65.contains((org.joda.time.ReadableInterval) mutableInterval72);
        org.joda.time.Weeks weeks75 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval72);
        mutableInterval72.setInterval((-80867997L), 271254L);
        org.joda.time.MutableInterval mutableInterval79 = mutableInterval72.toMutableInterval();
        java.lang.Object obj80 = mutableInterval79.clone();
        boolean boolean81 = mutableInterval79.isBeforeNow();
        boolean boolean82 = dateTimeZone44.equals((java.lang.Object) boolean81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime62", (dateTime12.compareTo(mutableDateTime62) == 0) == dateTime12.equals(mutableDateTime62));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
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
        org.joda.time.DurationField durationField16 = property14.getRangeDurationField();
        org.joda.time.DateTime dateTime17 = property14.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekyear(19);
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfWeek();
        org.joda.time.DateTime dateTime23 = property22.withMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime19", (dateTime10.compareTo(dateTime19) == 0) == dateTime10.equals(dateTime19));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 10);
        org.joda.time.Instant instant6 = instant0.withDurationAdded((-54432000000L), 3);
        org.joda.time.MutableDateTime mutableDateTime7 = instant0.toMutableDateTime();
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean18 = mutableInterval13.isBefore((org.joda.time.ReadableInterval) mutableInterval17);
        boolean boolean19 = mutableInterval10.contains((org.joda.time.ReadableInterval) mutableInterval17);
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval17);
        org.joda.time.Period period21 = new org.joda.time.Period((java.lang.Object) mutableInterval17);
        org.joda.time.Chronology chronology22 = mutableInterval17.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.secondOfDay();
        boolean boolean25 = instant0.equals((java.lang.Object) chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime7", (instant0.compareTo(mutableDateTime7) == 0) == instant0.equals(mutableDateTime7));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) 57);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime6.getZone();
        org.joda.time.DateTime dateTime8 = dateTime6.withTimeAtStartOfDay();
        int int9 = dateTime6.getSecondOfDay();
        org.joda.time.DateTime.Property property10 = dateTime6.hourOfDay();
        org.joda.time.DateTime dateTime12 = dateTime6.withCenturyOfEra(1989);
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
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((java.lang.Object) dateTime28);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        org.joda.time.Chronology chronology38 = chronology36.withUTC();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.yearOfEra();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField42 = chronology38.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology38.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime31.toMutableDateTime(chronology38);
        org.joda.time.Hours hours45 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) mutableDateTime44);
        org.joda.time.Hours hours46 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) hours45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime37", (instant13.compareTo(dateTime37) == 0) == instant13.equals(dateTime37));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) 155);
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Interval interval6 = interval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 10);
        org.joda.time.Instant instant14 = instant8.withDurationAdded((-54432000000L), 3);
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, periodType18, chronology23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', chronology23);
        org.joda.time.ReadablePartial readablePartial26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.withFields(readablePartial26);
        boolean boolean28 = instant15.isAfter((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime.Property property29 = dateTime25.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone31);
        int int33 = dateTime32.getDayOfMonth();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 1, periodType35, chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone43 = chronology40.getZone();
        org.joda.time.DateTime dateTime44 = dateTime32.withZoneRetainFields(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = dateTime25.withZone(dateTimeZone43);
        org.joda.time.Duration duration47 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableDuration) duration47);
        boolean boolean49 = instant14.isBefore((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Instant instant51 = instant14.withMillis((long) 22);
        org.joda.time.Chronology chronology52 = instant51.getChronology();
        org.joda.time.Instant instant54 = instant51.plus((-31532399903L));
        org.joda.time.Instant instant57 = instant54.withDurationAdded(3519936000000000L, 378);
        boolean boolean58 = interval6.isAfter((org.joda.time.ReadableInstant) instant57);
        org.joda.time.MutableDateTime mutableDateTime59 = instant57.toMutableDateTime();
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) mutableDateTime59);
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.Chronology chronology68 = interval67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 1, periodType63, chronology68);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) '4', chronology68);
        org.joda.time.DateTime.Property property71 = dateTime70.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = property71.getFieldType();
        org.joda.time.DateTime dateTime73 = property71.roundFloorCopy();
        org.joda.time.TimeOfDay timeOfDay74 = dateTime73.toTimeOfDay();
        org.joda.time.DateTime dateTime75 = dateTime73.toDateTimeISO();
        org.joda.time.Instant instant76 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType79 = null;
        org.joda.time.MutableInterval mutableInterval82 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval83 = mutableInterval82.toInterval();
        org.joda.time.Chronology chronology84 = interval83.getChronology();
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((long) 1, periodType79, chronology84);
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime((long) '4', chronology84);
        org.joda.time.ReadablePartial readablePartial87 = null;
        org.joda.time.DateTime dateTime88 = dateTime86.withFields(readablePartial87);
        boolean boolean89 = instant76.isAfter((org.joda.time.ReadableInstant) dateTime86);
        org.joda.time.DateTime.Property property90 = dateTime86.dayOfWeek();
        org.joda.time.DateTime dateTime91 = property90.withMaximumValue();
        org.joda.time.DateTime dateTime93 = dateTime91.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant94 = new org.joda.time.Instant((java.lang.Object) dateTime91);
        org.joda.time.DateTime dateTime96 = dateTime91.plusMinutes((-98));
        int int97 = dateTime91.getDayOfMonth();
        mutableInterval60.setInterval((org.joda.time.ReadableInstant) dateTime73, (org.joda.time.ReadableInstant) dateTime91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant57 and mutableDateTime59", (instant57.compareTo(mutableDateTime59) == 0) == instant57.equals(mutableDateTime59));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
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
        org.joda.time.DateTime dateTime25 = dateTime20.plusMonths((-39784));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and mutableDateTime23", (instant21.compareTo(mutableDateTime23) == 0) == instant21.equals(mutableDateTime23));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        int int3 = minutes1.get(durationFieldType2);
        int int5 = minutes1.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod6 = minutes1.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType8 = minutes1.getFieldType(0);
        org.joda.time.Duration duration9 = minutes1.toStandardDuration();
        org.joda.time.Duration duration10 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 1, periodType13, chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) '4', chronology18);
        org.joda.time.ReadablePartial readablePartial21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.withFields(readablePartial21);
        org.joda.time.DateTime.Property property23 = dateTime22.millisOfDay();
        org.joda.time.DateTime dateTime24 = dateTime22.withEarlierOffsetAtOverlap();
        int int25 = dateTime22.getDayOfWeek();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, periodType27, chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone35 = chronology32.getZone();
        org.joda.time.DateTime dateTime36 = dateTime22.withChronology(chronology32);
        org.joda.time.Interval interval37 = duration10.toIntervalTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period40 = duration10.toPeriodFrom((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Duration duration42 = duration10.withMillis(100L);
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
        org.joda.time.DurationField durationField59 = property57.getRangeDurationField();
        org.joda.time.DateTime dateTime60 = property57.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime62 = dateTime60.toDateTime(dateTimeZone61);
        org.joda.time.DateTime dateTime64 = dateTime62.withWeekyear(19);
        org.joda.time.DateTime.Property property65 = dateTime62.dayOfWeek();
        org.joda.time.Period period66 = duration42.toPeriodFrom((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Seconds seconds67 = period66.toStandardSeconds();
        boolean boolean68 = duration9.equals((java.lang.Object) seconds67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime62", (dateTime20.compareTo(dateTime62) == 0) == dateTime20.equals(dateTime62));
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
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime19 = dateTime15.withMillis(6216719587200001L);
        org.joda.time.DateTime dateTime21 = dateTime19.withYearOfEra(12);
        org.joda.time.DateTime.Property property22 = dateTime21.dayOfWeek();
        org.joda.time.Duration duration25 = new org.joda.time.Duration(61200000L, (-604800000L));
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 1, periodType28, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) '4', chronology33);
        org.joda.time.ReadablePartial readablePartial36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.withFields(readablePartial36);
        org.joda.time.DateTime.Property property38 = dateTime37.millisOfDay();
        org.joda.time.DateTime dateTime40 = dateTime37.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property41 = dateTime37.era();
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology46);
        int int48 = property41.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Period period49 = duration25.toPeriodTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.LocalDate localDate50 = dateTime47.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone52);
        int int54 = dateTime53.getMillisOfDay();
        org.joda.time.DateTime dateTime56 = dateTime53.plusMillis((int) '#');
        int int57 = dateTime53.getYearOfEra();
        org.joda.time.DateTime.Property property58 = dateTime53.hourOfDay();
        java.util.Locale locale59 = null;
        int int60 = property58.getMaximumTextLength(locale59);
        org.joda.time.DurationField durationField61 = property58.getLeapDurationField();
        org.joda.time.DateTime dateTime63 = property58.addWrapFieldToCopy(82799);
        org.joda.time.DateTime dateTime64 = localDate50.toDateTime((org.joda.time.ReadableInstant) dateTime63);
        int int65 = property22.getDifference((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTime dateTime66 = property22.getDateTime();
        java.lang.String str67 = property22.getAsShortText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime47", (instant0.compareTo(dateTime47) == 0) == instant0.equals(dateTime47));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
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
        org.joda.time.MutableDateTime mutableDateTime24 = instant23.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime25 = instant23.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone27);
        int int29 = dateTime28.getSecondOfMinute();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(periodType30);
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadablePeriod) mutablePeriod31);
        java.lang.String str33 = dateTime28.toString();
        org.joda.time.DateTime dateTime35 = dateTime28.withSecondOfMinute(34);
        org.joda.time.DateTime dateTime36 = dateTime28.toDateTime();
        org.joda.time.Seconds seconds37 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) mutableDateTime25, (org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        long long43 = interval41.toDurationMillis();
        org.joda.time.Interval interval45 = interval41.withEndMillis((long) (short) 100);
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        long long51 = interval49.toDurationMillis();
        org.joda.time.Interval interval53 = interval49.withEndMillis((long) (short) 100);
        long long54 = interval49.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean65 = mutableInterval60.isBefore((org.joda.time.ReadableInterval) mutableInterval64);
        boolean boolean66 = mutableInterval57.contains((org.joda.time.ReadableInterval) mutableInterval64);
        org.joda.time.Weeks weeks67 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval64);
        org.joda.time.ReadableDuration readableDuration68 = null;
        mutableInterval64.setDurationBeforeEnd(readableDuration68);
        org.joda.time.Interval interval70 = interval49.gap((org.joda.time.ReadableInterval) mutableInterval64);
        boolean boolean71 = interval41.overlaps((org.joda.time.ReadableInterval) mutableInterval64);
        long long72 = mutableInterval64.getStartMillis();
        org.joda.time.Instant instant74 = new org.joda.time.Instant((long) 5699);
        mutableInterval64.setEnd((org.joda.time.ReadableInstant) instant74);
        org.joda.time.Hours hours76 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) instant74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant23", (dateTime22.compareTo(instant23) == 0) == dateTime22.equals(instant23));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
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
        org.joda.time.DateTime.Property property25 = dateTime9.centuryOfEra();
        org.joda.time.DateTime dateTime27 = dateTime9.minusMinutes(83400);
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology32);
        org.joda.time.DateTime dateTime35 = dateTime33.withMillisOfDay((int) ' ');
        org.joda.time.DateTime dateTime37 = dateTime35.withWeekOfWeekyear(8);
        boolean boolean38 = dateTime27.isBefore((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean49 = mutableInterval44.isBefore((org.joda.time.ReadableInterval) mutableInterval48);
        boolean boolean50 = mutableInterval41.contains((org.joda.time.ReadableInterval) mutableInterval48);
        mutableInterval41.setDurationAfterStart(0L);
        boolean boolean53 = mutableInterval41.containsNow();
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        long long59 = interval57.toDurationMillis();
        org.joda.time.Interval interval61 = interval57.withEndMillis((long) (short) 100);
        long long62 = interval57.toDurationMillis();
        boolean boolean63 = mutableInterval41.overlaps((org.joda.time.ReadableInterval) interval57);
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval70 = mutableInterval69.toInterval();
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean74 = mutableInterval69.isBefore((org.joda.time.ReadableInterval) mutableInterval73);
        boolean boolean75 = mutableInterval66.contains((org.joda.time.ReadableInterval) mutableInterval73);
        org.joda.time.Weeks weeks76 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval73);
        long long77 = mutableInterval73.getEndMillis();
        org.joda.time.DateTime dateTime78 = mutableInterval73.getEnd();
        org.joda.time.Chronology chronology79 = mutableInterval73.getChronology();
        mutableInterval41.setChronology(chronology79);
        org.joda.time.DurationField durationField81 = chronology79.days();
        org.joda.time.DateTimeField dateTimeField82 = chronology79.hourOfHalfday();
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime((java.lang.Object) dateTime37, chronology79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime33", (instant10.compareTo(dateTime33) == 0) == instant10.equals(dateTime33));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime5 = dateTime2.plusMillis((int) '#');
        int int6 = dateTime2.getYearOfEra();
        org.joda.time.DateTime.Property property7 = dateTime2.secondOfMinute();
        int int8 = dateTime2.getCenturyOfEra();
        org.joda.time.LocalTime localTime9 = dateTime2.toLocalTime();
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
        org.joda.time.DateTime.Property property24 = dateTime20.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone26);
        int int28 = dateTime27.getDayOfMonth();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 1, periodType30, chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone38 = chronology35.getZone();
        org.joda.time.DateTime dateTime39 = dateTime27.withZoneRetainFields(dateTimeZone38);
        org.joda.time.DateTime dateTime40 = dateTime20.withZone(dateTimeZone38);
        org.joda.time.DateTime dateTime42 = dateTime40.withYear((int) (byte) 1);
        int int43 = dateTime40.getYear();
        org.joda.time.Days days44 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Instant instant45 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Instant instant48 = instant45.withDurationAdded(readableDuration46, 10);
        org.joda.time.Instant instant51 = instant45.withDurationAdded((-54432000000L), 3);
        org.joda.time.Instant instant52 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.Chronology chronology60 = interval59.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 1, periodType55, chronology60);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) '4', chronology60);
        org.joda.time.ReadablePartial readablePartial63 = null;
        org.joda.time.DateTime dateTime64 = dateTime62.withFields(readablePartial63);
        boolean boolean65 = instant52.isAfter((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.DateTime.Property property66 = dateTime62.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone68);
        int int70 = dateTime69.getDayOfMonth();
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval76 = mutableInterval75.toInterval();
        org.joda.time.Chronology chronology77 = interval76.getChronology();
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((long) 1, periodType72, chronology77);
        org.joda.time.DateTimeField dateTimeField79 = chronology77.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone80 = chronology77.getZone();
        org.joda.time.DateTime dateTime81 = dateTime69.withZoneRetainFields(dateTimeZone80);
        org.joda.time.DateTime dateTime82 = dateTime62.withZone(dateTimeZone80);
        org.joda.time.Duration duration84 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Period period85 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime82, (org.joda.time.ReadableDuration) duration84);
        boolean boolean86 = instant51.isBefore((org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.Instant instant88 = instant51.withMillis((long) 22);
        org.joda.time.Chronology chronology89 = instant88.getChronology();
        org.joda.time.DateTime dateTime90 = dateTime2.toDateTime(chronology89);
        org.joda.time.DurationField durationField91 = chronology89.weeks();
        org.joda.time.DurationField durationField92 = chronology89.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime90", (dateTime2.compareTo(dateTime90) == 0) == dateTime2.equals(dateTime90));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
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
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime11.minus(readablePeriod17);
        int int19 = dateTime18.getMinuteOfDay();
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
        org.joda.time.Instant instant63 = instant20.withDurationAdded((org.joda.time.ReadableDuration) duration34, 49);
        org.joda.time.MutableDateTime mutableDateTime64 = instant20.toMutableDateTimeISO();
        org.joda.time.Seconds seconds65 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) mutableDateTime64);
        org.joda.time.DateMidnight dateMidnight66 = dateTime18.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and mutableDateTime64", (instant20.compareTo(mutableDateTime64) == 0) == instant20.equals(mutableDateTime64));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        long long13 = mutableInterval9.getEndMillis();
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean24 = mutableInterval19.isBefore((org.joda.time.ReadableInterval) mutableInterval23);
        boolean boolean25 = mutableInterval16.contains((org.joda.time.ReadableInterval) mutableInterval23);
        mutableInterval9.setInterval((org.joda.time.ReadableInterval) mutableInterval23);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', chronology34);
        org.joda.time.ReadablePartial readablePartial37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withFields(readablePartial37);
        org.joda.time.DateTime.Property property39 = dateTime38.millisOfDay();
        boolean boolean40 = mutableInterval9.isBefore((org.joda.time.ReadableInstant) dateTime38);
        int int41 = dateTime38.getHourOfDay();
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
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone58);
        int int60 = dateTime59.getDayOfMonth();
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        org.joda.time.Chronology chronology67 = interval66.getChronology();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) 1, periodType62, chronology67);
        org.joda.time.DateTimeField dateTimeField69 = chronology67.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone70 = chronology67.getZone();
        org.joda.time.DateTime dateTime71 = dateTime59.withZoneRetainFields(dateTimeZone70);
        org.joda.time.DateTime dateTime72 = dateTime52.withZone(dateTimeZone70);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = dateTime72.toDateTime(dateTimeZone73);
        boolean boolean75 = dateTime38.isAfter((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.Instant instant76 = dateTime38.toInstant();
        org.joda.time.DateTime dateTime77 = instant76.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime78 = instant76.toMutableDateTime();
        org.joda.time.PeriodType periodType81 = null;
        org.joda.time.MutableInterval mutableInterval84 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval85 = mutableInterval84.toInterval();
        org.joda.time.Chronology chronology86 = interval85.getChronology();
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((long) 1, periodType81, chronology86);
        org.joda.time.DateTimeField dateTimeField88 = chronology86.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone89 = chronology86.getZone();
        java.lang.String str90 = dateTimeZone89.toString();
        long long93 = dateTimeZone89.adjustOffset((long) '#', true);
        java.util.Locale locale95 = null;
        java.lang.String str96 = dateTimeZone89.getShortName((long) 2022, locale95);
        org.joda.time.DateTime dateTime97 = new org.joda.time.DateTime((long) (short) 100, dateTimeZone89);
        org.joda.time.DateTime dateTime98 = mutableDateTime78.toDateTime(dateTimeZone89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and instant76", (dateTime36.compareTo(instant76) == 0) == dateTime36.equals(instant76));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime7 = dateTime2.withMillis(6216719238000000L);
        org.joda.time.DateTime dateTime9 = dateTime2.minusMonths(52);
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.Interval interval15 = interval13.toInterval();
        org.joda.time.Duration duration17 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval18 = interval15.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration17);
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        org.joda.time.DateTime dateTime26 = dateTime24.withWeekyear((int) (short) 1);
        org.joda.time.Duration duration27 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 1, periodType30, chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) '4', chronology35);
        org.joda.time.ReadablePartial readablePartial38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.withFields(readablePartial38);
        org.joda.time.DateTime.Property property40 = dateTime39.millisOfDay();
        org.joda.time.DateTime dateTime41 = dateTime39.withEarlierOffsetAtOverlap();
        int int42 = dateTime39.getDayOfWeek();
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 1, periodType44, chronology49);
        org.joda.time.DateTimeField dateTimeField51 = chronology49.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone52 = chronology49.getZone();
        org.joda.time.DateTime dateTime53 = dateTime39.withChronology(chronology49);
        org.joda.time.Interval interval54 = duration27.toIntervalTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period57 = duration27.toPeriodFrom((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Period period58 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType59 = period58.getPeriodType();
        org.joda.time.Period period60 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableDuration) duration27, periodType59);
        org.joda.time.Duration duration62 = duration17.withDurationAdded((org.joda.time.ReadableDuration) duration27, 4);
        org.joda.time.Duration duration63 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration64 = duration63.toDuration();
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.DateTimeZone dateTimeZone70 = chronology69.getZone();
        org.joda.time.Period period71 = duration63.toPeriod(chronology69);
        org.joda.time.Duration duration72 = duration17.minus((org.joda.time.ReadableDuration) duration63);
        long long73 = duration72.getStandardDays();
        long long74 = duration72.getStandardDays();
        long long75 = duration72.getStandardDays();
        java.lang.String str76 = duration72.toString();
        org.joda.time.Duration duration78 = duration72.minus((-9223372025040351616L));
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration72);
        int int80 = dateTime2.getYearOfCentury();
        org.joda.time.Instant instant81 = org.joda.time.Instant.now();
        org.joda.time.Instant instant83 = instant81.minus(100L);
        org.joda.time.DateTime dateTime84 = instant83.toDateTimeISO();
        org.joda.time.Hours hours85 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours86 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours87 = hours85.minus(hours86);
        org.joda.time.Hours hours88 = org.joda.time.Hours.ONE;
        boolean boolean89 = hours85.isLessThan(hours88);
        org.joda.time.DateTime dateTime90 = dateTime84.minus((org.joda.time.ReadablePeriod) hours88);
        org.joda.time.DateTime.Property property91 = dateTime84.dayOfYear();
        org.joda.time.DateTime dateTime93 = dateTime84.plusMinutes(498);
        org.joda.time.Hours hours94 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant81", (dateTime24.compareTo(instant81) == 0) == dateTime24.equals(instant81));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        long long5 = interval3.toDurationMillis();
        org.joda.time.Interval interval7 = interval3.withEndMillis((long) (short) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 10);
        org.joda.time.Interval interval12 = interval7.withEnd((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Instant instant14 = instant8.withMillis((long) 4);
        org.joda.time.Instant instant16 = instant14.plus((long) 86399);
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean27 = mutableInterval22.isBefore((org.joda.time.ReadableInterval) mutableInterval26);
        boolean boolean28 = mutableInterval19.contains((org.joda.time.ReadableInterval) mutableInterval26);
        org.joda.time.MutableInterval mutableInterval29 = mutableInterval19.copy();
        org.joda.time.Duration duration30 = mutableInterval19.toDuration();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone32);
        int int34 = dateTime33.getDayOfMonth();
        org.joda.time.DateTime dateTime36 = dateTime33.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime38 = dateTime36.withYear(0);
        org.joda.time.DateTime.Property property39 = dateTime38.era();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone41);
        int int43 = dateTime42.getSecondOfMinute();
        int int44 = dateTime42.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone46);
        int int48 = dateTime47.getMillisOfDay();
        org.joda.time.DateTime dateTime50 = dateTime47.plusMillis((int) '#');
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) 1, periodType53, chronology58);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) '4', chronology58);
        org.joda.time.DateTime dateTime61 = dateTime50.withChronology(chronology58);
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime42.toMutableDateTime(chronology58);
        org.joda.time.DateTime dateTime63 = dateTime38.toDateTime(chronology58);
        boolean boolean64 = mutableInterval19.contains((org.joda.time.ReadableInstant) dateTime63);
        java.util.TimeZone timeZone65 = null;
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        org.joda.time.DateTime dateTime67 = dateTime63.toDateTime(dateTimeZone66);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int69 = dateTime67.get(dateTimeFieldType68);
        java.lang.String str70 = dateTimeFieldType68.toString();
        boolean boolean71 = instant16.isSupported(dateTimeFieldType68);
        org.joda.time.Instant instant72 = instant16.toInstant();
        org.joda.time.MutableDateTime mutableDateTime73 = instant16.toMutableDateTime();
        org.joda.time.DateTime dateTime74 = instant16.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime73", (instant16.compareTo(mutableDateTime73) == 0) == instant16.equals(mutableDateTime73));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.joda.time.Period period1 = org.joda.time.Period.days((-1));
        org.joda.time.Period period3 = period1.withYears(82800010);
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval10 = mutableInterval9.toInterval();
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean14 = mutableInterval9.isBefore((org.joda.time.ReadableInterval) mutableInterval13);
        boolean boolean15 = mutableInterval6.contains((org.joda.time.ReadableInterval) mutableInterval13);
        boolean boolean17 = mutableInterval6.isBefore(0L);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str19 = periodType18.getName();
        org.joda.time.PeriodType periodType20 = periodType18.withSecondsRemoved();
        org.joda.time.Period period21 = mutableInterval6.toPeriod(periodType18);
        java.lang.Object obj22 = mutableInterval6.clone();
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.Interval interval28 = interval26.toInterval();
        boolean boolean29 = mutableInterval6.contains((org.joda.time.ReadableInterval) interval26);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone31);
        int int33 = dateTime32.getDayOfMonth();
        org.joda.time.DateTime dateTime35 = dateTime32.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime37 = dateTime35.withYear(0);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.Chronology chronology45 = interval44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 1, periodType40, chronology45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) '4', chronology45);
        org.joda.time.Instant instant48 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 1, periodType51, chronology56);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) '4', chronology56);
        org.joda.time.ReadablePartial readablePartial59 = null;
        org.joda.time.DateTime dateTime60 = dateTime58.withFields(readablePartial59);
        boolean boolean61 = instant48.isAfter((org.joda.time.ReadableInstant) dateTime58);
        boolean boolean62 = dateTime47.isAfter((org.joda.time.ReadableInstant) dateTime58);
        java.lang.String str63 = dateTime47.toString();
        boolean boolean64 = dateTime37.isAfter((org.joda.time.ReadableInstant) dateTime47);
        mutableInterval6.setStart((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period3, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime.Property property67 = dateTime37.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone69);
        int int71 = dateTime70.getDayOfMonth();
        org.joda.time.DateTime dateTime73 = dateTime70.withMillisOfDay((int) 'a');
        org.joda.time.LocalDateTime localDateTime74 = dateTime70.toLocalDateTime();
        java.lang.String str75 = localDateTime74.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = localDateTime74.getFieldType(1);
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone79);
        int int81 = dateTime80.getDayOfMonth();
        org.joda.time.DateTime dateTime83 = dateTime80.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property84 = dateTime83.dayOfYear();
        org.joda.time.DateTime dateTime85 = property84.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime87 = property84.addToCopy(100);
        org.joda.time.MutableInterval mutableInterval90 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval91 = mutableInterval90.toInterval();
        org.joda.time.Chronology chronology92 = interval91.getChronology();
        org.joda.time.DateTime dateTime93 = new org.joda.time.DateTime(chronology92);
        org.joda.time.LocalDateTime localDateTime94 = dateTime93.toLocalDateTime();
        int int95 = property84.compareTo((org.joda.time.ReadablePartial) localDateTime94);
        org.joda.time.Seconds seconds96 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadablePartial) localDateTime74, (org.joda.time.ReadablePartial) localDateTime94);
        int int97 = property67.compareTo((org.joda.time.ReadablePartial) localDateTime94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant48 and dateTime93", (instant48.compareTo(dateTime93) == 0) == instant48.equals(dateTime93));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime2.withMillisOfDay((int) (byte) 1);
        boolean boolean9 = dateTime7.isEqual((-62135946000000L));
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, periodType12, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', chronology17);
        org.joda.time.ReadablePartial readablePartial20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withFields(readablePartial20);
        org.joda.time.DateTime.Property property22 = dateTime21.millisOfDay();
        org.joda.time.DateTime dateTime23 = property22.withMinimumValue();
        java.util.Locale locale24 = null;
        int int25 = property22.getMaximumTextLength(locale24);
        org.joda.time.DateTime dateTime26 = property22.roundCeilingCopy();
        int int27 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateTime26);
        int int28 = dateTime26.getDayOfWeek();
        org.joda.time.Instant instant29 = dateTime26.toInstant();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 1, periodType33, chronology38);
        org.joda.time.Chronology chronology40 = chronology38.withUTC();
        org.joda.time.Period period41 = new org.joda.time.Period((-2209338000000L), periodType31, chronology40);
        org.joda.time.DateTime dateTime42 = dateTime26.toDateTime(chronology40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant29", (dateTime26.compareTo(instant29) == 0) == dateTime26.equals(instant29));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.joda.time.Duration duration2 = new org.joda.time.Duration(61200000L, (-604800000L));
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 1, periodType5, chronology10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', chronology10);
        org.joda.time.ReadablePartial readablePartial13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withFields(readablePartial13);
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        org.joda.time.DateTime dateTime17 = dateTime14.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property18 = dateTime14.era();
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        int int25 = property18.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Period period26 = duration2.toPeriodTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 1, periodType28, chronology33);
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
        org.joda.time.Duration duration49 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval56 = mutableInterval55.toInterval();
        org.joda.time.Chronology chronology57 = interval56.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 1, periodType52, chronology57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) '4', chronology57);
        org.joda.time.ReadablePartial readablePartial60 = null;
        org.joda.time.DateTime dateTime61 = dateTime59.withFields(readablePartial60);
        org.joda.time.DateTime.Property property62 = dateTime61.millisOfDay();
        org.joda.time.DateTime dateTime63 = dateTime61.withEarlierOffsetAtOverlap();
        int int64 = dateTime61.getDayOfWeek();
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval70 = mutableInterval69.toInterval();
        org.joda.time.Chronology chronology71 = interval70.getChronology();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) 1, periodType66, chronology71);
        org.joda.time.DateTimeField dateTimeField73 = chronology71.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone74 = chronology71.getZone();
        org.joda.time.DateTime dateTime75 = dateTime61.withChronology(chronology71);
        org.joda.time.Interval interval76 = duration49.toIntervalTo((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Instant instant78 = instant35.withDurationAdded((org.joda.time.ReadableDuration) duration49, 49);
        mutablePeriod34.setPeriod((org.joda.time.ReadableDuration) duration49);
        org.joda.time.Duration duration80 = duration2.minus((org.joda.time.ReadableDuration) duration49);
        org.joda.time.Duration duration81 = duration49.toDuration();
        org.joda.time.ReadableDuration readableDuration82 = null;
        boolean boolean83 = duration81.isLongerThan(readableDuration82);
        org.joda.time.Seconds seconds84 = duration81.toStandardSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant35", (dateTime24.compareTo(instant35) == 0) == dateTime24.equals(instant35));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
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
        org.joda.time.LocalTime localTime19 = dateTime15.toLocalTime();
        org.joda.time.Period period21 = org.joda.time.Period.days((-1));
        org.joda.time.Period period23 = period21.withWeeks((int) 'a');
        org.joda.time.MutablePeriod mutablePeriod24 = period23.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        mutablePeriod33.addMillis(2022);
        mutablePeriod33.add(57, 10, (int) (short) -1, 57, (int) (short) 1, 1970, (-90), 22);
        mutablePeriod24.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.DateTime dateTime46 = dateTime15.minus((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, readableInstant47);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(3600);
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(dateTimeZone50);
        long long53 = dateTimeZone50.nextTransition((-377705466000001L));
        long long56 = dateTimeZone50.convertLocalToUTC(23442307200000L, true);
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime15.toMutableDateTime(dateTimeZone50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime51", (instant0.compareTo(dateTime51) == 0) == instant0.equals(dateTime51));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays(100L);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withFields(readablePartial12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfDay();
        org.joda.time.DateTime dateTime16 = dateTime13.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property17 = dateTime13.era();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Interval interval20 = duration1.toIntervalTo(readableInstant19);
        long long21 = duration1.getMillis();
        long long22 = duration1.getStandardHours();
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
        org.joda.time.DateTime dateTime38 = property37.withMaximumValue();
        org.joda.time.DateTime dateTime40 = dateTime38.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((java.lang.Object) dateTime38);
        int int42 = dateTime38.getDayOfMonth();
        org.joda.time.DateTime dateTime44 = dateTime38.minusYears(1969);
        org.joda.time.DateMidnight dateMidnight45 = dateTime38.toDateMidnight();
        org.joda.time.Interval interval46 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateMidnight45);
        boolean boolean48 = interval46.contains(118338600000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and instant41", (dateTime38.compareTo(instant41) == 0) == dateTime38.equals(instant41));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
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
        org.joda.time.DateTime.Property property15 = dateTime11.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean17 = dateTime11.isSupported(dateTimeFieldType16);
        org.joda.time.LocalDate localDate18 = dateTime11.toLocalDate();
        int int19 = dateTime11.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone21);
        int int23 = dateTime22.getDayOfMonth();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone33 = chronology30.getZone();
        org.joda.time.DateTime dateTime34 = dateTime22.withZoneRetainFields(dateTimeZone33);
        org.joda.time.DateTime.Property property35 = dateTime22.secondOfMinute();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.DateTimeZone dateTimeZone42 = chronology41.getZone();
        java.lang.String str44 = dateTimeZone42.getName(100L);
        org.joda.time.DateTime dateTime45 = dateTime36.withZoneRetainFields(dateTimeZone42);
        java.lang.String str46 = dateTimeZone42.toString();
        java.util.TimeZone timeZone47 = dateTimeZone42.toTimeZone();
        int int49 = dateTimeZone42.getOffset((-3155673597543L));
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis(22591269);
        long long53 = dateTimeZone42.getMillisKeepLocal(dateTimeZone51, (-6216719500799976L));
        org.joda.time.DateTime dateTime54 = dateTime22.toDateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime55 = dateTime11.withZone(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime54", (dateTime22.compareTo(dateTime54) == 0) == dateTime22.equals(dateTime54));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval9.setInterval((-80867997L), 271254L);
        org.joda.time.Period period16 = mutableInterval9.toPeriod();
        org.joda.time.Interval interval17 = mutableInterval9.toInterval();
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant21 = instant18.withDurationAdded(readableDuration19, 10);
        org.joda.time.Instant instant22 = instant21.toInstant();
        org.joda.time.DateTime dateTime23 = instant21.toDateTime();
        boolean boolean24 = interval17.contains((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Duration duration25 = interval17.toDuration();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and dateTime23", (instant18.compareTo(dateTime23) == 0) == instant18.equals(dateTime23));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.joda.time.Period period3 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.Period period6 = new org.joda.time.Period(105L, periodType5);
        java.lang.String str7 = periodType5.getName();
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime17 = dateTime15.plus((long) (short) -1);
        org.joda.time.Chronology chronology18 = dateTime15.getChronology();
        long long22 = chronology18.add(35063L, (long) 24, 496);
        org.joda.time.DateTimeField dateTimeField23 = chronology18.dayOfMonth();
        org.joda.time.Period period24 = new org.joda.time.Period((long) 22635235, (long) (-1), periodType5, chronology18);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone26);
        int int28 = dateTime27.getMillisOfDay();
        org.joda.time.DateTime dateTime30 = dateTime27.plusMillis((int) '#');
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 1, periodType33, chronology38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) '4', chronology38);
        org.joda.time.DateTime dateTime41 = dateTime30.withChronology(chronology38);
        org.joda.time.DateTime dateTime43 = dateTime41.plusDays((int) (byte) -1);
        boolean boolean44 = dateTime41.isAfterNow();
        org.joda.time.Duration duration45 = period24.toDurationFrom((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Instant instant46 = dateTime41.toInstant();
        org.joda.time.DateTime.Property property47 = dateTime41.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and instant46", (dateTime41.compareTo(instant46) == 0) == dateTime41.equals(instant46));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        int int10 = dateTime9.getMinuteOfDay();
        int int11 = dateTime9.getEra();
        org.joda.time.DateTime.Property property12 = dateTime9.weekOfWeekyear();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology18.getZone();
        java.lang.String str21 = dateTimeZone19.getName(100L);
        org.joda.time.DateTime dateTime22 = dateTime13.withZoneRetainFields(dateTimeZone19);
        java.lang.String str23 = dateTimeZone19.toString();
        java.util.TimeZone timeZone24 = dateTimeZone19.toTimeZone();
        int int26 = dateTimeZone19.getOffset((-3155673597543L));
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(22591269);
        long long30 = dateTimeZone19.getMillisKeepLocal(dateTimeZone28, (-6216719500799976L));
        org.joda.time.DateTime dateTime31 = dateTime9.withZone(dateTimeZone19);
        org.joda.time.Seconds seconds33 = org.joda.time.Seconds.seconds((int) (short) 1);
        org.joda.time.Seconds seconds35 = seconds33.dividedBy(45);
        org.joda.time.DurationFieldType durationFieldType36 = seconds33.getFieldType();
        java.lang.String str37 = durationFieldType36.getName();
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean48 = mutableInterval43.isBefore((org.joda.time.ReadableInterval) mutableInterval47);
        boolean boolean49 = mutableInterval40.contains((org.joda.time.ReadableInterval) mutableInterval47);
        org.joda.time.DateTime dateTime50 = mutableInterval40.getStart();
        java.lang.Object obj51 = mutableInterval40.clone();
        org.joda.time.DateTime dateTime52 = mutableInterval40.getStart();
        mutableInterval40.setStartMillis((-54432000000L));
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType58);
        mutablePeriod59.addMonths(0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray62 = mutablePeriod59.getFieldTypes();
        org.joda.time.PeriodType periodType63 = org.joda.time.PeriodType.forFields(durationFieldTypeArray62);
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.Chronology chronology70 = interval69.getChronology();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((long) 1, periodType65, chronology70);
        org.joda.time.DateTimeField dateTimeField72 = chronology70.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone73 = chronology70.getZone();
        org.joda.time.DateTimeField dateTimeField74 = chronology70.minuteOfHour();
        org.joda.time.DurationField durationField75 = chronology70.seconds();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((long) (short) 1, periodType63, chronology70);
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval((java.lang.Object) mutableInterval40, chronology70);
        org.joda.time.MutableInterval mutableInterval80 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval81 = mutableInterval80.toInterval();
        org.joda.time.Chronology chronology82 = interval81.getChronology();
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime(chronology82);
        org.joda.time.Chronology chronology84 = chronology82.withUTC();
        org.joda.time.DateTimeField dateTimeField85 = chronology84.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField86 = chronology84.yearOfEra();
        org.joda.time.DateTimeField dateTimeField87 = chronology84.millisOfDay();
        org.joda.time.DateTimeField dateTimeField88 = chronology84.hourOfDay();
        org.joda.time.DateTimeField dateTimeField89 = chronology84.minuteOfHour();
        mutableInterval77.setChronology(chronology84);
        boolean boolean91 = durationFieldType36.isSupported(chronology84);
        org.joda.time.DateTimeField dateTimeField92 = chronology84.minuteOfDay();
        org.joda.time.DateTime dateTime93 = dateTime31.toDateTime(chronology84);
        org.joda.time.DateTimeField dateTimeField94 = chronology84.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime93", (dateTime0.compareTo(dateTime93) == 0) == dateTime0.equals(dateTime93));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getName(164096150400000L, locale2);
        java.util.TimeZone timeZone4 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period17 = org.joda.time.Period.days((-1));
        org.joda.time.Period period19 = period17.withWeeks((int) 'a');
        java.lang.String str20 = period17.toString();
        mutablePeriod15.setPeriod((org.joda.time.ReadablePeriod) period17);
        mutablePeriod15.addMonths((int) (short) -1);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 1, periodType28, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) '4', chronology33);
        org.joda.time.ReadablePartial readablePartial36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.withFields(readablePartial36);
        org.joda.time.DateTime.Property property38 = dateTime37.millisOfDay();
        org.joda.time.DateTime dateTime39 = dateTime37.withEarlierOffsetAtOverlap();
        int int40 = dateTime37.getDayOfWeek();
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 1, periodType42, chronology47);
        org.joda.time.DateTimeField dateTimeField49 = chronology47.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone50 = chronology47.getZone();
        org.joda.time.DateTime dateTime51 = dateTime37.withChronology(chronology47);
        org.joda.time.Minutes minutes53 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType54 = null;
        int int55 = minutes53.get(durationFieldType54);
        int int57 = minutes53.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod58 = minutes53.toMutablePeriod();
        long long61 = chronology47.add((org.joda.time.ReadablePeriod) mutablePeriod58, (long) '#', (int) (short) 10);
        mutablePeriod15.setPeriod((long) (short) 100, (long) 2, chronology47);
        org.joda.time.DurationField durationField63 = chronology47.months();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval71 = mutableInterval70.toInterval();
        org.joda.time.Chronology chronology72 = interval71.getChronology();
        org.joda.time.DateTimeZone dateTimeZone73 = chronology72.getZone();
        java.lang.String str75 = dateTimeZone73.getName(100L);
        org.joda.time.DateTime dateTime76 = dateTime67.withZoneRetainFields(dateTimeZone73);
        long long78 = dateTimeZone66.getMillisKeepLocal(dateTimeZone73, 6000035L);
        org.joda.time.Chronology chronology79 = chronology47.withZone(dateTimeZone73);
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime(chronology47);
        org.joda.time.DateTime dateTime82 = dateTime80.minusDays(11);
        org.joda.time.DateTime dateTime84 = dateTime80.withMillisOfDay(19);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.Period period87 = org.joda.time.Period.days((-1));
        org.joda.time.Period period89 = period87.withWeeks((int) 'a');
        org.joda.time.MutablePeriod mutablePeriod90 = period89.toMutablePeriod();
        mutablePeriod90.setHours(8);
        mutablePeriod90.setPeriod(44000L);
        org.joda.time.Days days95 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) mutablePeriod90);
        mutablePeriod90.setHours(10);
        int int98 = mutablePeriod90.getHours();
        mutablePeriod85.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime67", (dateTime6.compareTo(dateTime67) == 0) == dateTime6.equals(dateTime67));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays(100L);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withFields(readablePartial12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfDay();
        org.joda.time.DateTime dateTime16 = dateTime13.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property17 = dateTime13.era();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Interval interval20 = duration1.toIntervalTo(readableInstant19);
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutableInterval mutableInterval26 = interval24.toMutableInterval();
        org.joda.time.Interval interval28 = interval24.withEndMillis(53L);
        org.joda.time.Chronology chronology29 = interval24.getChronology();
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean40 = mutableInterval35.isBefore((org.joda.time.ReadableInterval) mutableInterval39);
        boolean boolean41 = mutableInterval32.contains((org.joda.time.ReadableInterval) mutableInterval39);
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        long long47 = interval45.toDurationMillis();
        org.joda.time.Interval interval49 = interval45.withEndMillis((long) (short) 100);
        mutableInterval39.setInterval((org.joda.time.ReadableInterval) interval45);
        boolean boolean51 = mutableInterval39.containsNow();
        boolean boolean52 = interval24.contains((org.joda.time.ReadableInterval) mutableInterval39);
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(periodType53);
        org.joda.time.Period period55 = mutableInterval39.toPeriod(periodType53);
        org.joda.time.Duration duration56 = mutableInterval39.toDuration();
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.Chronology chronology61 = interval60.getChronology();
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(chronology61);
        org.joda.time.DateTime dateTime64 = dateTime62.withWeekyear((int) (short) 1);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = dateTime62.toDateTime(chronology65);
        boolean boolean67 = mutableInterval39.isBefore((org.joda.time.ReadableInstant) dateTime66);
        boolean boolean68 = interval20.abuts((org.joda.time.ReadableInterval) mutableInterval39);
        org.joda.time.Instant instant69 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology70 = instant69.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.yearOfEra();
        org.joda.time.DateTimeField dateTimeField72 = chronology70.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField73 = chronology70.millisOfDay();
        org.joda.time.Interval interval74 = interval20.withChronology(chronology70);
        org.joda.time.Instant instant76 = org.joda.time.Instant.parse("1");
        org.joda.time.Instant instant77 = instant76.toInstant();
        org.joda.time.Instant instant79 = instant76.minus(6216719936400001L);
        org.joda.time.Instant instant82 = instant76.withDurationAdded(3600999L, 2922789);
        boolean boolean83 = interval74.isBefore((org.joda.time.ReadableInstant) instant76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime62 and instant69", (dateTime62.compareTo(instant69) == 0) == dateTime62.equals(instant69));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) ' ');
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.minutes(0);
        org.joda.time.Duration duration4 = minutes3.toStandardDuration();
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
        org.joda.time.DateTimeField dateTimeField31 = chronology26.dayOfMonth();
        org.joda.time.Period period32 = duration4.toPeriod(chronology26);
        boolean boolean33 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
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
        org.joda.time.Duration duration66 = duration34.withMillis(100L);
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
        org.joda.time.DateTime dateTime82 = property81.withMaximumValue();
        org.joda.time.DurationField durationField83 = property81.getRangeDurationField();
        org.joda.time.DateTime dateTime84 = property81.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime86 = dateTime84.toDateTime(dateTimeZone85);
        org.joda.time.DateTime dateTime88 = dateTime86.withWeekyear(19);
        org.joda.time.DateTime.Property property89 = dateTime86.dayOfWeek();
        org.joda.time.Period period90 = duration66.toPeriodFrom((org.joda.time.ReadableInstant) dateTime86);
        int int91 = duration1.compareTo((org.joda.time.ReadableDuration) duration66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime86", (dateTime14.compareTo(dateTime86) == 0) == dateTime14.equals(dateTime86));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("69");
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, periodType3, chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.yearOfCentury();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology16.getZone();
        java.lang.String str19 = dateTimeZone17.getName(100L);
        org.joda.time.DateTime dateTime20 = dateTime11.withZoneRetainFields(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology25.getZone();
        java.lang.String str28 = dateTimeZone26.getName(100L);
        org.joda.time.DateTime dateTime29 = dateTime20.withZoneRetainFields(dateTimeZone26);
        org.joda.time.Chronology chronology30 = chronology8.withZone(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology39.getZone();
        java.lang.String str42 = dateTimeZone40.getName(100L);
        org.joda.time.DateTime dateTime43 = dateTime34.withZoneRetainFields(dateTimeZone40);
        long long45 = dateTimeZone33.getMillisKeepLocal(dateTimeZone40, 6000035L);
        java.util.Locale locale47 = null;
        java.lang.String str48 = dateTimeZone33.getShortName((long) 1, locale47);
        org.joda.time.Chronology chronology49 = chronology30.withZone(dateTimeZone33);
        org.joda.time.DateTime dateTime50 = instant1.toDateTime(dateTimeZone33);
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
        org.joda.time.DateTime.Property property65 = dateTime61.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone67);
        int int69 = dateTime68.getDayOfMonth();
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval75 = mutableInterval74.toInterval();
        org.joda.time.Chronology chronology76 = interval75.getChronology();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((long) 1, periodType71, chronology76);
        org.joda.time.DateTimeField dateTimeField78 = chronology76.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone79 = chronology76.getZone();
        org.joda.time.DateTime dateTime80 = dateTime68.withZoneRetainFields(dateTimeZone79);
        org.joda.time.DateTime dateTime81 = dateTime61.withZone(dateTimeZone79);
        org.joda.time.DateTimeZone dateTimeZone82 = null;
        org.joda.time.DateTime dateTime83 = dateTime81.toDateTime(dateTimeZone82);
        java.lang.String str84 = dateTime81.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = null;
        java.lang.String str86 = dateTime81.toString(dateTimeFormatter85);
        org.joda.time.DateTime dateTime88 = dateTime81.withWeekyear((-102725));
        java.lang.Object obj89 = null;
        boolean boolean90 = dateTime88.equals(obj89);
        org.joda.time.MutableDateTime mutableDateTime91 = dateTime88.toMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType92 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType93 = dateTimeFieldType92.getRangeDurationType();
        int int94 = mutableDateTime91.get(dateTimeFieldType92);
        boolean boolean95 = instant1.isSupported(dateTimeFieldType92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant51", (dateTime11.compareTo(instant51) == 0) == dateTime11.equals(instant51));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes2, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTime dateTime9 = instant7.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = instant7.toDateTime();
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology18.getZone();
        java.lang.String str21 = dateTimeZone19.getName(100L);
        org.joda.time.DateTime dateTime22 = dateTime13.withZoneRetainFields(dateTimeZone19);
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology27.getZone();
        java.lang.String str30 = dateTimeZone28.getName(100L);
        org.joda.time.DateTime dateTime31 = dateTime22.withZoneRetainFields(dateTimeZone28);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        mutablePeriod40.add((long) 3);
        org.joda.time.DateTime dateTime43 = dateTime22.minus((org.joda.time.ReadablePeriod) mutablePeriod40);
        org.joda.time.DateTime.Property property44 = dateTime22.monthOfYear();
        org.joda.time.DateTime dateTime45 = property44.roundHalfEvenCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = dateTime45.toString(dateTimeFormatter46);
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone50);
        int int52 = dateTime51.getMillisOfDay();
        org.joda.time.DateTime dateTime54 = dateTime51.plusMillis((int) '#');
        boolean boolean56 = dateTime51.isAfter(53L);
        org.joda.time.DateTime dateTime58 = dateTime51.plusWeeks(82800052);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetMillis(349200000);
        java.lang.String str61 = dateTimeZone60.toString();
        int int63 = dateTimeZone60.getStandardOffset((long) (-2399));
        org.joda.time.DateTime dateTime64 = dateTime58.withZone(dateTimeZone60);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime9", (instant7.compareTo(dateTime9) == 0) == instant7.equals(dateTime9));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(201);
        org.joda.time.Instant instant2 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, 10);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((-54432000000L), 3);
        org.joda.time.DateTime dateTime9 = instant2.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime10 = instant2.toMutableDateTime();
        org.joda.time.Duration duration11 = period1.toDurationFrom((org.joda.time.ReadableInstant) mutableDateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime9", (instant2.compareTo(dateTime9) == 0) == instant2.equals(dateTime9));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        long long13 = mutableInterval9.getEndMillis();
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean24 = mutableInterval19.isBefore((org.joda.time.ReadableInterval) mutableInterval23);
        boolean boolean25 = mutableInterval16.contains((org.joda.time.ReadableInterval) mutableInterval23);
        mutableInterval9.setInterval((org.joda.time.ReadableInterval) mutableInterval23);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', chronology34);
        org.joda.time.ReadablePartial readablePartial37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withFields(readablePartial37);
        org.joda.time.DateTime.Property property39 = dateTime38.millisOfDay();
        boolean boolean40 = mutableInterval9.isBefore((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime38.toMutableDateTime(dateTimeZone41);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 1, periodType44, chronology49);
        org.joda.time.DateTimeField dateTimeField51 = chronology49.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone52 = chronology49.getZone();
        org.joda.time.DateTimeField dateTimeField53 = chronology49.weekOfWeekyear();
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(chronology49);
        org.joda.time.DateTime.Property property55 = dateTime54.era();
        boolean boolean56 = mutableDateTime42.isAfter((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime.Property property57 = dateTime54.minuteOfHour();
        org.joda.time.Duration duration58 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        org.joda.time.Chronology chronology66 = interval65.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 1, periodType61, chronology66);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) '4', chronology66);
        org.joda.time.ReadablePartial readablePartial69 = null;
        org.joda.time.DateTime dateTime70 = dateTime68.withFields(readablePartial69);
        org.joda.time.DateTime.Property property71 = dateTime70.millisOfDay();
        org.joda.time.DateTime dateTime72 = dateTime70.withEarlierOffsetAtOverlap();
        int int73 = dateTime70.getDayOfWeek();
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.MutableInterval mutableInterval78 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval79 = mutableInterval78.toInterval();
        org.joda.time.Chronology chronology80 = interval79.getChronology();
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) 1, periodType75, chronology80);
        org.joda.time.DateTimeField dateTimeField82 = chronology80.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone83 = chronology80.getZone();
        org.joda.time.DateTime dateTime84 = dateTime70.withChronology(chronology80);
        org.joda.time.Interval interval85 = duration58.toIntervalTo((org.joda.time.ReadableInstant) dateTime70);
        java.util.GregorianCalendar gregorianCalendar86 = dateTime70.toGregorianCalendar();
        org.joda.time.LocalDate localDate87 = dateTime70.toLocalDate();
        int int88 = localDate87.size();
        org.joda.time.DateTime dateTime89 = dateTime54.withFields((org.joda.time.ReadablePartial) localDate87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and mutableDateTime42", (dateTime36.compareTo(mutableDateTime42) == 0) == dateTime36.equals(mutableDateTime42));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.MutableDateTime mutableDateTime2 = instant0.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime3 = instant0.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime4 = instant0.toMutableDateTimeISO();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, periodType7, chronology12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', chronology12);
        org.joda.time.ReadablePartial readablePartial15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.withFields(readablePartial15);
        org.joda.time.DateTime.Property property17 = dateTime16.millisOfDay();
        org.joda.time.DateTime dateTime19 = dateTime16.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property20 = dateTime16.era();
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime24 = dateTime16.withDurationAdded((org.joda.time.ReadableDuration) duration22, 0);
        org.joda.time.Days days25 = duration22.toStandardDays();
        org.joda.time.Duration duration26 = duration22.toDuration();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime4, (org.joda.time.ReadableDuration) duration26);
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
        org.joda.time.DateTime.Property property42 = dateTime38.dayOfWeek();
        org.joda.time.DateTime dateTime43 = property42.withMaximumValue();
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
        org.joda.time.DateTime.Property property58 = dateTime54.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone60);
        int int62 = dateTime61.getDayOfMonth();
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 1, periodType64, chronology69);
        org.joda.time.DateTimeField dateTimeField71 = chronology69.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone72 = chronology69.getZone();
        org.joda.time.DateTime dateTime73 = dateTime61.withZoneRetainFields(dateTimeZone72);
        org.joda.time.DateTime dateTime74 = dateTime54.withZone(dateTimeZone72);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = dateTime74.toDateTime(dateTimeZone75);
        org.joda.time.Days days77 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.DateTime dateTime80 = dateTime76.withPeriodAdded(readablePeriod78, 349200000);
        org.joda.time.PeriodType periodType82 = null;
        org.joda.time.MutableInterval mutableInterval85 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval86 = mutableInterval85.toInterval();
        org.joda.time.Chronology chronology87 = interval86.getChronology();
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((long) 1, periodType82, chronology87);
        org.joda.time.DateTimeField dateTimeField89 = chronology87.hourOfHalfday();
        org.joda.time.DurationField durationField90 = chronology87.weeks();
        org.joda.time.DateTimeField dateTimeField91 = chronology87.minuteOfHour();
        org.joda.time.DateTime dateTime92 = dateTime80.withChronology(chronology87);
        boolean boolean93 = mutableDateTime4.isEqual((org.joda.time.ReadableInstant) dateTime92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime2", (instant0.compareTo(mutableDateTime2) == 0) == instant0.equals(mutableDateTime2));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
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
        org.joda.time.DateTime dateTime20 = instant18.toDateTimeISO();
        org.joda.time.DateTime dateTime22 = dateTime20.plusHours(0);
        org.joda.time.DateTime dateTime24 = dateTime20.withSecondOfMinute(59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant18", (dateTime15.compareTo(instant18) == 0) == dateTime15.equals(instant18));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval9.setInterval((-80867997L), 271254L);
        org.joda.time.Period period16 = mutableInterval9.toPeriod();
        org.joda.time.Interval interval17 = mutableInterval9.toInterval();
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant21 = instant18.withDurationAdded(readableDuration19, 10);
        org.joda.time.Instant instant22 = instant21.toInstant();
        org.joda.time.DateTime dateTime23 = instant21.toDateTime();
        boolean boolean24 = interval17.contains((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean35 = mutableInterval30.isBefore((org.joda.time.ReadableInterval) mutableInterval34);
        boolean boolean36 = mutableInterval27.contains((org.joda.time.ReadableInterval) mutableInterval34);
        org.joda.time.Weeks weeks37 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval34);
        org.joda.time.Chronology chronology38 = mutableInterval34.getChronology();
        org.joda.time.Duration duration39 = mutableInterval34.toDuration();
        org.joda.time.Duration duration40 = duration39.toDuration();
        org.joda.time.Interval interval41 = interval17.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardDays(100L);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 1, periodType46, chronology51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) '4', chronology51);
        org.joda.time.ReadablePartial readablePartial54 = null;
        org.joda.time.DateTime dateTime55 = dateTime53.withFields(readablePartial54);
        org.joda.time.DateTime.Property property56 = dateTime55.millisOfDay();
        org.joda.time.DateTime dateTime58 = dateTime55.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property59 = dateTime55.era();
        org.joda.time.Interval interval60 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration43, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.MutableInterval mutableInterval61 = interval60.toMutableInterval();
        boolean boolean62 = mutableInterval61.isAfterNow();
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean73 = mutableInterval68.isBefore((org.joda.time.ReadableInterval) mutableInterval72);
        boolean boolean74 = mutableInterval65.contains((org.joda.time.ReadableInterval) mutableInterval72);
        long long75 = mutableInterval65.getEndMillis();
        mutableInterval61.setInterval((org.joda.time.ReadableInterval) mutableInterval65);
        org.joda.time.MutableInterval mutableInterval77 = mutableInterval61.copy();
        org.joda.time.Duration duration78 = mutableInterval77.toDuration();
        org.joda.time.Interval interval79 = interval17.withDurationAfterStart((org.joda.time.ReadableDuration) duration78);
        org.joda.time.DateTime dateTime80 = interval79.getStart();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and dateTime23", (instant18.compareTo(dateTime23) == 0) == instant18.equals(dateTime23));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        int int2 = dateTime1.getWeekyear();
        org.joda.time.Hours hours3 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period14 = org.joda.time.Period.days((-1));
        org.joda.time.Period period16 = period14.withWeeks((int) 'a');
        java.lang.String str17 = period14.toString();
        mutablePeriod12.setPeriod((org.joda.time.ReadablePeriod) period14);
        int int19 = mutablePeriod12.getMillis();
        org.joda.time.DurationFieldType durationFieldType21 = mutablePeriod12.getFieldType(0);
        int int22 = hours3.get(durationFieldType21);
        org.joda.time.Hours hours24 = hours3.multipliedBy(100);
        org.joda.time.Hours hours26 = hours24.dividedBy(50);
        org.joda.time.Hours hours28 = hours24.dividedBy((int) (byte) 1);
        org.joda.time.Period period30 = org.joda.time.Period.days((-1));
        org.joda.time.Hours hours31 = org.joda.time.Hours.FIVE;
        org.joda.time.PeriodType periodType32 = hours31.getPeriodType();
        org.joda.time.Period period33 = period30.withFields((org.joda.time.ReadablePeriod) hours31);
        org.joda.time.Hours hours34 = hours24.plus(hours31);
        org.joda.time.Hours hours35 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period46 = org.joda.time.Period.days((-1));
        org.joda.time.Period period48 = period46.withWeeks((int) 'a');
        java.lang.String str49 = period46.toString();
        mutablePeriod44.setPeriod((org.joda.time.ReadablePeriod) period46);
        int int51 = mutablePeriod44.getMillis();
        org.joda.time.DurationFieldType durationFieldType53 = mutablePeriod44.getFieldType(0);
        int int54 = hours35.get(durationFieldType53);
        org.joda.time.Hours hours56 = hours35.multipliedBy(100);
        org.joda.time.Hours hours57 = hours34.plus(hours35);
        org.joda.time.Hours hours59 = hours57.plus(19);
        org.joda.time.Interval interval60 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadablePeriod) hours59);
        org.joda.time.Hours hours62 = hours59.dividedBy(114565);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) 'a', 1970, 10, (int) '4', 1970, 435, (int) (short) 1);
        mutablePeriod8.addDays(435);
        org.joda.time.Period period11 = mutablePeriod8.toPeriod();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone13);
        java.util.Locale locale15 = null;
        java.util.Calendar calendar16 = dateTime14.toCalendar(locale15);
        org.joda.time.Instant instant17 = dateTime14.toInstant();
        boolean boolean18 = instant17.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone20);
        int int22 = dateTime21.getDayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime21.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfYear();
        org.joda.time.DateTime dateTime26 = property25.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime28 = property25.addWrapFieldToCopy(1);
        org.joda.time.Days days29 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) instant17, (org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Chronology chronology30 = instant17.getChronology();
        org.joda.time.Instant instant33 = instant17.withDurationAdded(2922770L, (int) (byte) 0);
        org.joda.time.Duration duration34 = period11.toDurationTo((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Period period36 = period11.withMonths(378194953);
        org.joda.time.Period period38 = period36.withMonths((-1156812403));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant17", (dateTime14.compareTo(instant17) == 0) == dateTime14.equals(instant17));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Interval interval4 = interval3.toInterval();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.DateTime.Property property7 = dateTime5.minuteOfDay();
        boolean boolean8 = interval3.isAfter((org.joda.time.ReadableInstant) dateTime5);
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
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) '4', chronology42);
        org.joda.time.Instant instant45 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 1, periodType48, chronology53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) '4', chronology53);
        org.joda.time.ReadablePartial readablePartial56 = null;
        org.joda.time.DateTime dateTime57 = dateTime55.withFields(readablePartial56);
        boolean boolean58 = instant45.isAfter((org.joda.time.ReadableInstant) dateTime55);
        boolean boolean59 = dateTime44.isAfter((org.joda.time.ReadableInstant) dateTime55);
        java.lang.String str60 = dateTime44.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType62 = dateTimeFieldType61.getRangeDurationType();
        int int63 = dateTime44.get(dateTimeFieldType61);
        boolean boolean64 = dateTime44.isBeforeNow();
        org.joda.time.DateTime dateTime65 = dateTime44.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight66 = dateTime65.toDateMidnight();
        boolean boolean67 = dateTime20.isAfter((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.DateTime dateTime69 = dateTime20.minusWeeks(3600010);
        org.joda.time.DateTime.Property property70 = dateTime69.millisOfDay();
        org.joda.time.DurationField durationField71 = property70.getRangeDurationField();
        org.joda.time.DateTime dateTime73 = property70.addToCopy((-3599L));
        org.joda.time.Interval interval74 = property70.toInterval();
        boolean boolean75 = interval74.containsNow();
        boolean boolean76 = interval3.overlaps((org.joda.time.ReadableInterval) interval74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant6", (dateTime5.compareTo(instant6) == 0) == dateTime5.equals(instant6));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
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
        java.lang.String str23 = mutablePeriod8.toString();
        int[] intArray24 = mutablePeriod8.getValues();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant21", (dateTime20.compareTo(instant21) == 0) == dateTime20.equals(instant21));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes2, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTime dateTime9 = instant7.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = instant7.toDateTimeISO();
        org.joda.time.Chronology chronology11 = instant7.getChronology();
        org.joda.time.Instant instant13 = instant7.minus(35000L);
        org.joda.time.Instant instant16 = instant7.withDurationAdded(14989536000000L, 0);
        org.joda.time.Instant instant17 = instant7.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant17", (dateTime9.compareTo(instant17) == 0) == dateTime9.equals(instant17));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(1645600652165L, (long) 36, periodType5);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 1, periodType9, chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology14.getZone();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.minuteOfHour();
        org.joda.time.DurationField durationField19 = chronology14.millis();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period30 = org.joda.time.Period.days((-1));
        org.joda.time.Period period32 = period30.withWeeks((int) 'a');
        java.lang.String str33 = period30.toString();
        mutablePeriod28.setPeriod((org.joda.time.ReadablePeriod) period30);
        mutablePeriod28.addMonths((int) (short) -1);
        org.joda.time.Period period38 = org.joda.time.Period.days((-1));
        org.joda.time.Period period40 = period38.withWeeks((int) 'a');
        org.joda.time.Period period42 = period38.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType43 = null;
        boolean boolean44 = period42.isSupported(durationFieldType43);
        mutablePeriod28.add((org.joda.time.ReadablePeriod) period42);
        org.joda.time.Period period47 = period42.withMonths(1);
        org.joda.time.Period period49 = period47.withSeconds(0);
        org.joda.time.Minutes minutes51 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType52 = null;
        int int53 = minutes51.get(durationFieldType52);
        int int55 = minutes51.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod56 = minutes51.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType58 = minutes51.getFieldType(0);
        org.joda.time.Period period60 = period49.withFieldAdded(durationFieldType58, 4);
        int[] intArray62 = chronology14.get((org.joda.time.ReadablePeriod) period49, (long) (short) 1);
        mutablePeriod6.setPeriod((long) 2022, chronology14);
        org.joda.time.Period period64 = new org.joda.time.Period((-3599200009L), 39L, chronology14);
        org.joda.time.Period period65 = new org.joda.time.Period(163296244000L, chronology14);
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.Chronology chronology70 = interval69.getChronology();
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime(chronology70);
        org.joda.time.Chronology chronology72 = chronology70.withUTC();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.weekyearOfCentury();
        org.joda.time.DateTime dateTime74 = org.joda.time.DateTime.now(chronology72);
        org.joda.time.DateTime.Property property75 = dateTime74.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay76 = dateTime74.toYearMonthDay();
        long long78 = chronology14.set((org.joda.time.ReadablePartial) yearMonthDay76, 75560216L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime71 and dateTime74", (dateTime71.compareTo(dateTime74) == 0) == dateTime71.equals(dateTime74));
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
        org.joda.time.DateTime.Property property14 = dateTime10.dayOfWeek();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((java.lang.Object) dateTime15);
        java.lang.String str19 = instant18.toString();
        org.joda.time.DateTime dateTime20 = instant18.toDateTimeISO();
        org.joda.time.Instant instant21 = instant18.toInstant();
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
        org.joda.time.Chronology chronology47 = dateTime31.getChronology();
        boolean boolean48 = dateTime31.isBeforeNow();
        org.joda.time.Seconds seconds49 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) instant18, (org.joda.time.ReadableInstant) dateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant18", (dateTime15.compareTo(instant18) == 0) == dateTime15.equals(instant18));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
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
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone32);
        int int34 = dateTime33.getDayOfMonth();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, periodType36, chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology41.getZone();
        org.joda.time.DateTime dateTime45 = dateTime33.withZoneRetainFields(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = dateTime26.withZone(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = dateTime46.toDateTime(dateTimeZone47);
        org.joda.time.Days days49 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime51 = dateTime48.withWeekOfWeekyear((int) '#');
        org.joda.time.DateTime.Property property52 = dateTime51.centuryOfEra();
        org.joda.time.DateTime.Property property53 = dateTime51.yearOfCentury();
        java.lang.Object obj54 = null;
        boolean boolean55 = property53.equals(obj54);
        java.lang.String str56 = property53.toString();
        org.joda.time.Instant instant57 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime58 = instant57.toDateTime();
        org.joda.time.DateTime.Property property59 = dateTime58.year();
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        org.joda.time.Chronology chronology67 = interval66.getChronology();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) 1, periodType62, chronology67);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) '4', chronology67);
        org.joda.time.ReadablePartial readablePartial70 = null;
        org.joda.time.DateTime dateTime71 = dateTime69.withFields(readablePartial70);
        org.joda.time.DateTime.Property property72 = dateTime71.millisOfDay();
        org.joda.time.DateTime dateTime73 = dateTime71.withEarlierOffsetAtOverlap();
        int int74 = dateTime71.getDayOfWeek();
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval80 = mutableInterval79.toInterval();
        org.joda.time.Chronology chronology81 = interval80.getChronology();
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((long) 1, periodType76, chronology81);
        org.joda.time.DateTimeField dateTimeField83 = chronology81.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone84 = chronology81.getZone();
        org.joda.time.DateTime dateTime85 = dateTime71.withChronology(chronology81);
        org.joda.time.DateTimeField dateTimeField86 = chronology81.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = dateTimeField86.getType();
        int int88 = dateTime58.get(dateTimeFieldType87);
        int int89 = property53.getDifference((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DurationField durationField90 = property53.getLeapDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime58", (instant0.compareTo(dateTime58) == 0) == instant0.equals(dateTime58));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
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
        org.joda.time.Days days20 = duration17.toStandardDays();
        long long21 = duration17.getStandardHours();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime27.withMillisOfDay((int) ' ');
        org.joda.time.DateTime dateTime31 = dateTime29.withWeekOfWeekyear(8);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.years();
        int int33 = periodType32.size();
        org.joda.time.Period period34 = duration17.toPeriodTo((org.joda.time.ReadableInstant) dateTime29, periodType32);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone36);
        org.joda.time.DateTime dateTime38 = dateTime37.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property39 = dateTime38.minuteOfDay();
        org.joda.time.Duration duration41 = new org.joda.time.Duration((long) 435);
        long long42 = duration41.getStandardDays();
        org.joda.time.Duration duration45 = duration41.withDurationAdded(29034000000L, 83400);
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableDuration) duration45);
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
        org.joda.time.Period period62 = org.joda.time.Period.days((-1));
        org.joda.time.Period period64 = period62.withWeeks((int) 'a');
        org.joda.time.Period period66 = period62.plusMonths((int) (short) -1);
        org.joda.time.Period period68 = period62.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime69 = dateTime57.plus((org.joda.time.ReadablePeriod) period62);
        org.joda.time.PeriodType periodType70 = period62.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableDuration) duration45, periodType70);
        org.joda.time.Period period73 = org.joda.time.Period.hours(600);
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval77 = mutableInterval76.toInterval();
        org.joda.time.Chronology chronology78 = interval77.getChronology();
        org.joda.time.MutableInterval mutableInterval79 = interval77.toMutableInterval();
        org.joda.time.Interval interval81 = interval77.withEndMillis(53L);
        org.joda.time.Chronology chronology82 = interval77.getChronology();
        org.joda.time.DateTimeField dateTimeField83 = chronology82.centuryOfEra();
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime(chronology82);
        org.joda.time.DurationField durationField85 = chronology82.hours();
        org.joda.time.DurationFieldType durationFieldType86 = durationField85.getType();
        java.lang.String str87 = durationFieldType86.toString();
        int int88 = period73.get(durationFieldType86);
        boolean boolean89 = periodType70.isSupported(durationFieldType86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and instant47", (dateTime27.compareTo(instant47) == 0) == dateTime27.equals(instant47));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((-604800000L));
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.Duration duration3 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval30 = duration3.toIntervalTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period33 = duration3.toPeriodFrom((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadablePeriod) period33);
        org.joda.time.Period period35 = duration1.toPeriodTo((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTimeField dateTimeField44 = chronology42.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology42.getZone();
        org.joda.time.DateTimeField dateTimeField46 = chronology42.weekOfWeekyear();
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(chronology42);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone49);
        int int51 = dateTime50.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone52 = dateTime50.getZone();
        org.joda.time.Chronology chronology53 = chronology42.withZone(dateTimeZone52);
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime2.toMutableDateTime(chronology42);
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
        org.joda.time.DateTime.Property property69 = dateTime65.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone71);
        int int73 = dateTime72.getDayOfMonth();
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.MutableInterval mutableInterval78 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval79 = mutableInterval78.toInterval();
        org.joda.time.Chronology chronology80 = interval79.getChronology();
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) 1, periodType75, chronology80);
        org.joda.time.DateTimeField dateTimeField82 = chronology80.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone83 = chronology80.getZone();
        org.joda.time.DateTime dateTime84 = dateTime72.withZoneRetainFields(dateTimeZone83);
        org.joda.time.DateTime dateTime85 = dateTime65.withZone(dateTimeZone83);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = null;
        java.lang.String str87 = dateTime65.toString(dateTimeFormatter86);
        org.joda.time.DateTime.Property property88 = dateTime65.centuryOfEra();
        org.joda.time.DateTime dateTime90 = property88.addToCopy(1642891L);
        boolean boolean91 = dateTime2.isBefore((org.joda.time.ReadableInstant) dateTime90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and instant55", (dateTime47.compareTo(instant55) == 0) == dateTime47.equals(instant55));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
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
        org.joda.time.Instant instant43 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration14, 49);
        org.joda.time.Duration duration44 = duration14.toDuration();
        org.joda.time.Duration duration45 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration46 = duration45.toDuration();
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.DateTimeZone dateTimeZone52 = chronology51.getZone();
        org.joda.time.Period period53 = duration45.toPeriod(chronology51);
        boolean boolean54 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration45);
        org.joda.time.Minutes minutes55 = duration14.toStandardMinutes();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime();
        org.joda.time.Instant instant57 = dateTime56.toInstant();
        org.joda.time.TimeOfDay timeOfDay58 = dateTime56.toTimeOfDay();
        org.joda.time.DateTime dateTime60 = dateTime56.withYear((int) (byte) 10);
        boolean boolean61 = dateTime56.isEqualNow();
        org.joda.time.Interval interval62 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration64 = duration14.minus(21599948L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime56", (instant0.compareTo(dateTime56) == 0) == instant0.equals(dateTime56));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withMillisOfDay((int) ' ');
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime5, readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime5.plusMonths(50052);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone13);
        int int15 = dateTime14.getDayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime14.withMillisOfDay((int) 'a');
        org.joda.time.LocalDateTime localDateTime18 = dateTime14.toLocalDateTime();
        boolean boolean19 = dateTime5.equals((java.lang.Object) localDateTime18);
        org.joda.time.Instant instant20 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology21 = instant20.getChronology();
        boolean boolean22 = dateTime5.isEqual((org.joda.time.ReadableInstant) instant20);
        org.joda.time.DateTime dateTime24 = dateTime5.minusWeeks(8);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = dateTime25.minusWeeks((int) (short) 0);
        org.joda.time.DateTime dateTime29 = dateTime25.minusWeeks(365);
        org.joda.time.DateTime dateTime31 = dateTime25.plusHours(496);
        org.joda.time.Days days32 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant20", (dateTime5.compareTo(instant20) == 0) == dateTime5.equals(instant20));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
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
        org.joda.time.Instant instant20 = instant17.minus((-10799900L));
        org.joda.time.MutableDateTime mutableDateTime21 = instant20.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant17", (dateTime16.compareTo(instant17) == 0) == dateTime16.equals(instant17));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.DateTime dateTime11 = dateTime9.withCenturyOfEra(12);
        org.joda.time.DateTime.Property property12 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime13 = property12.roundHalfFloorCopy();
        org.joda.time.Instant instant15 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant17 = instant15.plus((long) 496);
        org.joda.time.MutableDateTime mutableDateTime18 = instant15.toMutableDateTime();
        org.joda.time.Duration duration19 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval46 = duration19.toIntervalTo((org.joda.time.ReadableInstant) dateTime31);
        java.util.GregorianCalendar gregorianCalendar47 = dateTime31.toGregorianCalendar();
        org.joda.time.LocalDate localDate48 = dateTime31.toLocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.monthOfYear();
        int int50 = localDate48.get(dateTimeFieldType49);
        boolean boolean51 = instant15.isSupported(dateTimeFieldType49);
        int int52 = dateTime13.get(dateTimeFieldType49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime18", (instant15.compareTo(mutableDateTime18) == 0) == instant15.equals(mutableDateTime18));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.TimeOfDay timeOfDay2 = dateTime0.toTimeOfDay();
        int int3 = dateTime0.getMonthOfYear();
        java.lang.String str4 = dateTime0.toString();
        org.joda.time.DateTime dateTime5 = dateTime0.toDateTimeISO();
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis(10459);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant1", (dateTime5.compareTo(instant1) == 0) == dateTime5.equals(instant1));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone2);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime3.withWeekOfWeekyear(1);
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(readablePeriod0, (org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Instant instant8 = dateTime6.toInstant();
        int int9 = dateTime6.getEra();
        org.joda.time.DateTime dateTime11 = dateTime6.plusMonths(83400);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant8", (dateTime6.compareTo(instant8) == 0) == dateTime6.equals(instant8));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) 377);
        org.joda.time.Period period5 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType6 = period5.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType6);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology12.getZone();
        org.joda.time.Period period14 = new org.joda.time.Period(10L, periodType6, chronology12);
        org.joda.time.Period period15 = duration1.toPeriod(chronology12);
        org.joda.time.Duration duration17 = duration1.withMillis((-6279833754000000L));
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = duration1.toPeriodTo(readableInstant18);
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.Instant instant22 = instant20.minus(100L);
        org.joda.time.DateTime dateTime23 = instant22.toDateTimeISO();
        org.joda.time.Hours hours24 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours25 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours26 = hours24.minus(hours25);
        org.joda.time.Hours hours27 = org.joda.time.Hours.ONE;
        boolean boolean28 = hours24.isLessThan(hours27);
        org.joda.time.DateTime dateTime29 = dateTime23.minus((org.joda.time.ReadablePeriod) hours27);
        org.joda.time.DateTime dateTime31 = dateTime23.plusWeeks((int) (short) -1);
        org.joda.time.DateTime dateTime33 = dateTime23.plusSeconds(28);
        org.joda.time.Interval interval34 = duration1.toIntervalFrom((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant22 and dateTime23", (instant22.compareTo(dateTime23) == 0) == instant22.equals(dateTime23));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
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
        org.joda.time.Seconds seconds51 = org.joda.time.Seconds.MIN_VALUE;
        java.lang.String str52 = seconds51.toString();
        org.joda.time.Duration duration53 = seconds51.toStandardDuration();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant49, (org.joda.time.ReadableDuration) duration53);
        java.lang.Object obj55 = mutablePeriod54.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime48 and instant49", (dateTime48.compareTo(instant49) == 0) == dateTime48.equals(instant49));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes(3600L);
        org.joda.time.Duration duration2 = duration1.toDuration();
        org.joda.time.Duration duration3 = duration1.toDuration();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.Instant instant8 = instant5.plus((-61180786800000L));
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval(readablePeriod4, (org.joda.time.ReadableInstant) instant8);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardDays(100L);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        org.joda.time.Duration duration13 = seconds12.toStandardDuration();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.Period period15 = duration13.toPeriodTo((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology22.getZone();
        org.joda.time.DateTimeField dateTimeField26 = chronology22.weekOfWeekyear();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(chronology22);
        org.joda.time.DateTime dateTime29 = dateTime27.withMillisOfDay(86399);
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTime dateTime37 = dateTime35.withWeekyear((int) (short) 1);
        org.joda.time.Duration duration38 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 1, periodType41, chronology46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) '4', chronology46);
        org.joda.time.ReadablePartial readablePartial49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.withFields(readablePartial49);
        org.joda.time.DateTime.Property property51 = dateTime50.millisOfDay();
        org.joda.time.DateTime dateTime52 = dateTime50.withEarlierOffsetAtOverlap();
        int int53 = dateTime50.getDayOfWeek();
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.Chronology chronology60 = interval59.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 1, periodType55, chronology60);
        org.joda.time.DateTimeField dateTimeField62 = chronology60.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone63 = chronology60.getZone();
        org.joda.time.DateTime dateTime64 = dateTime50.withChronology(chronology60);
        org.joda.time.Interval interval65 = duration38.toIntervalTo((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period68 = duration38.toPeriodFrom((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.Period period69 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType70 = period69.getPeriodType();
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableDuration) duration38, periodType70);
        org.joda.time.Period period72 = duration13.toPeriodTo((org.joda.time.ReadableInstant) dateTime27, periodType70);
        org.joda.time.PeriodType periodType73 = periodType70.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration3, (org.joda.time.ReadableInstant) instant8, periodType70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime14", (instant5.compareTo(dateTime14) == 0) == instant5.equals(dateTime14));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime5 = dateTime2.plusMillis((int) '#');
        int int6 = dateTime2.getYearOfEra();
        org.joda.time.DateTime.Property property7 = dateTime2.hourOfDay();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumTextLength(locale8);
        org.joda.time.Interval interval10 = property7.toInterval();
        org.joda.time.Instant instant12 = org.joda.time.Instant.parse("480");
        org.joda.time.Instant instant14 = instant12.withMillis((long) 1969);
        java.lang.Object obj15 = null;
        org.joda.time.Instant instant16 = new org.joda.time.Instant(obj15);
        boolean boolean17 = instant12.isEqual((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Interval interval18 = interval10.withStart((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Duration duration20 = org.joda.time.Duration.millis((long) 5);
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
        int int35 = dateTime32.getDayOfWeek();
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 1, periodType37, chronology42);
        org.joda.time.DateTimeField dateTimeField44 = chronology42.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology42.getZone();
        org.joda.time.DateTime dateTime46 = dateTime32.withChronology(chronology42);
        org.joda.time.DateTime dateTime48 = dateTime46.plusHours(6);
        int int49 = dateTime48.getYearOfEra();
        org.joda.time.Period period50 = duration20.toPeriodTo((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(chronology55);
        org.joda.time.DateTime dateTime58 = dateTime56.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime60 = dateTime58.plus((long) (short) -1);
        org.joda.time.DateTime dateTime63 = dateTime60.withDurationAdded((long) 100, (int) (short) 100);
        org.joda.time.Chronology chronology64 = dateTime63.getChronology();
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(chronology69);
        int int71 = dateTime70.getSecondOfMinute();
        org.joda.time.DateTime dateTime73 = dateTime70.withWeekyear(3);
        boolean boolean74 = dateTime63.isBefore((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval78 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval79 = mutableInterval78.toInterval();
        org.joda.time.Chronology chronology80 = interval79.getChronology();
        org.joda.time.DateTimeZone dateTimeZone81 = chronology80.getZone();
        java.lang.String str83 = dateTimeZone81.getName(100L);
        org.joda.time.DateTime dateTime84 = dateTime75.withZoneRetainFields(dateTimeZone81);
        int int85 = dateTime84.getMinuteOfDay();
        int int86 = dateTime84.getEra();
        org.joda.time.DateTimeZone dateTimeZone88 = null;
        org.joda.time.DateTime dateTime89 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone88);
        org.joda.time.DateTime dateTime90 = dateTime89.withLaterOffsetAtOverlap();
        org.joda.time.Hours hours91 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime84, (org.joda.time.ReadableInstant) dateTime89);
        boolean boolean92 = dateTime73.isEqual((org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, (org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime94 = dateTime73.withEarlierOffsetAtOverlap();
        boolean boolean95 = interval10.isAfter((org.joda.time.ReadableInstant) dateTime94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime56", (instant16.compareTo(dateTime56) == 0) == instant16.equals(dateTime56));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withMinuteOfHour(10);
        int int6 = dateTime5.getEra();
        int int7 = dateTime5.getCenturyOfEra();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(periodType8);
        org.joda.time.Period period11 = org.joda.time.Period.minutes(52);
        org.joda.time.Hours hours12 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period23 = org.joda.time.Period.days((-1));
        org.joda.time.Period period25 = period23.withWeeks((int) 'a');
        java.lang.String str26 = period23.toString();
        mutablePeriod21.setPeriod((org.joda.time.ReadablePeriod) period23);
        int int28 = mutablePeriod21.getMillis();
        org.joda.time.DurationFieldType durationFieldType30 = mutablePeriod21.getFieldType(0);
        int int31 = hours12.get(durationFieldType30);
        java.lang.String str32 = durationFieldType30.toString();
        int int33 = period11.indexOf(durationFieldType30);
        mutablePeriod9.add(durationFieldType30, 1969);
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean46 = mutableInterval41.isBefore((org.joda.time.ReadableInterval) mutableInterval45);
        boolean boolean47 = mutableInterval38.contains((org.joda.time.ReadableInterval) mutableInterval45);
        org.joda.time.MutableInterval mutableInterval48 = mutableInterval38.copy();
        org.joda.time.Instant instant49 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval56 = mutableInterval55.toInterval();
        org.joda.time.Chronology chronology57 = interval56.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 1, periodType52, chronology57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) '4', chronology57);
        org.joda.time.ReadablePartial readablePartial60 = null;
        org.joda.time.DateTime dateTime61 = dateTime59.withFields(readablePartial60);
        boolean boolean62 = instant49.isAfter((org.joda.time.ReadableInstant) dateTime59);
        boolean boolean63 = mutableInterval48.contains((org.joda.time.ReadableInstant) dateTime59);
        mutablePeriod9.add((org.joda.time.ReadableInterval) mutableInterval48);
        mutablePeriod9.setMinutes((-2147483648));
        org.joda.time.DateTime dateTime67 = dateTime5.plus((org.joda.time.ReadablePeriod) mutablePeriod9);
        org.joda.time.DateTime dateTime68 = dateTime67.withEarlierOffsetAtOverlap();
        int int69 = dateTime67.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval73 = mutableInterval72.toInterval();
        org.joda.time.Chronology chronology74 = interval73.getChronology();
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(chronology74);
        org.joda.time.DateTime dateTime77 = dateTime75.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime79 = dateTime77.plus((long) (short) -1);
        org.joda.time.Chronology chronology80 = dateTime77.getChronology();
        org.joda.time.DurationField durationField81 = chronology80.weekyears();
        org.joda.time.MutableDateTime mutableDateTime82 = dateTime67.toMutableDateTime(chronology80);
        org.joda.time.DateTime dateTime84 = dateTime67.minusDays(27425236);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant49 and dateTime75", (instant49.compareTo(dateTime75) == 0) == instant49.equals(dateTime75));
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.DateTime.Property property12 = dateTime11.era();
        org.joda.time.DateTime dateTime14 = dateTime11.minusYears((int) '#');
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType18 = null;
        int int19 = minutes17.get(durationFieldType18);
        int int21 = minutes17.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod22 = minutes17.toMutablePeriod();
        boolean boolean23 = minutes15.isLessThan(minutes17);
        org.joda.time.PeriodType periodType24 = minutes15.getPeriodType();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant0, (org.joda.time.ReadableInstant) dateTime14, periodType24);
        org.joda.time.MutableDateTime mutableDateTime26 = instant0.toMutableDateTimeISO();
        boolean boolean28 = instant0.isEqual(31622402022L);
        org.joda.time.Instant instant30 = instant0.withMillis((-6380816000400000L));
        org.joda.time.Chronology chronology31 = instant0.getChronology();
        org.joda.time.Instant instant32 = instant0.toInstant();
        org.joda.time.Instant instant34 = instant32.plus(349192798L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant32 and mutableDateTime26", (instant32.compareTo(mutableDateTime26) == 0) == instant32.equals(mutableDateTime26));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = chronology6.getZone();
        java.lang.String str9 = dateTimeZone7.getName(100L);
        org.joda.time.DateTime dateTime10 = dateTime1.withZoneRetainFields(dateTimeZone7);
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology15.getZone();
        java.lang.String str18 = dateTimeZone16.getName(100L);
        org.joda.time.DateTime dateTime19 = dateTime10.withZoneRetainFields(dateTimeZone16);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        mutablePeriod28.add((long) 3);
        org.joda.time.DateTime dateTime31 = dateTime10.minus((org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardHours((long) 349200000);
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime39.withWeekyear((int) (short) 1);
        org.joda.time.Duration duration42 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 1, periodType45, chronology50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) '4', chronology50);
        org.joda.time.ReadablePartial readablePartial53 = null;
        org.joda.time.DateTime dateTime54 = dateTime52.withFields(readablePartial53);
        org.joda.time.DateTime.Property property55 = dateTime54.millisOfDay();
        org.joda.time.DateTime dateTime56 = dateTime54.withEarlierOffsetAtOverlap();
        int int57 = dateTime54.getDayOfWeek();
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) 1, periodType59, chronology64);
        org.joda.time.DateTimeField dateTimeField66 = chronology64.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone67 = chronology64.getZone();
        org.joda.time.DateTime dateTime68 = dateTime54.withChronology(chronology64);
        org.joda.time.Interval interval69 = duration42.toIntervalTo((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period72 = duration42.toPeriodFrom((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.Period period73 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType74 = period73.getPeriodType();
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableDuration) duration42, periodType74);
        int int76 = periodType74.size();
        org.joda.time.Period period77 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration33, periodType74);
        org.joda.time.Instant instant79 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration33, 800);
        org.joda.time.Instant instant81 = instant0.minus((long) 1);
        org.joda.time.Instant instant84 = instant0.withDurationAdded(219921004800000L, (-90));
        org.joda.time.Instant instant86 = instant84.minus(0L);
        long long87 = instant86.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.TimeOfDay timeOfDay2 = dateTime0.toTimeOfDay();
        org.joda.time.DateTime.Property property3 = dateTime0.monthOfYear();
        boolean boolean4 = dateTime0.isBeforeNow();
        org.joda.time.DateTime dateTime6 = dateTime0.minusMonths(50052);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
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
        org.joda.time.DateTime.Property property18 = dateTime16.millisOfDay();
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardHours((long) 24);
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = new org.joda.time.Duration(readableInstant23, readableInstant24);
        boolean boolean26 = duration22.isEqual((org.joda.time.ReadableDuration) duration25);
        boolean boolean27 = duration20.isShorterThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.DateTime dateTime28 = dateTime16.minus((org.joda.time.ReadableDuration) duration22);
        org.joda.time.Instant instant30 = new org.joda.time.Instant(0L);
        org.joda.time.Instant instant32 = instant30.plus((long) 496);
        org.joda.time.MutableDateTime mutableDateTime33 = instant30.toMutableDateTime();
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
        java.util.GregorianCalendar gregorianCalendar62 = dateTime46.toGregorianCalendar();
        org.joda.time.LocalDate localDate63 = dateTime46.toLocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.monthOfYear();
        int int65 = localDate63.get(dateTimeFieldType64);
        boolean boolean66 = instant30.isSupported(dateTimeFieldType64);
        int int67 = dateTime16.get(dateTimeFieldType64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant30 and mutableDateTime33", (instant30.compareTo(mutableDateTime33) == 0) == instant30.equals(mutableDateTime33));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval9.setInterval((-80867997L), 271254L);
        org.joda.time.Period period16 = mutableInterval9.toPeriod();
        org.joda.time.Interval interval17 = mutableInterval9.toInterval();
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant21 = instant18.withDurationAdded(readableDuration19, 10);
        org.joda.time.Instant instant22 = instant21.toInstant();
        org.joda.time.DateTime dateTime23 = instant21.toDateTime();
        boolean boolean24 = interval17.contains((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean35 = mutableInterval30.isBefore((org.joda.time.ReadableInterval) mutableInterval34);
        boolean boolean36 = mutableInterval27.contains((org.joda.time.ReadableInterval) mutableInterval34);
        org.joda.time.Weeks weeks37 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval34);
        org.joda.time.Chronology chronology38 = mutableInterval34.getChronology();
        org.joda.time.Duration duration39 = mutableInterval34.toDuration();
        org.joda.time.Duration duration40 = duration39.toDuration();
        org.joda.time.Interval interval41 = interval17.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Interval interval43 = interval41.withStartMillis((long) 56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and dateTime23", (instant18.compareTo(dateTime23) == 0) == instant18.equals(dateTime23));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Instant instant3 = instant1.minus(0L);
        org.joda.time.Instant instant5 = instant1.plus(2737107131207281L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.DateTime.Property property6 = dateTime2.secondOfDay();
        org.joda.time.DateTime dateTime7 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone9);
        org.joda.time.DateTime dateTime11 = dateTime10.withLaterOffsetAtOverlap();
        org.joda.time.Duration duration12 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration13 = duration12.toDuration();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.Chronology chronology15 = dateTime10.getChronology();
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
        org.joda.time.Hours hours30 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours31 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours32 = hours30.minus(hours31);
        org.joda.time.Duration duration33 = hours31.toStandardDuration();
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
        org.joda.time.Interval interval53 = duration33.toIntervalFrom((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTime dateTime54 = dateTime50.toDateTime();
        boolean boolean55 = instant16.isEqual((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime dateTime57 = dateTime54.withDayOfMonth(10);
        org.joda.time.LocalTime localTime58 = dateTime54.toLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        org.joda.time.Chronology chronology66 = interval65.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 1, periodType61, chronology66);
        org.joda.time.DateTimeField dateTimeField68 = chronology66.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone69 = chronology66.getZone();
        org.joda.time.DateTimeField dateTimeField70 = chronology66.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField71 = dateTimeFieldType59.getField(chronology66);
        org.joda.time.DateTime.Property property72 = dateTime54.property(dateTimeFieldType59);
        boolean boolean73 = dateTime10.isSupported(dateTimeFieldType59);
        org.joda.time.DateTime.Property property74 = dateTime2.property(dateTimeFieldType59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime2", (instant5.compareTo(dateTime2) == 0) == instant5.equals(dateTime2));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.DateTime.Property property12 = dateTime11.era();
        org.joda.time.DateTime dateTime14 = dateTime11.minusYears((int) '#');
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType18 = null;
        int int19 = minutes17.get(durationFieldType18);
        int int21 = minutes17.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod22 = minutes17.toMutablePeriod();
        boolean boolean23 = minutes15.isLessThan(minutes17);
        org.joda.time.PeriodType periodType24 = minutes15.getPeriodType();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant0, (org.joda.time.ReadableInstant) dateTime14, periodType24);
        org.joda.time.MutableDateTime mutableDateTime26 = instant0.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone28);
        org.joda.time.DateTime dateTime30 = dateTime29.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property31 = dateTime30.minuteOfDay();
        java.util.Locale locale32 = null;
        int int33 = property31.getMaximumTextLength(locale32);
        org.joda.time.DateTime dateTime34 = property31.withMaximumValue();
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology39);
        org.joda.time.DateTime dateTime42 = dateTime40.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime44 = dateTime42.plus((long) (short) -1);
        org.joda.time.Duration duration45 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Duration duration47 = duration45.minus((-352799947L));
        org.joda.time.Instant instant48 = instant0.minus((org.joda.time.ReadableDuration) duration47);
        org.joda.time.DateTime dateTime49 = instant0.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime50 = instant0.toMutableDateTime();
        int int51 = mutableDateTime50.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime26", (instant0.compareTo(mutableDateTime26) == 0) == instant0.equals(mutableDateTime26));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        long long5 = interval3.toDurationMillis();
        org.joda.time.Interval interval7 = interval3.withEndMillis((long) (short) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 10);
        org.joda.time.Interval interval12 = interval7.withEnd((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.minutes(0);
        org.joda.time.Duration duration15 = minutes14.toStandardDuration();
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType19 = null;
        int int20 = minutes18.get(durationFieldType19);
        org.joda.time.DurationFieldType durationFieldType21 = minutes18.getFieldType();
        boolean boolean22 = minutes16.isGreaterThan(minutes18);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes18, (org.joda.time.ReadableInstant) instant23);
        org.joda.time.DateTime dateTime25 = instant23.toDateTimeISO();
        org.joda.time.DateTime dateTime26 = instant23.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime27 = instant23.toMutableDateTimeISO();
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration15, (org.joda.time.ReadableInstant) instant23);
        org.joda.time.Instant instant29 = instant8.plus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Seconds seconds30 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.Duration duration31 = seconds30.toStandardDuration();
        org.joda.time.Duration duration32 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 1, periodType35, chronology40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) '4', chronology40);
        org.joda.time.ReadablePartial readablePartial43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.withFields(readablePartial43);
        org.joda.time.DateTime.Property property45 = dateTime44.millisOfDay();
        org.joda.time.DateTime dateTime46 = dateTime44.withEarlierOffsetAtOverlap();
        int int47 = dateTime44.getDayOfWeek();
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 1, periodType49, chronology54);
        org.joda.time.DateTimeField dateTimeField56 = chronology54.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone57 = chronology54.getZone();
        org.joda.time.DateTime dateTime58 = dateTime44.withChronology(chronology54);
        org.joda.time.Interval interval59 = duration32.toIntervalTo((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period62 = duration32.toPeriodFrom((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Duration duration64 = duration32.withMillis(100L);
        int int65 = duration31.compareTo((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Duration duration66 = duration31.toDuration();
        int int67 = duration15.compareTo((org.joda.time.ReadableDuration) duration66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime25", (instant8.compareTo(dateTime25) == 0) == instant8.equals(dateTime25));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.joda.time.Duration duration2 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration3 = duration2.toDuration();
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
        org.joda.time.DateTime dateTime24 = dateTime20.minusWeeks(55);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 1, periodType28, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) '4', chronology33);
        org.joda.time.ReadablePartial readablePartial36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.withFields(readablePartial36);
        boolean boolean38 = instant25.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime.Property property39 = dateTime35.dayOfWeek();
        org.joda.time.DateTime dateTime40 = property39.withMaximumValue();
        boolean boolean41 = dateTime20.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime43 = dateTime20.plusSeconds(50);
        org.joda.time.Interval interval44 = duration2.toIntervalTo((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Days days45 = duration2.toStandardDays();
        org.joda.time.PeriodType periodType46 = days45.getPeriodType();
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 1, periodType48, chronology53);
        org.joda.time.DateTimeField dateTimeField55 = chronology53.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone56 = chronology53.getZone();
        org.joda.time.DateTimeField dateTimeField57 = chronology53.minuteOfHour();
        org.joda.time.Chronology chronology58 = chronology53.withUTC();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.dayOfYear();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.hourOfDay();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(0L, (long) 36, periodType46, chronology58);
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 1, periodType64, chronology69);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) '4', chronology69);
        org.joda.time.ReadablePartial readablePartial72 = null;
        org.joda.time.DateTime dateTime73 = dateTime71.withFields(readablePartial72);
        org.joda.time.DateTime.Property property74 = dateTime73.millisOfDay();
        org.joda.time.DateTime dateTime76 = dateTime73.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property77 = dateTime73.era();
        org.joda.time.DateTime dateTime79 = dateTime73.plusMonths(52);
        org.joda.time.DateTime dateTime81 = dateTime73.minusMinutes(365);
        java.lang.Object obj82 = null;
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone84);
        int int86 = dateTime85.getDayOfMonth();
        org.joda.time.DateTime dateTime88 = dateTime85.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime90 = dateTime88.withYear(0);
        org.joda.time.Chronology chronology91 = dateTime88.getChronology();
        org.joda.time.DateTime dateTime92 = new org.joda.time.DateTime(obj82, chronology91);
        mutablePeriod61.setPeriod((org.joda.time.ReadableInstant) dateTime73, (org.joda.time.ReadableInstant) dateTime92);
        boolean boolean94 = dateTime73.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant25 and dateTime92", (instant25.compareTo(dateTime92) == 0) == instant25.equals(dateTime92));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, periodType12, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '4', chronology17);
        org.joda.time.ReadablePartial readablePartial20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withFields(readablePartial20);
        org.joda.time.DateTime.Property property22 = dateTime21.millisOfDay();
        org.joda.time.DateTime dateTime23 = dateTime21.withEarlierOffsetAtOverlap();
        int int24 = dateTime21.getDayOfWeek();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, periodType26, chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone34 = chronology31.getZone();
        org.joda.time.DateTime dateTime35 = dateTime21.withChronology(chronology31);
        org.joda.time.DateTime dateTime37 = dateTime35.plusDays((int) (byte) 1);
        boolean boolean38 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime35);
        boolean boolean39 = dateTime9.isEqualNow();
        org.joda.time.Instant instant40 = dateTime9.toInstant();
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.Chronology chronology45 = interval44.getChronology();
        long long46 = interval44.toDurationMillis();
        org.joda.time.Interval interval48 = interval44.withEndMillis((long) (short) 100);
        org.joda.time.Instant instant49 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.Instant instant52 = instant49.withDurationAdded(readableDuration50, 10);
        org.joda.time.Interval interval53 = interval48.withEnd((org.joda.time.ReadableInstant) instant49);
        org.joda.time.DateTime dateTime54 = instant49.toDateTime();
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) instant40, (org.joda.time.ReadableInstant) dateTime54);
        java.lang.String str56 = mutableInterval55.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant40", (dateTime9.compareTo(instant40) == 0) == dateTime9.equals(instant40));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.MIN_VALUE;
        java.lang.String str1 = seconds0.toString();
        org.joda.time.DurationFieldType durationFieldType2 = seconds0.getFieldType();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.standardSecondsIn(readablePeriod3);
        org.joda.time.Seconds seconds6 = seconds4.plus((int) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone8);
        int int10 = dateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime12 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime14 = dateTime9.withMillisOfDay((int) (byte) 1);
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, periodType18, chronology23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', chronology23);
        org.joda.time.ReadablePartial readablePartial26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.withFields(readablePartial26);
        boolean boolean28 = instant15.isAfter((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime.Property property29 = dateTime25.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone31);
        int int33 = dateTime32.getDayOfMonth();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 1, periodType35, chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone43 = chronology40.getZone();
        org.joda.time.DateTime dateTime44 = dateTime32.withZoneRetainFields(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = dateTime25.withZone(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.toDateTime(dateTimeZone46);
        org.joda.time.Seconds seconds48 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DurationFieldType durationFieldType49 = seconds48.getFieldType();
        boolean boolean50 = seconds4.isGreaterThan(seconds48);
        org.joda.time.Seconds seconds51 = seconds0.plus(seconds4);
        org.joda.time.Seconds seconds52 = org.joda.time.Seconds.THREE;
        org.joda.time.Duration duration53 = seconds52.toStandardDuration();
        org.joda.time.Seconds seconds54 = seconds4.plus(seconds52);
        org.joda.time.Seconds seconds56 = seconds54.dividedBy(923);
        java.lang.String str57 = seconds54.toString();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone59);
        int int61 = dateTime60.getMillisOfDay();
        org.joda.time.DateTime dateTime63 = dateTime60.plusMillis((int) '#');
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval70 = mutableInterval69.toInterval();
        org.joda.time.Chronology chronology71 = interval70.getChronology();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) 1, periodType66, chronology71);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) '4', chronology71);
        org.joda.time.DateTime dateTime74 = dateTime63.withChronology(chronology71);
        java.lang.String str75 = chronology71.toString();
        org.joda.time.DurationField durationField76 = chronology71.eras();
        org.joda.time.Period period77 = new org.joda.time.Period((java.lang.Object) str57, chronology71);
        org.joda.time.DurationField durationField78 = chronology71.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField76, durationField78, and durationField76", !(durationField76.compareTo(durationField78) == 0) || (Math.signum(durationField76.compareTo(durationField76)) == Math.signum(durationField78.compareTo(durationField76))));
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes2, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTime dateTime9 = instant7.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = instant7.toDateTimeISO();
        org.joda.time.Chronology chronology11 = instant7.getChronology();
        org.joda.time.Duration duration13 = new org.joda.time.Duration(164096150400000L);
        org.joda.time.Instant instant14 = instant7.minus((org.joda.time.ReadableDuration) duration13);
        org.joda.time.DateTime dateTime15 = instant14.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime9", (instant7.compareTo(dateTime9) == 0) == instant7.equals(dateTime9));
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) '4');
        int int10 = dateTime7.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean22 = mutableInterval17.isBefore((org.joda.time.ReadableInterval) mutableInterval21);
        boolean boolean23 = mutableInterval14.contains((org.joda.time.ReadableInterval) mutableInterval21);
        org.joda.time.Period period26 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType27 = period26.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType27);
        org.joda.time.Period period29 = mutableInterval21.toPeriod(periodType27);
        java.lang.String str30 = periodType27.getName();
        org.joda.time.PeriodType periodType31 = periodType27.withSecondsRemoved();
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
        org.joda.time.Duration duration46 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 1, periodType49, chronology54);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) '4', chronology54);
        org.joda.time.ReadablePartial readablePartial57 = null;
        org.joda.time.DateTime dateTime58 = dateTime56.withFields(readablePartial57);
        org.joda.time.DateTime.Property property59 = dateTime58.millisOfDay();
        org.joda.time.DateTime dateTime60 = dateTime58.withEarlierOffsetAtOverlap();
        int int61 = dateTime58.getDayOfWeek();
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.Chronology chronology68 = interval67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 1, periodType63, chronology68);
        org.joda.time.DateTimeField dateTimeField70 = chronology68.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone71 = chronology68.getZone();
        org.joda.time.DateTime dateTime72 = dateTime58.withChronology(chronology68);
        org.joda.time.Interval interval73 = duration46.toIntervalTo((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Instant instant75 = instant32.withDurationAdded((org.joda.time.ReadableDuration) duration46, 49);
        org.joda.time.Duration duration76 = duration46.toDuration();
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval82 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval83 = mutableInterval82.toInterval();
        org.joda.time.MutableInterval mutableInterval86 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean87 = mutableInterval82.isBefore((org.joda.time.ReadableInterval) mutableInterval86);
        boolean boolean88 = mutableInterval79.contains((org.joda.time.ReadableInterval) mutableInterval86);
        org.joda.time.Weeks weeks89 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval86);
        long long90 = mutableInterval86.getEndMillis();
        org.joda.time.DateTime dateTime91 = mutableInterval86.getEnd();
        org.joda.time.Interval interval92 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) dateTime91);
        org.joda.time.Chronology chronology93 = interval92.getChronology();
        org.joda.time.Period period94 = new org.joda.time.Period(75736684800000L, periodType31, chronology93);
        int int95 = period94.getMinutes();
        boolean boolean96 = dateTime7.equals((java.lang.Object) int95);
        int int97 = dateTime7.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant32", (dateTime5.compareTo(instant32) == 0) == dateTime5.equals(instant32));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays(100L);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, periodType4, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withFields(readablePartial12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfDay();
        org.joda.time.DateTime dateTime16 = dateTime13.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property17 = dateTime13.era();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Interval interval20 = duration1.toIntervalTo(readableInstant19);
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutableInterval mutableInterval26 = interval24.toMutableInterval();
        org.joda.time.Interval interval28 = interval24.withEndMillis(53L);
        org.joda.time.Chronology chronology29 = interval24.getChronology();
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean40 = mutableInterval35.isBefore((org.joda.time.ReadableInterval) mutableInterval39);
        boolean boolean41 = mutableInterval32.contains((org.joda.time.ReadableInterval) mutableInterval39);
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        long long47 = interval45.toDurationMillis();
        org.joda.time.Interval interval49 = interval45.withEndMillis((long) (short) 100);
        mutableInterval39.setInterval((org.joda.time.ReadableInterval) interval45);
        boolean boolean51 = mutableInterval39.containsNow();
        boolean boolean52 = interval24.contains((org.joda.time.ReadableInterval) mutableInterval39);
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(periodType53);
        org.joda.time.Period period55 = mutableInterval39.toPeriod(periodType53);
        org.joda.time.Duration duration56 = mutableInterval39.toDuration();
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        org.joda.time.Chronology chronology61 = interval60.getChronology();
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(chronology61);
        org.joda.time.DateTime dateTime64 = dateTime62.withWeekyear((int) (short) 1);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = dateTime62.toDateTime(chronology65);
        boolean boolean67 = mutableInterval39.isBefore((org.joda.time.ReadableInstant) dateTime66);
        boolean boolean68 = interval20.abuts((org.joda.time.ReadableInterval) mutableInterval39);
        org.joda.time.Instant instant69 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology70 = instant69.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.yearOfEra();
        org.joda.time.DateTimeField dateTimeField72 = chronology70.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField73 = chronology70.millisOfDay();
        org.joda.time.Interval interval74 = interval20.withChronology(chronology70);
        org.joda.time.DurationField durationField75 = chronology70.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime62 and instant69", (dateTime62.compareTo(instant69) == 0) == dateTime62.equals(instant69));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 10);
        org.joda.time.Instant instant4 = instant3.toInstant();
        org.joda.time.DateTime dateTime5 = instant3.toDateTime();
        org.joda.time.Instant instant7 = instant3.plus(1361501832974000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime5", (instant3.compareTo(dateTime5) == 0) == instant3.equals(dateTime5));
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        org.joda.time.Period period4 = org.joda.time.Period.months(43);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology10.getZone();
        java.lang.String str13 = dateTimeZone11.getName(100L);
        org.joda.time.DateTime dateTime14 = dateTime5.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime dateTime17 = dateTime14.withDurationAdded((long) 52, (int) (short) 1);
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period4, (org.joda.time.ReadableInstant) dateTime17);
        int[] intArray21 = chronology1.get((org.joda.time.ReadablePeriod) period4, 0L, 0L);
        org.joda.time.DateTimeField dateTimeField22 = chronology1.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime5", (instant0.compareTo(dateTime5) == 0) == instant0.equals(dateTime5));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        int int5 = minutes3.get(durationFieldType4);
        org.joda.time.DurationFieldType durationFieldType6 = minutes3.getFieldType();
        boolean boolean7 = minutes1.isGreaterThan(minutes3);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes3, (org.joda.time.ReadableInstant) instant8);
        org.joda.time.Minutes minutes11 = minutes3.dividedBy((int) (short) 10);
        boolean boolean12 = minutes0.isGreaterThan(minutes3);
        org.joda.time.Period period14 = org.joda.time.Period.millis((-52));
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType18 = null;
        int int19 = minutes17.get(durationFieldType18);
        java.lang.Object obj20 = null;
        boolean boolean21 = minutes17.equals(obj20);
        org.joda.time.DurationFieldType durationFieldType22 = minutes17.getFieldType();
        org.joda.time.Minutes minutes24 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType25 = null;
        int int26 = minutes24.get(durationFieldType25);
        java.lang.Object obj27 = null;
        boolean boolean28 = minutes24.equals(obj27);
        org.joda.time.DurationFieldType durationFieldType29 = minutes24.getFieldType();
        boolean boolean30 = minutes17.isGreaterThan(minutes24);
        org.joda.time.Minutes minutes31 = minutes17.negated();
        org.joda.time.Minutes minutes33 = minutes31.plus(45);
        org.joda.time.Minutes minutes35 = minutes33.multipliedBy((int) (short) 10);
        org.joda.time.Minutes minutes37 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType38 = null;
        int int39 = minutes37.get(durationFieldType38);
        int int41 = minutes37.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod42 = minutes37.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType44 = minutes37.getFieldType(0);
        org.joda.time.Duration duration45 = minutes37.toStandardDuration();
        org.joda.time.Minutes minutes47 = minutes37.multipliedBy(3);
        org.joda.time.Minutes minutes49 = minutes47.multipliedBy((int) (short) 100);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.Duration duration51 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 1, periodType54, chronology59);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) '4', chronology59);
        org.joda.time.ReadablePartial readablePartial62 = null;
        org.joda.time.DateTime dateTime63 = dateTime61.withFields(readablePartial62);
        org.joda.time.DateTime.Property property64 = dateTime63.millisOfDay();
        org.joda.time.DateTime dateTime65 = dateTime63.withEarlierOffsetAtOverlap();
        int int66 = dateTime63.getDayOfWeek();
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval72 = mutableInterval71.toInterval();
        org.joda.time.Chronology chronology73 = interval72.getChronology();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((long) 1, periodType68, chronology73);
        org.joda.time.DateTimeField dateTimeField75 = chronology73.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone76 = chronology73.getZone();
        org.joda.time.DateTime dateTime77 = dateTime63.withChronology(chronology73);
        org.joda.time.Interval interval78 = duration51.toIntervalTo((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period81 = duration51.toPeriodFrom((org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.MutableInterval mutableInterval82 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadablePeriod) period81);
        java.lang.Object obj83 = mutableInterval82.clone();
        org.joda.time.Minutes minutes84 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) mutableInterval82);
        boolean boolean85 = minutes49.isGreaterThan(minutes84);
        org.joda.time.PeriodType periodType86 = minutes84.getPeriodType();
        org.joda.time.Minutes minutes87 = minutes33.minus(minutes84);
        org.joda.time.Duration duration88 = minutes33.toStandardDuration();
        org.joda.time.Minutes minutes90 = minutes33.minus(642);
        org.joda.time.Minutes minutes91 = minutes15.minus(minutes33);
        boolean boolean92 = minutes0.isGreaterThan(minutes91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime50", (instant8.compareTo(dateTime50) == 0) == instant8.equals(dateTime50));
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
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
        org.joda.time.Instant instant43 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration14, 49);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 1, periodType46, chronology51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) '4', chronology51);
        org.joda.time.DateTime dateTime55 = dateTime53.withCenturyOfEra(12);
        org.joda.time.PeriodType periodType56 = org.joda.time.PeriodType.months();
        org.joda.time.Period period57 = duration14.toPeriodFrom((org.joda.time.ReadableInstant) dateTime53, periodType56);
        org.joda.time.DateMidnight dateMidnight58 = dateTime53.toDateMidnight();
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        org.joda.time.Chronology chronology63 = interval62.getChronology();
        org.joda.time.MutableInterval mutableInterval64 = interval62.toMutableInterval();
        org.joda.time.Interval interval66 = interval62.withEndMillis(53L);
        org.joda.time.Chronology chronology67 = interval62.getChronology();
        org.joda.time.DateTimeField dateTimeField68 = chronology67.centuryOfEra();
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(chronology67);
        org.joda.time.DateTime dateTime70 = dateTime69.toDateTimeISO();
        int int71 = dateTime70.getYear();
        org.joda.time.DateTime dateTime73 = dateTime70.withYear(50);
        org.joda.time.DateTime dateTime75 = dateTime73.plusHours(86399999);
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval82 = mutableInterval81.toInterval();
        org.joda.time.Chronology chronology83 = interval82.getChronology();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) 1, periodType78, chronology83);
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime((long) '4', chronology83);
        org.joda.time.DateTime.Property property86 = dateTime85.era();
        org.joda.time.DateTime dateTime88 = property86.addWrapFieldToCopy(82800010);
        org.joda.time.DateTime dateTime89 = property86.withMinimumValue();
        org.joda.time.DateTime dateTime91 = dateTime89.minus(1482218394430L);
        org.joda.time.Weeks weeks92 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime73, (org.joda.time.ReadableInstant) dateTime91);
        org.joda.time.LocalDate localDate93 = dateTime73.toLocalDate();
        boolean boolean94 = dateMidnight58.isEqual((org.joda.time.ReadableInstant) dateTime73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime69", (instant0.compareTo(dateTime69) == 0) == instant0.equals(dateTime69));
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-3599990L));
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds((long) 32088);
        long long4 = duration3.getMillis();
        long long5 = duration3.getMillis();
        org.joda.time.Duration duration6 = duration1.plus((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 1, periodType10, chronology15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', chronology15);
        org.joda.time.ReadablePartial readablePartial18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withFields(readablePartial18);
        boolean boolean20 = instant7.isAfter((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime.Property property21 = dateTime17.dayOfWeek();
        org.joda.time.DateTime dateTime22 = property21.withMaximumValue();
        org.joda.time.DateTime dateTime24 = dateTime22.withWeekyear((int) (short) 100);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((java.lang.Object) dateTime22);
        int int26 = dateTime22.getDayOfMonth();
        org.joda.time.DateTime dateTime28 = dateTime22.minusYears(1969);
        int int29 = dateTime22.getSecondOfMinute();
        org.joda.time.DateTime dateTime31 = dateTime22.withWeekyear(271323);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardHours((-86399990L));
        long long35 = duration34.getStandardHours();
        org.joda.time.Duration duration36 = duration34.toDuration();
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 1, periodType41, chronology46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) '4', chronology46);
        org.joda.time.Instant instant49 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval56 = mutableInterval55.toInterval();
        org.joda.time.Chronology chronology57 = interval56.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 1, periodType52, chronology57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) '4', chronology57);
        org.joda.time.ReadablePartial readablePartial60 = null;
        org.joda.time.DateTime dateTime61 = dateTime59.withFields(readablePartial60);
        boolean boolean62 = instant49.isAfter((org.joda.time.ReadableInstant) dateTime59);
        boolean boolean63 = dateTime48.isAfter((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.Chronology chronology64 = dateTime48.getChronology();
        org.joda.time.Period period65 = new org.joda.time.Period(0L, (long) 50, chronology64);
        org.joda.time.DateTimeField dateTimeField66 = chronology64.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField67 = chronology64.era();
        mutablePeriod32.setPeriod((org.joda.time.ReadableDuration) duration34, chronology64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant25", (dateTime22.compareTo(instant25) == 0) == dateTime22.equals(instant25));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
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
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        org.joda.time.DateTime dateTime22 = dateTime2.withZone(dateTimeZone21);
        int int23 = dateTime2.getEra();
        int int24 = dateTime2.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime22", (dateTime2.compareTo(dateTime22) == 0) == dateTime2.equals(dateTime22));
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
        java.lang.String str19 = instant18.toString();
        org.joda.time.DateTime dateTime20 = instant18.toDateTimeISO();
        org.joda.time.Instant instant22 = instant18.plus((-2209338000000L));
        org.joda.time.Chronology chronology23 = instant18.getChronology();
        org.joda.time.Period period25 = new org.joda.time.Period((long) 70);
        org.joda.time.Duration duration26 = period25.toStandardDuration();
        org.joda.time.Instant instant28 = instant18.withDurationAdded((org.joda.time.ReadableDuration) duration26, 64800052);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period39 = org.joda.time.Period.days((-1));
        org.joda.time.Period period41 = period39.withWeeks((int) 'a');
        java.lang.String str42 = period39.toString();
        mutablePeriod37.setPeriod((org.joda.time.ReadablePeriod) period39);
        int int44 = mutablePeriod37.getMillis();
        org.joda.time.DurationFieldType durationFieldType46 = mutablePeriod37.getFieldType(0);
        mutablePeriod37.setDays((int) (byte) -1);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime();
        org.joda.time.Instant instant50 = dateTime49.toInstant();
        org.joda.time.Duration duration51 = mutablePeriod37.toDurationFrom((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime.Property property52 = dateTime49.yearOfEra();
        org.joda.time.DateTime dateTime54 = dateTime49.minusWeeks(114565);
        org.joda.time.DateTime dateTime56 = dateTime54.withYear(435);
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean67 = mutableInterval62.isBefore((org.joda.time.ReadableInterval) mutableInterval66);
        boolean boolean68 = mutableInterval59.contains((org.joda.time.ReadableInterval) mutableInterval66);
        org.joda.time.Period period71 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType72 = period71.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType72);
        org.joda.time.Period period74 = mutableInterval66.toPeriod(periodType72);
        java.lang.String str75 = periodType72.getName();
        int int76 = periodType72.size();
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval82 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval83 = mutableInterval82.toInterval();
        org.joda.time.MutableInterval mutableInterval86 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean87 = mutableInterval82.isBefore((org.joda.time.ReadableInterval) mutableInterval86);
        boolean boolean88 = mutableInterval79.contains((org.joda.time.ReadableInterval) mutableInterval86);
        org.joda.time.Weeks weeks89 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval86);
        org.joda.time.Weeks weeks90 = weeks89.negated();
        org.joda.time.DurationFieldType durationFieldType91 = weeks89.getFieldType();
        int int92 = periodType72.indexOf(durationFieldType91);
        org.joda.time.Period period93 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant18, (org.joda.time.ReadableInstant) dateTime54, periodType72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime49", (instant0.compareTo(dateTime49) == 0) == instant0.equals(dateTime49));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        mutablePeriod10.addMillis(2022);
        mutablePeriod10.setYears(52);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, periodType17, chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfCentury();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology30.getZone();
        java.lang.String str33 = dateTimeZone31.getName(100L);
        org.joda.time.DateTime dateTime34 = dateTime25.withZoneRetainFields(dateTimeZone31);
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology39.getZone();
        java.lang.String str42 = dateTimeZone40.getName(100L);
        org.joda.time.DateTime dateTime43 = dateTime34.withZoneRetainFields(dateTimeZone40);
        org.joda.time.Chronology chronology44 = chronology22.withZone(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.DateTimeZone dateTimeZone54 = chronology53.getZone();
        java.lang.String str56 = dateTimeZone54.getName(100L);
        org.joda.time.DateTime dateTime57 = dateTime48.withZoneRetainFields(dateTimeZone54);
        long long59 = dateTimeZone47.getMillisKeepLocal(dateTimeZone54, 6000035L);
        java.util.Locale locale61 = null;
        java.lang.String str62 = dateTimeZone47.getShortName((long) 1, locale61);
        org.joda.time.Chronology chronology63 = chronology44.withZone(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField64 = chronology63.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField65 = chronology63.millisOfSecond();
        mutablePeriod10.setPeriod(376L, chronology63);
        org.joda.time.Interval interval67 = new org.joda.time.Interval((-30170667715200000L), 117504000000L, chronology63);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale70 = null;
        java.lang.String str71 = dateTimeZone68.getName(164096150400000L, locale70);
        java.util.TimeZone timeZone72 = dateTimeZone68.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forTimeZone(timeZone72);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(dateTimeZone73);
        java.lang.String str75 = dateTimeZone73.toString();
        org.joda.time.Chronology chronology76 = chronology63.withZone(dateTimeZone73);
        org.joda.time.DurationField durationField77 = chronology76.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime74", (dateTime25.compareTo(dateTime74) == 0) == dateTime25.equals(dateTime74));
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
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
        org.joda.time.Instant instant20 = instant17.withMillis((long) 496);
        org.joda.time.MutableDateTime mutableDateTime21 = instant20.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant17", (dateTime16.compareTo(instant17) == 0) == dateTime16.equals(instant17));
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readableDuration1);
        org.joda.time.Hours hours3 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) mutableInterval2);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.TimeOfDay timeOfDay6 = dateTime4.toTimeOfDay();
        mutableInterval2.setEnd((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.MutableInterval mutableInterval8 = mutableInterval2.toMutableInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 10);
        org.joda.time.Instant instant6 = instant0.withDurationAdded((-54432000000L), 3);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 1, periodType10, chronology15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '4', chronology15);
        org.joda.time.ReadablePartial readablePartial18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withFields(readablePartial18);
        boolean boolean20 = instant7.isAfter((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime.Property property21 = dateTime17.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone23);
        int int25 = dateTime24.getDayOfMonth();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, periodType27, chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone35 = chronology32.getZone();
        org.joda.time.DateTime dateTime36 = dateTime24.withZoneRetainFields(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = dateTime17.withZone(dateTimeZone35);
        org.joda.time.Duration duration39 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableDuration) duration39);
        boolean boolean41 = instant6.isBefore((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Instant instant43 = instant6.withMillis((long) 22);
        org.joda.time.DateTime dateTime44 = instant43.toDateTimeISO();
        org.joda.time.Period period45 = org.joda.time.Period.ZERO;
        org.joda.time.Hours hours46 = period45.toStandardHours();
        org.joda.time.Period period48 = period45.minusYears(82800052);
        org.joda.time.DateTime dateTime49 = dateTime44.minus((org.joda.time.ReadablePeriod) period48);
        org.joda.time.DateTime dateTime51 = dateTime44.minusWeeks(30070075);
        org.joda.time.ReadableInstant readableInstant52 = null;
        boolean boolean53 = dateTime51.isBefore(readableInstant52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant43 and dateTime44", (instant43.compareTo(dateTime44) == 0) == instant43.equals(dateTime44));
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
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
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean30 = mutableInterval25.isBefore((org.joda.time.ReadableInterval) mutableInterval29);
        boolean boolean31 = mutableInterval22.contains((org.joda.time.ReadableInterval) mutableInterval29);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        long long37 = interval35.toDurationMillis();
        org.joda.time.Interval interval39 = interval35.withEndMillis((long) (short) 100);
        mutableInterval29.setInterval((org.joda.time.ReadableInterval) interval35);
        org.joda.time.Chronology chronology41 = interval35.getChronology();
        boolean boolean42 = duration17.equals((java.lang.Object) interval35);
        org.joda.time.Seconds seconds43 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.Duration duration44 = seconds43.toStandardDuration();
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
        int int65 = dateTime64.getMillisOfSecond();
        long long66 = dateTime64.getMillis();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration44, (org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Interval interval68 = interval35.withEnd((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Seconds seconds69 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval68);
        org.joda.time.Interval interval71 = interval68.withStartMillis((-1565224819162978L));
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone73);
        int int75 = dateTime74.getMillisOfDay();
        org.joda.time.DateTime dateTime77 = dateTime74.plusMillis((int) '#');
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval84 = mutableInterval83.toInterval();
        org.joda.time.Chronology chronology85 = interval84.getChronology();
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((long) 1, periodType80, chronology85);
        org.joda.time.DateTime dateTime87 = new org.joda.time.DateTime((long) '4', chronology85);
        org.joda.time.DateTime dateTime88 = dateTime77.withChronology(chronology85);
        org.joda.time.DateTimeZone dateTimeZone89 = chronology85.getZone();
        org.joda.time.DurationField durationField90 = chronology85.eras();
        org.joda.time.Interval interval91 = interval68.withChronology(chronology85);
        org.joda.time.DurationField durationField92 = chronology85.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField90, durationField92, and durationField90", !(durationField90.compareTo(durationField92) == 0) || (Math.signum(durationField90.compareTo(durationField90)) == Math.signum(durationField92.compareTo(durationField90))));
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime11 = property10.withMinimumValue();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType16, chronology21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '4', chronology21);
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) 'a', 164096150400000L, chronology21);
        org.joda.time.DateTimeZone dateTimeZone25 = chronology21.getZone();
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime11.toMutableDateTime(dateTimeZone25);
        org.joda.time.DateTime.Property property27 = dateTime11.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(3600);
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        java.lang.String str31 = dateTimeZone29.toString();
        org.joda.time.DateTime dateTime32 = dateTime11.toDateTime(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime30", (dateTime0.compareTo(dateTime30) == 0) == dateTime0.equals(dateTime30));
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
        java.lang.String str33 = dateTime30.toString();
        int int34 = dateTime30.getMonthOfYear();
        org.joda.time.Chronology chronology35 = dateTime30.getChronology();
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean46 = mutableInterval41.isBefore((org.joda.time.ReadableInterval) mutableInterval45);
        boolean boolean47 = mutableInterval38.contains((org.joda.time.ReadableInterval) mutableInterval45);
        org.joda.time.Weeks weeks48 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval45);
        long long49 = mutableInterval45.getEndMillis();
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval56 = mutableInterval55.toInterval();
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean60 = mutableInterval55.isBefore((org.joda.time.ReadableInterval) mutableInterval59);
        boolean boolean61 = mutableInterval52.contains((org.joda.time.ReadableInterval) mutableInterval59);
        mutableInterval45.setInterval((org.joda.time.ReadableInterval) mutableInterval59);
        org.joda.time.DateTime dateTime63 = mutableInterval59.getStart();
        org.joda.time.DateTime dateTime64 = mutableInterval59.getEnd();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone66);
        int int68 = dateTime67.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval75 = mutableInterval74.toInterval();
        org.joda.time.MutableInterval mutableInterval78 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean79 = mutableInterval74.isBefore((org.joda.time.ReadableInterval) mutableInterval78);
        boolean boolean80 = mutableInterval71.contains((org.joda.time.ReadableInterval) mutableInterval78);
        org.joda.time.Weeks weeks81 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval78);
        org.joda.time.DateTime dateTime82 = dateTime67.plus((org.joda.time.ReadablePeriod) weeks81);
        org.joda.time.Duration duration83 = weeks81.toStandardDuration();
        org.joda.time.DateTime dateTime84 = dateTime64.minus((org.joda.time.ReadablePeriod) weeks81);
        org.joda.time.PeriodType periodType86 = null;
        org.joda.time.MutableInterval mutableInterval89 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval90 = mutableInterval89.toInterval();
        org.joda.time.Chronology chronology91 = interval90.getChronology();
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((long) 1, periodType86, chronology91);
        org.joda.time.DateTimeField dateTimeField93 = chronology91.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone94 = chronology91.getZone();
        org.joda.time.DateTimeField dateTimeField95 = chronology91.minuteOfHour();
        org.joda.time.Chronology chronology96 = chronology91.withUTC();
        org.joda.time.DateTime dateTime97 = dateTime84.toDateTime(chronology96);
        boolean boolean98 = dateTime30.isBefore((org.joda.time.ReadableInstant) dateTime97);
        org.joda.time.DateTime dateTime99 = dateTime30.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime99 and dateTime97", (dateTime99.compareTo(dateTime97) == 0) == dateTime99.equals(dateTime97));
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.TimeOfDay timeOfDay2 = dateTime0.toTimeOfDay();
        int int3 = dateTime0.getMonthOfYear();
        java.lang.String str4 = dateTime0.toString();
        org.joda.time.DateTime.Property property5 = dateTime0.minuteOfHour();
        org.joda.time.DateTime dateTime7 = dateTime0.minusMinutes((-59999));
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone10);
        int int12 = dateTime11.getDayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime11.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime16 = dateTime14.withYear(0);
        org.joda.time.DateTime.Property property17 = dateTime16.era();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone19);
        int int21 = dateTime20.getSecondOfMinute();
        int int22 = dateTime20.getMillisOfDay();
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
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime20.toMutableDateTime(chronology36);
        org.joda.time.DateTime dateTime41 = dateTime16.toDateTime(chronology36);
        org.joda.time.DateTimeField dateTimeField42 = chronology36.millisOfSecond();
        org.joda.time.DurationField durationField43 = chronology36.weekyears();
        org.joda.time.Period period44 = new org.joda.time.Period(100L, chronology36);
        int int45 = period44.getWeeks();
        boolean boolean46 = dateTime7.equals((java.lang.Object) int45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        int int7 = property6.getMinimumValue();
        java.util.Locale locale8 = null;
        int int9 = property6.getMaximumTextLength(locale8);
        org.joda.time.DateTime dateTime10 = property6.withMaximumValue();
        org.joda.time.ReadableInstant readableInstant11 = null;
        long long12 = property6.getDifferenceAsLong(readableInstant11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 1, periodType15, chronology20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', chronology20);
        org.joda.time.ReadablePartial readablePartial23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.withFields(readablePartial23);
        org.joda.time.DateTime.Property property25 = dateTime24.millisOfDay();
        org.joda.time.DateTime dateTime27 = dateTime24.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property28 = dateTime24.era();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.Instant instant30 = dateTime29.toInstant();
        org.joda.time.Minutes minutes31 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) instant30);
        org.joda.time.Instant instant33 = instant30.withMillis((long) 496);
        org.joda.time.Instant instant34 = instant30.toInstant();
        org.joda.time.MutableDateTime mutableDateTime35 = instant34.toMutableDateTime();
        int int36 = property6.compareTo((org.joda.time.ReadableInstant) mutableDateTime35);
        long long37 = property6.remainder();
        int int38 = property6.get();
        org.joda.time.DateTime dateTime39 = property6.getDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and instant30", (dateTime29.compareTo(instant30) == 0) == dateTime29.equals(instant30));
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
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
        org.joda.time.Minutes minutes19 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes21 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType22 = null;
        int int23 = minutes21.get(durationFieldType22);
        org.joda.time.DurationFieldType durationFieldType24 = minutes21.getFieldType();
        boolean boolean25 = minutes19.isGreaterThan(minutes21);
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = minutes27.get(durationFieldType28);
        org.joda.time.DurationFieldType durationFieldType30 = minutes27.getFieldType();
        boolean boolean31 = minutes19.isLessThan(minutes27);
        org.joda.time.Minutes minutes33 = minutes19.multipliedBy(0);
        org.joda.time.DateTime dateTime34 = dateTime9.plus((org.joda.time.ReadablePeriod) minutes33);
        org.joda.time.Minutes minutes36 = minutes33.minus(3600052);
        org.joda.time.Instant instant37 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        org.joda.time.Chronology chronology45 = interval44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 1, periodType40, chronology45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) '4', chronology45);
        org.joda.time.ReadablePartial readablePartial48 = null;
        org.joda.time.DateTime dateTime49 = dateTime47.withFields(readablePartial48);
        boolean boolean50 = instant37.isAfter((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Period period52 = org.joda.time.Period.days((-1));
        org.joda.time.Period period54 = period52.withWeeks((int) 'a');
        org.joda.time.Period period56 = period52.plusMonths((int) (short) -1);
        org.joda.time.Period period58 = period52.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime59 = dateTime47.plus((org.joda.time.ReadablePeriod) period52);
        org.joda.time.Instant instant60 = dateTime59.toInstant();
        org.joda.time.MutableDateTime mutableDateTime61 = instant60.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime62 = instant60.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone64);
        int int66 = dateTime65.getSecondOfMinute();
        org.joda.time.PeriodType periodType67 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod(periodType67);
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime65, (org.joda.time.ReadablePeriod) mutablePeriod68);
        java.lang.String str70 = dateTime65.toString();
        org.joda.time.DateTime dateTime72 = dateTime65.withSecondOfMinute(34);
        org.joda.time.DateTime dateTime73 = dateTime65.toDateTime();
        org.joda.time.Seconds seconds74 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) mutableDateTime62, (org.joda.time.ReadableInstant) dateTime65);
        boolean boolean75 = minutes36.equals((java.lang.Object) seconds74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant37", (dateTime0.compareTo(instant37) == 0) == dateTime0.equals(instant37));
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.joda.time.Period period0 = new org.joda.time.Period();
        int int1 = period0.getYears();
        org.joda.time.Period period2 = period0.negated();
        org.joda.time.Period period4 = period0.withMonths(0);
        org.joda.time.Hours hours5 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Hours hours7 = hours5.multipliedBy(0);
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
        org.joda.time.Instant instant31 = dateTime30.toInstant();
        org.joda.time.Hours hours32 = org.joda.time.Hours.EIGHT;
        int int33 = hours32.size();
        org.joda.time.Hours hours35 = hours32.plus((int) (short) -1);
        org.joda.time.Hours hours37 = hours35.dividedBy((-27425239));
        org.joda.time.DateTime dateTime38 = dateTime30.minus((org.joda.time.ReadablePeriod) hours37);
        org.joda.time.Hours hours40 = hours37.minus(292278993);
        org.joda.time.Hours hours41 = hours7.minus(hours37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant31", (dateTime30.compareTo(instant31) == 0) == dateTime30.equals(instant31));
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Instant instant5 = org.joda.time.Instant.parse("3600");
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant7 = instant5.minus(readableDuration6);
        org.joda.time.Chronology chronology8 = instant7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.years();
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(50L, (long) 5700, chronology8);
        org.joda.time.Period period11 = new org.joda.time.Period((-6380816045233000L), periodType1, chronology8);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 1, periodType18, chronology23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '4', chronology23);
        org.joda.time.ReadablePartial readablePartial26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.withFields(readablePartial26);
        boolean boolean28 = instant15.isAfter((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime.Property property29 = dateTime25.dayOfWeek();
        boolean boolean30 = dateTimeZone14.equals((java.lang.Object) dateTime25);
        org.joda.time.DateTime dateTime32 = dateTime25.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone34);
        int int36 = dateTime35.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone37 = dateTime35.getZone();
        org.joda.time.DateTime dateTime38 = dateTime35.toDateTimeISO();
        org.joda.time.Duration duration39 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Duration duration42 = duration39.withDurationAdded(1645514423237L, 3219);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime45 = dateTime43.minusWeeks((int) (short) 0);
        org.joda.time.DateTime dateTime47 = dateTime43.minusWeeks(365);
        org.joda.time.DateTime dateTime49 = dateTime43.withMillis(1645514266556L);
        org.joda.time.DateTime.Property property50 = dateTime49.millisOfSecond();
        org.joda.time.DateTime dateTime52 = dateTime49.withMinuteOfHour((int) (short) 1);
        org.joda.time.Interval interval53 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration42, (org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone55);
        int int57 = dateTime56.getDayOfMonth();
        org.joda.time.DateTime dateTime59 = dateTime56.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime61 = dateTime59.withYear(0);
        org.joda.time.DateTime.Property property62 = dateTime61.era();
        org.joda.time.DateTime dateTime63 = property62.roundCeilingCopy();
        org.joda.time.DateTime dateTime64 = property62.roundCeilingCopy();
        org.joda.time.DateTime dateTime66 = dateTime64.plusMillis(1989);
        org.joda.time.Period period71 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType72 = period71.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType72);
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval77 = mutableInterval76.toInterval();
        org.joda.time.Chronology chronology78 = interval77.getChronology();
        org.joda.time.DateTimeZone dateTimeZone79 = chronology78.getZone();
        org.joda.time.Period period80 = new org.joda.time.Period(10L, periodType72, chronology78);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((-61409836800000L), periodType72);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration42, (org.joda.time.ReadableInstant) dateTime64, periodType72);
        mutablePeriod82.addWeeks(1380);
        int[] intArray87 = chronology8.get((org.joda.time.ReadablePeriod) mutablePeriod82, (-2495818853722800000L), 1704093623807L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime43", (instant15.compareTo(dateTime43) == 0) == instant15.equals(dateTime43));
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
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
        int int26 = dateTime25.getSecondOfMinute();
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(periodType27);
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.Hours hours30 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period41 = org.joda.time.Period.days((-1));
        org.joda.time.Period period43 = period41.withWeeks((int) 'a');
        java.lang.String str44 = period41.toString();
        mutablePeriod39.setPeriod((org.joda.time.ReadablePeriod) period41);
        int int46 = mutablePeriod39.getMillis();
        org.joda.time.DurationFieldType durationFieldType48 = mutablePeriod39.getFieldType(0);
        int int49 = hours30.get(durationFieldType48);
        mutablePeriod28.set(durationFieldType48, (int) (short) 0);
        org.joda.time.Period period52 = period15.plus((org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.Duration duration53 = period15.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone55);
        int int57 = dateTime56.getDayOfMonth();
        org.joda.time.DateTime dateTime59 = dateTime56.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property60 = dateTime59.dayOfYear();
        org.joda.time.DateTime dateTime61 = property60.roundHalfFloorCopy();
        java.util.Locale locale62 = null;
        int int63 = property60.getMaximumTextLength(locale62);
        java.lang.String str64 = property60.getAsText();
        org.joda.time.DateTime dateTime65 = property60.withMinimumValue();
        org.joda.time.DateTime dateTime67 = dateTime65.plusSeconds(10278967);
        int int68 = dateTime65.getDayOfWeek();
        org.joda.time.Period period69 = duration53.toPeriodTo((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval78 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval79 = mutableInterval78.toInterval();
        org.joda.time.Chronology chronology80 = interval79.getChronology();
        org.joda.time.DateTimeZone dateTimeZone81 = chronology80.getZone();
        java.lang.String str83 = dateTimeZone81.getName(100L);
        org.joda.time.DateTime dateTime84 = dateTime75.withZoneRetainFields(dateTimeZone81);
        long long86 = dateTimeZone74.getMillisKeepLocal(dateTimeZone81, 6000035L);
        long long88 = dateTimeZone81.convertUTCToLocal(6216719587200001L);
        org.joda.time.Interval interval89 = new org.joda.time.Interval((-24339L), (long) 20, dateTimeZone81);
        java.util.TimeZone timeZone90 = dateTimeZone81.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone91 = org.joda.time.DateTimeZone.forTimeZone(timeZone90);
        org.joda.time.DateTimeZone dateTimeZone92 = org.joda.time.DateTimeZone.forTimeZone(timeZone90);
        org.joda.time.DateTimeZone dateTimeZone93 = org.joda.time.DateTimeZone.forTimeZone(timeZone90);
        org.joda.time.DateTime dateTime94 = dateTime65.withZone(dateTimeZone93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime75", (instant0.compareTo(dateTime75) == 0) == instant0.equals(dateTime75));
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.hourOfHalfday();
        org.joda.time.Period period4 = org.joda.time.Period.months(43);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology10.getZone();
        java.lang.String str13 = dateTimeZone11.getName(100L);
        org.joda.time.DateTime dateTime14 = dateTime5.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime dateTime17 = dateTime14.withDurationAdded((long) 52, (int) (short) 1);
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period4, (org.joda.time.ReadableInstant) dateTime17);
        int[] intArray21 = chronology1.get((org.joda.time.ReadablePeriod) period4, 0L, 0L);
        org.joda.time.DurationField durationField22 = chronology1.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime5", (instant0.compareTo(dateTime5) == 0) == instant0.equals(dateTime5));
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        int int3 = minutes1.get(durationFieldType2);
        java.lang.Object obj4 = null;
        boolean boolean5 = minutes1.equals(obj4);
        org.joda.time.DurationFieldType durationFieldType6 = minutes1.getFieldType();
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = minutes8.get(durationFieldType9);
        java.lang.Object obj11 = null;
        boolean boolean12 = minutes8.equals(obj11);
        org.joda.time.DurationFieldType durationFieldType13 = minutes8.getFieldType();
        boolean boolean14 = minutes1.isGreaterThan(minutes8);
        org.joda.time.Minutes minutes15 = minutes1.negated();
        org.joda.time.Minutes minutes17 = minutes15.plus(45);
        org.joda.time.Minutes minutes19 = minutes17.multipliedBy((int) (short) 10);
        org.joda.time.Minutes minutes21 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType22 = null;
        int int23 = minutes21.get(durationFieldType22);
        int int25 = minutes21.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod26 = minutes21.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType28 = minutes21.getFieldType(0);
        org.joda.time.Duration duration29 = minutes21.toStandardDuration();
        org.joda.time.Minutes minutes31 = minutes21.multipliedBy(3);
        org.joda.time.Minutes minutes33 = minutes31.multipliedBy((int) (short) 100);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime();
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
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period65 = duration35.toPeriodFrom((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadablePeriod) period65);
        java.lang.Object obj67 = mutableInterval66.clone();
        org.joda.time.Minutes minutes68 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) mutableInterval66);
        boolean boolean69 = minutes33.isGreaterThan(minutes68);
        org.joda.time.PeriodType periodType70 = minutes68.getPeriodType();
        org.joda.time.Minutes minutes71 = minutes17.minus(minutes68);
        org.joda.time.Duration duration72 = minutes17.toStandardDuration();
        org.joda.time.Minutes minutes74 = minutes17.minus(642);
        org.joda.time.Minutes minutes75 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes77 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType78 = null;
        int int79 = minutes77.get(durationFieldType78);
        org.joda.time.DurationFieldType durationFieldType80 = minutes77.getFieldType();
        boolean boolean81 = minutes75.isGreaterThan(minutes77);
        org.joda.time.Instant instant82 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes77, (org.joda.time.ReadableInstant) instant82);
        org.joda.time.DateTime dateTime84 = instant82.toDateTimeISO();
        org.joda.time.DateTime dateTime85 = instant82.toDateTimeISO();
        org.joda.time.Chronology chronology86 = instant82.getChronology();
        org.joda.time.Interval interval87 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) minutes17, (org.joda.time.ReadableInstant) instant82);
        int int89 = minutes17.getValue(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and instant82", (dateTime34.compareTo(instant82) == 0) == dateTime34.equals(instant82));
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
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
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime15.getZone();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        long long22 = dateTimeZone18.convertLocalToUTC(88983L, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime19", (instant0.compareTo(dateTime19) == 0) == instant0.equals(dateTime19));
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        long long5 = interval3.toDurationMillis();
        org.joda.time.Interval interval7 = interval3.withEndMillis((long) (short) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 10);
        org.joda.time.Interval interval12 = interval7.withEnd((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Instant instant14 = instant8.withMillis((long) 4);
        org.joda.time.Instant instant15 = instant14.toInstant();
        org.joda.time.Period period19 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType20 = period19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType20);
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.DateTimeZone dateTimeZone27 = chronology26.getZone();
        org.joda.time.Period period28 = new org.joda.time.Period(10L, periodType20, chronology26);
        org.joda.time.DateTimeField dateTimeField29 = chronology26.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = dateTimeField29.getType();
        int int31 = instant15.get(dateTimeFieldType30);
        org.joda.time.DateTime dateTime32 = instant15.toDateTime();
        org.joda.time.Hours hours33 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours34 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours35 = hours33.minus(hours34);
        org.joda.time.Duration duration36 = hours34.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone38);
        int int40 = dateTime39.getMillisOfDay();
        org.joda.time.DateTime dateTime42 = dateTime39.plusMillis((int) '#');
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 1, periodType45, chronology50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) '4', chronology50);
        org.joda.time.DateTime dateTime53 = dateTime42.withChronology(chronology50);
        boolean boolean55 = dateTime53.isEqual(187200000L);
        org.joda.time.Interval interval56 = duration36.toIntervalFrom((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone58);
        int int60 = dateTime59.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone61 = dateTime59.getZone();
        long long64 = dateTimeZone61.convertLocalToUTC(0L, true);
        org.joda.time.DateTime dateTime65 = dateTime53.withZoneRetainFields(dateTimeZone61);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(dateTimeZone61);
        org.joda.time.DateTime dateTime67 = dateTime66.withTimeAtStartOfDay();
        int int68 = dateTime32.compareTo((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime.Property property69 = dateTime66.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime32", (instant14.compareTo(dateTime32) == 0) == instant14.equals(dateTime32));
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (-98));
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        long long7 = interval5.toDurationMillis();
        org.joda.time.Interval interval9 = interval5.withEndMillis((long) (short) 100);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant10.withDurationAdded(readableDuration11, 10);
        org.joda.time.Interval interval14 = interval9.withEnd((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Instant instant16 = instant10.withMillis((long) 4);
        org.joda.time.Period period17 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Duration duration18 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval45 = duration18.toIntervalTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period48 = duration18.toPeriodFrom((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 1, periodType50, chronology55);
        org.joda.time.DateTimeField dateTimeField57 = chronology55.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone58 = chronology55.getZone();
        org.joda.time.DateTimeField dateTimeField59 = chronology55.weekOfWeekyear();
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(chronology55);
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.yearMonthDayTime();
        java.lang.String str63 = periodType62.getName();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) (short) -1, periodType62);
        org.joda.time.PeriodType periodType65 = periodType62.withMonthsRemoved();
        org.joda.time.Period period67 = org.joda.time.Period.minutes(3600);
        org.joda.time.DurationFieldType durationFieldType68 = org.joda.time.DurationFieldType.centuries();
        int int69 = period67.indexOf(durationFieldType68);
        boolean boolean70 = periodType62.isSupported(durationFieldType68);
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration18, (org.joda.time.ReadableInstant) dateTime60, periodType62);
        long long72 = duration18.getStandardMinutes();
        boolean boolean73 = duration1.isEqual((org.joda.time.ReadableDuration) duration18);
        org.joda.time.Minutes minutes74 = duration1.toStandardMinutes();
        org.joda.time.Weeks weeks75 = minutes74.toStandardWeeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime60", (instant10.compareTo(dateTime60) == 0) == instant10.equals(dateTime60));
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime.Property property4 = dateTime2.weekOfWeekyear();
        org.joda.time.DateTime dateTime6 = dateTime2.plusSeconds(22598);
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(29918);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        int int13 = minutes11.get(durationFieldType12);
        org.joda.time.DurationFieldType durationFieldType14 = minutes11.getFieldType();
        boolean boolean15 = minutes9.isGreaterThan(minutes11);
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType18 = null;
        int int19 = minutes17.get(durationFieldType18);
        org.joda.time.DurationFieldType durationFieldType20 = minutes17.getFieldType();
        boolean boolean21 = minutes9.isLessThan(minutes17);
        org.joda.time.Duration duration22 = minutes17.toStandardDuration();
        org.joda.time.Duration duration25 = duration22.withDurationAdded(10000L, 82800);
        org.joda.time.Period period26 = duration25.toPeriod();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableDuration) duration25);
        org.joda.time.DateTime.Property property28 = dateTime8.era();
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 1, periodType32, chronology37);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) '4', chronology37);
        org.joda.time.ReadablePartial readablePartial40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.withFields(readablePartial40);
        boolean boolean42 = instant29.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Period period44 = org.joda.time.Period.days((-1));
        org.joda.time.Period period46 = period44.withWeeks((int) 'a');
        org.joda.time.Period period48 = period44.plusMonths((int) (short) -1);
        org.joda.time.Period period50 = period44.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime51 = dateTime39.plus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.Instant instant52 = dateTime51.toInstant();
        org.joda.time.Instant instant55 = instant52.withDurationAdded(2629746000L, 25);
        boolean boolean56 = property28.equals((java.lang.Object) instant55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime51 and instant52", (dateTime51.compareTo(instant52) == 0) == dateTime51.equals(instant52));
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
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
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType33);
        mutablePeriod34.addMonths(0);
        int int37 = mutablePeriod34.getMillis();
        mutablePeriod34.addYears(0);
        org.joda.time.Minutes minutes40 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes42 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType43 = null;
        int int44 = minutes42.get(durationFieldType43);
        org.joda.time.DurationFieldType durationFieldType45 = minutes42.getFieldType();
        boolean boolean46 = minutes40.isGreaterThan(minutes42);
        org.joda.time.Minutes minutes48 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType49 = null;
        int int50 = minutes48.get(durationFieldType49);
        org.joda.time.DurationFieldType durationFieldType51 = minutes48.getFieldType();
        boolean boolean52 = minutes40.isLessThan(minutes48);
        org.joda.time.Duration duration53 = minutes48.toStandardDuration();
        org.joda.time.Minutes minutes55 = minutes48.minus(86399);
        mutablePeriod34.setPeriod((org.joda.time.ReadablePeriod) minutes48);
        mutablePeriod34.addSeconds((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType59 = org.joda.time.DurationFieldType.days();
        mutablePeriod34.add(durationFieldType59, 3600);
        int int62 = period30.indexOf(durationFieldType59);
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 1, periodType64, chronology69);
        org.joda.time.DateTimeField dateTimeField71 = chronology69.yearOfCentury();
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval76 = mutableInterval75.toInterval();
        org.joda.time.Chronology chronology77 = interval76.getChronology();
        org.joda.time.DateTimeZone dateTimeZone78 = chronology77.getZone();
        java.lang.String str80 = dateTimeZone78.getName(100L);
        org.joda.time.DateTime dateTime81 = dateTime72.withZoneRetainFields(dateTimeZone78);
        org.joda.time.MutableInterval mutableInterval84 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval85 = mutableInterval84.toInterval();
        org.joda.time.Chronology chronology86 = interval85.getChronology();
        org.joda.time.DateTimeZone dateTimeZone87 = chronology86.getZone();
        java.lang.String str89 = dateTimeZone87.getName(100L);
        org.joda.time.DateTime dateTime90 = dateTime81.withZoneRetainFields(dateTimeZone87);
        org.joda.time.Chronology chronology91 = chronology69.withZone(dateTimeZone87);
        org.joda.time.DurationField durationField92 = chronology91.eras();
        org.joda.time.DurationField durationField93 = durationFieldType59.getField(chronology91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField92, durationField93, and durationField92", !(durationField92.compareTo(durationField93) == 0) || (Math.signum(durationField92.compareTo(durationField92)) == Math.signum(durationField93.compareTo(durationField92))));
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
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
        org.joda.time.Hours hours24 = org.joda.time.Hours.EIGHT;
        int int25 = hours24.size();
        org.joda.time.Hours hours27 = hours24.plus((int) (short) -1);
        org.joda.time.Hours hours29 = hours27.dividedBy((-27425239));
        org.joda.time.DateTime dateTime30 = dateTime22.minus((org.joda.time.ReadablePeriod) hours29);
        org.joda.time.Hours hours32 = hours29.minus(292278993);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.Seconds seconds34 = org.joda.time.Seconds.standardSecondsIn(readablePeriod33);
        int int35 = seconds34.getSeconds();
        org.joda.time.Seconds seconds37 = seconds34.plus((int) '4');
        org.joda.time.DurationFieldType durationFieldType38 = seconds37.getFieldType();
        boolean boolean39 = hours32.isSupported(durationFieldType38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant23", (dateTime22.compareTo(instant23) == 0) == dateTime22.equals(instant23));
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
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
        int int26 = dateTime25.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int28 = dateTime25.get(dateTimeFieldType27);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 1, periodType32, chronology37);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) '4', chronology37);
        org.joda.time.ReadablePartial readablePartial40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.withFields(readablePartial40);
        boolean boolean42 = instant29.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime.Property property43 = dateTime39.dayOfWeek();
        org.joda.time.DateTime dateTime44 = property43.withMaximumValue();
        org.joda.time.DurationField durationField45 = property43.getRangeDurationField();
        org.joda.time.DateTime dateTime46 = property43.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime48 = dateTime46.toDateTime(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.withWeekyear(19);
        org.joda.time.Duration duration51 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime48);
        java.lang.String str52 = dateTime48.toString();
        org.joda.time.DateTime dateTime54 = dateTime48.minusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone56);
        int int58 = dateTime57.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean69 = mutableInterval64.isBefore((org.joda.time.ReadableInterval) mutableInterval68);
        boolean boolean70 = mutableInterval61.contains((org.joda.time.ReadableInterval) mutableInterval68);
        org.joda.time.Weeks weeks71 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval68);
        org.joda.time.DateTime dateTime72 = dateTime57.plus((org.joda.time.ReadablePeriod) weeks71);
        java.util.Locale locale73 = null;
        java.util.Calendar calendar74 = dateTime57.toCalendar(locale73);
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone76);
        int int78 = dateTime77.getDayOfMonth();
        org.joda.time.DateTime dateTime80 = dateTime77.withMillisOfDay((int) 'a');
        org.joda.time.Weeks weeks81 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadableInstant) dateTime77);
        int int82 = dateTime48.compareTo((org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.DateTime dateTime83 = dateTime77.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime48", (dateTime9.compareTo(dateTime48) == 0) == dateTime9.equals(dateTime48));
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        mutableInterval9.setInterval((-80867997L), 271254L);
        org.joda.time.Period period16 = mutableInterval9.toPeriod();
        org.joda.time.DateTime dateTime17 = mutableInterval9.getStart();
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean28 = mutableInterval23.isBefore((org.joda.time.ReadableInterval) mutableInterval27);
        boolean boolean29 = mutableInterval20.contains((org.joda.time.ReadableInterval) mutableInterval27);
        org.joda.time.Weeks weeks30 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval27);
        long long31 = mutableInterval27.getEndMillis();
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean42 = mutableInterval37.isBefore((org.joda.time.ReadableInterval) mutableInterval41);
        boolean boolean43 = mutableInterval34.contains((org.joda.time.ReadableInterval) mutableInterval41);
        mutableInterval27.setInterval((org.joda.time.ReadableInterval) mutableInterval41);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, periodType47, chronology52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', chronology52);
        org.joda.time.ReadablePartial readablePartial55 = null;
        org.joda.time.DateTime dateTime56 = dateTime54.withFields(readablePartial55);
        org.joda.time.DateTime.Property property57 = dateTime56.millisOfDay();
        boolean boolean58 = mutableInterval27.isBefore((org.joda.time.ReadableInstant) dateTime56);
        int int59 = dateTime56.getHourOfDay();
        org.joda.time.Instant instant60 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval67 = mutableInterval66.toInterval();
        org.joda.time.Chronology chronology68 = interval67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 1, periodType63, chronology68);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) '4', chronology68);
        org.joda.time.ReadablePartial readablePartial71 = null;
        org.joda.time.DateTime dateTime72 = dateTime70.withFields(readablePartial71);
        boolean boolean73 = instant60.isAfter((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime.Property property74 = dateTime70.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone76);
        int int78 = dateTime77.getDayOfMonth();
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval84 = mutableInterval83.toInterval();
        org.joda.time.Chronology chronology85 = interval84.getChronology();
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((long) 1, periodType80, chronology85);
        org.joda.time.DateTimeField dateTimeField87 = chronology85.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone88 = chronology85.getZone();
        org.joda.time.DateTime dateTime89 = dateTime77.withZoneRetainFields(dateTimeZone88);
        org.joda.time.DateTime dateTime90 = dateTime70.withZone(dateTimeZone88);
        org.joda.time.DateTimeZone dateTimeZone91 = null;
        org.joda.time.DateTime dateTime92 = dateTime90.toDateTime(dateTimeZone91);
        boolean boolean93 = dateTime56.isAfter((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.Instant instant94 = dateTime56.toInstant();
        org.joda.time.DateTime dateTime95 = instant94.toDateTimeISO();
        boolean boolean96 = dateTime17.isEqual((org.joda.time.ReadableInstant) dateTime95);
        org.joda.time.DateTime dateTime98 = dateTime95.minusMonths(25011167);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime54 and instant94", (dateTime54.compareTo(instant94) == 0) == dateTime54.equals(instant94));
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
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
        org.joda.time.DateTime dateTime32 = dateMidnight12.toDateTime(chronology30);
        org.joda.time.Period period34 = org.joda.time.Period.days((-1));
        org.joda.time.Period period36 = period34.withWeeks((int) 'a');
        org.joda.time.Period period38 = period36.withDays(100);
        org.joda.time.Instant instant39 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 1, periodType42, chronology47);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) '4', chronology47);
        org.joda.time.ReadablePartial readablePartial50 = null;
        org.joda.time.DateTime dateTime51 = dateTime49.withFields(readablePartial50);
        boolean boolean52 = instant39.isAfter((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime.Property property53 = dateTime49.dayOfWeek();
        boolean boolean54 = period38.equals((java.lang.Object) property53);
        boolean boolean55 = property53.isLeap();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone57);
        int int59 = dateTime58.getDayOfMonth();
        org.joda.time.DateTime dateTime61 = dateTime58.withWeekOfWeekyear(1);
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 1, periodType64, chronology69);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) '4', chronology69);
        org.joda.time.ReadablePartial readablePartial72 = null;
        org.joda.time.DateTime dateTime73 = dateTime71.withFields(readablePartial72);
        org.joda.time.DateTime.Property property74 = dateTime73.millisOfDay();
        org.joda.time.DateTime dateTime75 = dateTime73.withEarlierOffsetAtOverlap();
        int int76 = dateTime73.getDayOfWeek();
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval82 = mutableInterval81.toInterval();
        org.joda.time.Chronology chronology83 = interval82.getChronology();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) 1, periodType78, chronology83);
        org.joda.time.DateTimeField dateTimeField85 = chronology83.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone86 = chronology83.getZone();
        org.joda.time.DateTime dateTime87 = dateTime73.withChronology(chronology83);
        org.joda.time.DateTime dateTime88 = dateTime73.withEarlierOffsetAtOverlap();
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime61, (org.joda.time.ReadableInstant) dateTime88);
        long long90 = property53.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime88);
        int int91 = dateTime88.getDayOfWeek();
        org.joda.time.DateTime dateTime93 = dateTime88.plusMillis(2);
        java.util.Date date94 = dateTime93.toDate();
        org.joda.time.Duration duration95 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateMidnight12, (org.joda.time.ReadableInstant) dateTime93);
        org.joda.time.Days days96 = duration95.toStandardDays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight12 and dateTime32", (dateMidnight12.compareTo(dateTime32) == 0) == dateMidnight12.equals(dateTime32));
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours1 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours2 = hours0.minus(hours1);
        org.joda.time.Duration duration3 = hours1.toStandardDuration();
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
        boolean boolean22 = dateTime20.isEqual(187200000L);
        org.joda.time.Interval interval23 = duration3.toIntervalFrom((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.hourOfHalfday();
        long long35 = dateTimeField32.getDifferenceAsLong((long) 10, (long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone37);
        int int39 = dateTime38.getSecondOfMinute();
        org.joda.time.DateTime dateTime41 = dateTime38.withMinuteOfHour(10);
        org.joda.time.TimeOfDay timeOfDay42 = dateTime41.toTimeOfDay();
        int[] intArray49 = new int[] { '4', 1970, 10, (byte) 10, 24, 50 };
        int int50 = dateTimeField32.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay42, intArray49);
        org.joda.time.DateTime dateTime51 = dateTime20.withFields((org.joda.time.ReadablePartial) timeOfDay42);
        org.joda.time.DateTime dateTime53 = dateTime51.withYearOfEra(49);
        boolean boolean55 = dateTime51.equals((java.lang.Object) "1969-12-31T22:59:59.999-01:00/1969-12-31T23:00:00.052-01:00");
        org.joda.time.Instant instant58 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology59 = instant58.getChronology();
        org.joda.time.Period period60 = new org.joda.time.Period(1672531199993L, (long) '4', chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology59.era();
        org.joda.time.DateTime dateTime62 = dateTime51.withChronology(chronology59);
        long long63 = dateTime51.getMillis();
        org.joda.time.DateTime.Property property64 = dateTime51.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and dateTime62", (dateTime41.compareTo(dateTime62) == 0) == dateTime41.equals(dateTime62));
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType2 = period1.getPeriodType();
        org.joda.time.Period period4 = period1.withMonths((int) (byte) 0);
        org.joda.time.Period period6 = period4.plusHours(0);
        org.joda.time.Hours hours7 = period6.toStandardHours();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(readableInstant0, (org.joda.time.ReadablePeriod) hours7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, periodType11, chronology16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) '4', chronology16);
        org.joda.time.ReadablePartial readablePartial19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.withFields(readablePartial19);
        org.joda.time.DateTime dateTime22 = dateTime18.plusMillis((int) ' ');
        org.joda.time.DateTime dateTime24 = dateTime18.minusMinutes((int) '#');
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
        org.joda.time.DateTimeField dateTimeField52 = chronology46.year();
        org.joda.time.DateTimeField dateTimeField53 = chronology46.era();
        org.joda.time.DateTime dateTime54 = dateTime24.toDateTime(chronology46);
        int int55 = dateTime54.getMinuteOfHour();
        org.joda.time.DateTime dateTime57 = dateTime54.minusMonths(510);
        org.joda.time.Instant instant58 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.Instant instant61 = instant58.withDurationAdded(readableDuration59, 10);
        org.joda.time.Instant instant64 = instant58.withDurationAdded((-54432000000L), 3);
        org.joda.time.Instant instant66 = instant64.withMillis(52L);
        long long67 = instant64.getMillis();
        org.joda.time.Instant instant70 = instant64.withDurationAdded((-6279833754000000L), 2);
        long long71 = instant64.getMillis();
        org.joda.time.Instant instant73 = instant64.plus(39L);
        boolean boolean75 = instant64.isBefore((-3600010L));
        org.joda.time.Interval interval76 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadableInstant) instant64);
        boolean boolean77 = mutableInterval8.contains((org.joda.time.ReadableInterval) interval76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant66", (dateTime18.compareTo(instant66) == 0) == dateTime18.equals(instant66));
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1");
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.Instant instant4 = instant1.minus(6216719936400001L);
        org.joda.time.Instant instant7 = instant1.withDurationAdded(3600999L, 2922789);
        org.joda.time.DateTime dateTime8 = instant1.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone11);
        int int13 = dateTime12.getDayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime12.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime17 = dateTime15.withYear(0);
        org.joda.time.DateTime.Property property18 = dateTime17.era();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone20);
        int int22 = dateTime21.getSecondOfMinute();
        int int23 = dateTime21.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone25);
        int int27 = dateTime26.getMillisOfDay();
        org.joda.time.DateTime dateTime29 = dateTime26.plusMillis((int) '#');
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 1, periodType32, chronology37);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) '4', chronology37);
        org.joda.time.DateTime dateTime40 = dateTime29.withChronology(chronology37);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime21.toMutableDateTime(chronology37);
        org.joda.time.DateTime dateTime42 = dateTime17.toDateTime(chronology37);
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean53 = mutableInterval48.isBefore((org.joda.time.ReadableInterval) mutableInterval52);
        boolean boolean54 = mutableInterval45.contains((org.joda.time.ReadableInterval) mutableInterval52);
        org.joda.time.Weeks weeks55 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval52);
        long long56 = mutableInterval52.getEndMillis();
        org.joda.time.DateTime dateTime57 = mutableInterval52.getEnd();
        org.joda.time.Chronology chronology58 = mutableInterval52.getChronology();
        org.joda.time.DateTime dateTime59 = dateTime17.toDateTime(chronology58);
        org.joda.time.Period period60 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType61 = period60.getPeriodType();
        org.joda.time.Period period63 = period60.withMonths((int) (byte) 0);
        org.joda.time.Period period64 = period60.negated();
        org.joda.time.DateTime dateTime65 = dateTime59.minus((org.joda.time.ReadablePeriod) period60);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean67 = dateTime65.isSupported(dateTimeFieldType66);
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval71 = mutableInterval70.toInterval();
        org.joda.time.Chronology chronology72 = interval71.getChronology();
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime(chronology72);
        org.joda.time.DateTime dateTime75 = dateTime73.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime77 = dateTime75.plus((long) (short) -1);
        org.joda.time.Chronology chronology78 = dateTime75.getChronology();
        org.joda.time.DateTimeField dateTimeField79 = dateTimeFieldType66.getField(chronology78);
        org.joda.time.DateTime dateTime80 = mutableDateTime9.toDateTime(chronology78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime8", (instant1.compareTo(dateTime8) == 0) == instant1.equals(dateTime8));
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.DateTime.Property property2 = dateTime0.minuteOfDay();
        boolean boolean3 = dateTime0.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone5);
        int int7 = dateTime6.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = dateTime6.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime6.withMillisOfDay((int) (byte) 1);
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
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone28);
        int int30 = dateTime29.getDayOfMonth();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 1, periodType32, chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology37.getZone();
        org.joda.time.DateTime dateTime41 = dateTime29.withZoneRetainFields(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = dateTime22.withZone(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.toDateTime(dateTimeZone43);
        org.joda.time.Seconds seconds45 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Instant instant47 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Instant instant50 = instant47.withDurationAdded(readableDuration48, 10);
        org.joda.time.Instant instant53 = instant47.withDurationAdded((-54432000000L), 3);
        org.joda.time.Instant instant55 = instant53.withMillis(52L);
        long long56 = instant53.getMillis();
        org.joda.time.Instant instant59 = instant53.withDurationAdded((-6279833754000000L), 2);
        long long60 = instant53.getMillis();
        org.joda.time.Instant instant62 = instant53.plus(39L);
        org.joda.time.DateTimeZone dateTimeZone63 = instant53.getZone();
        org.joda.time.DateTime dateTime64 = dateTime0.withZone(dateTimeZone63);
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval71 = mutableInterval70.toInterval();
        org.joda.time.Chronology chronology72 = interval71.getChronology();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) 1, periodType67, chronology72);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((long) '4', chronology72);
        org.joda.time.ReadablePartial readablePartial75 = null;
        org.joda.time.DateTime dateTime76 = dateTime74.withFields(readablePartial75);
        org.joda.time.DateTime.Property property77 = dateTime76.millisOfDay();
        org.joda.time.DateTime dateTime78 = dateTime76.withEarlierOffsetAtOverlap();
        int int79 = dateTime78.getMillisOfDay();
        int int80 = dateTimeZone63.getOffset((org.joda.time.ReadableInstant) dateTime78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
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
        org.joda.time.DateTime dateTime19 = instant18.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone21);
        int int23 = dateTime22.getDayOfMonth();
        org.joda.time.DateTime dateTime25 = dateTime22.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime27 = dateTime25.withYear(0);
        org.joda.time.DateTime.Property property28 = dateTime27.era();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone30);
        int int32 = dateTime31.getSecondOfMinute();
        int int33 = dateTime31.getMillisOfDay();
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
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime31.toMutableDateTime(chronology47);
        org.joda.time.DateTime dateTime52 = dateTime27.toDateTime(chronology47);
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean63 = mutableInterval58.isBefore((org.joda.time.ReadableInterval) mutableInterval62);
        boolean boolean64 = mutableInterval55.contains((org.joda.time.ReadableInterval) mutableInterval62);
        org.joda.time.Weeks weeks65 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval62);
        long long66 = mutableInterval62.getEndMillis();
        org.joda.time.DateTime dateTime67 = mutableInterval62.getEnd();
        org.joda.time.Chronology chronology68 = mutableInterval62.getChronology();
        org.joda.time.DateTime dateTime69 = dateTime27.toDateTime(chronology68);
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval75 = mutableInterval74.toInterval();
        org.joda.time.Chronology chronology76 = interval75.getChronology();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((long) 1, periodType71, chronology76);
        org.joda.time.DateTimeField dateTimeField78 = chronology76.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone79 = chronology76.getZone();
        java.lang.String str80 = dateTimeZone79.toString();
        boolean boolean81 = dateTimeZone79.isFixed();
        org.joda.time.DateTime dateTime82 = dateTime27.withZoneRetainFields(dateTimeZone79);
        org.joda.time.MutableDateTime mutableDateTime83 = dateTime19.toMutableDateTime(dateTimeZone79);
        java.util.Locale locale85 = null;
        java.lang.String str86 = dateTimeZone79.getShortName((-3599200L), locale85);
        java.lang.String str87 = dateTimeZone79.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant18", (dateTime15.compareTo(instant18) == 0) == dateTime15.equals(instant18));
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
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
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        mutablePeriod27.add((long) 3);
        org.joda.time.DateTime dateTime30 = dateTime9.minus((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardHours((long) 349200000);
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology37);
        org.joda.time.DateTime dateTime40 = dateTime38.withWeekyear((int) (short) 1);
        org.joda.time.Duration duration41 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval68 = duration41.toIntervalTo((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period71 = duration41.toPeriodFrom((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.Period period72 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType73 = period72.getPeriodType();
        org.joda.time.Period period74 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableDuration) duration41, periodType73);
        int int75 = periodType73.size();
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableDuration) duration32, periodType73);
        org.joda.time.Instant instant77 = dateTime9.toInstant();
        org.joda.time.MutableDateTime mutableDateTime78 = instant77.toMutableDateTimeISO();
        int int79 = mutableDateTime78.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant77", (dateTime0.compareTo(instant77) == 0) == dateTime0.equals(instant77));
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        org.joda.time.Instant instant5 = dateTime2.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int7 = instant5.get(dateTimeFieldType6);
        org.joda.time.MutableDateTime mutableDateTime8 = instant5.toMutableDateTimeISO();
        org.joda.time.Days days10 = org.joda.time.Days.days(2922789);
        org.joda.time.Days days12 = days10.plus(5);
        org.joda.time.Days days14 = days10.plus(366);
        boolean boolean15 = mutableDateTime8.equals((java.lang.Object) days10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant5", (dateTime2.compareTo(instant5) == 0) == dateTime2.equals(instant5));
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
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
        long long74 = chronology69.add((long) 57, 100L, 24);
        org.joda.time.DateTimeField dateTimeField75 = chronology69.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField76 = chronology69.halfdayOfDay();
        org.joda.time.DurationField durationField77 = chronology69.days();
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime();
        org.joda.time.Instant instant79 = dateTime78.toInstant();
        org.joda.time.TimeOfDay timeOfDay80 = dateTime78.toTimeOfDay();
        long long82 = chronology69.set((org.joda.time.ReadablePartial) timeOfDay80, 495L);
        int int83 = timeOfDay80.size();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime50 and instant79", (dateTime50.compareTo(instant79) == 0) == dateTime50.equals(instant79));
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.Instant instant4 = instant2.minus(896L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant2", (dateTime0.compareTo(instant2) == 0) == dateTime0.equals(instant2));
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withMinuteOfHour(10);
        int int6 = dateTime5.getEra();
        int int7 = dateTime5.getCenturyOfEra();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(periodType8);
        org.joda.time.Period period11 = org.joda.time.Period.minutes(52);
        org.joda.time.Hours hours12 = org.joda.time.Hours.EIGHT;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period23 = org.joda.time.Period.days((-1));
        org.joda.time.Period period25 = period23.withWeeks((int) 'a');
        java.lang.String str26 = period23.toString();
        mutablePeriod21.setPeriod((org.joda.time.ReadablePeriod) period23);
        int int28 = mutablePeriod21.getMillis();
        org.joda.time.DurationFieldType durationFieldType30 = mutablePeriod21.getFieldType(0);
        int int31 = hours12.get(durationFieldType30);
        java.lang.String str32 = durationFieldType30.toString();
        int int33 = period11.indexOf(durationFieldType30);
        mutablePeriod9.add(durationFieldType30, 1969);
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean46 = mutableInterval41.isBefore((org.joda.time.ReadableInterval) mutableInterval45);
        boolean boolean47 = mutableInterval38.contains((org.joda.time.ReadableInterval) mutableInterval45);
        org.joda.time.MutableInterval mutableInterval48 = mutableInterval38.copy();
        org.joda.time.Instant instant49 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval56 = mutableInterval55.toInterval();
        org.joda.time.Chronology chronology57 = interval56.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 1, periodType52, chronology57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) '4', chronology57);
        org.joda.time.ReadablePartial readablePartial60 = null;
        org.joda.time.DateTime dateTime61 = dateTime59.withFields(readablePartial60);
        boolean boolean62 = instant49.isAfter((org.joda.time.ReadableInstant) dateTime59);
        boolean boolean63 = mutableInterval48.contains((org.joda.time.ReadableInstant) dateTime59);
        mutablePeriod9.add((org.joda.time.ReadableInterval) mutableInterval48);
        mutablePeriod9.setMinutes((-2147483648));
        org.joda.time.DateTime dateTime67 = dateTime5.plus((org.joda.time.ReadablePeriod) mutablePeriod9);
        org.joda.time.DateTime dateTime68 = dateTime67.withEarlierOffsetAtOverlap();
        int int69 = dateTime67.getDayOfMonth();
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval73 = mutableInterval72.toInterval();
        org.joda.time.Chronology chronology74 = interval73.getChronology();
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(chronology74);
        org.joda.time.DateTime dateTime77 = dateTime75.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime79 = dateTime77.plus((long) (short) -1);
        org.joda.time.Chronology chronology80 = dateTime77.getChronology();
        org.joda.time.DurationField durationField81 = chronology80.weekyears();
        org.joda.time.MutableDateTime mutableDateTime82 = dateTime67.toMutableDateTime(chronology80);
        org.joda.time.Instant instant83 = mutableDateTime82.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant49 and dateTime75", (instant49.compareTo(dateTime75) == 0) == instant49.equals(dateTime75));
    }
}

