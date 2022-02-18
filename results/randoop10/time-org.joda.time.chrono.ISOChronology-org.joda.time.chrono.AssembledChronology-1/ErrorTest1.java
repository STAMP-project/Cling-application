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
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = iSOChronology0.days();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str9 = dateTimeZone8.toString();
        java.lang.String str11 = dateTimeZone8.getShortName(1L);
        int int13 = dateTimeZone8.getOffsetFromLocal((long) (byte) 0);
        int int15 = dateTimeZone8.getStandardOffset((long) (short) 0);
        java.lang.String str16 = dateTimeZone8.getID();
        long long19 = dateTimeZone8.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology20.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology20.minuteOfHour();
        org.joda.time.DurationField durationField23 = iSOChronology20.days();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology20.hourOfHalfday();
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.lang.String str28 = dateTimeZone26.getNameKey(10L);
        long long30 = dateTimeZone26.previousTransition(0L);
        org.joda.time.Chronology chronology31 = iSOChronology20.withZone(dateTimeZone26);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone26.getName((-62167593599968L), locale33);
        org.joda.time.Chronology chronology35 = iSOChronology0.withZone(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField23", (durationField6.compareTo(durationField23) == 0) == durationField6.equals(durationField23));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.hourOfDay();
        org.joda.time.DurationField durationField22 = iSOChronology13.seconds();
        long long26 = iSOChronology13.add(295810032L, (long) 122400000, (-151740000));
        org.joda.time.DurationField durationField27 = iSOChronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField14, and durationField22", !(durationField27.compareTo(durationField14) == 0) || (Math.signum(durationField27.compareTo(durationField22)) == Math.signum(durationField14.compareTo(durationField22))));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.weekOfWeekyear();
        org.joda.time.Chronology chronology19 = iSOChronology13.withUTC();
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.lang.String str22 = dateTimeZone21.toString();
        java.lang.String str24 = dateTimeZone21.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        int int27 = dateTimeZone21.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone21);
        org.joda.time.DurationField durationField29 = iSOChronology28.minutes();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology28.monthOfYear();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology28.millisOfSecond();
        org.joda.time.DurationField durationField32 = iSOChronology28.days();
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        java.lang.String str35 = dateTimeZone34.toString();
        java.lang.String str37 = dateTimeZone34.getShortName(1L);
        int int39 = dateTimeZone34.getOffsetFromLocal((long) (byte) 0);
        int int41 = dateTimeZone34.getStandardOffset((long) (short) 0);
        java.lang.String str42 = dateTimeZone34.getID();
        long long45 = dateTimeZone34.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology46 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone34);
        org.joda.time.DurationField durationField47 = iSOChronology46.months();
        org.joda.time.DurationField durationField48 = iSOChronology46.weeks();
        org.joda.time.DurationField durationField49 = iSOChronology46.weeks();
        boolean boolean50 = iSOChronology28.equals((java.lang.Object) durationField49);
        org.joda.time.DateTimeZone dateTimeZone51 = iSOChronology28.getZone();
        org.joda.time.Chronology chronology52 = iSOChronology13.withZone(dateTimeZone51);
        org.joda.time.DateTimeField dateTimeField53 = chronology52.yearOfCentury();
        org.joda.time.DurationField durationField54 = chronology52.hours();
        org.joda.time.DurationField durationField55 = chronology52.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField55, durationField14, and durationField29", !(durationField55.compareTo(durationField14) == 0) || (Math.signum(durationField55.compareTo(durationField29)) == Math.signum(durationField14.compareTo(durationField29))));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.year();
        org.joda.time.DurationField durationField12 = iSOChronology8.minutes();
        org.joda.time.DurationField durationField13 = iSOChronology8.weeks();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        boolean boolean17 = dateTimeZone15.equals((java.lang.Object) true);
        long long19 = dateTimeZone15.previousTransition((long) 10);
        int int21 = dateTimeZone15.getStandardOffset((long) ' ');
        org.joda.time.Chronology chronology22 = iSOChronology8.withZone(dateTimeZone15);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.lang.String str25 = dateTimeZone24.toString();
        java.lang.String str27 = dateTimeZone24.getShortName(1L);
        int int29 = dateTimeZone24.getOffsetFromLocal((long) (byte) 0);
        int int31 = dateTimeZone24.getStandardOffset((long) (short) 0);
        java.lang.String str32 = dateTimeZone24.getID();
        long long35 = dateTimeZone24.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField37 = iSOChronology36.months();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology36.secondOfDay();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology36.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology36.clockhourOfHalfday();
        org.joda.time.DurationField durationField42 = iSOChronology36.centuries();
        org.joda.time.DateTimeZone dateTimeZone43 = iSOChronology36.getZone();
        org.joda.time.DurationField durationField44 = iSOChronology36.years();
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology36.hourOfDay();
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology36.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField47 = iSOChronology36.clockhourOfDay();
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        java.lang.String str50 = dateTimeZone49.toString();
        java.util.Locale locale52 = null;
        java.lang.String str53 = dateTimeZone49.getName(97L, locale52);
        org.joda.time.ReadableInstant readableInstant54 = null;
        int int55 = dateTimeZone49.getOffset(readableInstant54);
        org.joda.time.Chronology chronology56 = iSOChronology36.withZone(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField57 = iSOChronology36.year();
        org.joda.time.DateTimeField dateTimeField58 = iSOChronology36.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField59 = iSOChronology36.secondOfMinute();
        boolean boolean60 = dateTimeZone15.equals((java.lang.Object) iSOChronology36);
        org.joda.time.DurationField durationField61 = iSOChronology36.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField61, durationField12, and durationField13", !(durationField61.compareTo(durationField12) == 0) || (Math.signum(durationField61.compareTo(durationField13)) == Math.signum(durationField12.compareTo(durationField13))));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DurationField durationField18 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.halfdayOfDay();
        org.joda.time.DurationField durationField20 = iSOChronology13.millis();
        org.joda.time.DurationField durationField21 = iSOChronology13.years();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.Chronology chronology24 = iSOChronology13.withUTC();
        org.joda.time.DurationField durationField25 = chronology24.years();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField25", (durationField21.compareTo(durationField25) == 0) == durationField21.equals(durationField25));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.dayOfYear();
        org.joda.time.DurationField durationField14 = iSOChronology8.millis();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = iSOChronology8.add(readablePeriod15, 72000000L, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology8.add(readablePeriod19, (-349200002L), 4);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology8.centuryOfEra();
        org.joda.time.DurationField durationField25 = iSOChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField9, and durationField14", !(durationField25.compareTo(durationField9) == 0) || (Math.signum(durationField25.compareTo(durationField14)) == Math.signum(durationField9.compareTo(durationField14))));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DurationField durationField5 = iSOChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField5", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField5)) == Math.signum(durationField1.compareTo(durationField5))));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DurationField durationField15 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.yearOfCentury();
        long long23 = iSOChronology13.getDateTimeMillis(259200100L, 11, (int) (byte) 10, (int) (short) 10, (int) ' ');
        org.joda.time.DurationField durationField24 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology13.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology13.dayOfMonth();
        org.joda.time.DurationField durationField28 = iSOChronology13.weekyears();
        org.joda.time.DurationField durationField29 = iSOChronology13.hours();
        org.joda.time.DurationField durationField30 = iSOChronology13.days();
        org.joda.time.DurationField durationField31 = iSOChronology13.halfdays();
        org.joda.time.DurationField durationField32 = iSOChronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField14, and durationField15", !(durationField32.compareTo(durationField14) == 0) || (Math.signum(durationField32.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.era();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.millisOfDay();
        org.joda.time.DurationField durationField13 = iSOChronology8.eras();
        org.joda.time.DurationField durationField14 = iSOChronology8.eras();
        org.joda.time.DurationField durationField15 = iSOChronology8.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField15, and durationField13", !(durationField13.compareTo(durationField15) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField15.compareTo(durationField13))));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.year();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology8.era();
        org.joda.time.DurationField durationField17 = dateTimeField16.getDurationField();
        boolean boolean18 = dateTimeField16.isSupported();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField17", Math.signum(durationField9.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField9)));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DurationField durationField18 = iSOChronology13.days();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology13.add(readablePeriod19, (long) 100, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.weekyear();
        org.joda.time.DurationField durationField24 = iSOChronology13.centuries();
        org.joda.time.DateTimeZone dateTimeZone25 = iSOChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology13.halfdayOfDay();
        org.joda.time.DurationField durationField27 = iSOChronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField14, and durationField18", !(durationField27.compareTo(durationField14) == 0) || (Math.signum(durationField27.compareTo(durationField18)) == Math.signum(durationField14.compareTo(durationField18))));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.minuteOfDay();
        org.joda.time.DurationField durationField13 = iSOChronology8.seconds();
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.toString();
        java.lang.String str18 = dateTimeZone15.getShortName(1L);
        int int20 = dateTimeZone15.getOffsetFromLocal((long) (byte) 0);
        int int22 = dateTimeZone15.getStandardOffset((long) (short) 0);
        java.lang.String str23 = dateTimeZone15.getID();
        long long26 = dateTimeZone15.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField28 = iSOChronology27.months();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology27.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology27.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology27.clockhourOfHalfday();
        org.joda.time.DurationField durationField33 = iSOChronology27.centuries();
        org.joda.time.DateTimeZone dateTimeZone34 = iSOChronology27.getZone();
        org.joda.time.Chronology chronology35 = iSOChronology8.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology8.era();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology8.era();
        org.joda.time.DurationField durationField38 = iSOChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField38, durationField9, and durationField13", !(durationField38.compareTo(durationField9) == 0) || (Math.signum(durationField38.compareTo(durationField13)) == Math.signum(durationField9.compareTo(durationField13))));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology13.centuries();
        org.joda.time.DateTimeZone dateTimeZone20 = iSOChronology13.getZone();
        org.joda.time.DurationField durationField21 = iSOChronology13.years();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology13.centuryOfEra();
        org.joda.time.DurationField durationField27 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology13.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField27", (durationField21.compareTo(durationField27) == 0) == durationField21.equals(durationField27));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology13.weekyears();
        org.joda.time.DurationField durationField20 = iSOChronology13.hours();
        org.joda.time.DurationField durationField21 = iSOChronology13.hours();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.String str24 = dateTimeZone23.toString();
        java.lang.String str26 = dateTimeZone23.getShortName(1L);
        int int28 = dateTimeZone23.getOffsetFromLocal((long) (byte) 0);
        int int30 = dateTimeZone23.getStandardOffset((long) (short) 0);
        java.lang.String str31 = dateTimeZone23.getID();
        long long34 = dateTimeZone23.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology35 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone23);
        org.joda.time.DurationField durationField36 = iSOChronology35.months();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology35.secondOfDay();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology35.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology35.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology35.minuteOfDay();
        org.joda.time.DurationField durationField41 = iSOChronology35.weekyears();
        org.joda.time.DurationField durationField42 = iSOChronology35.hours();
        java.lang.String str43 = iSOChronology35.toString();
        org.joda.time.DateTimeZone dateTimeZone44 = iSOChronology35.getZone();
        org.joda.time.Chronology chronology45 = iSOChronology13.withZone(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField47 = iSOChronology13.era();
        org.joda.time.DateTimeZone dateTimeZone48 = iSOChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField49 = iSOChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField50 = iSOChronology13.year();
        org.joda.time.DateTimeZone dateTimeZone51 = iSOChronology13.getZone();
        org.joda.time.DurationField durationField52 = iSOChronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField52, durationField14, and durationField19", !(durationField52.compareTo(durationField14) == 0) || (Math.signum(durationField52.compareTo(durationField19)) == Math.signum(durationField14.compareTo(durationField19))));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.millisOfDay();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str14 = dateTimeZone13.toString();
        java.lang.String str16 = dateTimeZone13.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        int int19 = dateTimeZone13.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField21 = iSOChronology20.minutes();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology20.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology20.minuteOfHour();
        boolean boolean24 = iSOChronology8.equals((java.lang.Object) iSOChronology20);
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology20.millisOfSecond();
        org.joda.time.DurationField durationField26 = iSOChronology20.eras();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology20.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField26", Math.signum(durationField9.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField9)));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology13.weekyears();
        org.joda.time.DurationField durationField20 = iSOChronology13.hours();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.weekyearOfCentury();
        org.joda.time.Chronology chronology25 = iSOChronology13.withUTC();
        org.joda.time.DurationField durationField26 = iSOChronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField14, and durationField19", !(durationField26.compareTo(durationField14) == 0) || (Math.signum(durationField26.compareTo(durationField19)) == Math.signum(durationField14.compareTo(durationField19))));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DurationField durationField11 = iSOChronology8.days();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.dayOfMonth();
        org.joda.time.DurationField durationField16 = iSOChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField11", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DurationField durationField15 = iSOChronology13.weeks();
        org.joda.time.DateTimeZone dateTimeZone16 = iSOChronology13.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = iSOChronology17.halfdays();
        org.joda.time.DurationField durationField19 = iSOChronology17.hours();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology17.hourOfDay();
        org.joda.time.DurationField durationField21 = iSOChronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology17.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology17.secondOfDay();
        org.joda.time.DurationField durationField25 = iSOChronology17.years();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology17.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField25", (durationField21.compareTo(durationField25) == 0) == durationField21.equals(durationField25));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField15 = iSOChronology13.eras();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.yearOfCentury();
        long long20 = iSOChronology13.add((long) 12177930, (long) (byte) 0, (-28664));
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.millisOfSecond();
        org.joda.time.DurationField durationField22 = iSOChronology13.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField22, and durationField15", !(durationField15.compareTo(durationField22) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField22.compareTo(durationField15))));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology13.centuries();
        org.joda.time.DateTimeZone dateTimeZone20 = iSOChronology13.getZone();
        org.joda.time.DurationField durationField21 = iSOChronology13.years();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.minuteOfHour();
        long long26 = iSOChronology13.add(298800100L, 187200002L, 1);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology13.era();
        org.joda.time.DurationField durationField28 = iSOChronology13.centuries();
        org.joda.time.DurationField durationField29 = iSOChronology13.weekyears();
        org.joda.time.DurationField durationField30 = iSOChronology13.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField29", (durationField21.compareTo(durationField29) == 0) == durationField21.equals(durationField29));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.minuteOfHour();
        org.joda.time.DurationField durationField16 = iSOChronology13.days();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.monthOfYear();
        org.joda.time.DurationField durationField21 = iSOChronology13.hours();
        org.joda.time.DurationField durationField22 = iSOChronology13.millis();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.minuteOfHour();
        org.joda.time.DurationField durationField25 = iSOChronology13.days();
        org.joda.time.DurationField durationField26 = iSOChronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField16, and durationField21", !(durationField26.compareTo(durationField16) == 0) || (Math.signum(durationField26.compareTo(durationField21)) == Math.signum(durationField16.compareTo(durationField21))));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DurationField durationField10 = iSOChronology8.minutes();
        org.joda.time.DurationField durationField11 = iSOChronology8.months();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.hourOfDay();
        org.joda.time.DurationField durationField14 = iSOChronology8.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.clockhourOfDay();
        org.joda.time.DurationField durationField16 = iSOChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField11", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DurationField durationField11 = iSOChronology8.days();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.year();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.weekyear();
        org.joda.time.DurationField durationField16 = iSOChronology8.centuries();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology8.era();
        org.joda.time.DurationField durationField19 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology8.secondOfDay();
        org.joda.time.DurationField durationField23 = iSOChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField9, and durationField11", !(durationField23.compareTo(durationField9) == 0) || (Math.signum(durationField23.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology13.centuries();
        org.joda.time.DateTimeZone dateTimeZone20 = iSOChronology13.getZone();
        org.joda.time.DurationField durationField21 = iSOChronology13.years();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone26 = iSOChronology13.getZone();
        boolean boolean27 = dateTimeZone26.isFixed();
        int int29 = dateTimeZone26.getStandardOffset((-28567L));
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        java.lang.String str32 = dateTimeZone31.toString();
        java.lang.String str34 = dateTimeZone31.getShortName(1L);
        int int36 = dateTimeZone31.getOffsetFromLocal((long) (byte) 0);
        int int38 = dateTimeZone31.getStandardOffset((long) (short) 0);
        java.lang.String str39 = dateTimeZone31.getID();
        long long42 = dateTimeZone31.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology43 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField44 = iSOChronology43.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology43.year();
        org.joda.time.DurationField durationField46 = iSOChronology43.weekyears();
        org.joda.time.DateTimeField dateTimeField47 = iSOChronology43.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial48 = null;
        int int49 = dateTimeField47.getMinimumValue(readablePartial48);
        long long52 = dateTimeField47.getDifferenceAsLong(113605027117200000L, 85279703040060000L);
        boolean boolean53 = dateTimeZone26.equals((java.lang.Object) dateTimeField47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField46", (durationField21.compareTo(durationField46) == 0) == durationField21.equals(durationField46));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.year();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = iSOChronology8.add(readablePeriod14, (long) 'a', (-1));
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology8.dayOfMonth();
        org.joda.time.DurationField durationField19 = iSOChronology8.minutes();
        org.joda.time.DateTimeZone dateTimeZone20 = iSOChronology8.getZone();
        org.joda.time.DurationField durationField21 = iSOChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology8.secondOfMinute();
        org.joda.time.DurationField durationField23 = iSOChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField19, and durationField21", !(durationField23.compareTo(durationField19) == 0) || (Math.signum(durationField23.compareTo(durationField21)) == Math.signum(durationField19.compareTo(durationField21))));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.halfdayOfDay();
        org.joda.time.DurationField durationField12 = iSOChronology8.halfdays();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str15 = dateTimeZone14.toString();
        java.lang.String str17 = dateTimeZone14.getShortName(1L);
        int int19 = dateTimeZone14.getOffsetFromLocal((long) (byte) 0);
        int int21 = dateTimeZone14.getStandardOffset((long) (short) 0);
        java.lang.String str22 = dateTimeZone14.getID();
        long long25 = dateTimeZone14.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField27 = iSOChronology26.months();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology26.secondOfDay();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology26.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology26.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology26.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology26.centuryOfEra();
        org.joda.time.DurationField durationField33 = iSOChronology26.weekyears();
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        java.lang.String str36 = dateTimeZone35.toString();
        java.lang.String str38 = dateTimeZone35.getShortName(1L);
        int int40 = dateTimeZone35.getOffsetFromLocal((long) (byte) 0);
        int int42 = dateTimeZone35.getStandardOffset((long) (short) 0);
        java.lang.String str43 = dateTimeZone35.getID();
        long long46 = dateTimeZone35.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology47 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone35);
        org.joda.time.DurationField durationField48 = iSOChronology47.months();
        org.joda.time.DateTimeField dateTimeField49 = iSOChronology47.secondOfDay();
        org.joda.time.DateTimeField dateTimeField50 = iSOChronology47.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField51 = iSOChronology47.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField52 = iSOChronology47.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField53 = iSOChronology47.halfdayOfDay();
        java.util.TimeZone timeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        java.lang.String str56 = dateTimeZone55.toString();
        java.lang.String str58 = dateTimeZone55.getShortName(1L);
        int int60 = dateTimeZone55.getOffsetFromLocal((long) (byte) 0);
        int int62 = dateTimeZone55.getStandardOffset((long) (short) 0);
        java.lang.String str63 = dateTimeZone55.getID();
        long long66 = dateTimeZone55.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology67 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone55);
        org.joda.time.DurationField durationField68 = iSOChronology67.months();
        org.joda.time.DateTimeZone dateTimeZone69 = iSOChronology67.getZone();
        java.util.TimeZone timeZone70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forTimeZone(timeZone70);
        java.lang.String str72 = dateTimeZone71.toString();
        java.lang.String str74 = dateTimeZone71.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone71);
        int int77 = dateTimeZone71.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology78 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone71);
        org.joda.time.DurationField durationField79 = iSOChronology78.minutes();
        org.joda.time.DateTimeField dateTimeField80 = iSOChronology78.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField81 = iSOChronology78.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField82 = iSOChronology78.minuteOfDay();
        org.joda.time.DurationField durationField83 = iSOChronology78.seconds();
        org.joda.time.DurationField durationField84 = iSOChronology78.millis();
        boolean boolean85 = dateTimeZone69.equals((java.lang.Object) iSOChronology78);
        org.joda.time.Chronology chronology86 = iSOChronology47.withZone(dateTimeZone69);
        org.joda.time.Chronology chronology87 = iSOChronology26.withZone(dateTimeZone69);
        org.joda.time.Chronology chronology88 = iSOChronology8.withZone(dateTimeZone69);
        java.lang.String str89 = dateTimeZone69.toString();
        org.joda.time.chrono.ISOChronology iSOChronology90 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone69);
        org.joda.time.DateTimeField dateTimeField91 = iSOChronology90.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField92 = iSOChronology90.hourOfHalfday();
        org.joda.time.DurationField durationField93 = iSOChronology90.minutes();
        org.joda.time.DurationField durationField94 = iSOChronology90.seconds();
        org.joda.time.DurationField durationField95 = iSOChronology90.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField95, durationField9, and durationField12", !(durationField95.compareTo(durationField9) == 0) || (Math.signum(durationField95.compareTo(durationField12)) == Math.signum(durationField9.compareTo(durationField12))));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DurationField durationField18 = iSOChronology13.halfdays();
        org.joda.time.DurationField durationField19 = iSOChronology13.hours();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.dayOfWeek();
        org.joda.time.DurationField durationField24 = iSOChronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField14, and durationField18", !(durationField24.compareTo(durationField14) == 0) || (Math.signum(durationField24.compareTo(durationField18)) == Math.signum(durationField14.compareTo(durationField18))));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology8.getZone();
        org.joda.time.DurationField durationField10 = iSOChronology8.months();
        java.lang.String str11 = iSOChronology8.toString();
        org.joda.time.DurationField durationField12 = iSOChronology8.years();
        org.joda.time.DurationField durationField13 = iSOChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.monthOfYear();
        org.joda.time.DurationField durationField16 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology8.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField16", (durationField12.compareTo(durationField16) == 0) == durationField12.equals(durationField16));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField5 = iSOChronology1.eras();
        org.joda.time.DurationField durationField6 = iSOChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }
}

