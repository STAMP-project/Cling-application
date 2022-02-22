import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus(100L);
        org.joda.time.Instant instant4 = instant0.minus(6000035L);
        org.joda.time.Instant instant7 = instant4.withDurationAdded(100L, 23);
        org.joda.time.DateTime dateTime8 = instant4.toDateTimeISO();
        org.joda.time.DateTime dateTime9 = instant4.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime10 = instant4.toMutableDateTime();
        org.joda.time.Instant instant11 = instant4.toInstant();
        org.joda.time.MutableDateTime mutableDateTime12 = instant11.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime8", (instant11.compareTo(dateTime8) == 0) == instant11.equals(dateTime8));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus(100L);
        org.joda.time.DateTime dateTime3 = instant2.toDateTimeISO();
        org.joda.time.Hours hours5 = org.joda.time.Hours.parseHours("PT0M");
        org.joda.time.Duration duration6 = hours5.toStandardDuration();
        org.joda.time.DateTime dateTime7 = dateTime3.plus((org.joda.time.ReadableDuration) duration6);
        int int8 = dateTime7.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime7", (instant2.compareTo(dateTime7) == 0) == instant2.equals(dateTime7));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = chronology6.getZone();
        java.lang.String str9 = dateTimeZone7.getName(100L);
        org.joda.time.DateTime dateTime10 = dateTime1.withZoneRetainFields(dateTimeZone7);
        int int11 = dateTime10.getMinuteOfDay();
        org.joda.time.DateTime dateTime13 = dateTime10.withMillisOfDay((int) (short) 1);
        boolean boolean15 = dateTime13.isAfter((long) 57092493);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.DateTime dateTime19 = dateTime13.withDurationAdded((org.joda.time.ReadableDuration) duration17, 40);
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(readableInstant0, (org.joda.time.ReadableDuration) duration17);
        long long21 = mutableInterval20.getEndMillis();
        java.lang.String str22 = mutableInterval20.toString();
        org.joda.time.MutableInterval mutableInterval23 = mutableInterval20.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean34 = mutableInterval29.isBefore((org.joda.time.ReadableInterval) mutableInterval33);
        boolean boolean35 = mutableInterval26.contains((org.joda.time.ReadableInterval) mutableInterval33);
        org.joda.time.Weeks weeks36 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) mutableInterval33);
        long long37 = mutableInterval33.getEndMillis();
        org.joda.time.DateTime dateTime38 = mutableInterval33.getEnd();
        org.joda.time.format.PeriodPrinter periodPrinter39 = null;
        org.joda.time.format.PeriodParser periodParser40 = null;
        org.joda.time.format.PeriodFormatter periodFormatter41 = new org.joda.time.format.PeriodFormatter(periodPrinter39, periodParser40);
        boolean boolean42 = periodFormatter41.isParser();
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.format.PeriodFormatter periodFormatter44 = periodFormatter41.withParseType(periodType43);
        org.joda.time.Period period45 = mutableInterval33.toPeriod(periodType43);
        boolean boolean46 = mutableInterval23.overlaps((org.joda.time.ReadableInterval) mutableInterval33);
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
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType72);
        mutablePeriod73.addMonths(0);
        int int76 = mutablePeriod73.getMillis();
        org.joda.time.Period period77 = period62.withFields((org.joda.time.ReadablePeriod) mutablePeriod73);
        org.joda.time.Period period79 = period62.minusSeconds((int) (short) 1);
        org.joda.time.MutablePeriod mutablePeriod80 = period79.toMutablePeriod();
        org.joda.time.Period period82 = period79.plusWeeks(19);
        org.joda.time.Period period84 = period82.minusHours(1381);
        int int85 = period84.getDays();
        mutableInterval33.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant47", (dateTime1.compareTo(instant47) == 0) == dateTime1.equals(instant47));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime7 = dateTime2.withZone(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.DurationField durationField9 = property8.getLeapDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
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
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.DateTimeZone dateTimeZone29 = chronology28.getZone();
        java.lang.String str31 = dateTimeZone29.getName(100L);
        org.joda.time.DateTime dateTime32 = dateTime23.withZoneRetainFields(dateTimeZone29);
        long long34 = dateTimeZone22.getMillisKeepLocal(dateTimeZone29, 6000035L);
        long long36 = dateTimeZone19.getMillisKeepLocal(dateTimeZone22, (long) 19);
        boolean boolean37 = dateTime9.equals((java.lang.Object) dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime9.getZone();
        java.util.Locale locale39 = null;
        java.util.Calendar calendar40 = dateTime9.toCalendar(locale39);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime();
        org.joda.time.Instant instant42 = dateTime41.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType44 = dateTimeFieldType43.getRangeDurationType();
        org.joda.time.DateTime.Property property45 = dateTime41.property(dateTimeFieldType43);
        org.joda.time.DateTime.Property property46 = dateTime41.yearOfEra();
        org.joda.time.DateTime dateTime48 = dateTime41.minusDays(3600052);
        org.joda.time.Hours hours49 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant42", (dateTime9.compareTo(instant42) == 0) == dateTime9.equals(instant42));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getMonthOfYear();
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekyear((int) (short) 1);
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
        org.joda.time.Period period41 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType42 = period41.getPeriodType();
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableDuration) duration10, periodType42);
        org.joda.time.DateTime dateTime44 = dateTime0.plus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration47 = duration10.withDurationAdded((long) 16, (-312000));
        org.joda.time.Hours hours48 = duration47.toStandardHours();
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval55 = mutableInterval54.toInterval();
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 1, periodType51, chronology56);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) '4', chronology56);
        org.joda.time.Instant instant59 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        org.joda.time.Chronology chronology67 = interval66.getChronology();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) 1, periodType62, chronology67);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) '4', chronology67);
        org.joda.time.ReadablePartial readablePartial70 = null;
        org.joda.time.DateTime dateTime71 = dateTime69.withFields(readablePartial70);
        boolean boolean72 = instant59.isAfter((org.joda.time.ReadableInstant) dateTime69);
        boolean boolean73 = dateTime58.isAfter((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.DateTime dateTime74 = dateTime69.withEarlierOffsetAtOverlap();
        int int75 = dateTime69.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime78 = dateTime69.withField(dateTimeFieldType76, 41);
        org.joda.time.Period period79 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration47, (org.joda.time.ReadableInstant) dateTime78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant59", (dateTime0.compareTo(instant59) == 0) == dateTime0.equals(instant59));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getMonthOfYear();
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekyear((int) (short) 1);
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
        org.joda.time.Period period41 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType42 = period41.getPeriodType();
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableDuration) duration10, periodType42);
        org.joda.time.DateTime dateTime44 = dateTime0.plus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.DateTime.Property property45 = dateTime44.dayOfMonth();
        java.lang.String str46 = property45.getAsString();
        boolean boolean48 = property45.equals((java.lang.Object) 2463803697600046L);
        org.joda.time.DateTime dateTime50 = property45.addWrapFieldToCopy(0);
        org.joda.time.Hours hours52 = org.joda.time.Hours.hours(60);
        org.joda.time.MutablePeriod mutablePeriod53 = hours52.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType54 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Instant instant55 = org.joda.time.Instant.now();
        org.joda.time.Instant instant57 = instant55.minus(100L);
        org.joda.time.Chronology chronology58 = instant55.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.year();
        boolean boolean60 = durationFieldType54.isSupported(chronology58);
        java.lang.String str61 = durationFieldType54.toString();
        mutablePeriod53.set(durationFieldType54, (int) ' ');
        org.joda.time.DateTime dateTime65 = dateTime50.withFieldAdded(durationFieldType54, 2021);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime50 and instant55", (dateTime50.compareTo(instant55) == 0) == dateTime50.equals(instant55));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) instant1);
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekyear((int) (short) 1);
        org.joda.time.Duration duration12 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 1, periodType15, chronology20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', chronology20);
        org.joda.time.ReadablePartial readablePartial23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.withFields(readablePartial23);
        org.joda.time.DateTime.Property property25 = dateTime24.millisOfDay();
        org.joda.time.DateTime dateTime26 = dateTime24.withEarlierOffsetAtOverlap();
        int int27 = dateTime24.getDayOfWeek();
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone37 = chronology34.getZone();
        org.joda.time.DateTime dateTime38 = dateTime24.withChronology(chronology34);
        org.joda.time.Interval interval39 = duration12.toIntervalTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period42 = duration12.toPeriodFrom((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Period period43 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType44 = period43.getPeriodType();
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableDuration) duration12, periodType44);
        org.joda.time.Duration duration46 = duration12.toDuration();
        long long47 = duration46.getStandardDays();
        org.joda.time.Instant instant49 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration46, (int) '4');
        org.joda.time.Chronology chronology50 = instant1.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 3);
        mutablePeriod1.addMillis(0);
        org.joda.time.Instant instant4 = org.joda.time.Instant.now();
        org.joda.time.Instant instant6 = instant4.minus(100L);
        org.joda.time.DateTime dateTime7 = instant6.toDateTimeISO();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(19);
        org.joda.time.DateTime dateTime11 = dateTime7.plusMinutes(24);
        org.joda.time.Duration duration12 = mutablePeriod1.toDurationTo((org.joda.time.ReadableInstant) dateTime7);
        mutablePeriod1.setSeconds((-53));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime7", (instant6.compareTo(dateTime7) == 0) == instant6.equals(dateTime7));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
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
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime20.getZone();
        org.joda.time.DateTime.Property property24 = dateTime20.dayOfYear();
        org.joda.time.DateTime dateTime26 = dateTime20.withMillisOfSecond(100);
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
        org.joda.time.DateTime dateTime42 = property41.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property41.getFieldType();
        boolean boolean44 = dateTime20.isSupported(dateTimeFieldType43);
        org.joda.time.LocalTime localTime45 = dateTime20.toLocalTime();
        org.joda.time.DateTime dateTime46 = dateTime20.withEarlierOffsetAtOverlap();
        int int47 = dateTime46.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime46 and instant21", (dateTime46.compareTo(instant21) == 0) == dateTime46.equals(instant21));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = minutes2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = minutes2.getFieldType();
        boolean boolean6 = minutes0.isGreaterThan(minutes2);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes2, (org.joda.time.ReadableInstant) instant7);
        org.joda.time.Instant instant10 = instant7.withMillis((long) 4200010);
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekyear((int) (short) 1);
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
        org.joda.time.Period period50 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType51 = period50.getPeriodType();
        org.joda.time.Period period52 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration19, periodType51);
        org.joda.time.Duration duration53 = duration19.toDuration();
        long long54 = duration53.getStandardDays();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone56);
        org.joda.time.DateTime dateTime58 = dateTime57.withLaterOffsetAtOverlap();
        org.joda.time.Duration duration59 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration60 = duration59.toDuration();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadableDuration) duration59);
        org.joda.time.Duration duration62 = duration59.toDuration();
        org.joda.time.Duration duration63 = duration53.plus((org.joda.time.ReadableDuration) duration62);
        java.lang.String str64 = duration62.toString();
        java.lang.String str65 = duration62.toString();
        org.joda.time.Duration duration67 = duration62.withMillis((long) 4200010);
        org.joda.time.Period period68 = duration62.toPeriod();
        org.joda.time.Duration duration70 = org.joda.time.Duration.standardSeconds((long) 952);
        int int71 = duration62.compareTo((org.joda.time.ReadableDuration) duration70);
        org.joda.time.Minutes minutes72 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes74 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType75 = null;
        int int76 = minutes74.get(durationFieldType75);
        int int78 = minutes74.getValue(0);
        org.joda.time.MutablePeriod mutablePeriod79 = minutes74.toMutablePeriod();
        boolean boolean80 = minutes72.isLessThan(minutes74);
        org.joda.time.Duration duration81 = minutes74.toStandardDuration();
        org.joda.time.Duration duration82 = duration81.toDuration();
        org.joda.time.Duration duration83 = duration62.minus((org.joda.time.ReadableDuration) duration81);
        org.joda.time.Instant instant85 = instant10.withDurationAdded((org.joda.time.ReadableDuration) duration81, (-96));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime16", (instant7.compareTo(dateTime16) == 0) == instant7.equals(dateTime16));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 35, (long) 1500);
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval7 = mutableInterval6.toInterval();
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = chronology8.getZone();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        mutablePeriod2.setPeriod((-86399936L), chronology8);
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DurationField durationField13 = chronology8.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField12", (durationField10.compareTo(durationField12) == 0) == durationField10.equals(durationField12));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.joda.time.Days days1 = org.joda.time.Days.TWO;
        org.joda.time.Days days3 = days1.multipliedBy(0);
        org.joda.time.Period period5 = org.joda.time.Period.days((-1));
        org.joda.time.Period period7 = period5.withWeeks((int) 'a');
        org.joda.time.Period period9 = period5.plusMonths((int) (short) -1);
        org.joda.time.Period period11 = period5.minusDays((int) (short) 0);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Days days13 = org.joda.time.Days.ONE;
        boolean boolean14 = days12.isLessThan(days13);
        org.joda.time.Days days16 = days13.plus(0);
        org.joda.time.Days days17 = days1.minus(days13);
        org.joda.time.Days days19 = org.joda.time.Days.days(20);
        org.joda.time.Days days20 = days13.plus(days19);
        org.joda.time.Days days21 = days19.negated();
        org.joda.time.Period period26 = new org.joda.time.Period(3600, (-292275054), 35, 5);
        org.joda.time.Days days27 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period26);
        org.joda.time.PeriodType periodType28 = days27.getPeriodType();
        java.lang.String str29 = days27.toString();
        org.joda.time.Days days30 = org.joda.time.Days.ONE;
        int int31 = days30.getDays();
        int int32 = days30.size();
        org.joda.time.Days days34 = days30.dividedBy((int) (short) -1);
        org.joda.time.Days days35 = org.joda.time.Days.ONE;
        int int36 = days35.getDays();
        int int37 = days35.size();
        org.joda.time.Days days39 = days35.dividedBy((int) (short) -1);
        boolean boolean40 = days34.isGreaterThan(days39);
        org.joda.time.Days days42 = days39.multipliedBy((-30));
        org.joda.time.Days days44 = days39.multipliedBy((-44));
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
        org.joda.time.Chronology chronology70 = dateTime54.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.secondOfDay();
        org.joda.time.DateTimeField dateTimeField72 = chronology70.year();
        boolean boolean73 = days44.equals((java.lang.Object) dateTimeField72);
        int int74 = days44.getDays();
        org.joda.time.Days days75 = days27.plus(days44);
        org.joda.time.Days days76 = days21.minus(days27);
        org.joda.time.PeriodType periodType77 = days76.getPeriodType();
        org.joda.time.Instant instant79 = new org.joda.time.Instant(3155695200000L);
        org.joda.time.DateTime dateTime80 = instant79.toDateTime();
        org.joda.time.Chronology chronology81 = instant79.getChronology();
        org.joda.time.Period period82 = new org.joda.time.Period(1645455582349L, periodType77, chronology81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant79 and dateTime80", (instant79.compareTo(dateTime80) == 0) == instant79.equals(dateTime80));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus(100L);
        org.joda.time.DateTime dateTime3 = instant2.toDateTimeISO();
        org.joda.time.DateTime dateTime5 = dateTime3.withMillis((long) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime3", (instant2.compareTo(dateTime3) == 0) == instant2.equals(dateTime3));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Instant instant2 = dateTime1.toInstant();
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
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableDuration) duration3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant2", (dateTime1.compareTo(instant2) == 0) == dateTime1.equals(instant2));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone3);
        int int5 = dateTime4.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime4.getZone();
        long long8 = dateTimeZone6.convertUTCToLocal((long) 0);
        boolean boolean10 = dateTimeZone6.equals((java.lang.Object) 1.0f);
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) '#', 349200000L, dateTimeZone6);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 1, periodType14, chronology19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) '4', chronology19);
        org.joda.time.ReadablePartial readablePartial22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.withFields(readablePartial22);
        org.joda.time.DateTime.Property property24 = dateTime21.millisOfDay();
        org.joda.time.DateTime dateTime25 = property24.roundCeilingCopy();
        org.joda.time.Instant instant26 = dateTime25.toInstant();
        org.joda.time.Interval interval27 = interval11.withEnd((org.joda.time.ReadableInstant) instant26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone29);
        int int31 = dateTime30.getDayOfMonth();
        org.joda.time.DateTime dateTime33 = dateTime30.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property34 = dateTime33.dayOfYear();
        org.joda.time.DateTime dateTime35 = property34.roundFloorCopy();
        boolean boolean36 = instant26.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardHours((long) 7);
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
        org.joda.time.DateTime dateTime66 = dateTime64.minusMinutes(56);
        org.joda.time.Interval interval67 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration38, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Duration duration70 = duration38.withDurationAdded((long) 1500, 33);
        org.joda.time.Instant instant72 = instant26.withDurationAdded((org.joda.time.ReadableDuration) duration70, (-4));
        org.joda.time.MutableDateTime mutableDateTime73 = instant72.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant26", (dateTime21.compareTo(instant26) == 0) == dateTime21.equals(instant26));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
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
        org.joda.time.DateTime dateTime16 = dateTime10.plusDays((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone18);
        int int20 = dateTime19.getSecondOfMinute();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(6216719587200001L, dateTimeZone23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime19.toDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime27 = dateTime10.toDateTime(dateTimeZone23);
        org.joda.time.Period period31 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType32 = period31.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType32);
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology38.getZone();
        org.joda.time.Period period40 = new org.joda.time.Period(10L, periodType32, chronology38);
        org.joda.time.DateTimeField dateTimeField41 = chronology38.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField42 = chronology38.millisOfSecond();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((java.lang.Object) dateTime27, chronology38);
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
        boolean boolean64 = dateTime62.isBefore((long) 1970);
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval68 = mutableInterval67.toInterval();
        org.joda.time.Chronology chronology69 = interval68.getChronology();
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(chronology69);
        org.joda.time.DateTime dateTime72 = dateTime70.withWeekyear((int) (short) 1);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTime dateTime74 = dateTime70.toDateTime(chronology73);
        int int75 = dateTime62.compareTo((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.Days days76 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime77 = dateTime70.minus((org.joda.time.ReadablePeriod) days76);
        org.joda.time.DateTime dateTime79 = dateTime77.withWeekyear(1);
        org.joda.time.PeriodType periodType80 = org.joda.time.PeriodType.dayTime();
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime77, periodType80);
        org.joda.time.DateTime dateTime83 = dateTime77.plusMonths(2721);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime44", (instant0.compareTo(dateTime44) == 0) == instant0.equals(dateTime44));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period12 = org.joda.time.Period.days((-1));
        org.joda.time.Period period14 = period12.withWeeks((int) 'a');
        java.lang.String str15 = period12.toString();
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) period12);
        int int17 = mutablePeriod10.getMillis();
        org.joda.time.MutablePeriod mutablePeriod18 = mutablePeriod10.toMutablePeriod();
        mutablePeriod10.setMillis((int) (byte) 10);
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        long long26 = interval24.toDurationMillis();
        org.joda.time.Interval interval28 = interval24.withEndMillis((long) (short) 100);
        long long29 = interval24.toDurationMillis();
        mutablePeriod10.setPeriod((org.joda.time.ReadableInterval) interval24);
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        mutablePeriod10.setPeriod((long) 55, (long) (-8), chronology37);
        org.joda.time.DurationField durationField39 = chronology37.years();
        org.joda.time.DurationField durationField40 = chronology37.eras();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 898, 315569170800000L, chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField39 and durationField40", Math.signum(durationField39.compareTo(durationField40)) == -Math.signum(durationField40.compareTo(durationField39)));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Instant instant3 = instant1.minus(0L);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, periodType7, chronology12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '4', chronology12);
        org.joda.time.ReadablePartial readablePartial15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.withFields(readablePartial15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        int int18 = dateTime14.get(dateTimeFieldType17);
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
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone35);
        int int37 = dateTime36.getDayOfMonth();
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval43 = mutableInterval42.toInterval();
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 1, periodType39, chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone47 = chronology44.getZone();
        org.joda.time.DateTime dateTime48 = dateTime36.withZoneRetainFields(dateTimeZone47);
        org.joda.time.DateTime dateTime49 = dateTime29.withZone(dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = dateTime49.toDateTime(dateTimeZone50);
        org.joda.time.Chronology chronology52 = dateTime51.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = chronology52.era();
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType17.getField(chronology52);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((-3600002L), chronology52);
        boolean boolean56 = instant3.isAfter((org.joda.time.ReadableInstant) dateTime55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant3", (dateTime0.compareTo(instant3) == 0) == dateTime0.equals(instant3));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
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
        org.joda.time.DurationField durationField32 = chronology31.weeks();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(6216719587200001L, chronology31);
        long long36 = chronology4.add((org.joda.time.ReadablePeriod) mutablePeriod33, (long) (byte) 1, 12);
        mutablePeriod33.addYears(2021);
        mutablePeriod33.setMillis(457071);
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
        int int59 = dateTime58.getYearOfEra();
        org.joda.time.Chronology chronology60 = dateTime58.getChronology();
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(chronology60);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) (-2), chronology60);
        org.joda.time.DateTime dateTime64 = dateTime62.minus((-349199941L));
        org.joda.time.Minutes minutes65 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes67 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType68 = null;
        int int69 = minutes67.get(durationFieldType68);
        org.joda.time.DurationFieldType durationFieldType70 = minutes67.getFieldType();
        boolean boolean71 = minutes65.isGreaterThan(minutes67);
        org.joda.time.Instant instant72 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes67, (org.joda.time.ReadableInstant) instant72);
        org.joda.time.Duration duration74 = mutableInterval73.toDuration();
        org.joda.time.DateTime dateTime75 = mutableInterval73.getEnd();
        org.joda.time.Instant instant76 = org.joda.time.Instant.now();
        org.joda.time.Instant instant78 = instant76.minus(100L);
        org.joda.time.Instant instant80 = instant76.minus(6000035L);
        org.joda.time.Instant instant82 = instant80.withMillis((long) 2022);
        boolean boolean83 = mutableInterval73.isBefore((org.joda.time.ReadableInstant) instant82);
        org.joda.time.Instant instant86 = instant82.withDurationAdded(44L, 53849307);
        mutablePeriod33.setPeriod((org.joda.time.ReadableInstant) dateTime64, (org.joda.time.ReadableInstant) instant82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime61", (instant16.compareTo(dateTime61) == 0) == instant16.equals(dateTime61));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
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
        boolean boolean20 = dateTime18.isBefore((long) 1970);
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime26.withWeekyear((int) (short) 1);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.toDateTime(chronology29);
        int int31 = dateTime18.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Days days32 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime33 = dateTime26.minus((org.joda.time.ReadablePeriod) days32);
        org.joda.time.DateTime dateTime35 = dateTime26.plus(0L);
        org.joda.time.Days days36 = org.joda.time.Days.ONE;
        int int37 = days36.getDays();
        int int38 = days36.size();
        org.joda.time.Days days40 = days36.dividedBy((int) (short) -1);
        org.joda.time.Days days41 = days36.negated();
        org.joda.time.Days days42 = org.joda.time.Days.ONE;
        int int43 = days42.getDays();
        int int44 = days42.size();
        org.joda.time.Days days46 = days42.dividedBy((int) (short) -1);
        org.joda.time.Days days47 = org.joda.time.Days.ONE;
        int int48 = days47.getDays();
        int int49 = days47.size();
        org.joda.time.Days days51 = days47.dividedBy((int) (short) -1);
        boolean boolean52 = days46.isGreaterThan(days51);
        org.joda.time.Days days54 = days51.multipliedBy((-30));
        org.joda.time.Days days56 = days51.multipliedBy((-44));
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval63 = mutableInterval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) 1, periodType59, chronology64);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) '4', chronology64);
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
        boolean boolean81 = dateTime66.isAfter((org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.Chronology chronology82 = dateTime66.getChronology();
        org.joda.time.DateTimeField dateTimeField83 = chronology82.secondOfDay();
        org.joda.time.DateTimeField dateTimeField84 = chronology82.year();
        boolean boolean85 = days56.equals((java.lang.Object) dateTimeField84);
        org.joda.time.Days days86 = days36.minus(days56);
        org.joda.time.Interval interval87 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadablePeriod) days36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant67", (dateTime0.compareTo(instant67) == 0) == dateTime0.equals(instant67));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 1970);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period12 = org.joda.time.Period.days((-1));
        org.joda.time.Period period14 = period12.withWeeks((int) 'a');
        java.lang.String str15 = period12.toString();
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) period12);
        int int17 = mutablePeriod10.getMillis();
        org.joda.time.DurationFieldType durationFieldType19 = mutablePeriod10.getFieldType(0);
        mutablePeriod10.setDays((int) (byte) -1);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.Instant instant23 = dateTime22.toInstant();
        org.joda.time.Duration duration24 = mutablePeriod10.toDurationFrom((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Period period25 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime22);
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
        org.joda.time.DateTime.Property property42 = dateTime41.era();
        boolean boolean43 = dateTime28.isBefore((org.joda.time.ReadableInstant) dateTime41);
        boolean boolean44 = dateTime22.isAfter((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime46 = dateTime41.plusHours(45);
        boolean boolean48 = dateTime46.isBefore(2177271964803600L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant23", (dateTime22.compareTo(instant23) == 0) == dateTime22.equals(instant23));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, periodType1, chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.halfdayOfDay();
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
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone29);
        int int31 = dateTime30.getDayOfMonth();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 1, periodType33, chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone41 = chronology38.getZone();
        org.joda.time.DateTime dateTime42 = dateTime30.withZoneRetainFields(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = dateTime23.withZone(dateTimeZone41);
        int int44 = dateTime23.getSecondOfDay();
        org.joda.time.LocalDate localDate45 = dateTime23.toLocalDate();
        org.joda.time.Instant instant46 = org.joda.time.Instant.now();
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 1, periodType49, chronology54);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) '4', chronology54);
        org.joda.time.ReadablePartial readablePartial57 = null;
        org.joda.time.DateTime dateTime58 = dateTime56.withFields(readablePartial57);
        boolean boolean59 = instant46.isAfter((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Period period61 = org.joda.time.Period.days((-1));
        org.joda.time.Period period63 = period61.withWeeks((int) 'a');
        org.joda.time.Period period65 = period61.plusMonths((int) (short) -1);
        org.joda.time.Period period67 = period61.minusDays((int) (short) 0);
        org.joda.time.DateTime dateTime68 = dateTime56.plus((org.joda.time.ReadablePeriod) period61);
        boolean boolean69 = localDate45.equals((java.lang.Object) dateTime68);
        int[] intArray70 = null;
        int int71 = dateTimeField12.getMinimumValue((org.joda.time.ReadablePartial) localDate45, intArray70);
        org.joda.time.Chronology chronology72 = localDate45.getChronology();
        org.joda.time.DurationField durationField73 = chronology72.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField73, and durationField10", !(durationField10.compareTo(durationField73) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField73.compareTo(durationField10))));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType2.getRangeDurationType();
        org.joda.time.DateTime.Property property4 = dateTime0.property(dateTimeFieldType2);
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType10 = null;
        int int11 = minutes9.get(durationFieldType10);
        org.joda.time.DurationFieldType durationFieldType12 = minutes9.getFieldType();
        boolean boolean13 = minutes7.isGreaterThan(minutes9);
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) minutes9, (org.joda.time.ReadableInstant) instant14);
        org.joda.time.Chronology chronology16 = instant14.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone17.getName(164096150400000L, locale19);
        org.joda.time.Chronology chronology21 = chronology16.withZone(dateTimeZone17);
        org.joda.time.Interval interval22 = new org.joda.time.Interval(0L, (long) 891, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType2.getField(chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.Instant instant3 = instant0.withMillis(52L);
        org.joda.time.Instant instant6 = instant3.withDurationAdded(1645455083127L, 2022);
        org.joda.time.Instant instant8 = instant3.withMillis(31535999999L);
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Period period12 = mutableInterval11.toPeriod();
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableInterval11.setDurationBeforeEnd(readableDuration13);
        org.joda.time.Duration duration15 = mutableInterval11.toDuration();
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant3, (org.joda.time.ReadableDuration) duration15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour(0);
        org.joda.time.DateTime dateTime21 = dateTime17.minusHours(3600);
        org.joda.time.DateTime.Property property22 = dateTime17.era();
        org.joda.time.DateTime dateTime24 = dateTime17.minusMonths((-288));
        org.joda.time.Period period25 = duration15.toPeriodTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Duration duration26 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, periodType29, chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', chronology34);
        org.joda.time.ReadablePartial readablePartial37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withFields(readablePartial37);
        org.joda.time.DateTime.Property property39 = dateTime38.millisOfDay();
        org.joda.time.DateTime dateTime40 = dateTime38.withEarlierOffsetAtOverlap();
        int int41 = dateTime38.getDayOfWeek();
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 1, periodType43, chronology48);
        org.joda.time.DateTimeField dateTimeField50 = chronology48.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology48.getZone();
        org.joda.time.DateTime dateTime52 = dateTime38.withChronology(chronology48);
        org.joda.time.Interval interval53 = duration26.toIntervalTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period56 = duration26.toPeriodFrom((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration57 = org.joda.time.Duration.ZERO;
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
        org.joda.time.DateTime dateTime87 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period88 = duration58.toPeriodFrom((org.joda.time.ReadableInstant) dateTime87);
        boolean boolean89 = duration57.isShorterThan((org.joda.time.ReadableDuration) duration58);
        int int90 = duration26.compareTo((org.joda.time.ReadableDuration) duration58);
        org.joda.time.ReadableInstant readableInstant91 = null;
        org.joda.time.Period period92 = duration58.toPeriodFrom(readableInstant91);
        int int93 = duration15.compareTo((org.joda.time.ReadableDuration) duration58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime17", (instant0.compareTo(dateTime17) == 0) == instant0.equals(dateTime17));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval5 = mutableInterval4.toInterval();
        org.joda.time.Chronology chronology6 = interval5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = chronology6.getZone();
        java.lang.String str9 = dateTimeZone7.getName(100L);
        org.joda.time.DateTime dateTime10 = dateTime1.withZoneRetainFields(dateTimeZone7);
        int int11 = dateTime10.getMinuteOfDay();
        org.joda.time.Interval interval12 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime10);
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
        org.joda.time.DateTime dateTime38 = dateTime33.withEarlierOffsetAtOverlap();
        int int39 = dateTime33.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime42 = dateTime33.withField(dateTimeFieldType40, 41);
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime33.toMutableDateTime();
        boolean boolean44 = interval12.isAfter((org.joda.time.ReadableInstant) dateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant23", (dateTime1.compareTo(instant23) == 0) == dateTime1.equals(instant23));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period12 = org.joda.time.Period.days((-1));
        org.joda.time.Period period14 = period12.withWeeks((int) 'a');
        java.lang.String str15 = period12.toString();
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) period12);
        mutablePeriod10.addSeconds((int) (byte) 100);
        mutablePeriod10.addWeeks((int) ' ');
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
        org.joda.time.Instant instant64 = instant21.withDurationAdded((org.joda.time.ReadableDuration) duration35, 5);
        org.joda.time.Duration duration65 = duration35.toDuration();
        org.joda.time.Duration duration66 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration67 = duration66.toDuration();
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval71 = mutableInterval70.toInterval();
        org.joda.time.Chronology chronology72 = interval71.getChronology();
        org.joda.time.DateTimeZone dateTimeZone73 = chronology72.getZone();
        org.joda.time.Period period74 = duration66.toPeriod(chronology72);
        boolean boolean75 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration66);
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration66);
        org.joda.time.Duration duration77 = duration66.toDuration();
        java.lang.String str78 = duration77.toString();
        long long79 = duration77.getStandardSeconds();
        org.joda.time.Instant instant80 = instant1.minus((org.joda.time.ReadableDuration) duration77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant21", (dateTime0.compareTo(instant21) == 0) == dateTime0.equals(instant21));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus(100L);
        org.joda.time.MutableDateTime mutableDateTime3 = instant0.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant0.toInstant();
        org.joda.time.DateTime dateTime5 = instant4.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime3", (instant4.compareTo(mutableDateTime3) == 0) == instant4.equals(mutableDateTime3));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
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
        mutableInterval18.setInterval((org.joda.time.ReadableInterval) mutableInterval34);
        org.joda.time.DateTime dateTime36 = mutableInterval18.getEnd();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean38 = dateTime36.isSupported(dateTimeFieldType37);
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
        org.joda.time.DateTime dateTime54 = dateTime50.withMillisOfDay(3);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        long long61 = dateTimeZone57.convertLocalToUTC(355200035L, false, (long) (byte) 100);
        boolean boolean63 = dateTimeZone57.isStandardOffset((long) (short) 100);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(dateTimeZone57);
        org.joda.time.DateTime dateTime65 = dateTime50.toDateTime(dateTimeZone57);
        org.joda.time.DateTime dateTime66 = dateTime36.withZoneRetainFields(dateTimeZone57);
        long long68 = dateTimeZone57.convertUTCToLocal((long) (-242484));
        long long72 = dateTimeZone57.convertLocalToUTC(1645804284509L, true, 1645455191306L);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetMillis(349200000);
        java.lang.String str76 = dateTimeZone74.getNameKey(10152000007L);
        long long78 = dateTimeZone57.getMillisKeepLocal(dateTimeZone74, 4838400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime65", (dateTime36.compareTo(dateTime65) == 0) == dateTime36.equals(dateTime65));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfMinute();
        int int8 = dateTimeField6.get((long) 8);
        java.lang.String str9 = dateTimeField6.toString();
        org.joda.time.DurationField durationField10 = dateTimeField6.getLeapDurationField();
        org.joda.time.Duration duration11 = org.joda.time.Duration.ZERO;
        org.joda.time.Duration duration12 = duration11.toDuration();
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        org.joda.time.Period period19 = duration11.toPeriod(chronology17);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.Instant instant23 = instant21.minus(100L);
        org.joda.time.Chronology chronology24 = instant21.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.year();
        boolean boolean26 = durationFieldType20.isSupported(chronology24);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology24);
        org.joda.time.DateTime dateTime29 = dateTime27.plusYears(5);
        org.joda.time.TimeOfDay timeOfDay30 = dateTime29.toTimeOfDay();
        int[] intArray32 = chronology17.get((org.joda.time.ReadablePartial) timeOfDay30, (long) 556);
        int int33 = dateTimeField6.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay30);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone35);
        int int37 = dateTime36.getDayOfMonth();
        org.joda.time.DateTime dateTime39 = dateTime36.withWeekOfWeekyear(1);
        org.joda.time.DateTime dateTime41 = dateTime39.withYear(0);
        boolean boolean43 = dateTime39.isEqual(97L);
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(chronology48);
        org.joda.time.DateTime dateTime51 = dateTime49.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime53 = dateTime51.minus((long) 2);
        org.joda.time.DateTime.Property property54 = dateTime53.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay55 = dateTime53.toYearMonthDay();
        boolean boolean56 = dateTime39.isBefore((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime57 = timeOfDay30.toDateTime((org.joda.time.ReadableInstant) dateTime53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant21", (dateTime5.compareTo(instant21) == 0) == dateTime5.equals(instant21));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Chronology chronology4 = interval3.getChronology();
        long long5 = interval3.toDurationMillis();
        org.joda.time.Interval interval7 = interval3.withEndMillis((long) (short) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 10);
        org.joda.time.Interval interval12 = interval7.withEnd((org.joda.time.ReadableInstant) instant8);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 100, (long) 10, periodType15);
        mutablePeriod16.addMonths(0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray19 = mutablePeriod16.getFieldTypes();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        mutablePeriod16.setPeriod(10L, 60480000000L, chronology26);
        org.joda.time.Interval interval28 = interval7.withChronology(chronology26);
        org.joda.time.Interval interval29 = interval28.toInterval();
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean40 = mutableInterval35.isBefore((org.joda.time.ReadableInterval) mutableInterval39);
        boolean boolean41 = mutableInterval32.contains((org.joda.time.ReadableInterval) mutableInterval39);
        org.joda.time.MutableInterval mutableInterval42 = mutableInterval32.copy();
        boolean boolean43 = interval28.overlaps((org.joda.time.ReadableInterval) mutableInterval42);
        org.joda.time.Duration duration44 = org.joda.time.Duration.ZERO;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        org.joda.time.Chronology chronology52 = interval51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, periodType47, chronology52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) '4', chronology52);
        org.joda.time.ReadablePartial readablePartial55 = null;
        org.joda.time.DateTime dateTime56 = dateTime54.withFields(readablePartial55);
        org.joda.time.DateTime.Property property57 = dateTime56.millisOfDay();
        org.joda.time.DateTime dateTime58 = dateTime56.withEarlierOffsetAtOverlap();
        int int59 = dateTime56.getDayOfWeek();
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        org.joda.time.Chronology chronology66 = interval65.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 1, periodType61, chronology66);
        org.joda.time.DateTimeField dateTimeField68 = chronology66.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone69 = chronology66.getZone();
        org.joda.time.DateTime dateTime70 = dateTime56.withChronology(chronology66);
        org.joda.time.Interval interval71 = duration44.toIntervalTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Period period74 = duration44.toPeriodFrom((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.Duration duration76 = duration44.withMillis(100L);
        java.lang.Object obj77 = null;
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime(obj77);
        boolean boolean79 = duration44.equals((java.lang.Object) dateTime78);
        org.joda.time.Period period80 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType81 = period80.getPeriodType();
        org.joda.time.Period period83 = period80.plusMonths(52);
        org.joda.time.Interval interval84 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime78, (org.joda.time.ReadablePeriod) period83);
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime87 = dateTime85.withMinuteOfHour(0);
        org.joda.time.DateTime dateTime89 = dateTime85.minusHours(3600);
        org.joda.time.DateTime.Property property90 = dateTime85.era();
        boolean boolean91 = dateTime78.isAfter((org.joda.time.ReadableInstant) dateTime85);
        org.joda.time.DateTime dateTime93 = dateTime78.plusYears(58);
        boolean boolean94 = mutableInterval42.isAfter((org.joda.time.ReadableInstant) dateTime93);
        mutableInterval42.setInterval((-4382904L), (long) (-10));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime78", (instant8.compareTo(dateTime78) == 0) == instant8.equals(dateTime78));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean10 = mutableInterval5.isBefore((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean11 = mutableInterval2.contains((org.joda.time.ReadableInterval) mutableInterval9);
        boolean boolean13 = mutableInterval2.isBefore(0L);
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) mutableInterval2);
        mutableInterval2.setStartMillis((long) 20);
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
        int int31 = dateTime30.getMillisOfDay();
        boolean boolean32 = mutableInterval2.isAfter((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime.Property property33 = dateTime30.dayOfMonth();
        org.joda.time.Instant instant34 = new org.joda.time.Instant((java.lang.Object) dateTime30);
        org.joda.time.DateTime.Property property35 = dateTime30.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant34", (dateTime30.compareTo(instant34) == 0) == dateTime30.equals(instant34));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
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
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone29);
        int int31 = dateTime30.getDayOfMonth();
        org.joda.time.DateTime dateTime33 = dateTime30.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property34 = dateTime33.dayOfYear();
        org.joda.time.DateTime dateTime36 = dateTime33.plusDays(56);
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
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean69 = mutableInterval64.isBefore((org.joda.time.ReadableInterval) mutableInterval68);
        boolean boolean70 = mutableInterval61.contains((org.joda.time.ReadableInterval) mutableInterval68);
        org.joda.time.Period period73 = new org.joda.time.Period();
        org.joda.time.PeriodType periodType74 = period73.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((long) '#', 100L, periodType74);
        org.joda.time.Period period76 = mutableInterval68.toPeriod(periodType74);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((long) (byte) -1, periodType74);
        org.joda.time.Period period78 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableDuration) duration54, periodType74);
        org.joda.time.DateTime dateTime80 = dateTime12.withDurationAdded((org.joda.time.ReadableDuration) duration54, 951);
        int int81 = dateTime12.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime83 = dateTime12.withEra(0);
        org.joda.time.DateTimeZone dateTimeZone86 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 19);
        org.joda.time.DateTime dateTime87 = dateTime12.toDateTime(dateTimeZone86);
        org.joda.time.DateTime dateTime89 = dateTime87.withYear(21600);
        java.util.Date date90 = dateTime89.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime87", (dateTime10.compareTo(dateTime87) == 0) == dateTime10.equals(dateTime87));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(31, 7, 0, 0);
        org.joda.time.Period period6 = org.joda.time.Period.days((-1));
        org.joda.time.Period period8 = period6.withHours((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period11 = period6.withField(durationFieldType9, (int) (byte) 1);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.Instant instant14 = instant12.minus(100L);
        long long15 = instant12.getMillis();
        org.joda.time.Duration duration16 = period11.toDurationFrom((org.joda.time.ReadableInstant) instant12);
        java.lang.String str17 = duration16.toString();
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration16);
        int int19 = mutablePeriod4.getHours();
        org.joda.time.Period period21 = org.joda.time.Period.days((-1));
        org.joda.time.Period period23 = period21.withWeeks((int) 'a');
        org.joda.time.Period period25 = period23.withDays(100);
        org.joda.time.Period period27 = period23.withSeconds(951);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) period23);
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval35 = mutableInterval34.toInterval();
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        boolean boolean39 = mutableInterval34.isBefore((org.joda.time.ReadableInterval) mutableInterval38);
        boolean boolean40 = mutableInterval31.contains((org.joda.time.ReadableInterval) mutableInterval38);
        mutableInterval31.setDurationAfterStart(0L);
        boolean boolean43 = mutableInterval31.containsNow();
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        long long49 = interval47.toDurationMillis();
        org.joda.time.Interval interval51 = interval47.withEndMillis((long) (short) 100);
        long long52 = interval47.toDurationMillis();
        boolean boolean53 = mutableInterval31.overlaps((org.joda.time.ReadableInterval) interval47);
        boolean boolean55 = interval47.contains((long) (-1));
        org.joda.time.Interval interval56 = interval47.toInterval();
        org.joda.time.Weeks weeks57 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval47);
        java.lang.String str58 = interval47.toString();
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        org.joda.time.Chronology chronology63 = interval62.getChronology();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(chronology63);
        org.joda.time.DateTime dateTime66 = dateTime64.withWeekyear((int) (short) 1);
        org.joda.time.DateTime dateTime68 = dateTime66.plus((long) (short) -1);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime68, readableInstant69);
        org.joda.time.DateTime dateTime72 = dateTime68.plusMinutes((-90));
        boolean boolean73 = interval47.isBefore((org.joda.time.ReadableInstant) dateTime68);
        mutablePeriod4.setPeriod((org.joda.time.ReadableInterval) interval47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime64", (instant12.compareTo(dateTime64) == 0) == instant12.equals(dateTime64));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, periodType2, chronology7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '4', chronology7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withFields(readablePartial10);
        org.joda.time.DateTime.Property property12 = dateTime9.millisOfDay();
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 1, periodType15, chronology20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '4', chronology20);
        org.joda.time.ReadablePartial readablePartial23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.withFields(readablePartial23);
        org.joda.time.DateTime.Property property25 = dateTime24.millisOfDay();
        org.joda.time.DateTime dateTime26 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime29 = dateTime9.minusMinutes((int) ' ');
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTime29.toString("2", locale31);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(349200000);
        java.lang.String str36 = dateTimeZone34.getNameKey(10152000007L);
        org.joda.time.DateTime dateTime37 = dateTime29.toDateTime(dateTimeZone34);
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone34.getShortName((long) (-81), locale39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and dateTime37", (dateTime29.compareTo(dateTime37) == 0) == dateTime29.equals(dateTime37));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
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
        org.joda.time.DateTime.Property property34 = dateTime30.millisOfSecond();
        org.joda.time.DateTime dateTime36 = property34.addToCopy((int) '4');
        org.joda.time.DateTime.Property property37 = dateTime36.yearOfCentury();
        org.joda.time.Interval interval38 = property37.toInterval();
        org.joda.time.Interval interval39 = interval38.toInterval();
        java.lang.String str40 = interval39.toString();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime();
        org.joda.time.Instant instant42 = dateTime41.toInstant();
        org.joda.time.DateTime dateTime43 = instant42.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Instant instant45 = instant42.plus(readableDuration44);
        boolean boolean46 = interval39.equals((java.lang.Object) instant45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime41", (instant0.compareTo(dateTime41) == 0) == instant0.equals(dateTime41));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
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
        org.joda.time.DateTime dateTime26 = dateTime9.plusHours(7);
        org.joda.time.TimeOfDay timeOfDay27 = dateTime9.toTimeOfDay();
        org.joda.time.Minutes minutes28 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes30 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType31 = null;
        int int32 = minutes30.get(durationFieldType31);
        org.joda.time.DurationFieldType durationFieldType33 = minutes30.getFieldType();
        boolean boolean34 = minutes28.isGreaterThan(minutes30);
        org.joda.time.Minutes minutes36 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType37 = null;
        int int38 = minutes36.get(durationFieldType37);
        org.joda.time.DurationFieldType durationFieldType39 = minutes36.getFieldType();
        boolean boolean40 = minutes28.isLessThan(minutes36);
        org.joda.time.DurationFieldType durationFieldType41 = minutes28.getFieldType();
        org.joda.time.DateTime dateTime43 = dateTime9.withFieldAdded(durationFieldType41, 1970);
        org.joda.time.Duration duration45 = org.joda.time.Duration.millis(0L);
        org.joda.time.Duration duration47 = duration45.withMillis((long) (short) 10);
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableDuration) duration47);
        long long49 = interval48.getEndMillis();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        long long56 = dateTimeZone52.convertLocalToUTC(355200035L, false, (long) (byte) 100);
        boolean boolean58 = dateTimeZone52.isStandardOffset((long) (short) 100);
        long long61 = dateTimeZone52.adjustOffset((long) 1935, false);
        org.joda.time.DateTime dateTime62 = org.joda.time.DateTime.now(dateTimeZone52);
        org.joda.time.Interval interval63 = interval48.withEnd((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.MutableInterval mutableInterval64 = interval48.toMutableInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime62", (instant10.compareTo(dateTime62) == 0) == instant10.equals(dateTime62));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(1645455060000L);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period12 = org.joda.time.Period.days((-1));
        org.joda.time.Period period14 = period12.withWeeks((int) 'a');
        java.lang.String str15 = period12.toString();
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) period12);
        mutablePeriod10.addSeconds((int) (byte) 100);
        mutablePeriod10.addWeeks((int) ' ');
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval24 = mutableInterval23.toInterval();
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.MutableInterval mutableInterval26 = interval24.toMutableInterval();
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
        org.joda.time.DateTime dateTime42 = property41.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime42, readableDuration43);
        boolean boolean45 = interval24.abuts((org.joda.time.ReadableInterval) mutableInterval44);
        org.joda.time.DateTime dateTime46 = interval24.getStart();
        mutablePeriod10.setPeriod((org.joda.time.ReadableInterval) interval24);
        mutablePeriod10.setPeriod(2629746000L);
        boolean boolean50 = duration1.equals((java.lang.Object) 2629746000L);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis(53);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime54.toDateTimeISO();
        org.joda.time.DateTime dateTime57 = dateTime54.minusSeconds(10);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant27 and dateTime54", (instant27.compareTo(dateTime54) == 0) == instant27.equals(dateTime54));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus(100L);
        org.joda.time.DateTime dateTime3 = instant2.toDateTimeISO();
        int int4 = dateTime3.getYear();
        java.util.Locale locale5 = null;
        java.util.Calendar calendar6 = dateTime3.toCalendar(locale5);
        org.joda.time.YearMonthDay yearMonthDay7 = dateTime3.toYearMonthDay();
        org.joda.time.DateTime dateTime9 = dateTime3.withYear(18);
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
        org.joda.time.DurationField durationField26 = property24.getRangeDurationField();
        java.lang.String str27 = property24.getName();
        long long28 = property24.remainder();
        java.util.Locale locale29 = null;
        int int30 = property24.getMaximumShortTextLength(locale29);
        org.joda.time.DurationField durationField31 = property24.getRangeDurationField();
        org.joda.time.DateTime dateTime32 = property24.roundHalfEvenCopy();
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
        org.joda.time.DateTime.Property property63 = dateTime59.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone65);
        int int67 = dateTime66.getDayOfMonth();
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.MutableInterval mutableInterval72 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval73 = mutableInterval72.toInterval();
        org.joda.time.Chronology chronology74 = interval73.getChronology();
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((long) 1, periodType69, chronology74);
        org.joda.time.DateTimeField dateTimeField76 = chronology74.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone77 = chronology74.getZone();
        org.joda.time.DateTime dateTime78 = dateTime66.withZoneRetainFields(dateTimeZone77);
        org.joda.time.DateTime dateTime79 = dateTime59.withZone(dateTimeZone77);
        org.joda.time.DateTimeZone dateTimeZone80 = null;
        org.joda.time.DateTime dateTime81 = dateTime79.toDateTime(dateTimeZone80);
        org.joda.time.Days days82 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime48, (org.joda.time.ReadableInstant) dateTime81);
        int int83 = dateTime81.getYearOfEra();
        org.joda.time.DateTime dateTime85 = dateTime81.minusHours(3);
        boolean boolean86 = property24.equals((java.lang.Object) dateTime85);
        java.util.Locale locale87 = null;
        java.lang.String str88 = property24.getAsShortText(locale87);
        org.joda.time.DateTime dateTime90 = property24.addWrapFieldToCopy((-1441));
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = property24.getFieldType();
        org.joda.time.DurationFieldType durationFieldType92 = dateTimeFieldType91.getRangeDurationType();
        int int93 = dateTime9.get(dateTimeFieldType91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime3", (instant2.compareTo(dateTime3) == 0) == instant2.equals(dateTime3));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime9 = property6.addToCopy(100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 10, dateTimeZone11);
        int int13 = dateTime12.getDayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime12.withMillisOfDay((int) 'a');
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.Period period26 = org.joda.time.Period.days((-1));
        org.joda.time.Period period28 = period26.withWeeks((int) 'a');
        java.lang.String str29 = period26.toString();
        mutablePeriod24.setPeriod((org.joda.time.ReadablePeriod) period26);
        mutablePeriod24.addMonths((int) (short) -1);
        org.joda.time.Period period34 = org.joda.time.Period.days((-1));
        org.joda.time.Period period36 = period34.withWeeks((int) 'a');
        org.joda.time.Period period38 = period34.plusMonths((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType39 = null;
        boolean boolean40 = period38.isSupported(durationFieldType39);
        mutablePeriod24.add((org.joda.time.ReadablePeriod) period38);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval((long) (short) -1, (long) '4');
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) 1, periodType45, chronology50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) '4', chronology50);
        org.joda.time.DurationField durationField53 = chronology50.centuries();
        mutablePeriod24.add((long) (short) 10, chronology50);
        org.joda.time.DateTimeField dateTimeField55 = chronology50.clockhourOfDay();
        long long58 = dateTimeField55.add((long) (short) 0, (int) '4');
        java.util.Locale locale59 = null;
        int int60 = dateTimeField55.getMaximumShortTextLength(locale59);
        int int61 = dateTime15.get(dateTimeField55);
        org.joda.time.Instant instant62 = dateTime15.toInstant();
        int int63 = property6.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant62", (dateTime5.compareTo(instant62) == 0) == dateTime5.equals(instant62));
    }
}

