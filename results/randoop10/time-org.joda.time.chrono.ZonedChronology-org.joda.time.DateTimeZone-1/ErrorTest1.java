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
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long8 = dateTimeZone6.previousTransition(100L);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfSecond((int) (byte) 0);
        int int13 = localDateTime2.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        long long17 = dateTimeZone14.convertLocalToUTC(100L, true);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime19 = localDateTime2.toDateTime(dateTimeZone14);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        long long23 = dateTimeZone21.previousTransition(0L);
        long long25 = dateTimeZone21.convertUTCToLocal(1L);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        long long30 = dateTimeZone21.getMillisKeepLocal(dateTimeZone28, (long) (-1));
        boolean boolean31 = dateTimeZone21.isFixed();
        org.joda.time.chrono.ZonedChronology zonedChronology32 = org.joda.time.chrono.ZonedChronology.getInstance(chronology20, dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology32.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology32.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology32.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone36 = zonedChronology32.getZone();
        org.joda.time.DurationField durationField37 = zonedChronology32.eras();
        org.joda.time.DurationField durationField38 = zonedChronology32.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField38, and durationField37", !(durationField37.compareTo(durationField38) == 0) || (Math.signum(durationField37.compareTo(durationField37)) == Math.signum(durationField38.compareTo(durationField37))));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.year();
        org.joda.time.Chronology chronology31 = zonedChronology28.withUTC();
        org.joda.time.DurationField durationField32 = zonedChronology28.days();
        org.joda.time.DurationField durationField33 = zonedChronology28.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField32", (durationField8.compareTo(durationField32) == 0) == durationField8.equals(durationField32));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        java.lang.String str32 = zonedChronology28.toString();
        java.lang.String str33 = zonedChronology28.toString();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.clockhourOfDay();
        long long39 = zonedChronology28.getDateTimeMillis(0, 1, (int) (byte) 1, 20);
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology28.weekOfWeekyear();
        org.joda.time.DurationField durationField41 = zonedChronology28.months();
        org.joda.time.DurationField durationField42 = zonedChronology28.millis();
        org.joda.time.DurationField durationField43 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField43, durationField8, and durationField19", !(durationField43.compareTo(durationField8) == 0) || (Math.signum(durationField43.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.secondOfDay();
        org.joda.time.DurationField durationField34 = zonedChronology28.millis();
        org.joda.time.DurationField durationField35 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField8, and durationField19", !(durationField35.compareTo(durationField8) == 0) || (Math.signum(durationField35.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.monthOfYear();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField34 = zonedChronology28.centuries();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.dayOfWeek();
        java.lang.String str36 = zonedChronology28.toString();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now();
        boolean boolean39 = dateTimeZone37.isLocalDateTimeGap(localDateTime38);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(0L, chronology41);
        java.lang.String str44 = localDateTime42.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = localDateTime42.toString(dateTimeFormatter45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime42.monthOfYear();
        org.joda.time.LocalDateTime localDateTime48 = property47.roundCeilingCopy();
        boolean boolean49 = dateTimeZone37.isLocalDateTimeGap(localDateTime48);
        org.joda.time.Chronology chronology50 = zonedChronology28.withZone(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology28.yearOfCentury();
        org.joda.time.DurationField durationField52 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology28.era();
        org.joda.time.DurationField durationField54 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField54, durationField8, and durationField19", !(durationField54.compareTo(durationField8) == 0) || (Math.signum(durationField54.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField32 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.centuryOfEra();
        org.joda.time.DurationField durationField35 = zonedChronology28.hours();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology28.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField35", (durationField19.compareTo(durationField35) == 0) == durationField19.equals(durationField35));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.weekyear();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(0L, chronology33);
        java.lang.String str36 = localDateTime34.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = localDateTime34.toString(dateTimeFormatter37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime34.monthOfYear();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.withHourOfDay(0);
        java.util.Date date43 = localDateTime40.toDate();
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.fromDateFields(date43);
        long long46 = zonedChronology28.set((org.joda.time.ReadablePartial) localDateTime44, 100L);
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology28.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now();
        boolean boolean51 = dateTimeZone49.isLocalDateTimeGap(localDateTime50);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(0L, chronology53);
        java.lang.String str56 = localDateTime54.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = null;
        java.lang.String str58 = localDateTime54.toString(dateTimeFormatter57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime54.monthOfYear();
        org.joda.time.LocalDateTime localDateTime60 = property59.roundCeilingCopy();
        boolean boolean61 = dateTimeZone49.isLocalDateTimeGap(localDateTime60);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone49);
        org.joda.time.Chronology chronology63 = zonedChronology28.withZone(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology28.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology28.weekyear();
        org.joda.time.DurationField durationField67 = zonedChronology28.weeks();
        java.util.TimeZone timeZone69 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forTimeZone(timeZone69);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forTimeZone(timeZone69);
        org.joda.time.Chronology chronology72 = zonedChronology28.withZone(dateTimeZone71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField67", (durationField20.compareTo(durationField67) == 0) == durationField20.equals(durationField67));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        java.util.Locale locale3 = java.util.Locale.US;
        boolean boolean4 = localDateTime2.equals((java.lang.Object) locale3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.dayOfWeek();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minus(readableDuration6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(locale9);
        java.util.Locale locale13 = new java.util.Locale("\u65e5\u672c", "hi!");
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale13.getDisplayLanguage(locale14);
        java.lang.String str16 = locale9.getDisplayName(locale13);
        java.util.Locale locale17 = java.util.Locale.ITALY;
        java.lang.String str18 = locale13.getDisplayScript(locale17);
        int int19 = property8.getMaximumTextLength(locale13);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(0L, chronology21);
        int int23 = localDateTime22.getWeekyear();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withMillisOfSecond(100);
        org.joda.time.Chronology chronology26 = localDateTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfCentury();
        org.joda.time.DurationField durationField28 = chronology26.days();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        long long31 = dateTimeZone29.previousTransition(100L);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withMillisOfSecond((int) (byte) 0);
        int[] intArray37 = chronology26.get((org.joda.time.ReadablePartial) localDateTime33, (long) (-1));
        org.joda.time.DateTimeField dateTimeField38 = chronology26.millisOfDay();
        org.joda.time.DurationField durationField39 = chronology26.hours();
        org.joda.time.DurationField durationField40 = chronology26.weeks();
        java.util.TimeZone timeZone42 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        long long47 = dateTimeZone43.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology48 = org.joda.time.chrono.ZonedChronology.getInstance(chronology26, dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology48.yearOfEra();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology48.monthOfYear();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology48.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology48.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology48.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField54 = zonedChronology48.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField55 = zonedChronology48.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone56 = zonedChronology48.getZone();
        boolean boolean57 = property8.equals((java.lang.Object) zonedChronology48);
        org.joda.time.DurationField durationField58 = zonedChronology48.millis();
        java.lang.String str59 = zonedChronology48.toString();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology48.dayOfMonth();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime(0L, chronology62);
        java.util.Locale locale64 = java.util.Locale.US;
        boolean boolean65 = localDateTime63.equals((java.lang.Object) locale64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime63.withYearOfEra((int) (byte) 1);
        int int68 = localDateTime67.getEra();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime67.plusSeconds((int) '4');
        int int71 = localDateTime67.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime67.plusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.withYearOfEra(1971);
        int[] intArray76 = localDateTime73.getValues();
        int[] intArray78 = zonedChronology48.get((org.joda.time.ReadablePartial) localDateTime73, 886718880001971L);
        org.joda.time.DurationField durationField79 = zonedChronology48.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField79, durationField28, and durationField39", !(durationField79.compareTo(durationField28) == 0) || (Math.signum(durationField79.compareTo(durationField39)) == Math.signum(durationField28.compareTo(durationField39))));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withYearOfEra(1970);
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(0L, chronology8);
        int int10 = localDateTime9.getWeekyear();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfEra(1970);
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        int int14 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(0L, chronology16);
        java.lang.String str19 = localDateTime17.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = localDateTime17.toString(dateTimeFormatter20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime17.monthOfYear();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withMillisOfDay(100);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withSecondOfMinute((int) '4');
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        long long29 = dateTimeZone27.previousTransition(100L);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withHourOfDay((int) (short) 0);
        int int34 = localDateTime33.getEra();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.minusMillis((int) (short) 1);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(0L, chronology38);
        java.lang.String str41 = localDateTime39.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = localDateTime39.toString(dateTimeFormatter42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime39.monthOfYear();
        org.joda.time.Interval interval45 = property44.toInterval();
        org.joda.time.LocalDateTime localDateTime47 = property44.addWrapFieldToCopy((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property44.getFieldType();
        org.joda.time.LocalDateTime.Property property49 = localDateTime36.property(dateTimeFieldType48);
        int int50 = localDateTime24.indexOf(dateTimeFieldType48);
        boolean boolean51 = dateTime6.isSupported(dateTimeFieldType48);
        org.joda.time.DateTimeZone dateTimeZone52 = dateTime6.getZone();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.UTC;
        long long56 = dateTimeZone53.convertLocalToUTC(100L, true);
        java.lang.String str58 = dateTimeZone53.getName(1L);
        java.util.Locale locale60 = null;
        java.lang.String str61 = dateTimeZone53.getShortName((long) (short) 100, locale60);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone53);
        long long64 = dateTimeZone52.getMillisKeepLocal(dateTimeZone53, (long) 23);
        java.util.TimeZone timeZone65 = dateTimeZone53.toTimeZone();
        java.util.TimeZone timeZone67 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        java.lang.String str68 = timeZone67.getID();
        java.time.ZoneId zoneId69 = timeZone67.toZoneId();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime(0L, chronology71);
        int int73 = localDateTime72.getWeekyear();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime72.withYearOfEra(1970);
        org.joda.time.DateTime dateTime76 = localDateTime75.toDateTime();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime(0L, chronology78);
        int int80 = localDateTime79.getWeekyear();
        org.joda.time.LocalDateTime localDateTime82 = localDateTime79.withYearOfEra(1970);
        org.joda.time.DateTime dateTime83 = localDateTime82.toDateTime();
        int int84 = dateTime76.compareTo((org.joda.time.ReadableInstant) dateTime83);
        java.util.TimeZone timeZone86 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        boolean boolean87 = dateTime83.equals((java.lang.Object) timeZone86);
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.forTimeZone(timeZone86);
        timeZone86.setRawOffset((int) (short) 0);
        boolean boolean91 = timeZone67.hasSameRules(timeZone86);
        java.util.TimeZone timeZone93 = java.util.TimeZone.getTimeZone("+00:00");
        timeZone93.setID("ISOChronology[UTC]");
        boolean boolean96 = timeZone67.hasSameRules(timeZone93);
        boolean boolean97 = timeZone65.hasSameRules(timeZone67);
        java.lang.Object obj98 = timeZone65.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime76", (dateTime6.compareTo(dateTime76) == 0) == dateTime6.equals(dateTime76));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.dayOfWeek();
        org.joda.time.DurationField durationField32 = zonedChronology28.halfdays();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        long long36 = dateTimeZone33.convertLocalToUTC(100L, true);
        java.lang.String str38 = dateTimeZone33.getName(1L);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone33.getShortName((long) (short) 100, locale40);
        java.lang.String str42 = dateTimeZone33.getID();
        java.lang.String str44 = dateTimeZone33.getShortName(36060093L);
        org.joda.time.Chronology chronology45 = zonedChronology28.withZone(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology28.hourOfDay();
        org.joda.time.DurationField durationField47 = zonedChronology28.months();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis(86399999);
        long long51 = dateTimeZone49.convertUTCToLocal(10371600000L);
        org.joda.time.chrono.ZonedChronology zonedChronology52 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology28, dateTimeZone49);
        org.joda.time.DurationField durationField53 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField53, durationField8, and durationField19", !(durationField53.compareTo(durationField8) == 0) || (Math.signum(durationField53.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        long long32 = dateTimeZone30.previousTransition(100L);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(0L, chronology36);
        int int38 = localDateTime37.getWeekyear();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withYearOfEra(1970);
        org.joda.time.DateTime dateTime41 = localDateTime40.toDateTime();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(0L, chronology43);
        int int45 = localDateTime44.getWeekyear();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.withYearOfEra(1970);
        org.joda.time.DateTime dateTime48 = localDateTime47.toDateTime();
        int int49 = dateTime41.compareTo((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime50 = localDateTime34.toDateTime((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime34.plus(readableDuration51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.withPeriodAdded(readablePeriod53, (int) (byte) 10);
        int[] intArray57 = zonedChronology28.get((org.joda.time.ReadablePartial) localDateTime52, (long) (-1));
        java.lang.String str58 = zonedChronology28.toString();
        org.joda.time.DateTimeZone dateTimeZone59 = zonedChronology28.getZone();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField61 = zonedChronology28.weekyears();
        org.joda.time.DurationField durationField62 = zonedChronology28.weekyears();
        org.joda.time.DurationField durationField63 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField63, durationField8, and durationField19", !(durationField63.compareTo(durationField8) == 0) || (Math.signum(durationField63.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology28);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(0L, chronology33);
        java.lang.String str36 = localDateTime34.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = localDateTime34.toString(dateTimeFormatter37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime34.monthOfYear();
        org.joda.time.Interval interval40 = property39.toInterval();
        long long41 = property39.remainder();
        org.joda.time.LocalDateTime localDateTime42 = property39.roundHalfFloorCopy();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plus(readableDuration43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime42.dayOfMonth();
        int[] intArray47 = zonedChronology28.get((org.joda.time.ReadablePartial) localDateTime42, 11L);
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology28.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology28.dayOfMonth();
        org.joda.time.DurationField durationField50 = zonedChronology28.months();
        org.joda.time.DurationField durationField51 = zonedChronology28.hours();
        org.joda.time.DurationField durationField52 = zonedChronology28.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField51", (durationField19.compareTo(durationField51) == 0) == durationField19.equals(durationField51));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = zonedChronology28.getZone();
        org.joda.time.DurationField durationField36 = zonedChronology28.hours();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology28.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField36", (durationField19.compareTo(durationField36) == 0) == durationField19.equals(durationField36));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        java.lang.String str32 = zonedChronology28.toString();
        java.lang.String str33 = zonedChronology28.toString();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.weekOfWeekyear();
        java.util.TimeZone timeZone37 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        java.lang.String str38 = timeZone37.getID();
        int int39 = timeZone37.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.Chronology chronology41 = zonedChronology28.withZone(dateTimeZone40);
        org.joda.time.DurationField durationField42 = zonedChronology28.weeks();
        org.joda.time.DurationField durationField43 = zonedChronology28.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField43", (durationField20.compareTo(durationField43) == 0) == durationField20.equals(durationField43));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.centuryOfEra();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(0L, chronology36);
        int int38 = localDateTime37.getWeekyear();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withMillisOfSecond(100);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        long long43 = dateTimeZone41.previousTransition(100L);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withMillisOfSecond((int) (byte) 0);
        int int48 = localDateTime37.compareTo((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        long long52 = dateTimeZone49.convertLocalToUTC(100L, true);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.DateTime dateTime54 = localDateTime37.toDateTime(dateTimeZone49);
        org.joda.time.Chronology chronology55 = dateTime54.getChronology();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.UTC;
        long long58 = dateTimeZone56.previousTransition(0L);
        long long60 = dateTimeZone56.convertUTCToLocal(1L);
        java.util.TimeZone timeZone62 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forTimeZone(timeZone62);
        long long65 = dateTimeZone56.getMillisKeepLocal(dateTimeZone63, (long) (-1));
        boolean boolean66 = dateTimeZone56.isFixed();
        org.joda.time.chrono.ZonedChronology zonedChronology67 = org.joda.time.chrono.ZonedChronology.getInstance(chronology55, dateTimeZone56);
        java.lang.String str68 = zonedChronology67.toString();
        org.joda.time.DurationField durationField69 = zonedChronology67.days();
        org.joda.time.DateTimeZone dateTimeZone70 = zonedChronology67.getZone();
        org.joda.time.Chronology chronology71 = zonedChronology28.withZone(dateTimeZone70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField69", (durationField8.compareTo(durationField69) == 0) == durationField8.equals(durationField69));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 0);
        boolean boolean34 = dateTimeZone33.isFixed();
        org.joda.time.Chronology chronology35 = zonedChronology28.withZone(dateTimeZone33);
        org.joda.time.DurationField durationField36 = zonedChronology28.months();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(0L, chronology38);
        java.lang.String str41 = localDateTime39.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = localDateTime39.toString(dateTimeFormatter42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime39.monthOfYear();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime39.withMillisOfDay(100);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.withSecondOfMinute((int) '4');
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusWeeks(999);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(0L, chronology52);
        int int54 = localDateTime53.getWeekyear();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.withYearOfEra(1970);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.withDayOfMonth(10);
        int int61 = localDateTime58.getEra();
        int[] intArray62 = localDateTime58.getValues();
        zonedChronology28.validate((org.joda.time.ReadablePartial) localDateTime48, intArray62);
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology28.millisOfDay();
        org.joda.time.DurationField durationField66 = zonedChronology28.weeks();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.Chronology chronology68 = zonedChronology28.withZone(dateTimeZone67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField66", (durationField20.compareTo(durationField66) == 0) == durationField20.equals(durationField66));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        java.lang.String str32 = zonedChronology28.toString();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.millisOfDay();
        org.joda.time.DurationField durationField34 = zonedChronology28.days();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField34", (durationField8.compareTo(durationField34) == 0) == durationField8.equals(durationField34));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        java.lang.String str32 = zonedChronology28.toString();
        java.lang.String str33 = zonedChronology28.toString();
        long long37 = zonedChronology28.add((long) 9, 35L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology28.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology28.dayOfYear();
        long long44 = zonedChronology28.add(840L, (long) 32, (int) (byte) 0);
        org.joda.time.DurationField durationField45 = zonedChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology28.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField45", (durationField20.compareTo(durationField45) == 0) == durationField20.equals(durationField45));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.era();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField32 = zonedChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField32", (durationField20.compareTo(durationField32) == 0) == durationField20.equals(durationField32));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.halfdays();
        boolean boolean32 = zonedChronology28.equals((java.lang.Object) "1970-01-01T00:00:00.100");
        java.lang.String str33 = zonedChronology28.toString();
        long long37 = zonedChronology28.add(1900L, 36060000L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology28.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        long long42 = zonedChronology28.add(readablePeriod39, 23L, 42);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        long long46 = zonedChronology28.add(readablePeriod43, (-60518361599999L), (-174585600));
        org.joda.time.DurationField durationField47 = zonedChronology28.days();
        org.joda.time.DurationField durationField48 = zonedChronology28.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField47", (durationField8.compareTo(durationField47) == 0) == durationField8.equals(durationField47));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        long long33 = dateTimeZone31.previousTransition(100L);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology34);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(0L, chronology37);
        int int39 = localDateTime38.getWeekyear();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withYearOfEra(1970);
        org.joda.time.DateTime dateTime42 = localDateTime41.toDateTime();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(0L, chronology44);
        int int46 = localDateTime45.getWeekyear();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withYearOfEra(1970);
        org.joda.time.DateTime dateTime49 = localDateTime48.toDateTime();
        int int50 = dateTime42.compareTo((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime dateTime51 = localDateTime35.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime35.plus(readableDuration52);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(0L, chronology55);
        java.util.Locale locale57 = java.util.Locale.US;
        boolean boolean58 = localDateTime56.equals((java.lang.Object) locale57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime56.dayOfWeek();
        int int60 = localDateTime56.getDayOfWeek();
        int int61 = localDateTime35.compareTo((org.joda.time.ReadablePartial) localDateTime56);
        int[] intArray63 = zonedChronology28.get((org.joda.time.ReadablePartial) localDateTime56, (long) 12);
        java.lang.String str64 = zonedChronology28.toString();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology28.weekyearOfCentury();
        org.joda.time.DurationField durationField67 = zonedChronology28.days();
        org.joda.time.DateTimeField dateTimeField68 = zonedChronology28.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField67", (durationField8.compareTo(durationField67) == 0) == durationField8.equals(durationField67));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        java.lang.String str32 = zonedChronology28.toString();
        java.lang.String str33 = zonedChronology28.toString();
        long long37 = zonedChronology28.add((long) 9, 35L, (int) (short) 1);
        org.joda.time.Chronology chronology38 = zonedChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology28.hourOfDay();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology28.millisOfDay();
        long long44 = zonedChronology28.add((long) 40, 22984L, 86399999);
        org.joda.time.DateTimeZone dateTimeZone45 = zonedChronology28.getZone();
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet47 = locale46.getUnicodeLocaleAttributes();
        boolean boolean48 = strSet47.isEmpty();
        boolean boolean49 = strSet47.isEmpty();
        strSet47.clear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(0L, chronology52);
        int int54 = localDateTime53.getWeekyear();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.withYearOfEra(1970);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.withMillisOfSecond(0);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.UTC;
        long long63 = dateTimeZone61.previousTransition(100L);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology64);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(0L, chronology67);
        int int69 = localDateTime68.getWeekyear();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime68.withYearOfEra(1970);
        org.joda.time.DateTime dateTime72 = localDateTime71.toDateTime();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime(0L, chronology74);
        int int76 = localDateTime75.getWeekyear();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime75.withYearOfEra(1970);
        org.joda.time.DateTime dateTime79 = localDateTime78.toDateTime();
        int int80 = dateTime72.compareTo((org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.DateTime dateTime81 = localDateTime65.toDateTime((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.ReadableDuration readableDuration82 = null;
        org.joda.time.LocalDateTime localDateTime83 = localDateTime65.plus(readableDuration82);
        boolean boolean84 = localDateTime58.isAfter((org.joda.time.ReadablePartial) localDateTime65);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime58.minusDays(2022);
        org.joda.time.LocalDateTime localDateTime88 = localDateTime86.minusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime90 = localDateTime86.minusMonths((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType91 = null;
        boolean boolean92 = localDateTime86.isSupported(durationFieldType91);
        org.joda.time.LocalDateTime.Property property93 = localDateTime86.secondOfMinute();
        boolean boolean94 = strSet47.equals((java.lang.Object) localDateTime86);
        long long96 = zonedChronology28.set((org.joda.time.ReadablePartial) localDateTime86, (long) 'u');
        org.joda.time.DateTimeField dateTimeField97 = zonedChronology28.secondOfMinute();
        org.joda.time.DurationField durationField98 = zonedChronology28.hours();
        org.joda.time.DateTimeField dateTimeField99 = zonedChronology28.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField98", (durationField19.compareTo(durationField98) == 0) == durationField19.equals(durationField98));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        java.lang.String str32 = zonedChronology28.toString();
        java.lang.String str33 = zonedChronology28.toString();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField35 = zonedChronology28.centuries();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology28.minuteOfHour();
        org.joda.time.DurationField durationField37 = zonedChronology28.hours();
        org.joda.time.DurationField durationField38 = zonedChronology28.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField37", (durationField19.compareTo(durationField37) == 0) == durationField19.equals(durationField37));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology28.weekyearOfCentury();
        org.joda.time.DurationField durationField37 = zonedChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology28.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField37", (durationField20.compareTo(durationField37) == 0) == durationField20.equals(durationField37));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField20 = chronology6.clockhourOfDay();
        org.joda.time.DurationField durationField21 = chronology6.halfdays();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        java.lang.String str24 = dateTimeZone23.toString();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(0L, chronology26);
        java.lang.String str29 = localDateTime27.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = localDateTime27.toString(dateTimeFormatter30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime27.monthOfYear();
        int int33 = localDateTime27.getMinuteOfHour();
        boolean boolean34 = dateTimeZone23.isLocalDateTimeGap(localDateTime27);
        org.joda.time.chrono.ZonedChronology zonedChronology35 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology35.era();
        org.joda.time.DurationField durationField37 = zonedChronology35.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField8, and durationField21", !(durationField37.compareTo(durationField8) == 0) || (Math.signum(durationField37.compareTo(durationField21)) == Math.signum(durationField8.compareTo(durationField21))));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.monthOfYear();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.year();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.year();
        org.joda.time.DurationField durationField35 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField8, and durationField19", !(durationField35.compareTo(durationField8) == 0) || (Math.signum(durationField35.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField33 = zonedChronology28.halfdays();
        org.joda.time.DurationField durationField34 = zonedChronology28.minutes();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.millisOfDay();
        org.joda.time.DurationField durationField36 = zonedChronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology28.era();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(0L, chronology39);
        int int41 = localDateTime40.getWeekyear();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withMillisOfSecond(100);
        org.joda.time.Chronology chronology44 = localDateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.yearOfCentury();
        org.joda.time.DurationField durationField46 = chronology44.days();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        long long49 = dateTimeZone47.previousTransition(100L);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.withMillisOfSecond((int) (byte) 0);
        int[] intArray55 = chronology44.get((org.joda.time.ReadablePartial) localDateTime51, (long) (-1));
        org.joda.time.DateTimeField dateTimeField56 = chronology44.millisOfDay();
        org.joda.time.DurationField durationField57 = chronology44.hours();
        org.joda.time.DurationField durationField58 = chronology44.weeks();
        java.util.TimeZone timeZone60 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forTimeZone(timeZone60);
        long long65 = dateTimeZone61.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology66 = org.joda.time.chrono.ZonedChronology.getInstance(chronology44, dateTimeZone61);
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology66.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField68 = zonedChronology66.millisOfSecond();
        org.joda.time.DurationField durationField69 = zonedChronology66.months();
        org.joda.time.DurationField durationField70 = zonedChronology66.minutes();
        org.joda.time.DurationField durationField71 = zonedChronology66.halfdays();
        long long77 = zonedChronology66.getDateTimeMillis((long) (byte) 0, (int) (short) 1, 20, 32, (int) 'a');
        org.joda.time.DateTimeField dateTimeField78 = zonedChronology66.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone79 = zonedChronology66.getZone();
        org.joda.time.Chronology chronology80 = zonedChronology28.withZone(dateTimeZone79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField31 and durationField69", (durationField31.compareTo(durationField69) == 0) == durationField31.equals(durationField69));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.monthOfYear();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField34 = zonedChronology28.centuries();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.dayOfWeek();
        java.lang.String str36 = zonedChronology28.toString();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now();
        boolean boolean39 = dateTimeZone37.isLocalDateTimeGap(localDateTime38);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(0L, chronology41);
        java.lang.String str44 = localDateTime42.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = localDateTime42.toString(dateTimeFormatter45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime42.monthOfYear();
        org.joda.time.LocalDateTime localDateTime48 = property47.roundCeilingCopy();
        boolean boolean49 = dateTimeZone37.isLocalDateTimeGap(localDateTime48);
        org.joda.time.Chronology chronology50 = zonedChronology28.withZone(dateTimeZone37);
        org.joda.time.DurationField durationField51 = zonedChronology28.days();
        org.joda.time.DurationField durationField52 = zonedChronology28.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField51", (durationField8.compareTo(durationField51) == 0) == durationField8.equals(durationField51));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField33 = zonedChronology28.halfdays();
        org.joda.time.DurationField durationField34 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology28.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology28.dayOfMonth();
        org.joda.time.DurationField durationField38 = zonedChronology28.hours();
        org.joda.time.DurationField durationField39 = zonedChronology28.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField38", (durationField19.compareTo(durationField38) == 0) == durationField19.equals(durationField38));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.minuteOfDay();
        long long38 = zonedChronology28.getDateTimeMillis((long) '4', (int) (byte) 1, 12, 43, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology28.monthOfYear();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology28.secondOfMinute();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(0L, chronology42);
        int int44 = localDateTime43.getWeekyear();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.withMillisOfSecond(100);
        org.joda.time.Chronology chronology47 = localDateTime43.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.yearOfCentury();
        org.joda.time.DurationField durationField49 = chronology47.millis();
        org.joda.time.DurationField durationField50 = chronology47.months();
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now(chronology47);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray52 = localDateTime51.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.plusMillis((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.dayOfYear();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.withYear((int) (short) 10);
        int int58 = localDateTime57.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.UTC;
        long long61 = dateTimeZone59.previousTransition(100L);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology62);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.withHourOfDay((int) (short) 0);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.weekOfWeekyear();
        int int67 = localDateTime57.compareTo((org.joda.time.ReadablePartial) localDateTime65);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime65.withPeriodAdded(readablePeriod68, (-8096924));
        int[] intArray72 = zonedChronology28.get((org.joda.time.ReadablePartial) localDateTime65, 1013420964220L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField31 and durationField50", (durationField31.compareTo(durationField50) == 0) == durationField31.equals(durationField50));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.monthOfYear();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.centuryOfEra();
        org.joda.time.DurationField durationField32 = zonedChronology28.halfdays();
        org.joda.time.DurationField durationField33 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField8, and durationField19", !(durationField33.compareTo(durationField8) == 0) || (Math.signum(durationField33.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology28.weekyearOfCentury();
        org.joda.time.DurationField durationField37 = zonedChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology28.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField37", (durationField20.compareTo(durationField37) == 0) == durationField20.equals(durationField37));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(0L, chronology2);
        int int4 = localDateTime3.getWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withMillisOfSecond(100);
        org.joda.time.Chronology chronology7 = localDateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfCentury();
        org.joda.time.DurationField durationField9 = chronology7.days();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone10.previousTransition(100L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withMillisOfSecond((int) (byte) 0);
        int[] intArray18 = chronology7.get((org.joda.time.ReadablePartial) localDateTime14, (long) (-1));
        org.joda.time.DateTimeField dateTimeField19 = chronology7.millisOfDay();
        org.joda.time.DurationField durationField20 = chronology7.hours();
        org.joda.time.DurationField durationField21 = chronology7.weeks();
        java.util.TimeZone timeZone23 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        long long28 = dateTimeZone24.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology29 = org.joda.time.chrono.ZonedChronology.getInstance(chronology7, dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology29.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology29.millisOfSecond();
        org.joda.time.DurationField durationField32 = zonedChronology29.months();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology29.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology29.secondOfMinute();
        org.joda.time.DurationField durationField35 = zonedChronology29.weekyears();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology29.millisOfDay();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology29.dayOfYear();
        org.joda.time.DurationField durationField38 = zonedChronology29.seconds();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(1013420875778L, (org.joda.time.Chronology) zonedChronology29);
        org.joda.time.DurationField durationField40 = zonedChronology29.years();
        java.lang.String str41 = zonedChronology29.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField35 and durationField40", (durationField35.compareTo(durationField40) == 0) == durationField35.equals(durationField40));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        java.lang.String str32 = zonedChronology28.toString();
        java.lang.String str33 = zonedChronology28.toString();
        long long37 = zonedChronology28.add((long) 9, 35L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology28.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology28.dayOfYear();
        long long44 = zonedChronology28.add(840L, (long) 32, (int) (byte) 0);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(0L, chronology46);
        int int48 = localDateTime47.getWeekyear();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withMillisOfSecond(100);
        org.joda.time.Chronology chronology51 = localDateTime47.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.yearOfCentury();
        org.joda.time.DurationField durationField53 = chronology51.millis();
        org.joda.time.DurationField durationField54 = chronology51.months();
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now(chronology51);
        org.joda.time.DurationField durationField56 = chronology51.halfdays();
        org.joda.time.DurationField durationField57 = chronology51.seconds();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(0L, chronology59);
        java.lang.String str62 = localDateTime60.toString("\u65e5\u672c");
        long long64 = chronology51.set((org.joda.time.ReadablePartial) localDateTime60, (long) 9);
        org.joda.time.DateTimeField dateTimeField65 = chronology51.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField66 = chronology51.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((java.lang.Object) 840L, chronology51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField31 and durationField54", (durationField31.compareTo(durationField54) == 0) == durationField31.equals(durationField54));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField33 = zonedChronology28.halfdays();
        org.joda.time.DurationField durationField34 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology28.weekyearOfCentury();
        org.joda.time.DurationField durationField37 = zonedChronology28.years();
        org.joda.time.DurationField durationField38 = zonedChronology28.halfdays();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology28.yearOfCentury();
        org.joda.time.DurationField durationField40 = zonedChronology28.minutes();
        org.joda.time.DurationField durationField41 = zonedChronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology28.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField37 and durationField41", (durationField37.compareTo(durationField41) == 0) == durationField37.equals(durationField41));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long8 = dateTimeZone6.previousTransition(100L);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfSecond((int) (byte) 0);
        int int13 = localDateTime2.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        long long17 = dateTimeZone14.convertLocalToUTC(100L, true);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime19 = localDateTime2.toDateTime(dateTimeZone14);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        long long23 = dateTimeZone21.previousTransition(0L);
        long long25 = dateTimeZone21.convertUTCToLocal(1L);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        long long30 = dateTimeZone21.getMillisKeepLocal(dateTimeZone28, (long) (-1));
        boolean boolean31 = dateTimeZone21.isFixed();
        org.joda.time.chrono.ZonedChronology zonedChronology32 = org.joda.time.chrono.ZonedChronology.getInstance(chronology20, dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology32.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = zonedChronology32.getZone();
        java.lang.String str35 = dateTimeZone34.toString();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(0L, chronology37);
        int int39 = localDateTime38.getWeekyear();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withYearOfEra(1970);
        org.joda.time.DateTime dateTime42 = localDateTime41.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        long long45 = dateTimeZone43.previousTransition(100L);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology46);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(0L, chronology49);
        int int51 = localDateTime50.getWeekyear();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withYearOfEra(1970);
        org.joda.time.DateTime dateTime54 = localDateTime53.toDateTime();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(0L, chronology56);
        int int58 = localDateTime57.getWeekyear();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.withYearOfEra(1970);
        org.joda.time.DateTime dateTime61 = localDateTime60.toDateTime();
        int int62 = dateTime54.compareTo((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTime dateTime63 = localDateTime47.toDateTime((org.joda.time.ReadableInstant) dateTime54);
        boolean boolean64 = dateTime42.isEqual((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Chronology chronology65 = dateTime42.getChronology();
        org.joda.time.DurationField durationField66 = chronology65.eras();
        boolean boolean67 = dateTimeZone34.equals((java.lang.Object) chronology65);
        org.joda.time.DurationField durationField68 = chronology65.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField66, durationField68, and durationField66", !(durationField66.compareTo(durationField68) == 0) || (Math.signum(durationField66.compareTo(durationField66)) == Math.signum(durationField68.compareTo(durationField66))));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField33 = zonedChronology28.halfdays();
        org.joda.time.DurationField durationField34 = zonedChronology28.minutes();
        org.joda.time.DurationField durationField35 = zonedChronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology28.secondOfMinute();
        org.joda.time.DurationField durationField37 = zonedChronology28.years();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        long long41 = zonedChronology28.add(readablePeriod38, (-36059997L), (int) 'x');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField35 and durationField37", (durationField35.compareTo(durationField37) == 0) == durationField35.equals(durationField37));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeZone dateTimeZone31 = zonedChronology28.getZone();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.yearOfEra();
        org.joda.time.DurationField durationField33 = zonedChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField33", (durationField20.compareTo(durationField33) == 0) == durationField20.equals(durationField33));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.monthOfYear();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField34 = zonedChronology28.centuries();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology28.weekyear();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(0L, chronology38);
        java.lang.String str41 = localDateTime39.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = localDateTime39.toString(dateTimeFormatter42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime39.monthOfYear();
        org.joda.time.Interval interval45 = property44.toInterval();
        long long46 = property44.remainder();
        org.joda.time.LocalDateTime localDateTime47 = property44.roundHalfFloorCopy();
        java.util.Locale locale48 = java.util.Locale.ENGLISH;
        int int49 = property44.getMaximumTextLength(locale48);
        org.joda.time.LocalDateTime localDateTime50 = property44.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime52 = property51.roundFloorCopy();
        long long53 = property51.remainder();
        org.joda.time.LocalDateTime localDateTime54 = property51.withMaximumValue();
        int[] intArray56 = zonedChronology28.get((org.joda.time.ReadablePartial) localDateTime54, 36060043L);
        org.joda.time.DateTimeField dateTimeField57 = zonedChronology28.yearOfEra();
        java.lang.String str58 = zonedChronology28.toString();
        org.joda.time.DurationField durationField59 = zonedChronology28.weekyears();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(0L, chronology61);
        int int63 = localDateTime62.getWeekyear();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime62.withMillisOfSecond(100);
        org.joda.time.Chronology chronology66 = localDateTime62.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.yearOfCentury();
        org.joda.time.DurationField durationField68 = chronology66.eras();
        org.joda.time.Chronology chronology69 = chronology66.withUTC();
        java.lang.String str70 = chronology69.toString();
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime(chronology69);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.withSecondOfMinute(4);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean76 = dateTimeZone75.isFixed();
        long long79 = dateTimeZone75.adjustOffset((long) 'x', true);
        org.joda.time.DateTime dateTime80 = localDateTime71.toDateTime(dateTimeZone75);
        org.joda.time.tz.NameProvider nameProvider82 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale84 = java.util.Locale.forLanguageTag("0001-01-01T00:00:00.000");
        java.lang.String str87 = nameProvider82.getShortName(locale84, "", "hi!");
        java.util.Locale locale88 = java.util.Locale.GERMAN;
        java.lang.String str91 = nameProvider82.getName(locale88, "CN", "\u65e5\u672c");
        java.lang.String str92 = locale88.getISO3Language();
        java.lang.String str93 = dateTimeZone75.getShortName((long) (short) -1, locale88);
        org.joda.time.Chronology chronology94 = zonedChronology28.withZone(dateTimeZone75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField68", Math.signum(durationField8.compareTo(durationField68)) == -Math.signum(durationField68.compareTo(durationField8)));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        long long32 = dateTimeZone30.previousTransition(100L);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(0L, chronology36);
        int int38 = localDateTime37.getWeekyear();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withYearOfEra(1970);
        org.joda.time.DateTime dateTime41 = localDateTime40.toDateTime();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(0L, chronology43);
        int int45 = localDateTime44.getWeekyear();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.withYearOfEra(1970);
        org.joda.time.DateTime dateTime48 = localDateTime47.toDateTime();
        int int49 = dateTime41.compareTo((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime50 = localDateTime34.toDateTime((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime34.plus(readableDuration51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.withPeriodAdded(readablePeriod53, (int) (byte) 10);
        int[] intArray57 = zonedChronology28.get((org.joda.time.ReadablePartial) localDateTime52, (long) (-1));
        java.lang.String str58 = zonedChronology28.toString();
        java.lang.String str59 = zonedChronology28.toString();
        org.joda.time.DurationField durationField60 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField60, durationField8, and durationField19", !(durationField60.compareTo(durationField8) == 0) || (Math.signum(durationField60.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        java.lang.String str32 = zonedChronology28.toString();
        java.lang.String str33 = zonedChronology28.toString();
        long long37 = zonedChronology28.add((long) 9, 35L, (int) (short) 1);
        org.joda.time.Chronology chronology38 = zonedChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology28.hourOfDay();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology28.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = zonedChronology28.getZone();
        org.joda.time.DurationField durationField42 = zonedChronology28.halfdays();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology28.era();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology28.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        long long48 = zonedChronology28.add(readablePeriod45, 0L, 5);
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology28.secondOfDay();
        org.joda.time.DurationField durationField50 = zonedChronology28.days();
        java.lang.String str51 = zonedChronology28.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField50", (durationField8.compareTo(durationField50) == 0) == durationField8.equals(durationField50));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        long long33 = dateTimeZone31.previousTransition(100L);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology34);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(0L, chronology37);
        int int39 = localDateTime38.getWeekyear();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withYearOfEra(1970);
        org.joda.time.DateTime dateTime42 = localDateTime41.toDateTime();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(0L, chronology44);
        int int46 = localDateTime45.getWeekyear();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withYearOfEra(1970);
        org.joda.time.DateTime dateTime49 = localDateTime48.toDateTime();
        int int50 = dateTime42.compareTo((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime dateTime51 = localDateTime35.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime35.plus(readableDuration52);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(0L, chronology55);
        java.util.Locale locale57 = java.util.Locale.US;
        boolean boolean58 = localDateTime56.equals((java.lang.Object) locale57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime56.dayOfWeek();
        int int60 = localDateTime56.getDayOfWeek();
        int int61 = localDateTime35.compareTo((org.joda.time.ReadablePartial) localDateTime56);
        int[] intArray63 = zonedChronology28.get((org.joda.time.ReadablePartial) localDateTime56, (long) 12);
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology28.secondOfDay();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology28.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology28.monthOfYear();
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology28.secondOfMinute();
        org.joda.time.DurationField durationField68 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField68, durationField8, and durationField19", !(durationField68.compareTo(durationField8) == 0) || (Math.signum(durationField68.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.monthOfYear();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.weekyearOfCentury();
        org.joda.time.DurationField durationField36 = zonedChronology28.days();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology28.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField36", (durationField8.compareTo(durationField36) == 0) == durationField8.equals(durationField36));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.secondOfDay();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.secondOfMinute();
        org.joda.time.DurationField durationField32 = zonedChronology28.years();
        org.joda.time.DurationField durationField33 = zonedChronology28.hours();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField33", (durationField19.compareTo(durationField33) == 0) == durationField19.equals(durationField33));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.weekOfWeekyear();
        org.joda.time.Chronology chronology36 = zonedChronology28.withUTC();
        org.joda.time.DurationField durationField37 = zonedChronology28.years();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology28.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField31 and durationField37", (durationField31.compareTo(durationField37) == 0) == durationField31.equals(durationField37));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField32 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.centuryOfEra();
        org.joda.time.DurationField durationField35 = zonedChronology28.hours();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(0L, chronology37);
        int int39 = localDateTime38.getWeekyear();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withMillisOfSecond(100);
        org.joda.time.Chronology chronology42 = localDateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.yearOfCentury();
        org.joda.time.DurationField durationField44 = chronology42.days();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.UTC;
        long long47 = dateTimeZone45.previousTransition(100L);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withMillisOfSecond((int) (byte) 0);
        int[] intArray53 = chronology42.get((org.joda.time.ReadablePartial) localDateTime49, (long) (-1));
        org.joda.time.DateTimeField dateTimeField54 = chronology42.millisOfDay();
        org.joda.time.DurationField durationField55 = chronology42.hours();
        org.joda.time.DurationField durationField56 = chronology42.weeks();
        java.util.TimeZone timeZone58 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        long long63 = dateTimeZone59.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology64 = org.joda.time.chrono.ZonedChronology.getInstance(chronology42, dateTimeZone59);
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology64.halfdayOfDay();
        long long69 = zonedChronology64.add(0L, (-62167219199980L), (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField70 = zonedChronology64.clockhourOfHalfday();
        java.lang.String str71 = zonedChronology64.toString();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long75 = dateTimeZone73.nextTransition(4363010L);
        org.joda.time.Chronology chronology76 = zonedChronology64.withZone(dateTimeZone73);
        org.joda.time.DateTimeZone dateTimeZone77 = zonedChronology64.getZone();
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime(0L, chronology79);
        int int81 = localDateTime80.getWeekyear();
        org.joda.time.LocalDateTime localDateTime83 = localDateTime80.withMillisOfSecond(100);
        org.joda.time.Chronology chronology84 = localDateTime80.getChronology();
        org.joda.time.ReadableDuration readableDuration85 = null;
        org.joda.time.LocalDateTime localDateTime87 = localDateTime80.withDurationAdded(readableDuration85, (int) (short) 0);
        org.joda.time.LocalDateTime.Property property88 = localDateTime87.monthOfYear();
        boolean boolean89 = dateTimeZone77.equals((java.lang.Object) localDateTime87);
        java.util.TimeZone timeZone90 = dateTimeZone77.toTimeZone();
        org.joda.time.Chronology chronology91 = zonedChronology28.withZone(dateTimeZone77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField35", (durationField19.compareTo(durationField35) == 0) == durationField19.equals(durationField35));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, strMap35);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, strMap37);
        boolean boolean39 = zonedChronology28.equals((java.lang.Object) strMap37);
        org.joda.time.DateTimeZone dateTimeZone40 = zonedChronology28.getZone();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        long long44 = zonedChronology28.add(readablePeriod41, 120L, 86399999);
        org.joda.time.DurationField durationField45 = zonedChronology28.hours();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(0L, chronology47);
        int int49 = localDateTime48.getWeekyear();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.withMillisOfSecond(100);
        org.joda.time.Chronology chronology52 = localDateTime48.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = chronology52.yearOfCentury();
        org.joda.time.DurationField durationField54 = chronology52.eras();
        org.joda.time.Chronology chronology55 = chronology52.withUTC();
        java.lang.String str56 = chronology55.toString();
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(chronology55);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.withSecondOfMinute(4);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean62 = dateTimeZone61.isFixed();
        long long65 = dateTimeZone61.adjustOffset((long) 'x', true);
        org.joda.time.DateTime dateTime66 = localDateTime57.toDateTime(dateTimeZone61);
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime57.withDurationAdded(readableDuration67, 86399999);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime57.withYear(40);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime(0L, chronology75);
        int int77 = localDateTime76.getWeekyear();
        org.joda.time.LocalDateTime localDateTime79 = localDateTime76.withMillisOfSecond(100);
        org.joda.time.Chronology chronology80 = localDateTime76.getChronology();
        org.joda.time.DateTimeField dateTimeField81 = chronology80.yearOfCentury();
        org.joda.time.DurationField durationField82 = chronology80.millis();
        org.joda.time.DurationField durationField83 = chronology80.months();
        org.joda.time.LocalDateTime localDateTime84 = org.joda.time.LocalDateTime.now(chronology80);
        org.joda.time.DurationField durationField85 = chronology80.halfdays();
        org.joda.time.LocalDateTime localDateTime86 = new org.joda.time.LocalDateTime((long) ' ', chronology80);
        org.joda.time.LocalDateTime localDateTime87 = new org.joda.time.LocalDateTime(1013420747344L, chronology80);
        int[] intArray88 = localDateTime87.getValues();
        zonedChronology28.validate((org.joda.time.ReadablePartial) localDateTime57, intArray88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField54", Math.signum(durationField8.compareTo(durationField54)) == -Math.signum(durationField54.compareTo(durationField8)));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.halfdays();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.minuteOfHour();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(0L, chronology34);
        java.util.Locale locale36 = java.util.Locale.US;
        boolean boolean37 = localDateTime35.equals((java.lang.Object) locale36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.withYearOfEra((int) (byte) 1);
        int int40 = localDateTime39.getEra();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.plusSeconds((int) '4');
        org.joda.time.LocalDateTime localDateTime44 = localDateTime39.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime39.minusDays(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = localDateTime46.getFieldType(0);
        long long50 = zonedChronology28.set((org.joda.time.ReadablePartial) localDateTime46, (long) (short) 1);
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology28.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        long long55 = zonedChronology28.add(readablePeriod52, (-35520000L), 36060000);
        org.joda.time.DurationField durationField56 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField56, durationField8, and durationField19", !(durationField56.compareTo(durationField8) == 0) || (Math.signum(durationField56.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = new java.util.Locale("1", "hi!");
        java.util.Locale.setDefault(category0, locale3);
        org.joda.time.tz.NameProvider nameProvider5 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("0001-01-01T00:00:00.000");
        java.lang.String str10 = nameProvider5.getShortName(locale7, "", "hi!");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider5);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider5);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(0L, chronology14);
        java.util.Locale locale16 = java.util.Locale.US;
        boolean boolean17 = localDateTime15.equals((java.lang.Object) locale16);
        java.lang.String str18 = locale16.toLanguageTag();
        java.lang.String str21 = nameProvider5.getShortName(locale16, "2022-02-11T09:44:17.426", "");
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str25 = nameProvider5.getName(locale22, "zh-CN", "S\374dkorea");
        java.util.Locale.setDefault(category0, locale22);
        java.util.Locale locale27 = locale22.stripExtensions();
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleKeys();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        long long31 = dateTimeZone29.previousTransition(0L);
        long long33 = dateTimeZone29.convertUTCToLocal(1L);
        java.util.TimeZone timeZone35 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        long long38 = dateTimeZone29.getMillisKeepLocal(dateTimeZone36, (long) (-1));
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(0L, chronology40);
        int int42 = localDateTime41.getWeekyear();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withMillisOfSecond(100);
        org.joda.time.Chronology chronology45 = localDateTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.yearOfCentury();
        org.joda.time.DurationField durationField47 = chronology45.days();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.UTC;
        long long50 = dateTimeZone48.previousTransition(100L);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.withMillisOfSecond((int) (byte) 0);
        int[] intArray56 = chronology45.get((org.joda.time.ReadablePartial) localDateTime52, (long) (-1));
        org.joda.time.DateTimeField dateTimeField57 = chronology45.millisOfDay();
        boolean boolean58 = dateTimeZone36.equals((java.lang.Object) chronology45);
        org.joda.time.DateTimeField dateTimeField59 = chronology45.secondOfDay();
        org.joda.time.DurationField durationField60 = chronology45.eras();
        boolean boolean61 = strSet28.equals((java.lang.Object) chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField47 and durationField60", Math.signum(durationField47.compareTo(durationField60)) == -Math.signum(durationField60.compareTo(durationField47)));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = zonedChronology28.add(readablePeriod33, (long) '4', 59);
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology28.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology28.dayOfWeek();
        org.joda.time.DurationField durationField39 = zonedChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology28.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField39", (durationField20.compareTo(durationField39) == 0) == durationField20.equals(durationField39));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(0L, chronology5);
        java.lang.String str8 = localDateTime6.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = localDateTime6.toString(dateTimeFormatter9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.monthOfYear();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        boolean boolean15 = dateTimeZone1.isFixed();
        long long18 = dateTimeZone1.adjustOffset(100L, true);
        long long21 = dateTimeZone1.convertLocalToUTC((long) 97, true);
        java.lang.String str22 = dateTimeZone1.toString();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(0L, chronology24);
        int int26 = localDateTime25.getWeekyear();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withMillisOfSecond(100);
        org.joda.time.Chronology chronology29 = localDateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.yearOfCentury();
        org.joda.time.DurationField durationField31 = chronology29.days();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone32.previousTransition(100L);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withMillisOfSecond((int) (byte) 0);
        int[] intArray40 = chronology29.get((org.joda.time.ReadablePartial) localDateTime36, (long) (-1));
        org.joda.time.DateTimeField dateTimeField41 = chronology29.millisOfDay();
        org.joda.time.DurationField durationField42 = chronology29.hours();
        org.joda.time.DurationField durationField43 = chronology29.weeks();
        java.util.TimeZone timeZone45 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        long long50 = dateTimeZone46.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology51 = org.joda.time.chrono.ZonedChronology.getInstance(chronology29, dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology51.yearOfEra();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology51.monthOfYear();
        org.joda.time.DateTimeField dateTimeField54 = zonedChronology51.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField55 = zonedChronology51.dayOfYear();
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology51.minuteOfDay();
        org.joda.time.DurationField durationField57 = zonedChronology51.centuries();
        org.joda.time.DateTimeField dateTimeField58 = zonedChronology51.dayOfWeek();
        java.lang.String str59 = zonedChronology51.toString();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime61 = org.joda.time.LocalDateTime.now();
        boolean boolean62 = dateTimeZone60.isLocalDateTimeGap(localDateTime61);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(0L, chronology64);
        java.lang.String str67 = localDateTime65.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = null;
        java.lang.String str69 = localDateTime65.toString(dateTimeFormatter68);
        org.joda.time.LocalDateTime.Property property70 = localDateTime65.monthOfYear();
        org.joda.time.LocalDateTime localDateTime71 = property70.roundCeilingCopy();
        boolean boolean72 = dateTimeZone60.isLocalDateTimeGap(localDateTime71);
        org.joda.time.Chronology chronology73 = zonedChronology51.withZone(dateTimeZone60);
        org.joda.time.DurationField durationField74 = zonedChronology51.days();
        boolean boolean75 = dateTimeZone1.equals((java.lang.Object) zonedChronology51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField31 and durationField74", (durationField31.compareTo(durationField74) == 0) == durationField31.equals(durationField74));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = zonedChronology28.add(readablePeriod33, (long) '4', 59);
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology28.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology28.dayOfWeek();
        org.joda.time.DurationField durationField39 = zonedChronology28.weeks();
        org.joda.time.DurationField durationField40 = zonedChronology28.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField39", (durationField20.compareTo(durationField39) == 0) == durationField20.equals(durationField39));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.util.Locale locale4 = java.util.Locale.JAPAN;
        java.lang.String str5 = locale3.getDisplayCountry(locale4);
        java.lang.String str6 = locale3.getDisplayName();
        java.util.Locale locale7 = java.util.Locale.JAPAN;
        java.util.Locale locale8 = java.util.Locale.JAPAN;
        java.lang.String str9 = locale7.getDisplayCountry(locale8);
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str11 = locale8.getDisplayName(locale10);
        java.util.Locale locale12 = java.util.Locale.JAPAN;
        java.util.Locale locale13 = java.util.Locale.JAPAN;
        java.lang.String str14 = locale12.getDisplayCountry(locale13);
        java.lang.String str15 = locale12.getDisplayName();
        java.util.Locale locale16 = java.util.Locale.JAPAN;
        java.util.Locale locale17 = java.util.Locale.JAPAN;
        java.lang.String str18 = locale16.getDisplayCountry(locale17);
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Locale locale21 = java.util.Locale.JAPAN;
        java.util.Locale locale22 = java.util.Locale.JAPAN;
        java.lang.String str23 = locale21.getDisplayCountry(locale22);
        java.util.Locale locale24 = java.util.Locale.ITALIAN;
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.util.Locale locale26 = java.util.Locale.JAPAN;
        java.lang.String str27 = locale25.getDisplayCountry(locale26);
        java.util.Locale[] localeArray28 = new java.util.Locale[] { locale3, locale8, locale12, locale16, locale19, locale20, locale21, locale24, locale25 };
        java.util.ArrayList<java.util.Locale> localeList29 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList29, localeArray28);
        java.util.List<java.util.Locale> localeList31 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList29);
        java.lang.String[] strArray36 = new java.lang.String[] { "\u65e5\u6587\u65e5\u672c)", "CN", "\u4e2d\u6587", "\u65e5\u6587\u65e5\u672c)" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        boolean boolean39 = strSet37.isEmpty();
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet37, filteringMode40);
        java.util.Spliterator<java.lang.String> strSpliterator42 = strSet37.spliterator();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(0L, chronology44);
        int int46 = localDateTime45.getWeekyear();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withMillisOfSecond(100);
        org.joda.time.Chronology chronology49 = localDateTime45.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.yearOfCentury();
        org.joda.time.DurationField durationField51 = chronology49.days();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.UTC;
        long long54 = dateTimeZone52.previousTransition(100L);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.withMillisOfSecond((int) (byte) 0);
        int[] intArray60 = chronology49.get((org.joda.time.ReadablePartial) localDateTime56, (long) (-1));
        org.joda.time.DateTimeField dateTimeField61 = chronology49.millisOfDay();
        org.joda.time.DurationField durationField62 = chronology49.hours();
        org.joda.time.DurationField durationField63 = chronology49.weeks();
        java.util.TimeZone timeZone65 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        long long70 = dateTimeZone66.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology71 = org.joda.time.chrono.ZonedChronology.getInstance(chronology49, dateTimeZone66);
        org.joda.time.DateTimeField dateTimeField72 = zonedChronology71.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField73 = zonedChronology71.millisOfSecond();
        org.joda.time.DurationField durationField74 = zonedChronology71.weekyears();
        org.joda.time.DateTimeField dateTimeField75 = zonedChronology71.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField76 = zonedChronology71.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField77 = zonedChronology71.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField78 = zonedChronology71.weekOfWeekyear();
        org.joda.time.Chronology chronology79 = zonedChronology71.withUTC();
        boolean boolean80 = strSet37.remove((java.lang.Object) zonedChronology71);
        org.joda.time.DurationField durationField81 = zonedChronology71.years();
        org.joda.time.DurationField durationField82 = zonedChronology71.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField74 and durationField81", (durationField74.compareTo(durationField81) == 0) == durationField74.equals(durationField81));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long8 = dateTimeZone6.previousTransition(100L);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfSecond((int) (byte) 0);
        int int13 = localDateTime2.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        long long17 = dateTimeZone14.convertLocalToUTC(100L, true);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime19 = localDateTime2.toDateTime(dateTimeZone14);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        long long23 = dateTimeZone21.previousTransition(0L);
        long long25 = dateTimeZone21.convertUTCToLocal(1L);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        long long30 = dateTimeZone21.getMillisKeepLocal(dateTimeZone28, (long) (-1));
        boolean boolean31 = dateTimeZone21.isFixed();
        org.joda.time.chrono.ZonedChronology zonedChronology32 = org.joda.time.chrono.ZonedChronology.getInstance(chronology20, dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology32.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology32.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology32.secondOfMinute();
        org.joda.time.DurationField durationField36 = zonedChronology32.centuries();
        org.joda.time.DurationField durationField37 = zonedChronology32.days();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology32.millisOfSecond();
        org.joda.time.DurationField durationField39 = zonedChronology32.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField36, and durationField37", !(durationField39.compareTo(durationField36) == 0) || (Math.signum(durationField39.compareTo(durationField37)) == Math.signum(durationField36.compareTo(durationField37))));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.secondOfMinute();
        org.joda.time.DurationField durationField34 = zonedChronology28.weekyears();
        org.joda.time.DurationField durationField35 = zonedChronology28.centuries();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology28.dayOfYear();
        org.joda.time.DurationField durationField37 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField8, and durationField19", !(durationField37.compareTo(durationField8) == 0) || (Math.signum(durationField37.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.era();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DurationField durationField31 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField8, and durationField19", !(durationField31.compareTo(durationField8) == 0) || (Math.signum(durationField31.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField34 = zonedChronology28.centuries();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.monthOfYear();
        org.joda.time.DurationField durationField36 = zonedChronology28.years();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology28.centuryOfEra();
        org.joda.time.DurationField durationField38 = zonedChronology28.minutes();
        org.joda.time.DurationField durationField39 = zonedChronology28.hours();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(0L, chronology41);
        int int43 = localDateTime42.getWeekyear();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withMillisOfSecond(100);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        long long48 = dateTimeZone46.previousTransition(100L);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withMillisOfSecond((int) (byte) 0);
        int int53 = localDateTime42.compareTo((org.joda.time.ReadablePartial) localDateTime50);
        int int54 = localDateTime50.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime50.withEra(0);
        long long58 = zonedChronology28.set((org.joda.time.ReadablePartial) localDateTime56, 32400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField39", (durationField19.compareTo(durationField39) == 0) == durationField19.equals(durationField39));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.yearOfEra();
        org.joda.time.DurationField durationField30 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField8, and durationField19", !(durationField30.compareTo(durationField8) == 0) || (Math.signum(durationField30.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        org.joda.time.DurationField durationField32 = zonedChronology28.minutes();
        org.joda.time.DurationField durationField33 = zonedChronology28.halfdays();
        long long39 = zonedChronology28.getDateTimeMillis((long) (byte) 0, (int) (short) 1, 20, 32, (int) 'a');
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology28.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone41 = zonedChronology28.getZone();
        org.joda.time.DateTimeZone dateTimeZone42 = zonedChronology28.getZone();
        org.joda.time.DurationField durationField43 = zonedChronology28.days();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology28.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField43", (durationField8.compareTo(durationField43) == 0) == durationField8.equals(durationField43));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        java.lang.String str32 = zonedChronology28.toString();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.dayOfYear();
        org.joda.time.DurationField durationField34 = zonedChronology28.hours();
        org.joda.time.DurationField durationField35 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField34", (durationField19.compareTo(durationField34) == 0) == durationField19.equals(durationField34));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        java.lang.String str32 = zonedChronology28.toString();
        java.lang.String str33 = zonedChronology28.toString();
        long long37 = zonedChronology28.add((long) 9, 35L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology28.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField40 = zonedChronology28.hours();
        org.joda.time.DurationField durationField41 = zonedChronology28.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField40", (durationField19.compareTo(durationField40) == 0) == durationField19.equals(durationField40));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField32 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.era();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.weekyearOfCentury();
        org.joda.time.DurationField durationField36 = zonedChronology28.hours();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology28.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField36", (durationField19.compareTo(durationField36) == 0) == durationField19.equals(durationField36));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        long long33 = zonedChronology28.add((long) (byte) 100, 10L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.hourOfHalfday();
        java.util.TimeZone timeZone36 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone37);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone37);
        int int41 = dateTimeZone37.getStandardOffset(999L);
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(locale43);
        java.util.Locale locale47 = new java.util.Locale("\u65e5\u672c", "hi!");
        java.util.Locale locale48 = java.util.Locale.ENGLISH;
        java.lang.String str49 = locale47.getDisplayLanguage(locale48);
        java.lang.String str50 = locale43.getDisplayName(locale47);
        java.lang.String str51 = dateTimeZone37.getName(35L, locale43);
        org.joda.time.Chronology chronology52 = zonedChronology28.withZone(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField54 = zonedChronology28.millisOfDay();
        org.joda.time.DurationField durationField55 = zonedChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology28.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField55", (durationField20.compareTo(durationField55) == 0) == durationField20.equals(durationField55));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.weekyear();
        java.lang.String str33 = zonedChronology28.toString();
        org.joda.time.DurationField durationField34 = zonedChronology28.hours();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField34", (durationField19.compareTo(durationField34) == 0) == durationField19.equals(durationField34));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = zonedChronology28.getZone();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField37 = zonedChronology28.hours();
        org.joda.time.DurationField durationField38 = zonedChronology28.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField37", (durationField19.compareTo(durationField37) == 0) == durationField19.equals(durationField37));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField33 = zonedChronology28.halfdays();
        org.joda.time.DurationField durationField34 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology28.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology28.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology28.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology28.dayOfWeek();
        org.joda.time.DurationField durationField40 = zonedChronology28.days();
        org.joda.time.DurationField durationField41 = zonedChronology28.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField40", (durationField8.compareTo(durationField40) == 0) == durationField8.equals(durationField40));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, strMap35);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, strMap37);
        boolean boolean39 = zonedChronology28.equals((java.lang.Object) strMap37);
        org.joda.time.DateTimeZone dateTimeZone40 = zonedChronology28.getZone();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        long long44 = zonedChronology28.add(readablePeriod41, 120L, 86399999);
        org.joda.time.DurationField durationField45 = zonedChronology28.hours();
        org.joda.time.DateTimeZone dateTimeZone46 = zonedChronology28.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField45", (durationField19.compareTo(durationField45) == 0) == durationField19.equals(durationField45));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.era();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField32 = zonedChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField32", (durationField20.compareTo(durationField32) == 0) == durationField20.equals(durationField32));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.halfdays();
        long long34 = zonedChronology28.add((long) 'a', 3L, (int) 'x');
        org.joda.time.DurationField durationField35 = zonedChronology28.halfdays();
        org.joda.time.DurationField durationField36 = zonedChronology28.centuries();
        java.lang.String str37 = zonedChronology28.toString();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(0L, chronology39);
        java.lang.String str42 = localDateTime40.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = localDateTime40.toString(dateTimeFormatter43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime40.monthOfYear();
        org.joda.time.LocalDateTime localDateTime46 = property45.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.withYearOfCentury((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusMillis((int) '#');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray51 = localDateTime48.getFieldTypes();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(0L, chronology53);
        int int55 = localDateTime54.getWeekyear();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.withMillisOfSecond(100);
        org.joda.time.Chronology chronology58 = localDateTime54.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.yearOfEra();
        org.joda.time.DurationField durationField61 = chronology58.days();
        org.joda.time.DateTimeField dateTimeField62 = chronology58.yearOfEra();
        org.joda.time.DurationField durationField63 = chronology58.centuries();
        org.joda.time.DurationField durationField64 = chronology58.minutes();
        org.joda.time.DateTimeField dateTimeField65 = chronology58.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime48, chronology58);
        long long68 = zonedChronology28.set((org.joda.time.ReadablePartial) localDateTime48, (long) 1899);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField36 and durationField63", (durationField36.compareTo(durationField63) == 0) == durationField36.equals(durationField63));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        long long33 = zonedChronology28.add(0L, (-62167219199980L), (int) (short) 1);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(0L, chronology36);
        int int38 = localDateTime37.getWeekyear();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withMillisOfSecond(100);
        org.joda.time.Chronology chronology41 = localDateTime37.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.yearOfCentury();
        org.joda.time.DurationField durationField43 = chronology41.millis();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) '#', chronology41);
        int[] intArray47 = zonedChronology28.get((org.joda.time.ReadablePartial) localDateTime45, (long) 1);
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology28.era();
        org.joda.time.DurationField durationField50 = zonedChronology28.minutes();
        org.joda.time.Chronology chronology51 = zonedChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology28.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        long long56 = zonedChronology28.add(readablePeriod53, 11L, 1);
        org.joda.time.Chronology chronology57 = zonedChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField58 = zonedChronology28.weekyearOfCentury();
        org.joda.time.DurationField durationField59 = zonedChronology28.hours();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology28.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField59", (durationField19.compareTo(durationField59) == 0) == durationField19.equals(durationField59));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        java.lang.String str32 = zonedChronology28.toString();
        java.lang.String str33 = zonedChronology28.toString();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.clockhourOfDay();
        long long39 = zonedChronology28.getDateTimeMillis(0, 1, (int) (byte) 1, 20);
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology28.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology28.millisOfDay();
        org.joda.time.Chronology chronology43 = zonedChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology28.hourOfDay();
        org.joda.time.DurationField durationField45 = zonedChronology28.hours();
        org.joda.time.DurationField durationField46 = zonedChronology28.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField45", (durationField19.compareTo(durationField45) == 0) == durationField19.equals(durationField45));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.weekyears();
        java.lang.String str32 = zonedChronology28.toString();
        org.joda.time.Chronology chronology33 = zonedChronology28.withUTC();
        org.joda.time.DurationField durationField34 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField8, and durationField19", !(durationField34.compareTo(durationField8) == 0) || (Math.signum(durationField34.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.era();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = zonedChronology28.getZone();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.secondOfDay();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.dayOfYear();
        org.joda.time.DurationField durationField34 = zonedChronology28.minutes();
        org.joda.time.DurationField durationField35 = zonedChronology28.years();
        org.joda.time.Chronology chronology36 = zonedChronology28.withUTC();
        org.joda.time.DurationField durationField37 = zonedChronology28.weeks();
        org.joda.time.DurationField durationField38 = zonedChronology28.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField37", (durationField20.compareTo(durationField37) == 0) == durationField20.equals(durationField37));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.monthOfYear();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.hourOfHalfday();
        java.lang.String str35 = zonedChronology28.toString();
        org.joda.time.DurationField durationField36 = zonedChronology28.centuries();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology28.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology28.clockhourOfDay();
        org.joda.time.DurationField durationField39 = zonedChronology28.days();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology28.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField39", (durationField8.compareTo(durationField39) == 0) == durationField8.equals(durationField39));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.weekyear();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) zonedChronology28);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = zonedChronology28.add(readablePeriod34, (long) 1970, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology28.secondOfDay();
        org.joda.time.DurationField durationField39 = zonedChronology28.months();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(0L, chronology41);
        int int43 = localDateTime42.getWeekyear();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withMillisOfSecond(100);
        org.joda.time.Chronology chronology46 = localDateTime42.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.yearOfCentury();
        org.joda.time.DurationField durationField48 = chronology46.millis();
        org.joda.time.DurationField durationField49 = chronology46.months();
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now(chronology46);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.hourOfDay();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.plusYears(2022);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plusHours((int) (short) 0);
        int[] intArray57 = zonedChronology28.get((org.joda.time.ReadablePartial) localDateTime53, 6311L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField39 and durationField49", (durationField39.compareTo(durationField49) == 0) == durationField39.equals(durationField49));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.weekyear();
        org.joda.time.Chronology chronology32 = zonedChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.yearOfCentury();
        org.joda.time.DurationField durationField34 = zonedChronology28.centuries();
        org.joda.time.DurationField durationField35 = zonedChronology28.weeks();
        org.joda.time.DurationField durationField36 = zonedChronology28.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField35", (durationField20.compareTo(durationField35) == 0) == durationField20.equals(durationField35));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.secondOfDay();
        org.joda.time.DurationField durationField31 = zonedChronology28.years();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(0L, chronology33);
        int int35 = localDateTime34.getWeekyear();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withDayOfWeek(3);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.plusSeconds(4);
        int[] intArray41 = zonedChronology28.get((org.joda.time.ReadablePartial) localDateTime39, (long) (-1));
        org.joda.time.DurationField durationField42 = zonedChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology28.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField42", (durationField20.compareTo(durationField42) == 0) == durationField20.equals(durationField42));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        java.lang.String str32 = zonedChronology28.toString();
        java.lang.String str33 = zonedChronology28.toString();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.clockhourOfDay();
        long long39 = zonedChronology28.getDateTimeMillis(0, 1, (int) (byte) 1, 20);
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology28.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology28.clockhourOfHalfday();
        org.joda.time.DurationField durationField43 = zonedChronology28.minutes();
        org.joda.time.DurationField durationField44 = zonedChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology28.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField44", (durationField20.compareTo(durationField44) == 0) == durationField20.equals(durationField44));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        long long33 = zonedChronology28.add((long) (byte) 100, 10L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.year();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        long long38 = zonedChronology28.add(readablePeriod35, 1644572123417L, 3600000);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology28.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        long long43 = zonedChronology28.add(readablePeriod40, 36060023L, 53);
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology28.dayOfMonth();
        org.joda.time.DurationField durationField45 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField8, and durationField19", !(durationField45.compareTo(durationField8) == 0) || (Math.signum(durationField45.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.era();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.year();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        org.joda.time.DateTimeZone dateTimeZone32 = zonedChronology28.getZone();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(0L, chronology34);
        int int36 = localDateTime35.getWeekyear();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withMillisOfSecond(100);
        org.joda.time.Chronology chronology39 = localDateTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.days();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        long long44 = dateTimeZone42.previousTransition(100L);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.withMillisOfSecond((int) (byte) 0);
        int[] intArray50 = chronology39.get((org.joda.time.ReadablePartial) localDateTime46, (long) (-1));
        org.joda.time.DateTimeField dateTimeField51 = chronology39.millisOfDay();
        org.joda.time.DurationField durationField52 = chronology39.hours();
        org.joda.time.DurationField durationField53 = chronology39.weeks();
        java.util.TimeZone timeZone55 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone55);
        long long60 = dateTimeZone56.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology61 = org.joda.time.chrono.ZonedChronology.getInstance(chronology39, dateTimeZone56);
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology61.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField63 = zonedChronology61.millisOfSecond();
        org.joda.time.DurationField durationField64 = zonedChronology61.months();
        java.lang.String str65 = zonedChronology61.toString();
        java.lang.String str66 = zonedChronology61.toString();
        long long70 = zonedChronology61.add((long) 9, 35L, (int) (short) 1);
        org.joda.time.Chronology chronology71 = zonedChronology61.withUTC();
        org.joda.time.DateTimeField dateTimeField72 = zonedChronology61.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone73 = zonedChronology61.getZone();
        org.joda.time.Chronology chronology74 = zonedChronology28.withZone(dateTimeZone73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField31 and durationField64", (durationField31.compareTo(durationField64) == 0) == durationField31.equals(durationField64));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        long long33 = dateTimeZone31.previousTransition(100L);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology34);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(0L, chronology37);
        int int39 = localDateTime38.getWeekyear();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withYearOfEra(1970);
        org.joda.time.DateTime dateTime42 = localDateTime41.toDateTime();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(0L, chronology44);
        int int46 = localDateTime45.getWeekyear();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withYearOfEra(1970);
        org.joda.time.DateTime dateTime49 = localDateTime48.toDateTime();
        int int50 = dateTime42.compareTo((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTime dateTime51 = localDateTime35.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime35.plus(readableDuration52);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(0L, chronology55);
        java.util.Locale locale57 = java.util.Locale.US;
        boolean boolean58 = localDateTime56.equals((java.lang.Object) locale57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime56.dayOfWeek();
        int int60 = localDateTime56.getDayOfWeek();
        int int61 = localDateTime35.compareTo((org.joda.time.ReadablePartial) localDateTime56);
        int[] intArray63 = zonedChronology28.get((org.joda.time.ReadablePartial) localDateTime56, (long) 12);
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology28.centuryOfEra();
        org.joda.time.DurationField durationField65 = zonedChronology28.hours();
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology28.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField65", (durationField19.compareTo(durationField65) == 0) == durationField19.equals(durationField65));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.monthOfYear();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.hourOfHalfday();
        org.joda.time.DurationField durationField35 = zonedChronology28.millis();
        org.joda.time.DurationField durationField36 = zonedChronology28.hours();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) zonedChronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField36", (durationField19.compareTo(durationField36) == 0) == durationField19.equals(durationField36));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition(100L);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(0L, chronology5);
        int int7 = localDateTime6.getWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMillisOfSecond(100);
        org.joda.time.Chronology chronology10 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology10.days();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone13.previousTransition(100L);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withMillisOfSecond((int) (byte) 0);
        int[] intArray21 = chronology10.get((org.joda.time.ReadablePartial) localDateTime17, (long) (-1));
        org.joda.time.DateTimeField dateTimeField22 = chronology10.millisOfDay();
        org.joda.time.DurationField durationField23 = chronology10.hours();
        org.joda.time.DurationField durationField24 = chronology10.weeks();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        long long31 = dateTimeZone27.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology32 = org.joda.time.chrono.ZonedChronology.getInstance(chronology10, dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology32.yearOfEra();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology32.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime3, (org.joda.time.Chronology) zonedChronology32);
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology32.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology32.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology32.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology32.minuteOfHour();
        org.joda.time.DurationField durationField40 = zonedChronology32.days();
        org.joda.time.DateTimeZone dateTimeZone41 = zonedChronology32.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField40", (durationField12.compareTo(durationField40) == 0) == durationField12.equals(durationField40));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        java.lang.String str32 = zonedChronology28.toString();
        java.lang.String str33 = zonedChronology28.toString();
        long long37 = zonedChronology28.add((long) 9, 35L, (int) (short) 1);
        org.joda.time.Chronology chronology38 = zonedChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology28.hourOfDay();
        org.joda.time.DurationField durationField40 = zonedChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology28.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField40", (durationField20.compareTo(durationField40) == 0) == durationField20.equals(durationField40));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.monthOfYear();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.clockhourOfDay();
        org.joda.time.DurationField durationField35 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField8, and durationField19", !(durationField35.compareTo(durationField8) == 0) || (Math.signum(durationField35.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.Chronology chronology9 = chronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.halfdayOfDay();
        long long14 = chronology9.add((long) (byte) 0, (long) 91, 59);
        org.joda.time.DurationField durationField15 = chronology9.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField15, and durationField8", !(durationField8.compareTo(durationField15) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField15.compareTo(durationField8))));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.weekOfWeekyear();
        org.joda.time.Chronology chronology36 = zonedChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology28.weekyear();
        org.joda.time.DurationField durationField38 = zonedChronology28.minutes();
        org.joda.time.DurationField durationField39 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology28.yearOfEra();
        org.joda.time.DurationField durationField41 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField41, durationField8, and durationField19", !(durationField41.compareTo(durationField8) == 0) || (Math.signum(durationField41.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField33 = zonedChronology28.halfdays();
        org.joda.time.DurationField durationField34 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology28.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology28.dayOfMonth();
        org.joda.time.DurationField durationField38 = zonedChronology28.hours();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology28.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField38", (durationField19.compareTo(durationField38) == 0) == durationField19.equals(durationField38));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.era();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.clockhourOfDay();
        org.joda.time.DurationField durationField33 = zonedChronology28.minutes();
        org.joda.time.DurationField durationField34 = zonedChronology28.hours();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField34", (durationField19.compareTo(durationField34) == 0) == durationField19.equals(durationField34));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        long long33 = zonedChronology28.add(0L, (-62167219199980L), (int) (short) 1);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(0L, chronology36);
        int int38 = localDateTime37.getWeekyear();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withMillisOfSecond(100);
        org.joda.time.Chronology chronology41 = localDateTime37.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.yearOfCentury();
        org.joda.time.DurationField durationField43 = chronology41.millis();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) '#', chronology41);
        int[] intArray47 = zonedChronology28.get((org.joda.time.ReadablePartial) localDateTime45, (long) 1);
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology28.hourOfHalfday();
        org.joda.time.DurationField durationField50 = zonedChronology28.centuries();
        long long54 = zonedChronology28.add((long) 'a', 1900L, 840);
        org.joda.time.DurationField durationField55 = zonedChronology28.weeks();
        org.joda.time.DurationField durationField56 = zonedChronology28.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField55", (durationField20.compareTo(durationField55) == 0) == durationField20.equals(durationField55));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology28);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(0L, chronology33);
        java.lang.String str36 = localDateTime34.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = localDateTime34.toString(dateTimeFormatter37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime34.monthOfYear();
        org.joda.time.Interval interval40 = property39.toInterval();
        long long41 = property39.remainder();
        org.joda.time.LocalDateTime localDateTime42 = property39.roundHalfFloorCopy();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plus(readableDuration43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime42.dayOfMonth();
        int[] intArray47 = zonedChronology28.get((org.joda.time.ReadablePartial) localDateTime42, 11L);
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology28.yearOfCentury();
        org.joda.time.DurationField durationField49 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField49, durationField8, and durationField19", !(durationField49.compareTo(durationField8) == 0) || (Math.signum(durationField49.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = zonedChronology28.getZone();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(0L, chronology37);
        java.lang.String str40 = localDateTime38.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = localDateTime38.toString(dateTimeFormatter41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime38.monthOfYear();
        java.lang.String str44 = property43.getName();
        int int45 = property43.getLeapAmount();
        boolean boolean46 = zonedChronology28.equals((java.lang.Object) int45);
        org.joda.time.DurationField durationField47 = zonedChronology28.hours();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology28.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField47", (durationField19.compareTo(durationField47) == 0) == durationField19.equals(durationField47));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.halfdayOfDay();
        org.joda.time.DurationField durationField10 = chronology6.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField10, and durationField8", !(durationField8.compareTo(durationField10) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField10.compareTo(durationField8))));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField33 = zonedChronology28.halfdays();
        org.joda.time.DurationField durationField34 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology28.minuteOfHour();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(0L, chronology39);
        int int41 = localDateTime40.getWeekyear();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withMillisOfSecond(100);
        org.joda.time.Chronology chronology44 = localDateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        long long48 = dateTimeZone46.previousTransition(0L);
        long long50 = dateTimeZone46.nextTransition((long) (-1));
        org.joda.time.Chronology chronology51 = chronology44.withZone(dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) (short) 10, chronology44);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusMillis(20);
        long long56 = zonedChronology28.set((org.joda.time.ReadablePartial) localDateTime54, 1970L);
        org.joda.time.DateTimeField dateTimeField57 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField58 = zonedChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology28.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField58", (durationField20.compareTo(durationField58) == 0) == durationField20.equals(durationField58));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        long long33 = zonedChronology28.add(0L, (-62167219199980L), (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.clockhourOfHalfday();
        java.lang.String str35 = zonedChronology28.toString();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long39 = dateTimeZone37.nextTransition(4363010L);
        org.joda.time.Chronology chronology40 = zonedChronology28.withZone(dateTimeZone37);
        org.joda.time.DurationField durationField41 = zonedChronology28.days();
        org.joda.time.DurationField durationField42 = zonedChronology28.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField41", (durationField8.compareTo(durationField41) == 0) == durationField8.equals(durationField41));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.weekyear();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.yearOfCentury();
        org.joda.time.DurationField durationField33 = zonedChronology28.seconds();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(0L, chronology35);
        int int37 = localDateTime36.getWeekyear();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withYearOfEra(1970);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.withDayOfMonth(10);
        int int44 = localDateTime41.getEra();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now();
        boolean boolean48 = dateTimeZone46.isLocalDateTimeGap(localDateTime47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(0L, chronology50);
        java.lang.String str53 = localDateTime51.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = null;
        java.lang.String str55 = localDateTime51.toString(dateTimeFormatter54);
        org.joda.time.LocalDateTime.Property property56 = localDateTime51.monthOfYear();
        org.joda.time.LocalDateTime localDateTime57 = property56.roundCeilingCopy();
        boolean boolean58 = dateTimeZone46.isLocalDateTimeGap(localDateTime57);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone46);
        boolean boolean60 = dateTimeZone46.isFixed();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime41, dateTimeZone46);
        org.joda.time.Chronology chronology62 = zonedChronology28.withZone(dateTimeZone46);
        org.joda.time.Chronology chronology63 = zonedChronology28.withUTC();
        org.joda.time.DurationField durationField64 = zonedChronology28.hours();
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        long long68 = zonedChronology28.add(readablePeriod65, (long) 1900, 82346986);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField64", (durationField19.compareTo(durationField64) == 0) == durationField19.equals(durationField64));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField32 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField8, and durationField19", !(durationField32.compareTo(durationField8) == 0) || (Math.signum(durationField32.compareTo(durationField19)) == Math.signum(durationField8.compareTo(durationField19))));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField35 = zonedChronology28.days();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(0L, chronology37);
        java.lang.String str40 = localDateTime38.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = localDateTime38.toString(dateTimeFormatter41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime38.monthOfYear();
        org.joda.time.Interval interval44 = property43.toInterval();
        long long45 = property43.remainder();
        org.joda.time.LocalDateTime localDateTime46 = property43.roundHalfFloorCopy();
        java.lang.String str47 = property43.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property43.getFieldType();
        org.joda.time.LocalDateTime localDateTime49 = property43.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.weekyear();
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime49.withPeriodAdded(readablePeriod51, 4);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.withMinuteOfHour(4);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(0L, chronology57);
        int int59 = localDateTime58.getWeekyear();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.withMillisOfSecond(100);
        org.joda.time.Chronology chronology62 = localDateTime58.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.secondOfDay();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(0L, chronology65);
        java.lang.String str68 = localDateTime66.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = null;
        java.lang.String str70 = localDateTime66.toString(dateTimeFormatter69);
        long long72 = chronology62.set((org.joda.time.ReadablePartial) localDateTime66, (long) '4');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray73 = localDateTime66.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime66.plusWeeks((int) ' ');
        int[] intArray76 = localDateTime75.getValues();
        boolean boolean77 = localDateTime53.isEqual((org.joda.time.ReadablePartial) localDateTime75);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime79 = org.joda.time.LocalDateTime.now();
        boolean boolean80 = dateTimeZone78.isLocalDateTimeGap(localDateTime79);
        int[] intArray81 = localDateTime79.getValues();
        zonedChronology28.validate((org.joda.time.ReadablePartial) localDateTime75, intArray81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField35", (durationField8.compareTo(durationField35) == 0) == durationField8.equals(durationField35));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeZone dateTimeZone31 = zonedChronology28.getZone();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.monthOfYear();
        org.joda.time.DurationField durationField33 = zonedChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField33", (durationField20.compareTo(durationField33) == 0) == durationField20.equals(durationField33));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        long long33 = zonedChronology28.add((long) (byte) 100, 10L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.hourOfHalfday();
        org.joda.time.DurationField durationField35 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology28.weekOfWeekyear();
        org.joda.time.DurationField durationField37 = zonedChronology28.hours();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology28.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField37", (durationField19.compareTo(durationField37) == 0) == durationField19.equals(durationField37));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField34 = zonedChronology28.centuries();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.monthOfYear();
        org.joda.time.DurationField durationField36 = zonedChronology28.days();
        org.joda.time.DurationField durationField37 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField36", (durationField8.compareTo(durationField36) == 0) == durationField8.equals(durationField36));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.monthOfYear();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.minuteOfDay();
        org.joda.time.DurationField durationField34 = zonedChronology28.hours();
        org.joda.time.DurationField durationField35 = zonedChronology28.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField34", (durationField19.compareTo(durationField34) == 0) == durationField19.equals(durationField34));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition(100L);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(0L, chronology5);
        int int7 = localDateTime6.getWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMillisOfSecond(100);
        org.joda.time.Chronology chronology10 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology10.days();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone13.previousTransition(100L);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withMillisOfSecond((int) (byte) 0);
        int[] intArray21 = chronology10.get((org.joda.time.ReadablePartial) localDateTime17, (long) (-1));
        org.joda.time.DateTimeField dateTimeField22 = chronology10.millisOfDay();
        org.joda.time.DurationField durationField23 = chronology10.hours();
        org.joda.time.DurationField durationField24 = chronology10.weeks();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        long long31 = dateTimeZone27.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology32 = org.joda.time.chrono.ZonedChronology.getInstance(chronology10, dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology32.yearOfEra();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology32.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime3, (org.joda.time.Chronology) zonedChronology32);
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology32.clockhourOfDay();
        java.lang.String str37 = zonedChronology32.toString();
        org.joda.time.DurationField durationField38 = zonedChronology32.hours();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology32.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField38", (durationField23.compareTo(durationField38) == 0) == durationField23.equals(durationField38));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.util.Locale locale4 = java.util.Locale.JAPAN;
        java.lang.String str5 = locale3.getDisplayCountry(locale4);
        java.lang.String str6 = locale3.getDisplayName();
        java.util.Locale locale7 = java.util.Locale.JAPAN;
        java.util.Locale locale8 = java.util.Locale.JAPAN;
        java.lang.String str9 = locale7.getDisplayCountry(locale8);
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str11 = locale8.getDisplayName(locale10);
        java.util.Locale locale12 = java.util.Locale.JAPAN;
        java.util.Locale locale13 = java.util.Locale.JAPAN;
        java.lang.String str14 = locale12.getDisplayCountry(locale13);
        java.lang.String str15 = locale12.getDisplayName();
        java.util.Locale locale16 = java.util.Locale.JAPAN;
        java.util.Locale locale17 = java.util.Locale.JAPAN;
        java.lang.String str18 = locale16.getDisplayCountry(locale17);
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Locale locale21 = java.util.Locale.JAPAN;
        java.util.Locale locale22 = java.util.Locale.JAPAN;
        java.lang.String str23 = locale21.getDisplayCountry(locale22);
        java.util.Locale locale24 = java.util.Locale.ITALIAN;
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.util.Locale locale26 = java.util.Locale.JAPAN;
        java.lang.String str27 = locale25.getDisplayCountry(locale26);
        java.util.Locale[] localeArray28 = new java.util.Locale[] { locale3, locale8, locale12, locale16, locale19, locale20, locale21, locale24, locale25 };
        java.util.ArrayList<java.util.Locale> localeList29 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList29, localeArray28);
        java.util.List<java.util.Locale> localeList31 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList29);
        java.lang.String[] strArray36 = new java.lang.String[] { "\u65e5\u6587\u65e5\u672c)", "CN", "\u4e2d\u6587", "\u65e5\u6587\u65e5\u672c)" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        boolean boolean39 = strSet37.isEmpty();
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet37, filteringMode40);
        java.util.Spliterator<java.lang.String> strSpliterator42 = strSet37.spliterator();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(0L, chronology44);
        int int46 = localDateTime45.getWeekyear();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withMillisOfSecond(100);
        org.joda.time.Chronology chronology49 = localDateTime45.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.yearOfCentury();
        org.joda.time.DurationField durationField51 = chronology49.days();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.UTC;
        long long54 = dateTimeZone52.previousTransition(100L);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.withMillisOfSecond((int) (byte) 0);
        int[] intArray60 = chronology49.get((org.joda.time.ReadablePartial) localDateTime56, (long) (-1));
        org.joda.time.DateTimeField dateTimeField61 = chronology49.millisOfDay();
        org.joda.time.DurationField durationField62 = chronology49.hours();
        org.joda.time.DurationField durationField63 = chronology49.weeks();
        java.util.TimeZone timeZone65 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        long long70 = dateTimeZone66.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology71 = org.joda.time.chrono.ZonedChronology.getInstance(chronology49, dateTimeZone66);
        org.joda.time.DateTimeField dateTimeField72 = zonedChronology71.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField73 = zonedChronology71.millisOfSecond();
        org.joda.time.DurationField durationField74 = zonedChronology71.weekyears();
        org.joda.time.DateTimeField dateTimeField75 = zonedChronology71.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField76 = zonedChronology71.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField77 = zonedChronology71.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField78 = zonedChronology71.weekOfWeekyear();
        org.joda.time.Chronology chronology79 = zonedChronology71.withUTC();
        boolean boolean80 = strSet37.remove((java.lang.Object) zonedChronology71);
        org.joda.time.DateTimeField dateTimeField81 = zonedChronology71.minuteOfDay();
        org.joda.time.DurationField durationField82 = zonedChronology71.years();
        org.joda.time.DurationField durationField83 = zonedChronology71.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField74 and durationField82", (durationField74.compareTo(durationField82) == 0) == durationField74.equals(durationField82));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) zonedChronology28);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(0L, chronology33);
        java.lang.String str36 = localDateTime34.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = localDateTime34.toString(dateTimeFormatter37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime34.monthOfYear();
        org.joda.time.Interval interval40 = property39.toInterval();
        long long41 = property39.remainder();
        org.joda.time.LocalDateTime localDateTime42 = property39.roundHalfFloorCopy();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plus(readableDuration43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime42.dayOfMonth();
        int[] intArray47 = zonedChronology28.get((org.joda.time.ReadablePartial) localDateTime42, 11L);
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology28.yearOfCentury();
        org.joda.time.DurationField durationField49 = zonedChronology28.halfdays();
        org.joda.time.Chronology chronology50 = zonedChronology28.withUTC();
        org.joda.time.DurationField durationField51 = zonedChronology28.days();
        org.joda.time.DurationField durationField52 = zonedChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField51", (durationField8.compareTo(durationField51) == 0) == durationField8.equals(durationField51));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        java.lang.String str32 = zonedChronology28.toString();
        java.lang.String str33 = zonedChronology28.toString();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.weekOfWeekyear();
        java.util.TimeZone timeZone37 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        java.lang.String str38 = timeZone37.getID();
        int int39 = timeZone37.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.Chronology chronology41 = zonedChronology28.withZone(dateTimeZone40);
        org.joda.time.DurationField durationField42 = zonedChronology28.weeks();
        org.joda.time.DurationField durationField43 = zonedChronology28.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField42", (durationField20.compareTo(durationField42) == 0) == durationField20.equals(durationField42));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        long long33 = zonedChronology28.add(0L, (-62167219199980L), (int) (short) 1);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(0L, chronology36);
        int int38 = localDateTime37.getWeekyear();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withMillisOfSecond(100);
        org.joda.time.Chronology chronology41 = localDateTime37.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.yearOfCentury();
        org.joda.time.DurationField durationField43 = chronology41.millis();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) '#', chronology41);
        int[] intArray47 = zonedChronology28.get((org.joda.time.ReadablePartial) localDateTime45, (long) 1);
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology28.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology28.monthOfYear();
        org.joda.time.DurationField durationField52 = zonedChronology28.hours();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology28.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField52", (durationField19.compareTo(durationField52) == 0) == durationField19.equals(durationField52));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.weekyear();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.yearOfCentury();
        org.joda.time.DurationField durationField34 = zonedChronology28.hours();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField34", (durationField19.compareTo(durationField34) == 0) == durationField19.equals(durationField34));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        java.lang.String str32 = zonedChronology28.toString();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.millisOfDay();
        org.joda.time.DurationField durationField34 = zonedChronology28.days();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField34", (durationField8.compareTo(durationField34) == 0) == durationField8.equals(durationField34));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withYearOfEra(1970);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusHours((int) ' ');
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readableDuration8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withHourOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withYear((int) (byte) 100);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(0L, chronology15);
        int int17 = localDateTime16.getWeekyear();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withMillisOfSecond(100);
        org.joda.time.Chronology chronology20 = localDateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.yearOfCentury();
        org.joda.time.DurationField durationField22 = chronology20.days();
        org.joda.time.DateTimeField dateTimeField23 = chronology20.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        long long26 = dateTimeZone24.previousTransition(100L);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone24);
        int[] intArray29 = chronology20.get((org.joda.time.ReadablePartial) localDateTime27, (long) 999);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.plusHours((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withDayOfYear(10);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.minusMonths((-1));
        org.joda.time.LocalDateTime localDateTime36 = localDateTime9.withFields((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(0L, chronology38);
        java.lang.String str41 = localDateTime39.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = localDateTime39.toString(dateTimeFormatter42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime39.monthOfYear();
        org.joda.time.Interval interval45 = property44.toInterval();
        org.joda.time.LocalDateTime localDateTime47 = property44.addWrapFieldToCopy((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property44.getFieldType();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(0L, chronology50);
        java.util.Locale locale52 = java.util.Locale.US;
        boolean boolean53 = localDateTime51.equals((java.lang.Object) locale52);
        java.lang.String str54 = locale52.toLanguageTag();
        int int55 = property44.getMaximumTextLength(locale52);
        org.joda.time.LocalDateTime localDateTime56 = property44.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime57 = property44.roundFloorCopy();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(0L, chronology59);
        int int61 = localDateTime60.getWeekyear();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime60.withMillisOfSecond(100);
        org.joda.time.Chronology chronology64 = localDateTime60.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.yearOfCentury();
        org.joda.time.DurationField durationField66 = chronology64.eras();
        org.joda.time.Chronology chronology67 = chronology64.withUTC();
        java.lang.String str68 = chronology67.toString();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(chronology67);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime(0L, chronology71);
        int int73 = localDateTime72.getWeekyear();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime72.withMillisOfSecond(100);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.UTC;
        long long78 = dateTimeZone76.previousTransition(100L);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology79);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.withMillisOfSecond((int) (byte) 0);
        int int83 = localDateTime72.compareTo((org.joda.time.ReadablePartial) localDateTime80);
        org.joda.time.DateTimeZone dateTimeZone84 = org.joda.time.DateTimeZone.UTC;
        long long87 = dateTimeZone84.convertLocalToUTC(100L, true);
        org.joda.time.LocalDateTime localDateTime88 = new org.joda.time.LocalDateTime(dateTimeZone84);
        org.joda.time.DateTime dateTime89 = localDateTime72.toDateTime(dateTimeZone84);
        org.joda.time.DateTime dateTime90 = localDateTime69.toDateTime((org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.Chronology chronology91 = dateTime89.getChronology();
        int int92 = property44.getDifference((org.joda.time.ReadableInstant) dateTime89);
        int int93 = property44.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime94 = property44.getLocalDateTime();
        org.joda.time.ReadableDuration readableDuration95 = null;
        org.joda.time.LocalDateTime localDateTime97 = localDateTime94.withDurationAdded(readableDuration95, 53);
        org.joda.time.LocalDateTime localDateTime98 = localDateTime36.withFields((org.joda.time.ReadablePartial) localDateTime94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField66", Math.signum(durationField22.compareTo(durationField66)) == -Math.signum(durationField66.compareTo(durationField22)));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.weekyear();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(0L, chronology33);
        java.lang.String str36 = localDateTime34.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = localDateTime34.toString(dateTimeFormatter37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime34.monthOfYear();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.withHourOfDay(0);
        java.util.Date date43 = localDateTime40.toDate();
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.fromDateFields(date43);
        long long46 = zonedChronology28.set((org.joda.time.ReadablePartial) localDateTime44, 100L);
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology28.dayOfWeek();
        java.lang.String str48 = zonedChronology28.toString();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology28.dayOfMonth();
        org.joda.time.DurationField durationField50 = zonedChronology28.centuries();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology28.weekyearOfCentury();
        org.joda.time.DurationField durationField52 = zonedChronology28.weekyears();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(0L, chronology54);
        int int56 = localDateTime55.getWeekyear();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.withMillisOfSecond(100);
        org.joda.time.Chronology chronology59 = localDateTime55.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.yearOfCentury();
        org.joda.time.DurationField durationField61 = chronology59.eras();
        org.joda.time.Chronology chronology62 = chronology59.withUTC();
        java.lang.String str63 = chronology62.toString();
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(chronology62);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.withSecondOfMinute(4);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean69 = dateTimeZone68.isFixed();
        long long72 = dateTimeZone68.adjustOffset((long) 'x', true);
        org.joda.time.DateTime dateTime73 = localDateTime64.toDateTime(dateTimeZone68);
        org.joda.time.ReadableDuration readableDuration74 = null;
        org.joda.time.LocalDateTime localDateTime76 = localDateTime64.withDurationAdded(readableDuration74, 86399999);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime(0L, chronology78);
        int int80 = localDateTime79.getWeekyear();
        org.joda.time.LocalDateTime localDateTime82 = localDateTime79.withMillisOfSecond(100);
        org.joda.time.Chronology chronology83 = localDateTime79.getChronology();
        org.joda.time.DateTimeField dateTimeField84 = chronology83.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.UTC;
        long long87 = dateTimeZone85.previousTransition(0L);
        long long89 = dateTimeZone85.nextTransition((long) (-1));
        org.joda.time.Chronology chronology90 = chronology83.withZone(dateTimeZone85);
        org.joda.time.LocalDateTime localDateTime91 = new org.joda.time.LocalDateTime(dateTimeZone85);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone85);
        org.joda.time.DateTime dateTime93 = localDateTime64.toDateTime(dateTimeZone85);
        int int95 = dateTimeZone85.getOffsetFromLocal((long) (byte) 100);
        org.joda.time.chrono.ZonedChronology zonedChronology96 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology28, dateTimeZone85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField61", Math.signum(durationField8.compareTo(durationField61)) == -Math.signum(durationField61.compareTo(durationField8)));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(0L, chronology2);
        int int4 = localDateTime3.getWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withMillisOfSecond(100);
        org.joda.time.Chronology chronology7 = localDateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfCentury();
        org.joda.time.DurationField durationField9 = chronology7.days();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone10.previousTransition(100L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withMillisOfSecond((int) (byte) 0);
        int[] intArray18 = chronology7.get((org.joda.time.ReadablePartial) localDateTime14, (long) (-1));
        org.joda.time.DateTimeField dateTimeField19 = chronology7.millisOfDay();
        org.joda.time.DurationField durationField20 = chronology7.hours();
        org.joda.time.DurationField durationField21 = chronology7.weeks();
        java.util.TimeZone timeZone23 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        long long28 = dateTimeZone24.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology29 = org.joda.time.chrono.ZonedChronology.getInstance(chronology7, dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology29.minuteOfDay();
        org.joda.time.DurationField durationField31 = zonedChronology29.halfdays();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology29.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology29.weekyear();
        org.joda.time.DurationField durationField34 = zonedChronology29.centuries();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 61, (org.joda.time.Chronology) zonedChronology29);
        org.joda.time.DurationField durationField36 = zonedChronology29.weeks();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology29.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField36", (durationField21.compareTo(durationField36) == 0) == durationField21.equals(durationField36));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeZone dateTimeZone31 = zonedChronology28.getZone();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.monthOfYear();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.weekOfWeekyear();
        org.joda.time.DurationField durationField35 = zonedChronology28.years();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology28.yearOfCentury();
        java.lang.String str37 = zonedChronology28.toString();
        java.lang.String str38 = zonedChronology28.toString();
        org.joda.time.DurationField durationField39 = zonedChronology28.years();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(0L, chronology41);
        int int43 = localDateTime42.getWeekyear();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withYearOfEra(1970);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plus(readableDuration46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.withSecondOfMinute(32);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime47.withHourOfDay(0);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusMillis(5);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime51.plusMinutes(11);
        int int56 = localDateTime51.getWeekyear();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(0L, chronology58);
        int int60 = localDateTime59.getWeekyear();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.withMillisOfSecond(100);
        org.joda.time.Chronology chronology63 = localDateTime59.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.yearOfCentury();
        org.joda.time.DurationField durationField65 = chronology63.eras();
        org.joda.time.Chronology chronology66 = chronology63.withUTC();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone68 = chronology66.getZone();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.UTC;
        long long71 = dateTimeZone69.previousTransition(100L);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology72);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime(0L, chronology75);
        int int77 = localDateTime76.getWeekyear();
        org.joda.time.LocalDateTime localDateTime79 = localDateTime76.withYearOfEra(1970);
        org.joda.time.DateTime dateTime80 = localDateTime79.toDateTime();
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.LocalDateTime localDateTime83 = new org.joda.time.LocalDateTime(0L, chronology82);
        int int84 = localDateTime83.getWeekyear();
        org.joda.time.LocalDateTime localDateTime86 = localDateTime83.withYearOfEra(1970);
        org.joda.time.DateTime dateTime87 = localDateTime86.toDateTime();
        int int88 = dateTime80.compareTo((org.joda.time.ReadableInstant) dateTime87);
        org.joda.time.DateTime dateTime89 = localDateTime73.toDateTime((org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.ReadableDuration readableDuration90 = null;
        org.joda.time.LocalDateTime localDateTime91 = localDateTime73.plus(readableDuration90);
        org.joda.time.LocalDateTime.Property property92 = localDateTime91.yearOfEra();
        boolean boolean93 = dateTimeZone68.equals((java.lang.Object) localDateTime91);
        org.joda.time.DateTime dateTime94 = localDateTime51.toDateTime(dateTimeZone68);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone68);
        org.joda.time.Chronology chronology96 = zonedChronology28.withZone(dateTimeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField65", Math.signum(durationField8.compareTo(durationField65)) == -Math.signum(durationField65.compareTo(durationField8)));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.secondOfDay();
        boolean boolean32 = zonedChronology28.equals((java.lang.Object) "0001-01-01T00:00:00.000");
        org.joda.time.DurationField durationField33 = zonedChronology28.weeks();
        org.joda.time.DurationField durationField34 = zonedChronology28.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField33", (durationField20.compareTo(durationField33) == 0) == durationField20.equals(durationField33));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.clockhourOfHalfday();
        org.joda.time.DurationField durationField34 = zonedChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField34", (durationField20.compareTo(durationField34) == 0) == durationField20.equals(durationField34));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField35 = zonedChronology28.months();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology28.weekyear();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(0L, chronology38);
        int int40 = localDateTime39.getWeekyear();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withMillisOfSecond(100);
        org.joda.time.Chronology chronology43 = localDateTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.yearOfCentury();
        org.joda.time.DurationField durationField45 = chronology43.days();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        long long48 = dateTimeZone46.previousTransition(100L);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withMillisOfSecond((int) (byte) 0);
        int[] intArray54 = chronology43.get((org.joda.time.ReadablePartial) localDateTime50, (long) (-1));
        org.joda.time.DateTimeField dateTimeField55 = chronology43.millisOfDay();
        org.joda.time.DurationField durationField56 = chronology43.hours();
        org.joda.time.DurationField durationField57 = chronology43.weeks();
        java.util.TimeZone timeZone59 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forTimeZone(timeZone59);
        long long64 = dateTimeZone60.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology65 = org.joda.time.chrono.ZonedChronology.getInstance(chronology43, dateTimeZone60);
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology65.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology65.millisOfSecond();
        org.joda.time.DurationField durationField68 = zonedChronology65.months();
        java.lang.String str69 = zonedChronology65.toString();
        java.lang.String str70 = zonedChronology65.toString();
        org.joda.time.DateTimeField dateTimeField71 = zonedChronology65.millisOfSecond();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime(0L, chronology73);
        java.lang.String str76 = localDateTime74.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = null;
        java.lang.String str78 = localDateTime74.toString(dateTimeFormatter77);
        org.joda.time.LocalDateTime.Property property79 = localDateTime74.monthOfYear();
        org.joda.time.LocalDateTime localDateTime80 = property79.roundCeilingCopy();
        org.joda.time.ReadableDuration readableDuration81 = null;
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.minus(readableDuration81);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime80.plusSeconds(2022);
        int[] intArray86 = zonedChronology65.get((org.joda.time.ReadablePartial) localDateTime84, (long) 11);
        org.joda.time.DateTimeZone dateTimeZone87 = zonedChronology65.getZone();
        org.joda.time.Chronology chronology88 = zonedChronology28.withZone(dateTimeZone87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField31 and durationField68", (durationField31.compareTo(durationField68) == 0) == durationField31.equals(durationField68));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        long long33 = zonedChronology28.add((long) (byte) -1, (long) 70, 6);
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.monthOfYear();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(0L, chronology37);
        int int39 = localDateTime38.getWeekyear();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withMillisOfSecond(100);
        org.joda.time.Chronology chronology42 = localDateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.yearOfCentury();
        org.joda.time.DurationField durationField44 = chronology42.days();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.UTC;
        long long47 = dateTimeZone45.previousTransition(100L);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withMillisOfSecond((int) (byte) 0);
        int[] intArray53 = chronology42.get((org.joda.time.ReadablePartial) localDateTime49, (long) (-1));
        org.joda.time.DateTimeField dateTimeField54 = chronology42.millisOfDay();
        org.joda.time.DurationField durationField55 = chronology42.hours();
        org.joda.time.DurationField durationField56 = chronology42.weeks();
        java.util.TimeZone timeZone58 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        long long63 = dateTimeZone59.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology64 = org.joda.time.chrono.ZonedChronology.getInstance(chronology42, dateTimeZone59);
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology64.era();
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology64.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology64.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.UTC;
        long long71 = dateTimeZone68.convertLocalToUTC(100L, true);
        java.lang.String str73 = dateTimeZone68.getName(1L);
        org.joda.time.Chronology chronology74 = zonedChronology64.withZone(dateTimeZone68);
        org.joda.time.Chronology chronology75 = zonedChronology28.withZone(dateTimeZone68);
        org.joda.time.DurationField durationField76 = chronology75.days();
        org.joda.time.DurationField durationField77 = chronology75.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField76", (durationField8.compareTo(durationField76) == 0) == durationField8.equals(durationField76));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.secondOfMinute();
        org.joda.time.DurationField durationField34 = zonedChronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology28.millisOfDay();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology28.dayOfYear();
        org.joda.time.DurationField durationField37 = zonedChronology28.days();
        org.joda.time.DurationField durationField38 = zonedChronology28.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField37", (durationField8.compareTo(durationField37) == 0) == durationField8.equals(durationField37));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(0L, chronology2);
        int int4 = localDateTime3.getWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withMillisOfSecond(100);
        org.joda.time.Chronology chronology7 = localDateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfCentury();
        org.joda.time.DurationField durationField9 = chronology7.days();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone10.previousTransition(100L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withMillisOfSecond((int) (byte) 0);
        int[] intArray18 = chronology7.get((org.joda.time.ReadablePartial) localDateTime14, (long) (-1));
        org.joda.time.DateTimeField dateTimeField19 = chronology7.millisOfDay();
        org.joda.time.DurationField durationField20 = chronology7.hours();
        org.joda.time.DurationField durationField21 = chronology7.weeks();
        java.util.TimeZone timeZone23 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        long long28 = dateTimeZone24.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology29 = org.joda.time.chrono.ZonedChronology.getInstance(chronology7, dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology29.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology29.millisOfSecond();
        org.joda.time.DurationField durationField32 = zonedChronology29.months();
        org.joda.time.DurationField durationField33 = zonedChronology29.minutes();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(0L, chronology35);
        java.util.Locale locale37 = java.util.Locale.US;
        boolean boolean38 = localDateTime36.equals((java.lang.Object) locale37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withYearOfEra((int) (byte) 1);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(0L, chronology42);
        int int44 = localDateTime43.getWeekyear();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.withYearOfEra(1970);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime36.withFields((org.joda.time.ReadablePartial) localDateTime46);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusMinutes(100);
        org.joda.time.Chronology chronology51 = localDateTime50.getChronology();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(0L, chronology53);
        int int55 = localDateTime54.getWeekyear();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.withMillisOfSecond(100);
        org.joda.time.Chronology chronology58 = localDateTime54.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.yearOfCentury();
        org.joda.time.DurationField durationField60 = chronology58.days();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.UTC;
        long long63 = dateTimeZone61.previousTransition(100L);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.withMillisOfSecond((int) (byte) 0);
        int[] intArray69 = chronology58.get((org.joda.time.ReadablePartial) localDateTime65, (long) (-1));
        org.joda.time.DateTimeField dateTimeField70 = chronology58.millisOfDay();
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(0L, chronology72);
        int int74 = localDateTime73.getWeekyear();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime73.withMillisOfSecond(100);
        int[] intArray78 = chronology58.get((org.joda.time.ReadablePartial) localDateTime73, 0L);
        zonedChronology29.validate((org.joda.time.ReadablePartial) localDateTime50, intArray78);
        org.joda.time.DateTimeField dateTimeField80 = zonedChronology29.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime(0L, (org.joda.time.Chronology) zonedChronology29);
        org.joda.time.DateTimeField dateTimeField82 = zonedChronology29.millisOfSecond();
        org.joda.time.DurationField durationField83 = zonedChronology29.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField83, durationField9, and durationField20", !(durationField83.compareTo(durationField9) == 0) || (Math.signum(durationField83.compareTo(durationField20)) == Math.signum(durationField9.compareTo(durationField20))));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.millisOfSecond();
        org.joda.time.DurationField durationField31 = zonedChronology28.months();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.secondOfMinute();
        org.joda.time.DurationField durationField34 = zonedChronology28.weekyears();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        long long38 = zonedChronology28.add(readablePeriod35, (long) 45, (int) (short) 0);
        org.joda.time.DurationField durationField39 = zonedChronology28.weeks();
        org.joda.time.DurationField durationField40 = zonedChronology28.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField40", (durationField20.compareTo(durationField40) == 0) == durationField20.equals(durationField40));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        int int3 = localDateTime2.getWeekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(100);
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long11 = dateTimeZone9.previousTransition(100L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 100L, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond((int) (byte) 0);
        int[] intArray17 = chronology6.get((org.joda.time.ReadablePartial) localDateTime13, (long) (-1));
        org.joda.time.DateTimeField dateTimeField18 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField19 = chronology6.hours();
        org.joda.time.DurationField durationField20 = chronology6.weeks();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("\u65e5\u672c");
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        long long27 = dateTimeZone23.convertLocalToUTC((long) 10, true, (long) '#');
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology28.halfdayOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology28.seconds();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.weekyear();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.clockhourOfHalfday();
        org.joda.time.DurationField durationField34 = zonedChronology28.years();
        org.joda.time.DurationField durationField35 = zonedChronology28.centuries();
        org.joda.time.DurationField durationField36 = zonedChronology28.minutes();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology28.hourOfDay();
        org.joda.time.DurationField durationField38 = zonedChronology28.weekyears();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(0L, chronology41);
        int int43 = localDateTime42.getWeekyear();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withMillisOfSecond(100);
        org.joda.time.Chronology chronology46 = localDateTime42.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.yearOfCentury();
        org.joda.time.DurationField durationField48 = chronology46.millis();
        org.joda.time.DateTimeField dateTimeField49 = chronology46.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) '#', chronology46);
        org.joda.time.DurationField durationField51 = chronology46.seconds();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(0L, chronology54);
        int int56 = localDateTime55.getWeekyear();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.withMillisOfSecond(100);
        org.joda.time.Chronology chronology59 = localDateTime55.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.UTC;
        long long63 = dateTimeZone61.previousTransition(0L);
        long long65 = dateTimeZone61.nextTransition((long) (-1));
        org.joda.time.Chronology chronology66 = chronology59.withZone(dateTimeZone61);
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(1899L, dateTimeZone61);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime71 = org.joda.time.LocalDateTime.now();
        boolean boolean72 = dateTimeZone70.isLocalDateTimeGap(localDateTime71);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime(0L, chronology74);
        java.lang.String str77 = localDateTime75.toString("\u65e5\u672c");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = null;
        java.lang.String str79 = localDateTime75.toString(dateTimeFormatter78);
        org.joda.time.LocalDateTime.Property property80 = localDateTime75.monthOfYear();
        org.joda.time.LocalDateTime localDateTime81 = property80.roundCeilingCopy();
        boolean boolean82 = dateTimeZone70.isLocalDateTimeGap(localDateTime81);
        org.joda.time.LocalDateTime localDateTime83 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone70);
        boolean boolean84 = dateTimeZone70.isFixed();
        org.joda.time.LocalDateTime localDateTime85 = new org.joda.time.LocalDateTime((long) 6, dateTimeZone70);
        long long87 = dateTimeZone61.getMillisKeepLocal(dateTimeZone70, (-109L));
        long long91 = dateTimeZone70.convertLocalToUTC((long) (byte) 100, true, 70L);
        org.joda.time.Chronology chronology92 = chronology46.withZone(dateTimeZone70);
        int int94 = dateTimeZone70.getOffsetFromLocal(9L);
        org.joda.time.Chronology chronology95 = zonedChronology28.withZone(dateTimeZone70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField30 and durationField51", (durationField30.compareTo(durationField51) == 0) == durationField30.equals(durationField51));
    }
}

