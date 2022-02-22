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
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        long long2 = dateTime1.getMillis();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str9 = dateTimeZone7.getNameKey(1645455028293L);
        org.joda.time.DateTime dateTime10 = dateTime1.toDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime12 = dateTime10.withDayOfYear(2);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        long long15 = dateTime14.getMillis();
        org.joda.time.DateTime.Property property16 = dateTime14.yearOfEra();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval();
        long long19 = mutableInterval18.toDurationMillis();
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval18.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Interval interval23 = interval17.withDurationAfterStart((org.joda.time.ReadableDuration) duration21);
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.Interval interval25 = interval23.gap(readableInterval24);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType31 = periodType30.withYearsRemoved();
        org.joda.time.PeriodType periodType32 = periodType31.withSecondsRemoved();
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval();
        long long34 = mutableInterval33.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        boolean boolean37 = mutableInterval33.overlaps((org.joda.time.ReadableInterval) mutableInterval35);
        java.lang.Object obj38 = mutableInterval33.clone();
        org.joda.time.Chronology chronology39 = mutableInterval33.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfEra();
        org.joda.time.Period period41 = new org.joda.time.Period(1645455029672L, (long) 3, periodType31, chronology39);
        mutablePeriod26.add(1645455030370L, chronology39);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone43);
        java.lang.String str45 = dateTime44.toString();
        org.joda.time.DateTime dateTime47 = dateTime44.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = dateTime47.toDateTime(chronology48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(dateTimeZone50);
        java.lang.String str52 = dateTime51.toString();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology55);
        org.joda.time.DateTime dateTime57 = dateTime51.minus((org.joda.time.ReadablePeriod) period56);
        org.joda.time.DateTime dateTime58 = dateTime51.toDateTimeISO();
        org.joda.time.DateTime dateTime60 = dateTime58.minusMinutes(0);
        boolean boolean61 = dateTime47.isEqual((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime.Property property62 = dateTime47.year();
        org.joda.time.Duration duration63 = mutablePeriod26.toDurationFrom((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean64 = interval23.isAfter((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.Interval interval68 = new org.joda.time.Interval((long) (byte) -1, (-1L), dateTimeZone67);
        org.joda.time.Interval interval69 = interval68.toInterval();
        org.joda.time.Duration duration70 = interval68.toDuration();
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableDuration) duration70);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime74 = dateTime10.plusMillis(39094373);
        int int75 = dateTime74.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime10", (dateTime1.compareTo(dateTime10) == 0) == dateTime1.equals(dateTime10));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        java.lang.String str2 = dateTime1.toString();
        org.joda.time.DateTime dateTime4 = dateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.toDateTime(chronology5);
        org.joda.time.DateTime dateTime7 = dateTime4.toDateTimeISO();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime4, readableInstant8);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        java.lang.String str14 = dateTime13.toString();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology17);
        org.joda.time.DateTime dateTime19 = dateTime13.minus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period20 = duration11.toPeriodFrom((org.joda.time.ReadableInstant) dateTime13);
        java.util.GregorianCalendar gregorianCalendar21 = dateTime13.toGregorianCalendar();
        org.joda.time.DateTime.Property property22 = dateTime13.year();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.Interval interval26 = new org.joda.time.Interval((long) 3, 1645455035827L, dateTimeZone25);
        boolean boolean27 = dateTime13.equals((java.lang.Object) interval26);
        boolean boolean28 = mutableInterval9.contains((org.joda.time.ReadableInterval) interval26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str35 = dateTimeZone33.getShortName(52L);
        org.joda.time.DateTime dateTime36 = dateTime30.withZone(dateTimeZone33);
        org.joda.time.Interval interval37 = interval26.withEnd((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardMinutes(1645455190436L);
        org.joda.time.Interval interval40 = interval37.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime36", (dateTime1.compareTo(dateTime36) == 0) == dateTime1.equals(dateTime36));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(7, 0, 72, 30);
        mutablePeriod4.add(53530848, 969, 53504366, 2, 53526253, (int) (byte) -1, 53535215, 4396707);
        int int14 = mutablePeriod4.getMillis();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Interval interval18 = new org.joda.time.Interval((long) (byte) -1, (-1L), dateTimeZone17);
        org.joda.time.Period period19 = org.joda.time.Period.ZERO;
        org.joda.time.Period period21 = period19.minusSeconds((int) (short) 1);
        org.joda.time.Period period23 = period19.plusWeeks((int) (short) -1);
        org.joda.time.Period period25 = period19.minusMillis(4);
        org.joda.time.Interval interval26 = interval18.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Period period28 = period19.minusMinutes(8);
        int int29 = period28.getMonths();
        int int30 = period28.getHours();
        org.joda.time.Period period32 = period28.minusWeeks(4490928);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) period28);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone34);
        java.lang.String str36 = dateTime35.toString();
        org.joda.time.DateTime dateTime38 = dateTime35.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.toDateTime(chronology39);
        org.joda.time.DateTime dateTime41 = dateTime38.toDateTime();
        org.joda.time.DateTime dateTime43 = dateTime41.withMillisOfDay(1);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone44);
        java.lang.String str46 = dateTime45.toString();
        org.joda.time.DateTime dateTime48 = dateTime45.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.toDateTime(chronology49);
        org.joda.time.DateTime dateTime51 = dateTime48.toDateTime();
        org.joda.time.DateTime dateTime53 = dateTime51.withMillisOfDay(1);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str58 = dateTimeZone56.getNameKey(1645455028293L);
        int int60 = dateTimeZone56.getOffset(1645455028293L);
        org.joda.time.DateTime dateTime61 = dateTime51.toDateTime(dateTimeZone56);
        org.joda.time.Interval interval62 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime61);
        mutablePeriod4.setPeriod((org.joda.time.ReadableInterval) interval62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and dateTime61", (dateTime38.compareTo(dateTime61) == 0) == dateTime38.equals(dateTime61));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period0.minusSeconds((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.seconds();
        int int4 = period2.get(durationFieldType3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology10);
        org.joda.time.DateTime dateTime12 = dateTime6.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTimeISO();
        org.joda.time.DateTime dateTime15 = dateTime13.minusMinutes(0);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone18);
        java.lang.String str20 = dateTime19.toString();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology23);
        org.joda.time.DateTime dateTime25 = dateTime19.minus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Period period26 = duration17.toPeriodFrom((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Duration duration28 = duration17.minus(0L);
        org.joda.time.DateTime dateTime30 = dateTime13.withDurationAdded((org.joda.time.ReadableDuration) duration28, (int) (byte) 0);
        org.joda.time.DateTime dateTime32 = dateTime30.withCenturyOfEra(9);
        org.joda.time.DateTime.Property property33 = dateTime30.minuteOfHour();
        org.joda.time.Interval interval34 = property33.toInterval();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone35);
        long long37 = dateTime36.getMillis();
        org.joda.time.DateTime dateTime39 = dateTime36.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime41 = dateTime39.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str46 = dateTimeZone44.getNameKey(1645455028293L);
        org.joda.time.DateTime dateTime47 = dateTime39.withZone(dateTimeZone44);
        org.joda.time.DateTime dateTime49 = dateTime47.withYearOfEra(32);
        long long50 = property33.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Duration duration51 = period2.toDurationFrom((org.joda.time.ReadableInstant) dateTime47);
        int int52 = period2.getDays();
        int int53 = period2.getMonths();
        org.joda.time.Period period55 = period2.minusMonths(4683579);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime47", (dateTime39.compareTo(dateTime47) == 0) == dateTime39.equals(dateTime47));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        long long2 = dateTime1.getMillis();
        org.joda.time.DateTime.Property property3 = dateTime1.yearOfEra();
        org.joda.time.DateTime dateTime4 = property3.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime12 = dateTime9.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str17 = dateTimeZone15.getNameKey(1645455028293L);
        int int19 = dateTimeZone15.getOffset(1645455028293L);
        long long23 = dateTimeZone15.convertLocalToUTC((long) 3, false, 1645455032819L);
        org.joda.time.DateTime dateTime24 = dateTime9.withZoneRetainFields(dateTimeZone15);
        long long28 = dateTimeZone15.convertLocalToUTC(1645455045823L, true, (long) 31);
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType30 = periodType29.withMinutesRemoved();
        boolean boolean31 = dateTimeZone15.equals((java.lang.Object) periodType29);
        org.joda.time.DateTime dateTime32 = dateTime4.toDateTime(dateTimeZone15);
        int int34 = dateTimeZone15.getStandardOffset(1645455081342L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime32", (dateTime4.compareTo(dateTime32) == 0) == dateTime4.equals(dateTime32));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        java.lang.Object obj4 = null;
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType6 = periodType5.withMinutesRemoved();
        int int7 = periodType6.size();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        java.lang.String str10 = dateTime9.toString();
        org.joda.time.DateTime dateTime12 = dateTime9.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime(chronology13);
        org.joda.time.DateTime dateTime15 = dateTime12.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime12.withDurationAdded((long) (short) 1, (int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime12.withYear(2);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone21);
        long long23 = dateTime22.getMillis();
        org.joda.time.DateTime.Property property24 = dateTime22.yearOfEra();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval();
        long long27 = mutableInterval26.toDurationMillis();
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval26.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Interval interval31 = interval25.withDurationAfterStart((org.joda.time.ReadableDuration) duration29);
        boolean boolean32 = dateTime12.equals((java.lang.Object) interval25);
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval();
        long long34 = mutableInterval33.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        boolean boolean37 = mutableInterval33.overlaps((org.joda.time.ReadableInterval) mutableInterval35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone38);
        long long40 = dateTime39.getMillis();
        org.joda.time.DateTime dateTime42 = dateTime39.plusWeeks((int) (byte) 10);
        boolean boolean43 = mutableInterval33.contains((org.joda.time.ReadableInstant) dateTime42);
        int int44 = dateTime42.getMillisOfDay();
        org.joda.time.DateTime dateTime46 = dateTime42.plusYears(3);
        boolean boolean47 = interval25.contains((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Chronology chronology48 = interval25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(obj4, periodType6, chronology48);
        org.joda.time.PeriodType periodType50 = periodType6.withMonthsRemoved();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(dateTimeZone51);
        long long53 = dateTime52.getMillis();
        org.joda.time.DateTime dateTime55 = dateTime52.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime56 = dateTime55.toDateTimeISO();
        org.joda.time.DateTime dateTime58 = dateTime55.plusMillis(100);
        long long59 = dateTime58.getMillis();
        int int60 = dateTime58.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.MutableInterval mutableInterval62 = new org.joda.time.MutableInterval();
        long long63 = mutableInterval62.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        boolean boolean66 = mutableInterval62.overlaps((org.joda.time.ReadableInterval) mutableInterval64);
        java.lang.Object obj67 = mutableInterval62.clone();
        org.joda.time.Chronology chronology68 = mutableInterval62.getChronology();
        org.joda.time.DateTimeField dateTimeField69 = chronology68.yearOfEra();
        org.joda.time.DateTimeField dateTimeField70 = chronology68.millisOfSecond();
        boolean boolean71 = dateTimeFieldType61.isSupported(chronology68);
        int int72 = dateTime58.get(dateTimeFieldType61);
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval();
        long long74 = mutableInterval73.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval76 = mutableInterval75.toInterval();
        boolean boolean77 = mutableInterval73.overlaps((org.joda.time.ReadableInterval) mutableInterval75);
        java.lang.Object obj78 = mutableInterval73.clone();
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval();
        long long80 = mutableInterval79.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval82 = mutableInterval81.toInterval();
        boolean boolean83 = mutableInterval79.overlaps((org.joda.time.ReadableInterval) mutableInterval81);
        java.lang.Object obj84 = mutableInterval79.clone();
        org.joda.time.Chronology chronology85 = mutableInterval79.getChronology();
        org.joda.time.DateTimeField dateTimeField86 = chronology85.millisOfDay();
        org.joda.time.DurationField durationField87 = chronology85.years();
        mutableInterval73.setChronology(chronology85);
        boolean boolean89 = dateTimeFieldType61.isSupported(chronology85);
        org.joda.time.Period period90 = new org.joda.time.Period(0L, periodType50, chronology85);
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod(1645455037307L, chronology85);
        org.joda.time.DateTime dateTime92 = instant0.toDateTime(chronology85);
        org.joda.time.DateTimeField dateTimeField93 = chronology85.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime2 = instant0.toMutableDateTime();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(dateTimeZone4);
        long long6 = dateTime5.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime5.plusWeeks((int) (byte) 10);
        int int9 = dateTime5.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        java.lang.String str12 = dateTime11.toString();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology15);
        org.joda.time.DateTime dateTime17 = dateTime11.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.DateTime dateTime18 = dateTime11.toDateTimeISO();
        int int19 = dateTime5.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime21 = dateTime5.minusMinutes(8);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone22);
        java.lang.String str24 = dateTime23.toString();
        org.joda.time.DateTime dateTime26 = dateTime23.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.toDateTime(chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone29);
        java.lang.String str31 = dateTime30.toString();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology34);
        org.joda.time.DateTime dateTime36 = dateTime30.minus((org.joda.time.ReadablePeriod) period35);
        org.joda.time.DateTime dateTime37 = dateTime30.toDateTimeISO();
        org.joda.time.DateTime dateTime39 = dateTime37.minusMinutes(0);
        boolean boolean40 = dateTime26.isEqual((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime.Property property41 = dateTime26.year();
        java.util.Locale locale42 = null;
        java.lang.String str43 = property41.getAsText(locale42);
        java.util.Locale locale44 = null;
        java.lang.String str45 = property41.getAsShortText(locale44);
        java.util.Locale locale46 = null;
        int int47 = property41.getMaximumTextLength(locale46);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property41.getFieldType();
        org.joda.time.DateTime dateTime50 = dateTime21.withField(dateTimeFieldType48, 30);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod();
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType56 = periodType55.withYearsRemoved();
        org.joda.time.PeriodType periodType57 = periodType56.withSecondsRemoved();
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval();
        long long59 = mutableInterval58.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        boolean boolean62 = mutableInterval58.overlaps((org.joda.time.ReadableInterval) mutableInterval60);
        java.lang.Object obj63 = mutableInterval58.clone();
        org.joda.time.Chronology chronology64 = mutableInterval58.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.yearOfEra();
        org.joda.time.Period period66 = new org.joda.time.Period(1645455029672L, (long) 3, periodType56, chronology64);
        mutablePeriod51.add(1645455030370L, chronology64);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(dateTimeZone68);
        java.lang.String str70 = dateTime69.toString();
        org.joda.time.DateTime dateTime72 = dateTime69.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTime dateTime74 = dateTime72.toDateTime(chronology73);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime(dateTimeZone75);
        java.lang.String str77 = dateTime76.toString();
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology80);
        org.joda.time.DateTime dateTime82 = dateTime76.minus((org.joda.time.ReadablePeriod) period81);
        org.joda.time.DateTime dateTime83 = dateTime76.toDateTimeISO();
        org.joda.time.DateTime dateTime85 = dateTime83.minusMinutes(0);
        boolean boolean86 = dateTime72.isEqual((org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.DateTime.Property property87 = dateTime72.year();
        org.joda.time.Duration duration88 = mutablePeriod51.toDurationFrom((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.Duration duration90 = duration88.minus(1645455029375L);
        org.joda.time.Period period91 = duration90.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration90);
        org.joda.time.PeriodType periodType93 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType94 = periodType93.withMinutesRemoved();
        int int95 = periodType94.size();
        org.joda.time.Period period96 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration90, periodType94);
        org.joda.time.Interval interval97 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime2, (org.joda.time.ReadableDuration) duration90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        java.lang.String str2 = dateTime1.toString();
        org.joda.time.DateTime dateTime4 = dateTime1.minusMillis(7);
        org.joda.time.LocalDate localDate5 = dateTime4.toLocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        java.lang.String str11 = dateTime10.toString();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology14);
        org.joda.time.DateTime dateTime16 = dateTime10.minus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period17 = duration8.toPeriodFrom((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime19 = dateTime10.minusSeconds((int) ' ');
        org.joda.time.DateTime dateTime21 = dateTime19.withHourOfDay(21);
        org.joda.time.DateTime dateTime23 = dateTime21.withMillis(0L);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str28 = dateTimeZone26.getNameKey(1645455028293L);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone26.getName((long) 342, locale30);
        org.joda.time.DateTime dateTime32 = dateTime21.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology33 = chronology6.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField34 = chronology6.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime32", (dateTime21.compareTo(dateTime32) == 0) == dateTime21.equals(dateTime32));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        java.lang.String str2 = dateTime1.toString();
        org.joda.time.DateTime dateTime4 = dateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.toDateTime(chronology5);
        org.joda.time.DateTime dateTime7 = dateTime4.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int9 = dateTime4.get(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        java.lang.String str12 = dateTime11.toString();
        org.joda.time.DateTime dateTime14 = dateTime11.withMillisOfSecond((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = dateTime14.toString(dateTimeFormatter15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str21 = dateTimeZone19.getNameKey(1645455028293L);
        int int23 = dateTimeZone19.getOffset(1645455028293L);
        java.lang.String str25 = dateTimeZone19.getShortName(1645455037062L);
        org.joda.time.DateTime dateTime26 = dateTime14.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime27 = dateTime4.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime29 = dateTime27.withSecondOfMinute(52);
        java.lang.String str30 = dateTime29.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime26", (dateTime4.compareTo(dateTime26) == 0) == dateTime4.equals(dateTime26));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.joda.time.MutableInterval mutableInterval0 = new org.joda.time.MutableInterval();
        long long1 = mutableInterval0.toDurationMillis();
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval0.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration6 = duration3.plus((long) 8);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        java.lang.String str9 = dateTime8.toString();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology12);
        org.joda.time.DateTime dateTime14 = dateTime8.minus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.DateTime dateTime15 = dateTime8.withEarlierOffsetAtOverlap();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration3, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.withZoneRetainFields(dateTimeZone17);
        long long19 = dateTime18.getMillis();
        org.joda.time.DateTime dateTime21 = dateTime18.minusMinutes(53452649);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod();
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType27 = periodType26.withYearsRemoved();
        org.joda.time.PeriodType periodType28 = periodType27.withSecondsRemoved();
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval();
        long long30 = mutableInterval29.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        boolean boolean33 = mutableInterval29.overlaps((org.joda.time.ReadableInterval) mutableInterval31);
        java.lang.Object obj34 = mutableInterval29.clone();
        org.joda.time.Chronology chronology35 = mutableInterval29.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.yearOfEra();
        org.joda.time.Period period37 = new org.joda.time.Period(1645455029672L, (long) 3, periodType27, chronology35);
        mutablePeriod22.add(1645455030370L, chronology35);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone39);
        java.lang.String str41 = dateTime40.toString();
        org.joda.time.DateTime dateTime43 = dateTime40.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.toDateTime(chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(dateTimeZone46);
        java.lang.String str48 = dateTime47.toString();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology51);
        org.joda.time.DateTime dateTime53 = dateTime47.minus((org.joda.time.ReadablePeriod) period52);
        org.joda.time.DateTime dateTime54 = dateTime47.toDateTimeISO();
        org.joda.time.DateTime dateTime56 = dateTime54.minusMinutes(0);
        boolean boolean57 = dateTime43.isEqual((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime.Property property58 = dateTime43.year();
        org.joda.time.Duration duration59 = mutablePeriod22.toDurationFrom((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Duration duration61 = duration59.minus(1645455029375L);
        org.joda.time.Instant instant63 = org.joda.time.Instant.parse("2022-02-22T01:15:05.214+10:22");
        org.joda.time.MutableDateTime mutableDateTime64 = instant63.toMutableDateTime();
        int int65 = mutableDateTime64.getYearOfEra();
        boolean boolean66 = duration59.equals((java.lang.Object) mutableDateTime64);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.Duration duration69 = new org.joda.time.Duration(1645455034431L);
        org.joda.time.Duration duration73 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(dateTimeZone74);
        java.lang.String str76 = dateTime75.toString();
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.Period period80 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology79);
        org.joda.time.DateTime dateTime81 = dateTime75.minus((org.joda.time.ReadablePeriod) period80);
        org.joda.time.Period period82 = duration73.toPeriodFrom((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.DurationFieldType[] durationFieldTypeArray83 = period82.getFieldTypes();
        org.joda.time.PeriodType periodType84 = org.joda.time.PeriodType.forFields(durationFieldTypeArray83);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod(1645455192341L, 1645455081023L, periodType84);
        org.joda.time.PeriodType periodType86 = periodType84.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod(readableInstant67, (org.joda.time.ReadableDuration) duration69, periodType86);
        org.joda.time.PeriodType periodType88 = periodType86.withMonthsRemoved();
        java.lang.String str89 = periodType86.toString();
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableDuration) duration59, periodType86);
        int int91 = mutablePeriod90.getMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant63 and mutableDateTime64", (instant63.compareTo(mutableDateTime64) == 0) == instant63.equals(mutableDateTime64));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        long long2 = dateTime1.getMillis();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str9 = dateTimeZone7.getNameKey(1645455028293L);
        org.joda.time.DateTime dateTime10 = dateTime1.toDateTime(dateTimeZone7);
        int int11 = dateTime10.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property12 = dateTime10.millisOfSecond();
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DurationField durationField14 = property12.getRangeDurationField();
        org.joda.time.DateTime dateTime15 = property12.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime16 = property12.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime16", (dateTime1.compareTo(dateTime16) == 0) == dateTime1.equals(dateTime16));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        java.lang.String str4 = dateTime3.toString();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology7);
        org.joda.time.DateTime dateTime9 = dateTime3.minus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period10 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.DateTime dateTime12 = dateTime3.minusSeconds((int) ' ');
        org.joda.time.DateTime dateTime14 = dateTime12.withHourOfDay(21);
        org.joda.time.DateTime dateTime16 = dateTime14.withMillis(0L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str21 = dateTimeZone19.getNameKey(1645455028293L);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone19.getName((long) 342, locale23);
        org.joda.time.DateTime dateTime25 = dateTime14.toDateTime(dateTimeZone19);
        long long28 = dateTimeZone19.convertLocalToUTC(1645455173941L, false);
        int int30 = dateTimeZone19.getOffset(1651503305286L);
        int int32 = dateTimeZone19.getStandardOffset(1645455190006L);
        int int34 = dateTimeZone19.getStandardOffset(1645455312234L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime25", (dateTime14.compareTo(dateTime25) == 0) == dateTime14.equals(dateTime25));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.joda.time.MutableInterval mutableInterval0 = new org.joda.time.MutableInterval();
        long long1 = mutableInterval0.toDurationMillis();
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval0.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration3);
        mutableInterval0.setInterval(100000L, 1645455028646L);
        long long8 = mutableInterval0.getStartMillis();
        org.joda.time.ReadableInstant readableInstant9 = null;
        boolean boolean10 = mutableInterval0.isBefore(readableInstant9);
        mutableInterval0.setDurationBeforeEnd(1645455031834L);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        long long15 = dateTime14.getMillis();
        org.joda.time.DateTime.Property property16 = dateTime14.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.roundFloorCopy();
        int int18 = property16.getMinimumValue();
        org.joda.time.DateTime dateTime20 = property16.setCopy(30);
        org.joda.time.DateTime.Property property21 = dateTime20.secondOfMinute();
        mutableInterval0.setStart((org.joda.time.ReadableInstant) dateTime20);
        boolean boolean24 = mutableInterval0.equals((java.lang.Object) 1645417987461L);
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval();
        long long26 = mutableInterval25.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval28 = mutableInterval27.toInterval();
        boolean boolean29 = mutableInterval25.overlaps((org.joda.time.ReadableInterval) mutableInterval27);
        java.lang.Object obj30 = mutableInterval25.clone();
        org.joda.time.Chronology chronology31 = mutableInterval25.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.yearOfEra();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.yearOfCentury();
        org.joda.time.DurationField durationField35 = chronology31.years();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(chronology31);
        org.joda.time.DateTime dateTime38 = dateTime36.minusWeeks(53674168);
        org.joda.time.Instant instant40 = org.joda.time.Instant.parse("2022-02-21T14:50:34.430Z");
        org.joda.time.MutableDateTime mutableDateTime41 = instant40.toMutableDateTimeISO();
        org.joda.time.MutableInterval mutableInterval42 = new org.joda.time.MutableInterval();
        long long43 = mutableInterval42.toDurationMillis();
        org.joda.time.Duration duration45 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval42.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration45);
        org.joda.time.Duration duration48 = duration45.plus((long) 8);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval();
        long long50 = mutableInterval49.toDurationMillis();
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval49.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration52);
        org.joda.time.Period period54 = duration52.toPeriod();
        org.joda.time.Duration duration55 = duration52.toDuration();
        boolean boolean56 = duration48.isEqual((org.joda.time.ReadableDuration) duration52);
        org.joda.time.Instant instant58 = instant40.withDurationAdded((org.joda.time.ReadableDuration) duration52, 39092882);
        mutableInterval0.setInterval((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) instant58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant40 and mutableDateTime41", (instant40.compareTo(mutableDateTime41) == 0) == instant40.equals(mutableDateTime41));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str4 = dateTimeZone2.getNameKey(1645455028293L);
        int int6 = dateTimeZone2.getOffset(1645455028293L);
        java.lang.String str8 = dateTimeZone2.getShortName(1645455037062L);
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        org.joda.time.Instant instant11 = dateTime9.toInstant();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) (byte) -1, (-1L), dateTimeZone14);
        org.joda.time.Period period16 = org.joda.time.Period.ZERO;
        org.joda.time.Period period18 = period16.minusSeconds((int) (short) 1);
        org.joda.time.Period period20 = period16.plusWeeks((int) (short) -1);
        org.joda.time.Period period22 = period16.minusMillis(4);
        org.joda.time.Interval interval23 = interval15.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period25 = period16.withHours((int) 'a');
        org.joda.time.DurationFieldType durationFieldType27 = period16.getFieldType(0);
        org.joda.time.Duration duration28 = period16.toStandardDuration();
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval();
        long long30 = mutableInterval29.toDurationMillis();
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval29.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Duration duration35 = duration32.plus((long) 8);
        boolean boolean36 = duration28.isEqual((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Instant instant37 = instant11.plus((org.joda.time.ReadableDuration) duration28);
        java.util.Date date38 = instant11.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant11", (dateTime9.compareTo(instant11) == 0) == dateTime9.equals(instant11));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        java.lang.String str3 = dateTime2.toString();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) (short) 10);
        boolean boolean7 = dateTime5.isBefore((-1L));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str12 = dateTimeZone10.getShortName(52L);
        org.joda.time.DateTime dateTime13 = dateTime5.toDateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) 1645455052362L, dateTimeZone10);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone10);
        int int16 = dateTime15.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime13", (dateTime5.compareTo(dateTime13) == 0) == dateTime5.equals(dateTime13));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str4 = dateTimeZone2.getNameKey(1645455028293L);
        int int6 = dateTimeZone2.getOffset(1645455028293L);
        long long10 = dateTimeZone2.convertLocalToUTC((long) 3, false, 1645455032819L);
        java.lang.String str12 = dateTimeZone2.getShortName(1645455052649L);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        java.lang.String str15 = dateTime14.toString();
        org.joda.time.DateTime dateTime17 = dateTime14.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTime(chronology18);
        org.joda.time.DateTime dateTime20 = dateTime17.toDateTime();
        org.joda.time.DateTime dateTime22 = dateTime20.withMillisOfDay(1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant();
        org.joda.time.Instant instant24 = instant23.toInstant();
        boolean boolean25 = dateTime22.isAfter((org.joda.time.ReadableInstant) instant24);
        org.joda.time.LocalDateTime localDateTime26 = dateTime22.toLocalDateTime();
        boolean boolean27 = dateTimeZone2.isLocalDateTimeGap(localDateTime26);
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.time();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((-1L), 1L, periodType33, chronology34);
        java.lang.String str36 = periodType33.toString();
        java.lang.String str37 = periodType33.getName();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(1645455029643L, periodType33);
        org.joda.time.PeriodType periodType39 = periodType33.withWeeksRemoved();
        org.joda.time.Period period40 = new org.joda.time.Period(0L, 1645455278493L, periodType39);
        boolean boolean41 = localDateTime26.equals((java.lang.Object) 0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant23", (dateTime14.compareTo(instant23) == 0) == dateTime14.equals(instant23));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        java.lang.String str4 = dateTime3.toString();
        org.joda.time.DateTime dateTime6 = dateTime3.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime(chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        java.lang.String str11 = dateTime10.toString();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology14);
        org.joda.time.DateTime dateTime16 = dateTime10.minus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.DateTime dateTime17 = dateTime10.toDateTimeISO();
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes(0);
        boolean boolean20 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime.Property property21 = dateTime6.year();
        org.joda.time.DateTime dateTime23 = dateTime6.minus(1645455041013L);
        org.joda.time.Instant instant24 = dateTime6.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.year();
        int int26 = instant24.get(dateTimeFieldType25);
        long long27 = instant24.getMillis();
        org.joda.time.Chronology chronology28 = instant24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 159, 6048000000L, chronology28);
        mutablePeriod29.addWeeks(53498199);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant24", (dateTime6.compareTo(instant24) == 0) == dateTime6.equals(instant24));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-21T14:50:34.430Z");
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone3);
        long long5 = dateTime4.getMillis();
        org.joda.time.DateTime.Property property6 = dateTime4.yearOfEra();
        org.joda.time.Interval interval7 = property6.toInterval();
        java.util.Locale locale8 = null;
        int int9 = property6.getMaximumTextLength(locale8);
        java.lang.String str10 = property6.getName();
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        java.lang.String str15 = dateTime14.toString();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology18);
        org.joda.time.DateTime dateTime20 = dateTime14.minus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Period period21 = duration12.toPeriodFrom((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Duration duration23 = duration12.minus(0L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.time();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((-1L), 1L, periodType28, chronology29);
        java.lang.String str31 = periodType28.toString();
        java.lang.String str32 = periodType28.getName();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(1645455029643L, periodType28);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant24, periodType28);
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval();
        long long36 = mutableInterval35.toDurationMillis();
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval35.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone40);
        long long42 = dateTime41.getMillis();
        org.joda.time.DateTime dateTime44 = dateTime41.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime46 = dateTime44.plusSeconds((int) (byte) 10);
        org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration38, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Duration duration48 = duration12.minus((org.joda.time.ReadableDuration) duration38);
        boolean boolean49 = property6.equals((java.lang.Object) duration12);
        org.joda.time.Instant instant50 = instant1.plus((org.joda.time.ReadableDuration) duration12);
        org.joda.time.Instant instant52 = instant1.withMillis(1645455190451L);
        org.joda.time.Instant instant54 = instant52.minus(1645455508883L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.Period period3 = duration2.toPeriod();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval();
        long long7 = mutableInterval6.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval9 = mutableInterval8.toInterval();
        boolean boolean10 = mutableInterval6.overlaps((org.joda.time.ReadableInterval) mutableInterval8);
        java.lang.Object obj11 = mutableInterval6.clone();
        org.joda.time.Chronology chronology12 = mutableInterval6.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(1645455029820L, chronology12);
        boolean boolean17 = dateTimeFieldType4.isSupported(chronology12);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((java.lang.Object) duration2, chronology12);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone19);
        java.lang.String str21 = dateTime20.toString();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology24);
        org.joda.time.DateTime dateTime26 = dateTime20.minus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.DateTime dateTime29 = dateTime26.withDurationAdded(1645455046184L, 3);
        int int30 = dateTime29.getMonthOfYear();
        org.joda.time.Instant instant31 = dateTime29.toInstant();
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval();
        long long33 = mutableInterval32.toDurationMillis();
        mutableInterval32.setEndMillis(10L);
        org.joda.time.Interval interval36 = mutableInterval32.toInterval();
        boolean boolean38 = interval36.isAfter(1645455029375L);
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval();
        long long40 = mutableInterval39.toDurationMillis();
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval39.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Duration duration45 = duration42.plus((long) 8);
        org.joda.time.Seconds seconds46 = duration42.toStandardSeconds();
        org.joda.time.Duration duration47 = duration42.toDuration();
        org.joda.time.Interval interval48 = interval36.withDurationAfterStart((org.joda.time.ReadableDuration) duration42);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod();
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType55 = periodType54.withYearsRemoved();
        org.joda.time.PeriodType periodType56 = periodType55.withSecondsRemoved();
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval();
        long long58 = mutableInterval57.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval60 = mutableInterval59.toInterval();
        boolean boolean61 = mutableInterval57.overlaps((org.joda.time.ReadableInterval) mutableInterval59);
        java.lang.Object obj62 = mutableInterval57.clone();
        org.joda.time.Chronology chronology63 = mutableInterval57.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.yearOfEra();
        org.joda.time.Period period65 = new org.joda.time.Period(1645455029672L, (long) 3, periodType55, chronology63);
        mutablePeriod50.add(1645455030370L, chronology63);
        org.joda.time.Period period67 = new org.joda.time.Period(1645455035827L, chronology63);
        org.joda.time.Period period69 = period67.plusWeeks(4369741);
        org.joda.time.Interval interval70 = interval36.withPeriodAfterStart((org.joda.time.ReadablePeriod) period69);
        org.joda.time.PeriodType periodType72 = org.joda.time.PeriodType.days();
        org.joda.time.MutableInterval mutableInterval73 = new org.joda.time.MutableInterval();
        long long74 = mutableInterval73.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval76 = mutableInterval75.toInterval();
        boolean boolean77 = mutableInterval73.overlaps((org.joda.time.ReadableInterval) mutableInterval75);
        java.lang.Object obj78 = mutableInterval73.clone();
        org.joda.time.Chronology chronology79 = mutableInterval73.getChronology();
        org.joda.time.DateTimeField dateTimeField80 = chronology79.yearOfEra();
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) 8, periodType72, chronology79);
        org.joda.time.Period period82 = interval70.toPeriod(periodType72);
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, (org.joda.time.ReadableInstant) dateTime29, periodType72);
        org.joda.time.PeriodType periodType84 = periodType72.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((long) 254, periodType72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and instant31", (dateTime29.compareTo(instant31) == 0) == dateTime29.equals(instant31));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        java.lang.String str2 = dateTime1.toString();
        org.joda.time.DateTime dateTime4 = dateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.toDateTime(chronology5);
        org.joda.time.DateTime dateTime7 = dateTime4.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMillisOfDay(1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant10.toInstant();
        boolean boolean12 = dateTime9.isAfter((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Instant instant14 = instant11.minus(1645455086172L);
        org.joda.time.MutableDateTime mutableDateTime15 = instant11.toMutableDateTimeISO();
        org.joda.time.Instant instant17 = instant11.minus(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant17", (dateTime1.compareTo(instant17) == 0) == dateTime1.equals(instant17));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        java.lang.String str2 = dateTime1.toString();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime1.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.DateTime dateTime8 = dateTime1.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes(0);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        java.lang.String str15 = dateTime14.toString();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology18);
        org.joda.time.DateTime dateTime20 = dateTime14.minus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Period period21 = duration12.toPeriodFrom((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Duration duration23 = duration12.minus(0L);
        org.joda.time.DateTime dateTime25 = dateTime8.withDurationAdded((org.joda.time.ReadableDuration) duration23, (int) (byte) 0);
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone28);
        java.lang.String str30 = dateTime29.toString();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology33);
        org.joda.time.DateTime dateTime35 = dateTime29.minus((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Period period36 = duration27.toPeriodFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Duration duration38 = duration27.minus(0L);
        boolean boolean39 = duration23.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone40);
        java.lang.String str42 = dateTime41.toString();
        org.joda.time.DateTime dateTime44 = dateTime41.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.toDateTime(chronology45);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.months();
        org.joda.time.Period period48 = duration27.toPeriodTo((org.joda.time.ReadableInstant) dateTime44, periodType47);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod();
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadablePeriod) mutablePeriod49);
        boolean boolean52 = mutableInterval50.equals((java.lang.Object) "2022-02-22T01:12:52.069+10:22");
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(dateTimeZone53);
        java.lang.String str55 = dateTime54.toString();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology58);
        org.joda.time.DateTime dateTime60 = dateTime54.minus((org.joda.time.ReadablePeriod) period59);
        org.joda.time.DateTime dateTime61 = dateTime54.toDateTimeISO();
        org.joda.time.DateTime dateTime63 = dateTime61.minusMinutes(0);
        org.joda.time.DateTime dateTime65 = dateTime63.plusYears((int) '4');
        org.joda.time.Instant instant66 = dateTime63.toInstant();
        mutableInterval50.setEnd((org.joda.time.ReadableInstant) instant66);
        org.joda.time.DateTimeZone dateTimeZone68 = instant66.getZone();
        java.util.TimeZone timeZone69 = dateTimeZone68.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant66", (dateTime1.compareTo(instant66) == 0) == dateTime1.equals(instant66));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-21T14:50:34.430Z");
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTime();
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval();
        long long4 = mutableInterval3.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval6 = mutableInterval5.toInterval();
        boolean boolean7 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) mutableInterval5);
        java.lang.Object obj8 = mutableInterval3.clone();
        org.joda.time.Chronology chronology9 = mutableInterval3.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.monthOfYear();
        int int14 = instant1.get(dateTimeField13);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours(1645455083019L);
        org.joda.time.Instant instant17 = instant1.plus((org.joda.time.ReadableDuration) duration16);
        long long18 = duration16.getMillis();
        org.joda.time.Duration duration20 = duration16.plus(1640957880000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(1645455038843L, 1645455049723L);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.eras();
        boolean boolean4 = mutablePeriod2.isSupported(durationFieldType3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology10);
        org.joda.time.DateTime dateTime12 = dateTime6.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTimeISO();
        org.joda.time.DateTime dateTime15 = dateTime13.minusMinutes(0);
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears((int) '4');
        org.joda.time.Instant instant18 = dateTime15.toInstant();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone19);
        java.lang.String str21 = dateTime20.toString();
        org.joda.time.DateTime dateTime23 = dateTime20.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.toDateTime(chronology24);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.DateTime dateTime28 = dateTime23.withFieldAdded(durationFieldType26, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str33 = dateTimeZone31.getShortName(52L);
        boolean boolean34 = dateTimeZone31.isFixed();
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone31.getName(1645455042879L, locale36);
        org.joda.time.DateTime dateTime38 = dateTime28.withZoneRetainFields(dateTimeZone31);
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant18, (org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Interval interval40 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod2, (org.joda.time.ReadableInstant) instant18);
        org.joda.time.DateTime dateTime41 = interval40.getStart();
        org.joda.time.MutableInterval mutableInterval42 = interval40.toMutableInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant18", (dateTime6.compareTo(instant18) == 0) == dateTime6.equals(instant18));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        long long2 = dateTime1.getMillis();
        org.joda.time.DateTime.Property property3 = dateTime1.yearOfEra();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval();
        long long6 = mutableInterval5.toDurationMillis();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval5.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Interval interval10 = interval4.withDurationAfterStart((org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Interval interval12 = interval10.gap(readableInterval11);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod();
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType18 = periodType17.withYearsRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withSecondsRemoved();
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval();
        long long21 = mutableInterval20.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        boolean boolean24 = mutableInterval20.overlaps((org.joda.time.ReadableInterval) mutableInterval22);
        java.lang.Object obj25 = mutableInterval20.clone();
        org.joda.time.Chronology chronology26 = mutableInterval20.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfEra();
        org.joda.time.Period period28 = new org.joda.time.Period(1645455029672L, (long) 3, periodType18, chronology26);
        mutablePeriod13.add(1645455030370L, chronology26);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone30);
        java.lang.String str32 = dateTime31.toString();
        org.joda.time.DateTime dateTime34 = dateTime31.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.toDateTime(chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(dateTimeZone37);
        java.lang.String str39 = dateTime38.toString();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology42);
        org.joda.time.DateTime dateTime44 = dateTime38.minus((org.joda.time.ReadablePeriod) period43);
        org.joda.time.DateTime dateTime45 = dateTime38.toDateTimeISO();
        org.joda.time.DateTime dateTime47 = dateTime45.minusMinutes(0);
        boolean boolean48 = dateTime34.isEqual((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime.Property property49 = dateTime34.year();
        org.joda.time.Duration duration50 = mutablePeriod13.toDurationFrom((org.joda.time.ReadableInstant) dateTime34);
        boolean boolean51 = interval10.isAfter((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.Interval interval55 = new org.joda.time.Interval((long) (byte) -1, (-1L), dateTimeZone54);
        org.joda.time.Interval interval56 = interval55.toInterval();
        org.joda.time.Duration duration57 = interval55.toDuration();
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableDuration) duration57);
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval();
        long long60 = mutableInterval59.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        boolean boolean63 = mutableInterval59.overlaps((org.joda.time.ReadableInterval) mutableInterval61);
        java.lang.Object obj64 = mutableInterval59.clone();
        org.joda.time.Chronology chronology65 = mutableInterval59.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.yearOfEra();
        org.joda.time.Chronology chronology67 = chronology65.withUTC();
        org.joda.time.DateTimeZone dateTimeZone68 = chronology67.getZone();
        java.util.Locale locale70 = null;
        java.lang.String str71 = dateTimeZone68.getShortName(1645455068377L, locale70);
        java.util.Locale locale73 = null;
        java.lang.String str74 = dateTimeZone68.getShortName(0L, locale73);
        org.joda.time.DateTime dateTime75 = dateTime34.withZone(dateTimeZone68);
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        long long78 = dateTimeZone68.getMillisKeepLocal(dateTimeZone76, 0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and dateTime75", (dateTime34.compareTo(dateTime75) == 0) == dateTime34.equals(dateTime75));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) (byte) -1, (-1L), dateTimeZone2);
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.Period period6 = period4.minusSeconds((int) (short) 1);
        org.joda.time.Period period8 = period4.plusWeeks((int) (short) -1);
        org.joda.time.Period period10 = period4.minusMillis(4);
        org.joda.time.Interval interval11 = interval3.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period4);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) (byte) -1, (-1L), dateTimeZone14);
        org.joda.time.Period period16 = org.joda.time.Period.ZERO;
        org.joda.time.Period period18 = period16.minusSeconds((int) (short) 1);
        org.joda.time.Period period20 = period16.plusWeeks((int) (short) -1);
        org.joda.time.Period period22 = period16.minusMillis(4);
        org.joda.time.Interval interval23 = interval15.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Interval interval24 = interval3.gap((org.joda.time.ReadableInterval) interval23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone25);
        long long27 = dateTime26.getMillis();
        org.joda.time.DateTime.Property property28 = dateTime26.yearOfEra();
        org.joda.time.Interval interval29 = property28.toInterval();
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval();
        long long31 = mutableInterval30.toDurationMillis();
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval30.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Interval interval35 = interval29.withDurationAfterStart((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Interval interval36 = interval29.toInterval();
        org.joda.time.Interval interval38 = interval36.withEndMillis(2339679030463L);
        boolean boolean39 = interval23.isAfter((org.joda.time.ReadableInterval) interval36);
        org.joda.time.Chronology chronology40 = interval23.getChronology();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        org.joda.time.DateTime dateTime43 = dateTime41.withMillis(1645455064409L);
        org.joda.time.Instant instant44 = dateTime41.toInstant();
        org.joda.time.DateTime dateTime46 = dateTime41.withWeekyear(4764357);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant44", (dateTime26.compareTo(instant44) == 0) == dateTime26.equals(instant44));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant2.minus((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone6);
        long long8 = dateTime7.getMillis();
        org.joda.time.DateTime.Property property9 = dateTime7.yearOfEra();
        org.joda.time.DateTime dateTime10 = property9.roundFloorCopy();
        org.joda.time.Period period11 = org.joda.time.Period.ZERO;
        org.joda.time.Period period13 = period11.minusSeconds((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean15 = period13.equals((java.lang.Object) dateTimeFieldType14);
        int int16 = dateTime10.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime18 = dateTime10.minusMillis(9);
        boolean boolean19 = instant5.isBefore((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.MutableDateTime mutableDateTime20 = instant5.toMutableDateTimeISO();
        org.joda.time.Duration duration21 = new org.joda.time.Duration((org.joda.time.ReadableInstant) instant0, (org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.DateTime dateTime22 = instant0.toDateTimeISO();
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone29);
        java.lang.String str31 = dateTime30.toString();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology34);
        org.joda.time.DateTime dateTime36 = dateTime30.minus((org.joda.time.ReadablePeriod) period35);
        org.joda.time.Period period37 = duration28.toPeriodFrom((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Seconds seconds38 = period37.toStandardSeconds();
        int int39 = period37.getMillis();
        org.joda.time.DurationFieldType durationFieldType41 = period37.getFieldType(0);
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType45 = periodType44.withYearsRemoved();
        org.joda.time.PeriodType periodType46 = periodType45.withSecondsRemoved();
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval();
        long long48 = mutableInterval47.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval50 = mutableInterval49.toInterval();
        boolean boolean51 = mutableInterval47.overlaps((org.joda.time.ReadableInterval) mutableInterval49);
        java.lang.Object obj52 = mutableInterval47.clone();
        org.joda.time.Chronology chronology53 = mutableInterval47.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.yearOfEra();
        org.joda.time.Period period55 = new org.joda.time.Period(1645455029672L, (long) 3, periodType45, chronology53);
        org.joda.time.DateTimeField dateTimeField56 = chronology53.dayOfMonth();
        boolean boolean57 = durationFieldType41.isSupported(chronology53);
        org.joda.time.Period period58 = new org.joda.time.Period((long) (short) 100, 1645455046455L, chronology53);
        org.joda.time.DateTimeField dateTimeField59 = chronology53.monthOfYear();
        org.joda.time.Period period60 = new org.joda.time.Period(1645455080732L, chronology53);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(1645455182495L, chronology53);
        org.joda.time.DateTime dateTime62 = dateTime22.minus((org.joda.time.ReadablePeriod) mutablePeriod61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        java.lang.String str4 = dateTime3.toString();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology7);
        org.joda.time.DateTime dateTime9 = dateTime3.minus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period10 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.Duration duration12 = duration1.minus(0L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.time();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((-1L), 1L, periodType17, chronology18);
        java.lang.String str20 = periodType17.toString();
        java.lang.String str21 = periodType17.getName();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(1645455029643L, periodType17);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, readableInstant13, periodType17);
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval();
        long long25 = mutableInterval24.toDurationMillis();
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval24.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone29);
        long long31 = dateTime30.getMillis();
        org.joda.time.DateTime dateTime33 = dateTime30.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime35 = dateTime33.plusSeconds((int) (byte) 10);
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration27, (org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Duration duration37 = duration1.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration40 = duration1.withDurationAdded(1645455036379L, 22);
        org.joda.time.Hours hours41 = duration1.toStandardHours();
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone44);
        java.lang.String str46 = dateTime45.toString();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology49);
        org.joda.time.DateTime dateTime51 = dateTime45.minus((org.joda.time.ReadablePeriod) period50);
        org.joda.time.Period period52 = duration43.toPeriodFrom((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Duration duration54 = duration43.minus(0L);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType59 = org.joda.time.PeriodType.time();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((-1L), 1L, periodType59, chronology60);
        java.lang.String str62 = periodType59.toString();
        java.lang.String str63 = periodType59.getName();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(1645455029643L, periodType59);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration43, readableInstant55, periodType59);
        org.joda.time.MutableInterval mutableInterval66 = new org.joda.time.MutableInterval();
        long long67 = mutableInterval66.toDurationMillis();
        org.joda.time.Duration duration69 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval66.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration69);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime(dateTimeZone71);
        long long73 = dateTime72.getMillis();
        org.joda.time.DateTime dateTime75 = dateTime72.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime77 = dateTime75.plusSeconds((int) (byte) 10);
        org.joda.time.Period period78 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration69, (org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.Duration duration79 = duration43.minus((org.joda.time.ReadableDuration) duration69);
        org.joda.time.Duration duration82 = duration43.withDurationAdded(1645455036379L, 22);
        org.joda.time.Hours hours83 = duration43.toStandardHours();
        boolean boolean84 = duration1.isEqual((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Instant instant85 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime86 = instant85.toMutableDateTimeISO();
        org.joda.time.Interval interval87 = duration1.toIntervalFrom((org.joda.time.ReadableInstant) mutableDateTime86);
        java.util.Date date88 = mutableDateTime86.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant85", (dateTime3.compareTo(instant85) == 0) == dateTime3.equals(instant85));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(dateTimeZone4);
        java.lang.String str6 = dateTime5.toString();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology9);
        org.joda.time.DateTime dateTime11 = dateTime5.minus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period12 = duration3.toPeriodFrom((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Duration duration14 = duration3.minus(0L);
        org.joda.time.Duration duration16 = duration3.withMillis(1645455034114L);
        org.joda.time.Instant instant17 = instant0.minus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Instant instant19 = instant0.withMillis((long) 9);
        org.joda.time.Instant instant21 = instant19.minus(1645455060010L);
        org.joda.time.Instant instant23 = instant19.minus(1645455066597L);
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone26);
        java.lang.String str28 = dateTime27.toString();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology31);
        org.joda.time.DateTime dateTime33 = dateTime27.minus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period34 = duration25.toPeriodFrom((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Duration duration36 = duration25.minus(0L);
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval();
        long long38 = mutableInterval37.toDurationMillis();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval37.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Duration duration43 = duration40.plus((long) 8);
        org.joda.time.Duration duration45 = duration36.withDurationAdded((org.joda.time.ReadableDuration) duration43, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(dateTimeZone46);
        long long48 = dateTime47.getMillis();
        org.joda.time.DateTime.Property property49 = dateTime47.yearOfEra();
        org.joda.time.Interval interval50 = property49.toInterval();
        java.util.Locale locale51 = null;
        int int52 = property49.getMaximumTextLength(locale51);
        java.lang.String str53 = property49.getName();
        org.joda.time.Duration duration55 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(dateTimeZone56);
        java.lang.String str58 = dateTime57.toString();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology61);
        org.joda.time.DateTime dateTime63 = dateTime57.minus((org.joda.time.ReadablePeriod) period62);
        org.joda.time.Period period64 = duration55.toPeriodFrom((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.Duration duration66 = duration55.minus(0L);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.time();
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((-1L), 1L, periodType71, chronology72);
        java.lang.String str74 = periodType71.toString();
        java.lang.String str75 = periodType71.getName();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod(1645455029643L, periodType71);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration55, readableInstant67, periodType71);
        org.joda.time.MutableInterval mutableInterval78 = new org.joda.time.MutableInterval();
        long long79 = mutableInterval78.toDurationMillis();
        org.joda.time.Duration duration81 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval78.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration81);
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime(dateTimeZone83);
        long long85 = dateTime84.getMillis();
        org.joda.time.DateTime dateTime87 = dateTime84.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime89 = dateTime87.plusSeconds((int) (byte) 10);
        org.joda.time.Period period90 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration81, (org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.Duration duration91 = duration55.minus((org.joda.time.ReadableDuration) duration81);
        boolean boolean92 = property49.equals((java.lang.Object) duration55);
        int int93 = duration45.compareTo((org.joda.time.ReadableDuration) duration55);
        org.joda.time.Minutes minutes94 = duration55.toStandardMinutes();
        org.joda.time.Period period95 = duration55.toPeriod();
        org.joda.time.Instant instant96 = instant23.plus((org.joda.time.ReadableDuration) duration55);
        org.joda.time.Instant instant98 = instant23.plus((long) 11833);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.joda.time.MutableInterval mutableInterval0 = new org.joda.time.MutableInterval();
        long long1 = mutableInterval0.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        boolean boolean4 = mutableInterval0.overlaps((org.joda.time.ReadableInterval) mutableInterval2);
        java.lang.Object obj5 = mutableInterval0.clone();
        org.joda.time.Chronology chronology6 = mutableInterval0.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfEra();
        java.util.Locale locale8 = null;
        int int9 = dateTimeField7.getMaximumTextLength(locale8);
        boolean boolean10 = dateTimeField7.isSupported();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeField7.getAsShortText((-37320000L), locale12);
        org.joda.time.DurationField durationField14 = dateTimeField7.getLeapDurationField();
        java.util.Locale locale15 = null;
        int int16 = dateTimeField7.getMaximumShortTextLength(locale15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        long long19 = dateTime18.getMillis();
        org.joda.time.DateTime.Property property20 = dateTime18.yearOfEra();
        org.joda.time.DateTime dateTime21 = property20.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean23 = dateTime21.isSupported(dateTimeFieldType22);
        org.joda.time.Instant instant24 = dateTime21.toInstant();
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone27);
        java.lang.String str29 = dateTime28.toString();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology32);
        org.joda.time.DateTime dateTime34 = dateTime28.minus((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Period period35 = duration26.toPeriodFrom((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval();
        long long37 = mutableInterval36.toDurationMillis();
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval36.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone41);
        long long43 = dateTime42.getMillis();
        org.joda.time.DateTime dateTime45 = dateTime42.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime47 = dateTime45.plusSeconds((int) (byte) 10);
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration39, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Period period49 = duration26.toPeriodFrom((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.LocalTime localTime50 = dateTime47.toLocalTime();
        org.joda.time.DateTime dateTime51 = dateTime21.withFields((org.joda.time.ReadablePartial) localTime50);
        int int52 = dateTimeField7.getMinimumValue((org.joda.time.ReadablePartial) localTime50);
        java.util.Locale locale54 = null;
        java.lang.String str55 = dateTimeField7.getAsText(4639, locale54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant24", (dateTime21.compareTo(instant24) == 0) == dateTime21.equals(instant24));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime2 = instant0.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone3);
        java.lang.String str5 = dateTime4.toString();
        org.joda.time.DateTime dateTime7 = dateTime4.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.toDateTime(chronology8);
        org.joda.time.DateTime dateTime10 = dateTime7.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        java.lang.String str13 = dateTime12.toString();
        org.joda.time.DateTime dateTime15 = dateTime12.withMillisOfSecond((int) (short) 10);
        int int16 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateTime12);
        int int17 = dateTime7.getMonthOfYear();
        org.joda.time.DateTime dateTime19 = dateTime7.minusMillis(4386659);
        org.joda.time.DateTime dateTime21 = dateTime7.withYearOfCentury(14);
        org.joda.time.DateTime dateTime22 = dateTime21.withEarlierOffsetAtOverlap();
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval();
        long long24 = mutableInterval23.toDurationMillis();
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval23.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration29 = duration26.plus((long) 8);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone30);
        java.lang.String str32 = dateTime31.toString();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology35);
        org.joda.time.DateTime dateTime37 = dateTime31.minus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.DateTime dateTime38 = dateTime31.withEarlierOffsetAtOverlap();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime38.withZoneRetainFields(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(dateTimeZone42);
        long long44 = dateTime43.getMillis();
        org.joda.time.DateTime dateTime46 = dateTime43.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime47 = dateTime46.toDateTimeISO();
        org.joda.time.YearMonthDay yearMonthDay48 = dateTime47.toYearMonthDay();
        int int49 = yearMonthDay48.size();
        org.joda.time.DateTime dateTime50 = dateTime38.withFields((org.joda.time.ReadablePartial) yearMonthDay48);
        org.joda.time.DateTime dateTime52 = dateTime50.withWeekOfWeekyear((int) '#');
        boolean boolean53 = dateTime50.isAfterNow();
        org.joda.time.Chronology chronology54 = dateTime50.getChronology();
        boolean boolean55 = dateTime21.isBefore((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime2, (org.joda.time.ReadableInstant) dateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        long long2 = dateTime1.getMillis();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str11 = dateTimeZone9.getNameKey(1645455028293L);
        org.joda.time.DateTime dateTime12 = dateTime4.withZone(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay13 = dateTime12.toYearMonthDay();
        org.joda.time.DateTime.Property property14 = dateTime12.weekyear();
        org.joda.time.DateTime dateTime15 = property14.roundCeilingCopy();
        java.util.Date date16 = dateTime15.toDate();
        java.lang.Object obj17 = null;
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType19 = periodType18.withMinutesRemoved();
        int int20 = periodType19.size();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone21);
        java.lang.String str23 = dateTime22.toString();
        org.joda.time.DateTime dateTime25 = dateTime22.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.toDateTime(chronology26);
        org.joda.time.DateTime dateTime28 = dateTime25.toDateTime();
        org.joda.time.DateTime dateTime31 = dateTime25.withDurationAdded((long) (short) 1, (int) (short) 100);
        org.joda.time.DateTime dateTime33 = dateTime25.withYear(2);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone34);
        long long36 = dateTime35.getMillis();
        org.joda.time.DateTime.Property property37 = dateTime35.yearOfEra();
        org.joda.time.Interval interval38 = property37.toInterval();
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval();
        long long40 = mutableInterval39.toDurationMillis();
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval39.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Interval interval44 = interval38.withDurationAfterStart((org.joda.time.ReadableDuration) duration42);
        boolean boolean45 = dateTime25.equals((java.lang.Object) interval38);
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval();
        long long47 = mutableInterval46.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        boolean boolean50 = mutableInterval46.overlaps((org.joda.time.ReadableInterval) mutableInterval48);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(dateTimeZone51);
        long long53 = dateTime52.getMillis();
        org.joda.time.DateTime dateTime55 = dateTime52.plusWeeks((int) (byte) 10);
        boolean boolean56 = mutableInterval46.contains((org.joda.time.ReadableInstant) dateTime55);
        int int57 = dateTime55.getMillisOfDay();
        org.joda.time.DateTime dateTime59 = dateTime55.plusYears(3);
        boolean boolean60 = interval38.contains((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.Chronology chronology61 = interval38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod(obj17, periodType19, chronology61);
        org.joda.time.DateTimeField dateTimeField63 = chronology61.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = dateTimeField63.getType();
        org.joda.time.DateTime.Property property65 = dateTime15.property(dateTimeFieldType64);
        org.joda.time.DateTime.Property property66 = dateTime15.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime12", (dateTime4.compareTo(dateTime12) == 0) == dateTime4.equals(dateTime12));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        java.lang.String str4 = dateTime3.toString();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology7);
        org.joda.time.DateTime dateTime9 = dateTime3.minus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period10 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.DateTime dateTime12 = dateTime3.minusSeconds((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone14);
        java.lang.String str16 = dateTime15.toString();
        org.joda.time.DateTime dateTime18 = dateTime15.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime(chronology19);
        org.joda.time.DateTime dateTime21 = dateTime18.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.withMillisOfDay(1);
        org.joda.time.DateTime dateTime24 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        boolean boolean26 = dateTimeFieldType13.isSupported(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime12.withField(dateTimeFieldType13, 27);
        int int29 = dateTime28.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(37320000);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime28.toMutableDateTime(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime32", (dateTime3.compareTo(dateTime32) == 0) == dateTime3.equals(dateTime32));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        java.lang.String str4 = dateTime3.toString();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology7);
        org.joda.time.DateTime dateTime9 = dateTime3.minus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period10 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.Duration duration12 = duration1.minus(0L);
        org.joda.time.Duration duration14 = duration1.withMillis(1645455034114L);
        java.lang.String str15 = duration1.toString();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval();
        long long18 = mutableInterval17.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        boolean boolean21 = mutableInterval17.overlaps((org.joda.time.ReadableInterval) mutableInterval19);
        java.lang.Object obj22 = mutableInterval17.clone();
        org.joda.time.Chronology chronology23 = mutableInterval17.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = chronology23.minuteOfDay();
        org.joda.time.DurationField durationField26 = chronology23.halfdays();
        org.joda.time.Period period27 = duration1.toPeriod(periodType16, chronology23);
        org.joda.time.DateTimeField dateTimeField28 = chronology23.monthOfYear();
        org.joda.time.DurationField durationField29 = chronology23.centuries();
        org.joda.time.DateTimeField dateTimeField30 = chronology23.minuteOfDay();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology23);
        org.joda.time.DateTime dateTime33 = dateTime31.withMillisOfDay(14);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone34);
        long long36 = dateTime35.getMillis();
        org.joda.time.DateTime dateTime38 = dateTime35.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime40 = dateTime38.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str45 = dateTimeZone43.getNameKey(1645455028293L);
        org.joda.time.DateTime dateTime46 = dateTime38.withZone(dateTimeZone43);
        org.joda.time.YearMonthDay yearMonthDay47 = dateTime46.toYearMonthDay();
        org.joda.time.DateTimeField dateTimeField49 = yearMonthDay47.getField(0);
        boolean boolean50 = dateTimeField49.isLenient();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(dateTimeZone51);
        long long53 = dateTime52.getMillis();
        org.joda.time.DateTime dateTime55 = dateTime52.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime57 = dateTime55.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str62 = dateTimeZone60.getNameKey(1645455028293L);
        org.joda.time.DateTime dateTime63 = dateTime55.withZone(dateTimeZone60);
        org.joda.time.YearMonthDay yearMonthDay64 = dateTime63.toYearMonthDay();
        org.joda.time.DateTimeField dateTimeField66 = yearMonthDay64.getField(0);
        java.util.Locale locale68 = null;
        java.lang.String str69 = dateTimeField49.getAsText((org.joda.time.ReadablePartial) yearMonthDay64, (int) (short) 10, locale68);
        org.joda.time.DateTime dateTime70 = dateTime33.withFields((org.joda.time.ReadablePartial) yearMonthDay64);
        int int71 = dateTime70.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and dateTime46", (dateTime38.compareTo(dateTime46) == 0) == dateTime38.equals(dateTime46));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        java.lang.String str2 = dateTime1.toString();
        org.joda.time.DateTime dateTime4 = dateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.toDateTime(chronology5);
        org.joda.time.DateTime dateTime7 = dateTime4.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime4.withDurationAdded((long) (short) 1, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        java.lang.String str13 = dateTime12.toString();
        org.joda.time.DateTime dateTime15 = dateTime12.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.toDateTime(chronology16);
        org.joda.time.DateTime dateTime18 = dateTime15.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.withMillisOfDay(1);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone21);
        java.lang.String str23 = dateTime22.toString();
        org.joda.time.DateTime dateTime25 = dateTime22.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.toDateTime(chronology26);
        org.joda.time.DateTime dateTime28 = dateTime25.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.withMillisOfDay(1);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str35 = dateTimeZone33.getNameKey(1645455028293L);
        int int37 = dateTimeZone33.getOffset(1645455028293L);
        org.joda.time.DateTime dateTime38 = dateTime28.toDateTime(dateTimeZone33);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime38);
        boolean boolean40 = dateTime4.isAfter((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval();
        long long42 = mutableInterval41.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval44 = mutableInterval43.toInterval();
        boolean boolean45 = mutableInterval41.overlaps((org.joda.time.ReadableInterval) mutableInterval43);
        java.lang.Object obj46 = mutableInterval41.clone();
        org.joda.time.Chronology chronology47 = mutableInterval41.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.yearOfEra();
        org.joda.time.Chronology chronology49 = chronology47.withUTC();
        org.joda.time.DateTimeZone dateTimeZone50 = chronology49.getZone();
        java.util.Locale locale52 = null;
        java.lang.String str53 = dateTimeZone50.getShortName(1645455068377L, locale52);
        java.util.Locale locale55 = null;
        java.lang.String str56 = dateTimeZone50.getShortName(0L, locale55);
        boolean boolean57 = dateTime4.equals((java.lang.Object) dateTimeZone50);
        long long59 = dateTimeZone50.nextTransition(1645455174527L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime38", (dateTime4.compareTo(dateTime38) == 0) == dateTime4.equals(dateTime38));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        java.lang.String str2 = dateTime1.toString();
        org.joda.time.DateTime dateTime4 = dateTime1.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.toDateTime(chronology5);
        org.joda.time.DateTime dateTime7 = dateTime4.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMillisOfDay(1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        java.lang.String str12 = dateTime11.toString();
        org.joda.time.DateTime dateTime14 = dateTime11.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.DateTime dateTime17 = dateTime14.toDateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.withMillisOfDay(1);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str24 = dateTimeZone22.getNameKey(1645455028293L);
        int int26 = dateTimeZone22.getOffset(1645455028293L);
        org.joda.time.DateTime dateTime27 = dateTime17.toDateTime(dateTimeZone22);
        org.joda.time.Interval interval28 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime27);
        int int29 = dateTime9.getMillisOfDay();
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval();
        long long31 = mutableInterval30.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval33 = mutableInterval32.toInterval();
        boolean boolean34 = mutableInterval30.overlaps((org.joda.time.ReadableInterval) mutableInterval32);
        java.lang.Object obj35 = mutableInterval30.clone();
        org.joda.time.Chronology chronology36 = mutableInterval30.getChronology();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(dateTimeZone37);
        long long39 = dateTime38.getMillis();
        org.joda.time.DateTime dateTime41 = dateTime38.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime43 = dateTime41.minusMonths((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone44);
        java.lang.String str46 = dateTime45.toString();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology49);
        org.joda.time.DateTime dateTime51 = dateTime45.minus((org.joda.time.ReadablePeriod) period50);
        org.joda.time.DateTime dateTime52 = dateTime43.minus((org.joda.time.ReadablePeriod) period50);
        int int53 = dateTime43.getWeekOfWeekyear();
        boolean boolean54 = mutableInterval30.contains((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime dateTime57 = dateTime43.withDurationAdded(1645455063488L, 4383442);
        org.joda.time.DateTime dateTime59 = dateTime57.plusDays(4394936);
        org.joda.time.DateTime dateTime61 = dateTime57.withMillisOfSecond(6);
        int int62 = dateTime9.compareTo((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.LocalDateTime localDateTime63 = dateTime9.toLocalDateTime();
        org.joda.time.Chronology chronology64 = dateTime9.getChronology();
        org.joda.time.LocalTime localTime65 = dateTime9.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime27", (dateTime4.compareTo(dateTime27) == 0) == dateTime4.equals(dateTime27));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 22, 1645455035827L);
        org.joda.time.MutablePeriod mutablePeriod4 = mutablePeriod3.toMutablePeriod();
        mutablePeriod3.setDays(0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        java.lang.String str10 = dateTime9.toString();
        org.joda.time.DateTime dateTime12 = dateTime9.withMillisOfSecond((int) (short) 10);
        boolean boolean14 = dateTime12.isBefore((-1L));
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone15);
        java.lang.String str17 = dateTime16.toString();
        org.joda.time.DateTime dateTime19 = dateTime16.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime(chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone22);
        java.lang.String str24 = dateTime23.toString();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology27);
        org.joda.time.DateTime dateTime29 = dateTime23.minus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.DateTime dateTime30 = dateTime23.toDateTimeISO();
        org.joda.time.DateTime dateTime32 = dateTime30.minusMinutes(0);
        boolean boolean33 = dateTime19.isEqual((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime30);
        boolean boolean36 = mutableInterval34.contains(1L);
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval();
        long long38 = mutableInterval37.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        boolean boolean41 = mutableInterval37.overlaps((org.joda.time.ReadableInterval) mutableInterval39);
        java.lang.Object obj42 = mutableInterval37.clone();
        org.joda.time.Chronology chronology43 = mutableInterval37.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.yearOfEra();
        mutableInterval34.setChronology(chronology43);
        org.joda.time.DateTimeField dateTimeField46 = chronology43.clockhourOfDay();
        mutablePeriod3.add(0L, chronology43);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(1645455028293L, chronology43);
        mutablePeriod48.setSeconds(53482054);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod();
        org.joda.time.PeriodType periodType58 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType59 = periodType58.withYearsRemoved();
        org.joda.time.PeriodType periodType60 = periodType59.withSecondsRemoved();
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval();
        long long62 = mutableInterval61.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval64 = mutableInterval63.toInterval();
        boolean boolean65 = mutableInterval61.overlaps((org.joda.time.ReadableInterval) mutableInterval63);
        java.lang.Object obj66 = mutableInterval61.clone();
        org.joda.time.Chronology chronology67 = mutableInterval61.getChronology();
        org.joda.time.DateTimeField dateTimeField68 = chronology67.yearOfEra();
        org.joda.time.Period period69 = new org.joda.time.Period(1645455029672L, (long) 3, periodType59, chronology67);
        mutablePeriod54.add(1645455030370L, chronology67);
        org.joda.time.Period period71 = new org.joda.time.Period(1645455035827L, chronology67);
        org.joda.time.DurationField durationField72 = chronology67.halfdays();
        org.joda.time.DurationField durationField73 = chronology67.days();
        org.joda.time.DurationField durationField74 = chronology67.days();
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod(4392493L, chronology67);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str80 = dateTimeZone78.getShortName(52L);
        boolean boolean81 = dateTimeZone78.isFixed();
        org.joda.time.Chronology chronology82 = chronology67.withZone(dateTimeZone78);
        mutablePeriod48.setPeriod(1645455182140L, chronology67);
        org.joda.time.DateTimeZone dateTimeZone84 = chronology67.getZone();
        org.joda.time.DurationField durationField85 = chronology67.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField85, durationField72, and durationField73", !(durationField85.compareTo(durationField72) == 0) || (Math.signum(durationField85.compareTo(durationField73)) == Math.signum(durationField72.compareTo(durationField73))));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        long long2 = dateTime1.getMillis();
        org.joda.time.DateTime.Property property3 = dateTime1.yearOfEra();
        org.joda.time.Interval interval4 = property3.toInterval();
        java.lang.String str5 = property3.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property3.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property3.getFieldType();
        org.joda.time.DateTime dateTime9 = property3.addToCopy((long) 347);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime11 = instant10.toDateTimeISO();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        java.lang.String str15 = dateTime14.toString();
        org.joda.time.DateTime dateTime17 = dateTime14.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTime(chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone20);
        java.lang.String str22 = dateTime21.toString();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology25);
        org.joda.time.DateTime dateTime27 = dateTime21.minus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.DateTime dateTime28 = dateTime21.toDateTimeISO();
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes(0);
        boolean boolean31 = dateTime17.isEqual((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime32 = dateTime17.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DateTime dateTime35 = dateTime32.withField(dateTimeFieldType33, 9);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.Interval interval39 = new org.joda.time.Interval((long) (byte) -1, (-1L), dateTimeZone38);
        org.joda.time.Period period40 = org.joda.time.Period.ZERO;
        org.joda.time.Period period42 = period40.minusSeconds((int) (short) 1);
        org.joda.time.Period period44 = period40.plusWeeks((int) (short) -1);
        org.joda.time.Period period46 = period40.minusMillis(4);
        org.joda.time.Interval interval47 = interval39.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period40);
        org.joda.time.Period period49 = period40.withHours((int) 'a');
        org.joda.time.Minutes minutes50 = period40.toStandardMinutes();
        org.joda.time.Period period52 = period40.minusSeconds(3);
        org.joda.time.DateTime dateTime54 = dateTime32.withPeriodAdded((org.joda.time.ReadablePeriod) period40, (int) (short) -1);
        boolean boolean55 = dateTime32.isEqualNow();
        org.joda.time.DateTime dateTime56 = dateTime32.withTimeAtStartOfDay();
        boolean boolean57 = dateTime11.isEqual((org.joda.time.ReadableInstant) dateTime56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant10", (dateTime1.compareTo(instant10) == 0) == dateTime1.equals(instant10));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        long long2 = dateTime1.getMillis();
        org.joda.time.DateTime.Property property3 = dateTime1.yearOfEra();
        org.joda.time.DateTime dateTime4 = property3.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean6 = dateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.Instant instant7 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime8 = instant7.toDateTimeISO();
        org.joda.time.DateTime dateTime9 = instant7.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime10 = instant7.toMutableDateTime();
        org.joda.time.Instant instant13 = instant7.withDurationAdded((long) 73, 4493);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        java.lang.String str18 = dateTime17.toString();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology21);
        org.joda.time.DateTime dateTime23 = dateTime17.minus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period24 = duration15.toPeriodFrom((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Duration duration26 = duration15.minus(0L);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone27);
        java.lang.String str29 = dateTime28.toString();
        org.joda.time.DateTime dateTime31 = dateTime28.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.toDateTime(chronology32);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = duration26.toPeriodTo((org.joda.time.ReadableInstant) dateTime33, periodType34);
        int int36 = dateTime33.getDayOfMonth();
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardSeconds(1645455032819L);
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone40);
        java.lang.String str42 = dateTime41.toString();
        org.joda.time.DateTime dateTime44 = dateTime41.withMillisOfSecond((int) (short) 10);
        org.joda.time.DateTime dateTime46 = dateTime44.plusHours(2);
        org.joda.time.DateTime dateTime48 = dateTime44.minusSeconds(37320000);
        org.joda.time.Interval interval49 = duration38.toIntervalTo((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Interval interval51 = interval49.withChronology(chronology50);
        org.joda.time.Duration duration53 = org.joda.time.Duration.millis(1645455132110L);
        org.joda.time.Interval interval54 = interval49.withDurationAfterStart((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Instant instant55 = instant7.minus((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Seconds seconds56 = duration53.toStandardSeconds();
        org.joda.time.Duration duration57 = duration53.toDuration();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant7", (dateTime4.compareTo(instant7) == 0) == dateTime4.equals(instant7));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        long long2 = dateTime1.getMillis();
        org.joda.time.DateTime.Property property3 = dateTime1.yearOfEra();
        org.joda.time.DateTime dateTime4 = property3.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean6 = dateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.Instant instant7 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime9 = dateTime4.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime10 = dateTime9.toLocalDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant7", (dateTime4.compareTo(instant7) == 0) == dateTime4.equals(instant7));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        java.lang.String str4 = dateTime3.toString();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology7);
        org.joda.time.DateTime dateTime9 = dateTime3.minus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period10 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.Duration duration12 = duration1.minus(0L);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        java.lang.String str15 = dateTime14.toString();
        org.joda.time.DateTime dateTime17 = dateTime14.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTime(chronology18);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = duration12.toPeriodTo((org.joda.time.ReadableInstant) dateTime19, periodType20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone22);
        long long24 = dateTime23.getMillis();
        org.joda.time.DateTime.Property property25 = dateTime23.yearOfEra();
        org.joda.time.DateTime dateTime26 = property25.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean28 = dateTime26.isSupported(dateTimeFieldType27);
        org.joda.time.DateTime.Property property29 = dateTime19.property(dateTimeFieldType27);
        org.joda.time.DateTime dateTime31 = dateTime19.withYearOfEra(53486009);
        org.joda.time.DateTime.Property property32 = dateTime19.monthOfYear();
        org.joda.time.DateTime dateTime34 = dateTime19.plusSeconds(4889764);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone35);
        java.lang.String str37 = dateTime36.toString();
        org.joda.time.DateTime dateTime39 = dateTime36.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.toDateTime(chronology40);
        org.joda.time.DateTime dateTime42 = dateTime39.toDateTime();
        org.joda.time.DateTime dateTime44 = dateTime42.withMillisOfDay(1);
        org.joda.time.Instant instant45 = new org.joda.time.Instant();
        org.joda.time.Instant instant46 = instant45.toInstant();
        boolean boolean47 = dateTime44.isAfter((org.joda.time.ReadableInstant) instant46);
        org.joda.time.Instant instant49 = instant46.minus(1645455086172L);
        org.joda.time.Instant instant51 = instant46.plus(1645455106596L);
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(dateTimeZone54);
        java.lang.String str56 = dateTime55.toString();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology59);
        org.joda.time.DateTime dateTime61 = dateTime55.minus((org.joda.time.ReadablePeriod) period60);
        org.joda.time.Period period62 = duration53.toPeriodFrom((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration64 = duration53.minus(0L);
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval();
        long long66 = mutableInterval65.toDurationMillis();
        org.joda.time.Duration duration68 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval65.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration68);
        org.joda.time.Duration duration71 = duration68.plus((long) 8);
        org.joda.time.Duration duration73 = duration64.withDurationAdded((org.joda.time.ReadableDuration) duration71, (int) '4');
        org.joda.time.Duration duration76 = duration71.withDurationAdded(1645455064141L, 4);
        org.joda.time.Period period77 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant51, (org.joda.time.ReadableDuration) duration71);
        org.joda.time.Period period78 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableDuration) duration71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant45", (dateTime3.compareTo(instant45) == 0) == dateTime3.equals(instant45));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        java.lang.String str2 = dateTime1.toString();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime1.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.DateTime dateTime8 = dateTime1.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes(0);
        boolean boolean11 = dateTime8.isAfterNow();
        org.joda.time.DateTime.Property property12 = dateTime8.year();
        org.joda.time.DateTime.Property property13 = dateTime8.year();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone14);
        java.lang.String str16 = dateTime15.toString();
        org.joda.time.DateTime dateTime18 = dateTime15.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime(chronology19);
        org.joda.time.DateTime dateTime21 = dateTime18.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str26 = dateTimeZone24.getNameKey(1645455028293L);
        int int28 = dateTimeZone24.getOffset(1645455028293L);
        long long32 = dateTimeZone24.convertLocalToUTC((long) 3, false, 1645455032819L);
        org.joda.time.DateTime dateTime33 = dateTime18.withZoneRetainFields(dateTimeZone24);
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone36);
        java.lang.String str38 = dateTime37.toString();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology41);
        org.joda.time.DateTime dateTime43 = dateTime37.minus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.Period period44 = duration35.toPeriodFrom((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Duration duration46 = duration35.minus(0L);
        org.joda.time.Duration duration48 = duration35.withMillis(1645455034114L);
        java.lang.String str49 = duration35.toString();
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval();
        long long52 = mutableInterval51.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        boolean boolean55 = mutableInterval51.overlaps((org.joda.time.ReadableInterval) mutableInterval53);
        java.lang.Object obj56 = mutableInterval51.clone();
        org.joda.time.Chronology chronology57 = mutableInterval51.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.yearOfEra();
        org.joda.time.DateTimeField dateTimeField59 = chronology57.minuteOfDay();
        org.joda.time.DurationField durationField60 = chronology57.halfdays();
        org.joda.time.Period period61 = duration35.toPeriod(periodType50, chronology57);
        org.joda.time.DateTime dateTime62 = dateTime33.withChronology(chronology57);
        int int63 = dateTime8.compareTo((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.DateTime dateTime65 = dateTime62.plusDays(0);
        org.joda.time.Chronology chronology66 = dateTime62.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and dateTime62", (dateTime33.compareTo(dateTime62) == 0) == dateTime33.equals(dateTime62));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        long long2 = dateTime1.getMillis();
        org.joda.time.DateTime.Property property3 = dateTime1.yearOfEra();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime6 = property3.roundCeilingCopy();
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekyear(4381721);
        org.joda.time.DateTime dateTime10 = dateTime8.minusSeconds(1970);
        int int11 = dateTime10.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        long long14 = dateTime13.getMillis();
        org.joda.time.DateTime dateTime16 = dateTime13.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str23 = dateTimeZone21.getNameKey(1645455028293L);
        org.joda.time.DateTime dateTime24 = dateTime16.withZone(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone25);
        long long27 = dateTime26.getMillis();
        org.joda.time.DateTime.Property property28 = dateTime26.yearOfEra();
        org.joda.time.DateTime dateTime29 = property28.roundFloorCopy();
        org.joda.time.Period period30 = org.joda.time.Period.ZERO;
        org.joda.time.Period period32 = period30.minusSeconds((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean34 = period32.equals((java.lang.Object) dateTimeFieldType33);
        int int35 = dateTime29.get(dateTimeFieldType33);
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType33.getDurationType();
        boolean boolean37 = dateTime24.isSupported(dateTimeFieldType33);
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType33.getRangeDurationType();
        int int39 = dateTime10.get(dateTimeFieldType33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime24", (dateTime16.compareTo(dateTime24) == 0) == dateTime16.equals(dateTime24));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        long long2 = dateTime1.getMillis();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str9 = dateTimeZone7.getNameKey(1645455028293L);
        org.joda.time.DateTime dateTime10 = dateTime1.toDateTime(dateTimeZone7);
        int int11 = dateTime10.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property12 = dateTime10.millisOfSecond();
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime dateTime14 = property12.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property12.getFieldType();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getRangeDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime10", (dateTime1.compareTo(dateTime10) == 0) == dateTime1.equals(dateTime10));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        java.lang.String str2 = dateTime1.toString();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime1.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.DateTime dateTime8 = dateTime1.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes(0);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        java.lang.String str15 = dateTime14.toString();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology18);
        org.joda.time.DateTime dateTime20 = dateTime14.minus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Period period21 = duration12.toPeriodFrom((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Duration duration23 = duration12.minus(0L);
        org.joda.time.DateTime dateTime25 = dateTime8.withDurationAdded((org.joda.time.ReadableDuration) duration23, (int) (byte) 0);
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone28);
        java.lang.String str30 = dateTime29.toString();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology33);
        org.joda.time.DateTime dateTime35 = dateTime29.minus((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Period period36 = duration27.toPeriodFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Duration duration38 = duration27.minus(0L);
        boolean boolean39 = duration23.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone40);
        java.lang.String str42 = dateTime41.toString();
        org.joda.time.DateTime dateTime44 = dateTime41.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.toDateTime(chronology45);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.months();
        org.joda.time.Period period48 = duration27.toPeriodTo((org.joda.time.ReadableInstant) dateTime44, periodType47);
        org.joda.time.DateTime dateTime50 = dateTime44.minusWeeks(32);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str55 = dateTimeZone53.getNameKey(1645455028293L);
        int int57 = dateTimeZone53.getOffset(1645455028293L);
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime44.toMutableDateTime(dateTimeZone53);
        org.joda.time.Period period67 = new org.joda.time.Period(4715356, 4811168, 53676073, 39481256, 53640419, 4629214, 5, 53592012);
        org.joda.time.DateTime dateTime69 = dateTime44.withPeriodAdded((org.joda.time.ReadablePeriod) period67, 26);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetMillis(321);
        org.joda.time.DateTime dateTime72 = dateTime44.withZoneRetainFields(dateTimeZone71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and mutableDateTime58", (dateTime44.compareTo(mutableDateTime58) == 0) == dateTime44.equals(mutableDateTime58));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.joda.time.MutableInterval mutableInterval0 = new org.joda.time.MutableInterval();
        long long1 = mutableInterval0.toDurationMillis();
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval0.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration6 = duration3.plus((long) 8);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        java.lang.String str9 = dateTime8.toString();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology12);
        org.joda.time.DateTime dateTime14 = dateTime8.minus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.DateTime dateTime15 = dateTime8.withEarlierOffsetAtOverlap();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration3, (org.joda.time.ReadableInstant) dateTime15);
        mutablePeriod16.addMillis((int) '4');
        int int19 = mutablePeriod16.getWeeks();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.Instant instant22 = instant21.toInstant();
        mutablePeriod16.setPeriod(readableInstant20, (org.joda.time.ReadableInstant) instant22);
        boolean boolean24 = instant22.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant22", (dateTime8.compareTo(instant22) == 0) == dateTime8.equals(instant22));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) ' ', (-1L));
        mutablePeriod2.setValue((int) (byte) 0, 100);
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTimeISO();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        java.lang.String str12 = dateTime11.toString();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology15);
        org.joda.time.DateTime dateTime17 = dateTime11.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period18 = duration9.toPeriodFrom((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Duration duration20 = duration9.minus(0L);
        org.joda.time.Duration duration22 = duration9.withMillis(1645455034114L);
        org.joda.time.Instant instant23 = instant6.minus((org.joda.time.ReadableDuration) duration22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone24);
        java.lang.String str26 = dateTime25.toString();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology29);
        org.joda.time.DateTime dateTime31 = dateTime25.minus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType35 = periodType34.withYearsRemoved();
        org.joda.time.PeriodType periodType36 = periodType35.withSecondsRemoved();
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval();
        long long38 = mutableInterval37.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        boolean boolean41 = mutableInterval37.overlaps((org.joda.time.ReadableInterval) mutableInterval39);
        java.lang.Object obj42 = mutableInterval37.clone();
        org.joda.time.Chronology chronology43 = mutableInterval37.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.yearOfEra();
        org.joda.time.Period period45 = new org.joda.time.Period(1645455029672L, (long) 3, periodType35, chronology43);
        org.joda.time.DurationField durationField46 = chronology43.eras();
        org.joda.time.DateTime dateTime47 = dateTime25.toDateTime(chronology43);
        mutablePeriod2.setPeriod((org.joda.time.ReadableInstant) instant6, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Instant instant50 = instant6.withMillis(1645455043927L);
        org.joda.time.Instant instant52 = instant50.plus(1645455160151L);
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval();
        long long57 = mutableInterval56.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        boolean boolean60 = mutableInterval56.overlaps((org.joda.time.ReadableInterval) mutableInterval58);
        java.lang.Object obj61 = mutableInterval56.clone();
        org.joda.time.Chronology chronology62 = mutableInterval56.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.yearOfEra();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(1645455028646L, chronology62);
        org.joda.time.DateTimeField dateTimeField65 = chronology62.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str70 = dateTimeZone68.getShortName(52L);
        boolean boolean71 = dateTimeZone68.isFixed();
        java.util.TimeZone timeZone72 = dateTimeZone68.toTimeZone();
        org.joda.time.Chronology chronology73 = chronology62.withZone(dateTimeZone68);
        org.joda.time.Interval interval74 = new org.joda.time.Interval(1645455111526L, 1645455231159L, chronology62);
        org.joda.time.MutableInterval mutableInterval76 = new org.joda.time.MutableInterval();
        long long77 = mutableInterval76.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval78 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval79 = mutableInterval78.toInterval();
        boolean boolean80 = mutableInterval76.overlaps((org.joda.time.ReadableInterval) mutableInterval78);
        java.lang.Object obj81 = mutableInterval76.clone();
        org.joda.time.Chronology chronology82 = mutableInterval76.getChronology();
        org.joda.time.DateTimeField dateTimeField83 = chronology82.yearOfEra();
        org.joda.time.DateTimeField dateTimeField84 = chronology82.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField85 = chronology82.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone86 = chronology82.getZone();
        java.util.Locale locale88 = null;
        java.lang.String str89 = dateTimeZone86.getShortName(1645455082054L, locale88);
        org.joda.time.DateTime dateTime90 = new org.joda.time.DateTime(1645455071506L, dateTimeZone86);
        boolean boolean91 = interval74.contains((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.Period period92 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant50, (org.joda.time.ReadableInstant) dateTime90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime7", (instant6.compareTo(mutableDateTime7) == 0) == instant6.equals(mutableDateTime7));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        long long3 = dateTime2.getMillis();
        org.joda.time.DateTime.Property property4 = dateTime2.yearOfEra();
        org.joda.time.Interval interval5 = property4.toInterval();
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval();
        long long7 = mutableInterval6.toDurationMillis();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval6.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Interval interval11 = interval5.withDurationAfterStart((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Interval interval12 = interval5.toInterval();
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval();
        long long14 = mutableInterval13.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval16 = mutableInterval15.toInterval();
        boolean boolean17 = mutableInterval13.overlaps((org.joda.time.ReadableInterval) mutableInterval15);
        java.lang.Object obj18 = mutableInterval13.clone();
        org.joda.time.Chronology chronology19 = mutableInterval13.getChronology();
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval();
        long long21 = mutableInterval20.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        boolean boolean24 = mutableInterval20.overlaps((org.joda.time.ReadableInterval) mutableInterval22);
        mutableInterval13.setInterval((org.joda.time.ReadableInterval) mutableInterval20);
        org.joda.time.Interval interval26 = interval12.gap((org.joda.time.ReadableInterval) mutableInterval13);
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval();
        boolean boolean28 = mutableInterval27.containsNow();
        boolean boolean29 = interval12.isBefore((org.joda.time.ReadableInterval) mutableInterval27);
        boolean boolean31 = mutableInterval27.contains(1645455037444L);
        org.joda.time.Duration duration32 = mutableInterval27.toDuration();
        org.joda.time.Instant instant33 = instant0.minus((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Instant instant35 = instant33.plus(1645455155867L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant33 and dateTime2", (instant33.compareTo(dateTime2) == 0) == instant33.equals(dateTime2));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        long long2 = dateTime1.getMillis();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.plusSeconds((int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes(100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        java.lang.String str11 = dateTime10.toString();
        org.joda.time.DateTime dateTime13 = dateTime10.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.toDateTime(chronology14);
        org.joda.time.DateTime dateTime16 = dateTime13.toDateTime();
        boolean boolean17 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime16.hourOfDay();
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime20 = instant19.toMutableDateTimeISO();
        long long21 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) instant19);
        int int22 = property18.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant19", (dateTime1.compareTo(instant19) == 0) == dateTime1.equals(instant19));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) (byte) -1, (-1L), dateTimeZone2);
        long long4 = interval3.getEndMillis();
        org.joda.time.Duration duration5 = interval3.toDuration();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) ' ', (-1L));
        mutablePeriod8.setValue((int) (byte) 0, 100);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTimeISO();
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        java.lang.String str18 = dateTime17.toString();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology21);
        org.joda.time.DateTime dateTime23 = dateTime17.minus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period24 = duration15.toPeriodFrom((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Duration duration26 = duration15.minus(0L);
        org.joda.time.Duration duration28 = duration15.withMillis(1645455034114L);
        org.joda.time.Instant instant29 = instant12.minus((org.joda.time.ReadableDuration) duration28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone30);
        java.lang.String str32 = dateTime31.toString();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology35);
        org.joda.time.DateTime dateTime37 = dateTime31.minus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType41 = periodType40.withYearsRemoved();
        org.joda.time.PeriodType periodType42 = periodType41.withSecondsRemoved();
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval();
        long long44 = mutableInterval43.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval46 = mutableInterval45.toInterval();
        boolean boolean47 = mutableInterval43.overlaps((org.joda.time.ReadableInterval) mutableInterval45);
        java.lang.Object obj48 = mutableInterval43.clone();
        org.joda.time.Chronology chronology49 = mutableInterval43.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.yearOfEra();
        org.joda.time.Period period51 = new org.joda.time.Period(1645455029672L, (long) 3, periodType41, chronology49);
        org.joda.time.DurationField durationField52 = chronology49.eras();
        org.joda.time.DateTime dateTime53 = dateTime31.toDateTime(chronology49);
        mutablePeriod8.setPeriod((org.joda.time.ReadableInstant) instant12, (org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.Instant instant55 = instant12.toInstant();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(dateTimeZone56);
        long long58 = dateTime57.getMillis();
        org.joda.time.DateTime.Property property59 = dateTime57.yearOfEra();
        org.joda.time.Interval interval60 = property59.toInterval();
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval();
        long long62 = mutableInterval61.toDurationMillis();
        org.joda.time.Duration duration64 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval61.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration64);
        org.joda.time.Interval interval66 = interval60.withDurationAfterStart((org.joda.time.ReadableDuration) duration64);
        org.joda.time.Interval interval67 = interval60.toInterval();
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval();
        long long69 = mutableInterval68.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval71 = mutableInterval70.toInterval();
        boolean boolean72 = mutableInterval68.overlaps((org.joda.time.ReadableInterval) mutableInterval70);
        java.lang.Object obj73 = mutableInterval68.clone();
        org.joda.time.Chronology chronology74 = mutableInterval68.getChronology();
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval();
        long long76 = mutableInterval75.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval78 = mutableInterval77.toInterval();
        boolean boolean79 = mutableInterval75.overlaps((org.joda.time.ReadableInterval) mutableInterval77);
        mutableInterval68.setInterval((org.joda.time.ReadableInterval) mutableInterval75);
        org.joda.time.Interval interval81 = interval67.gap((org.joda.time.ReadableInterval) mutableInterval68);
        org.joda.time.Period period82 = interval67.toPeriod();
        org.joda.time.Duration duration83 = interval67.toDuration();
        org.joda.time.Duration duration85 = duration83.withMillis(1645455048666L);
        long long86 = duration85.getMillis();
        org.joda.time.Instant instant87 = instant55.minus((org.joda.time.ReadableDuration) duration85);
        org.joda.time.Interval interval88 = interval3.withDurationAfterStart((org.joda.time.ReadableDuration) duration85);
        boolean boolean90 = duration85.equals((java.lang.Object) "2022-02-22T01:16:25.117+10:22");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime13", (instant12.compareTo(mutableDateTime13) == 0) == instant12.equals(mutableDateTime13));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(dateTimeZone4);
        java.lang.String str6 = dateTime5.toString();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology9);
        org.joda.time.DateTime dateTime11 = dateTime5.minus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period12 = duration3.toPeriodFrom((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Duration duration14 = duration3.minus(0L);
        org.joda.time.Duration duration16 = duration3.withMillis(1645455034114L);
        org.joda.time.Instant instant17 = instant0.minus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.DateTime dateTime18 = instant0.toDateTimeISO();
        org.joda.time.Instant instant19 = instant0.toInstant();
        org.joda.time.Chronology chronology20 = instant19.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and mutableDateTime1", (instant19.compareTo(mutableDateTime1) == 0) == instant19.equals(mutableDateTime1));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        long long2 = dateTime1.getMillis();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks((int) (byte) 10);
        int int5 = dateTime1.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone6);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology11);
        org.joda.time.DateTime dateTime13 = dateTime7.minus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.DateTime dateTime14 = dateTime7.toDateTimeISO();
        int int15 = dateTime1.compareTo((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime17 = dateTime1.minusMinutes(8);
        org.joda.time.DateTime.Property property18 = dateTime1.dayOfYear();
        int int19 = dateTime1.getYear();
        org.joda.time.DateTime.Property property20 = dateTime1.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(4380700);
        long long25 = dateTimeZone22.adjustOffset(1645455173189L, true);
        org.joda.time.DateTime dateTime26 = dateTime1.withZone(dateTimeZone22);
        org.joda.time.DateTime dateTime28 = dateTime1.minusSeconds(53757);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime26", (dateTime7.compareTo(dateTime26) == 0) == dateTime7.equals(dateTime26));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        long long2 = dateTime1.getMillis();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str11 = dateTimeZone9.getNameKey(1645455028293L);
        org.joda.time.DateTime dateTime12 = dateTime4.withZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        long long15 = dateTime14.getMillis();
        org.joda.time.DateTime dateTime17 = dateTime14.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime17.toDateTimeISO();
        org.joda.time.DateTime dateTime20 = dateTime17.plusMillis(100);
        long long21 = dateTime20.getMillis();
        int int22 = dateTime20.getDayOfMonth();
        boolean boolean23 = dateTime4.isBefore((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime.Property property24 = dateTime4.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone25);
        java.lang.String str27 = dateTime26.toString();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology30);
        org.joda.time.DateTime dateTime32 = dateTime26.minus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.DateTime dateTime33 = dateTime26.toDateTimeISO();
        org.joda.time.DateTime dateTime35 = dateTime33.minusMinutes(0);
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone38);
        java.lang.String str40 = dateTime39.toString();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology43);
        org.joda.time.DateTime dateTime45 = dateTime39.minus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.Period period46 = duration37.toPeriodFrom((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Duration duration48 = duration37.minus(0L);
        org.joda.time.DateTime dateTime50 = dateTime33.withDurationAdded((org.joda.time.ReadableDuration) duration48, (int) (byte) 0);
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(dateTimeZone53);
        java.lang.String str55 = dateTime54.toString();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology58);
        org.joda.time.DateTime dateTime60 = dateTime54.minus((org.joda.time.ReadablePeriod) period59);
        org.joda.time.Period period61 = duration52.toPeriodFrom((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Duration duration63 = duration52.minus(0L);
        boolean boolean64 = duration48.isShorterThan((org.joda.time.ReadableDuration) duration52);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(dateTimeZone65);
        java.lang.String str67 = dateTime66.toString();
        org.joda.time.DateTime dateTime69 = dateTime66.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateTime dateTime71 = dateTime69.toDateTime(chronology70);
        org.joda.time.PeriodType periodType72 = org.joda.time.PeriodType.months();
        org.joda.time.Period period73 = duration52.toPeriodTo((org.joda.time.ReadableInstant) dateTime69, periodType72);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod();
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime69, (org.joda.time.ReadablePeriod) mutablePeriod74);
        boolean boolean77 = mutableInterval75.equals((java.lang.Object) "2022-02-22T01:12:52.069+10:22");
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime(dateTimeZone78);
        java.lang.String str80 = dateTime79.toString();
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology83);
        org.joda.time.DateTime dateTime85 = dateTime79.minus((org.joda.time.ReadablePeriod) period84);
        org.joda.time.DateTime dateTime86 = dateTime79.toDateTimeISO();
        org.joda.time.DateTime dateTime88 = dateTime86.minusMinutes(0);
        org.joda.time.DateTime dateTime90 = dateTime88.plusYears((int) '4');
        org.joda.time.Instant instant91 = dateTime88.toInstant();
        mutableInterval75.setEnd((org.joda.time.ReadableInstant) instant91);
        org.joda.time.DateTimeZone dateTimeZone93 = instant91.getZone();
        org.joda.time.Instant instant96 = instant91.withDurationAdded((long) 53825270, 39094373);
        boolean boolean97 = dateTime4.isEqual((org.joda.time.ReadableInstant) instant96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant91", (dateTime1.compareTo(instant91) == 0) == dateTime1.equals(instant91));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (byte) -1, (-1L), dateTimeZone4);
        org.joda.time.Period period6 = org.joda.time.Period.ZERO;
        org.joda.time.Period period8 = period6.minusSeconds((int) (short) 1);
        org.joda.time.Period period10 = period6.plusWeeks((int) (short) -1);
        org.joda.time.Period period12 = period6.minusMillis(4);
        org.joda.time.Interval interval13 = interval5.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period15 = period6.withHours((int) 'a');
        org.joda.time.Minutes minutes16 = period6.toStandardMinutes();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval();
        long long18 = mutableInterval17.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        boolean boolean21 = mutableInterval17.overlaps((org.joda.time.ReadableInterval) mutableInterval19);
        java.lang.Object obj22 = mutableInterval17.clone();
        org.joda.time.Chronology chronology23 = mutableInterval17.getChronology();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval();
        long long25 = mutableInterval24.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval27 = mutableInterval26.toInterval();
        boolean boolean28 = mutableInterval24.overlaps((org.joda.time.ReadableInterval) mutableInterval26);
        mutableInterval17.setInterval((org.joda.time.ReadableInterval) mutableInterval24);
        mutableInterval24.setDurationAfterStart(1645455033234L);
        org.joda.time.MutableInterval mutableInterval32 = mutableInterval24.copy();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone33);
        java.lang.String str35 = dateTime34.toString();
        org.joda.time.DateTime dateTime37 = dateTime34.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.toDateTime(chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone40);
        java.lang.String str42 = dateTime41.toString();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology45);
        org.joda.time.DateTime dateTime47 = dateTime41.minus((org.joda.time.ReadablePeriod) period46);
        org.joda.time.DateTime dateTime48 = dateTime41.toDateTimeISO();
        org.joda.time.DateTime dateTime50 = dateTime48.minusMinutes(0);
        boolean boolean51 = dateTime37.isEqual((org.joda.time.ReadableInstant) dateTime48);
        mutableInterval24.setEnd((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Duration duration53 = period6.toDurationFrom((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval();
        long long55 = mutableInterval54.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        boolean boolean58 = mutableInterval54.overlaps((org.joda.time.ReadableInterval) mutableInterval56);
        java.lang.Object obj59 = mutableInterval54.clone();
        org.joda.time.Chronology chronology60 = mutableInterval54.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.yearOfEra();
        org.joda.time.DateTimeField dateTimeField62 = chronology60.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField63 = chronology60.dayOfWeek();
        org.joda.time.DurationField durationField64 = chronology60.halfdays();
        org.joda.time.DateTimeField dateTimeField65 = chronology60.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField66 = chronology60.millisOfDay();
        org.joda.time.DateTimeField dateTimeField67 = chronology60.weekyear();
        org.joda.time.Period period68 = duration53.toPeriod(chronology60);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 53676073, 878461L, chronology60);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(chronology60);
        org.joda.time.DateTime dateTime72 = dateTime70.withWeekyear(4485592);
        org.joda.time.Period period76 = org.joda.time.Period.years(39093577);
        org.joda.time.PeriodType periodType77 = period76.getPeriodType();
        org.joda.time.PeriodType periodType79 = org.joda.time.PeriodType.days();
        org.joda.time.MutableInterval mutableInterval80 = new org.joda.time.MutableInterval();
        long long81 = mutableInterval80.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval82 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval83 = mutableInterval82.toInterval();
        boolean boolean84 = mutableInterval80.overlaps((org.joda.time.ReadableInterval) mutableInterval82);
        java.lang.Object obj85 = mutableInterval80.clone();
        org.joda.time.Chronology chronology86 = mutableInterval80.getChronology();
        org.joda.time.DateTimeField dateTimeField87 = chronology86.yearOfEra();
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((long) 8, periodType79, chronology86);
        org.joda.time.DateTimeField dateTimeField89 = chronology86.clockhourOfDay();
        org.joda.time.DurationField durationField90 = chronology86.eras();
        org.joda.time.Period period91 = new org.joda.time.Period(1645455458063L, 0L, periodType77, chronology86);
        org.joda.time.MutableDateTime mutableDateTime92 = dateTime70.toMutableDateTime(chronology86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField64 and durationField90", Math.signum(durationField64.compareTo(durationField90)) == -Math.signum(durationField90.compareTo(durationField64)));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.joda.time.MutableInterval mutableInterval0 = new org.joda.time.MutableInterval();
        long long1 = mutableInterval0.toDurationMillis();
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval0.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration3);
        mutableInterval0.setInterval(100000L, 1645455028646L);
        long long8 = mutableInterval0.getStartMillis();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval();
        long long10 = mutableInterval9.toDurationMillis();
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval9.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration12);
        mutableInterval0.setDurationAfterStart((org.joda.time.ReadableDuration) duration12);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardMinutes(1645455037008L);
        boolean boolean17 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone18);
        long long20 = dateTime19.getMillis();
        org.joda.time.DateTime.Property property21 = dateTime19.yearOfEra();
        org.joda.time.DateTime dateTime22 = property21.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean24 = dateTime22.isSupported(dateTimeFieldType23);
        org.joda.time.Instant instant25 = dateTime22.toInstant();
        org.joda.time.DateTime dateTime26 = instant25.toDateTimeISO();
        org.joda.time.DateTime dateTime27 = instant25.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime28 = instant25.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone29);
        java.lang.String str31 = dateTime30.toString();
        org.joda.time.DateTime dateTime33 = dateTime30.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.toDateTime(chronology34);
        org.joda.time.DateTime dateTime36 = dateTime33.toDateTime();
        org.joda.time.DateTime dateTime38 = dateTime36.withMillisOfDay(1);
        int int39 = mutableDateTime28.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Period period40 = duration12.toPeriodFrom((org.joda.time.ReadableInstant) dateTime38);
        int[] intArray41 = period40.getValues();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant25", (dateTime22.compareTo(instant25) == 0) == dateTime22.equals(instant25));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        java.lang.String str4 = dateTime3.toString();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology7);
        org.joda.time.DateTime dateTime9 = dateTime3.minus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period10 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.DateTime dateTime12 = dateTime3.minusSeconds((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone14);
        java.lang.String str16 = dateTime15.toString();
        org.joda.time.DateTime dateTime18 = dateTime15.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime(chronology19);
        org.joda.time.DateTime dateTime21 = dateTime18.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.withMillisOfDay(1);
        org.joda.time.DateTime dateTime24 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        boolean boolean26 = dateTimeFieldType13.isSupported(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime12.withField(dateTimeFieldType13, 27);
        org.joda.time.DateTime dateTime30 = dateTime12.plusWeeks(53486469);
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval();
        long long32 = mutableInterval31.toDurationMillis();
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval31.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration34);
        org.joda.time.Duration duration37 = duration34.plus((long) 8);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone38);
        java.lang.String str40 = dateTime39.toString();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology43);
        org.joda.time.DateTime dateTime45 = dateTime39.minus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.DateTime dateTime46 = dateTime39.withEarlierOffsetAtOverlap();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration34, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = dateTime46.withZoneRetainFields(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(dateTimeZone50);
        long long52 = dateTime51.getMillis();
        org.joda.time.DateTime dateTime54 = dateTime51.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime55 = dateTime54.toDateTimeISO();
        org.joda.time.YearMonthDay yearMonthDay56 = dateTime55.toYearMonthDay();
        int int57 = yearMonthDay56.size();
        org.joda.time.DateTime dateTime58 = dateTime46.withFields((org.joda.time.ReadablePartial) yearMonthDay56);
        org.joda.time.Chronology chronology59 = yearMonthDay56.getChronology();
        org.joda.time.DurationField durationField60 = chronology59.months();
        org.joda.time.DurationField durationField61 = chronology59.hours();
        org.joda.time.DateTime dateTime62 = dateTime12.toDateTime(chronology59);
        org.joda.time.DateTime dateTime63 = org.joda.time.DateTime.now(chronology59);
        org.joda.time.DateTimeField dateTimeField64 = chronology59.era();
        int int66 = dateTimeField64.getMinimumValue(1645455526867L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime63", (dateTime3.compareTo(dateTime63) == 0) == dateTime3.equals(dateTime63));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.joda.time.MutableInterval mutableInterval0 = new org.joda.time.MutableInterval();
        long long1 = mutableInterval0.toDurationMillis();
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval0.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration6 = duration3.plus((long) 8);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        java.lang.String str9 = dateTime8.toString();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology12);
        org.joda.time.DateTime dateTime14 = dateTime8.minus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.DateTime dateTime15 = dateTime8.withEarlierOffsetAtOverlap();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration3, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.withZoneRetainFields(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone19);
        long long21 = dateTime20.getMillis();
        org.joda.time.DateTime dateTime23 = dateTime20.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime24 = dateTime23.toDateTimeISO();
        org.joda.time.YearMonthDay yearMonthDay25 = dateTime24.toYearMonthDay();
        int int26 = yearMonthDay25.size();
        org.joda.time.DateTime dateTime27 = dateTime15.withFields((org.joda.time.ReadablePartial) yearMonthDay25);
        java.lang.String str28 = dateTime27.toString();
        org.joda.time.DateTime.Property property29 = dateTime27.monthOfYear();
        org.joda.time.DateTime.Property property30 = dateTime27.era();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.DateTime.Property property34 = dateTime33.year();
        org.joda.time.DateTimeField dateTimeField35 = property34.getField();
        int int36 = property34.getMaximumValueOverall();
        org.joda.time.DateTime dateTime37 = property34.roundFloorCopy();
        boolean boolean38 = property30.equals((java.lang.Object) property34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime33", (dateTime8.compareTo(dateTime33) == 0) == dateTime8.equals(dateTime33));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval(1645455072493L, 1645455130027L, dateTimeZone2);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone6);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology11);
        org.joda.time.DateTime dateTime13 = dateTime7.minus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period14 = duration5.toPeriodFrom((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Duration duration16 = duration5.minus(0L);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.time();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((-1L), 1L, periodType21, chronology22);
        java.lang.String str24 = periodType21.toString();
        java.lang.String str25 = periodType21.getName();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(1645455029643L, periodType21);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, readableInstant17, periodType21);
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval();
        long long29 = mutableInterval28.toDurationMillis();
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval28.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone33);
        long long35 = dateTime34.getMillis();
        org.joda.time.DateTime dateTime37 = dateTime34.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime39 = dateTime37.plusSeconds((int) (byte) 10);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration31, (org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Duration duration41 = duration5.minus((org.joda.time.ReadableDuration) duration31);
        org.joda.time.Duration duration44 = duration5.withDurationAdded(1645455036379L, 22);
        org.joda.time.Hours hours45 = duration5.toStandardHours();
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(dateTimeZone48);
        java.lang.String str50 = dateTime49.toString();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology53);
        org.joda.time.DateTime dateTime55 = dateTime49.minus((org.joda.time.ReadablePeriod) period54);
        org.joda.time.Period period56 = duration47.toPeriodFrom((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Duration duration58 = duration47.minus(0L);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.PeriodType periodType63 = org.joda.time.PeriodType.time();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((-1L), 1L, periodType63, chronology64);
        java.lang.String str66 = periodType63.toString();
        java.lang.String str67 = periodType63.getName();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod(1645455029643L, periodType63);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration47, readableInstant59, periodType63);
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval();
        long long71 = mutableInterval70.toDurationMillis();
        org.joda.time.Duration duration73 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval70.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration73);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime(dateTimeZone75);
        long long77 = dateTime76.getMillis();
        org.joda.time.DateTime dateTime79 = dateTime76.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime81 = dateTime79.plusSeconds((int) (byte) 10);
        org.joda.time.Period period82 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration73, (org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.Duration duration83 = duration47.minus((org.joda.time.ReadableDuration) duration73);
        org.joda.time.Duration duration86 = duration47.withDurationAdded(1645455036379L, 22);
        org.joda.time.Hours hours87 = duration47.toStandardHours();
        boolean boolean88 = duration5.isEqual((org.joda.time.ReadableDuration) duration47);
        org.joda.time.Instant instant89 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime90 = instant89.toMutableDateTimeISO();
        org.joda.time.Interval interval91 = duration5.toIntervalFrom((org.joda.time.ReadableInstant) mutableDateTime90);
        boolean boolean92 = interval3.equals((java.lang.Object) mutableDateTime90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and instant89", (dateTime34.compareTo(instant89) == 0) == dateTime34.equals(instant89));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        long long2 = dateTime1.getMillis();
        org.joda.time.DateTime.Property property3 = dateTime1.yearOfEra();
        org.joda.time.DateTime dateTime4 = property3.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean6 = dateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType5.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType5.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval();
        long long12 = mutableInterval11.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval13 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval14 = mutableInterval13.toInterval();
        boolean boolean15 = mutableInterval11.overlaps((org.joda.time.ReadableInterval) mutableInterval13);
        java.lang.Object obj16 = mutableInterval11.clone();
        org.joda.time.Chronology chronology17 = mutableInterval11.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1645455029820L, chronology17);
        boolean boolean22 = dateTimeFieldType9.isSupported(chronology17);
        org.joda.time.DurationField durationField23 = chronology17.minutes();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType5.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField25 = chronology17.year();
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval();
        long long27 = mutableInterval26.toDurationMillis();
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval26.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Duration duration32 = duration29.plus((long) 8);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone33);
        java.lang.String str35 = dateTime34.toString();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology38);
        org.joda.time.DateTime dateTime40 = dateTime34.minus((org.joda.time.ReadablePeriod) period39);
        org.joda.time.DateTime dateTime41 = dateTime34.withEarlierOffsetAtOverlap();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration29, (org.joda.time.ReadableInstant) dateTime41);
        int int43 = mutablePeriod42.getSeconds();
        int int44 = mutablePeriod42.getSeconds();
        mutablePeriod42.setPeriod(1645455073432L, 1645455051434L);
        long long50 = chronology17.add((org.joda.time.ReadablePeriod) mutablePeriod42, 1645417766242L, 53592012);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(dateTimeZone55);
        java.lang.String str57 = dateTime56.toString();
        org.joda.time.DateTime dateTime59 = dateTime56.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTime dateTime61 = dateTime59.toDateTime(chronology60);
        org.joda.time.DateTime dateTime62 = dateTime59.toDateTime();
        org.joda.time.DateTime dateTime64 = dateTime62.withMillisOfDay(1);
        org.joda.time.DateTime dateTime65 = dateTime64.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology66 = dateTime65.getChronology();
        boolean boolean67 = dateTimeFieldType54.isSupported(chronology66);
        org.joda.time.Period period68 = new org.joda.time.Period(1645455072492L, 1645455029672L, chronology66);
        org.joda.time.DateTimeField dateTimeField69 = chronology66.secondOfMinute();
        org.joda.time.DurationField durationField70 = chronology66.eras();
        mutablePeriod42.add(1645455391236L, chronology66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField23 and durationField70", Math.signum(durationField23.compareTo(durationField70)) == -Math.signum(durationField70.compareTo(durationField23)));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        java.lang.String str4 = dateTime3.toString();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology7);
        org.joda.time.DateTime dateTime9 = dateTime3.minus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period10 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval();
        long long12 = mutableInterval11.toDurationMillis();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval11.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        long long18 = dateTime17.getMillis();
        org.joda.time.DateTime dateTime20 = dateTime17.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime22 = dateTime20.plusSeconds((int) (byte) 10);
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Period period24 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime.Property property25 = dateTime22.year();
        org.joda.time.Instant instant26 = dateTime22.toInstant();
        org.joda.time.Instant instant28 = instant26.withMillis(1687781706130264847L);
        org.joda.time.MutableDateTime mutableDateTime29 = instant28.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant26", (dateTime22.compareTo(instant26) == 0) == dateTime22.equals(instant26));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        java.lang.String str2 = dateTime1.toString();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime1.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.DateTime dateTime8 = dateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime1.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        java.lang.String str12 = dateTime11.toString();
        org.joda.time.DateTime dateTime14 = dateTime11.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.DateTime dateTime17 = dateTime14.toDateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.withMillisOfDay(1);
        java.lang.String str20 = dateTime17.toString();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone21);
        long long23 = dateTime22.getMillis();
        org.joda.time.DateTime dateTime25 = dateTime22.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime26 = dateTime25.toDateTimeISO();
        org.joda.time.YearMonthDay yearMonthDay27 = dateTime26.toYearMonthDay();
        org.joda.time.DateTime dateTime28 = dateTime17.withFields((org.joda.time.ReadablePartial) yearMonthDay27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval();
        long long32 = mutableInterval31.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        boolean boolean35 = mutableInterval31.overlaps((org.joda.time.ReadableInterval) mutableInterval33);
        java.lang.Object obj36 = mutableInterval31.clone();
        org.joda.time.Chronology chronology37 = mutableInterval31.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.yearOfEra();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField40 = chronology37.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(1645455029820L, chronology37);
        boolean boolean42 = dateTimeFieldType29.isSupported(chronology37);
        int int43 = dateTime17.get(dateTimeFieldType29);
        org.joda.time.DurationFieldType durationFieldType44 = dateTimeFieldType29.getDurationType();
        int int45 = dateTime1.get(dateTimeFieldType29);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str50 = dateTimeZone48.getNameKey(1645455028293L);
        int int52 = dateTimeZone48.getOffset(1645455028293L);
        long long56 = dateTimeZone48.convertLocalToUTC((long) 3, false, 1645455032819L);
        java.lang.String str58 = dateTimeZone48.getShortName(1645455052649L);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(dateTimeZone59);
        java.lang.String str61 = dateTime60.toString();
        org.joda.time.DateTime dateTime63 = dateTime60.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTime dateTime65 = dateTime63.toDateTime(chronology64);
        org.joda.time.DateTime dateTime66 = dateTime63.toDateTime();
        org.joda.time.DateTime dateTime68 = dateTime66.withMillisOfDay(1);
        org.joda.time.Instant instant69 = new org.joda.time.Instant();
        org.joda.time.Instant instant70 = instant69.toInstant();
        boolean boolean71 = dateTime68.isAfter((org.joda.time.ReadableInstant) instant70);
        org.joda.time.LocalDateTime localDateTime72 = dateTime68.toLocalDateTime();
        boolean boolean73 = dateTimeZone48.isLocalDateTimeGap(localDateTime72);
        org.joda.time.Chronology chronology74 = localDateTime72.getChronology();
        boolean boolean75 = dateTimeFieldType29.isSupported(chronology74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant69", (dateTime1.compareTo(instant69) == 0) == dateTime1.equals(instant69));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-21T14:50:34.430Z");
        org.joda.time.Instant instant3 = instant1.plus(1645488000000L);
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Duration duration7 = new org.joda.time.Duration(1645455092819L, 1645455102215L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration7, readableInstant8);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        java.lang.String str14 = dateTime13.toString();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology17);
        org.joda.time.DateTime dateTime19 = dateTime13.minus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period20 = duration11.toPeriodFrom((org.joda.time.ReadableInstant) dateTime13);
        long long21 = duration11.getMillis();
        long long22 = duration11.getStandardMinutes();
        long long23 = duration11.getStandardHours();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(1645455028293L, 1645455027824L);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone29);
        java.lang.String str31 = dateTime30.toString();
        org.joda.time.DateTime dateTime33 = dateTime30.withMillisOfSecond((int) (short) 10);
        boolean boolean35 = dateTime33.isBefore((-1L));
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone36);
        java.lang.String str38 = dateTime37.toString();
        org.joda.time.DateTime dateTime40 = dateTime37.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = dateTime40.toDateTime(chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone43);
        java.lang.String str45 = dateTime44.toString();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology48);
        org.joda.time.DateTime dateTime50 = dateTime44.minus((org.joda.time.ReadablePeriod) period49);
        org.joda.time.DateTime dateTime51 = dateTime44.toDateTimeISO();
        org.joda.time.DateTime dateTime53 = dateTime51.minusMinutes(0);
        boolean boolean54 = dateTime40.isEqual((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime51);
        boolean boolean57 = mutableInterval55.contains(1L);
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval();
        long long59 = mutableInterval58.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        boolean boolean62 = mutableInterval58.overlaps((org.joda.time.ReadableInterval) mutableInterval60);
        java.lang.Object obj63 = mutableInterval58.clone();
        org.joda.time.Chronology chronology64 = mutableInterval58.getChronology();
        mutableInterval55.setChronology(chronology64);
        mutablePeriod26.setPeriod(100000L, 1645455034244L, chronology64);
        org.joda.time.Period period67 = duration11.toPeriod(chronology64);
        boolean boolean68 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration11);
        boolean boolean69 = mutableDateTime4.equals((java.lang.Object) duration7);
        org.joda.time.Days days70 = duration7.toStandardDays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime4", (instant3.compareTo(mutableDateTime4) == 0) == instant3.equals(mutableDateTime4));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        long long2 = dateTime1.getMillis();
        org.joda.time.DateTime.Property property3 = dateTime1.yearOfEra();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.MutableInterval mutableInterval5 = new org.joda.time.MutableInterval();
        long long6 = mutableInterval5.toDurationMillis();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval5.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Interval interval10 = interval4.withDurationAfterStart((org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Interval interval12 = interval10.gap(readableInterval11);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod();
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType18 = periodType17.withYearsRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withSecondsRemoved();
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval();
        long long21 = mutableInterval20.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        boolean boolean24 = mutableInterval20.overlaps((org.joda.time.ReadableInterval) mutableInterval22);
        java.lang.Object obj25 = mutableInterval20.clone();
        org.joda.time.Chronology chronology26 = mutableInterval20.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfEra();
        org.joda.time.Period period28 = new org.joda.time.Period(1645455029672L, (long) 3, periodType18, chronology26);
        mutablePeriod13.add(1645455030370L, chronology26);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone30);
        java.lang.String str32 = dateTime31.toString();
        org.joda.time.DateTime dateTime34 = dateTime31.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.toDateTime(chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(dateTimeZone37);
        java.lang.String str39 = dateTime38.toString();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology42);
        org.joda.time.DateTime dateTime44 = dateTime38.minus((org.joda.time.ReadablePeriod) period43);
        org.joda.time.DateTime dateTime45 = dateTime38.toDateTimeISO();
        org.joda.time.DateTime dateTime47 = dateTime45.minusMinutes(0);
        boolean boolean48 = dateTime34.isEqual((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime.Property property49 = dateTime34.year();
        org.joda.time.Duration duration50 = mutablePeriod13.toDurationFrom((org.joda.time.ReadableInstant) dateTime34);
        boolean boolean51 = interval10.isAfter((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.Interval interval55 = new org.joda.time.Interval((long) (byte) -1, (-1L), dateTimeZone54);
        org.joda.time.Interval interval56 = interval55.toInterval();
        org.joda.time.Duration duration57 = interval55.toDuration();
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableDuration) duration57);
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval();
        long long60 = mutableInterval59.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval62 = mutableInterval61.toInterval();
        boolean boolean63 = mutableInterval59.overlaps((org.joda.time.ReadableInterval) mutableInterval61);
        java.lang.Object obj64 = mutableInterval59.clone();
        org.joda.time.Chronology chronology65 = mutableInterval59.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.yearOfEra();
        org.joda.time.Chronology chronology67 = chronology65.withUTC();
        org.joda.time.DateTimeZone dateTimeZone68 = chronology67.getZone();
        java.util.Locale locale70 = null;
        java.lang.String str71 = dateTimeZone68.getShortName(1645455068377L, locale70);
        java.util.Locale locale73 = null;
        java.lang.String str74 = dateTimeZone68.getShortName(0L, locale73);
        org.joda.time.DateTime dateTime75 = dateTime34.withZone(dateTimeZone68);
        long long79 = dateTimeZone68.convertLocalToUTC(1645455040347L, false, 1645455056014L);
        long long82 = dateTimeZone68.convertLocalToUTC(1645455274947L, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and dateTime75", (dateTime34.compareTo(dateTime75) == 0) == dateTime34.equals(dateTime75));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        java.lang.String str4 = dateTime3.toString();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology7);
        org.joda.time.DateTime dateTime9 = dateTime3.minus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period10 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.DateTime dateTime12 = dateTime3.minusSeconds((int) ' ');
        org.joda.time.DateTime.Property property13 = dateTime3.era();
        boolean boolean14 = dateTime3.isBeforeNow();
        org.joda.time.DateTime dateTime16 = dateTime3.plusSeconds(53601602);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType20 = periodType19.withYearsRemoved();
        org.joda.time.PeriodType periodType21 = periodType20.withSecondsRemoved();
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval();
        long long23 = mutableInterval22.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval25 = mutableInterval24.toInterval();
        boolean boolean26 = mutableInterval22.overlaps((org.joda.time.ReadableInterval) mutableInterval24);
        java.lang.Object obj27 = mutableInterval22.clone();
        org.joda.time.Chronology chronology28 = mutableInterval22.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.yearOfEra();
        org.joda.time.Period period30 = new org.joda.time.Period(1645455029672L, (long) 3, periodType20, chronology28);
        org.joda.time.DurationField durationField31 = chronology28.eras();
        org.joda.time.DateTimeField dateTimeField32 = chronology28.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = dateTimeField32.getLeapDurationField();
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone36);
        java.lang.String str38 = dateTime37.toString();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology41);
        org.joda.time.DateTime dateTime43 = dateTime37.minus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.Period period44 = duration35.toPeriodFrom((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval();
        long long46 = mutableInterval45.toDurationMillis();
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        mutableInterval45.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(dateTimeZone50);
        long long52 = dateTime51.getMillis();
        org.joda.time.DateTime dateTime54 = dateTime51.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime56 = dateTime54.plusSeconds((int) (byte) 10);
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration48, (org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Period period58 = duration35.toPeriodFrom((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.LocalTime localTime59 = dateTime56.toLocalTime();
        java.lang.String str60 = localTime59.toString();
        int int61 = dateTimeField32.getMinimumValue((org.joda.time.ReadablePartial) localTime59);
        org.joda.time.Chronology chronology62 = localTime59.getChronology();
        org.joda.time.DateTime dateTime63 = dateTime16.toDateTime(chronology62);
        org.joda.time.DateTimeZone dateTimeZone64 = chronology62.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime63", (dateTime16.compareTo(dateTime63) == 0) == dateTime16.equals(dateTime63));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.Period period4 = period2.minusSeconds((int) (short) 1);
        org.joda.time.Period period5 = period4.toPeriod();
        org.joda.time.Period period7 = period5.plusDays((int) (byte) 10);
        org.joda.time.PeriodType periodType8 = period5.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 5, 1645455076193L, periodType8);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime11 = instant10.toMutableDateTimeISO();
        org.joda.time.Instant instant13 = instant10.minus((long) (short) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime15 = instant14.toDateTimeISO();
        mutablePeriod9.setPeriod((org.joda.time.ReadableInstant) instant13, (org.joda.time.ReadableInstant) dateTime15);
        java.lang.String str17 = dateTime15.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime11", (instant10.compareTo(mutableDateTime11) == 0) == instant10.equals(mutableDateTime11));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        long long2 = dateTime1.getMillis();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.plus(readableDuration9);
        boolean boolean11 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 22, 1645455035827L);
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod15.toMutablePeriod();
        mutablePeriod15.setDays(0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone20);
        java.lang.String str22 = dateTime21.toString();
        org.joda.time.DateTime dateTime24 = dateTime21.withMillisOfSecond((int) (short) 10);
        boolean boolean26 = dateTime24.isBefore((-1L));
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone27);
        java.lang.String str29 = dateTime28.toString();
        org.joda.time.DateTime dateTime31 = dateTime28.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.toDateTime(chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone34);
        java.lang.String str36 = dateTime35.toString();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology39);
        org.joda.time.DateTime dateTime41 = dateTime35.minus((org.joda.time.ReadablePeriod) period40);
        org.joda.time.DateTime dateTime42 = dateTime35.toDateTimeISO();
        org.joda.time.DateTime dateTime44 = dateTime42.minusMinutes(0);
        boolean boolean45 = dateTime31.isEqual((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime42);
        boolean boolean48 = mutableInterval46.contains(1L);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval();
        long long50 = mutableInterval49.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        boolean boolean53 = mutableInterval49.overlaps((org.joda.time.ReadableInterval) mutableInterval51);
        java.lang.Object obj54 = mutableInterval49.clone();
        org.joda.time.Chronology chronology55 = mutableInterval49.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.yearOfEra();
        mutableInterval46.setChronology(chronology55);
        org.joda.time.DateTimeField dateTimeField58 = chronology55.clockhourOfDay();
        mutablePeriod15.add(0L, chronology55);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(1645455028293L, chronology55);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(dateTimeZone61);
        java.lang.String str63 = dateTime62.toString();
        org.joda.time.DateTime dateTime65 = dateTime62.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = dateTime65.toDateTime(chronology66);
        org.joda.time.DurationFieldType durationFieldType68 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.DateTime dateTime70 = dateTime65.withFieldAdded(durationFieldType68, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 22);
        java.lang.String str75 = dateTimeZone73.getShortName(52L);
        boolean boolean76 = dateTimeZone73.isFixed();
        java.util.Locale locale78 = null;
        java.lang.String str79 = dateTimeZone73.getName(1645455042879L, locale78);
        org.joda.time.DateTime dateTime80 = dateTime70.withZoneRetainFields(dateTimeZone73);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone73);
        org.joda.time.Chronology chronology82 = chronology55.withZone(dateTimeZone73);
        java.util.Locale locale84 = null;
        java.lang.String str85 = dateTimeZone73.getName(1645455077531L, locale84);
        org.joda.time.DateTime dateTime86 = dateTime10.withZone(dateTimeZone73);
        org.joda.time.ReadableInstant readableInstant87 = null;
        int int88 = dateTimeZone73.getOffset(readableInstant87);
        java.lang.String str90 = dateTimeZone73.getNameKey(1645455465489L);
        int int92 = dateTimeZone73.getOffset(1645455484938L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime86", (dateTime1.compareTo(dateTime86) == 0) == dateTime1.equals(dateTime86));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        long long3 = dateTime2.getMillis();
        org.joda.time.DateTime.Property property4 = dateTime2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology10);
        org.joda.time.DateTime dateTime12 = dateTime6.minus((org.joda.time.ReadablePeriod) period11);
        boolean boolean13 = property4.equals((java.lang.Object) dateTime6);
        org.joda.time.DateTime dateTime15 = property4.addToCopy(52);
        org.joda.time.DateTime dateTime17 = dateTime15.minusHours(53486469);
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears(4527697);
        int int20 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime17);
        boolean boolean22 = dateTime17.isAfter(1645455116076L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime2", (instant0.compareTo(dateTime2) == 0) == instant0.equals(dateTime2));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        java.lang.String str4 = dateTime3.toString();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology7);
        org.joda.time.DateTime dateTime9 = dateTime3.minus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period10 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.Duration duration12 = duration1.minus(0L);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod();
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType18 = periodType17.withYearsRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withSecondsRemoved();
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval();
        long long21 = mutableInterval20.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        boolean boolean24 = mutableInterval20.overlaps((org.joda.time.ReadableInterval) mutableInterval22);
        java.lang.Object obj25 = mutableInterval20.clone();
        org.joda.time.Chronology chronology26 = mutableInterval20.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfEra();
        org.joda.time.Period period28 = new org.joda.time.Period(1645455029672L, (long) 3, periodType18, chronology26);
        mutablePeriod13.add(1645455030370L, chronology26);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone30);
        java.lang.String str32 = dateTime31.toString();
        org.joda.time.DateTime dateTime34 = dateTime31.withMillisOfSecond((int) (short) 10);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.toDateTime(chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(dateTimeZone37);
        java.lang.String str39 = dateTime38.toString();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) 10, (long) 4, chronology42);
        org.joda.time.DateTime dateTime44 = dateTime38.minus((org.joda.time.ReadablePeriod) period43);
        org.joda.time.DateTime dateTime45 = dateTime38.toDateTimeISO();
        org.joda.time.DateTime dateTime47 = dateTime45.minusMinutes(0);
        boolean boolean48 = dateTime34.isEqual((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime.Property property49 = dateTime34.year();
        org.joda.time.Duration duration50 = mutablePeriod13.toDurationFrom((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Duration duration52 = duration50.minus(1645455029375L);
        org.joda.time.Period period53 = duration52.toPeriod();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(dateTimeZone54);
        long long56 = dateTime55.getMillis();
        org.joda.time.DateTime dateTime58 = dateTime55.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime60 = dateTime58.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(dateTimeZone61);
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.DateTime dateTime64 = dateTime62.plus(readableDuration63);
        boolean boolean65 = dateTime58.isEqual((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period67 = duration52.toPeriodFrom((org.joda.time.ReadableInstant) dateTime58, periodType66);
        org.joda.time.Period period68 = duration12.toPeriodTo((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Duration duration71 = new org.joda.time.Duration(1645455277196L, 6L);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long75 = dateTimeZone73.convertUTCToLocal(1645455035827L);
        org.joda.time.DateTime dateTime76 = org.joda.time.DateTime.now(dateTimeZone73);
        org.joda.time.Period period78 = new org.joda.time.Period(1645455051139L);
        boolean boolean79 = dateTimeZone73.equals((java.lang.Object) period78);
        org.joda.time.PeriodType periodType80 = period78.getPeriodType();
        java.lang.Object obj81 = null;
        boolean boolean82 = periodType80.equals(obj81);
        org.joda.time.Period period83 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableDuration) duration71, periodType80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime76", (dateTime3.compareTo(dateTime76) == 0) == dateTime3.equals(dateTime76));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.time();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((-1L), 1L, periodType2, chronology3);
        mutablePeriod4.setSeconds((int) (short) 0);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod4.setPeriod((long) 9, 100000L, chronology9);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType15 = periodType14.withYearsRemoved();
        org.joda.time.PeriodType periodType16 = periodType15.withSecondsRemoved();
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval();
        long long18 = mutableInterval17.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval20 = mutableInterval19.toInterval();
        boolean boolean21 = mutableInterval17.overlaps((org.joda.time.ReadableInterval) mutableInterval19);
        java.lang.Object obj22 = mutableInterval17.clone();
        org.joda.time.Chronology chronology23 = mutableInterval17.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.yearOfEra();
        org.joda.time.Period period25 = new org.joda.time.Period(1645455029672L, (long) 3, periodType15, chronology23);
        org.joda.time.DateTimeField dateTimeField26 = chronology23.dayOfMonth();
        org.joda.time.DurationField durationField27 = chronology23.days();
        mutablePeriod4.add(1645455035891L, chronology23);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone32);
        long long34 = dateTime33.getMillis();
        org.joda.time.DateTime dateTime36 = dateTime33.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime37 = dateTime36.toDateTimeISO();
        org.joda.time.YearMonthDay yearMonthDay38 = dateTime37.toYearMonthDay();
        org.joda.time.DateTimeField dateTimeField40 = yearMonthDay38.getField(0);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone41);
        long long43 = dateTime42.getMillis();
        org.joda.time.DateTime dateTime45 = dateTime42.plusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime46 = dateTime45.toDateTimeISO();
        org.joda.time.YearMonthDay yearMonthDay47 = dateTime46.toYearMonthDay();
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadablePartial) yearMonthDay38, (org.joda.time.ReadablePartial) yearMonthDay47);
        org.joda.time.PeriodType periodType49 = period48.getPeriodType();
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval();
        long long51 = mutableInterval50.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval();
        org.joda.time.Interval interval53 = mutableInterval52.toInterval();
        boolean boolean54 = mutableInterval50.overlaps((org.joda.time.ReadableInterval) mutableInterval52);
        java.lang.Object obj55 = mutableInterval50.clone();
        org.joda.time.Chronology chronology56 = mutableInterval50.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.yearOfEra();
        org.joda.time.DateTimeField dateTimeField58 = chronology56.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField59 = chronology56.yearOfCentury();
        org.joda.time.DurationField durationField60 = chronology56.weekyears();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(1640957880000L, 1645455037008L, periodType49, chronology56);
        org.joda.time.DateTimeField dateTimeField62 = chronology56.year();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        org.joda.time.Chronology chronology65 = chronology56.withZone(dateTimeZone64);
        mutablePeriod4.setPeriod(readableDuration29, chronology65);
        org.joda.time.DurationField durationField67 = chronology65.days();
        org.joda.time.DateTimeField dateTimeField68 = chronology65.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField27 and durationField67", (durationField27.compareTo(durationField67) == 0) == durationField27.equals(durationField67));
    }
}

