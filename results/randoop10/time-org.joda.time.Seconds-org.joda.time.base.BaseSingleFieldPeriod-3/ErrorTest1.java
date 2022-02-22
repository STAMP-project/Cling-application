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
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean7 = mutableInterval2.isBefore((org.joda.time.ReadableInterval) mutableInterval6);
        mutableInterval6.setEndMillis((long) 886);
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval6);
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekyear((int) (short) 1);
        boolean boolean19 = mutableInterval6.contains((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        boolean boolean21 = mutableInterval6.contains(readableInstant20);
        long long22 = mutableInterval6.toDurationMillis();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) '4', chronology30);
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
        boolean boolean47 = dateTime32.isAfter((org.joda.time.ReadableInstant) dateTime43);
        java.lang.String str48 = dateTime32.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType49.getRangeDurationType();
        int int51 = dateTime32.get(dateTimeFieldType49);
        boolean boolean52 = dateTime32.isBeforeNow();
        org.joda.time.DateTime dateTime53 = dateTime32.toDateTimeISO();
        boolean boolean54 = mutableInterval6.contains((org.joda.time.ReadableInstant) dateTime53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant33", (dateTime16.compareTo(instant33) == 0) == dateTime16.equals(instant33));
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
        org.joda.time.DateTime dateTime28 = property26.setCopy((int) (short) 10);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Instant instant32 = instant29.withDurationAdded(readableDuration30, 10);
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
        org.joda.time.DateTime dateTime50 = dateTime48.withWeekyear((int) (short) 100);
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) 1, periodType53, chronology58);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) '4', chronology58);
        org.joda.time.ReadablePartial readablePartial61 = null;
        org.joda.time.DateTime dateTime62 = dateTime60.withFields(readablePartial61);
        org.joda.time.DateTime.Property property63 = dateTime62.millisOfDay();
        org.joda.time.DateTime dateTime64 = dateTime62.withEarlierOffsetAtOverlap();
        int int65 = dateTime48.compareTo((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTime dateTime67 = dateTime48.withHourOfDay(12);
        boolean boolean68 = instant32.isBefore((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime.Property property70 = dateTime48.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime71 = dateTime48.toLocalDateTime();
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime();
        org.joda.time.Instant instant73 = dateTime72.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType75 = dateTimeFieldType74.getRangeDurationType();
        org.joda.time.DateTime.Property property76 = dateTime72.property(dateTimeFieldType74);
        boolean boolean77 = localDateTime71.isSupported(dateTimeFieldType74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and dateTime72", (instant29.compareTo(dateTime72) == 0) == instant29.equals(dateTime72));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
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
        org.joda.time.Instant instant23 = dateTime22.toInstant();
        org.joda.time.DateTime.Property property24 = dateTime22.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant23", (dateTime2.compareTo(instant23) == 0) == dateTime2.equals(instant23));
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
        org.joda.time.Period period15 = org.joda.time.Period.days((-1));
        org.joda.time.Period period17 = period15.withWeeks((int) 'a');
        org.joda.time.Period period19 = period15.plusMonths((int) (short) -1);
        org.joda.time.Period period21 = period15.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime22 = dateTime10.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.DateTime dateTime24 = dateTime10.plusMinutes(3600010);
        org.joda.time.Chronology chronology25 = dateTime10.getChronology();
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
        java.lang.String str43 = chronology39.toString();
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone59);
        java.util.Locale locale65 = null;
        java.lang.String str66 = dateTimeZone59.getShortName(164096150400000L, locale65);
        org.joda.time.Chronology chronology67 = chronology39.withZone(dateTimeZone59);
        boolean boolean68 = dateTime10.equals((java.lang.Object) chronology67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime44", (instant0.compareTo(dateTime44) == 0) == instant0.equals(dateTime44));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes2, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTime dateTime9 = instant7.toDateTimeISO();
        org.joda.time.Instant instant11 = instant7.plus((-5097600000L));
        org.joda.time.MutableDateTime mutableDateTime12 = instant11.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime9", (instant7.compareTo(dateTime9) == 0) == instant7.equals(dateTime9));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        org.joda.time.Duration duration8 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration9 = duration8.toDuration();
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology14.getZone();
        org.joda.time.Period period16 = duration8.toPeriod(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime7.toDateTime(chronology14);
        org.joda.time.DateTime dateTime19 = dateTime7.withMillisOfSecond(23);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.Instant instant21 = dateTime20.toInstant();
        org.joda.time.Instant instant23 = instant21.minus(0L);
        int int24 = dateTime7.compareTo((org.joda.time.ReadableInstant) instant21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant21", (dateTime5.compareTo(instant21) == 0) == dateTime5.equals(instant21));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
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
        mutableInterval9.setInterval(100L, (long) 3600010);
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
        boolean boolean62 = mutableInterval9.isBefore((org.joda.time.ReadableInstant) dateTime46);
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
        org.joda.time.Duration duration80 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime82 = dateTime74.withDurationAdded((org.joda.time.ReadableDuration) duration80, 0);
        int int83 = dateTime82.getMillisOfSecond();
        org.joda.time.Instant instant84 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration85 = null;
        org.joda.time.Instant instant87 = instant84.withDurationAdded(readableDuration85, 10);
        org.joda.time.Instant instant88 = instant87.toInstant();
        org.joda.time.ReadableDuration readableDuration89 = null;
        org.joda.time.Instant instant90 = instant88.plus(readableDuration89);
        mutableInterval9.setInterval((org.joda.time.ReadableInstant) dateTime82, (org.joda.time.ReadableInstant) instant90);
        org.joda.time.Instant instant94 = instant90.withDurationAdded(53L, (int) (short) 0);
        org.joda.time.Chronology chronology95 = instant94.getChronology();
        org.joda.time.MutableDateTime mutableDateTime96 = instant94.toMutableDateTime();
        org.joda.time.DateTime dateTime97 = instant94.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant94 and mutableDateTime96", (instant94.compareTo(mutableDateTime96) == 0) == instant94.equals(mutableDateTime96));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
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
        org.joda.time.Instant instant58 = org.joda.time.Instant.now();
        org.joda.time.Instant instant60 = instant58.withMillis((long) (-19044));
        org.joda.time.MutableDateTime mutableDateTime61 = instant60.toMutableDateTime();
        boolean boolean62 = interval41.isAfter((org.joda.time.ReadableInstant) mutableDateTime61);
        long long63 = interval41.toDurationMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant60 and mutableDateTime61", (instant60.compareTo(mutableDateTime61) == 0) == instant60.equals(mutableDateTime61));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (-19044));
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant2.plus(readableDuration3);
        org.joda.time.Instant instant5 = instant2.toInstant();
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardDays(100L);
        org.joda.time.Seconds seconds8 = duration7.toStandardSeconds();
        org.joda.time.Duration duration11 = duration7.withDurationAdded(601200000L, 12);
        org.joda.time.Duration duration12 = duration7.toDuration();
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean20 = mutableInterval15.isBefore((org.joda.time.ReadableInterval) mutableInterval19);
        long long21 = mutableInterval15.getStartMillis();
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
        org.joda.time.Chronology chronology48 = dateTime33.getChronology();
        mutableInterval15.setEnd((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Interval interval50 = duration7.toIntervalTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Instant instant51 = instant2.minus((org.joda.time.ReadableDuration) duration7);
        org.joda.time.Instant instant53 = instant2.minus((long) 27);
        org.joda.time.DateTime dateTime54 = instant53.toDateTime();
        org.joda.time.LocalDateTime localDateTime55 = dateTime54.toLocalDateTime();
        org.joda.time.Chronology chronology56 = localDateTime55.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant53 and dateTime54", (instant53.compareTo(dateTime54) == 0) == instant53.equals(dateTime54));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        int int6 = dateTime5.getSecondOfMinute();
        org.joda.time.DateTime dateTime8 = dateTime5.withWeekyear(3);
        org.joda.time.DateTime.Property property9 = dateTime8.millisOfDay();
        org.joda.time.DateTime.Property property10 = dateTime8.millisOfDay();
        int int11 = property10.getLeapAmount();
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
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        java.lang.String str29 = dateTimeFieldType28.toString();
        java.lang.String str30 = dateTimeFieldType28.toString();
        int int31 = dateTime27.get(dateTimeFieldType28);
        boolean boolean32 = property10.equals((java.lang.Object) dateTimeFieldType28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant12", (dateTime5.compareTo(instant12) == 0) == dateTime5.equals(instant12));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime8 = dateTime5.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType10 = dateTimeFieldType9.getDurationType();
        boolean boolean11 = dateTime5.isSupported(dateTimeFieldType9);
        int int12 = dateTime5.getYearOfCentury();
        org.joda.time.DateTime.Property property13 = dateTime5.dayOfWeek();
        org.joda.time.DateTime dateTime14 = dateTime5.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfSecond();
        org.joda.time.DateTime dateTime17 = dateTime14.withMillisOfSecond((int) (short) 10);
        int int18 = dateTime14.getDayOfYear();
        org.joda.time.Period period20 = org.joda.time.Period.days((-1));
        org.joda.time.Period period22 = period20.withWeeks((int) 'a');
        org.joda.time.Period period24 = period22.withDays(100);
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
        boolean boolean40 = period24.equals((java.lang.Object) property39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property39.getFieldType();
        boolean boolean42 = dateTime14.isSupported(dateTimeFieldType41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant25", (dateTime14.compareTo(instant25) == 0) == dateTime14.equals(instant25));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        java.util.Locale locale8 = null;
        int int9 = property6.getMaximumTextLength(locale8);
        java.util.Locale locale10 = null;
        java.lang.String str11 = property6.getAsShortText(locale10);
        org.joda.time.DateTime dateTime12 = property6.roundFloorCopy();
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
        org.joda.time.Instant instant27 = instant13.toInstant();
        org.joda.time.Duration duration30 = new org.joda.time.Duration(0L, (long) 3);
        org.joda.time.Duration duration33 = duration30.withDurationAdded((-100982246399976L), 21);
        java.lang.String str34 = duration30.toString();
        org.joda.time.Instant instant35 = instant13.minus((org.joda.time.ReadableDuration) duration30);
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
        org.joda.time.DateTimeField dateTimeField62 = chronology57.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField63 = chronology57.year();
        org.joda.time.DateTimeField dateTimeField64 = chronology57.era();
        org.joda.time.DateTimeZone dateTimeZone65 = chronology57.getZone();
        long long67 = dateTimeZone65.convertUTCToLocal((long) 17);
        org.joda.time.MutableDateTime mutableDateTime68 = instant35.toMutableDateTime(dateTimeZone65);
        org.joda.time.Instant instant69 = mutableDateTime68.toInstant();
        int int70 = property6.getDifference((org.joda.time.ReadableInstant) instant69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant35 and mutableDateTime68", (instant35.compareTo(mutableDateTime68) == 0) == instant35.equals(mutableDateTime68));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = dateTime14.isSupported(dateTimeFieldType17);
        int int19 = dateTime14.getSecondOfMinute();
        int int20 = dateTime14.getYearOfEra();
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
        org.joda.time.Instant instant64 = instant21.withDurationAdded((org.joda.time.ReadableDuration) duration35, 9);
        org.joda.time.Duration duration65 = duration35.toDuration();
        org.joda.time.Duration duration66 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration67 = duration66.toDuration();
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval71 = mutableInterval70.toInterval();
        org.joda.time.Chronology chronology72 = interval71.getChronology();
        org.joda.time.DateTimeZone dateTimeZone73 = chronology72.getZone();
        org.joda.time.Period period74 = duration66.toPeriod(chronology72);
        boolean boolean75 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration66);
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableDuration) duration35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant21", (dateTime0.compareTo(instant21) == 0) == dateTime0.equals(instant21));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str8 = dateTimeZone6.getName(100L);
        org.joda.time.DateTime dateTime9 = dateTime0.withZoneRetainFields(dateTimeZone6);
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded((long) 52, (int) (short) 1);
        java.util.Locale locale13 = null;
        java.util.Calendar calendar14 = dateTime9.toCalendar(locale13);
        org.joda.time.DateTime dateTime17 = dateTime9.withDurationAdded(10000L, 10);
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean28 = mutableInterval23.isBefore((org.joda.time.ReadableInterval) mutableInterval27);
        boolean boolean29 = mutableInterval20.contains((org.joda.time.ReadableInterval) mutableInterval27);
        mutableInterval20.setDurationAfterStart(0L);
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
        int int49 = dateTime48.getYearOfEra();
        org.joda.time.Chronology chronology50 = dateTime48.getChronology();
        boolean boolean51 = mutableInterval20.isAfter((org.joda.time.ReadableInstant) dateTime48);
        java.lang.String str52 = dateTime48.toString();
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 1, periodType54, chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology59.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone62 = chronology59.getZone();
        org.joda.time.DateTimeField dateTimeField63 = chronology59.minuteOfHour();
        org.joda.time.Chronology chronology64 = chronology59.withUTC();
        org.joda.time.DateTime dateTime65 = dateTime48.withChronology(chronology64);
        org.joda.time.DateTime dateTime67 = dateTime65.withHourOfDay((int) (byte) 1);
        org.joda.time.DateTime dateTime69 = dateTime65.minusMinutes(24);
        boolean boolean70 = dateTime9.isBefore((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.DateTime dateTime72 = dateTime9.minusYears(805);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and dateTime65", (dateTime37.compareTo(dateTime65) == 0) == dateTime37.equals(dateTime65));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.Duration duration2 = new org.joda.time.Duration(164096150400000L, (long) 3);
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.minutes((int) (byte) 10);
        boolean boolean5 = duration2.equals((java.lang.Object) minutes4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone7);
        int int9 = dateTime8.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime8.getZone();
        boolean boolean12 = dateTime8.isBefore(164096150400000L);
        org.joda.time.DateTime dateTime14 = dateTime8.withDayOfWeek(3);
        org.joda.time.DateTime dateTime16 = dateTime14.minusDays(1);
        org.joda.time.Instant instant17 = dateTime14.toInstant();
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutableInterval mutableInterval23 = interval21.toMutableInterval();
        org.joda.time.Interval interval25 = interval21.withEndMillis(53L);
        org.joda.time.Chronology chronology26 = interval21.getChronology();
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean37 = mutableInterval32.isBefore((org.joda.time.ReadableInterval) mutableInterval36);
        boolean boolean38 = mutableInterval29.contains((org.joda.time.ReadableInterval) mutableInterval36);
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        long long44 = interval42.toDurationMillis();
        org.joda.time.Interval interval46 = interval42.withEndMillis((long) (short) 100);
        mutableInterval36.setInterval((org.joda.time.ReadableInterval) interval42);
        boolean boolean48 = mutableInterval36.containsNow();
        boolean boolean49 = interval21.contains((org.joda.time.ReadableInterval) mutableInterval36);
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(periodType50);
        org.joda.time.Period period52 = mutableInterval36.toPeriod(periodType50);
        org.joda.time.PeriodType periodType53 = periodType50.withHoursRemoved();
        org.joda.time.Period period54 = duration2.toPeriodTo((org.joda.time.ReadableInstant) instant17, periodType50);
        org.joda.time.PeriodType periodType55 = periodType50.withMillisRemoved();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant17", (dateTime14.compareTo(instant17) == 0) == dateTime14.equals(instant17));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
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
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone17);
        int int19 = dateTime18.getMillisOfDay();
        org.joda.time.DateTime dateTime21 = dateTime18.plusMillis((int) '#');
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, periodType24, chronology29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) '4', chronology29);
        org.joda.time.DateTime dateTime32 = dateTime21.withChronology(chronology29);
        int int33 = dateTime32.getYearOfEra();
        int int34 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, periodType36, chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology41.getZone();
        org.joda.time.DateTimeField dateTimeField45 = chronology41.minuteOfHour();
        org.joda.time.DurationField durationField46 = chronology41.weekyears();
        org.joda.time.DateTime dateTime47 = dateTime32.toDateTime(chronology41);
        org.joda.time.DurationField durationField48 = chronology41.years();
        org.joda.time.Period period49 = new org.joda.time.Period((-349199000L), 1645455107277L, chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField46 and durationField48", (durationField46.compareTo(durationField48) == 0) == durationField46.equals(durationField48));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        int int6 = dateTime5.getSecondOfMinute();
        org.joda.time.DateTime dateTime8 = dateTime5.withWeekyear(3);
        org.joda.time.DateTime dateTime9 = dateTime5.toDateTimeISO();
        org.joda.time.Instant instant10 = dateTime5.toInstant();
        org.joda.time.DateTime.Property property11 = dateTime5.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant10", (dateTime5.compareTo(instant10) == 0) == dateTime5.equals(instant10));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withYearOfCentury(28);
        org.joda.time.DateTime dateTime6 = dateTime4.withMillisOfDay(56934034);
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
        org.joda.time.Days days56 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTime dateTime58 = dateTime55.plusMillis(24);
        boolean boolean60 = dateTime55.isAfter(3600000L);
        org.joda.time.DateTime.Property property61 = dateTime55.minuteOfHour();
        org.joda.time.DateTime.Property property62 = dateTime55.minuteOfDay();
        org.joda.time.DateTime.Property property63 = dateTime55.dayOfMonth();
        boolean boolean64 = dateTime4.equals((java.lang.Object) property63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant7", (dateTime1.compareTo(instant7) == 0) == dateTime1.equals(instant7));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 10);
        org.joda.time.Instant instant4 = instant3.toInstant();
        org.joda.time.DateTime dateTime5 = instant4.toDateTimeISO();
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime8 = dateTime5.withMillisOfSecond((int) (byte) 100);
        org.joda.time.DateTime.Property property9 = dateTime8.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime5", (instant0.compareTo(dateTime5) == 0) == instant0.equals(dateTime5));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getMonthOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withDayOfYear((int) '4');
        org.joda.time.LocalDateTime localDateTime4 = dateTime0.toLocalDateTime();
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.Period period7 = org.joda.time.Period.days((-1));
        org.joda.time.Period period9 = period7.withWeeks((int) 'a');
        org.joda.time.Period period11 = period7.plusMonths((int) (short) -1);
        org.joda.time.Period period13 = period7.minusDays((int) (short) 0);
        org.joda.time.Period period15 = period13.minusMonths((int) (short) -1);
        org.joda.time.Period period17 = period13.withWeeks(10);
        org.joda.time.Period period18 = period17.normalizedStandard();
        org.joda.time.Period period20 = period18.withMillis(21);
        org.joda.time.Period period22 = period18.multipliedBy(51);
        org.joda.time.Period period24 = period22.plusMinutes((-292275055));
        boolean boolean25 = localDateTime4.equals((java.lang.Object) period24);
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
        int int49 = dateTime48.getDayOfYear();
        org.joda.time.TimeOfDay timeOfDay50 = dateTime48.toTimeOfDay();
        org.joda.time.DateTime dateTime52 = dateTime48.withCenturyOfEra(31);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        mutablePeriod61.add((long) 3);
        mutablePeriod61.setYears((int) (byte) 0);
        org.joda.time.Interval interval66 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadablePeriod) mutablePeriod61);
        int int67 = mutablePeriod61.getMillis();
        mutablePeriod61.setPeriod(0L);
        org.joda.time.DurationFieldType durationFieldType70 = org.joda.time.DurationFieldType.days();
        mutablePeriod61.set(durationFieldType70, (-86400));
        org.joda.time.Period period74 = period24.withFieldAdded(durationFieldType70, 2021);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant26", (dateTime0.compareTo(instant26) == 0) == dateTime0.equals(instant26));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
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
        org.joda.time.Instant instant43 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration14, 9);
        long long44 = instant43.getMillis();
        org.joda.time.Instant instant46 = instant43.plus(36L);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(chronology51);
        int int53 = dateTime52.getSecondOfMinute();
        java.lang.String str55 = dateTime52.toString("+00:00");
        org.joda.time.DateTime dateTime57 = dateTime52.withDayOfYear(11);
        org.joda.time.DateTime.Property property58 = dateTime57.dayOfMonth();
        org.joda.time.DateTime dateTime59 = property58.getDateTime();
        org.joda.time.DateTime dateTime60 = property58.withMinimumValue();
        org.joda.time.Days days61 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) instant43, (org.joda.time.ReadableInstant) dateTime60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant43 and dateTime52", (instant43.compareTo(dateTime52) == 0) == instant43.equals(dateTime52));
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
        int int23 = dateTime22.getDayOfYear();
        org.joda.time.TimeOfDay timeOfDay24 = dateTime22.toTimeOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone26);
        int int28 = dateTime27.getDayOfMonth();
        org.joda.time.DateTime dateTime30 = dateTime27.withWeekOfWeekyear(1);
        org.joda.time.LocalTime localTime31 = dateTime30.toLocalTime();
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.years();
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadablePartial) timeOfDay24, (org.joda.time.ReadablePartial) localTime31, periodType32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone35);
        int int37 = dateTime36.getSecondOfMinute();
        org.joda.time.DateTime dateTime39 = dateTime36.withMinuteOfHour(10);
        org.joda.time.TimeOfDay timeOfDay40 = dateTime39.toTimeOfDay();
        org.joda.time.Period period41 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay24, (org.joda.time.ReadablePartial) timeOfDay40);
        org.joda.time.Instant instant42 = org.joda.time.Instant.now();
        org.joda.time.Instant instant44 = instant42.withMillis((long) (-19044));
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone46);
        int int48 = dateTime47.getDayOfMonth();
        org.joda.time.DateTime dateTime50 = dateTime47.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property51 = dateTime50.dayOfYear();
        org.joda.time.DateTime dateTime52 = property51.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime54 = property51.addWrapFieldToCopy(1);
        org.joda.time.Minutes minutes55 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) instant42, (org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime dateTime56 = timeOfDay24.toDateTime((org.joda.time.ReadableInstant) instant42);
        org.joda.time.DateTime dateTime57 = instant42.toDateTime();
        org.joda.time.DateTime dateTime58 = instant42.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime57", (instant0.compareTo(dateTime57) == 0) == instant0.equals(dateTime57));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
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
        org.joda.time.Instant instant19 = instant18.toInstant();
        org.joda.time.Instant instant20 = instant18.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant20", (dateTime15.compareTo(instant20) == 0) == dateTime15.equals(instant20));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
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
        org.joda.time.DateTime dateTime28 = interval27.getStart();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone30);
        int int32 = dateTime31.getDayOfMonth();
        org.joda.time.DateTime dateTime34 = dateTime31.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime36 = dateTime34.withYear(0);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 1, periodType39, chronology44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) '4', chronology44);
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
        boolean boolean61 = dateTime46.isAfter((org.joda.time.ReadableInstant) dateTime57);
        java.lang.String str62 = dateTime46.toString();
        boolean boolean63 = dateTime36.isAfter((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Interval interval64 = interval27.withStart((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant65 = org.joda.time.Instant.now();
        org.joda.time.Instant instant67 = instant65.withMillis((long) (-19044));
        org.joda.time.Instant instant69 = instant65.minus((long) '#');
        org.joda.time.Instant instant71 = instant69.plus(75736335600000L);
        org.joda.time.Instant instant73 = instant71.withMillis((-164096150399L));
        org.joda.time.MutableDateTime mutableDateTime74 = instant73.toMutableDateTimeISO();
        org.joda.time.Interval interval75 = interval64.withEnd((org.joda.time.ReadableInstant) instant73);
        org.joda.time.Duration duration76 = interval75.toDuration();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant73 and mutableDateTime74", (instant73.compareTo(mutableDateTime74) == 0) == instant73.equals(mutableDateTime74));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((-3891599903L));
        org.joda.time.Instant instant3 = instant1.withMillis(1645105598235L);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone6);
        int int8 = dateTime7.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime7.getZone();
        long long12 = dateTimeZone9.convertLocalToUTC(0L, true);
        org.joda.time.Hours hours13 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours14 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours15 = hours13.minus(hours14);
        org.joda.time.Duration duration16 = hours14.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone18);
        int int20 = dateTime19.getMillisOfDay();
        org.joda.time.DateTime dateTime22 = dateTime19.plusMillis((int) '#');
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) '4', chronology30);
        org.joda.time.DateTime dateTime33 = dateTime22.withChronology(chronology30);
        boolean boolean35 = dateTime33.isEqual(187200000L);
        org.joda.time.Interval interval36 = duration16.toIntervalFrom((org.joda.time.ReadableInstant) dateTime33);
        boolean boolean37 = dateTimeZone9.equals((java.lang.Object) duration16);
        java.lang.String str38 = duration16.toString();
        org.joda.time.Instant instant39 = instant1.plus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Instant instant42 = instant39.withDurationAdded((-349199976L), 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
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
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, periodType26, chronology31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) '4', chronology31);
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
        boolean boolean48 = dateTime33.isAfter((org.joda.time.ReadableInstant) dateTime44);
        java.lang.String str49 = dateTime33.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType51 = dateTimeFieldType50.getRangeDurationType();
        int int52 = dateTime33.get(dateTimeFieldType50);
        boolean boolean53 = dateTime33.isBeforeNow();
        org.joda.time.DateTime dateTime54 = dateTime33.toDateTimeISO();
        org.joda.time.Interval interval55 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration3, (org.joda.time.ReadableInstant) dateTime54);
        int int56 = dateTime54.getHourOfDay();
        org.joda.time.DateTime dateTime58 = dateTime54.minusMonths((-90));
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours(37);
        org.joda.time.MutableDateTime mutableDateTime61 = dateTime54.toMutableDateTime(dateTimeZone60);
        java.lang.String str63 = dateTimeZone60.getName(48943217737L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and mutableDateTime61", (dateTime19.compareTo(mutableDateTime61) == 0) == dateTime19.equals(mutableDateTime61));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
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
        org.joda.time.DateTime dateTime28 = interval27.getStart();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone30);
        int int32 = dateTime31.getDayOfMonth();
        org.joda.time.DateTime dateTime34 = dateTime31.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime36 = dateTime34.withYear(0);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 1, periodType39, chronology44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) '4', chronology44);
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
        boolean boolean61 = dateTime46.isAfter((org.joda.time.ReadableInstant) dateTime57);
        java.lang.String str62 = dateTime46.toString();
        boolean boolean63 = dateTime36.isAfter((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Interval interval64 = interval27.withStart((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period((java.lang.Object) interval64, periodType65);
        org.joda.time.Duration duration67 = interval64.toDuration();
        org.joda.time.Duration duration70 = new org.joda.time.Duration(0L, (long) 3);
        org.joda.time.Duration duration71 = duration70.toDuration();
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval75 = mutableInterval74.toInterval();
        org.joda.time.Chronology chronology76 = interval75.getChronology();
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime(chronology76);
        org.joda.time.DateTime dateTime79 = dateTime77.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime81 = dateTime79.plus((long) (short) -1);
        org.joda.time.Period period82 = duration71.toPeriodFrom((org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.Interval interval83 = interval64.withDurationAfterStart((org.joda.time.ReadableDuration) duration71);
        long long84 = interval83.toDurationMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant47 and dateTime77", (instant47.compareTo(dateTime77) == 0) == instant47.equals(dateTime77));
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
        org.joda.time.DateTime dateTime11 = dateTime9.withCenturyOfEra(2022);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfWeek();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 1, periodType14, chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.yearOfCentury();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(chronology19);
        org.joda.time.Instant instant23 = dateTime22.toInstant();
        org.joda.time.DateTime dateTime24 = instant23.toDateTime();
        org.joda.time.Instant instant26 = instant23.withMillis((long) 42);
        int int27 = property12.getDifference((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology28 = instant23.getChronology();
        org.joda.time.DateTime dateTime29 = instant23.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int31 = dateTime29.get(dateTimeFieldType30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant23", (dateTime22.compareTo(instant23) == 0) == dateTime22.equals(instant23));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone5 = chronology4.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone7);
        int int9 = dateTime8.getDayOfMonth();
        org.joda.time.DateTime dateTime11 = dateTime8.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime13 = dateTime11.withYear(0);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType16, chronology21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '4', chronology21);
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
        boolean boolean38 = dateTime23.isAfter((org.joda.time.ReadableInstant) dateTime34);
        java.lang.String str39 = dateTime23.toString();
        boolean boolean40 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime23);
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
        org.joda.time.DateTime dateTime56 = property55.withMaximumValue();
        org.joda.time.DateTime dateTime58 = dateTime56.withWeekyear((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone59 = dateTime56.getZone();
        int int60 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime56);
        int int61 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DurationFieldType durationFieldType62 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str63 = durationFieldType62.getName();
        org.joda.time.DateTime dateTime65 = dateTime56.withFieldAdded(durationFieldType62, 3599999);
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.Chronology chronology70 = interval69.getChronology();
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime(chronology70);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.getDefault();
        long long75 = dateTimeZone72.adjustOffset((long) 4, false);
        org.joda.time.Chronology chronology76 = chronology70.withZone(dateTimeZone72);
        org.joda.time.DateTime dateTime77 = dateTime56.withChronology(chronology70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant24 and dateTime71", (instant24.compareTo(dateTime71) == 0) == instant24.equals(dateTime71));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
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
        int int37 = dateTime16.getSecondOfDay();
        org.joda.time.Hours hours38 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property39 = dateTime16.millisOfDay();
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(chronology44);
        int int46 = dateTime45.getSecondOfMinute();
        org.joda.time.DateTime dateTime48 = dateTime45.withWeekyear(3);
        boolean boolean49 = dateTime16.isEqual((org.joda.time.ReadableInstant) dateTime48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime45", (instant6.compareTo(dateTime45) == 0) == instant6.equals(dateTime45));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
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
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardDays(100L);
        org.joda.time.Seconds seconds37 = duration36.toStandardSeconds();
        org.joda.time.Duration duration38 = seconds37.toStandardDuration();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardDays(100L);
        org.joda.time.Seconds seconds41 = duration40.toStandardSeconds();
        org.joda.time.Seconds seconds42 = seconds37.plus(seconds41);
        org.joda.time.Seconds seconds43 = seconds37.negated();
        boolean boolean44 = seconds34.isGreaterThan(seconds37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        int int3 = minutes1.get(durationFieldType2);
        int int5 = minutes1.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod6 = minutes1.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType8 = minutes1.getFieldType(0);
        org.joda.time.Duration duration9 = minutes1.toStandardDuration();
        org.joda.time.Minutes minutes11 = minutes1.multipliedBy(3);
        java.lang.String str12 = minutes1.toString();
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
        org.joda.time.DateTimeField dateTimeField30 = chronology26.hourOfHalfday();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology26);
        org.joda.time.Period period32 = new org.joda.time.Period((java.lang.Object) str12, chronology26);
        org.joda.time.DurationField durationField33 = chronology26.centuries();
        org.joda.time.DateTimeField dateTimeField34 = chronology26.millisOfDay();
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
        org.joda.time.Period period50 = org.joda.time.Period.days((-1));
        org.joda.time.Period period52 = period50.withWeeks((int) 'a');
        org.joda.time.Period period54 = period50.plusMonths((int) (short) -1);
        org.joda.time.Period period56 = period50.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime57 = dateTime45.plus((org.joda.time.ReadablePeriod) period50);
        int int58 = dateTime57.getDayOfYear();
        org.joda.time.TimeOfDay timeOfDay59 = dateTime57.toTimeOfDay();
        org.joda.time.DateTime dateTime61 = dateTime57.withCenturyOfEra(31);
        org.joda.time.DateTime.Property property62 = dateTime57.monthOfYear();
        org.joda.time.DateTime.Property property63 = dateTime57.millisOfDay();
        org.joda.time.DateTime dateTime65 = dateTime57.minusSeconds((-2147483648));
        org.joda.time.Period period67 = org.joda.time.Period.minutes(999);
        boolean boolean68 = dateTime57.equals((java.lang.Object) period67);
        org.joda.time.DurationFieldType durationFieldType69 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Period period71 = period67.withField(durationFieldType69, (int) '4');
        org.joda.time.Period period73 = period67.withSeconds((-179469));
        int[] intArray76 = chronology26.get((org.joda.time.ReadablePeriod) period73, 157766401712L, 1645426127741L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant35", (dateTime31.compareTo(instant35) == 0) == dateTime31.equals(instant35));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (-19044));
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTime();
        long long4 = instant2.getMillis();
        org.joda.time.Instant instant5 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, periodType8, chronology13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', chronology13);
        org.joda.time.ReadablePartial readablePartial16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.withFields(readablePartial16);
        boolean boolean18 = instant5.isAfter((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Period period20 = org.joda.time.Period.days((-1));
        org.joda.time.Period period22 = period20.withWeeks((int) 'a');
        org.joda.time.Period period24 = period20.plusMonths((int) (short) -1);
        org.joda.time.Period period26 = period20.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime27 = dateTime15.plus((org.joda.time.ReadablePeriod) period20);
        int int28 = dateTime27.getDayOfYear();
        org.joda.time.TimeOfDay timeOfDay29 = dateTime27.toTimeOfDay();
        org.joda.time.DateTime dateTime31 = dateTime27.withCenturyOfEra(31);
        org.joda.time.DateTime.Property property32 = dateTime27.monthOfYear();
        org.joda.time.DateTime.Property property33 = dateTime27.millisOfDay();
        org.joda.time.DateTime dateTime35 = dateTime27.minusSeconds((-2147483648));
        org.joda.time.Period period37 = org.joda.time.Period.minutes(999);
        boolean boolean38 = dateTime27.equals((java.lang.Object) period37);
        org.joda.time.DurationFieldType durationFieldType39 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Period period41 = period37.withField(durationFieldType39, (int) '4');
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) instant2, (org.joda.time.ReadablePeriod) period41);
        org.joda.time.Instant instant44 = instant2.minus((long) 22);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, periodType47, chronology52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', chronology52);
        org.joda.time.DateTime.Property property55 = dateTime54.era();
        org.joda.time.DateTime dateTime57 = dateTime54.plusHours(0);
        boolean boolean59 = dateTime54.isBefore(31186800000L);
        int int60 = instant2.compareTo((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.TimeOfDay timeOfDay61 = dateTime54.toTimeOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime3", (instant2.compareTo(mutableDateTime3) == 0) == instant2.equals(mutableDateTime3));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        int int6 = dateTime5.getSecondOfMinute();
        org.joda.time.DateTime dateTime8 = dateTime5.withWeekyear(3);
        org.joda.time.DateTime.Property property9 = dateTime8.millisOfDay();
        org.joda.time.DateTime.Property property10 = dateTime8.year();
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval17 = mutableInterval16.toInterval();
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean21 = mutableInterval16.isBefore((org.joda.time.ReadableInterval) mutableInterval20);
        boolean boolean22 = mutableInterval13.contains((org.joda.time.ReadableInterval) mutableInterval20);
        org.joda.time.MutableInterval mutableInterval23 = mutableInterval13.copy();
        org.joda.time.MutableInterval mutableInterval24 = mutableInterval23.copy();
        org.joda.time.Hours hours25 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) mutableInterval23);
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
        org.joda.time.DateTime dateTime50 = dateTime36.plusMinutes(3600010);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone52);
        int int54 = dateTime53.getMillisOfDay();
        org.joda.time.DateTime dateTime56 = dateTime53.plusMillis((int) '#');
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) 1, periodType59, chronology64);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) '4', chronology64);
        org.joda.time.DateTime dateTime67 = dateTime56.withChronology(chronology64);
        int int68 = dateTime67.getYearOfEra();
        org.joda.time.Chronology chronology69 = dateTime67.getChronology();
        org.joda.time.DateTime dateTime71 = dateTime67.minusWeeks(17);
        int int72 = dateTime36.compareTo((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTime dateTime74 = dateTime71.plusWeeks((-1));
        boolean boolean75 = mutableInterval23.isAfter((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        long long82 = dateTimeZone78.convertLocalToUTC(355200035L, false, (long) (byte) 100);
        boolean boolean84 = dateTimeZone78.isStandardOffset((long) (short) 100);
        boolean boolean86 = dateTimeZone78.isStandardOffset(600000L);
        java.lang.String str87 = dateTimeZone78.getID();
        org.joda.time.DateTime dateTime88 = dateTime71.withZoneRetainFields(dateTimeZone78);
        org.joda.time.DateTime dateTime90 = dateTime71.minusMonths(946);
        long long91 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant26", (dateTime5.compareTo(instant26) == 0) == dateTime5.equals(instant26));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period10 = org.joda.time.Period.days((-1));
        org.joda.time.Period period12 = period10.withWeeks((int) 'a');
        java.lang.String str13 = period10.toString();
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period10);
        int int15 = mutablePeriod8.getMillis();
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod8.toMutablePeriod();
        int int17 = mutablePeriod16.getSeconds();
        mutablePeriod16.setPeriod((long) 0, 4380073380691200097L);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.millis();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period33 = org.joda.time.Period.days((-1));
        org.joda.time.Period period35 = period33.withWeeks((int) 'a');
        java.lang.String str36 = period33.toString();
        mutablePeriod31.setPeriod((org.joda.time.ReadablePeriod) period33);
        mutablePeriod31.addMonths((int) (short) -1);
        org.joda.time.Period period41 = org.joda.time.Period.days((-1));
        org.joda.time.Period period43 = period41.withWeeks((int) 'a');
        org.joda.time.Period period45 = period41.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType46 = null;
        boolean boolean47 = period45.isSupported(durationFieldType46);
        mutablePeriod31.add((org.joda.time.ReadablePeriod) period45);
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval56 = mutableInterval55.toInterval();
        org.joda.time.Chronology chronology57 = interval56.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 1, periodType52, chronology57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) '4', chronology57);
        org.joda.time.DurationField durationField60 = chronology57.centuries();
        mutablePeriod31.add((long) (short) 10, chronology57);
        org.joda.time.DateTimeField dateTimeField62 = chronology57.clockhourOfDay();
        org.joda.time.DurationField durationField63 = durationFieldType22.getField(chronology57);
        org.joda.time.DurationField durationField64 = chronology57.years();
        org.joda.time.DurationField durationField65 = chronology57.halfdays();
        mutablePeriod16.add((long) 4, chronology57);
        java.lang.String str67 = chronology57.toString();
        long long71 = chronology57.add(365783040000000000L, 164095801200000L, 11);
        org.joda.time.DurationField durationField72 = chronology57.weekyears();
        org.joda.time.DateTimeField dateTimeField73 = chronology57.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField64 and durationField72", (durationField64.compareTo(durationField72) == 0) == durationField64.equals(durationField72));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        java.util.Locale locale8 = null;
        int int9 = property6.getMaximumTextLength(locale8);
        java.util.Locale locale10 = null;
        java.lang.String str11 = property6.getAsText(locale10);
        int int12 = property6.getMaximumValue();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType16, chronology21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '4', chronology21);
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
        boolean boolean38 = dateTime23.isAfter((org.joda.time.ReadableInstant) dateTime34);
        java.lang.String str39 = dateTime23.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType40.getRangeDurationType();
        int int42 = dateTime23.get(dateTimeFieldType40);
        org.joda.time.Interval interval43 = new org.joda.time.Interval(readableDuration13, (org.joda.time.ReadableInstant) dateTime23);
        int int44 = property6.getDifference((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime45 = dateTime23.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime46 = dateTime45.withLaterOffsetAtOverlap();
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
        org.joda.time.DateTime dateTime62 = property61.withMaximumValue();
        org.joda.time.DateTime dateTime64 = dateTime62.withWeekyear((int) (short) 100);
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
        int int79 = dateTime62.compareTo((org.joda.time.ReadableInstant) dateTime78);
        org.joda.time.DateTime dateTime81 = dateTime62.withHourOfDay(12);
        java.util.TimeZone timeZone83 = null;
        org.joda.time.DateTimeZone dateTimeZone84 = org.joda.time.DateTimeZone.forTimeZone(timeZone83);
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime(6216719587200001L, dateTimeZone84);
        boolean boolean86 = dateTimeZone84.isFixed();
        org.joda.time.DateTime dateTime87 = dateTime62.withZoneRetainFields(dateTimeZone84);
        org.joda.time.DateTime dateTime88 = new org.joda.time.DateTime(dateTimeZone84);
        org.joda.time.LocalDate localDate89 = dateTime88.toLocalDate();
        org.joda.time.DateTime dateTime90 = dateTime45.withFields((org.joda.time.ReadablePartial) localDate89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant24 and dateTime88", (instant24.compareTo(dateTime88) == 0) == instant24.equals(dateTime88));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval9);
        long long13 = mutableInterval9.getEndMillis();
        org.joda.time.DateTime dateTime14 = mutableInterval9.getEnd();
        int int15 = dateTime14.getMonthOfYear();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime14.withPeriodAdded(readablePeriod16, 45);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        long long25 = dateTimeZone21.convertLocalToUTC(355200035L, false, (long) (byte) 100);
        boolean boolean27 = dateTimeZone21.isStandardOffset((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.DateTimeZone dateTimeZone37 = chronology36.getZone();
        java.lang.String str39 = dateTimeZone37.getName(100L);
        org.joda.time.DateTime dateTime40 = dateTime31.withZoneRetainFields(dateTimeZone37);
        long long42 = dateTimeZone30.getMillisKeepLocal(dateTimeZone37, 6000035L);
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone30.getShortName((long) 1, locale44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(dateTimeZone30);
        int int47 = dateTimeZone21.getOffset((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime48 = dateTime18.withZone(dateTimeZone21);
        org.joda.time.Instant instant49 = dateTime18.toInstant();
        long long50 = dateTime18.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant49", (dateTime18.compareTo(instant49) == 0) == dateTime18.equals(instant49));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.joda.time.Duration duration2 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 1, periodType5, chronology10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '4', chronology10);
        org.joda.time.ReadablePartial readablePartial13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withFields(readablePartial13);
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        org.joda.time.DateTime dateTime16 = dateTime14.withEarlierOffsetAtOverlap();
        int int17 = dateTime14.getDayOfWeek();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, periodType19, chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone27 = chronology24.getZone();
        org.joda.time.DateTime dateTime28 = dateTime14.withChronology(chronology24);
        org.joda.time.Interval interval29 = duration2.toIntervalTo((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime32 = dateTime14.withDurationAdded(75736684800000L, 56);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period43 = org.joda.time.Period.days((-1));
        org.joda.time.Period period45 = period43.withWeeks((int) 'a');
        java.lang.String str46 = period43.toString();
        mutablePeriod41.setPeriod((org.joda.time.ReadablePeriod) period43);
        int int48 = mutablePeriod41.getMillis();
        org.joda.time.DurationFieldType durationFieldType50 = mutablePeriod41.getFieldType(0);
        mutablePeriod41.setDays((int) (byte) -1);
        int int53 = mutablePeriod41.getHours();
        mutablePeriod41.addDays(100);
        org.joda.time.Instant instant59 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology60 = instant59.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.yearOfEra();
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((-10L), chronology60);
        mutablePeriod41.setPeriod(0L, 164096150400000L, chronology60);
        org.joda.time.DateTimeField dateTimeField64 = chronology60.yearOfEra();
        java.lang.String str65 = chronology60.toString();
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime14.toMutableDateTime(chronology60);
        org.joda.time.Period period67 = new org.joda.time.Period(349200L, (-312742847L), chronology60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime66", (dateTime12.compareTo(mutableDateTime66) == 0) == dateTime12.equals(mutableDateTime66));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (-19044));
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTime();
        long long4 = instant2.getMillis();
        org.joda.time.Instant instant5 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, periodType8, chronology13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', chronology13);
        org.joda.time.ReadablePartial readablePartial16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.withFields(readablePartial16);
        boolean boolean18 = instant5.isAfter((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Period period20 = org.joda.time.Period.days((-1));
        org.joda.time.Period period22 = period20.withWeeks((int) 'a');
        org.joda.time.Period period24 = period20.plusMonths((int) (short) -1);
        org.joda.time.Period period26 = period20.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime27 = dateTime15.plus((org.joda.time.ReadablePeriod) period20);
        int int28 = dateTime27.getDayOfYear();
        org.joda.time.TimeOfDay timeOfDay29 = dateTime27.toTimeOfDay();
        org.joda.time.DateTime dateTime31 = dateTime27.withCenturyOfEra(31);
        org.joda.time.DateTime.Property property32 = dateTime27.monthOfYear();
        org.joda.time.DateTime.Property property33 = dateTime27.millisOfDay();
        org.joda.time.DateTime dateTime35 = dateTime27.minusSeconds((-2147483648));
        org.joda.time.Period period37 = org.joda.time.Period.minutes(999);
        boolean boolean38 = dateTime27.equals((java.lang.Object) period37);
        org.joda.time.DurationFieldType durationFieldType39 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Period period41 = period37.withField(durationFieldType39, (int) '4');
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) instant2, (org.joda.time.ReadablePeriod) period41);
        org.joda.time.Instant instant44 = instant2.minus((long) 22);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, periodType47, chronology52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', chronology52);
        org.joda.time.DateTime.Property property55 = dateTime54.era();
        org.joda.time.DateTime dateTime57 = dateTime54.plusHours(0);
        boolean boolean59 = dateTime54.isBefore(31186800000L);
        int int60 = instant2.compareTo((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Instant instant62 = instant2.minus(0L);
        org.joda.time.Chronology chronology63 = instant62.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant62 and mutableDateTime3", (instant62.compareTo(mutableDateTime3) == 0) == instant62.equals(mutableDateTime3));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
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
        org.joda.time.Period period28 = new org.joda.time.Period(0L, (long) 11, chronology27);
        org.joda.time.DurationField durationField29 = chronology27.days();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField31 = chronology27.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval39 = mutableInterval38.toInterval();
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.DateTimeZone dateTimeZone41 = chronology40.getZone();
        java.lang.String str43 = dateTimeZone41.getName(100L);
        org.joda.time.DateTime dateTime44 = dateTime35.withZoneRetainFields(dateTimeZone41);
        long long46 = dateTimeZone34.getMillisKeepLocal(dateTimeZone41, 6000035L);
        int int48 = dateTimeZone34.getOffset((long) 888);
        java.util.Locale locale50 = null;
        java.lang.String str51 = dateTimeZone34.getShortName((long) 11, locale50);
        org.joda.time.Chronology chronology52 = chronology27.withZone(dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime35", (instant12.compareTo(dateTime35) == 0) == instant12.equals(dateTime35));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
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
        int int16 = property14.get();
        org.joda.time.DateTime dateTime17 = property14.roundFloorCopy();
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
        org.joda.time.DateMidnight dateMidnight49 = dateTime48.toDateMidnight();
        org.joda.time.Hours hours51 = org.joda.time.Hours.hours((int) (byte) 100);
        org.joda.time.Hours hours53 = hours51.minus(5);
        boolean boolean54 = dateTime48.equals((java.lang.Object) 5);
        int int55 = dateTime48.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        long long59 = dateTimeZone56.adjustOffset((long) 4, false);
        java.lang.String str61 = dateTimeZone56.getName((-31535999993L));
        org.joda.time.DateTime dateTime62 = dateTime48.withZoneRetainFields(dateTimeZone56);
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 1, periodType64, chronology69);
        org.joda.time.DateTimeField dateTimeField71 = chronology69.yearOfCentury();
        org.joda.time.DateTime dateTime72 = org.joda.time.DateTime.now(chronology69);
        org.joda.time.Instant instant73 = dateTime72.toInstant();
        org.joda.time.DateTime dateTime74 = instant73.toDateTime();
        org.joda.time.Instant instant76 = instant73.withMillis((long) 42);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime62, (org.joda.time.ReadableInstant) instant73);
        org.joda.time.Seconds seconds78 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime72", (instant0.compareTo(dateTime72) == 0) == instant0.equals(dateTime72));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
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
        org.joda.time.Instant instant15 = dateTime10.toInstant();
        org.joda.time.Instant instant16 = instant15.toInstant();
        org.joda.time.Instant instant18 = instant16.withMillis((-3938307523200000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant16", (dateTime10.compareTo(instant16) == 0) == dateTime10.equals(instant16));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
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
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes((int) (short) 10);
        org.joda.time.DateTime.Property property37 = dateTime36.secondOfMinute();
        java.lang.String str38 = property37.getAsString();
        org.joda.time.DateTime dateTime39 = property37.withMaximumValue();
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
        org.joda.time.DateTime dateTime72 = dateTime70.withYear((int) (byte) 1);
        org.joda.time.Days days73 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableInstant) dateTime70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant40", (dateTime0.compareTo(instant40) == 0) == dateTime0.equals(instant40));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
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
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology28);
        int int30 = dateTime29.getSecondOfMinute();
        org.joda.time.DateTime dateTime32 = dateTime29.withWeekyear(3);
        org.joda.time.DateTime dateTime33 = dateTime29.toDateTimeISO();
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval(readableInstant23, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.MutableInterval mutableInterval35 = mutableInterval34.copy();
        java.lang.Object obj36 = mutableInterval34.clone();
        org.joda.time.Duration duration37 = new org.joda.time.Duration(obj36);
        int int38 = duration22.compareTo((org.joda.time.ReadableDuration) duration37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant21", (dateTime20.compareTo(instant21) == 0) == dateTime20.equals(instant21));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
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
        org.joda.time.Minutes minutes14 = minutes0.dividedBy(49);
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType18 = null;
        int int19 = minutes17.get(durationFieldType18);
        org.joda.time.DurationFieldType durationFieldType20 = minutes17.getFieldType();
        boolean boolean21 = minutes15.isGreaterThan(minutes17);
        org.joda.time.Minutes minutes23 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType24 = null;
        int int25 = minutes23.get(durationFieldType24);
        org.joda.time.DurationFieldType durationFieldType26 = minutes23.getFieldType();
        boolean boolean27 = minutes15.isLessThan(minutes23);
        org.joda.time.DurationFieldType durationFieldType28 = minutes15.getFieldType();
        org.joda.time.Minutes minutes30 = org.joda.time.Minutes.minutes(0);
        boolean boolean31 = minutes15.isLessThan(minutes30);
        org.joda.time.Minutes minutes33 = minutes30.dividedBy((int) 'a');
        boolean boolean34 = minutes0.isLessThan(minutes33);
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean45 = mutableInterval40.isBefore((org.joda.time.ReadableInterval) mutableInterval44);
        boolean boolean46 = mutableInterval37.contains((org.joda.time.ReadableInterval) mutableInterval44);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        long long52 = interval50.toDurationMillis();
        org.joda.time.Interval interval54 = interval50.withEndMillis((long) (short) 100);
        mutableInterval44.setInterval((org.joda.time.ReadableInterval) interval50);
        boolean boolean56 = mutableInterval44.containsNow();
        org.joda.time.PeriodType periodType57 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(periodType57);
        org.joda.time.Period period59 = mutableInterval44.toPeriod(periodType57);
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(chronology64);
        org.joda.time.DateTime dateTime67 = dateTime65.withWeekyear((int) (short) 1);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = dateTime65.toDateTime(chronology68);
        boolean boolean70 = dateTime65.isAfterNow();
        int int71 = dateTime65.getDayOfYear();
        org.joda.time.Duration duration72 = period59.toDurationTo((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval76 = mutableInterval75.toInterval();
        org.joda.time.Chronology chronology77 = interval76.getChronology();
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime(chronology77);
        org.joda.time.DateTime dateTime80 = dateTime78.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime81 = dateTime78.toDateTime();
        org.joda.time.DateTime dateTime83 = dateTime81.minusSeconds((-166));
        org.joda.time.Interval interval84 = duration72.toIntervalFrom((org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.Minutes minutes85 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval84);
        boolean boolean86 = minutes0.isLessThan(minutes85);
        org.joda.time.Minutes minutes88 = minutes85.dividedBy(730);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime65", (instant8.compareTo(dateTime65) == 0) == instant8.equals(dateTime65));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
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
        org.joda.time.DateTimeField dateTimeField26 = chronology21.weekOfWeekyear();
        org.joda.time.DurationField durationField27 = dateTimeField26.getRangeDurationField();
        boolean boolean29 = dateTimeField26.isLeap((long) 886);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = dateTimeField26.getType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period41 = org.joda.time.Period.days((-1));
        org.joda.time.Period period43 = period41.withWeeks((int) 'a');
        java.lang.String str44 = period41.toString();
        mutablePeriod39.setPeriod((org.joda.time.ReadablePeriod) period41);
        int int46 = mutablePeriod39.getMillis();
        org.joda.time.DurationFieldType durationFieldType48 = mutablePeriod39.getFieldType(0);
        mutablePeriod39.setDays((int) (byte) -1);
        int int51 = mutablePeriod39.getHours();
        mutablePeriod39.addDays(100);
        org.joda.time.Instant instant57 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology58 = instant57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.yearOfEra();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((-10L), chronology58);
        mutablePeriod39.setPeriod(0L, 164096150400000L, chronology58);
        org.joda.time.DateTimeField dateTimeField62 = chronology58.weekyearOfCentury();
        boolean boolean63 = dateTimeFieldType30.isSupported(chronology58);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.DateTimeZone dateTimeZone70 = chronology69.getZone();
        java.lang.String str72 = dateTimeZone70.getName(100L);
        org.joda.time.DateTime dateTime73 = dateTime64.withZoneRetainFields(dateTimeZone70);
        int int74 = dateTime73.getMinuteOfDay();
        int int75 = dateTime73.getEra();
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone77);
        org.joda.time.DateTime dateTime79 = dateTime78.withLaterOffsetAtOverlap();
        org.joda.time.Hours hours80 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime73, (org.joda.time.ReadableInstant) dateTime78);
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval84 = mutableInterval83.toInterval();
        org.joda.time.Chronology chronology85 = interval84.getChronology();
        org.joda.time.Interval interval86 = interval84.toInterval();
        org.joda.time.Duration duration88 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval89 = interval86.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration88);
        org.joda.time.DateTime dateTime90 = dateTime78.minus((org.joda.time.ReadableDuration) duration88);
        org.joda.time.LocalDateTime localDateTime91 = dateTime78.toLocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType92 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType93 = dateTimeFieldType92.getRangeDurationType();
        int int94 = localDateTime91.get(dateTimeFieldType92);
        int[] intArray96 = chronology58.get((org.joda.time.ReadablePartial) localDateTime91, 31556952000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant57 and dateTime64", (instant57.compareTo(dateTime64) == 0) == instant57.equals(dateTime64));
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
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) (byte) 1);
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.DateTimeZone dateTimeZone27 = chronology26.getZone();
        java.lang.String str29 = dateTimeZone27.getName(100L);
        org.joda.time.DateTime dateTime30 = dateTime21.withZoneRetainFields(dateTimeZone27);
        java.lang.String str31 = dateTimeZone27.getID();
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone27.getShortName((long) '4', locale33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((-1), 4, 9, 3, 7, dateTimeZone27);
        org.joda.time.DateTime dateTime36 = dateTime14.withZoneRetainFields(dateTimeZone27);
        boolean boolean38 = dateTime14.isBefore(2177307216000000000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime14", (instant15.compareTo(dateTime14) == 0) == instant15.equals(dateTime14));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime8 = dateTime5.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType10 = dateTimeFieldType9.getDurationType();
        boolean boolean11 = dateTime5.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        java.lang.String str13 = dateTimeFieldType12.toString();
        boolean boolean14 = dateTime5.isSupported(dateTimeFieldType12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.DateTime dateTime17 = dateTime5.withZone(dateTimeZone16);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology23 = instant22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = chronology23.yearOfEra();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 0, 315569170800001L, periodType21, chronology23);
        org.joda.time.Period period27 = new org.joda.time.Period(954000000L, chronology23);
        org.joda.time.DateTimeField dateTimeField28 = chronology23.yearOfEra();
        org.joda.time.Period period30 = org.joda.time.Period.days((-1));
        org.joda.time.Period period32 = period30.withWeeks((int) 'a');
        org.joda.time.Period period34 = period32.withDays(100);
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
        boolean boolean50 = period34.equals((java.lang.Object) property49);
        boolean boolean51 = property49.isLeap();
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
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int68 = dateTime63.get(dateTimeFieldType67);
        org.joda.time.LocalDateTime localDateTime69 = dateTime63.toLocalDateTime();
        int int70 = property49.compareTo((org.joda.time.ReadablePartial) localDateTime69);
        java.util.Locale locale72 = null;
        java.lang.String str73 = dateTimeField28.getAsShortText((org.joda.time.ReadablePartial) localDateTime69, 97, locale72);
        boolean boolean74 = dateTimeZone16.isLocalDateTimeGap(localDateTime69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime17", (dateTime5.compareTo(dateTime17) == 0) == dateTime5.equals(dateTime17));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType2);
        mutablePeriod3.addMonths(0);
        mutablePeriod3.setSeconds((int) (byte) 0);
        mutablePeriod3.add((int) '4', (int) (short) 100, 43, 17, (-19044), (-2147483648), 11, 43);
        java.lang.Object obj17 = mutablePeriod3.clone();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period28 = org.joda.time.Period.days((-1));
        org.joda.time.Period period30 = period28.withWeeks((int) 'a');
        java.lang.String str31 = period28.toString();
        mutablePeriod26.setPeriod((org.joda.time.ReadablePeriod) period28);
        int int33 = mutablePeriod26.getYears();
        mutablePeriod26.addSeconds((int) (short) 1);
        int int37 = mutablePeriod26.getValue(7);
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
        org.joda.time.Chronology chronology69 = null;
        mutablePeriod26.setPeriod((org.joda.time.ReadableDuration) duration38, chronology69);
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Duration duration73 = org.joda.time.Duration.standardSeconds((long) 53);
        org.joda.time.Instant instant74 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology75 = instant74.getChronology();
        org.joda.time.Hours hours76 = org.joda.time.Hours.EIGHT;
        int int77 = hours76.size();
        org.joda.time.PeriodType periodType78 = hours76.getPeriodType();
        org.joda.time.Period period79 = duration73.toPeriodTo((org.joda.time.ReadableInstant) instant74, periodType78);
        org.joda.time.MutableDateTime mutableDateTime80 = instant74.toMutableDateTime();
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) mutablePeriod3, (org.joda.time.ReadableInstant) instant74);
        int int82 = mutablePeriod3.getMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant74 and mutableDateTime80", (instant74.compareTo(mutableDateTime80) == 0) == instant74.equals(mutableDateTime80));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
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
        int int19 = dateTime15.getMonthOfYear();
        org.joda.time.DateTime.Property property20 = dateTime15.weekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone22);
        org.joda.time.DateTime dateTime24 = dateTime23.withLaterOffsetAtOverlap();
        org.joda.time.Duration duration25 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration26 = duration25.toDuration();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration25);
        org.joda.time.MutablePeriod mutablePeriod28 = mutablePeriod27.copy();
        org.joda.time.Period period29 = mutablePeriod27.toPeriod();
        boolean boolean30 = property20.equals((java.lang.Object) mutablePeriod27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant18", (dateTime15.compareTo(instant18) == 0) == dateTime15.equals(instant18));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
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
        org.joda.time.Interval interval34 = interval18.toInterval();
        boolean boolean36 = interval34.contains(345600097L);
        boolean boolean37 = interval34.isAfterNow();
        long long38 = interval34.toDurationMillis();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone40);
        int int42 = dateTime41.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime41.getZone();
        boolean boolean45 = dateTime41.isBefore(164096150400000L);
        org.joda.time.DateTime dateTime47 = dateTime41.withDayOfWeek(3);
        org.joda.time.Instant instant48 = new org.joda.time.Instant((java.lang.Object) dateTime47);
        org.joda.time.DateTime dateTime49 = instant48.toDateTime();
        boolean boolean50 = interval34.equals((java.lang.Object) dateTime49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and instant48", (dateTime47.compareTo(instant48) == 0) == dateTime47.equals(instant48));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.millis();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period11 = org.joda.time.Period.days((-1));
        org.joda.time.Period period13 = period11.withWeeks((int) 'a');
        java.lang.String str14 = period11.toString();
        mutablePeriod9.setPeriod((org.joda.time.ReadablePeriod) period11);
        mutablePeriod9.addMonths((int) (short) -1);
        org.joda.time.Period period19 = org.joda.time.Period.days((-1));
        org.joda.time.Period period21 = period19.withWeeks((int) 'a');
        org.joda.time.Period period23 = period19.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType24 = null;
        boolean boolean25 = period23.isSupported(durationFieldType24);
        mutablePeriod9.add((org.joda.time.ReadablePeriod) period23);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 1, periodType30, chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) '4', chronology35);
        org.joda.time.DurationField durationField38 = chronology35.centuries();
        mutablePeriod9.add((long) (short) 10, chronology35);
        org.joda.time.DateTimeField dateTimeField40 = chronology35.clockhourOfDay();
        org.joda.time.DurationField durationField41 = durationFieldType0.getField(chronology35);
        org.joda.time.DurationField durationField42 = chronology35.years();
        org.joda.time.DateTimeField dateTimeField43 = chronology35.dayOfWeek();
        int int45 = dateTimeField43.getMaximumValue((long) 56);
        org.joda.time.DurationField durationField46 = dateTimeField43.getLeapDurationField();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.Instant instant48 = dateTime47.toInstant();
        org.joda.time.TimeOfDay timeOfDay49 = dateTime47.toTimeOfDay();
        int int50 = dateTimeField43.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and instant48", (dateTime47.compareTo(instant48) == 0) == dateTime47.equals(instant48));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTime2.getZone();
        boolean boolean6 = dateTime2.isBefore(164096150400000L);
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(3);
        org.joda.time.DateTime dateTime10 = dateTime8.minusDays(1);
        org.joda.time.Instant instant11 = dateTime8.toInstant();
        org.joda.time.Duration duration14 = new org.joda.time.Duration((-3599903L), (long) (short) 1);
        org.joda.time.Instant instant16 = instant11.withDurationAdded((org.joda.time.ReadableDuration) duration14, 81);
        org.joda.time.Period period18 = org.joda.time.Period.days((-1));
        org.joda.time.Period period20 = period18.withWeeks((int) 'a');
        org.joda.time.Period period22 = period18.plusMonths((int) (short) -1);
        org.joda.time.Period period24 = period18.minusDays((int) (short) 0);
        org.joda.time.Period period26 = period24.minusMonths((int) (short) -1);
        org.joda.time.Hours hours27 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period24);
        int int28 = hours27.getHours();
        org.joda.time.Duration duration29 = hours27.toStandardDuration();
        org.joda.time.Instant instant30 = instant11.minus((org.joda.time.ReadableDuration) duration29);
        long long31 = instant30.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant11", (dateTime8.compareTo(instant11) == 0) == dateTime8.equals(instant11));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
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
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.DateTimeZone dateTimeZone30 = chronology29.getZone();
        java.lang.String str32 = dateTimeZone30.getName(100L);
        org.joda.time.DateTime dateTime33 = dateTime24.withZoneRetainFields(dateTimeZone30);
        int int34 = dateTime33.getMinuteOfDay();
        int int35 = dateTime33.getEra();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone37);
        org.joda.time.DateTime dateTime39 = dateTime38.withLaterOffsetAtOverlap();
        org.joda.time.Hours hours40 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = null;
        boolean boolean42 = dateTime38.isSupported(dateTimeFieldType41);
        boolean boolean43 = interval23.isBefore((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Instant instant44 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime45 = instant44.toMutableDateTimeISO();
        org.joda.time.Interval interval46 = interval23.withEnd((org.joda.time.ReadableInstant) instant44);
        org.joda.time.Instant instant48 = instant44.minus(1645454896915L);
        org.joda.time.Instant instant49 = instant44.toInstant();
        org.joda.time.Instant instant52 = instant49.withDurationAdded(1645455200503L, 93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant49", (dateTime24.compareTo(instant49) == 0) == dateTime24.equals(instant49));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
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
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.hourOfDay();
        int int32 = dateTimeField29.getDifference((long) 2022, (long) (-292275054));
        org.joda.time.DurationField durationField33 = dateTimeField29.getLeapDurationField();
        boolean boolean34 = duration3.equals((java.lang.Object) durationField33);
        java.lang.String str35 = duration3.toString();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime();
        org.joda.time.Instant instant37 = dateTime36.toInstant();
        org.joda.time.DateTime.Property property38 = dateTime36.minuteOfDay();
        org.joda.time.Interval interval39 = duration3.toIntervalTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Period period41 = org.joda.time.Period.days((-1));
        org.joda.time.Period period43 = period41.withWeeks((int) 'a');
        org.joda.time.Period period45 = period41.plusMonths((int) (short) -1);
        org.joda.time.Period period47 = period41.minusDays((int) (short) 0);
        int int48 = period47.getMonths();
        org.joda.time.DurationFieldType[] durationFieldTypeArray49 = period47.getFieldTypes();
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.forFields(durationFieldTypeArray49);
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.forFields(durationFieldTypeArray49);
        org.joda.time.Period period52 = interval39.toPeriod(periodType51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and instant37", (dateTime36.compareTo(instant37) == 0) == dateTime36.equals(instant37));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
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
        org.joda.time.Instant instant15 = dateTime10.toInstant();
        org.joda.time.Instant instant16 = instant15.toInstant();
        org.joda.time.DateTime dateTime17 = instant15.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant15", (dateTime10.compareTo(instant15) == 0) == dateTime10.equals(instant15));
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
        int int32 = dateTimeZone28.getOffset((-6380815651200000L));
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.Days days34 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadablePeriod) days34);
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
        org.joda.time.DateTime.Property property50 = dateTime46.dayOfWeek();
        org.joda.time.DateTime dateTime51 = property50.withMaximumValue();
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
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.DateTime dateTime84 = dateTime82.toDateTime(dateTimeZone83);
        org.joda.time.Days days85 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime84);
        int int86 = days85.size();
        org.joda.time.PeriodType periodType87 = days85.getPeriodType();
        org.joda.time.Days days89 = days85.dividedBy((int) (short) -1);
        boolean boolean90 = days34.isGreaterThan(days89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime33", (instant0.compareTo(dateTime33) == 0) == instant0.equals(dateTime33));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
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
        int int31 = dateTime30.getYearOfEra();
        int int32 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 1, periodType34, chronology39);
        org.joda.time.DateTimeField dateTimeField41 = chronology39.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone42 = chronology39.getZone();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.minuteOfHour();
        org.joda.time.DurationField durationField44 = chronology39.weekyears();
        org.joda.time.DateTime dateTime45 = dateTime30.toDateTime(chronology39);
        org.joda.time.DurationField durationField46 = chronology39.years();
        org.joda.time.DurationField durationField47 = chronology39.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField44 and durationField47", (durationField44.compareTo(durationField47) == 0) == durationField44.equals(durationField47));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getYearOfEra();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval12 = mutableInterval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, periodType8, chronology13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '4', chronology13);
        org.joda.time.ReadablePartial readablePartial16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.withFields(readablePartial16);
        org.joda.time.DateTime.Property property18 = dateTime17.millisOfDay();
        org.joda.time.DateTime dateTime19 = dateTime17.withEarlierOffsetAtOverlap();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableDuration5, (org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime22 = dateTime17.minus((long) 1);
        boolean boolean23 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime24 = dateTime3.toDateTime();
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
        boolean boolean43 = dateTime41.isEqual(187200000L);
        org.joda.time.DateTime dateTime45 = dateTime41.minusYears((-1));
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 1, periodType48, chronology53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) '4', chronology53);
        org.joda.time.ReadablePartial readablePartial56 = null;
        org.joda.time.DateTime dateTime57 = dateTime55.withFields(readablePartial56);
        org.joda.time.DateTime.Property property58 = dateTime55.millisOfDay();
        org.joda.time.DateTime dateTime59 = property58.getDateTime();
        org.joda.time.Instant instant60 = org.joda.time.Instant.now();
        org.joda.time.Instant instant62 = instant60.minus(100L);
        boolean boolean63 = dateTime59.isEqual((org.joda.time.ReadableInstant) instant60);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType65 = dateTimeFieldType64.getDurationType();
        boolean boolean66 = dateTime59.isSupported(dateTimeFieldType64);
        boolean boolean67 = dateTime41.isSupported(dateTimeFieldType64);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone69);
        int int71 = dateTime70.getDayOfMonth();
        org.joda.time.DateTime dateTime73 = dateTime70.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime75 = dateTime73.withYear(0);
        int int76 = dateTime41.compareTo((org.joda.time.ReadableInstant) dateTime73);
        java.util.GregorianCalendar gregorianCalendar77 = dateTime73.toGregorianCalendar();
        org.joda.time.Duration duration78 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant60", (dateTime24.compareTo(instant60) == 0) == dateTime24.equals(instant60));
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
        java.lang.String str25 = dateTime9.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType26.getRangeDurationType();
        int int28 = dateTime9.get(dateTimeFieldType26);
        boolean boolean29 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime30 = dateTime9.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight31 = dateTime30.toDateMidnight();
        org.joda.time.Hours hours33 = org.joda.time.Hours.hours((int) (byte) 100);
        org.joda.time.Hours hours35 = hours33.minus(5);
        boolean boolean36 = dateTime30.equals((java.lang.Object) 5);
        int int37 = dateTime30.getWeekOfWeekyear();
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(chronology43);
        org.joda.time.DateTime dateTime46 = dateTime44.withWeekyear((int) (short) 1);
        org.joda.time.Duration duration47 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval74 = duration47.toIntervalTo((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period77 = duration47.toPeriodFrom((org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.Period period78 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType79 = period78.getPeriodType();
        org.joda.time.Period period80 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableDuration) duration47, periodType79);
        org.joda.time.PeriodType periodType81 = periodType79.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((long) 26, periodType79);
        org.joda.time.Interval interval83 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadablePeriod) mutablePeriod82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime44", (instant10.compareTo(dateTime44) == 0) == instant10.equals(dateTime44));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        org.joda.time.DateTime dateTime12 = dateTime9.minusYears((int) '#');
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes(4);
        org.joda.time.DateTime dateTime16 = dateTime14.minus((-349200000L));
        org.joda.time.DateTime dateTime18 = dateTime16.plus((long) 4);
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
        org.joda.time.DateTime dateTime79 = dateTime30.minusWeeks(3600010);
        org.joda.time.DateTime.Property property80 = dateTime79.millisOfDay();
        org.joda.time.DateTime dateTime81 = property80.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone84);
        int int86 = dateTime85.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone87 = dateTime85.getZone();
        long long89 = dateTimeZone87.convertUTCToLocal((long) 0);
        java.util.TimeZone timeZone90 = dateTimeZone87.toTimeZone();
        org.joda.time.DateTime dateTime91 = new org.joda.time.DateTime(2456L, dateTimeZone87);
        org.joda.time.DateTime dateTime92 = dateTime81.withZone(dateTimeZone87);
        java.util.TimeZone timeZone93 = dateTimeZone87.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone94 = org.joda.time.DateTimeZone.forTimeZone(timeZone93);
        org.joda.time.MutableDateTime mutableDateTime95 = dateTime18.toMutableDateTime(dateTimeZone94);
        java.lang.String str97 = dateTimeZone94.getShortName(3600052L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime95", (dateTime18.compareTo(mutableDateTime95) == 0) == dateTime18.equals(mutableDateTime95));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
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
        org.joda.time.Hours hours18 = hours16.multipliedBy((-59));
        org.joda.time.Hours hours19 = org.joda.time.Hours.ONE;
        org.joda.time.Period period21 = org.joda.time.Period.days((-1));
        org.joda.time.Period period23 = period21.withWeeks((int) 'a');
        org.joda.time.Period period25 = period23.withDays(100);
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
        boolean boolean41 = period25.equals((java.lang.Object) property40);
        org.joda.time.Period period43 = period25.withWeeks(2);
        org.joda.time.Hours hours44 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Hours hours45 = hours19.minus(hours44);
        org.joda.time.Hours hours46 = hours18.minus(hours44);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone48);
        int int50 = dateTime49.getDayOfMonth();
        org.joda.time.DateTime dateTime52 = dateTime49.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime54 = dateTime52.withYear(0);
        org.joda.time.DateTime.Property property55 = dateTime54.era();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone57);
        int int59 = dateTime58.getSecondOfMinute();
        int int60 = dateTime58.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone62);
        int int64 = dateTime63.getMillisOfDay();
        org.joda.time.DateTime dateTime66 = dateTime63.plusMillis((int) '#');
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval73 = mutableInterval72.toInterval();
        org.joda.time.Chronology chronology74 = interval73.getChronology();
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((long) 1, periodType69, chronology74);
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) '4', chronology74);
        org.joda.time.DateTime dateTime77 = dateTime66.withChronology(chronology74);
        org.joda.time.MutableDateTime mutableDateTime78 = dateTime58.toMutableDateTime(chronology74);
        org.joda.time.DateTime dateTime79 = dateTime54.toDateTime(chronology74);
        org.joda.time.DateTimeField dateTimeField80 = chronology74.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = dateTimeField80.getType();
        org.joda.time.DurationFieldType durationFieldType82 = dateTimeFieldType81.getDurationType();
        int int83 = hours46.get(durationFieldType82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant26", (dateTime0.compareTo(instant26) == 0) == dateTime0.equals(instant26));
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
        org.joda.time.DateTime.Property property10 = dateTime9.era();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfWeek(2);
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
        org.joda.time.DateTime.Property property45 = dateTime43.era();
        boolean boolean46 = dateTime43.isBeforeNow();
        org.joda.time.Chronology chronology47 = dateTime43.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.weekyear();
        int int49 = dateTime11.get(dateTimeField48);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 1, periodType51, chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone59 = chronology56.getZone();
        java.lang.String str60 = dateTimeZone59.toString();
        org.joda.time.DateTime dateTime61 = dateTime11.withZone(dateTimeZone59);
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval69 = mutableInterval68.toInterval();
        org.joda.time.Chronology chronology70 = interval69.getChronology();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((long) 1, periodType65, chronology70);
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((long) '4', chronology70);
        org.joda.time.ReadablePartial readablePartial73 = null;
        org.joda.time.DateTime dateTime74 = dateTime72.withFields(readablePartial73);
        org.joda.time.DateTime.Property property75 = dateTime74.millisOfDay();
        org.joda.time.DateTime dateTime76 = dateTime74.withEarlierOffsetAtOverlap();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod(readableDuration62, (org.joda.time.ReadableInstant) dateTime74);
        org.joda.time.DateTime dateTime79 = dateTime74.minus((long) 1);
        org.joda.time.Period period80 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime61, (org.joda.time.ReadableInstant) dateTime74);
        org.joda.time.Instant instant81 = dateTime74.toInstant();
        org.joda.time.Instant instant82 = instant81.toInstant();
        org.joda.time.Instant instant83 = instant82.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant83", (dateTime9.compareTo(instant83) == 0) == dateTime9.equals(instant83));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
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
        org.joda.time.Instant instant43 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration14, 9);
        org.joda.time.Instant instant44 = instant43.toInstant();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone46);
        org.joda.time.DateTime dateTime48 = dateTime47.withLaterOffsetAtOverlap();
        org.joda.time.Duration duration49 = new org.joda.time.Duration((org.joda.time.ReadableInstant) instant44, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Minutes minutes51 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType52 = null;
        int int53 = minutes51.get(durationFieldType52);
        int int55 = minutes51.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod56 = minutes51.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType58 = minutes51.getFieldType(0);
        org.joda.time.Duration duration59 = minutes51.toStandardDuration();
        org.joda.time.Instant instant60 = instant44.minus((org.joda.time.ReadableDuration) duration59);
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval64 = mutableInterval63.toInterval();
        org.joda.time.Chronology chronology65 = interval64.getChronology();
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(chronology65);
        org.joda.time.DateTime dateTime68 = dateTime66.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime70 = dateTime68.plus((long) (short) -1);
        org.joda.time.DateTime.Property property71 = dateTime68.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval78 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval79 = mutableInterval78.toInterval();
        org.joda.time.Chronology chronology80 = interval79.getChronology();
        org.joda.time.DateTimeZone dateTimeZone81 = chronology80.getZone();
        java.lang.String str83 = dateTimeZone81.getName(100L);
        org.joda.time.DateTime dateTime84 = dateTime75.withZoneRetainFields(dateTimeZone81);
        long long86 = dateTimeZone74.getMillisKeepLocal(dateTimeZone81, 6000035L);
        org.joda.time.DateTime dateTime87 = new org.joda.time.DateTime((java.lang.Object) dateTime68, dateTimeZone74);
        org.joda.time.Period period88 = duration59.toPeriodTo((org.joda.time.ReadableInstant) dateTime87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime66", (instant0.compareTo(dateTime66) == 0) == instant0.equals(dateTime66));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
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
        java.lang.String str24 = dateTime20.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and mutableDateTime23", (instant21.compareTo(mutableDateTime23) == 0) == instant21.equals(mutableDateTime23));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
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
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTime();
        org.joda.time.Instant instant19 = instant15.withDurationAdded((-8639999948L), (-90));
        org.joda.time.Chronology chronology20 = instant19.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant15", (dateTime14.compareTo(instant15) == 0) == dateTime14.equals(instant15));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
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
        org.joda.time.Period period39 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType40 = period39.getPeriodType();
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableDuration) duration8, periodType40);
        int int42 = dateTime5.getDayOfYear();
        org.joda.time.DateTime dateTime44 = dateTime5.withMillisOfSecond(23);
        org.joda.time.DateTime dateTime46 = dateTime5.plusHours(25985);
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
        org.joda.time.Duration duration61 = org.joda.time.Duration.ZERO;
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
        org.joda.time.Interval interval88 = duration61.toIntervalTo((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.Instant instant90 = instant47.withDurationAdded((org.joda.time.ReadableDuration) duration61, 9);
        org.joda.time.Period period91 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) instant47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant47", (dateTime5.compareTo(instant47) == 0) == dateTime5.equals(instant47));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
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
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardSeconds((long) 37);
        org.joda.time.Period period18 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType19 = period18.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (-90), periodType19);
        int int21 = periodType19.size();
        org.joda.time.Period period22 = new org.joda.time.Period((-100982246399976L), periodType19);
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration15, periodType19);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.DateTimeZone dateTimeZone35 = chronology34.getZone();
        java.lang.String str37 = dateTimeZone35.getName(100L);
        org.joda.time.DateTime dateTime38 = dateTime29.withZoneRetainFields(dateTimeZone35);
        java.lang.String str39 = dateTimeZone35.getID();
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone35.getShortName((long) '4', locale41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((-1), 4, 9, 3, 7, dateTimeZone35);
        org.joda.time.DateTime dateTime45 = dateTime43.minusDays(3);
        boolean boolean46 = dateTime10.isBefore((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = dateTime45.toDateTime(chronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime29", (instant0.compareTo(dateTime29) == 0) == instant0.equals(dateTime29));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
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
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        int int22 = property15.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime.Property property23 = dateTime21.dayOfWeek();
        org.joda.time.DateTime dateTime24 = property23.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime25 = dateTime24.toDateTime();
        int int26 = dateTime24.getYear();
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
        org.joda.time.Period period42 = org.joda.time.Period.days((-1));
        org.joda.time.Period period44 = period42.withWeeks((int) 'a');
        org.joda.time.Period period46 = period42.plusMonths((int) (short) -1);
        org.joda.time.Period period48 = period42.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime49 = dateTime37.plus((org.joda.time.ReadablePeriod) period42);
        int int50 = dateTime49.getDayOfYear();
        org.joda.time.TimeOfDay timeOfDay51 = dateTime49.toTimeOfDay();
        org.joda.time.DateTime dateTime53 = dateTime49.withCenturyOfEra(31);
        org.joda.time.DateTime.Property property54 = dateTime49.monthOfYear();
        org.joda.time.DateTime.Property property55 = dateTime49.millisOfDay();
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant27", (dateTime21.compareTo(instant27) == 0) == dateTime21.equals(instant27));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
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
        org.joda.time.Instant instant43 = instant0.withDurationAdded((org.joda.time.ReadableDuration) duration14, 9);
        org.joda.time.Instant instant44 = instant43.toInstant();
        org.joda.time.MutableDateTime mutableDateTime45 = instant44.toMutableDateTimeISO();
        org.joda.time.Chronology chronology46 = instant44.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant44 and mutableDateTime45", (instant44.compareTo(mutableDateTime45) == 0) == instant44.equals(mutableDateTime45));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime8 = dateTime5.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType10 = dateTimeFieldType9.getDurationType();
        boolean boolean11 = dateTime5.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        java.lang.String str13 = dateTimeFieldType12.toString();
        boolean boolean14 = dateTime5.isSupported(dateTimeFieldType12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.DateTime dateTime17 = dateTime5.withZone(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) dateTime17);
        org.joda.time.DateTime dateTime20 = dateTime17.plusYears(3252);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime18", (dateTime5.compareTo(dateTime18) == 0) == dateTime5.equals(dateTime18));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        java.util.Locale locale7 = null;
        int int8 = property6.getMaximumTextLength(locale7);
        java.lang.String str9 = property6.getAsText();
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.Instant instant12 = instant10.withMillis((long) (-19044));
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTime();
        int int14 = property6.compareTo((org.joda.time.ReadableInstant) instant12);
        org.joda.time.DateTime dateTime15 = instant12.toDateTime();
        org.joda.time.DateTime.Property property16 = dateTime15.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime13", (instant12.compareTo(mutableDateTime13) == 0) == instant12.equals(mutableDateTime13));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((-3891599903L));
        org.joda.time.Instant instant3 = instant1.withMillis(1645105598235L);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone6);
        int int8 = dateTime7.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime7.getZone();
        long long12 = dateTimeZone9.convertLocalToUTC(0L, true);
        org.joda.time.Hours hours13 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours14 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours15 = hours13.minus(hours14);
        org.joda.time.Duration duration16 = hours14.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone18);
        int int20 = dateTime19.getMillisOfDay();
        org.joda.time.DateTime dateTime22 = dateTime19.plusMillis((int) '#');
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval29 = mutableInterval28.toInterval();
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 1, periodType25, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) '4', chronology30);
        org.joda.time.DateTime dateTime33 = dateTime22.withChronology(chronology30);
        boolean boolean35 = dateTime33.isEqual(187200000L);
        org.joda.time.Interval interval36 = duration16.toIntervalFrom((org.joda.time.ReadableInstant) dateTime33);
        boolean boolean37 = dateTimeZone9.equals((java.lang.Object) duration16);
        java.lang.String str38 = duration16.toString();
        org.joda.time.Instant instant39 = instant1.plus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Chronology chronology40 = instant39.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTime2.getZone();
        boolean boolean6 = dateTime2.isBefore(164096150400000L);
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(3);
        org.joda.time.DateTime dateTime10 = dateTime8.minusDays(1);
        org.joda.time.Instant instant11 = dateTime8.toInstant();
        org.joda.time.Duration duration14 = new org.joda.time.Duration((-3599903L), (long) (short) 1);
        org.joda.time.Instant instant16 = instant11.withDurationAdded((org.joda.time.ReadableDuration) duration14, 81);
        long long17 = instant16.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant11", (dateTime8.compareTo(instant11) == 0) == dateTime8.equals(instant11));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 10);
        org.joda.time.DateTime dateTime4 = instant3.toDateTimeISO();
        org.joda.time.DateTime dateTime6 = dateTime4.withSecondOfMinute(11);
        org.joda.time.DateTime.Property property7 = dateTime4.hourOfDay();
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period11 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType12 = period11.getPeriodType();
        org.joda.time.Period period14 = period11.withMonths((int) (byte) 0);
        org.joda.time.Period period15 = period11.toPeriod();
        org.joda.time.Period period17 = period15.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone19);
        org.joda.time.DateTime dateTime21 = dateTime20.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property22 = dateTime21.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime21.toMutableDateTimeISO();
        org.joda.time.Duration duration24 = period17.toDurationFrom((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime25 = dateTime10.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.DateTime dateTime27 = dateTime25.withHourOfDay(12);
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology32);
        int int34 = dateTime33.getSecondOfMinute();
        org.joda.time.DateTime dateTime36 = dateTime33.withWeekyear(3);
        org.joda.time.DateTime dateTime38 = dateTime33.minusWeeks(18);
        int int39 = dateTime27.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime41 = dateTime27.minusMillis((int) (short) 1);
        org.joda.time.Hours hours42 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime33", (instant0.compareTo(dateTime33) == 0) == instant0.equals(dateTime33));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
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
        org.joda.time.DateTimeField dateTimeField26 = chronology21.weekOfWeekyear();
        org.joda.time.DurationField durationField27 = dateTimeField26.getRangeDurationField();
        boolean boolean29 = dateTimeField26.isLeap((long) 886);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = dateTimeField26.getType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period41 = org.joda.time.Period.days((-1));
        org.joda.time.Period period43 = period41.withWeeks((int) 'a');
        java.lang.String str44 = period41.toString();
        mutablePeriod39.setPeriod((org.joda.time.ReadablePeriod) period41);
        int int46 = mutablePeriod39.getMillis();
        org.joda.time.DurationFieldType durationFieldType48 = mutablePeriod39.getFieldType(0);
        mutablePeriod39.setDays((int) (byte) -1);
        int int51 = mutablePeriod39.getHours();
        mutablePeriod39.addDays(100);
        org.joda.time.Instant instant57 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology58 = instant57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.yearOfEra();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((-10L), chronology58);
        mutablePeriod39.setPeriod(0L, 164096150400000L, chronology58);
        org.joda.time.DateTimeField dateTimeField62 = chronology58.weekyearOfCentury();
        boolean boolean63 = dateTimeFieldType30.isSupported(chronology58);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone66);
        int int68 = dateTime67.getMillisOfDay();
        org.joda.time.DateTime dateTime70 = dateTime67.plusMillis((int) '#');
        org.joda.time.PeriodType periodType73 = null;
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval77 = mutableInterval76.toInterval();
        org.joda.time.Chronology chronology78 = interval77.getChronology();
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((long) 1, periodType73, chronology78);
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime((long) '4', chronology78);
        org.joda.time.DateTime dateTime81 = dateTime70.withChronology(chronology78);
        java.lang.String str82 = chronology78.toString();
        org.joda.time.DurationField durationField83 = chronology78.years();
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime(367588093813200000L, chronology78);
        org.joda.time.DurationField durationField85 = chronology78.centuries();
        boolean boolean86 = dateTimeFieldType30.isSupported(chronology78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField27 and durationField83", (durationField27.compareTo(durationField83) == 0) == durationField27.equals(durationField83));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
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
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        long long25 = dateTimeZone21.convertLocalToUTC(355200035L, false, (long) (byte) 100);
        boolean boolean27 = dateTimeZone21.isStandardOffset((long) (short) 100);
        int int29 = dateTimeZone21.getOffset((long) '#');
        long long31 = dateTimeZone21.convertUTCToLocal(600000L);
        org.joda.time.DateTime dateTime32 = dateTime17.withZone(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime33.getZone();
        boolean boolean35 = dateTimeZone34.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime33", (instant0.compareTo(dateTime33) == 0) == instant0.equals(dateTime33));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime8 = dateTime5.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType10 = dateTimeFieldType9.getDurationType();
        boolean boolean11 = dateTime5.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        java.lang.String str13 = dateTimeFieldType12.toString();
        boolean boolean14 = dateTime5.isSupported(dateTimeFieldType12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.DateTime dateTime17 = dateTime5.withZone(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime19 = dateTime5.withZoneRetainFields(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime17", (dateTime5.compareTo(dateTime17) == 0) == dateTime5.equals(dateTime17));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
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
        int int23 = dateTime22.getDayOfYear();
        org.joda.time.TimeOfDay timeOfDay24 = dateTime22.toTimeOfDay();
        org.joda.time.DateTime.Property property25 = dateTime22.yearOfEra();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, periodType27, chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone35 = chronology32.getZone();
        org.joda.time.DateTimeField dateTimeField36 = chronology32.minuteOfHour();
        org.joda.time.DurationField durationField37 = chronology32.weekyears();
        org.joda.time.DurationField durationField38 = chronology32.hours();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(chronology32);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime.Property property41 = dateTime22.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime39", (instant0.compareTo(dateTime39) == 0) == instant0.equals(dateTime39));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone2);
        int int4 = dateTime3.getMillisOfDay();
        org.joda.time.DateTime dateTime6 = dateTime3.plusMillis((int) '#');
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 1, periodType9, chronology14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) '4', chronology14);
        org.joda.time.DateTime dateTime17 = dateTime6.withChronology(chronology14);
        java.lang.String str18 = chronology14.toString();
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
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone34.getShortName(164096150400000L, locale40);
        org.joda.time.Chronology chronology42 = chronology14.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField43 = chronology14.hourOfHalfday();
        boolean boolean44 = durationFieldType0.isSupported(chronology14);
        org.joda.time.Instant instant45 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Instant instant48 = instant45.withDurationAdded(readableDuration46, 10);
        org.joda.time.Instant instant49 = instant48.toInstant();
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.Instant instant51 = instant49.plus(readableDuration50);
        org.joda.time.Instant instant53 = instant51.minus(187200000L);
        org.joda.time.Chronology chronology54 = instant53.getChronology();
        org.joda.time.DateTime dateTime55 = org.joda.time.DateTime.now(chronology54);
        org.joda.time.DurationField durationField56 = durationFieldType0.getField(chronology54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant45", (dateTime19.compareTo(instant45) == 0) == dateTime19.equals(instant45));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.MutableInterval mutableInterval5 = interval3.toMutableInterval();
        org.joda.time.Interval interval7 = interval3.withEndMillis(53L);
        java.lang.String str8 = interval3.toString();
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
        org.joda.time.DateTime dateTime25 = dateTime23.minusMillis(0);
        org.joda.time.DateTime.Property property26 = dateTime25.hourOfDay();
        boolean boolean27 = interval3.equals((java.lang.Object) property26);
        org.joda.time.Period period28 = interval3.toPeriod();
        java.lang.String str29 = interval3.toString();
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        int int36 = dateTime35.getSecondOfMinute();
        org.joda.time.DateTime dateTime38 = dateTime35.withWeekyear(3);
        org.joda.time.DateTime dateTime39 = dateTime35.toDateTimeISO();
        org.joda.time.Instant instant40 = dateTime35.toInstant();
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
        org.joda.time.Minutes minutes70 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType71 = null;
        int int72 = minutes70.get(durationFieldType71);
        int int74 = minutes70.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod75 = minutes70.toMutablePeriod();
        long long78 = chronology64.add((org.joda.time.ReadablePeriod) mutablePeriod75, (long) '#', (int) (short) 10);
        org.joda.time.DurationField durationField79 = chronology64.millis();
        org.joda.time.MutableInterval mutableInterval80 = new org.joda.time.MutableInterval((long) 21, 3600L, chronology64);
        org.joda.time.Duration duration81 = mutableInterval80.toDuration();
        org.joda.time.Instant instant82 = instant40.plus((org.joda.time.ReadableDuration) duration81);
        org.joda.time.Interval interval83 = interval3.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant40", (dateTime35.compareTo(instant40) == 0) == dateTime35.equals(instant40));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
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
        int int23 = dateTime22.getDayOfYear();
        org.joda.time.TimeOfDay timeOfDay24 = dateTime22.toTimeOfDay();
        org.joda.time.DateTime dateTime26 = dateTime22.withCenturyOfEra(31);
        org.joda.time.DateTime.Property property27 = dateTime22.monthOfYear();
        org.joda.time.DateTime dateTime28 = property27.withMaximumValue();
        org.joda.time.DateTime dateTime30 = property27.addWrapFieldToCopy(21);
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
        java.lang.String str48 = chronology44.toString();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.DateTimeZone dateTimeZone55 = chronology54.getZone();
        java.lang.String str57 = dateTimeZone55.getName(100L);
        org.joda.time.DateTime dateTime58 = dateTime49.withZoneRetainFields(dateTimeZone55);
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        org.joda.time.Chronology chronology63 = interval62.getChronology();
        org.joda.time.DateTimeZone dateTimeZone64 = chronology63.getZone();
        java.lang.String str66 = dateTimeZone64.getName(100L);
        org.joda.time.DateTime dateTime67 = dateTime58.withZoneRetainFields(dateTimeZone64);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone64);
        java.util.Locale locale70 = null;
        java.lang.String str71 = dateTimeZone64.getShortName(164096150400000L, locale70);
        org.joda.time.Chronology chronology72 = chronology44.withZone(dateTimeZone64);
        org.joda.time.DateTime dateTime73 = dateTime30.withChronology(chronology44);
        int int74 = dateTime30.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime49", (instant0.compareTo(dateTime49) == 0) == instant0.equals(dateTime49));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
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
        org.joda.time.DateTime dateTime31 = dateTime29.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime33 = dateTime29.minusMonths(110);
        org.joda.time.Instant instant34 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology35 = instant34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.yearOfEra();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period47 = org.joda.time.Period.days((-1));
        org.joda.time.Period period49 = period47.withWeeks((int) 'a');
        java.lang.String str50 = period47.toString();
        mutablePeriod45.setPeriod((org.joda.time.ReadablePeriod) period47);
        int int52 = mutablePeriod45.getMillis();
        org.joda.time.DurationFieldType durationFieldType54 = mutablePeriod45.getFieldType(0);
        mutablePeriod45.setDays((int) (byte) -1);
        int int58 = mutablePeriod45.getValue(1);
        long long61 = chronology35.add((org.joda.time.ReadablePeriod) mutablePeriod45, (-3599903L), 45);
        org.joda.time.DateTimeField dateTimeField62 = chronology35.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone63 = chronology35.getZone();
        java.util.Locale locale65 = null;
        java.lang.String str66 = dateTimeZone63.getShortName(6216719587200001L, locale65);
        long long69 = dateTimeZone63.convertLocalToUTC((long) 25985, false);
        org.joda.time.DateTime dateTime70 = dateTime33.withZone(dateTimeZone63);
        long long74 = dateTimeZone63.convertLocalToUTC((long) 848, false, 1645455119243L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and dateTime70", (dateTime33.compareTo(dateTime70) == 0) == dateTime33.equals(dateTime70));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
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
        org.joda.time.Period period39 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType40 = period39.getPeriodType();
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableDuration) duration8, periodType40);
        int int42 = dateTime5.getDayOfYear();
        org.joda.time.Instant instant43 = org.joda.time.Instant.now();
        org.joda.time.Instant instant45 = instant43.minus(100L);
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
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period76 = duration46.toPeriodFrom((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.Duration duration78 = duration46.withMillis(100L);
        org.joda.time.Hours hours79 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours80 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours81 = hours79.minus(hours80);
        org.joda.time.Duration duration82 = hours80.toStandardDuration();
        org.joda.time.Duration duration83 = duration82.toDuration();
        int int84 = duration78.compareTo((org.joda.time.ReadableDuration) duration82);
        org.joda.time.Instant instant85 = instant43.plus((org.joda.time.ReadableDuration) duration78);
        org.joda.time.MutableInterval mutableInterval86 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) instant85);
        org.joda.time.DateTime dateTime87 = instant85.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant43", (dateTime5.compareTo(instant43) == 0) == dateTime5.equals(instant43));
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
        org.joda.time.MutableInterval mutableInterval12 = mutableInterval2.copy();
        org.joda.time.Duration duration13 = mutableInterval2.toDuration();
        org.joda.time.Duration duration14 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration15 = duration14.toDuration();
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology20.getZone();
        org.joda.time.Period period22 = duration14.toPeriod(chronology20);
        org.joda.time.Duration duration24 = duration13.withDurationAdded((org.joda.time.ReadableDuration) duration14, 9);
        org.joda.time.Duration duration25 = duration24.toDuration();
        org.joda.time.Duration duration26 = duration24.toDuration();
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes29 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType30 = null;
        int int31 = minutes29.get(durationFieldType30);
        org.joda.time.DurationFieldType durationFieldType32 = minutes29.getFieldType();
        boolean boolean33 = minutes27.isGreaterThan(minutes29);
        org.joda.time.Instant instant34 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes29, (org.joda.time.ReadableInstant) instant34);
        org.joda.time.DateTime dateTime36 = instant34.toDateTimeISO();
        org.joda.time.Instant instant38 = instant34.minus(352800000L);
        org.joda.time.Instant instant39 = new org.joda.time.Instant((java.lang.Object) instant34);
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
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardSeconds((long) 37);
        org.joda.time.Period period59 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType60 = period59.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) (-90), periodType60);
        int int62 = periodType60.size();
        org.joda.time.Period period63 = new org.joda.time.Period((-100982246399976L), periodType60);
        org.joda.time.Period period64 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableDuration) duration56, periodType60);
        org.joda.time.Period period65 = new org.joda.time.Period(10L, periodType60);
        org.joda.time.Period period66 = duration24.toPeriodFrom((org.joda.time.ReadableInstant) instant34, periodType60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and instant39", (dateTime36.compareTo(instant39) == 0) == dateTime36.equals(instant39));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.MutableInterval mutableInterval12 = mutableInterval2.copy();
        org.joda.time.MutableInterval mutableInterval13 = mutableInterval12.copy();
        org.joda.time.Hours hours14 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) mutableInterval12);
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
        org.joda.time.Period period30 = org.joda.time.Period.days((-1));
        org.joda.time.Period period32 = period30.withWeeks((int) 'a');
        org.joda.time.Period period34 = period30.plusMonths((int) (short) -1);
        org.joda.time.Period period36 = period30.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime37 = dateTime25.plus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.DateTime dateTime39 = dateTime25.plusMinutes(3600010);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone41);
        int int43 = dateTime42.getMillisOfDay();
        org.joda.time.DateTime dateTime45 = dateTime42.plusMillis((int) '#');
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 1, periodType48, chronology53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) '4', chronology53);
        org.joda.time.DateTime dateTime56 = dateTime45.withChronology(chronology53);
        int int57 = dateTime56.getYearOfEra();
        org.joda.time.Chronology chronology58 = dateTime56.getChronology();
        org.joda.time.DateTime dateTime60 = dateTime56.minusWeeks(17);
        int int61 = dateTime25.compareTo((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTime dateTime63 = dateTime60.plusWeeks((-1));
        boolean boolean64 = mutableInterval12.isAfter((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval71 = mutableInterval70.toInterval();
        org.joda.time.Chronology chronology72 = interval71.getChronology();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) 1, periodType67, chronology72);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((long) '4', chronology72);
        org.joda.time.ReadablePartial readablePartial75 = null;
        org.joda.time.DateTime dateTime76 = dateTime74.withFields(readablePartial75);
        org.joda.time.DateTime.Property property77 = dateTime76.millisOfDay();
        org.joda.time.DateTime dateTime79 = dateTime76.minusDays((int) (byte) 1);
        org.joda.time.DateTime.Property property80 = dateTime76.era();
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval84 = mutableInterval83.toInterval();
        org.joda.time.Chronology chronology85 = interval84.getChronology();
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime(chronology85);
        int int87 = property80.compareTo((org.joda.time.ReadableInstant) dateTime86);
        org.joda.time.DateTime dateTime88 = property80.getDateTime();
        org.joda.time.Minutes minutes89 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime60, (org.joda.time.ReadableInstant) dateTime88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime86", (instant15.compareTo(dateTime86) == 0) == instant15.equals(dateTime86));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) (short) -1);
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded((long) 100, (int) (short) 100);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.hourOfDay();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeField14.getAsShortText(3155695200000L, locale16);
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
        org.joda.time.DateTime.Property property32 = dateTime28.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone34);
        int int36 = dateTime35.getDayOfMonth();
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval42 = mutableInterval41.toInterval();
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 1, periodType38, chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone46 = chronology43.getZone();
        org.joda.time.DateTime dateTime47 = dateTime35.withZoneRetainFields(dateTimeZone46);
        org.joda.time.DateTime dateTime48 = dateTime28.withZone(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.toDateTime(dateTimeZone49);
        org.joda.time.TimeOfDay timeOfDay51 = dateTime48.toTimeOfDay();
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
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        java.lang.String str69 = dateTimeFieldType68.toString();
        java.lang.String str70 = dateTimeFieldType68.toString();
        int int71 = dateTime67.get(dateTimeFieldType68);
        boolean boolean72 = timeOfDay51.isSupported(dateTimeFieldType68);
        int int73 = timeOfDay51.size();
        int int74 = dateTimeField14.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant18", (dateTime5.compareTo(instant18) == 0) == dateTime5.equals(instant18));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 10);
        org.joda.time.Instant instant6 = instant0.withDurationAdded((-54432000000L), 3);
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.Interval interval13 = interval11.toInterval();
        org.joda.time.Duration duration15 = new org.joda.time.Duration((long) (byte) 100);
        org.joda.time.Interval interval16 = interval13.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Instant instant17 = instant6.plus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.MutableDateTime mutableDateTime18 = instant6.toMutableDateTimeISO();
        org.joda.time.Chronology chronology19 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime18", (instant6.compareTo(mutableDateTime18) == 0) == instant6.equals(mutableDateTime18));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone5 = chronology4.getZone();
        java.lang.String str7 = dateTimeZone5.getName(100L);
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime10 = dateTime8.plus((-128849018880000L));
        org.joda.time.DateTime dateTime12 = dateTime8.withCenturyOfEra(848);
        org.joda.time.DateTime dateTime14 = dateTime12.withMillisOfSecond(946);
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
        org.joda.time.DateTime dateTime47 = dateTime45.withYear((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight48 = dateTime47.toDateMidnight();
        boolean boolean49 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant15", (dateTime8.compareTo(instant15) == 0) == dateTime8.equals(instant15));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime9.millisOfDay();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime9, readableInstant13);
        org.joda.time.DateTime dateTime16 = dateTime9.withWeekOfWeekyear(29);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant20 = instant17.withDurationAdded(readableDuration18, 10);
        org.joda.time.Instant instant21 = instant20.toInstant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.DateTime.Property property23 = dateTime22.weekyear();
        org.joda.time.DateTime dateTime25 = dateTime22.withMillisOfSecond((int) (byte) 100);
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
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval58 = mutableInterval57.toInterval();
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 1, periodType54, chronology59);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) '4', chronology59);
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
        boolean boolean76 = dateTime61.isAfter((org.joda.time.ReadableInstant) dateTime72);
        java.lang.String str77 = dateTime61.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType79 = dateTimeFieldType78.getRangeDurationType();
        int int80 = dateTime61.get(dateTimeFieldType78);
        boolean boolean81 = dateTime61.isBeforeNow();
        org.joda.time.DateTime dateTime82 = dateTime61.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight83 = dateTime82.toDateMidnight();
        boolean boolean84 = dateTime37.isAfter((org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.DateTime dateTime86 = dateTime37.minusWeeks(3600010);
        org.joda.time.DateTime.Property property87 = dateTime37.dayOfWeek();
        org.joda.time.Duration duration88 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime90 = dateTime22.minus((-161827199903L));
        boolean boolean91 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and dateTime22", (instant17.compareTo(dateTime22) == 0) == instant17.equals(dateTime22));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes2, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTime dateTime9 = instant7.toDateTimeISO();
        org.joda.time.Instant instant11 = instant7.plus((-5097600000L));
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardHours(1645454798219L);
        org.joda.time.Instant instant14 = instant11.plus((org.joda.time.ReadableDuration) duration13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime9", (instant7.compareTo(dateTime9) == 0) == instant7.equals(dateTime9));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
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
        boolean boolean18 = dateTime16.isEqual(187200000L);
        org.joda.time.DateTime dateTime20 = dateTime16.minusYears((-1));
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, periodType23, chronology28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) '4', chronology28);
        org.joda.time.ReadablePartial readablePartial31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.withFields(readablePartial31);
        org.joda.time.DateTime.Property property33 = dateTime30.millisOfDay();
        org.joda.time.DateTime dateTime34 = property33.getDateTime();
        org.joda.time.Instant instant35 = org.joda.time.Instant.now();
        org.joda.time.Instant instant37 = instant35.minus(100L);
        boolean boolean38 = dateTime34.isEqual((org.joda.time.ReadableInstant) instant35);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType40 = dateTimeFieldType39.getDurationType();
        boolean boolean41 = dateTime34.isSupported(dateTimeFieldType39);
        boolean boolean42 = dateTime16.isSupported(dateTimeFieldType39);
        org.joda.time.Instant instant43 = dateTime16.toInstant();
        org.joda.time.Instant instant44 = instant43.toInstant();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.Instant instant47 = instant44.withDurationAdded(readableDuration45, 306);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant47", (dateTime5.compareTo(instant47) == 0) == dateTime5.equals(instant47));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(0, 2022, 349200000, 3600010);
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        long long11 = interval9.toDurationMillis();
        org.joda.time.Interval interval13 = interval9.withEndMillis((long) (short) 100);
        long long14 = interval9.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean25 = mutableInterval20.isBefore((org.joda.time.ReadableInterval) mutableInterval24);
        boolean boolean26 = mutableInterval17.contains((org.joda.time.ReadableInterval) mutableInterval24);
        org.joda.time.Weeks weeks27 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval24);
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutableInterval24.setDurationBeforeEnd(readableDuration28);
        org.joda.time.Interval interval30 = interval9.gap((org.joda.time.ReadableInterval) mutableInterval24);
        mutableInterval24.setDurationAfterStart(6216719587200001L);
        mutablePeriod5.setPeriod((org.joda.time.ReadableInterval) mutableInterval24);
        org.joda.time.Chronology chronology34 = mutableInterval24.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.hours();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(chronology34);
        org.joda.time.Interval interval37 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours(49);
        boolean boolean40 = dateTimeZone39.isFixed();
        org.joda.time.DateTime dateTime41 = dateTime36.withZone(dateTimeZone39);
        boolean boolean42 = dateTimeZone39.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime41", (dateTime36.compareTo(dateTime41) == 0) == dateTime36.equals(dateTime41));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval8 = mutableInterval7.toInterval();
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology9.getZone();
        java.lang.String str12 = dateTimeZone10.getName(100L);
        org.joda.time.DateTime dateTime13 = dateTime4.withZoneRetainFields(dateTimeZone10);
        long long15 = dateTimeZone3.getMillisKeepLocal(dateTimeZone10, 6000035L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.lang.String str17 = dateTimeZone3.toString();
        java.util.TimeZone timeZone18 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(97L, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withMillis(0L);
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval26 = mutableInterval25.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.MutableInterval mutableInterval28 = interval26.toMutableInterval();
        org.joda.time.Interval interval30 = interval26.withEndMillis(53L);
        org.joda.time.Chronology chronology31 = interval26.getChronology();
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval38 = mutableInterval37.toInterval();
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean42 = mutableInterval37.isBefore((org.joda.time.ReadableInterval) mutableInterval41);
        boolean boolean43 = mutableInterval34.contains((org.joda.time.ReadableInterval) mutableInterval41);
        org.joda.time.MutableInterval mutableInterval44 = mutableInterval34.copy();
        org.joda.time.Duration duration45 = mutableInterval34.toDuration();
        mutableInterval34.setStartMillis((-2209338000000L));
        org.joda.time.Chronology chronology48 = mutableInterval34.getChronology();
        boolean boolean49 = interval26.isBefore((org.joda.time.ReadableInterval) mutableInterval34);
        org.joda.time.Interval interval51 = interval26.withEndMillis((long) 3600010);
        org.joda.time.Chronology chronology52 = interval26.getChronology();
        org.joda.time.DurationField durationField53 = chronology52.minutes();
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(chronology52);
        org.joda.time.DateTime dateTime55 = dateTime22.withChronology(chronology52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime54", (dateTime4.compareTo(dateTime54) == 0) == dateTime4.equals(dateTime54));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType1 = period0.getPeriodType();
        org.joda.time.Period period3 = period0.withMonths((int) (byte) 0);
        org.joda.time.Period period4 = period0.toPeriod();
        org.joda.time.Period period6 = period4.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = dateTime9.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime10.toMutableDateTimeISO();
        org.joda.time.Duration duration13 = period6.toDurationFrom((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, periodType16, chronology21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '4', chronology21);
        org.joda.time.DateTime.Property property24 = dateTime23.era();
        org.joda.time.DateTime dateTime26 = dateTime23.minusYears((int) '#');
        org.joda.time.DateTime dateTime28 = dateTime26.minusMinutes(4);
        org.joda.time.DateTime dateTime30 = dateTime28.minus((-349200000L));
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardDays(100L);
        org.joda.time.Seconds seconds33 = duration32.toStandardSeconds();
        boolean boolean34 = dateTime28.equals((java.lang.Object) seconds33);
        int int35 = dateTime28.getWeekyear();
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration13, (org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime38 = dateTime28.withMillis((-19044L));
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        org.joda.time.Instant instant40 = dateTime39.toInstant();
        org.joda.time.TimeOfDay timeOfDay41 = dateTime39.toTimeOfDay();
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) dateTime39);
        int int43 = dateTime39.getEra();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(dateTimeZone46);
        int int48 = dateTime47.getYearOfEra();
        org.joda.time.ReadableDuration readableDuration49 = null;
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
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(readableDuration49, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTime dateTime66 = dateTime61.minus((long) 1);
        boolean boolean67 = dateTime47.isBefore((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTime dateTime68 = dateTime47.toDateTime();
        org.joda.time.Seconds seconds69 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableInstant) dateTime68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant40 and dateTime68", (instant40.compareTo(dateTime68) == 0) == instant40.equals(dateTime68));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
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
        org.joda.time.DateTimeField dateTimeField26 = chronology21.dayOfMonth();
        org.joda.time.DurationField durationField27 = chronology21.seconds();
        org.joda.time.DateTimeField dateTimeField28 = chronology21.centuryOfEra();
        org.joda.time.DurationField durationField29 = chronology21.eras();
        org.joda.time.DurationField durationField30 = chronology21.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField27 and durationField29", Math.signum(durationField27.compareTo(durationField29)) == -Math.signum(durationField29.compareTo(durationField27)));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        long long17 = interval15.toDurationMillis();
        org.joda.time.Interval interval19 = interval15.withEndMillis((long) (short) 100);
        mutableInterval9.setInterval((org.joda.time.ReadableInterval) interval15);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Instant instant26 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology27 = instant26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfEra();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.yearOfEra();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 0, 315569170800001L, periodType25, chronology27);
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) 1, (long) (byte) 100, chronology27);
        org.joda.time.ReadableInstant readableInstant32 = null;
        boolean boolean33 = mutableInterval31.isBefore(readableInstant32);
        org.joda.time.DateTime dateTime34 = mutableInterval31.getStart();
        org.joda.time.Duration duration35 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration36 = duration35.toDuration();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Duration duration39 = duration36.withDurationAdded(readableDuration37, (-1));
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableDuration) duration36);
        org.joda.time.Interval interval41 = interval15.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration36);
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval45 = mutableInterval44.toInterval();
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology46);
        org.joda.time.DateTime dateTime49 = dateTime47.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime50 = dateTime47.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType52 = dateTimeFieldType51.getDurationType();
        boolean boolean53 = dateTime47.isSupported(dateTimeFieldType51);
        int int54 = dateTime47.getYearOfCentury();
        int int55 = dateTime47.getDayOfYear();
        org.joda.time.DateTime.Property property56 = dateTime47.secondOfMinute();
        int int57 = dateTime47.getCenturyOfEra();
        org.joda.time.Period period58 = duration36.toPeriodTo((org.joda.time.ReadableInstant) dateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant26 and dateTime47", (instant26.compareTo(dateTime47) == 0) == instant26.equals(dateTime47));
    }
}

