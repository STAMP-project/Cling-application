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
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.minutes();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        boolean boolean14 = dateTimeZone11.isStandardOffset((long) (byte) 100);
        boolean boolean16 = dateTimeZone11.equals((java.lang.Object) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((-1L), dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone19.isLocalDateTimeGap(localDateTime21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime25 = dateTime23.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((-1L), dateTimeZone28);
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        java.util.Calendar calendar31 = dateTime29.toCalendar(locale30);
        org.joda.time.DateTime dateTime33 = dateTime29.plusMillis((int) '4');
        org.joda.time.DateTime dateTime34 = dateTime29.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        boolean boolean39 = dateTime37.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes40 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Duration duration41 = minutes40.toStandardDuration();
        org.joda.time.Duration duration42 = minutes40.toStandardDuration();
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration42);
        int int44 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Chronology chronology45 = chronology8.withZone(dateTimeZone11);
        org.joda.time.DurationField durationField46 = chronology45.eras();
        org.joda.time.DateTimeField dateTimeField47 = chronology45.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField46", Math.signum(durationField9.compareTo(durationField46)) == -Math.signum(durationField46.compareTo(durationField9)));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.minutes();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        boolean boolean14 = dateTimeZone11.isStandardOffset((long) (byte) 100);
        boolean boolean16 = dateTimeZone11.equals((java.lang.Object) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((-1L), dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone19.isLocalDateTimeGap(localDateTime21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime25 = dateTime23.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((-1L), dateTimeZone28);
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        java.util.Calendar calendar31 = dateTime29.toCalendar(locale30);
        org.joda.time.DateTime dateTime33 = dateTime29.plusMillis((int) '4');
        org.joda.time.DateTime dateTime34 = dateTime29.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        boolean boolean39 = dateTime37.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes40 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Duration duration41 = minutes40.toStandardDuration();
        org.joda.time.Duration duration42 = minutes40.toStandardDuration();
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration42);
        int int44 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Chronology chronology45 = chronology8.withZone(dateTimeZone11);
        org.joda.time.DurationField durationField46 = chronology8.eras();
        org.joda.time.DurationField durationField47 = chronology8.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField46", Math.signum(durationField9.compareTo(durationField46)) == -Math.signum(durationField46.compareTo(durationField9)));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod1 = days0.toMutablePeriod();
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod3 = days2.toMutablePeriod();
        mutablePeriod3.setSeconds((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval6 = null;
        mutablePeriod3.add(readableInterval6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.eras();
        int int9 = mutablePeriod3.get(durationFieldType8);
        boolean boolean10 = mutablePeriod1.isSupported(durationFieldType8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType8.getField(chronology11);
        boolean boolean13 = durationField12.isSupported();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((-1L), dateTimeZone16);
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.util.Calendar calendar19 = dateTime17.toCalendar(locale18);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMillis((int) '4');
        org.joda.time.DateTime dateTime22 = dateTime17.toDateTimeISO();
        org.joda.time.DateTime.Property property23 = dateTime17.millisOfDay();
        org.joda.time.DurationField durationField24 = property23.getRangeDurationField();
        long long26 = durationField24.getValueAsLong((long) 100);
        int int27 = durationField12.compareTo(durationField24);
        long long29 = durationField24.getMillis(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField24, and durationField12", !(durationField12.compareTo(durationField24) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField24.compareTo(durationField12))));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.dayTime();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-1L), dateTimeZone4);
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.util.Calendar calendar7 = dateTime5.toCalendar(locale6);
        org.joda.time.DateTime dateTime9 = dateTime5.plusMillis((int) '4');
        org.joda.time.Chronology chronology10 = dateTime5.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.minutes();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        boolean boolean16 = dateTimeZone13.isStandardOffset((long) (byte) 100);
        boolean boolean18 = dateTimeZone13.equals((java.lang.Object) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((-1L), dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone21.isLocalDateTimeGap(localDateTime23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime27 = dateTime25.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((-1L), dateTimeZone30);
        java.util.Locale locale32 = java.util.Locale.KOREAN;
        java.util.Calendar calendar33 = dateTime31.toCalendar(locale32);
        org.joda.time.DateTime dateTime35 = dateTime31.plusMillis((int) '4');
        org.joda.time.DateTime dateTime36 = dateTime31.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        boolean boolean41 = dateTime39.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes42 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Duration duration43 = minutes42.toStandardDuration();
        org.joda.time.Duration duration44 = minutes42.toStandardDuration();
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableDuration) duration44);
        int int46 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology47 = chronology10.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField48 = chronology10.eras();
        org.joda.time.Period period49 = new org.joda.time.Period(23L, periodType1, chronology10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField48", Math.signum(durationField11.compareTo(durationField48)) == -Math.signum(durationField48.compareTo(durationField11)));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType3 = periodType2.withYearsRemoved();
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod7 = days6.toMutablePeriod();
        org.joda.time.Duration duration8 = days6.toStandardDuration();
        org.joda.time.PeriodType periodType9 = days6.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((-1L), dateTimeZone12);
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.util.Calendar calendar15 = dateTime13.toCalendar(locale14);
        org.joda.time.DateTime dateTime17 = dateTime13.plusMillis((int) '4');
        org.joda.time.Chronology chronology18 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.hourOfHalfday();
        org.joda.time.Period period20 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType9, chronology18);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology18);
        org.joda.time.DateTimeField dateTimeField22 = chronology18.millisOfDay();
        org.joda.time.Period period23 = new org.joda.time.Period((long) (byte) 1, (long) 1, periodType2, chronology18);
        org.joda.time.DurationField durationField24 = chronology18.eras();
        org.joda.time.DurationField durationField25 = chronology18.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField25, and durationField24", !(durationField24.compareTo(durationField25) == 0) || (Math.signum(durationField24.compareTo(durationField24)) == Math.signum(durationField25.compareTo(durationField24))));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        org.joda.time.Interval interval3 = interval2.toInterval();
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Days days5 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod6 = days5.toMutablePeriod();
        org.joda.time.Duration duration7 = days5.toStandardDuration();
        long long8 = duration7.getStandardHours();
        mutableInterval4.setDurationAfterStart((org.joda.time.ReadableDuration) duration7);
        long long10 = duration7.getMillis();
        java.lang.String str11 = duration7.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((-1L), dateTimeZone16);
        org.joda.time.Interval interval18 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone16);
        boolean boolean20 = interval18.isAfter(100L);
        long long21 = interval18.getEndMillis();
        org.joda.time.Interval interval22 = interval18.toInterval();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((-1L), dateTimeZone25);
        java.util.Locale locale27 = java.util.Locale.KOREAN;
        java.util.Calendar calendar28 = dateTime26.toCalendar(locale27);
        org.joda.time.DateTime dateTime30 = dateTime26.plusMillis((int) '4');
        org.joda.time.DateTime dateTime31 = dateTime26.toDateTimeISO();
        org.joda.time.Instant instant32 = dateTime26.toInstant();
        org.joda.time.Instant instant33 = instant32.toInstant();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((-1L), dateTimeZone36);
        java.util.Locale locale38 = java.util.Locale.KOREAN;
        java.util.Calendar calendar39 = dateTime37.toCalendar(locale38);
        org.joda.time.DateTime dateTime41 = dateTime37.plusMillis((int) '4');
        org.joda.time.DateTime dateTime42 = dateTime37.toDateTimeISO();
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType44 = periodType43.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant32, (org.joda.time.ReadableInstant) dateTime42, periodType43);
        boolean boolean46 = interval18.isBefore((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Period period47 = duration7.toPeriodTo((org.joda.time.ReadableInstant) dateTime42);
        int int48 = dateTime42.getMillisOfDay();
        org.joda.time.DateTime dateTime50 = dateTime42.withCenturyOfEra((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((-1L), dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.minusMonths(100);
        boolean boolean58 = dateTime54.isAfter((-1L));
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.lang.String str62 = dateTimeZone60.getNameKey((long) 0);
        org.joda.time.DateTime dateTime63 = dateTime54.toDateTime(dateTimeZone60);
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableInstant) dateTime54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime63", (dateTime17.compareTo(dateTime63) == 0) == dateTime17.equals(dateTime63));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMonths(100);
        boolean boolean7 = dateTime3.isAfter((-1L));
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.lang.String str11 = dateTimeZone9.getNameKey((long) 0);
        org.joda.time.DateTime dateTime12 = dateTime3.toDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((-1L), dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone15.isLocalDateTimeGap(localDateTime17);
        int int20 = dateTimeZone15.getOffset((long) (byte) 10);
        long long22 = dateTimeZone9.getMillisKeepLocal(dateTimeZone15, (-312479L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime12", (dateTime3.compareTo(dateTime12) == 0) == dateTime3.equals(dateTime12));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMonths(100);
        boolean boolean7 = dateTime3.isAfter((-1L));
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.lang.String str11 = dateTimeZone9.getNameKey((long) 0);
        org.joda.time.DateTime dateTime12 = dateTime3.toDateTime(dateTimeZone9);
        long long16 = dateTimeZone9.convertLocalToUTC((long) 348, false, (long) 12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime12", (dateTime3.compareTo(dateTime12) == 0) == dateTime3.equals(dateTime12));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((-6380815651199988L));
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(679);
        org.joda.time.DateTime dateTime4 = dateTime1.withZone(dateTimeZone3);
        org.joda.time.Duration duration6 = org.joda.time.Duration.millis(1000L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((-1L), dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone9.isLocalDateTimeGap(localDateTime11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime15 = dateTime13.withHourOfDay(0);
        int int16 = dateTime15.getDayOfWeek();
        org.joda.time.DateTime dateTime18 = dateTime15.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime19 = dateTime15.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((-1L), dateTimeZone22);
        java.util.Locale locale24 = java.util.Locale.KOREAN;
        java.util.Calendar calendar25 = dateTime23.toCalendar(locale24);
        org.joda.time.DateTime dateTime27 = dateTime23.plusMillis((int) '4');
        org.joda.time.DateTime dateTime28 = dateTime23.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        boolean boolean33 = dateTime31.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes34 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        boolean boolean39 = dateTimeZone36.isStandardOffset((long) (byte) 100);
        boolean boolean41 = dateTimeZone36.equals((java.lang.Object) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((-1L), dateTimeZone44);
        org.joda.time.LocalDateTime localDateTime46 = null;
        boolean boolean47 = dateTimeZone44.isLocalDateTimeGap(localDateTime46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime50 = dateTime48.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((-1L), dateTimeZone53);
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.util.Calendar calendar56 = dateTime54.toCalendar(locale55);
        org.joda.time.DateTime dateTime58 = dateTime54.plusMillis((int) '4');
        org.joda.time.DateTime dateTime59 = dateTime54.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime62 = org.joda.time.DateTime.now(dateTimeZone61);
        boolean boolean64 = dateTime62.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes65 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Duration duration66 = minutes65.toStandardDuration();
        org.joda.time.Duration duration67 = minutes65.toStandardDuration();
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableDuration) duration67);
        int int69 = dateTimeZone36.getOffset((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTime dateTime70 = dateTime23.withZoneRetainFields(dateTimeZone36);
        boolean boolean71 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime72 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType75 = org.joda.time.PeriodType.seconds();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod(0L, periodType75);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod(32820001L, periodType75);
        org.joda.time.PeriodType periodType78 = periodType75.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) dateTime72, periodType75);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod(34, 34, (int) (short) 0, 7);
        org.joda.time.Period period86 = new org.joda.time.Period((long) (byte) 10);
        int int87 = period86.getSeconds();
        org.joda.time.DurationFieldType durationFieldType88 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period90 = period86.withFieldAdded(durationFieldType88, 86399);
        org.joda.time.DurationFieldType durationFieldType92 = period86.getFieldType(1);
        mutablePeriod84.set(durationFieldType92, (int) 'u');
        org.joda.time.DateTime dateTime96 = dateTime72.withFieldAdded(durationFieldType92, 35);
        boolean boolean97 = dateTime4.isBefore((org.joda.time.ReadableInstant) dateTime96);
        int int98 = dateTime96.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime4", (dateTime1.compareTo(dateTime4) == 0) == dateTime1.equals(dateTime4));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((-6380815651199988L));
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(679);
        org.joda.time.DateTime dateTime4 = dateTime1.withZone(dateTimeZone3);
        org.joda.time.Duration duration6 = org.joda.time.Duration.millis(1000L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((-1L), dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone9.isLocalDateTimeGap(localDateTime11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime15 = dateTime13.withHourOfDay(0);
        int int16 = dateTime15.getDayOfWeek();
        org.joda.time.DateTime dateTime18 = dateTime15.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime19 = dateTime15.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((-1L), dateTimeZone22);
        java.util.Locale locale24 = java.util.Locale.KOREAN;
        java.util.Calendar calendar25 = dateTime23.toCalendar(locale24);
        org.joda.time.DateTime dateTime27 = dateTime23.plusMillis((int) '4');
        org.joda.time.DateTime dateTime28 = dateTime23.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone30);
        boolean boolean33 = dateTime31.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes34 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        boolean boolean39 = dateTimeZone36.isStandardOffset((long) (byte) 100);
        boolean boolean41 = dateTimeZone36.equals((java.lang.Object) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((-1L), dateTimeZone44);
        org.joda.time.LocalDateTime localDateTime46 = null;
        boolean boolean47 = dateTimeZone44.isLocalDateTimeGap(localDateTime46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime50 = dateTime48.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((-1L), dateTimeZone53);
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.util.Calendar calendar56 = dateTime54.toCalendar(locale55);
        org.joda.time.DateTime dateTime58 = dateTime54.plusMillis((int) '4');
        org.joda.time.DateTime dateTime59 = dateTime54.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime62 = org.joda.time.DateTime.now(dateTimeZone61);
        boolean boolean64 = dateTime62.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes65 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Duration duration66 = minutes65.toStandardDuration();
        org.joda.time.Duration duration67 = minutes65.toStandardDuration();
        org.joda.time.MutableInterval mutableInterval68 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableDuration) duration67);
        int int69 = dateTimeZone36.getOffset((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTime dateTime70 = dateTime23.withZoneRetainFields(dateTimeZone36);
        boolean boolean71 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime72 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType75 = org.joda.time.PeriodType.seconds();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod(0L, periodType75);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod(32820001L, periodType75);
        org.joda.time.PeriodType periodType78 = periodType75.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) dateTime72, periodType75);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod(34, 34, (int) (short) 0, 7);
        org.joda.time.Period period86 = new org.joda.time.Period((long) (byte) 10);
        int int87 = period86.getSeconds();
        org.joda.time.DurationFieldType durationFieldType88 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period90 = period86.withFieldAdded(durationFieldType88, 86399);
        org.joda.time.DurationFieldType durationFieldType92 = period86.getFieldType(1);
        mutablePeriod84.set(durationFieldType92, (int) 'u');
        org.joda.time.DateTime dateTime96 = dateTime72.withFieldAdded(durationFieldType92, 35);
        boolean boolean97 = dateTime4.isBefore((org.joda.time.ReadableInstant) dateTime96);
        int int98 = dateTime96.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime4", (dateTime1.compareTo(dateTime4) == 0) == dateTime1.equals(dateTime4));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.minutes();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        boolean boolean14 = dateTimeZone11.isStandardOffset((long) (byte) 100);
        boolean boolean16 = dateTimeZone11.equals((java.lang.Object) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((-1L), dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone19.isLocalDateTimeGap(localDateTime21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime25 = dateTime23.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((-1L), dateTimeZone28);
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        java.util.Calendar calendar31 = dateTime29.toCalendar(locale30);
        org.joda.time.DateTime dateTime33 = dateTime29.plusMillis((int) '4');
        org.joda.time.DateTime dateTime34 = dateTime29.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        boolean boolean39 = dateTime37.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes40 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Duration duration41 = minutes40.toStandardDuration();
        org.joda.time.Duration duration42 = minutes40.toStandardDuration();
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration42);
        int int44 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Chronology chronology45 = chronology8.withZone(dateTimeZone11);
        org.joda.time.Period period47 = new org.joda.time.Period((long) (byte) 10);
        int int48 = period47.getSeconds();
        org.joda.time.Period period50 = period47.minusHours(100);
        int int51 = period50.getDays();
        int[] intArray54 = chronology8.get((org.joda.time.ReadablePeriod) period50, (-1L), (long) 'a');
        org.joda.time.DateTimeField dateTimeField55 = chronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField56 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField57 = chronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField58 = chronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField59 = chronology8.minuteOfHour();
        org.joda.time.DurationField durationField60 = chronology8.eras();
        org.joda.time.DurationField durationField61 = chronology8.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField60", Math.signum(durationField9.compareTo(durationField60)) == -Math.signum(durationField60.compareTo(durationField9)));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-1L), dateTimeZone4);
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.util.Calendar calendar7 = dateTime5.toCalendar(locale6);
        org.joda.time.DateTime dateTime9 = dateTime5.plusMillis((int) '4');
        org.joda.time.Chronology chronology10 = dateTime5.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.minutes();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        boolean boolean16 = dateTimeZone13.isStandardOffset((long) (byte) 100);
        boolean boolean18 = dateTimeZone13.equals((java.lang.Object) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((-1L), dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone21.isLocalDateTimeGap(localDateTime23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime27 = dateTime25.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((-1L), dateTimeZone30);
        java.util.Locale locale32 = java.util.Locale.KOREAN;
        java.util.Calendar calendar33 = dateTime31.toCalendar(locale32);
        org.joda.time.DateTime dateTime35 = dateTime31.plusMillis((int) '4');
        org.joda.time.DateTime dateTime36 = dateTime31.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        boolean boolean41 = dateTime39.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes42 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Duration duration43 = minutes42.toStandardDuration();
        org.joda.time.Duration duration44 = minutes42.toStandardDuration();
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableDuration) duration44);
        int int46 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology47 = chronology10.withZone(dateTimeZone13);
        org.joda.time.Period period49 = new org.joda.time.Period((long) (byte) 10);
        int int50 = period49.getSeconds();
        org.joda.time.Period period52 = period49.minusHours(100);
        int int53 = period52.getDays();
        int[] intArray56 = chronology10.get((org.joda.time.ReadablePeriod) period52, (-1L), (long) 'a');
        org.joda.time.DateTimeField dateTimeField57 = chronology10.minuteOfHour();
        org.joda.time.DurationField durationField58 = chronology10.centuries();
        org.joda.time.Period period59 = new org.joda.time.Period((long) 108, 172800000L, chronology10);
        org.joda.time.DurationField durationField60 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField60, durationField11, and durationField58", !(durationField60.compareTo(durationField11) == 0) || (Math.signum(durationField60.compareTo(durationField58)) == Math.signum(durationField11.compareTo(durationField58))));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-1L), dateTimeZone4);
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.util.Calendar calendar7 = dateTime5.toCalendar(locale6);
        org.joda.time.DateTime dateTime9 = dateTime5.plusMillis((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime5.plusMonths((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((-1L), dateTimeZone14);
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.util.Calendar calendar17 = dateTime15.toCalendar(locale16);
        org.joda.time.DateTime dateTime19 = dateTime15.plusMillis((int) '4');
        org.joda.time.DateTime dateTime20 = dateTime15.toDateTimeISO();
        org.joda.time.Instant instant21 = dateTime15.toInstant();
        org.joda.time.Instant instant22 = instant21.toInstant();
        org.joda.time.Minutes minutes23 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) instant21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((-1L), dateTimeZone26);
        java.util.Locale locale28 = java.util.Locale.KOREAN;
        java.util.Calendar calendar29 = dateTime27.toCalendar(locale28);
        org.joda.time.DateTime dateTime31 = dateTime27.plusMillis((int) '4');
        org.joda.time.Chronology chronology32 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.weekOfWeekyear();
        org.joda.time.DateTime dateTime34 = instant21.toDateTime(chronology32);
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("yearOfEra");
        java.util.Calendar calendar37 = dateTime34.toCalendar(locale36);
        boolean boolean38 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime.Property property39 = dateTime34.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((-1L), dateTimeZone42);
        java.util.Locale locale44 = java.util.Locale.KOREAN;
        java.util.Calendar calendar45 = dateTime43.toCalendar(locale44);
        org.joda.time.DateTime dateTime47 = dateTime43.plusMillis((int) '4');
        org.joda.time.DateTime dateTime48 = dateTime43.toDateTimeISO();
        org.joda.time.Instant instant49 = dateTime43.toInstant();
        org.joda.time.Instant instant50 = instant49.toInstant();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((-1L), dateTimeZone53);
        org.joda.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = dateTimeZone53.isLocalDateTimeGap(localDateTime55);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(dateTimeZone53);
        org.joda.time.DateTime dateTime59 = dateTime57.withHourOfDay(0);
        boolean boolean60 = instant50.isEqual((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.Duration duration62 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Instant instant64 = instant50.withDurationAdded((org.joda.time.ReadableDuration) duration62, (-1));
        org.joda.time.Instant instant66 = instant50.plus(4665600000L);
        boolean boolean67 = dateTime34.isBefore((org.joda.time.ReadableInstant) instant50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime57", (dateTime1.compareTo(dateTime57) == 0) == dateTime1.equals(dateTime57));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.Instant instant9 = dateTime3.toInstant();
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((-1L), dateTimeZone13);
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Calendar calendar16 = dateTime14.toCalendar(locale15);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMillis((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime14.toDateTimeISO();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType21 = periodType20.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant9, (org.joda.time.ReadableInstant) dateTime19, periodType20);
        org.joda.time.Instant instant25 = instant9.withDurationAdded(10L, (int) (byte) -1);
        org.joda.time.DateTime dateTime26 = instant9.toDateTimeISO();
        org.joda.time.Instant instant28 = instant9.minus((long) 9);
        boolean boolean30 = instant28.isBefore(522547200007L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime26", (dateTime3.compareTo(dateTime26) == 0) == dateTime3.equals(dateTime26));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.joda.time.Period period1 = new org.joda.time.Period(10L);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(23, 86399, (int) (byte) -1, 5, 3, 829, 5, 291);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((-1L), dateTimeZone13);
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Calendar calendar16 = dateTime14.toCalendar(locale15);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMillis((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime14.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        boolean boolean24 = dateTime22.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes25 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Duration duration26 = minutes25.toStandardDuration();
        org.joda.time.Duration duration29 = duration26.withDurationAdded((long) (byte) -1, (int) 'u');
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((-1L), dateTimeZone34);
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone34);
        boolean boolean38 = interval36.isAfter(100L);
        long long39 = interval36.getEndMillis();
        org.joda.time.Interval interval40 = interval36.toInterval();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) 59);
        boolean boolean43 = interval36.isAfter((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((-1L), dateTimeZone46);
        java.util.Locale locale48 = java.util.Locale.KOREAN;
        java.util.Calendar calendar49 = dateTime47.toCalendar(locale48);
        org.joda.time.DateTime dateTime51 = dateTime47.plusMillis((int) '4');
        org.joda.time.DateTime dateTime52 = dateTime47.toDateTimeISO();
        org.joda.time.DateTime dateTime54 = dateTime52.plusMillis((int) '#');
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((java.lang.Object) dateTime52, dateTimeZone56);
        org.joda.time.DateTime dateTime58 = dateTime42.toDateTime(dateTimeZone56);
        org.joda.time.Interval interval59 = duration26.toIntervalTo((org.joda.time.ReadableInstant) dateTime58);
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Period period61 = period1.minus((org.joda.time.ReadablePeriod) mutablePeriod10);
        mutablePeriod10.setWeeks(577);
        int int64 = mutablePeriod10.getMonths();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and dateTime58", (dateTime42.compareTo(dateTime58) == 0) == dateTime42.equals(dateTime58));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.Instant instant9 = dateTime3.toInstant();
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((-1L), dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone13.isLocalDateTimeGap(localDateTime15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime19 = dateTime17.withHourOfDay(0);
        boolean boolean20 = instant10.isEqual((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Duration duration22 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Instant instant24 = instant10.withDurationAdded((org.joda.time.ReadableDuration) duration22, (-1));
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((-1L), dateTimeZone27);
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.util.Calendar calendar30 = dateTime28.toCalendar(locale29);
        org.joda.time.DateTime dateTime32 = dateTime28.plusMillis((int) '4');
        org.joda.time.DateTime dateTime33 = dateTime28.toDateTimeISO();
        org.joda.time.DateTime dateTime35 = dateTime33.plusMillis((int) '#');
        int int36 = instant24.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Duration duration38 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((-1L), dateTimeZone41);
        java.util.Locale locale43 = java.util.Locale.KOREAN;
        java.util.Calendar calendar44 = dateTime42.toCalendar(locale43);
        org.joda.time.DateTime dateTime46 = dateTime42.plusMillis((int) '4');
        org.joda.time.DateTime dateTime47 = dateTime42.toDateTimeISO();
        org.joda.time.DateTime.Property property48 = dateTime42.weekyear();
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration38, (org.joda.time.ReadableInstant) dateTime42, periodType49);
        int int51 = dateTime42.getSecondOfDay();
        boolean boolean52 = dateTime33.isBefore((org.joda.time.ReadableInstant) dateTime42);
        int int53 = dateTime33.getEra();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(348);
        int int57 = dateTimeZone55.getOffset((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime33.toMutableDateTime(dateTimeZone55);
        java.lang.String str60 = dateTimeZone55.getShortName((long) 97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime58", (dateTime3.compareTo(mutableDateTime58) == 0) == dateTime3.equals(mutableDateTime58));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.minutes();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        boolean boolean14 = dateTimeZone11.isStandardOffset((long) (byte) 100);
        boolean boolean16 = dateTimeZone11.equals((java.lang.Object) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((-1L), dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone19.isLocalDateTimeGap(localDateTime21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime25 = dateTime23.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((-1L), dateTimeZone28);
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        java.util.Calendar calendar31 = dateTime29.toCalendar(locale30);
        org.joda.time.DateTime dateTime33 = dateTime29.plusMillis((int) '4');
        org.joda.time.DateTime dateTime34 = dateTime29.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        boolean boolean39 = dateTime37.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes40 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Duration duration41 = minutes40.toStandardDuration();
        org.joda.time.Duration duration42 = minutes40.toStandardDuration();
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration42);
        int int44 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Chronology chronology45 = chronology8.withZone(dateTimeZone11);
        org.joda.time.DurationField durationField46 = chronology8.eras();
        java.lang.String str47 = chronology8.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField46", Math.signum(durationField9.compareTo(durationField46)) == -Math.signum(durationField46.compareTo(durationField9)));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime8 = dateTime6.withHourOfDay(0);
        org.joda.time.DateTime dateTime10 = dateTime6.minusHours((int) (byte) 1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(0L, chronology12);
        org.joda.time.Period period15 = period13.plusMillis(100);
        int int16 = period15.getHours();
        org.joda.time.Period period18 = period15.plusMonths(100);
        org.joda.time.Period period20 = period18.withYears(3);
        org.joda.time.Period period21 = period18.normalizedStandard();
        org.joda.time.DateTime dateTime22 = dateTime10.minus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((-1L), dateTimeZone25);
        java.util.Locale locale27 = java.util.Locale.KOREAN;
        java.util.Calendar calendar28 = dateTime26.toCalendar(locale27);
        org.joda.time.DateTime dateTime30 = dateTime26.plusMillis((int) '4');
        org.joda.time.DateTime dateTime31 = dateTime26.toDateTimeISO();
        org.joda.time.Instant instant32 = dateTime26.toInstant();
        org.joda.time.Instant instant33 = instant32.toInstant();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((-1L), dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = dateTimeZone36.isLocalDateTimeGap(localDateTime38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime42 = dateTime40.withHourOfDay(0);
        boolean boolean43 = instant33.isEqual((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Instant instant47 = instant33.withDurationAdded((org.joda.time.ReadableDuration) duration45, (-1));
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((-1L), dateTimeZone50);
        java.util.Locale locale52 = java.util.Locale.KOREAN;
        java.util.Calendar calendar53 = dateTime51.toCalendar(locale52);
        org.joda.time.DateTime dateTime55 = dateTime51.plusMillis((int) '4');
        org.joda.time.DateTime dateTime56 = dateTime51.toDateTimeISO();
        org.joda.time.DateTime dateTime58 = dateTime56.plusMillis((int) '#');
        int int59 = instant47.compareTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration61 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((-1L), dateTimeZone64);
        java.util.Locale locale66 = java.util.Locale.KOREAN;
        java.util.Calendar calendar67 = dateTime65.toCalendar(locale66);
        org.joda.time.DateTime dateTime69 = dateTime65.plusMillis((int) '4');
        org.joda.time.DateTime dateTime70 = dateTime65.toDateTimeISO();
        org.joda.time.DateTime.Property property71 = dateTime65.weekyear();
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration61, (org.joda.time.ReadableInstant) dateTime65, periodType72);
        int int74 = dateTime65.getSecondOfDay();
        boolean boolean75 = dateTime56.isBefore((org.joda.time.ReadableInstant) dateTime65);
        int int76 = dateTime56.getEra();
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetMillis(348);
        int int80 = dateTimeZone78.getOffset((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime81 = dateTime56.toMutableDateTime(dateTimeZone78);
        org.joda.time.DateTime dateTime82 = dateTime22.withZoneRetainFields(dateTimeZone78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime81", (dateTime3.compareTo(mutableDateTime81) == 0) == dateTime3.equals(mutableDateTime81));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) dateTime7);
        org.joda.time.DateTime.Property property10 = dateTime7.weekyear();
        org.joda.time.DateTime dateTime11 = property10.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((-1L), dateTimeZone14);
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.util.Calendar calendar17 = dateTime15.toCalendar(locale16);
        org.joda.time.DateTime dateTime19 = dateTime15.plusMillis((int) '4');
        org.joda.time.DateTime dateTime21 = dateTime15.plusMonths((int) (byte) 1);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTime dateTime24 = dateTime21.withZone(dateTimeZone23);
        org.joda.time.DateTime.Property property25 = dateTime24.era();
        org.joda.time.Duration duration26 = new org.joda.time.Duration((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Hours hours27 = duration26.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime24", (dateTime21.compareTo(dateTime24) == 0) == dateTime21.equals(dateTime24));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime8 = dateTime6.withHourOfDay(0);
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime dateTime11 = dateTime8.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime8.millisOfSecond();
        org.joda.time.DateTime dateTime13 = property12.withMinimumValue();
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekyear(848);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((-1L), dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone20.isLocalDateTimeGap(localDateTime22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime26 = dateTime24.withHourOfDay(0);
        int int27 = dateTime26.getDayOfWeek();
        org.joda.time.DateTime dateTime29 = dateTime26.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime30 = dateTime26.toDateTimeISO();
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableDuration) duration17);
        org.joda.time.Chronology chronology33 = mutableInterval32.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.eras();
        org.joda.time.DurationField durationField35 = chronology33.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField35, and durationField34", !(durationField34.compareTo(durationField35) == 0) || (Math.signum(durationField34.compareTo(durationField34)) == Math.signum(durationField35.compareTo(durationField34))));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod4 = days3.toMutablePeriod();
        org.joda.time.Duration duration5 = days3.toStandardDuration();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant2, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.PeriodType periodType7 = mutablePeriod6.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        java.util.GregorianCalendar gregorianCalendar11 = dateTime10.toGregorianCalendar();
        int int12 = dateTime10.getHourOfDay();
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.util.Locale locale14 = locale13.stripExtensions();
        java.lang.String str15 = locale14.toLanguageTag();
        java.util.Calendar calendar16 = dateTime10.toCalendar(locale14);
        org.joda.time.DateTime.Property property17 = dateTime10.minuteOfHour();
        org.joda.time.Days days18 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod19 = days18.toMutablePeriod();
        org.joda.time.Duration duration20 = days18.toStandardDuration();
        org.joda.time.Days days21 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod22 = days21.toMutablePeriod();
        org.joda.time.Duration duration23 = days21.toStandardDuration();
        boolean boolean24 = duration20.isLongerThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration23);
        org.joda.time.Days days30 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod31 = days30.toMutablePeriod();
        org.joda.time.Duration duration32 = days30.toStandardDuration();
        org.joda.time.PeriodType periodType33 = days30.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((-1L), dateTimeZone36);
        java.util.Locale locale38 = java.util.Locale.KOREAN;
        java.util.Calendar calendar39 = dateTime37.toCalendar(locale38);
        org.joda.time.DateTime dateTime41 = dateTime37.plusMillis((int) '4');
        org.joda.time.Chronology chronology42 = dateTime37.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.hourOfHalfday();
        org.joda.time.Period period44 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType33, chronology42);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(chronology42);
        org.joda.time.DateTimeField dateTimeField46 = chronology42.millisOfDay();
        org.joda.time.Interval interval47 = new org.joda.time.Interval((-259200000L), (long) '#', chronology42);
        boolean boolean48 = interval25.isBefore((org.joda.time.ReadableInterval) interval47);
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType50 = periodType49.withYearsRemoved();
        org.joda.time.Duration duration52 = org.joda.time.Duration.millis((long) (short) -1);
        long long53 = duration52.getStandardMinutes();
        org.joda.time.PeriodType periodType56 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType57 = periodType56.withYearsRemoved();
        org.joda.time.Days days60 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod61 = days60.toMutablePeriod();
        org.joda.time.Duration duration62 = days60.toStandardDuration();
        org.joda.time.PeriodType periodType63 = days60.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((-1L), dateTimeZone66);
        java.util.Locale locale68 = java.util.Locale.KOREAN;
        java.util.Calendar calendar69 = dateTime67.toCalendar(locale68);
        org.joda.time.DateTime dateTime71 = dateTime67.plusMillis((int) '4');
        org.joda.time.Chronology chronology72 = dateTime67.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.hourOfHalfday();
        org.joda.time.Period period74 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType63, chronology72);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(chronology72);
        org.joda.time.DateTimeField dateTimeField76 = chronology72.millisOfDay();
        org.joda.time.Period period77 = new org.joda.time.Period((long) (byte) 1, (long) 1, periodType56, chronology72);
        org.joda.time.Period period78 = duration52.toPeriod(chronology72);
        org.joda.time.DateTimeField dateTimeField79 = chronology72.hourOfDay();
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((java.lang.Object) interval25, periodType50, chronology72);
        org.joda.time.DurationField durationField81 = chronology72.years();
        org.joda.time.DateTimeField dateTimeField82 = chronology72.weekyear();
        org.joda.time.DateTimeField dateTimeField83 = chronology72.dayOfYear();
        org.joda.time.DurationField durationField84 = chronology72.weekyears();
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod(343L, 1645513862327L, periodType7, chronology72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField81 and durationField84", (durationField81.compareTo(durationField84) == 0) == durationField81.equals(durationField84));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.Instant instant9 = dateTime3.toInstant();
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((-1L), dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone13.isLocalDateTimeGap(localDateTime15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime19 = dateTime17.withHourOfDay(0);
        boolean boolean20 = instant10.isEqual((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Duration duration22 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Instant instant24 = instant10.withDurationAdded((org.joda.time.ReadableDuration) duration22, (-1));
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((-1L), dateTimeZone27);
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.util.Calendar calendar30 = dateTime28.toCalendar(locale29);
        org.joda.time.DateTime dateTime32 = dateTime28.plusMillis((int) '4');
        org.joda.time.DateTime dateTime33 = dateTime28.toDateTimeISO();
        org.joda.time.DateTime dateTime35 = dateTime33.plusMillis((int) '#');
        int int36 = instant24.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime37 = dateTime33.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((-1L), dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime42 = null;
        boolean boolean43 = dateTimeZone40.isLocalDateTimeGap(localDateTime42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime46 = dateTime44.withHourOfDay(0);
        int int47 = dateTime46.getDayOfWeek();
        org.joda.time.DateTime dateTime49 = dateTime46.minusWeeks((int) (byte) 10);
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTime dateTime53 = dateTime33.toDateTime(dateTimeZone52);
        int int55 = dateTimeZone52.getOffsetFromLocal(59999L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime53", (dateTime3.compareTo(dateTime53) == 0) == dateTime3.equals(dateTime53));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.joda.time.MutableInterval mutableInterval0 = new org.joda.time.MutableInterval();
        long long1 = mutableInterval0.toDurationMillis();
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod7 = days6.toMutablePeriod();
        org.joda.time.Duration duration8 = days6.toStandardDuration();
        org.joda.time.PeriodType periodType9 = days6.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((-1L), dateTimeZone12);
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.util.Calendar calendar15 = dateTime13.toCalendar(locale14);
        org.joda.time.DateTime dateTime17 = dateTime13.plusMillis((int) '4');
        org.joda.time.Chronology chronology18 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.hourOfHalfday();
        org.joda.time.Period period20 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType9, chronology18);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology18);
        org.joda.time.DateTimeField dateTimeField22 = chronology18.millisOfDay();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((-259200000L), (long) '#', chronology18);
        mutableInterval0.setChronology(chronology18);
        org.joda.time.DurationField durationField25 = chronology18.eras();
        org.joda.time.DurationFieldType durationFieldType26 = durationField25.getType();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((-1L), dateTimeZone30);
        java.util.Locale locale32 = java.util.Locale.KOREAN;
        java.util.Calendar calendar33 = dateTime31.toCalendar(locale32);
        org.joda.time.DateTime dateTime35 = dateTime31.plusMillis((int) '4');
        org.joda.time.DateTime dateTime36 = dateTime31.toDateTimeISO();
        org.joda.time.Instant instant37 = dateTime31.toInstant();
        org.joda.time.Instant instant38 = instant37.toInstant();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((-1L), dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime43 = null;
        boolean boolean44 = dateTimeZone41.isLocalDateTimeGap(localDateTime43);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime47 = dateTime45.withHourOfDay(0);
        boolean boolean48 = instant38.isEqual((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Duration duration50 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Instant instant52 = instant38.withDurationAdded((org.joda.time.ReadableDuration) duration50, (-1));
        boolean boolean54 = instant52.isBefore((long) (short) 10);
        org.joda.time.Chronology chronology55 = instant52.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.dayOfMonth();
        org.joda.time.Period period57 = new org.joda.time.Period(652278993L, chronology55);
        org.joda.time.DurationField durationField58 = chronology55.centuries();
        boolean boolean59 = durationFieldType26.isSupported(chronology55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField25 and durationField58", Math.signum(durationField25.compareTo(durationField58)) == -Math.signum(durationField58.compareTo(durationField25)));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-1L), dateTimeZone4);
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.util.Calendar calendar7 = dateTime5.toCalendar(locale6);
        org.joda.time.DateTime dateTime9 = dateTime5.plusMillis((int) '4');
        org.joda.time.Chronology chronology10 = dateTime5.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.minutes();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        boolean boolean16 = dateTimeZone13.isStandardOffset((long) (byte) 100);
        boolean boolean18 = dateTimeZone13.equals((java.lang.Object) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((-1L), dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone21.isLocalDateTimeGap(localDateTime23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime27 = dateTime25.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((-1L), dateTimeZone30);
        java.util.Locale locale32 = java.util.Locale.KOREAN;
        java.util.Calendar calendar33 = dateTime31.toCalendar(locale32);
        org.joda.time.DateTime dateTime35 = dateTime31.plusMillis((int) '4');
        org.joda.time.DateTime dateTime36 = dateTime31.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        boolean boolean41 = dateTime39.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes42 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Duration duration43 = minutes42.toStandardDuration();
        org.joda.time.Duration duration44 = minutes42.toStandardDuration();
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableDuration) duration44);
        int int46 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology47 = chronology10.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField48 = chronology10.eras();
        org.joda.time.Interval interval49 = new org.joda.time.Interval((-73852033L), 1645513806809L, chronology10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField48", Math.signum(durationField11.compareTo(durationField48)) == -Math.signum(durationField48.compareTo(durationField11)));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.Instant instant9 = dateTime3.toInstant();
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((-1L), dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone13.isLocalDateTimeGap(localDateTime15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime19 = dateTime17.withHourOfDay(0);
        boolean boolean20 = instant10.isEqual((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Duration duration22 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Instant instant24 = instant10.withDurationAdded((org.joda.time.ReadableDuration) duration22, (-1));
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((-1L), dateTimeZone27);
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.util.Calendar calendar30 = dateTime28.toCalendar(locale29);
        org.joda.time.DateTime dateTime32 = dateTime28.plusMillis((int) '4');
        org.joda.time.DateTime dateTime33 = dateTime28.toDateTimeISO();
        org.joda.time.DateTime dateTime35 = dateTime33.plusMillis((int) '#');
        int int36 = instant24.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime37 = dateTime33.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((-1L), dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime42 = null;
        boolean boolean43 = dateTimeZone40.isLocalDateTimeGap(localDateTime42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime46 = dateTime44.withHourOfDay(0);
        int int47 = dateTime46.getDayOfWeek();
        org.joda.time.DateTime dateTime49 = dateTime46.minusWeeks((int) (byte) 10);
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTime dateTime53 = dateTime33.toDateTime(dateTimeZone52);
        int int55 = dateTimeZone52.getStandardOffset((-111852L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime53", (dateTime3.compareTo(dateTime53) == 0) == dateTime3.equals(dateTime53));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod1 = days0.toMutablePeriod();
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod3 = days2.toMutablePeriod();
        mutablePeriod3.setSeconds((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval6 = null;
        mutablePeriod3.add(readableInterval6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.eras();
        int int9 = mutablePeriod3.get(durationFieldType8);
        boolean boolean10 = mutablePeriod1.isSupported(durationFieldType8);
        mutablePeriod1.addSeconds((int) '#');
        mutablePeriod1.addSeconds((int) (short) 0);
        mutablePeriod1.setYears(7);
        mutablePeriod1.setMonths((-100));
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod1);
        int int20 = mutablePeriod19.getMillis();
        mutablePeriod19.addMinutes((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((-1L), dateTimeZone27);
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.util.Calendar calendar30 = dateTime28.toCalendar(locale29);
        org.joda.time.DateTime dateTime32 = dateTime28.plusMillis((int) '4');
        org.joda.time.Chronology chronology33 = dateTime28.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.minutes();
        org.joda.time.DurationField durationField35 = chronology33.eras();
        mutablePeriod19.setPeriod((-7L), (long) 225, chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField34 and durationField35", Math.signum(durationField34.compareTo(durationField35)) == -Math.signum(durationField35.compareTo(durationField34)));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        int int6 = dateTime3.getSecondOfMinute();
        org.joda.time.DateTime.Property property7 = dateTime3.hourOfDay();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property7.getAsText(locale9);
        org.joda.time.DateTime dateTime12 = property7.addToCopy(6);
        org.joda.time.DateTime dateTime13 = property7.withMaximumValue();
        java.util.GregorianCalendar gregorianCalendar14 = dateTime13.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((-1L), dateTimeZone17);
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.util.Calendar calendar20 = dateTime18.toCalendar(locale19);
        org.joda.time.DateTime dateTime22 = dateTime18.plusMillis((int) '4');
        org.joda.time.DateTime dateTime23 = dateTime18.toDateTimeISO();
        org.joda.time.DateTime dateTime25 = dateTime23.plusMillis((int) '#');
        int int26 = dateTime25.getMillisOfSecond();
        org.joda.time.DateTime dateTime27 = dateTime25.toDateTimeISO();
        boolean boolean28 = dateTime13.isEqual((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime30 = dateTime27.minusSeconds(70);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((-1L), dateTimeZone33);
        int int35 = dateTime34.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        boolean boolean39 = dateTime34.isEqual((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalDate localDate40 = dateTime34.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(6, 0);
        org.joda.time.DateTime dateTime44 = dateTime34.withZoneRetainFields(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(679);
        long long48 = dateTimeZone43.getMillisKeepLocal(dateTimeZone46, 1645513740L);
        org.joda.time.DateTime dateTime49 = dateTime27.toDateTime(dateTimeZone46);
        java.lang.String str51 = dateTimeZone46.getNameKey(4665600000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime49", (dateTime25.compareTo(dateTime49) == 0) == dateTime25.equals(dateTime49));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.Instant instant9 = dateTime3.toInstant();
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((-1L), dateTimeZone13);
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Calendar calendar16 = dateTime14.toCalendar(locale15);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMillis((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime14.toDateTimeISO();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType21 = periodType20.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant9, (org.joda.time.ReadableInstant) dateTime19, periodType20);
        org.joda.time.Instant instant25 = instant9.withDurationAdded(10L, (int) (byte) -1);
        org.joda.time.DateTime dateTime26 = instant9.toDateTimeISO();
        org.joda.time.Duration duration28 = org.joda.time.Duration.millis((long) (short) -1);
        long long29 = duration28.getStandardMinutes();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((-1L), dateTimeZone32);
        java.util.Locale locale34 = java.util.Locale.KOREAN;
        java.util.Calendar calendar35 = dateTime33.toCalendar(locale34);
        org.joda.time.DateTime dateTime37 = dateTime33.plusMillis((int) '4');
        org.joda.time.DateTime dateTime38 = dateTime33.toDateTimeISO();
        org.joda.time.Instant instant39 = dateTime33.toInstant();
        org.joda.time.Instant instant40 = instant39.toInstant();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((-1L), dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime45 = null;
        boolean boolean46 = dateTimeZone43.isLocalDateTimeGap(localDateTime45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime49 = dateTime47.withHourOfDay(0);
        boolean boolean50 = instant40.isEqual((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Duration duration52 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Instant instant54 = instant40.withDurationAdded((org.joda.time.ReadableDuration) duration52, (-1));
        boolean boolean56 = instant54.isBefore((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((-1L), dateTimeZone59);
        java.util.Locale locale61 = java.util.Locale.KOREAN;
        java.util.Calendar calendar62 = dateTime60.toCalendar(locale61);
        org.joda.time.DateTime dateTime64 = dateTime60.plusMillis((int) '4');
        org.joda.time.DateTime dateTime65 = dateTime60.toDateTimeISO();
        org.joda.time.Instant instant66 = dateTime60.toInstant();
        org.joda.time.PeriodType periodType67 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant54, (org.joda.time.ReadableInstant) dateTime60, periodType67);
        org.joda.time.Period period69 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration28, (org.joda.time.ReadableInstant) dateTime60);
        long long70 = duration28.getStandardHours();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((-1L), dateTimeZone73);
        org.joda.time.LocalDateTime localDateTime75 = null;
        boolean boolean76 = dateTimeZone73.isLocalDateTimeGap(localDateTime75);
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime(dateTimeZone73);
        org.joda.time.DateTime dateTime79 = dateTime77.withHourOfDay(0);
        int int80 = dateTime79.getDayOfWeek();
        org.joda.time.DateTime dateTime82 = dateTime79.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime84 = dateTime82.minusWeeks((int) (byte) 0);
        org.joda.time.Period period85 = duration28.toPeriodTo((org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.Instant instant86 = instant9.minus((org.joda.time.ReadableDuration) duration28);
        org.joda.time.Minutes minutes87 = duration28.toStandardMinutes();
        org.joda.time.MutableInterval mutableInterval88 = new org.joda.time.MutableInterval();
        org.joda.time.PeriodType periodType89 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType90 = periodType89.withMillisRemoved();
        org.joda.time.Period period91 = mutableInterval88.toPeriod(periodType89);
        org.joda.time.Minutes minutes92 = period91.toStandardMinutes();
        org.joda.time.Minutes minutes93 = minutes87.minus(minutes92);
        org.joda.time.Minutes minutes95 = minutes87.dividedBy((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime26", (dateTime3.compareTo(dateTime26) == 0) == dateTime3.equals(dateTime26));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-1L), dateTimeZone4);
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.util.Calendar calendar7 = dateTime5.toCalendar(locale6);
        org.joda.time.DateTime dateTime9 = dateTime5.plusMillis((int) '4');
        org.joda.time.DateTime dateTime10 = dateTime5.toDateTimeISO();
        org.joda.time.Instant instant11 = dateTime5.toInstant();
        org.joda.time.Instant instant12 = instant11.toInstant();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((-1L), dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone15.isLocalDateTimeGap(localDateTime17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime21 = dateTime19.withHourOfDay(0);
        boolean boolean22 = instant12.isEqual((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Duration duration24 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Instant instant26 = instant12.withDurationAdded((org.joda.time.ReadableDuration) duration24, (-1));
        boolean boolean28 = instant26.isBefore((long) (short) 10);
        org.joda.time.Chronology chronology29 = instant26.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.yearOfEra();
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((-1221955200000L), (long) 'x', chronology29);
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval();
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType34 = periodType33.withMillisRemoved();
        org.joda.time.Period period35 = mutableInterval32.toPeriod(periodType33);
        org.joda.time.DateTime dateTime36 = mutableInterval32.getEnd();
        mutableInterval31.setInterval((org.joda.time.ReadableInterval) mutableInterval32);
        boolean boolean39 = mutableInterval32.contains(1645513740000L);
        org.joda.time.ReadableInstant readableInstant40 = null;
        mutableInterval32.setEnd(readableInstant40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant26 and dateTime36", (instant26.compareTo(dateTime36) == 0) == instant26.equals(dateTime36));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-1L), dateTimeZone4);
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone4);
        org.joda.time.Interval interval7 = interval6.toInterval();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((-1L), dateTimeZone12);
        org.joda.time.Interval interval14 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = interval14.getEnd();
        org.joda.time.Interval interval16 = interval7.gap((org.joda.time.ReadableInterval) interval14);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((-1L), dateTimeZone19);
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.util.Calendar calendar22 = dateTime20.toCalendar(locale21);
        org.joda.time.DateTime dateTime24 = dateTime20.plusMillis((int) '4');
        org.joda.time.Chronology chronology25 = dateTime20.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.minutes();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        boolean boolean31 = dateTimeZone28.isStandardOffset((long) (byte) 100);
        boolean boolean33 = dateTimeZone28.equals((java.lang.Object) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((-1L), dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = dateTimeZone36.isLocalDateTimeGap(localDateTime38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime42 = dateTime40.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((-1L), dateTimeZone45);
        java.util.Locale locale47 = java.util.Locale.KOREAN;
        java.util.Calendar calendar48 = dateTime46.toCalendar(locale47);
        org.joda.time.DateTime dateTime50 = dateTime46.plusMillis((int) '4');
        org.joda.time.DateTime dateTime51 = dateTime46.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(dateTimeZone53);
        boolean boolean56 = dateTime54.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes57 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Duration duration58 = minutes57.toStandardDuration();
        org.joda.time.Duration duration59 = minutes57.toStandardDuration();
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableDuration) duration59);
        int int61 = dateTimeZone28.getOffset((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Chronology chronology62 = chronology25.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField63 = chronology25.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField64 = chronology25.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField65 = chronology25.weekOfWeekyear();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((java.lang.Object) interval14, chronology25);
        mutablePeriod66.setPeriod((long) (short) 10, (long) 'u');
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval();
        long long71 = mutableInterval70.toDurationMillis();
        org.joda.time.Days days76 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod77 = days76.toMutablePeriod();
        org.joda.time.Duration duration78 = days76.toStandardDuration();
        org.joda.time.PeriodType periodType79 = days76.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime((-1L), dateTimeZone82);
        java.util.Locale locale84 = java.util.Locale.KOREAN;
        java.util.Calendar calendar85 = dateTime83.toCalendar(locale84);
        org.joda.time.DateTime dateTime87 = dateTime83.plusMillis((int) '4');
        org.joda.time.Chronology chronology88 = dateTime83.getChronology();
        org.joda.time.DateTimeField dateTimeField89 = chronology88.hourOfHalfday();
        org.joda.time.Period period90 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType79, chronology88);
        org.joda.time.DateTime dateTime91 = new org.joda.time.DateTime(chronology88);
        org.joda.time.DateTimeField dateTimeField92 = chronology88.millisOfDay();
        org.joda.time.Interval interval93 = new org.joda.time.Interval((-259200000L), (long) '#', chronology88);
        mutableInterval70.setChronology(chronology88);
        org.joda.time.DurationField durationField95 = chronology88.eras();
        org.joda.time.DurationFieldType durationFieldType96 = durationField95.getType();
        mutablePeriod66.set(durationFieldType96, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField26 and durationField95", Math.signum(durationField26.compareTo(durationField95)) == -Math.signum(durationField95.compareTo(durationField26)));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (short) 0);
        mutablePeriod1.addMillis(34);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((-1L), dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone6.isLocalDateTimeGap(localDateTime8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime12 = dateTime10.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((-1L), dateTimeZone15);
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Calendar calendar18 = dateTime16.toCalendar(locale17);
        org.joda.time.DateTime dateTime20 = dateTime16.plusMillis((int) '4');
        org.joda.time.DateTime dateTime21 = dateTime16.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        boolean boolean26 = dateTime24.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Duration duration28 = minutes27.toStandardDuration();
        org.joda.time.Duration duration29 = minutes27.toStandardDuration();
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableDuration) duration29);
        org.joda.time.Duration duration31 = duration29.toDuration();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((-1L), dateTimeZone34);
        java.util.Locale locale36 = java.util.Locale.KOREAN;
        java.util.Calendar calendar37 = dateTime35.toCalendar(locale36);
        org.joda.time.DateTime dateTime39 = dateTime35.plusMillis((int) '4');
        org.joda.time.DateTime dateTime40 = dateTime35.toDateTimeISO();
        org.joda.time.Instant instant41 = dateTime35.toInstant();
        org.joda.time.Instant instant42 = instant41.toInstant();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((-1L), dateTimeZone45);
        org.joda.time.LocalDateTime localDateTime47 = null;
        boolean boolean48 = dateTimeZone45.isLocalDateTimeGap(localDateTime47);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(dateTimeZone45);
        org.joda.time.DateTime dateTime51 = dateTime49.withHourOfDay(0);
        boolean boolean52 = instant42.isEqual((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Duration duration54 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Instant instant56 = instant42.withDurationAdded((org.joda.time.ReadableDuration) duration54, (-1));
        boolean boolean58 = instant56.isBefore((long) (short) 10);
        org.joda.time.Chronology chronology59 = instant56.getChronology();
        mutablePeriod1.setPeriod((org.joda.time.ReadableDuration) duration31, chronology59);
        org.joda.time.DurationField durationField61 = chronology59.eras();
        org.joda.time.DurationField durationField62 = chronology59.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField61, durationField62, and durationField61", !(durationField61.compareTo(durationField62) == 0) || (Math.signum(durationField61.compareTo(durationField61)) == Math.signum(durationField62.compareTo(durationField61))));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        boolean boolean4 = dateTime2.isAfter((long) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime2.millisOfSecond();
        int int6 = property5.getLeapAmount();
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str8 = property5.getAsText(locale7);
        org.joda.time.Interval interval9 = property5.toInterval();
        boolean boolean11 = interval9.isAfter((-1L));
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        java.util.GregorianCalendar gregorianCalendar15 = dateTime14.toGregorianCalendar();
        int int16 = dateTime14.getHourOfDay();
        java.util.Locale locale17 = java.util.Locale.CHINA;
        java.util.Locale locale18 = locale17.stripExtensions();
        java.lang.String str19 = locale18.toLanguageTag();
        java.util.Calendar calendar20 = dateTime14.toCalendar(locale18);
        org.joda.time.DateTime.Property property21 = dateTime14.minuteOfHour();
        org.joda.time.Days days22 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod23 = days22.toMutablePeriod();
        org.joda.time.Duration duration24 = days22.toStandardDuration();
        org.joda.time.Days days25 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod26 = days25.toMutablePeriod();
        org.joda.time.Duration duration27 = days25.toStandardDuration();
        boolean boolean28 = duration24.isLongerThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Interval interval29 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableDuration) duration27);
        org.joda.time.Days days34 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod35 = days34.toMutablePeriod();
        org.joda.time.Duration duration36 = days34.toStandardDuration();
        org.joda.time.PeriodType periodType37 = days34.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((-1L), dateTimeZone40);
        java.util.Locale locale42 = java.util.Locale.KOREAN;
        java.util.Calendar calendar43 = dateTime41.toCalendar(locale42);
        org.joda.time.DateTime dateTime45 = dateTime41.plusMillis((int) '4');
        org.joda.time.Chronology chronology46 = dateTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.hourOfHalfday();
        org.joda.time.Period period48 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType37, chronology46);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(chronology46);
        org.joda.time.DateTimeField dateTimeField50 = chronology46.millisOfDay();
        org.joda.time.Interval interval51 = new org.joda.time.Interval((-259200000L), (long) '#', chronology46);
        boolean boolean52 = interval29.isBefore((org.joda.time.ReadableInterval) interval51);
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType54 = periodType53.withYearsRemoved();
        org.joda.time.Duration duration56 = org.joda.time.Duration.millis((long) (short) -1);
        long long57 = duration56.getStandardMinutes();
        org.joda.time.PeriodType periodType60 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType61 = periodType60.withYearsRemoved();
        org.joda.time.Days days64 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod65 = days64.toMutablePeriod();
        org.joda.time.Duration duration66 = days64.toStandardDuration();
        org.joda.time.PeriodType periodType67 = days64.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((-1L), dateTimeZone70);
        java.util.Locale locale72 = java.util.Locale.KOREAN;
        java.util.Calendar calendar73 = dateTime71.toCalendar(locale72);
        org.joda.time.DateTime dateTime75 = dateTime71.plusMillis((int) '4');
        org.joda.time.Chronology chronology76 = dateTime71.getChronology();
        org.joda.time.DateTimeField dateTimeField77 = chronology76.hourOfHalfday();
        org.joda.time.Period period78 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType67, chronology76);
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime(chronology76);
        org.joda.time.DateTimeField dateTimeField80 = chronology76.millisOfDay();
        org.joda.time.Period period81 = new org.joda.time.Period((long) (byte) 1, (long) 1, periodType60, chronology76);
        org.joda.time.Period period82 = duration56.toPeriod(chronology76);
        org.joda.time.DateTimeField dateTimeField83 = chronology76.hourOfDay();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((java.lang.Object) interval29, periodType54, chronology76);
        org.joda.time.DurationField durationField85 = chronology76.years();
        org.joda.time.DateTimeField dateTimeField86 = chronology76.weekyear();
        org.joda.time.DateTimeField dateTimeField87 = chronology76.dayOfYear();
        org.joda.time.DurationField durationField88 = chronology76.weekyears();
        org.joda.time.Interval interval89 = new org.joda.time.Interval((java.lang.Object) interval9, chronology76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField85 and durationField88", (durationField85.compareTo(durationField88) == 0) == durationField85.equals(durationField88));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime8 = dateTime6.withHourOfDay(0);
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime dateTime11 = dateTime8.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        java.util.GregorianCalendar gregorianCalendar17 = dateTime16.toGregorianCalendar();
        int int18 = dateTime16.getHourOfDay();
        java.util.Locale locale19 = java.util.Locale.CHINA;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = locale20.toLanguageTag();
        java.util.Calendar calendar22 = dateTime16.toCalendar(locale20);
        org.joda.time.DateTime.Property property23 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime25 = property23.addToCopy(10);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((-1L), dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone28.isLocalDateTimeGap(localDateTime30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime34 = dateTime32.plusHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((-1L), dateTimeZone37);
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        java.util.Calendar calendar40 = dateTime38.toCalendar(locale39);
        org.joda.time.DateTime dateTime42 = dateTime38.plusMillis((int) '4');
        org.joda.time.DateTime dateTime43 = dateTime38.toDateTimeISO();
        org.joda.time.Instant instant44 = dateTime38.toInstant();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((-1L), dateTimeZone47);
        java.util.Locale locale49 = java.util.Locale.KOREAN;
        java.util.Calendar calendar50 = dateTime48.toCalendar(locale49);
        org.joda.time.DateTime dateTime52 = dateTime48.plusMillis((int) '4');
        org.joda.time.DateTime dateTime53 = dateTime48.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone55);
        boolean boolean58 = dateTime56.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes59 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime48, (org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration60 = minutes59.toStandardDuration();
        org.joda.time.Period period61 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableDuration) duration60);
        org.joda.time.DateTime dateTime62 = dateTime32.minus((org.joda.time.ReadableDuration) duration60);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((-1L), dateTimeZone65);
        org.joda.time.LocalDateTime localDateTime67 = null;
        boolean boolean68 = dateTimeZone65.isLocalDateTimeGap(localDateTime67);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime71 = dateTime69.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((-1L), dateTimeZone74);
        java.util.Locale locale76 = java.util.Locale.KOREAN;
        java.util.Calendar calendar77 = dateTime75.toCalendar(locale76);
        org.joda.time.DateTime dateTime79 = dateTime75.plusMillis((int) '4');
        org.joda.time.DateTime dateTime80 = dateTime75.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime83 = org.joda.time.DateTime.now(dateTimeZone82);
        boolean boolean85 = dateTime83.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes86 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime75, (org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.Duration duration87 = minutes86.toStandardDuration();
        org.joda.time.Duration duration88 = minutes86.toStandardDuration();
        org.joda.time.MutableInterval mutableInterval89 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime71, (org.joda.time.ReadableDuration) duration88);
        int int90 = duration60.compareTo((org.joda.time.ReadableDuration) duration88);
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration88);
        org.joda.time.LocalTime localTime92 = dateTime25.toLocalTime();
        org.joda.time.DateTime.Property property93 = dateTime25.era();
        org.joda.time.Minutes minutes94 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime25);
        int int95 = dateTime13.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar17 and calendar22", (gregorianCalendar17.compareTo(calendar22) == 0) == gregorianCalendar17.equals(calendar22));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds1 = seconds0.negated();
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.Seconds seconds4 = seconds2.dividedBy(23);
        org.joda.time.Seconds seconds5 = seconds0.plus(seconds4);
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds7 = seconds6.negated();
        org.joda.time.Seconds seconds8 = seconds4.minus(seconds6);
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.ONE;
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.ONE;
        org.joda.time.Seconds seconds11 = seconds9.minus(seconds10);
        org.joda.time.Duration duration12 = seconds9.toStandardDuration();
        org.joda.time.Seconds seconds13 = seconds9.negated();
        boolean boolean14 = seconds8.isGreaterThan(seconds13);
        org.joda.time.Seconds seconds16 = seconds8.multipliedBy(0);
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.THREE;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (byte) 10);
        int int20 = period19.getSeconds();
        org.joda.time.Period period22 = period19.minusHours(100);
        org.joda.time.Period period24 = period19.minusSeconds((int) '4');
        org.joda.time.Period period26 = period19.withHours(10);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        boolean boolean31 = dateTime29.isAfter((long) (byte) 10);
        org.joda.time.Interval interval32 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period26, (org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        java.util.GregorianCalendar gregorianCalendar36 = dateTime35.toGregorianCalendar();
        int int37 = dateTime35.getHourOfDay();
        java.util.Locale locale38 = java.util.Locale.CHINA;
        java.util.Locale locale39 = locale38.stripExtensions();
        java.lang.String str40 = locale39.toLanguageTag();
        java.util.Calendar calendar41 = dateTime35.toCalendar(locale39);
        org.joda.time.DateTime dateTime43 = dateTime35.plusHours((int) 'x');
        boolean boolean44 = interval32.isBefore((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Interval interval46 = interval32.withStartMillis((long) '#');
        org.joda.time.Seconds seconds47 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval32);
        boolean boolean48 = seconds17.isLessThan(seconds47);
        org.joda.time.Seconds seconds49 = seconds16.plus(seconds47);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((-1L), dateTimeZone52);
        java.util.Locale locale54 = java.util.Locale.KOREAN;
        java.util.Calendar calendar55 = dateTime53.toCalendar(locale54);
        org.joda.time.DateTime dateTime57 = dateTime53.plusMillis((int) '4');
        org.joda.time.DateTime dateTime58 = dateTime53.toDateTimeISO();
        int int59 = dateTime58.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((-1L), dateTimeZone62);
        java.util.Locale locale64 = java.util.Locale.KOREAN;
        java.util.Calendar calendar65 = dateTime63.toCalendar(locale64);
        org.joda.time.DateTime dateTime67 = dateTime63.plusMillis((int) '4');
        org.joda.time.DateTime dateTime69 = dateTime63.plusMonths((int) (byte) 1);
        org.joda.time.YearMonthDay yearMonthDay70 = dateTime63.toYearMonthDay();
        org.joda.time.DateTime dateTime72 = dateTime63.minus((long) 0);
        org.joda.time.DateTime dateTime74 = dateTime72.plusMillis(570);
        org.joda.time.Seconds seconds75 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableInstant) dateTime74);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period(0L, chronology77);
        org.joda.time.Period period80 = period78.plusMillis(100);
        int int81 = period80.getHours();
        org.joda.time.Period period83 = period80.minusMinutes(508);
        org.joda.time.Seconds seconds84 = period83.toStandardSeconds();
        org.joda.time.Seconds seconds86 = seconds84.plus((-457087));
        org.joda.time.Seconds seconds87 = org.joda.time.Seconds.ZERO;
        org.joda.time.MutablePeriod mutablePeriod88 = seconds87.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType89 = org.joda.time.DurationFieldType.seconds();
        int int90 = seconds87.get(durationFieldType89);
        org.joda.time.Seconds seconds91 = seconds86.plus(seconds87);
        boolean boolean92 = seconds75.isGreaterThan(seconds87);
        org.joda.time.DurationFieldType durationFieldType93 = seconds87.getFieldType();
        org.joda.time.Seconds seconds95 = seconds87.minus((int) 'u');
        org.joda.time.Seconds seconds97 = seconds95.minus((-72));
        org.joda.time.Seconds seconds98 = seconds49.minus(seconds97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar36 and calendar41", (gregorianCalendar36.compareTo(calendar41) == 0) == gregorianCalendar36.equals(calendar41));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        java.util.GregorianCalendar gregorianCalendar3 = dateTime2.toGregorianCalendar();
        int int4 = dateTime2.getHourOfDay();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.toLanguageTag();
        java.util.Calendar calendar8 = dateTime2.toCalendar(locale6);
        org.joda.time.DateTime.Property property9 = dateTime2.minuteOfHour();
        org.joda.time.Days days10 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod11 = days10.toMutablePeriod();
        org.joda.time.Duration duration12 = days10.toStandardDuration();
        org.joda.time.Days days13 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod14 = days13.toMutablePeriod();
        org.joda.time.Duration duration15 = days13.toStandardDuration();
        boolean boolean16 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration15);
        org.joda.time.Period period18 = interval17.toPeriod();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((-1L), dateTimeZone23);
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone23);
        boolean boolean27 = interval25.isAfter(100L);
        long long28 = interval25.getEndMillis();
        org.joda.time.DateTime dateTime29 = interval25.getEnd();
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval();
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType32 = periodType31.withMillisRemoved();
        org.joda.time.Period period33 = mutableInterval30.toPeriod(periodType31);
        org.joda.time.DateTime dateTime34 = mutableInterval30.getEnd();
        mutableInterval30.setDurationAfterStart(518400000L);
        boolean boolean37 = interval25.isAfter((org.joda.time.ReadableInterval) mutableInterval30);
        org.joda.time.Chronology chronology38 = interval25.getChronology();
        org.joda.time.Period period39 = new org.joda.time.Period((java.lang.Object) period18, chronology38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar3 and calendar8", (gregorianCalendar3.compareTo(calendar8) == 0) == gregorianCalendar3.equals(calendar8));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod1 = days0.toMutablePeriod();
        mutablePeriod1.setSeconds((int) (byte) 0);
        mutablePeriod1.setDays((int) 'a');
        mutablePeriod1.setDays((int) '4');
        org.joda.time.PeriodType periodType8 = mutablePeriod1.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        java.util.GregorianCalendar gregorianCalendar12 = dateTime11.toGregorianCalendar();
        int int13 = dateTime11.getHourOfDay();
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale15.toLanguageTag();
        java.util.Calendar calendar17 = dateTime11.toCalendar(locale15);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.Days days19 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod20 = days19.toMutablePeriod();
        org.joda.time.Duration duration21 = days19.toStandardDuration();
        org.joda.time.Days days22 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod23 = days22.toMutablePeriod();
        org.joda.time.Duration duration24 = days22.toStandardDuration();
        boolean boolean25 = duration21.isLongerThan((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardMinutes((long) (byte) -1);
        org.joda.time.Duration duration29 = duration24.plus((org.joda.time.ReadableDuration) duration28);
        mutablePeriod1.setPeriod((org.joda.time.ReadableDuration) duration29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((-1L), dateTimeZone33);
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.util.Calendar calendar36 = dateTime34.toCalendar(locale35);
        int int37 = dateTime34.getSecondOfMinute();
        org.joda.time.DateTime.Property property38 = dateTime34.hourOfDay();
        org.joda.time.DurationField durationField39 = property38.getDurationField();
        java.util.Locale locale40 = null;
        java.lang.String str41 = property38.getAsText(locale40);
        org.joda.time.DateTime dateTime43 = property38.addToCopy(6);
        org.joda.time.DateTime dateTime45 = dateTime43.minusSeconds(4);
        org.joda.time.DateTime dateTime47 = dateTime45.plusDays(348);
        org.joda.time.Interval interval48 = duration29.toIntervalFrom((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) 2, (long) 23);
        org.joda.time.Interval interval52 = mutableInterval51.toInterval();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((-1L), dateTimeZone57);
        org.joda.time.Interval interval59 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone57);
        org.joda.time.MutableInterval mutableInterval60 = interval59.toMutableInterval();
        boolean boolean61 = mutableInterval51.overlaps((org.joda.time.ReadableInterval) interval59);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((-1L), dateTimeZone64);
        org.joda.time.LocalDateTime localDateTime66 = null;
        boolean boolean67 = dateTimeZone64.isLocalDateTimeGap(localDateTime66);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(dateTimeZone64);
        org.joda.time.DateTime dateTime70 = dateTime68.withHourOfDay(0);
        int int71 = dateTime70.getDayOfWeek();
        org.joda.time.DateTime dateTime73 = dateTime70.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime.Property property74 = dateTime70.millisOfSecond();
        boolean boolean75 = interval59.isBefore((org.joda.time.ReadableInstant) dateTime70);
        boolean boolean76 = interval48.isBefore((org.joda.time.ReadableInterval) interval59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar12 and calendar17", (gregorianCalendar12.compareTo(calendar17) == 0) == gregorianCalendar12.equals(calendar17));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        org.joda.time.Interval interval3 = interval2.toInterval();
        org.joda.time.Days days4 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        java.util.GregorianCalendar gregorianCalendar8 = dateTime7.toGregorianCalendar();
        int int9 = dateTime7.getHourOfDay();
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.lang.String str12 = locale11.toLanguageTag();
        java.util.Calendar calendar13 = dateTime7.toCalendar(locale11);
        org.joda.time.DateTime.Property property14 = dateTime7.minuteOfHour();
        org.joda.time.Days days15 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod16 = days15.toMutablePeriod();
        org.joda.time.Duration duration17 = days15.toStandardDuration();
        org.joda.time.Days days18 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod19 = days18.toMutablePeriod();
        org.joda.time.Duration duration20 = days18.toStandardDuration();
        boolean boolean21 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Interval interval22 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.Days days27 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod28 = days27.toMutablePeriod();
        org.joda.time.Duration duration29 = days27.toStandardDuration();
        org.joda.time.PeriodType periodType30 = days27.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((-1L), dateTimeZone33);
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.util.Calendar calendar36 = dateTime34.toCalendar(locale35);
        org.joda.time.DateTime dateTime38 = dateTime34.plusMillis((int) '4');
        org.joda.time.Chronology chronology39 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.hourOfHalfday();
        org.joda.time.Period period41 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType30, chronology39);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(chronology39);
        org.joda.time.DateTimeField dateTimeField43 = chronology39.millisOfDay();
        org.joda.time.Interval interval44 = new org.joda.time.Interval((-259200000L), (long) '#', chronology39);
        boolean boolean45 = interval22.isBefore((org.joda.time.ReadableInterval) interval44);
        long long46 = interval22.toDurationMillis();
        org.joda.time.DateTime dateTime47 = interval22.getEnd();
        boolean boolean48 = interval2.isBefore((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((-1L), dateTimeZone53);
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.util.Calendar calendar56 = dateTime54.toCalendar(locale55);
        org.joda.time.DateTime dateTime58 = dateTime54.plusMillis((int) '4');
        org.joda.time.LocalDateTime localDateTime59 = dateTime54.toLocalDateTime();
        boolean boolean60 = dateTimeZone50.isLocalDateTimeGap(localDateTime59);
        org.joda.time.DateTime dateTime61 = org.joda.time.DateTime.now(dateTimeZone50);
        java.lang.String str63 = dateTime61.toString("636");
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime61, readableDuration64);
        boolean boolean66 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar8 and calendar13", (gregorianCalendar8.compareTo(calendar13) == 0) == gregorianCalendar8.equals(calendar13));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        java.util.GregorianCalendar gregorianCalendar3 = dateTime2.toGregorianCalendar();
        int int4 = dateTime2.getHourOfDay();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.toLanguageTag();
        java.util.Calendar calendar8 = dateTime2.toCalendar(locale6);
        org.joda.time.DateTime.Property property9 = dateTime2.minuteOfHour();
        org.joda.time.Days days10 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod11 = days10.toMutablePeriod();
        org.joda.time.Duration duration12 = days10.toStandardDuration();
        org.joda.time.Days days13 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod14 = days13.toMutablePeriod();
        org.joda.time.Duration duration15 = days13.toStandardDuration();
        boolean boolean16 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration15);
        org.joda.time.Days days22 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod23 = days22.toMutablePeriod();
        org.joda.time.Duration duration24 = days22.toStandardDuration();
        org.joda.time.PeriodType periodType25 = days22.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((-1L), dateTimeZone28);
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        java.util.Calendar calendar31 = dateTime29.toCalendar(locale30);
        org.joda.time.DateTime dateTime33 = dateTime29.plusMillis((int) '4');
        org.joda.time.Chronology chronology34 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.hourOfHalfday();
        org.joda.time.Period period36 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType25, chronology34);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTimeField dateTimeField38 = chronology34.millisOfDay();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((-259200000L), (long) '#', chronology34);
        boolean boolean40 = interval17.isBefore((org.joda.time.ReadableInterval) interval39);
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType42 = periodType41.withYearsRemoved();
        org.joda.time.Duration duration44 = org.joda.time.Duration.millis((long) (short) -1);
        long long45 = duration44.getStandardMinutes();
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType49 = periodType48.withYearsRemoved();
        org.joda.time.Days days52 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod53 = days52.toMutablePeriod();
        org.joda.time.Duration duration54 = days52.toStandardDuration();
        org.joda.time.PeriodType periodType55 = days52.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((-1L), dateTimeZone58);
        java.util.Locale locale60 = java.util.Locale.KOREAN;
        java.util.Calendar calendar61 = dateTime59.toCalendar(locale60);
        org.joda.time.DateTime dateTime63 = dateTime59.plusMillis((int) '4');
        org.joda.time.Chronology chronology64 = dateTime59.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.hourOfHalfday();
        org.joda.time.Period period66 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType55, chronology64);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(chronology64);
        org.joda.time.DateTimeField dateTimeField68 = chronology64.millisOfDay();
        org.joda.time.Period period69 = new org.joda.time.Period((long) (byte) 1, (long) 1, periodType48, chronology64);
        org.joda.time.Period period70 = duration44.toPeriod(chronology64);
        org.joda.time.DateTimeField dateTimeField71 = chronology64.hourOfDay();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((java.lang.Object) interval17, periodType42, chronology64);
        org.joda.time.DateTimeField dateTimeField73 = chronology64.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField74 = chronology64.halfdayOfDay();
        java.lang.String str75 = chronology64.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar3 and calendar8", (gregorianCalendar3.compareTo(calendar8) == 0) == gregorianCalendar3.equals(calendar8));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((-1L), dateTimeZone3);
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Calendar calendar6 = dateTime4.toCalendar(locale5);
        org.joda.time.DateTime dateTime8 = dateTime4.plusMillis((int) '4');
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.era();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(0L, chronology9);
        org.joda.time.DurationField durationField13 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.year();
        org.joda.time.DurationField durationField15 = chronology9.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField15, and durationField13", !(durationField13.compareTo(durationField15) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField15.compareTo(durationField13))));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod1 = days0.toMutablePeriod();
        org.joda.time.Days days2 = org.joda.time.Days.MIN_VALUE;
        boolean boolean3 = days0.isLessThan(days2);
        org.joda.time.Days days5 = days0.multipliedBy(23);
        org.joda.time.DurationFieldType durationFieldType6 = days5.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((-1L), dateTimeZone9);
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.util.Calendar calendar12 = dateTime10.toCalendar(locale11);
        int int13 = dateTime10.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime10.getZone();
        org.joda.time.TimeOfDay timeOfDay15 = dateTime10.toTimeOfDay();
        int int16 = timeOfDay15.size();
        org.joda.time.Chronology chronology17 = timeOfDay15.getChronology();
        org.joda.time.DurationField durationField18 = durationFieldType6.getField(chronology17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        java.util.GregorianCalendar gregorianCalendar22 = dateTime21.toGregorianCalendar();
        int int23 = dateTime21.getHourOfDay();
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.lang.String str26 = locale25.toLanguageTag();
        java.util.Calendar calendar27 = dateTime21.toCalendar(locale25);
        org.joda.time.DateTime.Property property28 = dateTime21.minuteOfHour();
        org.joda.time.Days days29 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod30 = days29.toMutablePeriod();
        org.joda.time.Duration duration31 = days29.toStandardDuration();
        org.joda.time.Days days32 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod33 = days32.toMutablePeriod();
        org.joda.time.Duration duration34 = days32.toStandardDuration();
        boolean boolean35 = duration31.isLongerThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.Interval interval36 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration34);
        org.joda.time.Days days41 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod42 = days41.toMutablePeriod();
        org.joda.time.Duration duration43 = days41.toStandardDuration();
        org.joda.time.PeriodType periodType44 = days41.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((-1L), dateTimeZone47);
        java.util.Locale locale49 = java.util.Locale.KOREAN;
        java.util.Calendar calendar50 = dateTime48.toCalendar(locale49);
        org.joda.time.DateTime dateTime52 = dateTime48.plusMillis((int) '4');
        org.joda.time.Chronology chronology53 = dateTime48.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.hourOfHalfday();
        org.joda.time.Period period55 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType44, chronology53);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(chronology53);
        org.joda.time.DateTimeField dateTimeField57 = chronology53.millisOfDay();
        org.joda.time.Interval interval58 = new org.joda.time.Interval((-259200000L), (long) '#', chronology53);
        boolean boolean59 = interval36.isBefore((org.joda.time.ReadableInterval) interval58);
        org.joda.time.PeriodType periodType60 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType61 = periodType60.withYearsRemoved();
        org.joda.time.Duration duration63 = org.joda.time.Duration.millis((long) (short) -1);
        long long64 = duration63.getStandardMinutes();
        org.joda.time.PeriodType periodType67 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType68 = periodType67.withYearsRemoved();
        org.joda.time.Days days71 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod72 = days71.toMutablePeriod();
        org.joda.time.Duration duration73 = days71.toStandardDuration();
        org.joda.time.PeriodType periodType74 = days71.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime((-1L), dateTimeZone77);
        java.util.Locale locale79 = java.util.Locale.KOREAN;
        java.util.Calendar calendar80 = dateTime78.toCalendar(locale79);
        org.joda.time.DateTime dateTime82 = dateTime78.plusMillis((int) '4');
        org.joda.time.Chronology chronology83 = dateTime78.getChronology();
        org.joda.time.DateTimeField dateTimeField84 = chronology83.hourOfHalfday();
        org.joda.time.Period period85 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType74, chronology83);
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime(chronology83);
        org.joda.time.DateTimeField dateTimeField87 = chronology83.millisOfDay();
        org.joda.time.Period period88 = new org.joda.time.Period((long) (byte) 1, (long) 1, periodType67, chronology83);
        org.joda.time.Period period89 = duration63.toPeriod(chronology83);
        org.joda.time.DateTimeField dateTimeField90 = chronology83.hourOfDay();
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((java.lang.Object) interval36, periodType61, chronology83);
        org.joda.time.DurationField durationField92 = chronology83.years();
        org.joda.time.DateTimeField dateTimeField93 = chronology83.weekyear();
        org.joda.time.DateTimeField dateTimeField94 = chronology83.dayOfYear();
        org.joda.time.DurationField durationField95 = chronology83.weekyears();
        org.joda.time.DurationField durationField96 = durationFieldType6.getField(chronology83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField92 and durationField95", (durationField92.compareTo(durationField95) == 0) == durationField92.equals(durationField95));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.hourOfHalfday();
        org.joda.time.Hours hours10 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours11 = hours10.negated();
        org.joda.time.DurationFieldType durationFieldType12 = hours11.getFieldType();
        org.joda.time.Hours hours14 = hours11.multipliedBy((int) 'a');
        int[] intArray17 = chronology8.get((org.joda.time.ReadablePeriod) hours11, (long) (short) 1, (long) 4);
        long long21 = chronology8.add((long) 999, (-1104537599997L), 53);
        org.joda.time.DateTimeField dateTimeField22 = chronology8.monthOfYear();
        org.joda.time.DurationField durationField23 = chronology8.centuries();
        org.joda.time.DurationField durationField24 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField25 = chronology8.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((-1L), dateTimeZone29);
        java.util.Locale locale31 = java.util.Locale.KOREAN;
        java.util.Calendar calendar32 = dateTime30.toCalendar(locale31);
        org.joda.time.DateTime dateTime34 = dateTime30.plusMillis((int) '4');
        org.joda.time.Chronology chronology35 = dateTime30.getChronology();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '4', chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology35);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((-1L), dateTimeZone42);
        org.joda.time.Interval interval44 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone42);
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime37.toMutableDateTime(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((-1L), dateTimeZone49);
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.util.Calendar calendar52 = dateTime50.toCalendar(locale51);
        org.joda.time.DateTime dateTime54 = dateTime50.plusMillis((int) '4');
        org.joda.time.DateTime dateTime55 = dateTime50.toDateTimeISO();
        org.joda.time.Instant instant56 = dateTime50.toInstant();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((-1L), dateTimeZone59);
        java.util.Locale locale61 = java.util.Locale.KOREAN;
        java.util.Calendar calendar62 = dateTime60.toCalendar(locale61);
        org.joda.time.DateTime dateTime64 = dateTime60.plusMillis((int) '4');
        org.joda.time.DateTime dateTime65 = dateTime60.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime68 = org.joda.time.DateTime.now(dateTimeZone67);
        boolean boolean70 = dateTime68.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes71 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime60, (org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.Duration duration72 = minutes71.toStandardDuration();
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableDuration) duration72);
        java.util.TimeZone timeZone74 = null;
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forTimeZone(timeZone74);
        java.lang.String str76 = dateTimeZone75.toString();
        org.joda.time.DateTime dateTime77 = dateTime50.toDateTime(dateTimeZone75);
        org.joda.time.Period period78 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Period period80 = period78.minusSeconds(50);
        long long83 = chronology8.add((org.joda.time.ReadablePeriod) period78, 1638169847652L, 270);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime77", (dateTime3.compareTo(dateTime77) == 0) == dateTime3.equals(dateTime77));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime3.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        java.util.GregorianCalendar gregorianCalendar12 = dateTime11.toGregorianCalendar();
        int int13 = dateTime11.getHourOfDay();
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale15.toLanguageTag();
        java.util.Calendar calendar17 = dateTime11.toCalendar(locale15);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime20 = property18.addToCopy(10);
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.util.Locale locale22 = locale21.stripExtensions();
        java.lang.String str23 = locale21.getISO3Language();
        java.lang.String str24 = locale21.getDisplayScript();
        java.lang.String str25 = property18.getAsShortText(locale21);
        java.lang.String str26 = dateTimeZone6.getName(10L, locale21);
        org.joda.time.DateTime dateTime27 = dateTime3.toDateTime(dateTimeZone6);
        boolean boolean29 = dateTime3.isBefore(59L);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime3.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(348);
        java.lang.String str33 = dateTimeZone32.getID();
        long long35 = dateTimeZone32.previousTransition((long) (-292275054));
        org.joda.time.DateTime dateTime36 = dateTime3.toDateTime(dateTimeZone32);
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType43 = periodType42.withMinutesRemoved();
        org.joda.time.Period period44 = new org.joda.time.Period((long) (byte) 10, periodType43);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((-1L), dateTimeZone49);
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.util.Calendar calendar52 = dateTime50.toCalendar(locale51);
        org.joda.time.DateTime dateTime54 = dateTime50.plusMillis((int) '4');
        org.joda.time.Chronology chronology55 = dateTime50.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.hourOfHalfday();
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) (short) 1, (long) 86399, chronology55);
        org.joda.time.Seconds seconds58 = org.joda.time.Seconds.ONE;
        org.joda.time.Seconds seconds59 = org.joda.time.Seconds.ONE;
        org.joda.time.Seconds seconds60 = seconds58.minus(seconds59);
        org.joda.time.Duration duration61 = seconds58.toStandardDuration();
        int[] intArray64 = chronology55.get((org.joda.time.ReadablePeriod) seconds58, 652278993L, (long) (-1));
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod(1L, periodType43, chronology55);
        org.joda.time.DurationField durationField66 = chronology55.centuries();
        org.joda.time.DurationField durationField67 = chronology55.years();
        org.joda.time.Period period68 = new org.joda.time.Period((long) 360, (long) 207, chronology55);
        org.joda.time.Period period69 = new org.joda.time.Period((long) 2022, chronology55);
        org.joda.time.DateTimeField dateTimeField70 = chronology55.halfdayOfDay();
        org.joda.time.DurationField durationField71 = chronology55.seconds();
        org.joda.time.DateTimeField dateTimeField72 = chronology55.dayOfWeek();
        org.joda.time.DateTime dateTime73 = dateTime3.withChronology(chronology55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime36", (mutableDateTime4.compareTo(dateTime36) == 0) == mutableDateTime4.equals(dateTime36));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (short) 0);
        mutablePeriod1.addMillis(34);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((-1L), dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone6.isLocalDateTimeGap(localDateTime8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime12 = dateTime10.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((-1L), dateTimeZone15);
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Calendar calendar18 = dateTime16.toCalendar(locale17);
        org.joda.time.DateTime dateTime20 = dateTime16.plusMillis((int) '4');
        org.joda.time.DateTime dateTime21 = dateTime16.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        boolean boolean26 = dateTime24.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Duration duration28 = minutes27.toStandardDuration();
        org.joda.time.Duration duration29 = minutes27.toStandardDuration();
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableDuration) duration29);
        org.joda.time.Duration duration31 = duration29.toDuration();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((-1L), dateTimeZone34);
        java.util.Locale locale36 = java.util.Locale.KOREAN;
        java.util.Calendar calendar37 = dateTime35.toCalendar(locale36);
        org.joda.time.DateTime dateTime39 = dateTime35.plusMillis((int) '4');
        org.joda.time.DateTime dateTime40 = dateTime35.toDateTimeISO();
        org.joda.time.Instant instant41 = dateTime35.toInstant();
        org.joda.time.Instant instant42 = instant41.toInstant();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((-1L), dateTimeZone45);
        org.joda.time.LocalDateTime localDateTime47 = null;
        boolean boolean48 = dateTimeZone45.isLocalDateTimeGap(localDateTime47);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(dateTimeZone45);
        org.joda.time.DateTime dateTime51 = dateTime49.withHourOfDay(0);
        boolean boolean52 = instant42.isEqual((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Duration duration54 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Instant instant56 = instant42.withDurationAdded((org.joda.time.ReadableDuration) duration54, (-1));
        boolean boolean58 = instant56.isBefore((long) (short) 10);
        org.joda.time.Chronology chronology59 = instant56.getChronology();
        mutablePeriod1.setPeriod((org.joda.time.ReadableDuration) duration31, chronology59);
        org.joda.time.DurationField durationField61 = chronology59.eras();
        org.joda.time.DurationField durationField62 = chronology59.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField61, durationField62, and durationField61", !(durationField61.compareTo(durationField62) == 0) || (Math.signum(durationField61.compareTo(durationField61)) == Math.signum(durationField62.compareTo(durationField61))));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        java.util.GregorianCalendar gregorianCalendar3 = dateTime2.toGregorianCalendar();
        int int4 = dateTime2.getHourOfDay();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.toLanguageTag();
        java.util.Calendar calendar8 = dateTime2.toCalendar(locale6);
        org.joda.time.DateTime.Property property9 = dateTime2.minuteOfHour();
        org.joda.time.Days days10 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod11 = days10.toMutablePeriod();
        org.joda.time.Duration duration12 = days10.toStandardDuration();
        org.joda.time.Days days13 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod14 = days13.toMutablePeriod();
        org.joda.time.Duration duration15 = days13.toStandardDuration();
        boolean boolean16 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration15);
        org.joda.time.Days days22 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod23 = days22.toMutablePeriod();
        org.joda.time.Duration duration24 = days22.toStandardDuration();
        org.joda.time.PeriodType periodType25 = days22.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((-1L), dateTimeZone28);
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        java.util.Calendar calendar31 = dateTime29.toCalendar(locale30);
        org.joda.time.DateTime dateTime33 = dateTime29.plusMillis((int) '4');
        org.joda.time.Chronology chronology34 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.hourOfHalfday();
        org.joda.time.Period period36 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType25, chronology34);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTimeField dateTimeField38 = chronology34.millisOfDay();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((-259200000L), (long) '#', chronology34);
        boolean boolean40 = interval17.isBefore((org.joda.time.ReadableInterval) interval39);
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType42 = periodType41.withYearsRemoved();
        org.joda.time.Duration duration44 = org.joda.time.Duration.millis((long) (short) -1);
        long long45 = duration44.getStandardMinutes();
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType49 = periodType48.withYearsRemoved();
        org.joda.time.Days days52 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod53 = days52.toMutablePeriod();
        org.joda.time.Duration duration54 = days52.toStandardDuration();
        org.joda.time.PeriodType periodType55 = days52.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((-1L), dateTimeZone58);
        java.util.Locale locale60 = java.util.Locale.KOREAN;
        java.util.Calendar calendar61 = dateTime59.toCalendar(locale60);
        org.joda.time.DateTime dateTime63 = dateTime59.plusMillis((int) '4');
        org.joda.time.Chronology chronology64 = dateTime59.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.hourOfHalfday();
        org.joda.time.Period period66 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType55, chronology64);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(chronology64);
        org.joda.time.DateTimeField dateTimeField68 = chronology64.millisOfDay();
        org.joda.time.Period period69 = new org.joda.time.Period((long) (byte) 1, (long) 1, periodType48, chronology64);
        org.joda.time.Period period70 = duration44.toPeriod(chronology64);
        org.joda.time.DateTimeField dateTimeField71 = chronology64.hourOfDay();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((java.lang.Object) interval17, periodType42, chronology64);
        org.joda.time.DurationField durationField73 = chronology64.years();
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean76 = dateTimeZone75.isFixed();
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime(dateTimeZone75);
        java.lang.String str78 = dateTimeZone75.getID();
        org.joda.time.Chronology chronology79 = chronology64.withZone(dateTimeZone75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime77", (dateTime2.compareTo(dateTime77) == 0) == dateTime2.equals(dateTime77));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime3.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        java.util.GregorianCalendar gregorianCalendar12 = dateTime11.toGregorianCalendar();
        int int13 = dateTime11.getHourOfDay();
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale15.toLanguageTag();
        java.util.Calendar calendar17 = dateTime11.toCalendar(locale15);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime20 = property18.addToCopy(10);
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.util.Locale locale22 = locale21.stripExtensions();
        java.lang.String str23 = locale21.getISO3Language();
        java.lang.String str24 = locale21.getDisplayScript();
        java.lang.String str25 = property18.getAsShortText(locale21);
        java.lang.String str26 = dateTimeZone6.getName(10L, locale21);
        org.joda.time.DateTime dateTime27 = dateTime3.toDateTime(dateTimeZone6);
        boolean boolean29 = dateTime3.isBefore(59L);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime3.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(348);
        java.lang.String str33 = dateTimeZone32.getID();
        long long35 = dateTimeZone32.previousTransition((long) (-292275054));
        org.joda.time.DateTime dateTime36 = dateTime3.toDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((-1L), dateTimeZone39);
        java.util.Locale locale41 = java.util.Locale.KOREAN;
        java.util.Calendar calendar42 = dateTime40.toCalendar(locale41);
        org.joda.time.Instant instant43 = dateTime40.toInstant();
        org.joda.time.Instant instant44 = instant43.toInstant();
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardMinutes((long) 3);
        org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant43, (org.joda.time.ReadableDuration) duration46);
        org.joda.time.Duration duration48 = duration46.toDuration();
        org.joda.time.DateTime dateTime49 = dateTime3.plus((org.joda.time.ReadableDuration) duration46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime36", (mutableDateTime4.compareTo(dateTime36) == 0) == mutableDateTime4.equals(dateTime36));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        org.joda.time.Interval interval3 = interval2.toInterval();
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Days days5 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod6 = days5.toMutablePeriod();
        org.joda.time.Duration duration7 = days5.toStandardDuration();
        long long8 = duration7.getStandardHours();
        mutableInterval4.setDurationAfterStart((org.joda.time.ReadableDuration) duration7);
        org.joda.time.Days days14 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod15 = days14.toMutablePeriod();
        org.joda.time.Duration duration16 = days14.toStandardDuration();
        org.joda.time.PeriodType periodType17 = days14.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((-1L), dateTimeZone20);
        java.util.Locale locale22 = java.util.Locale.KOREAN;
        java.util.Calendar calendar23 = dateTime21.toCalendar(locale22);
        org.joda.time.DateTime dateTime25 = dateTime21.plusMillis((int) '4');
        org.joda.time.Chronology chronology26 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.hourOfHalfday();
        org.joda.time.Period period28 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType17, chronology26);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTimeField dateTimeField30 = chronology26.millisOfDay();
        org.joda.time.Interval interval31 = new org.joda.time.Interval((-259200000L), (long) '#', chronology26);
        mutableInterval4.setChronology(chronology26);
        org.joda.time.DurationField durationField33 = chronology26.weekyears();
        org.joda.time.DurationField durationField34 = chronology26.eras();
        org.joda.time.DateTimeField dateTimeField35 = chronology26.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField33 and durationField34", Math.signum(durationField33.compareTo(durationField34)) == -Math.signum(durationField34.compareTo(durationField33)));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod1 = days0.toMutablePeriod();
        mutablePeriod1.setSeconds((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval4 = null;
        mutablePeriod1.add(readableInterval4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.eras();
        int int7 = mutablePeriod1.get(durationFieldType6);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((-1L), dateTimeZone13);
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Calendar calendar16 = dateTime14.toCalendar(locale15);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMillis((int) '4');
        org.joda.time.Chronology chronology19 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.hourOfHalfday();
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) 1, (long) 86399, chronology19);
        mutablePeriod1.setPeriod((long) (-1), chronology19);
        org.joda.time.MutablePeriod mutablePeriod23 = mutablePeriod1.copy();
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.weeks();
        org.joda.time.Days days25 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod26 = days25.toMutablePeriod();
        org.joda.time.Days days27 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod28 = days27.toMutablePeriod();
        mutablePeriod28.setSeconds((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval31 = null;
        mutablePeriod28.add(readableInterval31);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.eras();
        int int34 = mutablePeriod28.get(durationFieldType33);
        boolean boolean35 = mutablePeriod26.isSupported(durationFieldType33);
        boolean boolean36 = periodType24.isSupported(durationFieldType33);
        int int37 = mutablePeriod23.get(durationFieldType33);
        mutablePeriod23.addMillis(53);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((-1L), dateTimeZone44);
        java.util.Locale locale46 = java.util.Locale.KOREAN;
        java.util.Calendar calendar47 = dateTime45.toCalendar(locale46);
        org.joda.time.DateTime dateTime49 = dateTime45.plusMillis((int) '4');
        org.joda.time.Chronology chronology50 = dateTime45.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField52 = chronology50.era();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(0L, chronology50);
        org.joda.time.DurationField durationField54 = chronology50.eras();
        org.joda.time.DateTimeField dateTimeField55 = chronology50.year();
        mutablePeriod23.setPeriod((long) (short) 10, chronology50);
        org.joda.time.Chronology chronology57 = chronology50.withUTC();
        org.joda.time.DurationField durationField58 = chronology57.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField54, durationField58, and durationField54", !(durationField54.compareTo(durationField58) == 0) || (Math.signum(durationField54.compareTo(durationField54)) == Math.signum(durationField58.compareTo(durationField54))));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.Instant instant9 = dateTime3.toInstant();
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((-1L), dateTimeZone13);
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Calendar calendar16 = dateTime14.toCalendar(locale15);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMillis((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime14.toDateTimeISO();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType21 = periodType20.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant9, (org.joda.time.ReadableInstant) dateTime19, periodType20);
        org.joda.time.Instant instant25 = instant9.withDurationAdded(10L, (int) (byte) -1);
        org.joda.time.DateTime dateTime26 = instant9.toDateTimeISO();
        org.joda.time.Duration duration28 = org.joda.time.Duration.millis((long) (short) -1);
        long long29 = duration28.getStandardMinutes();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((-1L), dateTimeZone32);
        java.util.Locale locale34 = java.util.Locale.KOREAN;
        java.util.Calendar calendar35 = dateTime33.toCalendar(locale34);
        org.joda.time.DateTime dateTime37 = dateTime33.plusMillis((int) '4');
        org.joda.time.DateTime dateTime38 = dateTime33.toDateTimeISO();
        org.joda.time.Instant instant39 = dateTime33.toInstant();
        org.joda.time.Instant instant40 = instant39.toInstant();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((-1L), dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime45 = null;
        boolean boolean46 = dateTimeZone43.isLocalDateTimeGap(localDateTime45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime49 = dateTime47.withHourOfDay(0);
        boolean boolean50 = instant40.isEqual((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Duration duration52 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Instant instant54 = instant40.withDurationAdded((org.joda.time.ReadableDuration) duration52, (-1));
        boolean boolean56 = instant54.isBefore((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((-1L), dateTimeZone59);
        java.util.Locale locale61 = java.util.Locale.KOREAN;
        java.util.Calendar calendar62 = dateTime60.toCalendar(locale61);
        org.joda.time.DateTime dateTime64 = dateTime60.plusMillis((int) '4');
        org.joda.time.DateTime dateTime65 = dateTime60.toDateTimeISO();
        org.joda.time.Instant instant66 = dateTime60.toInstant();
        org.joda.time.PeriodType periodType67 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant54, (org.joda.time.ReadableInstant) dateTime60, periodType67);
        org.joda.time.Period period69 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration28, (org.joda.time.ReadableInstant) dateTime60);
        long long70 = duration28.getStandardHours();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((-1L), dateTimeZone73);
        org.joda.time.LocalDateTime localDateTime75 = null;
        boolean boolean76 = dateTimeZone73.isLocalDateTimeGap(localDateTime75);
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime(dateTimeZone73);
        org.joda.time.DateTime dateTime79 = dateTime77.withHourOfDay(0);
        int int80 = dateTime79.getDayOfWeek();
        org.joda.time.DateTime dateTime82 = dateTime79.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime84 = dateTime82.minusWeeks((int) (byte) 0);
        org.joda.time.Period period85 = duration28.toPeriodTo((org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.Instant instant86 = instant9.minus((org.joda.time.ReadableDuration) duration28);
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DurationFieldType durationFieldType88 = dateTimeFieldType87.getRangeDurationType();
        boolean boolean89 = instant86.isSupported(dateTimeFieldType87);
        long long90 = instant86.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime26", (dateTime3.compareTo(dateTime26) == 0) == dateTime3.equals(dateTime26));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod1 = days0.toMutablePeriod();
        mutablePeriod1.setSeconds((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval4 = null;
        mutablePeriod1.add(readableInterval4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.eras();
        int int7 = mutablePeriod1.get(durationFieldType6);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((-1L), dateTimeZone13);
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Calendar calendar16 = dateTime14.toCalendar(locale15);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMillis((int) '4');
        org.joda.time.Chronology chronology19 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.hourOfHalfday();
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) (short) 1, (long) 86399, chronology19);
        mutablePeriod1.setPeriod((long) (-1), chronology19);
        org.joda.time.MutablePeriod mutablePeriod23 = mutablePeriod1.copy();
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.weeks();
        org.joda.time.Days days25 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod26 = days25.toMutablePeriod();
        org.joda.time.Days days27 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod28 = days27.toMutablePeriod();
        mutablePeriod28.setSeconds((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval31 = null;
        mutablePeriod28.add(readableInterval31);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.eras();
        int int34 = mutablePeriod28.get(durationFieldType33);
        boolean boolean35 = mutablePeriod26.isSupported(durationFieldType33);
        boolean boolean36 = periodType24.isSupported(durationFieldType33);
        int int37 = mutablePeriod23.get(durationFieldType33);
        mutablePeriod23.addMillis(53);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((-1L), dateTimeZone44);
        java.util.Locale locale46 = java.util.Locale.KOREAN;
        java.util.Calendar calendar47 = dateTime45.toCalendar(locale46);
        org.joda.time.DateTime dateTime49 = dateTime45.plusMillis((int) '4');
        org.joda.time.Chronology chronology50 = dateTime45.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField52 = chronology50.era();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(0L, chronology50);
        org.joda.time.DurationField durationField54 = chronology50.eras();
        org.joda.time.DateTimeField dateTimeField55 = chronology50.year();
        mutablePeriod23.setPeriod((long) (short) 10, chronology50);
        org.joda.time.Chronology chronology57 = chronology50.withUTC();
        org.joda.time.DurationField durationField58 = chronology57.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField54, durationField58, and durationField54", !(durationField54.compareTo(durationField58) == 0) || (Math.signum(durationField54.compareTo(durationField54)) == Math.signum(durationField58.compareTo(durationField54))));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.joda.time.Period period8 = new org.joda.time.Period(0, 2022, (-485), 138, 0, 0, 0, 135);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        boolean boolean13 = dateTimeZone10.isStandardOffset((long) (byte) 100);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime14.toDateTime(dateTimeZone17);
        org.joda.time.Duration duration19 = period8.toDurationFrom((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Period period21 = period8.plusMinutes(96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime18", (dateTime11.compareTo(dateTime18) == 0) == dateTime11.equals(dateTime18));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((java.lang.Object) 89424000000L);
        org.joda.time.Period period2 = duration1.toPeriod();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((-1L), dateTimeZone5);
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.util.Calendar calendar8 = dateTime6.toCalendar(locale7);
        org.joda.time.DateTime dateTime10 = dateTime6.plusMillis((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime6.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(6, 7);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime6.toMutableDateTime(dateTimeZone14);
        org.joda.time.Interval interval16 = duration1.toIntervalFrom((org.joda.time.ReadableInstant) dateTime6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and mutableDateTime15", (dateTime6.compareTo(mutableDateTime15) == 0) == dateTime6.equals(mutableDateTime15));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.Instant instant9 = dateTime3.toInstant();
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((-1L), dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone13.isLocalDateTimeGap(localDateTime15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime19 = dateTime17.withHourOfDay(0);
        boolean boolean20 = instant10.isEqual((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Duration duration22 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Instant instant24 = instant10.withDurationAdded((org.joda.time.ReadableDuration) duration22, (-1));
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((-1L), dateTimeZone27);
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.util.Calendar calendar30 = dateTime28.toCalendar(locale29);
        org.joda.time.DateTime dateTime32 = dateTime28.plusMillis((int) '4');
        org.joda.time.DateTime dateTime33 = dateTime28.toDateTimeISO();
        org.joda.time.DateTime dateTime35 = dateTime33.plusMillis((int) '#');
        int int36 = instant24.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Duration duration38 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((-1L), dateTimeZone41);
        java.util.Locale locale43 = java.util.Locale.KOREAN;
        java.util.Calendar calendar44 = dateTime42.toCalendar(locale43);
        org.joda.time.DateTime dateTime46 = dateTime42.plusMillis((int) '4');
        org.joda.time.DateTime dateTime47 = dateTime42.toDateTimeISO();
        org.joda.time.DateTime.Property property48 = dateTime42.weekyear();
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration38, (org.joda.time.ReadableInstant) dateTime42, periodType49);
        int int51 = dateTime42.getSecondOfDay();
        boolean boolean52 = dateTime33.isBefore((org.joda.time.ReadableInstant) dateTime42);
        int int53 = dateTime33.getEra();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(348);
        int int57 = dateTimeZone55.getOffset((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime33.toMutableDateTime(dateTimeZone55);
        org.joda.time.DateTime dateTime59 = dateTime33.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime58", (dateTime3.compareTo(mutableDateTime58) == 0) == dateTime3.equals(mutableDateTime58));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        int int4 = dateTime3.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        boolean boolean8 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.LocalDate localDate9 = dateTime3.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(6, 0);
        org.joda.time.DateTime dateTime13 = dateTime3.withZoneRetainFields(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(679);
        long long17 = dateTimeZone12.getMillisKeepLocal(dateTimeZone15, 1645513740L);
        java.lang.String str19 = dateTimeZone12.getShortName(63072000144L);
        long long23 = dateTimeZone12.convertLocalToUTC((long) 503, true, (long) 216);
        java.lang.String str25 = dateTimeZone12.getName(1646032391128L);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone12);
        java.lang.String str27 = dateTimeZone12.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime26", (dateTime7.compareTo(dateTime26) == 0) == dateTime7.equals(dateTime26));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        int int6 = dateTime3.getSecondOfMinute();
        org.joda.time.DateTime.Property property7 = dateTime3.hourOfDay();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property7.getAsText(locale9);
        org.joda.time.DateTime dateTime12 = property7.addToCopy(6);
        org.joda.time.DateTime dateTime13 = property7.withMaximumValue();
        java.util.GregorianCalendar gregorianCalendar14 = dateTime13.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((-1L), dateTimeZone17);
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.util.Calendar calendar20 = dateTime18.toCalendar(locale19);
        org.joda.time.DateTime dateTime22 = dateTime18.plusMillis((int) '4');
        org.joda.time.DateTime dateTime23 = dateTime18.toDateTimeISO();
        org.joda.time.DateTime dateTime25 = dateTime23.plusMillis((int) '#');
        int int26 = dateTime25.getMillisOfSecond();
        org.joda.time.DateTime dateTime27 = dateTime25.toDateTimeISO();
        boolean boolean28 = dateTime13.isEqual((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime30 = dateTime27.minusSeconds(70);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((-1L), dateTimeZone33);
        int int35 = dateTime34.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        boolean boolean39 = dateTime34.isEqual((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalDate localDate40 = dateTime34.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(6, 0);
        org.joda.time.DateTime dateTime44 = dateTime34.withZoneRetainFields(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(679);
        long long48 = dateTimeZone43.getMillisKeepLocal(dateTimeZone46, 1645513740L);
        org.joda.time.DateTime dateTime49 = dateTime27.toDateTime(dateTimeZone46);
        long long50 = dateTime27.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime49", (dateTime27.compareTo(dateTime49) == 0) == dateTime27.equals(dateTime49));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.Instant instant9 = dateTime3.toInstant();
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((-1L), dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone13.isLocalDateTimeGap(localDateTime15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime19 = dateTime17.withHourOfDay(0);
        boolean boolean20 = instant10.isEqual((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime22 = dateTime19.plusHours(99);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((-6380815651199988L));
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(679);
        org.joda.time.DateTime dateTime27 = dateTime24.withZone(dateTimeZone26);
        org.joda.time.DateTime.Property property28 = dateTime27.yearOfEra();
        org.joda.time.Hours hours29 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Duration duration30 = hours29.toStandardDuration();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime27", (dateTime24.compareTo(dateTime27) == 0) == dateTime24.equals(dateTime27));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime8 = dateTime6.withHourOfDay(0);
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.Days days10 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod11 = days10.toMutablePeriod();
        org.joda.time.Duration duration12 = days10.toStandardDuration();
        long long13 = duration12.getStandardHours();
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType15 = periodType14.withYearsRemoved();
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableDuration) duration12, periodType15);
        org.joda.time.DateTime dateTime18 = dateTime8.withWeekyear((int) '#');
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((-1L), dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone21.isLocalDateTimeGap(localDateTime23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime27 = dateTime25.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime27.toMutableDateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = dateTime8.withZoneRetainFields(dateTimeZone28);
        org.joda.time.Duration duration33 = new org.joda.time.Duration(0L, (long) 848);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval();
        long long37 = mutableInterval36.toDurationMillis();
        org.joda.time.Days days42 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod43 = days42.toMutablePeriod();
        org.joda.time.Duration duration44 = days42.toStandardDuration();
        org.joda.time.PeriodType periodType45 = days42.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((-1L), dateTimeZone48);
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.util.Calendar calendar51 = dateTime49.toCalendar(locale50);
        org.joda.time.DateTime dateTime53 = dateTime49.plusMillis((int) '4');
        org.joda.time.Chronology chronology54 = dateTime49.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.hourOfHalfday();
        org.joda.time.Period period56 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType45, chronology54);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(chronology54);
        org.joda.time.DateTimeField dateTimeField58 = chronology54.millisOfDay();
        org.joda.time.Interval interval59 = new org.joda.time.Interval((-259200000L), (long) '#', chronology54);
        mutableInterval36.setChronology(chronology54);
        org.joda.time.DurationField durationField61 = chronology54.eras();
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(71L, chronology54);
        mutableInterval34.setChronology(chronology54);
        org.joda.time.DurationField durationField64 = chronology54.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField61, durationField64, and durationField61", !(durationField61.compareTo(durationField64) == 0) || (Math.signum(durationField61.compareTo(durationField61)) == Math.signum(durationField64.compareTo(durationField61))));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime8 = dateTime6.withHourOfDay(0);
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime dateTime11 = dateTime8.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime8.millisOfSecond();
        org.joda.time.DateTime dateTime13 = property12.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((-1L), dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMonths(100);
        org.joda.time.Days days22 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod23 = days22.toMutablePeriod();
        org.joda.time.Duration duration24 = days22.toStandardDuration();
        org.joda.time.PeriodType periodType25 = days22.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((-1L), dateTimeZone28);
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        java.util.Calendar calendar31 = dateTime29.toCalendar(locale30);
        org.joda.time.DateTime dateTime33 = dateTime29.plusMillis((int) '4');
        org.joda.time.Chronology chronology34 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.hourOfHalfday();
        org.joda.time.Period period36 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType25, chronology34);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTimeField dateTimeField38 = chronology34.millisOfDay();
        boolean boolean40 = dateTimeField38.isLeap((long) 1439);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((-1L), dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime45 = null;
        boolean boolean46 = dateTimeZone43.isLocalDateTimeGap(localDateTime45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime49 = dateTime47.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime49.toMutableDateTime(dateTimeZone50);
        org.joda.time.LocalDate localDate52 = dateTime49.toLocalDate();
        int int53 = dateTimeField38.getMaximumValue((org.joda.time.ReadablePartial) localDate52);
        org.joda.time.DateTime dateTime54 = dateTime19.withFields((org.joda.time.ReadablePartial) localDate52);
        org.joda.time.Interval interval55 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime dateTime56 = dateTime54.toDateTime();
        int int57 = dateTime56.getDayOfYear();
        boolean boolean59 = dateTime56.isAfter((long) 26004);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean62 = dateTimeZone61.isFixed();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(dateTimeZone61);
        java.lang.String str65 = dateTimeZone61.getName(601L);
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime56.toMutableDateTime(dateTimeZone61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime63", (dateTime6.compareTo(dateTime63) == 0) == dateTime6.equals(dateTime63));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(457087L);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-1L), dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone4.isLocalDateTimeGap(localDateTime6);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone4);
        org.joda.time.DateTime dateTime10 = dateTime8.withHourOfDay(0);
        int int11 = dateTime8.getDayOfWeek();
        int int12 = dateTime8.getDayOfWeek();
        boolean boolean14 = dateTime8.isEqual((long) 503);
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) instant1, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusDays((int) (short) -1);
        int int23 = instant17.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutableDateTime mutableDateTime24 = instant17.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(8, (int) '#');
        org.joda.time.DateTime dateTime28 = instant17.toDateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = dateTime8.toDateTime(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime28", (dateTime5.compareTo(dateTime28) == 0) == dateTime5.equals(dateTime28));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) 2, (long) 23);
        org.joda.time.Interval interval3 = mutableInterval2.toInterval();
        org.joda.time.Days days4 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod5 = days4.toMutablePeriod();
        mutablePeriod5.setSeconds((int) (byte) 0);
        mutableInterval2.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) mutablePeriod5);
        mutablePeriod5.setPeriod((long) 100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = mutablePeriod5.getFieldTypes();
        mutablePeriod5.addSeconds(577);
        mutablePeriod5.setWeeks((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((-1L), dateTimeZone18);
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.util.Calendar calendar21 = dateTime19.toCalendar(locale20);
        org.joda.time.DateTime dateTime23 = dateTime19.plusMillis((int) '4');
        org.joda.time.Chronology chronology24 = dateTime19.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.minutes();
        org.joda.time.DurationField durationField26 = chronology24.eras();
        org.joda.time.DurationFieldType durationFieldType27 = durationField26.getType();
        int int28 = mutablePeriod5.get(durationFieldType27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField25 and durationField26", Math.signum(durationField25.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField25)));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((-1L), dateTimeZone3);
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Calendar calendar6 = dateTime4.toCalendar(locale5);
        org.joda.time.DateTime dateTime8 = dateTime4.plusMillis((int) '4');
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.era();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(0L, chronology9);
        org.joda.time.DurationField durationField13 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.minuteOfHour();
        org.joda.time.DurationField durationField16 = dateTimeField15.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField16, and durationField13", !(durationField13.compareTo(durationField16) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField16.compareTo(durationField13))));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.joda.time.MutableInterval mutableInterval0 = new org.joda.time.MutableInterval();
        org.joda.time.DateTime dateTime1 = mutableInterval0.getEnd();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone3);
        java.util.GregorianCalendar gregorianCalendar5 = dateTime4.toGregorianCalendar();
        int int6 = dateTime4.getHourOfDay();
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale8.toLanguageTag();
        java.util.Calendar calendar10 = dateTime4.toCalendar(locale8);
        org.joda.time.DateTime.Property property11 = dateTime4.minuteOfHour();
        org.joda.time.Days days12 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod13 = days12.toMutablePeriod();
        org.joda.time.Duration duration14 = days12.toStandardDuration();
        org.joda.time.Days days15 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod16 = days15.toMutablePeriod();
        org.joda.time.Duration duration17 = days15.toStandardDuration();
        boolean boolean18 = duration14.isLongerThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration17);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardMinutes((long) (byte) -1);
        org.joda.time.Duration duration22 = duration17.plus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((-1L), dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone25.isLocalDateTimeGap(localDateTime27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime31 = dateTime29.withHourOfDay(0);
        int int32 = dateTime31.getDayOfWeek();
        org.joda.time.Days days33 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod34 = days33.toMutablePeriod();
        org.joda.time.Duration duration35 = days33.toStandardDuration();
        long long36 = duration35.getStandardHours();
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType38 = periodType37.withYearsRemoved();
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableDuration) duration35, periodType38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int41 = dateTime31.get(dateTimeFieldType40);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, (org.joda.time.ReadableInstant) dateTime31);
        mutablePeriod42.setWeeks(348);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType46 = dateTimeFieldType45.getRangeDurationType();
        mutablePeriod42.set(durationFieldType46, 27424811);
        org.joda.time.DateTime dateTime50 = dateTime1.withFieldAdded(durationFieldType46, 2870);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar5 and calendar10", (gregorianCalendar5.compareTo(calendar10) == 0) == gregorianCalendar5.equals(calendar10));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        java.util.GregorianCalendar gregorianCalendar3 = dateTime2.toGregorianCalendar();
        int int4 = dateTime2.getHourOfDay();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.toLanguageTag();
        java.util.Calendar calendar8 = dateTime2.toCalendar(locale6);
        org.joda.time.DateTime.Property property9 = dateTime2.minuteOfHour();
        boolean boolean10 = property9.isLeap();
        org.joda.time.DateTime dateTime11 = property9.roundCeilingCopy();
        org.joda.time.DurationField durationField12 = property9.getLeapDurationField();
        org.joda.time.DateTime dateTime13 = property9.roundFloorCopy();
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((-100));
        int int16 = dateTime15.getWeekyear();
        org.joda.time.DateTime dateTime18 = dateTime15.plusYears(948);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMillis(59);
        org.joda.time.DateTime dateTime22 = dateTime18.withCenturyOfEra(845);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar3 and calendar8", (gregorianCalendar3.compareTo(calendar8) == 0) == gregorianCalendar3.equals(calendar8));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        boolean boolean4 = dateTime2.isAfter((long) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime2.millisOfSecond();
        java.lang.String str6 = property5.getName();
        org.joda.time.DateTime dateTime8 = property5.addWrapFieldToCopy((-59));
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((-1L), dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone12.isLocalDateTimeGap(localDateTime14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime18 = dateTime16.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime18.toMutableDateTime(dateTimeZone19);
        org.joda.time.LocalDate localDate21 = dateTime18.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        java.util.GregorianCalendar gregorianCalendar25 = dateTime24.toGregorianCalendar();
        int int26 = dateTime24.getHourOfDay();
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.util.Locale locale28 = locale27.stripExtensions();
        java.lang.String str29 = locale28.toLanguageTag();
        java.util.Calendar calendar30 = dateTime24.toCalendar(locale28);
        org.joda.time.DateTime.Property property31 = dateTime24.minuteOfHour();
        boolean boolean32 = property31.isLeap();
        org.joda.time.DateTime dateTime33 = property31.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((-1L), dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = dateTimeZone36.isLocalDateTimeGap(localDateTime38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime42 = dateTime40.withHourOfDay(0);
        int int43 = dateTime42.getDayOfWeek();
        org.joda.time.DateTime dateTime45 = dateTime42.minusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((-1L), dateTimeZone48);
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.util.Calendar calendar51 = dateTime49.toCalendar(locale50);
        org.joda.time.DateTime dateTime53 = dateTime49.plusMillis((int) '4');
        org.joda.time.Instant instant54 = dateTime53.toInstant();
        org.joda.time.Hours hours55 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) instant54);
        org.joda.time.DateTime dateTime57 = dateTime45.plusMillis((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight58 = dateTime57.toDateMidnight();
        int int59 = property31.compareTo((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime dateTime61 = dateTime57.withYearOfCentury(3);
        org.joda.time.DateTime dateTime63 = dateTime61.plusMonths(0);
        org.joda.time.DateTime dateTime65 = dateTime61.minusYears(4);
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.Duration duration69 = org.joda.time.Duration.standardHours(3L);
        org.joda.time.DateTime dateTime70 = dateTime9.minus((org.joda.time.ReadableDuration) duration69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar25 and calendar30", (gregorianCalendar25.compareTo(calendar30) == 0) == gregorianCalendar25.equals(calendar30));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime3.millisOfDay();
        java.lang.String str10 = dateTime3.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        java.util.GregorianCalendar gregorianCalendar14 = dateTime13.toGregorianCalendar();
        int int15 = dateTime13.getHourOfDay();
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.util.Locale locale17 = locale16.stripExtensions();
        java.lang.String str18 = locale17.toLanguageTag();
        java.util.Calendar calendar19 = dateTime13.toCalendar(locale17);
        org.joda.time.DateTime.Property property20 = dateTime13.minuteOfHour();
        boolean boolean21 = property20.isLeap();
        org.joda.time.DateTime dateTime22 = property20.roundCeilingCopy();
        org.joda.time.DurationField durationField23 = property20.getLeapDurationField();
        org.joda.time.DateTime dateTime24 = property20.roundFloorCopy();
        org.joda.time.DateTime dateTime25 = property20.roundFloorCopy();
        org.joda.time.Hours hours26 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Hours hours28 = hours26.minus(100);
        org.joda.time.Hours hours30 = hours28.plus((-963));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar14 and calendar19", (gregorianCalendar14.compareTo(calendar19) == 0) == gregorianCalendar14.equals(calendar19));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime3.weekyear();
        org.joda.time.DateTime.Property property10 = dateTime3.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        java.util.GregorianCalendar gregorianCalendar14 = dateTime13.toGregorianCalendar();
        int int15 = dateTime13.getHourOfDay();
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.util.Locale locale17 = locale16.stripExtensions();
        java.lang.String str18 = locale17.toLanguageTag();
        java.util.Calendar calendar19 = dateTime13.toCalendar(locale17);
        org.joda.time.DateTime.Property property20 = dateTime13.minuteOfHour();
        org.joda.time.Days days21 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod22 = days21.toMutablePeriod();
        org.joda.time.Duration duration23 = days21.toStandardDuration();
        org.joda.time.Days days24 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod25 = days24.toMutablePeriod();
        org.joda.time.Duration duration26 = days24.toStandardDuration();
        boolean boolean27 = duration23.isLongerThan((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Interval interval28 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration30 = duration26.minus((long) 2022);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Interval interval33 = new org.joda.time.Interval(obj31, chronology32);
        long long34 = interval33.getEndMillis();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((-1L), dateTimeZone37);
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        java.util.Calendar calendar40 = dateTime38.toCalendar(locale39);
        org.joda.time.DateTime dateTime42 = dateTime38.plusMillis((int) '4');
        org.joda.time.DateTime dateTime43 = dateTime38.toDateTimeISO();
        org.joda.time.Instant instant44 = dateTime38.toInstant();
        org.joda.time.Instant instant45 = instant44.toInstant();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((-1L), dateTimeZone48);
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.util.Calendar calendar51 = dateTime49.toCalendar(locale50);
        org.joda.time.DateTime dateTime53 = dateTime49.plusMillis((int) '4');
        org.joda.time.DateTime dateTime54 = dateTime49.toDateTimeISO();
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType56 = periodType55.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant44, (org.joda.time.ReadableInstant) dateTime54, periodType55);
        org.joda.time.Period period58 = interval33.toPeriod(periodType55);
        org.joda.time.Period period59 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableDuration) duration30, periodType55);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((-1L), dateTimeZone64);
        org.joda.time.Interval interval66 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone64);
        boolean boolean68 = interval66.isAfter(100L);
        long long69 = interval66.getEndMillis();
        org.joda.time.Interval interval70 = interval66.toInterval();
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((long) 59);
        boolean boolean73 = interval66.isAfter((org.joda.time.ReadableInstant) dateTime72);
        int int74 = dateTime72.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone75 = dateTime72.getZone();
        org.joda.time.DateTime dateTime76 = dateTime72.toDateTime();
        org.joda.time.Days days77 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod78 = days77.toMutablePeriod();
        mutablePeriod78.setSeconds((int) (byte) 0);
        mutablePeriod78.setDays((int) 'a');
        mutablePeriod78.addSeconds((int) (byte) 100);
        org.joda.time.Chronology chronology87 = null;
        mutablePeriod78.setPeriod(10L, (long) (byte) 1, chronology87);
        int int89 = mutablePeriod78.getYears();
        org.joda.time.Period period94 = new org.joda.time.Period((int) (byte) 1, 0, (-1), 10);
        mutablePeriod78.mergePeriod((org.joda.time.ReadablePeriod) period94);
        int int96 = mutablePeriod78.getDays();
        org.joda.time.DateTime dateTime97 = dateTime76.minus((org.joda.time.ReadablePeriod) mutablePeriod78);
        org.joda.time.Interval interval98 = duration30.toIntervalTo((org.joda.time.ReadableInstant) dateTime97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar14 and calendar19", (gregorianCalendar14.compareTo(calendar19) == 0) == gregorianCalendar14.equals(calendar19));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod1 = days0.toMutablePeriod();
        mutablePeriod1.addWeeks((int) (short) -1);
        mutablePeriod1.add((int) (short) 1, (int) '4', 2, (int) (short) -1, 2, (int) '4', 59, (int) 'a');
        org.joda.time.Days days16 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod17 = days16.toMutablePeriod();
        org.joda.time.Duration duration18 = days16.toStandardDuration();
        org.joda.time.PeriodType periodType19 = days16.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((-1L), dateTimeZone22);
        java.util.Locale locale24 = java.util.Locale.KOREAN;
        java.util.Calendar calendar25 = dateTime23.toCalendar(locale24);
        org.joda.time.DateTime dateTime27 = dateTime23.plusMillis((int) '4');
        org.joda.time.Chronology chronology28 = dateTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.hourOfHalfday();
        org.joda.time.Period period30 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType19, chronology28);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology28);
        mutablePeriod1.setPeriod(1L, chronology28);
        mutablePeriod1.setSeconds((int) (byte) 10);
        mutablePeriod1.setWeeks((int) 'x');
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        java.util.GregorianCalendar gregorianCalendar40 = dateTime39.toGregorianCalendar();
        int int41 = dateTime39.getHourOfDay();
        java.util.Locale locale42 = java.util.Locale.CHINA;
        java.util.Locale locale43 = locale42.stripExtensions();
        java.lang.String str44 = locale43.toLanguageTag();
        java.util.Calendar calendar45 = dateTime39.toCalendar(locale43);
        org.joda.time.DateTime.Property property46 = dateTime39.minuteOfHour();
        boolean boolean47 = property46.isLeap();
        org.joda.time.DateTime dateTime48 = property46.roundCeilingCopy();
        org.joda.time.DurationField durationField49 = property46.getLeapDurationField();
        org.joda.time.DateTime dateTime50 = property46.roundFloorCopy();
        org.joda.time.DateTime dateTime52 = dateTime50.plusYears((-100));
        int int53 = dateTime52.getWeekyear();
        org.joda.time.DateTime dateTime55 = dateTime52.plusYears(948);
        org.joda.time.DateTime dateTime57 = dateTime55.plusMillis(59);
        int int58 = dateTime57.getWeekyear();
        org.joda.time.Duration duration59 = mutablePeriod1.toDurationFrom((org.joda.time.ReadableInstant) dateTime57);
        mutablePeriod1.setMinutes((-5));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar40 and calendar45", (gregorianCalendar40.compareTo(calendar45) == 0) == gregorianCalendar40.equals(calendar45));
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        org.joda.time.Interval interval3 = interval2.toInterval();
        org.joda.time.Days days4 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        java.util.GregorianCalendar gregorianCalendar8 = dateTime7.toGregorianCalendar();
        int int9 = dateTime7.getHourOfDay();
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.lang.String str12 = locale11.toLanguageTag();
        java.util.Calendar calendar13 = dateTime7.toCalendar(locale11);
        org.joda.time.DateTime.Property property14 = dateTime7.minuteOfHour();
        org.joda.time.Days days15 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod16 = days15.toMutablePeriod();
        org.joda.time.Duration duration17 = days15.toStandardDuration();
        org.joda.time.Days days18 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod19 = days18.toMutablePeriod();
        org.joda.time.Duration duration20 = days18.toStandardDuration();
        boolean boolean21 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Interval interval22 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.Days days27 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod28 = days27.toMutablePeriod();
        org.joda.time.Duration duration29 = days27.toStandardDuration();
        org.joda.time.PeriodType periodType30 = days27.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((-1L), dateTimeZone33);
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.util.Calendar calendar36 = dateTime34.toCalendar(locale35);
        org.joda.time.DateTime dateTime38 = dateTime34.plusMillis((int) '4');
        org.joda.time.Chronology chronology39 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.hourOfHalfday();
        org.joda.time.Period period41 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType30, chronology39);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(chronology39);
        org.joda.time.DateTimeField dateTimeField43 = chronology39.millisOfDay();
        org.joda.time.Interval interval44 = new org.joda.time.Interval((-259200000L), (long) '#', chronology39);
        boolean boolean45 = interval22.isBefore((org.joda.time.ReadableInterval) interval44);
        long long46 = interval22.toDurationMillis();
        org.joda.time.DateTime dateTime47 = interval22.getEnd();
        boolean boolean48 = interval2.isBefore((org.joda.time.ReadableInstant) dateTime47);
        boolean boolean49 = dateTime47.isBeforeNow();
        org.joda.time.DateTime.Property property50 = dateTime47.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar8 and calendar13", (gregorianCalendar8.compareTo(calendar13) == 0) == gregorianCalendar8.equals(calendar13));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        java.util.GregorianCalendar gregorianCalendar3 = dateTime2.toGregorianCalendar();
        int int4 = dateTime2.getHourOfDay();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.toLanguageTag();
        java.util.Calendar calendar8 = dateTime2.toCalendar(locale6);
        org.joda.time.DateTime.Property property9 = dateTime2.minuteOfHour();
        org.joda.time.Days days10 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod11 = days10.toMutablePeriod();
        org.joda.time.Duration duration12 = days10.toStandardDuration();
        org.joda.time.Days days13 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod14 = days13.toMutablePeriod();
        org.joda.time.Duration duration15 = days13.toStandardDuration();
        boolean boolean16 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration15);
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardMinutes((long) (byte) -1);
        org.joda.time.Duration duration20 = duration15.plus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((-1L), dateTimeZone25);
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        boolean boolean31 = interval27.isAfter((org.joda.time.ReadableInstant) dateTime30);
        long long32 = interval27.toDurationMillis();
        org.joda.time.Days days33 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval27);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((-1L), dateTimeZone36);
        java.util.Locale locale38 = java.util.Locale.KOREAN;
        java.util.Calendar calendar39 = dateTime37.toCalendar(locale38);
        org.joda.time.DateTime dateTime41 = dateTime37.plusMillis((int) '4');
        org.joda.time.DateTime dateTime42 = dateTime37.toDateTimeISO();
        org.joda.time.Instant instant43 = dateTime37.toInstant();
        org.joda.time.Instant instant44 = instant43.toInstant();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((-1L), dateTimeZone47);
        org.joda.time.LocalDateTime localDateTime49 = null;
        boolean boolean50 = dateTimeZone47.isLocalDateTimeGap(localDateTime49);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(dateTimeZone47);
        org.joda.time.DateTime dateTime53 = dateTime51.withHourOfDay(0);
        boolean boolean54 = instant44.isEqual((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.Duration duration56 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Instant instant58 = instant44.withDurationAdded((org.joda.time.ReadableDuration) duration56, (-1));
        java.util.Date date59 = instant44.toDate();
        boolean boolean60 = interval27.isAfter((org.joda.time.ReadableInstant) instant44);
        org.joda.time.Instant instant61 = instant44.toInstant();
        org.joda.time.Interval interval62 = duration20.toIntervalFrom((org.joda.time.ReadableInstant) instant61);
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.seconds();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod(0L, periodType64);
        org.joda.time.PeriodType periodType66 = periodType64.withWeeksRemoved();
        org.joda.time.Period period67 = duration20.toPeriod(periodType64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar3 and calendar8", (gregorianCalendar3.compareTo(calendar8) == 0) == gregorianCalendar3.equals(calendar8));
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        int int6 = dateTime3.getSecondOfMinute();
        org.joda.time.DateTime.Property property7 = dateTime3.hourOfDay();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        int int11 = durationField8.getValue(56485L, (long) 69);
        long long13 = durationField8.getValueAsLong(20880000L);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        java.util.GregorianCalendar gregorianCalendar17 = dateTime16.toGregorianCalendar();
        int int18 = dateTime16.getHourOfDay();
        java.util.Locale locale19 = java.util.Locale.CHINA;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = locale20.toLanguageTag();
        java.util.Calendar calendar22 = dateTime16.toCalendar(locale20);
        org.joda.time.DateTime.Property property23 = dateTime16.minuteOfHour();
        org.joda.time.Days days24 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod25 = days24.toMutablePeriod();
        org.joda.time.Duration duration26 = days24.toStandardDuration();
        org.joda.time.Days days27 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod28 = days27.toMutablePeriod();
        org.joda.time.Duration duration29 = days27.toStandardDuration();
        boolean boolean30 = duration26.isLongerThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration29);
        org.joda.time.Days days36 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod37 = days36.toMutablePeriod();
        org.joda.time.Duration duration38 = days36.toStandardDuration();
        org.joda.time.PeriodType periodType39 = days36.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((-1L), dateTimeZone42);
        java.util.Locale locale44 = java.util.Locale.KOREAN;
        java.util.Calendar calendar45 = dateTime43.toCalendar(locale44);
        org.joda.time.DateTime dateTime47 = dateTime43.plusMillis((int) '4');
        org.joda.time.Chronology chronology48 = dateTime43.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.hourOfHalfday();
        org.joda.time.Period period50 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType39, chronology48);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(chronology48);
        org.joda.time.DateTimeField dateTimeField52 = chronology48.millisOfDay();
        org.joda.time.Interval interval53 = new org.joda.time.Interval((-259200000L), (long) '#', chronology48);
        boolean boolean54 = interval31.isBefore((org.joda.time.ReadableInterval) interval53);
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType56 = periodType55.withYearsRemoved();
        org.joda.time.Duration duration58 = org.joda.time.Duration.millis((long) (short) -1);
        long long59 = duration58.getStandardMinutes();
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType63 = periodType62.withYearsRemoved();
        org.joda.time.Days days66 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod67 = days66.toMutablePeriod();
        org.joda.time.Duration duration68 = days66.toStandardDuration();
        org.joda.time.PeriodType periodType69 = days66.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((-1L), dateTimeZone72);
        java.util.Locale locale74 = java.util.Locale.KOREAN;
        java.util.Calendar calendar75 = dateTime73.toCalendar(locale74);
        org.joda.time.DateTime dateTime77 = dateTime73.plusMillis((int) '4');
        org.joda.time.Chronology chronology78 = dateTime73.getChronology();
        org.joda.time.DateTimeField dateTimeField79 = chronology78.hourOfHalfday();
        org.joda.time.Period period80 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType69, chronology78);
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime(chronology78);
        org.joda.time.DateTimeField dateTimeField82 = chronology78.millisOfDay();
        org.joda.time.Period period83 = new org.joda.time.Period((long) (byte) 1, (long) 1, periodType62, chronology78);
        org.joda.time.Period period84 = duration58.toPeriod(chronology78);
        org.joda.time.DateTimeField dateTimeField85 = chronology78.hourOfDay();
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((java.lang.Object) interval31, periodType56, chronology78);
        org.joda.time.DurationField durationField87 = chronology78.years();
        org.joda.time.DateTimeField dateTimeField88 = chronology78.weekyear();
        org.joda.time.DateTimeField dateTimeField89 = chronology78.dayOfYear();
        org.joda.time.DurationField durationField90 = chronology78.weekyears();
        long long93 = durationField90.getMillis((int) '#', 345600000L);
        int int94 = durationField8.compareTo(durationField90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar17 and calendar22", (gregorianCalendar17.compareTo(calendar22) == 0) == gregorianCalendar17.equals(calendar22));
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        java.util.GregorianCalendar gregorianCalendar3 = dateTime2.toGregorianCalendar();
        int int4 = dateTime2.getHourOfDay();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.toLanguageTag();
        java.util.Calendar calendar8 = dateTime2.toCalendar(locale6);
        org.joda.time.DateTime.Property property9 = dateTime2.minuteOfHour();
        org.joda.time.Days days10 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod11 = days10.toMutablePeriod();
        org.joda.time.Duration duration12 = days10.toStandardDuration();
        org.joda.time.Days days13 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod14 = days13.toMutablePeriod();
        org.joda.time.Duration duration15 = days13.toStandardDuration();
        boolean boolean16 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration15);
        org.joda.time.Days days22 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod23 = days22.toMutablePeriod();
        org.joda.time.Duration duration24 = days22.toStandardDuration();
        org.joda.time.PeriodType periodType25 = days22.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((-1L), dateTimeZone28);
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        java.util.Calendar calendar31 = dateTime29.toCalendar(locale30);
        org.joda.time.DateTime dateTime33 = dateTime29.plusMillis((int) '4');
        org.joda.time.Chronology chronology34 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.hourOfHalfday();
        org.joda.time.Period period36 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType25, chronology34);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTimeField dateTimeField38 = chronology34.millisOfDay();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((-259200000L), (long) '#', chronology34);
        boolean boolean40 = interval17.isBefore((org.joda.time.ReadableInterval) interval39);
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType42 = periodType41.withYearsRemoved();
        org.joda.time.Duration duration44 = org.joda.time.Duration.millis((long) (short) -1);
        long long45 = duration44.getStandardMinutes();
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType49 = periodType48.withYearsRemoved();
        org.joda.time.Days days52 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod53 = days52.toMutablePeriod();
        org.joda.time.Duration duration54 = days52.toStandardDuration();
        org.joda.time.PeriodType periodType55 = days52.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((-1L), dateTimeZone58);
        java.util.Locale locale60 = java.util.Locale.KOREAN;
        java.util.Calendar calendar61 = dateTime59.toCalendar(locale60);
        org.joda.time.DateTime dateTime63 = dateTime59.plusMillis((int) '4');
        org.joda.time.Chronology chronology64 = dateTime59.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.hourOfHalfday();
        org.joda.time.Period period66 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType55, chronology64);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(chronology64);
        org.joda.time.DateTimeField dateTimeField68 = chronology64.millisOfDay();
        org.joda.time.Period period69 = new org.joda.time.Period((long) (byte) 1, (long) 1, periodType48, chronology64);
        org.joda.time.Period period70 = duration44.toPeriod(chronology64);
        org.joda.time.DateTimeField dateTimeField71 = chronology64.hourOfDay();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((java.lang.Object) interval17, periodType42, chronology64);
        org.joda.time.DateTimeField dateTimeField73 = chronology64.minuteOfHour();
        int int74 = dateTimeField73.getMaximumValue();
        long long76 = dateTimeField73.roundCeiling(421199848L);
        int int78 = dateTimeField73.get(1645514176520L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar3 and calendar8", (gregorianCalendar3.compareTo(calendar8) == 0) == gregorianCalendar3.equals(calendar8));
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((-1L), dateTimeZone3);
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Calendar calendar6 = dateTime4.toCalendar(locale5);
        org.joda.time.DateTime dateTime8 = dateTime4.plusMillis((int) '4');
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '4', chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = chronology9.year();
        org.joda.time.DurationField durationField13 = dateTimeField12.getLeapDurationField();
        long long16 = dateTimeField12.add((-73852033L), 941);
        org.joda.time.ReadablePartial readablePartial17 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        java.util.GregorianCalendar gregorianCalendar26 = dateTime25.toGregorianCalendar();
        int int27 = dateTime25.getHourOfDay();
        java.util.Locale locale28 = java.util.Locale.CHINA;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.lang.String str30 = locale29.toLanguageTag();
        java.util.Calendar calendar31 = dateTime25.toCalendar(locale29);
        org.joda.time.DateTime.Property property32 = dateTime25.minuteOfHour();
        org.joda.time.DateTime dateTime34 = property32.addToCopy(10);
        java.util.Locale locale35 = java.util.Locale.CHINA;
        java.util.Locale locale36 = locale35.stripExtensions();
        java.lang.String str37 = locale35.getISO3Language();
        java.lang.String str38 = locale35.getDisplayScript();
        java.lang.String str39 = property32.getAsShortText(locale35);
        java.lang.String str40 = dateTimeZone20.getName(10L, locale35);
        java.lang.String str41 = dateTimeField12.getAsText(readablePartial17, 604, locale35);
        java.lang.String str42 = locale35.getLanguage();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar26 and calendar31", (gregorianCalendar26.compareTo(calendar31) == 0) == gregorianCalendar26.equals(calendar31));
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        java.util.GregorianCalendar gregorianCalendar3 = dateTime2.toGregorianCalendar();
        int int4 = dateTime2.getHourOfDay();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.toLanguageTag();
        java.util.Calendar calendar8 = dateTime2.toCalendar(locale6);
        org.joda.time.DateTime.Property property9 = dateTime2.minuteOfHour();
        org.joda.time.Days days10 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod11 = days10.toMutablePeriod();
        org.joda.time.Duration duration12 = days10.toStandardDuration();
        org.joda.time.Days days13 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod14 = days13.toMutablePeriod();
        org.joda.time.Duration duration15 = days13.toStandardDuration();
        boolean boolean16 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration15);
        org.joda.time.Days days22 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod23 = days22.toMutablePeriod();
        org.joda.time.Duration duration24 = days22.toStandardDuration();
        org.joda.time.PeriodType periodType25 = days22.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((-1L), dateTimeZone28);
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        java.util.Calendar calendar31 = dateTime29.toCalendar(locale30);
        org.joda.time.DateTime dateTime33 = dateTime29.plusMillis((int) '4');
        org.joda.time.Chronology chronology34 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.hourOfHalfday();
        org.joda.time.Period period36 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType25, chronology34);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTimeField dateTimeField38 = chronology34.millisOfDay();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((-259200000L), (long) '#', chronology34);
        boolean boolean40 = interval17.isBefore((org.joda.time.ReadableInterval) interval39);
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType42 = periodType41.withYearsRemoved();
        org.joda.time.Duration duration44 = org.joda.time.Duration.millis((long) (short) -1);
        long long45 = duration44.getStandardMinutes();
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType49 = periodType48.withYearsRemoved();
        org.joda.time.Days days52 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod53 = days52.toMutablePeriod();
        org.joda.time.Duration duration54 = days52.toStandardDuration();
        org.joda.time.PeriodType periodType55 = days52.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((-1L), dateTimeZone58);
        java.util.Locale locale60 = java.util.Locale.KOREAN;
        java.util.Calendar calendar61 = dateTime59.toCalendar(locale60);
        org.joda.time.DateTime dateTime63 = dateTime59.plusMillis((int) '4');
        org.joda.time.Chronology chronology64 = dateTime59.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.hourOfHalfday();
        org.joda.time.Period period66 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType55, chronology64);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(chronology64);
        org.joda.time.DateTimeField dateTimeField68 = chronology64.millisOfDay();
        org.joda.time.Period period69 = new org.joda.time.Period((long) (byte) 1, (long) 1, periodType48, chronology64);
        org.joda.time.Period period70 = duration44.toPeriod(chronology64);
        org.joda.time.DateTimeField dateTimeField71 = chronology64.hourOfDay();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((java.lang.Object) interval17, periodType42, chronology64);
        org.joda.time.DateTimeField dateTimeField73 = chronology64.minuteOfHour();
        int int74 = dateTimeField73.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = dateTimeField73.getType();
        org.joda.time.DurationField durationField76 = dateTimeField73.getDurationField();
        long long79 = durationField76.subtract(11084L, (long) 1007);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar3 and calendar8", (gregorianCalendar3.compareTo(calendar8) == 0) == gregorianCalendar3.equals(calendar8));
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime8 = dateTime6.withHourOfDay(0);
        int int9 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime dateTime11 = dateTime8.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime13 = dateTime8.withWeekyear((int) '4');
        org.joda.time.DateTime dateTime14 = dateTime8.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime14.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) (byte) 100);
        org.joda.time.DateTime.Property property18 = dateTime17.millisOfDay();
        org.joda.time.DateTime dateTime19 = property18.getDateTime();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.parse("1970-01-01T00:00:00.000Z");
        int int22 = dateTime21.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        java.util.GregorianCalendar gregorianCalendar26 = dateTime25.toGregorianCalendar();
        int int27 = dateTime25.getHourOfDay();
        java.util.Locale locale28 = java.util.Locale.CHINA;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.lang.String str30 = locale29.toLanguageTag();
        java.util.Calendar calendar31 = dateTime25.toCalendar(locale29);
        org.joda.time.DateTime.Property property32 = dateTime25.minuteOfHour();
        org.joda.time.Days days33 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod34 = days33.toMutablePeriod();
        org.joda.time.Duration duration35 = days33.toStandardDuration();
        org.joda.time.Days days36 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod37 = days36.toMutablePeriod();
        org.joda.time.Duration duration38 = days36.toStandardDuration();
        boolean boolean39 = duration35.isLongerThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Interval interval40 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration38);
        org.joda.time.Duration duration42 = duration38.minus((long) 2022);
        java.lang.String str43 = duration42.toString();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableDuration) duration42);
        long long45 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime47 = dateTime21.withMillisOfSecond(163);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar26 and calendar31", (gregorianCalendar26.compareTo(calendar31) == 0) == gregorianCalendar26.equals(calendar31));
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType3 = periodType2.withMinutesRemoved();
        java.lang.String str4 = periodType3.getName();
        org.joda.time.PeriodType periodType5 = periodType3.withMinutesRemoved();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        java.util.GregorianCalendar gregorianCalendar9 = dateTime8.toGregorianCalendar();
        int int10 = dateTime8.getHourOfDay();
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = locale12.toLanguageTag();
        java.util.Calendar calendar14 = dateTime8.toCalendar(locale12);
        org.joda.time.DateTime.Property property15 = dateTime8.minuteOfHour();
        boolean boolean16 = property15.isLeap();
        org.joda.time.DateTime dateTime17 = property15.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((-1L), dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone20.isLocalDateTimeGap(localDateTime22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime26 = dateTime24.withHourOfDay(0);
        int int27 = dateTime26.getDayOfWeek();
        org.joda.time.DateTime dateTime29 = dateTime26.minusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((-1L), dateTimeZone32);
        java.util.Locale locale34 = java.util.Locale.KOREAN;
        java.util.Calendar calendar35 = dateTime33.toCalendar(locale34);
        org.joda.time.DateTime dateTime37 = dateTime33.plusMillis((int) '4');
        org.joda.time.Instant instant38 = dateTime37.toInstant();
        org.joda.time.Hours hours39 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) instant38);
        org.joda.time.DateTime dateTime41 = dateTime29.plusMillis((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight42 = dateTime41.toDateMidnight();
        int int43 = property15.compareTo((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime45 = dateTime41.withYearOfCentury(3);
        org.joda.time.DateTime dateTime47 = dateTime41.withYearOfEra(138);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((-1L), dateTimeZone51);
        java.util.Locale locale53 = java.util.Locale.KOREAN;
        java.util.Calendar calendar54 = dateTime52.toCalendar(locale53);
        org.joda.time.DateTime dateTime56 = dateTime52.plusMillis((int) '4');
        org.joda.time.Chronology chronology57 = dateTime52.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField59 = chronology57.era();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(0L, chronology57);
        org.joda.time.DateTimeField dateTimeField61 = chronology57.era();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod(34, 34, (int) (short) 0, 7);
        org.joda.time.Period period68 = new org.joda.time.Period((long) (byte) 10);
        int int69 = period68.getSeconds();
        org.joda.time.DurationFieldType durationFieldType70 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period72 = period68.withFieldAdded(durationFieldType70, 86399);
        org.joda.time.DurationFieldType durationFieldType74 = period68.getFieldType(1);
        mutablePeriod66.set(durationFieldType74, (int) 'u');
        mutablePeriod66.addHours((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime((-1L), dateTimeZone83);
        org.joda.time.Interval interval85 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone83);
        boolean boolean87 = interval85.isAfter(100L);
        long long88 = interval85.getEndMillis();
        org.joda.time.DateTime dateTime89 = interval85.getEnd();
        long long90 = interval85.getStartMillis();
        mutablePeriod66.setPeriod((org.joda.time.ReadableInterval) interval85);
        long long94 = chronology57.add((org.joda.time.ReadablePeriod) mutablePeriod66, (-31536000000L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField95 = chronology57.dayOfWeek();
        org.joda.time.DateTime dateTime96 = dateTime41.toDateTime(chronology57);
        org.joda.time.Period period97 = new org.joda.time.Period(1646032247652L, (-4547L), periodType3, chronology57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar9 and calendar14", (gregorianCalendar9.compareTo(calendar14) == 0) == gregorianCalendar9.equals(calendar14));
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        java.util.GregorianCalendar gregorianCalendar3 = dateTime2.toGregorianCalendar();
        int int4 = dateTime2.getHourOfDay();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.toLanguageTag();
        java.util.Calendar calendar8 = dateTime2.toCalendar(locale6);
        org.joda.time.DateTime.Property property9 = dateTime2.minuteOfHour();
        boolean boolean10 = property9.isLeap();
        org.joda.time.DateTime dateTime11 = property9.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((-1L), dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone14.isLocalDateTimeGap(localDateTime16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime20 = dateTime18.withHourOfDay(0);
        int int21 = dateTime20.getDayOfWeek();
        org.joda.time.DateTime dateTime23 = dateTime20.minusWeeks((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((-1L), dateTimeZone26);
        java.util.Locale locale28 = java.util.Locale.KOREAN;
        java.util.Calendar calendar29 = dateTime27.toCalendar(locale28);
        org.joda.time.DateTime dateTime31 = dateTime27.plusMillis((int) '4');
        org.joda.time.Instant instant32 = dateTime31.toInstant();
        org.joda.time.Hours hours33 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) instant32);
        org.joda.time.DateTime dateTime35 = dateTime23.plusMillis((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight36 = dateTime35.toDateMidnight();
        int int37 = property9.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime39 = dateTime35.withYearOfCentury(3);
        org.joda.time.DateTime dateTime41 = dateTime35.withYearOfEra(138);
        org.joda.time.DateTime dateTime43 = dateTime41.withMillisOfDay((int) ' ');
        org.joda.time.DateTime.Property property44 = dateTime41.millisOfSecond();
        java.lang.String str45 = property44.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar3 and calendar8", (gregorianCalendar3.compareTo(calendar8) == 0) == gregorianCalendar3.equals(calendar8));
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        java.util.GregorianCalendar gregorianCalendar3 = dateTime2.toGregorianCalendar();
        int int4 = dateTime2.getHourOfDay();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.toLanguageTag();
        java.util.Calendar calendar8 = dateTime2.toCalendar(locale6);
        org.joda.time.DateTime.Property property9 = dateTime2.minuteOfHour();
        org.joda.time.Days days10 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod11 = days10.toMutablePeriod();
        org.joda.time.Duration duration12 = days10.toStandardDuration();
        org.joda.time.Days days13 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod14 = days13.toMutablePeriod();
        org.joda.time.Duration duration15 = days13.toStandardDuration();
        boolean boolean16 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableDuration) duration15);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((-1L), dateTimeZone22);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone22);
        boolean boolean26 = interval24.isAfter(100L);
        long long27 = interval24.getEndMillis();
        boolean boolean28 = interval17.overlaps((org.joda.time.ReadableInterval) interval24);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((-1L), dateTimeZone33);
        org.joda.time.Interval interval35 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone33);
        org.joda.time.MutableInterval mutableInterval36 = interval35.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval37 = interval35.toMutableInterval();
        boolean boolean39 = mutableInterval37.isBefore((long) (-100));
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((-1L), dateTimeZone44);
        org.joda.time.Interval interval46 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone44);
        boolean boolean48 = interval46.isAfter(100L);
        long long49 = interval46.getEndMillis();
        org.joda.time.Interval interval50 = interval46.toInterval();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Interval interval52 = interval50.withDurationBeforeEnd(readableDuration51);
        org.joda.time.Duration duration53 = interval52.toDuration();
        mutableInterval37.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Period period55 = mutableInterval37.toPeriod();
        boolean boolean56 = interval24.abuts((org.joda.time.ReadableInterval) mutableInterval37);
        org.joda.time.PeriodType periodType58 = org.joda.time.PeriodType.seconds();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(0L, periodType58);
        org.joda.time.PeriodType periodType60 = periodType58.withWeeksRemoved();
        org.joda.time.Period period61 = interval24.toPeriod(periodType58);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime64 = org.joda.time.DateTime.now(dateTimeZone63);
        boolean boolean66 = dateTime64.isAfter((long) (byte) 10);
        org.joda.time.DateTime.Property property67 = dateTime64.millisOfSecond();
        int int68 = property67.getLeapAmount();
        java.util.Locale locale69 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str70 = property67.getAsText(locale69);
        org.joda.time.Interval interval71 = property67.toInterval();
        boolean boolean73 = interval71.isAfter((-1L));
        org.joda.time.MutableInterval mutableInterval74 = interval71.toMutableInterval();
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime((-1L), dateTimeZone79);
        org.joda.time.Interval interval81 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone79);
        boolean boolean83 = interval81.isAfter(100L);
        long long84 = interval81.getEndMillis();
        org.joda.time.Interval interval85 = interval81.toInterval();
        org.joda.time.Interval interval86 = interval85.toInterval();
        org.joda.time.Chronology chronology88 = null;
        org.joda.time.Period period89 = new org.joda.time.Period(0L, chronology88);
        int int90 = period89.getSeconds();
        org.joda.time.Period period92 = period89.withMonths((int) (byte) 10);
        org.joda.time.Interval interval93 = interval86.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period92);
        boolean boolean94 = interval71.isBefore((org.joda.time.ReadableInterval) interval93);
        org.joda.time.ReadablePeriod readablePeriod95 = null;
        org.joda.time.Interval interval96 = interval71.withPeriodAfterStart(readablePeriod95);
        org.joda.time.Interval interval97 = interval24.overlap((org.joda.time.ReadableInterval) interval96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar3 and calendar8", (gregorianCalendar3.compareTo(calendar8) == 0) == gregorianCalendar3.equals(calendar8));
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod1 = days0.toMutablePeriod();
        mutablePeriod1.setSeconds((int) (byte) 0);
        mutablePeriod1.setHours((int) '#');
        mutablePeriod1.addMillis((int) (byte) 100);
        mutablePeriod1.setHours(2);
        org.joda.time.MutablePeriod mutablePeriod10 = mutablePeriod1.copy();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        java.util.GregorianCalendar gregorianCalendar14 = dateTime13.toGregorianCalendar();
        int int15 = dateTime13.getHourOfDay();
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.util.Locale locale17 = locale16.stripExtensions();
        java.lang.String str18 = locale17.toLanguageTag();
        java.util.Calendar calendar19 = dateTime13.toCalendar(locale17);
        org.joda.time.DateTime.Property property20 = dateTime13.minuteOfHour();
        org.joda.time.Days days21 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod22 = days21.toMutablePeriod();
        org.joda.time.Duration duration23 = days21.toStandardDuration();
        org.joda.time.Days days24 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod25 = days24.toMutablePeriod();
        org.joda.time.Duration duration26 = days24.toStandardDuration();
        boolean boolean27 = duration23.isLongerThan((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Interval interval28 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Days days33 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod34 = days33.toMutablePeriod();
        org.joda.time.Duration duration35 = days33.toStandardDuration();
        org.joda.time.PeriodType periodType36 = days33.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((-1L), dateTimeZone39);
        java.util.Locale locale41 = java.util.Locale.KOREAN;
        java.util.Calendar calendar42 = dateTime40.toCalendar(locale41);
        org.joda.time.DateTime dateTime44 = dateTime40.plusMillis((int) '4');
        org.joda.time.Chronology chronology45 = dateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.hourOfHalfday();
        org.joda.time.Period period47 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType36, chronology45);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(chronology45);
        org.joda.time.DateTimeField dateTimeField49 = chronology45.millisOfDay();
        org.joda.time.Interval interval50 = new org.joda.time.Interval((-259200000L), (long) '#', chronology45);
        boolean boolean51 = interval28.isBefore((org.joda.time.ReadableInterval) interval50);
        long long52 = interval28.toDurationMillis();
        org.joda.time.DateTime dateTime53 = interval28.getEnd();
        org.joda.time.Duration duration55 = new org.joda.time.Duration((long) 138);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((-1L), dateTimeZone58);
        java.util.Locale locale60 = java.util.Locale.KOREAN;
        java.util.Calendar calendar61 = dateTime59.toCalendar(locale60);
        org.joda.time.DateTime dateTime63 = dateTime59.plusMillis((int) '4');
        org.joda.time.DateTime dateTime64 = dateTime59.toDateTimeISO();
        org.joda.time.DateTime.Property property65 = dateTime59.weekyear();
        org.joda.time.Duration duration67 = org.joda.time.Duration.millis((long) (short) -1);
        long long68 = duration67.getMillis();
        org.joda.time.PeriodType periodType69 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType70 = periodType69.withMinutesRemoved();
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime59, (org.joda.time.ReadableDuration) duration67, periodType69);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime53, (org.joda.time.ReadableDuration) duration55, periodType69);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((-1L), dateTimeZone75);
        java.util.Locale locale77 = java.util.Locale.KOREAN;
        java.util.Calendar calendar78 = dateTime76.toCalendar(locale77);
        org.joda.time.DateTime dateTime80 = dateTime76.plusMillis((int) '4');
        org.joda.time.DateTime dateTime81 = dateTime76.toDateTimeISO();
        org.joda.time.DateTime.Property property82 = dateTime76.weekyear();
        int int83 = property82.getLeapAmount();
        org.joda.time.DateTime dateTime85 = property82.setCopy(5);
        org.joda.time.DateTime.Property property86 = dateTime85.era();
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration55, (org.joda.time.ReadableInstant) dateTime85);
        long long88 = duration55.getMillis();
        mutablePeriod10.setPeriod((org.joda.time.ReadableDuration) duration55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar14 and calendar19", (gregorianCalendar14.compareTo(calendar19) == 0) == gregorianCalendar14.equals(calendar19));
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        org.joda.time.Interval interval3 = interval2.toInterval();
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Days days5 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod6 = days5.toMutablePeriod();
        org.joda.time.Duration duration7 = days5.toStandardDuration();
        long long8 = duration7.getStandardHours();
        mutableInterval4.setDurationAfterStart((org.joda.time.ReadableDuration) duration7);
        long long10 = duration7.getMillis();
        java.lang.String str11 = duration7.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((-1L), dateTimeZone16);
        org.joda.time.Interval interval18 = new org.joda.time.Interval((long) (short) -1, (long) 1, dateTimeZone16);
        boolean boolean20 = interval18.isAfter(100L);
        long long21 = interval18.getEndMillis();
        org.joda.time.Interval interval22 = interval18.toInterval();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((-1L), dateTimeZone25);
        java.util.Locale locale27 = java.util.Locale.KOREAN;
        java.util.Calendar calendar28 = dateTime26.toCalendar(locale27);
        org.joda.time.DateTime dateTime30 = dateTime26.plusMillis((int) '4');
        org.joda.time.DateTime dateTime31 = dateTime26.toDateTimeISO();
        org.joda.time.Instant instant32 = dateTime26.toInstant();
        org.joda.time.Instant instant33 = instant32.toInstant();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((-1L), dateTimeZone36);
        java.util.Locale locale38 = java.util.Locale.KOREAN;
        java.util.Calendar calendar39 = dateTime37.toCalendar(locale38);
        org.joda.time.DateTime dateTime41 = dateTime37.plusMillis((int) '4');
        org.joda.time.DateTime dateTime42 = dateTime37.toDateTimeISO();
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType44 = periodType43.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant32, (org.joda.time.ReadableInstant) dateTime42, periodType43);
        boolean boolean46 = interval18.isBefore((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Period period47 = duration7.toPeriodTo((org.joda.time.ReadableInstant) dateTime42);
        int int48 = dateTime42.getMillisOfDay();
        org.joda.time.DateTime dateTime50 = dateTime42.withCenturyOfEra((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime50, readableInstant51);
        org.joda.time.MutableInterval mutableInterval53 = interval52.toMutableInterval();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone55);
        java.util.GregorianCalendar gregorianCalendar57 = dateTime56.toGregorianCalendar();
        int int58 = dateTime56.getHourOfDay();
        java.util.Locale locale59 = java.util.Locale.CHINA;
        java.util.Locale locale60 = locale59.stripExtensions();
        java.lang.String str61 = locale60.toLanguageTag();
        java.util.Calendar calendar62 = dateTime56.toCalendar(locale60);
        org.joda.time.DateTime dateTime64 = dateTime56.plusHours((int) 'x');
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHours(1);
        org.joda.time.DateTime dateTime67 = dateTime56.withZoneRetainFields(dateTimeZone66);
        mutableInterval53.setStart((org.joda.time.ReadableInstant) dateTime56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar57 and calendar62", (gregorianCalendar57.compareTo(calendar62) == 0) == gregorianCalendar57.equals(calendar62));
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone5);
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        int int8 = dateTime6.getHourOfDay();
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.lang.String str11 = locale10.toLanguageTag();
        java.util.Calendar calendar12 = dateTime6.toCalendar(locale10);
        org.joda.time.DateTime.Property property13 = dateTime6.minuteOfHour();
        org.joda.time.DateTime dateTime15 = property13.addToCopy(10);
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.util.Locale locale17 = locale16.stripExtensions();
        java.lang.String str18 = locale16.getISO3Language();
        java.lang.String str19 = locale16.getDisplayScript();
        java.lang.String str20 = property13.getAsShortText(locale16);
        java.lang.String str21 = dateTimeZone1.getName(10L, locale16);
        boolean boolean22 = dateTimeZone1.isFixed();
        long long24 = dateTimeZone1.previousTransition(1L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar7 and calendar12", (gregorianCalendar7.compareTo(calendar12) == 0) == gregorianCalendar7.equals(calendar12));
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) 10);
        int int2 = period1.getSeconds();
        org.joda.time.Period period4 = period1.minusHours(100);
        org.joda.time.Period period6 = period1.minusSeconds((int) '4');
        org.joda.time.Period period8 = period1.withHours(10);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        boolean boolean13 = dateTime11.isAfter((long) (byte) 10);
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        java.util.GregorianCalendar gregorianCalendar18 = dateTime17.toGregorianCalendar();
        int int19 = dateTime17.getHourOfDay();
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.lang.String str22 = locale21.toLanguageTag();
        java.util.Calendar calendar23 = dateTime17.toCalendar(locale21);
        org.joda.time.DateTime dateTime25 = dateTime17.plusHours((int) 'x');
        boolean boolean26 = interval14.isBefore((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Interval interval28 = interval14.withStartMillis((long) '#');
        org.joda.time.Seconds seconds29 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval14);
        java.lang.String str30 = seconds29.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar18 and calendar23", (gregorianCalendar18.compareTo(calendar23) == 0) == gregorianCalendar18.equals(calendar23));
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        java.util.GregorianCalendar gregorianCalendar3 = dateTime2.toGregorianCalendar();
        int int4 = dateTime2.getHourOfDay();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.toLanguageTag();
        java.util.Calendar calendar8 = dateTime2.toCalendar(locale6);
        org.joda.time.DateTime.Property property9 = dateTime2.minuteOfHour();
        boolean boolean10 = property9.isLeap();
        org.joda.time.DateTime dateTime11 = property9.roundCeilingCopy();
        org.joda.time.DurationField durationField12 = property9.getLeapDurationField();
        org.joda.time.DateTime dateTime13 = property9.roundFloorCopy();
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((-100));
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((-1L), dateTimeZone19);
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.util.Calendar calendar22 = dateTime20.toCalendar(locale21);
        org.joda.time.DateTime dateTime24 = dateTime20.plusMillis((int) '4');
        org.joda.time.Chronology chronology25 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.era();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(0L, chronology25);
        boolean boolean29 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((-1L), dateTimeZone32);
        java.util.Locale locale34 = java.util.Locale.KOREAN;
        java.util.Calendar calendar35 = dateTime33.toCalendar(locale34);
        org.joda.time.DateTime dateTime37 = dateTime33.plusMillis((int) '4');
        org.joda.time.DateTime dateTime38 = dateTime33.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone40);
        boolean boolean43 = dateTime41.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes44 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Duration duration45 = minutes44.toStandardDuration();
        org.joda.time.Duration duration48 = duration45.withDurationAdded((long) (byte) -1, (int) 'u');
        boolean boolean49 = dateTime28.equals((java.lang.Object) duration45);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration45, readableInstant50);
        java.lang.String str52 = mutableInterval51.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar3 and calendar8", (gregorianCalendar3.compareTo(calendar8) == 0) == gregorianCalendar3.equals(calendar8));
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod1 = days0.toMutablePeriod();
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod3 = days2.toMutablePeriod();
        mutablePeriod3.setSeconds((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval6 = null;
        mutablePeriod3.add(readableInterval6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.eras();
        int int9 = mutablePeriod3.get(durationFieldType8);
        boolean boolean10 = mutablePeriod1.isSupported(durationFieldType8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType8.getField(chronology11);
        boolean boolean13 = durationField12.isSupported();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((-1L), dateTimeZone16);
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.util.Calendar calendar19 = dateTime17.toCalendar(locale18);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMillis((int) '4');
        org.joda.time.DateTime dateTime22 = dateTime17.toDateTimeISO();
        org.joda.time.DateTime.Property property23 = dateTime17.millisOfDay();
        org.joda.time.DurationField durationField24 = property23.getRangeDurationField();
        long long26 = durationField24.getValueAsLong((long) 100);
        int int27 = durationField12.compareTo(durationField24);
        int int29 = durationField24.getValue(1646032580292L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField24, and durationField12", !(durationField12.compareTo(durationField24) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField24.compareTo(durationField12))));
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.Instant instant9 = dateTime3.toInstant();
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((-1L), dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone13.isLocalDateTimeGap(localDateTime15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime19 = dateTime17.withHourOfDay(0);
        boolean boolean20 = instant10.isEqual((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Duration duration22 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Instant instant24 = instant10.withDurationAdded((org.joda.time.ReadableDuration) duration22, (-1));
        boolean boolean26 = instant24.isBefore((long) (short) 10);
        org.joda.time.Chronology chronology27 = instant24.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.seconds();
        org.joda.time.DurationField durationField29 = chronology27.eras();
        org.joda.time.DurationField durationField30 = chronology27.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField28 and durationField29", Math.signum(durationField28.compareTo(durationField29)) == -Math.signum(durationField29.compareTo(durationField28)));
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((-6380815651199988L));
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(679);
        org.joda.time.DateTime dateTime4 = dateTime1.withZone(dateTimeZone3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfEra();
        org.joda.time.DateTime.Property property6 = dateTime4.weekyear();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes9 = minutes7.minus(2);
        org.joda.time.Minutes minutes11 = minutes9.minus(1);
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes14 = minutes12.minus(2);
        boolean boolean15 = minutes11.isGreaterThan(minutes12);
        org.joda.time.DateTime dateTime16 = dateTime4.plus((org.joda.time.ReadablePeriod) minutes11);
        org.joda.time.Days days18 = org.joda.time.Days.days(75311);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((-1L), dateTimeZone23);
        java.util.Locale locale25 = java.util.Locale.KOREAN;
        java.util.Calendar calendar26 = dateTime24.toCalendar(locale25);
        org.joda.time.DateTime dateTime28 = dateTime24.plusMillis((int) '4');
        org.joda.time.Chronology chronology29 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.hourOfHalfday();
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) (short) 1, (long) 86399, chronology29);
        long long32 = mutableInterval31.getEndMillis();
        mutableInterval31.setEndMillis(652278993L);
        org.joda.time.Period period35 = mutableInterval31.toPeriod();
        org.joda.time.Days days36 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) mutableInterval31);
        boolean boolean37 = days18.isGreaterThan(days36);
        org.joda.time.DateTime dateTime38 = dateTime16.plus((org.joda.time.ReadablePeriod) days18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime4", (dateTime1.compareTo(dateTime4) == 0) == dateTime1.equals(dateTime4));
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.DateTime.Property property8 = dateTime7.secondOfDay();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((-1L), dateTimeZone12);
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.util.Calendar calendar15 = dateTime13.toCalendar(locale14);
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.lang.String str17 = locale14.getDisplayCountry(locale16);
        org.joda.time.Days days20 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod21 = days20.toMutablePeriod();
        org.joda.time.Duration duration22 = days20.toStandardDuration();
        org.joda.time.PeriodType periodType23 = days20.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((-1L), dateTimeZone26);
        java.util.Locale locale28 = java.util.Locale.KOREAN;
        java.util.Calendar calendar29 = dateTime27.toCalendar(locale28);
        org.joda.time.DateTime dateTime31 = dateTime27.plusMillis((int) '4');
        org.joda.time.Chronology chronology32 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.hourOfHalfday();
        org.joda.time.Period period34 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType23, chronology32);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology32);
        org.joda.time.DateTimeField dateTimeField36 = chronology32.millisOfDay();
        boolean boolean38 = dateTimeField36.isLeap((long) 1439);
        long long40 = dateTimeField36.roundHalfCeiling((-82737998L));
        java.lang.String str42 = dateTimeField36.getAsText(10L);
        int int44 = dateTimeField36.getLeapAmount((-100L));
        java.util.Locale locale47 = java.util.Locale.forLanguageTag("PT518400S");
        java.lang.String str48 = locale47.getDisplayName();
        java.lang.String str49 = dateTimeField36.getAsText(718, locale47);
        java.lang.String str50 = locale14.getDisplayLanguage(locale47);
        int int51 = property8.getMaximumShortTextLength(locale14);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(dateTimeZone53);
        java.util.GregorianCalendar gregorianCalendar55 = dateTime54.toGregorianCalendar();
        int int56 = dateTime54.getHourOfDay();
        java.util.Locale locale57 = java.util.Locale.CHINA;
        java.util.Locale locale58 = locale57.stripExtensions();
        java.lang.String str59 = locale58.toLanguageTag();
        java.util.Calendar calendar60 = dateTime54.toCalendar(locale58);
        org.joda.time.DateTime.Property property61 = dateTime54.minuteOfHour();
        boolean boolean62 = property61.isLeap();
        long long63 = property61.remainder();
        java.util.Locale.Category category64 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale65 = java.util.Locale.getDefault(category64);
        java.util.Locale locale66 = java.util.Locale.getDefault(category64);
        java.lang.String str67 = locale66.getDisplayScript();
        java.util.Set<java.lang.Character> charSet68 = locale66.getExtensionKeys();
        java.lang.String str69 = property61.getAsShortText(locale66);
        java.lang.String str70 = locale14.getDisplayLanguage(locale66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar55 and calendar60", (gregorianCalendar55.compareTo(calendar60) == 0) == gregorianCalendar55.equals(calendar60));
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        org.joda.time.Interval interval3 = interval2.toInterval();
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.Days days5 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod6 = days5.toMutablePeriod();
        org.joda.time.Duration duration7 = days5.toStandardDuration();
        long long8 = duration7.getStandardHours();
        mutableInterval4.setDurationAfterStart((org.joda.time.ReadableDuration) duration7);
        org.joda.time.Days days14 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod15 = days14.toMutablePeriod();
        org.joda.time.Duration duration16 = days14.toStandardDuration();
        org.joda.time.PeriodType periodType17 = days14.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((-1L), dateTimeZone20);
        java.util.Locale locale22 = java.util.Locale.KOREAN;
        java.util.Calendar calendar23 = dateTime21.toCalendar(locale22);
        org.joda.time.DateTime dateTime25 = dateTime21.plusMillis((int) '4');
        org.joda.time.Chronology chronology26 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.hourOfHalfday();
        org.joda.time.Period period28 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType17, chronology26);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTimeField dateTimeField30 = chronology26.millisOfDay();
        org.joda.time.Interval interval31 = new org.joda.time.Interval((-259200000L), (long) '#', chronology26);
        mutableInterval4.setChronology(chronology26);
        org.joda.time.DurationField durationField33 = chronology26.weekyears();
        org.joda.time.DurationField durationField34 = chronology26.eras();
        org.joda.time.DateTimeField dateTimeField35 = chronology26.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField33 and durationField34", Math.signum(durationField33.compareTo(durationField34)) == -Math.signum(durationField34.compareTo(durationField33)));
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test87");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) 10);
        org.joda.time.Duration duration2 = period1.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((-1L), dateTimeZone5);
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.util.Calendar calendar8 = dateTime6.toCalendar(locale7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((-1L), dateTimeZone11);
        boolean boolean13 = dateTime6.equals((java.lang.Object) dateTime12);
        java.util.GregorianCalendar gregorianCalendar14 = dateTime6.toGregorianCalendar();
        org.joda.time.YearMonthDay yearMonthDay15 = dateTime6.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((-1L), dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone18.isLocalDateTimeGap(localDateTime20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime24 = dateTime22.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime24.toMutableDateTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime24.getZone();
        org.joda.time.DateTime dateTime28 = yearMonthDay15.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration2, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime31 = dateTime24.minus(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and gregorianCalendar14", (calendar8.compareTo(gregorianCalendar14) == 0) == calendar8.equals(gregorianCalendar14));
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test88");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        java.util.GregorianCalendar gregorianCalendar3 = dateTime2.toGregorianCalendar();
        int int4 = dateTime2.getHourOfDay();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.toLanguageTag();
        java.util.Calendar calendar8 = dateTime2.toCalendar(locale6);
        org.joda.time.DateTime dateTime10 = dateTime2.plusHours((int) 'x');
        org.joda.time.Chronology chronology11 = dateTime2.getChronology();
        int int12 = dateTime2.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(4);
        org.joda.time.DateTime dateTime15 = dateTime2.toDateTime(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar3 and calendar8", (gregorianCalendar3.compareTo(calendar8) == 0) == gregorianCalendar3.equals(calendar8));
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test89");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime.Property property6 = dateTime3.millisOfDay();
        org.joda.time.DateTime.Property property7 = dateTime3.minuteOfHour();
        org.joda.time.DateTime dateTime9 = dateTime3.plusMillis((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        java.util.GregorianCalendar gregorianCalendar13 = dateTime12.toGregorianCalendar();
        int int14 = dateTime12.getHourOfDay();
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale16.toLanguageTag();
        java.util.Calendar calendar18 = dateTime12.toCalendar(locale16);
        org.joda.time.DateTime.Property property19 = dateTime12.minuteOfHour();
        org.joda.time.Days days20 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod21 = days20.toMutablePeriod();
        org.joda.time.Duration duration22 = days20.toStandardDuration();
        org.joda.time.Days days23 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod24 = days23.toMutablePeriod();
        org.joda.time.Duration duration25 = days23.toStandardDuration();
        boolean boolean26 = duration22.isLongerThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableDuration) duration25);
        org.joda.time.Days days32 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod33 = days32.toMutablePeriod();
        org.joda.time.Duration duration34 = days32.toStandardDuration();
        org.joda.time.PeriodType periodType35 = days32.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((-1L), dateTimeZone38);
        java.util.Locale locale40 = java.util.Locale.KOREAN;
        java.util.Calendar calendar41 = dateTime39.toCalendar(locale40);
        org.joda.time.DateTime dateTime43 = dateTime39.plusMillis((int) '4');
        org.joda.time.Chronology chronology44 = dateTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.hourOfHalfday();
        org.joda.time.Period period46 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType35, chronology44);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology44);
        org.joda.time.DateTimeField dateTimeField48 = chronology44.millisOfDay();
        org.joda.time.Interval interval49 = new org.joda.time.Interval((-259200000L), (long) '#', chronology44);
        boolean boolean50 = interval27.isBefore((org.joda.time.ReadableInterval) interval49);
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType52 = periodType51.withYearsRemoved();
        org.joda.time.Duration duration54 = org.joda.time.Duration.millis((long) (short) -1);
        long long55 = duration54.getStandardMinutes();
        org.joda.time.PeriodType periodType58 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType59 = periodType58.withYearsRemoved();
        org.joda.time.Days days62 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod63 = days62.toMutablePeriod();
        org.joda.time.Duration duration64 = days62.toStandardDuration();
        org.joda.time.PeriodType periodType65 = days62.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((-1L), dateTimeZone68);
        java.util.Locale locale70 = java.util.Locale.KOREAN;
        java.util.Calendar calendar71 = dateTime69.toCalendar(locale70);
        org.joda.time.DateTime dateTime73 = dateTime69.plusMillis((int) '4');
        org.joda.time.Chronology chronology74 = dateTime69.getChronology();
        org.joda.time.DateTimeField dateTimeField75 = chronology74.hourOfHalfday();
        org.joda.time.Period period76 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType65, chronology74);
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime(chronology74);
        org.joda.time.DateTimeField dateTimeField78 = chronology74.millisOfDay();
        org.joda.time.Period period79 = new org.joda.time.Period((long) (byte) 1, (long) 1, periodType58, chronology74);
        org.joda.time.Period period80 = duration54.toPeriod(chronology74);
        org.joda.time.DateTimeField dateTimeField81 = chronology74.hourOfDay();
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((java.lang.Object) interval27, periodType52, chronology74);
        org.joda.time.DateTimeField dateTimeField83 = chronology74.minuteOfHour();
        int int84 = dateTimeField83.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = dateTimeField83.getType();
        int int86 = dateTime9.get(dateTimeFieldType85);
        org.joda.time.DateTime dateTime88 = dateTime9.withMinuteOfHour(40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar13 and calendar18", (gregorianCalendar13.compareTo(calendar18) == 0) == gregorianCalendar13.equals(calendar18));
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test90");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        org.joda.time.Interval interval3 = interval2.toInterval();
        org.joda.time.MutableInterval mutableInterval4 = interval3.toMutableInterval();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((-1L), dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone7.isLocalDateTimeGap(localDateTime9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime13 = dateTime11.withHourOfDay(0);
        org.joda.time.DateTime dateTime15 = dateTime11.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime17 = dateTime11.withWeekyear((int) (byte) 0);
        boolean boolean18 = interval3.contains((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = interval3.getEnd();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((-1L), dateTimeZone22);
        java.util.Locale locale24 = java.util.Locale.KOREAN;
        java.util.Calendar calendar25 = dateTime23.toCalendar(locale24);
        int int26 = dateTime23.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime23.getZone();
        org.joda.time.TimeOfDay timeOfDay28 = dateTime23.toTimeOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((-1L), dateTimeZone31);
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.util.Calendar calendar34 = dateTime32.toCalendar(locale33);
        org.joda.time.DateTime dateTime36 = dateTime32.plusMillis((int) '4');
        org.joda.time.DateTime dateTime37 = dateTime32.toDateTimeISO();
        org.joda.time.DateTime.Property property38 = dateTime32.weekyear();
        org.joda.time.Duration duration40 = org.joda.time.Duration.millis((long) (short) -1);
        long long41 = duration40.getMillis();
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType43 = periodType42.withMinutesRemoved();
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableDuration) duration40, periodType42);
        org.joda.time.MutableInterval mutableInterval45 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadablePeriod) period44);
        mutableInterval45.setEndMillis(0L);
        long long48 = mutableInterval45.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval49 = mutableInterval45.toMutableInterval();
        boolean boolean50 = interval3.isBefore((org.joda.time.ReadableInterval) mutableInterval45);
        org.joda.time.Days days55 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod56 = days55.toMutablePeriod();
        org.joda.time.Duration duration57 = days55.toStandardDuration();
        org.joda.time.PeriodType periodType58 = days55.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((-1L), dateTimeZone61);
        java.util.Locale locale63 = java.util.Locale.KOREAN;
        java.util.Calendar calendar64 = dateTime62.toCalendar(locale63);
        org.joda.time.DateTime dateTime66 = dateTime62.plusMillis((int) '4');
        org.joda.time.Chronology chronology67 = dateTime62.getChronology();
        org.joda.time.DateTimeField dateTimeField68 = chronology67.hourOfHalfday();
        org.joda.time.Period period69 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType58, chronology67);
        org.joda.time.DateTimeField dateTimeField70 = chronology67.weekyearOfCentury();
        org.joda.time.DurationField durationField71 = chronology67.millis();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) 948, (long) 888, chronology67);
        mutablePeriod72.addDays(135);
        boolean boolean75 = mutableInterval45.equals((java.lang.Object) mutablePeriod72);
        mutablePeriod72.add(128, 360, 25977556, 38090, 292278993, 434, 8, (-5));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime19", (dateTime11.compareTo(dateTime19) == 0) == dateTime11.equals(dateTime19));
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test91");
        org.joda.time.MutableInterval mutableInterval0 = new org.joda.time.MutableInterval();
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType2 = periodType1.withMillisRemoved();
        org.joda.time.Period period3 = mutableInterval0.toPeriod(periodType1);
        org.joda.time.DateTime dateTime4 = mutableInterval0.getEnd();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((-1L), dateTimeZone7);
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.util.Calendar calendar10 = dateTime8.toCalendar(locale9);
        org.joda.time.DateTime dateTime12 = dateTime8.plusMillis((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime8.toDateTimeISO();
        org.joda.time.Instant instant14 = dateTime8.toInstant();
        org.joda.time.Instant instant15 = instant14.toInstant();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((-1L), dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone18.isLocalDateTimeGap(localDateTime20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime24 = dateTime22.withHourOfDay(0);
        boolean boolean25 = instant15.isEqual((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Duration duration27 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Instant instant29 = instant15.withDurationAdded((org.joda.time.ReadableDuration) duration27, (-1));
        boolean boolean31 = instant29.isBefore((long) (short) 10);
        org.joda.time.Period period33 = org.joda.time.Period.weeks((int) '#');
        org.joda.time.Period period35 = period33.withWeeks((int) (short) -1);
        org.joda.time.Period period37 = period33.withDays(0);
        org.joda.time.Period period39 = period33.withWeeks(86399);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) instant29, (org.joda.time.ReadablePeriod) period39);
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.Interval interval42 = interval41.toInterval();
        boolean boolean43 = mutableInterval0.isBefore((org.joda.time.ReadableInterval) interval42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant29", (dateTime4.compareTo(instant29) == 0) == dateTime4.equals(instant29));
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test92");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.Instant instant6 = dateTime3.toInstant();
        org.joda.time.Instant instant7 = instant6.toInstant();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardMinutes((long) 3);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant6, (org.joda.time.ReadableDuration) duration9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((-1L), dateTimeZone13);
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Calendar calendar16 = dateTime14.toCalendar(locale15);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMillis((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime14.toDateTimeISO();
        org.joda.time.DateTime.Property property20 = dateTime14.weekyear();
        org.joda.time.DateTime.Property property21 = dateTime14.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        java.util.GregorianCalendar gregorianCalendar25 = dateTime24.toGregorianCalendar();
        int int26 = dateTime24.getHourOfDay();
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.util.Locale locale28 = locale27.stripExtensions();
        java.lang.String str29 = locale28.toLanguageTag();
        java.util.Calendar calendar30 = dateTime24.toCalendar(locale28);
        org.joda.time.DateTime.Property property31 = dateTime24.minuteOfHour();
        org.joda.time.Days days32 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod33 = days32.toMutablePeriod();
        org.joda.time.Duration duration34 = days32.toStandardDuration();
        org.joda.time.Days days35 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod36 = days35.toMutablePeriod();
        org.joda.time.Duration duration37 = days35.toStandardDuration();
        boolean boolean38 = duration34.isLongerThan((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.Duration duration41 = duration37.minus((long) 2022);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Interval interval44 = new org.joda.time.Interval(obj42, chronology43);
        long long45 = interval44.getEndMillis();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((-1L), dateTimeZone48);
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.util.Calendar calendar51 = dateTime49.toCalendar(locale50);
        org.joda.time.DateTime dateTime53 = dateTime49.plusMillis((int) '4');
        org.joda.time.DateTime dateTime54 = dateTime49.toDateTimeISO();
        org.joda.time.Instant instant55 = dateTime49.toInstant();
        org.joda.time.Instant instant56 = instant55.toInstant();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((-1L), dateTimeZone59);
        java.util.Locale locale61 = java.util.Locale.KOREAN;
        java.util.Calendar calendar62 = dateTime60.toCalendar(locale61);
        org.joda.time.DateTime dateTime64 = dateTime60.plusMillis((int) '4');
        org.joda.time.DateTime dateTime65 = dateTime60.toDateTimeISO();
        org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType67 = periodType66.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant55, (org.joda.time.ReadableInstant) dateTime65, periodType66);
        org.joda.time.Period period69 = interval44.toPeriod(periodType66);
        org.joda.time.Period period70 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableDuration) duration41, periodType66);
        org.joda.time.Instant instant71 = instant6.plus((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Instant instant74 = instant71.withDurationAdded((long) 457, 841);
        org.joda.time.Instant instant76 = instant71.plus((long) 980);
        long long77 = instant76.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar25 and calendar30", (gregorianCalendar25.compareTo(calendar30) == 0) == gregorianCalendar25.equals(calendar30));
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test93");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ONE;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.ONE;
        org.joda.time.Seconds seconds2 = seconds0.minus(seconds1);
        org.joda.time.Period period3 = seconds2.toPeriod();
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds5 = seconds4.negated();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.Seconds seconds8 = seconds6.dividedBy(23);
        org.joda.time.Seconds seconds9 = seconds4.plus(seconds8);
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds11 = seconds10.negated();
        org.joda.time.Seconds seconds12 = seconds8.minus(seconds10);
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.ONE;
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.ONE;
        org.joda.time.Seconds seconds15 = seconds13.minus(seconds14);
        org.joda.time.Duration duration16 = seconds13.toStandardDuration();
        org.joda.time.Seconds seconds17 = seconds13.negated();
        boolean boolean18 = seconds12.isGreaterThan(seconds17);
        org.joda.time.Seconds seconds20 = seconds12.multipliedBy(0);
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.THREE;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (byte) 10);
        int int24 = period23.getSeconds();
        org.joda.time.Period period26 = period23.minusHours(100);
        org.joda.time.Period period28 = period23.minusSeconds((int) '4');
        org.joda.time.Period period30 = period23.withHours(10);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        boolean boolean35 = dateTime33.isAfter((long) (byte) 10);
        org.joda.time.Interval interval36 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period30, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        java.util.GregorianCalendar gregorianCalendar40 = dateTime39.toGregorianCalendar();
        int int41 = dateTime39.getHourOfDay();
        java.util.Locale locale42 = java.util.Locale.CHINA;
        java.util.Locale locale43 = locale42.stripExtensions();
        java.lang.String str44 = locale43.toLanguageTag();
        java.util.Calendar calendar45 = dateTime39.toCalendar(locale43);
        org.joda.time.DateTime dateTime47 = dateTime39.plusHours((int) 'x');
        boolean boolean48 = interval36.isBefore((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Interval interval50 = interval36.withStartMillis((long) '#');
        org.joda.time.Seconds seconds51 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval36);
        boolean boolean52 = seconds21.isLessThan(seconds51);
        org.joda.time.Seconds seconds53 = seconds20.plus(seconds51);
        org.joda.time.Seconds seconds55 = seconds51.minus(0);
        org.joda.time.Seconds seconds56 = seconds2.minus(seconds51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar40 and calendar45", (gregorianCalendar40.compareTo(calendar45) == 0) == gregorianCalendar40.equals(calendar45));
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test94");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod1 = days0.toMutablePeriod();
        mutablePeriod1.setSeconds((int) (byte) 0);
        mutablePeriod1.setDays((int) 'a');
        mutablePeriod1.setDays((int) '4');
        org.joda.time.PeriodType periodType8 = mutablePeriod1.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        java.util.GregorianCalendar gregorianCalendar12 = dateTime11.toGregorianCalendar();
        int int13 = dateTime11.getHourOfDay();
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale15.toLanguageTag();
        java.util.Calendar calendar17 = dateTime11.toCalendar(locale15);
        org.joda.time.DateTime.Property property18 = dateTime11.minuteOfHour();
        org.joda.time.Days days19 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod20 = days19.toMutablePeriod();
        org.joda.time.Duration duration21 = days19.toStandardDuration();
        org.joda.time.Days days22 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod23 = days22.toMutablePeriod();
        org.joda.time.Duration duration24 = days22.toStandardDuration();
        boolean boolean25 = duration21.isLongerThan((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardMinutes((long) (byte) -1);
        org.joda.time.Duration duration29 = duration24.plus((org.joda.time.ReadableDuration) duration28);
        mutablePeriod1.setPeriod((org.joda.time.ReadableDuration) duration29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((-1L), dateTimeZone33);
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.util.Calendar calendar36 = dateTime34.toCalendar(locale35);
        int int37 = dateTime34.getSecondOfMinute();
        org.joda.time.DateTime.Property property38 = dateTime34.hourOfDay();
        org.joda.time.DurationField durationField39 = property38.getDurationField();
        java.util.Locale locale40 = null;
        java.lang.String str41 = property38.getAsText(locale40);
        org.joda.time.DateTime dateTime43 = property38.addToCopy(6);
        org.joda.time.DateTime dateTime45 = dateTime43.minusSeconds(4);
        org.joda.time.DateTime dateTime47 = dateTime45.plusDays(348);
        org.joda.time.Interval interval48 = duration29.toIntervalFrom((org.joda.time.ReadableInstant) dateTime47);
        java.util.Locale locale52 = new java.util.Locale("hi!", "hi!", "weekOfWeekyear");
        java.util.Calendar calendar53 = dateTime47.toCalendar(locale52);
        org.joda.time.DateTime.Property property54 = dateTime47.minuteOfDay();
        int int55 = dateTime47.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar12 and calendar17", (gregorianCalendar12.compareTo(calendar17) == 0) == gregorianCalendar12.equals(calendar17));
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test95");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod1 = days0.toMutablePeriod();
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod3 = days2.toMutablePeriod();
        mutablePeriod3.setSeconds((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval6 = null;
        mutablePeriod3.add(readableInterval6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.eras();
        int int9 = mutablePeriod3.get(durationFieldType8);
        boolean boolean10 = mutablePeriod1.isSupported(durationFieldType8);
        mutablePeriod1.addSeconds((int) '#');
        mutablePeriod1.addSeconds((int) (short) 0);
        mutablePeriod1.setYears(7);
        mutablePeriod1.setMonths((-100));
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod1);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        java.util.GregorianCalendar gregorianCalendar23 = dateTime22.toGregorianCalendar();
        int int24 = dateTime22.getHourOfDay();
        java.util.Locale locale25 = java.util.Locale.CHINA;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.lang.String str27 = locale26.toLanguageTag();
        java.util.Calendar calendar28 = dateTime22.toCalendar(locale26);
        org.joda.time.DateTime dateTime30 = dateTime22.plusHours((int) 'x');
        org.joda.time.Chronology chronology31 = dateTime22.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = dateTime22.toLocalDateTime();
        org.joda.time.DateTime dateTime34 = dateTime22.withYear((-457087));
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        java.util.GregorianCalendar gregorianCalendar38 = dateTime37.toGregorianCalendar();
        int int39 = dateTime37.getHourOfDay();
        java.util.Locale locale40 = java.util.Locale.CHINA;
        java.util.Locale locale41 = locale40.stripExtensions();
        java.lang.String str42 = locale41.toLanguageTag();
        java.util.Calendar calendar43 = dateTime37.toCalendar(locale41);
        org.joda.time.DateTime.Property property44 = dateTime37.minuteOfHour();
        boolean boolean45 = property44.isLeap();
        org.joda.time.DateTime dateTime46 = property44.roundCeilingCopy();
        org.joda.time.DurationField durationField47 = property44.getLeapDurationField();
        org.joda.time.DateTime dateTime48 = property44.roundFloorCopy();
        org.joda.time.DateTime dateTime50 = dateTime48.plusYears((-100));
        int int51 = dateTime50.getWeekyear();
        mutablePeriod19.setPeriod((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTime.Property property53 = dateTime22.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar23 and calendar28", (gregorianCalendar23.compareTo(calendar28) == 0) == gregorianCalendar23.equals(calendar28));
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test96");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        java.util.GregorianCalendar gregorianCalendar3 = dateTime2.toGregorianCalendar();
        int int4 = dateTime2.getHourOfDay();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.toLanguageTag();
        java.util.Calendar calendar8 = dateTime2.toCalendar(locale6);
        org.joda.time.DateTime.Property property9 = dateTime2.minuteOfHour();
        org.joda.time.DateTime dateTime11 = property9.addToCopy(10);
        java.util.Locale locale12 = java.util.Locale.CHINA;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.lang.String str14 = locale12.getISO3Language();
        java.lang.String str15 = locale12.getDisplayScript();
        java.lang.String str16 = property9.getAsShortText(locale12);
        java.util.Locale.setDefault(locale12);
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.lang.String str19 = locale12.getDisplayScript(locale18);
        java.util.Set<java.lang.String> strSet20 = locale18.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar3 and calendar8", (gregorianCalendar3.compareTo(calendar8) == 0) == gregorianCalendar3.equals(calendar8));
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test97");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(0L, chronology1);
        int int3 = period2.getWeeks();
        org.joda.time.PeriodType periodType4 = period2.getPeriodType();
        org.joda.time.Duration duration5 = period2.toStandardDuration();
        long long6 = duration5.getStandardDays();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) instant8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((-1L), dateTimeZone12);
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.util.Calendar calendar15 = dateTime13.toCalendar(locale14);
        org.joda.time.DateTime dateTime17 = dateTime13.plusMillis((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime13.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        boolean boolean23 = dateTime21.isAfter((long) (byte) 10);
        org.joda.time.Minutes minutes24 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Duration duration25 = minutes24.toStandardDuration();
        org.joda.time.Duration duration26 = duration25.toDuration();
        org.joda.time.Instant instant28 = instant8.withDurationAdded((org.joda.time.ReadableDuration) duration25, 108);
        long long29 = duration25.getStandardSeconds();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((-1L), dateTimeZone32);
        int int34 = dateTime33.getHourOfDay();
        org.joda.time.DateTime dateTime36 = dateTime33.minusWeeks(59);
        org.joda.time.DateTime dateTime38 = dateTime33.withWeekOfWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((-1L), dateTimeZone41);
        int int43 = dateTime42.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone45);
        boolean boolean47 = dateTime42.isEqual((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.LocalDate localDate48 = dateTime42.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(6, 0);
        org.joda.time.DateTime dateTime52 = dateTime42.withZoneRetainFields(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(679);
        long long56 = dateTimeZone51.getMillisKeepLocal(dateTimeZone54, 1645513740L);
        java.lang.String str58 = dateTimeZone51.getShortName(63072000144L);
        org.joda.time.DateTime dateTime59 = dateTime38.toDateTime(dateTimeZone51);
        org.joda.time.DateTime.Property property60 = dateTime59.year();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration25, (org.joda.time.ReadableInstant) dateTime59);
        mutablePeriod61.addDays(26136);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and dateTime59", (dateTime38.compareTo(dateTime59) == 0) == dateTime38.equals(dateTime59));
    }

    @Test
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test98");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod1 = days0.toMutablePeriod();
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod3 = days2.toMutablePeriod();
        mutablePeriod3.setSeconds((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval6 = null;
        mutablePeriod3.add(readableInterval6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.eras();
        int int9 = mutablePeriod3.get(durationFieldType8);
        boolean boolean10 = mutablePeriod1.isSupported(durationFieldType8);
        mutablePeriod1.addSeconds((int) '#');
        mutablePeriod1.setValue(4, 69);
        mutablePeriod1.addHours((int) (byte) 100);
        org.joda.time.Days days19 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod20 = days19.toMutablePeriod();
        mutablePeriod20.addWeeks((int) (short) -1);
        mutablePeriod20.add((int) (short) 1, (int) '4', 2, (int) (short) -1, 2, (int) '4', 59, (int) 'a');
        org.joda.time.Days days35 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod36 = days35.toMutablePeriod();
        org.joda.time.Duration duration37 = days35.toStandardDuration();
        org.joda.time.PeriodType periodType38 = days35.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((-1L), dateTimeZone41);
        java.util.Locale locale43 = java.util.Locale.KOREAN;
        java.util.Calendar calendar44 = dateTime42.toCalendar(locale43);
        org.joda.time.DateTime dateTime46 = dateTime42.plusMillis((int) '4');
        org.joda.time.Chronology chronology47 = dateTime42.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.hourOfHalfday();
        org.joda.time.Period period49 = new org.joda.time.Period((long) 'a', (long) (byte) 0, periodType38, chronology47);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(chronology47);
        mutablePeriod20.setPeriod(1L, chronology47);
        mutablePeriod1.setPeriod((long) 5, chronology47);
        org.joda.time.DurationField durationField53 = chronology47.eras();
        org.joda.time.DateTimeField dateTimeField54 = chronology47.yearOfCentury();
        org.joda.time.DurationField durationField55 = chronology47.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField53, durationField55, and durationField53", !(durationField53.compareTo(durationField55) == 0) || (Math.signum(durationField53.compareTo(durationField53)) == Math.signum(durationField55.compareTo(durationField53))));
    }

    @Test
    public void test99() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test99");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-1L), dateTimeZone2);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((-1L), dateTimeZone11);
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.util.Calendar calendar14 = dateTime12.toCalendar(locale13);
        org.joda.time.DateTime dateTime16 = dateTime12.plusMillis((int) '4');
        org.joda.time.DateTime dateTime17 = dateTime12.toDateTimeISO();
        org.joda.time.Instant instant18 = dateTime12.toInstant();
        org.joda.time.Instant instant19 = instant18.toInstant();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((-1L), dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone22.isLocalDateTimeGap(localDateTime24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime28 = dateTime26.withHourOfDay(0);
        boolean boolean29 = instant19.isEqual((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Duration duration31 = org.joda.time.Duration.millis((-1L));
        org.joda.time.Instant instant33 = instant19.withDurationAdded((org.joda.time.ReadableDuration) duration31, (-1));
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((-1L), dateTimeZone36);
        java.util.Locale locale38 = java.util.Locale.KOREAN;
        java.util.Calendar calendar39 = dateTime37.toCalendar(locale38);
        org.joda.time.DateTime dateTime41 = dateTime37.plusMillis((int) '4');
        org.joda.time.DateTime dateTime42 = dateTime37.toDateTimeISO();
        org.joda.time.DateTime dateTime44 = dateTime42.plusMillis((int) '#');
        int int45 = instant33.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Days days46 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod47 = days46.toMutablePeriod();
        org.joda.time.Duration duration48 = days46.toStandardDuration();
        org.joda.time.Days days49 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod50 = days49.toMutablePeriod();
        org.joda.time.Duration duration51 = days49.toStandardDuration();
        boolean boolean52 = duration48.isLongerThan((org.joda.time.ReadableDuration) duration51);
        org.joda.time.Instant instant54 = instant33.withDurationAdded((org.joda.time.ReadableDuration) duration51, 10);
        org.joda.time.DateTime dateTime55 = dateTime8.plus((org.joda.time.ReadableDuration) duration51);
        org.joda.time.Days days56 = org.joda.time.Days.SIX;
        org.joda.time.MutablePeriod mutablePeriod57 = days56.toMutablePeriod();
        org.joda.time.Duration duration58 = days56.toStandardDuration();
        org.joda.time.PeriodType periodType59 = days56.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((-1L), dateTimeZone62);
        java.util.Locale locale64 = java.util.Locale.KOREAN;
        java.util.Calendar calendar65 = dateTime63.toCalendar(locale64);
        org.joda.time.DateTime dateTime67 = dateTime63.plusMillis((int) '4');
        org.joda.time.Chronology chronology68 = dateTime63.getChronology();
        org.joda.time.Period period69 = duration51.toPeriod(periodType59, chronology68);
        org.joda.time.DurationField durationField70 = chronology68.eras();
        org.joda.time.DurationField durationField71 = chronology68.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField70, durationField71, and durationField70", !(durationField70.compareTo(durationField71) == 0) || (Math.signum(durationField70.compareTo(durationField70)) == Math.signum(durationField71.compareTo(durationField70))));
    }
}

